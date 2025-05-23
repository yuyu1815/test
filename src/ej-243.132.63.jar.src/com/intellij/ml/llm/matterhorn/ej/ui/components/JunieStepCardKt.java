package com.intellij.ml.llm.matterhorn.ej.ui.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000<\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\032i\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\034\020\r\032\030\022\004\022\0020\017\022\004\022\0020\0010\016¢\006\002\b\020¢\006\002\b\021H\007¢\006\004\b\022\020\023¨\006\024"}, d2 = {"JunieStepCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "outerPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "innerPadding", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "backgroundShape", "Landroidx/compose/ui/graphics/Shape;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "JunieStepCard-hYmLsZ8", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/PaddingValues;JLandroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ej-ui"})
@SourceDebugExtension({"SMAP\nJunieStepCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieStepCard.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieStepCardKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,38:1\n149#2:39\n149#2:40\n149#2:41\n149#2:42\n86#3:43\n84#3,5:44\n89#3:77\n93#3:81\n79#4,6:49\n86#4,4:64\n90#4,2:74\n94#4:80\n368#5,9:55\n377#5:76\n378#5,2:78\n4034#6,6:68\n*S KotlinDebug\n*F\n+ 1 JunieStepCard.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieStepCardKt\n*L\n20#1:39\n21#1:40\n23#1:41\n24#1:42\n27#1:43\n27#1:44,5\n27#1:77\n27#1:81\n27#1:49,6\n27#1:64,4\n27#1:74,2\n27#1:80\n27#1:55,9\n27#1:76\n27#1:78,2\n27#1:68,6\n*E\n"})
public final class JunieStepCardKt {
  @Composable
  @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
  public static final void JunieStepCard-hYmLsZ8(@Nullable Modifier modifier, @Nullable PaddingValues outerPadding, @Nullable PaddingValues innerPadding, long backgroundColor, @Nullable Shape backgroundShape, @Nullable Arrangement.Vertical verticalArrangement, @NotNull Function3 content, @Nullable Composer $composer, int $changed, int paramInt1) {
    // Byte code:
    //   0: aload #7
    //   2: ldc 'content'
    //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   7: aload #8
    //   9: ldc -342276912
    //   11: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   16: astore #8
    //   18: iload #9
    //   20: istore #11
    //   22: iload #10
    //   24: iconst_1
    //   25: iand
    //   26: ifeq -> 39
    //   29: iload #11
    //   31: bipush #6
    //   33: ior
    //   34: istore #11
    //   36: goto -> 68
    //   39: iload #9
    //   41: bipush #6
    //   43: iand
    //   44: ifne -> 68
    //   47: iload #11
    //   49: aload #8
    //   51: aload_0
    //   52: invokeinterface changed : (Ljava/lang/Object;)Z
    //   57: ifeq -> 64
    //   60: iconst_4
    //   61: goto -> 65
    //   64: iconst_2
    //   65: ior
    //   66: istore #11
    //   68: iload #10
    //   70: iconst_2
    //   71: iand
    //   72: ifeq -> 85
    //   75: iload #11
    //   77: bipush #48
    //   79: ior
    //   80: istore #11
    //   82: goto -> 116
    //   85: iload #9
    //   87: bipush #48
    //   89: iand
    //   90: ifne -> 116
    //   93: iload #11
    //   95: aload #8
    //   97: aload_1
    //   98: invokeinterface changed : (Ljava/lang/Object;)Z
    //   103: ifeq -> 111
    //   106: bipush #32
    //   108: goto -> 113
    //   111: bipush #16
    //   113: ior
    //   114: istore #11
    //   116: iload #10
    //   118: iconst_4
    //   119: iand
    //   120: ifeq -> 134
    //   123: iload #11
    //   125: sipush #384
    //   128: ior
    //   129: istore #11
    //   131: goto -> 168
    //   134: iload #9
    //   136: sipush #384
    //   139: iand
    //   140: ifne -> 168
    //   143: iload #11
    //   145: aload #8
    //   147: aload_2
    //   148: invokeinterface changed : (Ljava/lang/Object;)Z
    //   153: ifeq -> 162
    //   156: sipush #256
    //   159: goto -> 165
    //   162: sipush #128
    //   165: ior
    //   166: istore #11
    //   168: iload #9
    //   170: sipush #3072
    //   173: iand
    //   174: ifne -> 210
    //   177: iload #11
    //   179: iload #10
    //   181: bipush #8
    //   183: iand
    //   184: ifne -> 204
    //   187: aload #8
    //   189: lload_3
    //   190: invokeinterface changed : (J)Z
    //   195: ifeq -> 204
    //   198: sipush #2048
    //   201: goto -> 207
    //   204: sipush #1024
    //   207: ior
    //   208: istore #11
    //   210: iload #9
    //   212: sipush #24576
    //   215: iand
    //   216: ifne -> 253
    //   219: iload #11
    //   221: iload #10
    //   223: bipush #16
    //   225: iand
    //   226: ifne -> 247
    //   229: aload #8
    //   231: aload #5
    //   233: invokeinterface changed : (Ljava/lang/Object;)Z
    //   238: ifeq -> 247
    //   241: sipush #16384
    //   244: goto -> 250
    //   247: sipush #8192
    //   250: ior
    //   251: istore #11
    //   253: iload #10
    //   255: bipush #32
    //   257: iand
    //   258: ifeq -> 271
    //   261: iload #11
    //   263: ldc 196608
    //   265: ior
    //   266: istore #11
    //   268: goto -> 303
    //   271: iload #9
    //   273: ldc 196608
    //   275: iand
    //   276: ifne -> 303
    //   279: iload #11
    //   281: aload #8
    //   283: aload #6
    //   285: invokeinterface changed : (Ljava/lang/Object;)Z
    //   290: ifeq -> 298
    //   293: ldc 131072
    //   295: goto -> 300
    //   298: ldc 65536
    //   300: ior
    //   301: istore #11
    //   303: iload #10
    //   305: bipush #64
    //   307: iand
    //   308: ifeq -> 321
    //   311: iload #11
    //   313: ldc 1572864
    //   315: ior
    //   316: istore #11
    //   318: goto -> 353
    //   321: iload #9
    //   323: ldc 1572864
    //   325: iand
    //   326: ifne -> 353
    //   329: iload #11
    //   331: aload #8
    //   333: aload #7
    //   335: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   340: ifeq -> 348
    //   343: ldc 1048576
    //   345: goto -> 350
    //   348: ldc 524288
    //   350: ior
    //   351: istore #11
    //   353: iload #11
    //   355: ldc 599187
    //   357: iand
    //   358: ldc 599186
    //   360: if_icmpne -> 373
    //   363: aload #8
    //   365: invokeinterface getSkipping : ()Z
    //   370: ifne -> 1063
    //   373: aload #8
    //   375: invokeinterface startDefaults : ()V
    //   380: iload #9
    //   382: iconst_1
    //   383: iand
    //   384: ifeq -> 397
    //   387: aload #8
    //   389: invokeinterface getDefaultsInvalid : ()Z
    //   394: ifeq -> 556
    //   397: iload #10
    //   399: iconst_1
    //   400: iand
    //   401: ifeq -> 411
    //   404: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   407: checkcast androidx/compose/ui/Modifier
    //   410: astore_0
    //   411: iload #10
    //   413: iconst_2
    //   414: iand
    //   415: ifeq -> 435
    //   418: bipush #8
    //   420: istore #12
    //   422: iconst_0
    //   423: istore #13
    //   425: iload #12
    //   427: i2f
    //   428: invokestatic constructor-impl : (F)F
    //   431: invokestatic PaddingValues-0680j_4 : (F)Landroidx/compose/foundation/layout/PaddingValues;
    //   434: astore_1
    //   435: iload #10
    //   437: iconst_4
    //   438: iand
    //   439: ifeq -> 459
    //   442: bipush #16
    //   444: istore #12
    //   446: iconst_0
    //   447: istore #13
    //   449: iload #12
    //   451: i2f
    //   452: invokestatic constructor-impl : (F)F
    //   455: invokestatic PaddingValues-0680j_4 : (F)Landroidx/compose/foundation/layout/PaddingValues;
    //   458: astore_2
    //   459: iload #10
    //   461: bipush #8
    //   463: iand
    //   464: ifeq -> 485
    //   467: aload #8
    //   469: iconst_0
    //   470: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
    //   473: invokevirtual getPromptAreaBackgroundColor-0d7_KjU : ()J
    //   476: lstore_3
    //   477: iload #11
    //   479: sipush #-7169
    //   482: iand
    //   483: istore #11
    //   485: iload #10
    //   487: bipush #16
    //   489: iand
    //   490: ifeq -> 521
    //   493: bipush #6
    //   495: istore #12
    //   497: iconst_0
    //   498: istore #13
    //   500: iload #12
    //   502: i2f
    //   503: invokestatic constructor-impl : (F)F
    //   506: invokestatic RoundedCornerShape-0680j_4 : (F)Landroidx/compose/foundation/shape/RoundedCornerShape;
    //   509: checkcast androidx/compose/ui/graphics/Shape
    //   512: astore #5
    //   514: iload #11
    //   516: ldc -57345
    //   518: iand
    //   519: istore #11
    //   521: iload #10
    //   523: bipush #32
    //   525: iand
    //   526: ifeq -> 594
    //   529: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
    //   532: bipush #12
    //   534: istore #12
    //   536: iconst_0
    //   537: istore #13
    //   539: iload #12
    //   541: i2f
    //   542: invokestatic constructor-impl : (F)F
    //   545: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    //   548: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
    //   551: astore #6
    //   553: goto -> 594
    //   556: aload #8
    //   558: invokeinterface skipToGroupEnd : ()V
    //   563: iload #10
    //   565: bipush #8
    //   567: iand
    //   568: ifeq -> 579
    //   571: iload #11
    //   573: sipush #-7169
    //   576: iand
    //   577: istore #11
    //   579: iload #10
    //   581: bipush #16
    //   583: iand
    //   584: ifeq -> 594
    //   587: iload #11
    //   589: ldc -57345
    //   591: iand
    //   592: istore #11
    //   594: aload #8
    //   596: invokeinterface endDefaults : ()V
    //   601: invokestatic isTraceInProgress : ()Z
    //   604: ifeq -> 617
    //   607: ldc -342276912
    //   609: iload #11
    //   611: iconst_m1
    //   612: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieStepCard (JunieStepCard.kt:25)'
    //   614: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   617: aload_0
    //   618: aload_1
    //   619: invokestatic padding : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;
    //   622: lload_3
    //   623: aload #5
    //   625: invokestatic background-bw27NRU : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
    //   628: aload_2
    //   629: invokestatic padding : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;
    //   632: astore #12
    //   634: aload #6
    //   636: astore #13
    //   638: bipush #112
    //   640: iload #11
    //   642: bipush #12
    //   644: ishr
    //   645: iand
    //   646: sipush #7168
    //   649: iload #11
    //   651: bipush #9
    //   653: ishr
    //   654: iand
    //   655: ior
    //   656: istore #15
    //   658: nop
    //   659: iconst_0
    //   660: istore #16
    //   662: aload #8
    //   664: ldc -483455358
    //   666: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
    //   668: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   671: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   674: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
    //   677: astore #14
    //   679: aload #13
    //   681: aload #14
    //   683: aload #8
    //   685: bipush #14
    //   687: iload #15
    //   689: iconst_3
    //   690: ishr
    //   691: iand
    //   692: bipush #112
    //   694: iload #15
    //   696: iconst_3
    //   697: ishr
    //   698: iand
    //   699: ior
    //   700: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    //   703: astore #17
    //   705: bipush #112
    //   707: iload #15
    //   709: iconst_3
    //   710: ishl
    //   711: iand
    //   712: istore #18
    //   714: nop
    //   715: iconst_0
    //   716: istore #19
    //   718: aload #8
    //   720: ldc -1323940314
    //   722: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   724: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   727: aload #8
    //   729: iconst_0
    //   730: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   733: istore #20
    //   735: aload #8
    //   737: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   742: astore #21
    //   744: aload #8
    //   746: aload #12
    //   748: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   751: astore #22
    //   753: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   756: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   759: astore #23
    //   761: bipush #6
    //   763: sipush #896
    //   766: iload #18
    //   768: bipush #6
    //   770: ishl
    //   771: iand
    //   772: ior
    //   773: istore #24
    //   775: nop
    //   776: iconst_0
    //   777: istore #25
    //   779: aload #8
    //   781: ldc -692256719
    //   783: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   785: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   788: aload #8
    //   790: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   795: instanceof androidx/compose/runtime/Applier
    //   798: ifne -> 804
    //   801: invokestatic invalidApplier : ()V
    //   804: aload #8
    //   806: invokeinterface startReusableNode : ()V
    //   811: aload #8
    //   813: invokeinterface getInserting : ()Z
    //   818: ifeq -> 833
    //   821: aload #8
    //   823: aload #23
    //   825: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   830: goto -> 840
    //   833: aload #8
    //   835: invokeinterface useNode : ()V
    //   840: aload #8
    //   842: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   845: astore #26
    //   847: iconst_0
    //   848: istore #27
    //   850: aload #26
    //   852: aload #17
    //   854: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   857: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   860: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   863: aload #26
    //   865: aload #21
    //   867: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   870: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   873: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   876: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   879: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   882: astore #28
    //   884: iconst_0
    //   885: istore #29
    //   887: aload #26
    //   889: astore #30
    //   891: iconst_0
    //   892: istore #31
    //   894: aload #30
    //   896: invokeinterface getInserting : ()Z
    //   901: ifne -> 922
    //   904: aload #30
    //   906: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   911: iload #20
    //   913: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   916: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   919: ifne -> 948
    //   922: aload #30
    //   924: iload #20
    //   926: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   929: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   934: aload #26
    //   936: iload #20
    //   938: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   941: aload #28
    //   943: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   948: nop
    //   949: nop
    //   950: nop
    //   951: aload #26
    //   953: aload #22
    //   955: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   958: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   961: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   964: nop
    //   965: nop
    //   966: aload #8
    //   968: bipush #14
    //   970: iload #24
    //   972: bipush #6
    //   974: ishr
    //   975: iand
    //   976: istore #32
    //   978: astore #33
    //   980: iconst_0
    //   981: istore #34
    //   983: aload #33
    //   985: ldc_w -384784025
    //   988: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
    //   991: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   994: aload #7
    //   996: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
    //   999: aload #33
    //   1001: bipush #6
    //   1003: bipush #112
    //   1005: iload #15
    //   1007: bipush #6
    //   1009: ishr
    //   1010: iand
    //   1011: ior
    //   1012: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1015: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1020: pop
    //   1021: aload #33
    //   1023: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1026: aload #8
    //   1028: invokeinterface endNode : ()V
    //   1033: aload #8
    //   1035: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1038: nop
    //   1039: aload #8
    //   1041: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1044: nop
    //   1045: aload #8
    //   1047: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1050: nop
    //   1051: invokestatic isTraceInProgress : ()Z
    //   1054: ifeq -> 1070
    //   1057: invokestatic traceEventEnd : ()V
    //   1060: goto -> 1070
    //   1063: aload #8
    //   1065: invokeinterface skipToGroupEnd : ()V
    //   1070: aload #8
    //   1072: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   1077: dup
    //   1078: ifnull -> 1108
    //   1081: aload_0
    //   1082: aload_1
    //   1083: aload_2
    //   1084: lload_3
    //   1085: aload #5
    //   1087: aload #6
    //   1089: aload #7
    //   1091: iload #9
    //   1093: iload #10
    //   1095: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/PaddingValues;JLandroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlin/jvm/functions/Function3;II)Lkotlin/jvm/functions/Function2;
    //   1100: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   1105: goto -> 1109
    //   1108: pop
    //   1109: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #26	-> 7
    //   #19	-> 404
    //   #20	-> 418
    //   #39	-> 425
    //   #20	-> 431
    //   #21	-> 442
    //   #40	-> 449
    //   #21	-> 455
    //   #22	-> 467
    //   #23	-> 493
    //   #41	-> 500
    //   #23	-> 506
    //   #24	-> 529
    //   #42	-> 539
    //   #24	-> 545
    //   #26	-> 614
    //   #28	-> 617
    //   #29	-> 618
    //   #31	-> 622
    //   #32	-> 623
    //   #30	-> 625
    //   #34	-> 628
    //   #35	-> 634
    //   #27	-> 658
    //   #43	-> 668
    //   #44	-> 671
    //   #47	-> 679
    //   #48	-> 714
    //   #49	-> 724
    //   #50	-> 730
    //   #51	-> 737
    //   #52	-> 746
    //   #54	-> 753
    //   #53	-> 775
    //   #55	-> 785
    //   #56	-> 788
    //   #57	-> 806
    //   #58	-> 811
    //   #59	-> 823
    //   #61	-> 835
    //   #63	-> 840
    //   #64	-> 850
    //   #65	-> 863
    //   #67	-> 876
    //   #68	-> 887
    //   #69	-> 894
    //   #70	-> 922
    //   #71	-> 934
    //   #73	-> 948
    //   #68	-> 949
    //   #73	-> 950
    //   #74	-> 951
    //   #75	-> 964
    //   #63	-> 965
    //   #76	-> 966
    //   #77	-> 991
    //   #76	-> 1026
    //   #78	-> 1028
    //   #55	-> 1035
    //   #79	-> 1038
    //   #49	-> 1041
    //   #80	-> 1044
    //   #43	-> 1047
    //   #81	-> 1050
    //   #38	-> 1063
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   425	6	13	$i$f$getDp	I
    //   422	9	12	$this$dp$iv	I
    //   449	6	13	$i$f$getDp	I
    //   446	9	12	$this$dp$iv	I
    //   500	6	13	$i$f$getDp	I
    //   497	9	12	$this$dp$iv	I
    //   539	6	13	$i$f$getDp	I
    //   536	9	12	$this$dp$iv	I
    //   983	43	34	$i$a$-Layout-ColumnKt$Column$1$iv	I
    //   980	46	33	$composer$iv	Landroidx/compose/runtime/Composer;
    //   980	46	32	$changed$iv	I
    //   894	55	31	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   891	58	30	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   887	64	29	$i$f$set-impl	I
    //   884	67	28	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   850	115	27	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   847	118	26	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   779	260	25	$i$f$ReusableComposeNode	I
    //   776	263	23	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   776	263	24	$changed$iv$iv$iv	I
    //   718	327	19	$i$f$Layout	I
    //   735	310	20	compositeKeyHash$iv$iv	I
    //   744	301	21	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   753	292	22	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   715	330	18	$changed$iv$iv	I
    //   662	389	16	$i$f$Column	I
    //   705	346	17	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   659	392	12	modifier$iv	Landroidx/compose/ui/Modifier;
    //   659	392	13	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
    //   679	372	14	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
    //   659	392	15	$changed$iv	I
    //   22	1088	11	$dirty	I
    //   0	1110	0	modifier	Landroidx/compose/ui/Modifier;
    //   0	1110	1	outerPadding	Landroidx/compose/foundation/layout/PaddingValues;
    //   0	1110	2	innerPadding	Landroidx/compose/foundation/layout/PaddingValues;
    //   0	1110	3	backgroundColor	J
    //   0	1110	5	backgroundShape	Landroidx/compose/ui/graphics/Shape;
    //   0	1110	6	verticalArrangement	Landroidx/compose/foundation/layout/Arrangement$Vertical;
    //   0	1110	7	content	Lkotlin/jvm/functions/Function3;
    //   0	1110	8	$composer	Landroidx/compose/runtime/Composer;
    //   0	1110	9	$changed	I
  }
  
  private static final Unit JunieStepCard_hYmLsZ8$lambda$0(Modifier $modifier, PaddingValues $outerPadding, PaddingValues $innerPadding, long $backgroundColor, Shape $backgroundShape, Arrangement.Vertical $verticalArrangement, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
    JunieStepCard-hYmLsZ8($modifier, $outerPadding, $innerPadding, $backgroundColor, $backgroundShape, $verticalArrangement, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
    return Unit.INSTANCE;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\JunieStepCardKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */