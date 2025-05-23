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

@Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\007\032/\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\0052\b\b\002\020\006\032\0020\007H\007¢\006\004\b\b\020\t\032-\020\n\032\0020\0012\b\b\002\020\013\032\0020\0032\b\b\002\020\f\032\0020\0052\b\b\002\020\006\032\0020\007H\007¢\006\004\b\r\020\t¨\006\016"}, d2 = {"JunieTitle", "", "modifer", "Landroidx/compose/ui/Modifier;", "title", "", "tint", "Landroidx/compose/ui/graphics/Color;", "JunieTitle-FNF3uiM", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)V", "Title", "modifier", "text", "Title-FNF3uiM", "standalone"})
@SourceDebugExtension({"SMAP\nTitle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Title.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/TitleKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,51:1\n86#2:52\n83#2,6:53\n89#2:87\n93#2:92\n79#3,6:59\n86#3,4:74\n90#3,2:84\n94#3:91\n368#4,9:65\n377#4:86\n378#4,2:89\n4034#5,6:78\n149#6:88\n149#6:93\n*S KotlinDebug\n*F\n+ 1 Title.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/TitleKt\n*L\n23#1:52\n23#1:53,6\n23#1:87\n23#1:92\n23#1:59,6\n23#1:74,4\n23#1:84,2\n23#1:91\n23#1:65,9\n23#1:86\n23#1:89,2\n23#1:78,6\n25#1:88\n38#1:93\n*E\n"})
public final class TitleKt {
  @Composable
  @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
  public static final void JunieTitle-FNF3uiM(@Nullable Modifier modifer, @Nullable String title, long tint, @Nullable Composer $composer, int $changed, int paramInt1) {
    // Byte code:
    //   0: aload #4
    //   2: ldc 144846221
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
    //   180: ifne -> 786
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
    //   227: ldc 144846221
    //   229: iload #7
    //   231: iconst_m1
    //   232: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.JunieTitle (Title.kt:21)'
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
    //   704: ldc 1369479164
    //   706: invokeinterface startReplaceGroup : (I)V
    //   711: aload_1
    //   712: ifnull -> 736
    //   715: aconst_null
    //   716: aload_1
    //   717: lload_2
    //   718: aload #32
    //   720: bipush #112
    //   722: iload #7
    //   724: iand
    //   725: sipush #896
    //   728: iload #7
    //   730: iand
    //   731: ior
    //   732: iconst_1
    //   733: invokestatic Title-FNF3uiM : (Landroidx/compose/ui/Modifier;Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)V
    //   736: aload #32
    //   738: invokeinterface endReplaceGroup : ()V
    //   743: nop
    //   744: aload #29
    //   746: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   749: aload #4
    //   751: invokeinterface endNode : ()V
    //   756: aload #4
    //   758: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   761: nop
    //   762: aload #4
    //   764: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   767: nop
    //   768: aload #4
    //   770: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   773: nop
    //   774: invokestatic isTraceInProgress : ()Z
    //   777: ifeq -> 793
    //   780: invokestatic traceEventEnd : ()V
    //   783: goto -> 793
    //   786: aload #4
    //   788: invokeinterface skipToGroupEnd : ()V
    //   793: aload #4
    //   795: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   800: dup
    //   801: ifnull -> 824
    //   804: aload_0
    //   805: aload_1
    //   806: lload_2
    //   807: iload #5
    //   809: iload #6
    //   811: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Ljava/lang/String;JII)Lkotlin/jvm/functions/Function2;
    //   816: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   821: goto -> 825
    //   824: pop
    //   825: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #22	-> 0
    //   #19	-> 190
    //   #20	-> 204
    //   #21	-> 214
    //   #22	-> 234
    //   #23	-> 237
    //   #52	-> 256
    //   #53	-> 259
    //   #54	-> 267
    //   #57	-> 275
    //   #58	-> 310
    //   #59	-> 320
    //   #60	-> 326
    //   #61	-> 333
    //   #62	-> 342
    //   #64	-> 349
    //   #63	-> 371
    //   #65	-> 381
    //   #66	-> 384
    //   #67	-> 402
    //   #68	-> 407
    //   #69	-> 419
    //   #71	-> 431
    //   #73	-> 436
    //   #74	-> 446
    //   #75	-> 459
    //   #77	-> 472
    //   #78	-> 483
    //   #79	-> 490
    //   #80	-> 518
    //   #81	-> 530
    //   #83	-> 544
    //   #78	-> 545
    //   #83	-> 546
    //   #84	-> 547
    //   #85	-> 560
    //   #73	-> 561
    //   #86	-> 562
    //   #87	-> 585
    //   #25	-> 616
    //   #88	-> 628
    //   #25	-> 634
    //   #88	-> 643
    //   #25	-> 649
    //   #26	-> 660
    //   #27	-> 669
    //   #25	-> 671
    //   #28	-> 674
    //   #24	-> 699
    //   #30	-> 711
    //   #31	-> 716
    //   #33	-> 743
    //   #87	-> 744
    //   #86	-> 749
    //   #89	-> 751
    //   #65	-> 758
    //   #90	-> 761
    //   #59	-> 764
    //   #91	-> 767
    //   #52	-> 770
    //   #92	-> 773
    //   #34	-> 786
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   628	6	36	$i$f$getDp	I
    //   625	9	35	$this$dp$iv	I
    //   643	6	36	$i$f$getDp	I
    //   640	9	35	$this$dp$iv	I
    //   616	128	34	$i$a$-Column-TitleKt$JunieTitle$1	I
    //   613	131	33	$this$JunieTitle_FNF3uiM_u24lambda_u240	Landroidx/compose/foundation/layout/ColumnScope;
    //   613	131	32	$composer	Landroidx/compose/runtime/Composer;
    //   613	131	31	$changed	I
    //   579	170	30	$i$a$-Layout-ColumnKt$Column$1$iv	I
    //   576	173	29	$composer$iv	Landroidx/compose/runtime/Composer;
    //   576	173	28	$changed$iv	I
    //   490	55	27	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   487	58	26	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   483	64	25	$i$f$set-impl	I
    //   480	67	24	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   446	115	23	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   443	118	22	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   375	387	21	$i$f$ReusableComposeNode	I
    //   372	390	19	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   372	390	20	$changed$iv$iv$iv	I
    //   314	454	15	$i$f$Layout	I
    //   331	437	16	compositeKeyHash$iv$iv	I
    //   340	428	17	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   349	419	18	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   311	457	14	$changed$iv$iv	I
    //   250	524	12	$i$f$Column	I
    //   301	473	13	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   247	527	8	modifier$iv	Landroidx/compose/ui/Modifier;
    //   267	507	9	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
    //   275	499	10	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
    //   247	527	11	$changed$iv	I
    //   15	811	7	$dirty	I
    //   0	826	0	modifer	Landroidx/compose/ui/Modifier;
    //   0	826	1	title	Ljava/lang/String;
    //   0	826	2	tint	J
    //   0	826	4	$composer	Landroidx/compose/runtime/Composer;
    //   0	826	5	$changed	I
  }
  
  @Composable
  @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
  public static final void Title-FNF3uiM(@Nullable Modifier modifier, @Nullable String text, long tint, @Nullable Composer $composer, int $changed, int paramInt1) {
    // Byte code:
    //   0: aload #4
    //   2: ldc_w -1047407126
    //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
    //   10: astore #4
    //   12: iload #5
    //   14: istore #7
    //   16: iload #6
    //   18: iconst_1
    //   19: iand
    //   20: ifeq -> 33
    //   23: iload #7
    //   25: bipush #6
    //   27: ior
    //   28: istore #7
    //   30: goto -> 62
    //   33: iload #5
    //   35: bipush #6
    //   37: iand
    //   38: ifne -> 62
    //   41: iload #7
    //   43: aload #4
    //   45: aload_0
    //   46: invokeinterface changed : (Ljava/lang/Object;)Z
    //   51: ifeq -> 58
    //   54: iconst_4
    //   55: goto -> 59
    //   58: iconst_2
    //   59: ior
    //   60: istore #7
    //   62: iload #6
    //   64: iconst_2
    //   65: iand
    //   66: ifeq -> 79
    //   69: iload #7
    //   71: bipush #48
    //   73: ior
    //   74: istore #7
    //   76: goto -> 110
    //   79: iload #5
    //   81: bipush #48
    //   83: iand
    //   84: ifne -> 110
    //   87: iload #7
    //   89: aload #4
    //   91: aload_1
    //   92: invokeinterface changed : (Ljava/lang/Object;)Z
    //   97: ifeq -> 105
    //   100: bipush #32
    //   102: goto -> 107
    //   105: bipush #16
    //   107: ior
    //   108: istore #7
    //   110: iload #6
    //   112: iconst_4
    //   113: iand
    //   114: ifeq -> 128
    //   117: iload #7
    //   119: sipush #384
    //   122: ior
    //   123: istore #7
    //   125: goto -> 162
    //   128: iload #5
    //   130: sipush #384
    //   133: iand
    //   134: ifne -> 162
    //   137: iload #7
    //   139: aload #4
    //   141: lload_2
    //   142: invokeinterface changed : (J)Z
    //   147: ifeq -> 156
    //   150: sipush #256
    //   153: goto -> 159
    //   156: sipush #128
    //   159: ior
    //   160: istore #7
    //   162: iload #7
    //   164: sipush #147
    //   167: iand
    //   168: sipush #146
    //   171: if_icmpne -> 184
    //   174: aload #4
    //   176: invokeinterface getSkipping : ()Z
    //   181: ifne -> 352
    //   184: iload #6
    //   186: iconst_1
    //   187: iand
    //   188: ifeq -> 220
    //   191: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   194: checkcast androidx/compose/ui/Modifier
    //   197: fconst_0
    //   198: fconst_0
    //   199: fconst_0
    //   200: bipush #12
    //   202: istore #8
    //   204: iconst_0
    //   205: istore #9
    //   207: iload #8
    //   209: i2f
    //   210: invokestatic constructor-impl : (F)F
    //   213: bipush #7
    //   215: aconst_null
    //   216: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   219: astore_0
    //   220: iload #6
    //   222: iconst_2
    //   223: iand
    //   224: ifeq -> 230
    //   227: ldc 'Delegate your tasks,\\nfocus on the results'
    //   229: astore_1
    //   230: iload #6
    //   232: iconst_4
    //   233: iand
    //   234: ifeq -> 244
    //   237: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
    //   240: invokevirtual getUnspecified-0d7_KjU : ()J
    //   243: lstore_2
    //   244: invokestatic isTraceInProgress : ()Z
    //   247: ifeq -> 262
    //   250: ldc_w -1047407126
    //   253: iload #7
    //   255: iconst_m1
    //   256: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.components.Title (Title.kt:40)'
    //   259: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   262: bipush #18
    //   264: invokestatic getSp : (I)J
    //   267: lstore #8
    //   269: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
    //   272: invokevirtual getW400 : ()Landroidx/compose/ui/text/font/FontWeight;
    //   275: astore #10
    //   277: ldc2_w 25.2
    //   280: invokestatic getSp : (D)J
    //   283: lstore #11
    //   285: aload_1
    //   286: aload_0
    //   287: lload_2
    //   288: lload #8
    //   290: aconst_null
    //   291: aload #10
    //   293: aconst_null
    //   294: lconst_0
    //   295: aconst_null
    //   296: iconst_0
    //   297: lload #11
    //   299: iconst_0
    //   300: iconst_0
    //   301: iconst_0
    //   302: aconst_null
    //   303: aconst_null
    //   304: aload #4
    //   306: ldc_w 199680
    //   309: bipush #14
    //   311: iload #7
    //   313: iconst_3
    //   314: ishr
    //   315: iand
    //   316: ior
    //   317: bipush #112
    //   319: iload #7
    //   321: iconst_3
    //   322: ishl
    //   323: iand
    //   324: ior
    //   325: sipush #896
    //   328: iload #7
    //   330: iand
    //   331: ior
    //   332: bipush #6
    //   334: ldc_w 64464
    //   337: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
    //   340: invokestatic isTraceInProgress : ()Z
    //   343: ifeq -> 359
    //   346: invokestatic traceEventEnd : ()V
    //   349: goto -> 359
    //   352: aload #4
    //   354: invokeinterface skipToGroupEnd : ()V
    //   359: aload #4
    //   361: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
    //   366: dup
    //   367: ifnull -> 390
    //   370: aload_0
    //   371: aload_1
    //   372: lload_2
    //   373: iload #5
    //   375: iload #6
    //   377: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Ljava/lang/String;JII)Lkotlin/jvm/functions/Function2;
    //   382: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
    //   387: goto -> 391
    //   390: pop
    //   391: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #41	-> 0
    //   #38	-> 191
    //   #93	-> 207
    //   #38	-> 213
    //   #39	-> 227
    //   #40	-> 237
    //   #41	-> 259
    //   #45	-> 262
    //   #46	-> 269
    //   #47	-> 277
    //   #44	-> 285
    //   #43	-> 286
    //   #48	-> 287
    //   #45	-> 288
    //   #46	-> 291
    //   #47	-> 297
    //   #42	-> 337
    //   #50	-> 352
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   207	6	9	$i$f$getDp	I
    //   204	9	8	$this$dp$iv	I
    //   16	376	7	$dirty	I
    //   0	392	0	modifier	Landroidx/compose/ui/Modifier;
    //   0	392	1	text	Ljava/lang/String;
    //   0	392	2	tint	J
    //   0	392	4	$composer	Landroidx/compose/runtime/Composer;
    //   0	392	5	$changed	I
  }
  
  private static final Unit JunieTitle_FNF3uiM$lambda$1(Modifier $modifer, String $title, long $tint, int $$changed, int $$default, Composer $composer, int $force) {
    JunieTitle-FNF3uiM($modifer, $title, $tint, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
    return Unit.INSTANCE;
  }
  
  private static final Unit Title_FNF3uiM$lambda$2(Modifier $modifier, String $text, long $tint, int $$changed, int $$default, Composer $composer, int $force) {
    Title-FNF3uiM($modifier, $text, $tint, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
    return Unit.INSTANCE;
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\TitleKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */