/*     */ package androidx.compose.ui.geometry;
/*     */ 
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.util.MathHelpersKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\036\n\000\n\002\020\013\n\002\030\002\n\002\b\f\n\002\020\007\n\002\b\n\n\002\030\002\n\002\b\003\032\035\020\r\032\0020\0022\006\020\016\032\0020\0172\006\020\020\032\0020\017H\007¢\006\002\020\021\032*\020\022\032\0020\0022\006\020\023\032\0020\0022\006\020\024\032\0020\0022\006\020\025\032\0020\017H\007ø\001\000¢\006\004\b\026\020\027\032(\020\030\032\0020\002*\0020\0022\f\020\031\032\b\022\004\022\0020\0020\032H\bø\001\001ø\001\000¢\006\004\b\033\020\034\"\036\020\000\032\0020\001*\0020\0028FX\004¢\006\f\022\004\b\003\020\004\032\004\b\005\020\006\"\036\020\007\032\0020\001*\0020\0028FX\004¢\006\f\022\004\b\b\020\004\032\004\b\t\020\006\"\036\020\n\032\0020\001*\0020\0028FX\004¢\006\f\022\004\b\013\020\004\032\004\b\f\020\006\002\016\n\005\b¡\0360\001\n\005\b20\001¨\006\035"}, d2 = {"isFinite", "", "Landroidx/compose/ui/geometry/Offset;", "isFinite-k-4lQ0M$annotations", "(J)V", "isFinite-k-4lQ0M", "(J)Z", "isSpecified", "isSpecified-k-4lQ0M$annotations", "isSpecified-k-4lQ0M", "isUnspecified", "isUnspecified-k-4lQ0M$annotations", "isUnspecified-k-4lQ0M", "Offset", "x", "", "y", "(FF)J", "lerp", "start", "stop", "fraction", "lerp-Wko1d7g", "(JJF)J", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-3MmeM6k", "(JLkotlin/jvm/functions/Function0;)J", "ui-geometry"})
/*     */ @SourceDebugExtension({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,311:1\n63#2,3:312\n72#2:315\n86#2:317\n63#2,3:319\n22#3:316\n22#3:318\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n31#1:312,3\n272#1:315\n273#1:317\n271#1:319,3\n272#1:316\n273#1:318\n*E\n"})
/*     */ public final class OffsetKt
/*     */ {
/*     */   @Stable
/*     */   public static final long Offset(float x, float y) {
/*  31 */     int $i$f$packFloats = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 312 */     long v1$iv = Float.floatToRawIntBits(x);
/* 313 */     long v2$iv = Float.floatToRawIntBits(y);
/* 314 */     return Offset.constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); } @Stable public static final long lerp-Wko1d7g(long start, long stop, float fraction) { long value$iv = start; int $i$f$unpackFloat1 = 0;
/* 315 */     int bits$iv$iv = (int)(value$iv >> 32L), $i$f$floatFromBits = 0; value$iv = stop; $i$f$unpackFloat1 = 0; bits$iv$iv = (int)(value$iv >> 32L); $i$f$floatFromBits = 0;
/* 316 */     float f1 = MathHelpersKt.lerp(Float.intBitsToFloat(bits$iv$iv), Float.intBitsToFloat(bits$iv$iv), fraction); long l1 = start; int $i$f$unpackFloat2 = 0;
/* 317 */     int i = (int)(l1 & 0xFFFFFFFFL), j = 0; l1 = stop; $i$f$unpackFloat2 = 0; i = (int)(l1 & 0xFFFFFFFFL); j = 0;
/* 318 */     float val2$iv = MathHelpersKt.lerp(Float.intBitsToFloat(i), Float.intBitsToFloat(i), fraction); int $i$f$packFloats = 0;
/* 319 */     long v1$iv = Float.floatToRawIntBits(f1);
/* 320 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 321 */     return Offset.constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); }
/*     */ 
/*     */   
/*     */   public static final boolean isFinite-k-4lQ0M(long $this$isFinite) {
/*     */     long v = $this$isFinite & 0x7F8000007F800000L ^ 0x7F8000007F800000L;
/*     */     return ((v - 4294967297L & (v ^ 0xFFFFFFFFFFFFFFFFL) & 0x8000000080000000L) == 0L);
/*     */   }
/*     */   
/*     */   public static final boolean isSpecified-k-4lQ0M(long $this$isSpecified) {
/*     */     return (($this$isSpecified & 0x7FFFFFFF7FFFFFFFL) != 9205357640488583168L);
/*     */   }
/*     */   
/*     */   public static final boolean isUnspecified-k-4lQ0M(long $this$isUnspecified) {
/*     */     return (($this$isUnspecified & 0x7FFFFFFF7FFFFFFFL) == 9205357640488583168L);
/*     */   }
/*     */   
/*     */   public static final long takeOrElse-3MmeM6k(long $this$takeOrElse_u2d3MmeM6k, @NotNull Function0 block) {
/*     */     Intrinsics.checkNotNullParameter(block, "block");
/*     */     int $i$f$takeOrElse-3MmeM6k = 0;
/*     */     return isSpecified-k-4lQ0M($this$takeOrElse_u2d3MmeM6k) ? $this$takeOrElse_u2d3MmeM6k : ((Offset)block.invoke()).unbox-impl();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-geometry-desktop-1.7.3.jar!\androidx\compos\\ui\geometry\OffsetKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */