/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.StepType;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.LiveTaskSnapshot;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.StepEntity;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskEntity;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ 
/*     */ @DebugMetadata(f = "DebugTaskLauncher.kt", l = {26, 28, 30, 32, 45, 47, 51, 52, 67, 80, 94, 95, 96, 98, 111}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.DebugTaskLauncher$launch$2")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class DebugTaskLauncher$launch$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */   int label;
/*     */   
/*     */   DebugTaskLauncher$launch$2(TaskEntity $task, TaskSnapshotUpdater $updater, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   3: astore_2
/*     */     //   4: aload_0
/*     */     //   5: getfield label : I
/*     */     //   8: tableswitch default -> 753, 0 -> 88, 1 -> 114, 2 -> 181, 3 -> 217, 4 -> 245, 5 -> 287, 6 -> 337, 7 -> 409, 8 -> 444, 9 -> 491, 10 -> 534, 11 -> 601, 12 -> 630, 13 -> 665, 14 -> 694, 15 -> 743
/*     */     //   88: aload_1
/*     */     //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   92: ldc2_w 500
/*     */     //   95: aload_0
/*     */     //   96: checkcast kotlin/coroutines/Continuation
/*     */     //   99: aload_0
/*     */     //   100: iconst_1
/*     */     //   101: putfield label : I
/*     */     //   104: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   107: dup
/*     */     //   108: aload_2
/*     */     //   109: if_acmpne -> 119
/*     */     //   112: aload_2
/*     */     //   113: areturn
/*     */     //   114: aload_1
/*     */     //   115: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   118: aload_1
/*     */     //   119: pop
/*     */     //   120: aload_0
/*     */     //   121: getfield $task : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*     */     //   124: invokevirtual getDescription : ()Ljava/lang/String;
/*     */     //   127: ldc 'title:'
/*     */     //   129: iconst_0
/*     */     //   130: iconst_2
/*     */     //   131: aconst_null
/*     */     //   132: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*     */     //   135: ifeq -> 190
/*     */     //   138: aload_0
/*     */     //   139: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   142: aload_0
/*     */     //   143: getfield $task : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*     */     //   146: invokevirtual getDescription : ()Ljava/lang/String;
/*     */     //   149: bipush #6
/*     */     //   151: invokevirtual substring : (I)Ljava/lang/String;
/*     */     //   154: dup
/*     */     //   155: ldc 'substring(...)'
/*     */     //   157: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   160: aload_0
/*     */     //   161: checkcast kotlin/coroutines/Continuation
/*     */     //   164: aload_0
/*     */     //   165: iconst_2
/*     */     //   166: putfield label : I
/*     */     //   169: invokeinterface tryUpdateName : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   174: dup
/*     */     //   175: aload_2
/*     */     //   176: if_acmpne -> 186
/*     */     //   179: aload_2
/*     */     //   180: areturn
/*     */     //   181: aload_1
/*     */     //   182: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   185: aload_1
/*     */     //   186: pop
/*     */     //   187: goto -> 223
/*     */     //   190: aload_0
/*     */     //   191: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   194: ldc 'Task description'
/*     */     //   196: aload_0
/*     */     //   197: checkcast kotlin/coroutines/Continuation
/*     */     //   200: aload_0
/*     */     //   201: iconst_3
/*     */     //   202: putfield label : I
/*     */     //   205: invokeinterface tryUpdateName : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   210: dup
/*     */     //   211: aload_2
/*     */     //   212: if_acmpne -> 222
/*     */     //   215: aload_2
/*     */     //   216: areturn
/*     */     //   217: aload_1
/*     */     //   218: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   221: aload_1
/*     */     //   222: pop
/*     */     //   223: ldc2_w 1000
/*     */     //   226: aload_0
/*     */     //   227: checkcast kotlin/coroutines/Continuation
/*     */     //   230: aload_0
/*     */     //   231: iconst_4
/*     */     //   232: putfield label : I
/*     */     //   235: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   238: dup
/*     */     //   239: aload_2
/*     */     //   240: if_acmpne -> 250
/*     */     //   243: aload_2
/*     */     //   244: areturn
/*     */     //   245: aload_1
/*     */     //   246: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   249: aload_1
/*     */     //   250: pop
/*     */     //   251: aload_0
/*     */     //   252: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   255: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   260: invokeinterface update : (Lkotlin/jvm/functions/Function1;)V
/*     */     //   265: ldc2_w 1000
/*     */     //   268: aload_0
/*     */     //   269: checkcast kotlin/coroutines/Continuation
/*     */     //   272: aload_0
/*     */     //   273: iconst_5
/*     */     //   274: putfield label : I
/*     */     //   277: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   280: dup
/*     */     //   281: aload_2
/*     */     //   282: if_acmpne -> 292
/*     */     //   285: aload_2
/*     */     //   286: areturn
/*     */     //   287: aload_1
/*     */     //   288: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   291: aload_1
/*     */     //   292: pop
/*     */     //   293: aload_0
/*     */     //   294: getfield $task : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*     */     //   297: invokevirtual getDescription : ()Ljava/lang/String;
/*     */     //   300: ldc 'error'
/*     */     //   302: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   305: ifeq -> 347
/*     */     //   308: aload_0
/*     */     //   309: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   312: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Failed : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   315: aload_0
/*     */     //   316: checkcast kotlin/coroutines/Continuation
/*     */     //   319: aload_0
/*     */     //   320: bipush #6
/*     */     //   322: putfield label : I
/*     */     //   325: invokeinterface updateState : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   330: dup
/*     */     //   331: aload_2
/*     */     //   332: if_acmpne -> 342
/*     */     //   335: aload_2
/*     */     //   336: areturn
/*     */     //   337: aload_1
/*     */     //   338: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   341: aload_1
/*     */     //   342: pop
/*     */     //   343: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   346: areturn
/*     */     //   347: aload_0
/*     */     //   348: getfield $task : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*     */     //   351: invokevirtual getDescription : ()Ljava/lang/String;
/*     */     //   354: ldc 'error:'
/*     */     //   356: iconst_0
/*     */     //   357: iconst_2
/*     */     //   358: aconst_null
/*     */     //   359: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*     */     //   362: ifeq -> 454
/*     */     //   365: aload_0
/*     */     //   366: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   369: aload_0
/*     */     //   370: getfield $task : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*     */     //   373: invokevirtual getDescription : ()Ljava/lang/String;
/*     */     //   376: bipush #6
/*     */     //   378: invokevirtual substring : (I)Ljava/lang/String;
/*     */     //   381: dup
/*     */     //   382: ldc 'substring(...)'
/*     */     //   384: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   387: aload_0
/*     */     //   388: checkcast kotlin/coroutines/Continuation
/*     */     //   391: aload_0
/*     */     //   392: bipush #7
/*     */     //   394: putfield label : I
/*     */     //   397: invokeinterface updateError : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   402: dup
/*     */     //   403: aload_2
/*     */     //   404: if_acmpne -> 414
/*     */     //   407: aload_2
/*     */     //   408: areturn
/*     */     //   409: aload_1
/*     */     //   410: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   413: aload_1
/*     */     //   414: pop
/*     */     //   415: aload_0
/*     */     //   416: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   419: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Failed : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   422: aload_0
/*     */     //   423: checkcast kotlin/coroutines/Continuation
/*     */     //   426: aload_0
/*     */     //   427: bipush #8
/*     */     //   429: putfield label : I
/*     */     //   432: invokeinterface updateState : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   437: dup
/*     */     //   438: aload_2
/*     */     //   439: if_acmpne -> 449
/*     */     //   442: aload_2
/*     */     //   443: areturn
/*     */     //   444: aload_1
/*     */     //   445: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   448: aload_1
/*     */     //   449: pop
/*     */     //   450: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   453: areturn
/*     */     //   454: aload_0
/*     */     //   455: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   458: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   463: invokeinterface update : (Lkotlin/jvm/functions/Function1;)V
/*     */     //   468: ldc2_w 1000
/*     */     //   471: aload_0
/*     */     //   472: checkcast kotlin/coroutines/Continuation
/*     */     //   475: aload_0
/*     */     //   476: bipush #9
/*     */     //   478: putfield label : I
/*     */     //   481: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   484: dup
/*     */     //   485: aload_2
/*     */     //   486: if_acmpne -> 496
/*     */     //   489: aload_2
/*     */     //   490: areturn
/*     */     //   491: aload_1
/*     */     //   492: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   495: aload_1
/*     */     //   496: pop
/*     */     //   497: aload_0
/*     */     //   498: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   501: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   506: invokeinterface update : (Lkotlin/jvm/functions/Function1;)V
/*     */     //   511: ldc2_w 1000
/*     */     //   514: aload_0
/*     */     //   515: checkcast kotlin/coroutines/Continuation
/*     */     //   518: aload_0
/*     */     //   519: bipush #10
/*     */     //   521: putfield label : I
/*     */     //   524: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   527: dup
/*     */     //   528: aload_2
/*     */     //   529: if_acmpne -> 539
/*     */     //   532: aload_2
/*     */     //   533: areturn
/*     */     //   534: aload_1
/*     */     //   535: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   538: aload_1
/*     */     //   539: pop
/*     */     //   540: aload_0
/*     */     //   541: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   544: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   549: invokeinterface update : (Lkotlin/jvm/functions/Function1;)V
/*     */     //   554: aload_0
/*     */     //   555: getfield $task : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*     */     //   558: invokevirtual getDescription : ()Ljava/lang/String;
/*     */     //   561: ldc 'terminal:'
/*     */     //   563: iconst_0
/*     */     //   564: iconst_2
/*     */     //   565: aconst_null
/*     */     //   566: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*     */     //   569: ifeq -> 671
/*     */     //   572: aload_0
/*     */     //   573: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   576: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.WaitingUserInput : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   579: aload_0
/*     */     //   580: checkcast kotlin/coroutines/Continuation
/*     */     //   583: aload_0
/*     */     //   584: bipush #11
/*     */     //   586: putfield label : I
/*     */     //   589: invokeinterface updateState : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   594: dup
/*     */     //   595: aload_2
/*     */     //   596: if_acmpne -> 606
/*     */     //   599: aload_2
/*     */     //   600: areturn
/*     */     //   601: aload_1
/*     */     //   602: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   605: aload_1
/*     */     //   606: pop
/*     */     //   607: ldc2_w 10000
/*     */     //   610: aload_0
/*     */     //   611: checkcast kotlin/coroutines/Continuation
/*     */     //   614: aload_0
/*     */     //   615: bipush #12
/*     */     //   617: putfield label : I
/*     */     //   620: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   623: dup
/*     */     //   624: aload_2
/*     */     //   625: if_acmpne -> 635
/*     */     //   628: aload_2
/*     */     //   629: areturn
/*     */     //   630: aload_1
/*     */     //   631: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   634: aload_1
/*     */     //   635: pop
/*     */     //   636: aload_0
/*     */     //   637: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   640: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Running : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   643: aload_0
/*     */     //   644: checkcast kotlin/coroutines/Continuation
/*     */     //   647: aload_0
/*     */     //   648: bipush #13
/*     */     //   650: putfield label : I
/*     */     //   653: invokeinterface updateState : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   658: dup
/*     */     //   659: aload_2
/*     */     //   660: if_acmpne -> 670
/*     */     //   663: aload_2
/*     */     //   664: areturn
/*     */     //   665: aload_1
/*     */     //   666: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   669: aload_1
/*     */     //   670: pop
/*     */     //   671: ldc2_w 1000
/*     */     //   674: aload_0
/*     */     //   675: checkcast kotlin/coroutines/Continuation
/*     */     //   678: aload_0
/*     */     //   679: bipush #14
/*     */     //   681: putfield label : I
/*     */     //   684: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   687: dup
/*     */     //   688: aload_2
/*     */     //   689: if_acmpne -> 699
/*     */     //   692: aload_2
/*     */     //   693: areturn
/*     */     //   694: aload_1
/*     */     //   695: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   698: aload_1
/*     */     //   699: pop
/*     */     //   700: aload_0
/*     */     //   701: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   704: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   709: invokeinterface update : (Lkotlin/jvm/functions/Function1;)V
/*     */     //   714: aload_0
/*     */     //   715: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   718: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Finished : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   721: aload_0
/*     */     //   722: checkcast kotlin/coroutines/Continuation
/*     */     //   725: aload_0
/*     */     //   726: bipush #15
/*     */     //   728: putfield label : I
/*     */     //   731: invokeinterface updateState : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   736: dup
/*     */     //   737: aload_2
/*     */     //   738: if_acmpne -> 748
/*     */     //   741: aload_2
/*     */     //   742: areturn
/*     */     //   743: aload_1
/*     */     //   744: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   747: aload_1
/*     */     //   748: pop
/*     */     //   749: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   752: areturn
/*     */     //   753: new java/lang/IllegalStateException
/*     */     //   756: dup
/*     */     //   757: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   759: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   762: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #25	-> 3
/*     */     //   #26	-> 92
/*     */     //   #25	-> 112
/*     */     //   #27	-> 119
/*     */     //   #28	-> 138
/*     */     //   #28	-> 164
/*     */     //   #25	-> 179
/*     */     //   #28	-> 186
/*     */     //   #30	-> 190
/*     */     //   #25	-> 215
/*     */     //   #32	-> 222
/*     */     //   #25	-> 243
/*     */     //   #33	-> 250
/*     */     //   #45	-> 265
/*     */     //   #25	-> 285
/*     */     //   #46	-> 292
/*     */     //   #47	-> 308
/*     */     //   #25	-> 335
/*     */     //   #48	-> 342
/*     */     //   #50	-> 347
/*     */     //   #51	-> 365
/*     */     //   #51	-> 391
/*     */     //   #25	-> 407
/*     */     //   #52	-> 414
/*     */     //   #25	-> 442
/*     */     //   #53	-> 449
/*     */     //   #55	-> 454
/*     */     //   #67	-> 468
/*     */     //   #25	-> 489
/*     */     //   #68	-> 496
/*     */     //   #80	-> 511
/*     */     //   #25	-> 532
/*     */     //   #81	-> 539
/*     */     //   #93	-> 554
/*     */     //   #94	-> 572
/*     */     //   #25	-> 599
/*     */     //   #95	-> 606
/*     */     //   #25	-> 628
/*     */     //   #96	-> 635
/*     */     //   #25	-> 663
/*     */     //   #98	-> 670
/*     */     //   #25	-> 692
/*     */     //   #99	-> 699
/*     */     //   #111	-> 714
/*     */     //   #25	-> 741
/*     */     //   #112	-> 748
/*     */     //   #25	-> 753
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	763	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/DebugTaskLauncher$launch$2;
/*     */     //   92	661	1	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super DebugTaskLauncher$launch$2> $completion) {
/*     */     return (Continuation<Unit>)new DebugTaskLauncher$launch$2(this.$task, this.$updater, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((DebugTaskLauncher$launch$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */   
/*     */   private static final LiveTaskSnapshot invokeSuspend$lambda$0(LiveTaskSnapshot it) {
/*  37 */     StepType stepType = StepType.Edit;
/*     */     
/*  39 */     return LiveTaskSnapshot.copy$default(it, null, null, it.getSteps().add(new StepEntity("templates/Index.html +12-1", stepType, "The index() function has been updated to pass project data, including task counts and total costs, to the Index.hml template after modifications to the load_project_data() function were completed.", null, null, 
/*  40 */             Long.valueOf(2000L), 24, null)), null, null, 27, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final LiveTaskSnapshot invokeSuspend$lambda$1(LiveTaskSnapshot it) {
/*  59 */     StepType stepType = StepType.Info;
/*     */     
/*  61 */     return LiveTaskSnapshot.copy$default(it, null, null, it.getSteps().add(new StepEntity("3 v 7 x", stepType, "The Index.html template was updated to display projects in a vertical list with task counts and total costs. However, running tests with pytest encountered an import error due to a missing module and an address conflict, which prevented successful execution.", null, null, 
/*  62 */             Long.valueOf(2600L), 24, null)), null, null, 27, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final LiveTaskSnapshot invokeSuspend$lambda$2(LiveTaskSnapshot it) {
/*  72 */     StepType stepType = StepType.Tests;
/*     */     
/*  74 */     return LiveTaskSnapshot.copy$default(it, null, null, it.getSteps().add(new StepEntity("3 v 7 x", stepType, "The Index.html template was updated to display projects in a vertical list with task counts and total costs. However, running tests with pytest encountered an import error due to a missing module and an address conflict, which prevented successful execution.", null, null, 
/*  75 */             Long.valueOf(2600L), 24, null)), null, null, 27, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final LiveTaskSnapshot invokeSuspend$lambda$3(LiveTaskSnapshot it) {
/*  85 */     StepType stepType = StepType.Terminal;
/*     */     
/*  87 */     return LiveTaskSnapshot.copy$default(it, null, null, it.getSteps().add(new StepEntity("kill -9 72469 72874", stepType, "The projectʼs Index.html has been updated to display a vertical list of projects, showing task counts and total costs. However, test execution revealed an ImportError related to the app module and a port conflict, preventing successful test runs.", null, null, 
/*  88 */             Long.valueOf(3800L), 24, null)), null, null, 27, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final LiveTaskSnapshot invokeSuspend$lambda$4(LiveTaskSnapshot it) {
/* 103 */     StepType stepType = StepType.Report;
/*     */     
/* 105 */     return LiveTaskSnapshot.copy$default(it, null, null, it.getSteps().add(new StepEntity("null", stepType, "The project has been updated to display a vertical list of projects, showing task counts and total costs.", null, null, 
/* 106 */             Long.valueOf(0L), 24, null)), null, null, 27, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\DebugTaskLauncher$launch$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */