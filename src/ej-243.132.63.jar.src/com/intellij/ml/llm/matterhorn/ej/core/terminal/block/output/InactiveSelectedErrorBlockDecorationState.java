/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui.TerminalBlockLeftErrorRendererWrapper;
/*    */ import com.intellij.openapi.editor.markup.LineMarkerRenderer;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\b\000\030\0002\0020\001B\007¢\006\004\b\002\020\003R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/InactiveSelectedErrorBlockDecorationState;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/InactiveSelectedBlockDecorationState;", "<init>", "()V", "leftAreaRenderer", "Lcom/intellij/openapi/editor/markup/LineMarkerRenderer;", "getLeftAreaRenderer", "()Lcom/intellij/openapi/editor/markup/LineMarkerRenderer;", "ej-core"})
/*    */ public final class InactiveSelectedErrorBlockDecorationState
/*    */   extends InactiveSelectedBlockDecorationState
/*    */ {
/*    */   @NotNull
/*    */   public LineMarkerRenderer getLeftAreaRenderer() {
/* 65 */     return (LineMarkerRenderer)new TerminalBlockLeftErrorRendererWrapper(super.getLeftAreaRenderer());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\InactiveSelectedErrorBlockDecorationState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */