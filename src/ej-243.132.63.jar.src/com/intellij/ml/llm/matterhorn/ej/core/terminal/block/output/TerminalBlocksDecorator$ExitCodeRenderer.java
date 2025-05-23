/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.icons.AllIcons;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui.TerminalUiUtils;
/*     */ import com.intellij.openapi.editor.EditorCustomElementRenderer;
/*     */ import com.intellij.openapi.editor.Inlay;
/*     */ import com.intellij.openapi.editor.markup.TextAttributes;
/*     */ import com.intellij.terminal.TerminalColorPalette;
/*     */ import com.intellij.ui.SimpleColoredComponent;
/*     */ import com.intellij.util.ui.JBUI;
/*     */ import java.awt.Font;
/*     */ import java.awt.FontMetrics;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Rectangle;
/*     */ import javax.swing.Icon;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\002\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\024\020\017\032\0020\0032\n\020\020\032\006\022\002\b\0030\021H\026J,\020\022\032\0020\0232\n\020\020\032\006\022\002\b\0030\0212\006\020\024\032\0020\0252\006\020\026\032\0020\0272\006\020\030\032\0020\031H\026R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\n\032\0020\013X\004¢\006\002\n\000R\023\020\f\032\0070\r¢\006\002\b\016X\004¢\006\002\n\000¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalBlocksDecorator$ExitCodeRenderer;", "Lcom/intellij/openapi/editor/EditorCustomElementRenderer;", "exitCode", "", "font", "Ljava/awt/Font;", "colorPalette", "Lcom/intellij/terminal/TerminalColorPalette;", "<init>", "(ILjava/awt/Font;Lcom/intellij/terminal/TerminalColorPalette;)V", "text", "", "icon", "Ljavax/swing/Icon;", "Lorg/jetbrains/annotations/NotNull;", "calcWidthInPixels", "inlay", "Lcom/intellij/openapi/editor/Inlay;", "paint", "", "g", "Ljava/awt/Graphics;", "targetRegion", "Ljava/awt/Rectangle;", "textAttributes", "Lcom/intellij/openapi/editor/markup/TextAttributes;", "ej-core"})
/*     */ final class ExitCodeRenderer
/*     */   implements EditorCustomElementRenderer
/*     */ {
/*     */   @NotNull
/*     */   private final Font font;
/*     */   @NotNull
/*     */   private final TerminalColorPalette colorPalette;
/*     */   @NotNull
/*     */   private final String text;
/*     */   @NotNull
/*     */   private final Icon icon;
/*     */   
/*     */   public ExitCodeRenderer(int exitCode, @NotNull Font font, @NotNull TerminalColorPalette colorPalette) {
/* 244 */     this.font = font;
/* 245 */     this.colorPalette = colorPalette;
/* 246 */     this.text = "Exit code " + exitCode;
/* 247 */     Intrinsics.checkNotNullExpressionValue(AllIcons.General.Error, "Error"); this.icon = AllIcons.General.Error;
/*     */   }
/*     */   public int calcWidthInPixels(@NotNull Inlay inlay) {
/* 250 */     Intrinsics.checkNotNullParameter(inlay, "inlay"); FontMetrics fontMetrics = inlay.getEditor().getContentComponent().getFontMetrics(this.font);
/* 251 */     return fontMetrics.stringWidth(this.text) + JBUI.scale(4) + this.icon.getIconWidth();
/*     */   }
/*     */   
/*     */   public void paint(@NotNull Inlay inlay, @NotNull Graphics g, @NotNull Rectangle targetRegion, @NotNull TextAttributes textAttributes) {
/* 255 */     Intrinsics.checkNotNullParameter(inlay, "inlay"); Intrinsics.checkNotNullParameter(g, "g"); Intrinsics.checkNotNullParameter(targetRegion, "targetRegion"); Intrinsics.checkNotNullParameter(textAttributes, "textAttributes"); Graphics g2 = g.create();
/*     */     try {
/* 257 */       Intrinsics.checkNotNullExpressionValue(inlay.getEditor().getScrollingModel().getVisibleArea(), "getVisibleArea(...)"); Rectangle visibleArea = inlay.getEditor().getScrollingModel().getVisibleArea();
/* 258 */       int textX = visibleArea.x + visibleArea.width - targetRegion.width - JBUI.scale(18);
/* 259 */       FontMetrics fontMetrics = g2.getFontMetrics(this.font);
/* 260 */       int baseLine = SimpleColoredComponent.getTextBaseLine(fontMetrics, targetRegion.height);
/* 261 */       g2.setFont(this.font);
/* 262 */       g2.setColor(TerminalUiUtils.INSTANCE.getAwtForegroundByIndex(this.colorPalette, 1));
/* 263 */       g2.drawString(this.text, textX, targetRegion.y + baseLine);
/*     */       
/* 265 */       int heightDiff = fontMetrics.getHeight() - this.icon.getIconHeight();
/* 266 */       int iconY = targetRegion.y + heightDiff / 2 + heightDiff % 2;
/* 267 */       int iconX = textX + targetRegion.width - this.icon.getIconWidth();
/* 268 */       this.icon.paintIcon(inlay.getEditor().getContentComponent(), g2, iconX, iconY);
/*     */     } finally {
/*     */       
/* 271 */       g2.dispose();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalBlocksDecorator$ExitCodeRenderer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */