/*    */ package androidx.compose.ui.geometry;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\020\016\n\002\020\007\n\000\n\002\020\b\n\000\032\024\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004H\000¨\006\005"}, d2 = {"toStringAsFixed", "", "", "digits", "", "ui-geometry"})
/*    */ public final class GeometryUtilsKt
/*    */ {
/*    */   @NotNull
/*    */   public static final String toStringAsFixed(float $this$toStringAsFixed, int digits) {
/* 24 */     if (Float.isNaN($this$toStringAsFixed)) return "NaN"; 
/* 25 */     if (Float.isInfinite($this$toStringAsFixed)) return ($this$toStringAsFixed < 0.0F) ? "-Infinity" : "Infinity";
/*    */     
/* 27 */     int clampedDigits = Math.max(digits, 0);
/* 28 */     float pow = (float)Math.pow(10.0F, clampedDigits);
/* 29 */     float shifted = $this$toStringAsFixed * pow;
/* 30 */     float decimal = shifted - (int)shifted;
/*    */ 
/*    */     
/* 33 */     int roundedShifted = (decimal >= 0.5F) ? (
/* 34 */       (int)shifted + 1) : 
/*    */       
/* 36 */       (int)shifted;
/*    */ 
/*    */     
/* 39 */     float rounded = roundedShifted / pow;
/* 40 */     return (clampedDigits > 0) ? 
/*    */       
/* 42 */       String.valueOf(rounded) : 
/*    */ 
/*    */ 
/*    */       
/* 46 */       String.valueOf((int)rounded);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-geometry-desktop-1.7.3.jar!\androidx\compos\\ui\geometry\GeometryUtilsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */