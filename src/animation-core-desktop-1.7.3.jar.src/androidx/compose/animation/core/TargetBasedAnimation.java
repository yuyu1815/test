/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\020\t\n\002\b\016\n\002\020\013\n\002\b\024\n\002\020\016\n\000\b\007\030\000*\004\b\000\020\001*\b\b\001\020\002*\0020\0032\016\022\004\022\002H\001\022\004\022\002H\0020\004BE\b\026\022\f\020\005\032\b\022\004\022\0028\0000\006\022\022\020\007\032\016\022\004\022\0028\000\022\004\022\0028\0010\b\022\006\020\t\032\0028\000\022\006\020\n\032\0028\000\022\n\b\002\020\013\032\004\030\0018\001¢\006\002\020\fBE\b\000\022\f\020\005\032\b\022\004\022\0028\0010\r\022\022\020\007\032\016\022\004\022\0028\000\022\004\022\0028\0010\b\022\006\020\t\032\0028\000\022\006\020\n\032\0028\000\022\n\b\002\020\013\032\004\030\0018\001¢\006\002\020\016J\025\020.\032\0028\0002\006\020/\032\0020\020H\026¢\006\002\0200J\025\0201\032\0028\0012\006\020/\032\0020\020H\026¢\006\002\0202J\b\0203\032\00204H\026R\016\020\017\032\0020\020X\016¢\006\002\n\000R\022\020\021\032\004\030\0018\001X\016¢\006\004\n\002\020\022R\032\020\005\032\b\022\004\022\0028\0010\rX\004¢\006\b\n\000\032\004\b\023\020\024R\024\020\025\032\0020\0208VX\004¢\006\006\032\004\b\026\020\027R\024\020\030\032\0028\0018BX\004¢\006\006\032\004\b\031\020\032R\021\020\t\032\0028\0008F¢\006\006\032\004\b\033\020\034R\020\020\035\032\0028\001X\016¢\006\004\n\002\020\022R\020\020\013\032\0028\001X\004¢\006\004\n\002\020\022R\024\020\036\032\0020\0378VX\004¢\006\006\032\004\b\036\020 R&\020\"\032\0028\0002\006\020!\032\0028\000@@X\016¢\006\020\n\002\020&\032\004\b#\020\034\"\004\b$\020%R&\020'\032\0028\0002\006\020!\032\0028\000@@X\016¢\006\020\n\002\020&\032\004\b(\020\034\"\004\b)\020%R\024\020\n\032\0028\0008VX\004¢\006\006\032\004\b*\020\034R\020\020+\032\0028\001X\016¢\006\004\n\002\020\022R \020\007\032\016\022\004\022\0028\000\022\004\022\0028\0010\bX\004¢\006\b\n\000\032\004\b,\020-¨\0065"}, d2 = {"Landroidx/compose/animation/core/TargetBasedAnimation;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/Animation;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "initialValue", "targetValue", "initialVelocityVector", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V", "_durationNanos", "", "_endVelocity", "Landroidx/compose/animation/core/AnimationVector;", "getAnimationSpec$animation_core", "()Landroidx/compose/animation/core/VectorizedAnimationSpec;", "durationNanos", "getDurationNanos", "()J", "endVelocity", "getEndVelocity", "()Landroidx/compose/animation/core/AnimationVector;", "getInitialValue", "()Ljava/lang/Object;", "initialValueVector", "isInfinite", "", "()Z", "value", "mutableInitialValue", "getMutableInitialValue$animation_core", "setMutableInitialValue$animation_core", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "mutableTargetValue", "getMutableTargetValue$animation_core", "setMutableTargetValue$animation_core", "getTargetValue", "targetValueVector", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "getValueFromNanos", "playTimeNanos", "(J)Ljava/lang/Object;", "getVelocityVectorFromNanos", "(J)Landroidx/compose/animation/core/AnimationVector;", "toString", "", "animation-core"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animation.kt\nandroidx/compose/animation/core/TargetBasedAnimation\n+ 2 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,499:1\n54#2,7:500\n1#3:507\n*S KotlinDebug\n*F\n+ 1 Animation.kt\nandroidx/compose/animation/core/TargetBasedAnimation\n*L\n279#1:500,7\n*E\n"})
/*     */ public final class TargetBasedAnimation<T, V extends AnimationVector>
/*     */   implements Animation<T, V>
/*     */ {
/*     */   @NotNull
/*     */   private final VectorizedAnimationSpec<V> animationSpec;
/*     */   @NotNull
/*     */   private final TwoWayConverter<T, V> typeConverter;
/*     */   private T mutableTargetValue;
/*     */   private T mutableInitialValue;
/*     */   @NotNull
/*     */   private V initialValueVector;
/*     */   @NotNull
/*     */   private V targetValueVector;
/*     */   @NotNull
/*     */   private final V initialVelocityVector;
/*     */   private long _durationNanos;
/*     */   @Nullable
/*     */   private V _endVelocity;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   @NotNull
/*     */   public final VectorizedAnimationSpec<V> getAnimationSpec$animation_core() {
/*     */     return this.animationSpec;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public TwoWayConverter<T, V> getTypeConverter() {
/*     */     return this.typeConverter;
/*     */   }
/*     */   
/*     */   public final T getMutableTargetValue$animation_core() {
/*     */     return this.mutableTargetValue;
/*     */   }
/*     */   
/*     */   public final void setMutableTargetValue$animation_core(Object value) {
/*     */     if (!Intrinsics.areEqual(this.mutableTargetValue, value)) {
/*     */       this.mutableTargetValue = (T)value;
/*     */       this.targetValueVector = (V)getTypeConverter().getConvertToVector().invoke(value);
/*     */       this._endVelocity = null;
/*     */       this._durationNanos = -1L;
/*     */     } 
/*     */   }
/*     */   
/*     */   public TargetBasedAnimation(@NotNull VectorizedAnimationSpec<V> animationSpec, @NotNull TwoWayConverter<T, V> typeConverter, Object initialValue, Object targetValue, @Nullable AnimationVector initialVelocityVector) {
/* 197 */     this.animationSpec = animationSpec;
/* 198 */     this.typeConverter = typeConverter;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 203 */     this.mutableTargetValue = (T)targetValue;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 213 */     this.mutableInitialValue = (T)initialValue;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 264 */     this.initialValueVector = (V)getTypeConverter().getConvertToVector().invoke(initialValue);
/* 265 */     this.targetValueVector = (V)getTypeConverter().getConvertToVector().invoke(targetValue);
/*     */     
/* 267 */     if (initialVelocityVector == null || AnimationVectorsKt.copy(initialVelocityVector) == null) AnimationVectorsKt.copy(initialVelocityVector);  ((TargetBasedAnimation)AnimationVectorsKt.copy(initialVelocityVector)).initialVelocityVector = 
/* 268 */       AnimationVectorsKt.newInstance((V)getTypeConverter().getConvertToVector().invoke(initialValue));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 291 */     this._durationNanos = -1L;
/*     */   }
/*     */ 
/*     */   
/*     */   public long getDurationNanos() {
/* 296 */     if (this._durationNanos < 0L) {
/* 297 */       this._durationNanos = this.animationSpec.getDurationNanos(
/* 298 */           this.initialValueVector, 
/* 299 */           this.targetValueVector, 
/* 300 */           this.initialVelocityVector);
/*     */     }
/*     */     
/* 303 */     return this._durationNanos;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private final V getEndVelocity() {
/* 309 */     if (this._endVelocity == null) { V v1 = this.animationSpec.getEndVelocity(
/* 310 */           this.initialValueVector, 
/* 311 */           this.targetValueVector, 
/* 312 */           this.initialVelocityVector);
/* 313 */       V v2 = v1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 507 */       int $i$a$-also-TargetBasedAnimation$endVelocity$1 = 0;
/*     */       this._endVelocity = v2; }
/*     */     
/*     */     return v1;
/*     */   }
/*     */   
/*     */   public final T getMutableInitialValue$animation_core() {
/*     */     return this.mutableInitialValue;
/*     */   }
/*     */   
/*     */   public final void setMutableInitialValue$animation_core(Object value) {
/*     */     if (!Intrinsics.areEqual(value, this.mutableInitialValue)) {
/*     */       this.mutableInitialValue = (T)value;
/*     */       this.initialValueVector = (V)getTypeConverter().getConvertToVector().invoke(value);
/*     */       this._endVelocity = null;
/*     */       this._durationNanos = -1L;
/*     */     } 
/*     */   }
/*     */   
/*     */   public final T getInitialValue() {
/*     */     return this.mutableInitialValue;
/*     */   }
/*     */   
/*     */   public T getTargetValue() {
/*     */     return this.mutableTargetValue;
/*     */   }
/*     */   
/*     */   public TargetBasedAnimation(@NotNull AnimationSpec animationSpec, @NotNull TwoWayConverter<T, V> typeConverter, Object initialValue, Object targetValue, @Nullable AnimationVector initialVelocityVector) {
/*     */     this(animationSpec.vectorize(typeConverter), typeConverter, (T)initialValue, (T)targetValue, (V)initialVelocityVector);
/*     */   }
/*     */   
/*     */   public boolean isInfinite() {
/*     */     return this.animationSpec.isInfinite();
/*     */   }
/*     */   
/*     */   public T getValueFromNanos(long playTimeNanos) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: lload_1
/*     */     //   2: invokevirtual isFinishedFromNanos : (J)Z
/*     */     //   5: ifne -> 147
/*     */     //   8: aload_0
/*     */     //   9: getfield animationSpec : Landroidx/compose/animation/core/VectorizedAnimationSpec;
/*     */     //   12: lload_1
/*     */     //   13: aload_0
/*     */     //   14: getfield initialValueVector : Landroidx/compose/animation/core/AnimationVector;
/*     */     //   17: aload_0
/*     */     //   18: getfield targetValueVector : Landroidx/compose/animation/core/AnimationVector;
/*     */     //   21: aload_0
/*     */     //   22: getfield initialVelocityVector : Landroidx/compose/animation/core/AnimationVector;
/*     */     //   25: invokeinterface getValueFromNanos : (JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;
/*     */     //   30: astore_3
/*     */     //   31: iconst_0
/*     */     //   32: istore #4
/*     */     //   34: iconst_0
/*     */     //   35: istore #5
/*     */     //   37: aload_3
/*     */     //   38: invokevirtual getSize$animation_core : ()I
/*     */     //   41: istore #6
/*     */     //   43: iload #5
/*     */     //   45: iload #6
/*     */     //   47: if_icmpge -> 129
/*     */     //   50: aload_3
/*     */     //   51: iload #5
/*     */     //   53: invokevirtual get$animation_core : (I)F
/*     */     //   56: invokestatic isNaN : (F)Z
/*     */     //   59: ifne -> 66
/*     */     //   62: iconst_1
/*     */     //   63: goto -> 67
/*     */     //   66: iconst_0
/*     */     //   67: istore #7
/*     */     //   69: nop
/*     */     //   70: iconst_0
/*     */     //   71: istore #8
/*     */     //   73: nop
/*     */     //   74: iload #7
/*     */     //   76: ifne -> 122
/*     */     //   79: iconst_0
/*     */     //   80: istore #9
/*     */     //   82: new java/lang/StringBuilder
/*     */     //   85: dup
/*     */     //   86: invokespecial <init> : ()V
/*     */     //   89: ldc 'AnimationVector cannot contain a NaN. '
/*     */     //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   94: aload_3
/*     */     //   95: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   98: ldc '. Animation: '
/*     */     //   100: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   103: aload_0
/*     */     //   104: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   107: ldc ', playTimeNanos: '
/*     */     //   109: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   112: lload_1
/*     */     //   113: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*     */     //   116: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   119: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   122: nop
/*     */     //   123: iinc #5, 1
/*     */     //   126: goto -> 43
/*     */     //   129: aload_0
/*     */     //   130: invokevirtual getTypeConverter : ()Landroidx/compose/animation/core/TwoWayConverter;
/*     */     //   133: invokeinterface getConvertFromVector : ()Lkotlin/jvm/functions/Function1;
/*     */     //   138: aload_3
/*     */     //   139: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   144: goto -> 151
/*     */     //   147: aload_0
/*     */     //   148: invokevirtual getTargetValue : ()Ljava/lang/Object;
/*     */     //   151: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #272	-> 0
/*     */     //   #273	-> 8
/*     */     //   #274	-> 12
/*     */     //   #275	-> 17
/*     */     //   #273	-> 25
/*     */     //   #276	-> 30
/*     */     //   #278	-> 34
/*     */     //   #279	-> 50
/*     */     //   #279	-> 69
/*     */     //   #500	-> 73
/*     */     //   #503	-> 74
/*     */     //   #504	-> 79
/*     */     //   #280	-> 82
/*     */     //   #281	-> 112
/*     */     //   #280	-> 113
/*     */     //   #504	-> 119
/*     */     //   #506	-> 122
/*     */     //   #278	-> 123
/*     */     //   #284	-> 129
/*     */     //   #276	-> 144
/*     */     //   #287	-> 147
/*     */     //   #272	-> 151
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   82	37	9	$i$a$-checkPrecondition-TargetBasedAnimation$getValueFromNanos$1$1	I
/*     */     //   73	50	8	$i$f$checkPrecondition	I
/*     */     //   70	53	7	value$iv	Z
/*     */     //   37	92	5	i	I
/*     */     //   34	110	4	$i$a$-let-TargetBasedAnimation$getValueFromNanos$1	I
/*     */     //   31	113	3	it	Landroidx/compose/animation/core/AnimationVector;
/*     */     //   0	152	0	this	Landroidx/compose/animation/core/TargetBasedAnimation;
/*     */     //   0	152	1	playTimeNanos	J
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public V getVelocityVectorFromNanos(long playTimeNanos) {
/*     */     return !isFinishedFromNanos(playTimeNanos) ? this.animationSpec.getVelocityFromNanos(playTimeNanos, this.initialValueVector, this.targetValueVector, this.initialVelocityVector) : getEndVelocity();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "TargetBasedAnimation: " + getInitialValue() + " -> " + getTargetValue() + ",initial velocity: " + this.initialVelocityVector + ", duration: " + AnimationKt.getDurationMillis(this) + " ms,animationSpec: " + this.animationSpec;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\TargetBasedAnimation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */