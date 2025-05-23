/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.BlockTerminalSession;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.util.TerminalDataContextUtils;
/*    */ import com.intellij.openapi.actionSystem.DataContext;
/*    */ import com.intellij.openapi.editor.Caret;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.editor.actionSystem.EditorActionHandler;
/*    */ import com.intellij.openapi.util.TextRange;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.plugins.terminal.exp.completion.TerminalShellSupport;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\b\000\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\"\020\006\032\0020\0072\006\020\b\032\0020\t2\b\020\n\032\004\030\0010\0132\006\020\f\032\0020\rH\026J \020\016\032\0020\0172\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH\024R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalEnterHandler;", "Lcom/intellij/codeInsight/editorActions/BaseEnterHandler;", "originalHandler", "Lcom/intellij/openapi/editor/actionSystem/EditorActionHandler;", "<init>", "(Lcom/intellij/openapi/editor/actionSystem/EditorActionHandler;)V", "executeWriteAction", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "caret", "Lcom/intellij/openapi/editor/Caret;", "dataContext", "Lcom/intellij/openapi/actionSystem/DataContext;", "isEnabledForCaret", "", "ej-core"})
/*    */ public final class TerminalEnterHandler extends BaseEnterHandler {
/* 16 */   public TerminalEnterHandler(@NotNull EditorActionHandler originalHandler) { this.originalHandler = originalHandler; } @NotNull
/*    */   private final EditorActionHandler originalHandler; public void executeWriteAction(@NotNull Editor editor, @Nullable Caret caret, @NotNull DataContext dataContext) {
/* 18 */     Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(dataContext, "dataContext"); TerminalPromptController promptController = TerminalDataContextUtils.INSTANCE.getPromptController$ej_core(dataContext);
/* 19 */     BlockTerminalSession session = TerminalDataContextUtils.INSTANCE.getTerminalSession$ej_core(dataContext);
/* 20 */     if (promptController != null && session != null) {
/* 21 */       int offset = editor.getCaretModel().getOffset();
/* 22 */       TerminalShellSupport shellSupport = TerminalShellSupport.Companion.findByShellType(session.getShellIntegration().getShellType());
/* 23 */       if (offset == promptController.getModel().getCommandStartOffset() || 
/* 24 */         shellSupport == null || 
/* 25 */         !Intrinsics.areEqual(editor.getDocument().getText(new TextRange(offset - 1, offset)), String.valueOf(shellSupport.getLineContinuationChar()))) {
/* 26 */         promptController.handleEnterPressed();
/*    */         return;
/*    */       } 
/*    */     } 
/* 30 */     this.originalHandler.execute(editor, caret, dataContext);
/*    */   }
/*    */   
/*    */   protected boolean isEnabledForCaret(@NotNull Editor editor, @NotNull Caret caret, @NotNull DataContext dataContext) {
/* 34 */     Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(caret, "caret"); Intrinsics.checkNotNullParameter(dataContext, "dataContext"); TerminalDataContextUtils.INSTANCE.getEditor(dataContext); return (((TerminalDataContextUtils.INSTANCE.getEditor(dataContext) != null) ? ((TerminalDataContextUtils.INSTANCE.isPromptEditor(TerminalDataContextUtils.INSTANCE.getEditor(dataContext)) == true)) : false) || this.originalHandler.isEnabled(editor, caret, dataContext));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\TerminalEnterHandler.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */