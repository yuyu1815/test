/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*     */ 
/*     */ import androidx.compose.animation.AnimatedVisibilityScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.text.TextLayoutResult;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\020\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\013\032+\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0032\f\020\005\032\b\022\004\022\0020\0010\006H\007¢\006\002\020\007¨\006\b²\006\n\020\t\032\0020\nX\002"}, d2 = {"ChatResponseTextContainer", "", "markdown", "", "actionText", "onActionClicked", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "standalone", "isOverflowing", ""})
/*     */ @SourceDebugExtension({"SMAP\nChatResponseTextContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatResponseTextContainer.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/ChatResponseTextContainerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,61:1\n1225#2,6:62\n1225#2,6:68\n149#3:74\n86#4:75\n82#4,7:76\n89#4:111\n93#4:155\n79#5,6:83\n86#5,4:98\n90#5,2:108\n79#5,6:119\n86#5,4:134\n90#5,2:144\n94#5:150\n94#5:154\n368#6,9:89\n377#6:110\n368#6,9:125\n377#6:146\n378#6,2:148\n378#6,2:152\n4034#7,6:102\n4034#7,6:138\n71#8:112\n68#8,6:113\n74#8:147\n78#8:151\n81#9:156\n107#9,2:157\n*S KotlinDebug\n*F\n+ 1 ChatResponseTextContainer.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/ChatResponseTextContainerKt\n*L\n29#1:62,6\n32#1:68,6\n36#1:74\n36#1:75\n36#1:76,7\n36#1:111\n36#1:155\n36#1:83,6\n36#1:98,4\n36#1:108,2\n37#1:119,6\n37#1:134,4\n37#1:144,2\n37#1:150\n36#1:154\n36#1:89,9\n36#1:110\n37#1:125,9\n37#1:146\n37#1:148,2\n36#1:152,2\n36#1:102,6\n37#1:138,6\n37#1:112\n37#1:113,6\n37#1:147\n37#1:151\n29#1:156\n29#1:157,2\n*E\n"})
/*     */ public final class ChatResponseTextContainerKt {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void ChatResponseTextContainer(@NotNull String markdown, @NotNull String actionText, @NotNull Function0 onActionClicked, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'markdown'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'actionText'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: ldc 'onActionClicked'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload_3
/*     */     //   19: ldc -676504119
/*     */     //   21: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   26: astore_3
/*     */     //   27: iload #4
/*     */     //   29: istore #5
/*     */     //   31: iload #4
/*     */     //   33: bipush #6
/*     */     //   35: iand
/*     */     //   36: ifne -> 59
/*     */     //   39: iload #5
/*     */     //   41: aload_3
/*     */     //   42: aload_0
/*     */     //   43: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   48: ifeq -> 55
/*     */     //   51: iconst_4
/*     */     //   52: goto -> 56
/*     */     //   55: iconst_2
/*     */     //   56: ior
/*     */     //   57: istore #5
/*     */     //   59: iload #4
/*     */     //   61: bipush #48
/*     */     //   63: iand
/*     */     //   64: ifne -> 89
/*     */     //   67: iload #5
/*     */     //   69: aload_3
/*     */     //   70: aload_1
/*     */     //   71: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   76: ifeq -> 84
/*     */     //   79: bipush #32
/*     */     //   81: goto -> 86
/*     */     //   84: bipush #16
/*     */     //   86: ior
/*     */     //   87: istore #5
/*     */     //   89: iload #4
/*     */     //   91: sipush #384
/*     */     //   94: iand
/*     */     //   95: ifne -> 122
/*     */     //   98: iload #5
/*     */     //   100: aload_3
/*     */     //   101: aload_2
/*     */     //   102: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   107: ifeq -> 116
/*     */     //   110: sipush #256
/*     */     //   113: goto -> 119
/*     */     //   116: sipush #128
/*     */     //   119: ior
/*     */     //   120: istore #5
/*     */     //   122: iload #5
/*     */     //   124: sipush #147
/*     */     //   127: iand
/*     */     //   128: sipush #146
/*     */     //   131: if_icmpne -> 143
/*     */     //   134: aload_3
/*     */     //   135: invokeinterface getSkipping : ()Z
/*     */     //   140: ifne -> 1300
/*     */     //   143: invokestatic isTraceInProgress : ()Z
/*     */     //   146: ifeq -> 159
/*     */     //   149: ldc -676504119
/*     */     //   151: iload #5
/*     */     //   153: iconst_m1
/*     */     //   154: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.ChatResponseTextContainer (ChatResponseTextContainer.kt:25)'
/*     */     //   156: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   159: sipush #400
/*     */     //   162: istore #6
/*     */     //   164: aload_0
/*     */     //   165: invokevirtual length : ()I
/*     */     //   168: iload #6
/*     */     //   170: if_icmple -> 177
/*     */     //   173: iconst_1
/*     */     //   174: goto -> 178
/*     */     //   177: iconst_0
/*     */     //   178: istore #7
/*     */     //   180: aload_3
/*     */     //   181: ldc -181460417
/*     */     //   183: invokeinterface startReplaceGroup : (I)V
/*     */     //   188: aload_3
/*     */     //   189: astore #10
/*     */     //   191: iconst_0
/*     */     //   192: istore #11
/*     */     //   194: nop
/*     */     //   195: iconst_0
/*     */     //   196: istore #12
/*     */     //   198: aload #10
/*     */     //   200: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   205: astore #13
/*     */     //   207: iconst_0
/*     */     //   208: istore #14
/*     */     //   210: aload #13
/*     */     //   212: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   215: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   218: if_acmpne -> 251
/*     */     //   221: iconst_0
/*     */     //   222: istore #15
/*     */     //   224: iload #7
/*     */     //   226: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   229: aconst_null
/*     */     //   230: iconst_2
/*     */     //   231: aconst_null
/*     */     //   232: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   235: astore #16
/*     */     //   237: aload #10
/*     */     //   239: aload #16
/*     */     //   241: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   246: aload #16
/*     */     //   248: goto -> 253
/*     */     //   251: aload #13
/*     */     //   253: nop
/*     */     //   254: nop
/*     */     //   255: nop
/*     */     //   256: checkcast androidx/compose/runtime/MutableState
/*     */     //   259: astore #9
/*     */     //   261: aload_3
/*     */     //   262: invokeinterface endReplaceGroup : ()V
/*     */     //   267: aload #9
/*     */     //   269: astore #8
/*     */     //   271: aload_3
/*     */     //   272: ldc -181458278
/*     */     //   274: invokeinterface startReplaceGroup : (I)V
/*     */     //   279: aload_3
/*     */     //   280: astore #11
/*     */     //   282: iload #5
/*     */     //   284: bipush #14
/*     */     //   286: iand
/*     */     //   287: iconst_4
/*     */     //   288: if_icmpne -> 295
/*     */     //   291: iconst_1
/*     */     //   292: goto -> 296
/*     */     //   295: iconst_0
/*     */     //   296: istore #12
/*     */     //   298: nop
/*     */     //   299: iconst_0
/*     */     //   300: istore #13
/*     */     //   302: aload #11
/*     */     //   304: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   309: astore #14
/*     */     //   311: iconst_0
/*     */     //   312: istore #15
/*     */     //   314: iload #12
/*     */     //   316: ifne -> 330
/*     */     //   319: aload #14
/*     */     //   321: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   324: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   327: if_acmpne -> 369
/*     */     //   330: iconst_0
/*     */     //   331: istore #16
/*     */     //   333: iload #7
/*     */     //   335: ifeq -> 352
/*     */     //   338: aload_0
/*     */     //   339: iload #6
/*     */     //   341: invokestatic take : (Ljava/lang/String;I)Ljava/lang/String;
/*     */     //   344: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   349: goto -> 353
/*     */     //   352: aload_0
/*     */     //   353: astore #17
/*     */     //   355: aload #11
/*     */     //   357: aload #17
/*     */     //   359: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   364: aload #17
/*     */     //   366: goto -> 371
/*     */     //   369: aload #14
/*     */     //   371: nop
/*     */     //   372: nop
/*     */     //   373: nop
/*     */     //   374: checkcast java/lang/String
/*     */     //   377: astore #10
/*     */     //   379: aload_3
/*     */     //   380: invokeinterface endReplaceGroup : ()V
/*     */     //   385: aload #10
/*     */     //   387: astore #9
/*     */     //   389: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   392: bipush #12
/*     */     //   394: istore #11
/*     */     //   396: iconst_0
/*     */     //   397: istore #12
/*     */     //   399: iload #11
/*     */     //   401: i2f
/*     */     //   402: invokestatic constructor-impl : (F)F
/*     */     //   405: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   408: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
/*     */     //   411: astore #11
/*     */     //   413: bipush #48
/*     */     //   415: istore #13
/*     */     //   417: iconst_0
/*     */     //   418: istore #14
/*     */     //   420: aload_3
/*     */     //   421: ldc -483455358
/*     */     //   423: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   425: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   428: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   431: checkcast androidx/compose/ui/Modifier
/*     */     //   434: astore #10
/*     */     //   436: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   439: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   442: astore #12
/*     */     //   444: aload #11
/*     */     //   446: aload #12
/*     */     //   448: aload_3
/*     */     //   449: bipush #14
/*     */     //   451: iload #13
/*     */     //   453: iconst_3
/*     */     //   454: ishr
/*     */     //   455: iand
/*     */     //   456: bipush #112
/*     */     //   458: iload #13
/*     */     //   460: iconst_3
/*     */     //   461: ishr
/*     */     //   462: iand
/*     */     //   463: ior
/*     */     //   464: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   467: astore #15
/*     */     //   469: bipush #112
/*     */     //   471: iload #13
/*     */     //   473: iconst_3
/*     */     //   474: ishl
/*     */     //   475: iand
/*     */     //   476: istore #16
/*     */     //   478: nop
/*     */     //   479: iconst_0
/*     */     //   480: istore #17
/*     */     //   482: aload_3
/*     */     //   483: ldc -1323940314
/*     */     //   485: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   487: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   490: aload_3
/*     */     //   491: iconst_0
/*     */     //   492: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   495: istore #18
/*     */     //   497: aload_3
/*     */     //   498: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   503: astore #19
/*     */     //   505: aload_3
/*     */     //   506: aload #10
/*     */     //   508: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   511: astore #20
/*     */     //   513: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   516: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   519: astore #21
/*     */     //   521: bipush #6
/*     */     //   523: sipush #896
/*     */     //   526: iload #16
/*     */     //   528: bipush #6
/*     */     //   530: ishl
/*     */     //   531: iand
/*     */     //   532: ior
/*     */     //   533: istore #22
/*     */     //   535: nop
/*     */     //   536: iconst_0
/*     */     //   537: istore #23
/*     */     //   539: aload_3
/*     */     //   540: ldc -692256719
/*     */     //   542: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   544: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   547: aload_3
/*     */     //   548: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   553: instanceof androidx/compose/runtime/Applier
/*     */     //   556: ifne -> 562
/*     */     //   559: invokestatic invalidApplier : ()V
/*     */     //   562: aload_3
/*     */     //   563: invokeinterface startReusableNode : ()V
/*     */     //   568: aload_3
/*     */     //   569: invokeinterface getInserting : ()Z
/*     */     //   574: ifeq -> 588
/*     */     //   577: aload_3
/*     */     //   578: aload #21
/*     */     //   580: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   585: goto -> 594
/*     */     //   588: aload_3
/*     */     //   589: invokeinterface useNode : ()V
/*     */     //   594: aload_3
/*     */     //   595: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   598: astore #24
/*     */     //   600: iconst_0
/*     */     //   601: istore #25
/*     */     //   603: aload #24
/*     */     //   605: aload #15
/*     */     //   607: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   610: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   613: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   616: aload #24
/*     */     //   618: aload #19
/*     */     //   620: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   623: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   626: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   629: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   632: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   635: astore #26
/*     */     //   637: iconst_0
/*     */     //   638: istore #27
/*     */     //   640: aload #24
/*     */     //   642: astore #28
/*     */     //   644: iconst_0
/*     */     //   645: istore #29
/*     */     //   647: aload #28
/*     */     //   649: invokeinterface getInserting : ()Z
/*     */     //   654: ifne -> 675
/*     */     //   657: aload #28
/*     */     //   659: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   664: iload #18
/*     */     //   666: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   669: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   672: ifne -> 701
/*     */     //   675: aload #28
/*     */     //   677: iload #18
/*     */     //   679: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   682: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   687: aload #24
/*     */     //   689: iload #18
/*     */     //   691: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   694: aload #26
/*     */     //   696: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   701: nop
/*     */     //   702: nop
/*     */     //   703: nop
/*     */     //   704: aload #24
/*     */     //   706: aload #20
/*     */     //   708: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   711: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   714: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   717: nop
/*     */     //   718: nop
/*     */     //   719: aload_3
/*     */     //   720: bipush #14
/*     */     //   722: iload #22
/*     */     //   724: bipush #6
/*     */     //   726: ishr
/*     */     //   727: iand
/*     */     //   728: istore #30
/*     */     //   730: astore #31
/*     */     //   732: iconst_0
/*     */     //   733: istore #32
/*     */     //   735: aload #31
/*     */     //   737: ldc_w -384784025
/*     */     //   740: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   743: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   746: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   749: aload #31
/*     */     //   751: bipush #6
/*     */     //   753: bipush #112
/*     */     //   755: iload #13
/*     */     //   757: bipush #6
/*     */     //   759: ishr
/*     */     //   760: iand
/*     */     //   761: ior
/*     */     //   762: istore #33
/*     */     //   764: astore #34
/*     */     //   766: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   769: astore #35
/*     */     //   771: iconst_0
/*     */     //   772: istore #36
/*     */     //   774: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   777: checkcast androidx/compose/ui/Modifier
/*     */     //   780: aconst_null
/*     */     //   781: aconst_null
/*     */     //   782: iconst_3
/*     */     //   783: aconst_null
/*     */     //   784: invokestatic animateContentSize$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   787: astore #37
/*     */     //   789: iconst_0
/*     */     //   790: istore #38
/*     */     //   792: nop
/*     */     //   793: iconst_0
/*     */     //   794: istore #39
/*     */     //   796: aload #34
/*     */     //   798: ldc_w 733328855
/*     */     //   801: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   804: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   807: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   810: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   813: astore #40
/*     */     //   815: iconst_0
/*     */     //   816: istore #41
/*     */     //   818: aload #40
/*     */     //   820: iload #41
/*     */     //   822: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   825: astore #42
/*     */     //   827: bipush #112
/*     */     //   829: iload #38
/*     */     //   831: iconst_3
/*     */     //   832: ishl
/*     */     //   833: iand
/*     */     //   834: istore #43
/*     */     //   836: nop
/*     */     //   837: iconst_0
/*     */     //   838: istore #44
/*     */     //   840: aload #34
/*     */     //   842: ldc -1323940314
/*     */     //   844: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   846: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   849: aload #34
/*     */     //   851: iconst_0
/*     */     //   852: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   855: istore #45
/*     */     //   857: aload #34
/*     */     //   859: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   864: astore #46
/*     */     //   866: aload #34
/*     */     //   868: aload #37
/*     */     //   870: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   873: astore #47
/*     */     //   875: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   878: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   881: astore #48
/*     */     //   883: bipush #6
/*     */     //   885: sipush #896
/*     */     //   888: iload #43
/*     */     //   890: bipush #6
/*     */     //   892: ishl
/*     */     //   893: iand
/*     */     //   894: ior
/*     */     //   895: istore #49
/*     */     //   897: nop
/*     */     //   898: iconst_0
/*     */     //   899: istore #50
/*     */     //   901: aload #34
/*     */     //   903: ldc -692256719
/*     */     //   905: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   907: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   910: aload #34
/*     */     //   912: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   917: instanceof androidx/compose/runtime/Applier
/*     */     //   920: ifne -> 926
/*     */     //   923: invokestatic invalidApplier : ()V
/*     */     //   926: aload #34
/*     */     //   928: invokeinterface startReusableNode : ()V
/*     */     //   933: aload #34
/*     */     //   935: invokeinterface getInserting : ()Z
/*     */     //   940: ifeq -> 955
/*     */     //   943: aload #34
/*     */     //   945: aload #48
/*     */     //   947: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   952: goto -> 962
/*     */     //   955: aload #34
/*     */     //   957: invokeinterface useNode : ()V
/*     */     //   962: aload #34
/*     */     //   964: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   967: astore #51
/*     */     //   969: iconst_0
/*     */     //   970: istore #52
/*     */     //   972: aload #51
/*     */     //   974: aload #42
/*     */     //   976: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   979: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   982: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   985: aload #51
/*     */     //   987: aload #46
/*     */     //   989: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   992: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   995: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   998: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1001: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1004: astore #53
/*     */     //   1006: iconst_0
/*     */     //   1007: istore #54
/*     */     //   1009: aload #51
/*     */     //   1011: astore #55
/*     */     //   1013: iconst_0
/*     */     //   1014: istore #56
/*     */     //   1016: aload #55
/*     */     //   1018: invokeinterface getInserting : ()Z
/*     */     //   1023: ifne -> 1044
/*     */     //   1026: aload #55
/*     */     //   1028: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1033: iload #45
/*     */     //   1035: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1038: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1041: ifne -> 1070
/*     */     //   1044: aload #55
/*     */     //   1046: iload #45
/*     */     //   1048: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1051: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1056: aload #51
/*     */     //   1058: iload #45
/*     */     //   1060: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1063: aload #53
/*     */     //   1065: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1070: nop
/*     */     //   1071: nop
/*     */     //   1072: nop
/*     */     //   1073: aload #51
/*     */     //   1075: aload #47
/*     */     //   1077: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1080: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1083: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1086: nop
/*     */     //   1087: nop
/*     */     //   1088: aload #34
/*     */     //   1090: bipush #14
/*     */     //   1092: iload #49
/*     */     //   1094: bipush #6
/*     */     //   1096: ishr
/*     */     //   1097: iand
/*     */     //   1098: istore #57
/*     */     //   1100: astore #58
/*     */     //   1102: iconst_0
/*     */     //   1103: istore #59
/*     */     //   1105: aload #58
/*     */     //   1107: ldc_w -2146769399
/*     */     //   1110: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   1113: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1116: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   1119: aload #58
/*     */     //   1121: bipush #6
/*     */     //   1123: bipush #112
/*     */     //   1125: iload #38
/*     */     //   1127: bipush #6
/*     */     //   1129: ishr
/*     */     //   1130: iand
/*     */     //   1131: ior
/*     */     //   1132: istore #60
/*     */     //   1134: astore #61
/*     */     //   1136: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   1139: astore #62
/*     */     //   1141: iconst_0
/*     */     //   1142: istore #63
/*     */     //   1144: aconst_null
/*     */     //   1145: ldc_w -1424715766
/*     */     //   1148: iconst_1
/*     */     //   1149: new com/intellij/ml/llm/matterhorn/ej/ui/components/ChatResponseTextContainerKt$ChatResponseTextContainer$1$1$1
/*     */     //   1152: dup
/*     */     //   1153: aload #9
/*     */     //   1155: iload #7
/*     */     //   1157: aload #8
/*     */     //   1159: invokespecial <init> : (Ljava/lang/String;ZLandroidx/compose/runtime/MutableState;)V
/*     */     //   1162: aload #61
/*     */     //   1164: bipush #54
/*     */     //   1166: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1169: checkcast kotlin/jvm/functions/Function2
/*     */     //   1172: aload #61
/*     */     //   1174: bipush #48
/*     */     //   1176: iconst_1
/*     */     //   1177: invokestatic SelectionContainer : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1180: nop
/*     */     //   1181: aload #58
/*     */     //   1183: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1186: aload #34
/*     */     //   1188: invokeinterface endNode : ()V
/*     */     //   1193: aload #34
/*     */     //   1195: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1198: nop
/*     */     //   1199: aload #34
/*     */     //   1201: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1204: nop
/*     */     //   1205: aload #34
/*     */     //   1207: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1210: nop
/*     */     //   1211: aload #35
/*     */     //   1213: aload #8
/*     */     //   1215: invokestatic ChatResponseTextContainer$lambda$1 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   1218: aconst_null
/*     */     //   1219: aconst_null
/*     */     //   1220: aconst_null
/*     */     //   1221: aconst_null
/*     */     //   1222: ldc_w -1909378117
/*     */     //   1225: iconst_1
/*     */     //   1226: new com/intellij/ml/llm/matterhorn/ej/ui/components/ChatResponseTextContainerKt$ChatResponseTextContainer$1$2
/*     */     //   1229: dup
/*     */     //   1230: aload_1
/*     */     //   1231: aload_2
/*     */     //   1232: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*     */     //   1235: aload #34
/*     */     //   1237: bipush #54
/*     */     //   1239: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1242: checkcast kotlin/jvm/functions/Function3
/*     */     //   1245: aload #34
/*     */     //   1247: ldc_w 1572864
/*     */     //   1250: bipush #14
/*     */     //   1252: iload #33
/*     */     //   1254: iand
/*     */     //   1255: ior
/*     */     //   1256: bipush #30
/*     */     //   1258: invokestatic AnimatedVisibility : (Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1261: nop
/*     */     //   1262: aload #31
/*     */     //   1264: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1267: aload_3
/*     */     //   1268: invokeinterface endNode : ()V
/*     */     //   1273: aload_3
/*     */     //   1274: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1277: nop
/*     */     //   1278: aload_3
/*     */     //   1279: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1282: nop
/*     */     //   1283: aload_3
/*     */     //   1284: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1287: nop
/*     */     //   1288: invokestatic isTraceInProgress : ()Z
/*     */     //   1291: ifeq -> 1306
/*     */     //   1294: invokestatic traceEventEnd : ()V
/*     */     //   1297: goto -> 1306
/*     */     //   1300: aload_3
/*     */     //   1301: invokeinterface skipToGroupEnd : ()V
/*     */     //   1306: aload_3
/*     */     //   1307: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1312: dup
/*     */     //   1313: ifnull -> 1334
/*     */     //   1316: aload_0
/*     */     //   1317: aload_1
/*     */     //   1318: aload_2
/*     */     //   1319: iload #4
/*     */     //   1321: <illegal opcode> invoke : (Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;I)Lkotlin/jvm/functions/Function2;
/*     */     //   1326: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1331: goto -> 1335
/*     */     //   1334: pop
/*     */     //   1335: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #26	-> 18
/*     */     //   #27	-> 159
/*     */     //   #28	-> 164
/*     */     //   #29	-> 194
/*     */     //   #62	-> 198
/*     */     //   #63	-> 210
/*     */     //   #64	-> 221
/*     */     //   #29	-> 224
/*     */     //   #64	-> 235
/*     */     //   #65	-> 237
/*     */     //   #66	-> 246
/*     */     //   #67	-> 251
/*     */     //   #63	-> 253
/*     */     //   #62	-> 254
/*     */     //   #62	-> 255
/*     */     //   #29	-> 256
/*     */     //   #32	-> 298
/*     */     //   #68	-> 302
/*     */     //   #69	-> 314
/*     */     //   #70	-> 330
/*     */     //   #33	-> 333
/*     */     //   #70	-> 353
/*     */     //   #71	-> 355
/*     */     //   #72	-> 364
/*     */     //   #73	-> 369
/*     */     //   #69	-> 371
/*     */     //   #68	-> 372
/*     */     //   #68	-> 373
/*     */     //   #32	-> 374
/*     */     //   #31	-> 387
/*     */     //   #36	-> 389
/*     */     //   #74	-> 399
/*     */     //   #36	-> 405
/*     */     //   #75	-> 425
/*     */     //   #76	-> 428
/*     */     //   #78	-> 436
/*     */     //   #81	-> 444
/*     */     //   #82	-> 478
/*     */     //   #83	-> 487
/*     */     //   #84	-> 492
/*     */     //   #85	-> 498
/*     */     //   #86	-> 506
/*     */     //   #88	-> 513
/*     */     //   #87	-> 535
/*     */     //   #89	-> 544
/*     */     //   #90	-> 547
/*     */     //   #91	-> 563
/*     */     //   #92	-> 568
/*     */     //   #93	-> 578
/*     */     //   #95	-> 589
/*     */     //   #97	-> 594
/*     */     //   #98	-> 603
/*     */     //   #99	-> 616
/*     */     //   #101	-> 629
/*     */     //   #102	-> 640
/*     */     //   #103	-> 647
/*     */     //   #104	-> 675
/*     */     //   #105	-> 687
/*     */     //   #107	-> 701
/*     */     //   #102	-> 702
/*     */     //   #107	-> 703
/*     */     //   #108	-> 704
/*     */     //   #109	-> 717
/*     */     //   #97	-> 718
/*     */     //   #110	-> 719
/*     */     //   #111	-> 743
/*     */     //   #38	-> 774
/*     */     //   #37	-> 792
/*     */     //   #112	-> 804
/*     */     //   #113	-> 807
/*     */     //   #114	-> 815
/*     */     //   #117	-> 818
/*     */     //   #118	-> 836
/*     */     //   #119	-> 846
/*     */     //   #120	-> 852
/*     */     //   #121	-> 859
/*     */     //   #122	-> 868
/*     */     //   #124	-> 875
/*     */     //   #123	-> 897
/*     */     //   #125	-> 907
/*     */     //   #126	-> 910
/*     */     //   #127	-> 928
/*     */     //   #128	-> 933
/*     */     //   #129	-> 945
/*     */     //   #131	-> 957
/*     */     //   #133	-> 962
/*     */     //   #134	-> 972
/*     */     //   #135	-> 985
/*     */     //   #137	-> 998
/*     */     //   #138	-> 1009
/*     */     //   #139	-> 1016
/*     */     //   #140	-> 1044
/*     */     //   #141	-> 1056
/*     */     //   #143	-> 1070
/*     */     //   #138	-> 1071
/*     */     //   #143	-> 1072
/*     */     //   #144	-> 1073
/*     */     //   #145	-> 1086
/*     */     //   #133	-> 1087
/*     */     //   #146	-> 1088
/*     */     //   #147	-> 1113
/*     */     //   #40	-> 1145
/*     */     //   #52	-> 1180
/*     */     //   #147	-> 1181
/*     */     //   #146	-> 1186
/*     */     //   #148	-> 1188
/*     */     //   #125	-> 1195
/*     */     //   #149	-> 1198
/*     */     //   #119	-> 1201
/*     */     //   #150	-> 1204
/*     */     //   #112	-> 1207
/*     */     //   #151	-> 1210
/*     */     //   #53	-> 1211
/*     */     //   #59	-> 1261
/*     */     //   #111	-> 1262
/*     */     //   #110	-> 1267
/*     */     //   #152	-> 1268
/*     */     //   #89	-> 1274
/*     */     //   #153	-> 1277
/*     */     //   #83	-> 1279
/*     */     //   #154	-> 1282
/*     */     //   #75	-> 1284
/*     */     //   #155	-> 1287
/*     */     //   #60	-> 1300
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   224	11	15	$i$a$-cache-ChatResponseTextContainerKt$ChatResponseTextContainer$isOverflowing$2	I
/*     */     //   237	11	16	value$iv	Ljava/lang/Object;
/*     */     //   210	44	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   207	47	13	it$iv	Ljava/lang/Object;
/*     */     //   198	58	12	$i$f$cache	I
/*     */     //   195	61	10	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   195	61	11	invalid$iv	Z
/*     */     //   333	20	16	$i$a$-cache-ChatResponseTextContainerKt$ChatResponseTextContainer$displayText$1	I
/*     */     //   355	11	17	value$iv	Ljava/lang/Object;
/*     */     //   314	58	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   311	61	14	it$iv	Ljava/lang/Object;
/*     */     //   302	72	13	$i$f$cache	I
/*     */     //   299	75	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   299	75	12	invalid$iv	Z
/*     */     //   399	6	12	$i$f$getDp	I
/*     */     //   396	9	11	$this$dp$iv	I
/*     */     //   1144	37	63	$i$a$-Box-ChatResponseTextContainerKt$ChatResponseTextContainer$1$1	I
/*     */     //   1141	40	62	$this$ChatResponseTextContainer_u24lambda_u245_u24lambda_u244	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   1141	40	61	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1141	40	60	$changed	I
/*     */     //   1105	81	59	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   1102	84	58	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1102	84	57	$changed$iv	I
/*     */     //   1016	55	56	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1013	58	55	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1009	64	54	$i$f$set-impl	I
/*     */     //   1006	67	53	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   972	115	52	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   969	118	51	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   901	298	50	$i$f$ReusableComposeNode	I
/*     */     //   898	301	48	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   898	301	49	$changed$iv$iv$iv	I
/*     */     //   840	365	44	$i$f$Layout	I
/*     */     //   857	348	45	compositeKeyHash$iv$iv	I
/*     */     //   866	339	46	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   875	330	47	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   837	368	43	$changed$iv$iv	I
/*     */     //   796	415	39	$i$f$Box	I
/*     */     //   827	384	42	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   793	418	37	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   815	396	40	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   818	393	41	propagateMinConstraints$iv	Z
/*     */     //   793	418	38	$changed$iv	I
/*     */     //   774	488	36	$i$a$-Column-ChatResponseTextContainerKt$ChatResponseTextContainer$1	I
/*     */     //   771	491	35	$this$ChatResponseTextContainer_u24lambda_u245	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   771	491	34	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   771	491	33	$changed	I
/*     */     //   735	532	32	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   732	535	31	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   732	535	30	$changed$iv	I
/*     */     //   647	55	29	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   644	58	28	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   640	64	27	$i$f$set-impl	I
/*     */     //   637	67	26	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   603	115	25	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   600	118	24	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   539	739	23	$i$f$ReusableComposeNode	I
/*     */     //   536	742	21	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   536	742	22	$changed$iv$iv$iv	I
/*     */     //   482	801	17	$i$f$Layout	I
/*     */     //   497	786	18	compositeKeyHash$iv$iv	I
/*     */     //   505	778	19	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   513	770	20	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   479	804	16	$changed$iv$iv	I
/*     */     //   420	868	14	$i$f$Column	I
/*     */     //   469	819	15	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   436	852	10	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   417	871	11	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   444	844	12	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   417	871	13	$changed$iv	I
/*     */     //   164	1133	6	thresholdChars	I
/*     */     //   180	1117	7	isLongText	Z
/*     */     //   271	1026	8	isOverflowing$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   389	908	9	displayText	Ljava/lang/String;
/*     */     //   31	1305	5	$dirty	I
/*     */     //   0	1336	0	markdown	Ljava/lang/String;
/*     */     //   0	1336	1	actionText	Ljava/lang/String;
/*     */     //   0	1336	2	onActionClicked	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1336	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1336	4	$changed	I
/*     */   }
/*     */   
/*  29 */   private static final boolean ChatResponseTextContainer$lambda$1(MutableState $isOverflowing$delegate) { State state = (State)$isOverflowing$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 156 */       (Boolean)state.getValue()).booleanValue(); } private static final void ChatResponseTextContainer$lambda$2(MutableState $isOverflowing$delegate, boolean <set-?>) { MutableState mutableState = $isOverflowing$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 157 */     mutableState.setValue(value$iv); }
/*     */ 
/*     */   
/*     */   private static final Unit ChatResponseTextContainer$lambda$6(String $markdown, String $actionText, Function0<Unit> $onActionClicked, int $$changed, Composer $composer, int $force) {
/*     */     ChatResponseTextContainer($markdown, $actionText, $onActionClicked, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nChatResponseTextContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatResponseTextContainer.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/ChatResponseTextContainerKt$ChatResponseTextContainer$1$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,61:1\n1225#2,6:62\n*S KotlinDebug\n*F\n+ 1 ChatResponseTextContainer.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/ChatResponseTextContainerKt$ChatResponseTextContainer$1$1$1\n*L\n45#1:62,6\n*E\n"})
/*     */   static final class ChatResponseTextContainerKt$ChatResponseTextContainer$1$1$1 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*     */       // Byte code:
/*     */       //   0: iload_2
/*     */       //   1: iconst_3
/*     */       //   2: iand
/*     */       //   3: iconst_2
/*     */       //   4: if_icmpne -> 16
/*     */       //   7: aload_1
/*     */       //   8: invokeinterface getSkipping : ()Z
/*     */       //   13: ifne -> 275
/*     */       //   16: invokestatic isTraceInProgress : ()Z
/*     */       //   19: ifeq -> 31
/*     */       //   22: ldc -1424715766
/*     */       //   24: iload_2
/*     */       //   25: iconst_m1
/*     */       //   26: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.ChatResponseTextContainer.<anonymous>.<anonymous>.<anonymous> (ChatResponseTextContainer.kt:40)'
/*     */       //   28: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   31: aload_1
/*     */       //   32: iconst_0
/*     */       //   33: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */       //   36: aload_1
/*     */       //   37: iconst_0
/*     */       //   38: invokevirtual getMessageFont : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/font/FontFamily;
/*     */       //   41: astore_3
/*     */       //   42: aload_1
/*     */       //   43: iconst_0
/*     */       //   44: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */       //   47: invokevirtual getBlockTextColor-0d7_KjU : ()J
/*     */       //   50: lstore #4
/*     */       //   52: getstatic androidx/compose/ui/text/style/TextOverflow.Companion : Landroidx/compose/ui/text/style/TextOverflow$Companion;
/*     */       //   55: invokevirtual getEllipsis-gIe3tQ8 : ()I
/*     */       //   58: istore #6
/*     */       //   60: aload_0
/*     */       //   61: getfield $displayText : Ljava/lang/String;
/*     */       //   64: aconst_null
/*     */       //   65: lload #4
/*     */       //   67: lconst_0
/*     */       //   68: aconst_null
/*     */       //   69: aconst_null
/*     */       //   70: aload_3
/*     */       //   71: lconst_0
/*     */       //   72: aconst_null
/*     */       //   73: iconst_0
/*     */       //   74: lconst_0
/*     */       //   75: iload #6
/*     */       //   77: iconst_0
/*     */       //   78: bipush #8
/*     */       //   80: aload_1
/*     */       //   81: ldc -1603815877
/*     */       //   83: invokeinterface startReplaceGroup : (I)V
/*     */       //   88: aload_1
/*     */       //   89: astore #8
/*     */       //   91: aload_1
/*     */       //   92: aload_0
/*     */       //   93: getfield $isLongText : Z
/*     */       //   96: invokeinterface changed : (Z)Z
/*     */       //   101: istore #9
/*     */       //   103: aload_0
/*     */       //   104: getfield $isLongText : Z
/*     */       //   107: istore #10
/*     */       //   109: aload_0
/*     */       //   110: getfield $isOverflowing$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   113: astore #11
/*     */       //   115: iconst_0
/*     */       //   116: istore #12
/*     */       //   118: aload #8
/*     */       //   120: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   125: astore #13
/*     */       //   127: iconst_0
/*     */       //   128: istore #14
/*     */       //   130: iload #9
/*     */       //   132: ifne -> 146
/*     */       //   135: aload #13
/*     */       //   137: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   140: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   143: if_acmpne -> 234
/*     */       //   146: istore #34
/*     */       //   148: istore #33
/*     */       //   150: istore #32
/*     */       //   152: lstore #30
/*     */       //   154: istore #29
/*     */       //   156: astore #28
/*     */       //   158: lstore #26
/*     */       //   160: astore #25
/*     */       //   162: astore #24
/*     */       //   164: astore #23
/*     */       //   166: lstore #21
/*     */       //   168: lstore #19
/*     */       //   170: astore #18
/*     */       //   172: astore #17
/*     */       //   174: iconst_0
/*     */       //   175: istore #15
/*     */       //   177: iload #10
/*     */       //   179: aload #11
/*     */       //   181: <illegal opcode> invoke : (ZLandroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */       //   186: astore #35
/*     */       //   188: aload #17
/*     */       //   190: aload #18
/*     */       //   192: lload #19
/*     */       //   194: lload #21
/*     */       //   196: aload #23
/*     */       //   198: aload #24
/*     */       //   200: aload #25
/*     */       //   202: lload #26
/*     */       //   204: aload #28
/*     */       //   206: iload #29
/*     */       //   208: lload #30
/*     */       //   210: iload #32
/*     */       //   212: iload #33
/*     */       //   214: iload #34
/*     */       //   216: aload #35
/*     */       //   218: astore #16
/*     */       //   220: aload #8
/*     */       //   222: aload #16
/*     */       //   224: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   229: aload #16
/*     */       //   231: goto -> 236
/*     */       //   234: aload #13
/*     */       //   236: nop
/*     */       //   237: nop
/*     */       //   238: nop
/*     */       //   239: checkcast kotlin/jvm/functions/Function1
/*     */       //   242: astore #7
/*     */       //   244: aload_1
/*     */       //   245: invokeinterface endReplaceGroup : ()V
/*     */       //   250: aload #7
/*     */       //   252: aconst_null
/*     */       //   253: aload_1
/*     */       //   254: iconst_0
/*     */       //   255: sipush #3120
/*     */       //   258: ldc 38842
/*     */       //   260: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */       //   263: invokestatic isTraceInProgress : ()Z
/*     */       //   266: ifeq -> 281
/*     */       //   269: invokestatic traceEventEnd : ()V
/*     */       //   272: goto -> 281
/*     */       //   275: aload_1
/*     */       //   276: invokeinterface skipToGroupEnd : ()V
/*     */       //   281: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #41	-> 0
/*     */       //   #43	-> 33
/*     */       //   #44	-> 44
/*     */       //   #48	-> 52
/*     */       //   #42	-> 60
/*     */       //   #44	-> 65
/*     */       //   #43	-> 70
/*     */       //   #48	-> 75
/*     */       //   #49	-> 78
/*     */       //   #45	-> 103
/*     */       //   #62	-> 118
/*     */       //   #63	-> 130
/*     */       //   #64	-> 146
/*     */       //   #45	-> 177
/*     */       //   #64	-> 218
/*     */       //   #65	-> 220
/*     */       //   #66	-> 229
/*     */       //   #67	-> 234
/*     */       //   #63	-> 236
/*     */       //   #62	-> 237
/*     */       //   #62	-> 238
/*     */       //   #45	-> 239
/*     */       //   #41	-> 260
/*     */       //   #50	-> 275
/*     */       //   #51	-> 281
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   177	9	15	$i$a$-cache-ChatResponseTextContainerKt$ChatResponseTextContainer$1$1$1$1	I
/*     */       //   220	11	16	value$iv	Ljava/lang/Object;
/*     */       //   130	107	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   127	110	13	it$iv	Ljava/lang/Object;
/*     */       //   118	121	12	$i$f$cache	I
/*     */       //   115	124	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   115	124	9	invalid$iv	Z
/*     */       //   0	282	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/ChatResponseTextContainerKt$ChatResponseTextContainer$1$1$1;
/*     */       //   0	282	1	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	282	2	$changed	I
/*     */     }
/*     */     
/*     */     private static final Unit invoke$lambda$1$lambda$0(boolean $isLongText, MutableState $isOverflowing$delegate, TextLayoutResult layoutResult) {
/*     */       Intrinsics.checkNotNullParameter(layoutResult, "layoutResult");
/*     */       ChatResponseTextContainerKt.ChatResponseTextContainer$lambda$2($isOverflowing$delegate, (layoutResult.getHasVisualOverflow() || $isLongText));
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     ChatResponseTextContainerKt$ChatResponseTextContainer$1$1$1(String $displayText, boolean $isLongText, MutableState<Boolean> $isOverflowing$delegate) {}
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ChatResponseTextContainerKt$ChatResponseTextContainer$1$2 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(AnimatedVisibilityScope $this$AnimatedVisibility, Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter($this$AnimatedVisibility, "$this$AnimatedVisibility");
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventStart(-1909378117, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.ChatResponseTextContainer.<anonymous>.<anonymous> (ChatResponseTextContainer.kt:53)"); 
/*     */       LinkKt.Link-kye4rC8(this.$actionText, this.$onActionClicked, null, false, null, 0, null, null, $composer, 0, 252);
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd(); 
/*     */     }
/*     */     
/*     */     ChatResponseTextContainerKt$ChatResponseTextContainer$1$2(String $actionText, Function0<Unit> $onActionClicked) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\ChatResponseTextContainerKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */