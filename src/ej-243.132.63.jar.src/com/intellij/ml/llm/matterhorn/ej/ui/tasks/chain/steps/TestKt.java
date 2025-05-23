/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*    */ 
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import androidx.compose.runtime.State;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header.Action;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskStep;
/*    */ import java.util.List;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.reflect.KProperty;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000$\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\032\025\020\000\032\0020\0012\006\020\002\032\0020\003H\001¢\006\002\020\004¨\006\005²\006\n\020\006\032\0020\007X\002²\006\020\020\b\032\b\022\004\022\0020\n0\tX\002²\006\020\020\013\032\b\022\004\022\0020\f0\tX\002"}, d2 = {"TestStep", "", "test", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Test;", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Test;Landroidx/compose/runtime/Composer;I)V", "ej-ui", "actionRefreshKey", "", "additionalActions", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "actionNames", ""})
/*    */ @SourceDebugExtension({"SMAP\nTest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Test.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TestKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,45:1\n1225#2,6:46\n1225#2,6:52\n1225#2,3:58\n1228#2,3:65\n1225#2,3:68\n1228#2,3:82\n1225#2,6:85\n1557#3:61\n1628#3,3:62\n3193#3,10:71\n1#4:81\n81#5:91\n107#5,2:92\n81#5:94\n81#5:95\n*S KotlinDebug\n*F\n+ 1 Test.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TestKt\n*L\n16#1:46,6\n17#1:52,6\n21#1:58,3\n21#1:65,3\n24#1:68,3\n24#1:82,3\n38#1:85,6\n21#1:61\n21#1:62,3\n27#1:71,10\n16#1:91\n16#1:92,2\n17#1:94\n21#1:95\n*E\n"})
/*    */ public final class TestKt {
/* 16 */   private static final int TestStep$lambda$1(MutableState $actionRefreshKey$delegate) { State state = (State)$actionRefreshKey$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
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
/* 91 */       (Number)state.getValue()).intValue(); }
/*    */   @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void TestStep(@NotNull TaskStep.Test test, @Nullable Composer $composer, int $changed) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'test'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: ldc 836943309
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
/*    */     //   55: ifne -> 966
/*    */     //   58: invokestatic isTraceInProgress : ()Z
/*    */     //   61: ifeq -> 73
/*    */     //   64: ldc 836943309
/*    */     //   66: iload_3
/*    */     //   67: iconst_m1
/*    */     //   68: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.TestStep (Test.kt:14)'
/*    */     //   70: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   73: aload_1
/*    */     //   74: ldc 1565940869
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
/*    */     //   165: invokestatic TestStep$lambda$1 : (Landroidx/compose/runtime/MutableState;)I
/*    */     //   168: istore #6
/*    */     //   170: aload_0
/*    */     //   171: invokevirtual getActionApprovalRequestData : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;
/*    */     //   174: astore #7
/*    */     //   176: aload_1
/*    */     //   177: ldc 1565942812
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
/*    */     //   291: aload #4
/*    */     //   293: invokestatic TestStep$lambda$1 : (Landroidx/compose/runtime/MutableState;)I
/*    */     //   296: istore #7
/*    */     //   298: aload_1
/*    */     //   299: ldc 1565947255
/*    */     //   301: invokeinterface startReplaceGroup : (I)V
/*    */     //   306: aload_1
/*    */     //   307: astore #9
/*    */     //   309: aload_1
/*    */     //   310: iload #7
/*    */     //   312: invokeinterface changed : (I)Z
/*    */     //   317: istore #10
/*    */     //   319: iconst_0
/*    */     //   320: istore #11
/*    */     //   322: aload #9
/*    */     //   324: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   329: astore #12
/*    */     //   331: iconst_0
/*    */     //   332: istore #13
/*    */     //   334: iload #10
/*    */     //   336: ifne -> 350
/*    */     //   339: aload #12
/*    */     //   341: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   344: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   347: if_acmpne -> 479
/*    */     //   350: iconst_0
/*    */     //   351: istore #14
/*    */     //   353: aload #5
/*    */     //   355: invokestatic TestStep$lambda$4 : (Landroidx/compose/runtime/MutableState;)Ljava/util/List;
/*    */     //   358: checkcast java/lang/Iterable
/*    */     //   361: astore #15
/*    */     //   363: iconst_0
/*    */     //   364: istore #16
/*    */     //   366: aload #15
/*    */     //   368: astore #17
/*    */     //   370: new java/util/ArrayList
/*    */     //   373: dup
/*    */     //   374: aload #15
/*    */     //   376: bipush #10
/*    */     //   378: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */     //   381: invokespecial <init> : (I)V
/*    */     //   384: checkcast java/util/Collection
/*    */     //   387: astore #18
/*    */     //   389: iconst_0
/*    */     //   390: istore #19
/*    */     //   392: aload #17
/*    */     //   394: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   399: astore #20
/*    */     //   401: aload #20
/*    */     //   403: invokeinterface hasNext : ()Z
/*    */     //   408: ifeq -> 451
/*    */     //   411: aload #20
/*    */     //   413: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   418: astore #21
/*    */     //   420: aload #18
/*    */     //   422: aload #21
/*    */     //   424: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action
/*    */     //   427: astore #22
/*    */     //   429: astore #23
/*    */     //   431: iconst_0
/*    */     //   432: istore #24
/*    */     //   434: aload #22
/*    */     //   436: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   439: aload #23
/*    */     //   441: swap
/*    */     //   442: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   447: pop
/*    */     //   448: goto -> 401
/*    */     //   451: aload #18
/*    */     //   453: checkcast java/util/List
/*    */     //   456: nop
/*    */     //   457: aconst_null
/*    */     //   458: iconst_2
/*    */     //   459: aconst_null
/*    */     //   460: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*    */     //   463: astore #25
/*    */     //   465: aload #9
/*    */     //   467: aload #25
/*    */     //   469: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   474: aload #25
/*    */     //   476: goto -> 481
/*    */     //   479: aload #12
/*    */     //   481: nop
/*    */     //   482: nop
/*    */     //   483: nop
/*    */     //   484: checkcast androidx/compose/runtime/MutableState
/*    */     //   487: astore #8
/*    */     //   489: aload_1
/*    */     //   490: invokeinterface endReplaceGroup : ()V
/*    */     //   495: aload #8
/*    */     //   497: astore #6
/*    */     //   499: aload_1
/*    */     //   500: ldc 1565951321
/*    */     //   502: invokeinterface startReplaceGroup : (I)V
/*    */     //   507: aload_1
/*    */     //   508: astore #9
/*    */     //   510: iconst_0
/*    */     //   511: istore #10
/*    */     //   513: nop
/*    */     //   514: iconst_0
/*    */     //   515: istore #11
/*    */     //   517: aload #9
/*    */     //   519: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   524: astore #12
/*    */     //   526: iconst_0
/*    */     //   527: istore #13
/*    */     //   529: aload #12
/*    */     //   531: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   534: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   537: if_acmpne -> 722
/*    */     //   540: iconst_0
/*    */     //   541: istore #14
/*    */     //   543: aload_0
/*    */     //   544: invokevirtual getTests : ()Ljava/util/List;
/*    */     //   547: checkcast java/lang/Iterable
/*    */     //   550: astore #15
/*    */     //   552: nop
/*    */     //   553: iconst_0
/*    */     //   554: istore #16
/*    */     //   556: new java/util/ArrayList
/*    */     //   559: dup
/*    */     //   560: invokespecial <init> : ()V
/*    */     //   563: astore #17
/*    */     //   565: new java/util/ArrayList
/*    */     //   568: dup
/*    */     //   569: invokespecial <init> : ()V
/*    */     //   572: astore #18
/*    */     //   574: aload #15
/*    */     //   576: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   581: astore #19
/*    */     //   583: aload #19
/*    */     //   585: invokeinterface hasNext : ()Z
/*    */     //   590: ifeq -> 653
/*    */     //   593: aload #19
/*    */     //   595: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   600: astore #20
/*    */     //   602: aload #20
/*    */     //   604: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TestRun
/*    */     //   607: astore #21
/*    */     //   609: iconst_0
/*    */     //   610: istore #22
/*    */     //   612: aload #21
/*    */     //   614: invokevirtual getResult : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TestResult;
/*    */     //   617: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TestResult.Success : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TestResult;
/*    */     //   620: if_acmpne -> 627
/*    */     //   623: iconst_1
/*    */     //   624: goto -> 628
/*    */     //   627: iconst_0
/*    */     //   628: ifeq -> 642
/*    */     //   631: aload #17
/*    */     //   633: aload #20
/*    */     //   635: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   638: pop
/*    */     //   639: goto -> 583
/*    */     //   642: aload #18
/*    */     //   644: aload #20
/*    */     //   646: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   649: pop
/*    */     //   650: goto -> 583
/*    */     //   653: new kotlin/Pair
/*    */     //   656: dup
/*    */     //   657: aload #17
/*    */     //   659: aload #18
/*    */     //   661: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   664: astore #16
/*    */     //   666: iconst_0
/*    */     //   667: istore #17
/*    */     //   669: aload #16
/*    */     //   671: invokevirtual getFirst : ()Ljava/lang/Object;
/*    */     //   674: checkcast java/util/List
/*    */     //   677: invokeinterface size : ()I
/*    */     //   682: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   685: aload #16
/*    */     //   687: invokevirtual getSecond : ()Ljava/lang/Object;
/*    */     //   690: checkcast java/util/List
/*    */     //   693: invokeinterface size : ()I
/*    */     //   698: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   701: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*    */     //   704: nop
/*    */     //   705: nop
/*    */     //   706: astore #23
/*    */     //   708: aload #9
/*    */     //   710: aload #23
/*    */     //   712: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   717: aload #23
/*    */     //   719: goto -> 724
/*    */     //   722: aload #12
/*    */     //   724: nop
/*    */     //   725: nop
/*    */     //   726: nop
/*    */     //   727: checkcast kotlin/Pair
/*    */     //   730: astore #8
/*    */     //   732: aload_1
/*    */     //   733: invokeinterface endReplaceGroup : ()V
/*    */     //   738: aload #8
/*    */     //   740: astore #7
/*    */     //   742: aload #7
/*    */     //   744: invokevirtual component1 : ()Ljava/lang/Object;
/*    */     //   747: checkcast java/lang/Number
/*    */     //   750: invokevirtual intValue : ()I
/*    */     //   753: istore #8
/*    */     //   755: aload #7
/*    */     //   757: invokevirtual component2 : ()Ljava/lang/Object;
/*    */     //   760: checkcast java/lang/Number
/*    */     //   763: invokevirtual intValue : ()I
/*    */     //   766: istore #9
/*    */     //   768: aload_0
/*    */     //   769: invokevirtual getWaitingForApproval : ()Z
/*    */     //   772: aload_0
/*    */     //   773: invokevirtual getCommand : ()Ljava/lang/String;
/*    */     //   776: aload_0
/*    */     //   777: invokevirtual getDescription : ()Ljava/lang/String;
/*    */     //   780: iload #8
/*    */     //   782: iload #9
/*    */     //   784: aload #6
/*    */     //   786: invokestatic TestStep$lambda$7 : (Landroidx/compose/runtime/MutableState;)Ljava/util/List;
/*    */     //   789: aload_1
/*    */     //   790: ldc 1565963969
/*    */     //   792: invokeinterface startReplaceGroup : (I)V
/*    */     //   797: aload_1
/*    */     //   798: astore #11
/*    */     //   800: aload_1
/*    */     //   801: aload #5
/*    */     //   803: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   808: istore #12
/*    */     //   810: nop
/*    */     //   811: iconst_0
/*    */     //   812: istore #13
/*    */     //   814: aload #11
/*    */     //   816: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   821: astore #14
/*    */     //   823: iconst_0
/*    */     //   824: istore #15
/*    */     //   826: iload #12
/*    */     //   828: ifne -> 842
/*    */     //   831: aload #14
/*    */     //   833: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   836: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   839: if_acmpne -> 898
/*    */     //   842: astore #31
/*    */     //   844: istore #30
/*    */     //   846: istore #29
/*    */     //   848: astore #28
/*    */     //   850: astore #27
/*    */     //   852: istore #26
/*    */     //   854: iconst_0
/*    */     //   855: istore #16
/*    */     //   857: aload #5
/*    */     //   859: aload #4
/*    */     //   861: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*    */     //   866: astore #32
/*    */     //   868: iload #26
/*    */     //   870: aload #27
/*    */     //   872: aload #28
/*    */     //   874: iload #29
/*    */     //   876: iload #30
/*    */     //   878: aload #31
/*    */     //   880: aload #32
/*    */     //   882: astore #17
/*    */     //   884: aload #11
/*    */     //   886: aload #17
/*    */     //   888: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   893: aload #17
/*    */     //   895: goto -> 900
/*    */     //   898: aload #14
/*    */     //   900: nop
/*    */     //   901: nop
/*    */     //   902: nop
/*    */     //   903: checkcast kotlin/jvm/functions/Function1
/*    */     //   906: astore #10
/*    */     //   908: aload_1
/*    */     //   909: invokeinterface endReplaceGroup : ()V
/*    */     //   914: aload #10
/*    */     //   916: aload_0
/*    */     //   917: invokevirtual getActionApprovalRequestData : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;
/*    */     //   920: dup
/*    */     //   921: ifnull -> 930
/*    */     //   924: invokevirtual getRunAction : ()Lkotlin/jvm/functions/Function0;
/*    */     //   927: goto -> 932
/*    */     //   930: pop
/*    */     //   931: aconst_null
/*    */     //   932: aload_0
/*    */     //   933: invokevirtual getActionApprovalRequestData : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/ActionApprovalRequestData;
/*    */     //   936: dup
/*    */     //   937: ifnull -> 946
/*    */     //   940: invokevirtual getSkipAction : ()Lkotlin/jvm/functions/Function0;
/*    */     //   943: goto -> 948
/*    */     //   946: pop
/*    */     //   947: aconst_null
/*    */     //   948: aload_1
/*    */     //   949: iconst_0
/*    */     //   950: iconst_0
/*    */     //   951: invokestatic TestStep : (ZLjava/lang/String;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*    */     //   954: invokestatic isTraceInProgress : ()Z
/*    */     //   957: ifeq -> 972
/*    */     //   960: invokestatic traceEventEnd : ()V
/*    */     //   963: goto -> 972
/*    */     //   966: aload_1
/*    */     //   967: invokeinterface skipToGroupEnd : ()V
/*    */     //   972: aload_1
/*    */     //   973: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   978: dup
/*    */     //   979: ifnull -> 997
/*    */     //   982: aload_0
/*    */     //   983: iload_2
/*    */     //   984: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Test;I)Lkotlin/jvm/functions/Function2;
/*    */     //   989: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   994: goto -> 998
/*    */     //   997: pop
/*    */     //   998: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 6
/*    */     //   #16	-> 87
/*    */     //   #46	-> 91
/*    */     //   #47	-> 103
/*    */     //   #48	-> 114
/*    */     //   #16	-> 117
/*    */     //   #48	-> 127
/*    */     //   #49	-> 129
/*    */     //   #50	-> 138
/*    */     //   #51	-> 143
/*    */     //   #47	-> 145
/*    */     //   #46	-> 146
/*    */     //   #46	-> 147
/*    */     //   #16	-> 148
/*    */     //   #17	-> 163
/*    */     //   #52	-> 209
/*    */     //   #53	-> 221
/*    */     //   #54	-> 237
/*    */     //   #18	-> 240
/*    */     //   #54	-> 255
/*    */     //   #55	-> 257
/*    */     //   #56	-> 266
/*    */     //   #57	-> 271
/*    */     //   #53	-> 273
/*    */     //   #52	-> 274
/*    */     //   #52	-> 275
/*    */     //   #17	-> 276
/*    */     //   #21	-> 291
/*    */     //   #58	-> 322
/*    */     //   #59	-> 334
/*    */     //   #60	-> 350
/*    */     //   #21	-> 353
/*    */     //   #61	-> 366
/*    */     //   #62	-> 392
/*    */     //   #63	-> 420
/*    */     //   #21	-> 434
/*    */     //   #63	-> 442
/*    */     //   #64	-> 451
/*    */     //   #61	-> 456
/*    */     //   #21	-> 457
/*    */     //   #60	-> 463
/*    */     //   #65	-> 465
/*    */     //   #66	-> 474
/*    */     //   #67	-> 479
/*    */     //   #59	-> 481
/*    */     //   #58	-> 482
/*    */     //   #58	-> 483
/*    */     //   #21	-> 484
/*    */     //   #24	-> 513
/*    */     //   #68	-> 517
/*    */     //   #69	-> 529
/*    */     //   #70	-> 540
/*    */     //   #25	-> 543
/*    */     //   #26	-> 544
/*    */     //   #27	-> 552
/*    */     //   #71	-> 556
/*    */     //   #72	-> 565
/*    */     //   #73	-> 574
/*    */     //   #74	-> 602
/*    */     //   #27	-> 612
/*    */     //   #74	-> 628
/*    */     //   #75	-> 631
/*    */     //   #77	-> 642
/*    */     //   #80	-> 653
/*    */     //   #28	-> 664
/*    */     //   #81	-> 666
/*    */     //   #28	-> 669
/*    */     //   #28	-> 704
/*    */     //   #28	-> 705
/*    */     //   #70	-> 706
/*    */     //   #82	-> 708
/*    */     //   #83	-> 717
/*    */     //   #84	-> 722
/*    */     //   #69	-> 724
/*    */     //   #68	-> 725
/*    */     //   #68	-> 726
/*    */     //   #24	-> 727
/*    */     //   #23	-> 740
/*    */     //   #32	-> 768
/*    */     //   #33	-> 772
/*    */     //   #34	-> 776
/*    */     //   #35	-> 780
/*    */     //   #36	-> 782
/*    */     //   #37	-> 784
/*    */     //   #38	-> 810
/*    */     //   #85	-> 814
/*    */     //   #86	-> 826
/*    */     //   #87	-> 842
/*    */     //   #38	-> 857
/*    */     //   #87	-> 882
/*    */     //   #88	-> 884
/*    */     //   #89	-> 893
/*    */     //   #90	-> 898
/*    */     //   #86	-> 900
/*    */     //   #85	-> 901
/*    */     //   #85	-> 902
/*    */     //   #38	-> 903
/*    */     //   #42	-> 916
/*    */     //   #43	-> 932
/*    */     //   #31	-> 951
/*    */     //   #45	-> 966
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   117	10	11	$i$a$-cache-TestKt$TestStep$actionRefreshKey$2	I
/*    */     //   129	11	11	value$iv	Ljava/lang/Object;
/*    */     //   103	43	10	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   100	46	9	it$iv	Ljava/lang/Object;
/*    */     //   91	57	8	$i$f$cache	I
/*    */     //   88	60	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   88	60	7	invalid$iv	Z
/*    */     //   240	15	14	$i$a$-cache-TestKt$TestStep$additionalActions$2	I
/*    */     //   257	11	15	value$iv	Ljava/lang/Object;
/*    */     //   221	53	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   218	56	12	it$iv	Ljava/lang/Object;
/*    */     //   209	67	11	$i$f$cache	I
/*    */     //   206	70	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   206	70	10	invalid$iv	Z
/*    */     //   434	5	24	$i$a$-map-TestKt$TestStep$actionNames$2$1	I
/*    */     //   431	8	22	it	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*    */     //   420	28	21	item$iv$iv	Ljava/lang/Object;
/*    */     //   392	61	19	$i$f$mapTo	I
/*    */     //   389	64	17	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   389	64	18	destination$iv$iv	Ljava/util/Collection;
/*    */     //   366	91	16	$i$f$map	I
/*    */     //   363	94	15	$this$map$iv	Ljava/lang/Iterable;
/*    */     //   353	110	14	$i$a$-cache-TestKt$TestStep$actionNames$2	I
/*    */     //   465	11	25	value$iv	Ljava/lang/Object;
/*    */     //   334	148	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   331	151	12	it$iv	Ljava/lang/Object;
/*    */     //   322	162	11	$i$f$cache	I
/*    */     //   319	165	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   319	165	10	invalid$iv	Z
/*    */     //   612	16	22	$i$a$-partition-TestKt$TestStep$1$1	I
/*    */     //   609	19	21	it	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TestRun;
/*    */     //   602	48	20	element$iv	Ljava/lang/Object;
/*    */     //   556	108	16	$i$f$partition	I
/*    */     //   565	99	17	first$iv	Ljava/util/ArrayList;
/*    */     //   574	90	18	second$iv	Ljava/util/ArrayList;
/*    */     //   553	111	15	$this$partition$iv	Ljava/lang/Iterable;
/*    */     //   669	35	17	$i$a$-let-TestKt$TestStep$1$2	I
/*    */     //   666	38	16	it	Lkotlin/Pair;
/*    */     //   543	163	14	$i$a$-cache-TestKt$TestStep$1	I
/*    */     //   708	11	23	value$iv	Ljava/lang/Object;
/*    */     //   529	196	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   526	199	12	it$iv	Ljava/lang/Object;
/*    */     //   517	210	11	$i$f$cache	I
/*    */     //   514	213	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   514	213	10	invalid$iv	Z
/*    */     //   857	9	16	$i$a$-cache-TestKt$TestStep$2	I
/*    */     //   884	11	17	value$iv	Ljava/lang/Object;
/*    */     //   826	75	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   823	78	14	it$iv	Ljava/lang/Object;
/*    */     //   814	89	13	$i$f$cache	I
/*    */     //   811	92	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   811	92	12	invalid$iv	Z
/*    */     //   163	800	4	actionRefreshKey$delegate	Landroidx/compose/runtime/MutableState;
/*    */     //   291	672	5	additionalActions$delegate	Landroidx/compose/runtime/MutableState;
/*    */     //   499	464	6	actionNames$delegate	Landroidx/compose/runtime/MutableState;
/*    */     //   755	208	8	successfulTests	I
/*    */     //   768	195	9	failedTests	I
/*    */     //   17	982	3	$dirty	I
/*    */     //   0	999	0	test	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Test;
/*    */     //   0	999	1	$composer	Landroidx/compose/runtime/Composer;
/* 92 */     //   0	999	2	$changed	I } private static final void TestStep$lambda$2(MutableState $actionRefreshKey$delegate, int <set-?>) { MutableState mutableState = $actionRefreshKey$delegate; Object object1 = null, object2 = null; Object value$iv = Integer.valueOf(<set-?>); int $i$f$setValue = 0; mutableState.setValue(value$iv); } private static final List<Action> TestStep$lambda$4(MutableState $additionalActions$delegate) { State state = (State)$additionalActions$delegate; Object object = null; KProperty property$iv = null;
/*    */     int $i$f$getValue = 0;
/* 94 */     return (List<Action>)state.getValue(); } private static final List<String> TestStep$lambda$7(MutableState $actionNames$delegate) { State state = (State)$actionNames$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 95 */     return (List<String>)state.getValue(); }
/*    */ 
/*    */   
/*    */   private static final Unit TestStep$lambda$12$lambda$11(MutableState<List<Action>> $additionalActions$delegate, MutableState<Integer> $actionRefreshKey$delegate, int it) {
/*    */     ((Action)TestStep$lambda$4($additionalActions$delegate).get(it)).getAction().invoke();
/*    */     TestStep$lambda$2($actionRefreshKey$delegate, TestStep$lambda$1($actionRefreshKey$delegate) + 1);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit TestStep$lambda$13(TaskStep.Test $test, int $$changed, Composer $composer, int $force) {
/*    */     TestStep($test, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\TestKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */