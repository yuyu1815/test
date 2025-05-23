/*     */ package androidx.compose.animation;
/*     */ 
/*     */ import androidx.compose.animation.core.MutableTransitionState;
/*     */ import androidx.compose.animation.core.Transition;
/*     */ import androidx.compose.foundation.layout.ColumnScope;
/*     */ import androidx.compose.foundation.layout.RowScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.ProduceStateScope;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.SnapshotStateKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.Measurable;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.unit.Constraints;
/*     */ import androidx.compose.ui.unit.IntSize;
/*     */ import androidx.compose.ui.unit.IntSizeKt;
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
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000l\n\000\n\002\020\013\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\b\032\001\020\006\032\0020\007\"\004\b\000\020\b2\f\020\t\032\b\022\004\022\002H\b0\0022\022\020\n\032\016\022\004\022\002H\b\022\004\022\0020\0010\0132\006\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\0212\030\020\022\032\024\022\004\022\0020\003\022\004\022\0020\003\022\004\022\0020\0010\0232\n\b\002\020\024\032\004\030\0010\0252\034\020\026\032\030\022\004\022\0020\027\022\004\022\0020\0070\013¢\006\002\b\030¢\006\002\b\031H\001¢\006\002\020\032\032a\020\033\032\0020\0072\f\020\034\032\b\022\004\022\0020\0010\0352\b\b\002\020\f\032\0020\r2\b\b\002\020\016\032\0020\0172\b\b\002\020\020\032\0020\0212\b\b\002\020\036\032\0020\0372\034\020\026\032\030\022\004\022\0020\027\022\004\022\0020\0070\013¢\006\002\b\030¢\006\002\b\031H\007¢\006\002\020 \032[\020\033\032\0020\0072\006\020\n\032\0020\0012\b\b\002\020\f\032\0020\r2\b\b\002\020\016\032\0020\0172\b\b\002\020\020\032\0020\0212\b\b\002\020\036\032\0020\0372\034\020\026\032\030\022\004\022\0020\027\022\004\022\0020\0070\013¢\006\002\b\030¢\006\002\b\031H\007¢\006\002\020!\032k\020\"\032\0020\007\"\004\b\000\020\b2\f\020\t\032\b\022\004\022\002H\b0\0022\022\020\n\032\016\022\004\022\002H\b\022\004\022\0020\0010\0132\006\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\0212\034\020\026\032\030\022\004\022\0020\027\022\004\022\0020\0070\013¢\006\002\b\030¢\006\002\b\031H\001¢\006\002\020#\032m\020\033\032\0020\007\"\004\b\000\020\b*\b\022\004\022\002H\b0\0022\022\020\n\032\016\022\004\022\002H\b\022\004\022\0020\0010\0132\b\b\002\020\f\032\0020\r2\b\b\002\020\016\032\0020\0172\b\b\002\020\020\032\0020\0212\034\020\026\032\030\022\004\022\0020\027\022\004\022\0020\0070\013¢\006\002\b\030¢\006\002\b\031H\007¢\006\002\020$\032e\020\033\032\0020\007*\0020%2\f\020\034\032\b\022\004\022\0020\0010\0352\b\b\002\020\f\032\0020\r2\b\b\002\020\016\032\0020\0172\b\b\002\020\020\032\0020\0212\b\b\002\020\036\032\0020\0372\034\020\026\032\030\022\004\022\0020\027\022\004\022\0020\0070\013¢\006\002\b\030¢\006\002\b\031H\007¢\006\002\020&\032_\020\033\032\0020\007*\0020%2\006\020\n\032\0020\0012\b\b\002\020\f\032\0020\r2\b\b\002\020\016\032\0020\0172\b\b\002\020\020\032\0020\0212\b\b\002\020\036\032\0020\0372\034\020\026\032\030\022\004\022\0020\027\022\004\022\0020\0070\013¢\006\002\b\030¢\006\002\b\031H\007¢\006\002\020'\032e\020\033\032\0020\007*\0020(2\f\020\034\032\b\022\004\022\0020\0010\0352\b\b\002\020\f\032\0020\r2\b\b\002\020\016\032\0020\0172\b\b\002\020\020\032\0020\0212\b\b\002\020\036\032\0020\0372\034\020\026\032\030\022\004\022\0020\027\022\004\022\0020\0070\013¢\006\002\b\030¢\006\002\b\031H\007¢\006\002\020)\032_\020\033\032\0020\007*\0020(2\006\020\n\032\0020\0012\b\b\002\020\f\032\0020\r2\b\b\002\020\016\032\0020\0172\b\b\002\020\020\032\0020\0212\b\b\002\020\036\032\0020\0372\034\020\026\032\030\022\004\022\0020\027\022\004\022\0020\0070\013¢\006\002\b\030¢\006\002\b\031H\007¢\006\002\020*\0329\020+\032\0020\003\"\004\b\000\020\b*\b\022\004\022\002H\b0\0022\022\020\n\032\016\022\004\022\002H\b\022\004\022\0020\0010\0132\006\020,\032\002H\bH\003¢\006\002\020-\"\036\020\000\032\0020\001*\b\022\004\022\0020\0030\0028BX\004¢\006\006\032\004\b\004\020\005¨\006.²\006\"\020/\032\024\022\004\022\0020\003\022\004\022\0020\003\022\004\022\0020\0010\023\"\004\b\000\020\bX\002²\006\020\0200\032\0020\001\"\004\b\000\020\bX\002"}, d2 = {"exitFinished", "", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "getExitFinished", "(Landroidx/compose/animation/core/Transition;)Z", "AnimatedEnterExitImpl", "", "T", "transition", "visible", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "shouldDisposeBlock", "Lkotlin/Function2;", "onLookaheadMeasured", "Landroidx/compose/animation/OnLookaheadMeasured;", "content", "Landroidx/compose/animation/AnimatedVisibilityScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function2;Landroidx/compose/animation/OnLookaheadMeasured;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "AnimatedVisibility", "visibleState", "Landroidx/compose/animation/core/MutableTransitionState;", "label", "", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "AnimatedVisibilityImpl", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/ColumnScope;", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/RowScope;", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/RowScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "targetEnterExit", "targetState", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterExitState;", "animation", "shouldDisposeBlockUpdated", "shouldDisposeAfterExit"})
/*     */ @SourceDebugExtension({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,885:1\n1225#2,6:886\n1225#2,6:894\n1225#2,6:903\n1225#2,6:909\n1225#2,6:915\n1225#2,6:921\n1225#2,6:958\n1814#3,2:892\n1816#3,3:900\n79#4,6:927\n86#4,4:942\n90#4,2:952\n94#4:957\n368#5,9:933\n377#5,3:954\n4034#6,6:946\n81#7:964\n81#7:965\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt\n*L\n698#1:886,6\n742#1:894,6\n753#1:903,6\n769#1:909,6\n776#1:915,6\n795#1:921,6\n869#1:958,6\n742#1:892,2\n742#1:900,3\n770#1:927,6\n770#1:942,4\n770#1:952,2\n770#1:957\n770#1:933,9\n770#1:954,3\n770#1:946,6\n746#1:964\n748#1:965\n*E\n"})
/*     */ public final class AnimatedVisibilityKt
/*     */ {
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[0[0]]")
/*     */   public static final void AnimatedVisibility(boolean visible, @Nullable Modifier modifier, @Nullable EnterTransition enter, @Nullable ExitTransition exit, @Nullable String label, @NotNull Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed, int paramInt1) {
/* 132 */     Intrinsics.checkNotNullParameter(content, "content"); $composer = $composer.startRestartGroup(2088733774); ComposerKt.sourceInformation($composer, "C(AnimatedVisibility)P(5,4,1,2,3)132@6967L32,133@7004L84:AnimatedVisibility.kt#xbi5r1"); int $dirty = $changed; if ((paramInt1 & 0x1) != 0) { $dirty |= 0x6; } else if (($changed & 0x6) == 0) { $dirty |= $composer.changed(visible) ? 4 : 2; }  if ((paramInt1 & 0x2) != 0) { $dirty |= 0x30; } else if (($changed & 0x30) == 0) { $dirty |= $composer.changed(modifier) ? 32 : 16; }  if ((paramInt1 & 0x4) != 0) { $dirty |= 0x180; } else if (($changed & 0x180) == 0) { $dirty |= $composer.changed(enter) ? 256 : 128; }  if ((paramInt1 & 0x8) != 0) { $dirty |= 0xC00; } else if (($changed & 0xC00) == 0) { $dirty |= $composer.changed(exit) ? 2048 : 1024; }  if ((paramInt1 & 0x10) != 0) { $dirty |= 0x6000; } else if (($changed & 0x6000) == 0) { $dirty |= $composer.changed(label) ? 16384 : 8192; }  if ((paramInt1 & 0x20) != 0) { $dirty |= 0x30000; } else if (($changed & 0x30000) == 0) { $dirty |= $composer.changedInstance(content) ? 131072 : 65536; }  if (($dirty & 0x12493) != 74898 || !$composer.getSkipping()) { if ((paramInt1 & 0x2) != 0)
/*     */         modifier = (Modifier)Modifier.Companion;  if ((paramInt1 & 0x4) != 0)
/*     */         enter = EnterExitTransitionKt.fadeIn$default(null, 0.0F, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));  }
/* 135 */      $composer.skipToGroupEnd(); if ($composer.endRestartGroup() != null) { $composer.endRestartGroup().updateScope(new AnimatedVisibilityKt$AnimatedVisibility$2(visible, modifier, enter, exit, label, content, $changed, paramInt1)); } else { $composer.endRestartGroup(); }
/*     */   
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
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\b\003\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "it", "invoke", "(Z)Ljava/lang/Boolean;"})
/*     */   static final class AnimatedVisibilityKt$AnimatedVisibility$1
/*     */     extends Lambda
/*     */     implements Function1<Boolean, Boolean>
/*     */   {
/*     */     public static final AnimatedVisibilityKt$AnimatedVisibility$1 INSTANCE = new AnimatedVisibilityKt$AnimatedVisibility$1();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AnimatedVisibilityKt$AnimatedVisibility$1() {
/*     */       super(1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final Boolean invoke(boolean it) {
/*     */       return Boolean.valueOf(it);
/*     */     }
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
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[0[0]]")
/*     */   public static final void AnimatedVisibility(@NotNull RowScope $this$AnimatedVisibility, boolean visible, @Nullable Modifier modifier, @Nullable EnterTransition enter, @Nullable ExitTransition exit, @Nullable String label, @NotNull Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed, int paramInt1) {
/* 207 */     Intrinsics.checkNotNullParameter($this$AnimatedVisibility, "<this>"); Intrinsics.checkNotNullParameter(content, "content"); $composer = $composer.startRestartGroup(-1741346906); ComposerKt.sourceInformation($composer, "C(AnimatedVisibility)P(5,4,1,2,3)207@11272L32,208@11309L84:AnimatedVisibility.kt#xbi5r1"); int $dirty = $changed; if ((paramInt1 & 0x1) != 0) { $dirty |= 0x30; } else if (($changed & 0x30) == 0) { $dirty |= $composer.changed(visible) ? 32 : 16; }  if ((paramInt1 & 0x2) != 0) { $dirty |= 0x180; } else if (($changed & 0x180) == 0) { $dirty |= $composer.changed(modifier) ? 256 : 128; }  if ((paramInt1 & 0x4) != 0) { $dirty |= 0xC00; } else if (($changed & 0xC00) == 0) { $dirty |= $composer.changed(enter) ? 2048 : 1024; }  if ((paramInt1 & 0x8) != 0) { $dirty |= 0x6000; } else if (($changed & 0x6000) == 0) { $dirty |= $composer.changed(exit) ? 16384 : 8192; }  if ((paramInt1 & 0x10) != 0) { $dirty |= 0x30000; } else if (($changed & 0x30000) == 0) { $dirty |= $composer.changed(label) ? 131072 : 65536; }  if ((paramInt1 & 0x20) != 0) { $dirty |= 0x180000; } else if (($changed & 0x180000) == 0) { $dirty |= $composer.changedInstance(content) ? 1048576 : 524288; }  if (($dirty & 0x92491) != 599184 || !$composer.getSkipping()) { if ((paramInt1 & 0x2) != 0)
/*     */         modifier = (Modifier)Modifier.Companion;  if ((paramInt1 & 0x4) != 0)
/*     */         enter = EnterExitTransitionKt.fadeIn$default(null, 0.0F, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null));  }
/* 210 */      $composer.skipToGroupEnd(); if ($composer.endRestartGroup() != null) { $composer.endRestartGroup().updateScope(new AnimatedVisibilityKt$AnimatedVisibility$4($this$AnimatedVisibility, visible, modifier, enter, exit, label, content, $changed, paramInt1)); } else { $composer.endRestartGroup(); }
/*     */   
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
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\b\003\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "it", "invoke", "(Z)Ljava/lang/Boolean;"})
/*     */   static final class AnimatedVisibilityKt$AnimatedVisibility$3
/*     */     extends Lambda
/*     */     implements Function1<Boolean, Boolean>
/*     */   {
/*     */     public static final AnimatedVisibilityKt$AnimatedVisibility$3 INSTANCE = new AnimatedVisibilityKt$AnimatedVisibility$3();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AnimatedVisibilityKt$AnimatedVisibility$3() {
/*     */       super(1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final Boolean invoke(boolean it) {
/*     */       return Boolean.valueOf(it);
/*     */     }
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
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[0[0]]")
/*     */   public static final void AnimatedVisibility(@NotNull ColumnScope $this$AnimatedVisibility, boolean visible, @Nullable Modifier modifier, @Nullable EnterTransition enter, @Nullable ExitTransition exit, @Nullable String label, @NotNull Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed, int paramInt1) {
/* 280 */     Intrinsics.checkNotNullParameter($this$AnimatedVisibility, "<this>"); Intrinsics.checkNotNullParameter(content, "content"); $composer = $composer.startRestartGroup(1766503102); ComposerKt.sourceInformation($composer, "C(AnimatedVisibility)P(5,4,1,2,3)280@15555L32,281@15592L84:AnimatedVisibility.kt#xbi5r1"); int $dirty = $changed; if ((paramInt1 & 0x1) != 0) { $dirty |= 0x30; } else if (($changed & 0x30) == 0) { $dirty |= $composer.changed(visible) ? 32 : 16; }  if ((paramInt1 & 0x2) != 0) { $dirty |= 0x180; } else if (($changed & 0x180) == 0) { $dirty |= $composer.changed(modifier) ? 256 : 128; }  if ((paramInt1 & 0x4) != 0) { $dirty |= 0xC00; } else if (($changed & 0xC00) == 0) { $dirty |= $composer.changed(enter) ? 2048 : 1024; }  if ((paramInt1 & 0x8) != 0) { $dirty |= 0x6000; } else if (($changed & 0x6000) == 0) { $dirty |= $composer.changed(exit) ? 16384 : 8192; }  if ((paramInt1 & 0x10) != 0) { $dirty |= 0x30000; } else if (($changed & 0x30000) == 0) { $dirty |= $composer.changed(label) ? 131072 : 65536; }  if ((paramInt1 & 0x20) != 0) { $dirty |= 0x180000; } else if (($changed & 0x180000) == 0) { $dirty |= $composer.changedInstance(content) ? 1048576 : 524288; }  if (($dirty & 0x92491) != 599184 || !$composer.getSkipping()) { if ((paramInt1 & 0x2) != 0)
/*     */         modifier = (Modifier)Modifier.Companion;  if ((paramInt1 & 0x4) != 0)
/*     */         enter = EnterExitTransitionKt.fadeIn$default(null, 0.0F, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null));  }
/* 283 */      $composer.skipToGroupEnd(); if ($composer.endRestartGroup() != null) { $composer.endRestartGroup().updateScope(new AnimatedVisibilityKt$AnimatedVisibility$6($this$AnimatedVisibility, visible, modifier, enter, exit, label, content, $changed, paramInt1)); } else { $composer.endRestartGroup(); }
/*     */   
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
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\b\003\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "it", "invoke", "(Z)Ljava/lang/Boolean;"})
/*     */   static final class AnimatedVisibilityKt$AnimatedVisibility$5
/*     */     extends Lambda
/*     */     implements Function1<Boolean, Boolean>
/*     */   {
/*     */     public static final AnimatedVisibilityKt$AnimatedVisibility$5 INSTANCE = new AnimatedVisibilityKt$AnimatedVisibility$5();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AnimatedVisibilityKt$AnimatedVisibility$5() {
/*     */       super(1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final Boolean invoke(boolean it) {
/*     */       return Boolean.valueOf(it);
/*     */     }
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
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[0[0]]")
/*     */   public static final void AnimatedVisibility(@NotNull MutableTransitionState<Boolean> visibleState, @Nullable Modifier modifier, @Nullable EnterTransition enter, @Nullable ExitTransition exit, @Nullable String label, @NotNull Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed, int paramInt1) {
/* 385 */     Intrinsics.checkNotNullParameter(visibleState, "visibleState"); Intrinsics.checkNotNullParameter(content, "content"); $composer = $composer.startRestartGroup(-222898426); ComposerKt.sourceInformation($composer, "C(AnimatedVisibility)P(5,4,1,2,3)385@20955L39,386@20999L84:AnimatedVisibility.kt#xbi5r1"); int $dirty = $changed; if ((paramInt1 & 0x1) != 0) { $dirty |= 0x6; } else if (($changed & 0x6) == 0) { $dirty |= ((($changed & 0x8) == 0) ? $composer.changed(visibleState) : $composer.changedInstance(visibleState)) ? 4 : 2; }  if ((paramInt1 & 0x2) != 0) { $dirty |= 0x30; } else if (($changed & 0x30) == 0) { $dirty |= $composer.changed(modifier) ? 32 : 16; }  if ((paramInt1 & 0x4) != 0) { $dirty |= 0x180; } else if (($changed & 0x180) == 0) { $dirty |= $composer.changed(enter) ? 256 : 128; }  if ((paramInt1 & 0x8) != 0) { $dirty |= 0xC00; } else if (($changed & 0xC00) == 0) { $dirty |= $composer.changed(exit) ? 2048 : 1024; }  if ((paramInt1 & 0x10) != 0) { $dirty |= 0x6000; } else if (($changed & 0x6000) == 0) { $dirty |= $composer.changed(label) ? 16384 : 8192; }  if ((paramInt1 & 0x20) != 0) { $dirty |= 0x30000; } else if (($changed & 0x30000) == 0) { $dirty |= $composer.changedInstance(content) ? 131072 : 65536; }  if (($dirty & 0x12493) != 74898 || !$composer.getSkipping()) { if ((paramInt1 & 0x2) != 0)
/*     */         modifier = (Modifier)Modifier.Companion;  if ((paramInt1 & 0x4) != 0)
/*     */         enter = EnterExitTransitionKt.fadeIn$default(null, 0.0F, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));  }
/* 388 */      $composer.skipToGroupEnd(); if ($composer.endRestartGroup() != null) { $composer.endRestartGroup().updateScope(new AnimatedVisibilityKt$AnimatedVisibility$8(visibleState, modifier, enter, exit, label, content, $changed, paramInt1)); } else { $composer.endRestartGroup(); }
/*     */   
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
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\b\003\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "it", "invoke", "(Z)Ljava/lang/Boolean;"})
/*     */   static final class AnimatedVisibilityKt$AnimatedVisibility$7
/*     */     extends Lambda
/*     */     implements Function1<Boolean, Boolean>
/*     */   {
/*     */     public static final AnimatedVisibilityKt$AnimatedVisibility$7 INSTANCE = new AnimatedVisibilityKt$AnimatedVisibility$7();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AnimatedVisibilityKt$AnimatedVisibility$7() {
/*     */       super(1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final Boolean invoke(boolean it) {
/*     */       return Boolean.valueOf(it);
/*     */     }
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
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[0[0]]")
/*     */   public static final void AnimatedVisibility(@NotNull RowScope $this$AnimatedVisibility, @NotNull MutableTransitionState<Boolean> visibleState, @Nullable Modifier modifier, @Nullable EnterTransition enter, @Nullable ExitTransition exit, @Nullable String label, @NotNull Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed, int paramInt1) {
/* 460 */     Intrinsics.checkNotNullParameter($this$AnimatedVisibility, "<this>"); Intrinsics.checkNotNullParameter(visibleState, "visibleState"); Intrinsics.checkNotNullParameter(content, "content"); $composer = $composer.startRestartGroup(836509870); ComposerKt.sourceInformation($composer, "C(AnimatedVisibility)P(5,4,1,2,3)460@25318L39,461@25362L84:AnimatedVisibility.kt#xbi5r1"); int $dirty = $changed; if ((paramInt1 & 0x1) != 0) { $dirty |= 0x30; } else if (($changed & 0x30) == 0) { $dirty |= ((($changed & 0x40) == 0) ? $composer.changed(visibleState) : $composer.changedInstance(visibleState)) ? 32 : 16; }  if ((paramInt1 & 0x2) != 0) { $dirty |= 0x180; } else if (($changed & 0x180) == 0) { $dirty |= $composer.changed(modifier) ? 256 : 128; }  if ((paramInt1 & 0x4) != 0) { $dirty |= 0xC00; } else if (($changed & 0xC00) == 0) { $dirty |= $composer.changed(enter) ? 2048 : 1024; }  if ((paramInt1 & 0x8) != 0) { $dirty |= 0x6000; } else if (($changed & 0x6000) == 0) { $dirty |= $composer.changed(exit) ? 16384 : 8192; }  if ((paramInt1 & 0x10) != 0) { $dirty |= 0x30000; } else if (($changed & 0x30000) == 0) { $dirty |= $composer.changed(label) ? 131072 : 65536; }  if ((paramInt1 & 0x20) != 0) { $dirty |= 0x180000; } else if (($changed & 0x180000) == 0) { $dirty |= $composer.changedInstance(content) ? 1048576 : 524288; }  if (($dirty & 0x92491) != 599184 || !$composer.getSkipping()) { if ((paramInt1 & 0x2) != 0)
/*     */         modifier = (Modifier)Modifier.Companion;  if ((paramInt1 & 0x4) != 0)
/*     */         enter = EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0F, 3, null));  }
/* 463 */      $composer.skipToGroupEnd(); if ($composer.endRestartGroup() != null) { $composer.endRestartGroup().updateScope(new AnimatedVisibilityKt$AnimatedVisibility$10($this$AnimatedVisibility, visibleState, modifier, enter, exit, label, content, $changed, paramInt1)); } else { $composer.endRestartGroup(); }
/*     */   
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
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\b\003\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "it", "invoke", "(Z)Ljava/lang/Boolean;"})
/*     */   static final class AnimatedVisibilityKt$AnimatedVisibility$9
/*     */     extends Lambda
/*     */     implements Function1<Boolean, Boolean>
/*     */   {
/*     */     public static final AnimatedVisibilityKt$AnimatedVisibility$9 INSTANCE = new AnimatedVisibilityKt$AnimatedVisibility$9();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AnimatedVisibilityKt$AnimatedVisibility$9() {
/*     */       super(1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final Boolean invoke(boolean it) {
/*     */       return Boolean.valueOf(it);
/*     */     }
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
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[0[0]]")
/*     */   public static final void AnimatedVisibility(@NotNull ColumnScope $this$AnimatedVisibility, @NotNull MutableTransitionState<Boolean> visibleState, @Nullable Modifier modifier, @Nullable EnterTransition enter, @Nullable ExitTransition exit, @Nullable String label, @NotNull Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed, int paramInt1) {
/* 536 */     Intrinsics.checkNotNullParameter($this$AnimatedVisibility, "<this>"); Intrinsics.checkNotNullParameter(visibleState, "visibleState"); Intrinsics.checkNotNullParameter(content, "content"); $composer = $composer.startRestartGroup(-850656618); ComposerKt.sourceInformation($composer, "C(AnimatedVisibility)P(5,4,1,2,3)536@29773L39,537@29817L84:AnimatedVisibility.kt#xbi5r1"); int $dirty = $changed; if ((paramInt1 & 0x1) != 0) { $dirty |= 0x30; } else if (($changed & 0x30) == 0) { $dirty |= ((($changed & 0x40) == 0) ? $composer.changed(visibleState) : $composer.changedInstance(visibleState)) ? 32 : 16; }  if ((paramInt1 & 0x2) != 0) { $dirty |= 0x180; } else if (($changed & 0x180) == 0) { $dirty |= $composer.changed(modifier) ? 256 : 128; }  if ((paramInt1 & 0x4) != 0) { $dirty |= 0xC00; } else if (($changed & 0xC00) == 0) { $dirty |= $composer.changed(enter) ? 2048 : 1024; }  if ((paramInt1 & 0x8) != 0) { $dirty |= 0x6000; } else if (($changed & 0x6000) == 0) { $dirty |= $composer.changed(exit) ? 16384 : 8192; }  if ((paramInt1 & 0x10) != 0) { $dirty |= 0x30000; } else if (($changed & 0x30000) == 0) { $dirty |= $composer.changed(label) ? 131072 : 65536; }  if ((paramInt1 & 0x20) != 0) { $dirty |= 0x180000; } else if (($changed & 0x180000) == 0) { $dirty |= $composer.changedInstance(content) ? 1048576 : 524288; }  if (($dirty & 0x92491) != 599184 || !$composer.getSkipping()) { if ((paramInt1 & 0x2) != 0)
/*     */         modifier = (Modifier)Modifier.Companion;  if ((paramInt1 & 0x4) != 0)
/*     */         enter = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0F, 3, null));  }
/* 539 */      $composer.skipToGroupEnd(); if ($composer.endRestartGroup() != null) { $composer.endRestartGroup().updateScope(new AnimatedVisibilityKt$AnimatedVisibility$12($this$AnimatedVisibility, visibleState, modifier, enter, exit, label, content, $changed, paramInt1)); } else { $composer.endRestartGroup(); }
/*     */   
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
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\b\003\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "it", "invoke", "(Z)Ljava/lang/Boolean;"})
/*     */   static final class AnimatedVisibilityKt$AnimatedVisibility$11
/*     */     extends Lambda
/*     */     implements Function1<Boolean, Boolean>
/*     */   {
/*     */     public static final AnimatedVisibilityKt$AnimatedVisibility$11 INSTANCE = new AnimatedVisibilityKt$AnimatedVisibility$11();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AnimatedVisibilityKt$AnimatedVisibility$11() {
/*     */       super(1);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final Boolean invoke(boolean it) {
/*     */       return Boolean.valueOf(it);
/*     */     }
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
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[0[0]]")
/*     */   public static final <T> void AnimatedVisibility(@NotNull Transition<T> $this$AnimatedVisibility, @NotNull Function1<? super T, Boolean> visible, @Nullable Modifier modifier, @Nullable EnterTransition enter, @Nullable ExitTransition exit, @NotNull Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed, int paramInt1) {
/* 610 */     Intrinsics.checkNotNullParameter($this$AnimatedVisibility, "<this>"); Intrinsics.checkNotNullParameter(visible, "visible"); Intrinsics.checkNotNullParameter(content, "content"); $composer = $composer.startRestartGroup(1031950689); ComposerKt.sourceInformation($composer, "C(AnimatedVisibility)P(4,3,1,2)609@34120L79:AnimatedVisibility.kt#xbi5r1"); int $dirty = $changed; if ((paramInt1 & Integer.MIN_VALUE) != 0) { $dirty |= 0x6; } else if (($changed & 0x6) == 0) { $dirty |= $composer.changed($this$AnimatedVisibility) ? 4 : 2; }  if ((paramInt1 & 0x1) != 0) { $dirty |= 0x30; } else if (($changed & 0x30) == 0) { $dirty |= $composer.changedInstance(visible) ? 32 : 16; }  if ((paramInt1 & 0x2) != 0) { $dirty |= 0x180; } else if (($changed & 0x180) == 0) { $dirty |= $composer.changed(modifier) ? 256 : 128; }  if ((paramInt1 & 0x4) != 0) { $dirty |= 0xC00; } else if (($changed & 0xC00) == 0) { $dirty |= $composer.changed(enter) ? 2048 : 1024; }  if ((paramInt1 & 0x8) != 0) { $dirty |= 0x6000; } else if (($changed & 0x6000) == 0) { $dirty |= $composer.changed(exit) ? 16384 : 8192; }  if ((paramInt1 & 0x10) != 0) { $dirty |= 0x30000; } else if (($changed & 0x30000) == 0) { $dirty |= $composer.changedInstance(content) ? 131072 : 65536; }  if (($dirty & 0x12493) != 74898 || !$composer.getSkipping()) { if ((paramInt1 & 0x2) != 0) modifier = (Modifier)Modifier.Companion;  if ((paramInt1 & 0x4) != 0) enter = EnterExitTransitionKt.fadeIn$default(null, 0.0F, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));  }  $composer.skipToGroupEnd(); if ($composer.endRestartGroup() != null) { $composer.endRestartGroup().updateScope(new AnimatedVisibilityKt$AnimatedVisibility$13($this$AnimatedVisibility, visible, modifier, enter, exit, content, $changed, paramInt1)); } else { $composer.endRestartGroup(); }
/*     */   
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
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[0[0]]")
/*     */   public static final <T> void AnimatedVisibilityImpl(@NotNull Transition<T> transition, @NotNull Function1<? super T, Boolean> visible, @NotNull Modifier modifier, @NotNull EnterTransition enter, @NotNull ExitTransition exit, @NotNull Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'transition'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: ldc_w 'visible'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload_2
/*     */     //   15: ldc_w 'modifier'
/*     */     //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   21: aload_3
/*     */     //   22: ldc_w 'enter'
/*     */     //   25: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   28: aload #4
/*     */     //   30: ldc_w 'exit'
/*     */     //   33: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   36: aload #5
/*     */     //   38: ldc 'content'
/*     */     //   40: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   43: aload #6
/*     */     //   45: ldc_w 429978603
/*     */     //   48: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   53: astore #6
/*     */     //   55: aload #6
/*     */     //   57: ldc_w 'C(AnimatedVisibilityImpl)P(4,5,3,1,2)697@38299L415,694@38181L703:AnimatedVisibility.kt#xbi5r1'
/*     */     //   60: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   63: iload #7
/*     */     //   65: istore #8
/*     */     //   67: iload #7
/*     */     //   69: bipush #6
/*     */     //   71: iand
/*     */     //   72: ifne -> 96
/*     */     //   75: iload #8
/*     */     //   77: aload #6
/*     */     //   79: aload_0
/*     */     //   80: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   85: ifeq -> 92
/*     */     //   88: iconst_4
/*     */     //   89: goto -> 93
/*     */     //   92: iconst_2
/*     */     //   93: ior
/*     */     //   94: istore #8
/*     */     //   96: iload #7
/*     */     //   98: bipush #48
/*     */     //   100: iand
/*     */     //   101: ifne -> 127
/*     */     //   104: iload #8
/*     */     //   106: aload #6
/*     */     //   108: aload_1
/*     */     //   109: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   114: ifeq -> 122
/*     */     //   117: bipush #32
/*     */     //   119: goto -> 124
/*     */     //   122: bipush #16
/*     */     //   124: ior
/*     */     //   125: istore #8
/*     */     //   127: iload #7
/*     */     //   129: sipush #384
/*     */     //   132: iand
/*     */     //   133: ifne -> 161
/*     */     //   136: iload #8
/*     */     //   138: aload #6
/*     */     //   140: aload_2
/*     */     //   141: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   146: ifeq -> 155
/*     */     //   149: sipush #256
/*     */     //   152: goto -> 158
/*     */     //   155: sipush #128
/*     */     //   158: ior
/*     */     //   159: istore #8
/*     */     //   161: iload #7
/*     */     //   163: sipush #3072
/*     */     //   166: iand
/*     */     //   167: ifne -> 195
/*     */     //   170: iload #8
/*     */     //   172: aload #6
/*     */     //   174: aload_3
/*     */     //   175: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   180: ifeq -> 189
/*     */     //   183: sipush #2048
/*     */     //   186: goto -> 192
/*     */     //   189: sipush #1024
/*     */     //   192: ior
/*     */     //   193: istore #8
/*     */     //   195: iload #7
/*     */     //   197: sipush #24576
/*     */     //   200: iand
/*     */     //   201: ifne -> 230
/*     */     //   204: iload #8
/*     */     //   206: aload #6
/*     */     //   208: aload #4
/*     */     //   210: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   215: ifeq -> 224
/*     */     //   218: sipush #16384
/*     */     //   221: goto -> 227
/*     */     //   224: sipush #8192
/*     */     //   227: ior
/*     */     //   228: istore #8
/*     */     //   230: iload #7
/*     */     //   232: ldc 196608
/*     */     //   234: iand
/*     */     //   235: ifne -> 262
/*     */     //   238: iload #8
/*     */     //   240: aload #6
/*     */     //   242: aload #5
/*     */     //   244: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   249: ifeq -> 257
/*     */     //   252: ldc 131072
/*     */     //   254: goto -> 259
/*     */     //   257: ldc 65536
/*     */     //   259: ior
/*     */     //   260: istore #8
/*     */     //   262: iload #8
/*     */     //   264: ldc 74899
/*     */     //   266: iand
/*     */     //   267: ldc 74898
/*     */     //   269: if_icmpne -> 282
/*     */     //   272: aload #6
/*     */     //   274: invokeinterface getSkipping : ()Z
/*     */     //   279: ifne -> 516
/*     */     //   282: invokestatic isTraceInProgress : ()Z
/*     */     //   285: ifeq -> 300
/*     */     //   288: ldc_w 429978603
/*     */     //   291: iload #8
/*     */     //   293: iconst_m1
/*     */     //   294: ldc_w 'androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:693)'
/*     */     //   297: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   300: aload_0
/*     */     //   301: aload_1
/*     */     //   302: aload_2
/*     */     //   303: aload #6
/*     */     //   305: ldc_w 689212639
/*     */     //   308: ldc_w 'CC(remember):AnimatedVisibility.kt#9igjgp'
/*     */     //   311: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   314: aload #6
/*     */     //   316: astore #10
/*     */     //   318: iload #8
/*     */     //   320: bipush #112
/*     */     //   322: iand
/*     */     //   323: bipush #32
/*     */     //   325: if_icmpne -> 332
/*     */     //   328: iconst_1
/*     */     //   329: goto -> 333
/*     */     //   332: iconst_0
/*     */     //   333: iload #8
/*     */     //   335: bipush #14
/*     */     //   337: iand
/*     */     //   338: iconst_4
/*     */     //   339: if_icmpne -> 346
/*     */     //   342: iconst_1
/*     */     //   343: goto -> 347
/*     */     //   346: iconst_0
/*     */     //   347: ior
/*     */     //   348: istore #11
/*     */     //   350: iconst_0
/*     */     //   351: istore #12
/*     */     //   353: aload #10
/*     */     //   355: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   360: astore #13
/*     */     //   362: iconst_0
/*     */     //   363: istore #14
/*     */     //   365: iload #11
/*     */     //   367: ifne -> 381
/*     */     //   370: aload #13
/*     */     //   372: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   375: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   378: if_acmpne -> 428
/*     */     //   381: astore #19
/*     */     //   383: astore #18
/*     */     //   385: astore #17
/*     */     //   387: iconst_0
/*     */     //   388: istore #15
/*     */     //   390: new androidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1
/*     */     //   393: dup
/*     */     //   394: aload_1
/*     */     //   395: aload_0
/*     */     //   396: invokespecial <init> : (Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/Transition;)V
/*     */     //   399: checkcast kotlin/jvm/functions/Function3
/*     */     //   402: astore #20
/*     */     //   404: aload #17
/*     */     //   406: aload #18
/*     */     //   408: aload #19
/*     */     //   410: aload #20
/*     */     //   412: astore #16
/*     */     //   414: aload #10
/*     */     //   416: aload #16
/*     */     //   418: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   423: aload #16
/*     */     //   425: goto -> 430
/*     */     //   428: aload #13
/*     */     //   430: nop
/*     */     //   431: nop
/*     */     //   432: nop
/*     */     //   433: checkcast kotlin/jvm/functions/Function3
/*     */     //   436: astore #9
/*     */     //   438: aload #6
/*     */     //   440: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   443: aload #9
/*     */     //   445: invokestatic layout : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;
/*     */     //   448: aload_3
/*     */     //   449: aload #4
/*     */     //   451: getstatic androidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibilityImpl$2.INSTANCE : Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibilityImpl$2;
/*     */     //   454: checkcast kotlin/jvm/functions/Function2
/*     */     //   457: aconst_null
/*     */     //   458: aload #5
/*     */     //   460: aload #6
/*     */     //   462: ldc 196608
/*     */     //   464: bipush #14
/*     */     //   466: iload #8
/*     */     //   468: iand
/*     */     //   469: ior
/*     */     //   470: bipush #112
/*     */     //   472: iload #8
/*     */     //   474: iand
/*     */     //   475: ior
/*     */     //   476: sipush #7168
/*     */     //   479: iload #8
/*     */     //   481: iand
/*     */     //   482: ior
/*     */     //   483: ldc 57344
/*     */     //   485: iload #8
/*     */     //   487: iand
/*     */     //   488: ior
/*     */     //   489: ldc_w 29360128
/*     */     //   492: iload #8
/*     */     //   494: bipush #6
/*     */     //   496: ishl
/*     */     //   497: iand
/*     */     //   498: ior
/*     */     //   499: bipush #64
/*     */     //   501: invokestatic AnimatedEnterExitImpl : (Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function2;Landroidx/compose/animation/OnLookaheadMeasured;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   504: invokestatic isTraceInProgress : ()Z
/*     */     //   507: ifeq -> 523
/*     */     //   510: invokestatic traceEventEnd : ()V
/*     */     //   513: goto -> 523
/*     */     //   516: aload #6
/*     */     //   518: invokeinterface skipToGroupEnd : ()V
/*     */     //   523: aload #6
/*     */     //   525: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   530: dup
/*     */     //   531: ifnull -> 562
/*     */     //   534: new androidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibilityImpl$3
/*     */     //   537: dup
/*     */     //   538: aload_0
/*     */     //   539: aload_1
/*     */     //   540: aload_2
/*     */     //   541: aload_3
/*     */     //   542: aload #4
/*     */     //   544: aload #5
/*     */     //   546: iload #7
/*     */     //   548: invokespecial <init> : (Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;I)V
/*     */     //   551: checkcast kotlin/jvm/functions/Function2
/*     */     //   554: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   559: goto -> 563
/*     */     //   562: pop
/*     */     //   563: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #694	-> 43
/*     */     //   #696	-> 300
/*     */     //   #697	-> 301
/*     */     //   #698	-> 302
/*     */     //   #886	-> 353
/*     */     //   #887	-> 365
/*     */     //   #888	-> 381
/*     */     //   #698	-> 390
/*     */     //   #888	-> 412
/*     */     //   #889	-> 414
/*     */     //   #890	-> 423
/*     */     //   #891	-> 428
/*     */     //   #887	-> 430
/*     */     //   #886	-> 431
/*     */     //   #886	-> 432
/*     */     //   #698	-> 433
/*     */     //   #710	-> 448
/*     */     //   #711	-> 449
/*     */     //   #695	-> 451
/*     */     //   #713	-> 458
/*     */     //   #695	-> 501
/*     */     //   #715	-> 516
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   390	12	15	$i$a$-cache-AnimatedVisibilityKt$AnimatedVisibilityImpl$1	I
/*     */     //   414	11	16	value$iv	Ljava/lang/Object;
/*     */     //   365	66	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   362	69	13	it$iv	Ljava/lang/Object;
/*     */     //   353	80	12	$i$f$cache	I
/*     */     //   350	83	10	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   350	83	11	invalid$iv	Z
/*     */     //   67	497	8	$dirty	I
/*     */     //   0	564	0	transition	Landroidx/compose/animation/core/Transition;
/*     */     //   0	564	1	visible	Lkotlin/jvm/functions/Function1;
/*     */     //   0	564	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	564	3	enter	Landroidx/compose/animation/EnterTransition;
/*     */     //   0	564	4	exit	Landroidx/compose/animation/ExitTransition;
/*     */     //   0	564	5	content	Lkotlin/jvm/functions/Function3;
/*     */     //   0	564	6	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	564	7	$changed	I
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
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\034\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\001\"\004\b\000\020\002*\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\n¢\006\004\b\b\020\t"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "T", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;"})
/*     */   @SourceDebugExtension({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,885:1\n56#2:886\n59#2:887\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1\n*L\n701#1:886\n700#1:887\n*E\n"})
/*     */   static final class AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1
/*     */     extends Lambda
/*     */     implements Function3<MeasureScope, Measurable, Constraints, MeasureResult>
/*     */   {
/*     */     @NotNull
/*     */     public final MeasureResult invoke-3p2s80s(@NotNull MeasureScope $this$layout, @NotNull Measurable measurable, long constraints) {
/* 699 */       Intrinsics.checkNotNullParameter($this$layout, "$this$layout"); Intrinsics.checkNotNullParameter(measurable, "measurable"); Placeable placeable = measurable.measure-BRTryo0(constraints);
/*     */       
/* 701 */       long l = ($this$layout.isLookingAhead() && !((Boolean)this.$visible.invoke(this.$transition.getTargetState())).booleanValue()) ? 
/* 702 */         IntSize.Companion.getZero-YbymL2g() : 
/*     */         
/* 704 */         IntSizeKt.IntSize(placeable.getWidth(), placeable.getHeight());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       int $i$f$component1-impl = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 886 */       int w = IntSize.getWidth-impl(l), $i$f$component2-impl = 0, h = 
/* 887 */         IntSize.getHeight-impl(l);
/*     */       return MeasureScope.layout$default($this$layout, w, h, null, new Function1<Placeable.PlacementScope, Unit>(placeable)
/*     */           {
/*     */             public final void invoke(@NotNull Placeable.PlacementScope $this$layout) {
/*     */               Intrinsics.checkNotNullParameter($this$layout, "$this$layout");
/*     */               Placeable.PlacementScope.place$default($this$layout, this.$placeable, 0, 0, 0.0F, 4, null);
/*     */             }
/*     */           }4, null);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1(Function1<T, Boolean> $visible, Transition<T> $transition) {
/*     */       super(3);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\003\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\0042\006\020\005\032\0020\004H\n¢\006\004\b\006\020\007"}, d2 = {"<anonymous>", "", "T", "current", "Landroidx/compose/animation/EnterExitState;", "target", "invoke", "(Landroidx/compose/animation/EnterExitState;Landroidx/compose/animation/EnterExitState;)Ljava/lang/Boolean;"})
/*     */   static final class AnimatedVisibilityKt$AnimatedVisibilityImpl$2
/*     */     extends Lambda
/*     */     implements Function2<EnterExitState, EnterExitState, Boolean>
/*     */   {
/*     */     public static final AnimatedVisibilityKt$AnimatedVisibilityImpl$2 INSTANCE = new AnimatedVisibilityKt$AnimatedVisibilityImpl$2();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final Boolean invoke(@NotNull EnterExitState current, @NotNull EnterExitState target) {
/*     */       Intrinsics.checkNotNullParameter(current, "current");
/*     */       Intrinsics.checkNotNullParameter(target, "target");
/*     */       return Boolean.valueOf((current == target && target == EnterExitState.PostExit));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AnimatedVisibilityKt$AnimatedVisibilityImpl$2() {
/*     */       super(2);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public static final <T> void AnimatedEnterExitImpl(@NotNull Transition transition, @NotNull Function1 visible, @NotNull Modifier modifier, @NotNull EnterTransition enter, @NotNull ExitTransition exit, @NotNull Function2 shouldDisposeBlock, @Nullable OnLookaheadMeasured onLookaheadMeasured, @NotNull Function3 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'transition'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: ldc_w 'visible'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload_2
/*     */     //   15: ldc_w 'modifier'
/*     */     //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   21: aload_3
/*     */     //   22: ldc_w 'enter'
/*     */     //   25: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   28: aload #4
/*     */     //   30: ldc_w 'exit'
/*     */     //   33: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   36: aload #5
/*     */     //   38: ldc_w 'shouldDisposeBlock'
/*     */     //   41: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   44: aload #7
/*     */     //   46: ldc 'content'
/*     */     //   48: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   51: aload #8
/*     */     //   53: ldc_w -891967166
/*     */     //   56: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   61: astore #8
/*     */     //   63: aload #8
/*     */     //   65: ldc_w 'C(AnimatedEnterExitImpl)P(6,7,3,1,2,5,4)741@39659L116,745@39818L40,752@40073L399,747@39898L574,768@40570L69,773@40810L47,794@41913L50,769@40652L1325:AnimatedVisibility.kt#xbi5r1'
/*     */     //   68: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   71: iload #9
/*     */     //   73: istore #11
/*     */     //   75: iload #10
/*     */     //   77: iconst_1
/*     */     //   78: iand
/*     */     //   79: ifeq -> 92
/*     */     //   82: iload #11
/*     */     //   84: bipush #6
/*     */     //   86: ior
/*     */     //   87: istore #11
/*     */     //   89: goto -> 121
/*     */     //   92: iload #9
/*     */     //   94: bipush #6
/*     */     //   96: iand
/*     */     //   97: ifne -> 121
/*     */     //   100: iload #11
/*     */     //   102: aload #8
/*     */     //   104: aload_0
/*     */     //   105: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   110: ifeq -> 117
/*     */     //   113: iconst_4
/*     */     //   114: goto -> 118
/*     */     //   117: iconst_2
/*     */     //   118: ior
/*     */     //   119: istore #11
/*     */     //   121: iload #10
/*     */     //   123: iconst_2
/*     */     //   124: iand
/*     */     //   125: ifeq -> 138
/*     */     //   128: iload #11
/*     */     //   130: bipush #48
/*     */     //   132: ior
/*     */     //   133: istore #11
/*     */     //   135: goto -> 169
/*     */     //   138: iload #9
/*     */     //   140: bipush #48
/*     */     //   142: iand
/*     */     //   143: ifne -> 169
/*     */     //   146: iload #11
/*     */     //   148: aload #8
/*     */     //   150: aload_1
/*     */     //   151: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   156: ifeq -> 164
/*     */     //   159: bipush #32
/*     */     //   161: goto -> 166
/*     */     //   164: bipush #16
/*     */     //   166: ior
/*     */     //   167: istore #11
/*     */     //   169: iload #10
/*     */     //   171: iconst_4
/*     */     //   172: iand
/*     */     //   173: ifeq -> 187
/*     */     //   176: iload #11
/*     */     //   178: sipush #384
/*     */     //   181: ior
/*     */     //   182: istore #11
/*     */     //   184: goto -> 221
/*     */     //   187: iload #9
/*     */     //   189: sipush #384
/*     */     //   192: iand
/*     */     //   193: ifne -> 221
/*     */     //   196: iload #11
/*     */     //   198: aload #8
/*     */     //   200: aload_2
/*     */     //   201: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   206: ifeq -> 215
/*     */     //   209: sipush #256
/*     */     //   212: goto -> 218
/*     */     //   215: sipush #128
/*     */     //   218: ior
/*     */     //   219: istore #11
/*     */     //   221: iload #10
/*     */     //   223: bipush #8
/*     */     //   225: iand
/*     */     //   226: ifeq -> 240
/*     */     //   229: iload #11
/*     */     //   231: sipush #3072
/*     */     //   234: ior
/*     */     //   235: istore #11
/*     */     //   237: goto -> 274
/*     */     //   240: iload #9
/*     */     //   242: sipush #3072
/*     */     //   245: iand
/*     */     //   246: ifne -> 274
/*     */     //   249: iload #11
/*     */     //   251: aload #8
/*     */     //   253: aload_3
/*     */     //   254: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   259: ifeq -> 268
/*     */     //   262: sipush #2048
/*     */     //   265: goto -> 271
/*     */     //   268: sipush #1024
/*     */     //   271: ior
/*     */     //   272: istore #11
/*     */     //   274: iload #10
/*     */     //   276: bipush #16
/*     */     //   278: iand
/*     */     //   279: ifeq -> 293
/*     */     //   282: iload #11
/*     */     //   284: sipush #24576
/*     */     //   287: ior
/*     */     //   288: istore #11
/*     */     //   290: goto -> 328
/*     */     //   293: iload #9
/*     */     //   295: sipush #24576
/*     */     //   298: iand
/*     */     //   299: ifne -> 328
/*     */     //   302: iload #11
/*     */     //   304: aload #8
/*     */     //   306: aload #4
/*     */     //   308: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   313: ifeq -> 322
/*     */     //   316: sipush #16384
/*     */     //   319: goto -> 325
/*     */     //   322: sipush #8192
/*     */     //   325: ior
/*     */     //   326: istore #11
/*     */     //   328: iload #10
/*     */     //   330: bipush #32
/*     */     //   332: iand
/*     */     //   333: ifeq -> 346
/*     */     //   336: iload #11
/*     */     //   338: ldc 196608
/*     */     //   340: ior
/*     */     //   341: istore #11
/*     */     //   343: goto -> 378
/*     */     //   346: iload #9
/*     */     //   348: ldc 196608
/*     */     //   350: iand
/*     */     //   351: ifne -> 378
/*     */     //   354: iload #11
/*     */     //   356: aload #8
/*     */     //   358: aload #5
/*     */     //   360: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   365: ifeq -> 373
/*     */     //   368: ldc 131072
/*     */     //   370: goto -> 375
/*     */     //   373: ldc 65536
/*     */     //   375: ior
/*     */     //   376: istore #11
/*     */     //   378: iload #10
/*     */     //   380: bipush #64
/*     */     //   382: iand
/*     */     //   383: ifeq -> 396
/*     */     //   386: iload #11
/*     */     //   388: ldc 1572864
/*     */     //   390: ior
/*     */     //   391: istore #11
/*     */     //   393: goto -> 449
/*     */     //   396: iload #9
/*     */     //   398: ldc 1572864
/*     */     //   400: iand
/*     */     //   401: ifne -> 449
/*     */     //   404: iload #11
/*     */     //   406: iload #9
/*     */     //   408: ldc_w 2097152
/*     */     //   411: iand
/*     */     //   412: ifne -> 427
/*     */     //   415: aload #8
/*     */     //   417: aload #6
/*     */     //   419: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   424: goto -> 436
/*     */     //   427: aload #8
/*     */     //   429: aload #6
/*     */     //   431: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   436: ifeq -> 444
/*     */     //   439: ldc 1048576
/*     */     //   441: goto -> 446
/*     */     //   444: ldc 524288
/*     */     //   446: ior
/*     */     //   447: istore #11
/*     */     //   449: iload #10
/*     */     //   451: sipush #128
/*     */     //   454: iand
/*     */     //   455: ifeq -> 469
/*     */     //   458: iload #11
/*     */     //   460: ldc_w 12582912
/*     */     //   463: ior
/*     */     //   464: istore #11
/*     */     //   466: goto -> 504
/*     */     //   469: iload #9
/*     */     //   471: ldc_w 12582912
/*     */     //   474: iand
/*     */     //   475: ifne -> 504
/*     */     //   478: iload #11
/*     */     //   480: aload #8
/*     */     //   482: aload #7
/*     */     //   484: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   489: ifeq -> 498
/*     */     //   492: ldc_w 8388608
/*     */     //   495: goto -> 501
/*     */     //   498: ldc_w 4194304
/*     */     //   501: ior
/*     */     //   502: istore #11
/*     */     //   504: iload #11
/*     */     //   506: ldc_w 4793491
/*     */     //   509: iand
/*     */     //   510: ldc_w 4793490
/*     */     //   513: if_icmpne -> 526
/*     */     //   516: aload #8
/*     */     //   518: invokeinterface getSkipping : ()Z
/*     */     //   523: ifne -> 2023
/*     */     //   526: iload #10
/*     */     //   528: bipush #64
/*     */     //   530: iand
/*     */     //   531: ifeq -> 537
/*     */     //   534: aconst_null
/*     */     //   535: astore #6
/*     */     //   537: invokestatic isTraceInProgress : ()Z
/*     */     //   540: ifeq -> 555
/*     */     //   543: ldc_w -891967166
/*     */     //   546: iload #11
/*     */     //   548: iconst_m1
/*     */     //   549: ldc_w 'androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:737)'
/*     */     //   552: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   555: aload_1
/*     */     //   556: aload_0
/*     */     //   557: invokevirtual getTargetState : ()Ljava/lang/Object;
/*     */     //   560: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   565: checkcast java/lang/Boolean
/*     */     //   568: invokevirtual booleanValue : ()Z
/*     */     //   571: ifne -> 607
/*     */     //   574: aload_1
/*     */     //   575: aload_0
/*     */     //   576: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*     */     //   579: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   584: checkcast java/lang/Boolean
/*     */     //   587: invokevirtual booleanValue : ()Z
/*     */     //   590: ifne -> 607
/*     */     //   593: aload_0
/*     */     //   594: invokevirtual isSeeking : ()Z
/*     */     //   597: ifne -> 607
/*     */     //   600: aload_0
/*     */     //   601: invokevirtual getHasInitialValueAnimations : ()Z
/*     */     //   604: ifeq -> 2011
/*     */     //   607: aload_0
/*     */     //   608: astore #13
/*     */     //   610: ldc_w 'EnterExitTransition'
/*     */     //   613: astore #14
/*     */     //   615: bipush #48
/*     */     //   617: bipush #14
/*     */     //   619: iload #11
/*     */     //   621: iand
/*     */     //   622: ior
/*     */     //   623: istore #15
/*     */     //   625: iconst_0
/*     */     //   626: istore #16
/*     */     //   628: aload #8
/*     */     //   630: ldc_w 1215497572
/*     */     //   633: ldc_w 'CC(createChildTransition)1814@74186L36,1815@74246L74,1816@74343L39,1817@74394L63:Transition.kt#pdpnli'
/*     */     //   636: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   639: aload #8
/*     */     //   641: ldc_w 272028789
/*     */     //   644: ldc_w 'CC(remember):Transition.kt#9igjgp'
/*     */     //   647: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   650: aload #8
/*     */     //   652: astore #17
/*     */     //   654: iload #15
/*     */     //   656: bipush #14
/*     */     //   658: iand
/*     */     //   659: bipush #6
/*     */     //   661: ixor
/*     */     //   662: iconst_4
/*     */     //   663: if_icmple -> 678
/*     */     //   666: aload #8
/*     */     //   668: aload #13
/*     */     //   670: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   675: ifne -> 687
/*     */     //   678: iload #15
/*     */     //   680: bipush #6
/*     */     //   682: iand
/*     */     //   683: iconst_4
/*     */     //   684: if_icmpne -> 691
/*     */     //   687: iconst_1
/*     */     //   688: goto -> 692
/*     */     //   691: iconst_0
/*     */     //   692: istore #18
/*     */     //   694: iconst_0
/*     */     //   695: istore #19
/*     */     //   697: aload #17
/*     */     //   699: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   704: astore #20
/*     */     //   706: iconst_0
/*     */     //   707: istore #21
/*     */     //   709: iload #18
/*     */     //   711: ifne -> 725
/*     */     //   714: aload #20
/*     */     //   716: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   719: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   722: if_acmpne -> 749
/*     */     //   725: iconst_0
/*     */     //   726: istore #22
/*     */     //   728: aload #13
/*     */     //   730: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*     */     //   733: astore #23
/*     */     //   735: aload #17
/*     */     //   737: aload #23
/*     */     //   739: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   744: aload #23
/*     */     //   746: goto -> 751
/*     */     //   749: aload #20
/*     */     //   751: nop
/*     */     //   752: nop
/*     */     //   753: nop
/*     */     //   754: astore #24
/*     */     //   756: aload #8
/*     */     //   758: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   761: aload #24
/*     */     //   763: astore #25
/*     */     //   765: aload #13
/*     */     //   767: invokevirtual isSeeking : ()Z
/*     */     //   770: ifeq -> 781
/*     */     //   773: aload #13
/*     */     //   775: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*     */     //   778: goto -> 783
/*     */     //   781: aload #25
/*     */     //   783: aload #8
/*     */     //   785: bipush #112
/*     */     //   787: iload #15
/*     */     //   789: iconst_3
/*     */     //   790: ishr
/*     */     //   791: iand
/*     */     //   792: istore #26
/*     */     //   794: astore #27
/*     */     //   796: astore #28
/*     */     //   798: iconst_0
/*     */     //   799: istore #29
/*     */     //   801: aload #27
/*     */     //   803: ldc_w -466616829
/*     */     //   806: invokeinterface startReplaceGroup : (I)V
/*     */     //   811: aload #27
/*     */     //   813: ldc_w 'C742@39737L28:AnimatedVisibility.kt#xbi5r1'
/*     */     //   816: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   819: invokestatic isTraceInProgress : ()Z
/*     */     //   822: ifeq -> 837
/*     */     //   825: ldc_w -466616829
/*     */     //   828: iload #26
/*     */     //   830: iconst_m1
/*     */     //   831: ldc_w 'androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)'
/*     */     //   834: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   837: aload_0
/*     */     //   838: aload_1
/*     */     //   839: aload #28
/*     */     //   841: aload #27
/*     */     //   843: bipush #14
/*     */     //   845: iload #11
/*     */     //   847: iand
/*     */     //   848: bipush #112
/*     */     //   850: iload #11
/*     */     //   852: iand
/*     */     //   853: ior
/*     */     //   854: sipush #896
/*     */     //   857: iload #26
/*     */     //   859: bipush #6
/*     */     //   861: ishl
/*     */     //   862: iand
/*     */     //   863: ior
/*     */     //   864: invokestatic targetEnterExit : (Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterExitState;
/*     */     //   867: astore #30
/*     */     //   869: invokestatic isTraceInProgress : ()Z
/*     */     //   872: ifeq -> 878
/*     */     //   875: invokestatic traceEventEnd : ()V
/*     */     //   878: aload #27
/*     */     //   880: invokeinterface endReplaceGroup : ()V
/*     */     //   885: aload #30
/*     */     //   887: astore #24
/*     */     //   889: aload #13
/*     */     //   891: invokevirtual getTargetState : ()Ljava/lang/Object;
/*     */     //   894: aload #8
/*     */     //   896: bipush #112
/*     */     //   898: iload #15
/*     */     //   900: iconst_3
/*     */     //   901: ishr
/*     */     //   902: iand
/*     */     //   903: istore #26
/*     */     //   905: astore #27
/*     */     //   907: astore #28
/*     */     //   909: iconst_0
/*     */     //   910: istore #29
/*     */     //   912: aload #27
/*     */     //   914: ldc_w -466616829
/*     */     //   917: invokeinterface startReplaceGroup : (I)V
/*     */     //   922: aload #27
/*     */     //   924: ldc_w 'C742@39737L28:AnimatedVisibility.kt#xbi5r1'
/*     */     //   927: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   930: invokestatic isTraceInProgress : ()Z
/*     */     //   933: ifeq -> 948
/*     */     //   936: ldc_w -466616829
/*     */     //   939: iload #26
/*     */     //   941: iconst_m1
/*     */     //   942: ldc_w 'androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:742)'
/*     */     //   945: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   948: aload_0
/*     */     //   949: aload_1
/*     */     //   950: aload #28
/*     */     //   952: aload #27
/*     */     //   954: bipush #14
/*     */     //   956: iload #11
/*     */     //   958: iand
/*     */     //   959: bipush #112
/*     */     //   961: iload #11
/*     */     //   963: iand
/*     */     //   964: ior
/*     */     //   965: sipush #896
/*     */     //   968: iload #26
/*     */     //   970: bipush #6
/*     */     //   972: ishl
/*     */     //   973: iand
/*     */     //   974: ior
/*     */     //   975: invokestatic targetEnterExit : (Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterExitState;
/*     */     //   978: astore #30
/*     */     //   980: invokestatic isTraceInProgress : ()Z
/*     */     //   983: ifeq -> 989
/*     */     //   986: invokestatic traceEventEnd : ()V
/*     */     //   989: aload #27
/*     */     //   991: invokeinterface endReplaceGroup : ()V
/*     */     //   996: aload #30
/*     */     //   998: astore #17
/*     */     //   1000: aload #13
/*     */     //   1002: aload #24
/*     */     //   1004: aload #17
/*     */     //   1006: aload #14
/*     */     //   1008: aload #8
/*     */     //   1010: bipush #14
/*     */     //   1012: iload #15
/*     */     //   1014: iand
/*     */     //   1015: sipush #7168
/*     */     //   1018: iload #15
/*     */     //   1020: bipush #6
/*     */     //   1022: ishl
/*     */     //   1023: iand
/*     */     //   1024: ior
/*     */     //   1025: invokestatic createChildTransitionInternal : (Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/Transition;
/*     */     //   1028: astore #18
/*     */     //   1030: aload #8
/*     */     //   1032: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1035: aload #18
/*     */     //   1037: nop
/*     */     //   1038: astore #12
/*     */     //   1040: aload #5
/*     */     //   1042: aload #8
/*     */     //   1044: bipush #14
/*     */     //   1046: iload #11
/*     */     //   1048: bipush #15
/*     */     //   1050: ishr
/*     */     //   1051: iand
/*     */     //   1052: invokestatic rememberUpdatedState : (Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1055: astore #13
/*     */     //   1057: aload #5
/*     */     //   1059: aload #12
/*     */     //   1061: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*     */     //   1064: aload #12
/*     */     //   1066: invokevirtual getTargetState : ()Ljava/lang/Object;
/*     */     //   1069: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1074: aload #8
/*     */     //   1076: ldc_w 1581710007
/*     */     //   1079: ldc_w 'CC(remember):AnimatedVisibility.kt#9igjgp'
/*     */     //   1082: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1085: aload #8
/*     */     //   1087: astore #16
/*     */     //   1089: aload #8
/*     */     //   1091: aload #12
/*     */     //   1093: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1098: aload #8
/*     */     //   1100: aload #13
/*     */     //   1102: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1107: ior
/*     */     //   1108: istore #17
/*     */     //   1110: iconst_0
/*     */     //   1111: istore #18
/*     */     //   1113: aload #16
/*     */     //   1115: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1120: astore #19
/*     */     //   1122: iconst_0
/*     */     //   1123: istore #20
/*     */     //   1125: iload #17
/*     */     //   1127: ifne -> 1141
/*     */     //   1130: aload #19
/*     */     //   1132: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1135: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1138: if_acmpne -> 1180
/*     */     //   1141: astore #35
/*     */     //   1143: iconst_0
/*     */     //   1144: istore #21
/*     */     //   1146: new androidx/compose/animation/AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1
/*     */     //   1149: dup
/*     */     //   1150: aload #12
/*     */     //   1152: aload #13
/*     */     //   1154: aconst_null
/*     */     //   1155: invokespecial <init> : (Landroidx/compose/animation/core/Transition;Landroidx/compose/runtime/State;Lkotlin/coroutines/Continuation;)V
/*     */     //   1158: checkcast kotlin/jvm/functions/Function2
/*     */     //   1161: aload #35
/*     */     //   1163: swap
/*     */     //   1164: astore #22
/*     */     //   1166: aload #16
/*     */     //   1168: aload #22
/*     */     //   1170: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1175: aload #22
/*     */     //   1177: goto -> 1182
/*     */     //   1180: aload #19
/*     */     //   1182: nop
/*     */     //   1183: nop
/*     */     //   1184: nop
/*     */     //   1185: checkcast kotlin/jvm/functions/Function2
/*     */     //   1188: astore #15
/*     */     //   1190: aload #8
/*     */     //   1192: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1195: aload #15
/*     */     //   1197: aload #8
/*     */     //   1199: iconst_0
/*     */     //   1200: invokestatic produceState : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1203: astore #14
/*     */     //   1205: aload #12
/*     */     //   1207: invokestatic getExitFinished : (Landroidx/compose/animation/core/Transition;)Z
/*     */     //   1210: ifeq -> 1221
/*     */     //   1213: aload #14
/*     */     //   1215: invokestatic AnimatedEnterExitImpl$lambda$4 : (Landroidx/compose/runtime/State;)Z
/*     */     //   1218: ifne -> 2011
/*     */     //   1221: aload #8
/*     */     //   1223: ldc_w 1581725581
/*     */     //   1226: ldc_w 'CC(remember):AnimatedVisibility.kt#9igjgp'
/*     */     //   1229: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1232: aload #8
/*     */     //   1234: astore #17
/*     */     //   1236: iload #11
/*     */     //   1238: bipush #14
/*     */     //   1240: iand
/*     */     //   1241: iconst_4
/*     */     //   1242: if_icmpne -> 1249
/*     */     //   1245: iconst_1
/*     */     //   1246: goto -> 1250
/*     */     //   1249: iconst_0
/*     */     //   1250: istore #18
/*     */     //   1252: iconst_0
/*     */     //   1253: istore #19
/*     */     //   1255: aload #17
/*     */     //   1257: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1262: astore #20
/*     */     //   1264: iconst_0
/*     */     //   1265: istore #21
/*     */     //   1267: iload #18
/*     */     //   1269: ifne -> 1283
/*     */     //   1272: aload #20
/*     */     //   1274: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1277: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1280: if_acmpne -> 1311
/*     */     //   1283: iconst_0
/*     */     //   1284: istore #22
/*     */     //   1286: new androidx/compose/animation/AnimatedVisibilityScopeImpl
/*     */     //   1289: dup
/*     */     //   1290: aload #12
/*     */     //   1292: invokespecial <init> : (Landroidx/compose/animation/core/Transition;)V
/*     */     //   1295: astore #23
/*     */     //   1297: aload #17
/*     */     //   1299: aload #23
/*     */     //   1301: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1306: aload #23
/*     */     //   1308: goto -> 1313
/*     */     //   1311: aload #20
/*     */     //   1313: nop
/*     */     //   1314: nop
/*     */     //   1315: nop
/*     */     //   1316: checkcast androidx/compose/animation/AnimatedVisibilityScopeImpl
/*     */     //   1319: astore #16
/*     */     //   1321: aload #8
/*     */     //   1323: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1326: aload #16
/*     */     //   1328: astore #15
/*     */     //   1330: aload_2
/*     */     //   1331: aload #12
/*     */     //   1333: aload_3
/*     */     //   1334: aload #4
/*     */     //   1336: aconst_null
/*     */     //   1337: ldc_w 'Built-in'
/*     */     //   1340: aload #8
/*     */     //   1342: sipush #24576
/*     */     //   1345: bipush #112
/*     */     //   1347: iload #11
/*     */     //   1349: bipush #6
/*     */     //   1351: ishr
/*     */     //   1352: iand
/*     */     //   1353: ior
/*     */     //   1354: sipush #896
/*     */     //   1357: iload #11
/*     */     //   1359: bipush #6
/*     */     //   1361: ishr
/*     */     //   1362: iand
/*     */     //   1363: ior
/*     */     //   1364: iconst_4
/*     */     //   1365: invokestatic createModifier : (Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
/*     */     //   1368: aload #8
/*     */     //   1370: ldc_w 1581736656
/*     */     //   1373: invokeinterface startReplaceGroup : (I)V
/*     */     //   1378: aload #8
/*     */     //   1380: ldc_w '775@40967L849'
/*     */     //   1383: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*     */     //   1386: aload #6
/*     */     //   1388: ifnull -> 1552
/*     */     //   1391: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1394: checkcast androidx/compose/ui/Modifier
/*     */     //   1397: aload #8
/*     */     //   1399: ldc_w 1581739065
/*     */     //   1402: ldc_w 'CC(remember):AnimatedVisibility.kt#9igjgp'
/*     */     //   1405: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1408: aload #8
/*     */     //   1410: astore #18
/*     */     //   1412: iload #11
/*     */     //   1414: ldc_w 3670016
/*     */     //   1417: iand
/*     */     //   1418: ldc 1048576
/*     */     //   1420: if_icmpeq -> 1444
/*     */     //   1423: iload #11
/*     */     //   1425: ldc_w 2097152
/*     */     //   1428: iand
/*     */     //   1429: ifeq -> 1448
/*     */     //   1432: aload #8
/*     */     //   1434: aload #6
/*     */     //   1436: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1441: ifeq -> 1448
/*     */     //   1444: iconst_1
/*     */     //   1445: goto -> 1449
/*     */     //   1448: iconst_0
/*     */     //   1449: istore #19
/*     */     //   1451: iconst_0
/*     */     //   1452: istore #20
/*     */     //   1454: aload #18
/*     */     //   1456: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1461: astore #21
/*     */     //   1463: iconst_0
/*     */     //   1464: istore #22
/*     */     //   1466: iload #19
/*     */     //   1468: ifne -> 1482
/*     */     //   1471: aload #21
/*     */     //   1473: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1476: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1479: if_acmpne -> 1529
/*     */     //   1482: astore #37
/*     */     //   1484: astore #36
/*     */     //   1486: astore #35
/*     */     //   1488: iconst_0
/*     */     //   1489: istore #23
/*     */     //   1491: new androidx/compose/animation/AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1
/*     */     //   1494: dup
/*     */     //   1495: aload #6
/*     */     //   1497: invokespecial <init> : (Landroidx/compose/animation/OnLookaheadMeasured;)V
/*     */     //   1500: checkcast kotlin/jvm/functions/Function3
/*     */     //   1503: astore #38
/*     */     //   1505: aload #35
/*     */     //   1507: aload #36
/*     */     //   1509: aload #37
/*     */     //   1511: aload #38
/*     */     //   1513: astore #24
/*     */     //   1515: aload #18
/*     */     //   1517: aload #24
/*     */     //   1519: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1524: aload #24
/*     */     //   1526: goto -> 1531
/*     */     //   1529: aload #21
/*     */     //   1531: nop
/*     */     //   1532: nop
/*     */     //   1533: nop
/*     */     //   1534: checkcast kotlin/jvm/functions/Function3
/*     */     //   1537: astore #17
/*     */     //   1539: aload #8
/*     */     //   1541: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1544: aload #17
/*     */     //   1546: invokestatic layout : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;
/*     */     //   1549: goto -> 1558
/*     */     //   1552: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1555: checkcast androidx/compose/ui/Modifier
/*     */     //   1558: astore #16
/*     */     //   1560: aload #8
/*     */     //   1562: invokeinterface endReplaceGroup : ()V
/*     */     //   1567: aload #16
/*     */     //   1569: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1574: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1579: astore #16
/*     */     //   1581: aload #8
/*     */     //   1583: ldc_w 1581768538
/*     */     //   1586: ldc_w 'CC(remember):AnimatedVisibility.kt#9igjgp'
/*     */     //   1589: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1592: aload #8
/*     */     //   1594: astore #18
/*     */     //   1596: iconst_0
/*     */     //   1597: istore #19
/*     */     //   1599: iconst_0
/*     */     //   1600: istore #20
/*     */     //   1602: aload #18
/*     */     //   1604: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1609: astore #21
/*     */     //   1611: iconst_0
/*     */     //   1612: istore #22
/*     */     //   1614: aload #21
/*     */     //   1616: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1619: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1622: if_acmpne -> 1653
/*     */     //   1625: iconst_0
/*     */     //   1626: istore #23
/*     */     //   1628: new androidx/compose/animation/AnimatedEnterExitMeasurePolicy
/*     */     //   1631: dup
/*     */     //   1632: aload #15
/*     */     //   1634: invokespecial <init> : (Landroidx/compose/animation/AnimatedVisibilityScopeImpl;)V
/*     */     //   1637: astore #24
/*     */     //   1639: aload #18
/*     */     //   1641: aload #24
/*     */     //   1643: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1648: aload #24
/*     */     //   1650: goto -> 1655
/*     */     //   1653: aload #21
/*     */     //   1655: nop
/*     */     //   1656: nop
/*     */     //   1657: nop
/*     */     //   1658: checkcast androidx/compose/animation/AnimatedEnterExitMeasurePolicy
/*     */     //   1661: astore #17
/*     */     //   1663: aload #8
/*     */     //   1665: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1668: aload #17
/*     */     //   1670: checkcast androidx/compose/ui/layout/MeasurePolicy
/*     */     //   1673: astore #17
/*     */     //   1675: sipush #384
/*     */     //   1678: istore #18
/*     */     //   1680: nop
/*     */     //   1681: iconst_0
/*     */     //   1682: istore #19
/*     */     //   1684: aload #8
/*     */     //   1686: ldc_w -1323940314
/*     */     //   1689: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1692: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1695: aload #8
/*     */     //   1697: iconst_0
/*     */     //   1698: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1701: istore #20
/*     */     //   1703: aload #8
/*     */     //   1705: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1710: astore #21
/*     */     //   1712: aload #8
/*     */     //   1714: aload #16
/*     */     //   1716: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1719: astore #22
/*     */     //   1721: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1724: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1727: astore #23
/*     */     //   1729: bipush #6
/*     */     //   1731: sipush #896
/*     */     //   1734: iload #18
/*     */     //   1736: bipush #6
/*     */     //   1738: ishl
/*     */     //   1739: iand
/*     */     //   1740: ior
/*     */     //   1741: istore #24
/*     */     //   1743: nop
/*     */     //   1744: iconst_0
/*     */     //   1745: istore #25
/*     */     //   1747: aload #8
/*     */     //   1749: ldc_w -692256719
/*     */     //   1752: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1755: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1758: aload #8
/*     */     //   1760: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1765: instanceof androidx/compose/runtime/Applier
/*     */     //   1768: ifne -> 1774
/*     */     //   1771: invokestatic invalidApplier : ()V
/*     */     //   1774: aload #8
/*     */     //   1776: invokeinterface startReusableNode : ()V
/*     */     //   1781: aload #8
/*     */     //   1783: invokeinterface getInserting : ()Z
/*     */     //   1788: ifeq -> 1803
/*     */     //   1791: aload #8
/*     */     //   1793: aload #23
/*     */     //   1795: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1800: goto -> 1810
/*     */     //   1803: aload #8
/*     */     //   1805: invokeinterface useNode : ()V
/*     */     //   1810: aload #8
/*     */     //   1812: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1815: astore #26
/*     */     //   1817: iconst_0
/*     */     //   1818: istore #27
/*     */     //   1820: aload #26
/*     */     //   1822: aload #17
/*     */     //   1824: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1827: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1830: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1833: aload #26
/*     */     //   1835: aload #21
/*     */     //   1837: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1840: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1843: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1846: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1849: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1852: astore #28
/*     */     //   1854: iconst_0
/*     */     //   1855: istore #29
/*     */     //   1857: aload #26
/*     */     //   1859: astore #30
/*     */     //   1861: iconst_0
/*     */     //   1862: istore #31
/*     */     //   1864: aload #30
/*     */     //   1866: invokeinterface getInserting : ()Z
/*     */     //   1871: ifne -> 1892
/*     */     //   1874: aload #30
/*     */     //   1876: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1881: iload #20
/*     */     //   1883: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1886: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1889: ifne -> 1918
/*     */     //   1892: aload #30
/*     */     //   1894: iload #20
/*     */     //   1896: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1899: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1904: aload #26
/*     */     //   1906: iload #20
/*     */     //   1908: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1911: aload #28
/*     */     //   1913: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1918: nop
/*     */     //   1919: nop
/*     */     //   1920: nop
/*     */     //   1921: aload #26
/*     */     //   1923: aload #22
/*     */     //   1925: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1928: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1931: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1934: nop
/*     */     //   1935: nop
/*     */     //   1936: aload #8
/*     */     //   1938: bipush #14
/*     */     //   1940: iload #24
/*     */     //   1942: bipush #6
/*     */     //   1944: ishr
/*     */     //   1945: iand
/*     */     //   1946: istore #32
/*     */     //   1948: astore #33
/*     */     //   1950: iconst_0
/*     */     //   1951: istore #34
/*     */     //   1953: aload #33
/*     */     //   1955: ldc_w 254461613
/*     */     //   1958: ldc_w 'C770@40694L9:AnimatedVisibility.kt#xbi5r1'
/*     */     //   1961: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1964: aload #7
/*     */     //   1966: aload #15
/*     */     //   1968: aload #33
/*     */     //   1970: bipush #112
/*     */     //   1972: iload #11
/*     */     //   1974: bipush #18
/*     */     //   1976: ishr
/*     */     //   1977: iand
/*     */     //   1978: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1981: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1986: pop
/*     */     //   1987: aload #33
/*     */     //   1989: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1992: aload #8
/*     */     //   1994: invokeinterface endNode : ()V
/*     */     //   1999: aload #8
/*     */     //   2001: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2004: nop
/*     */     //   2005: aload #8
/*     */     //   2007: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2010: nop
/*     */     //   2011: invokestatic isTraceInProgress : ()Z
/*     */     //   2014: ifeq -> 2030
/*     */     //   2017: invokestatic traceEventEnd : ()V
/*     */     //   2020: goto -> 2030
/*     */     //   2023: aload #8
/*     */     //   2025: invokeinterface skipToGroupEnd : ()V
/*     */     //   2030: aload #8
/*     */     //   2032: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   2037: dup
/*     */     //   2038: ifnull -> 2075
/*     */     //   2041: new androidx/compose/animation/AnimatedVisibilityKt$AnimatedEnterExitImpl$4
/*     */     //   2044: dup
/*     */     //   2045: aload_0
/*     */     //   2046: aload_1
/*     */     //   2047: aload_2
/*     */     //   2048: aload_3
/*     */     //   2049: aload #4
/*     */     //   2051: aload #5
/*     */     //   2053: aload #6
/*     */     //   2055: aload #7
/*     */     //   2057: iload #9
/*     */     //   2059: iload #10
/*     */     //   2061: invokespecial <init> : (Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function2;Landroidx/compose/animation/OnLookaheadMeasured;Lkotlin/jvm/functions/Function3;II)V
/*     */     //   2064: checkcast kotlin/jvm/functions/Function2
/*     */     //   2067: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   2072: goto -> 2076
/*     */     //   2075: pop
/*     */     //   2076: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #738	-> 51
/*     */     //   #736	-> 534
/*     */     //   #738	-> 552
/*     */     //   #739	-> 555
/*     */     //   #740	-> 593
/*     */     //   #742	-> 607
/*     */     //   #892	-> 636
/*     */     //   #893	-> 647
/*     */     //   #894	-> 697
/*     */     //   #895	-> 709
/*     */     //   #896	-> 725
/*     */     //   #893	-> 728
/*     */     //   #896	-> 733
/*     */     //   #897	-> 735
/*     */     //   #898	-> 744
/*     */     //   #899	-> 749
/*     */     //   #895	-> 751
/*     */     //   #894	-> 752
/*     */     //   #894	-> 753
/*     */     //   #893	-> 754
/*     */     //   #900	-> 765
/*     */     //   #743	-> 834
/*     */     //   #900	-> 887
/*     */     //   #901	-> 889
/*     */     //   #743	-> 945
/*     */     //   #901	-> 998
/*     */     //   #902	-> 1000
/*     */     //   #892	-> 1032
/*     */     //   #902	-> 1037
/*     */     //   #742	-> 1038
/*     */     //   #746	-> 1040
/*     */     //   #749	-> 1057
/*     */     //   #750	-> 1059
/*     */     //   #751	-> 1064
/*     */     //   #749	-> 1069
/*     */     //   #753	-> 1082
/*     */     //   #903	-> 1113
/*     */     //   #904	-> 1125
/*     */     //   #905	-> 1141
/*     */     //   #753	-> 1146
/*     */     //   #905	-> 1164
/*     */     //   #906	-> 1166
/*     */     //   #907	-> 1175
/*     */     //   #908	-> 1180
/*     */     //   #904	-> 1182
/*     */     //   #903	-> 1183
/*     */     //   #903	-> 1184
/*     */     //   #753	-> 1185
/*     */     //   #748	-> 1200
/*     */     //   #768	-> 1205
/*     */     //   #769	-> 1229
/*     */     //   #909	-> 1255
/*     */     //   #910	-> 1267
/*     */     //   #911	-> 1283
/*     */     //   #769	-> 1286
/*     */     //   #911	-> 1295
/*     */     //   #912	-> 1297
/*     */     //   #913	-> 1306
/*     */     //   #914	-> 1311
/*     */     //   #910	-> 1313
/*     */     //   #909	-> 1314
/*     */     //   #909	-> 1315
/*     */     //   #769	-> 1316
/*     */     //   #772	-> 1330
/*     */     //   #773	-> 1331
/*     */     //   #774	-> 1333
/*     */     //   #775	-> 1386
/*     */     //   #776	-> 1391
/*     */     //   #915	-> 1454
/*     */     //   #916	-> 1466
/*     */     //   #917	-> 1482
/*     */     //   #776	-> 1491
/*     */     //   #917	-> 1513
/*     */     //   #918	-> 1515
/*     */     //   #919	-> 1524
/*     */     //   #920	-> 1529
/*     */     //   #916	-> 1531
/*     */     //   #915	-> 1532
/*     */     //   #915	-> 1533
/*     */     //   #776	-> 1534
/*     */     //   #793	-> 1552
/*     */     //   #775	-> 1558
/*     */     //   #773	-> 1574
/*     */     //   #795	-> 1589
/*     */     //   #921	-> 1602
/*     */     //   #922	-> 1614
/*     */     //   #923	-> 1625
/*     */     //   #795	-> 1628
/*     */     //   #923	-> 1637
/*     */     //   #924	-> 1639
/*     */     //   #925	-> 1648
/*     */     //   #926	-> 1653
/*     */     //   #922	-> 1655
/*     */     //   #921	-> 1656
/*     */     //   #921	-> 1657
/*     */     //   #795	-> 1658
/*     */     //   #770	-> 1680
/*     */     //   #927	-> 1692
/*     */     //   #928	-> 1698
/*     */     //   #929	-> 1705
/*     */     //   #930	-> 1714
/*     */     //   #932	-> 1721
/*     */     //   #931	-> 1743
/*     */     //   #933	-> 1755
/*     */     //   #934	-> 1758
/*     */     //   #935	-> 1776
/*     */     //   #936	-> 1781
/*     */     //   #937	-> 1793
/*     */     //   #939	-> 1805
/*     */     //   #941	-> 1810
/*     */     //   #942	-> 1820
/*     */     //   #943	-> 1833
/*     */     //   #945	-> 1846
/*     */     //   #946	-> 1857
/*     */     //   #947	-> 1864
/*     */     //   #948	-> 1892
/*     */     //   #949	-> 1904
/*     */     //   #951	-> 1918
/*     */     //   #946	-> 1919
/*     */     //   #951	-> 1920
/*     */     //   #952	-> 1921
/*     */     //   #953	-> 1934
/*     */     //   #941	-> 1935
/*     */     //   #954	-> 1936
/*     */     //   #771	-> 1961
/*     */     //   #954	-> 1992
/*     */     //   #955	-> 1994
/*     */     //   #933	-> 2001
/*     */     //   #956	-> 2004
/*     */     //   #927	-> 2007
/*     */     //   #957	-> 2010
/*     */     //   #799	-> 2023
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   801	86	29	$i$a$-createChildTransition-AnimatedVisibilityKt$AnimatedEnterExitImpl$childTransition$1	I
/*     */     //   798	89	28	it	Ljava/lang/Object;
/*     */     //   798	89	27	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   798	89	26	$changed	I
/*     */     //   912	86	29	$i$a$-createChildTransition-AnimatedVisibilityKt$AnimatedEnterExitImpl$childTransition$1	I
/*     */     //   909	89	28	it	Ljava/lang/Object;
/*     */     //   909	89	27	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   909	89	26	$changed	I
/*     */     //   728	5	22	$i$a$-cache-TransitionKt$createChildTransition$initialParentState$1$iv	I
/*     */     //   735	11	23	value$iv$iv	Ljava/lang/Object;
/*     */     //   709	43	21	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*     */     //   706	46	20	it$iv$iv	Ljava/lang/Object;
/*     */     //   697	57	19	$i$f$cache	I
/*     */     //   694	60	17	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   694	60	18	invalid$iv$iv	Z
/*     */     //   628	410	16	$i$f$createChildTransition	I
/*     */     //   765	273	25	initialParentState$iv	Ljava/lang/Object;
/*     */     //   889	149	24	initialState$iv	Ljava/lang/Object;
/*     */     //   1000	38	17	targetState$iv	Ljava/lang/Object;
/*     */     //   625	413	13	$this$createChildTransition$iv	Landroidx/compose/animation/core/Transition;
/*     */     //   625	413	14	label$iv	Ljava/lang/String;
/*     */     //   625	413	15	$changed$iv	I
/*     */     //   1146	15	21	$i$a$-cache-AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2	I
/*     */     //   1166	11	22	value$iv	Ljava/lang/Object;
/*     */     //   1125	58	20	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1122	61	19	it$iv	Ljava/lang/Object;
/*     */     //   1113	72	18	$i$f$cache	I
/*     */     //   1110	75	16	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1110	75	17	invalid$iv	Z
/*     */     //   1286	9	22	$i$a$-cache-AnimatedVisibilityKt$AnimatedEnterExitImpl$scope$1	I
/*     */     //   1297	11	23	value$iv	Ljava/lang/Object;
/*     */     //   1267	47	21	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1264	50	20	it$iv	Ljava/lang/Object;
/*     */     //   1255	61	19	$i$f$cache	I
/*     */     //   1252	64	17	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1252	64	18	invalid$iv	Z
/*     */     //   1491	12	23	$i$a$-cache-AnimatedVisibilityKt$AnimatedEnterExitImpl$2	I
/*     */     //   1515	11	24	value$iv	Ljava/lang/Object;
/*     */     //   1466	66	22	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1463	69	21	it$iv	Ljava/lang/Object;
/*     */     //   1454	80	20	$i$f$cache	I
/*     */     //   1451	83	18	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1451	83	19	invalid$iv	Z
/*     */     //   1628	9	23	$i$a$-cache-AnimatedVisibilityKt$AnimatedEnterExitImpl$3	I
/*     */     //   1639	11	24	value$iv	Ljava/lang/Object;
/*     */     //   1614	42	22	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1611	45	21	it$iv	Ljava/lang/Object;
/*     */     //   1602	56	20	$i$f$cache	I
/*     */     //   1599	59	18	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1599	59	19	invalid$iv	Z
/*     */     //   1953	39	34	$i$a$-Layout-AnimatedVisibilityKt$AnimatedEnterExitImpl$1	I
/*     */     //   1950	42	33	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1950	42	32	$changed	I
/*     */     //   1864	55	31	$i$a$-with-Updater$set$1$iv$iv	I
/*     */     //   1861	58	30	$this$set_impl_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1857	64	29	$i$f$set-impl	I
/*     */     //   1854	67	28	block$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1820	115	27	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv	I
/*     */     //   1817	118	26	$this$Layout_u24lambda_u240$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1747	258	25	$i$f$ReusableComposeNode	I
/*     */     //   1744	261	23	factory$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1744	261	24	$changed$iv$iv	I
/*     */     //   1684	327	19	$i$f$Layout	I
/*     */     //   1703	308	20	compositeKeyHash$iv	I
/*     */     //   1712	299	21	localMap$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1721	290	22	materialized$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1681	330	16	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1681	330	17	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1681	330	18	$changed$iv	I
/*     */     //   1330	681	15	scope	Landroidx/compose/animation/AnimatedVisibilityScopeImpl;
/*     */     //   1040	971	12	childTransition	Landroidx/compose/animation/core/Transition;
/*     */     //   1057	954	13	shouldDisposeBlockUpdated$delegate	Landroidx/compose/runtime/State;
/*     */     //   1205	806	14	shouldDisposeAfterExit$delegate	Landroidx/compose/runtime/State;
/*     */     //   75	2002	11	$dirty	I
/*     */     //   0	2077	0	transition	Landroidx/compose/animation/core/Transition;
/*     */     //   0	2077	1	visible	Lkotlin/jvm/functions/Function1;
/*     */     //   0	2077	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	2077	3	enter	Landroidx/compose/animation/EnterTransition;
/*     */     //   0	2077	4	exit	Landroidx/compose/animation/ExitTransition;
/*     */     //   0	2077	5	shouldDisposeBlock	Lkotlin/jvm/functions/Function2;
/*     */     //   0	2077	6	onLookaheadMeasured	Landroidx/compose/animation/OnLookaheadMeasured;
/*     */     //   0	2077	7	content	Lkotlin/jvm/functions/Function3;
/*     */     //   0	2077	8	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	2077	9	$changed	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Function2<EnterExitState, EnterExitState, Boolean> AnimatedEnterExitImpl$lambda$2(State $shouldDisposeBlockUpdated$delegate) {
/*     */     State state = $shouldDisposeBlockUpdated$delegate;
/*     */     Object object = null;
/*     */     KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 964 */     return (Function2<EnterExitState, EnterExitState, Boolean>)state.getValue(); } private static final boolean AnimatedEnterExitImpl$lambda$4(State $shouldDisposeAfterExit$delegate) { State state = $shouldDisposeAfterExit$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 965 */     return ((Boolean)state.getValue()).booleanValue(); }
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "AnimatedVisibility.kt", l = {756}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\020\013\020\000\032\0020\001\"\004\b\000\020\002*\b\022\004\022\0020\0040\003H@"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/runtime/ProduceStateScope;", ""})
/*     */   static final class AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 extends SuspendLambda implements Function2<ProduceStateScope<Boolean>, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(Transition<EnterExitState> $childTransition, State<Function2<EnterExitState, EnterExitState, Boolean>> $shouldDisposeBlockUpdated$delegate, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       ProduceStateScope<Boolean> $this$produceState;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           $this$produceState = (ProduceStateScope)this.L$0;
/*     */           this.label = 1;
/*     */           if (SnapshotStateKt.snapshotFlow(new Function0<Boolean>(this.$childTransition) {
/*     */                 @NotNull
/*     */                 public final Boolean invoke() {
/*     */                   return Boolean.valueOf(AnimatedVisibilityKt.getExitFinished(this.$childTransition));
/*     */                 }
/*     */               }).collect(new FlowCollector($this$produceState, this.$childTransition, this.$shouldDisposeBlockUpdated$delegate) {
/*     */                 @Nullable
/*     */                 public final Object emit(boolean it, @NotNull Continuation $completion) {
/*     */                   this.$$this$produceState.setValue(Boxing.boxBoolean(it ? ((Boolean)AnimatedVisibilityKt.AnimatedEnterExitImpl$lambda$2(this.$shouldDisposeBlockUpdated$delegate).invoke(this.$childTransition.getCurrentState(), this.$childTransition.getTargetState())).booleanValue() : false));
/*     */                   return Unit.INSTANCE;
/*     */                 }
/*     */               }(Continuation)this) == object)
/*     */             return object; 
/*     */           SnapshotStateKt.snapshotFlow(new Function0<Boolean>(this.$childTransition) {
/*     */                 @NotNull
/*     */                 public final Boolean invoke() {
/*     */                   return Boolean.valueOf(AnimatedVisibilityKt.getExitFinished(this.$childTransition));
/*     */                 }
/*     */               }).collect(new FlowCollector($this$produceState, this.$childTransition, this.$shouldDisposeBlockUpdated$delegate) {
/*     */                 @Nullable
/*     */                 public final Object emit(boolean it, @NotNull Continuation $completion) {
/*     */                   this.$$this$produceState.setValue(Boxing.boxBoolean(it ? ((Boolean)AnimatedVisibilityKt.AnimatedEnterExitImpl$lambda$2(this.$shouldDisposeBlockUpdated$delegate).invoke(this.$childTransition.getCurrentState(), this.$childTransition.getTargetState())).booleanValue() : false));
/*     */                   return Unit.INSTANCE;
/*     */                 }
/*     */               }(Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1> $completion) {
/*     */       AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(this.$childTransition, this.$shouldDisposeBlockUpdated$delegate, $completion);
/*     */       animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1.L$0 = value;
/*     */       return (Continuation<Unit>)animatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull ProduceStateScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\034\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\001\"\004\b\000\020\002*\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\n¢\006\004\b\b\020\t"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "T", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;"})
/*     */   static final class AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1 extends Lambda implements Function3<MeasureScope, Measurable, Constraints, MeasureResult> {
/*     */     @NotNull
/*     */     public final MeasureResult invoke-3p2s80s(@NotNull MeasureScope $this$layout, @NotNull Measurable measurable, long constraints) {
/*     */       Intrinsics.checkNotNullParameter($this$layout, "$this$layout");
/*     */       Intrinsics.checkNotNullParameter(measurable, "measurable");
/*     */       Placeable placeable1 = measurable.measure-BRTryo0(constraints);
/*     */       OnLookaheadMeasured onLookaheadMeasured = this.$onLookaheadMeasured;
/*     */       Placeable $this$invoke_3p2s80s_u24lambda_u240 = placeable1;
/*     */       int $i$a$-run-AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1$1 = 0;
/*     */       if ($this$layout.isLookingAhead())
/*     */         onLookaheadMeasured.invoke-ozmzZPI(IntSizeKt.IntSize($this$invoke_3p2s80s_u24lambda_u240.getWidth(), $this$invoke_3p2s80s_u24lambda_u240.getHeight())); 
/*     */       return MeasureScope.layout$default($this$layout, $this$invoke_3p2s80s_u24lambda_u240.getWidth(), $this$invoke_3p2s80s_u24lambda_u240.getHeight(), null, new AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1$1$1($this$invoke_3p2s80s_u24lambda_u240), 4, null);
/*     */     }
/*     */     
/*     */     AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1(OnLookaheadMeasured $onLookaheadMeasured) {
/*     */       super(3);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final boolean getExitFinished(Transition $this$exitFinished) {
/*     */     return ($this$exitFinished.getCurrentState() == EnterExitState.PostExit && $this$exitFinished.getTargetState() == EnterExitState.PostExit);
/*     */   }
/*     */   
/*     */   @Composable
/*     */   private static final <T> EnterExitState targetEnterExit(Transition $this$targetEnterExit, Function1 visible, Object targetState, Composer $composer, int $changed) {
/*     */     ComposerKt.sourceInformationMarkerStart($composer, 361571134, "C(targetEnterExit)P(1):AnimatedVisibility.kt#xbi5r1");
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(361571134, $changed, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:855)"); 
/*     */     $composer.startMovableGroup(-902048200, $this$targetEnterExit);
/*     */     ComposerKt.sourceInformation($composer, "868@44365L34");
/*     */     if ($this$targetEnterExit.isSeeking()) {
/*     */     
/*     */     } else {
/*     */       ComposerKt.sourceInformationMarkerStart($composer, -902039492, "CC(remember):AnimatedVisibility.kt#9igjgp");
/*     */       Composer composer = $composer;
/*     */       boolean invalid$iv = false;
/*     */       int $i$f$cache = 0;
/*     */       Object it$iv = composer.rememberedValue();
/*     */       int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */       if (it$iv == Composer.Companion.getEmpty()) {
/*     */         int $i$a$-cache-AnimatedVisibilityKt$targetEnterExit$hasBeenVisible$1 = 0;
/*     */         Object value$iv = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(false), null, 2, null);
/*     */         composer.updateRememberedValue(value$iv);
/*     */       } 
/*     */     } 
/*     */     Object object2 = it$iv;
/*     */     $composer.endMovableGroup();
/*     */     Object object1 = object2;
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     return (EnterExitState)object1;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class AnimatedVisibilityKt$AnimatedEnterExitImpl$4 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     AnimatedVisibilityKt$AnimatedEnterExitImpl$4(Transition<T> $transition, Function1<T, Boolean> $visible, Modifier $modifier, EnterTransition $enter, ExitTransition $exit, Function2<EnterExitState, EnterExitState, Boolean> $shouldDisposeBlock, OnLookaheadMeasured $onLookaheadMeasured, Function3<AnimatedVisibilityScope, Composer, Integer, Unit> $content, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       AnimatedVisibilityKt.AnimatedEnterExitImpl(this.$transition, this.$visible, this.$modifier, this.$enter, this.$exit, this.$shouldDisposeBlock, this.$onLookaheadMeasured, this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class AnimatedVisibilityKt$AnimatedVisibility$2 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     AnimatedVisibilityKt$AnimatedVisibility$2(boolean $visible, Modifier $modifier, EnterTransition $enter, ExitTransition $exit, String $label, Function3<AnimatedVisibilityScope, Composer, Integer, Unit> $content, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       AnimatedVisibilityKt.AnimatedVisibility(this.$visible, this.$modifier, this.$enter, this.$exit, this.$label, this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class AnimatedVisibilityKt$AnimatedVisibility$4 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     AnimatedVisibilityKt$AnimatedVisibility$4(RowScope $receiver, boolean $visible, Modifier $modifier, EnterTransition $enter, ExitTransition $exit, String $label, Function3<AnimatedVisibilityScope, Composer, Integer, Unit> $content, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       AnimatedVisibilityKt.AnimatedVisibility(this.$this_AnimatedVisibility, this.$visible, this.$modifier, this.$enter, this.$exit, this.$label, this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class AnimatedVisibilityKt$AnimatedVisibility$6 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     AnimatedVisibilityKt$AnimatedVisibility$6(ColumnScope $receiver, boolean $visible, Modifier $modifier, EnterTransition $enter, ExitTransition $exit, String $label, Function3<AnimatedVisibilityScope, Composer, Integer, Unit> $content, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       AnimatedVisibilityKt.AnimatedVisibility(this.$this_AnimatedVisibility, this.$visible, this.$modifier, this.$enter, this.$exit, this.$label, this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class AnimatedVisibilityKt$AnimatedVisibility$8 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     AnimatedVisibilityKt$AnimatedVisibility$8(MutableTransitionState<Boolean> $visibleState, Modifier $modifier, EnterTransition $enter, ExitTransition $exit, String $label, Function3<AnimatedVisibilityScope, Composer, Integer, Unit> $content, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       AnimatedVisibilityKt.AnimatedVisibility(this.$visibleState, this.$modifier, this.$enter, this.$exit, this.$label, this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class AnimatedVisibilityKt$AnimatedVisibility$10 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     AnimatedVisibilityKt$AnimatedVisibility$10(RowScope $receiver, MutableTransitionState<Boolean> $visibleState, Modifier $modifier, EnterTransition $enter, ExitTransition $exit, String $label, Function3<AnimatedVisibilityScope, Composer, Integer, Unit> $content, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       AnimatedVisibilityKt.AnimatedVisibility(this.$this_AnimatedVisibility, this.$visibleState, this.$modifier, this.$enter, this.$exit, this.$label, this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class AnimatedVisibilityKt$AnimatedVisibility$12 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     AnimatedVisibilityKt$AnimatedVisibility$12(ColumnScope $receiver, MutableTransitionState<Boolean> $visibleState, Modifier $modifier, EnterTransition $enter, ExitTransition $exit, String $label, Function3<AnimatedVisibilityScope, Composer, Integer, Unit> $content, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       AnimatedVisibilityKt.AnimatedVisibility(this.$this_AnimatedVisibility, this.$visibleState, this.$modifier, this.$enter, this.$exit, this.$label, this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class AnimatedVisibilityKt$AnimatedVisibility$13 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     AnimatedVisibilityKt$AnimatedVisibility$13(Transition<T> $receiver, Function1<T, Boolean> $visible, Modifier $modifier, EnterTransition $enter, ExitTransition $exit, Function3<AnimatedVisibilityScope, Composer, Integer, Unit> $content, int $$changed, int $$default) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       AnimatedVisibilityKt.AnimatedVisibility(this.$this_AnimatedVisibility, this.$visible, this.$modifier, this.$enter, this.$exit, this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class AnimatedVisibilityKt$AnimatedVisibilityImpl$3 extends Lambda implements Function2<Composer, Integer, Unit> {
/*     */     AnimatedVisibilityKt$AnimatedVisibilityImpl$3(Transition<T> $transition, Function1<T, Boolean> $visible, Modifier $modifier, EnterTransition $enter, ExitTransition $exit, Function3<AnimatedVisibilityScope, Composer, Integer, Unit> $content, int $$changed) {
/*     */       super(2);
/*     */     }
/*     */     
/*     */     public final void invoke(@Nullable Composer $composer, int $force) {
/*     */       AnimatedVisibilityKt.AnimatedVisibilityImpl(this.$transition, this.$visible, this.$modifier, this.$enter, this.$exit, this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\AnimatedVisibilityKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */