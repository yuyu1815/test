/*     */ package androidx.compose.animation.core;
/*     */ import androidx.collection.IntList;
/*     */ import androidx.collection.IntObjectMap;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000Z\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\020\007\n\002\b\b\n\002\030\002\n\000\n\002\020\024\n\002\b\002\n\002\020\021\n\002\b\t\n\002\020\t\n\002\b\006\n\002\020\002\n\002\b\002\b\001\030\000*\b\b\000\020\001*\0020\0022\b\022\004\022\002H\0010\003B?\022\006\020\004\032\0020\005\022\030\020\006\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0020\t0\b0\007\022\006\020\n\032\0020\013\022\006\020\f\032\0020\013\022\006\020\r\032\0020\016¢\006\002\020\017J\020\020\037\032\0020\0132\006\020 \032\0020\013H\002J\030\020!\032\0020\0162\006\020\"\032\0020\0132\006\020 \032\0020\013H\002J\020\020#\032\0020\t2\006\020\"\032\0020\013H\002J-\020$\032\0028\0002\006\020%\032\0020&2\006\020'\032\0028\0002\006\020(\032\0028\0002\006\020)\032\0028\000H\026¢\006\002\020*J-\020+\032\0028\0002\006\020%\032\0020&2\006\020'\032\0028\0002\006\020(\032\0028\0002\006\020)\032\0028\000H\026¢\006\002\020*J%\020,\032\0020-2\006\020'\032\0028\0002\006\020(\032\0028\0002\006\020)\032\0028\000H\002¢\006\002\020.R\024\020\f\032\0020\013X\004¢\006\b\n\000\032\004\b\020\020\021R\024\020\n\032\0020\013X\004¢\006\b\n\000\032\004\b\022\020\021R \020\006\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0020\t0\b0\007X\004¢\006\002\n\000R\022\020\023\032\004\030\0018\000X\016¢\006\004\n\002\020\024R\022\020\025\032\004\030\0018\000X\016¢\006\004\n\002\020\024R\016\020\026\032\0020\027X.¢\006\002\n\000R\016\020\r\032\0020\016X\004¢\006\002\n\000R\016\020\030\032\0020\031X.¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\020\020\032\032\0028\000X.¢\006\004\n\002\020\024R\026\020\033\032\b\022\004\022\0020\0310\034X.¢\006\004\n\002\020\035R\020\020\036\032\0028\000X.¢\006\004\n\002\020\024¨\006/"}, d2 = {"Landroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "timestamps", "Landroidx/collection/IntList;", "keyframes", "Landroidx/collection/IntObjectMap;", "Lkotlin/Pair;", "Landroidx/compose/animation/core/Easing;", "durationMillis", "", "delayMillis", "periodicBias", "", "(Landroidx/collection/IntList;Landroidx/collection/IntObjectMap;IIF)V", "getDelayMillis", "()I", "getDurationMillis", "lastInitialValue", "Landroidx/compose/animation/core/AnimationVector;", "lastTargetValue", "monoSpline", "Landroidx/compose/animation/core/MonoSpline;", "times", "", "valueVector", "values", "", "[[F", "velocityVector", "findEntryForTimeMillis", "timeMillis", "getEasedTimeFromIndex", "index", "getEasing", "getValueFromNanos", "playTimeNanos", "", "initialValue", "targetValue", "initialVelocity", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "init", "", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "animation-core"})
/*     */ @ExperimentalAnimationSpecApi
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nVectorizedMonoSplineKeyframesSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorizedMonoSplineKeyframesSpec.kt\nandroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec\n+ 2 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,203:1\n70#2:204\n*S KotlinDebug\n*F\n+ 1 VectorizedMonoSplineKeyframesSpec.kt\nandroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec\n*L\n174#1:204\n*E\n"})
/*     */ public final class VectorizedMonoSplineKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
/*     */   @NotNull
/*     */   private final IntList timestamps;
/*     */   @NotNull
/*     */   private final IntObjectMap<Pair<V, Easing>> keyframes;
/*     */   private final int durationMillis;
/*     */   private final int delayMillis;
/*     */   private final float periodicBias;
/*     */   private V valueVector;
/*     */   
/*     */   public VectorizedMonoSplineKeyframesSpec(@NotNull IntList timestamps, @NotNull IntObjectMap<Pair<V, Easing>> keyframes, int durationMillis, int delayMillis, float periodicBias) {
/*  27 */     this.timestamps = timestamps;
/*  28 */     this.keyframes = keyframes;
/*  29 */     this.durationMillis = durationMillis;
/*  30 */     this.delayMillis = delayMillis;
/*  31 */     this.periodicBias = periodicBias;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private V velocityVector;
/*     */ 
/*     */   
/*     */   private float[] times;
/*     */ 
/*     */   
/*     */   private MonoSpline monoSpline;
/*     */ 
/*     */   
/*     */   private float[][] values;
/*     */ 
/*     */   
/*     */   private final void init(AnimationVector initialValue, AnimationVector targetValue, AnimationVector initialVelocity) {
/*  49 */     if (this.valueVector == null) {
/*  50 */       this.valueVector = AnimationVectorsKt.newInstance((V)initialValue);
/*  51 */       this.velocityVector = AnimationVectorsKt.newInstance((V)initialVelocity); byte b; int i; float[] arrayOfFloat;
/*     */       VectorizedMonoSplineKeyframesSpec vectorizedMonoSplineKeyframesSpec;
/*  53 */       for (b = 0, i = this.timestamps.getSize(), arrayOfFloat = new float[i], vectorizedMonoSplineKeyframesSpec = this; b < i; ) { byte b1 = b; arrayOfFloat[b1] = 
/*  54 */           this.timestamps.get(b1) / (float)1000L; b++; }
/*     */ 
/*     */       
/*     */       vectorizedMonoSplineKeyframesSpec.times = arrayOfFloat;
/*     */     } 
/*  59 */     if (this.monoSpline == null || 
/*  60 */       !Intrinsics.areEqual(this.lastInitialValue, initialValue) || !Intrinsics.areEqual(this.lastTargetValue, targetValue)) {
/*     */       
/*  62 */       boolean initialChanged = !Intrinsics.areEqual(this.lastInitialValue, initialValue);
/*  63 */       boolean targetChanged = !Intrinsics.areEqual(this.lastTargetValue, targetValue);
/*  64 */       this.lastInitialValue = (V)initialValue;
/*  65 */       this.lastTargetValue = (V)targetValue;
/*     */       
/*  67 */       int dimension = initialValue.getSize$animation_core();
/*     */       
/*  69 */       if (this.values == null) {
/*  70 */         byte b; int i; float[][] arrayOfFloat; VectorizedMonoSplineKeyframesSpec vectorizedMonoSplineKeyframesSpec; for (b = 0, i = this.timestamps.getSize(), arrayOfFloat = new float[i][], vectorizedMonoSplineKeyframesSpec = this; b < i; ) { byte b1 = b;
/*  71 */           int timestamp = this.timestamps.get(b1);
/*     */           byte b2;
/*     */           float arrayOfFloat1[], arrayOfFloat2[][];
/*     */           byte b3;
/*  75 */           for (b2 = 0, arrayOfFloat1 = new float[dimension], b3 = b1, arrayOfFloat2 = arrayOfFloat; b2 < dimension; ) { byte b4 = b2; arrayOfFloat1[b4] = initialValue.get$animation_core(b4); b2++; }
/*     */           
/*  77 */           b2 = 0; arrayOfFloat1 = new float[dimension]; Intrinsics.checkNotNull(this.keyframes.get(timestamp)); AnimationVector animationVector; for (animationVector = (AnimationVector)((Pair)this.keyframes.get(timestamp)).getFirst(), b3 = b3, arrayOfFloat2 = arrayOfFloat2; b2 < dimension; ) { byte b4 = b2; arrayOfFloat1[b4] = animationVector.get$animation_core(b4); b2++; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  83 */           for (b2 = 0, arrayOfFloat1 = new float[dimension], b3 = b3, arrayOfFloat2 = arrayOfFloat2; b2 < dimension; ) { byte b4 = b2; arrayOfFloat1[b4] = targetValue.get$animation_core(b4); b2++; }
/*     */           
/*  85 */           b2 = 0; arrayOfFloat1 = new float[dimension]; Intrinsics.checkNotNull(this.keyframes.get(timestamp)); for (animationVector = (AnimationVector)((Pair)this.keyframes.get(timestamp)).getFirst(), b3 = b3, arrayOfFloat2 = arrayOfFloat2; b2 < dimension; ) { byte b4 = b2; arrayOfFloat1[b4] = animationVector.get$animation_core(b4); b2++; }
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  90 */           b2 = 0; arrayOfFloat1 = new float[dimension]; Intrinsics.checkNotNull(this.keyframes.get(timestamp)); for (animationVector = (AnimationVector)((Pair)this.keyframes.get(timestamp)).getFirst(), b3 = b3, arrayOfFloat2 = arrayOfFloat2; b2 < dimension; ) { byte b4 = b2; arrayOfFloat1[b4] = animationVector.get$animation_core(b4); b2++; }  arrayOfFloat2[b3] = (timestamp == 0) ? (!this.keyframes.contains(timestamp) ? arrayOfFloat1 : arrayOfFloat1) : ((timestamp == getDurationMillis()) ? (!this.keyframes.contains(timestamp) ? arrayOfFloat1 : arrayOfFloat1) : arrayOfFloat1); b++; }
/*     */ 
/*     */         
/*     */         vectorizedMonoSplineKeyframesSpec.values = arrayOfFloat;
/*     */       } else {
/*  95 */         if (initialChanged && !this.keyframes.contains(0)) {
/*  96 */           if (this.values == null) Intrinsics.throwUninitializedPropertyAccessException("values");  float[] arrayOfFloat; Object object; int i; for (byte b = 0; b < dimension; ) { byte b1 = b; arrayOfFloat[b1] = initialValue.get$animation_core(b1); b++; }  object[i] = arrayOfFloat;
/*     */         } 
/*  98 */         if (targetChanged && !this.keyframes.contains(getDurationMillis())) {
/*  99 */           if (this.values == null) Intrinsics.throwUninitializedPropertyAccessException("values");  float[] arrayOfFloat; Object object; int i;
/* 100 */           for (byte b = 0; b < dimension; ) { byte b1 = b; arrayOfFloat[b1] = targetValue.get$animation_core(b1); b++; }  object[i] = arrayOfFloat;
/*     */         } 
/*     */       } 
/* 103 */       if (this.times == null) Intrinsics.throwUninitializedPropertyAccessException("times");  if (this.values == null) Intrinsics.throwUninitializedPropertyAccessException("values");  super((float[])this.values, null, this.periodicBias); ((VectorizedMonoSplineKeyframesSpec)new MonoSpline()).monoSpline = (MonoSpline)this.times;
/*     */     } 
/*     */   } @Nullable
/*     */   private V lastInitialValue; @Nullable
/*     */   private V lastTargetValue; public static final int $stable = 8; public int getDurationMillis() {
/*     */     return this.durationMillis;
/*     */   } public int getDelayMillis() {
/*     */     return this.delayMillis;
/*     */   } @NotNull
/*     */   public V getValueFromNanos(long playTimeNanos, @NotNull AnimationVector initialValue, @NotNull AnimationVector targetValue, @NotNull AnimationVector initialVelocity) {
/* 113 */     Intrinsics.checkNotNullParameter(initialValue, "initialValue"); Intrinsics.checkNotNullParameter(targetValue, "targetValue"); Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity"); long playTimeMillis = playTimeNanos / 1000000L;
/* 114 */     int clampedPlayTime = (int)VectorizedAnimationSpecKt.clampPlayTime(this, playTimeMillis);
/*     */     
/* 116 */     if (this.keyframes.containsKey(clampedPlayTime)) {
/* 117 */       Intrinsics.checkNotNull(this.keyframes.get(clampedPlayTime)); return (V)((Pair)this.keyframes.get(clampedPlayTime)).getFirst();
/*     */     } 
/*     */     
/* 120 */     if (clampedPlayTime >= getDurationMillis())
/* 121 */       return (V)targetValue; 
/* 122 */     if (clampedPlayTime <= 0) return (V)initialValue;
/*     */     
/* 124 */     init((V)initialValue, (V)targetValue, (V)initialVelocity);
/*     */ 
/*     */ 
/*     */     
/* 128 */     int index = findEntryForTimeMillis(clampedPlayTime);
/*     */     
/* 130 */     if (this.monoSpline == null) Intrinsics.throwUninitializedPropertyAccessException("monoSpline");  MonoSpline monoSpline = null;
/*     */     
/* 132 */     float f = getEasedTimeFromIndex(index, clampedPlayTime);
/* 133 */     if (this.valueVector == null) Intrinsics.throwUninitializedPropertyAccessException("valueVector");  AnimationVector animationVector = null; monoSpline.getPos(f, animationVector, index);
/*     */     
/* 135 */     if (this.valueVector == null) Intrinsics.throwUninitializedPropertyAccessException("valueVector");  return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public V getVelocityFromNanos(long playTimeNanos, @NotNull AnimationVector initialValue, @NotNull AnimationVector targetValue, @NotNull AnimationVector initialVelocity) {
/* 144 */     Intrinsics.checkNotNullParameter(initialValue, "initialValue"); Intrinsics.checkNotNullParameter(targetValue, "targetValue"); Intrinsics.checkNotNullParameter(initialVelocity, "initialVelocity"); long playTimeMillis = playTimeNanos / 1000000L;
/* 145 */     int clampedPlayTime = (int)VectorizedAnimationSpecKt.clampPlayTime(this, playTimeMillis);
/* 146 */     if (clampedPlayTime < 0) {
/* 147 */       return (V)initialVelocity;
/*     */     }
/*     */     
/* 150 */     init((V)initialValue, (V)targetValue, (V)initialVelocity);
/*     */ 
/*     */ 
/*     */     
/* 154 */     int index = findEntryForTimeMillis(clampedPlayTime);
/*     */     
/* 156 */     if (this.monoSpline == null) Intrinsics.throwUninitializedPropertyAccessException("monoSpline");  MonoSpline monoSpline = null;
/*     */     
/* 158 */     float f = getEasedTimeFromIndex(index, clampedPlayTime);
/* 159 */     if (this.velocityVector == null) Intrinsics.throwUninitializedPropertyAccessException("velocityVector");  AnimationVector animationVector = null; monoSpline.getSlope(f, animationVector, index);
/*     */     
/* 161 */     if (this.velocityVector == null) Intrinsics.throwUninitializedPropertyAccessException("velocityVector");  return null;
/*     */   }
/*     */   
/*     */   private final Easing getEasing(int index) {
/* 165 */     int timestamp = this.timestamps.get(index);
/*     */     
/* 167 */     if ((Pair)this.keyframes.get(timestamp) == null || (Easing)((Pair)this.keyframes.get(timestamp)).getSecond() == null) (Easing)((Pair)this.keyframes.get(timestamp)).getSecond();  return EasingKt.getLinearEasing();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final float getEasedTimeFromIndex(int index, int timeMillis) {
/* 174 */     IntList this_$iv = this.timestamps; int $i$f$getLastIndex = 0; if (index >= 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 204 */       this_$iv._size - 1)
/*     */       return timeMillis / (float)1000L; 
/*     */     int timeMin = this.timestamps.get(index);
/*     */     int timeMax = this.timestamps.get(index + 1);
/*     */     if (timeMillis == timeMin)
/*     */       return timeMin / (float)1000L; 
/*     */     int timeRange = timeMax - timeMin;
/*     */     Easing easing = getEasing(index);
/*     */     float rawFraction = (timeMillis - timeMin) / timeRange;
/*     */     float easedFraction = easing.transform(rawFraction);
/*     */     return (timeRange * easedFraction + timeMin) / (float)1000L;
/*     */   }
/*     */   
/*     */   private final int findEntryForTimeMillis(int timeMillis) {
/*     */     int index = IntListExtensionKt.binarySearch$default(this.timestamps, timeMillis, 0, 0, 6, null);
/*     */     return (index < -1) ? -(index + 2) : index;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\VectorizedMonoSplineKeyframesSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */