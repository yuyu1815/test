package com.intellij.ml.llm.matterhorn.ej.ui.components;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\0006\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\032]\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\006\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\034\020\013\032\030\022\004\022\0020\r\022\004\022\0020\0010\f¢\006\002\b\016¢\006\002\b\017H\007¢\006\004\b\020\020\021¨\006\022"}, d2 = {"JunieReportCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "innerPadding", "Landroidx/compose/ui/unit/Dp;", "outerPadding", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "backgroundShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "JunieReportCard-LFFoFBE", "(Landroidx/compose/ui/Modifier;FFJLandroidx/compose/foundation/shape/RoundedCornerShape;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "standalone"})
@SourceDebugExtension({"SMAP\nJunieReportCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieReportCard.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieReportCardKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,31:1\n149#2:32\n149#2:33\n149#2:34\n71#3:35\n68#3,6:36\n74#3:70\n78#3:74\n79#4,6:42\n86#4,4:57\n90#4,2:67\n94#4:73\n368#5,9:48\n377#5:69\n378#5,2:71\n4034#6,6:61\n*S KotlinDebug\n*F\n+ 1 JunieReportCard.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieReportCardKt\n*L\n17#1:32\n18#1:33\n20#1:34\n23#1:35\n23#1:36,6\n23#1:70\n23#1:74\n23#1:42,6\n23#1:57,4\n23#1:67,2\n23#1:73\n23#1:48,9\n23#1:69\n23#1:71,2\n23#1:61,6\n*E\n"})
public final class JunieReportCardKt {
  @Composable
  @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
  public static final void JunieReportCard-LFFoFBE(@Nullable Modifier modifier, float innerPadding, float outerPadding, long backgroundColor, @Nullable RoundedCornerShape backgroundShape, @NotNull Function3 content, @Nullable Composer $composer, int $changed, int paramInt1) {
    // Byte code:
    //   0: aload #6
    //   2: ldc 'content'
    //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   7: aload #7
    //   9: ldc 1556883412
    //   11: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   16: astore #7
    //   18: iload #8
    //   20: istore #10
    //   22: iload #9
    //   24: iconst_1
    //   25: iand
    //   26: ifeq -> 39
    //   29: iload #10
    //   31: bipush #6
    //   33: ior
    //   34: istore #10
    //   36: goto -> 68
    //   39: iload #8
    //   41: bipush #6
    //   43: iand
    //   44: ifne -> 68
    //   47: iload #10
    //   49: aload #7
    //   51: aload_0
    //   52: invokeinterface changed : (Ljava/lang/Object;)Z
    //   57: ifeq -> 64
    //   60: iconst_4
    //   61: goto -> 65
    //   64: iconst_2
    //   65: ior
    //   66: istore #10
    //   68: iload #9
    //   70: iconst_2
    //   71: iand
    //   72: ifeq -> 85
    //   75: iload #10
    //   77: bipush #48
    //   79: ior
    //   80: istore #10
    //   82: goto -> 116
    //   85: iload #8
    //   87: bipush #48
    //   89: iand
    //   90: ifne -> 116
    //   93: iload #10
    //   95: aload #7
    //   97: fload_1
    //   98: invokeinterface changed : (F)Z
    //   103: ifeq -> 111
    //   106: bipush #32
    //   108: goto -> 113
    //   111: bipush #16
    //   113: ior
    //   114: istore #10
    //   116: iload #9
    //   118: iconst_4
    //   119: iand
    //   120: ifeq -> 134
    //   123: iload #10
    //   125: sipush #384
    //   128: ior
    //   129: istore #10
    //   131: goto -> 168
    //   134: iload #8
    //   136: sipush #384
    //   139: iand
    //   140: ifne -> 168
    //   143: iload #10
    //   145: aload #7
    //   147: fload_2
    //   148: invokeinterface changed : (F)Z
    //   153: ifeq -> 162
    //   156: sipush #256
    //   159: goto -> 165
    //   162: sipush #128
    //   165: ior
    //   166: istore #10
    //   168: iload #9
    //   170: bipush #8
    //   172: iand
    //   173: ifeq -> 187
    //   176: iload #10
    //   178: sipush #3072
    //   181: ior
    //   182: istore #10
    //   184: goto -> 221
    //   187: iload #8
    //   189: sipush #3072
    //   192: iand
    //   193: ifne -> 221
    //   196: iload #10
    //   198: aload #7
    //   200: lload_3
    //   201: invokeinterface changed : (J)Z
    //   206: ifeq -> 215
    //   209: sipush #2048
    //   212: goto -> 218
    //   215: sipush #1024
    //   218: ior
    //   219: istore #10
    //   221: iload #8
    //   223: sipush #24576
    //   226: iand
    //   227: ifne -> 264
    //   230: iload #10
    //   232: iload #9
    //   234: bipush #16
    //   236: iand
    //   237: ifne -> 258
    //   240: aload #7
    //   242: aload #5
    //   244: invokeinterface changed : (Ljava/lang/Object;)Z
    //   249: ifeq -> 258
    //   252: sipush #16384
    //   255: goto -> 261
    //   258: sipush #8192
    //   261: ior
    //   262: istore #10
    //   264: iload #9
    //   266: bipush #32
    //   268: iand
    //   269: ifeq -> 282
    //   272: iload #10
    //   274: ldc 196608
    //   276: ior
    //   277: istore #10
    //   279: goto -> 314
    //   282: iload #8
    //   284: ldc 196608
    //   286: iand
    //   287: ifne -> 314
    //   290: iload #10
    //   292: aload #7
    //   294: aload #6
    //   296: invokeinterface changedInstance : (Ljava/lang/Object;)Z
    //   301: ifeq -> 309
    //   304: ldc 131072
    //   306: goto -> 311
    //   309: ldc 65536
    //   311: ior
    //   312: istore #10
    //   314: iload #10
    //   316: ldc 74899
    //   318: iand
    //   319: ldc 74898
    //   321: if_icmpne -> 334
    //   324: aload #7
    //   326: invokeinterface getSkipping : ()Z
    //   331: ifne -> 915
    //   334: aload #7
    //   336: invokeinterface startDefaults : ()V
    //   341: iload #8
    //   343: iconst_1
    //   344: iand
    //   345: ifeq -> 358
    //   348: aload #7
    //   350: invokeinterface getDefaultsInvalid : ()Z
    //   355: ifeq -> 450
    //   358: iload #9
    //   360: iconst_1
    //   361: iand
    //   362: ifeq -> 372
    //   365: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   368: checkcast androidx/compose/ui/Modifier
    //   371: astore_0
    //   372: iload #9
    //   374: iconst_2
    //   375: iand
    //   376: ifeq -> 393
    //   379: bipush #16
    //   381: istore #11
    //   383: iconst_0
    //   384: istore #12
    //   386: iload #11
    //   388: i2f
    //   389: invokestatic constructor-impl : (F)F
    //   392: fstore_1
    //   393: iload #9
    //   395: iconst_4
    //   396: iand
    //   397: ifeq -> 414
    //   400: bipush #8
    //   402: istore #11
    //   404: iconst_0
    //   405: istore #12
    //   407: iload #11
    //   409: i2f
    //   410: invokestatic constructor-impl : (F)F
    //   413: fstore_2
    //   414: iload #9
    //   416: bipush #16
    //   418: iand
    //   419: ifeq -> 472
    //   422: bipush #6
    //   424: istore #11
    //   426: iconst_0
    //   427: istore #12
    //   429: iload #11
    //   431: i2f
    //   432: invokestatic constructor-impl : (F)F
    //   435: invokestatic RoundedCornerShape-0680j_4 : (F)Landroidx/compose/foundation/shape/RoundedCornerShape;
    //   438: astore #5
    //   440: iload #10
    //   442: ldc -57345
    //   444: iand
    //   445: istore #10
    //   447: goto -> 472
    //   450: aload #7
    //   452: invokeinterface skipToGroupEnd : ()V
    //   457: iload #9
    //   459: bipush #16
    //   461: iand
    //   462: ifeq -> 472
    //   465: iload #10
    //   467: ldc -57345
    //   469: iand
    //   470: istore #10
    //   472: aload #7
    //   474: invokeinterface endDefaults : ()V
    //   479: invokestatic isTraceInProgress : ()Z
    //   482: ifeq -> 495
    //   485: ldc 1556883412
    //   487: iload #10
    //   489: iconst_m1
    //   490: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieReportCard (JunieReportCard.kt:21)'
    //   492: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   495: aload_0
    //   496: fload_2
    //   497: invokestatic padding-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
    //   500: lload_3
    //   501: aload #5
    //   503: checkcast androidx/compose/ui/graphics/Shape
    //   506: invokestatic background-bw27NRU : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
    //   509: fload_1
    //   510: invokestatic padding-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
    //   513: astore #11
    //   515: sipush #7168
    //   518: iload #10
    //   520: bipush #6
    //   522: ishr
    //   523: iand
    //   524: istore #14
    //   526: nop
    //   527: iconst_0
    //   528: istore #15
    //   530: aload #7
    //   532: ldc 733328855
    //   534: ldc 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
    //   536: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   539: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   542: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
    //   545: astore #12
    //   547: iconst_0
    //   548: istore #13
    //   550: aload #12
    //   552: iload #13
    //   554: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
    //   557: astore #16
    //   559: bipush #112
    //   561: iload #14
    //   563: iconst_3
    //   564: ishl
    //   565: iand
    //   566: istore #17
    //   568: nop
    //   569: iconst_0
    //   570: istore #18
    //   572: aload #7
    //   574: ldc -1323940314
    //   576: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   578: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   581: aload #7
    //   583: iconst_0
    //   584: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   587: istore #19
    //   589: aload #7
    //   591: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   596: astore #20
    //   598: aload #7
    //   600: aload #11
    //   602: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   605: astore #21
    //   607: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   610: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   613: astore #22
    //   615: bipush #6
    //   617: sipush #896
    //   620: iload #17
    //   622: bipush #6
    //   624: ishl
    //   625: iand
    //   626: ior
    //   627: istore #23
    //   629: nop
    //   630: iconst_0
    //   631: istore #24
    //   633: aload #7
    //   635: ldc -692256719
    //   637: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   639: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   642: aload #7
    //   644: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   649: instanceof androidx/compose/runtime/Applier
    //   652: ifne -> 658
    //   655: invokestatic invalidApplier : ()V
    //   658: aload #7
    //   660: invokeinterface startReusableNode : ()V
    //   665: aload #7
    //   667: invokeinterface getInserting : ()Z
    //   672: ifeq -> 687
    //   675: aload #7
    //   677: aload #22
    //   679: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   684: goto -> 694
    //   687: aload #7
    //   689: invokeinterface useNode : ()V
    //   694: aload #7
    //   696: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   699: astore #25
    //   701: iconst_0
    //   702: istore #26
    //   704: aload #25
    //   706: aload #16
    //   708: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   711: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   714: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   717: aload #25
    //   719: aload #20
    //   721: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   724: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   727: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   730: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   733: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   736: astore #27
    //   738: iconst_0
    //   739: istore #28
    //   741: aload #25
    //   743: astore #29
    //   745: iconst_0
    //   746: istore #30
    //   748: aload #29
    //   750: invokeinterface getInserting : ()Z
    //   755: ifne -> 776
    //   758: aload #29
    //   760: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   765: iload #19
    //   767: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   770: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   773: ifne -> 802
    //   776: aload #29
    //   778: iload #19
    //   780: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   783: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   788: aload #25
    //   790: iload #19
    //   792: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   795: aload #27
    //   797: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   802: nop
    //   803: nop
    //   804: nop
    //   805: aload #25
    //   807: aload #21
    //   809: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   812: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   815: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   818: nop
    //   819: nop
    //   820: aload #7
    //   822: bipush #14
    //   824: iload #23
    //   826: bipush #6
    //   828: ishr
    //   829: iand
    //   830: istore #31
    //   832: astore #32
    //   834: iconst_0
    //   835: istore #33
    //   837: aload #32
    //   839: ldc -2146769399
    //   841: ldc 'C73@3429L9:Box.kt#2w3rfo'
    //   843: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   846: aload #6
    //   848: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
    //   851: aload #32
    //   853: bipush #6
    //   855: bipush #112
    //   857: iload #14
    //   859: bipush #6
    //   861: ishr
    //   862: iand
    //   863: ior
    //   864: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   867: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   872: pop
    //   873: aload #32
    //   875: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   878: aload #7
    //   880: invokeinterface endNode : ()V
    //   885: aload #7
    //   887: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   890: nop
    //   891: aload #7
    //   893: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   896: nop
    //   897: aload #7
    //   899: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   902: nop
    //   903: invokestatic isTraceInProgress : ()Z
    //   906: ifeq -> 922
    //   909: invokestatic traceEventEnd : ()V
    //   912: goto -> 922
    //   915: aload #7
    //   917: invokeinterface skipToGroupEnd : ()V
    //   922: aload #7
    //   924: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   929: dup
    //   930: ifnull -> 958
    //   933: aload_0
    //   934: fload_1
    //   935: fload_2
    //   936: lload_3
    //   937: aload #5
    //   939: aload #6
    //   941: iload #8
    //   943: iload #9
    //   945: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;FFJLandroidx/compose/foundation/shape/RoundedCornerShape;Lkotlin/jvm/functions/Function3;II)Lkotlin/jvm/functions/Function2;
    //   950: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   955: goto -> 959
    //   958: pop
    //   959: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #22	-> 7
    //   #16	-> 365
    //   #17	-> 379
    //   #32	-> 386
    //   #18	-> 400
    //   #33	-> 407
    //   #20	-> 422
    //   #34	-> 429
    //   #20	-> 435
    //   #22	-> 492
    //   #24	-> 495
    //   #25	-> 496
    //   #26	-> 500
    //   #27	-> 509
    //   #23	-> 526
    //   #35	-> 536
    //   #36	-> 539
    //   #37	-> 547
    //   #40	-> 550
    //   #41	-> 568
    //   #42	-> 578
    //   #43	-> 584
    //   #44	-> 591
    //   #45	-> 600
    //   #47	-> 607
    //   #46	-> 629
    //   #48	-> 639
    //   #49	-> 642
    //   #50	-> 660
    //   #51	-> 665
    //   #52	-> 677
    //   #54	-> 689
    //   #56	-> 694
    //   #57	-> 704
    //   #58	-> 717
    //   #60	-> 730
    //   #61	-> 741
    //   #62	-> 748
    //   #63	-> 776
    //   #64	-> 788
    //   #66	-> 802
    //   #61	-> 803
    //   #66	-> 804
    //   #67	-> 805
    //   #68	-> 818
    //   #56	-> 819
    //   #69	-> 820
    //   #70	-> 843
    //   #69	-> 878
    //   #71	-> 880
    //   #48	-> 887
    //   #72	-> 890
    //   #42	-> 893
    //   #73	-> 896
    //   #35	-> 899
    //   #74	-> 902
    //   #30	-> 915
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   386	6	12	$i$f$getDp	I
    //   383	9	11	$this$dp$iv	I
    //   407	6	12	$i$f$getDp	I
    //   404	9	11	$this$dp$iv	I
    //   429	6	12	$i$f$getDp	I
    //   426	9	11	$this$dp$iv	I
    //   837	41	33	$i$a$-Layout-BoxKt$Box$1$iv	I
    //   834	44	32	$composer$iv	Landroidx/compose/runtime/Composer;
    //   834	44	31	$changed$iv	I
    //   748	55	30	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   745	58	29	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   741	64	28	$i$f$set-impl	I
    //   738	67	27	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   704	115	26	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   701	118	25	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   633	258	24	$i$f$ReusableComposeNode	I
    //   630	261	22	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   630	261	23	$changed$iv$iv$iv	I
    //   572	325	18	$i$f$Layout	I
    //   589	308	19	compositeKeyHash$iv$iv	I
    //   598	299	20	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   607	290	21	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   569	328	17	$changed$iv$iv	I
    //   530	373	15	$i$f$Box	I
    //   559	344	16	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   527	376	11	modifier$iv	Landroidx/compose/ui/Modifier;
    //   547	356	12	contentAlignment$iv	Landroidx/compose/ui/Alignment;
    //   550	353	13	propagateMinConstraints$iv	Z
    //   527	376	14	$changed$iv	I
    //   22	938	10	$dirty	I
    //   0	960	0	modifier	Landroidx/compose/ui/Modifier;
    //   0	960	1	innerPadding	F
    //   0	960	2	outerPadding	F
    //   0	960	3	backgroundColor	J
    //   0	960	5	backgroundShape	Landroidx/compose/foundation/shape/RoundedCornerShape;
    //   0	960	6	content	Lkotlin/jvm/functions/Function3;
    //   0	960	7	$composer	Landroidx/compose/runtime/Composer;
    //   0	960	8	$changed	I
  }
  
  private static final Unit JunieReportCard_LFFoFBE$lambda$0(Modifier $modifier, float $innerPadding, float $outerPadding, long $backgroundColor, RoundedCornerShape $backgroundShape, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
    JunieReportCard-LFFoFBE($modifier, $innerPadding, $outerPadding, $backgroundColor, $backgroundShape, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
    return Unit.INSTANCE;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\JunieReportCardKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */