package com.eiffel.formatting;

import com.eiffel.psi.EiffelTypes;
import com.intellij.formatting.*;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.TokenType;
import com.intellij.psi.formatter.common.AbstractBlock;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class EiffelBlock extends AbstractBlock {
    private SpacingBuilder spacingBuilder;

    private Set<IElementType> indentedTokens = new HashSet<>(Arrays.asList(
            EiffelTypes.CLASS_NAME,
            EiffelTypes.FEATURE_DECLARATION_LIST,
            EiffelTypes.NOTE_LIST,
            EiffelTypes.PARENT_LIST,
            EiffelTypes.ASSERTION,
            EiffelTypes.EXPRESSION,
            EiffelTypes.CREATION_PROCEDURE_LIST,
            EiffelTypes.ENTITY_DECLARATION_LIST,

            EiffelTypes.COMPOUND
    ));

    public EiffelBlock(@NotNull ASTNode node, @NotNull Wrap wrap, @Nullable Alignment alignment, SpacingBuilder spacingBuilder) {
        super(node, wrap, alignment);
        this.spacingBuilder = spacingBuilder;

//        System.out.println("new block: of type '" + node.getElementType().toString() + "' with text range " + node.getTextRange().toString());
    }

    @Override
    protected List<Block> buildChildren() {
        List<Block> blocks = new ArrayList<>();
        ASTNode child = myNode.getFirstChildNode();
        while (child != null) {
            if ((!child.getElementType().equals(TokenType.WHITE_SPACE)) && child.getTextLength() != 0) {
                EiffelBlock block = new EiffelBlock(
                        child,
                        Wrap.createWrap(WrapType.NONE, false),
                        Alignment.createAlignment(),
                        spacingBuilder
                );
                blocks.add(block);
            }
            child = child.getTreeNext();
        }
        return blocks;
    }

    @Override
    public Indent getIndent() {
        if (indentedTokens.contains(myNode.getElementType())) {
            return Indent.getNormalIndent();
        } else {
            return Indent.getNoneIndent();
        }
    }

    @Nullable
    @Override
    public Spacing getSpacing(@Nullable Block child1, @NotNull Block child2) {
        return spacingBuilder.getSpacing(this, child1, child2);
    }

    @Override
    public boolean isLeaf() {
        return myNode.getFirstChildNode() == null || myNode.getElementType().equals(EiffelTypes.CLASS_DECLARATION);
    }

    @Nullable
    private ASTNode findNearestChildOfType(ASTNode node, IElementType type) {
        Queue<ASTNode> queue = new LinkedBlockingQueue<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            ASTNode current = queue.remove();
            if (current.getElementType().equals(type)) return current;
            ASTNode child = current.getFirstChildNode();
            while (child != null) {
                if (!child.getElementType().equals(TokenType.WHITE_SPACE)) queue.add(child);
                child = child.getTreeNext();
            }
        }
        return null;
    }

    @NotNull
    @Override
    public TextRange getTextRange() {
        return myNode.getTextRange();
    }
}
