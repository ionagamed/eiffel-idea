// This is a generated file. Not intended for manual editing.
package com.eiffel.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.eiffel.pci.EiffelElementType;
import com.eiffel.pci.EiffelTokenType;
import com.eiffel.psi.impl.*;

public interface EiffelTypes {

  IElementType PROPERTY = new EiffelElementType("PROPERTY");

  IElementType COMMENT = new EiffelTokenType("COMMENT");
  IElementType CRLF = new EiffelTokenType("CRLF");
  IElementType KEY = new EiffelTokenType("KEY");
  IElementType SEPARATOR = new EiffelTokenType("SEPARATOR");
  IElementType VALUE = new EiffelTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new EiffelPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
