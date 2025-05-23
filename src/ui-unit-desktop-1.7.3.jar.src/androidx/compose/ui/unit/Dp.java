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
/*     */ @JvmInline
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\017\n\000\n\002\020\007\n\002\b\005\n\002\020\b\n\002\b\t\n\002\020\013\n\002\020\000\n\002\b\f\n\002\020\016\n\002\b\006\b@\030\000 &2\b\022\004\022\0020\0000\001:\001&B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\033\020\b\032\0020\t2\006\020\n\032\0020\000H\002ø\001\000¢\006\004\b\013\020\fJ\033\020\r\032\0020\0032\006\020\n\032\0020\000H\nø\001\000¢\006\004\b\016\020\017J\036\020\r\032\0020\0002\006\020\n\032\0020\003H\nø\001\001ø\001\000¢\006\004\b\020\020\017J\036\020\r\032\0020\0002\006\020\n\032\0020\tH\nø\001\001ø\001\000¢\006\004\b\020\020\021J\032\020\022\032\0020\0232\b\020\n\032\004\030\0010\024HÖ\003¢\006\004\b\025\020\026J\020\020\027\032\0020\tHÖ\001¢\006\004\b\030\020\031J\033\020\032\032\0020\0002\006\020\n\032\0020\000H\nø\001\000¢\006\004\b\033\020\017J\033\020\034\032\0020\0002\006\020\n\032\0020\000H\nø\001\000¢\006\004\b\035\020\017J\036\020\036\032\0020\0002\006\020\n\032\0020\003H\nø\001\001ø\001\000¢\006\004\b\037\020\017J\036\020\036\032\0020\0002\006\020\n\032\0020\tH\nø\001\001ø\001\000¢\006\004\b\037\020\021J\017\020 \032\0020!H\027¢\006\004\b\"\020#J\026\020$\032\0020\000H\nø\001\001ø\001\000¢\006\004\b%\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007\001\002\002\013\n\005\b¡\0360\001\n\002\b!¨\006'"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "", "value", "", "constructor-impl", "(F)F", "getValue", "()F", "compareTo", "", "other", "compareTo-0680j_4", "(FF)I", "div", "div-0680j_4", "(FF)F", "div-u2uoSUM", "(FI)F", "equals", "", "", "equals-impl", "(FLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(F)I", "minus", "minus-5rwHm24", "plus", "plus-5rwHm24", "times", "times-u2uoSUM", "toString", "", "toString-impl", "(F)Ljava/lang/String;", "unaryMinus", "unaryMinus-D9Ej5fM", "Companion", "ui-unit"})
/*     */ @Immutable
/*     */ @SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,577:1\n132#2:578\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n96#1:578\n*E\n"})
/*     */ public final class Dp
/*     */   implements Comparable<Dp>
/*     */ {
/*     */   public final float getValue() {
/*  46 */     return this.value;
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final float plus-5rwHm24(float arg0, float other) {
/*  51 */     int $i$f$plus-5rwHm24 = 0; return constructor-impl(arg0 + other);
/*     */   }
/*     */ 
/*     */   
/*     */   @Stable
/*     */   public static final float minus-5rwHm24(float arg0, float other) {
/*  57 */     int $i$f$minus-5rwHm24 = 0; return constructor-impl(arg0 - other);
/*     */   }
/*     */ 
/*     */   
/*     */   @Stable
/*     */   public static final float unaryMinus-D9Ej5fM(float arg0) {
/*  63 */     int $i$f$unaryMinus-D9Ej5fM = 0; return constructor-impl(-arg0);
/*     */   }
/*     */ 
/*     */   
/*     */   @Stable
/*     */   public static final float div-u2uoSUM(float arg0, float other) {
/*  69 */     int $i$f$div-u2uoSUM = 0; return constructor-impl(arg0 / other);
/*     */   } @Stable
/*     */   public static final float div-u2uoSUM(float arg0, int other) {
/*  72 */     int $i$f$div-u2uoSUM = 0; return constructor-impl(arg0 / other);
/*     */   }
/*     */ 
/*     */   
/*     */   @Stable
/*     */   public static final float div-0680j_4(float arg0, float other) {
/*  78 */     int $i$f$div-0680j_4 = 0; return arg0 / other;
/*     */   }
/*     */ 
/*     */   
/*     */   @Stable
/*     */   public static final float times-u2uoSUM(float arg0, float other) {
/*  84 */     int $i$f$times-u2uoSUM = 0; return constructor-impl(arg0 * other);
/*     */   } @Stable
/*     */   public static final float times-u2uoSUM(float arg0, int other) {
/*  87 */     int $i$f$times-u2uoSUM = 0; return constructor-impl(arg0 * other);
/*     */   }
/*     */ 
/*     */   
/*     */   @Stable
/*     */   public static int compareTo-0680j_4(float arg0, float other) {
/*  93 */     return Float.compare(arg0, other); } @Stable public int compareTo-0680j_4(float other) { return compareTo-0680j_4(this.value, other); } @Stable
/*     */   @NotNull
/*     */   public static String toString-impl(float arg0) {
/*  96 */     float $this$isUnspecified$iv = arg0; int $i$f$isUnspecified-0680j_4 = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 578 */       Float.isNaN($this$isUnspecified$iv) ? "Dp.Unspecified" : (arg0 + ".dp");
/*     */   }
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return toString-impl(this.value);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\013\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R$\020\003\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\005\020\002\032\004\b\006\020\007R$\020\t\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\n\020\002\032\004\b\013\020\007R$\020\f\032\0020\0048\006X\004ø\001\000ø\001\001¢\006\020\n\002\020\b\022\004\b\r\020\002\032\004\b\016\020\007\002\013\n\005\b¡\0360\001\n\002\b!¨\006\017"}, d2 = {"Landroidx/compose/ui/unit/Dp$Companion;", "", "()V", "Hairline", "Landroidx/compose/ui/unit/Dp;", "getHairline-D9Ej5fM$annotations", "getHairline-D9Ej5fM", "()F", "F", "Infinity", "getInfinity-D9Ej5fM$annotations", "getInfinity-D9Ej5fM", "Unspecified", "getUnspecified-D9Ej5fM$annotations", "getUnspecified-D9Ej5fM", "ui-unit"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     public final float getHairline-D9Ej5fM() {
/*     */       return Dp.Hairline;
/*     */     }
/*     */     
/*     */     public final float getInfinity-D9Ej5fM() {
/*     */       return Dp.Infinity;
/*     */     }
/*     */     
/*     */     public final float getUnspecified-D9Ej5fM() {
/*     */       return Dp.Unspecified;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final float value;
/*     */   private static final float Hairline = constructor-impl(0.0F);
/*     */   private static final float Infinity = constructor-impl(Float.POSITIVE_INFINITY);
/*     */   private static final float Unspecified = constructor-impl(Float.NaN);
/*     */   
/*     */   public static int hashCode-impl(float arg0) {
/*     */     return Float.hashCode(arg0);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return hashCode-impl(this.value);
/*     */   }
/*     */   
/*     */   public static boolean equals-impl(float arg0, Object other) {
/*     */     if (!(other instanceof Dp))
/*     */       return false; 
/*     */     float f = ((Dp)other).unbox-impl();
/*     */     return !(Float.compare(arg0, f) != 0);
/*     */   }
/*     */   
/*     */   public boolean equals(Object other) {
/*     */     return equals-impl(this.value, other);
/*     */   }
/*     */   
/*     */   public static float constructor-impl(float value) {
/*     */     return value;
/*     */   }
/*     */   
/*     */   public static final boolean equals-impl0(float p1, float p2) {
/*     */     return (Float.compare(p1, p2) == 0);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-unit-desktop-1.7.3.jar!\androidx\compos\\u\\unit\Dp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */