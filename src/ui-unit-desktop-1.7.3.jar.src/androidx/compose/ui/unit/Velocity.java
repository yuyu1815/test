/*     */ package androidx.compose.ui.unit;
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
/*     */ @JvmInline
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\002\b\003\n\002\020\007\n\002\b\023\n\002\020\013\n\002\b\004\n\002\020\b\n\002\b\f\n\002\020\016\n\002\b\006\b@\030\000 22\0020\001:\0012B\021\b\000\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\017\032\0020\007H\n¢\006\004\b\020\020\013J\020\020\021\032\0020\007H\n¢\006\004\b\022\020\013J'\020\023\032\0020\0002\b\b\002\020\006\032\0020\0072\b\b\002\020\f\032\0020\007ø\001\000ø\001\001¢\006\004\b\024\020\025J\036\020\026\032\0020\0002\006\020\027\032\0020\007H\002ø\001\000ø\001\001¢\006\004\b\030\020\031J\032\020\032\032\0020\0332\b\020\034\032\004\030\0010\001HÖ\003¢\006\004\b\035\020\036J\020\020\037\032\0020 HÖ\001¢\006\004\b!\020\"J\033\020#\032\0020\0002\006\020\034\032\0020\000H\002ø\001\001¢\006\004\b$\020%J\033\020&\032\0020\0002\006\020\034\032\0020\000H\002ø\001\001¢\006\004\b'\020%J\036\020(\032\0020\0002\006\020\027\032\0020\007H\002ø\001\000ø\001\001¢\006\004\b)\020\031J\036\020*\032\0020\0002\006\020\027\032\0020\007H\002ø\001\000ø\001\001¢\006\004\b+\020\031J\017\020,\032\0020-H\026¢\006\004\b.\020/J\026\0200\032\0020\000H\002ø\001\000ø\001\001¢\006\004\b1\020\005R\016\020\002\032\0020\003X\004¢\006\002\n\000R\032\020\006\032\0020\0078FX\004¢\006\f\022\004\b\b\020\t\032\004\b\n\020\013R\032\020\f\032\0020\0078FX\004¢\006\f\022\004\b\r\020\t\032\004\b\016\020\013\001\002\001\0020\003\002\013\n\002\b!\n\005\b¡\0360\001¨\0063"}, d2 = {"Landroidx/compose/ui/unit/Velocity;", "", "packedValue", "", "constructor-impl", "(J)J", "x", "", "getX$annotations", "()V", "getX-impl", "(J)F", "y", "getY$annotations", "getY-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-OhffZ5M", "(JFF)J", "div", "operand", "div-adjELrA", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "minus", "minus-AH228Gc", "(JJ)J", "plus", "plus-AH228Gc", "rem", "rem-adjELrA", "times", "times-adjELrA", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-9UxMQ8M", "Companion", "ui-unit"})
/*     */ @Immutable
/*     */ @SourceDebugExtension({"SMAP\nVelocity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/Velocity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,171:1\n72#2:172\n86#2:174\n63#2,3:176\n72#2:179\n86#2:181\n72#2:182\n86#2:184\n63#2,3:186\n72#2:189\n86#2:191\n63#2,3:193\n72#2:196\n86#2:198\n63#2,3:200\n72#2:203\n86#2:205\n63#2,3:207\n72#2:210\n86#2:212\n63#2,3:214\n22#3:173\n22#3:175\n22#3:180\n22#3:183\n22#3:185\n22#3:190\n22#3:192\n22#3:197\n22#3:199\n22#3:204\n22#3:206\n22#3:211\n22#3:213\n*S KotlinDebug\n*F\n+ 1 Velocity.kt\nandroidx/compose/ui/unit/Velocity\n*L\n46#1:172\n52#1:174\n71#1:176,3\n70#1:179\n70#1:181\n104#1:182\n105#1:184\n103#1:186,3\n119#1:189\n120#1:191\n118#1:193,3\n134#1:196\n135#1:198\n133#1:200,3\n149#1:203\n150#1:205\n148#1:207,3\n164#1:210\n165#1:212\n163#1:214,3\n46#1:173\n52#1:175\n70#1:180\n104#1:183\n105#1:185\n119#1:190\n120#1:192\n134#1:197\n135#1:199\n149#1:204\n150#1:206\n164#1:211\n165#1:213\n*E\n"})
/*     */ public final class Velocity
/*     */ {
/*     */   public static final float getX-impl(long arg0) {
/*  46 */     long value$iv = arg0; int $i$f$unpackFloat1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 172 */     int bits$iv$iv = (int)(value$iv >> 32L), $i$f$floatFromBits = 0;
/* 173 */     return Float.intBitsToFloat(bits$iv$iv); } public static final float getY-impl(long arg0) { long value$iv = arg0; int $i$f$unpackFloat2 = 0;
/* 174 */     int bits$iv$iv = (int)(value$iv & 0xFFFFFFFFL), $i$f$floatFromBits = 0;
/* 175 */     return Float.intBitsToFloat(bits$iv$iv); } @Stable public static final float component1-impl(long arg0) { int $i$f$component1-impl = 0; return getX-impl(arg0); } @Stable public static final float component2-impl(long arg0) { int $i$f$component2-impl = 0; return getY-impl(arg0); }
/* 176 */   public static final long copy-OhffZ5M(long arg0, float x, float y) { int $i$f$packFloats = 0; long v1$iv = Float.floatToRawIntBits(x);
/* 177 */     long v2$iv = Float.floatToRawIntBits(y);
/* 178 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); }
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R$\020\003\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\005\020\002\032\004\b\006\020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006\t"}, d2 = {"Landroidx/compose/ui/unit/Velocity$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/unit/Velocity;", "getZero-9UxMQ8M$annotations", "getZero-9UxMQ8M", "()J", "J", "ui-unit"}) public static final class Companion {
/*     */     private Companion() {} public final long getZero-9UxMQ8M() { return Velocity.Zero; } } @NotNull public static final Companion Companion = new Companion(null); @Stable public static final long minus-AH228Gc(long arg0, long other) { long value$iv = arg0;
/*     */     int $i$f$unpackFloat1 = 0;
/* 182 */     int bits$iv$iv = (int)(value$iv >> 32L), $i$f$floatFromBits = 0; value$iv = other; $i$f$unpackFloat1 = 0; bits$iv$iv = (int)(value$iv >> 32L); $i$f$floatFromBits = 0;
/* 183 */     float f1 = Float.intBitsToFloat(bits$iv$iv) - Float.intBitsToFloat(bits$iv$iv); long l1 = arg0; int $i$f$unpackFloat2 = 0;
/* 184 */     int i = (int)(l1 & 0xFFFFFFFFL), j = 0; l1 = other; $i$f$unpackFloat2 = 0; i = (int)(l1 & 0xFFFFFFFFL); j = 0;
/* 185 */     float val2$iv = Float.intBitsToFloat(i) - Float.intBitsToFloat(i); int $i$f$packFloats = 0;
/* 186 */     long v1$iv = Float.floatToRawIntBits(f1);
/* 187 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 188 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); }
/* 189 */   private final long packedValue; private static final long Zero = constructor-impl(0L); @Stable public static final long unaryMinus-9UxMQ8M(long arg0) { return constructor-impl(arg0 ^ 0x8000000080000000L); } @Stable public static final long plus-AH228Gc(long arg0, long other) { long value$iv = arg0; int $i$f$unpackFloat1 = 0; int bits$iv$iv = (int)(value$iv >> 32L), $i$f$floatFromBits = 0; value$iv = other; $i$f$unpackFloat1 = 0; bits$iv$iv = (int)(value$iv >> 32L); $i$f$floatFromBits = 0;
/* 190 */     float f1 = Float.intBitsToFloat(bits$iv$iv) + Float.intBitsToFloat(bits$iv$iv); long l1 = arg0; int $i$f$unpackFloat2 = 0;
/* 191 */     int i = (int)(l1 & 0xFFFFFFFFL), j = 0; l1 = other; $i$f$unpackFloat2 = 0; i = (int)(l1 & 0xFFFFFFFFL); j = 0;
/* 192 */     float val2$iv = Float.intBitsToFloat(i) + Float.intBitsToFloat(i); int $i$f$packFloats = 0;
/* 193 */     long v1$iv = Float.floatToRawIntBits(f1);
/* 194 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 195 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); } @Stable public static final long times-adjELrA(long arg0, float operand) { long value$iv = arg0; int $i$f$unpackFloat1 = 0;
/* 196 */     int bits$iv$iv = (int)(value$iv >> 32L), $i$f$floatFromBits = 0;
/* 197 */     float f1 = Float.intBitsToFloat(bits$iv$iv) * operand; long l1 = arg0; int $i$f$unpackFloat2 = 0;
/* 198 */     int i = (int)(l1 & 0xFFFFFFFFL), j = 0;
/* 199 */     float val2$iv = Float.intBitsToFloat(i) * operand; int $i$f$packFloats = 0;
/* 200 */     long v1$iv = Float.floatToRawIntBits(f1);
/* 201 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 202 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); } @Stable public static final long div-adjELrA(long arg0, float operand) { long value$iv = arg0; int $i$f$unpackFloat1 = 0;
/* 203 */     int bits$iv$iv = (int)(value$iv >> 32L), $i$f$floatFromBits = 0;
/* 204 */     float f1 = Float.intBitsToFloat(bits$iv$iv) / operand; long l1 = arg0; int $i$f$unpackFloat2 = 0;
/* 205 */     int i = (int)(l1 & 0xFFFFFFFFL), j = 0;
/* 206 */     float val2$iv = Float.intBitsToFloat(i) / operand; int $i$f$packFloats = 0;
/* 207 */     long v1$iv = Float.floatToRawIntBits(f1);
/* 208 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 209 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); } @Stable public static final long rem-adjELrA(long arg0, float operand) { long value$iv = arg0; int $i$f$unpackFloat1 = 0;
/* 210 */     int bits$iv$iv = (int)(value$iv >> 32L), $i$f$floatFromBits = 0;
/* 211 */     float f1 = Float.intBitsToFloat(bits$iv$iv) % operand; long l1 = arg0; int $i$f$unpackFloat2 = 0;
/* 212 */     int i = (int)(l1 & 0xFFFFFFFFL), j = 0;
/* 213 */     float val2$iv = Float.intBitsToFloat(i) % operand; int $i$f$packFloats = 0;
/* 214 */     long v1$iv = Float.floatToRawIntBits(f1);
/* 215 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 216 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static String toString-impl(long arg0) {
/*     */     return '(' + getX-impl(arg0) + ", " + getY-impl(arg0) + ") px/sec";
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
/*     */     if (!(other instanceof Velocity))
/*     */       return false; 
/*     */     long l = ((Velocity)other).unbox-impl();
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


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-unit-desktop-1.7.3.jar!\androidx\compos\\u\\unit\Velocity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */