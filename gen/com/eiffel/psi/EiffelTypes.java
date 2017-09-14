// This is a generated file. Not intended for manual editing.
package com.eiffel.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.eiffel.pci.EiffelElementType;
import com.eiffel.pci.EiffelTokenType;
import com.eiffel.psi.impl.*;

public interface EiffelTypes {

  IElementType CLASS_DECLARATION = new EiffelElementType("CLASS_DECLARATION");
  IElementType CLASS_HEADER = new EiffelElementType("CLASS_HEADER");
  IElementType HEADER_MARK = new EiffelElementType("HEADER_MARK");

  IElementType CLASS_KEYWORD = new EiffelTokenType("CLASS_KEYWORD");
  IElementType COMMENT = new EiffelTokenType("COMMENT");
  IElementType DEFERRED_KEYWORD = new EiffelTokenType("DEFERRED_KEYWORD");
  IElementType EXPANDED_KEYWORD = new EiffelTokenType("EXPANDED_KEYWORD");
  IElementType FROZEN_KEYWORD = new EiffelTokenType("FROZEN_KEYWORD");
  IElementType IDENTIFIER = new EiffelTokenType("IDENTIFIER");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == CLASS_DECLARATION) {
        return new EiffelClassDeclarationImpl(node);
      }
      else if (type == CLASS_HEADER) {
        return new EiffelClassHeaderImpl(node);
      }
      else if (type == HEADER_MARK) {
        return new EiffelHeaderMarkImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
