/*     */ package androidx.compose.animation;
/*     */ 
/*     */ import androidx.compose.animation.core.DecayAnimationSpec;
/*     */ import androidx.compose.animation.core.DecayAnimationSpecKt;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000,\n\000\n\002\020\007\n\002\b\005\n\002\020\002\n\000\n\002\020\024\n\002\b\002\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\032 \020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\fH\002\032\032\020\r\032\b\022\004\022\002H\0170\016\"\004\b\000\020\0172\006\020\020\032\0020\021\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\016\020\003\032\0020\001XT¢\006\002\n\000\"\016\020\004\032\0020\001XT¢\006\002\n\000\"\016\020\005\032\0020\001XT¢\006\002\n\000¨\006\022"}, d2 = {"EndTension", "", "Inflection", "P1", "P2", "StartTension", "computeSplineInfo", "", "splinePositions", "", "splineTimes", "nbSamples", "", "splineBasedDecay", "Landroidx/compose/animation/core/DecayAnimationSpec;", "T", "density", "Landroidx/compose/ui/unit/Density;", "animation"})
/*     */ public final class SplineBasedDecayKt
/*     */ {
/*     */   private static final float Inflection = 0.35F;
/*     */   private static final float StartTension = 0.5F;
/*     */   private static final float EndTension = 1.0F;
/*     */   private static final float P1 = 0.175F;
/*     */   private static final float P2 = 0.35000002F;
/*     */   
/*     */   private static final void computeSplineInfo(float[] splinePositions, float[] splineTimes, int nbSamples) {
/*  36 */     float xMin = 0.0F;
/*  37 */     float yMin = 0.0F;
/*  38 */     for (int i = 0; i < nbSamples; i++) {
/*  39 */       float alpha = i / nbSamples;
/*  40 */       float xMax = 1.0F;
/*  41 */       float x = 0.0F;
/*  42 */       float tx = 0.0F;
/*  43 */       float coef = 0.0F;
/*     */       while (true) {
/*  45 */         x = xMin + (xMax - xMin) / 2.0F;
/*  46 */         coef = 3.0F * x * (1.0F - x);
/*  47 */         tx = coef * ((1.0F - x) * 0.175F + x * 0.35000002F) + x * x * x;
/*  48 */         if (Math.abs(tx - alpha) >= 1.0E-5D) {
/*  49 */           if (tx > alpha) { xMax = x; continue; }  xMin = x; continue;
/*     */         }  break;
/*  51 */       }  splinePositions[i] = coef * ((1.0F - x) * 0.5F + x) + x * x * x;
/*  52 */       float yMax = 1.0F;
/*  53 */       float y = 0.0F;
/*  54 */       float dy = 0.0F;
/*     */       while (true) {
/*  56 */         y = yMin + (yMax - yMin) / 2.0F;
/*  57 */         coef = 3.0F * y * (1.0F - y);
/*  58 */         dy = coef * ((1.0F - y) * 0.5F + y) + y * y * y;
/*  59 */         if (Math.abs(dy - alpha) >= 1.0E-5D) {
/*  60 */           if (dy > alpha) { yMax = y; continue; }  yMin = y; continue;
/*     */         }  break;
/*  62 */       }  splineTimes[i] = coef * ((1.0F - y) * 0.175F + y * 0.35000002F) + y * y * y;
/*     */     } 
/*  64 */     splineTimes[nbSamples] = 1.0F;
/*  65 */     splinePositions[nbSamples] = splineTimes[nbSamples];
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final <T> DecayAnimationSpec<T> splineBasedDecay(@NotNull Density density) {
/* 134 */     Intrinsics.checkNotNullParameter(density, "density"); return DecayAnimationSpecKt.generateDecayAnimationSpec(new SplineBasedFloatDecayAnimationSpec(density));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\SplineBasedDecayKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */