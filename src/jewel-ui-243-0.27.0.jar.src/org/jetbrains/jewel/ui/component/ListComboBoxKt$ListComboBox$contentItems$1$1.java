/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.State;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import kotlin.jvm.functions.Function7;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyItemScope;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nListComboBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListComboBox.kt\norg/jetbrains/jewel/ui/component/ListComboBoxKt$ListComboBox$contentItems$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,238:1\n1225#2,6:239\n1225#2,6:245\n71#3:251\n68#3,6:252\n74#3:286\n78#3:290\n79#4,6:258\n86#4,4:273\n90#4,2:283\n94#4:289\n368#5,9:264\n377#5:285\n378#5,2:287\n4034#6,6:277\n81#7:291\n107#7,2:292\n*S KotlinDebug\n*F\n+ 1 ListComboBox.kt\norg/jetbrains/jewel/ui/component/ListComboBoxKt$ListComboBox$contentItems$1$1\n*L\n102#1:239,6\n105#1:245,6\n103#1:251\n103#1:252,6\n103#1:286\n103#1:290\n103#1:258,6\n103#1:273,4\n103#1:283,2\n103#1:289\n103#1:264,9\n103#1:285\n103#1:287,2\n103#1:277,6\n102#1:291\n102#1:292,2\n*E\n"})
/*     */ final class ListComboBoxKt$ListComboBox$contentItems$1$1
/*     */   implements Function4<SelectableLazyItemScope, String, Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(SelectableLazyItemScope $this$items, String item, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc '$this$items'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'item'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: iload #4
/*     */     //   14: istore #5
/*     */     //   16: iload #4
/*     */     //   18: bipush #6
/*     */     //   20: iand
/*     */     //   21: ifne -> 44
/*     */     //   24: iload #5
/*     */     //   26: aload_3
/*     */     //   27: aload_1
/*     */     //   28: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   33: ifeq -> 40
/*     */     //   36: iconst_4
/*     */     //   37: goto -> 41
/*     */     //   40: iconst_2
/*     */     //   41: ior
/*     */     //   42: istore #5
/*     */     //   44: iload #4
/*     */     //   46: bipush #48
/*     */     //   48: iand
/*     */     //   49: ifne -> 74
/*     */     //   52: iload #5
/*     */     //   54: aload_3
/*     */     //   55: aload_2
/*     */     //   56: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   61: ifeq -> 69
/*     */     //   64: bipush #32
/*     */     //   66: goto -> 71
/*     */     //   69: bipush #16
/*     */     //   71: ior
/*     */     //   72: istore #5
/*     */     //   74: iload #5
/*     */     //   76: sipush #147
/*     */     //   79: iand
/*     */     //   80: sipush #146
/*     */     //   83: if_icmpne -> 95
/*     */     //   86: aload_3
/*     */     //   87: invokeinterface getSkipping : ()Z
/*     */     //   92: ifne -> 861
/*     */     //   95: invokestatic isTraceInProgress : ()Z
/*     */     //   98: ifeq -> 111
/*     */     //   101: ldc -34086440
/*     */     //   103: iload #5
/*     */     //   105: iconst_m1
/*     */     //   106: ldc 'org.jetbrains.jewel.ui.component.ListComboBox.contentItems.<anonymous>.<anonymous> (ListComboBox.kt:101)'
/*     */     //   108: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   111: aload_3
/*     */     //   112: ldc -666838276
/*     */     //   114: invokeinterface startReplaceGroup : (I)V
/*     */     //   119: aload_3
/*     */     //   120: astore #8
/*     */     //   122: iconst_0
/*     */     //   123: istore #9
/*     */     //   125: iconst_0
/*     */     //   126: istore #10
/*     */     //   128: aload #8
/*     */     //   130: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   135: astore #11
/*     */     //   137: iconst_0
/*     */     //   138: istore #12
/*     */     //   140: aload #11
/*     */     //   142: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   145: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   148: if_acmpne -> 180
/*     */     //   151: iconst_0
/*     */     //   152: istore #13
/*     */     //   154: iconst_0
/*     */     //   155: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   158: aconst_null
/*     */     //   159: iconst_2
/*     */     //   160: aconst_null
/*     */     //   161: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   164: astore #13
/*     */     //   166: aload #8
/*     */     //   168: aload #13
/*     */     //   170: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   175: aload #13
/*     */     //   177: goto -> 182
/*     */     //   180: aload #11
/*     */     //   182: nop
/*     */     //   183: nop
/*     */     //   184: nop
/*     */     //   185: checkcast androidx/compose/runtime/MutableState
/*     */     //   188: astore #7
/*     */     //   190: aload_3
/*     */     //   191: invokeinterface endReplaceGroup : ()V
/*     */     //   196: aload #7
/*     */     //   198: astore #6
/*     */     //   200: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   203: checkcast androidx/compose/ui/Modifier
/*     */     //   206: aload_3
/*     */     //   207: ldc -666833936
/*     */     //   209: invokeinterface startReplaceGroup : (I)V
/*     */     //   214: aload_3
/*     */     //   215: astore #8
/*     */     //   217: aload_3
/*     */     //   218: aload_0
/*     */     //   219: getfield $items : Ljava/util/List;
/*     */     //   222: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   227: iload #5
/*     */     //   229: bipush #112
/*     */     //   231: iand
/*     */     //   232: bipush #32
/*     */     //   234: if_icmpne -> 241
/*     */     //   237: iconst_1
/*     */     //   238: goto -> 242
/*     */     //   241: iconst_0
/*     */     //   242: ior
/*     */     //   243: aload_3
/*     */     //   244: aload_0
/*     */     //   245: getfield $onHoverItemChange : Lkotlin/jvm/functions/Function1;
/*     */     //   248: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   253: ior
/*     */     //   254: istore #9
/*     */     //   256: aload_0
/*     */     //   257: getfield $items : Ljava/util/List;
/*     */     //   260: astore #10
/*     */     //   262: aload_0
/*     */     //   263: getfield $onHoverItemChange : Lkotlin/jvm/functions/Function1;
/*     */     //   266: astore #11
/*     */     //   268: aload_0
/*     */     //   269: getfield $hoverItemIndex$delegate : Landroidx/compose/runtime/MutableState;
/*     */     //   272: astore #12
/*     */     //   274: iconst_0
/*     */     //   275: istore #13
/*     */     //   277: aload #8
/*     */     //   279: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   284: astore #14
/*     */     //   286: iconst_0
/*     */     //   287: istore #15
/*     */     //   289: iload #9
/*     */     //   291: ifne -> 305
/*     */     //   294: aload #14
/*     */     //   296: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   299: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   302: if_acmpne -> 343
/*     */     //   305: astore #37
/*     */     //   307: iconst_0
/*     */     //   308: istore #16
/*     */     //   310: aload #10
/*     */     //   312: aload_2
/*     */     //   313: aload #11
/*     */     //   315: aload #6
/*     */     //   317: aload #12
/*     */     //   319: <illegal opcode> invoke : (Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   324: aload #37
/*     */     //   326: swap
/*     */     //   327: astore #17
/*     */     //   329: aload #8
/*     */     //   331: aload #17
/*     */     //   333: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   338: aload #17
/*     */     //   340: goto -> 345
/*     */     //   343: aload #14
/*     */     //   345: nop
/*     */     //   346: nop
/*     */     //   347: nop
/*     */     //   348: checkcast kotlin/jvm/functions/Function1
/*     */     //   351: astore #7
/*     */     //   353: aload_3
/*     */     //   354: invokeinterface endReplaceGroup : ()V
/*     */     //   359: aload #7
/*     */     //   361: invokestatic onHover : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   364: astore #7
/*     */     //   366: aload_0
/*     */     //   367: getfield $listItemContent : Lkotlin/jvm/functions/Function7;
/*     */     //   370: astore #10
/*     */     //   372: aload_0
/*     */     //   373: getfield $items : Ljava/util/List;
/*     */     //   376: astore #11
/*     */     //   378: aload_0
/*     */     //   379: getfield $hoverItemIndex$delegate : Landroidx/compose/runtime/MutableState;
/*     */     //   382: astore #12
/*     */     //   384: iconst_0
/*     */     //   385: istore #13
/*     */     //   387: iconst_0
/*     */     //   388: istore #14
/*     */     //   390: aload_3
/*     */     //   391: ldc 733328855
/*     */     //   393: ldc 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   395: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   398: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   401: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   404: astore #8
/*     */     //   406: iconst_0
/*     */     //   407: istore #9
/*     */     //   409: aload #8
/*     */     //   411: iload #9
/*     */     //   413: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   416: astore #15
/*     */     //   418: bipush #112
/*     */     //   420: iload #13
/*     */     //   422: iconst_3
/*     */     //   423: ishl
/*     */     //   424: iand
/*     */     //   425: istore #16
/*     */     //   427: nop
/*     */     //   428: iconst_0
/*     */     //   429: istore #17
/*     */     //   431: aload_3
/*     */     //   432: ldc -1323940314
/*     */     //   434: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   436: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   439: aload_3
/*     */     //   440: iconst_0
/*     */     //   441: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   444: istore #18
/*     */     //   446: aload_3
/*     */     //   447: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   452: astore #19
/*     */     //   454: aload_3
/*     */     //   455: aload #7
/*     */     //   457: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   460: astore #20
/*     */     //   462: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   465: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   468: astore #21
/*     */     //   470: bipush #6
/*     */     //   472: sipush #896
/*     */     //   475: iload #16
/*     */     //   477: bipush #6
/*     */     //   479: ishl
/*     */     //   480: iand
/*     */     //   481: ior
/*     */     //   482: istore #22
/*     */     //   484: nop
/*     */     //   485: iconst_0
/*     */     //   486: istore #23
/*     */     //   488: aload_3
/*     */     //   489: ldc -692256719
/*     */     //   491: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   493: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   496: aload_3
/*     */     //   497: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   502: instanceof androidx/compose/runtime/Applier
/*     */     //   505: ifne -> 511
/*     */     //   508: invokestatic invalidApplier : ()V
/*     */     //   511: aload_3
/*     */     //   512: invokeinterface startReusableNode : ()V
/*     */     //   517: aload_3
/*     */     //   518: invokeinterface getInserting : ()Z
/*     */     //   523: ifeq -> 537
/*     */     //   526: aload_3
/*     */     //   527: aload #21
/*     */     //   529: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   534: goto -> 543
/*     */     //   537: aload_3
/*     */     //   538: invokeinterface useNode : ()V
/*     */     //   543: aload_3
/*     */     //   544: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   547: astore #24
/*     */     //   549: iconst_0
/*     */     //   550: istore #25
/*     */     //   552: aload #24
/*     */     //   554: aload #15
/*     */     //   556: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   559: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   562: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   565: aload #24
/*     */     //   567: aload #19
/*     */     //   569: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   572: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   575: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   578: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   581: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   584: astore #26
/*     */     //   586: iconst_0
/*     */     //   587: istore #27
/*     */     //   589: aload #24
/*     */     //   591: astore #28
/*     */     //   593: iconst_0
/*     */     //   594: istore #29
/*     */     //   596: aload #28
/*     */     //   598: invokeinterface getInserting : ()Z
/*     */     //   603: ifne -> 624
/*     */     //   606: aload #28
/*     */     //   608: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   613: iload #18
/*     */     //   615: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   618: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   621: ifne -> 650
/*     */     //   624: aload #28
/*     */     //   626: iload #18
/*     */     //   628: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   631: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   636: aload #24
/*     */     //   638: iload #18
/*     */     //   640: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   643: aload #26
/*     */     //   645: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   650: nop
/*     */     //   651: nop
/*     */     //   652: nop
/*     */     //   653: aload #24
/*     */     //   655: aload #20
/*     */     //   657: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   660: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   663: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   666: nop
/*     */     //   667: nop
/*     */     //   668: aload_3
/*     */     //   669: bipush #14
/*     */     //   671: iload #22
/*     */     //   673: bipush #6
/*     */     //   675: ishr
/*     */     //   676: iand
/*     */     //   677: istore #30
/*     */     //   679: astore #31
/*     */     //   681: iconst_0
/*     */     //   682: istore #32
/*     */     //   684: aload #31
/*     */     //   686: ldc_w -2146769399
/*     */     //   689: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   692: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   695: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   698: aload #31
/*     */     //   700: bipush #6
/*     */     //   702: bipush #112
/*     */     //   704: iload #13
/*     */     //   706: bipush #6
/*     */     //   708: ishr
/*     */     //   709: iand
/*     */     //   710: ior
/*     */     //   711: istore #33
/*     */     //   713: astore #34
/*     */     //   715: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   718: astore #35
/*     */     //   720: iconst_0
/*     */     //   721: istore #36
/*     */     //   723: aload #10
/*     */     //   725: aload_2
/*     */     //   726: aload_1
/*     */     //   727: invokeinterface isSelected : ()Z
/*     */     //   732: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   735: aload_1
/*     */     //   736: invokeinterface isActive : ()Z
/*     */     //   741: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   744: aload #6
/*     */     //   746: invokestatic invoke$lambda$1 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   749: ifne -> 780
/*     */     //   752: aload #11
/*     */     //   754: aload_2
/*     */     //   755: invokeinterface indexOf : (Ljava/lang/Object;)I
/*     */     //   760: aload #12
/*     */     //   762: invokestatic access$ListComboBox_Fsagccs$lambda$15 : (Landroidx/compose/runtime/MutableState;)Ljava/lang/Integer;
/*     */     //   765: dup
/*     */     //   766: ifnonnull -> 774
/*     */     //   769: pop
/*     */     //   770: pop
/*     */     //   771: goto -> 784
/*     */     //   774: invokevirtual intValue : ()I
/*     */     //   777: if_icmpne -> 784
/*     */     //   780: iconst_1
/*     */     //   781: goto -> 785
/*     */     //   784: iconst_0
/*     */     //   785: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   788: aload #12
/*     */     //   790: invokestatic access$ListComboBox_Fsagccs$lambda$15 : (Landroidx/compose/runtime/MutableState;)Ljava/lang/Integer;
/*     */     //   793: ifnull -> 800
/*     */     //   796: iconst_1
/*     */     //   797: goto -> 801
/*     */     //   800: iconst_0
/*     */     //   801: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   804: aload #34
/*     */     //   806: bipush #14
/*     */     //   808: iload #5
/*     */     //   810: iconst_3
/*     */     //   811: ishr
/*     */     //   812: iand
/*     */     //   813: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   816: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   821: pop
/*     */     //   822: nop
/*     */     //   823: aload #31
/*     */     //   825: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   828: aload_3
/*     */     //   829: invokeinterface endNode : ()V
/*     */     //   834: aload_3
/*     */     //   835: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   838: nop
/*     */     //   839: aload_3
/*     */     //   840: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   843: nop
/*     */     //   844: aload_3
/*     */     //   845: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   848: nop
/*     */     //   849: invokestatic isTraceInProgress : ()Z
/*     */     //   852: ifeq -> 867
/*     */     //   855: invokestatic traceEventEnd : ()V
/*     */     //   858: goto -> 867
/*     */     //   861: aload_3
/*     */     //   862: invokeinterface skipToGroupEnd : ()V
/*     */     //   867: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #102	-> 74
/*     */     //   #239	-> 128
/*     */     //   #240	-> 140
/*     */     //   #241	-> 151
/*     */     //   #102	-> 154
/*     */     //   #241	-> 164
/*     */     //   #242	-> 166
/*     */     //   #243	-> 175
/*     */     //   #244	-> 180
/*     */     //   #240	-> 182
/*     */     //   #239	-> 183
/*     */     //   #239	-> 184
/*     */     //   #102	-> 185
/*     */     //   #105	-> 200
/*     */     //   #245	-> 277
/*     */     //   #246	-> 289
/*     */     //   #247	-> 305
/*     */     //   #105	-> 310
/*     */     //   #247	-> 327
/*     */     //   #248	-> 329
/*     */     //   #249	-> 338
/*     */     //   #250	-> 343
/*     */     //   #246	-> 345
/*     */     //   #245	-> 346
/*     */     //   #245	-> 347
/*     */     //   #105	-> 348
/*     */     //   #103	-> 366
/*     */     //   #251	-> 395
/*     */     //   #252	-> 398
/*     */     //   #253	-> 406
/*     */     //   #256	-> 409
/*     */     //   #257	-> 427
/*     */     //   #258	-> 436
/*     */     //   #259	-> 441
/*     */     //   #260	-> 447
/*     */     //   #261	-> 455
/*     */     //   #263	-> 462
/*     */     //   #262	-> 484
/*     */     //   #264	-> 493
/*     */     //   #265	-> 496
/*     */     //   #266	-> 512
/*     */     //   #267	-> 517
/*     */     //   #268	-> 527
/*     */     //   #270	-> 538
/*     */     //   #272	-> 543
/*     */     //   #273	-> 552
/*     */     //   #274	-> 565
/*     */     //   #276	-> 578
/*     */     //   #277	-> 589
/*     */     //   #278	-> 596
/*     */     //   #279	-> 624
/*     */     //   #280	-> 636
/*     */     //   #282	-> 650
/*     */     //   #277	-> 651
/*     */     //   #282	-> 652
/*     */     //   #283	-> 653
/*     */     //   #284	-> 666
/*     */     //   #272	-> 667
/*     */     //   #285	-> 668
/*     */     //   #286	-> 692
/*     */     //   #113	-> 723
/*     */     //   #114	-> 725
/*     */     //   #115	-> 726
/*     */     //   #116	-> 735
/*     */     //   #117	-> 744
/*     */     //   #118	-> 788
/*     */     //   #113	-> 816
/*     */     //   #120	-> 822
/*     */     //   #286	-> 823
/*     */     //   #285	-> 828
/*     */     //   #287	-> 829
/*     */     //   #264	-> 835
/*     */     //   #288	-> 838
/*     */     //   #258	-> 840
/*     */     //   #289	-> 843
/*     */     //   #251	-> 845
/*     */     //   #290	-> 848
/*     */     //   #120	-> 861
/*     */     //   #121	-> 867
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   154	10	13	$i$a$-cache-ListComboBoxKt$ListComboBox$contentItems$1$1$isItemHovered$2	I
/*     */     //   166	11	13	value$iv	Ljava/lang/Object;
/*     */     //   140	43	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   137	46	11	it$iv	Ljava/lang/Object;
/*     */     //   128	57	10	$i$f$cache	I
/*     */     //   125	60	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   125	60	9	invalid$iv	Z
/*     */     //   310	14	16	$i$a$-cache-ListComboBoxKt$ListComboBox$contentItems$1$1$1	I
/*     */     //   329	11	17	value$iv	Ljava/lang/Object;
/*     */     //   289	57	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   286	60	14	it$iv	Ljava/lang/Object;
/*     */     //   277	71	13	$i$f$cache	I
/*     */     //   274	74	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   274	74	9	invalid$iv	Z
/*     */     //   723	100	36	$i$a$-Box-ListComboBoxKt$ListComboBox$contentItems$1$1$2	I
/*     */     //   720	103	35	$this$invoke_u24lambda_u245	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   720	103	34	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   720	103	33	$changed	I
/*     */     //   684	144	32	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   681	147	31	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   681	147	30	$changed$iv	I
/*     */     //   596	55	29	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   593	58	28	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   589	64	27	$i$f$set-impl	I
/*     */     //   586	67	26	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   552	115	25	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   549	118	24	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   488	351	23	$i$f$ReusableComposeNode	I
/*     */     //   485	354	21	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   485	354	22	$changed$iv$iv$iv	I
/*     */     //   431	413	17	$i$f$Layout	I
/*     */     //   446	398	18	compositeKeyHash$iv$iv	I
/*     */     //   454	390	19	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   462	382	20	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   428	416	16	$changed$iv$iv	I
/*     */     //   390	459	14	$i$f$Box	I
/*     */     //   418	431	15	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   387	462	7	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   406	443	8	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   409	440	9	propagateMinConstraints$iv	Z
/*     */     //   387	462	13	$changed$iv	I
/*     */     //   200	658	6	isItemHovered$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   16	852	5	$dirty	I
/*     */     //   0	868	0	this	Lorg/jetbrains/jewel/ui/component/ListComboBoxKt$ListComboBox$contentItems$1$1;
/*     */     //   0	868	1	$this$items	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyItemScope;
/*     */     //   0	868	2	item	Ljava/lang/String;
/*     */     //   0	868	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	868	4	$changed	I
/*     */   }
/*     */   
/*     */   private static final boolean invoke$lambda$1(MutableState $isItemHovered$delegate) {
/* 102 */     State state = (State)$isItemHovered$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 291 */       (Boolean)state.getValue()).booleanValue(); } private static final void invoke$lambda$2(MutableState $isItemHovered$delegate, boolean <set-?>) { MutableState mutableState = $isItemHovered$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 292 */     mutableState.setValue(value$iv); }
/*     */ 
/*     */   
/*     */   private static final Unit invoke$lambda$4$lambda$3(List $items, String $item, Function1 $onHoverItemChange, MutableState<Boolean> $isItemHovered$delegate, MutableState $hoverItemIndex$delegate, boolean it) {
/*     */     invoke$lambda$2($isItemHovered$delegate, it);
/*     */     if (invoke$lambda$1($isItemHovered$delegate)) {
/*     */       ListComboBoxKt.access$ListComboBox_Fsagccs$lambda$16($hoverItemIndex$delegate, Integer.valueOf($items.indexOf($item)));
/*     */       $onHoverItemChange.invoke($item);
/*     */     } 
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   ListComboBoxKt$ListComboBox$contentItems$1$1(List<String> $items, Function1<String, Unit> $onHoverItemChange, MutableState<Integer> $hoverItemIndex$delegate, Function7<String, Boolean, Boolean, Boolean, Boolean, Composer, Integer, Unit> $listItemContent) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ListComboBoxKt$ListComboBox$contentItems$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */