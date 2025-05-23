/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.BlockTerminalController;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.util.TerminalDataContextUtils;
/*    */ import com.intellij.openapi.actionSystem.DataContext;
/*    */ import com.intellij.openapi.editor.Caret;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.editor.actionSystem.EditorActionHandler;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\000\b \030\0002\0020\001B\017\022\006\020\002\032\0020\001¢\006\004\b\003\020\004J\"\020\005\032\0020\0062\006\020\007\032\0020\b2\b\020\t\032\004\030\0010\n2\006\020\013\032\0020\fH\024J\020\020\r\032\0020\0062\006\020\016\032\0020\017H&J\"\020\020\032\0020\0212\006\020\007\032\0020\b2\006\020\t\032\0020\n2\b\020\013\032\004\030\0010\fH\024R\016\020\002\032\0020\001X\004¢\006\002\n\000¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSearchActionHandler;", "Lcom/intellij/openapi/editor/actionSystem/EditorActionHandler;", "originalHandler", "<init>", "(Lcom/intellij/openapi/editor/actionSystem/EditorActionHandler;)V", "doExecute", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "caret", "Lcom/intellij/openapi/editor/Caret;", "dataContext", "Lcom/intellij/openapi/actionSystem/DataContext;", "doWithBlockController", "blockController", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;", "isEnabledForCaret", "", "ej-core"})
/*    */ public abstract class TerminalSearchActionHandler extends EditorActionHandler {
/* 14 */   public TerminalSearchActionHandler(@NotNull EditorActionHandler originalHandler) { this.originalHandler = originalHandler; } @NotNull
/*    */   private final EditorActionHandler originalHandler; protected void doExecute(@NotNull Editor editor, @Nullable Caret caret, @NotNull DataContext dataContext) {
/* 16 */     Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(dataContext, "dataContext"); BlockTerminalController blockController = TerminalDataContextUtils.INSTANCE.getBlockTerminalController$ej_core(dataContext);
/* 17 */     if (blockController != null) {
/* 18 */       doWithBlockController(blockController);
/*    */     } else {
/* 20 */       this.originalHandler.execute(editor, caret, dataContext);
/*    */     } 
/*    */   }
/*    */   public abstract void doWithBlockController(@NotNull BlockTerminalController paramBlockTerminalController);
/*    */   
/*    */   protected boolean isEnabledForCaret(@NotNull Editor editor, @NotNull Caret caret, @Nullable DataContext dataContext) {
/* 26 */     Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(caret, "caret"); return (TerminalDataContextUtils.INSTANCE.isPromptEditor(editor) || 
/* 27 */       TerminalDataContextUtils.INSTANCE.isOutputEditor(editor) || 
/* 28 */       this.originalHandler.isEnabled(editor, caret, dataContext));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalSearchActionHandler.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */