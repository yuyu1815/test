/*     */ package androidx.compose.ui.geometry;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import kotlin.Metadata;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\002\b\003\n\002\020\007\n\002\b\023\n\002\020\013\n\002\b\b\n\002\020\b\n\002\b\017\n\002\020\016\n\002\b\006\b@\030\000 92\0020\001:\0019B\021\b\000\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\017\032\0020\007H\n¢\006\004\b\020\020\013J\020\020\021\032\0020\007H\n¢\006\004\b\022\020\013J'\020\023\032\0020\0002\b\b\002\020\006\032\0020\0072\b\b\002\020\f\032\0020\007ø\001\000ø\001\001¢\006\004\b\024\020\025J\036\020\026\032\0020\0002\006\020\027\032\0020\007H\002ø\001\000ø\001\001¢\006\004\b\030\020\031J\032\020\032\032\0020\0332\b\020\034\032\004\030\0010\001HÖ\003¢\006\004\b\035\020\036J\017\020\037\032\0020\007H\007¢\006\004\b \020\013J\017\020!\032\0020\007H\007¢\006\004\b\"\020\013J\020\020#\032\0020$HÖ\001¢\006\004\b%\020&J\017\020'\032\0020\033H\007¢\006\004\b(\020)J\033\020*\032\0020\0002\006\020\034\032\0020\000H\002ø\001\001¢\006\004\b+\020,J\033\020-\032\0020\0002\006\020\034\032\0020\000H\002ø\001\001¢\006\004\b.\020,J\036\020/\032\0020\0002\006\020\027\032\0020\007H\002ø\001\000ø\001\001¢\006\004\b0\020\031J\036\0201\032\0020\0002\006\020\027\032\0020\007H\002ø\001\000ø\001\001¢\006\004\b2\020\031J\017\0203\032\00204H\026¢\006\004\b5\0206J\026\0207\032\0020\000H\002ø\001\000ø\001\001¢\006\004\b8\020\005R\016\020\002\032\0020\003X\004¢\006\002\n\000R\032\020\006\032\0020\0078FX\004¢\006\f\022\004\b\b\020\t\032\004\b\n\020\013R\032\020\f\032\0020\0078FX\004¢\006\f\022\004\b\r\020\t\032\004\b\016\020\013\001\002\001\0020\003\002\013\n\002\b!\n\005\b¡\0360\001¨\006:"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "", "packedValue", "", "constructor-impl", "(J)J", "x", "", "getX$annotations", "()V", "getX-impl", "(J)F", "y", "getY$annotations", "getY-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-dBAh8RU", "(JFF)J", "div", "operand", "div-tuRUvjQ", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "getDistance", "getDistance-impl", "getDistanceSquared", "getDistanceSquared-impl", "hashCode", "", "hashCode-impl", "(J)I", "isValid", "isValid-impl", "(J)Z", "minus", "minus-MK-Hz9U", "(JJ)J", "plus", "plus-MK-Hz9U", "rem", "rem-tuRUvjQ", "times", "times-tuRUvjQ", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-F1C5BW0", "Companion", "ui-geometry"})
/*     */ @Immutable
/*     */ @SourceDebugExtension({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,311:1\n72#2:312\n86#2:314\n63#2,3:316\n72#2:319\n86#2:321\n72#2:322\n86#2:324\n72#2:326\n86#2:328\n72#2:330\n86#2:332\n63#2,3:334\n72#2:337\n86#2:339\n63#2,3:341\n72#2:344\n86#2:346\n63#2,3:348\n72#2:351\n86#2:353\n63#2,3:355\n72#2:358\n86#2:360\n63#2,3:362\n22#3:313\n22#3:315\n22#3:320\n22#3:323\n22#3:325\n22#3:327\n22#3:329\n22#3:331\n22#3:333\n22#3:338\n22#3:340\n22#3:345\n22#3:347\n22#3:352\n22#3:354\n22#3:359\n22#3:361\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n64#1:312\n67#1:314\n80#1:316,3\n79#1:319\n79#1:321\n129#1:322\n130#1:324\n141#1:326\n142#1:328\n170#1:330\n171#1:332\n169#1:334,3\n187#1:337\n188#1:339\n186#1:341,3\n204#1:344\n205#1:346\n203#1:348,3\n221#1:351\n222#1:353\n220#1:355,3\n238#1:358\n239#1:360\n237#1:362,3\n64#1:313\n67#1:315\n79#1:320\n129#1:323\n130#1:325\n141#1:327\n142#1:329\n170#1:331\n171#1:333\n187#1:338\n188#1:340\n204#1:345\n205#1:347\n221#1:352\n222#1:354\n238#1:359\n239#1:361\n*E\n"})
/*     */ public final class Offset
/*     */ {
/*     */   public static final float getX-impl(long arg0) {
/*  64 */     long value$iv = arg0; int $i$f$unpackFloat1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 312 */     int bits$iv$iv = (int)(value$iv >> 32L), $i$f$floatFromBits = 0;
/* 313 */     return Float.intBitsToFloat(bits$iv$iv); } public static final float getY-impl(long arg0) { long value$iv = arg0; int $i$f$unpackFloat2 = 0;
/* 314 */     int bits$iv$iv = (int)(value$iv & 0xFFFFFFFFL), $i$f$floatFromBits = 0;
/* 315 */     return Float.intBitsToFloat(bits$iv$iv); } @Stable public static final float component1-impl(long arg0) { int $i$f$component1-impl = 0; return getX-impl(arg0); } @Stable public static final float component2-impl(long arg0) { int $i$f$component2-impl = 0; return getY-impl(arg0); }
/* 316 */   public static final long copy-dBAh8RU(long arg0, float x, float y) { int $i$f$packFloats = 0; long v1$iv = Float.floatToRawIntBits(x);
/* 317 */     long v2$iv = Float.floatToRawIntBits(y);
/* 318 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); }
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\013\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R$\020\003\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\005\020\002\032\004\b\006\020\007R$\020\t\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\n\020\002\032\004\b\013\020\007R$\020\f\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\r\020\002\032\004\b\016\020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006\017"}, d2 = {"Landroidx/compose/ui/geometry/Offset$Companion;", "", "()V", "Infinite", "Landroidx/compose/ui/geometry/Offset;", "getInfinite-F1C5BW0$annotations", "getInfinite-F1C5BW0", "()J", "J", "Unspecified", "getUnspecified-F1C5BW0$annotations", "getUnspecified-F1C5BW0", "Zero", "getZero-F1C5BW0$annotations", "getZero-F1C5BW0", "ui-geometry"}) public static final class Companion {
/*     */     private Companion() {}
/*     */     public final long getZero-F1C5BW0() { return Offset.Zero; }
/* 322 */     public final long getInfinite-F1C5BW0() { return Offset.Infinite; } public final long getUnspecified-F1C5BW0() { return Offset.Unspecified; } } @NotNull public static final Companion Companion = new Companion(null); private final long packedValue; @Stable public static final float getDistance-impl(long arg0) { long value$iv = arg0; int $i$f$unpackFloat1 = 0; int bits$iv$iv = (int)(value$iv >> 32L), $i$f$floatFromBits = 0;
/* 323 */     float x = Float.intBitsToFloat(bits$iv$iv); long l1 = arg0; int $i$f$unpackFloat2 = 0;
/* 324 */     int i = (int)(l1 & 0xFFFFFFFFL), j = 0;
/* 325 */     float y = Float.intBitsToFloat(i); return (float)Math.sqrt((x * x + y * y)); }
/* 326 */   private static final long Zero = constructor-impl(0L); private static final long Infinite = constructor-impl(9187343241974906880L); private static final long Unspecified = constructor-impl(9205357640488583168L); @Stable public static final boolean isValid-impl(long arg0) { long v = arg0 & 0x7FFFFFFF7FFFFFFFL; return ((v - 9187343246269874177L & (v ^ 0xFFFFFFFFFFFFFFFFL) & 0x8000000080000000L) == -9223372034707292160L); } @Stable public static final float getDistanceSquared-impl(long arg0) { long value$iv = arg0; int $i$f$unpackFloat1 = 0; int bits$iv$iv = (int)(value$iv >> 32L), $i$f$floatFromBits = 0;
/* 327 */     float x = Float.intBitsToFloat(bits$iv$iv); long l1 = arg0; int $i$f$unpackFloat2 = 0;
/* 328 */     int i = (int)(l1 & 0xFFFFFFFFL), j = 0;
/* 329 */     float y = Float.intBitsToFloat(i); return x * x + y * y; } @Stable public static final long unaryMinus-F1C5BW0(long arg0) { return constructor-impl(arg0 ^ 0x8000000080000000L); }
/* 330 */   @Stable public static final long minus-MK-Hz9U(long arg0, long other) { long value$iv = arg0; int $i$f$unpackFloat1 = 0; int bits$iv$iv = (int)(value$iv >> 32L), $i$f$floatFromBits = 0; value$iv = other; $i$f$unpackFloat1 = 0; bits$iv$iv = (int)(value$iv >> 32L); $i$f$floatFromBits = 0;
/* 331 */     float f1 = Float.intBitsToFloat(bits$iv$iv) - Float.intBitsToFloat(bits$iv$iv); long l1 = arg0; int $i$f$unpackFloat2 = 0;
/* 332 */     int i = (int)(l1 & 0xFFFFFFFFL), j = 0; l1 = other; $i$f$unpackFloat2 = 0; i = (int)(l1 & 0xFFFFFFFFL); j = 0;
/* 333 */     float val2$iv = Float.intBitsToFloat(i) - Float.intBitsToFloat(i); int $i$f$packFloats = 0;
/* 334 */     long v1$iv = Float.floatToRawIntBits(f1);
/* 335 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 336 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); } @Stable public static final long plus-MK-Hz9U(long arg0, long other) { long value$iv = arg0; int $i$f$unpackFloat1 = 0;
/* 337 */     int bits$iv$iv = (int)(value$iv >> 32L), $i$f$floatFromBits = 0; value$iv = other; $i$f$unpackFloat1 = 0; bits$iv$iv = (int)(value$iv >> 32L); $i$f$floatFromBits = 0;
/* 338 */     float f1 = Float.intBitsToFloat(bits$iv$iv) + Float.intBitsToFloat(bits$iv$iv); long l1 = arg0; int $i$f$unpackFloat2 = 0;
/* 339 */     int i = (int)(l1 & 0xFFFFFFFFL), j = 0; l1 = other; $i$f$unpackFloat2 = 0; i = (int)(l1 & 0xFFFFFFFFL); j = 0;
/* 340 */     float val2$iv = Float.intBitsToFloat(i) + Float.intBitsToFloat(i); int $i$f$packFloats = 0;
/* 341 */     long v1$iv = Float.floatToRawIntBits(f1);
/* 342 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 343 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); } @Stable public static final long times-tuRUvjQ(long arg0, float operand) { long value$iv = arg0; int $i$f$unpackFloat1 = 0;
/* 344 */     int bits$iv$iv = (int)(value$iv >> 32L), $i$f$floatFromBits = 0;
/* 345 */     float f1 = Float.intBitsToFloat(bits$iv$iv) * operand; long l1 = arg0; int $i$f$unpackFloat2 = 0;
/* 346 */     int i = (int)(l1 & 0xFFFFFFFFL), j = 0;
/* 347 */     float val2$iv = Float.intBitsToFloat(i) * operand; int $i$f$packFloats = 0;
/* 348 */     long v1$iv = Float.floatToRawIntBits(f1);
/* 349 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 350 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); } @Stable public static final long div-tuRUvjQ(long arg0, float operand) { long value$iv = arg0; int $i$f$unpackFloat1 = 0;
/* 351 */     int bits$iv$iv = (int)(value$iv >> 32L), $i$f$floatFromBits = 0;
/* 352 */     float f1 = Float.intBitsToFloat(bits$iv$iv) / operand; long l1 = arg0; int $i$f$unpackFloat2 = 0;
/* 353 */     int i = (int)(l1 & 0xFFFFFFFFL), j = 0;
/* 354 */     float val2$iv = Float.intBitsToFloat(i) / operand; int $i$f$packFloats = 0;
/* 355 */     long v1$iv = Float.floatToRawIntBits(f1);
/* 356 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 357 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); } @Stable public static final long rem-tuRUvjQ(long arg0, float operand) { long value$iv = arg0; int $i$f$unpackFloat1 = 0;
/* 358 */     int bits$iv$iv = (int)(value$iv >> 32L), $i$f$floatFromBits = 0;
/* 359 */     float f1 = Float.intBitsToFloat(bits$iv$iv) % operand; long l1 = arg0; int $i$f$unpackFloat2 = 0;
/* 360 */     int i = (int)(l1 & 0xFFFFFFFFL), j = 0;
/* 361 */     float val2$iv = Float.intBitsToFloat(i) % operand; int $i$f$packFloats = 0;
/* 362 */     long v1$iv = Float.floatToRawIntBits(f1);
/* 363 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 364 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static String toString-impl(long arg0) {
/*     */     return OffsetKt.isSpecified-k-4lQ0M(arg0) ? ("Offset(" + GeometryUtilsKt.toStringAsFixed(getX-impl(arg0), 1) + ", " + GeometryUtilsKt.toStringAsFixed(getY-impl(arg0), 1) + ')') : "Offset.Unspecified";
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return toString-impl(this.packedValue);
/*     */   }
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
/*     */     if (!(other instanceof Offset))
/*     */       return false; 
/*     */     long l = ((Offset)other).unbox-impl();
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


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-geometry-desktop-1.7.3.jar!\androidx\compos\\ui\geometry\Offset.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */