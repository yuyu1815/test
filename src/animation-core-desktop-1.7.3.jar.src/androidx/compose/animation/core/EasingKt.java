/*    */ package androidx.compose.animation.core;
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
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\t\"\021\020\000\032\0020\001¢\006\b\n\000\032\004\b\002\020\003\"\021\020\004\032\0020\001¢\006\b\n\000\032\004\b\005\020\003\"\021\020\006\032\0020\001¢\006\b\n\000\032\004\b\007\020\003\"\021\020\b\032\0020\001¢\006\b\n\000\032\004\b\t\020\003¨\006\n"}, d2 = {"FastOutLinearInEasing", "Landroidx/compose/animation/core/Easing;", "getFastOutLinearInEasing", "()Landroidx/compose/animation/core/Easing;", "FastOutSlowInEasing", "getFastOutSlowInEasing", "LinearEasing", "getLinearEasing", "LinearOutSlowInEasing", "getLinearOutSlowInEasing", "animation-core"})
/*    */ public final class EasingKt
/*    */ {
/*    */   @NotNull
/* 49 */   private static final Easing FastOutSlowInEasing = new CubicBezierEasing(0.4F, 0.0F, 0.2F, 1.0F); @NotNull public static final Easing getFastOutSlowInEasing() { return FastOutSlowInEasing; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/* 57 */   private static final Easing LinearOutSlowInEasing = new CubicBezierEasing(0.0F, 0.0F, 0.2F, 1.0F); @NotNull public static final Easing getLinearOutSlowInEasing() { return LinearOutSlowInEasing; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/* 65 */   private static final Easing FastOutLinearInEasing = new CubicBezierEasing(0.4F, 0.0F, 1.0F, 1.0F); @NotNull public static final Easing getFastOutLinearInEasing() { return FastOutLinearInEasing; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/* 71 */   private static final Easing LinearEasing = EasingKt::LinearEasing$lambda$0; @NotNull public static final Easing getLinearEasing() { return LinearEasing; } private static final float LinearEasing$lambda$0(float fraction) { return fraction; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\EasingKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */