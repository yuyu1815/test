/*    */ package androidx.compose.ui.graphics.colorspace;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020\006\n\002\b\030\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001BA\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003\022\b\b\002\020\b\032\0020\003\022\b\b\002\020\t\032\0020\003¢\006\002\020\nJ\t\020\023\032\0020\003HÆ\003J\t\020\024\032\0020\003HÆ\003J\t\020\025\032\0020\003HÆ\003J\t\020\026\032\0020\003HÆ\003J\t\020\027\032\0020\003HÆ\003J\t\020\030\032\0020\003HÆ\003J\t\020\031\032\0020\003HÆ\003JO\020\032\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0032\b\b\002\020\006\032\0020\0032\b\b\002\020\007\032\0020\0032\b\b\002\020\b\032\0020\0032\b\b\002\020\t\032\0020\003HÆ\001J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\001HÖ\003J\t\020\036\032\0020\037HÖ\001J\t\020 \032\0020!HÖ\001R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\r\020\fR\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\016\020\fR\021\020\007\032\0020\003¢\006\b\n\000\032\004\b\017\020\fR\021\020\b\032\0020\003¢\006\b\n\000\032\004\b\020\020\fR\021\020\t\032\0020\003¢\006\b\n\000\032\004\b\021\020\fR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\022\020\f¨\006\""}, d2 = {"Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "", "gamma", "", "a", "b", "c", "d", "e", "f", "(DDDDDDD)V", "getA", "()D", "getB", "getC", "getD", "getE", "getF", "getGamma", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ui-graphics"})
/*    */ public final class TransferParameters
/*    */ {
/*    */   private final double gamma;
/*    */   private final double a;
/*    */   private final double b;
/*    */   private final double c;
/*    */   private final double d;
/*    */   private final double e;
/*    */   private final double f;
/*    */   
/*    */   public TransferParameters(double gamma, double a, double b, double c, double d, double e, double f) {
/* 37 */     this.gamma = gamma;
/*    */     
/* 39 */     this.a = a;
/*    */     
/* 41 */     this.b = b;
/*    */     
/* 43 */     this.c = c;
/*    */     
/* 45 */     this.d = d;
/*    */     
/* 47 */     this.e = e;
/*    */     
/* 49 */     this.f = f;
/*    */ 
/*    */     
/* 52 */     if (Double.isNaN(this.a) || Double.isNaN(this.b) || Double.isNaN(this.c) || Double.isNaN(this.d) || Double.isNaN(this.e) || Double.isNaN(this.f) || 
/* 53 */       Double.isNaN(this.gamma))
/*    */     {
/* 55 */       throw new IllegalArgumentException("Parameters cannot be NaN");
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 60 */     if (this.d < 0.0D || this.d > 1.0D) {
/* 61 */       throw new IllegalArgumentException(
/* 62 */           "Parameter d must be in the range [0..1], was " + 
/* 63 */           this.d);
/*    */     }
/*    */ 
/*    */     
/* 67 */     if (((this.d == 0.0D)) && (((this.a == 0.0D)) || ((this.gamma == 0.0D)))) {
/* 68 */       throw new IllegalArgumentException(
/* 69 */           "Parameter a or g is zero, the transfer function is constant");
/*    */     }
/*    */ 
/*    */     
/* 73 */     if (this.d >= 1.0D && ((this.c == 0.0D))) {
/* 74 */       throw new IllegalArgumentException(
/* 75 */           "Parameter c is zero, the transfer function is constant");
/*    */     }
/*    */ 
/*    */     
/* 79 */     if ((((this.a == 0.0D)) || ((this.gamma == 0.0D))) && ((this.c == 0.0D))) {
/* 80 */       throw new IllegalArgumentException(
/* 81 */           "Parameter a or g is zero, and c is zero, the transfer function is constant");
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 86 */     if (this.c < 0.0D) {
/* 87 */       throw new IllegalArgumentException("The transfer function must be increasing");
/*    */     }
/*    */     
/* 90 */     if (this.a < 0.0D || this.gamma < 0.0D)
/* 91 */       throw new IllegalArgumentException(
/*    */           
/* 93 */           "The transfer function must be positive or increasing"); 
/*    */   }
/*    */   
/*    */   public final double getGamma() {
/*    */     return this.gamma;
/*    */   }
/*    */   
/*    */   public final double getA() {
/*    */     return this.a;
/*    */   }
/*    */   
/*    */   public final double getB() {
/*    */     return this.b;
/*    */   }
/*    */   
/*    */   public final double getC() {
/*    */     return this.c;
/*    */   }
/*    */   
/*    */   public final double getD() {
/*    */     return this.d;
/*    */   }
/*    */   
/*    */   public final double getE() {
/*    */     return this.e;
/*    */   }
/*    */   
/*    */   public final double getF() {
/*    */     return this.f;
/*    */   }
/*    */   
/*    */   public final double component1() {
/*    */     return this.gamma;
/*    */   }
/*    */   
/*    */   public final double component2() {
/*    */     return this.a;
/*    */   }
/*    */   
/*    */   public final double component3() {
/*    */     return this.b;
/*    */   }
/*    */   
/*    */   public final double component4() {
/*    */     return this.c;
/*    */   }
/*    */   
/*    */   public final double component5() {
/*    */     return this.d;
/*    */   }
/*    */   
/*    */   public final double component6() {
/*    */     return this.e;
/*    */   }
/*    */   
/*    */   public final double component7() {
/*    */     return this.f;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TransferParameters copy(double gamma, double a, double b, double c, double d, double e, double f) {
/*    */     return new TransferParameters(gamma, a, b, c, d, e, f);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TransferParameters(gamma=" + this.gamma + ", a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ", e=" + this.e + ", f=" + this.f + ')';
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Double.hashCode(this.gamma);
/*    */     result = result * 31 + Double.hashCode(this.a);
/*    */     result = result * 31 + Double.hashCode(this.b);
/*    */     result = result * 31 + Double.hashCode(this.c);
/*    */     result = result * 31 + Double.hashCode(this.d);
/*    */     result = result * 31 + Double.hashCode(this.e);
/*    */     return result * 31 + Double.hashCode(this.f);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TransferParameters))
/*    */       return false; 
/*    */     TransferParameters transferParameters = (TransferParameters)other;
/*    */     return (Double.compare(this.gamma, transferParameters.gamma) != 0) ? false : ((Double.compare(this.a, transferParameters.a) != 0) ? false : ((Double.compare(this.b, transferParameters.b) != 0) ? false : ((Double.compare(this.c, transferParameters.c) != 0) ? false : ((Double.compare(this.d, transferParameters.d) != 0) ? false : ((Double.compare(this.e, transferParameters.e) != 0) ? false : (!(Double.compare(this.f, transferParameters.f) != 0)))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\colorspace\TransferParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */