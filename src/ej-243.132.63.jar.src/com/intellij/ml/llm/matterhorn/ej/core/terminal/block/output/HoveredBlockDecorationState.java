/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui.GradientTextureCache;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui.TerminalBlockBackgroundRenderer;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui.TerminalBlockCornersRenderer;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui.TerminalBlockLeftAreaRenderer;
/*    */ import com.intellij.openapi.editor.markup.CustomHighlighterRenderer;
/*    */ import com.intellij.openapi.editor.markup.LineMarkerRenderer;
/*    */ import com.intellij.terminal.BlockTerminalColors;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\b\020\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\b\020\tR\024\020\n\032\0020\007X\004¢\006\b\n\000\032\004\b\013\020\tR\024\020\f\032\0020\rX\004¢\006\b\n\000\032\004\b\016\020\017¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HoveredBlockDecorationState;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockDecorationState;", "gradientCache", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/GradientTextureCache;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/GradientTextureCache;)V", "backgroundRenderer", "Lcom/intellij/openapi/editor/markup/CustomHighlighterRenderer;", "getBackgroundRenderer", "()Lcom/intellij/openapi/editor/markup/CustomHighlighterRenderer;", "cornersRenderer", "getCornersRenderer", "leftAreaRenderer", "Lcom/intellij/openapi/editor/markup/LineMarkerRenderer;", "getLeftAreaRenderer", "()Lcom/intellij/openapi/editor/markup/LineMarkerRenderer;", "ej-core"})
/*    */ public class HoveredBlockDecorationState
/*    */   implements BlockDecorationState
/*    */ {
/*    */   @NotNull
/*    */   private final CustomHighlighterRenderer backgroundRenderer;
/*    */   @NotNull
/*    */   private final CustomHighlighterRenderer cornersRenderer;
/*    */   @NotNull
/*    */   private final LineMarkerRenderer leftAreaRenderer;
/*    */   
/*    */   public HoveredBlockDecorationState(@NotNull GradientTextureCache gradientCache) {
/* 53 */     this.backgroundRenderer = (CustomHighlighterRenderer)new TerminalBlockBackgroundRenderer(gradientCache);
/* 54 */     this.cornersRenderer = (CustomHighlighterRenderer)new TerminalBlockCornersRenderer(gradientCache, null, 0, 6, null);
/* 55 */     this.leftAreaRenderer = (LineMarkerRenderer)new TerminalBlockLeftAreaRenderer(BlockTerminalColors.HOVERED_BLOCK_BACKGROUND_START, null, null, 0, 14, null); } @NotNull public LineMarkerRenderer getLeftAreaRenderer() { return this.leftAreaRenderer; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public CustomHighlighterRenderer getBackgroundRenderer() {
/*    */     return this.backgroundRenderer;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public CustomHighlighterRenderer getCornersRenderer() {
/*    */     return this.cornersRenderer;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\HoveredBlockDecorationState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */