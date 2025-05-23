/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain;
/*     */ 
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.State;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header.TaskHeaderState;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskRecapModel;
/*     */ import java.util.Map;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.reflect.KProperty;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000D\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\020$\n\002\020\b\n\002\030\002\n\002\b\002\032\035\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\007¢\006\002\020\006\032\025\020\007\032\0020\0012\006\020\002\032\0020\003H\007¢\006\002\020\b\032\037\020\t\032\0020\0012\b\b\002\020\n\032\0020\0132\006\020\002\032\0020\003H\007¢\006\002\020\f¨\006\r²\006\f\020\016\032\004\030\0010\017X\002²\006\020\020\020\032\b\022\004\022\0020\0220\021X\002²\006\f\020\023\032\004\030\0010\024X\002²\006\f\020\016\032\004\030\0010\017X\002²\006\026\020\025\032\016\022\004\022\0020\027\022\004\022\0020\0300\026X\002²\006\n\020\031\032\0020\027X\002²\006\n\020\032\032\0020\005X\002²\006\f\020\016\032\004\030\0010\017X\002²\006\020\020\020\032\b\022\004\022\0020\0220\021X\002"}, d2 = {"TaskChainPageSingleColumn", "", "model", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;", "sendPromptEnabled", "", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;ZLandroidx/compose/runtime/Composer;I)V", "TaskChainLeftColumn", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;Landroidx/compose/runtime/Composer;I)V", "TaskChainRightColumn", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;Landroidx/compose/runtime/Composer;II)V", "ej-ui", "state", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;", "unifiedStepList", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep;", "followUpModel", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/followup/FollowupViewModel;", "taskMap", "", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskRecapModel;", "selectedIndex", "isChainRunning"})
/*     */ @SourceDebugExtension({"SMAP\nTaskChainPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskChainPage.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainPageKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,112:1\n86#2:113\n83#2,6:114\n89#2:148\n86#2:150\n83#2,6:151\n89#2:185\n93#2:189\n93#2:194\n86#2:208\n83#2,6:209\n89#2:243\n93#2:254\n86#2:255\n83#2,6:256\n89#2:290\n86#2:291\n83#2,6:292\n89#2:326\n93#2:330\n93#2:334\n79#3,6:120\n86#3,4:135\n90#3,2:145\n79#3,6:157\n86#3,4:172\n90#3,2:182\n94#3:188\n94#3:193\n79#3,6:215\n86#3,4:230\n90#3,2:240\n94#3:253\n79#3,6:262\n86#3,4:277\n90#3,2:287\n79#3,6:298\n86#3,4:313\n90#3,2:323\n94#3:329\n94#3:333\n368#4,9:126\n377#4:147\n368#4,9:163\n377#4:184\n378#4,2:186\n378#4,2:191\n368#4,9:221\n377#4:242\n378#4,2:251\n368#4,9:268\n377#4:289\n368#4,9:304\n377#4:325\n378#4,2:327\n378#4,2:331\n4034#5,6:139\n4034#5,6:176\n4034#5,6:234\n4034#5,6:281\n4034#5,6:317\n149#6:149\n149#6:190\n149#6:207\n149#6:250\n1225#7,6:195\n1225#7,6:201\n1225#7,6:244\n81#8:335\n81#8:336\n81#8:337\n81#8:338\n81#8:339\n81#8:340\n107#8,2:341\n81#8:343\n81#8:344\n81#8:345\n*S KotlinDebug\n*F\n+ 1 TaskChainPage.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainPageKt\n*L\n29#1:113\n29#1:114,6\n29#1:148\n30#1:150\n30#1:151,6\n30#1:185\n30#1:189\n29#1:194\n64#1:208\n64#1:209,6\n64#1:243\n64#1:254\n101#1:255\n101#1:256,6\n101#1:290\n102#1:291\n102#1:292,6\n102#1:326\n102#1:330\n101#1:334\n29#1:120,6\n29#1:135,4\n29#1:145,2\n30#1:157,6\n30#1:172,4\n30#1:182,2\n30#1:188\n29#1:193\n64#1:215,6\n64#1:230,4\n64#1:240,2\n64#1:253\n101#1:262,6\n101#1:277,4\n101#1:287,2\n102#1:298,6\n102#1:313,4\n102#1:323,2\n102#1:329\n101#1:333\n29#1:126,9\n29#1:147\n30#1:163,9\n30#1:184\n30#1:186,2\n29#1:191,2\n64#1:221,9\n64#1:242\n64#1:251,2\n101#1:268,9\n101#1:289\n102#1:304,9\n102#1:325\n102#1:327,2\n101#1:331,2\n29#1:139,6\n30#1:176,6\n64#1:234,6\n101#1:281,6\n102#1:317,6\n30#1:149\n39#1:190\n65#1:207\n77#1:250\n58#1:195,6\n61#1:201,6\n68#1:244,6\n22#1:335\n25#1:336\n26#1:337\n54#1:338\n56#1:339\n58#1:340\n58#1:341,2\n68#1:343\n96#1:344\n99#1:345\n*E\n"})
/*     */ public final class TaskChainPageKt {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void TaskChainPageSingleColumn(@NotNull TaskChainDetailsViewModel model, boolean sendPromptEnabled, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'model'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc -267242038
/*     */     //   9: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   14: astore_2
/*     */     //   15: iload_3
/*     */     //   16: istore #4
/*     */     //   18: iload_3
/*     */     //   19: bipush #6
/*     */     //   21: iand
/*     */     //   22: ifne -> 45
/*     */     //   25: iload #4
/*     */     //   27: aload_2
/*     */     //   28: aload_0
/*     */     //   29: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   34: ifeq -> 41
/*     */     //   37: iconst_4
/*     */     //   38: goto -> 42
/*     */     //   41: iconst_2
/*     */     //   42: ior
/*     */     //   43: istore #4
/*     */     //   45: iload_3
/*     */     //   46: bipush #48
/*     */     //   48: iand
/*     */     //   49: ifne -> 74
/*     */     //   52: iload #4
/*     */     //   54: aload_2
/*     */     //   55: iload_1
/*     */     //   56: invokeinterface changed : (Z)Z
/*     */     //   61: ifeq -> 69
/*     */     //   64: bipush #32
/*     */     //   66: goto -> 71
/*     */     //   69: bipush #16
/*     */     //   71: ior
/*     */     //   72: istore #4
/*     */     //   74: iload #4
/*     */     //   76: bipush #19
/*     */     //   78: iand
/*     */     //   79: bipush #18
/*     */     //   81: if_icmpne -> 93
/*     */     //   84: aload_2
/*     */     //   85: invokeinterface getSkipping : ()Z
/*     */     //   90: ifne -> 1228
/*     */     //   93: invokestatic isTraceInProgress : ()Z
/*     */     //   96: ifeq -> 109
/*     */     //   99: ldc -267242038
/*     */     //   101: iload #4
/*     */     //   103: iconst_m1
/*     */     //   104: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainPageSingleColumn (TaskChainPage.kt:20)'
/*     */     //   106: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   109: aload_0
/*     */     //   110: invokevirtual getTaskHeader : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderViewModel;
/*     */     //   113: invokevirtual getUiState : ()Lkotlinx/coroutines/flow/StateFlow;
/*     */     //   116: aconst_null
/*     */     //   117: aload_2
/*     */     //   118: iconst_0
/*     */     //   119: iconst_1
/*     */     //   120: invokestatic collectAsState : (Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*     */     //   123: astore #5
/*     */     //   125: aload_2
/*     */     //   126: iconst_0
/*     */     //   127: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   130: invokevirtual getBackgroundColor-0d7_KjU : ()J
/*     */     //   133: lstore #6
/*     */     //   135: aload #5
/*     */     //   137: invokestatic TaskChainPageSingleColumn$lambda$0 : (Landroidx/compose/runtime/State;)Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;
/*     */     //   140: dup
/*     */     //   141: ifnull -> 150
/*     */     //   144: invokevirtual getErrorMessage : ()Ljava/lang/String;
/*     */     //   147: goto -> 152
/*     */     //   150: pop
/*     */     //   151: aconst_null
/*     */     //   152: astore #8
/*     */     //   154: aload_0
/*     */     //   155: invokevirtual getUnifiedStepList : ()Lkotlinx/coroutines/flow/StateFlow;
/*     */     //   158: aconst_null
/*     */     //   159: aload_2
/*     */     //   160: iconst_0
/*     */     //   161: iconst_1
/*     */     //   162: invokestatic collectAsState : (Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*     */     //   165: astore #9
/*     */     //   167: aload_0
/*     */     //   168: invokevirtual getFollowupModel : ()Lkotlinx/coroutines/flow/StateFlow;
/*     */     //   171: aconst_null
/*     */     //   172: aload_2
/*     */     //   173: iconst_0
/*     */     //   174: iconst_1
/*     */     //   175: invokestatic collectAsState : (Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*     */     //   178: astore #10
/*     */     //   180: aload #10
/*     */     //   182: invokestatic TaskChainPageSingleColumn$lambda$2 : (Landroidx/compose/runtime/State;)Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/followup/FollowupViewModel;
/*     */     //   185: astore #11
/*     */     //   187: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   190: checkcast androidx/compose/ui/Modifier
/*     */     //   193: fconst_0
/*     */     //   194: iconst_1
/*     */     //   195: aconst_null
/*     */     //   196: invokestatic fillMaxHeight$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   199: lload #6
/*     */     //   201: aconst_null
/*     */     //   202: iconst_2
/*     */     //   203: aconst_null
/*     */     //   204: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   207: astore #12
/*     */     //   209: iconst_0
/*     */     //   210: istore #15
/*     */     //   212: iconst_0
/*     */     //   213: istore #16
/*     */     //   215: aload_2
/*     */     //   216: ldc -483455358
/*     */     //   218: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   220: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   223: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   226: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   229: astore #13
/*     */     //   231: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   234: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   237: astore #14
/*     */     //   239: aload #13
/*     */     //   241: aload #14
/*     */     //   243: aload_2
/*     */     //   244: bipush #14
/*     */     //   246: iload #15
/*     */     //   248: iconst_3
/*     */     //   249: ishr
/*     */     //   250: iand
/*     */     //   251: bipush #112
/*     */     //   253: iload #15
/*     */     //   255: iconst_3
/*     */     //   256: ishr
/*     */     //   257: iand
/*     */     //   258: ior
/*     */     //   259: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   262: astore #17
/*     */     //   264: bipush #112
/*     */     //   266: iload #15
/*     */     //   268: iconst_3
/*     */     //   269: ishl
/*     */     //   270: iand
/*     */     //   271: istore #18
/*     */     //   273: nop
/*     */     //   274: iconst_0
/*     */     //   275: istore #19
/*     */     //   277: aload_2
/*     */     //   278: ldc -1323940314
/*     */     //   280: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   282: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   285: aload_2
/*     */     //   286: iconst_0
/*     */     //   287: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   290: istore #20
/*     */     //   292: aload_2
/*     */     //   293: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   298: astore #21
/*     */     //   300: aload_2
/*     */     //   301: aload #12
/*     */     //   303: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   306: astore #22
/*     */     //   308: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   311: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   314: astore #23
/*     */     //   316: bipush #6
/*     */     //   318: sipush #896
/*     */     //   321: iload #18
/*     */     //   323: bipush #6
/*     */     //   325: ishl
/*     */     //   326: iand
/*     */     //   327: ior
/*     */     //   328: istore #24
/*     */     //   330: nop
/*     */     //   331: iconst_0
/*     */     //   332: istore #25
/*     */     //   334: aload_2
/*     */     //   335: ldc -692256719
/*     */     //   337: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   339: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   342: aload_2
/*     */     //   343: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   348: instanceof androidx/compose/runtime/Applier
/*     */     //   351: ifne -> 357
/*     */     //   354: invokestatic invalidApplier : ()V
/*     */     //   357: aload_2
/*     */     //   358: invokeinterface startReusableNode : ()V
/*     */     //   363: aload_2
/*     */     //   364: invokeinterface getInserting : ()Z
/*     */     //   369: ifeq -> 383
/*     */     //   372: aload_2
/*     */     //   373: aload #23
/*     */     //   375: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   380: goto -> 389
/*     */     //   383: aload_2
/*     */     //   384: invokeinterface useNode : ()V
/*     */     //   389: aload_2
/*     */     //   390: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   393: astore #26
/*     */     //   395: iconst_0
/*     */     //   396: istore #27
/*     */     //   398: aload #26
/*     */     //   400: aload #17
/*     */     //   402: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   405: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   408: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   411: aload #26
/*     */     //   413: aload #21
/*     */     //   415: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   418: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   421: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   424: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   427: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   430: astore #28
/*     */     //   432: iconst_0
/*     */     //   433: istore #29
/*     */     //   435: aload #26
/*     */     //   437: astore #30
/*     */     //   439: iconst_0
/*     */     //   440: istore #31
/*     */     //   442: aload #30
/*     */     //   444: invokeinterface getInserting : ()Z
/*     */     //   449: ifne -> 470
/*     */     //   452: aload #30
/*     */     //   454: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   459: iload #20
/*     */     //   461: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   464: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   467: ifne -> 496
/*     */     //   470: aload #30
/*     */     //   472: iload #20
/*     */     //   474: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   477: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   482: aload #26
/*     */     //   484: iload #20
/*     */     //   486: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   489: aload #28
/*     */     //   491: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   496: nop
/*     */     //   497: nop
/*     */     //   498: nop
/*     */     //   499: aload #26
/*     */     //   501: aload #22
/*     */     //   503: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   506: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   509: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   512: nop
/*     */     //   513: nop
/*     */     //   514: aload_2
/*     */     //   515: bipush #14
/*     */     //   517: iload #24
/*     */     //   519: bipush #6
/*     */     //   521: ishr
/*     */     //   522: iand
/*     */     //   523: istore #32
/*     */     //   525: astore #33
/*     */     //   527: iconst_0
/*     */     //   528: istore #34
/*     */     //   530: aload #33
/*     */     //   532: ldc -384784025
/*     */     //   534: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   537: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   540: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   543: aload #33
/*     */     //   545: bipush #6
/*     */     //   547: bipush #112
/*     */     //   549: iload #15
/*     */     //   551: bipush #6
/*     */     //   553: ishr
/*     */     //   554: iand
/*     */     //   555: ior
/*     */     //   556: istore #35
/*     */     //   558: astore #36
/*     */     //   560: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   563: astore #37
/*     */     //   565: iconst_0
/*     */     //   566: istore #38
/*     */     //   568: aload #37
/*     */     //   570: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   573: checkcast androidx/compose/ui/Modifier
/*     */     //   576: bipush #12
/*     */     //   578: istore #39
/*     */     //   580: iconst_0
/*     */     //   581: istore #40
/*     */     //   583: iload #39
/*     */     //   585: i2f
/*     */     //   586: invokestatic constructor-impl : (F)F
/*     */     //   589: bipush #16
/*     */     //   591: istore #39
/*     */     //   593: iconst_0
/*     */     //   594: istore #40
/*     */     //   596: iload #39
/*     */     //   598: i2f
/*     */     //   599: invokestatic constructor-impl : (F)F
/*     */     //   602: fconst_0
/*     */     //   603: fconst_0
/*     */     //   604: bipush #12
/*     */     //   606: aconst_null
/*     */     //   607: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   610: fconst_1
/*     */     //   611: iconst_0
/*     */     //   612: iconst_2
/*     */     //   613: aconst_null
/*     */     //   614: invokestatic weight$default : (Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   617: astore #39
/*     */     //   619: iconst_0
/*     */     //   620: istore #41
/*     */     //   622: iconst_0
/*     */     //   623: istore #42
/*     */     //   625: aload #36
/*     */     //   627: ldc -483455358
/*     */     //   629: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   631: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   634: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   637: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   640: astore #40
/*     */     //   642: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   645: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   648: astore #43
/*     */     //   650: aload #40
/*     */     //   652: aload #43
/*     */     //   654: aload #36
/*     */     //   656: bipush #14
/*     */     //   658: iload #41
/*     */     //   660: iconst_3
/*     */     //   661: ishr
/*     */     //   662: iand
/*     */     //   663: bipush #112
/*     */     //   665: iload #41
/*     */     //   667: iconst_3
/*     */     //   668: ishr
/*     */     //   669: iand
/*     */     //   670: ior
/*     */     //   671: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   674: astore #44
/*     */     //   676: bipush #112
/*     */     //   678: iload #41
/*     */     //   680: iconst_3
/*     */     //   681: ishl
/*     */     //   682: iand
/*     */     //   683: istore #45
/*     */     //   685: nop
/*     */     //   686: iconst_0
/*     */     //   687: istore #46
/*     */     //   689: aload #36
/*     */     //   691: ldc -1323940314
/*     */     //   693: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   695: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   698: aload #36
/*     */     //   700: iconst_0
/*     */     //   701: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   704: istore #47
/*     */     //   706: aload #36
/*     */     //   708: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   713: astore #48
/*     */     //   715: aload #36
/*     */     //   717: aload #39
/*     */     //   719: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   722: astore #49
/*     */     //   724: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   727: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   730: astore #50
/*     */     //   732: bipush #6
/*     */     //   734: sipush #896
/*     */     //   737: iload #45
/*     */     //   739: bipush #6
/*     */     //   741: ishl
/*     */     //   742: iand
/*     */     //   743: ior
/*     */     //   744: istore #51
/*     */     //   746: nop
/*     */     //   747: iconst_0
/*     */     //   748: istore #52
/*     */     //   750: aload #36
/*     */     //   752: ldc -692256719
/*     */     //   754: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   756: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   759: aload #36
/*     */     //   761: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   766: instanceof androidx/compose/runtime/Applier
/*     */     //   769: ifne -> 775
/*     */     //   772: invokestatic invalidApplier : ()V
/*     */     //   775: aload #36
/*     */     //   777: invokeinterface startReusableNode : ()V
/*     */     //   782: aload #36
/*     */     //   784: invokeinterface getInserting : ()Z
/*     */     //   789: ifeq -> 804
/*     */     //   792: aload #36
/*     */     //   794: aload #50
/*     */     //   796: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   801: goto -> 811
/*     */     //   804: aload #36
/*     */     //   806: invokeinterface useNode : ()V
/*     */     //   811: aload #36
/*     */     //   813: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   816: astore #53
/*     */     //   818: iconst_0
/*     */     //   819: istore #54
/*     */     //   821: aload #53
/*     */     //   823: aload #44
/*     */     //   825: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   828: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   831: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   834: aload #53
/*     */     //   836: aload #48
/*     */     //   838: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   841: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   844: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   847: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   850: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   853: astore #55
/*     */     //   855: iconst_0
/*     */     //   856: istore #56
/*     */     //   858: aload #53
/*     */     //   860: astore #57
/*     */     //   862: iconst_0
/*     */     //   863: istore #58
/*     */     //   865: aload #57
/*     */     //   867: invokeinterface getInserting : ()Z
/*     */     //   872: ifne -> 893
/*     */     //   875: aload #57
/*     */     //   877: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   882: iload #47
/*     */     //   884: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   887: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   890: ifne -> 919
/*     */     //   893: aload #57
/*     */     //   895: iload #47
/*     */     //   897: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   900: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   905: aload #53
/*     */     //   907: iload #47
/*     */     //   909: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   912: aload #55
/*     */     //   914: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   919: nop
/*     */     //   920: nop
/*     */     //   921: nop
/*     */     //   922: aload #53
/*     */     //   924: aload #49
/*     */     //   926: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   929: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   932: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   935: nop
/*     */     //   936: nop
/*     */     //   937: aload #36
/*     */     //   939: bipush #14
/*     */     //   941: iload #51
/*     */     //   943: bipush #6
/*     */     //   945: ishr
/*     */     //   946: iand
/*     */     //   947: istore #59
/*     */     //   949: astore #60
/*     */     //   951: iconst_0
/*     */     //   952: istore #61
/*     */     //   954: aload #60
/*     */     //   956: ldc -384784025
/*     */     //   958: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   961: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   964: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   967: aload #60
/*     */     //   969: bipush #6
/*     */     //   971: bipush #112
/*     */     //   973: iload #41
/*     */     //   975: bipush #6
/*     */     //   977: ishr
/*     */     //   978: iand
/*     */     //   979: ior
/*     */     //   980: istore #62
/*     */     //   982: astore #63
/*     */     //   984: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   987: astore #64
/*     */     //   989: iconst_0
/*     */     //   990: istore #65
/*     */     //   992: aload_0
/*     */     //   993: invokevirtual getTaskHeader : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderViewModel;
/*     */     //   996: aload #5
/*     */     //   998: invokestatic TaskChainPageSingleColumn$lambda$0 : (Landroidx/compose/runtime/State;)Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;
/*     */     //   1001: aload #63
/*     */     //   1003: iconst_0
/*     */     //   1004: invokestatic TaskHeader : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderViewModel;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1007: aload_0
/*     */     //   1008: aload #9
/*     */     //   1010: invokestatic TaskChainPageSingleColumn$lambda$1 : (Landroidx/compose/runtime/State;)Ljava/util/List;
/*     */     //   1013: iconst_0
/*     */     //   1014: aload #63
/*     */     //   1016: bipush #14
/*     */     //   1018: iload #4
/*     */     //   1020: iand
/*     */     //   1021: iconst_4
/*     */     //   1022: invokestatic TaskSteps : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;Ljava/util/List;ZLandroidx/compose/runtime/Composer;II)V
/*     */     //   1025: nop
/*     */     //   1026: aload #60
/*     */     //   1028: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1031: aload #36
/*     */     //   1033: invokeinterface endNode : ()V
/*     */     //   1038: aload #36
/*     */     //   1040: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1043: nop
/*     */     //   1044: aload #36
/*     */     //   1046: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1049: nop
/*     */     //   1050: aload #36
/*     */     //   1052: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1055: nop
/*     */     //   1056: aload #36
/*     */     //   1058: ldc_w 1436358231
/*     */     //   1061: invokeinterface startReplaceGroup : (I)V
/*     */     //   1066: aload #11
/*     */     //   1068: ifnull -> 1167
/*     */     //   1071: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1074: astore #39
/*     */     //   1076: iconst_4
/*     */     //   1077: istore #43
/*     */     //   1079: iconst_0
/*     */     //   1080: istore #41
/*     */     //   1082: iload #43
/*     */     //   1084: i2f
/*     */     //   1085: invokestatic constructor-impl : (F)F
/*     */     //   1088: fstore #40
/*     */     //   1090: bipush #8
/*     */     //   1092: istore #41
/*     */     //   1094: iconst_0
/*     */     //   1095: istore #42
/*     */     //   1097: iload #41
/*     */     //   1099: i2f
/*     */     //   1100: invokestatic constructor-impl : (F)F
/*     */     //   1103: fstore #43
/*     */     //   1105: bipush #8
/*     */     //   1107: istore #42
/*     */     //   1109: iconst_0
/*     */     //   1110: istore #44
/*     */     //   1112: iload #42
/*     */     //   1114: i2f
/*     */     //   1115: invokestatic constructor-impl : (F)F
/*     */     //   1118: fstore #41
/*     */     //   1120: aconst_null
/*     */     //   1121: aload #36
/*     */     //   1123: iconst_0
/*     */     //   1124: iconst_1
/*     */     //   1125: invokestatic scrollbarContentSafePadding : (Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Landroidx/compose/runtime/Composer;II)F
/*     */     //   1128: fstore #42
/*     */     //   1130: aload #39
/*     */     //   1132: checkcast androidx/compose/ui/Modifier
/*     */     //   1135: fload #41
/*     */     //   1137: fload #43
/*     */     //   1139: fload #42
/*     */     //   1141: fload #40
/*     */     //   1143: invokestatic padding-qDBjuR0 : (Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;
/*     */     //   1146: aload #11
/*     */     //   1148: iload_1
/*     */     //   1149: aload_0
/*     */     //   1150: invokevirtual getPromptMode : ()Landroidx/compose/runtime/MutableState;
/*     */     //   1153: aload #36
/*     */     //   1155: sipush #896
/*     */     //   1158: iload #4
/*     */     //   1160: iconst_3
/*     */     //   1161: ishl
/*     */     //   1162: iand
/*     */     //   1163: iconst_0
/*     */     //   1164: invokestatic FollowUp : (Landroidx/compose/ui/Modifier;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/followup/FollowupViewModel;ZLandroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1167: aload #36
/*     */     //   1169: invokeinterface endReplaceGroup : ()V
/*     */     //   1174: nop
/*     */     //   1175: aload #33
/*     */     //   1177: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1180: aload_2
/*     */     //   1181: invokeinterface endNode : ()V
/*     */     //   1186: aload_2
/*     */     //   1187: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1190: nop
/*     */     //   1191: aload_2
/*     */     //   1192: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1195: nop
/*     */     //   1196: aload_2
/*     */     //   1197: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1200: nop
/*     */     //   1201: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1204: checkcast androidx/compose/ui/Modifier
/*     */     //   1207: aload #8
/*     */     //   1209: aload_2
/*     */     //   1210: bipush #6
/*     */     //   1212: iconst_0
/*     */     //   1213: invokestatic TaskError : (Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1216: invokestatic isTraceInProgress : ()Z
/*     */     //   1219: ifeq -> 1234
/*     */     //   1222: invokestatic traceEventEnd : ()V
/*     */     //   1225: goto -> 1234
/*     */     //   1228: aload_2
/*     */     //   1229: invokeinterface skipToGroupEnd : ()V
/*     */     //   1234: aload_2
/*     */     //   1235: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1240: dup
/*     */     //   1241: ifnull -> 1260
/*     */     //   1244: aload_0
/*     */     //   1245: iload_1
/*     */     //   1246: iload_3
/*     */     //   1247: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;ZI)Lkotlin/jvm/functions/Function2;
/*     */     //   1252: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1257: goto -> 1261
/*     */     //   1260: pop
/*     */     //   1261: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #21	-> 6
/*     */     //   #22	-> 109
/*     */     //   #23	-> 127
/*     */     //   #24	-> 135
/*     */     //   #25	-> 154
/*     */     //   #26	-> 167
/*     */     //   #27	-> 180
/*     */     //   #29	-> 187
/*     */     //   #113	-> 220
/*     */     //   #114	-> 223
/*     */     //   #115	-> 231
/*     */     //   #118	-> 239
/*     */     //   #119	-> 273
/*     */     //   #120	-> 282
/*     */     //   #121	-> 287
/*     */     //   #122	-> 293
/*     */     //   #123	-> 301
/*     */     //   #125	-> 308
/*     */     //   #124	-> 330
/*     */     //   #126	-> 339
/*     */     //   #127	-> 342
/*     */     //   #128	-> 358
/*     */     //   #129	-> 363
/*     */     //   #130	-> 373
/*     */     //   #132	-> 384
/*     */     //   #134	-> 389
/*     */     //   #135	-> 398
/*     */     //   #136	-> 411
/*     */     //   #138	-> 424
/*     */     //   #139	-> 435
/*     */     //   #140	-> 442
/*     */     //   #141	-> 470
/*     */     //   #142	-> 482
/*     */     //   #144	-> 496
/*     */     //   #139	-> 497
/*     */     //   #144	-> 498
/*     */     //   #145	-> 499
/*     */     //   #146	-> 512
/*     */     //   #134	-> 513
/*     */     //   #147	-> 514
/*     */     //   #148	-> 537
/*     */     //   #30	-> 568
/*     */     //   #149	-> 583
/*     */     //   #30	-> 589
/*     */     //   #149	-> 596
/*     */     //   #30	-> 602
/*     */     //   #150	-> 631
/*     */     //   #151	-> 634
/*     */     //   #152	-> 642
/*     */     //   #155	-> 650
/*     */     //   #156	-> 685
/*     */     //   #157	-> 695
/*     */     //   #158	-> 701
/*     */     //   #159	-> 708
/*     */     //   #160	-> 717
/*     */     //   #162	-> 724
/*     */     //   #161	-> 746
/*     */     //   #163	-> 756
/*     */     //   #164	-> 759
/*     */     //   #165	-> 777
/*     */     //   #166	-> 782
/*     */     //   #167	-> 794
/*     */     //   #169	-> 806
/*     */     //   #171	-> 811
/*     */     //   #172	-> 821
/*     */     //   #173	-> 834
/*     */     //   #175	-> 847
/*     */     //   #176	-> 858
/*     */     //   #177	-> 865
/*     */     //   #178	-> 893
/*     */     //   #179	-> 905
/*     */     //   #181	-> 919
/*     */     //   #176	-> 920
/*     */     //   #181	-> 921
/*     */     //   #182	-> 922
/*     */     //   #183	-> 935
/*     */     //   #171	-> 936
/*     */     //   #184	-> 937
/*     */     //   #185	-> 961
/*     */     //   #31	-> 992
/*     */     //   #33	-> 1007
/*     */     //   #34	-> 1008
/*     */     //   #32	-> 1022
/*     */     //   #36	-> 1025
/*     */     //   #185	-> 1026
/*     */     //   #184	-> 1031
/*     */     //   #186	-> 1033
/*     */     //   #163	-> 1040
/*     */     //   #187	-> 1043
/*     */     //   #157	-> 1046
/*     */     //   #188	-> 1049
/*     */     //   #150	-> 1052
/*     */     //   #189	-> 1055
/*     */     //   #37	-> 1066
/*     */     //   #39	-> 1071
/*     */     //   #190	-> 1082
/*     */     //   #39	-> 1088
/*     */     //   #190	-> 1097
/*     */     //   #39	-> 1103
/*     */     //   #190	-> 1112
/*     */     //   #39	-> 1118
/*     */     //   #40	-> 1146
/*     */     //   #41	-> 1148
/*     */     //   #42	-> 1149
/*     */     //   #38	-> 1164
/*     */     //   #45	-> 1174
/*     */     //   #148	-> 1175
/*     */     //   #147	-> 1180
/*     */     //   #191	-> 1181
/*     */     //   #126	-> 1187
/*     */     //   #192	-> 1190
/*     */     //   #120	-> 1192
/*     */     //   #193	-> 1195
/*     */     //   #113	-> 1197
/*     */     //   #194	-> 1200
/*     */     //   #46	-> 1201
/*     */     //   #47	-> 1228
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   583	6	40	$i$f$getDp	I
/*     */     //   580	9	39	$this$dp$iv	I
/*     */     //   596	6	40	$i$f$getDp	I
/*     */     //   593	9	39	$this$dp$iv	I
/*     */     //   992	34	65	$i$a$-Column-TaskChainPageKt$TaskChainPageSingleColumn$1$1	I
/*     */     //   989	37	64	$this$TaskChainPageSingleColumn_u24lambda_u244_u24lambda_u243	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   989	37	63	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   989	37	62	$changed	I
/*     */     //   954	77	61	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   951	80	60	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   951	80	59	$changed$iv	I
/*     */     //   865	55	58	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   862	58	57	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   858	64	56	$i$f$set-impl	I
/*     */     //   855	67	55	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   821	115	54	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   818	118	53	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   750	294	52	$i$f$ReusableComposeNode	I
/*     */     //   747	297	50	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   747	297	51	$changed$iv$iv$iv	I
/*     */     //   689	361	46	$i$f$Layout	I
/*     */     //   706	344	47	compositeKeyHash$iv$iv	I
/*     */     //   715	335	48	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   724	326	49	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   686	364	45	$changed$iv$iv	I
/*     */     //   625	431	42	$i$f$Column	I
/*     */     //   676	380	44	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   622	434	39	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   642	414	40	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   650	406	43	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   622	434	41	$changed$iv	I
/*     */     //   1082	6	41	$i$f$getDp	I
/*     */     //   1079	9	43	$this$dp$iv	I
/*     */     //   1097	6	42	$i$f$getDp	I
/*     */     //   1094	9	41	$this$dp$iv	I
/*     */     //   1112	6	44	$i$f$getDp	I
/*     */     //   1109	9	42	$this$dp$iv	I
/*     */     //   568	607	38	$i$a$-Column-TaskChainPageKt$TaskChainPageSingleColumn$1	I
/*     */     //   565	610	37	$this$TaskChainPageSingleColumn_u24lambda_u244	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   565	610	36	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   565	610	35	$changed	I
/*     */     //   530	650	34	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   527	653	33	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   527	653	32	$changed$iv	I
/*     */     //   442	55	31	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   439	58	30	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   435	64	29	$i$f$set-impl	I
/*     */     //   432	67	28	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   398	115	27	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   395	118	26	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   334	857	25	$i$f$ReusableComposeNode	I
/*     */     //   331	860	23	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   331	860	24	$changed$iv$iv$iv	I
/*     */     //   277	919	19	$i$f$Layout	I
/*     */     //   292	904	20	compositeKeyHash$iv$iv	I
/*     */     //   300	896	21	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   308	888	22	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   274	922	18	$changed$iv$iv	I
/*     */     //   215	986	16	$i$f$Column	I
/*     */     //   264	937	17	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   212	989	12	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   231	970	13	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   239	962	14	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   212	989	15	$changed$iv	I
/*     */     //   125	1100	5	state$delegate	Landroidx/compose/runtime/State;
/*     */     //   135	1090	6	background	J
/*     */     //   154	1071	8	errorMessage	Ljava/lang/String;
/*     */     //   167	1058	9	unifiedStepList$delegate	Landroidx/compose/runtime/State;
/*     */     //   180	1045	10	followUpModel$delegate	Landroidx/compose/runtime/State;
/*     */     //   187	1038	11	followUp	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/followup/FollowupViewModel;
/*     */     //   18	1244	4	$dirty	I
/*     */     //   0	1262	0	model	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;
/*     */     //   0	1262	1	sendPromptEnabled	Z
/*     */     //   0	1262	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1262	3	$changed	I
/*     */   }
/*     */   
/*  22 */   private static final TaskHeaderState TaskChainPageSingleColumn$lambda$0(State $state$delegate) { State state = $state$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 335 */       (TaskHeaderState)state.getValue(); } private static final List<TaskStep> TaskChainPageSingleColumn$lambda$1(State $unifiedStepList$delegate) { State state = $unifiedStepList$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 336 */     return (List<TaskStep>)state.getValue(); } private static final FollowupViewModel TaskChainPageSingleColumn$lambda$2(State $followUpModel$delegate) { State state = $followUpModel$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 337 */     return (FollowupViewModel)state.getValue(); } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void TaskChainLeftColumn(@NotNull TaskChainDetailsViewModel model, @Nullable Composer $composer, int $changed) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'model'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc_w -1298459842
/*     */     //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   15: astore_1
/*     */     //   16: iload_2
/*     */     //   17: istore_3
/*     */     //   18: iload_2
/*     */     //   19: bipush #6
/*     */     //   21: iand
/*     */     //   22: ifne -> 43
/*     */     //   25: iload_3
/*     */     //   26: aload_1
/*     */     //   27: aload_0
/*     */     //   28: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   33: ifeq -> 40
/*     */     //   36: iconst_4
/*     */     //   37: goto -> 41
/*     */     //   40: iconst_2
/*     */     //   41: ior
/*     */     //   42: istore_3
/*     */     //   43: iload_3
/*     */     //   44: iconst_3
/*     */     //   45: iand
/*     */     //   46: iconst_2
/*     */     //   47: if_icmpne -> 59
/*     */     //   50: aload_1
/*     */     //   51: invokeinterface getSkipping : ()Z
/*     */     //   56: ifne -> 1028
/*     */     //   59: invokestatic isTraceInProgress : ()Z
/*     */     //   62: ifeq -> 76
/*     */     //   65: ldc_w -1298459842
/*     */     //   68: iload_3
/*     */     //   69: iconst_m1
/*     */     //   70: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainLeftColumn (TaskChainPage.kt:52)'
/*     */     //   73: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   76: aload_0
/*     */     //   77: invokevirtual getTaskHeader : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderViewModel;
/*     */     //   80: invokevirtual getUiState : ()Lkotlinx/coroutines/flow/StateFlow;
/*     */     //   83: aconst_null
/*     */     //   84: aload_1
/*     */     //   85: iconst_0
/*     */     //   86: iconst_1
/*     */     //   87: invokestatic collectAsState : (Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*     */     //   90: astore #4
/*     */     //   92: aload_0
/*     */     //   93: invokevirtual getLeftListState : ()Landroidx/compose/foundation/ScrollState;
/*     */     //   96: astore #5
/*     */     //   98: aload_0
/*     */     //   99: invokevirtual getStepMapFlow : ()Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   102: checkcast kotlinx/coroutines/flow/StateFlow
/*     */     //   105: aconst_null
/*     */     //   106: aload_1
/*     */     //   107: iconst_0
/*     */     //   108: iconst_1
/*     */     //   109: invokestatic collectAsState : (Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*     */     //   112: astore #6
/*     */     //   114: aload_1
/*     */     //   115: ldc_w 144585909
/*     */     //   118: invokeinterface startReplaceGroup : (I)V
/*     */     //   123: aload_1
/*     */     //   124: astore #9
/*     */     //   126: iconst_0
/*     */     //   127: istore #10
/*     */     //   129: nop
/*     */     //   130: iconst_0
/*     */     //   131: istore #11
/*     */     //   133: aload #9
/*     */     //   135: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   140: astore #12
/*     */     //   142: iconst_0
/*     */     //   143: istore #13
/*     */     //   145: aload #12
/*     */     //   147: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   150: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   153: if_acmpne -> 185
/*     */     //   156: iconst_0
/*     */     //   157: istore #14
/*     */     //   159: iconst_0
/*     */     //   160: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   163: aconst_null
/*     */     //   164: iconst_2
/*     */     //   165: aconst_null
/*     */     //   166: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   169: astore #14
/*     */     //   171: aload #9
/*     */     //   173: aload #14
/*     */     //   175: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   180: aload #14
/*     */     //   182: goto -> 187
/*     */     //   185: aload #12
/*     */     //   187: nop
/*     */     //   188: nop
/*     */     //   189: nop
/*     */     //   190: checkcast androidx/compose/runtime/MutableState
/*     */     //   193: astore #8
/*     */     //   195: aload_1
/*     */     //   196: invokeinterface endReplaceGroup : ()V
/*     */     //   201: aload #8
/*     */     //   203: astore #7
/*     */     //   205: aload #6
/*     */     //   207: invokestatic TaskChainLeftColumn$lambda$7 : (Landroidx/compose/runtime/State;)Ljava/util/Map;
/*     */     //   210: invokeinterface keySet : ()Ljava/util/Set;
/*     */     //   215: invokeinterface size : ()I
/*     */     //   220: istore #8
/*     */     //   222: iload #8
/*     */     //   224: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   227: aload_1
/*     */     //   228: ldc_w 144589269
/*     */     //   231: invokeinterface startReplaceGroup : (I)V
/*     */     //   236: aload_1
/*     */     //   237: astore #10
/*     */     //   239: aload_1
/*     */     //   240: iload #8
/*     */     //   242: invokeinterface changed : (I)Z
/*     */     //   247: istore #11
/*     */     //   249: iconst_0
/*     */     //   250: istore #12
/*     */     //   252: aload #10
/*     */     //   254: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   259: astore #13
/*     */     //   261: iconst_0
/*     */     //   262: istore #14
/*     */     //   264: iload #11
/*     */     //   266: ifne -> 280
/*     */     //   269: aload #13
/*     */     //   271: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   274: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   277: if_acmpne -> 319
/*     */     //   280: astore #45
/*     */     //   282: iconst_0
/*     */     //   283: istore #15
/*     */     //   285: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainPageKt$TaskChainLeftColumn$1$1
/*     */     //   288: dup
/*     */     //   289: iload #8
/*     */     //   291: aload #7
/*     */     //   293: aconst_null
/*     */     //   294: invokespecial <init> : (ILandroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*     */     //   297: checkcast kotlin/jvm/functions/Function2
/*     */     //   300: aload #45
/*     */     //   302: swap
/*     */     //   303: astore #16
/*     */     //   305: aload #10
/*     */     //   307: aload #16
/*     */     //   309: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   314: aload #16
/*     */     //   316: goto -> 321
/*     */     //   319: aload #13
/*     */     //   321: nop
/*     */     //   322: nop
/*     */     //   323: nop
/*     */     //   324: checkcast kotlin/jvm/functions/Function2
/*     */     //   327: astore #9
/*     */     //   329: aload_1
/*     */     //   330: invokeinterface endReplaceGroup : ()V
/*     */     //   335: aload #9
/*     */     //   337: aload_1
/*     */     //   338: iconst_0
/*     */     //   339: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   342: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   345: checkcast androidx/compose/ui/Modifier
/*     */     //   348: fconst_0
/*     */     //   349: iconst_1
/*     */     //   350: aconst_null
/*     */     //   351: invokestatic fillMaxSize$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   354: aload_1
/*     */     //   355: iconst_0
/*     */     //   356: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   359: invokevirtual getBackgroundColor-0d7_KjU : ()J
/*     */     //   362: aconst_null
/*     */     //   363: iconst_2
/*     */     //   364: aconst_null
/*     */     //   365: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   368: astore #9
/*     */     //   370: bipush #8
/*     */     //   372: istore #11
/*     */     //   374: iconst_0
/*     */     //   375: istore #12
/*     */     //   377: iload #11
/*     */     //   379: i2f
/*     */     //   380: invokestatic constructor-impl : (F)F
/*     */     //   383: fstore #10
/*     */     //   385: bipush #8
/*     */     //   387: istore #12
/*     */     //   389: iconst_0
/*     */     //   390: istore #13
/*     */     //   392: iload #12
/*     */     //   394: i2f
/*     */     //   395: invokestatic constructor-impl : (F)F
/*     */     //   398: fstore #11
/*     */     //   400: aload #9
/*     */     //   402: fload #11
/*     */     //   404: fload #10
/*     */     //   406: invokestatic padding-VpY3zN4 : (Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;
/*     */     //   409: astore #9
/*     */     //   411: iconst_0
/*     */     //   412: istore #12
/*     */     //   414: nop
/*     */     //   415: iconst_0
/*     */     //   416: istore #13
/*     */     //   418: aload_1
/*     */     //   419: ldc -483455358
/*     */     //   421: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   423: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   426: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   429: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   432: astore #10
/*     */     //   434: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   437: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   440: astore #11
/*     */     //   442: aload #10
/*     */     //   444: aload #11
/*     */     //   446: aload_1
/*     */     //   447: bipush #14
/*     */     //   449: iload #12
/*     */     //   451: iconst_3
/*     */     //   452: ishr
/*     */     //   453: iand
/*     */     //   454: bipush #112
/*     */     //   456: iload #12
/*     */     //   458: iconst_3
/*     */     //   459: ishr
/*     */     //   460: iand
/*     */     //   461: ior
/*     */     //   462: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   465: astore #14
/*     */     //   467: bipush #112
/*     */     //   469: iload #12
/*     */     //   471: iconst_3
/*     */     //   472: ishl
/*     */     //   473: iand
/*     */     //   474: istore #15
/*     */     //   476: nop
/*     */     //   477: iconst_0
/*     */     //   478: istore #16
/*     */     //   480: aload_1
/*     */     //   481: ldc -1323940314
/*     */     //   483: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   485: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   488: aload_1
/*     */     //   489: iconst_0
/*     */     //   490: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   493: istore #17
/*     */     //   495: aload_1
/*     */     //   496: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   501: astore #18
/*     */     //   503: aload_1
/*     */     //   504: aload #9
/*     */     //   506: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   509: astore #19
/*     */     //   511: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   514: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   517: astore #20
/*     */     //   519: bipush #6
/*     */     //   521: sipush #896
/*     */     //   524: iload #15
/*     */     //   526: bipush #6
/*     */     //   528: ishl
/*     */     //   529: iand
/*     */     //   530: ior
/*     */     //   531: istore #21
/*     */     //   533: nop
/*     */     //   534: iconst_0
/*     */     //   535: istore #22
/*     */     //   537: aload_1
/*     */     //   538: ldc -692256719
/*     */     //   540: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   542: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   545: aload_1
/*     */     //   546: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   551: instanceof androidx/compose/runtime/Applier
/*     */     //   554: ifne -> 560
/*     */     //   557: invokestatic invalidApplier : ()V
/*     */     //   560: aload_1
/*     */     //   561: invokeinterface startReusableNode : ()V
/*     */     //   566: aload_1
/*     */     //   567: invokeinterface getInserting : ()Z
/*     */     //   572: ifeq -> 586
/*     */     //   575: aload_1
/*     */     //   576: aload #20
/*     */     //   578: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   583: goto -> 592
/*     */     //   586: aload_1
/*     */     //   587: invokeinterface useNode : ()V
/*     */     //   592: aload_1
/*     */     //   593: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   596: astore #23
/*     */     //   598: iconst_0
/*     */     //   599: istore #24
/*     */     //   601: aload #23
/*     */     //   603: aload #14
/*     */     //   605: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   608: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   611: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   614: aload #23
/*     */     //   616: aload #18
/*     */     //   618: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   621: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   624: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   627: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   630: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   633: astore #25
/*     */     //   635: iconst_0
/*     */     //   636: istore #26
/*     */     //   638: aload #23
/*     */     //   640: astore #27
/*     */     //   642: iconst_0
/*     */     //   643: istore #28
/*     */     //   645: aload #27
/*     */     //   647: invokeinterface getInserting : ()Z
/*     */     //   652: ifne -> 673
/*     */     //   655: aload #27
/*     */     //   657: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   662: iload #17
/*     */     //   664: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   667: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   670: ifne -> 699
/*     */     //   673: aload #27
/*     */     //   675: iload #17
/*     */     //   677: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   680: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   685: aload #23
/*     */     //   687: iload #17
/*     */     //   689: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   692: aload #25
/*     */     //   694: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   699: nop
/*     */     //   700: nop
/*     */     //   701: nop
/*     */     //   702: aload #23
/*     */     //   704: aload #19
/*     */     //   706: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   709: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   712: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   715: nop
/*     */     //   716: nop
/*     */     //   717: aload_1
/*     */     //   718: bipush #14
/*     */     //   720: iload #21
/*     */     //   722: bipush #6
/*     */     //   724: ishr
/*     */     //   725: iand
/*     */     //   726: istore #29
/*     */     //   728: astore #30
/*     */     //   730: iconst_0
/*     */     //   731: istore #31
/*     */     //   733: aload #30
/*     */     //   735: ldc -384784025
/*     */     //   737: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   740: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   743: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   746: aload #30
/*     */     //   748: bipush #6
/*     */     //   750: bipush #112
/*     */     //   752: iload #12
/*     */     //   754: bipush #6
/*     */     //   756: ishr
/*     */     //   757: iand
/*     */     //   758: ior
/*     */     //   759: istore #32
/*     */     //   761: astore #33
/*     */     //   763: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   766: astore #34
/*     */     //   768: iconst_0
/*     */     //   769: istore #35
/*     */     //   771: aload_0
/*     */     //   772: invokevirtual getTaskHeader : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderViewModel;
/*     */     //   775: aload #4
/*     */     //   777: invokestatic TaskChainLeftColumn$lambda$6 : (Landroidx/compose/runtime/State;)Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;
/*     */     //   780: aload #33
/*     */     //   782: iconst_0
/*     */     //   783: invokestatic TaskHeader : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderViewModel;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;Landroidx/compose/runtime/Composer;I)V
/*     */     //   786: aload #33
/*     */     //   788: ldc_w 878250970
/*     */     //   791: invokeinterface startReplaceGroup : (I)V
/*     */     //   796: aload #33
/*     */     //   798: astore #36
/*     */     //   800: aload #33
/*     */     //   802: aload #4
/*     */     //   804: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   809: istore #37
/*     */     //   811: nop
/*     */     //   812: iconst_0
/*     */     //   813: istore #38
/*     */     //   815: aload #36
/*     */     //   817: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   822: astore #39
/*     */     //   824: iconst_0
/*     */     //   825: istore #40
/*     */     //   827: iload #37
/*     */     //   829: ifne -> 843
/*     */     //   832: aload #39
/*     */     //   834: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   837: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   840: if_acmpne -> 869
/*     */     //   843: iconst_0
/*     */     //   844: istore #41
/*     */     //   846: aload #4
/*     */     //   848: <illegal opcode> invoke : (Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function0;
/*     */     //   853: astore #42
/*     */     //   855: aload #36
/*     */     //   857: aload #42
/*     */     //   859: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   864: aload #42
/*     */     //   866: goto -> 871
/*     */     //   869: aload #39
/*     */     //   871: nop
/*     */     //   872: nop
/*     */     //   873: nop
/*     */     //   874: checkcast kotlin/jvm/functions/Function0
/*     */     //   877: astore #43
/*     */     //   879: aload #33
/*     */     //   881: invokeinterface endReplaceGroup : ()V
/*     */     //   886: aload #43
/*     */     //   888: invokestatic derivedStateOf : (Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;
/*     */     //   891: astore #44
/*     */     //   893: aload #34
/*     */     //   895: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   898: checkcast androidx/compose/ui/Modifier
/*     */     //   901: fconst_1
/*     */     //   902: iconst_0
/*     */     //   903: iconst_2
/*     */     //   904: aconst_null
/*     */     //   905: invokestatic weight$default : (Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   908: fconst_0
/*     */     //   909: iconst_1
/*     */     //   910: aconst_null
/*     */     //   911: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   914: fconst_0
/*     */     //   915: iconst_1
/*     */     //   916: aconst_null
/*     */     //   917: invokestatic fillMaxHeight$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   920: fconst_0
/*     */     //   921: bipush #17
/*     */     //   923: istore #36
/*     */     //   925: iconst_0
/*     */     //   926: istore #37
/*     */     //   928: iload #36
/*     */     //   930: i2f
/*     */     //   931: invokestatic constructor-impl : (F)F
/*     */     //   934: fconst_0
/*     */     //   935: fconst_0
/*     */     //   936: bipush #13
/*     */     //   938: aconst_null
/*     */     //   939: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   942: aconst_null
/*     */     //   943: aload #5
/*     */     //   945: aconst_null
/*     */     //   946: iconst_0
/*     */     //   947: iconst_0
/*     */     //   948: aconst_null
/*     */     //   949: ldc_w 1948648313
/*     */     //   952: iconst_1
/*     */     //   953: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainPageKt$TaskChainLeftColumn$2$1
/*     */     //   956: dup
/*     */     //   957: aload_0
/*     */     //   958: aload #34
/*     */     //   960: aload #6
/*     */     //   962: aload #44
/*     */     //   964: aload #7
/*     */     //   966: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;)V
/*     */     //   969: aload #33
/*     */     //   971: bipush #54
/*     */     //   973: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   976: checkcast kotlin/jvm/functions/Function2
/*     */     //   979: aload #33
/*     */     //   981: ldc_w 12582912
/*     */     //   984: bipush #122
/*     */     //   986: invokestatic VerticallyScrollableContainer : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   989: nop
/*     */     //   990: aload #30
/*     */     //   992: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   995: aload_1
/*     */     //   996: invokeinterface endNode : ()V
/*     */     //   1001: aload_1
/*     */     //   1002: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1005: nop
/*     */     //   1006: aload_1
/*     */     //   1007: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1010: nop
/*     */     //   1011: aload_1
/*     */     //   1012: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1015: nop
/*     */     //   1016: invokestatic isTraceInProgress : ()Z
/*     */     //   1019: ifeq -> 1034
/*     */     //   1022: invokestatic traceEventEnd : ()V
/*     */     //   1025: goto -> 1034
/*     */     //   1028: aload_1
/*     */     //   1029: invokeinterface skipToGroupEnd : ()V
/*     */     //   1034: aload_1
/*     */     //   1035: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1040: dup
/*     */     //   1041: ifnull -> 1059
/*     */     //   1044: aload_0
/*     */     //   1045: iload_2
/*     */     //   1046: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;I)Lkotlin/jvm/functions/Function2;
/*     */     //   1051: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1056: goto -> 1060
/*     */     //   1059: pop
/*     */     //   1060: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #53	-> 6
/*     */     //   #54	-> 76
/*     */     //   #55	-> 92
/*     */     //   #56	-> 98
/*     */     //   #58	-> 129
/*     */     //   #195	-> 133
/*     */     //   #196	-> 145
/*     */     //   #197	-> 156
/*     */     //   #58	-> 159
/*     */     //   #197	-> 169
/*     */     //   #198	-> 171
/*     */     //   #199	-> 180
/*     */     //   #200	-> 185
/*     */     //   #196	-> 187
/*     */     //   #195	-> 188
/*     */     //   #195	-> 189
/*     */     //   #58	-> 190
/*     */     //   #59	-> 205
/*     */     //   #61	-> 222
/*     */     //   #201	-> 252
/*     */     //   #202	-> 264
/*     */     //   #203	-> 280
/*     */     //   #61	-> 285
/*     */     //   #203	-> 303
/*     */     //   #204	-> 305
/*     */     //   #205	-> 314
/*     */     //   #206	-> 319
/*     */     //   #202	-> 321
/*     */     //   #201	-> 322
/*     */     //   #201	-> 323
/*     */     //   #61	-> 324
/*     */     //   #65	-> 342
/*     */     //   #207	-> 377
/*     */     //   #65	-> 383
/*     */     //   #207	-> 392
/*     */     //   #65	-> 398
/*     */     //   #64	-> 414
/*     */     //   #208	-> 423
/*     */     //   #209	-> 426
/*     */     //   #210	-> 434
/*     */     //   #213	-> 442
/*     */     //   #214	-> 476
/*     */     //   #215	-> 485
/*     */     //   #216	-> 490
/*     */     //   #217	-> 496
/*     */     //   #218	-> 504
/*     */     //   #220	-> 511
/*     */     //   #219	-> 533
/*     */     //   #221	-> 542
/*     */     //   #222	-> 545
/*     */     //   #223	-> 561
/*     */     //   #224	-> 566
/*     */     //   #225	-> 576
/*     */     //   #227	-> 587
/*     */     //   #229	-> 592
/*     */     //   #230	-> 601
/*     */     //   #231	-> 614
/*     */     //   #233	-> 627
/*     */     //   #234	-> 638
/*     */     //   #235	-> 645
/*     */     //   #236	-> 673
/*     */     //   #237	-> 685
/*     */     //   #239	-> 699
/*     */     //   #234	-> 700
/*     */     //   #239	-> 701
/*     */     //   #240	-> 702
/*     */     //   #241	-> 715
/*     */     //   #229	-> 716
/*     */     //   #242	-> 717
/*     */     //   #243	-> 740
/*     */     //   #67	-> 771
/*     */     //   #68	-> 811
/*     */     //   #244	-> 815
/*     */     //   #245	-> 827
/*     */     //   #246	-> 843
/*     */     //   #68	-> 846
/*     */     //   #246	-> 853
/*     */     //   #247	-> 855
/*     */     //   #248	-> 864
/*     */     //   #249	-> 869
/*     */     //   #245	-> 871
/*     */     //   #244	-> 872
/*     */     //   #244	-> 873
/*     */     //   #68	-> 874
/*     */     //   #73	-> 893
/*     */     //   #74	-> 901
/*     */     //   #75	-> 908
/*     */     //   #76	-> 914
/*     */     //   #77	-> 920
/*     */     //   #250	-> 928
/*     */     //   #77	-> 934
/*     */     //   #72	-> 943
/*     */     //   #78	-> 949
/*     */     //   #71	-> 986
/*     */     //   #87	-> 989
/*     */     //   #243	-> 990
/*     */     //   #242	-> 995
/*     */     //   #251	-> 996
/*     */     //   #221	-> 1002
/*     */     //   #252	-> 1005
/*     */     //   #215	-> 1007
/*     */     //   #253	-> 1010
/*     */     //   #208	-> 1012
/*     */     //   #254	-> 1015
/*     */     //   #88	-> 1028
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   159	10	14	$i$a$-cache-TaskChainPageKt$TaskChainLeftColumn$selectedIndex$2	I
/*     */     //   171	11	14	value$iv	Ljava/lang/Object;
/*     */     //   145	43	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   142	46	12	it$iv	Ljava/lang/Object;
/*     */     //   133	57	11	$i$f$cache	I
/*     */     //   130	60	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   130	60	10	invalid$iv	Z
/*     */     //   285	15	15	$i$a$-cache-TaskChainPageKt$TaskChainLeftColumn$1	I
/*     */     //   305	11	16	value$iv	Ljava/lang/Object;
/*     */     //   264	58	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   261	61	13	it$iv	Ljava/lang/Object;
/*     */     //   252	72	12	$i$f$cache	I
/*     */     //   249	75	10	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   249	75	11	invalid$iv	Z
/*     */     //   377	6	12	$i$f$getDp	I
/*     */     //   374	9	11	$this$dp$iv	I
/*     */     //   392	6	13	$i$f$getDp	I
/*     */     //   389	9	12	$this$dp$iv	I
/*     */     //   846	7	41	$i$a$-cache-TaskChainPageKt$TaskChainLeftColumn$2$isChainRunning$2	I
/*     */     //   855	11	42	value$iv	Ljava/lang/Object;
/*     */     //   827	45	40	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   824	48	39	it$iv	Ljava/lang/Object;
/*     */     //   815	59	38	$i$f$cache	I
/*     */     //   812	62	36	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   812	62	37	invalid$iv	Z
/*     */     //   928	6	37	$i$f$getDp	I
/*     */     //   925	9	36	$this$dp$iv	I
/*     */     //   771	219	35	$i$a$-Column-TaskChainPageKt$TaskChainLeftColumn$2	I
/*     */     //   893	97	44	isChainRunning$delegate	Landroidx/compose/runtime/State;
/*     */     //   768	222	34	$this$TaskChainLeftColumn_u24lambda_u2415	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   768	222	33	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   768	222	32	$changed	I
/*     */     //   733	262	31	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   730	265	30	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   730	265	29	$changed$iv	I
/*     */     //   645	55	28	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   642	58	27	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   638	64	26	$i$f$set-impl	I
/*     */     //   635	67	25	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   601	115	24	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   598	118	23	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   537	469	22	$i$f$ReusableComposeNode	I
/*     */     //   534	472	20	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   534	472	21	$changed$iv$iv$iv	I
/*     */     //   480	531	16	$i$f$Layout	I
/*     */     //   495	516	17	compositeKeyHash$iv$iv	I
/*     */     //   503	508	18	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   511	500	19	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   477	534	15	$changed$iv$iv	I
/*     */     //   418	598	13	$i$f$Column	I
/*     */     //   467	549	14	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   415	601	9	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   434	582	10	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   442	574	11	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   415	601	12	$changed$iv	I
/*     */     //   92	933	4	state$delegate	Landroidx/compose/runtime/State;
/*     */     //   98	927	5	scrollState	Landroidx/compose/foundation/ScrollState;
/*     */     //   114	911	6	taskMap$delegate	Landroidx/compose/runtime/State;
/*     */     //   205	820	7	selectedIndex$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   222	803	8	taskChainSize	I
/*     */     //   18	1043	3	$dirty	I
/*     */     //   0	1061	0	model	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;
/*     */     //   0	1061	1	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1061	2	$changed	I }
/* 338 */   private static final TaskHeaderState TaskChainLeftColumn$lambda$6(State $state$delegate) { State state = $state$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (TaskHeaderState)state.getValue(); } private static final Map<Integer, TaskRecapModel> TaskChainLeftColumn$lambda$7(State $taskMap$delegate) { State state = $taskMap$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 339 */     return (Map<Integer, TaskRecapModel>)state.getValue(); } private static final int TaskChainLeftColumn$lambda$9(MutableState $selectedIndex$delegate) { State state = (State)$selectedIndex$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 340 */     return ((Number)state.getValue()).intValue(); } private static final void TaskChainLeftColumn$lambda$10(MutableState $selectedIndex$delegate, int <set-?>) { MutableState mutableState = $selectedIndex$delegate; Object object1 = null, object2 = null; Object value$iv = Integer.valueOf(<set-?>); int $i$f$setValue = 0;
/* 341 */     mutableState.setValue(value$iv); } @DebugMetadata(f = "TaskChainPage.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainPageKt$TaskChainLeftColumn$1$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class TaskChainPageKt$TaskChainLeftColumn$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label; TaskChainPageKt$TaskChainLeftColumn$1$1(int $taskChainSize, MutableState<Integer> $selectedIndex$delegate, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); TaskChainPageKt.TaskChainLeftColumn$lambda$10(this.$selectedIndex$delegate, RangesKt.coerceAtLeast(this.$taskChainSize - 1, 0)); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super TaskChainPageKt$TaskChainLeftColumn$1$1> $completion) { return (Continuation<Unit>)new TaskChainPageKt$TaskChainLeftColumn$1$1(this.$taskChainSize, this.$selectedIndex$delegate, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((TaskChainPageKt$TaskChainLeftColumn$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/* 343 */   private static final boolean TaskChainLeftColumn$lambda$15$lambda$14(State $isChainRunning$delegate) { State state = $isChainRunning$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Boolean)state.getValue()).booleanValue(); }
/* 344 */   private static final boolean TaskChainLeftColumn$lambda$15$lambda$13$lambda$12(State $state$delegate) { return (!(TaskChainLeftColumn$lambda$6($state$delegate) instanceof TaskHeaderState.Terminal) && !(TaskChainLeftColumn$lambda$6($state$delegate) instanceof TaskHeaderState.Failed)); } private static final TaskHeaderState TaskChainRightColumn$lambda$17(State $state$delegate) { State state = $state$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (TaskHeaderState)state.getValue(); } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nTaskChainPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskChainPage.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainPageKt$TaskChainLeftColumn$2$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,112:1\n1225#2,6:113\n*S KotlinDebug\n*F\n+ 1 TaskChainPage.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainPageKt$TaskChainLeftColumn$2$1\n*L\n83#1:113,6\n*E\n"}) static final class TaskChainPageKt$TaskChainLeftColumn$2$1 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1948648313, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainLeftColumn.<anonymous>.<anonymous> (TaskChainPage.kt:78)");  Map<Integer, TaskRecapModel> map1 = TaskChainPageKt.TaskChainLeftColumn$lambda$7(this.$taskMap$delegate); boolean bool = TaskChainPageKt.TaskChainLeftColumn$lambda$15$lambda$14(this.$isChainRunning$delegate); int i = TaskChainPageKt.TaskChainLeftColumn$lambda$9(this.$selectedIndex$delegate); PromptMode promptMode = (PromptMode)this.$model.getPromptMode().getValue(); $composer.startReplaceGroup(1699848779); Composer composer = $composer; boolean bool1 = false; MutableState<Integer> mutableState = this.$selectedIndex$delegate; int $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0; Map<Integer, TaskRecapModel> map2 = map1; ColumnScope columnScope = this.$this_Column; int $i$a$-cache-TaskChainPageKt$TaskChainLeftColumn$2$1$1 = 0; Function1 function11 = mutableState::invoke$lambda$1$lambda$0; Object value$iv = function11; composer.updateRememberedValue(value$iv); Function1<? super Integer, Unit> function1 = (it$iv == Composer.Companion.getEmpty()) ? (Function1)value$iv : (Function1)it$iv; $composer.endReplaceGroup(); ChainRecapKt.TaskRecap(columnScope, map2, function1, i, bool, promptMode, $composer, 384); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } private static final Unit invoke$lambda$1$lambda$0(MutableState $selectedIndex$delegate, int it) { TaskChainPageKt.TaskChainLeftColumn$lambda$10($selectedIndex$delegate, it); return Unit.INSTANCE; } TaskChainPageKt$TaskChainLeftColumn$2$1(TaskChainDetailsViewModel $model, ColumnScope $receiver, State<Map<Integer, TaskRecapModel>> $taskMap$delegate, State<Boolean> $isChainRunning$delegate, MutableState<Integer> $selectedIndex$delegate) {} } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void TaskChainRightColumn(@Nullable Modifier modifier, @NotNull TaskChainDetailsViewModel model, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'model'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc_w 687041226
/*     */     //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   15: astore_2
/*     */     //   16: iload_3
/*     */     //   17: istore #5
/*     */     //   19: iload #4
/*     */     //   21: iconst_1
/*     */     //   22: iand
/*     */     //   23: ifeq -> 36
/*     */     //   26: iload #5
/*     */     //   28: bipush #6
/*     */     //   30: ior
/*     */     //   31: istore #5
/*     */     //   33: goto -> 63
/*     */     //   36: iload_3
/*     */     //   37: bipush #6
/*     */     //   39: iand
/*     */     //   40: ifne -> 63
/*     */     //   43: iload #5
/*     */     //   45: aload_2
/*     */     //   46: aload_0
/*     */     //   47: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   52: ifeq -> 59
/*     */     //   55: iconst_4
/*     */     //   56: goto -> 60
/*     */     //   59: iconst_2
/*     */     //   60: ior
/*     */     //   61: istore #5
/*     */     //   63: iload #4
/*     */     //   65: iconst_2
/*     */     //   66: iand
/*     */     //   67: ifeq -> 80
/*     */     //   70: iload #5
/*     */     //   72: bipush #48
/*     */     //   74: ior
/*     */     //   75: istore #5
/*     */     //   77: goto -> 109
/*     */     //   80: iload_3
/*     */     //   81: bipush #48
/*     */     //   83: iand
/*     */     //   84: ifne -> 109
/*     */     //   87: iload #5
/*     */     //   89: aload_2
/*     */     //   90: aload_1
/*     */     //   91: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   96: ifeq -> 104
/*     */     //   99: bipush #32
/*     */     //   101: goto -> 106
/*     */     //   104: bipush #16
/*     */     //   106: ior
/*     */     //   107: istore #5
/*     */     //   109: iload #5
/*     */     //   111: bipush #19
/*     */     //   113: iand
/*     */     //   114: bipush #18
/*     */     //   116: if_icmpne -> 128
/*     */     //   119: aload_2
/*     */     //   120: invokeinterface getSkipping : ()Z
/*     */     //   125: ifne -> 1088
/*     */     //   128: iload #4
/*     */     //   130: iconst_1
/*     */     //   131: iand
/*     */     //   132: ifeq -> 142
/*     */     //   135: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   138: checkcast androidx/compose/ui/Modifier
/*     */     //   141: astore_0
/*     */     //   142: invokestatic isTraceInProgress : ()Z
/*     */     //   145: ifeq -> 160
/*     */     //   148: ldc_w 687041226
/*     */     //   151: iload #5
/*     */     //   153: iconst_m1
/*     */     //   154: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainRightColumn (TaskChainPage.kt:94)'
/*     */     //   157: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   160: aload_1
/*     */     //   161: invokevirtual getTaskHeader : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderViewModel;
/*     */     //   164: invokevirtual getUiState : ()Lkotlinx/coroutines/flow/StateFlow;
/*     */     //   167: aconst_null
/*     */     //   168: aload_2
/*     */     //   169: iconst_0
/*     */     //   170: iconst_1
/*     */     //   171: invokestatic collectAsState : (Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*     */     //   174: astore #6
/*     */     //   176: aload_2
/*     */     //   177: iconst_0
/*     */     //   178: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   181: invokevirtual getBackgroundColor-0d7_KjU : ()J
/*     */     //   184: lstore #7
/*     */     //   186: aload #6
/*     */     //   188: invokestatic TaskChainRightColumn$lambda$17 : (Landroidx/compose/runtime/State;)Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;
/*     */     //   191: dup
/*     */     //   192: ifnull -> 201
/*     */     //   195: invokevirtual getErrorMessage : ()Ljava/lang/String;
/*     */     //   198: goto -> 203
/*     */     //   201: pop
/*     */     //   202: aconst_null
/*     */     //   203: astore #9
/*     */     //   205: aload_1
/*     */     //   206: invokevirtual getUnifiedStepList : ()Lkotlinx/coroutines/flow/StateFlow;
/*     */     //   209: aconst_null
/*     */     //   210: aload_2
/*     */     //   211: iconst_0
/*     */     //   212: iconst_1
/*     */     //   213: invokestatic collectAsState : (Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*     */     //   216: astore #10
/*     */     //   218: aload_0
/*     */     //   219: lload #7
/*     */     //   221: aconst_null
/*     */     //   222: iconst_2
/*     */     //   223: aconst_null
/*     */     //   224: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   227: fconst_0
/*     */     //   228: iconst_1
/*     */     //   229: aconst_null
/*     */     //   230: invokestatic fillMaxSize$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   233: astore #11
/*     */     //   235: iconst_0
/*     */     //   236: istore #14
/*     */     //   238: iconst_0
/*     */     //   239: istore #15
/*     */     //   241: aload_2
/*     */     //   242: ldc -483455358
/*     */     //   244: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   246: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   249: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   252: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   255: astore #12
/*     */     //   257: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   260: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   263: astore #13
/*     */     //   265: aload #12
/*     */     //   267: aload #13
/*     */     //   269: aload_2
/*     */     //   270: bipush #14
/*     */     //   272: iload #14
/*     */     //   274: iconst_3
/*     */     //   275: ishr
/*     */     //   276: iand
/*     */     //   277: bipush #112
/*     */     //   279: iload #14
/*     */     //   281: iconst_3
/*     */     //   282: ishr
/*     */     //   283: iand
/*     */     //   284: ior
/*     */     //   285: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   288: astore #16
/*     */     //   290: bipush #112
/*     */     //   292: iload #14
/*     */     //   294: iconst_3
/*     */     //   295: ishl
/*     */     //   296: iand
/*     */     //   297: istore #17
/*     */     //   299: nop
/*     */     //   300: iconst_0
/*     */     //   301: istore #18
/*     */     //   303: aload_2
/*     */     //   304: ldc -1323940314
/*     */     //   306: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   308: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   311: aload_2
/*     */     //   312: iconst_0
/*     */     //   313: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   316: istore #19
/*     */     //   318: aload_2
/*     */     //   319: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   324: astore #20
/*     */     //   326: aload_2
/*     */     //   327: aload #11
/*     */     //   329: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   332: astore #21
/*     */     //   334: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   337: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   340: astore #22
/*     */     //   342: bipush #6
/*     */     //   344: sipush #896
/*     */     //   347: iload #17
/*     */     //   349: bipush #6
/*     */     //   351: ishl
/*     */     //   352: iand
/*     */     //   353: ior
/*     */     //   354: istore #23
/*     */     //   356: nop
/*     */     //   357: iconst_0
/*     */     //   358: istore #24
/*     */     //   360: aload_2
/*     */     //   361: ldc -692256719
/*     */     //   363: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   365: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   368: aload_2
/*     */     //   369: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   374: instanceof androidx/compose/runtime/Applier
/*     */     //   377: ifne -> 383
/*     */     //   380: invokestatic invalidApplier : ()V
/*     */     //   383: aload_2
/*     */     //   384: invokeinterface startReusableNode : ()V
/*     */     //   389: aload_2
/*     */     //   390: invokeinterface getInserting : ()Z
/*     */     //   395: ifeq -> 409
/*     */     //   398: aload_2
/*     */     //   399: aload #22
/*     */     //   401: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   406: goto -> 415
/*     */     //   409: aload_2
/*     */     //   410: invokeinterface useNode : ()V
/*     */     //   415: aload_2
/*     */     //   416: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   419: astore #25
/*     */     //   421: iconst_0
/*     */     //   422: istore #26
/*     */     //   424: aload #25
/*     */     //   426: aload #16
/*     */     //   428: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   431: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   434: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   437: aload #25
/*     */     //   439: aload #20
/*     */     //   441: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   444: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   447: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   450: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   453: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   456: astore #27
/*     */     //   458: iconst_0
/*     */     //   459: istore #28
/*     */     //   461: aload #25
/*     */     //   463: astore #29
/*     */     //   465: iconst_0
/*     */     //   466: istore #30
/*     */     //   468: aload #29
/*     */     //   470: invokeinterface getInserting : ()Z
/*     */     //   475: ifne -> 496
/*     */     //   478: aload #29
/*     */     //   480: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   485: iload #19
/*     */     //   487: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   490: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   493: ifne -> 522
/*     */     //   496: aload #29
/*     */     //   498: iload #19
/*     */     //   500: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   503: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   508: aload #25
/*     */     //   510: iload #19
/*     */     //   512: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   515: aload #27
/*     */     //   517: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   522: nop
/*     */     //   523: nop
/*     */     //   524: nop
/*     */     //   525: aload #25
/*     */     //   527: aload #21
/*     */     //   529: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   532: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   535: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   538: nop
/*     */     //   539: nop
/*     */     //   540: aload_2
/*     */     //   541: bipush #14
/*     */     //   543: iload #23
/*     */     //   545: bipush #6
/*     */     //   547: ishr
/*     */     //   548: iand
/*     */     //   549: istore #31
/*     */     //   551: astore #32
/*     */     //   553: iconst_0
/*     */     //   554: istore #33
/*     */     //   556: aload #32
/*     */     //   558: ldc -384784025
/*     */     //   560: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   563: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   566: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   569: aload #32
/*     */     //   571: bipush #6
/*     */     //   573: bipush #112
/*     */     //   575: iload #14
/*     */     //   577: bipush #6
/*     */     //   579: ishr
/*     */     //   580: iand
/*     */     //   581: ior
/*     */     //   582: istore #34
/*     */     //   584: astore #35
/*     */     //   586: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   589: astore #36
/*     */     //   591: iconst_0
/*     */     //   592: istore #37
/*     */     //   594: aload #36
/*     */     //   596: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   599: checkcast androidx/compose/ui/Modifier
/*     */     //   602: fconst_1
/*     */     //   603: iconst_0
/*     */     //   604: iconst_2
/*     */     //   605: aconst_null
/*     */     //   606: invokestatic weight$default : (Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   609: astore #38
/*     */     //   611: iconst_0
/*     */     //   612: istore #39
/*     */     //   614: iconst_0
/*     */     //   615: istore #40
/*     */     //   617: aload #35
/*     */     //   619: ldc -483455358
/*     */     //   621: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   623: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   626: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   629: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   632: astore #41
/*     */     //   634: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   637: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   640: astore #42
/*     */     //   642: aload #41
/*     */     //   644: aload #42
/*     */     //   646: aload #35
/*     */     //   648: bipush #14
/*     */     //   650: iload #39
/*     */     //   652: iconst_3
/*     */     //   653: ishr
/*     */     //   654: iand
/*     */     //   655: bipush #112
/*     */     //   657: iload #39
/*     */     //   659: iconst_3
/*     */     //   660: ishr
/*     */     //   661: iand
/*     */     //   662: ior
/*     */     //   663: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   666: astore #43
/*     */     //   668: bipush #112
/*     */     //   670: iload #39
/*     */     //   672: iconst_3
/*     */     //   673: ishl
/*     */     //   674: iand
/*     */     //   675: istore #44
/*     */     //   677: nop
/*     */     //   678: iconst_0
/*     */     //   679: istore #45
/*     */     //   681: aload #35
/*     */     //   683: ldc -1323940314
/*     */     //   685: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   687: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   690: aload #35
/*     */     //   692: iconst_0
/*     */     //   693: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   696: istore #46
/*     */     //   698: aload #35
/*     */     //   700: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   705: astore #47
/*     */     //   707: aload #35
/*     */     //   709: aload #38
/*     */     //   711: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   714: astore #48
/*     */     //   716: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   719: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   722: astore #49
/*     */     //   724: bipush #6
/*     */     //   726: sipush #896
/*     */     //   729: iload #44
/*     */     //   731: bipush #6
/*     */     //   733: ishl
/*     */     //   734: iand
/*     */     //   735: ior
/*     */     //   736: istore #50
/*     */     //   738: nop
/*     */     //   739: iconst_0
/*     */     //   740: istore #51
/*     */     //   742: aload #35
/*     */     //   744: ldc -692256719
/*     */     //   746: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   748: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   751: aload #35
/*     */     //   753: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   758: instanceof androidx/compose/runtime/Applier
/*     */     //   761: ifne -> 767
/*     */     //   764: invokestatic invalidApplier : ()V
/*     */     //   767: aload #35
/*     */     //   769: invokeinterface startReusableNode : ()V
/*     */     //   774: aload #35
/*     */     //   776: invokeinterface getInserting : ()Z
/*     */     //   781: ifeq -> 796
/*     */     //   784: aload #35
/*     */     //   786: aload #49
/*     */     //   788: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   793: goto -> 803
/*     */     //   796: aload #35
/*     */     //   798: invokeinterface useNode : ()V
/*     */     //   803: aload #35
/*     */     //   805: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   808: astore #52
/*     */     //   810: iconst_0
/*     */     //   811: istore #53
/*     */     //   813: aload #52
/*     */     //   815: aload #43
/*     */     //   817: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   820: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   823: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   826: aload #52
/*     */     //   828: aload #47
/*     */     //   830: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   833: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   836: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   839: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   842: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   845: astore #54
/*     */     //   847: iconst_0
/*     */     //   848: istore #55
/*     */     //   850: aload #52
/*     */     //   852: astore #56
/*     */     //   854: iconst_0
/*     */     //   855: istore #57
/*     */     //   857: aload #56
/*     */     //   859: invokeinterface getInserting : ()Z
/*     */     //   864: ifne -> 885
/*     */     //   867: aload #56
/*     */     //   869: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   874: iload #46
/*     */     //   876: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   879: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   882: ifne -> 911
/*     */     //   885: aload #56
/*     */     //   887: iload #46
/*     */     //   889: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   892: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   897: aload #52
/*     */     //   899: iload #46
/*     */     //   901: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   904: aload #54
/*     */     //   906: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   911: nop
/*     */     //   912: nop
/*     */     //   913: nop
/*     */     //   914: aload #52
/*     */     //   916: aload #48
/*     */     //   918: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   921: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   924: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   927: nop
/*     */     //   928: nop
/*     */     //   929: aload #35
/*     */     //   931: bipush #14
/*     */     //   933: iload #50
/*     */     //   935: bipush #6
/*     */     //   937: ishr
/*     */     //   938: iand
/*     */     //   939: istore #58
/*     */     //   941: astore #59
/*     */     //   943: iconst_0
/*     */     //   944: istore #60
/*     */     //   946: aload #59
/*     */     //   948: ldc -384784025
/*     */     //   950: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   953: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   956: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   959: aload #59
/*     */     //   961: bipush #6
/*     */     //   963: bipush #112
/*     */     //   965: iload #39
/*     */     //   967: bipush #6
/*     */     //   969: ishr
/*     */     //   970: iand
/*     */     //   971: ior
/*     */     //   972: istore #61
/*     */     //   974: astore #62
/*     */     //   976: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   979: astore #63
/*     */     //   981: iconst_0
/*     */     //   982: istore #64
/*     */     //   984: aload_1
/*     */     //   985: aload #10
/*     */     //   987: invokestatic TaskChainRightColumn$lambda$18 : (Landroidx/compose/runtime/State;)Ljava/util/List;
/*     */     //   990: iconst_0
/*     */     //   991: aload #62
/*     */     //   993: sipush #384
/*     */     //   996: bipush #14
/*     */     //   998: iload #5
/*     */     //   1000: iconst_3
/*     */     //   1001: ishr
/*     */     //   1002: iand
/*     */     //   1003: ior
/*     */     //   1004: iconst_0
/*     */     //   1005: invokestatic TaskSteps : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;Ljava/util/List;ZLandroidx/compose/runtime/Composer;II)V
/*     */     //   1008: nop
/*     */     //   1009: aload #59
/*     */     //   1011: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1014: aload #35
/*     */     //   1016: invokeinterface endNode : ()V
/*     */     //   1021: aload #35
/*     */     //   1023: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1026: nop
/*     */     //   1027: aload #35
/*     */     //   1029: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1032: nop
/*     */     //   1033: aload #35
/*     */     //   1035: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1038: nop
/*     */     //   1039: aconst_null
/*     */     //   1040: aload #9
/*     */     //   1042: aload #35
/*     */     //   1044: iconst_0
/*     */     //   1045: iconst_1
/*     */     //   1046: invokestatic TaskError : (Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1049: nop
/*     */     //   1050: aload #32
/*     */     //   1052: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1055: aload_2
/*     */     //   1056: invokeinterface endNode : ()V
/*     */     //   1061: aload_2
/*     */     //   1062: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1065: nop
/*     */     //   1066: aload_2
/*     */     //   1067: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1070: nop
/*     */     //   1071: aload_2
/*     */     //   1072: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1075: nop
/*     */     //   1076: invokestatic isTraceInProgress : ()Z
/*     */     //   1079: ifeq -> 1094
/*     */     //   1082: invokestatic traceEventEnd : ()V
/*     */     //   1085: goto -> 1094
/*     */     //   1088: aload_2
/*     */     //   1089: invokeinterface skipToGroupEnd : ()V
/*     */     //   1094: aload_2
/*     */     //   1095: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1100: dup
/*     */     //   1101: ifnull -> 1122
/*     */     //   1104: aload_0
/*     */     //   1105: aload_1
/*     */     //   1106: iload_3
/*     */     //   1107: iload #4
/*     */     //   1109: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;II)Lkotlin/jvm/functions/Function2;
/*     */     //   1114: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1119: goto -> 1123
/*     */     //   1122: pop
/*     */     //   1123: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #95	-> 6
/*     */     //   #93	-> 135
/*     */     //   #95	-> 157
/*     */     //   #96	-> 160
/*     */     //   #97	-> 178
/*     */     //   #98	-> 186
/*     */     //   #99	-> 205
/*     */     //   #101	-> 218
/*     */     //   #255	-> 246
/*     */     //   #256	-> 249
/*     */     //   #257	-> 257
/*     */     //   #260	-> 265
/*     */     //   #261	-> 299
/*     */     //   #262	-> 308
/*     */     //   #263	-> 313
/*     */     //   #264	-> 319
/*     */     //   #265	-> 327
/*     */     //   #267	-> 334
/*     */     //   #266	-> 356
/*     */     //   #268	-> 365
/*     */     //   #269	-> 368
/*     */     //   #270	-> 384
/*     */     //   #271	-> 389
/*     */     //   #272	-> 399
/*     */     //   #274	-> 410
/*     */     //   #276	-> 415
/*     */     //   #277	-> 424
/*     */     //   #278	-> 437
/*     */     //   #280	-> 450
/*     */     //   #281	-> 461
/*     */     //   #282	-> 468
/*     */     //   #283	-> 496
/*     */     //   #284	-> 508
/*     */     //   #286	-> 522
/*     */     //   #281	-> 523
/*     */     //   #286	-> 524
/*     */     //   #287	-> 525
/*     */     //   #288	-> 538
/*     */     //   #276	-> 539
/*     */     //   #289	-> 540
/*     */     //   #290	-> 563
/*     */     //   #102	-> 594
/*     */     //   #291	-> 623
/*     */     //   #292	-> 626
/*     */     //   #293	-> 634
/*     */     //   #296	-> 642
/*     */     //   #297	-> 677
/*     */     //   #298	-> 687
/*     */     //   #299	-> 693
/*     */     //   #300	-> 700
/*     */     //   #301	-> 709
/*     */     //   #303	-> 716
/*     */     //   #302	-> 738
/*     */     //   #304	-> 748
/*     */     //   #305	-> 751
/*     */     //   #306	-> 769
/*     */     //   #307	-> 774
/*     */     //   #308	-> 786
/*     */     //   #310	-> 798
/*     */     //   #312	-> 803
/*     */     //   #313	-> 813
/*     */     //   #314	-> 826
/*     */     //   #316	-> 839
/*     */     //   #317	-> 850
/*     */     //   #318	-> 857
/*     */     //   #319	-> 885
/*     */     //   #320	-> 897
/*     */     //   #322	-> 911
/*     */     //   #317	-> 912
/*     */     //   #322	-> 913
/*     */     //   #323	-> 914
/*     */     //   #324	-> 927
/*     */     //   #312	-> 928
/*     */     //   #325	-> 929
/*     */     //   #326	-> 953
/*     */     //   #104	-> 984
/*     */     //   #105	-> 985
/*     */     //   #106	-> 990
/*     */     //   #103	-> 1005
/*     */     //   #108	-> 1008
/*     */     //   #326	-> 1009
/*     */     //   #325	-> 1014
/*     */     //   #327	-> 1016
/*     */     //   #304	-> 1023
/*     */     //   #328	-> 1026
/*     */     //   #298	-> 1029
/*     */     //   #329	-> 1032
/*     */     //   #291	-> 1035
/*     */     //   #330	-> 1038
/*     */     //   #109	-> 1040
/*     */     //   #110	-> 1049
/*     */     //   #290	-> 1050
/*     */     //   #289	-> 1055
/*     */     //   #331	-> 1056
/*     */     //   #268	-> 1062
/*     */     //   #332	-> 1065
/*     */     //   #262	-> 1067
/*     */     //   #333	-> 1070
/*     */     //   #255	-> 1072
/*     */     //   #334	-> 1075
/*     */     //   #111	-> 1088
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   984	25	64	$i$a$-Column-TaskChainPageKt$TaskChainRightColumn$1$1	I
/*     */     //   981	28	63	$this$TaskChainRightColumn_u24lambda_u2420_u24lambda_u2419	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   981	28	62	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   981	28	61	$changed	I
/*     */     //   946	68	60	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   943	71	59	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   943	71	58	$changed$iv	I
/*     */     //   857	55	57	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   854	58	56	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   850	64	55	$i$f$set-impl	I
/*     */     //   847	67	54	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   813	115	53	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   810	118	52	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   742	285	51	$i$f$ReusableComposeNode	I
/*     */     //   739	288	49	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   739	288	50	$changed$iv$iv$iv	I
/*     */     //   681	352	45	$i$f$Layout	I
/*     */     //   698	335	46	compositeKeyHash$iv$iv	I
/*     */     //   707	326	47	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   716	317	48	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   678	355	44	$changed$iv$iv	I
/*     */     //   617	422	40	$i$f$Column	I
/*     */     //   668	371	43	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   614	425	38	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   634	405	41	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   642	397	42	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   614	425	39	$changed$iv	I
/*     */     //   594	456	37	$i$a$-Column-TaskChainPageKt$TaskChainRightColumn$1	I
/*     */     //   591	459	36	$this$TaskChainRightColumn_u24lambda_u2420	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   591	459	35	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   591	459	34	$changed	I
/*     */     //   556	499	33	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   553	502	32	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   553	502	31	$changed$iv	I
/*     */     //   468	55	30	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   465	58	29	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   461	64	28	$i$f$set-impl	I
/*     */     //   458	67	27	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   424	115	26	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   421	118	25	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   360	706	24	$i$f$ReusableComposeNode	I
/*     */     //   357	709	22	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   357	709	23	$changed$iv$iv$iv	I
/*     */     //   303	768	18	$i$f$Layout	I
/*     */     //   318	753	19	compositeKeyHash$iv$iv	I
/*     */     //   326	745	20	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   334	737	21	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   300	771	17	$changed$iv$iv	I
/*     */     //   241	835	15	$i$f$Column	I
/*     */     //   290	786	16	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   238	838	11	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   257	819	12	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   265	811	13	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   238	838	14	$changed$iv	I
/*     */     //   176	909	6	state$delegate	Landroidx/compose/runtime/State;
/*     */     //   186	899	7	background	J
/*     */     //   205	880	9	errorMessage	Ljava/lang/String;
/*     */     //   218	867	10	unifiedStepList$delegate	Landroidx/compose/runtime/State;
/*     */     //   19	1105	5	$dirty	I
/*     */     //   0	1124	0	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1124	1	model	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;
/*     */     //   0	1124	2	$composer	Landroidx/compose/runtime/Composer;
/* 345 */     //   0	1124	3	$changed	I } private static final List<TaskStep> TaskChainRightColumn$lambda$18(State $unifiedStepList$delegate) { State state = $unifiedStepList$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (List<TaskStep>)state.getValue(); }
/*     */ 
/*     */   
/*     */   private static final Unit TaskChainPageSingleColumn$lambda$5(TaskChainDetailsViewModel $model, boolean $sendPromptEnabled, int $$changed, Composer $composer, int $force) {
/*     */     TaskChainPageSingleColumn($model, $sendPromptEnabled, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit TaskChainLeftColumn$lambda$16(TaskChainDetailsViewModel $model, int $$changed, Composer $composer, int $force) {
/*     */     TaskChainLeftColumn($model, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit TaskChainRightColumn$lambda$21(Modifier $modifier, TaskChainDetailsViewModel $model, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     TaskChainRightColumn($modifier, $model, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\TaskChainPageKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */