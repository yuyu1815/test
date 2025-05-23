/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.util.TerminalDataContextUtils;
/*    */ import com.intellij.openapi.actionSystem.DataContext;
/*    */ import com.intellij.openapi.editor.Caret;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.editor.actionSystem.EditorActionHandler;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\b\000\030\0002\0020\001B\017\022\006\020\002\032\0020\001¢\006\004\b\003\020\004J$\020\005\032\0020\0062\006\020\007\032\0020\b2\b\020\t\032\004\030\0010\n2\b\020\013\032\004\030\0010\fH\024J\"\020\r\032\0020\0162\006\020\007\032\0020\b2\006\020\t\032\0020\n2\b\020\013\032\004\030\0010\fH\024R\016\020\002\032\0020\001X\004¢\006\002\n\000¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalReplaceHandler;", "Lcom/intellij/openapi/editor/actionSystem/EditorActionHandler;", "originalHandler", "<init>", "(Lcom/intellij/openapi/editor/actionSystem/EditorActionHandler;)V", "doExecute", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "caret", "Lcom/intellij/openapi/editor/Caret;", "dataContext", "Lcom/intellij/openapi/actionSystem/DataContext;", "isEnabledForCaret", "", "ej-core"})
/*    */ public final class TerminalReplaceHandler
/*    */   extends EditorActionHandler
/*    */ {
/*    */   @NotNull
/*    */   private final EditorActionHandler originalHandler;
/*    */   
/*    */   public TerminalReplaceHandler(@NotNull EditorActionHandler originalHandler) {
/* 54 */     this.originalHandler = originalHandler;
/*    */   } protected void doExecute(@NotNull Editor editor, @Nullable Caret caret, @Nullable DataContext dataContext) {
/* 56 */     Intrinsics.checkNotNullParameter(editor, "editor"); if (!TerminalDataContextUtils.INSTANCE.isPromptEditor(editor) && !TerminalDataContextUtils.INSTANCE.isOutputEditor(editor) && !TerminalDataContextUtils.INSTANCE.isAlternateBufferEditor(editor)) {
/* 57 */       this.originalHandler.execute(editor, caret, dataContext);
/*    */     }
/*    */   }
/*    */   
/*    */   protected boolean isEnabledForCaret(@NotNull Editor editor, @NotNull Caret caret, @Nullable DataContext dataContext) {
/* 62 */     Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(caret, "caret"); return (!TerminalDataContextUtils.INSTANCE.isPromptEditor(editor) && 
/* 63 */       !TerminalDataContextUtils.INSTANCE.isOutputEditor(editor) && 
/* 64 */       !TerminalDataContextUtils.INSTANCE.isAlternateBufferEditor(editor) && 
/* 65 */       this.originalHandler.isEnabled(editor, caret, dataContext));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalReplaceHandler.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */