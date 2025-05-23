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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000>\n\000\n\002\030\002\n\002\030\002\n\002\b\005\n\002\020\013\n\002\b\b\n\002\020\007\n\002\b\n\n\002\030\002\n\002\b\003\n\002\020\006\n\002\b\004\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\003\032\035\020\017\032\0020\0022\006\020\020\032\0020\0212\006\020\022\032\0020\021H\007¢\006\002\020\023\032*\020\024\032\0020\0022\006\020\025\032\0020\0022\006\020\026\032\0020\0022\006\020\027\032\0020\021H\007ø\001\000¢\006\004\b\030\020\031\032(\020\032\032\0020\002*\0020\0022\f\020\033\032\b\022\004\022\0020\0020\034H\bø\001\001ø\001\000¢\006\004\b\035\020\036\032\037\020\037\032\0020\002*\0020 2\006\020!\032\0020\002H\nø\001\000¢\006\004\b\"\020#\032\037\020\037\032\0020\002*\0020\0212\006\020!\032\0020\002H\nø\001\000¢\006\004\b\"\020$\032\037\020\037\032\0020\002*\0020%2\006\020!\032\0020\002H\nø\001\000¢\006\004\b\"\020&\032\026\020'\032\0020(*\0020\002H\007ø\001\000¢\006\004\b)\020*\"\036\020\000\032\0020\001*\0020\0028FX\004¢\006\f\022\004\b\003\020\004\032\004\b\005\020\006\"\037\020\007\032\0020\b*\0020\0028Æ\002X\004¢\006\f\022\004\b\t\020\004\032\004\b\n\020\013\"\037\020\f\032\0020\b*\0020\0028Æ\002X\004¢\006\f\022\004\b\r\020\004\032\004\b\016\020\013\002\016\n\005\b¡\0360\001\n\005\b20\001¨\006+"}, d2 = {"center", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Size;", "getCenter-uvyYCjk$annotations", "(J)V", "getCenter-uvyYCjk", "(J)J", "isSpecified", "", "isSpecified-uvyYCjk$annotations", "isSpecified-uvyYCjk", "(J)Z", "isUnspecified", "isUnspecified-uvyYCjk$annotations", "isUnspecified-uvyYCjk", "Size", "width", "", "height", "(FF)J", "lerp", "start", "stop", "fraction", "lerp-VgWVRYQ", "(JJF)J", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-TmRCtEA", "(JLkotlin/jvm/functions/Function0;)J", "times", "", "size", "times-d16Qtg0", "(DJ)J", "(FJ)J", "", "(IJ)J", "toRect", "Landroidx/compose/ui/geometry/Rect;", "toRect-uvyYCjk", "(J)Landroidx/compose/ui/geometry/Rect;", "ui-geometry"})
/*     */ @SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,285:1\n198#1:289\n63#2,3:286\n72#2:290\n86#2:292\n63#2,3:294\n72#2:297\n86#2:299\n22#3:291\n22#3:293\n22#3:298\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n212#1:289\n34#1:286,3\n239#1:290\n240#1:292\n238#1:294,3\n283#1:297\n283#1:299\n239#1:291\n240#1:293\n283#1:298\n*E\n"})
/*     */ public final class SizeKt
/*     */ {
/*     */   public static final boolean isSpecified-uvyYCjk(long $this$isSpecified) {
/*     */     int $i$f$isSpecified-uvyYCjk = 0;
/*     */     return ($this$isSpecified != 9205357640488583168L);
/*     */   }
/*     */   
/*     */   public static final boolean isUnspecified-uvyYCjk(long $this$isUnspecified) {
/*     */     int $i$f$isUnspecified-uvyYCjk = 0;
/*     */     return ($this$isUnspecified == 9205357640488583168L);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final long Size(float width, float height) {
/*  34 */     int $i$f$packFloats = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 286 */     long v1$iv = Float.floatToRawIntBits(width);
/* 287 */     long v2$iv = Float.floatToRawIntBits(height);
/* 288 */     return Size.constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); } public static final long takeOrElse-TmRCtEA(long $this$takeOrElse_u2dTmRCtEA, @NotNull Function0 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$takeOrElse-TmRCtEA = 0; long $this$isSpecified$iv = $this$takeOrElse_u2dTmRCtEA; int $i$f$isSpecified-uvyYCjk = 0;
/* 289 */     return (($this$isSpecified$iv != 9205357640488583168L)) ? $this$takeOrElse_u2dTmRCtEA : ((Size)block.invoke()).unbox-impl(); } @Stable public static final long lerp-VgWVRYQ(long start, long stop, float fraction) { if (start == 9205357640488583168L || stop == 9205357640488583168L)
/* 290 */       InlineClassHelperKt.throwIllegalStateException("Offset is unspecified");  long value$iv = start; int $i$f$unpackFloat1 = 0; int bits$iv$iv = (int)(value$iv >> 32L), $i$f$floatFromBits = 0; value$iv = stop; $i$f$unpackFloat1 = 0; bits$iv$iv = (int)(value$iv >> 32L); $i$f$floatFromBits = 0;
/* 291 */     float f1 = MathHelpersKt.lerp(Float.intBitsToFloat(bits$iv$iv), Float.intBitsToFloat(bits$iv$iv), fraction); long l1 = start; int $i$f$unpackFloat2 = 0;
/* 292 */     int i = (int)(l1 & 0xFFFFFFFFL), j = 0; l1 = stop; $i$f$unpackFloat2 = 0; i = (int)(l1 & 0xFFFFFFFFL); j = 0;
/* 293 */     float val2$iv = MathHelpersKt.lerp(Float.intBitsToFloat(i), Float.intBitsToFloat(i), fraction); int $i$f$packFloats = 0;
/* 294 */     long v1$iv = Float.floatToRawIntBits(f1);
/* 295 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 296 */     return Size.constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); } public static final long getCenter-uvyYCjk(long $this$center) { if ($this$center == 9205357640488583168L)
/* 297 */       InlineClassHelperKt.throwIllegalStateException("Size is unspecified");  long value$iv = $this$center; int $i$f$unpackFloat1 = 0; int bits$iv$iv = (int)(value$iv >> 32L), $i$f$floatFromBits = 0; value$iv = $this$center;
/*     */     int $i$f$unpackFloat2 = 0;
/* 299 */     bits$iv$iv = (int)(value$iv & 0xFFFFFFFFL); $i$f$floatFromBits = 0;
/*     */     return OffsetKt.Offset(Float.intBitsToFloat(bits$iv$iv) / 2.0F, Float.intBitsToFloat(bits$iv$iv) / 2.0F); }
/*     */ 
/*     */   
/*     */   @Stable
/*     */   public static final long times-d16Qtg0(int $this$times_u2dd16Qtg0, long size) {
/*     */     int $i$f$times-d16Qtg0 = 0;
/*     */     return Size.times-7Ah8Wj8(size, $this$times_u2dd16Qtg0);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final long times-d16Qtg0(double $this$times_u2dd16Qtg0, long size) {
/*     */     int $i$f$times-d16Qtg0 = 0;
/*     */     return Size.times-7Ah8Wj8(size, (float)$this$times_u2dd16Qtg0);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final long times-d16Qtg0(float $this$times_u2dd16Qtg0, long size) {
/*     */     int $i$f$times-d16Qtg0 = 0;
/*     */     return Size.times-7Ah8Wj8(size, $this$times_u2dd16Qtg0);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final Rect toRect-uvyYCjk(long $this$toRect_u2duvyYCjk) {
/*     */     return RectKt.Rect-tz77jQw(Offset.Companion.getZero-F1C5BW0(), $this$toRect_u2duvyYCjk);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-geometry-desktop-1.7.3.jar!\androidx\compos\\ui\geometry\SizeKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */