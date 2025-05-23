/*     */ package org.jetbrains.jewel.ui.painter.hints;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.jewel.ui.painter.PainterHint;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\013\n\000\032\025\020\000\032\0020\0012\006\020\002\032\0020\003¢\006\004\b\004\020\005\032\020\020\006\032\0020\0012\b\b\002\020\007\032\0020\b¨\006\t"}, d2 = {"Stroke", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "color", "Landroidx/compose/ui/graphics/Color;", "Stroke-8_81llA", "(J)Lorg/jetbrains/jewel/ui/painter/PainterHint;", "Dark", "isDark", "", "ui"})
/*     */ @SourceDebugExtension({"SMAP\nDarkAndStroke.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DarkAndStroke.kt\norg/jetbrains/jewel/ui/painter/hints/DarkAndStrokeKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,102:1\n696#2:103\n*S KotlinDebug\n*F\n+ 1 DarkAndStroke.kt\norg/jetbrains/jewel/ui/painter/hints/DarkAndStrokeKt\n*L\n80#1:103\n*E\n"})
/*     */ public final class DarkAndStrokeKt
/*     */ {
/*     */   @NotNull
/*     */   public static final PainterHint Stroke-8_81llA(long color) {
/*  80 */     long $this$isSpecified$iv = color; int $i$f$isSpecified-8_81llA = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 103 */       ($this$isSpecified$iv != 16L)) ? (PainterHint)new StrokeImpl(color, null) : (PainterHint)PainterHint.None;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final PainterHint Dark(boolean isDark) {
/*     */     return isDark ? (PainterHint)DarkImpl.INSTANCE : (PainterHint)PainterHint.None;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\hints\DarkAndStrokeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */