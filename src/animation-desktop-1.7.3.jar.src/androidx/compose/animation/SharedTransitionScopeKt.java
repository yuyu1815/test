/*      */ package androidx.compose.animation;
/*      */ 
/*      */ import androidx.collection.MutableScatterMap;
/*      */ import androidx.compose.animation.core.AnimationSpecKt;
/*      */ import androidx.compose.animation.core.FiniteAnimationSpec;
/*      */ import androidx.compose.animation.core.SpringSpec;
/*      */ import androidx.compose.animation.core.VisibilityThresholdsKt;
/*      */ import androidx.compose.foundation.layout.BoxKt;
/*      */ import androidx.compose.foundation.layout.BoxScope;
/*      */ import androidx.compose.foundation.layout.BoxScopeInstance;
/*      */ import androidx.compose.runtime.Composable;
/*      */ import androidx.compose.runtime.ComposableInferredTarget;
/*      */ import androidx.compose.runtime.ComposableTarget;
/*      */ import androidx.compose.runtime.ComposablesKt;
/*      */ import androidx.compose.runtime.Composer;
/*      */ import androidx.compose.runtime.ComposerKt;
/*      */ import androidx.compose.runtime.CompositionLocalMap;
/*      */ import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
/*      */ import androidx.compose.runtime.DisposableEffectResult;
/*      */ import androidx.compose.runtime.DisposableEffectScope;
/*      */ import androidx.compose.runtime.EffectsKt;
/*      */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*      */ import androidx.compose.runtime.Updater;
/*      */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*      */ import androidx.compose.runtime.snapshots.SnapshotStateObserver;
/*      */ import androidx.compose.ui.Alignment;
/*      */ import androidx.compose.ui.ComposedModifierKt;
/*      */ import androidx.compose.ui.Modifier;
/*      */ import androidx.compose.ui.draw.DrawModifierKt;
/*      */ import androidx.compose.ui.geometry.Rect;
/*      */ import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
/*      */ import androidx.compose.ui.graphics.GraphicsLayerScope;
/*      */ import androidx.compose.ui.graphics.Path;
/*      */ import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
/*      */ import androidx.compose.ui.layout.ContentScale;
/*      */ import androidx.compose.ui.layout.LayoutCoordinates;
/*      */ import androidx.compose.ui.layout.LayoutModifierKt;
/*      */ import androidx.compose.ui.layout.LookaheadScope;
/*      */ import androidx.compose.ui.layout.LookaheadScopeKt;
/*      */ import androidx.compose.ui.layout.Measurable;
/*      */ import androidx.compose.ui.layout.MeasurePolicy;
/*      */ import androidx.compose.ui.layout.MeasureResult;
/*      */ import androidx.compose.ui.layout.MeasureScope;
/*      */ import androidx.compose.ui.layout.Placeable;
/*      */ import androidx.compose.ui.node.ComposeUiNode;
/*      */ import androidx.compose.ui.unit.Constraints;
/*      */ import androidx.compose.ui.unit.Density;
/*      */ import androidx.compose.ui.unit.LayoutDirection;
/*      */ import kotlin.Lazy;
/*      */ import kotlin.LazyKt;
/*      */ import kotlin.LazyThreadSafetyMode;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.Unit;
/*      */ import kotlin.coroutines.CoroutineContext;
/*      */ import kotlin.coroutines.EmptyCoroutineContext;
/*      */ import kotlin.jvm.functions.Function0;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.functions.Function2;
/*      */ import kotlin.jvm.functions.Function3;
/*      */ import kotlin.jvm.functions.Function4;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.Lambda;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import kotlinx.coroutines.CoroutineScope;
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
/*      */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000t\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\t\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\007\032\030\020#\032\0020\0352\006\020$\032\0020\0332\006\020%\032\0020\034H\003\0325\020&\032\0020'2\b\b\002\020(\032\0020)2\034\020*\032\030\022\004\022\0020,\022\004\022\0020'0+¢\006\002\b-¢\006\002\b.H\007¢\006\002\020/\0321\0200\032\0020'2\"\020*\032\036\022\004\022\0020,\022\004\022\0020)\022\004\022\0020'0\005¢\006\002\b-¢\006\002\b.H\007¢\006\002\0201\032\"\0202\032\0020)*\0020)2\006\0203\032\0020\0352\f\0204\032\b\022\004\022\0020\0130\nH\002\"\026\020\000\032\0020\0018\002X\004¢\006\b\n\000\022\004\b\002\020\003\"\"\020\004\032\026\022\004\022\0020\006\022\004\022\0020\007\022\006\022\004\030\0010\b0\005X\004¢\006\002\n\000\"\024\020\t\032\b\022\004\022\0020\0130\nX\004¢\006\002\n\000\"\024\020\f\032\b\022\004\022\0020\0160\rX\004¢\006\002\n\000\"\026\020\017\032\0020\0208\002X\004¢\006\b\n\000\022\004\b\021\020\003\"\033\020\022\032\0020\0238@X\002¢\006\f\n\004\b\026\020\027\032\004\b\024\020\025\"\016\020\030\032\0020\013XT¢\006\002\n\000\".\020\031\032\032\022\004\022\0020\033\022\020\022\016\022\004\022\0020\034\022\004\022\0020\0350\0320\0328\002X\004¢\006\b\n\000\022\004\b\036\020\003\"\030\020\037\032\0020\013*\0020\0348BX\004¢\006\006\032\004\b \020!\"\030\020\037\032\0020\013*\0020\0338BX\004¢\006\006\032\004\b \020\"¨\0065"}, d2 = {"DefaultBoundsTransform", "Landroidx/compose/animation/BoundsTransform;", "getDefaultBoundsTransform$annotations", "()V", "DefaultClipInOverlayDuringTransition", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/Path;", "DefaultEnabled", "Lkotlin/Function0;", "", "DefaultSpring", "Landroidx/compose/animation/core/SpringSpec;", "Landroidx/compose/ui/geometry/Rect;", "ParentClip", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "getParentClip$annotations", "SharedTransitionObserver", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "getSharedTransitionObserver", "()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "SharedTransitionObserver$delegate", "Lkotlin/Lazy;", "VisualDebugging", "cachedScaleToBoundsImplMap", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/ui/layout/ContentScale;", "Landroidx/compose/ui/Alignment;", "Landroidx/compose/animation/ScaleToBoundsImpl;", "getCachedScaleToBoundsImplMap$annotations", "shouldCache", "getShouldCache", "(Landroidx/compose/ui/Alignment;)Z", "(Landroidx/compose/ui/layout/ContentScale;)Z", "ScaleToBoundsCached", "contentScale", "alignment", "SharedTransitionLayout", "", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/animation/SharedTransitionScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SharedTransitionScope", "(Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "createContentScaleModifier", "scaleToBounds", "isEnabled", "animation"})
/*      */ @SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeKt\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1337:1\n863#2:1338\n863#2:1340\n1#3:1339\n1#3:1341\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeKt\n*L\n1302#1:1338\n1303#1:1340\n1302#1:1339\n1303#1:1341\n*E\n"})
/*      */ public final class SharedTransitionScopeKt
/*      */ {
/*      */   @ExperimentalSharedTransitionApi
/*      */   @Composable
/*      */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*      */   public static final void SharedTransitionLayout(@Nullable Modifier modifier, @NotNull Function3<? super SharedTransitionScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*  112 */     Intrinsics.checkNotNullParameter(content, "content"); $composer = $composer.startRestartGroup(2043053727); ComposerKt.sourceInformation($composer, "C(SharedTransitionLayout)P(1)112@5418L299,112@5396L321:SharedTransitionScope.kt#xbi5r1"); int $dirty = $changed; if ((paramInt1 & 0x1) != 0) { $dirty |= 0x6; } else if (($changed & 0x6) == 0) { $dirty |= $composer.changed(modifier) ? 4 : 2; }  if ((paramInt1 & 0x2) != 0) { $dirty |= 0x30; } else if (($changed & 0x30) == 0) { $dirty |= $composer.changedInstance(content) ? 32 : 16; }  if (($dirty & 0x13) != 18 || !$composer.getSkipping()) { if ((paramInt1 & 0x1) != 0) modifier = (Modifier)Modifier.Companion;  if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(2043053727, $dirty, -1, "androidx.compose.animation.SharedTransitionLayout (SharedTransitionScope.kt:111)");
/*      */        }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  120 */     $composer.skipToGroupEnd(); if ($composer.endRestartGroup() != null) { $composer.endRestartGroup().updateScope(new SharedTransitionScopeKt$SharedTransitionLayout$2(modifier, content, $changed, paramInt1)); } else { $composer.endRestartGroup(); }
/*      */   
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
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004H\013¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/SharedTransitionScope;", "sharedTransitionModifier", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/animation/SharedTransitionScope;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V"})
/*      */   @SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionLayout$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,1337:1\n71#2:1338\n68#2,6:1339\n74#2:1373\n78#2:1377\n79#3,6:1345\n86#3,4:1360\n90#3,2:1370\n94#3:1376\n368#4,9:1351\n377#4:1372\n378#4,2:1374\n4034#5,6:1364\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionLayout$1\n*L\n116#1:1338\n116#1:1339,6\n116#1:1373\n116#1:1377\n116#1:1345,6\n116#1:1360,4\n116#1:1370,2\n116#1:1376\n116#1:1351,9\n116#1:1372\n116#1:1374,2\n116#1:1364,6\n*E\n"})
/*      */   static final class SharedTransitionScopeKt$SharedTransitionLayout$1
/*      */     extends Lambda
/*      */     implements Function4<SharedTransitionScope, Modifier, Composer, Integer, Unit>
/*      */   {
/*      */     @Composable
/*      */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*      */     public final void invoke(@NotNull SharedTransitionScope $this$SharedTransitionScope, @NotNull Modifier sharedTransitionModifier, @Nullable Composer $composer, int $changed) {
/*      */       Intrinsics.checkNotNullParameter($this$SharedTransitionScope, "$this$SharedTransitionScope");
/*      */       Intrinsics.checkNotNullParameter(sharedTransitionModifier, "sharedTransitionModifier");
/*      */       ComposerKt.sourceInformation($composer, "C115@5633L78:SharedTransitionScope.kt#xbi5r1");
/*      */       int $dirty = $changed;
/*      */       if (($changed & 0x6) == 0) {
/*      */         $dirty |= $composer.changed($this$SharedTransitionScope) ? 4 : 2;
/*      */       }
/*      */       if (($changed & 0x30) == 0) {
/*      */         $dirty |= $composer.changed(sharedTransitionModifier) ? 32 : 16;
/*      */       }
/*      */       if (($dirty & 0x93) != 146 || !$composer.getSkipping()) {
/*      */         if (ComposerKt.isTraceInProgress()) {
/*      */           ComposerKt.traceEventStart(-130587847, $dirty, -1, "androidx.compose.animation.SharedTransitionLayout.<anonymous> (SharedTransitionScope.kt:115)");
/*      */         }
/*      */         Modifier modifier1 = this.$modifier.then(sharedTransitionModifier);
/*      */         Function3<SharedTransitionScope, Composer, Integer, Unit> function3 = this.$content;
/*      */         int $changed$iv = 0, $i$f$Box = 0;
/* 1338 */         ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/* 1339 */         Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
/* 1340 */         boolean propagateMinConstraints$iv = false;
/*      */ 
/*      */         
/* 1343 */         MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/* 1344 */         int $i$f$Layout = 0;
/* 1345 */         ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 1346 */         int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 1347 */         CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/* 1348 */         Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*      */         
/* 1350 */         Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 1351 */         ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 1352 */         if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 1353 */           .startReusableNode();
/* 1354 */         if ($composer.getInserting()) { $composer
/* 1355 */             .createNode(function0); } else { $composer
/*      */             
/* 1357 */             .useNode(); }
/*      */         
/* 1359 */         Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 1360 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 1361 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*      */         
/* 1363 */         Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 1364 */         Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 1365 */         if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 1366 */           $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 1367 */           $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*      */         } 
/*      */         
/* 1370 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*      */         
/* 1372 */         int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/* 1373 */         ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-SharedTransitionScopeKt$SharedTransitionLayout$1$1 = 0; ComposerKt.sourceInformationMarkerStart(composer1, -1574472691, "C116@5692L9:SharedTransitionScope.kt#xbi5r1"); function3.invoke($this$SharedTransitionScope, composer1, Integer.valueOf(0xE & $dirty)); ComposerKt.sourceInformationMarkerEnd(composer1); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 1374 */         $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 1375 */         ComposerKt.sourceInformationMarkerEnd($composer);
/* 1376 */         ComposerKt.sourceInformationMarkerEnd($composer);
/* 1377 */         if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd(); 
/*      */       } else {
/*      */         $composer.skipToGroupEnd();
/*      */       } 
/*      */     }
/*      */     
/*      */     SharedTransitionScopeKt$SharedTransitionLayout$1(Modifier $modifier, Function3<SharedTransitionScope, Composer, Integer, Unit> $content) {
/*      */       super(4);
/*      */     }
/*      */   }
/*      */   
/*      */   @ExperimentalSharedTransitionApi
/*      */   @Composable
/*      */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*      */   public static final void SharedTransitionScope(@NotNull Function4<? super SharedTransitionScope, ? super Modifier, ? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed) {
/*      */     Intrinsics.checkNotNullParameter(content, "content");
/*      */     $composer = $composer.startRestartGroup(-2093217917);
/*      */     ComposerKt.sourceInformation($composer, "C(SharedTransitionScope)139@6613L1099,139@6598L1114:SharedTransitionScope.kt#xbi5r1");
/*      */     int $dirty = $changed;
/*      */     if (($changed & 0x6) == 0)
/*      */       $dirty |= $composer.changedInstance(content) ? 4 : 2; 
/*      */     if (($dirty & 0x3) != 2 || !$composer.getSkipping()) {
/*      */       if (ComposerKt.isTraceInProgress())
/*      */         ComposerKt.traceEventStart(-2093217917, $dirty, -1, "androidx.compose.animation.SharedTransitionScope (SharedTransitionScope.kt:138)"); 
/*      */       LookaheadScopeKt.LookaheadScope((Function3)ComposableLambdaKt.rememberComposableLambda(-863967934, true, new SharedTransitionScopeKt$SharedTransitionScope$1(content), $composer, 54), $composer, 6);
/*      */       if (ComposerKt.isTraceInProgress())
/*      */         ComposerKt.traceEventEnd(); 
/*      */     } else {
/*      */       $composer.skipToGroupEnd();
/*      */     } 
/*      */     if ($composer.endRestartGroup() != null) {
/*      */       $composer.endRestartGroup().updateScope(new SharedTransitionScopeKt$SharedTransitionScope$2(content, $changed));
/*      */     } else {
/*      */       $composer.endRestartGroup();
/*      */     } 
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\b\002\020\000\032\0020\001*\0020\002H\013¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/LookaheadScope;", "invoke", "(Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/runtime/Composer;I)V"})
/*      */   @SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionScope$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1337:1\n481#2:1338\n480#2,4:1339\n484#2,2:1346\n488#2:1352\n1225#3,3:1343\n1228#3,3:1349\n1225#3,6:1353\n1225#3,6:1359\n1225#3,6:1365\n1225#3,6:1371\n480#4:1348\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionScope$1\n*L\n141#1:1338\n141#1:1339,4\n141#1:1346,2\n141#1:1352\n141#1:1343,3\n141#1:1349,3\n142#1:1353,6\n145#1:1359,6\n159#1:1365,6\n164#1:1371,6\n141#1:1348\n*E\n"})
/*      */   static final class SharedTransitionScopeKt$SharedTransitionScope$1 extends Lambda implements Function3<LookaheadScope, Composer, Integer, Unit> {
/*      */     @Composable
/*      */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*      */     public final void invoke(@NotNull LookaheadScope $this$LookaheadScope, @Nullable Composer $composer, int $changed) {
/*      */       Intrinsics.checkNotNullParameter($this$LookaheadScope, "$this$LookaheadScope");
/*      */       ComposerKt.sourceInformation($composer, "C140@6644L24,141@6695L60,144@6830L586,158@7450L105,142@6776L789,163@7597L109,163@7574L132:SharedTransitionScope.kt#xbi5r1");
/*      */       if (ComposerKt.isTraceInProgress())
/*      */         ComposerKt.traceEventStart(-863967934, $changed, -1, "androidx.compose.animation.SharedTransitionScope.<anonymous> (SharedTransitionScope.kt:140)"); 
/*      */       int $changed$iv = 0, $i$f$rememberCoroutineScope = 0;
/*      */       ComposerKt.sourceInformationMarkerStart($composer, 773894976, "CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp");
/*      */       Composer composer$iv = $composer;
/*      */       ComposerKt.sourceInformationMarkerStart($composer, -954370320, "CC(remember):Effects.kt#9igjgp");
/*      */       Composer composer2 = $composer;
/*      */       boolean invalid$iv$iv = false;
/*      */       int i = 0;
/*      */       Object it$iv$iv = composer2.rememberedValue();
/*      */       int $i$a$-let-ComposerKt$cache$1$iv$iv = 0;
/*      */       int $i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv = 0;
/*      */       int $i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1 = 0;
/*      */       CoroutineScope coroutineScope2 = EffectsKt.createCompositionCoroutineScope((CoroutineContext)EmptyCoroutineContext.INSTANCE, composer$iv);
/*      */       Object value$iv$iv = new CompositionScopedCoroutineScopeCanceller(coroutineScope2);
/*      */       composer2.updateRememberedValue(value$iv$iv);
/*      */       CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1 = (it$iv$iv == Composer.Companion.getEmpty()) ? (CompositionScopedCoroutineScopeCanceller)value$iv$iv : (CompositionScopedCoroutineScopeCanceller)it$iv$iv;
/*      */       ComposerKt.sourceInformationMarkerEnd($composer);
/*      */       CompositionScopedCoroutineScopeCanceller wrapper$iv = compositionScopedCoroutineScopeCanceller1;
/*      */       CoroutineScope coroutineScope1 = wrapper$iv.getCoroutineScope();
/*      */       ComposerKt.sourceInformationMarkerEnd($composer);
/*      */       CoroutineScope coroutineScope = coroutineScope1;
/*      */       ComposerKt.sourceInformationMarkerStart($composer, -538772662, "CC(remember):SharedTransitionScope.kt#9igjgp");
/*      */       Composer composer1 = $composer;
/*      */       boolean invalid$iv = false;
/*      */       int $i$f$cache = 0;
/*      */       Object it$iv = composer1.rememberedValue();
/*      */       int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*      */       if (it$iv == Composer.Companion.getEmpty()) {
/*      */         int $i$a$-cache-SharedTransitionScopeKt$SharedTransitionScope$1$sharedScope$1 = 0;
/*      */         Object object = new SharedTransitionScopeImpl($this$LookaheadScope, coroutineScope);
/*      */         composer1.updateRememberedValue(object);
/*      */       } 
/*      */       SharedTransitionScopeImpl sharedTransitionScopeImpl1 = (SharedTransitionScopeImpl)it$iv;
/*      */       ComposerKt.sourceInformationMarkerEnd($composer);
/*      */       SharedTransitionScopeImpl sharedScope = sharedTransitionScopeImpl1;
/*      */       ComposerKt.sourceInformationMarkerStart($composer, -538767816, "CC(remember):SharedTransitionScope.kt#9igjgp");
/*      */       Composer $this$cache$iv = $composer;
/*      */       invalid$iv = false;
/*      */       $i$f$cache = 0;
/*      */       it$iv = $this$cache$iv.rememberedValue();
/*      */       $i$a$-let-ComposerKt$cache$1$iv = 0;
/*      */       Modifier modifier = (Modifier)Modifier.Companion;
/*      */       SharedTransitionScopeImpl sharedTransitionScopeImpl2 = sharedScope;
/*      */       Function4<SharedTransitionScope, Modifier, Composer, Integer, Unit> function4 = this.$content;
/*      */       int $i$a$-cache-SharedTransitionScopeKt$SharedTransitionScope$1$1 = 0;
/*      */       SharedTransitionScopeKt$SharedTransitionScope$1$1$1 sharedTransitionScopeKt$SharedTransitionScope$1$1$1 = new SharedTransitionScopeKt$SharedTransitionScope$1$1$1(sharedScope);
/*      */       Object value$iv = sharedTransitionScopeKt$SharedTransitionScope$1$1$1;
/*      */       $this$cache$iv.updateRememberedValue(value$iv);
/*      */       Function3 function3 = (it$iv == Composer.Companion.getEmpty()) ? (Function3)value$iv : (Function3)it$iv;
/*      */       ComposerKt.sourceInformationMarkerEnd($composer);
/*      */       ComposerKt.sourceInformationMarkerStart($composer, -538748457, "CC(remember):SharedTransitionScope.kt#9igjgp");
/*      */       $this$cache$iv = $composer;
/*      */       invalid$iv = false;
/*      */       $i$f$cache = 0;
/*      */       it$iv = $this$cache$iv.rememberedValue();
/*      */       $i$a$-let-ComposerKt$cache$1$iv = 0;
/*      */       if (it$iv == Composer.Companion.getEmpty()) {
/*      */         modifier = LayoutModifierKt.layout(modifier, function3);
/*      */         sharedTransitionScopeImpl2 = sharedTransitionScopeImpl2;
/*      */         function4 = function4;
/*      */         int $i$a$-cache-SharedTransitionScopeKt$SharedTransitionScope$1$2 = 0;
/*      */         SharedTransitionScopeKt$SharedTransitionScope$1$2$1 sharedTransitionScopeKt$SharedTransitionScope$1$2$1 = new SharedTransitionScopeKt$SharedTransitionScope$1$2$1(sharedScope);
/*      */         value$iv = sharedTransitionScopeKt$SharedTransitionScope$1$2$1;
/*      */         $this$cache$iv.updateRememberedValue(value$iv);
/*      */       } 
/*      */       Function1 function1 = (Function1)it$iv;
/*      */       ComposerKt.sourceInformationMarkerEnd($composer);
/*      */       function4.invoke(sharedTransitionScopeImpl2, DrawModifierKt.drawWithContent(modifier, function1), $composer, Integer.valueOf(6));
/*      */       ComposerKt.sourceInformationMarkerStart($composer, -538743749, "CC(remember):SharedTransitionScope.kt#9igjgp");
/*      */       $this$cache$iv = $composer;
/*      */       invalid$iv = false;
/*      */       $i$f$cache = 0;
/*      */       it$iv = $this$cache$iv.rememberedValue();
/*      */       $i$a$-let-ComposerKt$cache$1$iv = 0;
/*      */       if (it$iv == Composer.Companion.getEmpty()) {
/*      */         Unit unit = Unit.INSTANCE;
/*      */         int $i$a$-cache-SharedTransitionScopeKt$SharedTransitionScope$1$3 = 0;
/*      */         value$iv = new SharedTransitionScopeKt$SharedTransitionScope$1$3$1(sharedScope);
/*      */         $this$cache$iv.updateRememberedValue(value$iv);
/*      */       } 
/*      */       function1 = (Function1)it$iv;
/*      */       ComposerKt.sourceInformationMarkerEnd($composer);
/*      */       EffectsKt.DisposableEffect(unit, function1, $composer, 54);
/*      */       if (ComposerKt.isTraceInProgress())
/*      */         ComposerKt.traceEventEnd(); 
/*      */     }
/*      */     
/*      */     SharedTransitionScopeKt$SharedTransitionScope$1(Function4<SharedTransitionScope, Modifier, Composer, Integer, Unit> $content) {
/*      */       super(3);
/*      */     }
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   private static final Function0<Boolean> DefaultEnabled = SharedTransitionScopeKt$DefaultEnabled$1.INSTANCE;
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\b\002\020\000\032\0020\001H\n¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"})
/*      */   static final class SharedTransitionScopeKt$DefaultEnabled$1 extends Lambda implements Function0<Boolean> {
/*      */     public static final SharedTransitionScopeKt$DefaultEnabled$1 INSTANCE = new SharedTransitionScopeKt$DefaultEnabled$1();
/*      */     
/*      */     SharedTransitionScopeKt$DefaultEnabled$1() {
/*      */       super(0);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final Boolean invoke() {
/*      */       return Boolean.valueOf(true);
/*      */     }
/*      */   }
/*      */   
/*      */   private static final Modifier createContentScaleModifier(Modifier $this$createContentScaleModifier, ScaleToBoundsImpl scaleToBounds, Function0<Boolean> isEnabled) {
/*      */     return $this$createContentScaleModifier.then(Intrinsics.areEqual(scaleToBounds.getContentScale(), ContentScale.Companion.getCrop()) ? GraphicsLayerModifierKt.graphicsLayer((Modifier)Modifier.Companion, new SharedTransitionScopeKt$createContentScaleModifier$1(isEnabled)) : (Modifier)Modifier.Companion).then((Modifier)new SkipToLookaheadElement(scaleToBounds, isEnabled));
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "invoke"})
/*      */   static final class SharedTransitionScopeKt$createContentScaleModifier$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {
/*      */     public final void invoke(@NotNull GraphicsLayerScope $this$graphicsLayer) {
/*      */       Intrinsics.checkNotNullParameter($this$graphicsLayer, "$this$graphicsLayer");
/*      */       $this$graphicsLayer.setClip(((Boolean)this.$isEnabled.invoke()).booleanValue());
/*      */     }
/*      */     
/*      */     SharedTransitionScopeKt$createContentScaleModifier$1(Function0<Boolean> $isEnabled) {
/*      */       super(1);
/*      */     }
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   private static final SpringSpec<Rect> DefaultSpring = AnimationSpecKt.spring$default(0.0F, 400.0F, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 1, null);
/*      */   @NotNull
/*      */   private static final SharedTransitionScope.OverlayClip ParentClip = new SharedTransitionScopeKt$ParentClip$1();
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000)\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J*\020\002\032\004\030\0010\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"androidx/compose/animation/SharedTransitionScopeKt$ParentClip$1", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "getClipPath", "Landroidx/compose/ui/graphics/Path;", "state", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "bounds", "Landroidx/compose/ui/geometry/Rect;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "animation"})
/*      */   public static final class SharedTransitionScopeKt$ParentClip$1 implements SharedTransitionScope.OverlayClip {
/*      */     @Nullable
/*      */     public Path getClipPath(@NotNull SharedTransitionScope.SharedContentState state, @NotNull Rect bounds, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
/*      */       Intrinsics.checkNotNullParameter(state, "state");
/*      */       Intrinsics.checkNotNullParameter(bounds, "bounds");
/*      */       Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
/*      */       Intrinsics.checkNotNullParameter(density, "density");
/*      */       state.getParentSharedContentState();
/*      */       return (state.getParentSharedContentState() != null) ? state.getParentSharedContentState().getClipPathInOverlay() : null;
/*      */     }
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   private static final Function2<LayoutDirection, Density, Path> DefaultClipInOverlayDuringTransition = SharedTransitionScopeKt$DefaultClipInOverlayDuringTransition$1.INSTANCE;
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\001\n\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\n¢\006\002\b\006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroidx/compose/ui/unit/LayoutDirection;", "<anonymous parameter 1>", "Landroidx/compose/ui/unit/Density;", "invoke"})
/*      */   static final class SharedTransitionScopeKt$DefaultClipInOverlayDuringTransition$1 extends Lambda implements Function2 {
/*      */     public static final SharedTransitionScopeKt$DefaultClipInOverlayDuringTransition$1 INSTANCE = new SharedTransitionScopeKt$DefaultClipInOverlayDuringTransition$1();
/*      */     
/*      */     SharedTransitionScopeKt$DefaultClipInOverlayDuringTransition$1() {
/*      */       super(2);
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public final Void invoke(@NotNull LayoutDirection param1LayoutDirection, @NotNull Density param1Density) {
/*      */       Intrinsics.checkNotNullParameter(param1LayoutDirection, "<anonymous parameter 0>");
/*      */       Intrinsics.checkNotNullParameter(param1Density, "<anonymous parameter 1>");
/*      */       return null;
/*      */     }
/*      */   }
/*      */   @NotNull
/*      */   private static final BoundsTransform DefaultBoundsTransform = SharedTransitionScopeKt::DefaultBoundsTransform$lambda$0;
/*      */   public static final boolean VisualDebugging = false;
/*      */   
/*      */   private static final FiniteAnimationSpec DefaultBoundsTransform$lambda$0(Rect paramRect1, Rect paramRect2) {
/*      */     Intrinsics.checkNotNullParameter(paramRect1, "<anonymous parameter 0>");
/*      */     Intrinsics.checkNotNullParameter(paramRect2, "<anonymous parameter 1>");
/*      */     return (FiniteAnimationSpec)DefaultSpring;
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   private static final Lazy SharedTransitionObserver$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, SharedTransitionScopeKt$SharedTransitionObserver$2.INSTANCE);
/*      */   
/*      */   @NotNull
/*      */   public static final SnapshotStateObserver getSharedTransitionObserver() {
/*      */     Lazy lazy = SharedTransitionObserver$delegate;
/*      */     return (SnapshotStateObserver)lazy.getValue();
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "invoke"})
/*      */   @SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionObserver$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1337:1\n1#2:1338\n*E\n"})
/*      */   static final class SharedTransitionScopeKt$SharedTransitionObserver$2 extends Lambda implements Function0<SnapshotStateObserver> {
/*      */     public static final SharedTransitionScopeKt$SharedTransitionObserver$2 INSTANCE = new SharedTransitionScopeKt$SharedTransitionObserver$2();
/*      */     
/*      */     @NotNull
/*      */     public final SnapshotStateObserver invoke() {
/*      */       SnapshotStateObserver snapshotStateObserver1 = new SnapshotStateObserver(null.INSTANCE), it = snapshotStateObserver1;
/*      */       int $i$a$-also-SharedTransitionScopeKt$SharedTransitionObserver$2$2 = 0;
/*      */       it.start();
/*      */       return snapshotStateObserver1;
/*      */     }
/*      */     
/*      */     SharedTransitionScopeKt$SharedTransitionObserver$2() {
/*      */       super(0);
/*      */     }
/*      */   }
/*      */   
/*      */   @ExperimentalSharedTransitionApi
/*      */   private static final ScaleToBoundsImpl ScaleToBoundsCached(ContentScale contentScale, Alignment alignment) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: invokestatic getShouldCache : (Landroidx/compose/ui/layout/ContentScale;)Z
/*      */     //   4: ifeq -> 117
/*      */     //   7: aload_1
/*      */     //   8: invokestatic getShouldCache : (Landroidx/compose/ui/Alignment;)Z
/*      */     //   11: ifeq -> 117
/*      */     //   14: getstatic androidx/compose/animation/SharedTransitionScopeKt.cachedScaleToBoundsImplMap : Landroidx/collection/MutableScatterMap;
/*      */     //   17: astore_3
/*      */     //   18: iconst_0
/*      */     //   19: istore #4
/*      */     //   21: aload_3
/*      */     //   22: aload_0
/*      */     //   23: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   26: dup
/*      */     //   27: ifnonnull -> 62
/*      */     //   30: pop
/*      */     //   31: iconst_0
/*      */     //   32: istore #5
/*      */     //   34: new androidx/collection/MutableScatterMap
/*      */     //   37: dup
/*      */     //   38: iconst_0
/*      */     //   39: iconst_1
/*      */     //   40: aconst_null
/*      */     //   41: invokespecial <init> : (IILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*      */     //   44: astore #6
/*      */     //   46: aload #6
/*      */     //   48: astore #7
/*      */     //   50: iconst_0
/*      */     //   51: istore #8
/*      */     //   53: aload_3
/*      */     //   54: aload_0
/*      */     //   55: aload #7
/*      */     //   57: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
/*      */     //   60: aload #6
/*      */     //   62: nop
/*      */     //   63: checkcast androidx/collection/MutableScatterMap
/*      */     //   66: astore_2
/*      */     //   67: aload_2
/*      */     //   68: astore_3
/*      */     //   69: iconst_0
/*      */     //   70: istore #4
/*      */     //   72: aload_3
/*      */     //   73: aload_1
/*      */     //   74: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   77: dup
/*      */     //   78: ifnonnull -> 112
/*      */     //   81: pop
/*      */     //   82: iconst_0
/*      */     //   83: istore #5
/*      */     //   85: new androidx/compose/animation/ScaleToBoundsImpl
/*      */     //   88: dup
/*      */     //   89: aload_0
/*      */     //   90: aload_1
/*      */     //   91: invokespecial <init> : (Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/Alignment;)V
/*      */     //   94: astore #6
/*      */     //   96: aload #6
/*      */     //   98: astore #7
/*      */     //   100: iconst_0
/*      */     //   101: istore #8
/*      */     //   103: aload_3
/*      */     //   104: aload_1
/*      */     //   105: aload #7
/*      */     //   107: invokevirtual set : (Ljava/lang/Object;Ljava/lang/Object;)V
/*      */     //   110: aload #6
/*      */     //   112: nop
/*      */     //   113: checkcast androidx/compose/animation/ScaleToBoundsImpl
/*      */     //   116: areturn
/*      */     //   117: new androidx/compose/animation/ScaleToBoundsImpl
/*      */     //   120: dup
/*      */     //   121: aload_0
/*      */     //   122: aload_1
/*      */     //   123: invokespecial <init> : (Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/ui/Alignment;)V
/*      */     //   126: areturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1301	-> 0
/*      */     //   #1302	-> 14
/*      */     //   #1338	-> 21
/*      */     //   #1302	-> 34
/*      */     //   #1338	-> 44
/*      */     //   #1339	-> 50
/*      */     //   #1338	-> 53
/*      */     //   #1338	-> 60
/*      */     //   #1338	-> 62
/*      */     //   #1302	-> 63
/*      */     //   #1303	-> 67
/*      */     //   #1340	-> 72
/*      */     //   #1304	-> 85
/*      */     //   #1340	-> 94
/*      */     //   #1341	-> 100
/*      */     //   #1340	-> 103
/*      */     //   #1340	-> 110
/*      */     //   #1340	-> 112
/*      */     //   #1303	-> 116
/*      */     //   #1309	-> 117
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   34	10	5	$i$a$-getOrPut-SharedTransitionScopeKt$ScaleToBoundsCached$map$1	I
/*      */     //   53	7	8	$i$a$-also-MutableScatterMap$getOrPut$1$iv	I
/*      */     //   50	10	7	it$iv	Ljava/lang/Object;
/*      */     //   21	42	4	$i$f$getOrPut	I
/*      */     //   18	45	3	this_$iv	Landroidx/collection/MutableScatterMap;
/*      */     //   85	9	5	$i$a$-getOrPut-SharedTransitionScopeKt$ScaleToBoundsCached$1	I
/*      */     //   103	7	8	$i$a$-also-MutableScatterMap$getOrPut$1$iv	I
/*      */     //   100	10	7	it$iv	Ljava/lang/Object;
/*      */     //   72	41	4	$i$f$getOrPut	I
/*      */     //   69	44	3	this_$iv	Landroidx/collection/MutableScatterMap;
/*      */     //   67	50	2	map	Landroidx/collection/MutableScatterMap;
/*      */     //   0	127	0	contentScale	Landroidx/compose/ui/layout/ContentScale;
/*      */     //   0	127	1	alignment	Landroidx/compose/ui/Alignment;
/*      */   }
/*      */   
/*      */   private static final boolean getShouldCache(Alignment $this$shouldCache) {
/*      */     return ($this$shouldCache == Alignment.Companion.getTopStart() || $this$shouldCache == Alignment.Companion.getTopCenter() || $this$shouldCache == Alignment.Companion.getTopEnd() || $this$shouldCache == Alignment.Companion.getCenterStart() || $this$shouldCache == Alignment.Companion.getCenter() || $this$shouldCache == Alignment.Companion.getCenterEnd() || $this$shouldCache == Alignment.Companion.getBottomStart() || $this$shouldCache == Alignment.Companion.getBottomCenter() || $this$shouldCache == Alignment.Companion.getBottomEnd());
/*      */   }
/*      */   
/*      */   private static final boolean getShouldCache(ContentScale $this$shouldCache) {
/*      */     return ($this$shouldCache == ContentScale.Companion.getFillWidth() || $this$shouldCache == ContentScale.Companion.getFillHeight() || $this$shouldCache == ContentScale.Companion.getFillBounds() || $this$shouldCache == ContentScale.Companion.getFit() || $this$shouldCache == ContentScale.Companion.getCrop() || $this$shouldCache == ContentScale.Companion.getNone() || $this$shouldCache == ContentScale.Companion.getInside());
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   private static final MutableScatterMap<ContentScale, MutableScatterMap<Alignment, ScaleToBoundsImpl>> cachedScaleToBoundsImplMap = new MutableScatterMap(0, 1, null);
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*      */   static final class SharedTransitionScopeKt$SharedTransitionLayout$2 extends Lambda implements Function2<Composer, Integer, Unit> {
/*      */     SharedTransitionScopeKt$SharedTransitionLayout$2(Modifier $modifier, Function3<SharedTransitionScope, Composer, Integer, Unit> $content, int $$changed, int $$default) {
/*      */       super(2);
/*      */     }
/*      */     
/*      */     public final void invoke(@Nullable Composer $composer, int $force) {
/*      */       SharedTransitionScopeKt.SharedTransitionLayout(this.$modifier, this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*      */   static final class SharedTransitionScopeKt$SharedTransitionScope$2 extends Lambda implements Function2<Composer, Integer, Unit> {
/*      */     SharedTransitionScopeKt$SharedTransitionScope$2(Function4<SharedTransitionScope, Modifier, Composer, Integer, Unit> $content, int $$changed) {
/*      */       super(2);
/*      */     }
/*      */     
/*      */     public final void invoke(@Nullable Composer $composer, int $force) {
/*      */       SharedTransitionScopeKt.SharedTransitionScope(this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1));
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\SharedTransitionScopeKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */