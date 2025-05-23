/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.create;
/*     */ 
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer.TaskExplorerTabs;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer.Tip;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.PromptMode;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.reflect.KFunction;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000D\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\020\016\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\032\035\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\007¢\006\002\020\006\0327\020\007\032\0020\0012\006\020\002\032\0020\0032\f\020\b\032\b\022\004\022\0020\n0\t2\022\020\013\032\016\022\004\022\0020\r\022\004\022\0020\0010\fH\007¢\006\002\020\016\032\035\020\017\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\007¢\006\002\020\006\032O\020\020\032\0020\0012\f\020\021\032\b\022\004\022\0020\0220\t2\006\020\002\032\0020\0032\f\020\b\032\b\022\004\022\0020\n0\t2\022\020\013\032\016\022\004\022\0020\r\022\004\022\0020\0010\f2\006\020\023\032\0020\024H\003¢\006\004\b\025\020\026¨\006\027²\006\f\020\030\032\004\030\0010\031X\002²\006\n\020\032\032\0020\033X\002²\006\f\020\030\032\004\030\0010\031X\002²\006\020\020\b\032\b\022\004\022\0020\n0\tX\002²\006\n\020\032\032\0020\033X\002"}, d2 = {"NewTaskPageLeftColumn", "", "model", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;", "sendPromptEnabled", "", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;ZLandroidx/compose/runtime/Composer;I)V", "NewTaskRightColumn", "tips", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/Tip;", "onTipClick", "Lkotlin/Function1;", "", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "NewTaskPageSingleColumn", "ShowTaskExplorer", "recentTasksList", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/SortedRecentTaskChain;", "insetHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "ShowTaskExplorer-3xixttE", "(Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;Ljava/util/List;Lkotlin/jvm/functions/Function1;FLandroidx/compose/runtime/Composer;I)V", "ej-ui", "errorState", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;", "taskHistory", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/RecentTaskLoadState;"})
/*     */ @SourceDebugExtension({"SMAP\nNewTaskPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewTaskPage.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskPageKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,164:1\n149#2:165\n149#2:166\n149#2:202\n149#2:216\n149#2:221\n149#2:261\n86#3:167\n84#3,5:168\n89#3:201\n93#3:220\n79#4,6:173\n86#4,4:188\n90#4,2:198\n94#4:219\n79#4,6:228\n86#4,4:243\n90#4,2:253\n94#4:259\n368#5,9:179\n377#5:200\n378#5,2:217\n368#5,9:234\n377#5:255\n378#5,2:257\n4034#6,6:192\n4034#6,6:247\n1225#7,6:203\n1225#7,6:209\n1225#7,6:262\n1#8:215\n71#9:222\n69#9,5:223\n74#9:256\n78#9:260\n81#10:268\n81#10:269\n81#10:270\n*S KotlinDebug\n*F\n+ 1 NewTaskPage.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskPageKt\n*L\n38#1:165\n39#1:166\n41#1:202\n54#1:216\n67#1:221\n76#1:261\n35#1:167\n35#1:168,5\n35#1:201\n35#1:220\n35#1:173,6\n35#1:188,4\n35#1:198,2\n35#1:219\n66#1:228,6\n66#1:243,4\n66#1:253,2\n66#1:259\n35#1:179,9\n35#1:200\n35#1:217,2\n66#1:234,9\n66#1:255\n66#1:257,2\n35#1:192,6\n66#1:247,6\n45#1:203,6\n52#1:209,6\n161#1:262,6\n66#1:222\n66#1:223,5\n66#1:256\n66#1:260\n34#1:268\n64#1:269\n87#1:270\n*E\n"})
/*     */ public final class NewTaskPageKt {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void NewTaskPageLeftColumn(@NotNull NewTaskViewModelImpl model, boolean sendPromptEnabled, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'model'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 1806527923
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
/*     */     //   90: ifne -> 986
/*     */     //   93: invokestatic isTraceInProgress : ()Z
/*     */     //   96: ifeq -> 109
/*     */     //   99: ldc 1806527923
/*     */     //   101: iload #4
/*     */     //   103: iconst_m1
/*     */     //   104: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.NewTaskPageLeftColumn (NewTaskPage.kt:32)'
/*     */     //   106: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   109: aload_0
/*     */     //   110: invokevirtual getErrorFlow : ()Lkotlinx/coroutines/flow/StateFlow;
/*     */     //   113: aconst_null
/*     */     //   114: aload_2
/*     */     //   115: iconst_0
/*     */     //   116: iconst_1
/*     */     //   117: invokestatic collectAsState : (Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*     */     //   120: astore #5
/*     */     //   122: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   125: checkcast androidx/compose/ui/Modifier
/*     */     //   128: aload_2
/*     */     //   129: iconst_0
/*     */     //   130: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   133: invokevirtual getBackgroundColor-0d7_KjU : ()J
/*     */     //   136: aconst_null
/*     */     //   137: iconst_2
/*     */     //   138: aconst_null
/*     */     //   139: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   142: bipush #12
/*     */     //   144: istore #6
/*     */     //   146: iconst_0
/*     */     //   147: istore #7
/*     */     //   149: iload #6
/*     */     //   151: i2f
/*     */     //   152: invokestatic constructor-impl : (F)F
/*     */     //   155: invokestatic padding-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   158: astore #6
/*     */     //   160: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   163: bipush #12
/*     */     //   165: istore #7
/*     */     //   167: iconst_0
/*     */     //   168: istore #8
/*     */     //   170: iload #7
/*     */     //   172: i2f
/*     */     //   173: invokestatic constructor-impl : (F)F
/*     */     //   176: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   179: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
/*     */     //   182: astore #7
/*     */     //   184: bipush #48
/*     */     //   186: istore #9
/*     */     //   188: nop
/*     */     //   189: iconst_0
/*     */     //   190: istore #10
/*     */     //   192: aload_2
/*     */     //   193: ldc -483455358
/*     */     //   195: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   197: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   200: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   203: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   206: astore #8
/*     */     //   208: aload #7
/*     */     //   210: aload #8
/*     */     //   212: aload_2
/*     */     //   213: bipush #14
/*     */     //   215: iload #9
/*     */     //   217: iconst_3
/*     */     //   218: ishr
/*     */     //   219: iand
/*     */     //   220: bipush #112
/*     */     //   222: iload #9
/*     */     //   224: iconst_3
/*     */     //   225: ishr
/*     */     //   226: iand
/*     */     //   227: ior
/*     */     //   228: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   231: astore #11
/*     */     //   233: bipush #112
/*     */     //   235: iload #9
/*     */     //   237: iconst_3
/*     */     //   238: ishl
/*     */     //   239: iand
/*     */     //   240: istore #12
/*     */     //   242: nop
/*     */     //   243: iconst_0
/*     */     //   244: istore #13
/*     */     //   246: aload_2
/*     */     //   247: ldc -1323940314
/*     */     //   249: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   251: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   254: aload_2
/*     */     //   255: iconst_0
/*     */     //   256: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   259: istore #14
/*     */     //   261: aload_2
/*     */     //   262: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   267: astore #15
/*     */     //   269: aload_2
/*     */     //   270: aload #6
/*     */     //   272: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   275: astore #16
/*     */     //   277: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   280: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   283: astore #17
/*     */     //   285: bipush #6
/*     */     //   287: sipush #896
/*     */     //   290: iload #12
/*     */     //   292: bipush #6
/*     */     //   294: ishl
/*     */     //   295: iand
/*     */     //   296: ior
/*     */     //   297: istore #18
/*     */     //   299: nop
/*     */     //   300: iconst_0
/*     */     //   301: istore #19
/*     */     //   303: aload_2
/*     */     //   304: ldc -692256719
/*     */     //   306: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   308: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   311: aload_2
/*     */     //   312: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   317: instanceof androidx/compose/runtime/Applier
/*     */     //   320: ifne -> 326
/*     */     //   323: invokestatic invalidApplier : ()V
/*     */     //   326: aload_2
/*     */     //   327: invokeinterface startReusableNode : ()V
/*     */     //   332: aload_2
/*     */     //   333: invokeinterface getInserting : ()Z
/*     */     //   338: ifeq -> 352
/*     */     //   341: aload_2
/*     */     //   342: aload #17
/*     */     //   344: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   349: goto -> 358
/*     */     //   352: aload_2
/*     */     //   353: invokeinterface useNode : ()V
/*     */     //   358: aload_2
/*     */     //   359: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   362: astore #20
/*     */     //   364: iconst_0
/*     */     //   365: istore #21
/*     */     //   367: aload #20
/*     */     //   369: aload #11
/*     */     //   371: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   374: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   377: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   380: aload #20
/*     */     //   382: aload #15
/*     */     //   384: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   387: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   390: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   393: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   396: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   399: astore #22
/*     */     //   401: iconst_0
/*     */     //   402: istore #23
/*     */     //   404: aload #20
/*     */     //   406: astore #24
/*     */     //   408: iconst_0
/*     */     //   409: istore #25
/*     */     //   411: aload #24
/*     */     //   413: invokeinterface getInserting : ()Z
/*     */     //   418: ifne -> 439
/*     */     //   421: aload #24
/*     */     //   423: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   428: iload #14
/*     */     //   430: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   433: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   436: ifne -> 465
/*     */     //   439: aload #24
/*     */     //   441: iload #14
/*     */     //   443: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   446: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   451: aload #20
/*     */     //   453: iload #14
/*     */     //   455: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   458: aload #22
/*     */     //   460: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   465: nop
/*     */     //   466: nop
/*     */     //   467: nop
/*     */     //   468: aload #20
/*     */     //   470: aload #16
/*     */     //   472: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   475: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   478: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   481: nop
/*     */     //   482: nop
/*     */     //   483: aload_2
/*     */     //   484: bipush #14
/*     */     //   486: iload #18
/*     */     //   488: bipush #6
/*     */     //   490: ishr
/*     */     //   491: iand
/*     */     //   492: istore #26
/*     */     //   494: astore #27
/*     */     //   496: iconst_0
/*     */     //   497: istore #28
/*     */     //   499: aload #27
/*     */     //   501: ldc -384784025
/*     */     //   503: ldc 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   505: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   508: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   511: aload #27
/*     */     //   513: bipush #6
/*     */     //   515: bipush #112
/*     */     //   517: iload #9
/*     */     //   519: bipush #6
/*     */     //   521: ishr
/*     */     //   522: iand
/*     */     //   523: ior
/*     */     //   524: istore #29
/*     */     //   526: astore #30
/*     */     //   528: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   531: astore #31
/*     */     //   533: iconst_0
/*     */     //   534: istore #32
/*     */     //   536: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   539: checkcast androidx/compose/ui/Modifier
/*     */     //   542: bipush #16
/*     */     //   544: istore #33
/*     */     //   546: iconst_0
/*     */     //   547: istore #34
/*     */     //   549: iload #33
/*     */     //   551: i2f
/*     */     //   552: invokestatic constructor-impl : (F)F
/*     */     //   555: fconst_0
/*     */     //   556: fconst_0
/*     */     //   557: fconst_0
/*     */     //   558: bipush #14
/*     */     //   560: aconst_null
/*     */     //   561: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   564: aconst_null
/*     */     //   565: aload #30
/*     */     //   567: iconst_0
/*     */     //   568: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   571: aload #30
/*     */     //   573: getstatic com/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData.$stable : I
/*     */     //   576: invokevirtual getInactiveTextColor : (Landroidx/compose/runtime/Composer;I)J
/*     */     //   579: aload #30
/*     */     //   581: bipush #6
/*     */     //   583: iconst_2
/*     */     //   584: invokestatic JunieLogo-FNF3uiM : (Landroidx/compose/ui/Modifier;Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)V
/*     */     //   587: aconst_null
/*     */     //   588: iload_1
/*     */     //   589: aload_0
/*     */     //   590: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel
/*     */     //   593: aload #30
/*     */     //   595: ldc_w 717529465
/*     */     //   598: invokeinterface startReplaceGroup : (I)V
/*     */     //   603: aload #30
/*     */     //   605: astore #34
/*     */     //   607: iload #4
/*     */     //   609: bipush #112
/*     */     //   611: iand
/*     */     //   612: bipush #32
/*     */     //   614: if_icmpne -> 621
/*     */     //   617: iconst_1
/*     */     //   618: goto -> 622
/*     */     //   621: iconst_0
/*     */     //   622: istore #35
/*     */     //   624: nop
/*     */     //   625: iconst_0
/*     */     //   626: istore #36
/*     */     //   628: aload #34
/*     */     //   630: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   635: astore #37
/*     */     //   637: iconst_0
/*     */     //   638: istore #38
/*     */     //   640: iload #35
/*     */     //   642: ifne -> 656
/*     */     //   645: aload #37
/*     */     //   647: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   650: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   653: if_acmpne -> 697
/*     */     //   656: astore #39
/*     */     //   658: istore #40
/*     */     //   660: astore #41
/*     */     //   662: iconst_0
/*     */     //   663: istore #42
/*     */     //   665: iload_1
/*     */     //   666: <illegal opcode> invoke : (Z)Lkotlin/jvm/functions/Function1;
/*     */     //   671: astore #43
/*     */     //   673: aload #41
/*     */     //   675: iload #40
/*     */     //   677: aload #39
/*     */     //   679: aload #43
/*     */     //   681: astore #44
/*     */     //   683: aload #34
/*     */     //   685: aload #44
/*     */     //   687: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   692: aload #44
/*     */     //   694: goto -> 699
/*     */     //   697: aload #37
/*     */     //   699: nop
/*     */     //   700: nop
/*     */     //   701: nop
/*     */     //   702: checkcast kotlin/jvm/functions/Function1
/*     */     //   705: astore #33
/*     */     //   707: aload #30
/*     */     //   709: invokeinterface endReplaceGroup : ()V
/*     */     //   714: aload #33
/*     */     //   716: aload_0
/*     */     //   717: invokevirtual getPromptMode : ()Landroidx/compose/runtime/MutableState;
/*     */     //   720: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   725: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode
/*     */     //   728: aload #30
/*     */     //   730: ldc_w 717541138
/*     */     //   733: invokeinterface startReplaceGroup : (I)V
/*     */     //   738: aload #30
/*     */     //   740: astore #34
/*     */     //   742: aload_2
/*     */     //   743: aload_0
/*     */     //   744: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   749: istore #35
/*     */     //   751: nop
/*     */     //   752: iconst_0
/*     */     //   753: istore #36
/*     */     //   755: aload #34
/*     */     //   757: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   762: astore #37
/*     */     //   764: iconst_0
/*     */     //   765: istore #38
/*     */     //   767: iload #35
/*     */     //   769: ifne -> 783
/*     */     //   772: aload #37
/*     */     //   774: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   777: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   780: if_acmpne -> 832
/*     */     //   783: astore #45
/*     */     //   785: astore #43
/*     */     //   787: astore #39
/*     */     //   789: istore #40
/*     */     //   791: astore #41
/*     */     //   793: iconst_0
/*     */     //   794: istore #42
/*     */     //   796: aload_0
/*     */     //   797: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;)Lkotlin/jvm/functions/Function1;
/*     */     //   802: astore #46
/*     */     //   804: aload #41
/*     */     //   806: iload #40
/*     */     //   808: aload #39
/*     */     //   810: aload #43
/*     */     //   812: aload #45
/*     */     //   814: aload #46
/*     */     //   816: astore #44
/*     */     //   818: aload #34
/*     */     //   820: aload #44
/*     */     //   822: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   827: aload #44
/*     */     //   829: goto -> 834
/*     */     //   832: aload #37
/*     */     //   834: nop
/*     */     //   835: nop
/*     */     //   836: nop
/*     */     //   837: checkcast kotlin/jvm/functions/Function1
/*     */     //   840: astore #33
/*     */     //   842: aload #30
/*     */     //   844: invokeinterface endReplaceGroup : ()V
/*     */     //   849: aload #33
/*     */     //   851: aload #30
/*     */     //   853: bipush #112
/*     */     //   855: iload #4
/*     */     //   857: iand
/*     */     //   858: sipush #896
/*     */     //   861: iload #4
/*     */     //   863: bipush #6
/*     */     //   865: ishl
/*     */     //   866: iand
/*     */     //   867: ior
/*     */     //   868: iconst_1
/*     */     //   869: invokestatic PromptArea : (Landroidx/compose/ui/Modifier;ZLcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel;Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
/*     */     //   872: aload #5
/*     */     //   874: invokestatic NewTaskPageLeftColumn$lambda$0 : (Landroidx/compose/runtime/State;)Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;
/*     */     //   877: astore #33
/*     */     //   879: aload #30
/*     */     //   881: ldc_w 717542920
/*     */     //   884: invokeinterface startReplaceGroup : (I)V
/*     */     //   889: aload #33
/*     */     //   891: dup
/*     */     //   892: ifnonnull -> 899
/*     */     //   895: pop
/*     */     //   896: goto -> 940
/*     */     //   899: astore #36
/*     */     //   901: iconst_0
/*     */     //   902: istore #37
/*     */     //   904: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   907: checkcast androidx/compose/ui/Modifier
/*     */     //   910: fconst_0
/*     */     //   911: bipush #12
/*     */     //   913: istore #38
/*     */     //   915: iconst_0
/*     */     //   916: istore #42
/*     */     //   918: iload #38
/*     */     //   920: i2f
/*     */     //   921: invokestatic constructor-impl : (F)F
/*     */     //   924: iconst_1
/*     */     //   925: aconst_null
/*     */     //   926: invokestatic padding-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   929: aload #36
/*     */     //   931: aload #30
/*     */     //   933: bipush #6
/*     */     //   935: iconst_0
/*     */     //   936: invokestatic ErrorComponent : (Landroidx/compose/ui/Modifier;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;Landroidx/compose/runtime/Composer;II)V
/*     */     //   939: nop
/*     */     //   940: aload #30
/*     */     //   942: invokeinterface endReplaceGroup : ()V
/*     */     //   947: nop
/*     */     //   948: aload #27
/*     */     //   950: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   953: aload_2
/*     */     //   954: invokeinterface endNode : ()V
/*     */     //   959: aload_2
/*     */     //   960: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   963: nop
/*     */     //   964: aload_2
/*     */     //   965: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   968: nop
/*     */     //   969: aload_2
/*     */     //   970: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   973: nop
/*     */     //   974: invokestatic isTraceInProgress : ()Z
/*     */     //   977: ifeq -> 992
/*     */     //   980: invokestatic traceEventEnd : ()V
/*     */     //   983: goto -> 992
/*     */     //   986: aload_2
/*     */     //   987: invokeinterface skipToGroupEnd : ()V
/*     */     //   992: aload_2
/*     */     //   993: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   998: dup
/*     */     //   999: ifnull -> 1018
/*     */     //   1002: aload_0
/*     */     //   1003: iload_1
/*     */     //   1004: iload_3
/*     */     //   1005: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;ZI)Lkotlin/jvm/functions/Function2;
/*     */     //   1010: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1015: goto -> 1019
/*     */     //   1018: pop
/*     */     //   1019: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #33	-> 6
/*     */     //   #34	-> 109
/*     */     //   #36	-> 122
/*     */     //   #37	-> 130
/*     */     //   #38	-> 142
/*     */     //   #165	-> 149
/*     */     //   #38	-> 155
/*     */     //   #39	-> 160
/*     */     //   #166	-> 170
/*     */     //   #39	-> 176
/*     */     //   #35	-> 188
/*     */     //   #167	-> 197
/*     */     //   #168	-> 200
/*     */     //   #171	-> 208
/*     */     //   #172	-> 242
/*     */     //   #173	-> 251
/*     */     //   #174	-> 256
/*     */     //   #175	-> 262
/*     */     //   #176	-> 270
/*     */     //   #178	-> 277
/*     */     //   #177	-> 299
/*     */     //   #179	-> 308
/*     */     //   #180	-> 311
/*     */     //   #181	-> 327
/*     */     //   #182	-> 332
/*     */     //   #183	-> 342
/*     */     //   #185	-> 353
/*     */     //   #187	-> 358
/*     */     //   #188	-> 367
/*     */     //   #189	-> 380
/*     */     //   #191	-> 393
/*     */     //   #192	-> 404
/*     */     //   #193	-> 411
/*     */     //   #194	-> 439
/*     */     //   #195	-> 451
/*     */     //   #197	-> 465
/*     */     //   #192	-> 466
/*     */     //   #197	-> 467
/*     */     //   #198	-> 468
/*     */     //   #199	-> 481
/*     */     //   #187	-> 482
/*     */     //   #200	-> 483
/*     */     //   #201	-> 505
/*     */     //   #41	-> 536
/*     */     //   #202	-> 549
/*     */     //   #41	-> 555
/*     */     //   #43	-> 588
/*     */     //   #44	-> 589
/*     */     //   #45	-> 624
/*     */     //   #203	-> 628
/*     */     //   #204	-> 640
/*     */     //   #205	-> 656
/*     */     //   #45	-> 665
/*     */     //   #205	-> 681
/*     */     //   #206	-> 683
/*     */     //   #207	-> 692
/*     */     //   #208	-> 697
/*     */     //   #204	-> 699
/*     */     //   #203	-> 700
/*     */     //   #203	-> 701
/*     */     //   #45	-> 702
/*     */     //   #51	-> 716
/*     */     //   #52	-> 751
/*     */     //   #209	-> 755
/*     */     //   #210	-> 767
/*     */     //   #211	-> 783
/*     */     //   #52	-> 796
/*     */     //   #211	-> 816
/*     */     //   #212	-> 818
/*     */     //   #213	-> 827
/*     */     //   #214	-> 832
/*     */     //   #210	-> 834
/*     */     //   #209	-> 835
/*     */     //   #209	-> 836
/*     */     //   #52	-> 837
/*     */     //   #42	-> 869
/*     */     //   #54	-> 872
/*     */     //   #215	-> 901
/*     */     //   #54	-> 904
/*     */     //   #216	-> 918
/*     */     //   #54	-> 924
/*     */     //   #54	-> 939
/*     */     //   #54	-> 940
/*     */     //   #55	-> 947
/*     */     //   #201	-> 948
/*     */     //   #200	-> 953
/*     */     //   #217	-> 954
/*     */     //   #179	-> 960
/*     */     //   #218	-> 963
/*     */     //   #173	-> 965
/*     */     //   #219	-> 968
/*     */     //   #167	-> 970
/*     */     //   #220	-> 973
/*     */     //   #56	-> 986
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   149	6	7	$i$f$getDp	I
/*     */     //   146	9	6	$this$dp$iv	I
/*     */     //   170	6	8	$i$f$getDp	I
/*     */     //   167	9	7	$this$dp$iv	I
/*     */     //   549	6	34	$i$f$getDp	I
/*     */     //   546	9	33	$this$dp$iv	I
/*     */     //   665	6	42	$i$a$-cache-NewTaskPageKt$NewTaskPageLeftColumn$1$1	I
/*     */     //   683	11	44	value$iv	Ljava/lang/Object;
/*     */     //   640	60	38	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   637	63	37	it$iv	Ljava/lang/Object;
/*     */     //   628	74	36	$i$f$cache	I
/*     */     //   625	77	34	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   625	77	35	invalid$iv	Z
/*     */     //   796	6	42	$i$a$-cache-NewTaskPageKt$NewTaskPageLeftColumn$1$2	I
/*     */     //   818	11	44	value$iv	Ljava/lang/Object;
/*     */     //   767	68	38	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   764	71	37	it$iv	Ljava/lang/Object;
/*     */     //   755	82	36	$i$f$cache	I
/*     */     //   752	85	34	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   752	85	35	invalid$iv	Z
/*     */     //   918	6	42	$i$f$getDp	I
/*     */     //   915	9	38	$this$dp$iv	I
/*     */     //   904	35	37	$i$a$-let-NewTaskPageKt$NewTaskPageLeftColumn$1$3	I
/*     */     //   901	38	36	it	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;
/*     */     //   536	412	32	$i$a$-Column-NewTaskPageKt$NewTaskPageLeftColumn$1	I
/*     */     //   533	415	31	$this$NewTaskPageLeftColumn_u24lambda_u248	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   533	415	30	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   533	415	29	$changed	I
/*     */     //   499	454	28	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   496	457	27	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   496	457	26	$changed$iv	I
/*     */     //   411	55	25	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   408	58	24	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   404	64	23	$i$f$set-impl	I
/*     */     //   401	67	22	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   367	115	21	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   364	118	20	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   303	661	19	$i$f$ReusableComposeNode	I
/*     */     //   300	664	17	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   300	664	18	$changed$iv$iv$iv	I
/*     */     //   246	723	13	$i$f$Layout	I
/*     */     //   261	708	14	compositeKeyHash$iv$iv	I
/*     */     //   269	700	15	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   277	692	16	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   243	726	12	$changed$iv$iv	I
/*     */     //   192	782	10	$i$f$Column	I
/*     */     //   233	741	11	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   189	785	6	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   189	785	7	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   208	766	8	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   189	785	9	$changed$iv	I
/*     */     //   122	861	5	errorState$delegate	Landroidx/compose/runtime/State;
/*     */     //   18	1002	4	$dirty	I
/*     */     //   0	1020	0	model	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
/*     */     //   0	1020	1	sendPromptEnabled	Z
/*     */     //   0	1020	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1020	3	$changed	I
/*     */   }
/*     */   
/*  34 */   private static final ErrorInfo NewTaskPageLeftColumn$lambda$0(State $errorState$delegate) { State state = $errorState$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 268 */       (ErrorInfo)state.getValue(); }
/*     */   private static final String NewTaskPageLeftColumn$lambda$8$lambda$4$lambda$3(boolean $sendPromptEnabled, PromptMode promptMode) { String str1, it; int $i$a$-takeIf-NewTaskPageKt$NewTaskPageLeftColumn$1$1$1$1, $i$a$-takeIf-NewTaskPageKt$NewTaskPageLeftColumn$1$1$1$2; Intrinsics.checkNotNullParameter(promptMode, "promptMode"); switch (WhenMappings.$EnumSwitchMapping$0[promptMode.ordinal()]) { case 1: it = str1 = "Type your question here, press Enter to send prompt"; $i$a$-takeIf-NewTaskPageKt$NewTaskPageLeftColumn$1$1$1$1 = 0; if (($sendPromptEnabled ? str1 : null) == null) $sendPromptEnabled ? str1 : null;  return "";case 2: it = str1 = "Type your task here, press Enter to send prompt"; $i$a$-takeIf-NewTaskPageKt$NewTaskPageLeftColumn$1$1$1$2 = 0; if (($sendPromptEnabled ? str1 : null) == null) $sendPromptEnabled ? str1 : null;  return ""; }  throw new NoWhenBranchMatchedException(); } private static final Unit NewTaskPageLeftColumn$lambda$8$lambda$6$lambda$5(NewTaskViewModelImpl $model, PromptMode it) { Intrinsics.checkNotNullParameter(it, "it"); $model.getPromptMode().setValue(it); return Unit.INSTANCE; } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void NewTaskRightColumn(@NotNull NewTaskViewModelImpl model, @NotNull List<Tip> tips, @NotNull Function1<? super String, Unit> onTipClick, @Nullable Composer $composer, int $changed) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'model'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc_w 'tips'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload_2
/*     */     //   14: ldc_w 'onTipClick'
/*     */     //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   20: aload_3
/*     */     //   21: ldc_w -449999512
/*     */     //   24: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   29: astore_3
/*     */     //   30: iload #4
/*     */     //   32: istore #5
/*     */     //   34: iload #4
/*     */     //   36: bipush #6
/*     */     //   38: iand
/*     */     //   39: ifne -> 62
/*     */     //   42: iload #5
/*     */     //   44: aload_3
/*     */     //   45: aload_0
/*     */     //   46: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   51: ifeq -> 58
/*     */     //   54: iconst_4
/*     */     //   55: goto -> 59
/*     */     //   58: iconst_2
/*     */     //   59: ior
/*     */     //   60: istore #5
/*     */     //   62: iload #4
/*     */     //   64: bipush #48
/*     */     //   66: iand
/*     */     //   67: ifne -> 92
/*     */     //   70: iload #5
/*     */     //   72: aload_3
/*     */     //   73: aload_1
/*     */     //   74: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   79: ifeq -> 87
/*     */     //   82: bipush #32
/*     */     //   84: goto -> 89
/*     */     //   87: bipush #16
/*     */     //   89: ior
/*     */     //   90: istore #5
/*     */     //   92: iload #4
/*     */     //   94: sipush #384
/*     */     //   97: iand
/*     */     //   98: ifne -> 125
/*     */     //   101: iload #5
/*     */     //   103: aload_3
/*     */     //   104: aload_2
/*     */     //   105: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   110: ifeq -> 119
/*     */     //   113: sipush #256
/*     */     //   116: goto -> 122
/*     */     //   119: sipush #128
/*     */     //   122: ior
/*     */     //   123: istore #5
/*     */     //   125: iload #5
/*     */     //   127: sipush #147
/*     */     //   130: iand
/*     */     //   131: sipush #146
/*     */     //   134: if_icmpne -> 146
/*     */     //   137: aload_3
/*     */     //   138: invokeinterface getSkipping : ()Z
/*     */     //   143: ifne -> 744
/*     */     //   146: invokestatic isTraceInProgress : ()Z
/*     */     //   149: ifeq -> 164
/*     */     //   152: ldc_w -449999512
/*     */     //   155: iload #5
/*     */     //   157: iconst_m1
/*     */     //   158: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.NewTaskRightColumn (NewTaskPage.kt:62)'
/*     */     //   161: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   164: aload_0
/*     */     //   165: invokevirtual getRecentTasks : ()Lkotlinx/coroutines/flow/StateFlow;
/*     */     //   168: aconst_null
/*     */     //   169: aload_3
/*     */     //   170: iconst_0
/*     */     //   171: iconst_1
/*     */     //   172: invokestatic collectAsState : (Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*     */     //   175: astore #6
/*     */     //   177: aload #6
/*     */     //   179: invokestatic NewTaskRightColumn$lambda$10 : (Landroidx/compose/runtime/State;)Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/RecentTaskLoadState;
/*     */     //   182: astore #7
/*     */     //   184: aload #7
/*     */     //   186: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/RecentTaskLoadState$Loading.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/RecentTaskLoadState$Loading;
/*     */     //   189: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   192: ifeq -> 626
/*     */     //   195: aload_3
/*     */     //   196: ldc_w -132242469
/*     */     //   199: invokeinterface startReplaceGroup : (I)V
/*     */     //   204: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   207: checkcast androidx/compose/ui/Modifier
/*     */     //   210: fconst_0
/*     */     //   211: iconst_1
/*     */     //   212: aconst_null
/*     */     //   213: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   216: fconst_0
/*     */     //   217: bipush #8
/*     */     //   219: istore #8
/*     */     //   221: iconst_0
/*     */     //   222: istore #9
/*     */     //   224: iload #8
/*     */     //   226: i2f
/*     */     //   227: invokestatic constructor-impl : (F)F
/*     */     //   230: iconst_1
/*     */     //   231: aconst_null
/*     */     //   232: invokestatic padding-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   235: astore #8
/*     */     //   237: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   240: invokevirtual getCenter : ()Landroidx/compose/ui/Alignment;
/*     */     //   243: astore #9
/*     */     //   245: bipush #54
/*     */     //   247: istore #11
/*     */     //   249: nop
/*     */     //   250: iconst_0
/*     */     //   251: istore #12
/*     */     //   253: aload_3
/*     */     //   254: ldc_w 733328855
/*     */     //   257: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   260: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   263: iconst_0
/*     */     //   264: istore #10
/*     */     //   266: aload #9
/*     */     //   268: iload #10
/*     */     //   270: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   273: astore #13
/*     */     //   275: bipush #112
/*     */     //   277: iload #11
/*     */     //   279: iconst_3
/*     */     //   280: ishl
/*     */     //   281: iand
/*     */     //   282: istore #14
/*     */     //   284: nop
/*     */     //   285: iconst_0
/*     */     //   286: istore #15
/*     */     //   288: aload_3
/*     */     //   289: ldc -1323940314
/*     */     //   291: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   293: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   296: aload_3
/*     */     //   297: iconst_0
/*     */     //   298: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   301: istore #16
/*     */     //   303: aload_3
/*     */     //   304: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   309: astore #17
/*     */     //   311: aload_3
/*     */     //   312: aload #8
/*     */     //   314: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   317: astore #18
/*     */     //   319: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   322: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   325: astore #19
/*     */     //   327: bipush #6
/*     */     //   329: sipush #896
/*     */     //   332: iload #14
/*     */     //   334: bipush #6
/*     */     //   336: ishl
/*     */     //   337: iand
/*     */     //   338: ior
/*     */     //   339: istore #20
/*     */     //   341: nop
/*     */     //   342: iconst_0
/*     */     //   343: istore #21
/*     */     //   345: aload_3
/*     */     //   346: ldc -692256719
/*     */     //   348: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   350: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   353: aload_3
/*     */     //   354: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   359: instanceof androidx/compose/runtime/Applier
/*     */     //   362: ifne -> 368
/*     */     //   365: invokestatic invalidApplier : ()V
/*     */     //   368: aload_3
/*     */     //   369: invokeinterface startReusableNode : ()V
/*     */     //   374: aload_3
/*     */     //   375: invokeinterface getInserting : ()Z
/*     */     //   380: ifeq -> 394
/*     */     //   383: aload_3
/*     */     //   384: aload #19
/*     */     //   386: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   391: goto -> 400
/*     */     //   394: aload_3
/*     */     //   395: invokeinterface useNode : ()V
/*     */     //   400: aload_3
/*     */     //   401: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   404: astore #22
/*     */     //   406: iconst_0
/*     */     //   407: istore #23
/*     */     //   409: aload #22
/*     */     //   411: aload #13
/*     */     //   413: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   416: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   419: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   422: aload #22
/*     */     //   424: aload #17
/*     */     //   426: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   429: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   432: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   435: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   438: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   441: astore #24
/*     */     //   443: iconst_0
/*     */     //   444: istore #25
/*     */     //   446: aload #22
/*     */     //   448: astore #26
/*     */     //   450: iconst_0
/*     */     //   451: istore #27
/*     */     //   453: aload #26
/*     */     //   455: invokeinterface getInserting : ()Z
/*     */     //   460: ifne -> 481
/*     */     //   463: aload #26
/*     */     //   465: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   470: iload #16
/*     */     //   472: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   475: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   478: ifne -> 507
/*     */     //   481: aload #26
/*     */     //   483: iload #16
/*     */     //   485: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   488: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   493: aload #22
/*     */     //   495: iload #16
/*     */     //   497: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   500: aload #24
/*     */     //   502: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   507: nop
/*     */     //   508: nop
/*     */     //   509: nop
/*     */     //   510: aload #22
/*     */     //   512: aload #18
/*     */     //   514: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   517: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   520: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   523: nop
/*     */     //   524: nop
/*     */     //   525: aload_3
/*     */     //   526: bipush #14
/*     */     //   528: iload #20
/*     */     //   530: bipush #6
/*     */     //   532: ishr
/*     */     //   533: iand
/*     */     //   534: istore #28
/*     */     //   536: astore #29
/*     */     //   538: iconst_0
/*     */     //   539: istore #30
/*     */     //   541: aload #29
/*     */     //   543: ldc_w -2146769399
/*     */     //   546: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   549: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   552: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   555: aload #29
/*     */     //   557: bipush #6
/*     */     //   559: bipush #112
/*     */     //   561: iload #11
/*     */     //   563: bipush #6
/*     */     //   565: ishr
/*     */     //   566: iand
/*     */     //   567: ior
/*     */     //   568: istore #31
/*     */     //   570: astore #32
/*     */     //   572: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   575: astore #33
/*     */     //   577: iconst_0
/*     */     //   578: istore #34
/*     */     //   580: aconst_null
/*     */     //   581: lconst_0
/*     */     //   582: aconst_null
/*     */     //   583: aload #32
/*     */     //   585: iconst_0
/*     */     //   586: bipush #7
/*     */     //   588: invokestatic JunieCircularProgressIndicator-3IgeMak : (Landroidx/compose/ui/Modifier;JLjava/lang/String;Landroidx/compose/runtime/Composer;II)V
/*     */     //   591: aload #29
/*     */     //   593: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   596: aload_3
/*     */     //   597: invokeinterface endNode : ()V
/*     */     //   602: aload_3
/*     */     //   603: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   606: nop
/*     */     //   607: aload_3
/*     */     //   608: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   611: nop
/*     */     //   612: aload_3
/*     */     //   613: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   616: nop
/*     */     //   617: aload_3
/*     */     //   618: invokeinterface endReplaceGroup : ()V
/*     */     //   623: goto -> 732
/*     */     //   626: aload #7
/*     */     //   628: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/RecentTaskLoadState$Ready
/*     */     //   631: ifeq -> 709
/*     */     //   634: aload_3
/*     */     //   635: ldc_w -132236580
/*     */     //   638: invokeinterface startReplaceGroup : (I)V
/*     */     //   643: aload #7
/*     */     //   645: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/RecentTaskLoadState$Ready
/*     */     //   648: invokevirtual getTasks : ()Ljava/util/List;
/*     */     //   651: aload_0
/*     */     //   652: aload_1
/*     */     //   653: aload_2
/*     */     //   654: bipush #12
/*     */     //   656: istore #8
/*     */     //   658: iconst_0
/*     */     //   659: istore #9
/*     */     //   661: iload #8
/*     */     //   663: i2f
/*     */     //   664: invokestatic constructor-impl : (F)F
/*     */     //   667: aload_3
/*     */     //   668: sipush #24576
/*     */     //   671: bipush #112
/*     */     //   673: iload #5
/*     */     //   675: iconst_3
/*     */     //   676: ishl
/*     */     //   677: iand
/*     */     //   678: ior
/*     */     //   679: sipush #896
/*     */     //   682: iload #5
/*     */     //   684: iconst_3
/*     */     //   685: ishl
/*     */     //   686: iand
/*     */     //   687: ior
/*     */     //   688: sipush #7168
/*     */     //   691: iload #5
/*     */     //   693: iconst_3
/*     */     //   694: ishl
/*     */     //   695: iand
/*     */     //   696: ior
/*     */     //   697: invokestatic ShowTaskExplorer-3xixttE : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;Ljava/util/List;Lkotlin/jvm/functions/Function1;FLandroidx/compose/runtime/Composer;I)V
/*     */     //   700: aload_3
/*     */     //   701: invokeinterface endReplaceGroup : ()V
/*     */     //   706: goto -> 732
/*     */     //   709: aload_3
/*     */     //   710: ldc_w -132244667
/*     */     //   713: invokeinterface startReplaceGroup : (I)V
/*     */     //   718: aload_3
/*     */     //   719: invokeinterface endReplaceGroup : ()V
/*     */     //   724: new kotlin/NoWhenBranchMatchedException
/*     */     //   727: dup
/*     */     //   728: invokespecial <init> : ()V
/*     */     //   731: athrow
/*     */     //   732: invokestatic isTraceInProgress : ()Z
/*     */     //   735: ifeq -> 750
/*     */     //   738: invokestatic traceEventEnd : ()V
/*     */     //   741: goto -> 750
/*     */     //   744: aload_3
/*     */     //   745: invokeinterface skipToGroupEnd : ()V
/*     */     //   750: aload_3
/*     */     //   751: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   756: dup
/*     */     //   757: ifnull -> 778
/*     */     //   760: aload_0
/*     */     //   761: aload_1
/*     */     //   762: aload_2
/*     */     //   763: iload #4
/*     */     //   765: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;Ljava/util/List;Lkotlin/jvm/functions/Function1;I)Lkotlin/jvm/functions/Function2;
/*     */     //   770: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   775: goto -> 779
/*     */     //   778: pop
/*     */     //   779: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #63	-> 20
/*     */     //   #64	-> 164
/*     */     //   #65	-> 177
/*     */     //   #66	-> 184
/*     */     //   #67	-> 204
/*     */     //   #221	-> 224
/*     */     //   #67	-> 230
/*     */     //   #68	-> 237
/*     */     //   #66	-> 249
/*     */     //   #222	-> 260
/*     */     //   #223	-> 263
/*     */     //   #226	-> 266
/*     */     //   #227	-> 284
/*     */     //   #228	-> 293
/*     */     //   #229	-> 298
/*     */     //   #230	-> 304
/*     */     //   #231	-> 312
/*     */     //   #233	-> 319
/*     */     //   #232	-> 341
/*     */     //   #234	-> 350
/*     */     //   #235	-> 353
/*     */     //   #236	-> 369
/*     */     //   #237	-> 374
/*     */     //   #238	-> 384
/*     */     //   #240	-> 395
/*     */     //   #242	-> 400
/*     */     //   #243	-> 409
/*     */     //   #244	-> 422
/*     */     //   #246	-> 435
/*     */     //   #247	-> 446
/*     */     //   #248	-> 453
/*     */     //   #249	-> 481
/*     */     //   #250	-> 493
/*     */     //   #252	-> 507
/*     */     //   #247	-> 508
/*     */     //   #252	-> 509
/*     */     //   #253	-> 510
/*     */     //   #254	-> 523
/*     */     //   #242	-> 524
/*     */     //   #255	-> 525
/*     */     //   #256	-> 549
/*     */     //   #69	-> 588
/*     */     //   #256	-> 591
/*     */     //   #255	-> 596
/*     */     //   #257	-> 597
/*     */     //   #234	-> 603
/*     */     //   #258	-> 606
/*     */     //   #228	-> 608
/*     */     //   #259	-> 611
/*     */     //   #222	-> 613
/*     */     //   #260	-> 616
/*     */     //   #66	-> 617
/*     */     //   #71	-> 626
/*     */     //   #72	-> 643
/*     */     //   #73	-> 651
/*     */     //   #74	-> 652
/*     */     //   #75	-> 653
/*     */     //   #76	-> 654
/*     */     //   #261	-> 661
/*     */     //   #71	-> 697
/*     */     //   #65	-> 709
/*     */     //   #80	-> 744
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   224	6	9	$i$f$getDp	I
/*     */     //   221	9	8	$this$dp$iv	I
/*     */     //   580	11	34	$i$a$-Box-NewTaskPageKt$NewTaskRightColumn$1	I
/*     */     //   577	14	33	$this$NewTaskRightColumn_u24lambda_u2411	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   577	14	32	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   577	14	31	$changed	I
/*     */     //   541	55	30	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   538	58	29	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   538	58	28	$changed$iv	I
/*     */     //   453	55	27	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   450	58	26	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   446	64	25	$i$f$set-impl	I
/*     */     //   443	67	24	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   409	115	23	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   406	118	22	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   345	262	21	$i$f$ReusableComposeNode	I
/*     */     //   342	265	19	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   342	265	20	$changed$iv$iv$iv	I
/*     */     //   288	324	15	$i$f$Layout	I
/*     */     //   303	309	16	compositeKeyHash$iv$iv	I
/*     */     //   311	301	17	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   319	293	18	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   285	327	14	$changed$iv$iv	I
/*     */     //   253	364	12	$i$f$Box	I
/*     */     //   275	342	13	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   250	367	8	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   250	367	9	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   266	351	10	propagateMinConstraints$iv	Z
/*     */     //   250	367	11	$changed$iv	I
/*     */     //   661	6	9	$i$f$getDp	I
/*     */     //   658	9	8	$this$dp$iv	I
/*     */     //   184	548	7	recentTasksList	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/RecentTaskLoadState;
/*     */     //   177	564	6	taskHistory$delegate	Landroidx/compose/runtime/State;
/*     */     //   34	746	5	$dirty	I
/*     */     //   0	780	0	model	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
/*     */     //   0	780	1	tips	Ljava/util/List;
/*     */     //   0	780	2	onTipClick	Lkotlin/jvm/functions/Function1;
/*     */     //   0	780	3	$composer	Landroidx/compose/runtime/Composer;
/* 269 */     //   0	780	4	$changed	I } private static final RecentTaskLoadState NewTaskRightColumn$lambda$10(State $taskHistory$delegate) { State state = $taskHistory$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (RecentTaskLoadState)state.getValue(); }
/*     */   @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void NewTaskPageSingleColumn(@NotNull NewTaskViewModelImpl model, boolean sendPromptEnabled, @Nullable Composer $composer, int $changed) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'model'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc_w -1072167372
/*     */     //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   15: astore_2
/*     */     //   16: iload_3
/*     */     //   17: istore #4
/*     */     //   19: iload_3
/*     */     //   20: bipush #6
/*     */     //   22: iand
/*     */     //   23: ifne -> 46
/*     */     //   26: iload #4
/*     */     //   28: aload_2
/*     */     //   29: aload_0
/*     */     //   30: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   35: ifeq -> 42
/*     */     //   38: iconst_4
/*     */     //   39: goto -> 43
/*     */     //   42: iconst_2
/*     */     //   43: ior
/*     */     //   44: istore #4
/*     */     //   46: iload_3
/*     */     //   47: bipush #48
/*     */     //   49: iand
/*     */     //   50: ifne -> 75
/*     */     //   53: iload #4
/*     */     //   55: aload_2
/*     */     //   56: iload_1
/*     */     //   57: invokeinterface changed : (Z)Z
/*     */     //   62: ifeq -> 70
/*     */     //   65: bipush #32
/*     */     //   67: goto -> 72
/*     */     //   70: bipush #16
/*     */     //   72: ior
/*     */     //   73: istore #4
/*     */     //   75: iload #4
/*     */     //   77: bipush #19
/*     */     //   79: iand
/*     */     //   80: bipush #18
/*     */     //   82: if_icmpne -> 94
/*     */     //   85: aload_2
/*     */     //   86: invokeinterface getSkipping : ()Z
/*     */     //   91: ifne -> 171
/*     */     //   94: invokestatic isTraceInProgress : ()Z
/*     */     //   97: ifeq -> 112
/*     */     //   100: ldc_w -1072167372
/*     */     //   103: iload #4
/*     */     //   105: iconst_m1
/*     */     //   106: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.NewTaskPageSingleColumn (NewTaskPage.kt:85)'
/*     */     //   109: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   112: aload_0
/*     */     //   113: invokevirtual getErrorFlow : ()Lkotlinx/coroutines/flow/StateFlow;
/*     */     //   116: aconst_null
/*     */     //   117: aload_2
/*     */     //   118: iconst_0
/*     */     //   119: iconst_1
/*     */     //   120: invokestatic collectAsState : (Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*     */     //   123: astore #5
/*     */     //   125: lconst_0
/*     */     //   126: aconst_null
/*     */     //   127: ldc_w -781311727
/*     */     //   130: iconst_1
/*     */     //   131: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskPageKt$NewTaskPageSingleColumn$1
/*     */     //   134: dup
/*     */     //   135: aload_0
/*     */     //   136: iload_1
/*     */     //   137: aload #5
/*     */     //   139: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;ZLandroidx/compose/runtime/State;)V
/*     */     //   142: aload_2
/*     */     //   143: bipush #54
/*     */     //   145: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   148: checkcast kotlin/jvm/functions/Function2
/*     */     //   151: aload_2
/*     */     //   152: sipush #384
/*     */     //   155: iconst_3
/*     */     //   156: invokestatic JunieSurface-KTwxG1Y : (JLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   159: invokestatic isTraceInProgress : ()Z
/*     */     //   162: ifeq -> 177
/*     */     //   165: invokestatic traceEventEnd : ()V
/*     */     //   168: goto -> 177
/*     */     //   171: aload_2
/*     */     //   172: invokeinterface skipToGroupEnd : ()V
/*     */     //   177: aload_2
/*     */     //   178: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   183: dup
/*     */     //   184: ifnull -> 203
/*     */     //   187: aload_0
/*     */     //   188: iload_1
/*     */     //   189: iload_3
/*     */     //   190: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;ZI)Lkotlin/jvm/functions/Function2;
/*     */     //   195: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   200: goto -> 204
/*     */     //   203: pop
/*     */     //   204: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #86	-> 6
/*     */     //   #87	-> 112
/*     */     //   #88	-> 127
/*     */     //   #130	-> 171
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   125	43	5	errorState$delegate	Landroidx/compose/runtime/State;
/*     */     //   19	186	4	$dirty	I
/*     */     //   0	205	0	model	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
/*     */     //   0	205	1	sendPromptEnabled	Z
/*     */     //   0	205	2	$composer	Landroidx/compose/runtime/Composer;
/* 270 */     //   0	205	3	$changed	I } private static final ErrorInfo NewTaskPageSingleColumn$lambda$13(State $errorState$delegate) { State state = $errorState$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (ErrorInfo)state.getValue(); } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nNewTaskPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewTaskPage.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskPageKt$NewTaskPageSingleColumn$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,164:1\n86#2:165\n82#2,7:166\n89#2:201\n86#2:203\n83#2,6:204\n89#2:238\n93#2:256\n93#2:306\n79#3,6:173\n86#3,4:188\n90#3,2:198\n79#3,6:210\n86#3,4:225\n90#3,2:235\n94#3:255\n79#3,6:263\n86#3,4:278\n90#3,2:288\n94#3:294\n94#3:305\n368#4,9:179\n377#4:200\n368#4,9:216\n377#4:237\n378#4,2:253\n368#4,9:269\n377#4:290\n378#4,2:292\n378#4,2:303\n4034#5,6:192\n4034#5,6:229\n4034#5,6:282\n149#6:202\n149#6:252\n149#6:302\n1225#7,6:239\n1225#7,6:245\n1225#7,6:296\n1#8:251\n71#9:257\n69#9,5:258\n74#9:291\n78#9:295\n81#10:307\n81#10:308\n*S KotlinDebug\n*F\n+ 1 NewTaskPage.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskPageKt$NewTaskPageSingleColumn$1\n*L\n89#1:165\n89#1:166,7\n89#1:201\n90#1:203\n90#1:204,6\n90#1:238\n90#1:256\n89#1:306\n89#1:173,6\n89#1:188,4\n89#1:198,2\n90#1:210,6\n90#1:225,4\n90#1:235,2\n90#1:255\n115#1:263,6\n115#1:278,4\n115#1:288,2\n115#1:294\n89#1:305\n89#1:179,9\n89#1:200\n90#1:216,9\n90#1:237\n90#1:253,2\n115#1:269,9\n115#1:290\n115#1:292,2\n89#1:303,2\n89#1:192,6\n90#1:229,6\n115#1:282,6\n94#1:202\n110#1:252\n125#1:302\n99#1:239,6\n108#1:245,6\n124#1:296,6\n115#1:257\n115#1:258,5\n115#1:291\n115#1:295\n112#1:307\n113#1:308\n*E\n"}) static final class NewTaskPageKt$NewTaskPageSingleColumn$1 implements Function2<Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { ErrorInfo it; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-781311727, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.NewTaskPageSingleColumn.<anonymous> (NewTaskPage.kt:88)");  NewTaskViewModelImpl newTaskViewModelImpl1 = this.$model; boolean bool1 = this.$sendPromptEnabled; State<ErrorInfo> state = this.$errorState$delegate; int $changed$iv = 0, $i$f$Column = 0; ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo"); Modifier modifier$iv = (Modifier)Modifier.Companion; Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop(); Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart(); MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3); int $changed$iv$iv = 0x70 & $changed$iv << 3; int $i$f$Layout = 0; ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"); int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0); CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap(); Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv); Function0 function01 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0; ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"); if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer.startReusableNode(); if ($composer.getInserting()) { $composer.createNode(function01); } else { $composer.useNode(); }  Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0; Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy()); Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals()); Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0; Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0; if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) { $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv)); $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv); }  Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier()); int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-ColumnKt$Column$1$iv = 0; ComposerKt.sourceInformationMarkerStart($composer$iv, -384784025, "C88@4444L9:Column.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; ColumnScope $this$invoke_u24lambda_u2413 = (ColumnScope)ColumnScopeInstance.INSTANCE; int $i$a$-Column-NewTaskPageKt$NewTaskPageSingleColumn$1$1 = 0; int $this$dp$iv = 12, $i$f$getDp = 0; Modifier modifier1 = PaddingKt.padding-3ABfNKs(BackgroundKt.background-bw27NRU$default((Modifier)Modifier.Companion, MatterhornThemeDataKt.getMatterhornTheme(composer1, 0).getBackgroundColor-0d7_KjU(), null, 2, null), Dp.constructor-impl($this$dp$iv)); int k = 0; int m = 0; ComposerKt.sourceInformationMarkerStart(composer1, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo"); Arrangement.Vertical vertical1 = Arrangement.INSTANCE.getTop(); Alignment.Horizontal horizontal1 = Alignment.Companion.getStart(); MeasurePolicy measurePolicy1 = ColumnKt.columnMeasurePolicy(vertical1, horizontal1, composer1, 0xE & k >> 3 | 0x70 & k >> 3); int n = 0x70 & k << 3; int i1 = 0; ComposerKt.sourceInformationMarkerStart(composer1, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"); int i2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0); CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap(); Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1); Function0 function02 = ComposeUiNode.Companion.getConstructor(); int i3 = 0x6 | 0x380 & n << 6; int i4 = 0; ComposerKt.sourceInformationMarkerStart(composer1, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"); if (!(composer1.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  composer1.startReusableNode(); if (composer1.getInserting()) { composer1.createNode(function02); } else { composer1.useNode(); }  Composer composer2 = Updater.constructor-impl(composer1); int i5 = 0; Updater.set-impl(composer2, measurePolicy1, ComposeUiNode.Companion.getSetMeasurePolicy()); Updater.set-impl(composer2, compositionLocalMap1, ComposeUiNode.Companion.getSetResolvedCompositionLocals()); Function2 function21 = ComposeUiNode.Companion.getSetCompositeKeyHash(); int i6 = 0; Composer composer3 = composer2; int i7 = 0; if (composer3.getInserting() || !Intrinsics.areEqual(composer3.rememberedValue(), Integer.valueOf(i2))) { composer3.updateRememberedValue(Integer.valueOf(i2)); composer2.apply(Integer.valueOf(i2), function21); }  Updater.set-impl(composer2, modifier2, ComposeUiNode.Companion.getSetModifier()); int i8 = 0xE & i3 >> 6; Composer composer4 = composer1; int i9 = 0; ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo"); int i10 = 0x6 | 0x70 & k >> 6; Composer composer5 = composer4; ColumnScope $this$invoke_u24lambda_u2413_u24lambda_u247 = (ColumnScope)ColumnScopeInstance.INSTANCE; int $i$a$-Column-NewTaskPageKt$NewTaskPageSingleColumn$1$1$1 = 0; composer5.startReplaceGroup(1256632829); Composer composer6 = composer5; boolean invalid$iv = composer5.changed(bool1); int $i$f$cache = 0; Object it$iv = composer6.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0; NewTaskViewModelImpl newTaskViewModelImpl2 = newTaskViewModelImpl1; boolean bool2 = bool1; Modifier modifier3 = null; int $i$a$-cache-NewTaskPageKt$NewTaskPageSingleColumn$1$1$1$1 = 0; Function1 function11 = bool1::invoke$lambda$13$lambda$7$lambda$3$lambda$2; Object value$iv = function11; composer6.updateRememberedValue(value$iv); Function1 function12 = (invalid$iv || it$iv == Composer.Companion.getEmpty()) ? (Function1)value$iv : (Function1)it$iv; composer5.endReplaceGroup(); composer5.startReplaceGroup(1256645905); Composer $this$cache$iv = composer5; invalid$iv = composer5.changedInstance(newTaskViewModelImpl1); $i$f$cache = 0; it$iv = $this$cache$iv.rememberedValue(); $i$a$-let-ComposerKt$cache$1$iv = 0; PromptMode promptMode = (PromptMode)newTaskViewModelImpl1.getPromptMode().getValue(); function11 = function12; newTaskViewModelImpl2 = newTaskViewModelImpl2; bool2 = bool2; modifier3 = modifier3; int $i$a$-cache-NewTaskPageKt$NewTaskPageSingleColumn$1$1$1$2 = 0; Function1 function13 = newTaskViewModelImpl1::invoke$lambda$13$lambda$7$lambda$5$lambda$4; value$iv = function13; $this$cache$iv.updateRememberedValue(value$iv); function12 = (invalid$iv || it$iv == Composer.Companion.getEmpty()) ? (Function1)value$iv : (Function1)it$iv; composer5.endReplaceGroup(); PromptAreaKt.PromptArea(modifier3, bool2, newTaskViewModelImpl2, function11, promptMode, function12, composer5, 0, 1); ErrorInfo errorInfo1 = NewTaskPageKt.NewTaskPageSingleColumn$lambda$13(state); composer5.startReplaceGroup(1256647943); int $i$a$-let-NewTaskPageKt$NewTaskPageSingleColumn$1$1$1$3 = 0; int i11 = 12, i12 = 0; ErrorComponentKt.ErrorComponent(PaddingKt.padding-VpY3zN4$default((Modifier)Modifier.Companion, 0.0F, Dp.constructor-impl(i11), 1, null), it, composer5, 6, 0); (errorInfo1 == null) ? null : Unit.INSTANCE; composer5.endReplaceGroup(); ComposerKt.sourceInformationMarkerEnd(composer4); composer1.endNode(); ComposerKt.sourceInformationMarkerEnd(composer1); ComposerKt.sourceInformationMarkerEnd(composer1); ComposerKt.sourceInformationMarkerEnd(composer1); State<? extends List<Tip>> tips$delegate = SnapshotStateKt.collectAsState((StateFlow)newTaskViewModelImpl1.getTips(), null, composer1, 0, 1); State<? extends RecentTaskLoadState> taskHistory$delegate = SnapshotStateKt.collectAsState(newTaskViewModelImpl1.getRecentTasks(), null, composer1, 0, 1); RecentTaskLoadState recentTasksList = invoke$lambda$13$lambda$9(taskHistory$delegate); if (Intrinsics.areEqual(recentTasksList, RecentTaskLoadState.Loading.INSTANCE)) { composer1.startReplaceGroup(-1490222153); Modifier modifier4 = SizeKt.fillMaxWidth$default((Modifier)Modifier.Companion, 0.0F, 1, null); Alignment alignment = Alignment.Companion.getCenter(); int i13 = 54; int $i$f$Box = 0; ComposerKt.sourceInformationMarkerStart(composer1, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"); boolean propagateMinConstraints$iv = false; MeasurePolicy measurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(alignment, propagateMinConstraints$iv); int i14 = 0x70 & i13 << 3; int i15 = 0; ComposerKt.sourceInformationMarkerStart(composer1, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"); int i16 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0); CompositionLocalMap compositionLocalMap = composer1.getCurrentCompositionLocalMap(); Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4); Function0 function0 = ComposeUiNode.Companion.getConstructor(); int i17 = 0x6 | 0x380 & i14 << 6; int i18 = 0; ComposerKt.sourceInformationMarkerStart(composer1, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"); if (!(composer1.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  composer1
/* 271 */             .startReusableNode();
/* 272 */           if (composer1.getInserting()) { composer1
/* 273 */               .createNode(function0); } else { composer1
/*     */               
/* 275 */               .useNode(); }
/*     */           
/* 277 */           Composer composer7 = Updater.constructor-impl(composer1); int i19 = 0;
/* 278 */           Updater.set-impl(composer7, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 279 */           Updater.set-impl(composer7, compositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */           
/* 281 */           Function2 function2 = ComposeUiNode.Companion.getSetCompositeKeyHash(); int i20 = 0;
/* 282 */           Composer composer8 = composer7; int i21 = 0;
/* 283 */           if (composer8.getInserting() || !Intrinsics.areEqual(composer8.rememberedValue(), Integer.valueOf(i16))) {
/* 284 */             composer8.updateRememberedValue(Integer.valueOf(i16));
/* 285 */             composer7.apply(Integer.valueOf(i16), function2);
/*     */           } 
/*     */           
/* 288 */           Updater.set-impl(composer7, modifier5, ComposeUiNode.Companion.getSetModifier());
/*     */           
/* 290 */           int i22 = 0xE & i17 >> 6; Composer composer9 = composer1; int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/* 291 */           ComposerKt.sourceInformationMarkerStart(composer9, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); $i$a$-Column-NewTaskPageKt$NewTaskPageSingleColumn$1$1$1 = 0x6 | 0x70 & i13 >> 6; $this$cache$iv = composer9; BoxScope $this$invoke_u24lambda_u2413_u24lambda_u2410 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-NewTaskPageKt$NewTaskPageSingleColumn$1$1$2 = 0; JunieCircularProgressIndicatorKt.JunieCircularProgressIndicator-3IgeMak(null, 0L, null, $this$cache$iv, 0, 7); ComposerKt.sourceInformationMarkerEnd(composer9);
/* 292 */           composer1.endNode(); ComposerKt.sourceInformationMarkerEnd(composer1);
/* 293 */           ComposerKt.sourceInformationMarkerEnd(composer1);
/* 294 */           ComposerKt.sourceInformationMarkerEnd(composer1); composer1.endReplaceGroup(); }
/*     */         else if (recentTasksList instanceof RecentTaskLoadState.Ready)
/* 296 */         { composer1.startReplaceGroup(-1490216475); composer1.startReplaceGroup(-1490212187); Composer composer = composer1; boolean bool = composer1.changedInstance(newTaskViewModelImpl1); int i15 = 0; Object object1 = composer.rememberedValue(); int i16 = 0;
/*     */           
/* 298 */           List<Tip> list = invoke$lambda$13$lambda$8(tips$delegate); NewTaskViewModelImpl newTaskViewModelImpl = newTaskViewModelImpl1; List<SortedRecentTaskChain> list1 = ((RecentTaskLoadState.Ready)recentTasksList).getTasks(); int $i$a$-cache-NewTaskPageKt$NewTaskPageSingleColumn$1$1$3 = 0; Function1 function15 = newTaskViewModelImpl1::invoke$lambda$13$lambda$12$lambda$11; Object object2 = function15;
/* 299 */           composer.updateRememberedValue(object2);
/* 300 */           Function1 function14 = (bool || object1 == Composer.Companion.getEmpty()) ? (Function1)object2 : 
/* 301 */             (Function1)object1; composer1.endReplaceGroup(); int i13 = 12, i14 = 0;
/* 302 */           NewTaskPageKt.ShowTaskExplorer-3xixttE(list1, newTaskViewModelImpl, list, function14, Dp.constructor-impl(i13), composer1, 24576); composer1.endReplaceGroup(); } else { composer1.startReplaceGroup(-1490224403); composer1.endReplaceGroup(); throw new NoWhenBranchMatchedException(); }
/* 303 */          ComposerKt.sourceInformationMarkerEnd($composer$iv); $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 304 */         ComposerKt.sourceInformationMarkerEnd($composer);
/* 305 */         ComposerKt.sourceInformationMarkerEnd($composer);
/* 306 */         if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  }
/* 307 */     private static final String invoke$lambda$13$lambda$7$lambda$3$lambda$2(boolean $sendPromptEnabled, PromptMode promptMode) { String str1, it; int $i$a$-takeIf-NewTaskPageKt$NewTaskPageSingleColumn$1$1$1$1$1$1, $i$a$-takeIf-NewTaskPageKt$NewTaskPageSingleColumn$1$1$1$1$1$2; Intrinsics.checkNotNullParameter(promptMode, "promptMode"); switch (WhenMappings.$EnumSwitchMapping$0[promptMode.ordinal()]) { case 1: it = str1 = "Type your question here, press Enter to send prompt"; $i$a$-takeIf-NewTaskPageKt$NewTaskPageSingleColumn$1$1$1$1$1$1 = 0; if (($sendPromptEnabled ? str1 : null) == null) $sendPromptEnabled ? str1 : null;  return "";case 2: it = str1 = "Type your task here, press Enter to send prompt"; $i$a$-takeIf-NewTaskPageKt$NewTaskPageSingleColumn$1$1$1$1$1$2 = 0; if (($sendPromptEnabled ? str1 : null) == null) $sendPromptEnabled ? str1 : null;  return ""; }  throw new NoWhenBranchMatchedException(); } private static final Unit invoke$lambda$13$lambda$7$lambda$5$lambda$4(NewTaskViewModelImpl $model, PromptMode it) { Intrinsics.checkNotNullParameter(it, "it"); $model.getPromptMode().setValue(it); return Unit.INSTANCE; } private static final List<Tip> invoke$lambda$13$lambda$8(State $tips$delegate) { State state = $tips$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (List<Tip>)state.getValue(); } private static final RecentTaskLoadState invoke$lambda$13$lambda$9(State $taskHistory$delegate) { State state = $taskHistory$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 308 */       return (RecentTaskLoadState)state.getValue(); }
/*     */ 
/*     */     
/*     */     private static final Unit invoke$lambda$13$lambda$12$lambda$11(NewTaskViewModelImpl $model, String it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       TextFieldStateKt.setTextAndPlaceCursorAtEnd($model.getTextState(), it);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     NewTaskPageKt$NewTaskPageSingleColumn$1(NewTaskViewModelImpl $model, boolean $sendPromptEnabled, State<ErrorInfo> $errorState$delegate) {} }
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   private static final void ShowTaskExplorer-3xixttE(List<SortedRecentTaskChain> recentTasksList, NewTaskViewModelImpl model, List<Tip> tips, Function1<? super String, Unit> onTipClick, float insetHorizontalPadding, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: ldc_w 312344222
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #5
/*     */     //   12: iload #6
/*     */     //   14: istore #7
/*     */     //   16: iload #6
/*     */     //   18: bipush #6
/*     */     //   20: iand
/*     */     //   21: ifne -> 45
/*     */     //   24: iload #7
/*     */     //   26: aload #5
/*     */     //   28: aload_0
/*     */     //   29: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   34: ifeq -> 41
/*     */     //   37: iconst_4
/*     */     //   38: goto -> 42
/*     */     //   41: iconst_2
/*     */     //   42: ior
/*     */     //   43: istore #7
/*     */     //   45: iload #6
/*     */     //   47: bipush #48
/*     */     //   49: iand
/*     */     //   50: ifne -> 76
/*     */     //   53: iload #7
/*     */     //   55: aload #5
/*     */     //   57: aload_1
/*     */     //   58: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   63: ifeq -> 71
/*     */     //   66: bipush #32
/*     */     //   68: goto -> 73
/*     */     //   71: bipush #16
/*     */     //   73: ior
/*     */     //   74: istore #7
/*     */     //   76: iload #6
/*     */     //   78: sipush #384
/*     */     //   81: iand
/*     */     //   82: ifne -> 110
/*     */     //   85: iload #7
/*     */     //   87: aload #5
/*     */     //   89: aload_2
/*     */     //   90: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   95: ifeq -> 104
/*     */     //   98: sipush #256
/*     */     //   101: goto -> 107
/*     */     //   104: sipush #128
/*     */     //   107: ior
/*     */     //   108: istore #7
/*     */     //   110: iload #6
/*     */     //   112: sipush #3072
/*     */     //   115: iand
/*     */     //   116: ifne -> 144
/*     */     //   119: iload #7
/*     */     //   121: aload #5
/*     */     //   123: aload_3
/*     */     //   124: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   129: ifeq -> 138
/*     */     //   132: sipush #2048
/*     */     //   135: goto -> 141
/*     */     //   138: sipush #1024
/*     */     //   141: ior
/*     */     //   142: istore #7
/*     */     //   144: iload #6
/*     */     //   146: sipush #24576
/*     */     //   149: iand
/*     */     //   150: ifne -> 179
/*     */     //   153: iload #7
/*     */     //   155: aload #5
/*     */     //   157: fload #4
/*     */     //   159: invokeinterface changed : (F)Z
/*     */     //   164: ifeq -> 173
/*     */     //   167: sipush #16384
/*     */     //   170: goto -> 176
/*     */     //   173: sipush #8192
/*     */     //   176: ior
/*     */     //   177: istore #7
/*     */     //   179: iload #7
/*     */     //   181: sipush #9363
/*     */     //   184: iand
/*     */     //   185: sipush #9362
/*     */     //   188: if_icmpne -> 201
/*     */     //   191: aload #5
/*     */     //   193: invokeinterface getSkipping : ()Z
/*     */     //   198: ifne -> 434
/*     */     //   201: invokestatic isTraceInProgress : ()Z
/*     */     //   204: ifeq -> 219
/*     */     //   207: ldc_w 312344222
/*     */     //   210: iload #7
/*     */     //   212: iconst_m1
/*     */     //   213: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.ShowTaskExplorer (NewTaskPage.kt:139)'
/*     */     //   216: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   219: aload_0
/*     */     //   220: checkcast java/util/Collection
/*     */     //   223: invokeinterface isEmpty : ()Z
/*     */     //   228: ifne -> 235
/*     */     //   231: iconst_1
/*     */     //   232: goto -> 236
/*     */     //   235: iconst_0
/*     */     //   236: istore #8
/*     */     //   238: aload_1
/*     */     //   239: invokevirtual getTaskExplorerSelectedTab : ()Landroidx/compose/runtime/MutableState;
/*     */     //   242: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   247: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/TaskExplorerTabs
/*     */     //   250: astore #9
/*     */     //   252: aconst_null
/*     */     //   253: fload #4
/*     */     //   255: iload #8
/*     */     //   257: aload #9
/*     */     //   259: aload #5
/*     */     //   261: ldc_w 47555114
/*     */     //   264: invokeinterface startReplaceGroup : (I)V
/*     */     //   269: aload #5
/*     */     //   271: astore #11
/*     */     //   273: aload #5
/*     */     //   275: aload_1
/*     */     //   276: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   281: istore #12
/*     */     //   283: nop
/*     */     //   284: iconst_0
/*     */     //   285: istore #13
/*     */     //   287: aload #11
/*     */     //   289: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   294: astore #14
/*     */     //   296: iconst_0
/*     */     //   297: istore #15
/*     */     //   299: iload #12
/*     */     //   301: ifne -> 315
/*     */     //   304: aload #14
/*     */     //   306: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   309: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   312: if_acmpne -> 360
/*     */     //   315: astore #21
/*     */     //   317: istore #20
/*     */     //   319: fstore #19
/*     */     //   321: astore #18
/*     */     //   323: iconst_0
/*     */     //   324: istore #16
/*     */     //   326: aload_1
/*     */     //   327: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;)Lkotlin/jvm/functions/Function1;
/*     */     //   332: astore #22
/*     */     //   334: aload #18
/*     */     //   336: fload #19
/*     */     //   338: iload #20
/*     */     //   340: aload #21
/*     */     //   342: aload #22
/*     */     //   344: astore #17
/*     */     //   346: aload #11
/*     */     //   348: aload #17
/*     */     //   350: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   355: aload #17
/*     */     //   357: goto -> 362
/*     */     //   360: aload #14
/*     */     //   362: nop
/*     */     //   363: nop
/*     */     //   364: nop
/*     */     //   365: checkcast kotlin/jvm/functions/Function1
/*     */     //   368: astore #10
/*     */     //   370: aload #5
/*     */     //   372: invokeinterface endReplaceGroup : ()V
/*     */     //   377: aload #10
/*     */     //   379: ldc_w 766100948
/*     */     //   382: iconst_1
/*     */     //   383: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskPageKt$ShowTaskExplorer$2
/*     */     //   386: dup
/*     */     //   387: aload_1
/*     */     //   388: aload_0
/*     */     //   389: aload_2
/*     */     //   390: aload_3
/*     */     //   391: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
/*     */     //   394: aload #5
/*     */     //   396: bipush #54
/*     */     //   398: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   401: checkcast kotlin/jvm/functions/Function2
/*     */     //   404: aload #5
/*     */     //   406: ldc_w 196608
/*     */     //   409: bipush #112
/*     */     //   411: iload #7
/*     */     //   413: bipush #9
/*     */     //   415: ishr
/*     */     //   416: iand
/*     */     //   417: ior
/*     */     //   418: iconst_1
/*     */     //   419: invokestatic TaskExplorer-RfXq3Jk : (Landroidx/compose/ui/Modifier;FZLcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/TaskExplorerTabs;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   422: invokestatic isTraceInProgress : ()Z
/*     */     //   425: ifeq -> 441
/*     */     //   428: invokestatic traceEventEnd : ()V
/*     */     //   431: goto -> 441
/*     */     //   434: aload #5
/*     */     //   436: invokeinterface skipToGroupEnd : ()V
/*     */     //   441: aload #5
/*     */     //   443: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   448: dup
/*     */     //   449: ifnull -> 473
/*     */     //   452: aload_0
/*     */     //   453: aload_1
/*     */     //   454: aload_2
/*     */     //   455: aload_3
/*     */     //   456: fload #4
/*     */     //   458: iload #6
/*     */     //   460: <illegal opcode> invoke : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;Ljava/util/List;Lkotlin/jvm/functions/Function1;FI)Lkotlin/jvm/functions/Function2;
/*     */     //   465: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   470: goto -> 474
/*     */     //   473: pop
/*     */     //   474: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #140	-> 0
/*     */     //   #143	-> 219
/*     */     //   #143	-> 236
/*     */     //   #160	-> 238
/*     */     //   #142	-> 253
/*     */     //   #143	-> 255
/*     */     //   #160	-> 257
/*     */     //   #161	-> 283
/*     */     //   #262	-> 287
/*     */     //   #263	-> 299
/*     */     //   #264	-> 315
/*     */     //   #161	-> 326
/*     */     //   #264	-> 344
/*     */     //   #265	-> 346
/*     */     //   #266	-> 355
/*     */     //   #267	-> 360
/*     */     //   #263	-> 362
/*     */     //   #262	-> 363
/*     */     //   #262	-> 364
/*     */     //   #161	-> 365
/*     */     //   #144	-> 379
/*     */     //   #141	-> 419
/*     */     //   #163	-> 434
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   326	6	16	$i$a$-cache-NewTaskPageKt$ShowTaskExplorer$1	I
/*     */     //   346	11	17	value$iv	Ljava/lang/Object;
/*     */     //   299	64	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   296	67	14	it$iv	Ljava/lang/Object;
/*     */     //   287	78	13	$i$f$cache	I
/*     */     //   284	81	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   284	81	12	invalid$iv	Z
/*     */     //   16	459	7	$dirty	I
/*     */     //   0	475	0	recentTasksList	Ljava/util/List;
/*     */     //   0	475	1	model	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
/*     */     //   0	475	2	tips	Ljava/util/List;
/*     */     //   0	475	3	onTipClick	Lkotlin/jvm/functions/Function1;
/*     */     //   0	475	4	insetHorizontalPadding	F
/*     */     //   0	475	5	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	475	6	$changed	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nNewTaskPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewTaskPage.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskPageKt$ShowTaskExplorer$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,164:1\n1225#2,6:165\n1225#2,6:171\n149#3:177\n149#3:178\n*S KotlinDebug\n*F\n+ 1 NewTaskPage.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskPageKt$ShowTaskExplorer$2\n*L\n149#1:165,6\n150#1:171,6\n151#1:177\n154#1:178\n*E\n"})
/*     */   static final class NewTaskPageKt$ShowTaskExplorer$2 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*     */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */         NewTaskViewModelImpl newTaskViewModelImpl;
/*     */         int $this$dp$iv;
/*     */         Modifier modifier1;
/*     */         KFunction kFunction1;
/*     */         int $i$f$getDp;
/*     */         int i;
/*     */         Composer composer1;
/*     */         Composer $this$cache$iv;
/*     */         int j;
/*     */         boolean invalid$iv;
/*     */         int $i$f$cache;
/*     */         Object it$iv;
/*     */         int $i$a$-let-ComposerKt$cache$1$iv;
/*     */         int $i$a$-cache-NewTaskPageKt$ShowTaskExplorer$2$1;
/*     */         Object value$iv;
/*     */         Modifier modifier2;
/*     */         List<SortedRecentTaskChain> list;
/*     */         SelectableLazyListState selectableLazyListState;
/*     */         KFunction kFunction2;
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(766100948, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.ShowTaskExplorer.<anonymous> (NewTaskPage.kt:144)"); 
/*     */         switch (WhenMappings.$EnumSwitchMapping$0[((TaskExplorerTabs)this.$model.getTaskExplorerSelectedTab().getValue()).ordinal()]) {
/*     */           case 1:
/*     */             $composer.startReplaceGroup(-1558712792);
/*     */             newTaskViewModelImpl = this.$model;
/*     */             $composer.startReplaceGroup(-1558708560);
/*     */             composer1 = $composer;
/*     */             invalid$iv = $composer.changedInstance(newTaskViewModelImpl);
/*     */             $i$f$cache = 0;
/*     */             it$iv = composer1.rememberedValue();
/*     */             $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */             selectableLazyListState = this.$model.getTaskListState();
/*     */             list = this.$recentTasksList;
/*     */             modifier2 = null;
/*     */             $i$a$-cache-NewTaskPageKt$ShowTaskExplorer$2$1 = 0;
/*     */             kFunction2 = (KFunction)new NewTaskPageKt$ShowTaskExplorer$2$1$1(newTaskViewModelImpl);
/*     */             value$iv = kFunction2;
/*     */             composer1.updateRememberedValue(value$iv);
/*     */             kFunction1 = (invalid$iv || it$iv == Composer.Companion.getEmpty()) ? (KFunction)value$iv : (KFunction)it$iv;
/*     */             $composer.endReplaceGroup();
/*     */             newTaskViewModelImpl = this.$model;
/*     */             $composer.startReplaceGroup(-1558707047);
/*     */             $this$cache$iv = $composer;
/*     */             invalid$iv = $composer.changedInstance(newTaskViewModelImpl);
/*     */             $i$f$cache = 0;
/*     */             it$iv = $this$cache$iv.rememberedValue();
/*     */             $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */             if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
/*     */               Function1<? super TaskChainId, Unit> function1 = (Function1)kFunction1;
/*     */               selectableLazyListState = selectableLazyListState;
/*     */               list = list;
/*     */               modifier2 = modifier2;
/*     */               int $i$a$-cache-NewTaskPageKt$ShowTaskExplorer$2$2 = 0;
/*     */               KFunction kFunction = (KFunction)new NewTaskPageKt$ShowTaskExplorer$2$2$1(newTaskViewModelImpl);
/*     */               value$iv = kFunction;
/*     */               $this$cache$iv.updateRememberedValue(value$iv);
/*     */             } 
/*     */             kFunction1 = (KFunction)it$iv;
/*     */             $composer.endReplaceGroup();
/*     */             $this$dp$iv = 12;
/*     */             $i$f$getDp = 0;
/*     */             TaskListKt.TaskList-5IdfQCw(modifier2, list, selectableLazyListState, function1, (Function2<? super SortedRecentTaskChain, ? super Integer, ? extends List<? extends ContextMenuItem>>)kFunction1, 0L, Dp.constructor-impl($this$dp$iv), $composer, 0x180000 | SelectableLazyListState.$stable << 6, 33);
/*     */             $composer.endReplaceGroup();
/*     */             break;
/*     */           case 2:
/*     */             $composer.startReplaceGroup(-1075155005);
/*     */             i = 12;
/*     */             j = 0;
/*     */             modifier1 = PaddingKt.padding-VpY3zN4$default(BackgroundKt.background-bw27NRU$default((Modifier)Modifier.Companion, MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getBackgroundColor-0d7_KjU(), null, 2, null), Dp.constructor-impl(i), 0.0F, 2, null);
/*     */             JuniePromptExampleTipsKt.JuniePromptExampleTips-Zb7fWow(this.$tips, this.$onTipClick, null, modifier1, 0L, $composer, 0, 20);
/*     */             $composer.endReplaceGroup();
/*     */             break;
/*     */           default:
/*     */             $composer.startReplaceGroup(-1558715062);
/*     */             $composer.endReplaceGroup();
/*     */             throw new NoWhenBranchMatchedException();
/*     */         } 
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */     
/*     */     NewTaskPageKt$ShowTaskExplorer$2(NewTaskViewModelImpl $model, List<SortedRecentTaskChain> $recentTasksList, List<Tip> $tips, Function1<String, Unit> $onTipClick) {}
/*     */   }
/*     */   
/*     */   private static final Unit ShowTaskExplorer_3xixttE$lambda$16$lambda$15(NewTaskViewModelImpl $model, TaskExplorerTabs it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     $model.getTaskExplorerSelectedTab().setValue(it);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit NewTaskPageLeftColumn$lambda$9(NewTaskViewModelImpl $model, boolean $sendPromptEnabled, int $$changed, Composer $composer, int $force) {
/*     */     NewTaskPageLeftColumn($model, $sendPromptEnabled, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit NewTaskRightColumn$lambda$12(NewTaskViewModelImpl $model, List<Tip> $tips, Function1<? super String, Unit> $onTipClick, int $$changed, Composer $composer, int $force) {
/*     */     NewTaskRightColumn($model, $tips, $onTipClick, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit NewTaskPageSingleColumn$lambda$14(NewTaskViewModelImpl $model, boolean $sendPromptEnabled, int $$changed, Composer $composer, int $force) {
/*     */     NewTaskPageSingleColumn($model, $sendPromptEnabled, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit ShowTaskExplorer_3xixttE$lambda$17(List<SortedRecentTaskChain> $recentTasksList, NewTaskViewModelImpl $model, List<Tip> $tips, Function1<? super String, Unit> $onTipClick, float $insetHorizontalPadding, int $$changed, Composer $composer, int $force) {
/*     */     ShowTaskExplorer-3xixttE($recentTasksList, $model, $tips, $onTipClick, $insetHorizontalPadding, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\create\NewTaskPageKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */