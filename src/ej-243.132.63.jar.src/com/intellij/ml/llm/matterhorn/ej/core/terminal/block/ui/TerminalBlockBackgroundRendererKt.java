/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui;
/*    */ 
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.editor.colors.ColorKey;
/*    */ import java.awt.Graphics2D;
/*    */ import java.awt.Paint;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000&\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\0326\020\000\032\004\030\0010\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\b\020\b\032\004\030\0010\t2\b\020\n\032\004\030\0010\013H\000¨\006\f"}, d2 = {"getBlockBackgroundPaint", "Ljava/awt/Paint;", "editor", "Lcom/intellij/openapi/editor/Editor;", "g2d", "Ljava/awt/Graphics2D;", "blockWidth", "", "gradientCache", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/GradientTextureCache;", "backgroundKey", "Lcom/intellij/openapi/editor/colors/ColorKey;", "ej-core"})
/*    */ public final class TerminalBlockBackgroundRendererKt
/*    */ {
/*    */   @Nullable
/*    */   public static final Paint getBlockBackgroundPaint(@NotNull Editor editor, @NotNull Graphics2D g2d, int blockWidth, @Nullable GradientTextureCache gradientCache, @Nullable ColorKey backgroundKey) {
/* 56 */     Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(g2d, "g2d");
/*    */ 
/*    */     
/* 59 */     Intrinsics.checkNotNull(backgroundKey); return (gradientCache != null) ? gradientCache.getTexture(g2d, blockWidth) : editor.getColorsScheme().getColor(backgroundKey);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\bloc\\ui\TerminalBlockBackgroundRendererKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */