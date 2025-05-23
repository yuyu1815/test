/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.create;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.RecentTaskChain;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ @SourceDebugExtension({"SMAP\nTaskList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskList.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/TaskListKt$TaskList$1$1$1$1$1$1$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,126:1\n1225#2,6:127\n1225#2,6:133\n1225#2,6:139\n71#3:145\n68#3,6:146\n74#3:180\n78#3:222\n79#4,6:152\n86#4,4:167\n90#4,2:177\n79#4,6:186\n86#4,4:201\n90#4,2:211\n94#4:217\n94#4:221\n368#5,9:158\n377#5:179\n368#5,9:192\n377#5:213\n378#5,2:215\n378#5,2:219\n4034#6,6:171\n4034#6,6:205\n149#7:181\n149#7:182\n99#8,3:183\n102#8:214\n106#8:218\n*S KotlinDebug\n*F\n+ 1 TaskList.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/TaskListKt$TaskList$1$1$1$1$1$1$2\n*L\n88#1:127,6\n91#1:133,6\n90#1:139,6\n86#1:145\n86#1:146,6\n86#1:180\n86#1:222\n86#1:152,6\n86#1:167,4\n86#1:177,2\n94#1:186,6\n94#1:201,4\n94#1:211,2\n94#1:217\n86#1:221\n86#1:158,9\n86#1:179\n94#1:192,9\n94#1:213\n94#1:215,2\n86#1:219,2\n86#1:171,6\n94#1:205,6\n95#1:181\n97#1:182\n94#1:183,3\n94#1:214\n94#1:218\n*E\n"})
/*    */ final class TaskListKt$TaskList$1$1$1$1$1$1$2
/*    */   implements Function2<Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(Composer $composer, int $changed) {
/*    */     // Byte code:
/*    */     //   0: iload_2
/*    */     //   1: iconst_3
/*    */     //   2: iand
/*    */     //   3: iconst_2
/*    */     //   4: if_icmpne -> 16
/*    */     //   7: aload_1
/*    */     //   8: invokeinterface getSkipping : ()Z
/*    */     //   13: ifne -> 1450
/*    */     //   16: invokestatic isTraceInProgress : ()Z
/*    */     //   19: ifeq -> 31
/*    */     //   22: ldc -111091601
/*    */     //   24: iload_2
/*    */     //   25: iconst_m1
/*    */     //   26: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.TaskList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TaskList.kt:82)'
/*    */     //   28: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   31: aload_0
/*    */     //   32: getfield $sortedTask : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/SortedRecentTaskChain;
/*    */     //   35: invokevirtual getChain : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;
/*    */     //   38: astore_3
/*    */     //   39: iconst_2
/*    */     //   40: anewarray com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState
/*    */     //   43: astore #5
/*    */     //   45: aload #5
/*    */     //   47: iconst_0
/*    */     //   48: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Running : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*    */     //   51: aastore
/*    */     //   52: aload #5
/*    */     //   54: iconst_1
/*    */     //   55: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.WaitingSmartMode : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*    */     //   58: aastore
/*    */     //   59: aload #5
/*    */     //   61: invokestatic setOf : ([Ljava/lang/Object;)Ljava/util/Set;
/*    */     //   64: aload_3
/*    */     //   65: invokevirtual getState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*    */     //   68: invokeinterface contains : (Ljava/lang/Object;)Z
/*    */     //   73: istore #4
/*    */     //   75: aload_1
/*    */     //   76: ldc -1404873760
/*    */     //   78: invokeinterface startReplaceGroup : (I)V
/*    */     //   83: aload_1
/*    */     //   84: astore #7
/*    */     //   86: iconst_0
/*    */     //   87: istore #8
/*    */     //   89: nop
/*    */     //   90: iconst_0
/*    */     //   91: istore #9
/*    */     //   93: aload #7
/*    */     //   95: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   100: astore #10
/*    */     //   102: iconst_0
/*    */     //   103: istore #11
/*    */     //   105: aload #10
/*    */     //   107: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   110: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   113: if_acmpne -> 138
/*    */     //   116: iconst_0
/*    */     //   117: istore #12
/*    */     //   119: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*    */     //   122: astore #12
/*    */     //   124: aload #7
/*    */     //   126: aload #12
/*    */     //   128: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   133: aload #12
/*    */     //   135: goto -> 140
/*    */     //   138: aload #10
/*    */     //   140: nop
/*    */     //   141: nop
/*    */     //   142: nop
/*    */     //   143: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*    */     //   146: astore #6
/*    */     //   148: aload_1
/*    */     //   149: invokeinterface endReplaceGroup : ()V
/*    */     //   154: aload #6
/*    */     //   156: astore #5
/*    */     //   158: aload_0
/*    */     //   159: getfield $modifier : Landroidx/compose/ui/Modifier;
/*    */     //   162: aload #5
/*    */     //   164: aconst_null
/*    */     //   165: iconst_0
/*    */     //   166: aconst_null
/*    */     //   167: aconst_null
/*    */     //   168: aconst_null
/*    */     //   169: aconst_null
/*    */     //   170: aload_1
/*    */     //   171: ldc -1404869144
/*    */     //   173: invokeinterface startReplaceGroup : (I)V
/*    */     //   178: aload_1
/*    */     //   179: astore #7
/*    */     //   181: aload_1
/*    */     //   182: aload_0
/*    */     //   183: getfield $onTaskDoubleClicked : Lkotlin/jvm/functions/Function1;
/*    */     //   186: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   191: aload_1
/*    */     //   192: aload_3
/*    */     //   193: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   198: ior
/*    */     //   199: istore #8
/*    */     //   201: aload_0
/*    */     //   202: getfield $onTaskDoubleClicked : Lkotlin/jvm/functions/Function1;
/*    */     //   205: astore #9
/*    */     //   207: iconst_0
/*    */     //   208: istore #10
/*    */     //   210: aload #7
/*    */     //   212: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   217: astore #11
/*    */     //   219: iconst_0
/*    */     //   220: istore #12
/*    */     //   222: iload #8
/*    */     //   224: ifne -> 238
/*    */     //   227: aload #11
/*    */     //   229: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   232: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   235: if_acmpne -> 301
/*    */     //   238: astore #69
/*    */     //   240: astore #68
/*    */     //   242: astore #67
/*    */     //   244: astore #66
/*    */     //   246: istore #65
/*    */     //   248: astore #64
/*    */     //   250: astore #63
/*    */     //   252: astore #62
/*    */     //   254: iconst_0
/*    */     //   255: istore #13
/*    */     //   257: aload #9
/*    */     //   259: aload_3
/*    */     //   260: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;)Lkotlin/jvm/functions/Function0;
/*    */     //   265: astore #70
/*    */     //   267: aload #62
/*    */     //   269: aload #63
/*    */     //   271: aload #64
/*    */     //   273: iload #65
/*    */     //   275: aload #66
/*    */     //   277: aload #67
/*    */     //   279: aload #68
/*    */     //   281: aload #69
/*    */     //   283: aload #70
/*    */     //   285: astore #14
/*    */     //   287: aload #7
/*    */     //   289: aload #14
/*    */     //   291: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   296: aload #14
/*    */     //   298: goto -> 303
/*    */     //   301: aload #11
/*    */     //   303: nop
/*    */     //   304: nop
/*    */     //   305: nop
/*    */     //   306: checkcast kotlin/jvm/functions/Function0
/*    */     //   309: astore #6
/*    */     //   311: aload_1
/*    */     //   312: invokeinterface endReplaceGroup : ()V
/*    */     //   317: aload #6
/*    */     //   319: aload_1
/*    */     //   320: ldc -1404870405
/*    */     //   322: invokeinterface startReplaceGroup : (I)V
/*    */     //   327: aload_1
/*    */     //   328: astore #7
/*    */     //   330: iconst_0
/*    */     //   331: istore #8
/*    */     //   333: nop
/*    */     //   334: iconst_0
/*    */     //   335: istore #9
/*    */     //   337: aload #7
/*    */     //   339: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   344: astore #10
/*    */     //   346: iconst_0
/*    */     //   347: istore #11
/*    */     //   349: aload #10
/*    */     //   351: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   354: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   357: if_acmpne -> 424
/*    */     //   360: astore #70
/*    */     //   362: astore #69
/*    */     //   364: astore #68
/*    */     //   366: astore #67
/*    */     //   368: astore #66
/*    */     //   370: istore #65
/*    */     //   372: astore #64
/*    */     //   374: astore #63
/*    */     //   376: astore #62
/*    */     //   378: iconst_0
/*    */     //   379: istore #12
/*    */     //   381: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*    */     //   386: astore #71
/*    */     //   388: aload #62
/*    */     //   390: aload #63
/*    */     //   392: aload #64
/*    */     //   394: iload #65
/*    */     //   396: aload #66
/*    */     //   398: aload #67
/*    */     //   400: aload #68
/*    */     //   402: aload #69
/*    */     //   404: aload #70
/*    */     //   406: aload #71
/*    */     //   408: astore #12
/*    */     //   410: aload #7
/*    */     //   412: aload #12
/*    */     //   414: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   419: aload #12
/*    */     //   421: goto -> 426
/*    */     //   424: aload #10
/*    */     //   426: nop
/*    */     //   427: nop
/*    */     //   428: nop
/*    */     //   429: checkcast kotlin/jvm/functions/Function0
/*    */     //   432: astore #6
/*    */     //   434: aload_1
/*    */     //   435: invokeinterface endReplaceGroup : ()V
/*    */     //   440: aload #6
/*    */     //   442: bipush #124
/*    */     //   444: aconst_null
/*    */     //   445: invokestatic combinedClickable-XVZzFYc$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   448: astore #5
/*    */     //   450: iconst_0
/*    */     //   451: istore #8
/*    */     //   453: nop
/*    */     //   454: iconst_0
/*    */     //   455: istore #9
/*    */     //   457: aload_1
/*    */     //   458: ldc 733328855
/*    */     //   460: ldc 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*    */     //   462: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   465: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   468: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*    */     //   471: astore #6
/*    */     //   473: iconst_0
/*    */     //   474: istore #7
/*    */     //   476: aload #6
/*    */     //   478: iload #7
/*    */     //   480: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   483: astore #10
/*    */     //   485: bipush #112
/*    */     //   487: iload #8
/*    */     //   489: iconst_3
/*    */     //   490: ishl
/*    */     //   491: iand
/*    */     //   492: istore #11
/*    */     //   494: nop
/*    */     //   495: iconst_0
/*    */     //   496: istore #12
/*    */     //   498: aload_1
/*    */     //   499: ldc -1323940314
/*    */     //   501: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   503: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   506: aload_1
/*    */     //   507: iconst_0
/*    */     //   508: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   511: istore #13
/*    */     //   513: aload_1
/*    */     //   514: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   519: astore #14
/*    */     //   521: aload_1
/*    */     //   522: aload #5
/*    */     //   524: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   527: astore #15
/*    */     //   529: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   532: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   535: astore #16
/*    */     //   537: bipush #6
/*    */     //   539: sipush #896
/*    */     //   542: iload #11
/*    */     //   544: bipush #6
/*    */     //   546: ishl
/*    */     //   547: iand
/*    */     //   548: ior
/*    */     //   549: istore #17
/*    */     //   551: nop
/*    */     //   552: iconst_0
/*    */     //   553: istore #18
/*    */     //   555: aload_1
/*    */     //   556: ldc -692256719
/*    */     //   558: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   560: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   563: aload_1
/*    */     //   564: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   569: instanceof androidx/compose/runtime/Applier
/*    */     //   572: ifne -> 578
/*    */     //   575: invokestatic invalidApplier : ()V
/*    */     //   578: aload_1
/*    */     //   579: invokeinterface startReusableNode : ()V
/*    */     //   584: aload_1
/*    */     //   585: invokeinterface getInserting : ()Z
/*    */     //   590: ifeq -> 604
/*    */     //   593: aload_1
/*    */     //   594: aload #16
/*    */     //   596: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   601: goto -> 610
/*    */     //   604: aload_1
/*    */     //   605: invokeinterface useNode : ()V
/*    */     //   610: aload_1
/*    */     //   611: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   614: astore #19
/*    */     //   616: iconst_0
/*    */     //   617: istore #20
/*    */     //   619: aload #19
/*    */     //   621: aload #10
/*    */     //   623: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   626: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   629: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   632: aload #19
/*    */     //   634: aload #14
/*    */     //   636: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   639: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   642: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   645: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   648: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   651: astore #21
/*    */     //   653: iconst_0
/*    */     //   654: istore #22
/*    */     //   656: aload #19
/*    */     //   658: astore #23
/*    */     //   660: iconst_0
/*    */     //   661: istore #24
/*    */     //   663: aload #23
/*    */     //   665: invokeinterface getInserting : ()Z
/*    */     //   670: ifne -> 691
/*    */     //   673: aload #23
/*    */     //   675: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   680: iload #13
/*    */     //   682: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   685: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   688: ifne -> 717
/*    */     //   691: aload #23
/*    */     //   693: iload #13
/*    */     //   695: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   698: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   703: aload #19
/*    */     //   705: iload #13
/*    */     //   707: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   710: aload #21
/*    */     //   712: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   717: nop
/*    */     //   718: nop
/*    */     //   719: nop
/*    */     //   720: aload #19
/*    */     //   722: aload #15
/*    */     //   724: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   727: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   730: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   733: nop
/*    */     //   734: nop
/*    */     //   735: aload_1
/*    */     //   736: bipush #14
/*    */     //   738: iload #17
/*    */     //   740: bipush #6
/*    */     //   742: ishr
/*    */     //   743: iand
/*    */     //   744: istore #25
/*    */     //   746: astore #26
/*    */     //   748: iconst_0
/*    */     //   749: istore #27
/*    */     //   751: aload #26
/*    */     //   753: ldc_w -2146769399
/*    */     //   756: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*    */     //   759: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   762: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*    */     //   765: aload #26
/*    */     //   767: bipush #6
/*    */     //   769: bipush #112
/*    */     //   771: iload #8
/*    */     //   773: bipush #6
/*    */     //   775: ishr
/*    */     //   776: iand
/*    */     //   777: ior
/*    */     //   778: istore #28
/*    */     //   780: astore #29
/*    */     //   782: checkcast androidx/compose/foundation/layout/BoxScope
/*    */     //   785: astore #30
/*    */     //   787: iconst_0
/*    */     //   788: istore #31
/*    */     //   790: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   793: checkcast androidx/compose/ui/Modifier
/*    */     //   796: fconst_0
/*    */     //   797: bipush #8
/*    */     //   799: istore #32
/*    */     //   801: iconst_0
/*    */     //   802: istore #33
/*    */     //   804: iload #32
/*    */     //   806: i2f
/*    */     //   807: invokestatic constructor-impl : (F)F
/*    */     //   810: fconst_0
/*    */     //   811: bipush #8
/*    */     //   813: istore #32
/*    */     //   815: iconst_0
/*    */     //   816: istore #33
/*    */     //   818: iload #32
/*    */     //   820: i2f
/*    */     //   821: invokestatic constructor-impl : (F)F
/*    */     //   824: iconst_5
/*    */     //   825: aconst_null
/*    */     //   826: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   829: astore #34
/*    */     //   831: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   834: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*    */     //   837: astore #32
/*    */     //   839: getstatic androidx/compose/foundation/layout/Arrangement$Absolute.INSTANCE : Landroidx/compose/foundation/layout/Arrangement$Absolute;
/*    */     //   842: bipush #8
/*    */     //   844: istore #35
/*    */     //   846: iconst_0
/*    */     //   847: istore #36
/*    */     //   849: iload #35
/*    */     //   851: i2f
/*    */     //   852: invokestatic constructor-impl : (F)F
/*    */     //   855: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*    */     //   858: astore #33
/*    */     //   860: sipush #438
/*    */     //   863: istore #35
/*    */     //   865: nop
/*    */     //   866: iconst_0
/*    */     //   867: istore #36
/*    */     //   869: aload #29
/*    */     //   871: ldc_w 693286680
/*    */     //   874: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*    */     //   877: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   880: aload #33
/*    */     //   882: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*    */     //   885: aload #32
/*    */     //   887: aload #29
/*    */     //   889: bipush #14
/*    */     //   891: iload #35
/*    */     //   893: iconst_3
/*    */     //   894: ishr
/*    */     //   895: iand
/*    */     //   896: bipush #112
/*    */     //   898: iload #35
/*    */     //   900: iconst_3
/*    */     //   901: ishr
/*    */     //   902: iand
/*    */     //   903: ior
/*    */     //   904: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   907: astore #37
/*    */     //   909: bipush #112
/*    */     //   911: iload #35
/*    */     //   913: iconst_3
/*    */     //   914: ishl
/*    */     //   915: iand
/*    */     //   916: istore #38
/*    */     //   918: nop
/*    */     //   919: iconst_0
/*    */     //   920: istore #39
/*    */     //   922: aload #29
/*    */     //   924: ldc -1323940314
/*    */     //   926: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   928: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   931: aload #29
/*    */     //   933: iconst_0
/*    */     //   934: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   937: istore #40
/*    */     //   939: aload #29
/*    */     //   941: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   946: astore #41
/*    */     //   948: aload #29
/*    */     //   950: aload #34
/*    */     //   952: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   955: astore #42
/*    */     //   957: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   960: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   963: astore #43
/*    */     //   965: bipush #6
/*    */     //   967: sipush #896
/*    */     //   970: iload #38
/*    */     //   972: bipush #6
/*    */     //   974: ishl
/*    */     //   975: iand
/*    */     //   976: ior
/*    */     //   977: istore #44
/*    */     //   979: nop
/*    */     //   980: iconst_0
/*    */     //   981: istore #45
/*    */     //   983: aload #29
/*    */     //   985: ldc -692256719
/*    */     //   987: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   989: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   992: aload #29
/*    */     //   994: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   999: instanceof androidx/compose/runtime/Applier
/*    */     //   1002: ifne -> 1008
/*    */     //   1005: invokestatic invalidApplier : ()V
/*    */     //   1008: aload #29
/*    */     //   1010: invokeinterface startReusableNode : ()V
/*    */     //   1015: aload #29
/*    */     //   1017: invokeinterface getInserting : ()Z
/*    */     //   1022: ifeq -> 1037
/*    */     //   1025: aload #29
/*    */     //   1027: aload #43
/*    */     //   1029: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   1034: goto -> 1044
/*    */     //   1037: aload #29
/*    */     //   1039: invokeinterface useNode : ()V
/*    */     //   1044: aload #29
/*    */     //   1046: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   1049: astore #46
/*    */     //   1051: iconst_0
/*    */     //   1052: istore #47
/*    */     //   1054: aload #46
/*    */     //   1056: aload #37
/*    */     //   1058: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1061: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1064: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1067: aload #46
/*    */     //   1069: aload #41
/*    */     //   1071: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1074: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1077: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1080: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1083: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1086: astore #48
/*    */     //   1088: iconst_0
/*    */     //   1089: istore #49
/*    */     //   1091: aload #46
/*    */     //   1093: astore #50
/*    */     //   1095: iconst_0
/*    */     //   1096: istore #51
/*    */     //   1098: aload #50
/*    */     //   1100: invokeinterface getInserting : ()Z
/*    */     //   1105: ifne -> 1126
/*    */     //   1108: aload #50
/*    */     //   1110: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   1115: iload #40
/*    */     //   1117: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1120: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   1123: ifne -> 1152
/*    */     //   1126: aload #50
/*    */     //   1128: iload #40
/*    */     //   1130: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1133: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   1138: aload #46
/*    */     //   1140: iload #40
/*    */     //   1142: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1145: aload #48
/*    */     //   1147: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1152: nop
/*    */     //   1153: nop
/*    */     //   1154: nop
/*    */     //   1155: aload #46
/*    */     //   1157: aload #42
/*    */     //   1159: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1162: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1165: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1168: nop
/*    */     //   1169: nop
/*    */     //   1170: aload #29
/*    */     //   1172: bipush #14
/*    */     //   1174: iload #44
/*    */     //   1176: bipush #6
/*    */     //   1178: ishr
/*    */     //   1179: iand
/*    */     //   1180: istore #52
/*    */     //   1182: astore #53
/*    */     //   1184: iconst_0
/*    */     //   1185: istore #54
/*    */     //   1187: aload #53
/*    */     //   1189: ldc_w -407840262
/*    */     //   1192: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*    */     //   1195: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1198: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*    */     //   1201: aload #53
/*    */     //   1203: bipush #6
/*    */     //   1205: bipush #112
/*    */     //   1207: iload #35
/*    */     //   1209: bipush #6
/*    */     //   1211: ishr
/*    */     //   1212: iand
/*    */     //   1213: ior
/*    */     //   1214: istore #55
/*    */     //   1216: astore #56
/*    */     //   1218: checkcast androidx/compose/foundation/layout/RowScope
/*    */     //   1221: astore #57
/*    */     //   1223: iconst_0
/*    */     //   1224: istore #58
/*    */     //   1226: iload #4
/*    */     //   1228: ifeq -> 1262
/*    */     //   1231: aload #56
/*    */     //   1233: ldc_w -1744709215
/*    */     //   1236: invokeinterface startReplaceGroup : (I)V
/*    */     //   1241: aconst_null
/*    */     //   1242: lconst_0
/*    */     //   1243: aconst_null
/*    */     //   1244: aload #56
/*    */     //   1246: iconst_0
/*    */     //   1247: bipush #7
/*    */     //   1249: invokestatic JunieCircularProgressIndicator-3IgeMak : (Landroidx/compose/ui/Modifier;JLjava/lang/String;Landroidx/compose/runtime/Composer;II)V
/*    */     //   1252: aload #56
/*    */     //   1254: invokeinterface endReplaceGroup : ()V
/*    */     //   1259: goto -> 1312
/*    */     //   1262: aload #56
/*    */     //   1264: ldc_w -1744624957
/*    */     //   1267: invokeinterface startReplaceGroup : (I)V
/*    */     //   1272: aload_3
/*    */     //   1273: invokevirtual getState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*    */     //   1276: aload #56
/*    */     //   1278: iconst_0
/*    */     //   1279: invokestatic getStateSmallIcon : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/icon/IconKey;
/*    */     //   1282: astore #59
/*    */     //   1284: aload #59
/*    */     //   1286: ldc_w 'Task progress'
/*    */     //   1289: aconst_null
/*    */     //   1290: aconst_null
/*    */     //   1291: lconst_0
/*    */     //   1292: iconst_0
/*    */     //   1293: anewarray org/jetbrains/jewel/ui/painter/PainterHint
/*    */     //   1296: aload #56
/*    */     //   1298: bipush #48
/*    */     //   1300: bipush #28
/*    */     //   1302: invokestatic Icon-FHprtrg : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V
/*    */     //   1305: aload #56
/*    */     //   1307: invokeinterface endReplaceGroup : ()V
/*    */     //   1312: aload_3
/*    */     //   1313: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   1316: dup
/*    */     //   1317: ifnonnull -> 1324
/*    */     //   1320: pop
/*    */     //   1321: ldc_w 'Unnamed'
/*    */     //   1324: astore #59
/*    */     //   1326: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   1329: checkcast androidx/compose/ui/Modifier
/*    */     //   1332: fconst_0
/*    */     //   1333: iconst_1
/*    */     //   1334: aconst_null
/*    */     //   1335: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   1338: astore #60
/*    */     //   1340: getstatic androidx/compose/ui/text/style/TextOverflow.Companion : Landroidx/compose/ui/text/style/TextOverflow$Companion;
/*    */     //   1343: invokevirtual getEllipsis-gIe3tQ8 : ()I
/*    */     //   1346: istore #61
/*    */     //   1348: aload #59
/*    */     //   1350: aload #60
/*    */     //   1352: lconst_0
/*    */     //   1353: lconst_0
/*    */     //   1354: aconst_null
/*    */     //   1355: aconst_null
/*    */     //   1356: aconst_null
/*    */     //   1357: lconst_0
/*    */     //   1358: aconst_null
/*    */     //   1359: iconst_0
/*    */     //   1360: lconst_0
/*    */     //   1361: iload #61
/*    */     //   1363: iconst_0
/*    */     //   1364: iconst_1
/*    */     //   1365: aconst_null
/*    */     //   1366: aconst_null
/*    */     //   1367: aload #56
/*    */     //   1369: bipush #48
/*    */     //   1371: sipush #3120
/*    */     //   1374: ldc_w 55292
/*    */     //   1377: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*    */     //   1380: nop
/*    */     //   1381: aload #53
/*    */     //   1383: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1386: aload #29
/*    */     //   1388: invokeinterface endNode : ()V
/*    */     //   1393: aload #29
/*    */     //   1395: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1398: nop
/*    */     //   1399: aload #29
/*    */     //   1401: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1404: nop
/*    */     //   1405: aload #29
/*    */     //   1407: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1410: nop
/*    */     //   1411: nop
/*    */     //   1412: aload #26
/*    */     //   1414: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1417: aload_1
/*    */     //   1418: invokeinterface endNode : ()V
/*    */     //   1423: aload_1
/*    */     //   1424: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1427: nop
/*    */     //   1428: aload_1
/*    */     //   1429: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1432: nop
/*    */     //   1433: aload_1
/*    */     //   1434: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1437: nop
/*    */     //   1438: invokestatic isTraceInProgress : ()Z
/*    */     //   1441: ifeq -> 1456
/*    */     //   1444: invokestatic traceEventEnd : ()V
/*    */     //   1447: goto -> 1456
/*    */     //   1450: aload_1
/*    */     //   1451: invokeinterface skipToGroupEnd : ()V
/*    */     //   1456: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #83	-> 0
/*    */     //   #85	-> 39
/*    */     //   #84	-> 73
/*    */     //   #88	-> 89
/*    */     //   #127	-> 93
/*    */     //   #128	-> 105
/*    */     //   #129	-> 116
/*    */     //   #88	-> 119
/*    */     //   #129	-> 122
/*    */     //   #130	-> 124
/*    */     //   #131	-> 133
/*    */     //   #132	-> 138
/*    */     //   #128	-> 140
/*    */     //   #127	-> 141
/*    */     //   #127	-> 142
/*    */     //   #88	-> 143
/*    */     //   #87	-> 158
/*    */     //   #88	-> 162
/*    */     //   #89	-> 164
/*    */     //   #87	-> 165
/*    */     //   #91	-> 201
/*    */     //   #133	-> 210
/*    */     //   #134	-> 222
/*    */     //   #135	-> 238
/*    */     //   #91	-> 257
/*    */     //   #135	-> 285
/*    */     //   #136	-> 287
/*    */     //   #137	-> 296
/*    */     //   #138	-> 301
/*    */     //   #134	-> 303
/*    */     //   #133	-> 304
/*    */     //   #133	-> 305
/*    */     //   #91	-> 306
/*    */     //   #90	-> 333
/*    */     //   #139	-> 337
/*    */     //   #140	-> 349
/*    */     //   #141	-> 360
/*    */     //   #141	-> 408
/*    */     //   #142	-> 410
/*    */     //   #143	-> 419
/*    */     //   #144	-> 424
/*    */     //   #140	-> 426
/*    */     //   #139	-> 427
/*    */     //   #139	-> 428
/*    */     //   #90	-> 429
/*    */     //   #87	-> 442
/*    */     //   #86	-> 453
/*    */     //   #145	-> 462
/*    */     //   #146	-> 465
/*    */     //   #147	-> 473
/*    */     //   #150	-> 476
/*    */     //   #151	-> 494
/*    */     //   #152	-> 503
/*    */     //   #153	-> 508
/*    */     //   #154	-> 514
/*    */     //   #155	-> 522
/*    */     //   #157	-> 529
/*    */     //   #156	-> 551
/*    */     //   #158	-> 560
/*    */     //   #159	-> 563
/*    */     //   #160	-> 579
/*    */     //   #161	-> 584
/*    */     //   #162	-> 594
/*    */     //   #164	-> 605
/*    */     //   #166	-> 610
/*    */     //   #167	-> 619
/*    */     //   #168	-> 632
/*    */     //   #170	-> 645
/*    */     //   #171	-> 656
/*    */     //   #172	-> 663
/*    */     //   #173	-> 691
/*    */     //   #174	-> 703
/*    */     //   #176	-> 717
/*    */     //   #171	-> 718
/*    */     //   #176	-> 719
/*    */     //   #177	-> 720
/*    */     //   #178	-> 733
/*    */     //   #166	-> 734
/*    */     //   #179	-> 735
/*    */     //   #180	-> 759
/*    */     //   #95	-> 790
/*    */     //   #181	-> 804
/*    */     //   #95	-> 810
/*    */     //   #181	-> 818
/*    */     //   #95	-> 824
/*    */     //   #96	-> 831
/*    */     //   #97	-> 839
/*    */     //   #182	-> 849
/*    */     //   #97	-> 855
/*    */     //   #94	-> 865
/*    */     //   #183	-> 877
/*    */     //   #184	-> 880
/*    */     //   #185	-> 918
/*    */     //   #186	-> 928
/*    */     //   #187	-> 934
/*    */     //   #188	-> 941
/*    */     //   #189	-> 950
/*    */     //   #191	-> 957
/*    */     //   #190	-> 979
/*    */     //   #192	-> 989
/*    */     //   #193	-> 992
/*    */     //   #194	-> 1010
/*    */     //   #195	-> 1015
/*    */     //   #196	-> 1027
/*    */     //   #198	-> 1039
/*    */     //   #200	-> 1044
/*    */     //   #201	-> 1054
/*    */     //   #202	-> 1067
/*    */     //   #204	-> 1080
/*    */     //   #205	-> 1091
/*    */     //   #206	-> 1098
/*    */     //   #207	-> 1126
/*    */     //   #208	-> 1138
/*    */     //   #210	-> 1152
/*    */     //   #205	-> 1153
/*    */     //   #210	-> 1154
/*    */     //   #211	-> 1155
/*    */     //   #212	-> 1168
/*    */     //   #200	-> 1169
/*    */     //   #213	-> 1170
/*    */     //   #214	-> 1195
/*    */     //   #99	-> 1226
/*    */     //   #100	-> 1249
/*    */     //   #99	-> 1252
/*    */     //   #101	-> 1262
/*    */     //   #102	-> 1272
/*    */     //   #104	-> 1284
/*    */     //   #105	-> 1286
/*    */     //   #103	-> 1302
/*    */     //   #101	-> 1305
/*    */     //   #110	-> 1312
/*    */     //   #111	-> 1326
/*    */     //   #113	-> 1340
/*    */     //   #110	-> 1348
/*    */     //   #111	-> 1350
/*    */     //   #113	-> 1361
/*    */     //   #112	-> 1364
/*    */     //   #109	-> 1377
/*    */     //   #115	-> 1380
/*    */     //   #214	-> 1381
/*    */     //   #213	-> 1386
/*    */     //   #215	-> 1388
/*    */     //   #192	-> 1395
/*    */     //   #216	-> 1398
/*    */     //   #186	-> 1401
/*    */     //   #217	-> 1404
/*    */     //   #183	-> 1407
/*    */     //   #218	-> 1410
/*    */     //   #116	-> 1411
/*    */     //   #180	-> 1412
/*    */     //   #179	-> 1417
/*    */     //   #219	-> 1418
/*    */     //   #158	-> 1424
/*    */     //   #220	-> 1427
/*    */     //   #152	-> 1429
/*    */     //   #221	-> 1432
/*    */     //   #145	-> 1434
/*    */     //   #222	-> 1437
/*    */     //   #116	-> 1450
/*    */     //   #117	-> 1456
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   119	3	12	$i$a$-cache-TaskListKt$TaskList$1$1$1$1$1$1$2$1	I
/*    */     //   124	11	12	value$iv	Ljava/lang/Object;
/*    */     //   105	36	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   102	39	10	it$iv	Ljava/lang/Object;
/*    */     //   93	50	9	$i$f$cache	I
/*    */     //   90	53	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   90	53	8	invalid$iv	Z
/*    */     //   257	8	13	$i$a$-cache-TaskListKt$TaskList$1$1$1$1$1$1$2$2	I
/*    */     //   287	11	14	value$iv	Ljava/lang/Object;
/*    */     //   222	82	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   219	85	11	it$iv	Ljava/lang/Object;
/*    */     //   210	96	10	$i$f$cache	I
/*    */     //   207	99	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   207	99	8	invalid$iv	Z
/*    */     //   381	5	12	$i$a$-cache-TaskListKt$TaskList$1$1$1$1$1$1$2$3	I
/*    */     //   410	11	12	value$iv	Ljava/lang/Object;
/*    */     //   349	78	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   346	81	10	it$iv	Ljava/lang/Object;
/*    */     //   337	92	9	$i$f$cache	I
/*    */     //   334	95	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   334	95	8	invalid$iv	Z
/*    */     //   804	6	33	$i$f$getDp	I
/*    */     //   801	9	32	$this$dp$iv	I
/*    */     //   818	6	33	$i$f$getDp	I
/*    */     //   815	9	32	$this$dp$iv	I
/*    */     //   849	6	36	$i$f$getDp	I
/*    */     //   846	9	35	$this$dp$iv	I
/*    */     //   1284	21	59	stateSmallIcon	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*    */     //   1226	155	58	$i$a$-Row-TaskListKt$TaskList$1$1$1$1$1$1$2$4$1	I
/*    */     //   1223	158	57	$this$invoke_u24lambda_u246_u24lambda_u245	Landroidx/compose/foundation/layout/RowScope;
/*    */     //   1223	158	56	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   1223	158	55	$changed	I
/*    */     //   1187	199	54	$i$a$-Layout-RowKt$Row$1$iv	I
/*    */     //   1184	202	53	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1184	202	52	$changed$iv	I
/*    */     //   1098	55	51	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   1095	58	50	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1091	64	49	$i$f$set-impl	I
/*    */     //   1088	67	48	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   1054	115	47	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   1051	118	46	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   983	416	45	$i$f$ReusableComposeNode	I
/*    */     //   980	419	43	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   980	419	44	$changed$iv$iv$iv	I
/*    */     //   922	483	39	$i$f$Layout	I
/*    */     //   939	466	40	compositeKeyHash$iv$iv	I
/*    */     //   948	457	41	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   957	448	42	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   919	486	38	$changed$iv$iv	I
/*    */     //   869	542	36	$i$f$Row	I
/*    */     //   909	502	37	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   866	545	35	$changed$iv	I
/*    */     //   790	622	31	$i$a$-Box-TaskListKt$TaskList$1$1$1$1$1$1$2$4	I
/*    */     //   787	625	30	$this$invoke_u24lambda_u246	Landroidx/compose/foundation/layout/BoxScope;
/*    */     //   787	625	29	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   787	625	28	$changed	I
/*    */     //   751	666	27	$i$a$-Layout-BoxKt$Box$1$iv	I
/*    */     //   748	669	26	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   748	669	25	$changed$iv	I
/*    */     //   663	55	24	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   660	58	23	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   656	64	22	$i$f$set-impl	I
/*    */     //   653	67	21	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   619	115	20	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   616	118	19	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   555	873	18	$i$f$ReusableComposeNode	I
/*    */     //   552	876	16	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   552	876	17	$changed$iv$iv$iv	I
/*    */     //   498	935	12	$i$f$Layout	I
/*    */     //   513	920	13	compositeKeyHash$iv$iv	I
/*    */     //   521	912	14	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   529	904	15	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   495	938	11	$changed$iv$iv	I
/*    */     //   457	981	9	$i$f$Box	I
/*    */     //   485	953	10	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   454	984	5	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */     //   473	965	6	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*    */     //   476	962	7	propagateMinConstraints$iv	Z
/*    */     //   454	984	8	$changed$iv	I
/*    */     //   39	1408	3	recentTask	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;
/*    */     //   75	1372	4	isTaskRunningOrWaiting	Z
/*    */     //   0	1457	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/TaskListKt$TaskList$1$1$1$1$1$1$2;
/*    */     //   0	1457	1	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	1457	2	$changed	I
/*    */   }
/*    */   
/*    */   private static final Unit invoke$lambda$4$lambda$3() {
/* 90 */     return Unit.INSTANCE; } private static final Unit invoke$lambda$2$lambda$1(Function1 $onTaskDoubleClicked, RecentTaskChain $recentTask) {
/* 91 */     $onTaskDoubleClicked.invoke($recentTask.getTaskChainId()); return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   TaskListKt$TaskList$1$1$1$1$1$1$2(SortedRecentTaskChain $sortedTask, Modifier $modifier, Function1<TaskChainId, Unit> $onTaskDoubleClicked) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\create\TaskListKt$TaskList$1$1$1$1$1$1$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */