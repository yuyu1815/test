/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.SnapshotStateKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.RangesKt;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000z\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\017\n\002\030\002\n\002\b\027\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\b\b\007\030\000*\004\b\000\020\001*\b\b\001\020\002*\0020\0032\0020\004B/\b\027\022\006\020\005\032\0028\000\022\022\020\006\032\016\022\004\022\0028\000\022\004\022\0028\0010\007\022\n\b\002\020\b\032\004\030\0018\000¢\006\002\020\tB7\022\006\020\005\032\0028\000\022\022\020\006\032\016\022\004\022\0028\000\022\004\022\0028\0010\007\022\n\b\002\020\b\032\004\030\0018\000\022\b\b\002\020\n\032\0020\013¢\006\002\020\fJY\020=\032\016\022\004\022\0028\000\022\004\022\0028\0010>2\006\020?\032\0028\0002\f\020@\032\b\022\004\022\0028\0000A2'\b\002\020B\032!\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\000\022\004\022\0020D\030\0010C¢\006\002\bEH@¢\006\002\020FJe\020G\032\016\022\004\022\0028\000\022\004\022\0028\0010>2\006\020,\032\0028\0002\016\b\002\020@\032\b\022\004\022\0028\0000H2\b\b\002\020?\032\0028\0002'\b\002\020B\032!\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\000\022\004\022\0020D\030\0010C¢\006\002\bEH@¢\006\002\020IJ\f\020J\032\b\022\004\022\0028\0000KJ\025\020L\032\0028\0002\006\0206\032\0028\000H\002¢\006\002\020MJ\b\020N\032\0020DH\002J]\020O\032\016\022\004\022\0028\000\022\004\022\0028\0010>2\022\020P\032\016\022\004\022\0028\000\022\004\022\0028\0010Q2\006\020?\032\0028\0002%\020B\032!\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\000\022\004\022\0020D\030\0010C¢\006\002\bEH@¢\006\002\020RJ\026\020S\032\0020D2\006\020,\032\0028\000H@¢\006\002\020TJ\016\020U\032\0020DH@¢\006\002\020VJ#\020W\032\0020D2\n\b\002\020\037\032\004\030\0018\0002\n\b\002\0203\032\004\030\0018\000¢\006\002\020XR\032\020\r\032\b\022\004\022\0028\0000\016X\004¢\006\b\n\000\032\004\b\017\020\020R \020\021\032\016\022\004\022\0028\000\022\004\022\0028\0010\022X\004¢\006\b\n\000\032\004\b\023\020\024R+\020\027\032\0020\0262\006\020\025\032\0020\0268F@BX\002¢\006\022\n\004\b\033\020\034\032\004\b\027\020\030\"\004\b\031\020\032R\021\020\n\032\0020\013¢\006\b\n\000\032\004\b\035\020\036R$\020\037\032\004\030\0018\0002\b\020\025\032\004\030\0018\000@BX\016¢\006\n\n\002\020\"\032\004\b \020!R\020\020#\032\0028\001X\016¢\006\004\n\002\020$R\016\020%\032\0020&X\004¢\006\002\n\000R\026\020'\032\0028\001X\004¢\006\n\n\002\020$\022\004\b(\020)R\026\020*\032\0028\001X\004¢\006\n\n\002\020$\022\004\b+\020)R+\020,\032\0028\0002\006\020\025\032\0028\0008F@BX\002¢\006\022\n\004\b0\020\034\032\004\b-\020!\"\004\b.\020/R\035\020\006\032\016\022\004\022\0028\000\022\004\022\0028\0010\007¢\006\b\n\000\032\004\b1\0202R$\0203\032\004\030\0018\0002\b\020\025\032\004\030\0018\000@BX\016¢\006\n\n\002\020\"\032\004\b4\020!R\020\0205\032\0028\001X\016¢\006\004\n\002\020$R\021\0206\032\0028\0008F¢\006\006\032\004\b7\020!R\021\0208\032\0028\0008F¢\006\006\032\004\b9\020!R\021\020:\032\0028\0018F¢\006\006\032\004\b;\020<R\022\020\b\032\004\030\0018\000X\004¢\006\004\n\002\020\"¨\006Y"}, d2 = {"Landroidx/compose/animation/core/Animatable;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "", "initialValue", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "visibilityThreshold", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)V", "label", "", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/String;)V", "defaultSpringSpec", "Landroidx/compose/animation/core/SpringSpec;", "getDefaultSpringSpec$animation_core", "()Landroidx/compose/animation/core/SpringSpec;", "internalState", "Landroidx/compose/animation/core/AnimationState;", "getInternalState$animation_core", "()Landroidx/compose/animation/core/AnimationState;", "<set-?>", "", "isRunning", "()Z", "setRunning", "(Z)V", "isRunning$delegate", "Landroidx/compose/runtime/MutableState;", "getLabel", "()Ljava/lang/String;", "lowerBound", "getLowerBound", "()Ljava/lang/Object;", "Ljava/lang/Object;", "lowerBoundVector", "Landroidx/compose/animation/core/AnimationVector;", "mutatorMutex", "Landroidx/compose/animation/core/MutatorMutex;", "negativeInfinityBounds", "getNegativeInfinityBounds$annotations", "()V", "positiveInfinityBounds", "getPositiveInfinityBounds$annotations", "targetValue", "getTargetValue", "setTargetValue", "(Ljava/lang/Object;)V", "targetValue$delegate", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "upperBound", "getUpperBound", "upperBoundVector", "value", "getValue", "velocity", "getVelocity", "velocityVector", "getVelocityVector", "()Landroidx/compose/animation/core/AnimationVector;", "animateDecay", "Landroidx/compose/animation/core/AnimationResult;", "initialVelocity", "animationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "Landroidx/compose/animation/core/AnimationSpec;", "(Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asState", "Landroidx/compose/runtime/State;", "clampToBounds", "(Ljava/lang/Object;)Ljava/lang/Object;", "endAnimation", "runAnimation", "animation", "Landroidx/compose/animation/core/Animation;", "(Landroidx/compose/animation/core/Animation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBounds", "(Ljava/lang/Object;Ljava/lang/Object;)V", "animation-core"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nAnimatable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n*L\n1#1,507:1\n81#2:508\n107#2,2:509\n81#2:511\n107#2,2:512\n1#3:514\n54#4,7:515\n*S KotlinDebug\n*F\n+ 1 Animatable.kt\nandroidx/compose/animation/core/Animatable\n*L\n98#1:508\n98#1:509,2\n105#1:511\n105#1:512,2\n179#1:515,7\n*E\n"})
/*     */ public final class Animatable<T, V extends AnimationVector>
/*     */ {
/*     */   @NotNull
/*     */   private final TwoWayConverter<T, V> typeConverter;
/*     */   @Nullable
/*     */   private final T visibilityThreshold;
/*     */   @NotNull
/*     */   private final String label;
/*     */   @NotNull
/*     */   private final AnimationState<T, V> internalState;
/*     */   @NotNull
/*     */   private final MutableState isRunning$delegate;
/*     */   @NotNull
/*     */   private final MutableState targetValue$delegate;
/*     */   @Nullable
/*     */   private T lowerBound;
/*     */   
/*     */   public Animatable(Object initialValue, @NotNull TwoWayConverter<T, V> typeConverter, @Nullable Object visibilityThreshold, @NotNull String label) {
/*  54 */     this.typeConverter = typeConverter;
/*  55 */     this.visibilityThreshold = (T)visibilityThreshold;
/*  56 */     this.label = label;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  72 */     this.internalState = new AnimationState<>(
/*  73 */         this.typeConverter, 
/*  74 */         initialValue, null, 0L, 0L, false, 60, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  98 */     this.isRunning$delegate = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(false), null, 2, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 105 */     this.targetValue$delegate = SnapshotStateKt.mutableStateOf$default(initialValue, null, 2, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 130 */     this.mutatorMutex = new MutatorMutex();
/*     */     
/* 132 */     this.defaultSpringSpec = new SpringSpec<>(0.0F, 0.0F, this.visibilityThreshold, 3, null);
/*     */ 
/*     */     
/* 135 */     V v2 = getVelocityVector(), v1 = 
/* 136 */       (V)((v2 instanceof AnimationVector1D) ? AnimatableKt.access$getNegativeInfinityBounds1D$p() : (
/* 137 */       (v2 instanceof AnimationVector2D) ? AnimatableKt.access$getNegativeInfinityBounds2D$p() : (
/* 138 */       (v2 instanceof AnimationVector3D) ? AnimatableKt.access$getNegativeInfinityBounds3D$p() : 
/* 139 */       AnimatableKt.access$getNegativeInfinityBounds4D$p())));
/*     */     
/*     */     Intrinsics.checkNotNull(v1, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
/*     */     this.negativeInfinityBounds = v1;
/* 143 */     v2 = getVelocityVector(); v1 = 
/* 144 */       (v2 instanceof AnimationVector1D) ? (V)AnimatableKt.access$getPositiveInfinityBounds1D$p() : (
/* 145 */       (v2 instanceof AnimationVector2D) ? (V)AnimatableKt.access$getPositiveInfinityBounds2D$p() : (
/* 146 */       (v2 instanceof AnimationVector3D) ? (V)AnimatableKt.access$getPositiveInfinityBounds3D$p() : 
/* 147 */       (V)AnimatableKt.access$getPositiveInfinityBounds4D$p()));
/*     */     Intrinsics.checkNotNull(v1, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable");
/*     */     this.positiveInfinityBounds = v1;
/* 150 */     this.lowerBoundVector = this.negativeInfinityBounds;
/* 151 */     this.upperBoundVector = this.positiveInfinityBounds;
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
/*     */   @Nullable
/*     */   private T upperBound;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   private final MutatorMutex mutatorMutex;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   private final SpringSpec<T> defaultSpringSpec;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   private final V negativeInfinityBounds;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   private final V positiveInfinityBounds;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   private V lowerBoundVector;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   private V upperBoundVector;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int $stable = 8;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   public final TwoWayConverter<T, V> getTypeConverter() {
/*     */     return this.typeConverter;
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
/*     */   @NotNull
/*     */   public final String getLabel() {
/*     */     return this.label;
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
/*     */   @NotNull
/*     */   public final AnimationState<T, V> getInternalState$animation_core() {
/*     */     return this.internalState;
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
/*     */   public final T getValue() {
/*     */     return this.internalState.getValue();
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
/*     */   @NotNull
/*     */   public final V getVelocityVector() {
/*     */     return this.internalState.getVelocityVector();
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
/*     */   public final T getVelocity() {
/*     */     return (T)this.typeConverter.getConvertFromVector().invoke(getVelocityVector());
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
/*     */   public final boolean isRunning() {
/*     */     State state = (State)this.isRunning$delegate;
/*     */     KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 508 */     return ((Boolean)state.getValue()).booleanValue(); } private final void setRunning(boolean <set-?>) { MutableState mutableState = this.isRunning$delegate; Object object = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 509 */     mutableState.setValue(value$iv); } public final T getTargetValue() { State state = (State)this.targetValue$delegate; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 511 */     return (T)state.getValue(); } private final void setTargetValue(Object <set-?>) { MutableState mutableState = this.targetValue$delegate; KProperty property$iv = null; int $i$f$setValue = 0;
/* 512 */     mutableState.setValue(<set-?>); }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final T getLowerBound() {
/*     */     return this.lowerBound;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final T getUpperBound() {
/*     */     return this.upperBound;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final SpringSpec<T> getDefaultSpringSpec$animation_core() {
/*     */     return this.defaultSpringSpec;
/*     */   }
/*     */   
/*     */   public final void updateBounds(@Nullable Object lowerBound, @Nullable Object upperBound) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: dup
/*     */     //   2: ifnull -> 34
/*     */     //   5: astore #6
/*     */     //   7: iconst_0
/*     */     //   8: istore #7
/*     */     //   10: aload_0
/*     */     //   11: getfield typeConverter : Landroidx/compose/animation/core/TwoWayConverter;
/*     */     //   14: invokeinterface getConvertToVector : ()Lkotlin/jvm/functions/Function1;
/*     */     //   19: aload #6
/*     */     //   21: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   26: checkcast androidx/compose/animation/core/AnimationVector
/*     */     //   29: nop
/*     */     //   30: dup
/*     */     //   31: ifnonnull -> 39
/*     */     //   34: pop
/*     */     //   35: aload_0
/*     */     //   36: getfield negativeInfinityBounds : Landroidx/compose/animation/core/AnimationVector;
/*     */     //   39: astore_3
/*     */     //   40: aload_2
/*     */     //   41: dup
/*     */     //   42: ifnull -> 74
/*     */     //   45: astore #7
/*     */     //   47: iconst_0
/*     */     //   48: istore #8
/*     */     //   50: aload_0
/*     */     //   51: getfield typeConverter : Landroidx/compose/animation/core/TwoWayConverter;
/*     */     //   54: invokeinterface getConvertToVector : ()Lkotlin/jvm/functions/Function1;
/*     */     //   59: aload #7
/*     */     //   61: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   66: checkcast androidx/compose/animation/core/AnimationVector
/*     */     //   69: nop
/*     */     //   70: dup
/*     */     //   71: ifnonnull -> 79
/*     */     //   74: pop
/*     */     //   75: aload_0
/*     */     //   76: getfield positiveInfinityBounds : Landroidx/compose/animation/core/AnimationVector;
/*     */     //   79: astore #4
/*     */     //   81: iconst_0
/*     */     //   82: istore #5
/*     */     //   84: aload_3
/*     */     //   85: invokevirtual getSize$animation_core : ()I
/*     */     //   88: istore #6
/*     */     //   90: iload #5
/*     */     //   92: iload #6
/*     */     //   94: if_icmpge -> 184
/*     */     //   97: aload_3
/*     */     //   98: iload #5
/*     */     //   100: invokevirtual get$animation_core : (I)F
/*     */     //   103: aload #4
/*     */     //   105: iload #5
/*     */     //   107: invokevirtual get$animation_core : (I)F
/*     */     //   110: fcmpg
/*     */     //   111: ifgt -> 118
/*     */     //   114: iconst_1
/*     */     //   115: goto -> 119
/*     */     //   118: iconst_0
/*     */     //   119: istore #7
/*     */     //   121: iconst_0
/*     */     //   122: istore #8
/*     */     //   124: nop
/*     */     //   125: iload #7
/*     */     //   127: ifne -> 177
/*     */     //   130: iconst_0
/*     */     //   131: istore #9
/*     */     //   133: new java/lang/StringBuilder
/*     */     //   136: dup
/*     */     //   137: invokespecial <init> : ()V
/*     */     //   140: ldc 'Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: '
/*     */     //   142: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   145: aload_3
/*     */     //   146: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   149: ldc_w ' is greater than upper bound '
/*     */     //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   155: aload #4
/*     */     //   157: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   160: ldc_w ' on index '
/*     */     //   163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   166: iload #5
/*     */     //   168: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   171: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   174: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   177: nop
/*     */     //   178: iinc #5, 1
/*     */     //   181: goto -> 90
/*     */     //   184: aload_0
/*     */     //   185: aload_3
/*     */     //   186: putfield lowerBoundVector : Landroidx/compose/animation/core/AnimationVector;
/*     */     //   189: aload_0
/*     */     //   190: aload #4
/*     */     //   192: putfield upperBoundVector : Landroidx/compose/animation/core/AnimationVector;
/*     */     //   195: aload_0
/*     */     //   196: aload_2
/*     */     //   197: putfield upperBound : Ljava/lang/Object;
/*     */     //   200: aload_0
/*     */     //   201: aload_1
/*     */     //   202: putfield lowerBound : Ljava/lang/Object;
/*     */     //   205: aload_0
/*     */     //   206: invokevirtual isRunning : ()Z
/*     */     //   209: ifne -> 243
/*     */     //   212: aload_0
/*     */     //   213: aload_0
/*     */     //   214: invokevirtual getValue : ()Ljava/lang/Object;
/*     */     //   217: invokespecial clampToBounds : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   220: astore #5
/*     */     //   222: aload #5
/*     */     //   224: aload_0
/*     */     //   225: invokevirtual getValue : ()Ljava/lang/Object;
/*     */     //   228: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   231: ifne -> 243
/*     */     //   234: aload_0
/*     */     //   235: getfield internalState : Landroidx/compose/animation/core/AnimationState;
/*     */     //   238: aload #5
/*     */     //   240: invokevirtual setValue$animation_core : (Ljava/lang/Object;)V
/*     */     //   243: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #171	-> 0
/*     */     //   #514	-> 7
/*     */     //   #171	-> 10
/*     */     //   #171	-> 29
/*     */     //   #171	-> 30
/*     */     //   #172	-> 35
/*     */     //   #171	-> 39
/*     */     //   #174	-> 40
/*     */     //   #514	-> 47
/*     */     //   #174	-> 50
/*     */     //   #174	-> 69
/*     */     //   #174	-> 70
/*     */     //   #175	-> 75
/*     */     //   #174	-> 79
/*     */     //   #177	-> 81
/*     */     //   #179	-> 97
/*     */     //   #515	-> 124
/*     */     //   #518	-> 125
/*     */     //   #519	-> 130
/*     */     //   #180	-> 133
/*     */     //   #181	-> 145
/*     */     //   #180	-> 146
/*     */     //   #181	-> 149
/*     */     //   #180	-> 152
/*     */     //   #182	-> 155
/*     */     //   #180	-> 157
/*     */     //   #182	-> 160
/*     */     //   #180	-> 163
/*     */     //   #182	-> 166
/*     */     //   #180	-> 168
/*     */     //   #519	-> 174
/*     */     //   #521	-> 177
/*     */     //   #177	-> 178
/*     */     //   #186	-> 184
/*     */     //   #187	-> 189
/*     */     //   #189	-> 195
/*     */     //   #190	-> 200
/*     */     //   #191	-> 205
/*     */     //   #192	-> 212
/*     */     //   #193	-> 222
/*     */     //   #194	-> 234
/*     */     //   #197	-> 243
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   10	19	7	$i$a$-run-Animatable$updateBounds$lowerBoundVector$1	I
/*     */     //   7	22	6	$this$updateBounds_u24lambda_u240	Ljava/lang/Object;
/*     */     //   50	19	8	$i$a$-run-Animatable$updateBounds$upperBoundVector$1	I
/*     */     //   47	22	7	$this$updateBounds_u24lambda_u241	Ljava/lang/Object;
/*     */     //   133	41	9	$i$a$-checkPrecondition-Animatable$updateBounds$1	I
/*     */     //   124	54	8	$i$f$checkPrecondition	I
/*     */     //   121	57	7	value$iv	Z
/*     */     //   84	100	5	i	I
/*     */     //   222	21	5	clampedValue	Ljava/lang/Object;
/*     */     //   40	204	3	lowerBoundVector	Landroidx/compose/animation/core/AnimationVector;
/*     */     //   81	163	4	upperBoundVector	Landroidx/compose/animation/core/AnimationVector;
/*     */     //   0	244	0	this	Landroidx/compose/animation/core/Animatable;
/*     */     //   0	244	1	lowerBound	Ljava/lang/Object;
/*     */     //   0	244	2	upperBound	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object animateTo(Object targetValue, @NotNull AnimationSpec<T> animationSpec, Object initialVelocity, @Nullable Function1<? super Animatable<T, V>, Unit> block, @NotNull Continuation<? super AnimationResult<T, V>> $completion) {
/*     */     T t = getValue();
/*     */     TwoWayConverter<T, V> twoWayConverter = this.typeConverter;
/*     */     TargetBasedAnimation<T, V> anim = AnimationKt.TargetBasedAnimation(animationSpec, twoWayConverter, t, (T)targetValue, (T)initialVelocity);
/*     */     return runAnimation(anim, (T)initialVelocity, block, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object animateDecay(Object initialVelocity, @NotNull DecayAnimationSpec<T> animationSpec, @Nullable Function1<? super Animatable<T, V>, Unit> block, @NotNull Continuation<? super AnimationResult<T, V>> $completion) {
/*     */     T t = getValue();
/*     */     AnimationVector animationVector = (AnimationVector)this.typeConverter.getConvertToVector().invoke(initialVelocity);
/*     */     TwoWayConverter<T, V> twoWayConverter = this.typeConverter;
/*     */     DecayAnimation<T, V> anim = new DecayAnimation<>(animationSpec, twoWayConverter, t, (V)animationVector);
/*     */     return runAnimation(anim, (T)initialVelocity, block, $completion);
/*     */   }
/*     */   
/*     */   private final Object runAnimation(Animation<T, V> animation, Object initialVelocity, Function1<? super Animatable<T, V>, Unit> block, Continuation $completion) {
/*     */     long startTime = this.internalState.getLastFrameTimeNanos();
/*     */     return MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$runAnimation$2((T)initialVelocity, animation, startTime, block, null), $completion, 1, null);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "Animatable.kt", l = {312}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"endState", "clampingNeeded"}, m = "invokeSuspend", c = "androidx.compose.animation.core.Animatable$runAnimation$2")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\020\000\032\016\022\004\022\002H\002\022\004\022\002H\0030\001\"\004\b\000\020\002\"\b\b\001\020\003*\0020\004H@"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationResult;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;"})
/*     */   static final class Animatable$runAnimation$2 extends SuspendLambda implements Function1<Continuation<? super AnimationResult<T, V>>, Object> {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     Animatable$runAnimation$2(Object $initialVelocity, Animation<T, V> $animation, long $startTime, Function1<Animatable<T, V>, Unit> $block, Continuation $completion) {
/*     */       super(1, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #5
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 258, 0 -> 32, 1 -> 184
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: nop
/*     */       //   37: aload_0
/*     */       //   38: getfield this$0 : Landroidx/compose/animation/core/Animatable;
/*     */       //   41: invokevirtual getInternalState$animation_core : ()Landroidx/compose/animation/core/AnimationState;
/*     */       //   44: aload_0
/*     */       //   45: getfield this$0 : Landroidx/compose/animation/core/Animatable;
/*     */       //   48: invokevirtual getTypeConverter : ()Landroidx/compose/animation/core/TwoWayConverter;
/*     */       //   51: invokeinterface getConvertToVector : ()Lkotlin/jvm/functions/Function1;
/*     */       //   56: aload_0
/*     */       //   57: getfield $initialVelocity : Ljava/lang/Object;
/*     */       //   60: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   65: checkcast androidx/compose/animation/core/AnimationVector
/*     */       //   68: invokevirtual setVelocityVector$animation_core : (Landroidx/compose/animation/core/AnimationVector;)V
/*     */       //   71: aload_0
/*     */       //   72: getfield this$0 : Landroidx/compose/animation/core/Animatable;
/*     */       //   75: aload_0
/*     */       //   76: getfield $animation : Landroidx/compose/animation/core/Animation;
/*     */       //   79: invokeinterface getTargetValue : ()Ljava/lang/Object;
/*     */       //   84: invokestatic access$setTargetValue : (Landroidx/compose/animation/core/Animatable;Ljava/lang/Object;)V
/*     */       //   87: aload_0
/*     */       //   88: getfield this$0 : Landroidx/compose/animation/core/Animatable;
/*     */       //   91: iconst_1
/*     */       //   92: invokestatic access$setRunning : (Landroidx/compose/animation/core/Animatable;Z)V
/*     */       //   95: aload_0
/*     */       //   96: getfield this$0 : Landroidx/compose/animation/core/Animatable;
/*     */       //   99: invokevirtual getInternalState$animation_core : ()Landroidx/compose/animation/core/AnimationState;
/*     */       //   102: aconst_null
/*     */       //   103: aconst_null
/*     */       //   104: lconst_0
/*     */       //   105: ldc2_w -9223372036854775808
/*     */       //   108: iconst_0
/*     */       //   109: bipush #23
/*     */       //   111: aconst_null
/*     */       //   112: invokestatic copy$default : (Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;JJZILjava/lang/Object;)Landroidx/compose/animation/core/AnimationState;
/*     */       //   115: astore_2
/*     */       //   116: new kotlin/jvm/internal/Ref$BooleanRef
/*     */       //   119: dup
/*     */       //   120: invokespecial <init> : ()V
/*     */       //   123: astore_3
/*     */       //   124: aload_2
/*     */       //   125: aload_0
/*     */       //   126: getfield $animation : Landroidx/compose/animation/core/Animation;
/*     */       //   129: aload_0
/*     */       //   130: getfield $startTime : J
/*     */       //   133: new androidx/compose/animation/core/Animatable$runAnimation$2$1
/*     */       //   136: dup
/*     */       //   137: aload_0
/*     */       //   138: getfield this$0 : Landroidx/compose/animation/core/Animatable;
/*     */       //   141: aload_2
/*     */       //   142: aload_0
/*     */       //   143: getfield $block : Lkotlin/jvm/functions/Function1;
/*     */       //   146: aload_3
/*     */       //   147: invokespecial <init> : (Landroidx/compose/animation/core/Animatable;Landroidx/compose/animation/core/AnimationState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/Ref$BooleanRef;)V
/*     */       //   150: checkcast kotlin/jvm/functions/Function1
/*     */       //   153: aload_0
/*     */       //   154: checkcast kotlin/coroutines/Continuation
/*     */       //   157: aload_0
/*     */       //   158: aload_2
/*     */       //   159: putfield L$0 : Ljava/lang/Object;
/*     */       //   162: aload_0
/*     */       //   163: aload_3
/*     */       //   164: putfield L$1 : Ljava/lang/Object;
/*     */       //   167: aload_0
/*     */       //   168: iconst_1
/*     */       //   169: putfield label : I
/*     */       //   172: invokestatic animate : (Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/Animation;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   175: dup
/*     */       //   176: aload #5
/*     */       //   178: if_acmpne -> 206
/*     */       //   181: aload #5
/*     */       //   183: areturn
/*     */       //   184: aload_0
/*     */       //   185: getfield L$1 : Ljava/lang/Object;
/*     */       //   188: checkcast kotlin/jvm/internal/Ref$BooleanRef
/*     */       //   191: astore_3
/*     */       //   192: aload_0
/*     */       //   193: getfield L$0 : Ljava/lang/Object;
/*     */       //   196: checkcast androidx/compose/animation/core/AnimationState
/*     */       //   199: astore_2
/*     */       //   200: nop
/*     */       //   201: aload_1
/*     */       //   202: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   205: aload_1
/*     */       //   206: pop
/*     */       //   207: aload_3
/*     */       //   208: getfield element : Z
/*     */       //   211: ifeq -> 220
/*     */       //   214: getstatic androidx/compose/animation/core/AnimationEndReason.BoundReached : Landroidx/compose/animation/core/AnimationEndReason;
/*     */       //   217: goto -> 223
/*     */       //   220: getstatic androidx/compose/animation/core/AnimationEndReason.Finished : Landroidx/compose/animation/core/AnimationEndReason;
/*     */       //   223: astore #4
/*     */       //   225: aload_0
/*     */       //   226: getfield this$0 : Landroidx/compose/animation/core/Animatable;
/*     */       //   229: invokestatic access$endAnimation : (Landroidx/compose/animation/core/Animatable;)V
/*     */       //   232: new androidx/compose/animation/core/AnimationResult
/*     */       //   235: dup
/*     */       //   236: aload_2
/*     */       //   237: aload #4
/*     */       //   239: invokespecial <init> : (Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/AnimationEndReason;)V
/*     */       //   242: astore_2
/*     */       //   243: goto -> 256
/*     */       //   246: astore_3
/*     */       //   247: aload_0
/*     */       //   248: getfield this$0 : Landroidx/compose/animation/core/Animatable;
/*     */       //   251: invokestatic access$endAnimation : (Landroidx/compose/animation/core/Animatable;)V
/*     */       //   254: aload_3
/*     */       //   255: athrow
/*     */       //   256: aload_2
/*     */       //   257: areturn
/*     */       //   258: new java/lang/IllegalStateException
/*     */       //   261: dup
/*     */       //   262: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   264: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   267: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #302	-> 3
/*     */       //   #303	-> 36
/*     */       //   #304	-> 37
/*     */       //   #305	-> 71
/*     */       //   #306	-> 87
/*     */       //   #308	-> 95
/*     */       //   #309	-> 105
/*     */       //   #308	-> 108
/*     */       //   #311	-> 116
/*     */       //   #312	-> 124
/*     */       //   #313	-> 125
/*     */       //   #314	-> 129
/*     */       //   #312	-> 133
/*     */       //   #302	-> 181
/*     */       //   #328	-> 206
/*     */       //   #329	-> 225
/*     */       //   #330	-> 232
/*     */       //   #331	-> 246
/*     */       //   #333	-> 247
/*     */       //   #334	-> 254
/*     */       //   #303	-> 257
/*     */       //   #302	-> 258
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   116	68	2	endState	Landroidx/compose/animation/core/AnimationState;
/*     */       //   200	42	2	endState	Landroidx/compose/animation/core/AnimationState;
/*     */       //   124	60	3	clampingNeeded	Lkotlin/jvm/internal/Ref$BooleanRef;
/*     */       //   192	28	3	clampingNeeded	Lkotlin/jvm/internal/Ref$BooleanRef;
/*     */       //   247	9	3	e	Ljava/util/concurrent/CancellationException;
/*     */       //   225	17	4	endReason	Landroidx/compose/animation/core/AnimationEndReason;
/*     */       //   36	222	0	this	Landroidx/compose/animation/core/Animatable$runAnimation$2;
/*     */       //   36	222	1	$result	Ljava/lang/Object;
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   36	175	246	java/util/concurrent/CancellationException
/*     */       //   200	243	246	java/util/concurrent/CancellationException
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@NotNull Continuation<? super Animatable$runAnimation$2> $completion) {
/*     */       return (Continuation<Unit>)new Animatable$runAnimation$2(this.$initialVelocity, this.$animation, this.$startTime, this.$block, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@Nullable Continuation<?> p1) {
/*     */       return ((Animatable$runAnimation$2)create(p1)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private final T clampToBounds(Object value) {
/*     */     if (Intrinsics.areEqual(this.lowerBoundVector, this.negativeInfinityBounds) && Intrinsics.areEqual(this.upperBoundVector, this.positiveInfinityBounds))
/*     */       return (T)value; 
/*     */     AnimationVector valueVector = (AnimationVector)this.typeConverter.getConvertToVector().invoke(value);
/*     */     boolean clamped = false;
/*     */     for (int i = 0, j = valueVector.getSize$animation_core(); i < j; i++) {
/*     */       if (valueVector.get$animation_core(i) < this.lowerBoundVector.get$animation_core(i) || valueVector.get$animation_core(i) > this.upperBoundVector.get$animation_core(i)) {
/*     */         clamped = true;
/*     */         valueVector.set$animation_core(i, RangesKt.coerceIn(valueVector.get$animation_core(i), this.lowerBoundVector.get$animation_core(i), this.upperBoundVector.get$animation_core(i)));
/*     */       } 
/*     */     } 
/*     */     if (clamped)
/*     */       return (T)this.typeConverter.getConvertFromVector().invoke(valueVector); 
/*     */     return (T)value;
/*     */   }
/*     */   
/*     */   private final void endAnimation() {
/*     */     AnimationState<T, V> animationState1 = this.internalState, $this$endAnimation_u24lambda_u243 = animationState1;
/*     */     int $i$a$-apply-Animatable$endAnimation$1 = 0;
/*     */     $this$endAnimation_u24lambda_u243.getVelocityVector().reset$animation_core();
/*     */     $this$endAnimation_u24lambda_u243.setLastFrameTimeNanos$animation_core(Long.MIN_VALUE);
/*     */     setRunning(false);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object snapTo(Object targetValue, @NotNull Continuation $completion) {
/*     */     if (MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$snapTo$2((T)targetValue, null), $completion, 1, null) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$snapTo$2((T)targetValue, null), $completion, 1, null); 
/*     */     MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$snapTo$2((T)targetValue, null), $completion, 1, null);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "Animatable.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "androidx.compose.animation.core.Animatable$snapTo$2")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\020\000\032\0020\001\"\004\b\000\020\002\"\b\b\001\020\003*\0020\004H@"}, d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;"})
/*     */   static final class Animatable$snapTo$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     Animatable$snapTo$2(Object $targetValue, Continuation $completion) {
/*     */       super(1, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       Object clampedValue;
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           Animatable.this.endAnimation();
/*     */           clampedValue = Animatable.this.clampToBounds(this.$targetValue);
/*     */           Animatable.this.getInternalState$animation_core().setValue$animation_core(clampedValue);
/*     */           Animatable.this.setTargetValue((T)clampedValue);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@NotNull Continuation<? super Animatable$snapTo$2> $completion) {
/*     */       return (Continuation<Unit>)new Animatable$snapTo$2(this.$targetValue, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@Nullable Continuation<?> p1) {
/*     */       return ((Animatable$snapTo$2)create(p1)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object stop(@NotNull Continuation $completion) {
/*     */     if (MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$stop$2(null), $completion, 1, null) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$stop$2(null), $completion, 1, null); 
/*     */     MutatorMutex.mutate$default(this.mutatorMutex, null, new Animatable$stop$2(null), $completion, 1, null);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "Animatable.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "androidx.compose.animation.core.Animatable$stop$2")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\020\000\032\0020\001\"\004\b\000\020\002\"\b\b\001\020\003*\0020\004H@"}, d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;"})
/*     */   static final class Animatable$stop$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     Animatable$stop$2(Continuation $completion) {
/*     */       super(1, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           Animatable.this.endAnimation();
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@NotNull Continuation<? super Animatable$stop$2> $completion) {
/*     */       return (Continuation<Unit>)new Animatable$stop$2($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@Nullable Continuation<?> p1) {
/*     */       return ((Animatable$stop$2)create(p1)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final State<T> asState() {
/*     */     return this.internalState;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\Animatable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */