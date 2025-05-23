/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui.GradientTextureCache;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\b\000\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\024\020\006\032\0020\0078VX\004¢\006\006\032\004\b\b\020\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HoveredErrorBlockDecorationState;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HoveredBlockDecorationState;", "gradientCache", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/GradientTextureCache;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/GradientTextureCache;)V", "leftAreaRenderer", "Lcom/intellij/openapi/editor/markup/LineMarkerRenderer;", "getLeftAreaRenderer", "()Lcom/intellij/openapi/editor/markup/LineMarkerRenderer;", "ej-core"})
/*    */ public final class HoveredErrorBlockDecorationState
/*    */   extends HoveredBlockDecorationState
/*    */ {
/*    */   public HoveredErrorBlockDecorationState(@NotNull GradientTextureCache gradientCache) {
/* 58 */     super(gradientCache); } @NotNull
/*    */   public LineMarkerRenderer getLeftAreaRenderer() {
/* 60 */     return (LineMarkerRenderer)new TerminalBlockLeftErrorRendererWrapper(super.getLeftAreaRenderer());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\HoveredErrorBlockDecorationState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */