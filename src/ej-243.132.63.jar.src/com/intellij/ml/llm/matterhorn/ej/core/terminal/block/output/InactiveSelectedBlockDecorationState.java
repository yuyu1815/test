/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\b\020\030\0002\0020\001B\007¢\006\004\b\002\020\003R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\0020\005X\004¢\006\b\n\000\032\004\b\t\020\007R\024\020\n\032\0020\013X\004¢\006\b\n\000\032\004\b\f\020\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/InactiveSelectedBlockDecorationState;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockDecorationState;", "<init>", "()V", "backgroundRenderer", "Lcom/intellij/openapi/editor/markup/CustomHighlighterRenderer;", "getBackgroundRenderer", "()Lcom/intellij/openapi/editor/markup/CustomHighlighterRenderer;", "cornersRenderer", "getCornersRenderer", "leftAreaRenderer", "Lcom/intellij/openapi/editor/markup/LineMarkerRenderer;", "getLeftAreaRenderer", "()Lcom/intellij/openapi/editor/markup/LineMarkerRenderer;", "ej-core"})
/*    */ public class InactiveSelectedBlockDecorationState
/*    */   implements BlockDecorationState
/*    */ {
/*    */   @NotNull
/* 42 */   private final CustomHighlighterRenderer backgroundRenderer = (CustomHighlighterRenderer)new TerminalBlockBackgroundRenderer(BlockTerminalColors.INACTIVE_SELECTED_BLOCK_BACKGROUND); @NotNull public CustomHighlighterRenderer getBackgroundRenderer() { return this.backgroundRenderer; } @NotNull
/* 43 */   private final CustomHighlighterRenderer cornersRenderer = (CustomHighlighterRenderer)new TerminalBlockCornersRenderer(BlockTerminalColors.INACTIVE_SELECTED_BLOCK_BACKGROUND, null, 0, 6, null); @NotNull public CustomHighlighterRenderer getCornersRenderer() { return this.cornersRenderer; } @NotNull
/* 44 */   private final LineMarkerRenderer leftAreaRenderer = (LineMarkerRenderer)new TerminalBlockLeftAreaRenderer(BlockTerminalColors.INACTIVE_SELECTED_BLOCK_BACKGROUND, null, null, 0, 14, null); @NotNull public LineMarkerRenderer getLeftAreaRenderer() { return this.leftAreaRenderer; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\InactiveSelectedBlockDecorationState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */