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
/*     */ 
/*     */ @JvmInline
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\002\b\005\n\002\020\007\n\002\b\022\n\002\020\013\n\002\b\004\n\002\020\b\n\002\b\n\n\002\020\016\n\002\b\006\b@\030\000 12\0020\001:\0011B\021\b\000\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\020\032\0020\tH\n¢\006\004\b\021\020\fJ\020\020\022\032\0020\tH\n¢\006\004\b\023\020\fJ'\020\024\032\0020\0002\b\b\002\020\b\032\0020\t2\b\b\002\020\r\032\0020\tø\001\000ø\001\001¢\006\004\b\025\020\026J\036\020\027\032\0020\0002\006\020\030\032\0020\tH\002ø\001\000ø\001\001¢\006\004\b\031\020\032J\032\020\033\032\0020\0342\b\020\035\032\004\030\0010\001HÖ\003¢\006\004\b\036\020\037J\020\020 \032\0020!HÖ\001¢\006\004\b\"\020#J\033\020$\032\0020\0002\006\020\035\032\0020\000H\002ø\001\001¢\006\004\b%\020&J\033\020'\032\0020\0002\006\020\035\032\0020\000H\002ø\001\001¢\006\004\b(\020&J\036\020)\032\0020\0002\006\020\030\032\0020\tH\002ø\001\000ø\001\001¢\006\004\b*\020\032J\017\020+\032\0020,H\026¢\006\004\b-\020.J\026\020/\032\0020\000H\002ø\001\000ø\001\001¢\006\004\b0\020\005R\026\020\002\032\0020\0038\000X\004¢\006\b\n\000\022\004\b\006\020\007R\032\020\b\032\0020\t8FX\004¢\006\f\022\004\b\n\020\007\032\004\b\013\020\fR\032\020\r\032\0020\t8FX\004¢\006\f\022\004\b\016\020\007\032\004\b\017\020\f\001\002\001\0020\003\002\013\n\002\b!\n\005\b¡\0360\001¨\0062"}, d2 = {"Landroidx/compose/ui/geometry/CornerRadius;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue$annotations", "()V", "x", "", "getX$annotations", "getX-impl", "(J)F", "y", "getY$annotations", "getY-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-OHQCggk", "(JFF)J", "div", "operand", "div-Bz7bX_o", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "minus", "minus-vF7b-mM", "(JJ)J", "plus", "plus-vF7b-mM", "times", "times-Bz7bX_o", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-kKHJgLs", "Companion", "ui-geometry"})
/*     */ @Immutable
/*     */ @SourceDebugExtension({"SMAP\nCornerRadius.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,164:1\n72#2:165\n86#2:167\n22#3:166\n22#3:168\n*S KotlinDebug\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n*L\n49#1:165\n53#1:167\n49#1:166\n53#1:168\n*E\n"})
/*     */ public final class CornerRadius
/*     */ {
/*     */   public static final float getX-impl(long arg0) {
/*  49 */     long value$iv = arg0; int $i$f$unpackFloat1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 165 */     int bits$iv$iv = (int)(value$iv >> 32L), $i$f$floatFromBits = 0;
/* 166 */     return Float.intBitsToFloat(bits$iv$iv); } public static final float getY-impl(long arg0) { long value$iv = arg0; int $i$f$unpackFloat2 = 0;
/* 167 */     int bits$iv$iv = (int)(value$iv & 0xFFFFFFFFL), $i$f$floatFromBits = 0;
/* 168 */     return Float.intBitsToFloat(bits$iv$iv); }
/*     */ 
/*     */   
/*     */   @Stable
/*     */   public static final float component1-impl(long arg0) {
/*     */     int $i$f$component1-impl = 0;
/*     */     return getX-impl(arg0);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final float component2-impl(long arg0) {
/*     */     int $i$f$component2-impl = 0;
/*     */     return getY-impl(arg0);
/*     */   }
/*     */   
/*     */   public static final long copy-OHQCggk(long arg0, float x, float y) {
/*     */     return CornerRadiusKt.CornerRadius(x, y);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R$\020\003\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\005\020\002\032\004\b\006\020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006\t"}, d2 = {"Landroidx/compose/ui/geometry/CornerRadius$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/geometry/CornerRadius;", "getZero-kKHJgLs$annotations", "getZero-kKHJgLs", "()J", "J", "ui-geometry"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     public final long getZero-kKHJgLs() {
/*     */       return CornerRadius.Zero;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final long packedValue;
/*     */   private static final long Zero = CornerRadiusKt.CornerRadius$default(0.0F, 0.0F, 2, null);
/*     */   
/*     */   @Stable
/*     */   public static final long unaryMinus-kKHJgLs(long arg0) {
/*     */     return CornerRadiusKt.CornerRadius(-getX-impl(arg0), -getY-impl(arg0));
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final long minus-vF7b-mM(long arg0, long other) {
/*     */     return CornerRadiusKt.CornerRadius(getX-impl(arg0) - getX-impl(other), getY-impl(arg0) - getY-impl(other));
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final long plus-vF7b-mM(long arg0, long other) {
/*     */     return CornerRadiusKt.CornerRadius(getX-impl(arg0) + getX-impl(other), getY-impl(arg0) + getY-impl(other));
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final long times-Bz7bX_o(long arg0, float operand) {
/*     */     return CornerRadiusKt.CornerRadius(getX-impl(arg0) * operand, getY-impl(arg0) * operand);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final long div-Bz7bX_o(long arg0, float operand) {
/*     */     return CornerRadiusKt.CornerRadius(getX-impl(arg0) / operand, getY-impl(arg0) / operand);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return toString-impl(this.packedValue);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static String toString-impl(long arg0) {
/*     */     return ((getX-impl(arg0) == getY-impl(arg0))) ? ("CornerRadius.circular(" + GeometryUtilsKt.toStringAsFixed(getX-impl(arg0), 1) + ')') : ("CornerRadius.elliptical(" + GeometryUtilsKt.toStringAsFixed(getX-impl(arg0), 1) + ", " + GeometryUtilsKt.toStringAsFixed(getY-impl(arg0), 1) + ')');
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
/*     */     if (!(other instanceof CornerRadius))
/*     */       return false; 
/*     */     long l = ((CornerRadius)other).unbox-impl();
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


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-geometry-desktop-1.7.3.jar!\androidx\compos\\ui\geometry\CornerRadius.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */