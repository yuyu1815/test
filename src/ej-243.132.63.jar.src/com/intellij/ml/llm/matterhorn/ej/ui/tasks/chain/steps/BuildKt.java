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
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000$\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\032\025\020\000\032\0020\0012\006\020\002\032\0020\003H\001¢\006\002\020\004¨\006\005²\006\n\020\006\032\0020\007X\002²\006\020\020\b\032\b\022\004\022\0020\n0\tX\002²\006\020\020\013\032\b\022\004\022\0020\f0\tX\002"}, d2 = {"BuildStep", "", "build", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Build;", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Build;Landroidx/compose/runtime/Composer;I)V", "ej-ui", "actionRefreshKey", "", "additionalActions", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "actionNames", ""})
/*    */ @SourceDebugExtension({"SMAP\nBuild.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Build.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/BuildKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1225#2,6:37\n1225#2,6:43\n1225#2,6:49\n1225#2,6:55\n81#3:61\n107#3,2:62\n81#3:64\n81#3:69\n1557#4:65\n1628#4,3:66\n*S KotlinDebug\n*F\n+ 1 Build.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/BuildKt\n*L\n16#1:37,6\n17#1:43,6\n21#1:49,6\n28#1:55,6\n16#1:61\n16#1:62,2\n17#1:64\n21#1:69\n21#1:65\n21#1:66,3\n*E\n"})
/*    */ public final class BuildKt {
/* 16 */   private static final int BuildStep$lambda$1(MutableState $actionRefreshKey$delegate) { State state = (State)$actionRefreshKey$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
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
/* 61 */       (Number)state.getValue()).intValue(); }
/*    */   @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void BuildStep(@NotNull TaskStep.Build build, @Nullable Composer $composer, int $changed) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'build'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: ldc 12607941
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
/*    */     //   55: ifne -> 585
/*    */     //   58: invokestatic isTraceInProgress : ()Z
/*    */     //   61: ifeq -> 73
/*    */     //   64: ldc 12607941
/*    */     //   66: iload_3
/*    */     //   67: iconst_m1
/*    */     //   68: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.BuildStep (Build.kt:14)'
/*    */     //   70: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   73: aload_1
/*    */     //   74: ldc 1543673807
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
/*    */     //   165: invokestatic BuildStep$lambda$1 : (Landroidx/compose/runtime/MutableState;)I
/*    */     //   168: istore #6
/*    */     //   170: aload_0
/*    */     //   171: invokevirtual getActionApprovalRequestData : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;
/*    */     //   174: astore #7
/*    */     //   176: aload_1
/*    */     //   177: ldc 1543675752
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
/*    */     //   292: ldc 1543680694
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
/*    */     //   394: invokevirtual getWaitingForApproval : ()Z
/*    */     //   397: aload_0
/*    */     //   398: invokevirtual getCommand : ()Ljava/lang/String;
/*    */     //   401: aload_0
/*    */     //   402: invokevirtual getDescription : ()Ljava/lang/String;
/*    */     //   405: aconst_null
/*    */     //   406: aload #6
/*    */     //   408: invokestatic BuildStep$lambda$8 : (Landroidx/compose/runtime/State;)Ljava/util/List;
/*    */     //   411: aload_1
/*    */     //   412: ldc 1543687851
/*    */     //   414: invokeinterface startReplaceGroup : (I)V
/*    */     //   419: aload_1
/*    */     //   420: astore #8
/*    */     //   422: aload_1
/*    */     //   423: aload #5
/*    */     //   425: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   430: istore #9
/*    */     //   432: nop
/*    */     //   433: iconst_0
/*    */     //   434: istore #10
/*    */     //   436: aload #8
/*    */     //   438: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   443: astore #11
/*    */     //   445: iconst_0
/*    */     //   446: istore #12
/*    */     //   448: iload #9
/*    */     //   450: ifne -> 464
/*    */     //   453: aload #11
/*    */     //   455: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   458: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   461: if_acmpne -> 516
/*    */     //   464: astore #20
/*    */     //   466: astore #19
/*    */     //   468: astore #18
/*    */     //   470: astore #17
/*    */     //   472: istore #16
/*    */     //   474: iconst_0
/*    */     //   475: istore #13
/*    */     //   477: aload #5
/*    */     //   479: aload #4
/*    */     //   481: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*    */     //   486: astore #21
/*    */     //   488: iload #16
/*    */     //   490: aload #17
/*    */     //   492: aload #18
/*    */     //   494: aload #19
/*    */     //   496: aload #20
/*    */     //   498: aload #21
/*    */     //   500: astore #14
/*    */     //   502: aload #8
/*    */     //   504: aload #14
/*    */     //   506: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   511: aload #14
/*    */     //   513: goto -> 518
/*    */     //   516: aload #11
/*    */     //   518: nop
/*    */     //   519: nop
/*    */     //   520: nop
/*    */     //   521: checkcast kotlin/jvm/functions/Function1
/*    */     //   524: astore #7
/*    */     //   526: aload_1
/*    */     //   527: invokeinterface endReplaceGroup : ()V
/*    */     //   532: aload #7
/*    */     //   534: aload_0
/*    */     //   535: invokevirtual getActionApprovalRequestData : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;
/*    */     //   538: dup
/*    */     //   539: ifnull -> 548
/*    */     //   542: invokevirtual getRunAction : ()Lkotlin/jvm/functions/Function0;
/*    */     //   545: goto -> 550
/*    */     //   548: pop
/*    */     //   549: aconst_null
/*    */     //   550: aload_0
/*    */     //   551: invokevirtual getActionApprovalRequestData : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;
/*    */     //   554: dup
/*    */     //   555: ifnull -> 564
/*    */     //   558: invokevirtual getSkipAction : ()Lkotlin/jvm/functions/Function0;
/*    */     //   561: goto -> 566
/*    */     //   564: pop
/*    */     //   565: aconst_null
/*    */     //   566: aload_1
/*    */     //   567: iconst_0
/*    */     //   568: bipush #8
/*    */     //   570: invokestatic BuildStep : (ZLjava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*    */     //   573: invokestatic isTraceInProgress : ()Z
/*    */     //   576: ifeq -> 591
/*    */     //   579: invokestatic traceEventEnd : ()V
/*    */     //   582: goto -> 591
/*    */     //   585: aload_1
/*    */     //   586: invokeinterface skipToGroupEnd : ()V
/*    */     //   591: aload_1
/*    */     //   592: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   597: dup
/*    */     //   598: ifnull -> 616
/*    */     //   601: aload_0
/*    */     //   602: iload_2
/*    */     //   603: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Build;I)Lkotlin/jvm/functions/Function2;
/*    */     //   608: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   613: goto -> 617
/*    */     //   616: pop
/*    */     //   617: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 6
/*    */     //   #16	-> 87
/*    */     //   #37	-> 91
/*    */     //   #38	-> 103
/*    */     //   #39	-> 114
/*    */     //   #16	-> 117
/*    */     //   #39	-> 127
/*    */     //   #40	-> 129
/*    */     //   #41	-> 138
/*    */     //   #42	-> 143
/*    */     //   #38	-> 145
/*    */     //   #37	-> 146
/*    */     //   #37	-> 147
/*    */     //   #16	-> 148
/*    */     //   #17	-> 163
/*    */     //   #43	-> 209
/*    */     //   #44	-> 221
/*    */     //   #45	-> 237
/*    */     //   #18	-> 240
/*    */     //   #45	-> 255
/*    */     //   #46	-> 257
/*    */     //   #47	-> 266
/*    */     //   #48	-> 271
/*    */     //   #44	-> 273
/*    */     //   #43	-> 274
/*    */     //   #43	-> 275
/*    */     //   #17	-> 276
/*    */     //   #21	-> 312
/*    */     //   #49	-> 316
/*    */     //   #50	-> 328
/*    */     //   #51	-> 344
/*    */     //   #21	-> 347
/*    */     //   #51	-> 354
/*    */     //   #52	-> 356
/*    */     //   #53	-> 365
/*    */     //   #54	-> 370
/*    */     //   #50	-> 372
/*    */     //   #49	-> 373
/*    */     //   #49	-> 374
/*    */     //   #21	-> 375
/*    */     //   #24	-> 393
/*    */     //   #25	-> 397
/*    */     //   #26	-> 401
/*    */     //   #27	-> 406
/*    */     //   #28	-> 432
/*    */     //   #55	-> 436
/*    */     //   #56	-> 448
/*    */     //   #57	-> 464
/*    */     //   #28	-> 477
/*    */     //   #57	-> 500
/*    */     //   #58	-> 502
/*    */     //   #59	-> 511
/*    */     //   #60	-> 516
/*    */     //   #56	-> 518
/*    */     //   #55	-> 519
/*    */     //   #55	-> 520
/*    */     //   #28	-> 521
/*    */     //   #32	-> 534
/*    */     //   #33	-> 550
/*    */     //   #23	-> 570
/*    */     //   #35	-> 585
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   117	10	11	$i$a$-cache-BuildKt$BuildStep$actionRefreshKey$2	I
/*    */     //   129	11	11	value$iv	Ljava/lang/Object;
/*    */     //   103	43	10	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   100	46	9	it$iv	Ljava/lang/Object;
/*    */     //   91	57	8	$i$f$cache	I
/*    */     //   88	60	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   88	60	7	invalid$iv	Z
/*    */     //   240	15	14	$i$a$-cache-BuildKt$BuildStep$additionalActions$2	I
/*    */     //   257	11	15	value$iv	Ljava/lang/Object;
/*    */     //   221	53	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   218	56	12	it$iv	Ljava/lang/Object;
/*    */     //   209	67	11	$i$f$cache	I
/*    */     //   206	70	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   206	70	10	invalid$iv	Z
/*    */     //   347	7	13	$i$a$-cache-BuildKt$BuildStep$actionNames$2	I
/*    */     //   356	11	14	value$iv	Ljava/lang/Object;
/*    */     //   328	45	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   325	48	11	it$iv	Ljava/lang/Object;
/*    */     //   316	59	10	$i$f$cache	I
/*    */     //   313	62	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   313	62	9	invalid$iv	Z
/*    */     //   477	9	13	$i$a$-cache-BuildKt$BuildStep$1	I
/*    */     //   502	11	14	value$iv	Ljava/lang/Object;
/*    */     //   448	71	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   445	74	11	it$iv	Ljava/lang/Object;
/*    */     //   436	85	10	$i$f$cache	I
/*    */     //   433	88	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   433	88	9	invalid$iv	Z
/*    */     //   163	419	4	actionRefreshKey$delegate	Landroidx/compose/runtime/MutableState;
/*    */     //   291	291	5	additionalActions$delegate	Landroidx/compose/runtime/MutableState;
/*    */     //   393	189	6	actionNames$delegate	Landroidx/compose/runtime/State;
/*    */     //   17	601	3	$dirty	I
/*    */     //   0	618	0	build	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Build;
/*    */     //   0	618	1	$composer	Landroidx/compose/runtime/Composer;
/* 62 */     //   0	618	2	$changed	I } private static final void BuildStep$lambda$2(MutableState $actionRefreshKey$delegate, int <set-?>) { MutableState mutableState = $actionRefreshKey$delegate; Object object1 = null, object2 = null; Object value$iv = Integer.valueOf(<set-?>); int $i$f$setValue = 0; mutableState.setValue(value$iv); } private static final List<Action> BuildStep$lambda$4(MutableState $additionalActions$delegate) { State state = (State)$additionalActions$delegate; Object object = null; KProperty property$iv = null;
/*    */     int $i$f$getValue = 0;
/* 64 */     return (List<Action>)state.getValue(); } private static final List BuildStep$lambda$7$lambda$6(MutableState<List<Action>> $additionalActions$delegate) { Iterable<Action> $this$map$iv = BuildStep$lambda$4($additionalActions$delegate); int $i$f$map = 0;
/* 65 */     Iterable<Action> iterable1 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 66 */     for (Action item$iv$iv : iterable1) {
/* 67 */       Action action1 = item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-BuildKt$BuildStep$actionNames$2$1$1 = 0; collection.add(action1.getName());
/* 68 */     }  return (List)destination$iv$iv; } private static final List<String> BuildStep$lambda$8(State $actionNames$delegate) { State state = $actionNames$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 69 */     return (List<String>)state.getValue(); }
/*    */ 
/*    */   
/*    */   private static final Unit BuildStep$lambda$10$lambda$9(MutableState<List<Action>> $additionalActions$delegate, MutableState<Integer> $actionRefreshKey$delegate, int it) {
/*    */     ((Action)BuildStep$lambda$4($additionalActions$delegate).get(it)).getAction().invoke();
/*    */     BuildStep$lambda$2($actionRefreshKey$delegate, BuildStep$lambda$1($actionRefreshKey$delegate) + 1);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit BuildStep$lambda$11(TaskStep.Build $build, int $$changed, Composer $composer, int $force) {
/*    */     BuildStep($build, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\BuildKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */