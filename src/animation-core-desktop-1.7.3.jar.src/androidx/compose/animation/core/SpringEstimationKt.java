/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.annotation.RestrictTo;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\0000\n\000\n\002\020\t\n\002\b\002\n\002\020\006\n\002\b\007\n\002\020\007\n\002\b\002\n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\002\n\002\020\013\n\000\0320\020\002\032\0020\0012\006\020\003\032\0020\0042\006\020\005\032\0020\0042\006\020\006\032\0020\0042\006\020\007\032\0020\0042\006\020\b\032\0020\004H\007\0328\020\002\032\0020\0012\006\020\t\032\0020\0042\006\020\n\032\0020\0042\006\020\013\032\0020\0042\006\020\006\032\0020\0042\006\020\007\032\0020\0042\006\020\b\032\0020\004H\007\0320\020\002\032\0020\0012\006\020\003\032\0020\f2\006\020\005\032\0020\f2\006\020\006\032\0020\f2\006\020\007\032\0020\f2\006\020\b\032\0020\fH\007\032(\020\r\032\0020\0042\006\020\016\032\0020\0172\006\020\020\032\0020\0042\006\020\021\032\0020\0042\006\020\b\032\0020\004H\002\0328\020\022\032\0020\0012\006\020\016\032\0020\0172\006\020\023\032\0020\0172\006\020\005\032\0020\0042\006\020\006\032\0020\0042\006\020\024\032\0020\0042\006\020\b\032\0020\004H\002\0320\020\025\032\0020\0042\006\020\016\032\0020\0172\006\020\023\032\0020\0172\006\020\020\032\0020\0042\006\020\021\032\0020\0042\006\020\b\032\0020\004H\002\032(\020\026\032\0020\0042\006\020\016\032\0020\0172\006\020\020\032\0020\0042\006\020\021\032\0020\0042\006\020\b\032\0020\004H\002\0329\020\027\032\0020\0042\006\020\030\032\0020\0042\022\020\031\032\016\022\004\022\0020\004\022\004\022\0020\0040\0322\022\020\033\032\016\022\004\022\0020\004\022\004\022\0020\0040\032H\b\032\r\020\034\032\0020\035*\0020\004H\b\"\016\020\000\032\0020\001XT¢\006\002\n\000¨\006\036"}, d2 = {"MAX_LONG_MILLIS", "", "estimateAnimationDurationMillis", "stiffness", "", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "springConstant", "dampingCoefficient", "mass", "", "estimateCriticallyDamped", "firstRoot", "Landroidx/compose/animation/core/ComplexDouble;", "p0", "v0", "estimateDurationInternal", "secondRoot", "initialPosition", "estimateOverDamped", "estimateUnderDamped", "iterateNewtonsMethod", "x", "fn", "Lkotlin/Function1;", "fnPrime", "isNotFinite", "", "animation-core"})
/*     */ @SourceDebugExtension({"SMAP\nSpringEstimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n+ 2 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n+ 3 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,343:1\n342#1:376\n342#1:377\n338#1:378\n342#1:379\n342#1:380\n338#1:381\n103#2:344\n107#2:350\n103#2:354\n103#2:360\n107#2:366\n103#2:370\n35#3,2:345\n54#3,3:347\n66#3,3:351\n35#3,2:355\n54#3,3:357\n35#3,2:361\n54#3,3:363\n66#3,3:367\n35#3,2:371\n54#3,3:373\n*S KotlinDebug\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n*L\n164#1:376\n165#1:377\n203#1:378\n236#1:379\n237#1:380\n280#1:381\n74#1:344\n75#1:350\n75#1:354\n105#1:360\n106#1:366\n106#1:370\n74#1:345,2\n74#1:347,3\n75#1:351,3\n75#1:355,2\n75#1:357,3\n105#1:361,2\n105#1:363,3\n106#1:367,3\n106#1:371,2\n106#1:373,3\n*E\n"})
/*     */ public final class SpringEstimationKt
/*     */ {
/*     */   private static final long MAX_LONG_MILLIS = 9223372036854L;
/*     */   
/*     */   @RestrictTo({RestrictTo.Scope.LIBRARY})
/*     */   public static final long estimateAnimationDurationMillis(float stiffness, float dampingRatio, float initialVelocity, float initialDisplacement, float delta) {
/*  44 */     if ((dampingRatio == 0.0F))
/*     */     {
/*  46 */       return 9223372036854L;
/*     */     }
/*     */     
/*  49 */     return estimateAnimationDurationMillis(
/*  50 */         stiffness, 
/*  51 */         dampingRatio, 
/*  52 */         initialVelocity, 
/*  53 */         initialDisplacement, 
/*  54 */         delta);
/*     */   }
/*     */ 
/*     */   
/*     */   private static final double estimateUnderDamped(ComplexDouble firstRoot, double p0, double v0, double delta) {
/*     */     double r = firstRoot.getReal();
/*     */     double c1 = p0;
/*     */     double c2 = (v0 - r * c1) / firstRoot.getImaginary();
/*     */     double c = Math.sqrt(c1 * c1 + c2 * c2);
/*     */     return Math.log(delta / c) / r;
/*     */   }
/*     */ 
/*     */   
/*     */   @RestrictTo({RestrictTo.Scope.LIBRARY})
/*     */   public static final long estimateAnimationDurationMillis(double stiffness, double dampingRatio, double initialVelocity, double initialDisplacement, double delta) {
/*  69 */     double dampingCoefficient = 2.0D * dampingRatio * Math.sqrt(stiffness);
/*     */ 
/*     */ 
/*     */     
/*  73 */     double partialRoot = dampingCoefficient * dampingCoefficient - 4.0D * stiffness;
/*  74 */     double d1 = -dampingCoefficient; ComplexDouble complexDouble3 = ComplexDoubleKt.complexSqrt(partialRoot); int $i$f$plus = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 344 */     ComplexDouble this_$iv$iv = complexDouble3; int j = 0;
/* 345 */     ComplexDouble.access$set_real$p(this_$iv$iv, ComplexDouble.access$get_real$p(this_$iv$iv) + d1);
/* 346 */     ComplexDouble complexDouble1 = this_$iv$iv; double other$iv = 0.5D; int $i$f$times = 0;
/* 347 */     ComplexDouble.access$set_real$p(complexDouble1, ComplexDouble.access$get_real$p(complexDouble1) * other$iv);
/* 348 */     ComplexDouble.access$set_imaginary$p(complexDouble1, ComplexDouble.access$get_imaginary$p(complexDouble1) * other$iv);
/* 349 */     ComplexDouble firstRoot = complexDouble1; other$iv = -dampingCoefficient; ComplexDouble complexDouble4 = ComplexDoubleKt.complexSqrt(partialRoot); int $i$f$minus = 0;
/* 350 */     double d3 = other$iv; ComplexDouble complexDouble5 = complexDouble4; int $i$f$unaryMinus = 0;
/* 351 */     ComplexDouble.access$set_real$p(complexDouble5, ComplexDouble.access$get_real$p(complexDouble5) * -1);
/* 352 */     ComplexDouble.access$set_imaginary$p(complexDouble5, ComplexDouble.access$get_imaginary$p(complexDouble5) * -1);
/* 353 */     complexDouble5 = complexDouble5; int k = 0;
/* 354 */     ComplexDouble this_$iv$iv$iv = complexDouble5; int m = 0;
/* 355 */     ComplexDouble.access$set_real$p(this_$iv$iv$iv, ComplexDouble.access$get_real$p(this_$iv$iv$iv) + d3);
/* 356 */     ComplexDouble complexDouble2 = this_$iv$iv$iv; double d2 = 0.5D; int i = 0;
/* 357 */     ComplexDouble.access$set_real$p(complexDouble2, ComplexDouble.access$get_real$p(complexDouble2) * d2);
/* 358 */     ComplexDouble.access$set_imaginary$p(complexDouble2, ComplexDouble.access$get_imaginary$p(complexDouble2) * d2);
/* 359 */     ComplexDouble secondRoot = complexDouble2; return estimateDurationInternal(firstRoot, secondRoot, dampingRatio, initialVelocity, initialDisplacement, delta); } @RestrictTo({RestrictTo.Scope.LIBRARY}) public static final long estimateAnimationDurationMillis(double springConstant, double dampingCoefficient, double mass, double initialVelocity, double initialDisplacement, double delta) { double criticalDamping = 2.0D * Math.sqrt(springConstant * mass); double dampingRatio = dampingCoefficient / criticalDamping; double partialRoot = dampingCoefficient * dampingCoefficient - 4.0D * mass * springConstant; double divisor = 1.0D / 2.0D * mass; double d1 = -dampingCoefficient; ComplexDouble other$iv = ComplexDoubleKt.complexSqrt(partialRoot); int $i$f$plus = 0;
/* 360 */     ComplexDouble this_$iv$iv = other$iv; int j = 0;
/* 361 */     ComplexDouble.access$set_real$p(this_$iv$iv, ComplexDouble.access$get_real$p(this_$iv$iv) + d1);
/* 362 */     ComplexDouble complexDouble1 = this_$iv$iv; int $i$f$times = 0;
/* 363 */     ComplexDouble.access$set_real$p(complexDouble1, ComplexDouble.access$get_real$p(complexDouble1) * divisor);
/* 364 */     ComplexDouble.access$set_imaginary$p(complexDouble1, ComplexDouble.access$get_imaginary$p(complexDouble1) * divisor);
/* 365 */     ComplexDouble firstRoot = complexDouble1; double d2 = -dampingCoefficient; ComplexDouble complexDouble3 = ComplexDoubleKt.complexSqrt(partialRoot); int $i$f$minus = 0;
/* 366 */     double d3 = d2; ComplexDouble complexDouble4 = complexDouble3; int $i$f$unaryMinus = 0;
/* 367 */     ComplexDouble.access$set_real$p(complexDouble4, ComplexDouble.access$get_real$p(complexDouble4) * -1);
/* 368 */     ComplexDouble.access$set_imaginary$p(complexDouble4, ComplexDouble.access$get_imaginary$p(complexDouble4) * -1);
/* 369 */     complexDouble4 = complexDouble4; int k = 0;
/* 370 */     ComplexDouble this_$iv$iv$iv = complexDouble4; int m = 0;
/* 371 */     ComplexDouble.access$set_real$p(this_$iv$iv$iv, ComplexDouble.access$get_real$p(this_$iv$iv$iv) + d3);
/* 372 */     ComplexDouble complexDouble2 = this_$iv$iv$iv; int i = 0;
/* 373 */     ComplexDouble.access$set_real$p(complexDouble2, ComplexDouble.access$get_real$p(complexDouble2) * divisor);
/* 374 */     ComplexDouble.access$set_imaginary$p(complexDouble2, ComplexDouble.access$get_imaginary$p(complexDouble2) * divisor);
/* 375 */     ComplexDouble secondRoot = complexDouble2; return estimateDurationInternal(firstRoot, secondRoot, dampingRatio, initialVelocity, initialDisplacement, delta); } private static final double estimateCriticallyDamped(ComplexDouble firstRoot, double p0, double v0, double delta) { double r = firstRoot.getReal(); double c1 = p0; double c2 = v0 - r * c1; double t1 = Math.log(Math.abs(delta / c1)) / r; int $i$a$-run-SpringEstimationKt$estimateCriticallyDamped$t2$1 = 0; double guess = Math.log(Math.abs(delta / c2)); double t = guess; for (int i = 0; i < 6; i++)
/* 376 */       t = guess - Math.log(Math.abs(t / r));  double t2 = t / r; double $this$isNotFinite$iv = t1; int $i$f$isNotFinite = 0; double d1 = $this$isNotFinite$iv; $this$isNotFinite$iv = t2; $i$f$isNotFinite = 0;
/* 377 */     d1 = $this$isNotFinite$iv; double tCurr = (!((!Double.isInfinite(d1) && !Double.isNaN(d1)) ? 1 : 0)) ? t2 : ((!((!Double.isInfinite(d1) && !Double.isNaN(d1)) ? 1 : 0)) ? t1 : Math.max(t1, t2)); double tInflection = -(r * c1 + c2) / r * c2; double xInflection = c1 * Math.exp(r * tInflection) + c2 * tInflection * Math.exp(r * tInflection); if (c2 < 0.0D && c1 > 0.0D)
/* 378 */       tCurr = 0.0D;  double tConcavChange = -(2.0D / r) - c1 / c2; tCurr = tConcavChange; double signedDelta = (Double.isNaN(tInflection) || tInflection <= 0.0D) ? -delta : ((tInflection > 0.0D && -xInflection < delta) ? -delta : delta); double tDelta = Double.MAX_VALUE; int iterations = 0; while (tDelta > 0.001D && iterations < 100) { iterations++; double tLast = tCurr; int $i$f$iterateNewtonsMethod = 0; double d3 = tCurr, d4 = tCurr; int $i$a$-iterateNewtonsMethod-SpringEstimationKt$estimateCriticallyDamped$1 = 0; double d5 = (c1 + c2 * d3) * Math.exp(r * d3) + signedDelta; double d2 = tCurr; d5 = d5; d4 = d4; int $i$a$-iterateNewtonsMethod-SpringEstimationKt$estimateCriticallyDamped$2 = 0; double d6 = (c2 * (r * d2 + true) + c1 * r) * Math.exp(r * d2); tCurr = d4 - d5 / d6; tDelta = Math.abs(tLast - tCurr); }
/* 379 */      return tCurr; } private static final double estimateOverDamped(ComplexDouble firstRoot, ComplexDouble secondRoot, double p0, double v0, double delta) { double r1 = firstRoot.getReal(); double r2 = secondRoot.getReal(); double c2 = (r1 * p0 - v0) / (r1 - r2); double c1 = p0 - c2; double t1 = Math.log(Math.abs(delta / c1)) / r1; double t2 = Math.log(Math.abs(delta / c2)) / r2; double $this$isNotFinite$iv = t1; int $i$f$isNotFinite = 0; double d1 = $this$isNotFinite$iv; $this$isNotFinite$iv = t2; $i$f$isNotFinite = 0;
/* 380 */     d1 = $this$isNotFinite$iv; double tCurr = (!((!Double.isInfinite(d1) && !Double.isNaN(d1)) ? 1 : 0)) ? t2 : ((!((!Double.isInfinite(d1) && !Double.isNaN(d1)) ? 1 : 0)) ? t1 : Math.max(t1, t2)); double tInflection = Math.log(c1 * r1 / -c2 * r2) / (r2 - r1); if (c2 > 0.0D && c1 < 0.0D) tCurr = 0.0D;  tCurr = Math.log(-(c2 * r2 * r2) / c1 * r1 * r1) / (r1 - r2); double signedDelta = (Double.isNaN(tInflection) || tInflection <= 0.0D) ? -delta : ((tInflection > 0.0D && -estimateOverDamped$xInflection(c1, r1, tInflection, c2, r2) < delta) ? -delta : delta); if (Math.abs(c1 * r1 * Math.exp(r1 * tCurr) + c2 * r2 * Math.exp(r2 * tCurr)) < 1.0E-4D)
/* 381 */       return tCurr;  double tDelta = Double.MAX_VALUE; int iterations = 0; while (tDelta > 0.001D && iterations < 100) { iterations++; double tLast = tCurr; int $i$f$iterateNewtonsMethod = 0; double d2 = tCurr, d3 = tCurr; int $i$a$-iterateNewtonsMethod-SpringEstimationKt$estimateOverDamped$1 = 0; double d4 = c1 * Math.exp(r1 * d2) + c2 * Math.exp(r2 * d2) + signedDelta; double t = tCurr; d4 = d4; d3 = d3; int $i$a$-iterateNewtonsMethod-SpringEstimationKt$estimateOverDamped$2 = 0;
/*     */       double d5 = c1 * r1 * Math.exp(r1 * t) + c2 * r2 * Math.exp(r2 * t);
/*     */       tCurr = d3 - d4 / d5;
/*     */       tDelta = Math.abs(tLast - tCurr); }
/*     */     
/*     */     return tCurr; }
/*     */ 
/*     */   
/*     */   private static final double estimateOverDamped$xInflection(double c1, double r1, double tInflection, double c2, double r2) {
/*     */     return c1 * Math.exp(r1 * tInflection) + c2 * Math.exp(r2 * tInflection);
/*     */   }
/*     */   
/*     */   private static final long estimateDurationInternal(ComplexDouble firstRoot, ComplexDouble secondRoot, double dampingRatio, double initialVelocity, double initialPosition, double delta) {
/*     */     if (((initialPosition == 0.0D)) && ((initialVelocity == 0.0D)))
/*     */       return 0L; 
/*     */     double v0 = (initialPosition < 0.0D) ? -initialVelocity : initialVelocity;
/*     */     double p0 = Math.abs(initialPosition);
/*     */     return (long)(((dampingRatio > 1.0D) ? estimateOverDamped(firstRoot, secondRoot, p0, v0, delta) : ((dampingRatio < 1.0D) ? estimateUnderDamped(firstRoot, p0, v0, delta) : estimateCriticallyDamped(firstRoot, p0, v0, delta))) * 1000.0D);
/*     */   }
/*     */   
/*     */   private static final double iterateNewtonsMethod(double x, Function1 fn, Function1 fnPrime) {
/*     */     int $i$f$iterateNewtonsMethod = 0;
/*     */     return x - ((Number)fn.invoke(Double.valueOf(x))).doubleValue() / ((Number)fnPrime.invoke(Double.valueOf(x))).doubleValue();
/*     */   }
/*     */   
/*     */   private static final boolean isNotFinite(double $this$isNotFinite) {
/*     */     int $i$f$isNotFinite = 0;
/*     */     double d = $this$isNotFinite;
/*     */     return !((!Double.isInfinite(d) && !Double.isNaN(d)) ? 1 : 0);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\SpringEstimationKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */