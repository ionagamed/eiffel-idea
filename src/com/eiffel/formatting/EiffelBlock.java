package com.eiffel.formatting;

import static com.eiffel.psi.EiffelTypes.*;
import static com.intellij.psi.TokenType.ERROR_ELEMENT;

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
            ERROR_ELEMENT, // newline blocks hack
            FEATURE_LIST,
//            INSTRUCTION,
            COMPOUND,
            PARENT,
            FEATURE_ADAPTION,
            FEATURE_DECLARATION,
            FEATURE_VALUE,
            ENTITY_DECLARATION_GROUP,
            EXPRESSION,
//            BOOLEAN_EXPRESSION, // used in loops
            ASSERTION_CLAUSE,
            COMMENT,
            CONVERSION_PROCEDURE,
            CONVERSION_QUERY,
            BASIC_EXPRESSION
    );
    private static TokenSet checkPrevFor = TokenSet.create(

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
//            indent = Indent.getSmartIndent(false);
        }
        if (indentedNestedTokens.containsKey(myNode.getElementType())) {
            if (indentedNestedTokens.get(myNode.getElementType()).contains(node.getElementType())) {
                indent = Indent.getSmartIndent(Indent.Type.NORMAL);
//                indent = Indent.getNormalIndent(false);
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
        if (myNode.getTextLength() == 0)
            return Indent.getNoneIndent();
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
        ASTNode prevNode = null;
        ASTNode lastChildNodeOfPrev = null;
        ASTNode thisNode = null;
        if (newChildIndex - 1 < subBlocks.size()) {
            prevNode = ((ASTBlock)subBlocks.get(newChildIndex - 1)).getNode();
            lastChildNodeOfPrev = prevNode.getLastChildNode();
        }
        if (newChildIndex < subBlocks.size()) {
            thisNode = ((ASTBlock)subBlocks.get(newChildIndex)).getNode();
        }
        if (isIndented(lastChildNodeOfPrev)
                || isIndented(prevNode)
                || isIndented(thisNode)) {
            return new ChildAttributes(Indent.getSmartIndent(Indent.Type.NORMAL), null);
        } else if (prevNode != null && prevNode.getElementType().equals(FEATURES) &&
                thisNode != null && !TokenSet.create(FEATURES, FEATURE_VALUE).contains(thisNode.getElementType())) {
            return new ChildAttributes(Indent.getNormalIndent(), null);
        } else {
            return super.getChildAttributes(newChildIndex);
        }
    }

    @Override
    public boolean isLeaf() {
        return myNode.getFirstChildNode() == null;
    }

    @Override
    public boolean isIncomplete() {
        if (myNode.getElementType().equals(COMPOUND)) {
            ASTNode lastChildNode = myNode.getTreeParent().getLastChildNode();
            return lastChildNode == null || !lastChildNode.getElementType().equals(END_KEYWORD);
        }
        if (myNode.getElementType().equals(CLASS_DECLARATION)) {
            return true;
        }
        return false;
    }

    private boolean isIndented(ASTNode node) {
        return node != null && indentedTokens.contains(node.getElementType());
    }
}
