/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*    */ 
/*    */ import com.intellij.codeInsight.AutoPopupController;
/*    */ import com.intellij.codeInsight.editorActions.TypedHandlerDelegate;
/*    */ import com.intellij.codeInsight.lookup.LookupEx;
/*    */ import com.intellij.codeInsight.lookup.LookupManager;
/*    */ import com.intellij.codeInsight.lookup.impl.LookupImpl;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.util.TerminalDataContextUtils;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.editor.EditorModificationUtil;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import java.io.File;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.plugins.terminal.action.TerminalCommandCompletionAction;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\f\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\r\n\000\b\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J(\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH\026J(\020\016\032\0020\0052\006\020\017\032\0020\0202\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH\026¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalCompletionAutoPopupHandler;", "Lcom/intellij/codeInsight/editorActions/TypedHandlerDelegate;", "<init>", "()V", "checkAutoPopup", "Lcom/intellij/codeInsight/editorActions/TypedHandlerDelegate$Result;", "charTyped", "", "project", "Lcom/intellij/openapi/project/Project;", "editor", "Lcom/intellij/openapi/editor/Editor;", "file", "Lcom/intellij/psi/PsiFile;", "beforeClosingQuoteInserted", "quote", "", "ej-core"})
/*    */ public final class TerminalCompletionAutoPopupHandler
/*    */   extends TypedHandlerDelegate {
/*    */   @NotNull
/*    */   public TypedHandlerDelegate.Result checkAutoPopup(char charTyped, @NotNull Project project, @NotNull Editor editor, @NotNull PsiFile file) {
/* 24 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(file, "file"); if (!TerminalDataContextUtils.INSTANCE.isPromptEditor(editor)) {
/* 25 */       return TypedHandlerDelegate.Result.CONTINUE;
/*    */     }
/*    */     
/* 28 */     LookupEx lookup = LookupManager.getActiveLookup(editor);
/* 29 */     if (lookup instanceof LookupImpl) {
/* 30 */       if (editor.getSelectionModel().hasSelection()) {
/* 31 */         ((LookupImpl)lookup).performGuardedChange(editor::checkAutoPopup$lambda$0);
/*    */       }
/* 33 */       return TypedHandlerDelegate.Result.STOP;
/*    */     } 
/*    */     
/* 36 */     if (Character.isLetterOrDigit(charTyped) || charTyped == '-' || charTyped == File.separatorChar) {
/* 37 */       if (!Intrinsics.areEqual(editor.getUserData(TerminalCommandCompletionAction.Companion.getSUPPRESS_COMPLETION()), Boolean.valueOf(true))) {
/* 38 */         AutoPopupController.getInstance(project).scheduleAutoPopup(editor);
/*    */       }
/* 40 */       return TypedHandlerDelegate.Result.STOP;
/*    */     } 
/*    */     
/* 43 */     return TypedHandlerDelegate.Result.CONTINUE;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public TypedHandlerDelegate.Result beforeClosingQuoteInserted(@NotNull CharSequence quote, @NotNull Project project, @NotNull Editor editor, @NotNull PsiFile file) {
/* 48 */     Intrinsics.checkNotNullParameter(quote, "quote"); Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(file, "file"); return (!TerminalDataContextUtils.INSTANCE.isPromptEditor(editor) || !Intrinsics.areEqual(quote, "`")) ? 
/* 49 */       TypedHandlerDelegate.Result.CONTINUE : 
/*    */       
/* 51 */       TypedHandlerDelegate.Result.STOP;
/*    */   }
/*    */   
/*    */   private static final void checkAutoPopup$lambda$0(Editor $editor) {
/*    */     EditorModificationUtil.deleteSelectedText($editor);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\TerminalCompletionAutoPopupHandler.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */