/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.ui.graphics.BezierKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\020\007\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\002\n\002\b\002\n\002\020\016\n\002\b\002\b\007\030\0002\0020\001B%\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003¢\006\002\020\007J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rH\002J\b\020\016\032\0020\017H\026J\020\020\020\032\0020\0212\006\020\022\032\0020\003H\002J\b\020\023\032\0020\024H\026J\020\020\025\032\0020\0032\006\020\022\032\0020\003H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\003X\004¢\006\002\n\000R\016\020\005\032\0020\003X\004¢\006\002\n\000R\016\020\006\032\0020\003X\004¢\006\002\n\000R\016\020\b\032\0020\003X\004¢\006\002\n\000R\016\020\t\032\0020\003X\004¢\006\002\n\000¨\006\026"}, d2 = {"Landroidx/compose/animation/core/CubicBezierEasing;", "Landroidx/compose/animation/core/Easing;", "a", "", "b", "c", "d", "(FFFF)V", "max", "min", "equals", "", "other", "", "hashCode", "", "throwNoSolution", "", "fraction", "toString", "", "transform", "animation-core"})
/*     */ @Immutable
/*     */ @SourceDebugExtension({"SMAP\nEasing.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Easing.kt\nandroidx/compose/animation/core/CubicBezierEasing\n+ 2 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 3 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 4 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n+ 5 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,172:1\n33#2,7:173\n48#3:180\n54#3:182\n22#4:181\n22#4:183\n71#5,16:184\n*S KotlinDebug\n*F\n+ 1 Easing.kt\nandroidx/compose/animation/core/CubicBezierEasing\n*L\n115#1:173,7\n120#1:180\n121#1:182\n120#1:181\n121#1:183\n149#1:184,16\n*E\n"})
/*     */ public final class CubicBezierEasing
/*     */   implements Easing
/*     */ {
/*     */   private final float a;
/*     */   private final float b;
/*     */   private final float c;
/*     */   private final float d;
/*     */   private final float min;
/*     */   private final float max;
/*     */   public static final int $stable;
/*     */   
/*     */   public CubicBezierEasing(float a, float b, float c, float d) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial <init> : ()V
/*     */     //   4: aload_0
/*     */     //   5: fload_1
/*     */     //   6: putfield a : F
/*     */     //   9: aload_0
/*     */     //   10: fload_2
/*     */     //   11: putfield b : F
/*     */     //   14: aload_0
/*     */     //   15: fload_3
/*     */     //   16: putfield c : F
/*     */     //   19: aload_0
/*     */     //   20: fload #4
/*     */     //   22: putfield d : F
/*     */     //   25: nop
/*     */     //   26: aload_0
/*     */     //   27: getfield a : F
/*     */     //   30: invokestatic isNaN : (F)Z
/*     */     //   33: ifne -> 70
/*     */     //   36: aload_0
/*     */     //   37: getfield b : F
/*     */     //   40: invokestatic isNaN : (F)Z
/*     */     //   43: ifne -> 70
/*     */     //   46: aload_0
/*     */     //   47: getfield c : F
/*     */     //   50: invokestatic isNaN : (F)Z
/*     */     //   53: ifne -> 70
/*     */     //   56: aload_0
/*     */     //   57: getfield d : F
/*     */     //   60: invokestatic isNaN : (F)Z
/*     */     //   63: ifne -> 70
/*     */     //   66: iconst_1
/*     */     //   67: goto -> 71
/*     */     //   70: iconst_0
/*     */     //   71: istore #5
/*     */     //   73: nop
/*     */     //   74: iconst_0
/*     */     //   75: istore #6
/*     */     //   77: nop
/*     */     //   78: iload #5
/*     */     //   80: ifne -> 152
/*     */     //   83: iconst_0
/*     */     //   84: istore #7
/*     */     //   86: new java/lang/StringBuilder
/*     */     //   89: dup
/*     */     //   90: invokespecial <init> : ()V
/*     */     //   93: ldc 'Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: '
/*     */     //   95: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   98: aload_0
/*     */     //   99: getfield a : F
/*     */     //   102: invokevirtual append : (F)Ljava/lang/StringBuilder;
/*     */     //   105: ldc ', '
/*     */     //   107: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   110: aload_0
/*     */     //   111: getfield b : F
/*     */     //   114: invokevirtual append : (F)Ljava/lang/StringBuilder;
/*     */     //   117: ldc ', '
/*     */     //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   122: aload_0
/*     */     //   123: getfield c : F
/*     */     //   126: invokevirtual append : (F)Ljava/lang/StringBuilder;
/*     */     //   129: ldc ', '
/*     */     //   131: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   134: aload_0
/*     */     //   135: getfield d : F
/*     */     //   138: invokevirtual append : (F)Ljava/lang/StringBuilder;
/*     */     //   141: bipush #46
/*     */     //   143: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   146: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   149: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*     */     //   152: nop
/*     */     //   153: iconst_5
/*     */     //   154: newarray float
/*     */     //   156: astore #5
/*     */     //   158: fconst_0
/*     */     //   159: aload_0
/*     */     //   160: getfield b : F
/*     */     //   163: aload_0
/*     */     //   164: getfield d : F
/*     */     //   167: fconst_1
/*     */     //   168: aload #5
/*     */     //   170: iconst_0
/*     */     //   171: invokestatic computeCubicVerticalBounds : (FFFF[FI)J
/*     */     //   174: lstore #6
/*     */     //   176: aload_0
/*     */     //   177: iconst_0
/*     */     //   178: istore #8
/*     */     //   180: lload #6
/*     */     //   182: bipush #32
/*     */     //   184: lshr
/*     */     //   185: l2i
/*     */     //   186: istore #9
/*     */     //   188: iconst_0
/*     */     //   189: istore #10
/*     */     //   191: iload #9
/*     */     //   193: invokestatic intBitsToFloat : (I)F
/*     */     //   196: nop
/*     */     //   197: putfield min : F
/*     */     //   200: aload_0
/*     */     //   201: iconst_0
/*     */     //   202: istore #8
/*     */     //   204: lload #6
/*     */     //   206: ldc2_w 4294967295
/*     */     //   209: land
/*     */     //   210: l2i
/*     */     //   211: istore #9
/*     */     //   213: iconst_0
/*     */     //   214: istore #10
/*     */     //   216: iload #9
/*     */     //   218: invokestatic intBitsToFloat : (I)F
/*     */     //   221: nop
/*     */     //   222: putfield max : F
/*     */     //   225: nop
/*     */     //   226: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #104	-> 0
/*     */     //   #106	-> 4
/*     */     //   #107	-> 9
/*     */     //   #108	-> 14
/*     */     //   #109	-> 19
/*     */     //   #114	-> 25
/*     */     //   #115	-> 26
/*     */     //   #115	-> 36
/*     */     //   #115	-> 46
/*     */     //   #115	-> 56
/*     */     //   #115	-> 73
/*     */     //   #173	-> 77
/*     */     //   #176	-> 78
/*     */     //   #177	-> 83
/*     */     //   #116	-> 86
/*     */     //   #177	-> 149
/*     */     //   #179	-> 152
/*     */     //   #118	-> 153
/*     */     //   #119	-> 158
/*     */     //   #120	-> 176
/*     */     //   #180	-> 180
/*     */     //   #181	-> 191
/*     */     //   #180	-> 196
/*     */     //   #120	-> 197
/*     */     //   #121	-> 200
/*     */     //   #182	-> 204
/*     */     //   #183	-> 216
/*     */     //   #182	-> 221
/*     */     //   #121	-> 222
/*     */     //   #122	-> 225
/*     */     //   #105	-> 226
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   86	63	7	$i$a$-requirePrecondition-CubicBezierEasing$1	I
/*     */     //   77	76	6	$i$f$requirePrecondition	I
/*     */     //   74	79	5	value$iv	Z
/*     */     //   191	5	10	$i$f$floatFromBits	I
/*     */     //   188	8	9	bits$iv$iv	I
/*     */     //   180	17	8	$i$f$getFirst-impl	I
/*     */     //   216	5	10	$i$f$floatFromBits	I
/*     */     //   213	8	9	bits$iv$iv	I
/*     */     //   204	18	8	$i$f$getSecond-impl	I
/*     */     //   158	67	5	roots	[F
/*     */     //   176	49	6	extrema	J
/*     */     //   0	227	0	this	Landroidx/compose/animation/core/CubicBezierEasing;
/*     */     //   0	227	1	a	F
/*     */     //   0	227	2	b	F
/*     */     //   0	227	3	c	F
/*     */     //   0	227	4	d	F
/*     */   }
/*     */   
/*     */   public float transform(float fraction) {
/* 134 */     float t = BezierKt.findFirstCubicRoot(
/* 135 */         0.0F - fraction, 
/* 136 */         this.a - fraction, 
/* 137 */         this.c - fraction, 
/* 138 */         1.0F - fraction);
/*     */ 
/*     */ 
/*     */     
/* 142 */     if (Float.isNaN(t)) {
/* 143 */       throwNoSolution(fraction);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 149 */     float f1 = BezierKt.evaluateCubic(this.b, this.d, t), f2 = this.min, maximumValue$iv = this.max; int $i$f$fastCoerceIn = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 184 */     float $this$fastCoerceAtLeast$iv$iv = f1; int $i$f$fastCoerceAtLeast = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 191 */     float $this$fastCoerceAtMost$iv$iv = ($this$fastCoerceAtLeast$iv$iv < f2) ? f2 : $this$fastCoerceAtLeast$iv$iv;
/*     */ 
/*     */ 
/*     */     
/*     */     int $i$f$fastCoerceAtMost = 0;
/*     */ 
/*     */ 
/*     */     
/* 199 */     return (fraction > 0.0F && fraction < 1.0F) ? (($this$fastCoerceAtMost$iv$iv > maximumValue$iv) ? maximumValue$iv : $this$fastCoerceAtMost$iv$iv) : fraction;
/*     */   }
/*     */   
/*     */   private final void throwNoSolution(float fraction) {
/*     */     throw new IllegalArgumentException("The cubic curve with parameters (" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ") has no solution at " + fraction);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     return (other instanceof CubicBezierEasing && ((this.a == ((CubicBezierEasing)other).a)) && ((this.b == ((CubicBezierEasing)other).b)) && ((this.c == ((CubicBezierEasing)other).c)) && ((this.d == ((CubicBezierEasing)other).d)));
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return ((Float.hashCode(this.a) * 31 + Float.hashCode(this.b)) * 31 + Float.hashCode(this.c)) * 31 + Float.hashCode(this.d);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "CubicBezierEasing(a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ')';
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\CubicBezierEasing.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */