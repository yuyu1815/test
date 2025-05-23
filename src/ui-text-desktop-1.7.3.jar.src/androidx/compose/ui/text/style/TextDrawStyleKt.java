/*     */ package androidx.compose.ui.text.style;
/*     */ 
/*     */ import androidx.compose.ui.graphics.Brush;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.ColorKt;
/*     */ import androidx.compose.ui.text.SpanStyleKt;
/*     */ import androidx.compose.ui.util.MathHelpersKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmName;
/*     */ import kotlin.jvm.functions.Function0;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\036\n\000\n\002\030\002\n\002\b\003\n\002\020\007\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\000\032 \020\000\032\0020\0012\006\020\002\032\0020\0012\006\020\003\032\0020\0012\006\020\004\032\0020\005H\000\032\036\020\006\032\0020\007*\0020\0072\006\020\b\032\0020\005H\000ø\001\000¢\006\004\b\t\020\n\032\032\020\013\032\0020\005*\0020\0052\f\020\f\032\b\022\004\022\0020\0050\rH\002\002\007\n\005\b¡\0360\001¨\006\016"}, d2 = {"lerp", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "start", "stop", "fraction", "", "modulate", "Landroidx/compose/ui/graphics/Color;", "alpha", "modulate-DxMtmZc", "(JF)J", "takeOrElse", "block", "Lkotlin/Function0;", "ui-text"})
/*     */ @JvmName(name = "TextDrawStyleKt")
/*     */ public final class TextDrawStyleKt
/*     */ {
/*     */   @NotNull
/*     */   public static final TextForegroundStyle lerp(@NotNull TextForegroundStyle start, @NotNull TextForegroundStyle stop, float fraction) {
/* 130 */     Intrinsics.checkNotNullParameter(start, "start"); Intrinsics.checkNotNullParameter(stop, "stop"); return (!(start instanceof BrushStyle) && !(stop instanceof BrushStyle)) ? 
/* 131 */       TextForegroundStyle.Companion.from-8_81llA(ColorKt.lerp-jxsXWHM(start.getColor-0d7_KjU(), stop.getColor-0d7_KjU(), fraction)) : (
/* 132 */       (start instanceof BrushStyle && stop instanceof BrushStyle) ? 
/* 133 */       TextForegroundStyle.Companion.from(
/* 134 */         (Brush)SpanStyleKt.lerpDiscrete(((BrushStyle)start).getBrush(), ((BrushStyle)stop).getBrush(), fraction), 
/* 135 */         MathHelpersKt.lerp(start.getAlpha(), stop.getAlpha(), fraction)) : 
/*     */ 
/*     */       
/* 138 */       (TextForegroundStyle)SpanStyleKt.lerpDiscrete(start, stop, fraction));
/*     */   }
/*     */   
/*     */   public static final long modulate-DxMtmZc(long $this$modulate_u2dDxMtmZc, float alpha) {
/* 142 */     return (
/* 143 */       Float.isNaN(alpha) || alpha >= 1.0F) ? $this$modulate_u2dDxMtmZc : 
/* 144 */       Color.copy-wmQWz5c$default($this$modulate_u2dDxMtmZc, Color.getAlpha-impl($this$modulate_u2dDxMtmZc) * alpha, 0.0F, 0.0F, 0.0F, 14, null);
/*     */   }
/*     */   
/*     */   private static final float takeOrElse(float $this$takeOrElse, Function0 block) {
/* 148 */     return Float.isNaN($this$takeOrElse) ? ((Number)block.invoke()).floatValue() : $this$takeOrElse;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\style\TextDrawStyleKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */