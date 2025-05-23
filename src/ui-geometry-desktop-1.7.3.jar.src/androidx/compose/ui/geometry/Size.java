/*     */ package androidx.compose.ui.geometry;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.PublishedApi;
/*     */ import kotlin.jvm.JvmInline;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JvmInline
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\002\b\003\n\002\020\007\n\002\b\032\n\002\020\013\n\002\b\004\n\002\020\b\n\002\b\b\n\002\020\016\n\002\b\004\b@\030\000 32\0020\001:\0013B\021\b\000\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\026\032\0020\007H\n¢\006\004\b\027\020\013J\020\020\030\032\0020\007H\n¢\006\004\b\031\020\013J'\020\032\032\0020\0002\b\b\002\020\023\032\0020\0072\b\b\002\020\006\032\0020\007ø\001\000ø\001\001¢\006\004\b\033\020\034J\036\020\035\032\0020\0002\006\020\036\032\0020\007H\002ø\001\000ø\001\001¢\006\004\b\037\020 J\032\020!\032\0020\"2\b\020#\032\004\030\0010\001HÖ\003¢\006\004\b$\020%J\020\020&\032\0020'HÖ\001¢\006\004\b(\020)J\017\020*\032\0020\"H\007¢\006\004\b+\020,J\036\020-\032\0020\0002\006\020\036\032\0020\007H\002ø\001\000ø\001\001¢\006\004\b.\020 J\017\020/\032\00200H\026¢\006\004\b1\0202R\032\020\006\032\0020\0078FX\004¢\006\f\022\004\b\b\020\t\032\004\b\n\020\013R\032\020\f\032\0020\0078FX\004¢\006\f\022\004\b\r\020\t\032\004\b\016\020\013R\032\020\017\032\0020\0078FX\004¢\006\f\022\004\b\020\020\t\032\004\b\021\020\013R\026\020\002\032\0020\0038\000X\004¢\006\b\n\000\022\004\b\022\020\tR\032\020\023\032\0020\0078FX\004¢\006\f\022\004\b\024\020\t\032\004\b\025\020\013\001\002\001\0020\003\002\013\n\002\b!\n\005\b¡\0360\001¨\0064"}, d2 = {"Landroidx/compose/ui/geometry/Size;", "", "packedValue", "", "constructor-impl", "(J)J", "height", "", "getHeight$annotations", "()V", "getHeight-impl", "(J)F", "maxDimension", "getMaxDimension$annotations", "getMaxDimension-impl", "minDimension", "getMinDimension$annotations", "getMinDimension-impl", "getPackedValue$annotations", "width", "getWidth$annotations", "getWidth-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-xjbvk4A", "(JFF)J", "div", "operand", "div-7Ah8Wj8", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "isEmpty", "isEmpty-impl", "(J)Z", "times", "times-7Ah8Wj8", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-geometry"})
/*     */ @Immutable
/*     */ @SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,285:1\n72#2:286\n86#2:288\n63#2,3:290\n72#2:293\n86#2:295\n72#2:296\n86#2:298\n63#2,3:300\n72#2:303\n86#2:305\n63#2,3:307\n79#2:310\n93#2:312\n79#2:313\n93#2:315\n22#3:287\n22#3:289\n22#3:294\n22#3:297\n22#3:299\n22#3:304\n22#3:306\n22#3:311\n22#3:314\n198#4:316\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n51#1:286\n61#1:288\n77#1:290,3\n76#1:293\n76#1:295\n133#1:296\n134#1:298\n132#1:300,3\n153#1:303\n154#1:305\n152#1:307,3\n168#1:310\n168#1:312\n180#1:313\n180#1:315\n51#1:287\n61#1:289\n76#1:294\n133#1:297\n134#1:299\n153#1:304\n154#1:306\n168#1:311\n180#1:314\n184#1:316\n*E\n"})
/*     */ public final class Size
/*     */ {
/*     */   public static final float getWidth-impl(long arg0) {
/*  48 */     if (arg0 == 9205357640488583168L) {
/*  49 */       InlineClassHelperKt.throwIllegalStateException("Size is unspecified");
/*     */     }
/*  51 */     long value$iv = arg0; int $i$f$unpackFloat1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 286 */     int bits$iv$iv = (int)(value$iv >> 32L), $i$f$floatFromBits = 0;
/* 287 */     return Float.intBitsToFloat(bits$iv$iv); } public static final float getHeight-impl(long arg0) { if (arg0 == 9205357640488583168L)
/* 288 */       InlineClassHelperKt.throwIllegalStateException("Size is unspecified");  long value$iv = arg0; int $i$f$unpackFloat2 = 0; int bits$iv$iv = (int)(value$iv & 0xFFFFFFFFL), $i$f$floatFromBits = 0;
/* 289 */     return Float.intBitsToFloat(bits$iv$iv); } @Stable public static final float component1-impl(long arg0) { int $i$f$component1-impl = 0; return getWidth-impl(arg0); } @Stable public static final float component2-impl(long arg0) { int $i$f$component2-impl = 0; return getHeight-impl(arg0); }
/* 290 */   public static final long copy-xjbvk4A(long arg0, float width, float height) { int $i$f$packFloats = 0; long v1$iv = Float.floatToRawIntBits(width);
/* 291 */     long v2$iv = Float.floatToRawIntBits(height);
/* 292 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); }
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\b\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R$\020\003\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\005\020\002\032\004\b\006\020\007R$\020\t\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\n\020\002\032\004\b\013\020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006\f"}, d2 = {"Landroidx/compose/ui/geometry/Size$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/geometry/Size;", "getUnspecified-NH-jbRc$annotations", "getUnspecified-NH-jbRc", "()J", "J", "Zero", "getZero-NH-jbRc$annotations", "getZero-NH-jbRc", "ui-geometry"}) public static final class Companion {
/*     */     private Companion() {}
/*     */     public final long getZero-NH-jbRc() { return Size.Zero; } public final long getUnspecified-NH-jbRc() { return Size.Unspecified; } } @NotNull public static final Companion Companion = new Companion(null); private final long packedValue; @Stable public static final long times-7Ah8Wj8(long arg0, float operand) { if (arg0 == 9205357640488583168L)
/* 296 */       InlineClassHelperKt.throwIllegalStateException("Size is unspecified");  long value$iv = arg0; int $i$f$unpackFloat1 = 0; int bits$iv$iv = (int)(value$iv >> 32L), $i$f$floatFromBits = 0;
/* 297 */     float f1 = Float.intBitsToFloat(bits$iv$iv) * operand; long l1 = arg0; int $i$f$unpackFloat2 = 0;
/* 298 */     int i = (int)(l1 & 0xFFFFFFFFL), j = 0;
/* 299 */     float val2$iv = Float.intBitsToFloat(i) * operand; int $i$f$packFloats = 0;
/* 300 */     long v1$iv = Float.floatToRawIntBits(f1);
/* 301 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 302 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); }
/* 303 */   private static final long Zero = constructor-impl(0L); private static final long Unspecified = constructor-impl(9205357640488583168L); @Stable public static final boolean isEmpty-impl(long arg0) { if (arg0 == 9205357640488583168L) InlineClassHelperKt.throwIllegalStateException("Size is unspecified");  long v = arg0 & (((arg0 & 0x8000000080000000L) >>> 31L) * -1L ^ 0xFFFFFFFFFFFFFFFFL); return ((v >>> 32L & v & 0xFFFFFFFFL) == 0L); } @Stable public static final long div-7Ah8Wj8(long arg0, float operand) { if (arg0 == 9205357640488583168L) InlineClassHelperKt.throwIllegalStateException("Size is unspecified");  long value$iv = arg0; int $i$f$unpackFloat1 = 0; int bits$iv$iv = (int)(value$iv >> 32L), $i$f$floatFromBits = 0;
/* 304 */     float f1 = Float.intBitsToFloat(bits$iv$iv) / operand; long l1 = arg0; int $i$f$unpackFloat2 = 0;
/* 305 */     int i = (int)(l1 & 0xFFFFFFFFL), j = 0;
/* 306 */     float val2$iv = Float.intBitsToFloat(i) / operand; int $i$f$packFloats = 0;
/* 307 */     long v1$iv = Float.floatToRawIntBits(f1);
/* 308 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 309 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); } public static final float getMinDimension-impl(long arg0) { if (arg0 == 9205357640488583168L)
/* 310 */       InlineClassHelperKt.throwIllegalStateException("Size is unspecified");  long value$iv = arg0; int $i$f$unpackAbsFloat1 = 0; int bits$iv$iv = (int)(value$iv >> 32L & 0x7FFFFFFFL), $i$f$floatFromBits = 0; float f1 = 
/* 311 */       Float.intBitsToFloat(bits$iv$iv); long l1 = arg0; int $i$f$unpackAbsFloat2 = 0;
/* 312 */     int i = (int)(l1 & 0x7FFFFFFFL), j = 0; float f2 = Float.intBitsToFloat(i); return Math.min(f1, f2); } public static final float getMaxDimension-impl(long arg0) { if (arg0 == 9205357640488583168L)
/* 313 */       InlineClassHelperKt.throwIllegalStateException("Size is unspecified");  long value$iv = arg0; int $i$f$unpackAbsFloat1 = 0; int bits$iv$iv = (int)(value$iv >> 32L & 0x7FFFFFFFL), $i$f$floatFromBits = 0; float f1 = 
/* 314 */       Float.intBitsToFloat(bits$iv$iv); long l1 = arg0; int $i$f$unpackAbsFloat2 = 0;
/* 315 */     int i = (int)(l1 & 0x7FFFFFFFL), j = 0; float f2 = Float.intBitsToFloat(i); return Math.max(f1, f2); } @NotNull public String toString() { return toString-impl(this.packedValue); }
/* 316 */   @NotNull public static String toString-impl(long arg0) { long $this$isSpecified$iv = arg0; int $i$f$isSpecified-uvyYCjk = 0; return (($this$isSpecified$iv != 9205357640488583168L)) ? ("Size(" + GeometryUtilsKt.toStringAsFixed(getWidth-impl(arg0), 1) + ", " + GeometryUtilsKt.toStringAsFixed(getHeight-impl(arg0), 1) + ')') : "Size.Unspecified"; }
/*     */ 
/*     */   
/*     */   public static int hashCode-impl(long arg0) {
/*     */     return Long.hashCode(arg0);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return hashCode-impl(this.packedValue);
/*     */   }
/*     */   
/*     */   public static boolean equals-impl(long arg0, Object other) {
/*     */     if (!(other instanceof Size))
/*     */       return false; 
/*     */     long l = ((Size)other).unbox-impl();
/*     */     return !(arg0 != l);
/*     */   }
/*     */   
/*     */   public boolean equals(Object other) {
/*     */     return equals-impl(this.packedValue, other);
/*     */   }
/*     */   
/*     */   public static long constructor-impl(long packedValue) {
/*     */     return packedValue;
/*     */   }
/*     */   
/*     */   public static final boolean equals-impl0(long p1, long p2) {
/*     */     return (p1 == p2);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-geometry-desktop-1.7.3.jar!\androidx\compos\\ui\geometry\Size.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */