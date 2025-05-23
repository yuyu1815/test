/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*     */ 
/*     */ import com.intellij.ui.border.CustomLineBorder;
/*     */ import com.intellij.util.ui.JBInsets;
/*     */ import java.awt.Color;
/*     */ import java.awt.Component;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Insets;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000+\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\004*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J:\020\006\032\0020\0072\006\020\004\032\0020\0052\b\020\b\032\004\030\0010\t2\006\020\n\032\0020\0132\006\020\f\032\0020\0132\006\020\r\032\0020\0132\006\020\016\032\0020\013H\026¨\006\017"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptView$outerBorder$1", "Lcom/intellij/ui/border/CustomLineBorder;", "getBorderInsets", "Ljava/awt/Insets;", "c", "Ljava/awt/Component;", "paintBorder", "", "g", "Ljava/awt/Graphics;", "x", "", "y", "w", "h", "ej-core"})
/*     */ public final class TerminalPromptView$outerBorder$1
/*     */   extends CustomLineBorder
/*     */ {
/*     */   TerminalPromptView$outerBorder$1(Color $super_call_param$1, JBInsets $super_call_param$2) {
/* 104 */     super($super_call_param$1, 
/* 105 */         (Insets)$super_call_param$2);
/*     */   } public Insets getBorderInsets(Component c) {
/* 107 */     Intrinsics.checkNotNullParameter(c, "c"); if (c.getY() == 0) {
/* 108 */       Intrinsics.checkNotNullExpressionValue(JBInsets.emptyInsets(), "emptyInsets(...)"); return (Insets)JBInsets.emptyInsets();
/*     */     } 
/* 110 */     Intrinsics.checkNotNullExpressionValue(super.getBorderInsets(c), "getBorderInsets(...)"); return super.getBorderInsets(c);
/*     */   }
/*     */ 
/*     */   
/*     */   public void paintBorder(Component c, Graphics g, int x, int y, int w, int h) {
/* 115 */     Intrinsics.checkNotNullParameter(c, "c"); if (c.getY() != 0) super
/* 116 */         .paintBorder(c, g, x, y, w, h); 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\TerminalPromptView$outerBorder$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */