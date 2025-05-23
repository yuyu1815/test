/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.animation.core.AnimationSpecKt;
/*     */ import androidx.compose.animation.core.EasingKt;
/*     */ import androidx.compose.animation.core.TweenSpec;
/*     */ import androidx.compose.foundation.gestures.ForEachGestureKt;
/*     */ import androidx.compose.foundation.gestures.ScrollableState;
/*     */ import androidx.compose.foundation.interaction.DragInteraction;
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.foundation.shape.CornerSize;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
/*     */ import androidx.compose.runtime.DisposableEffectResult;
/*     */ import androidx.compose.runtime.DisposableEffectScope;
/*     */ import androidx.compose.runtime.EffectsKt;
/*     */ import androidx.compose.runtime.IntState;
/*     */ import androidx.compose.runtime.MutableIntState;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.SnapshotStateKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.geometry.CornerRadiusKt;
/*     */ import androidx.compose.ui.geometry.Offset;
/*     */ import androidx.compose.ui.geometry.OffsetKt;
/*     */ import androidx.compose.ui.geometry.Size;
/*     */ import androidx.compose.ui.geometry.SizeKt;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.ColorKt;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawStyle;
/*     */ import androidx.compose.ui.graphics.drawscope.Stroke;
/*     */ import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
/*     */ import androidx.compose.ui.input.pointer.PointerEventKt;
/*     */ import androidx.compose.ui.input.pointer.PointerInputChange;
/*     */ import androidx.compose.ui.input.pointer.PointerInputScope;
/*     */ import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.coroutines.EmptyCoroutineContext;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.math.MathKt;
/*     */ import kotlin.ranges.IntRange;
/*     */ import kotlin.ranges.RangesKt;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlin.time.Duration;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.DelayKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.component.styling.ScrollbarStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.ScrollbarVisibility;
/*     */ import org.jetbrains.jewel.ui.component.styling.TrackClickBehavior;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000¦\001\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\020\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\t\n\002\b\n\032Q\020\000\032\0020\0012\006\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\007H\007¢\006\002\020\016\032Q\020\017\032\0020\0012\006\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\007H\007¢\006\002\020\016\032M\020\020\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\n2\006\020\021\032\0020\0072\006\020\013\032\0020\f2\006\020\r\032\0020\007H\003¢\006\002\020\022\0325\020\023\032\0020\0242\006\020\025\032\0020\0072\006\020\026\032\0020\0072\006\020\027\032\0020\0072\006\020\013\032\0020\f2\006\020\030\032\0020\007H\002¢\006\002\020\031\0325\020\032\032\0020\0242\006\020\025\032\0020\0072\006\020\027\032\0020\0072\006\020\033\032\0020\0072\006\020\013\032\0020\f2\006\020\034\032\0020\007H\002¢\006\002\020\031\0325\020\035\032\0020\0242\006\020\025\032\0020\0072\006\020\027\032\0020\0072\006\020\033\032\0020\0072\006\020\013\032\0020\f2\006\020\034\032\0020\007H\002¢\006\002\020\031\032\037\020\036\032\0020\0072\006\020\037\032\0020\0242\006\020 \032\0020\024H\002¢\006\004\b!\020\"\032o\020#\032\0020\0012\006\020\034\032\0020\0072\006\020$\032\0020%2\006\020&\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\n2\016\020'\032\n\022\006\022\004\030\0010)0(2\006\020*\032\0020+2\006\020,\032\0020\0242\006\020-\032\0020\0242\006\020.\032\0020\0072\006\020/\032\00200H\003¢\006\004\b1\0202\032C\0203\032\0020\005*\0020\0052\006\0204\032\0020\0242\006\0205\032\002062\006\0207\032\0020\0242\006\020.\032\0020\0072\006\020/\032\002002\006\0208\032\00209H\002¢\006\004\b:\020;\032\026\020<\032\b\022\004\022\0020\0240=2\006\020>\032\0020%H\002\032\036\020?\032\b\022\004\022\0020\0240=2\006\020\034\032\0020\0072\006\020>\032\0020%H\002\032,\020H\032\0020I2\006\020*\032\0020+2\022\020J\032\016\022\004\022\0020E\022\004\022\0020\0010K2\006\020L\032\0020EH\002\032,\020M\032\0020I2\006\020*\032\0020+2\022\020J\032\016\022\004\022\0020E\022\004\022\0020\0010K2\006\020L\032\0020EH\002\032,\020N\032\0020\005*\0020\0052\006\020\t\032\0020\n2\016\020O\032\n\022\006\022\004\030\0010)0(2\006\020*\032\0020+H\002\032,\020P\032\0020\005*\0020\0052\006\020Q\032\0020R2\006\020\021\032\0020\0072\006\020\006\032\0020\0072\006\020*\032\0020+H\002\032\"\020S\032\0020\001*\0020T2\006\020\021\032\0020\0072\006\020U\032\0020VH@¢\006\002\020W\"\030\020@\032\0020A*\0020+8BX\004¢\006\006\032\004\bB\020C\"\030\020D\032\0020E*\0020A8BX\004¢\006\006\032\004\bF\020G\"\016\020X\032\0020YXT¢\006\002\n\000\"\016\020Z\032\0020YXT¢\006\002\n\000¨\006[²\006\n\020\030\032\0020\007X\002²\006\n\020\027\032\0020\007X\002²\006\n\020\034\032\0020\007X\002²\006\n\020\\\032\00206X\002²\006\n\020]\032\0020EX\002²\006\n\020^\032\0020\024X\002²\006\n\020_\032\0020\024X\002²\006\n\020`\032\0020\024X\002²\006\n\020a\032\0020\nX\002²\006\022\020b\032\n\022\006\022\004\030\0010)0(X\002²\006\n\020c\032\0020+X\002"}, d2 = {"VerticalScrollbar", "", "scrollState", "Landroidx/compose/foundation/gestures/ScrollableState;", "modifier", "Landroidx/compose/ui/Modifier;", "reverseLayout", "", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "style", "Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;", "keepVisible", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;ZLandroidx/compose/runtime/Composer;II)V", "HorizontalScrollbar", "BaseScrollbar", "isVertical", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;ZLandroidx/compose/runtime/Composer;I)V", "getTrackColor", "Landroidx/compose/ui/graphics/Color;", "isOpaque", "isDragging", "isHovered", "isExpanded", "(ZZZLorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Z)J", "getThumbBackgroundColor", "isScrolling", "showScrollbar", "getThumbBorderColor", "areTheSameColor", "first", "second", "areTheSameColor--OWjLjI", "(JJ)Z", "Thumb", "visibilityStyle", "Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;", "canScroll", "dragInteraction", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "sliderAdapter", "Lorg/jetbrains/jewel/ui/component/SliderAdapter;", "thumbBackgroundColor", "thumbBorderColor", "hasVisibleBorder", "cornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "Thumb-KjnZka4", "(ZLorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Lorg/jetbrains/jewel/ui/component/SliderAdapter;JJZLandroidx/compose/foundation/shape/CornerSize;Landroidx/compose/runtime/Composer;II)V", "drawThumb", "backgroundColor", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "borderColor", "density", "Landroidx/compose/ui/unit/Density;", "drawThumb-tAjK0ZQ", "(Landroidx/compose/ui/Modifier;JFJZLandroidx/compose/foundation/shape/CornerSize;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/Modifier;", "trackColorTween", "Landroidx/compose/animation/core/TweenSpec;", "visibility", "thumbColorTween", "thumbPixelRange", "Lkotlin/ranges/IntRange;", "getThumbPixelRange", "(Lorg/jetbrains/jewel/ui/component/SliderAdapter;)Lkotlin/ranges/IntRange;", "size", "", "getSize", "(Lkotlin/ranges/IntRange;)I", "verticalMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "setContainerSize", "Lkotlin/Function1;", "thumbThickness", "horizontalMeasurePolicy", "scrollbarDrag", "draggedInteraction", "scrollOnPressTrack", "clickBehavior", "Lorg/jetbrains/jewel/ui/component/styling/TrackClickBehavior;", "detectScrollViaTrackGestures", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "scroller", "Lorg/jetbrains/jewel/ui/component/TrackPressScroller;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLorg/jetbrains/jewel/ui/component/TrackPressScroller;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DELAY_BEFORE_SECOND_SCROLL_ON_TRACK_PRESS", "", "DELAY_BETWEEN_SCROLLS_ON_TRACK_PRESS", "ui", "animatedThickness", "containerSize", "trackBackground", "background", "border", "currentInteractionSource", "currentDraggedInteraction", "currentSliderAdapter"})
/*     */ @SourceDebugExtension({"SMAP\nScrollbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollbar.kt\norg/jetbrains/jewel/ui/component/ScrollbarKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 ModifierExtensions.kt\norg/jetbrains/jewel/ui/util/ModifierExtensionsKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 12 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 14 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,722:1\n1225#2,6:723\n1225#2,6:729\n1225#2,6:735\n1225#2,6:741\n1225#2,6:747\n1225#2,6:753\n1225#2,6:759\n1225#2,6:766\n1225#2,3:777\n1228#2,3:783\n1225#2,6:787\n1225#2,6:796\n1225#2,6:802\n77#3:765\n77#3:793\n77#3:842\n481#4:772\n480#4,4:773\n484#4,2:780\n488#4:786\n480#5:782\n57#6:794\n57#6:795\n10#7:808\n10#7:809\n10#7:843\n10#7:844\n79#8,6:810\n86#8,4:825\n90#8,2:835\n94#8:840\n368#9,9:816\n377#9,3:837\n4034#10,6:829\n149#11:841\n63#12,5:845\n81#13:850\n107#13,2:851\n81#13:853\n81#13:854\n107#13,2:855\n81#13:857\n81#13:861\n81#13:862\n81#13:863\n78#14:858\n111#14,2:859\n*S KotlinDebug\n*F\n+ 1 Scrollbar.kt\norg/jetbrains/jewel/ui/component/ScrollbarKt\n*L\n88#1:723,6\n110#1:729,6\n137#1:735,6\n138#1:741,6\n149#1:747,6\n151#1:753,6\n159#1:759,6\n189#1:766,6\n192#1:777,3\n192#1:783,3\n194#1:787,6\n217#1:796,6\n221#1:802,6\n188#1:765\n206#1:793\n364#1:842\n192#1:772\n192#1:773,4\n192#1:780,2\n192#1:786\n192#1:782\n207#1:794\n211#1:795\n253#1:808\n262#1:809\n367#1:843\n368#1:844\n235#1:810,6\n235#1:825,4\n235#1:835,2\n235#1:840\n235#1:816,9\n235#1:837,3\n235#1:829,6\n363#1:841\n139#1:845,5\n149#1:850\n149#1:851,2\n150#1:853\n151#1:854\n151#1:855,2\n173#1:857\n229#1:861\n350#1:862\n357#1:863\n189#1:858\n189#1:859,2\n*E\n"})
/*     */ public final class ScrollbarKt
/*     */ {
/*     */   public static final long DELAY_BEFORE_SECOND_SCROLL_ON_TRACK_PRESS = 300L;
/*     */   public static final long DELAY_BETWEEN_SCROLLS_ON_TRACK_PRESS = 100L;
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void VerticalScrollbar(@NotNull ScrollableState scrollState, @Nullable Modifier modifier, boolean reverseLayout, boolean enabled, @Nullable MutableInteractionSource interactionSource, @Nullable ScrollbarStyle style, boolean keepVisible, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'scrollState'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #7
/*     */     //   8: ldc 1936699997
/*     */     //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   15: astore #7
/*     */     //   17: iload #8
/*     */     //   19: istore #10
/*     */     //   21: iload #9
/*     */     //   23: iconst_1
/*     */     //   24: iand
/*     */     //   25: ifeq -> 38
/*     */     //   28: iload #10
/*     */     //   30: bipush #6
/*     */     //   32: ior
/*     */     //   33: istore #10
/*     */     //   35: goto -> 67
/*     */     //   38: iload #8
/*     */     //   40: bipush #6
/*     */     //   42: iand
/*     */     //   43: ifne -> 67
/*     */     //   46: iload #10
/*     */     //   48: aload #7
/*     */     //   50: aload_0
/*     */     //   51: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   56: ifeq -> 63
/*     */     //   59: iconst_4
/*     */     //   60: goto -> 64
/*     */     //   63: iconst_2
/*     */     //   64: ior
/*     */     //   65: istore #10
/*     */     //   67: iload #9
/*     */     //   69: iconst_2
/*     */     //   70: iand
/*     */     //   71: ifeq -> 84
/*     */     //   74: iload #10
/*     */     //   76: bipush #48
/*     */     //   78: ior
/*     */     //   79: istore #10
/*     */     //   81: goto -> 115
/*     */     //   84: iload #8
/*     */     //   86: bipush #48
/*     */     //   88: iand
/*     */     //   89: ifne -> 115
/*     */     //   92: iload #10
/*     */     //   94: aload #7
/*     */     //   96: aload_1
/*     */     //   97: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   102: ifeq -> 110
/*     */     //   105: bipush #32
/*     */     //   107: goto -> 112
/*     */     //   110: bipush #16
/*     */     //   112: ior
/*     */     //   113: istore #10
/*     */     //   115: iload #9
/*     */     //   117: iconst_4
/*     */     //   118: iand
/*     */     //   119: ifeq -> 133
/*     */     //   122: iload #10
/*     */     //   124: sipush #384
/*     */     //   127: ior
/*     */     //   128: istore #10
/*     */     //   130: goto -> 167
/*     */     //   133: iload #8
/*     */     //   135: sipush #384
/*     */     //   138: iand
/*     */     //   139: ifne -> 167
/*     */     //   142: iload #10
/*     */     //   144: aload #7
/*     */     //   146: iload_2
/*     */     //   147: invokeinterface changed : (Z)Z
/*     */     //   152: ifeq -> 161
/*     */     //   155: sipush #256
/*     */     //   158: goto -> 164
/*     */     //   161: sipush #128
/*     */     //   164: ior
/*     */     //   165: istore #10
/*     */     //   167: iload #9
/*     */     //   169: bipush #8
/*     */     //   171: iand
/*     */     //   172: ifeq -> 186
/*     */     //   175: iload #10
/*     */     //   177: sipush #3072
/*     */     //   180: ior
/*     */     //   181: istore #10
/*     */     //   183: goto -> 220
/*     */     //   186: iload #8
/*     */     //   188: sipush #3072
/*     */     //   191: iand
/*     */     //   192: ifne -> 220
/*     */     //   195: iload #10
/*     */     //   197: aload #7
/*     */     //   199: iload_3
/*     */     //   200: invokeinterface changed : (Z)Z
/*     */     //   205: ifeq -> 214
/*     */     //   208: sipush #2048
/*     */     //   211: goto -> 217
/*     */     //   214: sipush #1024
/*     */     //   217: ior
/*     */     //   218: istore #10
/*     */     //   220: iload #9
/*     */     //   222: bipush #16
/*     */     //   224: iand
/*     */     //   225: ifeq -> 239
/*     */     //   228: iload #10
/*     */     //   230: sipush #24576
/*     */     //   233: ior
/*     */     //   234: istore #10
/*     */     //   236: goto -> 274
/*     */     //   239: iload #8
/*     */     //   241: sipush #24576
/*     */     //   244: iand
/*     */     //   245: ifne -> 274
/*     */     //   248: iload #10
/*     */     //   250: aload #7
/*     */     //   252: aload #4
/*     */     //   254: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   259: ifeq -> 268
/*     */     //   262: sipush #16384
/*     */     //   265: goto -> 271
/*     */     //   268: sipush #8192
/*     */     //   271: ior
/*     */     //   272: istore #10
/*     */     //   274: iload #8
/*     */     //   276: ldc 196608
/*     */     //   278: iand
/*     */     //   279: ifne -> 314
/*     */     //   282: iload #10
/*     */     //   284: iload #9
/*     */     //   286: bipush #32
/*     */     //   288: iand
/*     */     //   289: ifne -> 309
/*     */     //   292: aload #7
/*     */     //   294: aload #5
/*     */     //   296: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   301: ifeq -> 309
/*     */     //   304: ldc 131072
/*     */     //   306: goto -> 311
/*     */     //   309: ldc 65536
/*     */     //   311: ior
/*     */     //   312: istore #10
/*     */     //   314: iload #9
/*     */     //   316: bipush #64
/*     */     //   318: iand
/*     */     //   319: ifeq -> 332
/*     */     //   322: iload #10
/*     */     //   324: ldc 1572864
/*     */     //   326: ior
/*     */     //   327: istore #10
/*     */     //   329: goto -> 364
/*     */     //   332: iload #8
/*     */     //   334: ldc 1572864
/*     */     //   336: iand
/*     */     //   337: ifne -> 364
/*     */     //   340: iload #10
/*     */     //   342: aload #7
/*     */     //   344: iload #6
/*     */     //   346: invokeinterface changed : (Z)Z
/*     */     //   351: ifeq -> 359
/*     */     //   354: ldc 1048576
/*     */     //   356: goto -> 361
/*     */     //   359: ldc 524288
/*     */     //   361: ior
/*     */     //   362: istore #10
/*     */     //   364: iload #10
/*     */     //   366: ldc 599187
/*     */     //   368: iand
/*     */     //   369: ldc 599186
/*     */     //   371: if_icmpne -> 384
/*     */     //   374: aload #7
/*     */     //   376: invokeinterface getSkipping : ()Z
/*     */     //   381: ifne -> 698
/*     */     //   384: aload #7
/*     */     //   386: invokeinterface startDefaults : ()V
/*     */     //   391: iload #8
/*     */     //   393: iconst_1
/*     */     //   394: iand
/*     */     //   395: ifeq -> 408
/*     */     //   398: aload #7
/*     */     //   400: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   405: ifeq -> 575
/*     */     //   408: iload #9
/*     */     //   410: iconst_2
/*     */     //   411: iand
/*     */     //   412: ifeq -> 422
/*     */     //   415: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   418: checkcast androidx/compose/ui/Modifier
/*     */     //   421: astore_1
/*     */     //   422: iload #9
/*     */     //   424: iconst_4
/*     */     //   425: iand
/*     */     //   426: ifeq -> 431
/*     */     //   429: iconst_0
/*     */     //   430: istore_2
/*     */     //   431: iload #9
/*     */     //   433: bipush #8
/*     */     //   435: iand
/*     */     //   436: ifeq -> 441
/*     */     //   439: iconst_1
/*     */     //   440: istore_3
/*     */     //   441: iload #9
/*     */     //   443: bipush #16
/*     */     //   445: iand
/*     */     //   446: ifeq -> 534
/*     */     //   449: aload #7
/*     */     //   451: ldc 326064665
/*     */     //   453: invokeinterface startReplaceGroup : (I)V
/*     */     //   458: aload #7
/*     */     //   460: astore #12
/*     */     //   462: iconst_0
/*     */     //   463: istore #13
/*     */     //   465: iconst_0
/*     */     //   466: istore #14
/*     */     //   468: aload #12
/*     */     //   470: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   475: astore #15
/*     */     //   477: iconst_0
/*     */     //   478: istore #16
/*     */     //   480: aload #15
/*     */     //   482: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   485: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   488: if_acmpne -> 513
/*     */     //   491: iconst_0
/*     */     //   492: istore #17
/*     */     //   494: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   497: astore #17
/*     */     //   499: aload #12
/*     */     //   501: aload #17
/*     */     //   503: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   508: aload #17
/*     */     //   510: goto -> 515
/*     */     //   513: aload #15
/*     */     //   515: nop
/*     */     //   516: nop
/*     */     //   517: nop
/*     */     //   518: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   521: astore #11
/*     */     //   523: aload #7
/*     */     //   525: invokeinterface endReplaceGroup : ()V
/*     */     //   530: aload #11
/*     */     //   532: astore #4
/*     */     //   534: iload #9
/*     */     //   536: bipush #32
/*     */     //   538: iand
/*     */     //   539: ifeq -> 561
/*     */     //   542: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   545: aload #7
/*     */     //   547: bipush #6
/*     */     //   549: invokestatic getScrollbarStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*     */     //   552: astore #5
/*     */     //   554: iload #10
/*     */     //   556: ldc -458753
/*     */     //   558: iand
/*     */     //   559: istore #10
/*     */     //   561: iload #9
/*     */     //   563: bipush #64
/*     */     //   565: iand
/*     */     //   566: ifeq -> 597
/*     */     //   569: iconst_0
/*     */     //   570: istore #6
/*     */     //   572: goto -> 597
/*     */     //   575: aload #7
/*     */     //   577: invokeinterface skipToGroupEnd : ()V
/*     */     //   582: iload #9
/*     */     //   584: bipush #32
/*     */     //   586: iand
/*     */     //   587: ifeq -> 597
/*     */     //   590: iload #10
/*     */     //   592: ldc -458753
/*     */     //   594: iand
/*     */     //   595: istore #10
/*     */     //   597: aload #7
/*     */     //   599: invokeinterface endDefaults : ()V
/*     */     //   604: invokestatic isTraceInProgress : ()Z
/*     */     //   607: ifeq -> 620
/*     */     //   610: ldc 1936699997
/*     */     //   612: iload #10
/*     */     //   614: iconst_m1
/*     */     //   615: ldc 'org.jetbrains.jewel.ui.component.VerticalScrollbar (Scrollbar.kt:90)'
/*     */     //   617: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   620: aload_0
/*     */     //   621: aload_1
/*     */     //   622: iload_2
/*     */     //   623: iload_3
/*     */     //   624: aload #4
/*     */     //   626: iconst_1
/*     */     //   627: aload #5
/*     */     //   629: iload #6
/*     */     //   631: aload #7
/*     */     //   633: ldc 196608
/*     */     //   635: bipush #14
/*     */     //   637: iload #10
/*     */     //   639: iand
/*     */     //   640: ior
/*     */     //   641: bipush #112
/*     */     //   643: iload #10
/*     */     //   645: iand
/*     */     //   646: ior
/*     */     //   647: sipush #896
/*     */     //   650: iload #10
/*     */     //   652: iand
/*     */     //   653: ior
/*     */     //   654: sipush #7168
/*     */     //   657: iload #10
/*     */     //   659: iand
/*     */     //   660: ior
/*     */     //   661: ldc 57344
/*     */     //   663: iload #10
/*     */     //   665: iand
/*     */     //   666: ior
/*     */     //   667: ldc 3670016
/*     */     //   669: iload #10
/*     */     //   671: iconst_3
/*     */     //   672: ishl
/*     */     //   673: iand
/*     */     //   674: ior
/*     */     //   675: ldc 29360128
/*     */     //   677: iload #10
/*     */     //   679: iconst_3
/*     */     //   680: ishl
/*     */     //   681: iand
/*     */     //   682: ior
/*     */     //   683: invokestatic BaseScrollbar : (Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;ZLandroidx/compose/runtime/Composer;I)V
/*     */     //   686: invokestatic isTraceInProgress : ()Z
/*     */     //   689: ifeq -> 705
/*     */     //   692: invokestatic traceEventEnd : ()V
/*     */     //   695: goto -> 705
/*     */     //   698: aload #7
/*     */     //   700: invokeinterface skipToGroupEnd : ()V
/*     */     //   705: aload #7
/*     */     //   707: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   712: dup
/*     */     //   713: ifnull -> 743
/*     */     //   716: aload_0
/*     */     //   717: aload_1
/*     */     //   718: iload_2
/*     */     //   719: iload_3
/*     */     //   720: aload #4
/*     */     //   722: aload #5
/*     */     //   724: iload #6
/*     */     //   726: iload #8
/*     */     //   728: iload #9
/*     */     //   730: <illegal opcode> invoke : (Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;ZII)Lkotlin/jvm/functions/Function2;
/*     */     //   735: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   740: goto -> 744
/*     */     //   743: pop
/*     */     //   744: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #91	-> 6
/*     */     //   #85	-> 415
/*     */     //   #86	-> 429
/*     */     //   #87	-> 439
/*     */     //   #88	-> 449
/*     */     //   #723	-> 468
/*     */     //   #724	-> 480
/*     */     //   #725	-> 491
/*     */     //   #88	-> 494
/*     */     //   #725	-> 497
/*     */     //   #726	-> 499
/*     */     //   #727	-> 508
/*     */     //   #728	-> 513
/*     */     //   #724	-> 515
/*     */     //   #723	-> 516
/*     */     //   #723	-> 517
/*     */     //   #88	-> 518
/*     */     //   #89	-> 542
/*     */     //   #90	-> 569
/*     */     //   #91	-> 617
/*     */     //   #93	-> 620
/*     */     //   #94	-> 621
/*     */     //   #95	-> 622
/*     */     //   #96	-> 623
/*     */     //   #97	-> 624
/*     */     //   #98	-> 626
/*     */     //   #99	-> 627
/*     */     //   #100	-> 629
/*     */     //   #92	-> 683
/*     */     //   #102	-> 698
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   494	3	17	$i$a$-cache-ScrollbarKt$VerticalScrollbar$1	I
/*     */     //   499	11	17	value$iv	Ljava/lang/Object;
/*     */     //   480	36	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   477	39	15	it$iv	Ljava/lang/Object;
/*     */     //   468	50	14	$i$f$cache	I
/*     */     //   465	53	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   465	53	13	invalid$iv	Z
/*     */     //   21	724	10	$dirty	I
/*     */     //   0	745	0	scrollState	Landroidx/compose/foundation/gestures/ScrollableState;
/*     */     //   0	745	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	745	2	reverseLayout	Z
/*     */     //   0	745	3	enabled	Z
/*     */     //   0	745	4	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	745	5	style	Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*     */     //   0	745	6	keepVisible	Z
/*     */     //   0	745	7	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	745	8	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void HorizontalScrollbar(@NotNull ScrollableState scrollState, @Nullable Modifier modifier, boolean reverseLayout, boolean enabled, @Nullable MutableInteractionSource interactionSource, @Nullable ScrollbarStyle style, boolean keepVisible, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'scrollState'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #7
/*     */     //   8: ldc -1747665141
/*     */     //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   15: astore #7
/*     */     //   17: iload #8
/*     */     //   19: istore #10
/*     */     //   21: iload #9
/*     */     //   23: iconst_1
/*     */     //   24: iand
/*     */     //   25: ifeq -> 38
/*     */     //   28: iload #10
/*     */     //   30: bipush #6
/*     */     //   32: ior
/*     */     //   33: istore #10
/*     */     //   35: goto -> 67
/*     */     //   38: iload #8
/*     */     //   40: bipush #6
/*     */     //   42: iand
/*     */     //   43: ifne -> 67
/*     */     //   46: iload #10
/*     */     //   48: aload #7
/*     */     //   50: aload_0
/*     */     //   51: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   56: ifeq -> 63
/*     */     //   59: iconst_4
/*     */     //   60: goto -> 64
/*     */     //   63: iconst_2
/*     */     //   64: ior
/*     */     //   65: istore #10
/*     */     //   67: iload #9
/*     */     //   69: iconst_2
/*     */     //   70: iand
/*     */     //   71: ifeq -> 84
/*     */     //   74: iload #10
/*     */     //   76: bipush #48
/*     */     //   78: ior
/*     */     //   79: istore #10
/*     */     //   81: goto -> 115
/*     */     //   84: iload #8
/*     */     //   86: bipush #48
/*     */     //   88: iand
/*     */     //   89: ifne -> 115
/*     */     //   92: iload #10
/*     */     //   94: aload #7
/*     */     //   96: aload_1
/*     */     //   97: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   102: ifeq -> 110
/*     */     //   105: bipush #32
/*     */     //   107: goto -> 112
/*     */     //   110: bipush #16
/*     */     //   112: ior
/*     */     //   113: istore #10
/*     */     //   115: iload #9
/*     */     //   117: iconst_4
/*     */     //   118: iand
/*     */     //   119: ifeq -> 133
/*     */     //   122: iload #10
/*     */     //   124: sipush #384
/*     */     //   127: ior
/*     */     //   128: istore #10
/*     */     //   130: goto -> 167
/*     */     //   133: iload #8
/*     */     //   135: sipush #384
/*     */     //   138: iand
/*     */     //   139: ifne -> 167
/*     */     //   142: iload #10
/*     */     //   144: aload #7
/*     */     //   146: iload_2
/*     */     //   147: invokeinterface changed : (Z)Z
/*     */     //   152: ifeq -> 161
/*     */     //   155: sipush #256
/*     */     //   158: goto -> 164
/*     */     //   161: sipush #128
/*     */     //   164: ior
/*     */     //   165: istore #10
/*     */     //   167: iload #9
/*     */     //   169: bipush #8
/*     */     //   171: iand
/*     */     //   172: ifeq -> 186
/*     */     //   175: iload #10
/*     */     //   177: sipush #3072
/*     */     //   180: ior
/*     */     //   181: istore #10
/*     */     //   183: goto -> 220
/*     */     //   186: iload #8
/*     */     //   188: sipush #3072
/*     */     //   191: iand
/*     */     //   192: ifne -> 220
/*     */     //   195: iload #10
/*     */     //   197: aload #7
/*     */     //   199: iload_3
/*     */     //   200: invokeinterface changed : (Z)Z
/*     */     //   205: ifeq -> 214
/*     */     //   208: sipush #2048
/*     */     //   211: goto -> 217
/*     */     //   214: sipush #1024
/*     */     //   217: ior
/*     */     //   218: istore #10
/*     */     //   220: iload #9
/*     */     //   222: bipush #16
/*     */     //   224: iand
/*     */     //   225: ifeq -> 239
/*     */     //   228: iload #10
/*     */     //   230: sipush #24576
/*     */     //   233: ior
/*     */     //   234: istore #10
/*     */     //   236: goto -> 274
/*     */     //   239: iload #8
/*     */     //   241: sipush #24576
/*     */     //   244: iand
/*     */     //   245: ifne -> 274
/*     */     //   248: iload #10
/*     */     //   250: aload #7
/*     */     //   252: aload #4
/*     */     //   254: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   259: ifeq -> 268
/*     */     //   262: sipush #16384
/*     */     //   265: goto -> 271
/*     */     //   268: sipush #8192
/*     */     //   271: ior
/*     */     //   272: istore #10
/*     */     //   274: iload #8
/*     */     //   276: ldc 196608
/*     */     //   278: iand
/*     */     //   279: ifne -> 314
/*     */     //   282: iload #10
/*     */     //   284: iload #9
/*     */     //   286: bipush #32
/*     */     //   288: iand
/*     */     //   289: ifne -> 309
/*     */     //   292: aload #7
/*     */     //   294: aload #5
/*     */     //   296: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   301: ifeq -> 309
/*     */     //   304: ldc 131072
/*     */     //   306: goto -> 311
/*     */     //   309: ldc 65536
/*     */     //   311: ior
/*     */     //   312: istore #10
/*     */     //   314: iload #9
/*     */     //   316: bipush #64
/*     */     //   318: iand
/*     */     //   319: ifeq -> 332
/*     */     //   322: iload #10
/*     */     //   324: ldc 1572864
/*     */     //   326: ior
/*     */     //   327: istore #10
/*     */     //   329: goto -> 364
/*     */     //   332: iload #8
/*     */     //   334: ldc 1572864
/*     */     //   336: iand
/*     */     //   337: ifne -> 364
/*     */     //   340: iload #10
/*     */     //   342: aload #7
/*     */     //   344: iload #6
/*     */     //   346: invokeinterface changed : (Z)Z
/*     */     //   351: ifeq -> 359
/*     */     //   354: ldc 1048576
/*     */     //   356: goto -> 361
/*     */     //   359: ldc 524288
/*     */     //   361: ior
/*     */     //   362: istore #10
/*     */     //   364: iload #10
/*     */     //   366: ldc 599187
/*     */     //   368: iand
/*     */     //   369: ldc 599186
/*     */     //   371: if_icmpne -> 384
/*     */     //   374: aload #7
/*     */     //   376: invokeinterface getSkipping : ()Z
/*     */     //   381: ifne -> 698
/*     */     //   384: aload #7
/*     */     //   386: invokeinterface startDefaults : ()V
/*     */     //   391: iload #8
/*     */     //   393: iconst_1
/*     */     //   394: iand
/*     */     //   395: ifeq -> 408
/*     */     //   398: aload #7
/*     */     //   400: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   405: ifeq -> 575
/*     */     //   408: iload #9
/*     */     //   410: iconst_2
/*     */     //   411: iand
/*     */     //   412: ifeq -> 422
/*     */     //   415: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   418: checkcast androidx/compose/ui/Modifier
/*     */     //   421: astore_1
/*     */     //   422: iload #9
/*     */     //   424: iconst_4
/*     */     //   425: iand
/*     */     //   426: ifeq -> 431
/*     */     //   429: iconst_0
/*     */     //   430: istore_2
/*     */     //   431: iload #9
/*     */     //   433: bipush #8
/*     */     //   435: iand
/*     */     //   436: ifeq -> 441
/*     */     //   439: iconst_1
/*     */     //   440: istore_3
/*     */     //   441: iload #9
/*     */     //   443: bipush #16
/*     */     //   445: iand
/*     */     //   446: ifeq -> 534
/*     */     //   449: aload #7
/*     */     //   451: ldc 230282667
/*     */     //   453: invokeinterface startReplaceGroup : (I)V
/*     */     //   458: aload #7
/*     */     //   460: astore #12
/*     */     //   462: iconst_0
/*     */     //   463: istore #13
/*     */     //   465: iconst_0
/*     */     //   466: istore #14
/*     */     //   468: aload #12
/*     */     //   470: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   475: astore #15
/*     */     //   477: iconst_0
/*     */     //   478: istore #16
/*     */     //   480: aload #15
/*     */     //   482: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   485: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   488: if_acmpne -> 513
/*     */     //   491: iconst_0
/*     */     //   492: istore #17
/*     */     //   494: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   497: astore #17
/*     */     //   499: aload #12
/*     */     //   501: aload #17
/*     */     //   503: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   508: aload #17
/*     */     //   510: goto -> 515
/*     */     //   513: aload #15
/*     */     //   515: nop
/*     */     //   516: nop
/*     */     //   517: nop
/*     */     //   518: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   521: astore #11
/*     */     //   523: aload #7
/*     */     //   525: invokeinterface endReplaceGroup : ()V
/*     */     //   530: aload #11
/*     */     //   532: astore #4
/*     */     //   534: iload #9
/*     */     //   536: bipush #32
/*     */     //   538: iand
/*     */     //   539: ifeq -> 561
/*     */     //   542: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   545: aload #7
/*     */     //   547: bipush #6
/*     */     //   549: invokestatic getScrollbarStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*     */     //   552: astore #5
/*     */     //   554: iload #10
/*     */     //   556: ldc -458753
/*     */     //   558: iand
/*     */     //   559: istore #10
/*     */     //   561: iload #9
/*     */     //   563: bipush #64
/*     */     //   565: iand
/*     */     //   566: ifeq -> 597
/*     */     //   569: iconst_0
/*     */     //   570: istore #6
/*     */     //   572: goto -> 597
/*     */     //   575: aload #7
/*     */     //   577: invokeinterface skipToGroupEnd : ()V
/*     */     //   582: iload #9
/*     */     //   584: bipush #32
/*     */     //   586: iand
/*     */     //   587: ifeq -> 597
/*     */     //   590: iload #10
/*     */     //   592: ldc -458753
/*     */     //   594: iand
/*     */     //   595: istore #10
/*     */     //   597: aload #7
/*     */     //   599: invokeinterface endDefaults : ()V
/*     */     //   604: invokestatic isTraceInProgress : ()Z
/*     */     //   607: ifeq -> 620
/*     */     //   610: ldc -1747665141
/*     */     //   612: iload #10
/*     */     //   614: iconst_m1
/*     */     //   615: ldc 'org.jetbrains.jewel.ui.component.HorizontalScrollbar (Scrollbar.kt:112)'
/*     */     //   617: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   620: aload_0
/*     */     //   621: aload_1
/*     */     //   622: iload_2
/*     */     //   623: iload_3
/*     */     //   624: aload #4
/*     */     //   626: iconst_0
/*     */     //   627: aload #5
/*     */     //   629: iload #6
/*     */     //   631: aload #7
/*     */     //   633: ldc 196608
/*     */     //   635: bipush #14
/*     */     //   637: iload #10
/*     */     //   639: iand
/*     */     //   640: ior
/*     */     //   641: bipush #112
/*     */     //   643: iload #10
/*     */     //   645: iand
/*     */     //   646: ior
/*     */     //   647: sipush #896
/*     */     //   650: iload #10
/*     */     //   652: iand
/*     */     //   653: ior
/*     */     //   654: sipush #7168
/*     */     //   657: iload #10
/*     */     //   659: iand
/*     */     //   660: ior
/*     */     //   661: ldc 57344
/*     */     //   663: iload #10
/*     */     //   665: iand
/*     */     //   666: ior
/*     */     //   667: ldc 3670016
/*     */     //   669: iload #10
/*     */     //   671: iconst_3
/*     */     //   672: ishl
/*     */     //   673: iand
/*     */     //   674: ior
/*     */     //   675: ldc 29360128
/*     */     //   677: iload #10
/*     */     //   679: iconst_3
/*     */     //   680: ishl
/*     */     //   681: iand
/*     */     //   682: ior
/*     */     //   683: invokestatic BaseScrollbar : (Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;ZLandroidx/compose/runtime/Composer;I)V
/*     */     //   686: invokestatic isTraceInProgress : ()Z
/*     */     //   689: ifeq -> 705
/*     */     //   692: invokestatic traceEventEnd : ()V
/*     */     //   695: goto -> 705
/*     */     //   698: aload #7
/*     */     //   700: invokeinterface skipToGroupEnd : ()V
/*     */     //   705: aload #7
/*     */     //   707: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   712: dup
/*     */     //   713: ifnull -> 743
/*     */     //   716: aload_0
/*     */     //   717: aload_1
/*     */     //   718: iload_2
/*     */     //   719: iload_3
/*     */     //   720: aload #4
/*     */     //   722: aload #5
/*     */     //   724: iload #6
/*     */     //   726: iload #8
/*     */     //   728: iload #9
/*     */     //   730: <illegal opcode> invoke : (Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;ZII)Lkotlin/jvm/functions/Function2;
/*     */     //   735: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   740: goto -> 744
/*     */     //   743: pop
/*     */     //   744: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #113	-> 6
/*     */     //   #107	-> 415
/*     */     //   #108	-> 429
/*     */     //   #109	-> 439
/*     */     //   #110	-> 449
/*     */     //   #729	-> 468
/*     */     //   #730	-> 480
/*     */     //   #731	-> 491
/*     */     //   #110	-> 494
/*     */     //   #731	-> 497
/*     */     //   #732	-> 499
/*     */     //   #733	-> 508
/*     */     //   #734	-> 513
/*     */     //   #730	-> 515
/*     */     //   #729	-> 516
/*     */     //   #729	-> 517
/*     */     //   #110	-> 518
/*     */     //   #111	-> 542
/*     */     //   #112	-> 569
/*     */     //   #113	-> 617
/*     */     //   #115	-> 620
/*     */     //   #116	-> 621
/*     */     //   #117	-> 622
/*     */     //   #118	-> 623
/*     */     //   #119	-> 624
/*     */     //   #120	-> 626
/*     */     //   #121	-> 627
/*     */     //   #122	-> 629
/*     */     //   #114	-> 683
/*     */     //   #124	-> 698
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   494	3	17	$i$a$-cache-ScrollbarKt$HorizontalScrollbar$1	I
/*     */     //   499	11	17	value$iv	Ljava/lang/Object;
/*     */     //   480	36	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   477	39	15	it$iv	Ljava/lang/Object;
/*     */     //   468	50	14	$i$f$cache	I
/*     */     //   465	53	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   465	53	13	invalid$iv	Z
/*     */     //   21	724	10	$dirty	I
/*     */     //   0	745	0	scrollState	Landroidx/compose/foundation/gestures/ScrollableState;
/*     */     //   0	745	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	745	2	reverseLayout	Z
/*     */     //   0	745	3	enabled	Z
/*     */     //   0	745	4	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	745	5	style	Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*     */     //   0	745	6	keepVisible	Z
/*     */     //   0	745	7	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	745	8	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   private static final void BaseScrollbar(ScrollableState scrollState, Modifier modifier, boolean reverseLayout, boolean enabled, MutableInteractionSource interactionSource, boolean isVertical, ScrollbarStyle style, boolean keepVisible, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload #8
/*     */     //   2: ldc -1006036836
/*     */     //   4: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   9: astore #8
/*     */     //   11: iload #9
/*     */     //   13: istore #10
/*     */     //   15: iload #9
/*     */     //   17: bipush #6
/*     */     //   19: iand
/*     */     //   20: ifne -> 44
/*     */     //   23: iload #10
/*     */     //   25: aload #8
/*     */     //   27: aload_0
/*     */     //   28: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   33: ifeq -> 40
/*     */     //   36: iconst_4
/*     */     //   37: goto -> 41
/*     */     //   40: iconst_2
/*     */     //   41: ior
/*     */     //   42: istore #10
/*     */     //   44: iload #9
/*     */     //   46: bipush #48
/*     */     //   48: iand
/*     */     //   49: ifne -> 75
/*     */     //   52: iload #10
/*     */     //   54: aload #8
/*     */     //   56: aload_1
/*     */     //   57: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   62: ifeq -> 70
/*     */     //   65: bipush #32
/*     */     //   67: goto -> 72
/*     */     //   70: bipush #16
/*     */     //   72: ior
/*     */     //   73: istore #10
/*     */     //   75: iload #9
/*     */     //   77: sipush #384
/*     */     //   80: iand
/*     */     //   81: ifne -> 109
/*     */     //   84: iload #10
/*     */     //   86: aload #8
/*     */     //   88: iload_2
/*     */     //   89: invokeinterface changed : (Z)Z
/*     */     //   94: ifeq -> 103
/*     */     //   97: sipush #256
/*     */     //   100: goto -> 106
/*     */     //   103: sipush #128
/*     */     //   106: ior
/*     */     //   107: istore #10
/*     */     //   109: iload #9
/*     */     //   111: sipush #3072
/*     */     //   114: iand
/*     */     //   115: ifne -> 143
/*     */     //   118: iload #10
/*     */     //   120: aload #8
/*     */     //   122: iload_3
/*     */     //   123: invokeinterface changed : (Z)Z
/*     */     //   128: ifeq -> 137
/*     */     //   131: sipush #2048
/*     */     //   134: goto -> 140
/*     */     //   137: sipush #1024
/*     */     //   140: ior
/*     */     //   141: istore #10
/*     */     //   143: iload #9
/*     */     //   145: sipush #24576
/*     */     //   148: iand
/*     */     //   149: ifne -> 178
/*     */     //   152: iload #10
/*     */     //   154: aload #8
/*     */     //   156: aload #4
/*     */     //   158: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   163: ifeq -> 172
/*     */     //   166: sipush #16384
/*     */     //   169: goto -> 175
/*     */     //   172: sipush #8192
/*     */     //   175: ior
/*     */     //   176: istore #10
/*     */     //   178: iload #9
/*     */     //   180: ldc 196608
/*     */     //   182: iand
/*     */     //   183: ifne -> 210
/*     */     //   186: iload #10
/*     */     //   188: aload #8
/*     */     //   190: iload #5
/*     */     //   192: invokeinterface changed : (Z)Z
/*     */     //   197: ifeq -> 205
/*     */     //   200: ldc 131072
/*     */     //   202: goto -> 207
/*     */     //   205: ldc 65536
/*     */     //   207: ior
/*     */     //   208: istore #10
/*     */     //   210: iload #9
/*     */     //   212: ldc 1572864
/*     */     //   214: iand
/*     */     //   215: ifne -> 242
/*     */     //   218: iload #10
/*     */     //   220: aload #8
/*     */     //   222: aload #6
/*     */     //   224: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   229: ifeq -> 237
/*     */     //   232: ldc 1048576
/*     */     //   234: goto -> 239
/*     */     //   237: ldc 524288
/*     */     //   239: ior
/*     */     //   240: istore #10
/*     */     //   242: iload #9
/*     */     //   244: ldc 12582912
/*     */     //   246: iand
/*     */     //   247: ifne -> 274
/*     */     //   250: iload #10
/*     */     //   252: aload #8
/*     */     //   254: iload #7
/*     */     //   256: invokeinterface changed : (Z)Z
/*     */     //   261: ifeq -> 269
/*     */     //   264: ldc 8388608
/*     */     //   266: goto -> 271
/*     */     //   269: ldc 4194304
/*     */     //   271: ior
/*     */     //   272: istore #10
/*     */     //   274: iload #10
/*     */     //   276: ldc 4793491
/*     */     //   278: iand
/*     */     //   279: ldc 4793490
/*     */     //   281: if_icmpne -> 294
/*     */     //   284: aload #8
/*     */     //   286: invokeinterface getSkipping : ()Z
/*     */     //   291: ifne -> 2943
/*     */     //   294: invokestatic isTraceInProgress : ()Z
/*     */     //   297: ifeq -> 310
/*     */     //   300: ldc -1006036836
/*     */     //   302: iload #10
/*     */     //   304: iconst_m1
/*     */     //   305: ldc 'org.jetbrains.jewel.ui.component.BaseScrollbar (Scrollbar.kt:135)'
/*     */     //   307: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   310: aload #8
/*     */     //   312: ldc -1830788720
/*     */     //   314: invokeinterface startReplaceGroup : (I)V
/*     */     //   319: aload #8
/*     */     //   321: astore #13
/*     */     //   323: iconst_0
/*     */     //   324: istore #14
/*     */     //   326: nop
/*     */     //   327: iconst_0
/*     */     //   328: istore #15
/*     */     //   330: aload #13
/*     */     //   332: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   337: astore #16
/*     */     //   339: iconst_0
/*     */     //   340: istore #17
/*     */     //   342: aload #16
/*     */     //   344: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   347: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   350: if_acmpne -> 379
/*     */     //   353: iconst_0
/*     */     //   354: istore #18
/*     */     //   356: aconst_null
/*     */     //   357: aconst_null
/*     */     //   358: iconst_2
/*     */     //   359: aconst_null
/*     */     //   360: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   363: astore #18
/*     */     //   365: aload #13
/*     */     //   367: aload #18
/*     */     //   369: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   374: aload #18
/*     */     //   376: goto -> 381
/*     */     //   379: aload #16
/*     */     //   381: nop
/*     */     //   382: nop
/*     */     //   383: nop
/*     */     //   384: checkcast androidx/compose/runtime/MutableState
/*     */     //   387: astore #12
/*     */     //   389: aload #8
/*     */     //   391: invokeinterface endReplaceGroup : ()V
/*     */     //   396: aload #12
/*     */     //   398: astore #11
/*     */     //   400: aload #4
/*     */     //   402: aload #8
/*     */     //   404: ldc -1830785410
/*     */     //   406: invokeinterface startReplaceGroup : (I)V
/*     */     //   411: aload #8
/*     */     //   413: astore #13
/*     */     //   415: iload #10
/*     */     //   417: ldc 57344
/*     */     //   419: iand
/*     */     //   420: sipush #16384
/*     */     //   423: if_icmpne -> 430
/*     */     //   426: iconst_1
/*     */     //   427: goto -> 431
/*     */     //   430: iconst_0
/*     */     //   431: istore #14
/*     */     //   433: iconst_0
/*     */     //   434: istore #15
/*     */     //   436: aload #13
/*     */     //   438: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   443: astore #16
/*     */     //   445: iconst_0
/*     */     //   446: istore #17
/*     */     //   448: iload #14
/*     */     //   450: ifne -> 464
/*     */     //   453: aload #16
/*     */     //   455: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   458: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   461: if_acmpne -> 497
/*     */     //   464: astore #61
/*     */     //   466: iconst_0
/*     */     //   467: istore #18
/*     */     //   469: aload #11
/*     */     //   471: aload #4
/*     */     //   473: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;)Lkotlin/jvm/functions/Function1;
/*     */     //   478: aload #61
/*     */     //   480: swap
/*     */     //   481: astore #19
/*     */     //   483: aload #13
/*     */     //   485: aload #19
/*     */     //   487: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   492: aload #19
/*     */     //   494: goto -> 499
/*     */     //   497: aload #16
/*     */     //   499: nop
/*     */     //   500: nop
/*     */     //   501: nop
/*     */     //   502: checkcast kotlin/jvm/functions/Function1
/*     */     //   505: astore #12
/*     */     //   507: aload #8
/*     */     //   509: invokeinterface endReplaceGroup : ()V
/*     */     //   514: aload #12
/*     */     //   516: aload #8
/*     */     //   518: bipush #14
/*     */     //   520: iload #10
/*     */     //   522: bipush #12
/*     */     //   524: ishr
/*     */     //   525: iand
/*     */     //   526: invokestatic DisposableEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*     */     //   529: aload #6
/*     */     //   531: invokevirtual getScrollbarVisibility : ()Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;
/*     */     //   534: astore #12
/*     */     //   536: aload #12
/*     */     //   538: instanceof org/jetbrains/jewel/ui/component/styling/ScrollbarVisibility$AlwaysVisible
/*     */     //   541: istore #13
/*     */     //   543: aload #8
/*     */     //   545: ldc -1830774119
/*     */     //   547: invokeinterface startReplaceGroup : (I)V
/*     */     //   552: aload #8
/*     */     //   554: astore #16
/*     */     //   556: iconst_0
/*     */     //   557: istore #17
/*     */     //   559: nop
/*     */     //   560: iconst_0
/*     */     //   561: istore #18
/*     */     //   563: aload #16
/*     */     //   565: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   570: astore #19
/*     */     //   572: iconst_0
/*     */     //   573: istore #20
/*     */     //   575: aload #19
/*     */     //   577: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   580: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   583: if_acmpne -> 615
/*     */     //   586: iconst_0
/*     */     //   587: istore #21
/*     */     //   589: iconst_0
/*     */     //   590: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   593: aconst_null
/*     */     //   594: iconst_2
/*     */     //   595: aconst_null
/*     */     //   596: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   599: astore #21
/*     */     //   601: aload #16
/*     */     //   603: aload #21
/*     */     //   605: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   610: aload #21
/*     */     //   612: goto -> 617
/*     */     //   615: aload #19
/*     */     //   617: nop
/*     */     //   618: nop
/*     */     //   619: nop
/*     */     //   620: checkcast androidx/compose/runtime/MutableState
/*     */     //   623: astore #15
/*     */     //   625: aload #8
/*     */     //   627: invokeinterface endReplaceGroup : ()V
/*     */     //   632: aload #15
/*     */     //   634: astore #14
/*     */     //   636: aload #4
/*     */     //   638: checkcast androidx/compose/foundation/interaction/InteractionSource
/*     */     //   641: aload #8
/*     */     //   643: bipush #14
/*     */     //   645: iload #10
/*     */     //   647: bipush #12
/*     */     //   649: ishr
/*     */     //   650: iand
/*     */     //   651: invokestatic collectIsHoveredAsState : (Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   654: astore #15
/*     */     //   656: aload #8
/*     */     //   658: ldc_w -1830770119
/*     */     //   661: invokeinterface startReplaceGroup : (I)V
/*     */     //   666: aload #8
/*     */     //   668: astore #18
/*     */     //   670: iconst_0
/*     */     //   671: istore #19
/*     */     //   673: nop
/*     */     //   674: iconst_0
/*     */     //   675: istore #20
/*     */     //   677: aload #18
/*     */     //   679: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   684: astore #21
/*     */     //   686: iconst_0
/*     */     //   687: istore #22
/*     */     //   689: aload #21
/*     */     //   691: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   694: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   697: if_acmpne -> 729
/*     */     //   700: iconst_0
/*     */     //   701: istore #23
/*     */     //   703: iconst_0
/*     */     //   704: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   707: aconst_null
/*     */     //   708: iconst_2
/*     */     //   709: aconst_null
/*     */     //   710: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   713: astore #23
/*     */     //   715: aload #18
/*     */     //   717: aload #23
/*     */     //   719: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   724: aload #23
/*     */     //   726: goto -> 731
/*     */     //   729: aload #21
/*     */     //   731: nop
/*     */     //   732: nop
/*     */     //   733: nop
/*     */     //   734: checkcast androidx/compose/runtime/MutableState
/*     */     //   737: astore #17
/*     */     //   739: aload #8
/*     */     //   741: invokeinterface endReplaceGroup : ()V
/*     */     //   746: aload #17
/*     */     //   748: astore #16
/*     */     //   750: aload #11
/*     */     //   752: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   757: ifnull -> 764
/*     */     //   760: iconst_1
/*     */     //   761: goto -> 765
/*     */     //   764: iconst_0
/*     */     //   765: istore #17
/*     */     //   767: aload_0
/*     */     //   768: invokeinterface isScrollInProgress : ()Z
/*     */     //   773: ifne -> 781
/*     */     //   776: iload #17
/*     */     //   778: ifeq -> 785
/*     */     //   781: iconst_1
/*     */     //   782: goto -> 786
/*     */     //   785: iconst_0
/*     */     //   786: istore #18
/*     */     //   788: iload #13
/*     */     //   790: ifne -> 811
/*     */     //   793: iload #18
/*     */     //   795: ifne -> 811
/*     */     //   798: iload #7
/*     */     //   800: ifeq -> 815
/*     */     //   803: aload #16
/*     */     //   805: invokestatic BaseScrollbar$lambda$14 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   808: ifeq -> 815
/*     */     //   811: iconst_1
/*     */     //   812: goto -> 816
/*     */     //   815: iconst_0
/*     */     //   816: istore #19
/*     */     //   818: aload #15
/*     */     //   820: invokestatic BaseScrollbar$lambda$12 : (Landroidx/compose/runtime/State;)Z
/*     */     //   823: ifeq -> 840
/*     */     //   826: aload #16
/*     */     //   828: invokestatic BaseScrollbar$lambda$14 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   831: ifeq -> 840
/*     */     //   834: aload #14
/*     */     //   836: iconst_1
/*     */     //   837: invokestatic BaseScrollbar$lambda$11 : (Landroidx/compose/runtime/MutableState;Z)V
/*     */     //   840: iload #19
/*     */     //   842: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   845: aload #15
/*     */     //   847: invokestatic BaseScrollbar$lambda$12 : (Landroidx/compose/runtime/State;)Z
/*     */     //   850: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   853: aload #16
/*     */     //   855: invokestatic BaseScrollbar$lambda$14 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   858: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   861: aload #8
/*     */     //   863: ldc_w -1830758872
/*     */     //   866: invokeinterface startReplaceGroup : (I)V
/*     */     //   871: aload #8
/*     */     //   873: astore #21
/*     */     //   875: aload #8
/*     */     //   877: aload #15
/*     */     //   879: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   884: aload #8
/*     */     //   886: iload #19
/*     */     //   888: invokeinterface changed : (Z)Z
/*     */     //   893: ior
/*     */     //   894: aload #8
/*     */     //   896: aload #12
/*     */     //   898: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   903: ior
/*     */     //   904: istore #22
/*     */     //   906: iconst_0
/*     */     //   907: istore #23
/*     */     //   909: aload #21
/*     */     //   911: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   916: astore #24
/*     */     //   918: iconst_0
/*     */     //   919: istore #25
/*     */     //   921: iload #22
/*     */     //   923: ifne -> 937
/*     */     //   926: aload #24
/*     */     //   928: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   931: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   934: if_acmpne -> 993
/*     */     //   937: astore #63
/*     */     //   939: astore #62
/*     */     //   941: astore #61
/*     */     //   943: iconst_0
/*     */     //   944: istore #26
/*     */     //   946: new org/jetbrains/jewel/ui/component/ScrollbarKt$BaseScrollbar$2$1
/*     */     //   949: dup
/*     */     //   950: iload #19
/*     */     //   952: aload #16
/*     */     //   954: aload #15
/*     */     //   956: aload #12
/*     */     //   958: aload #14
/*     */     //   960: aconst_null
/*     */     //   961: invokespecial <init> : (ZLandroidx/compose/runtime/MutableState;Landroidx/compose/runtime/State;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*     */     //   964: checkcast kotlin/jvm/functions/Function2
/*     */     //   967: astore #64
/*     */     //   969: aload #61
/*     */     //   971: aload #62
/*     */     //   973: aload #63
/*     */     //   975: aload #64
/*     */     //   977: astore #27
/*     */     //   979: aload #21
/*     */     //   981: aload #27
/*     */     //   983: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   988: aload #27
/*     */     //   990: goto -> 995
/*     */     //   993: aload #24
/*     */     //   995: nop
/*     */     //   996: nop
/*     */     //   997: nop
/*     */     //   998: checkcast kotlin/jvm/functions/Function2
/*     */     //   1001: astore #20
/*     */     //   1003: aload #8
/*     */     //   1005: invokeinterface endReplaceGroup : ()V
/*     */     //   1010: aload #20
/*     */     //   1012: aload #8
/*     */     //   1014: iconst_0
/*     */     //   1015: invokestatic LaunchedEffect : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1018: aload #14
/*     */     //   1020: invokestatic BaseScrollbar$lambda$10 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   1023: ifeq -> 1036
/*     */     //   1026: aload #12
/*     */     //   1028: invokeinterface getTrackThicknessExpanded-D9Ej5fM : ()F
/*     */     //   1033: goto -> 1043
/*     */     //   1036: aload #12
/*     */     //   1038: invokeinterface getTrackThickness-D9Ej5fM : ()F
/*     */     //   1043: aload #12
/*     */     //   1045: invokeinterface getExpandAnimationDuration-UwyO8pc : ()J
/*     */     //   1050: invokestatic getInWholeMilliseconds-impl : (J)J
/*     */     //   1053: l2i
/*     */     //   1054: iconst_0
/*     */     //   1055: invokestatic getLinearEasing : ()Landroidx/compose/animation/core/Easing;
/*     */     //   1058: iconst_2
/*     */     //   1059: aconst_null
/*     */     //   1060: invokestatic tween$default : (IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;
/*     */     //   1063: checkcast androidx/compose/animation/core/AnimationSpec
/*     */     //   1066: ldc_w 'scrollbar_thickness'
/*     */     //   1069: aconst_null
/*     */     //   1070: aload #8
/*     */     //   1072: sipush #384
/*     */     //   1075: bipush #8
/*     */     //   1077: invokestatic animateDpAsState-AjpBEmI : (FLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*     */     //   1080: astore #20
/*     */     //   1082: aload_0
/*     */     //   1083: astore #22
/*     */     //   1085: aload #22
/*     */     //   1087: instanceof androidx/compose/foundation/lazy/LazyListState
/*     */     //   1090: ifeq -> 1127
/*     */     //   1093: aload #8
/*     */     //   1095: ldc_w -1830735684
/*     */     //   1098: invokeinterface startReplaceGroup : (I)V
/*     */     //   1103: aload_0
/*     */     //   1104: checkcast androidx/compose/foundation/lazy/LazyListState
/*     */     //   1107: aload #8
/*     */     //   1109: iconst_0
/*     */     //   1110: invokestatic rememberScrollbarAdapter2 : (Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/v2/ScrollbarAdapter;
/*     */     //   1113: astore #23
/*     */     //   1115: aload #8
/*     */     //   1117: invokeinterface endReplaceGroup : ()V
/*     */     //   1122: aload #23
/*     */     //   1124: goto -> 1300
/*     */     //   1127: aload #22
/*     */     //   1129: instanceof androidx/compose/foundation/lazy/grid/LazyGridState
/*     */     //   1132: ifeq -> 1169
/*     */     //   1135: aload #8
/*     */     //   1137: ldc_w -1830733444
/*     */     //   1140: invokeinterface startReplaceGroup : (I)V
/*     */     //   1145: aload_0
/*     */     //   1146: checkcast androidx/compose/foundation/lazy/grid/LazyGridState
/*     */     //   1149: aload #8
/*     */     //   1151: iconst_0
/*     */     //   1152: invokestatic rememberScrollbarAdapter2 : (Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/v2/ScrollbarAdapter;
/*     */     //   1155: astore #23
/*     */     //   1157: aload #8
/*     */     //   1159: invokeinterface endReplaceGroup : ()V
/*     */     //   1164: aload #23
/*     */     //   1166: goto -> 1300
/*     */     //   1169: aload #22
/*     */     //   1171: instanceof androidx/compose/foundation/ScrollState
/*     */     //   1174: ifeq -> 1211
/*     */     //   1177: aload #8
/*     */     //   1179: ldc_w -1830731268
/*     */     //   1182: invokeinterface startReplaceGroup : (I)V
/*     */     //   1187: aload_0
/*     */     //   1188: checkcast androidx/compose/foundation/ScrollState
/*     */     //   1191: aload #8
/*     */     //   1193: iconst_0
/*     */     //   1194: invokestatic rememberScrollbarAdapter2 : (Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/v2/ScrollbarAdapter;
/*     */     //   1197: astore #23
/*     */     //   1199: aload #8
/*     */     //   1201: invokeinterface endReplaceGroup : ()V
/*     */     //   1206: aload #23
/*     */     //   1208: goto -> 1300
/*     */     //   1211: aload #22
/*     */     //   1213: instanceof androidx/compose/foundation/text/TextFieldScrollState
/*     */     //   1216: ifeq -> 1255
/*     */     //   1219: aload #8
/*     */     //   1221: ldc_w -1830728804
/*     */     //   1224: invokeinterface startReplaceGroup : (I)V
/*     */     //   1229: aload_0
/*     */     //   1230: checkcast androidx/compose/foundation/text/TextFieldScrollState
/*     */     //   1233: aload #8
/*     */     //   1235: getstatic androidx/compose/foundation/text/TextFieldScrollState.$stable : I
/*     */     //   1238: invokestatic rememberScrollbarAdapter2 : (Landroidx/compose/foundation/text/TextFieldScrollState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/v2/ScrollbarAdapter;
/*     */     //   1241: astore #23
/*     */     //   1243: aload #8
/*     */     //   1245: invokeinterface endReplaceGroup : ()V
/*     */     //   1250: aload #23
/*     */     //   1252: goto -> 1300
/*     */     //   1255: aload #8
/*     */     //   1257: ldc_w -1830726910
/*     */     //   1260: invokeinterface startReplaceGroup : (I)V
/*     */     //   1265: aload #8
/*     */     //   1267: invokeinterface endReplaceGroup : ()V
/*     */     //   1272: new java/lang/IllegalStateException
/*     */     //   1275: dup
/*     */     //   1276: aload_0
/*     */     //   1277: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   1280: invokestatic getOrCreateKotlinClass : (Ljava/lang/Class;)Lkotlin/reflect/KClass;
/*     */     //   1283: invokeinterface getQualifiedName : ()Ljava/lang/String;
/*     */     //   1288: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1293: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   1296: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1299: athrow
/*     */     //   1300: astore #21
/*     */     //   1302: invokestatic getLocalDensity : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   1305: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   1308: astore #22
/*     */     //   1310: iconst_0
/*     */     //   1311: istore #23
/*     */     //   1313: iconst_0
/*     */     //   1314: istore #24
/*     */     //   1316: aload #8
/*     */     //   1318: ldc_w 2023513938
/*     */     //   1321: ldc_w 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   1324: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1327: aload #8
/*     */     //   1329: aload #22
/*     */     //   1331: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   1336: astore #25
/*     */     //   1338: aload #8
/*     */     //   1340: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1343: aload #25
/*     */     //   1345: checkcast androidx/compose/ui/unit/Density
/*     */     //   1348: astore #23
/*     */     //   1350: iconst_0
/*     */     //   1351: istore #24
/*     */     //   1353: aload #8
/*     */     //   1355: ldc_w 884833527
/*     */     //   1358: invokeinterface startReplaceGroup : (I)V
/*     */     //   1363: aload #8
/*     */     //   1365: astore #25
/*     */     //   1367: iconst_0
/*     */     //   1368: istore #26
/*     */     //   1370: nop
/*     */     //   1371: iconst_0
/*     */     //   1372: istore #27
/*     */     //   1374: aload #25
/*     */     //   1376: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1381: astore #28
/*     */     //   1383: iconst_0
/*     */     //   1384: istore #29
/*     */     //   1386: aload #28
/*     */     //   1388: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1391: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1394: if_acmpne -> 1420
/*     */     //   1397: iconst_0
/*     */     //   1398: istore #30
/*     */     //   1400: iconst_0
/*     */     //   1401: invokestatic mutableIntStateOf : (I)Landroidx/compose/runtime/MutableIntState;
/*     */     //   1404: astore #30
/*     */     //   1406: aload #25
/*     */     //   1408: aload #30
/*     */     //   1410: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1415: aload #30
/*     */     //   1417: goto -> 1422
/*     */     //   1420: aload #28
/*     */     //   1422: nop
/*     */     //   1423: nop
/*     */     //   1424: nop
/*     */     //   1425: checkcast androidx/compose/runtime/MutableIntState
/*     */     //   1428: astore #31
/*     */     //   1430: aload #8
/*     */     //   1432: invokeinterface endReplaceGroup : ()V
/*     */     //   1437: aload #31
/*     */     //   1439: astore #32
/*     */     //   1441: aload #23
/*     */     //   1443: aload #6
/*     */     //   1445: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/ScrollbarMetrics;
/*     */     //   1448: invokevirtual getMinThumbLength-D9Ej5fM : ()F
/*     */     //   1451: invokeinterface toPx-0680j_4 : (F)F
/*     */     //   1456: fstore #31
/*     */     //   1458: iconst_0
/*     */     //   1459: istore #27
/*     */     //   1461: nop
/*     */     //   1462: iconst_0
/*     */     //   1463: istore #28
/*     */     //   1465: aload #8
/*     */     //   1467: ldc_w 773894976
/*     */     //   1470: ldc_w 'CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp'
/*     */     //   1473: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1476: aload #8
/*     */     //   1478: astore #29
/*     */     //   1480: aload #8
/*     */     //   1482: ldc_w -954370320
/*     */     //   1485: ldc_w 'CC(remember):Effects.kt#9igjgp'
/*     */     //   1488: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1491: aload #8
/*     */     //   1493: astore #30
/*     */     //   1495: iconst_0
/*     */     //   1496: istore #33
/*     */     //   1498: iconst_0
/*     */     //   1499: istore #34
/*     */     //   1501: aload #30
/*     */     //   1503: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1508: astore #35
/*     */     //   1510: iconst_0
/*     */     //   1511: istore #36
/*     */     //   1513: aload #35
/*     */     //   1515: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1518: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1521: if_acmpne -> 1568
/*     */     //   1524: iconst_0
/*     */     //   1525: istore #37
/*     */     //   1527: iconst_0
/*     */     //   1528: istore #38
/*     */     //   1530: getstatic kotlin/coroutines/EmptyCoroutineContext.INSTANCE : Lkotlin/coroutines/EmptyCoroutineContext;
/*     */     //   1533: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   1536: aload #29
/*     */     //   1538: invokestatic createCompositionCoroutineScope : (Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;
/*     */     //   1541: astore #65
/*     */     //   1543: new androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */     //   1546: dup
/*     */     //   1547: aload #65
/*     */     //   1549: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;)V
/*     */     //   1552: astore #38
/*     */     //   1554: aload #30
/*     */     //   1556: aload #38
/*     */     //   1558: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1563: aload #38
/*     */     //   1565: goto -> 1570
/*     */     //   1568: aload #35
/*     */     //   1570: nop
/*     */     //   1571: nop
/*     */     //   1572: nop
/*     */     //   1573: checkcast androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */     //   1576: astore #39
/*     */     //   1578: aload #8
/*     */     //   1580: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1583: aload #39
/*     */     //   1585: astore #40
/*     */     //   1587: aload #40
/*     */     //   1589: invokevirtual getCoroutineScope : ()Lkotlinx/coroutines/CoroutineScope;
/*     */     //   1592: astore #39
/*     */     //   1594: aload #8
/*     */     //   1596: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1599: aload #39
/*     */     //   1601: nop
/*     */     //   1602: astore #25
/*     */     //   1604: aload #32
/*     */     //   1606: invokestatic BaseScrollbar$lambda$30$lambda$19 : (Landroidx/compose/runtime/MutableIntState;)I
/*     */     //   1609: istore #27
/*     */     //   1611: aload #8
/*     */     //   1613: ldc_w 884839922
/*     */     //   1616: invokeinterface startReplaceGroup : (I)V
/*     */     //   1621: aload #8
/*     */     //   1623: astore #29
/*     */     //   1625: aload #8
/*     */     //   1627: aload #21
/*     */     //   1629: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1634: aload #8
/*     */     //   1636: iload #27
/*     */     //   1638: invokeinterface changed : (I)Z
/*     */     //   1643: ior
/*     */     //   1644: aload #8
/*     */     //   1646: fload #31
/*     */     //   1648: invokeinterface changed : (F)Z
/*     */     //   1653: ior
/*     */     //   1654: iload #10
/*     */     //   1656: sipush #896
/*     */     //   1659: iand
/*     */     //   1660: sipush #256
/*     */     //   1663: if_icmpne -> 1670
/*     */     //   1666: iconst_1
/*     */     //   1667: goto -> 1671
/*     */     //   1670: iconst_0
/*     */     //   1671: ior
/*     */     //   1672: iload #10
/*     */     //   1674: ldc_w 458752
/*     */     //   1677: iand
/*     */     //   1678: ldc 131072
/*     */     //   1680: if_icmpne -> 1687
/*     */     //   1683: iconst_1
/*     */     //   1684: goto -> 1688
/*     */     //   1687: iconst_0
/*     */     //   1688: ior
/*     */     //   1689: aload #8
/*     */     //   1691: aload #25
/*     */     //   1693: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1698: ior
/*     */     //   1699: istore #30
/*     */     //   1701: iconst_0
/*     */     //   1702: istore #33
/*     */     //   1704: aload #29
/*     */     //   1706: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1711: astore #34
/*     */     //   1713: iconst_0
/*     */     //   1714: istore #35
/*     */     //   1716: iload #30
/*     */     //   1718: ifne -> 1732
/*     */     //   1721: aload #34
/*     */     //   1723: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1726: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1729: if_acmpne -> 1772
/*     */     //   1732: iconst_0
/*     */     //   1733: istore #36
/*     */     //   1735: new org/jetbrains/jewel/ui/component/SliderAdapter
/*     */     //   1738: dup
/*     */     //   1739: aload #21
/*     */     //   1741: aload #32
/*     */     //   1743: invokestatic BaseScrollbar$lambda$30$lambda$19 : (Landroidx/compose/runtime/MutableIntState;)I
/*     */     //   1746: fload #31
/*     */     //   1748: iload_2
/*     */     //   1749: iload #5
/*     */     //   1751: aload #25
/*     */     //   1753: invokespecial <init> : (Landroidx/compose/foundation/v2/ScrollbarAdapter;IFZZLkotlinx/coroutines/CoroutineScope;)V
/*     */     //   1756: astore #37
/*     */     //   1758: aload #29
/*     */     //   1760: aload #37
/*     */     //   1762: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1767: aload #37
/*     */     //   1769: goto -> 1774
/*     */     //   1772: aload #34
/*     */     //   1774: nop
/*     */     //   1775: nop
/*     */     //   1776: nop
/*     */     //   1777: checkcast org/jetbrains/jewel/ui/component/SliderAdapter
/*     */     //   1780: astore #28
/*     */     //   1782: aload #8
/*     */     //   1784: invokeinterface endReplaceGroup : ()V
/*     */     //   1789: aload #28
/*     */     //   1791: astore #26
/*     */     //   1793: iload #13
/*     */     //   1795: aload #15
/*     */     //   1797: invokestatic BaseScrollbar$lambda$12 : (Landroidx/compose/runtime/State;)Z
/*     */     //   1800: iload #18
/*     */     //   1802: aload #6
/*     */     //   1804: aload #16
/*     */     //   1806: invokestatic BaseScrollbar$lambda$14 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   1809: invokestatic getThumbBackgroundColor : (ZZZLorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Z)J
/*     */     //   1812: lstore #41
/*     */     //   1814: iload #13
/*     */     //   1816: aload #15
/*     */     //   1818: invokestatic BaseScrollbar$lambda$12 : (Landroidx/compose/runtime/State;)Z
/*     */     //   1821: iload #18
/*     */     //   1823: aload #6
/*     */     //   1825: aload #16
/*     */     //   1827: invokestatic BaseScrollbar$lambda$14 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   1830: invokestatic getThumbBorderColor : (ZZZLorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Z)J
/*     */     //   1833: lstore #43
/*     */     //   1835: lload #41
/*     */     //   1837: lload #43
/*     */     //   1839: invokestatic areTheSameColor--OWjLjI : (JJ)Z
/*     */     //   1842: ifne -> 1849
/*     */     //   1845: iconst_1
/*     */     //   1846: goto -> 1850
/*     */     //   1849: iconst_0
/*     */     //   1850: istore #33
/*     */     //   1852: iload #33
/*     */     //   1854: ifeq -> 1867
/*     */     //   1857: aload #12
/*     */     //   1859: invokeinterface getTrackPaddingWithBorder : ()Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   1864: goto -> 1874
/*     */     //   1867: aload #12
/*     */     //   1869: invokeinterface getTrackPadding : ()Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   1874: astore #34
/*     */     //   1876: aload #23
/*     */     //   1878: aload #8
/*     */     //   1880: ldc_w -1830692850
/*     */     //   1883: invokeinterface startReplaceGroup : (I)V
/*     */     //   1888: iload #5
/*     */     //   1890: ifeq -> 1999
/*     */     //   1893: invokestatic getLocalLayoutDirection : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   1896: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   1899: astore #38
/*     */     //   1901: iconst_0
/*     */     //   1902: istore #39
/*     */     //   1904: iconst_0
/*     */     //   1905: istore #40
/*     */     //   1907: aload #8
/*     */     //   1909: ldc_w 2023513938
/*     */     //   1912: ldc_w 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   1915: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1918: aload #8
/*     */     //   1920: aload #38
/*     */     //   1922: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   1927: astore #45
/*     */     //   1929: aload #8
/*     */     //   1931: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1934: aload #45
/*     */     //   1936: checkcast androidx/compose/ui/unit/LayoutDirection
/*     */     //   1939: astore #37
/*     */     //   1941: aload #20
/*     */     //   1943: invokestatic BaseScrollbar$lambda$17 : (Landroidx/compose/runtime/State;)F
/*     */     //   1946: fstore #38
/*     */     //   1948: aload #34
/*     */     //   1950: aload #37
/*     */     //   1952: invokeinterface calculateLeftPadding-u2uoSUM : (Landroidx/compose/ui/unit/LayoutDirection;)F
/*     */     //   1957: fstore #39
/*     */     //   1959: nop
/*     */     //   1960: iconst_0
/*     */     //   1961: istore #40
/*     */     //   1963: fload #38
/*     */     //   1965: fload #39
/*     */     //   1967: fsub
/*     */     //   1968: invokestatic constructor-impl : (F)F
/*     */     //   1971: fstore #38
/*     */     //   1973: aload #34
/*     */     //   1975: aload #37
/*     */     //   1977: invokeinterface calculateRightPadding-u2uoSUM : (Landroidx/compose/ui/unit/LayoutDirection;)F
/*     */     //   1982: fstore #39
/*     */     //   1984: nop
/*     */     //   1985: iconst_0
/*     */     //   1986: istore #40
/*     */     //   1988: fload #38
/*     */     //   1990: fload #39
/*     */     //   1992: fsub
/*     */     //   1993: invokestatic constructor-impl : (F)F
/*     */     //   1996: goto -> 2048
/*     */     //   1999: aload #20
/*     */     //   2001: invokestatic BaseScrollbar$lambda$17 : (Landroidx/compose/runtime/State;)F
/*     */     //   2004: fstore #37
/*     */     //   2006: aload #34
/*     */     //   2008: invokeinterface calculateTopPadding-D9Ej5fM : ()F
/*     */     //   2013: fstore #38
/*     */     //   2015: iconst_0
/*     */     //   2016: istore #39
/*     */     //   2018: fload #37
/*     */     //   2020: fload #38
/*     */     //   2022: fsub
/*     */     //   2023: invokestatic constructor-impl : (F)F
/*     */     //   2026: fstore #37
/*     */     //   2028: aload #34
/*     */     //   2030: invokeinterface calculateBottomPadding-D9Ej5fM : ()F
/*     */     //   2035: fstore #38
/*     */     //   2037: iconst_0
/*     */     //   2038: istore #39
/*     */     //   2040: fload #37
/*     */     //   2042: fload #38
/*     */     //   2044: fsub
/*     */     //   2045: invokestatic constructor-impl : (F)F
/*     */     //   2048: fstore #36
/*     */     //   2050: aload #8
/*     */     //   2052: invokeinterface endReplaceGroup : ()V
/*     */     //   2057: fload #36
/*     */     //   2059: invokeinterface roundToPx-0680j_4 : (F)I
/*     */     //   2064: istore #35
/*     */     //   2066: iload #5
/*     */     //   2068: ifeq -> 2213
/*     */     //   2071: aload #8
/*     */     //   2073: ldc_w 1661459052
/*     */     //   2076: invokeinterface startReplaceGroup : (I)V
/*     */     //   2081: aload #8
/*     */     //   2083: ldc_w 884879990
/*     */     //   2086: invokeinterface startReplaceGroup : (I)V
/*     */     //   2091: aload #8
/*     */     //   2093: astore #39
/*     */     //   2095: aload #8
/*     */     //   2097: aload #26
/*     */     //   2099: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   2104: aload #8
/*     */     //   2106: iload #35
/*     */     //   2108: invokeinterface changed : (I)Z
/*     */     //   2113: ior
/*     */     //   2114: istore #40
/*     */     //   2116: iconst_0
/*     */     //   2117: istore #45
/*     */     //   2119: aload #39
/*     */     //   2121: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2126: astore #46
/*     */     //   2128: iconst_0
/*     */     //   2129: istore #47
/*     */     //   2131: iload #40
/*     */     //   2133: ifne -> 2147
/*     */     //   2136: aload #46
/*     */     //   2138: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2141: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2144: if_acmpne -> 2180
/*     */     //   2147: iconst_0
/*     */     //   2148: istore #48
/*     */     //   2150: aload #26
/*     */     //   2152: aload #32
/*     */     //   2154: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableIntState;)Lkotlin/jvm/functions/Function1;
/*     */     //   2159: iload #35
/*     */     //   2161: invokestatic verticalMeasurePolicy : (Lorg/jetbrains/jewel/ui/component/SliderAdapter;Lkotlin/jvm/functions/Function1;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2164: astore #49
/*     */     //   2166: aload #39
/*     */     //   2168: aload #49
/*     */     //   2170: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2175: aload #49
/*     */     //   2177: goto -> 2182
/*     */     //   2180: aload #46
/*     */     //   2182: nop
/*     */     //   2183: nop
/*     */     //   2184: nop
/*     */     //   2185: checkcast androidx/compose/ui/layout/MeasurePolicy
/*     */     //   2188: astore #38
/*     */     //   2190: aload #8
/*     */     //   2192: invokeinterface endReplaceGroup : ()V
/*     */     //   2197: aload #38
/*     */     //   2199: astore #37
/*     */     //   2201: aload #8
/*     */     //   2203: invokeinterface endReplaceGroup : ()V
/*     */     //   2208: aload #37
/*     */     //   2210: goto -> 2352
/*     */     //   2213: aload #8
/*     */     //   2215: ldc_w 1661655530
/*     */     //   2218: invokeinterface startReplaceGroup : (I)V
/*     */     //   2223: aload #8
/*     */     //   2225: ldc_w 884886328
/*     */     //   2228: invokeinterface startReplaceGroup : (I)V
/*     */     //   2233: aload #8
/*     */     //   2235: astore #39
/*     */     //   2237: aload #8
/*     */     //   2239: aload #26
/*     */     //   2241: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   2246: aload #8
/*     */     //   2248: iload #35
/*     */     //   2250: invokeinterface changed : (I)Z
/*     */     //   2255: ior
/*     */     //   2256: istore #40
/*     */     //   2258: iconst_0
/*     */     //   2259: istore #45
/*     */     //   2261: aload #39
/*     */     //   2263: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2268: astore #46
/*     */     //   2270: iconst_0
/*     */     //   2271: istore #47
/*     */     //   2273: iload #40
/*     */     //   2275: ifne -> 2289
/*     */     //   2278: aload #46
/*     */     //   2280: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2283: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2286: if_acmpne -> 2322
/*     */     //   2289: iconst_0
/*     */     //   2290: istore #48
/*     */     //   2292: aload #26
/*     */     //   2294: aload #32
/*     */     //   2296: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableIntState;)Lkotlin/jvm/functions/Function1;
/*     */     //   2301: iload #35
/*     */     //   2303: invokestatic horizontalMeasurePolicy : (Lorg/jetbrains/jewel/ui/component/SliderAdapter;Lkotlin/jvm/functions/Function1;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2306: astore #49
/*     */     //   2308: aload #39
/*     */     //   2310: aload #49
/*     */     //   2312: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2317: aload #49
/*     */     //   2319: goto -> 2324
/*     */     //   2322: aload #46
/*     */     //   2324: nop
/*     */     //   2325: nop
/*     */     //   2326: nop
/*     */     //   2327: checkcast androidx/compose/ui/layout/MeasurePolicy
/*     */     //   2330: astore #38
/*     */     //   2332: aload #8
/*     */     //   2334: invokeinterface endReplaceGroup : ()V
/*     */     //   2339: aload #38
/*     */     //   2341: astore #37
/*     */     //   2343: aload #8
/*     */     //   2345: invokeinterface endReplaceGroup : ()V
/*     */     //   2350: aload #37
/*     */     //   2352: astore #36
/*     */     //   2354: aload #26
/*     */     //   2356: invokevirtual getThumbSize : ()D
/*     */     //   2359: aload #32
/*     */     //   2361: invokestatic BaseScrollbar$lambda$30$lambda$19 : (Landroidx/compose/runtime/MutableIntState;)I
/*     */     //   2364: i2d
/*     */     //   2365: dcmpg
/*     */     //   2366: ifge -> 2373
/*     */     //   2369: iconst_1
/*     */     //   2370: goto -> 2374
/*     */     //   2373: iconst_0
/*     */     //   2374: istore #37
/*     */     //   2376: iload #13
/*     */     //   2378: iload #17
/*     */     //   2380: aload #15
/*     */     //   2382: invokestatic BaseScrollbar$lambda$12 : (Landroidx/compose/runtime/State;)Z
/*     */     //   2385: aload #6
/*     */     //   2387: aload #14
/*     */     //   2389: invokestatic BaseScrollbar$lambda$10 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   2392: invokestatic getTrackColor : (ZZZLorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Z)J
/*     */     //   2395: aload #12
/*     */     //   2397: invokestatic trackColorTween : (Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;)Landroidx/compose/animation/core/TweenSpec;
/*     */     //   2400: checkcast androidx/compose/animation/core/AnimationSpec
/*     */     //   2403: ldc_w 'scrollbar_trackBackground'
/*     */     //   2406: aconst_null
/*     */     //   2407: aload #8
/*     */     //   2409: sipush #384
/*     */     //   2412: bipush #8
/*     */     //   2414: invokestatic animateColorAsState-euL9pac : (JLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*     */     //   2417: astore #38
/*     */     //   2419: aload_1
/*     */     //   2420: astore #39
/*     */     //   2422: aload #16
/*     */     //   2424: invokestatic BaseScrollbar$lambda$14 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   2427: ifeq -> 2447
/*     */     //   2430: iload #37
/*     */     //   2432: ifeq -> 2447
/*     */     //   2435: aload #14
/*     */     //   2437: invokestatic BaseScrollbar$lambda$10 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   2440: ifeq -> 2447
/*     */     //   2443: iconst_1
/*     */     //   2444: goto -> 2448
/*     */     //   2447: iconst_0
/*     */     //   2448: istore #40
/*     */     //   2450: iconst_0
/*     */     //   2451: istore #45
/*     */     //   2453: iload #40
/*     */     //   2455: ifeq -> 2481
/*     */     //   2458: aload #39
/*     */     //   2460: astore #46
/*     */     //   2462: iconst_0
/*     */     //   2463: istore #47
/*     */     //   2465: aload #46
/*     */     //   2467: aload #38
/*     */     //   2469: invokestatic BaseScrollbar$lambda$30$lambda$26 : (Landroidx/compose/runtime/State;)J
/*     */     //   2472: aconst_null
/*     */     //   2473: iconst_2
/*     */     //   2474: aconst_null
/*     */     //   2475: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2478: goto -> 2483
/*     */     //   2481: aload #39
/*     */     //   2483: aload_0
/*     */     //   2484: iload #5
/*     */     //   2486: ifeq -> 2495
/*     */     //   2489: getstatic androidx/compose/foundation/gestures/Orientation.Vertical : Landroidx/compose/foundation/gestures/Orientation;
/*     */     //   2492: goto -> 2498
/*     */     //   2495: getstatic androidx/compose/foundation/gestures/Orientation.Horizontal : Landroidx/compose/foundation/gestures/Orientation;
/*     */     //   2498: iload_3
/*     */     //   2499: iconst_1
/*     */     //   2500: aconst_null
/*     */     //   2501: aconst_null
/*     */     //   2502: bipush #48
/*     */     //   2504: aconst_null
/*     */     //   2505: invokestatic scrollable$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2508: aload #34
/*     */     //   2510: invokestatic padding : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;
/*     */     //   2513: aload #4
/*     */     //   2515: iconst_0
/*     */     //   2516: iconst_2
/*     */     //   2517: aconst_null
/*     */     //   2518: invokestatic hoverable$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2521: astore #39
/*     */     //   2523: iload_3
/*     */     //   2524: ifeq -> 2539
/*     */     //   2527: aload #16
/*     */     //   2529: invokestatic BaseScrollbar$lambda$14 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   2532: ifeq -> 2539
/*     */     //   2535: iconst_1
/*     */     //   2536: goto -> 2540
/*     */     //   2539: iconst_0
/*     */     //   2540: istore #40
/*     */     //   2542: iconst_0
/*     */     //   2543: istore #45
/*     */     //   2545: iload #40
/*     */     //   2547: ifeq -> 2575
/*     */     //   2550: aload #39
/*     */     //   2552: astore #46
/*     */     //   2554: iconst_0
/*     */     //   2555: istore #47
/*     */     //   2557: aload #46
/*     */     //   2559: aload #6
/*     */     //   2561: invokevirtual getTrackClickBehavior : ()Lorg/jetbrains/jewel/ui/component/styling/TrackClickBehavior;
/*     */     //   2564: iload #5
/*     */     //   2566: iload_2
/*     */     //   2567: aload #26
/*     */     //   2569: invokestatic scrollOnPressTrack : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/TrackClickBehavior;ZZLorg/jetbrains/jewel/ui/component/SliderAdapter;)Landroidx/compose/ui/Modifier;
/*     */     //   2572: goto -> 2577
/*     */     //   2575: aload #39
/*     */     //   2577: astore #39
/*     */     //   2579: iconst_0
/*     */     //   2580: istore #40
/*     */     //   2582: nop
/*     */     //   2583: iconst_0
/*     */     //   2584: istore #45
/*     */     //   2586: aload #8
/*     */     //   2588: ldc_w -1323940314
/*     */     //   2591: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   2594: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2597: aload #8
/*     */     //   2599: iconst_0
/*     */     //   2600: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   2603: istore #46
/*     */     //   2605: aload #8
/*     */     //   2607: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2612: astore #47
/*     */     //   2614: aload #8
/*     */     //   2616: aload #39
/*     */     //   2618: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   2621: astore #48
/*     */     //   2623: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2626: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   2629: astore #49
/*     */     //   2631: bipush #6
/*     */     //   2633: sipush #896
/*     */     //   2636: iload #40
/*     */     //   2638: bipush #6
/*     */     //   2640: ishl
/*     */     //   2641: iand
/*     */     //   2642: ior
/*     */     //   2643: istore #50
/*     */     //   2645: nop
/*     */     //   2646: iconst_0
/*     */     //   2647: istore #51
/*     */     //   2649: aload #8
/*     */     //   2651: ldc_w -692256719
/*     */     //   2654: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   2657: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2660: aload #8
/*     */     //   2662: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   2667: instanceof androidx/compose/runtime/Applier
/*     */     //   2670: ifne -> 2676
/*     */     //   2673: invokestatic invalidApplier : ()V
/*     */     //   2676: aload #8
/*     */     //   2678: invokeinterface startReusableNode : ()V
/*     */     //   2683: aload #8
/*     */     //   2685: invokeinterface getInserting : ()Z
/*     */     //   2690: ifeq -> 2705
/*     */     //   2693: aload #8
/*     */     //   2695: aload #49
/*     */     //   2697: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   2702: goto -> 2712
/*     */     //   2705: aload #8
/*     */     //   2707: invokeinterface useNode : ()V
/*     */     //   2712: aload #8
/*     */     //   2714: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   2717: astore #52
/*     */     //   2719: iconst_0
/*     */     //   2720: istore #53
/*     */     //   2722: aload #52
/*     */     //   2724: aload #36
/*     */     //   2726: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2729: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2732: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2735: aload #52
/*     */     //   2737: aload #47
/*     */     //   2739: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2742: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2745: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2748: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2751: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2754: astore #54
/*     */     //   2756: iconst_0
/*     */     //   2757: istore #55
/*     */     //   2759: aload #52
/*     */     //   2761: astore #56
/*     */     //   2763: iconst_0
/*     */     //   2764: istore #57
/*     */     //   2766: aload #56
/*     */     //   2768: invokeinterface getInserting : ()Z
/*     */     //   2773: ifne -> 2794
/*     */     //   2776: aload #56
/*     */     //   2778: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2783: iload #46
/*     */     //   2785: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2788: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   2791: ifne -> 2820
/*     */     //   2794: aload #56
/*     */     //   2796: iload #46
/*     */     //   2798: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2801: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2806: aload #52
/*     */     //   2808: iload #46
/*     */     //   2810: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2813: aload #54
/*     */     //   2815: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2820: nop
/*     */     //   2821: nop
/*     */     //   2822: nop
/*     */     //   2823: aload #52
/*     */     //   2825: aload #48
/*     */     //   2827: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2830: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2833: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2836: nop
/*     */     //   2837: nop
/*     */     //   2838: aload #8
/*     */     //   2840: bipush #14
/*     */     //   2842: iload #50
/*     */     //   2844: bipush #6
/*     */     //   2846: ishr
/*     */     //   2847: iand
/*     */     //   2848: istore #58
/*     */     //   2850: astore #59
/*     */     //   2852: iconst_0
/*     */     //   2853: istore #60
/*     */     //   2855: aload #16
/*     */     //   2857: invokestatic BaseScrollbar$lambda$14 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   2860: aload #12
/*     */     //   2862: iload #37
/*     */     //   2864: iload_3
/*     */     //   2865: aload #4
/*     */     //   2867: aload #11
/*     */     //   2869: aload #26
/*     */     //   2871: lload #41
/*     */     //   2873: lload #43
/*     */     //   2875: iload #33
/*     */     //   2877: aload #6
/*     */     //   2879: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/ScrollbarMetrics;
/*     */     //   2882: invokevirtual getThumbCornerSize : ()Landroidx/compose/foundation/shape/CornerSize;
/*     */     //   2885: aload #59
/*     */     //   2887: ldc 196608
/*     */     //   2889: sipush #7168
/*     */     //   2892: iload #10
/*     */     //   2894: iand
/*     */     //   2895: ior
/*     */     //   2896: ldc 57344
/*     */     //   2898: iload #10
/*     */     //   2900: iand
/*     */     //   2901: ior
/*     */     //   2902: iconst_0
/*     */     //   2903: invokestatic Thumb-KjnZka4 : (ZLorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Lorg/jetbrains/jewel/ui/component/SliderAdapter;JJZLandroidx/compose/foundation/shape/CornerSize;Landroidx/compose/runtime/Composer;II)V
/*     */     //   2906: nop
/*     */     //   2907: aload #8
/*     */     //   2909: invokeinterface endNode : ()V
/*     */     //   2914: aload #8
/*     */     //   2916: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2919: nop
/*     */     //   2920: aload #8
/*     */     //   2922: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2925: nop
/*     */     //   2926: nop
/*     */     //   2927: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   2930: pop
/*     */     //   2931: invokestatic isTraceInProgress : ()Z
/*     */     //   2934: ifeq -> 2950
/*     */     //   2937: invokestatic traceEventEnd : ()V
/*     */     //   2940: goto -> 2950
/*     */     //   2943: aload #8
/*     */     //   2945: invokeinterface skipToGroupEnd : ()V
/*     */     //   2950: aload #8
/*     */     //   2952: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   2957: dup
/*     */     //   2958: ifnull -> 2988
/*     */     //   2961: aload_0
/*     */     //   2962: aload_1
/*     */     //   2963: iload_2
/*     */     //   2964: iload_3
/*     */     //   2965: aload #4
/*     */     //   2967: iload #5
/*     */     //   2969: aload #6
/*     */     //   2971: iload #7
/*     */     //   2973: iload #9
/*     */     //   2975: <illegal opcode> invoke : (Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;ZI)Lkotlin/jvm/functions/Function2;
/*     */     //   2980: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   2985: goto -> 2989
/*     */     //   2988: pop
/*     */     //   2989: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #136	-> 0
/*     */     //   #137	-> 326
/*     */     //   #735	-> 330
/*     */     //   #736	-> 342
/*     */     //   #737	-> 353
/*     */     //   #137	-> 356
/*     */     //   #737	-> 363
/*     */     //   #738	-> 365
/*     */     //   #739	-> 374
/*     */     //   #740	-> 379
/*     */     //   #736	-> 381
/*     */     //   #735	-> 382
/*     */     //   #735	-> 383
/*     */     //   #137	-> 384
/*     */     //   #138	-> 400
/*     */     //   #741	-> 436
/*     */     //   #742	-> 448
/*     */     //   #743	-> 464
/*     */     //   #138	-> 469
/*     */     //   #743	-> 481
/*     */     //   #744	-> 483
/*     */     //   #745	-> 492
/*     */     //   #746	-> 497
/*     */     //   #742	-> 499
/*     */     //   #741	-> 500
/*     */     //   #741	-> 501
/*     */     //   #138	-> 502
/*     */     //   #147	-> 529
/*     */     //   #148	-> 536
/*     */     //   #149	-> 559
/*     */     //   #747	-> 563
/*     */     //   #748	-> 575
/*     */     //   #749	-> 586
/*     */     //   #149	-> 589
/*     */     //   #749	-> 599
/*     */     //   #750	-> 601
/*     */     //   #751	-> 610
/*     */     //   #752	-> 615
/*     */     //   #748	-> 617
/*     */     //   #747	-> 618
/*     */     //   #747	-> 619
/*     */     //   #149	-> 620
/*     */     //   #150	-> 636
/*     */     //   #151	-> 673
/*     */     //   #753	-> 677
/*     */     //   #754	-> 689
/*     */     //   #755	-> 700
/*     */     //   #151	-> 703
/*     */     //   #755	-> 713
/*     */     //   #756	-> 715
/*     */     //   #757	-> 724
/*     */     //   #758	-> 729
/*     */     //   #754	-> 731
/*     */     //   #753	-> 732
/*     */     //   #753	-> 733
/*     */     //   #151	-> 734
/*     */     //   #153	-> 750
/*     */     //   #154	-> 767
/*     */     //   #155	-> 788
/*     */     //   #157	-> 818
/*     */     //   #159	-> 840
/*     */     //   #759	-> 909
/*     */     //   #760	-> 921
/*     */     //   #761	-> 937
/*     */     //   #159	-> 946
/*     */     //   #761	-> 977
/*     */     //   #762	-> 979
/*     */     //   #763	-> 988
/*     */     //   #764	-> 993
/*     */     //   #760	-> 995
/*     */     //   #759	-> 996
/*     */     //   #759	-> 997
/*     */     //   #159	-> 998
/*     */     //   #174	-> 1018
/*     */     //   #175	-> 1043
/*     */     //   #176	-> 1066
/*     */     //   #173	-> 1077
/*     */     //   #172	-> 1080
/*     */     //   #180	-> 1082
/*     */     //   #181	-> 1085
/*     */     //   #182	-> 1127
/*     */     //   #183	-> 1169
/*     */     //   #184	-> 1211
/*     */     //   #185	-> 1255
/*     */     //   #180	-> 1300
/*     */     //   #179	-> 1300
/*     */     //   #188	-> 1302
/*     */     //   #765	-> 1324
/*     */     //   #188	-> 1345
/*     */     //   #189	-> 1370
/*     */     //   #766	-> 1374
/*     */     //   #767	-> 1386
/*     */     //   #768	-> 1397
/*     */     //   #189	-> 1400
/*     */     //   #768	-> 1404
/*     */     //   #769	-> 1406
/*     */     //   #770	-> 1415
/*     */     //   #771	-> 1420
/*     */     //   #767	-> 1422
/*     */     //   #766	-> 1423
/*     */     //   #766	-> 1424
/*     */     //   #189	-> 1425
/*     */     //   #190	-> 1441
/*     */     //   #192	-> 1461
/*     */     //   #772	-> 1473
/*     */     //   #773	-> 1476
/*     */     //   #775	-> 1478
/*     */     //   #776	-> 1488
/*     */     //   #777	-> 1501
/*     */     //   #778	-> 1513
/*     */     //   #779	-> 1524
/*     */     //   #780	-> 1527
/*     */     //   #781	-> 1527
/*     */     //   #782	-> 1530
/*     */     //   #781	-> 1533
/*     */     //   #780	-> 1541
/*     */     //   #779	-> 1552
/*     */     //   #783	-> 1554
/*     */     //   #784	-> 1563
/*     */     //   #785	-> 1568
/*     */     //   #778	-> 1570
/*     */     //   #777	-> 1571
/*     */     //   #777	-> 1572
/*     */     //   #776	-> 1573
/*     */     //   #786	-> 1587
/*     */     //   #772	-> 1596
/*     */     //   #786	-> 1601
/*     */     //   #192	-> 1602
/*     */     //   #194	-> 1604
/*     */     //   #787	-> 1704
/*     */     //   #788	-> 1716
/*     */     //   #789	-> 1732
/*     */     //   #195	-> 1735
/*     */     //   #789	-> 1756
/*     */     //   #790	-> 1758
/*     */     //   #791	-> 1767
/*     */     //   #792	-> 1772
/*     */     //   #788	-> 1774
/*     */     //   #787	-> 1775
/*     */     //   #787	-> 1776
/*     */     //   #194	-> 1777
/*     */     //   #193	-> 1791
/*     */     //   #198	-> 1793
/*     */     //   #199	-> 1814
/*     */     //   #200	-> 1835
/*     */     //   #202	-> 1852
/*     */     //   #201	-> 1874
/*     */     //   #205	-> 1876
/*     */     //   #206	-> 1893
/*     */     //   #793	-> 1915
/*     */     //   #206	-> 1936
/*     */     //   #207	-> 1941
/*     */     //   #208	-> 1948
/*     */     //   #207	-> 1959
/*     */     //   #794	-> 1963
/*     */     //   #209	-> 1973
/*     */     //   #207	-> 1984
/*     */     //   #794	-> 1988
/*     */     //   #211	-> 1999
/*     */     //   #795	-> 2018
/*     */     //   #211	-> 2028
/*     */     //   #795	-> 2040
/*     */     //   #205	-> 2048
/*     */     //   #213	-> 2059
/*     */     //   #204	-> 2064
/*     */     //   #216	-> 2066
/*     */     //   #217	-> 2097
/*     */     //   #796	-> 2119
/*     */     //   #797	-> 2131
/*     */     //   #798	-> 2147
/*     */     //   #218	-> 2150
/*     */     //   #798	-> 2164
/*     */     //   #799	-> 2166
/*     */     //   #800	-> 2175
/*     */     //   #801	-> 2180
/*     */     //   #797	-> 2182
/*     */     //   #796	-> 2183
/*     */     //   #796	-> 2184
/*     */     //   #217	-> 2185
/*     */     //   #216	-> 2199
/*     */     //   #220	-> 2213
/*     */     //   #221	-> 2239
/*     */     //   #802	-> 2261
/*     */     //   #803	-> 2273
/*     */     //   #804	-> 2289
/*     */     //   #222	-> 2292
/*     */     //   #804	-> 2306
/*     */     //   #805	-> 2308
/*     */     //   #806	-> 2317
/*     */     //   #807	-> 2322
/*     */     //   #803	-> 2324
/*     */     //   #802	-> 2325
/*     */     //   #802	-> 2326
/*     */     //   #221	-> 2327
/*     */     //   #220	-> 2341
/*     */     //   #216	-> 2352
/*     */     //   #215	-> 2352
/*     */     //   #226	-> 2354
/*     */     //   #230	-> 2376
/*     */     //   #231	-> 2395
/*     */     //   #232	-> 2403
/*     */     //   #229	-> 2414
/*     */     //   #228	-> 2417
/*     */     //   #252	-> 2419
/*     */     //   #253	-> 2422
/*     */     //   #808	-> 2453
/*     */     //   #253	-> 2465
/*     */     //   #808	-> 2478
/*     */     //   #255	-> 2483
/*     */     //   #256	-> 2484
/*     */     //   #257	-> 2498
/*     */     //   #258	-> 2499
/*     */     //   #254	-> 2500
/*     */     //   #260	-> 2508
/*     */     //   #261	-> 2513
/*     */     //   #262	-> 2523
/*     */     //   #809	-> 2545
/*     */     //   #263	-> 2557
/*     */     //   #809	-> 2572
/*     */     //   #235	-> 2582
/*     */     //   #810	-> 2594
/*     */     //   #811	-> 2600
/*     */     //   #812	-> 2607
/*     */     //   #813	-> 2616
/*     */     //   #815	-> 2623
/*     */     //   #814	-> 2645
/*     */     //   #816	-> 2657
/*     */     //   #817	-> 2660
/*     */     //   #818	-> 2678
/*     */     //   #819	-> 2683
/*     */     //   #820	-> 2695
/*     */     //   #822	-> 2707
/*     */     //   #824	-> 2712
/*     */     //   #825	-> 2722
/*     */     //   #826	-> 2735
/*     */     //   #828	-> 2748
/*     */     //   #829	-> 2759
/*     */     //   #830	-> 2766
/*     */     //   #831	-> 2794
/*     */     //   #832	-> 2806
/*     */     //   #834	-> 2820
/*     */     //   #829	-> 2821
/*     */     //   #834	-> 2822
/*     */     //   #835	-> 2823
/*     */     //   #836	-> 2836
/*     */     //   #824	-> 2837
/*     */     //   #837	-> 2838
/*     */     //   #238	-> 2855
/*     */     //   #239	-> 2860
/*     */     //   #240	-> 2862
/*     */     //   #241	-> 2864
/*     */     //   #242	-> 2865
/*     */     //   #243	-> 2867
/*     */     //   #244	-> 2869
/*     */     //   #245	-> 2871
/*     */     //   #246	-> 2873
/*     */     //   #247	-> 2875
/*     */     //   #248	-> 2877
/*     */     //   #237	-> 2903
/*     */     //   #250	-> 2906
/*     */     //   #837	-> 2907
/*     */     //   #838	-> 2909
/*     */     //   #816	-> 2916
/*     */     //   #839	-> 2919
/*     */     //   #810	-> 2922
/*     */     //   #840	-> 2925
/*     */     //   #267	-> 2926
/*     */     //   #188	-> 2930
/*     */     //   #268	-> 2943
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   356	7	18	$i$a$-cache-ScrollbarKt$BaseScrollbar$dragInteraction$1	I
/*     */     //   365	11	18	value$iv	Ljava/lang/Object;
/*     */     //   342	40	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   339	43	16	it$iv	Ljava/lang/Object;
/*     */     //   330	54	15	$i$f$cache	I
/*     */     //   327	57	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   327	57	14	invalid$iv	Z
/*     */     //   469	9	18	$i$a$-cache-ScrollbarKt$BaseScrollbar$1	I
/*     */     //   483	11	19	value$iv	Ljava/lang/Object;
/*     */     //   448	52	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   445	55	16	it$iv	Ljava/lang/Object;
/*     */     //   436	66	15	$i$f$cache	I
/*     */     //   433	69	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   433	69	14	invalid$iv	Z
/*     */     //   589	10	21	$i$a$-cache-ScrollbarKt$BaseScrollbar$isExpanded$2	I
/*     */     //   601	11	21	value$iv	Ljava/lang/Object;
/*     */     //   575	43	20	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   572	46	19	it$iv	Ljava/lang/Object;
/*     */     //   563	57	18	$i$f$cache	I
/*     */     //   560	60	16	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   560	60	17	invalid$iv	Z
/*     */     //   703	10	23	$i$a$-cache-ScrollbarKt$BaseScrollbar$showScrollbar$2	I
/*     */     //   715	11	23	value$iv	Ljava/lang/Object;
/*     */     //   689	43	22	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   686	46	21	it$iv	Ljava/lang/Object;
/*     */     //   677	57	20	$i$f$cache	I
/*     */     //   674	60	18	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   674	60	19	invalid$iv	Z
/*     */     //   946	21	26	$i$a$-cache-ScrollbarKt$BaseScrollbar$2	I
/*     */     //   979	11	27	value$iv	Ljava/lang/Object;
/*     */     //   921	75	25	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   918	78	24	it$iv	Ljava/lang/Object;
/*     */     //   909	89	23	$i$f$cache	I
/*     */     //   906	92	21	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   906	92	22	invalid$iv	Z
/*     */     //   1316	29	24	$i$f$getCurrent	I
/*     */     //   1313	32	22	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   1313	32	23	$changed$iv	I
/*     */     //   1400	4	30	$i$a$-cache-ScrollbarKt$BaseScrollbar$3$containerSize$2	I
/*     */     //   1406	11	30	value$iv	Ljava/lang/Object;
/*     */     //   1386	37	29	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1383	40	28	it$iv	Ljava/lang/Object;
/*     */     //   1374	51	27	$i$f$cache	I
/*     */     //   1371	54	25	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1371	54	26	invalid$iv	Z
/*     */     //   1530	3	38	$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1	I
/*     */     //   1527	25	37	$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv	I
/*     */     //   1554	11	38	value$iv$iv	Ljava/lang/Object;
/*     */     //   1513	58	36	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*     */     //   1510	61	35	it$iv$iv	Ljava/lang/Object;
/*     */     //   1501	72	34	$i$f$cache	I
/*     */     //   1498	75	30	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1498	75	33	invalid$iv$iv	Z
/*     */     //   1465	137	28	$i$f$rememberCoroutineScope	I
/*     */     //   1480	122	29	composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1587	15	40	wrapper$iv	Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
/*     */     //   1462	140	27	$changed$iv	I
/*     */     //   1735	21	36	$i$a$-cache-ScrollbarKt$BaseScrollbar$3$sliderAdapter$1	I
/*     */     //   1758	11	37	value$iv	Ljava/lang/Object;
/*     */     //   1716	59	35	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1713	62	34	it$iv	Ljava/lang/Object;
/*     */     //   1704	73	33	$i$f$cache	I
/*     */     //   1701	76	29	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1701	76	30	invalid$iv	Z
/*     */     //   1907	29	40	$i$f$getCurrent	I
/*     */     //   1904	32	38	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   1904	32	39	$changed$iv	I
/*     */     //   1963	8	40	$i$f$minus-5rwHm24	I
/*     */     //   1960	11	38	arg0$iv	F
/*     */     //   1960	11	39	other$iv	F
/*     */     //   1988	8	40	$i$f$minus-5rwHm24	I
/*     */     //   1985	11	38	arg0$iv	F
/*     */     //   1985	11	39	other$iv	F
/*     */     //   1941	55	37	layoutDirection	Landroidx/compose/ui/unit/LayoutDirection;
/*     */     //   2018	8	39	$i$f$minus-5rwHm24	I
/*     */     //   2015	11	37	arg0$iv	F
/*     */     //   2015	11	38	other$iv	F
/*     */     //   2040	8	39	$i$f$minus-5rwHm24	I
/*     */     //   2037	11	37	arg0$iv	F
/*     */     //   2037	11	38	other$iv	F
/*     */     //   2150	14	48	$i$a$-cache-ScrollbarKt$BaseScrollbar$3$measurePolicy$1	I
/*     */     //   2166	11	49	value$iv	Ljava/lang/Object;
/*     */     //   2131	52	47	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2128	55	46	it$iv	Ljava/lang/Object;
/*     */     //   2119	66	45	$i$f$cache	I
/*     */     //   2116	69	39	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2116	69	40	invalid$iv	Z
/*     */     //   2292	14	48	$i$a$-cache-ScrollbarKt$BaseScrollbar$3$measurePolicy$2	I
/*     */     //   2308	11	49	value$iv	Ljava/lang/Object;
/*     */     //   2273	52	47	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2270	55	46	it$iv	Ljava/lang/Object;
/*     */     //   2261	66	45	$i$f$cache	I
/*     */     //   2258	69	39	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2258	69	40	invalid$iv	Z
/*     */     //   2465	13	47	$i$a$-thenIf-ScrollbarKt$BaseScrollbar$3$2	I
/*     */     //   2462	16	46	$this$BaseScrollbar_u24lambda_u2430_u24lambda_u2428	Landroidx/compose/ui/Modifier;
/*     */     //   2453	30	45	$i$f$thenIf	I
/*     */     //   2450	33	39	$this$thenIf$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2450	33	40	precondition$iv	Z
/*     */     //   2557	15	47	$i$a$-thenIf-ScrollbarKt$BaseScrollbar$3$3	I
/*     */     //   2554	18	46	$this$BaseScrollbar_u24lambda_u2430_u24lambda_u2429	Landroidx/compose/ui/Modifier;
/*     */     //   2545	32	45	$i$f$thenIf	I
/*     */     //   2542	35	39	$this$thenIf$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2542	35	40	precondition$iv	Z
/*     */     //   2855	52	60	$i$a$-Layout-ScrollbarKt$BaseScrollbar$3$1	I
/*     */     //   2852	55	59	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   2852	55	58	$changed	I
/*     */     //   2766	55	57	$i$a$-with-Updater$set$1$iv$iv	I
/*     */     //   2763	58	56	$this$set_impl_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2759	64	55	$i$f$set-impl	I
/*     */     //   2756	67	54	block$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   2722	115	53	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv	I
/*     */     //   2719	118	52	$this$Layout_u24lambda_u240$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2649	271	51	$i$f$ReusableComposeNode	I
/*     */     //   2646	274	49	factory$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   2646	274	50	$changed$iv$iv	I
/*     */     //   2586	340	45	$i$f$Layout	I
/*     */     //   2605	321	46	compositeKeyHash$iv	I
/*     */     //   2614	312	47	localMap$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2623	303	48	materialized$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2583	343	39	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2583	343	40	$changed$iv	I
/*     */     //   1353	1574	24	$i$a$-with-ScrollbarKt$BaseScrollbar$3	I
/*     */     //   1441	1486	32	containerSize$delegate	Landroidx/compose/runtime/MutableIntState;
/*     */     //   1458	1469	31	thumbMinHeight	F
/*     */     //   1604	1323	25	coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   1793	1134	26	sliderAdapter	Lorg/jetbrains/jewel/ui/component/SliderAdapter;
/*     */     //   1814	1113	41	thumbBackgroundColor	J
/*     */     //   1835	1092	43	thumbBorderColor	J
/*     */     //   1852	1075	33	hasVisibleBorder	Z
/*     */     //   1876	1051	34	trackPadding	Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   2066	861	35	thumbThicknessPx	I
/*     */     //   2354	573	36	measurePolicy	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2376	551	37	canScroll	Z
/*     */     //   2419	508	38	trackBackground$delegate	Landroidx/compose/runtime/State;
/*     */     //   1350	1577	23	$this$BaseScrollbar_u24lambda_u2430	Landroidx/compose/ui/unit/Density;
/*     */     //   400	2540	11	dragInteraction	Landroidx/compose/runtime/MutableState;
/*     */     //   536	2404	12	visibilityStyle	Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;
/*     */     //   543	2397	13	isOpaque	Z
/*     */     //   636	2304	14	isExpanded$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   656	2284	15	isHovered$delegate	Landroidx/compose/runtime/State;
/*     */     //   750	2190	16	showScrollbar$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   767	2173	17	isDragging	Z
/*     */     //   788	2152	18	isScrolling	Z
/*     */     //   818	2122	19	isActive	Z
/*     */     //   1082	1858	20	animatedThickness$delegate	Landroidx/compose/runtime/State;
/*     */     //   1302	1638	21	adapter	Landroidx/compose/foundation/v2/ScrollbarAdapter;
/*     */     //   15	2975	10	$dirty	I
/*     */     //   0	2990	0	scrollState	Landroidx/compose/foundation/gestures/ScrollableState;
/*     */     //   0	2990	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	2990	2	reverseLayout	Z
/*     */     //   0	2990	3	enabled	Z
/*     */     //   0	2990	4	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	2990	5	isVertical	Z
/*     */     //   0	2990	6	style	Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*     */     //   0	2990	7	keepVisible	Z
/*     */     //   0	2990	8	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	2990	9	$changed	I
/*     */   }
/*     */   
/*     */   private static final DisposableEffectResult BaseScrollbar$lambda$8$lambda$7(MutableState $dragInteraction, MutableInteractionSource $interactionSource, DisposableEffectScope $this$DisposableEffect) {
/* 139 */     Intrinsics.checkNotNullParameter($this$DisposableEffect, "$this$DisposableEffect"); DisposableEffectScope this_$iv = $this$DisposableEffect; int $i$f$onDispose = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 144 */     return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 845 */       new ScrollbarKt$BaseScrollbar$lambda$8$lambda$7$$inlined$onDispose$1($dragInteraction, $interactionSource);
/*     */   } private static final boolean BaseScrollbar$lambda$10(MutableState $isExpanded$delegate) { State state = (State)$isExpanded$delegate;
/*     */     Object object = null;
/*     */     KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 850 */     return ((Boolean)state.getValue()).booleanValue(); } private static final void BaseScrollbar$lambda$11(MutableState $isExpanded$delegate, boolean <set-?>) { MutableState mutableState = $isExpanded$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 851 */     mutableState.setValue(value$iv); } private static final boolean BaseScrollbar$lambda$12(State $isHovered$delegate) { State state = $isHovered$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 853 */     return ((Boolean)state.getValue()).booleanValue(); } private static final boolean BaseScrollbar$lambda$14(MutableState $showScrollbar$delegate) { State state = (State)$showScrollbar$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 854 */     return ((Boolean)state.getValue()).booleanValue(); } private static final void BaseScrollbar$lambda$15(MutableState $showScrollbar$delegate, boolean <set-?>) { MutableState mutableState = $showScrollbar$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 855 */     mutableState.setValue(value$iv); } private static final float BaseScrollbar$lambda$17(State $animatedThickness$delegate) { State state = $animatedThickness$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 857 */     return ((Dp)state.getValue()).unbox-impl(); } @DebugMetadata(f = "Scrollbar.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.ScrollbarKt$BaseScrollbar$2$1") @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class ScrollbarKt$BaseScrollbar$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/* 858 */     int label; ScrollbarKt$BaseScrollbar$2$1(boolean $isActive, MutableState<Boolean> $showScrollbar$delegate, State<Boolean> $isHovered$delegate, ScrollbarVisibility $visibilityStyle, MutableState<Boolean> $isExpanded$delegate, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { CoroutineScope $this$LaunchedEffect; boolean isVisibleAndHovered; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$LaunchedEffect = (CoroutineScope)this.L$0; isVisibleAndHovered = (ScrollbarKt.BaseScrollbar$lambda$14(this.$showScrollbar$delegate) && ScrollbarKt.BaseScrollbar$lambda$12(this.$isHovered$delegate)); if (this.$isActive || isVisibleAndHovered) { ScrollbarKt.BaseScrollbar$lambda$15(this.$showScrollbar$delegate, true); } else { BuildersKt.launch$default($this$LaunchedEffect, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$visibilityStyle, this.$showScrollbar$delegate, this.$isExpanded$delegate, null) { int label; public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (DelayKt.delay-VtjQ1oo(this.$visibilityStyle.getLingerDuration-UwyO8pc(), (Continuation)this) == object) return object;  DelayKt.delay-VtjQ1oo(this.$visibilityStyle.getLingerDuration-UwyO8pc(), (Continuation)this); ScrollbarKt.BaseScrollbar$lambda$15(this.$showScrollbar$delegate, false); ScrollbarKt.BaseScrollbar$lambda$11(this.$isExpanded$delegate, false); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); ScrollbarKt.BaseScrollbar$lambda$15(this.$showScrollbar$delegate, false); ScrollbarKt.BaseScrollbar$lambda$11(this.$isExpanded$delegate, false); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$visibilityStyle, this.$showScrollbar$delegate, this.$isExpanded$delegate, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }3, null); }  return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super ScrollbarKt$BaseScrollbar$2$1> $completion) { ScrollbarKt$BaseScrollbar$2$1 scrollbarKt$BaseScrollbar$2$1 = new ScrollbarKt$BaseScrollbar$2$1(this.$isActive, this.$showScrollbar$delegate, this.$isHovered$delegate, this.$visibilityStyle, this.$isExpanded$delegate, $completion); scrollbarKt$BaseScrollbar$2$1.L$0 = value; return (Continuation<Unit>)scrollbarKt$BaseScrollbar$2$1; } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((ScrollbarKt$BaseScrollbar$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } private static final int BaseScrollbar$lambda$30$lambda$19(MutableIntState $containerSize$delegate) { IntState intState = (IntState)$containerSize$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return intState.getIntValue(); } private static final void BaseScrollbar$lambda$30$lambda$20(MutableIntState $containerSize$delegate, int <set-?>) { MutableIntState mutableIntState = $containerSize$delegate; Object object = null; KProperty property$iv = null; int $i$f$setValue = 0;
/* 859 */     mutableIntState.setIntValue(<set-?>); } private static final Unit BaseScrollbar$lambda$30$lambda$23$lambda$22(MutableIntState $containerSize$delegate, int it) { BaseScrollbar$lambda$30$lambda$20($containerSize$delegate, it); return Unit.INSTANCE; }
/*     */   private static final Unit BaseScrollbar$lambda$30$lambda$25$lambda$24(MutableIntState $containerSize$delegate, int it) { BaseScrollbar$lambda$30$lambda$20($containerSize$delegate, it); return Unit.INSTANCE; }
/* 861 */   private static final long BaseScrollbar$lambda$30$lambda$26(State $trackBackground$delegate) { State state = $trackBackground$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Color)state.getValue()).unbox-impl(); } private static final long getTrackColor(boolean isOpaque, boolean isDragging, boolean isHovered, ScrollbarStyle style, boolean isExpanded) { return isOpaque ? ((isHovered || isDragging) ? style.getColors().getTrackOpaqueBackgroundHovered-0d7_KjU() : style.getColors().getTrackOpaqueBackground-0d7_KjU()) : (isExpanded ? style.getColors().getTrackBackgroundExpanded-0d7_KjU() : style.getColors().getTrackBackground-0d7_KjU()); } private static final long getThumbBackgroundColor(boolean isOpaque, boolean isHovered, boolean isScrolling, ScrollbarStyle style, boolean showScrollbar) { return isOpaque ? ((isHovered || isScrolling) ? style.getColors().getThumbOpaqueBackgroundHovered-0d7_KjU() : style.getColors().getThumbOpaqueBackground-0d7_KjU()) : (showScrollbar ? style.getColors().getThumbBackgroundActive-0d7_KjU() : style.getColors().getThumbBackground-0d7_KjU()); } private static final long getThumbBorderColor(boolean isOpaque, boolean isHovered, boolean isScrolling, ScrollbarStyle style, boolean showScrollbar) { return isOpaque ? ((isHovered || isScrolling) ? style.getColors().getThumbOpaqueBorderHovered-0d7_KjU() : style.getColors().getThumbOpaqueBorder-0d7_KjU()) : (showScrollbar ? style.getColors().getThumbBorderActive-0d7_KjU() : style.getColors().getThumbBorder-0d7_KjU()); } private static final boolean areTheSameColor--OWjLjI(long first, long second) { return (ColorKt.toArgb-8_81llA(first) == ColorKt.toArgb-8_81llA(second)); } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") private static final void Thumb-KjnZka4(boolean showScrollbar, ScrollbarVisibility visibilityStyle, boolean canScroll, boolean enabled, MutableInteractionSource interactionSource, MutableState dragInteraction, SliderAdapter sliderAdapter, long thumbBackgroundColor, long thumbBorderColor, boolean hasVisibleBorder, CornerSize cornerSize, Composer $composer, int $changed, int $changed1) { // Byte code:
/*     */     //   0: aload #13
/*     */     //   2: ldc_w -323462708
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #13
/*     */     //   12: iload #14
/*     */     //   14: istore #16
/*     */     //   16: iload #15
/*     */     //   18: istore #17
/*     */     //   20: iload #14
/*     */     //   22: bipush #6
/*     */     //   24: iand
/*     */     //   25: ifne -> 49
/*     */     //   28: iload #16
/*     */     //   30: aload #13
/*     */     //   32: iload_0
/*     */     //   33: invokeinterface changed : (Z)Z
/*     */     //   38: ifeq -> 45
/*     */     //   41: iconst_4
/*     */     //   42: goto -> 46
/*     */     //   45: iconst_2
/*     */     //   46: ior
/*     */     //   47: istore #16
/*     */     //   49: iload #14
/*     */     //   51: bipush #48
/*     */     //   53: iand
/*     */     //   54: ifne -> 99
/*     */     //   57: iload #16
/*     */     //   59: iload #14
/*     */     //   61: bipush #64
/*     */     //   63: iand
/*     */     //   64: ifne -> 78
/*     */     //   67: aload #13
/*     */     //   69: aload_1
/*     */     //   70: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   75: goto -> 86
/*     */     //   78: aload #13
/*     */     //   80: aload_1
/*     */     //   81: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   86: ifeq -> 94
/*     */     //   89: bipush #32
/*     */     //   91: goto -> 96
/*     */     //   94: bipush #16
/*     */     //   96: ior
/*     */     //   97: istore #16
/*     */     //   99: iload #14
/*     */     //   101: sipush #384
/*     */     //   104: iand
/*     */     //   105: ifne -> 133
/*     */     //   108: iload #16
/*     */     //   110: aload #13
/*     */     //   112: iload_2
/*     */     //   113: invokeinterface changed : (Z)Z
/*     */     //   118: ifeq -> 127
/*     */     //   121: sipush #256
/*     */     //   124: goto -> 130
/*     */     //   127: sipush #128
/*     */     //   130: ior
/*     */     //   131: istore #16
/*     */     //   133: iload #14
/*     */     //   135: sipush #3072
/*     */     //   138: iand
/*     */     //   139: ifne -> 167
/*     */     //   142: iload #16
/*     */     //   144: aload #13
/*     */     //   146: iload_3
/*     */     //   147: invokeinterface changed : (Z)Z
/*     */     //   152: ifeq -> 161
/*     */     //   155: sipush #2048
/*     */     //   158: goto -> 164
/*     */     //   161: sipush #1024
/*     */     //   164: ior
/*     */     //   165: istore #16
/*     */     //   167: iload #14
/*     */     //   169: sipush #24576
/*     */     //   172: iand
/*     */     //   173: ifne -> 202
/*     */     //   176: iload #16
/*     */     //   178: aload #13
/*     */     //   180: aload #4
/*     */     //   182: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   187: ifeq -> 196
/*     */     //   190: sipush #16384
/*     */     //   193: goto -> 199
/*     */     //   196: sipush #8192
/*     */     //   199: ior
/*     */     //   200: istore #16
/*     */     //   202: iload #14
/*     */     //   204: ldc 196608
/*     */     //   206: iand
/*     */     //   207: ifne -> 234
/*     */     //   210: iload #16
/*     */     //   212: aload #13
/*     */     //   214: aload #5
/*     */     //   216: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   221: ifeq -> 229
/*     */     //   224: ldc 131072
/*     */     //   226: goto -> 231
/*     */     //   229: ldc 65536
/*     */     //   231: ior
/*     */     //   232: istore #16
/*     */     //   234: iload #14
/*     */     //   236: ldc 1572864
/*     */     //   238: iand
/*     */     //   239: ifne -> 266
/*     */     //   242: iload #16
/*     */     //   244: aload #13
/*     */     //   246: aload #6
/*     */     //   248: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   253: ifeq -> 261
/*     */     //   256: ldc 1048576
/*     */     //   258: goto -> 263
/*     */     //   261: ldc 524288
/*     */     //   263: ior
/*     */     //   264: istore #16
/*     */     //   266: iload #14
/*     */     //   268: ldc 12582912
/*     */     //   270: iand
/*     */     //   271: ifne -> 298
/*     */     //   274: iload #16
/*     */     //   276: aload #13
/*     */     //   278: lload #7
/*     */     //   280: invokeinterface changed : (J)Z
/*     */     //   285: ifeq -> 293
/*     */     //   288: ldc 8388608
/*     */     //   290: goto -> 295
/*     */     //   293: ldc 4194304
/*     */     //   295: ior
/*     */     //   296: istore #16
/*     */     //   298: iload #14
/*     */     //   300: ldc_w 100663296
/*     */     //   303: iand
/*     */     //   304: ifne -> 333
/*     */     //   307: iload #16
/*     */     //   309: aload #13
/*     */     //   311: lload #9
/*     */     //   313: invokeinterface changed : (J)Z
/*     */     //   318: ifeq -> 327
/*     */     //   321: ldc_w 67108864
/*     */     //   324: goto -> 330
/*     */     //   327: ldc_w 33554432
/*     */     //   330: ior
/*     */     //   331: istore #16
/*     */     //   333: iload #14
/*     */     //   335: ldc_w 805306368
/*     */     //   338: iand
/*     */     //   339: ifne -> 368
/*     */     //   342: iload #16
/*     */     //   344: aload #13
/*     */     //   346: iload #11
/*     */     //   348: invokeinterface changed : (Z)Z
/*     */     //   353: ifeq -> 362
/*     */     //   356: ldc_w 536870912
/*     */     //   359: goto -> 365
/*     */     //   362: ldc_w 268435456
/*     */     //   365: ior
/*     */     //   366: istore #16
/*     */     //   368: iload #15
/*     */     //   370: bipush #6
/*     */     //   372: iand
/*     */     //   373: ifne -> 398
/*     */     //   376: iload #17
/*     */     //   378: aload #13
/*     */     //   380: aload #12
/*     */     //   382: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   387: ifeq -> 394
/*     */     //   390: iconst_4
/*     */     //   391: goto -> 395
/*     */     //   394: iconst_2
/*     */     //   395: ior
/*     */     //   396: istore #17
/*     */     //   398: iload #16
/*     */     //   400: ldc_w 306783379
/*     */     //   403: iand
/*     */     //   404: ldc_w 306783378
/*     */     //   407: if_icmpne -> 428
/*     */     //   410: iload #17
/*     */     //   412: iconst_3
/*     */     //   413: iand
/*     */     //   414: iconst_2
/*     */     //   415: if_icmpne -> 428
/*     */     //   418: aload #13
/*     */     //   420: invokeinterface getSkipping : ()Z
/*     */     //   425: ifne -> 687
/*     */     //   428: invokestatic isTraceInProgress : ()Z
/*     */     //   431: ifeq -> 447
/*     */     //   434: ldc_w -323462708
/*     */     //   437: iload #16
/*     */     //   439: iload #17
/*     */     //   441: ldc_w 'org.jetbrains.jewel.ui.component.Thumb (Scrollbar.kt:347)'
/*     */     //   444: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   447: lload #7
/*     */     //   449: iload_0
/*     */     //   450: aload_1
/*     */     //   451: invokestatic thumbColorTween : (ZLorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;)Landroidx/compose/animation/core/TweenSpec;
/*     */     //   454: checkcast androidx/compose/animation/core/AnimationSpec
/*     */     //   457: ldc_w 'scrollbar_thumbBackground'
/*     */     //   460: aconst_null
/*     */     //   461: aload #13
/*     */     //   463: sipush #384
/*     */     //   466: bipush #14
/*     */     //   468: iload #16
/*     */     //   470: bipush #21
/*     */     //   472: ishr
/*     */     //   473: iand
/*     */     //   474: ior
/*     */     //   475: bipush #8
/*     */     //   477: invokestatic animateColorAsState-euL9pac : (JLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*     */     //   480: astore #18
/*     */     //   482: lload #9
/*     */     //   484: iload_0
/*     */     //   485: aload_1
/*     */     //   486: invokestatic thumbColorTween : (ZLorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;)Landroidx/compose/animation/core/TweenSpec;
/*     */     //   489: checkcast androidx/compose/animation/core/AnimationSpec
/*     */     //   492: ldc_w 'scrollbar_thumbBorder'
/*     */     //   495: aconst_null
/*     */     //   496: aload #13
/*     */     //   498: sipush #384
/*     */     //   501: bipush #14
/*     */     //   503: iload #16
/*     */     //   505: bipush #24
/*     */     //   507: ishr
/*     */     //   508: iand
/*     */     //   509: ior
/*     */     //   510: bipush #8
/*     */     //   512: invokestatic animateColorAsState-euL9pac : (JLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*     */     //   515: astore #19
/*     */     //   517: iconst_1
/*     */     //   518: istore #21
/*     */     //   520: iconst_0
/*     */     //   521: istore #22
/*     */     //   523: iload #21
/*     */     //   525: i2f
/*     */     //   526: invokestatic constructor-impl : (F)F
/*     */     //   529: fstore #20
/*     */     //   531: invokestatic getLocalDensity : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   534: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   537: astore #22
/*     */     //   539: iconst_0
/*     */     //   540: istore #23
/*     */     //   542: iconst_0
/*     */     //   543: istore #24
/*     */     //   545: aload #13
/*     */     //   547: ldc_w 2023513938
/*     */     //   550: ldc_w 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   553: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   556: aload #13
/*     */     //   558: aload #22
/*     */     //   560: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   565: astore #25
/*     */     //   567: aload #13
/*     */     //   569: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   572: aload #25
/*     */     //   574: checkcast androidx/compose/ui/unit/Density
/*     */     //   577: astore #21
/*     */     //   579: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   582: checkcast androidx/compose/ui/Modifier
/*     */     //   585: ldc_w 'thumb'
/*     */     //   588: invokestatic layoutId : (Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   591: astore #22
/*     */     //   593: nop
/*     */     //   594: iconst_0
/*     */     //   595: istore #23
/*     */     //   597: iload_2
/*     */     //   598: ifeq -> 634
/*     */     //   601: aload #22
/*     */     //   603: astore #24
/*     */     //   605: iconst_0
/*     */     //   606: istore #25
/*     */     //   608: aload #24
/*     */     //   610: aload #18
/*     */     //   612: invokestatic Thumb_KjnZka4$lambda$32 : (Landroidx/compose/runtime/State;)J
/*     */     //   615: fload #20
/*     */     //   617: aload #19
/*     */     //   619: invokestatic Thumb_KjnZka4$lambda$33 : (Landroidx/compose/runtime/State;)J
/*     */     //   622: iload #11
/*     */     //   624: aload #12
/*     */     //   626: aload #21
/*     */     //   628: invokestatic drawThumb-tAjK0ZQ : (Landroidx/compose/ui/Modifier;JFJZLandroidx/compose/foundation/shape/CornerSize;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/Modifier;
/*     */     //   631: goto -> 636
/*     */     //   634: aload #22
/*     */     //   636: astore #22
/*     */     //   638: nop
/*     */     //   639: iconst_0
/*     */     //   640: istore #23
/*     */     //   642: iload_3
/*     */     //   643: ifeq -> 667
/*     */     //   646: aload #22
/*     */     //   648: astore #24
/*     */     //   650: iconst_0
/*     */     //   651: istore #25
/*     */     //   653: aload #24
/*     */     //   655: aload #4
/*     */     //   657: aload #5
/*     */     //   659: aload #6
/*     */     //   661: invokestatic scrollbarDrag : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Lorg/jetbrains/jewel/ui/component/SliderAdapter;)Landroidx/compose/ui/Modifier;
/*     */     //   664: goto -> 669
/*     */     //   667: aload #22
/*     */     //   669: aload #13
/*     */     //   671: iconst_0
/*     */     //   672: invokestatic Box : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   675: invokestatic isTraceInProgress : ()Z
/*     */     //   678: ifeq -> 694
/*     */     //   681: invokestatic traceEventEnd : ()V
/*     */     //   684: goto -> 694
/*     */     //   687: aload #13
/*     */     //   689: invokeinterface skipToGroupEnd : ()V
/*     */     //   694: aload #13
/*     */     //   696: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   701: dup
/*     */     //   702: ifnull -> 740
/*     */     //   705: iload_0
/*     */     //   706: aload_1
/*     */     //   707: iload_2
/*     */     //   708: iload_3
/*     */     //   709: aload #4
/*     */     //   711: aload #5
/*     */     //   713: aload #6
/*     */     //   715: lload #7
/*     */     //   717: lload #9
/*     */     //   719: iload #11
/*     */     //   721: aload #12
/*     */     //   723: iload #14
/*     */     //   725: iload #15
/*     */     //   727: <illegal opcode> invoke : (ZLorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Lorg/jetbrains/jewel/ui/component/SliderAdapter;JJZLandroidx/compose/foundation/shape/CornerSize;II)Lkotlin/jvm/functions/Function2;
/*     */     //   732: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   737: goto -> 741
/*     */     //   740: pop
/*     */     //   741: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #348	-> 0
/*     */     //   #351	-> 447
/*     */     //   #352	-> 449
/*     */     //   #353	-> 457
/*     */     //   #350	-> 477
/*     */     //   #349	-> 480
/*     */     //   #358	-> 482
/*     */     //   #359	-> 484
/*     */     //   #360	-> 492
/*     */     //   #357	-> 512
/*     */     //   #356	-> 515
/*     */     //   #363	-> 517
/*     */     //   #841	-> 523
/*     */     //   #363	-> 529
/*     */     //   #364	-> 531
/*     */     //   #842	-> 553
/*     */     //   #364	-> 574
/*     */     //   #366	-> 579
/*     */     //   #367	-> 593
/*     */     //   #843	-> 597
/*     */     //   #367	-> 608
/*     */     //   #843	-> 631
/*     */     //   #368	-> 638
/*     */     //   #844	-> 642
/*     */     //   #368	-> 653
/*     */     //   #844	-> 664
/*     */     //   #365	-> 672
/*     */     //   #370	-> 687
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   523	6	22	$i$f$getDp	I
/*     */     //   520	9	21	$this$dp$iv	I
/*     */     //   545	29	24	$i$f$getCurrent	I
/*     */     //   542	32	22	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   542	32	23	$changed$iv	I
/*     */     //   608	23	25	$i$a$-thenIf-ScrollbarKt$Thumb$1	I
/*     */     //   605	26	24	$this$Thumb_KjnZka4_u24lambda_u2434	Landroidx/compose/ui/Modifier;
/*     */     //   597	39	23	$i$f$thenIf	I
/*     */     //   594	42	22	$this$thenIf$iv	Landroidx/compose/ui/Modifier;
/*     */     //   653	11	25	$i$a$-thenIf-ScrollbarKt$Thumb$2	I
/*     */     //   650	14	24	$this$Thumb_KjnZka4_u24lambda_u2435	Landroidx/compose/ui/Modifier;
/*     */     //   642	27	23	$i$f$thenIf	I
/*     */     //   639	30	22	$this$thenIf$iv	Landroidx/compose/ui/Modifier;
/*     */     //   482	202	18	background$delegate	Landroidx/compose/runtime/State;
/*     */     //   517	167	19	border$delegate	Landroidx/compose/runtime/State;
/*     */     //   531	153	20	borderWidth	F
/*     */     //   579	105	21	density	Landroidx/compose/ui/unit/Density;
/*     */     //   16	726	16	$dirty	I
/*     */     //   20	722	17	$dirty1	I
/*     */     //   0	742	0	showScrollbar	Z
/*     */     //   0	742	1	visibilityStyle	Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;
/*     */     //   0	742	2	canScroll	Z
/*     */     //   0	742	3	enabled	Z
/*     */     //   0	742	4	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	742	5	dragInteraction	Landroidx/compose/runtime/MutableState;
/*     */     //   0	742	6	sliderAdapter	Lorg/jetbrains/jewel/ui/component/SliderAdapter;
/*     */     //   0	742	7	thumbBackgroundColor	J
/*     */     //   0	742	9	thumbBorderColor	J
/*     */     //   0	742	11	hasVisibleBorder	Z
/*     */     //   0	742	12	cornerSize	Landroidx/compose/foundation/shape/CornerSize;
/*     */     //   0	742	13	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	742	14	$changed	I
/*     */     //   0	742	15	$changed1	I }
/* 862 */   private static final long Thumb_KjnZka4$lambda$32(State $background$delegate) { State state = $background$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Color)state.getValue()).unbox-impl(); } private static final long Thumb_KjnZka4$lambda$33(State $border$delegate) { State state = $border$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 863 */     return ((Color)state.getValue()).unbox-impl(); }
/*     */ 
/*     */   
/*     */   private static final Modifier drawThumb-tAjK0ZQ(Modifier $this$drawThumb_u2dtAjK0ZQ, long backgroundColor, float borderWidth, long borderColor, boolean hasVisibleBorder, CornerSize cornerSize, Density density) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: iload #6
/*     */     //   3: fload_3
/*     */     //   4: aload #7
/*     */     //   6: aload #8
/*     */     //   8: lload_1
/*     */     //   9: lload #4
/*     */     //   11: <illegal opcode> invoke : (ZFLandroidx/compose/foundation/shape/CornerSize;Landroidx/compose/ui/unit/Density;JJ)Lkotlin/jvm/functions/Function1;
/*     */     //   16: invokestatic drawBehind : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   19: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #379	-> 0
/*     */     //   #402	-> 19
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	20	0	$this$drawThumb_u2dtAjK0ZQ	Landroidx/compose/ui/Modifier;
/*     */     //   0	20	1	backgroundColor	J
/*     */     //   0	20	3	borderWidth	F
/*     */     //   0	20	4	borderColor	J
/*     */     //   0	20	6	hasVisibleBorder	Z
/*     */     //   0	20	7	cornerSize	Landroidx/compose/foundation/shape/CornerSize;
/*     */     //   0	20	8	density	Landroidx/compose/ui/unit/Density;
/*     */   }
/*     */   
/*     */   private static final Unit drawThumb_tAjK0ZQ$lambda$37(boolean $hasVisibleBorder, float $borderWidth, CornerSize $cornerSize, Density $density, long $backgroundColor, long $borderColor, DrawScope $this$drawBehind) {
/*     */     Intrinsics.checkNotNullParameter($this$drawBehind, "$this$drawBehind");
/*     */     float borderWidthPx = $hasVisibleBorder ? $this$drawBehind.toPx-0680j_4($borderWidth) : 0.0F;
/*     */     long bgCornerRadius = CornerRadiusKt.CornerRadius$default(RangesKt.coerceAtLeast($cornerSize.toPx-TmRCtEA($this$drawBehind.getSize-NH-jbRc(), $density) - borderWidthPx * 2, 0.0F), 0.0F, 2, null);
/*     */     DrawScope.drawRoundRect-u-Aw5IA$default($this$drawBehind, $backgroundColor, OffsetKt.Offset(borderWidthPx, borderWidthPx), SizeKt.Size(Size.getWidth-impl($this$drawBehind.getSize-NH-jbRc()) - borderWidthPx * 2, Size.getHeight-impl($this$drawBehind.getSize-NH-jbRc()) - borderWidthPx * 2.0F), bgCornerRadius, null, 0.0F, null, 0, 240, null);
/*     */     if ($hasVisibleBorder) {
/*     */       long strokeCornerRadius = CornerRadiusKt.CornerRadius$default($cornerSize.toPx-TmRCtEA($this$drawBehind.getSize-NH-jbRc(), $density), 0.0F, 2, null);
/*     */       DrawScope.drawRoundRect-u-Aw5IA$default($this$drawBehind, $borderColor, OffsetKt.Offset(borderWidthPx / 2, borderWidthPx / 2), SizeKt.Size(Size.getWidth-impl($this$drawBehind.getSize-NH-jbRc()) - borderWidthPx, Size.getHeight-impl($this$drawBehind.getSize-NH-jbRc()) - borderWidthPx), strokeCornerRadius, (DrawStyle)new Stroke(borderWidthPx, 0.0F, 0, 0, null, 30, null), 0.0F, null, 0, 224, null);
/*     */     } 
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final TweenSpec<Color> trackColorTween(ScrollbarVisibility visibility) {
/*     */     return AnimationSpecKt.tween$default((int)Duration.getInWholeMilliseconds-impl(visibility.getTrackColorAnimationDuration-UwyO8pc()), 0, EasingKt.getLinearEasing(), 2, null);
/*     */   }
/*     */   
/*     */   private static final TweenSpec<Color> thumbColorTween(boolean showScrollbar, ScrollbarVisibility visibility) {
/*     */     return AnimationSpecKt.tween((visibility instanceof ScrollbarVisibility.AlwaysVisible || !showScrollbar) ? (int)Duration.getInWholeMilliseconds-impl(visibility.getThumbColorAnimationDuration-UwyO8pc()) : 0, (visibility instanceof ScrollbarVisibility.AlwaysVisible && !showScrollbar) ? (int)Duration.getInWholeMilliseconds-impl(((ScrollbarVisibility.AlwaysVisible)visibility).getLingerDuration-UwyO8pc()) : 0, EasingKt.getLinearEasing());
/*     */   }
/*     */   
/*     */   private static final IntRange getThumbPixelRange(SliderAdapter $this$thumbPixelRange) {
/*     */     int start = MathKt.roundToInt($this$thumbPixelRange.getPosition());
/*     */     int endExclusive = start + MathKt.roundToInt($this$thumbPixelRange.getThumbSize());
/*     */     return RangesKt.until(start, endExclusive);
/*     */   }
/*     */   
/*     */   private static final int getSize(IntRange $this$size) {
/*     */     return $this$size.getLast() + 1 - $this$size.getFirst();
/*     */   }
/*     */   
/*     */   private static final MeasurePolicy verticalMeasurePolicy(SliderAdapter sliderAdapter, Function1<? super Integer, Unit> setContainerSize, int thumbThickness) {
/*     */     return new ScrollbarKt$verticalMeasurePolicy$1(setContainerSize, sliderAdapter, thumbThickness);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class ScrollbarKt$verticalMeasurePolicy$1 implements MeasurePolicy {
/*     */     ScrollbarKt$verticalMeasurePolicy$1(Function1<Integer, Unit> $setContainerSize, SliderAdapter $sliderAdapter, int $thumbThickness) {}
/*     */     
/*     */     public final MeasureResult measure-3p2s80s(MeasureScope $this$MeasurePolicy, List measurables, long constraints) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$MeasurePolicy'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_2
/*     */       //   7: ldc 'measurables'
/*     */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   12: aload_0
/*     */       //   13: getfield $setContainerSize : Lkotlin/jvm/functions/Function1;
/*     */       //   16: lload_3
/*     */       //   17: invokestatic getMaxHeight-impl : (J)I
/*     */       //   20: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   23: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   28: pop
/*     */       //   29: aload_0
/*     */       //   30: getfield $sliderAdapter : Lorg/jetbrains/jewel/ui/component/SliderAdapter;
/*     */       //   33: invokestatic access$getThumbPixelRange : (Lorg/jetbrains/jewel/ui/component/SliderAdapter;)Lkotlin/ranges/IntRange;
/*     */       //   36: astore #5
/*     */       //   38: aload_2
/*     */       //   39: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */       //   42: checkcast androidx/compose/ui/layout/Measurable
/*     */       //   45: getstatic androidx/compose/ui/unit/Constraints.Companion : Landroidx/compose/ui/unit/Constraints$Companion;
/*     */       //   48: lload_3
/*     */       //   49: aload_0
/*     */       //   50: getfield $thumbThickness : I
/*     */       //   53: invokestatic constrainWidth-K40F9xA : (JI)I
/*     */       //   56: aload #5
/*     */       //   58: invokestatic access$getSize : (Lkotlin/ranges/IntRange;)I
/*     */       //   61: invokevirtual fixed-JhjzzOo : (II)J
/*     */       //   64: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */       //   69: astore #6
/*     */       //   71: aload_1
/*     */       //   72: aload #6
/*     */       //   74: invokevirtual getWidth : ()I
/*     */       //   77: lload_3
/*     */       //   78: invokestatic getMaxHeight-impl : (J)I
/*     */       //   81: aconst_null
/*     */       //   82: aload #6
/*     */       //   84: aload #5
/*     */       //   86: <illegal opcode> invoke : (Landroidx/compose/ui/layout/Placeable;Lkotlin/ranges/IntRange;)Lkotlin/jvm/functions/Function1;
/*     */       //   91: iconst_4
/*     */       //   92: aconst_null
/*     */       //   93: invokestatic layout$default : (Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;
/*     */       //   96: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #438	-> 12
/*     */       //   #439	-> 29
/*     */       //   #441	-> 38
/*     */       //   #440	-> 69
/*     */       //   #442	-> 71
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   38	59	5	pixelRange	Lkotlin/ranges/IntRange;
/*     */       //   71	26	6	placeable	Landroidx/compose/ui/layout/Placeable;
/*     */       //   0	97	0	this	Lorg/jetbrains/jewel/ui/component/ScrollbarKt$verticalMeasurePolicy$1;
/*     */       //   0	97	1	$this$MeasurePolicy	Landroidx/compose/ui/layout/MeasureScope;
/*     */       //   0	97	2	measurables	Ljava/util/List;
/*     */       //   0	97	3	constraints	J
/*     */     }
/*     */     
/*     */     private static final Unit measure_3p2s80s$lambda$0(Placeable $placeable, IntRange $pixelRange, Placeable.PlacementScope $this$layout) {
/*     */       Intrinsics.checkNotNullParameter($this$layout, "$this$layout");
/*     */       Placeable.PlacementScope.place$default($this$layout, $placeable, 0, $pixelRange.getFirst(), 0.0F, 4, null);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   private static final MeasurePolicy horizontalMeasurePolicy(SliderAdapter sliderAdapter, Function1<? super Integer, Unit> setContainerSize, int thumbThickness) {
/*     */     return new ScrollbarKt$horizontalMeasurePolicy$1(setContainerSize, sliderAdapter, thumbThickness);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class ScrollbarKt$horizontalMeasurePolicy$1 implements MeasurePolicy {
/*     */     ScrollbarKt$horizontalMeasurePolicy$1(Function1<Integer, Unit> $setContainerSize, SliderAdapter $sliderAdapter, int $thumbThickness) {}
/*     */     
/*     */     public final MeasureResult measure-3p2s80s(MeasureScope $this$MeasurePolicy, List measurables, long constraints) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$MeasurePolicy'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_2
/*     */       //   7: ldc 'measurables'
/*     */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   12: aload_0
/*     */       //   13: getfield $setContainerSize : Lkotlin/jvm/functions/Function1;
/*     */       //   16: lload_3
/*     */       //   17: invokestatic getMaxWidth-impl : (J)I
/*     */       //   20: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   23: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   28: pop
/*     */       //   29: aload_0
/*     */       //   30: getfield $sliderAdapter : Lorg/jetbrains/jewel/ui/component/SliderAdapter;
/*     */       //   33: invokestatic access$getThumbPixelRange : (Lorg/jetbrains/jewel/ui/component/SliderAdapter;)Lkotlin/ranges/IntRange;
/*     */       //   36: astore #5
/*     */       //   38: aload_2
/*     */       //   39: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */       //   42: checkcast androidx/compose/ui/layout/Measurable
/*     */       //   45: getstatic androidx/compose/ui/unit/Constraints.Companion : Landroidx/compose/ui/unit/Constraints$Companion;
/*     */       //   48: aload #5
/*     */       //   50: invokestatic access$getSize : (Lkotlin/ranges/IntRange;)I
/*     */       //   53: lload_3
/*     */       //   54: aload_0
/*     */       //   55: getfield $thumbThickness : I
/*     */       //   58: invokestatic constrainHeight-K40F9xA : (JI)I
/*     */       //   61: invokevirtual fixed-JhjzzOo : (II)J
/*     */       //   64: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */       //   69: astore #6
/*     */       //   71: aload_1
/*     */       //   72: lload_3
/*     */       //   73: invokestatic getMaxWidth-impl : (J)I
/*     */       //   76: aload #6
/*     */       //   78: invokevirtual getHeight : ()I
/*     */       //   81: aconst_null
/*     */       //   82: aload #6
/*     */       //   84: aload #5
/*     */       //   86: <illegal opcode> invoke : (Landroidx/compose/ui/layout/Placeable;Lkotlin/ranges/IntRange;)Lkotlin/jvm/functions/Function1;
/*     */       //   91: iconst_4
/*     */       //   92: aconst_null
/*     */       //   93: invokestatic layout$default : (Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;
/*     */       //   96: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #450	-> 12
/*     */       //   #451	-> 29
/*     */       //   #453	-> 38
/*     */       //   #452	-> 69
/*     */       //   #454	-> 71
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   38	59	5	pixelRange	Lkotlin/ranges/IntRange;
/*     */       //   71	26	6	placeable	Landroidx/compose/ui/layout/Placeable;
/*     */       //   0	97	0	this	Lorg/jetbrains/jewel/ui/component/ScrollbarKt$horizontalMeasurePolicy$1;
/*     */       //   0	97	1	$this$MeasurePolicy	Landroidx/compose/ui/layout/MeasureScope;
/*     */       //   0	97	2	measurables	Ljava/util/List;
/*     */       //   0	97	3	constraints	J
/*     */     }
/*     */     
/*     */     private static final Unit measure_3p2s80s$lambda$0(Placeable $placeable, IntRange $pixelRange, Placeable.PlacementScope $this$layout) {
/*     */       Intrinsics.checkNotNullParameter($this$layout, "$this$layout");
/*     */       Placeable.PlacementScope.place$default($this$layout, $placeable, $pixelRange.getFirst(), 0, 0.0F, 4, null);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Modifier scrollbarDrag(Modifier $this$scrollbarDrag, MutableInteractionSource interactionSource, MutableState<DragInteraction.Start> draggedInteraction, SliderAdapter sliderAdapter) {
/*     */     return ComposedModifierKt.composed$default($this$scrollbarDrag, null, new ScrollbarKt$scrollbarDrag$1(interactionSource, draggedInteraction, sliderAdapter), 1, null);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nScrollbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollbar.kt\norg/jetbrains/jewel/ui/component/ScrollbarKt$scrollbarDrag$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,722:1\n1225#2,6:723\n81#3:729\n81#3:730\n81#3:731\n*S KotlinDebug\n*F\n+ 1 Scrollbar.kt\norg/jetbrains/jewel/ui/component/ScrollbarKt$scrollbarDrag$1\n*L\n466#1:723,6\n462#1:729\n463#1:730\n464#1:731\n*E\n"})
/*     */   static final class ScrollbarKt$scrollbarDrag$1 implements Function3<Modifier, Composer, Integer, Modifier> {
/*     */     @Composable
/*     */     public final Modifier invoke(Modifier $this$composed, Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter($this$composed, "$this$composed");
/*     */       $composer.startReplaceGroup(-968972458);
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventStart(-968972458, $changed, -1, "org.jetbrains.jewel.ui.component.scrollbarDrag.<anonymous> (Scrollbar.kt:461)"); 
/*     */       State<? extends MutableInteractionSource> currentInteractionSource$delegate = SnapshotStateKt.rememberUpdatedState(this.$interactionSource, $composer, 0);
/*     */       State<? extends MutableState<DragInteraction.Start>> currentDraggedInteraction$delegate = SnapshotStateKt.rememberUpdatedState(this.$draggedInteraction, $composer, 0);
/*     */       State<SliderAdapter> currentSliderAdapter$delegate = SnapshotStateKt.rememberUpdatedState(this.$sliderAdapter, $composer, 0);
/*     */       $composer.startReplaceGroup(1398693471);
/*     */       Composer composer = $composer;
/*     */       int i = $composer.changed(currentInteractionSource$delegate) | $composer.changed(currentDraggedInteraction$delegate) | $composer.changed(currentSliderAdapter$delegate), $i$f$cache = 0;
/*     */       Object it$iv = composer.rememberedValue();
/*     */       int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */       Unit unit = Unit.INSTANCE;
/*     */       Modifier modifier2 = $this$composed;
/*     */       int $i$a$-cache-ScrollbarKt$scrollbarDrag$1$1 = 0;
/*     */       ScrollbarKt$scrollbarDrag$1$1$1 scrollbarKt$scrollbarDrag$1$1$1 = new ScrollbarKt$scrollbarDrag$1$1$1(currentInteractionSource$delegate, currentDraggedInteraction$delegate, currentSliderAdapter$delegate, null);
/*     */       Object value$iv = scrollbarKt$scrollbarDrag$1$1$1;
/*     */       composer.updateRememberedValue(value$iv);
/*     */       Function2 function2 = (i != 0 || it$iv == Composer.Companion.getEmpty()) ? (Function2)value$iv : (Function2)it$iv;
/*     */       $composer.endReplaceGroup();
/*     */       Modifier modifier1 = SuspendingPointerInputFilterKt.pointerInput(modifier2, unit, function2);
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd(); 
/*     */       $composer.endReplaceGroup();
/*     */       return modifier1;
/*     */     }
/*     */     
/*     */     private static final MutableInteractionSource invoke$lambda$0(State $currentInteractionSource$delegate) {
/*     */       State state = $currentInteractionSource$delegate;
/*     */       Object object = null;
/*     */       KProperty property$iv = null;
/*     */       int $i$f$getValue = 0;
/*     */       return (MutableInteractionSource)state.getValue();
/*     */     }
/*     */     
/*     */     private static final MutableState<DragInteraction.Start> invoke$lambda$1(State $currentDraggedInteraction$delegate) {
/*     */       State state = $currentDraggedInteraction$delegate;
/*     */       Object object = null;
/*     */       KProperty property$iv = null;
/*     */       int $i$f$getValue = 0;
/*     */       return (MutableState<DragInteraction.Start>)state.getValue();
/*     */     }
/*     */     
/*     */     private static final SliderAdapter invoke$lambda$2(State $currentSliderAdapter$delegate) {
/*     */       State state = $currentSliderAdapter$delegate;
/*     */       Object object = null;
/*     */       KProperty property$iv = null;
/*     */       int $i$f$getValue = 0;
/*     */       return (SliderAdapter)state.getValue();
/*     */     }
/*     */     
/*     */     ScrollbarKt$scrollbarDrag$1(MutableInteractionSource $interactionSource, MutableState<DragInteraction.Start> $draggedInteraction, SliderAdapter $sliderAdapter) {}
/*     */   }
/*     */   
/*     */   private static final Modifier scrollOnPressTrack(Modifier $this$scrollOnPressTrack, TrackClickBehavior clickBehavior, boolean isVertical, boolean reverseLayout, SliderAdapter sliderAdapter) {
/*     */     return ComposedModifierKt.composed$default($this$scrollOnPressTrack, null, new ScrollbarKt$scrollOnPressTrack$1(sliderAdapter, reverseLayout, clickBehavior, isVertical), 1, null);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nScrollbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollbar.kt\norg/jetbrains/jewel/ui/component/ScrollbarKt$scrollOnPressTrack$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,722:1\n481#2:723\n480#2,4:724\n484#2,2:731\n488#2:737\n1225#3,3:728\n1228#3,3:734\n1225#3,6:738\n1225#3,6:744\n480#4:733\n*S KotlinDebug\n*F\n+ 1 Scrollbar.kt\norg/jetbrains/jewel/ui/component/ScrollbarKt$scrollOnPressTrack$1\n*L\n496#1:723\n496#1:724,4\n496#1:731,2\n496#1:737\n496#1:728,3\n496#1:734,3\n498#1:738,6\n502#1:744,6\n496#1:733\n*E\n"})
/*     */   static final class ScrollbarKt$scrollOnPressTrack$1 implements Function3<Modifier, Composer, Integer, Modifier> {
/*     */     @Composable
/*     */     public final Modifier invoke(Modifier $this$composed, Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter($this$composed, "$this$composed");
/*     */       $composer.startReplaceGroup(1868367151);
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventStart(1868367151, $changed, -1, "org.jetbrains.jewel.ui.component.scrollOnPressTrack.<anonymous> (Scrollbar.kt:495)"); 
/*     */       int $changed$iv = 0, $i$f$rememberCoroutineScope = 0;
/*     */       ComposerKt.sourceInformationMarkerStart($composer, 773894976, "CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp");
/*     */       Composer composer$iv = $composer;
/*     */       ComposerKt.sourceInformationMarkerStart($composer, -954370320, "CC(remember):Effects.kt#9igjgp");
/*     */       Composer composer3 = $composer;
/*     */       boolean invalid$iv$iv = false;
/*     */       int k = 0;
/*     */       Object it$iv$iv = composer3.rememberedValue();
/*     */       int $i$a$-let-ComposerKt$cache$1$iv$iv = 0;
/*     */       int $i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv = 0;
/*     */       int $i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1 = 0;
/*     */       CoroutineScope coroutineScope2 = EffectsKt.createCompositionCoroutineScope((CoroutineContext)EmptyCoroutineContext.INSTANCE, composer$iv);
/*     */       Object value$iv$iv = new CompositionScopedCoroutineScopeCanceller(coroutineScope2);
/*     */       composer3.updateRememberedValue(value$iv$iv);
/*     */       CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1 = (it$iv$iv == Composer.Companion.getEmpty()) ? (CompositionScopedCoroutineScopeCanceller)value$iv$iv : (CompositionScopedCoroutineScopeCanceller)it$iv$iv;
/*     */       ComposerKt.sourceInformationMarkerEnd($composer);
/*     */       CompositionScopedCoroutineScopeCanceller wrapper$iv = compositionScopedCoroutineScopeCanceller1;
/*     */       CoroutineScope coroutineScope1 = wrapper$iv.getCoroutineScope();
/*     */       ComposerKt.sourceInformationMarkerEnd($composer);
/*     */       CoroutineScope coroutineScope = coroutineScope1;
/*     */       $composer.startReplaceGroup(885446782);
/*     */       Composer composer1 = $composer;
/*     */       int i = $composer.changed(this.$sliderAdapter) | $composer.changed(coroutineScope) | $composer.changed(this.$reverseLayout) | $composer.changed(this.$clickBehavior);
/*     */       SliderAdapter sliderAdapter = this.$sliderAdapter;
/*     */       invalid$iv$iv = this.$reverseLayout;
/*     */       TrackClickBehavior trackClickBehavior = this.$clickBehavior;
/*     */       int m = 0;
/*     */       Object object1 = composer1.rememberedValue();
/*     */       int n = 0;
/*     */       if (i != 0 || object1 == Composer.Companion.getEmpty()) {
/*     */         int $i$a$-cache-ScrollbarKt$scrollOnPressTrack$1$scroller$1 = 0;
/*     */         Object object = new TrackPressScroller(coroutineScope, sliderAdapter, invalid$iv$iv, trackClickBehavior);
/*     */         composer1.updateRememberedValue(object);
/*     */       } 
/*     */       TrackPressScroller trackPressScroller1 = (TrackPressScroller)object1;
/*     */       $composer.endReplaceGroup();
/*     */       TrackPressScroller scroller = trackPressScroller1;
/*     */       $composer.startReplaceGroup(885453439);
/*     */       Composer composer2 = $composer;
/*     */       int j = $composer.changed(this.$isVertical) | $composer.changedInstance(scroller);
/*     */       invalid$iv$iv = this.$isVertical;
/*     */       int $i$f$cache = 0;
/*     */       Object it$iv = composer2.rememberedValue();
/*     */       int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */       TrackPressScroller trackPressScroller2 = scroller;
/*     */       Modifier modifier2 = (Modifier)Modifier.Companion;
/*     */       int $i$a$-cache-ScrollbarKt$scrollOnPressTrack$1$1 = 0;
/*     */       ScrollbarKt$scrollOnPressTrack$1$1$1 scrollbarKt$scrollOnPressTrack$1$1$1 = new ScrollbarKt$scrollOnPressTrack$1$1$1(invalid$iv$iv, scroller, null);
/*     */       Object value$iv = scrollbarKt$scrollOnPressTrack$1$1$1;
/*     */       composer2.updateRememberedValue(value$iv);
/*     */       Function2 function2 = (j != 0 || it$iv == Composer.Companion.getEmpty()) ? (Function2)value$iv : (Function2)it$iv;
/*     */       $composer.endReplaceGroup();
/*     */       Modifier modifier1 = SuspendingPointerInputFilterKt.pointerInput(modifier2, trackPressScroller2, function2);
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd(); 
/*     */       $composer.endReplaceGroup();
/*     */       return modifier1;
/*     */     }
/*     */     
/*     */     ScrollbarKt$scrollOnPressTrack$1(SliderAdapter $sliderAdapter, boolean $reverseLayout, TrackClickBehavior $clickBehavior, boolean $isVertical) {}
/*     */   }
/*     */   
/*     */   private static final float detectScrollViaTrackGestures$onScrollAxis(long $this$detectScrollViaTrackGestures_u24onScrollAxis, boolean $isVertical) {
/*     */     return $isVertical ? Offset.getY-impl($this$detectScrollViaTrackGestures_u24onScrollAxis) : Offset.getX-impl($this$detectScrollViaTrackGestures_u24onScrollAxis);
/*     */   }
/*     */   
/*     */   private static final Object detectScrollViaTrackGestures(PointerInputScope $this$detectScrollViaTrackGestures, boolean isVertical, TrackPressScroller scroller, Continuation $completion) {
/*     */     if (ForEachGestureKt.awaitEachGesture($this$detectScrollViaTrackGestures, new ScrollbarKt$detectScrollViaTrackGestures$2(scroller, isVertical, null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return ForEachGestureKt.awaitEachGesture($this$detectScrollViaTrackGestures, new ScrollbarKt$detectScrollViaTrackGestures$2(scroller, isVertical, null), $completion); 
/*     */     ForEachGestureKt.awaitEachGesture($this$detectScrollViaTrackGestures, new ScrollbarKt$detectScrollViaTrackGestures$2(scroller, isVertical, null), $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit VerticalScrollbar$lambda$1(ScrollableState $scrollState, Modifier $modifier, boolean $reverseLayout, boolean $enabled, MutableInteractionSource $interactionSource, ScrollbarStyle $style, boolean $keepVisible, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     VerticalScrollbar($scrollState, $modifier, $reverseLayout, $enabled, $interactionSource, $style, $keepVisible, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit HorizontalScrollbar$lambda$3(ScrollableState $scrollState, Modifier $modifier, boolean $reverseLayout, boolean $enabled, MutableInteractionSource $interactionSource, ScrollbarStyle $style, boolean $keepVisible, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     HorizontalScrollbar($scrollState, $modifier, $reverseLayout, $enabled, $interactionSource, $style, $keepVisible, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit BaseScrollbar$lambda$31(ScrollableState $scrollState, Modifier $modifier, boolean $reverseLayout, boolean $enabled, MutableInteractionSource $interactionSource, boolean $isVertical, ScrollbarStyle $style, boolean $keepVisible, int $$changed, Composer $composer, int $force) {
/*     */     BaseScrollbar($scrollState, $modifier, $reverseLayout, $enabled, $interactionSource, $isVertical, $style, $keepVisible, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit Thumb_KjnZka4$lambda$36(boolean $showScrollbar, ScrollbarVisibility $visibilityStyle, boolean $canScroll, boolean $enabled, MutableInteractionSource $interactionSource, MutableState<DragInteraction.Start> $dragInteraction, SliderAdapter $sliderAdapter, long $thumbBackgroundColor, long $thumbBorderColor, boolean $hasVisibleBorder, CornerSize $cornerSize, int $$changed, int $$changed1, Composer $composer, int $force) {
/*     */     Thumb-KjnZka4($showScrollbar, $visibilityStyle, $canScroll, $enabled, $interactionSource, $dragInteraction, $sliderAdapter, $thumbBackgroundColor, $thumbBorderColor, $hasVisibleBorder, $cornerSize, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "Scrollbar.kt", l = {610, 616, 618}, i = {0, 1, 1, 2, 2}, s = {"L$0", "L$0", "L$1", "L$0", "L$1"}, n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "$this$awaitEachGesture", "down"}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.ScrollbarKt$detectScrollViaTrackGestures$2")
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"})
/*     */   static final class ScrollbarKt$detectScrollViaTrackGestures$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     ScrollbarKt$detectScrollViaTrackGestures$2(TrackPressScroller $scroller, boolean $isVertical, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #5
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 310, 0 -> 40, 1 -> 83, 2 -> 162, 3 -> 225
/*     */       //   40: aload_1
/*     */       //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   44: aload_0
/*     */       //   45: getfield L$0 : Ljava/lang/Object;
/*     */       //   48: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*     */       //   51: astore_2
/*     */       //   52: aload_2
/*     */       //   53: iconst_0
/*     */       //   54: aconst_null
/*     */       //   55: aload_0
/*     */       //   56: checkcast kotlin/coroutines/Continuation
/*     */       //   59: iconst_3
/*     */       //   60: aconst_null
/*     */       //   61: aload_0
/*     */       //   62: aload_2
/*     */       //   63: putfield L$0 : Ljava/lang/Object;
/*     */       //   66: aload_0
/*     */       //   67: iconst_1
/*     */       //   68: putfield label : I
/*     */       //   71: invokestatic awaitFirstDown$default : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */       //   74: dup
/*     */       //   75: aload #5
/*     */       //   77: if_acmpne -> 96
/*     */       //   80: aload #5
/*     */       //   82: areturn
/*     */       //   83: aload_0
/*     */       //   84: getfield L$0 : Ljava/lang/Object;
/*     */       //   87: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*     */       //   90: astore_2
/*     */       //   91: aload_1
/*     */       //   92: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   95: aload_1
/*     */       //   96: checkcast androidx/compose/ui/input/pointer/PointerInputChange
/*     */       //   99: astore_3
/*     */       //   100: aload_0
/*     */       //   101: getfield $scroller : Lorg/jetbrains/jewel/ui/component/TrackPressScroller;
/*     */       //   104: aload_3
/*     */       //   105: invokevirtual getPosition-F1C5BW0 : ()J
/*     */       //   108: aload_0
/*     */       //   109: getfield $isVertical : Z
/*     */       //   112: invokestatic access$detectScrollViaTrackGestures$onScrollAxis : (JZ)F
/*     */       //   115: invokevirtual onPress : (F)V
/*     */       //   118: nop
/*     */       //   119: aload_0
/*     */       //   120: getfield $isVertical : Z
/*     */       //   123: ifeq -> 189
/*     */       //   126: aload_2
/*     */       //   127: aload_3
/*     */       //   128: invokevirtual getId-J3iCeTQ : ()J
/*     */       //   131: aload_0
/*     */       //   132: checkcast kotlin/coroutines/Continuation
/*     */       //   135: aload_0
/*     */       //   136: aload_2
/*     */       //   137: putfield L$0 : Ljava/lang/Object;
/*     */       //   140: aload_0
/*     */       //   141: aload_3
/*     */       //   142: putfield L$1 : Ljava/lang/Object;
/*     */       //   145: aload_0
/*     */       //   146: iconst_2
/*     */       //   147: putfield label : I
/*     */       //   150: invokestatic awaitVerticalDragOrCancellation-rnUCldI : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   153: dup
/*     */       //   154: aload #5
/*     */       //   156: if_acmpne -> 183
/*     */       //   159: aload #5
/*     */       //   161: areturn
/*     */       //   162: aload_0
/*     */       //   163: getfield L$1 : Ljava/lang/Object;
/*     */       //   166: checkcast androidx/compose/ui/input/pointer/PointerInputChange
/*     */       //   169: astore_3
/*     */       //   170: aload_0
/*     */       //   171: getfield L$0 : Ljava/lang/Object;
/*     */       //   174: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*     */       //   177: astore_2
/*     */       //   178: aload_1
/*     */       //   179: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   182: aload_1
/*     */       //   183: checkcast androidx/compose/ui/input/pointer/PointerInputChange
/*     */       //   186: goto -> 249
/*     */       //   189: aload_2
/*     */       //   190: aload_3
/*     */       //   191: invokevirtual getId-J3iCeTQ : ()J
/*     */       //   194: aload_0
/*     */       //   195: checkcast kotlin/coroutines/Continuation
/*     */       //   198: aload_0
/*     */       //   199: aload_2
/*     */       //   200: putfield L$0 : Ljava/lang/Object;
/*     */       //   203: aload_0
/*     */       //   204: aload_3
/*     */       //   205: putfield L$1 : Ljava/lang/Object;
/*     */       //   208: aload_0
/*     */       //   209: iconst_3
/*     */       //   210: putfield label : I
/*     */       //   213: invokestatic awaitHorizontalDragOrCancellation-rnUCldI : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   216: dup
/*     */       //   217: aload #5
/*     */       //   219: if_acmpne -> 246
/*     */       //   222: aload #5
/*     */       //   224: areturn
/*     */       //   225: aload_0
/*     */       //   226: getfield L$1 : Ljava/lang/Object;
/*     */       //   229: checkcast androidx/compose/ui/input/pointer/PointerInputChange
/*     */       //   232: astore_3
/*     */       //   233: aload_0
/*     */       //   234: getfield L$0 : Ljava/lang/Object;
/*     */       //   237: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*     */       //   240: astore_2
/*     */       //   241: aload_1
/*     */       //   242: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   245: aload_1
/*     */       //   246: checkcast androidx/compose/ui/input/pointer/PointerInputChange
/*     */       //   249: astore #4
/*     */       //   251: aload #4
/*     */       //   253: ifnonnull -> 266
/*     */       //   256: aload_0
/*     */       //   257: getfield $scroller : Lorg/jetbrains/jewel/ui/component/TrackPressScroller;
/*     */       //   260: invokevirtual onGestureCancelled : ()V
/*     */       //   263: goto -> 306
/*     */       //   266: aload #4
/*     */       //   268: invokevirtual getPressed : ()Z
/*     */       //   271: ifne -> 284
/*     */       //   274: aload_0
/*     */       //   275: getfield $scroller : Lorg/jetbrains/jewel/ui/component/TrackPressScroller;
/*     */       //   278: invokevirtual onRelease : ()V
/*     */       //   281: goto -> 306
/*     */       //   284: aload_0
/*     */       //   285: getfield $scroller : Lorg/jetbrains/jewel/ui/component/TrackPressScroller;
/*     */       //   288: aload #4
/*     */       //   290: invokevirtual getPosition-F1C5BW0 : ()J
/*     */       //   293: aload_0
/*     */       //   294: getfield $isVertical : Z
/*     */       //   297: invokestatic access$detectScrollViaTrackGestures$onScrollAxis : (JZ)F
/*     */       //   300: invokevirtual onMovePressed : (F)V
/*     */       //   303: goto -> 118
/*     */       //   306: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   309: areturn
/*     */       //   310: new java/lang/IllegalStateException
/*     */       //   313: dup
/*     */       //   314: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   316: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   319: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #609	-> 3
/*     */       //   #610	-> 52
/*     */       //   #609	-> 80
/*     */       //   #611	-> 100
/*     */       //   #613	-> 118
/*     */       //   #615	-> 119
/*     */       //   #616	-> 126
/*     */       //   #609	-> 159
/*     */       //   #616	-> 183
/*     */       //   #618	-> 189
/*     */       //   #609	-> 222
/*     */       //   #615	-> 249
/*     */       //   #614	-> 249
/*     */       //   #621	-> 251
/*     */       //   #622	-> 256
/*     */       //   #623	-> 263
/*     */       //   #624	-> 266
/*     */       //   #625	-> 274
/*     */       //   #626	-> 281
/*     */       //   #628	-> 284
/*     */       //   #631	-> 306
/*     */       //   #609	-> 310
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   52	31	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */       //   91	71	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */       //   178	47	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */       //   241	15	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */       //   266	8	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */       //   284	22	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */       //   100	62	3	down	Landroidx/compose/ui/input/pointer/PointerInputChange;
/*     */       //   170	55	3	down	Landroidx/compose/ui/input/pointer/PointerInputChange;
/*     */       //   233	23	3	down	Landroidx/compose/ui/input/pointer/PointerInputChange;
/*     */       //   266	8	3	down	Landroidx/compose/ui/input/pointer/PointerInputChange;
/*     */       //   284	22	3	down	Landroidx/compose/ui/input/pointer/PointerInputChange;
/*     */       //   251	52	4	drag	Landroidx/compose/ui/input/pointer/PointerInputChange;
/*     */       //   0	320	0	this	Lorg/jetbrains/jewel/ui/component/ScrollbarKt$detectScrollViaTrackGestures$2;
/*     */       //   44	266	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super ScrollbarKt$detectScrollViaTrackGestures$2> $completion) {
/*     */       ScrollbarKt$detectScrollViaTrackGestures$2 scrollbarKt$detectScrollViaTrackGestures$2 = new ScrollbarKt$detectScrollViaTrackGestures$2(this.$scroller, this.$isVertical, $completion);
/*     */       scrollbarKt$detectScrollViaTrackGestures$2.L$0 = value;
/*     */       return (Continuation<Unit>)scrollbarKt$detectScrollViaTrackGestures$2;
/*     */     }
/*     */     
/*     */     public final Object invoke(AwaitPointerEventScope p1, Continuation<?> p2) {
/*     */       return ((ScrollbarKt$detectScrollViaTrackGestures$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ScrollbarKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */