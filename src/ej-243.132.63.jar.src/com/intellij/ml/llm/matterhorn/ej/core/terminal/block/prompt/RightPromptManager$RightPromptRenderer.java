/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui.TerminalUiUtilsKt;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.EditorCustomElementRenderer;
/*     */ import com.intellij.openapi.editor.Inlay;
/*     */ import com.intellij.openapi.editor.ex.EditorEx;
/*     */ import com.intellij.openapi.editor.markup.TextAttributes;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Rectangle;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\024\020\006\032\0020\0072\n\020\b\032\006\022\002\b\0030\tH\026J,\020\n\032\0020\0132\n\020\b\032\006\022\002\b\0030\t2\006\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\021H\026J0\020\022\032\0020\0132\006\020\f\032\0020\r2\006\020\023\032\0020\0072\006\020\024\032\0020\0072\006\020\025\032\0020\0072\006\020\026\032\0020\007H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/RightPromptManager$RightPromptRenderer;", "Lcom/intellij/openapi/editor/EditorCustomElementRenderer;", "inlayEditor", "Lcom/intellij/openapi/editor/Editor;", "<init>", "(Lcom/intellij/openapi/editor/Editor;)V", "calcWidthInPixels", "", "inlay", "Lcom/intellij/openapi/editor/Inlay;", "paint", "", "g", "Ljava/awt/Graphics;", "targetRegion", "Ljava/awt/Rectangle;", "textAttributes", "Lcom/intellij/openapi/editor/markup/TextAttributes;", "doPaint", "x", "y", "width", "height", "ej-core"})
/*     */ final class RightPromptRenderer
/*     */   implements EditorCustomElementRenderer
/*     */ {
/*     */   @NotNull
/*     */   private final Editor inlayEditor;
/*     */   
/*     */   public RightPromptRenderer(@NotNull Editor inlayEditor) {
/*  63 */     this.inlayEditor = inlayEditor;
/*     */   }
/*     */ 
/*     */   
/*     */   public int calcWidthInPixels(@NotNull Inlay inlay) {
/*  68 */     Intrinsics.checkNotNullParameter(inlay, "inlay"); return 1;
/*     */   }
/*     */   public void paint(@NotNull Inlay inlay, @NotNull Graphics g, @NotNull Rectangle targetRegion, @NotNull TextAttributes textAttributes) {
/*  71 */     Intrinsics.checkNotNullParameter(inlay, "inlay"); Intrinsics.checkNotNullParameter(g, "g"); Intrinsics.checkNotNullParameter(targetRegion, "targetRegion"); Intrinsics.checkNotNullParameter(textAttributes, "textAttributes"); Intrinsics.checkNotNull(inlay.getEditor(), "null cannot be cast to non-null type com.intellij.openapi.editor.ex.EditorEx"); EditorEx promptEditor = (EditorEx)inlay.getEditor();
/*  72 */     double columnWidth = TerminalUiUtilsKt.getCharSize((Editor)promptEditor).getWidth();
/*     */     
/*  74 */     Intrinsics.checkNotNullExpressionValue(promptEditor.getScrollingModel().getVisibleArea(), "getVisibleArea(...)"); Rectangle visibleArea = promptEditor.getScrollingModel().getVisibleArea();
/*  75 */     int scrollBarWidth = promptEditor.getScrollPane().getVerticalScrollBar().getWidth();
/*     */ 
/*     */     
/*  78 */     int terminalColumns = (int)((visibleArea.width - scrollBarWidth) / columnWidth);
/*     */     
/*  80 */     int textColumns = this.inlayEditor.getDocument().getTextLength();
/*  81 */     double textWidth = textColumns * columnWidth;
/*  82 */     double textX = terminalColumns * columnWidth - textWidth;
/*     */     
/*  84 */     int promptLine = (promptEditor.offsetToLogicalPosition(inlay.getOffset())).line;
/*  85 */     int lineStartOffset = promptEditor.getDocument().getLineStartOffset(promptLine);
/*  86 */     int lineEndOffset = promptEditor.getDocument().getLineEndOffset(promptLine);
/*     */     
/*  88 */     if (lineEndOffset - lineStartOffset < terminalColumns - textColumns) {
/*  89 */       Graphics g2 = g.create();
/*     */       try {
/*  91 */         Intrinsics.checkNotNull(g2); doPaint(g2, (int)textX, targetRegion.y, (int)Math.ceil(textWidth), promptEditor.getLineHeight());
/*     */       } finally {
/*     */         
/*  94 */         g2.dispose();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private final void doPaint(Graphics g, int x, int y, int width, int height) {
/* 100 */     g.translate(x, y);
/* 101 */     g.clipRect(0, 0, width, height);
/* 102 */     this.inlayEditor.getContentComponent().paint(g);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\RightPromptManager$RightPromptRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */