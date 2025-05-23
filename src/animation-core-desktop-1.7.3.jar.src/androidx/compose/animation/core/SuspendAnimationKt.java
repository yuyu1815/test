/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.compose.runtime.MonotonicFrameClockKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.Boxing;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.FloatCompanionObject;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Ref;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000h\n\000\n\002\020\007\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\t\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\017\032\001\020\005\032\0020\006\"\004\b\000\020\007\"\b\b\001\020\b*\0020\t2\022\020\n\032\016\022\004\022\002H\007\022\004\022\002H\b0\0132\006\020\f\032\002H\0072\006\020\r\032\002H\0072\n\b\002\020\016\032\004\030\001H\0072\016\b\002\020\017\032\b\022\004\022\002H\0070\02026\020\021\0322\022\023\022\021H\007¢\006\f\b\023\022\b\b\024\022\004\b\b(\025\022\023\022\021H\007¢\006\f\b\023\022\b\b\024\022\004\b\b(\026\022\004\022\0020\0060\022H@¢\006\002\020\027\032p\020\005\032\0020\0062\006\020\f\032\0020\0012\006\020\r\032\0020\0012\b\b\002\020\016\032\0020\0012\016\b\002\020\017\032\b\022\004\022\0020\0010\02026\020\021\0322\022\023\022\0210\001¢\006\f\b\023\022\b\b\024\022\004\b\b(\025\022\023\022\0210\001¢\006\f\b\023\022\b\b\024\022\004\b\b(\026\022\004\022\0020\0060\022H@¢\006\002\020\030\032^\020\031\032\0020\0062\006\020\f\032\0020\0012\006\020\016\032\0020\0012\006\020\017\032\0020\03226\020\021\0322\022\023\022\0210\001¢\006\f\b\023\022\b\b\024\022\004\b\b(\025\022\023\022\0210\001¢\006\f\b\023\022\b\b\024\022\004\b\b(\026\022\004\022\0020\0060\022H@¢\006\002\020\033\032s\020\005\032\0020\006\"\004\b\000\020\007\"\b\b\001\020\b*\0020\t*\016\022\004\022\002H\007\022\004\022\002H\b0\0342\022\020\035\032\016\022\004\022\002H\007\022\004\022\002H\b0\0362\b\b\002\020\037\032\0020 2%\b\002\020\021\032\037\022\020\022\016\022\004\022\002H\007\022\004\022\002H\b0\"\022\004\022\0020\0060!¢\006\002\b#H@¢\006\002\020$\032m\020\031\032\0020\006\"\004\b\000\020\007\"\b\b\001\020\b*\0020\t*\016\022\004\022\002H\007\022\004\022\002H\b0\0342\f\020\017\032\b\022\004\022\002H\0070%2\b\b\002\020&\032\0020'2%\b\002\020\021\032\037\022\020\022\016\022\004\022\002H\007\022\004\022\002H\b0\"\022\004\022\0020\0060!¢\006\002\b#H@¢\006\002\020(\032w\020)\032\0020\006\"\004\b\000\020\007\"\b\b\001\020\b*\0020\t*\016\022\004\022\002H\007\022\004\022\002H\b0\0342\006\020\r\032\002H\0072\016\b\002\020\017\032\b\022\004\022\002H\0070\0202\b\b\002\020&\032\0020'2%\b\002\020\021\032\037\022\020\022\016\022\004\022\002H\007\022\004\022\002H\b0\"\022\004\022\0020\0060!¢\006\002\b#H@¢\006\002\020*\032W\020+\032\002H,\"\004\b\000\020,\"\004\b\001\020\007\"\b\b\002\020\b*\0020\t*\016\022\004\022\002H\007\022\004\022\002H\b0\0362!\020-\032\035\022\023\022\0210 ¢\006\f\b\023\022\b\b\024\022\004\b\b(.\022\004\022\002H,0!H@¢\006\002\020/\032\001\0200\032\0020\006\"\004\b\000\020\007\"\b\b\001\020\b*\0020\t*\016\022\004\022\002H\007\022\004\022\002H\b0\"2\006\020.\032\0020 2\006\0201\032\0020 2\022\0202\032\016\022\004\022\002H\007\022\004\022\002H\b0\0362\022\0203\032\016\022\004\022\002H\007\022\004\022\002H\b0\0342#\020\021\032\037\022\020\022\016\022\004\022\002H\007\022\004\022\002H\b0\"\022\004\022\0020\0060!¢\006\002\b#H\002\032\001\0204\032\0020\006\"\004\b\000\020\007\"\b\b\001\020\b*\0020\t*\016\022\004\022\002H\007\022\004\022\002H\b0\"2\006\020.\032\0020 2\006\020\000\032\0020\0012\022\0202\032\016\022\004\022\002H\007\022\004\022\002H\b0\0362\022\0203\032\016\022\004\022\002H\007\022\004\022\002H\b0\0342#\020\021\032\037\022\020\022\016\022\004\022\002H\007\022\004\022\002H\b0\"\022\004\022\0020\0060!¢\006\002\b#H\002\032<\0205\032\0020\006\"\004\b\000\020\007\"\b\b\001\020\b*\0020\t*\016\022\004\022\002H\007\022\004\022\002H\b0\"2\022\0203\032\016\022\004\022\002H\007\022\004\022\002H\b0\034H\000\"\030\020\000\032\0020\001*\0020\0028@X\004¢\006\006\032\004\b\003\020\004¨\0066"}, d2 = {"durationScale", "", "Lkotlin/coroutines/CoroutineContext;", "getDurationScale", "(Lkotlin/coroutines/CoroutineContext;)F", "animate", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "initialValue", "targetValue", "initialVelocity", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "velocity", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(FFFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateDecay", "Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "(FFLandroidx/compose/animation/core/FloatDecayAnimationSpec;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/AnimationState;", "animation", "Landroidx/compose/animation/core/Animation;", "startTimeNanos", "", "Lkotlin/Function1;", "Landroidx/compose/animation/core/AnimationScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/Animation;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/animation/core/DecayAnimationSpec;", "sequentialAnimation", "", "(Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/DecayAnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "(Landroidx/compose/animation/core/AnimationState;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callWithFrameNanos", "R", "onFrame", "frameTimeNanos", "(Landroidx/compose/animation/core/Animation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doAnimationFrame", "playTimeNanos", "anim", "state", "doAnimationFrameWithScale", "updateState", "animation-core"})
/*     */ @SourceDebugExtension({"SMAP\nSuspendAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendAnimation.kt\nandroidx/compose/animation/core/SuspendAnimationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n*L\n1#1,363:1\n1#2:364\n54#3,7:365\n*S KotlinDebug\n*F\n+ 1 SuspendAnimation.kt\nandroidx/compose/animation/core/SuspendAnimationKt\n*L\n312#1:365,7\n*E\n"})
/*     */ public final class SuspendAnimationKt
/*     */ {
/*     */   @Nullable
/*     */   public static final Object animate(float initialValue, float targetValue, float initialVelocity, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function2<? super Float, ? super Float, Unit> block, @NotNull Continuation<? super Unit> $completion) {
/*  49 */     if (animate(
/*  50 */         VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), 
/*  51 */         Boxing.boxFloat(initialValue), 
/*  52 */         Boxing.boxFloat(targetValue), 
/*  53 */         Boxing.boxFloat(initialVelocity), 
/*  54 */         animationSpec, 
/*  55 */         block, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return animate(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), Boxing.boxFloat(initialValue), Boxing.boxFloat(targetValue), Boxing.boxFloat(initialVelocity), animationSpec, block, $completion);  animate(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), Boxing.boxFloat(initialValue), Boxing.boxFloat(targetValue), Boxing.boxFloat(initialVelocity), animationSpec, block, $completion);
/*     */     return Unit.INSTANCE;
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
/*     */   @Nullable
/*     */   public static final Object animateDecay(float initialValue, float initialVelocity, @NotNull FloatDecayAnimationSpec animationSpec, @NotNull Function2<? super Float, ? super Float, Unit> block, @NotNull Continuation $completion) {
/*  80 */     DecayAnimation<Float, AnimationVector1D> anim = AnimationKt.DecayAnimation(animationSpec, initialValue, initialVelocity);
/*  81 */     if (animate$default(AnimationStateKt.AnimationState$default(initialValue, initialVelocity, 0L, 0L, false, 28, null), anim, 0L, new SuspendAnimationKt$animateDecay$2(block), $completion, 2, null) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return animate$default(AnimationStateKt.AnimationState$default(initialValue, initialVelocity, 0L, 0L, false, 28, null), anim, 0L, new SuspendAnimationKt$animateDecay$2(block), $completion, 2, null);  animate$default(AnimationStateKt.AnimationState$default(initialValue, initialVelocity, 0L, 0L, false, 28, null), anim, 0L, new SuspendAnimationKt$animateDecay$2(block), $completion, 2, null); return Unit.INSTANCE; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\002\n\002\030\002\n\002\020\007\n\002\030\002\n\000\020\000\032\0020\001*\016\022\004\022\0020\003\022\004\022\0020\0040\002H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "invoke"})
/*  82 */   static final class SuspendAnimationKt$animateDecay$2 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> { public final void invoke(@NotNull AnimationScope $this$animate) { Intrinsics.checkNotNullParameter($this$animate, "$this$animate"); this.$block.invoke($this$animate.getValue(), Float.valueOf(((AnimationVector1D)$this$animate.getVelocityVector()).getValue())); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     SuspendAnimationKt$animateDecay$2(Function2<Float, Float, Unit> $block) {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static final <T, V extends AnimationVector> Object animate(@NotNull TwoWayConverter typeConverter, Object initialValue, Object targetValue, @Nullable Object initialVelocity, @NotNull AnimationSpec animationSpec, @NotNull Function2 block, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: dup
/*     */     //   2: ifnull -> 31
/*     */     //   5: astore #9
/*     */     //   7: iconst_0
/*     */     //   8: istore #10
/*     */     //   10: aload_0
/*     */     //   11: invokeinterface getConvertToVector : ()Lkotlin/jvm/functions/Function1;
/*     */     //   16: aload #9
/*     */     //   18: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   23: checkcast androidx/compose/animation/core/AnimationVector
/*     */     //   26: nop
/*     */     //   27: dup
/*     */     //   28: ifnonnull -> 50
/*     */     //   31: pop
/*     */     //   32: aload_0
/*     */     //   33: invokeinterface getConvertToVector : ()Lkotlin/jvm/functions/Function1;
/*     */     //   38: aload_1
/*     */     //   39: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   44: checkcast androidx/compose/animation/core/AnimationVector
/*     */     //   47: invokestatic newInstance : (Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;
/*     */     //   50: astore #7
/*     */     //   52: new androidx/compose/animation/core/TargetBasedAnimation
/*     */     //   55: dup
/*     */     //   56: aload #4
/*     */     //   58: aload_0
/*     */     //   59: aload_1
/*     */     //   60: aload_2
/*     */     //   61: aload #7
/*     */     //   63: invokespecial <init> : (Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;)V
/*     */     //   66: astore #8
/*     */     //   68: new androidx/compose/animation/core/AnimationState
/*     */     //   71: dup
/*     */     //   72: aload_0
/*     */     //   73: aload_1
/*     */     //   74: aload #7
/*     */     //   76: lconst_0
/*     */     //   77: lconst_0
/*     */     //   78: iconst_0
/*     */     //   79: bipush #56
/*     */     //   81: aconst_null
/*     */     //   82: invokespecial <init> : (Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;JJZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   85: aload #8
/*     */     //   87: checkcast androidx/compose/animation/core/Animation
/*     */     //   90: lconst_0
/*     */     //   91: new androidx/compose/animation/core/SuspendAnimationKt$animate$3
/*     */     //   94: dup
/*     */     //   95: aload #5
/*     */     //   97: aload_0
/*     */     //   98: invokespecial <init> : (Lkotlin/jvm/functions/Function2;Landroidx/compose/animation/core/TwoWayConverter;)V
/*     */     //   101: checkcast kotlin/jvm/functions/Function1
/*     */     //   104: aload #6
/*     */     //   106: iconst_2
/*     */     //   107: aconst_null
/*     */     //   108: invokestatic animate$default : (Landroidx/compose/animation/core/AnimationState;Landroidx/compose/animation/core/Animation;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   111: dup
/*     */     //   112: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   115: if_acmpne -> 119
/*     */     //   118: areturn
/*     */     //   119: pop
/*     */     //   120: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   123: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #107	-> 0
/*     */     //   #364	-> 7
/*     */     //   #107	-> 10
/*     */     //   #107	-> 26
/*     */     //   #107	-> 27
/*     */     //   #108	-> 32
/*     */     //   #107	-> 50
/*     */     //   #109	-> 52
/*     */     //   #110	-> 56
/*     */     //   #113	-> 58
/*     */     //   #111	-> 59
/*     */     //   #112	-> 60
/*     */     //   #114	-> 61
/*     */     //   #109	-> 63
/*     */     //   #116	-> 68
/*     */     //   #119	-> 123
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   10	16	10	$i$a$-let-SuspendAnimationKt$animate$initialVelocityVector$1	I
/*     */     //   7	19	9	it	Ljava/lang/Object;
/*     */     //   52	72	7	initialVelocityVector	Landroidx/compose/animation/core/AnimationVector;
/*     */     //   68	56	8	anim	Landroidx/compose/animation/core/TargetBasedAnimation;
/*     */     //   0	124	0	typeConverter	Landroidx/compose/animation/core/TwoWayConverter;
/*     */     //   0	124	1	initialValue	Ljava/lang/Object;
/*     */     //   0	124	2	targetValue	Ljava/lang/Object;
/*     */     //   0	124	3	initialVelocity	Ljava/lang/Object;
/*     */     //   0	124	4	animationSpec	Landroidx/compose/animation/core/AnimationSpec;
/*     */     //   0	124	5	block	Lkotlin/jvm/functions/Function2;
/*     */     //   0	124	6	$completion	Lkotlin/coroutines/Continuation;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\020\000\032\0020\001\"\004\b\000\020\002\"\b\b\001\020\003*\0020\004*\016\022\004\022\002H\002\022\004\022\002H\0030\005H\n¢\006\002\b\006"}, d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/AnimationScope;", "invoke"})
/*     */   static final class SuspendAnimationKt$animate$3
/*     */     extends Lambda
/*     */     implements Function1<AnimationScope<T, V>, Unit>
/*     */   {
/*     */     public final void invoke(@NotNull AnimationScope $this$animate) {
/* 117 */       Intrinsics.checkNotNullParameter($this$animate, "$this$animate"); this.$block.invoke($this$animate.getValue(), this.$typeConverter.getConvertFromVector().invoke($this$animate.getVelocityVector()));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     SuspendAnimationKt$animate$3(Function2<T, T, Unit> $block, TwoWayConverter<T, V> $typeConverter) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\020\000\032\0020\001\"\004\b\000\020\002\"\b\b\001\020\003*\0020\004*\016\022\004\022\002H\002\022\004\022\002H\0030\005H\n¢\006\002\b\006"}, d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/AnimationScope;", "invoke"})
/*     */   static final class SuspendAnimationKt$animateTo$2
/*     */     extends Lambda
/*     */     implements Function1<AnimationScope<T, V>, Unit>
/*     */   {
/*     */     public static final SuspendAnimationKt$animateTo$2 INSTANCE = new SuspendAnimationKt$animateTo$2();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     SuspendAnimationKt$animateTo$2() {
/*     */       super(1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final void invoke(@NotNull AnimationScope $this$null) {
/* 150 */       Intrinsics.checkNotNullParameter($this$null, "$this$null");
/*     */     } }
/*     */   @Nullable
/*     */   public static final <T, V extends AnimationVector> Object animateTo(@NotNull AnimationState<Object, Object> $this$animateTo, Object targetValue, @NotNull AnimationSpec animationSpec, boolean sequentialAnimation, @NotNull Function1<? super AnimationScope<Object, Object>, Unit> block, @NotNull Continuation<? super Unit> $completion) {
/* 154 */     Object object1 = $this$animateTo.getValue();
/*     */     
/* 156 */     TwoWayConverter<Object, Object> twoWayConverter = $this$animateTo.getTypeConverter();
/* 157 */     Object object2 = $this$animateTo.getVelocityVector(); TargetBasedAnimation<Object, Object> anim = new TargetBasedAnimation<>(animationSpec, twoWayConverter, object1, targetValue, object2);
/*     */     
/* 159 */     if (animate($this$animateTo, 
/* 160 */         anim, 
/* 161 */         sequentialAnimation ? $this$animateTo.getLastFrameTimeNanos() : Long.MIN_VALUE, 
/* 162 */         block, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return animate($this$animateTo, anim, sequentialAnimation ? $this$animateTo.getLastFrameTimeNanos() : Long.MIN_VALUE, block, $completion);  animate($this$animateTo, anim, sequentialAnimation ? $this$animateTo.getLastFrameTimeNanos() : Long.MIN_VALUE, block, $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\020\000\032\0020\001\"\004\b\000\020\002\"\b\b\001\020\003*\0020\004*\016\022\004\022\002H\002\022\004\022\002H\0030\005H\n¢\006\002\b\006"}, d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/AnimationScope;", "invoke"})
/*     */   static final class SuspendAnimationKt$animateDecay$4
/*     */     extends Lambda
/*     */     implements Function1<AnimationScope<T, V>, Unit>
/*     */   {
/*     */     public static final SuspendAnimationKt$animateDecay$4 INSTANCE = new SuspendAnimationKt$animateDecay$4();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     SuspendAnimationKt$animateDecay$4() {
/*     */       super(1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final void invoke(@NotNull AnimationScope $this$null) {
/* 192 */       Intrinsics.checkNotNullParameter($this$null, "$this$null");
/*     */     } }
/*     */   @Nullable
/*     */   public static final <T, V extends AnimationVector> Object animateDecay(@NotNull AnimationState<Object, Object> $this$animateDecay, @NotNull DecayAnimationSpec animationSpec, boolean sequentialAnimation, @NotNull Function1<? super AnimationScope<Object, Object>, Unit> block, @NotNull Continuation<? super Unit> $completion) {
/* 196 */     Object object1 = $this$animateDecay.getValue();
/* 197 */     Object object2 = $this$animateDecay.getVelocityVector();
/* 198 */     TwoWayConverter<Object, Object> twoWayConverter = $this$animateDecay.getTypeConverter(); DecayAnimation<Object, Object> anim = new DecayAnimation<>(animationSpec, twoWayConverter, object1, object2);
/*     */     
/* 200 */     if (animate($this$animateDecay, 
/* 201 */         anim, 
/* 202 */         sequentialAnimation ? $this$animateDecay.getLastFrameTimeNanos() : Long.MIN_VALUE, 
/* 203 */         block, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return animate($this$animateDecay, anim, sequentialAnimation ? $this$animateDecay.getLastFrameTimeNanos() : Long.MIN_VALUE, block, $completion);  animate($this$animateDecay, anim, sequentialAnimation ? $this$animateDecay.getLastFrameTimeNanos() : Long.MIN_VALUE, block, $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static final <T, V extends AnimationVector> Object animate(@NotNull AnimationState $this$animate, @NotNull Animation animation, long startTimeNanos, @NotNull Function1 block, @NotNull Continuation<? super Unit> paramContinuation) {
/*     */     // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: instanceof androidx/compose/animation/core/SuspendAnimationKt$animate$4
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #5
/*     */     //   10: checkcast androidx/compose/animation/core/SuspendAnimationKt$animate$4
/*     */     //   13: astore #14
/*     */     //   15: aload #14
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #14
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 52
/*     */     //   41: new androidx/compose/animation/core/SuspendAnimationKt$animate$4
/*     */     //   44: dup
/*     */     //   45: aload #5
/*     */     //   47: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   50: astore #14
/*     */     //   52: aload #14
/*     */     //   54: getfield result : Ljava/lang/Object;
/*     */     //   57: astore #13
/*     */     //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   62: astore #15
/*     */     //   64: aload #14
/*     */     //   66: getfield label : I
/*     */     //   69: tableswitch default -> 561, 0 -> 96, 1 -> 218, 2 -> 441
/*     */     //   96: aload #13
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload_1
/*     */     //   102: lconst_0
/*     */     //   103: invokeinterface getValueFromNanos : (J)Ljava/lang/Object;
/*     */     //   108: astore #6
/*     */     //   110: aload_1
/*     */     //   111: lconst_0
/*     */     //   112: invokeinterface getVelocityVectorFromNanos : (J)Landroidx/compose/animation/core/AnimationVector;
/*     */     //   117: astore #7
/*     */     //   119: new kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   122: dup
/*     */     //   123: invokespecial <init> : ()V
/*     */     //   126: astore #8
/*     */     //   128: nop
/*     */     //   129: lload_2
/*     */     //   130: ldc2_w -9223372036854775808
/*     */     //   133: lcmp
/*     */     //   134: ifne -> 268
/*     */     //   137: aload #14
/*     */     //   139: invokeinterface getContext : ()Lkotlin/coroutines/CoroutineContext;
/*     */     //   144: invokestatic getDurationScale : (Lkotlin/coroutines/CoroutineContext;)F
/*     */     //   147: fstore #9
/*     */     //   149: aload_1
/*     */     //   150: new androidx/compose/animation/core/SuspendAnimationKt$animate$6
/*     */     //   153: dup
/*     */     //   154: aload #8
/*     */     //   156: aload #6
/*     */     //   158: aload_1
/*     */     //   159: aload #7
/*     */     //   161: aload_0
/*     */     //   162: fload #9
/*     */     //   164: aload #4
/*     */     //   166: invokespecial <init> : (Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/Object;Landroidx/compose/animation/core/Animation;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationState;FLkotlin/jvm/functions/Function1;)V
/*     */     //   169: checkcast kotlin/jvm/functions/Function1
/*     */     //   172: aload #14
/*     */     //   174: aload #14
/*     */     //   176: aload_0
/*     */     //   177: putfield L$0 : Ljava/lang/Object;
/*     */     //   180: aload #14
/*     */     //   182: aload_1
/*     */     //   183: putfield L$1 : Ljava/lang/Object;
/*     */     //   186: aload #14
/*     */     //   188: aload #4
/*     */     //   190: putfield L$2 : Ljava/lang/Object;
/*     */     //   193: aload #14
/*     */     //   195: aload #8
/*     */     //   197: putfield L$3 : Ljava/lang/Object;
/*     */     //   200: aload #14
/*     */     //   202: iconst_1
/*     */     //   203: putfield label : I
/*     */     //   206: invokestatic callWithFrameNanos : (Landroidx/compose/animation/core/Animation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   209: dup
/*     */     //   210: aload #15
/*     */     //   212: if_acmpne -> 264
/*     */     //   215: aload #15
/*     */     //   217: areturn
/*     */     //   218: aload #14
/*     */     //   220: getfield L$3 : Ljava/lang/Object;
/*     */     //   223: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   226: astore #8
/*     */     //   228: aload #14
/*     */     //   230: getfield L$2 : Ljava/lang/Object;
/*     */     //   233: checkcast kotlin/jvm/functions/Function1
/*     */     //   236: astore #4
/*     */     //   238: aload #14
/*     */     //   240: getfield L$1 : Ljava/lang/Object;
/*     */     //   243: checkcast androidx/compose/animation/core/Animation
/*     */     //   246: astore_1
/*     */     //   247: aload #14
/*     */     //   249: getfield L$0 : Ljava/lang/Object;
/*     */     //   252: checkcast androidx/compose/animation/core/AnimationState
/*     */     //   255: astore_0
/*     */     //   256: nop
/*     */     //   257: aload #13
/*     */     //   259: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   262: aload #13
/*     */     //   264: pop
/*     */     //   265: goto -> 346
/*     */     //   268: aload #8
/*     */     //   270: new androidx/compose/animation/core/AnimationScope
/*     */     //   273: dup
/*     */     //   274: aload #6
/*     */     //   276: aload_1
/*     */     //   277: invokeinterface getTypeConverter : ()Landroidx/compose/animation/core/TwoWayConverter;
/*     */     //   282: aload #7
/*     */     //   284: lload_2
/*     */     //   285: aload_1
/*     */     //   286: invokeinterface getTargetValue : ()Ljava/lang/Object;
/*     */     //   291: lload_2
/*     */     //   292: iconst_1
/*     */     //   293: new androidx/compose/animation/core/SuspendAnimationKt$animate$7
/*     */     //   296: dup
/*     */     //   297: aload_0
/*     */     //   298: invokespecial <init> : (Landroidx/compose/animation/core/AnimationState;)V
/*     */     //   301: checkcast kotlin/jvm/functions/Function0
/*     */     //   304: invokespecial <init> : (Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationVector;JLjava/lang/Object;JZLkotlin/jvm/functions/Function0;)V
/*     */     //   307: astore #9
/*     */     //   309: aload #9
/*     */     //   311: astore #10
/*     */     //   313: astore #12
/*     */     //   315: iconst_0
/*     */     //   316: istore #11
/*     */     //   318: aload #10
/*     */     //   320: lload_2
/*     */     //   321: aload #14
/*     */     //   323: invokeinterface getContext : ()Lkotlin/coroutines/CoroutineContext;
/*     */     //   328: invokestatic getDurationScale : (Lkotlin/coroutines/CoroutineContext;)F
/*     */     //   331: aload_1
/*     */     //   332: aload_0
/*     */     //   333: aload #4
/*     */     //   335: invokestatic doAnimationFrameWithScale : (Landroidx/compose/animation/core/AnimationScope;JFLandroidx/compose/animation/core/Animation;Landroidx/compose/animation/core/AnimationState;Lkotlin/jvm/functions/Function1;)V
/*     */     //   338: nop
/*     */     //   339: aload #12
/*     */     //   341: aload #9
/*     */     //   343: putfield element : Ljava/lang/Object;
/*     */     //   346: aload #8
/*     */     //   348: getfield element : Ljava/lang/Object;
/*     */     //   351: dup
/*     */     //   352: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   355: checkcast androidx/compose/animation/core/AnimationScope
/*     */     //   358: invokevirtual isRunning : ()Z
/*     */     //   361: ifeq -> 557
/*     */     //   364: aload #14
/*     */     //   366: invokeinterface getContext : ()Lkotlin/coroutines/CoroutineContext;
/*     */     //   371: invokestatic getDurationScale : (Lkotlin/coroutines/CoroutineContext;)F
/*     */     //   374: fstore #9
/*     */     //   376: aload_1
/*     */     //   377: new androidx/compose/animation/core/SuspendAnimationKt$animate$9
/*     */     //   380: dup
/*     */     //   381: aload #8
/*     */     //   383: fload #9
/*     */     //   385: aload_1
/*     */     //   386: aload_0
/*     */     //   387: aload #4
/*     */     //   389: invokespecial <init> : (Lkotlin/jvm/internal/Ref$ObjectRef;FLandroidx/compose/animation/core/Animation;Landroidx/compose/animation/core/AnimationState;Lkotlin/jvm/functions/Function1;)V
/*     */     //   392: checkcast kotlin/jvm/functions/Function1
/*     */     //   395: aload #14
/*     */     //   397: aload #14
/*     */     //   399: aload_0
/*     */     //   400: putfield L$0 : Ljava/lang/Object;
/*     */     //   403: aload #14
/*     */     //   405: aload_1
/*     */     //   406: putfield L$1 : Ljava/lang/Object;
/*     */     //   409: aload #14
/*     */     //   411: aload #4
/*     */     //   413: putfield L$2 : Ljava/lang/Object;
/*     */     //   416: aload #14
/*     */     //   418: aload #8
/*     */     //   420: putfield L$3 : Ljava/lang/Object;
/*     */     //   423: aload #14
/*     */     //   425: iconst_2
/*     */     //   426: putfield label : I
/*     */     //   429: invokestatic callWithFrameNanos : (Landroidx/compose/animation/core/Animation;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   432: dup
/*     */     //   433: aload #15
/*     */     //   435: if_acmpne -> 487
/*     */     //   438: aload #15
/*     */     //   440: areturn
/*     */     //   441: aload #14
/*     */     //   443: getfield L$3 : Ljava/lang/Object;
/*     */     //   446: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   449: astore #8
/*     */     //   451: aload #14
/*     */     //   453: getfield L$2 : Ljava/lang/Object;
/*     */     //   456: checkcast kotlin/jvm/functions/Function1
/*     */     //   459: astore #4
/*     */     //   461: aload #14
/*     */     //   463: getfield L$1 : Ljava/lang/Object;
/*     */     //   466: checkcast androidx/compose/animation/core/Animation
/*     */     //   469: astore_1
/*     */     //   470: aload #14
/*     */     //   472: getfield L$0 : Ljava/lang/Object;
/*     */     //   475: checkcast androidx/compose/animation/core/AnimationState
/*     */     //   478: astore_0
/*     */     //   479: nop
/*     */     //   480: aload #13
/*     */     //   482: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   485: aload #13
/*     */     //   487: pop
/*     */     //   488: goto -> 346
/*     */     //   491: astore #9
/*     */     //   493: aload #8
/*     */     //   495: getfield element : Ljava/lang/Object;
/*     */     //   498: checkcast androidx/compose/animation/core/AnimationScope
/*     */     //   501: dup
/*     */     //   502: ifnonnull -> 509
/*     */     //   505: pop
/*     */     //   506: goto -> 513
/*     */     //   509: iconst_0
/*     */     //   510: invokevirtual setRunning$animation_core : (Z)V
/*     */     //   513: aload #8
/*     */     //   515: getfield element : Ljava/lang/Object;
/*     */     //   518: checkcast androidx/compose/animation/core/AnimationScope
/*     */     //   521: dup
/*     */     //   522: ifnull -> 544
/*     */     //   525: invokevirtual getLastFrameTimeNanos : ()J
/*     */     //   528: aload_0
/*     */     //   529: invokevirtual getLastFrameTimeNanos : ()J
/*     */     //   532: lcmp
/*     */     //   533: ifne -> 540
/*     */     //   536: iconst_1
/*     */     //   537: goto -> 546
/*     */     //   540: iconst_0
/*     */     //   541: goto -> 546
/*     */     //   544: pop
/*     */     //   545: iconst_0
/*     */     //   546: ifeq -> 554
/*     */     //   549: aload_0
/*     */     //   550: iconst_0
/*     */     //   551: invokevirtual setRunning$animation_core : (Z)V
/*     */     //   554: aload #9
/*     */     //   556: athrow
/*     */     //   557: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   560: areturn
/*     */     //   561: new java/lang/IllegalStateException
/*     */     //   564: dup
/*     */     //   565: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   568: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   571: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #228	-> 62
/*     */     //   #233	-> 101
/*     */     //   #234	-> 110
/*     */     //   #235	-> 119
/*     */     //   #236	-> 128
/*     */     //   #237	-> 129
/*     */     //   #238	-> 137
/*     */     //   #238	-> 144
/*     */     //   #239	-> 149
/*     */     //   #228	-> 215
/*     */     //   #239	-> 264
/*     */     //   #255	-> 268
/*     */     //   #256	-> 274
/*     */     //   #257	-> 276
/*     */     //   #258	-> 282
/*     */     //   #259	-> 284
/*     */     //   #260	-> 285
/*     */     //   #261	-> 291
/*     */     //   #262	-> 292
/*     */     //   #264	-> 293
/*     */     //   #255	-> 304
/*     */     //   #264	-> 309
/*     */     //   #266	-> 318
/*     */     //   #267	-> 320
/*     */     //   #268	-> 321
/*     */     //   #268	-> 328
/*     */     //   #269	-> 331
/*     */     //   #270	-> 332
/*     */     //   #271	-> 333
/*     */     //   #266	-> 335
/*     */     //   #273	-> 338
/*     */     //   #264	-> 341
/*     */     //   #255	-> 343
/*     */     //   #276	-> 346
/*     */     //   #277	-> 364
/*     */     //   #277	-> 371
/*     */     //   #278	-> 376
/*     */     //   #228	-> 438
/*     */     //   #278	-> 487
/*     */     //   #283	-> 491
/*     */     //   #284	-> 493
/*     */     //   #285	-> 513
/*     */     //   #287	-> 549
/*     */     //   #289	-> 554
/*     */     //   #291	-> 557
/*     */     //   #228	-> 561
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	117	0	$this$animate	Landroidx/compose/animation/core/AnimationState;
/*     */     //   256	83	0	$this$animate	Landroidx/compose/animation/core/AnimationState;
/*     */     //   339	4	0	$this$animate	Landroidx/compose/animation/core/AnimationState;
/*     */     //   343	98	0	$this$animate	Landroidx/compose/animation/core/AnimationState;
/*     */     //   479	12	0	$this$animate	Landroidx/compose/animation/core/AnimationState;
/*     */     //   491	63	0	$this$animate	Landroidx/compose/animation/core/AnimationState;
/*     */     //   101	117	1	animation	Landroidx/compose/animation/core/Animation;
/*     */     //   247	92	1	animation	Landroidx/compose/animation/core/Animation;
/*     */     //   339	4	1	animation	Landroidx/compose/animation/core/Animation;
/*     */     //   343	98	1	animation	Landroidx/compose/animation/core/Animation;
/*     */     //   470	21	1	animation	Landroidx/compose/animation/core/Animation;
/*     */     //   101	36	2	startTimeNanos	J
/*     */     //   268	53	2	startTimeNanos	J
/*     */     //   101	117	4	block	Lkotlin/jvm/functions/Function1;
/*     */     //   238	101	4	block	Lkotlin/jvm/functions/Function1;
/*     */     //   339	4	4	block	Lkotlin/jvm/functions/Function1;
/*     */     //   343	98	4	block	Lkotlin/jvm/functions/Function1;
/*     */     //   461	30	4	block	Lkotlin/jvm/functions/Function1;
/*     */     //   110	34	6	initialValue	Ljava/lang/Object;
/*     */     //   144	65	6	initialValue	Ljava/lang/Object;
/*     */     //   268	8	6	initialValue	Ljava/lang/Object;
/*     */     //   119	25	7	initialVelocityVector	Landroidx/compose/animation/core/AnimationVector;
/*     */     //   144	65	7	initialVelocityVector	Landroidx/compose/animation/core/AnimationVector;
/*     */     //   268	16	7	initialVelocityVector	Landroidx/compose/animation/core/AnimationVector;
/*     */     //   128	90	8	lateInitScope	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   228	111	8	lateInitScope	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   339	4	8	lateInitScope	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   343	98	8	lateInitScope	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   451	40	8	lateInitScope	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   491	30	8	lateInitScope	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   149	60	9	durationScale	F
/*     */     //   376	56	9	durationScale	F
/*     */     //   493	64	9	e	Ljava/util/concurrent/CancellationException;
/*     */     //   315	24	10	$this$animate_u24lambda_u241	Landroidx/compose/animation/core/AnimationScope;
/*     */     //   318	21	11	$i$a$-apply-SuspendAnimationKt$animate$8	I
/*     */     //   52	509	14	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   59	502	13	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   128	209	491	java/util/concurrent/CancellationException
/*     */     //   256	432	491	java/util/concurrent/CancellationException
/*     */     //   479	491	491	java/util/concurrent/CancellationException
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\020\000\032\0020\001\"\004\b\000\020\002\"\b\b\001\020\003*\0020\004*\016\022\004\022\002H\002\022\004\022\002H\0030\005H\n¢\006\002\b\006"}, d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/AnimationScope;", "invoke"})
/*     */   static final class SuspendAnimationKt$animate$5
/*     */     extends Lambda
/*     */     implements Function1<AnimationScope<T, V>, Unit>
/*     */   {
/*     */     public static final SuspendAnimationKt$animate$5 INSTANCE = new SuspendAnimationKt$animate$5();
/*     */ 
/*     */ 
/*     */     
/*     */     SuspendAnimationKt$animate$5() {
/*     */       super(1);
/*     */     }
/*     */ 
/*     */     
/*     */     public final void invoke(@NotNull AnimationScope $this$null) {
/* 231 */       Intrinsics.checkNotNullParameter($this$null, "$this$null");
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\020\t\n\000\020\000\032\0020\001\"\004\b\000\020\002\"\b\b\001\020\003*\0020\0042\006\020\005\032\0020\006H\n¢\006\002\b\007"}, d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "it", "", "invoke"})
/*     */   static final class SuspendAnimationKt$animate$6
/*     */     extends Lambda
/*     */     implements Function1<Long, Unit> {
/*     */     public final void invoke(long it) {
/* 240 */       AnimationScope<T, AnimationVector> animationScope1 = new AnimationScope<>(
/* 241 */           this.$initialValue, 
/* 242 */           (TwoWayConverter)this.$animation.getTypeConverter(), 
/* 243 */           (AnimationVector)this.$initialVelocityVector, 
/* 244 */           it, 
/* 245 */           this.$animation.getTargetValue(), 
/* 246 */           it, 
/* 247 */           true, 
/*     */           
/* 249 */           new Function0<Unit>(this.$this_animate) { public final void invoke() { this.$this_animate.setRunning$animation_core(false); } }); float f = this.$durationScale; Animation<T, V> animation = this.$animation; AnimationState<T, V> animationState = this.$this_animate; Function1<AnimationScope<T, V>, Unit> function1 = this.$block; AnimationScope<T, AnimationVector> animationScope2 = animationScope1; Ref.ObjectRef<AnimationScope<T, V>> objectRef = this.$lateInitScope; int $i$a$-apply-SuspendAnimationKt$animate$6$2 = 0;
/*     */       
/* 251 */       SuspendAnimationKt.doAnimationFrameWithScale((AnimationScope)animationScope2, it, f, animation, animationState, function1);
/* 252 */       objectRef.element = animationScope1;
/*     */     }
/*     */     SuspendAnimationKt$animate$6(Ref.ObjectRef<AnimationScope<T, V>> $lateInitScope, Object $initialValue, Animation<T, V> $animation, AnimationVector $initialVelocityVector, AnimationState<T, V> $receiver, float $durationScale, Function1<AnimationScope<T, V>, Unit> $block) {
/*     */       super(1);
/*     */     } }
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\020\000\032\0020\001\"\004\b\000\020\002\"\b\b\001\020\003*\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "invoke"})
/*     */   static final class SuspendAnimationKt$animate$7 extends Lambda implements Function0<Unit> { SuspendAnimationKt$animate$7(AnimationState<T, V> $receiver) {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     public final void invoke() {
/* 263 */       this.$this_animate.setRunning$animation_core(false);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\020\t\n\000\020\000\032\0020\001\"\004\b\000\020\002\"\b\b\001\020\003*\0020\0042\006\020\005\032\0020\006H\n¢\006\002\b\007"}, d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "it", "", "invoke"})
/*     */   static final class SuspendAnimationKt$animate$9
/*     */     extends Lambda
/*     */     implements Function1<Long, Unit>
/*     */   {
/*     */     public final void invoke(long it) {
/* 279 */       Intrinsics.checkNotNull(this.$lateInitScope.element); SuspendAnimationKt.doAnimationFrameWithScale((AnimationScope)this.$lateInitScope.element, it, this.$durationScale, this.$animation, this.$this_animate, this.$block);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     SuspendAnimationKt$animate$9(Ref.ObjectRef<AnimationScope<T, V>> $lateInitScope, float $durationScale, Animation<T, V> $animation, AnimationState<T, V> $receiver, Function1<AnimationScope<T, V>, Unit> $block) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final <R, T, V extends AnimationVector> Object callWithFrameNanos(Animation $this$callWithFrameNanos, Function1<? super Long, ?> onFrame, Continuation<?> $completion) {
/* 300 */     if ($this$callWithFrameNanos.isInfinite()) {
/* 301 */       return InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(onFrame, $completion);
/*     */     }
/* 303 */     return MonotonicFrameClockKt.withFrameNanos(new SuspendAnimationKt$callWithFrameNanos$2((Function1)onFrame), $completion); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\002\b\004\n\002\030\002\n\000\n\002\020\t\n\002\b\002\020\000\032\002H\001\"\004\b\000\020\001\"\004\b\001\020\002\"\b\b\002\020\003*\0020\0042\006\020\005\032\0020\006H\n¢\006\004\b\007\020\b"}, d2 = {"<anonymous>", "R", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "it", "", "invoke", "(J)Ljava/lang/Object;"})
/* 304 */   static final class SuspendAnimationKt$callWithFrameNanos$2 extends Lambda implements Function1<Long, R> { public final R invoke(long it) { return (R)this.$onFrame.invoke(Long.valueOf(it / 1L)); }
/*     */ 
/*     */ 
/*     */     
/*     */     SuspendAnimationKt$callWithFrameNanos$2(Function1<Long, R> $onFrame) {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final float getDurationScale(@NotNull CoroutineContext $this$durationScale) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w '<this>'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_0
/*     */     //   8: getstatic androidx/compose/ui/MotionDurationScale.Key : Landroidx/compose/ui/MotionDurationScale$Key;
/*     */     //   11: checkcast kotlin/coroutines/CoroutineContext$Key
/*     */     //   14: invokeinterface get : (Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;
/*     */     //   19: checkcast androidx/compose/ui/MotionDurationScale
/*     */     //   22: dup
/*     */     //   23: ifnull -> 34
/*     */     //   26: invokeinterface getScaleFactor : ()F
/*     */     //   31: goto -> 36
/*     */     //   34: pop
/*     */     //   35: fconst_1
/*     */     //   36: fstore_1
/*     */     //   37: fload_1
/*     */     //   38: fconst_0
/*     */     //   39: fcmpl
/*     */     //   40: iflt -> 47
/*     */     //   43: iconst_1
/*     */     //   44: goto -> 48
/*     */     //   47: iconst_0
/*     */     //   48: istore_2
/*     */     //   49: iconst_0
/*     */     //   50: istore_3
/*     */     //   51: nop
/*     */     //   52: iload_2
/*     */     //   53: ifne -> 65
/*     */     //   56: iconst_0
/*     */     //   57: istore #4
/*     */     //   59: ldc_w 'negative scale factor'
/*     */     //   62: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*     */     //   65: nop
/*     */     //   66: fload_1
/*     */     //   67: freturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #311	-> 7
/*     */     //   #312	-> 37
/*     */     //   #365	-> 51
/*     */     //   #368	-> 52
/*     */     //   #369	-> 56
/*     */     //   #312	-> 59
/*     */     //   #369	-> 62
/*     */     //   #371	-> 65
/*     */     //   #313	-> 66
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   59	3	4	$i$a$-checkPrecondition-SuspendAnimationKt$durationScale$1	I
/*     */     //   51	15	3	$i$f$checkPrecondition	I
/*     */     //   49	17	2	value$iv	Z
/*     */     //   37	31	1	scale	F
/*     */     //   0	68	0	$this$durationScale	Lkotlin/coroutines/CoroutineContext;
/*     */   }
/*     */   
/*     */   public static final <T, V extends AnimationVector> void updateState(@NotNull AnimationScope $this$updateState, @NotNull AnimationState state) {
/* 319 */     Intrinsics.checkNotNullParameter($this$updateState, "<this>"); Intrinsics.checkNotNullParameter(state, "state"); state.setValue$animation_core($this$updateState.getValue());
/* 320 */     AnimationVectorsKt.copyFrom((AnimationVector)state.getVelocityVector(), (AnimationVector)$this$updateState.getVelocityVector());
/* 321 */     state.setFinishedTimeNanos$animation_core($this$updateState.getFinishedTimeNanos());
/* 322 */     state.setLastFrameTimeNanos$animation_core($this$updateState.getLastFrameTimeNanos());
/* 323 */     state.setRunning$animation_core($this$updateState.isRunning());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final <T, V extends AnimationVector> void doAnimationFrameWithScale(AnimationScope<?, AnimationVector> $this$doAnimationFrameWithScale, long frameTimeNanos, float durationScale, Animation<?, AnimationVector> anim, AnimationState<?, AnimationVector> state, Function1<? super AnimationScope<?, AnimationVector>, Unit> block) {
/* 333 */     long playTimeNanos = 
/* 334 */       ((durationScale == 0.0F)) ? 
/* 335 */       anim.getDurationNanos() : 
/*     */       
/* 337 */       (long)((float)(frameTimeNanos - $this$doAnimationFrameWithScale.getStartTimeNanos()) / durationScale);
/*     */     
/* 339 */     doAnimationFrame($this$doAnimationFrameWithScale, frameTimeNanos, playTimeNanos, anim, state, block);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final <T, V extends AnimationVector> void doAnimationFrame(AnimationScope<?, AnimationVector> $this$doAnimationFrame, long frameTimeNanos, long playTimeNanos, Animation anim, AnimationState<?, AnimationVector> state, Function1 block) {
/* 350 */     $this$doAnimationFrame.setLastFrameTimeNanos$animation_core(frameTimeNanos);
/* 351 */     $this$doAnimationFrame.setValue$animation_core(anim.getValueFromNanos(playTimeNanos));
/* 352 */     $this$doAnimationFrame.setVelocityVector$animation_core(anim.getVelocityVectorFromNanos(playTimeNanos));
/* 353 */     boolean isLastFrame = anim.isFinishedFromNanos(playTimeNanos);
/* 354 */     if (isLastFrame) {
/*     */ 
/*     */       
/* 357 */       $this$doAnimationFrame.setFinishedTimeNanos$animation_core($this$doAnimationFrame.getLastFrameTimeNanos());
/* 358 */       $this$doAnimationFrame.setRunning$animation_core(false);
/*     */     } 
/* 360 */     updateState($this$doAnimationFrame, state);
/* 361 */     block.invoke($this$doAnimationFrame);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "SuspendAnimation.kt", l = {239, 278}, i = {0, 0, 0, 0, 1, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"}, n = {"$this$animate", "animation", "block", "lateInitScope", "$this$animate", "animation", "block", "lateInitScope"}, m = "animate", c = "androidx.compose.animation.core.SuspendAnimationKt")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class SuspendAnimationKt$animate$4<T, V extends AnimationVector> extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int label;
/*     */     
/*     */     SuspendAnimationKt$animate$4(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return SuspendAnimationKt.animate(null, null, 0L, null, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\SuspendAnimationKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */