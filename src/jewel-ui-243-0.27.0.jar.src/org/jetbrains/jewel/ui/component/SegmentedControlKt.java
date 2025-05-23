/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.focus.FocusState;
/*     */ import androidx.compose.ui.graphics.Brush;
/*     */ import androidx.compose.ui.input.key.Key;
/*     */ import androidx.compose.ui.input.key.KeyEvent;
/*     */ import androidx.compose.ui.input.key.KeyEventType;
/*     */ import androidx.compose.ui.input.key.KeyEvent_desktopKt;
/*     */ import androidx.compose.ui.text.TextStyle;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.component.styling.SegmentedControlButtonStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.SegmentedControlStyle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000B\n\000\n\002\020\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\032W\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\0032\b\b\002\020\005\032\0020\0062\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\020H\007¢\006\002\020\021¨\006\022²\006\n\020\023\032\0020\024X\002²\006\n\020\025\032\0020\026X\002"}, d2 = {"SegmentedControl", "", "buttons", "", "Lorg/jetbrains/jewel/ui/component/SegmentedControlButtonData;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "style", "Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlStyle;", "buttonStyle", "Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlButtonStyle;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/styling/SegmentedControlStyle;Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlButtonStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "ui", "segmentedControlState", "Lorg/jetbrains/jewel/ui/component/SegmentedControlState;", "borderColor", "Landroidx/compose/ui/graphics/Brush;"})
/*     */ @SourceDebugExtension({"SMAP\nSegmentedControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedControl.kt\norg/jetbrains/jewel/ui/component/SegmentedControlKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 ModifierExtensions.kt\norg/jetbrains/jewel/ui/util/ModifierExtensionsKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,171:1\n1225#2,6:172\n1225#2,6:178\n1225#2,6:184\n1225#2,3:190\n1228#2,3:204\n1225#2,6:245\n1225#2,6:251\n661#3,11:193\n1855#3:289\n1856#3:291\n71#4:207\n68#4,6:208\n74#4:242\n78#4:299\n79#5,6:214\n86#5,4:229\n90#5,2:239\n79#5,6:260\n86#5,4:275\n90#5,2:285\n94#5:294\n94#5:298\n368#6,9:220\n377#6:241\n368#6,9:266\n377#6:287\n378#6,2:292\n378#6,2:296\n4034#7,6:233\n4034#7,6:279\n63#8:243\n63#8:244\n99#9,3:257\n102#9:288\n106#9:295\n10#10:290\n81#11:300\n107#11,2:301\n81#11:303\n*S KotlinDebug\n*F\n+ 1 SegmentedControl.kt\norg/jetbrains/jewel/ui/component/SegmentedControlKt\n*L\n48#1:172,6\n50#1:178,6\n54#1:184,6\n58#1:190,3\n58#1:204,3\n70#1:245,6\n71#1:251,6\n58#1:193,11\n96#1:289\n96#1:291\n60#1:207\n60#1:208,6\n60#1:242\n60#1:299\n60#1:214,6\n60#1:229,4\n60#1:239,2\n68#1:260,6\n68#1:275,4\n68#1:285,2\n68#1:294\n60#1:298\n60#1:220,9\n60#1:241\n68#1:266,9\n68#1:287\n68#1:292,2\n60#1:296,2\n60#1:233,6\n68#1:279,6\n64#1:243\n65#1:244\n68#1:257,3\n68#1:288\n68#1:295\n101#1:290\n50#1:300\n50#1:301,2\n56#1:303\n*E\n"})
/*     */ public final class SegmentedControlKt
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void SegmentedControl(@NotNull List buttons, @Nullable Modifier modifier, boolean enabled, @Nullable SegmentedControlStyle style, @Nullable SegmentedControlButtonStyle buttonStyle, @Nullable TextStyle textStyle, @Nullable MutableInteractionSource interactionSource, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'buttons'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #7
/*     */     //   8: ldc -1560131952
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
/*     */     //   167: iload #8
/*     */     //   169: sipush #3072
/*     */     //   172: iand
/*     */     //   173: ifne -> 209
/*     */     //   176: iload #10
/*     */     //   178: iload #9
/*     */     //   180: bipush #8
/*     */     //   182: iand
/*     */     //   183: ifne -> 203
/*     */     //   186: aload #7
/*     */     //   188: aload_3
/*     */     //   189: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   194: ifeq -> 203
/*     */     //   197: sipush #2048
/*     */     //   200: goto -> 206
/*     */     //   203: sipush #1024
/*     */     //   206: ior
/*     */     //   207: istore #10
/*     */     //   209: iload #8
/*     */     //   211: sipush #24576
/*     */     //   214: iand
/*     */     //   215: ifne -> 252
/*     */     //   218: iload #10
/*     */     //   220: iload #9
/*     */     //   222: bipush #16
/*     */     //   224: iand
/*     */     //   225: ifne -> 246
/*     */     //   228: aload #7
/*     */     //   230: aload #4
/*     */     //   232: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   237: ifeq -> 246
/*     */     //   240: sipush #16384
/*     */     //   243: goto -> 249
/*     */     //   246: sipush #8192
/*     */     //   249: ior
/*     */     //   250: istore #10
/*     */     //   252: iload #8
/*     */     //   254: ldc 196608
/*     */     //   256: iand
/*     */     //   257: ifne -> 292
/*     */     //   260: iload #10
/*     */     //   262: iload #9
/*     */     //   264: bipush #32
/*     */     //   266: iand
/*     */     //   267: ifne -> 287
/*     */     //   270: aload #7
/*     */     //   272: aload #5
/*     */     //   274: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   279: ifeq -> 287
/*     */     //   282: ldc 131072
/*     */     //   284: goto -> 289
/*     */     //   287: ldc 65536
/*     */     //   289: ior
/*     */     //   290: istore #10
/*     */     //   292: iload #9
/*     */     //   294: bipush #64
/*     */     //   296: iand
/*     */     //   297: ifeq -> 310
/*     */     //   300: iload #10
/*     */     //   302: ldc 1572864
/*     */     //   304: ior
/*     */     //   305: istore #10
/*     */     //   307: goto -> 342
/*     */     //   310: iload #8
/*     */     //   312: ldc 1572864
/*     */     //   314: iand
/*     */     //   315: ifne -> 342
/*     */     //   318: iload #10
/*     */     //   320: aload #7
/*     */     //   322: aload #6
/*     */     //   324: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   329: ifeq -> 337
/*     */     //   332: ldc 1048576
/*     */     //   334: goto -> 339
/*     */     //   337: ldc 524288
/*     */     //   339: ior
/*     */     //   340: istore #10
/*     */     //   342: iload #10
/*     */     //   344: ldc 599187
/*     */     //   346: iand
/*     */     //   347: ldc 599186
/*     */     //   349: if_icmpne -> 362
/*     */     //   352: aload #7
/*     */     //   354: invokeinterface getSkipping : ()Z
/*     */     //   359: ifne -> 2467
/*     */     //   362: aload #7
/*     */     //   364: invokeinterface startDefaults : ()V
/*     */     //   369: iload #8
/*     */     //   371: iconst_1
/*     */     //   372: iand
/*     */     //   373: ifeq -> 386
/*     */     //   376: aload #7
/*     */     //   378: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   383: ifeq -> 586
/*     */     //   386: iload #9
/*     */     //   388: iconst_2
/*     */     //   389: iand
/*     */     //   390: ifeq -> 400
/*     */     //   393: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   396: checkcast androidx/compose/ui/Modifier
/*     */     //   399: astore_1
/*     */     //   400: iload #9
/*     */     //   402: iconst_4
/*     */     //   403: iand
/*     */     //   404: ifeq -> 409
/*     */     //   407: iconst_1
/*     */     //   408: istore_2
/*     */     //   409: iload #9
/*     */     //   411: bipush #8
/*     */     //   413: iand
/*     */     //   414: ifeq -> 436
/*     */     //   417: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   420: aload #7
/*     */     //   422: bipush #6
/*     */     //   424: invokestatic getSegmentedControlStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlStyle;
/*     */     //   427: astore_3
/*     */     //   428: iload #10
/*     */     //   430: sipush #-7169
/*     */     //   433: iand
/*     */     //   434: istore #10
/*     */     //   436: iload #9
/*     */     //   438: bipush #16
/*     */     //   440: iand
/*     */     //   441: ifeq -> 463
/*     */     //   444: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   447: aload #7
/*     */     //   449: bipush #6
/*     */     //   451: invokestatic getSegmentedControlButtonStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlButtonStyle;
/*     */     //   454: astore #4
/*     */     //   456: iload #10
/*     */     //   458: ldc -57345
/*     */     //   460: iand
/*     */     //   461: istore #10
/*     */     //   463: iload #9
/*     */     //   465: bipush #32
/*     */     //   467: iand
/*     */     //   468: ifeq -> 490
/*     */     //   471: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   474: aload #7
/*     */     //   476: bipush #6
/*     */     //   478: invokevirtual getDefaultTextStyle : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;
/*     */     //   481: astore #5
/*     */     //   483: iload #10
/*     */     //   485: ldc -458753
/*     */     //   487: iand
/*     */     //   488: istore #10
/*     */     //   490: iload #9
/*     */     //   492: bipush #64
/*     */     //   494: iand
/*     */     //   495: ifeq -> 639
/*     */     //   498: aload #7
/*     */     //   500: ldc 2040722224
/*     */     //   502: invokeinterface startReplaceGroup : (I)V
/*     */     //   507: aload #7
/*     */     //   509: astore #12
/*     */     //   511: iconst_0
/*     */     //   512: istore #13
/*     */     //   514: iconst_0
/*     */     //   515: istore #14
/*     */     //   517: aload #12
/*     */     //   519: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   524: astore #15
/*     */     //   526: iconst_0
/*     */     //   527: istore #16
/*     */     //   529: aload #15
/*     */     //   531: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   534: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   537: if_acmpne -> 562
/*     */     //   540: iconst_0
/*     */     //   541: istore #17
/*     */     //   543: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   546: astore #17
/*     */     //   548: aload #12
/*     */     //   550: aload #17
/*     */     //   552: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   557: aload #17
/*     */     //   559: goto -> 564
/*     */     //   562: aload #15
/*     */     //   564: nop
/*     */     //   565: nop
/*     */     //   566: nop
/*     */     //   567: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   570: astore #11
/*     */     //   572: aload #7
/*     */     //   574: invokeinterface endReplaceGroup : ()V
/*     */     //   579: aload #11
/*     */     //   581: astore #6
/*     */     //   583: goto -> 639
/*     */     //   586: aload #7
/*     */     //   588: invokeinterface skipToGroupEnd : ()V
/*     */     //   593: iload #9
/*     */     //   595: bipush #8
/*     */     //   597: iand
/*     */     //   598: ifeq -> 609
/*     */     //   601: iload #10
/*     */     //   603: sipush #-7169
/*     */     //   606: iand
/*     */     //   607: istore #10
/*     */     //   609: iload #9
/*     */     //   611: bipush #16
/*     */     //   613: iand
/*     */     //   614: ifeq -> 624
/*     */     //   617: iload #10
/*     */     //   619: ldc -57345
/*     */     //   621: iand
/*     */     //   622: istore #10
/*     */     //   624: iload #9
/*     */     //   626: bipush #32
/*     */     //   628: iand
/*     */     //   629: ifeq -> 639
/*     */     //   632: iload #10
/*     */     //   634: ldc -458753
/*     */     //   636: iand
/*     */     //   637: istore #10
/*     */     //   639: aload #7
/*     */     //   641: invokeinterface endDefaults : ()V
/*     */     //   646: invokestatic isTraceInProgress : ()Z
/*     */     //   649: ifeq -> 662
/*     */     //   652: ldc -1560131952
/*     */     //   654: iload #10
/*     */     //   656: iconst_m1
/*     */     //   657: ldc 'org.jetbrains.jewel.ui.component.SegmentedControl (SegmentedControl.kt:48)'
/*     */     //   659: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   662: aload #7
/*     */     //   664: ldc 2040725501
/*     */     //   666: invokeinterface startReplaceGroup : (I)V
/*     */     //   671: aload #7
/*     */     //   673: astore #13
/*     */     //   675: iconst_0
/*     */     //   676: istore #14
/*     */     //   678: nop
/*     */     //   679: iconst_0
/*     */     //   680: istore #15
/*     */     //   682: aload #13
/*     */     //   684: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   689: astore #16
/*     */     //   691: iconst_0
/*     */     //   692: istore #17
/*     */     //   694: aload #16
/*     */     //   696: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   699: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   702: if_acmpne -> 747
/*     */     //   705: iconst_0
/*     */     //   706: istore #18
/*     */     //   708: getstatic org/jetbrains/jewel/ui/component/SegmentedControlState.Companion : Lorg/jetbrains/jewel/ui/component/SegmentedControlState$Companion;
/*     */     //   711: iload_2
/*     */     //   712: iconst_0
/*     */     //   713: iconst_0
/*     */     //   714: iconst_0
/*     */     //   715: iconst_0
/*     */     //   716: bipush #30
/*     */     //   718: aconst_null
/*     */     //   719: invokestatic of-bhrFvog$default : (Lorg/jetbrains/jewel/ui/component/SegmentedControlState$Companion;ZZZZZILjava/lang/Object;)J
/*     */     //   722: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/SegmentedControlState;
/*     */     //   725: aconst_null
/*     */     //   726: iconst_2
/*     */     //   727: aconst_null
/*     */     //   728: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   731: astore #19
/*     */     //   733: aload #13
/*     */     //   735: aload #19
/*     */     //   737: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   742: aload #19
/*     */     //   744: goto -> 749
/*     */     //   747: aload #16
/*     */     //   749: nop
/*     */     //   750: nop
/*     */     //   751: nop
/*     */     //   752: checkcast androidx/compose/runtime/MutableState
/*     */     //   755: astore #12
/*     */     //   757: aload #7
/*     */     //   759: invokeinterface endReplaceGroup : ()V
/*     */     //   764: aload #12
/*     */     //   766: astore #11
/*     */     //   768: aload #7
/*     */     //   770: ldc 2040728378
/*     */     //   772: invokeinterface startReplaceGroup : (I)V
/*     */     //   777: aload #7
/*     */     //   779: astore #12
/*     */     //   781: iload #10
/*     */     //   783: sipush #896
/*     */     //   786: iand
/*     */     //   787: sipush #256
/*     */     //   790: if_icmpne -> 797
/*     */     //   793: iconst_1
/*     */     //   794: goto -> 798
/*     */     //   797: iconst_0
/*     */     //   798: istore #13
/*     */     //   800: nop
/*     */     //   801: iconst_0
/*     */     //   802: istore #14
/*     */     //   804: aload #12
/*     */     //   806: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   811: astore #15
/*     */     //   813: iconst_0
/*     */     //   814: istore #16
/*     */     //   816: iload #13
/*     */     //   818: ifne -> 832
/*     */     //   821: aload #15
/*     */     //   823: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   826: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   829: if_acmpne -> 875
/*     */     //   832: iconst_0
/*     */     //   833: istore #17
/*     */     //   835: aload #11
/*     */     //   837: aload #11
/*     */     //   839: invokestatic SegmentedControl$lambda$2 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   842: iload_2
/*     */     //   843: iconst_0
/*     */     //   844: iconst_0
/*     */     //   845: iconst_0
/*     */     //   846: iconst_0
/*     */     //   847: bipush #30
/*     */     //   849: aconst_null
/*     */     //   850: invokestatic copy-bhrFvog$default : (JZZZZZILjava/lang/Object;)J
/*     */     //   853: invokestatic SegmentedControl$lambda$3 : (Landroidx/compose/runtime/MutableState;J)V
/*     */     //   856: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   859: astore #18
/*     */     //   861: aload #12
/*     */     //   863: aload #18
/*     */     //   865: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   870: aload #18
/*     */     //   872: goto -> 877
/*     */     //   875: aload #15
/*     */     //   877: nop
/*     */     //   878: nop
/*     */     //   879: nop
/*     */     //   880: pop
/*     */     //   881: aload #7
/*     */     //   883: invokeinterface endReplaceGroup : ()V
/*     */     //   888: aload_3
/*     */     //   889: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlColors;
/*     */     //   892: aload #11
/*     */     //   894: invokestatic SegmentedControl$lambda$2 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   897: aload #7
/*     */     //   899: iconst_0
/*     */     //   900: invokevirtual borderFor-ASBgGNQ : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   903: astore #12
/*     */     //   905: aload_3
/*     */     //   906: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlMetrics;
/*     */     //   909: invokevirtual getBorderWidth-D9Ej5fM : ()F
/*     */     //   912: fstore #13
/*     */     //   914: aload #7
/*     */     //   916: ldc 2040735746
/*     */     //   918: invokeinterface startReplaceGroup : (I)V
/*     */     //   923: aload #7
/*     */     //   925: astore #16
/*     */     //   927: aload #7
/*     */     //   929: aload_0
/*     */     //   930: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   935: istore #17
/*     */     //   937: iconst_0
/*     */     //   938: istore #18
/*     */     //   940: aload #16
/*     */     //   942: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   947: astore #19
/*     */     //   949: iconst_0
/*     */     //   950: istore #20
/*     */     //   952: iload #17
/*     */     //   954: ifne -> 968
/*     */     //   957: aload #19
/*     */     //   959: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   962: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   965: if_acmpne -> 1105
/*     */     //   968: iconst_0
/*     */     //   969: istore #21
/*     */     //   971: aload_0
/*     */     //   972: checkcast java/lang/Iterable
/*     */     //   975: invokestatic withIndex : (Ljava/lang/Iterable;)Ljava/lang/Iterable;
/*     */     //   978: astore #22
/*     */     //   980: iconst_0
/*     */     //   981: istore #23
/*     */     //   983: aconst_null
/*     */     //   984: astore #24
/*     */     //   986: iconst_0
/*     */     //   987: istore #25
/*     */     //   989: aload #22
/*     */     //   991: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   996: astore #26
/*     */     //   998: aload #26
/*     */     //   1000: invokeinterface hasNext : ()Z
/*     */     //   1005: ifeq -> 1060
/*     */     //   1008: aload #26
/*     */     //   1010: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1015: astore #27
/*     */     //   1017: aload #27
/*     */     //   1019: checkcast kotlin/collections/IndexedValue
/*     */     //   1022: astore #28
/*     */     //   1024: iconst_0
/*     */     //   1025: istore #29
/*     */     //   1027: aload #28
/*     */     //   1029: invokevirtual getValue : ()Ljava/lang/Object;
/*     */     //   1032: checkcast org/jetbrains/jewel/ui/component/SegmentedControlButtonData
/*     */     //   1035: invokevirtual getSelected : ()Z
/*     */     //   1038: ifeq -> 998
/*     */     //   1041: iload #25
/*     */     //   1043: ifeq -> 1050
/*     */     //   1046: aconst_null
/*     */     //   1047: goto -> 1071
/*     */     //   1050: aload #27
/*     */     //   1052: astore #24
/*     */     //   1054: iconst_1
/*     */     //   1055: istore #25
/*     */     //   1057: goto -> 998
/*     */     //   1060: iload #25
/*     */     //   1062: ifne -> 1069
/*     */     //   1065: aconst_null
/*     */     //   1066: goto -> 1071
/*     */     //   1069: aload #24
/*     */     //   1071: checkcast kotlin/collections/IndexedValue
/*     */     //   1074: dup
/*     */     //   1075: ifnull -> 1084
/*     */     //   1078: invokevirtual getIndex : ()I
/*     */     //   1081: goto -> 1086
/*     */     //   1084: pop
/*     */     //   1085: iconst_m1
/*     */     //   1086: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1089: astore #30
/*     */     //   1091: aload #16
/*     */     //   1093: aload #30
/*     */     //   1095: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1100: aload #30
/*     */     //   1102: goto -> 1107
/*     */     //   1105: aload #19
/*     */     //   1107: nop
/*     */     //   1108: nop
/*     */     //   1109: nop
/*     */     //   1110: checkcast java/lang/Number
/*     */     //   1113: invokevirtual intValue : ()I
/*     */     //   1116: istore #15
/*     */     //   1118: aload #7
/*     */     //   1120: invokeinterface endReplaceGroup : ()V
/*     */     //   1125: iload #15
/*     */     //   1127: istore #14
/*     */     //   1129: bipush #14
/*     */     //   1131: iload #10
/*     */     //   1133: iconst_3
/*     */     //   1134: ishr
/*     */     //   1135: iand
/*     */     //   1136: istore #17
/*     */     //   1138: nop
/*     */     //   1139: iconst_0
/*     */     //   1140: istore #18
/*     */     //   1142: aload #7
/*     */     //   1144: ldc 733328855
/*     */     //   1146: ldc 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   1148: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1151: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1154: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   1157: astore #15
/*     */     //   1159: iconst_0
/*     */     //   1160: istore #16
/*     */     //   1162: aload #15
/*     */     //   1164: iload #16
/*     */     //   1166: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1169: astore #19
/*     */     //   1171: bipush #112
/*     */     //   1173: iload #17
/*     */     //   1175: iconst_3
/*     */     //   1176: ishl
/*     */     //   1177: iand
/*     */     //   1178: istore #20
/*     */     //   1180: nop
/*     */     //   1181: iconst_0
/*     */     //   1182: istore #21
/*     */     //   1184: aload #7
/*     */     //   1186: ldc_w -1323940314
/*     */     //   1189: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1192: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1195: aload #7
/*     */     //   1197: iconst_0
/*     */     //   1198: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1201: istore #22
/*     */     //   1203: aload #7
/*     */     //   1205: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1210: astore #23
/*     */     //   1212: aload #7
/*     */     //   1214: aload_1
/*     */     //   1215: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1218: astore #24
/*     */     //   1220: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1223: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1226: astore #25
/*     */     //   1228: bipush #6
/*     */     //   1230: sipush #896
/*     */     //   1233: iload #20
/*     */     //   1235: bipush #6
/*     */     //   1237: ishl
/*     */     //   1238: iand
/*     */     //   1239: ior
/*     */     //   1240: istore #26
/*     */     //   1242: nop
/*     */     //   1243: iconst_0
/*     */     //   1244: istore #27
/*     */     //   1246: aload #7
/*     */     //   1248: ldc_w -692256719
/*     */     //   1251: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1254: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1257: aload #7
/*     */     //   1259: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1264: instanceof androidx/compose/runtime/Applier
/*     */     //   1267: ifne -> 1273
/*     */     //   1270: invokestatic invalidApplier : ()V
/*     */     //   1273: aload #7
/*     */     //   1275: invokeinterface startReusableNode : ()V
/*     */     //   1280: aload #7
/*     */     //   1282: invokeinterface getInserting : ()Z
/*     */     //   1287: ifeq -> 1302
/*     */     //   1290: aload #7
/*     */     //   1292: aload #25
/*     */     //   1294: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1299: goto -> 1309
/*     */     //   1302: aload #7
/*     */     //   1304: invokeinterface useNode : ()V
/*     */     //   1309: aload #7
/*     */     //   1311: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1314: astore #28
/*     */     //   1316: iconst_0
/*     */     //   1317: istore #29
/*     */     //   1319: aload #28
/*     */     //   1321: aload #19
/*     */     //   1323: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1326: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1329: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1332: aload #28
/*     */     //   1334: aload #23
/*     */     //   1336: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1339: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1342: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1345: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1348: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1351: astore #30
/*     */     //   1353: iconst_0
/*     */     //   1354: istore #31
/*     */     //   1356: aload #28
/*     */     //   1358: astore #32
/*     */     //   1360: iconst_0
/*     */     //   1361: istore #33
/*     */     //   1363: aload #32
/*     */     //   1365: invokeinterface getInserting : ()Z
/*     */     //   1370: ifne -> 1391
/*     */     //   1373: aload #32
/*     */     //   1375: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1380: iload #22
/*     */     //   1382: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1385: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1388: ifne -> 1417
/*     */     //   1391: aload #32
/*     */     //   1393: iload #22
/*     */     //   1395: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1398: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1403: aload #28
/*     */     //   1405: iload #22
/*     */     //   1407: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1410: aload #30
/*     */     //   1412: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1417: nop
/*     */     //   1418: nop
/*     */     //   1419: nop
/*     */     //   1420: aload #28
/*     */     //   1422: aload #24
/*     */     //   1424: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1427: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1430: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1433: nop
/*     */     //   1434: nop
/*     */     //   1435: aload #7
/*     */     //   1437: bipush #14
/*     */     //   1439: iload #26
/*     */     //   1441: bipush #6
/*     */     //   1443: ishr
/*     */     //   1444: iand
/*     */     //   1445: istore #34
/*     */     //   1447: astore #35
/*     */     //   1449: iconst_0
/*     */     //   1450: istore #36
/*     */     //   1452: aload #35
/*     */     //   1454: ldc_w -2146769399
/*     */     //   1457: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   1460: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1463: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   1466: aload #35
/*     */     //   1468: bipush #6
/*     */     //   1470: bipush #112
/*     */     //   1472: iload #17
/*     */     //   1474: bipush #6
/*     */     //   1476: ishr
/*     */     //   1477: iand
/*     */     //   1478: ior
/*     */     //   1479: istore #37
/*     */     //   1481: astore #38
/*     */     //   1483: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   1486: astore #39
/*     */     //   1488: iconst_0
/*     */     //   1489: istore #40
/*     */     //   1491: aload_3
/*     */     //   1492: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlMetrics;
/*     */     //   1495: invokevirtual getCornerSize : ()Landroidx/compose/foundation/shape/CornerSize;
/*     */     //   1498: invokestatic RoundedCornerShape : (Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   1501: astore #41
/*     */     //   1503: aload #39
/*     */     //   1505: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1508: checkcast androidx/compose/ui/Modifier
/*     */     //   1511: invokeinterface matchParentSize : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1516: aload #11
/*     */     //   1518: invokestatic SegmentedControl$lambda$2 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1521: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/SegmentedControlState;
/*     */     //   1524: aload #41
/*     */     //   1526: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   1529: aconst_null
/*     */     //   1530: fconst_0
/*     */     //   1531: iconst_0
/*     */     //   1532: istore #42
/*     */     //   1534: fload #13
/*     */     //   1536: fneg
/*     */     //   1537: invokestatic constructor-impl : (F)F
/*     */     //   1540: aload #38
/*     */     //   1542: iconst_0
/*     */     //   1543: bipush #12
/*     */     //   1545: invokestatic focusOutline-AGcomas : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/state/FocusableComponentState;Landroidx/compose/ui/graphics/Shape;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
/*     */     //   1548: getstatic org/jetbrains/jewel/foundation/Stroke$Alignment.Center : Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */     //   1551: fload #13
/*     */     //   1553: aload #12
/*     */     //   1555: invokestatic SegmentedControl$lambda$5 : (Landroidx/compose/runtime/State;)Landroidx/compose/ui/graphics/Brush;
/*     */     //   1558: aload #41
/*     */     //   1560: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   1563: iconst_0
/*     */     //   1564: istore #42
/*     */     //   1566: fload #13
/*     */     //   1568: fneg
/*     */     //   1569: invokestatic constructor-impl : (F)F
/*     */     //   1572: invokestatic border-AkepmR4 : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;F)Landroidx/compose/ui/Modifier;
/*     */     //   1575: aload #38
/*     */     //   1577: iconst_0
/*     */     //   1578: invokestatic Box : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1581: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1584: checkcast androidx/compose/ui/Modifier
/*     */     //   1587: aload #38
/*     */     //   1589: ldc_w -683257002
/*     */     //   1592: invokeinterface startReplaceGroup : (I)V
/*     */     //   1597: aload #38
/*     */     //   1599: astore #43
/*     */     //   1601: iconst_0
/*     */     //   1602: istore #44
/*     */     //   1604: iconst_0
/*     */     //   1605: istore #45
/*     */     //   1607: aload #43
/*     */     //   1609: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1614: astore #46
/*     */     //   1616: iconst_0
/*     */     //   1617: istore #47
/*     */     //   1619: aload #46
/*     */     //   1621: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1624: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1627: if_acmpne -> 1661
/*     */     //   1630: astore #48
/*     */     //   1632: iconst_0
/*     */     //   1633: istore #49
/*     */     //   1635: aload #11
/*     */     //   1637: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   1642: aload #48
/*     */     //   1644: swap
/*     */     //   1645: astore #50
/*     */     //   1647: aload #43
/*     */     //   1649: aload #50
/*     */     //   1651: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1656: aload #50
/*     */     //   1658: goto -> 1663
/*     */     //   1661: aload #46
/*     */     //   1663: nop
/*     */     //   1664: nop
/*     */     //   1665: nop
/*     */     //   1666: checkcast kotlin/jvm/functions/Function1
/*     */     //   1669: astore #42
/*     */     //   1671: aload #38
/*     */     //   1673: invokeinterface endReplaceGroup : ()V
/*     */     //   1678: aload #42
/*     */     //   1680: invokestatic onFocusEvent : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   1683: aload #38
/*     */     //   1685: ldc_w -683252712
/*     */     //   1688: invokeinterface startReplaceGroup : (I)V
/*     */     //   1693: aload #38
/*     */     //   1695: astore #43
/*     */     //   1697: aload #7
/*     */     //   1699: iload #14
/*     */     //   1701: invokeinterface changed : (I)Z
/*     */     //   1706: aload #7
/*     */     //   1708: aload_0
/*     */     //   1709: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1714: ior
/*     */     //   1715: istore #44
/*     */     //   1717: nop
/*     */     //   1718: iconst_0
/*     */     //   1719: istore #45
/*     */     //   1721: aload #43
/*     */     //   1723: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1728: astore #46
/*     */     //   1730: iconst_0
/*     */     //   1731: istore #47
/*     */     //   1733: iload #44
/*     */     //   1735: ifne -> 1749
/*     */     //   1738: aload #46
/*     */     //   1740: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1743: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1746: if_acmpne -> 1786
/*     */     //   1749: astore #48
/*     */     //   1751: iconst_0
/*     */     //   1752: istore #49
/*     */     //   1754: new org/jetbrains/jewel/ui/component/SegmentedControlKt$SegmentedControl$3$2$1
/*     */     //   1757: dup
/*     */     //   1758: iload #14
/*     */     //   1760: aload_0
/*     */     //   1761: invokespecial <init> : (ILjava/util/List;)V
/*     */     //   1764: checkcast kotlin/jvm/functions/Function1
/*     */     //   1767: aload #48
/*     */     //   1769: swap
/*     */     //   1770: astore #50
/*     */     //   1772: aload #43
/*     */     //   1774: aload #50
/*     */     //   1776: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1781: aload #50
/*     */     //   1783: goto -> 1788
/*     */     //   1786: aload #46
/*     */     //   1788: nop
/*     */     //   1789: nop
/*     */     //   1790: nop
/*     */     //   1791: checkcast kotlin/jvm/functions/Function1
/*     */     //   1794: astore #42
/*     */     //   1796: aload #38
/*     */     //   1798: invokeinterface endReplaceGroup : ()V
/*     */     //   1803: aload #42
/*     */     //   1805: invokestatic onKeyEvent : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   1808: iload_2
/*     */     //   1809: aload #6
/*     */     //   1811: invokestatic focusable : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;)Landroidx/compose/ui/Modifier;
/*     */     //   1814: invokestatic selectableGroup : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1817: aload_3
/*     */     //   1818: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlMetrics;
/*     */     //   1821: invokevirtual getBorderWidth-D9Ej5fM : ()F
/*     */     //   1824: invokestatic padding-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   1827: astore #42
/*     */     //   1829: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   1832: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1835: invokevirtual getCenterHorizontally : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   1838: invokevirtual aligned : (Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   1841: astore #43
/*     */     //   1843: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1846: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   1849: astore #44
/*     */     //   1851: sipush #432
/*     */     //   1854: istore #45
/*     */     //   1856: nop
/*     */     //   1857: iconst_0
/*     */     //   1858: istore #46
/*     */     //   1860: aload #38
/*     */     //   1862: ldc_w 693286680
/*     */     //   1865: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   1868: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1871: aload #43
/*     */     //   1873: aload #44
/*     */     //   1875: aload #38
/*     */     //   1877: bipush #14
/*     */     //   1879: iload #45
/*     */     //   1881: iconst_3
/*     */     //   1882: ishr
/*     */     //   1883: iand
/*     */     //   1884: bipush #112
/*     */     //   1886: iload #45
/*     */     //   1888: iconst_3
/*     */     //   1889: ishr
/*     */     //   1890: iand
/*     */     //   1891: ior
/*     */     //   1892: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1895: astore #47
/*     */     //   1897: bipush #112
/*     */     //   1899: iload #45
/*     */     //   1901: iconst_3
/*     */     //   1902: ishl
/*     */     //   1903: iand
/*     */     //   1904: istore #49
/*     */     //   1906: nop
/*     */     //   1907: iconst_0
/*     */     //   1908: istore #50
/*     */     //   1910: aload #38
/*     */     //   1912: ldc_w -1323940314
/*     */     //   1915: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1918: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1921: aload #38
/*     */     //   1923: iconst_0
/*     */     //   1924: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1927: istore #51
/*     */     //   1929: aload #38
/*     */     //   1931: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1936: astore #52
/*     */     //   1938: aload #38
/*     */     //   1940: aload #42
/*     */     //   1942: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1945: astore #53
/*     */     //   1947: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1950: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1953: astore #54
/*     */     //   1955: bipush #6
/*     */     //   1957: sipush #896
/*     */     //   1960: iload #49
/*     */     //   1962: bipush #6
/*     */     //   1964: ishl
/*     */     //   1965: iand
/*     */     //   1966: ior
/*     */     //   1967: istore #55
/*     */     //   1969: nop
/*     */     //   1970: iconst_0
/*     */     //   1971: istore #56
/*     */     //   1973: aload #38
/*     */     //   1975: ldc_w -692256719
/*     */     //   1978: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1981: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1984: aload #38
/*     */     //   1986: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1991: instanceof androidx/compose/runtime/Applier
/*     */     //   1994: ifne -> 2000
/*     */     //   1997: invokestatic invalidApplier : ()V
/*     */     //   2000: aload #38
/*     */     //   2002: invokeinterface startReusableNode : ()V
/*     */     //   2007: aload #38
/*     */     //   2009: invokeinterface getInserting : ()Z
/*     */     //   2014: ifeq -> 2029
/*     */     //   2017: aload #38
/*     */     //   2019: aload #54
/*     */     //   2021: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   2026: goto -> 2036
/*     */     //   2029: aload #38
/*     */     //   2031: invokeinterface useNode : ()V
/*     */     //   2036: aload #38
/*     */     //   2038: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   2041: astore #57
/*     */     //   2043: iconst_0
/*     */     //   2044: istore #58
/*     */     //   2046: aload #57
/*     */     //   2048: aload #47
/*     */     //   2050: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2053: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2056: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2059: aload #57
/*     */     //   2061: aload #52
/*     */     //   2063: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2066: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2069: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2072: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2075: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2078: astore #59
/*     */     //   2080: iconst_0
/*     */     //   2081: istore #60
/*     */     //   2083: aload #57
/*     */     //   2085: astore #61
/*     */     //   2087: iconst_0
/*     */     //   2088: istore #62
/*     */     //   2090: aload #61
/*     */     //   2092: invokeinterface getInserting : ()Z
/*     */     //   2097: ifne -> 2118
/*     */     //   2100: aload #61
/*     */     //   2102: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2107: iload #51
/*     */     //   2109: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2112: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   2115: ifne -> 2144
/*     */     //   2118: aload #61
/*     */     //   2120: iload #51
/*     */     //   2122: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2125: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2130: aload #57
/*     */     //   2132: iload #51
/*     */     //   2134: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2137: aload #59
/*     */     //   2139: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2144: nop
/*     */     //   2145: nop
/*     */     //   2146: nop
/*     */     //   2147: aload #57
/*     */     //   2149: aload #53
/*     */     //   2151: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2154: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2157: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2160: nop
/*     */     //   2161: nop
/*     */     //   2162: aload #38
/*     */     //   2164: bipush #14
/*     */     //   2166: iload #55
/*     */     //   2168: bipush #6
/*     */     //   2170: ishr
/*     */     //   2171: iand
/*     */     //   2172: istore #63
/*     */     //   2174: astore #64
/*     */     //   2176: iconst_0
/*     */     //   2177: istore #65
/*     */     //   2179: aload #64
/*     */     //   2181: ldc_w -407840262
/*     */     //   2184: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   2187: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2190: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   2193: aload #64
/*     */     //   2195: bipush #6
/*     */     //   2197: bipush #112
/*     */     //   2199: iload #45
/*     */     //   2201: bipush #6
/*     */     //   2203: ishr
/*     */     //   2204: iand
/*     */     //   2205: ior
/*     */     //   2206: istore #66
/*     */     //   2208: astore #67
/*     */     //   2210: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   2213: astore #68
/*     */     //   2215: iconst_0
/*     */     //   2216: istore #69
/*     */     //   2218: aload #67
/*     */     //   2220: ldc_w -286779232
/*     */     //   2223: invokeinterface startReplaceGroup : (I)V
/*     */     //   2228: aload_0
/*     */     //   2229: checkcast java/lang/Iterable
/*     */     //   2232: astore #70
/*     */     //   2234: iconst_0
/*     */     //   2235: istore #71
/*     */     //   2237: aload #70
/*     */     //   2239: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   2244: astore #72
/*     */     //   2246: aload #72
/*     */     //   2248: invokeinterface hasNext : ()Z
/*     */     //   2253: ifeq -> 2385
/*     */     //   2256: aload #72
/*     */     //   2258: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   2263: astore #73
/*     */     //   2265: aload #73
/*     */     //   2267: checkcast org/jetbrains/jewel/ui/component/SegmentedControlButtonData
/*     */     //   2270: astore #74
/*     */     //   2272: iconst_0
/*     */     //   2273: istore #75
/*     */     //   2275: aload #11
/*     */     //   2277: invokestatic SegmentedControl$lambda$2 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   2280: invokestatic isActive-impl : (J)Z
/*     */     //   2283: istore #76
/*     */     //   2285: aload #11
/*     */     //   2287: invokestatic SegmentedControl$lambda$2 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   2290: invokestatic isFocused-impl : (J)Z
/*     */     //   2293: istore #77
/*     */     //   2295: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   2298: checkcast androidx/compose/ui/Modifier
/*     */     //   2301: astore #78
/*     */     //   2303: aload #74
/*     */     //   2305: invokevirtual getSelected : ()Z
/*     */     //   2308: istore #79
/*     */     //   2310: iconst_0
/*     */     //   2311: istore #80
/*     */     //   2313: iload #79
/*     */     //   2315: ifeq -> 2334
/*     */     //   2318: aload #78
/*     */     //   2320: astore #81
/*     */     //   2322: iconst_0
/*     */     //   2323: istore #82
/*     */     //   2325: aload #81
/*     */     //   2327: fconst_1
/*     */     //   2328: invokestatic zIndex : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   2331: goto -> 2336
/*     */     //   2334: aload #78
/*     */     //   2336: astore #83
/*     */     //   2338: iload #76
/*     */     //   2340: iload #77
/*     */     //   2342: iload_2
/*     */     //   2343: aload #74
/*     */     //   2345: aload #4
/*     */     //   2347: aload #5
/*     */     //   2349: aload #83
/*     */     //   2351: aconst_null
/*     */     //   2352: aload #67
/*     */     //   2354: sipush #896
/*     */     //   2357: iload #10
/*     */     //   2359: iand
/*     */     //   2360: ldc_w 57344
/*     */     //   2363: iload #10
/*     */     //   2365: iand
/*     */     //   2366: ior
/*     */     //   2367: ldc_w 458752
/*     */     //   2370: iload #10
/*     */     //   2372: iand
/*     */     //   2373: ior
/*     */     //   2374: sipush #128
/*     */     //   2377: invokestatic SegmentedControlButton : (ZZZLorg/jetbrains/jewel/ui/component/SegmentedControlButtonData;Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlButtonStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
/*     */     //   2380: nop
/*     */     //   2381: nop
/*     */     //   2382: goto -> 2246
/*     */     //   2385: nop
/*     */     //   2386: aload #67
/*     */     //   2388: invokeinterface endReplaceGroup : ()V
/*     */     //   2393: nop
/*     */     //   2394: aload #64
/*     */     //   2396: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2399: aload #38
/*     */     //   2401: invokeinterface endNode : ()V
/*     */     //   2406: aload #38
/*     */     //   2408: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2411: nop
/*     */     //   2412: aload #38
/*     */     //   2414: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2417: nop
/*     */     //   2418: aload #38
/*     */     //   2420: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2423: nop
/*     */     //   2424: nop
/*     */     //   2425: aload #35
/*     */     //   2427: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2430: aload #7
/*     */     //   2432: invokeinterface endNode : ()V
/*     */     //   2437: aload #7
/*     */     //   2439: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2442: nop
/*     */     //   2443: aload #7
/*     */     //   2445: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2448: nop
/*     */     //   2449: aload #7
/*     */     //   2451: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2454: nop
/*     */     //   2455: invokestatic isTraceInProgress : ()Z
/*     */     //   2458: ifeq -> 2474
/*     */     //   2461: invokestatic traceEventEnd : ()V
/*     */     //   2464: goto -> 2474
/*     */     //   2467: aload #7
/*     */     //   2469: invokeinterface skipToGroupEnd : ()V
/*     */     //   2474: aload #7
/*     */     //   2476: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   2481: dup
/*     */     //   2482: ifnull -> 2512
/*     */     //   2485: aload_0
/*     */     //   2486: aload_1
/*     */     //   2487: iload_2
/*     */     //   2488: aload_3
/*     */     //   2489: aload #4
/*     */     //   2491: aload #5
/*     */     //   2493: aload #6
/*     */     //   2495: iload #8
/*     */     //   2497: iload #9
/*     */     //   2499: <illegal opcode> invoke : (Ljava/util/List;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/styling/SegmentedControlStyle;Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlButtonStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)Lkotlin/jvm/functions/Function2;
/*     */     //   2504: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   2509: goto -> 2513
/*     */     //   2512: pop
/*     */     //   2513: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #49	-> 6
/*     */     //   #43	-> 393
/*     */     //   #44	-> 407
/*     */     //   #45	-> 417
/*     */     //   #46	-> 444
/*     */     //   #47	-> 471
/*     */     //   #48	-> 498
/*     */     //   #172	-> 517
/*     */     //   #173	-> 529
/*     */     //   #174	-> 540
/*     */     //   #48	-> 543
/*     */     //   #174	-> 546
/*     */     //   #175	-> 548
/*     */     //   #176	-> 557
/*     */     //   #177	-> 562
/*     */     //   #173	-> 564
/*     */     //   #172	-> 565
/*     */     //   #172	-> 566
/*     */     //   #48	-> 567
/*     */     //   #49	-> 659
/*     */     //   #50	-> 678
/*     */     //   #178	-> 682
/*     */     //   #179	-> 694
/*     */     //   #180	-> 705
/*     */     //   #51	-> 708
/*     */     //   #180	-> 731
/*     */     //   #181	-> 733
/*     */     //   #182	-> 742
/*     */     //   #183	-> 747
/*     */     //   #179	-> 749
/*     */     //   #178	-> 750
/*     */     //   #178	-> 751
/*     */     //   #50	-> 752
/*     */     //   #54	-> 800
/*     */     //   #184	-> 804
/*     */     //   #185	-> 816
/*     */     //   #186	-> 832
/*     */     //   #54	-> 835
/*     */     //   #186	-> 859
/*     */     //   #187	-> 861
/*     */     //   #188	-> 870
/*     */     //   #189	-> 875
/*     */     //   #185	-> 877
/*     */     //   #184	-> 878
/*     */     //   #184	-> 879
/*     */     //   #56	-> 888
/*     */     //   #57	-> 905
/*     */     //   #58	-> 929
/*     */     //   #190	-> 940
/*     */     //   #191	-> 952
/*     */     //   #192	-> 968
/*     */     //   #58	-> 971
/*     */     //   #193	-> 983
/*     */     //   #194	-> 986
/*     */     //   #195	-> 989
/*     */     //   #196	-> 1017
/*     */     //   #58	-> 1027
/*     */     //   #196	-> 1038
/*     */     //   #197	-> 1041
/*     */     //   #198	-> 1050
/*     */     //   #199	-> 1054
/*     */     //   #202	-> 1060
/*     */     //   #203	-> 1069
/*     */     //   #58	-> 1071
/*     */     //   #192	-> 1089
/*     */     //   #204	-> 1091
/*     */     //   #205	-> 1100
/*     */     //   #206	-> 1105
/*     */     //   #191	-> 1107
/*     */     //   #190	-> 1108
/*     */     //   #190	-> 1109
/*     */     //   #58	-> 1110
/*     */     //   #60	-> 1138
/*     */     //   #207	-> 1148
/*     */     //   #208	-> 1151
/*     */     //   #209	-> 1159
/*     */     //   #212	-> 1162
/*     */     //   #213	-> 1180
/*     */     //   #214	-> 1192
/*     */     //   #215	-> 1198
/*     */     //   #216	-> 1205
/*     */     //   #217	-> 1214
/*     */     //   #219	-> 1220
/*     */     //   #218	-> 1242
/*     */     //   #220	-> 1254
/*     */     //   #221	-> 1257
/*     */     //   #222	-> 1275
/*     */     //   #223	-> 1280
/*     */     //   #224	-> 1292
/*     */     //   #226	-> 1304
/*     */     //   #228	-> 1309
/*     */     //   #229	-> 1319
/*     */     //   #230	-> 1332
/*     */     //   #232	-> 1345
/*     */     //   #233	-> 1356
/*     */     //   #234	-> 1363
/*     */     //   #235	-> 1391
/*     */     //   #236	-> 1403
/*     */     //   #238	-> 1417
/*     */     //   #233	-> 1418
/*     */     //   #238	-> 1419
/*     */     //   #239	-> 1420
/*     */     //   #240	-> 1433
/*     */     //   #228	-> 1434
/*     */     //   #241	-> 1435
/*     */     //   #242	-> 1460
/*     */     //   #61	-> 1491
/*     */     //   #63	-> 1503
/*     */     //   #64	-> 1516
/*     */     //   #243	-> 1534
/*     */     //   #64	-> 1545
/*     */     //   #65	-> 1548
/*     */     //   #244	-> 1566
/*     */     //   #65	-> 1572
/*     */     //   #62	-> 1578
/*     */     //   #70	-> 1581
/*     */     //   #245	-> 1607
/*     */     //   #246	-> 1619
/*     */     //   #247	-> 1630
/*     */     //   #70	-> 1635
/*     */     //   #247	-> 1645
/*     */     //   #248	-> 1647
/*     */     //   #249	-> 1656
/*     */     //   #250	-> 1661
/*     */     //   #246	-> 1663
/*     */     //   #245	-> 1664
/*     */     //   #245	-> 1665
/*     */     //   #70	-> 1666
/*     */     //   #71	-> 1717
/*     */     //   #251	-> 1721
/*     */     //   #252	-> 1733
/*     */     //   #253	-> 1749
/*     */     //   #71	-> 1754
/*     */     //   #253	-> 1770
/*     */     //   #254	-> 1772
/*     */     //   #255	-> 1781
/*     */     //   #256	-> 1786
/*     */     //   #252	-> 1788
/*     */     //   #251	-> 1789
/*     */     //   #251	-> 1790
/*     */     //   #71	-> 1791
/*     */     //   #90	-> 1808
/*     */     //   #91	-> 1814
/*     */     //   #92	-> 1817
/*     */     //   #93	-> 1829
/*     */     //   #94	-> 1843
/*     */     //   #68	-> 1856
/*     */     //   #257	-> 1868
/*     */     //   #258	-> 1871
/*     */     //   #259	-> 1906
/*     */     //   #260	-> 1918
/*     */     //   #261	-> 1924
/*     */     //   #262	-> 1931
/*     */     //   #263	-> 1940
/*     */     //   #265	-> 1947
/*     */     //   #264	-> 1969
/*     */     //   #266	-> 1981
/*     */     //   #267	-> 1984
/*     */     //   #268	-> 2002
/*     */     //   #269	-> 2007
/*     */     //   #270	-> 2019
/*     */     //   #272	-> 2031
/*     */     //   #274	-> 2036
/*     */     //   #275	-> 2046
/*     */     //   #276	-> 2059
/*     */     //   #278	-> 2072
/*     */     //   #279	-> 2083
/*     */     //   #280	-> 2090
/*     */     //   #281	-> 2118
/*     */     //   #282	-> 2130
/*     */     //   #284	-> 2144
/*     */     //   #279	-> 2145
/*     */     //   #284	-> 2146
/*     */     //   #285	-> 2147
/*     */     //   #286	-> 2160
/*     */     //   #274	-> 2161
/*     */     //   #287	-> 2162
/*     */     //   #288	-> 2187
/*     */     //   #96	-> 2228
/*     */     //   #289	-> 2237
/*     */     //   #98	-> 2275
/*     */     //   #99	-> 2285
/*     */     //   #101	-> 2295
/*     */     //   #290	-> 2313
/*     */     //   #101	-> 2325
/*     */     //   #290	-> 2331
/*     */     //   #101	-> 2336
/*     */     //   #98	-> 2338
/*     */     //   #99	-> 2340
/*     */     //   #100	-> 2342
/*     */     //   #102	-> 2343
/*     */     //   #103	-> 2345
/*     */     //   #104	-> 2347
/*     */     //   #101	-> 2349
/*     */     //   #97	-> 2377
/*     */     //   #106	-> 2380
/*     */     //   #289	-> 2381
/*     */     //   #291	-> 2385
/*     */     //   #107	-> 2393
/*     */     //   #288	-> 2394
/*     */     //   #287	-> 2399
/*     */     //   #292	-> 2401
/*     */     //   #266	-> 2408
/*     */     //   #293	-> 2411
/*     */     //   #260	-> 2414
/*     */     //   #294	-> 2417
/*     */     //   #257	-> 2420
/*     */     //   #295	-> 2423
/*     */     //   #108	-> 2424
/*     */     //   #242	-> 2425
/*     */     //   #241	-> 2430
/*     */     //   #296	-> 2432
/*     */     //   #220	-> 2439
/*     */     //   #297	-> 2442
/*     */     //   #214	-> 2445
/*     */     //   #298	-> 2448
/*     */     //   #207	-> 2451
/*     */     //   #299	-> 2454
/*     */     //   #109	-> 2467
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   543	3	17	$i$a$-cache-SegmentedControlKt$SegmentedControl$1	I
/*     */     //   548	11	17	value$iv	Ljava/lang/Object;
/*     */     //   529	36	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   526	39	15	it$iv	Ljava/lang/Object;
/*     */     //   517	50	14	$i$f$cache	I
/*     */     //   514	53	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   514	53	13	invalid$iv	Z
/*     */     //   708	23	18	$i$a$-cache-SegmentedControlKt$SegmentedControl$segmentedControlState$2	I
/*     */     //   733	11	19	value$iv	Ljava/lang/Object;
/*     */     //   694	56	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   691	59	16	it$iv	Ljava/lang/Object;
/*     */     //   682	70	15	$i$f$cache	I
/*     */     //   679	73	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   679	73	14	invalid$iv	Z
/*     */     //   835	21	17	$i$a$-cache-SegmentedControlKt$SegmentedControl$2	I
/*     */     //   861	11	18	value$iv	Ljava/lang/Object;
/*     */     //   816	62	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   813	65	15	it$iv	Ljava/lang/Object;
/*     */     //   804	76	14	$i$f$cache	I
/*     */     //   801	79	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   801	79	13	invalid$iv	Z
/*     */     //   1027	11	29	$i$a$-singleOrNull-SegmentedControlKt$SegmentedControl$selectedButtonIndex$1$1	I
/*     */     //   1024	14	28	it	Lkotlin/collections/IndexedValue;
/*     */     //   1017	40	27	element$iv	Ljava/lang/Object;
/*     */     //   983	88	23	$i$f$singleOrNull	I
/*     */     //   986	85	24	single$iv	Ljava/lang/Object;
/*     */     //   989	82	25	found$iv	Z
/*     */     //   980	91	22	$this$singleOrNull$iv	Ljava/lang/Iterable;
/*     */     //   971	115	21	$i$a$-cache-SegmentedControlKt$SegmentedControl$selectedButtonIndex$1	I
/*     */     //   1091	11	30	value$iv	Ljava/lang/Object;
/*     */     //   952	156	20	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   949	159	19	it$iv	Ljava/lang/Object;
/*     */     //   940	170	18	$i$f$cache	I
/*     */     //   937	173	16	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   937	173	17	invalid$iv	Z
/*     */     //   1534	6	42	$i$f$unaryMinus-D9Ej5fM	I
/*     */     //   1566	6	42	$i$f$unaryMinus-D9Ej5fM	I
/*     */     //   1635	7	49	$i$a$-cache-SegmentedControlKt$SegmentedControl$3$1	I
/*     */     //   1647	11	50	value$iv	Ljava/lang/Object;
/*     */     //   1619	45	47	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1616	48	46	it$iv	Ljava/lang/Object;
/*     */     //   1607	59	45	$i$f$cache	I
/*     */     //   1604	62	43	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1604	62	44	invalid$iv	Z
/*     */     //   1754	13	49	$i$a$-cache-SegmentedControlKt$SegmentedControl$3$2	I
/*     */     //   1772	11	50	value$iv	Ljava/lang/Object;
/*     */     //   1733	56	47	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1730	59	46	it$iv	Ljava/lang/Object;
/*     */     //   1721	70	45	$i$f$cache	I
/*     */     //   1718	73	43	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1718	73	44	invalid$iv	Z
/*     */     //   2325	6	82	$i$a$-thenIf-SegmentedControlKt$SegmentedControl$3$3$1$1	I
/*     */     //   2322	9	81	$this$SegmentedControl_u24lambda_u2414_u24lambda_u2413_u24lambda_u2412_u24lambda_u2411	Landroidx/compose/ui/Modifier;
/*     */     //   2313	23	80	$i$f$thenIf	I
/*     */     //   2310	26	78	$this$thenIf$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2310	26	79	precondition$iv	Z
/*     */     //   2275	106	75	$i$a$-forEach-SegmentedControlKt$SegmentedControl$3$3$1	I
/*     */     //   2272	109	74	data	Lorg/jetbrains/jewel/ui/component/SegmentedControlButtonData;
/*     */     //   2265	117	73	element$iv	Ljava/lang/Object;
/*     */     //   2237	149	71	$i$f$forEach	I
/*     */     //   2234	152	70	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   2218	176	69	$i$a$-Row-SegmentedControlKt$SegmentedControl$3$3	I
/*     */     //   2215	179	68	$this$SegmentedControl_u24lambda_u2414_u24lambda_u2413	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   2215	179	67	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   2215	179	66	$changed	I
/*     */     //   2179	220	65	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   2176	223	64	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2176	223	63	$changed$iv	I
/*     */     //   2090	55	62	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   2087	58	61	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2083	64	60	$i$f$set-impl	I
/*     */     //   2080	67	59	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   2046	115	58	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   2043	118	57	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1973	439	56	$i$f$ReusableComposeNode	I
/*     */     //   1970	442	54	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1970	442	55	$changed$iv$iv$iv	I
/*     */     //   1910	508	50	$i$f$Layout	I
/*     */     //   1929	489	51	compositeKeyHash$iv$iv	I
/*     */     //   1938	480	52	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1947	471	53	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1907	511	49	$changed$iv$iv	I
/*     */     //   1860	564	46	$i$f$Row	I
/*     */     //   1897	527	47	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1857	567	42	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1857	567	43	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   1857	567	44	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   1857	567	45	$changed$iv	I
/*     */     //   1491	934	40	$i$a$-Box-SegmentedControlKt$SegmentedControl$3	I
/*     */     //   1503	922	41	shape	Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   1488	937	39	$this$SegmentedControl_u24lambda_u2414	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   1488	937	38	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1488	937	37	$changed	I
/*     */     //   1452	978	36	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   1449	981	35	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1449	981	34	$changed$iv	I
/*     */     //   1363	55	33	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1360	58	32	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1356	64	31	$i$f$set-impl	I
/*     */     //   1353	67	30	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1319	115	29	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1316	118	28	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1246	1197	27	$i$f$ReusableComposeNode	I
/*     */     //   1243	1200	25	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1243	1200	26	$changed$iv$iv$iv	I
/*     */     //   1184	1265	21	$i$f$Layout	I
/*     */     //   1203	1246	22	compositeKeyHash$iv$iv	I
/*     */     //   1212	1237	23	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1220	1229	24	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1181	1268	20	$changed$iv$iv	I
/*     */     //   1142	1313	18	$i$f$Box	I
/*     */     //   1171	1284	19	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1159	1296	15	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   1162	1293	16	propagateMinConstraints$iv	Z
/*     */     //   1139	1316	17	$changed$iv	I
/*     */     //   768	1696	11	segmentedControlState$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   905	1559	12	borderColor$delegate	Landroidx/compose/runtime/State;
/*     */     //   914	1550	13	borderWidth	F
/*     */     //   1129	1335	14	selectedButtonIndex	I
/*     */     //   21	2493	10	$dirty	I
/*     */     //   0	2514	0	buttons	Ljava/util/List;
/*     */     //   0	2514	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	2514	2	enabled	Z
/*     */     //   0	2514	3	style	Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlStyle;
/*     */     //   0	2514	4	buttonStyle	Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlButtonStyle;
/*     */     //   0	2514	5	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	2514	6	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	2514	7	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	2514	8	$changed	I
/*     */   }
/*     */   
/*     */   private static final long SegmentedControl$lambda$2(MutableState $segmentedControlState$delegate) {
/*  50 */     State state = (State)$segmentedControlState$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 300 */       (SegmentedControlState)state.getValue()).unbox-impl(); } private static final void SegmentedControl$lambda$3(MutableState $segmentedControlState$delegate, long <set-?>) { MutableState mutableState = $segmentedControlState$delegate; Object object1 = null, object2 = null; Object value$iv = SegmentedControlState.box-impl(<set-?>); int $i$f$setValue = 0;
/* 301 */     mutableState.setValue(value$iv); } private static final Brush SegmentedControl$lambda$5(State $borderColor$delegate) { State state = $borderColor$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 303 */     return (Brush)state.getValue(); }
/*     */ 
/*     */   
/*     */   private static final Unit SegmentedControl$lambda$14$lambda$9$lambda$8(MutableState<SegmentedControlState> $segmentedControlState$delegate, FocusState it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     SegmentedControl$lambda$3($segmentedControlState$delegate, SegmentedControlState.copy-bhrFvog$default(SegmentedControl$lambda$2($segmentedControlState$delegate), false, it.isFocused(), false, false, false, 29, null));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit SegmentedControl$lambda$15(List<SegmentedControlButtonData> $buttons, Modifier $modifier, boolean $enabled, SegmentedControlStyle $style, SegmentedControlButtonStyle $buttonStyle, TextStyle $textStyle, MutableInteractionSource $interactionSource, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     SegmentedControl($buttons, $modifier, $enabled, $style, $buttonStyle, $textStyle, $interactionSource, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class SegmentedControlKt$SegmentedControl$3$2$1 implements Function1<KeyEvent, Boolean> {
/*     */     public final Boolean invoke-ZmokQxo(Object it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       if (this.$selectedButtonIndex < this.$buttons.size() - 1)
/*     */         ((SegmentedControlButtonData)this.$buttons.get(this.$selectedButtonIndex + 1)).getOnSelect().invoke(); 
/*     */       if (this.$selectedButtonIndex > 0)
/*     */         ((SegmentedControlButtonData)this.$buttons.get(this.$selectedButtonIndex - 1)).getOnSelect().invoke(); 
/*     */       return Boolean.valueOf((KeyEventType.equals-impl0(KeyEventType.Companion.getKeyUp-CS__XNY(), KeyEvent_desktopKt.getType-ZmokQxo(it)) && Key.equals-impl0(Key.Companion.getDirectionRight-EK5gGoQ(), KeyEvent_desktopKt.getKey-ZmokQxo(it))) ? true : ((KeyEventType.equals-impl0(KeyEventType.Companion.getKeyUp-CS__XNY(), KeyEvent_desktopKt.getType-ZmokQxo(it)) && Key.equals-impl0(Key.Companion.getDirectionLeft-EK5gGoQ(), KeyEvent_desktopKt.getKey-ZmokQxo(it)))));
/*     */     }
/*     */     
/*     */     SegmentedControlKt$SegmentedControl$3$2$1(int $selectedButtonIndex, List<SegmentedControlButtonData> $buttons) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\SegmentedControlKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */