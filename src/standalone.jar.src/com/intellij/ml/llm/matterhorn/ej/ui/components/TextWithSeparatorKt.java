package com.intellij.ml.llm.matterhorn.ej.ui.components;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.font.FontWeight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000*\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\032S\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\006\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\fH\007¢\006\004\b\016\020\017¨\006\020"}, d2 = {"TextWithSeparator", "", "modifier", "Landroidx/compose/ui/Modifier;", "text", "", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "lineHeight", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "textTint", "Landroidx/compose/ui/graphics/Color;", "separatorTint", "TextWithSeparator-fMjUOWI", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;JJLandroidx/compose/ui/text/font/FontWeight;JJLandroidx/compose/runtime/Composer;II)V", "standalone"})
@SourceDebugExtension({"SMAP\nTextWithSeparator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextWithSeparator.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/TextWithSeparatorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,45:1\n149#2:46\n86#3:47\n84#3,5:48\n89#3:81\n93#3:85\n79#4,6:53\n86#4,4:68\n90#4,2:78\n94#4:84\n368#5,9:59\n377#5:80\n378#5,2:82\n4034#6,6:72\n*S KotlinDebug\n*F\n+ 1 TextWithSeparator.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/TextWithSeparatorKt\n*L\n29#1:46\n27#1:47\n27#1:48,5\n27#1:81\n27#1:85\n27#1:53,6\n27#1:68,4\n27#1:78,2\n27#1:84\n27#1:59,9\n27#1:80\n27#1:82,2\n27#1:72,6\n*E\n"})
public final class TextWithSeparatorKt {
  @Composable
  @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
  public static final void TextWithSeparator-fMjUOWI(@Nullable Modifier modifier, @NotNull String text, long fontSize, long lineHeight, @Nullable FontWeight fontWeight, long textTint, long separatorTint, @Nullable Composer $composer, int $changed, int paramInt1) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'text'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload #11
    //   8: ldc 1798179408
    //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   15: astore #11
    //   17: iload #12
    //   19: istore #14
    //   21: iload #13
    //   23: iconst_1
    //   24: iand
    //   25: ifeq -> 38
    //   28: iload #14
    //   30: bipush #6
    //   32: ior
    //   33: istore #14
    //   35: goto -> 67
    //   38: iload #12
    //   40: bipush #6
    //   42: iand
    //   43: ifne -> 67
    //   46: iload #14
    //   48: aload #11
    //   50: aload_0
    //   51: invokeinterface changed : (Ljava/lang/Object;)Z
    //   56: ifeq -> 63
    //   59: iconst_4
    //   60: goto -> 64
    //   63: iconst_2
    //   64: ior
    //   65: istore #14
    //   67: iload #13
    //   69: iconst_2
    //   70: iand
    //   71: ifeq -> 84
    //   74: iload #14
    //   76: bipush #48
    //   78: ior
    //   79: istore #14
    //   81: goto -> 115
    //   84: iload #12
    //   86: bipush #48
    //   88: iand
    //   89: ifne -> 115
    //   92: iload #14
    //   94: aload #11
    //   96: aload_1
    //   97: invokeinterface changed : (Ljava/lang/Object;)Z
    //   102: ifeq -> 110
    //   105: bipush #32
    //   107: goto -> 112
    //   110: bipush #16
    //   112: ior
    //   113: istore #14
    //   115: iload #13
    //   117: iconst_4
    //   118: iand
    //   119: ifeq -> 133
    //   122: iload #14
    //   124: sipush #384
    //   127: ior
    //   128: istore #14
    //   130: goto -> 167
    //   133: iload #12
    //   135: sipush #384
    //   138: iand
    //   139: ifne -> 167
    //   142: iload #14
    //   144: aload #11
    //   146: lload_2
    //   147: invokeinterface changed : (J)Z
    //   152: ifeq -> 161
    //   155: sipush #256
    //   158: goto -> 164
    //   161: sipush #128
    //   164: ior
    //   165: istore #14
    //   167: iload #13
    //   169: bipush #8
    //   171: iand
    //   172: ifeq -> 186
    //   175: iload #14
    //   177: sipush #3072
    //   180: ior
    //   181: istore #14
    //   183: goto -> 221
    //   186: iload #12
    //   188: sipush #3072
    //   191: iand
    //   192: ifne -> 221
    //   195: iload #14
    //   197: aload #11
    //   199: lload #4
    //   201: invokeinterface changed : (J)Z
    //   206: ifeq -> 215
    //   209: sipush #2048
    //   212: goto -> 218
    //   215: sipush #1024
    //   218: ior
    //   219: istore #14
    //   221: iload #13
    //   223: bipush #16
    //   225: iand
    //   226: ifeq -> 240
    //   229: iload #14
    //   231: sipush #24576
    //   234: ior
    //   235: istore #14
    //   237: goto -> 275
    //   240: iload #12
    //   242: sipush #24576
    //   245: iand
    //   246: ifne -> 275
    //   249: iload #14
    //   251: aload #11
    //   253: aload #6
    //   255: invokeinterface changed : (Ljava/lang/Object;)Z
    //   260: ifeq -> 269
    //   263: sipush #16384
    //   266: goto -> 272
    //   269: sipush #8192
    //   272: ior
    //   273: istore #14
    //   275: iload #12
    //   277: ldc 196608
    //   279: iand
    //   280: ifne -> 315
    //   283: iload #14
    //   285: iload #13
    //   287: bipush #32
    //   289: iand
    //   290: ifne -> 310
    //   293: aload #11
    //   295: lload #7
    //   297: invokeinterface changed : (J)Z
    //   302: ifeq -> 310
    //   305: ldc 131072
    //   307: goto -> 312
    //   310: ldc 65536
    //   312: ior
    //   313: istore #14
    //   315: iload #12
    //   317: ldc 1572864
    //   319: iand
    //   320: ifne -> 355
    //   323: iload #14
    //   325: iload #13
    //   327: bipush #64
    //   329: iand
    //   330: ifne -> 350
    //   333: aload #11
    //   335: lload #9
    //   337: invokeinterface changed : (J)Z
    //   342: ifeq -> 350
    //   345: ldc 1048576
    //   347: goto -> 352
    //   350: ldc 524288
    //   352: ior
    //   353: istore #14
    //   355: iload #14
    //   357: ldc 599187
    //   359: iand
    //   360: ldc 599186
    //   362: if_icmpne -> 375
    //   365: aload #11
    //   367: invokeinterface getSkipping : ()Z
    //   372: ifne -> 1136
    //   375: aload #11
    //   377: invokeinterface startDefaults : ()V
    //   382: iload #12
    //   384: iconst_1
    //   385: iand
    //   386: ifeq -> 399
    //   389: aload #11
    //   391: invokeinterface getDefaultsInvalid : ()Z
    //   396: ifeq -> 520
    //   399: iload #13
    //   401: iconst_1
    //   402: iand
    //   403: ifeq -> 413
    //   406: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   409: checkcast androidx/compose/ui/Modifier
    //   412: astore_0
    //   413: iload #13
    //   415: iconst_4
    //   416: iand
    //   417: ifeq -> 427
    //   420: getstatic androidx/compose/ui/unit/TextUnit.Companion : Landroidx/compose/ui/unit/TextUnit$Companion;
    //   423: invokevirtual getUnspecified-XSAIIZE : ()J
    //   426: lstore_2
    //   427: iload #13
    //   429: bipush #8
    //   431: iand
    //   432: ifeq -> 443
    //   435: getstatic androidx/compose/ui/unit/TextUnit.Companion : Landroidx/compose/ui/unit/TextUnit$Companion;
    //   438: invokevirtual getUnspecified-XSAIIZE : ()J
    //   441: lstore #4
    //   443: iload #13
    //   445: bipush #16
    //   447: iand
    //   448: ifeq -> 459
    //   451: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
    //   454: invokevirtual getNormal : ()Landroidx/compose/ui/text/font/FontWeight;
    //   457: astore #6
    //   459: iload #13
    //   461: bipush #32
    //   463: iand
    //   464: ifeq -> 488
    //   467: aload #11
    //   469: iconst_0
    //   470: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
    //   473: aload #11
    //   475: iconst_0
    //   476: invokevirtual getInactiveTextColor : (Landroidx/compose/runtime/Composer;I)J
    //   479: lstore #7
    //   481: iload #14
    //   483: ldc -458753
    //   485: iand
    //   486: istore #14
    //   488: iload #13
    //   490: bipush #64
    //   492: iand
    //   493: ifeq -> 557
    //   496: aload #11
    //   498: iconst_0
    //   499: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
    //   502: aload #11
    //   504: iconst_0
    //   505: invokevirtual getInactiveTextColor : (Landroidx/compose/runtime/Composer;I)J
    //   508: lstore #9
    //   510: iload #14
    //   512: ldc -3670017
    //   514: iand
    //   515: istore #14
    //   517: goto -> 557
    //   520: aload #11
    //   522: invokeinterface skipToGroupEnd : ()V
    //   527: iload #13
    //   529: bipush #32
    //   531: iand
    //   532: ifeq -> 542
    //   535: iload #14
    //   537: ldc -458753
    //   539: iand
    //   540: istore #14
    //   542: iload #13
    //   544: bipush #64
    //   546: iand
    //   547: ifeq -> 557
    //   550: iload #14
    //   552: ldc -3670017
    //   554: iand
    //   555: istore #14
    //   557: aload #11
    //   559: invokeinterface endDefaults : ()V
    //   564: invokestatic isTraceInProgress : ()Z
    //   567: ifeq -> 580
    //   570: ldc 1798179408
    //   572: iload #14
    //   574: iconst_m1
    //   575: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.TextWithSeparator (TextWithSeparator.kt:25)'
    //   577: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   580: aload_0
    //   581: astore #15
    //   583: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
    //   586: bipush #8
    //   588: istore #16
    //   590: iconst_0
    //   591: istore #17
    //   593: iload #16
    //   595: i2f
    //   596: invokestatic constructor-impl : (F)F
    //   599: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    //   602: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
    //   605: astore #16
    //   607: bipush #48
    //   609: bipush #14
    //   611: iload #14
    //   613: iand
    //   614: ior
    //   615: istore #18
    //   617: nop
    //   618: iconst_0
    //   619: istore #19
    //   621: aload #11
    //   623: ldc -483455358
    //   625: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
    //   627: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   630: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   633: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
    //   636: astore #17
    //   638: aload #16
    //   640: aload #17
    //   642: aload #11
    //   644: bipush #14
    //   646: iload #18
    //   648: iconst_3
    //   649: ishr
    //   650: iand
    //   651: bipush #112
    //   653: iload #18
    //   655: iconst_3
    //   656: ishr
    //   657: iand
    //   658: ior
    //   659: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    //   662: astore #20
    //   664: bipush #112
    //   666: iload #18
    //   668: iconst_3
    //   669: ishl
    //   670: iand
    //   671: istore #21
    //   673: nop
    //   674: iconst_0
    //   675: istore #22
    //   677: aload #11
    //   679: ldc -1323940314
    //   681: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   683: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   686: aload #11
    //   688: iconst_0
    //   689: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   692: istore #23
    //   694: aload #11
    //   696: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   701: astore #24
    //   703: aload #11
    //   705: aload #15
    //   707: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   710: astore #25
    //   712: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   715: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   718: astore #26
    //   720: bipush #6
    //   722: sipush #896
    //   725: iload #21
    //   727: bipush #6
    //   729: ishl
    //   730: iand
    //   731: ior
    //   732: istore #27
    //   734: nop
    //   735: iconst_0
    //   736: istore #28
    //   738: aload #11
    //   740: ldc -692256719
    //   742: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   744: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   747: aload #11
    //   749: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   754: instanceof androidx/compose/runtime/Applier
    //   757: ifne -> 763
    //   760: invokestatic invalidApplier : ()V
    //   763: aload #11
    //   765: invokeinterface startReusableNode : ()V
    //   770: aload #11
    //   772: invokeinterface getInserting : ()Z
    //   777: ifeq -> 792
    //   780: aload #11
    //   782: aload #26
    //   784: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   789: goto -> 799
    //   792: aload #11
    //   794: invokeinterface useNode : ()V
    //   799: aload #11
    //   801: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   804: astore #29
    //   806: iconst_0
    //   807: istore #30
    //   809: aload #29
    //   811: aload #20
    //   813: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   816: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   819: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   822: aload #29
    //   824: aload #24
    //   826: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   829: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   832: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   835: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   838: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   841: astore #31
    //   843: iconst_0
    //   844: istore #32
    //   846: aload #29
    //   848: astore #33
    //   850: iconst_0
    //   851: istore #34
    //   853: aload #33
    //   855: invokeinterface getInserting : ()Z
    //   860: ifne -> 881
    //   863: aload #33
    //   865: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   870: iload #23
    //   872: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   875: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   878: ifne -> 907
    //   881: aload #33
    //   883: iload #23
    //   885: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   888: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   893: aload #29
    //   895: iload #23
    //   897: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   900: aload #31
    //   902: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   907: nop
    //   908: nop
    //   909: nop
    //   910: aload #29
    //   912: aload #25
    //   914: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   917: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   920: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   923: nop
    //   924: nop
    //   925: aload #11
    //   927: bipush #14
    //   929: iload #27
    //   931: bipush #6
    //   933: ishr
    //   934: iand
    //   935: istore #35
    //   937: astore #36
    //   939: iconst_0
    //   940: istore #37
    //   942: aload #36
    //   944: ldc -384784025
    //   946: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
    //   949: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   952: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
    //   955: aload #36
    //   957: bipush #6
    //   959: bipush #112
    //   961: iload #18
    //   963: bipush #6
    //   965: ishr
    //   966: iand
    //   967: ior
    //   968: istore #38
    //   970: astore #39
    //   972: checkcast androidx/compose/foundation/layout/ColumnScope
    //   975: astore #40
    //   977: iconst_0
    //   978: istore #41
    //   980: aload_1
    //   981: aconst_null
    //   982: lload #7
    //   984: lload_2
    //   985: aconst_null
    //   986: aload #6
    //   988: aconst_null
    //   989: lconst_0
    //   990: aconst_null
    //   991: iconst_0
    //   992: lload #4
    //   994: iconst_0
    //   995: iconst_0
    //   996: iconst_0
    //   997: aconst_null
    //   998: aconst_null
    //   999: aload #39
    //   1001: bipush #14
    //   1003: iload #14
    //   1005: iconst_3
    //   1006: ishr
    //   1007: iand
    //   1008: sipush #896
    //   1011: iload #14
    //   1013: bipush #9
    //   1015: ishr
    //   1016: iand
    //   1017: ior
    //   1018: sipush #7168
    //   1021: iload #14
    //   1023: iconst_3
    //   1024: ishl
    //   1025: iand
    //   1026: ior
    //   1027: ldc_w 458752
    //   1030: iload #14
    //   1032: iconst_3
    //   1033: ishl
    //   1034: iand
    //   1035: ior
    //   1036: bipush #14
    //   1038: iload #14
    //   1040: bipush #9
    //   1042: ishr
    //   1043: iand
    //   1044: ldc_w 64466
    //   1047: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
    //   1050: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   1053: checkcast androidx/compose/ui/Modifier
    //   1056: fconst_0
    //   1057: iconst_1
    //   1058: aconst_null
    //   1059: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   1062: astore #42
    //   1064: getstatic org/jetbrains/jewel/ui/Orientation.Horizontal : Lorg/jetbrains/jewel/ui/Orientation;
    //   1067: aload #42
    //   1069: lload #9
    //   1071: fconst_0
    //   1072: fconst_0
    //   1073: aconst_null
    //   1074: aload #39
    //   1076: bipush #54
    //   1078: sipush #896
    //   1081: iload #14
    //   1083: bipush #12
    //   1085: ishr
    //   1086: iand
    //   1087: ior
    //   1088: bipush #56
    //   1090: invokestatic Divider-RLL6an4 : (Lorg/jetbrains/jewel/ui/Orientation;Landroidx/compose/ui/Modifier;JFFLorg/jetbrains/jewel/ui/component/styling/DividerStyle;Landroidx/compose/runtime/Composer;II)V
    //   1093: nop
    //   1094: aload #36
    //   1096: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1099: aload #11
    //   1101: invokeinterface endNode : ()V
    //   1106: aload #11
    //   1108: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1111: nop
    //   1112: aload #11
    //   1114: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1117: nop
    //   1118: aload #11
    //   1120: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1123: nop
    //   1124: invokestatic isTraceInProgress : ()Z
    //   1127: ifeq -> 1143
    //   1130: invokestatic traceEventEnd : ()V
    //   1133: goto -> 1143
    //   1136: aload #11
    //   1138: invokeinterface skipToGroupEnd : ()V
    //   1143: aload #11
    //   1145: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   1150: dup
    //   1151: ifnull -> 1182
    //   1154: aload_0
    //   1155: aload_1
    //   1156: lload_2
    //   1157: lload #4
    //   1159: aload #6
    //   1161: lload #7
    //   1163: lload #9
    //   1165: iload #12
    //   1167: iload #13
    //   1169: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Ljava/lang/String;JJLandroidx/compose/ui/text/font/FontWeight;JJII)Lkotlin/jvm/functions/Function2;
    //   1174: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   1179: goto -> 1183
    //   1182: pop
    //   1183: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #26	-> 6
    //   #19	-> 406
    //   #21	-> 420
    //   #22	-> 435
    //   #23	-> 451
    //   #24	-> 467
    //   #25	-> 496
    //   #26	-> 577
    //   #28	-> 580
    //   #29	-> 583
    //   #46	-> 593
    //   #29	-> 599
    //   #27	-> 617
    //   #47	-> 627
    //   #48	-> 630
    //   #51	-> 638
    //   #52	-> 673
    //   #53	-> 683
    //   #54	-> 689
    //   #55	-> 696
    //   #56	-> 705
    //   #58	-> 712
    //   #57	-> 734
    //   #59	-> 744
    //   #60	-> 747
    //   #61	-> 765
    //   #62	-> 770
    //   #63	-> 782
    //   #65	-> 794
    //   #67	-> 799
    //   #68	-> 809
    //   #69	-> 822
    //   #71	-> 835
    //   #72	-> 846
    //   #73	-> 853
    //   #74	-> 881
    //   #75	-> 893
    //   #77	-> 907
    //   #72	-> 908
    //   #77	-> 909
    //   #78	-> 910
    //   #79	-> 923
    //   #67	-> 924
    //   #80	-> 925
    //   #81	-> 949
    //   #32	-> 980
    //   #33	-> 982
    //   #34	-> 984
    //   #36	-> 986
    //   #35	-> 992
    //   #31	-> 1047
    //   #39	-> 1050
    //   #40	-> 1064
    //   #39	-> 1067
    //   #41	-> 1069
    //   #38	-> 1090
    //   #43	-> 1093
    //   #81	-> 1094
    //   #80	-> 1099
    //   #82	-> 1101
    //   #59	-> 1108
    //   #83	-> 1111
    //   #53	-> 1114
    //   #84	-> 1117
    //   #47	-> 1120
    //   #85	-> 1123
    //   #44	-> 1136
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   593	6	17	$i$f$getDp	I
    //   590	9	16	$this$dp$iv	I
    //   980	114	41	$i$a$-Column-TextWithSeparatorKt$TextWithSeparator$1	I
    //   977	117	40	$this$TextWithSeparator_fMjUOWI_u24lambda_u240	Landroidx/compose/foundation/layout/ColumnScope;
    //   977	117	39	$composer	Landroidx/compose/runtime/Composer;
    //   977	117	38	$changed	I
    //   942	157	37	$i$a$-Layout-ColumnKt$Column$1$iv	I
    //   939	160	36	$composer$iv	Landroidx/compose/runtime/Composer;
    //   939	160	35	$changed$iv	I
    //   853	55	34	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   850	58	33	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   846	64	32	$i$f$set-impl	I
    //   843	67	31	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   809	115	30	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   806	118	29	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   738	374	28	$i$f$ReusableComposeNode	I
    //   735	377	26	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   735	377	27	$changed$iv$iv$iv	I
    //   677	441	22	$i$f$Layout	I
    //   694	424	23	compositeKeyHash$iv$iv	I
    //   703	415	24	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   712	406	25	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   674	444	21	$changed$iv$iv	I
    //   621	503	19	$i$f$Column	I
    //   664	460	20	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   618	506	15	modifier$iv	Landroidx/compose/ui/Modifier;
    //   618	506	16	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
    //   638	486	17	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
    //   618	506	18	$changed$iv	I
    //   21	1163	14	$dirty	I
    //   0	1184	0	modifier	Landroidx/compose/ui/Modifier;
    //   0	1184	1	text	Ljava/lang/String;
    //   0	1184	2	fontSize	J
    //   0	1184	4	lineHeight	J
    //   0	1184	6	fontWeight	Landroidx/compose/ui/text/font/FontWeight;
    //   0	1184	7	textTint	J
    //   0	1184	9	separatorTint	J
    //   0	1184	11	$composer	Landroidx/compose/runtime/Composer;
    //   0	1184	12	$changed	I
  }
  
  private static final Unit TextWithSeparator_fMjUOWI$lambda$1(Modifier $modifier, String $text, long $fontSize, long $lineHeight, FontWeight $fontWeight, long $textTint, long $separatorTint, int $$changed, int $$default, Composer $composer, int $force) {
    TextWithSeparator-fMjUOWI($modifier, $text, $fontSize, $lineHeight, $fontWeight, $textTint, $separatorTint, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
    return Unit.INSTANCE;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\TextWithSeparatorKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */