/*      */ package androidx.compose.animation.core;
/*      */ 
/*      */ import androidx.annotation.FloatRange;
/*      */ import androidx.collection.MutableObjectList;
/*      */ import androidx.compose.runtime.FloatState;
/*      */ import androidx.compose.runtime.MonotonicFrameClockKt;
/*      */ import androidx.compose.runtime.MutableFloatState;
/*      */ import androidx.compose.runtime.MutableState;
/*      */ import androidx.compose.runtime.PrimitiveSnapshotStateKt;
/*      */ import androidx.compose.runtime.SnapshotStateKt;
/*      */ import androidx.compose.runtime.State;
/*      */ import androidx.compose.runtime.internal.StabilityInferred;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.ResultKt;
/*      */ import kotlin.Unit;
/*      */ import kotlin.coroutines.Continuation;
/*      */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*      */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*      */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*      */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*      */ import kotlin.jvm.functions.Function0;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.functions.Function2;
/*      */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.Lambda;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import kotlin.math.MathKt;
/*      */ import kotlin.reflect.KProperty;
/*      */ import kotlinx.coroutines.BuildersKt;
/*      */ import kotlinx.coroutines.CancellableContinuation;
/*      */ import kotlinx.coroutines.CoroutineScope;
/*      */ import kotlinx.coroutines.CoroutineScopeKt;
/*      */ import kotlinx.coroutines.sync.Mutex;
/*      */ import kotlinx.coroutines.sync.MutexKt;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000d\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\020\t\n\002\020\002\n\002\b\006\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\007\n\002\020\007\n\002\b\t\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\032\b\007\030\000 X*\004\b\000\020\0012\b\022\004\022\002H\0010\002:\002XYB\r\022\006\020\003\032\0028\000¢\006\002\020\004J\016\020<\032\0020\bH@¢\006\002\020=J*\020>\032\0020\b2\b\b\002\0201\032\0028\0002\020\b\002\020?\032\n\022\004\022\0020!\030\0010@H@¢\006\002\020AJ\016\020B\032\0020\bH@¢\006\002\020=J\b\020C\032\0020\bH\002J\b\020D\032\0020\bH\002J\r\020E\032\0020\bH\000¢\006\002\bFJ\r\020G\032\0020\bH\000¢\006\002\bHJ\030\020I\032\0020\b2\006\020J\032\0020\0312\006\020K\032\0020\007H\002J\016\020L\032\0020\bH@¢\006\002\020=J\"\020M\032\0020\b2\b\b\001\020#\032\0020!2\b\b\002\0201\032\0028\000H@¢\006\002\020NJ\b\020O\032\0020\bH\002J\026\020P\032\0020\b2\006\0201\032\0028\000H@¢\006\002\020QJ\033\020R\032\0020\b2\f\020:\032\b\022\004\022\0028\0000;H\020¢\006\002\bSJ\r\020T\032\0020\bH\020¢\006\002\bUJ\016\020V\032\0020\bH@¢\006\002\020=J\016\020W\032\0020\bH@¢\006\002\020=R\032\020\005\032\016\022\004\022\0020\007\022\004\022\0020\b0\006X\004¢\006\002\n\000R\034\020\t\032\0028\000X\016¢\006\020\n\002\020\r\032\004\b\n\020\013\"\004\b\f\020\004R\"\020\016\032\n\022\004\022\0028\000\030\0010\017X\016¢\006\016\n\000\032\004\b\020\020\021\"\004\b\022\020\023R\024\020\024\032\0020\025X\004¢\006\b\n\000\032\004\b\026\020\027R\020\020\030\032\004\030\0010\031X\016¢\006\002\n\000R+\020\033\032\0028\0002\006\020\032\032\0028\0008V@PX\002¢\006\022\n\004\b\036\020\037\032\004\b\034\020\013\"\004\b\035\020\004R\016\020 \032\0020!X\016¢\006\002\n\000R\032\020\"\032\016\022\004\022\0020\007\022\004\022\0020\b0\006X\004¢\006\002\n\000R+\020#\032\0020!2\006\020\032\032\0020!8G@BX\002¢\006\022\n\004\b(\020)\032\004\b$\020%\"\004\b&\020'R\024\020*\032\b\022\004\022\0020\0310+X\004¢\006\002\n\000R\016\020,\032\0020\007X\016¢\006\002\n\000R\016\020-\032\0020.X\004¢\006\002\n\000R\024\020/\032\b\022\004\022\0020\b00X\004¢\006\002\n\000R+\0201\032\0028\0002\006\020\032\032\0028\0008V@PX\002¢\006\022\n\004\b4\020\037\032\004\b2\020\013\"\004\b3\020\004R\032\0205\032\0020\007X\016¢\006\016\n\000\032\004\b6\0207\"\004\b8\0209R\026\020:\032\n\022\004\022\0028\000\030\0010;X\016¢\006\002\n\000¨\006Z"}, d2 = {"Landroidx/compose/animation/core/SeekableTransitionState;", "S", "Landroidx/compose/animation/core/TransitionState;", "initialState", "(Ljava/lang/Object;)V", "animateOneFrameLambda", "Lkotlin/Function1;", "", "", "composedTargetState", "getComposedTargetState$animation_core", "()Ljava/lang/Object;", "setComposedTargetState$animation_core", "Ljava/lang/Object;", "compositionContinuation", "Lkotlinx/coroutines/CancellableContinuation;", "getCompositionContinuation$animation_core", "()Lkotlinx/coroutines/CancellableContinuation;", "setCompositionContinuation$animation_core", "(Lkotlinx/coroutines/CancellableContinuation;)V", "compositionContinuationMutex", "Lkotlinx/coroutines/sync/Mutex;", "getCompositionContinuationMutex$animation_core", "()Lkotlinx/coroutines/sync/Mutex;", "currentAnimation", "Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "<set-?>", "currentState", "getCurrentState", "setCurrentState$animation_core", "currentState$delegate", "Landroidx/compose/runtime/MutableState;", "durationScale", "", "firstFrameLambda", "fraction", "getFraction", "()F", "setFraction", "(F)V", "fraction$delegate", "Landroidx/compose/runtime/MutableFloatState;", "initialValueAnimations", "Landroidx/collection/MutableObjectList;", "lastFrameTimeNanos", "mutatorMutex", "Landroidx/compose/animation/core/MutatorMutex;", "recalculateTotalDurationNanos", "Lkotlin/Function0;", "targetState", "getTargetState", "setTargetState$animation_core", "targetState$delegate", "totalDurationNanos", "getTotalDurationNanos$animation_core", "()J", "setTotalDurationNanos$animation_core", "(J)V", "transition", "Landroidx/compose/animation/core/Transition;", "animateOneFrame", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "(Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doOneFrame", "endAllAnimations", "moveAnimationToInitialState", "observeTotalDuration", "observeTotalDuration$animation_core", "onTotalDurationChanged", "onTotalDurationChanged$animation_core", "recalculateAnimationValue", "animation", "deltaPlayTimeNanos", "runAnimations", "seekTo", "(FLjava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "seekToFraction", "snapTo", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transitionConfigured", "transitionConfigured$animation_core", "transitionRemoved", "transitionRemoved$animation_core", "waitForComposition", "waitForCompositionAfterTargetStateChange", "Companion", "SeekingAnimationState", "animation-core"})
/*      */ @StabilityInferred(parameters = 0)
/*      */ @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 5 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 6 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,2186:1\n81#2:2187\n107#2,2:2188\n81#2:2190\n107#2,2:2191\n79#3:2193\n112#3,2:2194\n33#4,7:2196\n54#4,7:2227\n310#5,11:2203\n310#5,11:2214\n948#6,2:2225\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState\n*L\n228#1:2187\n228#1:2188,2\n230#1:2190\n230#1:2191,2\n259#1:2193\n259#1:2194,2\n504#1:2196,7\n702#1:2227,7\n547#1:2203,11\n568#1:2214,11\n598#1:2225,2\n*E\n"})
/*      */ public final class SeekableTransitionState<S>
/*      */   extends TransitionState<S>
/*      */ {
/*      */   public SeekableTransitionState(Object initialState) {
/*  227 */     super(null);
/*  228 */     this.targetState$delegate = SnapshotStateKt.mutableStateOf$default(initialState, null, 2, null);
/*      */     
/*  230 */     this.currentState$delegate = SnapshotStateKt.mutableStateOf$default(initialState, null, 2, null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  237 */     this.composedTargetState = (S)initialState;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  248 */     this.recalculateTotalDurationNanos = new SeekableTransitionState$recalculateTotalDurationNanos$1();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  259 */     this.fraction$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0F);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  271 */     this.compositionContinuationMutex = MutexKt.Mutex$default(false, 1, null);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  276 */     this.mutatorMutex = new MutatorMutex();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  282 */     this.lastFrameTimeNanos = Long.MIN_VALUE;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  288 */     this.initialValueAnimations = new MutableObjectList(0, 1, null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  299 */     this.firstFrameLambda = new SeekableTransitionState$firstFrameLambda$1();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  312 */     this.animateOneFrameLambda = new SeekableTransitionState$animateOneFrameLambda$1();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public S getTargetState()
/*      */   {
/*      */     State state = (State)this.targetState$delegate;
/*      */     KProperty property$iv = null;
/*      */     int $i$f$getValue = 0;
/* 2187 */     return (S)state.getValue(); } public void setTargetState$animation_core(Object <set-?>) { MutableState mutableState = this.targetState$delegate; KProperty property$iv = null; int $i$f$setValue = 0;
/* 2188 */     mutableState.setValue(<set-?>); } public S getCurrentState() { State state = (State)this.currentState$delegate; KProperty property$iv = null;
/*      */     int $i$f$getValue = 0;
/* 2190 */     return (S)state.getValue(); } public void setCurrentState$animation_core(Object <set-?>) { MutableState mutableState = this.currentState$delegate; KProperty property$iv = null; int $i$f$setValue = 0;
/* 2191 */     mutableState.setValue(<set-?>); }
/*      */   public final S getComposedTargetState$animation_core() { return this.composedTargetState; }
/* 2193 */   public final void setComposedTargetState$animation_core(Object <set-?>) { this.composedTargetState = (S)<set-?>; } @FloatRange(from = 0.0D, to = 1.0D) public final float getFraction() { FloatState floatState = (FloatState)this.fraction$delegate; KProperty property$iv = null; int $i$f$getValue = 0; return floatState.getFloatValue(); } public final long getTotalDurationNanos$animation_core() { return this.totalDurationNanos; } public final void setTotalDurationNanos$animation_core(long <set-?>) { this.totalDurationNanos = <set-?>; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\002\020\000\032\0020\001\"\004\b\000\020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "S", "invoke"}) static final class SeekableTransitionState$recalculateTotalDurationNanos$1 extends Lambda implements Function0<Unit> {
/* 2194 */     public final void invoke() { SeekableTransitionState.this.transition; SeekableTransitionState.this.setTotalDurationNanos$animation_core((SeekableTransitionState.this.transition != null) ? SeekableTransitionState.this.transition.getTotalDurationNanos() : 0L); } SeekableTransitionState$recalculateTotalDurationNanos$1() { super(0); } } private final void setFraction(float <set-?>) { MutableFloatState mutableFloatState = this.fraction$delegate; KProperty property$iv = null; int $i$f$setValue = 0; mutableFloatState.setFloatValue(<set-?>); } @Nullable
/*      */   public final CancellableContinuation<S> getCompositionContinuation$animation_core() { return (CancellableContinuation)this.compositionContinuation; } public final void setCompositionContinuation$animation_core(@Nullable CancellableContinuation<? super S> <set-?>) {
/*      */     this.compositionContinuation = <set-?>;
/*      */   } @NotNull
/*      */   public final Mutex getCompositionContinuationMutex$animation_core() {
/*      */     return this.compositionContinuationMutex;
/*      */   } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\b\002\n\002\020\t\n\000\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "S", "frameTimeNanos", "", "invoke"})
/*      */   static final class SeekableTransitionState$firstFrameLambda$1 extends Lambda implements Function1<Long, Unit> {
/*      */     public final void invoke(long frameTimeNanos) {
/*      */       SeekableTransitionState.this.lastFrameTimeNanos = frameTimeNanos;
/*      */     } SeekableTransitionState$firstFrameLambda$1() {
/*      */       super(1);
/*      */     } }
/*      */   private final void moveAnimationToInitialState() {
/*      */     Transition<S> transition;
/*      */     if (this.transition == null)
/*      */       return; 
/*      */     if (this.currentAnimation == null) {
/*      */       SeekingAnimationState seekingAnimationState1 = new SeekingAnimationState(), it = seekingAnimationState1;
/*      */       int $i$a$-also-SeekableTransitionState$moveAnimationToInitialState$animation$1 = 0;
/*      */       it.setValue(getFraction());
/*      */       long totalDurationNanos = this.totalDurationNanos;
/*      */       it.setDurationNanos(totalDurationNanos);
/*      */       it.setAnimationSpecDuration(MathKt.roundToLong(totalDurationNanos * (1.0D - getFraction())));
/*      */       it.getStart().set$animation_core(0, getFraction());
/*      */     } 
/*      */     SeekingAnimationState animation = (this.totalDurationNanos <= 0L || ((getFraction() == 1.0F)) || Intrinsics.areEqual(getCurrentState(), getTargetState())) ? null : seekingAnimationState1;
/*      */     if (animation != null) {
/*      */       animation.setDurationNanos(this.totalDurationNanos);
/*      */       MutableObjectList<SeekingAnimationState> this_$iv = this.initialValueAnimations;
/*      */       int $i$f$plusAssign = 0;
/* 2225 */       this_$iv.add(animation);
/*      */       transition.setInitialAnimations$animation_core(animation);
/*      */     } 
/*      */     this.currentAnimation = null;
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\b\002\n\002\020\t\n\000\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "S", "frameTimeNanos", "", "invoke"})
/*      */   @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState$animateOneFrameLambda$1\n+ 2 ObjectList.kt\nandroidx/collection/ObjectList\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,2186:1\n305#2,6:2187\n80#2:2197\n976#3,4:2193\n980#3,8:2198\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState$animateOneFrameLambda$1\n*L\n317#1:2187,6\n324#1:2197\n324#1:2193,4\n324#1:2198,8\n*E\n"})
/*      */   static final class SeekableTransitionState$animateOneFrameLambda$1 extends Lambda implements Function1<Long, Unit> {
/*      */     public final void invoke(long frameTimeNanos) {
/*      */       // Byte code:
/*      */       //   0: lload_1
/*      */       //   1: aload_0
/*      */       //   2: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */       //   5: invokestatic access$getLastFrameTimeNanos$p : (Landroidx/compose/animation/core/SeekableTransitionState;)J
/*      */       //   8: lsub
/*      */       //   9: lstore_3
/*      */       //   10: aload_0
/*      */       //   11: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */       //   14: lload_1
/*      */       //   15: invokestatic access$setLastFrameTimeNanos$p : (Landroidx/compose/animation/core/SeekableTransitionState;J)V
/*      */       //   18: lload_3
/*      */       //   19: l2d
/*      */       //   20: aload_0
/*      */       //   21: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */       //   24: invokestatic access$getDurationScale$p : (Landroidx/compose/animation/core/SeekableTransitionState;)F
/*      */       //   27: f2d
/*      */       //   28: ddiv
/*      */       //   29: invokestatic roundToLong : (D)J
/*      */       //   32: lstore #5
/*      */       //   34: aload_0
/*      */       //   35: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */       //   38: invokestatic access$getInitialValueAnimations$p : (Landroidx/compose/animation/core/SeekableTransitionState;)Landroidx/collection/MutableObjectList;
/*      */       //   41: invokevirtual isNotEmpty : ()Z
/*      */       //   44: ifeq -> 296
/*      */       //   47: aload_0
/*      */       //   48: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */       //   51: invokestatic access$getInitialValueAnimations$p : (Landroidx/compose/animation/core/SeekableTransitionState;)Landroidx/collection/MutableObjectList;
/*      */       //   54: checkcast androidx/collection/ObjectList
/*      */       //   57: astore #7
/*      */       //   59: aload_0
/*      */       //   60: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */       //   63: astore #8
/*      */       //   65: iconst_0
/*      */       //   66: istore #9
/*      */       //   68: nop
/*      */       //   69: aload #7
/*      */       //   71: getfield content : [Ljava/lang/Object;
/*      */       //   74: astore #10
/*      */       //   76: iconst_0
/*      */       //   77: istore #11
/*      */       //   79: aload #7
/*      */       //   81: getfield _size : I
/*      */       //   84: istore #12
/*      */       //   86: iload #11
/*      */       //   88: iload #12
/*      */       //   90: if_icmpge -> 129
/*      */       //   93: aload #10
/*      */       //   95: iload #11
/*      */       //   97: aaload
/*      */       //   98: checkcast androidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState
/*      */       //   101: astore #13
/*      */       //   103: iconst_0
/*      */       //   104: istore #14
/*      */       //   106: aload #8
/*      */       //   108: aload #13
/*      */       //   110: lload #5
/*      */       //   112: invokestatic access$recalculateAnimationValue : (Landroidx/compose/animation/core/SeekableTransitionState;Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;J)V
/*      */       //   115: aload #13
/*      */       //   117: iconst_1
/*      */       //   118: invokevirtual setComplete : (Z)V
/*      */       //   121: nop
/*      */       //   122: nop
/*      */       //   123: iinc #11, 1
/*      */       //   126: goto -> 86
/*      */       //   129: nop
/*      */       //   130: aload_0
/*      */       //   131: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */       //   134: invokestatic access$getTransition$p : (Landroidx/compose/animation/core/SeekableTransitionState;)Landroidx/compose/animation/core/Transition;
/*      */       //   137: dup
/*      */       //   138: ifnull -> 147
/*      */       //   141: invokevirtual updateInitialValues$animation_core : ()V
/*      */       //   144: goto -> 148
/*      */       //   147: pop
/*      */       //   148: aload_0
/*      */       //   149: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */       //   152: invokestatic access$getInitialValueAnimations$p : (Landroidx/compose/animation/core/SeekableTransitionState;)Landroidx/collection/MutableObjectList;
/*      */       //   155: astore #7
/*      */       //   157: iconst_0
/*      */       //   158: istore #8
/*      */       //   160: iconst_0
/*      */       //   161: istore #9
/*      */       //   163: aload #7
/*      */       //   165: getfield _size : I
/*      */       //   168: istore #10
/*      */       //   170: aload #7
/*      */       //   172: getfield content : [Ljava/lang/Object;
/*      */       //   175: astore #11
/*      */       //   177: aload #7
/*      */       //   179: checkcast androidx/collection/ObjectList
/*      */       //   182: astore #12
/*      */       //   184: iconst_0
/*      */       //   185: istore #13
/*      */       //   187: iconst_0
/*      */       //   188: aload #12
/*      */       //   190: getfield _size : I
/*      */       //   193: invokestatic until : (II)Lkotlin/ranges/IntRange;
/*      */       //   196: astore #14
/*      */       //   198: aload #14
/*      */       //   200: invokevirtual getFirst : ()I
/*      */       //   203: istore #12
/*      */       //   205: aload #14
/*      */       //   207: invokevirtual getLast : ()I
/*      */       //   210: istore #13
/*      */       //   212: iload #12
/*      */       //   214: iload #13
/*      */       //   216: if_icmpgt -> 269
/*      */       //   219: aload #11
/*      */       //   221: iload #12
/*      */       //   223: iload #9
/*      */       //   225: isub
/*      */       //   226: aload #11
/*      */       //   228: iload #12
/*      */       //   230: aaload
/*      */       //   231: aastore
/*      */       //   232: aload #11
/*      */       //   234: iload #12
/*      */       //   236: aaload
/*      */       //   237: checkcast androidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState
/*      */       //   240: astore #15
/*      */       //   242: iconst_0
/*      */       //   243: istore #16
/*      */       //   245: aload #15
/*      */       //   247: invokevirtual isComplete : ()Z
/*      */       //   250: ifeq -> 256
/*      */       //   253: iinc #9, 1
/*      */       //   256: iload #12
/*      */       //   258: iload #13
/*      */       //   260: if_icmpeq -> 269
/*      */       //   263: iinc #12, 1
/*      */       //   266: goto -> 219
/*      */       //   269: aload #11
/*      */       //   271: aconst_null
/*      */       //   272: iload #10
/*      */       //   274: iload #9
/*      */       //   276: isub
/*      */       //   277: iload #10
/*      */       //   279: invokestatic fill : ([Ljava/lang/Object;Ljava/lang/Object;II)V
/*      */       //   282: aload #7
/*      */       //   284: aload #7
/*      */       //   286: getfield _size : I
/*      */       //   289: iload #9
/*      */       //   291: isub
/*      */       //   292: putfield _size : I
/*      */       //   295: nop
/*      */       //   296: aload_0
/*      */       //   297: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */       //   300: invokestatic access$getCurrentAnimation$p : (Landroidx/compose/animation/core/SeekableTransitionState;)Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;
/*      */       //   303: astore #7
/*      */       //   305: aload #7
/*      */       //   307: ifnull -> 378
/*      */       //   310: aload #7
/*      */       //   312: aload_0
/*      */       //   313: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */       //   316: invokevirtual getTotalDurationNanos$animation_core : ()J
/*      */       //   319: invokevirtual setDurationNanos : (J)V
/*      */       //   322: aload_0
/*      */       //   323: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */       //   326: aload #7
/*      */       //   328: lload #5
/*      */       //   330: invokestatic access$recalculateAnimationValue : (Landroidx/compose/animation/core/SeekableTransitionState;Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;J)V
/*      */       //   333: aload_0
/*      */       //   334: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */       //   337: aload #7
/*      */       //   339: invokevirtual getValue : ()F
/*      */       //   342: invokestatic access$setFraction : (Landroidx/compose/animation/core/SeekableTransitionState;F)V
/*      */       //   345: aload #7
/*      */       //   347: invokevirtual getValue : ()F
/*      */       //   350: fconst_1
/*      */       //   351: fcmpg
/*      */       //   352: ifne -> 359
/*      */       //   355: iconst_1
/*      */       //   356: goto -> 360
/*      */       //   359: iconst_0
/*      */       //   360: ifeq -> 371
/*      */       //   363: aload_0
/*      */       //   364: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */       //   367: aconst_null
/*      */       //   368: invokestatic access$setCurrentAnimation$p : (Landroidx/compose/animation/core/SeekableTransitionState;Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;)V
/*      */       //   371: aload_0
/*      */       //   372: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */       //   375: invokestatic access$seekToFraction : (Landroidx/compose/animation/core/SeekableTransitionState;)V
/*      */       //   378: return
/*      */       // Line number table:
/*      */       //   Java source line number -> byte code offset
/*      */       //   #313	-> 0
/*      */       //   #314	-> 10
/*      */       //   #315	-> 18
/*      */       //   #316	-> 34
/*      */       //   #317	-> 47
/*      */       //   #2187	-> 68
/*      */       //   #2188	-> 69
/*      */       //   #2189	-> 76
/*      */       //   #2190	-> 93
/*      */       //   #320	-> 106
/*      */       //   #321	-> 115
/*      */       //   #322	-> 121
/*      */       //   #2190	-> 122
/*      */       //   #2189	-> 123
/*      */       //   #2192	-> 129
/*      */       //   #323	-> 130
/*      */       //   #324	-> 148
/*      */       //   #2193	-> 160
/*      */       //   #2194	-> 163
/*      */       //   #2195	-> 170
/*      */       //   #2196	-> 177
/*      */       //   #2197	-> 187
/*      */       //   #2196	-> 196
/*      */       //   #2198	-> 219
/*      */       //   #2199	-> 232
/*      */       //   #324	-> 245
/*      */       //   #2199	-> 250
/*      */       //   #2200	-> 253
/*      */       //   #2196	-> 256
/*      */       //   #2203	-> 269
/*      */       //   #2204	-> 282
/*      */       //   #2205	-> 295
/*      */       //   #326	-> 296
/*      */       //   #327	-> 305
/*      */       //   #328	-> 310
/*      */       //   #329	-> 322
/*      */       //   #330	-> 333
/*      */       //   #331	-> 345
/*      */       //   #332	-> 363
/*      */       //   #334	-> 371
/*      */       //   #336	-> 378
/*      */       // Local variable table:
/*      */       //   start	length	slot	name	descriptor
/*      */       //   106	16	14	$i$a$-forEach-SeekableTransitionState$animateOneFrameLambda$1$1	I
/*      */       //   103	19	13	animation	Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;
/*      */       //   79	50	11	i$iv	I
/*      */       //   68	62	9	$i$f$forEach	I
/*      */       //   76	54	10	content$iv	[Ljava/lang/Object;
/*      */       //   65	65	7	this_$iv	Landroidx/collection/ObjectList;
/*      */       //   245	5	16	$i$a$-removeIf-SeekableTransitionState$animateOneFrameLambda$1$2	I
/*      */       //   242	8	15	it	Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;
/*      */       //   187	9	13	$i$f$getIndices	I
/*      */       //   184	12	12	this_$iv$iv	Landroidx/collection/ObjectList;
/*      */       //   205	64	12	i$iv	I
/*      */       //   160	136	8	$i$f$removeIf	I
/*      */       //   163	133	9	gap$iv	I
/*      */       //   170	126	10	size$iv	I
/*      */       //   177	119	11	content$iv	[Ljava/lang/Object;
/*      */       //   157	139	7	this_$iv	Landroidx/collection/MutableObjectList;
/*      */       //   10	369	3	delta	J
/*      */       //   34	345	5	deltaPlayTimeNanos	J
/*      */       //   305	74	7	currentAnimation	Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;
/*      */       //   0	379	0	this	Landroidx/compose/animation/core/SeekableTransitionState$animateOneFrameLambda$1;
/*      */       //   0	379	1	frameTimeNanos	J
/*      */     }
/*      */     
/*      */     SeekableTransitionState$animateOneFrameLambda$1() {
/*      */       super(1);
/*      */     }
/*      */   }
/*      */   
/*      */   private final void endAllAnimations() {
/*      */     if (this.transition != null) {
/*      */       this.transition.clearInitialAnimations$animation_core();
/*      */     } else {
/*      */     
/*      */     } 
/*      */     this.initialValueAnimations.clear();
/*      */     SeekingAnimationState current = this.currentAnimation;
/*      */     if (current != null) {
/*      */       this.currentAnimation = null;
/*      */       setFraction(1.0F);
/*      */       seekToFraction();
/*      */     } 
/*      */   }
/*      */   
/*      */   private final Object runAnimations(Continuation<? super Unit> paramContinuation) {
/*      */     // Byte code:
/*      */     //   0: aload_1
/*      */     //   1: instanceof androidx/compose/animation/core/SeekableTransitionState$runAnimations$1
/*      */     //   4: ifeq -> 36
/*      */     //   7: aload_1
/*      */     //   8: checkcast androidx/compose/animation/core/SeekableTransitionState$runAnimations$1
/*      */     //   11: astore_3
/*      */     //   12: aload_3
/*      */     //   13: getfield label : I
/*      */     //   16: ldc -2147483648
/*      */     //   18: iand
/*      */     //   19: ifeq -> 36
/*      */     //   22: aload_3
/*      */     //   23: dup
/*      */     //   24: getfield label : I
/*      */     //   27: ldc -2147483648
/*      */     //   29: isub
/*      */     //   30: putfield label : I
/*      */     //   33: goto -> 46
/*      */     //   36: new androidx/compose/animation/core/SeekableTransitionState$runAnimations$1
/*      */     //   39: dup
/*      */     //   40: aload_0
/*      */     //   41: aload_1
/*      */     //   42: invokespecial <init> : (Landroidx/compose/animation/core/SeekableTransitionState;Lkotlin/coroutines/Continuation;)V
/*      */     //   45: astore_3
/*      */     //   46: aload_3
/*      */     //   47: getfield result : Ljava/lang/Object;
/*      */     //   50: astore_2
/*      */     //   51: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*      */     //   54: astore #4
/*      */     //   56: aload_3
/*      */     //   57: getfield label : I
/*      */     //   60: tableswitch default -> 271, 0 -> 88, 1 -> 188, 2 -> 243
/*      */     //   88: aload_2
/*      */     //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */     //   92: aload_0
/*      */     //   93: getfield initialValueAnimations : Landroidx/collection/MutableObjectList;
/*      */     //   96: invokevirtual isEmpty : ()Z
/*      */     //   99: ifeq -> 113
/*      */     //   102: aload_0
/*      */     //   103: getfield currentAnimation : Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;
/*      */     //   106: ifnonnull -> 113
/*      */     //   109: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */     //   112: areturn
/*      */     //   113: aload_3
/*      */     //   114: invokeinterface getContext : ()Lkotlin/coroutines/CoroutineContext;
/*      */     //   119: invokestatic getDurationScale : (Lkotlin/coroutines/CoroutineContext;)F
/*      */     //   122: fconst_0
/*      */     //   123: fcmpg
/*      */     //   124: ifne -> 131
/*      */     //   127: iconst_1
/*      */     //   128: goto -> 132
/*      */     //   131: iconst_0
/*      */     //   132: ifeq -> 150
/*      */     //   135: aload_0
/*      */     //   136: invokespecial endAllAnimations : ()V
/*      */     //   139: aload_0
/*      */     //   140: ldc2_w -9223372036854775808
/*      */     //   143: putfield lastFrameTimeNanos : J
/*      */     //   146: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */     //   149: areturn
/*      */     //   150: aload_0
/*      */     //   151: getfield lastFrameTimeNanos : J
/*      */     //   154: ldc2_w -9223372036854775808
/*      */     //   157: lcmp
/*      */     //   158: ifne -> 202
/*      */     //   161: aload_0
/*      */     //   162: getfield firstFrameLambda : Lkotlin/jvm/functions/Function1;
/*      */     //   165: aload_3
/*      */     //   166: aload_3
/*      */     //   167: aload_0
/*      */     //   168: putfield L$0 : Ljava/lang/Object;
/*      */     //   171: aload_3
/*      */     //   172: iconst_1
/*      */     //   173: putfield label : I
/*      */     //   176: invokestatic withFrameNanos : (Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */     //   179: dup
/*      */     //   180: aload #4
/*      */     //   182: if_acmpne -> 201
/*      */     //   185: aload #4
/*      */     //   187: areturn
/*      */     //   188: aload_3
/*      */     //   189: getfield L$0 : Ljava/lang/Object;
/*      */     //   192: checkcast androidx/compose/animation/core/SeekableTransitionState
/*      */     //   195: astore_0
/*      */     //   196: aload_2
/*      */     //   197: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */     //   200: aload_2
/*      */     //   201: pop
/*      */     //   202: aload_0
/*      */     //   203: getfield initialValueAnimations : Landroidx/collection/MutableObjectList;
/*      */     //   206: invokevirtual isNotEmpty : ()Z
/*      */     //   209: ifne -> 219
/*      */     //   212: aload_0
/*      */     //   213: getfield currentAnimation : Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;
/*      */     //   216: ifnull -> 260
/*      */     //   219: aload_0
/*      */     //   220: aload_3
/*      */     //   221: aload_3
/*      */     //   222: aload_0
/*      */     //   223: putfield L$0 : Ljava/lang/Object;
/*      */     //   226: aload_3
/*      */     //   227: iconst_2
/*      */     //   228: putfield label : I
/*      */     //   231: invokespecial animateOneFrame : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */     //   234: dup
/*      */     //   235: aload #4
/*      */     //   237: if_acmpne -> 256
/*      */     //   240: aload #4
/*      */     //   242: areturn
/*      */     //   243: aload_3
/*      */     //   244: getfield L$0 : Ljava/lang/Object;
/*      */     //   247: checkcast androidx/compose/animation/core/SeekableTransitionState
/*      */     //   250: astore_0
/*      */     //   251: aload_2
/*      */     //   252: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */     //   255: aload_2
/*      */     //   256: pop
/*      */     //   257: goto -> 202
/*      */     //   260: aload_0
/*      */     //   261: ldc2_w -9223372036854775808
/*      */     //   264: putfield lastFrameTimeNanos : J
/*      */     //   267: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */     //   270: areturn
/*      */     //   271: new java/lang/IllegalStateException
/*      */     //   274: dup
/*      */     //   275: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*      */     //   278: invokespecial <init> : (Ljava/lang/String;)V
/*      */     //   281: athrow
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #359	-> 54
/*      */     //   #360	-> 92
/*      */     //   #362	-> 109
/*      */     //   #364	-> 113
/*      */     //   #364	-> 119
/*      */     //   #365	-> 135
/*      */     //   #366	-> 139
/*      */     //   #367	-> 146
/*      */     //   #369	-> 150
/*      */     //   #371	-> 161
/*      */     //   #359	-> 185
/*      */     //   #373	-> 201
/*      */     //   #374	-> 219
/*      */     //   #359	-> 240
/*      */     //   #374	-> 256
/*      */     //   #376	-> 260
/*      */     //   #377	-> 267
/*      */     //   #359	-> 271
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   92	17	0	this	Landroidx/compose/animation/core/SeekableTransitionState;
/*      */     //   113	6	0	this	Landroidx/compose/animation/core/SeekableTransitionState;
/*      */     //   119	69	0	this	Landroidx/compose/animation/core/SeekableTransitionState;
/*      */     //   196	47	0	this	Landroidx/compose/animation/core/SeekableTransitionState;
/*      */     //   251	20	0	this	Landroidx/compose/animation/core/SeekableTransitionState;
/*      */     //   46	225	3	$continuation	Lkotlin/coroutines/Continuation;
/*      */     //   51	220	2	$result	Ljava/lang/Object;
/*      */   }
/*      */   
/*      */   private final Object doOneFrame(Continuation<? super Unit> $completion) {
/*      */     if (this.lastFrameTimeNanos == Long.MIN_VALUE) {
/*      */       if (MonotonicFrameClockKt.withFrameNanos(this.firstFrameLambda, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*      */         return MonotonicFrameClockKt.withFrameNanos(this.firstFrameLambda, $completion); 
/*      */       MonotonicFrameClockKt.withFrameNanos(this.firstFrameLambda, $completion);
/*      */       return Unit.INSTANCE;
/*      */     } 
/*      */     if (animateOneFrame($completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*      */       return animateOneFrame($completion); 
/*      */     animateOneFrame($completion);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private final Object animateOneFrame(Continuation $completion) {
/*      */     float durationScale = SuspendAnimationKt.getDurationScale($completion.getContext());
/*      */     if (durationScale <= 0.0F) {
/*      */       endAllAnimations();
/*      */     } else {
/*      */       this.durationScale = durationScale;
/*      */       if (MonotonicFrameClockKt.withFrameNanos(this.animateOneFrameLambda, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*      */         return MonotonicFrameClockKt.withFrameNanos(this.animateOneFrameLambda, $completion); 
/*      */       MonotonicFrameClockKt.withFrameNanos(this.animateOneFrameLambda, $completion);
/*      */       return Unit.INSTANCE;
/*      */     } 
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private final void recalculateAnimationValue(SeekingAnimationState animation, long deltaPlayTimeNanos) {
/*      */     // Byte code:
/*      */     //   0: aload_1
/*      */     //   1: invokevirtual getProgressNanos : ()J
/*      */     //   4: lload_2
/*      */     //   5: ladd
/*      */     //   6: lstore #4
/*      */     //   8: aload_1
/*      */     //   9: lload #4
/*      */     //   11: invokevirtual setProgressNanos : (J)V
/*      */     //   14: aload_1
/*      */     //   15: invokevirtual getAnimationSpecDuration : ()J
/*      */     //   18: lstore #6
/*      */     //   20: lload #4
/*      */     //   22: lload #6
/*      */     //   24: lcmp
/*      */     //   25: iflt -> 36
/*      */     //   28: aload_1
/*      */     //   29: fconst_1
/*      */     //   30: invokevirtual setValue : (F)V
/*      */     //   33: goto -> 126
/*      */     //   36: aload_1
/*      */     //   37: invokevirtual getAnimationSpec : ()Landroidx/compose/animation/core/VectorizedAnimationSpec;
/*      */     //   40: astore #8
/*      */     //   42: aload #8
/*      */     //   44: ifnull -> 103
/*      */     //   47: aload_1
/*      */     //   48: aload #8
/*      */     //   50: lload #4
/*      */     //   52: aload_1
/*      */     //   53: invokevirtual getStart : ()Landroidx/compose/animation/core/AnimationVector1D;
/*      */     //   56: checkcast androidx/compose/animation/core/AnimationVector
/*      */     //   59: getstatic androidx/compose/animation/core/SeekableTransitionState.Target1 : Landroidx/compose/animation/core/AnimationVector1D;
/*      */     //   62: checkcast androidx/compose/animation/core/AnimationVector
/*      */     //   65: aload_1
/*      */     //   66: invokevirtual getInitialVelocity : ()Landroidx/compose/animation/core/AnimationVector1D;
/*      */     //   69: dup
/*      */     //   70: ifnonnull -> 77
/*      */     //   73: pop
/*      */     //   74: getstatic androidx/compose/animation/core/SeekableTransitionState.ZeroVelocity : Landroidx/compose/animation/core/AnimationVector1D;
/*      */     //   77: checkcast androidx/compose/animation/core/AnimationVector
/*      */     //   80: invokeinterface getValueFromNanos : (JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;
/*      */     //   85: checkcast androidx/compose/animation/core/AnimationVector1D
/*      */     //   88: iconst_0
/*      */     //   89: invokevirtual get$animation_core : (I)F
/*      */     //   92: fconst_0
/*      */     //   93: fconst_1
/*      */     //   94: invokestatic coerceIn : (FFF)F
/*      */     //   97: invokevirtual setValue : (F)V
/*      */     //   100: goto -> 126
/*      */     //   103: aload_1
/*      */     //   104: aload_1
/*      */     //   105: invokevirtual getStart : ()Landroidx/compose/animation/core/AnimationVector1D;
/*      */     //   108: iconst_0
/*      */     //   109: invokevirtual get$animation_core : (I)F
/*      */     //   112: fconst_1
/*      */     //   113: lload #4
/*      */     //   115: l2f
/*      */     //   116: lload #6
/*      */     //   118: l2f
/*      */     //   119: fdiv
/*      */     //   120: invokestatic lerp : (FFF)F
/*      */     //   123: invokevirtual setValue : (F)V
/*      */     //   126: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #414	-> 0
/*      */     //   #415	-> 8
/*      */     //   #416	-> 14
/*      */     //   #417	-> 20
/*      */     //   #418	-> 28
/*      */     //   #420	-> 36
/*      */     //   #421	-> 42
/*      */     //   #422	-> 47
/*      */     //   #423	-> 50
/*      */     //   #424	-> 52
/*      */     //   #425	-> 59
/*      */     //   #426	-> 65
/*      */     //   #422	-> 80
/*      */     //   #427	-> 88
/*      */     //   #422	-> 89
/*      */     //   #427	-> 92
/*      */     //   #422	-> 97
/*      */     //   #429	-> 103
/*      */     //   #430	-> 104
/*      */     //   #431	-> 112
/*      */     //   #432	-> 113
/*      */     //   #429	-> 120
/*      */     //   #436	-> 126
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   42	84	8	animationSpec	Landroidx/compose/animation/core/VectorizedAnimationSpec;
/*      */     //   8	119	4	playTimeNanos	J
/*      */     //   20	107	6	durationNanos	J
/*      */     //   0	127	0	this	Landroidx/compose/animation/core/SeekableTransitionState;
/*      */     //   0	127	1	animation	Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;
/*      */     //   0	127	2	deltaPlayTimeNanos	J
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final Object snapTo(Object targetState, @NotNull Continuation $completion) {
/*      */     Transition<S> transition;
/*      */     if (this.transition == null)
/*      */       return Unit.INSTANCE; 
/*      */     if (Intrinsics.areEqual(getCurrentState(), targetState) && Intrinsics.areEqual(getTargetState(), targetState))
/*      */       return Unit.INSTANCE; 
/*      */     if (MutatorMutex.mutate$default(this.mutatorMutex, null, new SeekableTransitionState$snapTo$2((S)targetState, transition, null), $completion, 1, null) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*      */       return MutatorMutex.mutate$default(this.mutatorMutex, null, new SeekableTransitionState$snapTo$2((S)targetState, transition, null), $completion, 1, null); 
/*      */     MutatorMutex.mutate$default(this.mutatorMutex, null, new SeekableTransitionState$snapTo$2((S)targetState, transition, null), $completion, 1, null);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   @DebugMetadata(f = "Transition.kt", l = {478}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2")
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001\"\004\b\000\020\002H@"}, d2 = {"<anonymous>", "", "S"})
/*      */   static final class SeekableTransitionState$snapTo$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
/*      */     int label;
/*      */     
/*      */     SeekableTransitionState$snapTo$2(Object $targetState, Transition<S> $transition, Continuation $completion) {
/*      */       super(1, $completion);
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public final Object invokeSuspend(@NotNull Object $result) {
/*      */       // Byte code:
/*      */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*      */       //   3: astore #4
/*      */       //   5: aload_0
/*      */       //   6: getfield label : I
/*      */       //   9: tableswitch default -> 221, 0 -> 32, 1 -> 204
/*      */       //   32: aload_1
/*      */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */       //   36: aload_0
/*      */       //   37: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */       //   40: invokestatic access$endAllAnimations : (Landroidx/compose/animation/core/SeekableTransitionState;)V
/*      */       //   43: aload_0
/*      */       //   44: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */       //   47: ldc2_w -9223372036854775808
/*      */       //   50: invokestatic access$setLastFrameTimeNanos$p : (Landroidx/compose/animation/core/SeekableTransitionState;J)V
/*      */       //   53: aload_0
/*      */       //   54: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */       //   57: fconst_0
/*      */       //   58: invokestatic access$setFraction : (Landroidx/compose/animation/core/SeekableTransitionState;F)V
/*      */       //   61: aload_0
/*      */       //   62: getfield $targetState : Ljava/lang/Object;
/*      */       //   65: astore_3
/*      */       //   66: aload_3
/*      */       //   67: aload_0
/*      */       //   68: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */       //   71: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*      */       //   74: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */       //   77: ifeq -> 85
/*      */       //   80: ldc -4.0
/*      */       //   82: goto -> 106
/*      */       //   85: aload_3
/*      */       //   86: aload_0
/*      */       //   87: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */       //   90: invokevirtual getTargetState : ()Ljava/lang/Object;
/*      */       //   93: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */       //   96: ifeq -> 104
/*      */       //   99: ldc -5.0
/*      */       //   101: goto -> 106
/*      */       //   104: ldc -3.0
/*      */       //   106: fstore_2
/*      */       //   107: aload_0
/*      */       //   108: getfield $transition : Landroidx/compose/animation/core/Transition;
/*      */       //   111: aload_0
/*      */       //   112: getfield $targetState : Ljava/lang/Object;
/*      */       //   115: invokevirtual updateTarget$animation_core : (Ljava/lang/Object;)V
/*      */       //   118: aload_0
/*      */       //   119: getfield $transition : Landroidx/compose/animation/core/Transition;
/*      */       //   122: lconst_0
/*      */       //   123: invokevirtual setPlayTimeNanos : (J)V
/*      */       //   126: aload_0
/*      */       //   127: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */       //   130: aload_0
/*      */       //   131: getfield $targetState : Ljava/lang/Object;
/*      */       //   134: invokevirtual setTargetState$animation_core : (Ljava/lang/Object;)V
/*      */       //   137: aload_0
/*      */       //   138: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */       //   141: fconst_0
/*      */       //   142: invokestatic access$setFraction : (Landroidx/compose/animation/core/SeekableTransitionState;F)V
/*      */       //   145: aload_0
/*      */       //   146: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */       //   149: aload_0
/*      */       //   150: getfield $targetState : Ljava/lang/Object;
/*      */       //   153: invokevirtual setCurrentState$animation_core : (Ljava/lang/Object;)V
/*      */       //   156: aload_0
/*      */       //   157: getfield $transition : Landroidx/compose/animation/core/Transition;
/*      */       //   160: fload_2
/*      */       //   161: invokevirtual resetAnimationFraction$animation_core : (F)V
/*      */       //   164: fload_2
/*      */       //   165: ldc -3.0
/*      */       //   167: fcmpg
/*      */       //   168: ifne -> 175
/*      */       //   171: iconst_1
/*      */       //   172: goto -> 176
/*      */       //   175: iconst_0
/*      */       //   176: ifeq -> 210
/*      */       //   179: aload_0
/*      */       //   180: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */       //   183: aload_0
/*      */       //   184: checkcast kotlin/coroutines/Continuation
/*      */       //   187: aload_0
/*      */       //   188: iconst_1
/*      */       //   189: putfield label : I
/*      */       //   192: invokestatic access$waitForCompositionAfterTargetStateChange : (Landroidx/compose/animation/core/SeekableTransitionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */       //   195: dup
/*      */       //   196: aload #4
/*      */       //   198: if_acmpne -> 209
/*      */       //   201: aload #4
/*      */       //   203: areturn
/*      */       //   204: aload_1
/*      */       //   205: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */       //   208: aload_1
/*      */       //   209: pop
/*      */       //   210: aload_0
/*      */       //   211: getfield $transition : Landroidx/compose/animation/core/Transition;
/*      */       //   214: invokevirtual onTransitionEnd$animation_core : ()V
/*      */       //   217: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */       //   220: areturn
/*      */       //   221: new java/lang/IllegalStateException
/*      */       //   224: dup
/*      */       //   225: ldc 'call to 'resume' before 'invoke' with coroutine'
/*      */       //   227: invokespecial <init> : (Ljava/lang/String;)V
/*      */       //   230: athrow
/*      */       // Line number table:
/*      */       //   Java source line number -> byte code offset
/*      */       //   #460	-> 3
/*      */       //   #461	-> 36
/*      */       //   #462	-> 43
/*      */       //   #463	-> 53
/*      */       //   #464	-> 61
/*      */       //   #465	-> 66
/*      */       //   #466	-> 85
/*      */       //   #467	-> 104
/*      */       //   #464	-> 106
/*      */       //   #469	-> 107
/*      */       //   #470	-> 118
/*      */       //   #471	-> 126
/*      */       //   #472	-> 137
/*      */       //   #473	-> 145
/*      */       //   #474	-> 156
/*      */       //   #475	-> 164
/*      */       //   #478	-> 179
/*      */       //   #460	-> 201
/*      */       //   #480	-> 209
/*      */       //   #481	-> 217
/*      */       //   #460	-> 221
/*      */       // Local variable table:
/*      */       //   start	length	slot	name	descriptor
/*      */       //   107	68	2	fraction	F
/*      */       //   36	185	0	this	Landroidx/compose/animation/core/SeekableTransitionState$snapTo$2;
/*      */       //   36	185	1	$result	Ljava/lang/Object;
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final Continuation<Unit> create(@NotNull Continuation<? super SeekableTransitionState$snapTo$2> $completion) {
/*      */       return (Continuation<Unit>)new SeekableTransitionState$snapTo$2(this.$targetState, this.$transition, $completion);
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public final Object invoke(@Nullable Continuation<?> p1) {
/*      */       return ((SeekableTransitionState$snapTo$2)create(p1)).invokeSuspend(Unit.INSTANCE);
/*      */     }
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final Object seekTo(@FloatRange(from = 0.0D, to = 1.0D) float fraction, Object targetState, @NotNull Continuation $completion) {
/*      */     // Byte code:
/*      */     //   0: fconst_0
/*      */     //   1: fload_1
/*      */     //   2: fcmpg
/*      */     //   3: ifgt -> 20
/*      */     //   6: fload_1
/*      */     //   7: fconst_1
/*      */     //   8: fcmpg
/*      */     //   9: ifgt -> 16
/*      */     //   12: iconst_1
/*      */     //   13: goto -> 21
/*      */     //   16: iconst_0
/*      */     //   17: goto -> 21
/*      */     //   20: iconst_0
/*      */     //   21: istore #4
/*      */     //   23: iconst_0
/*      */     //   24: istore #5
/*      */     //   26: nop
/*      */     //   27: iload #4
/*      */     //   29: ifne -> 58
/*      */     //   32: iconst_0
/*      */     //   33: istore #6
/*      */     //   35: new java/lang/StringBuilder
/*      */     //   38: dup
/*      */     //   39: invokespecial <init> : ()V
/*      */     //   42: ldc_w 'Expecting fraction between 0 and 1. Got '
/*      */     //   45: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   48: fload_1
/*      */     //   49: invokevirtual append : (F)Ljava/lang/StringBuilder;
/*      */     //   52: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   55: invokestatic throwIllegalArgumentException : (Ljava/lang/String;)V
/*      */     //   58: nop
/*      */     //   59: aload_0
/*      */     //   60: getfield transition : Landroidx/compose/animation/core/Transition;
/*      */     //   63: dup
/*      */     //   64: ifnonnull -> 72
/*      */     //   67: pop
/*      */     //   68: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */     //   71: areturn
/*      */     //   72: astore #4
/*      */     //   74: aload_0
/*      */     //   75: invokevirtual getTargetState : ()Ljava/lang/Object;
/*      */     //   78: astore #5
/*      */     //   80: aload_0
/*      */     //   81: getfield mutatorMutex : Landroidx/compose/animation/core/MutatorMutex;
/*      */     //   84: aconst_null
/*      */     //   85: new androidx/compose/animation/core/SeekableTransitionState$seekTo$3
/*      */     //   88: dup
/*      */     //   89: aload_2
/*      */     //   90: aload #5
/*      */     //   92: aload_0
/*      */     //   93: aload #4
/*      */     //   95: fload_1
/*      */     //   96: aconst_null
/*      */     //   97: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/SeekableTransitionState;Landroidx/compose/animation/core/Transition;FLkotlin/coroutines/Continuation;)V
/*      */     //   100: checkcast kotlin/jvm/functions/Function1
/*      */     //   103: aload_3
/*      */     //   104: iconst_1
/*      */     //   105: aconst_null
/*      */     //   106: invokestatic mutate$default : (Landroidx/compose/animation/core/MutatorMutex;Landroidx/compose/animation/core/MutatePriority;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*      */     //   109: dup
/*      */     //   110: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*      */     //   113: if_acmpne -> 117
/*      */     //   116: areturn
/*      */     //   117: pop
/*      */     //   118: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */     //   121: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #504	-> 0
/*      */     //   #2196	-> 26
/*      */     //   #2199	-> 27
/*      */     //   #2200	-> 32
/*      */     //   #505	-> 35
/*      */     //   #2200	-> 55
/*      */     //   #2202	-> 58
/*      */     //   #507	-> 59
/*      */     //   #508	-> 74
/*      */     //   #509	-> 80
/*      */     //   #536	-> 118
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   35	20	6	$i$a$-requirePrecondition-SeekableTransitionState$seekTo$2	I
/*      */     //   26	33	5	$i$f$requirePrecondition	I
/*      */     //   23	36	4	value$iv	Z
/*      */     //   74	48	4	transition	Landroidx/compose/animation/core/Transition;
/*      */     //   80	42	5	oldTargetState	Ljava/lang/Object;
/*      */     //   0	122	0	this	Landroidx/compose/animation/core/SeekableTransitionState;
/*      */     //   0	122	1	fraction	F
/*      */     //   0	122	2	targetState	Ljava/lang/Object;
/*      */     //   0	122	3	$completion	Lkotlin/coroutines/Continuation;
/*      */   }
/*      */   
/*      */   @DebugMetadata(f = "Transition.kt", l = {510}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3")
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001\"\004\b\000\020\002H@"}, d2 = {"<anonymous>", "", "S"})
/*      */   static final class SeekableTransitionState$seekTo$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
/*      */     int label;
/*      */     
/*      */     SeekableTransitionState$seekTo$3(Object $oldTargetState, SeekableTransitionState<S> $receiver, Transition<S> $transition, float $fraction, Continuation $completion) {
/*      */       super(1, $completion);
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public final Object invokeSuspend(@NotNull Object $result) {
/*      */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*      */       switch (this.label) {
/*      */         case 0:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           this.label = 1;
/*      */           if (CoroutineScopeKt.coroutineScope(new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$oldTargetState, SeekableTransitionState.this, this.$transition, this.$fraction, null) {
/*      */                 int label;
/*      */                 
/*      */                 @Nullable
/*      */                 public final Object invokeSuspend(@NotNull Object $result) {
/*      */                   CoroutineScope $this$coroutineScope;
/*      */                   Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*      */                   switch (this.label) {
/*      */                     case 0:
/*      */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */                       $this$coroutineScope = (CoroutineScope)this.L$0;
/*      */                       if (!Intrinsics.areEqual(this.$targetState, this.$oldTargetState)) {
/*      */                         SeekableTransitionState.this.moveAnimationToInitialState();
/*      */                       } else {
/*      */                         SeekableTransitionState.this.currentAnimation = null;
/*      */                         if (Intrinsics.areEqual(SeekableTransitionState.this.getCurrentState(), this.$targetState))
/*      */                           return Unit.INSTANCE; 
/*      */                       } 
/*      */                       if (!Intrinsics.areEqual(this.$targetState, this.$oldTargetState)) {
/*      */                         this.$transition.updateTarget$animation_core(this.$targetState);
/*      */                         this.$transition.setPlayTimeNanos(0L);
/*      */                         SeekableTransitionState.this.setTargetState$animation_core(this.$targetState);
/*      */                         this.$transition.resetAnimationFraction$animation_core(this.$fraction);
/*      */                       } 
/*      */                       SeekableTransitionState.this.setFraction(this.$fraction);
/*      */                       if (SeekableTransitionState.this.initialValueAnimations.isNotEmpty()) {
/*      */                         BuildersKt.launch$default($this$coroutineScope, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) {
/*      */                               int label;
/*      */                               
/*      */                               @Nullable
/*      */                               public final Object invokeSuspend(@NotNull Object $result) {
/*      */                                 Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*      */                                 switch (this.label) {
/*      */                                   case 0:
/*      */                                     ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */                                     this.label = 1;
/*      */                                     if (SeekableTransitionState.this.runAnimations((Continuation)this) == object)
/*      */                                       return object; 
/*      */                                     SeekableTransitionState.this.runAnimations((Continuation)this);
/*      */                                     return Unit.INSTANCE;
/*      */                                   case 1:
/*      */                                     ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */                                     return Unit.INSTANCE;
/*      */                                 } 
/*      */                                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*      */                               }
/*      */                               
/*      */                               @NotNull
/*      */                               public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*      */                                 return (Continuation)new Function2<>(SeekableTransitionState.this, $completion);
/*      */                               }
/*      */                               
/*      */                               @Nullable
/*      */                               public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*      */                                 return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */                               }
/*      */                             }3, null);
/*      */                       } else {
/*      */                         SeekableTransitionState.this.lastFrameTimeNanos = Long.MIN_VALUE;
/*      */                       } 
/*      */                       this.label = 1;
/*      */                       if (SeekableTransitionState.this.waitForCompositionAfterTargetStateChange((Continuation)this) == object)
/*      */                         return object; 
/*      */                       SeekableTransitionState.this.waitForCompositionAfterTargetStateChange((Continuation)this);
/*      */                       SeekableTransitionState.this.seekToFraction();
/*      */                       return Unit.INSTANCE;
/*      */                     case 1:
/*      */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */                       SeekableTransitionState.this.seekToFraction();
/*      */                       return Unit.INSTANCE;
/*      */                   } 
/*      */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*      */                 }
/*      */                 
/*      */                 @NotNull
/*      */                 public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*      */                   Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$targetState, this.$oldTargetState, SeekableTransitionState.this, this.$transition, this.$fraction, $completion);
/*      */                   function2.L$0 = value;
/*      */                   return (Continuation)function2;
/*      */                 }
/*      */                 
/*      */                 @Nullable
/*      */                 public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*      */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */                 }
/*      */               }(Continuation)this) == object)
/*      */             return object; 
/*      */           CoroutineScopeKt.coroutineScope(new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$oldTargetState, SeekableTransitionState.this, this.$transition, this.$fraction, null) {
/*      */                 int label;
/*      */                 
/*      */                 @Nullable
/*      */                 public final Object invokeSuspend(@NotNull Object $result) {
/*      */                   CoroutineScope $this$coroutineScope;
/*      */                   Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*      */                   switch (this.label) {
/*      */                     case 0:
/*      */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */                       $this$coroutineScope = (CoroutineScope)this.L$0;
/*      */                       if (!Intrinsics.areEqual(this.$targetState, this.$oldTargetState)) {
/*      */                         SeekableTransitionState.this.moveAnimationToInitialState();
/*      */                       } else {
/*      */                         SeekableTransitionState.this.currentAnimation = null;
/*      */                         if (Intrinsics.areEqual(SeekableTransitionState.this.getCurrentState(), this.$targetState))
/*      */                           return Unit.INSTANCE; 
/*      */                       } 
/*      */                       if (!Intrinsics.areEqual(this.$targetState, this.$oldTargetState)) {
/*      */                         this.$transition.updateTarget$animation_core(this.$targetState);
/*      */                         this.$transition.setPlayTimeNanos(0L);
/*      */                         SeekableTransitionState.this.setTargetState$animation_core(this.$targetState);
/*      */                         this.$transition.resetAnimationFraction$animation_core(this.$fraction);
/*      */                       } 
/*      */                       SeekableTransitionState.this.setFraction(this.$fraction);
/*      */                       if (SeekableTransitionState.this.initialValueAnimations.isNotEmpty()) {
/*      */                         BuildersKt.launch$default($this$coroutineScope, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) {
/*      */                               int label;
/*      */                               
/*      */                               @Nullable
/*      */                               public final Object invokeSuspend(@NotNull Object $result) {
/*      */                                 Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*      */                                 switch (this.label) {
/*      */                                   case 0:
/*      */                                     ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */                                     this.label = 1;
/*      */                                     if (SeekableTransitionState.this.runAnimations((Continuation)this) == object)
/*      */                                       return object; 
/*      */                                     SeekableTransitionState.this.runAnimations((Continuation)this);
/*      */                                     return Unit.INSTANCE;
/*      */                                   case 1:
/*      */                                     ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */                                     return Unit.INSTANCE;
/*      */                                 } 
/*      */                                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*      */                               }
/*      */                               
/*      */                               @NotNull
/*      */                               public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*      */                                 return (Continuation)new Function2<>(SeekableTransitionState.this, $completion);
/*      */                               }
/*      */                               
/*      */                               @Nullable
/*      */                               public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*      */                                 return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */                               }
/*      */                             }3, null);
/*      */                       } else {
/*      */                         SeekableTransitionState.this.lastFrameTimeNanos = Long.MIN_VALUE;
/*      */                       } 
/*      */                       this.label = 1;
/*      */                       if (SeekableTransitionState.this.waitForCompositionAfterTargetStateChange((Continuation)this) == object)
/*      */                         return object; 
/*      */                       SeekableTransitionState.this.waitForCompositionAfterTargetStateChange((Continuation)this);
/*      */                       SeekableTransitionState.this.seekToFraction();
/*      */                       return Unit.INSTANCE;
/*      */                     case 1:
/*      */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */                       SeekableTransitionState.this.seekToFraction();
/*      */                       return Unit.INSTANCE;
/*      */                   } 
/*      */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*      */                 }
/*      */                 
/*      */                 @NotNull
/*      */                 public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*      */                   Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$targetState, this.$oldTargetState, SeekableTransitionState.this, this.$transition, this.$fraction, $completion);
/*      */                   function2.L$0 = value;
/*      */                   return (Continuation)function2;
/*      */                 }
/*      */                 
/*      */                 @Nullable
/*      */                 public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*      */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */                 }
/*      */               }(Continuation)this);
/*      */           return Unit.INSTANCE;
/*      */         case 1:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           return Unit.INSTANCE;
/*      */       } 
/*      */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final Continuation<Unit> create(@NotNull Continuation<? super SeekableTransitionState$seekTo$3> $completion) {
/*      */       return (Continuation<Unit>)new SeekableTransitionState$seekTo$3(this.$oldTargetState, SeekableTransitionState.this, this.$transition, this.$fraction, $completion);
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public final Object invoke(@Nullable Continuation<?> p1) {
/*      */       return ((SeekableTransitionState$seekTo$3)create(p1)).invokeSuspend(Unit.INSTANCE);
/*      */     }
/*      */   }
/*      */   
/*      */   private final Object waitForCompositionAfterTargetStateChange(Continuation<? super Unit> paramContinuation) {
/*      */     // Byte code:
/*      */     //   0: aload_1
/*      */     //   1: instanceof androidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1
/*      */     //   4: ifeq -> 39
/*      */     //   7: aload_1
/*      */     //   8: checkcast androidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1
/*      */     //   11: astore #11
/*      */     //   13: aload #11
/*      */     //   15: getfield label : I
/*      */     //   18: ldc -2147483648
/*      */     //   20: iand
/*      */     //   21: ifeq -> 39
/*      */     //   24: aload #11
/*      */     //   26: dup
/*      */     //   27: getfield label : I
/*      */     //   30: ldc -2147483648
/*      */     //   32: isub
/*      */     //   33: putfield label : I
/*      */     //   36: goto -> 50
/*      */     //   39: new androidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1
/*      */     //   42: dup
/*      */     //   43: aload_0
/*      */     //   44: aload_1
/*      */     //   45: invokespecial <init> : (Landroidx/compose/animation/core/SeekableTransitionState;Lkotlin/coroutines/Continuation;)V
/*      */     //   48: astore #11
/*      */     //   50: aload #11
/*      */     //   52: getfield result : Ljava/lang/Object;
/*      */     //   55: astore #10
/*      */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*      */     //   60: astore #12
/*      */     //   62: aload #11
/*      */     //   64: getfield label : I
/*      */     //   67: tableswitch default -> 380, 0 -> 92, 1 -> 141, 2 -> 296
/*      */     //   92: aload #10
/*      */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */     //   97: aload_0
/*      */     //   98: invokevirtual getTargetState : ()Ljava/lang/Object;
/*      */     //   101: astore_2
/*      */     //   102: aload_0
/*      */     //   103: getfield compositionContinuationMutex : Lkotlinx/coroutines/sync/Mutex;
/*      */     //   106: aconst_null
/*      */     //   107: aload #11
/*      */     //   109: iconst_1
/*      */     //   110: aconst_null
/*      */     //   111: aload #11
/*      */     //   113: aload_0
/*      */     //   114: putfield L$0 : Ljava/lang/Object;
/*      */     //   117: aload #11
/*      */     //   119: aload_2
/*      */     //   120: putfield L$1 : Ljava/lang/Object;
/*      */     //   123: aload #11
/*      */     //   125: iconst_1
/*      */     //   126: putfield label : I
/*      */     //   129: invokestatic lock$default : (Lkotlinx/coroutines/sync/Mutex;Ljava/lang/Object;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*      */     //   132: dup
/*      */     //   133: aload #12
/*      */     //   135: if_acmpne -> 163
/*      */     //   138: aload #12
/*      */     //   140: areturn
/*      */     //   141: aload #11
/*      */     //   143: getfield L$1 : Ljava/lang/Object;
/*      */     //   146: astore_2
/*      */     //   147: aload #11
/*      */     //   149: getfield L$0 : Ljava/lang/Object;
/*      */     //   152: checkcast androidx/compose/animation/core/SeekableTransitionState
/*      */     //   155: astore_0
/*      */     //   156: aload #10
/*      */     //   158: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */     //   161: aload #10
/*      */     //   163: pop
/*      */     //   164: aload_2
/*      */     //   165: aload_0
/*      */     //   166: getfield composedTargetState : Ljava/lang/Object;
/*      */     //   169: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   172: ifeq -> 188
/*      */     //   175: aload_0
/*      */     //   176: getfield compositionContinuationMutex : Lkotlinx/coroutines/sync/Mutex;
/*      */     //   179: aconst_null
/*      */     //   180: iconst_1
/*      */     //   181: aconst_null
/*      */     //   182: invokestatic unlock$default : (Lkotlinx/coroutines/sync/Mutex;Ljava/lang/Object;ILjava/lang/Object;)V
/*      */     //   185: goto -> 376
/*      */     //   188: iconst_0
/*      */     //   189: istore #4
/*      */     //   191: aload #11
/*      */     //   193: aload_0
/*      */     //   194: putfield L$0 : Ljava/lang/Object;
/*      */     //   197: aload #11
/*      */     //   199: aload_2
/*      */     //   200: putfield L$1 : Ljava/lang/Object;
/*      */     //   203: aload #11
/*      */     //   205: iconst_2
/*      */     //   206: putfield label : I
/*      */     //   209: aload #11
/*      */     //   211: checkcast kotlin/coroutines/Continuation
/*      */     //   214: astore #5
/*      */     //   216: iconst_0
/*      */     //   217: istore #6
/*      */     //   219: new kotlinx/coroutines/CancellableContinuationImpl
/*      */     //   222: dup
/*      */     //   223: aload #5
/*      */     //   225: invokestatic intercepted : (Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
/*      */     //   228: iconst_1
/*      */     //   229: invokespecial <init> : (Lkotlin/coroutines/Continuation;I)V
/*      */     //   232: astore #7
/*      */     //   234: aload #7
/*      */     //   236: invokevirtual initCancellability : ()V
/*      */     //   239: aload #7
/*      */     //   241: checkcast kotlinx/coroutines/CancellableContinuation
/*      */     //   244: astore #8
/*      */     //   246: iconst_0
/*      */     //   247: istore #9
/*      */     //   249: aload_0
/*      */     //   250: aload #8
/*      */     //   252: invokevirtual setCompositionContinuation$animation_core : (Lkotlinx/coroutines/CancellableContinuation;)V
/*      */     //   255: aload_0
/*      */     //   256: invokevirtual getCompositionContinuationMutex$animation_core : ()Lkotlinx/coroutines/sync/Mutex;
/*      */     //   259: aconst_null
/*      */     //   260: iconst_1
/*      */     //   261: aconst_null
/*      */     //   262: invokestatic unlock$default : (Lkotlinx/coroutines/sync/Mutex;Ljava/lang/Object;ILjava/lang/Object;)V
/*      */     //   265: nop
/*      */     //   266: nop
/*      */     //   267: aload #7
/*      */     //   269: invokevirtual getResult : ()Ljava/lang/Object;
/*      */     //   272: dup
/*      */     //   273: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*      */     //   276: if_acmpne -> 287
/*      */     //   279: aload #11
/*      */     //   281: checkcast kotlin/coroutines/Continuation
/*      */     //   284: invokestatic probeCoroutineSuspended : (Lkotlin/coroutines/Continuation;)V
/*      */     //   287: dup
/*      */     //   288: aload #12
/*      */     //   290: if_acmpne -> 321
/*      */     //   293: aload #12
/*      */     //   295: areturn
/*      */     //   296: iconst_0
/*      */     //   297: istore #4
/*      */     //   299: aload #11
/*      */     //   301: getfield L$1 : Ljava/lang/Object;
/*      */     //   304: astore_2
/*      */     //   305: aload #11
/*      */     //   307: getfield L$0 : Ljava/lang/Object;
/*      */     //   310: checkcast androidx/compose/animation/core/SeekableTransitionState
/*      */     //   313: astore_0
/*      */     //   314: aload #10
/*      */     //   316: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */     //   319: aload #10
/*      */     //   321: nop
/*      */     //   322: astore_3
/*      */     //   323: aload_3
/*      */     //   324: aload_2
/*      */     //   325: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   328: ifne -> 376
/*      */     //   331: aload_0
/*      */     //   332: ldc2_w -9223372036854775808
/*      */     //   335: putfield lastFrameTimeNanos : J
/*      */     //   338: new java/util/concurrent/CancellationException
/*      */     //   341: dup
/*      */     //   342: new java/lang/StringBuilder
/*      */     //   345: dup
/*      */     //   346: invokespecial <init> : ()V
/*      */     //   349: ldc_w 'snapTo() was canceled because state was changed to '
/*      */     //   352: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   355: aload_3
/*      */     //   356: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*      */     //   359: ldc_w ' instead of '
/*      */     //   362: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   365: aload_2
/*      */     //   366: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*      */     //   369: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   372: invokespecial <init> : (Ljava/lang/String;)V
/*      */     //   375: athrow
/*      */     //   376: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */     //   379: areturn
/*      */     //   380: new java/lang/IllegalStateException
/*      */     //   383: dup
/*      */     //   384: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*      */     //   387: invokespecial <init> : (Ljava/lang/String;)V
/*      */     //   390: athrow
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #541	-> 60
/*      */     //   #542	-> 97
/*      */     //   #543	-> 102
/*      */     //   #541	-> 138
/*      */     //   #544	-> 163
/*      */     //   #545	-> 175
/*      */     //   #547	-> 188
/*      */     //   #2203	-> 191
/*      */     //   #2204	-> 219
/*      */     //   #2210	-> 234
/*      */     //   #2211	-> 239
/*      */     //   #548	-> 249
/*      */     //   #549	-> 255
/*      */     //   #550	-> 265
/*      */     //   #2211	-> 266
/*      */     //   #2212	-> 267
/*      */     //   #2203	-> 272
/*      */     //   #541	-> 293
/*      */     //   #2213	-> 321
/*      */     //   #547	-> 322
/*      */     //   #551	-> 323
/*      */     //   #552	-> 331
/*      */     //   #553	-> 338
/*      */     //   #554	-> 342
/*      */     //   #555	-> 355
/*      */     //   #554	-> 356
/*      */     //   #555	-> 359
/*      */     //   #554	-> 362
/*      */     //   #555	-> 365
/*      */     //   #554	-> 366
/*      */     //   #553	-> 372
/*      */     //   #559	-> 376
/*      */     //   #541	-> 380
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   97	44	0	this	Landroidx/compose/animation/core/SeekableTransitionState;
/*      */     //   156	32	0	this	Landroidx/compose/animation/core/SeekableTransitionState;
/*      */     //   188	78	0	this	Landroidx/compose/animation/core/SeekableTransitionState;
/*      */     //   266	30	0	this	Landroidx/compose/animation/core/SeekableTransitionState;
/*      */     //   314	8	0	this	Landroidx/compose/animation/core/SeekableTransitionState;
/*      */     //   322	16	0	this	Landroidx/compose/animation/core/SeekableTransitionState;
/*      */     //   102	39	2	expectedState	Ljava/lang/Object;
/*      */     //   147	28	2	expectedState	Ljava/lang/Object;
/*      */     //   188	78	2	expectedState	Ljava/lang/Object;
/*      */     //   266	30	2	expectedState	Ljava/lang/Object;
/*      */     //   305	17	2	expectedState	Ljava/lang/Object;
/*      */     //   322	44	2	expectedState	Ljava/lang/Object;
/*      */     //   323	53	3	state	Ljava/lang/Object;
/*      */     //   216	56	5	uCont$iv	Lkotlin/coroutines/Continuation;
/*      */     //   234	38	7	cancellable$iv	Lkotlinx/coroutines/CancellableContinuationImpl;
/*      */     //   246	20	8	continuation	Lkotlinx/coroutines/CancellableContinuation;
/*      */     //   249	17	9	$i$a$-suspendCancellableCoroutine-SeekableTransitionState$waitForCompositionAfterTargetStateChange$state$1	I
/*      */     //   219	53	6	$i$a$-suspendCoroutineUninterceptedOrReturn-CancellableContinuationKt$suspendCancellableCoroutine$2$iv	I
/*      */     //   191	105	4	$i$f$suspendCancellableCoroutine	I
/*      */     //   50	330	11	$continuation	Lkotlin/coroutines/Continuation;
/*      */     //   57	323	10	$result	Ljava/lang/Object;
/*      */     //   299	23	4	$i$f$suspendCancellableCoroutine	I
/*      */   }
/*      */   
/*      */   private final Object waitForComposition(Continuation<? super Unit> paramContinuation) {
/*      */     // Byte code:
/*      */     //   0: aload_1
/*      */     //   1: instanceof androidx/compose/animation/core/SeekableTransitionState$waitForComposition$1
/*      */     //   4: ifeq -> 39
/*      */     //   7: aload_1
/*      */     //   8: checkcast androidx/compose/animation/core/SeekableTransitionState$waitForComposition$1
/*      */     //   11: astore #11
/*      */     //   13: aload #11
/*      */     //   15: getfield label : I
/*      */     //   18: ldc -2147483648
/*      */     //   20: iand
/*      */     //   21: ifeq -> 39
/*      */     //   24: aload #11
/*      */     //   26: dup
/*      */     //   27: getfield label : I
/*      */     //   30: ldc -2147483648
/*      */     //   32: isub
/*      */     //   33: putfield label : I
/*      */     //   36: goto -> 50
/*      */     //   39: new androidx/compose/animation/core/SeekableTransitionState$waitForComposition$1
/*      */     //   42: dup
/*      */     //   43: aload_0
/*      */     //   44: aload_1
/*      */     //   45: invokespecial <init> : (Landroidx/compose/animation/core/SeekableTransitionState;Lkotlin/coroutines/Continuation;)V
/*      */     //   48: astore #11
/*      */     //   50: aload #11
/*      */     //   52: getfield result : Ljava/lang/Object;
/*      */     //   55: astore #10
/*      */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*      */     //   60: astore #12
/*      */     //   62: aload #11
/*      */     //   64: getfield label : I
/*      */     //   67: tableswitch default -> 329, 0 -> 92, 1 -> 141, 2 -> 272
/*      */     //   92: aload #10
/*      */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */     //   97: aload_0
/*      */     //   98: invokevirtual getTargetState : ()Ljava/lang/Object;
/*      */     //   101: astore_2
/*      */     //   102: aload_0
/*      */     //   103: getfield compositionContinuationMutex : Lkotlinx/coroutines/sync/Mutex;
/*      */     //   106: aconst_null
/*      */     //   107: aload #11
/*      */     //   109: iconst_1
/*      */     //   110: aconst_null
/*      */     //   111: aload #11
/*      */     //   113: aload_0
/*      */     //   114: putfield L$0 : Ljava/lang/Object;
/*      */     //   117: aload #11
/*      */     //   119: aload_2
/*      */     //   120: putfield L$1 : Ljava/lang/Object;
/*      */     //   123: aload #11
/*      */     //   125: iconst_1
/*      */     //   126: putfield label : I
/*      */     //   129: invokestatic lock$default : (Lkotlinx/coroutines/sync/Mutex;Ljava/lang/Object;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*      */     //   132: dup
/*      */     //   133: aload #12
/*      */     //   135: if_acmpne -> 163
/*      */     //   138: aload #12
/*      */     //   140: areturn
/*      */     //   141: aload #11
/*      */     //   143: getfield L$1 : Ljava/lang/Object;
/*      */     //   146: astore_2
/*      */     //   147: aload #11
/*      */     //   149: getfield L$0 : Ljava/lang/Object;
/*      */     //   152: checkcast androidx/compose/animation/core/SeekableTransitionState
/*      */     //   155: astore_0
/*      */     //   156: aload #10
/*      */     //   158: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */     //   161: aload #10
/*      */     //   163: pop
/*      */     //   164: iconst_0
/*      */     //   165: istore #4
/*      */     //   167: aload #11
/*      */     //   169: aload_0
/*      */     //   170: putfield L$0 : Ljava/lang/Object;
/*      */     //   173: aload #11
/*      */     //   175: aload_2
/*      */     //   176: putfield L$1 : Ljava/lang/Object;
/*      */     //   179: aload #11
/*      */     //   181: iconst_2
/*      */     //   182: putfield label : I
/*      */     //   185: aload #11
/*      */     //   187: checkcast kotlin/coroutines/Continuation
/*      */     //   190: astore #5
/*      */     //   192: iconst_0
/*      */     //   193: istore #6
/*      */     //   195: new kotlinx/coroutines/CancellableContinuationImpl
/*      */     //   198: dup
/*      */     //   199: aload #5
/*      */     //   201: invokestatic intercepted : (Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
/*      */     //   204: iconst_1
/*      */     //   205: invokespecial <init> : (Lkotlin/coroutines/Continuation;I)V
/*      */     //   208: astore #7
/*      */     //   210: aload #7
/*      */     //   212: invokevirtual initCancellability : ()V
/*      */     //   215: aload #7
/*      */     //   217: checkcast kotlinx/coroutines/CancellableContinuation
/*      */     //   220: astore #8
/*      */     //   222: iconst_0
/*      */     //   223: istore #9
/*      */     //   225: aload_0
/*      */     //   226: aload #8
/*      */     //   228: invokevirtual setCompositionContinuation$animation_core : (Lkotlinx/coroutines/CancellableContinuation;)V
/*      */     //   231: aload_0
/*      */     //   232: invokevirtual getCompositionContinuationMutex$animation_core : ()Lkotlinx/coroutines/sync/Mutex;
/*      */     //   235: aconst_null
/*      */     //   236: iconst_1
/*      */     //   237: aconst_null
/*      */     //   238: invokestatic unlock$default : (Lkotlinx/coroutines/sync/Mutex;Ljava/lang/Object;ILjava/lang/Object;)V
/*      */     //   241: nop
/*      */     //   242: nop
/*      */     //   243: aload #7
/*      */     //   245: invokevirtual getResult : ()Ljava/lang/Object;
/*      */     //   248: dup
/*      */     //   249: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*      */     //   252: if_acmpne -> 263
/*      */     //   255: aload #11
/*      */     //   257: checkcast kotlin/coroutines/Continuation
/*      */     //   260: invokestatic probeCoroutineSuspended : (Lkotlin/coroutines/Continuation;)V
/*      */     //   263: dup
/*      */     //   264: aload #12
/*      */     //   266: if_acmpne -> 297
/*      */     //   269: aload #12
/*      */     //   271: areturn
/*      */     //   272: iconst_0
/*      */     //   273: istore #4
/*      */     //   275: aload #11
/*      */     //   277: getfield L$1 : Ljava/lang/Object;
/*      */     //   280: astore_2
/*      */     //   281: aload #11
/*      */     //   283: getfield L$0 : Ljava/lang/Object;
/*      */     //   286: checkcast androidx/compose/animation/core/SeekableTransitionState
/*      */     //   289: astore_0
/*      */     //   290: aload #10
/*      */     //   292: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */     //   295: aload #10
/*      */     //   297: nop
/*      */     //   298: astore_3
/*      */     //   299: aload_3
/*      */     //   300: aload_2
/*      */     //   301: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   304: ifne -> 325
/*      */     //   307: aload_0
/*      */     //   308: ldc2_w -9223372036854775808
/*      */     //   311: putfield lastFrameTimeNanos : J
/*      */     //   314: new java/util/concurrent/CancellationException
/*      */     //   317: dup
/*      */     //   318: ldc_w 'targetState while waiting for composition'
/*      */     //   321: invokespecial <init> : (Ljava/lang/String;)V
/*      */     //   324: athrow
/*      */     //   325: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */     //   328: areturn
/*      */     //   329: new java/lang/IllegalStateException
/*      */     //   332: dup
/*      */     //   333: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*      */     //   336: invokespecial <init> : (Ljava/lang/String;)V
/*      */     //   339: athrow
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #565	-> 60
/*      */     //   #566	-> 97
/*      */     //   #567	-> 102
/*      */     //   #565	-> 138
/*      */     //   #568	-> 163
/*      */     //   #2214	-> 167
/*      */     //   #2215	-> 195
/*      */     //   #2221	-> 210
/*      */     //   #2222	-> 215
/*      */     //   #569	-> 225
/*      */     //   #570	-> 231
/*      */     //   #571	-> 241
/*      */     //   #2222	-> 242
/*      */     //   #2223	-> 243
/*      */     //   #2214	-> 248
/*      */     //   #565	-> 269
/*      */     //   #2224	-> 297
/*      */     //   #568	-> 298
/*      */     //   #572	-> 299
/*      */     //   #573	-> 307
/*      */     //   #574	-> 314
/*      */     //   #576	-> 325
/*      */     //   #565	-> 329
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   97	44	0	this	Landroidx/compose/animation/core/SeekableTransitionState;
/*      */     //   156	86	0	this	Landroidx/compose/animation/core/SeekableTransitionState;
/*      */     //   242	30	0	this	Landroidx/compose/animation/core/SeekableTransitionState;
/*      */     //   290	39	0	this	Landroidx/compose/animation/core/SeekableTransitionState;
/*      */     //   102	39	2	expectedState	Ljava/lang/Object;
/*      */     //   147	95	2	expectedState	Ljava/lang/Object;
/*      */     //   242	30	2	expectedState	Ljava/lang/Object;
/*      */     //   281	48	2	expectedState	Ljava/lang/Object;
/*      */     //   299	30	3	state	Ljava/lang/Object;
/*      */     //   192	56	5	uCont$iv	Lkotlin/coroutines/Continuation;
/*      */     //   210	38	7	cancellable$iv	Lkotlinx/coroutines/CancellableContinuationImpl;
/*      */     //   222	20	8	continuation	Lkotlinx/coroutines/CancellableContinuation;
/*      */     //   225	17	9	$i$a$-suspendCancellableCoroutine-SeekableTransitionState$waitForComposition$state$1	I
/*      */     //   195	53	6	$i$a$-suspendCoroutineUninterceptedOrReturn-CancellableContinuationKt$suspendCancellableCoroutine$2$iv	I
/*      */     //   167	105	4	$i$f$suspendCancellableCoroutine	I
/*      */     //   50	279	11	$continuation	Lkotlin/coroutines/Continuation;
/*      */     //   57	272	10	$result	Ljava/lang/Object;
/*      */     //   275	23	4	$i$f$suspendCancellableCoroutine	I
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final Object animateTo(Object targetState, @Nullable FiniteAnimationSpec<Float> animationSpec, @NotNull Continuation $completion) {
/*      */     Transition<S> transition;
/*      */     if (this.transition == null)
/*      */       return Unit.INSTANCE; 
/*      */     if (MutatorMutex.mutate$default(this.mutatorMutex, null, new SeekableTransitionState$animateTo$2(this, (S)targetState, animationSpec, null), $completion, 1, null) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*      */       return MutatorMutex.mutate$default(this.mutatorMutex, null, new SeekableTransitionState$animateTo$2(this, (S)targetState, animationSpec, null), $completion, 1, null); 
/*      */     MutatorMutex.mutate$default(this.mutatorMutex, null, new SeekableTransitionState$animateTo$2(this, (S)targetState, animationSpec, null), $completion, 1, null);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   @DebugMetadata(f = "Transition.kt", l = {624}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2")
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001\"\004\b\000\020\002H@"}, d2 = {"<anonymous>", "", "S"})
/*      */   static final class SeekableTransitionState$animateTo$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
/*      */     int label;
/*      */     
/*      */     SeekableTransitionState$animateTo$2(SeekableTransitionState<S> $receiver, Object $targetState, FiniteAnimationSpec<Float> $animationSpec, Continuation $completion) {
/*      */       super(1, $completion);
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public final Object invokeSuspend(@NotNull Object $result) {
/*      */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*      */       switch (this.label) {
/*      */         case 0:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           this.label = 1;
/*      */           if (CoroutineScopeKt.coroutineScope(new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$targetState, this.$transition, this.$animationSpec, null) {
/*      */                 Object L$0;
/*      */                 Object L$1;
/*      */                 int label;
/*      */                 
/*      */                 @Nullable
/*      */                 public final Object invokeSuspend(@NotNull Object $result) {
/*      */                   // Byte code:
/*      */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*      */                   //   3: astore #11
/*      */                   //   5: aload_0
/*      */                   //   6: getfield label : I
/*      */                   //   9: tableswitch default -> 845, 0 -> 48, 1 -> 185, 2 -> 302, 3 -> 333, 4 -> 785, 5 -> 827
/*      */                   //   48: aload_1
/*      */                   //   49: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */                   //   52: aload_0
/*      */                   //   53: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   56: invokevirtual getTargetState : ()Ljava/lang/Object;
/*      */                   //   59: astore_2
/*      */                   //   60: aload_0
/*      */                   //   61: getfield $targetState : Ljava/lang/Object;
/*      */                   //   64: aload_2
/*      */                   //   65: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */                   //   68: ifne -> 124
/*      */                   //   71: aload_0
/*      */                   //   72: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   75: invokestatic access$moveAnimationToInitialState : (Landroidx/compose/animation/core/SeekableTransitionState;)V
/*      */                   //   78: aload_0
/*      */                   //   79: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   82: fconst_0
/*      */                   //   83: invokestatic access$setFraction : (Landroidx/compose/animation/core/SeekableTransitionState;F)V
/*      */                   //   86: aload_0
/*      */                   //   87: getfield $transition : Landroidx/compose/animation/core/Transition;
/*      */                   //   90: aload_0
/*      */                   //   91: getfield $targetState : Ljava/lang/Object;
/*      */                   //   94: invokevirtual updateTarget$animation_core : (Ljava/lang/Object;)V
/*      */                   //   97: aload_0
/*      */                   //   98: getfield $transition : Landroidx/compose/animation/core/Transition;
/*      */                   //   101: lconst_0
/*      */                   //   102: invokevirtual setPlayTimeNanos : (J)V
/*      */                   //   105: aload_0
/*      */                   //   106: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   109: aload_2
/*      */                   //   110: invokevirtual setCurrentState$animation_core : (Ljava/lang/Object;)V
/*      */                   //   113: aload_0
/*      */                   //   114: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   117: aload_0
/*      */                   //   118: getfield $targetState : Ljava/lang/Object;
/*      */                   //   121: invokevirtual setTargetState$animation_core : (Ljava/lang/Object;)V
/*      */                   //   124: aload_0
/*      */                   //   125: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   128: invokevirtual getCompositionContinuationMutex$animation_core : ()Lkotlinx/coroutines/sync/Mutex;
/*      */                   //   131: astore #4
/*      */                   //   133: aload_0
/*      */                   //   134: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   137: astore #6
/*      */                   //   139: aconst_null
/*      */                   //   140: astore #5
/*      */                   //   142: iconst_0
/*      */                   //   143: istore #7
/*      */                   //   145: nop
/*      */                   //   146: aload #4
/*      */                   //   148: aload #5
/*      */                   //   150: aload_0
/*      */                   //   151: checkcast kotlin/coroutines/Continuation
/*      */                   //   154: aload_0
/*      */                   //   155: aload #4
/*      */                   //   157: putfield L$0 : Ljava/lang/Object;
/*      */                   //   160: aload_0
/*      */                   //   161: aload #6
/*      */                   //   163: putfield L$1 : Ljava/lang/Object;
/*      */                   //   166: aload_0
/*      */                   //   167: iconst_1
/*      */                   //   168: putfield label : I
/*      */                   //   171: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */                   //   176: dup
/*      */                   //   177: aload #11
/*      */                   //   179: if_acmpne -> 214
/*      */                   //   182: aload #11
/*      */                   //   184: areturn
/*      */                   //   185: iconst_0
/*      */                   //   186: istore #7
/*      */                   //   188: aload_0
/*      */                   //   189: getfield L$1 : Ljava/lang/Object;
/*      */                   //   192: checkcast androidx/compose/animation/core/SeekableTransitionState
/*      */                   //   195: astore #6
/*      */                   //   197: aconst_null
/*      */                   //   198: astore #5
/*      */                   //   200: aload_0
/*      */                   //   201: getfield L$0 : Ljava/lang/Object;
/*      */                   //   204: checkcast kotlinx/coroutines/sync/Mutex
/*      */                   //   207: astore #4
/*      */                   //   209: aload_1
/*      */                   //   210: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */                   //   213: aload_1
/*      */                   //   214: pop
/*      */                   //   215: nop
/*      */                   //   216: iconst_0
/*      */                   //   217: istore #8
/*      */                   //   219: aload #6
/*      */                   //   221: invokevirtual getComposedTargetState$animation_core : ()Ljava/lang/Object;
/*      */                   //   224: astore #9
/*      */                   //   226: aload #4
/*      */                   //   228: aload #5
/*      */                   //   230: invokeinterface unlock : (Ljava/lang/Object;)V
/*      */                   //   235: goto -> 252
/*      */                   //   238: astore #8
/*      */                   //   240: aload #4
/*      */                   //   242: aload #5
/*      */                   //   244: invokeinterface unlock : (Ljava/lang/Object;)V
/*      */                   //   249: aload #8
/*      */                   //   251: athrow
/*      */                   //   252: aload #9
/*      */                   //   254: nop
/*      */                   //   255: astore_3
/*      */                   //   256: aload_0
/*      */                   //   257: getfield $targetState : Ljava/lang/Object;
/*      */                   //   260: aload_3
/*      */                   //   261: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */                   //   264: ifne -> 339
/*      */                   //   267: aload_0
/*      */                   //   268: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   271: aload_0
/*      */                   //   272: checkcast kotlin/coroutines/Continuation
/*      */                   //   275: aload_0
/*      */                   //   276: aconst_null
/*      */                   //   277: putfield L$0 : Ljava/lang/Object;
/*      */                   //   280: aload_0
/*      */                   //   281: aconst_null
/*      */                   //   282: putfield L$1 : Ljava/lang/Object;
/*      */                   //   285: aload_0
/*      */                   //   286: iconst_2
/*      */                   //   287: putfield label : I
/*      */                   //   290: invokestatic access$doOneFrame : (Landroidx/compose/animation/core/SeekableTransitionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */                   //   293: dup
/*      */                   //   294: aload #11
/*      */                   //   296: if_acmpne -> 307
/*      */                   //   299: aload #11
/*      */                   //   301: areturn
/*      */                   //   302: aload_1
/*      */                   //   303: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */                   //   306: aload_1
/*      */                   //   307: pop
/*      */                   //   308: aload_0
/*      */                   //   309: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   312: aload_0
/*      */                   //   313: checkcast kotlin/coroutines/Continuation
/*      */                   //   316: aload_0
/*      */                   //   317: iconst_3
/*      */                   //   318: putfield label : I
/*      */                   //   321: invokestatic access$waitForCompositionAfterTargetStateChange : (Landroidx/compose/animation/core/SeekableTransitionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */                   //   324: dup
/*      */                   //   325: aload #11
/*      */                   //   327: if_acmpne -> 338
/*      */                   //   330: aload #11
/*      */                   //   332: areturn
/*      */                   //   333: aload_1
/*      */                   //   334: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */                   //   337: aload_1
/*      */                   //   338: pop
/*      */                   //   339: aload_0
/*      */                   //   340: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   343: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*      */                   //   346: aload_0
/*      */                   //   347: getfield $targetState : Ljava/lang/Object;
/*      */                   //   350: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */                   //   353: ifne -> 841
/*      */                   //   356: aload_0
/*      */                   //   357: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   360: invokevirtual getFraction : ()F
/*      */                   //   363: fconst_1
/*      */                   //   364: fcmpg
/*      */                   //   365: ifge -> 750
/*      */                   //   368: aload_0
/*      */                   //   369: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   372: invokestatic access$getCurrentAnimation$p : (Landroidx/compose/animation/core/SeekableTransitionState;)Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;
/*      */                   //   375: astore #4
/*      */                   //   377: aload_0
/*      */                   //   378: getfield $animationSpec : Landroidx/compose/animation/core/FiniteAnimationSpec;
/*      */                   //   381: dup
/*      */                   //   382: ifnull -> 399
/*      */                   //   385: getstatic kotlin/jvm/internal/FloatCompanionObject.INSTANCE : Lkotlin/jvm/internal/FloatCompanionObject;
/*      */                   //   388: invokestatic getVectorConverter : (Lkotlin/jvm/internal/FloatCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;
/*      */                   //   391: invokeinterface vectorize : (Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;
/*      */                   //   396: goto -> 401
/*      */                   //   399: pop
/*      */                   //   400: aconst_null
/*      */                   //   401: astore #5
/*      */                   //   403: aload #4
/*      */                   //   405: ifnull -> 421
/*      */                   //   408: aload #5
/*      */                   //   410: aload #4
/*      */                   //   412: invokevirtual getAnimationSpec : ()Landroidx/compose/animation/core/VectorizedAnimationSpec;
/*      */                   //   415: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */                   //   418: ifne -> 750
/*      */                   //   421: aload #4
/*      */                   //   423: dup
/*      */                   //   424: ifnull -> 433
/*      */                   //   427: invokevirtual getAnimationSpec : ()Landroidx/compose/animation/core/VectorizedAnimationSpec;
/*      */                   //   430: goto -> 435
/*      */                   //   433: pop
/*      */                   //   434: aconst_null
/*      */                   //   435: astore #6
/*      */                   //   437: aconst_null
/*      */                   //   438: astore #7
/*      */                   //   440: aload #6
/*      */                   //   442: ifnull -> 501
/*      */                   //   445: aload #6
/*      */                   //   447: aload #4
/*      */                   //   449: invokevirtual getProgressNanos : ()J
/*      */                   //   452: aload #4
/*      */                   //   454: invokevirtual getStart : ()Landroidx/compose/animation/core/AnimationVector1D;
/*      */                   //   457: checkcast androidx/compose/animation/core/AnimationVector
/*      */                   //   460: invokestatic access$getCompanion$p : ()Landroidx/compose/animation/core/SeekableTransitionState$Companion;
/*      */                   //   463: invokevirtual getTarget1 : ()Landroidx/compose/animation/core/AnimationVector1D;
/*      */                   //   466: checkcast androidx/compose/animation/core/AnimationVector
/*      */                   //   469: aload #4
/*      */                   //   471: invokevirtual getInitialVelocity : ()Landroidx/compose/animation/core/AnimationVector1D;
/*      */                   //   474: dup
/*      */                   //   475: ifnonnull -> 485
/*      */                   //   478: pop
/*      */                   //   479: invokestatic access$getCompanion$p : ()Landroidx/compose/animation/core/SeekableTransitionState$Companion;
/*      */                   //   482: invokevirtual getZeroVelocity : ()Landroidx/compose/animation/core/AnimationVector1D;
/*      */                   //   485: checkcast androidx/compose/animation/core/AnimationVector
/*      */                   //   488: invokeinterface getVelocityFromNanos : (JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;
/*      */                   //   493: checkcast androidx/compose/animation/core/AnimationVector1D
/*      */                   //   496: astore #7
/*      */                   //   498: goto -> 592
/*      */                   //   501: aload #4
/*      */                   //   503: ifnull -> 516
/*      */                   //   506: aload #4
/*      */                   //   508: invokevirtual getProgressNanos : ()J
/*      */                   //   511: lconst_0
/*      */                   //   512: lcmp
/*      */                   //   513: ifne -> 527
/*      */                   //   516: invokestatic access$getCompanion$p : ()Landroidx/compose/animation/core/SeekableTransitionState$Companion;
/*      */                   //   519: invokevirtual getZeroVelocity : ()Landroidx/compose/animation/core/AnimationVector1D;
/*      */                   //   522: astore #7
/*      */                   //   524: goto -> 592
/*      */                   //   527: aload #4
/*      */                   //   529: invokevirtual getDurationNanos : ()J
/*      */                   //   532: lstore #8
/*      */                   //   534: lload #8
/*      */                   //   536: ldc2_w -9223372036854775808
/*      */                   //   539: lcmp
/*      */                   //   540: ifne -> 553
/*      */                   //   543: aload_0
/*      */                   //   544: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   547: invokevirtual getTotalDurationNanos$animation_core : ()J
/*      */                   //   550: goto -> 555
/*      */                   //   553: lload #8
/*      */                   //   555: l2f
/*      */                   //   556: ldc 1.0E9
/*      */                   //   558: fdiv
/*      */                   //   559: fstore #10
/*      */                   //   561: fload #10
/*      */                   //   563: fconst_0
/*      */                   //   564: fcmpg
/*      */                   //   565: ifgt -> 579
/*      */                   //   568: invokestatic access$getCompanion$p : ()Landroidx/compose/animation/core/SeekableTransitionState$Companion;
/*      */                   //   571: invokevirtual getZeroVelocity : ()Landroidx/compose/animation/core/AnimationVector1D;
/*      */                   //   574: astore #7
/*      */                   //   576: goto -> 592
/*      */                   //   579: new androidx/compose/animation/core/AnimationVector1D
/*      */                   //   582: dup
/*      */                   //   583: fconst_1
/*      */                   //   584: fload #10
/*      */                   //   586: fdiv
/*      */                   //   587: invokespecial <init> : (F)V
/*      */                   //   590: astore #7
/*      */                   //   592: aload #4
/*      */                   //   594: dup
/*      */                   //   595: ifnonnull -> 606
/*      */                   //   598: pop
/*      */                   //   599: new androidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState
/*      */                   //   602: dup
/*      */                   //   603: invokespecial <init> : ()V
/*      */                   //   606: astore #8
/*      */                   //   608: aload #8
/*      */                   //   610: aload #5
/*      */                   //   612: checkcast androidx/compose/animation/core/VectorizedAnimationSpec
/*      */                   //   615: invokevirtual setAnimationSpec : (Landroidx/compose/animation/core/VectorizedAnimationSpec;)V
/*      */                   //   618: aload #8
/*      */                   //   620: iconst_0
/*      */                   //   621: invokevirtual setComplete : (Z)V
/*      */                   //   624: aload #8
/*      */                   //   626: aload_0
/*      */                   //   627: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   630: invokevirtual getFraction : ()F
/*      */                   //   633: invokevirtual setValue : (F)V
/*      */                   //   636: aload #8
/*      */                   //   638: invokevirtual getStart : ()Landroidx/compose/animation/core/AnimationVector1D;
/*      */                   //   641: iconst_0
/*      */                   //   642: aload_0
/*      */                   //   643: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   646: invokevirtual getFraction : ()F
/*      */                   //   649: invokevirtual set$animation_core : (IF)V
/*      */                   //   652: aload #8
/*      */                   //   654: aload_0
/*      */                   //   655: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   658: invokevirtual getTotalDurationNanos$animation_core : ()J
/*      */                   //   661: invokevirtual setDurationNanos : (J)V
/*      */                   //   664: aload #8
/*      */                   //   666: lconst_0
/*      */                   //   667: invokevirtual setProgressNanos : (J)V
/*      */                   //   670: aload #8
/*      */                   //   672: aload #7
/*      */                   //   674: invokevirtual setInitialVelocity : (Landroidx/compose/animation/core/AnimationVector1D;)V
/*      */                   //   677: aload #8
/*      */                   //   679: aload #5
/*      */                   //   681: dup
/*      */                   //   682: ifnull -> 715
/*      */                   //   685: aload #8
/*      */                   //   687: invokevirtual getStart : ()Landroidx/compose/animation/core/AnimationVector1D;
/*      */                   //   690: checkcast androidx/compose/animation/core/AnimationVector
/*      */                   //   693: invokestatic access$getCompanion$p : ()Landroidx/compose/animation/core/SeekableTransitionState$Companion;
/*      */                   //   696: invokevirtual getTarget1 : ()Landroidx/compose/animation/core/AnimationVector1D;
/*      */                   //   699: checkcast androidx/compose/animation/core/AnimationVector
/*      */                   //   702: aload #7
/*      */                   //   704: checkcast androidx/compose/animation/core/AnimationVector
/*      */                   //   707: invokeinterface getDurationNanos : (Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J
/*      */                   //   712: goto -> 738
/*      */                   //   715: pop
/*      */                   //   716: aload_0
/*      */                   //   717: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   720: invokevirtual getTotalDurationNanos$animation_core : ()J
/*      */                   //   723: l2d
/*      */                   //   724: dconst_1
/*      */                   //   725: aload_0
/*      */                   //   726: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   729: invokevirtual getFraction : ()F
/*      */                   //   732: f2d
/*      */                   //   733: dsub
/*      */                   //   734: dmul
/*      */                   //   735: invokestatic roundToLong : (D)J
/*      */                   //   738: invokevirtual setAnimationSpecDuration : (J)V
/*      */                   //   741: aload_0
/*      */                   //   742: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   745: aload #8
/*      */                   //   747: invokestatic access$setCurrentAnimation$p : (Landroidx/compose/animation/core/SeekableTransitionState;Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;)V
/*      */                   //   750: aload_0
/*      */                   //   751: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   754: aload_0
/*      */                   //   755: checkcast kotlin/coroutines/Continuation
/*      */                   //   758: aload_0
/*      */                   //   759: aconst_null
/*      */                   //   760: putfield L$0 : Ljava/lang/Object;
/*      */                   //   763: aload_0
/*      */                   //   764: aconst_null
/*      */                   //   765: putfield L$1 : Ljava/lang/Object;
/*      */                   //   768: aload_0
/*      */                   //   769: iconst_4
/*      */                   //   770: putfield label : I
/*      */                   //   773: invokestatic access$runAnimations : (Landroidx/compose/animation/core/SeekableTransitionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */                   //   776: dup
/*      */                   //   777: aload #11
/*      */                   //   779: if_acmpne -> 790
/*      */                   //   782: aload #11
/*      */                   //   784: areturn
/*      */                   //   785: aload_1
/*      */                   //   786: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */                   //   789: aload_1
/*      */                   //   790: pop
/*      */                   //   791: aload_0
/*      */                   //   792: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   795: aload_0
/*      */                   //   796: getfield $targetState : Ljava/lang/Object;
/*      */                   //   799: invokevirtual setCurrentState$animation_core : (Ljava/lang/Object;)V
/*      */                   //   802: aload_0
/*      */                   //   803: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   806: aload_0
/*      */                   //   807: checkcast kotlin/coroutines/Continuation
/*      */                   //   810: aload_0
/*      */                   //   811: iconst_5
/*      */                   //   812: putfield label : I
/*      */                   //   815: invokestatic access$waitForComposition : (Landroidx/compose/animation/core/SeekableTransitionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */                   //   818: dup
/*      */                   //   819: aload #11
/*      */                   //   821: if_acmpne -> 832
/*      */                   //   824: aload #11
/*      */                   //   826: areturn
/*      */                   //   827: aload_1
/*      */                   //   828: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */                   //   831: aload_1
/*      */                   //   832: pop
/*      */                   //   833: aload_0
/*      */                   //   834: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   837: fconst_0
/*      */                   //   838: invokestatic access$setFraction : (Landroidx/compose/animation/core/SeekableTransitionState;F)V
/*      */                   //   841: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */                   //   844: areturn
/*      */                   //   845: new java/lang/IllegalStateException
/*      */                   //   848: dup
/*      */                   //   849: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*      */                   //   852: invokespecial <init> : (Ljava/lang/String;)V
/*      */                   //   855: athrow
/*      */                   // Line number table:
/*      */                   //   Java source line number -> byte code offset
/*      */                   //   #624	-> 3
/*      */                   //   #625	-> 52
/*      */                   //   #626	-> 60
/*      */                   //   #627	-> 71
/*      */                   //   #628	-> 78
/*      */                   //   #629	-> 86
/*      */                   //   #630	-> 97
/*      */                   //   #631	-> 105
/*      */                   //   #632	-> 113
/*      */                   //   #635	-> 124
/*      */                   //   #2187	-> 139
/*      */                   //   #2188	-> 145
/*      */                   //   #2191	-> 146
/*      */                   //   #624	-> 182
/*      */                   //   #2192	-> 214
/*      */                   //   #2193	-> 216
/*      */                   //   #635	-> 219
/*      */                   //   #2193	-> 224
/*      */                   //   #2195	-> 226
/*      */                   //   #2196	-> 235
/*      */                   //   #2195	-> 238
/*      */                   //   #2192	-> 254
/*      */                   //   #635	-> 255
/*      */                   //   #634	-> 255
/*      */                   //   #636	-> 256
/*      */                   //   #637	-> 267
/*      */                   //   #624	-> 299
/*      */                   //   #639	-> 307
/*      */                   //   #624	-> 330
/*      */                   //   #641	-> 338
/*      */                   //   #642	-> 356
/*      */                   //   #643	-> 368
/*      */                   //   #644	-> 377
/*      */                   //   #645	-> 403
/*      */                   //   #647	-> 421
/*      */                   //   #648	-> 437
/*      */                   //   #649	-> 440
/*      */                   //   #650	-> 445
/*      */                   //   #651	-> 447
/*      */                   //   #652	-> 452
/*      */                   //   #653	-> 460
/*      */                   //   #655	-> 469
/*      */                   //   #650	-> 488
/*      */                   //   #657	-> 501
/*      */                   //   #658	-> 506
/*      */                   //   #660	-> 516
/*      */                   //   #662	-> 527
/*      */                   //   #664	-> 534
/*      */                   //   #665	-> 543
/*      */                   //   #667	-> 553
/*      */                   //   #668	-> 556
/*      */                   //   #664	-> 558
/*      */                   //   #663	-> 559
/*      */                   //   #669	-> 561
/*      */                   //   #670	-> 568
/*      */                   //   #672	-> 579
/*      */                   //   #675	-> 592
/*      */                   //   #676	-> 608
/*      */                   //   #677	-> 618
/*      */                   //   #678	-> 624
/*      */                   //   #679	-> 636
/*      */                   //   #680	-> 652
/*      */                   //   #681	-> 664
/*      */                   //   #682	-> 670
/*      */                   //   #683	-> 677
/*      */                   //   #684	-> 685
/*      */                   //   #685	-> 693
/*      */                   //   #686	-> 702
/*      */                   //   #683	-> 707
/*      */                   //   #687	-> 716
/*      */                   //   #683	-> 738
/*      */                   //   #688	-> 741
/*      */                   //   #691	-> 750
/*      */                   //   #624	-> 782
/*      */                   //   #692	-> 790
/*      */                   //   #693	-> 802
/*      */                   //   #624	-> 824
/*      */                   //   #694	-> 832
/*      */                   //   #696	-> 841
/*      */                   //   #624	-> 845
/*      */                   // Local variable table:
/*      */                   //   start	length	slot	name	descriptor
/*      */                   //   60	53	2	oldTargetState	Ljava/lang/Object;
/*      */                   //   256	11	3	composedTargetState	Ljava/lang/Object;
/*      */                   //   139	46	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*      */                   //   209	15	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*      */                   //   224	11	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*      */                   //   238	17	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*      */                   //   377	221	4	runningAnimation	Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;
/*      */                   //   142	43	5	owner$iv	Ljava/lang/Object;
/*      */                   //   209	15	5	owner$iv	Ljava/lang/Object;
/*      */                   //   224	11	5	owner$iv	Ljava/lang/Object;
/*      */                   //   238	17	5	owner$iv	Ljava/lang/Object;
/*      */                   //   403	282	5	newSpec	Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;
/*      */                   //   437	10	6	oldSpec	Landroidx/compose/animation/core/VectorizedAnimationSpec;
/*      */                   //   592	115	7	oldVelocity	Landroidx/compose/animation/core/AnimationVector1D;
/*      */                   //   534	9	8	oldDurationNanos	J
/*      */                   //   553	2	8	oldDurationNanos	J
/*      */                   //   608	142	8	newAnimation	Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;
/*      */                   //   561	7	10	oldDuration	F
/*      */                   //   579	13	10	oldDuration	F
/*      */                   //   219	5	8	$i$a$-withLock$default-SeekableTransitionState$animateTo$2$1$composedTargetState$1	I
/*      */                   //   145	40	7	$i$f$withLock	I
/*      */                   //   52	793	0	this	Landroidx/compose/animation/core/SeekableTransitionState$animateTo$2$1;
/*      */                   //   52	793	1	$result	Ljava/lang/Object;
/*      */                   //   188	67	7	$i$f$withLock	I
/*      */                   // Exception table:
/*      */                   //   from	to	target	type
/*      */                   //   215	226	238	finally
/*      */                   //   238	240	238	finally
/*      */                 }
/*      */                 
/*      */                 @NotNull
/*      */                 public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*      */                   return (Continuation)new Function2<>(SeekableTransitionState.this, this.$targetState, this.$transition, this.$animationSpec, $completion);
/*      */                 }
/*      */                 
/*      */                 @Nullable
/*      */                 public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*      */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */                 }
/*      */               }(Continuation)this) == object)
/*      */             return object; 
/*      */           CoroutineScopeKt.coroutineScope(new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$targetState, this.$transition, this.$animationSpec, null) {
/*      */                 Object L$0;
/*      */                 Object L$1;
/*      */                 int label;
/*      */                 
/*      */                 @Nullable
/*      */                 public final Object invokeSuspend(@NotNull Object $result) {
/*      */                   // Byte code:
/*      */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*      */                   //   3: astore #11
/*      */                   //   5: aload_0
/*      */                   //   6: getfield label : I
/*      */                   //   9: tableswitch default -> 845, 0 -> 48, 1 -> 185, 2 -> 302, 3 -> 333, 4 -> 785, 5 -> 827
/*      */                   //   48: aload_1
/*      */                   //   49: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */                   //   52: aload_0
/*      */                   //   53: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   56: invokevirtual getTargetState : ()Ljava/lang/Object;
/*      */                   //   59: astore_2
/*      */                   //   60: aload_0
/*      */                   //   61: getfield $targetState : Ljava/lang/Object;
/*      */                   //   64: aload_2
/*      */                   //   65: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */                   //   68: ifne -> 124
/*      */                   //   71: aload_0
/*      */                   //   72: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   75: invokestatic access$moveAnimationToInitialState : (Landroidx/compose/animation/core/SeekableTransitionState;)V
/*      */                   //   78: aload_0
/*      */                   //   79: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   82: fconst_0
/*      */                   //   83: invokestatic access$setFraction : (Landroidx/compose/animation/core/SeekableTransitionState;F)V
/*      */                   //   86: aload_0
/*      */                   //   87: getfield $transition : Landroidx/compose/animation/core/Transition;
/*      */                   //   90: aload_0
/*      */                   //   91: getfield $targetState : Ljava/lang/Object;
/*      */                   //   94: invokevirtual updateTarget$animation_core : (Ljava/lang/Object;)V
/*      */                   //   97: aload_0
/*      */                   //   98: getfield $transition : Landroidx/compose/animation/core/Transition;
/*      */                   //   101: lconst_0
/*      */                   //   102: invokevirtual setPlayTimeNanos : (J)V
/*      */                   //   105: aload_0
/*      */                   //   106: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   109: aload_2
/*      */                   //   110: invokevirtual setCurrentState$animation_core : (Ljava/lang/Object;)V
/*      */                   //   113: aload_0
/*      */                   //   114: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   117: aload_0
/*      */                   //   118: getfield $targetState : Ljava/lang/Object;
/*      */                   //   121: invokevirtual setTargetState$animation_core : (Ljava/lang/Object;)V
/*      */                   //   124: aload_0
/*      */                   //   125: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   128: invokevirtual getCompositionContinuationMutex$animation_core : ()Lkotlinx/coroutines/sync/Mutex;
/*      */                   //   131: astore #4
/*      */                   //   133: aload_0
/*      */                   //   134: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   137: astore #6
/*      */                   //   139: aconst_null
/*      */                   //   140: astore #5
/*      */                   //   142: iconst_0
/*      */                   //   143: istore #7
/*      */                   //   145: nop
/*      */                   //   146: aload #4
/*      */                   //   148: aload #5
/*      */                   //   150: aload_0
/*      */                   //   151: checkcast kotlin/coroutines/Continuation
/*      */                   //   154: aload_0
/*      */                   //   155: aload #4
/*      */                   //   157: putfield L$0 : Ljava/lang/Object;
/*      */                   //   160: aload_0
/*      */                   //   161: aload #6
/*      */                   //   163: putfield L$1 : Ljava/lang/Object;
/*      */                   //   166: aload_0
/*      */                   //   167: iconst_1
/*      */                   //   168: putfield label : I
/*      */                   //   171: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */                   //   176: dup
/*      */                   //   177: aload #11
/*      */                   //   179: if_acmpne -> 214
/*      */                   //   182: aload #11
/*      */                   //   184: areturn
/*      */                   //   185: iconst_0
/*      */                   //   186: istore #7
/*      */                   //   188: aload_0
/*      */                   //   189: getfield L$1 : Ljava/lang/Object;
/*      */                   //   192: checkcast androidx/compose/animation/core/SeekableTransitionState
/*      */                   //   195: astore #6
/*      */                   //   197: aconst_null
/*      */                   //   198: astore #5
/*      */                   //   200: aload_0
/*      */                   //   201: getfield L$0 : Ljava/lang/Object;
/*      */                   //   204: checkcast kotlinx/coroutines/sync/Mutex
/*      */                   //   207: astore #4
/*      */                   //   209: aload_1
/*      */                   //   210: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */                   //   213: aload_1
/*      */                   //   214: pop
/*      */                   //   215: nop
/*      */                   //   216: iconst_0
/*      */                   //   217: istore #8
/*      */                   //   219: aload #6
/*      */                   //   221: invokevirtual getComposedTargetState$animation_core : ()Ljava/lang/Object;
/*      */                   //   224: astore #9
/*      */                   //   226: aload #4
/*      */                   //   228: aload #5
/*      */                   //   230: invokeinterface unlock : (Ljava/lang/Object;)V
/*      */                   //   235: goto -> 252
/*      */                   //   238: astore #8
/*      */                   //   240: aload #4
/*      */                   //   242: aload #5
/*      */                   //   244: invokeinterface unlock : (Ljava/lang/Object;)V
/*      */                   //   249: aload #8
/*      */                   //   251: athrow
/*      */                   //   252: aload #9
/*      */                   //   254: nop
/*      */                   //   255: astore_3
/*      */                   //   256: aload_0
/*      */                   //   257: getfield $targetState : Ljava/lang/Object;
/*      */                   //   260: aload_3
/*      */                   //   261: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */                   //   264: ifne -> 339
/*      */                   //   267: aload_0
/*      */                   //   268: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   271: aload_0
/*      */                   //   272: checkcast kotlin/coroutines/Continuation
/*      */                   //   275: aload_0
/*      */                   //   276: aconst_null
/*      */                   //   277: putfield L$0 : Ljava/lang/Object;
/*      */                   //   280: aload_0
/*      */                   //   281: aconst_null
/*      */                   //   282: putfield L$1 : Ljava/lang/Object;
/*      */                   //   285: aload_0
/*      */                   //   286: iconst_2
/*      */                   //   287: putfield label : I
/*      */                   //   290: invokestatic access$doOneFrame : (Landroidx/compose/animation/core/SeekableTransitionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */                   //   293: dup
/*      */                   //   294: aload #11
/*      */                   //   296: if_acmpne -> 307
/*      */                   //   299: aload #11
/*      */                   //   301: areturn
/*      */                   //   302: aload_1
/*      */                   //   303: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */                   //   306: aload_1
/*      */                   //   307: pop
/*      */                   //   308: aload_0
/*      */                   //   309: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   312: aload_0
/*      */                   //   313: checkcast kotlin/coroutines/Continuation
/*      */                   //   316: aload_0
/*      */                   //   317: iconst_3
/*      */                   //   318: putfield label : I
/*      */                   //   321: invokestatic access$waitForCompositionAfterTargetStateChange : (Landroidx/compose/animation/core/SeekableTransitionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */                   //   324: dup
/*      */                   //   325: aload #11
/*      */                   //   327: if_acmpne -> 338
/*      */                   //   330: aload #11
/*      */                   //   332: areturn
/*      */                   //   333: aload_1
/*      */                   //   334: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */                   //   337: aload_1
/*      */                   //   338: pop
/*      */                   //   339: aload_0
/*      */                   //   340: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   343: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*      */                   //   346: aload_0
/*      */                   //   347: getfield $targetState : Ljava/lang/Object;
/*      */                   //   350: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */                   //   353: ifne -> 841
/*      */                   //   356: aload_0
/*      */                   //   357: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   360: invokevirtual getFraction : ()F
/*      */                   //   363: fconst_1
/*      */                   //   364: fcmpg
/*      */                   //   365: ifge -> 750
/*      */                   //   368: aload_0
/*      */                   //   369: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   372: invokestatic access$getCurrentAnimation$p : (Landroidx/compose/animation/core/SeekableTransitionState;)Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;
/*      */                   //   375: astore #4
/*      */                   //   377: aload_0
/*      */                   //   378: getfield $animationSpec : Landroidx/compose/animation/core/FiniteAnimationSpec;
/*      */                   //   381: dup
/*      */                   //   382: ifnull -> 399
/*      */                   //   385: getstatic kotlin/jvm/internal/FloatCompanionObject.INSTANCE : Lkotlin/jvm/internal/FloatCompanionObject;
/*      */                   //   388: invokestatic getVectorConverter : (Lkotlin/jvm/internal/FloatCompanionObject;)Landroidx/compose/animation/core/TwoWayConverter;
/*      */                   //   391: invokeinterface vectorize : (Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;
/*      */                   //   396: goto -> 401
/*      */                   //   399: pop
/*      */                   //   400: aconst_null
/*      */                   //   401: astore #5
/*      */                   //   403: aload #4
/*      */                   //   405: ifnull -> 421
/*      */                   //   408: aload #5
/*      */                   //   410: aload #4
/*      */                   //   412: invokevirtual getAnimationSpec : ()Landroidx/compose/animation/core/VectorizedAnimationSpec;
/*      */                   //   415: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */                   //   418: ifne -> 750
/*      */                   //   421: aload #4
/*      */                   //   423: dup
/*      */                   //   424: ifnull -> 433
/*      */                   //   427: invokevirtual getAnimationSpec : ()Landroidx/compose/animation/core/VectorizedAnimationSpec;
/*      */                   //   430: goto -> 435
/*      */                   //   433: pop
/*      */                   //   434: aconst_null
/*      */                   //   435: astore #6
/*      */                   //   437: aconst_null
/*      */                   //   438: astore #7
/*      */                   //   440: aload #6
/*      */                   //   442: ifnull -> 501
/*      */                   //   445: aload #6
/*      */                   //   447: aload #4
/*      */                   //   449: invokevirtual getProgressNanos : ()J
/*      */                   //   452: aload #4
/*      */                   //   454: invokevirtual getStart : ()Landroidx/compose/animation/core/AnimationVector1D;
/*      */                   //   457: checkcast androidx/compose/animation/core/AnimationVector
/*      */                   //   460: invokestatic access$getCompanion$p : ()Landroidx/compose/animation/core/SeekableTransitionState$Companion;
/*      */                   //   463: invokevirtual getTarget1 : ()Landroidx/compose/animation/core/AnimationVector1D;
/*      */                   //   466: checkcast androidx/compose/animation/core/AnimationVector
/*      */                   //   469: aload #4
/*      */                   //   471: invokevirtual getInitialVelocity : ()Landroidx/compose/animation/core/AnimationVector1D;
/*      */                   //   474: dup
/*      */                   //   475: ifnonnull -> 485
/*      */                   //   478: pop
/*      */                   //   479: invokestatic access$getCompanion$p : ()Landroidx/compose/animation/core/SeekableTransitionState$Companion;
/*      */                   //   482: invokevirtual getZeroVelocity : ()Landroidx/compose/animation/core/AnimationVector1D;
/*      */                   //   485: checkcast androidx/compose/animation/core/AnimationVector
/*      */                   //   488: invokeinterface getVelocityFromNanos : (JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;
/*      */                   //   493: checkcast androidx/compose/animation/core/AnimationVector1D
/*      */                   //   496: astore #7
/*      */                   //   498: goto -> 592
/*      */                   //   501: aload #4
/*      */                   //   503: ifnull -> 516
/*      */                   //   506: aload #4
/*      */                   //   508: invokevirtual getProgressNanos : ()J
/*      */                   //   511: lconst_0
/*      */                   //   512: lcmp
/*      */                   //   513: ifne -> 527
/*      */                   //   516: invokestatic access$getCompanion$p : ()Landroidx/compose/animation/core/SeekableTransitionState$Companion;
/*      */                   //   519: invokevirtual getZeroVelocity : ()Landroidx/compose/animation/core/AnimationVector1D;
/*      */                   //   522: astore #7
/*      */                   //   524: goto -> 592
/*      */                   //   527: aload #4
/*      */                   //   529: invokevirtual getDurationNanos : ()J
/*      */                   //   532: lstore #8
/*      */                   //   534: lload #8
/*      */                   //   536: ldc2_w -9223372036854775808
/*      */                   //   539: lcmp
/*      */                   //   540: ifne -> 553
/*      */                   //   543: aload_0
/*      */                   //   544: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   547: invokevirtual getTotalDurationNanos$animation_core : ()J
/*      */                   //   550: goto -> 555
/*      */                   //   553: lload #8
/*      */                   //   555: l2f
/*      */                   //   556: ldc 1.0E9
/*      */                   //   558: fdiv
/*      */                   //   559: fstore #10
/*      */                   //   561: fload #10
/*      */                   //   563: fconst_0
/*      */                   //   564: fcmpg
/*      */                   //   565: ifgt -> 579
/*      */                   //   568: invokestatic access$getCompanion$p : ()Landroidx/compose/animation/core/SeekableTransitionState$Companion;
/*      */                   //   571: invokevirtual getZeroVelocity : ()Landroidx/compose/animation/core/AnimationVector1D;
/*      */                   //   574: astore #7
/*      */                   //   576: goto -> 592
/*      */                   //   579: new androidx/compose/animation/core/AnimationVector1D
/*      */                   //   582: dup
/*      */                   //   583: fconst_1
/*      */                   //   584: fload #10
/*      */                   //   586: fdiv
/*      */                   //   587: invokespecial <init> : (F)V
/*      */                   //   590: astore #7
/*      */                   //   592: aload #4
/*      */                   //   594: dup
/*      */                   //   595: ifnonnull -> 606
/*      */                   //   598: pop
/*      */                   //   599: new androidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState
/*      */                   //   602: dup
/*      */                   //   603: invokespecial <init> : ()V
/*      */                   //   606: astore #8
/*      */                   //   608: aload #8
/*      */                   //   610: aload #5
/*      */                   //   612: checkcast androidx/compose/animation/core/VectorizedAnimationSpec
/*      */                   //   615: invokevirtual setAnimationSpec : (Landroidx/compose/animation/core/VectorizedAnimationSpec;)V
/*      */                   //   618: aload #8
/*      */                   //   620: iconst_0
/*      */                   //   621: invokevirtual setComplete : (Z)V
/*      */                   //   624: aload #8
/*      */                   //   626: aload_0
/*      */                   //   627: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   630: invokevirtual getFraction : ()F
/*      */                   //   633: invokevirtual setValue : (F)V
/*      */                   //   636: aload #8
/*      */                   //   638: invokevirtual getStart : ()Landroidx/compose/animation/core/AnimationVector1D;
/*      */                   //   641: iconst_0
/*      */                   //   642: aload_0
/*      */                   //   643: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   646: invokevirtual getFraction : ()F
/*      */                   //   649: invokevirtual set$animation_core : (IF)V
/*      */                   //   652: aload #8
/*      */                   //   654: aload_0
/*      */                   //   655: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   658: invokevirtual getTotalDurationNanos$animation_core : ()J
/*      */                   //   661: invokevirtual setDurationNanos : (J)V
/*      */                   //   664: aload #8
/*      */                   //   666: lconst_0
/*      */                   //   667: invokevirtual setProgressNanos : (J)V
/*      */                   //   670: aload #8
/*      */                   //   672: aload #7
/*      */                   //   674: invokevirtual setInitialVelocity : (Landroidx/compose/animation/core/AnimationVector1D;)V
/*      */                   //   677: aload #8
/*      */                   //   679: aload #5
/*      */                   //   681: dup
/*      */                   //   682: ifnull -> 715
/*      */                   //   685: aload #8
/*      */                   //   687: invokevirtual getStart : ()Landroidx/compose/animation/core/AnimationVector1D;
/*      */                   //   690: checkcast androidx/compose/animation/core/AnimationVector
/*      */                   //   693: invokestatic access$getCompanion$p : ()Landroidx/compose/animation/core/SeekableTransitionState$Companion;
/*      */                   //   696: invokevirtual getTarget1 : ()Landroidx/compose/animation/core/AnimationVector1D;
/*      */                   //   699: checkcast androidx/compose/animation/core/AnimationVector
/*      */                   //   702: aload #7
/*      */                   //   704: checkcast androidx/compose/animation/core/AnimationVector
/*      */                   //   707: invokeinterface getDurationNanos : (Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J
/*      */                   //   712: goto -> 738
/*      */                   //   715: pop
/*      */                   //   716: aload_0
/*      */                   //   717: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   720: invokevirtual getTotalDurationNanos$animation_core : ()J
/*      */                   //   723: l2d
/*      */                   //   724: dconst_1
/*      */                   //   725: aload_0
/*      */                   //   726: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   729: invokevirtual getFraction : ()F
/*      */                   //   732: f2d
/*      */                   //   733: dsub
/*      */                   //   734: dmul
/*      */                   //   735: invokestatic roundToLong : (D)J
/*      */                   //   738: invokevirtual setAnimationSpecDuration : (J)V
/*      */                   //   741: aload_0
/*      */                   //   742: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   745: aload #8
/*      */                   //   747: invokestatic access$setCurrentAnimation$p : (Landroidx/compose/animation/core/SeekableTransitionState;Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;)V
/*      */                   //   750: aload_0
/*      */                   //   751: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   754: aload_0
/*      */                   //   755: checkcast kotlin/coroutines/Continuation
/*      */                   //   758: aload_0
/*      */                   //   759: aconst_null
/*      */                   //   760: putfield L$0 : Ljava/lang/Object;
/*      */                   //   763: aload_0
/*      */                   //   764: aconst_null
/*      */                   //   765: putfield L$1 : Ljava/lang/Object;
/*      */                   //   768: aload_0
/*      */                   //   769: iconst_4
/*      */                   //   770: putfield label : I
/*      */                   //   773: invokestatic access$runAnimations : (Landroidx/compose/animation/core/SeekableTransitionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */                   //   776: dup
/*      */                   //   777: aload #11
/*      */                   //   779: if_acmpne -> 790
/*      */                   //   782: aload #11
/*      */                   //   784: areturn
/*      */                   //   785: aload_1
/*      */                   //   786: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */                   //   789: aload_1
/*      */                   //   790: pop
/*      */                   //   791: aload_0
/*      */                   //   792: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   795: aload_0
/*      */                   //   796: getfield $targetState : Ljava/lang/Object;
/*      */                   //   799: invokevirtual setCurrentState$animation_core : (Ljava/lang/Object;)V
/*      */                   //   802: aload_0
/*      */                   //   803: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   806: aload_0
/*      */                   //   807: checkcast kotlin/coroutines/Continuation
/*      */                   //   810: aload_0
/*      */                   //   811: iconst_5
/*      */                   //   812: putfield label : I
/*      */                   //   815: invokestatic access$waitForComposition : (Landroidx/compose/animation/core/SeekableTransitionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */                   //   818: dup
/*      */                   //   819: aload #11
/*      */                   //   821: if_acmpne -> 832
/*      */                   //   824: aload #11
/*      */                   //   826: areturn
/*      */                   //   827: aload_1
/*      */                   //   828: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */                   //   831: aload_1
/*      */                   //   832: pop
/*      */                   //   833: aload_0
/*      */                   //   834: getfield this$0 : Landroidx/compose/animation/core/SeekableTransitionState;
/*      */                   //   837: fconst_0
/*      */                   //   838: invokestatic access$setFraction : (Landroidx/compose/animation/core/SeekableTransitionState;F)V
/*      */                   //   841: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */                   //   844: areturn
/*      */                   //   845: new java/lang/IllegalStateException
/*      */                   //   848: dup
/*      */                   //   849: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*      */                   //   852: invokespecial <init> : (Ljava/lang/String;)V
/*      */                   //   855: athrow
/*      */                   // Line number table:
/*      */                   //   Java source line number -> byte code offset
/*      */                   //   #624	-> 3
/*      */                   //   #625	-> 52
/*      */                   //   #626	-> 60
/*      */                   //   #627	-> 71
/*      */                   //   #628	-> 78
/*      */                   //   #629	-> 86
/*      */                   //   #630	-> 97
/*      */                   //   #631	-> 105
/*      */                   //   #632	-> 113
/*      */                   //   #635	-> 124
/*      */                   //   #2187	-> 139
/*      */                   //   #2188	-> 145
/*      */                   //   #2191	-> 146
/*      */                   //   #624	-> 182
/*      */                   //   #2192	-> 214
/*      */                   //   #2193	-> 216
/*      */                   //   #635	-> 219
/*      */                   //   #2193	-> 224
/*      */                   //   #2195	-> 226
/*      */                   //   #2196	-> 235
/*      */                   //   #2195	-> 238
/*      */                   //   #2192	-> 254
/*      */                   //   #635	-> 255
/*      */                   //   #634	-> 255
/*      */                   //   #636	-> 256
/*      */                   //   #637	-> 267
/*      */                   //   #624	-> 299
/*      */                   //   #639	-> 307
/*      */                   //   #624	-> 330
/*      */                   //   #641	-> 338
/*      */                   //   #642	-> 356
/*      */                   //   #643	-> 368
/*      */                   //   #644	-> 377
/*      */                   //   #645	-> 403
/*      */                   //   #647	-> 421
/*      */                   //   #648	-> 437
/*      */                   //   #649	-> 440
/*      */                   //   #650	-> 445
/*      */                   //   #651	-> 447
/*      */                   //   #652	-> 452
/*      */                   //   #653	-> 460
/*      */                   //   #655	-> 469
/*      */                   //   #650	-> 488
/*      */                   //   #657	-> 501
/*      */                   //   #658	-> 506
/*      */                   //   #660	-> 516
/*      */                   //   #662	-> 527
/*      */                   //   #664	-> 534
/*      */                   //   #665	-> 543
/*      */                   //   #667	-> 553
/*      */                   //   #668	-> 556
/*      */                   //   #664	-> 558
/*      */                   //   #663	-> 559
/*      */                   //   #669	-> 561
/*      */                   //   #670	-> 568
/*      */                   //   #672	-> 579
/*      */                   //   #675	-> 592
/*      */                   //   #676	-> 608
/*      */                   //   #677	-> 618
/*      */                   //   #678	-> 624
/*      */                   //   #679	-> 636
/*      */                   //   #680	-> 652
/*      */                   //   #681	-> 664
/*      */                   //   #682	-> 670
/*      */                   //   #683	-> 677
/*      */                   //   #684	-> 685
/*      */                   //   #685	-> 693
/*      */                   //   #686	-> 702
/*      */                   //   #683	-> 707
/*      */                   //   #687	-> 716
/*      */                   //   #683	-> 738
/*      */                   //   #688	-> 741
/*      */                   //   #691	-> 750
/*      */                   //   #624	-> 782
/*      */                   //   #692	-> 790
/*      */                   //   #693	-> 802
/*      */                   //   #624	-> 824
/*      */                   //   #694	-> 832
/*      */                   //   #696	-> 841
/*      */                   //   #624	-> 845
/*      */                   // Local variable table:
/*      */                   //   start	length	slot	name	descriptor
/*      */                   //   60	53	2	oldTargetState	Ljava/lang/Object;
/*      */                   //   256	11	3	composedTargetState	Ljava/lang/Object;
/*      */                   //   139	46	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*      */                   //   209	15	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*      */                   //   224	11	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*      */                   //   238	17	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*      */                   //   377	221	4	runningAnimation	Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;
/*      */                   //   142	43	5	owner$iv	Ljava/lang/Object;
/*      */                   //   209	15	5	owner$iv	Ljava/lang/Object;
/*      */                   //   224	11	5	owner$iv	Ljava/lang/Object;
/*      */                   //   238	17	5	owner$iv	Ljava/lang/Object;
/*      */                   //   403	282	5	newSpec	Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;
/*      */                   //   437	10	6	oldSpec	Landroidx/compose/animation/core/VectorizedAnimationSpec;
/*      */                   //   592	115	7	oldVelocity	Landroidx/compose/animation/core/AnimationVector1D;
/*      */                   //   534	9	8	oldDurationNanos	J
/*      */                   //   553	2	8	oldDurationNanos	J
/*      */                   //   608	142	8	newAnimation	Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;
/*      */                   //   561	7	10	oldDuration	F
/*      */                   //   579	13	10	oldDuration	F
/*      */                   //   219	5	8	$i$a$-withLock$default-SeekableTransitionState$animateTo$2$1$composedTargetState$1	I
/*      */                   //   145	40	7	$i$f$withLock	I
/*      */                   //   52	793	0	this	Landroidx/compose/animation/core/SeekableTransitionState$animateTo$2$1;
/*      */                   //   52	793	1	$result	Ljava/lang/Object;
/*      */                   //   188	67	7	$i$f$withLock	I
/*      */                   // Exception table:
/*      */                   //   from	to	target	type
/*      */                   //   215	226	238	finally
/*      */                   //   238	240	238	finally
/*      */                 }
/*      */                 
/*      */                 @NotNull
/*      */                 public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) {
/*      */                   return (Continuation)new Function2<>(SeekableTransitionState.this, this.$targetState, this.$transition, this.$animationSpec, $completion);
/*      */                 }
/*      */                 
/*      */                 @Nullable
/*      */                 public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*      */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */                 }
/*      */               }(Continuation)this);
/*      */           this.$transition.onTransitionEnd$animation_core();
/*      */           return Unit.INSTANCE;
/*      */         case 1:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           this.$transition.onTransitionEnd$animation_core();
/*      */           return Unit.INSTANCE;
/*      */       } 
/*      */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final Continuation<Unit> create(@NotNull Continuation<? super SeekableTransitionState$animateTo$2> $completion) {
/*      */       return (Continuation<Unit>)new SeekableTransitionState$animateTo$2(SeekableTransitionState.this, this.$targetState, this.$animationSpec, $completion);
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public final Object invoke(@Nullable Continuation<?> p1) {
/*      */       return ((SeekableTransitionState$animateTo$2)create(p1)).invokeSuspend(Unit.INSTANCE);
/*      */     }
/*      */   }
/*      */   
/*      */   public void transitionConfigured$animation_core(@NotNull Transition transition) {
/*      */     // Byte code:
/*      */     //   0: aload_1
/*      */     //   1: ldc_w 'transition'
/*      */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   7: aload_0
/*      */     //   8: getfield transition : Landroidx/compose/animation/core/Transition;
/*      */     //   11: ifnull -> 25
/*      */     //   14: aload_1
/*      */     //   15: aload_0
/*      */     //   16: getfield transition : Landroidx/compose/animation/core/Transition;
/*      */     //   19: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   22: ifeq -> 29
/*      */     //   25: iconst_1
/*      */     //   26: goto -> 30
/*      */     //   29: iconst_0
/*      */     //   30: istore_2
/*      */     //   31: iconst_0
/*      */     //   32: istore_3
/*      */     //   33: nop
/*      */     //   34: iload_2
/*      */     //   35: ifne -> 77
/*      */     //   38: iconst_0
/*      */     //   39: istore #4
/*      */     //   41: new java/lang/StringBuilder
/*      */     //   44: dup
/*      */     //   45: invokespecial <init> : ()V
/*      */     //   48: ldc_w 'An instance of SeekableTransitionState has been used in different Transitions. Previous instance: '
/*      */     //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   54: aload_0
/*      */     //   55: getfield transition : Landroidx/compose/animation/core/Transition;
/*      */     //   58: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*      */     //   61: ldc_w ', new instance: '
/*      */     //   64: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*      */     //   67: aload_1
/*      */     //   68: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*      */     //   71: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   74: invokestatic throwIllegalStateException : (Ljava/lang/String;)V
/*      */     //   77: nop
/*      */     //   78: aload_0
/*      */     //   79: aload_1
/*      */     //   80: putfield transition : Landroidx/compose/animation/core/Transition;
/*      */     //   83: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #702	-> 7
/*      */     //   #2227	-> 33
/*      */     //   #2230	-> 34
/*      */     //   #2231	-> 38
/*      */     //   #703	-> 41
/*      */     //   #704	-> 54
/*      */     //   #703	-> 58
/*      */     //   #704	-> 61
/*      */     //   #703	-> 64
/*      */     //   #704	-> 67
/*      */     //   #703	-> 68
/*      */     //   #2231	-> 74
/*      */     //   #2233	-> 77
/*      */     //   #706	-> 78
/*      */     //   #707	-> 83
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   41	33	4	$i$a$-checkPrecondition-SeekableTransitionState$transitionConfigured$1	I
/*      */     //   33	45	3	$i$f$checkPrecondition	I
/*      */     //   31	47	2	value$iv	Z
/*      */     //   0	84	0	this	Landroidx/compose/animation/core/SeekableTransitionState;
/*      */     //   0	84	1	transition	Landroidx/compose/animation/core/Transition;
/*      */   }
/*      */   
/*      */   public void transitionRemoved$animation_core() {
/*      */     this.transition = null;
/*      */     TransitionKt.getSeekableStateObserver().clear(this);
/*      */   }
/*      */   
/*      */   public final void observeTotalDuration$animation_core() {
/*      */     TransitionKt.getSeekableStateObserver().observeReads(this, TransitionKt.access$getSeekableTransitionStateTotalDurationChanged$p(), this.recalculateTotalDurationNanos);
/*      */   }
/*      */   
/*      */   public final void onTotalDurationChanged$animation_core() {
/*      */     long previousTotalDurationNanos = this.totalDurationNanos;
/*      */     observeTotalDuration$animation_core();
/*      */     if (previousTotalDurationNanos != this.totalDurationNanos) {
/*      */       SeekingAnimationState animation = this.currentAnimation;
/*      */       if (animation != null) {
/*      */         animation.setDurationNanos(this.totalDurationNanos);
/*      */         if (animation.getAnimationSpec() == null)
/*      */           animation.setAnimationSpecDuration(MathKt.roundToLong((1.0D - animation.getStart().get$animation_core(0)) * this.totalDurationNanos)); 
/*      */       } else if (this.totalDurationNanos != 0L) {
/*      */         seekToFraction();
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private final void seekToFraction() {
/*      */     Transition<S> transition;
/*      */     if (this.transition == null)
/*      */       return; 
/*      */     long playTimeNanos = MathKt.roundToLong(getFraction() * transition.getTotalDurationNanos());
/*      */     transition.seekAnimations$animation_core(playTimeNanos);
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\005\n\002\020\t\n\002\b\r\n\002\020\013\n\002\b\n\n\002\020\007\n\002\b\005\n\002\020\016\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002J\b\020)\032\0020*H\026R\"\020\003\032\n\022\004\022\0020\005\030\0010\004X\016¢\006\016\n\000\032\004\b\006\020\007\"\004\b\b\020\tR\032\020\n\032\0020\013X\016¢\006\016\n\000\032\004\b\f\020\r\"\004\b\016\020\017R\032\020\020\032\0020\013X\016¢\006\016\n\000\032\004\b\021\020\r\"\004\b\022\020\017R\034\020\023\032\004\030\0010\005X\016¢\006\016\n\000\032\004\b\024\020\025\"\004\b\026\020\027R\032\020\030\032\0020\031X\016¢\006\016\n\000\032\004\b\030\020\032\"\004\b\033\020\034R\032\020\035\032\0020\013X\016¢\006\016\n\000\032\004\b\036\020\r\"\004\b\037\020\017R\032\020 \032\0020\005X\016¢\006\016\n\000\032\004\b!\020\025\"\004\b\"\020\027R\032\020#\032\0020$X\016¢\006\016\n\000\032\004\b%\020&\"\004\b'\020(¨\006+"}, d2 = {"Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "", "()V", "animationSpec", "Landroidx/compose/animation/core/VectorizedAnimationSpec;", "Landroidx/compose/animation/core/AnimationVector1D;", "getAnimationSpec", "()Landroidx/compose/animation/core/VectorizedAnimationSpec;", "setAnimationSpec", "(Landroidx/compose/animation/core/VectorizedAnimationSpec;)V", "animationSpecDuration", "", "getAnimationSpecDuration", "()J", "setAnimationSpecDuration", "(J)V", "durationNanos", "getDurationNanos", "setDurationNanos", "initialVelocity", "getInitialVelocity", "()Landroidx/compose/animation/core/AnimationVector1D;", "setInitialVelocity", "(Landroidx/compose/animation/core/AnimationVector1D;)V", "isComplete", "", "()Z", "setComplete", "(Z)V", "progressNanos", "getProgressNanos", "setProgressNanos", "start", "getStart", "setStart", "value", "", "getValue", "()F", "setValue", "(F)V", "toString", "", "animation-core"})
/*      */   @StabilityInferred(parameters = 0)
/*      */   public static final class SeekingAnimationState {
/*      */     private long progressNanos;
/*      */     @Nullable
/*      */     private VectorizedAnimationSpec<AnimationVector1D> animationSpec;
/*      */     private boolean isComplete;
/*      */     private float value;
/*      */     
/*      */     public final long getProgressNanos() {
/*      */       return this.progressNanos;
/*      */     }
/*      */     
/*      */     public final void setProgressNanos(long <set-?>) {
/*      */       this.progressNanos = <set-?>;
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public final VectorizedAnimationSpec<AnimationVector1D> getAnimationSpec() {
/*      */       return this.animationSpec;
/*      */     }
/*      */     
/*      */     public final void setAnimationSpec(@Nullable VectorizedAnimationSpec<AnimationVector1D> <set-?>) {
/*      */       this.animationSpec = <set-?>;
/*      */     }
/*      */     
/*      */     public final boolean isComplete() {
/*      */       return this.isComplete;
/*      */     }
/*      */     
/*      */     public final void setComplete(boolean <set-?>) {
/*      */       this.isComplete = <set-?>;
/*      */     }
/*      */     
/*      */     public final float getValue() {
/*      */       return this.value;
/*      */     }
/*      */     
/*      */     public final void setValue(float <set-?>) {
/*      */       this.value = <set-?>;
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     private AnimationVector1D start = new AnimationVector1D(0.0F);
/*      */     @Nullable
/*      */     private AnimationVector1D initialVelocity;
/*      */     private long durationNanos;
/*      */     private long animationSpecDuration;
/*      */     public static final int $stable = 8;
/*      */     
/*      */     @NotNull
/*      */     public final AnimationVector1D getStart() {
/*      */       return this.start;
/*      */     }
/*      */     
/*      */     public final void setStart(@NotNull AnimationVector1D <set-?>) {
/*      */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*      */       this.start = <set-?>;
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public final AnimationVector1D getInitialVelocity() {
/*      */       return this.initialVelocity;
/*      */     }
/*      */     
/*      */     public final void setInitialVelocity(@Nullable AnimationVector1D <set-?>) {
/*      */       this.initialVelocity = <set-?>;
/*      */     }
/*      */     
/*      */     public final long getDurationNanos() {
/*      */       return this.durationNanos;
/*      */     }
/*      */     
/*      */     public final void setDurationNanos(long <set-?>) {
/*      */       this.durationNanos = <set-?>;
/*      */     }
/*      */     
/*      */     public final long getAnimationSpecDuration() {
/*      */       return this.animationSpecDuration;
/*      */     }
/*      */     
/*      */     public final void setAnimationSpecDuration(long <set-?>) {
/*      */       this.animationSpecDuration = <set-?>;
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public String toString() {
/*      */       return "progress nanos: " + this.progressNanos + ", animationSpec: " + this.animationSpec + ", isComplete: " + this.isComplete + ", value: " + this.value + ", start: " + this.start + ", initialVelocity: " + this.initialVelocity + ", durationNanos: " + this.durationNanos + ", animationSpecDuration: " + this.animationSpecDuration;
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\t"}, d2 = {"Landroidx/compose/animation/core/SeekableTransitionState$Companion;", "", "()V", "Target1", "Landroidx/compose/animation/core/AnimationVector1D;", "getTarget1", "()Landroidx/compose/animation/core/AnimationVector1D;", "ZeroVelocity", "getZeroVelocity", "animation-core"})
/*      */   private static final class Companion {
/*      */     private Companion() {}
/*      */     
/*      */     @NotNull
/*      */     public final AnimationVector1D getZeroVelocity() {
/*      */       return SeekableTransitionState.ZeroVelocity;
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final AnimationVector1D getTarget1() {
/*      */       return SeekableTransitionState.Target1;
/*      */     }
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   private static final Companion Companion = new Companion(null);
/*      */   @NotNull
/*      */   private final MutableState targetState$delegate;
/*      */   @NotNull
/*      */   private final MutableState currentState$delegate;
/*      */   private S composedTargetState;
/*      */   @Nullable
/*      */   private Transition<S> transition;
/*      */   private long totalDurationNanos;
/*      */   @NotNull
/*      */   private final Function0<Unit> recalculateTotalDurationNanos;
/*      */   @NotNull
/*      */   private final MutableFloatState fraction$delegate;
/*      */   @Nullable
/*      */   private CancellableContinuation<? super S> compositionContinuation;
/*      */   @NotNull
/*      */   private final Mutex compositionContinuationMutex;
/*      */   @NotNull
/*      */   private final MutatorMutex mutatorMutex;
/*      */   private long lastFrameTimeNanos;
/*      */   @NotNull
/*      */   private final MutableObjectList<SeekingAnimationState> initialValueAnimations;
/*      */   @Nullable
/*      */   private SeekingAnimationState currentAnimation;
/*      */   @NotNull
/*      */   private final Function1<Long, Unit> firstFrameLambda;
/*      */   private float durationScale;
/*      */   @NotNull
/*      */   private final Function1<Long, Unit> animateOneFrameLambda;
/*      */   public static final int $stable = 8;
/*      */   @NotNull
/*      */   private static final AnimationVector1D ZeroVelocity = new AnimationVector1D(0.0F);
/*      */   @NotNull
/*      */   private static final AnimationVector1D Target1 = new AnimationVector1D(1.0F);
/*      */   
/*      */   @DebugMetadata(f = "Transition.kt", l = {371, 374}, i = {0, 1}, s = {"L$0", "L$0"}, n = {"this", "this"}, m = "runAnimations", c = "androidx.compose.animation.core.SeekableTransitionState")
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*      */   static final class SeekableTransitionState$runAnimations$1 extends ContinuationImpl {
/*      */     Object L$0;
/*      */     int label;
/*      */     
/*      */     SeekableTransitionState$runAnimations$1(Continuation $completion) {
/*      */       super($completion);
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public final Object invokeSuspend(@NotNull Object $result) {
/*      */       this.result = $result;
/*      */       this.label |= Integer.MIN_VALUE;
/*      */       return SeekableTransitionState.this.runAnimations((Continuation)this);
/*      */     }
/*      */   }
/*      */   
/*      */   @DebugMetadata(f = "Transition.kt", l = {567, 2187}, i = {0, 0, 1, 1}, s = {"L$0", "L$1", "L$0", "L$1"}, n = {"this", "expectedState", "this", "expectedState"}, m = "waitForComposition", c = "androidx.compose.animation.core.SeekableTransitionState")
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*      */   static final class SeekableTransitionState$waitForComposition$1 extends ContinuationImpl {
/*      */     Object L$0;
/*      */     Object L$1;
/*      */     int label;
/*      */     
/*      */     SeekableTransitionState$waitForComposition$1(Continuation $completion) {
/*      */       super($completion);
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public final Object invokeSuspend(@NotNull Object $result) {
/*      */       this.result = $result;
/*      */       this.label |= Integer.MIN_VALUE;
/*      */       return SeekableTransitionState.this.waitForComposition((Continuation)this);
/*      */     }
/*      */   }
/*      */   
/*      */   @DebugMetadata(f = "Transition.kt", l = {543, 2187}, i = {0, 0, 1, 1}, s = {"L$0", "L$1", "L$0", "L$1"}, n = {"this", "expectedState", "this", "expectedState"}, m = "waitForCompositionAfterTargetStateChange", c = "androidx.compose.animation.core.SeekableTransitionState")
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*      */   static final class SeekableTransitionState$waitForCompositionAfterTargetStateChange$1 extends ContinuationImpl {
/*      */     Object L$0;
/*      */     Object L$1;
/*      */     int label;
/*      */     
/*      */     SeekableTransitionState$waitForCompositionAfterTargetStateChange$1(Continuation $completion) {
/*      */       super($completion);
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public final Object invokeSuspend(@NotNull Object $result) {
/*      */       this.result = $result;
/*      */       this.label |= Integer.MIN_VALUE;
/*      */       return SeekableTransitionState.this.waitForCompositionAfterTargetStateChange((Continuation)this);
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\SeekableTransitionState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */