/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.animation.core.Animatable;
/*     */ import androidx.compose.animation.core.TweenSpec;
/*     */ import androidx.compose.foundation.MutatePriority;
/*     */ import androidx.compose.foundation.gestures.DragScope;
/*     */ import androidx.compose.foundation.gestures.DraggableState;
/*     */ import androidx.compose.foundation.gestures.GestureCancellationException;
/*     */ import androidx.compose.foundation.gestures.PressGestureScope;
/*     */ import androidx.compose.foundation.interaction.Interaction;
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.BoxWithConstraintsScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
/*     */ import androidx.compose.runtime.EffectsKt;
/*     */ import androidx.compose.runtime.MutableFloatState;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.focus.FocusRequester;
/*     */ import androidx.compose.ui.geometry.Offset;
/*     */ import androidx.compose.ui.geometry.OffsetKt;
/*     */ import androidx.compose.ui.geometry.Size;
/*     */ import androidx.compose.ui.graphics.StrokeCap;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*     */ import androidx.compose.ui.input.key.KeyEvent;
/*     */ import androidx.compose.ui.input.key.KeyEventType;
/*     */ import androidx.compose.ui.input.key.KeyEvent_desktopKt;
/*     */ import androidx.compose.ui.input.key.KeyInputModifierKt;
/*     */ import androidx.compose.ui.input.key.Key_desktopKt;
/*     */ import androidx.compose.ui.input.pointer.PointerInputScope;
/*     */ import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
/*     */ import androidx.compose.ui.platform.InspectableValueKt;
/*     */ import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.coroutines.EmptyCoroutineContext;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.Boxing;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.ClosedFloatingPointRange;
/*     */ import kotlin.ranges.RangesKt;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.component.styling.SliderStyle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\001\n\000\n\002\020\002\n\000\n\002\020\007\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020 \n\002\b\b\n\002\030\002\n\002\b\026\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\026\n\002\030\002\032}\020\000\032\0020\0012\006\020\002\032\0020\0032\022\020\004\032\016\022\004\022\0020\003\022\004\022\0020\0010\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\016\b\002\020\n\032\b\022\004\022\0020\0030\0132\b\b\002\020\f\032\0020\r2\020\b\002\020\016\032\n\022\004\022\0020\001\030\0010\0172\b\b\002\020\020\032\0020\0212\b\b\002\020\022\032\0020\023H\007¢\006\002\020\024\032U\020\030\032\0020\0012\006\020\b\032\0020\t2\006\020\031\032\0020\0032\f\020\032\032\b\022\004\022\0020\0030\0332\006\020\022\032\0020\0232\006\020\034\032\0020\0032\006\020\035\032\0020\0262\006\020\020\032\0020\0212\006\020\006\032\0020\007H\003¢\006\004\b\036\020\037\032;\020 \032\0020\0012\006\020\006\032\0020\0072\006\020\022\032\0020\0232\006\020\b\032\0020\t2\006\020!\032\0020\0032\f\020\032\032\b\022\004\022\0020\0030\033H\003¢\006\002\020\"\032=\020#\032\0020\001*\0020$2\006\020%\032\0020\0262\006\020\020\032\0020\0212\006\020\022\032\0020\0232\006\020\b\032\0020\t2\b\b\002\020\006\032\0020\007H\003¢\006\004\b&\020'\032.\020(\032\0020\0032\006\020)\032\0020\0032\f\020\032\032\b\022\004\022\0020\0030\0332\006\020*\032\0020\0032\006\020+\032\0020\003H\002\032\026\020,\032\b\022\004\022\0020\0030\0332\006\020\f\032\0020\rH\002\0320\020-\032\0020\0032\006\020.\032\0020\0032\006\020/\032\0020\0032\006\0200\032\0020\0032\006\0201\032\0020\0032\006\0202\032\0020\003H\002\032 \0203\032\0020\0032\006\0204\032\0020\0032\006\0205\032\0020\0032\006\0206\032\0020\003H\002\032S\0207\032\0020\0012\022\0208\032\016\022\004\022\0020\003\022\004\022\0020\0030\0052\f\020\n\032\b\022\004\022\0020\0030\0132\f\0209\032\b\022\004\022\0020\0030\0132\f\020:\032\b\022\004\022\0020\0030;2\006\020\002\032\0020\003H\003¢\006\002\020<\032\\\020=\032\0020\007*\0020\0072\006\020\002\032\0020\0032\006\020\b\032\0020\t2\022\020\004\032\016\022\004\022\0020\003\022\004\022\0020\0010\0052\020\b\002\020\016\032\n\022\004\022\0020\001\030\0010\0172\016\b\002\020\n\032\b\022\004\022\0020\0030\0132\b\b\002\020\f\032\0020\rH\002\032j\020>\032\0020\007*\0020\0072\006\020?\032\0020@2\006\020\020\032\0020\0212\006\020+\032\0020\0032\006\020A\032\0020\t2\f\020B\032\b\022\004\022\0020\0030C2\030\020D\032\024\022\020\022\016\022\004\022\0020\003\022\004\022\0020\0010\0050C2\f\020E\032\b\022\004\022\0020\0030;2\006\020\b\032\0020\tH\002\032.\020H\032\0020\0012\006\020?\032\0020@2\006\020)\032\0020\0032\006\020I\032\0020\0032\006\020J\032\0020\003H@¢\006\002\020K\032j\020L\032\0020\007*\0020\0072\006\020\b\032\0020\t2\006\020\f\032\0020\r2\f\020\n\032\b\022\004\022\0020\0030\0132\006\020\002\032\0020\0032\006\020A\032\0020\t2\030\020M\032\024\022\020\022\016\022\004\022\0020\003\022\004\022\0020\0010\0050C2\024\020N\032\020\022\f\022\n\022\004\022\0020\001\030\0010\0170CH\002\032 \020a\032\0020\0032\006\020b\032\0020\0032\006\020c\032\0020\0032\006\020d\032\0020\003H\000\"\020\020\025\032\0020\026X\004¢\006\004\n\002\020\027\"\024\020F\032\b\022\004\022\0020\0030GX\004¢\006\002\n\000\"\030\020O\032\0020\t*\0020P8@X\004¢\006\006\032\004\bQ\020R\"\030\020S\032\0020\t*\0020P8@X\004¢\006\006\032\004\bT\020R\"\030\020U\032\0020\t*\0020P8@X\004¢\006\006\032\004\bV\020R\"\030\020W\032\0020\t*\0020P8@X\004¢\006\006\032\004\bX\020R\"\030\020Y\032\0020\t*\0020P8@X\004¢\006\006\032\004\bZ\020R\"\030\020[\032\0020\t*\0020P8@X\004¢\006\006\032\004\b\\\020R\"\030\020]\032\0020\t*\0020P8@X\004¢\006\006\032\004\b^\020R\"\030\020_\032\0020\t*\0020P8@X\004¢\006\006\032\004\b`\020R¨\006e²\006\n\020f\032\0020gX\002"}, d2 = {"Slider", "", "value", "", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "valueRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "steps", "", "onValueChangeFinished", "Lkotlin/Function0;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "style", "Lorg/jetbrains/jewel/ui/component/styling/SliderStyle;", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/SliderStyle;Landroidx/compose/runtime/Composer;II)V", "SliderMinWidth", "Landroidx/compose/ui/unit/Dp;", "F", "SliderImpl", "positionFraction", "tickFractions", "", "width", "minHeight", "SliderImpl-PfoAEA0", "(ZFLjava/util/List;Lorg/jetbrains/jewel/ui/component/styling/SliderStyle;FFLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Track", "positionFractionEnd", "(Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/SliderStyle;ZFLjava/util/List;Landroidx/compose/runtime/Composer;I)V", "SliderThumb", "Landroidx/compose/foundation/layout/BoxScope;", "offset", "SliderThumb-RfXq3Jk", "(Landroidx/compose/foundation/layout/BoxScope;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/SliderStyle;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "snapValueToTick", "current", "minPx", "maxPx", "stepsToTickFractions", "scale", "a1", "b1", "x1", "a2", "b2", "calcFraction", "a", "b", "pos", "CorrectValueSideEffect", "scaleToOffset", "trackRange", "valueState", "Landroidx/compose/runtime/MutableState;", "(Lkotlin/jvm/functions/Function1;Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/MutableState;FLandroidx/compose/runtime/Composer;I)V", "sliderSemantics", "sliderTapModifier", "draggableState", "Landroidx/compose/foundation/gestures/DraggableState;", "isRtl", "rawOffset", "Landroidx/compose/runtime/State;", "gestureEndAction", "pressOffset", "SliderToTickAnimation", "Landroidx/compose/animation/core/TweenSpec;", "animateToTarget", "target", "velocity", "(Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "slideOnKeyEvents", "onValueChangeState", "onValueChangeFinishedState", "isDirectionUp", "Landroidx/compose/ui/input/key/KeyEvent;", "isDirectionUp-ZmokQxo", "(Ljava/lang/Object;)Z", "isDirectionDown", "isDirectionDown-ZmokQxo", "isDirectionRight", "isDirectionRight-ZmokQxo", "isDirectionLeft", "isDirectionLeft-ZmokQxo", "isHome", "isHome-ZmokQxo", "isMoveEnd", "isMoveEnd-ZmokQxo", "isPgUp", "isPgUp-ZmokQxo", "isPgDn", "isPgDn-ZmokQxo", "lerp", "start", "stop", "fraction", "ui", "state", "Lorg/jetbrains/jewel/ui/component/SliderState;"})
/*     */ @SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\norg/jetbrains/jewel/ui/component/SliderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 12 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,707:1\n1225#2,6:708\n1225#2,6:715\n1225#2,6:722\n1225#2,6:777\n1225#2,6:819\n1225#2,6:825\n1225#2,6:831\n1225#2,6:855\n1#3:714\n77#4:721\n77#4:769\n77#4:776\n51#5:728\n87#5:730\n51#5:731\n87#5:732\n51#5:770\n84#5:771\n149#6:729\n149#6:867\n71#7:733\n68#7,6:734\n74#7:768\n78#7:775\n71#7:783\n68#7,6:784\n74#7:818\n78#7:840\n79#8,6:740\n86#8,4:755\n90#8,2:765\n94#8:774\n79#8,6:790\n86#8,4:805\n90#8,2:815\n94#8:839\n368#9,9:746\n377#9:767\n378#9,2:772\n368#9,9:796\n377#9:817\n378#9,2:837\n4034#10,6:759\n4034#10,6:809\n2333#11,14:841\n1855#11,2:862\n135#12:861\n81#13:864\n107#13,2:865\n*S KotlinDebug\n*F\n+ 1 Slider.kt\norg/jetbrains/jewel/ui/component/SliderKt\n*L\n100#1:708,6\n107#1:715,6\n110#1:722,6\n270#1:777,6\n324#1:819,6\n325#1:825,6\n327#1:831,6\n385#1:855,6\n108#1:721\n231#1:769\n261#1:776\n114#1:728\n119#1:730\n119#1:731\n123#1:732\n241#1:770\n241#1:771\n116#1:729\n216#1:867\n229#1:733\n229#1:734,6\n229#1:768\n229#1:775\n323#1:783\n323#1:784,6\n323#1:818\n323#1:840\n229#1:740,6\n229#1:755,4\n229#1:765,2\n229#1:774\n323#1:790,6\n323#1:805,4\n323#1:815,2\n323#1:839\n229#1:746,9\n229#1:767\n229#1:772,2\n323#1:796,9\n323#1:817\n323#1:837,2\n229#1:759,6\n323#1:809,6\n365#1:841,14\n303#1:862,2\n482#1:861\n324#1:864\n324#1:865,2\n*E\n"})
/*     */ public final class SliderKt
/*     */ {
/*     */   private static final float SliderMinWidth;
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void Slider(float value, @NotNull Function1 onValueChange, @Nullable Modifier modifier, boolean enabled, @Nullable ClosedFloatingPointRange valueRange, int steps, @Nullable Function0 onValueChangeFinished, @Nullable MutableInteractionSource interactionSource, @Nullable SliderStyle style, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'onValueChange'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #9
/*     */     //   8: ldc -127502571
/*     */     //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   15: astore #9
/*     */     //   17: iload #10
/*     */     //   19: istore #12
/*     */     //   21: iload #11
/*     */     //   23: iconst_1
/*     */     //   24: iand
/*     */     //   25: ifeq -> 38
/*     */     //   28: iload #12
/*     */     //   30: bipush #6
/*     */     //   32: ior
/*     */     //   33: istore #12
/*     */     //   35: goto -> 67
/*     */     //   38: iload #10
/*     */     //   40: bipush #6
/*     */     //   42: iand
/*     */     //   43: ifne -> 67
/*     */     //   46: iload #12
/*     */     //   48: aload #9
/*     */     //   50: fload_0
/*     */     //   51: invokeinterface changed : (F)Z
/*     */     //   56: ifeq -> 63
/*     */     //   59: iconst_4
/*     */     //   60: goto -> 64
/*     */     //   63: iconst_2
/*     */     //   64: ior
/*     */     //   65: istore #12
/*     */     //   67: iload #11
/*     */     //   69: iconst_2
/*     */     //   70: iand
/*     */     //   71: ifeq -> 84
/*     */     //   74: iload #12
/*     */     //   76: bipush #48
/*     */     //   78: ior
/*     */     //   79: istore #12
/*     */     //   81: goto -> 115
/*     */     //   84: iload #10
/*     */     //   86: bipush #48
/*     */     //   88: iand
/*     */     //   89: ifne -> 115
/*     */     //   92: iload #12
/*     */     //   94: aload #9
/*     */     //   96: aload_1
/*     */     //   97: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   102: ifeq -> 110
/*     */     //   105: bipush #32
/*     */     //   107: goto -> 112
/*     */     //   110: bipush #16
/*     */     //   112: ior
/*     */     //   113: istore #12
/*     */     //   115: iload #11
/*     */     //   117: iconst_4
/*     */     //   118: iand
/*     */     //   119: ifeq -> 133
/*     */     //   122: iload #12
/*     */     //   124: sipush #384
/*     */     //   127: ior
/*     */     //   128: istore #12
/*     */     //   130: goto -> 167
/*     */     //   133: iload #10
/*     */     //   135: sipush #384
/*     */     //   138: iand
/*     */     //   139: ifne -> 167
/*     */     //   142: iload #12
/*     */     //   144: aload #9
/*     */     //   146: aload_2
/*     */     //   147: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   152: ifeq -> 161
/*     */     //   155: sipush #256
/*     */     //   158: goto -> 164
/*     */     //   161: sipush #128
/*     */     //   164: ior
/*     */     //   165: istore #12
/*     */     //   167: iload #11
/*     */     //   169: bipush #8
/*     */     //   171: iand
/*     */     //   172: ifeq -> 186
/*     */     //   175: iload #12
/*     */     //   177: sipush #3072
/*     */     //   180: ior
/*     */     //   181: istore #12
/*     */     //   183: goto -> 220
/*     */     //   186: iload #10
/*     */     //   188: sipush #3072
/*     */     //   191: iand
/*     */     //   192: ifne -> 220
/*     */     //   195: iload #12
/*     */     //   197: aload #9
/*     */     //   199: iload_3
/*     */     //   200: invokeinterface changed : (Z)Z
/*     */     //   205: ifeq -> 214
/*     */     //   208: sipush #2048
/*     */     //   211: goto -> 217
/*     */     //   214: sipush #1024
/*     */     //   217: ior
/*     */     //   218: istore #12
/*     */     //   220: iload #10
/*     */     //   222: sipush #24576
/*     */     //   225: iand
/*     */     //   226: ifne -> 263
/*     */     //   229: iload #12
/*     */     //   231: iload #11
/*     */     //   233: bipush #16
/*     */     //   235: iand
/*     */     //   236: ifne -> 257
/*     */     //   239: aload #9
/*     */     //   241: aload #4
/*     */     //   243: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   248: ifeq -> 257
/*     */     //   251: sipush #16384
/*     */     //   254: goto -> 260
/*     */     //   257: sipush #8192
/*     */     //   260: ior
/*     */     //   261: istore #12
/*     */     //   263: iload #11
/*     */     //   265: bipush #32
/*     */     //   267: iand
/*     */     //   268: ifeq -> 281
/*     */     //   271: iload #12
/*     */     //   273: ldc 196608
/*     */     //   275: ior
/*     */     //   276: istore #12
/*     */     //   278: goto -> 313
/*     */     //   281: iload #10
/*     */     //   283: ldc 196608
/*     */     //   285: iand
/*     */     //   286: ifne -> 313
/*     */     //   289: iload #12
/*     */     //   291: aload #9
/*     */     //   293: iload #5
/*     */     //   295: invokeinterface changed : (I)Z
/*     */     //   300: ifeq -> 308
/*     */     //   303: ldc 131072
/*     */     //   305: goto -> 310
/*     */     //   308: ldc 65536
/*     */     //   310: ior
/*     */     //   311: istore #12
/*     */     //   313: iload #11
/*     */     //   315: bipush #64
/*     */     //   317: iand
/*     */     //   318: ifeq -> 331
/*     */     //   321: iload #12
/*     */     //   323: ldc 1572864
/*     */     //   325: ior
/*     */     //   326: istore #12
/*     */     //   328: goto -> 363
/*     */     //   331: iload #10
/*     */     //   333: ldc 1572864
/*     */     //   335: iand
/*     */     //   336: ifne -> 363
/*     */     //   339: iload #12
/*     */     //   341: aload #9
/*     */     //   343: aload #6
/*     */     //   345: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   350: ifeq -> 358
/*     */     //   353: ldc 1048576
/*     */     //   355: goto -> 360
/*     */     //   358: ldc 524288
/*     */     //   360: ior
/*     */     //   361: istore #12
/*     */     //   363: iload #11
/*     */     //   365: sipush #128
/*     */     //   368: iand
/*     */     //   369: ifeq -> 382
/*     */     //   372: iload #12
/*     */     //   374: ldc 12582912
/*     */     //   376: ior
/*     */     //   377: istore #12
/*     */     //   379: goto -> 414
/*     */     //   382: iload #10
/*     */     //   384: ldc 12582912
/*     */     //   386: iand
/*     */     //   387: ifne -> 414
/*     */     //   390: iload #12
/*     */     //   392: aload #9
/*     */     //   394: aload #7
/*     */     //   396: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   401: ifeq -> 409
/*     */     //   404: ldc 8388608
/*     */     //   406: goto -> 411
/*     */     //   409: ldc 4194304
/*     */     //   411: ior
/*     */     //   412: istore #12
/*     */     //   414: iload #10
/*     */     //   416: ldc 100663296
/*     */     //   418: iand
/*     */     //   419: ifne -> 455
/*     */     //   422: iload #12
/*     */     //   424: iload #11
/*     */     //   426: sipush #256
/*     */     //   429: iand
/*     */     //   430: ifne -> 450
/*     */     //   433: aload #9
/*     */     //   435: aload #8
/*     */     //   437: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   442: ifeq -> 450
/*     */     //   445: ldc 67108864
/*     */     //   447: goto -> 452
/*     */     //   450: ldc 33554432
/*     */     //   452: ior
/*     */     //   453: istore #12
/*     */     //   455: iload #12
/*     */     //   457: ldc 38347923
/*     */     //   459: iand
/*     */     //   460: ldc 38347922
/*     */     //   462: if_icmpne -> 475
/*     */     //   465: aload #9
/*     */     //   467: invokeinterface getSkipping : ()Z
/*     */     //   472: ifne -> 1349
/*     */     //   475: aload #9
/*     */     //   477: invokeinterface startDefaults : ()V
/*     */     //   482: iload #10
/*     */     //   484: iconst_1
/*     */     //   485: iand
/*     */     //   486: ifeq -> 499
/*     */     //   489: aload #9
/*     */     //   491: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   496: ifeq -> 692
/*     */     //   499: iload #11
/*     */     //   501: iconst_4
/*     */     //   502: iand
/*     */     //   503: ifeq -> 513
/*     */     //   506: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   509: checkcast androidx/compose/ui/Modifier
/*     */     //   512: astore_2
/*     */     //   513: iload #11
/*     */     //   515: bipush #8
/*     */     //   517: iand
/*     */     //   518: ifeq -> 523
/*     */     //   521: iconst_1
/*     */     //   522: istore_3
/*     */     //   523: iload #11
/*     */     //   525: bipush #16
/*     */     //   527: iand
/*     */     //   528: ifeq -> 545
/*     */     //   531: fconst_0
/*     */     //   532: fconst_1
/*     */     //   533: invokestatic rangeTo : (FF)Lkotlin/ranges/ClosedFloatingPointRange;
/*     */     //   536: astore #4
/*     */     //   538: iload #12
/*     */     //   540: ldc -57345
/*     */     //   542: iand
/*     */     //   543: istore #12
/*     */     //   545: iload #11
/*     */     //   547: bipush #32
/*     */     //   549: iand
/*     */     //   550: ifeq -> 556
/*     */     //   553: iconst_0
/*     */     //   554: istore #5
/*     */     //   556: iload #11
/*     */     //   558: bipush #64
/*     */     //   560: iand
/*     */     //   561: ifeq -> 567
/*     */     //   564: aconst_null
/*     */     //   565: astore #6
/*     */     //   567: iload #11
/*     */     //   569: sipush #128
/*     */     //   572: iand
/*     */     //   573: ifeq -> 661
/*     */     //   576: aload #9
/*     */     //   578: ldc -736530554
/*     */     //   580: invokeinterface startReplaceGroup : (I)V
/*     */     //   585: aload #9
/*     */     //   587: astore #14
/*     */     //   589: iconst_0
/*     */     //   590: istore #15
/*     */     //   592: iconst_0
/*     */     //   593: istore #16
/*     */     //   595: aload #14
/*     */     //   597: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   602: astore #17
/*     */     //   604: iconst_0
/*     */     //   605: istore #18
/*     */     //   607: aload #17
/*     */     //   609: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   612: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   615: if_acmpne -> 640
/*     */     //   618: iconst_0
/*     */     //   619: istore #19
/*     */     //   621: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   624: astore #19
/*     */     //   626: aload #14
/*     */     //   628: aload #19
/*     */     //   630: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   635: aload #19
/*     */     //   637: goto -> 642
/*     */     //   640: aload #17
/*     */     //   642: nop
/*     */     //   643: nop
/*     */     //   644: nop
/*     */     //   645: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   648: astore #13
/*     */     //   650: aload #9
/*     */     //   652: invokeinterface endReplaceGroup : ()V
/*     */     //   657: aload #13
/*     */     //   659: astore #7
/*     */     //   661: iload #11
/*     */     //   663: sipush #256
/*     */     //   666: iand
/*     */     //   667: ifeq -> 730
/*     */     //   670: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   673: aload #9
/*     */     //   675: bipush #6
/*     */     //   677: invokestatic getSliderStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/SliderStyle;
/*     */     //   680: astore #8
/*     */     //   682: iload #12
/*     */     //   684: ldc -234881025
/*     */     //   686: iand
/*     */     //   687: istore #12
/*     */     //   689: goto -> 730
/*     */     //   692: aload #9
/*     */     //   694: invokeinterface skipToGroupEnd : ()V
/*     */     //   699: iload #11
/*     */     //   701: bipush #16
/*     */     //   703: iand
/*     */     //   704: ifeq -> 714
/*     */     //   707: iload #12
/*     */     //   709: ldc -57345
/*     */     //   711: iand
/*     */     //   712: istore #12
/*     */     //   714: iload #11
/*     */     //   716: sipush #256
/*     */     //   719: iand
/*     */     //   720: ifeq -> 730
/*     */     //   723: iload #12
/*     */     //   725: ldc -234881025
/*     */     //   727: iand
/*     */     //   728: istore #12
/*     */     //   730: aload #9
/*     */     //   732: invokeinterface endDefaults : ()V
/*     */     //   737: invokestatic isTraceInProgress : ()Z
/*     */     //   740: ifeq -> 753
/*     */     //   743: ldc -127502571
/*     */     //   745: iload #12
/*     */     //   747: iconst_m1
/*     */     //   748: ldc 'org.jetbrains.jewel.ui.component.Slider (Slider.kt:101)'
/*     */     //   750: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   753: iload #5
/*     */     //   755: iflt -> 762
/*     */     //   758: iconst_1
/*     */     //   759: goto -> 763
/*     */     //   762: iconst_0
/*     */     //   763: ifne -> 787
/*     */     //   766: iconst_0
/*     */     //   767: istore #14
/*     */     //   769: ldc 'The number of steps must be >= 0'
/*     */     //   771: nop
/*     */     //   772: astore #14
/*     */     //   774: new java/lang/IllegalArgumentException
/*     */     //   777: dup
/*     */     //   778: aload #14
/*     */     //   780: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   783: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   786: athrow
/*     */     //   787: aload_1
/*     */     //   788: aload #9
/*     */     //   790: bipush #14
/*     */     //   792: iload #12
/*     */     //   794: iconst_3
/*     */     //   795: ishr
/*     */     //   796: iand
/*     */     //   797: invokestatic rememberUpdatedState : (Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   800: astore #13
/*     */     //   802: aload #6
/*     */     //   804: aload #9
/*     */     //   806: bipush #14
/*     */     //   808: iload #12
/*     */     //   810: bipush #18
/*     */     //   812: ishr
/*     */     //   813: iand
/*     */     //   814: invokestatic rememberUpdatedState : (Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   817: astore #14
/*     */     //   819: aload #9
/*     */     //   821: ldc -736520050
/*     */     //   823: invokeinterface startReplaceGroup : (I)V
/*     */     //   828: aload #9
/*     */     //   830: astore #17
/*     */     //   832: iload #12
/*     */     //   834: ldc 458752
/*     */     //   836: iand
/*     */     //   837: ldc 131072
/*     */     //   839: if_icmpne -> 846
/*     */     //   842: iconst_1
/*     */     //   843: goto -> 847
/*     */     //   846: iconst_0
/*     */     //   847: istore #18
/*     */     //   849: nop
/*     */     //   850: iconst_0
/*     */     //   851: istore #19
/*     */     //   853: aload #17
/*     */     //   855: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   860: astore #20
/*     */     //   862: iconst_0
/*     */     //   863: istore #21
/*     */     //   865: iload #18
/*     */     //   867: ifne -> 881
/*     */     //   870: aload #20
/*     */     //   872: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   875: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   878: if_acmpne -> 905
/*     */     //   881: iconst_0
/*     */     //   882: istore #22
/*     */     //   884: iload #5
/*     */     //   886: invokestatic stepsToTickFractions : (I)Ljava/util/List;
/*     */     //   889: astore #23
/*     */     //   891: aload #17
/*     */     //   893: aload #23
/*     */     //   895: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   900: aload #23
/*     */     //   902: goto -> 907
/*     */     //   905: aload #20
/*     */     //   907: nop
/*     */     //   908: nop
/*     */     //   909: nop
/*     */     //   910: checkcast java/util/List
/*     */     //   913: astore #16
/*     */     //   915: aload #9
/*     */     //   917: invokeinterface endReplaceGroup : ()V
/*     */     //   922: aload #16
/*     */     //   924: astore #15
/*     */     //   926: invokestatic getLocalLayoutDirection : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   929: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   932: astore #17
/*     */     //   934: iconst_0
/*     */     //   935: istore #18
/*     */     //   937: iconst_0
/*     */     //   938: istore #19
/*     */     //   940: aload #9
/*     */     //   942: ldc 2023513938
/*     */     //   944: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   946: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   949: aload #9
/*     */     //   951: aload #17
/*     */     //   953: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   958: astore #20
/*     */     //   960: aload #9
/*     */     //   962: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   965: aload #20
/*     */     //   967: getstatic androidx/compose/ui/unit/LayoutDirection.Rtl : Landroidx/compose/ui/unit/LayoutDirection;
/*     */     //   970: if_acmpne -> 977
/*     */     //   973: iconst_1
/*     */     //   974: goto -> 978
/*     */     //   977: iconst_0
/*     */     //   978: istore #16
/*     */     //   980: aload #9
/*     */     //   982: ldc -736515524
/*     */     //   984: invokeinterface startReplaceGroup : (I)V
/*     */     //   989: aload #9
/*     */     //   991: astore #19
/*     */     //   993: iconst_0
/*     */     //   994: istore #20
/*     */     //   996: nop
/*     */     //   997: iconst_0
/*     */     //   998: istore #21
/*     */     //   1000: aload #19
/*     */     //   1002: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1007: astore #22
/*     */     //   1009: iconst_0
/*     */     //   1010: istore #23
/*     */     //   1012: aload #22
/*     */     //   1014: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1017: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1020: if_acmpne -> 1049
/*     */     //   1023: iconst_0
/*     */     //   1024: istore #24
/*     */     //   1026: new androidx/compose/ui/focus/FocusRequester
/*     */     //   1029: dup
/*     */     //   1030: invokespecial <init> : ()V
/*     */     //   1033: astore #24
/*     */     //   1035: aload #19
/*     */     //   1037: aload #24
/*     */     //   1039: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1044: aload #24
/*     */     //   1046: goto -> 1051
/*     */     //   1049: aload #22
/*     */     //   1051: nop
/*     */     //   1052: nop
/*     */     //   1053: nop
/*     */     //   1054: checkcast androidx/compose/ui/focus/FocusRequester
/*     */     //   1057: astore #18
/*     */     //   1059: aload #9
/*     */     //   1061: invokeinterface endReplaceGroup : ()V
/*     */     //   1066: aload #18
/*     */     //   1068: astore #17
/*     */     //   1070: aload #8
/*     */     //   1072: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SliderMetrics;
/*     */     //   1075: invokevirtual getThumbSize-MYxV2XQ : ()J
/*     */     //   1078: lstore #18
/*     */     //   1080: aload #15
/*     */     //   1082: checkcast java/util/Collection
/*     */     //   1085: invokeinterface isEmpty : ()Z
/*     */     //   1090: ifne -> 1097
/*     */     //   1093: iconst_1
/*     */     //   1094: goto -> 1098
/*     */     //   1097: iconst_0
/*     */     //   1098: ifeq -> 1135
/*     */     //   1101: aload #8
/*     */     //   1103: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SliderMetrics;
/*     */     //   1106: invokevirtual getTrackToStepSpacing-D9Ej5fM : ()F
/*     */     //   1109: fstore #21
/*     */     //   1111: aload #8
/*     */     //   1113: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SliderMetrics;
/*     */     //   1116: invokevirtual getStepLineHeight-D9Ej5fM : ()F
/*     */     //   1119: fstore #22
/*     */     //   1121: iconst_0
/*     */     //   1122: istore #23
/*     */     //   1124: fload #21
/*     */     //   1126: fload #22
/*     */     //   1128: fadd
/*     */     //   1129: invokestatic constructor-impl : (F)F
/*     */     //   1132: goto -> 1147
/*     */     //   1135: iconst_0
/*     */     //   1136: istore #21
/*     */     //   1138: iconst_0
/*     */     //   1139: istore #22
/*     */     //   1141: iload #21
/*     */     //   1143: i2f
/*     */     //   1144: invokestatic constructor-impl : (F)F
/*     */     //   1147: fstore #20
/*     */     //   1149: lload #18
/*     */     //   1151: invokestatic getHeight-D9Ej5fM : (J)F
/*     */     //   1154: fstore #22
/*     */     //   1156: aload #8
/*     */     //   1158: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SliderMetrics;
/*     */     //   1161: invokevirtual getThumbBorderWidth-D9Ej5fM : ()F
/*     */     //   1164: fstore #23
/*     */     //   1166: iconst_2
/*     */     //   1167: istore #24
/*     */     //   1169: iconst_0
/*     */     //   1170: istore #25
/*     */     //   1172: fload #23
/*     */     //   1174: iload #24
/*     */     //   1176: i2f
/*     */     //   1177: fmul
/*     */     //   1178: invokestatic constructor-impl : (F)F
/*     */     //   1181: fstore #23
/*     */     //   1183: nop
/*     */     //   1184: iconst_0
/*     */     //   1185: istore #24
/*     */     //   1187: fload #22
/*     */     //   1189: fload #23
/*     */     //   1191: fadd
/*     */     //   1192: invokestatic constructor-impl : (F)F
/*     */     //   1195: fstore #22
/*     */     //   1197: nop
/*     */     //   1198: iconst_0
/*     */     //   1199: istore #23
/*     */     //   1201: fload #22
/*     */     //   1203: fload #20
/*     */     //   1205: fadd
/*     */     //   1206: invokestatic constructor-impl : (F)F
/*     */     //   1209: fstore #21
/*     */     //   1211: aload_2
/*     */     //   1212: lload #18
/*     */     //   1214: invokestatic getHeight-D9Ej5fM : (J)F
/*     */     //   1217: fstore #22
/*     */     //   1219: iconst_2
/*     */     //   1220: istore #23
/*     */     //   1222: iconst_0
/*     */     //   1223: istore #24
/*     */     //   1225: fload #22
/*     */     //   1227: iload #23
/*     */     //   1229: i2f
/*     */     //   1230: fmul
/*     */     //   1231: invokestatic constructor-impl : (F)F
/*     */     //   1234: fload #21
/*     */     //   1236: fconst_0
/*     */     //   1237: fconst_0
/*     */     //   1238: bipush #12
/*     */     //   1240: aconst_null
/*     */     //   1241: invokestatic requiredSizeIn-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1244: fload_0
/*     */     //   1245: iload_3
/*     */     //   1246: aload_1
/*     */     //   1247: aload #6
/*     */     //   1249: aload #4
/*     */     //   1251: iload #5
/*     */     //   1253: invokestatic sliderSemantics : (Landroidx/compose/ui/Modifier;FZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/ranges/ClosedFloatingPointRange;I)Landroidx/compose/ui/Modifier;
/*     */     //   1256: aload #17
/*     */     //   1258: invokestatic focusRequester : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;)Landroidx/compose/ui/Modifier;
/*     */     //   1261: iload_3
/*     */     //   1262: aload #7
/*     */     //   1264: invokestatic focusable : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;)Landroidx/compose/ui/Modifier;
/*     */     //   1267: iload_3
/*     */     //   1268: iload #5
/*     */     //   1270: aload #4
/*     */     //   1272: fload_0
/*     */     //   1273: iload #16
/*     */     //   1275: aload #13
/*     */     //   1277: aload #14
/*     */     //   1279: invokestatic slideOnKeyEvents : (Landroidx/compose/ui/Modifier;ZILkotlin/ranges/ClosedFloatingPointRange;FZLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;)Landroidx/compose/ui/Modifier;
/*     */     //   1282: aconst_null
/*     */     //   1283: iconst_0
/*     */     //   1284: ldc_w 477427455
/*     */     //   1287: iconst_1
/*     */     //   1288: new org/jetbrains/jewel/ui/component/SliderKt$Slider$3
/*     */     //   1291: dup
/*     */     //   1292: aload #4
/*     */     //   1294: fload_0
/*     */     //   1295: aload #15
/*     */     //   1297: aload #6
/*     */     //   1299: aload #7
/*     */     //   1301: iload #16
/*     */     //   1303: iload_3
/*     */     //   1304: aload #8
/*     */     //   1306: fload #21
/*     */     //   1308: lload #18
/*     */     //   1310: aload #13
/*     */     //   1312: aload #17
/*     */     //   1314: invokespecial <init> : (Lkotlin/ranges/ClosedFloatingPointRange;FLjava/util/List;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZZLorg/jetbrains/jewel/ui/component/styling/SliderStyle;FJLandroidx/compose/runtime/State;Landroidx/compose/ui/focus/FocusRequester;)V
/*     */     //   1317: aload #9
/*     */     //   1319: bipush #54
/*     */     //   1321: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1324: checkcast kotlin/jvm/functions/Function3
/*     */     //   1327: aload #9
/*     */     //   1329: sipush #3072
/*     */     //   1332: bipush #6
/*     */     //   1334: invokestatic BoxWithConstraints : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1337: invokestatic isTraceInProgress : ()Z
/*     */     //   1340: ifeq -> 1356
/*     */     //   1343: invokestatic traceEventEnd : ()V
/*     */     //   1346: goto -> 1356
/*     */     //   1349: aload #9
/*     */     //   1351: invokeinterface skipToGroupEnd : ()V
/*     */     //   1356: aload #9
/*     */     //   1358: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1363: dup
/*     */     //   1364: ifnull -> 1398
/*     */     //   1367: fload_0
/*     */     //   1368: aload_1
/*     */     //   1369: aload_2
/*     */     //   1370: iload_3
/*     */     //   1371: aload #4
/*     */     //   1373: iload #5
/*     */     //   1375: aload #6
/*     */     //   1377: aload #7
/*     */     //   1379: aload #8
/*     */     //   1381: iload #10
/*     */     //   1383: iload #11
/*     */     //   1385: <illegal opcode> invoke : (FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/SliderStyle;II)Lkotlin/jvm/functions/Function2;
/*     */     //   1390: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1395: goto -> 1399
/*     */     //   1398: pop
/*     */     //   1399: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #102	-> 6
/*     */     //   #95	-> 506
/*     */     //   #96	-> 521
/*     */     //   #97	-> 531
/*     */     //   #98	-> 553
/*     */     //   #99	-> 564
/*     */     //   #100	-> 576
/*     */     //   #708	-> 595
/*     */     //   #709	-> 607
/*     */     //   #710	-> 618
/*     */     //   #100	-> 621
/*     */     //   #710	-> 624
/*     */     //   #711	-> 626
/*     */     //   #712	-> 635
/*     */     //   #713	-> 640
/*     */     //   #709	-> 642
/*     */     //   #708	-> 643
/*     */     //   #708	-> 644
/*     */     //   #100	-> 645
/*     */     //   #101	-> 670
/*     */     //   #102	-> 750
/*     */     //   #103	-> 753
/*     */     //   #714	-> 766
/*     */     //   #103	-> 771
/*     */     //   #103	-> 772
/*     */     //   #105	-> 787
/*     */     //   #106	-> 802
/*     */     //   #107	-> 849
/*     */     //   #715	-> 853
/*     */     //   #716	-> 865
/*     */     //   #717	-> 881
/*     */     //   #107	-> 884
/*     */     //   #717	-> 889
/*     */     //   #718	-> 891
/*     */     //   #719	-> 900
/*     */     //   #720	-> 905
/*     */     //   #716	-> 907
/*     */     //   #715	-> 908
/*     */     //   #715	-> 909
/*     */     //   #107	-> 910
/*     */     //   #108	-> 926
/*     */     //   #721	-> 946
/*     */     //   #108	-> 967
/*     */     //   #110	-> 996
/*     */     //   #722	-> 1000
/*     */     //   #723	-> 1012
/*     */     //   #724	-> 1023
/*     */     //   #110	-> 1026
/*     */     //   #724	-> 1033
/*     */     //   #725	-> 1035
/*     */     //   #726	-> 1044
/*     */     //   #727	-> 1049
/*     */     //   #723	-> 1051
/*     */     //   #722	-> 1052
/*     */     //   #722	-> 1053
/*     */     //   #110	-> 1054
/*     */     //   #111	-> 1070
/*     */     //   #113	-> 1080
/*     */     //   #113	-> 1098
/*     */     //   #114	-> 1101
/*     */     //   #728	-> 1124
/*     */     //   #116	-> 1135
/*     */     //   #729	-> 1141
/*     */     //   #113	-> 1147
/*     */     //   #112	-> 1147
/*     */     //   #119	-> 1149
/*     */     //   #730	-> 1172
/*     */     //   #119	-> 1183
/*     */     //   #731	-> 1187
/*     */     //   #119	-> 1197
/*     */     //   #731	-> 1201
/*     */     //   #119	-> 1209
/*     */     //   #122	-> 1211
/*     */     //   #123	-> 1212
/*     */     //   #732	-> 1225
/*     */     //   #123	-> 1234
/*     */     //   #124	-> 1244
/*     */     //   #125	-> 1256
/*     */     //   #126	-> 1261
/*     */     //   #127	-> 1267
/*     */     //   #128	-> 1284
/*     */     //   #121	-> 1334
/*     */     //   #214	-> 1349
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   621	3	19	$i$a$-cache-SliderKt$Slider$1	I
/*     */     //   626	11	19	value$iv	Ljava/lang/Object;
/*     */     //   607	36	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   604	39	17	it$iv	Ljava/lang/Object;
/*     */     //   595	50	16	$i$f$cache	I
/*     */     //   592	53	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   592	53	15	invalid$iv	Z
/*     */     //   769	3	14	$i$a$-require-SliderKt$Slider$2	I
/*     */     //   884	5	22	$i$a$-cache-SliderKt$Slider$tickFractions$1	I
/*     */     //   891	11	23	value$iv	Ljava/lang/Object;
/*     */     //   865	43	21	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   862	46	20	it$iv	Ljava/lang/Object;
/*     */     //   853	57	19	$i$f$cache	I
/*     */     //   850	60	17	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   850	60	18	invalid$iv	Z
/*     */     //   940	27	19	$i$f$getCurrent	I
/*     */     //   937	30	17	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   937	30	18	$changed$iv	I
/*     */     //   1026	7	24	$i$a$-cache-SliderKt$Slider$focusRequester$1	I
/*     */     //   1035	11	24	value$iv	Ljava/lang/Object;
/*     */     //   1012	40	23	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1009	43	22	it$iv	Ljava/lang/Object;
/*     */     //   1000	54	21	$i$f$cache	I
/*     */     //   997	57	19	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   997	57	20	invalid$iv	Z
/*     */     //   1124	8	23	$i$f$plus-5rwHm24	I
/*     */     //   1121	11	21	arg0$iv	F
/*     */     //   1121	11	22	other$iv	F
/*     */     //   1141	6	22	$i$f$getDp	I
/*     */     //   1138	9	21	$this$dp$iv	I
/*     */     //   1172	9	25	$i$f$times-u2uoSUM	I
/*     */     //   1169	12	23	arg0$iv	F
/*     */     //   1169	12	24	other$iv	I
/*     */     //   1187	8	24	$i$f$plus-5rwHm24	I
/*     */     //   1184	11	22	arg0$iv	F
/*     */     //   1184	11	23	other$iv	F
/*     */     //   1201	8	23	$i$f$plus-5rwHm24	I
/*     */     //   1198	11	22	arg0$iv	F
/*     */     //   1225	9	24	$i$f$times-u2uoSUM	I
/*     */     //   1222	12	22	arg0$iv	F
/*     */     //   1222	12	23	other$iv	I
/*     */     //   802	544	13	onValueChangeState	Landroidx/compose/runtime/State;
/*     */     //   819	527	14	onValueChangeFinishedState	Landroidx/compose/runtime/State;
/*     */     //   926	420	15	tickFractions	Ljava/util/List;
/*     */     //   980	366	16	isRtl	Z
/*     */     //   1070	276	17	focusRequester	Landroidx/compose/ui/focus/FocusRequester;
/*     */     //   1080	266	18	thumbSize	J
/*     */     //   1149	197	20	ticksHeight	F
/*     */     //   1211	135	21	minHeight	F
/*     */     //   21	1379	12	$dirty	I
/*     */     //   0	1400	0	value	F
/*     */     //   0	1400	1	onValueChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1400	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1400	3	enabled	Z
/*     */     //   0	1400	4	valueRange	Lkotlin/ranges/ClosedFloatingPointRange;
/*     */     //   0	1400	5	steps	I
/*     */     //   0	1400	6	onValueChangeFinished	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1400	7	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1400	8	style	Lorg/jetbrains/jewel/ui/component/styling/SliderStyle;
/*     */     //   0	1400	9	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1400	10	$changed	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\norg/jetbrains/jewel/ui/component/SliderKt$Slider$3\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,707:1\n77#2:708\n481#3:709\n480#3,4:710\n484#3,2:717\n488#3:723\n1225#4,3:714\n1228#4,3:720\n1225#4,6:724\n1225#4,6:730\n1225#4,6:736\n1225#4,6:742\n1225#4,6:748\n1225#4,6:754\n480#5:719\n*S KotlinDebug\n*F\n+ 1 Slider.kt\norg/jetbrains/jewel/ui/component/SliderKt$Slider$3\n*L\n133#1:708\n142#1:709\n142#1:710,4\n142#1:717,2\n142#1:723\n142#1:714,3\n142#1:720,3\n143#1:724,6\n144#1:730,6\n147#1:736,6\n156#1:742,6\n160#1:748,6\n196#1:754,6\n142#1:719\n*E\n"})
/*     */   static final class SliderKt$Slider$3
/*     */     implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit>
/*     */   {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(BoxWithConstraintsScope $this$BoxWithConstraints, Composer $composer, int $changed) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$BoxWithConstraints'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: iload_3
/*     */       //   7: istore #4
/*     */       //   9: iload_3
/*     */       //   10: bipush #6
/*     */       //   12: iand
/*     */       //   13: ifne -> 36
/*     */       //   16: iload #4
/*     */       //   18: aload_2
/*     */       //   19: aload_1
/*     */       //   20: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   25: ifeq -> 32
/*     */       //   28: iconst_4
/*     */       //   29: goto -> 33
/*     */       //   32: iconst_2
/*     */       //   33: ior
/*     */       //   34: istore #4
/*     */       //   36: iload #4
/*     */       //   38: bipush #19
/*     */       //   40: iand
/*     */       //   41: bipush #18
/*     */       //   43: if_icmpne -> 55
/*     */       //   46: aload_2
/*     */       //   47: invokeinterface getSkipping : ()Z
/*     */       //   52: ifne -> 1453
/*     */       //   55: invokestatic isTraceInProgress : ()Z
/*     */       //   58: ifeq -> 71
/*     */       //   61: ldc 477427455
/*     */       //   63: iload #4
/*     */       //   65: iconst_m1
/*     */       //   66: ldc 'org.jetbrains.jewel.ui.component.Slider.<anonymous> (Slider.kt:128)'
/*     */       //   68: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   71: aload_1
/*     */       //   72: invokeinterface getConstraints-msEJaDk : ()J
/*     */       //   77: invokestatic getMaxWidth-impl : (J)I
/*     */       //   80: i2f
/*     */       //   81: fstore #5
/*     */       //   83: new kotlin/jvm/internal/Ref$FloatRef
/*     */       //   86: dup
/*     */       //   87: invokespecial <init> : ()V
/*     */       //   90: astore #6
/*     */       //   92: new kotlin/jvm/internal/Ref$FloatRef
/*     */       //   95: dup
/*     */       //   96: invokespecial <init> : ()V
/*     */       //   99: astore #7
/*     */       //   101: invokestatic getLocalDensity : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */       //   104: checkcast androidx/compose/runtime/CompositionLocal
/*     */       //   107: astore #8
/*     */       //   109: iconst_0
/*     */       //   110: istore #9
/*     */       //   112: iconst_0
/*     */       //   113: istore #10
/*     */       //   115: aload_2
/*     */       //   116: ldc 2023513938
/*     */       //   118: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */       //   120: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   123: aload_2
/*     */       //   124: aload #8
/*     */       //   126: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */       //   131: astore #11
/*     */       //   133: aload_2
/*     */       //   134: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   137: aload #11
/*     */       //   139: astore #8
/*     */       //   141: aload_0
/*     */       //   142: getfield $thumbSize : J
/*     */       //   145: lstore #9
/*     */       //   147: aload #8
/*     */       //   149: checkcast androidx/compose/ui/unit/Density
/*     */       //   152: astore #11
/*     */       //   154: iconst_0
/*     */       //   155: istore #12
/*     */       //   157: aload #6
/*     */       //   159: fload #5
/*     */       //   161: aload #11
/*     */       //   163: lload #9
/*     */       //   165: invokestatic getWidth-D9Ej5fM : (J)F
/*     */       //   168: invokeinterface toPx-0680j_4 : (F)F
/*     */       //   173: fsub
/*     */       //   174: fconst_0
/*     */       //   175: invokestatic max : (FF)F
/*     */       //   178: putfield element : F
/*     */       //   181: aload #7
/*     */       //   183: aload #11
/*     */       //   185: lload #9
/*     */       //   187: invokestatic getWidth-D9Ej5fM : (J)F
/*     */       //   190: invokeinterface toPx-0680j_4 : (F)F
/*     */       //   195: aload #6
/*     */       //   197: getfield element : F
/*     */       //   200: invokestatic min : (FF)F
/*     */       //   203: putfield element : F
/*     */       //   206: nop
/*     */       //   207: iconst_0
/*     */       //   208: istore #10
/*     */       //   210: nop
/*     */       //   211: iconst_0
/*     */       //   212: istore #11
/*     */       //   214: aload_2
/*     */       //   215: ldc 773894976
/*     */       //   217: ldc 'CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp'
/*     */       //   219: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   222: aload_2
/*     */       //   223: astore #12
/*     */       //   225: aload_2
/*     */       //   226: ldc -954370320
/*     */       //   228: ldc 'CC(remember):Effects.kt#9igjgp'
/*     */       //   230: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   233: aload_2
/*     */       //   234: astore #13
/*     */       //   236: iconst_0
/*     */       //   237: istore #14
/*     */       //   239: iconst_0
/*     */       //   240: istore #15
/*     */       //   242: aload #13
/*     */       //   244: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   249: astore #16
/*     */       //   251: iconst_0
/*     */       //   252: istore #17
/*     */       //   254: aload #16
/*     */       //   256: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   259: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   262: if_acmpne -> 309
/*     */       //   265: iconst_0
/*     */       //   266: istore #18
/*     */       //   268: iconst_0
/*     */       //   269: istore #19
/*     */       //   271: getstatic kotlin/coroutines/EmptyCoroutineContext.INSTANCE : Lkotlin/coroutines/EmptyCoroutineContext;
/*     */       //   274: checkcast kotlin/coroutines/CoroutineContext
/*     */       //   277: aload #12
/*     */       //   279: invokestatic createCompositionCoroutineScope : (Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;
/*     */       //   282: astore #35
/*     */       //   284: new androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */       //   287: dup
/*     */       //   288: aload #35
/*     */       //   290: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;)V
/*     */       //   293: astore #19
/*     */       //   295: aload #13
/*     */       //   297: aload #19
/*     */       //   299: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   304: aload #19
/*     */       //   306: goto -> 311
/*     */       //   309: aload #16
/*     */       //   311: nop
/*     */       //   312: nop
/*     */       //   313: nop
/*     */       //   314: checkcast androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */       //   317: astore #20
/*     */       //   319: aload_2
/*     */       //   320: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   323: aload #20
/*     */       //   325: astore #21
/*     */       //   327: aload #21
/*     */       //   329: invokevirtual getCoroutineScope : ()Lkotlinx/coroutines/CoroutineScope;
/*     */       //   332: astore #20
/*     */       //   334: aload_2
/*     */       //   335: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   338: aload #20
/*     */       //   340: nop
/*     */       //   341: astore #8
/*     */       //   343: aload_2
/*     */       //   344: ldc 1210089908
/*     */       //   346: invokeinterface startReplaceGroup : (I)V
/*     */       //   351: aload_2
/*     */       //   352: astore #11
/*     */       //   354: iconst_0
/*     */       //   355: istore #12
/*     */       //   357: aload_0
/*     */       //   358: getfield $value : F
/*     */       //   361: fstore #13
/*     */       //   363: aload_0
/*     */       //   364: getfield $valueRange : Lkotlin/ranges/ClosedFloatingPointRange;
/*     */       //   367: astore #14
/*     */       //   369: iconst_0
/*     */       //   370: istore #15
/*     */       //   372: aload #11
/*     */       //   374: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   379: astore #16
/*     */       //   381: iconst_0
/*     */       //   382: istore #17
/*     */       //   384: aload #16
/*     */       //   386: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   389: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   392: if_acmpne -> 428
/*     */       //   395: iconst_0
/*     */       //   396: istore #18
/*     */       //   398: aload #14
/*     */       //   400: aload #7
/*     */       //   402: aload #6
/*     */       //   404: fload #13
/*     */       //   406: invokestatic invoke$scaleToOffset : (Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F
/*     */       //   409: invokestatic mutableFloatStateOf : (F)Landroidx/compose/runtime/MutableFloatState;
/*     */       //   412: astore #19
/*     */       //   414: aload #11
/*     */       //   416: aload #19
/*     */       //   418: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   423: aload #19
/*     */       //   425: goto -> 430
/*     */       //   428: aload #16
/*     */       //   430: nop
/*     */       //   431: nop
/*     */       //   432: nop
/*     */       //   433: checkcast androidx/compose/runtime/MutableFloatState
/*     */       //   436: astore #10
/*     */       //   438: aload_2
/*     */       //   439: invokeinterface endReplaceGroup : ()V
/*     */       //   444: aload #10
/*     */       //   446: astore #9
/*     */       //   448: aload_2
/*     */       //   449: ldc 1210092482
/*     */       //   451: invokeinterface startReplaceGroup : (I)V
/*     */       //   456: aload_2
/*     */       //   457: astore #12
/*     */       //   459: iconst_0
/*     */       //   460: istore #13
/*     */       //   462: nop
/*     */       //   463: iconst_0
/*     */       //   464: istore #14
/*     */       //   466: aload #12
/*     */       //   468: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   473: astore #15
/*     */       //   475: iconst_0
/*     */       //   476: istore #16
/*     */       //   478: aload #15
/*     */       //   480: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   483: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   486: if_acmpne -> 512
/*     */       //   489: iconst_0
/*     */       //   490: istore #17
/*     */       //   492: fconst_0
/*     */       //   493: invokestatic mutableFloatStateOf : (F)Landroidx/compose/runtime/MutableFloatState;
/*     */       //   496: astore #17
/*     */       //   498: aload #12
/*     */       //   500: aload #17
/*     */       //   502: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   507: aload #17
/*     */       //   509: goto -> 514
/*     */       //   512: aload #15
/*     */       //   514: nop
/*     */       //   515: nop
/*     */       //   516: nop
/*     */       //   517: checkcast androidx/compose/runtime/MutableFloatState
/*     */       //   520: astore #11
/*     */       //   522: aload_2
/*     */       //   523: invokeinterface endReplaceGroup : ()V
/*     */       //   528: aload #11
/*     */       //   530: astore #10
/*     */       //   532: aload_2
/*     */       //   533: ldc 1210095394
/*     */       //   535: invokeinterface startReplaceGroup : (I)V
/*     */       //   540: aload_2
/*     */       //   541: astore #13
/*     */       //   543: aload_2
/*     */       //   544: aload #7
/*     */       //   546: getfield element : F
/*     */       //   549: invokeinterface changed : (F)Z
/*     */       //   554: aload_2
/*     */       //   555: aload #6
/*     */       //   557: getfield element : F
/*     */       //   560: invokeinterface changed : (F)Z
/*     */       //   565: ior
/*     */       //   566: aload_2
/*     */       //   567: aload_0
/*     */       //   568: getfield $valueRange : Lkotlin/ranges/ClosedFloatingPointRange;
/*     */       //   571: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   576: ior
/*     */       //   577: istore #14
/*     */       //   579: aload_0
/*     */       //   580: getfield $onValueChangeState : Landroidx/compose/runtime/State;
/*     */       //   583: astore #15
/*     */       //   585: aload_0
/*     */       //   586: getfield $valueRange : Lkotlin/ranges/ClosedFloatingPointRange;
/*     */       //   589: astore #16
/*     */       //   591: iconst_0
/*     */       //   592: istore #17
/*     */       //   594: aload #13
/*     */       //   596: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   601: astore #18
/*     */       //   603: iconst_0
/*     */       //   604: istore #19
/*     */       //   606: iload #14
/*     */       //   608: ifne -> 622
/*     */       //   611: aload #18
/*     */       //   613: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   616: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   619: if_acmpne -> 666
/*     */       //   622: iconst_0
/*     */       //   623: istore #20
/*     */       //   625: new org/jetbrains/jewel/ui/component/SliderDraggableState
/*     */       //   628: dup
/*     */       //   629: aload #9
/*     */       //   631: aload #10
/*     */       //   633: aload #7
/*     */       //   635: aload #6
/*     */       //   637: aload #15
/*     */       //   639: aload #16
/*     */       //   641: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableFloatState;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/runtime/State;Lkotlin/ranges/ClosedFloatingPointRange;)Lkotlin/jvm/functions/Function1;
/*     */       //   646: invokespecial <init> : (Lkotlin/jvm/functions/Function1;)V
/*     */       //   649: nop
/*     */       //   650: astore #21
/*     */       //   652: aload #13
/*     */       //   654: aload #21
/*     */       //   656: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   661: aload #21
/*     */       //   663: goto -> 668
/*     */       //   666: aload #18
/*     */       //   668: nop
/*     */       //   669: nop
/*     */       //   670: nop
/*     */       //   671: checkcast org/jetbrains/jewel/ui/component/SliderDraggableState
/*     */       //   674: astore #12
/*     */       //   676: aload_2
/*     */       //   677: invokeinterface endReplaceGroup : ()V
/*     */       //   682: aload #12
/*     */       //   684: astore #11
/*     */       //   686: aload_2
/*     */       //   687: ldc 1210109485
/*     */       //   689: invokeinterface startReplaceGroup : (I)V
/*     */       //   694: aload_2
/*     */       //   695: astore #13
/*     */       //   697: aload_2
/*     */       //   698: aload_0
/*     */       //   699: getfield $valueRange : Lkotlin/ranges/ClosedFloatingPointRange;
/*     */       //   702: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   707: aload_2
/*     */       //   708: aload #7
/*     */       //   710: getfield element : F
/*     */       //   713: invokeinterface changed : (F)Z
/*     */       //   718: ior
/*     */       //   719: aload_2
/*     */       //   720: aload #6
/*     */       //   722: getfield element : F
/*     */       //   725: invokeinterface changed : (F)Z
/*     */       //   730: ior
/*     */       //   731: istore #14
/*     */       //   733: aload_0
/*     */       //   734: getfield $valueRange : Lkotlin/ranges/ClosedFloatingPointRange;
/*     */       //   737: astore #15
/*     */       //   739: iconst_0
/*     */       //   740: istore #16
/*     */       //   742: aload #13
/*     */       //   744: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   749: astore #17
/*     */       //   751: iconst_0
/*     */       //   752: istore #18
/*     */       //   754: iload #14
/*     */       //   756: ifne -> 770
/*     */       //   759: aload #17
/*     */       //   761: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   764: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   767: if_acmpne -> 805
/*     */       //   770: iconst_0
/*     */       //   771: istore #19
/*     */       //   773: new org/jetbrains/jewel/ui/component/SliderKt$Slider$3$2$1
/*     */       //   776: dup
/*     */       //   777: aload #15
/*     */       //   779: aload #7
/*     */       //   781: aload #6
/*     */       //   783: invokespecial <init> : (Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;)V
/*     */       //   786: checkcast kotlin/reflect/KFunction
/*     */       //   789: astore #20
/*     */       //   791: aload #13
/*     */       //   793: aload #20
/*     */       //   795: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   800: aload #20
/*     */       //   802: goto -> 807
/*     */       //   805: aload #17
/*     */       //   807: nop
/*     */       //   808: nop
/*     */       //   809: nop
/*     */       //   810: checkcast kotlin/reflect/KFunction
/*     */       //   813: astore #12
/*     */       //   815: aload_2
/*     */       //   816: invokeinterface endReplaceGroup : ()V
/*     */       //   821: aload #12
/*     */       //   823: checkcast kotlin/jvm/functions/Function1
/*     */       //   826: aload_0
/*     */       //   827: getfield $valueRange : Lkotlin/ranges/ClosedFloatingPointRange;
/*     */       //   830: aload #7
/*     */       //   832: getfield element : F
/*     */       //   835: aload #6
/*     */       //   837: getfield element : F
/*     */       //   840: invokestatic rangeTo : (FF)Lkotlin/ranges/ClosedFloatingPointRange;
/*     */       //   843: aload #9
/*     */       //   845: checkcast androidx/compose/runtime/MutableState
/*     */       //   848: aload_0
/*     */       //   849: getfield $value : F
/*     */       //   852: aload_2
/*     */       //   853: sipush #3072
/*     */       //   856: invokestatic access$CorrectValueSideEffect : (Lkotlin/jvm/functions/Function1;Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/MutableState;FLandroidx/compose/runtime/Composer;I)V
/*     */       //   859: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */       //   862: aload_2
/*     */       //   863: bipush #6
/*     */       //   865: invokevirtual isSwingCompatMode : (Landroidx/compose/runtime/Composer;I)Z
/*     */       //   868: ifne -> 875
/*     */       //   871: iconst_1
/*     */       //   872: goto -> 876
/*     */       //   875: iconst_0
/*     */       //   876: istore #12
/*     */       //   878: aload_2
/*     */       //   879: ldc_w 1210116667
/*     */       //   882: invokeinterface startReplaceGroup : (I)V
/*     */       //   887: aload_2
/*     */       //   888: astore #15
/*     */       //   890: aload_2
/*     */       //   891: aload_0
/*     */       //   892: getfield $tickFractions : Ljava/util/List;
/*     */       //   895: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   900: aload_2
/*     */       //   901: aload #7
/*     */       //   903: getfield element : F
/*     */       //   906: invokeinterface changed : (F)Z
/*     */       //   911: ior
/*     */       //   912: aload_2
/*     */       //   913: aload #6
/*     */       //   915: getfield element : F
/*     */       //   918: invokeinterface changed : (F)Z
/*     */       //   923: ior
/*     */       //   924: aload_2
/*     */       //   925: aload #8
/*     */       //   927: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   932: ior
/*     */       //   933: aload_2
/*     */       //   934: iload #12
/*     */       //   936: invokeinterface changed : (Z)Z
/*     */       //   941: ior
/*     */       //   942: aload_2
/*     */       //   943: aload #11
/*     */       //   945: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   950: ior
/*     */       //   951: aload_2
/*     */       //   952: aload_0
/*     */       //   953: getfield $onValueChangeFinished : Lkotlin/jvm/functions/Function0;
/*     */       //   956: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   961: ior
/*     */       //   962: istore #16
/*     */       //   964: aload_0
/*     */       //   965: getfield $tickFractions : Ljava/util/List;
/*     */       //   968: astore #17
/*     */       //   970: aload_0
/*     */       //   971: getfield $focusRequester : Landroidx/compose/ui/focus/FocusRequester;
/*     */       //   974: astore #18
/*     */       //   976: aload_0
/*     */       //   977: getfield $onValueChangeFinished : Lkotlin/jvm/functions/Function0;
/*     */       //   980: astore #19
/*     */       //   982: iconst_0
/*     */       //   983: istore #20
/*     */       //   985: aload #15
/*     */       //   987: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   992: astore #21
/*     */       //   994: iconst_0
/*     */       //   995: istore #22
/*     */       //   997: iload #16
/*     */       //   999: ifne -> 1013
/*     */       //   1002: aload #21
/*     */       //   1004: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   1007: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   1010: if_acmpne -> 1055
/*     */       //   1013: iconst_0
/*     */       //   1014: istore #23
/*     */       //   1016: aload #9
/*     */       //   1018: aload #17
/*     */       //   1020: aload #7
/*     */       //   1022: aload #6
/*     */       //   1024: aload #18
/*     */       //   1026: aload #8
/*     */       //   1028: aload #11
/*     */       //   1030: aload #19
/*     */       //   1032: iload #12
/*     */       //   1034: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableFloatState;Ljava/util/List;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/ui/focus/FocusRequester;Lkotlinx/coroutines/CoroutineScope;Lorg/jetbrains/jewel/ui/component/SliderDraggableState;Lkotlin/jvm/functions/Function0;Z)Lkotlin/jvm/functions/Function1;
/*     */       //   1039: astore #24
/*     */       //   1041: aload #15
/*     */       //   1043: aload #24
/*     */       //   1045: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   1050: aload #24
/*     */       //   1052: goto -> 1057
/*     */       //   1055: aload #21
/*     */       //   1057: nop
/*     */       //   1058: nop
/*     */       //   1059: nop
/*     */       //   1060: checkcast kotlin/jvm/functions/Function1
/*     */       //   1063: astore #14
/*     */       //   1065: aload_2
/*     */       //   1066: invokeinterface endReplaceGroup : ()V
/*     */       //   1071: aload #14
/*     */       //   1073: aload_2
/*     */       //   1074: iconst_0
/*     */       //   1075: invokestatic rememberUpdatedState : (Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */       //   1078: astore #13
/*     */       //   1080: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   1083: checkcast androidx/compose/ui/Modifier
/*     */       //   1086: aload #11
/*     */       //   1088: checkcast androidx/compose/foundation/gestures/DraggableState
/*     */       //   1091: aload_0
/*     */       //   1092: getfield $interactionSource : Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */       //   1095: fload #5
/*     */       //   1097: aload_0
/*     */       //   1098: getfield $isRtl : Z
/*     */       //   1101: aload #9
/*     */       //   1103: checkcast androidx/compose/runtime/State
/*     */       //   1106: aload #13
/*     */       //   1108: aload #10
/*     */       //   1110: checkcast androidx/compose/runtime/MutableState
/*     */       //   1113: aload_0
/*     */       //   1114: getfield $enabled : Z
/*     */       //   1117: invokestatic access$sliderTapModifier : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;FZLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Z)Landroidx/compose/ui/Modifier;
/*     */       //   1120: astore #14
/*     */       //   1122: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   1125: astore #16
/*     */       //   1127: getstatic androidx/compose/foundation/gestures/Orientation.Horizontal : Landroidx/compose/foundation/gestures/Orientation;
/*     */       //   1130: astore #17
/*     */       //   1132: aload #11
/*     */       //   1134: invokevirtual isDragging : ()Z
/*     */       //   1137: istore #18
/*     */       //   1139: aload #16
/*     */       //   1141: checkcast androidx/compose/ui/Modifier
/*     */       //   1144: aload #11
/*     */       //   1146: checkcast androidx/compose/foundation/gestures/DraggableState
/*     */       //   1149: aload #17
/*     */       //   1151: aload_0
/*     */       //   1152: getfield $enabled : Z
/*     */       //   1155: aload_0
/*     */       //   1156: getfield $interactionSource : Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */       //   1159: iload #18
/*     */       //   1161: aconst_null
/*     */       //   1162: aload_2
/*     */       //   1163: ldc_w 1210161813
/*     */       //   1166: invokeinterface startReplaceGroup : (I)V
/*     */       //   1171: aload_2
/*     */       //   1172: astore #20
/*     */       //   1174: aload_2
/*     */       //   1175: aload #13
/*     */       //   1177: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   1182: istore #21
/*     */       //   1184: nop
/*     */       //   1185: iconst_0
/*     */       //   1186: istore #22
/*     */       //   1188: aload #20
/*     */       //   1190: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   1195: astore #23
/*     */       //   1197: iconst_0
/*     */       //   1198: istore #24
/*     */       //   1200: iload #21
/*     */       //   1202: ifne -> 1216
/*     */       //   1205: aload #23
/*     */       //   1207: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   1210: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   1213: if_acmpne -> 1280
/*     */       //   1216: astore #33
/*     */       //   1218: istore #32
/*     */       //   1220: astore #31
/*     */       //   1222: istore #30
/*     */       //   1224: astore #29
/*     */       //   1226: astore #28
/*     */       //   1228: astore #27
/*     */       //   1230: iconst_0
/*     */       //   1231: istore #25
/*     */       //   1233: new org/jetbrains/jewel/ui/component/SliderKt$Slider$3$drag$1$1
/*     */       //   1236: dup
/*     */       //   1237: aload #13
/*     */       //   1239: aconst_null
/*     */       //   1240: invokespecial <init> : (Landroidx/compose/runtime/State;Lkotlin/coroutines/Continuation;)V
/*     */       //   1243: checkcast kotlin/jvm/functions/Function3
/*     */       //   1246: astore #34
/*     */       //   1248: aload #27
/*     */       //   1250: aload #28
/*     */       //   1252: aload #29
/*     */       //   1254: iload #30
/*     */       //   1256: aload #31
/*     */       //   1258: iload #32
/*     */       //   1260: aload #33
/*     */       //   1262: aload #34
/*     */       //   1264: astore #26
/*     */       //   1266: aload #20
/*     */       //   1268: aload #26
/*     */       //   1270: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   1275: aload #26
/*     */       //   1277: goto -> 1282
/*     */       //   1280: aload #23
/*     */       //   1282: nop
/*     */       //   1283: nop
/*     */       //   1284: nop
/*     */       //   1285: checkcast kotlin/jvm/functions/Function3
/*     */       //   1288: astore #19
/*     */       //   1290: aload_2
/*     */       //   1291: invokeinterface endReplaceGroup : ()V
/*     */       //   1296: aload #19
/*     */       //   1298: aload_0
/*     */       //   1299: getfield $isRtl : Z
/*     */       //   1302: bipush #32
/*     */       //   1304: aconst_null
/*     */       //   1305: invokestatic draggable$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   1308: astore #15
/*     */       //   1310: aload_0
/*     */       //   1311: getfield $value : F
/*     */       //   1314: aload_0
/*     */       //   1315: getfield $valueRange : Lkotlin/ranges/ClosedFloatingPointRange;
/*     */       //   1318: invokeinterface getStart : ()Ljava/lang/Comparable;
/*     */       //   1323: checkcast java/lang/Number
/*     */       //   1326: invokevirtual floatValue : ()F
/*     */       //   1329: aload_0
/*     */       //   1330: getfield $valueRange : Lkotlin/ranges/ClosedFloatingPointRange;
/*     */       //   1333: invokeinterface getEndInclusive : ()Ljava/lang/Comparable;
/*     */       //   1338: checkcast java/lang/Number
/*     */       //   1341: invokevirtual floatValue : ()F
/*     */       //   1344: invokestatic coerceIn : (FFF)F
/*     */       //   1347: fstore #16
/*     */       //   1349: aload_0
/*     */       //   1350: getfield $valueRange : Lkotlin/ranges/ClosedFloatingPointRange;
/*     */       //   1353: invokeinterface getStart : ()Ljava/lang/Comparable;
/*     */       //   1358: checkcast java/lang/Number
/*     */       //   1361: invokevirtual floatValue : ()F
/*     */       //   1364: aload_0
/*     */       //   1365: getfield $valueRange : Lkotlin/ranges/ClosedFloatingPointRange;
/*     */       //   1368: invokeinterface getEndInclusive : ()Ljava/lang/Comparable;
/*     */       //   1373: checkcast java/lang/Number
/*     */       //   1376: invokevirtual floatValue : ()F
/*     */       //   1379: fload #16
/*     */       //   1381: invokestatic access$calcFraction : (FFF)F
/*     */       //   1384: fstore #17
/*     */       //   1386: aload #6
/*     */       //   1388: getfield element : F
/*     */       //   1391: aload #7
/*     */       //   1393: getfield element : F
/*     */       //   1396: fsub
/*     */       //   1397: fstore #18
/*     */       //   1399: aload #14
/*     */       //   1401: aload #15
/*     */       //   1403: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */       //   1408: astore #19
/*     */       //   1410: aload_0
/*     */       //   1411: getfield $enabled : Z
/*     */       //   1414: fload #17
/*     */       //   1416: aload_0
/*     */       //   1417: getfield $tickFractions : Ljava/util/List;
/*     */       //   1420: aload_0
/*     */       //   1421: getfield $style : Lorg/jetbrains/jewel/ui/component/styling/SliderStyle;
/*     */       //   1424: fload #18
/*     */       //   1426: aload_0
/*     */       //   1427: getfield $minHeight : F
/*     */       //   1430: aload_0
/*     */       //   1431: getfield $interactionSource : Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */       //   1434: aload #19
/*     */       //   1436: aload_2
/*     */       //   1437: iconst_0
/*     */       //   1438: invokestatic access$SliderImpl-PfoAEA0 : (ZFLjava/util/List;Lorg/jetbrains/jewel/ui/component/styling/SliderStyle;FFLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */       //   1441: invokestatic isTraceInProgress : ()Z
/*     */       //   1444: ifeq -> 1459
/*     */       //   1447: invokestatic traceEventEnd : ()V
/*     */       //   1450: goto -> 1459
/*     */       //   1453: aload_2
/*     */       //   1454: invokeinterface skipToGroupEnd : ()V
/*     */       //   1459: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #129	-> 36
/*     */       //   #130	-> 83
/*     */       //   #131	-> 92
/*     */       //   #133	-> 101
/*     */       //   #708	-> 120
/*     */       //   #133	-> 141
/*     */       //   #134	-> 157
/*     */       //   #134	-> 178
/*     */       //   #135	-> 181
/*     */       //   #135	-> 203
/*     */       //   #136	-> 206
/*     */       //   #133	-> 207
/*     */       //   #142	-> 210
/*     */       //   #709	-> 219
/*     */       //   #710	-> 222
/*     */       //   #712	-> 223
/*     */       //   #713	-> 230
/*     */       //   #714	-> 242
/*     */       //   #715	-> 254
/*     */       //   #716	-> 265
/*     */       //   #717	-> 268
/*     */       //   #718	-> 268
/*     */       //   #719	-> 271
/*     */       //   #718	-> 274
/*     */       //   #717	-> 282
/*     */       //   #716	-> 293
/*     */       //   #720	-> 295
/*     */       //   #721	-> 304
/*     */       //   #722	-> 309
/*     */       //   #715	-> 311
/*     */       //   #714	-> 312
/*     */       //   #714	-> 313
/*     */       //   #713	-> 314
/*     */       //   #723	-> 327
/*     */       //   #709	-> 335
/*     */       //   #723	-> 340
/*     */       //   #142	-> 341
/*     */       //   #143	-> 357
/*     */       //   #724	-> 372
/*     */       //   #725	-> 384
/*     */       //   #726	-> 395
/*     */       //   #143	-> 398
/*     */       //   #726	-> 412
/*     */       //   #727	-> 414
/*     */       //   #728	-> 423
/*     */       //   #729	-> 428
/*     */       //   #725	-> 430
/*     */       //   #724	-> 431
/*     */       //   #724	-> 432
/*     */       //   #143	-> 433
/*     */       //   #144	-> 462
/*     */       //   #730	-> 466
/*     */       //   #731	-> 478
/*     */       //   #732	-> 489
/*     */       //   #144	-> 492
/*     */       //   #732	-> 496
/*     */       //   #733	-> 498
/*     */       //   #734	-> 507
/*     */       //   #735	-> 512
/*     */       //   #731	-> 514
/*     */       //   #730	-> 515
/*     */       //   #730	-> 516
/*     */       //   #144	-> 517
/*     */       //   #147	-> 544
/*     */       //   #736	-> 594
/*     */       //   #737	-> 606
/*     */       //   #738	-> 622
/*     */       //   #148	-> 625
/*     */       //   #153	-> 649
/*     */       //   #738	-> 650
/*     */       //   #739	-> 652
/*     */       //   #740	-> 661
/*     */       //   #741	-> 666
/*     */       //   #737	-> 668
/*     */       //   #736	-> 669
/*     */       //   #736	-> 670
/*     */       //   #147	-> 671
/*     */       //   #146	-> 684
/*     */       //   #156	-> 733
/*     */       //   #742	-> 742
/*     */       //   #743	-> 754
/*     */       //   #744	-> 770
/*     */       //   #156	-> 773
/*     */       //   #744	-> 789
/*     */       //   #745	-> 791
/*     */       //   #746	-> 800
/*     */       //   #747	-> 805
/*     */       //   #743	-> 807
/*     */       //   #742	-> 808
/*     */       //   #742	-> 809
/*     */       //   #156	-> 810
/*     */       //   #158	-> 859
/*     */       //   #160	-> 964
/*     */       //   #748	-> 985
/*     */       //   #749	-> 997
/*     */       //   #750	-> 1013
/*     */       //   #160	-> 1016
/*     */       //   #750	-> 1039
/*     */       //   #751	-> 1041
/*     */       //   #752	-> 1050
/*     */       //   #753	-> 1055
/*     */       //   #749	-> 1057
/*     */       //   #748	-> 1058
/*     */       //   #748	-> 1059
/*     */       //   #160	-> 1060
/*     */       //   #159	-> 1078
/*     */       //   #179	-> 1080
/*     */       //   #180	-> 1086
/*     */       //   #181	-> 1091
/*     */       //   #182	-> 1095
/*     */       //   #183	-> 1097
/*     */       //   #184	-> 1101
/*     */       //   #185	-> 1106
/*     */       //   #186	-> 1108
/*     */       //   #187	-> 1113
/*     */       //   #179	-> 1117
/*     */       //   #178	-> 1120
/*     */       //   #191	-> 1122
/*     */       //   #192	-> 1127
/*     */       //   #197	-> 1132
/*     */       //   #191	-> 1139
/*     */       //   #198	-> 1144
/*     */       //   #192	-> 1149
/*     */       //   #194	-> 1151
/*     */       //   #195	-> 1155
/*     */       //   #197	-> 1159
/*     */       //   #191	-> 1161
/*     */       //   #196	-> 1184
/*     */       //   #754	-> 1188
/*     */       //   #755	-> 1200
/*     */       //   #756	-> 1216
/*     */       //   #196	-> 1233
/*     */       //   #756	-> 1264
/*     */       //   #757	-> 1266
/*     */       //   #758	-> 1275
/*     */       //   #759	-> 1280
/*     */       //   #755	-> 1282
/*     */       //   #754	-> 1283
/*     */       //   #754	-> 1284
/*     */       //   #196	-> 1285
/*     */       //   #193	-> 1298
/*     */       //   #191	-> 1302
/*     */       //   #190	-> 1308
/*     */       //   #201	-> 1310
/*     */       //   #202	-> 1349
/*     */       //   #209	-> 1386
/*     */       //   #211	-> 1399
/*     */       //   #204	-> 1410
/*     */       //   #205	-> 1414
/*     */       //   #206	-> 1416
/*     */       //   #207	-> 1420
/*     */       //   #209	-> 1424
/*     */       //   #208	-> 1426
/*     */       //   #210	-> 1430
/*     */       //   #211	-> 1434
/*     */       //   #203	-> 1438
/*     */       //   #212	-> 1453
/*     */       //   #213	-> 1459
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   115	24	10	$i$f$getCurrent	I
/*     */       //   112	27	8	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */       //   112	27	9	$changed$iv	I
/*     */       //   157	50	12	$i$a$-with-SliderKt$Slider$3$1	I
/*     */       //   154	53	11	$this$invoke_u24lambda_u240	Landroidx/compose/ui/unit/Density;
/*     */       //   271	3	19	$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1	I
/*     */       //   268	25	18	$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv	I
/*     */       //   295	11	19	value$iv$iv	Ljava/lang/Object;
/*     */       //   254	58	17	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*     */       //   251	61	16	it$iv$iv	Ljava/lang/Object;
/*     */       //   242	72	15	$i$f$cache	I
/*     */       //   239	75	13	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   239	75	14	invalid$iv$iv	Z
/*     */       //   214	127	11	$i$f$rememberCoroutineScope	I
/*     */       //   225	116	12	composer$iv	Landroidx/compose/runtime/Composer;
/*     */       //   327	14	21	wrapper$iv	Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
/*     */       //   211	130	10	$changed$iv	I
/*     */       //   398	14	18	$i$a$-cache-SliderKt$Slider$3$rawOffset$1	I
/*     */       //   414	11	19	value$iv	Ljava/lang/Object;
/*     */       //   384	47	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   381	50	16	it$iv	Ljava/lang/Object;
/*     */       //   372	61	15	$i$f$cache	I
/*     */       //   369	64	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   369	64	12	invalid$iv	Z
/*     */       //   492	4	17	$i$a$-cache-SliderKt$Slider$3$pressOffset$1	I
/*     */       //   498	11	17	value$iv	Ljava/lang/Object;
/*     */       //   478	37	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   475	40	15	it$iv	Ljava/lang/Object;
/*     */       //   466	51	14	$i$f$cache	I
/*     */       //   463	54	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   463	54	13	invalid$iv	Z
/*     */       //   625	25	20	$i$a$-cache-SliderKt$Slider$3$draggableState$1	I
/*     */       //   652	11	21	value$iv	Ljava/lang/Object;
/*     */       //   606	63	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   603	66	18	it$iv	Ljava/lang/Object;
/*     */       //   594	77	17	$i$f$cache	I
/*     */       //   591	80	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   591	80	14	invalid$iv	Z
/*     */       //   773	16	19	$i$a$-cache-SliderKt$Slider$3$2	I
/*     */       //   791	11	20	value$iv	Ljava/lang/Object;
/*     */       //   754	54	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   751	57	17	it$iv	Ljava/lang/Object;
/*     */       //   742	68	16	$i$f$cache	I
/*     */       //   739	71	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   739	71	14	invalid$iv	Z
/*     */       //   1016	23	23	$i$a$-cache-SliderKt$Slider$3$gestureEndAction$1	I
/*     */       //   1041	11	24	value$iv	Ljava/lang/Object;
/*     */       //   997	61	22	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   994	64	21	it$iv	Ljava/lang/Object;
/*     */       //   985	75	20	$i$f$cache	I
/*     */       //   982	78	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   982	78	16	invalid$iv	Z
/*     */       //   1233	13	25	$i$a$-cache-SliderKt$Slider$3$drag$1	I
/*     */       //   1266	11	26	value$iv	Ljava/lang/Object;
/*     */       //   1200	83	24	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   1197	86	23	it$iv	Ljava/lang/Object;
/*     */       //   1188	97	22	$i$f$cache	I
/*     */       //   1185	100	20	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   1185	100	21	invalid$iv	Z
/*     */       //   83	1367	5	widthPx	F
/*     */       //   92	1358	6	maxPx	Lkotlin/jvm/internal/Ref$FloatRef;
/*     */       //   101	1349	7	minPx	Lkotlin/jvm/internal/Ref$FloatRef;
/*     */       //   343	1107	8	scope	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   448	1002	9	rawOffset	Landroidx/compose/runtime/MutableFloatState;
/*     */       //   532	918	10	pressOffset	Landroidx/compose/runtime/MutableFloatState;
/*     */       //   686	764	11	draggableState	Lorg/jetbrains/jewel/ui/component/SliderDraggableState;
/*     */       //   878	572	12	canAnimate	Z
/*     */       //   1080	370	13	gestureEndAction	Landroidx/compose/runtime/State;
/*     */       //   1122	328	14	press	Landroidx/compose/ui/Modifier;
/*     */       //   1310	140	15	drag	Landroidx/compose/ui/Modifier;
/*     */       //   1349	101	16	coerced	F
/*     */       //   1386	64	17	fraction	F
/*     */       //   9	1451	4	$dirty	I
/*     */       //   0	1460	0	this	Lorg/jetbrains/jewel/ui/component/SliderKt$Slider$3;
/*     */       //   0	1460	1	$this$BoxWithConstraints	Landroidx/compose/foundation/layout/BoxWithConstraintsScope;
/*     */       //   0	1460	2	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	1460	3	$changed	I
/*     */     }
/*     */     
/*     */     private static final float invoke$scaleToUserValue(Ref.FloatRef minPx, Ref.FloatRef maxPx, ClosedFloatingPointRange $valueRange, float offset) {
/* 138 */       return SliderKt.scale(minPx.element, maxPx.element, offset, ((Number)$valueRange.getStart()).floatValue(), ((Number)$valueRange.getEndInclusive()).floatValue());
/*     */     } private static final float invoke$scaleToOffset(ClosedFloatingPointRange $valueRange, Ref.FloatRef minPx, Ref.FloatRef maxPx, float userValue) {
/* 140 */       return SliderKt.scale(((Number)$valueRange.getStart()).floatValue(), ((Number)$valueRange.getEndInclusive()).floatValue(), userValue, minPx.element, maxPx.element);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private static final Unit invoke$lambda$4$lambda$3(MutableFloatState $rawOffset, MutableFloatState $pressOffset, Ref.FloatRef $minPx, Ref.FloatRef $maxPx, State $onValueChangeState, ClosedFloatingPointRange<Float> $valueRange, float it) {
/* 149 */       $rawOffset.setFloatValue($rawOffset.getFloatValue() + it + $pressOffset.getFloatValue());
/* 150 */       $pressOffset.setFloatValue(0.0F);
/* 151 */       float offsetInTrack = RangesKt.coerceIn($rawOffset.getFloatValue(), $minPx.element, $maxPx.element);
/* 152 */       ((Function1)$onValueChangeState.getValue()).invoke(Float.valueOf(invoke$scaleToUserValue($minPx, $maxPx, $valueRange, offsetInTrack)));
/* 153 */       return Unit.INSTANCE;
/*     */     }
/*     */     SliderKt$Slider$3(ClosedFloatingPointRange<Float> $valueRange, float $value, List<Float> $tickFractions, Function0<Unit> $onValueChangeFinished, MutableInteractionSource $interactionSource, boolean $isRtl, boolean $enabled, SliderStyle $style, float $minHeight, long $thumbSize, State<Function1<Float, Unit>> $onValueChangeState, FocusRequester $focusRequester) {}
/*     */     @DebugMetadata(f = "Slider.kt", l = {167, 169}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.SliderKt$Slider$3$gestureEndAction$1$1$1")
/*     */     @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */     static final class SliderKt$Slider$3$gestureEndAction$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */       int label;
/*     */       SliderKt$Slider$3$gestureEndAction$1$1$1(boolean $canAnimate, SliderDraggableState $draggableState, float $current, float $target, float $velocity, Function0<Unit> $onValueChangeFinished, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { // Byte code:
/*     */         //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */         //   3: astore_2
/*     */         //   4: aload_0
/*     */         //   5: getfield label : I
/*     */         //   8: tableswitch default -> 170, 0 -> 36, 1 -> 85, 2 -> 142
/*     */         //   36: aload_1
/*     */         //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */         //   40: aload_0
/*     */         //   41: getfield $canAnimate : Z
/*     */         //   44: ifeq -> 94
/*     */         //   47: aload_0
/*     */         //   48: getfield $draggableState : Lorg/jetbrains/jewel/ui/component/SliderDraggableState;
/*     */         //   51: checkcast androidx/compose/foundation/gestures/DraggableState
/*     */         //   54: aload_0
/*     */         //   55: getfield $current : F
/*     */         //   58: aload_0
/*     */         //   59: getfield $target : F
/*     */         //   62: aload_0
/*     */         //   63: getfield $velocity : F
/*     */         //   66: aload_0
/*     */         //   67: checkcast kotlin/coroutines/Continuation
/*     */         //   70: aload_0
/*     */         //   71: iconst_1
/*     */         //   72: putfield label : I
/*     */         //   75: invokestatic access$animateToTarget : (Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */         //   78: dup
/*     */         //   79: aload_2
/*     */         //   80: if_acmpne -> 90
/*     */         //   83: aload_2
/*     */         //   84: areturn
/*     */         //   85: aload_1
/*     */         //   86: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */         //   89: aload_1
/*     */         //   90: pop
/*     */         //   91: goto -> 148
/*     */         //   94: aload_0
/*     */         //   95: getfield $draggableState : Lorg/jetbrains/jewel/ui/component/SliderDraggableState;
/*     */         //   98: checkcast androidx/compose/foundation/gestures/DraggableState
/*     */         //   101: aconst_null
/*     */         //   102: new org/jetbrains/jewel/ui/component/SliderKt$Slider$3$gestureEndAction$1$1$1$1
/*     */         //   105: dup
/*     */         //   106: aload_0
/*     */         //   107: getfield $target : F
/*     */         //   110: aload_0
/*     */         //   111: getfield $current : F
/*     */         //   114: aconst_null
/*     */         //   115: invokespecial <init> : (FFLkotlin/coroutines/Continuation;)V
/*     */         //   118: checkcast kotlin/jvm/functions/Function2
/*     */         //   121: aload_0
/*     */         //   122: checkcast kotlin/coroutines/Continuation
/*     */         //   125: iconst_1
/*     */         //   126: aconst_null
/*     */         //   127: aload_0
/*     */         //   128: iconst_2
/*     */         //   129: putfield label : I
/*     */         //   132: invokestatic drag$default : (Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */         //   135: dup
/*     */         //   136: aload_2
/*     */         //   137: if_acmpne -> 147
/*     */         //   140: aload_2
/*     */         //   141: areturn
/*     */         //   142: aload_1
/*     */         //   143: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */         //   146: aload_1
/*     */         //   147: pop
/*     */         //   148: aload_0
/*     */         //   149: getfield $onValueChangeFinished : Lkotlin/jvm/functions/Function0;
/*     */         //   152: dup
/*     */         //   153: ifnull -> 165
/*     */         //   156: invokeinterface invoke : ()Ljava/lang/Object;
/*     */         //   161: pop
/*     */         //   162: goto -> 166
/*     */         //   165: pop
/*     */         //   166: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */         //   169: areturn
/*     */         //   170: new java/lang/IllegalStateException
/*     */         //   173: dup
/*     */         //   174: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */         //   176: invokespecial <init> : (Ljava/lang/String;)V
/*     */         //   179: athrow
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #165	-> 3
/*     */         //   #166	-> 40
/*     */         //   #167	-> 47
/*     */         //   #165	-> 83
/*     */         //   #167	-> 90
/*     */         //   #169	-> 94
/*     */         //   #165	-> 140
/*     */         //   #171	-> 147
/*     */         //   #172	-> 166
/*     */         //   #165	-> 170
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	180	0	this	Lorg/jetbrains/jewel/ui/component/SliderKt$Slider$3$gestureEndAction$1$1$1;
/*     */         //   40	130	1	$result	Ljava/lang/Object; } public final Continuation<Unit> create(Object value, Continuation<? super SliderKt$Slider$3$gestureEndAction$1$1$1> $completion) { return (Continuation<Unit>)new SliderKt$Slider$3$gestureEndAction$1$1$1(this.$canAnimate, this.$draggableState, this.$current, this.$target, this.$velocity, this.$onValueChangeFinished, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((SliderKt$Slider$3$gestureEndAction$1$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } private static final Unit invoke$lambda$7$lambda$6(MutableFloatState $rawOffset, List $tickFractions, Ref.FloatRef $minPx, Ref.FloatRef $maxPx, FocusRequester $focusRequester, CoroutineScope $scope, SliderDraggableState $draggableState, Function0<Unit> $onValueChangeFinished, boolean $canAnimate, float velocity) {
/* 161 */       float current = $rawOffset.getFloatValue();
/* 162 */       float target = SliderKt.snapValueToTick(current, $tickFractions, $minPx.element, $maxPx.element);
/* 163 */       $focusRequester.requestFocus();
/* 164 */       if (!((current == target) ? 1 : 0)) {
/* 165 */         BuildersKt.launch$default($scope, null, null, new SliderKt$Slider$3$gestureEndAction$1$1$1($canAnimate, $draggableState, current, target, velocity, $onValueChangeFinished, null), 3, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 173 */       else if (!$draggableState.isDragging()) {
/*     */         
/* 175 */         if ($onValueChangeFinished != null) { $onValueChangeFinished.invoke(); } else {  }
/*     */       
/* 177 */       }  return Unit.INSTANCE;
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
/*     */     @DebugMetadata(f = "Slider.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.SliderKt$Slider$3$drag$1$1")
/*     */     @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\007\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "velocity", ""})
/*     */     static final class SliderKt$Slider$3$drag$1$1
/*     */       extends SuspendLambda
/*     */       implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object>
/*     */     {
/*     */       public final Object invokeSuspend(Object $result) {
/*     */         float velocity;
/* 196 */         IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); velocity = this.F$0; ((Function1)this.$gestureEndAction.getValue()).invoke(Boxing.boxFloat(velocity)); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */       }
/*     */ 
/*     */       
/*     */       int label;
/*     */ 
/*     */       
/*     */       SliderKt$Slider$3$drag$1$1(State<Function1<Float, Unit>> $gestureEndAction, Continuation $completion) {
/*     */         super(3, $completion);
/*     */       }
/*     */       
/*     */       public final Object invoke(CoroutineScope p1, float p2, Continuation<? super SliderKt$Slider$3$drag$1$1> p3) {
/*     */         SliderKt$Slider$3$drag$1$1 sliderKt$Slider$3$drag$1$1 = new SliderKt$Slider$3$drag$1$1(this.$gestureEndAction, p3);
/*     */         sliderKt$Slider$3$drag$1$1.F$0 = p2;
/*     */         return sliderKt$Slider$3$drag$1$1.invokeSuspend(Unit.INSTANCE);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   static {
/* 216 */     int $this$dp$iv = 100, $i$f$getDp = 0; SliderMinWidth = 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 867 */       Dp.constructor-impl($this$dp$iv);
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   private static final void SliderImpl-PfoAEA0(boolean enabled, float positionFraction, List<Float> tickFractions, SliderStyle style, float width, float minHeight, MutableInteractionSource interactionSource, Modifier modifier, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload #8
/*     */     //   2: ldc_w 683925912
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #8
/*     */     //   12: iload #9
/*     */     //   14: istore #10
/*     */     //   16: iload #9
/*     */     //   18: bipush #6
/*     */     //   20: iand
/*     */     //   21: ifne -> 45
/*     */     //   24: iload #10
/*     */     //   26: aload #8
/*     */     //   28: iload_0
/*     */     //   29: invokeinterface changed : (Z)Z
/*     */     //   34: ifeq -> 41
/*     */     //   37: iconst_4
/*     */     //   38: goto -> 42
/*     */     //   41: iconst_2
/*     */     //   42: ior
/*     */     //   43: istore #10
/*     */     //   45: iload #9
/*     */     //   47: bipush #48
/*     */     //   49: iand
/*     */     //   50: ifne -> 76
/*     */     //   53: iload #10
/*     */     //   55: aload #8
/*     */     //   57: fload_1
/*     */     //   58: invokeinterface changed : (F)Z
/*     */     //   63: ifeq -> 71
/*     */     //   66: bipush #32
/*     */     //   68: goto -> 73
/*     */     //   71: bipush #16
/*     */     //   73: ior
/*     */     //   74: istore #10
/*     */     //   76: iload #9
/*     */     //   78: sipush #384
/*     */     //   81: iand
/*     */     //   82: ifne -> 110
/*     */     //   85: iload #10
/*     */     //   87: aload #8
/*     */     //   89: aload_2
/*     */     //   90: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   95: ifeq -> 104
/*     */     //   98: sipush #256
/*     */     //   101: goto -> 107
/*     */     //   104: sipush #128
/*     */     //   107: ior
/*     */     //   108: istore #10
/*     */     //   110: iload #9
/*     */     //   112: sipush #3072
/*     */     //   115: iand
/*     */     //   116: ifne -> 144
/*     */     //   119: iload #10
/*     */     //   121: aload #8
/*     */     //   123: aload_3
/*     */     //   124: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   129: ifeq -> 138
/*     */     //   132: sipush #2048
/*     */     //   135: goto -> 141
/*     */     //   138: sipush #1024
/*     */     //   141: ior
/*     */     //   142: istore #10
/*     */     //   144: iload #9
/*     */     //   146: sipush #24576
/*     */     //   149: iand
/*     */     //   150: ifne -> 179
/*     */     //   153: iload #10
/*     */     //   155: aload #8
/*     */     //   157: fload #4
/*     */     //   159: invokeinterface changed : (F)Z
/*     */     //   164: ifeq -> 173
/*     */     //   167: sipush #16384
/*     */     //   170: goto -> 176
/*     */     //   173: sipush #8192
/*     */     //   176: ior
/*     */     //   177: istore #10
/*     */     //   179: iload #9
/*     */     //   181: ldc 196608
/*     */     //   183: iand
/*     */     //   184: ifne -> 211
/*     */     //   187: iload #10
/*     */     //   189: aload #8
/*     */     //   191: fload #5
/*     */     //   193: invokeinterface changed : (F)Z
/*     */     //   198: ifeq -> 206
/*     */     //   201: ldc 131072
/*     */     //   203: goto -> 208
/*     */     //   206: ldc 65536
/*     */     //   208: ior
/*     */     //   209: istore #10
/*     */     //   211: iload #9
/*     */     //   213: ldc 1572864
/*     */     //   215: iand
/*     */     //   216: ifne -> 243
/*     */     //   219: iload #10
/*     */     //   221: aload #8
/*     */     //   223: aload #6
/*     */     //   225: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   230: ifeq -> 238
/*     */     //   233: ldc 1048576
/*     */     //   235: goto -> 240
/*     */     //   238: ldc 524288
/*     */     //   240: ior
/*     */     //   241: istore #10
/*     */     //   243: iload #9
/*     */     //   245: ldc 12582912
/*     */     //   247: iand
/*     */     //   248: ifne -> 275
/*     */     //   251: iload #10
/*     */     //   253: aload #8
/*     */     //   255: aload #7
/*     */     //   257: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   262: ifeq -> 270
/*     */     //   265: ldc 8388608
/*     */     //   267: goto -> 272
/*     */     //   270: ldc 4194304
/*     */     //   272: ior
/*     */     //   273: istore #10
/*     */     //   275: iload #10
/*     */     //   277: ldc_w 4793491
/*     */     //   280: iand
/*     */     //   281: ldc_w 4793490
/*     */     //   284: if_icmpne -> 297
/*     */     //   287: aload #8
/*     */     //   289: invokeinterface getSkipping : ()Z
/*     */     //   294: ifne -> 964
/*     */     //   297: invokestatic isTraceInProgress : ()Z
/*     */     //   300: ifeq -> 315
/*     */     //   303: ldc_w 683925912
/*     */     //   306: iload #10
/*     */     //   308: iconst_m1
/*     */     //   309: ldc_w 'org.jetbrains.jewel.ui.component.SliderImpl (Slider.kt:227)'
/*     */     //   312: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   315: aload #7
/*     */     //   317: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   320: checkcast androidx/compose/ui/Modifier
/*     */     //   323: getstatic org/jetbrains/jewel/ui/component/SliderKt.SliderMinWidth : F
/*     */     //   326: fconst_0
/*     */     //   327: iconst_2
/*     */     //   328: aconst_null
/*     */     //   329: invokestatic widthIn-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   332: fload #5
/*     */     //   334: fconst_0
/*     */     //   335: iconst_2
/*     */     //   336: aconst_null
/*     */     //   337: invokestatic heightIn-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   340: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   345: astore #11
/*     */     //   347: iconst_0
/*     */     //   348: istore #14
/*     */     //   350: iconst_0
/*     */     //   351: istore #15
/*     */     //   353: aload #8
/*     */     //   355: ldc_w 733328855
/*     */     //   358: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   361: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   364: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   367: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   370: astore #12
/*     */     //   372: iconst_0
/*     */     //   373: istore #13
/*     */     //   375: aload #12
/*     */     //   377: iload #13
/*     */     //   379: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   382: astore #16
/*     */     //   384: bipush #112
/*     */     //   386: iload #14
/*     */     //   388: iconst_3
/*     */     //   389: ishl
/*     */     //   390: iand
/*     */     //   391: istore #17
/*     */     //   393: nop
/*     */     //   394: iconst_0
/*     */     //   395: istore #18
/*     */     //   397: aload #8
/*     */     //   399: ldc_w -1323940314
/*     */     //   402: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   405: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   408: aload #8
/*     */     //   410: iconst_0
/*     */     //   411: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   414: istore #19
/*     */     //   416: aload #8
/*     */     //   418: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   423: astore #20
/*     */     //   425: aload #8
/*     */     //   427: aload #11
/*     */     //   429: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   432: astore #21
/*     */     //   434: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   437: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   440: astore #22
/*     */     //   442: bipush #6
/*     */     //   444: sipush #896
/*     */     //   447: iload #17
/*     */     //   449: bipush #6
/*     */     //   451: ishl
/*     */     //   452: iand
/*     */     //   453: ior
/*     */     //   454: istore #23
/*     */     //   456: nop
/*     */     //   457: iconst_0
/*     */     //   458: istore #24
/*     */     //   460: aload #8
/*     */     //   462: ldc_w -692256719
/*     */     //   465: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   468: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   471: aload #8
/*     */     //   473: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   478: instanceof androidx/compose/runtime/Applier
/*     */     //   481: ifne -> 487
/*     */     //   484: invokestatic invalidApplier : ()V
/*     */     //   487: aload #8
/*     */     //   489: invokeinterface startReusableNode : ()V
/*     */     //   494: aload #8
/*     */     //   496: invokeinterface getInserting : ()Z
/*     */     //   501: ifeq -> 516
/*     */     //   504: aload #8
/*     */     //   506: aload #22
/*     */     //   508: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   513: goto -> 523
/*     */     //   516: aload #8
/*     */     //   518: invokeinterface useNode : ()V
/*     */     //   523: aload #8
/*     */     //   525: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   528: astore #25
/*     */     //   530: iconst_0
/*     */     //   531: istore #26
/*     */     //   533: aload #25
/*     */     //   535: aload #16
/*     */     //   537: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   540: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   543: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   546: aload #25
/*     */     //   548: aload #20
/*     */     //   550: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   553: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   556: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   559: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   562: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   565: astore #27
/*     */     //   567: iconst_0
/*     */     //   568: istore #28
/*     */     //   570: aload #25
/*     */     //   572: astore #29
/*     */     //   574: iconst_0
/*     */     //   575: istore #30
/*     */     //   577: aload #29
/*     */     //   579: invokeinterface getInserting : ()Z
/*     */     //   584: ifne -> 605
/*     */     //   587: aload #29
/*     */     //   589: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   594: iload #19
/*     */     //   596: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   599: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   602: ifne -> 631
/*     */     //   605: aload #29
/*     */     //   607: iload #19
/*     */     //   609: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   612: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   617: aload #25
/*     */     //   619: iload #19
/*     */     //   621: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   624: aload #27
/*     */     //   626: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   631: nop
/*     */     //   632: nop
/*     */     //   633: nop
/*     */     //   634: aload #25
/*     */     //   636: aload #21
/*     */     //   638: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   641: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   644: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   647: nop
/*     */     //   648: nop
/*     */     //   649: aload #8
/*     */     //   651: bipush #14
/*     */     //   653: iload #23
/*     */     //   655: bipush #6
/*     */     //   657: ishr
/*     */     //   658: iand
/*     */     //   659: istore #31
/*     */     //   661: astore #32
/*     */     //   663: iconst_0
/*     */     //   664: istore #33
/*     */     //   666: aload #32
/*     */     //   668: ldc_w -2146769399
/*     */     //   671: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   674: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   677: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   680: aload #32
/*     */     //   682: bipush #6
/*     */     //   684: bipush #112
/*     */     //   686: iload #14
/*     */     //   688: bipush #6
/*     */     //   690: ishr
/*     */     //   691: iand
/*     */     //   692: ior
/*     */     //   693: istore #34
/*     */     //   695: astore #35
/*     */     //   697: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   700: astore #36
/*     */     //   702: iconst_0
/*     */     //   703: istore #37
/*     */     //   705: fconst_0
/*     */     //   706: fstore #38
/*     */     //   708: invokestatic getLocalDensity : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   711: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   714: astore #39
/*     */     //   716: iconst_0
/*     */     //   717: istore #40
/*     */     //   719: iconst_0
/*     */     //   720: istore #41
/*     */     //   722: aload #35
/*     */     //   724: ldc 2023513938
/*     */     //   726: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   728: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   731: aload #35
/*     */     //   733: aload #39
/*     */     //   735: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   740: astore #42
/*     */     //   742: aload #35
/*     */     //   744: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   747: aload #42
/*     */     //   749: checkcast androidx/compose/ui/unit/Density
/*     */     //   752: astore #40
/*     */     //   754: iconst_0
/*     */     //   755: istore #41
/*     */     //   757: aload #40
/*     */     //   759: fload #4
/*     */     //   761: invokeinterface toDp-u2uoSUM : (F)F
/*     */     //   766: fstore #38
/*     */     //   768: nop
/*     */     //   769: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   772: checkcast androidx/compose/ui/Modifier
/*     */     //   775: fconst_0
/*     */     //   776: iconst_1
/*     */     //   777: aconst_null
/*     */     //   778: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   781: aload_3
/*     */     //   782: iload_0
/*     */     //   783: fload_1
/*     */     //   784: aload_2
/*     */     //   785: aload #35
/*     */     //   787: bipush #6
/*     */     //   789: bipush #112
/*     */     //   791: iload #10
/*     */     //   793: bipush #6
/*     */     //   795: ishr
/*     */     //   796: iand
/*     */     //   797: ior
/*     */     //   798: sipush #896
/*     */     //   801: iload #10
/*     */     //   803: bipush #6
/*     */     //   805: ishl
/*     */     //   806: iand
/*     */     //   807: ior
/*     */     //   808: sipush #7168
/*     */     //   811: iload #10
/*     */     //   813: bipush #6
/*     */     //   815: ishl
/*     */     //   816: iand
/*     */     //   817: ior
/*     */     //   818: ldc_w 57344
/*     */     //   821: iload #10
/*     */     //   823: bipush #6
/*     */     //   825: ishl
/*     */     //   826: iand
/*     */     //   827: ior
/*     */     //   828: invokestatic Track : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/SliderStyle;ZFLjava/util/List;Landroidx/compose/runtime/Composer;I)V
/*     */     //   831: fload #38
/*     */     //   833: fstore #40
/*     */     //   835: aload_3
/*     */     //   836: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SliderMetrics;
/*     */     //   839: invokevirtual getThumbSize-MYxV2XQ : ()J
/*     */     //   842: invokestatic getWidth-D9Ej5fM : (J)F
/*     */     //   845: fstore #41
/*     */     //   847: iconst_0
/*     */     //   848: istore #42
/*     */     //   850: fload #40
/*     */     //   852: fload #41
/*     */     //   854: fadd
/*     */     //   855: invokestatic constructor-impl : (F)F
/*     */     //   858: fstore #40
/*     */     //   860: nop
/*     */     //   861: iconst_0
/*     */     //   862: istore #41
/*     */     //   864: fload #40
/*     */     //   866: fload_1
/*     */     //   867: fmul
/*     */     //   868: invokestatic constructor-impl : (F)F
/*     */     //   871: fstore #39
/*     */     //   873: aload #36
/*     */     //   875: fload #39
/*     */     //   877: aload #6
/*     */     //   879: aload_3
/*     */     //   880: iload_0
/*     */     //   881: aconst_null
/*     */     //   882: aload #35
/*     */     //   884: bipush #14
/*     */     //   886: iload #34
/*     */     //   888: iand
/*     */     //   889: sipush #896
/*     */     //   892: iload #10
/*     */     //   894: bipush #12
/*     */     //   896: ishr
/*     */     //   897: iand
/*     */     //   898: ior
/*     */     //   899: sipush #7168
/*     */     //   902: iload #10
/*     */     //   904: iand
/*     */     //   905: ior
/*     */     //   906: ldc_w 57344
/*     */     //   909: iload #10
/*     */     //   911: bipush #12
/*     */     //   913: ishl
/*     */     //   914: iand
/*     */     //   915: ior
/*     */     //   916: bipush #16
/*     */     //   918: invokestatic SliderThumb-RfXq3Jk : (Landroidx/compose/foundation/layout/BoxScope;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/SliderStyle;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
/*     */     //   921: nop
/*     */     //   922: aload #32
/*     */     //   924: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   927: aload #8
/*     */     //   929: invokeinterface endNode : ()V
/*     */     //   934: aload #8
/*     */     //   936: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   939: nop
/*     */     //   940: aload #8
/*     */     //   942: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   945: nop
/*     */     //   946: aload #8
/*     */     //   948: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   951: nop
/*     */     //   952: invokestatic isTraceInProgress : ()Z
/*     */     //   955: ifeq -> 971
/*     */     //   958: invokestatic traceEventEnd : ()V
/*     */     //   961: goto -> 971
/*     */     //   964: aload #8
/*     */     //   966: invokeinterface skipToGroupEnd : ()V
/*     */     //   971: aload #8
/*     */     //   973: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   978: dup
/*     */     //   979: ifnull -> 1009
/*     */     //   982: iload_0
/*     */     //   983: fload_1
/*     */     //   984: aload_2
/*     */     //   985: aload_3
/*     */     //   986: fload #4
/*     */     //   988: fload #5
/*     */     //   990: aload #6
/*     */     //   992: aload #7
/*     */     //   994: iload #9
/*     */     //   996: <illegal opcode> invoke : (ZFLjava/util/List;Lorg/jetbrains/jewel/ui/component/styling/SliderStyle;FFLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;I)Lkotlin/jvm/functions/Function2;
/*     */     //   1001: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1006: goto -> 1010
/*     */     //   1009: pop
/*     */     //   1010: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #228	-> 0
/*     */     //   #229	-> 315
/*     */     //   #733	-> 361
/*     */     //   #734	-> 364
/*     */     //   #735	-> 372
/*     */     //   #738	-> 375
/*     */     //   #739	-> 393
/*     */     //   #740	-> 405
/*     */     //   #741	-> 411
/*     */     //   #742	-> 418
/*     */     //   #743	-> 427
/*     */     //   #745	-> 434
/*     */     //   #744	-> 456
/*     */     //   #746	-> 468
/*     */     //   #747	-> 471
/*     */     //   #748	-> 489
/*     */     //   #749	-> 494
/*     */     //   #750	-> 506
/*     */     //   #752	-> 518
/*     */     //   #754	-> 523
/*     */     //   #755	-> 533
/*     */     //   #756	-> 546
/*     */     //   #758	-> 559
/*     */     //   #759	-> 570
/*     */     //   #760	-> 577
/*     */     //   #761	-> 605
/*     */     //   #762	-> 617
/*     */     //   #764	-> 631
/*     */     //   #759	-> 632
/*     */     //   #764	-> 633
/*     */     //   #765	-> 634
/*     */     //   #766	-> 647
/*     */     //   #754	-> 648
/*     */     //   #767	-> 649
/*     */     //   #768	-> 674
/*     */     //   #230	-> 705
/*     */     //   #231	-> 708
/*     */     //   #769	-> 728
/*     */     //   #231	-> 749
/*     */     //   #714	-> 754
/*     */     //   #231	-> 757
/*     */     //   #231	-> 768
/*     */     //   #234	-> 769
/*     */     //   #235	-> 781
/*     */     //   #236	-> 782
/*     */     //   #237	-> 783
/*     */     //   #238	-> 784
/*     */     //   #233	-> 828
/*     */     //   #241	-> 831
/*     */     //   #770	-> 850
/*     */     //   #241	-> 860
/*     */     //   #771	-> 864
/*     */     //   #241	-> 871
/*     */     //   #242	-> 873
/*     */     //   #243	-> 921
/*     */     //   #768	-> 922
/*     */     //   #767	-> 927
/*     */     //   #772	-> 929
/*     */     //   #746	-> 936
/*     */     //   #773	-> 939
/*     */     //   #740	-> 942
/*     */     //   #774	-> 945
/*     */     //   #733	-> 948
/*     */     //   #775	-> 951
/*     */     //   #244	-> 964
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   722	27	41	$i$f$getCurrent	I
/*     */     //   719	30	39	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   719	30	40	$changed$iv	I
/*     */     //   757	11	41	$i$a$-with-SliderKt$SliderImpl$1$1	I
/*     */     //   754	14	40	$this$SliderImpl_PfoAEA0_u24lambda_u246_u24lambda_u245	Landroidx/compose/ui/unit/Density;
/*     */     //   850	8	42	$i$f$plus-5rwHm24	I
/*     */     //   847	11	40	arg0$iv	F
/*     */     //   847	11	41	other$iv	F
/*     */     //   864	7	41	$i$f$times-u2uoSUM	I
/*     */     //   861	10	40	arg0$iv	F
/*     */     //   705	217	37	$i$a$-Box-SliderKt$SliderImpl$1	I
/*     */     //   708	214	38	widthDp	F
/*     */     //   873	49	39	offset	F
/*     */     //   702	220	36	$this$SliderImpl_PfoAEA0_u24lambda_u246	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   702	220	35	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   702	220	34	$changed	I
/*     */     //   666	261	33	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   663	264	32	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   663	264	31	$changed$iv	I
/*     */     //   577	55	30	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   574	58	29	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   570	64	28	$i$f$set-impl	I
/*     */     //   567	67	27	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   533	115	26	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   530	118	25	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   460	480	24	$i$f$ReusableComposeNode	I
/*     */     //   457	483	22	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   457	483	23	$changed$iv$iv$iv	I
/*     */     //   397	549	18	$i$f$Layout	I
/*     */     //   416	530	19	compositeKeyHash$iv$iv	I
/*     */     //   425	521	20	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   434	512	21	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   394	552	17	$changed$iv$iv	I
/*     */     //   353	599	15	$i$f$Box	I
/*     */     //   384	568	16	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   350	602	11	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   372	580	12	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   375	577	13	propagateMinConstraints$iv	Z
/*     */     //   350	602	14	$changed$iv	I
/*     */     //   16	995	10	$dirty	I
/*     */     //   0	1011	0	enabled	Z
/*     */     //   0	1011	1	positionFraction	F
/*     */     //   0	1011	2	tickFractions	Ljava/util/List;
/*     */     //   0	1011	3	style	Lorg/jetbrains/jewel/ui/component/styling/SliderStyle;
/*     */     //   0	1011	4	width	F
/*     */     //   0	1011	5	minHeight	F
/*     */     //   0	1011	6	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1011	7	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1011	8	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1011	9	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   private static final void Track(Modifier modifier, SliderStyle style, boolean enabled, float positionFractionEnd, List tickFractions, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: ldc_w 963006249
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #5
/*     */     //   12: iload #6
/*     */     //   14: istore #7
/*     */     //   16: iload #6
/*     */     //   18: bipush #6
/*     */     //   20: iand
/*     */     //   21: ifne -> 45
/*     */     //   24: iload #7
/*     */     //   26: aload #5
/*     */     //   28: aload_0
/*     */     //   29: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   34: ifeq -> 41
/*     */     //   37: iconst_4
/*     */     //   38: goto -> 42
/*     */     //   41: iconst_2
/*     */     //   42: ior
/*     */     //   43: istore #7
/*     */     //   45: iload #6
/*     */     //   47: bipush #48
/*     */     //   49: iand
/*     */     //   50: ifne -> 76
/*     */     //   53: iload #7
/*     */     //   55: aload #5
/*     */     //   57: aload_1
/*     */     //   58: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   63: ifeq -> 71
/*     */     //   66: bipush #32
/*     */     //   68: goto -> 73
/*     */     //   71: bipush #16
/*     */     //   73: ior
/*     */     //   74: istore #7
/*     */     //   76: iload #6
/*     */     //   78: sipush #384
/*     */     //   81: iand
/*     */     //   82: ifne -> 110
/*     */     //   85: iload #7
/*     */     //   87: aload #5
/*     */     //   89: iload_2
/*     */     //   90: invokeinterface changed : (Z)Z
/*     */     //   95: ifeq -> 104
/*     */     //   98: sipush #256
/*     */     //   101: goto -> 107
/*     */     //   104: sipush #128
/*     */     //   107: ior
/*     */     //   108: istore #7
/*     */     //   110: iload #6
/*     */     //   112: sipush #3072
/*     */     //   115: iand
/*     */     //   116: ifne -> 144
/*     */     //   119: iload #7
/*     */     //   121: aload #5
/*     */     //   123: fload_3
/*     */     //   124: invokeinterface changed : (F)Z
/*     */     //   129: ifeq -> 138
/*     */     //   132: sipush #2048
/*     */     //   135: goto -> 141
/*     */     //   138: sipush #1024
/*     */     //   141: ior
/*     */     //   142: istore #7
/*     */     //   144: iload #6
/*     */     //   146: sipush #24576
/*     */     //   149: iand
/*     */     //   150: ifne -> 179
/*     */     //   153: iload #7
/*     */     //   155: aload #5
/*     */     //   157: aload #4
/*     */     //   159: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   164: ifeq -> 173
/*     */     //   167: sipush #16384
/*     */     //   170: goto -> 176
/*     */     //   173: sipush #8192
/*     */     //   176: ior
/*     */     //   177: istore #7
/*     */     //   179: iload #7
/*     */     //   181: sipush #9363
/*     */     //   184: iand
/*     */     //   185: sipush #9362
/*     */     //   188: if_icmpne -> 201
/*     */     //   191: aload #5
/*     */     //   193: invokeinterface getSkipping : ()Z
/*     */     //   198: ifne -> 736
/*     */     //   201: invokestatic isTraceInProgress : ()Z
/*     */     //   204: ifeq -> 219
/*     */     //   207: ldc_w 963006249
/*     */     //   210: iload #7
/*     */     //   212: iconst_m1
/*     */     //   213: ldc_w 'org.jetbrains.jewel.ui.component.Track (Slider.kt:252)'
/*     */     //   216: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   219: new kotlin/jvm/internal/Ref$FloatRef
/*     */     //   222: dup
/*     */     //   223: invokespecial <init> : ()V
/*     */     //   226: astore #8
/*     */     //   228: new kotlin/jvm/internal/Ref$FloatRef
/*     */     //   231: dup
/*     */     //   232: invokespecial <init> : ()V
/*     */     //   235: astore #9
/*     */     //   237: new kotlin/jvm/internal/Ref$FloatRef
/*     */     //   240: dup
/*     */     //   241: invokespecial <init> : ()V
/*     */     //   244: astore #10
/*     */     //   246: new kotlin/jvm/internal/Ref$FloatRef
/*     */     //   249: dup
/*     */     //   250: invokespecial <init> : ()V
/*     */     //   253: astore #11
/*     */     //   255: new kotlin/jvm/internal/Ref$FloatRef
/*     */     //   258: dup
/*     */     //   259: invokespecial <init> : ()V
/*     */     //   262: astore #12
/*     */     //   264: new kotlin/jvm/internal/Ref$FloatRef
/*     */     //   267: dup
/*     */     //   268: invokespecial <init> : ()V
/*     */     //   271: astore #13
/*     */     //   273: invokestatic getLocalDensity : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   276: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   279: astore #14
/*     */     //   281: iconst_0
/*     */     //   282: istore #15
/*     */     //   284: iconst_0
/*     */     //   285: istore #16
/*     */     //   287: aload #5
/*     */     //   289: ldc 2023513938
/*     */     //   291: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   293: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   296: aload #5
/*     */     //   298: aload #14
/*     */     //   300: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   305: astore #17
/*     */     //   307: aload #5
/*     */     //   309: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   312: aload #17
/*     */     //   314: checkcast androidx/compose/ui/unit/Density
/*     */     //   317: astore #15
/*     */     //   319: iconst_0
/*     */     //   320: istore #16
/*     */     //   322: aload #8
/*     */     //   324: aload #15
/*     */     //   326: aload_1
/*     */     //   327: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SliderMetrics;
/*     */     //   330: invokevirtual getTrackHeight-D9Ej5fM : ()F
/*     */     //   333: invokeinterface toPx-0680j_4 : (F)F
/*     */     //   338: putfield element : F
/*     */     //   341: aload #9
/*     */     //   343: aload #15
/*     */     //   345: aload_1
/*     */     //   346: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SliderMetrics;
/*     */     //   349: invokevirtual getThumbSize-MYxV2XQ : ()J
/*     */     //   352: invokestatic getWidth-D9Ej5fM : (J)F
/*     */     //   355: invokeinterface toPx-0680j_4 : (F)F
/*     */     //   360: putfield element : F
/*     */     //   363: aload #10
/*     */     //   365: aload #15
/*     */     //   367: aload_1
/*     */     //   368: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SliderMetrics;
/*     */     //   371: invokevirtual getThumbSize-MYxV2XQ : ()J
/*     */     //   374: invokestatic getWidth-D9Ej5fM : (J)F
/*     */     //   377: invokeinterface toPx-0680j_4 : (F)F
/*     */     //   382: iconst_2
/*     */     //   383: i2f
/*     */     //   384: fdiv
/*     */     //   385: aload #15
/*     */     //   387: aload_1
/*     */     //   388: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SliderMetrics;
/*     */     //   391: invokevirtual getThumbBorderWidth-D9Ej5fM : ()F
/*     */     //   394: invokeinterface toPx-0680j_4 : (F)F
/*     */     //   399: fadd
/*     */     //   400: putfield element : F
/*     */     //   403: aload #11
/*     */     //   405: aload #15
/*     */     //   407: aload_1
/*     */     //   408: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SliderMetrics;
/*     */     //   411: invokevirtual getStepLineHeight-D9Ej5fM : ()F
/*     */     //   414: invokeinterface toPx-0680j_4 : (F)F
/*     */     //   419: putfield element : F
/*     */     //   422: aload #12
/*     */     //   424: aload #15
/*     */     //   426: aload_1
/*     */     //   427: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SliderMetrics;
/*     */     //   430: invokevirtual getStepLineWidth-D9Ej5fM : ()F
/*     */     //   433: invokeinterface toPx-0680j_4 : (F)F
/*     */     //   438: putfield element : F
/*     */     //   441: aload #13
/*     */     //   443: aload #15
/*     */     //   445: aload_1
/*     */     //   446: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SliderMetrics;
/*     */     //   449: invokevirtual getTrackToStepSpacing-D9Ej5fM : ()F
/*     */     //   452: invokeinterface toPx-0680j_4 : (F)F
/*     */     //   457: putfield element : F
/*     */     //   460: nop
/*     */     //   461: nop
/*     */     //   462: aload_0
/*     */     //   463: aload #5
/*     */     //   465: ldc_w 58626410
/*     */     //   468: invokeinterface startReplaceGroup : (I)V
/*     */     //   473: aload #5
/*     */     //   475: astore #15
/*     */     //   477: aload #5
/*     */     //   479: aload #9
/*     */     //   481: getfield element : F
/*     */     //   484: invokeinterface changed : (F)Z
/*     */     //   489: aload #5
/*     */     //   491: aload #10
/*     */     //   493: getfield element : F
/*     */     //   496: invokeinterface changed : (F)Z
/*     */     //   501: ior
/*     */     //   502: iload #7
/*     */     //   504: sipush #896
/*     */     //   507: iand
/*     */     //   508: sipush #256
/*     */     //   511: if_icmpne -> 518
/*     */     //   514: iconst_1
/*     */     //   515: goto -> 519
/*     */     //   518: iconst_0
/*     */     //   519: ior
/*     */     //   520: iload #7
/*     */     //   522: bipush #112
/*     */     //   524: iand
/*     */     //   525: bipush #32
/*     */     //   527: if_icmpne -> 534
/*     */     //   530: iconst_1
/*     */     //   531: goto -> 535
/*     */     //   534: iconst_0
/*     */     //   535: ior
/*     */     //   536: aload #5
/*     */     //   538: aload #8
/*     */     //   540: getfield element : F
/*     */     //   543: invokeinterface changed : (F)Z
/*     */     //   548: ior
/*     */     //   549: iload #7
/*     */     //   551: sipush #7168
/*     */     //   554: iand
/*     */     //   555: sipush #2048
/*     */     //   558: if_icmpne -> 565
/*     */     //   561: iconst_1
/*     */     //   562: goto -> 566
/*     */     //   565: iconst_0
/*     */     //   566: ior
/*     */     //   567: aload #5
/*     */     //   569: aload #13
/*     */     //   571: getfield element : F
/*     */     //   574: invokeinterface changed : (F)Z
/*     */     //   579: ior
/*     */     //   580: aload #5
/*     */     //   582: aload #4
/*     */     //   584: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   589: ior
/*     */     //   590: aload #5
/*     */     //   592: aload #11
/*     */     //   594: getfield element : F
/*     */     //   597: invokeinterface changed : (F)Z
/*     */     //   602: ior
/*     */     //   603: aload #5
/*     */     //   605: aload #12
/*     */     //   607: getfield element : F
/*     */     //   610: invokeinterface changed : (F)Z
/*     */     //   615: ior
/*     */     //   616: istore #16
/*     */     //   618: iconst_0
/*     */     //   619: istore #17
/*     */     //   621: aload #15
/*     */     //   623: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   628: astore #18
/*     */     //   630: iconst_0
/*     */     //   631: istore #19
/*     */     //   633: iload #16
/*     */     //   635: ifne -> 649
/*     */     //   638: aload #18
/*     */     //   640: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   643: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   646: if_acmpne -> 695
/*     */     //   649: astore #22
/*     */     //   651: iconst_0
/*     */     //   652: istore #20
/*     */     //   654: aload #9
/*     */     //   656: aload #10
/*     */     //   658: iload_2
/*     */     //   659: aload_1
/*     */     //   660: aload #8
/*     */     //   662: fload_3
/*     */     //   663: aload #13
/*     */     //   665: aload #4
/*     */     //   667: aload #11
/*     */     //   669: aload #12
/*     */     //   671: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;ZLorg/jetbrains/jewel/ui/component/styling/SliderStyle;Lkotlin/jvm/internal/Ref$FloatRef;FLkotlin/jvm/internal/Ref$FloatRef;Ljava/util/List;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;)Lkotlin/jvm/functions/Function1;
/*     */     //   676: aload #22
/*     */     //   678: swap
/*     */     //   679: astore #21
/*     */     //   681: aload #15
/*     */     //   683: aload #21
/*     */     //   685: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   690: aload #21
/*     */     //   692: goto -> 697
/*     */     //   695: aload #18
/*     */     //   697: nop
/*     */     //   698: nop
/*     */     //   699: nop
/*     */     //   700: checkcast kotlin/jvm/functions/Function1
/*     */     //   703: astore #14
/*     */     //   705: aload #5
/*     */     //   707: invokeinterface endReplaceGroup : ()V
/*     */     //   712: aload #14
/*     */     //   714: aload #5
/*     */     //   716: bipush #14
/*     */     //   718: iload #7
/*     */     //   720: iand
/*     */     //   721: invokestatic Canvas : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
/*     */     //   724: invokestatic isTraceInProgress : ()Z
/*     */     //   727: ifeq -> 743
/*     */     //   730: invokestatic traceEventEnd : ()V
/*     */     //   733: goto -> 743
/*     */     //   736: aload #5
/*     */     //   738: invokeinterface skipToGroupEnd : ()V
/*     */     //   743: aload #5
/*     */     //   745: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   750: dup
/*     */     //   751: ifnull -> 775
/*     */     //   754: aload_0
/*     */     //   755: aload_1
/*     */     //   756: iload_2
/*     */     //   757: fload_3
/*     */     //   758: aload #4
/*     */     //   760: iload #6
/*     */     //   762: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/SliderStyle;ZFLjava/util/List;I)Lkotlin/jvm/functions/Function2;
/*     */     //   767: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   772: goto -> 776
/*     */     //   775: pop
/*     */     //   776: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #253	-> 0
/*     */     //   #254	-> 219
/*     */     //   #255	-> 228
/*     */     //   #256	-> 237
/*     */     //   #257	-> 246
/*     */     //   #258	-> 255
/*     */     //   #259	-> 264
/*     */     //   #261	-> 273
/*     */     //   #776	-> 293
/*     */     //   #261	-> 314
/*     */     //   #262	-> 322
/*     */     //   #263	-> 341
/*     */     //   #264	-> 363
/*     */     //   #265	-> 403
/*     */     //   #266	-> 422
/*     */     //   #267	-> 441
/*     */     //   #268	-> 460
/*     */     //   #261	-> 461
/*     */     //   #270	-> 462
/*     */     //   #777	-> 621
/*     */     //   #778	-> 633
/*     */     //   #779	-> 649
/*     */     //   #270	-> 654
/*     */     //   #779	-> 679
/*     */     //   #780	-> 681
/*     */     //   #781	-> 690
/*     */     //   #782	-> 695
/*     */     //   #778	-> 697
/*     */     //   #777	-> 698
/*     */     //   #777	-> 699
/*     */     //   #270	-> 700
/*     */     //   #313	-> 736
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   287	27	16	$i$f$getCurrent	I
/*     */     //   284	30	14	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   284	30	15	$changed$iv	I
/*     */     //   322	139	16	$i$a$-with-SliderKt$Track$1	I
/*     */     //   319	142	15	$this$Track_u24lambda_u248	Landroidx/compose/ui/unit/Density;
/*     */     //   654	22	20	$i$a$-cache-SliderKt$Track$2	I
/*     */     //   681	11	21	value$iv	Ljava/lang/Object;
/*     */     //   633	65	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   630	68	18	it$iv	Ljava/lang/Object;
/*     */     //   621	79	17	$i$f$cache	I
/*     */     //   618	82	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   618	82	16	invalid$iv	Z
/*     */     //   228	505	8	trackStrokeWidthPx	Lkotlin/jvm/internal/Ref$FloatRef;
/*     */     //   237	496	9	thumbWidthPx	Lkotlin/jvm/internal/Ref$FloatRef;
/*     */     //   246	487	10	trackYPx	Lkotlin/jvm/internal/Ref$FloatRef;
/*     */     //   255	478	11	stepLineHeightPx	Lkotlin/jvm/internal/Ref$FloatRef;
/*     */     //   264	469	12	stepLineWidthPx	Lkotlin/jvm/internal/Ref$FloatRef;
/*     */     //   273	460	13	trackToMarkersGapPx	Lkotlin/jvm/internal/Ref$FloatRef;
/*     */     //   16	761	7	$dirty	I
/*     */     //   0	777	0	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	777	1	style	Lorg/jetbrains/jewel/ui/component/styling/SliderStyle;
/*     */     //   0	777	2	enabled	Z
/*     */     //   0	777	3	positionFractionEnd	F
/*     */     //   0	777	4	tickFractions	Ljava/util/List;
/*     */     //   0	777	5	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	777	6	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit Track$lambda$11$lambda$10(Ref.FloatRef $thumbWidthPx, Ref.FloatRef $trackYPx, boolean $enabled, SliderStyle $style, Ref.FloatRef $trackStrokeWidthPx, float $positionFractionEnd, Ref.FloatRef $trackToMarkersGapPx, List $tickFractions, Ref.FloatRef $stepLineHeightPx, Ref.FloatRef $stepLineWidthPx, DrawScope $this$Canvas) {
/*     */     Intrinsics.checkNotNullParameter($this$Canvas, "$this$Canvas");
/*     */     boolean isRtl = ($this$Canvas.getLayoutDirection() == LayoutDirection.Rtl);
/*     */     long trackLeft = OffsetKt.Offset($thumbWidthPx.element / 2, $trackYPx.element);
/*     */     long trackRight = OffsetKt.Offset(Size.getWidth-impl($this$Canvas.getSize-NH-jbRc()) - $thumbWidthPx.element / 2, $trackYPx.element);
/*     */     long trackStart = isRtl ? trackRight : trackLeft;
/*     */     long trackEnd = isRtl ? trackLeft : trackRight;
/*     */     DrawScope.drawLine-NGM6Ib0$default($this$Canvas, $enabled ? $style.getColors().getTrack-0d7_KjU() : $style.getColors().getTrackDisabled-0d7_KjU(), trackStart, trackEnd, $trackStrokeWidthPx.element, StrokeCap.Companion.getRound-KaPHkGw(), null, 0.0F, null, 0, 480, null);
/*     */     long activeTrackStart = OffsetKt.Offset(Offset.getX-impl(trackStart), $trackYPx.element);
/*     */     long activeTrackEnd = OffsetKt.Offset(Offset.getX-impl(trackStart) + (Offset.getX-impl(trackEnd) - Offset.getX-impl(trackStart)) * $positionFractionEnd - $thumbWidthPx.element / 2, $trackYPx.element);
/*     */     DrawScope.drawLine-NGM6Ib0$default($this$Canvas, $enabled ? $style.getColors().getTrackFilled-0d7_KjU() : $style.getColors().getTrackFilledDisabled-0d7_KjU(), activeTrackStart, activeTrackEnd, $trackStrokeWidthPx.element, StrokeCap.Companion.getRound-KaPHkGw(), null, 0.0F, null, 0, 480, null);
/*     */     float stepMarkerY = $trackStrokeWidthPx.element + $trackToMarkersGapPx.element;
/*     */     Iterable $this$forEach$iv = $tickFractions;
/*     */     int $i$f$forEach = 0;
/*     */     Iterator iterator = $this$forEach$iv.iterator();
/*     */     if (iterator.hasNext()) {
/*     */       Object element$iv = iterator.next();
/*     */       float fraction = ((Number)element$iv).floatValue();
/*     */       int $i$a$-forEach-SliderKt$Track$2$1$1 = 0;
/*     */     } 
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   private static final void SliderThumb-RfXq3Jk(BoxScope $this$SliderThumb_u2dRfXq3Jk, float offset, MutableInteractionSource interactionSource, SliderStyle style, boolean enabled, Modifier modifier, Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload #6
/*     */     //   2: ldc_w 745902203
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #6
/*     */     //   12: iload #7
/*     */     //   14: istore #9
/*     */     //   16: iload #8
/*     */     //   18: ldc_w -2147483648
/*     */     //   21: iand
/*     */     //   22: ifeq -> 35
/*     */     //   25: iload #9
/*     */     //   27: bipush #6
/*     */     //   29: ior
/*     */     //   30: istore #9
/*     */     //   32: goto -> 64
/*     */     //   35: iload #7
/*     */     //   37: bipush #6
/*     */     //   39: iand
/*     */     //   40: ifne -> 64
/*     */     //   43: iload #9
/*     */     //   45: aload #6
/*     */     //   47: aload_0
/*     */     //   48: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   53: ifeq -> 60
/*     */     //   56: iconst_4
/*     */     //   57: goto -> 61
/*     */     //   60: iconst_2
/*     */     //   61: ior
/*     */     //   62: istore #9
/*     */     //   64: iload #8
/*     */     //   66: iconst_1
/*     */     //   67: iand
/*     */     //   68: ifeq -> 81
/*     */     //   71: iload #9
/*     */     //   73: bipush #48
/*     */     //   75: ior
/*     */     //   76: istore #9
/*     */     //   78: goto -> 112
/*     */     //   81: iload #7
/*     */     //   83: bipush #48
/*     */     //   85: iand
/*     */     //   86: ifne -> 112
/*     */     //   89: iload #9
/*     */     //   91: aload #6
/*     */     //   93: fload_1
/*     */     //   94: invokeinterface changed : (F)Z
/*     */     //   99: ifeq -> 107
/*     */     //   102: bipush #32
/*     */     //   104: goto -> 109
/*     */     //   107: bipush #16
/*     */     //   109: ior
/*     */     //   110: istore #9
/*     */     //   112: iload #8
/*     */     //   114: iconst_2
/*     */     //   115: iand
/*     */     //   116: ifeq -> 130
/*     */     //   119: iload #9
/*     */     //   121: sipush #384
/*     */     //   124: ior
/*     */     //   125: istore #9
/*     */     //   127: goto -> 164
/*     */     //   130: iload #7
/*     */     //   132: sipush #384
/*     */     //   135: iand
/*     */     //   136: ifne -> 164
/*     */     //   139: iload #9
/*     */     //   141: aload #6
/*     */     //   143: aload_2
/*     */     //   144: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   149: ifeq -> 158
/*     */     //   152: sipush #256
/*     */     //   155: goto -> 161
/*     */     //   158: sipush #128
/*     */     //   161: ior
/*     */     //   162: istore #9
/*     */     //   164: iload #8
/*     */     //   166: iconst_4
/*     */     //   167: iand
/*     */     //   168: ifeq -> 182
/*     */     //   171: iload #9
/*     */     //   173: sipush #3072
/*     */     //   176: ior
/*     */     //   177: istore #9
/*     */     //   179: goto -> 216
/*     */     //   182: iload #7
/*     */     //   184: sipush #3072
/*     */     //   187: iand
/*     */     //   188: ifne -> 216
/*     */     //   191: iload #9
/*     */     //   193: aload #6
/*     */     //   195: aload_3
/*     */     //   196: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   201: ifeq -> 210
/*     */     //   204: sipush #2048
/*     */     //   207: goto -> 213
/*     */     //   210: sipush #1024
/*     */     //   213: ior
/*     */     //   214: istore #9
/*     */     //   216: iload #8
/*     */     //   218: bipush #8
/*     */     //   220: iand
/*     */     //   221: ifeq -> 235
/*     */     //   224: iload #9
/*     */     //   226: sipush #24576
/*     */     //   229: ior
/*     */     //   230: istore #9
/*     */     //   232: goto -> 270
/*     */     //   235: iload #7
/*     */     //   237: sipush #24576
/*     */     //   240: iand
/*     */     //   241: ifne -> 270
/*     */     //   244: iload #9
/*     */     //   246: aload #6
/*     */     //   248: iload #4
/*     */     //   250: invokeinterface changed : (Z)Z
/*     */     //   255: ifeq -> 264
/*     */     //   258: sipush #16384
/*     */     //   261: goto -> 267
/*     */     //   264: sipush #8192
/*     */     //   267: ior
/*     */     //   268: istore #9
/*     */     //   270: iload #8
/*     */     //   272: bipush #16
/*     */     //   274: iand
/*     */     //   275: ifeq -> 288
/*     */     //   278: iload #9
/*     */     //   280: ldc 196608
/*     */     //   282: ior
/*     */     //   283: istore #9
/*     */     //   285: goto -> 320
/*     */     //   288: iload #7
/*     */     //   290: ldc 196608
/*     */     //   292: iand
/*     */     //   293: ifne -> 320
/*     */     //   296: iload #9
/*     */     //   298: aload #6
/*     */     //   300: aload #5
/*     */     //   302: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   307: ifeq -> 315
/*     */     //   310: ldc 131072
/*     */     //   312: goto -> 317
/*     */     //   315: ldc 65536
/*     */     //   317: ior
/*     */     //   318: istore #9
/*     */     //   320: iload #9
/*     */     //   322: ldc_w 74899
/*     */     //   325: iand
/*     */     //   326: ldc_w 74898
/*     */     //   329: if_icmpne -> 342
/*     */     //   332: aload #6
/*     */     //   334: invokeinterface getSkipping : ()Z
/*     */     //   339: ifne -> 1306
/*     */     //   342: iload #8
/*     */     //   344: bipush #16
/*     */     //   346: iand
/*     */     //   347: ifeq -> 358
/*     */     //   350: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   353: checkcast androidx/compose/ui/Modifier
/*     */     //   356: astore #5
/*     */     //   358: invokestatic isTraceInProgress : ()Z
/*     */     //   361: ifeq -> 376
/*     */     //   364: ldc_w 745902203
/*     */     //   367: iload #9
/*     */     //   369: iconst_m1
/*     */     //   370: ldc_w 'org.jetbrains.jewel.ui.component.SliderThumb (Slider.kt:321)'
/*     */     //   373: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   376: aload_0
/*     */     //   377: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   380: checkcast androidx/compose/ui/Modifier
/*     */     //   383: fload_1
/*     */     //   384: aload_3
/*     */     //   385: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SliderMetrics;
/*     */     //   388: invokevirtual getThumbBorderWidth-D9Ej5fM : ()F
/*     */     //   391: fconst_0
/*     */     //   392: fconst_0
/*     */     //   393: bipush #12
/*     */     //   395: aconst_null
/*     */     //   396: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   399: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   402: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   405: invokeinterface align : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;
/*     */     //   410: astore #10
/*     */     //   412: iconst_0
/*     */     //   413: istore #13
/*     */     //   415: iconst_0
/*     */     //   416: istore #14
/*     */     //   418: aload #6
/*     */     //   420: ldc_w 733328855
/*     */     //   423: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   426: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   429: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   432: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   435: astore #11
/*     */     //   437: iconst_0
/*     */     //   438: istore #12
/*     */     //   440: aload #11
/*     */     //   442: iload #12
/*     */     //   444: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   447: astore #15
/*     */     //   449: bipush #112
/*     */     //   451: iload #13
/*     */     //   453: iconst_3
/*     */     //   454: ishl
/*     */     //   455: iand
/*     */     //   456: istore #16
/*     */     //   458: nop
/*     */     //   459: iconst_0
/*     */     //   460: istore #17
/*     */     //   462: aload #6
/*     */     //   464: ldc_w -1323940314
/*     */     //   467: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   470: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   473: aload #6
/*     */     //   475: iconst_0
/*     */     //   476: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   479: istore #18
/*     */     //   481: aload #6
/*     */     //   483: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   488: astore #19
/*     */     //   490: aload #6
/*     */     //   492: aload #10
/*     */     //   494: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   497: astore #20
/*     */     //   499: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   502: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   505: astore #21
/*     */     //   507: bipush #6
/*     */     //   509: sipush #896
/*     */     //   512: iload #16
/*     */     //   514: bipush #6
/*     */     //   516: ishl
/*     */     //   517: iand
/*     */     //   518: ior
/*     */     //   519: istore #22
/*     */     //   521: nop
/*     */     //   522: iconst_0
/*     */     //   523: istore #23
/*     */     //   525: aload #6
/*     */     //   527: ldc_w -692256719
/*     */     //   530: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   533: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   536: aload #6
/*     */     //   538: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   543: instanceof androidx/compose/runtime/Applier
/*     */     //   546: ifne -> 552
/*     */     //   549: invokestatic invalidApplier : ()V
/*     */     //   552: aload #6
/*     */     //   554: invokeinterface startReusableNode : ()V
/*     */     //   559: aload #6
/*     */     //   561: invokeinterface getInserting : ()Z
/*     */     //   566: ifeq -> 581
/*     */     //   569: aload #6
/*     */     //   571: aload #21
/*     */     //   573: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   578: goto -> 588
/*     */     //   581: aload #6
/*     */     //   583: invokeinterface useNode : ()V
/*     */     //   588: aload #6
/*     */     //   590: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   593: astore #24
/*     */     //   595: iconst_0
/*     */     //   596: istore #25
/*     */     //   598: aload #24
/*     */     //   600: aload #15
/*     */     //   602: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   605: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   608: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   611: aload #24
/*     */     //   613: aload #19
/*     */     //   615: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   618: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   621: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   624: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   627: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   630: astore #26
/*     */     //   632: iconst_0
/*     */     //   633: istore #27
/*     */     //   635: aload #24
/*     */     //   637: astore #28
/*     */     //   639: iconst_0
/*     */     //   640: istore #29
/*     */     //   642: aload #28
/*     */     //   644: invokeinterface getInserting : ()Z
/*     */     //   649: ifne -> 670
/*     */     //   652: aload #28
/*     */     //   654: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   659: iload #18
/*     */     //   661: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   664: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   667: ifne -> 696
/*     */     //   670: aload #28
/*     */     //   672: iload #18
/*     */     //   674: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   677: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   682: aload #24
/*     */     //   684: iload #18
/*     */     //   686: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   689: aload #26
/*     */     //   691: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   696: nop
/*     */     //   697: nop
/*     */     //   698: nop
/*     */     //   699: aload #24
/*     */     //   701: aload #20
/*     */     //   703: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   706: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   709: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   712: nop
/*     */     //   713: nop
/*     */     //   714: aload #6
/*     */     //   716: bipush #14
/*     */     //   718: iload #22
/*     */     //   720: bipush #6
/*     */     //   722: ishr
/*     */     //   723: iand
/*     */     //   724: istore #30
/*     */     //   726: astore #31
/*     */     //   728: iconst_0
/*     */     //   729: istore #32
/*     */     //   731: aload #31
/*     */     //   733: ldc_w -2146769399
/*     */     //   736: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   739: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   742: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   745: aload #31
/*     */     //   747: bipush #6
/*     */     //   749: bipush #112
/*     */     //   751: iload #13
/*     */     //   753: bipush #6
/*     */     //   755: ishr
/*     */     //   756: iand
/*     */     //   757: ior
/*     */     //   758: istore #33
/*     */     //   760: astore #34
/*     */     //   762: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   765: astore #35
/*     */     //   767: iconst_0
/*     */     //   768: istore #36
/*     */     //   770: aload #34
/*     */     //   772: ldc_w 876008394
/*     */     //   775: invokeinterface startReplaceGroup : (I)V
/*     */     //   780: aload #34
/*     */     //   782: astore #37
/*     */     //   784: iconst_0
/*     */     //   785: istore #38
/*     */     //   787: nop
/*     */     //   788: iconst_0
/*     */     //   789: istore #39
/*     */     //   791: aload #37
/*     */     //   793: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   798: astore #40
/*     */     //   800: iconst_0
/*     */     //   801: istore #41
/*     */     //   803: aload #40
/*     */     //   805: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   808: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   811: if_acmpne -> 857
/*     */     //   814: iconst_0
/*     */     //   815: istore #42
/*     */     //   817: getstatic org/jetbrains/jewel/ui/component/SliderState.Companion : Lorg/jetbrains/jewel/ui/component/SliderState$Companion;
/*     */     //   820: iload #4
/*     */     //   822: iconst_0
/*     */     //   823: iconst_0
/*     */     //   824: iconst_0
/*     */     //   825: iconst_0
/*     */     //   826: bipush #30
/*     */     //   828: aconst_null
/*     */     //   829: invokestatic of-GPhM_18$default : (Lorg/jetbrains/jewel/ui/component/SliderState$Companion;ZZZZZILjava/lang/Object;)J
/*     */     //   832: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/SliderState;
/*     */     //   835: aconst_null
/*     */     //   836: iconst_2
/*     */     //   837: aconst_null
/*     */     //   838: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   841: astore #43
/*     */     //   843: aload #37
/*     */     //   845: aload #43
/*     */     //   847: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   852: aload #43
/*     */     //   854: goto -> 859
/*     */     //   857: aload #40
/*     */     //   859: nop
/*     */     //   860: nop
/*     */     //   861: nop
/*     */     //   862: checkcast androidx/compose/runtime/MutableState
/*     */     //   865: astore #44
/*     */     //   867: aload #34
/*     */     //   869: invokeinterface endReplaceGroup : ()V
/*     */     //   874: aload #44
/*     */     //   876: astore #45
/*     */     //   878: aload #34
/*     */     //   880: ldc_w 876010353
/*     */     //   883: invokeinterface startReplaceGroup : (I)V
/*     */     //   888: aload #34
/*     */     //   890: astore #44
/*     */     //   892: iload #9
/*     */     //   894: ldc_w 57344
/*     */     //   897: iand
/*     */     //   898: sipush #16384
/*     */     //   901: if_icmpne -> 908
/*     */     //   904: iconst_1
/*     */     //   905: goto -> 909
/*     */     //   908: iconst_0
/*     */     //   909: istore #37
/*     */     //   911: nop
/*     */     //   912: iconst_0
/*     */     //   913: istore #38
/*     */     //   915: aload #44
/*     */     //   917: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   922: astore #39
/*     */     //   924: iconst_0
/*     */     //   925: istore #40
/*     */     //   927: iload #37
/*     */     //   929: ifne -> 943
/*     */     //   932: aload #39
/*     */     //   934: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   937: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   940: if_acmpne -> 986
/*     */     //   943: iconst_0
/*     */     //   944: istore #41
/*     */     //   946: aload #45
/*     */     //   948: aload #45
/*     */     //   950: invokestatic SliderThumb_RfXq3Jk$lambda$18$lambda$14 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   953: iload #4
/*     */     //   955: iconst_0
/*     */     //   956: iconst_0
/*     */     //   957: iconst_0
/*     */     //   958: iconst_0
/*     */     //   959: bipush #30
/*     */     //   961: aconst_null
/*     */     //   962: invokestatic copy-GPhM_18$default : (JZZZZZILjava/lang/Object;)J
/*     */     //   965: invokestatic SliderThumb_RfXq3Jk$lambda$18$lambda$15 : (Landroidx/compose/runtime/MutableState;J)V
/*     */     //   968: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   971: astore #42
/*     */     //   973: aload #44
/*     */     //   975: aload #42
/*     */     //   977: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   982: nop
/*     */     //   983: goto -> 987
/*     */     //   986: nop
/*     */     //   987: nop
/*     */     //   988: nop
/*     */     //   989: nop
/*     */     //   990: aload #34
/*     */     //   992: invokeinterface endReplaceGroup : ()V
/*     */     //   997: aload_2
/*     */     //   998: aload #34
/*     */     //   1000: ldc_w 876014436
/*     */     //   1003: invokeinterface startReplaceGroup : (I)V
/*     */     //   1008: aload #34
/*     */     //   1010: astore #37
/*     */     //   1012: iload #9
/*     */     //   1014: sipush #896
/*     */     //   1017: iand
/*     */     //   1018: sipush #256
/*     */     //   1021: if_icmpne -> 1028
/*     */     //   1024: iconst_1
/*     */     //   1025: goto -> 1029
/*     */     //   1028: iconst_0
/*     */     //   1029: istore #38
/*     */     //   1031: iconst_0
/*     */     //   1032: istore #39
/*     */     //   1034: aload #37
/*     */     //   1036: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1041: astore #40
/*     */     //   1043: iconst_0
/*     */     //   1044: istore #41
/*     */     //   1046: iload #38
/*     */     //   1048: ifne -> 1062
/*     */     //   1051: aload #40
/*     */     //   1053: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1056: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1059: if_acmpne -> 1100
/*     */     //   1062: astore #46
/*     */     //   1064: iconst_0
/*     */     //   1065: istore #42
/*     */     //   1067: new org/jetbrains/jewel/ui/component/SliderKt$SliderThumb$1$2$1
/*     */     //   1070: dup
/*     */     //   1071: aload_2
/*     */     //   1072: aload #45
/*     */     //   1074: aconst_null
/*     */     //   1075: invokespecial <init> : (Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*     */     //   1078: checkcast kotlin/jvm/functions/Function2
/*     */     //   1081: aload #46
/*     */     //   1083: swap
/*     */     //   1084: astore #43
/*     */     //   1086: aload #37
/*     */     //   1088: aload #43
/*     */     //   1090: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1095: aload #43
/*     */     //   1097: goto -> 1102
/*     */     //   1100: aload #40
/*     */     //   1102: nop
/*     */     //   1103: nop
/*     */     //   1104: nop
/*     */     //   1105: checkcast kotlin/jvm/functions/Function2
/*     */     //   1108: astore #44
/*     */     //   1110: aload #34
/*     */     //   1112: invokeinterface endReplaceGroup : ()V
/*     */     //   1117: aload #44
/*     */     //   1119: aload #34
/*     */     //   1121: bipush #14
/*     */     //   1123: iload #9
/*     */     //   1125: bipush #6
/*     */     //   1127: ishr
/*     */     //   1128: iand
/*     */     //   1129: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1132: aload_3
/*     */     //   1133: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SliderMetrics;
/*     */     //   1136: invokevirtual getThumbSize-MYxV2XQ : ()J
/*     */     //   1139: lstore #47
/*     */     //   1141: aload #5
/*     */     //   1143: lload #47
/*     */     //   1145: invokestatic size-6HolHcs : (Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;
/*     */     //   1148: aload_2
/*     */     //   1149: iload #4
/*     */     //   1151: invokestatic hoverable : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Z)Landroidx/compose/ui/Modifier;
/*     */     //   1154: aload_3
/*     */     //   1155: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/SliderColors;
/*     */     //   1158: aload #45
/*     */     //   1160: invokestatic SliderThumb_RfXq3Jk$lambda$18$lambda$14 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1163: aload #34
/*     */     //   1165: iconst_0
/*     */     //   1166: invokevirtual thumbFillFor-p6gmeQ4 : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1169: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   1174: checkcast androidx/compose/ui/graphics/Color
/*     */     //   1177: invokevirtual unbox-impl : ()J
/*     */     //   1180: aload_3
/*     */     //   1181: invokevirtual getThumbShape : ()Landroidx/compose/ui/graphics/Shape;
/*     */     //   1184: invokestatic background-bw27NRU : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*     */     //   1187: getstatic org/jetbrains/jewel/foundation/Stroke$Alignment.Outside : Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */     //   1190: aload_3
/*     */     //   1191: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SliderMetrics;
/*     */     //   1194: invokevirtual getThumbBorderWidth-D9Ej5fM : ()F
/*     */     //   1197: aload_3
/*     */     //   1198: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/SliderColors;
/*     */     //   1201: aload #45
/*     */     //   1203: invokestatic SliderThumb_RfXq3Jk$lambda$18$lambda$14 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1206: aload #34
/*     */     //   1208: iconst_0
/*     */     //   1209: invokevirtual thumbBorderFor-p6gmeQ4 : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1212: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   1217: checkcast androidx/compose/ui/graphics/Color
/*     */     //   1220: invokevirtual unbox-impl : ()J
/*     */     //   1223: aload_3
/*     */     //   1224: invokevirtual getThumbShape : ()Landroidx/compose/ui/graphics/Shape;
/*     */     //   1227: fconst_0
/*     */     //   1228: bipush #16
/*     */     //   1230: aconst_null
/*     */     //   1231: invokestatic border-QWjY48E$default : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FJLandroidx/compose/ui/graphics/Shape;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1234: aload #45
/*     */     //   1236: invokestatic SliderThumb_RfXq3Jk$lambda$18$lambda$14 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1239: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/SliderState;
/*     */     //   1242: aload_3
/*     */     //   1243: invokevirtual getThumbShape : ()Landroidx/compose/ui/graphics/Shape;
/*     */     //   1246: aconst_null
/*     */     //   1247: fconst_0
/*     */     //   1248: fconst_0
/*     */     //   1249: aload #34
/*     */     //   1251: iconst_0
/*     */     //   1252: bipush #28
/*     */     //   1254: invokestatic focusOutline-AGcomas : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/state/FocusableComponentState;Landroidx/compose/ui/graphics/Shape;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
/*     */     //   1257: aload #34
/*     */     //   1259: iconst_0
/*     */     //   1260: invokestatic Spacer : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1263: nop
/*     */     //   1264: aload #31
/*     */     //   1266: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1269: aload #6
/*     */     //   1271: invokeinterface endNode : ()V
/*     */     //   1276: aload #6
/*     */     //   1278: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1281: nop
/*     */     //   1282: aload #6
/*     */     //   1284: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1287: nop
/*     */     //   1288: aload #6
/*     */     //   1290: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1293: nop
/*     */     //   1294: invokestatic isTraceInProgress : ()Z
/*     */     //   1297: ifeq -> 1313
/*     */     //   1300: invokestatic traceEventEnd : ()V
/*     */     //   1303: goto -> 1313
/*     */     //   1306: aload #6
/*     */     //   1308: invokeinterface skipToGroupEnd : ()V
/*     */     //   1313: aload #6
/*     */     //   1315: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1320: dup
/*     */     //   1321: ifnull -> 1349
/*     */     //   1324: aload_0
/*     */     //   1325: fload_1
/*     */     //   1326: aload_2
/*     */     //   1327: aload_3
/*     */     //   1328: iload #4
/*     */     //   1330: aload #5
/*     */     //   1332: iload #7
/*     */     //   1334: iload #8
/*     */     //   1336: <illegal opcode> invoke : (Landroidx/compose/foundation/layout/BoxScope;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/SliderStyle;ZLandroidx/compose/ui/Modifier;II)Lkotlin/jvm/functions/Function2;
/*     */     //   1341: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1346: goto -> 1350
/*     */     //   1349: pop
/*     */     //   1350: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #322	-> 0
/*     */     //   #321	-> 350
/*     */     //   #322	-> 373
/*     */     //   #323	-> 376
/*     */     //   #783	-> 426
/*     */     //   #784	-> 429
/*     */     //   #785	-> 437
/*     */     //   #788	-> 440
/*     */     //   #789	-> 458
/*     */     //   #790	-> 470
/*     */     //   #791	-> 476
/*     */     //   #792	-> 483
/*     */     //   #793	-> 492
/*     */     //   #795	-> 499
/*     */     //   #794	-> 521
/*     */     //   #796	-> 533
/*     */     //   #797	-> 536
/*     */     //   #798	-> 554
/*     */     //   #799	-> 559
/*     */     //   #800	-> 571
/*     */     //   #802	-> 583
/*     */     //   #804	-> 588
/*     */     //   #805	-> 598
/*     */     //   #806	-> 611
/*     */     //   #808	-> 624
/*     */     //   #809	-> 635
/*     */     //   #810	-> 642
/*     */     //   #811	-> 670
/*     */     //   #812	-> 682
/*     */     //   #814	-> 696
/*     */     //   #809	-> 697
/*     */     //   #814	-> 698
/*     */     //   #815	-> 699
/*     */     //   #816	-> 712
/*     */     //   #804	-> 713
/*     */     //   #817	-> 714
/*     */     //   #818	-> 739
/*     */     //   #324	-> 787
/*     */     //   #819	-> 791
/*     */     //   #820	-> 803
/*     */     //   #821	-> 814
/*     */     //   #324	-> 817
/*     */     //   #821	-> 841
/*     */     //   #822	-> 843
/*     */     //   #823	-> 852
/*     */     //   #824	-> 857
/*     */     //   #820	-> 859
/*     */     //   #819	-> 860
/*     */     //   #819	-> 861
/*     */     //   #324	-> 862
/*     */     //   #325	-> 911
/*     */     //   #825	-> 915
/*     */     //   #826	-> 927
/*     */     //   #827	-> 943
/*     */     //   #325	-> 946
/*     */     //   #827	-> 971
/*     */     //   #828	-> 973
/*     */     //   #829	-> 982
/*     */     //   #830	-> 986
/*     */     //   #826	-> 987
/*     */     //   #825	-> 988
/*     */     //   #825	-> 989
/*     */     //   #327	-> 997
/*     */     //   #831	-> 1034
/*     */     //   #832	-> 1046
/*     */     //   #833	-> 1062
/*     */     //   #327	-> 1067
/*     */     //   #833	-> 1084
/*     */     //   #834	-> 1086
/*     */     //   #835	-> 1095
/*     */     //   #836	-> 1100
/*     */     //   #832	-> 1102
/*     */     //   #831	-> 1103
/*     */     //   #831	-> 1104
/*     */     //   #327	-> 1105
/*     */     //   #346	-> 1132
/*     */     //   #348	-> 1141
/*     */     //   #349	-> 1143
/*     */     //   #350	-> 1148
/*     */     //   #351	-> 1154
/*     */     //   #353	-> 1187
/*     */     //   #354	-> 1190
/*     */     //   #355	-> 1197
/*     */     //   #356	-> 1223
/*     */     //   #352	-> 1227
/*     */     //   #358	-> 1234
/*     */     //   #347	-> 1260
/*     */     //   #360	-> 1263
/*     */     //   #818	-> 1264
/*     */     //   #817	-> 1269
/*     */     //   #837	-> 1271
/*     */     //   #796	-> 1278
/*     */     //   #838	-> 1281
/*     */     //   #790	-> 1284
/*     */     //   #839	-> 1287
/*     */     //   #783	-> 1290
/*     */     //   #840	-> 1293
/*     */     //   #361	-> 1306
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   817	24	42	$i$a$-cache-SliderKt$SliderThumb$1$state$2	I
/*     */     //   843	11	43	value$iv	Ljava/lang/Object;
/*     */     //   803	57	41	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   800	60	40	it$iv	Ljava/lang/Object;
/*     */     //   791	71	39	$i$f$cache	I
/*     */     //   788	74	37	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   788	74	38	invalid$iv	Z
/*     */     //   946	22	41	$i$a$-cache-SliderKt$SliderThumb$1$1	I
/*     */     //   973	10	42	value$iv	Ljava/lang/Object;
/*     */     //   927	61	40	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   924	64	39	it$iv	Ljava/lang/Object;
/*     */     //   915	75	38	$i$f$cache	I
/*     */     //   912	78	44	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   912	78	37	invalid$iv	Z
/*     */     //   1067	14	42	$i$a$-cache-SliderKt$SliderThumb$1$2	I
/*     */     //   1086	11	43	value$iv	Ljava/lang/Object;
/*     */     //   1046	57	41	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1043	60	40	it$iv	Ljava/lang/Object;
/*     */     //   1034	71	39	$i$f$cache	I
/*     */     //   1031	74	37	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1031	74	38	invalid$iv	Z
/*     */     //   770	494	36	$i$a$-Box-SliderKt$SliderThumb$1	I
/*     */     //   878	386	45	state$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   1141	123	47	thumbSize	J
/*     */     //   767	497	35	$this$SliderThumb_RfXq3Jk_u24lambda_u2418	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   767	497	34	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   767	497	33	$changed	I
/*     */     //   731	538	32	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   728	541	31	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   728	541	30	$changed$iv	I
/*     */     //   642	55	29	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   639	58	28	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   635	64	27	$i$f$set-impl	I
/*     */     //   632	67	26	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   598	115	25	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   595	118	24	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   525	757	23	$i$f$ReusableComposeNode	I
/*     */     //   522	760	21	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   522	760	22	$changed$iv$iv$iv	I
/*     */     //   462	826	17	$i$f$Layout	I
/*     */     //   481	807	18	compositeKeyHash$iv$iv	I
/*     */     //   490	798	19	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   499	789	20	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   459	829	16	$changed$iv$iv	I
/*     */     //   418	876	14	$i$f$Box	I
/*     */     //   449	845	15	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   415	879	10	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   437	857	11	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   440	854	12	propagateMinConstraints$iv	Z
/*     */     //   415	879	13	$changed$iv	I
/*     */     //   16	1335	9	$dirty	I
/*     */     //   0	1351	0	$this$SliderThumb_u2dRfXq3Jk	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   0	1351	1	offset	F
/*     */     //   0	1351	2	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1351	3	style	Lorg/jetbrains/jewel/ui/component/styling/SliderStyle;
/*     */     //   0	1351	4	enabled	Z
/*     */     //   0	1351	5	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1351	6	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1351	7	$changed	I
/*     */   }
/*     */   
/*     */   private static final long SliderThumb_RfXq3Jk$lambda$18$lambda$14(MutableState $state$delegate) {
/*     */     State state = (State)$state$delegate;
/*     */     Object object = null;
/*     */     KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/*     */     return ((SliderState)state.getValue()).unbox-impl();
/*     */   }
/*     */   
/*     */   private static final void SliderThumb_RfXq3Jk$lambda$18$lambda$15(MutableState $state$delegate, long <set-?>) {
/*     */     MutableState mutableState = $state$delegate;
/*     */     Object object1 = null, object2 = null;
/*     */     Object value$iv = SliderState.box-impl(<set-?>);
/*     */     int $i$f$setValue = 0;
/*     */     mutableState.setValue(value$iv);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "Slider.kt", l = {328}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.SliderKt$SliderThumb$1$2$1")
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class SliderKt$SliderThumb$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     SliderKt$SliderThumb$1$2$1(MutableInteractionSource $interactionSource, MutableState<SliderState> $state$delegate, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$state$delegate) {
/*     */                 public final Object emit(Interaction interaction, Continuation $completion) {
/*     */                   Interaction interaction1 = interaction;
/*     */                   if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press || interaction1 instanceof androidx.compose.foundation.interaction.DragInteraction.Start) {
/*     */                     SliderKt.SliderThumb_RfXq3Jk$lambda$18$lambda$15(this.$state$delegate, SliderState.copy-GPhM_18$default(SliderKt.SliderThumb_RfXq3Jk$lambda$18$lambda$14(this.$state$delegate), false, false, true, false, false, 27, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.DragInteraction.Stop || interaction1 instanceof androidx.compose.foundation.interaction.DragInteraction.Cancel) {
/*     */                     SliderKt.SliderThumb_RfXq3Jk$lambda$18$lambda$15(this.$state$delegate, SliderState.copy-GPhM_18$default(SliderKt.SliderThumb_RfXq3Jk$lambda$18$lambda$14(this.$state$delegate), false, false, false, false, false, 27, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) {
/*     */                     SliderKt.SliderThumb_RfXq3Jk$lambda$18$lambda$15(this.$state$delegate, SliderState.copy-GPhM_18$default(SliderKt.SliderThumb_RfXq3Jk$lambda$18$lambda$14(this.$state$delegate), false, false, false, true, false, 23, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) {
/*     */                     SliderKt.SliderThumb_RfXq3Jk$lambda$18$lambda$15(this.$state$delegate, SliderState.copy-GPhM_18$default(SliderKt.SliderThumb_RfXq3Jk$lambda$18$lambda$14(this.$state$delegate), false, false, false, false, false, 23, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) {
/*     */                     SliderKt.SliderThumb_RfXq3Jk$lambda$18$lambda$15(this.$state$delegate, SliderState.copy-GPhM_18$default(SliderKt.SliderThumb_RfXq3Jk$lambda$18$lambda$14(this.$state$delegate), false, true, false, false, false, 29, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) {
/*     */                     SliderKt.SliderThumb_RfXq3Jk$lambda$18$lambda$15(this.$state$delegate, SliderState.copy-GPhM_18$default(SliderKt.SliderThumb_RfXq3Jk$lambda$18$lambda$14(this.$state$delegate), false, false, false, false, false, 29, null));
/*     */                   } 
/*     */                   return Unit.INSTANCE;
/*     */                 }
/*     */               }(Continuation)this) == object)
/*     */             return object; 
/*     */           this.$interactionSource.getInteractions().collect(new FlowCollector(this.$state$delegate) {
/*     */                 public final Object emit(Interaction interaction, Continuation $completion) {
/*     */                   Interaction interaction1 = interaction;
/*     */                   if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press || interaction1 instanceof androidx.compose.foundation.interaction.DragInteraction.Start) {
/*     */                     SliderKt.SliderThumb_RfXq3Jk$lambda$18$lambda$15(this.$state$delegate, SliderState.copy-GPhM_18$default(SliderKt.SliderThumb_RfXq3Jk$lambda$18$lambda$14(this.$state$delegate), false, false, true, false, false, 27, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.DragInteraction.Stop || interaction1 instanceof androidx.compose.foundation.interaction.DragInteraction.Cancel) {
/*     */                     SliderKt.SliderThumb_RfXq3Jk$lambda$18$lambda$15(this.$state$delegate, SliderState.copy-GPhM_18$default(SliderKt.SliderThumb_RfXq3Jk$lambda$18$lambda$14(this.$state$delegate), false, false, false, false, false, 27, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) {
/*     */                     SliderKt.SliderThumb_RfXq3Jk$lambda$18$lambda$15(this.$state$delegate, SliderState.copy-GPhM_18$default(SliderKt.SliderThumb_RfXq3Jk$lambda$18$lambda$14(this.$state$delegate), false, false, false, true, false, 23, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) {
/*     */                     SliderKt.SliderThumb_RfXq3Jk$lambda$18$lambda$15(this.$state$delegate, SliderState.copy-GPhM_18$default(SliderKt.SliderThumb_RfXq3Jk$lambda$18$lambda$14(this.$state$delegate), false, false, false, false, false, 23, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) {
/*     */                     SliderKt.SliderThumb_RfXq3Jk$lambda$18$lambda$15(this.$state$delegate, SliderState.copy-GPhM_18$default(SliderKt.SliderThumb_RfXq3Jk$lambda$18$lambda$14(this.$state$delegate), false, true, false, false, false, 29, null));
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) {
/*     */                     SliderKt.SliderThumb_RfXq3Jk$lambda$18$lambda$15(this.$state$delegate, SliderState.copy-GPhM_18$default(SliderKt.SliderThumb_RfXq3Jk$lambda$18$lambda$14(this.$state$delegate), false, false, false, false, false, 29, null));
/*     */                   } 
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
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super SliderKt$SliderThumb$1$2$1> $completion) {
/*     */       return (Continuation<Unit>)new SliderKt$SliderThumb$1$2$1(this.$interactionSource, this.$state$delegate, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((SliderKt$SliderThumb$1$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final float snapValueToTick(float current, List tickFractions, float minPx, float maxPx) {
/*     */     Iterable $this$minByOrNull$iv = tickFractions;
/*     */     int $i$f$minByOrNull = 0;
/*     */     Iterator iterator$iv = $this$minByOrNull$iv.iterator();
/*     */     Object minElem$iv = iterator$iv.next();
/*     */     if (!iterator$iv.hasNext()) {
/*     */     
/*     */     } else {
/*     */       float it = ((Number)minElem$iv).floatValue();
/*     */       int $i$a$-minByOrNull-SliderKt$snapValueToTick$1 = 0;
/*     */       float minValue$iv = Math.abs(lerp(minPx, maxPx, it) - current);
/*     */     } 
/*     */     float $this$snapValueToTick_u24lambda_u2421 = ((Float)(!iterator$iv.hasNext() ? null : (Float)"JD-Core does not support Kotlin")).floatValue();
/*     */     int $i$a$-run-SliderKt$snapValueToTick$2 = 0;
/*     */     (Float)(!iterator$iv.hasNext() ? null : (Float)"JD-Core does not support Kotlin");
/*     */     return ((Float)(!iterator$iv.hasNext() ? null : (Float)"JD-Core does not support Kotlin") != null) ? lerp(minPx, maxPx, $this$snapValueToTick_u24lambda_u2421) : current;
/*     */   }
/*     */   
/*     */   private static final List<Float> stepsToTickFractions(int steps) {
/*     */     int i;
/*     */     ArrayList<Float> arrayList;
/*     */     byte b;
/*     */     for (i = steps + 2, arrayList = new ArrayList(i), b = 0; b < i; ) {
/*     */       byte b1 = b, b2 = b1;
/*     */       ArrayList<Float> arrayList1 = arrayList;
/*     */       int $i$a$-List-SliderKt$stepsToTickFractions$1 = 0;
/*     */       arrayList1.add(Float.valueOf(b2 / (steps + 1)));
/*     */       b++;
/*     */     } 
/*     */     return (steps == 0) ? CollectionsKt.emptyList() : arrayList;
/*     */   }
/*     */   
/*     */   private static final float scale(float a1, float b1, float x1, float a2, float b2) {
/*     */     return lerp(a2, b2, calcFraction(a1, b1, x1));
/*     */   }
/*     */   
/*     */   private static final float calcFraction(float a, float b, float pos) {
/*     */     return RangesKt.coerceIn(((b - a == 0.0F)) ? 0.0F : ((pos - a) / (b - a)), 0.0F, 1.0F);
/*     */   }
/*     */   
/*     */   @Composable
/*     */   private static final void CorrectValueSideEffect(Function1 scaleToOffset, ClosedFloatingPointRange valueRange, ClosedFloatingPointRange trackRange, MutableState valueState, float value, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: ldc_w -352281752
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #5
/*     */     //   12: iload #6
/*     */     //   14: istore #7
/*     */     //   16: iload #6
/*     */     //   18: bipush #6
/*     */     //   20: iand
/*     */     //   21: ifne -> 45
/*     */     //   24: iload #7
/*     */     //   26: aload #5
/*     */     //   28: aload_0
/*     */     //   29: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   34: ifeq -> 41
/*     */     //   37: iconst_4
/*     */     //   38: goto -> 42
/*     */     //   41: iconst_2
/*     */     //   42: ior
/*     */     //   43: istore #7
/*     */     //   45: iload #6
/*     */     //   47: bipush #48
/*     */     //   49: iand
/*     */     //   50: ifne -> 76
/*     */     //   53: iload #7
/*     */     //   55: aload #5
/*     */     //   57: aload_1
/*     */     //   58: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   63: ifeq -> 71
/*     */     //   66: bipush #32
/*     */     //   68: goto -> 73
/*     */     //   71: bipush #16
/*     */     //   73: ior
/*     */     //   74: istore #7
/*     */     //   76: iload #6
/*     */     //   78: sipush #384
/*     */     //   81: iand
/*     */     //   82: ifne -> 110
/*     */     //   85: iload #7
/*     */     //   87: aload #5
/*     */     //   89: aload_2
/*     */     //   90: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   95: ifeq -> 104
/*     */     //   98: sipush #256
/*     */     //   101: goto -> 107
/*     */     //   104: sipush #128
/*     */     //   107: ior
/*     */     //   108: istore #7
/*     */     //   110: iload #6
/*     */     //   112: sipush #3072
/*     */     //   115: iand
/*     */     //   116: ifne -> 144
/*     */     //   119: iload #7
/*     */     //   121: aload #5
/*     */     //   123: aload_3
/*     */     //   124: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   129: ifeq -> 138
/*     */     //   132: sipush #2048
/*     */     //   135: goto -> 141
/*     */     //   138: sipush #1024
/*     */     //   141: ior
/*     */     //   142: istore #7
/*     */     //   144: iload #6
/*     */     //   146: sipush #24576
/*     */     //   149: iand
/*     */     //   150: ifne -> 179
/*     */     //   153: iload #7
/*     */     //   155: aload #5
/*     */     //   157: fload #4
/*     */     //   159: invokeinterface changed : (F)Z
/*     */     //   164: ifeq -> 173
/*     */     //   167: sipush #16384
/*     */     //   170: goto -> 176
/*     */     //   173: sipush #8192
/*     */     //   176: ior
/*     */     //   177: istore #7
/*     */     //   179: iload #7
/*     */     //   181: sipush #9363
/*     */     //   184: iand
/*     */     //   185: sipush #9362
/*     */     //   188: if_icmpne -> 201
/*     */     //   191: aload #5
/*     */     //   193: invokeinterface getSkipping : ()Z
/*     */     //   198: ifne -> 418
/*     */     //   201: invokestatic isTraceInProgress : ()Z
/*     */     //   204: ifeq -> 219
/*     */     //   207: ldc_w -352281752
/*     */     //   210: iload #7
/*     */     //   212: iconst_m1
/*     */     //   213: ldc_w 'org.jetbrains.jewel.ui.component.CorrectValueSideEffect (Slider.kt:383)'
/*     */     //   216: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   219: aload #5
/*     */     //   221: ldc_w 904522583
/*     */     //   224: invokeinterface startReplaceGroup : (I)V
/*     */     //   229: aload #5
/*     */     //   231: astore #9
/*     */     //   233: iload #7
/*     */     //   235: bipush #112
/*     */     //   237: iand
/*     */     //   238: bipush #32
/*     */     //   240: if_icmpne -> 247
/*     */     //   243: iconst_1
/*     */     //   244: goto -> 248
/*     */     //   247: iconst_0
/*     */     //   248: iload #7
/*     */     //   250: bipush #14
/*     */     //   252: iand
/*     */     //   253: iconst_4
/*     */     //   254: if_icmpne -> 261
/*     */     //   257: iconst_1
/*     */     //   258: goto -> 262
/*     */     //   261: iconst_0
/*     */     //   262: ior
/*     */     //   263: iload #7
/*     */     //   265: ldc_w 57344
/*     */     //   268: iand
/*     */     //   269: sipush #16384
/*     */     //   272: if_icmpne -> 279
/*     */     //   275: iconst_1
/*     */     //   276: goto -> 280
/*     */     //   279: iconst_0
/*     */     //   280: ior
/*     */     //   281: iload #7
/*     */     //   283: sipush #7168
/*     */     //   286: iand
/*     */     //   287: sipush #2048
/*     */     //   290: if_icmpne -> 297
/*     */     //   293: iconst_1
/*     */     //   294: goto -> 298
/*     */     //   297: iconst_0
/*     */     //   298: ior
/*     */     //   299: iload #7
/*     */     //   301: sipush #896
/*     */     //   304: iand
/*     */     //   305: sipush #256
/*     */     //   308: if_icmpne -> 315
/*     */     //   311: iconst_1
/*     */     //   312: goto -> 316
/*     */     //   315: iconst_0
/*     */     //   316: ior
/*     */     //   317: istore #10
/*     */     //   319: nop
/*     */     //   320: iconst_0
/*     */     //   321: istore #11
/*     */     //   323: aload #9
/*     */     //   325: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   330: astore #12
/*     */     //   332: iconst_0
/*     */     //   333: istore #13
/*     */     //   335: iload #10
/*     */     //   337: ifne -> 351
/*     */     //   340: aload #12
/*     */     //   342: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   345: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   348: if_acmpne -> 381
/*     */     //   351: iconst_0
/*     */     //   352: istore #14
/*     */     //   354: aload_1
/*     */     //   355: aload_0
/*     */     //   356: fload #4
/*     */     //   358: aload_3
/*     */     //   359: aload_2
/*     */     //   360: <illegal opcode> invoke : (Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;FLandroidx/compose/runtime/MutableState;Lkotlin/ranges/ClosedFloatingPointRange;)Lkotlin/jvm/functions/Function0;
/*     */     //   365: astore #15
/*     */     //   367: aload #9
/*     */     //   369: aload #15
/*     */     //   371: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   376: aload #15
/*     */     //   378: goto -> 383
/*     */     //   381: aload #12
/*     */     //   383: nop
/*     */     //   384: nop
/*     */     //   385: nop
/*     */     //   386: checkcast kotlin/jvm/functions/Function0
/*     */     //   389: astore #8
/*     */     //   391: aload #5
/*     */     //   393: invokeinterface endReplaceGroup : ()V
/*     */     //   398: aload #8
/*     */     //   400: aload #5
/*     */     //   402: iconst_0
/*     */     //   403: invokestatic SideEffect : (Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*     */     //   406: invokestatic isTraceInProgress : ()Z
/*     */     //   409: ifeq -> 425
/*     */     //   412: invokestatic traceEventEnd : ()V
/*     */     //   415: goto -> 425
/*     */     //   418: aload #5
/*     */     //   420: invokeinterface skipToGroupEnd : ()V
/*     */     //   425: aload #5
/*     */     //   427: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   432: dup
/*     */     //   433: ifnull -> 457
/*     */     //   436: aload_0
/*     */     //   437: aload_1
/*     */     //   438: aload_2
/*     */     //   439: aload_3
/*     */     //   440: fload #4
/*     */     //   442: iload #6
/*     */     //   444: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/MutableState;FI)Lkotlin/jvm/functions/Function2;
/*     */     //   449: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   454: goto -> 458
/*     */     //   457: pop
/*     */     //   458: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #384	-> 0
/*     */     //   #385	-> 319
/*     */     //   #855	-> 323
/*     */     //   #856	-> 335
/*     */     //   #857	-> 351
/*     */     //   #385	-> 354
/*     */     //   #857	-> 365
/*     */     //   #858	-> 367
/*     */     //   #859	-> 376
/*     */     //   #860	-> 381
/*     */     //   #856	-> 383
/*     */     //   #855	-> 384
/*     */     //   #855	-> 385
/*     */     //   #385	-> 386
/*     */     //   #392	-> 418
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   354	11	14	$i$a$-cache-SliderKt$CorrectValueSideEffect$1	I
/*     */     //   367	11	15	value$iv	Ljava/lang/Object;
/*     */     //   335	49	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   332	52	12	it$iv	Ljava/lang/Object;
/*     */     //   323	63	11	$i$f$cache	I
/*     */     //   320	66	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   320	66	10	invalid$iv	Z
/*     */     //   16	443	7	$dirty	I
/*     */     //   0	459	0	scaleToOffset	Lkotlin/jvm/functions/Function1;
/*     */     //   0	459	1	valueRange	Lkotlin/ranges/ClosedFloatingPointRange;
/*     */     //   0	459	2	trackRange	Lkotlin/ranges/ClosedFloatingPointRange;
/*     */     //   0	459	3	valueState	Landroidx/compose/runtime/MutableState;
/*     */     //   0	459	4	value	F
/*     */     //   0	459	5	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	459	6	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit CorrectValueSideEffect$lambda$24$lambda$23(ClosedFloatingPointRange $valueRange, Function1 $scaleToOffset, float $value, MutableState $valueState, ClosedFloatingPointRange $trackRange) {
/*     */     float error = (((Number)$valueRange.getEndInclusive()).floatValue() - ((Number)$valueRange.getStart()).floatValue()) / 'Ϩ';
/*     */     float newOffset = ((Number)$scaleToOffset.invoke(Float.valueOf($value))).floatValue();
/*     */     if (Math.abs(newOffset - ((Number)$valueState.getValue()).floatValue()) > error && $trackRange.contains((Comparable)$valueState.getValue()))
/*     */       $valueState.setValue(Float.valueOf(newOffset)); 
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Modifier sliderSemantics(Modifier $this$sliderSemantics, float value, boolean enabled, Function1 onValueChange, Function0 onValueChangeFinished, ClosedFloatingPointRange valueRange, int steps) {
/*     */     // Byte code:
/*     */     //   0: fload_1
/*     */     //   1: aload #5
/*     */     //   3: invokeinterface getStart : ()Ljava/lang/Comparable;
/*     */     //   8: checkcast java/lang/Number
/*     */     //   11: invokevirtual floatValue : ()F
/*     */     //   14: aload #5
/*     */     //   16: invokeinterface getEndInclusive : ()Ljava/lang/Comparable;
/*     */     //   21: checkcast java/lang/Number
/*     */     //   24: invokevirtual floatValue : ()F
/*     */     //   27: invokestatic coerceIn : (FFF)F
/*     */     //   30: fstore #7
/*     */     //   32: aload_0
/*     */     //   33: iconst_0
/*     */     //   34: iload_2
/*     */     //   35: aload #5
/*     */     //   37: iload #6
/*     */     //   39: fload #7
/*     */     //   41: aload_3
/*     */     //   42: aload #4
/*     */     //   44: <illegal opcode> invoke : (ZLkotlin/ranges/ClosedFloatingPointRange;IFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function1;
/*     */     //   49: iconst_1
/*     */     //   50: aconst_null
/*     */     //   51: invokestatic semantics$default : (Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   54: fload_1
/*     */     //   55: aload #5
/*     */     //   57: iload #6
/*     */     //   59: invokestatic progressSemantics : (Landroidx/compose/ui/Modifier;FLkotlin/ranges/ClosedFloatingPointRange;I)Landroidx/compose/ui/Modifier;
/*     */     //   62: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #402	-> 0
/*     */     //   #404	-> 32
/*     */     //   #438	-> 54
/*     */     //   #404	-> 62
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   32	31	7	coerced	F
/*     */     //   0	63	0	$this$sliderSemantics	Landroidx/compose/ui/Modifier;
/*     */     //   0	63	1	value	F
/*     */     //   0	63	2	enabled	Z
/*     */     //   0	63	3	onValueChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	63	4	onValueChangeFinished	Lkotlin/jvm/functions/Function0;
/*     */     //   0	63	5	valueRange	Lkotlin/ranges/ClosedFloatingPointRange;
/*     */     //   0	63	6	steps	I
/*     */   }
/*     */   
/*     */   private static final Unit sliderSemantics$lambda$27(boolean $enabled, ClosedFloatingPointRange $valueRange, int $steps, float $coerced, Function1 $onValueChange, Function0 $onValueChangeFinished, SemanticsPropertyReceiver $this$semantics) {
/*     */     // Byte code:
/*     */     //   0: aload #6
/*     */     //   2: ldc_w '$this$semantics'
/*     */     //   5: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   8: iload_0
/*     */     //   9: ifne -> 17
/*     */     //   12: aload #6
/*     */     //   14: invokestatic disabled : (Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V
/*     */     //   17: aload #6
/*     */     //   19: aconst_null
/*     */     //   20: aload_1
/*     */     //   21: iload_2
/*     */     //   22: fload_3
/*     */     //   23: aload #4
/*     */     //   25: aload #5
/*     */     //   27: <illegal opcode> invoke : (Lkotlin/ranges/ClosedFloatingPointRange;IFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function1;
/*     */     //   32: iconst_1
/*     */     //   33: aconst_null
/*     */     //   34: invokestatic setProgress$default : (Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
/*     */     //   37: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   40: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #405	-> 8
/*     */     //   #407	-> 17
/*     */     //   #437	-> 37
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	41	0	$enabled	Z
/*     */     //   0	41	1	$valueRange	Lkotlin/ranges/ClosedFloatingPointRange;
/*     */     //   0	41	2	$steps	I
/*     */     //   0	41	3	$coerced	F
/*     */     //   0	41	4	$onValueChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	41	5	$onValueChangeFinished	Lkotlin/jvm/functions/Function0;
/*     */     //   0	41	6	$this$semantics	Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;
/*     */   }
/*     */   
/*     */   private static final boolean sliderSemantics$lambda$27$lambda$26(ClosedFloatingPointRange $valueRange, int $steps, float $coerced, Function1 $onValueChange, Function0 $onValueChangeFinished, float targetValue) {
/*     */     float newValue = RangesKt.coerceIn(targetValue, ((Number)$valueRange.getStart()).floatValue(), ((Number)$valueRange.getEndInclusive()).floatValue());
/*     */     float originalVal = newValue;
/*     */     float distance = newValue;
/*     */     int i = 0, j = $steps + 1;
/*     */     if (i <= j)
/*     */       while (true) {
/*     */         float stepValue = lerp(((Number)$valueRange.getStart()).floatValue(), ((Number)$valueRange.getEndInclusive()).floatValue(), i / ($steps + 1));
/*     */         if (Math.abs(stepValue - originalVal) <= distance) {
/*     */           distance = Math.abs(stepValue - originalVal);
/*     */           newValue = stepValue;
/*     */         } 
/*     */         if (i != j) {
/*     */           i++;
/*     */           continue;
/*     */         } 
/*     */         break;
/*     */       }  
/*     */     float resolvedValue = ($steps > 0) ? newValue : newValue;
/*     */     $onValueChange.invoke(Float.valueOf(resolvedValue));
/*     */     if ($onValueChangeFinished != null) {
/*     */       $onValueChangeFinished.invoke();
/*     */     } else {
/*     */     
/*     */     } 
/*     */     return !((resolvedValue == $coerced));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\norg/jetbrains/jewel/ui/component/SliderKt$sliderTapModifier$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,707:1\n481#2:708\n480#2,4:709\n484#2,2:716\n488#2:722\n1225#3,3:713\n1228#3,3:719\n1225#3,6:723\n480#4:718\n*S KotlinDebug\n*F\n+ 1 Slider.kt\norg/jetbrains/jewel/ui/component/SliderKt$sliderTapModifier$2\n*L\n454#1:708\n454#1:709,4\n454#1:716,2\n454#1:722\n454#1:713,3\n454#1:719,3\n455#1:723,6\n454#1:718\n*E\n"})
/*     */   static final class SliderKt$sliderTapModifier$2 implements Function3<Modifier, Composer, Integer, Modifier> {
/*     */     @Composable
/*     */     public final Modifier invoke(Modifier $this$composed, Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter($this$composed, "$this$composed");
/*     */       $composer.startReplaceGroup(356063382);
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventStart(356063382, $changed, -1, "org.jetbrains.jewel.ui.component.sliderTapModifier.<anonymous> (Slider.kt:452)"); 
/*     */       int $changed$iv = 0;
/*     */       int $i$f$rememberCoroutineScope = 0;
/*     */       ComposerKt.sourceInformationMarkerStart($composer, 773894976, "CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp");
/*     */       Composer composer$iv = $composer;
/*     */       ComposerKt.sourceInformationMarkerStart($composer, -954370320, "CC(remember):Effects.kt#9igjgp");
/*     */       Composer composer2 = $composer;
/*     */       boolean invalid$iv$iv = false;
/*     */       int $i$f$cache = 0;
/*     */       Object it$iv$iv = composer2.rememberedValue();
/*     */       int $i$a$-let-ComposerKt$cache$1$iv$iv = 0;
/*     */       int $i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv = 0;
/*     */       int $i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1 = 0;
/*     */       CoroutineScope coroutineScope2 = EffectsKt.createCompositionCoroutineScope((CoroutineContext)EmptyCoroutineContext.INSTANCE, composer$iv);
/*     */       Object value$iv$iv = new CompositionScopedCoroutineScopeCanceller(coroutineScope2);
/*     */       composer2.updateRememberedValue(value$iv$iv);
/*     */       CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1 = (it$iv$iv == Composer.Companion.getEmpty()) ? (CompositionScopedCoroutineScopeCanceller)value$iv$iv : (CompositionScopedCoroutineScopeCanceller)it$iv$iv;
/*     */       ComposerKt.sourceInformationMarkerEnd($composer);
/*     */       CompositionScopedCoroutineScopeCanceller wrapper$iv = compositionScopedCoroutineScopeCanceller1;
/*     */       CoroutineScope coroutineScope1 = wrapper$iv.getCoroutineScope();
/*     */       ComposerKt.sourceInformationMarkerEnd($composer);
/*     */       CoroutineScope scope = coroutineScope1;
/*     */       Object[] arrayOfObject1 = new Object[4];
/*     */       arrayOfObject1[0] = this.$draggableState;
/*     */       arrayOfObject1[1] = this.$interactionSource;
/*     */       arrayOfObject1[2] = Float.valueOf(this.$maxPx);
/*     */       arrayOfObject1[3] = Boolean.valueOf(this.$isRtl);
/*     */       $composer.startReplaceGroup(-985454927);
/*     */       Composer composer1 = $composer;
/*     */       $i$f$rememberCoroutineScope = $composer.changed(this.$isRtl) | $composer.changed(this.$maxPx) | $composer.changed(this.$pressOffset) | $composer.changed(this.$rawOffset) | $composer.changedInstance(scope) | $composer.changedInstance(this.$draggableState) | $composer.changed(this.$gestureEndAction);
/*     */       boolean bool1 = this.$isRtl;
/*     */       float f = this.$maxPx;
/*     */       MutableState<Float> mutableState = this.$pressOffset;
/*     */       State<Float> state = this.$rawOffset;
/*     */       it$iv$iv = this.$draggableState;
/*     */       State<Function1<Float, Unit>> state1 = this.$gestureEndAction;
/*     */       int i = 0;
/*     */       Object it$iv = composer1.rememberedValue();
/*     */       int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */       Object[] arrayOfObject2 = arrayOfObject1;
/*     */       Modifier modifier2 = $this$composed;
/*     */       int $i$a$-cache-SliderKt$sliderTapModifier$2$1 = 0;
/*     */       SliderKt$sliderTapModifier$2$1$1 sliderKt$sliderTapModifier$2$1$1 = new SliderKt$sliderTapModifier$2$1$1(bool1, f, mutableState, state, scope, (DraggableState)it$iv$iv, state1, null);
/*     */       Object value$iv = sliderKt$sliderTapModifier$2$1$1;
/*     */       composer1.updateRememberedValue(value$iv);
/*     */       Function2 function2 = ($i$f$rememberCoroutineScope != 0 || it$iv == Composer.Companion.getEmpty()) ? (Function2)value$iv : (Function2)it$iv;
/*     */       $composer.endReplaceGroup();
/*     */       Modifier modifier1 = this.$enabled ? SuspendingPointerInputFilterKt.pointerInput(modifier2, arrayOfObject2, function2) : $this$composed;
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd(); 
/*     */       $composer.endReplaceGroup();
/*     */       return modifier1;
/*     */     }
/*     */     
/*     */     SliderKt$sliderTapModifier$2(boolean $enabled, DraggableState $draggableState, MutableInteractionSource $interactionSource, float $maxPx, boolean $isRtl, MutableState<Float> $pressOffset, State<Float> $rawOffset, State<Function1<Float, Unit>> $gestureEndAction) {}
/*     */   }
/*     */   
/*     */   private static final Modifier sliderTapModifier(Modifier $this$sliderTapModifier, DraggableState draggableState, MutableInteractionSource interactionSource, float maxPx, boolean isRtl, State<Float> rawOffset, State<? extends Function1<? super Float, Unit>> gestureEndAction, MutableState<Float> pressOffset, boolean enabled) {
/*     */     int $i$f$debugInspectorInfo = 0;
/*     */     Function1 function1 = InspectableValueKt.isDebugInspectorInfoEnabled() ? new SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1(draggableState, interactionSource, maxPx, isRtl, rawOffset, gestureEndAction, pressOffset, enabled) : InspectableValueKt.getNoInspectorInfo();
/*     */     return ComposedModifierKt.composed($this$sliderTapModifier, function1, new SliderKt$sliderTapModifier$2(enabled, draggableState, interactionSource, maxPx, isRtl, pressOffset, rawOffset, gestureEndAction));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final TweenSpec<Float> SliderToTickAnimation = new TweenSpec(100, 0, null, 6, null);
/*     */   
/*     */   private static final Object animateToTarget(DraggableState draggableState, float current, float target, float velocity, Continuation $completion) {
/*     */     if (DraggableState.drag$default(draggableState, null, new SliderKt$animateToTarget$2(current, target, velocity, null), $completion, 1, null) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return DraggableState.drag$default(draggableState, null, new SliderKt$animateToTarget$2(current, target, velocity, null), $completion, 1, null); 
/*     */     DraggableState.drag$default(draggableState, null, new SliderKt$animateToTarget$2(current, target, velocity, null), $completion, 1, null);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "Slider.kt", l = {500}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.SliderKt$animateToTarget$2")
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/DragScope;"})
/*     */   static final class SliderKt$animateToTarget$2 extends SuspendLambda implements Function2<DragScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     SliderKt$animateToTarget$2(float $current, float $target, float $velocity, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #4
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 128, 0 -> 32, 1 -> 118
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield L$0 : Ljava/lang/Object;
/*     */       //   40: checkcast androidx/compose/foundation/gestures/DragScope
/*     */       //   43: astore_2
/*     */       //   44: new kotlin/jvm/internal/Ref$FloatRef
/*     */       //   47: dup
/*     */       //   48: invokespecial <init> : ()V
/*     */       //   51: astore_3
/*     */       //   52: aload_3
/*     */       //   53: aload_0
/*     */       //   54: getfield $current : F
/*     */       //   57: putfield element : F
/*     */       //   60: aload_0
/*     */       //   61: getfield $current : F
/*     */       //   64: fconst_0
/*     */       //   65: iconst_2
/*     */       //   66: aconst_null
/*     */       //   67: invokestatic Animatable$default : (FFILjava/lang/Object;)Landroidx/compose/animation/core/Animatable;
/*     */       //   70: aload_0
/*     */       //   71: getfield $target : F
/*     */       //   74: invokestatic boxFloat : (F)Ljava/lang/Float;
/*     */       //   77: invokestatic access$getSliderToTickAnimation$p : ()Landroidx/compose/animation/core/TweenSpec;
/*     */       //   80: checkcast androidx/compose/animation/core/AnimationSpec
/*     */       //   83: aload_0
/*     */       //   84: getfield $velocity : F
/*     */       //   87: invokestatic boxFloat : (F)Ljava/lang/Float;
/*     */       //   90: aload_2
/*     */       //   91: aload_3
/*     */       //   92: <illegal opcode> invoke : (Landroidx/compose/foundation/gestures/DragScope;Lkotlin/jvm/internal/Ref$FloatRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   97: aload_0
/*     */       //   98: checkcast kotlin/coroutines/Continuation
/*     */       //   101: aload_0
/*     */       //   102: iconst_1
/*     */       //   103: putfield label : I
/*     */       //   106: invokevirtual animateTo : (Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   109: dup
/*     */       //   110: aload #4
/*     */       //   112: if_acmpne -> 123
/*     */       //   115: aload #4
/*     */       //   117: areturn
/*     */       //   118: aload_1
/*     */       //   119: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   122: aload_1
/*     */       //   123: pop
/*     */       //   124: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   127: areturn
/*     */       //   128: new java/lang/IllegalStateException
/*     */       //   131: dup
/*     */       //   132: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   134: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   137: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #498	-> 3
/*     */       //   #499	-> 44
/*     */       //   #500	-> 60
/*     */       //   #498	-> 115
/*     */       //   #504	-> 123
/*     */       //   #498	-> 128
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   44	65	2	$this$drag	Landroidx/compose/foundation/gestures/DragScope;
/*     */       //   52	57	3	latestValue	Lkotlin/jvm/internal/Ref$FloatRef;
/*     */       //   0	138	0	this	Lorg/jetbrains/jewel/ui/component/SliderKt$animateToTarget$2;
/*     */       //   36	92	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super SliderKt$animateToTarget$2> $completion) {
/*     */       SliderKt$animateToTarget$2 sliderKt$animateToTarget$2 = new SliderKt$animateToTarget$2(this.$current, this.$target, this.$velocity, $completion);
/*     */       sliderKt$animateToTarget$2.L$0 = value;
/*     */       return (Continuation<Unit>)sliderKt$animateToTarget$2;
/*     */     }
/*     */     
/*     */     public final Object invoke(DragScope p1, Continuation<?> p2) {
/*     */       return ((SliderKt$animateToTarget$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     private static final Unit invokeSuspend$lambda$0(DragScope $$this$drag, Ref.FloatRef $latestValue, Animatable $this$animateTo) {
/*     */       $$this$drag.dragBy(((Number)$this$animateTo.getValue()).floatValue() - $latestValue.element);
/*     */       $latestValue.element = ((Number)$this$animateTo.getValue()).floatValue();
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Modifier slideOnKeyEvents(Modifier $this$slideOnKeyEvents, boolean enabled, int steps, ClosedFloatingPointRange<Float> valueRange, float value, boolean isRtl, State<? extends Function1<? super Float, Unit>> onValueChangeState, State<? extends Function0<Unit>> onValueChangeFinishedState) {
/*     */     if (!((steps >= 0) ? 1 : 0)) {
/*     */       int $i$a$-require-SliderKt$slideOnKeyEvents$1 = 0;
/*     */       String str = "steps should be >= 0";
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */     return KeyInputModifierKt.onKeyEvent($this$slideOnKeyEvents, new SliderKt$slideOnKeyEvents$2(enabled, valueRange, steps, onValueChangeState, value, isRtl, onValueChangeFinishedState));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class SliderKt$slideOnKeyEvents$2 implements Function1<KeyEvent, Boolean> {
/*     */     public final Boolean invoke-ZmokQxo(Object it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       if (!this.$enabled)
/*     */         return Boolean.valueOf(false); 
/*     */       int i = KeyEvent_desktopKt.getType-ZmokQxo(it);
/*     */       float rangeLength = Math.abs(((Number)this.$valueRange.getEndInclusive()).floatValue() - ((Number)this.$valueRange.getStart()).floatValue());
/*     */       int actualSteps = (this.$steps > 0) ? (this.$steps + 1) : 100;
/*     */       float delta = rangeLength / actualSteps;
/*     */       ((Function1)this.$onValueChangeState.getValue()).invoke(RangesKt.coerceIn(Float.valueOf(this.$value + delta), this.$valueRange));
/*     */       ((Function1)this.$onValueChangeState.getValue()).invoke(RangesKt.coerceIn(Float.valueOf(this.$value - delta), this.$valueRange));
/*     */       int sign = this.$isRtl ? -1 : 1;
/*     */       ((Function1)this.$onValueChangeState.getValue()).invoke(RangesKt.coerceIn(Float.valueOf(this.$value + sign * delta), this.$valueRange));
/*     */       sign = this.$isRtl ? -1 : 1;
/*     */       ((Function1)this.$onValueChangeState.getValue()).invoke(RangesKt.coerceIn(Float.valueOf(this.$value - sign * delta), this.$valueRange));
/*     */       ((Function1)this.$onValueChangeState.getValue()).invoke(this.$valueRange.getStart());
/*     */       ((Function1)this.$onValueChangeState.getValue()).invoke(this.$valueRange.getEndInclusive());
/*     */       int page = RangesKt.coerceIn(actualSteps / 10, 1, 10);
/*     */       ((Function1)this.$onValueChangeState.getValue()).invoke(RangesKt.coerceIn(Float.valueOf(this.$value - page * delta), this.$valueRange));
/*     */       page = RangesKt.coerceIn(actualSteps / 10, 1, 10);
/*     */       ((Function1)this.$onValueChangeState.getValue()).invoke(RangesKt.coerceIn(Float.valueOf(this.$value + page * delta), this.$valueRange));
/*     */       if ((Function0)this.$onValueChangeFinishedState.getValue() != null) {
/*     */         ((Function0)this.$onValueChangeFinishedState.getValue()).invoke();
/*     */       } else {
/*     */         (Function0)this.$onValueChangeFinishedState.getValue();
/*     */       } 
/*     */       return Boolean.valueOf(KeyEventType.equals-impl0(i, KeyEventType.Companion.getKeyDown-CS__XNY()) ? (SliderKt.isDirectionUp-ZmokQxo(it) ? true : (SliderKt.isDirectionDown-ZmokQxo(it) ? true : (SliderKt.isDirectionRight-ZmokQxo(it) ? true : (SliderKt.isDirectionLeft-ZmokQxo(it) ? true : (SliderKt.isHome-ZmokQxo(it) ? true : (SliderKt.isMoveEnd-ZmokQxo(it) ? true : (SliderKt.isPgUp-ZmokQxo(it) ? true : (SliderKt.isPgDn-ZmokQxo(it))))))))) : (KeyEventType.equals-impl0(i, KeyEventType.Companion.getKeyUp-CS__XNY()) ? ((SliderKt.isDirectionDown-ZmokQxo(it) || SliderKt.isDirectionUp-ZmokQxo(it) || SliderKt.isDirectionRight-ZmokQxo(it) || SliderKt.isDirectionLeft-ZmokQxo(it) || SliderKt.isHome-ZmokQxo(it) || SliderKt.isMoveEnd-ZmokQxo(it) || SliderKt.isPgUp-ZmokQxo(it) || SliderKt.isPgDn-ZmokQxo(it))) : false));
/*     */     }
/*     */     
/*     */     SliderKt$slideOnKeyEvents$2(boolean $enabled, ClosedFloatingPointRange<Float> $valueRange, int $steps, State<Function1<Float, Unit>> $onValueChangeState, float $value, boolean $isRtl, State<Function0<Unit>> $onValueChangeFinishedState) {}
/*     */   }
/*     */   
/*     */   public static final boolean isDirectionUp-ZmokQxo(@NotNull Object $this$isDirectionUp) {
/*     */     Intrinsics.checkNotNullParameter($this$isDirectionUp, "$this$isDirectionUp");
/*     */     return (Key_desktopKt.getNativeKeyCode-YVgTNJs(KeyEvent_desktopKt.getKey-ZmokQxo($this$isDirectionUp)) == 38);
/*     */   }
/*     */   
/*     */   public static final boolean isDirectionDown-ZmokQxo(@NotNull Object $this$isDirectionDown) {
/*     */     Intrinsics.checkNotNullParameter($this$isDirectionDown, "$this$isDirectionDown");
/*     */     return (Key_desktopKt.getNativeKeyCode-YVgTNJs(KeyEvent_desktopKt.getKey-ZmokQxo($this$isDirectionDown)) == 40);
/*     */   }
/*     */   
/*     */   public static final boolean isDirectionRight-ZmokQxo(@NotNull Object $this$isDirectionRight) {
/*     */     Intrinsics.checkNotNullParameter($this$isDirectionRight, "$this$isDirectionRight");
/*     */     return (Key_desktopKt.getNativeKeyCode-YVgTNJs(KeyEvent_desktopKt.getKey-ZmokQxo($this$isDirectionRight)) == 39);
/*     */   }
/*     */   
/*     */   public static final boolean isDirectionLeft-ZmokQxo(@NotNull Object $this$isDirectionLeft) {
/*     */     Intrinsics.checkNotNullParameter($this$isDirectionLeft, "$this$isDirectionLeft");
/*     */     return (Key_desktopKt.getNativeKeyCode-YVgTNJs(KeyEvent_desktopKt.getKey-ZmokQxo($this$isDirectionLeft)) == 37);
/*     */   }
/*     */   
/*     */   public static final boolean isHome-ZmokQxo(@NotNull Object $this$isHome) {
/*     */     Intrinsics.checkNotNullParameter($this$isHome, "$this$isHome");
/*     */     return (Key_desktopKt.getNativeKeyCode-YVgTNJs(KeyEvent_desktopKt.getKey-ZmokQxo($this$isHome)) == 36);
/*     */   }
/*     */   
/*     */   public static final boolean isMoveEnd-ZmokQxo(@NotNull Object $this$isMoveEnd) {
/*     */     Intrinsics.checkNotNullParameter($this$isMoveEnd, "$this$isMoveEnd");
/*     */     return (Key_desktopKt.getNativeKeyCode-YVgTNJs(KeyEvent_desktopKt.getKey-ZmokQxo($this$isMoveEnd)) == 35);
/*     */   }
/*     */   
/*     */   public static final boolean isPgUp-ZmokQxo(@NotNull Object $this$isPgUp) {
/*     */     Intrinsics.checkNotNullParameter($this$isPgUp, "$this$isPgUp");
/*     */     return (Key_desktopKt.getNativeKeyCode-YVgTNJs(KeyEvent_desktopKt.getKey-ZmokQxo($this$isPgUp)) == 33);
/*     */   }
/*     */   
/*     */   public static final boolean isPgDn-ZmokQxo(@NotNull Object $this$isPgDn) {
/*     */     Intrinsics.checkNotNullParameter($this$isPgDn, "$this$isPgDn");
/*     */     return (Key_desktopKt.getNativeKeyCode-YVgTNJs(KeyEvent_desktopKt.getKey-ZmokQxo($this$isPgDn)) == 34);
/*     */   }
/*     */   
/*     */   public static final float lerp(float start, float stop, float fraction) {
/*     */     return (true - fraction) * start + fraction * stop;
/*     */   }
/*     */   
/*     */   private static final Unit Slider$lambda$4(float $value, Function1<? super Float, Unit> $onValueChange, Modifier $modifier, boolean $enabled, ClosedFloatingPointRange<Float> $valueRange, int $steps, Function0<Unit> $onValueChangeFinished, MutableInteractionSource $interactionSource, SliderStyle $style, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     Slider($value, $onValueChange, $modifier, $enabled, $valueRange, $steps, $onValueChangeFinished, $interactionSource, $style, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit SliderImpl_PfoAEA0$lambda$7(boolean $enabled, float $positionFraction, List<Float> $tickFractions, SliderStyle $style, float $width, float $minHeight, MutableInteractionSource $interactionSource, Modifier $modifier, int $$changed, Composer $composer, int $force) {
/*     */     SliderImpl-PfoAEA0($enabled, $positionFraction, $tickFractions, $style, $width, $minHeight, $interactionSource, $modifier, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit Track$lambda$12(Modifier $modifier, SliderStyle $style, boolean $enabled, float $positionFractionEnd, List<Float> $tickFractions, int $$changed, Composer $composer, int $force) {
/*     */     Track($modifier, $style, $enabled, $positionFractionEnd, $tickFractions, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit SliderThumb_RfXq3Jk$lambda$19(BoxScope $this_SliderThumb, float $offset, MutableInteractionSource $interactionSource, SliderStyle $style, boolean $enabled, Modifier $modifier, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     SliderThumb-RfXq3Jk($this_SliderThumb, $offset, $interactionSource, $style, $enabled, $modifier, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit CorrectValueSideEffect$lambda$25(Function1<? super Float, Float> $scaleToOffset, ClosedFloatingPointRange<Float> $valueRange, ClosedFloatingPointRange<Float> $trackRange, MutableState<Float> $valueState, float $value, int $$changed, Composer $composer, int $force) {
/*     */     CorrectValueSideEffect($scaleToOffset, $valueRange, $trackRange, $valueState, $value, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\SliderKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */