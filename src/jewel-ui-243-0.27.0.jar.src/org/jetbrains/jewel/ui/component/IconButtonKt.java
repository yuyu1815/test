/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.interaction.Interaction;
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.focus.FocusProperties;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.component.styling.IconButtonStyle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000Z\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\032q\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0010\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\"\020\r\032\036\022\004\022\0020\017\022\004\022\0020\020\022\004\022\0020\0010\016¢\006\002\b\021¢\006\002\b\022H\007¢\006\002\020\023\032y\020\024\032\0020\0012\006\020\025\032\0020\0072\f\020\002\032\b\022\004\022\0020\0010\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\"\020\r\032\036\022\004\022\0020\017\022\004\022\0020\026\022\004\022\0020\0010\016¢\006\002\b\021¢\006\002\b\022H\007¢\006\002\020\027\032\020\030\032\0020\0012\006\020\031\032\0020\0072\022\020\032\032\016\022\004\022\0020\007\022\004\022\0020\0010\0332\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\"\020\r\032\036\022\004\022\0020\017\022\004\022\0020\034\022\004\022\0020\0010\016¢\006\002\b\021¢\006\002\b\022H\007¢\006\002\020\035¨\006\036²\006\n\020\037\032\0020\020X\002²\006\n\020 \032\0020!X\002²\006\n\020\"\032\0020!X\002²\006\n\020\037\032\0020\026X\002²\006\n\020 \032\0020!X\002²\006\n\020\"\032\0020!X\002²\006\n\020\037\032\0020\034X\002²\006\n\020 \032\0020!X\002²\006\n\020\"\032\0020!X\002"}, d2 = {"IconButton", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "focusable", "style", "Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Lkotlin/Function2;", "Landroidx/compose/foundation/layout/BoxScope;", "Lorg/jetbrains/jewel/ui/component/IconButtonState;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "SelectableIconButton", "selected", "Lorg/jetbrains/jewel/ui/component/SelectableIconButtonState;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "ToggleableIconButton", "value", "onValueChange", "Lkotlin/Function1;", "Lorg/jetbrains/jewel/ui/component/ToggleableIconButtonState;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "ui", "buttonState", "background", "Landroidx/compose/ui/graphics/Color;", "border"})
/*     */ @SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\norg/jetbrains/jewel/ui/component/IconButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 ModifierExtensions.kt\norg/jetbrains/jewel/ui/util/ModifierExtensionsKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,388:1\n1225#2,6:389\n1225#2,6:395\n1225#2,6:401\n1225#2,6:407\n1225#2,6:414\n1225#2,6:459\n1225#2,6:465\n1225#2,6:471\n1225#2,6:477\n1225#2,6:484\n1225#2,6:490\n1225#2,6:535\n1225#2,6:541\n1225#2,6:547\n1225#2,6:553\n1225#2,6:560\n1225#2,6:566\n10#3:413\n10#3:483\n10#3:559\n71#4:420\n69#4,5:421\n74#4:454\n78#4:458\n71#4:496\n69#4,5:497\n74#4:530\n78#4:534\n71#4:572\n69#4,5:573\n74#4:606\n78#4:610\n79#5,6:426\n86#5,4:441\n90#5,2:451\n94#5:457\n79#5,6:502\n86#5,4:517\n90#5,2:527\n94#5:533\n79#5,6:578\n86#5,4:593\n90#5,2:603\n94#5:609\n368#6,9:432\n377#6:453\n378#6,2:455\n368#6,9:508\n377#6:529\n378#6,2:531\n368#6,9:584\n377#6:605\n378#6,2:607\n4034#7,6:445\n4034#7,6:521\n4034#7,6:597\n81#8:611\n107#8,2:612\n81#8:614\n81#8:615\n81#8:616\n107#8,2:617\n81#8:619\n81#8:620\n81#8:621\n107#8,2:622\n81#8:624\n81#8:625\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\norg/jetbrains/jewel/ui/component/IconButtonKt\n*L\n53#1:389,6\n56#1:395,6\n58#1:401,6\n60#1:407,6\n81#1:414,6\n107#1:459,6\n110#1:465,6\n112#1:471,6\n114#1:477,6\n135#1:484,6\n145#1:490,6\n163#1:535,6\n166#1:541,6\n168#1:547,6\n172#1:553,6\n193#1:560,6\n203#1:566,6\n81#1:413\n135#1:483\n193#1:559\n79#1:420\n79#1:421,5\n79#1:454\n79#1:458\n133#1:496\n133#1:497,5\n133#1:530\n133#1:534\n191#1:572\n191#1:573,5\n191#1:606\n191#1:610\n79#1:426,6\n79#1:441,4\n79#1:451,2\n79#1:457\n133#1:502,6\n133#1:517,4\n133#1:527,2\n133#1:533\n191#1:578,6\n191#1:593,4\n191#1:603,2\n191#1:609\n79#1:432,9\n79#1:453\n79#1:455,2\n133#1:508,9\n133#1:529\n133#1:531,2\n191#1:584,9\n191#1:605\n191#1:607,2\n79#1:445,6\n133#1:521,6\n191#1:597,6\n56#1:611\n56#1:612,2\n76#1:614\n77#1:615\n110#1:616\n110#1:617,2\n130#1:619\n131#1:620\n166#1:621\n166#1:622,2\n188#1:624\n189#1:625\n*E\n"})
/*     */ public final class IconButtonKt
/*     */ {
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public static final void IconButton(@NotNull Function0 onClick, @Nullable Modifier modifier, boolean enabled, boolean focusable, @Nullable IconButtonStyle style, @Nullable MutableInteractionSource interactionSource, @NotNull Function4 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'onClick'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #6
/*     */     //   8: ldc 'content'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload #7
/*     */     //   15: ldc 2068369167
/*     */     //   17: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   22: astore #7
/*     */     //   24: iload #8
/*     */     //   26: istore #10
/*     */     //   28: iload #9
/*     */     //   30: iconst_1
/*     */     //   31: iand
/*     */     //   32: ifeq -> 45
/*     */     //   35: iload #10
/*     */     //   37: bipush #6
/*     */     //   39: ior
/*     */     //   40: istore #10
/*     */     //   42: goto -> 74
/*     */     //   45: iload #8
/*     */     //   47: bipush #6
/*     */     //   49: iand
/*     */     //   50: ifne -> 74
/*     */     //   53: iload #10
/*     */     //   55: aload #7
/*     */     //   57: aload_0
/*     */     //   58: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   63: ifeq -> 70
/*     */     //   66: iconst_4
/*     */     //   67: goto -> 71
/*     */     //   70: iconst_2
/*     */     //   71: ior
/*     */     //   72: istore #10
/*     */     //   74: iload #9
/*     */     //   76: iconst_2
/*     */     //   77: iand
/*     */     //   78: ifeq -> 91
/*     */     //   81: iload #10
/*     */     //   83: bipush #48
/*     */     //   85: ior
/*     */     //   86: istore #10
/*     */     //   88: goto -> 122
/*     */     //   91: iload #8
/*     */     //   93: bipush #48
/*     */     //   95: iand
/*     */     //   96: ifne -> 122
/*     */     //   99: iload #10
/*     */     //   101: aload #7
/*     */     //   103: aload_1
/*     */     //   104: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   109: ifeq -> 117
/*     */     //   112: bipush #32
/*     */     //   114: goto -> 119
/*     */     //   117: bipush #16
/*     */     //   119: ior
/*     */     //   120: istore #10
/*     */     //   122: iload #9
/*     */     //   124: iconst_4
/*     */     //   125: iand
/*     */     //   126: ifeq -> 140
/*     */     //   129: iload #10
/*     */     //   131: sipush #384
/*     */     //   134: ior
/*     */     //   135: istore #10
/*     */     //   137: goto -> 174
/*     */     //   140: iload #8
/*     */     //   142: sipush #384
/*     */     //   145: iand
/*     */     //   146: ifne -> 174
/*     */     //   149: iload #10
/*     */     //   151: aload #7
/*     */     //   153: iload_2
/*     */     //   154: invokeinterface changed : (Z)Z
/*     */     //   159: ifeq -> 168
/*     */     //   162: sipush #256
/*     */     //   165: goto -> 171
/*     */     //   168: sipush #128
/*     */     //   171: ior
/*     */     //   172: istore #10
/*     */     //   174: iload #9
/*     */     //   176: bipush #8
/*     */     //   178: iand
/*     */     //   179: ifeq -> 193
/*     */     //   182: iload #10
/*     */     //   184: sipush #3072
/*     */     //   187: ior
/*     */     //   188: istore #10
/*     */     //   190: goto -> 227
/*     */     //   193: iload #8
/*     */     //   195: sipush #3072
/*     */     //   198: iand
/*     */     //   199: ifne -> 227
/*     */     //   202: iload #10
/*     */     //   204: aload #7
/*     */     //   206: iload_3
/*     */     //   207: invokeinterface changed : (Z)Z
/*     */     //   212: ifeq -> 221
/*     */     //   215: sipush #2048
/*     */     //   218: goto -> 224
/*     */     //   221: sipush #1024
/*     */     //   224: ior
/*     */     //   225: istore #10
/*     */     //   227: iload #8
/*     */     //   229: sipush #24576
/*     */     //   232: iand
/*     */     //   233: ifne -> 270
/*     */     //   236: iload #10
/*     */     //   238: iload #9
/*     */     //   240: bipush #16
/*     */     //   242: iand
/*     */     //   243: ifne -> 264
/*     */     //   246: aload #7
/*     */     //   248: aload #4
/*     */     //   250: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   255: ifeq -> 264
/*     */     //   258: sipush #16384
/*     */     //   261: goto -> 267
/*     */     //   264: sipush #8192
/*     */     //   267: ior
/*     */     //   268: istore #10
/*     */     //   270: iload #9
/*     */     //   272: bipush #32
/*     */     //   274: iand
/*     */     //   275: ifeq -> 288
/*     */     //   278: iload #10
/*     */     //   280: ldc 196608
/*     */     //   282: ior
/*     */     //   283: istore #10
/*     */     //   285: goto -> 320
/*     */     //   288: iload #8
/*     */     //   290: ldc 196608
/*     */     //   292: iand
/*     */     //   293: ifne -> 320
/*     */     //   296: iload #10
/*     */     //   298: aload #7
/*     */     //   300: aload #5
/*     */     //   302: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   307: ifeq -> 315
/*     */     //   310: ldc 131072
/*     */     //   312: goto -> 317
/*     */     //   315: ldc 65536
/*     */     //   317: ior
/*     */     //   318: istore #10
/*     */     //   320: iload #9
/*     */     //   322: bipush #64
/*     */     //   324: iand
/*     */     //   325: ifeq -> 338
/*     */     //   328: iload #10
/*     */     //   330: ldc 1572864
/*     */     //   332: ior
/*     */     //   333: istore #10
/*     */     //   335: goto -> 370
/*     */     //   338: iload #8
/*     */     //   340: ldc 1572864
/*     */     //   342: iand
/*     */     //   343: ifne -> 370
/*     */     //   346: iload #10
/*     */     //   348: aload #7
/*     */     //   350: aload #6
/*     */     //   352: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   357: ifeq -> 365
/*     */     //   360: ldc 1048576
/*     */     //   362: goto -> 367
/*     */     //   365: ldc 524288
/*     */     //   367: ior
/*     */     //   368: istore #10
/*     */     //   370: iload #10
/*     */     //   372: ldc 599187
/*     */     //   374: iand
/*     */     //   375: ldc 599186
/*     */     //   377: if_icmpne -> 390
/*     */     //   380: aload #7
/*     */     //   382: invokeinterface getSkipping : ()Z
/*     */     //   387: ifne -> 1770
/*     */     //   390: aload #7
/*     */     //   392: invokeinterface startDefaults : ()V
/*     */     //   397: iload #8
/*     */     //   399: iconst_1
/*     */     //   400: iand
/*     */     //   401: ifeq -> 414
/*     */     //   404: aload #7
/*     */     //   406: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   411: ifeq -> 570
/*     */     //   414: iload #9
/*     */     //   416: iconst_2
/*     */     //   417: iand
/*     */     //   418: ifeq -> 428
/*     */     //   421: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   424: checkcast androidx/compose/ui/Modifier
/*     */     //   427: astore_1
/*     */     //   428: iload #9
/*     */     //   430: iconst_4
/*     */     //   431: iand
/*     */     //   432: ifeq -> 437
/*     */     //   435: iconst_1
/*     */     //   436: istore_2
/*     */     //   437: iload #9
/*     */     //   439: bipush #8
/*     */     //   441: iand
/*     */     //   442: ifeq -> 447
/*     */     //   445: iconst_1
/*     */     //   446: istore_3
/*     */     //   447: iload #9
/*     */     //   449: bipush #16
/*     */     //   451: iand
/*     */     //   452: ifeq -> 474
/*     */     //   455: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   458: aload #7
/*     */     //   460: bipush #6
/*     */     //   462: invokestatic getIconButtonStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   465: astore #4
/*     */     //   467: iload #10
/*     */     //   469: ldc -57345
/*     */     //   471: iand
/*     */     //   472: istore #10
/*     */     //   474: iload #9
/*     */     //   476: bipush #32
/*     */     //   478: iand
/*     */     //   479: ifeq -> 592
/*     */     //   482: aload #7
/*     */     //   484: ldc 1313102928
/*     */     //   486: invokeinterface startReplaceGroup : (I)V
/*     */     //   491: aload #7
/*     */     //   493: astore #12
/*     */     //   495: iconst_0
/*     */     //   496: istore #13
/*     */     //   498: iconst_0
/*     */     //   499: istore #14
/*     */     //   501: aload #12
/*     */     //   503: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   508: astore #15
/*     */     //   510: iconst_0
/*     */     //   511: istore #16
/*     */     //   513: aload #15
/*     */     //   515: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   518: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   521: if_acmpne -> 546
/*     */     //   524: iconst_0
/*     */     //   525: istore #17
/*     */     //   527: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   530: astore #17
/*     */     //   532: aload #12
/*     */     //   534: aload #17
/*     */     //   536: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   541: aload #17
/*     */     //   543: goto -> 548
/*     */     //   546: aload #15
/*     */     //   548: nop
/*     */     //   549: nop
/*     */     //   550: nop
/*     */     //   551: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   554: astore #11
/*     */     //   556: aload #7
/*     */     //   558: invokeinterface endReplaceGroup : ()V
/*     */     //   563: aload #11
/*     */     //   565: astore #5
/*     */     //   567: goto -> 592
/*     */     //   570: aload #7
/*     */     //   572: invokeinterface skipToGroupEnd : ()V
/*     */     //   577: iload #9
/*     */     //   579: bipush #16
/*     */     //   581: iand
/*     */     //   582: ifeq -> 592
/*     */     //   585: iload #10
/*     */     //   587: ldc -57345
/*     */     //   589: iand
/*     */     //   590: istore #10
/*     */     //   592: aload #7
/*     */     //   594: invokeinterface endDefaults : ()V
/*     */     //   599: invokestatic isTraceInProgress : ()Z
/*     */     //   602: ifeq -> 615
/*     */     //   605: ldc 2068369167
/*     */     //   607: iload #10
/*     */     //   609: iconst_m1
/*     */     //   610: ldc 'org.jetbrains.jewel.ui.component.IconButton (IconButton.kt:54)'
/*     */     //   612: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   615: aload #7
/*     */     //   617: ldc 1313107166
/*     */     //   619: invokeinterface startReplaceGroup : (I)V
/*     */     //   624: aload #7
/*     */     //   626: astore #13
/*     */     //   628: iload #10
/*     */     //   630: ldc 458752
/*     */     //   632: iand
/*     */     //   633: ldc 131072
/*     */     //   635: if_icmpne -> 642
/*     */     //   638: iconst_1
/*     */     //   639: goto -> 643
/*     */     //   642: iconst_0
/*     */     //   643: istore #14
/*     */     //   645: nop
/*     */     //   646: iconst_0
/*     */     //   647: istore #15
/*     */     //   649: aload #13
/*     */     //   651: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   656: astore #16
/*     */     //   658: iconst_0
/*     */     //   659: istore #17
/*     */     //   661: iload #14
/*     */     //   663: ifne -> 677
/*     */     //   666: aload #16
/*     */     //   668: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   671: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   674: if_acmpne -> 719
/*     */     //   677: iconst_0
/*     */     //   678: istore #18
/*     */     //   680: getstatic org/jetbrains/jewel/ui/component/IconButtonState.Companion : Lorg/jetbrains/jewel/ui/component/IconButtonState$Companion;
/*     */     //   683: iload_2
/*     */     //   684: iconst_0
/*     */     //   685: iconst_0
/*     */     //   686: iconst_0
/*     */     //   687: iconst_0
/*     */     //   688: bipush #30
/*     */     //   690: aconst_null
/*     */     //   691: invokestatic of-3OtLUoY$default : (Lorg/jetbrains/jewel/ui/component/IconButtonState$Companion;ZZZZZILjava/lang/Object;)J
/*     */     //   694: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/IconButtonState;
/*     */     //   697: aconst_null
/*     */     //   698: iconst_2
/*     */     //   699: aconst_null
/*     */     //   700: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   703: astore #19
/*     */     //   705: aload #13
/*     */     //   707: aload #19
/*     */     //   709: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   714: aload #19
/*     */     //   716: goto -> 721
/*     */     //   719: aload #16
/*     */     //   721: nop
/*     */     //   722: nop
/*     */     //   723: nop
/*     */     //   724: checkcast androidx/compose/runtime/MutableState
/*     */     //   727: astore #12
/*     */     //   729: aload #7
/*     */     //   731: invokeinterface endReplaceGroup : ()V
/*     */     //   736: aload #12
/*     */     //   738: astore #11
/*     */     //   740: aload #7
/*     */     //   742: ldc 1313110064
/*     */     //   744: invokeinterface startReplaceGroup : (I)V
/*     */     //   749: aload #7
/*     */     //   751: astore #12
/*     */     //   753: iload #10
/*     */     //   755: sipush #896
/*     */     //   758: iand
/*     */     //   759: sipush #256
/*     */     //   762: if_icmpne -> 769
/*     */     //   765: iconst_1
/*     */     //   766: goto -> 770
/*     */     //   769: iconst_0
/*     */     //   770: istore #13
/*     */     //   772: nop
/*     */     //   773: iconst_0
/*     */     //   774: istore #14
/*     */     //   776: aload #12
/*     */     //   778: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   783: astore #15
/*     */     //   785: iconst_0
/*     */     //   786: istore #16
/*     */     //   788: iload #13
/*     */     //   790: ifne -> 804
/*     */     //   793: aload #15
/*     */     //   795: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   798: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   801: if_acmpne -> 846
/*     */     //   804: iconst_0
/*     */     //   805: istore #17
/*     */     //   807: aload #11
/*     */     //   809: aload #11
/*     */     //   811: invokestatic IconButton$lambda$2 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   814: iload_2
/*     */     //   815: iconst_0
/*     */     //   816: iconst_0
/*     */     //   817: iconst_0
/*     */     //   818: iconst_0
/*     */     //   819: bipush #30
/*     */     //   821: aconst_null
/*     */     //   822: invokestatic copy-3OtLUoY$default : (JZZZZZILjava/lang/Object;)J
/*     */     //   825: invokestatic IconButton$lambda$3 : (Landroidx/compose/runtime/MutableState;J)V
/*     */     //   828: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   831: astore #18
/*     */     //   833: aload #12
/*     */     //   835: aload #18
/*     */     //   837: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   842: nop
/*     */     //   843: goto -> 847
/*     */     //   846: nop
/*     */     //   847: nop
/*     */     //   848: nop
/*     */     //   849: nop
/*     */     //   850: aload #7
/*     */     //   852: invokeinterface endReplaceGroup : ()V
/*     */     //   857: aload #5
/*     */     //   859: aload #7
/*     */     //   861: ldc 1313114505
/*     */     //   863: invokeinterface startReplaceGroup : (I)V
/*     */     //   868: aload #7
/*     */     //   870: astore #13
/*     */     //   872: iload #10
/*     */     //   874: ldc 458752
/*     */     //   876: iand
/*     */     //   877: ldc 131072
/*     */     //   879: if_icmpne -> 886
/*     */     //   882: iconst_1
/*     */     //   883: goto -> 887
/*     */     //   886: iconst_0
/*     */     //   887: aload #7
/*     */     //   889: aload #11
/*     */     //   891: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   896: ior
/*     */     //   897: iload #10
/*     */     //   899: sipush #7168
/*     */     //   902: iand
/*     */     //   903: sipush #2048
/*     */     //   906: if_icmpne -> 913
/*     */     //   909: iconst_1
/*     */     //   910: goto -> 914
/*     */     //   913: iconst_0
/*     */     //   914: ior
/*     */     //   915: istore #14
/*     */     //   917: iconst_0
/*     */     //   918: istore #15
/*     */     //   920: aload #13
/*     */     //   922: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   927: astore #16
/*     */     //   929: iconst_0
/*     */     //   930: istore #17
/*     */     //   932: iload #14
/*     */     //   934: ifne -> 948
/*     */     //   937: aload #16
/*     */     //   939: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   942: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   945: if_acmpne -> 988
/*     */     //   948: astore #42
/*     */     //   950: iconst_0
/*     */     //   951: istore #18
/*     */     //   953: new org/jetbrains/jewel/ui/component/IconButtonKt$IconButton$3$1
/*     */     //   956: dup
/*     */     //   957: aload #5
/*     */     //   959: iload_3
/*     */     //   960: aload #11
/*     */     //   962: aconst_null
/*     */     //   963: invokespecial <init> : (Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLandroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*     */     //   966: checkcast kotlin/jvm/functions/Function2
/*     */     //   969: aload #42
/*     */     //   971: swap
/*     */     //   972: astore #19
/*     */     //   974: aload #13
/*     */     //   976: aload #19
/*     */     //   978: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   983: aload #19
/*     */     //   985: goto -> 990
/*     */     //   988: aload #16
/*     */     //   990: nop
/*     */     //   991: nop
/*     */     //   992: nop
/*     */     //   993: checkcast kotlin/jvm/functions/Function2
/*     */     //   996: astore #12
/*     */     //   998: aload #7
/*     */     //   1000: invokeinterface endReplaceGroup : ()V
/*     */     //   1005: aload #12
/*     */     //   1007: aload #7
/*     */     //   1009: bipush #14
/*     */     //   1011: iload #10
/*     */     //   1013: bipush #15
/*     */     //   1015: ishr
/*     */     //   1016: iand
/*     */     //   1017: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1020: aload #4
/*     */     //   1022: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/IconButtonMetrics;
/*     */     //   1025: invokevirtual getCornerSize : ()Landroidx/compose/foundation/shape/CornerSize;
/*     */     //   1028: invokestatic RoundedCornerShape : (Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   1031: astore #12
/*     */     //   1033: aload #4
/*     */     //   1035: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/IconButtonColors;
/*     */     //   1038: aload #11
/*     */     //   1040: invokestatic IconButton$lambda$2 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1043: aload #7
/*     */     //   1045: iconst_0
/*     */     //   1046: invokevirtual backgroundFor-e04Q3fE : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1049: astore #13
/*     */     //   1051: aload #4
/*     */     //   1053: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/IconButtonColors;
/*     */     //   1056: aload #11
/*     */     //   1058: invokestatic IconButton$lambda$2 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1061: aload #7
/*     */     //   1063: iconst_0
/*     */     //   1064: invokevirtual borderFor-e04Q3fE : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1067: astore #14
/*     */     //   1069: aload #7
/*     */     //   1071: ldc 1313144708
/*     */     //   1073: invokeinterface startReplaceGroup : (I)V
/*     */     //   1078: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1081: checkcast androidx/compose/ui/Modifier
/*     */     //   1084: astore #17
/*     */     //   1086: iload_3
/*     */     //   1087: ifne -> 1094
/*     */     //   1090: iconst_1
/*     */     //   1091: goto -> 1095
/*     */     //   1094: iconst_0
/*     */     //   1095: istore #18
/*     */     //   1097: iconst_0
/*     */     //   1098: istore #19
/*     */     //   1100: iload #18
/*     */     //   1102: ifeq -> 1210
/*     */     //   1105: aload #17
/*     */     //   1107: astore #20
/*     */     //   1109: iconst_0
/*     */     //   1110: istore #21
/*     */     //   1112: aload #20
/*     */     //   1114: aload #7
/*     */     //   1116: ldc -190545796
/*     */     //   1118: invokeinterface startReplaceGroup : (I)V
/*     */     //   1123: aload #7
/*     */     //   1125: astore #22
/*     */     //   1127: iconst_0
/*     */     //   1128: istore #23
/*     */     //   1130: iconst_0
/*     */     //   1131: istore #24
/*     */     //   1133: aload #22
/*     */     //   1135: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1140: astore #25
/*     */     //   1142: iconst_0
/*     */     //   1143: istore #26
/*     */     //   1145: aload #25
/*     */     //   1147: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1150: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1153: if_acmpne -> 1185
/*     */     //   1156: astore #27
/*     */     //   1158: iconst_0
/*     */     //   1159: istore #28
/*     */     //   1161: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   1166: aload #27
/*     */     //   1168: swap
/*     */     //   1169: astore #28
/*     */     //   1171: aload #22
/*     */     //   1173: aload #28
/*     */     //   1175: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1180: aload #28
/*     */     //   1182: goto -> 1187
/*     */     //   1185: aload #25
/*     */     //   1187: nop
/*     */     //   1188: nop
/*     */     //   1189: nop
/*     */     //   1190: checkcast kotlin/jvm/functions/Function1
/*     */     //   1193: astore #29
/*     */     //   1195: aload #7
/*     */     //   1197: invokeinterface endReplaceGroup : ()V
/*     */     //   1202: aload #29
/*     */     //   1204: invokestatic focusProperties : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   1207: goto -> 1212
/*     */     //   1210: aload #17
/*     */     //   1212: astore #16
/*     */     //   1214: aload #7
/*     */     //   1216: invokeinterface endReplaceGroup : ()V
/*     */     //   1221: aload #16
/*     */     //   1223: aload_1
/*     */     //   1224: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1229: astore #15
/*     */     //   1231: getstatic androidx/compose/ui/semantics/Role.Companion : Landroidx/compose/ui/semantics/Role$Companion;
/*     */     //   1234: invokevirtual getButton-o7Vup1c : ()I
/*     */     //   1237: istore #16
/*     */     //   1239: aload #15
/*     */     //   1241: aload #5
/*     */     //   1243: aconst_null
/*     */     //   1244: iload_2
/*     */     //   1245: aconst_null
/*     */     //   1246: iload #16
/*     */     //   1248: invokestatic box-impl : (I)Landroidx/compose/ui/semantics/Role;
/*     */     //   1251: aload_0
/*     */     //   1252: bipush #8
/*     */     //   1254: aconst_null
/*     */     //   1255: invokestatic clickable-O2vRcR0$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1258: aload #4
/*     */     //   1260: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/IconButtonMetrics;
/*     */     //   1263: invokevirtual getMinSize-MYxV2XQ : ()J
/*     */     //   1266: invokestatic getWidth-D9Ej5fM : (J)F
/*     */     //   1269: aload #4
/*     */     //   1271: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/IconButtonMetrics;
/*     */     //   1274: invokevirtual getMinSize-MYxV2XQ : ()J
/*     */     //   1277: invokestatic getHeight-D9Ej5fM : (J)F
/*     */     //   1280: invokestatic defaultMinSize-VpY3zN4 : (Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;
/*     */     //   1283: aload #4
/*     */     //   1285: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/IconButtonMetrics;
/*     */     //   1288: invokevirtual getPadding : ()Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   1291: invokestatic padding : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;
/*     */     //   1294: aload #13
/*     */     //   1296: invokestatic IconButton$lambda$6 : (Landroidx/compose/runtime/State;)J
/*     */     //   1299: aload #12
/*     */     //   1301: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   1304: invokestatic background-bw27NRU : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*     */     //   1307: aload #4
/*     */     //   1309: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/IconButtonMetrics;
/*     */     //   1312: invokevirtual getBorderWidth-D9Ej5fM : ()F
/*     */     //   1315: aload #14
/*     */     //   1317: invokestatic IconButton$lambda$7 : (Landroidx/compose/runtime/State;)J
/*     */     //   1320: aload #12
/*     */     //   1322: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   1325: invokestatic border-xT4_qwU : (Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*     */     //   1328: astore #15
/*     */     //   1330: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1333: invokevirtual getCenter : ()Landroidx/compose/ui/Alignment;
/*     */     //   1336: astore #16
/*     */     //   1338: bipush #48
/*     */     //   1340: istore #18
/*     */     //   1342: nop
/*     */     //   1343: iconst_0
/*     */     //   1344: istore #19
/*     */     //   1346: aload #7
/*     */     //   1348: ldc_w 733328855
/*     */     //   1351: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   1354: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1357: iconst_0
/*     */     //   1358: istore #17
/*     */     //   1360: aload #16
/*     */     //   1362: iload #17
/*     */     //   1364: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1367: astore #20
/*     */     //   1369: bipush #112
/*     */     //   1371: iload #18
/*     */     //   1373: iconst_3
/*     */     //   1374: ishl
/*     */     //   1375: iand
/*     */     //   1376: istore #21
/*     */     //   1378: nop
/*     */     //   1379: iconst_0
/*     */     //   1380: istore #22
/*     */     //   1382: aload #7
/*     */     //   1384: ldc_w -1323940314
/*     */     //   1387: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1390: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1393: aload #7
/*     */     //   1395: iconst_0
/*     */     //   1396: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1399: istore #23
/*     */     //   1401: aload #7
/*     */     //   1403: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1408: astore #24
/*     */     //   1410: aload #7
/*     */     //   1412: aload #15
/*     */     //   1414: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1417: astore #25
/*     */     //   1419: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1422: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1425: astore #26
/*     */     //   1427: bipush #6
/*     */     //   1429: sipush #896
/*     */     //   1432: iload #21
/*     */     //   1434: bipush #6
/*     */     //   1436: ishl
/*     */     //   1437: iand
/*     */     //   1438: ior
/*     */     //   1439: istore #27
/*     */     //   1441: nop
/*     */     //   1442: iconst_0
/*     */     //   1443: istore #28
/*     */     //   1445: aload #7
/*     */     //   1447: ldc_w -692256719
/*     */     //   1450: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1453: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1456: aload #7
/*     */     //   1458: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1463: instanceof androidx/compose/runtime/Applier
/*     */     //   1466: ifne -> 1472
/*     */     //   1469: invokestatic invalidApplier : ()V
/*     */     //   1472: aload #7
/*     */     //   1474: invokeinterface startReusableNode : ()V
/*     */     //   1479: aload #7
/*     */     //   1481: invokeinterface getInserting : ()Z
/*     */     //   1486: ifeq -> 1501
/*     */     //   1489: aload #7
/*     */     //   1491: aload #26
/*     */     //   1493: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1498: goto -> 1508
/*     */     //   1501: aload #7
/*     */     //   1503: invokeinterface useNode : ()V
/*     */     //   1508: aload #7
/*     */     //   1510: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1513: astore #29
/*     */     //   1515: iconst_0
/*     */     //   1516: istore #30
/*     */     //   1518: aload #29
/*     */     //   1520: aload #20
/*     */     //   1522: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1525: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1528: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1531: aload #29
/*     */     //   1533: aload #24
/*     */     //   1535: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1538: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1541: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1544: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1547: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1550: astore #31
/*     */     //   1552: iconst_0
/*     */     //   1553: istore #32
/*     */     //   1555: aload #29
/*     */     //   1557: astore #33
/*     */     //   1559: iconst_0
/*     */     //   1560: istore #34
/*     */     //   1562: aload #33
/*     */     //   1564: invokeinterface getInserting : ()Z
/*     */     //   1569: ifne -> 1590
/*     */     //   1572: aload #33
/*     */     //   1574: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1579: iload #23
/*     */     //   1581: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1584: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1587: ifne -> 1616
/*     */     //   1590: aload #33
/*     */     //   1592: iload #23
/*     */     //   1594: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1597: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1602: aload #29
/*     */     //   1604: iload #23
/*     */     //   1606: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1609: aload #31
/*     */     //   1611: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1616: nop
/*     */     //   1617: nop
/*     */     //   1618: nop
/*     */     //   1619: aload #29
/*     */     //   1621: aload #25
/*     */     //   1623: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1626: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1629: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1632: nop
/*     */     //   1633: nop
/*     */     //   1634: aload #7
/*     */     //   1636: bipush #14
/*     */     //   1638: iload #27
/*     */     //   1640: bipush #6
/*     */     //   1642: ishr
/*     */     //   1643: iand
/*     */     //   1644: istore #35
/*     */     //   1646: astore #36
/*     */     //   1648: iconst_0
/*     */     //   1649: istore #37
/*     */     //   1651: aload #36
/*     */     //   1653: ldc_w -2146769399
/*     */     //   1656: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   1659: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1662: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   1665: aload #36
/*     */     //   1667: bipush #6
/*     */     //   1669: bipush #112
/*     */     //   1671: iload #18
/*     */     //   1673: bipush #6
/*     */     //   1675: ishr
/*     */     //   1676: iand
/*     */     //   1677: ior
/*     */     //   1678: istore #38
/*     */     //   1680: astore #39
/*     */     //   1682: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   1685: astore #40
/*     */     //   1687: iconst_0
/*     */     //   1688: istore #41
/*     */     //   1690: aload #6
/*     */     //   1692: aload #40
/*     */     //   1694: aload #11
/*     */     //   1696: invokestatic IconButton$lambda$2 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1699: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/IconButtonState;
/*     */     //   1702: aload #39
/*     */     //   1704: bipush #14
/*     */     //   1706: iload #38
/*     */     //   1708: iand
/*     */     //   1709: sipush #896
/*     */     //   1712: iload #10
/*     */     //   1714: bipush #12
/*     */     //   1716: ishr
/*     */     //   1717: iand
/*     */     //   1718: ior
/*     */     //   1719: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1722: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1727: pop
/*     */     //   1728: aload #36
/*     */     //   1730: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1733: aload #7
/*     */     //   1735: invokeinterface endNode : ()V
/*     */     //   1740: aload #7
/*     */     //   1742: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1745: nop
/*     */     //   1746: aload #7
/*     */     //   1748: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1751: nop
/*     */     //   1752: aload #7
/*     */     //   1754: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1757: nop
/*     */     //   1758: invokestatic isTraceInProgress : ()Z
/*     */     //   1761: ifeq -> 1777
/*     */     //   1764: invokestatic traceEventEnd : ()V
/*     */     //   1767: goto -> 1777
/*     */     //   1770: aload #7
/*     */     //   1772: invokeinterface skipToGroupEnd : ()V
/*     */     //   1777: aload #7
/*     */     //   1779: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1784: dup
/*     */     //   1785: ifnull -> 1815
/*     */     //   1788: aload_0
/*     */     //   1789: aload_1
/*     */     //   1790: iload_2
/*     */     //   1791: iload_3
/*     */     //   1792: aload #4
/*     */     //   1794: aload #5
/*     */     //   1796: aload #6
/*     */     //   1798: iload #8
/*     */     //   1800: iload #9
/*     */     //   1802: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function4;II)Lkotlin/jvm/functions/Function2;
/*     */     //   1807: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1812: goto -> 1816
/*     */     //   1815: pop
/*     */     //   1816: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #55	-> 13
/*     */     //   #49	-> 421
/*     */     //   #50	-> 435
/*     */     //   #51	-> 445
/*     */     //   #52	-> 455
/*     */     //   #53	-> 482
/*     */     //   #389	-> 501
/*     */     //   #390	-> 513
/*     */     //   #391	-> 524
/*     */     //   #53	-> 527
/*     */     //   #391	-> 530
/*     */     //   #392	-> 532
/*     */     //   #393	-> 541
/*     */     //   #394	-> 546
/*     */     //   #390	-> 548
/*     */     //   #389	-> 549
/*     */     //   #389	-> 550
/*     */     //   #53	-> 551
/*     */     //   #55	-> 612
/*     */     //   #56	-> 645
/*     */     //   #395	-> 649
/*     */     //   #396	-> 661
/*     */     //   #397	-> 677
/*     */     //   #56	-> 680
/*     */     //   #397	-> 703
/*     */     //   #398	-> 705
/*     */     //   #399	-> 714
/*     */     //   #400	-> 719
/*     */     //   #396	-> 721
/*     */     //   #395	-> 722
/*     */     //   #395	-> 723
/*     */     //   #56	-> 724
/*     */     //   #58	-> 772
/*     */     //   #401	-> 776
/*     */     //   #402	-> 788
/*     */     //   #403	-> 804
/*     */     //   #58	-> 807
/*     */     //   #403	-> 831
/*     */     //   #404	-> 833
/*     */     //   #405	-> 842
/*     */     //   #406	-> 846
/*     */     //   #402	-> 847
/*     */     //   #401	-> 848
/*     */     //   #401	-> 849
/*     */     //   #60	-> 857
/*     */     //   #407	-> 920
/*     */     //   #408	-> 932
/*     */     //   #409	-> 948
/*     */     //   #60	-> 953
/*     */     //   #409	-> 972
/*     */     //   #410	-> 974
/*     */     //   #411	-> 983
/*     */     //   #412	-> 988
/*     */     //   #408	-> 990
/*     */     //   #407	-> 991
/*     */     //   #407	-> 992
/*     */     //   #60	-> 993
/*     */     //   #75	-> 1020
/*     */     //   #76	-> 1033
/*     */     //   #77	-> 1051
/*     */     //   #81	-> 1078
/*     */     //   #413	-> 1100
/*     */     //   #81	-> 1112
/*     */     //   #414	-> 1133
/*     */     //   #415	-> 1145
/*     */     //   #416	-> 1156
/*     */     //   #416	-> 1169
/*     */     //   #417	-> 1171
/*     */     //   #418	-> 1180
/*     */     //   #419	-> 1185
/*     */     //   #415	-> 1187
/*     */     //   #414	-> 1188
/*     */     //   #414	-> 1189
/*     */     //   #81	-> 1190
/*     */     //   #413	-> 1207
/*     */     //   #81	-> 1212
/*     */     //   #82	-> 1223
/*     */     //   #86	-> 1231
/*     */     //   #82	-> 1239
/*     */     //   #87	-> 1241
/*     */     //   #88	-> 1243
/*     */     //   #85	-> 1244
/*     */     //   #83	-> 1245
/*     */     //   #86	-> 1246
/*     */     //   #84	-> 1251
/*     */     //   #83	-> 1252
/*     */     //   #90	-> 1258
/*     */     //   #91	-> 1283
/*     */     //   #92	-> 1294
/*     */     //   #93	-> 1307
/*     */     //   #94	-> 1330
/*     */     //   #79	-> 1342
/*     */     //   #420	-> 1354
/*     */     //   #421	-> 1357
/*     */     //   #424	-> 1360
/*     */     //   #425	-> 1378
/*     */     //   #426	-> 1390
/*     */     //   #427	-> 1396
/*     */     //   #428	-> 1403
/*     */     //   #429	-> 1412
/*     */     //   #431	-> 1419
/*     */     //   #430	-> 1441
/*     */     //   #432	-> 1453
/*     */     //   #433	-> 1456
/*     */     //   #434	-> 1474
/*     */     //   #435	-> 1479
/*     */     //   #436	-> 1491
/*     */     //   #438	-> 1503
/*     */     //   #440	-> 1508
/*     */     //   #441	-> 1518
/*     */     //   #442	-> 1531
/*     */     //   #444	-> 1544
/*     */     //   #445	-> 1555
/*     */     //   #446	-> 1562
/*     */     //   #447	-> 1590
/*     */     //   #448	-> 1602
/*     */     //   #450	-> 1616
/*     */     //   #445	-> 1617
/*     */     //   #450	-> 1618
/*     */     //   #451	-> 1619
/*     */     //   #452	-> 1632
/*     */     //   #440	-> 1633
/*     */     //   #453	-> 1634
/*     */     //   #454	-> 1659
/*     */     //   #95	-> 1690
/*     */     //   #454	-> 1728
/*     */     //   #453	-> 1733
/*     */     //   #455	-> 1735
/*     */     //   #432	-> 1742
/*     */     //   #456	-> 1745
/*     */     //   #426	-> 1748
/*     */     //   #457	-> 1751
/*     */     //   #420	-> 1754
/*     */     //   #458	-> 1757
/*     */     //   #97	-> 1770
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   527	3	17	$i$a$-cache-IconButtonKt$IconButton$1	I
/*     */     //   532	11	17	value$iv	Ljava/lang/Object;
/*     */     //   513	36	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   510	39	15	it$iv	Ljava/lang/Object;
/*     */     //   501	50	14	$i$f$cache	I
/*     */     //   498	53	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   498	53	13	invalid$iv	Z
/*     */     //   680	23	18	$i$a$-cache-IconButtonKt$IconButton$buttonState$2	I
/*     */     //   705	11	19	value$iv	Ljava/lang/Object;
/*     */     //   661	61	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   658	64	16	it$iv	Ljava/lang/Object;
/*     */     //   649	75	15	$i$f$cache	I
/*     */     //   646	78	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   646	78	14	invalid$iv	Z
/*     */     //   807	21	17	$i$a$-cache-IconButtonKt$IconButton$2	I
/*     */     //   833	10	18	value$iv	Ljava/lang/Object;
/*     */     //   788	60	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   785	63	15	it$iv	Ljava/lang/Object;
/*     */     //   776	74	14	$i$f$cache	I
/*     */     //   773	77	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   773	77	13	invalid$iv	Z
/*     */     //   953	16	18	$i$a$-cache-IconButtonKt$IconButton$3	I
/*     */     //   974	11	19	value$iv	Ljava/lang/Object;
/*     */     //   932	59	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   929	62	16	it$iv	Ljava/lang/Object;
/*     */     //   920	73	15	$i$f$cache	I
/*     */     //   917	76	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   917	76	14	invalid$iv	Z
/*     */     //   1161	5	28	$i$a$-cache-IconButtonKt$IconButton$4$1	I
/*     */     //   1171	11	28	value$iv	Ljava/lang/Object;
/*     */     //   1145	43	26	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1142	46	25	it$iv	Ljava/lang/Object;
/*     */     //   1133	57	24	$i$f$cache	I
/*     */     //   1130	60	22	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1130	60	23	invalid$iv	Z
/*     */     //   1112	95	21	$i$a$-thenIf-IconButtonKt$IconButton$4	I
/*     */     //   1109	98	20	$this$IconButton_u24lambda_u2410	Landroidx/compose/ui/Modifier;
/*     */     //   1100	112	19	$i$f$thenIf	I
/*     */     //   1097	115	17	$this$thenIf$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1097	115	18	precondition$iv	Z
/*     */     //   1690	38	41	$i$a$-Box-IconButtonKt$IconButton$5	I
/*     */     //   1687	41	40	$this$IconButton_u24lambda_u2411	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   1687	41	39	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1687	41	38	$changed	I
/*     */     //   1651	82	37	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   1648	85	36	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1648	85	35	$changed$iv	I
/*     */     //   1562	55	34	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1559	58	33	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1555	64	32	$i$f$set-impl	I
/*     */     //   1552	67	31	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1518	115	30	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1515	118	29	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1445	301	28	$i$f$ReusableComposeNode	I
/*     */     //   1442	304	26	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1442	304	27	$changed$iv$iv$iv	I
/*     */     //   1382	370	22	$i$f$Layout	I
/*     */     //   1401	351	23	compositeKeyHash$iv$iv	I
/*     */     //   1410	342	24	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1419	333	25	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1379	373	21	$changed$iv$iv	I
/*     */     //   1346	412	19	$i$f$Box	I
/*     */     //   1369	389	20	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1343	415	15	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1343	415	16	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   1360	398	17	propagateMinConstraints$iv	Z
/*     */     //   1343	415	18	$changed$iv	I
/*     */     //   740	1027	11	buttonState$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   1033	734	12	shape	Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   1051	716	13	background$delegate	Landroidx/compose/runtime/State;
/*     */     //   1069	698	14	border$delegate	Landroidx/compose/runtime/State;
/*     */     //   28	1789	10	$dirty	I
/*     */     //   0	1817	0	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1817	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1817	2	enabled	Z
/*     */     //   0	1817	3	focusable	Z
/*     */     //   0	1817	4	style	Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   0	1817	5	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1817	6	content	Lkotlin/jvm/functions/Function4;
/*     */     //   0	1817	7	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1817	8	$changed	I
/*     */   }
/*     */   
/*     */   private static final long IconButton$lambda$2(MutableState $buttonState$delegate) {
/*  56 */     State state = (State)$buttonState$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 611 */       (IconButtonState)state.getValue()).unbox-impl(); } private static final void IconButton$lambda$3(MutableState $buttonState$delegate, long <set-?>) { MutableState mutableState = $buttonState$delegate; Object object1 = null, object2 = null; Object value$iv = IconButtonState.box-impl(<set-?>); int $i$f$setValue = 0;
/* 612 */     mutableState.setValue(value$iv); } private static final long IconButton$lambda$6(State $background$delegate) { State state = $background$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 614 */     return ((Color)state.getValue()).unbox-impl(); } @DebugMetadata(f = "IconButton.kt", l = {61}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.IconButtonKt$IconButton$3$1") @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class IconButtonKt$IconButton$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/* 615 */     int label; IconButtonKt$IconButton$3$1(MutableInteractionSource $interactionSource, boolean $focusable, MutableState<IconButtonState> $buttonState$delegate, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$focusable, this.$buttonState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { IconButtonKt.IconButton$lambda$3(this.$buttonState$delegate, IconButtonState.copy-3OtLUoY$default(IconButtonKt.IconButton$lambda$2(this.$buttonState$delegate), false, false, true, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { IconButtonKt.IconButton$lambda$3(this.$buttonState$delegate, IconButtonState.copy-3OtLUoY$default(IconButtonKt.IconButton$lambda$2(this.$buttonState$delegate), false, false, false, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { IconButtonKt.IconButton$lambda$3(this.$buttonState$delegate, IconButtonState.copy-3OtLUoY$default(IconButtonKt.IconButton$lambda$2(this.$buttonState$delegate), false, false, false, true, false, 23, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { IconButtonKt.IconButton$lambda$3(this.$buttonState$delegate, IconButtonState.copy-3OtLUoY$default(IconButtonKt.IconButton$lambda$2(this.$buttonState$delegate), false, false, false, false, false, 23, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { IconButtonKt.IconButton$lambda$3(this.$buttonState$delegate, IconButtonState.copy-3OtLUoY$default(IconButtonKt.IconButton$lambda$2(this.$buttonState$delegate), false, this.$focusable, false, false, false, 29, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { IconButtonKt.IconButton$lambda$3(this.$buttonState$delegate, IconButtonState.copy-3OtLUoY$default(IconButtonKt.IconButton$lambda$2(this.$buttonState$delegate), false, false, false, false, false, 29, null)); }  return Unit.INSTANCE; } }(Continuation)this) == object) return object;  this.$interactionSource.getInteractions().collect(new FlowCollector(this.$focusable, this.$buttonState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { IconButtonKt.IconButton$lambda$3(this.$buttonState$delegate, IconButtonState.copy-3OtLUoY$default(IconButtonKt.IconButton$lambda$2(this.$buttonState$delegate), false, false, true, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { IconButtonKt.IconButton$lambda$3(this.$buttonState$delegate, IconButtonState.copy-3OtLUoY$default(IconButtonKt.IconButton$lambda$2(this.$buttonState$delegate), false, false, false, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { IconButtonKt.IconButton$lambda$3(this.$buttonState$delegate, IconButtonState.copy-3OtLUoY$default(IconButtonKt.IconButton$lambda$2(this.$buttonState$delegate), false, false, false, true, false, 23, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { IconButtonKt.IconButton$lambda$3(this.$buttonState$delegate, IconButtonState.copy-3OtLUoY$default(IconButtonKt.IconButton$lambda$2(this.$buttonState$delegate), false, false, false, false, false, 23, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { IconButtonKt.IconButton$lambda$3(this.$buttonState$delegate, IconButtonState.copy-3OtLUoY$default(IconButtonKt.IconButton$lambda$2(this.$buttonState$delegate), false, this.$focusable, false, false, false, 29, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { IconButtonKt.IconButton$lambda$3(this.$buttonState$delegate, IconButtonState.copy-3OtLUoY$default(IconButtonKt.IconButton$lambda$2(this.$buttonState$delegate), false, false, false, false, false, 29, null)); }  return Unit.INSTANCE; } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super IconButtonKt$IconButton$3$1> $completion) { return (Continuation<Unit>)new IconButtonKt$IconButton$3$1(this.$interactionSource, this.$focusable, this.$buttonState$delegate, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((IconButtonKt$IconButton$3$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } private static final long IconButton$lambda$7(State $border$delegate) { State state = $border$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Color)state.getValue()).unbox-impl(); } private static final Unit IconButton$lambda$10$lambda$9$lambda$8(FocusProperties $this$focusProperties) { Intrinsics.checkNotNullParameter($this$focusProperties, "$this$focusProperties"); $this$focusProperties.setCanFocus(false); return Unit.INSTANCE; } @Composable @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]") public static final void SelectableIconButton(boolean selected, @NotNull Function0 onClick, @Nullable Modifier modifier, boolean enabled, boolean focusable, @Nullable IconButtonStyle style, @Nullable MutableInteractionSource interactionSource, @NotNull Function4 content, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'onClick'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #7
/*     */     //   8: ldc 'content'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload #8
/*     */     //   15: ldc_w 1073638781
/*     */     //   18: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   23: astore #8
/*     */     //   25: iload #9
/*     */     //   27: istore #11
/*     */     //   29: iload #10
/*     */     //   31: iconst_1
/*     */     //   32: iand
/*     */     //   33: ifeq -> 46
/*     */     //   36: iload #11
/*     */     //   38: bipush #6
/*     */     //   40: ior
/*     */     //   41: istore #11
/*     */     //   43: goto -> 75
/*     */     //   46: iload #9
/*     */     //   48: bipush #6
/*     */     //   50: iand
/*     */     //   51: ifne -> 75
/*     */     //   54: iload #11
/*     */     //   56: aload #8
/*     */     //   58: iload_0
/*     */     //   59: invokeinterface changed : (Z)Z
/*     */     //   64: ifeq -> 71
/*     */     //   67: iconst_4
/*     */     //   68: goto -> 72
/*     */     //   71: iconst_2
/*     */     //   72: ior
/*     */     //   73: istore #11
/*     */     //   75: iload #10
/*     */     //   77: iconst_2
/*     */     //   78: iand
/*     */     //   79: ifeq -> 92
/*     */     //   82: iload #11
/*     */     //   84: bipush #48
/*     */     //   86: ior
/*     */     //   87: istore #11
/*     */     //   89: goto -> 123
/*     */     //   92: iload #9
/*     */     //   94: bipush #48
/*     */     //   96: iand
/*     */     //   97: ifne -> 123
/*     */     //   100: iload #11
/*     */     //   102: aload #8
/*     */     //   104: aload_1
/*     */     //   105: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   110: ifeq -> 118
/*     */     //   113: bipush #32
/*     */     //   115: goto -> 120
/*     */     //   118: bipush #16
/*     */     //   120: ior
/*     */     //   121: istore #11
/*     */     //   123: iload #10
/*     */     //   125: iconst_4
/*     */     //   126: iand
/*     */     //   127: ifeq -> 141
/*     */     //   130: iload #11
/*     */     //   132: sipush #384
/*     */     //   135: ior
/*     */     //   136: istore #11
/*     */     //   138: goto -> 175
/*     */     //   141: iload #9
/*     */     //   143: sipush #384
/*     */     //   146: iand
/*     */     //   147: ifne -> 175
/*     */     //   150: iload #11
/*     */     //   152: aload #8
/*     */     //   154: aload_2
/*     */     //   155: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   160: ifeq -> 169
/*     */     //   163: sipush #256
/*     */     //   166: goto -> 172
/*     */     //   169: sipush #128
/*     */     //   172: ior
/*     */     //   173: istore #11
/*     */     //   175: iload #10
/*     */     //   177: bipush #8
/*     */     //   179: iand
/*     */     //   180: ifeq -> 194
/*     */     //   183: iload #11
/*     */     //   185: sipush #3072
/*     */     //   188: ior
/*     */     //   189: istore #11
/*     */     //   191: goto -> 228
/*     */     //   194: iload #9
/*     */     //   196: sipush #3072
/*     */     //   199: iand
/*     */     //   200: ifne -> 228
/*     */     //   203: iload #11
/*     */     //   205: aload #8
/*     */     //   207: iload_3
/*     */     //   208: invokeinterface changed : (Z)Z
/*     */     //   213: ifeq -> 222
/*     */     //   216: sipush #2048
/*     */     //   219: goto -> 225
/*     */     //   222: sipush #1024
/*     */     //   225: ior
/*     */     //   226: istore #11
/*     */     //   228: iload #10
/*     */     //   230: bipush #16
/*     */     //   232: iand
/*     */     //   233: ifeq -> 247
/*     */     //   236: iload #11
/*     */     //   238: sipush #24576
/*     */     //   241: ior
/*     */     //   242: istore #11
/*     */     //   244: goto -> 282
/*     */     //   247: iload #9
/*     */     //   249: sipush #24576
/*     */     //   252: iand
/*     */     //   253: ifne -> 282
/*     */     //   256: iload #11
/*     */     //   258: aload #8
/*     */     //   260: iload #4
/*     */     //   262: invokeinterface changed : (Z)Z
/*     */     //   267: ifeq -> 276
/*     */     //   270: sipush #16384
/*     */     //   273: goto -> 279
/*     */     //   276: sipush #8192
/*     */     //   279: ior
/*     */     //   280: istore #11
/*     */     //   282: iload #9
/*     */     //   284: ldc 196608
/*     */     //   286: iand
/*     */     //   287: ifne -> 322
/*     */     //   290: iload #11
/*     */     //   292: iload #10
/*     */     //   294: bipush #32
/*     */     //   296: iand
/*     */     //   297: ifne -> 317
/*     */     //   300: aload #8
/*     */     //   302: aload #5
/*     */     //   304: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   309: ifeq -> 317
/*     */     //   312: ldc 131072
/*     */     //   314: goto -> 319
/*     */     //   317: ldc 65536
/*     */     //   319: ior
/*     */     //   320: istore #11
/*     */     //   322: iload #10
/*     */     //   324: bipush #64
/*     */     //   326: iand
/*     */     //   327: ifeq -> 340
/*     */     //   330: iload #11
/*     */     //   332: ldc 1572864
/*     */     //   334: ior
/*     */     //   335: istore #11
/*     */     //   337: goto -> 372
/*     */     //   340: iload #9
/*     */     //   342: ldc 1572864
/*     */     //   344: iand
/*     */     //   345: ifne -> 372
/*     */     //   348: iload #11
/*     */     //   350: aload #8
/*     */     //   352: aload #6
/*     */     //   354: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   359: ifeq -> 367
/*     */     //   362: ldc 1048576
/*     */     //   364: goto -> 369
/*     */     //   367: ldc 524288
/*     */     //   369: ior
/*     */     //   370: istore #11
/*     */     //   372: iload #10
/*     */     //   374: sipush #128
/*     */     //   377: iand
/*     */     //   378: ifeq -> 392
/*     */     //   381: iload #11
/*     */     //   383: ldc_w 12582912
/*     */     //   386: ior
/*     */     //   387: istore #11
/*     */     //   389: goto -> 427
/*     */     //   392: iload #9
/*     */     //   394: ldc_w 12582912
/*     */     //   397: iand
/*     */     //   398: ifne -> 427
/*     */     //   401: iload #11
/*     */     //   403: aload #8
/*     */     //   405: aload #7
/*     */     //   407: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   412: ifeq -> 421
/*     */     //   415: ldc_w 8388608
/*     */     //   418: goto -> 424
/*     */     //   421: ldc_w 4194304
/*     */     //   424: ior
/*     */     //   425: istore #11
/*     */     //   427: iload #11
/*     */     //   429: ldc_w 4793491
/*     */     //   432: iand
/*     */     //   433: ldc_w 4793490
/*     */     //   436: if_icmpne -> 449
/*     */     //   439: aload #8
/*     */     //   441: invokeinterface getSkipping : ()Z
/*     */     //   446: ifne -> 1976
/*     */     //   449: aload #8
/*     */     //   451: invokeinterface startDefaults : ()V
/*     */     //   456: iload #9
/*     */     //   458: iconst_1
/*     */     //   459: iand
/*     */     //   460: ifeq -> 473
/*     */     //   463: aload #8
/*     */     //   465: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   470: ifeq -> 633
/*     */     //   473: iload #10
/*     */     //   475: iconst_4
/*     */     //   476: iand
/*     */     //   477: ifeq -> 487
/*     */     //   480: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   483: checkcast androidx/compose/ui/Modifier
/*     */     //   486: astore_2
/*     */     //   487: iload #10
/*     */     //   489: bipush #8
/*     */     //   491: iand
/*     */     //   492: ifeq -> 497
/*     */     //   495: iconst_1
/*     */     //   496: istore_3
/*     */     //   497: iload #10
/*     */     //   499: bipush #16
/*     */     //   501: iand
/*     */     //   502: ifeq -> 508
/*     */     //   505: iconst_1
/*     */     //   506: istore #4
/*     */     //   508: iload #10
/*     */     //   510: bipush #32
/*     */     //   512: iand
/*     */     //   513: ifeq -> 536
/*     */     //   516: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   519: aload #8
/*     */     //   521: bipush #6
/*     */     //   523: invokestatic getIconButtonStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   526: astore #5
/*     */     //   528: iload #11
/*     */     //   530: ldc_w -458753
/*     */     //   533: iand
/*     */     //   534: istore #11
/*     */     //   536: iload #10
/*     */     //   538: bipush #64
/*     */     //   540: iand
/*     */     //   541: ifeq -> 656
/*     */     //   544: aload #8
/*     */     //   546: ldc_w -726280602
/*     */     //   549: invokeinterface startReplaceGroup : (I)V
/*     */     //   554: aload #8
/*     */     //   556: astore #13
/*     */     //   558: iconst_0
/*     */     //   559: istore #14
/*     */     //   561: iconst_0
/*     */     //   562: istore #15
/*     */     //   564: aload #13
/*     */     //   566: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   571: astore #16
/*     */     //   573: iconst_0
/*     */     //   574: istore #17
/*     */     //   576: aload #16
/*     */     //   578: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   581: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   584: if_acmpne -> 609
/*     */     //   587: iconst_0
/*     */     //   588: istore #18
/*     */     //   590: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   593: astore #18
/*     */     //   595: aload #13
/*     */     //   597: aload #18
/*     */     //   599: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   604: aload #18
/*     */     //   606: goto -> 611
/*     */     //   609: aload #16
/*     */     //   611: nop
/*     */     //   612: nop
/*     */     //   613: nop
/*     */     //   614: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   617: astore #12
/*     */     //   619: aload #8
/*     */     //   621: invokeinterface endReplaceGroup : ()V
/*     */     //   626: aload #12
/*     */     //   628: astore #6
/*     */     //   630: goto -> 656
/*     */     //   633: aload #8
/*     */     //   635: invokeinterface skipToGroupEnd : ()V
/*     */     //   640: iload #10
/*     */     //   642: bipush #32
/*     */     //   644: iand
/*     */     //   645: ifeq -> 656
/*     */     //   648: iload #11
/*     */     //   650: ldc_w -458753
/*     */     //   653: iand
/*     */     //   654: istore #11
/*     */     //   656: aload #8
/*     */     //   658: invokeinterface endDefaults : ()V
/*     */     //   663: invokestatic isTraceInProgress : ()Z
/*     */     //   666: ifeq -> 681
/*     */     //   669: ldc_w 1073638781
/*     */     //   672: iload #11
/*     */     //   674: iconst_m1
/*     */     //   675: ldc_w 'org.jetbrains.jewel.ui.component.SelectableIconButton (IconButton.kt:108)'
/*     */     //   678: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   681: aload #8
/*     */     //   683: ldc_w -726276034
/*     */     //   686: invokeinterface startReplaceGroup : (I)V
/*     */     //   691: aload #8
/*     */     //   693: astore #14
/*     */     //   695: iload #11
/*     */     //   697: ldc_w 3670016
/*     */     //   700: iand
/*     */     //   701: ldc 1048576
/*     */     //   703: if_icmpne -> 710
/*     */     //   706: iconst_1
/*     */     //   707: goto -> 711
/*     */     //   710: iconst_0
/*     */     //   711: istore #15
/*     */     //   713: nop
/*     */     //   714: iconst_0
/*     */     //   715: istore #16
/*     */     //   717: aload #14
/*     */     //   719: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   724: astore #17
/*     */     //   726: iconst_0
/*     */     //   727: istore #18
/*     */     //   729: iload #15
/*     */     //   731: ifne -> 745
/*     */     //   734: aload #17
/*     */     //   736: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   739: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   742: if_acmpne -> 788
/*     */     //   745: iconst_0
/*     */     //   746: istore #19
/*     */     //   748: getstatic org/jetbrains/jewel/ui/component/SelectableIconButtonState.Companion : Lorg/jetbrains/jewel/ui/component/SelectableIconButtonState$Companion;
/*     */     //   751: iload_3
/*     */     //   752: iconst_0
/*     */     //   753: iconst_0
/*     */     //   754: iconst_0
/*     */     //   755: iconst_0
/*     */     //   756: iconst_0
/*     */     //   757: bipush #62
/*     */     //   759: aconst_null
/*     */     //   760: invokestatic of-z9lnavA$default : (Lorg/jetbrains/jewel/ui/component/SelectableIconButtonState$Companion;ZZZZZZILjava/lang/Object;)J
/*     */     //   763: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/SelectableIconButtonState;
/*     */     //   766: aconst_null
/*     */     //   767: iconst_2
/*     */     //   768: aconst_null
/*     */     //   769: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   772: astore #20
/*     */     //   774: aload #14
/*     */     //   776: aload #20
/*     */     //   778: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   783: aload #20
/*     */     //   785: goto -> 790
/*     */     //   788: aload #17
/*     */     //   790: nop
/*     */     //   791: nop
/*     */     //   792: nop
/*     */     //   793: checkcast androidx/compose/runtime/MutableState
/*     */     //   796: astore #13
/*     */     //   798: aload #8
/*     */     //   800: invokeinterface endReplaceGroup : ()V
/*     */     //   805: aload #13
/*     */     //   807: astore #12
/*     */     //   809: aload #8
/*     */     //   811: ldc_w -726272795
/*     */     //   814: invokeinterface startReplaceGroup : (I)V
/*     */     //   819: aload #8
/*     */     //   821: astore #13
/*     */     //   823: iload #11
/*     */     //   825: sipush #7168
/*     */     //   828: iand
/*     */     //   829: sipush #2048
/*     */     //   832: if_icmpne -> 839
/*     */     //   835: iconst_1
/*     */     //   836: goto -> 840
/*     */     //   839: iconst_0
/*     */     //   840: iload #11
/*     */     //   842: bipush #14
/*     */     //   844: iand
/*     */     //   845: iconst_4
/*     */     //   846: if_icmpne -> 853
/*     */     //   849: iconst_1
/*     */     //   850: goto -> 854
/*     */     //   853: iconst_0
/*     */     //   854: ior
/*     */     //   855: istore #14
/*     */     //   857: nop
/*     */     //   858: iconst_0
/*     */     //   859: istore #15
/*     */     //   861: aload #13
/*     */     //   863: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   868: astore #16
/*     */     //   870: iconst_0
/*     */     //   871: istore #17
/*     */     //   873: iload #14
/*     */     //   875: ifne -> 889
/*     */     //   878: aload #16
/*     */     //   880: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   883: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   886: if_acmpne -> 932
/*     */     //   889: iconst_0
/*     */     //   890: istore #18
/*     */     //   892: aload #12
/*     */     //   894: aload #12
/*     */     //   896: invokestatic SelectableIconButton$lambda$15 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   899: iload_3
/*     */     //   900: iload_0
/*     */     //   901: iconst_0
/*     */     //   902: iconst_0
/*     */     //   903: iconst_0
/*     */     //   904: iconst_0
/*     */     //   905: bipush #60
/*     */     //   907: aconst_null
/*     */     //   908: invokestatic copy-z9lnavA$default : (JZZZZZZILjava/lang/Object;)J
/*     */     //   911: invokestatic SelectableIconButton$lambda$16 : (Landroidx/compose/runtime/MutableState;J)V
/*     */     //   914: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   917: astore #19
/*     */     //   919: aload #13
/*     */     //   921: aload #19
/*     */     //   923: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   928: nop
/*     */     //   929: goto -> 933
/*     */     //   932: nop
/*     */     //   933: nop
/*     */     //   934: nop
/*     */     //   935: nop
/*     */     //   936: aload #8
/*     */     //   938: invokeinterface endReplaceGroup : ()V
/*     */     //   943: aload #6
/*     */     //   945: aload #8
/*     */     //   947: ldc_w -726267393
/*     */     //   950: invokeinterface startReplaceGroup : (I)V
/*     */     //   955: aload #8
/*     */     //   957: astore #14
/*     */     //   959: iload #11
/*     */     //   961: ldc_w 3670016
/*     */     //   964: iand
/*     */     //   965: ldc 1048576
/*     */     //   967: if_icmpne -> 974
/*     */     //   970: iconst_1
/*     */     //   971: goto -> 975
/*     */     //   974: iconst_0
/*     */     //   975: aload #8
/*     */     //   977: aload #12
/*     */     //   979: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   984: ior
/*     */     //   985: iload #11
/*     */     //   987: ldc_w 57344
/*     */     //   990: iand
/*     */     //   991: sipush #16384
/*     */     //   994: if_icmpne -> 1001
/*     */     //   997: iconst_1
/*     */     //   998: goto -> 1002
/*     */     //   1001: iconst_0
/*     */     //   1002: ior
/*     */     //   1003: istore #15
/*     */     //   1005: iconst_0
/*     */     //   1006: istore #16
/*     */     //   1008: aload #14
/*     */     //   1010: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1015: astore #17
/*     */     //   1017: iconst_0
/*     */     //   1018: istore #18
/*     */     //   1020: iload #15
/*     */     //   1022: ifne -> 1036
/*     */     //   1025: aload #17
/*     */     //   1027: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1030: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1033: if_acmpne -> 1077
/*     */     //   1036: astore #43
/*     */     //   1038: iconst_0
/*     */     //   1039: istore #19
/*     */     //   1041: new org/jetbrains/jewel/ui/component/IconButtonKt$SelectableIconButton$3$1
/*     */     //   1044: dup
/*     */     //   1045: aload #6
/*     */     //   1047: iload #4
/*     */     //   1049: aload #12
/*     */     //   1051: aconst_null
/*     */     //   1052: invokespecial <init> : (Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLandroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*     */     //   1055: checkcast kotlin/jvm/functions/Function2
/*     */     //   1058: aload #43
/*     */     //   1060: swap
/*     */     //   1061: astore #20
/*     */     //   1063: aload #14
/*     */     //   1065: aload #20
/*     */     //   1067: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1072: aload #20
/*     */     //   1074: goto -> 1079
/*     */     //   1077: aload #17
/*     */     //   1079: nop
/*     */     //   1080: nop
/*     */     //   1081: nop
/*     */     //   1082: checkcast kotlin/jvm/functions/Function2
/*     */     //   1085: astore #13
/*     */     //   1087: aload #8
/*     */     //   1089: invokeinterface endReplaceGroup : ()V
/*     */     //   1094: aload #13
/*     */     //   1096: aload #8
/*     */     //   1098: bipush #14
/*     */     //   1100: iload #11
/*     */     //   1102: bipush #18
/*     */     //   1104: ishr
/*     */     //   1105: iand
/*     */     //   1106: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1109: aload #5
/*     */     //   1111: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/IconButtonMetrics;
/*     */     //   1114: invokevirtual getCornerSize : ()Landroidx/compose/foundation/shape/CornerSize;
/*     */     //   1117: invokestatic RoundedCornerShape : (Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   1120: astore #13
/*     */     //   1122: aload #5
/*     */     //   1124: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/IconButtonColors;
/*     */     //   1127: aload #12
/*     */     //   1129: invokestatic SelectableIconButton$lambda$15 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1132: aload #8
/*     */     //   1134: iconst_0
/*     */     //   1135: invokevirtual selectableBackgroundFor-eXKw-ig : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1138: astore #14
/*     */     //   1140: aload #5
/*     */     //   1142: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/IconButtonColors;
/*     */     //   1145: aload #12
/*     */     //   1147: invokestatic SelectableIconButton$lambda$15 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1150: aload #8
/*     */     //   1152: iconst_0
/*     */     //   1153: invokevirtual selectableBorderFor-eXKw-ig : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1156: astore #15
/*     */     //   1158: aload #8
/*     */     //   1160: ldc_w -726236550
/*     */     //   1163: invokeinterface startReplaceGroup : (I)V
/*     */     //   1168: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1171: checkcast androidx/compose/ui/Modifier
/*     */     //   1174: astore #18
/*     */     //   1176: iload #4
/*     */     //   1178: ifne -> 1185
/*     */     //   1181: iconst_1
/*     */     //   1182: goto -> 1186
/*     */     //   1185: iconst_0
/*     */     //   1186: istore #19
/*     */     //   1188: iconst_0
/*     */     //   1189: istore #20
/*     */     //   1191: iload #19
/*     */     //   1193: ifeq -> 1302
/*     */     //   1196: aload #18
/*     */     //   1198: astore #21
/*     */     //   1200: iconst_0
/*     */     //   1201: istore #22
/*     */     //   1203: aload #21
/*     */     //   1205: aload #8
/*     */     //   1207: ldc_w 306233970
/*     */     //   1210: invokeinterface startReplaceGroup : (I)V
/*     */     //   1215: aload #8
/*     */     //   1217: astore #23
/*     */     //   1219: iconst_0
/*     */     //   1220: istore #24
/*     */     //   1222: iconst_0
/*     */     //   1223: istore #25
/*     */     //   1225: aload #23
/*     */     //   1227: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1232: astore #26
/*     */     //   1234: iconst_0
/*     */     //   1235: istore #27
/*     */     //   1237: aload #26
/*     */     //   1239: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1242: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1245: if_acmpne -> 1277
/*     */     //   1248: astore #28
/*     */     //   1250: iconst_0
/*     */     //   1251: istore #29
/*     */     //   1253: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   1258: aload #28
/*     */     //   1260: swap
/*     */     //   1261: astore #29
/*     */     //   1263: aload #23
/*     */     //   1265: aload #29
/*     */     //   1267: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1272: aload #29
/*     */     //   1274: goto -> 1279
/*     */     //   1277: aload #26
/*     */     //   1279: nop
/*     */     //   1280: nop
/*     */     //   1281: nop
/*     */     //   1282: checkcast kotlin/jvm/functions/Function1
/*     */     //   1285: astore #30
/*     */     //   1287: aload #8
/*     */     //   1289: invokeinterface endReplaceGroup : ()V
/*     */     //   1294: aload #30
/*     */     //   1296: invokestatic focusProperties : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   1299: goto -> 1304
/*     */     //   1302: aload #18
/*     */     //   1304: astore #17
/*     */     //   1306: aload #8
/*     */     //   1308: invokeinterface endReplaceGroup : ()V
/*     */     //   1313: aload #17
/*     */     //   1315: aload_2
/*     */     //   1316: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1321: astore #16
/*     */     //   1323: getstatic androidx/compose/ui/semantics/Role.Companion : Landroidx/compose/ui/semantics/Role$Companion;
/*     */     //   1326: invokevirtual getRadioButton-o7Vup1c : ()I
/*     */     //   1329: istore #17
/*     */     //   1331: aload #16
/*     */     //   1333: iload_0
/*     */     //   1334: aload #6
/*     */     //   1336: aconst_null
/*     */     //   1337: iload_3
/*     */     //   1338: iload #17
/*     */     //   1340: invokestatic box-impl : (I)Landroidx/compose/ui/semantics/Role;
/*     */     //   1343: aload_1
/*     */     //   1344: invokestatic selectable-O2vRcR0 : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;
/*     */     //   1347: iload_3
/*     */     //   1348: aload #8
/*     */     //   1350: ldc_w -726222194
/*     */     //   1353: invokeinterface startReplaceGroup : (I)V
/*     */     //   1358: aload #8
/*     */     //   1360: astore #17
/*     */     //   1362: aload #8
/*     */     //   1364: aload #12
/*     */     //   1366: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1371: istore #18
/*     */     //   1373: iconst_0
/*     */     //   1374: istore #19
/*     */     //   1376: aload #17
/*     */     //   1378: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1383: astore #20
/*     */     //   1385: iconst_0
/*     */     //   1386: istore #21
/*     */     //   1388: iload #18
/*     */     //   1390: ifne -> 1404
/*     */     //   1393: aload #20
/*     */     //   1395: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1398: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1401: if_acmpne -> 1442
/*     */     //   1404: istore #44
/*     */     //   1406: astore #43
/*     */     //   1408: iconst_0
/*     */     //   1409: istore #22
/*     */     //   1411: aload #12
/*     */     //   1413: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   1418: astore #45
/*     */     //   1420: aload #43
/*     */     //   1422: iload #44
/*     */     //   1424: aload #45
/*     */     //   1426: astore #23
/*     */     //   1428: aload #17
/*     */     //   1430: aload #23
/*     */     //   1432: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1437: aload #23
/*     */     //   1439: goto -> 1444
/*     */     //   1442: aload #20
/*     */     //   1444: nop
/*     */     //   1445: nop
/*     */     //   1446: nop
/*     */     //   1447: checkcast kotlin/jvm/functions/Function1
/*     */     //   1450: astore #16
/*     */     //   1452: aload #8
/*     */     //   1454: invokeinterface endReplaceGroup : ()V
/*     */     //   1459: aload #16
/*     */     //   1461: invokestatic onActivated : (Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   1464: aload #5
/*     */     //   1466: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/IconButtonMetrics;
/*     */     //   1469: invokevirtual getMinSize-MYxV2XQ : ()J
/*     */     //   1472: invokestatic getWidth-D9Ej5fM : (J)F
/*     */     //   1475: aload #5
/*     */     //   1477: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/IconButtonMetrics;
/*     */     //   1480: invokevirtual getMinSize-MYxV2XQ : ()J
/*     */     //   1483: invokestatic getHeight-D9Ej5fM : (J)F
/*     */     //   1486: invokestatic defaultMinSize-VpY3zN4 : (Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;
/*     */     //   1489: aload #5
/*     */     //   1491: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/IconButtonMetrics;
/*     */     //   1494: invokevirtual getPadding : ()Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   1497: invokestatic padding : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;
/*     */     //   1500: aload #14
/*     */     //   1502: invokestatic SelectableIconButton$lambda$19 : (Landroidx/compose/runtime/State;)J
/*     */     //   1505: aload #13
/*     */     //   1507: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   1510: invokestatic background-bw27NRU : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*     */     //   1513: aload #5
/*     */     //   1515: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/IconButtonMetrics;
/*     */     //   1518: invokevirtual getBorderWidth-D9Ej5fM : ()F
/*     */     //   1521: aload #15
/*     */     //   1523: invokestatic SelectableIconButton$lambda$20 : (Landroidx/compose/runtime/State;)J
/*     */     //   1526: aload #13
/*     */     //   1528: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   1531: invokestatic border-xT4_qwU : (Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*     */     //   1534: astore #16
/*     */     //   1536: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1539: invokevirtual getCenter : ()Landroidx/compose/ui/Alignment;
/*     */     //   1542: astore #17
/*     */     //   1544: bipush #48
/*     */     //   1546: istore #19
/*     */     //   1548: nop
/*     */     //   1549: iconst_0
/*     */     //   1550: istore #20
/*     */     //   1552: aload #8
/*     */     //   1554: ldc_w 733328855
/*     */     //   1557: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   1560: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1563: iconst_0
/*     */     //   1564: istore #18
/*     */     //   1566: aload #17
/*     */     //   1568: iload #18
/*     */     //   1570: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1573: astore #21
/*     */     //   1575: bipush #112
/*     */     //   1577: iload #19
/*     */     //   1579: iconst_3
/*     */     //   1580: ishl
/*     */     //   1581: iand
/*     */     //   1582: istore #22
/*     */     //   1584: nop
/*     */     //   1585: iconst_0
/*     */     //   1586: istore #23
/*     */     //   1588: aload #8
/*     */     //   1590: ldc_w -1323940314
/*     */     //   1593: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1596: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1599: aload #8
/*     */     //   1601: iconst_0
/*     */     //   1602: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1605: istore #24
/*     */     //   1607: aload #8
/*     */     //   1609: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1614: astore #25
/*     */     //   1616: aload #8
/*     */     //   1618: aload #16
/*     */     //   1620: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1623: astore #26
/*     */     //   1625: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1628: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1631: astore #27
/*     */     //   1633: bipush #6
/*     */     //   1635: sipush #896
/*     */     //   1638: iload #22
/*     */     //   1640: bipush #6
/*     */     //   1642: ishl
/*     */     //   1643: iand
/*     */     //   1644: ior
/*     */     //   1645: istore #28
/*     */     //   1647: nop
/*     */     //   1648: iconst_0
/*     */     //   1649: istore #29
/*     */     //   1651: aload #8
/*     */     //   1653: ldc_w -692256719
/*     */     //   1656: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1659: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1662: aload #8
/*     */     //   1664: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1669: instanceof androidx/compose/runtime/Applier
/*     */     //   1672: ifne -> 1678
/*     */     //   1675: invokestatic invalidApplier : ()V
/*     */     //   1678: aload #8
/*     */     //   1680: invokeinterface startReusableNode : ()V
/*     */     //   1685: aload #8
/*     */     //   1687: invokeinterface getInserting : ()Z
/*     */     //   1692: ifeq -> 1707
/*     */     //   1695: aload #8
/*     */     //   1697: aload #27
/*     */     //   1699: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1704: goto -> 1714
/*     */     //   1707: aload #8
/*     */     //   1709: invokeinterface useNode : ()V
/*     */     //   1714: aload #8
/*     */     //   1716: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1719: astore #30
/*     */     //   1721: iconst_0
/*     */     //   1722: istore #31
/*     */     //   1724: aload #30
/*     */     //   1726: aload #21
/*     */     //   1728: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1731: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1734: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1737: aload #30
/*     */     //   1739: aload #25
/*     */     //   1741: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1744: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1747: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1750: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1753: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1756: astore #32
/*     */     //   1758: iconst_0
/*     */     //   1759: istore #33
/*     */     //   1761: aload #30
/*     */     //   1763: astore #34
/*     */     //   1765: iconst_0
/*     */     //   1766: istore #35
/*     */     //   1768: aload #34
/*     */     //   1770: invokeinterface getInserting : ()Z
/*     */     //   1775: ifne -> 1796
/*     */     //   1778: aload #34
/*     */     //   1780: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1785: iload #24
/*     */     //   1787: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1790: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1793: ifne -> 1822
/*     */     //   1796: aload #34
/*     */     //   1798: iload #24
/*     */     //   1800: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1803: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1808: aload #30
/*     */     //   1810: iload #24
/*     */     //   1812: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1815: aload #32
/*     */     //   1817: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1822: nop
/*     */     //   1823: nop
/*     */     //   1824: nop
/*     */     //   1825: aload #30
/*     */     //   1827: aload #26
/*     */     //   1829: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1832: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1835: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1838: nop
/*     */     //   1839: nop
/*     */     //   1840: aload #8
/*     */     //   1842: bipush #14
/*     */     //   1844: iload #28
/*     */     //   1846: bipush #6
/*     */     //   1848: ishr
/*     */     //   1849: iand
/*     */     //   1850: istore #36
/*     */     //   1852: astore #37
/*     */     //   1854: iconst_0
/*     */     //   1855: istore #38
/*     */     //   1857: aload #37
/*     */     //   1859: ldc_w -2146769399
/*     */     //   1862: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   1865: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1868: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   1871: aload #37
/*     */     //   1873: bipush #6
/*     */     //   1875: bipush #112
/*     */     //   1877: iload #19
/*     */     //   1879: bipush #6
/*     */     //   1881: ishr
/*     */     //   1882: iand
/*     */     //   1883: ior
/*     */     //   1884: istore #39
/*     */     //   1886: astore #40
/*     */     //   1888: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   1891: astore #41
/*     */     //   1893: iconst_0
/*     */     //   1894: istore #42
/*     */     //   1896: aload #7
/*     */     //   1898: aload #41
/*     */     //   1900: aload #12
/*     */     //   1902: invokestatic SelectableIconButton$lambda$15 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1905: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/SelectableIconButtonState;
/*     */     //   1908: aload #40
/*     */     //   1910: bipush #14
/*     */     //   1912: iload #39
/*     */     //   1914: iand
/*     */     //   1915: sipush #896
/*     */     //   1918: iload #11
/*     */     //   1920: bipush #15
/*     */     //   1922: ishr
/*     */     //   1923: iand
/*     */     //   1924: ior
/*     */     //   1925: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1928: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1933: pop
/*     */     //   1934: aload #37
/*     */     //   1936: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1939: aload #8
/*     */     //   1941: invokeinterface endNode : ()V
/*     */     //   1946: aload #8
/*     */     //   1948: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1951: nop
/*     */     //   1952: aload #8
/*     */     //   1954: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1957: nop
/*     */     //   1958: aload #8
/*     */     //   1960: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1963: nop
/*     */     //   1964: invokestatic isTraceInProgress : ()Z
/*     */     //   1967: ifeq -> 1983
/*     */     //   1970: invokestatic traceEventEnd : ()V
/*     */     //   1973: goto -> 1983
/*     */     //   1976: aload #8
/*     */     //   1978: invokeinterface skipToGroupEnd : ()V
/*     */     //   1983: aload #8
/*     */     //   1985: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1990: dup
/*     */     //   1991: ifnull -> 2023
/*     */     //   1994: iload_0
/*     */     //   1995: aload_1
/*     */     //   1996: aload_2
/*     */     //   1997: iload_3
/*     */     //   1998: iload #4
/*     */     //   2000: aload #5
/*     */     //   2002: aload #6
/*     */     //   2004: aload #7
/*     */     //   2006: iload #9
/*     */     //   2008: iload #10
/*     */     //   2010: <illegal opcode> invoke : (ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function4;II)Lkotlin/jvm/functions/Function2;
/*     */     //   2015: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   2020: goto -> 2024
/*     */     //   2023: pop
/*     */     //   2024: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #109	-> 13
/*     */     //   #103	-> 480
/*     */     //   #104	-> 495
/*     */     //   #105	-> 505
/*     */     //   #106	-> 516
/*     */     //   #107	-> 544
/*     */     //   #459	-> 564
/*     */     //   #460	-> 576
/*     */     //   #461	-> 587
/*     */     //   #107	-> 590
/*     */     //   #461	-> 593
/*     */     //   #462	-> 595
/*     */     //   #463	-> 604
/*     */     //   #464	-> 609
/*     */     //   #460	-> 611
/*     */     //   #459	-> 612
/*     */     //   #459	-> 613
/*     */     //   #107	-> 614
/*     */     //   #109	-> 678
/*     */     //   #110	-> 713
/*     */     //   #465	-> 717
/*     */     //   #466	-> 729
/*     */     //   #467	-> 745
/*     */     //   #110	-> 748
/*     */     //   #467	-> 772
/*     */     //   #468	-> 774
/*     */     //   #469	-> 783
/*     */     //   #470	-> 788
/*     */     //   #466	-> 790
/*     */     //   #465	-> 791
/*     */     //   #465	-> 792
/*     */     //   #110	-> 793
/*     */     //   #112	-> 857
/*     */     //   #471	-> 861
/*     */     //   #472	-> 873
/*     */     //   #473	-> 889
/*     */     //   #112	-> 892
/*     */     //   #473	-> 917
/*     */     //   #474	-> 919
/*     */     //   #475	-> 928
/*     */     //   #476	-> 932
/*     */     //   #472	-> 933
/*     */     //   #471	-> 934
/*     */     //   #471	-> 935
/*     */     //   #114	-> 943
/*     */     //   #477	-> 1008
/*     */     //   #478	-> 1020
/*     */     //   #479	-> 1036
/*     */     //   #114	-> 1041
/*     */     //   #479	-> 1061
/*     */     //   #480	-> 1063
/*     */     //   #481	-> 1072
/*     */     //   #482	-> 1077
/*     */     //   #478	-> 1079
/*     */     //   #477	-> 1080
/*     */     //   #477	-> 1081
/*     */     //   #114	-> 1082
/*     */     //   #129	-> 1109
/*     */     //   #130	-> 1122
/*     */     //   #131	-> 1140
/*     */     //   #135	-> 1168
/*     */     //   #483	-> 1191
/*     */     //   #135	-> 1203
/*     */     //   #484	-> 1225
/*     */     //   #485	-> 1237
/*     */     //   #486	-> 1248
/*     */     //   #486	-> 1261
/*     */     //   #487	-> 1263
/*     */     //   #488	-> 1272
/*     */     //   #489	-> 1277
/*     */     //   #485	-> 1279
/*     */     //   #484	-> 1280
/*     */     //   #484	-> 1281
/*     */     //   #135	-> 1282
/*     */     //   #483	-> 1299
/*     */     //   #135	-> 1304
/*     */     //   #136	-> 1315
/*     */     //   #140	-> 1323
/*     */     //   #136	-> 1331
/*     */     //   #143	-> 1333
/*     */     //   #141	-> 1334
/*     */     //   #142	-> 1336
/*     */     //   #139	-> 1337
/*     */     //   #140	-> 1338
/*     */     //   #138	-> 1343
/*     */     //   #137	-> 1344
/*     */     //   #145	-> 1347
/*     */     //   #490	-> 1376
/*     */     //   #491	-> 1388
/*     */     //   #492	-> 1404
/*     */     //   #145	-> 1411
/*     */     //   #492	-> 1426
/*     */     //   #493	-> 1428
/*     */     //   #494	-> 1437
/*     */     //   #495	-> 1442
/*     */     //   #491	-> 1444
/*     */     //   #490	-> 1445
/*     */     //   #490	-> 1446
/*     */     //   #145	-> 1447
/*     */     //   #146	-> 1464
/*     */     //   #147	-> 1489
/*     */     //   #148	-> 1500
/*     */     //   #149	-> 1513
/*     */     //   #150	-> 1536
/*     */     //   #133	-> 1548
/*     */     //   #496	-> 1560
/*     */     //   #497	-> 1563
/*     */     //   #500	-> 1566
/*     */     //   #501	-> 1584
/*     */     //   #502	-> 1596
/*     */     //   #503	-> 1602
/*     */     //   #504	-> 1609
/*     */     //   #505	-> 1618
/*     */     //   #507	-> 1625
/*     */     //   #506	-> 1647
/*     */     //   #508	-> 1659
/*     */     //   #509	-> 1662
/*     */     //   #510	-> 1680
/*     */     //   #511	-> 1685
/*     */     //   #512	-> 1697
/*     */     //   #514	-> 1709
/*     */     //   #516	-> 1714
/*     */     //   #517	-> 1724
/*     */     //   #518	-> 1737
/*     */     //   #520	-> 1750
/*     */     //   #521	-> 1761
/*     */     //   #522	-> 1768
/*     */     //   #523	-> 1796
/*     */     //   #524	-> 1808
/*     */     //   #526	-> 1822
/*     */     //   #521	-> 1823
/*     */     //   #526	-> 1824
/*     */     //   #527	-> 1825
/*     */     //   #528	-> 1838
/*     */     //   #516	-> 1839
/*     */     //   #529	-> 1840
/*     */     //   #530	-> 1865
/*     */     //   #151	-> 1896
/*     */     //   #530	-> 1934
/*     */     //   #529	-> 1939
/*     */     //   #531	-> 1941
/*     */     //   #508	-> 1948
/*     */     //   #532	-> 1951
/*     */     //   #502	-> 1954
/*     */     //   #533	-> 1957
/*     */     //   #496	-> 1960
/*     */     //   #534	-> 1963
/*     */     //   #153	-> 1976
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   590	3	18	$i$a$-cache-IconButtonKt$SelectableIconButton$1	I
/*     */     //   595	11	18	value$iv	Ljava/lang/Object;
/*     */     //   576	36	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   573	39	16	it$iv	Ljava/lang/Object;
/*     */     //   564	50	15	$i$f$cache	I
/*     */     //   561	53	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   561	53	14	invalid$iv	Z
/*     */     //   748	24	19	$i$a$-cache-IconButtonKt$SelectableIconButton$buttonState$2	I
/*     */     //   774	11	20	value$iv	Ljava/lang/Object;
/*     */     //   729	62	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   726	65	17	it$iv	Ljava/lang/Object;
/*     */     //   717	76	16	$i$f$cache	I
/*     */     //   714	79	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   714	79	15	invalid$iv	Z
/*     */     //   892	22	18	$i$a$-cache-IconButtonKt$SelectableIconButton$2	I
/*     */     //   919	10	19	value$iv	Ljava/lang/Object;
/*     */     //   873	61	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   870	64	16	it$iv	Ljava/lang/Object;
/*     */     //   861	75	15	$i$f$cache	I
/*     */     //   858	78	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   858	78	14	invalid$iv	Z
/*     */     //   1041	17	19	$i$a$-cache-IconButtonKt$SelectableIconButton$3	I
/*     */     //   1063	11	20	value$iv	Ljava/lang/Object;
/*     */     //   1020	60	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1017	63	17	it$iv	Ljava/lang/Object;
/*     */     //   1008	74	16	$i$f$cache	I
/*     */     //   1005	77	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1005	77	15	invalid$iv	Z
/*     */     //   1253	5	29	$i$a$-cache-IconButtonKt$SelectableIconButton$4$1	I
/*     */     //   1263	11	29	value$iv	Ljava/lang/Object;
/*     */     //   1237	43	27	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1234	46	26	it$iv	Ljava/lang/Object;
/*     */     //   1225	57	25	$i$f$cache	I
/*     */     //   1222	60	23	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1222	60	24	invalid$iv	Z
/*     */     //   1203	96	22	$i$a$-thenIf-IconButtonKt$SelectableIconButton$4	I
/*     */     //   1200	99	21	$this$SelectableIconButton_u24lambda_u2423	Landroidx/compose/ui/Modifier;
/*     */     //   1191	113	20	$i$f$thenIf	I
/*     */     //   1188	116	18	$this$thenIf$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1188	116	19	precondition$iv	Z
/*     */     //   1411	7	22	$i$a$-cache-IconButtonKt$SelectableIconButton$5	I
/*     */     //   1428	11	23	value$iv	Ljava/lang/Object;
/*     */     //   1388	57	21	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1385	60	20	it$iv	Ljava/lang/Object;
/*     */     //   1376	71	19	$i$f$cache	I
/*     */     //   1373	74	17	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1373	74	18	invalid$iv	Z
/*     */     //   1896	38	42	$i$a$-Box-IconButtonKt$SelectableIconButton$6	I
/*     */     //   1893	41	41	$this$SelectableIconButton_u24lambda_u2426	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   1893	41	40	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1893	41	39	$changed	I
/*     */     //   1857	82	38	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   1854	85	37	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1854	85	36	$changed$iv	I
/*     */     //   1768	55	35	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1765	58	34	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1761	64	33	$i$f$set-impl	I
/*     */     //   1758	67	32	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1724	115	31	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1721	118	30	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1651	301	29	$i$f$ReusableComposeNode	I
/*     */     //   1648	304	27	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1648	304	28	$changed$iv$iv$iv	I
/*     */     //   1588	370	23	$i$f$Layout	I
/*     */     //   1607	351	24	compositeKeyHash$iv$iv	I
/*     */     //   1616	342	25	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1625	333	26	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1585	373	22	$changed$iv$iv	I
/*     */     //   1552	412	20	$i$f$Box	I
/*     */     //   1575	389	21	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1549	415	16	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1549	415	17	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   1566	398	18	propagateMinConstraints$iv	Z
/*     */     //   1549	415	19	$changed$iv	I
/*     */     //   809	1164	12	buttonState$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   1122	851	13	shape	Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   1140	833	14	background$delegate	Landroidx/compose/runtime/State;
/*     */     //   1158	815	15	border$delegate	Landroidx/compose/runtime/State;
/*     */     //   29	1996	11	$dirty	I
/*     */     //   0	2025	0	selected	Z
/*     */     //   0	2025	1	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	2025	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	2025	3	enabled	Z
/*     */     //   0	2025	4	focusable	Z
/*     */     //   0	2025	5	style	Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   0	2025	6	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	2025	7	content	Lkotlin/jvm/functions/Function4;
/*     */     //   0	2025	8	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	2025	9	$changed	I }
/* 616 */   private static final long SelectableIconButton$lambda$15(MutableState $buttonState$delegate) { State state = (State)$buttonState$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((SelectableIconButtonState)state.getValue()).unbox-impl(); } private static final void SelectableIconButton$lambda$16(MutableState $buttonState$delegate, long <set-?>) { MutableState mutableState = $buttonState$delegate; Object object1 = null, object2 = null; Object value$iv = SelectableIconButtonState.box-impl(<set-?>); int $i$f$setValue = 0;
/* 617 */     mutableState.setValue(value$iv); } @DebugMetadata(f = "IconButton.kt", l = {115}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.IconButtonKt$SelectableIconButton$3$1") @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class IconButtonKt$SelectableIconButton$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label; IconButtonKt$SelectableIconButton$3$1(MutableInteractionSource $interactionSource, boolean $focusable, MutableState<SelectableIconButtonState> $buttonState$delegate, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$focusable, this.$buttonState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { IconButtonKt.SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, false, true, false, false, 55, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { IconButtonKt.SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, false, false, false, false, 55, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { IconButtonKt.SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, false, false, true, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { IconButtonKt.SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, false, false, false, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { IconButtonKt.SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, this.$focusable, false, false, false, 59, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { IconButtonKt.SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, false, false, false, false, 59, null)); }  return Unit.INSTANCE; } }
/* 619 */               (Continuation)this) == object) return object;  this.$interactionSource.getInteractions().collect(new FlowCollector(this.$focusable, this.$buttonState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { IconButtonKt.SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, false, true, false, false, 55, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { IconButtonKt.SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, false, false, false, false, 55, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { IconButtonKt.SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, false, false, true, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { IconButtonKt.SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, false, false, false, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { IconButtonKt.SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, this.$focusable, false, false, false, 59, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { IconButtonKt.SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, false, false, false, false, 59, null)); }  return Unit.INSTANCE; } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super IconButtonKt$SelectableIconButton$3$1> $completion) { return (Continuation<Unit>)new IconButtonKt$SelectableIconButton$3$1(this.$interactionSource, this.$focusable, this.$buttonState$delegate, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((IconButtonKt$SelectableIconButton$3$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } private static final long SelectableIconButton$lambda$19(State $background$delegate) { State state = $background$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Color)state.getValue()).unbox-impl(); } private static final long SelectableIconButton$lambda$20(State $border$delegate) { State state = $border$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 620 */     return ((Color)state.getValue()).unbox-impl(); } private static final Unit SelectableIconButton$lambda$23$lambda$22$lambda$21(FocusProperties $this$focusProperties) { Intrinsics.checkNotNullParameter($this$focusProperties, "$this$focusProperties"); $this$focusProperties.setCanFocus(false); return Unit.INSTANCE; } private static final Unit SelectableIconButton$lambda$25$lambda$24(MutableState<SelectableIconButtonState> $buttonState$delegate, boolean it) { SelectableIconButton$lambda$16($buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(SelectableIconButton$lambda$15($buttonState$delegate), false, false, false, false, false, it, 31, null)); return Unit.INSTANCE; } @Composable @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]") public static final void ToggleableIconButton(boolean value, @NotNull Function1 onValueChange, @Nullable Modifier modifier, boolean enabled, boolean focusable, @Nullable IconButtonStyle style, @Nullable MutableInteractionSource interactionSource, @NotNull Function4 content, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'onValueChange'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload #7
/*     */     //   9: ldc 'content'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload #8
/*     */     //   16: ldc_w 91004548
/*     */     //   19: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   24: astore #8
/*     */     //   26: iload #9
/*     */     //   28: istore #11
/*     */     //   30: iload #10
/*     */     //   32: iconst_1
/*     */     //   33: iand
/*     */     //   34: ifeq -> 47
/*     */     //   37: iload #11
/*     */     //   39: bipush #6
/*     */     //   41: ior
/*     */     //   42: istore #11
/*     */     //   44: goto -> 76
/*     */     //   47: iload #9
/*     */     //   49: bipush #6
/*     */     //   51: iand
/*     */     //   52: ifne -> 76
/*     */     //   55: iload #11
/*     */     //   57: aload #8
/*     */     //   59: iload_0
/*     */     //   60: invokeinterface changed : (Z)Z
/*     */     //   65: ifeq -> 72
/*     */     //   68: iconst_4
/*     */     //   69: goto -> 73
/*     */     //   72: iconst_2
/*     */     //   73: ior
/*     */     //   74: istore #11
/*     */     //   76: iload #10
/*     */     //   78: iconst_2
/*     */     //   79: iand
/*     */     //   80: ifeq -> 93
/*     */     //   83: iload #11
/*     */     //   85: bipush #48
/*     */     //   87: ior
/*     */     //   88: istore #11
/*     */     //   90: goto -> 124
/*     */     //   93: iload #9
/*     */     //   95: bipush #48
/*     */     //   97: iand
/*     */     //   98: ifne -> 124
/*     */     //   101: iload #11
/*     */     //   103: aload #8
/*     */     //   105: aload_1
/*     */     //   106: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   111: ifeq -> 119
/*     */     //   114: bipush #32
/*     */     //   116: goto -> 121
/*     */     //   119: bipush #16
/*     */     //   121: ior
/*     */     //   122: istore #11
/*     */     //   124: iload #10
/*     */     //   126: iconst_4
/*     */     //   127: iand
/*     */     //   128: ifeq -> 142
/*     */     //   131: iload #11
/*     */     //   133: sipush #384
/*     */     //   136: ior
/*     */     //   137: istore #11
/*     */     //   139: goto -> 176
/*     */     //   142: iload #9
/*     */     //   144: sipush #384
/*     */     //   147: iand
/*     */     //   148: ifne -> 176
/*     */     //   151: iload #11
/*     */     //   153: aload #8
/*     */     //   155: aload_2
/*     */     //   156: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   161: ifeq -> 170
/*     */     //   164: sipush #256
/*     */     //   167: goto -> 173
/*     */     //   170: sipush #128
/*     */     //   173: ior
/*     */     //   174: istore #11
/*     */     //   176: iload #10
/*     */     //   178: bipush #8
/*     */     //   180: iand
/*     */     //   181: ifeq -> 195
/*     */     //   184: iload #11
/*     */     //   186: sipush #3072
/*     */     //   189: ior
/*     */     //   190: istore #11
/*     */     //   192: goto -> 229
/*     */     //   195: iload #9
/*     */     //   197: sipush #3072
/*     */     //   200: iand
/*     */     //   201: ifne -> 229
/*     */     //   204: iload #11
/*     */     //   206: aload #8
/*     */     //   208: iload_3
/*     */     //   209: invokeinterface changed : (Z)Z
/*     */     //   214: ifeq -> 223
/*     */     //   217: sipush #2048
/*     */     //   220: goto -> 226
/*     */     //   223: sipush #1024
/*     */     //   226: ior
/*     */     //   227: istore #11
/*     */     //   229: iload #10
/*     */     //   231: bipush #16
/*     */     //   233: iand
/*     */     //   234: ifeq -> 248
/*     */     //   237: iload #11
/*     */     //   239: sipush #24576
/*     */     //   242: ior
/*     */     //   243: istore #11
/*     */     //   245: goto -> 283
/*     */     //   248: iload #9
/*     */     //   250: sipush #24576
/*     */     //   253: iand
/*     */     //   254: ifne -> 283
/*     */     //   257: iload #11
/*     */     //   259: aload #8
/*     */     //   261: iload #4
/*     */     //   263: invokeinterface changed : (Z)Z
/*     */     //   268: ifeq -> 277
/*     */     //   271: sipush #16384
/*     */     //   274: goto -> 280
/*     */     //   277: sipush #8192
/*     */     //   280: ior
/*     */     //   281: istore #11
/*     */     //   283: iload #9
/*     */     //   285: ldc 196608
/*     */     //   287: iand
/*     */     //   288: ifne -> 323
/*     */     //   291: iload #11
/*     */     //   293: iload #10
/*     */     //   295: bipush #32
/*     */     //   297: iand
/*     */     //   298: ifne -> 318
/*     */     //   301: aload #8
/*     */     //   303: aload #5
/*     */     //   305: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   310: ifeq -> 318
/*     */     //   313: ldc 131072
/*     */     //   315: goto -> 320
/*     */     //   318: ldc 65536
/*     */     //   320: ior
/*     */     //   321: istore #11
/*     */     //   323: iload #10
/*     */     //   325: bipush #64
/*     */     //   327: iand
/*     */     //   328: ifeq -> 341
/*     */     //   331: iload #11
/*     */     //   333: ldc 1572864
/*     */     //   335: ior
/*     */     //   336: istore #11
/*     */     //   338: goto -> 373
/*     */     //   341: iload #9
/*     */     //   343: ldc 1572864
/*     */     //   345: iand
/*     */     //   346: ifne -> 373
/*     */     //   349: iload #11
/*     */     //   351: aload #8
/*     */     //   353: aload #6
/*     */     //   355: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   360: ifeq -> 368
/*     */     //   363: ldc 1048576
/*     */     //   365: goto -> 370
/*     */     //   368: ldc 524288
/*     */     //   370: ior
/*     */     //   371: istore #11
/*     */     //   373: iload #10
/*     */     //   375: sipush #128
/*     */     //   378: iand
/*     */     //   379: ifeq -> 393
/*     */     //   382: iload #11
/*     */     //   384: ldc_w 12582912
/*     */     //   387: ior
/*     */     //   388: istore #11
/*     */     //   390: goto -> 428
/*     */     //   393: iload #9
/*     */     //   395: ldc_w 12582912
/*     */     //   398: iand
/*     */     //   399: ifne -> 428
/*     */     //   402: iload #11
/*     */     //   404: aload #8
/*     */     //   406: aload #7
/*     */     //   408: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   413: ifeq -> 422
/*     */     //   416: ldc_w 8388608
/*     */     //   419: goto -> 425
/*     */     //   422: ldc_w 4194304
/*     */     //   425: ior
/*     */     //   426: istore #11
/*     */     //   428: iload #11
/*     */     //   430: ldc_w 4793491
/*     */     //   433: iand
/*     */     //   434: ldc_w 4793490
/*     */     //   437: if_icmpne -> 450
/*     */     //   440: aload #8
/*     */     //   442: invokeinterface getSkipping : ()Z
/*     */     //   447: ifne -> 2003
/*     */     //   450: aload #8
/*     */     //   452: invokeinterface startDefaults : ()V
/*     */     //   457: iload #9
/*     */     //   459: iconst_1
/*     */     //   460: iand
/*     */     //   461: ifeq -> 474
/*     */     //   464: aload #8
/*     */     //   466: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   471: ifeq -> 634
/*     */     //   474: iload #10
/*     */     //   476: iconst_4
/*     */     //   477: iand
/*     */     //   478: ifeq -> 488
/*     */     //   481: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   484: checkcast androidx/compose/ui/Modifier
/*     */     //   487: astore_2
/*     */     //   488: iload #10
/*     */     //   490: bipush #8
/*     */     //   492: iand
/*     */     //   493: ifeq -> 498
/*     */     //   496: iconst_1
/*     */     //   497: istore_3
/*     */     //   498: iload #10
/*     */     //   500: bipush #16
/*     */     //   502: iand
/*     */     //   503: ifeq -> 509
/*     */     //   506: iconst_1
/*     */     //   507: istore #4
/*     */     //   509: iload #10
/*     */     //   511: bipush #32
/*     */     //   513: iand
/*     */     //   514: ifeq -> 537
/*     */     //   517: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   520: aload #8
/*     */     //   522: bipush #6
/*     */     //   524: invokestatic getIconButtonStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   527: astore #5
/*     */     //   529: iload #11
/*     */     //   531: ldc_w -458753
/*     */     //   534: iand
/*     */     //   535: istore #11
/*     */     //   537: iload #10
/*     */     //   539: bipush #64
/*     */     //   541: iand
/*     */     //   542: ifeq -> 657
/*     */     //   545: aload #8
/*     */     //   547: ldc_w 495904990
/*     */     //   550: invokeinterface startReplaceGroup : (I)V
/*     */     //   555: aload #8
/*     */     //   557: astore #13
/*     */     //   559: iconst_0
/*     */     //   560: istore #14
/*     */     //   562: iconst_0
/*     */     //   563: istore #15
/*     */     //   565: aload #13
/*     */     //   567: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   572: astore #16
/*     */     //   574: iconst_0
/*     */     //   575: istore #17
/*     */     //   577: aload #16
/*     */     //   579: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   582: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   585: if_acmpne -> 610
/*     */     //   588: iconst_0
/*     */     //   589: istore #18
/*     */     //   591: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   594: astore #18
/*     */     //   596: aload #13
/*     */     //   598: aload #18
/*     */     //   600: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   605: aload #18
/*     */     //   607: goto -> 612
/*     */     //   610: aload #16
/*     */     //   612: nop
/*     */     //   613: nop
/*     */     //   614: nop
/*     */     //   615: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   618: astore #12
/*     */     //   620: aload #8
/*     */     //   622: invokeinterface endReplaceGroup : ()V
/*     */     //   627: aload #12
/*     */     //   629: astore #6
/*     */     //   631: goto -> 657
/*     */     //   634: aload #8
/*     */     //   636: invokeinterface skipToGroupEnd : ()V
/*     */     //   641: iload #10
/*     */     //   643: bipush #32
/*     */     //   645: iand
/*     */     //   646: ifeq -> 657
/*     */     //   649: iload #11
/*     */     //   651: ldc_w -458753
/*     */     //   654: iand
/*     */     //   655: istore #11
/*     */     //   657: aload #8
/*     */     //   659: invokeinterface endDefaults : ()V
/*     */     //   664: invokestatic isTraceInProgress : ()Z
/*     */     //   667: ifeq -> 682
/*     */     //   670: ldc_w 91004548
/*     */     //   673: iload #11
/*     */     //   675: iconst_m1
/*     */     //   676: ldc_w 'org.jetbrains.jewel.ui.component.ToggleableIconButton (IconButton.kt:164)'
/*     */     //   679: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   682: aload #8
/*     */     //   684: ldc_w 495909558
/*     */     //   687: invokeinterface startReplaceGroup : (I)V
/*     */     //   692: aload #8
/*     */     //   694: astore #14
/*     */     //   696: iload #11
/*     */     //   698: ldc_w 3670016
/*     */     //   701: iand
/*     */     //   702: ldc 1048576
/*     */     //   704: if_icmpne -> 711
/*     */     //   707: iconst_1
/*     */     //   708: goto -> 712
/*     */     //   711: iconst_0
/*     */     //   712: istore #15
/*     */     //   714: nop
/*     */     //   715: iconst_0
/*     */     //   716: istore #16
/*     */     //   718: aload #14
/*     */     //   720: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   725: astore #17
/*     */     //   727: iconst_0
/*     */     //   728: istore #18
/*     */     //   730: iload #15
/*     */     //   732: ifne -> 746
/*     */     //   735: aload #17
/*     */     //   737: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   740: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   743: if_acmpne -> 789
/*     */     //   746: iconst_0
/*     */     //   747: istore #19
/*     */     //   749: getstatic org/jetbrains/jewel/ui/component/ToggleableIconButtonState.Companion : Lorg/jetbrains/jewel/ui/component/ToggleableIconButtonState$Companion;
/*     */     //   752: iload_3
/*     */     //   753: aconst_null
/*     */     //   754: iconst_0
/*     */     //   755: iconst_0
/*     */     //   756: iconst_0
/*     */     //   757: iconst_0
/*     */     //   758: bipush #62
/*     */     //   760: aconst_null
/*     */     //   761: invokestatic of-CAf7mdk$default : (Lorg/jetbrains/jewel/ui/component/ToggleableIconButtonState$Companion;ZLandroidx/compose/ui/state/ToggleableState;ZZZZILjava/lang/Object;)J
/*     */     //   764: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/ToggleableIconButtonState;
/*     */     //   767: aconst_null
/*     */     //   768: iconst_2
/*     */     //   769: aconst_null
/*     */     //   770: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   773: astore #20
/*     */     //   775: aload #14
/*     */     //   777: aload #20
/*     */     //   779: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   784: aload #20
/*     */     //   786: goto -> 791
/*     */     //   789: aload #17
/*     */     //   791: nop
/*     */     //   792: nop
/*     */     //   793: nop
/*     */     //   794: checkcast androidx/compose/runtime/MutableState
/*     */     //   797: astore #13
/*     */     //   799: aload #8
/*     */     //   801: invokeinterface endReplaceGroup : ()V
/*     */     //   806: aload #13
/*     */     //   808: astore #12
/*     */     //   810: aload #8
/*     */     //   812: ldc_w 495912827
/*     */     //   815: invokeinterface startReplaceGroup : (I)V
/*     */     //   820: aload #8
/*     */     //   822: astore #13
/*     */     //   824: iload #11
/*     */     //   826: sipush #7168
/*     */     //   829: iand
/*     */     //   830: sipush #2048
/*     */     //   833: if_icmpne -> 840
/*     */     //   836: iconst_1
/*     */     //   837: goto -> 841
/*     */     //   840: iconst_0
/*     */     //   841: iload #11
/*     */     //   843: bipush #14
/*     */     //   845: iand
/*     */     //   846: iconst_4
/*     */     //   847: if_icmpne -> 854
/*     */     //   850: iconst_1
/*     */     //   851: goto -> 855
/*     */     //   854: iconst_0
/*     */     //   855: ior
/*     */     //   856: istore #14
/*     */     //   858: nop
/*     */     //   859: iconst_0
/*     */     //   860: istore #15
/*     */     //   862: aload #13
/*     */     //   864: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   869: astore #16
/*     */     //   871: iconst_0
/*     */     //   872: istore #17
/*     */     //   874: iload #14
/*     */     //   876: ifne -> 890
/*     */     //   879: aload #16
/*     */     //   881: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   884: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   887: if_acmpne -> 937
/*     */     //   890: iconst_0
/*     */     //   891: istore #18
/*     */     //   893: aload #12
/*     */     //   895: aload #12
/*     */     //   897: invokestatic ToggleableIconButton$lambda$30 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   900: iload_3
/*     */     //   901: iload_0
/*     */     //   902: invokestatic ToggleableState : (Z)Landroidx/compose/ui/state/ToggleableState;
/*     */     //   905: iconst_0
/*     */     //   906: iconst_0
/*     */     //   907: iconst_0
/*     */     //   908: iconst_0
/*     */     //   909: bipush #60
/*     */     //   911: aconst_null
/*     */     //   912: invokestatic copy-CAf7mdk$default : (JZLandroidx/compose/ui/state/ToggleableState;ZZZZILjava/lang/Object;)J
/*     */     //   915: invokestatic ToggleableIconButton$lambda$31 : (Landroidx/compose/runtime/MutableState;J)V
/*     */     //   918: nop
/*     */     //   919: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   922: astore #19
/*     */     //   924: aload #13
/*     */     //   926: aload #19
/*     */     //   928: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   933: nop
/*     */     //   934: goto -> 938
/*     */     //   937: nop
/*     */     //   938: nop
/*     */     //   939: nop
/*     */     //   940: nop
/*     */     //   941: aload #8
/*     */     //   943: invokeinterface endReplaceGroup : ()V
/*     */     //   948: aload #6
/*     */     //   950: aload #8
/*     */     //   952: ldc_w 495919159
/*     */     //   955: invokeinterface startReplaceGroup : (I)V
/*     */     //   960: aload #8
/*     */     //   962: astore #14
/*     */     //   964: iload #11
/*     */     //   966: ldc_w 3670016
/*     */     //   969: iand
/*     */     //   970: ldc 1048576
/*     */     //   972: if_icmpne -> 979
/*     */     //   975: iconst_1
/*     */     //   976: goto -> 980
/*     */     //   979: iconst_0
/*     */     //   980: aload #8
/*     */     //   982: aload #12
/*     */     //   984: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   989: ior
/*     */     //   990: iload #11
/*     */     //   992: ldc_w 57344
/*     */     //   995: iand
/*     */     //   996: sipush #16384
/*     */     //   999: if_icmpne -> 1006
/*     */     //   1002: iconst_1
/*     */     //   1003: goto -> 1007
/*     */     //   1006: iconst_0
/*     */     //   1007: ior
/*     */     //   1008: istore #15
/*     */     //   1010: iconst_0
/*     */     //   1011: istore #16
/*     */     //   1013: aload #14
/*     */     //   1015: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1020: astore #17
/*     */     //   1022: iconst_0
/*     */     //   1023: istore #18
/*     */     //   1025: iload #15
/*     */     //   1027: ifne -> 1041
/*     */     //   1030: aload #17
/*     */     //   1032: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1035: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1038: if_acmpne -> 1082
/*     */     //   1041: astore #43
/*     */     //   1043: iconst_0
/*     */     //   1044: istore #19
/*     */     //   1046: new org/jetbrains/jewel/ui/component/IconButtonKt$ToggleableIconButton$3$1
/*     */     //   1049: dup
/*     */     //   1050: aload #6
/*     */     //   1052: iload #4
/*     */     //   1054: aload #12
/*     */     //   1056: aconst_null
/*     */     //   1057: invokespecial <init> : (Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLandroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*     */     //   1060: checkcast kotlin/jvm/functions/Function2
/*     */     //   1063: aload #43
/*     */     //   1065: swap
/*     */     //   1066: astore #20
/*     */     //   1068: aload #14
/*     */     //   1070: aload #20
/*     */     //   1072: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1077: aload #20
/*     */     //   1079: goto -> 1084
/*     */     //   1082: aload #17
/*     */     //   1084: nop
/*     */     //   1085: nop
/*     */     //   1086: nop
/*     */     //   1087: checkcast kotlin/jvm/functions/Function2
/*     */     //   1090: astore #13
/*     */     //   1092: aload #8
/*     */     //   1094: invokeinterface endReplaceGroup : ()V
/*     */     //   1099: aload #13
/*     */     //   1101: aload #8
/*     */     //   1103: bipush #14
/*     */     //   1105: iload #11
/*     */     //   1107: bipush #18
/*     */     //   1109: ishr
/*     */     //   1110: iand
/*     */     //   1111: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1114: aload #5
/*     */     //   1116: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/IconButtonMetrics;
/*     */     //   1119: invokevirtual getCornerSize : ()Landroidx/compose/foundation/shape/CornerSize;
/*     */     //   1122: invokestatic RoundedCornerShape : (Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   1125: astore #13
/*     */     //   1127: aload #5
/*     */     //   1129: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/IconButtonColors;
/*     */     //   1132: aload #12
/*     */     //   1134: invokestatic ToggleableIconButton$lambda$30 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1137: aload #8
/*     */     //   1139: iconst_0
/*     */     //   1140: invokevirtual toggleableBackgroundFor-hDcPvVY : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1143: astore #14
/*     */     //   1145: aload #5
/*     */     //   1147: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/IconButtonColors;
/*     */     //   1150: aload #12
/*     */     //   1152: invokestatic ToggleableIconButton$lambda$30 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1155: aload #8
/*     */     //   1157: iconst_0
/*     */     //   1158: invokevirtual toggleableBorderFor-hDcPvVY : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1161: astore #15
/*     */     //   1163: aload #8
/*     */     //   1165: ldc_w 495950002
/*     */     //   1168: invokeinterface startReplaceGroup : (I)V
/*     */     //   1173: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1176: checkcast androidx/compose/ui/Modifier
/*     */     //   1179: astore #18
/*     */     //   1181: iload #4
/*     */     //   1183: ifne -> 1190
/*     */     //   1186: iconst_1
/*     */     //   1187: goto -> 1191
/*     */     //   1190: iconst_0
/*     */     //   1191: istore #19
/*     */     //   1193: iconst_0
/*     */     //   1194: istore #20
/*     */     //   1196: iload #19
/*     */     //   1198: ifeq -> 1307
/*     */     //   1201: aload #18
/*     */     //   1203: astore #21
/*     */     //   1205: iconst_0
/*     */     //   1206: istore #22
/*     */     //   1208: aload #21
/*     */     //   1210: aload #8
/*     */     //   1212: ldc_w 1427313834
/*     */     //   1215: invokeinterface startReplaceGroup : (I)V
/*     */     //   1220: aload #8
/*     */     //   1222: astore #23
/*     */     //   1224: iconst_0
/*     */     //   1225: istore #24
/*     */     //   1227: iconst_0
/*     */     //   1228: istore #25
/*     */     //   1230: aload #23
/*     */     //   1232: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1237: astore #26
/*     */     //   1239: iconst_0
/*     */     //   1240: istore #27
/*     */     //   1242: aload #26
/*     */     //   1244: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1247: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1250: if_acmpne -> 1282
/*     */     //   1253: astore #28
/*     */     //   1255: iconst_0
/*     */     //   1256: istore #29
/*     */     //   1258: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   1263: aload #28
/*     */     //   1265: swap
/*     */     //   1266: astore #29
/*     */     //   1268: aload #23
/*     */     //   1270: aload #29
/*     */     //   1272: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1277: aload #29
/*     */     //   1279: goto -> 1284
/*     */     //   1282: aload #26
/*     */     //   1284: nop
/*     */     //   1285: nop
/*     */     //   1286: nop
/*     */     //   1287: checkcast kotlin/jvm/functions/Function1
/*     */     //   1290: astore #30
/*     */     //   1292: aload #8
/*     */     //   1294: invokeinterface endReplaceGroup : ()V
/*     */     //   1299: aload #30
/*     */     //   1301: invokestatic focusProperties : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   1304: goto -> 1309
/*     */     //   1307: aload #18
/*     */     //   1309: astore #17
/*     */     //   1311: aload #8
/*     */     //   1313: invokeinterface endReplaceGroup : ()V
/*     */     //   1318: aload #17
/*     */     //   1320: aload_2
/*     */     //   1321: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1326: astore #16
/*     */     //   1328: getstatic androidx/compose/ui/semantics/Role.Companion : Landroidx/compose/ui/semantics/Role$Companion;
/*     */     //   1331: invokevirtual getCheckbox-o7Vup1c : ()I
/*     */     //   1334: istore #17
/*     */     //   1336: aload #12
/*     */     //   1338: invokestatic ToggleableIconButton$lambda$30 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1341: invokestatic getToggleableState-impl : (J)Landroidx/compose/ui/state/ToggleableState;
/*     */     //   1344: getstatic androidx/compose/ui/state/ToggleableState.On : Landroidx/compose/ui/state/ToggleableState;
/*     */     //   1347: if_acmpne -> 1354
/*     */     //   1350: iconst_1
/*     */     //   1351: goto -> 1355
/*     */     //   1354: iconst_0
/*     */     //   1355: istore #18
/*     */     //   1357: aload #16
/*     */     //   1359: iload #18
/*     */     //   1361: aload #6
/*     */     //   1363: aconst_null
/*     */     //   1364: iload_3
/*     */     //   1365: iload #17
/*     */     //   1367: invokestatic box-impl : (I)Landroidx/compose/ui/semantics/Role;
/*     */     //   1370: aload_1
/*     */     //   1371: invokestatic toggleable-O2vRcR0 : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   1374: iload_3
/*     */     //   1375: aload #8
/*     */     //   1377: ldc_w 495965862
/*     */     //   1380: invokeinterface startReplaceGroup : (I)V
/*     */     //   1385: aload #8
/*     */     //   1387: astore #17
/*     */     //   1389: aload #8
/*     */     //   1391: aload #12
/*     */     //   1393: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1398: istore #18
/*     */     //   1400: iconst_0
/*     */     //   1401: istore #19
/*     */     //   1403: aload #17
/*     */     //   1405: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1410: astore #20
/*     */     //   1412: iconst_0
/*     */     //   1413: istore #21
/*     */     //   1415: iload #18
/*     */     //   1417: ifne -> 1431
/*     */     //   1420: aload #20
/*     */     //   1422: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1425: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1428: if_acmpne -> 1469
/*     */     //   1431: istore #44
/*     */     //   1433: astore #43
/*     */     //   1435: iconst_0
/*     */     //   1436: istore #22
/*     */     //   1438: aload #12
/*     */     //   1440: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   1445: astore #45
/*     */     //   1447: aload #43
/*     */     //   1449: iload #44
/*     */     //   1451: aload #45
/*     */     //   1453: astore #23
/*     */     //   1455: aload #17
/*     */     //   1457: aload #23
/*     */     //   1459: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1464: aload #23
/*     */     //   1466: goto -> 1471
/*     */     //   1469: aload #20
/*     */     //   1471: nop
/*     */     //   1472: nop
/*     */     //   1473: nop
/*     */     //   1474: checkcast kotlin/jvm/functions/Function1
/*     */     //   1477: astore #16
/*     */     //   1479: aload #8
/*     */     //   1481: invokeinterface endReplaceGroup : ()V
/*     */     //   1486: aload #16
/*     */     //   1488: invokestatic onActivated : (Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   1491: aload #5
/*     */     //   1493: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/IconButtonMetrics;
/*     */     //   1496: invokevirtual getMinSize-MYxV2XQ : ()J
/*     */     //   1499: invokestatic getWidth-D9Ej5fM : (J)F
/*     */     //   1502: aload #5
/*     */     //   1504: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/IconButtonMetrics;
/*     */     //   1507: invokevirtual getMinSize-MYxV2XQ : ()J
/*     */     //   1510: invokestatic getHeight-D9Ej5fM : (J)F
/*     */     //   1513: invokestatic defaultMinSize-VpY3zN4 : (Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;
/*     */     //   1516: aload #5
/*     */     //   1518: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/IconButtonMetrics;
/*     */     //   1521: invokevirtual getPadding : ()Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   1524: invokestatic padding : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;
/*     */     //   1527: aload #14
/*     */     //   1529: invokestatic ToggleableIconButton$lambda$34 : (Landroidx/compose/runtime/State;)J
/*     */     //   1532: aload #13
/*     */     //   1534: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   1537: invokestatic background-bw27NRU : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*     */     //   1540: aload #5
/*     */     //   1542: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/IconButtonMetrics;
/*     */     //   1545: invokevirtual getBorderWidth-D9Ej5fM : ()F
/*     */     //   1548: aload #15
/*     */     //   1550: invokestatic ToggleableIconButton$lambda$35 : (Landroidx/compose/runtime/State;)J
/*     */     //   1553: aload #13
/*     */     //   1555: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   1558: invokestatic border-xT4_qwU : (Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*     */     //   1561: astore #16
/*     */     //   1563: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1566: invokevirtual getCenter : ()Landroidx/compose/ui/Alignment;
/*     */     //   1569: astore #17
/*     */     //   1571: bipush #48
/*     */     //   1573: istore #19
/*     */     //   1575: nop
/*     */     //   1576: iconst_0
/*     */     //   1577: istore #20
/*     */     //   1579: aload #8
/*     */     //   1581: ldc_w 733328855
/*     */     //   1584: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   1587: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1590: iconst_0
/*     */     //   1591: istore #18
/*     */     //   1593: aload #17
/*     */     //   1595: iload #18
/*     */     //   1597: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1600: astore #21
/*     */     //   1602: bipush #112
/*     */     //   1604: iload #19
/*     */     //   1606: iconst_3
/*     */     //   1607: ishl
/*     */     //   1608: iand
/*     */     //   1609: istore #22
/*     */     //   1611: nop
/*     */     //   1612: iconst_0
/*     */     //   1613: istore #23
/*     */     //   1615: aload #8
/*     */     //   1617: ldc_w -1323940314
/*     */     //   1620: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1623: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1626: aload #8
/*     */     //   1628: iconst_0
/*     */     //   1629: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1632: istore #24
/*     */     //   1634: aload #8
/*     */     //   1636: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1641: astore #25
/*     */     //   1643: aload #8
/*     */     //   1645: aload #16
/*     */     //   1647: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1650: astore #26
/*     */     //   1652: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1655: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1658: astore #27
/*     */     //   1660: bipush #6
/*     */     //   1662: sipush #896
/*     */     //   1665: iload #22
/*     */     //   1667: bipush #6
/*     */     //   1669: ishl
/*     */     //   1670: iand
/*     */     //   1671: ior
/*     */     //   1672: istore #28
/*     */     //   1674: nop
/*     */     //   1675: iconst_0
/*     */     //   1676: istore #29
/*     */     //   1678: aload #8
/*     */     //   1680: ldc_w -692256719
/*     */     //   1683: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1686: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1689: aload #8
/*     */     //   1691: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1696: instanceof androidx/compose/runtime/Applier
/*     */     //   1699: ifne -> 1705
/*     */     //   1702: invokestatic invalidApplier : ()V
/*     */     //   1705: aload #8
/*     */     //   1707: invokeinterface startReusableNode : ()V
/*     */     //   1712: aload #8
/*     */     //   1714: invokeinterface getInserting : ()Z
/*     */     //   1719: ifeq -> 1734
/*     */     //   1722: aload #8
/*     */     //   1724: aload #27
/*     */     //   1726: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1731: goto -> 1741
/*     */     //   1734: aload #8
/*     */     //   1736: invokeinterface useNode : ()V
/*     */     //   1741: aload #8
/*     */     //   1743: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1746: astore #30
/*     */     //   1748: iconst_0
/*     */     //   1749: istore #31
/*     */     //   1751: aload #30
/*     */     //   1753: aload #21
/*     */     //   1755: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1758: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1761: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1764: aload #30
/*     */     //   1766: aload #25
/*     */     //   1768: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1771: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1774: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1777: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1780: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1783: astore #32
/*     */     //   1785: iconst_0
/*     */     //   1786: istore #33
/*     */     //   1788: aload #30
/*     */     //   1790: astore #34
/*     */     //   1792: iconst_0
/*     */     //   1793: istore #35
/*     */     //   1795: aload #34
/*     */     //   1797: invokeinterface getInserting : ()Z
/*     */     //   1802: ifne -> 1823
/*     */     //   1805: aload #34
/*     */     //   1807: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1812: iload #24
/*     */     //   1814: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1817: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1820: ifne -> 1849
/*     */     //   1823: aload #34
/*     */     //   1825: iload #24
/*     */     //   1827: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1830: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1835: aload #30
/*     */     //   1837: iload #24
/*     */     //   1839: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1842: aload #32
/*     */     //   1844: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1849: nop
/*     */     //   1850: nop
/*     */     //   1851: nop
/*     */     //   1852: aload #30
/*     */     //   1854: aload #26
/*     */     //   1856: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1859: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1862: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1865: nop
/*     */     //   1866: nop
/*     */     //   1867: aload #8
/*     */     //   1869: bipush #14
/*     */     //   1871: iload #28
/*     */     //   1873: bipush #6
/*     */     //   1875: ishr
/*     */     //   1876: iand
/*     */     //   1877: istore #36
/*     */     //   1879: astore #37
/*     */     //   1881: iconst_0
/*     */     //   1882: istore #38
/*     */     //   1884: aload #37
/*     */     //   1886: ldc_w -2146769399
/*     */     //   1889: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   1892: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1895: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   1898: aload #37
/*     */     //   1900: bipush #6
/*     */     //   1902: bipush #112
/*     */     //   1904: iload #19
/*     */     //   1906: bipush #6
/*     */     //   1908: ishr
/*     */     //   1909: iand
/*     */     //   1910: ior
/*     */     //   1911: istore #39
/*     */     //   1913: astore #40
/*     */     //   1915: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   1918: astore #41
/*     */     //   1920: iconst_0
/*     */     //   1921: istore #42
/*     */     //   1923: aload #7
/*     */     //   1925: aload #41
/*     */     //   1927: aload #12
/*     */     //   1929: invokestatic ToggleableIconButton$lambda$30 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1932: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/ToggleableIconButtonState;
/*     */     //   1935: aload #40
/*     */     //   1937: bipush #14
/*     */     //   1939: iload #39
/*     */     //   1941: iand
/*     */     //   1942: sipush #896
/*     */     //   1945: iload #11
/*     */     //   1947: bipush #15
/*     */     //   1949: ishr
/*     */     //   1950: iand
/*     */     //   1951: ior
/*     */     //   1952: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1955: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1960: pop
/*     */     //   1961: aload #37
/*     */     //   1963: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1966: aload #8
/*     */     //   1968: invokeinterface endNode : ()V
/*     */     //   1973: aload #8
/*     */     //   1975: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1978: nop
/*     */     //   1979: aload #8
/*     */     //   1981: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1984: nop
/*     */     //   1985: aload #8
/*     */     //   1987: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1990: nop
/*     */     //   1991: invokestatic isTraceInProgress : ()Z
/*     */     //   1994: ifeq -> 2010
/*     */     //   1997: invokestatic traceEventEnd : ()V
/*     */     //   2000: goto -> 2010
/*     */     //   2003: aload #8
/*     */     //   2005: invokeinterface skipToGroupEnd : ()V
/*     */     //   2010: aload #8
/*     */     //   2012: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   2017: dup
/*     */     //   2018: ifnull -> 2050
/*     */     //   2021: iload_0
/*     */     //   2022: aload_1
/*     */     //   2023: aload_2
/*     */     //   2024: iload_3
/*     */     //   2025: iload #4
/*     */     //   2027: aload #5
/*     */     //   2029: aload #6
/*     */     //   2031: aload #7
/*     */     //   2033: iload #9
/*     */     //   2035: iload #10
/*     */     //   2037: <illegal opcode> invoke : (ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function4;II)Lkotlin/jvm/functions/Function2;
/*     */     //   2042: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   2047: goto -> 2051
/*     */     //   2050: pop
/*     */     //   2051: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #165	-> 14
/*     */     //   #159	-> 481
/*     */     //   #160	-> 496
/*     */     //   #161	-> 506
/*     */     //   #162	-> 517
/*     */     //   #163	-> 545
/*     */     //   #535	-> 565
/*     */     //   #536	-> 577
/*     */     //   #537	-> 588
/*     */     //   #163	-> 591
/*     */     //   #537	-> 594
/*     */     //   #538	-> 596
/*     */     //   #539	-> 605
/*     */     //   #540	-> 610
/*     */     //   #536	-> 612
/*     */     //   #535	-> 613
/*     */     //   #535	-> 614
/*     */     //   #163	-> 615
/*     */     //   #165	-> 679
/*     */     //   #166	-> 714
/*     */     //   #541	-> 718
/*     */     //   #542	-> 730
/*     */     //   #543	-> 746
/*     */     //   #166	-> 749
/*     */     //   #543	-> 773
/*     */     //   #544	-> 775
/*     */     //   #545	-> 784
/*     */     //   #546	-> 789
/*     */     //   #542	-> 791
/*     */     //   #541	-> 792
/*     */     //   #541	-> 793
/*     */     //   #166	-> 794
/*     */     //   #168	-> 858
/*     */     //   #547	-> 862
/*     */     //   #548	-> 874
/*     */     //   #549	-> 890
/*     */     //   #169	-> 893
/*     */     //   #170	-> 918
/*     */     //   #549	-> 922
/*     */     //   #550	-> 924
/*     */     //   #551	-> 933
/*     */     //   #552	-> 937
/*     */     //   #548	-> 938
/*     */     //   #547	-> 939
/*     */     //   #547	-> 940
/*     */     //   #172	-> 948
/*     */     //   #553	-> 1013
/*     */     //   #554	-> 1025
/*     */     //   #555	-> 1041
/*     */     //   #172	-> 1046
/*     */     //   #555	-> 1066
/*     */     //   #556	-> 1068
/*     */     //   #557	-> 1077
/*     */     //   #558	-> 1082
/*     */     //   #554	-> 1084
/*     */     //   #553	-> 1085
/*     */     //   #553	-> 1086
/*     */     //   #172	-> 1087
/*     */     //   #187	-> 1114
/*     */     //   #188	-> 1127
/*     */     //   #189	-> 1145
/*     */     //   #193	-> 1173
/*     */     //   #559	-> 1196
/*     */     //   #193	-> 1208
/*     */     //   #560	-> 1230
/*     */     //   #561	-> 1242
/*     */     //   #562	-> 1253
/*     */     //   #562	-> 1266
/*     */     //   #563	-> 1268
/*     */     //   #564	-> 1277
/*     */     //   #565	-> 1282
/*     */     //   #561	-> 1284
/*     */     //   #560	-> 1285
/*     */     //   #560	-> 1286
/*     */     //   #193	-> 1287
/*     */     //   #559	-> 1304
/*     */     //   #193	-> 1309
/*     */     //   #194	-> 1320
/*     */     //   #198	-> 1328
/*     */     //   #201	-> 1336
/*     */     //   #194	-> 1357
/*     */     //   #201	-> 1359
/*     */     //   #199	-> 1361
/*     */     //   #200	-> 1363
/*     */     //   #197	-> 1364
/*     */     //   #198	-> 1365
/*     */     //   #196	-> 1370
/*     */     //   #195	-> 1371
/*     */     //   #203	-> 1374
/*     */     //   #566	-> 1403
/*     */     //   #567	-> 1415
/*     */     //   #568	-> 1431
/*     */     //   #203	-> 1438
/*     */     //   #568	-> 1453
/*     */     //   #569	-> 1455
/*     */     //   #570	-> 1464
/*     */     //   #571	-> 1469
/*     */     //   #567	-> 1471
/*     */     //   #566	-> 1472
/*     */     //   #566	-> 1473
/*     */     //   #203	-> 1474
/*     */     //   #204	-> 1491
/*     */     //   #205	-> 1516
/*     */     //   #206	-> 1527
/*     */     //   #207	-> 1540
/*     */     //   #208	-> 1563
/*     */     //   #191	-> 1575
/*     */     //   #572	-> 1587
/*     */     //   #573	-> 1590
/*     */     //   #576	-> 1593
/*     */     //   #577	-> 1611
/*     */     //   #578	-> 1623
/*     */     //   #579	-> 1629
/*     */     //   #580	-> 1636
/*     */     //   #581	-> 1645
/*     */     //   #583	-> 1652
/*     */     //   #582	-> 1674
/*     */     //   #584	-> 1686
/*     */     //   #585	-> 1689
/*     */     //   #586	-> 1707
/*     */     //   #587	-> 1712
/*     */     //   #588	-> 1724
/*     */     //   #590	-> 1736
/*     */     //   #592	-> 1741
/*     */     //   #593	-> 1751
/*     */     //   #594	-> 1764
/*     */     //   #596	-> 1777
/*     */     //   #597	-> 1788
/*     */     //   #598	-> 1795
/*     */     //   #599	-> 1823
/*     */     //   #600	-> 1835
/*     */     //   #602	-> 1849
/*     */     //   #597	-> 1850
/*     */     //   #602	-> 1851
/*     */     //   #603	-> 1852
/*     */     //   #604	-> 1865
/*     */     //   #592	-> 1866
/*     */     //   #605	-> 1867
/*     */     //   #606	-> 1892
/*     */     //   #209	-> 1923
/*     */     //   #606	-> 1961
/*     */     //   #605	-> 1966
/*     */     //   #607	-> 1968
/*     */     //   #584	-> 1975
/*     */     //   #608	-> 1978
/*     */     //   #578	-> 1981
/*     */     //   #609	-> 1984
/*     */     //   #572	-> 1987
/*     */     //   #610	-> 1990
/*     */     //   #211	-> 2003
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   591	3	18	$i$a$-cache-IconButtonKt$ToggleableIconButton$1	I
/*     */     //   596	11	18	value$iv	Ljava/lang/Object;
/*     */     //   577	36	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   574	39	16	it$iv	Ljava/lang/Object;
/*     */     //   565	50	15	$i$f$cache	I
/*     */     //   562	53	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   562	53	14	invalid$iv	Z
/*     */     //   749	24	19	$i$a$-cache-IconButtonKt$ToggleableIconButton$buttonState$2	I
/*     */     //   775	11	20	value$iv	Ljava/lang/Object;
/*     */     //   730	62	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   727	65	17	it$iv	Ljava/lang/Object;
/*     */     //   718	76	16	$i$f$cache	I
/*     */     //   715	79	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   715	79	15	invalid$iv	Z
/*     */     //   893	26	18	$i$a$-cache-IconButtonKt$ToggleableIconButton$2	I
/*     */     //   924	10	19	value$iv	Ljava/lang/Object;
/*     */     //   874	65	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   871	68	16	it$iv	Ljava/lang/Object;
/*     */     //   862	79	15	$i$f$cache	I
/*     */     //   859	82	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   859	82	14	invalid$iv	Z
/*     */     //   1046	17	19	$i$a$-cache-IconButtonKt$ToggleableIconButton$3	I
/*     */     //   1068	11	20	value$iv	Ljava/lang/Object;
/*     */     //   1025	60	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1022	63	17	it$iv	Ljava/lang/Object;
/*     */     //   1013	74	16	$i$f$cache	I
/*     */     //   1010	77	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1010	77	15	invalid$iv	Z
/*     */     //   1258	5	29	$i$a$-cache-IconButtonKt$ToggleableIconButton$4$1	I
/*     */     //   1268	11	29	value$iv	Ljava/lang/Object;
/*     */     //   1242	43	27	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1239	46	26	it$iv	Ljava/lang/Object;
/*     */     //   1230	57	25	$i$f$cache	I
/*     */     //   1227	60	23	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1227	60	24	invalid$iv	Z
/*     */     //   1208	96	22	$i$a$-thenIf-IconButtonKt$ToggleableIconButton$4	I
/*     */     //   1205	99	21	$this$ToggleableIconButton_u24lambda_u2438	Landroidx/compose/ui/Modifier;
/*     */     //   1196	113	20	$i$f$thenIf	I
/*     */     //   1193	116	18	$this$thenIf$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1193	116	19	precondition$iv	Z
/*     */     //   1438	7	22	$i$a$-cache-IconButtonKt$ToggleableIconButton$5	I
/*     */     //   1455	11	23	value$iv	Ljava/lang/Object;
/*     */     //   1415	57	21	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1412	60	20	it$iv	Ljava/lang/Object;
/*     */     //   1403	71	19	$i$f$cache	I
/*     */     //   1400	74	17	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1400	74	18	invalid$iv	Z
/*     */     //   1923	38	42	$i$a$-Box-IconButtonKt$ToggleableIconButton$6	I
/*     */     //   1920	41	41	$this$ToggleableIconButton_u24lambda_u2441	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   1920	41	40	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1920	41	39	$changed	I
/*     */     //   1884	82	38	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   1881	85	37	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1881	85	36	$changed$iv	I
/*     */     //   1795	55	35	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1792	58	34	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1788	64	33	$i$f$set-impl	I
/*     */     //   1785	67	32	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1751	115	31	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1748	118	30	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1678	301	29	$i$f$ReusableComposeNode	I
/*     */     //   1675	304	27	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1675	304	28	$changed$iv$iv$iv	I
/*     */     //   1615	370	23	$i$f$Layout	I
/*     */     //   1634	351	24	compositeKeyHash$iv$iv	I
/*     */     //   1643	342	25	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1652	333	26	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1612	373	22	$changed$iv$iv	I
/*     */     //   1579	412	20	$i$f$Box	I
/*     */     //   1602	389	21	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1576	415	16	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1576	415	17	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   1593	398	18	propagateMinConstraints$iv	Z
/*     */     //   1576	415	19	$changed$iv	I
/*     */     //   810	1190	12	buttonState$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   1127	873	13	shape	Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   1145	855	14	background$delegate	Landroidx/compose/runtime/State;
/*     */     //   1163	837	15	border$delegate	Landroidx/compose/runtime/State;
/*     */     //   30	2022	11	$dirty	I
/*     */     //   0	2052	0	value	Z
/*     */     //   0	2052	1	onValueChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	2052	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	2052	3	enabled	Z
/*     */     //   0	2052	4	focusable	Z
/*     */     //   0	2052	5	style	Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*     */     //   0	2052	6	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	2052	7	content	Lkotlin/jvm/functions/Function4;
/*     */     //   0	2052	8	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	2052	9	$changed	I }
/* 621 */   private static final long ToggleableIconButton$lambda$30(MutableState $buttonState$delegate) { State state = (State)$buttonState$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((ToggleableIconButtonState)state.getValue()).unbox-impl(); } private static final void ToggleableIconButton$lambda$31(MutableState $buttonState$delegate, long <set-?>) { MutableState mutableState = $buttonState$delegate; Object object1 = null, object2 = null; Object value$iv = ToggleableIconButtonState.box-impl(<set-?>); int $i$f$setValue = 0;
/* 622 */     mutableState.setValue(value$iv); } @DebugMetadata(f = "IconButton.kt", l = {173}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.IconButtonKt$ToggleableIconButton$3$1") @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class IconButtonKt$ToggleableIconButton$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label; IconButtonKt$ToggleableIconButton$3$1(MutableInteractionSource $interactionSource, boolean $focusable, MutableState<ToggleableIconButtonState> $buttonState$delegate, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$focusable, this.$buttonState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { IconButtonKt.ToggleableIconButton$lambda$31(this.$buttonState$delegate, ToggleableIconButtonState.copy-CAf7mdk$default(IconButtonKt.ToggleableIconButton$lambda$30(this.$buttonState$delegate), false, null, false, true, false, false, 55, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { IconButtonKt.ToggleableIconButton$lambda$31(this.$buttonState$delegate, ToggleableIconButtonState.copy-CAf7mdk$default(IconButtonKt.ToggleableIconButton$lambda$30(this.$buttonState$delegate), false, null, false, false, false, false, 55, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { IconButtonKt.ToggleableIconButton$lambda$31(this.$buttonState$delegate, ToggleableIconButtonState.copy-CAf7mdk$default(IconButtonKt.ToggleableIconButton$lambda$30(this.$buttonState$delegate), false, null, false, false, true, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { IconButtonKt.ToggleableIconButton$lambda$31(this.$buttonState$delegate, ToggleableIconButtonState.copy-CAf7mdk$default(IconButtonKt.ToggleableIconButton$lambda$30(this.$buttonState$delegate), false, null, false, false, false, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { IconButtonKt.ToggleableIconButton$lambda$31(this.$buttonState$delegate, ToggleableIconButtonState.copy-CAf7mdk$default(IconButtonKt.ToggleableIconButton$lambda$30(this.$buttonState$delegate), false, null, this.$focusable, false, false, false, 59, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { IconButtonKt.ToggleableIconButton$lambda$31(this.$buttonState$delegate, ToggleableIconButtonState.copy-CAf7mdk$default(IconButtonKt.ToggleableIconButton$lambda$30(this.$buttonState$delegate), false, null, false, false, false, false, 59, null)); }  return Unit.INSTANCE; } }
/* 624 */               (Continuation)this) == object) return object;  this.$interactionSource.getInteractions().collect(new FlowCollector(this.$focusable, this.$buttonState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { IconButtonKt.ToggleableIconButton$lambda$31(this.$buttonState$delegate, ToggleableIconButtonState.copy-CAf7mdk$default(IconButtonKt.ToggleableIconButton$lambda$30(this.$buttonState$delegate), false, null, false, true, false, false, 55, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { IconButtonKt.ToggleableIconButton$lambda$31(this.$buttonState$delegate, ToggleableIconButtonState.copy-CAf7mdk$default(IconButtonKt.ToggleableIconButton$lambda$30(this.$buttonState$delegate), false, null, false, false, false, false, 55, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { IconButtonKt.ToggleableIconButton$lambda$31(this.$buttonState$delegate, ToggleableIconButtonState.copy-CAf7mdk$default(IconButtonKt.ToggleableIconButton$lambda$30(this.$buttonState$delegate), false, null, false, false, true, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { IconButtonKt.ToggleableIconButton$lambda$31(this.$buttonState$delegate, ToggleableIconButtonState.copy-CAf7mdk$default(IconButtonKt.ToggleableIconButton$lambda$30(this.$buttonState$delegate), false, null, false, false, false, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { IconButtonKt.ToggleableIconButton$lambda$31(this.$buttonState$delegate, ToggleableIconButtonState.copy-CAf7mdk$default(IconButtonKt.ToggleableIconButton$lambda$30(this.$buttonState$delegate), false, null, this.$focusable, false, false, false, 59, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { IconButtonKt.ToggleableIconButton$lambda$31(this.$buttonState$delegate, ToggleableIconButtonState.copy-CAf7mdk$default(IconButtonKt.ToggleableIconButton$lambda$30(this.$buttonState$delegate), false, null, false, false, false, false, 59, null)); }  return Unit.INSTANCE; } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super IconButtonKt$ToggleableIconButton$3$1> $completion) { return (Continuation<Unit>)new IconButtonKt$ToggleableIconButton$3$1(this.$interactionSource, this.$focusable, this.$buttonState$delegate, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((IconButtonKt$ToggleableIconButton$3$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } private static final long ToggleableIconButton$lambda$34(State $background$delegate) { State state = $background$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Color)state.getValue()).unbox-impl(); } private static final long ToggleableIconButton$lambda$35(State $border$delegate) { State state = $border$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 625 */     return ((Color)state.getValue()).unbox-impl(); }
/*     */ 
/*     */   
/*     */   private static final Unit ToggleableIconButton$lambda$38$lambda$37$lambda$36(FocusProperties $this$focusProperties) {
/*     */     Intrinsics.checkNotNullParameter($this$focusProperties, "$this$focusProperties");
/*     */     $this$focusProperties.setCanFocus(false);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit ToggleableIconButton$lambda$40$lambda$39(MutableState<ToggleableIconButtonState> $buttonState$delegate, boolean it) {
/*     */     ToggleableIconButton$lambda$31($buttonState$delegate, ToggleableIconButtonState.copy-CAf7mdk$default(ToggleableIconButton$lambda$30($buttonState$delegate), false, null, false, false, false, it, 31, null));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit IconButton$lambda$12(Function0<Unit> $onClick, Modifier $modifier, boolean $enabled, boolean $focusable, IconButtonStyle $style, MutableInteractionSource $interactionSource, Function4<? super BoxScope, ? super IconButtonState, ? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     IconButton($onClick, $modifier, $enabled, $focusable, $style, $interactionSource, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit SelectableIconButton$lambda$27(boolean $selected, Function0<Unit> $onClick, Modifier $modifier, boolean $enabled, boolean $focusable, IconButtonStyle $style, MutableInteractionSource $interactionSource, Function4<? super BoxScope, ? super SelectableIconButtonState, ? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     SelectableIconButton($selected, $onClick, $modifier, $enabled, $focusable, $style, $interactionSource, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit ToggleableIconButton$lambda$42(boolean $value, Function1<? super Boolean, Unit> $onValueChange, Modifier $modifier, boolean $enabled, boolean $focusable, IconButtonStyle $style, MutableInteractionSource $interactionSource, Function4<? super BoxScope, ? super ToggleableIconButtonState, ? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     ToggleableIconButton($value, $onValueChange, $modifier, $enabled, $focusable, $style, $interactionSource, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\IconButtonKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */