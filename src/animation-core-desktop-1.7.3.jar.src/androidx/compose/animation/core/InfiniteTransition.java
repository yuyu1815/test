/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.SnapshotStateKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.collection.MutableVector;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.Boxing;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.CoroutineScope;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\b\003\n\002\020\013\n\002\b\r\n\002\020\t\n\000\n\002\020\002\n\002\b\013\b\007\030\0002\0020\001:\001'B\017\b\000\022\006\020\002\032\0020\003¢\006\002\020\004J!\020\034\032\0020\0352\022\020\036\032\016\022\002\b\003\022\002\b\0030\007R\0020\000H\000¢\006\002\b\037J\020\020 \032\0020\0352\006\020!\032\0020\033H\002J!\020\"\032\0020\0352\022\020\036\032\016\022\002\b\003\022\002\b\0030\007R\0020\000H\000¢\006\002\b#J\017\020$\032\0020\035H\001¢\006\004\b%\020&R \020\005\032\024\022\020\022\016\022\002\b\003\022\002\b\0030\007R\0020\0000\006X\004¢\006\002\n\000R#\020\b\032\024\022\020\022\016\022\002\b\003\022\002\b\0030\007R\0020\0000\t8F¢\006\006\032\004\b\n\020\013R+\020\016\032\0020\r2\006\020\f\032\0020\r8B@BX\002¢\006\022\n\004\b\022\020\023\032\004\b\016\020\017\"\004\b\020\020\021R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\024\020\025R+\020\026\032\0020\r2\006\020\f\032\0020\r8B@BX\002¢\006\022\n\004\b\031\020\023\032\004\b\027\020\017\"\004\b\030\020\021R\016\020\032\032\0020\033X\016¢\006\002\n\000¨\006("}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition;", "", "label", "", "(Ljava/lang/String;)V", "_animations", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "animations", "", "getAnimations", "()Ljava/util/List;", "<set-?>", "", "isRunning", "()Z", "setRunning", "(Z)V", "isRunning$delegate", "Landroidx/compose/runtime/MutableState;", "getLabel", "()Ljava/lang/String;", "refreshChildNeeded", "getRefreshChildNeeded", "setRefreshChildNeeded", "refreshChildNeeded$delegate", "startTimeNanos", "", "addAnimation", "", "animation", "addAnimation$animation_core", "onFrame", "playTimeNanos", "removeAnimation", "removeAnimation$animation_core", "run", "run$animation_core", "(Landroidx/compose/runtime/Composer;I)V", "TransitionAnimationState", "animation-core"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,364:1\n1208#2:365\n1187#2,2:366\n81#3:368\n107#3,2:369\n81#3:371\n107#3,2:372\n1225#4,6:374\n1225#4,6:380\n460#5,11:386\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition\n*L\n150#1:365\n150#1:366,2\n151#1:368\n151#1:369,2\n153#1:371\n153#1:372,2\n173#1:374,6\n177#1:380,6\n217#1:386,11\n*E\n"})
/*     */ public final class InfiniteTransition
/*     */ {
/*     */   @NotNull
/*     */   private final String label;
/*     */   @NotNull
/*     */   private final MutableVector<TransitionAnimationState<?, ?>> _animations;
/*     */   @NotNull
/*     */   private final MutableState refreshChildNeeded$delegate;
/*     */   private long startTimeNanos;
/*     */   
/*     */   public InfiniteTransition(@NotNull String label) {
/*  61 */     this.label = label;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 150 */     int $i$f$mutableVectorOf = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 366 */     int capacity$iv$iv = 16, $i$f$MutableVector = 0;
/* 367 */     this._animations = new MutableVector((Object[])new TransitionAnimationState[capacity$iv$iv], 0); this.refreshChildNeeded$delegate = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(false), null, 2, null); this.startTimeNanos = Long.MIN_VALUE; this.isRunning$delegate = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(true), null, 2, null);
/* 368 */   } @NotNull private final MutableState isRunning$delegate; public static final int $stable = 8; @NotNull public final String getLabel() { return this.label; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\007\n\002\020\t\n\002\b\013\n\002\020\002\n\002\b\n\b\004\030\000*\004\b\000\020\001*\b\b\001\020\002*\0020\0032\b\022\004\022\002H\0010\004BA\b\000\022\006\020\005\032\0028\000\022\006\020\006\032\0028\000\022\022\020\007\032\016\022\004\022\0028\000\022\004\022\0028\0010\b\022\f\020\t\032\b\022\004\022\0028\0000\n\022\006\020\013\032\0020\f¢\006\002\020\rJ\025\0200\032\002012\006\0202\032\0020%H\000¢\006\002\b3J\r\0204\032\00201H\000¢\006\002\b5J\r\0206\032\00201H\000¢\006\002\b7J-\0208\032\002012\006\020\005\032\0028\0002\006\020\006\032\0028\0002\f\020\t\032\b\022\004\022\0028\0000\nH\000¢\006\004\b9\020:R<\020\020\032\016\022\004\022\0028\000\022\004\022\0028\0010\0172\022\020\016\032\016\022\004\022\0028\000\022\004\022\0028\0010\017@@X\016¢\006\016\n\000\032\004\b\021\020\022\"\004\b\023\020\024R*\020\t\032\b\022\004\022\0028\0000\n2\f\020\016\032\b\022\004\022\0028\0000\n@BX\016¢\006\b\n\000\032\004\b\025\020\026R\034\020\005\032\0028\000X\016¢\006\020\n\002\020\033\032\004\b\027\020\030\"\004\b\031\020\032R\032\020\034\032\0020\035X\016¢\006\016\n\000\032\004\b\036\020\037\"\004\b \020!R\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\"\020#R\016\020$\032\0020%X\016¢\006\002\n\000R\016\020&\032\0020\035X\016¢\006\002\n\000R\034\020\006\032\0028\000X\016¢\006\020\n\002\020\033\032\004\b'\020\030\"\004\b(\020\032R\035\020\007\032\016\022\004\022\0028\000\022\004\022\0028\0010\b¢\006\b\n\000\032\004\b)\020*R+\020+\032\0028\0002\006\020\016\032\0028\0008V@PX\002¢\006\022\n\004\b.\020/\032\004\b,\020\030\"\004\b-\020\032¨\006;"}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/runtime/State;", "initialValue", "targetValue", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "label", "", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;)V", "<set-?>", "Landroidx/compose/animation/core/TargetBasedAnimation;", "animation", "getAnimation", "()Landroidx/compose/animation/core/TargetBasedAnimation;", "setAnimation$animation_core", "(Landroidx/compose/animation/core/TargetBasedAnimation;)V", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "getInitialValue$animation_core", "()Ljava/lang/Object;", "setInitialValue$animation_core", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "isFinished", "", "isFinished$animation_core", "()Z", "setFinished$animation_core", "(Z)V", "getLabel", "()Ljava/lang/String;", "playTimeNanosOffset", "", "startOnTheNextFrame", "getTargetValue$animation_core", "setTargetValue$animation_core", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", "value", "getValue", "setValue$animation_core", "value$delegate", "Landroidx/compose/runtime/MutableState;", "onPlayTimeChanged", "", "playTimeNanos", "onPlayTimeChanged$animation_core", "reset", "reset$animation_core", "skipToEnd", "skipToEnd$animation_core", "updateValues", "updateValues$animation_core", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;)V", "animation-core"}) @SourceDebugExtension({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,364:1\n81#2:365\n107#2,2:366\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState\n*L\n76#1:365\n76#1:366,2\n*E\n"}) public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> { private T initialValue; private T targetValue; @NotNull private final TwoWayConverter<T, V> typeConverter; @NotNull private final String label; @NotNull private final MutableState value$delegate; @NotNull private AnimationSpec<T> animationSpec; @NotNull private TargetBasedAnimation<T, V> animation; private boolean isFinished; private boolean startOnTheNextFrame; private long playTimeNanosOffset; public TransitionAnimationState(Object initialValue, @NotNull Object targetValue, @NotNull TwoWayConverter<T, V> typeConverter, @NotNull AnimationSpec<T> animationSpec, String label) { this.initialValue = (T)initialValue; this.targetValue = (T)targetValue; this.typeConverter = typeConverter; this.label = label; this.value$delegate = SnapshotStateKt.mutableStateOf$default(this.initialValue, null, 2, null); this.animationSpec = animationSpec; this.animation = new TargetBasedAnimation<>(this.animationSpec, this.typeConverter, this.initialValue, this.targetValue, null, 16, null); } public final T getInitialValue$animation_core() { return this.initialValue; } public final void setInitialValue$animation_core(Object <set-?>) { this.initialValue = (T)<set-?>; } public final T getTargetValue$animation_core() { return this.targetValue; } public final void setTargetValue$animation_core(Object <set-?>) { this.targetValue = (T)<set-?>; } @NotNull public final TwoWayConverter<T, V> getTypeConverter() { return this.typeConverter; } @NotNull public final String getLabel() { return this.label; } public T getValue() { State state = (State)this.value$delegate; KProperty property$iv = null; int $i$f$getValue = 0; return (T)state.getValue(); } public void setValue$animation_core(Object <set-?>) { MutableState mutableState = this.value$delegate; KProperty property$iv = null; int $i$f$setValue = 0; mutableState.setValue(<set-?>); } @NotNull public final AnimationSpec<T> getAnimationSpec() { return this.animationSpec; } @NotNull public final TargetBasedAnimation<T, V> getAnimation() { return this.animation; } public final void setAnimation$animation_core(@NotNull TargetBasedAnimation<T, V> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.animation = <set-?>; } public final boolean isFinished$animation_core() { return this.isFinished; } public final void setFinished$animation_core(boolean <set-?>) { this.isFinished = <set-?>; } public final void updateValues$animation_core(Object initialValue, Object targetValue, @NotNull AnimationSpec<T> animationSpec) { Intrinsics.checkNotNullParameter(animationSpec, "animationSpec"); this.initialValue = (T)initialValue; this.targetValue = (T)targetValue; this.animationSpec = animationSpec; this.animation = new TargetBasedAnimation<>(animationSpec, this.typeConverter, initialValue, targetValue, null, 16, null); InfiniteTransition.this.setRefreshChildNeeded(true); this.isFinished = false; this.startOnTheNextFrame = true; } public final void onPlayTimeChanged$animation_core(long playTimeNanos) { InfiniteTransition.this.setRefreshChildNeeded(false); if (this.startOnTheNextFrame) { this.startOnTheNextFrame = false; this.playTimeNanosOffset = playTimeNanos; }  long playTime = playTimeNanos - this.playTimeNanosOffset; setValue$animation_core(this.animation.getValueFromNanos(playTime)); this.isFinished = this.animation.isFinishedFromNanos(playTime); } public final void skipToEnd$animation_core() { setValue$animation_core(this.animation.getTargetValue()); this.startOnTheNextFrame = true; } public final void reset$animation_core() { this.startOnTheNextFrame = true; } } private final boolean getRefreshChildNeeded() { State state = (State)this.refreshChildNeeded$delegate; KProperty property$iv = null; int $i$f$getValue = 0; return ((Boolean)state.getValue()).booleanValue(); } private final void setRefreshChildNeeded(boolean <set-?>) { MutableState mutableState = this.refreshChildNeeded$delegate; Object object = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 369 */     mutableState.setValue(value$iv); } private final boolean isRunning() { State state = (State)this.isRunning$delegate; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 371 */     return ((Boolean)state.getValue()).booleanValue(); } private final void setRunning(boolean <set-?>) { MutableState mutableState = this.isRunning$delegate; Object object = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 372 */     mutableState.setValue(value$iv); } @NotNull public final List<TransitionAnimationState<?, ?>> getAnimations() { return this._animations.asMutableList(); } public final void addAnimation$animation_core(@NotNull TransitionAnimationState animation) { Intrinsics.checkNotNullParameter(animation, "animation"); this._animations.add(animation); setRefreshChildNeeded(true); }
/*     */   public final void removeAnimation$animation_core(@NotNull TransitionAnimationState animation) { Intrinsics.checkNotNullParameter(animation, "animation"); this._animations.remove(animation); }
/*     */   @Composable public final void run$animation_core(@Nullable Composer $composer, int $changed) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc -318043801
/*     */     //   3: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   8: astore_1
/*     */     //   9: aload_1
/*     */     //   10: ldc 'C(run)172@7001L67,176@7149L1537,176@7128L1558:InfiniteTransition.kt#pdpnli'
/*     */     //   12: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   15: iload_2
/*     */     //   16: istore_3
/*     */     //   17: iload_2
/*     */     //   18: bipush #6
/*     */     //   20: iand
/*     */     //   21: ifne -> 42
/*     */     //   24: iload_3
/*     */     //   25: aload_1
/*     */     //   26: aload_0
/*     */     //   27: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   32: ifeq -> 39
/*     */     //   35: iconst_4
/*     */     //   36: goto -> 40
/*     */     //   39: iconst_2
/*     */     //   40: ior
/*     */     //   41: istore_3
/*     */     //   42: iload_3
/*     */     //   43: iconst_3
/*     */     //   44: iand
/*     */     //   45: iconst_2
/*     */     //   46: if_icmpne -> 58
/*     */     //   49: aload_1
/*     */     //   50: invokeinterface getSkipping : ()Z
/*     */     //   55: ifne -> 297
/*     */     //   58: invokestatic isTraceInProgress : ()Z
/*     */     //   61: ifeq -> 73
/*     */     //   64: ldc -318043801
/*     */     //   66: iload_3
/*     */     //   67: iconst_m1
/*     */     //   68: ldc 'androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)'
/*     */     //   70: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   73: aload_1
/*     */     //   74: ldc 748212685
/*     */     //   76: ldc 'CC(remember):InfiniteTransition.kt#9igjgp'
/*     */     //   78: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   81: aload_1
/*     */     //   82: astore #6
/*     */     //   84: iconst_0
/*     */     //   85: istore #7
/*     */     //   87: iconst_0
/*     */     //   88: istore #8
/*     */     //   90: aload #6
/*     */     //   92: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   97: astore #9
/*     */     //   99: iconst_0
/*     */     //   100: istore #10
/*     */     //   102: aload #9
/*     */     //   104: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   107: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   110: if_acmpne -> 139
/*     */     //   113: iconst_0
/*     */     //   114: istore #11
/*     */     //   116: aconst_null
/*     */     //   117: aconst_null
/*     */     //   118: iconst_2
/*     */     //   119: aconst_null
/*     */     //   120: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   123: astore #11
/*     */     //   125: aload #6
/*     */     //   127: aload #11
/*     */     //   129: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   134: aload #11
/*     */     //   136: goto -> 141
/*     */     //   139: aload #9
/*     */     //   141: nop
/*     */     //   142: nop
/*     */     //   143: nop
/*     */     //   144: checkcast androidx/compose/runtime/MutableState
/*     */     //   147: astore #5
/*     */     //   149: aload_1
/*     */     //   150: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   153: aload #5
/*     */     //   155: astore #4
/*     */     //   157: aload_0
/*     */     //   158: invokespecial isRunning : ()Z
/*     */     //   161: ifne -> 171
/*     */     //   164: aload_0
/*     */     //   165: invokespecial getRefreshChildNeeded : ()Z
/*     */     //   168: ifeq -> 285
/*     */     //   171: aload_0
/*     */     //   172: aload_1
/*     */     //   173: ldc 748218891
/*     */     //   175: ldc 'CC(remember):InfiniteTransition.kt#9igjgp'
/*     */     //   177: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   180: aload_1
/*     */     //   181: astore #6
/*     */     //   183: aload_1
/*     */     //   184: aload_0
/*     */     //   185: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   190: istore #7
/*     */     //   192: iconst_0
/*     */     //   193: istore #8
/*     */     //   195: aload #6
/*     */     //   197: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   202: astore #9
/*     */     //   204: iconst_0
/*     */     //   205: istore #10
/*     */     //   207: iload #7
/*     */     //   209: ifne -> 223
/*     */     //   212: aload #9
/*     */     //   214: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   217: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   220: if_acmpne -> 261
/*     */     //   223: astore #13
/*     */     //   225: iconst_0
/*     */     //   226: istore #11
/*     */     //   228: new androidx/compose/animation/core/InfiniteTransition$run$1$1
/*     */     //   231: dup
/*     */     //   232: aload #4
/*     */     //   234: aload_0
/*     */     //   235: aconst_null
/*     */     //   236: invokespecial <init> : (Landroidx/compose/runtime/MutableState;Landroidx/compose/animation/core/InfiniteTransition;Lkotlin/coroutines/Continuation;)V
/*     */     //   239: checkcast kotlin/jvm/functions/Function2
/*     */     //   242: aload #13
/*     */     //   244: swap
/*     */     //   245: astore #12
/*     */     //   247: aload #6
/*     */     //   249: aload #12
/*     */     //   251: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   256: aload #12
/*     */     //   258: goto -> 263
/*     */     //   261: aload #9
/*     */     //   263: nop
/*     */     //   264: nop
/*     */     //   265: nop
/*     */     //   266: checkcast kotlin/jvm/functions/Function2
/*     */     //   269: astore #5
/*     */     //   271: aload_1
/*     */     //   272: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   275: aload #5
/*     */     //   277: aload_1
/*     */     //   278: bipush #14
/*     */     //   280: iload_3
/*     */     //   281: iand
/*     */     //   282: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   285: invokestatic isTraceInProgress : ()Z
/*     */     //   288: ifeq -> 303
/*     */     //   291: invokestatic traceEventEnd : ()V
/*     */     //   294: goto -> 303
/*     */     //   297: aload_1
/*     */     //   298: invokeinterface skipToGroupEnd : ()V
/*     */     //   303: aload_1
/*     */     //   304: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   309: dup
/*     */     //   310: ifnull -> 333
/*     */     //   313: new androidx/compose/animation/core/InfiniteTransition$run$2
/*     */     //   316: dup
/*     */     //   317: aload_0
/*     */     //   318: iload_2
/*     */     //   319: invokespecial <init> : (Landroidx/compose/animation/core/InfiniteTransition;I)V
/*     */     //   322: checkcast kotlin/jvm/functions/Function2
/*     */     //   325: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   330: goto -> 334
/*     */     //   333: pop
/*     */     //   334: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #172	-> 0
/*     */     //   #173	-> 78
/*     */     //   #374	-> 90
/*     */     //   #375	-> 102
/*     */     //   #376	-> 113
/*     */     //   #174	-> 116
/*     */     //   #376	-> 123
/*     */     //   #377	-> 125
/*     */     //   #378	-> 134
/*     */     //   #379	-> 139
/*     */     //   #375	-> 141
/*     */     //   #374	-> 142
/*     */     //   #374	-> 143
/*     */     //   #173	-> 144
/*     */     //   #176	-> 157
/*     */     //   #177	-> 171
/*     */     //   #380	-> 195
/*     */     //   #381	-> 207
/*     */     //   #382	-> 223
/*     */     //   #177	-> 228
/*     */     //   #382	-> 245
/*     */     //   #383	-> 247
/*     */     //   #384	-> 256
/*     */     //   #385	-> 261
/*     */     //   #381	-> 263
/*     */     //   #380	-> 264
/*     */     //   #380	-> 265
/*     */     //   #177	-> 266
/*     */     //   #212	-> 297
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   116	7	11	$i$a$-cache-InfiniteTransition$run$toolingOverride$1	I
/*     */     //   125	11	11	value$iv	Ljava/lang/Object;
/*     */     //   102	40	10	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   99	43	9	it$iv	Ljava/lang/Object;
/*     */     //   90	54	8	$i$f$cache	I
/*     */     //   87	57	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   87	57	7	invalid$iv	Z
/*     */     //   228	14	11	$i$a$-cache-InfiniteTransition$run$1	I
/*     */     //   247	11	12	value$iv	Ljava/lang/Object;
/*     */     //   207	57	10	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   204	60	9	it$iv	Ljava/lang/Object;
/*     */     //   195	71	8	$i$f$cache	I
/*     */     //   192	74	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   192	74	7	invalid$iv	Z
/*     */     //   157	137	4	toolingOverride	Landroidx/compose/runtime/MutableState;
/*     */     //   17	318	3	$dirty	I
/*     */     //   0	335	0	this	Landroidx/compose/animation/core/InfiniteTransition;
/*     */     //   0	335	1	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	335	2	$changed	I }
/*     */   @DebugMetadata(f = "InfiniteTransition.kt", l = {181, 205}, i = {0, 0, 1, 1}, s = {"L$0", "L$1", "L$0", "L$1"}, n = {"$this$LaunchedEffect", "durationScale", "$this$LaunchedEffect", "durationScale"}, m = "invokeSuspend", c = "androidx.compose.animation.core.InfiniteTransition$run$1$1") @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class InfiniteTransition$run$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     Object L$1; int label;
/*     */     InfiniteTransition$run$1$1(InfiniteTransition $receiver, Continuation $completion) { super(2, $completion); }
/*     */     @Nullable public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #4
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 233, 0 -> 36, 1 -> 113, 2 -> 208
/*     */       //   36: aload_1
/*     */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   40: aload_0
/*     */       //   41: getfield L$0 : Ljava/lang/Object;
/*     */       //   44: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   47: astore_2
/*     */       //   48: new kotlin/jvm/internal/Ref$FloatRef
/*     */       //   51: dup
/*     */       //   52: invokespecial <init> : ()V
/*     */       //   55: astore_3
/*     */       //   56: aload_3
/*     */       //   57: fconst_1
/*     */       //   58: putfield element : F
/*     */       //   61: nop
/*     */       //   62: new androidx/compose/animation/core/InfiniteTransition$run$1$1$1
/*     */       //   65: dup
/*     */       //   66: aload_0
/*     */       //   67: getfield $toolingOverride : Landroidx/compose/runtime/MutableState;
/*     */       //   70: aload_0
/*     */       //   71: getfield this$0 : Landroidx/compose/animation/core/InfiniteTransition;
/*     */       //   74: aload_3
/*     */       //   75: aload_2
/*     */       //   76: invokespecial <init> : (Landroidx/compose/runtime/MutableState;Landroidx/compose/animation/core/InfiniteTransition;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlinx/coroutines/CoroutineScope;)V
/*     */       //   79: checkcast kotlin/jvm/functions/Function1
/*     */       //   82: aload_0
/*     */       //   83: checkcast kotlin/coroutines/Continuation
/*     */       //   86: aload_0
/*     */       //   87: aload_2
/*     */       //   88: putfield L$0 : Ljava/lang/Object;
/*     */       //   91: aload_0
/*     */       //   92: aload_3
/*     */       //   93: putfield L$1 : Ljava/lang/Object;
/*     */       //   96: aload_0
/*     */       //   97: iconst_1
/*     */       //   98: putfield label : I
/*     */       //   101: invokestatic withInfiniteAnimationFrameNanos : (Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   104: dup
/*     */       //   105: aload #4
/*     */       //   107: if_acmpne -> 134
/*     */       //   110: aload #4
/*     */       //   112: areturn
/*     */       //   113: aload_0
/*     */       //   114: getfield L$1 : Ljava/lang/Object;
/*     */       //   117: checkcast kotlin/jvm/internal/Ref$FloatRef
/*     */       //   120: astore_3
/*     */       //   121: aload_0
/*     */       //   122: getfield L$0 : Ljava/lang/Object;
/*     */       //   125: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   128: astore_2
/*     */       //   129: aload_1
/*     */       //   130: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   133: aload_1
/*     */       //   134: pop
/*     */       //   135: aload_3
/*     */       //   136: getfield element : F
/*     */       //   139: fconst_0
/*     */       //   140: fcmpg
/*     */       //   141: ifne -> 148
/*     */       //   144: iconst_1
/*     */       //   145: goto -> 149
/*     */       //   148: iconst_0
/*     */       //   149: ifeq -> 61
/*     */       //   152: new androidx/compose/animation/core/InfiniteTransition$run$1$1$2
/*     */       //   155: dup
/*     */       //   156: aload_2
/*     */       //   157: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;)V
/*     */       //   160: checkcast kotlin/jvm/functions/Function0
/*     */       //   163: invokestatic snapshotFlow : (Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/flow/Flow;
/*     */       //   166: new androidx/compose/animation/core/InfiniteTransition$run$1$1$3
/*     */       //   169: dup
/*     */       //   170: aconst_null
/*     */       //   171: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */       //   174: checkcast kotlin/jvm/functions/Function2
/*     */       //   177: aload_0
/*     */       //   178: checkcast kotlin/coroutines/Continuation
/*     */       //   181: aload_0
/*     */       //   182: aload_2
/*     */       //   183: putfield L$0 : Ljava/lang/Object;
/*     */       //   186: aload_0
/*     */       //   187: aload_3
/*     */       //   188: putfield L$1 : Ljava/lang/Object;
/*     */       //   191: aload_0
/*     */       //   192: iconst_2
/*     */       //   193: putfield label : I
/*     */       //   196: invokestatic first : (Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   199: dup
/*     */       //   200: aload #4
/*     */       //   202: if_acmpne -> 229
/*     */       //   205: aload #4
/*     */       //   207: areturn
/*     */       //   208: aload_0
/*     */       //   209: getfield L$1 : Ljava/lang/Object;
/*     */       //   212: checkcast kotlin/jvm/internal/Ref$FloatRef
/*     */       //   215: astore_3
/*     */       //   216: aload_0
/*     */       //   217: getfield L$0 : Ljava/lang/Object;
/*     */       //   220: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   223: astore_2
/*     */       //   224: aload_1
/*     */       //   225: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   228: aload_1
/*     */       //   229: pop
/*     */       //   230: goto -> 61
/*     */       //   233: new java/lang/IllegalStateException
/*     */       //   236: dup
/*     */       //   237: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   239: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   242: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #177	-> 3
/*     */       //   #178	-> 48
/*     */       //   #180	-> 61
/*     */       //   #181	-> 62
/*     */       //   #177	-> 110
/*     */       //   #204	-> 134
/*     */       //   #205	-> 152
/*     */       //   #177	-> 205
/*     */       //   #205	-> 229
/*     */       //   #177	-> 233
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   48	65	2	$this$LaunchedEffect	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   129	79	2	$this$LaunchedEffect	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   224	9	2	$this$LaunchedEffect	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   56	57	3	durationScale	Lkotlin/jvm/internal/Ref$FloatRef;
/*     */       //   121	87	3	durationScale	Lkotlin/jvm/internal/Ref$FloatRef;
/*     */       //   216	17	3	durationScale	Lkotlin/jvm/internal/Ref$FloatRef;
/*     */       //   40	193	0	this	Landroidx/compose/animation/core/InfiniteTransition$run$1$1;
/*     */       //   40	193	1	$result	Ljava/lang/Object; }
/*     */     @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super InfiniteTransition$run$1$1> $completion) { InfiniteTransition$run$1$1 infiniteTransition$run$1$1 = new InfiniteTransition$run$1$1(InfiniteTransition.this, $completion);
/*     */       infiniteTransition$run$1$1.L$0 = value;
/*     */       return (Continuation<Unit>)infiniteTransition$run$1$1; }
/*     */     @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((InfiniteTransition$run$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*     */   private final void onFrame(long playTimeNanos) { boolean allFinished = false;
/*     */     allFinished = true;
/*     */     MutableVector<TransitionAnimationState<?, ?>> this_$iv = this._animations;
/*     */     int $i$f$forEach = 0;
/* 387 */     int size$iv = this_$iv.getSize();
/* 388 */     if (size$iv > 0) {
/* 389 */       int i$iv = 0;
/* 390 */       Object[] content$iv = this_$iv.getContent();
/*     */       do {
/* 392 */         TransitionAnimationState it = (TransitionAnimationState)content$iv[i$iv]; int $i$a$-forEach-InfiniteTransition$onFrame$1 = 0; if (!it.isFinished$animation_core()) it.onPlayTimeChanged$animation_core(playTimeNanos);  if (it.isFinished$animation_core())
/* 393 */           continue;  allFinished = false; ++i$iv;
/* 394 */       } while (i$iv < size$iv);
/*     */     } 
/*     */     setRunning(!allFinished); }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class InfiniteTransition$run$2 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     InfiniteTransition$run$2(InfiniteTransition $tmp2_rcvr, int $$changed) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       this.$tmp2_rcvr.run$animation_core($composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\InfiniteTransition.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */