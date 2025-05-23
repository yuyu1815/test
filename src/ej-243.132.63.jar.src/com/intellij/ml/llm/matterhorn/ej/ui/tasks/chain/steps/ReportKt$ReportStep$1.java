package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskStep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
@SourceDebugExtension({"SMAP\nReport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Report.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$ReportStep$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,185:1\n149#2:186\n149#2:228\n149#2:229\n149#2:275\n149#2:276\n99#3:187\n95#3,7:188\n102#3:223\n106#3:227\n99#3,3:277\n102#3:308\n106#3:353\n79#4,6:195\n86#4,4:210\n90#4,2:220\n94#4:226\n79#4,6:236\n86#4,4:251\n90#4,2:261\n94#4:273\n79#4,6:280\n86#4,4:295\n90#4,2:305\n79#4,6:317\n86#4,4:332\n90#4,2:342\n94#4:348\n94#4:352\n368#5,9:201\n377#5:222\n378#5,2:224\n368#5,9:242\n377#5:263\n378#5,2:271\n368#5,9:286\n377#5:307\n368#5,9:323\n377#5:344\n378#5,2:346\n378#5,2:350\n4034#6,6:214\n4034#6,6:255\n4034#6,6:299\n4034#6,6:336\n86#7:230\n84#7,5:231\n89#7:264\n93#7:274\n1225#8,6:265\n71#9:309\n67#9,7:310\n74#9:345\n78#9:349\n*S KotlinDebug\n*F\n+ 1 Report.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$ReportStep$1\n*L\n48#1:186\n59#1:228\n60#1:229\n78#1:275\n80#1:276\n46#1:187\n46#1:188,7\n46#1:223\n46#1:227\n77#1:277,3\n77#1:308\n77#1:353\n46#1:195,6\n46#1:210,4\n46#1:220,2\n46#1:226\n58#1:236,6\n58#1:251,4\n58#1:261,2\n58#1:273\n77#1:280,6\n77#1:295,4\n77#1:305,2\n86#1:317,6\n86#1:332,4\n86#1:342,2\n86#1:348\n77#1:352\n46#1:201,9\n46#1:222\n46#1:224,2\n58#1:242,9\n58#1:263\n58#1:271,2\n77#1:286,9\n77#1:307\n86#1:323,9\n86#1:344\n86#1:346,2\n77#1:350,2\n46#1:214,6\n58#1:255,6\n77#1:299,6\n86#1:336,6\n58#1:230\n58#1:231,5\n58#1:264\n58#1:274\n65#1:265,6\n86#1:309\n86#1:310,7\n86#1:345\n86#1:349\n*E\n"})
final class ReportKt$ReportStep$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
  @Composable
  @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
  public final void invoke(ColumnScope $this$JunieStepCard, Composer $composer, int $changed) {
    // Byte code:
    //   0: aload_1
    //   1: ldc '$this$JunieStepCard'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: iload_3
    //   7: bipush #17
    //   9: iand
    //   10: bipush #16
    //   12: if_icmpne -> 24
    //   15: aload_2
    //   16: invokeinterface getSkipping : ()Z
    //   21: ifne -> 2171
    //   24: invokestatic isTraceInProgress : ()Z
    //   27: ifeq -> 39
    //   30: ldc 421919381
    //   32: iload_3
    //   33: iconst_m1
    //   34: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ReportStep.<anonymous> (Report.kt:45)'
    //   36: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   39: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   42: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
    //   45: astore #4
    //   47: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
    //   50: bipush #8
    //   52: istore #6
    //   54: iconst_0
    //   55: istore #7
    //   57: iload #6
    //   59: i2f
    //   60: invokestatic constructor-impl : (F)F
    //   63: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    //   66: astore #5
    //   68: aload_0
    //   69: getfield $report : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Report;
    //   72: astore #7
    //   74: sipush #432
    //   77: istore #8
    //   79: iconst_0
    //   80: istore #9
    //   82: aload_2
    //   83: ldc 693286680
    //   85: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
    //   87: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   90: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   93: checkcast androidx/compose/ui/Modifier
    //   96: astore #6
    //   98: aload #5
    //   100: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
    //   103: aload #4
    //   105: aload_2
    //   106: bipush #14
    //   108: iload #8
    //   110: iconst_3
    //   111: ishr
    //   112: iand
    //   113: bipush #112
    //   115: iload #8
    //   117: iconst_3
    //   118: ishr
    //   119: iand
    //   120: ior
    //   121: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    //   124: astore #10
    //   126: bipush #112
    //   128: iload #8
    //   130: iconst_3
    //   131: ishl
    //   132: iand
    //   133: istore #11
    //   135: nop
    //   136: iconst_0
    //   137: istore #12
    //   139: aload_2
    //   140: ldc -1323940314
    //   142: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   144: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   147: aload_2
    //   148: iconst_0
    //   149: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   152: istore #13
    //   154: aload_2
    //   155: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   160: astore #14
    //   162: aload_2
    //   163: aload #6
    //   165: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   168: astore #15
    //   170: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   173: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   176: astore #16
    //   178: bipush #6
    //   180: sipush #896
    //   183: iload #11
    //   185: bipush #6
    //   187: ishl
    //   188: iand
    //   189: ior
    //   190: istore #17
    //   192: nop
    //   193: iconst_0
    //   194: istore #18
    //   196: aload_2
    //   197: ldc -692256719
    //   199: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   201: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   204: aload_2
    //   205: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   210: instanceof androidx/compose/runtime/Applier
    //   213: ifne -> 219
    //   216: invokestatic invalidApplier : ()V
    //   219: aload_2
    //   220: invokeinterface startReusableNode : ()V
    //   225: aload_2
    //   226: invokeinterface getInserting : ()Z
    //   231: ifeq -> 245
    //   234: aload_2
    //   235: aload #16
    //   237: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   242: goto -> 251
    //   245: aload_2
    //   246: invokeinterface useNode : ()V
    //   251: aload_2
    //   252: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   255: astore #19
    //   257: iconst_0
    //   258: istore #20
    //   260: aload #19
    //   262: aload #10
    //   264: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   267: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   270: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   273: aload #19
    //   275: aload #14
    //   277: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   280: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   283: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   286: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   289: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   292: astore #21
    //   294: iconst_0
    //   295: istore #22
    //   297: aload #19
    //   299: astore #23
    //   301: iconst_0
    //   302: istore #24
    //   304: aload #23
    //   306: invokeinterface getInserting : ()Z
    //   311: ifne -> 332
    //   314: aload #23
    //   316: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   321: iload #13
    //   323: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   326: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   329: ifne -> 358
    //   332: aload #23
    //   334: iload #13
    //   336: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   339: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   344: aload #19
    //   346: iload #13
    //   348: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   351: aload #21
    //   353: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   358: nop
    //   359: nop
    //   360: nop
    //   361: aload #19
    //   363: aload #15
    //   365: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   368: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   371: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   374: nop
    //   375: nop
    //   376: aload_2
    //   377: bipush #14
    //   379: iload #17
    //   381: bipush #6
    //   383: ishr
    //   384: iand
    //   385: istore #25
    //   387: astore #26
    //   389: iconst_0
    //   390: istore #27
    //   392: aload #26
    //   394: ldc -407840262
    //   396: ldc 'C101@5126L9:Row.kt#2w3rfo'
    //   398: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   401: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
    //   404: aload #26
    //   406: bipush #6
    //   408: bipush #112
    //   410: iload #8
    //   412: bipush #6
    //   414: ishr
    //   415: iand
    //   416: ior
    //   417: istore #28
    //   419: astore #29
    //   421: checkcast androidx/compose/foundation/layout/RowScope
    //   424: astore #30
    //   426: iconst_0
    //   427: istore #31
    //   429: aload #29
    //   431: iconst_0
    //   432: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
    //   435: invokevirtual getDoneStateIcon : ()Lorg/jetbrains/jewel/ui/icon/PathIconKey;
    //   438: checkcast org/jetbrains/jewel/ui/icon/IconKey
    //   441: ldc 'Report Done'
    //   443: aconst_null
    //   444: aconst_null
    //   445: lconst_0
    //   446: iconst_0
    //   447: anewarray org/jetbrains/jewel/ui/painter/PainterHint
    //   450: aload #29
    //   452: bipush #48
    //   454: getstatic org/jetbrains/jewel/ui/icon/PathIconKey.$stable : I
    //   457: ior
    //   458: bipush #28
    //   460: invokestatic Icon-FHprtrg : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V
    //   463: aload #7
    //   465: invokevirtual getName : ()Ljava/lang/String;
    //   468: aconst_null
    //   469: lconst_0
    //   470: bipush #16
    //   472: invokestatic getSp : (I)J
    //   475: aconst_null
    //   476: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
    //   479: invokevirtual getBold : ()Landroidx/compose/ui/text/font/FontWeight;
    //   482: aconst_null
    //   483: lconst_0
    //   484: aconst_null
    //   485: iconst_0
    //   486: lconst_0
    //   487: iconst_0
    //   488: iconst_0
    //   489: iconst_0
    //   490: aconst_null
    //   491: aconst_null
    //   492: aload #29
    //   494: ldc_w 199680
    //   497: iconst_0
    //   498: ldc_w 65494
    //   501: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
    //   504: nop
    //   505: aload #26
    //   507: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   510: aload_2
    //   511: invokeinterface endNode : ()V
    //   516: aload_2
    //   517: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   520: nop
    //   521: aload_2
    //   522: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   525: nop
    //   526: aload_2
    //   527: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   530: nop
    //   531: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   534: checkcast androidx/compose/ui/Modifier
    //   537: fconst_0
    //   538: fconst_0
    //   539: fconst_0
    //   540: iconst_4
    //   541: istore #4
    //   543: iconst_0
    //   544: istore #5
    //   546: iload #4
    //   548: i2f
    //   549: invokestatic constructor-impl : (F)F
    //   552: bipush #7
    //   554: aconst_null
    //   555: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   558: astore #4
    //   560: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
    //   563: bipush #8
    //   565: istore #5
    //   567: iconst_0
    //   568: istore #6
    //   570: iload #5
    //   572: i2f
    //   573: invokestatic constructor-impl : (F)F
    //   576: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    //   579: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
    //   582: astore #5
    //   584: aload_0
    //   585: getfield $report : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Report;
    //   588: astore #7
    //   590: aload_0
    //   591: getfield $isProjectOnVCS : Z
    //   594: istore #8
    //   596: bipush #54
    //   598: istore #9
    //   600: iconst_0
    //   601: istore #10
    //   603: aload_2
    //   604: ldc_w -483455358
    //   607: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
    //   610: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   613: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   616: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
    //   619: astore #6
    //   621: aload #5
    //   623: aload #6
    //   625: aload_2
    //   626: bipush #14
    //   628: iload #9
    //   630: iconst_3
    //   631: ishr
    //   632: iand
    //   633: bipush #112
    //   635: iload #9
    //   637: iconst_3
    //   638: ishr
    //   639: iand
    //   640: ior
    //   641: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    //   644: astore #11
    //   646: bipush #112
    //   648: iload #9
    //   650: iconst_3
    //   651: ishl
    //   652: iand
    //   653: istore #12
    //   655: nop
    //   656: iconst_0
    //   657: istore #13
    //   659: aload_2
    //   660: ldc -1323940314
    //   662: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   664: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   667: aload_2
    //   668: iconst_0
    //   669: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   672: istore #14
    //   674: aload_2
    //   675: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   680: astore #15
    //   682: aload_2
    //   683: aload #4
    //   685: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   688: astore #16
    //   690: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   693: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   696: astore #17
    //   698: bipush #6
    //   700: sipush #896
    //   703: iload #12
    //   705: bipush #6
    //   707: ishl
    //   708: iand
    //   709: ior
    //   710: istore #18
    //   712: nop
    //   713: iconst_0
    //   714: istore #19
    //   716: aload_2
    //   717: ldc -692256719
    //   719: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   721: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   724: aload_2
    //   725: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   730: instanceof androidx/compose/runtime/Applier
    //   733: ifne -> 739
    //   736: invokestatic invalidApplier : ()V
    //   739: aload_2
    //   740: invokeinterface startReusableNode : ()V
    //   745: aload_2
    //   746: invokeinterface getInserting : ()Z
    //   751: ifeq -> 765
    //   754: aload_2
    //   755: aload #17
    //   757: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   762: goto -> 771
    //   765: aload_2
    //   766: invokeinterface useNode : ()V
    //   771: aload_2
    //   772: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   775: astore #20
    //   777: iconst_0
    //   778: istore #21
    //   780: aload #20
    //   782: aload #11
    //   784: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   787: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   790: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   793: aload #20
    //   795: aload #15
    //   797: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   800: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   803: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   806: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   809: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   812: astore #22
    //   814: iconst_0
    //   815: istore #23
    //   817: aload #20
    //   819: astore #24
    //   821: iconst_0
    //   822: istore #25
    //   824: aload #24
    //   826: invokeinterface getInserting : ()Z
    //   831: ifne -> 852
    //   834: aload #24
    //   836: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   841: iload #14
    //   843: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   846: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   849: ifne -> 878
    //   852: aload #24
    //   854: iload #14
    //   856: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   859: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   864: aload #20
    //   866: iload #14
    //   868: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   871: aload #22
    //   873: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   878: nop
    //   879: nop
    //   880: nop
    //   881: aload #20
    //   883: aload #16
    //   885: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   888: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   891: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   894: nop
    //   895: nop
    //   896: aload_2
    //   897: bipush #14
    //   899: iload #18
    //   901: bipush #6
    //   903: ishr
    //   904: iand
    //   905: istore #26
    //   907: astore #27
    //   909: iconst_0
    //   910: istore #28
    //   912: aload #27
    //   914: ldc_w -384784025
    //   917: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
    //   920: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   923: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
    //   926: aload #27
    //   928: bipush #6
    //   930: bipush #112
    //   932: iload #9
    //   934: bipush #6
    //   936: ishr
    //   937: iand
    //   938: ior
    //   939: istore #29
    //   941: astore #30
    //   943: checkcast androidx/compose/foundation/layout/ColumnScope
    //   946: astore #31
    //   948: iconst_0
    //   949: istore #32
    //   951: aload #30
    //   953: ldc_w -341145164
    //   956: invokeinterface startReplaceGroup : (I)V
    //   961: aload #7
    //   963: invokevirtual getChanges : ()Ljava/util/List;
    //   966: checkcast java/util/Collection
    //   969: invokeinterface isEmpty : ()Z
    //   974: ifne -> 981
    //   977: iconst_1
    //   978: goto -> 982
    //   981: iconst_0
    //   982: ifeq -> 1124
    //   985: aload #7
    //   987: invokevirtual getChanges : ()Ljava/util/List;
    //   990: iconst_1
    //   991: iload #8
    //   993: aload #30
    //   995: ldc_w -341141416
    //   998: invokeinterface startReplaceGroup : (I)V
    //   1003: aload #30
    //   1005: astore #33
    //   1007: aload #30
    //   1009: aload #7
    //   1011: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   1016: istore #34
    //   1018: nop
    //   1019: iconst_0
    //   1020: istore #35
    //   1022: aload #33
    //   1024: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   1029: astore #36
    //   1031: iconst_0
    //   1032: istore #37
    //   1034: iload #34
    //   1036: ifne -> 1050
    //   1039: aload #36
    //   1041: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
    //   1044: invokevirtual getEmpty : ()Ljava/lang/Object;
    //   1047: if_acmpne -> 1098
    //   1050: istore #38
    //   1052: istore #39
    //   1054: astore #40
    //   1056: iconst_0
    //   1057: istore #41
    //   1059: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$ReportStep$1$2$1$1
    //   1062: dup
    //   1063: aload #7
    //   1065: aconst_null
    //   1066: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Report;Lkotlin/coroutines/Continuation;)V
    //   1069: checkcast kotlin/jvm/functions/Function1
    //   1072: astore #42
    //   1074: aload #40
    //   1076: iload #39
    //   1078: iload #38
    //   1080: aload #42
    //   1082: astore #43
    //   1084: aload #33
    //   1086: aload #43
    //   1088: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   1093: aload #43
    //   1095: goto -> 1100
    //   1098: aload #36
    //   1100: nop
    //   1101: nop
    //   1102: nop
    //   1103: checkcast kotlin/jvm/functions/Function1
    //   1106: astore #44
    //   1108: aload #30
    //   1110: invokeinterface endReplaceGroup : ()V
    //   1115: aload #44
    //   1117: aload #30
    //   1119: bipush #48
    //   1121: invokestatic FileReport : (Ljava/util/List;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    //   1124: aload #30
    //   1126: invokeinterface endReplaceGroup : ()V
    //   1131: aload #7
    //   1133: invokevirtual getDescription : ()Ljava/lang/String;
    //   1136: aload #30
    //   1138: iconst_0
    //   1139: invokestatic TextContainer : (Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    //   1142: nop
    //   1143: aload #27
    //   1145: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1148: aload_2
    //   1149: invokeinterface endNode : ()V
    //   1154: aload_2
    //   1155: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1158: nop
    //   1159: aload_2
    //   1160: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1163: nop
    //   1164: aload_2
    //   1165: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   1168: nop
    //   1169: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   1172: checkcast androidx/compose/ui/Modifier
    //   1175: fconst_0
    //   1176: fconst_0
    //   1177: fconst_0
    //   1178: iconst_4
    //   1179: istore #5
    //   1181: iconst_0
    //   1182: istore #6
    //   1184: iload #5
    //   1186: i2f
    //   1187: invokestatic constructor-impl : (F)F
    //   1190: bipush #7
    //   1192: aconst_null
    //   1193: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   1196: astore #4
    //   1198: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   1201: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
    //   1204: astore #5
    //   1206: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
    //   1209: bipush #16
    //   1211: istore #7
    //   1213: iconst_0
    //   1214: istore #8
    //   1216: iload #7
    //   1218: i2f
    //   1219: invokestatic constructor-impl : (F)F
    //   1222: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
    //   1225: astore #6
    //   1227: aload_0
    //   1228: getfield $report : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Report;
    //   1231: astore #7
    //   1233: sipush #438
    //   1236: istore #8
    //   1238: iconst_0
    //   1239: istore #9
    //   1241: aload_2
    //   1242: ldc 693286680
    //   1244: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
    //   1246: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1249: aload #6
    //   1251: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
    //   1254: aload #5
    //   1256: aload_2
    //   1257: bipush #14
    //   1259: iload #8
    //   1261: iconst_3
    //   1262: ishr
    //   1263: iand
    //   1264: bipush #112
    //   1266: iload #8
    //   1268: iconst_3
    //   1269: ishr
    //   1270: iand
    //   1271: ior
    //   1272: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    //   1275: astore #10
    //   1277: bipush #112
    //   1279: iload #8
    //   1281: iconst_3
    //   1282: ishl
    //   1283: iand
    //   1284: istore #11
    //   1286: nop
    //   1287: iconst_0
    //   1288: istore #12
    //   1290: aload_2
    //   1291: ldc -1323940314
    //   1293: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   1295: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1298: aload_2
    //   1299: iconst_0
    //   1300: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   1303: istore #13
    //   1305: aload_2
    //   1306: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   1311: astore #14
    //   1313: aload_2
    //   1314: aload #4
    //   1316: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   1319: astore #15
    //   1321: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1324: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   1327: astore #16
    //   1329: bipush #6
    //   1331: sipush #896
    //   1334: iload #11
    //   1336: bipush #6
    //   1338: ishl
    //   1339: iand
    //   1340: ior
    //   1341: istore #17
    //   1343: nop
    //   1344: iconst_0
    //   1345: istore #18
    //   1347: aload_2
    //   1348: ldc -692256719
    //   1350: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   1352: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1355: aload_2
    //   1356: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   1361: instanceof androidx/compose/runtime/Applier
    //   1364: ifne -> 1370
    //   1367: invokestatic invalidApplier : ()V
    //   1370: aload_2
    //   1371: invokeinterface startReusableNode : ()V
    //   1376: aload_2
    //   1377: invokeinterface getInserting : ()Z
    //   1382: ifeq -> 1396
    //   1385: aload_2
    //   1386: aload #16
    //   1388: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   1393: goto -> 1402
    //   1396: aload_2
    //   1397: invokeinterface useNode : ()V
    //   1402: aload_2
    //   1403: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   1406: astore #19
    //   1408: iconst_0
    //   1409: istore #20
    //   1411: aload #19
    //   1413: aload #10
    //   1415: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1418: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   1421: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1424: aload #19
    //   1426: aload #14
    //   1428: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1431: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   1434: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1437: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1440: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   1443: astore #21
    //   1445: iconst_0
    //   1446: istore #22
    //   1448: aload #19
    //   1450: astore #23
    //   1452: iconst_0
    //   1453: istore #24
    //   1455: aload #23
    //   1457: invokeinterface getInserting : ()Z
    //   1462: ifne -> 1483
    //   1465: aload #23
    //   1467: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   1472: iload #13
    //   1474: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1477: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1480: ifne -> 1509
    //   1483: aload #23
    //   1485: iload #13
    //   1487: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1490: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   1495: aload #19
    //   1497: iload #13
    //   1499: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1502: aload #21
    //   1504: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1509: nop
    //   1510: nop
    //   1511: nop
    //   1512: aload #19
    //   1514: aload #15
    //   1516: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1519: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   1522: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1525: nop
    //   1526: nop
    //   1527: aload_2
    //   1528: bipush #14
    //   1530: iload #17
    //   1532: bipush #6
    //   1534: ishr
    //   1535: iand
    //   1536: istore #25
    //   1538: astore #26
    //   1540: iconst_0
    //   1541: istore #27
    //   1543: aload #26
    //   1545: ldc -407840262
    //   1547: ldc 'C101@5126L9:Row.kt#2w3rfo'
    //   1549: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1552: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
    //   1555: aload #26
    //   1557: bipush #6
    //   1559: bipush #112
    //   1561: iload #8
    //   1563: bipush #6
    //   1565: ishr
    //   1566: iand
    //   1567: ior
    //   1568: istore #28
    //   1570: astore #29
    //   1572: checkcast androidx/compose/foundation/layout/RowScope
    //   1575: astore #30
    //   1577: iconst_0
    //   1578: istore #31
    //   1580: aload #7
    //   1582: invokevirtual getStartNewTaskAction : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
    //   1585: astore #32
    //   1587: aload #29
    //   1589: ldc_w -341125382
    //   1592: invokeinterface startReplaceGroup : (I)V
    //   1597: aload #32
    //   1599: dup
    //   1600: ifnonnull -> 1608
    //   1603: pop
    //   1604: aconst_null
    //   1605: goto -> 1656
    //   1608: astore #33
    //   1610: iconst_0
    //   1611: istore #34
    //   1613: aload #33
    //   1615: invokevirtual getName : ()Ljava/lang/String;
    //   1618: astore #35
    //   1620: aload #33
    //   1622: invokevirtual getAction : ()Lkotlin/jvm/functions/Function0;
    //   1625: astore #36
    //   1627: aload #35
    //   1629: aconst_null
    //   1630: iconst_0
    //   1631: aload #36
    //   1633: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ComposableSingletons$ReportKt.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ComposableSingletons$ReportKt;
    //   1636: invokevirtual getLambda-1$ej_ui : ()Lkotlin/jvm/functions/Function3;
    //   1639: aload #29
    //   1641: sipush #24960
    //   1644: iconst_2
    //   1645: invokestatic Button : (Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    //   1648: nop
    //   1649: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   1652: pop
    //   1653: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   1656: pop
    //   1657: aload #29
    //   1659: invokeinterface endReplaceGroup : ()V
    //   1664: aload #7
    //   1666: invokevirtual getRollbackAction : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
    //   1669: astore #32
    //   1671: aload #29
    //   1673: ldc_w -341120708
    //   1676: invokeinterface startReplaceGroup : (I)V
    //   1681: aload #32
    //   1683: dup
    //   1684: ifnonnull -> 1692
    //   1687: pop
    //   1688: aconst_null
    //   1689: goto -> 2124
    //   1692: astore #33
    //   1694: iconst_0
    //   1695: istore #34
    //   1697: iconst_0
    //   1698: istore #35
    //   1700: nop
    //   1701: iconst_0
    //   1702: istore #36
    //   1704: aload #29
    //   1706: ldc_w 733328855
    //   1709: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
    //   1712: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1715: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   1718: checkcast androidx/compose/ui/Modifier
    //   1721: astore #38
    //   1723: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   1726: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
    //   1729: astore #39
    //   1731: iconst_0
    //   1732: istore #40
    //   1734: aload #39
    //   1736: iload #40
    //   1738: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
    //   1741: astore #41
    //   1743: bipush #112
    //   1745: iload #35
    //   1747: iconst_3
    //   1748: ishl
    //   1749: iand
    //   1750: istore #42
    //   1752: nop
    //   1753: iconst_0
    //   1754: istore #43
    //   1756: aload #29
    //   1758: ldc -1323940314
    //   1760: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   1762: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1765: aload #29
    //   1767: iconst_0
    //   1768: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   1771: istore #44
    //   1773: aload #29
    //   1775: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   1780: astore #45
    //   1782: aload #29
    //   1784: aload #38
    //   1786: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   1789: astore #46
    //   1791: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1794: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   1797: astore #47
    //   1799: bipush #6
    //   1801: sipush #896
    //   1804: iload #42
    //   1806: bipush #6
    //   1808: ishl
    //   1809: iand
    //   1810: ior
    //   1811: istore #48
    //   1813: nop
    //   1814: iconst_0
    //   1815: istore #49
    //   1817: aload #29
    //   1819: ldc -692256719
    //   1821: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   1823: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   1826: aload #29
    //   1828: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   1833: instanceof androidx/compose/runtime/Applier
    //   1836: ifne -> 1842
    //   1839: invokestatic invalidApplier : ()V
    //   1842: aload #29
    //   1844: invokeinterface startReusableNode : ()V
    //   1849: aload #29
    //   1851: invokeinterface getInserting : ()Z
    //   1856: ifeq -> 1871
    //   1859: aload #29
    //   1861: aload #47
    //   1863: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   1868: goto -> 1878
    //   1871: aload #29
    //   1873: invokeinterface useNode : ()V
    //   1878: aload #29
    //   1880: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   1883: astore #50
    //   1885: iconst_0
    //   1886: istore #51
    //   1888: aload #50
    //   1890: aload #41
    //   1892: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1895: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   1898: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1901: aload #50
    //   1903: aload #45
    //   1905: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1908: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   1911: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1914: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1917: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   1920: astore #52
    //   1922: iconst_0
    //   1923: istore #53
    //   1925: aload #50
    //   1927: astore #54
    //   1929: iconst_0
    //   1930: istore #55
    //   1932: aload #54
    //   1934: invokeinterface getInserting : ()Z
    //   1939: ifne -> 1960
    //   1942: aload #54
    //   1944: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   1949: iload #44
    //   1951: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1954: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1957: ifne -> 1986
    //   1960: aload #54
    //   1962: iload #44
    //   1964: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1967: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   1972: aload #50
    //   1974: iload #44
    //   1976: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1979: aload #52
    //   1981: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   1986: nop
    //   1987: nop
    //   1988: nop
    //   1989: aload #50
    //   1991: aload #46
    //   1993: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   1996: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   1999: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   2002: nop
    //   2003: nop
    //   2004: aload #29
    //   2006: bipush #14
    //   2008: iload #48
    //   2010: bipush #6
    //   2012: ishr
    //   2013: iand
    //   2014: istore #56
    //   2016: astore #57
    //   2018: iconst_0
    //   2019: istore #58
    //   2021: aload #57
    //   2023: ldc_w -2146769399
    //   2026: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
    //   2029: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   2032: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
    //   2035: aload #57
    //   2037: bipush #6
    //   2039: bipush #112
    //   2041: iload #35
    //   2043: bipush #6
    //   2045: ishr
    //   2046: iand
    //   2047: ior
    //   2048: istore #59
    //   2050: astore #60
    //   2052: checkcast androidx/compose/foundation/layout/BoxScope
    //   2055: astore #61
    //   2057: iconst_0
    //   2058: istore #62
    //   2060: aload #33
    //   2062: invokevirtual getName : ()Ljava/lang/String;
    //   2065: aload #33
    //   2067: invokevirtual getAction : ()Lkotlin/jvm/functions/Function0;
    //   2070: aconst_null
    //   2071: iconst_0
    //   2072: aconst_null
    //   2073: iconst_0
    //   2074: aconst_null
    //   2075: aconst_null
    //   2076: aload #60
    //   2078: iconst_0
    //   2079: sipush #252
    //   2082: invokestatic Link-kye4rC8 : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V
    //   2085: nop
    //   2086: aload #57
    //   2088: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2091: aload #29
    //   2093: invokeinterface endNode : ()V
    //   2098: aload #29
    //   2100: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2103: nop
    //   2104: aload #29
    //   2106: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2109: nop
    //   2110: aload #29
    //   2112: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2115: nop
    //   2116: nop
    //   2117: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   2120: pop
    //   2121: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   2124: pop
    //   2125: aload #29
    //   2127: invokeinterface endReplaceGroup : ()V
    //   2132: nop
    //   2133: aload #26
    //   2135: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2138: aload_2
    //   2139: invokeinterface endNode : ()V
    //   2144: aload_2
    //   2145: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2148: nop
    //   2149: aload_2
    //   2150: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2153: nop
    //   2154: aload_2
    //   2155: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   2158: nop
    //   2159: invokestatic isTraceInProgress : ()Z
    //   2162: ifeq -> 2177
    //   2165: invokestatic traceEventEnd : ()V
    //   2168: goto -> 2177
    //   2171: aload_2
    //   2172: invokeinterface skipToGroupEnd : ()V
    //   2177: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #46	-> 6
    //   #47	-> 39
    //   #48	-> 47
    //   #186	-> 57
    //   #48	-> 63
    //   #46	-> 68
    //   #187	-> 87
    //   #188	-> 90
    //   #193	-> 98
    //   #194	-> 135
    //   #195	-> 144
    //   #196	-> 149
    //   #197	-> 155
    //   #198	-> 163
    //   #200	-> 170
    //   #199	-> 192
    //   #201	-> 201
    //   #202	-> 204
    //   #203	-> 220
    //   #204	-> 225
    //   #205	-> 235
    //   #207	-> 246
    //   #209	-> 251
    //   #210	-> 260
    //   #211	-> 273
    //   #213	-> 286
    //   #214	-> 297
    //   #215	-> 304
    //   #216	-> 332
    //   #217	-> 344
    //   #219	-> 358
    //   #214	-> 359
    //   #219	-> 360
    //   #220	-> 361
    //   #221	-> 374
    //   #209	-> 375
    //   #222	-> 376
    //   #223	-> 398
    //   #50	-> 432
    //   #52	-> 463
    //   #53	-> 470
    //   #54	-> 476
    //   #51	-> 501
    //   #56	-> 504
    //   #223	-> 505
    //   #222	-> 510
    //   #224	-> 511
    //   #201	-> 517
    //   #225	-> 520
    //   #195	-> 522
    //   #226	-> 525
    //   #187	-> 527
    //   #227	-> 530
    //   #59	-> 531
    //   #228	-> 546
    //   #59	-> 552
    //   #60	-> 560
    //   #229	-> 570
    //   #60	-> 576
    //   #58	-> 584
    //   #230	-> 610
    //   #231	-> 613
    //   #234	-> 621
    //   #235	-> 655
    //   #236	-> 664
    //   #237	-> 669
    //   #238	-> 675
    //   #239	-> 683
    //   #241	-> 690
    //   #240	-> 712
    //   #242	-> 721
    //   #243	-> 724
    //   #244	-> 740
    //   #245	-> 745
    //   #246	-> 755
    //   #248	-> 766
    //   #250	-> 771
    //   #251	-> 780
    //   #252	-> 793
    //   #254	-> 806
    //   #255	-> 817
    //   #256	-> 824
    //   #257	-> 852
    //   #258	-> 864
    //   #260	-> 878
    //   #255	-> 879
    //   #260	-> 880
    //   #261	-> 881
    //   #262	-> 894
    //   #250	-> 895
    //   #263	-> 896
    //   #264	-> 920
    //   #62	-> 961
    //   #62	-> 982
    //   #64	-> 985
    //   #71	-> 990
    //   #70	-> 991
    //   #65	-> 1018
    //   #265	-> 1022
    //   #266	-> 1034
    //   #267	-> 1050
    //   #65	-> 1059
    //   #267	-> 1082
    //   #268	-> 1084
    //   #269	-> 1093
    //   #270	-> 1098
    //   #266	-> 1100
    //   #265	-> 1101
    //   #265	-> 1102
    //   #65	-> 1103
    //   #63	-> 1121
    //   #74	-> 1131
    //   #75	-> 1142
    //   #264	-> 1143
    //   #263	-> 1148
    //   #271	-> 1149
    //   #242	-> 1155
    //   #272	-> 1158
    //   #236	-> 1160
    //   #273	-> 1163
    //   #230	-> 1165
    //   #274	-> 1168
    //   #78	-> 1169
    //   #275	-> 1184
    //   #78	-> 1190
    //   #79	-> 1198
    //   #80	-> 1206
    //   #276	-> 1216
    //   #80	-> 1222
    //   #77	-> 1227
    //   #277	-> 1246
    //   #278	-> 1249
    //   #279	-> 1286
    //   #280	-> 1295
    //   #281	-> 1300
    //   #282	-> 1306
    //   #283	-> 1314
    //   #285	-> 1321
    //   #284	-> 1343
    //   #286	-> 1352
    //   #287	-> 1355
    //   #288	-> 1371
    //   #289	-> 1376
    //   #290	-> 1386
    //   #292	-> 1397
    //   #294	-> 1402
    //   #295	-> 1411
    //   #296	-> 1424
    //   #298	-> 1437
    //   #299	-> 1448
    //   #300	-> 1455
    //   #301	-> 1483
    //   #302	-> 1495
    //   #304	-> 1509
    //   #299	-> 1510
    //   #304	-> 1511
    //   #305	-> 1512
    //   #306	-> 1525
    //   #294	-> 1526
    //   #307	-> 1527
    //   #308	-> 1549
    //   #82	-> 1580
    //   #83	-> 1613
    //   #84	-> 1648
    //   #82	-> 1652
    //   #82	-> 1656
    //   #85	-> 1664
    //   #86	-> 1700
    //   #309	-> 1712
    //   #310	-> 1715
    //   #311	-> 1723
    //   #312	-> 1731
    //   #315	-> 1734
    //   #316	-> 1752
    //   #317	-> 1762
    //   #318	-> 1768
    //   #319	-> 1775
    //   #320	-> 1784
    //   #322	-> 1791
    //   #321	-> 1813
    //   #323	-> 1823
    //   #324	-> 1826
    //   #325	-> 1844
    //   #326	-> 1849
    //   #327	-> 1861
    //   #329	-> 1873
    //   #331	-> 1878
    //   #332	-> 1888
    //   #333	-> 1901
    //   #335	-> 1914
    //   #336	-> 1925
    //   #337	-> 1932
    //   #338	-> 1960
    //   #339	-> 1972
    //   #341	-> 1986
    //   #336	-> 1987
    //   #341	-> 1988
    //   #342	-> 1989
    //   #343	-> 2002
    //   #331	-> 2003
    //   #344	-> 2004
    //   #345	-> 2029
    //   #88	-> 2060
    //   #89	-> 2065
    //   #87	-> 2082
    //   #91	-> 2085
    //   #345	-> 2086
    //   #344	-> 2091
    //   #346	-> 2093
    //   #323	-> 2100
    //   #347	-> 2103
    //   #317	-> 2106
    //   #348	-> 2109
    //   #309	-> 2112
    //   #349	-> 2115
    //   #92	-> 2116
    //   #85	-> 2120
    //   #85	-> 2124
    //   #93	-> 2132
    //   #308	-> 2133
    //   #307	-> 2138
    //   #350	-> 2139
    //   #286	-> 2145
    //   #351	-> 2148
    //   #280	-> 2150
    //   #352	-> 2153
    //   #277	-> 2155
    //   #353	-> 2158
    //   #93	-> 2171
    //   #94	-> 2177
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   57	6	7	$i$f$getDp	I
    //   54	9	6	$this$dp$iv	I
    //   429	76	31	$i$a$-Row-ReportKt$ReportStep$1$1	I
    //   426	79	30	$this$invoke_u24lambda_u240	Landroidx/compose/foundation/layout/RowScope;
    //   426	79	29	$composer	Landroidx/compose/runtime/Composer;
    //   426	79	28	$changed	I
    //   392	118	27	$i$a$-Layout-RowKt$Row$1$iv	I
    //   389	121	26	$composer$iv	Landroidx/compose/runtime/Composer;
    //   389	121	25	$changed$iv	I
    //   304	55	24	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   301	58	23	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   297	64	22	$i$f$set-impl	I
    //   294	67	21	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   260	115	20	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   257	118	19	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   196	325	18	$i$f$ReusableComposeNode	I
    //   193	328	16	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   193	328	17	$changed$iv$iv$iv	I
    //   139	387	12	$i$f$Layout	I
    //   154	372	13	compositeKeyHash$iv$iv	I
    //   162	364	14	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   170	356	15	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   136	390	11	$changed$iv$iv	I
    //   82	449	9	$i$f$Row	I
    //   126	405	10	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   98	433	6	modifier$iv	Landroidx/compose/ui/Modifier;
    //   79	452	8	$changed$iv	I
    //   546	6	5	$i$f$getDp	I
    //   543	9	4	$this$dp$iv	I
    //   570	6	6	$i$f$getDp	I
    //   567	9	5	$this$dp$iv	I
    //   1059	13	41	$i$a$-cache-ReportKt$ReportStep$1$2$1	I
    //   1084	11	43	value$iv	Ljava/lang/Object;
    //   1034	67	37	$i$a$-let-ComposerKt$cache$1$iv	I
    //   1031	70	36	it$iv	Ljava/lang/Object;
    //   1022	81	35	$i$f$cache	I
    //   1019	84	33	$this$cache$iv	Landroidx/compose/runtime/Composer;
    //   1019	84	34	invalid$iv	Z
    //   951	192	32	$i$a$-Column-ReportKt$ReportStep$1$2	I
    //   948	195	31	$this$invoke_u24lambda_u242	Landroidx/compose/foundation/layout/ColumnScope;
    //   948	195	30	$composer	Landroidx/compose/runtime/Composer;
    //   948	195	29	$changed	I
    //   912	236	28	$i$a$-Layout-ColumnKt$Column$1$iv	I
    //   909	239	27	$composer$iv	Landroidx/compose/runtime/Composer;
    //   909	239	26	$changed$iv	I
    //   824	55	25	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   821	58	24	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   817	64	23	$i$f$set-impl	I
    //   814	67	22	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   780	115	21	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   777	118	20	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   716	443	19	$i$f$ReusableComposeNode	I
    //   713	446	17	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   713	446	18	$changed$iv$iv$iv	I
    //   659	505	13	$i$f$Layout	I
    //   674	490	14	compositeKeyHash$iv$iv	I
    //   682	482	15	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   690	474	16	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   656	508	12	$changed$iv$iv	I
    //   603	566	10	$i$f$Column	I
    //   646	523	11	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   600	569	4	modifier$iv	Landroidx/compose/ui/Modifier;
    //   600	569	5	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
    //   621	548	6	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
    //   600	569	9	$changed$iv	I
    //   1184	6	6	$i$f$getDp	I
    //   1181	9	5	$this$dp$iv	I
    //   1216	6	8	$i$f$getDp	I
    //   1213	9	7	$this$dp$iv	I
    //   1613	36	34	$i$a$-let-ReportKt$ReportStep$1$3$1	I
    //   1610	39	33	startAgain	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
    //   2060	26	62	$i$a$-Box-ReportKt$ReportStep$1$3$2$1	I
    //   2057	29	61	$this$invoke_u24lambda_u246_u24lambda_u245_u24lambda_u244	Landroidx/compose/foundation/layout/BoxScope;
    //   2057	29	60	$composer	Landroidx/compose/runtime/Composer;
    //   2057	29	59	$changed	I
    //   2021	70	58	$i$a$-Layout-BoxKt$Box$1$iv	I
    //   2018	73	57	$composer$iv	Landroidx/compose/runtime/Composer;
    //   2018	73	56	$changed$iv	I
    //   1932	55	55	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   1929	58	54	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   1925	64	53	$i$f$set-impl	I
    //   1922	67	52	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   1888	115	51	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   1885	118	50	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   1817	287	49	$i$f$ReusableComposeNode	I
    //   1814	290	47	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   1814	290	48	$changed$iv$iv$iv	I
    //   1756	354	43	$i$f$Layout	I
    //   1773	337	44	compositeKeyHash$iv$iv	I
    //   1782	328	45	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   1791	319	46	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   1753	357	42	$changed$iv$iv	I
    //   1704	412	36	$i$f$Box	I
    //   1743	373	41	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   1723	393	38	modifier$iv	Landroidx/compose/ui/Modifier;
    //   1731	385	39	contentAlignment$iv	Landroidx/compose/ui/Alignment;
    //   1734	382	40	propagateMinConstraints$iv	Z
    //   1701	415	35	$changed$iv	I
    //   1697	420	34	$i$a$-let-ReportKt$ReportStep$1$3$2	I
    //   1694	423	33	rollback	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
    //   1580	553	31	$i$a$-Row-ReportKt$ReportStep$1$3	I
    //   1577	556	30	$this$invoke_u24lambda_u246	Landroidx/compose/foundation/layout/RowScope;
    //   1577	556	29	$composer	Landroidx/compose/runtime/Composer;
    //   1577	556	28	$changed	I
    //   1543	595	27	$i$a$-Layout-RowKt$Row$1$iv	I
    //   1540	598	26	$composer$iv	Landroidx/compose/runtime/Composer;
    //   1540	598	25	$changed$iv	I
    //   1455	55	24	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   1452	58	23	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   1448	64	22	$i$f$set-impl	I
    //   1445	67	21	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   1411	115	20	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   1408	118	19	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   1347	802	18	$i$f$ReusableComposeNode	I
    //   1344	805	16	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   1344	805	17	$changed$iv$iv$iv	I
    //   1290	864	12	$i$f$Layout	I
    //   1305	849	13	compositeKeyHash$iv$iv	I
    //   1313	841	14	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   1321	833	15	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   1287	867	11	$changed$iv$iv	I
    //   1241	918	9	$i$f$Row	I
    //   1277	882	10	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   1238	921	8	$changed$iv	I
    //   0	2178	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$ReportStep$1;
    //   0	2178	1	$this$JunieStepCard	Landroidx/compose/foundation/layout/ColumnScope;
    //   0	2178	2	$composer	Landroidx/compose/runtime/Composer;
    //   0	2178	3	$changed	I
  }
  
  ReportKt$ReportStep$1(TaskStep.Report $report, boolean $isProjectOnVCS) {}
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\ReportKt$ReportStep$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */