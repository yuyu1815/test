/*     */ package androidx.compose.ui.util;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.math.MathKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\020\007\n\002\b\013\n\002\020\b\n\002\020\t\n\000\n\002\020\006\n\002\b\005\032\016\020\000\032\0020\0012\006\020\002\032\0020\001\032)\020\003\032\0020\0012\006\020\004\032\0020\0012\006\020\005\032\0020\0012\006\020\006\032\0020\0012\006\020\007\032\0020\001H\b\032)\020\b\032\0020\0012\006\020\004\032\0020\0012\006\020\005\032\0020\0012\006\020\006\032\0020\0012\006\020\007\032\0020\001H\b\032\036\020\t\032\0020\0012\006\020\n\032\0020\0012\006\020\013\032\0020\0012\006\020\f\032\0020\001\032\036\020\t\032\0020\r2\006\020\n\032\0020\r2\006\020\013\032\0020\r2\006\020\f\032\0020\001\032\036\020\t\032\0020\0162\006\020\n\032\0020\0162\006\020\013\032\0020\0162\006\020\f\032\0020\001\032\025\020\017\032\0020\020*\0020\0202\006\020\021\032\0020\020H\b\032\025\020\017\032\0020\001*\0020\0012\006\020\021\032\0020\001H\b\032\025\020\022\032\0020\020*\0020\0202\006\020\023\032\0020\020H\b\032\025\020\022\032\0020\001*\0020\0012\006\020\023\032\0020\001H\b\032\035\020\024\032\0020\020*\0020\0202\006\020\021\032\0020\0202\006\020\023\032\0020\020H\b\032\035\020\024\032\0020\001*\0020\0012\006\020\021\032\0020\0012\006\020\023\032\0020\001H\b¨\006\025"}, d2 = {"fastCbrt", "", "x", "fastMaxOf", "a", "b", "c", "d", "fastMinOf", "lerp", "start", "stop", "fraction", "", "", "fastCoerceAtLeast", "", "minimumValue", "fastCoerceAtMost", "maximumValue", "fastCoerceIn", "ui-util"})
/*     */ @SourceDebugExtension({"SMAP\nMathHelpers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,241:1\n78#1,9:243\n104#1,9:252\n28#2:242\n22#2:261\n*S KotlinDebug\n*F\n+ 1 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n71#1:243,9\n97#1:252,9\n31#1:242\n233#1:261\n*E\n"})
/*     */ public final class MathHelpersKt
/*     */ {
/*     */   public static final float lerp(float start, float stop, float fraction) {
/*  24 */     return (true - fraction) * start + fraction * stop;
/*     */   } public static final long lerp(long start, long stop, float fraction) {
/*     */     return start + MathKt.roundToLong((stop - start) * fraction);
/*     */   } public static final float fastMinOf(float a, float b, float c, float d) {
/*     */     int $i$f$fastMinOf = 0;
/*     */     return Math.min(a, Math.min(b, Math.min(c, d)));
/*     */   }
/*  31 */   public static final int lerp(int start, int stop, float fraction) { double $this$fastRoundToInt$iv = (stop - start) * fraction; int $i$f$fastRoundToInt = 0; return start + 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 242 */       (int)Math.round($this$fastRoundToInt$iv); }
/* 243 */   public static final float fastMaxOf(float a, float b, float c, float d) { int $i$f$fastMaxOf = 0; return Math.max(a, Math.max(b, Math.max(c, d))); } public static final float fastCoerceAtLeast(float $this$fastCoerceAtLeast, float minimumValue) { int $i$f$fastCoerceAtLeast = 0; return ($this$fastCoerceAtLeast < minimumValue) ? minimumValue : $this$fastCoerceAtLeast; } public static final float fastCoerceIn(float $this$fastCoerceIn, float minimumValue, float maximumValue) { int $i$f$fastCoerceIn = 0; float $this$fastCoerceAtLeast$iv = $this$fastCoerceIn; int $i$f$fastCoerceAtLeast = 0; float $this$fastCoerceAtMost$iv = ($this$fastCoerceAtLeast$iv < minimumValue) ? minimumValue : $this$fastCoerceAtLeast$iv;
/*     */ 
/*     */ 
/*     */     
/*     */     int $i$f$fastCoerceAtMost = 0;
/*     */ 
/*     */ 
/*     */     
/* 251 */     return ($this$fastCoerceAtMost$iv > maximumValue) ? maximumValue : $this$fastCoerceAtMost$iv; }
/* 252 */   public static final float fastCoerceAtMost(float $this$fastCoerceAtMost, float maximumValue) { int $i$f$fastCoerceAtMost = 0; return ($this$fastCoerceAtMost > maximumValue) ? maximumValue : $this$fastCoerceAtMost; } public static final double fastCoerceIn(double $this$fastCoerceIn, double minimumValue, double maximumValue) { int $i$f$fastCoerceIn = 0; double $this$fastCoerceAtLeast$iv = $this$fastCoerceIn; int $i$f$fastCoerceAtLeast = 0; double $this$fastCoerceAtMost$iv = ($this$fastCoerceAtLeast$iv < minimumValue) ? minimumValue : $this$fastCoerceAtLeast$iv;
/*     */ 
/*     */ 
/*     */     
/*     */     int $i$f$fastCoerceAtMost = 0;
/*     */ 
/*     */ 
/*     */     
/* 260 */     return ($this$fastCoerceAtMost$iv > maximumValue) ? maximumValue : $this$fastCoerceAtMost$iv; } public static final double fastCoerceAtLeast(double $this$fastCoerceAtLeast, double minimumValue) { int $i$f$fastCoerceAtLeast = 0; return ($this$fastCoerceAtLeast < minimumValue) ? minimumValue : $this$fastCoerceAtLeast; } public static final double fastCoerceAtMost(double $this$fastCoerceAtMost, double maximumValue) { int $i$f$fastCoerceAtMost = 0; return ($this$fastCoerceAtMost > maximumValue) ? maximumValue : $this$fastCoerceAtMost; }
/* 261 */   public static final float fastCbrt(float x) { long v = Float.floatToRawIntBits(x) & 0x1FFFFFFFFL; int bits$iv = 709952852 + (int)(v / 3L), $i$f$floatFromBits = 0; float estimate = Float.intBitsToFloat(bits$iv);
/*     */     estimate -= (estimate - x / estimate * estimate) * 0.33333334F;
/*     */     estimate -= (estimate - x / estimate * estimate) * 0.33333334F;
/*     */     return estimate; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-util-desktop-1.7.3.jar!\androidx\compos\\u\\util\MathHelpersKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */