package org.jetbrains.jewel.foundation.lazy;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.focus.FocusRequester;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.jewel.foundation.lazy.tree.KeyActions;
import org.jetbrains.jewel.foundation.lazy.tree.PointerEventActions;

@Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
@SourceDebugExtension({"SMAP\nSelectableLazyColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectableLazyColumn.kt\norg/jetbrains/jewel/foundation/lazy/SelectableLazyColumnKt$appendEntry$4\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,245:1\n1225#2,6:246\n71#3:252\n68#3,6:253\n74#3:287\n78#3:291\n79#4,6:259\n86#4,4:274\n90#4,2:284\n94#4:290\n368#5,9:265\n377#5:286\n378#5,2:288\n4034#6,6:278\n*S KotlinDebug\n*F\n+ 1 SelectableLazyColumn.kt\norg/jetbrains/jewel/foundation/lazy/SelectableLazyColumnKt$appendEntry$4\n*L\n167#1:246,6\n170#1:252\n170#1:253,6\n170#1:287\n170#1:291\n170#1:259,6\n170#1:274,4\n170#1:284,2\n170#1:290\n170#1:265,9\n170#1:286\n170#1:288,2\n170#1:278,6\n*E\n"})
final class SelectableLazyColumnKt$appendEntry$4 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
  @Composable
  @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
  public final void invoke(LazyItemScope $this$items, int index, Composer $composer, int $changed) {
    // Byte code:
    //   0: aload_1
    //   1: ldc '$this$items'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: iload #4
    //   8: istore #5
    //   10: iload #4
    //   12: bipush #6
    //   14: iand
    //   15: ifne -> 38
    //   18: iload #5
    //   20: aload_3
    //   21: aload_1
    //   22: invokeinterface changed : (Ljava/lang/Object;)Z
    //   27: ifeq -> 34
    //   30: iconst_4
    //   31: goto -> 35
    //   34: iconst_2
    //   35: ior
    //   36: istore #5
    //   38: iload #4
    //   40: bipush #48
    //   42: iand
    //   43: ifne -> 68
    //   46: iload #5
    //   48: aload_3
    //   49: iload_2
    //   50: invokeinterface changed : (I)Z
    //   55: ifeq -> 63
    //   58: bipush #32
    //   60: goto -> 65
    //   63: bipush #16
    //   65: ior
    //   66: istore #5
    //   68: iload #5
    //   70: sipush #147
    //   73: iand
    //   74: sipush #146
    //   77: if_icmpne -> 89
    //   80: aload_3
    //   81: invokeinterface getSkipping : ()Z
    //   86: ifne -> 828
    //   89: invokestatic isTraceInProgress : ()Z
    //   92: ifeq -> 105
    //   95: ldc -884262318
    //   97: iload #5
    //   99: iconst_m1
    //   100: ldc 'org.jetbrains.jewel.foundation.lazy.appendEntry.<anonymous> (SelectableLazyColumn.kt:166)'
    //   102: invokestatic traceEventStart : (IIILjava/lang/String;)V
    //   105: aload_0
    //   106: getfield $entry : Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry;
    //   109: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry$Items
    //   112: astore #7
    //   114: aload_3
    //   115: ldc 1460909334
    //   117: invokeinterface startReplaceGroup : (I)V
    //   122: aload_3
    //   123: astore #9
    //   125: aload_3
    //   126: aload #7
    //   128: invokeinterface changed : (Ljava/lang/Object;)Z
    //   133: iload #5
    //   135: bipush #112
    //   137: iand
    //   138: bipush #32
    //   140: if_icmpne -> 147
    //   143: iconst_1
    //   144: goto -> 148
    //   147: iconst_0
    //   148: ior
    //   149: istore #10
    //   151: aload_0
    //   152: getfield $entry : Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry;
    //   155: astore #11
    //   157: iconst_0
    //   158: istore #12
    //   160: aload #9
    //   162: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   167: astore #13
    //   169: iconst_0
    //   170: istore #14
    //   172: iload #10
    //   174: ifne -> 188
    //   177: aload #13
    //   179: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
    //   182: invokevirtual getEmpty : ()Ljava/lang/Object;
    //   185: if_acmpne -> 224
    //   188: iconst_0
    //   189: istore #15
    //   191: aload #11
    //   193: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry$Items
    //   196: invokevirtual getKey : ()Lkotlin/jvm/functions/Function1;
    //   199: iload_2
    //   200: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   203: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   208: astore #16
    //   210: aload #9
    //   212: aload #16
    //   214: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   219: aload #16
    //   221: goto -> 226
    //   224: aload #13
    //   226: nop
    //   227: nop
    //   228: nop
    //   229: astore #8
    //   231: aload_3
    //   232: invokeinterface endReplaceGroup : ()V
    //   237: aload #8
    //   239: astore #6
    //   241: aload_1
    //   242: aload_0
    //   243: getfield $state : Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
    //   246: invokevirtual getSelectedKeys : ()Ljava/util/Set;
    //   249: aload #6
    //   251: invokeinterface contains : (Ljava/lang/Object;)Z
    //   256: aload_0
    //   257: getfield $isFocused : Z
    //   260: aload_3
    //   261: bipush #14
    //   263: iload #5
    //   265: iand
    //   266: iconst_0
    //   267: invokestatic SelectableLazyItemScope : (Landroidx/compose/foundation/lazy/LazyItemScope;ZZLandroidx/compose/runtime/Composer;II)Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyItemScope;
    //   270: astore #7
    //   272: aload_0
    //   273: getfield $isKeySelectable : Lkotlin/jvm/functions/Function1;
    //   276: aload #6
    //   278: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   283: checkcast java/lang/Boolean
    //   286: invokevirtual booleanValue : ()Z
    //   289: ifeq -> 770
    //   292: aload_3
    //   293: ldc -1956252035
    //   295: invokeinterface startReplaceGroup : (I)V
    //   300: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
    //   303: checkcast androidx/compose/ui/Modifier
    //   306: aload_0
    //   307: getfield $focusRequester : Landroidx/compose/ui/focus/FocusRequester;
    //   310: aload_0
    //   311: getfield $keyActions : Lorg/jetbrains/jewel/foundation/lazy/tree/KeyActions;
    //   314: invokeinterface getKeybindings : ()Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;
    //   319: aload_0
    //   320: getfield $pointerEventActions : Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;
    //   323: aload_0
    //   324: getfield $selectionMode : Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;
    //   327: aload_0
    //   328: getfield $state : Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
    //   331: aload_0
    //   332: getfield $keys : Ljava/util/List;
    //   335: aload_0
    //   336: getfield $entry : Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry;
    //   339: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry$Items
    //   342: invokevirtual getKey : ()Lkotlin/jvm/functions/Function1;
    //   345: iload_2
    //   346: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   349: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   354: invokestatic access$selectable : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Ljava/util/List;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;
    //   357: astore #8
    //   359: aload_0
    //   360: getfield $entry : Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry;
    //   363: astore #11
    //   365: iconst_0
    //   366: istore #12
    //   368: iconst_0
    //   369: istore #13
    //   371: aload_3
    //   372: ldc 733328855
    //   374: ldc 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
    //   376: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   379: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
    //   382: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
    //   385: astore #9
    //   387: iconst_0
    //   388: istore #10
    //   390: aload #9
    //   392: iload #10
    //   394: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
    //   397: astore #14
    //   399: bipush #112
    //   401: iload #12
    //   403: iconst_3
    //   404: ishl
    //   405: iand
    //   406: istore #15
    //   408: nop
    //   409: iconst_0
    //   410: istore #16
    //   412: aload_3
    //   413: ldc -1323940314
    //   415: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
    //   417: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   420: aload_3
    //   421: iconst_0
    //   422: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
    //   425: istore #17
    //   427: aload_3
    //   428: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
    //   433: astore #18
    //   435: aload_3
    //   436: aload #8
    //   438: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    //   441: astore #19
    //   443: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   446: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
    //   449: astore #20
    //   451: bipush #6
    //   453: sipush #896
    //   456: iload #15
    //   458: bipush #6
    //   460: ishl
    //   461: iand
    //   462: ior
    //   463: istore #21
    //   465: nop
    //   466: iconst_0
    //   467: istore #22
    //   469: aload_3
    //   470: ldc -692256719
    //   472: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
    //   474: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   477: aload_3
    //   478: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
    //   483: instanceof androidx/compose/runtime/Applier
    //   486: ifne -> 492
    //   489: invokestatic invalidApplier : ()V
    //   492: aload_3
    //   493: invokeinterface startReusableNode : ()V
    //   498: aload_3
    //   499: invokeinterface getInserting : ()Z
    //   504: ifeq -> 518
    //   507: aload_3
    //   508: aload #20
    //   510: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
    //   515: goto -> 524
    //   518: aload_3
    //   519: invokeinterface useNode : ()V
    //   524: aload_3
    //   525: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
    //   528: astore #23
    //   530: iconst_0
    //   531: istore #24
    //   533: aload #23
    //   535: aload #14
    //   537: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   540: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
    //   543: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   546: aload #23
    //   548: aload #18
    //   550: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   553: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
    //   556: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   559: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   562: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
    //   565: astore #25
    //   567: iconst_0
    //   568: istore #26
    //   570: aload #23
    //   572: astore #27
    //   574: iconst_0
    //   575: istore #28
    //   577: aload #27
    //   579: invokeinterface getInserting : ()Z
    //   584: ifne -> 605
    //   587: aload #27
    //   589: invokeinterface rememberedValue : ()Ljava/lang/Object;
    //   594: iload #17
    //   596: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   599: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   602: ifne -> 631
    //   605: aload #27
    //   607: iload #17
    //   609: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   612: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
    //   617: aload #23
    //   619: iload #17
    //   621: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   624: aload #25
    //   626: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   631: nop
    //   632: nop
    //   633: nop
    //   634: aload #23
    //   636: aload #19
    //   638: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
    //   641: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
    //   644: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
    //   647: nop
    //   648: nop
    //   649: aload_3
    //   650: bipush #14
    //   652: iload #21
    //   654: bipush #6
    //   656: ishr
    //   657: iand
    //   658: istore #29
    //   660: astore #30
    //   662: iconst_0
    //   663: istore #31
    //   665: aload #30
    //   667: ldc_w -2146769399
    //   670: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
    //   673: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
    //   676: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
    //   679: aload #30
    //   681: bipush #6
    //   683: bipush #112
    //   685: iload #12
    //   687: bipush #6
    //   689: ishr
    //   690: iand
    //   691: ior
    //   692: istore #32
    //   694: astore #33
    //   696: checkcast androidx/compose/foundation/layout/BoxScope
    //   699: astore #34
    //   701: iconst_0
    //   702: istore #35
    //   704: aload #11
    //   706: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry$Items
    //   709: invokevirtual getItemContent : ()Lkotlin/jvm/functions/Function4;
    //   712: aload #7
    //   714: iload_2
    //   715: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   718: aload #33
    //   720: bipush #112
    //   722: iload #5
    //   724: iand
    //   725: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   728: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   733: pop
    //   734: nop
    //   735: aload #30
    //   737: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   740: aload_3
    //   741: invokeinterface endNode : ()V
    //   746: aload_3
    //   747: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   750: nop
    //   751: aload_3
    //   752: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   755: nop
    //   756: aload_3
    //   757: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
    //   760: nop
    //   761: aload_3
    //   762: invokeinterface endReplaceGroup : ()V
    //   767: goto -> 816
    //   770: aload_3
    //   771: ldc_w -1955572763
    //   774: invokeinterface startReplaceGroup : (I)V
    //   779: aload_0
    //   780: getfield $entry : Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry;
    //   783: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry$Items
    //   786: invokevirtual getItemContent : ()Lkotlin/jvm/functions/Function4;
    //   789: aload #7
    //   791: iload_2
    //   792: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   795: aload_3
    //   796: bipush #112
    //   798: iload #5
    //   800: iand
    //   801: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   804: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   809: pop
    //   810: aload_3
    //   811: invokeinterface endReplaceGroup : ()V
    //   816: invokestatic isTraceInProgress : ()Z
    //   819: ifeq -> 834
    //   822: invokestatic traceEventEnd : ()V
    //   825: goto -> 834
    //   828: aload_3
    //   829: invokeinterface skipToGroupEnd : ()V
    //   834: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #167	-> 68
    //   #246	-> 160
    //   #247	-> 172
    //   #248	-> 188
    //   #167	-> 191
    //   #248	-> 208
    //   #249	-> 210
    //   #250	-> 219
    //   #251	-> 224
    //   #247	-> 226
    //   #246	-> 227
    //   #246	-> 228
    //   #167	-> 229
    //   #168	-> 241
    //   #169	-> 272
    //   #172	-> 300
    //   #173	-> 306
    //   #174	-> 310
    //   #175	-> 319
    //   #176	-> 323
    //   #177	-> 327
    //   #178	-> 331
    //   #179	-> 335
    //   #172	-> 354
    //   #170	-> 359
    //   #252	-> 376
    //   #253	-> 379
    //   #254	-> 387
    //   #257	-> 390
    //   #258	-> 408
    //   #259	-> 417
    //   #260	-> 422
    //   #261	-> 428
    //   #262	-> 436
    //   #264	-> 443
    //   #263	-> 465
    //   #265	-> 474
    //   #266	-> 477
    //   #267	-> 493
    //   #268	-> 498
    //   #269	-> 508
    //   #271	-> 519
    //   #273	-> 524
    //   #274	-> 533
    //   #275	-> 546
    //   #277	-> 559
    //   #278	-> 570
    //   #279	-> 577
    //   #280	-> 605
    //   #281	-> 617
    //   #283	-> 631
    //   #278	-> 632
    //   #283	-> 633
    //   #284	-> 634
    //   #285	-> 647
    //   #273	-> 648
    //   #286	-> 649
    //   #287	-> 673
    //   #182	-> 704
    //   #183	-> 734
    //   #287	-> 735
    //   #286	-> 740
    //   #288	-> 741
    //   #265	-> 747
    //   #289	-> 750
    //   #259	-> 752
    //   #290	-> 755
    //   #252	-> 757
    //   #291	-> 760
    //   #169	-> 761
    //   #184	-> 770
    //   #185	-> 779
    //   #184	-> 810
    //   #186	-> 828
    //   #187	-> 834
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   191	17	15	$i$a$-cache-SelectableLazyColumnKt$appendEntry$4$key$1	I
    //   210	11	16	value$iv	Ljava/lang/Object;
    //   172	55	14	$i$a$-let-ComposerKt$cache$1$iv	I
    //   169	58	13	it$iv	Ljava/lang/Object;
    //   160	69	12	$i$f$cache	I
    //   157	72	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
    //   157	72	10	invalid$iv	Z
    //   704	31	35	$i$a$-Box-SelectableLazyColumnKt$appendEntry$4$1	I
    //   701	34	34	$this$invoke_u24lambda_u241	Landroidx/compose/foundation/layout/BoxScope;
    //   701	34	33	$composer	Landroidx/compose/runtime/Composer;
    //   701	34	32	$changed	I
    //   665	75	31	$i$a$-Layout-BoxKt$Box$1$iv	I
    //   662	78	30	$composer$iv	Landroidx/compose/runtime/Composer;
    //   662	78	29	$changed$iv	I
    //   577	55	28	$i$a$-with-Updater$set$1$iv$iv$iv	I
    //   574	58	27	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
    //   570	64	26	$i$f$set-impl	I
    //   567	67	25	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
    //   533	115	24	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
    //   530	118	23	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
    //   469	282	22	$i$f$ReusableComposeNode	I
    //   466	285	20	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
    //   466	285	21	$changed$iv$iv$iv	I
    //   412	344	16	$i$f$Layout	I
    //   427	329	17	compositeKeyHash$iv$iv	I
    //   435	321	18	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
    //   443	313	19	materialized$iv$iv	Landroidx/compose/ui/Modifier;
    //   409	347	15	$changed$iv$iv	I
    //   371	390	13	$i$f$Box	I
    //   399	362	14	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
    //   368	393	8	modifier$iv	Landroidx/compose/ui/Modifier;
    //   387	374	9	contentAlignment$iv	Landroidx/compose/ui/Alignment;
    //   390	371	10	propagateMinConstraints$iv	Z
    //   368	393	12	$changed$iv	I
    //   241	584	6	key	Ljava/lang/Object;
    //   272	553	7	itemScope	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyItemScope;
    //   10	825	5	$dirty	I
    //   0	835	0	this	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyColumnKt$appendEntry$4;
    //   0	835	1	$this$items	Landroidx/compose/foundation/lazy/LazyItemScope;
    //   0	835	2	index	I
    //   0	835	3	$composer	Landroidx/compose/runtime/Composer;
    //   0	835	4	$changed	I
  }
  
  SelectableLazyColumnKt$appendEntry$4(SelectableLazyListScopeContainer.Entry $entry, SelectableLazyListState $state, boolean $isFocused, Function1<Object, Boolean> $isKeySelectable, FocusRequester $focusRequester, KeyActions $keyActions, PointerEventActions $pointerEventActions, SelectionMode $selectionMode, List<SelectableLazyListKey> $keys) {}
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\SelectableLazyColumnKt$appendEntry$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */