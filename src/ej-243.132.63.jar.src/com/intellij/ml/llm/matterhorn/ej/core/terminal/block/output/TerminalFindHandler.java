/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.BlockTerminalController;
/*    */ import com.intellij.openapi.editor.actionSystem.EditorActionHandler;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\006\032\0020\0072\006\020\b\032\0020\tH\026¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalFindHandler;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSearchActionHandler;", "originalHandler", "Lcom/intellij/openapi/editor/actionSystem/EditorActionHandler;", "<init>", "(Lcom/intellij/openapi/editor/actionSystem/EditorActionHandler;)V", "doWithBlockController", "", "blockController", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;", "ej-core"})
/*    */ public final class TerminalFindHandler
/*    */   extends TerminalSearchActionHandler
/*    */ {
/*    */   public TerminalFindHandler(@NotNull EditorActionHandler originalHandler) {
/* 32 */     super(originalHandler);
/*    */   } public void doWithBlockController(@NotNull BlockTerminalController blockController) {
/* 34 */     Intrinsics.checkNotNullParameter(blockController, "blockController"); if (blockController.getSearchSession() != null) {
/* 35 */       blockController.activateSearchSession();
/*    */     } else {
/* 37 */       blockController.startSearchSession();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalFindHandler.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */