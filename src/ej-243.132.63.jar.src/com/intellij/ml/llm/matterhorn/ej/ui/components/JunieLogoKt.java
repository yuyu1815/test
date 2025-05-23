package com.intellij.ml.llm.matterhorn.ej.ui.components;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\007\032/\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\0052\b\b\002\020\006\032\0020\007H\007¢\006\004\b\b\020\t\032#\020\n\032\0020\0012\b\b\002\020\013\032\0020\0052\b\b\002\020\006\032\0020\007H\007¢\006\004\b\f\020\r¨\006\016"}, d2 = {"JunieLogo", "", "modifer", "Landroidx/compose/ui/Modifier;", "title", "", "tint", "Landroidx/compose/ui/graphics/Color;", "JunieLogo-FNF3uiM", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)V", "Title", "text", "Title-iJQMabo", "(Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)V", "ej-ui"})
@SourceDebugExtension({"SMAP\nJunieLogo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieLogo.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieLogoKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,48:1\n86#2:49\n83#2,6:50\n89#2:84\n93#2:89\n79#3,6:56\n86#3,4:71\n90#3,2:81\n94#3:88\n368#4,9:62\n377#4:83\n378#4,2:86\n4034#5,6:75\n149#6:85\n*S KotlinDebug\n*F\n+ 1 JunieLogo.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/JunieLogoKt\n*L\n21#1:49\n21#1:50,6\n21#1:84\n21#1:89\n21#1:56,6\n21#1:71,4\n21#1:81,2\n21#1:88\n21#1:62,9\n21#1:83\n21#1:86,2\n21#1:75,6\n23#1:85\n*E\n"})
public final class JunieLogoKt {
  @Composable
  @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
  public static final void JunieLogo-FNF3uiM(@Nullable Modifier modifer, @Nullable String title, long tint, @Nullable Composer $composer, int $changed, int paramInt1) {
    // Byte code:
    //   0: aload #4
    //   2: ldc -163897146
    //   4: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   9: astore #4
    //   11: iload #5
    //   13: istore #7
    //   15: iload #6
    //   17: iconst_1
    //   18: iand
    //   19: ifeq -> 32
    //   22: iload #7
    //   24: bipush #6
    //   26: ior
    //   27: istore #7
    //   29: goto -> 61
    //   32: iload #5
    //   34: bipush #6
    //   36: iand
    //   37: ifne -> 61
    //   40: iload #7
    //   42: aload #4
    //   44: aload_0
    //   45: invokeinterface changed : (Ljava/lang/Object;)Z
    //   50: ifeq -> 57
    //   53: iconst_4
    //   54: goto -> 58
    //   57: iconst_2
    //   58: ior
    //   59: istore #7
    //   61: iload #6
    //   63: iconst_2
    //   64: iand
    //   65: ifeq -> 78
    //   68: iload #7
    //   70: bipush #48
    //   72: ior
    //   73: istore #7
    //   75: goto -> 109
    //   78: iload #5
    //   80: bipush #48
    //   82: iand
    //   83: ifne -> 109
    //   86: iload #7
    //   88: aload #4
    //   90: aload_1
    //   91: invokeinterface changed : (Ljava/lang/Object;)Z
    //   96: ifeq -> 104
    //   99: bipush #32
    //   101: goto -> 106
    //   104: bipush #16
    //   106: ior
    //   107: istore #7
    //   109: iload #6
    //   111: iconst_4
    //   112: iand
    //   113: ifeq -> 127
    //   116: iload #7
    //   118: sipush #384
    //   121: ior
    //   122: istore #7
    //   124: goto -> 161
    //   127: iload #5
    //   129: sipush #384
    //   132: iand
    //   133: ifne -> 161
    //   136: iload #7
    //   138: aload #4
    //   140: lload_2
    //   141: invokeinterface changed : (J)Z
    //   146: ifeq -> 155
    //   149: sipush #256
    //   152: goto -> 158
    //   155: sipush #128
    //   158: ior
    //   159: istore #7
    //   161: iload #7
    //   163: sipush #147
    //   166: iand
    //   167: sipush #146
    //   170: if_icmpne -> 183
    //   173: aload #4
    //   175: invokeinterface getSkipping : ()Z
    //   180: ifne -> 788
    //   183: iload #6
    //   185: iconst_1
    //   186: iand
    //   187: ifeq -> 197
    //   190: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   193: checkcast androidx/compose/ui/Modifier
    //   196: astore_0
    //   197: iload #6
    //   199: iconst_2
    //   200: iand
    //   201: ifeq -> 207
    //   204: ldc 'Delegate your tasks,\\nfocus on the results'
    //   206: astore_1
    //   207: iload #6
    //   209: iconst_4
    //   210: iand
    //   211: ifeq -> 221
    //   214: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
    //   217: invokevirtual getUnspecified-0d7_KjU : ()J
    //   220: lstore_2
    //   221: invokestatic isTraceInProgress : ()Z
    //   224: ifeq -> 237
    //   227: ldc -163897146
    //   229: iload #7
    //   231: iconst_m1
    //   232: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieLogo (JunieLogo.kt:19)'
    //   234: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   237: aload_0
    //   238: astore #8
    //   240: bipush #14
    //   242: iload #7
    //   244: iand
    //   245: istore #11
    //   247: iconst_0
    //   248: istore #12
    //   250: aload #4
    //   252: ldc -483455358
    //   254: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
    //   256: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   259: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
    //   262: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
    //   265: astore #9
    //   267: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   270: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
    //   273: astore #10
    //   275: aload #9
    //   277: aload #10
    //   279: aload #4
    //   281: bipush #14
    //   283: iload #11
    //   285: iconst_3
    //   286: ishr
    //   287: iand
    //   288: bipush #112
    //   290: iload #11
    //   292: iconst_3
    //   293: ishr
    //   294: iand
    //   295: ior
    //   296: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    //   299: astore #13
    //   301: bipush #112
    //   303: iload #11
    //   305: iconst_3
    //   306: ishl
    //   307: iand
    //   308: istore #14
    //   310: nop
    //   311: iconst_0
    //   312: istore #15
    //   314: aload #4
    //   316: ldc -1323940314
    //   318: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   320: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   323: aload #4
    //   325: iconst_0
    //   326: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   329: istore #16
    //   331: aload #4
    //   333: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   338: astore #17
    //   340: aload #4
    //   342: aload #8
    //   344: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   347: astore #18
    //   349: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   352: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   355: astore #19
    //   357: bipush #6
    //   359: sipush #896
    //   362: iload #14
    //   364: bipush #6
    //   366: ishl
    //   367: iand
    //   368: ior
    //   369: istore #20
    //   371: nop
    //   372: iconst_0
    //   373: istore #21
    //   375: aload #4
    //   377: ldc -692256719
    //   379: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   381: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   384: aload #4
    //   386: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   391: instanceof androidx/compose/runtime/Applier
    //   394: ifne -> 400
    //   397: invokestatic invalidApplier : ()V
    //   400: aload #4
    //   402: invokeinterface startReusableNode : ()V
    //   407: aload #4
    //   409: invokeinterface getInserting : ()Z
    //   414: ifeq -> 429
    //   417: aload #4
    //   419: aload #19
    //   421: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   426: goto -> 436
    //   429: aload #4
    //   431: invokeinterface useNode : ()V
    //   436: aload #4
    //   438: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   441: astore #22
    //   443: iconst_0
    //   444: istore #23
    //   446: aload #22
    //   448: aload #13
    //   450: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   453: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   456: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   459: aload #22
    //   461: aload #17
    //   463: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   466: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   469: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   472: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   475: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   478: astore #24
    //   480: iconst_0
    //   481: istore #25
    //   483: aload #22
    //   485: astore #26
    //   487: iconst_0
    //   488: istore #27
    //   490: aload #26
    //   492: invokeinterface getInserting : ()Z
    //   497: ifne -> 518
    //   500: aload #26
    //   502: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   507: iload #16
    //   509: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   512: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   515: ifne -> 544
    //   518: aload #26
    //   520: iload #16
    //   522: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   525: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   530: aload #22
    //   532: iload #16
    //   534: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   537: aload #24
    //   539: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   544: nop
    //   545: nop
    //   546: nop
    //   547: aload #22
    //   549: aload #18
    //   551: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   554: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   557: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   560: nop
    //   561: nop
    //   562: aload #4
    //   564: bipush #14
    //   566: iload #20
    //   568: bipush #6
    //   570: ishr
    //   571: iand
    //   572: istore #28
    //   574: astore #29
    //   576: iconst_0
    //   577: istore #30
    //   579: aload #29
    //   581: ldc -384784025
    //   583: ldc 'C88@4444L9:Column.kt#2w3rfo'
    //   585: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   588: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
    //   591: aload #29
    //   593: bipush #6
    //   595: bipush #112
    //   597: iload #11
    //   599: bipush #6
    //   601: ishr
    //   602: iand
    //   603: ior
    //   604: istore #31
    //   606: astore #32
    //   608: checkcast androidx/compose/foundation/layout/ColumnScope
    //   611: astore #33
    //   613: iconst_0
    //   614: istore #34
    //   616: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   619: checkcast androidx/compose/ui/Modifier
    //   622: iconst_2
    //   623: istore #35
    //   625: iconst_0
    //   626: istore #36
    //   628: iload #35
    //   630: i2f
    //   631: invokestatic constructor-impl : (F)F
    //   634: fconst_0
    //   635: fconst_0
    //   636: bipush #16
    //   638: istore #35
    //   640: iconst_0
    //   641: istore #36
    //   643: iload #35
    //   645: i2f
    //   646: invokestatic constructor-impl : (F)F
    //   649: bipush #6
    //   651: aconst_null
    //   652: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   655: astore #37
    //   657: aload #32
    //   659: iconst_0
    //   660: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
    //   663: invokevirtual getWelcomeLogoPath : ()Lorg/jetbrains/jewel/ui/icon/PathIconKey;
    //   666: checkcast org/jetbrains/jewel/ui/icon/IconKey
    //   669: ldc 'Welcome icon'
    //   671: aload #37
    //   673: aconst_null
    //   674: lload_2
    //   675: iconst_0
    //   676: anewarray org/jetbrains/jewel/ui/painter/PainterHint
    //   679: aload #32
    //   681: sipush #432
    //   684: getstatic org/jetbrains/jewel/ui/icon/PathIconKey.$stable : I
    //   687: ior
    //   688: ldc 57344
    //   690: iload #7
    //   692: bipush #6
    //   694: ishl
    //   695: iand
    //   696: ior
    //   697: bipush #8
    //   699: invokestatic Icon-FHprtrg : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V
    //   702: aload #32
    //   704: ldc 767220615
    //   706: invokeinterface startReplaceGroup : (I)V
    //   711: aload_1
    //   712: ifnull -> 738
    //   715: aload_1
    //   716: lload_2
    //   717: aload #32
    //   719: bipush #14
    //   721: iload #7
    //   723: iconst_3
    //   724: ishr
    //   725: iand
    //   726: bipush #112
    //   728: iload #7
    //   730: iconst_3
    //   731: ishr
    //   732: iand
    //   733: ior
    //   734: iconst_0
    //   735: invokestatic Title-iJQMabo : (Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)V
    //   738: aload #32
    //   740: invokeinterface endReplaceGroup : ()V
    //   745: nop
    //   746: aload #29
    //   748: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   751: aload #4
    //   753: invokeinterface endNode : ()V
    //   758: aload #4
    //   760: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   763: nop
    //   764: aload #4
    //   766: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   769: nop
    //   770: aload #4
    //   772: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   775: nop
    //   776: invokestatic isTraceInProgress : ()Z
    //   779: ifeq -> 795
    //   782: invokestatic traceEventEnd : ()V
    //   785: goto -> 795
    //   788: aload #4
    //   790: invokeinterface skipToGroupEnd : ()V
    //   795: aload #4
    //   797: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   802: dup
    //   803: ifnull -> 826
    //   806: aload_0
    //   807: aload_1
    //   808: lload_2
    //   809: iload #5
    //   811: iload #6
    //   813: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Ljava/lang/String;JII)Lkotlin/jvm/functions/Function2;
    //   818: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   823: goto -> 827
    //   826: pop
    //   827: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #20	-> 0
    //   #17	-> 190
    //   #18	-> 204
    //   #19	-> 214
    //   #20	-> 234
    //   #21	-> 237
    //   #49	-> 256
    //   #50	-> 259
    //   #51	-> 267
    //   #54	-> 275
    //   #55	-> 310
    //   #56	-> 320
    //   #57	-> 326
    //   #58	-> 333
    //   #59	-> 342
    //   #61	-> 349
    //   #60	-> 371
    //   #62	-> 381
    //   #63	-> 384
    //   #64	-> 402
    //   #65	-> 407
    //   #66	-> 419
    //   #68	-> 431
    //   #70	-> 436
    //   #71	-> 446
    //   #72	-> 459
    //   #74	-> 472
    //   #75	-> 483
    //   #76	-> 490
    //   #77	-> 518
    //   #78	-> 530
    //   #80	-> 544
    //   #75	-> 545
    //   #80	-> 546
    //   #81	-> 547
    //   #82	-> 560
    //   #70	-> 561
    //   #83	-> 562
    //   #84	-> 585
    //   #23	-> 616
    //   #85	-> 628
    //   #23	-> 634
    //   #85	-> 643
    //   #23	-> 649
    //   #24	-> 660
    //   #25	-> 669
    //   #23	-> 671
    //   #26	-> 674
    //   #22	-> 699
    //   #28	-> 711
    //   #29	-> 715
    //   #32	-> 745
    //   #84	-> 746
    //   #83	-> 751
    //   #86	-> 753
    //   #62	-> 760
    //   #87	-> 763
    //   #56	-> 766
    //   #88	-> 769
    //   #49	-> 772
    //   #89	-> 775
    //   #33	-> 788
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   628	6	36	$i$f$getDp	I
    //   625	9	35	$this$dp$iv	I
    //   643	6	36	$i$f$getDp	I
    //   640	9	35	$this$dp$iv	I
    //   616	130	34	$i$a$-Column-JunieLogoKt$JunieLogo$1	I
    //   613	133	33	$this$JunieLogo_FNF3uiM_u24lambda_u240	Landroidx/compose/foundation/layout/ColumnScope;
    //   613	133	32	$composer	Landroidx/compose/runtime/Composer;
    //   613	133	31	$changed	I
    //   579	172	30	$i$a$-Layout-ColumnKt$Column$1$iv	I
    //   576	175	29	$composer$iv	Landroidx/compose/runtime/Composer;
    //   576	175	28	$changed$iv	I
    //   490	55	27	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   487	58	26	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   483	64	25	$i$f$set-impl	I
    //   480	67	24	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   446	115	23	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   443	118	22	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   375	389	21	$i$f$ReusableComposeNode	I
    //   372	392	19	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   372	392	20	$changed$iv$iv$iv	I
    //   314	456	15	$i$f$Layout	I
    //   331	439	16	compositeKeyHash$iv$iv	I
    //   340	430	17	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   349	421	18	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   311	459	14	$changed$iv$iv	I
    //   250	526	12	$i$f$Column	I
    //   301	475	13	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   247	529	8	modifier$iv	Landroidx/compose/ui/Modifier;
    //   267	509	9	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
    //   275	501	10	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
    //   247	529	11	$changed$iv	I
    //   15	813	7	$dirty	I
    //   0	828	0	modifer	Landroidx/compose/ui/Modifier;
    //   0	828	1	title	Ljava/lang/String;
    //   0	828	2	tint	J
    //   0	828	4	$composer	Landroidx/compose/runtime/Composer;
    //   0	828	5	$changed	I
  }
  
  @Composable
  @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
  public static final void Title-iJQMabo(@Nullable String text, long tint, @Nullable Composer $composer, int $changed, int paramInt1) {
    // Byte code:
    //   0: aload_3
    //   1: ldc_w 684794449
    //   4: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   9: astore_3
    //   10: iload #4
    //   12: istore #6
    //   14: iload #5
    //   16: iconst_1
    //   17: iand
    //   18: ifeq -> 31
    //   21: iload #6
    //   23: bipush #6
    //   25: ior
    //   26: istore #6
    //   28: goto -> 59
    //   31: iload #4
    //   33: bipush #6
    //   35: iand
    //   36: ifne -> 59
    //   39: iload #6
    //   41: aload_3
    //   42: aload_0
    //   43: invokeinterface changed : (Ljava/lang/Object;)Z
    //   48: ifeq -> 55
    //   51: iconst_4
    //   52: goto -> 56
    //   55: iconst_2
    //   56: ior
    //   57: istore #6
    //   59: iload #5
    //   61: iconst_2
    //   62: iand
    //   63: ifeq -> 76
    //   66: iload #6
    //   68: bipush #48
    //   70: ior
    //   71: istore #6
    //   73: goto -> 106
    //   76: iload #4
    //   78: bipush #48
    //   80: iand
    //   81: ifne -> 106
    //   84: iload #6
    //   86: aload_3
    //   87: lload_1
    //   88: invokeinterface changed : (J)Z
    //   93: ifeq -> 101
    //   96: bipush #32
    //   98: goto -> 103
    //   101: bipush #16
    //   103: ior
    //   104: istore #6
    //   106: iload #6
    //   108: bipush #19
    //   110: iand
    //   111: bipush #18
    //   113: if_icmpne -> 125
    //   116: aload_3
    //   117: invokeinterface getSkipping : ()Z
    //   122: ifne -> 248
    //   125: iload #5
    //   127: iconst_1
    //   128: iand
    //   129: ifeq -> 135
    //   132: ldc 'Delegate your tasks,\\nfocus on the results'
    //   134: astore_0
    //   135: iload #5
    //   137: iconst_2
    //   138: iand
    //   139: ifeq -> 149
    //   142: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
    //   145: invokevirtual getUnspecified-0d7_KjU : ()J
    //   148: lstore_1
    //   149: invokestatic isTraceInProgress : ()Z
    //   152: ifeq -> 167
    //   155: ldc_w 684794449
    //   158: iload #6
    //   160: iconst_m1
    //   161: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.components.Title (JunieLogo.kt:38)'
    //   164: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   167: bipush #18
    //   169: invokestatic getSp : (I)J
    //   172: lstore #7
    //   174: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
    //   177: invokevirtual getW400 : ()Landroidx/compose/ui/text/font/FontWeight;
    //   180: astore #9
    //   182: ldc2_w 25.2
    //   185: invokestatic getSp : (D)J
    //   188: lstore #10
    //   190: aload_0
    //   191: aconst_null
    //   192: lload_1
    //   193: lload #7
    //   195: aconst_null
    //   196: aload #9
    //   198: aconst_null
    //   199: lconst_0
    //   200: aconst_null
    //   201: iconst_0
    //   202: lload #10
    //   204: iconst_0
    //   205: iconst_0
    //   206: iconst_0
    //   207: aconst_null
    //   208: aconst_null
    //   209: aload_3
    //   210: ldc_w 199680
    //   213: bipush #14
    //   215: iload #6
    //   217: iand
    //   218: ior
    //   219: sipush #896
    //   222: iload #6
    //   224: iconst_3
    //   225: ishl
    //   226: iand
    //   227: ior
    //   228: bipush #6
    //   230: ldc_w 64466
    //   233: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
    //   236: invokestatic isTraceInProgress : ()Z
    //   239: ifeq -> 254
    //   242: invokestatic traceEventEnd : ()V
    //   245: goto -> 254
    //   248: aload_3
    //   249: invokeinterface skipToGroupEnd : ()V
    //   254: aload_3
    //   255: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   260: dup
    //   261: ifnull -> 283
    //   264: aload_0
    //   265: lload_1
    //   266: iload #4
    //   268: iload #5
    //   270: <illegal opcode> invoke : (Ljava/lang/String;JII)Lkotlin/jvm/functions/Function2;
    //   275: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   280: goto -> 284
    //   283: pop
    //   284: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #39	-> 0
    //   #37	-> 132
    //   #38	-> 142
    //   #39	-> 164
    //   #42	-> 167
    //   #43	-> 174
    //   #44	-> 182
    //   #41	-> 190
    //   #45	-> 192
    //   #42	-> 193
    //   #43	-> 196
    //   #44	-> 202
    //   #40	-> 233
    //   #47	-> 248
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   14	271	6	$dirty	I
    //   0	285	0	text	Ljava/lang/String;
    //   0	285	1	tint	J
    //   0	285	3	$composer	Landroidx/compose/runtime/Composer;
    //   0	285	4	$changed	I
  }
  
  private static final Unit JunieLogo_FNF3uiM$lambda$1(Modifier $modifer, String $title, long $tint, int $$changed, int $$default, Composer $composer, int $force) {
    JunieLogo-FNF3uiM($modifer, $title, $tint, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
    return Unit.INSTANCE;
  }
  
  private static final Unit Title_iJQMabo$lambda$2(String $text, long $tint, int $$changed, int $$default, Composer $composer, int $force) {
    Title-iJQMabo($text, $tint, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
    return Unit.INSTANCE;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\JunieLogoKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */