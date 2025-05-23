/*    */ package androidx.compose.animation;
/*    */ 
/*    */ import kotlin.Metadata;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\n\n\000\n\002\020\007\n\002\b\006\032\030\020\004\032\0020\0012\006\020\005\032\0020\0012\006\020\006\032\0020\001H\002\"\016\020\000\032\0020\001X\004¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\016\020\003\032\0020\001XT¢\006\002\n\000¨\006\007"}, d2 = {"DecelerationRate", "", "GravityEarth", "InchesPerMeter", "computeDeceleration", "friction", "density", "animation"})
/*    */ public final class FlingCalculatorKt
/*    */ {
/*    */   private static final float GravityEarth = 9.80665F;
/*    */   private static final float InchesPerMeter = 39.37F;
/* 34 */   private static final float DecelerationRate = (float)(Math.log(0.78D) / Math.log(0.9D));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final float computeDeceleration(float friction, float density) {
/* 41 */     return 386.0878F * density * 160.0F * friction;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\FlingCalculatorKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */