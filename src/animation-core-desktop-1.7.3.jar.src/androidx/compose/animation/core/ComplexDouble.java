/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020\006\n\002\b\r\n\002\020\013\n\000\n\002\020\b\n\002\b\004\n\002\020\016\n\002\b\002\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005J\t\020\013\032\0020\003HÂ\003J\t\020\f\032\0020\003HÂ\003J\035\020\r\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003HÆ\001J\021\020\016\032\0020\0002\006\020\017\032\0020\003H\nJ\023\020\020\032\0020\0212\b\020\017\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\023HÖ\001J\021\020\024\032\0020\0002\006\020\017\032\0020\000H\nJ\021\020\024\032\0020\0002\006\020\017\032\0020\003H\nJ\021\020\025\032\0020\0002\006\020\017\032\0020\000H\nJ\021\020\025\032\0020\0002\006\020\017\032\0020\003H\nJ\021\020\026\032\0020\0002\006\020\017\032\0020\000H\nJ\021\020\026\032\0020\0002\006\020\017\032\0020\003H\nJ\t\020\027\032\0020\030HÖ\001J\t\020\031\032\0020\000H\nR\016\020\004\032\0020\003X\016¢\006\002\n\000R\016\020\002\032\0020\003X\016¢\006\002\n\000R\021\020\006\032\0020\0038F¢\006\006\032\004\b\007\020\bR\021\020\t\032\0020\0038F¢\006\006\032\004\b\n\020\b¨\006\032"}, d2 = {"Landroidx/compose/animation/core/ComplexDouble;", "", "_real", "", "_imaginary", "(DD)V", "imaginary", "getImaginary", "()D", "real", "getReal", "component1", "component2", "copy", "div", "other", "equals", "", "hashCode", "", "minus", "plus", "times", "toString", "", "unaryMinus", "animation-core"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nComplexDouble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,113:1\n35#1,2:114\n66#1,3:116\n40#1,3:119\n*S KotlinDebug\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n46#1:114,2\n50#1:116,3\n50#1:119,3\n*E\n"})
/*     */ public final class ComplexDouble
/*     */ {
/*     */   private double _real;
/*     */   private double _imaginary;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public ComplexDouble(double _real, double _imaginary) {
/*  24 */     this._real = _real; this._imaginary = _imaginary;
/*     */   }
/*     */   public final double getReal() {
/*  27 */     return this._real;
/*     */   }
/*     */   
/*     */   public final double getImaginary() {
/*  31 */     return this._imaginary;
/*     */   }
/*     */   @NotNull
/*     */   public final ComplexDouble plus(double other) {
/*  35 */     int $i$f$plus = 0; access$set_real$p(this, access$get_real$p(this) + other);
/*  36 */     return this;
/*     */   }
/*     */   @NotNull
/*     */   public final ComplexDouble plus(@NotNull ComplexDouble other) {
/*  40 */     Intrinsics.checkNotNullParameter(other, "other"); int $i$f$plus = 0; access$set_real$p(this, access$get_real$p(this) + other.getReal());
/*  41 */     access$set_imaginary$p(this, access$get_imaginary$p(this) + other.getImaginary());
/*  42 */     return this;
/*     */   }
/*     */   
/*     */   @NotNull
/*  46 */   public final ComplexDouble minus(double other) { int $i$f$minus = 0; ComplexDouble complexDouble = this; double other$iv = -other; int $i$f$plus = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 114 */     access$set_real$p(complexDouble, access$get_real$p(complexDouble) + other$iv);
/* 115 */     return complexDouble; } @NotNull public final ComplexDouble minus(@NotNull ComplexDouble other) { Intrinsics.checkNotNullParameter(other, "other"); int $i$f$minus = 0; ComplexDouble complexDouble1 = this, this_$iv = other; int $i$f$unaryMinus = 0;
/* 116 */     access$set_real$p(this_$iv, access$get_real$p(this_$iv) * -1);
/* 117 */     access$set_imaginary$p(this_$iv, access$get_imaginary$p(this_$iv) * -1);
/* 118 */     this_$iv = this_$iv; int $i$f$plus = 0;
/* 119 */     access$set_real$p(complexDouble1, access$get_real$p(complexDouble1) + this_$iv.getReal());
/* 120 */     access$set_imaginary$p(complexDouble1, access$get_imaginary$p(complexDouble1) + this_$iv.getImaginary());
/* 121 */     return complexDouble1; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final ComplexDouble times(double other) {
/*     */     int $i$f$times = 0;
/*     */     access$set_real$p(this, access$get_real$p(this) * other);
/*     */     access$set_imaginary$p(this, access$get_imaginary$p(this) * other);
/*     */     return this;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ComplexDouble times(@NotNull ComplexDouble other) {
/*     */     Intrinsics.checkNotNullParameter(other, "other");
/*     */     int $i$f$times = 0;
/*     */     access$set_real$p(this, getReal() * other.getReal() - getImaginary() * other.getImaginary());
/*     */     access$set_imaginary$p(this, getReal() * other.getImaginary() + other.getReal() * getImaginary());
/*     */     return this;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ComplexDouble unaryMinus() {
/*     */     int $i$f$unaryMinus = 0;
/*     */     access$set_real$p(this, access$get_real$p(this) * -1);
/*     */     access$set_imaginary$p(this, access$get_imaginary$p(this) * -1);
/*     */     return this;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ComplexDouble div(double other) {
/*     */     int $i$f$div = 0;
/*     */     access$set_real$p(this, access$get_real$p(this) / other);
/*     */     access$set_imaginary$p(this, access$get_imaginary$p(this) / other);
/*     */     return this;
/*     */   }
/*     */   
/*     */   private final double component1() {
/*     */     return this._real;
/*     */   }
/*     */   
/*     */   private final double component2() {
/*     */     return this._imaginary;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ComplexDouble copy(double _real, double _imaginary) {
/*     */     return new ComplexDouble(_real, _imaginary);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "ComplexDouble(_real=" + this._real + ", _imaginary=" + this._imaginary + ')';
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = Double.hashCode(this._real);
/*     */     return result * 31 + Double.hashCode(this._imaginary);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ComplexDouble))
/*     */       return false; 
/*     */     ComplexDouble complexDouble = (ComplexDouble)other;
/*     */     return (Double.compare(this._real, complexDouble._real) != 0) ? false : (!(Double.compare(this._imaginary, complexDouble._imaginary) != 0));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\ComplexDouble.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */