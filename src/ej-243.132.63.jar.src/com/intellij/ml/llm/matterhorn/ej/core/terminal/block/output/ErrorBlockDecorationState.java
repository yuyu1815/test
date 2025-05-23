/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui.BlockSeparatorRenderer;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui.TerminalBlockLeftErrorRenderer;
/*    */ import com.intellij.openapi.editor.markup.CustomHighlighterRenderer;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\b\000\030\0002\0020\001B\007¢\006\004\b\002\020\003R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\0020\005X\004¢\006\b\n\000\032\004\b\t\020\007R\024\020\n\032\0020\013X\004¢\006\b\n\000\032\004\b\f\020\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/ErrorBlockDecorationState;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockDecorationState;", "<init>", "()V", "backgroundRenderer", "Lcom/intellij/openapi/editor/markup/CustomHighlighterRenderer;", "getBackgroundRenderer", "()Lcom/intellij/openapi/editor/markup/CustomHighlighterRenderer;", "cornersRenderer", "getCornersRenderer", "leftAreaRenderer", "Lcom/intellij/openapi/editor/markup/LineMarkerRenderer;", "getLeftAreaRenderer", "()Lcom/intellij/openapi/editor/markup/LineMarkerRenderer;", "ej-core"})
/*    */ public final class ErrorBlockDecorationState
/*    */   implements BlockDecorationState
/*    */ {
/*    */   @NotNull
/* 69 */   private final CustomHighlighterRenderer backgroundRenderer = new EmptyHighlighterRenderer(); @NotNull public CustomHighlighterRenderer getBackgroundRenderer() { return this.backgroundRenderer; } @NotNull
/* 70 */   private final CustomHighlighterRenderer cornersRenderer = (CustomHighlighterRenderer)new BlockSeparatorRenderer(); @NotNull public CustomHighlighterRenderer getCornersRenderer() { return this.cornersRenderer; } @NotNull
/* 71 */   private final LineMarkerRenderer leftAreaRenderer = (LineMarkerRenderer)new TerminalBlockLeftErrorRenderer(); @NotNull public LineMarkerRenderer getLeftAreaRenderer() { return this.leftAreaRenderer; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\ErrorBlockDecorationState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */