/*      */ package androidx.compose.animation;
/*      */ 
/*      */ import androidx.collection.MutableScatterMap;
/*      */ import androidx.collection.ScatterMap;
/*      */ import androidx.compose.animation.core.Transition;
/*      */ import androidx.compose.runtime.Composable;
/*      */ import androidx.compose.runtime.Composer;
/*      */ import androidx.compose.runtime.ComposerKt;
/*      */ import androidx.compose.runtime.MutableState;
/*      */ import androidx.compose.runtime.SnapshotStateKt;
/*      */ import androidx.compose.runtime.Stable;
/*      */ import androidx.compose.runtime.State;
/*      */ import androidx.compose.runtime.snapshots.SnapshotStateList;
/*      */ import androidx.compose.ui.ComposedModifierKt;
/*      */ import androidx.compose.ui.Modifier;
/*      */ import androidx.compose.ui.geometry.Rect;
/*      */ import androidx.compose.ui.graphics.OutlineKt;
/*      */ import androidx.compose.ui.graphics.Path;
/*      */ import androidx.compose.ui.graphics.Shape;
/*      */ import androidx.compose.ui.graphics.SkiaBackedPath_skikoKt;
/*      */ import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
/*      */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*      */ import androidx.compose.ui.layout.LayoutCoordinates;
/*      */ import androidx.compose.ui.layout.LookaheadScope;
/*      */ import androidx.compose.ui.layout.Placeable;
/*      */ import androidx.compose.ui.unit.Density;
/*      */ import androidx.compose.ui.unit.LayoutDirection;
/*      */ import java.util.List;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.ResultKt;
/*      */ import kotlin.Unit;
/*      */ import kotlin.collections.CollectionsKt;
/*      */ import kotlin.coroutines.Continuation;
/*      */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*      */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*      */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*      */ import kotlin.jvm.functions.Function0;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.functions.Function2;
/*      */ import kotlin.jvm.functions.Function3;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.Lambda;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import kotlin.reflect.KProperty;
/*      */ import kotlinx.coroutines.BuildersKt;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000à\001\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\007\n\002\030\002\n\002\b\007\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\007\n\002\b\004\n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\t\b\001\030\0002\0020\0012\0020\002:\001uB\027\b\000\022\006\020\003\032\0020\002\022\006\020\004\032\0020\005¢\006\002\020\006J\020\020,\032\0020-2\006\020.\032\0020/H\026J\025\0200\032\0020\0332\006\0201\032\00202H\000¢\006\002\b3J\025\0204\032\0020\0332\006\0205\032\0020\036H\000¢\006\002\b6J\025\0207\032\0020\0332\006\0205\032\0020\036H\000¢\006\002\b8J\025\0209\032\0020\0332\006\020:\032\0020;H\000¢\006\002\b<J\025\020=\032\0020\0332\006\020:\032\0020;H\000¢\006\002\b>J\025\020?\032\0020@2\006\020A\032\0020$H\027¢\006\002\020BJM\020C\032\0020;2\006\020D\032\0020%2\006\020E\032\0020F2\006\020G\032\0020H2\006\020I\032\0020\n2\006\020J\032\0020@2\006\020K\032\0020-2\006\020L\032\0020M2\006\020N\032\0020\nH\003¢\006\002\020OJ\020\020P\032\0020%2\006\020A\032\0020$H\002J\b\020&\032\0020\033H\002J3\020Q\032\0020R*\0020\0222\006\020S\032\0020\0222\b\b\002\020T\032\0020R2\b\b\002\020U\032\0020\nH\001ø\001\000¢\006\004\bV\020WJ>\020X\032\0020Y*\0020Y2\f\020Z\032\b\022\004\022\0020\n0\0322\006\020L\032\0020M2\032\020K\032\026\022\004\022\0020\\\022\004\022\0020]\022\006\022\004\030\0010^0[H\026J\\\020_\032\0020Y*\0020Y2\006\020J\032\0020@2\006\020`\032\0020a2\006\020b\032\0020c2\006\020d\032\0020e2\006\020f\032\0020g2\006\020h\032\0020i2\006\020G\032\0020H2\006\020N\032\0020\n2\006\020L\032\0020M2\006\020K\032\0020-H\026Jp\020j\032\0020Y\"\004\b\000\020k*\0020Y2\006\020J\032\0020@2\016\020l\032\n\022\004\022\002Hk\030\0010m2\022\020n\032\016\022\004\022\002Hk\022\004\022\0020\n0'2\006\020f\032\0020g2\b\b\002\020G\032\0020H2\006\020I\032\0020\n2\006\020N\032\0020\n2\006\020L\032\0020M2\006\020K\032\0020-H\002JS\020o\032\0020Y*\0020Y2\006\020J\032\0020@2\006\020n\032\0020\n2\b\b\002\020f\032\0020g2\b\b\002\020G\032\0020H2\b\b\002\020N\032\0020\n2\b\b\002\020L\032\0020M2\b\b\002\020K\032\0020-H\000¢\006\002\bpJD\020D\032\0020Y*\0020Y2\006\020q\032\0020@2\006\020`\032\0020a2\006\020f\032\0020g2\006\020G\032\0020H2\006\020N\032\0020\n2\006\020L\032\0020M2\006\020K\032\0020-H\026JD\020r\032\0020Y*\0020Y2\006\020J\032\0020@2\006\020n\032\0020\n2\006\020f\032\0020g2\006\020G\032\0020H2\006\020N\032\0020\n2\006\020L\032\0020M2\006\020K\032\0020-H\026J\f\020s\032\0020Y*\0020YH\026J\r\020t\032\0020\022*\0020\022H\001R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\007\020\bR+\020\013\032\0020\n2\006\020\t\032\0020\n8V@RX\002¢\006\022\n\004\b\017\020\020\032\004\b\013\020\f\"\004\b\r\020\016R\024\020\021\032\0020\0228@X\004¢\006\006\032\004\b\023\020\024R\034\020\025\032\004\030\0010\022X\016¢\006\016\n\000\032\004\b\026\020\024\"\004\b\027\020\030R\024\020\031\032\b\022\004\022\0020\0330\032X\004¢\006\002\n\000R\024\020\034\032\b\022\004\022\0020\0360\035X\004¢\006\002\n\000R\032\020\037\032\0020\022X.¢\006\016\n\000\032\004\b \020\024\"\004\b!\020\030R\032\020\"\032\016\022\004\022\0020$\022\004\022\0020%0#X\004¢\006\002\n\000R\032\020&\032\016\022\004\022\0020\001\022\004\022\0020\0330'X\004¢\006\002\n\000R\026\020(\032\0020\022*\0020)X\005¢\006\006\032\004\b*\020+\002\007\n\005\b¡\0360\001¨\006v"}, d2 = {"Landroidx/compose/animation/SharedTransitionScopeImpl;", "Landroidx/compose/animation/SharedTransitionScope;", "Landroidx/compose/ui/layout/LookaheadScope;", "lookaheadScope", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroidx/compose/ui/layout/LookaheadScope;Lkotlinx/coroutines/CoroutineScope;)V", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "<set-?>", "", "isTransitionActive", "()Z", "setTransitionActive", "(Z)V", "isTransitionActive$delegate", "Landroidx/compose/runtime/MutableState;", "lookaheadRoot", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLookaheadRoot$animation", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "nullableLookaheadRoot", "getNullableLookaheadRoot$animation", "setNullableLookaheadRoot$animation", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "observeAnimatingBlock", "Lkotlin/Function0;", "", "renderers", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Landroidx/compose/animation/LayerRenderer;", "root", "getRoot$animation", "setRoot$animation", "sharedElements", "Landroidx/collection/MutableScatterMap;", "", "Landroidx/compose/animation/SharedElement;", "updateTransitionActiveness", "Lkotlin/Function1;", "lookaheadScopeCoordinates", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "OverlayClip", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "clipShape", "Landroidx/compose/ui/graphics/Shape;", "drawInOverlay", "scope", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "drawInOverlay$animation", "onLayerRendererCreated", "renderer", "onLayerRendererCreated$animation", "onLayerRendererRemoved", "onLayerRendererRemoved$animation", "onStateAdded", "sharedElementState", "Landroidx/compose/animation/SharedElementInternalState;", "onStateAdded$animation", "onStateRemoved", "onStateRemoved$animation", "rememberSharedContentState", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "key", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "rememberSharedElementState", "sharedElement", "boundsAnimation", "Landroidx/compose/animation/BoundsAnimation;", "placeHolderSize", "Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;", "renderOnlyWhenVisible", "sharedContentState", "clipInOverlayDuringTransition", "zIndexInOverlay", "", "renderInOverlayDuringTransition", "(Landroidx/compose/animation/SharedElement;Landroidx/compose/animation/BoundsAnimation;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZLandroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/SharedTransitionScope$OverlayClip;FZLandroidx/compose/runtime/Composer;I)Landroidx/compose/animation/SharedElementInternalState;", "sharedElementsFor", "localLookaheadPositionOf", "Landroidx/compose/ui/geometry/Offset;", "sourceCoordinates", "relativeToSource", "includeMotionFrameOfReference", "localLookaheadPositionOf-au-aQtc", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/layout/LayoutCoordinates;JZ)J", "renderInSharedTransitionScopeOverlay", "Landroidx/compose/ui/Modifier;", "renderInOverlay", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/Path;", "sharedBounds", "animatedVisibilityScope", "Landroidx/compose/animation/AnimatedVisibilityScope;", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "boundsTransform", "Landroidx/compose/animation/BoundsTransform;", "resizeMode", "Landroidx/compose/animation/SharedTransitionScope$ResizeMode;", "sharedBoundsImpl", "T", "parentTransition", "Landroidx/compose/animation/core/Transition;", "visible", "sharedBoundsWithCallerManagedVisibility", "sharedBoundsWithCallerManagedVisibility$animation", "state", "sharedElementWithCallerManagedVisibility", "skipToLookaheadSize", "toLookaheadCoordinates", "ShapeBasedClip", "animation"})
/*      */ @ExperimentalSharedTransitionApi
/*      */ @Stable
/*      */ @SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1337:1\n81#2:1338\n107#2,2:1339\n1225#3,6:1341\n1225#3,6:1429\n440#4:1347\n391#4,4:1348\n363#4,6:1352\n373#4,3:1359\n376#4,2:1363\n396#4:1365\n441#4,2:1366\n397#4:1368\n379#4,6:1369\n398#4:1375\n443#4:1376\n391#4,4:1377\n363#4,6:1381\n373#4,3:1388\n376#4,2:1392\n396#4,2:1394\n379#4,6:1396\n398#4:1402\n391#4,4:1403\n363#4,6:1407\n373#4,3:1414\n376#4,2:1418\n396#4,2:1420\n379#4,6:1422\n398#4:1428\n1810#5:1358\n1672#5:1362\n1810#5:1387\n1672#5:1391\n1810#5:1413\n1672#5:1417\n1002#6,2:1435\n350#6,7:1443\n33#7,6:1437\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl\n*L\n706#1:1338\n706#1:1339,2\n913#1:1341,6\n1033#1:1429,6\n929#1:1347\n929#1:1348,4\n929#1:1352,6\n929#1:1359,3\n929#1:1363,2\n929#1:1365\n929#1:1366,2\n929#1:1368\n929#1:1369,6\n929#1:1375\n929#1:1376\n935#1:1377,4\n935#1:1381,6\n935#1:1388,3\n935#1:1392,2\n935#1:1394,2\n935#1:1396,6\n935#1:1402\n940#1:1403,4\n940#1:1407,6\n940#1:1414,3\n940#1:1418,2\n940#1:1420,2\n940#1:1422,6\n940#1:1428\n929#1:1358\n929#1:1362\n935#1:1387\n935#1:1391\n940#1:1413\n940#1:1417\n1080#1:1435,2\n1119#1:1443,7\n1085#1:1437,6\n*E\n"})
/*      */ public final class SharedTransitionScopeImpl
/*      */   implements SharedTransitionScope, LookaheadScope
/*      */ {
/*      */   @NotNull
/*      */   private final CoroutineScope coroutineScope;
/*      */   @NotNull
/*      */   private final MutableState isTransitionActive$delegate;
/*      */   @NotNull
/*      */   private final Function0<Unit> observeAnimatingBlock;
/*      */   @NotNull
/*      */   private final Function1<SharedTransitionScope, Unit> updateTransitionActiveness;
/*      */   public LayoutCoordinates root;
/*      */   @Nullable
/*      */   private LayoutCoordinates nullableLookaheadRoot;
/*      */   @NotNull
/*      */   private final SnapshotStateList<LayerRenderer> renderers;
/*      */   @NotNull
/*      */   private final MutableScatterMap<Object, SharedElement> sharedElements;
/*      */   public static final int $stable;
/*      */   
/*      */   public SharedTransitionScopeImpl(@NotNull LookaheadScope lookaheadScope, @NotNull CoroutineScope coroutineScope) {
/*  703 */     this.coroutineScope = coroutineScope;
/*  704 */     this.$$delegate_0 = lookaheadScope;
/*      */     
/*  706 */     this.isTransitionActive$delegate = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(false), null, 2, null);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  918 */     this.observeAnimatingBlock = new SharedTransitionScopeImpl$observeAnimatingBlock$1();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  924 */     this.updateTransitionActiveness = new SharedTransitionScopeImpl$updateTransitionActiveness$1();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1068 */     this.renderers = SnapshotStateKt.mutableStateListOf();
/*      */     
/* 1070 */     this.sharedElements = new MutableScatterMap(0, 1, null);
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
/*      */   @NotNull
/*      */   public final CoroutineScope getCoroutineScope() {
/*      */     return this.coroutineScope;
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
/*      */   public boolean isTransitionActive()
/*      */   {
/*      */     State state = (State)this.isTransitionActive$delegate;
/*      */     KProperty property$iv = null;
/*      */     int $i$f$getValue = 0;
/* 1338 */     return ((Boolean)state.getValue()).booleanValue(); } private void setTransitionActive(boolean <set-?>) { MutableState mutableState = this.isTransitionActive$delegate; Object object = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 1339 */     mutableState.setValue(value$iv); } @NotNull public Modifier skipToLookaheadSize(@NotNull Modifier $this$skipToLookaheadSize) { Intrinsics.checkNotNullParameter($this$skipToLookaheadSize, "<this>"); return $this$skipToLookaheadSize.then((Modifier)new SkipToLookaheadElement(null, null, 3, null)); } @NotNull public Modifier renderInSharedTransitionScopeOverlay(@NotNull Modifier $this$renderInSharedTransitionScopeOverlay, @NotNull Function0<Boolean> renderInOverlay, float zIndexInOverlay, @NotNull Function2<? super LayoutDirection, ? super Density, ? extends Path> clipInOverlayDuringTransition) { Intrinsics.checkNotNullParameter($this$renderInSharedTransitionScopeOverlay, "<this>"); Intrinsics.checkNotNullParameter(renderInOverlay, "renderInOverlay"); Intrinsics.checkNotNullParameter(clipInOverlayDuringTransition, "clipInOverlayDuringTransition"); return $this$renderInSharedTransitionScopeOverlay.then((Modifier)new RenderInTransitionOverlayNodeElement(this, renderInOverlay, zIndexInOverlay, clipInOverlayDuringTransition)); } @NotNull public Modifier sharedElement(@NotNull Modifier $this$sharedElement, @NotNull SharedTransitionScope.SharedContentState state, @NotNull AnimatedVisibilityScope animatedVisibilityScope, @NotNull BoundsTransform boundsTransform, @NotNull SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean renderInOverlayDuringTransition, float zIndexInOverlay, @NotNull SharedTransitionScope.OverlayClip clipInOverlayDuringTransition) { Intrinsics.checkNotNullParameter($this$sharedElement, "<this>"); Intrinsics.checkNotNullParameter(state, "state"); Intrinsics.checkNotNullParameter(animatedVisibilityScope, "animatedVisibilityScope"); Intrinsics.checkNotNullParameter(boundsTransform, "boundsTransform"); Intrinsics.checkNotNullParameter(placeHolderSize, "placeHolderSize"); Intrinsics.checkNotNullParameter(clipInOverlayDuringTransition, "clipInOverlayDuringTransition"); return sharedBoundsImpl($this$sharedElement, state, animatedVisibilityScope.getTransition(), SharedTransitionScopeImpl$sharedElement$1.INSTANCE, boundsTransform, placeHolderSize, true, renderInOverlayDuringTransition, zIndexInOverlay, clipInOverlayDuringTransition); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/animation/EnterExitState;", "invoke", "(Landroidx/compose/animation/EnterExitState;)Ljava/lang/Boolean;"}) static final class SharedTransitionScopeImpl$sharedElement$1 extends Lambda implements Function1<EnterExitState, Boolean> {
/* 1340 */     public static final SharedTransitionScopeImpl$sharedElement$1 INSTANCE = new SharedTransitionScopeImpl$sharedElement$1(); @NotNull public final Boolean invoke(@NotNull EnterExitState it) { Intrinsics.checkNotNullParameter(it, "it"); return Boolean.valueOf((it == EnterExitState.Visible)); } SharedTransitionScopeImpl$sharedElement$1() { super(1); } } @NotNull public Modifier sharedBounds(@NotNull Modifier $this$sharedBounds, @NotNull SharedTransitionScope.SharedContentState sharedContentState, @NotNull AnimatedVisibilityScope animatedVisibilityScope, @NotNull EnterTransition enter, @NotNull ExitTransition exit, @NotNull BoundsTransform boundsTransform, @NotNull SharedTransitionScope.ResizeMode resizeMode, @NotNull SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean renderInOverlayDuringTransition, float zIndexInOverlay, @NotNull SharedTransitionScope.OverlayClip clipInOverlayDuringTransition) { Intrinsics.checkNotNullParameter($this$sharedBounds, "<this>"); Intrinsics.checkNotNullParameter(sharedContentState, "sharedContentState"); Intrinsics.checkNotNullParameter(animatedVisibilityScope, "animatedVisibilityScope"); Intrinsics.checkNotNullParameter(enter, "enter"); Intrinsics.checkNotNullParameter(exit, "exit"); Intrinsics.checkNotNullParameter(boundsTransform, "boundsTransform"); Intrinsics.checkNotNullParameter(resizeMode, "resizeMode"); Intrinsics.checkNotNullParameter(placeHolderSize, "placeHolderSize"); Intrinsics.checkNotNullParameter(clipInOverlayDuringTransition, "clipInOverlayDuringTransition"); Transition<EnterExitState> transition = animatedVisibilityScope.getTransition(); return ComposedModifierKt.composed$default(sharedBoundsImpl($this$sharedBounds, sharedContentState, transition, SharedTransitionScopeImpl$sharedBounds$1.INSTANCE, boundsTransform, placeHolderSize, false, renderInOverlayDuringTransition, zIndexInOverlay, clipInOverlayDuringTransition), null, new SharedTransitionScopeImpl$sharedBounds$2(animatedVisibilityScope, enter, exit, sharedContentState, resizeMode), 1, null); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/animation/EnterExitState;", "invoke", "(Landroidx/compose/animation/EnterExitState;)Ljava/lang/Boolean;"}) static final class SharedTransitionScopeImpl$sharedBounds$1 extends Lambda implements Function1<EnterExitState, Boolean> { public static final SharedTransitionScopeImpl$sharedBounds$1 INSTANCE = new SharedTransitionScopeImpl$sharedBounds$1(); @NotNull public final Boolean invoke(@NotNull EnterExitState it) { Intrinsics.checkNotNullParameter(it, "it"); return Boolean.valueOf((it == EnterExitState.Visible)); } SharedTransitionScopeImpl$sharedBounds$1() { super(1); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\001*\0020\001H\013¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}) @SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl$sharedBounds$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1337:1\n1225#2,6:1338\n1225#2,6:1344\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl$sharedBounds$2\n*L\n780#1:1338,6\n785#1:1344,6\n*E\n"}) static final class SharedTransitionScopeImpl$sharedBounds$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> { SharedTransitionScopeImpl$sharedBounds$2(AnimatedVisibilityScope $animatedVisibilityScope, EnterTransition $enter, ExitTransition $exit, SharedTransitionScope.SharedContentState $sharedContentState, SharedTransitionScope.ResizeMode $resizeMode) { super(3); } @Composable @NotNull public final Modifier invoke(@NotNull Modifier $this$composed, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$composed, "$this$composed"); $composer.startReplaceGroup(-419341573); ComposerKt.sourceInformation($composer, "C779@41927L35,771@41404L656,784@42227L530:SharedTransitionScope.kt#xbi5r1"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-419341573, $changed, -1, "androidx.compose.animation.SharedTransitionScopeImpl.sharedBounds.<anonymous> (SharedTransitionScope.kt:770)");  ComposerKt.sourceInformationMarkerStart($composer, -1411456741, "CC(remember):SharedTransitionScope.kt#9igjgp"); Composer composer1 = $composer; boolean bool1 = $composer.changedInstance(this.$sharedContentState); SharedTransitionScope.SharedContentState sharedContentState1 = this.$sharedContentState; int $i$f$cache = 0; Object it$iv = composer1.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0; ExitTransition exitTransition = this.$exit; EnterTransition enterTransition = this.$enter; Transition<EnterExitState> transition = this.$animatedVisibilityScope.getTransition(); int $i$a$-cache-SharedTransitionScopeImpl$sharedBounds$2$1 = 0; SharedTransitionScopeImpl$sharedBounds$2$1$1 sharedTransitionScopeImpl$sharedBounds$2$1$1 = new SharedTransitionScopeImpl$sharedBounds$2$1$1(sharedContentState1); Object value$iv = sharedTransitionScopeImpl$sharedBounds$2$1$1;
/* 1341 */       composer1.updateRememberedValue(value$iv);
/* 1342 */       Function0<Boolean> function0 = (bool1 || it$iv == Composer.Companion.getEmpty()) ? (Function0)value$iv : 
/* 1343 */         (Function0)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerStart($composer, -1411446646, "CC(remember):SharedTransitionScope.kt#9igjgp"); Composer composer2 = $composer; boolean bool2 = $composer.changedInstance(this.$sharedContentState); SharedTransitionScope.SharedContentState sharedContentState2 = this.$sharedContentState; int i = 0;
/* 1344 */       Object object1 = composer2.rememberedValue(); int j = 0;
/*      */       
/* 1346 */       ScaleToBoundsImpl scaleToBoundsImpl = (ScaleToBoundsImpl)this.$resizeMode; Modifier modifier3 = (Modifier)Modifier.Companion, modifier2 = EnterExitTransitionKt.createModifier(transition, enterTransition, exitTransition, function0, "enter/exit for " + this.$sharedContentState.getKey(), $composer, 0, 0); int $i$a$-cache-SharedTransitionScopeImpl$sharedBounds$2$2 = 0; SharedTransitionScopeImpl$sharedBounds$2$2$1 sharedTransitionScopeImpl$sharedBounds$2$2$1 = new SharedTransitionScopeImpl$sharedBounds$2$2$1(sharedContentState2); Object object2 = sharedTransitionScopeImpl$sharedBounds$2$2$1;
/* 1347 */       composer2.updateRememberedValue(object2);
/* 1348 */       Function0 function01 = (bool2 || object1 == Composer.Companion.getEmpty()) ? (Function0)object2 : 
/* 1349 */         (Function0)object1; ComposerKt.sourceInformationMarkerEnd($composer); Modifier modifier1 = modifier2.then((this.$resizeMode instanceof ScaleToBoundsImpl) ? SharedTransitionScopeKt.access$createContentScaleModifier(modifier3, scaleToBoundsImpl, function01) : (Modifier)Modifier.Companion); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return modifier1; } } @NotNull public Modifier sharedElementWithCallerManagedVisibility(@NotNull Modifier $this$sharedElementWithCallerManagedVisibility, @NotNull SharedTransitionScope.SharedContentState sharedContentState, boolean visible, @NotNull BoundsTransform boundsTransform, @NotNull SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean renderInOverlayDuringTransition, float zIndexInOverlay, @NotNull SharedTransitionScope.OverlayClip clipInOverlayDuringTransition) { Intrinsics.checkNotNullParameter($this$sharedElementWithCallerManagedVisibility, "<this>"); Intrinsics.checkNotNullParameter(sharedContentState, "sharedContentState"); Intrinsics.checkNotNullParameter(boundsTransform, "boundsTransform"); Intrinsics.checkNotNullParameter(placeHolderSize, "placeHolderSize"); Intrinsics.checkNotNullParameter(clipInOverlayDuringTransition, "clipInOverlayDuringTransition"); return sharedBoundsImpl($this$sharedElementWithCallerManagedVisibility, sharedContentState, null, new SharedTransitionScopeImpl$sharedElementWithCallerManagedVisibility$1(visible), boundsTransform, placeHolderSize, true, renderInOverlayDuringTransition, zIndexInOverlay, clipInOverlayDuringTransition); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Lkotlin/Unit;)Ljava/lang/Boolean;"}) static final class SharedTransitionScopeImpl$sharedElementWithCallerManagedVisibility$1 extends Lambda implements Function1<Unit, Boolean> { @NotNull public final Boolean invoke(@NotNull Unit it) { Intrinsics.checkNotNullParameter(it, "it"); return Boolean.valueOf(this.$visible); } SharedTransitionScopeImpl$sharedElementWithCallerManagedVisibility$1(boolean $visible) { super(1); } } @NotNull public final Modifier sharedBoundsWithCallerManagedVisibility$animation(@NotNull Modifier $this$sharedBoundsWithCallerManagedVisibility, @NotNull SharedTransitionScope.SharedContentState sharedContentState, boolean visible, @NotNull BoundsTransform boundsTransform, @NotNull SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean renderInOverlayDuringTransition, float zIndexInOverlay, @NotNull SharedTransitionScope.OverlayClip clipInOverlayDuringTransition) { Intrinsics.checkNotNullParameter($this$sharedBoundsWithCallerManagedVisibility, "<this>"); Intrinsics.checkNotNullParameter(sharedContentState, "sharedContentState"); Intrinsics.checkNotNullParameter(boundsTransform, "boundsTransform"); Intrinsics.checkNotNullParameter(placeHolderSize, "placeHolderSize"); Intrinsics.checkNotNullParameter(clipInOverlayDuringTransition, "clipInOverlayDuringTransition"); return sharedBoundsImpl($this$sharedBoundsWithCallerManagedVisibility, sharedContentState, null, new SharedTransitionScopeImpl$sharedBoundsWithCallerManagedVisibility$1(visible), boundsTransform, placeHolderSize, false, renderInOverlayDuringTransition, zIndexInOverlay, clipInOverlayDuringTransition); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Lkotlin/Unit;)Ljava/lang/Boolean;"}) static final class SharedTransitionScopeImpl$sharedBoundsWithCallerManagedVisibility$1 extends Lambda implements Function1<Unit, Boolean> { @NotNull public final Boolean invoke(@NotNull Unit it) { Intrinsics.checkNotNullParameter(it, "it"); return Boolean.valueOf(this.$visible); } SharedTransitionScopeImpl$sharedBoundsWithCallerManagedVisibility$1(boolean $visible) { super(1); } } @NotNull public SharedTransitionScope.OverlayClip OverlayClip(@NotNull Shape clipShape) { Intrinsics.checkNotNullParameter(clipShape, "clipShape"); return new ShapeBasedClip(clipShape); } @Composable @NotNull public SharedTransitionScope.SharedContentState rememberSharedContentState(@NotNull Object key, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(key, "key"); $composer.startReplaceGroup(799702514); ComposerKt.sourceInformation($composer, "C(rememberSharedContentState)912@49465L53:SharedTransitionScope.kt#xbi5r1"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(799702514, $changed, -1, "androidx.compose.animation.SharedTransitionScopeImpl.rememberSharedContentState (SharedTransitionScope.kt:912)");  ComposerKt.sourceInformationMarkerStart($composer, 935469886, "CC(remember):SharedTransitionScope.kt#9igjgp"); Composer composer = $composer; boolean invalid$iv = $composer.changed(key); int $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0; if (invalid$iv || it$iv == Composer.Companion.getEmpty()) { int $i$a$-cache-SharedTransitionScopeImpl$rememberSharedContentState$1 = 0; Object value$iv = new SharedTransitionScope.SharedContentState(key); composer.updateRememberedValue(value$iv); }  SharedTransitionScope.SharedContentState sharedContentState2 = (SharedTransitionScope.SharedContentState)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); SharedTransitionScope.SharedContentState sharedContentState1 = sharedContentState2; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return sharedContentState1; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) @SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl$observeAnimatingBlock$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1337:1\n440#2:1338\n391#2,4:1339\n363#2,6:1343\n373#2,3:1350\n376#2,2:1354\n396#2:1356\n441#2,2:1357\n397#2:1359\n379#2,6:1360\n398#2:1366\n443#2:1367\n1810#3:1349\n1672#3:1353\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl$observeAnimatingBlock$1\n*L\n919#1:1338\n919#1:1339,4\n919#1:1343,6\n919#1:1350,3\n919#1:1354,2\n919#1:1356\n919#1:1357,2\n919#1:1359\n919#1:1360,6\n919#1:1366\n919#1:1367\n919#1:1349\n919#1:1353\n*E\n"}) static final class SharedTransitionScopeImpl$observeAnimatingBlock$1 extends Lambda implements Function0<Unit> { public final void invoke() { ScatterMap this_$iv = (ScatterMap)SharedTransitionScopeImpl.this.sharedElements; int $i$f$any = 0; ScatterMap this_$iv$iv = this_$iv; int $i$f$forEach = 0; Object[] k$iv$iv = this_$iv$iv.keys; Object[] v$iv$iv = this_$iv$iv.values; ScatterMap this_$iv$iv$iv = this_$iv$iv; int $i$f$forEachIndexed = 0; long[] m$iv$iv$iv = this_$iv$iv$iv.metadata; int lastIndex$iv$iv$iv = m$iv$iv$iv.length - 2; int i$iv$iv$iv = 0; if (i$iv$iv$iv <= lastIndex$iv$iv$iv) { while (true) { long slot$iv$iv$iv = m$iv$iv$iv[i$iv$iv$iv]; long $this$maskEmptyOrDeleted$iv$iv$iv$iv = slot$iv$iv$iv; int $i$f$maskEmptyOrDeleted = 0; if (($this$maskEmptyOrDeleted$iv$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/* 1350 */             int bitCount$iv$iv$iv = 8 - ((i$iv$iv$iv - lastIndex$iv$iv$iv ^ 0xFFFFFFFF) >>> 31);
/* 1351 */             for (int j$iv$iv$iv = 0;; j$iv$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 1362 */             if (bitCount$iv$iv$iv == 8)
/*      */               continue; 
/*      */             continue;
/*      */           } 
/*      */           continue;
/*      */           if (i$iv$iv$iv != lastIndex$iv$iv$iv) {
/*      */             i$iv$iv$iv++;
/*      */             continue;
/*      */           } 
/*      */           continue; }
/*      */          }
/*      */       else
/*      */       {  }
/*      */        }
/*      */ 
/*      */     
/*      */     SharedTransitionScopeImpl$observeAnimatingBlock$1() {
/*      */       super(0);
/*      */     } }
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/animation/SharedTransitionScope;", "invoke"})
/*      */   static final class SharedTransitionScopeImpl$updateTransitionActiveness$1
/*      */     extends Lambda
/*      */     implements Function1<SharedTransitionScope, Unit> {
/*      */     public final void invoke(@NotNull SharedTransitionScope it) {
/*      */       Intrinsics.checkNotNullParameter(it, "it");
/*      */       SharedTransitionScopeImpl.this.updateTransitionActiveness();
/*      */     }
/*      */     
/*      */     SharedTransitionScopeImpl$updateTransitionActiveness$1() {
/*      */       super(1);
/*      */     }
/*      */   }
/*      */   
/*      */   private final void updateTransitionActiveness() {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield sharedElements : Landroidx/collection/MutableScatterMap;
/*      */     //   4: checkcast androidx/collection/ScatterMap
/*      */     //   7: astore_2
/*      */     //   8: iconst_0
/*      */     //   9: istore_3
/*      */     //   10: aload_2
/*      */     //   11: astore #4
/*      */     //   13: iconst_0
/*      */     //   14: istore #5
/*      */     //   16: aload #4
/*      */     //   18: getfield keys : [Ljava/lang/Object;
/*      */     //   21: astore #6
/*      */     //   23: aload #4
/*      */     //   25: getfield values : [Ljava/lang/Object;
/*      */     //   28: astore #7
/*      */     //   30: aload #4
/*      */     //   32: astore #8
/*      */     //   34: iconst_0
/*      */     //   35: istore #9
/*      */     //   37: aload #8
/*      */     //   39: getfield metadata : [J
/*      */     //   42: astore #10
/*      */     //   44: aload #10
/*      */     //   46: arraylength
/*      */     //   47: iconst_2
/*      */     //   48: isub
/*      */     //   49: istore #11
/*      */     //   51: iconst_0
/*      */     //   52: istore #12
/*      */     //   54: iload #12
/*      */     //   56: iload #11
/*      */     //   58: if_icmpgt -> 243
/*      */     //   61: aload #10
/*      */     //   63: iload #12
/*      */     //   65: laload
/*      */     //   66: lstore #13
/*      */     //   68: lload #13
/*      */     //   70: lstore #15
/*      */     //   72: iconst_0
/*      */     //   73: istore #17
/*      */     //   75: lload #15
/*      */     //   77: lload #15
/*      */     //   79: ldc2_w -1
/*      */     //   82: lxor
/*      */     //   83: bipush #7
/*      */     //   85: lshl
/*      */     //   86: land
/*      */     //   87: ldc2_w -9187201950435737472
/*      */     //   90: land
/*      */     //   91: ldc2_w -9187201950435737472
/*      */     //   94: lcmp
/*      */     //   95: ifeq -> 230
/*      */     //   98: bipush #8
/*      */     //   100: iload #12
/*      */     //   102: iload #11
/*      */     //   104: isub
/*      */     //   105: iconst_m1
/*      */     //   106: ixor
/*      */     //   107: bipush #31
/*      */     //   109: iushr
/*      */     //   110: isub
/*      */     //   111: istore #18
/*      */     //   113: iconst_0
/*      */     //   114: istore #19
/*      */     //   116: iload #19
/*      */     //   118: iload #18
/*      */     //   120: if_icmpge -> 223
/*      */     //   123: lload #13
/*      */     //   125: ldc2_w 255
/*      */     //   128: land
/*      */     //   129: lstore #20
/*      */     //   131: iconst_0
/*      */     //   132: istore #22
/*      */     //   134: lload #20
/*      */     //   136: ldc2_w 128
/*      */     //   139: lcmp
/*      */     //   140: ifge -> 147
/*      */     //   143: iconst_1
/*      */     //   144: goto -> 148
/*      */     //   147: iconst_0
/*      */     //   148: ifeq -> 210
/*      */     //   151: iload #12
/*      */     //   153: iconst_3
/*      */     //   154: ishl
/*      */     //   155: iload #19
/*      */     //   157: iadd
/*      */     //   158: istore #17
/*      */     //   160: iload #17
/*      */     //   162: istore #23
/*      */     //   164: iconst_0
/*      */     //   165: istore #24
/*      */     //   167: aload #6
/*      */     //   169: iload #23
/*      */     //   171: aaload
/*      */     //   172: aload #7
/*      */     //   174: iload #23
/*      */     //   176: aaload
/*      */     //   177: astore #25
/*      */     //   179: astore #26
/*      */     //   181: iconst_0
/*      */     //   182: istore #27
/*      */     //   184: aload #25
/*      */     //   186: checkcast androidx/compose/animation/SharedElement
/*      */     //   189: astore #28
/*      */     //   191: iconst_0
/*      */     //   192: istore #29
/*      */     //   194: aload #28
/*      */     //   196: invokevirtual isAnimating : ()Z
/*      */     //   199: ifeq -> 206
/*      */     //   202: iconst_1
/*      */     //   203: goto -> 246
/*      */     //   206: nop
/*      */     //   207: nop
/*      */     //   208: nop
/*      */     //   209: nop
/*      */     //   210: lload #13
/*      */     //   212: bipush #8
/*      */     //   214: lshr
/*      */     //   215: lstore #13
/*      */     //   217: iinc #19, 1
/*      */     //   220: goto -> 116
/*      */     //   223: iload #18
/*      */     //   225: bipush #8
/*      */     //   227: if_icmpne -> 244
/*      */     //   230: iload #12
/*      */     //   232: iload #11
/*      */     //   234: if_icmpeq -> 243
/*      */     //   237: iinc #12, 1
/*      */     //   240: goto -> 61
/*      */     //   243: nop
/*      */     //   244: nop
/*      */     //   245: iconst_0
/*      */     //   246: istore_1
/*      */     //   247: iload_1
/*      */     //   248: aload_0
/*      */     //   249: invokevirtual isTransitionActive : ()Z
/*      */     //   252: if_icmpeq -> 485
/*      */     //   255: aload_0
/*      */     //   256: iload_1
/*      */     //   257: invokespecial setTransitionActive : (Z)V
/*      */     //   260: iload_1
/*      */     //   261: ifne -> 485
/*      */     //   264: aload_0
/*      */     //   265: getfield sharedElements : Landroidx/collection/MutableScatterMap;
/*      */     //   268: checkcast androidx/collection/ScatterMap
/*      */     //   271: astore_2
/*      */     //   272: iconst_0
/*      */     //   273: istore_3
/*      */     //   274: aload_2
/*      */     //   275: getfield keys : [Ljava/lang/Object;
/*      */     //   278: astore #4
/*      */     //   280: aload_2
/*      */     //   281: getfield values : [Ljava/lang/Object;
/*      */     //   284: astore #5
/*      */     //   286: aload_2
/*      */     //   287: astore #6
/*      */     //   289: iconst_0
/*      */     //   290: istore #7
/*      */     //   292: aload #6
/*      */     //   294: getfield metadata : [J
/*      */     //   297: astore #8
/*      */     //   299: aload #8
/*      */     //   301: arraylength
/*      */     //   302: iconst_2
/*      */     //   303: isub
/*      */     //   304: istore #9
/*      */     //   306: iconst_0
/*      */     //   307: istore #10
/*      */     //   309: iload #10
/*      */     //   311: iload #9
/*      */     //   313: if_icmpgt -> 483
/*      */     //   316: aload #8
/*      */     //   318: iload #10
/*      */     //   320: laload
/*      */     //   321: lstore #11
/*      */     //   323: lload #11
/*      */     //   325: lstore #13
/*      */     //   327: iconst_0
/*      */     //   328: istore #15
/*      */     //   330: lload #13
/*      */     //   332: lload #13
/*      */     //   334: ldc2_w -1
/*      */     //   337: lxor
/*      */     //   338: bipush #7
/*      */     //   340: lshl
/*      */     //   341: land
/*      */     //   342: ldc2_w -9187201950435737472
/*      */     //   345: land
/*      */     //   346: ldc2_w -9187201950435737472
/*      */     //   349: lcmp
/*      */     //   350: ifeq -> 470
/*      */     //   353: bipush #8
/*      */     //   355: iload #10
/*      */     //   357: iload #9
/*      */     //   359: isub
/*      */     //   360: iconst_m1
/*      */     //   361: ixor
/*      */     //   362: bipush #31
/*      */     //   364: iushr
/*      */     //   365: isub
/*      */     //   366: istore #16
/*      */     //   368: iconst_0
/*      */     //   369: istore #17
/*      */     //   371: iload #17
/*      */     //   373: iload #16
/*      */     //   375: if_icmpge -> 463
/*      */     //   378: lload #11
/*      */     //   380: ldc2_w 255
/*      */     //   383: land
/*      */     //   384: lstore #18
/*      */     //   386: iconst_0
/*      */     //   387: istore #20
/*      */     //   389: lload #18
/*      */     //   391: ldc2_w 128
/*      */     //   394: lcmp
/*      */     //   395: ifge -> 402
/*      */     //   398: iconst_1
/*      */     //   399: goto -> 403
/*      */     //   402: iconst_0
/*      */     //   403: ifeq -> 450
/*      */     //   406: iload #10
/*      */     //   408: iconst_3
/*      */     //   409: ishl
/*      */     //   410: iload #17
/*      */     //   412: iadd
/*      */     //   413: istore #15
/*      */     //   415: iload #15
/*      */     //   417: istore #21
/*      */     //   419: iconst_0
/*      */     //   420: istore #22
/*      */     //   422: aload #4
/*      */     //   424: iload #21
/*      */     //   426: aaload
/*      */     //   427: aload #5
/*      */     //   429: iload #21
/*      */     //   431: aaload
/*      */     //   432: checkcast androidx/compose/animation/SharedElement
/*      */     //   435: astore #23
/*      */     //   437: pop
/*      */     //   438: iconst_0
/*      */     //   439: istore #25
/*      */     //   441: aload #23
/*      */     //   443: invokevirtual onSharedTransitionFinished : ()V
/*      */     //   446: nop
/*      */     //   447: nop
/*      */     //   448: nop
/*      */     //   449: nop
/*      */     //   450: lload #11
/*      */     //   452: bipush #8
/*      */     //   454: lshr
/*      */     //   455: lstore #11
/*      */     //   457: iinc #17, 1
/*      */     //   460: goto -> 371
/*      */     //   463: iload #16
/*      */     //   465: bipush #8
/*      */     //   467: if_icmpne -> 484
/*      */     //   470: iload #10
/*      */     //   472: iload #9
/*      */     //   474: if_icmpeq -> 483
/*      */     //   477: iinc #10, 1
/*      */     //   480: goto -> 316
/*      */     //   483: nop
/*      */     //   484: nop
/*      */     //   485: aload_0
/*      */     //   486: getfield sharedElements : Landroidx/collection/MutableScatterMap;
/*      */     //   489: checkcast androidx/collection/ScatterMap
/*      */     //   492: astore_2
/*      */     //   493: iconst_0
/*      */     //   494: istore_3
/*      */     //   495: aload_2
/*      */     //   496: getfield keys : [Ljava/lang/Object;
/*      */     //   499: astore #4
/*      */     //   501: aload_2
/*      */     //   502: getfield values : [Ljava/lang/Object;
/*      */     //   505: astore #5
/*      */     //   507: aload_2
/*      */     //   508: astore #6
/*      */     //   510: iconst_0
/*      */     //   511: istore #7
/*      */     //   513: aload #6
/*      */     //   515: getfield metadata : [J
/*      */     //   518: astore #8
/*      */     //   520: aload #8
/*      */     //   522: arraylength
/*      */     //   523: iconst_2
/*      */     //   524: isub
/*      */     //   525: istore #9
/*      */     //   527: iconst_0
/*      */     //   528: istore #10
/*      */     //   530: iload #10
/*      */     //   532: iload #9
/*      */     //   534: if_icmpgt -> 704
/*      */     //   537: aload #8
/*      */     //   539: iload #10
/*      */     //   541: laload
/*      */     //   542: lstore #11
/*      */     //   544: lload #11
/*      */     //   546: lstore #13
/*      */     //   548: iconst_0
/*      */     //   549: istore #15
/*      */     //   551: lload #13
/*      */     //   553: lload #13
/*      */     //   555: ldc2_w -1
/*      */     //   558: lxor
/*      */     //   559: bipush #7
/*      */     //   561: lshl
/*      */     //   562: land
/*      */     //   563: ldc2_w -9187201950435737472
/*      */     //   566: land
/*      */     //   567: ldc2_w -9187201950435737472
/*      */     //   570: lcmp
/*      */     //   571: ifeq -> 691
/*      */     //   574: bipush #8
/*      */     //   576: iload #10
/*      */     //   578: iload #9
/*      */     //   580: isub
/*      */     //   581: iconst_m1
/*      */     //   582: ixor
/*      */     //   583: bipush #31
/*      */     //   585: iushr
/*      */     //   586: isub
/*      */     //   587: istore #16
/*      */     //   589: iconst_0
/*      */     //   590: istore #17
/*      */     //   592: iload #17
/*      */     //   594: iload #16
/*      */     //   596: if_icmpge -> 684
/*      */     //   599: lload #11
/*      */     //   601: ldc2_w 255
/*      */     //   604: land
/*      */     //   605: lstore #18
/*      */     //   607: iconst_0
/*      */     //   608: istore #20
/*      */     //   610: lload #18
/*      */     //   612: ldc2_w 128
/*      */     //   615: lcmp
/*      */     //   616: ifge -> 623
/*      */     //   619: iconst_1
/*      */     //   620: goto -> 624
/*      */     //   623: iconst_0
/*      */     //   624: ifeq -> 671
/*      */     //   627: iload #10
/*      */     //   629: iconst_3
/*      */     //   630: ishl
/*      */     //   631: iload #17
/*      */     //   633: iadd
/*      */     //   634: istore #15
/*      */     //   636: iload #15
/*      */     //   638: istore #21
/*      */     //   640: iconst_0
/*      */     //   641: istore #22
/*      */     //   643: aload #4
/*      */     //   645: iload #21
/*      */     //   647: aaload
/*      */     //   648: aload #5
/*      */     //   650: iload #21
/*      */     //   652: aaload
/*      */     //   653: checkcast androidx/compose/animation/SharedElement
/*      */     //   656: astore #23
/*      */     //   658: pop
/*      */     //   659: iconst_0
/*      */     //   660: istore #25
/*      */     //   662: aload #23
/*      */     //   664: invokevirtual updateMatch : ()V
/*      */     //   667: nop
/*      */     //   668: nop
/*      */     //   669: nop
/*      */     //   670: nop
/*      */     //   671: lload #11
/*      */     //   673: bipush #8
/*      */     //   675: lshr
/*      */     //   676: lstore #11
/*      */     //   678: iinc #17, 1
/*      */     //   681: goto -> 592
/*      */     //   684: iload #16
/*      */     //   686: bipush #8
/*      */     //   688: if_icmpne -> 705
/*      */     //   691: iload #10
/*      */     //   693: iload #9
/*      */     //   695: if_icmpeq -> 704
/*      */     //   698: iinc #10, 1
/*      */     //   701: goto -> 537
/*      */     //   704: nop
/*      */     //   705: nop
/*      */     //   706: invokestatic getSharedTransitionObserver : ()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;
/*      */     //   709: aload_0
/*      */     //   710: aload_0
/*      */     //   711: getfield updateTransitionActiveness : Lkotlin/jvm/functions/Function1;
/*      */     //   714: aload_0
/*      */     //   715: getfield observeAnimatingBlock : Lkotlin/jvm/functions/Function0;
/*      */     //   718: invokevirtual observeReads : (Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
/*      */     //   721: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #929	-> 0
/*      */     //   #1347	-> 10
/*      */     //   #1348	-> 16
/*      */     //   #1349	-> 23
/*      */     //   #1351	-> 30
/*      */     //   #1352	-> 37
/*      */     //   #1353	-> 44
/*      */     //   #1355	-> 51
/*      */     //   #1356	-> 61
/*      */     //   #1357	-> 68
/*      */     //   #1358	-> 75
/*      */     //   #1357	-> 91
/*      */     //   #1359	-> 98
/*      */     //   #1360	-> 113
/*      */     //   #1361	-> 123
/*      */     //   #1362	-> 134
/*      */     //   #1361	-> 148
/*      */     //   #1363	-> 151
/*      */     //   #1364	-> 160
/*      */     //   #1365	-> 167
/*      */     //   #1366	-> 184
/*      */     //   #930	-> 194
/*      */     //   #1366	-> 199
/*      */     //   #1367	-> 206
/*      */     //   #1365	-> 207
/*      */     //   #1368	-> 208
/*      */     //   #1364	-> 209
/*      */     //   #1369	-> 210
/*      */     //   #1360	-> 217
/*      */     //   #1371	-> 223
/*      */     //   #1355	-> 230
/*      */     //   #1374	-> 243
/*      */     //   #1375	-> 244
/*      */     //   #1376	-> 245
/*      */     //   #929	-> 246
/*      */     //   #932	-> 247
/*      */     //   #933	-> 255
/*      */     //   #934	-> 260
/*      */     //   #935	-> 264
/*      */     //   #1377	-> 274
/*      */     //   #1378	-> 280
/*      */     //   #1380	-> 286
/*      */     //   #1381	-> 292
/*      */     //   #1382	-> 299
/*      */     //   #1384	-> 306
/*      */     //   #1385	-> 316
/*      */     //   #1386	-> 323
/*      */     //   #1387	-> 330
/*      */     //   #1386	-> 346
/*      */     //   #1388	-> 353
/*      */     //   #1389	-> 368
/*      */     //   #1390	-> 378
/*      */     //   #1391	-> 389
/*      */     //   #1390	-> 403
/*      */     //   #1392	-> 406
/*      */     //   #1393	-> 415
/*      */     //   #1394	-> 422
/*      */     //   #936	-> 441
/*      */     //   #937	-> 446
/*      */     //   #1394	-> 447
/*      */     //   #1395	-> 448
/*      */     //   #1393	-> 449
/*      */     //   #1396	-> 450
/*      */     //   #1389	-> 457
/*      */     //   #1398	-> 463
/*      */     //   #1384	-> 470
/*      */     //   #1401	-> 483
/*      */     //   #1402	-> 484
/*      */     //   #940	-> 485
/*      */     //   #1403	-> 495
/*      */     //   #1404	-> 501
/*      */     //   #1406	-> 507
/*      */     //   #1407	-> 513
/*      */     //   #1408	-> 520
/*      */     //   #1410	-> 527
/*      */     //   #1411	-> 537
/*      */     //   #1412	-> 544
/*      */     //   #1413	-> 551
/*      */     //   #1412	-> 567
/*      */     //   #1414	-> 574
/*      */     //   #1415	-> 589
/*      */     //   #1416	-> 599
/*      */     //   #1417	-> 610
/*      */     //   #1416	-> 624
/*      */     //   #1418	-> 627
/*      */     //   #1419	-> 636
/*      */     //   #1420	-> 643
/*      */     //   #941	-> 662
/*      */     //   #942	-> 667
/*      */     //   #1420	-> 668
/*      */     //   #1421	-> 669
/*      */     //   #1419	-> 670
/*      */     //   #1422	-> 671
/*      */     //   #1415	-> 678
/*      */     //   #1424	-> 684
/*      */     //   #1410	-> 691
/*      */     //   #1427	-> 704
/*      */     //   #1428	-> 705
/*      */     //   #943	-> 706
/*      */     //   #944	-> 709
/*      */     //   #945	-> 710
/*      */     //   #946	-> 714
/*      */     //   #943	-> 718
/*      */     //   #948	-> 721
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   194	5	29	$i$a$-any-SharedTransitionScopeImpl$updateTransitionActiveness$isActive$1	I
/*      */     //   191	8	28	element	Landroidx/compose/animation/SharedElement;
/*      */     //   184	23	27	$i$a$-forEach-ScatterMap$any$1$iv	I
/*      */     //   181	26	26	key$iv	Ljava/lang/Object;
/*      */     //   181	26	25	value$iv	Ljava/lang/Object;
/*      */     //   167	42	24	$i$a$-forEachIndexed-ScatterMap$forEach$1$iv$iv	I
/*      */     //   164	45	23	index$iv$iv	I
/*      */     //   75	16	17	$i$f$maskEmptyOrDeleted	I
/*      */     //   72	19	15	$this$maskEmptyOrDeleted$iv$iv$iv$iv	J
/*      */     //   134	14	22	$i$f$isFull	I
/*      */     //   131	17	20	value$iv$iv$iv$iv	J
/*      */     //   160	50	17	index$iv$iv$iv	I
/*      */     //   116	107	19	j$iv$iv$iv	I
/*      */     //   113	117	18	bitCount$iv$iv$iv	I
/*      */     //   68	162	13	slot$iv$iv$iv	J
/*      */     //   54	189	12	i$iv$iv$iv	I
/*      */     //   37	207	9	$i$f$forEachIndexed	I
/*      */     //   44	200	10	m$iv$iv$iv	[J
/*      */     //   51	193	11	lastIndex$iv$iv$iv	I
/*      */     //   34	210	8	this_$iv$iv$iv	Landroidx/collection/ScatterMap;
/*      */     //   16	229	5	$i$f$forEach	I
/*      */     //   23	222	6	k$iv$iv	[Ljava/lang/Object;
/*      */     //   30	215	7	v$iv$iv	[Ljava/lang/Object;
/*      */     //   13	232	4	this_$iv$iv	Landroidx/collection/ScatterMap;
/*      */     //   10	236	3	$i$f$any	I
/*      */     //   8	238	2	this_$iv	Landroidx/collection/ScatterMap;
/*      */     //   441	6	25	$i$a$-forEach-SharedTransitionScopeImpl$updateTransitionActiveness$2	I
/*      */     //   438	9	23	element	Landroidx/compose/animation/SharedElement;
/*      */     //   422	27	22	$i$a$-forEachIndexed-ScatterMap$forEach$1$iv	I
/*      */     //   419	30	21	index$iv	I
/*      */     //   330	16	15	$i$f$maskEmptyOrDeleted	I
/*      */     //   327	19	13	$this$maskEmptyOrDeleted$iv$iv$iv	J
/*      */     //   389	14	20	$i$f$isFull	I
/*      */     //   386	17	18	value$iv$iv$iv	J
/*      */     //   415	35	15	index$iv$iv	I
/*      */     //   371	92	17	j$iv$iv	I
/*      */     //   368	102	16	bitCount$iv$iv	I
/*      */     //   323	147	11	slot$iv$iv	J
/*      */     //   309	174	10	i$iv$iv	I
/*      */     //   292	192	7	$i$f$forEachIndexed	I
/*      */     //   299	185	8	m$iv$iv	[J
/*      */     //   306	178	9	lastIndex$iv$iv	I
/*      */     //   289	195	6	this_$iv$iv	Landroidx/collection/ScatterMap;
/*      */     //   274	211	3	$i$f$forEach	I
/*      */     //   280	205	4	k$iv	[Ljava/lang/Object;
/*      */     //   286	199	5	v$iv	[Ljava/lang/Object;
/*      */     //   272	213	2	this_$iv	Landroidx/collection/ScatterMap;
/*      */     //   662	6	25	$i$a$-forEach-SharedTransitionScopeImpl$updateTransitionActiveness$3	I
/*      */     //   659	9	23	element	Landroidx/compose/animation/SharedElement;
/*      */     //   643	27	22	$i$a$-forEachIndexed-ScatterMap$forEach$1$iv	I
/*      */     //   640	30	21	index$iv	I
/*      */     //   551	16	15	$i$f$maskEmptyOrDeleted	I
/*      */     //   548	19	13	$this$maskEmptyOrDeleted$iv$iv$iv	J
/*      */     //   610	14	20	$i$f$isFull	I
/*      */     //   607	17	18	value$iv$iv$iv	J
/*      */     //   636	35	15	index$iv$iv	I
/*      */     //   592	92	17	j$iv$iv	I
/*      */     //   589	102	16	bitCount$iv$iv	I
/*      */     //   544	147	11	slot$iv$iv	J
/*      */     //   530	174	10	i$iv$iv	I
/*      */     //   513	192	7	$i$f$forEachIndexed	I
/*      */     //   520	185	8	m$iv$iv	[J
/*      */     //   527	178	9	lastIndex$iv$iv	I
/*      */     //   510	195	6	this_$iv$iv	Landroidx/collection/ScatterMap;
/*      */     //   495	211	3	$i$f$forEach	I
/*      */     //   501	205	4	k$iv	[Ljava/lang/Object;
/*      */     //   507	199	5	v$iv	[Ljava/lang/Object;
/*      */     //   493	213	2	this_$iv	Landroidx/collection/ScatterMap;
/*      */     //   247	475	1	isActive	Z
/*      */     //   0	722	0	this	Landroidx/compose/animation/SharedTransitionScopeImpl;
/*      */   }
/*      */   
/*      */   private final <T> Modifier sharedBoundsImpl(Modifier $this$sharedBoundsImpl, SharedTransitionScope.SharedContentState sharedContentState, Transition<T> parentTransition, Function1<? super T, Boolean> visible, BoundsTransform boundsTransform, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean renderOnlyWhenVisible, boolean renderInOverlayDuringTransition, float zIndexInOverlay, SharedTransitionScope.OverlayClip clipInOverlayDuringTransition) {
/*      */     return ComposedModifierKt.composed$default($this$sharedBoundsImpl, null, new SharedTransitionScopeImpl$sharedBoundsImpl$1(parentTransition, visible, this, placeHolderSize, renderOnlyWhenVisible, clipInOverlayDuringTransition, zIndexInOverlay, renderInOverlayDuringTransition, boundsTransform), 1, null);
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\003\020\000\032\0020\001\"\004\b\000\020\002*\0020\001H\013¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "T", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"})
/*      */   @SourceDebugExtension({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl$sharedBoundsImpl$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1337:1\n1225#2,6:1338\n1225#2,6:1346\n1225#2,6:1355\n1225#2,6:1362\n1814#3,2:1344\n1816#3,3:1352\n1#4:1361\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeImpl$sharedBoundsImpl$1\n*L\n971#1:1338,6\n975#1:1346,6\n980#1:1355,6\n998#1:1362,6\n975#1:1344,2\n975#1:1352,3\n*E\n"})
/*      */   static final class SharedTransitionScopeImpl$sharedBoundsImpl$1
/*      */     extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
/*      */     @Composable
/*      */     @NotNull
/*      */     public final Modifier invoke(@NotNull Modifier $this$composed, @Nullable Composer $composer, int $changed) {
/*      */       // Byte code:
/*      */       //   0: aload_1
/*      */       //   1: ldc '$this$composed'
/*      */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */       //   6: aload_2
/*      */       //   7: ldc -1843478929
/*      */       //   9: invokeinterface startReplaceGroup : (I)V
/*      */       //   14: aload_2
/*      */       //   15: ldc 'C:SharedTransitionScope.kt#xbi5r1'
/*      */       //   17: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*      */       //   20: invokestatic isTraceInProgress : ()Z
/*      */       //   23: ifeq -> 35
/*      */       //   26: ldc -1843478929
/*      */       //   28: iload_3
/*      */       //   29: iconst_m1
/*      */       //   30: ldc 'androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous> (SharedTransitionScope.kt:968)'
/*      */       //   32: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */       //   35: aload_0
/*      */       //   36: getfield $sharedContentState : Landroidx/compose/animation/SharedTransitionScope$SharedContentState;
/*      */       //   39: invokevirtual getKey : ()Ljava/lang/Object;
/*      */       //   42: astore #4
/*      */       //   44: aload_2
/*      */       //   45: ldc -359675295
/*      */       //   47: aload #4
/*      */       //   49: invokeinterface startMovableGroup : (ILjava/lang/Object;)V
/*      */       //   54: aload_2
/*      */       //   55: ldc '970@51556L35,1006@53390L522'
/*      */       //   57: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*      */       //   60: aload_2
/*      */       //   61: ldc -359676293
/*      */       //   63: ldc 'CC(remember):SharedTransitionScope.kt#9igjgp'
/*      */       //   65: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */       //   68: aload_2
/*      */       //   69: astore #8
/*      */       //   71: iconst_0
/*      */       //   72: istore #9
/*      */       //   74: aload_0
/*      */       //   75: getfield this$0 : Landroidx/compose/animation/SharedTransitionScopeImpl;
/*      */       //   78: astore #10
/*      */       //   80: iconst_0
/*      */       //   81: istore #11
/*      */       //   83: aload #8
/*      */       //   85: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */       //   90: astore #12
/*      */       //   92: iconst_0
/*      */       //   93: istore #13
/*      */       //   95: aload #12
/*      */       //   97: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */       //   100: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */       //   103: if_acmpne -> 132
/*      */       //   106: iconst_0
/*      */       //   107: istore #14
/*      */       //   109: aload #10
/*      */       //   111: aload #4
/*      */       //   113: invokestatic access$sharedElementsFor : (Landroidx/compose/animation/SharedTransitionScopeImpl;Ljava/lang/Object;)Landroidx/compose/animation/SharedElement;
/*      */       //   116: astore #15
/*      */       //   118: aload #8
/*      */       //   120: aload #15
/*      */       //   122: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */       //   127: aload #15
/*      */       //   129: goto -> 134
/*      */       //   132: aload #12
/*      */       //   134: nop
/*      */       //   135: nop
/*      */       //   136: nop
/*      */       //   137: checkcast androidx/compose/animation/SharedElement
/*      */       //   140: astore #7
/*      */       //   142: aload_2
/*      */       //   143: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */       //   146: aload #7
/*      */       //   148: astore #6
/*      */       //   150: aload_2
/*      */       //   151: ldc -359672306
/*      */       //   153: aload_0
/*      */       //   154: getfield $parentTransition : Landroidx/compose/animation/core/Transition;
/*      */       //   157: invokeinterface startMovableGroup : (ILjava/lang/Object;)V
/*      */       //   162: aload_2
/*      */       //   163: ldc '*997@53029L278'
/*      */       //   165: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*      */       //   168: aload_0
/*      */       //   169: getfield $parentTransition : Landroidx/compose/animation/core/Transition;
/*      */       //   172: ifnull -> 586
/*      */       //   175: aload_2
/*      */       //   176: ldc 1735101820
/*      */       //   178: invokeinterface startReplaceGroup : (I)V
/*      */       //   183: aload_2
/*      */       //   184: ldc '974@51759L53'
/*      */       //   186: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*      */       //   189: aload_0
/*      */       //   190: getfield $parentTransition : Landroidx/compose/animation/core/Transition;
/*      */       //   193: astore #10
/*      */       //   195: aload #4
/*      */       //   197: invokevirtual toString : ()Ljava/lang/String;
/*      */       //   200: astore #11
/*      */       //   202: aload_0
/*      */       //   203: getfield $visible : Lkotlin/jvm/functions/Function1;
/*      */       //   206: astore #12
/*      */       //   208: iconst_0
/*      */       //   209: istore #13
/*      */       //   211: iconst_0
/*      */       //   212: istore #14
/*      */       //   214: aload_2
/*      */       //   215: ldc 1215497572
/*      */       //   217: ldc 'CC(createChildTransition)1814@74186L36,1815@74246L74,1816@74343L39,1817@74394L63:Transition.kt#pdpnli'
/*      */       //   219: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */       //   222: aload_2
/*      */       //   223: ldc 272028789
/*      */       //   225: ldc 'CC(remember):Transition.kt#9igjgp'
/*      */       //   227: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */       //   230: aload_2
/*      */       //   231: astore #15
/*      */       //   233: iload #13
/*      */       //   235: bipush #14
/*      */       //   237: iand
/*      */       //   238: bipush #6
/*      */       //   240: ixor
/*      */       //   241: iconst_4
/*      */       //   242: if_icmple -> 256
/*      */       //   245: aload_2
/*      */       //   246: aload #10
/*      */       //   248: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */       //   253: ifne -> 265
/*      */       //   256: iload #13
/*      */       //   258: bipush #6
/*      */       //   260: iand
/*      */       //   261: iconst_4
/*      */       //   262: if_icmpne -> 269
/*      */       //   265: iconst_1
/*      */       //   266: goto -> 270
/*      */       //   269: iconst_0
/*      */       //   270: istore #16
/*      */       //   272: iconst_0
/*      */       //   273: istore #17
/*      */       //   275: aload #15
/*      */       //   277: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */       //   282: astore #18
/*      */       //   284: iconst_0
/*      */       //   285: istore #19
/*      */       //   287: iload #16
/*      */       //   289: ifne -> 303
/*      */       //   292: aload #18
/*      */       //   294: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */       //   297: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */       //   300: if_acmpne -> 327
/*      */       //   303: iconst_0
/*      */       //   304: istore #20
/*      */       //   306: aload #10
/*      */       //   308: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*      */       //   311: astore #21
/*      */       //   313: aload #15
/*      */       //   315: aload #21
/*      */       //   317: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */       //   322: aload #21
/*      */       //   324: goto -> 329
/*      */       //   327: aload #18
/*      */       //   329: nop
/*      */       //   330: nop
/*      */       //   331: nop
/*      */       //   332: astore #22
/*      */       //   334: aload_2
/*      */       //   335: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */       //   338: aload #22
/*      */       //   340: astore #23
/*      */       //   342: aload #10
/*      */       //   344: invokevirtual isSeeking : ()Z
/*      */       //   347: ifeq -> 358
/*      */       //   350: aload #10
/*      */       //   352: invokevirtual getCurrentState : ()Ljava/lang/Object;
/*      */       //   355: goto -> 360
/*      */       //   358: aload #23
/*      */       //   360: aload_2
/*      */       //   361: bipush #112
/*      */       //   363: iload #13
/*      */       //   365: iconst_3
/*      */       //   366: ishr
/*      */       //   367: iand
/*      */       //   368: istore #24
/*      */       //   370: astore #25
/*      */       //   372: astore #26
/*      */       //   374: iconst_0
/*      */       //   375: istore #27
/*      */       //   377: aload_2
/*      */       //   378: ldc 1329676753
/*      */       //   380: invokeinterface startReplaceGroup : (I)V
/*      */       //   385: aload_2
/*      */       //   386: ldc 'C:SharedTransitionScope.kt#xbi5r1'
/*      */       //   388: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*      */       //   391: invokestatic isTraceInProgress : ()Z
/*      */       //   394: ifeq -> 407
/*      */       //   397: ldc 1329676753
/*      */       //   399: iload #24
/*      */       //   401: iconst_m1
/*      */       //   402: ldc 'androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:974)'
/*      */       //   404: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */       //   407: aload #12
/*      */       //   409: aload #26
/*      */       //   411: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */       //   416: checkcast java/lang/Boolean
/*      */       //   419: invokevirtual booleanValue : ()Z
/*      */       //   422: istore #28
/*      */       //   424: invokestatic isTraceInProgress : ()Z
/*      */       //   427: ifeq -> 433
/*      */       //   430: invokestatic traceEventEnd : ()V
/*      */       //   433: aload_2
/*      */       //   434: invokeinterface endReplaceGroup : ()V
/*      */       //   439: iload #28
/*      */       //   441: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*      */       //   444: astore #22
/*      */       //   446: aload #10
/*      */       //   448: invokevirtual getTargetState : ()Ljava/lang/Object;
/*      */       //   451: aload_2
/*      */       //   452: bipush #112
/*      */       //   454: iload #13
/*      */       //   456: iconst_3
/*      */       //   457: ishr
/*      */       //   458: iand
/*      */       //   459: istore #24
/*      */       //   461: astore #25
/*      */       //   463: astore #26
/*      */       //   465: iconst_0
/*      */       //   466: istore #27
/*      */       //   468: aload_2
/*      */       //   469: ldc 1329676753
/*      */       //   471: invokeinterface startReplaceGroup : (I)V
/*      */       //   476: aload_2
/*      */       //   477: ldc 'C:SharedTransitionScope.kt#xbi5r1'
/*      */       //   479: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*      */       //   482: invokestatic isTraceInProgress : ()Z
/*      */       //   485: ifeq -> 498
/*      */       //   488: ldc 1329676753
/*      */       //   490: iload #24
/*      */       //   492: iconst_m1
/*      */       //   493: ldc 'androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:974)'
/*      */       //   495: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */       //   498: aload #12
/*      */       //   500: aload #26
/*      */       //   502: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */       //   507: checkcast java/lang/Boolean
/*      */       //   510: invokevirtual booleanValue : ()Z
/*      */       //   513: istore #28
/*      */       //   515: invokestatic isTraceInProgress : ()Z
/*      */       //   518: ifeq -> 524
/*      */       //   521: invokestatic traceEventEnd : ()V
/*      */       //   524: aload_2
/*      */       //   525: invokeinterface endReplaceGroup : ()V
/*      */       //   530: iload #28
/*      */       //   532: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*      */       //   535: astore #15
/*      */       //   537: aload #10
/*      */       //   539: aload #22
/*      */       //   541: aload #15
/*      */       //   543: aload #11
/*      */       //   545: aload_2
/*      */       //   546: bipush #14
/*      */       //   548: iload #13
/*      */       //   550: iand
/*      */       //   551: sipush #7168
/*      */       //   554: iload #13
/*      */       //   556: bipush #6
/*      */       //   558: ishl
/*      */       //   559: iand
/*      */       //   560: ior
/*      */       //   561: invokestatic createChildTransitionInternal : (Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/Transition;
/*      */       //   564: astore #16
/*      */       //   566: aload_2
/*      */       //   567: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */       //   570: aload #16
/*      */       //   572: nop
/*      */       //   573: astore #9
/*      */       //   575: aload_2
/*      */       //   576: invokeinterface endReplaceGroup : ()V
/*      */       //   581: aload #9
/*      */       //   583: goto -> 788
/*      */       //   586: aload_2
/*      */       //   587: ldc 1735245009
/*      */       //   589: invokeinterface startReplaceGroup : (I)V
/*      */       //   594: aload_2
/*      */       //   595: ldc '*979@52034L707,992@52800L35'
/*      */       //   597: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*      */       //   600: aload_0
/*      */       //   601: getfield $visible : Lkotlin/jvm/functions/Function1;
/*      */       //   604: dup
/*      */       //   605: ldc 'null cannot be cast to non-null type kotlin.Function1<kotlin.Unit, kotlin.Boolean>'
/*      */       //   607: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */       //   610: iconst_1
/*      */       //   611: invokestatic beforeCheckcastToFunctionOfArity : (Ljava/lang/Object;I)Ljava/lang/Object;
/*      */       //   614: checkcast kotlin/jvm/functions/Function1
/*      */       //   617: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */       //   620: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */       //   625: checkcast java/lang/Boolean
/*      */       //   628: invokevirtual booleanValue : ()Z
/*      */       //   631: istore #10
/*      */       //   633: aload_2
/*      */       //   634: ldc -359660325
/*      */       //   636: ldc 'CC(remember):SharedTransitionScope.kt#9igjgp'
/*      */       //   638: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */       //   641: aload_2
/*      */       //   642: astore #13
/*      */       //   644: iconst_0
/*      */       //   645: istore #14
/*      */       //   647: iconst_0
/*      */       //   648: istore #15
/*      */       //   650: aload #13
/*      */       //   652: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */       //   657: astore #16
/*      */       //   659: iconst_0
/*      */       //   660: istore #17
/*      */       //   662: aload #16
/*      */       //   664: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */       //   667: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */       //   670: if_acmpne -> 725
/*      */       //   673: iconst_0
/*      */       //   674: istore #18
/*      */       //   676: new androidx/compose/animation/core/MutableTransitionState
/*      */       //   679: dup
/*      */       //   680: aload #6
/*      */       //   682: invokevirtual getCurrentBounds : ()Landroidx/compose/ui/geometry/Rect;
/*      */       //   685: ifnull -> 701
/*      */       //   688: iload #10
/*      */       //   690: ifne -> 697
/*      */       //   693: iconst_1
/*      */       //   694: goto -> 703
/*      */       //   697: iconst_0
/*      */       //   698: goto -> 703
/*      */       //   701: iload #10
/*      */       //   703: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*      */       //   706: invokespecial <init> : (Ljava/lang/Object;)V
/*      */       //   709: astore #19
/*      */       //   711: aload #13
/*      */       //   713: aload #19
/*      */       //   715: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */       //   720: aload #19
/*      */       //   722: goto -> 727
/*      */       //   725: aload #16
/*      */       //   727: nop
/*      */       //   728: nop
/*      */       //   729: nop
/*      */       //   730: checkcast androidx/compose/animation/core/MutableTransitionState
/*      */       //   733: astore #12
/*      */       //   735: aload_2
/*      */       //   736: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */       //   739: aload #12
/*      */       //   741: astore #12
/*      */       //   743: aload #12
/*      */       //   745: astore #13
/*      */       //   747: iconst_0
/*      */       //   748: istore #14
/*      */       //   750: aload #13
/*      */       //   752: iload #10
/*      */       //   754: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*      */       //   757: invokevirtual setTargetState : (Ljava/lang/Object;)V
/*      */       //   760: aload #12
/*      */       //   762: astore #11
/*      */       //   764: aload #11
/*      */       //   766: checkcast androidx/compose/animation/core/TransitionState
/*      */       //   769: aconst_null
/*      */       //   770: aload_2
/*      */       //   771: getstatic androidx/compose/animation/core/MutableTransitionState.$stable : I
/*      */       //   774: iconst_2
/*      */       //   775: invokestatic rememberTransition : (Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;
/*      */       //   778: astore #9
/*      */       //   780: aload_2
/*      */       //   781: invokeinterface endReplaceGroup : ()V
/*      */       //   786: aload #9
/*      */       //   788: astore #8
/*      */       //   790: aload_2
/*      */       //   791: ldc -359633642
/*      */       //   793: aload_0
/*      */       //   794: getfield this$0 : Landroidx/compose/animation/SharedTransitionScopeImpl;
/*      */       //   797: invokevirtual isTransitionActive : ()Z
/*      */       //   800: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*      */       //   803: invokeinterface startMovableGroup : (ILjava/lang/Object;)V
/*      */       //   808: aload_2
/*      */       //   809: ldc '995@52949L45'
/*      */       //   811: invokestatic sourceInformation : (Landroidx/compose/runtime/Composer;Ljava/lang/String;)V
/*      */       //   814: aload #8
/*      */       //   816: getstatic androidx/compose/ui/geometry/Rect.Companion : Landroidx/compose/ui/geometry/Rect$Companion;
/*      */       //   819: invokestatic getVectorConverter : (Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/animation/core/TwoWayConverter;
/*      */       //   822: aconst_null
/*      */       //   823: aload_2
/*      */       //   824: iconst_0
/*      */       //   825: iconst_2
/*      */       //   826: invokestatic createDeferredAnimation : (Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition$DeferredAnimation;
/*      */       //   829: astore #10
/*      */       //   831: aload_2
/*      */       //   832: invokeinterface endMovableGroup : ()V
/*      */       //   837: aload #10
/*      */       //   839: astore #9
/*      */       //   841: aload_2
/*      */       //   842: ldc_w -359628914
/*      */       //   845: ldc 'CC(remember):SharedTransitionScope.kt#9igjgp'
/*      */       //   847: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */       //   850: aload_2
/*      */       //   851: astore #12
/*      */       //   853: aload_2
/*      */       //   854: aload #8
/*      */       //   856: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */       //   861: istore #13
/*      */       //   863: aload_0
/*      */       //   864: getfield this$0 : Landroidx/compose/animation/SharedTransitionScopeImpl;
/*      */       //   867: astore #14
/*      */       //   869: aload_0
/*      */       //   870: getfield $boundsTransform : Landroidx/compose/animation/BoundsTransform;
/*      */       //   873: astore #15
/*      */       //   875: iconst_0
/*      */       //   876: istore #16
/*      */       //   878: aload #12
/*      */       //   880: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */       //   885: astore #17
/*      */       //   887: iconst_0
/*      */       //   888: istore #18
/*      */       //   890: iload #13
/*      */       //   892: ifne -> 906
/*      */       //   895: aload #17
/*      */       //   897: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */       //   900: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */       //   903: if_acmpne -> 943
/*      */       //   906: iconst_0
/*      */       //   907: istore #19
/*      */       //   909: new androidx/compose/animation/BoundsAnimation
/*      */       //   912: dup
/*      */       //   913: aload #14
/*      */       //   915: checkcast androidx/compose/animation/SharedTransitionScope
/*      */       //   918: aload #8
/*      */       //   920: aload #9
/*      */       //   922: aload #15
/*      */       //   924: invokespecial <init> : (Landroidx/compose/animation/SharedTransitionScope;Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/BoundsTransform;)V
/*      */       //   927: astore #20
/*      */       //   929: aload #12
/*      */       //   931: aload #20
/*      */       //   933: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */       //   938: aload #20
/*      */       //   940: goto -> 945
/*      */       //   943: aload #17
/*      */       //   945: nop
/*      */       //   946: nop
/*      */       //   947: nop
/*      */       //   948: checkcast androidx/compose/animation/BoundsAnimation
/*      */       //   951: astore #11
/*      */       //   953: aload_2
/*      */       //   954: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */       //   957: aload #11
/*      */       //   959: astore #11
/*      */       //   961: aload_0
/*      */       //   962: getfield $boundsTransform : Landroidx/compose/animation/BoundsTransform;
/*      */       //   965: astore #12
/*      */       //   967: aload #11
/*      */       //   969: astore #13
/*      */       //   971: iconst_0
/*      */       //   972: istore #14
/*      */       //   974: aload #13
/*      */       //   976: aload #9
/*      */       //   978: aload #12
/*      */       //   980: invokevirtual updateAnimation : (Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/BoundsTransform;)V
/*      */       //   983: aload #11
/*      */       //   985: astore #10
/*      */       //   987: aload_2
/*      */       //   988: invokeinterface endMovableGroup : ()V
/*      */       //   993: aload #10
/*      */       //   995: astore #7
/*      */       //   997: aload_0
/*      */       //   998: getfield this$0 : Landroidx/compose/animation/SharedTransitionScopeImpl;
/*      */       //   1001: aload #6
/*      */       //   1003: aload #7
/*      */       //   1005: aload_0
/*      */       //   1006: getfield $placeHolderSize : Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;
/*      */       //   1009: aload_0
/*      */       //   1010: getfield $renderOnlyWhenVisible : Z
/*      */       //   1013: aload_0
/*      */       //   1014: getfield $sharedContentState : Landroidx/compose/animation/SharedTransitionScope$SharedContentState;
/*      */       //   1017: aload_0
/*      */       //   1018: getfield $clipInOverlayDuringTransition : Landroidx/compose/animation/SharedTransitionScope$OverlayClip;
/*      */       //   1021: aload_0
/*      */       //   1022: getfield $zIndexInOverlay : F
/*      */       //   1025: aload_0
/*      */       //   1026: getfield $renderInOverlayDuringTransition : Z
/*      */       //   1029: aload_2
/*      */       //   1030: iconst_0
/*      */       //   1031: invokestatic access$rememberSharedElementState : (Landroidx/compose/animation/SharedTransitionScopeImpl;Landroidx/compose/animation/SharedElement;Landroidx/compose/animation/BoundsAnimation;Landroidx/compose/animation/SharedTransitionScope$PlaceHolderSize;ZLandroidx/compose/animation/SharedTransitionScope$SharedContentState;Landroidx/compose/animation/SharedTransitionScope$OverlayClip;FZLandroidx/compose/runtime/Composer;I)Landroidx/compose/animation/SharedElementInternalState;
/*      */       //   1034: astore #8
/*      */       //   1036: aload_2
/*      */       //   1037: invokeinterface endMovableGroup : ()V
/*      */       //   1042: aload #8
/*      */       //   1044: astore #5
/*      */       //   1046: aload_1
/*      */       //   1047: new androidx/compose/animation/SharedBoundsNodeElement
/*      */       //   1050: dup
/*      */       //   1051: aload #5
/*      */       //   1053: invokespecial <init> : (Landroidx/compose/animation/SharedElementInternalState;)V
/*      */       //   1056: checkcast androidx/compose/ui/Modifier
/*      */       //   1059: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*      */       //   1064: astore #6
/*      */       //   1066: invokestatic isTraceInProgress : ()Z
/*      */       //   1069: ifeq -> 1075
/*      */       //   1072: invokestatic traceEventEnd : ()V
/*      */       //   1075: aload_2
/*      */       //   1076: invokeinterface endReplaceGroup : ()V
/*      */       //   1081: aload #6
/*      */       //   1083: areturn
/*      */       // Line number table:
/*      */       //   Java source line number -> byte code offset
/*      */       //   #969	-> 32
/*      */       //   #970	-> 47
/*      */       //   #971	-> 65
/*      */       //   #1338	-> 83
/*      */       //   #1339	-> 95
/*      */       //   #1340	-> 106
/*      */       //   #971	-> 109
/*      */       //   #1340	-> 116
/*      */       //   #1341	-> 118
/*      */       //   #1342	-> 127
/*      */       //   #1343	-> 132
/*      */       //   #1339	-> 134
/*      */       //   #1338	-> 135
/*      */       //   #1338	-> 136
/*      */       //   #971	-> 137
/*      */       //   #973	-> 153
/*      */       //   #974	-> 168
/*      */       //   #975	-> 189
/*      */       //   #1344	-> 219
/*      */       //   #1345	-> 227
/*      */       //   #1346	-> 275
/*      */       //   #1347	-> 287
/*      */       //   #1348	-> 303
/*      */       //   #1345	-> 306
/*      */       //   #1348	-> 311
/*      */       //   #1349	-> 313
/*      */       //   #1350	-> 322
/*      */       //   #1351	-> 327
/*      */       //   #1347	-> 329
/*      */       //   #1346	-> 330
/*      */       //   #1346	-> 331
/*      */       //   #1345	-> 332
/*      */       //   #1352	-> 342
/*      */       //   #975	-> 404
/*      */       //   #1352	-> 444
/*      */       //   #1353	-> 446
/*      */       //   #975	-> 495
/*      */       //   #1353	-> 535
/*      */       //   #1354	-> 537
/*      */       //   #1344	-> 567
/*      */       //   #1354	-> 572
/*      */       //   #974	-> 573
/*      */       //   #976	-> 589
/*      */       //   #979	-> 600
/*      */       //   #978	-> 631
/*      */       //   #980	-> 638
/*      */       //   #1355	-> 650
/*      */       //   #1356	-> 662
/*      */       //   #1357	-> 673
/*      */       //   #981	-> 676
/*      */       //   #982	-> 680
/*      */       //   #987	-> 688
/*      */       //   #989	-> 701
/*      */       //   #981	-> 706
/*      */       //   #1357	-> 709
/*      */       //   #1358	-> 711
/*      */       //   #1359	-> 720
/*      */       //   #1360	-> 725
/*      */       //   #1356	-> 727
/*      */       //   #1355	-> 728
/*      */       //   #1355	-> 729
/*      */       //   #980	-> 730
/*      */       //   #992	-> 743
/*      */       //   #1361	-> 747
/*      */       //   #992	-> 750
/*      */       //   #992	-> 760
/*      */       //   #992	-> 762
/*      */       //   #980	-> 762
/*      */       //   #993	-> 764
/*      */       //   #976	-> 778
/*      */       //   #974	-> 788
/*      */       //   #995	-> 793
/*      */       //   #996	-> 814
/*      */       //   #995	-> 839
/*      */       //   #998	-> 847
/*      */       //   #1362	-> 878
/*      */       //   #1363	-> 890
/*      */       //   #1364	-> 906
/*      */       //   #999	-> 909
/*      */       //   #1000	-> 913
/*      */       //   #1001	-> 918
/*      */       //   #1002	-> 920
/*      */       //   #1003	-> 922
/*      */       //   #999	-> 924
/*      */       //   #1364	-> 927
/*      */       //   #1365	-> 929
/*      */       //   #1366	-> 938
/*      */       //   #1367	-> 943
/*      */       //   #1363	-> 945
/*      */       //   #1362	-> 946
/*      */       //   #1362	-> 947
/*      */       //   #998	-> 948
/*      */       //   #1005	-> 961
/*      */       //   #1361	-> 971
/*      */       //   #1005	-> 974
/*      */       //   #1005	-> 983
/*      */       //   #1005	-> 985
/*      */       //   #973	-> 995
/*      */       //   #1007	-> 997
/*      */       //   #1008	-> 1001
/*      */       //   #1009	-> 1003
/*      */       //   #1010	-> 1005
/*      */       //   #1011	-> 1009
/*      */       //   #1012	-> 1013
/*      */       //   #1013	-> 1017
/*      */       //   #1014	-> 1021
/*      */       //   #1015	-> 1025
/*      */       //   #1007	-> 1031
/*      */       //   #970	-> 1044
/*      */       //   #1019	-> 1046
/*      */       // Local variable table:
/*      */       //   start	length	slot	name	descriptor
/*      */       //   109	7	14	$i$a$-cache-SharedTransitionScopeImpl$sharedBoundsImpl$1$sharedElementState$sharedElement$1	I
/*      */       //   118	11	15	value$iv	Ljava/lang/Object;
/*      */       //   95	40	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */       //   92	43	12	it$iv	Ljava/lang/Object;
/*      */       //   83	54	11	$i$f$cache	I
/*      */       //   80	57	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */       //   80	57	9	invalid$iv	Z
/*      */       //   377	64	27	$i$a$-createChildTransition-SharedTransitionScopeImpl$sharedBoundsImpl$1$sharedElementState$boundsAnimation$boundsTransition$1	I
/*      */       //   374	67	26	it	Ljava/lang/Object;
/*      */       //   374	67	25	$composer	Landroidx/compose/runtime/Composer;
/*      */       //   374	67	24	$changed	I
/*      */       //   468	64	27	$i$a$-createChildTransition-SharedTransitionScopeImpl$sharedBoundsImpl$1$sharedElementState$boundsAnimation$boundsTransition$1	I
/*      */       //   465	67	26	it	Ljava/lang/Object;
/*      */       //   465	67	25	$composer	Landroidx/compose/runtime/Composer;
/*      */       //   465	67	24	$changed	I
/*      */       //   306	5	20	$i$a$-cache-TransitionKt$createChildTransition$initialParentState$1$iv	I
/*      */       //   313	11	21	value$iv$iv	Ljava/lang/Object;
/*      */       //   287	43	19	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*      */       //   284	46	18	it$iv$iv	Ljava/lang/Object;
/*      */       //   275	57	17	$i$f$cache	I
/*      */       //   272	60	15	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*      */       //   272	60	16	invalid$iv$iv	Z
/*      */       //   214	359	14	$i$f$createChildTransition	I
/*      */       //   342	231	23	initialParentState$iv	Ljava/lang/Object;
/*      */       //   446	127	22	initialState$iv	Ljava/lang/Object;
/*      */       //   537	36	15	targetState$iv	Ljava/lang/Object;
/*      */       //   211	362	10	$this$createChildTransition$iv	Landroidx/compose/animation/core/Transition;
/*      */       //   211	362	11	label$iv	Ljava/lang/String;
/*      */       //   211	362	13	$changed$iv	I
/*      */       //   676	33	18	$i$a$-cache-SharedTransitionScopeImpl$sharedBoundsImpl$1$sharedElementState$boundsAnimation$boundsTransition$transitionState$1	I
/*      */       //   711	11	19	value$iv	Ljava/lang/Object;
/*      */       //   662	66	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */       //   659	69	16	it$iv	Ljava/lang/Object;
/*      */       //   650	80	15	$i$f$cache	I
/*      */       //   647	83	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */       //   647	83	14	invalid$iv	Z
/*      */       //   750	10	14	$i$a$-also-SharedTransitionScopeImpl$sharedBoundsImpl$1$sharedElementState$boundsAnimation$boundsTransition$transitionState$2	I
/*      */       //   747	13	13	it	Landroidx/compose/animation/core/MutableTransitionState;
/*      */       //   633	145	10	targetState	Z
/*      */       //   764	14	11	transitionState	Landroidx/compose/animation/core/MutableTransitionState;
/*      */       //   909	18	19	$i$a$-cache-SharedTransitionScopeImpl$sharedBoundsImpl$1$sharedElementState$boundsAnimation$1	I
/*      */       //   929	11	20	value$iv	Ljava/lang/Object;
/*      */       //   890	56	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */       //   887	59	17	it$iv	Ljava/lang/Object;
/*      */       //   878	70	16	$i$f$cache	I
/*      */       //   875	73	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */       //   875	73	13	invalid$iv	Z
/*      */       //   974	9	14	$i$a$-also-SharedTransitionScopeImpl$sharedBoundsImpl$1$sharedElementState$boundsAnimation$2	I
/*      */       //   971	12	13	it	Landroidx/compose/animation/BoundsAnimation;
/*      */       //   790	205	8	boundsTransition	Landroidx/compose/animation/core/Transition;
/*      */       //   841	154	9	animation	Landroidx/compose/animation/core/Transition$DeferredAnimation;
/*      */       //   150	894	6	sharedElement	Landroidx/compose/animation/SharedElement;
/*      */       //   997	47	7	boundsAnimation	Landroidx/compose/animation/BoundsAnimation;
/*      */       //   44	1040	4	key	Ljava/lang/Object;
/*      */       //   1046	38	5	sharedElementState	Landroidx/compose/animation/SharedElementInternalState;
/*      */       //   0	1084	0	this	Landroidx/compose/animation/SharedTransitionScopeImpl$sharedBoundsImpl$1;
/*      */       //   0	1084	1	$this$composed	Landroidx/compose/ui/Modifier;
/*      */       //   0	1084	2	$composer	Landroidx/compose/runtime/Composer;
/*      */       //   0	1084	3	$changed	I
/*      */     }
/*      */     
/*      */     SharedTransitionScopeImpl$sharedBoundsImpl$1(Transition<T> $parentTransition, Function1<T, Boolean> $visible, SharedTransitionScopeImpl $receiver, SharedTransitionScope.PlaceHolderSize $placeHolderSize, boolean $renderOnlyWhenVisible, SharedTransitionScope.OverlayClip $clipInOverlayDuringTransition, float $zIndexInOverlay, boolean $renderInOverlayDuringTransition, BoundsTransform $boundsTransform) {
/*      */       super(3);
/*      */     }
/*      */   }
/*      */   
/*      */   @Composable
/*      */   private final SharedElementInternalState rememberSharedElementState(SharedElement sharedElement, BoundsAnimation boundsAnimation, SharedTransitionScope.PlaceHolderSize placeHolderSize, boolean renderOnlyWhenVisible, SharedTransitionScope.SharedContentState sharedContentState, SharedTransitionScope.OverlayClip clipInOverlayDuringTransition, float zIndexInOverlay, boolean renderInOverlayDuringTransition, Composer $composer, int $changed) {
/*      */     ComposerKt.sourceInformationMarkerStart($composer, 2066772852, "C(rememberSharedElementState)P(6!1,2,4,5!1,7)*1032@54440L467:SharedTransitionScope.kt#xbi5r1");
/*      */     if (ComposerKt.isTraceInProgress())
/*      */       ComposerKt.traceEventStart(2066772852, $changed, -1, "androidx.compose.animation.SharedTransitionScopeImpl.rememberSharedElementState (SharedTransitionScope.kt:1032)"); 
/*      */     ComposerKt.sourceInformationMarkerStart($composer, -663265575, "CC(remember):SharedTransitionScope.kt#9igjgp");
/*      */     Composer composer = $composer;
/*      */     boolean invalid$iv = false;
/*      */     int $i$f$cache = 0;
/* 1429 */     Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 1430 */     if (it$iv == Composer.Companion.getEmpty()) {
/* 1431 */       int $i$a$-cache-SharedTransitionScopeImpl$rememberSharedElementState$1 = 0;
/*      */     }
/*      */     
/* 1434 */     SharedElementInternalState sharedElementInternalState2 = (SharedElementInternalState)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); sharedElementInternalState2 = sharedElementInternalState2; SharedElementInternalState it = sharedElementInternalState2; int $i$a$-also-SharedTransitionScopeImpl$rememberSharedElementState$2 = 0; sharedContentState.setInternalState$animation(it); it.setSharedElement(sharedElement); it.setRenderOnlyWhenVisible(renderOnlyWhenVisible); it.setBoundsAnimation(boundsAnimation); it.setPlaceHolderSize(placeHolderSize); it.setOverlayClip(clipInOverlayDuringTransition); it.setZIndex(zIndexInOverlay); it.setRenderInOverlayDuringTransition(renderInOverlayDuringTransition); it.setUserState(sharedContentState); SharedElementInternalState sharedElementInternalState1 = sharedElementInternalState2; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer); return sharedElementInternalState1;
/* 1435 */   } @NotNull public final LayoutCoordinates getRoot$animation() { if (this.root != null) return this.root;  Intrinsics.throwUninitializedPropertyAccessException("root"); return null; } public final void setRoot$animation(@NotNull LayoutCoordinates <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.root = <set-?>; } @NotNull public final LayoutCoordinates getLookaheadRoot$animation() { if (this.nullableLookaheadRoot == null) { int $i$a$-requireNotNull-SharedTransitionScopeImpl$lookaheadRoot$1 = 0; String str = "Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead."; throw new IllegalArgumentException(str.toString()); }  return this.nullableLookaheadRoot; } @Nullable public final LayoutCoordinates getNullableLookaheadRoot$animation() { return this.nullableLookaheadRoot; } public final void setNullableLookaheadRoot$animation(@Nullable LayoutCoordinates <set-?>) { this.nullableLookaheadRoot = <set-?>; } private final SharedElement sharedElementsFor(Object key) { if ((SharedElement)this.sharedElements.get(key) == null) { (SharedElement)this.sharedElements.get(key); SharedElement sharedElement1 = new SharedElement(key, this), it = sharedElement1; int $i$a$-also-SharedTransitionScopeImpl$sharedElementsFor$1 = 0; this.sharedElements.set(key, it); }  return sharedElement1; } public final void drawInOverlay$animation(@NotNull ContentDrawScope scope) { Intrinsics.checkNotNullParameter(scope, "scope"); List $this$sortBy$iv = (List)this.renderers; int $i$f$sortBy = 0; if ($this$sortBy$iv.size() > 1) CollectionsKt.sortWith($this$sortBy$iv, new SharedTransitionScopeImpl$drawInOverlay$$inlined$sortBy$1()); 
/*      */     List $this$fastForEach$iv = (List)this.renderers;
/*      */     int $i$f$fastForEach = 0;
/* 1438 */     int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 1439 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 1440 */       LayerRenderer it = (LayerRenderer)item$iv; int $i$a$-fastForEach-SharedTransitionScopeImpl$drawInOverlay$2 = 0;
/*      */       it.drawInOverlay((DrawScope)scope);
/*      */     }  }
/*      */ 
/*      */   
/*      */   public final void onStateRemoved$animation(@NotNull SharedElementInternalState sharedElementState) {
/*      */     Intrinsics.checkNotNullParameter(sharedElementState, "sharedElementState");
/*      */     SharedElement $this$onStateRemoved_u24lambda_u2410 = sharedElementState.getSharedElement();
/*      */     int $i$a$-with-SharedTransitionScopeImpl$onStateRemoved$1 = 0;
/*      */     $this$onStateRemoved_u24lambda_u2410.removeState(sharedElementState);
/*      */     this.updateTransitionActiveness.invoke(this);
/*      */     SharedTransitionScopeKt.getSharedTransitionObserver().observeReads($this$onStateRemoved_u24lambda_u2410.getScope(), this.updateTransitionActiveness, this.observeAnimatingBlock);
/*      */     this.renderers.remove(sharedElementState);
/*      */     if ($this$onStateRemoved_u24lambda_u2410.getStates().isEmpty())
/*      */       BuildersKt.launch$default(($this$onStateRemoved_u24lambda_u2410.getScope()).coroutineScope, null, null, new SharedTransitionScopeImpl$onStateRemoved$1$1($this$onStateRemoved_u24lambda_u2410, null), 3, null); 
/*      */   }
/*      */   
/*      */   @DebugMetadata(f = "SharedTransitionScope.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "androidx.compose.animation.SharedTransitionScopeImpl$onStateRemoved$1$1")
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*      */   static final class SharedTransitionScopeImpl$onStateRemoved$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*      */     int label;
/*      */     
/*      */     SharedTransitionScopeImpl$onStateRemoved$1$1(SharedElement $receiver, Continuation $completion) {
/*      */       super(2, $completion);
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public final Object invokeSuspend(@NotNull Object $result) {
/*      */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*      */       switch (this.label) {
/*      */         case 0:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           if (this.$this_with.getStates().isEmpty())
/*      */             (this.$this_with.getScope()).sharedElements.remove(this.$this_with.getKey()); 
/*      */           return Unit.INSTANCE;
/*      */       } 
/*      */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super SharedTransitionScopeImpl$onStateRemoved$1$1> $completion) {
/*      */       return (Continuation<Unit>)new SharedTransitionScopeImpl$onStateRemoved$1$1(this.$this_with, $completion);
/*      */     }
/*      */     
/*      */     @Nullable
/*      */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*      */       return ((SharedTransitionScopeImpl$onStateRemoved$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */     }
/*      */   }
/*      */   
/*      */   public final void onStateAdded$animation(@NotNull SharedElementInternalState sharedElementState) {
/*      */     // Byte code:
/*      */     //   0: aload_1
/*      */     //   1: ldc_w 'sharedElementState'
/*      */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   7: aload_1
/*      */     //   8: invokevirtual getSharedElement : ()Landroidx/compose/animation/SharedElement;
/*      */     //   11: astore_2
/*      */     //   12: iconst_0
/*      */     //   13: istore_3
/*      */     //   14: aload_2
/*      */     //   15: aload_1
/*      */     //   16: invokevirtual addState : (Landroidx/compose/animation/SharedElementInternalState;)V
/*      */     //   19: aload_0
/*      */     //   20: getfield updateTransitionActiveness : Lkotlin/jvm/functions/Function1;
/*      */     //   23: aload_0
/*      */     //   24: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   29: pop
/*      */     //   30: invokestatic getSharedTransitionObserver : ()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;
/*      */     //   33: aload_2
/*      */     //   34: invokevirtual getScope : ()Landroidx/compose/animation/SharedTransitionScopeImpl;
/*      */     //   37: aload_0
/*      */     //   38: getfield updateTransitionActiveness : Lkotlin/jvm/functions/Function1;
/*      */     //   41: aload_0
/*      */     //   42: getfield observeAnimatingBlock : Lkotlin/jvm/functions/Function0;
/*      */     //   45: invokevirtual observeReads : (Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
/*      */     //   48: aload_0
/*      */     //   49: getfield renderers : Landroidx/compose/runtime/snapshots/SnapshotStateList;
/*      */     //   52: checkcast java/util/List
/*      */     //   55: astore #4
/*      */     //   57: iconst_0
/*      */     //   58: istore #5
/*      */     //   60: iconst_0
/*      */     //   61: istore #6
/*      */     //   63: aload #4
/*      */     //   65: invokeinterface iterator : ()Ljava/util/Iterator;
/*      */     //   70: astore #7
/*      */     //   72: aload #7
/*      */     //   74: invokeinterface hasNext : ()Z
/*      */     //   79: ifeq -> 152
/*      */     //   82: aload #7
/*      */     //   84: invokeinterface next : ()Ljava/lang/Object;
/*      */     //   89: astore #8
/*      */     //   91: aload #8
/*      */     //   93: checkcast androidx/compose/animation/LayerRenderer
/*      */     //   96: astore #9
/*      */     //   98: iconst_0
/*      */     //   99: istore #10
/*      */     //   101: aload #9
/*      */     //   103: instanceof androidx/compose/animation/SharedElementInternalState
/*      */     //   106: ifeq -> 117
/*      */     //   109: aload #9
/*      */     //   111: checkcast androidx/compose/animation/SharedElementInternalState
/*      */     //   114: goto -> 118
/*      */     //   117: aconst_null
/*      */     //   118: dup
/*      */     //   119: ifnull -> 128
/*      */     //   122: invokevirtual getSharedElement : ()Landroidx/compose/animation/SharedElement;
/*      */     //   125: goto -> 130
/*      */     //   128: pop
/*      */     //   129: aconst_null
/*      */     //   130: aload_1
/*      */     //   131: invokevirtual getSharedElement : ()Landroidx/compose/animation/SharedElement;
/*      */     //   134: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   137: nop
/*      */     //   138: ifeq -> 146
/*      */     //   141: iload #6
/*      */     //   143: goto -> 153
/*      */     //   146: iinc #6, 1
/*      */     //   149: goto -> 72
/*      */     //   152: iconst_m1
/*      */     //   153: istore #11
/*      */     //   155: iload #11
/*      */     //   157: aload_0
/*      */     //   158: getfield renderers : Landroidx/compose/runtime/snapshots/SnapshotStateList;
/*      */     //   161: invokevirtual size : ()I
/*      */     //   164: iconst_1
/*      */     //   165: isub
/*      */     //   166: if_icmpeq -> 175
/*      */     //   169: iload #11
/*      */     //   171: iconst_m1
/*      */     //   172: if_icmpne -> 187
/*      */     //   175: aload_0
/*      */     //   176: getfield renderers : Landroidx/compose/runtime/snapshots/SnapshotStateList;
/*      */     //   179: aload_1
/*      */     //   180: invokevirtual add : (Ljava/lang/Object;)Z
/*      */     //   183: pop
/*      */     //   184: goto -> 199
/*      */     //   187: aload_0
/*      */     //   188: getfield renderers : Landroidx/compose/runtime/snapshots/SnapshotStateList;
/*      */     //   191: iload #11
/*      */     //   193: iconst_1
/*      */     //   194: iadd
/*      */     //   195: aload_1
/*      */     //   196: invokevirtual add : (ILjava/lang/Object;)V
/*      */     //   199: nop
/*      */     //   200: nop
/*      */     //   201: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1111	-> 7
/*      */     //   #1112	-> 14
/*      */     //   #1113	-> 19
/*      */     //   #1114	-> 30
/*      */     //   #1115	-> 33
/*      */     //   #1116	-> 37
/*      */     //   #1117	-> 41
/*      */     //   #1114	-> 45
/*      */     //   #1119	-> 48
/*      */     //   #1443	-> 60
/*      */     //   #1444	-> 63
/*      */     //   #1445	-> 91
/*      */     //   #1120	-> 101
/*      */     //   #1121	-> 130
/*      */     //   #1120	-> 137
/*      */     //   #1445	-> 138
/*      */     //   #1446	-> 141
/*      */     //   #1447	-> 146
/*      */     //   #1449	-> 152
/*      */     //   #1119	-> 153
/*      */     //   #1123	-> 155
/*      */     //   #1124	-> 175
/*      */     //   #1126	-> 187
/*      */     //   #1123	-> 199
/*      */     //   #1111	-> 200
/*      */     //   #1129	-> 201
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   101	37	10	$i$a$-indexOfFirst-SharedTransitionScopeImpl$onStateAdded$1$id$1	I
/*      */     //   98	40	9	it	Landroidx/compose/animation/LayerRenderer;
/*      */     //   91	58	8	item$iv	Ljava/lang/Object;
/*      */     //   60	93	5	$i$f$indexOfFirst	I
/*      */     //   63	90	6	index$iv	I
/*      */     //   57	96	4	$this$indexOfFirst$iv	Ljava/util/List;
/*      */     //   14	186	3	$i$a$-with-SharedTransitionScopeImpl$onStateAdded$1	I
/*      */     //   155	45	11	id	I
/*      */     //   12	188	2	$this$onStateAdded_u24lambda_u2412	Landroidx/compose/animation/SharedElement;
/*      */     //   0	202	0	this	Landroidx/compose/animation/SharedTransitionScopeImpl;
/*      */     //   0	202	1	sharedElementState	Landroidx/compose/animation/SharedElementInternalState;
/*      */   }
/*      */   
/*      */   public final void onLayerRendererCreated$animation(@NotNull LayerRenderer renderer) {
/*      */     Intrinsics.checkNotNullParameter(renderer, "renderer");
/*      */     this.renderers.add(renderer);
/*      */   }
/*      */   
/*      */   public final void onLayerRendererRemoved$animation(@NotNull LayerRenderer renderer) {
/*      */     Intrinsics.checkNotNullParameter(renderer, "renderer");
/*      */     this.renderers.remove(renderer);
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public LayoutCoordinates getLookaheadScopeCoordinates(@NotNull Placeable.PlacementScope $this$lookaheadScopeCoordinates) {
/*      */     Intrinsics.checkNotNullParameter($this$lookaheadScopeCoordinates, "<this>");
/*      */     return this.$$delegate_0.getLookaheadScopeCoordinates($this$lookaheadScopeCoordinates);
/*      */   }
/*      */   
/*      */   public long localLookaheadPositionOf-au-aQtc(@NotNull LayoutCoordinates $this$localLookaheadPositionOf_u2dau_u2daQtc, @NotNull LayoutCoordinates sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
/*      */     Intrinsics.checkNotNullParameter($this$localLookaheadPositionOf_u2dau_u2daQtc, "$this$localLookaheadPositionOf");
/*      */     Intrinsics.checkNotNullParameter(sourceCoordinates, "sourceCoordinates");
/*      */     return this.$$delegate_0.localLookaheadPositionOf-au-aQtc($this$localLookaheadPositionOf_u2dau_u2daQtc, sourceCoordinates, relativeToSource, includeMotionFrameOfReference);
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public LayoutCoordinates toLookaheadCoordinates(@NotNull LayoutCoordinates $this$toLookaheadCoordinates) {
/*      */     Intrinsics.checkNotNullParameter($this$toLookaheadCoordinates, "<this>");
/*      */     return this.$$delegate_0.toLookaheadCoordinates($this$toLookaheadCoordinates);
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J(\020\t\032\0020\b2\006\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\021H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006R\016\020\007\032\0020\bX\004¢\006\002\n\000¨\006\022"}, d2 = {"Landroidx/compose/animation/SharedTransitionScopeImpl$ShapeBasedClip;", "Landroidx/compose/animation/SharedTransitionScope$OverlayClip;", "clipShape", "Landroidx/compose/ui/graphics/Shape;", "(Landroidx/compose/ui/graphics/Shape;)V", "getClipShape", "()Landroidx/compose/ui/graphics/Shape;", "path", "Landroidx/compose/ui/graphics/Path;", "getClipPath", "state", "Landroidx/compose/animation/SharedTransitionScope$SharedContentState;", "bounds", "Landroidx/compose/ui/geometry/Rect;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "animation"})
/*      */   private static final class ShapeBasedClip implements SharedTransitionScope.OverlayClip {
/*      */     @NotNull
/*      */     private final Shape clipShape;
/*      */     @NotNull
/*      */     private final Path path;
/*      */     
/*      */     public ShapeBasedClip(@NotNull Shape clipShape) {
/*      */       this.clipShape = clipShape;
/*      */       this.path = SkiaBackedPath_skikoKt.Path();
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public final Shape getClipShape() {
/*      */       return this.clipShape;
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public Path getClipPath(@NotNull SharedTransitionScope.SharedContentState state, @NotNull Rect bounds, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
/*      */       Intrinsics.checkNotNullParameter(state, "state");
/*      */       Intrinsics.checkNotNullParameter(bounds, "bounds");
/*      */       Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
/*      */       Intrinsics.checkNotNullParameter(density, "density");
/*      */       this.path.reset();
/*      */       OutlineKt.addOutline(this.path, this.clipShape.createOutline-Pq9zytI(bounds.getSize-NH-jbRc(), layoutDirection, density));
/*      */       this.path.translate-k-4lQ0M(bounds.getTopLeft-F1C5BW0());
/*      */       return this.path;
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\SharedTransitionScopeImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */