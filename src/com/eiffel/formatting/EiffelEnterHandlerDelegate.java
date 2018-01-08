package com.eiffel.formatting;

import com.eiffel.psi.EiffelTypes;
import com.intellij.codeInsight.CodeInsightSettings;
import com.intellij.codeInsight.editorActions.enter.EnterHandlerDelegate;
import com.intellij.formatting.Indent;
import com.intellij.icons.AllIcons;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.actionSystem.EditorActionHandler;
import com.intellij.openapi.util.Ref;
import com.intellij.psi.PsiDocumentManager;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.codeStyle.CodeStyleManager;
import com.intellij.util.text.CharArrayUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class EiffelEnterHandlerDelegate implements EnterHandlerDelegate {
    @Override
    public Result preprocessEnter(@NotNull PsiFile file, @NotNull Editor editor, @NotNull Ref<Integer> caretOffsetRef, @NotNull Ref<Integer> caretAdvance, @NotNull DataContext dataContext, @Nullable EditorActionHandler originalHandler) {
//        Document document = editor.getDocument();
//        CharSequence text = document.getCharsSequence();
//        int caretOffset = caretOffsetRef.get().intValue();
//        if (!CodeInsightSettings.getInstance().SMART_INDENT_ON_ENTER) {
//            return Result.Continue;
//        }
//
//        int prevCharOffset = CharArrayUtil.shiftBackward(text, caretOffset - 1, " \t");
//        int nextCharOffset = CharArrayUtil.shiftForward(text, caretOffset, " \t");
//
//        PsiDocumentManager.getInstance(file.getProject()).commitDocument(editor.getDocument());
//        CodeStyleManager.getInstance(file.getProject()).adjustLineIndent(file, editor.getCaretModel().getOffset());
//        PsiDocumentManager.getInstance(file.getProject()).commitDocument(editor.getDocument());

        return Result.Continue;
    }

    @Override
    public Result postProcessEnter(@NotNull PsiFile file, @NotNull Editor editor, @NotNull DataContext dataContext) {
        PsiDocumentManager.getInstance(file.getProject()).commitDocument(editor.getDocument());
        PsiFile psiFile = PsiDocumentManager.getInstance(file.getProject()).getPsiFile(editor.getDocument());
        if (psiFile == null) return Result.Continue;
        PsiElement element = psiFile.findElementAt(editor.getCaretModel().getOffset());
        if (element == null) return Result.Continue;
        PsiElement parent = element.getParent();
        if (parent == null) return Result.Continue;
        PsiElement firstChildOfParent = parent.getFirstChild();
        if (firstChildOfParent == null) return Result.Continue;
        String dummy;
        if (firstChildOfParent.getNode().getElementType().equals(EiffelTypes.LOCAL_DECLARATIONS) || parent.getNode().getElementType().equals(EiffelTypes.LOCAL_DECLARATIONS)) {
            dummy = "a: A";
        } else {
            dummy = "a";
        }
        int offset = editor.getCaretModel().getOffset();
        editor.getDocument().insertString(offset, dummy);
        PsiDocumentManager.getInstance(file.getProject()).commitDocument(editor.getDocument());
        CodeStyleManager.getInstance(file.getProject()).adjustLineIndent(file, offset);
        PsiDocumentManager.getInstance(file.getProject()).commitDocument(editor.getDocument());
        offset = editor.getCaretModel().getOffset();
        editor.getDocument().deleteString(offset, offset + dummy.length());
        PsiDocumentManager.getInstance(file.getProject()).commitDocument(editor.getDocument());

        return Result.Continue;
    }
}
