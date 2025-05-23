/*      */ package androidx.compose.animation.core;
/*      */ 
/*      */ import androidx.compose.runtime.Composable;
/*      */ import androidx.compose.runtime.Composer;
/*      */ import androidx.compose.runtime.ComposerKt;
/*      */ import androidx.compose.runtime.DisposableEffectScope;
/*      */ import androidx.compose.runtime.State;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.functions.Function3;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000 \001\n\000\n\002\020\b\n\000\n\002\020\007\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\007\0323\020\022\032\b\022\004\022\002H\0240\023\"\004\b\000\020\0242\f\020\025\032\b\022\004\022\002H\0240\0262\n\b\002\020\027\032\004\030\0010\030H\007¢\006\002\020\031\032-\020\032\032\b\022\004\022\002H\0240\023\"\004\b\000\020\0242\006\020\033\032\002H\0242\n\b\002\020\027\032\004\030\0010\030H\007¢\006\002\020\034\0323\020\032\032\b\022\004\022\002H\0240\023\"\004\b\000\020\0242\f\020\025\032\b\022\004\022\002H\0240\0352\n\b\002\020\027\032\004\030\0010\030H\007¢\006\002\020\036\032\001\020\037\032\b\022\004\022\0020!0 \"\004\b\000\020\"*\b\022\004\022\002H\"0\0232*\b\n\020#\032$\022\n\022\b\022\004\022\002H\"0$\022\n\022\b\022\004\022\0020!0%0\017¢\006\002\b&¢\006\002\b'2\b\b\002\020\027\032\0020\0302&\020(\032\"\022\023\022\021H\"¢\006\f\b)\022\b\b*\022\004\b\b(+\022\004\022\0020!0\017¢\006\002\b&H\bø\001\000¢\006\002\020,\032\001\020-\032\b\022\004\022\0020\0030 \"\004\b\000\020\"*\b\022\004\022\002H\"0\0232*\b\n\020#\032$\022\n\022\b\022\004\022\002H\"0$\022\n\022\b\022\004\022\0020\0030%0\017¢\006\002\b&¢\006\002\b'2\b\b\002\020\027\032\0020\0302&\020(\032\"\022\023\022\021H\"¢\006\f\b)\022\b\b*\022\004\b\b(+\022\004\022\0020\0030\017¢\006\002\b&H\bø\001\000¢\006\002\020,\032\001\020.\032\b\022\004\022\0020\0010 \"\004\b\000\020\"*\b\022\004\022\002H\"0\0232*\b\n\020#\032$\022\n\022\b\022\004\022\002H\"0$\022\n\022\b\022\004\022\0020\0010%0\017¢\006\002\b&¢\006\002\b'2\b\b\002\020\027\032\0020\0302&\020(\032\"\022\023\022\021H\"¢\006\f\b)\022\b\b*\022\004\b\b(+\022\004\022\0020\0010\017¢\006\002\b&H\bø\001\000¢\006\002\020,\032\001\020/\032\b\022\004\022\002000 \"\004\b\000\020\"*\b\022\004\022\002H\"0\0232*\b\n\020#\032$\022\n\022\b\022\004\022\002H\"0$\022\n\022\b\022\004\022\002000%0\017¢\006\002\b&¢\006\002\b'2\b\b\002\020\027\032\0020\0302&\020(\032\"\022\023\022\021H\"¢\006\f\b)\022\b\b*\022\004\b\b(+\022\004\022\002000\017¢\006\002\b&H\bø\001\000¢\006\002\020,\032\001\0201\032\b\022\004\022\002020 \"\004\b\000\020\"*\b\022\004\022\002H\"0\0232*\b\n\020#\032$\022\n\022\b\022\004\022\002H\"0$\022\n\022\b\022\004\022\002020%0\017¢\006\002\b&¢\006\002\b'2\b\b\002\020\027\032\0020\0302&\020(\032\"\022\023\022\021H\"¢\006\f\b)\022\b\b*\022\004\b\b(+\022\004\022\002020\017¢\006\002\b&H\bø\001\000¢\006\002\020,\032\001\0203\032\b\022\004\022\002040 \"\004\b\000\020\"*\b\022\004\022\002H\"0\0232*\b\n\020#\032$\022\n\022\b\022\004\022\002H\"0$\022\n\022\b\022\004\022\002040%0\017¢\006\002\b&¢\006\002\b'2\b\b\002\020\027\032\0020\0302&\020(\032\"\022\023\022\021H\"¢\006\f\b)\022\b\b*\022\004\b\b(+\022\004\022\002040\017¢\006\002\b&H\bø\001\000¢\006\002\020,\032\001\0205\032\b\022\004\022\002060 \"\004\b\000\020\"*\b\022\004\022\002H\"0\0232*\b\n\020#\032$\022\n\022\b\022\004\022\002H\"0$\022\n\022\b\022\004\022\002060%0\017¢\006\002\b&¢\006\002\b'2\b\b\002\020\027\032\0020\0302&\020(\032\"\022\023\022\021H\"¢\006\f\b)\022\b\b*\022\004\b\b(+\022\004\022\002060\017¢\006\002\b&H\bø\001\000¢\006\002\020,\032\001\0207\032\b\022\004\022\002080 \"\004\b\000\020\"*\b\022\004\022\002H\"0\0232*\b\n\020#\032$\022\n\022\b\022\004\022\002H\"0$\022\n\022\b\022\004\022\002080%0\017¢\006\002\b&¢\006\002\b'2\b\b\002\020\027\032\0020\0302&\020(\032\"\022\023\022\021H\"¢\006\f\b)\022\b\b*\022\004\b\b(+\022\004\022\002080\017¢\006\002\b&H\bø\001\000¢\006\002\020,\032©\001\0209\032\b\022\004\022\002H\0240 \"\004\b\000\020\"\"\004\b\001\020\024\"\b\b\002\020:*\0020;*\b\022\004\022\002H\"0\0232\022\020<\032\016\022\004\022\002H\024\022\004\022\002H:0=2*\b\n\020#\032$\022\n\022\b\022\004\022\002H\"0$\022\n\022\b\022\004\022\002H\0240%0\017¢\006\002\b&¢\006\002\b'2\b\b\002\020\027\032\0020\0302&\020(\032\"\022\023\022\021H\"¢\006\f\b)\022\b\b*\022\004\b\b(+\022\004\022\002H\0240\017¢\006\002\b&H\bø\001\000¢\006\002\020>\032_\020?\032\b\022\004\022\002H\0240\023\"\004\b\000\020\"\"\004\b\001\020\024*\b\022\004\022\002H\"0\0232\b\b\002\020\027\032\0020\0302&\020@\032\"\022\023\022\021H\"¢\006\f\b)\022\b\b*\022\004\b\b(A\022\004\022\002H\0240\017¢\006\002\b&H\bø\001\000¢\006\002\020B\032A\020C\032\b\022\004\022\002H\0240\023\"\004\b\000\020\"\"\004\b\001\020\024*\b\022\004\022\002H\"0\0232\006\020D\032\002H\0242\006\020\033\032\002H\0242\006\020E\032\0020\030H\001¢\006\002\020F\032a\020G\032\030\022\004\022\002H\024\022\004\022\002H:0HR\b\022\004\022\002H\"0\023\"\004\b\000\020\"\"\004\b\001\020\024\"\b\b\002\020:*\0020;*\b\022\004\022\002H\"0\0232\022\020<\032\016\022\004\022\002H\024\022\004\022\002H:0=2\b\b\002\020\027\032\0020\030H\007¢\006\002\020I\032m\020J\032\b\022\004\022\002H\0240 \"\004\b\000\020\"\"\004\b\001\020\024\"\b\b\002\020:*\0020;*\b\022\004\022\002H\"0\0232\006\020K\032\002H\0242\006\020L\032\002H\0242\f\020M\032\b\022\004\022\002H\0240%2\022\020<\032\016\022\004\022\002H\024\022\004\022\002H:0=2\006\020\027\032\0020\030H\001¢\006\002\020N\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\003XT¢\006\002\n\000\"\016\020\004\032\0020\003XT¢\006\002\n\000\"\016\020\005\032\0020\003XT¢\006\002\n\000\"\016\020\006\032\0020\003XT¢\006\002\n\000\"\016\020\007\032\0020\003XT¢\006\002\n\000\"\033\020\b\032\0020\t8@X\002¢\006\f\n\004\b\f\020\r\032\004\b\n\020\013\"\036\020\016\032\022\022\b\022\006\022\002\b\0030\020\022\004\022\0020\0210\017X\004¢\006\002\n\000\002\007\n\005\b20\001¨\006O"}, d2 = {"AnimationDebugDurationScale", "", "NoReset", "", "ResetAnimationSnap", "ResetAnimationSnapCurrent", "ResetAnimationSnapTarget", "ResetNoSnap", "SeekableStateObserver", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "getSeekableStateObserver", "()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "SeekableStateObserver$delegate", "Lkotlin/Lazy;", "SeekableTransitionStateTotalDurationChanged", "Lkotlin/Function1;", "Landroidx/compose/animation/core/SeekableTransitionState;", "", "rememberTransition", "Landroidx/compose/animation/core/Transition;", "T", "transitionState", "Landroidx/compose/animation/core/TransitionState;", "label", "", "(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "updateTransition", "targetState", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/core/MutableTransitionState;", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "animateDp", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/Dp;", "S", "transitionSpec", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "targetValueByState", "Lkotlin/ParameterName;", "name", "state", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateFloat", "animateInt", "animateIntOffset", "Landroidx/compose/ui/unit/IntOffset;", "animateIntSize", "Landroidx/compose/ui/unit/IntSize;", "animateOffset", "Landroidx/compose/ui/geometry/Offset;", "animateRect", "Landroidx/compose/ui/geometry/Rect;", "animateSize", "Landroidx/compose/ui/geometry/Size;", "animateValue", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "createChildTransition", "transformToChildState", "parentState", "(Landroidx/compose/animation/core/Transition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;", "createChildTransitionInternal", "initialState", "childLabel", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/Transition;", "createDeferredAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition$DeferredAnimation;", "createTransitionAnimation", "initialValue", "targetValue", "animationSpec", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "animation-core"})
/*      */ @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2186:1\n1885#1,7:2259\n1885#1,7:2266\n1885#1,7:2273\n1885#1,7:2280\n1885#1,7:2287\n1885#1,7:2294\n1885#1,7:2301\n1885#1,7:2308\n1225#2,6:2187\n1225#2,6:2193\n1225#2,6:2199\n1225#2,6:2205\n1225#2,6:2211\n1225#2,6:2217\n1225#2,6:2223\n1225#2,6:2229\n1225#2,6:2235\n1225#2,6:2241\n1225#2,6:2247\n1225#2,6:2253\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n1970#1:2259,7\n2001#1:2266,7\n2032#1:2273,7\n2063#1:2280,7\n2094#1:2287,7\n2125#1:2294,7\n2155#1:2301,7\n2185#1:2308,7\n94#1:2187,6\n96#1:2193,6\n823#1:2199,6\n827#1:2205,6\n838#1:2211,6\n1782#1:2217,6\n1783#1:2223,6\n1815#1:2229,6\n1828#1:2235,6\n1832#1:2241,6\n1903#1:2247,6\n1926#1:2253,6\n*E\n"})
/*      */ public final class TransitionKt {
/*      */   public static final int AnimationDebugDurationScale = 1;
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\0020\001\"\004\b\000\020\002*\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "T", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"})
/*      */   @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$updateTransition$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,2186:1\n63#2,5:2187\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$updateTransition$1$1\n*L\n97#1:2187,5\n*E\n"})
/*      */   static final class TransitionKt$updateTransition$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
/*      */     @NotNull
/*      */     public final DisposableEffectResult invoke(@NotNull DisposableEffectScope $this$DisposableEffect) {
/*      */       Intrinsics.checkNotNullParameter($this$DisposableEffect, "$this$DisposableEffect");
/*      */       DisposableEffectScope disposableEffectScope = $this$DisposableEffect;
/*      */       Transition<T> transition = this.$transition;
/*      */       int $i$f$onDispose = 0;
/*      */       return new TransitionKt$updateTransition$1$1$invoke$$inlined$onDispose$1(transition);
/*      */     }
/*      */     
/*      */     TransitionKt$updateTransition$1$1(Transition<T> $transition) {
/*      */       super(1);
/*      */     }
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   private static final Function1<SeekableTransitionState<?>, Unit> SeekableTransitionStateTotalDurationChanged = TransitionKt$SeekableTransitionStateTotalDurationChanged$1.INSTANCE;
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\n\020\002\032\006\022\002\b\0030\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/animation/core/SeekableTransitionState;", "invoke"})
/*      */   static final class TransitionKt$SeekableTransitionStateTotalDurationChanged$1 extends Lambda implements Function1<SeekableTransitionState<?>, Unit> {
/*      */     public static final TransitionKt$SeekableTransitionStateTotalDurationChanged$1 INSTANCE = new TransitionKt$SeekableTransitionStateTotalDurationChanged$1();
/*      */     
/*      */     public final void invoke(@NotNull SeekableTransitionState it) {
/*      */       Intrinsics.checkNotNullParameter(it, "it");
/*      */       it.onTotalDurationChanged$animation_core();
/*      */     }
/*      */     
/*      */     TransitionKt$SeekableTransitionStateTotalDurationChanged$1() {
/*      */       super(1);
/*      */     }
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public static final SnapshotStateObserver getSeekableStateObserver() {
/*      */     Lazy lazy = SeekableStateObserver$delegate;
/*      */     return (SnapshotStateObserver)lazy.getValue();
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   private static final Lazy SeekableStateObserver$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, TransitionKt$SeekableStateObserver$2.INSTANCE);
/*      */   private static final float NoReset = -1.0F;
/*      */   private static final float ResetNoSnap = -2.0F;
/*      */   private static final float ResetAnimationSnap = -3.0F;
/*      */   private static final float ResetAnimationSnapCurrent = -4.0F;
/*      */   private static final float ResetAnimationSnapTarget = -5.0F;
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "invoke"})
/*      */   @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$SeekableStateObserver$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2186:1\n1#2:2187\n*E\n"})
/*      */   static final class TransitionKt$SeekableStateObserver$2 extends Lambda implements Function0<SnapshotStateObserver> {
/*      */     public static final TransitionKt$SeekableStateObserver$2 INSTANCE = new TransitionKt$SeekableStateObserver$2();
/*      */     
/*      */     TransitionKt$SeekableStateObserver$2() {
/*      */       super(0);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final SnapshotStateObserver invoke() {
/*      */       SnapshotStateObserver snapshotStateObserver1 = new SnapshotStateObserver(null.INSTANCE), $this$invoke_u24lambda_u240 = snapshotStateObserver1;
/*      */       int $i$a$-apply-TransitionKt$SeekableStateObserver$2$2 = 0;
/*      */       $this$invoke_u24lambda_u240.start();
/*      */       return snapshotStateObserver1;
/*      */     }
/*      */   }
/*      */   
/*      */   @Composable
/*      */   @NotNull
/*      */   public static final <T> Transition<T> rememberTransition(@NotNull TransitionState<?> transitionState, @Nullable String label, @Nullable Composer $composer, int $changed, int paramInt1) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: ldc 'transitionState'
/*      */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   6: aload_2
/*      */     //   7: ldc 1643203617
/*      */     //   9: ldc 'C(rememberTransition)P(1)822@34343L94,837@35067L190,837@35038L219:Transition.kt#pdpnli'
/*      */     //   11: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   14: iload #4
/*      */     //   16: iconst_2
/*      */     //   17: iand
/*      */     //   18: ifeq -> 23
/*      */     //   21: aconst_null
/*      */     //   22: astore_1
/*      */     //   23: invokestatic isTraceInProgress : ()Z
/*      */     //   26: ifeq -> 38
/*      */     //   29: ldc 1643203617
/*      */     //   31: iload_3
/*      */     //   32: iconst_m1
/*      */     //   33: ldc 'androidx.compose.animation.core.rememberTransition (Transition.kt:821)'
/*      */     //   35: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   38: aload_2
/*      */     //   39: ldc 587424932
/*      */     //   41: ldc 'CC(remember):Transition.kt#9igjgp'
/*      */     //   43: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   46: aload_2
/*      */     //   47: astore #7
/*      */     //   49: iload_3
/*      */     //   50: bipush #14
/*      */     //   52: iand
/*      */     //   53: bipush #6
/*      */     //   55: ixor
/*      */     //   56: iconst_4
/*      */     //   57: if_icmple -> 70
/*      */     //   60: aload_2
/*      */     //   61: aload_0
/*      */     //   62: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   67: ifne -> 78
/*      */     //   70: iload_3
/*      */     //   71: bipush #6
/*      */     //   73: iand
/*      */     //   74: iconst_4
/*      */     //   75: if_icmpne -> 82
/*      */     //   78: iconst_1
/*      */     //   79: goto -> 83
/*      */     //   82: iconst_0
/*      */     //   83: istore #8
/*      */     //   85: iconst_0
/*      */     //   86: istore #9
/*      */     //   88: aload #7
/*      */     //   90: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   95: astore #10
/*      */     //   97: iconst_0
/*      */     //   98: istore #11
/*      */     //   100: iload #8
/*      */     //   102: ifne -> 116
/*      */     //   105: aload #10
/*      */     //   107: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   110: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   113: if_acmpne -> 144
/*      */     //   116: iconst_0
/*      */     //   117: istore #12
/*      */     //   119: new androidx/compose/animation/core/Transition
/*      */     //   122: dup
/*      */     //   123: aload_0
/*      */     //   124: aload_1
/*      */     //   125: invokespecial <init> : (Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;)V
/*      */     //   128: astore #13
/*      */     //   130: aload #7
/*      */     //   132: aload #13
/*      */     //   134: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   139: aload #13
/*      */     //   141: goto -> 146
/*      */     //   144: aload #10
/*      */     //   146: nop
/*      */     //   147: nop
/*      */     //   148: nop
/*      */     //   149: checkcast androidx/compose/animation/core/Transition
/*      */     //   152: astore #6
/*      */     //   154: aload_2
/*      */     //   155: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   158: aload #6
/*      */     //   160: astore #5
/*      */     //   162: aload_0
/*      */     //   163: instanceof androidx/compose/animation/core/SeekableTransitionState
/*      */     //   166: ifeq -> 342
/*      */     //   169: aload_2
/*      */     //   170: ldc 1030461252
/*      */     //   172: invokeinterface startReplaceGroup : (I)V
/*      */     //   177: aload_2
/*      */     //   178: ldc '826@34574L382,826@34500L456'
/*      */     //   180: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*      */     //   183: aload_0
/*      */     //   184: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*      */     //   187: aload_0
/*      */     //   188: invokevirtual getTargetState : ()Ljava/lang/Object;
/*      */     //   191: aload_2
/*      */     //   192: ldc 587432612
/*      */     //   194: ldc 'CC(remember):Transition.kt#9igjgp'
/*      */     //   196: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   199: aload_2
/*      */     //   200: astore #7
/*      */     //   202: iload_3
/*      */     //   203: bipush #14
/*      */     //   205: iand
/*      */     //   206: bipush #6
/*      */     //   208: ixor
/*      */     //   209: iconst_4
/*      */     //   210: if_icmple -> 223
/*      */     //   213: aload_2
/*      */     //   214: aload_0
/*      */     //   215: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   220: ifne -> 231
/*      */     //   223: iload_3
/*      */     //   224: bipush #6
/*      */     //   226: iand
/*      */     //   227: iconst_4
/*      */     //   228: if_icmpne -> 235
/*      */     //   231: iconst_1
/*      */     //   232: goto -> 236
/*      */     //   235: iconst_0
/*      */     //   236: istore #8
/*      */     //   238: iconst_0
/*      */     //   239: istore #9
/*      */     //   241: aload #7
/*      */     //   243: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   248: astore #10
/*      */     //   250: iconst_0
/*      */     //   251: istore #11
/*      */     //   253: iload #8
/*      */     //   255: ifne -> 269
/*      */     //   258: aload #10
/*      */     //   260: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   263: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   266: if_acmpne -> 312
/*      */     //   269: astore #15
/*      */     //   271: astore #14
/*      */     //   273: iconst_0
/*      */     //   274: istore #12
/*      */     //   276: new androidx/compose/animation/core/TransitionKt$rememberTransition$1$1
/*      */     //   279: dup
/*      */     //   280: aload_0
/*      */     //   281: aconst_null
/*      */     //   282: invokespecial <init> : (Landroidx/compose/animation/core/TransitionState;Lkotlin/coroutines/Continuation;)V
/*      */     //   285: checkcast kotlin/jvm/functions/Function2
/*      */     //   288: astore #16
/*      */     //   290: aload #14
/*      */     //   292: aload #15
/*      */     //   294: aload #16
/*      */     //   296: astore #13
/*      */     //   298: aload #7
/*      */     //   300: aload #13
/*      */     //   302: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   307: aload #13
/*      */     //   309: goto -> 314
/*      */     //   312: aload #10
/*      */     //   314: nop
/*      */     //   315: nop
/*      */     //   316: nop
/*      */     //   317: checkcast kotlin/jvm/functions/Function2
/*      */     //   320: astore #6
/*      */     //   322: aload_2
/*      */     //   323: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   326: aload #6
/*      */     //   328: aload_2
/*      */     //   329: iconst_0
/*      */     //   330: invokestatic LaunchedEffect : (Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*      */     //   333: aload_2
/*      */     //   334: invokeinterface endReplaceGroup : ()V
/*      */     //   339: goto -> 373
/*      */     //   342: aload_2
/*      */     //   343: ldc 1030922811
/*      */     //   345: invokeinterface startReplaceGroup : (I)V
/*      */     //   350: aload_2
/*      */     //   351: ldc '835@34989L38'
/*      */     //   353: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*      */     //   356: aload #5
/*      */     //   358: aload_0
/*      */     //   359: invokevirtual getTargetState : ()Ljava/lang/Object;
/*      */     //   362: aload_2
/*      */     //   363: iconst_0
/*      */     //   364: invokevirtual animateTo$animation_core : (Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V
/*      */     //   367: aload_2
/*      */     //   368: invokeinterface endReplaceGroup : ()V
/*      */     //   373: aload #5
/*      */     //   375: aload_2
/*      */     //   376: ldc 587448196
/*      */     //   378: ldc 'CC(remember):Transition.kt#9igjgp'
/*      */     //   380: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   383: aload_2
/*      */     //   384: astore #7
/*      */     //   386: aload_2
/*      */     //   387: aload #5
/*      */     //   389: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   394: istore #8
/*      */     //   396: iconst_0
/*      */     //   397: istore #9
/*      */     //   399: aload #7
/*      */     //   401: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   406: astore #10
/*      */     //   408: iconst_0
/*      */     //   409: istore #11
/*      */     //   411: iload #8
/*      */     //   413: ifne -> 427
/*      */     //   416: aload #10
/*      */     //   418: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   421: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   424: if_acmpne -> 463
/*      */     //   427: astore #14
/*      */     //   429: iconst_0
/*      */     //   430: istore #12
/*      */     //   432: new androidx/compose/animation/core/TransitionKt$rememberTransition$2$1
/*      */     //   435: dup
/*      */     //   436: aload #5
/*      */     //   438: invokespecial <init> : (Landroidx/compose/animation/core/Transition;)V
/*      */     //   441: checkcast kotlin/jvm/functions/Function1
/*      */     //   444: aload #14
/*      */     //   446: swap
/*      */     //   447: astore #13
/*      */     //   449: aload #7
/*      */     //   451: aload #13
/*      */     //   453: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   458: aload #13
/*      */     //   460: goto -> 465
/*      */     //   463: aload #10
/*      */     //   465: nop
/*      */     //   466: nop
/*      */     //   467: nop
/*      */     //   468: checkcast kotlin/jvm/functions/Function1
/*      */     //   471: astore #6
/*      */     //   473: aload_2
/*      */     //   474: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   477: aload #6
/*      */     //   479: aload_2
/*      */     //   480: iconst_0
/*      */     //   481: invokestatic DisposableEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*      */     //   484: invokestatic isTraceInProgress : ()Z
/*      */     //   487: ifeq -> 493
/*      */     //   490: invokestatic traceEventEnd : ()V
/*      */     //   493: aload_2
/*      */     //   494: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   497: aload #5
/*      */     //   499: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #822	-> 11
/*      */     //   #821	-> 21
/*      */     //   #822	-> 35
/*      */     //   #823	-> 43
/*      */     //   #2199	-> 88
/*      */     //   #2200	-> 100
/*      */     //   #2201	-> 116
/*      */     //   #824	-> 119
/*      */     //   #2201	-> 128
/*      */     //   #2202	-> 130
/*      */     //   #2203	-> 139
/*      */     //   #2204	-> 144
/*      */     //   #2200	-> 146
/*      */     //   #2199	-> 147
/*      */     //   #2199	-> 148
/*      */     //   #823	-> 149
/*      */     //   #826	-> 162
/*      */     //   #827	-> 183
/*      */     //   #2205	-> 241
/*      */     //   #2206	-> 253
/*      */     //   #2207	-> 269
/*      */     //   #827	-> 276
/*      */     //   #2207	-> 296
/*      */     //   #2208	-> 298
/*      */     //   #2209	-> 307
/*      */     //   #2210	-> 312
/*      */     //   #2206	-> 314
/*      */     //   #2205	-> 315
/*      */     //   #2205	-> 316
/*      */     //   #827	-> 317
/*      */     //   #826	-> 333
/*      */     //   #835	-> 342
/*      */     //   #836	-> 356
/*      */     //   #835	-> 367
/*      */     //   #838	-> 373
/*      */     //   #2211	-> 399
/*      */     //   #2212	-> 411
/*      */     //   #2213	-> 427
/*      */     //   #838	-> 432
/*      */     //   #2213	-> 447
/*      */     //   #2214	-> 449
/*      */     //   #2215	-> 458
/*      */     //   #2216	-> 463
/*      */     //   #2212	-> 465
/*      */     //   #2211	-> 466
/*      */     //   #2211	-> 467
/*      */     //   #838	-> 468
/*      */     //   #822	-> 494
/*      */     //   #845	-> 499
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   119	9	12	$i$a$-cache-TransitionKt$rememberTransition$transition$1	I
/*      */     //   130	11	13	value$iv	Ljava/lang/Object;
/*      */     //   100	47	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   97	50	10	it$iv	Ljava/lang/Object;
/*      */     //   88	61	9	$i$f$cache	I
/*      */     //   85	64	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   85	64	8	invalid$iv	Z
/*      */     //   276	12	12	$i$a$-cache-TransitionKt$rememberTransition$1	I
/*      */     //   298	11	13	value$iv	Ljava/lang/Object;
/*      */     //   253	62	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   250	65	10	it$iv	Ljava/lang/Object;
/*      */     //   241	76	9	$i$f$cache	I
/*      */     //   238	79	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   238	79	8	invalid$iv	Z
/*      */     //   432	12	12	$i$a$-cache-TransitionKt$rememberTransition$2	I
/*      */     //   449	11	13	value$iv	Ljava/lang/Object;
/*      */     //   411	55	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   408	58	10	it$iv	Ljava/lang/Object;
/*      */     //   399	69	9	$i$f$cache	I
/*      */     //   396	72	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   396	72	8	invalid$iv	Z
/*      */     //   162	338	5	transition	Landroidx/compose/animation/core/Transition;
/*      */     //   0	500	0	transitionState	Landroidx/compose/animation/core/TransitionState;
/*      */     //   0	500	1	label	Ljava/lang/String;
/*      */     //   0	500	2	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   0	500	3	$changed	I
/*      */   }
/*      */   
/*      */   @Composable
/*      */   @NotNull
/*   93 */   public static final <T> Transition<T> updateTransition(Object targetState, @Nullable String label, @Nullable Composer $composer, int $changed, int paramInt1) { ComposerKt.sourceInformationMarkerStart($composer, 2029166765, "C(updateTransition)P(1)93@3896L51,94@3963L22,95@4019L190,95@3990L219:Transition.kt#pdpnli"); if ((paramInt1 & 0x2) != 0) label = null;  if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(2029166765, $changed, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:92)"); 
/*   94 */     ComposerKt.sourceInformationMarkerStart($composer, -659286059, "CC(remember):Transition.kt#9igjgp"); Composer composer1 = $composer; boolean invalid$iv = false; int $i$f$cache = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2187 */     Object it$iv = composer1.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 2188 */     if (it$iv == Composer.Companion.getEmpty()) {
/* 2189 */       int $i$a$-cache-TransitionKt$updateTransition$transition$1 = 0; Object value$iv = new Transition(targetState, label);
/* 2190 */       composer1.updateRememberedValue(value$iv);
/*      */     } 
/* 2192 */     Transition<Object> transition1 = (Transition)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); Transition<Object> transition = transition1; transition.animateTo$animation_core(targetState, $composer, 0x30 | 0x8 & $changed | 0xE & $changed); ComposerKt.sourceInformationMarkerStart($composer, -659281984, "CC(remember):Transition.kt#9igjgp"); Composer $this$cache$iv = $composer; invalid$iv = false; $i$f$cache = 0;
/* 2193 */     it$iv = $this$cache$iv.rememberedValue(); $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 2194 */     if (it$iv == Composer.Companion.getEmpty()) {
/* 2195 */       Transition<Object> transition2 = transition; int $i$a$-cache-TransitionKt$updateTransition$1 = 0; Object value$iv = new TransitionKt$updateTransition$1$1((Transition)transition);
/* 2196 */       $this$cache$iv.updateRememberedValue(value$iv);
/*      */     } 
/* 2198 */     Function1 function1 = (Function1)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); EffectsKt.DisposableEffect(transition2, function1, $composer, 54); if (ComposerKt.isTraceInProgress())
/*      */       ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer); return (Transition)transition; }
/*      */   @DebugMetadata(f = "Transition.kt", l = {2191}, i = {0}, s = {"L$0"}, n = {"$this$withLock_u24default$iv"}, m = "invokeSuspend", c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1") @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\001\"\004\b\000\020\002*\0020\003H@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}) @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$rememberTransition$1$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,2186:1\n116#2,10:2187\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$rememberTransition$1$1\n*L\n829#1:2187,10\n*E\n"}) static final class TransitionKt$rememberTransition$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*      */     Object L$0;
/*      */     Object L$1;
/*      */     int label;
/*      */     TransitionKt$rememberTransition$1$1(TransitionState<T> $transitionState, Continuation $completion) { super(2, $completion); }
/*      */     @Nullable public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*      */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*      */       //   3: astore #8
/*      */       //   5: aload_0
/*      */       //   6: getfield label : I
/*      */       //   9: tableswitch default -> 229, 0 -> 32, 1 -> 105
/*      */       //   32: aload_1
/*      */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */       //   36: aload_0
/*      */       //   37: getfield $transitionState : Landroidx/compose/animation/core/TransitionState;
/*      */       //   40: checkcast androidx/compose/animation/core/SeekableTransitionState
/*      */       //   43: invokevirtual observeTotalDuration$animation_core : ()V
/*      */       //   46: aload_0
/*      */       //   47: getfield $transitionState : Landroidx/compose/animation/core/TransitionState;
/*      */       //   50: checkcast androidx/compose/animation/core/SeekableTransitionState
/*      */       //   53: invokevirtual getCompositionContinuationMutex$animation_core : ()Lkotlinx/coroutines/sync/Mutex;
/*      */       //   56: astore_2
/*      */       //   57: aload_0
/*      */       //   58: getfield $transitionState : Landroidx/compose/animation/core/TransitionState;
/*      */       //   61: astore #4
/*      */       //   63: aconst_null
/*      */       //   64: astore_3
/*      */       //   65: iconst_0
/*      */       //   66: istore #5
/*      */       //   68: nop
/*      */       //   69: aload_2
/*      */       //   70: aload_3
/*      */       //   71: aload_0
/*      */       //   72: checkcast kotlin/coroutines/Continuation
/*      */       //   75: aload_0
/*      */       //   76: aload_2
/*      */       //   77: putfield L$0 : Ljava/lang/Object;
/*      */       //   80: aload_0
/*      */       //   81: aload #4
/*      */       //   83: putfield L$1 : Ljava/lang/Object;
/*      */       //   86: aload_0
/*      */       //   87: iconst_1
/*      */       //   88: putfield label : I
/*      */       //   91: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*      */       //   96: dup
/*      */       //   97: aload #8
/*      */       //   99: if_acmpne -> 132
/*      */       //   102: aload #8
/*      */       //   104: areturn
/*      */       //   105: iconst_0
/*      */       //   106: istore #5
/*      */       //   108: aload_0
/*      */       //   109: getfield L$1 : Ljava/lang/Object;
/*      */       //   112: checkcast androidx/compose/animation/core/TransitionState
/*      */       //   115: astore #4
/*      */       //   117: aconst_null
/*      */       //   118: astore_3
/*      */       //   119: aload_0
/*      */       //   120: getfield L$0 : Ljava/lang/Object;
/*      */       //   123: checkcast kotlinx/coroutines/sync/Mutex
/*      */       //   126: astore_2
/*      */       //   127: aload_1
/*      */       //   128: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */       //   131: aload_1
/*      */       //   132: pop
/*      */       //   133: nop
/*      */       //   134: iconst_0
/*      */       //   135: istore #6
/*      */       //   137: aload #4
/*      */       //   139: checkcast androidx/compose/animation/core/SeekableTransitionState
/*      */       //   142: aload #4
/*      */       //   144: invokevirtual getTargetState : ()Ljava/lang/Object;
/*      */       //   147: invokevirtual setComposedTargetState$animation_core : (Ljava/lang/Object;)V
/*      */       //   150: aload #4
/*      */       //   152: checkcast androidx/compose/animation/core/SeekableTransitionState
/*      */       //   155: invokevirtual getCompositionContinuation$animation_core : ()Lkotlinx/coroutines/CancellableContinuation;
/*      */       //   158: dup
/*      */       //   159: ifnull -> 185
/*      */       //   162: checkcast kotlin/coroutines/Continuation
/*      */       //   165: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*      */       //   168: pop
/*      */       //   169: aload #4
/*      */       //   171: invokevirtual getTargetState : ()Ljava/lang/Object;
/*      */       //   174: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */       //   177: invokeinterface resumeWith : (Ljava/lang/Object;)V
/*      */       //   182: goto -> 187
/*      */       //   185: pop
/*      */       //   186: nop
/*      */       //   187: aload #4
/*      */       //   189: checkcast androidx/compose/animation/core/SeekableTransitionState
/*      */       //   192: aconst_null
/*      */       //   193: invokevirtual setCompositionContinuation$animation_core : (Lkotlinx/coroutines/CancellableContinuation;)V
/*      */       //   196: nop
/*      */       //   197: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */       //   200: astore #7
/*      */       //   202: aload_2
/*      */       //   203: aload_3
/*      */       //   204: invokeinterface unlock : (Ljava/lang/Object;)V
/*      */       //   209: goto -> 224
/*      */       //   212: astore #6
/*      */       //   214: aload_2
/*      */       //   215: aload_3
/*      */       //   216: invokeinterface unlock : (Ljava/lang/Object;)V
/*      */       //   221: aload #6
/*      */       //   223: athrow
/*      */       //   224: nop
/*      */       //   225: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */       //   228: areturn
/*      */       //   229: new java/lang/IllegalStateException
/*      */       //   232: dup
/*      */       //   233: ldc 'call to 'resume' before 'invoke' with coroutine'
/*      */       //   235: invokespecial <init> : (Ljava/lang/String;)V
/*      */       //   238: athrow
/*      */       // Line number table:
/*      */       //   Java source line number -> byte code offset
/*      */       //   #827	-> 3
/*      */       //   #828	-> 36
/*      */       //   #829	-> 46
/*      */       //   #2187	-> 63
/*      */       //   #2188	-> 68
/*      */       //   #2191	-> 69
/*      */       //   #827	-> 102
/*      */       //   #2192	-> 132
/*      */       //   #2193	-> 134
/*      */       //   #830	-> 137
/*      */       //   #831	-> 150
/*      */       //   #831	-> 185
/*      */       //   #832	-> 187
/*      */       //   #833	-> 196
/*      */       //   #2193	-> 200
/*      */       //   #2195	-> 202
/*      */       //   #2196	-> 209
/*      */       //   #2195	-> 212
/*      */       //   #2192	-> 224
/*      */       //   #834	-> 225
/*      */       //   #827	-> 229
/*      */       // Local variable table:
/*      */       //   start	length	slot	name	descriptor
/*      */       //   63	42	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*      */       //   127	70	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*      */       //   197	12	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*      */       //   212	13	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*      */       //   65	40	3	owner$iv	Ljava/lang/Object;
/*      */       //   127	70	3	owner$iv	Ljava/lang/Object;
/*      */       //   197	12	3	owner$iv	Ljava/lang/Object;
/*      */       //   212	13	3	owner$iv	Ljava/lang/Object;
/*      */       //   137	60	6	$i$a$-withLock$default-TransitionKt$rememberTransition$1$1$1	I
/*      */       //   68	37	5	$i$f$withLock	I
/*      */       //   36	193	0	this	Landroidx/compose/animation/core/TransitionKt$rememberTransition$1$1;
/*      */       //   36	193	1	$result	Ljava/lang/Object;
/*      */       //   108	117	5	$i$f$withLock	I
/*      */       // Exception table:
/*      */       //   from	to	target	type
/*      */       //   133	202	212	finally
/*      */       //   212	214	212	finally }
/*      */     @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super TransitionKt$rememberTransition$1$1> $completion) { return (Continuation<Unit>)new TransitionKt$rememberTransition$1$1(this.$transitionState, $completion); }
/*      */     @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((TransitionKt$rememberTransition$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\0020\001\"\004\b\000\020\002*\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "T", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}) @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$rememberTransition$2$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,2186:1\n63#2,5:2187\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$rememberTransition$2$1\n*L\n839#1:2187,5\n*E\n"}) static final class TransitionKt$rememberTransition$2$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
/*      */     @NotNull public final DisposableEffectResult invoke(@NotNull DisposableEffectScope $this$DisposableEffect) { Intrinsics.checkNotNullParameter($this$DisposableEffect, "$this$DisposableEffect"); DisposableEffectScope disposableEffectScope = $this$DisposableEffect; Transition<T> transition = this.$transition; int $i$f$onDispose = 0; return new TransitionKt$rememberTransition$2$1$invoke$$inlined$onDispose$1(transition); } TransitionKt$rememberTransition$2$1(Transition<T> $transition) { super(1); } } @Deprecated(message = "Use rememberTransition() instead", replaceWith = @ReplaceWith(expression = "rememberTransition(transitionState, label)", imports = {})) @Composable @NotNull public static final <T> Transition<T> updateTransition(@NotNull MutableTransitionState<?> transitionState, @Nullable String label, @Nullable Composer $composer, int $changed, int paramInt1) { Intrinsics.checkNotNullParameter(transitionState, "transitionState"); ComposerKt.sourceInformationMarkerStart($composer, 882913843, "C(updateTransition)P(1)876@36714L32:Transition.kt#pdpnli"); if ((paramInt1 & 0x2) != 0)
/*      */       label = null;  if (ComposerKt.isTraceInProgress())
/*      */       ComposerKt.traceEventStart(882913843, $changed, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:874)");  TransitionState<?> state = transitionState; Transition<?> transition = rememberTransition(state, label, $composer, 0xE & $changed | 0x70 & $changed, 0); if (ComposerKt.isTraceInProgress())
/*      */       ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer); return (Transition)transition; } @RestrictTo({RestrictTo.Scope.LIBRARY}) @Composable @NotNull public static final <S, T, V extends AnimationVector> Transition<S>.DeferredAnimation<T, V> createDeferredAnimation(@NotNull Transition<S> $this$createDeferredAnimation, @NotNull TwoWayConverter<?, AnimationVector> typeConverter, @Nullable String label, @Nullable Composer $composer, int $changed, int paramInt1) { Intrinsics.checkNotNullParameter($this$createDeferredAnimation, "<this>"); Intrinsics.checkNotNullParameter(typeConverter, "typeConverter"); ComposerKt.sourceInformationMarkerStart($composer, -1714122528, "C(createDeferredAnimation)P(1)1781@72682L58,1782@72772L75,1782@72745L102:Transition.kt#pdpnli"); if ((paramInt1 & 0x2) != 0)
/*      */       label = "DeferredAnimation";  if (ComposerKt.isTraceInProgress())
/*      */       ComposerKt.traceEventStart(-1714122528, $changed, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1780)");  ComposerKt.sourceInformationMarkerStart($composer, -1378232737, "CC(remember):Transition.kt#9igjgp");
/*      */     Composer composer1 = $composer;
/*      */     boolean invalid$iv = ((($changed & 0xE ^ 0x6) > 4 && $composer.changed($this$createDeferredAnimation)) || ($changed & 0x6) == 4);
/*      */     int $i$f$cache = 0;
/* 2217 */     Object it$iv = composer1.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 2218 */     if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
/* 2219 */       int $i$a$-cache-TransitionKt$createDeferredAnimation$lazyAnim$1 = 0; Object<Object, AnimationVector> value$iv = (Object<Object, AnimationVector>)new Transition.DeferredAnimation<>($this$createDeferredAnimation, typeConverter, label);
/* 2220 */       composer1.updateRememberedValue(value$iv);
/*      */     } 
/* 2222 */     Transition<S>.DeferredAnimation<T, V> deferredAnimation1 = (Transition.DeferredAnimation)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); Transition<S>.DeferredAnimation<T, V> lazyAnim = deferredAnimation1; ComposerKt.sourceInformationMarkerStart($composer, -1378229840, "CC(remember):Transition.kt#9igjgp"); Composer $this$cache$iv = $composer; int i = (((($changed & 0xE ^ 0x6) > 4 && $composer.changed($this$createDeferredAnimation)) || ($changed & 0x6) == 4) ? 1 : 0) | $composer.changedInstance(lazyAnim); $i$f$cache = 0;
/* 2223 */     it$iv = $this$cache$iv.rememberedValue(); $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 2224 */     if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/* 2225 */       Transition<S>.DeferredAnimation<T, V> deferredAnimation = lazyAnim; int $i$a$-cache-TransitionKt$createDeferredAnimation$1 = 0; Object value$iv = new TransitionKt$createDeferredAnimation$1$1($this$createDeferredAnimation, lazyAnim);
/* 2226 */       $this$cache$iv.updateRememberedValue(value$iv);
/*      */     } 
/* 2228 */     Function1 function1 = (Function1)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); EffectsKt.DisposableEffect(deferredAnimation, function1, $composer, 0); if ($this$createDeferredAnimation.isSeeking()) lazyAnim.setupSeeking$animation_core();  if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer); return lazyAnim; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\003\"\b\b\002\020\004*\0020\005*\0020\006H\n¢\006\002\b\007"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "S", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}) @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createDeferredAnimation$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,2186:1\n63#2,5:2187\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createDeferredAnimation$1$1\n*L\n1784#1:2187,5\n*E\n"}) static final class TransitionKt$createDeferredAnimation$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
/* 2229 */     @NotNull public final DisposableEffectResult invoke(@NotNull DisposableEffectScope $this$DisposableEffect) { Intrinsics.checkNotNullParameter($this$DisposableEffect, "$this$DisposableEffect"); DisposableEffectScope disposableEffectScope = $this$DisposableEffect; Transition<S> transition = this.$this_createDeferredAnimation; Transition<S>.DeferredAnimation<T, V> deferredAnimation = this.$lazyAnim; int $i$f$onDispose = 0; return new TransitionKt$createDeferredAnimation$1$1$invoke$$inlined$onDispose$1(transition, deferredAnimation); } TransitionKt$createDeferredAnimation$1$1(Transition<S> $receiver, Transition<S>.DeferredAnimation<T, V> $lazyAnim) { super(1); } } @ExperimentalTransitionApi @Composable @ComposableInferredTarget(scheme = "[0[0]]") @NotNull public static final <S, T> Transition<T> createChildTransition(@NotNull Transition<?> $this$createChildTransition, @Nullable String label, @NotNull Function3 transformToChildState, @Nullable Composer $composer, int $changed, int paramInt1) { Intrinsics.checkNotNullParameter($this$createChildTransition, "<this>"); Intrinsics.checkNotNullParameter(transformToChildState, "transformToChildState"); int $i$f$createChildTransition = 0; ComposerKt.sourceInformationMarkerStart($composer, 1215497572, "CC(createChildTransition)1814@74186L36,1815@74246L74,1816@74343L39,1817@74394L63:Transition.kt#pdpnli"); if ((paramInt1 & 0x1) != 0) label = "ChildTransition";  ComposerKt.sourceInformationMarkerStart($composer, 272028789, "CC(remember):Transition.kt#9igjgp"); Composer composer = $composer; boolean invalid$iv = ((($changed & 0xE ^ 0x6) > 4 && $composer.changed($this$createChildTransition)) || ($changed & 0x6) == 4); int $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 2230 */     if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
/* 2231 */       int $i$a$-cache-TransitionKt$createChildTransition$initialParentState$1 = 0; Object value$iv = $this$createChildTransition.getCurrentState();
/* 2232 */       composer.updateRememberedValue(value$iv);
/*      */     } 
/* 2234 */     Object object1 = it$iv; ComposerKt.sourceInformationMarkerEnd($composer); Object initialParentState = object1; Object initialState = transformToChildState.invoke($this$createChildTransition.isSeeking() ? $this$createChildTransition.getCurrentState() : initialParentState, $composer, Integer.valueOf(0x70 & $changed >> 3)); Object targetState = transformToChildState.invoke($this$createChildTransition.getTargetState(), $composer, Integer.valueOf(0x70 & $changed >> 3)); Transition<T> transition = createChildTransitionInternal($this$createChildTransition, initialState, targetState, label, $composer, 0xE & $changed | 0x1C00 & $changed << 6); ComposerKt.sourceInformationMarkerEnd($composer); return transition; } @PublishedApi @Composable @NotNull public static final <S, T> Transition<T> createChildTransitionInternal(@NotNull Transition<?> $this$createChildTransitionInternal, Object initialState, Object targetState, @NotNull String childLabel, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$createChildTransitionInternal, "<this>"); Intrinsics.checkNotNullParameter(childLabel, "childLabel"); ComposerKt.sourceInformationMarkerStart($composer, -198307638, "C(createChildTransitionInternal)P(1,2)1827@74657L116,1831@74808L112,1831@74779L141:Transition.kt#pdpnli"); if (ComposerKt.isTraceInProgress())
/* 2235 */       ComposerKt.traceEventStart(-198307638, $changed, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1826)");  ComposerKt.sourceInformationMarkerStart($composer, 1039291970, "CC(remember):Transition.kt#9igjgp"); Composer composer1 = $composer; boolean invalid$iv = ((($changed & 0xE ^ 0x6) > 4 && $composer.changed($this$createChildTransitionInternal)) || ($changed & 0x6) == 4); int $i$f$cache = 0; Object it$iv = composer1.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 2236 */     if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
/* 2237 */       int $i$a$-cache-TransitionKt$createChildTransitionInternal$transition$1 = 0; Object value$iv = new Transition(new MutableTransitionState(initialState), $this$createChildTransitionInternal, $this$createChildTransitionInternal.getLabel() + " > " + childLabel);
/* 2238 */       composer1.updateRememberedValue(value$iv);
/*      */     } 
/* 2240 */     Transition<T> transition1 = (Transition)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); Transition<T> transition = transition1; ComposerKt.sourceInformationMarkerStart($composer, 1039296798, "CC(remember):Transition.kt#9igjgp"); Composer $this$cache$iv = $composer; int i = (((($changed & 0xE ^ 0x6) > 4 && $composer.changed($this$createChildTransitionInternal)) || ($changed & 0x6) == 4) ? 1 : 0) | $composer.changed(transition); $i$f$cache = 0;
/* 2241 */     it$iv = $this$cache$iv.rememberedValue(); $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 2242 */     if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/* 2243 */       Transition<T> transition2 = transition; int $i$a$-cache-TransitionKt$createChildTransitionInternal$1 = 0; Object value$iv = new TransitionKt$createChildTransitionInternal$1$1((Transition)$this$createChildTransitionInternal, transition);
/* 2244 */       $this$cache$iv.updateRememberedValue(value$iv);
/*      */     } 
/* 2246 */     Function1 function1 = (Function1)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); EffectsKt.DisposableEffect(transition2, function1, $composer, 0); if ($this$createChildTransitionInternal.isSeeking()) { transition.seek((T)initialState, (T)targetState, $this$createChildTransitionInternal.getLastSeekedTimeNanos$animation_core()); } else { transition.updateTarget$animation_core((T)targetState); transition.setSeeking$animation_core(false); }  if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer); return transition; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\003*\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "S", "T", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}) @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createChildTransitionInternal$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,2186:1\n63#2,5:2187\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createChildTransitionInternal$1$1\n*L\n1834#1:2187,5\n*E\n"}) static final class TransitionKt$createChildTransitionInternal$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
/* 2247 */     @NotNull public final DisposableEffectResult invoke(@NotNull DisposableEffectScope $this$DisposableEffect) { Intrinsics.checkNotNullParameter($this$DisposableEffect, "$this$DisposableEffect"); this.$this_createChildTransitionInternal.addTransition$animation_core(this.$transition); DisposableEffectScope disposableEffectScope = $this$DisposableEffect; Transition<S> transition = this.$this_createChildTransitionInternal; Transition<T> transition1 = this.$transition; int $i$f$onDispose = 0; return new TransitionKt$createChildTransitionInternal$1$1$invoke$$inlined$onDispose$1(transition, transition1); } TransitionKt$createChildTransitionInternal$1$1(Transition<S> $receiver, Transition<T> $transition) { super(1); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 176) @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateValue$1\n*L\n1#1,2186:1\n*E\n"}) public static final class TransitionKt$animateValue$1 extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<T>> { public static final TransitionKt$animateValue$1 INSTANCE = new TransitionKt$animateValue$1(); public TransitionKt$animateValue$1() { super(3); } @Composable @NotNull public final SpringSpec<T> invoke(@NotNull Transition.Segment $this$null, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$null, "$this$null"); $composer.startReplaceGroup(-895531546); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-895531546, $changed, -1, "androidx.compose.animation.core.animateValue.<anonymous> (Transition.kt:1881)");  SpringSpec<T> springSpec = AnimationSpecKt.spring$default(0.0F, 0.0F, null, 7, null); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return springSpec; } } @Composable @ComposableInferredTarget(scheme = "[0[0][0]]") @NotNull public static final <S, T, V extends AnimationVector> State<T> animateValue(@NotNull Transition<?> $this$animateValue, @NotNull TwoWayConverter<Object, AnimationVector> typeConverter, @Nullable Function3 transitionSpec, @Nullable String label, @NotNull Function3 targetValueByState, @Nullable Composer $composer, int $changed, int paramInt1) { Intrinsics.checkNotNullParameter($this$animateValue, "<this>"); Intrinsics.checkNotNullParameter(typeConverter, "typeConverter"); Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState"); int $i$f$animateValue = 0; ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1886@77187L32,1887@77242L31,1888@77298L23,1890@77334L89:Transition.kt#pdpnli"); if ((paramInt1 & 0x2) != 0) transitionSpec = TransitionKt$animateValue$1.INSTANCE;  if ((paramInt1 & 0x4) != 0) label = "ValueAnimation";  Object initialValue = targetValueByState.invoke($this$animateValue.getCurrentState(), $composer, Integer.valueOf(0x70 & $changed >> 9)); Object targetValue = targetValueByState.invoke($this$animateValue.getTargetState(), $composer, Integer.valueOf(0x70 & $changed >> 9)); FiniteAnimationSpec animationSpec = (FiniteAnimationSpec)transitionSpec.invoke($this$animateValue.getSegment(), $composer, Integer.valueOf(0x70 & $changed >> 3)); State<T> state = createTransitionAnimation($this$animateValue, initialValue, targetValue, animationSpec, typeConverter, label, $composer, 0xE & $changed | 0xE000 & $changed << 9 | 0x70000 & $changed << 6); ComposerKt.sourceInformationMarkerEnd($composer); return state; } @PublishedApi @Composable @NotNull public static final <S, T, V extends AnimationVector> State<T> createTransitionAnimation(@NotNull Transition<S> $this$createTransitionAnimation, Object initialValue, Object targetValue, @NotNull FiniteAnimationSpec animationSpec, @NotNull TwoWayConverter typeConverter, @NotNull String label, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$createTransitionAnimation, "<this>"); Intrinsics.checkNotNullParameter(animationSpec, "animationSpec"); Intrinsics.checkNotNullParameter(typeConverter, "typeConverter"); Intrinsics.checkNotNullParameter(label, "label"); ComposerKt.sourceInformationMarkerStart($composer, -304821198, "C(createTransitionAnimation)P(1,3!1,4)1902@77723L499,1925@78606L128,1925@78568L166:Transition.kt#pdpnli"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-304821198, $changed, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1901)");  ComposerKt.sourceInformationMarkerStart($composer, 1397691138, "CC(remember):Transition.kt#9igjgp"); Composer composer1 = $composer; boolean invalid$iv = ((($changed & 0xE ^ 0x6) > 4 && $composer.changed($this$createTransitionAnimation)) || ($changed & 0x6) == 4); int $i$f$cache = 0; Object it$iv = composer1.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 2248 */     if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
/* 2249 */       int $i$a$-cache-TransitionKt$createTransitionAnimation$transitionAnimation$1 = 0;
/*      */     }
/*      */     
/* 2252 */     Transition<S>.TransitionAnimationState<T, V> transitionAnimationState1 = (Transition.TransitionAnimationState)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); Transition<S>.TransitionAnimationState<T, V> transitionAnimation = transitionAnimationState1; if ($this$createTransitionAnimation.isSeeking()) { transitionAnimation.updateInitialAndTargetValue$animation_core(initialValue, targetValue, animationSpec); } else { transitionAnimation.updateTargetValue$animation_core(targetValue, animationSpec); }
/* 2253 */      ComposerKt.sourceInformationMarkerStart($composer, 1397719023, "CC(remember):Transition.kt#9igjgp"); Composer $this$cache$iv = $composer; int i = (((($changed & 0xE ^ 0x6) > 4 && $composer.changed($this$createTransitionAnimation)) || ($changed & 0x6) == 4) ? 1 : 0) | $composer.changed(transitionAnimation); $i$f$cache = 0; it$iv = $this$cache$iv.rememberedValue(); $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 2254 */     if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/* 2255 */       Transition<S>.TransitionAnimationState<T, V> transitionAnimationState = transitionAnimation; int $i$a$-cache-TransitionKt$createTransitionAnimation$1 = 0; Object value$iv = new TransitionKt$createTransitionAnimation$1$1($this$createTransitionAnimation, transitionAnimation);
/* 2256 */       $this$cache$iv.updateRememberedValue(value$iv);
/*      */     } 
/* 2258 */     Function1 function1 = (Function1)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); EffectsKt.DisposableEffect(transitionAnimationState, function1, $composer, 0); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer); return transitionAnimation; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\003\"\b\b\002\020\004*\0020\005*\0020\006H\n¢\006\002\b\007"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "S", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}) @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createTransitionAnimation$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,2186:1\n63#2,5:2187\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$createTransitionAnimation$1$1\n*L\n1928#1:2187,5\n*E\n"}) static final class TransitionKt$createTransitionAnimation$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
/* 2259 */     @NotNull public final DisposableEffectResult invoke(@NotNull DisposableEffectScope $this$DisposableEffect) { Intrinsics.checkNotNullParameter($this$DisposableEffect, "$this$DisposableEffect"); this.$this_createTransitionAnimation.addAnimation$animation_core(this.$transitionAnimation); DisposableEffectScope disposableEffectScope = $this$DisposableEffect; Transition<S> transition = this.$this_createTransitionAnimation; Transition<S>.TransitionAnimationState<T, V> transitionAnimationState = this.$transitionAnimation; int $i$f$onDispose = 0; return new TransitionKt$createTransitionAnimation$1$1$invoke$$inlined$onDispose$1(transition, transitionAnimationState); } TransitionKt$createTransitionAnimation$1$1(Transition<S> $receiver, Transition<S>.TransitionAnimationState<T, V> $transitionAnimation) { super(1); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 176) @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateFloat$1\n*L\n1#1,2186:1\n*E\n"}) public static final class TransitionKt$animateFloat$1 extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Float>> { public static final TransitionKt$animateFloat$1 INSTANCE = new TransitionKt$animateFloat$1(); public TransitionKt$animateFloat$1() { super(3); } @Composable @NotNull public final SpringSpec<Float> invoke(@NotNull Transition.Segment $this$null, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$null, "$this$null"); $composer.startReplaceGroup(-522164544); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-522164544, $changed, -1, "androidx.compose.animation.core.animateFloat.<anonymous> (Transition.kt:1965)");  SpringSpec<Float> springSpec = AnimationSpecKt.spring$default(0.0F, 0.0F, null, 7, null); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return springSpec; } } @Composable @ComposableInferredTarget(scheme = "[0[0][0]]") @NotNull public static final <S> State<Float> animateFloat(@NotNull Transition<?> $this$animateFloat, @Nullable Function3 transitionSpec, @Nullable String label, @NotNull Function3 targetValueByState, @Nullable Composer $composer, int $changed, int paramInt1) { Intrinsics.checkNotNullParameter($this$animateFloat, "<this>"); Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState"); int $i$f$animateFloat = 0; ComposerKt.sourceInformationMarkerStart($composer, -1338768149, "CC(animateFloat)P(2)1969@80624L78:Transition.kt#pdpnli"); if ((paramInt1 & 0x1) != 0) transitionSpec = TransitionKt$animateFloat$1.INSTANCE;  if ((paramInt1 & 0x2) != 0) label = "FloatAnimation";  Transition<?> transition = $this$animateFloat; TwoWayConverter<Float, AnimationVector1D> twoWayConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE); int $changed$iv = 0xE & $changed | 0x380 & $changed << 3 | 0x1C00 & $changed << 3 | 0xE000 & $changed << 3, $i$f$animateValue = 0; ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1886@77187L32,1887@77242L31,1888@77298L23,1890@77334L89:Transition.kt#pdpnli");
/*      */     
/* 2261 */     Object initialValue$iv = targetValueByState.invoke(transition.getCurrentState(), $composer, Integer.valueOf(0x70 & $changed$iv >> 9));
/* 2262 */     Object targetValue$iv = targetValueByState.invoke(transition.getTargetState(), $composer, Integer.valueOf(0x70 & $changed$iv >> 9));
/* 2263 */     FiniteAnimationSpec animationSpec$iv = (FiniteAnimationSpec)transitionSpec.invoke(transition.getSegment(), $composer, Integer.valueOf(0x70 & $changed$iv >> 3));
/*      */     
/* 2265 */     State<Float> state2 = createTransitionAnimation(transition, initialValue$iv, targetValue$iv, animationSpec$iv, (TwoWayConverter)twoWayConverter, label, $composer, 0xE & $changed$iv | 0xE000 & $changed$iv << 9 | 0x70000 & $changed$iv << 6); ComposerKt.sourceInformationMarkerEnd($composer); State<Float> state1 = state2; ComposerKt.sourceInformationMarkerEnd($composer); return state1; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 176) @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateDp$1\n*L\n1#1,2186:1\n*E\n"}) public static final class TransitionKt$animateDp$1 extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Dp>> {
/* 2266 */     public static final TransitionKt$animateDp$1 INSTANCE = new TransitionKt$animateDp$1(); @Composable @NotNull public final SpringSpec<Dp> invoke(@NotNull Transition.Segment $this$null, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$null, "$this$null"); $composer.startReplaceGroup(-575880366); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-575880366, $changed, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:1995)");  SpringSpec<Dp> springSpec = AnimationSpecKt.spring$default(0.0F, 0.0F, Dp.box-impl(VisibilityThresholdsKt.getVisibilityThreshold(Dp.Companion)), 3, null); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return springSpec; } public TransitionKt$animateDp$1() { super(3); } } @Composable @ComposableInferredTarget(scheme = "[0[0][0]]") @NotNull public static final <S> State<Dp> animateDp(@NotNull Transition<?> $this$animateDp, @Nullable Function3 transitionSpec, @Nullable String label, @NotNull Function3 targetValueByState, @Nullable Composer $composer, int $changed, int paramInt1) { Intrinsics.checkNotNullParameter($this$animateDp, "<this>"); Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState"); int $i$f$animateDp = 0; ComposerKt.sourceInformationMarkerStart($composer, 184732935, "CC(animateDp)P(2)2000@82338L75:Transition.kt#pdpnli"); if ((paramInt1 & 0x1) != 0) transitionSpec = TransitionKt$animateDp$1.INSTANCE;  if ((paramInt1 & 0x2) != 0) label = "DpAnimation";  Transition<?> transition = $this$animateDp; TwoWayConverter<Dp, AnimationVector1D> twoWayConverter = VectorConvertersKt.getVectorConverter(Dp.Companion); int $changed$iv = 0xE & $changed | 0x380 & $changed << 3 | 0x1C00 & $changed << 3 | 0xE000 & $changed << 3, $i$f$animateValue = 0; ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1886@77187L32,1887@77242L31,1888@77298L23,1890@77334L89:Transition.kt#pdpnli");
/*      */     
/* 2268 */     Object initialValue$iv = targetValueByState.invoke(transition.getCurrentState(), $composer, Integer.valueOf(0x70 & $changed$iv >> 9));
/* 2269 */     Object targetValue$iv = targetValueByState.invoke(transition.getTargetState(), $composer, Integer.valueOf(0x70 & $changed$iv >> 9));
/* 2270 */     FiniteAnimationSpec animationSpec$iv = (FiniteAnimationSpec)transitionSpec.invoke(transition.getSegment(), $composer, Integer.valueOf(0x70 & $changed$iv >> 3));
/*      */     
/* 2272 */     State<Dp> state2 = createTransitionAnimation(transition, initialValue$iv, targetValue$iv, animationSpec$iv, (TwoWayConverter)twoWayConverter, label, $composer, 0xE & $changed$iv | 0xE000 & $changed$iv << 9 | 0x70000 & $changed$iv << 6); ComposerKt.sourceInformationMarkerEnd($composer); State<Dp> state1 = state2; ComposerKt.sourceInformationMarkerEnd($composer); return state1; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 176) @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateOffset$1\n*L\n1#1,2186:1\n*E\n"}) public static final class TransitionKt$animateOffset$1 extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Offset>> {
/* 2273 */     public static final TransitionKt$animateOffset$1 INSTANCE = new TransitionKt$animateOffset$1(); @Composable @NotNull public final SpringSpec<Offset> invoke(@NotNull Transition.Segment $this$null, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$null, "$this$null"); $composer.startReplaceGroup(1623385561); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1623385561, $changed, -1, "androidx.compose.animation.core.animateOffset.<anonymous> (Transition.kt:2026)");  SpringSpec<Offset> springSpec = AnimationSpecKt.spring$default(0.0F, 0.0F, Offset.box-impl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.Companion)), 3, null); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return springSpec; } public TransitionKt$animateOffset$1() { super(3); } } @Composable @ComposableInferredTarget(scheme = "[0[0][0]]") @NotNull public static final <S> State<Offset> animateOffset(@NotNull Transition<?> $this$animateOffset, @Nullable Function3 transitionSpec, @Nullable String label, @NotNull Function3 targetValueByState, @Nullable Composer $composer, int $changed, int paramInt1) { Intrinsics.checkNotNullParameter($this$animateOffset, "<this>"); Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState"); int $i$f$animateOffset = 0; ComposerKt.sourceInformationMarkerStart($composer, 2078477582, "CC(animateOffset)P(2)2031@84078L79:Transition.kt#pdpnli"); if ((paramInt1 & 0x1) != 0) transitionSpec = TransitionKt$animateOffset$1.INSTANCE;  if ((paramInt1 & 0x2) != 0) label = "OffsetAnimation";  Transition<?> transition = $this$animateOffset; TwoWayConverter<Offset, AnimationVector2D> twoWayConverter = VectorConvertersKt.getVectorConverter(Offset.Companion); int $changed$iv = 0xE & $changed | 0x380 & $changed << 3 | 0x1C00 & $changed << 3 | 0xE000 & $changed << 3, $i$f$animateValue = 0; ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1886@77187L32,1887@77242L31,1888@77298L23,1890@77334L89:Transition.kt#pdpnli");
/*      */     
/* 2275 */     Object initialValue$iv = targetValueByState.invoke(transition.getCurrentState(), $composer, Integer.valueOf(0x70 & $changed$iv >> 9));
/* 2276 */     Object targetValue$iv = targetValueByState.invoke(transition.getTargetState(), $composer, Integer.valueOf(0x70 & $changed$iv >> 9));
/* 2277 */     FiniteAnimationSpec animationSpec$iv = (FiniteAnimationSpec)transitionSpec.invoke(transition.getSegment(), $composer, Integer.valueOf(0x70 & $changed$iv >> 3));
/*      */     
/* 2279 */     State<Offset> state2 = createTransitionAnimation(transition, initialValue$iv, targetValue$iv, animationSpec$iv, (TwoWayConverter)twoWayConverter, label, $composer, 0xE & $changed$iv | 0xE000 & $changed$iv << 9 | 0x70000 & $changed$iv << 6); ComposerKt.sourceInformationMarkerEnd($composer); State<Offset> state1 = state2; ComposerKt.sourceInformationMarkerEnd($composer); return state1; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 176) @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateSize$1\n*L\n1#1,2186:1\n*E\n"}) public static final class TransitionKt$animateSize$1 extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Size>> {
/* 2280 */     public static final TransitionKt$animateSize$1 INSTANCE = new TransitionKt$animateSize$1(); @Composable @NotNull public final SpringSpec<Size> invoke(@NotNull Transition.Segment $this$null, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$null, "$this$null"); $composer.startReplaceGroup(-1607152761); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1607152761, $changed, -1, "androidx.compose.animation.core.animateSize.<anonymous> (Transition.kt:2057)");  SpringSpec<Size> springSpec = AnimationSpecKt.spring$default(0.0F, 0.0F, Size.box-impl(VisibilityThresholdsKt.getVisibilityThreshold(Size.Companion)), 3, null); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return springSpec; } public TransitionKt$animateSize$1() { super(3); } } @Composable @ComposableInferredTarget(scheme = "[0[0][0]]") @NotNull public static final <S> State<Size> animateSize(@NotNull Transition<?> $this$animateSize, @Nullable Function3 transitionSpec, @Nullable String label, @NotNull Function3 targetValueByState, @Nullable Composer $composer, int $changed, int paramInt1) { Intrinsics.checkNotNullParameter($this$animateSize, "<this>"); Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState"); int $i$f$animateSize = 0; ComposerKt.sourceInformationMarkerStart($composer, -802210820, "CC(animateSize)P(2)2062@85807L77:Transition.kt#pdpnli"); if ((paramInt1 & 0x1) != 0) transitionSpec = TransitionKt$animateSize$1.INSTANCE;  if ((paramInt1 & 0x2) != 0) label = "SizeAnimation";  Transition<?> transition = $this$animateSize; TwoWayConverter<Size, AnimationVector2D> twoWayConverter = VectorConvertersKt.getVectorConverter(Size.Companion); int $changed$iv = 0xE & $changed | 0x380 & $changed << 3 | 0x1C00 & $changed << 3 | 0xE000 & $changed << 3, $i$f$animateValue = 0; ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1886@77187L32,1887@77242L31,1888@77298L23,1890@77334L89:Transition.kt#pdpnli");
/*      */     
/* 2282 */     Object initialValue$iv = targetValueByState.invoke(transition.getCurrentState(), $composer, Integer.valueOf(0x70 & $changed$iv >> 9));
/* 2283 */     Object targetValue$iv = targetValueByState.invoke(transition.getTargetState(), $composer, Integer.valueOf(0x70 & $changed$iv >> 9));
/* 2284 */     FiniteAnimationSpec animationSpec$iv = (FiniteAnimationSpec)transitionSpec.invoke(transition.getSegment(), $composer, Integer.valueOf(0x70 & $changed$iv >> 3));
/*      */     
/* 2286 */     State<Size> state2 = createTransitionAnimation(transition, initialValue$iv, targetValue$iv, animationSpec$iv, (TwoWayConverter)twoWayConverter, label, $composer, 0xE & $changed$iv | 0xE000 & $changed$iv << 9 | 0x70000 & $changed$iv << 6); ComposerKt.sourceInformationMarkerEnd($composer); State<Size> state1 = state2; ComposerKt.sourceInformationMarkerEnd($composer); return state1; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 176) @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateIntOffset$1\n*L\n1#1,2186:1\n*E\n"}) public static final class TransitionKt$animateIntOffset$1 extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<IntOffset>> {
/* 2287 */     public static final TransitionKt$animateIntOffset$1 INSTANCE = new TransitionKt$animateIntOffset$1(); public TransitionKt$animateIntOffset$1() { super(3); } @Composable @NotNull public final SpringSpec<IntOffset> invoke(@NotNull Transition.Segment $this$null, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$null, "$this$null"); $composer.startReplaceGroup(-1953479610); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1953479610, $changed, -1, "androidx.compose.animation.core.animateIntOffset.<anonymous> (Transition.kt:2089)");  SpringSpec<IntOffset> springSpec = AnimationSpecKt.spring$default(0.0F, 0.0F, IntOffset.box-impl(IntOffsetKt.IntOffset(1, 1)), 3, null); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return springSpec; } } @Composable @ComposableInferredTarget(scheme = "[0[0][0]]") @NotNull public static final <S> State<IntOffset> animateIntOffset(@NotNull Transition<?> $this$animateIntOffset, @Nullable Function3 transitionSpec, @Nullable String label, @NotNull Function3 targetValueByState, @Nullable Composer $composer, int $changed, int paramInt1) { Intrinsics.checkNotNullParameter($this$animateIntOffset, "<this>"); Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState"); int $i$f$animateIntOffset = 0; ComposerKt.sourceInformationMarkerStart($composer, 776131825, "CC(animateIntOffset)P(2)2093@87555L82:Transition.kt#pdpnli"); if ((paramInt1 & 0x1) != 0) transitionSpec = TransitionKt$animateIntOffset$1.INSTANCE;  if ((paramInt1 & 0x2) != 0) label = "IntOffsetAnimation";  Transition<?> transition = $this$animateIntOffset; TwoWayConverter<IntOffset, AnimationVector2D> twoWayConverter = VectorConvertersKt.getVectorConverter(IntOffset.Companion); int $changed$iv = 0xE & $changed | 0x380 & $changed << 3 | 0x1C00 & $changed << 3 | 0xE000 & $changed << 3, $i$f$animateValue = 0; ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1886@77187L32,1887@77242L31,1888@77298L23,1890@77334L89:Transition.kt#pdpnli");
/*      */     
/* 2289 */     Object initialValue$iv = targetValueByState.invoke(transition.getCurrentState(), $composer, Integer.valueOf(0x70 & $changed$iv >> 9));
/* 2290 */     Object targetValue$iv = targetValueByState.invoke(transition.getTargetState(), $composer, Integer.valueOf(0x70 & $changed$iv >> 9));
/* 2291 */     FiniteAnimationSpec animationSpec$iv = (FiniteAnimationSpec)transitionSpec.invoke(transition.getSegment(), $composer, Integer.valueOf(0x70 & $changed$iv >> 3));
/*      */     
/* 2293 */     State<IntOffset> state2 = createTransitionAnimation(transition, initialValue$iv, targetValue$iv, animationSpec$iv, (TwoWayConverter)twoWayConverter, label, $composer, 0xE & $changed$iv | 0xE000 & $changed$iv << 9 | 0x70000 & $changed$iv << 6); ComposerKt.sourceInformationMarkerEnd($composer); State<IntOffset> state1 = state2; ComposerKt.sourceInformationMarkerEnd($composer); return state1; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 176) @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateInt$1\n*L\n1#1,2186:1\n*E\n"}) public static final class TransitionKt$animateInt$1 extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Integer>> {
/* 2294 */     public static final TransitionKt$animateInt$1 INSTANCE = new TransitionKt$animateInt$1(); @Composable @NotNull public final SpringSpec<Integer> invoke(@NotNull Transition.Segment $this$null, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$null, "$this$null"); $composer.startReplaceGroup(-785273069); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-785273069, $changed, -1, "androidx.compose.animation.core.animateInt.<anonymous> (Transition.kt:2119)");  SpringSpec<Integer> springSpec = AnimationSpecKt.spring$default(0.0F, 0.0F, Integer.valueOf(1), 3, null); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return springSpec; } public TransitionKt$animateInt$1() { super(3); } } @Composable @ComposableInferredTarget(scheme = "[0[0][0]]") @NotNull public static final <S> State<Integer> animateInt(@NotNull Transition<?> $this$animateInt, @Nullable Function3 transitionSpec, @Nullable String label, @NotNull Function3 targetValueByState, @Nullable Composer $composer, int $changed, int paramInt1) { Intrinsics.checkNotNullParameter($this$animateInt, "<this>"); Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState"); int $i$f$animateInt = 0; ComposerKt.sourceInformationMarkerStart($composer, 1318902782, "CC(animateInt)P(2)2124@89258L76:Transition.kt#pdpnli"); if ((paramInt1 & 0x1) != 0) transitionSpec = TransitionKt$animateInt$1.INSTANCE;  if ((paramInt1 & 0x2) != 0) label = "IntAnimation";  Transition<?> transition = $this$animateInt; TwoWayConverter<Integer, AnimationVector1D> twoWayConverter = VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE); int $changed$iv = 0xE & $changed | 0x380 & $changed << 3 | 0x1C00 & $changed << 3 | 0xE000 & $changed << 3, $i$f$animateValue = 0; ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1886@77187L32,1887@77242L31,1888@77298L23,1890@77334L89:Transition.kt#pdpnli");
/*      */     
/* 2296 */     Object initialValue$iv = targetValueByState.invoke(transition.getCurrentState(), $composer, Integer.valueOf(0x70 & $changed$iv >> 9));
/* 2297 */     Object targetValue$iv = targetValueByState.invoke(transition.getTargetState(), $composer, Integer.valueOf(0x70 & $changed$iv >> 9));
/* 2298 */     FiniteAnimationSpec animationSpec$iv = (FiniteAnimationSpec)transitionSpec.invoke(transition.getSegment(), $composer, Integer.valueOf(0x70 & $changed$iv >> 3));
/*      */     
/* 2300 */     State<Integer> state2 = createTransitionAnimation(transition, initialValue$iv, targetValue$iv, animationSpec$iv, (TwoWayConverter)twoWayConverter, label, $composer, 0xE & $changed$iv | 0xE000 & $changed$iv << 9 | 0x70000 & $changed$iv << 6); ComposerKt.sourceInformationMarkerEnd($composer); State<Integer> state1 = state2; ComposerKt.sourceInformationMarkerEnd($composer); return state1; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 176) @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateIntSize$1\n*L\n1#1,2186:1\n*E\n"}) public static final class TransitionKt$animateIntSize$1 extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<IntSize>> {
/* 2301 */     public static final TransitionKt$animateIntSize$1 INSTANCE = new TransitionKt$animateIntSize$1(); public TransitionKt$animateIntSize$1() { super(3); } @Composable @NotNull public final SpringSpec<IntSize> invoke(@NotNull Transition.Segment $this$null, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$null, "$this$null"); $composer.startReplaceGroup(967893300); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(967893300, $changed, -1, "androidx.compose.animation.core.animateIntSize.<anonymous> (Transition.kt:2150)");  SpringSpec<IntSize> springSpec = AnimationSpecKt.spring$default(0.0F, 0.0F, IntSize.box-impl(IntSizeKt.IntSize(1, 1)), 3, null); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return springSpec; } } @Composable @ComposableInferredTarget(scheme = "[0[0][0]]") @NotNull public static final <S> State<IntSize> animateIntSize(@NotNull Transition<?> $this$animateIntSize, @Nullable Function3 transitionSpec, @Nullable String label, @NotNull Function3 targetValueByState, @Nullable Composer $composer, int $changed, int paramInt1) { Intrinsics.checkNotNullParameter($this$animateIntSize, "<this>"); Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState"); int $i$f$animateIntSize = 0; ComposerKt.sourceInformationMarkerStart($composer, -2104123233, "CC(animateIntSize)P(2)2154@90987L80:Transition.kt#pdpnli"); if ((paramInt1 & 0x1) != 0) transitionSpec = TransitionKt$animateIntSize$1.INSTANCE;  if ((paramInt1 & 0x2) != 0) label = "IntSizeAnimation";  Transition<?> transition = $this$animateIntSize; TwoWayConverter<IntSize, AnimationVector2D> twoWayConverter = VectorConvertersKt.getVectorConverter(IntSize.Companion); int $changed$iv = 0xE & $changed | 0x380 & $changed << 3 | 0x1C00 & $changed << 3 | 0xE000 & $changed << 3, $i$f$animateValue = 0; ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1886@77187L32,1887@77242L31,1888@77298L23,1890@77334L89:Transition.kt#pdpnli");
/*      */     
/* 2303 */     Object initialValue$iv = targetValueByState.invoke(transition.getCurrentState(), $composer, Integer.valueOf(0x70 & $changed$iv >> 9));
/* 2304 */     Object targetValue$iv = targetValueByState.invoke(transition.getTargetState(), $composer, Integer.valueOf(0x70 & $changed$iv >> 9));
/* 2305 */     FiniteAnimationSpec animationSpec$iv = (FiniteAnimationSpec)transitionSpec.invoke(transition.getSegment(), $composer, Integer.valueOf(0x70 & $changed$iv >> 3));
/*      */     
/* 2307 */     State<IntSize> state2 = createTransitionAnimation(transition, initialValue$iv, targetValue$iv, animationSpec$iv, (TwoWayConverter)twoWayConverter, label, $composer, 0xE & $changed$iv | 0xE000 & $changed$iv << 9 | 0x70000 & $changed$iv << 6); ComposerKt.sourceInformationMarkerEnd($composer); State<IntSize> state1 = state2; ComposerKt.sourceInformationMarkerEnd($composer); return state1; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 176) @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateRect$1\n*L\n1#1,2186:1\n*E\n"}) public static final class TransitionKt$animateRect$1 extends Lambda implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Rect>> {
/* 2308 */     public static final TransitionKt$animateRect$1 INSTANCE = new TransitionKt$animateRect$1(); public TransitionKt$animateRect$1() { super(3); } @Composable @NotNull public final SpringSpec<Rect> invoke(@NotNull Transition.Segment $this$null, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$null, "$this$null"); $composer.startReplaceGroup(691336298); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(691336298, $changed, -1, "androidx.compose.animation.core.animateRect.<anonymous> (Transition.kt:2180)");  SpringSpec<Rect> springSpec = AnimationSpecKt.spring$default(0.0F, 0.0F, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 3, null); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return springSpec; } } @Composable @ComposableInferredTarget(scheme = "[0[0][0]]") @NotNull public static final <S> State<Rect> animateRect(@NotNull Transition<?> $this$animateRect, @Nullable Function3 transitionSpec, @Nullable String label, @NotNull Function3 targetValueByState, @Nullable Composer $composer, int $changed, int paramInt1) { Intrinsics.checkNotNullParameter($this$animateRect, "<this>"); Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState"); int $i$f$animateRect = 0; ComposerKt.sourceInformationMarkerStart($composer, 1496278239, "CC(animateRect)P(2)2184@92713L77:Transition.kt#pdpnli"); if ((paramInt1 & 0x1) != 0) transitionSpec = TransitionKt$animateRect$1.INSTANCE;  if ((paramInt1 & 0x2) != 0) label = "RectAnimation";  Transition<?> transition = $this$animateRect; TwoWayConverter<Rect, AnimationVector4D> twoWayConverter = VectorConvertersKt.getVectorConverter(Rect.Companion); int $changed$iv = 0xE & $changed | 0x380 & $changed << 3 | 0x1C00 & $changed << 3 | 0xE000 & $changed << 3, $i$f$animateValue = 0; ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1886@77187L32,1887@77242L31,1888@77298L23,1890@77334L89:Transition.kt#pdpnli");
/*      */     
/* 2310 */     Object initialValue$iv = targetValueByState.invoke(transition.getCurrentState(), $composer, Integer.valueOf(0x70 & $changed$iv >> 9));
/* 2311 */     Object targetValue$iv = targetValueByState.invoke(transition.getTargetState(), $composer, Integer.valueOf(0x70 & $changed$iv >> 9));
/* 2312 */     FiniteAnimationSpec animationSpec$iv = (FiniteAnimationSpec)transitionSpec.invoke(transition.getSegment(), $composer, Integer.valueOf(0x70 & $changed$iv >> 3));
/*      */     
/* 2314 */     State<Rect> state2 = createTransitionAnimation(transition, initialValue$iv, targetValue$iv, animationSpec$iv, (TwoWayConverter)twoWayConverter, label, $composer, 0xE & $changed$iv | 0xE000 & $changed$iv << 9 | 0x70000 & $changed$iv << 6); ComposerKt.sourceInformationMarkerEnd($composer);
/*      */     State<Rect> state1 = state2;
/*      */     ComposerKt.sourceInformationMarkerEnd($composer);
/*      */     return state1; }
/*      */ 
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\TransitionKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */