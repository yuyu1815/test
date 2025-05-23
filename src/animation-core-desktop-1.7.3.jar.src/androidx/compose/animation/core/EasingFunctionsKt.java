/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import kotlin.Metadata;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\bE\"\021\020\000\032\0020\001¢\006\b\n\000\032\004\b\002\020\003\"\021\020\004\032\0020\001¢\006\b\n\000\032\004\b\005\020\003\"\021\020\006\032\0020\001¢\006\b\n\000\032\004\b\007\020\003\"\021\020\b\032\0020\001¢\006\b\n\000\032\004\b\t\020\003\"\021\020\n\032\0020\001¢\006\b\n\000\032\004\b\013\020\003\"\021\020\f\032\0020\001¢\006\b\n\000\032\004\b\r\020\003\"\021\020\016\032\0020\001¢\006\b\n\000\032\004\b\017\020\003\"\021\020\020\032\0020\001¢\006\b\n\000\032\004\b\021\020\003\"\021\020\022\032\0020\001¢\006\b\n\000\032\004\b\023\020\003\"\021\020\024\032\0020\001¢\006\b\n\000\032\004\b\025\020\003\"\021\020\026\032\0020\001¢\006\b\n\000\032\004\b\027\020\003\"\021\020\030\032\0020\001¢\006\b\n\000\032\004\b\031\020\003\"\021\020\032\032\0020\001¢\006\b\n\000\032\004\b\033\020\003\"\021\020\034\032\0020\001¢\006\b\n\000\032\004\b\035\020\003\"\021\020\036\032\0020\001¢\006\b\n\000\032\004\b\037\020\003\"\021\020 \032\0020\001¢\006\b\n\000\032\004\b!\020\003\"\021\020\"\032\0020\001¢\006\b\n\000\032\004\b#\020\003\"\021\020$\032\0020\001¢\006\b\n\000\032\004\b%\020\003\"\021\020&\032\0020\001¢\006\b\n\000\032\004\b'\020\003\"\021\020(\032\0020\001¢\006\b\n\000\032\004\b)\020\003\"\021\020*\032\0020\001¢\006\b\n\000\032\004\b+\020\003\"\021\020,\032\0020\001¢\006\b\n\000\032\004\b-\020\003\"\021\020.\032\0020\001¢\006\b\n\000\032\004\b/\020\003\"\021\0200\032\0020\001¢\006\b\n\000\032\004\b1\020\003\"\021\0202\032\0020\001¢\006\b\n\000\032\004\b3\020\003\"\021\0204\032\0020\001¢\006\b\n\000\032\004\b5\020\003\"\021\0206\032\0020\001¢\006\b\n\000\032\004\b7\020\003\"\021\0208\032\0020\001¢\006\b\n\000\032\004\b9\020\003\"\021\020:\032\0020\001¢\006\b\n\000\032\004\b;\020\003\"\021\020<\032\0020\001¢\006\b\n\000\032\004\b=\020\003\"\021\020>\032\0020\001¢\006\b\n\000\032\004\b?\020\003\"\021\020@\032\0020\001¢\006\b\n\000\032\004\bA\020\003\"\021\020B\032\0020\001¢\006\b\n\000\032\004\bC\020\003\"\021\020D\032\0020\001¢\006\b\n\000\032\004\bE\020\003¨\006F"}, d2 = {"Ease", "Landroidx/compose/animation/core/Easing;", "getEase", "()Landroidx/compose/animation/core/Easing;", "EaseIn", "getEaseIn", "EaseInBack", "getEaseInBack", "EaseInBounce", "getEaseInBounce", "EaseInCirc", "getEaseInCirc", "EaseInCubic", "getEaseInCubic", "EaseInElastic", "getEaseInElastic", "EaseInExpo", "getEaseInExpo", "EaseInOut", "getEaseInOut", "EaseInOutBack", "getEaseInOutBack", "EaseInOutBounce", "getEaseInOutBounce", "EaseInOutCirc", "getEaseInOutCirc", "EaseInOutCubic", "getEaseInOutCubic", "EaseInOutElastic", "getEaseInOutElastic", "EaseInOutExpo", "getEaseInOutExpo", "EaseInOutQuad", "getEaseInOutQuad", "EaseInOutQuart", "getEaseInOutQuart", "EaseInOutQuint", "getEaseInOutQuint", "EaseInOutSine", "getEaseInOutSine", "EaseInQuad", "getEaseInQuad", "EaseInQuart", "getEaseInQuart", "EaseInQuint", "getEaseInQuint", "EaseInSine", "getEaseInSine", "EaseOut", "getEaseOut", "EaseOutBack", "getEaseOutBack", "EaseOutBounce", "getEaseOutBounce", "EaseOutCirc", "getEaseOutCirc", "EaseOutCubic", "getEaseOutCubic", "EaseOutElastic", "getEaseOutElastic", "EaseOutExpo", "getEaseOutExpo", "EaseOutQuad", "getEaseOutQuad", "EaseOutQuart", "getEaseOutQuart", "EaseOutQuint", "getEaseOutQuint", "EaseOutSine", "getEaseOutSine", "animation-core"})
/*     */ public final class EasingFunctionsKt
/*     */ {
/*     */   @NotNull
/*  28 */   private static final Easing Ease = new CubicBezierEasing(0.25F, 0.1F, 0.25F, 1.0F); @NotNull public static final Easing getEase() { return Ease; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  35 */   private static final Easing EaseOut = new CubicBezierEasing(0.0F, 0.0F, 0.58F, 1.0F); @NotNull public static final Easing getEaseOut() { return EaseOut; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  42 */   private static final Easing EaseIn = new CubicBezierEasing(0.42F, 0.0F, 1.0F, 1.0F); @NotNull public static final Easing getEaseIn() { return EaseIn; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  49 */   private static final Easing EaseInOut = new CubicBezierEasing(0.42F, 0.0F, 0.58F, 1.0F); @NotNull public static final Easing getEaseInOut() { return EaseInOut; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  56 */   private static final Easing EaseInSine = new CubicBezierEasing(0.12F, 0.0F, 0.39F, 0.0F); @NotNull public static final Easing getEaseInSine() { return EaseInSine; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  61 */   private static final Easing EaseOutSine = new CubicBezierEasing(0.61F, 1.0F, 0.88F, 1.0F); @NotNull public static final Easing getEaseOutSine() { return EaseOutSine; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  66 */   private static final Easing EaseInOutSine = new CubicBezierEasing(0.37F, 0.0F, 0.63F, 1.0F); @NotNull public static final Easing getEaseInOutSine() { return EaseInOutSine; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  71 */   private static final Easing EaseInCubic = new CubicBezierEasing(0.32F, 0.0F, 0.67F, 0.0F); @NotNull public static final Easing getEaseInCubic() { return EaseInCubic; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  76 */   private static final Easing EaseOutCubic = new CubicBezierEasing(0.33F, 1.0F, 0.68F, 1.0F); @NotNull public static final Easing getEaseOutCubic() { return EaseOutCubic; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  81 */   private static final Easing EaseInOutCubic = new CubicBezierEasing(0.65F, 0.0F, 0.35F, 1.0F); @NotNull public static final Easing getEaseInOutCubic() { return EaseInOutCubic; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  86 */   private static final Easing EaseInQuint = new CubicBezierEasing(0.64F, 0.0F, 0.78F, 0.0F); @NotNull public static final Easing getEaseInQuint() { return EaseInQuint; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  91 */   private static final Easing EaseOutQuint = new CubicBezierEasing(0.22F, 1.0F, 0.36F, 1.0F); @NotNull public static final Easing getEaseOutQuint() { return EaseOutQuint; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  96 */   private static final Easing EaseInOutQuint = new CubicBezierEasing(0.83F, 0.0F, 0.17F, 1.0F); @NotNull public static final Easing getEaseInOutQuint() { return EaseInOutQuint; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 101 */   private static final Easing EaseInCirc = new CubicBezierEasing(0.55F, 0.0F, 1.0F, 0.45F); @NotNull public static final Easing getEaseInCirc() { return EaseInCirc; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 106 */   private static final Easing EaseOutCirc = new CubicBezierEasing(0.0F, 0.55F, 0.45F, 1.0F); @NotNull public static final Easing getEaseOutCirc() { return EaseOutCirc; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 111 */   private static final Easing EaseInOutCirc = new CubicBezierEasing(0.85F, 0.0F, 0.15F, 1.0F); @NotNull public static final Easing getEaseInOutCirc() { return EaseInOutCirc; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 116 */   private static final Easing EaseInQuad = new CubicBezierEasing(0.11F, 0.0F, 0.5F, 0.0F); @NotNull public static final Easing getEaseInQuad() { return EaseInQuad; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 121 */   private static final Easing EaseOutQuad = new CubicBezierEasing(0.5F, 1.0F, 0.89F, 1.0F); @NotNull public static final Easing getEaseOutQuad() { return EaseOutQuad; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 126 */   private static final Easing EaseInOutQuad = new CubicBezierEasing(0.45F, 0.0F, 0.55F, 1.0F); @NotNull public static final Easing getEaseInOutQuad() { return EaseInOutQuad; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 131 */   private static final Easing EaseInQuart = new CubicBezierEasing(0.5F, 0.0F, 0.75F, 0.0F); @NotNull public static final Easing getEaseInQuart() { return EaseInQuart; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 136 */   private static final Easing EaseOutQuart = new CubicBezierEasing(0.25F, 1.0F, 0.5F, 1.0F); @NotNull public static final Easing getEaseOutQuart() { return EaseOutQuart; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 141 */   private static final Easing EaseInOutQuart = new CubicBezierEasing(0.76F, 0.0F, 0.24F, 1.0F); @NotNull public static final Easing getEaseInOutQuart() { return EaseInOutQuart; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 146 */   private static final Easing EaseInExpo = new CubicBezierEasing(0.7F, 0.0F, 0.84F, 0.0F); @NotNull public static final Easing getEaseInExpo() { return EaseInExpo; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 151 */   private static final Easing EaseOutExpo = new CubicBezierEasing(0.16F, 1.0F, 0.3F, 1.0F); @NotNull public static final Easing getEaseOutExpo() { return EaseOutExpo; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 156 */   private static final Easing EaseInOutExpo = new CubicBezierEasing(0.87F, 0.0F, 0.13F, 1.0F); @NotNull public static final Easing getEaseInOutExpo() { return EaseInOutExpo; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 161 */   private static final Easing EaseInBack = new CubicBezierEasing(0.36F, 0.0F, 0.66F, -0.56F); @NotNull public static final Easing getEaseInBack() { return EaseInBack; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 166 */   private static final Easing EaseOutBack = new CubicBezierEasing(0.34F, 1.56F, 0.64F, 1.0F); @NotNull public static final Easing getEaseOutBack() { return EaseOutBack; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 171 */   private static final Easing EaseInOutBack = new CubicBezierEasing(0.68F, -0.6F, 0.32F, 1.6F); @NotNull public static final Easing getEaseInOutBack() { return EaseInOutBack; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 176 */   private static final Easing EaseInElastic = EasingFunctionsKt::EaseInElastic$lambda$0; @NotNull public static final Easing getEaseInElastic() { return EaseInElastic; } private static final float EaseInElastic$lambda$0(float fraction) {
/* 177 */     double c4 = 2.0943951023931953D;
/*     */     
/* 179 */     float f = fraction; return 
/* 180 */       ((f == 0.0F)) ? 0.0F : (
/* 181 */       ((f == 1.0F)) ? 1.0F : 
/*     */ 
/*     */       
/* 184 */       (float)(-((float)Math.pow(2.0F, (10.0F * fraction - 10.0F))) * Math.sin((fraction * 10.0F - 10.75F) * c4)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 191 */   private static final Easing EaseOutElastic = EasingFunctionsKt::EaseOutElastic$lambda$1; @NotNull public static final Easing getEaseOutElastic() { return EaseOutElastic; } private static final float EaseOutElastic$lambda$1(float fraction) {
/* 192 */     double c4 = 2.0943951023931953D;
/*     */     
/* 194 */     float f = fraction; return 
/* 195 */       ((f == 0.0F)) ? 0.0F : (
/* 196 */       ((f == 1.0F)) ? 1.0F : 
/*     */ 
/*     */       
/* 199 */       (float)((float)Math.pow(2.0F, (-10.0F * fraction)) * Math.sin((fraction * 10.0F - 0.75F) * c4) + 1.0F));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 206 */   private static final Easing EaseInOutElastic = EasingFunctionsKt::EaseInOutElastic$lambda$2; @NotNull public static final Easing getEaseInOutElastic() { return EaseInOutElastic; } private static final float EaseInOutElastic$lambda$2(float fraction) {
/* 207 */     double c5 = 1.3962634015954636D;
/* 208 */     float f = fraction; return 
/* 209 */       ((f == 0.0F)) ? 0.0F : (
/* 210 */       ((f == 1.0F)) ? 1.0F : (
/* 211 */       ((0.0F <= f) ? ((f <= 0.5F)) : false) ? 
/*     */       
/* 213 */       (float)(-((float)Math.pow(2.0F, (20.0F * fraction - 10.0F)) * Math.sin((20.0F * fraction - 11.125F) * c5)) / 2.0F) : (
/*     */ 
/*     */       
/* 216 */       (float)((float)Math.pow(2.0F, (-20.0F * fraction + 10.0F)) * Math.sin((fraction * 20.0F - 11.125F) * c5) / 2.0F) + 1.0F)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 223 */   private static final Easing EaseOutBounce = EasingFunctionsKt::EaseOutBounce$lambda$3; @NotNull public static final Easing getEaseOutBounce() { return EaseOutBounce; } private static final float EaseOutBounce$lambda$3(float fraction) {
/* 224 */     float n1 = 7.5625F;
/* 225 */     float d1 = 2.75F;
/* 226 */     float newFraction = fraction;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 231 */     newFraction -= 1.5F / d1;
/*     */ 
/*     */     
/* 234 */     newFraction -= 2.25F / d1;
/*     */ 
/*     */     
/* 237 */     newFraction -= 2.625F / d1;
/* 238 */     return (newFraction < 1.0F / d1) ? (n1 * newFraction * newFraction) : ((newFraction < 2.0F / d1) ? (n1 * newFraction * newFraction + 0.75F) : ((newFraction < 2.5F / d1) ? (n1 * newFraction * newFraction + 0.9375F) : (n1 * newFraction * newFraction + 0.984375F)));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 245 */   private static final Easing EaseInBounce = EasingFunctionsKt::EaseInBounce$lambda$4; @NotNull public static final Easing getEaseInBounce() { return EaseInBounce; } private static final float EaseInBounce$lambda$4(float fraction) {
/* 246 */     return true - EaseOutBounce.transform(1.0F - fraction);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 252 */   private static final Easing EaseInOutBounce = EasingFunctionsKt::EaseInOutBounce$lambda$5; @NotNull public static final Easing getEaseInOutBounce() { return EaseInOutBounce; } private static final float EaseInOutBounce$lambda$5(float fraction) {
/* 253 */     return (fraction < 0.5D) ? ((
/* 254 */       true - EaseOutBounce.transform(1.0F - 2.0F * fraction)) / 2.0F) : ((
/*     */       
/* 256 */       true + EaseOutBounce.transform(2.0F * fraction - 1.0F)) / 2.0F);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\EasingFunctionsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */