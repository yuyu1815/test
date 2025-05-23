/*    */ package org.jetbrains.jewel.ui;
/*    */ import androidx.compose.ui.graphics.ColorFilter;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\032\n\020\003\032\0020\004*\0020\005\"\020\020\000\032\0020\001X\004¢\006\004\n\002\020\002¨\006\006"}, d2 = {"disabledColorMatrixGammaEncoded", "Landroidx/compose/ui/graphics/ColorMatrix;", "[F", "disabled", "Landroidx/compose/ui/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/ColorFilter$Companion;", "ui"})
/*    */ @SourceDebugExtension({"SMAP\nDisabledColorFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisabledColorFilter.kt\norg/jetbrains/jewel/ui/DisabledColorFilterKt\n+ 2 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrix\n*L\n1#1,30:1\n98#2,2:31\n98#2,2:33\n98#2,2:35\n98#2,2:37\n98#2,2:39\n98#2,2:41\n98#2,2:43\n98#2,2:45\n98#2,2:47\n*S KotlinDebug\n*F\n+ 1 DisabledColorFilter.kt\norg/jetbrains/jewel/ui/DisabledColorFilterKt\n*L\n18#1:31,2\n19#1:33,2\n20#1:35,2\n21#1:37,2\n22#1:39,2\n23#1:41,2\n24#1:43,2\n25#1:45,2\n26#1:47,2\n*E\n"})
/*    */ public final class DisabledColorFilterKt {
/*    */   static {
/*  9 */     float[] arrayOfFloat1 = ColorMatrix.constructor-impl$default(null, 1, null), $this$disabledColorMatrixGammaEncoded_u24lambda_u240 = arrayOfFloat1; int $i$a$-apply-DisabledColorFilterKt$disabledColorMatrixGammaEncoded$1 = 0;
/* 10 */     float saturation = 0.5F;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 15 */     float redFactor = 0.299F * saturation + 0.25F;
/* 16 */     float greenFactor = 0.587F * saturation + 0.25F;
/* 17 */     float blueFactor = 0.114F * saturation + 0.25F;
/* 18 */     byte b = 0; int column$iv = 0, $i$f$set-impl = 0;
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
/* 31 */     $this$disabledColorMatrixGammaEncoded_u24lambda_u240[b * 5 + column$iv] = redFactor; int row$iv = 0; column$iv = 1;
/*    */     $i$f$set-impl = 0;
/* 33 */     $this$disabledColorMatrixGammaEncoded_u24lambda_u240[row$iv * 5 + column$iv] = greenFactor; row$iv = 0; column$iv = 2;
/*    */     $i$f$set-impl = 0;
/* 35 */     $this$disabledColorMatrixGammaEncoded_u24lambda_u240[row$iv * 5 + column$iv] = blueFactor; row$iv = 1; column$iv = 0;
/*    */     $i$f$set-impl = 0;
/* 37 */     $this$disabledColorMatrixGammaEncoded_u24lambda_u240[row$iv * 5 + column$iv] = redFactor; row$iv = 1; column$iv = 1;
/*    */     $i$f$set-impl = 0;
/* 39 */     $this$disabledColorMatrixGammaEncoded_u24lambda_u240[row$iv * 5 + column$iv] = greenFactor; row$iv = 1; column$iv = 2;
/*    */     $i$f$set-impl = 0;
/* 41 */     $this$disabledColorMatrixGammaEncoded_u24lambda_u240[row$iv * 5 + column$iv] = blueFactor; row$iv = 2; column$iv = 0;
/*    */     $i$f$set-impl = 0;
/* 43 */     $this$disabledColorMatrixGammaEncoded_u24lambda_u240[row$iv * 5 + column$iv] = redFactor; row$iv = 2; column$iv = 1;
/*    */     $i$f$set-impl = 0;
/* 45 */     $this$disabledColorMatrixGammaEncoded_u24lambda_u240[row$iv * 5 + column$iv] = greenFactor; row$iv = 2; column$iv = 2;
/*    */     $i$f$set-impl = 0;
/* 47 */     $this$disabledColorMatrixGammaEncoded_u24lambda_u240[row$iv * 5 + column$iv] = blueFactor;
/*    */     disabledColorMatrixGammaEncoded = arrayOfFloat1;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private static final float[] disabledColorMatrixGammaEncoded;
/*    */   
/*    */   @NotNull
/*    */   public static final ColorFilter disabled(@NotNull ColorFilter.Companion $this$disabled) {
/*    */     Intrinsics.checkNotNullParameter($this$disabled, "<this>");
/*    */     return $this$disabled.colorMatrix-jHG-Opc(disabledColorMatrixGammaEncoded);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\DisabledColorFilterKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */