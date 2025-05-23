/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.gestures.Orientation;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.FloatState;
/*     */ import androidx.compose.runtime.MutableFloatState;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.geometry.Offset;
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import androidx.compose.ui.input.pointer.PointerIcon;
/*     */ import androidx.compose.ui.input.pointer.PointerIcon_desktopKt;
/*     */ import androidx.compose.ui.layout.LayoutCoordinates;
/*     */ import androidx.compose.ui.layout.Measurable;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.unit.Constraints;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import androidx.compose.ui.unit.IntSize;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import java.awt.Cursor;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.Pair;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.math.MathKt;
/*     */ import kotlin.ranges.RangesKt;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.component.styling.DividerStyle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000~\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\006\n\002\020\007\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\n\n\002\030\002\n\002\020\b\n\002\b\007\n\002\020\013\n\000\032q\020\000\032\0020\0012\021\020\002\032\r\022\004\022\0020\0010\003¢\006\002\b\0042\021\020\005\032\r\022\004\022\0020\0010\003¢\006\002\b\0042\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\0132\b\b\002\020\r\032\0020\0132\b\b\002\020\016\032\0020\017H\007¢\006\004\b\020\020\021\032q\020\022\032\0020\0012\021\020\002\032\r\022\004\022\0020\0010\003¢\006\002\b\0042\021\020\005\032\r\022\004\022\0020\0010\003¢\006\002\b\0042\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\0132\b\b\002\020\r\032\0020\0132\b\b\002\020\016\032\0020\017H\007¢\006\004\b\023\020\021\032\027\020\024\032\0020\0172\b\b\002\020\025\032\0020\026H\007¢\006\002\020\027\032m\020\033\032\0020\0012\021\020\002\032\r\022\004\022\0020\0010\003¢\006\002\b\0042\021\020\005\032\r\022\004\022\0020\0010\003¢\006\002\b\0042\006\020\034\032\0020\0352\006\020\006\032\0020\0072\006\020\n\032\0020\0132\006\020\f\032\0020\0132\006\020\r\032\0020\0132\006\020\b\032\0020\t2\006\020\016\032\0020\017H\003¢\006\004\b\036\020\037\032\033\020 \032\0020!*\0020\"2\006\020#\032\0020$H\002¢\006\004\b%\020&\032a\020'\032\0020!*\0020\"2\006\020\034\032\0020\0352\006\020(\032\0020)2\006\020\016\032\0020\0172\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\0132\006\020\r\032\0020\0132\006\020#\032\0020$2\f\020*\032\b\022\004\022\0020,0+H\002¢\006\004\b-\020.\032\031\020/\032\0020\0352\b\b\002\0200\032\0020\013H\002¢\006\004\b1\0202\032\031\0203\032\0020\0352\b\b\002\0204\032\0020\013H\002¢\006\004\b5\0202\032<\0206\032\016\022\004\022\00208\022\004\022\00208072\006\0209\032\002082\006\020:\032\002082\006\020;\032\002082\006\020<\032\002082\006\020=\032\00208H\002\"\016\020\030\032\0020\031X\004¢\006\002\n\000\"\016\020\032\032\0020\031X\004¢\006\002\n\000¨\006>²\006\n\020?\032\0020@X\002²\006\n\020A\032\0020\026X\002"}, d2 = {"HorizontalSplitLayout", "", "first", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "second", "modifier", "Landroidx/compose/ui/Modifier;", "dividerStyle", "Lorg/jetbrains/jewel/ui/component/styling/DividerStyle;", "draggableWidth", "Landroidx/compose/ui/unit/Dp;", "firstPaneMinWidth", "secondPaneMinWidth", "state", "Lorg/jetbrains/jewel/ui/component/SplitLayoutState;", "HorizontalSplitLayout-Zv8xjqY", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/DividerStyle;FFFLorg/jetbrains/jewel/ui/component/SplitLayoutState;Landroidx/compose/runtime/Composer;II)V", "VerticalSplitLayout", "VerticalSplitLayout-Zv8xjqY", "rememberSplitLayoutState", "initialSplitFraction", "", "(FLandroidx/compose/runtime/Composer;II)Lorg/jetbrains/jewel/ui/component/SplitLayoutState;", "HorizontalResizePointerIcon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "VerticalResizePointerIcon", "SplitLayoutImpl", "strategy", "Lorg/jetbrains/jewel/ui/component/SplitLayoutStrategy;", "SplitLayoutImpl-Zv8xjqY", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lorg/jetbrains/jewel/ui/component/SplitLayoutStrategy;Landroidx/compose/ui/Modifier;FFFLorg/jetbrains/jewel/ui/component/styling/DividerStyle;Lorg/jetbrains/jewel/ui/component/SplitLayoutState;Landroidx/compose/runtime/Composer;I)V", "notReadyLayout", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "notReadyLayout-0kLqBqw", "(Landroidx/compose/ui/layout/MeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;", "doLayout", "density", "Landroidx/compose/ui/unit/Density;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "doLayout-yZ4TukA", "(Landroidx/compose/ui/layout/MeasureScope;Lorg/jetbrains/jewel/ui/component/SplitLayoutStrategy;Landroidx/compose/ui/unit/Density;Lorg/jetbrains/jewel/ui/component/SplitLayoutState;Lorg/jetbrains/jewel/ui/component/styling/DividerStyle;FFFJLjava/util/List;)Landroidx/compose/ui/layout/MeasureResult;", "horizontalTwoPaneStrategy", "gapWidth", "horizontalTwoPaneStrategy-0680j_4", "(F)Lorg/jetbrains/jewel/ui/component/SplitLayoutStrategy;", "verticalTwoPaneStrategy", "gapHeight", "verticalTwoPaneStrategy-0680j_4", "calculateAdjustedSizes", "Lkotlin/Pair;", "", "availableSpace", "initialFirstSize", "initialSecondSize", "minFirstPaneSizePx", "minSecondPaneSizePx", "ui", "isDragging", "", "dragOffset"})
/*     */ @SourceDebugExtension({"SMAP\nSplitLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplitLayout.kt\norg/jetbrains/jewel/ui/component/SplitLayoutKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,512:1\n149#2:513\n149#2:514\n149#2:682\n149#2:683\n1225#3,6:515\n1225#3,6:522\n1225#3,6:528\n1225#3,6:534\n1225#3,6:540\n1225#3,6:546\n1225#3,6:660\n1225#3,6:666\n1225#3,6:672\n77#4:521\n79#5,6:552\n86#5,4:567\n90#5,2:577\n79#5,6:587\n86#5,4:602\n90#5,2:612\n94#5:618\n79#5,6:627\n86#5,4:642\n90#5,2:652\n94#5:658\n94#5:680\n368#6,9:558\n377#6:579\n368#6,9:593\n377#6:614\n378#6,2:616\n368#6,9:633\n377#6:654\n378#6,2:656\n378#6,2:678\n4034#7,6:571\n4034#7,6:606\n4034#7,6:646\n71#8:580\n68#8,6:581\n74#8:615\n78#8:619\n71#8:620\n68#8,6:621\n74#8:655\n78#8:659\n1#9:681\n81#10:684\n107#10,2:685\n79#11:687\n112#11,2:688\n*S KotlinDebug\n*F\n+ 1 SplitLayout.kt\norg/jetbrains/jewel/ui/component/SplitLayoutKt\n*L\n68#1:513\n108#1:514\n416#1:682\n445#1:683\n156#1:515,6\n176#1:522,6\n179#1:528,6\n181#1:534,6\n205#1:540,6\n253#1:546,6\n215#1:660,6\n238#1:666,6\n242#1:672,6\n175#1:521\n202#1:552,6\n202#1:567,4\n202#1:577,2\n212#1:587,6\n212#1:602,4\n212#1:612,2\n212#1:618\n213#1:627,6\n213#1:642,4\n213#1:652,2\n213#1:658\n202#1:680\n202#1:558,9\n202#1:579\n212#1:593,9\n212#1:614\n212#1:616,2\n213#1:633,9\n213#1:654\n213#1:656,2\n202#1:678,2\n202#1:571,6\n212#1:606,6\n213#1:646,6\n212#1:580\n212#1:581,6\n212#1:615\n212#1:619\n213#1:620\n213#1:621,6\n213#1:655\n213#1:659\n176#1:684\n176#1:685,2\n179#1:687\n179#1:688,2\n*E\n"})
/*     */ public final class SplitLayoutKt
/*     */ {
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
/*     */   public static final void HorizontalSplitLayout-Zv8xjqY(@NotNull Function2 first, @NotNull Function2 second, @Nullable Modifier modifier, @Nullable DividerStyle dividerStyle, float draggableWidth, float firstPaneMinWidth, float secondPaneMinWidth, @Nullable SplitLayoutState state, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'first'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'second'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload #8
/*     */     //   14: ldc 1274814014
/*     */     //   16: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   21: astore #8
/*     */     //   23: iload #9
/*     */     //   25: istore #11
/*     */     //   27: iload #10
/*     */     //   29: iconst_1
/*     */     //   30: iand
/*     */     //   31: ifeq -> 44
/*     */     //   34: iload #11
/*     */     //   36: bipush #6
/*     */     //   38: ior
/*     */     //   39: istore #11
/*     */     //   41: goto -> 73
/*     */     //   44: iload #9
/*     */     //   46: bipush #6
/*     */     //   48: iand
/*     */     //   49: ifne -> 73
/*     */     //   52: iload #11
/*     */     //   54: aload #8
/*     */     //   56: aload_0
/*     */     //   57: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   62: ifeq -> 69
/*     */     //   65: iconst_4
/*     */     //   66: goto -> 70
/*     */     //   69: iconst_2
/*     */     //   70: ior
/*     */     //   71: istore #11
/*     */     //   73: iload #10
/*     */     //   75: iconst_2
/*     */     //   76: iand
/*     */     //   77: ifeq -> 90
/*     */     //   80: iload #11
/*     */     //   82: bipush #48
/*     */     //   84: ior
/*     */     //   85: istore #11
/*     */     //   87: goto -> 121
/*     */     //   90: iload #9
/*     */     //   92: bipush #48
/*     */     //   94: iand
/*     */     //   95: ifne -> 121
/*     */     //   98: iload #11
/*     */     //   100: aload #8
/*     */     //   102: aload_1
/*     */     //   103: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   108: ifeq -> 116
/*     */     //   111: bipush #32
/*     */     //   113: goto -> 118
/*     */     //   116: bipush #16
/*     */     //   118: ior
/*     */     //   119: istore #11
/*     */     //   121: iload #10
/*     */     //   123: iconst_4
/*     */     //   124: iand
/*     */     //   125: ifeq -> 139
/*     */     //   128: iload #11
/*     */     //   130: sipush #384
/*     */     //   133: ior
/*     */     //   134: istore #11
/*     */     //   136: goto -> 173
/*     */     //   139: iload #9
/*     */     //   141: sipush #384
/*     */     //   144: iand
/*     */     //   145: ifne -> 173
/*     */     //   148: iload #11
/*     */     //   150: aload #8
/*     */     //   152: aload_2
/*     */     //   153: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   158: ifeq -> 167
/*     */     //   161: sipush #256
/*     */     //   164: goto -> 170
/*     */     //   167: sipush #128
/*     */     //   170: ior
/*     */     //   171: istore #11
/*     */     //   173: iload #9
/*     */     //   175: sipush #3072
/*     */     //   178: iand
/*     */     //   179: ifne -> 215
/*     */     //   182: iload #11
/*     */     //   184: iload #10
/*     */     //   186: bipush #8
/*     */     //   188: iand
/*     */     //   189: ifne -> 209
/*     */     //   192: aload #8
/*     */     //   194: aload_3
/*     */     //   195: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   200: ifeq -> 209
/*     */     //   203: sipush #2048
/*     */     //   206: goto -> 212
/*     */     //   209: sipush #1024
/*     */     //   212: ior
/*     */     //   213: istore #11
/*     */     //   215: iload #10
/*     */     //   217: bipush #16
/*     */     //   219: iand
/*     */     //   220: ifeq -> 234
/*     */     //   223: iload #11
/*     */     //   225: sipush #24576
/*     */     //   228: ior
/*     */     //   229: istore #11
/*     */     //   231: goto -> 269
/*     */     //   234: iload #9
/*     */     //   236: sipush #24576
/*     */     //   239: iand
/*     */     //   240: ifne -> 269
/*     */     //   243: iload #11
/*     */     //   245: aload #8
/*     */     //   247: fload #4
/*     */     //   249: invokeinterface changed : (F)Z
/*     */     //   254: ifeq -> 263
/*     */     //   257: sipush #16384
/*     */     //   260: goto -> 266
/*     */     //   263: sipush #8192
/*     */     //   266: ior
/*     */     //   267: istore #11
/*     */     //   269: iload #10
/*     */     //   271: bipush #32
/*     */     //   273: iand
/*     */     //   274: ifeq -> 287
/*     */     //   277: iload #11
/*     */     //   279: ldc 196608
/*     */     //   281: ior
/*     */     //   282: istore #11
/*     */     //   284: goto -> 319
/*     */     //   287: iload #9
/*     */     //   289: ldc 196608
/*     */     //   291: iand
/*     */     //   292: ifne -> 319
/*     */     //   295: iload #11
/*     */     //   297: aload #8
/*     */     //   299: fload #5
/*     */     //   301: invokeinterface changed : (F)Z
/*     */     //   306: ifeq -> 314
/*     */     //   309: ldc 131072
/*     */     //   311: goto -> 316
/*     */     //   314: ldc 65536
/*     */     //   316: ior
/*     */     //   317: istore #11
/*     */     //   319: iload #10
/*     */     //   321: bipush #64
/*     */     //   323: iand
/*     */     //   324: ifeq -> 337
/*     */     //   327: iload #11
/*     */     //   329: ldc 1572864
/*     */     //   331: ior
/*     */     //   332: istore #11
/*     */     //   334: goto -> 369
/*     */     //   337: iload #9
/*     */     //   339: ldc 1572864
/*     */     //   341: iand
/*     */     //   342: ifne -> 369
/*     */     //   345: iload #11
/*     */     //   347: aload #8
/*     */     //   349: fload #6
/*     */     //   351: invokeinterface changed : (F)Z
/*     */     //   356: ifeq -> 364
/*     */     //   359: ldc 1048576
/*     */     //   361: goto -> 366
/*     */     //   364: ldc 524288
/*     */     //   366: ior
/*     */     //   367: istore #11
/*     */     //   369: iload #9
/*     */     //   371: ldc 12582912
/*     */     //   373: iand
/*     */     //   374: ifne -> 410
/*     */     //   377: iload #11
/*     */     //   379: iload #10
/*     */     //   381: sipush #128
/*     */     //   384: iand
/*     */     //   385: ifne -> 405
/*     */     //   388: aload #8
/*     */     //   390: aload #7
/*     */     //   392: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   397: ifeq -> 405
/*     */     //   400: ldc 8388608
/*     */     //   402: goto -> 407
/*     */     //   405: ldc 4194304
/*     */     //   407: ior
/*     */     //   408: istore #11
/*     */     //   410: iload #11
/*     */     //   412: ldc 4793491
/*     */     //   414: iand
/*     */     //   415: ldc 4793490
/*     */     //   417: if_icmpne -> 430
/*     */     //   420: aload #8
/*     */     //   422: invokeinterface getSkipping : ()Z
/*     */     //   427: ifne -> 735
/*     */     //   430: aload #8
/*     */     //   432: invokeinterface startDefaults : ()V
/*     */     //   437: iload #9
/*     */     //   439: iconst_1
/*     */     //   440: iand
/*     */     //   441: ifeq -> 454
/*     */     //   444: aload #8
/*     */     //   446: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   451: ifeq -> 579
/*     */     //   454: iload #10
/*     */     //   456: iconst_4
/*     */     //   457: iand
/*     */     //   458: ifeq -> 468
/*     */     //   461: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   464: checkcast androidx/compose/ui/Modifier
/*     */     //   467: astore_2
/*     */     //   468: iload #10
/*     */     //   470: bipush #8
/*     */     //   472: iand
/*     */     //   473: ifeq -> 495
/*     */     //   476: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   479: aload #8
/*     */     //   481: bipush #6
/*     */     //   483: invokestatic getDividerStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/DividerStyle;
/*     */     //   486: astore_3
/*     */     //   487: iload #11
/*     */     //   489: sipush #-7169
/*     */     //   492: iand
/*     */     //   493: istore #11
/*     */     //   495: iload #10
/*     */     //   497: bipush #16
/*     */     //   499: iand
/*     */     //   500: ifeq -> 518
/*     */     //   503: bipush #8
/*     */     //   505: istore #12
/*     */     //   507: iconst_0
/*     */     //   508: istore #13
/*     */     //   510: iload #12
/*     */     //   512: i2f
/*     */     //   513: invokestatic constructor-impl : (F)F
/*     */     //   516: fstore #4
/*     */     //   518: iload #10
/*     */     //   520: bipush #32
/*     */     //   522: iand
/*     */     //   523: ifeq -> 534
/*     */     //   526: getstatic androidx/compose/ui/unit/Dp.Companion : Landroidx/compose/ui/unit/Dp$Companion;
/*     */     //   529: invokevirtual getUnspecified-D9Ej5fM : ()F
/*     */     //   532: fstore #5
/*     */     //   534: iload #10
/*     */     //   536: bipush #64
/*     */     //   538: iand
/*     */     //   539: ifeq -> 550
/*     */     //   542: getstatic androidx/compose/ui/unit/Dp.Companion : Landroidx/compose/ui/unit/Dp$Companion;
/*     */     //   545: invokevirtual getUnspecified-D9Ej5fM : ()F
/*     */     //   548: fstore #6
/*     */     //   550: iload #10
/*     */     //   552: sipush #128
/*     */     //   555: iand
/*     */     //   556: ifeq -> 618
/*     */     //   559: fconst_0
/*     */     //   560: aload #8
/*     */     //   562: iconst_0
/*     */     //   563: iconst_1
/*     */     //   564: invokestatic rememberSplitLayoutState : (FLandroidx/compose/runtime/Composer;II)Lorg/jetbrains/jewel/ui/component/SplitLayoutState;
/*     */     //   567: astore #7
/*     */     //   569: iload #11
/*     */     //   571: ldc -29360129
/*     */     //   573: iand
/*     */     //   574: istore #11
/*     */     //   576: goto -> 618
/*     */     //   579: aload #8
/*     */     //   581: invokeinterface skipToGroupEnd : ()V
/*     */     //   586: iload #10
/*     */     //   588: bipush #8
/*     */     //   590: iand
/*     */     //   591: ifeq -> 602
/*     */     //   594: iload #11
/*     */     //   596: sipush #-7169
/*     */     //   599: iand
/*     */     //   600: istore #11
/*     */     //   602: iload #10
/*     */     //   604: sipush #128
/*     */     //   607: iand
/*     */     //   608: ifeq -> 618
/*     */     //   611: iload #11
/*     */     //   613: ldc -29360129
/*     */     //   615: iand
/*     */     //   616: istore #11
/*     */     //   618: aload #8
/*     */     //   620: invokeinterface endDefaults : ()V
/*     */     //   625: invokestatic isTraceInProgress : ()Z
/*     */     //   628: ifeq -> 641
/*     */     //   631: ldc 1274814014
/*     */     //   633: iload #11
/*     */     //   635: iconst_m1
/*     */     //   636: ldc 'org.jetbrains.jewel.ui.component.HorizontalSplitLayout (SplitLayout.kt:71)'
/*     */     //   638: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   641: fconst_0
/*     */     //   642: iconst_1
/*     */     //   643: aconst_null
/*     */     //   644: invokestatic horizontalTwoPaneStrategy-0680j_4$default : (FILjava/lang/Object;)Lorg/jetbrains/jewel/ui/component/SplitLayoutStrategy;
/*     */     //   647: astore #12
/*     */     //   649: aload_0
/*     */     //   650: aload_1
/*     */     //   651: aload #12
/*     */     //   653: aload_2
/*     */     //   654: fload #4
/*     */     //   656: fload #5
/*     */     //   658: fload #6
/*     */     //   660: aload_3
/*     */     //   661: aload #7
/*     */     //   663: aload #8
/*     */     //   665: bipush #14
/*     */     //   667: iload #11
/*     */     //   669: iand
/*     */     //   670: bipush #112
/*     */     //   672: iload #11
/*     */     //   674: iand
/*     */     //   675: ior
/*     */     //   676: sipush #7168
/*     */     //   679: iload #11
/*     */     //   681: iconst_3
/*     */     //   682: ishl
/*     */     //   683: iand
/*     */     //   684: ior
/*     */     //   685: ldc 57344
/*     */     //   687: iload #11
/*     */     //   689: iand
/*     */     //   690: ior
/*     */     //   691: ldc 458752
/*     */     //   693: iload #11
/*     */     //   695: iand
/*     */     //   696: ior
/*     */     //   697: ldc 3670016
/*     */     //   699: iload #11
/*     */     //   701: iand
/*     */     //   702: ior
/*     */     //   703: ldc 29360128
/*     */     //   705: iload #11
/*     */     //   707: bipush #12
/*     */     //   709: ishl
/*     */     //   710: iand
/*     */     //   711: ior
/*     */     //   712: ldc 234881024
/*     */     //   714: iload #11
/*     */     //   716: iconst_3
/*     */     //   717: ishl
/*     */     //   718: iand
/*     */     //   719: ior
/*     */     //   720: invokestatic SplitLayoutImpl-Zv8xjqY : (Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lorg/jetbrains/jewel/ui/component/SplitLayoutStrategy;Landroidx/compose/ui/Modifier;FFFLorg/jetbrains/jewel/ui/component/styling/DividerStyle;Lorg/jetbrains/jewel/ui/component/SplitLayoutState;Landroidx/compose/runtime/Composer;I)V
/*     */     //   723: invokestatic isTraceInProgress : ()Z
/*     */     //   726: ifeq -> 742
/*     */     //   729: invokestatic traceEventEnd : ()V
/*     */     //   732: goto -> 742
/*     */     //   735: aload #8
/*     */     //   737: invokeinterface skipToGroupEnd : ()V
/*     */     //   742: aload #8
/*     */     //   744: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   749: dup
/*     */     //   750: ifnull -> 782
/*     */     //   753: aload_0
/*     */     //   754: aload_1
/*     */     //   755: aload_2
/*     */     //   756: aload_3
/*     */     //   757: fload #4
/*     */     //   759: fload #5
/*     */     //   761: fload #6
/*     */     //   763: aload #7
/*     */     //   765: iload #9
/*     */     //   767: iload #10
/*     */     //   769: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/DividerStyle;FFFLorg/jetbrains/jewel/ui/component/SplitLayoutState;II)Lkotlin/jvm/functions/Function2;
/*     */     //   774: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   779: goto -> 783
/*     */     //   782: pop
/*     */     //   783: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #72	-> 12
/*     */     //   #66	-> 461
/*     */     //   #67	-> 476
/*     */     //   #68	-> 503
/*     */     //   #513	-> 510
/*     */     //   #69	-> 526
/*     */     //   #70	-> 542
/*     */     //   #71	-> 559
/*     */     //   #72	-> 638
/*     */     //   #81	-> 641
/*     */     //   #74	-> 649
/*     */     //   #75	-> 650
/*     */     //   #81	-> 651
/*     */     //   #76	-> 653
/*     */     //   #78	-> 654
/*     */     //   #79	-> 656
/*     */     //   #80	-> 658
/*     */     //   #77	-> 660
/*     */     //   #82	-> 661
/*     */     //   #73	-> 720
/*     */     //   #84	-> 735
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   510	6	13	$i$f$getDp	I
/*     */     //   507	9	12	$this$dp$iv	I
/*     */     //   27	757	11	$dirty	I
/*     */     //   0	784	0	first	Lkotlin/jvm/functions/Function2;
/*     */     //   0	784	1	second	Lkotlin/jvm/functions/Function2;
/*     */     //   0	784	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	784	3	dividerStyle	Lorg/jetbrains/jewel/ui/component/styling/DividerStyle;
/*     */     //   0	784	4	draggableWidth	F
/*     */     //   0	784	5	firstPaneMinWidth	F
/*     */     //   0	784	6	secondPaneMinWidth	F
/*     */     //   0	784	7	state	Lorg/jetbrains/jewel/ui/component/SplitLayoutState;
/*     */     //   0	784	8	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	784	9	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
/*     */   public static final void VerticalSplitLayout-Zv8xjqY(@NotNull Function2 first, @NotNull Function2 second, @Nullable Modifier modifier, @Nullable DividerStyle dividerStyle, float draggableWidth, float firstPaneMinWidth, float secondPaneMinWidth, @Nullable SplitLayoutState state, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'first'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'second'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload #8
/*     */     //   14: ldc 12423596
/*     */     //   16: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   21: astore #8
/*     */     //   23: iload #9
/*     */     //   25: istore #11
/*     */     //   27: iload #10
/*     */     //   29: iconst_1
/*     */     //   30: iand
/*     */     //   31: ifeq -> 44
/*     */     //   34: iload #11
/*     */     //   36: bipush #6
/*     */     //   38: ior
/*     */     //   39: istore #11
/*     */     //   41: goto -> 73
/*     */     //   44: iload #9
/*     */     //   46: bipush #6
/*     */     //   48: iand
/*     */     //   49: ifne -> 73
/*     */     //   52: iload #11
/*     */     //   54: aload #8
/*     */     //   56: aload_0
/*     */     //   57: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   62: ifeq -> 69
/*     */     //   65: iconst_4
/*     */     //   66: goto -> 70
/*     */     //   69: iconst_2
/*     */     //   70: ior
/*     */     //   71: istore #11
/*     */     //   73: iload #10
/*     */     //   75: iconst_2
/*     */     //   76: iand
/*     */     //   77: ifeq -> 90
/*     */     //   80: iload #11
/*     */     //   82: bipush #48
/*     */     //   84: ior
/*     */     //   85: istore #11
/*     */     //   87: goto -> 121
/*     */     //   90: iload #9
/*     */     //   92: bipush #48
/*     */     //   94: iand
/*     */     //   95: ifne -> 121
/*     */     //   98: iload #11
/*     */     //   100: aload #8
/*     */     //   102: aload_1
/*     */     //   103: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   108: ifeq -> 116
/*     */     //   111: bipush #32
/*     */     //   113: goto -> 118
/*     */     //   116: bipush #16
/*     */     //   118: ior
/*     */     //   119: istore #11
/*     */     //   121: iload #10
/*     */     //   123: iconst_4
/*     */     //   124: iand
/*     */     //   125: ifeq -> 139
/*     */     //   128: iload #11
/*     */     //   130: sipush #384
/*     */     //   133: ior
/*     */     //   134: istore #11
/*     */     //   136: goto -> 173
/*     */     //   139: iload #9
/*     */     //   141: sipush #384
/*     */     //   144: iand
/*     */     //   145: ifne -> 173
/*     */     //   148: iload #11
/*     */     //   150: aload #8
/*     */     //   152: aload_2
/*     */     //   153: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   158: ifeq -> 167
/*     */     //   161: sipush #256
/*     */     //   164: goto -> 170
/*     */     //   167: sipush #128
/*     */     //   170: ior
/*     */     //   171: istore #11
/*     */     //   173: iload #9
/*     */     //   175: sipush #3072
/*     */     //   178: iand
/*     */     //   179: ifne -> 215
/*     */     //   182: iload #11
/*     */     //   184: iload #10
/*     */     //   186: bipush #8
/*     */     //   188: iand
/*     */     //   189: ifne -> 209
/*     */     //   192: aload #8
/*     */     //   194: aload_3
/*     */     //   195: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   200: ifeq -> 209
/*     */     //   203: sipush #2048
/*     */     //   206: goto -> 212
/*     */     //   209: sipush #1024
/*     */     //   212: ior
/*     */     //   213: istore #11
/*     */     //   215: iload #10
/*     */     //   217: bipush #16
/*     */     //   219: iand
/*     */     //   220: ifeq -> 234
/*     */     //   223: iload #11
/*     */     //   225: sipush #24576
/*     */     //   228: ior
/*     */     //   229: istore #11
/*     */     //   231: goto -> 269
/*     */     //   234: iload #9
/*     */     //   236: sipush #24576
/*     */     //   239: iand
/*     */     //   240: ifne -> 269
/*     */     //   243: iload #11
/*     */     //   245: aload #8
/*     */     //   247: fload #4
/*     */     //   249: invokeinterface changed : (F)Z
/*     */     //   254: ifeq -> 263
/*     */     //   257: sipush #16384
/*     */     //   260: goto -> 266
/*     */     //   263: sipush #8192
/*     */     //   266: ior
/*     */     //   267: istore #11
/*     */     //   269: iload #10
/*     */     //   271: bipush #32
/*     */     //   273: iand
/*     */     //   274: ifeq -> 287
/*     */     //   277: iload #11
/*     */     //   279: ldc 196608
/*     */     //   281: ior
/*     */     //   282: istore #11
/*     */     //   284: goto -> 319
/*     */     //   287: iload #9
/*     */     //   289: ldc 196608
/*     */     //   291: iand
/*     */     //   292: ifne -> 319
/*     */     //   295: iload #11
/*     */     //   297: aload #8
/*     */     //   299: fload #5
/*     */     //   301: invokeinterface changed : (F)Z
/*     */     //   306: ifeq -> 314
/*     */     //   309: ldc 131072
/*     */     //   311: goto -> 316
/*     */     //   314: ldc 65536
/*     */     //   316: ior
/*     */     //   317: istore #11
/*     */     //   319: iload #10
/*     */     //   321: bipush #64
/*     */     //   323: iand
/*     */     //   324: ifeq -> 337
/*     */     //   327: iload #11
/*     */     //   329: ldc 1572864
/*     */     //   331: ior
/*     */     //   332: istore #11
/*     */     //   334: goto -> 369
/*     */     //   337: iload #9
/*     */     //   339: ldc 1572864
/*     */     //   341: iand
/*     */     //   342: ifne -> 369
/*     */     //   345: iload #11
/*     */     //   347: aload #8
/*     */     //   349: fload #6
/*     */     //   351: invokeinterface changed : (F)Z
/*     */     //   356: ifeq -> 364
/*     */     //   359: ldc 1048576
/*     */     //   361: goto -> 366
/*     */     //   364: ldc 524288
/*     */     //   366: ior
/*     */     //   367: istore #11
/*     */     //   369: iload #9
/*     */     //   371: ldc 12582912
/*     */     //   373: iand
/*     */     //   374: ifne -> 410
/*     */     //   377: iload #11
/*     */     //   379: iload #10
/*     */     //   381: sipush #128
/*     */     //   384: iand
/*     */     //   385: ifne -> 405
/*     */     //   388: aload #8
/*     */     //   390: aload #7
/*     */     //   392: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   397: ifeq -> 405
/*     */     //   400: ldc 8388608
/*     */     //   402: goto -> 407
/*     */     //   405: ldc 4194304
/*     */     //   407: ior
/*     */     //   408: istore #11
/*     */     //   410: iload #11
/*     */     //   412: ldc 4793491
/*     */     //   414: iand
/*     */     //   415: ldc 4793490
/*     */     //   417: if_icmpne -> 430
/*     */     //   420: aload #8
/*     */     //   422: invokeinterface getSkipping : ()Z
/*     */     //   427: ifne -> 735
/*     */     //   430: aload #8
/*     */     //   432: invokeinterface startDefaults : ()V
/*     */     //   437: iload #9
/*     */     //   439: iconst_1
/*     */     //   440: iand
/*     */     //   441: ifeq -> 454
/*     */     //   444: aload #8
/*     */     //   446: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   451: ifeq -> 579
/*     */     //   454: iload #10
/*     */     //   456: iconst_4
/*     */     //   457: iand
/*     */     //   458: ifeq -> 468
/*     */     //   461: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   464: checkcast androidx/compose/ui/Modifier
/*     */     //   467: astore_2
/*     */     //   468: iload #10
/*     */     //   470: bipush #8
/*     */     //   472: iand
/*     */     //   473: ifeq -> 495
/*     */     //   476: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   479: aload #8
/*     */     //   481: bipush #6
/*     */     //   483: invokestatic getDividerStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/DividerStyle;
/*     */     //   486: astore_3
/*     */     //   487: iload #11
/*     */     //   489: sipush #-7169
/*     */     //   492: iand
/*     */     //   493: istore #11
/*     */     //   495: iload #10
/*     */     //   497: bipush #16
/*     */     //   499: iand
/*     */     //   500: ifeq -> 518
/*     */     //   503: bipush #8
/*     */     //   505: istore #12
/*     */     //   507: iconst_0
/*     */     //   508: istore #13
/*     */     //   510: iload #12
/*     */     //   512: i2f
/*     */     //   513: invokestatic constructor-impl : (F)F
/*     */     //   516: fstore #4
/*     */     //   518: iload #10
/*     */     //   520: bipush #32
/*     */     //   522: iand
/*     */     //   523: ifeq -> 534
/*     */     //   526: getstatic androidx/compose/ui/unit/Dp.Companion : Landroidx/compose/ui/unit/Dp$Companion;
/*     */     //   529: invokevirtual getUnspecified-D9Ej5fM : ()F
/*     */     //   532: fstore #5
/*     */     //   534: iload #10
/*     */     //   536: bipush #64
/*     */     //   538: iand
/*     */     //   539: ifeq -> 550
/*     */     //   542: getstatic androidx/compose/ui/unit/Dp.Companion : Landroidx/compose/ui/unit/Dp$Companion;
/*     */     //   545: invokevirtual getUnspecified-D9Ej5fM : ()F
/*     */     //   548: fstore #6
/*     */     //   550: iload #10
/*     */     //   552: sipush #128
/*     */     //   555: iand
/*     */     //   556: ifeq -> 618
/*     */     //   559: fconst_0
/*     */     //   560: aload #8
/*     */     //   562: iconst_0
/*     */     //   563: iconst_1
/*     */     //   564: invokestatic rememberSplitLayoutState : (FLandroidx/compose/runtime/Composer;II)Lorg/jetbrains/jewel/ui/component/SplitLayoutState;
/*     */     //   567: astore #7
/*     */     //   569: iload #11
/*     */     //   571: ldc -29360129
/*     */     //   573: iand
/*     */     //   574: istore #11
/*     */     //   576: goto -> 618
/*     */     //   579: aload #8
/*     */     //   581: invokeinterface skipToGroupEnd : ()V
/*     */     //   586: iload #10
/*     */     //   588: bipush #8
/*     */     //   590: iand
/*     */     //   591: ifeq -> 602
/*     */     //   594: iload #11
/*     */     //   596: sipush #-7169
/*     */     //   599: iand
/*     */     //   600: istore #11
/*     */     //   602: iload #10
/*     */     //   604: sipush #128
/*     */     //   607: iand
/*     */     //   608: ifeq -> 618
/*     */     //   611: iload #11
/*     */     //   613: ldc -29360129
/*     */     //   615: iand
/*     */     //   616: istore #11
/*     */     //   618: aload #8
/*     */     //   620: invokeinterface endDefaults : ()V
/*     */     //   625: invokestatic isTraceInProgress : ()Z
/*     */     //   628: ifeq -> 641
/*     */     //   631: ldc 12423596
/*     */     //   633: iload #11
/*     */     //   635: iconst_m1
/*     */     //   636: ldc 'org.jetbrains.jewel.ui.component.VerticalSplitLayout (SplitLayout.kt:111)'
/*     */     //   638: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   641: fconst_0
/*     */     //   642: iconst_1
/*     */     //   643: aconst_null
/*     */     //   644: invokestatic verticalTwoPaneStrategy-0680j_4$default : (FILjava/lang/Object;)Lorg/jetbrains/jewel/ui/component/SplitLayoutStrategy;
/*     */     //   647: astore #12
/*     */     //   649: aload_0
/*     */     //   650: aload_1
/*     */     //   651: aload #12
/*     */     //   653: aload_2
/*     */     //   654: fload #4
/*     */     //   656: fload #5
/*     */     //   658: fload #6
/*     */     //   660: aload_3
/*     */     //   661: aload #7
/*     */     //   663: aload #8
/*     */     //   665: bipush #14
/*     */     //   667: iload #11
/*     */     //   669: iand
/*     */     //   670: bipush #112
/*     */     //   672: iload #11
/*     */     //   674: iand
/*     */     //   675: ior
/*     */     //   676: sipush #7168
/*     */     //   679: iload #11
/*     */     //   681: iconst_3
/*     */     //   682: ishl
/*     */     //   683: iand
/*     */     //   684: ior
/*     */     //   685: ldc 57344
/*     */     //   687: iload #11
/*     */     //   689: iand
/*     */     //   690: ior
/*     */     //   691: ldc 458752
/*     */     //   693: iload #11
/*     */     //   695: iand
/*     */     //   696: ior
/*     */     //   697: ldc 3670016
/*     */     //   699: iload #11
/*     */     //   701: iand
/*     */     //   702: ior
/*     */     //   703: ldc 29360128
/*     */     //   705: iload #11
/*     */     //   707: bipush #12
/*     */     //   709: ishl
/*     */     //   710: iand
/*     */     //   711: ior
/*     */     //   712: ldc 234881024
/*     */     //   714: iload #11
/*     */     //   716: iconst_3
/*     */     //   717: ishl
/*     */     //   718: iand
/*     */     //   719: ior
/*     */     //   720: invokestatic SplitLayoutImpl-Zv8xjqY : (Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lorg/jetbrains/jewel/ui/component/SplitLayoutStrategy;Landroidx/compose/ui/Modifier;FFFLorg/jetbrains/jewel/ui/component/styling/DividerStyle;Lorg/jetbrains/jewel/ui/component/SplitLayoutState;Landroidx/compose/runtime/Composer;I)V
/*     */     //   723: invokestatic isTraceInProgress : ()Z
/*     */     //   726: ifeq -> 742
/*     */     //   729: invokestatic traceEventEnd : ()V
/*     */     //   732: goto -> 742
/*     */     //   735: aload #8
/*     */     //   737: invokeinterface skipToGroupEnd : ()V
/*     */     //   742: aload #8
/*     */     //   744: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   749: dup
/*     */     //   750: ifnull -> 782
/*     */     //   753: aload_0
/*     */     //   754: aload_1
/*     */     //   755: aload_2
/*     */     //   756: aload_3
/*     */     //   757: fload #4
/*     */     //   759: fload #5
/*     */     //   761: fload #6
/*     */     //   763: aload #7
/*     */     //   765: iload #9
/*     */     //   767: iload #10
/*     */     //   769: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/DividerStyle;FFFLorg/jetbrains/jewel/ui/component/SplitLayoutState;II)Lkotlin/jvm/functions/Function2;
/*     */     //   774: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   779: goto -> 783
/*     */     //   782: pop
/*     */     //   783: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #112	-> 12
/*     */     //   #106	-> 461
/*     */     //   #107	-> 476
/*     */     //   #108	-> 503
/*     */     //   #514	-> 510
/*     */     //   #109	-> 526
/*     */     //   #110	-> 542
/*     */     //   #111	-> 559
/*     */     //   #112	-> 638
/*     */     //   #121	-> 641
/*     */     //   #114	-> 649
/*     */     //   #115	-> 650
/*     */     //   #121	-> 651
/*     */     //   #116	-> 653
/*     */     //   #118	-> 654
/*     */     //   #119	-> 656
/*     */     //   #120	-> 658
/*     */     //   #117	-> 660
/*     */     //   #122	-> 661
/*     */     //   #113	-> 720
/*     */     //   #124	-> 735
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   510	6	13	$i$f$getDp	I
/*     */     //   507	9	12	$this$dp$iv	I
/*     */     //   27	757	11	$dirty	I
/*     */     //   0	784	0	first	Lkotlin/jvm/functions/Function2;
/*     */     //   0	784	1	second	Lkotlin/jvm/functions/Function2;
/*     */     //   0	784	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	784	3	dividerStyle	Lorg/jetbrains/jewel/ui/component/styling/DividerStyle;
/*     */     //   0	784	4	draggableWidth	F
/*     */     //   0	784	5	firstPaneMinWidth	F
/*     */     //   0	784	6	secondPaneMinWidth	F
/*     */     //   0	784	7	state	Lorg/jetbrains/jewel/ui/component/SplitLayoutState;
/*     */     //   0	784	8	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	784	9	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final SplitLayoutState rememberSplitLayoutState(float initialSplitFraction, @Nullable Composer $composer, int $changed, int paramInt1) {
/* 156 */     $composer.startReplaceGroup(231201947); if ((paramInt1 & 0x1) != 0) initialSplitFraction = 0.5F;  if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(231201947, $changed, -1, "org.jetbrains.jewel.ui.component.rememberSplitLayoutState (SplitLayout.kt:155)");  $composer.startReplaceGroup(1279675599); Composer composer = $composer; boolean invalid$iv = false; int $i$f$cache = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 515 */     Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 516 */     if (it$iv == Composer.Companion.getEmpty()) {
/* 517 */       int $i$a$-cache-SplitLayoutKt$rememberSplitLayoutState$1 = 0; Object value$iv = new SplitLayoutState(initialSplitFraction);
/* 518 */       composer.updateRememberedValue(value$iv);
/*     */     } 
/* 520 */     SplitLayoutState splitLayoutState2 = (SplitLayoutState)it$iv;
/*     */     $composer.endReplaceGroup();
/*     */     SplitLayoutState splitLayoutState1 = splitLayoutState2;
/*     */     if (ComposerKt.isTraceInProgress()) {
/*     */       ComposerKt.traceEventEnd();
/*     */     }
/*     */     $composer.endReplaceGroup();
/*     */     return splitLayoutState1;
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
/*     */   @NotNull
/*     */   private static final PointerIcon HorizontalResizePointerIcon = PointerIcon_desktopKt.PointerIcon(new Cursor(11));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final PointerIcon VerticalResizePointerIcon = PointerIcon_desktopKt.PointerIcon(new Cursor(8));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
/*     */   private static final void SplitLayoutImpl-Zv8xjqY(Function2 first, Function2 second, SplitLayoutStrategy strategy, Modifier modifier, float draggableWidth, float firstPaneMinWidth, float secondPaneMinWidth, DividerStyle dividerStyle, SplitLayoutState state, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload #9
/*     */     //   2: ldc 838431381
/*     */     //   4: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   9: astore #9
/*     */     //   11: iload #10
/*     */     //   13: istore #11
/*     */     //   15: iload #10
/*     */     //   17: bipush #6
/*     */     //   19: iand
/*     */     //   20: ifne -> 44
/*     */     //   23: iload #11
/*     */     //   25: aload #9
/*     */     //   27: aload_0
/*     */     //   28: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   33: ifeq -> 40
/*     */     //   36: iconst_4
/*     */     //   37: goto -> 41
/*     */     //   40: iconst_2
/*     */     //   41: ior
/*     */     //   42: istore #11
/*     */     //   44: iload #10
/*     */     //   46: bipush #48
/*     */     //   48: iand
/*     */     //   49: ifne -> 75
/*     */     //   52: iload #11
/*     */     //   54: aload #9
/*     */     //   56: aload_1
/*     */     //   57: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   62: ifeq -> 70
/*     */     //   65: bipush #32
/*     */     //   67: goto -> 72
/*     */     //   70: bipush #16
/*     */     //   72: ior
/*     */     //   73: istore #11
/*     */     //   75: iload #10
/*     */     //   77: sipush #384
/*     */     //   80: iand
/*     */     //   81: ifne -> 129
/*     */     //   84: iload #11
/*     */     //   86: iload #10
/*     */     //   88: sipush #512
/*     */     //   91: iand
/*     */     //   92: ifne -> 106
/*     */     //   95: aload #9
/*     */     //   97: aload_2
/*     */     //   98: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   103: goto -> 114
/*     */     //   106: aload #9
/*     */     //   108: aload_2
/*     */     //   109: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   114: ifeq -> 123
/*     */     //   117: sipush #256
/*     */     //   120: goto -> 126
/*     */     //   123: sipush #128
/*     */     //   126: ior
/*     */     //   127: istore #11
/*     */     //   129: iload #10
/*     */     //   131: sipush #3072
/*     */     //   134: iand
/*     */     //   135: ifne -> 163
/*     */     //   138: iload #11
/*     */     //   140: aload #9
/*     */     //   142: aload_3
/*     */     //   143: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   148: ifeq -> 157
/*     */     //   151: sipush #2048
/*     */     //   154: goto -> 160
/*     */     //   157: sipush #1024
/*     */     //   160: ior
/*     */     //   161: istore #11
/*     */     //   163: iload #10
/*     */     //   165: sipush #24576
/*     */     //   168: iand
/*     */     //   169: ifne -> 198
/*     */     //   172: iload #11
/*     */     //   174: aload #9
/*     */     //   176: fload #4
/*     */     //   178: invokeinterface changed : (F)Z
/*     */     //   183: ifeq -> 192
/*     */     //   186: sipush #16384
/*     */     //   189: goto -> 195
/*     */     //   192: sipush #8192
/*     */     //   195: ior
/*     */     //   196: istore #11
/*     */     //   198: iload #10
/*     */     //   200: ldc 196608
/*     */     //   202: iand
/*     */     //   203: ifne -> 230
/*     */     //   206: iload #11
/*     */     //   208: aload #9
/*     */     //   210: fload #5
/*     */     //   212: invokeinterface changed : (F)Z
/*     */     //   217: ifeq -> 225
/*     */     //   220: ldc 131072
/*     */     //   222: goto -> 227
/*     */     //   225: ldc 65536
/*     */     //   227: ior
/*     */     //   228: istore #11
/*     */     //   230: iload #10
/*     */     //   232: ldc 1572864
/*     */     //   234: iand
/*     */     //   235: ifne -> 262
/*     */     //   238: iload #11
/*     */     //   240: aload #9
/*     */     //   242: fload #6
/*     */     //   244: invokeinterface changed : (F)Z
/*     */     //   249: ifeq -> 257
/*     */     //   252: ldc 1048576
/*     */     //   254: goto -> 259
/*     */     //   257: ldc 524288
/*     */     //   259: ior
/*     */     //   260: istore #11
/*     */     //   262: iload #10
/*     */     //   264: ldc 12582912
/*     */     //   266: iand
/*     */     //   267: ifne -> 294
/*     */     //   270: iload #11
/*     */     //   272: aload #9
/*     */     //   274: aload #7
/*     */     //   276: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   281: ifeq -> 289
/*     */     //   284: ldc 8388608
/*     */     //   286: goto -> 291
/*     */     //   289: ldc 4194304
/*     */     //   291: ior
/*     */     //   292: istore #11
/*     */     //   294: iload #10
/*     */     //   296: ldc 100663296
/*     */     //   298: iand
/*     */     //   299: ifne -> 326
/*     */     //   302: iload #11
/*     */     //   304: aload #9
/*     */     //   306: aload #8
/*     */     //   308: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   313: ifeq -> 321
/*     */     //   316: ldc 67108864
/*     */     //   318: goto -> 323
/*     */     //   321: ldc 33554432
/*     */     //   323: ior
/*     */     //   324: istore #11
/*     */     //   326: iload #11
/*     */     //   328: ldc 38347923
/*     */     //   330: iand
/*     */     //   331: ldc 38347922
/*     */     //   333: if_icmpne -> 346
/*     */     //   336: aload #9
/*     */     //   338: invokeinterface getSkipping : ()Z
/*     */     //   343: ifne -> 2906
/*     */     //   346: invokestatic isTraceInProgress : ()Z
/*     */     //   349: ifeq -> 362
/*     */     //   352: ldc 838431381
/*     */     //   354: iload #11
/*     */     //   356: iconst_m1
/*     */     //   357: ldc 'org.jetbrains.jewel.ui.component.SplitLayoutImpl (SplitLayout.kt:173)'
/*     */     //   359: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   362: invokestatic getLocalDensity : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   365: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   368: astore #13
/*     */     //   370: iconst_0
/*     */     //   371: istore #14
/*     */     //   373: iconst_0
/*     */     //   374: istore #15
/*     */     //   376: aload #9
/*     */     //   378: ldc_w 2023513938
/*     */     //   381: ldc_w 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   384: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   387: aload #9
/*     */     //   389: aload #13
/*     */     //   391: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   396: astore #16
/*     */     //   398: aload #9
/*     */     //   400: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   403: aload #16
/*     */     //   405: checkcast androidx/compose/ui/unit/Density
/*     */     //   408: astore #12
/*     */     //   410: aload #9
/*     */     //   412: ldc_w -1613495288
/*     */     //   415: invokeinterface startReplaceGroup : (I)V
/*     */     //   420: aload #9
/*     */     //   422: astore #15
/*     */     //   424: iconst_0
/*     */     //   425: istore #16
/*     */     //   427: nop
/*     */     //   428: iconst_0
/*     */     //   429: istore #17
/*     */     //   431: aload #15
/*     */     //   433: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   438: astore #18
/*     */     //   440: iconst_0
/*     */     //   441: istore #19
/*     */     //   443: aload #18
/*     */     //   445: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   448: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   451: if_acmpne -> 483
/*     */     //   454: iconst_0
/*     */     //   455: istore #20
/*     */     //   457: iconst_0
/*     */     //   458: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   461: aconst_null
/*     */     //   462: iconst_2
/*     */     //   463: aconst_null
/*     */     //   464: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   467: astore #20
/*     */     //   469: aload #15
/*     */     //   471: aload #20
/*     */     //   473: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   478: aload #20
/*     */     //   480: goto -> 485
/*     */     //   483: aload #18
/*     */     //   485: nop
/*     */     //   486: nop
/*     */     //   487: nop
/*     */     //   488: checkcast androidx/compose/runtime/MutableState
/*     */     //   491: astore #14
/*     */     //   493: aload #9
/*     */     //   495: invokeinterface endReplaceGroup : ()V
/*     */     //   500: aload #14
/*     */     //   502: astore #13
/*     */     //   504: aload_2
/*     */     //   505: invokeinterface isHorizontal : ()Z
/*     */     //   510: ifeq -> 519
/*     */     //   513: getstatic org/jetbrains/jewel/ui/component/SplitLayoutKt.HorizontalResizePointerIcon : Landroidx/compose/ui/input/pointer/PointerIcon;
/*     */     //   516: goto -> 522
/*     */     //   519: getstatic org/jetbrains/jewel/ui/component/SplitLayoutKt.VerticalResizePointerIcon : Landroidx/compose/ui/input/pointer/PointerIcon;
/*     */     //   522: astore #14
/*     */     //   524: aload #9
/*     */     //   526: ldc_w -1613489718
/*     */     //   529: invokeinterface startReplaceGroup : (I)V
/*     */     //   534: aload #9
/*     */     //   536: astore #17
/*     */     //   538: iconst_0
/*     */     //   539: istore #18
/*     */     //   541: nop
/*     */     //   542: iconst_0
/*     */     //   543: istore #19
/*     */     //   545: aload #17
/*     */     //   547: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   552: astore #20
/*     */     //   554: iconst_0
/*     */     //   555: istore #21
/*     */     //   557: aload #20
/*     */     //   559: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   562: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   565: if_acmpne -> 591
/*     */     //   568: iconst_0
/*     */     //   569: istore #22
/*     */     //   571: fconst_0
/*     */     //   572: invokestatic mutableFloatStateOf : (F)Landroidx/compose/runtime/MutableFloatState;
/*     */     //   575: astore #22
/*     */     //   577: aload #17
/*     */     //   579: aload #22
/*     */     //   581: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   586: aload #22
/*     */     //   588: goto -> 593
/*     */     //   591: aload #20
/*     */     //   593: nop
/*     */     //   594: nop
/*     */     //   595: nop
/*     */     //   596: checkcast androidx/compose/runtime/MutableFloatState
/*     */     //   599: astore #16
/*     */     //   601: aload #9
/*     */     //   603: invokeinterface endReplaceGroup : ()V
/*     */     //   608: aload #16
/*     */     //   610: astore #15
/*     */     //   612: aload #9
/*     */     //   614: ldc_w -1613485900
/*     */     //   617: invokeinterface startReplaceGroup : (I)V
/*     */     //   622: aload #9
/*     */     //   624: astore #18
/*     */     //   626: iload #11
/*     */     //   628: ldc 234881024
/*     */     //   630: iand
/*     */     //   631: ldc 67108864
/*     */     //   633: if_icmpne -> 640
/*     */     //   636: iconst_1
/*     */     //   637: goto -> 641
/*     */     //   640: iconst_0
/*     */     //   641: iload #11
/*     */     //   643: sipush #896
/*     */     //   646: iand
/*     */     //   647: sipush #256
/*     */     //   650: if_icmpeq -> 673
/*     */     //   653: iload #11
/*     */     //   655: sipush #512
/*     */     //   658: iand
/*     */     //   659: ifeq -> 677
/*     */     //   662: aload #9
/*     */     //   664: aload_2
/*     */     //   665: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   670: ifeq -> 677
/*     */     //   673: iconst_1
/*     */     //   674: goto -> 678
/*     */     //   677: iconst_0
/*     */     //   678: ior
/*     */     //   679: aload #9
/*     */     //   681: aload #12
/*     */     //   683: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   688: ior
/*     */     //   689: iload #11
/*     */     //   691: ldc 458752
/*     */     //   693: iand
/*     */     //   694: ldc 131072
/*     */     //   696: if_icmpne -> 703
/*     */     //   699: iconst_1
/*     */     //   700: goto -> 704
/*     */     //   703: iconst_0
/*     */     //   704: ior
/*     */     //   705: iload #11
/*     */     //   707: ldc 3670016
/*     */     //   709: iand
/*     */     //   710: ldc 1048576
/*     */     //   712: if_icmpne -> 719
/*     */     //   715: iconst_1
/*     */     //   716: goto -> 720
/*     */     //   719: iconst_0
/*     */     //   720: ior
/*     */     //   721: istore #19
/*     */     //   723: nop
/*     */     //   724: iconst_0
/*     */     //   725: istore #20
/*     */     //   727: aload #18
/*     */     //   729: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   734: astore #21
/*     */     //   736: iconst_0
/*     */     //   737: istore #22
/*     */     //   739: iload #19
/*     */     //   741: ifne -> 755
/*     */     //   744: aload #21
/*     */     //   746: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   749: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   752: if_acmpne -> 790
/*     */     //   755: iconst_0
/*     */     //   756: istore #23
/*     */     //   758: aload #8
/*     */     //   760: aload_2
/*     */     //   761: aload #12
/*     */     //   763: fload #5
/*     */     //   765: fload #6
/*     */     //   767: aload #15
/*     */     //   769: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/component/SplitLayoutState;Lorg/jetbrains/jewel/ui/component/SplitLayoutStrategy;Landroidx/compose/ui/unit/Density;FFLandroidx/compose/runtime/MutableFloatState;)Lkotlin/jvm/functions/Function1;
/*     */     //   774: astore #24
/*     */     //   776: aload #18
/*     */     //   778: aload #24
/*     */     //   780: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   785: aload #24
/*     */     //   787: goto -> 792
/*     */     //   790: aload #21
/*     */     //   792: nop
/*     */     //   793: nop
/*     */     //   794: nop
/*     */     //   795: checkcast kotlin/jvm/functions/Function1
/*     */     //   798: astore #17
/*     */     //   800: aload #9
/*     */     //   802: invokeinterface endReplaceGroup : ()V
/*     */     //   807: aload #17
/*     */     //   809: aload #9
/*     */     //   811: iconst_0
/*     */     //   812: invokestatic rememberDraggableState : (Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/DraggableState;
/*     */     //   815: astore #16
/*     */     //   817: aload_3
/*     */     //   818: aload #9
/*     */     //   820: ldc_w -1613448605
/*     */     //   823: invokeinterface startReplaceGroup : (I)V
/*     */     //   828: aload #9
/*     */     //   830: astore #19
/*     */     //   832: iload #11
/*     */     //   834: ldc 234881024
/*     */     //   836: iand
/*     */     //   837: ldc 67108864
/*     */     //   839: if_icmpne -> 846
/*     */     //   842: iconst_1
/*     */     //   843: goto -> 847
/*     */     //   846: iconst_0
/*     */     //   847: istore #20
/*     */     //   849: nop
/*     */     //   850: iconst_0
/*     */     //   851: istore #21
/*     */     //   853: aload #19
/*     */     //   855: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   860: astore #22
/*     */     //   862: iconst_0
/*     */     //   863: istore #23
/*     */     //   865: iload #20
/*     */     //   867: ifne -> 881
/*     */     //   870: aload #22
/*     */     //   872: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   875: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   878: if_acmpne -> 914
/*     */     //   881: astore #71
/*     */     //   883: iconst_0
/*     */     //   884: istore #24
/*     */     //   886: aload #8
/*     */     //   888: aload #15
/*     */     //   890: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/component/SplitLayoutState;Landroidx/compose/runtime/MutableFloatState;)Lkotlin/jvm/functions/Function1;
/*     */     //   895: aload #71
/*     */     //   897: swap
/*     */     //   898: astore #25
/*     */     //   900: aload #19
/*     */     //   902: aload #25
/*     */     //   904: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   909: aload #25
/*     */     //   911: goto -> 916
/*     */     //   914: aload #22
/*     */     //   916: nop
/*     */     //   917: nop
/*     */     //   918: nop
/*     */     //   919: checkcast kotlin/jvm/functions/Function1
/*     */     //   922: astore #18
/*     */     //   924: aload #9
/*     */     //   926: invokeinterface endReplaceGroup : ()V
/*     */     //   931: aload #18
/*     */     //   933: invokestatic onGloballyPositioned : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   936: aload #13
/*     */     //   938: invokestatic SplitLayoutImpl_Zv8xjqY$lambda$4 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   941: ifeq -> 949
/*     */     //   944: aload #14
/*     */     //   946: goto -> 955
/*     */     //   949: getstatic androidx/compose/ui/input/pointer/PointerIcon.Companion : Landroidx/compose/ui/input/pointer/PointerIcon$Companion;
/*     */     //   952: invokevirtual getDefault : ()Landroidx/compose/ui/input/pointer/PointerIcon;
/*     */     //   955: iconst_0
/*     */     //   956: iconst_2
/*     */     //   957: aconst_null
/*     */     //   958: invokestatic pointerHoverIcon$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/input/pointer/PointerIcon;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   961: astore #17
/*     */     //   963: aload #9
/*     */     //   965: ldc_w -1613379640
/*     */     //   968: invokeinterface startReplaceGroup : (I)V
/*     */     //   973: aload #9
/*     */     //   975: astore #20
/*     */     //   977: iload #11
/*     */     //   979: ldc 234881024
/*     */     //   981: iand
/*     */     //   982: ldc 67108864
/*     */     //   984: if_icmpne -> 991
/*     */     //   987: iconst_1
/*     */     //   988: goto -> 992
/*     */     //   991: iconst_0
/*     */     //   992: iload #11
/*     */     //   994: sipush #896
/*     */     //   997: iand
/*     */     //   998: sipush #256
/*     */     //   1001: if_icmpeq -> 1024
/*     */     //   1004: iload #11
/*     */     //   1006: sipush #512
/*     */     //   1009: iand
/*     */     //   1010: ifeq -> 1028
/*     */     //   1013: aload #9
/*     */     //   1015: aload_2
/*     */     //   1016: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1021: ifeq -> 1028
/*     */     //   1024: iconst_1
/*     */     //   1025: goto -> 1029
/*     */     //   1028: iconst_0
/*     */     //   1029: ior
/*     */     //   1030: aload #9
/*     */     //   1032: aload #12
/*     */     //   1034: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1039: ior
/*     */     //   1040: iload #11
/*     */     //   1042: ldc 29360128
/*     */     //   1044: iand
/*     */     //   1045: ldc 8388608
/*     */     //   1047: if_icmpne -> 1054
/*     */     //   1050: iconst_1
/*     */     //   1051: goto -> 1055
/*     */     //   1054: iconst_0
/*     */     //   1055: ior
/*     */     //   1056: iload #11
/*     */     //   1058: ldc 57344
/*     */     //   1060: iand
/*     */     //   1061: sipush #16384
/*     */     //   1064: if_icmpne -> 1071
/*     */     //   1067: iconst_1
/*     */     //   1068: goto -> 1072
/*     */     //   1071: iconst_0
/*     */     //   1072: ior
/*     */     //   1073: iload #11
/*     */     //   1075: ldc 458752
/*     */     //   1077: iand
/*     */     //   1078: ldc 131072
/*     */     //   1080: if_icmpne -> 1087
/*     */     //   1083: iconst_1
/*     */     //   1084: goto -> 1088
/*     */     //   1087: iconst_0
/*     */     //   1088: ior
/*     */     //   1089: iload #11
/*     */     //   1091: ldc 3670016
/*     */     //   1093: iand
/*     */     //   1094: ldc 1048576
/*     */     //   1096: if_icmpne -> 1103
/*     */     //   1099: iconst_1
/*     */     //   1100: goto -> 1104
/*     */     //   1103: iconst_0
/*     */     //   1104: ior
/*     */     //   1105: istore #21
/*     */     //   1107: nop
/*     */     //   1108: iconst_0
/*     */     //   1109: istore #22
/*     */     //   1111: aload #20
/*     */     //   1113: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1118: astore #23
/*     */     //   1120: iconst_0
/*     */     //   1121: istore #24
/*     */     //   1123: iload #21
/*     */     //   1125: ifne -> 1139
/*     */     //   1128: aload #23
/*     */     //   1130: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1133: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1136: if_acmpne -> 1181
/*     */     //   1139: iconst_0
/*     */     //   1140: istore #25
/*     */     //   1142: new org/jetbrains/jewel/ui/component/SplitLayoutKt$SplitLayoutImpl$2$1
/*     */     //   1145: dup
/*     */     //   1146: aload #8
/*     */     //   1148: aload_2
/*     */     //   1149: aload #12
/*     */     //   1151: aload #7
/*     */     //   1153: fload #4
/*     */     //   1155: fload #5
/*     */     //   1157: fload #6
/*     */     //   1159: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/SplitLayoutState;Lorg/jetbrains/jewel/ui/component/SplitLayoutStrategy;Landroidx/compose/ui/unit/Density;Lorg/jetbrains/jewel/ui/component/styling/DividerStyle;FFF)V
/*     */     //   1162: checkcast androidx/compose/ui/layout/MeasurePolicy
/*     */     //   1165: astore #26
/*     */     //   1167: aload #20
/*     */     //   1169: aload #26
/*     */     //   1171: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1176: aload #26
/*     */     //   1178: goto -> 1183
/*     */     //   1181: aload #23
/*     */     //   1183: nop
/*     */     //   1184: nop
/*     */     //   1185: nop
/*     */     //   1186: checkcast androidx/compose/ui/layout/MeasurePolicy
/*     */     //   1189: astore #19
/*     */     //   1191: aload #9
/*     */     //   1193: invokeinterface endReplaceGroup : ()V
/*     */     //   1198: aload #19
/*     */     //   1200: astore #18
/*     */     //   1202: iconst_0
/*     */     //   1203: istore #19
/*     */     //   1205: nop
/*     */     //   1206: iconst_0
/*     */     //   1207: istore #20
/*     */     //   1209: aload #9
/*     */     //   1211: ldc_w -1323940314
/*     */     //   1214: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1217: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1220: aload #9
/*     */     //   1222: iconst_0
/*     */     //   1223: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1226: istore #21
/*     */     //   1228: aload #9
/*     */     //   1230: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1235: astore #22
/*     */     //   1237: aload #9
/*     */     //   1239: aload #17
/*     */     //   1241: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1244: astore #23
/*     */     //   1246: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1249: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1252: astore #24
/*     */     //   1254: bipush #6
/*     */     //   1256: sipush #896
/*     */     //   1259: iload #19
/*     */     //   1261: bipush #6
/*     */     //   1263: ishl
/*     */     //   1264: iand
/*     */     //   1265: ior
/*     */     //   1266: istore #25
/*     */     //   1268: nop
/*     */     //   1269: iconst_0
/*     */     //   1270: istore #26
/*     */     //   1272: aload #9
/*     */     //   1274: ldc_w -692256719
/*     */     //   1277: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1280: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1283: aload #9
/*     */     //   1285: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1290: instanceof androidx/compose/runtime/Applier
/*     */     //   1293: ifne -> 1299
/*     */     //   1296: invokestatic invalidApplier : ()V
/*     */     //   1299: aload #9
/*     */     //   1301: invokeinterface startReusableNode : ()V
/*     */     //   1306: aload #9
/*     */     //   1308: invokeinterface getInserting : ()Z
/*     */     //   1313: ifeq -> 1328
/*     */     //   1316: aload #9
/*     */     //   1318: aload #24
/*     */     //   1320: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1325: goto -> 1335
/*     */     //   1328: aload #9
/*     */     //   1330: invokeinterface useNode : ()V
/*     */     //   1335: aload #9
/*     */     //   1337: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1340: astore #27
/*     */     //   1342: iconst_0
/*     */     //   1343: istore #28
/*     */     //   1345: aload #27
/*     */     //   1347: aload #18
/*     */     //   1349: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1352: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1355: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1358: aload #27
/*     */     //   1360: aload #22
/*     */     //   1362: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1365: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1368: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1371: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1374: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1377: astore #29
/*     */     //   1379: iconst_0
/*     */     //   1380: istore #30
/*     */     //   1382: aload #27
/*     */     //   1384: astore #31
/*     */     //   1386: iconst_0
/*     */     //   1387: istore #32
/*     */     //   1389: aload #31
/*     */     //   1391: invokeinterface getInserting : ()Z
/*     */     //   1396: ifne -> 1417
/*     */     //   1399: aload #31
/*     */     //   1401: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1406: iload #21
/*     */     //   1408: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1411: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1414: ifne -> 1443
/*     */     //   1417: aload #31
/*     */     //   1419: iload #21
/*     */     //   1421: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1424: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1429: aload #27
/*     */     //   1431: iload #21
/*     */     //   1433: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1436: aload #29
/*     */     //   1438: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1443: nop
/*     */     //   1444: nop
/*     */     //   1445: nop
/*     */     //   1446: aload #27
/*     */     //   1448: aload #23
/*     */     //   1450: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1453: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1456: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1459: nop
/*     */     //   1460: nop
/*     */     //   1461: aload #9
/*     */     //   1463: bipush #14
/*     */     //   1465: iload #25
/*     */     //   1467: bipush #6
/*     */     //   1469: ishr
/*     */     //   1470: iand
/*     */     //   1471: istore #33
/*     */     //   1473: astore #34
/*     */     //   1475: iconst_0
/*     */     //   1476: istore #35
/*     */     //   1478: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1481: checkcast androidx/compose/ui/Modifier
/*     */     //   1484: ldc 'first'
/*     */     //   1486: invokestatic layoutId : (Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1489: astore #36
/*     */     //   1491: bipush #6
/*     */     //   1493: istore #37
/*     */     //   1495: iconst_0
/*     */     //   1496: istore #38
/*     */     //   1498: aload #34
/*     */     //   1500: ldc_w 733328855
/*     */     //   1503: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   1506: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1509: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1512: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   1515: astore #39
/*     */     //   1517: iconst_0
/*     */     //   1518: istore #40
/*     */     //   1520: aload #39
/*     */     //   1522: iload #40
/*     */     //   1524: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1527: astore #41
/*     */     //   1529: bipush #112
/*     */     //   1531: iload #37
/*     */     //   1533: iconst_3
/*     */     //   1534: ishl
/*     */     //   1535: iand
/*     */     //   1536: istore #42
/*     */     //   1538: nop
/*     */     //   1539: iconst_0
/*     */     //   1540: istore #43
/*     */     //   1542: aload #34
/*     */     //   1544: ldc_w -1323940314
/*     */     //   1547: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1550: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1553: aload #34
/*     */     //   1555: iconst_0
/*     */     //   1556: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1559: istore #44
/*     */     //   1561: aload #34
/*     */     //   1563: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1568: astore #45
/*     */     //   1570: aload #34
/*     */     //   1572: aload #36
/*     */     //   1574: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1577: astore #46
/*     */     //   1579: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1582: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1585: astore #47
/*     */     //   1587: bipush #6
/*     */     //   1589: sipush #896
/*     */     //   1592: iload #42
/*     */     //   1594: bipush #6
/*     */     //   1596: ishl
/*     */     //   1597: iand
/*     */     //   1598: ior
/*     */     //   1599: istore #48
/*     */     //   1601: nop
/*     */     //   1602: iconst_0
/*     */     //   1603: istore #49
/*     */     //   1605: aload #34
/*     */     //   1607: ldc_w -692256719
/*     */     //   1610: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1613: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1616: aload #34
/*     */     //   1618: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1623: instanceof androidx/compose/runtime/Applier
/*     */     //   1626: ifne -> 1632
/*     */     //   1629: invokestatic invalidApplier : ()V
/*     */     //   1632: aload #34
/*     */     //   1634: invokeinterface startReusableNode : ()V
/*     */     //   1639: aload #34
/*     */     //   1641: invokeinterface getInserting : ()Z
/*     */     //   1646: ifeq -> 1661
/*     */     //   1649: aload #34
/*     */     //   1651: aload #47
/*     */     //   1653: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1658: goto -> 1668
/*     */     //   1661: aload #34
/*     */     //   1663: invokeinterface useNode : ()V
/*     */     //   1668: aload #34
/*     */     //   1670: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1673: astore #50
/*     */     //   1675: iconst_0
/*     */     //   1676: istore #51
/*     */     //   1678: aload #50
/*     */     //   1680: aload #41
/*     */     //   1682: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1685: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1688: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1691: aload #50
/*     */     //   1693: aload #45
/*     */     //   1695: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1698: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1701: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1704: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1707: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1710: astore #52
/*     */     //   1712: iconst_0
/*     */     //   1713: istore #53
/*     */     //   1715: aload #50
/*     */     //   1717: astore #54
/*     */     //   1719: iconst_0
/*     */     //   1720: istore #55
/*     */     //   1722: aload #54
/*     */     //   1724: invokeinterface getInserting : ()Z
/*     */     //   1729: ifne -> 1750
/*     */     //   1732: aload #54
/*     */     //   1734: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1739: iload #44
/*     */     //   1741: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1744: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1747: ifne -> 1776
/*     */     //   1750: aload #54
/*     */     //   1752: iload #44
/*     */     //   1754: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1757: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1762: aload #50
/*     */     //   1764: iload #44
/*     */     //   1766: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1769: aload #52
/*     */     //   1771: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1776: nop
/*     */     //   1777: nop
/*     */     //   1778: nop
/*     */     //   1779: aload #50
/*     */     //   1781: aload #46
/*     */     //   1783: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1786: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1789: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1792: nop
/*     */     //   1793: nop
/*     */     //   1794: aload #34
/*     */     //   1796: bipush #14
/*     */     //   1798: iload #48
/*     */     //   1800: bipush #6
/*     */     //   1802: ishr
/*     */     //   1803: iand
/*     */     //   1804: istore #56
/*     */     //   1806: astore #57
/*     */     //   1808: iconst_0
/*     */     //   1809: istore #58
/*     */     //   1811: aload #57
/*     */     //   1813: ldc_w -2146769399
/*     */     //   1816: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   1819: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1822: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   1825: aload #57
/*     */     //   1827: bipush #6
/*     */     //   1829: bipush #112
/*     */     //   1831: iload #37
/*     */     //   1833: bipush #6
/*     */     //   1835: ishr
/*     */     //   1836: iand
/*     */     //   1837: ior
/*     */     //   1838: istore #59
/*     */     //   1840: astore #60
/*     */     //   1842: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   1845: astore #61
/*     */     //   1847: iconst_0
/*     */     //   1848: istore #62
/*     */     //   1850: aload_0
/*     */     //   1851: aload #60
/*     */     //   1853: bipush #14
/*     */     //   1855: iload #11
/*     */     //   1857: iand
/*     */     //   1858: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1861: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1866: pop
/*     */     //   1867: aload #57
/*     */     //   1869: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1872: aload #34
/*     */     //   1874: invokeinterface endNode : ()V
/*     */     //   1879: aload #34
/*     */     //   1881: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1884: nop
/*     */     //   1885: aload #34
/*     */     //   1887: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1890: nop
/*     */     //   1891: aload #34
/*     */     //   1893: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1896: nop
/*     */     //   1897: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1900: checkcast androidx/compose/ui/Modifier
/*     */     //   1903: ldc 'second'
/*     */     //   1905: invokestatic layoutId : (Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1908: astore #36
/*     */     //   1910: bipush #6
/*     */     //   1912: istore #37
/*     */     //   1914: iconst_0
/*     */     //   1915: istore #38
/*     */     //   1917: aload #34
/*     */     //   1919: ldc_w 733328855
/*     */     //   1922: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   1925: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1928: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1931: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   1934: astore #39
/*     */     //   1936: iconst_0
/*     */     //   1937: istore #40
/*     */     //   1939: aload #39
/*     */     //   1941: iload #40
/*     */     //   1943: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1946: astore #41
/*     */     //   1948: bipush #112
/*     */     //   1950: iload #37
/*     */     //   1952: iconst_3
/*     */     //   1953: ishl
/*     */     //   1954: iand
/*     */     //   1955: istore #42
/*     */     //   1957: nop
/*     */     //   1958: iconst_0
/*     */     //   1959: istore #43
/*     */     //   1961: aload #34
/*     */     //   1963: ldc_w -1323940314
/*     */     //   1966: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1969: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1972: aload #34
/*     */     //   1974: iconst_0
/*     */     //   1975: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1978: istore #44
/*     */     //   1980: aload #34
/*     */     //   1982: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1987: astore #45
/*     */     //   1989: aload #34
/*     */     //   1991: aload #36
/*     */     //   1993: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1996: astore #46
/*     */     //   1998: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2001: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   2004: astore #47
/*     */     //   2006: bipush #6
/*     */     //   2008: sipush #896
/*     */     //   2011: iload #42
/*     */     //   2013: bipush #6
/*     */     //   2015: ishl
/*     */     //   2016: iand
/*     */     //   2017: ior
/*     */     //   2018: istore #48
/*     */     //   2020: nop
/*     */     //   2021: iconst_0
/*     */     //   2022: istore #49
/*     */     //   2024: aload #34
/*     */     //   2026: ldc_w -692256719
/*     */     //   2029: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   2032: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2035: aload #34
/*     */     //   2037: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   2042: instanceof androidx/compose/runtime/Applier
/*     */     //   2045: ifne -> 2051
/*     */     //   2048: invokestatic invalidApplier : ()V
/*     */     //   2051: aload #34
/*     */     //   2053: invokeinterface startReusableNode : ()V
/*     */     //   2058: aload #34
/*     */     //   2060: invokeinterface getInserting : ()Z
/*     */     //   2065: ifeq -> 2080
/*     */     //   2068: aload #34
/*     */     //   2070: aload #47
/*     */     //   2072: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   2077: goto -> 2087
/*     */     //   2080: aload #34
/*     */     //   2082: invokeinterface useNode : ()V
/*     */     //   2087: aload #34
/*     */     //   2089: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   2092: astore #50
/*     */     //   2094: iconst_0
/*     */     //   2095: istore #51
/*     */     //   2097: aload #50
/*     */     //   2099: aload #41
/*     */     //   2101: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2104: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2107: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2110: aload #50
/*     */     //   2112: aload #45
/*     */     //   2114: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2117: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2120: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2123: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2126: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2129: astore #52
/*     */     //   2131: iconst_0
/*     */     //   2132: istore #53
/*     */     //   2134: aload #50
/*     */     //   2136: astore #54
/*     */     //   2138: iconst_0
/*     */     //   2139: istore #55
/*     */     //   2141: aload #54
/*     */     //   2143: invokeinterface getInserting : ()Z
/*     */     //   2148: ifne -> 2169
/*     */     //   2151: aload #54
/*     */     //   2153: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2158: iload #44
/*     */     //   2160: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2163: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   2166: ifne -> 2195
/*     */     //   2169: aload #54
/*     */     //   2171: iload #44
/*     */     //   2173: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2176: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2181: aload #50
/*     */     //   2183: iload #44
/*     */     //   2185: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2188: aload #52
/*     */     //   2190: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2195: nop
/*     */     //   2196: nop
/*     */     //   2197: nop
/*     */     //   2198: aload #50
/*     */     //   2200: aload #46
/*     */     //   2202: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2205: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2208: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2211: nop
/*     */     //   2212: nop
/*     */     //   2213: aload #34
/*     */     //   2215: bipush #14
/*     */     //   2217: iload #48
/*     */     //   2219: bipush #6
/*     */     //   2221: ishr
/*     */     //   2222: iand
/*     */     //   2223: istore #56
/*     */     //   2225: astore #57
/*     */     //   2227: iconst_0
/*     */     //   2228: istore #58
/*     */     //   2230: aload #57
/*     */     //   2232: ldc_w -2146769399
/*     */     //   2235: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   2238: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2241: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   2244: aload #57
/*     */     //   2246: bipush #6
/*     */     //   2248: bipush #112
/*     */     //   2250: iload #37
/*     */     //   2252: bipush #6
/*     */     //   2254: ishr
/*     */     //   2255: iand
/*     */     //   2256: ior
/*     */     //   2257: istore #59
/*     */     //   2259: astore #60
/*     */     //   2261: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   2264: astore #61
/*     */     //   2266: iconst_0
/*     */     //   2267: istore #62
/*     */     //   2269: aload_1
/*     */     //   2270: aload #60
/*     */     //   2272: bipush #14
/*     */     //   2274: iload #11
/*     */     //   2276: iconst_3
/*     */     //   2277: ishr
/*     */     //   2278: iand
/*     */     //   2279: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2282: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   2287: pop
/*     */     //   2288: aload #57
/*     */     //   2290: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2293: aload #34
/*     */     //   2295: invokeinterface endNode : ()V
/*     */     //   2300: aload #34
/*     */     //   2302: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2305: nop
/*     */     //   2306: aload #34
/*     */     //   2308: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2311: nop
/*     */     //   2312: aload #34
/*     */     //   2314: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2317: nop
/*     */     //   2318: aload #34
/*     */     //   2320: ldc_w 622963884
/*     */     //   2323: invokeinterface startReplaceGroup : (I)V
/*     */     //   2328: aload #34
/*     */     //   2330: astore #40
/*     */     //   2332: iconst_0
/*     */     //   2333: istore #37
/*     */     //   2335: nop
/*     */     //   2336: iconst_0
/*     */     //   2337: istore #38
/*     */     //   2339: aload #40
/*     */     //   2341: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2346: astore #41
/*     */     //   2348: iconst_0
/*     */     //   2349: istore #42
/*     */     //   2351: aload #41
/*     */     //   2353: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2356: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2359: if_acmpne -> 2384
/*     */     //   2362: iconst_0
/*     */     //   2363: istore #43
/*     */     //   2365: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   2368: astore #43
/*     */     //   2370: aload #40
/*     */     //   2372: aload #43
/*     */     //   2374: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2379: aload #43
/*     */     //   2381: goto -> 2386
/*     */     //   2384: aload #41
/*     */     //   2386: nop
/*     */     //   2387: nop
/*     */     //   2388: nop
/*     */     //   2389: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   2392: astore #39
/*     */     //   2394: aload #34
/*     */     //   2396: invokeinterface endReplaceGroup : ()V
/*     */     //   2401: aload #39
/*     */     //   2403: astore #36
/*     */     //   2405: aload_2
/*     */     //   2406: invokeinterface isHorizontal : ()Z
/*     */     //   2411: ifeq -> 2420
/*     */     //   2414: getstatic org/jetbrains/jewel/ui/Orientation.Vertical : Lorg/jetbrains/jewel/ui/Orientation;
/*     */     //   2417: goto -> 2423
/*     */     //   2420: getstatic org/jetbrains/jewel/ui/Orientation.Horizontal : Lorg/jetbrains/jewel/ui/Orientation;
/*     */     //   2423: astore #39
/*     */     //   2425: aload_2
/*     */     //   2426: invokeinterface isHorizontal : ()Z
/*     */     //   2431: ifeq -> 2449
/*     */     //   2434: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   2437: checkcast androidx/compose/ui/Modifier
/*     */     //   2440: fconst_0
/*     */     //   2441: iconst_1
/*     */     //   2442: aconst_null
/*     */     //   2443: invokestatic fillMaxHeight$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2446: goto -> 2461
/*     */     //   2449: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   2452: checkcast androidx/compose/ui/Modifier
/*     */     //   2455: fconst_0
/*     */     //   2456: iconst_1
/*     */     //   2457: aconst_null
/*     */     //   2458: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2461: astore #40
/*     */     //   2463: aload_2
/*     */     //   2464: invokeinterface isHorizontal : ()Z
/*     */     //   2469: ifeq -> 2478
/*     */     //   2472: getstatic androidx/compose/foundation/gestures/Orientation.Horizontal : Landroidx/compose/foundation/gestures/Orientation;
/*     */     //   2475: goto -> 2481
/*     */     //   2478: getstatic androidx/compose/foundation/gestures/Orientation.Vertical : Landroidx/compose/foundation/gestures/Orientation;
/*     */     //   2481: astore #37
/*     */     //   2483: aload #39
/*     */     //   2485: aload #40
/*     */     //   2487: ldc_w 'divider'
/*     */     //   2490: invokestatic layoutId : (Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2493: iconst_0
/*     */     //   2494: aconst_null
/*     */     //   2495: iconst_2
/*     */     //   2496: aconst_null
/*     */     //   2497: invokestatic focusable$default : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2500: aload #7
/*     */     //   2502: invokevirtual getColor-0d7_KjU : ()J
/*     */     //   2505: aload #7
/*     */     //   2507: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/DividerMetrics;
/*     */     //   2510: invokevirtual getThickness-D9Ej5fM : ()F
/*     */     //   2513: fconst_0
/*     */     //   2514: aconst_null
/*     */     //   2515: aload #34
/*     */     //   2517: iconst_0
/*     */     //   2518: bipush #48
/*     */     //   2520: invokestatic Divider-RLL6an4 : (Lorg/jetbrains/jewel/ui/Orientation;Landroidx/compose/ui/Modifier;JFFLorg/jetbrains/jewel/ui/component/styling/DividerStyle;Landroidx/compose/runtime/Composer;II)V
/*     */     //   2523: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   2526: astore #41
/*     */     //   2528: iconst_0
/*     */     //   2529: istore #42
/*     */     //   2531: aload_2
/*     */     //   2532: invokeinterface isHorizontal : ()Z
/*     */     //   2537: ifeq -> 2559
/*     */     //   2540: aload #41
/*     */     //   2542: checkcast androidx/compose/ui/Modifier
/*     */     //   2545: fconst_0
/*     */     //   2546: iconst_1
/*     */     //   2547: aconst_null
/*     */     //   2548: invokestatic fillMaxHeight$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2551: fload #4
/*     */     //   2553: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   2556: goto -> 2575
/*     */     //   2559: aload #41
/*     */     //   2561: checkcast androidx/compose/ui/Modifier
/*     */     //   2564: fconst_0
/*     */     //   2565: iconst_1
/*     */     //   2566: aconst_null
/*     */     //   2567: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2570: fload #4
/*     */     //   2572: invokestatic height-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   2575: nop
/*     */     //   2576: nop
/*     */     //   2577: aload #16
/*     */     //   2579: aload #37
/*     */     //   2581: iconst_0
/*     */     //   2582: aload #36
/*     */     //   2584: iconst_0
/*     */     //   2585: aload #34
/*     */     //   2587: ldc_w 623000410
/*     */     //   2590: invokeinterface startReplaceGroup : (I)V
/*     */     //   2595: aload #34
/*     */     //   2597: astore #41
/*     */     //   2599: iconst_0
/*     */     //   2600: istore #42
/*     */     //   2602: nop
/*     */     //   2603: iconst_0
/*     */     //   2604: istore #43
/*     */     //   2606: aload #41
/*     */     //   2608: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2613: astore #44
/*     */     //   2615: iconst_0
/*     */     //   2616: istore #45
/*     */     //   2618: aload #44
/*     */     //   2620: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2623: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2626: if_acmpne -> 2691
/*     */     //   2629: istore #63
/*     */     //   2631: astore #64
/*     */     //   2633: istore #65
/*     */     //   2635: astore #66
/*     */     //   2637: astore #67
/*     */     //   2639: astore #68
/*     */     //   2641: iconst_0
/*     */     //   2642: istore #46
/*     */     //   2644: new org/jetbrains/jewel/ui/component/SplitLayoutKt$SplitLayoutImpl$3$4$1
/*     */     //   2647: dup
/*     */     //   2648: aload #13
/*     */     //   2650: aload #15
/*     */     //   2652: aconst_null
/*     */     //   2653: invokespecial <init> : (Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableFloatState;Lkotlin/coroutines/Continuation;)V
/*     */     //   2656: checkcast kotlin/jvm/functions/Function3
/*     */     //   2659: astore #69
/*     */     //   2661: aload #68
/*     */     //   2663: aload #67
/*     */     //   2665: aload #66
/*     */     //   2667: iload #65
/*     */     //   2669: aload #64
/*     */     //   2671: iload #63
/*     */     //   2673: aload #69
/*     */     //   2675: astore #47
/*     */     //   2677: aload #41
/*     */     //   2679: aload #47
/*     */     //   2681: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2686: aload #47
/*     */     //   2688: goto -> 2693
/*     */     //   2691: aload #44
/*     */     //   2693: nop
/*     */     //   2694: nop
/*     */     //   2695: nop
/*     */     //   2696: checkcast kotlin/jvm/functions/Function3
/*     */     //   2699: astore #38
/*     */     //   2701: aload #34
/*     */     //   2703: invokeinterface endReplaceGroup : ()V
/*     */     //   2708: aload #38
/*     */     //   2710: aload #34
/*     */     //   2712: ldc_w 623005499
/*     */     //   2715: invokeinterface startReplaceGroup : (I)V
/*     */     //   2720: aload #34
/*     */     //   2722: astore #41
/*     */     //   2724: iconst_0
/*     */     //   2725: istore #42
/*     */     //   2727: nop
/*     */     //   2728: iconst_0
/*     */     //   2729: istore #43
/*     */     //   2731: aload #41
/*     */     //   2733: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2738: astore #44
/*     */     //   2740: iconst_0
/*     */     //   2741: istore #45
/*     */     //   2743: aload #44
/*     */     //   2745: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2748: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2751: if_acmpne -> 2820
/*     */     //   2754: astore #69
/*     */     //   2756: istore #63
/*     */     //   2758: astore #64
/*     */     //   2760: istore #65
/*     */     //   2762: astore #66
/*     */     //   2764: astore #67
/*     */     //   2766: astore #68
/*     */     //   2768: iconst_0
/*     */     //   2769: istore #46
/*     */     //   2771: new org/jetbrains/jewel/ui/component/SplitLayoutKt$SplitLayoutImpl$3$5$1
/*     */     //   2774: dup
/*     */     //   2775: aload #13
/*     */     //   2777: aload #15
/*     */     //   2779: aconst_null
/*     */     //   2780: invokespecial <init> : (Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableFloatState;Lkotlin/coroutines/Continuation;)V
/*     */     //   2783: checkcast kotlin/jvm/functions/Function3
/*     */     //   2786: astore #70
/*     */     //   2788: aload #68
/*     */     //   2790: aload #67
/*     */     //   2792: aload #66
/*     */     //   2794: iload #65
/*     */     //   2796: aload #64
/*     */     //   2798: iload #63
/*     */     //   2800: aload #69
/*     */     //   2802: aload #70
/*     */     //   2804: astore #47
/*     */     //   2806: aload #41
/*     */     //   2808: aload #47
/*     */     //   2810: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2815: aload #47
/*     */     //   2817: goto -> 2822
/*     */     //   2820: aload #44
/*     */     //   2822: nop
/*     */     //   2823: nop
/*     */     //   2824: nop
/*     */     //   2825: checkcast kotlin/jvm/functions/Function3
/*     */     //   2828: astore #38
/*     */     //   2830: aload #34
/*     */     //   2832: invokeinterface endReplaceGroup : ()V
/*     */     //   2837: aload #38
/*     */     //   2839: iconst_0
/*     */     //   2840: sipush #148
/*     */     //   2843: aconst_null
/*     */     //   2844: invokestatic draggable$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2847: aload #14
/*     */     //   2849: iconst_0
/*     */     //   2850: iconst_2
/*     */     //   2851: aconst_null
/*     */     //   2852: invokestatic pointerHoverIcon$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/input/pointer/PointerIcon;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2855: ldc_w 'divider-handle'
/*     */     //   2858: invokestatic layoutId : (Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2861: iconst_0
/*     */     //   2862: aconst_null
/*     */     //   2863: iconst_2
/*     */     //   2864: aconst_null
/*     */     //   2865: invokestatic focusable$default : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2868: aload #34
/*     */     //   2870: iconst_0
/*     */     //   2871: invokestatic Box : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   2874: nop
/*     */     //   2875: aload #9
/*     */     //   2877: invokeinterface endNode : ()V
/*     */     //   2882: aload #9
/*     */     //   2884: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2887: nop
/*     */     //   2888: aload #9
/*     */     //   2890: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2893: nop
/*     */     //   2894: invokestatic isTraceInProgress : ()Z
/*     */     //   2897: ifeq -> 2913
/*     */     //   2900: invokestatic traceEventEnd : ()V
/*     */     //   2903: goto -> 2913
/*     */     //   2906: aload #9
/*     */     //   2908: invokeinterface skipToGroupEnd : ()V
/*     */     //   2913: aload #9
/*     */     //   2915: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   2920: dup
/*     */     //   2921: ifnull -> 2953
/*     */     //   2924: aload_0
/*     */     //   2925: aload_1
/*     */     //   2926: aload_2
/*     */     //   2927: aload_3
/*     */     //   2928: fload #4
/*     */     //   2930: fload #5
/*     */     //   2932: fload #6
/*     */     //   2934: aload #7
/*     */     //   2936: aload #8
/*     */     //   2938: iload #10
/*     */     //   2940: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lorg/jetbrains/jewel/ui/component/SplitLayoutStrategy;Landroidx/compose/ui/Modifier;FFFLorg/jetbrains/jewel/ui/component/styling/DividerStyle;Lorg/jetbrains/jewel/ui/component/SplitLayoutState;I)Lkotlin/jvm/functions/Function2;
/*     */     //   2945: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   2950: goto -> 2954
/*     */     //   2953: pop
/*     */     //   2954: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #174	-> 0
/*     */     //   #175	-> 362
/*     */     //   #521	-> 384
/*     */     //   #175	-> 405
/*     */     //   #176	-> 427
/*     */     //   #522	-> 431
/*     */     //   #523	-> 443
/*     */     //   #524	-> 454
/*     */     //   #176	-> 457
/*     */     //   #524	-> 467
/*     */     //   #525	-> 469
/*     */     //   #526	-> 478
/*     */     //   #527	-> 483
/*     */     //   #523	-> 485
/*     */     //   #522	-> 486
/*     */     //   #522	-> 487
/*     */     //   #176	-> 488
/*     */     //   #177	-> 504
/*     */     //   #179	-> 541
/*     */     //   #528	-> 545
/*     */     //   #529	-> 557
/*     */     //   #530	-> 568
/*     */     //   #179	-> 571
/*     */     //   #530	-> 575
/*     */     //   #531	-> 577
/*     */     //   #532	-> 586
/*     */     //   #533	-> 591
/*     */     //   #529	-> 593
/*     */     //   #528	-> 594
/*     */     //   #528	-> 595
/*     */     //   #179	-> 596
/*     */     //   #181	-> 723
/*     */     //   #534	-> 727
/*     */     //   #535	-> 739
/*     */     //   #536	-> 755
/*     */     //   #181	-> 758
/*     */     //   #536	-> 774
/*     */     //   #537	-> 776
/*     */     //   #538	-> 785
/*     */     //   #539	-> 790
/*     */     //   #535	-> 792
/*     */     //   #534	-> 793
/*     */     //   #534	-> 794
/*     */     //   #181	-> 795
/*     */     //   #204	-> 817
/*     */     //   #205	-> 849
/*     */     //   #540	-> 853
/*     */     //   #541	-> 865
/*     */     //   #542	-> 881
/*     */     //   #205	-> 886
/*     */     //   #542	-> 898
/*     */     //   #543	-> 900
/*     */     //   #544	-> 909
/*     */     //   #545	-> 914
/*     */     //   #541	-> 916
/*     */     //   #540	-> 917
/*     */     //   #540	-> 918
/*     */     //   #205	-> 919
/*     */     //   #210	-> 936
/*     */     //   #253	-> 1107
/*     */     //   #546	-> 1111
/*     */     //   #547	-> 1123
/*     */     //   #548	-> 1139
/*     */     //   #253	-> 1142
/*     */     //   #548	-> 1165
/*     */     //   #549	-> 1167
/*     */     //   #550	-> 1176
/*     */     //   #551	-> 1181
/*     */     //   #547	-> 1183
/*     */     //   #546	-> 1184
/*     */     //   #546	-> 1185
/*     */     //   #253	-> 1186
/*     */     //   #202	-> 1205
/*     */     //   #552	-> 1217
/*     */     //   #553	-> 1223
/*     */     //   #554	-> 1230
/*     */     //   #555	-> 1239
/*     */     //   #557	-> 1246
/*     */     //   #556	-> 1268
/*     */     //   #558	-> 1280
/*     */     //   #559	-> 1283
/*     */     //   #560	-> 1301
/*     */     //   #561	-> 1306
/*     */     //   #562	-> 1318
/*     */     //   #564	-> 1330
/*     */     //   #566	-> 1335
/*     */     //   #567	-> 1345
/*     */     //   #568	-> 1358
/*     */     //   #570	-> 1371
/*     */     //   #571	-> 1382
/*     */     //   #572	-> 1389
/*     */     //   #573	-> 1417
/*     */     //   #574	-> 1429
/*     */     //   #576	-> 1443
/*     */     //   #571	-> 1444
/*     */     //   #576	-> 1445
/*     */     //   #577	-> 1446
/*     */     //   #578	-> 1459
/*     */     //   #566	-> 1460
/*     */     //   #579	-> 1461
/*     */     //   #212	-> 1478
/*     */     //   #580	-> 1506
/*     */     //   #581	-> 1509
/*     */     //   #582	-> 1517
/*     */     //   #585	-> 1520
/*     */     //   #586	-> 1538
/*     */     //   #587	-> 1550
/*     */     //   #588	-> 1556
/*     */     //   #589	-> 1563
/*     */     //   #590	-> 1572
/*     */     //   #592	-> 1579
/*     */     //   #591	-> 1601
/*     */     //   #593	-> 1613
/*     */     //   #594	-> 1616
/*     */     //   #595	-> 1634
/*     */     //   #596	-> 1639
/*     */     //   #597	-> 1651
/*     */     //   #599	-> 1663
/*     */     //   #601	-> 1668
/*     */     //   #602	-> 1678
/*     */     //   #603	-> 1691
/*     */     //   #605	-> 1704
/*     */     //   #606	-> 1715
/*     */     //   #607	-> 1722
/*     */     //   #608	-> 1750
/*     */     //   #609	-> 1762
/*     */     //   #611	-> 1776
/*     */     //   #606	-> 1777
/*     */     //   #611	-> 1778
/*     */     //   #612	-> 1779
/*     */     //   #613	-> 1792
/*     */     //   #601	-> 1793
/*     */     //   #614	-> 1794
/*     */     //   #615	-> 1819
/*     */     //   #212	-> 1850
/*     */     //   #615	-> 1867
/*     */     //   #614	-> 1872
/*     */     //   #616	-> 1874
/*     */     //   #593	-> 1881
/*     */     //   #617	-> 1884
/*     */     //   #587	-> 1887
/*     */     //   #618	-> 1890
/*     */     //   #580	-> 1893
/*     */     //   #619	-> 1896
/*     */     //   #213	-> 1897
/*     */     //   #620	-> 1925
/*     */     //   #621	-> 1928
/*     */     //   #622	-> 1936
/*     */     //   #625	-> 1939
/*     */     //   #626	-> 1957
/*     */     //   #627	-> 1969
/*     */     //   #628	-> 1975
/*     */     //   #629	-> 1982
/*     */     //   #630	-> 1991
/*     */     //   #632	-> 1998
/*     */     //   #631	-> 2020
/*     */     //   #633	-> 2032
/*     */     //   #634	-> 2035
/*     */     //   #635	-> 2053
/*     */     //   #636	-> 2058
/*     */     //   #637	-> 2070
/*     */     //   #639	-> 2082
/*     */     //   #641	-> 2087
/*     */     //   #642	-> 2097
/*     */     //   #643	-> 2110
/*     */     //   #645	-> 2123
/*     */     //   #646	-> 2134
/*     */     //   #647	-> 2141
/*     */     //   #648	-> 2169
/*     */     //   #649	-> 2181
/*     */     //   #651	-> 2195
/*     */     //   #646	-> 2196
/*     */     //   #651	-> 2197
/*     */     //   #652	-> 2198
/*     */     //   #653	-> 2211
/*     */     //   #641	-> 2212
/*     */     //   #654	-> 2213
/*     */     //   #655	-> 2238
/*     */     //   #213	-> 2269
/*     */     //   #655	-> 2288
/*     */     //   #654	-> 2293
/*     */     //   #656	-> 2295
/*     */     //   #633	-> 2302
/*     */     //   #657	-> 2305
/*     */     //   #627	-> 2308
/*     */     //   #658	-> 2311
/*     */     //   #620	-> 2314
/*     */     //   #659	-> 2317
/*     */     //   #215	-> 2335
/*     */     //   #660	-> 2339
/*     */     //   #661	-> 2351
/*     */     //   #662	-> 2362
/*     */     //   #215	-> 2365
/*     */     //   #662	-> 2368
/*     */     //   #663	-> 2370
/*     */     //   #664	-> 2379
/*     */     //   #665	-> 2384
/*     */     //   #661	-> 2386
/*     */     //   #660	-> 2387
/*     */     //   #660	-> 2388
/*     */     //   #215	-> 2389
/*     */     //   #216	-> 2405
/*     */     //   #217	-> 2425
/*     */     //   #218	-> 2463
/*     */     //   #221	-> 2483
/*     */     //   #222	-> 2485
/*     */     //   #223	-> 2500
/*     */     //   #224	-> 2505
/*     */     //   #220	-> 2520
/*     */     //   #228	-> 2523
/*     */     //   #229	-> 2531
/*     */     //   #230	-> 2540
/*     */     //   #232	-> 2559
/*     */     //   #229	-> 2575
/*     */     //   #233	-> 2575
/*     */     //   #228	-> 2576
/*     */     //   #237	-> 2577
/*     */     //   #236	-> 2579
/*     */     //   #235	-> 2581
/*     */     //   #246	-> 2582
/*     */     //   #235	-> 2584
/*     */     //   #238	-> 2602
/*     */     //   #666	-> 2606
/*     */     //   #667	-> 2618
/*     */     //   #668	-> 2629
/*     */     //   #238	-> 2644
/*     */     //   #668	-> 2675
/*     */     //   #669	-> 2677
/*     */     //   #670	-> 2686
/*     */     //   #671	-> 2691
/*     */     //   #667	-> 2693
/*     */     //   #666	-> 2694
/*     */     //   #666	-> 2695
/*     */     //   #238	-> 2696
/*     */     //   #242	-> 2727
/*     */     //   #672	-> 2731
/*     */     //   #673	-> 2743
/*     */     //   #674	-> 2754
/*     */     //   #242	-> 2771
/*     */     //   #674	-> 2804
/*     */     //   #675	-> 2806
/*     */     //   #676	-> 2815
/*     */     //   #677	-> 2820
/*     */     //   #673	-> 2822
/*     */     //   #672	-> 2823
/*     */     //   #672	-> 2824
/*     */     //   #242	-> 2825
/*     */     //   #235	-> 2839
/*     */     //   #248	-> 2847
/*     */     //   #249	-> 2855
/*     */     //   #250	-> 2861
/*     */     //   #227	-> 2871
/*     */     //   #252	-> 2874
/*     */     //   #579	-> 2875
/*     */     //   #678	-> 2877
/*     */     //   #558	-> 2884
/*     */     //   #679	-> 2887
/*     */     //   #552	-> 2890
/*     */     //   #680	-> 2893
/*     */     //   #270	-> 2906
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   376	29	15	$i$f$getCurrent	I
/*     */     //   373	32	13	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   373	32	14	$changed$iv	I
/*     */     //   457	10	20	$i$a$-cache-SplitLayoutKt$SplitLayoutImpl$isDragging$2	I
/*     */     //   469	11	20	value$iv	Ljava/lang/Object;
/*     */     //   443	43	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   440	46	18	it$iv	Ljava/lang/Object;
/*     */     //   431	57	17	$i$f$cache	I
/*     */     //   428	60	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   428	60	16	invalid$iv	Z
/*     */     //   571	4	22	$i$a$-cache-SplitLayoutKt$SplitLayoutImpl$dragOffset$2	I
/*     */     //   577	11	22	value$iv	Ljava/lang/Object;
/*     */     //   557	37	21	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   554	40	20	it$iv	Ljava/lang/Object;
/*     */     //   545	51	19	$i$f$cache	I
/*     */     //   542	54	17	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   542	54	18	invalid$iv	Z
/*     */     //   758	16	23	$i$a$-cache-SplitLayoutKt$SplitLayoutImpl$draggableState$1	I
/*     */     //   776	11	24	value$iv	Ljava/lang/Object;
/*     */     //   739	54	22	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   736	57	21	it$iv	Ljava/lang/Object;
/*     */     //   727	68	20	$i$f$cache	I
/*     */     //   724	71	18	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   724	71	19	invalid$iv	Z
/*     */     //   886	9	24	$i$a$-cache-SplitLayoutKt$SplitLayoutImpl$1	I
/*     */     //   900	11	25	value$iv	Ljava/lang/Object;
/*     */     //   865	52	23	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   862	55	22	it$iv	Ljava/lang/Object;
/*     */     //   853	66	21	$i$f$cache	I
/*     */     //   850	69	19	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   850	69	20	invalid$iv	Z
/*     */     //   1142	23	25	$i$a$-cache-SplitLayoutKt$SplitLayoutImpl$2	I
/*     */     //   1167	11	26	value$iv	Ljava/lang/Object;
/*     */     //   1123	61	24	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1120	64	23	it$iv	Ljava/lang/Object;
/*     */     //   1111	75	22	$i$f$cache	I
/*     */     //   1108	78	20	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1108	78	21	invalid$iv	Z
/*     */     //   1850	17	62	$i$a$-Box-SplitLayoutKt$SplitLayoutImpl$3$1	I
/*     */     //   1847	20	61	$this$SplitLayoutImpl_Zv8xjqY_u24lambda_u2423_u24lambda_u2417	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   1847	20	60	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1847	20	59	$changed	I
/*     */     //   1811	61	58	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   1808	64	57	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1808	64	56	$changed$iv	I
/*     */     //   1722	55	55	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1719	58	54	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1715	64	53	$i$f$set-impl	I
/*     */     //   1712	67	52	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1678	115	51	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1675	118	50	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1605	280	49	$i$f$ReusableComposeNode	I
/*     */     //   1602	283	47	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1602	283	48	$changed$iv$iv$iv	I
/*     */     //   1542	349	43	$i$f$Layout	I
/*     */     //   1561	330	44	compositeKeyHash$iv$iv	I
/*     */     //   1570	321	45	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1579	312	46	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1539	352	42	$changed$iv$iv	I
/*     */     //   1498	399	38	$i$f$Box	I
/*     */     //   1529	368	41	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1495	402	36	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1517	380	39	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   1520	377	40	propagateMinConstraints$iv	Z
/*     */     //   1495	402	37	$changed$iv	I
/*     */     //   2269	19	62	$i$a$-Box-SplitLayoutKt$SplitLayoutImpl$3$2	I
/*     */     //   2266	22	61	$this$SplitLayoutImpl_Zv8xjqY_u24lambda_u2423_u24lambda_u2418	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   2266	22	60	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   2266	22	59	$changed	I
/*     */     //   2230	63	58	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   2227	66	57	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2227	66	56	$changed$iv	I
/*     */     //   2141	55	55	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   2138	58	54	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2134	64	53	$i$f$set-impl	I
/*     */     //   2131	67	52	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   2097	115	51	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   2094	118	50	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2024	282	49	$i$f$ReusableComposeNode	I
/*     */     //   2021	285	47	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   2021	285	48	$changed$iv$iv$iv	I
/*     */     //   1961	351	43	$i$f$Layout	I
/*     */     //   1980	332	44	compositeKeyHash$iv$iv	I
/*     */     //   1989	323	45	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1998	314	46	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1958	354	42	$changed$iv$iv	I
/*     */     //   1917	401	38	$i$f$Box	I
/*     */     //   1948	370	41	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1914	404	36	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1936	382	39	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   1939	379	40	propagateMinConstraints$iv	Z
/*     */     //   1914	404	37	$changed$iv	I
/*     */     //   2365	3	43	$i$a$-cache-SplitLayoutKt$SplitLayoutImpl$3$dividerInteractionSource$1	I
/*     */     //   2370	11	43	value$iv	Ljava/lang/Object;
/*     */     //   2351	36	42	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2348	39	41	it$iv	Ljava/lang/Object;
/*     */     //   2339	50	38	$i$f$cache	I
/*     */     //   2336	53	40	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2336	53	37	invalid$iv	Z
/*     */     //   2531	45	42	$i$a$-let-SplitLayoutKt$SplitLayoutImpl$3$3	I
/*     */     //   2528	48	41	modifier	Landroidx/compose/ui/Modifier$Companion;
/*     */     //   2644	15	46	$i$a$-cache-SplitLayoutKt$SplitLayoutImpl$3$4	I
/*     */     //   2677	11	47	value$iv	Ljava/lang/Object;
/*     */     //   2618	76	45	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2615	79	44	it$iv	Ljava/lang/Object;
/*     */     //   2606	90	43	$i$f$cache	I
/*     */     //   2603	93	41	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2603	93	42	invalid$iv	Z
/*     */     //   2771	15	46	$i$a$-cache-SplitLayoutKt$SplitLayoutImpl$3$5	I
/*     */     //   2806	11	47	value$iv	Ljava/lang/Object;
/*     */     //   2743	80	45	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2740	83	44	it$iv	Ljava/lang/Object;
/*     */     //   2731	94	43	$i$f$cache	I
/*     */     //   2728	97	41	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2728	97	42	invalid$iv	Z
/*     */     //   1478	1397	35	$i$a$-Layout-SplitLayoutKt$SplitLayoutImpl$3	I
/*     */     //   2405	470	36	dividerInteractionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   2425	450	39	dividerOrientation	Lorg/jetbrains/jewel/ui/Orientation;
/*     */     //   2463	412	40	fillModifier	Landroidx/compose/ui/Modifier;
/*     */     //   2483	392	37	orientation	Landroidx/compose/foundation/gestures/Orientation;
/*     */     //   1475	1400	34	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1475	1400	33	$changed	I
/*     */     //   1389	55	32	$i$a$-with-Updater$set$1$iv$iv	I
/*     */     //   1386	58	31	$this$set_impl_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1382	64	30	$i$f$set-impl	I
/*     */     //   1379	67	29	block$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1345	115	28	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv	I
/*     */     //   1342	118	27	$this$Layout_u24lambda_u240$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1272	1616	26	$i$f$ReusableComposeNode	I
/*     */     //   1269	1619	24	factory$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1269	1619	25	$changed$iv$iv	I
/*     */     //   1209	1685	20	$i$f$Layout	I
/*     */     //   1228	1666	21	compositeKeyHash$iv	I
/*     */     //   1237	1657	22	localMap$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1246	1648	23	materialized$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1206	1688	19	$changed$iv	I
/*     */     //   410	2493	12	density	Landroidx/compose/ui/unit/Density;
/*     */     //   504	2399	13	isDragging$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   524	2379	14	resizePointerIcon	Landroidx/compose/ui/input/pointer/PointerIcon;
/*     */     //   612	2291	15	dragOffset$delegate	Landroidx/compose/runtime/MutableFloatState;
/*     */     //   817	2086	16	draggableState	Landroidx/compose/foundation/gestures/DraggableState;
/*     */     //   15	2940	11	$dirty	I
/*     */     //   0	2955	0	first	Lkotlin/jvm/functions/Function2;
/*     */     //   0	2955	1	second	Lkotlin/jvm/functions/Function2;
/*     */     //   0	2955	2	strategy	Lorg/jetbrains/jewel/ui/component/SplitLayoutStrategy;
/*     */     //   0	2955	3	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	2955	4	draggableWidth	F
/*     */     //   0	2955	5	firstPaneMinWidth	F
/*     */     //   0	2955	6	secondPaneMinWidth	F
/*     */     //   0	2955	7	dividerStyle	Lorg/jetbrains/jewel/ui/component/styling/DividerStyle;
/*     */     //   0	2955	8	state	Lorg/jetbrains/jewel/ui/component/SplitLayoutState;
/*     */     //   0	2955	9	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	2955	10	$changed	I
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
/*     */   private static final boolean SplitLayoutImpl_Zv8xjqY$lambda$4(MutableState $isDragging$delegate) {
/*     */     State state = (State)$isDragging$delegate;
/*     */     Object object = null;
/*     */     KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 684 */     return ((Boolean)state.getValue()).booleanValue(); } private static final void SplitLayoutImpl_Zv8xjqY$lambda$5(MutableState $isDragging$delegate, boolean <set-?>) { MutableState mutableState = $isDragging$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 685 */     mutableState.setValue(value$iv); } private static final float SplitLayoutImpl_Zv8xjqY$lambda$7(MutableFloatState $dragOffset$delegate) { FloatState floatState = (FloatState)$dragOffset$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 687 */     return floatState.getFloatValue(); } private static final void SplitLayoutImpl_Zv8xjqY$lambda$8(MutableFloatState $dragOffset$delegate, float <set-?>) { MutableFloatState mutableFloatState = $dragOffset$delegate; Object object = null; KProperty property$iv = null; int $i$f$setValue = 0;
/* 688 */     mutableFloatState.setFloatValue(<set-?>); }
/*     */ 
/*     */   
/*     */   private static final Unit SplitLayoutImpl_Zv8xjqY$lambda$13$lambda$12(SplitLayoutState $state, SplitLayoutStrategy $strategy, Density $density, float $firstPaneMinWidth, float $secondPaneMinWidth, MutableFloatState $dragOffset$delegate, float delta) {
/*     */     LayoutCoordinates coordinates = $state.getLayoutCoordinates();
/*     */     int $i$a$-let-SplitLayoutKt$SplitLayoutImpl$draggableState$1$1$1 = 0;
/*     */     int size = $strategy.isHorizontal() ? IntSize.getWidth-impl(coordinates.getSize-YbymL2g()) : IntSize.getHeight-impl(coordinates.getSize-YbymL2g());
/*     */     Density $this$SplitLayoutImpl_Zv8xjqY_u24lambda_u2413_u24lambda_u2412_u24lambda_u2411_u24lambda_u249 = $density;
/*     */     int $i$a$-with-SplitLayoutKt$SplitLayoutImpl$draggableState$1$1$1$minFirstPositionPx$1 = 0;
/*     */     float minFirstPositionPx = $this$SplitLayoutImpl_Zv8xjqY_u24lambda_u2413_u24lambda_u2412_u24lambda_u2411_u24lambda_u249.toPx-0680j_4($firstPaneMinWidth);
/*     */     Density $this$SplitLayoutImpl_Zv8xjqY_u24lambda_u2413_u24lambda_u2412_u24lambda_u2411_u24lambda_u2410 = $density;
/*     */     int $i$a$-with-SplitLayoutKt$SplitLayoutImpl$draggableState$1$1$1$minSecondPositionPx$1 = 0;
/*     */     float minSecondPositionPx = $this$SplitLayoutImpl_Zv8xjqY_u24lambda_u2413_u24lambda_u2412_u24lambda_u2411_u24lambda_u2410.toPx-0680j_4($secondPaneMinWidth);
/*     */     if (minFirstPositionPx + minSecondPositionPx <= size) {
/*     */       SplitLayoutImpl_Zv8xjqY$lambda$8($dragOffset$delegate, SplitLayoutImpl_Zv8xjqY$lambda$7($dragOffset$delegate) + delta);
/*     */       float position = size * $state.getDividerPosition() + SplitLayoutImpl_Zv8xjqY$lambda$7($dragOffset$delegate);
/*     */       float newPosition = RangesKt.coerceIn(position, minFirstPositionPx, size - minSecondPositionPx);
/*     */       $state.setDividerPosition(newPosition / size);
/*     */     } 
/*     */     $state.getLayoutCoordinates();
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit SplitLayoutImpl_Zv8xjqY$lambda$15$lambda$14(SplitLayoutState $state, MutableFloatState $dragOffset$delegate, LayoutCoordinates coordinates) {
/*     */     Intrinsics.checkNotNullParameter(coordinates, "coordinates");
/*     */     $state.setLayoutCoordinates(coordinates);
/*     */     SplitLayoutImpl_Zv8xjqY$lambda$8($dragOffset$delegate, 0.0F);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "SplitLayout.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.SplitLayoutKt$SplitLayoutImpl$3$4$1")
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", "Landroidx/compose/ui/geometry/Offset;"})
/*     */   static final class SplitLayoutKt$SplitLayoutImpl$3$4$1 extends SuspendLambda implements Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     SplitLayoutKt$SplitLayoutImpl$3$4$1(MutableState<Boolean> $isDragging$delegate, MutableFloatState $dragOffset$delegate, Continuation $completion) {
/*     */       super(3, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           SplitLayoutKt.SplitLayoutImpl_Zv8xjqY$lambda$5(this.$isDragging$delegate, true);
/*     */           SplitLayoutKt.SplitLayoutImpl_Zv8xjqY$lambda$8(this.$dragOffset$delegate, 0.0F);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Object invoke-d-4ec7I(CoroutineScope p1, long p2, Continuation<? super SplitLayoutKt$SplitLayoutImpl$3$4$1> p3) {
/*     */       return (new SplitLayoutKt$SplitLayoutImpl$3$4$1(this.$isDragging$delegate, this.$dragOffset$delegate, p3)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "SplitLayout.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.SplitLayoutKt$SplitLayoutImpl$3$5$1")
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\007\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", ""})
/*     */   static final class SplitLayoutKt$SplitLayoutImpl$3$5$1 extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     SplitLayoutKt$SplitLayoutImpl$3$5$1(MutableState<Boolean> $isDragging$delegate, MutableFloatState $dragOffset$delegate, Continuation $completion) {
/*     */       super(3, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           SplitLayoutKt.SplitLayoutImpl_Zv8xjqY$lambda$5(this.$isDragging$delegate, false);
/*     */           SplitLayoutKt.SplitLayoutImpl_Zv8xjqY$lambda$8(this.$dragOffset$delegate, 0.0F);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, float p2, Continuation<? super SplitLayoutKt$SplitLayoutImpl$3$5$1> p3) {
/*     */       return (new SplitLayoutKt$SplitLayoutImpl$3$5$1(this.$isDragging$delegate, this.$dragOffset$delegate, p3)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class SplitLayoutKt$SplitLayoutImpl$2$1 implements MeasurePolicy {
/*     */     SplitLayoutKt$SplitLayoutImpl$2$1(SplitLayoutState $state, SplitLayoutStrategy $strategy, Density $density, DividerStyle $dividerStyle, float $draggableWidth, float $firstPaneMinWidth, float $secondPaneMinWidth) {}
/*     */     
/*     */     public final MeasureResult measure-3p2s80s(MeasureScope $this$Layout, List measurables, long constraints) {
/*     */       Intrinsics.checkNotNullParameter($this$Layout, "$this$Layout");
/*     */       Intrinsics.checkNotNullParameter(measurables, "measurables");
/*     */       return (this.$state.getLayoutCoordinates() == null) ? SplitLayoutKt.notReadyLayout-0kLqBqw($this$Layout, constraints) : SplitLayoutKt.doLayout-yZ4TukA($this$Layout, this.$strategy, this.$density, this.$state, this.$dividerStyle, this.$draggableWidth, this.$firstPaneMinWidth, this.$secondPaneMinWidth, constraints, measurables);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final MeasureResult notReadyLayout-0kLqBqw(MeasureScope $this$notReadyLayout_u2d0kLqBqw, long constraints) {
/*     */     return MeasureScope.layout$default($this$notReadyLayout_u2d0kLqBqw, Constraints.getMinWidth-impl(constraints), Constraints.getMinHeight-impl(constraints), null, SplitLayoutKt::notReadyLayout_0kLqBqw$lambda$25, 4, null);
/*     */   }
/*     */   
/*     */   private static final Unit notReadyLayout_0kLqBqw$lambda$25(Placeable.PlacementScope $this$layout) {
/*     */     Intrinsics.checkNotNullParameter($this$layout, "$this$layout");
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final MeasureResult doLayout-yZ4TukA(MeasureScope $this$doLayout_u2dyZ4TukA, SplitLayoutStrategy strategy, Density density, SplitLayoutState state, DividerStyle dividerStyle, float draggableWidth, float firstPaneMinWidth, float secondPaneMinWidth, long constraints, List measurables) {
/*     */     // Byte code:
/*     */     //   0: aload #10
/*     */     //   2: checkcast java/lang/Iterable
/*     */     //   5: astore #14
/*     */     //   7: aload #14
/*     */     //   9: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   14: astore #15
/*     */     //   16: aload #15
/*     */     //   18: invokeinterface hasNext : ()Z
/*     */     //   23: ifeq -> 63
/*     */     //   26: aload #15
/*     */     //   28: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   33: astore #16
/*     */     //   35: aload #16
/*     */     //   37: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   40: astore #17
/*     */     //   42: iconst_0
/*     */     //   43: istore #18
/*     */     //   45: aload #17
/*     */     //   47: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */     //   50: ldc 'first'
/*     */     //   52: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   55: ifeq -> 16
/*     */     //   58: aload #16
/*     */     //   60: goto -> 64
/*     */     //   63: aconst_null
/*     */     //   64: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   67: dup
/*     */     //   68: ifnonnull -> 86
/*     */     //   71: pop
/*     */     //   72: new java/lang/IllegalStateException
/*     */     //   75: dup
/*     */     //   76: ldc_w 'No first component found.'
/*     */     //   79: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   82: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   85: athrow
/*     */     //   86: astore #11
/*     */     //   88: aload #10
/*     */     //   90: checkcast java/lang/Iterable
/*     */     //   93: astore #15
/*     */     //   95: aload #15
/*     */     //   97: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   102: astore #16
/*     */     //   104: aload #16
/*     */     //   106: invokeinterface hasNext : ()Z
/*     */     //   111: ifeq -> 151
/*     */     //   114: aload #16
/*     */     //   116: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   121: astore #17
/*     */     //   123: aload #17
/*     */     //   125: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   128: astore #18
/*     */     //   130: iconst_0
/*     */     //   131: istore #19
/*     */     //   133: aload #18
/*     */     //   135: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */     //   138: ldc 'second'
/*     */     //   140: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   143: ifeq -> 104
/*     */     //   146: aload #17
/*     */     //   148: goto -> 152
/*     */     //   151: aconst_null
/*     */     //   152: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   155: dup
/*     */     //   156: ifnonnull -> 174
/*     */     //   159: pop
/*     */     //   160: new java/lang/IllegalStateException
/*     */     //   163: dup
/*     */     //   164: ldc_w 'No second component found.'
/*     */     //   167: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   170: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   173: athrow
/*     */     //   174: astore #12
/*     */     //   176: aload #10
/*     */     //   178: checkcast java/lang/Iterable
/*     */     //   181: astore #16
/*     */     //   183: aload #16
/*     */     //   185: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   190: astore #17
/*     */     //   192: aload #17
/*     */     //   194: invokeinterface hasNext : ()Z
/*     */     //   199: ifeq -> 240
/*     */     //   202: aload #17
/*     */     //   204: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   209: astore #18
/*     */     //   211: aload #18
/*     */     //   213: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   216: astore #19
/*     */     //   218: iconst_0
/*     */     //   219: istore #20
/*     */     //   221: aload #19
/*     */     //   223: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */     //   226: ldc_w 'divider'
/*     */     //   229: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   232: ifeq -> 192
/*     */     //   235: aload #18
/*     */     //   237: goto -> 241
/*     */     //   240: aconst_null
/*     */     //   241: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   244: dup
/*     */     //   245: ifnonnull -> 263
/*     */     //   248: pop
/*     */     //   249: new java/lang/IllegalStateException
/*     */     //   252: dup
/*     */     //   253: ldc_w 'No divider component found.'
/*     */     //   256: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   259: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   262: athrow
/*     */     //   263: astore #13
/*     */     //   265: aload #10
/*     */     //   267: checkcast java/lang/Iterable
/*     */     //   270: astore #17
/*     */     //   272: aload #17
/*     */     //   274: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   279: astore #18
/*     */     //   281: aload #18
/*     */     //   283: invokeinterface hasNext : ()Z
/*     */     //   288: ifeq -> 329
/*     */     //   291: aload #18
/*     */     //   293: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   298: astore #19
/*     */     //   300: aload #19
/*     */     //   302: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   305: astore #20
/*     */     //   307: iconst_0
/*     */     //   308: istore #21
/*     */     //   310: aload #20
/*     */     //   312: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */     //   315: ldc_w 'divider-handle'
/*     */     //   318: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   321: ifeq -> 281
/*     */     //   324: aload #19
/*     */     //   326: goto -> 330
/*     */     //   329: aconst_null
/*     */     //   330: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   333: dup
/*     */     //   334: ifnonnull -> 352
/*     */     //   337: pop
/*     */     //   338: new java/lang/IllegalStateException
/*     */     //   341: dup
/*     */     //   342: ldc_w 'No divider-handle component found.'
/*     */     //   345: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   348: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   351: athrow
/*     */     //   352: astore #14
/*     */     //   354: aload_1
/*     */     //   355: aload_2
/*     */     //   356: aload_0
/*     */     //   357: invokeinterface getLayoutDirection : ()Landroidx/compose/ui/unit/LayoutDirection;
/*     */     //   362: aload_3
/*     */     //   363: invokeinterface calculateSplitResult : (Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Lorg/jetbrains/jewel/ui/component/SplitLayoutState;)Lorg/jetbrains/jewel/ui/component/SplitResult;
/*     */     //   368: astore #15
/*     */     //   370: aload #15
/*     */     //   372: invokevirtual getGapOrientation : ()Landroidx/compose/foundation/gestures/Orientation;
/*     */     //   375: astore #16
/*     */     //   377: aload_2
/*     */     //   378: astore #18
/*     */     //   380: iconst_0
/*     */     //   381: istore #19
/*     */     //   383: aload #18
/*     */     //   385: aload #4
/*     */     //   387: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/DividerMetrics;
/*     */     //   390: invokevirtual getThickness-D9Ej5fM : ()F
/*     */     //   393: invokeinterface roundToPx-0680j_4 : (F)I
/*     */     //   398: nop
/*     */     //   399: istore #17
/*     */     //   401: aload_2
/*     */     //   402: astore #19
/*     */     //   404: iconst_0
/*     */     //   405: istore #20
/*     */     //   407: aload #19
/*     */     //   409: fload #5
/*     */     //   411: invokeinterface roundToPx-0680j_4 : (F)I
/*     */     //   416: nop
/*     */     //   417: istore #18
/*     */     //   419: aload #13
/*     */     //   421: aload #16
/*     */     //   423: getstatic org/jetbrains/jewel/ui/component/SplitLayoutKt$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   426: swap
/*     */     //   427: invokevirtual ordinal : ()I
/*     */     //   430: iaload
/*     */     //   431: tableswitch default -> 496, 1 -> 452, 2 -> 474
/*     */     //   452: lload #8
/*     */     //   454: iload #17
/*     */     //   456: iload #17
/*     */     //   458: lload #8
/*     */     //   460: invokestatic getMinHeight-impl : (J)I
/*     */     //   463: lload #8
/*     */     //   465: invokestatic getMaxHeight-impl : (J)I
/*     */     //   468: invokestatic copy-Zbe2FdA : (JIIII)J
/*     */     //   471: goto -> 504
/*     */     //   474: lload #8
/*     */     //   476: lload #8
/*     */     //   478: invokestatic getMinWidth-impl : (J)I
/*     */     //   481: lload #8
/*     */     //   483: invokestatic getMaxWidth-impl : (J)I
/*     */     //   486: iload #17
/*     */     //   488: iload #17
/*     */     //   490: invokestatic copy-Zbe2FdA : (JIIII)J
/*     */     //   493: goto -> 504
/*     */     //   496: new kotlin/NoWhenBranchMatchedException
/*     */     //   499: dup
/*     */     //   500: invokespecial <init> : ()V
/*     */     //   503: athrow
/*     */     //   504: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */     //   509: astore #19
/*     */     //   511: aload #14
/*     */     //   513: aload #16
/*     */     //   515: getstatic org/jetbrains/jewel/ui/component/SplitLayoutKt$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   518: swap
/*     */     //   519: invokevirtual ordinal : ()I
/*     */     //   522: iaload
/*     */     //   523: tableswitch default -> 588, 1 -> 544, 2 -> 566
/*     */     //   544: lload #8
/*     */     //   546: iload #18
/*     */     //   548: iload #18
/*     */     //   550: lload #8
/*     */     //   552: invokestatic getMinHeight-impl : (J)I
/*     */     //   555: lload #8
/*     */     //   557: invokestatic getMaxHeight-impl : (J)I
/*     */     //   560: invokestatic copy-Zbe2FdA : (JIIII)J
/*     */     //   563: goto -> 596
/*     */     //   566: lload #8
/*     */     //   568: lload #8
/*     */     //   570: invokestatic getMinWidth-impl : (J)I
/*     */     //   573: lload #8
/*     */     //   575: invokestatic getMaxWidth-impl : (J)I
/*     */     //   578: iload #18
/*     */     //   580: iload #18
/*     */     //   582: invokestatic copy-Zbe2FdA : (JIIII)J
/*     */     //   585: goto -> 596
/*     */     //   588: new kotlin/NoWhenBranchMatchedException
/*     */     //   591: dup
/*     */     //   592: invokespecial <init> : ()V
/*     */     //   595: athrow
/*     */     //   596: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */     //   601: astore #20
/*     */     //   603: aload #16
/*     */     //   605: getstatic androidx/compose/foundation/gestures/Orientation.Vertical : Landroidx/compose/foundation/gestures/Orientation;
/*     */     //   608: if_acmpne -> 626
/*     */     //   611: lload #8
/*     */     //   613: invokestatic getMaxWidth-impl : (J)I
/*     */     //   616: iload #17
/*     */     //   618: isub
/*     */     //   619: iconst_1
/*     */     //   620: invokestatic coerceAtLeast : (II)I
/*     */     //   623: goto -> 638
/*     */     //   626: lload #8
/*     */     //   628: invokestatic getMaxHeight-impl : (J)I
/*     */     //   631: iload #17
/*     */     //   633: isub
/*     */     //   634: iconst_1
/*     */     //   635: invokestatic coerceAtLeast : (II)I
/*     */     //   638: istore #21
/*     */     //   640: aload_2
/*     */     //   641: astore #23
/*     */     //   643: iconst_0
/*     */     //   644: istore #24
/*     */     //   646: aload #23
/*     */     //   648: fload #6
/*     */     //   650: invokeinterface roundToPx-0680j_4 : (F)I
/*     */     //   655: nop
/*     */     //   656: istore #22
/*     */     //   658: aload_2
/*     */     //   659: astore #24
/*     */     //   661: iconst_0
/*     */     //   662: istore #25
/*     */     //   664: aload #24
/*     */     //   666: fload #7
/*     */     //   668: invokeinterface roundToPx-0680j_4 : (F)I
/*     */     //   673: nop
/*     */     //   674: istore #23
/*     */     //   676: iload #21
/*     */     //   678: i2f
/*     */     //   679: aload_3
/*     */     //   680: invokevirtual getDividerPosition : ()F
/*     */     //   683: fmul
/*     */     //   684: invokestatic roundToInt : (F)I
/*     */     //   687: istore #24
/*     */     //   689: iload #21
/*     */     //   691: iload #24
/*     */     //   693: isub
/*     */     //   694: istore #25
/*     */     //   696: iload #21
/*     */     //   698: iload #24
/*     */     //   700: iload #25
/*     */     //   702: iload #22
/*     */     //   704: iload #23
/*     */     //   706: invokestatic calculateAdjustedSizes : (IIIII)Lkotlin/Pair;
/*     */     //   709: astore #26
/*     */     //   711: aload #26
/*     */     //   713: invokevirtual component1 : ()Ljava/lang/Object;
/*     */     //   716: checkcast java/lang/Number
/*     */     //   719: invokevirtual intValue : ()I
/*     */     //   722: istore #27
/*     */     //   724: aload #26
/*     */     //   726: invokevirtual component2 : ()Ljava/lang/Object;
/*     */     //   729: checkcast java/lang/Number
/*     */     //   732: invokevirtual intValue : ()I
/*     */     //   735: istore #28
/*     */     //   737: aload_3
/*     */     //   738: iload #27
/*     */     //   740: i2f
/*     */     //   741: iload #21
/*     */     //   743: i2f
/*     */     //   744: fdiv
/*     */     //   745: invokevirtual setDividerPosition : (F)V
/*     */     //   748: aload #16
/*     */     //   750: getstatic org/jetbrains/jewel/ui/component/SplitLayoutKt$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   753: swap
/*     */     //   754: invokevirtual ordinal : ()I
/*     */     //   757: iaload
/*     */     //   758: tableswitch default -> 813, 1 -> 780, 2 -> 797
/*     */     //   780: lload #8
/*     */     //   782: iload #27
/*     */     //   784: iload #27
/*     */     //   786: iconst_0
/*     */     //   787: iconst_0
/*     */     //   788: bipush #12
/*     */     //   790: aconst_null
/*     */     //   791: invokestatic copy-Zbe2FdA$default : (JIIIIILjava/lang/Object;)J
/*     */     //   794: goto -> 821
/*     */     //   797: lload #8
/*     */     //   799: iconst_0
/*     */     //   800: iconst_0
/*     */     //   801: iload #27
/*     */     //   803: iload #27
/*     */     //   805: iconst_3
/*     */     //   806: aconst_null
/*     */     //   807: invokestatic copy-Zbe2FdA$default : (JIIIIILjava/lang/Object;)J
/*     */     //   810: goto -> 821
/*     */     //   813: new kotlin/NoWhenBranchMatchedException
/*     */     //   816: dup
/*     */     //   817: invokespecial <init> : ()V
/*     */     //   820: athrow
/*     */     //   821: lstore #29
/*     */     //   823: aload #16
/*     */     //   825: getstatic org/jetbrains/jewel/ui/component/SplitLayoutKt$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   828: swap
/*     */     //   829: invokevirtual ordinal : ()I
/*     */     //   832: iaload
/*     */     //   833: tableswitch default -> 889, 1 -> 856, 2 -> 873
/*     */     //   856: lload #8
/*     */     //   858: iload #28
/*     */     //   860: iload #28
/*     */     //   862: iconst_0
/*     */     //   863: iconst_0
/*     */     //   864: bipush #12
/*     */     //   866: aconst_null
/*     */     //   867: invokestatic copy-Zbe2FdA$default : (JIIIIILjava/lang/Object;)J
/*     */     //   870: goto -> 897
/*     */     //   873: lload #8
/*     */     //   875: iconst_0
/*     */     //   876: iconst_0
/*     */     //   877: iload #28
/*     */     //   879: iload #28
/*     */     //   881: iconst_3
/*     */     //   882: aconst_null
/*     */     //   883: invokestatic copy-Zbe2FdA$default : (JIIIIILjava/lang/Object;)J
/*     */     //   886: goto -> 897
/*     */     //   889: new kotlin/NoWhenBranchMatchedException
/*     */     //   892: dup
/*     */     //   893: invokespecial <init> : ()V
/*     */     //   896: athrow
/*     */     //   897: lstore #31
/*     */     //   899: aload #11
/*     */     //   901: lload #29
/*     */     //   903: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */     //   908: astore #33
/*     */     //   910: aload #12
/*     */     //   912: lload #31
/*     */     //   914: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */     //   919: astore #34
/*     */     //   921: aload_0
/*     */     //   922: lload #8
/*     */     //   924: invokestatic getMaxWidth-impl : (J)I
/*     */     //   927: lload #8
/*     */     //   929: invokestatic getMaxHeight-impl : (J)I
/*     */     //   932: aconst_null
/*     */     //   933: aload #16
/*     */     //   935: aload #33
/*     */     //   937: aload #19
/*     */     //   939: iload #27
/*     */     //   941: aload #20
/*     */     //   943: iload #18
/*     */     //   945: aload #34
/*     */     //   947: iload #17
/*     */     //   949: <illegal opcode> invoke : (Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ILandroidx/compose/ui/layout/Placeable;ILandroidx/compose/ui/layout/Placeable;I)Lkotlin/jvm/functions/Function1;
/*     */     //   954: iconst_4
/*     */     //   955: aconst_null
/*     */     //   956: invokestatic layout$default : (Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;
/*     */     //   959: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #286	-> 0
/*     */     //   #681	-> 42
/*     */     //   #286	-> 45
/*     */     //   #286	-> 55
/*     */     //   #286	-> 64
/*     */     //   #287	-> 88
/*     */     //   #681	-> 130
/*     */     //   #287	-> 133
/*     */     //   #287	-> 143
/*     */     //   #287	-> 152
/*     */     //   #288	-> 176
/*     */     //   #681	-> 218
/*     */     //   #288	-> 221
/*     */     //   #288	-> 232
/*     */     //   #288	-> 241
/*     */     //   #290	-> 265
/*     */     //   #681	-> 307
/*     */     //   #290	-> 310
/*     */     //   #290	-> 321
/*     */     //   #290	-> 330
/*     */     //   #289	-> 352
/*     */     //   #292	-> 354
/*     */     //   #294	-> 370
/*     */     //   #296	-> 377
/*     */     //   #681	-> 380
/*     */     //   #296	-> 383
/*     */     //   #296	-> 398
/*     */     //   #296	-> 399
/*     */     //   #297	-> 401
/*     */     //   #681	-> 404
/*     */     //   #297	-> 407
/*     */     //   #297	-> 416
/*     */     //   #297	-> 417
/*     */     //   #301	-> 419
/*     */     //   #302	-> 421
/*     */     //   #304	-> 452
/*     */     //   #305	-> 454
/*     */     //   #306	-> 456
/*     */     //   #307	-> 458
/*     */     //   #308	-> 463
/*     */     //   #304	-> 468
/*     */     //   #313	-> 474
/*     */     //   #314	-> 476
/*     */     //   #315	-> 481
/*     */     //   #316	-> 486
/*     */     //   #317	-> 488
/*     */     //   #313	-> 490
/*     */     //   #302	-> 496
/*     */     //   #301	-> 504
/*     */     //   #300	-> 509
/*     */     //   #326	-> 511
/*     */     //   #327	-> 513
/*     */     //   #329	-> 544
/*     */     //   #330	-> 546
/*     */     //   #331	-> 548
/*     */     //   #332	-> 550
/*     */     //   #333	-> 555
/*     */     //   #329	-> 560
/*     */     //   #338	-> 566
/*     */     //   #339	-> 568
/*     */     //   #340	-> 573
/*     */     //   #341	-> 578
/*     */     //   #342	-> 580
/*     */     //   #338	-> 582
/*     */     //   #327	-> 588
/*     */     //   #326	-> 596
/*     */     //   #325	-> 601
/*     */     //   #349	-> 603
/*     */     //   #350	-> 611
/*     */     //   #352	-> 626
/*     */     //   #349	-> 638
/*     */     //   #348	-> 638
/*     */     //   #355	-> 640
/*     */     //   #681	-> 643
/*     */     //   #355	-> 646
/*     */     //   #355	-> 655
/*     */     //   #355	-> 656
/*     */     //   #356	-> 658
/*     */     //   #681	-> 661
/*     */     //   #356	-> 664
/*     */     //   #356	-> 673
/*     */     //   #356	-> 674
/*     */     //   #359	-> 676
/*     */     //   #360	-> 689
/*     */     //   #364	-> 696
/*     */     //   #365	-> 698
/*     */     //   #366	-> 700
/*     */     //   #367	-> 702
/*     */     //   #368	-> 704
/*     */     //   #363	-> 706
/*     */     //   #362	-> 709
/*     */     //   #372	-> 737
/*     */     //   #376	-> 748
/*     */     //   #377	-> 780
/*     */     //   #378	-> 797
/*     */     //   #376	-> 813
/*     */     //   #375	-> 821
/*     */     //   #382	-> 823
/*     */     //   #383	-> 856
/*     */     //   #384	-> 873
/*     */     //   #382	-> 889
/*     */     //   #381	-> 897
/*     */     //   #387	-> 899
/*     */     //   #388	-> 910
/*     */     //   #390	-> 921
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   45	10	18	$i$a$-find-SplitLayoutKt$doLayout$firstMeasurable$1	I
/*     */     //   42	13	17	it	Landroidx/compose/ui/layout/Measurable;
/*     */     //   133	10	19	$i$a$-find-SplitLayoutKt$doLayout$secondMeasurable$1	I
/*     */     //   130	13	18	it	Landroidx/compose/ui/layout/Measurable;
/*     */     //   221	11	20	$i$a$-find-SplitLayoutKt$doLayout$dividerMeasurable$1	I
/*     */     //   218	14	19	it	Landroidx/compose/ui/layout/Measurable;
/*     */     //   310	11	21	$i$a$-find-SplitLayoutKt$doLayout$dividerHandleMeasurable$1	I
/*     */     //   307	14	20	it	Landroidx/compose/ui/layout/Measurable;
/*     */     //   383	15	19	$i$a$-with-SplitLayoutKt$doLayout$dividerWidth$1	I
/*     */     //   380	18	18	$this$doLayout_yZ4TukA_u24lambda_u2430	Landroidx/compose/ui/unit/Density;
/*     */     //   407	9	20	$i$a$-with-SplitLayoutKt$doLayout$handleWidth$1	I
/*     */     //   404	12	19	$this$doLayout_yZ4TukA_u24lambda_u2431	Landroidx/compose/ui/unit/Density;
/*     */     //   646	9	24	$i$a$-with-SplitLayoutKt$doLayout$minFirstPaneSizePx$1	I
/*     */     //   643	12	23	$this$doLayout_yZ4TukA_u24lambda_u2432	Landroidx/compose/ui/unit/Density;
/*     */     //   664	9	25	$i$a$-with-SplitLayoutKt$doLayout$minSecondPaneSizePx$1	I
/*     */     //   661	12	24	$this$doLayout_yZ4TukA_u24lambda_u2433	Landroidx/compose/ui/unit/Density;
/*     */     //   88	872	11	firstMeasurable	Landroidx/compose/ui/layout/Measurable;
/*     */     //   176	784	12	secondMeasurable	Landroidx/compose/ui/layout/Measurable;
/*     */     //   265	695	13	dividerMeasurable	Landroidx/compose/ui/layout/Measurable;
/*     */     //   354	606	14	dividerHandleMeasurable	Landroidx/compose/ui/layout/Measurable;
/*     */     //   370	590	15	splitResult	Lorg/jetbrains/jewel/ui/component/SplitResult;
/*     */     //   377	583	16	gapOrientation	Landroidx/compose/foundation/gestures/Orientation;
/*     */     //   401	559	17	dividerWidth	I
/*     */     //   419	541	18	handleWidth	I
/*     */     //   511	449	19	dividerPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */     //   603	357	20	dividerHandlePlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */     //   640	320	21	availableSpace	I
/*     */     //   658	302	22	minFirstPaneSizePx	I
/*     */     //   676	284	23	minSecondPaneSizePx	I
/*     */     //   689	271	24	initialFirstSize	I
/*     */     //   696	264	25	initialSecondSize	I
/*     */     //   724	236	27	adjustedFirstSize	I
/*     */     //   737	223	28	adjustedSecondSize	I
/*     */     //   823	137	29	firstConstraints	J
/*     */     //   899	61	31	secondConstraints	J
/*     */     //   910	50	33	firstPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */     //   921	39	34	secondPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */     //   0	960	0	$this$doLayout_u2dyZ4TukA	Landroidx/compose/ui/layout/MeasureScope;
/*     */     //   0	960	1	strategy	Lorg/jetbrains/jewel/ui/component/SplitLayoutStrategy;
/*     */     //   0	960	2	density	Landroidx/compose/ui/unit/Density;
/*     */     //   0	960	3	state	Lorg/jetbrains/jewel/ui/component/SplitLayoutState;
/*     */     //   0	960	4	dividerStyle	Lorg/jetbrains/jewel/ui/component/styling/DividerStyle;
/*     */     //   0	960	5	draggableWidth	F
/*     */     //   0	960	6	firstPaneMinWidth	F
/*     */     //   0	960	7	secondPaneMinWidth	F
/*     */     //   0	960	8	constraints	J
/*     */     //   0	960	10	measurables	Ljava/util/List;
/*     */   }
/*     */   
/*     */   private static final Unit doLayout_yZ4TukA$lambda$34(Orientation $gapOrientation, Placeable $firstPlaceable, Placeable $dividerPlaceable, int $adjustedFirstSize, Placeable $dividerHandlePlaceable, int $handleWidth, Placeable $secondPlaceable, int $dividerWidth, Placeable.PlacementScope $this$layout) {
/*     */     Intrinsics.checkNotNullParameter($this$layout, "$this$layout");
/*     */     switch (WhenMappings.$EnumSwitchMapping$0[$gapOrientation.ordinal()]) {
/*     */       case 1:
/*     */         Placeable.PlacementScope.placeRelative$default($this$layout, $firstPlaceable, 0, 0, 0.0F, 4, null);
/*     */         Placeable.PlacementScope.placeRelative$default($this$layout, $dividerPlaceable, $adjustedFirstSize, 0, 0.0F, 4, null);
/*     */         Placeable.PlacementScope.placeRelative$default($this$layout, $dividerHandlePlaceable, $adjustedFirstSize - $handleWidth / 2, 0, 0.0F, 4, null);
/*     */         Placeable.PlacementScope.placeRelative$default($this$layout, $secondPlaceable, $adjustedFirstSize + $dividerWidth, 0, 0.0F, 4, null);
/*     */         return Unit.INSTANCE;
/*     */       case 2:
/*     */         Placeable.PlacementScope.placeRelative$default($this$layout, $firstPlaceable, 0, 0, 0.0F, 4, null);
/*     */         Placeable.PlacementScope.placeRelative$default($this$layout, $dividerPlaceable, 0, $adjustedFirstSize, 0.0F, 4, null);
/*     */         Placeable.PlacementScope.placeRelative$default($this$layout, $dividerHandlePlaceable, 0, $adjustedFirstSize - $handleWidth / 2, 0.0F, 4, null);
/*     */         Placeable.PlacementScope.placeRelative$default($this$layout, $secondPlaceable, 0, $adjustedFirstSize + $dividerWidth, 0.0F, 4, null);
/*     */         return Unit.INSTANCE;
/*     */     } 
/*     */     throw new NoWhenBranchMatchedException();
/*     */   }
/*     */   
/*     */   private static final SplitLayoutStrategy horizontalTwoPaneStrategy-0680j_4(float gapWidth) {
/*     */     return new SplitLayoutKt$horizontalTwoPaneStrategy$1(gapWidth);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000)\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000*\001\000\b\n\030\0002\0020\001J \020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH\026J\b\020\n\032\0020\013H\026¨\006\f"}, d2 = {"org/jetbrains/jewel/ui/component/SplitLayoutKt$horizontalTwoPaneStrategy$1", "Lorg/jetbrains/jewel/ui/component/SplitLayoutStrategy;", "calculateSplitResult", "Lorg/jetbrains/jewel/ui/component/SplitResult;", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "state", "Lorg/jetbrains/jewel/ui/component/SplitLayoutState;", "isHorizontal", "", "ui"})
/*     */   @SourceDebugExtension({"SMAP\nSplitLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplitLayout.kt\norg/jetbrains/jewel/ui/component/SplitLayoutKt$horizontalTwoPaneStrategy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,512:1\n1#2:513\n*E\n"})
/*     */   public static final class SplitLayoutKt$horizontalTwoPaneStrategy$1 implements SplitLayoutStrategy {
/*     */     SplitLayoutKt$horizontalTwoPaneStrategy$1(float $gapWidth) {}
/*     */     
/*     */     public SplitResult calculateSplitResult(Density density, LayoutDirection layoutDirection, SplitLayoutState state) {
/*     */       LayoutCoordinates layoutCoordinates;
/*     */       Intrinsics.checkNotNullParameter(density, "density");
/*     */       Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
/*     */       Intrinsics.checkNotNullParameter(state, "state");
/*     */       if (state.getLayoutCoordinates() == null) {
/*     */         state.getLayoutCoordinates();
/*     */         return new SplitResult(Orientation.Vertical, Rect.Companion.getZero());
/*     */       } 
/*     */       float availableWidth = RangesKt.coerceAtLeast(IntSize.getWidth-impl(layoutCoordinates.getSize-YbymL2g()), 1.0F);
/*     */       float f1 = this.$gapWidth;
/*     */       Density $this$calculateSplitResult_u24lambda_u240 = density;
/*     */       int $i$a$-with-SplitLayoutKt$horizontalTwoPaneStrategy$1$calculateSplitResult$splitWidthPixel$1 = 0;
/*     */       float splitWidthPixel = $this$calculateSplitResult_u24lambda_u240.toPx-0680j_4(f1);
/*     */       float dividerPosition = RangesKt.coerceIn(state.getDividerPosition(), 0.0F, 1.0F);
/*     */       float splitX = RangesKt.coerceIn(availableWidth * dividerPosition, 0.0F, availableWidth);
/*     */       return new SplitResult(Orientation.Vertical, new Rect(splitX - splitWidthPixel / 2.0F, 0.0F, RangesKt.coerceAtMost(splitX + splitWidthPixel / 2.0F, availableWidth), RangesKt.coerceAtLeast(IntSize.getHeight-impl(layoutCoordinates.getSize-YbymL2g()), 1.0F)));
/*     */     }
/*     */     
/*     */     public boolean isHorizontal() {
/*     */       return true;
/*     */     }
/*     */   }
/*     */   
/*     */   private static final SplitLayoutStrategy verticalTwoPaneStrategy-0680j_4(float gapHeight) {
/*     */     return new SplitLayoutKt$verticalTwoPaneStrategy$1(gapHeight);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000)\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000*\001\000\b\n\030\0002\0020\001J \020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH\026J\b\020\n\032\0020\013H\026¨\006\f"}, d2 = {"org/jetbrains/jewel/ui/component/SplitLayoutKt$verticalTwoPaneStrategy$1", "Lorg/jetbrains/jewel/ui/component/SplitLayoutStrategy;", "calculateSplitResult", "Lorg/jetbrains/jewel/ui/component/SplitResult;", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "state", "Lorg/jetbrains/jewel/ui/component/SplitLayoutState;", "isHorizontal", "", "ui"})
/*     */   @SourceDebugExtension({"SMAP\nSplitLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplitLayout.kt\norg/jetbrains/jewel/ui/component/SplitLayoutKt$verticalTwoPaneStrategy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,512:1\n1#2:513\n*E\n"})
/*     */   public static final class SplitLayoutKt$verticalTwoPaneStrategy$1 implements SplitLayoutStrategy {
/*     */     SplitLayoutKt$verticalTwoPaneStrategy$1(float $gapHeight) {}
/*     */     
/*     */     public SplitResult calculateSplitResult(Density density, LayoutDirection layoutDirection, SplitLayoutState state) {
/*     */       LayoutCoordinates layoutCoordinates;
/*     */       Intrinsics.checkNotNullParameter(density, "density");
/*     */       Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
/*     */       Intrinsics.checkNotNullParameter(state, "state");
/*     */       if (state.getLayoutCoordinates() == null) {
/*     */         state.getLayoutCoordinates();
/*     */         return new SplitResult(Orientation.Horizontal, Rect.Companion.getZero());
/*     */       } 
/*     */       float availableHeight = RangesKt.coerceAtLeast(IntSize.getHeight-impl(layoutCoordinates.getSize-YbymL2g()), 1.0F);
/*     */       float f1 = this.$gapHeight;
/*     */       Density $this$calculateSplitResult_u24lambda_u240 = density;
/*     */       int $i$a$-with-SplitLayoutKt$verticalTwoPaneStrategy$1$calculateSplitResult$splitHeightPixel$1 = 0;
/*     */       float splitHeightPixel = $this$calculateSplitResult_u24lambda_u240.toPx-0680j_4(f1);
/*     */       float dividerPosition = RangesKt.coerceIn(state.getDividerPosition(), 0.0F, 1.0F);
/*     */       float splitY = RangesKt.coerceIn(availableHeight * dividerPosition, 0.0F, availableHeight);
/*     */       return new SplitResult(Orientation.Horizontal, new Rect(0.0F, splitY - splitHeightPixel / 2.0F, RangesKt.coerceAtLeast(IntSize.getWidth-impl(layoutCoordinates.getSize-YbymL2g()), 1.0F), RangesKt.coerceAtMost(splitY + splitHeightPixel / 2.0F, availableHeight)));
/*     */     }
/*     */     
/*     */     public boolean isHorizontal() {
/*     */       return false;
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Pair<Integer, Integer> calculateAdjustedSizes(int availableSpace, int initialFirstSize, int initialSecondSize, int minFirstPaneSizePx, int minSecondPaneSizePx) {
/*     */     int totalMinSize = minFirstPaneSizePx + minSecondPaneSizePx;
/*     */     if (availableSpace <= totalMinSize) {
/*     */       float firstRatio = minFirstPaneSizePx / totalMinSize;
/*     */       int i = MathKt.roundToInt(availableSpace * firstRatio);
/*     */       int j = availableSpace - i;
/*     */       return TuplesKt.to(Integer.valueOf(i), Integer.valueOf(j));
/*     */     } 
/*     */     int adjustedFirstSize = initialFirstSize;
/*     */     int adjustedSecondSize = initialSecondSize;
/*     */     if (adjustedFirstSize < minFirstPaneSizePx) {
/*     */       adjustedFirstSize = minFirstPaneSizePx;
/*     */       adjustedSecondSize = availableSpace - adjustedFirstSize;
/*     */     } 
/*     */     if (adjustedSecondSize < minSecondPaneSizePx) {
/*     */       adjustedSecondSize = minSecondPaneSizePx;
/*     */       adjustedFirstSize = availableSpace - adjustedSecondSize;
/*     */     } 
/*     */     adjustedFirstSize = RangesKt.coerceIn(adjustedFirstSize, minFirstPaneSizePx, availableSpace - minSecondPaneSizePx);
/*     */     adjustedSecondSize = RangesKt.coerceIn(adjustedSecondSize, minSecondPaneSizePx, availableSpace - adjustedFirstSize);
/*     */     return TuplesKt.to(Integer.valueOf(adjustedFirstSize), Integer.valueOf(adjustedSecondSize));
/*     */   }
/*     */   
/*     */   private static final Unit HorizontalSplitLayout_Zv8xjqY$lambda$0(Function2<? super Composer, ? super Integer, Unit> $first, Function2<? super Composer, ? super Integer, Unit> $second, Modifier $modifier, DividerStyle $dividerStyle, float $draggableWidth, float $firstPaneMinWidth, float $secondPaneMinWidth, SplitLayoutState $state, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     HorizontalSplitLayout-Zv8xjqY($first, $second, $modifier, $dividerStyle, $draggableWidth, $firstPaneMinWidth, $secondPaneMinWidth, $state, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit VerticalSplitLayout_Zv8xjqY$lambda$1(Function2<? super Composer, ? super Integer, Unit> $first, Function2<? super Composer, ? super Integer, Unit> $second, Modifier $modifier, DividerStyle $dividerStyle, float $draggableWidth, float $firstPaneMinWidth, float $secondPaneMinWidth, SplitLayoutState $state, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     VerticalSplitLayout-Zv8xjqY($first, $second, $modifier, $dividerStyle, $draggableWidth, $firstPaneMinWidth, $secondPaneMinWidth, $state, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit SplitLayoutImpl_Zv8xjqY$lambda$24(Function2<? super Composer, ? super Integer, Unit> $first, Function2<? super Composer, ? super Integer, Unit> $second, SplitLayoutStrategy $strategy, Modifier $modifier, float $draggableWidth, float $firstPaneMinWidth, float $secondPaneMinWidth, DividerStyle $dividerStyle, SplitLayoutState $state, int $$changed, Composer $composer, int $force) {
/*     */     SplitLayoutImpl-Zv8xjqY($first, $second, $strategy, $modifier, $draggableWidth, $firstPaneMinWidth, $secondPaneMinWidth, $dividerStyle, $state, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\SplitLayoutKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */