/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*    */ 
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import androidx.compose.runtime.State;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header.Action;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskStep;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.Unit;
/*    */ import kotlin.reflect.KProperty;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000$\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\032\025\020\000\032\0020\0012\006\020\002\032\0020\003H\001¢\006\002\020\004¨\006\005²\006\n\020\006\032\0020\007X\002²\006\020\020\b\032\b\022\004\022\0020\n0\tX\002²\006\020\020\013\032\b\022\004\022\0020\f0\tX\002"}, d2 = {"TerminalStep", "", "terminal", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Terminal;", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Terminal;Landroidx/compose/runtime/Composer;I)V", "ej-ui", "actionRefreshKey", "", "additionalActions", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "actionNames", ""})
/*    */ @SourceDebugExtension({"SMAP\nTerminal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Terminal.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TerminalKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1225#2,6:41\n1225#2,6:47\n1225#2,6:53\n1225#2,6:59\n81#3:65\n107#3,2:66\n81#3:68\n81#3:73\n1557#4:69\n1628#4,3:70\n*S KotlinDebug\n*F\n+ 1 Terminal.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TerminalKt\n*L\n16#1:41,6\n17#1:47,6\n21#1:53,6\n29#1:59,6\n16#1:65\n16#1:66,2\n17#1:68\n21#1:73\n21#1:69\n21#1:70,3\n*E\n"})
/*    */ public final class TerminalKt {
/* 16 */   private static final int TerminalStep$lambda$1(MutableState $actionRefreshKey$delegate) { State state = (State)$actionRefreshKey$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
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
/* 65 */       (Number)state.getValue()).intValue(); }
/*    */   @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void TerminalStep(@NotNull TaskStep.Terminal terminal, @Nullable Composer $composer, int $changed) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'terminal'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: ldc 1266544227
/*    */     //   9: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   14: astore_1
/*    */     //   15: iload_2
/*    */     //   16: istore_3
/*    */     //   17: iload_2
/*    */     //   18: bipush #6
/*    */     //   20: iand
/*    */     //   21: ifne -> 42
/*    */     //   24: iload_3
/*    */     //   25: aload_1
/*    */     //   26: aload_0
/*    */     //   27: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   32: ifeq -> 39
/*    */     //   35: iconst_4
/*    */     //   36: goto -> 40
/*    */     //   39: iconst_2
/*    */     //   40: ior
/*    */     //   41: istore_3
/*    */     //   42: iload_3
/*    */     //   43: iconst_3
/*    */     //   44: iand
/*    */     //   45: iconst_2
/*    */     //   46: if_icmpne -> 58
/*    */     //   49: aload_1
/*    */     //   50: invokeinterface getSkipping : ()Z
/*    */     //   55: ifne -> 627
/*    */     //   58: invokestatic isTraceInProgress : ()Z
/*    */     //   61: ifeq -> 73
/*    */     //   64: ldc 1266544227
/*    */     //   66: iload_3
/*    */     //   67: iconst_m1
/*    */     //   68: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.TerminalStep (Terminal.kt:14)'
/*    */     //   70: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   73: aload_1
/*    */     //   74: ldc -21487345
/*    */     //   76: invokeinterface startReplaceGroup : (I)V
/*    */     //   81: aload_1
/*    */     //   82: astore #6
/*    */     //   84: iconst_0
/*    */     //   85: istore #7
/*    */     //   87: nop
/*    */     //   88: iconst_0
/*    */     //   89: istore #8
/*    */     //   91: aload #6
/*    */     //   93: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   98: astore #9
/*    */     //   100: iconst_0
/*    */     //   101: istore #10
/*    */     //   103: aload #9
/*    */     //   105: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   108: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   111: if_acmpne -> 143
/*    */     //   114: iconst_0
/*    */     //   115: istore #11
/*    */     //   117: iconst_0
/*    */     //   118: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   121: aconst_null
/*    */     //   122: iconst_2
/*    */     //   123: aconst_null
/*    */     //   124: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*    */     //   127: astore #11
/*    */     //   129: aload #6
/*    */     //   131: aload #11
/*    */     //   133: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   138: aload #11
/*    */     //   140: goto -> 145
/*    */     //   143: aload #9
/*    */     //   145: nop
/*    */     //   146: nop
/*    */     //   147: nop
/*    */     //   148: checkcast androidx/compose/runtime/MutableState
/*    */     //   151: astore #5
/*    */     //   153: aload_1
/*    */     //   154: invokeinterface endReplaceGroup : ()V
/*    */     //   159: aload #5
/*    */     //   161: astore #4
/*    */     //   163: aload #4
/*    */     //   165: invokestatic TerminalStep$lambda$1 : (Landroidx/compose/runtime/MutableState;)I
/*    */     //   168: istore #6
/*    */     //   170: aload_0
/*    */     //   171: invokevirtual getActionApprovalRequestData : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;
/*    */     //   174: astore #7
/*    */     //   176: aload_1
/*    */     //   177: ldc -21485394
/*    */     //   179: invokeinterface startReplaceGroup : (I)V
/*    */     //   184: aload_1
/*    */     //   185: astore #9
/*    */     //   187: aload_1
/*    */     //   188: iload #6
/*    */     //   190: invokeinterface changed : (I)Z
/*    */     //   195: aload_1
/*    */     //   196: aload #7
/*    */     //   198: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   203: ior
/*    */     //   204: istore #10
/*    */     //   206: iconst_0
/*    */     //   207: istore #11
/*    */     //   209: aload #9
/*    */     //   211: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   216: astore #12
/*    */     //   218: iconst_0
/*    */     //   219: istore #13
/*    */     //   221: iload #10
/*    */     //   223: ifne -> 237
/*    */     //   226: aload #12
/*    */     //   228: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   231: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   234: if_acmpne -> 271
/*    */     //   237: iconst_0
/*    */     //   238: istore #14
/*    */     //   240: aload_0
/*    */     //   241: invokevirtual getRetrieveAdditionalActions : ()Lkotlin/jvm/functions/Function0;
/*    */     //   244: invokeinterface invoke : ()Ljava/lang/Object;
/*    */     //   249: aconst_null
/*    */     //   250: iconst_2
/*    */     //   251: aconst_null
/*    */     //   252: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*    */     //   255: astore #15
/*    */     //   257: aload #9
/*    */     //   259: aload #15
/*    */     //   261: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   266: aload #15
/*    */     //   268: goto -> 273
/*    */     //   271: aload #12
/*    */     //   273: nop
/*    */     //   274: nop
/*    */     //   275: nop
/*    */     //   276: checkcast androidx/compose/runtime/MutableState
/*    */     //   279: astore #8
/*    */     //   281: aload_1
/*    */     //   282: invokeinterface endReplaceGroup : ()V
/*    */     //   287: aload #8
/*    */     //   289: astore #5
/*    */     //   291: aload_1
/*    */     //   292: ldc -21480266
/*    */     //   294: invokeinterface startReplaceGroup : (I)V
/*    */     //   299: aload_1
/*    */     //   300: astore #8
/*    */     //   302: aload_1
/*    */     //   303: aload #5
/*    */     //   305: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   310: istore #9
/*    */     //   312: nop
/*    */     //   313: iconst_0
/*    */     //   314: istore #10
/*    */     //   316: aload #8
/*    */     //   318: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   323: astore #11
/*    */     //   325: iconst_0
/*    */     //   326: istore #12
/*    */     //   328: iload #9
/*    */     //   330: ifne -> 344
/*    */     //   333: aload #11
/*    */     //   335: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   338: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   341: if_acmpne -> 370
/*    */     //   344: iconst_0
/*    */     //   345: istore #13
/*    */     //   347: aload #5
/*    */     //   349: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*    */     //   354: astore #14
/*    */     //   356: aload #8
/*    */     //   358: aload #14
/*    */     //   360: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   365: aload #14
/*    */     //   367: goto -> 372
/*    */     //   370: aload #11
/*    */     //   372: nop
/*    */     //   373: nop
/*    */     //   374: nop
/*    */     //   375: checkcast kotlin/jvm/functions/Function0
/*    */     //   378: astore #7
/*    */     //   380: aload_1
/*    */     //   381: invokeinterface endReplaceGroup : ()V
/*    */     //   386: aload #7
/*    */     //   388: invokestatic derivedStateOf : (Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;
/*    */     //   391: astore #6
/*    */     //   393: aload_0
/*    */     //   394: invokevirtual getDescription : ()Ljava/lang/String;
/*    */     //   397: aload_0
/*    */     //   398: invokevirtual getCommand : ()Ljava/lang/String;
/*    */     //   401: aload_0
/*    */     //   402: invokevirtual getOnStop : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*    */     //   405: ifnull -> 412
/*    */     //   408: iconst_1
/*    */     //   409: goto -> 413
/*    */     //   412: iconst_0
/*    */     //   413: aload_0
/*    */     //   414: invokevirtual getWaitingForApproval : ()Z
/*    */     //   417: aload #6
/*    */     //   419: invokestatic TerminalStep$lambda$8 : (Landroidx/compose/runtime/State;)Ljava/util/List;
/*    */     //   422: aload_1
/*    */     //   423: ldc -21471413
/*    */     //   425: invokeinterface startReplaceGroup : (I)V
/*    */     //   430: aload_1
/*    */     //   431: astore #8
/*    */     //   433: aload_1
/*    */     //   434: aload #5
/*    */     //   436: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   441: istore #9
/*    */     //   443: nop
/*    */     //   444: iconst_0
/*    */     //   445: istore #10
/*    */     //   447: aload #8
/*    */     //   449: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   454: astore #11
/*    */     //   456: iconst_0
/*    */     //   457: istore #12
/*    */     //   459: iload #9
/*    */     //   461: ifne -> 475
/*    */     //   464: aload #11
/*    */     //   466: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   469: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   472: if_acmpne -> 527
/*    */     //   475: astore #20
/*    */     //   477: istore #19
/*    */     //   479: istore #18
/*    */     //   481: astore #17
/*    */     //   483: astore #16
/*    */     //   485: iconst_0
/*    */     //   486: istore #13
/*    */     //   488: aload #5
/*    */     //   490: aload #4
/*    */     //   492: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*    */     //   497: astore #21
/*    */     //   499: aload #16
/*    */     //   501: aload #17
/*    */     //   503: iload #18
/*    */     //   505: iload #19
/*    */     //   507: aload #20
/*    */     //   509: aload #21
/*    */     //   511: astore #14
/*    */     //   513: aload #8
/*    */     //   515: aload #14
/*    */     //   517: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   522: aload #14
/*    */     //   524: goto -> 529
/*    */     //   527: aload #11
/*    */     //   529: nop
/*    */     //   530: nop
/*    */     //   531: nop
/*    */     //   532: checkcast kotlin/jvm/functions/Function1
/*    */     //   535: astore #7
/*    */     //   537: aload_1
/*    */     //   538: invokeinterface endReplaceGroup : ()V
/*    */     //   543: aload #7
/*    */     //   545: aload_0
/*    */     //   546: invokevirtual getOnStop : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*    */     //   549: dup
/*    */     //   550: ifnull -> 559
/*    */     //   553: invokevirtual getAction : ()Lkotlin/jvm/functions/Function0;
/*    */     //   556: goto -> 561
/*    */     //   559: pop
/*    */     //   560: aconst_null
/*    */     //   561: aload_0
/*    */     //   562: invokevirtual getOnOpen : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*    */     //   565: dup
/*    */     //   566: ifnull -> 575
/*    */     //   569: invokevirtual getAction : ()Lkotlin/jvm/functions/Function0;
/*    */     //   572: goto -> 577
/*    */     //   575: pop
/*    */     //   576: aconst_null
/*    */     //   577: aload_0
/*    */     //   578: invokevirtual getActionApprovalRequestData : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;
/*    */     //   581: dup
/*    */     //   582: ifnull -> 591
/*    */     //   585: invokevirtual getRunAction : ()Lkotlin/jvm/functions/Function0;
/*    */     //   588: goto -> 593
/*    */     //   591: pop
/*    */     //   592: aconst_null
/*    */     //   593: aload_0
/*    */     //   594: invokevirtual getActionApprovalRequestData : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;
/*    */     //   597: dup
/*    */     //   598: ifnull -> 607
/*    */     //   601: invokevirtual getSkipAction : ()Lkotlin/jvm/functions/Function0;
/*    */     //   604: goto -> 609
/*    */     //   607: pop
/*    */     //   608: aconst_null
/*    */     //   609: aload_1
/*    */     //   610: iconst_0
/*    */     //   611: iconst_0
/*    */     //   612: invokestatic TerminalStep : (Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*    */     //   615: invokestatic isTraceInProgress : ()Z
/*    */     //   618: ifeq -> 633
/*    */     //   621: invokestatic traceEventEnd : ()V
/*    */     //   624: goto -> 633
/*    */     //   627: aload_1
/*    */     //   628: invokeinterface skipToGroupEnd : ()V
/*    */     //   633: aload_1
/*    */     //   634: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   639: dup
/*    */     //   640: ifnull -> 658
/*    */     //   643: aload_0
/*    */     //   644: iload_2
/*    */     //   645: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Terminal;I)Lkotlin/jvm/functions/Function2;
/*    */     //   650: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   655: goto -> 659
/*    */     //   658: pop
/*    */     //   659: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 6
/*    */     //   #16	-> 87
/*    */     //   #41	-> 91
/*    */     //   #42	-> 103
/*    */     //   #43	-> 114
/*    */     //   #16	-> 117
/*    */     //   #43	-> 127
/*    */     //   #44	-> 129
/*    */     //   #45	-> 138
/*    */     //   #46	-> 143
/*    */     //   #42	-> 145
/*    */     //   #41	-> 146
/*    */     //   #41	-> 147
/*    */     //   #16	-> 148
/*    */     //   #17	-> 163
/*    */     //   #47	-> 209
/*    */     //   #48	-> 221
/*    */     //   #49	-> 237
/*    */     //   #18	-> 240
/*    */     //   #49	-> 255
/*    */     //   #50	-> 257
/*    */     //   #51	-> 266
/*    */     //   #52	-> 271
/*    */     //   #48	-> 273
/*    */     //   #47	-> 274
/*    */     //   #47	-> 275
/*    */     //   #17	-> 276
/*    */     //   #21	-> 312
/*    */     //   #53	-> 316
/*    */     //   #54	-> 328
/*    */     //   #55	-> 344
/*    */     //   #21	-> 347
/*    */     //   #55	-> 354
/*    */     //   #56	-> 356
/*    */     //   #57	-> 365
/*    */     //   #58	-> 370
/*    */     //   #54	-> 372
/*    */     //   #53	-> 373
/*    */     //   #53	-> 374
/*    */     //   #21	-> 375
/*    */     //   #24	-> 393
/*    */     //   #25	-> 397
/*    */     //   #26	-> 401
/*    */     //   #27	-> 413
/*    */     //   #28	-> 417
/*    */     //   #29	-> 443
/*    */     //   #59	-> 447
/*    */     //   #60	-> 459
/*    */     //   #61	-> 475
/*    */     //   #29	-> 488
/*    */     //   #61	-> 511
/*    */     //   #62	-> 513
/*    */     //   #63	-> 522
/*    */     //   #64	-> 527
/*    */     //   #60	-> 529
/*    */     //   #59	-> 530
/*    */     //   #59	-> 531
/*    */     //   #29	-> 532
/*    */     //   #33	-> 545
/*    */     //   #34	-> 561
/*    */     //   #35	-> 577
/*    */     //   #36	-> 593
/*    */     //   #23	-> 612
/*    */     //   #39	-> 627
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   117	10	11	$i$a$-cache-TerminalKt$TerminalStep$actionRefreshKey$2	I
/*    */     //   129	11	11	value$iv	Ljava/lang/Object;
/*    */     //   103	43	10	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   100	46	9	it$iv	Ljava/lang/Object;
/*    */     //   91	57	8	$i$f$cache	I
/*    */     //   88	60	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   88	60	7	invalid$iv	Z
/*    */     //   240	15	14	$i$a$-cache-TerminalKt$TerminalStep$additionalActions$2	I
/*    */     //   257	11	15	value$iv	Ljava/lang/Object;
/*    */     //   221	53	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   218	56	12	it$iv	Ljava/lang/Object;
/*    */     //   209	67	11	$i$f$cache	I
/*    */     //   206	70	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   206	70	10	invalid$iv	Z
/*    */     //   347	7	13	$i$a$-cache-TerminalKt$TerminalStep$actionNames$2	I
/*    */     //   356	11	14	value$iv	Ljava/lang/Object;
/*    */     //   328	45	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   325	48	11	it$iv	Ljava/lang/Object;
/*    */     //   316	59	10	$i$f$cache	I
/*    */     //   313	62	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   313	62	9	invalid$iv	Z
/*    */     //   488	9	13	$i$a$-cache-TerminalKt$TerminalStep$1	I
/*    */     //   513	11	14	value$iv	Ljava/lang/Object;
/*    */     //   459	71	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   456	74	11	it$iv	Ljava/lang/Object;
/*    */     //   447	85	10	$i$f$cache	I
/*    */     //   444	88	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   444	88	9	invalid$iv	Z
/*    */     //   163	461	4	actionRefreshKey$delegate	Landroidx/compose/runtime/MutableState;
/*    */     //   291	333	5	additionalActions$delegate	Landroidx/compose/runtime/MutableState;
/*    */     //   393	231	6	actionNames$delegate	Landroidx/compose/runtime/State;
/*    */     //   17	643	3	$dirty	I
/*    */     //   0	660	0	terminal	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Terminal;
/*    */     //   0	660	1	$composer	Landroidx/compose/runtime/Composer;
/* 66 */     //   0	660	2	$changed	I } private static final void TerminalStep$lambda$2(MutableState $actionRefreshKey$delegate, int <set-?>) { MutableState mutableState = $actionRefreshKey$delegate; Object object1 = null, object2 = null; Object value$iv = Integer.valueOf(<set-?>); int $i$f$setValue = 0; mutableState.setValue(value$iv); } private static final List<Action> TerminalStep$lambda$4(MutableState $additionalActions$delegate) { State state = (State)$additionalActions$delegate; Object object = null; KProperty property$iv = null;
/*    */     int $i$f$getValue = 0;
/* 68 */     return (List<Action>)state.getValue(); } private static final List TerminalStep$lambda$7$lambda$6(MutableState<List<Action>> $additionalActions$delegate) { Iterable<Action> $this$map$iv = TerminalStep$lambda$4($additionalActions$delegate); int $i$f$map = 0;
/* 69 */     Iterable<Action> iterable1 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 70 */     for (Action item$iv$iv : iterable1) {
/* 71 */       Action action1 = item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-TerminalKt$TerminalStep$actionNames$2$1$1 = 0; collection.add(action1.getName());
/* 72 */     }  return (List)destination$iv$iv; } private static final List<String> TerminalStep$lambda$8(State $actionNames$delegate) { State state = $actionNames$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 73 */     return (List<String>)state.getValue(); }
/*    */ 
/*    */   
/*    */   private static final Unit TerminalStep$lambda$10$lambda$9(MutableState<List<Action>> $additionalActions$delegate, MutableState<Integer> $actionRefreshKey$delegate, int it) {
/*    */     ((Action)TerminalStep$lambda$4($additionalActions$delegate).get(it)).getAction().invoke();
/*    */     TerminalStep$lambda$2($actionRefreshKey$delegate, TerminalStep$lambda$1($actionRefreshKey$delegate) + 1);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit TerminalStep$lambda$11(TaskStep.Terminal $terminal, int $$changed, Composer $composer, int $force) {
/*    */     TerminalStep($terminal, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\TerminalKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */