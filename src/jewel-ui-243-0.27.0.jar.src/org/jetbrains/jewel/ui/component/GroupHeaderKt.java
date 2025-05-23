package org.jetbrains.jewel.ui.component;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jewel.ui.component.styling.GroupHeaderStyle;

@Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\"\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\0325\020\000\032\0020\0012\006\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tH\007¢\006\004\b\n\020\013¨\006\f"}, d2 = {"GroupHeader", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "textColor", "Landroidx/compose/ui/graphics/Color;", "style", "Lorg/jetbrains/jewel/ui/component/styling/GroupHeaderStyle;", "GroupHeader-cf5BqRc", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JLorg/jetbrains/jewel/ui/component/styling/GroupHeaderStyle;Landroidx/compose/runtime/Composer;II)V", "ui"})
@SourceDebugExtension({"SMAP\nGroupHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroupHeader.kt\norg/jetbrains/jewel/ui/component/GroupHeaderKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,32:1\n77#2:33\n99#3:34\n96#3,6:35\n102#3:69\n106#3:73\n79#4,6:41\n86#4,4:56\n90#4,2:66\n94#4:72\n368#5,9:47\n377#5:68\n378#5,2:70\n4034#6,6:60\n*S KotlinDebug\n*F\n+ 1 GroupHeader.kt\norg/jetbrains/jewel/ui/component/GroupHeaderKt\n*L\n18#1:33\n20#1:34\n20#1:35,6\n20#1:69\n20#1:73\n20#1:41,6\n20#1:56,4\n20#1:66,2\n20#1:72\n20#1:47,9\n20#1:68\n20#1:70,2\n20#1:60,6\n*E\n"})
public final class GroupHeaderKt {
  @Composable
  @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
  public static final void GroupHeader-cf5BqRc(@NotNull String text, @Nullable Modifier modifier, long textColor, @Nullable GroupHeaderStyle style, @Nullable Composer $composer, int $changed, int paramInt1) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'text'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload #5
    //   8: ldc -1477626894
    //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   15: astore #5
    //   17: iload #6
    //   19: istore #8
    //   21: iload #7
    //   23: iconst_1
    //   24: iand
    //   25: ifeq -> 38
    //   28: iload #8
    //   30: bipush #6
    //   32: ior
    //   33: istore #8
    //   35: goto -> 67
    //   38: iload #6
    //   40: bipush #6
    //   42: iand
    //   43: ifne -> 67
    //   46: iload #8
    //   48: aload #5
    //   50: aload_0
    //   51: invokeinterface changed : (Ljava/lang/Object;)Z
    //   56: ifeq -> 63
    //   59: iconst_4
    //   60: goto -> 64
    //   63: iconst_2
    //   64: ior
    //   65: istore #8
    //   67: iload #7
    //   69: iconst_2
    //   70: iand
    //   71: ifeq -> 84
    //   74: iload #8
    //   76: bipush #48
    //   78: ior
    //   79: istore #8
    //   81: goto -> 115
    //   84: iload #6
    //   86: bipush #48
    //   88: iand
    //   89: ifne -> 115
    //   92: iload #8
    //   94: aload #5
    //   96: aload_1
    //   97: invokeinterface changed : (Ljava/lang/Object;)Z
    //   102: ifeq -> 110
    //   105: bipush #32
    //   107: goto -> 112
    //   110: bipush #16
    //   112: ior
    //   113: istore #8
    //   115: iload #7
    //   117: iconst_4
    //   118: iand
    //   119: ifeq -> 133
    //   122: iload #8
    //   124: sipush #384
    //   127: ior
    //   128: istore #8
    //   130: goto -> 167
    //   133: iload #6
    //   135: sipush #384
    //   138: iand
    //   139: ifne -> 167
    //   142: iload #8
    //   144: aload #5
    //   146: lload_2
    //   147: invokeinterface changed : (J)Z
    //   152: ifeq -> 161
    //   155: sipush #256
    //   158: goto -> 164
    //   161: sipush #128
    //   164: ior
    //   165: istore #8
    //   167: iload #6
    //   169: sipush #3072
    //   172: iand
    //   173: ifne -> 210
    //   176: iload #8
    //   178: iload #7
    //   180: bipush #8
    //   182: iand
    //   183: ifne -> 204
    //   186: aload #5
    //   188: aload #4
    //   190: invokeinterface changed : (Ljava/lang/Object;)Z
    //   195: ifeq -> 204
    //   198: sipush #2048
    //   201: goto -> 207
    //   204: sipush #1024
    //   207: ior
    //   208: istore #8
    //   210: iload #8
    //   212: sipush #1171
    //   215: iand
    //   216: sipush #1170
    //   219: if_icmpne -> 232
    //   222: aload #5
    //   224: invokeinterface getSkipping : ()Z
    //   229: ifne -> 905
    //   232: aload #5
    //   234: invokeinterface startDefaults : ()V
    //   239: iload #6
    //   241: iconst_1
    //   242: iand
    //   243: ifeq -> 256
    //   246: aload #5
    //   248: invokeinterface getDefaultsInvalid : ()Z
    //   253: ifeq -> 350
    //   256: iload #7
    //   258: iconst_2
    //   259: iand
    //   260: ifeq -> 270
    //   263: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   266: checkcast androidx/compose/ui/Modifier
    //   269: astore_1
    //   270: iload #7
    //   272: iconst_4
    //   273: iand
    //   274: ifeq -> 284
    //   277: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
    //   280: invokevirtual getUnspecified-0d7_KjU : ()J
    //   283: lstore_2
    //   284: iload #7
    //   286: bipush #8
    //   288: iand
    //   289: ifeq -> 373
    //   292: invokestatic getLocalGroupHeaderStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
    //   295: checkcast androidx/compose/runtime/CompositionLocal
    //   298: astore #9
    //   300: bipush #6
    //   302: istore #10
    //   304: iconst_0
    //   305: istore #11
    //   307: aload #5
    //   309: ldc 2023513938
    //   311: ldc 'CC:CompositionLocal.kt#9igjgp'
    //   313: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   316: aload #5
    //   318: aload #9
    //   320: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
    //   325: astore #12
    //   327: aload #5
    //   329: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   332: aload #12
    //   334: checkcast org/jetbrains/jewel/ui/component/styling/GroupHeaderStyle
    //   337: astore #4
    //   339: iload #8
    //   341: sipush #-7169
    //   344: iand
    //   345: istore #8
    //   347: goto -> 373
    //   350: aload #5
    //   352: invokeinterface skipToGroupEnd : ()V
    //   357: iload #7
    //   359: bipush #8
    //   361: iand
    //   362: ifeq -> 373
    //   365: iload #8
    //   367: sipush #-7169
    //   370: iand
    //   371: istore #8
    //   373: aload #5
    //   375: invokeinterface endDefaults : ()V
    //   380: invokestatic isTraceInProgress : ()Z
    //   383: ifeq -> 396
    //   386: ldc -1477626894
    //   388: iload #8
    //   390: iconst_m1
    //   391: ldc 'org.jetbrains.jewel.ui.component.GroupHeader (GroupHeader.kt:18)'
    //   393: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   396: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   399: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
    //   402: astore #10
    //   404: sipush #384
    //   407: bipush #14
    //   409: iload #8
    //   411: iconst_3
    //   412: ishr
    //   413: iand
    //   414: ior
    //   415: istore #11
    //   417: iconst_0
    //   418: istore #12
    //   420: aload #5
    //   422: ldc 693286680
    //   424: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
    //   426: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   429: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
    //   432: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    //   435: astore #9
    //   437: aload #9
    //   439: aload #10
    //   441: aload #5
    //   443: bipush #14
    //   445: iload #11
    //   447: iconst_3
    //   448: ishr
    //   449: iand
    //   450: bipush #112
    //   452: iload #11
    //   454: iconst_3
    //   455: ishr
    //   456: iand
    //   457: ior
    //   458: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    //   461: astore #13
    //   463: bipush #112
    //   465: iload #11
    //   467: iconst_3
    //   468: ishl
    //   469: iand
    //   470: istore #14
    //   472: nop
    //   473: iconst_0
    //   474: istore #15
    //   476: aload #5
    //   478: ldc -1323940314
    //   480: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   482: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   485: aload #5
    //   487: iconst_0
    //   488: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   491: istore #16
    //   493: aload #5
    //   495: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   500: astore #17
    //   502: aload #5
    //   504: aload_1
    //   505: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   508: astore #18
    //   510: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   513: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   516: astore #19
    //   518: bipush #6
    //   520: sipush #896
    //   523: iload #14
    //   525: bipush #6
    //   527: ishl
    //   528: iand
    //   529: ior
    //   530: istore #20
    //   532: nop
    //   533: iconst_0
    //   534: istore #21
    //   536: aload #5
    //   538: ldc -692256719
    //   540: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   542: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   545: aload #5
    //   547: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   552: instanceof androidx/compose/runtime/Applier
    //   555: ifne -> 561
    //   558: invokestatic invalidApplier : ()V
    //   561: aload #5
    //   563: invokeinterface startReusableNode : ()V
    //   568: aload #5
    //   570: invokeinterface getInserting : ()Z
    //   575: ifeq -> 590
    //   578: aload #5
    //   580: aload #19
    //   582: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   587: goto -> 597
    //   590: aload #5
    //   592: invokeinterface useNode : ()V
    //   597: aload #5
    //   599: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   602: astore #22
    //   604: iconst_0
    //   605: istore #23
    //   607: aload #22
    //   609: aload #13
    //   611: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   614: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   617: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   620: aload #22
    //   622: aload #17
    //   624: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   627: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   630: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   633: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   636: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   639: astore #24
    //   641: iconst_0
    //   642: istore #25
    //   644: aload #22
    //   646: astore #26
    //   648: iconst_0
    //   649: istore #27
    //   651: aload #26
    //   653: invokeinterface getInserting : ()Z
    //   658: ifne -> 679
    //   661: aload #26
    //   663: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   668: iload #16
    //   670: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   673: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   676: ifne -> 705
    //   679: aload #26
    //   681: iload #16
    //   683: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   686: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   691: aload #22
    //   693: iload #16
    //   695: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   698: aload #24
    //   700: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   705: nop
    //   706: nop
    //   707: nop
    //   708: aload #22
    //   710: aload #18
    //   712: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   715: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   718: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   721: nop
    //   722: nop
    //   723: aload #5
    //   725: bipush #14
    //   727: iload #20
    //   729: bipush #6
    //   731: ishr
    //   732: iand
    //   733: istore #28
    //   735: astore #29
    //   737: iconst_0
    //   738: istore #30
    //   740: aload #29
    //   742: ldc -407840262
    //   744: ldc 'C101@5126L9:Row.kt#2w3rfo'
    //   746: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   749: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
    //   752: aload #29
    //   754: bipush #6
    //   756: bipush #112
    //   758: iload #11
    //   760: bipush #6
    //   762: ishr
    //   763: iand
    //   764: ior
    //   765: istore #31
    //   767: astore #32
    //   769: checkcast androidx/compose/foundation/layout/RowScope
    //   772: astore #33
    //   774: iconst_0
    //   775: istore #34
    //   777: aload_0
    //   778: aconst_null
    //   779: lload_2
    //   780: lconst_0
    //   781: aconst_null
    //   782: aconst_null
    //   783: aconst_null
    //   784: lconst_0
    //   785: aconst_null
    //   786: iconst_0
    //   787: lconst_0
    //   788: iconst_0
    //   789: iconst_0
    //   790: iconst_0
    //   791: aconst_null
    //   792: aconst_null
    //   793: aload #32
    //   795: bipush #14
    //   797: iload #8
    //   799: iand
    //   800: sipush #896
    //   803: iload #8
    //   805: iand
    //   806: ior
    //   807: iconst_0
    //   808: ldc 65530
    //   810: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
    //   813: getstatic org/jetbrains/jewel/ui/Orientation.Horizontal : Lorg/jetbrains/jewel/ui/Orientation;
    //   816: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   819: checkcast androidx/compose/ui/Modifier
    //   822: fconst_0
    //   823: iconst_1
    //   824: aconst_null
    //   825: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   828: aload #4
    //   830: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/GroupHeaderColors;
    //   833: invokevirtual getDivider-0d7_KjU : ()J
    //   836: aload #4
    //   838: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/GroupHeaderMetrics;
    //   841: invokevirtual getDividerThickness-D9Ej5fM : ()F
    //   844: aload #4
    //   846: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/GroupHeaderMetrics;
    //   849: invokevirtual getIndent-D9Ej5fM : ()F
    //   852: aconst_null
    //   853: aload #32
    //   855: bipush #54
    //   857: bipush #32
    //   859: invokestatic Divider-RLL6an4 : (Lorg/jetbrains/jewel/ui/Orientation;Landroidx/compose/ui/Modifier;JFFLorg/jetbrains/jewel/ui/component/styling/DividerStyle;Landroidx/compose/runtime/Composer;II)V
    //   862: nop
    //   863: aload #29
    //   865: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   868: aload #5
    //   870: invokeinterface endNode : ()V
    //   875: aload #5
    //   877: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   880: nop
    //   881: aload #5
    //   883: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   886: nop
    //   887: aload #5
    //   889: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   892: nop
    //   893: invokestatic isTraceInProgress : ()Z
    //   896: ifeq -> 912
    //   899: invokestatic traceEventEnd : ()V
    //   902: goto -> 912
    //   905: aload #5
    //   907: invokeinterface skipToGroupEnd : ()V
    //   912: aload #5
    //   914: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   919: dup
    //   920: ifnull -> 945
    //   923: aload_0
    //   924: aload_1
    //   925: lload_2
    //   926: aload #4
    //   928: iload #6
    //   930: iload #7
    //   932: <illegal opcode> invoke : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JLorg/jetbrains/jewel/ui/component/styling/GroupHeaderStyle;II)Lkotlin/jvm/functions/Function2;
    //   937: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   942: goto -> 946
    //   945: pop
    //   946: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #19	-> 6
    //   #16	-> 263
    //   #17	-> 277
    //   #18	-> 292
    //   #33	-> 313
    //   #19	-> 393
    //   #20	-> 396
    //   #34	-> 426
    //   #35	-> 429
    //   #39	-> 437
    //   #40	-> 472
    //   #41	-> 482
    //   #42	-> 488
    //   #43	-> 495
    //   #44	-> 504
    //   #46	-> 510
    //   #45	-> 532
    //   #47	-> 542
    //   #48	-> 545
    //   #49	-> 563
    //   #50	-> 568
    //   #51	-> 580
    //   #53	-> 592
    //   #55	-> 597
    //   #56	-> 607
    //   #57	-> 620
    //   #59	-> 633
    //   #60	-> 644
    //   #61	-> 651
    //   #62	-> 679
    //   #63	-> 691
    //   #65	-> 705
    //   #60	-> 706
    //   #65	-> 707
    //   #66	-> 708
    //   #67	-> 721
    //   #55	-> 722
    //   #68	-> 723
    //   #69	-> 746
    //   #21	-> 777
    //   #24	-> 813
    //   #25	-> 816
    //   #26	-> 828
    //   #27	-> 836
    //   #28	-> 844
    //   #23	-> 859
    //   #30	-> 862
    //   #69	-> 863
    //   #68	-> 868
    //   #70	-> 870
    //   #47	-> 877
    //   #71	-> 880
    //   #41	-> 883
    //   #72	-> 886
    //   #34	-> 889
    //   #73	-> 892
    //   #31	-> 905
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   307	27	11	$i$f$getCurrent	I
    //   304	30	9	this_$iv	Landroidx/compose/runtime/CompositionLocal;
    //   304	30	10	$changed$iv	I
    //   777	86	34	$i$a$-Row-GroupHeaderKt$GroupHeader$1	I
    //   774	89	33	$this$GroupHeader_cf5BqRc_u24lambda_u240	Landroidx/compose/foundation/layout/RowScope;
    //   774	89	32	$composer	Landroidx/compose/runtime/Composer;
    //   774	89	31	$changed	I
    //   740	128	30	$i$a$-Layout-RowKt$Row$1$iv	I
    //   737	131	29	$composer$iv	Landroidx/compose/runtime/Composer;
    //   737	131	28	$changed$iv	I
    //   651	55	27	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   648	58	26	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   644	64	25	$i$f$set-impl	I
    //   641	67	24	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   607	115	23	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   604	118	22	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   536	345	21	$i$f$ReusableComposeNode	I
    //   533	348	19	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   533	348	20	$changed$iv$iv$iv	I
    //   476	411	15	$i$f$Layout	I
    //   493	394	16	compositeKeyHash$iv$iv	I
    //   502	385	17	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   510	377	18	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   473	414	14	$changed$iv$iv	I
    //   420	473	12	$i$f$Row	I
    //   463	430	13	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   437	456	9	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    //   417	476	10	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
    //   417	476	11	$changed$iv	I
    //   21	926	8	$dirty	I
    //   0	947	0	text	Ljava/lang/String;
    //   0	947	1	modifier	Landroidx/compose/ui/Modifier;
    //   0	947	2	textColor	J
    //   0	947	4	style	Lorg/jetbrains/jewel/ui/component/styling/GroupHeaderStyle;
    //   0	947	5	$composer	Landroidx/compose/runtime/Composer;
    //   0	947	6	$changed	I
  }
  
  private static final Unit GroupHeader_cf5BqRc$lambda$1(String $text, Modifier $modifier, long $textColor, GroupHeaderStyle $style, int $$changed, int $$default, Composer $composer, int $force) {
    GroupHeader-cf5BqRc($text, $modifier, $textColor, $style, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
    return Unit.INSTANCE;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\GroupHeaderKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */