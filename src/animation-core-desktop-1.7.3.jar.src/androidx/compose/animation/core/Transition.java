/*      */ package androidx.compose.animation.core;
/*      */ 
/*      */ import androidx.annotation.RestrictTo;
/*      */ import androidx.compose.runtime.Composable;
/*      */ import androidx.compose.runtime.Composer;
/*      */ import androidx.compose.runtime.DisposableEffectResult;
/*      */ import androidx.compose.runtime.DisposableEffectScope;
/*      */ import androidx.compose.runtime.FloatState;
/*      */ import androidx.compose.runtime.LongState;
/*      */ import androidx.compose.runtime.MutableFloatState;
/*      */ import androidx.compose.runtime.MutableLongState;
/*      */ import androidx.compose.runtime.MutableState;
/*      */ import androidx.compose.runtime.PrimitiveSnapshotStateKt;
/*      */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*      */ import androidx.compose.runtime.SnapshotLongStateKt;
/*      */ import androidx.compose.runtime.SnapshotStateKt;
/*      */ import androidx.compose.runtime.Stable;
/*      */ import androidx.compose.runtime.State;
/*      */ import androidx.compose.runtime.snapshots.SnapshotStateList;
/*      */ import java.util.List;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.PublishedApi;
/*      */ import kotlin.Unit;
/*      */ import kotlin.coroutines.Continuation;
/*      */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*      */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*      */ import kotlin.jvm.JvmName;
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
/*      */ import kotlinx.coroutines.CoroutineScope;
/*      */ import kotlinx.coroutines.CoroutineStart;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000l\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\000\n\002\020\t\n\002\b\t\n\002\020 \n\002\b\006\n\002\020\013\n\002\b\025\n\002\030\002\n\002\b \n\002\020\002\n\002\b\016\n\002\020\007\n\002\b\006\n\002\030\002\n\002\b\013\n\002\030\002\n\002\b\016\b\007\030\000*\004\b\000\020\0012\0020\002:\b\001\001\001\001B!\b\021\022\f\020\003\032\b\022\004\022\0028\0000\004\022\n\b\002\020\005\032\004\030\0010\006¢\006\002\020\007B\031\b\020\022\006\020\b\032\0028\000\022\b\020\005\032\004\030\0010\006¢\006\002\020\tB!\b\021\022\f\020\003\032\b\022\004\022\0028\0000\n\022\n\b\002\020\005\032\004\030\0010\006¢\006\002\020\013B/\b\000\022\f\020\003\032\b\022\004\022\0028\0000\004\022\f\020\f\032\b\022\002\b\003\030\0010\000\022\n\b\002\020\005\032\004\030\0010\006¢\006\002\020\rJ'\020S\032\0020#2\030\020T\032\024\022\002\b\003\022\002\b\0030\020R\b\022\004\022\0028\0000\000H\000¢\006\002\bUJ\031\020V\032\0020#2\n\020W\032\006\022\002\b\0030\000H\000¢\006\002\bXJ\027\020Y\032\0020Z2\006\020D\032\0028\000H\001¢\006\004\b[\020\\J\b\020]\032\0020\022H\002J\r\020^\032\0020ZH\000¢\006\002\b_J\b\020`\032\0020ZH\002J\r\020a\032\0020ZH\000¢\006\002\bbJ\035\020c\032\0020Z2\006\020d\032\0020\0222\006\020e\032\0020#H\000¢\006\002\bfJ\035\020c\032\0020Z2\006\020g\032\0020\0222\006\020h\032\0020iH\000¢\006\002\bfJ\r\020j\032\0020ZH\000¢\006\002\bkJ\025\020l\032\0020Z2\006\020g\032\0020\022H\000¢\006\002\bmJ'\020n\032\0020Z2\030\020o\032\024\022\002\b\003\022\002\b\0030pR\b\022\004\022\0028\0000\000H\000¢\006\002\bqJ'\020n\032\0020Z2\030\020T\032\024\022\002\b\003\022\002\b\0030\020R\b\022\004\022\0028\0000\000H\000¢\006\002\bqJ\031\020r\032\0020#2\n\020W\032\006\022\002\b\0030\000H\000¢\006\002\bsJ\025\020t\032\0020Z2\006\020u\032\0020iH\000¢\006\002\bvJ\b\020w\032\0020ZH\002J\025\020x\032\0020Z2\006\0206\032\0020\022H\000¢\006\002\byJ\025\020z\032\0020Z2\006\020{\032\0020|H\000¢\006\002\b}J(\020~\032\0020Z2\006\020\b\032\0028\0002\006\020D\032\0028\0002\006\0206\032\0020\022H\007¢\006\005\b\020\001J\t\020\001\032\0020\006H\026J\017\020\001\032\0020ZH\000¢\006\003\b\001J\031\020\001\032\0020Z2\006\020D\032\0028\000H\000¢\006\005\b\001\020GR&\020\016\032\032\022\026\022\024\022\002\b\003\022\002\b\0030\020R\b\022\004\022\0028\0000\0000\017X\004¢\006\002\n\000R+\020\023\032\0020\0222\006\020\021\032\0020\0228B@BX\002¢\006\022\n\004\b\030\020\031\032\004\b\024\020\025\"\004\b\026\020\027R\030\020\032\032\f\022\b\022\006\022\002\b\0030\0000\017X\004¢\006\002\n\000R)\020\033\032\032\022\026\022\024\022\002\b\003\022\002\b\0030\020R\b\022\004\022\0028\0000\0000\0348F¢\006\006\032\004\b\035\020\036R\021\020\037\032\0028\0008F¢\006\006\032\004\b \020!R\032\020\"\032\0020#8GX\004¢\006\f\022\004\b$\020%\032\004\b&\020'R\021\020(\032\0020#8F¢\006\006\032\004\b(\020'R+\020)\032\0020#2\006\020\021\032\0020#8G@AX\002¢\006\022\n\004\b,\020-\032\004\b)\020'\"\004\b*\020+R\023\020\005\032\004\030\0010\006¢\006\b\n\000\032\004\b.\020/R\032\0200\032\0020\022X\016¢\006\016\n\000\032\004\b1\020\025\"\004\b2\020\027R\031\020\f\032\b\022\002\b\003\030\0010\0008\007¢\006\b\n\000\032\004\b3\0204R$\0206\032\0020\0222\006\0205\032\0020\0228G@GX\016¢\006\f\032\004\b7\020\025\"\004\b8\020\027R7\020:\032\b\022\004\022\0028\000092\f\020\021\032\b\022\004\022\0028\000098F@BX\002¢\006\022\n\004\b?\020-\032\004\b;\020<\"\004\b=\020>R+\020@\032\0020\0222\006\020\021\032\0020\0228@@@X\002¢\006\022\n\004\bC\020\031\032\004\bA\020\025\"\004\bB\020\027R+\020D\032\0028\0002\006\020\021\032\0028\0008F@@X\002¢\006\022\n\004\bH\020-\032\004\bE\020!\"\004\bF\020GR\033\020I\032\0020\0228FX\002¢\006\f\n\004\bK\020L\032\004\bJ\020\025R\024\020\003\032\b\022\004\022\0028\0000\004X\004¢\006\002\n\000R\033\020M\032\f\022\b\022\006\022\002\b\0030\0000\0348F¢\006\006\032\004\bN\020\036R+\020O\032\0020#2\006\020\021\032\0020#8B@BX\002¢\006\022\n\004\bR\020-\032\004\bP\020'\"\004\bQ\020+¨\006\001"}, d2 = {"Landroidx/compose/animation/core/Transition;", "S", "", "transitionState", "Landroidx/compose/animation/core/TransitionState;", "label", "", "(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;)V", "initialState", "(Ljava/lang/Object;Ljava/lang/String;)V", "Landroidx/compose/animation/core/MutableTransitionState;", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;)V", "parentTransition", "(Landroidx/compose/animation/core/TransitionState;Landroidx/compose/animation/core/Transition;Ljava/lang/String;)V", "_animations", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "<set-?>", "", "_playTimeNanos", "get_playTimeNanos", "()J", "set_playTimeNanos", "(J)V", "_playTimeNanos$delegate", "Landroidx/compose/runtime/MutableLongState;", "_transitions", "animations", "", "getAnimations", "()Ljava/util/List;", "currentState", "getCurrentState", "()Ljava/lang/Object;", "hasInitialValueAnimations", "", "getHasInitialValueAnimations$annotations", "()V", "getHasInitialValueAnimations", "()Z", "isRunning", "isSeeking", "setSeeking$animation_core", "(Z)V", "isSeeking$delegate", "Landroidx/compose/runtime/MutableState;", "getLabel", "()Ljava/lang/String;", "lastSeekedTimeNanos", "getLastSeekedTimeNanos$animation_core", "setLastSeekedTimeNanos$animation_core", "getParentTransition", "()Landroidx/compose/animation/core/Transition;", "value", "playTimeNanos", "getPlayTimeNanos", "setPlayTimeNanos", "Landroidx/compose/animation/core/Transition$Segment;", "segment", "getSegment", "()Landroidx/compose/animation/core/Transition$Segment;", "setSegment", "(Landroidx/compose/animation/core/Transition$Segment;)V", "segment$delegate", "startTimeNanos", "getStartTimeNanos$animation_core", "setStartTimeNanos$animation_core", "startTimeNanos$delegate", "targetState", "getTargetState", "setTargetState$animation_core", "(Ljava/lang/Object;)V", "targetState$delegate", "totalDurationNanos", "getTotalDurationNanos", "totalDurationNanos$delegate", "Landroidx/compose/runtime/State;", "transitions", "getTransitions", "updateChildrenNeeded", "getUpdateChildrenNeeded", "setUpdateChildrenNeeded", "updateChildrenNeeded$delegate", "addAnimation", "animation", "addAnimation$animation_core", "addTransition", "transition", "addTransition$animation_core", "animateTo", "", "animateTo$animation_core", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "calculateTotalDurationNanos", "clearInitialAnimations", "clearInitialAnimations$animation_core", "onChildAnimationUpdated", "onDisposed", "onDisposed$animation_core", "onFrame", "scaledPlayTimeNanos", "scaleToEnd", "onFrame$animation_core", "frameTimeNanos", "durationScale", "", "onTransitionEnd", "onTransitionEnd$animation_core", "onTransitionStart", "onTransitionStart$animation_core", "removeAnimation", "deferredAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "removeAnimation$animation_core", "removeTransition", "removeTransition$animation_core", "resetAnimationFraction", "fraction", "resetAnimationFraction$animation_core", "resetAnimations", "seekAnimations", "seekAnimations$animation_core", "setInitialAnimations", "animationState", "Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "setInitialAnimations$animation_core", "setPlaytimeAfterInitialAndTargetStateEstablished", "seek", "(Ljava/lang/Object;Ljava/lang/Object;J)V", "toString", "updateInitialValues", "updateInitialValues$animation_core", "updateTarget", "updateTarget$animation_core", "DeferredAnimation", "Segment", "SegmentImpl", "TransitionAnimationState", "animation-core"})
/*      */ @Stable
/*      */ @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,2186:1\n81#2:2187\n107#2,2:2188\n81#2:2190\n107#2,2:2191\n81#2:2199\n107#2,2:2200\n81#2:2202\n107#2,2:2203\n81#2:2223\n78#3:2193\n111#3,2:2194\n78#3:2196\n111#3,2:2197\n101#4,2:2205\n33#4,6:2207\n103#4:2213\n101#4,2:2214\n33#4,6:2216\n103#4:2222\n33#4,6:2224\n33#4,6:2230\n33#4,6:2236\n33#4,6:2242\n33#4,6:2248\n33#4,6:2254\n33#4,6:2260\n33#4,6:2266\n33#4,6:2272\n33#4,6:2299\n33#4,6:2305\n33#4,6:2311\n33#4,6:2317\n33#4,6:2323\n33#4,6:2329\n33#4,6:2335\n33#4,6:2341\n33#4,6:2347\n33#4,6:2353\n256#4,3:2359\n33#4,4:2362\n259#4,2:2366\n38#4:2368\n261#4:2369\n33#4,6:2370\n481#5:2278\n480#5,4:2279\n484#5,2:2286\n488#5:2292\n1225#6,3:2283\n1228#6,3:2289\n1225#6,6:2293\n480#7:2288\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n*L\n935#1:2187\n935#1:2188,2\n942#1:2190\n942#1:2191,2\n974#1:2199\n974#1:2200,2\n994#1:2202\n994#1:2203,2\n1021#1:2223\n951#1:2193\n951#1:2194,2\n971#1:2196\n971#1:2197,2\n1010#1:2205,2\n1010#1:2207,6\n1010#1:2213\n1011#1:2214,2\n1011#1:2216,6\n1011#1:2222\n1025#1:2224,6\n1028#1:2230,6\n1063#1:2236,6\n1072#1:2242,6\n1110#1:2248,6\n1148#1:2254,6\n1161#1:2260,6\n1204#1:2266,6\n1205#1:2272,6\n1256#1:2299,6\n1259#1:2305,6\n1275#1:2311,6\n1278#1:2317,6\n1288#1:2323,6\n1289#1:2329,6\n1296#1:2335,6\n1299#1:2341,6\n1311#1:2347,6\n1312#1:2353,6\n1316#1:2359,3\n1316#1:2362,4\n1316#1:2366,2\n1316#1:2368\n1316#1:2369\n1325#1:2370,6\n1221#1:2278\n1221#1:2279,4\n1221#1:2286,2\n1221#1:2292\n1221#1:2283,3\n1221#1:2289,3\n1222#1:2293,6\n1221#1:2288\n*E\n"})
/*      */ public final class Transition<S>
/*      */ {
/*      */   @NotNull
/*      */   private final TransitionState<S> transitionState;
/*      */   @Nullable
/*      */   private final Transition<?> parentTransition;
/*      */   @Nullable
/*      */   private final String label;
/*      */   @NotNull
/*      */   private final MutableState targetState$delegate;
/*      */   @NotNull
/*      */   private final MutableState segment$delegate;
/*      */   @NotNull
/*      */   private final MutableLongState _playTimeNanos$delegate;
/*      */   @NotNull
/*      */   private final MutableLongState startTimeNanos$delegate;
/*      */   @NotNull
/*      */   private final MutableState updateChildrenNeeded$delegate;
/*      */   @NotNull
/*      */   private final SnapshotStateList<TransitionAnimationState<?, ?>> _animations;
/*      */   @NotNull
/*      */   private final SnapshotStateList<Transition<?>> _transitions;
/*      */   @NotNull
/*      */   private final MutableState isSeeking$delegate;
/*      */   private long lastSeekedTimeNanos;
/*      */   @NotNull
/*      */   private final State totalDurationNanos$delegate;
/*      */   public static final int $stable;
/*      */   
/*      */   public Transition(@NotNull TransitionState<S> transitionState, @Nullable Transition<?> parentTransition, @Nullable String label) {
/*  901 */     this.transitionState = transitionState;
/*  902 */     this.parentTransition = parentTransition;
/*      */     
/*  904 */     this.label = label;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  935 */     this.targetState$delegate = SnapshotStateKt.mutableStateOf$default(getCurrentState(), null, 2, null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  942 */     this.segment$delegate = SnapshotStateKt.mutableStateOf$default(new SegmentImpl<>(getCurrentState(), getCurrentState()), null, 2, null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  951 */     this._playTimeNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(0L);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  971 */     this.startTimeNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(Long.MIN_VALUE);
/*      */ 
/*      */     
/*  974 */     this.updateChildrenNeeded$delegate = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(false), null, 2, null);
/*      */     
/*  976 */     this._animations = SnapshotStateKt.mutableStateListOf();
/*  977 */     this._transitions = SnapshotStateKt.mutableStateListOf();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  994 */     this.isSeeking$delegate = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(false), null, 2, null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1021 */     this.totalDurationNanos$delegate = SnapshotStateKt.derivedStateOf(new Transition$totalDurationNanos$2());
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1086 */     this.transitionState.transitionConfigured$animation_core(this);
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
/*      */   @RestrictTo({RestrictTo.Scope.LIBRARY})
/*      */   @Nullable
/*      */   public final Transition<?> getParentTransition() {
/*      */     return this.parentTransition;
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
/*      */   @Nullable
/*      */   public final String getLabel() {
/*      */     return this.label;
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
/*      */   @PublishedApi
/*      */   public Transition(@NotNull TransitionState<S> transitionState, @Nullable String label) {
/*      */     this(transitionState, null, label);
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
/*      */   public Transition(Object initialState, @Nullable String label) {
/*      */     this(new MutableTransitionState<>((S)initialState), null, label);
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
/*      */   @PublishedApi
/*      */   public Transition(@NotNull MutableTransitionState<S> transitionState, @Nullable String label) {
/*      */     this(transitionState, null, label);
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
/*      */   public final S getCurrentState() {
/*      */     return this.transitionState.getCurrentState();
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
/*      */   public final S getTargetState()
/*      */   {
/*      */     State state = (State)this.targetState$delegate;
/*      */     KProperty property$iv = null;
/*      */     int $i$f$getValue = 0;
/* 2187 */     return (S)state.getValue(); } public final void setTargetState$animation_core(Object <set-?>) { MutableState mutableState = this.targetState$delegate; KProperty property$iv = null; int $i$f$setValue = 0;
/* 2188 */     mutableState.setValue(<set-?>); } @NotNull public final Segment<S> getSegment() { State state = (State)this.segment$delegate; KProperty property$iv = null;
/*      */     int $i$f$getValue = 0;
/* 2190 */     return (Segment<S>)state.getValue(); } private final void setSegment(Segment <set-?>) { MutableState mutableState = this.segment$delegate; KProperty property$iv = null; int $i$f$setValue = 0;
/* 2191 */     mutableState.setValue(<set-?>); } public final boolean isRunning() { return (getStartTimeNanos$animation_core() != Long.MIN_VALUE); }
/*      */   private final long get_playTimeNanos() { LongState longState = (LongState)this._playTimeNanos$delegate; KProperty property$iv = null; int $i$f$getValue = 0;
/* 2193 */     return longState.getLongValue(); } private final void set_playTimeNanos(long <set-?>) { MutableLongState mutableLongState = this._playTimeNanos$delegate; KProperty property$iv = null; int $i$f$setValue = 0;
/* 2194 */     mutableLongState.setLongValue(<set-?>); } @RestrictTo({RestrictTo.Scope.LIBRARY}) public final long getPlayTimeNanos() { return (this.parentTransition != null) ? this.parentTransition.getPlayTimeNanos() : get_playTimeNanos(); }
/*      */   @RestrictTo({RestrictTo.Scope.LIBRARY}) public final void setPlayTimeNanos(long value) { if (this.parentTransition == null) set_playTimeNanos(value);  }
/* 2196 */   public final long getStartTimeNanos$animation_core() { LongState longState = (LongState)this.startTimeNanos$delegate; KProperty property$iv = null; int $i$f$getValue = 0; return longState.getLongValue(); } public final void setStartTimeNanos$animation_core(long <set-?>) { MutableLongState mutableLongState = this.startTimeNanos$delegate; KProperty property$iv = null; int $i$f$setValue = 0;
/* 2197 */     mutableLongState.setLongValue(<set-?>); } private final boolean getUpdateChildrenNeeded() { State state = (State)this.updateChildrenNeeded$delegate; KProperty property$iv = null;
/*      */     int $i$f$getValue = 0;
/* 2199 */     return ((Boolean)state.getValue()).booleanValue(); } private final void setUpdateChildrenNeeded(boolean <set-?>) { MutableState mutableState = this.updateChildrenNeeded$delegate; Object object = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 2200 */     mutableState.setValue(value$iv); } @NotNull public final List<Transition<?>> getTransitions() { return (List<Transition<?>>)this._transitions; }
/*      */   @NotNull public final List<TransitionAnimationState<?, ?>> getAnimations() { return (List<TransitionAnimationState<?, ?>>)this._animations; }
/* 2202 */   @RestrictTo({RestrictTo.Scope.LIBRARY}) public final boolean isSeeking() { State state = (State)this.isSeeking$delegate; KProperty property$iv = null; int $i$f$getValue = 0; return ((Boolean)state.getValue()).booleanValue(); } @RestrictTo({RestrictTo.Scope.LIBRARY}) public final void setSeeking$animation_core(boolean <set-?>) { MutableState mutableState = this.isSeeking$delegate; Object object = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 2203 */     mutableState.setValue(value$iv); }
/*      */ 
/*      */   
/*      */   public final long getLastSeekedTimeNanos$animation_core() {
/*      */     return this.lastSeekedTimeNanos;
/*      */   }
/*      */   
/*      */   public final void setLastSeekedTimeNanos$animation_core(long <set-?>) {
/*      */     this.lastSeekedTimeNanos = <set-?>;
/*      */   }
/*      */   
/*      */   @InternalAnimationApi
/*      */   public final boolean getHasInitialValueAnimations() {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield _animations : Landroidx/compose/runtime/snapshots/SnapshotStateList;
/*      */     //   4: checkcast java/util/List
/*      */     //   7: astore_1
/*      */     //   8: iconst_0
/*      */     //   9: istore_2
/*      */     //   10: nop
/*      */     //   11: aload_1
/*      */     //   12: astore_3
/*      */     //   13: iconst_0
/*      */     //   14: istore #4
/*      */     //   16: nop
/*      */     //   17: iconst_0
/*      */     //   18: istore #5
/*      */     //   20: aload_3
/*      */     //   21: invokeinterface size : ()I
/*      */     //   26: istore #6
/*      */     //   28: iload #5
/*      */     //   30: iload #6
/*      */     //   32: if_icmpge -> 89
/*      */     //   35: aload_3
/*      */     //   36: iload #5
/*      */     //   38: invokeinterface get : (I)Ljava/lang/Object;
/*      */     //   43: astore #7
/*      */     //   45: aload #7
/*      */     //   47: astore #8
/*      */     //   49: iconst_0
/*      */     //   50: istore #9
/*      */     //   52: aload #8
/*      */     //   54: checkcast androidx/compose/animation/core/Transition$TransitionAnimationState
/*      */     //   57: astore #10
/*      */     //   59: iconst_0
/*      */     //   60: istore #11
/*      */     //   62: aload #10
/*      */     //   64: invokevirtual getInitialValueState$animation_core : ()Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;
/*      */     //   67: ifnull -> 74
/*      */     //   70: iconst_1
/*      */     //   71: goto -> 75
/*      */     //   74: iconst_0
/*      */     //   75: ifeq -> 82
/*      */     //   78: iconst_1
/*      */     //   79: goto -> 91
/*      */     //   82: nop
/*      */     //   83: iinc #5, 1
/*      */     //   86: goto -> 28
/*      */     //   89: nop
/*      */     //   90: iconst_0
/*      */     //   91: ifne -> 180
/*      */     //   94: aload_0
/*      */     //   95: getfield _transitions : Landroidx/compose/runtime/snapshots/SnapshotStateList;
/*      */     //   98: checkcast java/util/List
/*      */     //   101: astore_1
/*      */     //   102: iconst_0
/*      */     //   103: istore_2
/*      */     //   104: nop
/*      */     //   105: aload_1
/*      */     //   106: astore_3
/*      */     //   107: iconst_0
/*      */     //   108: istore #4
/*      */     //   110: nop
/*      */     //   111: iconst_0
/*      */     //   112: istore #5
/*      */     //   114: aload_3
/*      */     //   115: invokeinterface size : ()I
/*      */     //   120: istore #6
/*      */     //   122: iload #5
/*      */     //   124: iload #6
/*      */     //   126: if_icmpge -> 175
/*      */     //   129: aload_3
/*      */     //   130: iload #5
/*      */     //   132: invokeinterface get : (I)Ljava/lang/Object;
/*      */     //   137: astore #7
/*      */     //   139: aload #7
/*      */     //   141: astore #8
/*      */     //   143: iconst_0
/*      */     //   144: istore #9
/*      */     //   146: aload #8
/*      */     //   148: checkcast androidx/compose/animation/core/Transition
/*      */     //   151: astore #10
/*      */     //   153: iconst_0
/*      */     //   154: istore #11
/*      */     //   156: aload #10
/*      */     //   158: invokevirtual getHasInitialValueAnimations : ()Z
/*      */     //   161: ifeq -> 168
/*      */     //   164: iconst_1
/*      */     //   165: goto -> 177
/*      */     //   168: nop
/*      */     //   169: iinc #5, 1
/*      */     //   172: goto -> 122
/*      */     //   175: nop
/*      */     //   176: iconst_0
/*      */     //   177: ifeq -> 184
/*      */     //   180: iconst_1
/*      */     //   181: goto -> 185
/*      */     //   184: iconst_0
/*      */     //   185: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1010	-> 0
/*      */     //   #2205	-> 10
/*      */     //   #2206	-> 11
/*      */     //   #2207	-> 16
/*      */     //   #2208	-> 17
/*      */     //   #2209	-> 35
/*      */     //   #2210	-> 45
/*      */     //   #2206	-> 52
/*      */     //   #1010	-> 62
/*      */     //   #2206	-> 75
/*      */     //   #2210	-> 82
/*      */     //   #2208	-> 83
/*      */     //   #2212	-> 89
/*      */     //   #2213	-> 90
/*      */     //   #1011	-> 94
/*      */     //   #2214	-> 104
/*      */     //   #2215	-> 105
/*      */     //   #2216	-> 110
/*      */     //   #2217	-> 111
/*      */     //   #2218	-> 129
/*      */     //   #2219	-> 139
/*      */     //   #2215	-> 146
/*      */     //   #1011	-> 156
/*      */     //   #2215	-> 161
/*      */     //   #2219	-> 168
/*      */     //   #2217	-> 169
/*      */     //   #2221	-> 175
/*      */     //   #2222	-> 176
/*      */     //   #1011	-> 185
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   62	13	11	$i$a$-fastAny-Transition$hasInitialValueAnimations$1	I
/*      */     //   59	16	10	it	Landroidx/compose/animation/core/Transition$TransitionAnimationState;
/*      */     //   52	30	9	$i$a$-fastForEach-ListUtilsKt$fastAny$2$iv	I
/*      */     //   49	33	8	it$iv	Ljava/lang/Object;
/*      */     //   45	38	7	item$iv$iv	Ljava/lang/Object;
/*      */     //   20	69	5	index$iv$iv	I
/*      */     //   16	74	4	$i$f$fastForEach	I
/*      */     //   13	77	3	$this$fastForEach$iv$iv	Ljava/util/List;
/*      */     //   10	81	2	$i$f$fastAny	I
/*      */     //   8	83	1	$this$fastAny$iv	Ljava/util/List;
/*      */     //   156	5	11	$i$a$-fastAny-Transition$hasInitialValueAnimations$2	I
/*      */     //   153	8	10	it	Landroidx/compose/animation/core/Transition;
/*      */     //   146	22	9	$i$a$-fastForEach-ListUtilsKt$fastAny$2$iv	I
/*      */     //   143	25	8	it$iv	Ljava/lang/Object;
/*      */     //   139	30	7	item$iv$iv	Ljava/lang/Object;
/*      */     //   114	61	5	index$iv$iv	I
/*      */     //   110	66	4	$i$f$fastForEach	I
/*      */     //   107	69	3	$this$fastForEach$iv$iv	Ljava/util/List;
/*      */     //   104	73	2	$i$f$fastAny	I
/*      */     //   102	75	1	$this$fastAny$iv	Ljava/util/List;
/*      */     //   0	186	0	this	Landroidx/compose/animation/core/Transition;
/*      */   }
/*      */   
/*      */   public final long getTotalDurationNanos() {
/*      */     State state = this.totalDurationNanos$delegate;
/*      */     KProperty property$iv = null;
/*      */     int $i$f$getValue = 0;
/* 2223 */     return ((Number)state.getValue()).longValue();
/*      */   } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\t\n\002\b\003\020\000\032\0020\001\"\004\b\000\020\002H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "S", "invoke", "()Ljava/lang/Long;"}) static final class Transition$totalDurationNanos$2 extends Lambda implements Function0<Long> {
/* 2225 */     Transition$totalDurationNanos$2() { super(0); } @NotNull public final Long invoke() { return Long.valueOf(Transition.this.calculateTotalDurationNanos()); } } private final long calculateTotalDurationNanos() { long maxDurationNanos = 0L; List $this$fastForEach$iv = (List)this._animations; int $i$f$fastForEach = 0; int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 2226 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 2227 */       TransitionAnimationState it = (TransitionAnimationState)item$iv; int $i$a$-fastForEach-Transition$calculateTotalDurationNanos$1 = 0; maxDurationNanos = Math.max(maxDurationNanos, it.getDurationNanos$animation_core());
/*      */     } 
/*      */     $this$fastForEach$iv = (List)this._transitions;
/*      */     $i$f$fastForEach = 0;
/* 2231 */     index$iv = 0; i = $this$fastForEach$iv.size(); if (index$iv < i)
/* 2232 */     { Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 2233 */       Transition it = (Transition)item$iv; int $i$a$-fastForEach-Transition$calculateTotalDurationNanos$2 = 0; }  return maxDurationNanos; } public final void onFrame$animation_core(long frameTimeNanos, float durationScale) { if (getStartTimeNanos$animation_core() == Long.MIN_VALUE)
/*      */       onTransitionStart$animation_core(frameTimeNanos);  long deltaT = frameTimeNanos - getStartTimeNanos$animation_core(); long scaledPlayTimeNanos = ((durationScale == 0.0F)) ? deltaT : MathKt.roundToLong(deltaT / durationScale); setPlayTimeNanos(scaledPlayTimeNanos); onFrame$animation_core(scaledPlayTimeNanos, (durationScale == 0.0F)); }
/*      */   public final void onFrame$animation_core(long scaledPlayTimeNanos, boolean scaleToEnd) { if (getStartTimeNanos$animation_core() == Long.MIN_VALUE) { onTransitionStart$animation_core(scaledPlayTimeNanos); }
/*      */     else if (!this.transitionState.isRunning$animation_core()) { this.transitionState.setRunning$animation_core(true); }
/* 2237 */      setUpdateChildrenNeeded(false); boolean allFinished = false; allFinished = true; List $this$fastForEach$iv = (List)this._animations; int $i$f$fastForEach = 0; int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 2238 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 2239 */       TransitionAnimationState it = (TransitionAnimationState)item$iv; int $i$a$-fastForEach-Transition$onFrame$1 = 0; if (!it.isFinished$animation_core())
/*      */         it.onPlayTimeChanged$animation_core(scaledPlayTimeNanos, scaleToEnd); 
/*      */     }  $this$fastForEach$iv = (List)this._transitions;
/*      */     $i$f$fastForEach = 0;
/* 2243 */     index$iv = 0; i = $this$fastForEach$iv.size(); if (index$iv < i)
/* 2244 */     { Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 2245 */       Transition it = (Transition)item$iv; int $i$a$-fastForEach-Transition$onFrame$2 = 0; if (!Intrinsics.areEqual(it.getTargetState(), it.getCurrentState())) it.onFrame$animation_core(scaledPlayTimeNanos, scaleToEnd);  }  if (allFinished)
/*      */       onTransitionEnd$animation_core();  } public final void onTransitionStart$animation_core(long frameTimeNanos) { setStartTimeNanos$animation_core(frameTimeNanos); this.transitionState.setRunning$animation_core(true); }
/*      */   public final void onDisposed$animation_core() { onTransitionEnd$animation_core(); this.transitionState.transitionRemoved$animation_core(); }
/*      */   public final void onTransitionEnd$animation_core() { setStartTimeNanos$animation_core(Long.MIN_VALUE); if (this.transitionState instanceof MutableTransitionState)
/* 2249 */       this.transitionState.setCurrentState$animation_core(getTargetState());  setPlayTimeNanos(0L); this.transitionState.setRunning$animation_core(false); List $this$fastForEach$iv = (List)this._transitions; int $i$f$fastForEach = 0; int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 2250 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 2251 */       Transition it = (Transition)item$iv; int $i$a$-fastForEach-Transition$onTransitionEnd$1 = 0; it.onTransitionEnd$animation_core();
/*      */     }  }
/*      */   public final boolean addTransition$animation_core(@NotNull Transition transition) { Intrinsics.checkNotNullParameter(transition, "transition"); return this._transitions.add(transition); } @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX}) @JvmName(name = "seek") public final void seek(Object initialState, Object targetState, long playTimeNanos) { setStartTimeNanos$animation_core(Long.MIN_VALUE); this.transitionState.setRunning$animation_core(false); if (!isSeeking() || !Intrinsics.areEqual(getCurrentState(), initialState) || !Intrinsics.areEqual(getTargetState(), targetState)) { if (!Intrinsics.areEqual(getCurrentState(), initialState) && this.transitionState instanceof MutableTransitionState)
/*      */         this.transitionState.setCurrentState$animation_core((S)initialState);  setTargetState$animation_core((S)targetState); setSeeking$animation_core(true); setSegment(new SegmentImpl<>((S)initialState, (S)targetState)); }
/* 2255 */      List $this$fastForEach$iv = (List)this._transitions; int $i$f$fastForEach = 0; int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 2256 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 2257 */       Transition it = (Transition)item$iv; int $i$a$-fastForEach-Transition$setPlaytimeAfterInitialAndTargetStateEstablished$1 = 0; Intrinsics.checkNotNull(it, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>"); Transition transition1 = it; int $i$a$-let-Transition$setPlaytimeAfterInitialAndTargetStateEstablished$1$1 = 0;
/*      */     } 
/*      */     $this$fastForEach$iv = (List)this._animations;
/*      */     $i$f$fastForEach = 0;
/* 2261 */     index$iv = 0; i = $this$fastForEach$iv.size(); if (index$iv < i)
/* 2262 */     { Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 2263 */       TransitionAnimationState it = (TransitionAnimationState)item$iv; int $i$a$-fastForEach-Transition$setPlaytimeAfterInitialAndTargetStateEstablished$2 = 0; it.seekTo$animation_core(playTimeNanos); }  this.lastSeekedTimeNanos = playTimeNanos; }
/*      */   public final boolean removeTransition$animation_core(@NotNull Transition transition) { Intrinsics.checkNotNullParameter(transition, "transition"); return this._transitions.remove(transition); }
/*      */   public final boolean addAnimation$animation_core(@NotNull TransitionAnimationState animation) { Intrinsics.checkNotNullParameter(animation, "animation"); return this._animations.add(animation); }
/*      */   public final void removeAnimation$animation_core(@NotNull TransitionAnimationState animation) { Intrinsics.checkNotNullParameter(animation, "animation"); this._animations.remove(animation); }
/* 2267 */   public final void updateTarget$animation_core(Object targetState) { if (!Intrinsics.areEqual(getTargetState(), targetState)) { setSegment(new SegmentImpl<>(getTargetState(), (S)targetState)); if (!Intrinsics.areEqual(getCurrentState(), getTargetState())) this.transitionState.setCurrentState$animation_core(getTargetState());  setTargetState$animation_core((S)targetState); if (!isRunning()) setUpdateChildrenNeeded(true);  resetAnimations(); }  } private final void resetAnimations() { List $this$fastForEach$iv = (List)this._animations; int $i$f$fastForEach = 0; int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 2268 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 2269 */       TransitionAnimationState it = (TransitionAnimationState)item$iv; int $i$a$-fastForEach-Transition$resetAnimations$1 = 0; it.resetAnimation$animation_core();
/*      */     } 
/*      */     $this$fastForEach$iv = (List)this._transitions;
/*      */     $i$f$fastForEach = 0;
/* 2273 */     index$iv = 0; i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 2274 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 2275 */       Transition it = (Transition)item$iv; int $i$a$-fastForEach-Transition$resetAnimations$2 = 0;
/*      */       it.resetAnimations();
/*      */     }  } @Composable public final void animateTo$animation_core(Object targetState, @Nullable Composer $composer, int $changed) { // Byte code:
/*      */     //   0: aload_2
/*      */     //   1: ldc_w -1493585151
/*      */     //   4: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*      */     //   9: astore_2
/*      */     //   10: aload_2
/*      */     //   11: ldc_w 'C(animateTo)1220@49879L24,1221@49959L1012,1221@49920L1051:Transition.kt#pdpnli'
/*      */     //   14: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*      */     //   17: iload_3
/*      */     //   18: istore #4
/*      */     //   20: iload_3
/*      */     //   21: bipush #6
/*      */     //   23: iand
/*      */     //   24: ifne -> 64
/*      */     //   27: iload #4
/*      */     //   29: iload_3
/*      */     //   30: bipush #8
/*      */     //   32: iand
/*      */     //   33: ifne -> 46
/*      */     //   36: aload_2
/*      */     //   37: aload_1
/*      */     //   38: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   43: goto -> 53
/*      */     //   46: aload_2
/*      */     //   47: aload_1
/*      */     //   48: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   53: ifeq -> 60
/*      */     //   56: iconst_4
/*      */     //   57: goto -> 61
/*      */     //   60: iconst_2
/*      */     //   61: ior
/*      */     //   62: istore #4
/*      */     //   64: iload_3
/*      */     //   65: bipush #48
/*      */     //   67: iand
/*      */     //   68: ifne -> 93
/*      */     //   71: iload #4
/*      */     //   73: aload_2
/*      */     //   74: aload_0
/*      */     //   75: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   80: ifeq -> 88
/*      */     //   83: bipush #32
/*      */     //   85: goto -> 90
/*      */     //   88: bipush #16
/*      */     //   90: ior
/*      */     //   91: istore #4
/*      */     //   93: iload #4
/*      */     //   95: bipush #19
/*      */     //   97: iand
/*      */     //   98: bipush #18
/*      */     //   100: if_icmpne -> 112
/*      */     //   103: aload_2
/*      */     //   104: invokeinterface getSkipping : ()Z
/*      */     //   109: ifne -> 461
/*      */     //   112: invokestatic isTraceInProgress : ()Z
/*      */     //   115: ifeq -> 130
/*      */     //   118: ldc_w -1493585151
/*      */     //   121: iload #4
/*      */     //   123: iconst_m1
/*      */     //   124: ldc_w 'androidx.compose.animation.core.Transition.animateTo (Transition.kt:1212)'
/*      */     //   127: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   130: aload_0
/*      */     //   131: invokevirtual isSeeking : ()Z
/*      */     //   134: ifne -> 449
/*      */     //   137: aload_0
/*      */     //   138: aload_1
/*      */     //   139: invokevirtual updateTarget$animation_core : (Ljava/lang/Object;)V
/*      */     //   142: aload_1
/*      */     //   143: aload_0
/*      */     //   144: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*      */     //   147: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   150: ifeq -> 167
/*      */     //   153: aload_0
/*      */     //   154: invokevirtual isRunning : ()Z
/*      */     //   157: ifne -> 167
/*      */     //   160: aload_0
/*      */     //   161: invokespecial getUpdateChildrenNeeded : ()Z
/*      */     //   164: ifeq -> 449
/*      */     //   167: iconst_0
/*      */     //   168: istore #7
/*      */     //   170: nop
/*      */     //   171: iconst_0
/*      */     //   172: istore #8
/*      */     //   174: aload_2
/*      */     //   175: ldc_w 773894976
/*      */     //   178: ldc_w 'CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp'
/*      */     //   181: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   184: aload_2
/*      */     //   185: astore #9
/*      */     //   187: aload_2
/*      */     //   188: ldc_w -954370320
/*      */     //   191: ldc_w 'CC(remember):Effects.kt#9igjgp'
/*      */     //   194: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   197: aload_2
/*      */     //   198: astore #10
/*      */     //   200: iconst_0
/*      */     //   201: istore #11
/*      */     //   203: iconst_0
/*      */     //   204: istore #12
/*      */     //   206: aload #10
/*      */     //   208: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   213: astore #13
/*      */     //   215: iconst_0
/*      */     //   216: istore #14
/*      */     //   218: aload #13
/*      */     //   220: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   223: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   226: if_acmpne -> 273
/*      */     //   229: iconst_0
/*      */     //   230: istore #15
/*      */     //   232: iconst_0
/*      */     //   233: istore #16
/*      */     //   235: getstatic kotlin/coroutines/EmptyCoroutineContext.INSTANCE : Lkotlin/coroutines/EmptyCoroutineContext;
/*      */     //   238: checkcast kotlin/coroutines/CoroutineContext
/*      */     //   241: aload #9
/*      */     //   243: invokestatic createCompositionCoroutineScope : (Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;
/*      */     //   246: astore #22
/*      */     //   248: new androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*      */     //   251: dup
/*      */     //   252: aload #22
/*      */     //   254: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;)V
/*      */     //   257: astore #16
/*      */     //   259: aload #10
/*      */     //   261: aload #16
/*      */     //   263: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   268: aload #16
/*      */     //   270: goto -> 275
/*      */     //   273: aload #13
/*      */     //   275: nop
/*      */     //   276: nop
/*      */     //   277: nop
/*      */     //   278: checkcast androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*      */     //   281: astore #17
/*      */     //   283: aload_2
/*      */     //   284: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   287: aload #17
/*      */     //   289: astore #18
/*      */     //   291: aload #18
/*      */     //   293: invokevirtual getCoroutineScope : ()Lkotlinx/coroutines/CoroutineScope;
/*      */     //   296: astore #17
/*      */     //   298: aload_2
/*      */     //   299: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   302: aload #17
/*      */     //   304: nop
/*      */     //   305: astore #5
/*      */     //   307: aload #5
/*      */     //   309: aload_0
/*      */     //   310: aload_2
/*      */     //   311: ldc_w 335902523
/*      */     //   314: ldc_w 'CC(remember):Transition.kt#9igjgp'
/*      */     //   317: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   320: aload_2
/*      */     //   321: astore #7
/*      */     //   323: aload_2
/*      */     //   324: aload #5
/*      */     //   326: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   331: iload #4
/*      */     //   333: bipush #112
/*      */     //   335: iand
/*      */     //   336: bipush #32
/*      */     //   338: if_icmpne -> 345
/*      */     //   341: iconst_1
/*      */     //   342: goto -> 346
/*      */     //   345: iconst_0
/*      */     //   346: ior
/*      */     //   347: istore #8
/*      */     //   349: iconst_0
/*      */     //   350: istore #9
/*      */     //   352: aload #7
/*      */     //   354: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   359: astore #10
/*      */     //   361: iconst_0
/*      */     //   362: istore #11
/*      */     //   364: iload #8
/*      */     //   366: ifne -> 380
/*      */     //   369: aload #10
/*      */     //   371: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   374: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   377: if_acmpne -> 424
/*      */     //   380: astore #20
/*      */     //   382: astore #19
/*      */     //   384: iconst_0
/*      */     //   385: istore #12
/*      */     //   387: new androidx/compose/animation/core/Transition$animateTo$1$1
/*      */     //   390: dup
/*      */     //   391: aload #5
/*      */     //   393: aload_0
/*      */     //   394: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/animation/core/Transition;)V
/*      */     //   397: checkcast kotlin/jvm/functions/Function1
/*      */     //   400: astore #21
/*      */     //   402: aload #19
/*      */     //   404: aload #20
/*      */     //   406: aload #21
/*      */     //   408: astore #13
/*      */     //   410: aload #7
/*      */     //   412: aload #13
/*      */     //   414: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   419: aload #13
/*      */     //   421: goto -> 426
/*      */     //   424: aload #10
/*      */     //   426: nop
/*      */     //   427: nop
/*      */     //   428: nop
/*      */     //   429: checkcast kotlin/jvm/functions/Function1
/*      */     //   432: astore #6
/*      */     //   434: aload_2
/*      */     //   435: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   438: aload #6
/*      */     //   440: aload_2
/*      */     //   441: bipush #112
/*      */     //   443: iload #4
/*      */     //   445: iand
/*      */     //   446: invokestatic DisposableEffect : (Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*      */     //   449: invokestatic isTraceInProgress : ()Z
/*      */     //   452: ifeq -> 467
/*      */     //   455: invokestatic traceEventEnd : ()V
/*      */     //   458: goto -> 467
/*      */     //   461: aload_2
/*      */     //   462: invokeinterface skipToGroupEnd : ()V
/*      */     //   467: aload_2
/*      */     //   468: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   473: dup
/*      */     //   474: ifnull -> 498
/*      */     //   477: new androidx/compose/animation/core/Transition$animateTo$2
/*      */     //   480: dup
/*      */     //   481: aload_0
/*      */     //   482: aload_1
/*      */     //   483: iload_3
/*      */     //   484: invokespecial <init> : (Landroidx/compose/animation/core/Transition;Ljava/lang/Object;I)V
/*      */     //   487: checkcast kotlin/jvm/functions/Function2
/*      */     //   490: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   495: goto -> 499
/*      */     //   498: pop
/*      */     //   499: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1213	-> 0
/*      */     //   #1214	-> 130
/*      */     //   #1215	-> 137
/*      */     //   #1218	-> 142
/*      */     //   #1221	-> 170
/*      */     //   #2278	-> 181
/*      */     //   #2279	-> 184
/*      */     //   #2281	-> 185
/*      */     //   #2282	-> 194
/*      */     //   #2283	-> 206
/*      */     //   #2284	-> 218
/*      */     //   #2285	-> 229
/*      */     //   #2286	-> 232
/*      */     //   #2287	-> 232
/*      */     //   #2288	-> 235
/*      */     //   #2287	-> 238
/*      */     //   #2286	-> 246
/*      */     //   #2285	-> 257
/*      */     //   #2289	-> 259
/*      */     //   #2290	-> 268
/*      */     //   #2291	-> 273
/*      */     //   #2284	-> 275
/*      */     //   #2283	-> 276
/*      */     //   #2283	-> 277
/*      */     //   #2282	-> 278
/*      */     //   #2292	-> 291
/*      */     //   #2278	-> 299
/*      */     //   #2292	-> 304
/*      */     //   #1221	-> 305
/*      */     //   #1222	-> 307
/*      */     //   #2293	-> 352
/*      */     //   #2294	-> 364
/*      */     //   #2295	-> 380
/*      */     //   #1222	-> 387
/*      */     //   #2295	-> 408
/*      */     //   #2296	-> 410
/*      */     //   #2297	-> 419
/*      */     //   #2298	-> 424
/*      */     //   #2294	-> 426
/*      */     //   #2293	-> 427
/*      */     //   #2293	-> 428
/*      */     //   #1222	-> 429
/*      */     //   #1242	-> 461
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   235	3	16	$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1	I
/*      */     //   232	25	15	$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv	I
/*      */     //   259	11	16	value$iv$iv	Ljava/lang/Object;
/*      */     //   218	58	14	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*      */     //   215	61	13	it$iv$iv	Ljava/lang/Object;
/*      */     //   206	72	12	$i$f$cache	I
/*      */     //   203	75	10	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   203	75	11	invalid$iv$iv	Z
/*      */     //   174	131	8	$i$f$rememberCoroutineScope	I
/*      */     //   187	118	9	composer$iv	Landroidx/compose/runtime/Composer;
/*      */     //   291	14	18	wrapper$iv	Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
/*      */     //   171	134	7	$changed$iv	I
/*      */     //   387	13	12	$i$a$-cache-Transition$animateTo$1	I
/*      */     //   410	11	13	value$iv	Ljava/lang/Object;
/*      */     //   364	63	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   361	66	10	it$iv	Ljava/lang/Object;
/*      */     //   352	77	9	$i$f$cache	I
/*      */     //   349	80	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   349	80	8	invalid$iv	Z
/*      */     //   307	142	5	coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*      */     //   20	480	4	$dirty	I
/*      */     //   0	500	0	this	Landroidx/compose/animation/core/Transition;
/*      */     //   0	500	1	targetState	Ljava/lang/Object;
/*      */     //   0	500	2	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   0	500	3	$changed	I }
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\0020\001\"\004\b\000\020\002*\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "S", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}) @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$animateTo$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,2186:1\n63#2,5:2187\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$animateTo$1$1\n*L\n1238#1:2187,5\n*E\n"}) static final class Transition$animateTo$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
/*      */     @NotNull public final DisposableEffectResult invoke(@NotNull DisposableEffectScope $this$DisposableEffect) { Intrinsics.checkNotNullParameter($this$DisposableEffect, "$this$DisposableEffect");
/*      */       BuildersKt.launch$default(this.$coroutineScope, null, CoroutineStart.UNDISPATCHED, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { float F$0; int label;
/*      */             @Nullable
/*      */             public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*      */               //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*      */               //   3: astore #4
/*      */               //   5: aload_0
/*      */               //   6: getfield label : I
/*      */               //   9: tableswitch default -> 133, 0 -> 32, 1 -> 107
/*      */               //   32: aload_1
/*      */               //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */               //   36: aload_0
/*      */               //   37: getfield L$0 : Ljava/lang/Object;
/*      */               //   40: checkcast kotlinx/coroutines/CoroutineScope
/*      */               //   43: astore_2
/*      */               //   44: aload_2
/*      */               //   45: invokeinterface getCoroutineContext : ()Lkotlin/coroutines/CoroutineContext;
/*      */               //   50: invokestatic getDurationScale : (Lkotlin/coroutines/CoroutineContext;)F
/*      */               //   53: fstore_3
/*      */               //   54: aload_2
/*      */               //   55: invokestatic isActive : (Lkotlinx/coroutines/CoroutineScope;)Z
/*      */               //   58: ifeq -> 129
/*      */               //   61: new androidx/compose/animation/core/Transition$animateTo$1$1$1$1
/*      */               //   64: dup
/*      */               //   65: aload_0
/*      */               //   66: getfield this$0 : Landroidx/compose/animation/core/Transition;
/*      */               //   69: fload_3
/*      */               //   70: invokespecial <init> : (Landroidx/compose/animation/core/Transition;F)V
/*      */               //   73: checkcast kotlin/jvm/functions/Function1
/*      */               //   76: aload_0
/*      */               //   77: checkcast kotlin/coroutines/Continuation
/*      */               //   80: aload_0
/*      */               //   81: aload_2
/*      */               //   82: putfield L$0 : Ljava/lang/Object;
/*      */               //   85: aload_0
/*      */               //   86: fload_3
/*      */               //   87: putfield F$0 : F
/*      */               //   90: aload_0
/*      */               //   91: iconst_1
/*      */               //   92: putfield label : I
/*      */               //   95: invokestatic withFrameNanos : (Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */               //   98: dup
/*      */               //   99: aload #4
/*      */               //   101: if_acmpne -> 125
/*      */               //   104: aload #4
/*      */               //   106: areturn
/*      */               //   107: aload_0
/*      */               //   108: getfield F$0 : F
/*      */               //   111: fstore_3
/*      */               //   112: aload_0
/*      */               //   113: getfield L$0 : Ljava/lang/Object;
/*      */               //   116: checkcast kotlinx/coroutines/CoroutineScope
/*      */               //   119: astore_2
/*      */               //   120: aload_1
/*      */               //   121: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */               //   124: aload_1
/*      */               //   125: pop
/*      */               //   126: goto -> 54
/*      */               //   129: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */               //   132: areturn
/*      */               //   133: new java/lang/IllegalStateException
/*      */               //   136: dup
/*      */               //   137: ldc 'call to 'resume' before 'invoke' with coroutine'
/*      */               //   139: invokespecial <init> : (Ljava/lang/String;)V
/*      */               //   142: athrow
/*      */               // Line number table:
/*      */               //   Java source line number -> byte code offset
/*      */               //   #1225	-> 3
/*      */               //   #1226	-> 44
/*      */               //   #1227	-> 54
/*      */               //   #1228	-> 61
/*      */               //   #1225	-> 104
/*      */               //   #1228	-> 125
/*      */               //   #1237	-> 129
/*      */               //   #1225	-> 133
/*      */               // Local variable table:
/*      */               //   start	length	slot	name	descriptor
/*      */               //   44	63	2	$this$launch	Lkotlinx/coroutines/CoroutineScope;
/*      */               //   120	13	2	$this$launch	Lkotlinx/coroutines/CoroutineScope;
/*      */               //   54	53	3	durationScale	F
/*      */               //   112	21	3	durationScale	F
/*      */               //   36	97	0	this	Landroidx/compose/animation/core/Transition$animateTo$1$1$1;
/*      */               //   36	97	1	$result	Ljava/lang/Object; }
/*      */             @NotNull
/*      */             public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = new Function2<>(Transition.this, $completion);
/*      */               function2.L$0 = value;
/*      */               return (Continuation)function2; }
/*      */             @Nullable
/*      */             public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*      */           1, null);
/*      */       DisposableEffectScope this_$iv = $this$DisposableEffect;
/*      */       int $i$f$onDispose = 0;
/*      */       return new Transition$animateTo$1$1$invoke$$inlined$onDispose$1(); }
/*      */     Transition$animateTo$1$1(Transition<S> $receiver) { super(1); } }
/*      */   public final void seekAnimations$animation_core(long playTimeNanos) { if (getStartTimeNanos$animation_core() == Long.MIN_VALUE)
/*      */       setStartTimeNanos$animation_core(playTimeNanos); 
/*      */     setPlayTimeNanos(playTimeNanos);
/*      */     setUpdateChildrenNeeded(false);
/*      */     List $this$fastForEach$iv = (List)this._animations;
/*      */     int $i$f$fastForEach = 0;
/* 2300 */     int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 2301 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 2302 */       TransitionAnimationState it = (TransitionAnimationState)item$iv; int $i$a$-fastForEach-Transition$seekAnimations$1 = 0; it.seekTo$animation_core(playTimeNanos);
/*      */     } 
/*      */     $this$fastForEach$iv = (List)this._transitions;
/*      */     $i$f$fastForEach = 0;
/* 2306 */     index$iv = 0; i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 2307 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 2308 */       Transition it = (Transition)item$iv; int $i$a$-fastForEach-Transition$seekAnimations$2 = 0; if (!Intrinsics.areEqual(it.getTargetState(), it.getCurrentState()))
/*      */         it.seekAnimations$animation_core(playTimeNanos); 
/*      */     }  } public final void setInitialAnimations$animation_core(@NotNull SeekableTransitionState.SeekingAnimationState animationState) { Intrinsics.checkNotNullParameter(animationState, "animationState"); List $this$fastForEach$iv = (List)this._animations;
/*      */     int $i$f$fastForEach = 0;
/* 2312 */     int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 2313 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 2314 */       TransitionAnimationState it = (TransitionAnimationState)item$iv; int $i$a$-fastForEach-Transition$setInitialAnimations$1 = 0; it.setInitialValueAnimation$animation_core(animationState);
/*      */     } 
/*      */     $this$fastForEach$iv = (List)this._transitions;
/*      */     $i$f$fastForEach = 0;
/* 2318 */     index$iv = 0; i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 2319 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 2320 */       Transition it = (Transition)item$iv; int $i$a$-fastForEach-Transition$setInitialAnimations$2 = 0;
/*      */       it.setInitialAnimations$animation_core(animationState);
/*      */     }  } public final void resetAnimationFraction$animation_core(float fraction) { List $this$fastForEach$iv = (List)this._animations;
/*      */     int $i$f$fastForEach = 0;
/* 2324 */     int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 2325 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 2326 */       TransitionAnimationState it = (TransitionAnimationState)item$iv; int $i$a$-fastForEach-Transition$resetAnimationFraction$1 = 0; it.resetAnimationValue$animation_core(fraction);
/*      */     } 
/*      */     $this$fastForEach$iv = (List)this._transitions;
/*      */     $i$f$fastForEach = 0;
/* 2330 */     index$iv = 0; i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 2331 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 2332 */       Transition it = (Transition)item$iv; int $i$a$-fastForEach-Transition$resetAnimationFraction$2 = 0;
/*      */       it.resetAnimationFraction$animation_core(fraction);
/*      */     }  } public final void clearInitialAnimations$animation_core() { List $this$fastForEach$iv = (List)this._animations;
/*      */     int $i$f$fastForEach = 0;
/* 2336 */     int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 2337 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 2338 */       TransitionAnimationState it = (TransitionAnimationState)item$iv; int $i$a$-fastForEach-Transition$clearInitialAnimations$1 = 0; it.clearInitialAnimation$animation_core();
/*      */     } 
/*      */     $this$fastForEach$iv = (List)this._transitions;
/*      */     $i$f$fastForEach = 0;
/* 2342 */     index$iv = 0; i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 2343 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 2344 */       Transition it = (Transition)item$iv; int $i$a$-fastForEach-Transition$clearInitialAnimations$2 = 0;
/*      */       it.clearInitialAnimations$animation_core();
/*      */     }  } public final void updateInitialValues$animation_core() { List $this$fastForEach$iv = (List)this._animations;
/*      */     int $i$f$fastForEach = 0;
/* 2348 */     int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 2349 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 2350 */       TransitionAnimationState it = (TransitionAnimationState)item$iv; int $i$a$-fastForEach-Transition$updateInitialValues$1 = 0; it.updateInitialValue$animation_core();
/*      */     } 
/*      */     $this$fastForEach$iv = (List)this._transitions;
/*      */     $i$f$fastForEach = 0;
/* 2354 */     index$iv = 0; i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 2355 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 2356 */       Transition it = (Transition)item$iv; int $i$a$-fastForEach-Transition$updateInitialValues$2 = 0; it.updateInitialValues$animation_core();
/*      */     }  } @NotNull public String toString() { List<TransitionAnimationState<?, ?>> list1 = getAnimations();
/*      */     Object initial$iv = "Transition animation values: ";
/*      */     int $i$f$fastFold = 0;
/* 2360 */     Object accumulator$iv = null; accumulator$iv = initial$iv;
/* 2361 */     List<TransitionAnimationState<?, ?>> $this$fastForEach$iv$iv = list1; int $i$f$fastForEach = 0;
/*      */     
/* 2363 */     int index$iv$iv = 0, i = $this$fastForEach$iv$iv.size(); if (index$iv$iv < i) {
/* 2364 */       Object<?, ?> item$iv$iv = (Object<?, ?>)$this$fastForEach$iv$iv.get(index$iv$iv);
/* 2365 */       Object<?, ?> e$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastFold$2$iv = 0;
/* 2366 */       TransitionAnimationState transitionAnimationState = (TransitionAnimationState)e$iv; Object object = accumulator$iv; int $i$a$-fastFold-Transition$toString$1 = 0; accumulator$iv = object + transitionAnimationState + ", ";
/*      */     } 
/*      */     
/* 2369 */     return (String)accumulator$iv; } private final void onChildAnimationUpdated() { List $this$fastForEach$iv; int index$iv, i; long maxDurationNanos; setUpdateChildrenNeeded(true); if (isSeeking())
/*      */     { maxDurationNanos = 0L; $this$fastForEach$iv = (List)this._animations; int $i$f$fastForEach = 0;
/* 2371 */       index$iv = 0; i = $this$fastForEach$iv.size(); } else { return; }  if (index$iv < i) {
/* 2372 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 2373 */       TransitionAnimationState it = (TransitionAnimationState)item$iv; int $i$a$-fastForEach-Transition$onChildAnimationUpdated$1 = 0;
/*      */       maxDurationNanos = Math.max(maxDurationNanos, it.getDurationNanos$animation_core());
/*      */       it.seekTo$animation_core(this.lastSeekedTimeNanos);
/*      */     } 
/*      */     setUpdateChildrenNeeded(false); }
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000^\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\007\n\002\030\002\n\002\020\t\n\002\b\t\n\002\030\002\n\002\b\005\n\002\020\013\n\002\b\t\n\002\020\007\n\002\b\027\n\002\020\002\n\002\b\034\b\004\030\000*\004\b\001\020\001*\b\b\002\020\002*\0020\0032\b\022\004\022\002H\0010\004B3\b\000\022\006\020\005\032\0028\001\022\006\020\006\032\0028\002\022\022\020\007\032\016\022\004\022\0028\001\022\004\022\0028\0020\b\022\006\020\t\032\0020\n¢\006\002\020\013J\r\020O\032\0020PH\000¢\006\002\bQJ\035\020R\032\0020P2\006\020S\032\0020\0362\006\020T\032\0020.H\000¢\006\002\bUJ\r\020V\032\0020PH\000¢\006\002\bWJ\025\020X\032\0020P2\006\020Y\032\00208H\000¢\006\002\bZJ\025\020[\032\0020P2\006\020S\032\0020\036H\000¢\006\002\b\\J\025\020]\032\0020P2\006\020^\032\0020(H\000¢\006\002\b_J\b\020`\032\0020\nH\026J!\020a\032\0020P2\b\b\002\020\005\032\0028\0012\b\b\002\020b\032\0020.H\002¢\006\002\020cJ-\020d\032\0020P2\006\020\005\032\0028\0012\006\020@\032\0028\0012\f\020\026\032\b\022\004\022\0028\0010\025H\000¢\006\004\be\020fJ\r\020g\032\0020PH\000¢\006\002\bhJ%\020i\032\0020P2\006\020@\032\0028\0012\f\020\026\032\b\022\004\022\0028\0010\025H\000¢\006\004\bj\020kRC\020\016\032\016\022\004\022\0028\001\022\004\022\0028\0020\r2\022\020\f\032\016\022\004\022\0028\001\022\004\022\0028\0020\r8F@BX\002¢\006\022\n\004\b\023\020\024\032\004\b\017\020\020\"\004\b\021\020\022R7\020\026\032\b\022\004\022\0028\0010\0252\f\020\f\032\b\022\004\022\0028\0010\0258F@BX\002¢\006\022\n\004\b\033\020\024\032\004\b\027\020\030\"\004\b\031\020\032R\024\020\034\032\b\022\004\022\0028\0010\035X\004¢\006\002\n\000R+\020\037\032\0020\0362\006\020\f\032\0020\0368@@@X\002¢\006\022\n\004\b$\020%\032\004\b \020!\"\004\b\"\020#R\034\020&\032\020\022\004\022\0028\001\022\004\022\0028\002\030\0010\rX\016¢\006\002\n\000R\034\020'\032\004\030\0010(X\016¢\006\016\n\000\032\004\b)\020*\"\004\b+\020,R\024\020-\032\b\022\004\022\0028\0010\025X\004¢\006\002\n\000R+\020/\032\0020.2\006\020\f\032\0020.8@@@X\002¢\006\022\n\004\b4\020\024\032\004\b0\0201\"\004\b2\0203R\016\0205\032\0020.X\016¢\006\002\n\000R\021\020\t\032\0020\n¢\006\b\n\000\032\004\b6\0207R+\0209\032\002082\006\020\f\032\002088@@@X\002¢\006\022\n\004\b>\020?\032\004\b:\020;\"\004\b<\020=R+\020@\032\0028\0012\006\020\f\032\0028\0018B@BX\002¢\006\022\n\004\bE\020\024\032\004\bA\020B\"\004\bC\020DR\035\020\007\032\016\022\004\022\0028\001\022\004\022\0028\0020\b¢\006\b\n\000\032\004\bF\020GR\016\020H\032\0020.X\016¢\006\002\n\000R+\020I\032\0028\0012\006\020\f\032\0028\0018V@PX\002¢\006\022\n\004\bL\020\024\032\004\bJ\020B\"\004\bK\020DR\020\020M\032\0028\002X\016¢\006\004\n\002\020N¨\006l"}, d2 = {"Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/runtime/State;", "initialValue", "initialVelocityVector", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "label", "", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;)V", "<set-?>", "Landroidx/compose/animation/core/TargetBasedAnimation;", "animation", "getAnimation", "()Landroidx/compose/animation/core/TargetBasedAnimation;", "setAnimation", "(Landroidx/compose/animation/core/TargetBasedAnimation;)V", "animation$delegate", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "getAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "setAnimationSpec", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "animationSpec$delegate", "defaultSpring", "Landroidx/compose/animation/core/SpringSpec;", "", "durationNanos", "getDurationNanos$animation_core", "()J", "setDurationNanos$animation_core", "(J)V", "durationNanos$delegate", "Landroidx/compose/runtime/MutableLongState;", "initialValueAnimation", "initialValueState", "Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "getInitialValueState$animation_core", "()Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;", "setInitialValueState$animation_core", "(Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;)V", "interruptionSpec", "", "isFinished", "isFinished$animation_core", "()Z", "setFinished$animation_core", "(Z)V", "isFinished$delegate", "isSeeking", "getLabel", "()Ljava/lang/String;", "", "resetSnapValue", "getResetSnapValue$animation_core", "()F", "setResetSnapValue$animation_core", "(F)V", "resetSnapValue$delegate", "Landroidx/compose/runtime/MutableFloatState;", "targetValue", "getTargetValue", "()Ljava/lang/Object;", "setTargetValue", "(Ljava/lang/Object;)V", "targetValue$delegate", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "useOnlyInitialValue", "value", "getValue", "setValue$animation_core", "value$delegate", "velocityVector", "Landroidx/compose/animation/core/AnimationVector;", "clearInitialAnimation", "", "clearInitialAnimation$animation_core", "onPlayTimeChanged", "playTimeNanos", "scaleToEnd", "onPlayTimeChanged$animation_core", "resetAnimation", "resetAnimation$animation_core", "resetAnimationValue", "fraction", "resetAnimationValue$animation_core", "seekTo", "seekTo$animation_core", "setInitialValueAnimation", "animationState", "setInitialValueAnimation$animation_core", "toString", "updateAnimation", "isInterrupted", "(Ljava/lang/Object;Z)V", "updateInitialAndTargetValue", "updateInitialAndTargetValue$animation_core", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "updateInitialValue", "updateInitialValue$animation_core", "updateTargetValue", "updateTargetValue$animation_core", "(Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "animation-core"})
/*      */   @Stable
/*      */   @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n*L\n1#1,2186:1\n81#2:2187\n107#2,2:2188\n81#2:2190\n107#2,2:2191\n81#2:2193\n107#2,2:2194\n81#2:2196\n107#2,2:2197\n81#2:2202\n107#2,2:2203\n79#3:2199\n112#3,2:2200\n78#4:2205\n111#4,2:2206\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n*L\n1348#1:2187\n1348#1:2188,2\n1356#1:2190\n1356#1:2191,2\n1363#1:2193\n1363#1:2194,2\n1374#1:2196\n1374#1:2197,2\n1388#1:2202\n1388#1:2203,2\n1375#1:2199\n1375#1:2200,2\n1391#1:2205\n1391#1:2206,2\n*E\n"})
/*      */   public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {
/*      */     @NotNull
/*      */     private final TwoWayConverter<T, V> typeConverter;
/*      */     @NotNull
/*      */     private final String label;
/*      */     @NotNull
/*      */     private final MutableState targetValue$delegate;
/*      */     @NotNull
/*      */     private final SpringSpec<T> defaultSpring;
/*      */     @NotNull
/*      */     private final MutableState animationSpec$delegate;
/*      */     @NotNull
/*      */     private final MutableState animation$delegate;
/*      */     @Nullable
/*      */     private SeekableTransitionState.SeekingAnimationState initialValueState;
/*      */     @Nullable
/*      */     private TargetBasedAnimation<T, V> initialValueAnimation;
/*      */     @NotNull
/*      */     private final MutableState isFinished$delegate;
/*      */     @NotNull
/*      */     private final MutableFloatState resetSnapValue$delegate;
/*      */     private boolean useOnlyInitialValue;
/*      */     @NotNull
/*      */     private final MutableState value$delegate;
/*      */     @NotNull
/*      */     private V velocityVector;
/*      */     @NotNull
/*      */     private final MutableLongState durationNanos$delegate;
/*      */     private boolean isSeeking;
/*      */     @NotNull
/*      */     private final FiniteAnimationSpec<T> interruptionSpec;
/*      */     
/*      */     public TransitionAnimationState(@NotNull Object initialValue, @NotNull AnimationVector initialVelocityVector, @NotNull TwoWayConverter<T, V> typeConverter, String label) {
/*      */       this.typeConverter = typeConverter;
/*      */       this.label = label;
/*      */       this.targetValue$delegate = SnapshotStateKt.mutableStateOf$default(initialValue, null, 2, null);
/*      */       this.defaultSpring = AnimationSpecKt.spring$default(0.0F, 0.0F, null, 7, null);
/*      */       this.animationSpec$delegate = SnapshotStateKt.mutableStateOf$default(this.defaultSpring, null, 2, null);
/*      */       this.animation$delegate = SnapshotStateKt.mutableStateOf$default(new TargetBasedAnimation<>(getAnimationSpec(), this.typeConverter, (T)initialValue, getTargetValue(), (V)initialVelocityVector), null, 2, null);
/*      */       this.isFinished$delegate = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(true), null, 2, null);
/*      */       this.resetSnapValue$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(-1.0F);
/*      */       this.value$delegate = SnapshotStateKt.mutableStateOf$default(initialValue, null, 2, null);
/*      */       this.velocityVector = (V)initialVelocityVector;
/*      */       this.durationNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(getAnimation().getDurationNanos());
/*      */       float it = ((Float)VisibilityThresholdsKt.getVisibilityThresholdMap().get(this.typeConverter)).floatValue();
/*      */       int $i$a$-let-Transition$TransitionAnimationState$visibilityThreshold$1 = 0;
/*      */       AnimationVector vector = (AnimationVector)this.typeConverter.getConvertToVector().invoke(initialValue);
/*      */       for (int id = 0, i = vector.getSize$animation_core(); id < i; id++)
/*      */         vector.set$animation_core(id, it); 
/*      */       (Float)VisibilityThresholdsKt.getVisibilityThresholdMap().get(this.typeConverter);
/*      */       Object visibilityThreshold = ((Float)VisibilityThresholdsKt.getVisibilityThresholdMap().get(this.typeConverter) != null) ? this.typeConverter.getConvertFromVector().invoke(vector) : null;
/*      */       this.interruptionSpec = AnimationSpecKt.spring$default(0.0F, 0.0F, visibilityThreshold, 3, null);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final TwoWayConverter<T, V> getTypeConverter() {
/*      */       return this.typeConverter;
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final String getLabel() {
/*      */       return this.label;
/*      */     }
/*      */     
/*      */     private final T getTargetValue() {
/*      */       State state = (State)this.targetValue$delegate;
/*      */       KProperty property$iv = null;
/*      */       int $i$f$getValue = 0;
/*      */       return (T)state.getValue();
/*      */     }
/*      */     
/*      */     private final void setTargetValue(Object <set-?>) {
/*      */       MutableState mutableState = this.targetValue$delegate;
/*      */       KProperty property$iv = null;
/*      */       int $i$f$setValue = 0;
/*      */       mutableState.setValue(<set-?>);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final FiniteAnimationSpec<T> getAnimationSpec() {
/*      */       State state = (State)this.animationSpec$delegate;
/*      */       KProperty property$iv = null;
/*      */       int $i$f$getValue = 0;
/*      */       return (FiniteAnimationSpec<T>)state.getValue();
/*      */     }
/*      */     
/*      */     private final void setAnimationSpec(FiniteAnimationSpec <set-?>) {
/*      */       MutableState mutableState = this.animationSpec$delegate;
/*      */       KProperty property$iv = null;
/*      */       int $i$f$setValue = 0;
/*      */       mutableState.setValue(<set-?>);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final TargetBasedAnimation<T, V> getAnimation() {
/*      */       State state = (State)this.animation$delegate;
/*      */       KProperty property$iv = null;
/*      */       int $i$f$getValue = 0;
/*      */       return (TargetBasedAnimation<T, V>)state.getValue();
/*      */     }
/*      */     
/*      */     private final void setAnimation(TargetBasedAnimation <set-?>) {
/*      */       MutableState mutableState = this.animation$delegate;
/*      */       KProperty property$iv = null;
/*      */       int $i$f$setValue = 0;
/*      */       mutableState.setValue(<set-?>);
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public final SeekableTransitionState.SeekingAnimationState getInitialValueState$animation_core() {
/*      */       return this.initialValueState;
/*      */     }
/*      */     
/*      */     public final void setInitialValueState$animation_core(@Nullable SeekableTransitionState.SeekingAnimationState <set-?>) {
/*      */       this.initialValueState = <set-?>;
/*      */     }
/*      */     
/*      */     public final boolean isFinished$animation_core() {
/*      */       State state = (State)this.isFinished$delegate;
/*      */       KProperty property$iv = null;
/*      */       int $i$f$getValue = 0;
/*      */       return ((Boolean)state.getValue()).booleanValue();
/*      */     }
/*      */     
/*      */     public final void setFinished$animation_core(boolean <set-?>) {
/*      */       MutableState mutableState = this.isFinished$delegate;
/*      */       Object object = null;
/*      */       Object value$iv = Boolean.valueOf(<set-?>);
/*      */       int $i$f$setValue = 0;
/*      */       mutableState.setValue(value$iv);
/*      */     }
/*      */     
/*      */     public final float getResetSnapValue$animation_core() {
/*      */       FloatState floatState = (FloatState)this.resetSnapValue$delegate;
/*      */       KProperty property$iv = null;
/*      */       int $i$f$getValue = 0;
/*      */       return floatState.getFloatValue();
/*      */     }
/*      */     
/*      */     public final void setResetSnapValue$animation_core(float <set-?>) {
/*      */       MutableFloatState mutableFloatState = this.resetSnapValue$delegate;
/*      */       KProperty property$iv = null;
/*      */       int $i$f$setValue = 0;
/*      */       mutableFloatState.setFloatValue(<set-?>);
/*      */     }
/*      */     
/*      */     public T getValue() {
/*      */       State state = (State)this.value$delegate;
/*      */       KProperty property$iv = null;
/*      */       int $i$f$getValue = 0;
/*      */       return (T)state.getValue();
/*      */     }
/*      */     
/*      */     public void setValue$animation_core(Object <set-?>) {
/*      */       MutableState mutableState = this.value$delegate;
/*      */       KProperty property$iv = null;
/*      */       int $i$f$setValue = 0;
/*      */       mutableState.setValue(<set-?>);
/*      */     }
/*      */     
/*      */     public final long getDurationNanos$animation_core() {
/*      */       LongState longState = (LongState)this.durationNanos$delegate;
/*      */       KProperty property$iv = null;
/*      */       int $i$f$getValue = 0;
/*      */       return longState.getLongValue();
/*      */     }
/*      */     
/*      */     public final void setDurationNanos$animation_core(long <set-?>) {
/*      */       MutableLongState mutableLongState = this.durationNanos$delegate;
/*      */       KProperty property$iv = null;
/*      */       int $i$f$setValue = 0;
/*      */       mutableLongState.setLongValue(<set-?>);
/*      */     }
/*      */     
/*      */     public final void onPlayTimeChanged$animation_core(long playTimeNanos, boolean scaleToEnd) {
/*      */       long playTime = scaleToEnd ? getAnimation().getDurationNanos() : playTimeNanos;
/*      */       setValue$animation_core(getAnimation().getValueFromNanos(playTime));
/*      */       this.velocityVector = getAnimation().getVelocityVectorFromNanos(playTime);
/*      */       if (getAnimation().isFinishedFromNanos(playTime))
/*      */         setFinished$animation_core(true); 
/*      */     }
/*      */     
/*      */     public final void seekTo$animation_core(long playTimeNanos) {
/*      */       if (!((getResetSnapValue$animation_core() == -1.0F) ? 1 : 0))
/*      */         return; 
/*      */       this.isSeeking = true;
/*      */       if (Intrinsics.areEqual(getAnimation().getTargetValue(), getAnimation().getInitialValue())) {
/*      */         setValue$animation_core(getAnimation().getTargetValue());
/*      */       } else {
/*      */         setValue$animation_core(getAnimation().getValueFromNanos(playTimeNanos));
/*      */         this.velocityVector = getAnimation().getVelocityVectorFromNanos(playTimeNanos);
/*      */       } 
/*      */     }
/*      */     
/*      */     public final void updateInitialValue$animation_core() {
/*      */       SeekableTransitionState.SeekingAnimationState animState;
/*      */       TargetBasedAnimation<T, V> animation;
/*      */       if (this.initialValueState == null)
/*      */         return; 
/*      */       if (this.initialValueAnimation == null)
/*      */         return; 
/*      */       long initialPlayTimeNanos = MathKt.roundToLong(animState.getDurationNanos() * animState.getValue());
/*      */       Object initialValue = animation.getValueFromNanos(initialPlayTimeNanos);
/*      */       if (this.useOnlyInitialValue)
/*      */         getAnimation().setMutableTargetValue$animation_core((T)initialValue); 
/*      */       getAnimation().setMutableInitialValue$animation_core((T)initialValue);
/*      */       setDurationNanos$animation_core(getAnimation().getDurationNanos());
/*      */       if (((getResetSnapValue$animation_core() == -2.0F)) || this.useOnlyInitialValue) {
/*      */         setValue$animation_core((T)initialValue);
/*      */       } else {
/*      */         seekTo$animation_core(Transition.this.getPlayTimeNanos());
/*      */       } 
/*      */       if (initialPlayTimeNanos >= animState.getDurationNanos()) {
/*      */         this.initialValueState = null;
/*      */         this.initialValueAnimation = null;
/*      */       } else {
/*      */         animState.setComplete(false);
/*      */       } 
/*      */     }
/*      */     
/*      */     private final void updateAnimation(Object initialValue, boolean isInterrupted) {
/*      */       if (Intrinsics.areEqual((this.initialValueAnimation != null) ? this.initialValueAnimation.getTargetValue() : null, getTargetValue())) {
/*      */         setAnimation(new TargetBasedAnimation<>(this.interruptionSpec, this.typeConverter, (T)initialValue, (T)initialValue, AnimationVectorsKt.newInstance(this.velocityVector)));
/*      */         this.useOnlyInitialValue = true;
/*      */         setDurationNanos$animation_core(getAnimation().getDurationNanos());
/*      */         return;
/*      */       } 
/*      */       FiniteAnimationSpec<T> specWithoutDelay = (isInterrupted && !this.isSeeking) ? ((getAnimationSpec() instanceof SpringSpec) ? getAnimationSpec() : this.interruptionSpec) : getAnimationSpec();
/*      */       AnimationSpec<T> spec = (Transition.this.getPlayTimeNanos() <= 0L) ? specWithoutDelay : AnimationSpecKt.<T>delayed(specWithoutDelay, Transition.this.getPlayTimeNanos());
/*      */       setAnimation(new TargetBasedAnimation<>(spec, this.typeConverter, (T)initialValue, getTargetValue(), this.velocityVector));
/*      */       setDurationNanos$animation_core(getAnimation().getDurationNanos());
/*      */       this.useOnlyInitialValue = false;
/*      */       Transition.this.onChildAnimationUpdated();
/*      */     }
/*      */     
/*      */     public final void resetAnimation$animation_core() {
/*      */       setResetSnapValue$animation_core(-2.0F);
/*      */     }
/*      */     
/*      */     public final void resetAnimationValue$animation_core(float fraction) {
/*      */       if (((fraction == -4.0F)) || ((fraction == -5.0F))) {
/*      */         TargetBasedAnimation<T, V> initAnim = this.initialValueAnimation;
/*      */         if (initAnim != null) {
/*      */           getAnimation().setMutableInitialValue$animation_core(initAnim.getTargetValue());
/*      */           this.initialValueState = null;
/*      */           this.initialValueAnimation = null;
/*      */         } 
/*      */         Object animationValue = ((fraction == -4.0F)) ? getAnimation().getInitialValue() : getAnimation().getTargetValue();
/*      */         getAnimation().setMutableInitialValue$animation_core((T)animationValue);
/*      */         getAnimation().setMutableTargetValue$animation_core((T)animationValue);
/*      */         setValue$animation_core((T)animationValue);
/*      */         setDurationNanos$animation_core(getAnimation().getDurationNanos());
/*      */       } else {
/*      */         setResetSnapValue$animation_core(fraction);
/*      */       } 
/*      */     }
/*      */     
/*      */     public final void setInitialValueAnimation$animation_core(@NotNull SeekableTransitionState.SeekingAnimationState animationState) {
/*      */       Intrinsics.checkNotNullParameter(animationState, "animationState");
/*      */       if (!Intrinsics.areEqual(getAnimation().getTargetValue(), getAnimation().getInitialValue())) {
/*      */         this.initialValueAnimation = getAnimation();
/*      */         this.initialValueState = animationState;
/*      */       } 
/*      */       setAnimation(new TargetBasedAnimation<>(this.interruptionSpec, this.typeConverter, getValue(), getValue(), AnimationVectorsKt.newInstance(this.velocityVector)));
/*      */       setDurationNanos$animation_core(getAnimation().getDurationNanos());
/*      */       this.useOnlyInitialValue = true;
/*      */     }
/*      */     
/*      */     public final void clearInitialAnimation$animation_core() {
/*      */       this.initialValueAnimation = null;
/*      */       this.initialValueState = null;
/*      */       this.useOnlyInitialValue = false;
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public String toString() {
/*      */       return "current value: " + getValue() + ", target: " + getTargetValue() + ", spec: " + getAnimationSpec();
/*      */     }
/*      */     
/*      */     public final void updateTargetValue$animation_core(Object targetValue, @NotNull FiniteAnimationSpec<T> animationSpec) {
/*      */       Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
/*      */       if (this.useOnlyInitialValue)
/*      */         if (Intrinsics.areEqual(targetValue, (this.initialValueAnimation != null) ? this.initialValueAnimation.getTargetValue() : null))
/*      */           return;  
/*      */       if (Intrinsics.areEqual(getTargetValue(), targetValue) && ((getResetSnapValue$animation_core() == -1.0F)))
/*      */         return; 
/*      */       setTargetValue((T)targetValue);
/*      */       setAnimationSpec(animationSpec);
/*      */       Object initialValue = ((getResetSnapValue$animation_core() == -3.0F)) ? targetValue : getValue();
/*      */       updateAnimation((T)initialValue, !isFinished$animation_core());
/*      */       setFinished$animation_core((getResetSnapValue$animation_core() == -3.0F));
/*      */       if (getResetSnapValue$animation_core() >= 0.0F) {
/*      */         long duration = getAnimation().getDurationNanos();
/*      */         setValue$animation_core(getAnimation().getValueFromNanos((long)((float)duration * getResetSnapValue$animation_core())));
/*      */       } else if ((getResetSnapValue$animation_core() == -3.0F)) {
/*      */         setValue$animation_core((T)targetValue);
/*      */       } 
/*      */       this.useOnlyInitialValue = false;
/*      */       setResetSnapValue$animation_core(-1.0F);
/*      */     }
/*      */     
/*      */     public final void updateInitialAndTargetValue$animation_core(Object initialValue, Object targetValue, @NotNull FiniteAnimationSpec<T> animationSpec) {
/*      */       Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
/*      */       setTargetValue((T)targetValue);
/*      */       setAnimationSpec(animationSpec);
/*      */       if (Intrinsics.areEqual(getAnimation().getInitialValue(), initialValue) && Intrinsics.areEqual(getAnimation().getTargetValue(), targetValue))
/*      */         return; 
/*      */       updateAnimation$default(this, initialValue, false, 2, null);
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\b\002\030\000*\004\b\001\020\0012\b\022\004\022\002H\0010\002B\025\022\006\020\003\032\0028\001\022\006\020\004\032\0028\001¢\006\002\020\005J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rH\002J\b\020\016\032\0020\017H\026R\026\020\003\032\0028\001X\004¢\006\n\n\002\020\b\032\004\b\006\020\007R\026\020\004\032\0028\001X\004¢\006\n\n\002\020\b\032\004\b\t\020\007¨\006\020"}, d2 = {"Landroidx/compose/animation/core/Transition$SegmentImpl;", "S", "Landroidx/compose/animation/core/Transition$Segment;", "initialState", "targetState", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getInitialState", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getTargetState", "equals", "", "other", "", "hashCode", "", "animation-core"})
/*      */   private static final class SegmentImpl<S> implements Segment<S> {
/*      */     private final S initialState;
/*      */     private final S targetState;
/*      */     
/*      */     public SegmentImpl(Object initialState, Object targetState) {
/*      */       this.initialState = (S)initialState;
/*      */       this.targetState = (S)targetState;
/*      */     }
/*      */     
/*      */     public S getInitialState() {
/*      */       return this.initialState;
/*      */     }
/*      */     
/*      */     public S getTargetState() {
/*      */       return this.targetState;
/*      */     }
/*      */     
/*      */     public boolean equals(@Nullable Object other) {
/*      */       return (other instanceof Transition.Segment && Intrinsics.areEqual(getInitialState(), ((Transition.Segment)other).getInitialState()) && Intrinsics.areEqual(getTargetState(), ((Transition.Segment)other).getTargetState()));
/*      */     }
/*      */     
/*      */     public int hashCode() {
/*      */       getInitialState();
/*      */       getTargetState();
/*      */       return ((getInitialState() != null) ? getInitialState().hashCode() : 0) * 31 + ((getTargetState() != null) ? getTargetState().hashCode() : 0);
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\000\n\002\020\000\n\002\b\006\n\002\020\013\n\002\b\002\bf\030\000*\004\b\001\020\0012\0020\002J\032\020\b\032\0020\t*\0028\0012\006\020\006\032\0028\001H\004¢\006\002\020\nR\022\020\003\032\0028\001X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0028\001X¦\004¢\006\006\032\004\b\007\020\005ø\001\000\002\006\n\004\b!0\001¨\006\013À\006\003"}, d2 = {"Landroidx/compose/animation/core/Transition$Segment;", "S", "", "initialState", "getInitialState", "()Ljava/lang/Object;", "targetState", "getTargetState", "isTransitioningTo", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "animation-core"})
/*      */   public static interface Segment<S> {
/*      */     @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*      */     public static final class DefaultImpls {
/*      */       @Deprecated
/*      */       public static <S> boolean isTransitioningTo(@NotNull Transition.Segment $this, Object $receiver, Object targetState) {
/*      */         return Transition.Segment.access$isTransitioningTo$jd($this, $receiver, targetState);
/*      */       }
/*      */     }
/*      */     
/*      */     default boolean isTransitioningTo(Object $this$isTransitioningTo, Object targetState) {
/*      */       return (Intrinsics.areEqual($this$isTransitioningTo, getInitialState()) && Intrinsics.areEqual(targetState, getTargetState()));
/*      */     }
/*      */     
/*      */     S getTargetState();
/*      */     
/*      */     S getInitialState();
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\f\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\003\b\004\030\000*\004\b\001\020\001*\b\b\002\020\002*\0020\0032\0020\004:\001&B#\b\000\022\022\020\005\032\016\022\004\022\0028\001\022\004\022\0028\0020\006\022\006\020\007\032\0020\b¢\006\002\020\tJT\020\030\032\b\022\004\022\0028\0010\0312#\020\032\032\037\022\n\022\b\022\004\022\0028\0000\034\022\n\022\b\022\004\022\0028\0010\0350\033¢\006\002\b\0362!\020\037\032\035\022\023\022\0218\000¢\006\f\b \022\b\b!\022\004\b\b(\"\022\004\022\0028\0010\033J\r\020#\032\0020$H\000¢\006\002\b%R{\020\r\032*\022\004\022\0028\001\022\004\022\0028\002\030\0010\013R\030\022\004\022\0028\001\022\004\022\0028\0020\000R\b\022\004\022\0028\0000\f2.\020\n\032*\022\004\022\0028\001\022\004\022\0028\002\030\0010\013R\030\022\004\022\0028\001\022\004\022\0028\0020\000R\b\022\004\022\0028\0000\f8@@@X\002¢\006\022\n\004\b\022\020\023\032\004\b\016\020\017\"\004\b\020\020\021R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\024\020\025R\035\020\005\032\016\022\004\022\0028\001\022\004\022\0028\0020\006¢\006\b\n\000\032\004\b\026\020\027¨\006'"}, d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "label", "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;)V", "<set-?>", "Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "Landroidx/compose/animation/core/Transition;", "data", "getData$animation_core", "()Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "setData$animation_core", "(Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;)V", "data$delegate", "Landroidx/compose/runtime/MutableState;", "getLabel", "()Ljava/lang/String;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "animate", "Landroidx/compose/runtime/State;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "targetValueByState", "Lkotlin/ParameterName;", "name", "state", "setupSeeking", "", "setupSeeking$animation_core", "DeferredAnimationData", "animation-core"})
/*      */   @RestrictTo({RestrictTo.Scope.LIBRARY})
/*      */   @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2186:1\n81#2:2187\n107#2,2:2188\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n*L\n1670#1:2187\n1670#1:2188,2\n*E\n"})
/*      */   public final class DeferredAnimation<T, V extends AnimationVector> {
/*      */     @NotNull
/*      */     private final TwoWayConverter<T, V> typeConverter;
/*      */     @NotNull
/*      */     private final String label;
/*      */     @NotNull
/*      */     private final MutableState data$delegate;
/*      */     
/*      */     public DeferredAnimation(@NotNull TwoWayConverter<T, V> typeConverter, String label) {
/*      */       this.typeConverter = typeConverter;
/*      */       this.label = label;
/*      */       this.data$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final TwoWayConverter<T, V> getTypeConverter() {
/*      */       return this.typeConverter;
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final String getLabel() {
/*      */       return this.label;
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public final DeferredAnimationData<T, V> getData$animation_core() {
/*      */       State state = (State)this.data$delegate;
/*      */       KProperty property$iv = null;
/*      */       int $i$f$getValue = 0;
/*      */       return (DeferredAnimationData<T, V>)state.getValue();
/*      */     }
/*      */     
/*      */     public final void setData$animation_core(@Nullable DeferredAnimationData <set-?>) {
/*      */       MutableState mutableState = this.data$delegate;
/*      */       KProperty property$iv = null;
/*      */       int $i$f$setValue = 0;
/*      */       mutableState.setValue(<set-?>);
/*      */     }
/*      */     
/*      */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\017\n\002\020\002\n\002\b\002\b\004\030\000*\004\b\003\020\001*\b\b\004\020\002*\0020\0032\b\022\004\022\002H\0010\004Bk\022\034\020\005\032\030\022\004\022\0028\003\022\004\022\0028\0040\006R\b\022\004\022\0028\0000\007\022#\020\b\032\037\022\n\022\b\022\004\022\0028\0000\n\022\n\022\b\022\004\022\0028\0030\0130\t¢\006\002\b\f\022!\020\r\032\035\022\023\022\0218\000¢\006\f\b\016\022\b\b\017\022\004\b\b(\020\022\004\022\0028\0030\t¢\006\002\020\021J\024\020\035\032\0020\0362\f\020\037\032\b\022\004\022\0028\0000\nR'\020\005\032\030\022\004\022\0028\003\022\004\022\0028\0040\006R\b\022\004\022\0028\0000\007¢\006\b\n\000\032\004\b\022\020\023R5\020\r\032\035\022\023\022\0218\000¢\006\f\b\016\022\b\b\017\022\004\b\b(\020\022\004\022\0028\0030\tX\016¢\006\016\n\000\032\004\b\024\020\025\"\004\b\026\020\027R7\020\b\032\037\022\n\022\b\022\004\022\0028\0000\n\022\n\022\b\022\004\022\0028\0030\0130\t¢\006\002\b\fX\016¢\006\016\n\000\032\004\b\030\020\025\"\004\b\031\020\027R\024\020\032\032\0028\0038VX\004¢\006\006\032\004\b\033\020\034¨\006 "}, d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/runtime/State;", "animation", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "Landroidx/compose/animation/core/Transition;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "targetValueByState", "Lkotlin/ParameterName;", "name", "state", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getAnimation", "()Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "getTargetValueByState", "()Lkotlin/jvm/functions/Function1;", "setTargetValueByState", "(Lkotlin/jvm/functions/Function1;)V", "getTransitionSpec", "setTransitionSpec", "value", "getValue", "()Ljava/lang/Object;", "updateAnimationStates", "", "segment", "animation-core"})
/*      */     public final class DeferredAnimationData<T, V extends AnimationVector> implements State<T> {
/*      */       @NotNull
/*      */       private final Transition<S>.TransitionAnimationState<T, V> animation;
/*      */       @NotNull
/*      */       private Function1<? super Transition.Segment<S>, ? extends FiniteAnimationSpec<T>> transitionSpec;
/*      */       @NotNull
/*      */       private Function1<? super S, ? extends T> targetValueByState;
/*      */       
/*      */       public DeferredAnimationData(@NotNull Transition<S>.TransitionAnimationState<T, V> animation, @NotNull Function1<? super Transition.Segment<S>, ? extends FiniteAnimationSpec<T>> transitionSpec, Function1<? super S, ? extends T> targetValueByState) {
/*      */         this.animation = animation;
/*      */         this.transitionSpec = transitionSpec;
/*      */         this.targetValueByState = targetValueByState;
/*      */       }
/*      */       
/*      */       @NotNull
/*      */       public final Transition<S>.TransitionAnimationState<T, V> getAnimation() {
/*      */         return this.animation;
/*      */       }
/*      */       
/*      */       @NotNull
/*      */       public final Function1<Transition.Segment<S>, FiniteAnimationSpec<T>> getTransitionSpec() {
/*      */         return (Function1)this.transitionSpec;
/*      */       }
/*      */       
/*      */       public final void setTransitionSpec(@NotNull Function1<? super Transition.Segment<S>, ? extends FiniteAnimationSpec<T>> <set-?>) {
/*      */         Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*      */         this.transitionSpec = <set-?>;
/*      */       }
/*      */       
/*      */       @NotNull
/*      */       public final Function1<S, T> getTargetValueByState() {
/*      */         return (Function1)this.targetValueByState;
/*      */       }
/*      */       
/*      */       public final void setTargetValueByState(@NotNull Function1<? super S, ? extends T> <set-?>) {
/*      */         Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*      */         this.targetValueByState = <set-?>;
/*      */       }
/*      */       
/*      */       public final void updateAnimationStates(@NotNull Transition.Segment segment) {
/*      */         Intrinsics.checkNotNullParameter(segment, "segment");
/*      */         Object targetValue = this.targetValueByState.invoke(segment.getTargetState());
/*      */         if (Transition.this.isSeeking()) {
/*      */           Object initialValue = this.targetValueByState.invoke(segment.getInitialState());
/*      */           this.animation.updateInitialAndTargetValue$animation_core((T)initialValue, (T)targetValue, (FiniteAnimationSpec<T>)this.transitionSpec.invoke(segment));
/*      */         } else {
/*      */           this.animation.updateTargetValue$animation_core((T)targetValue, (FiniteAnimationSpec<T>)this.transitionSpec.invoke(segment));
/*      */         } 
/*      */       }
/*      */       
/*      */       public T getValue() {
/*      */         updateAnimationStates(Transition.this.getSegment());
/*      */         return this.animation.getValue();
/*      */       }
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final State<T> animate(@NotNull Function1<? super Transition.Segment<S>, ? extends FiniteAnimationSpec<?>> transitionSpec, @NotNull Function1<? super S, ?> targetValueByState) {
/*      */       Intrinsics.checkNotNullParameter(transitionSpec, "transitionSpec");
/*      */       Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
/*      */       if (getData$animation_core() == null) {
/*      */         getData$animation_core();
/*      */         DeferredAnimationData<Object, AnimationVector> deferredAnimationData2 = new DeferredAnimationData<>(new Transition.TransitionAnimationState<>(targetValueByState.invoke(Transition.this.getCurrentState()), AnimationStateKt.createZeroVectorFrom(this.typeConverter, (T)targetValueByState.invoke(Transition.this.getCurrentState())), this.typeConverter, this.label), transitionSpec, targetValueByState);
/*      */         Transition<S> transition1 = Transition.this;
/*      */         DeferredAnimationData<Object, AnimationVector> $this$animate_u24lambda_u240 = deferredAnimationData2;
/*      */         int $i$a$-apply-Transition$DeferredAnimation$animate$animData$1 = 0;
/*      */         setData$animation_core((DeferredAnimationData)$this$animate_u24lambda_u240);
/*      */         transition1.addAnimation$animation_core($this$animate_u24lambda_u240.getAnimation());
/*      */       } 
/*      */       DeferredAnimationData<Object, AnimationVector> animData = deferredAnimationData2;
/*      */       DeferredAnimationData<Object, AnimationVector> deferredAnimationData1 = animData;
/*      */       Transition<S> transition = Transition.this;
/*      */       DeferredAnimationData<Object, AnimationVector> $this$animate_u24lambda_u241 = deferredAnimationData1;
/*      */       int $i$a$-apply-Transition$DeferredAnimation$animate$1 = 0;
/*      */       $this$animate_u24lambda_u241.setTargetValueByState(targetValueByState);
/*      */       $this$animate_u24lambda_u241.setTransitionSpec((Function1)transitionSpec);
/*      */       $this$animate_u24lambda_u241.updateAnimationStates(transition.getSegment());
/*      */       return deferredAnimationData1;
/*      */     }
/*      */     
/*      */     public final void setupSeeking$animation_core() {
/*      */       DeferredAnimationData<T, V> deferredAnimationData1 = getData$animation_core();
/*      */       Transition<S> transition = Transition.this;
/*      */       DeferredAnimationData<T, V> $this$setupSeeking_u24lambda_u242 = deferredAnimationData1;
/*      */       int $i$a$-apply-Transition$DeferredAnimation$setupSeeking$1 = 0;
/*      */       $this$setupSeeking_u24lambda_u242.getAnimation().updateInitialAndTargetValue$animation_core($this$setupSeeking_u24lambda_u242.getTargetValueByState().invoke(transition.getSegment().getInitialState()), $this$setupSeeking_u24lambda_u242.getTargetValueByState().invoke(transition.getSegment().getTargetState()), (FiniteAnimationSpec)$this$setupSeeking_u24lambda_u242.getTransitionSpec().invoke(transition.getSegment()));
/*      */       getData$animation_core();
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\017\n\002\020\002\n\002\b\002\b\004\030\000*\004\b\003\020\001*\b\b\004\020\002*\0020\0032\b\022\004\022\002H\0010\004Bk\022\034\020\005\032\030\022\004\022\0028\003\022\004\022\0028\0040\006R\b\022\004\022\0028\0000\007\022#\020\b\032\037\022\n\022\b\022\004\022\0028\0000\n\022\n\022\b\022\004\022\0028\0030\0130\t¢\006\002\b\f\022!\020\r\032\035\022\023\022\0218\000¢\006\f\b\016\022\b\b\017\022\004\b\b(\020\022\004\022\0028\0030\t¢\006\002\020\021J\024\020\035\032\0020\0362\f\020\037\032\b\022\004\022\0028\0000\nR'\020\005\032\030\022\004\022\0028\003\022\004\022\0028\0040\006R\b\022\004\022\0028\0000\007¢\006\b\n\000\032\004\b\022\020\023R5\020\r\032\035\022\023\022\0218\000¢\006\f\b\016\022\b\b\017\022\004\b\b(\020\022\004\022\0028\0030\tX\016¢\006\016\n\000\032\004\b\024\020\025\"\004\b\026\020\027R7\020\b\032\037\022\n\022\b\022\004\022\0028\0000\n\022\n\022\b\022\004\022\0028\0030\0130\t¢\006\002\b\fX\016¢\006\016\n\000\032\004\b\030\020\025\"\004\b\031\020\027R\024\020\032\032\0028\0038VX\004¢\006\006\032\004\b\033\020\034¨\006 "}, d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/runtime/State;", "animation", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "Landroidx/compose/animation/core/Transition;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "targetValueByState", "Lkotlin/ParameterName;", "name", "state", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getAnimation", "()Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "getTargetValueByState", "()Lkotlin/jvm/functions/Function1;", "setTargetValueByState", "(Lkotlin/jvm/functions/Function1;)V", "getTransitionSpec", "setTransitionSpec", "value", "getValue", "()Ljava/lang/Object;", "updateAnimationStates", "", "segment", "animation-core"})
/*      */   public final class DeferredAnimationData<T, V extends AnimationVector> implements State<T> {
/*      */     @NotNull
/*      */     private final Transition<S>.TransitionAnimationState<T, V> animation;
/*      */     @NotNull
/*      */     private Function1<? super Transition.Segment<S>, ? extends FiniteAnimationSpec<T>> transitionSpec;
/*      */     @NotNull
/*      */     private Function1<? super S, ? extends T> targetValueByState;
/*      */     
/*      */     public DeferredAnimationData(@NotNull Transition<S>.TransitionAnimationState<T, V> animation, @NotNull Function1<? super Transition.Segment<S>, ? extends FiniteAnimationSpec<T>> transitionSpec, Function1<? super S, ? extends T> targetValueByState) {
/*      */       this.animation = animation;
/*      */       this.transitionSpec = transitionSpec;
/*      */       this.targetValueByState = targetValueByState;
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final Transition<S>.TransitionAnimationState<T, V> getAnimation() {
/*      */       return this.animation;
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final Function1<Transition.Segment<S>, FiniteAnimationSpec<T>> getTransitionSpec() {
/*      */       return (Function1)this.transitionSpec;
/*      */     }
/*      */     
/*      */     public final void setTransitionSpec(@NotNull Function1<? super Transition.Segment<S>, ? extends FiniteAnimationSpec<T>> <set-?>) {
/*      */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*      */       this.transitionSpec = <set-?>;
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final Function1<S, T> getTargetValueByState() {
/*      */       return (Function1)this.targetValueByState;
/*      */     }
/*      */     
/*      */     public final void setTargetValueByState(@NotNull Function1<? super S, ? extends T> <set-?>) {
/*      */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*      */       this.targetValueByState = <set-?>;
/*      */     }
/*      */     
/*      */     public final void updateAnimationStates(@NotNull Transition.Segment segment) {
/*      */       Intrinsics.checkNotNullParameter(segment, "segment");
/*      */       Object targetValue = this.targetValueByState.invoke(segment.getTargetState());
/*      */       if (Transition.this.isSeeking()) {
/*      */         Object initialValue = this.targetValueByState.invoke(segment.getInitialState());
/*      */         this.animation.updateInitialAndTargetValue$animation_core((T)initialValue, (T)targetValue, (FiniteAnimationSpec<T>)this.transitionSpec.invoke(segment));
/*      */       } else {
/*      */         this.animation.updateTargetValue$animation_core((T)targetValue, (FiniteAnimationSpec<T>)this.transitionSpec.invoke(segment));
/*      */       } 
/*      */     }
/*      */     
/*      */     public T getValue() {
/*      */       updateAnimationStates(Transition.this.getSegment());
/*      */       return this.animation.getValue();
/*      */     }
/*      */   }
/*      */   
/*      */   public final void removeAnimation$animation_core(@NotNull DeferredAnimation deferredAnimation) {
/*      */     Intrinsics.checkNotNullParameter(deferredAnimation, "deferredAnimation");
/*      */     TransitionAnimationState<?, ?> it = deferredAnimation.getData$animation_core().getAnimation();
/*      */     int $i$a$-let-Transition$removeAnimation$1 = 0;
/*      */     removeAnimation$animation_core(it);
/*      */     deferredAnimation.getData$animation_core().getAnimation();
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*      */   static final class Transition$animateTo$2 extends Lambda implements Function2<Composer, Integer, Unit> {
/*      */     Transition$animateTo$2(Transition<S> $tmp1_rcvr, Object $targetState, int $$changed) {
/*      */       super(2);
/*      */     }
/*      */     
/*      */     public final void invoke(@Nullable Composer $composer, int $force) {
/*      */       this.$tmp1_rcvr.animateTo$animation_core(this.$targetState, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1));
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\Transition.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */