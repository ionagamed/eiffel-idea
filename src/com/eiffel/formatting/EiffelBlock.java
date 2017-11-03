package com.eiffel.formatting;

import static com.eiffel.psi.EiffelTypes.*;
import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.TokenType;
import com.intellij.psi.formatter.common.AbstractBlock;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import com.intellij.util.containers.ContainerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class EiffelBlock extends AbstractBlock {
    private SpacingBuilder spacingBuilder;
    private Indent myIndent;

    private static TokenSet indentedTokens = TokenSet.create(
            FEATURE_LIST,
//            INSTRUCTION,
            COMPOUND,
            PARENT,
            FEATURE_ADAPTION,
            FEATURE_DECLARATION,
            FEATURE_VALUE,
            ENTITY_DECLARATION_GROUP,
            EXPRESSION,
            BOOLEAN_EXPRESSION, // used in loops
            ASSERTION_CLAUSE,
            COMMENT,
            CONVERSION_PROCEDURE,
            CONVERSION_QUERY
    );
    private static HashMap<IElementType, TokenSet> indentedNestedTokens = new HashMap<>();
    static {
        indentedNestedTokens.put(
                NOTES,
                TokenSet.create(NOTE_ENTRY)
        );
        indentedNestedTokens.put(
                CLASS_HEADER,
                TokenSet.create(CLASS_NAME)
        );
        indentedNestedTokens.put(
                NEW_EXPORTS,
                TokenSet.create(ALL_KEYWORD)
        );
        indentedNestedTokens.put(
                CREATORS,
                TokenSet.create(FEATURE_NAME)
        );
    }

    public EiffelBlock(@NotNull ASTNode node, @NotNull Wrap wrap, @Nullable Alignment alignment, SpacingBuilder spacingBuilder, Indent indent) {
        super(node, wrap, alignment);
        this.spacingBuilder = spacingBuilder;

        myIndent = indent;

//        System.out.println("new block: of type '" + node.getElementType().toString() + "' with text range " + node.getTextRange().toString());
    }

    @Override
    protected List<Block> buildChildren() {
        return ContainerUtil.mapNotNull(myNode.getChildren(null), node -> {
            if (node.getElementType().equals(TokenType.WHITE_SPACE)) {
                return null;
            }
            return buildSubBlock(node);
        });
    }

    private Block buildSubBlock(ASTNode node) {
        Indent indent = Indent.getNoneIndent();
        Wrap wrap = Wrap.createWrap(WrapType.NONE, false);
        Alignment alignment = Alignment.createAlignment();

        if (indentedTokens.contains(node.getElementType())) {
            indent = Indent.getSmartIndent(Indent.Type.NORMAL);
        }
        if (indentedNestedTokens.containsKey(myNode.getElementType())) {
            if (indentedNestedTokens.get(myNode.getElementType()).contains(node.getElementType())) {
                indent = Indent.getSmartIndent(Indent.Type.NORMAL);
            }
        }
        if (myNode.getElementType().equals(FEATURE_DECLARATION) && node.getElementType() == COMMENT) {
            indent = Indent.getSpaceIndent(8);
        }

        return new EiffelBlock(
                node,
                wrap,
                alignment,
                spacingBuilder,
                indent
        );
    }

    @Override
    public Indent getIndent() {
        return myIndent;
    }

    @Nullable
    @Override
    public Spacing getSpacing(@Nullable Block child1, @NotNull Block child2) {
        return spacingBuilder.getSpacing(this, child1, child2);
    }

    @NotNull
    @Override
    public TextRange getTextRange() {
        return myNode.getTextRange();
    }

    @NotNull
    @Override
    public ChildAttributes getChildAttributes(int newChildIndex) {
        List<Block> subBlocks = getSubBlocks();
        if (newChildIndex == 0) {
            return super.getChildAttributes(newChildIndex);
        }
        ASTNode lastChildNodeOfPrev = ((ASTBlock) subBlocks.get(newChildIndex - 1)).getNode().getLastChildNode();
        IElementType prevBlockElementType = null;
        if (lastChildNodeOfPrev != null) {
            prevBlockElementType = lastChildNodeOfPrev.getElementType();
        }
        IElementType thisBlockElementType = ((ASTBlock) subBlocks.get(newChildIndex)).getNode().getElementType();
        if (indentedTokens.contains(prevBlockElementType) || indentedTokens.contains(thisBlockElementType)) {
            return new ChildAttributes(Indent.getSpaceIndent(4), null);
        } else {
            return super.getChildAttributes(newChildIndex);
        }
    }

    @Override
    public boolean isLeaf() {
        return myNode.getFirstChildNode() == null;
    }

    //    @Override
//    public boolean isIncomplete() {
//        return myNode.getElementType().equals(COMPOUND) || myNode.getElementType().equals(LOCAL_DECLARATIONS);
//    }
}
