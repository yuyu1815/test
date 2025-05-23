/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.TuplesKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\t\032,\020\000\032\016\022\004\022\0020\002\022\004\022\0020\0020\0012\006\020\003\032\0020\0042\006\020\005\032\0020\0042\006\020\006\032\0020\004H\000\032\020\020\007\032\0020\0022\006\020\b\032\0020\004H\000\032\025\020\t\032\0020\002*\0020\0042\006\020\n\032\0020\002H\n\032\025\020\013\032\0020\002*\0020\0042\006\020\n\032\0020\002H\n\032\025\020\f\032\0020\002*\0020\0042\006\020\n\032\0020\002H\n¨\006\r"}, d2 = {"complexQuadraticFormula", "Lkotlin/Pair;", "Landroidx/compose/animation/core/ComplexDouble;", "a", "", "b", "c", "complexSqrt", "num", "minus", "other", "plus", "times", "animation-core"})
/*     */ @SourceDebugExtension({"SMAP\nComplexDouble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n+ 2 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,113:1\n103#1:114\n107#1:120\n103#1:124\n103#1:135\n35#2,2:115\n54#2,3:117\n66#2,3:121\n35#2,2:125\n54#2,3:127\n35#2,2:130\n66#2,3:132\n35#2,2:136\n54#2,3:138\n*S KotlinDebug\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n*L\n88#1:114\n89#1:120\n89#1:124\n107#1:135\n88#1:115,2\n88#1:117,3\n89#1:121,3\n89#1:125,2\n89#1:127,3\n103#1:130,2\n107#1:132,3\n107#1:136,2\n111#1:138,3\n*E\n"})
/*     */ public final class ComplexDoubleKt
/*     */ {
/*     */   @NotNull
/*     */   public static final ComplexDouble complexSqrt(double num) {
/*     */     return (num < 0.0D) ? new ComplexDouble(0.0D, Math.sqrt(Math.abs(num))) : new ComplexDouble(Math.sqrt(num), 0.0D);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Pair<ComplexDouble, ComplexDouble> complexQuadraticFormula(double a, double b, double c) {
/*  86 */     double partialRoot = b * b - 4.0D * a * c;
/*  87 */     double divisor = 1.0D / 2.0D * a;
/*  88 */     double d1 = -b; ComplexDouble other$iv = complexSqrt(partialRoot); int $i$f$plus = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 114 */     ComplexDouble this_$iv$iv = other$iv; int j = 0;
/* 115 */     ComplexDouble.access$set_real$p(this_$iv$iv, ComplexDouble.access$get_real$p(this_$iv$iv) + d1);
/* 116 */     ComplexDouble complexDouble1 = this_$iv$iv; int $i$f$times = 0;
/* 117 */     ComplexDouble.access$set_real$p(complexDouble1, ComplexDouble.access$get_real$p(complexDouble1) * divisor);
/* 118 */     ComplexDouble.access$set_imaginary$p(complexDouble1, ComplexDouble.access$get_imaginary$p(complexDouble1) * divisor);
/* 119 */     ComplexDouble firstRoot = complexDouble1; double d2 = -b; ComplexDouble complexDouble3 = complexSqrt(partialRoot); int $i$f$minus = 0;
/* 120 */     double d3 = d2; ComplexDouble complexDouble4 = complexDouble3; int $i$f$unaryMinus = 0;
/* 121 */     ComplexDouble.access$set_real$p(complexDouble4, ComplexDouble.access$get_real$p(complexDouble4) * -1);
/* 122 */     ComplexDouble.access$set_imaginary$p(complexDouble4, ComplexDouble.access$get_imaginary$p(complexDouble4) * -1);
/* 123 */     complexDouble4 = complexDouble4; int k = 0;
/* 124 */     ComplexDouble this_$iv$iv$iv = complexDouble4; int m = 0;
/* 125 */     ComplexDouble.access$set_real$p(this_$iv$iv$iv, ComplexDouble.access$get_real$p(this_$iv$iv$iv) + d3);
/* 126 */     ComplexDouble complexDouble2 = this_$iv$iv$iv; int i = 0;
/* 127 */     ComplexDouble.access$set_real$p(complexDouble2, ComplexDouble.access$get_real$p(complexDouble2) * divisor);
/* 128 */     ComplexDouble.access$set_imaginary$p(complexDouble2, ComplexDouble.access$get_imaginary$p(complexDouble2) * divisor);
/* 129 */     ComplexDouble secondRoot = complexDouble2; return TuplesKt.to(firstRoot, secondRoot); } @NotNull public static final ComplexDouble plus(double $this$plus, @NotNull ComplexDouble other) { Intrinsics.checkNotNullParameter(other, "other"); int $i$f$plus = 0; ComplexDouble this_$iv = other; int i = 0;
/* 130 */     ComplexDouble.access$set_real$p(this_$iv, ComplexDouble.access$get_real$p(this_$iv) + $this$plus);
/* 131 */     return this_$iv; } @NotNull public static final ComplexDouble minus(double $this$minus, @NotNull ComplexDouble other) { Intrinsics.checkNotNullParameter(other, "other"); int $i$f$minus = 0; double d = $this$minus; ComplexDouble this_$iv = other; int $i$f$unaryMinus = 0;
/* 132 */     ComplexDouble.access$set_real$p(this_$iv, ComplexDouble.access$get_real$p(this_$iv) * -1);
/* 133 */     ComplexDouble.access$set_imaginary$p(this_$iv, ComplexDouble.access$get_imaginary$p(this_$iv) * -1);
/* 134 */     this_$iv = this_$iv; int $i$f$plus = 0;
/* 135 */     ComplexDouble this_$iv$iv = this_$iv; int i = 0;
/* 136 */     ComplexDouble.access$set_real$p(this_$iv$iv, ComplexDouble.access$get_real$p(this_$iv$iv) + d);
/* 137 */     return this_$iv$iv; } @NotNull public static final ComplexDouble times(double $this$times, @NotNull ComplexDouble other) { Intrinsics.checkNotNullParameter(other, "other"); int $i$f$times = 0; ComplexDouble this_$iv = other; int i = 0;
/* 138 */     ComplexDouble.access$set_real$p(this_$iv, ComplexDouble.access$get_real$p(this_$iv) * $this$times);
/* 139 */     ComplexDouble.access$set_imaginary$p(this_$iv, ComplexDouble.access$get_imaginary$p(this_$iv) * $this$times);
/* 140 */     return this_$iv; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\ComplexDoubleKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */