/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header;
/*    */ import androidx.compose.foundation.layout.SizeKt;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.text.font.FontFamily;
/*    */ import androidx.compose.ui.text.font.FontWeight;
/*    */ import androidx.compose.ui.unit.TextUnitKt;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskId;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.statistics.CompositeUiAction;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeData;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.ui.component.TextKt;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032\037\020\000\032\0020\0012\006\020\002\032\0020\0032\b\020\004\032\004\030\0010\005H\001¢\006\002\020\006¨\006\007"}, d2 = {"TaskHeader", "", "viewModel", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderViewModel;", "state", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderViewModel;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;Landroidx/compose/runtime/Composer;I)V", "ej-ui"})
/*    */ @SourceDebugExtension({"SMAP\nTaskHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskHeader.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,121:1\n149#2:122\n149#2:202\n149#2:239\n149#2:240\n149#2:277\n149#2:282\n149#2:283\n149#2:320\n149#2:321\n149#2:367\n149#2:404\n86#3:123\n83#3,6:124\n89#3:158\n86#3:203\n83#3,6:204\n89#3:238\n93#3:453\n93#3:461\n79#4,6:130\n86#4,4:145\n90#4,2:155\n79#4,6:167\n86#4,4:182\n90#4,2:192\n79#4,6:210\n86#4,4:225\n90#4,2:235\n79#4,6:248\n86#4,4:263\n90#4,2:273\n94#4:280\n79#4,6:291\n86#4,4:306\n90#4,2:316\n79#4,6:330\n86#4,4:345\n90#4,2:355\n94#4:361\n94#4:365\n79#4,6:375\n86#4,4:390\n90#4,2:400\n79#4,6:413\n86#4,4:428\n90#4,2:438\n94#4:444\n94#4:448\n94#4:452\n94#4:456\n94#4:460\n368#5,9:136\n377#5:157\n368#5,9:173\n377#5:194\n368#5,9:216\n377#5:237\n368#5,9:254\n377#5:275\n378#5,2:278\n368#5,9:297\n377#5:318\n368#5,9:336\n377#5:357\n378#5,2:359\n378#5,2:363\n368#5,9:381\n377#5:402\n368#5,9:419\n377#5:440\n378#5,2:442\n378#5,2:446\n378#5,2:450\n378#5,2:454\n378#5,2:458\n4034#6,6:149\n4034#6,6:186\n4034#6,6:229\n4034#6,6:267\n4034#6,6:310\n4034#6,6:349\n4034#6,6:394\n4034#6,6:432\n99#7:159\n95#7,7:160\n102#7:195\n99#7:241\n96#7,6:242\n102#7:276\n106#7:281\n99#7:284\n96#7,6:285\n102#7:319\n106#7:366\n99#7:368\n96#7,6:369\n102#7:403\n106#7:449\n106#7:457\n1225#8,6:196\n71#9:322\n67#9,7:323\n74#9:358\n78#9:362\n71#9:405\n67#9,7:406\n74#9:441\n78#9:445\n*S KotlinDebug\n*F\n+ 1 TaskHeader.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderKt\n*L\n36#1:122\n49#1:202\n65#1:239\n69#1:240\n72#1:277\n77#1:282\n81#1:283\n86#1:320\n90#1:321\n102#1:367\n107#1:404\n36#1:123\n36#1:124,6\n36#1:158\n49#1:203\n49#1:204,6\n49#1:238\n49#1:453\n36#1:461\n36#1:130,6\n36#1:145,4\n36#1:155,2\n37#1:167,6\n37#1:182,4\n37#1:192,2\n49#1:210,6\n49#1:225,4\n49#1:235,2\n69#1:248,6\n69#1:263,4\n69#1:273,2\n69#1:280\n81#1:291,6\n81#1:306,4\n81#1:316,2\n94#1:330,6\n94#1:345,4\n94#1:355,2\n94#1:361\n81#1:365\n102#1:375,6\n102#1:390,4\n102#1:400,2\n109#1:413,6\n109#1:428,4\n109#1:438,2\n109#1:444\n102#1:448\n49#1:452\n37#1:456\n36#1:460\n36#1:136,9\n36#1:157\n37#1:173,9\n37#1:194\n49#1:216,9\n49#1:237\n69#1:254,9\n69#1:275\n69#1:278,2\n81#1:297,9\n81#1:318\n94#1:336,9\n94#1:357\n94#1:359,2\n81#1:363,2\n102#1:381,9\n102#1:402\n109#1:419,9\n109#1:440\n109#1:442,2\n102#1:446,2\n49#1:450,2\n37#1:454,2\n36#1:458,2\n36#1:149,6\n37#1:186,6\n49#1:229,6\n69#1:267,6\n81#1:310,6\n94#1:349,6\n102#1:394,6\n109#1:432,6\n37#1:159\n37#1:160,7\n37#1:195\n69#1:241\n69#1:242,6\n69#1:276\n69#1:281\n81#1:284\n81#1:285,6\n81#1:319\n81#1:366\n102#1:368\n102#1:369,6\n102#1:403\n102#1:449\n37#1:457\n39#1:196,6\n94#1:322\n94#1:323,7\n94#1:358\n94#1:362\n109#1:405\n109#1:406,7\n109#1:441\n109#1:445\n*E\n"})
/*    */ public final class TaskHeaderKt {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public static final void TaskHeader(@NotNull TaskHeaderViewModel viewModel, @Nullable TaskHeaderState state, @Nullable Composer $composer, int $changed) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'viewModel'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 1749034644
/*    */     //   9: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   14: astore_2
/*    */     //   15: iload_3
/*    */     //   16: istore #4
/*    */     //   18: iload_3
/*    */     //   19: bipush #6
/*    */     //   21: iand
/*    */     //   22: ifne -> 45
/*    */     //   25: iload #4
/*    */     //   27: aload_2
/*    */     //   28: aload_0
/*    */     //   29: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   34: ifeq -> 41
/*    */     //   37: iconst_4
/*    */     //   38: goto -> 42
/*    */     //   41: iconst_2
/*    */     //   42: ior
/*    */     //   43: istore #4
/*    */     //   45: iload_3
/*    */     //   46: bipush #48
/*    */     //   48: iand
/*    */     //   49: ifne -> 74
/*    */     //   52: iload #4
/*    */     //   54: aload_2
/*    */     //   55: aload_1
/*    */     //   56: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   61: ifeq -> 69
/*    */     //   64: bipush #32
/*    */     //   66: goto -> 71
/*    */     //   69: bipush #16
/*    */     //   71: ior
/*    */     //   72: istore #4
/*    */     //   74: iload #4
/*    */     //   76: bipush #19
/*    */     //   78: iand
/*    */     //   79: bipush #18
/*    */     //   81: if_icmpne -> 93
/*    */     //   84: aload_2
/*    */     //   85: invokeinterface getSkipping : ()Z
/*    */     //   90: ifne -> 4427
/*    */     //   93: invokestatic isTraceInProgress : ()Z
/*    */     //   96: ifeq -> 109
/*    */     //   99: ldc 1749034644
/*    */     //   101: iload #4
/*    */     //   103: iconst_m1
/*    */     //   104: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header.TaskHeader (TaskHeader.kt:34)'
/*    */     //   106: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   109: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   112: checkcast androidx/compose/ui/Modifier
/*    */     //   115: fconst_0
/*    */     //   116: fconst_0
/*    */     //   117: bipush #12
/*    */     //   119: istore #5
/*    */     //   121: iconst_0
/*    */     //   122: istore #6
/*    */     //   124: iload #5
/*    */     //   126: i2f
/*    */     //   127: invokestatic constructor-impl : (F)F
/*    */     //   130: iconst_4
/*    */     //   131: istore #5
/*    */     //   133: iconst_0
/*    */     //   134: istore #6
/*    */     //   136: iload #5
/*    */     //   138: i2f
/*    */     //   139: invokestatic constructor-impl : (F)F
/*    */     //   142: iconst_3
/*    */     //   143: aconst_null
/*    */     //   144: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   147: astore #5
/*    */     //   149: bipush #6
/*    */     //   151: istore #8
/*    */     //   153: iconst_0
/*    */     //   154: istore #9
/*    */     //   156: aload_2
/*    */     //   157: ldc -483455358
/*    */     //   159: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*    */     //   161: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   164: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*    */     //   167: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*    */     //   170: astore #6
/*    */     //   172: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   175: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*    */     //   178: astore #7
/*    */     //   180: aload #6
/*    */     //   182: aload #7
/*    */     //   184: aload_2
/*    */     //   185: bipush #14
/*    */     //   187: iload #8
/*    */     //   189: iconst_3
/*    */     //   190: ishr
/*    */     //   191: iand
/*    */     //   192: bipush #112
/*    */     //   194: iload #8
/*    */     //   196: iconst_3
/*    */     //   197: ishr
/*    */     //   198: iand
/*    */     //   199: ior
/*    */     //   200: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   203: astore #10
/*    */     //   205: bipush #112
/*    */     //   207: iload #8
/*    */     //   209: iconst_3
/*    */     //   210: ishl
/*    */     //   211: iand
/*    */     //   212: istore #11
/*    */     //   214: nop
/*    */     //   215: iconst_0
/*    */     //   216: istore #12
/*    */     //   218: aload_2
/*    */     //   219: ldc -1323940314
/*    */     //   221: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   223: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   226: aload_2
/*    */     //   227: iconst_0
/*    */     //   228: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   231: istore #13
/*    */     //   233: aload_2
/*    */     //   234: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   239: astore #14
/*    */     //   241: aload_2
/*    */     //   242: aload #5
/*    */     //   244: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   247: astore #15
/*    */     //   249: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   252: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   255: astore #16
/*    */     //   257: bipush #6
/*    */     //   259: sipush #896
/*    */     //   262: iload #11
/*    */     //   264: bipush #6
/*    */     //   266: ishl
/*    */     //   267: iand
/*    */     //   268: ior
/*    */     //   269: istore #17
/*    */     //   271: nop
/*    */     //   272: iconst_0
/*    */     //   273: istore #18
/*    */     //   275: aload_2
/*    */     //   276: ldc -692256719
/*    */     //   278: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   280: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   283: aload_2
/*    */     //   284: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   289: instanceof androidx/compose/runtime/Applier
/*    */     //   292: ifne -> 298
/*    */     //   295: invokestatic invalidApplier : ()V
/*    */     //   298: aload_2
/*    */     //   299: invokeinterface startReusableNode : ()V
/*    */     //   304: aload_2
/*    */     //   305: invokeinterface getInserting : ()Z
/*    */     //   310: ifeq -> 324
/*    */     //   313: aload_2
/*    */     //   314: aload #16
/*    */     //   316: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   321: goto -> 330
/*    */     //   324: aload_2
/*    */     //   325: invokeinterface useNode : ()V
/*    */     //   330: aload_2
/*    */     //   331: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   334: astore #19
/*    */     //   336: iconst_0
/*    */     //   337: istore #20
/*    */     //   339: aload #19
/*    */     //   341: aload #10
/*    */     //   343: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   346: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   349: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   352: aload #19
/*    */     //   354: aload #14
/*    */     //   356: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   359: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   362: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   365: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   368: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   371: astore #21
/*    */     //   373: iconst_0
/*    */     //   374: istore #22
/*    */     //   376: aload #19
/*    */     //   378: astore #23
/*    */     //   380: iconst_0
/*    */     //   381: istore #24
/*    */     //   383: aload #23
/*    */     //   385: invokeinterface getInserting : ()Z
/*    */     //   390: ifne -> 411
/*    */     //   393: aload #23
/*    */     //   395: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   400: iload #13
/*    */     //   402: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   405: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   408: ifne -> 437
/*    */     //   411: aload #23
/*    */     //   413: iload #13
/*    */     //   415: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   418: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   423: aload #19
/*    */     //   425: iload #13
/*    */     //   427: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   430: aload #21
/*    */     //   432: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   437: nop
/*    */     //   438: nop
/*    */     //   439: nop
/*    */     //   440: aload #19
/*    */     //   442: aload #15
/*    */     //   444: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   447: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   450: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   453: nop
/*    */     //   454: nop
/*    */     //   455: aload_2
/*    */     //   456: bipush #14
/*    */     //   458: iload #17
/*    */     //   460: bipush #6
/*    */     //   462: ishr
/*    */     //   463: iand
/*    */     //   464: istore #25
/*    */     //   466: astore #26
/*    */     //   468: iconst_0
/*    */     //   469: istore #27
/*    */     //   471: aload #26
/*    */     //   473: ldc -384784025
/*    */     //   475: ldc 'C88@4444L9:Column.kt#2w3rfo'
/*    */     //   477: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   480: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*    */     //   483: aload #26
/*    */     //   485: bipush #6
/*    */     //   487: bipush #112
/*    */     //   489: iload #8
/*    */     //   491: bipush #6
/*    */     //   493: ishr
/*    */     //   494: iand
/*    */     //   495: ior
/*    */     //   496: istore #28
/*    */     //   498: astore #29
/*    */     //   500: checkcast androidx/compose/foundation/layout/ColumnScope
/*    */     //   503: astore #30
/*    */     //   505: iconst_0
/*    */     //   506: istore #31
/*    */     //   508: iconst_0
/*    */     //   509: istore #32
/*    */     //   511: nop
/*    */     //   512: iconst_0
/*    */     //   513: istore #33
/*    */     //   515: aload #29
/*    */     //   517: ldc 693286680
/*    */     //   519: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*    */     //   521: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   524: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   527: checkcast androidx/compose/ui/Modifier
/*    */     //   530: astore #34
/*    */     //   532: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*    */     //   535: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*    */     //   538: astore #35
/*    */     //   540: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   543: invokevirtual getTop : ()Landroidx/compose/ui/Alignment$Vertical;
/*    */     //   546: astore #36
/*    */     //   548: aload #35
/*    */     //   550: aload #36
/*    */     //   552: aload #29
/*    */     //   554: bipush #14
/*    */     //   556: iload #32
/*    */     //   558: iconst_3
/*    */     //   559: ishr
/*    */     //   560: iand
/*    */     //   561: bipush #112
/*    */     //   563: iload #32
/*    */     //   565: iconst_3
/*    */     //   566: ishr
/*    */     //   567: iand
/*    */     //   568: ior
/*    */     //   569: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   572: astore #37
/*    */     //   574: bipush #112
/*    */     //   576: iload #32
/*    */     //   578: iconst_3
/*    */     //   579: ishl
/*    */     //   580: iand
/*    */     //   581: istore #38
/*    */     //   583: nop
/*    */     //   584: iconst_0
/*    */     //   585: istore #39
/*    */     //   587: aload #29
/*    */     //   589: ldc -1323940314
/*    */     //   591: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   593: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   596: aload #29
/*    */     //   598: iconst_0
/*    */     //   599: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   602: istore #40
/*    */     //   604: aload #29
/*    */     //   606: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   611: astore #41
/*    */     //   613: aload #29
/*    */     //   615: aload #34
/*    */     //   617: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   620: astore #42
/*    */     //   622: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   625: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   628: astore #43
/*    */     //   630: bipush #6
/*    */     //   632: sipush #896
/*    */     //   635: iload #38
/*    */     //   637: bipush #6
/*    */     //   639: ishl
/*    */     //   640: iand
/*    */     //   641: ior
/*    */     //   642: istore #44
/*    */     //   644: nop
/*    */     //   645: iconst_0
/*    */     //   646: istore #45
/*    */     //   648: aload #29
/*    */     //   650: ldc -692256719
/*    */     //   652: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   654: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   657: aload #29
/*    */     //   659: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   664: instanceof androidx/compose/runtime/Applier
/*    */     //   667: ifne -> 673
/*    */     //   670: invokestatic invalidApplier : ()V
/*    */     //   673: aload #29
/*    */     //   675: invokeinterface startReusableNode : ()V
/*    */     //   680: aload #29
/*    */     //   682: invokeinterface getInserting : ()Z
/*    */     //   687: ifeq -> 702
/*    */     //   690: aload #29
/*    */     //   692: aload #43
/*    */     //   694: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   699: goto -> 709
/*    */     //   702: aload #29
/*    */     //   704: invokeinterface useNode : ()V
/*    */     //   709: aload #29
/*    */     //   711: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   714: astore #46
/*    */     //   716: iconst_0
/*    */     //   717: istore #47
/*    */     //   719: aload #46
/*    */     //   721: aload #37
/*    */     //   723: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   726: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   729: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   732: aload #46
/*    */     //   734: aload #41
/*    */     //   736: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   739: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   742: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   745: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   748: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   751: astore #48
/*    */     //   753: iconst_0
/*    */     //   754: istore #49
/*    */     //   756: aload #46
/*    */     //   758: astore #50
/*    */     //   760: iconst_0
/*    */     //   761: istore #51
/*    */     //   763: aload #50
/*    */     //   765: invokeinterface getInserting : ()Z
/*    */     //   770: ifne -> 791
/*    */     //   773: aload #50
/*    */     //   775: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   780: iload #40
/*    */     //   782: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   785: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   788: ifne -> 817
/*    */     //   791: aload #50
/*    */     //   793: iload #40
/*    */     //   795: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   798: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   803: aload #46
/*    */     //   805: iload #40
/*    */     //   807: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   810: aload #48
/*    */     //   812: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   817: nop
/*    */     //   818: nop
/*    */     //   819: nop
/*    */     //   820: aload #46
/*    */     //   822: aload #42
/*    */     //   824: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   827: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   830: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   833: nop
/*    */     //   834: nop
/*    */     //   835: aload #29
/*    */     //   837: bipush #14
/*    */     //   839: iload #44
/*    */     //   841: bipush #6
/*    */     //   843: ishr
/*    */     //   844: iand
/*    */     //   845: istore #52
/*    */     //   847: astore #53
/*    */     //   849: iconst_0
/*    */     //   850: istore #54
/*    */     //   852: aload #53
/*    */     //   854: ldc -407840262
/*    */     //   856: ldc 'C101@5126L9:Row.kt#2w3rfo'
/*    */     //   858: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   861: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*    */     //   864: aload #53
/*    */     //   866: bipush #6
/*    */     //   868: bipush #112
/*    */     //   870: iload #32
/*    */     //   872: bipush #6
/*    */     //   874: ishr
/*    */     //   875: iand
/*    */     //   876: ior
/*    */     //   877: istore #55
/*    */     //   879: astore #56
/*    */     //   881: checkcast androidx/compose/foundation/layout/RowScope
/*    */     //   884: astore #57
/*    */     //   886: iconst_0
/*    */     //   887: istore #58
/*    */     //   889: aload #56
/*    */     //   891: ldc 207013495
/*    */     //   893: invokeinterface startReplaceGroup : (I)V
/*    */     //   898: aload #56
/*    */     //   900: astore #59
/*    */     //   902: aload_2
/*    */     //   903: aload_0
/*    */     //   904: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   909: istore #60
/*    */     //   911: nop
/*    */     //   912: iconst_0
/*    */     //   913: istore #61
/*    */     //   915: aload #59
/*    */     //   917: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   922: astore #62
/*    */     //   924: iconst_0
/*    */     //   925: istore #63
/*    */     //   927: iload #60
/*    */     //   929: ifne -> 943
/*    */     //   932: aload #62
/*    */     //   934: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   937: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   940: if_acmpne -> 968
/*    */     //   943: iconst_0
/*    */     //   944: istore #64
/*    */     //   946: aload_0
/*    */     //   947: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderViewModel;)Lkotlin/jvm/functions/Function0;
/*    */     //   952: astore #65
/*    */     //   954: aload #59
/*    */     //   956: aload #65
/*    */     //   958: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   963: aload #65
/*    */     //   965: goto -> 970
/*    */     //   968: aload #62
/*    */     //   970: nop
/*    */     //   971: nop
/*    */     //   972: nop
/*    */     //   973: checkcast kotlin/jvm/functions/Function0
/*    */     //   976: astore #66
/*    */     //   978: aload #56
/*    */     //   980: invokeinterface endReplaceGroup : ()V
/*    */     //   985: aload #66
/*    */     //   987: aconst_null
/*    */     //   988: iconst_0
/*    */     //   989: iconst_0
/*    */     //   990: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*    */     //   993: aload #56
/*    */     //   995: bipush #6
/*    */     //   997: invokestatic getIconButtonStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*    */     //   1000: bipush #50
/*    */     //   1002: invokestatic CornerSize : (I)Landroidx/compose/foundation/shape/CornerSize;
/*    */     //   1005: invokestatic withRoundedCornerShape : (Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/shape/CornerSize;)Lorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;
/*    */     //   1008: aconst_null
/*    */     //   1009: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/ComposableSingletons$TaskHeaderKt.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/ComposableSingletons$TaskHeaderKt;
/*    */     //   1012: invokevirtual getLambda-1$ej_ui : ()Lkotlin/jvm/functions/Function4;
/*    */     //   1015: aload #56
/*    */     //   1017: ldc_w 1572864
/*    */     //   1020: bipush #46
/*    */     //   1022: invokestatic IconButton : (Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/component/styling/IconButtonStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V
/*    */     //   1025: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   1028: checkcast androidx/compose/ui/Modifier
/*    */     //   1031: bipush #12
/*    */     //   1033: istore #66
/*    */     //   1035: iconst_0
/*    */     //   1036: istore #59
/*    */     //   1038: iload #66
/*    */     //   1040: i2f
/*    */     //   1041: invokestatic constructor-impl : (F)F
/*    */     //   1044: fconst_0
/*    */     //   1045: fconst_0
/*    */     //   1046: fconst_0
/*    */     //   1047: bipush #14
/*    */     //   1049: aconst_null
/*    */     //   1050: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   1053: astore #66
/*    */     //   1055: bipush #6
/*    */     //   1057: istore #61
/*    */     //   1059: iconst_0
/*    */     //   1060: istore #62
/*    */     //   1062: aload #56
/*    */     //   1064: ldc -483455358
/*    */     //   1066: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*    */     //   1068: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1071: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*    */     //   1074: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*    */     //   1077: astore #59
/*    */     //   1079: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   1082: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*    */     //   1085: astore #60
/*    */     //   1087: aload #59
/*    */     //   1089: aload #60
/*    */     //   1091: aload #56
/*    */     //   1093: bipush #14
/*    */     //   1095: iload #61
/*    */     //   1097: iconst_3
/*    */     //   1098: ishr
/*    */     //   1099: iand
/*    */     //   1100: bipush #112
/*    */     //   1102: iload #61
/*    */     //   1104: iconst_3
/*    */     //   1105: ishr
/*    */     //   1106: iand
/*    */     //   1107: ior
/*    */     //   1108: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   1111: astore #63
/*    */     //   1113: bipush #112
/*    */     //   1115: iload #61
/*    */     //   1117: iconst_3
/*    */     //   1118: ishl
/*    */     //   1119: iand
/*    */     //   1120: istore #64
/*    */     //   1122: nop
/*    */     //   1123: iconst_0
/*    */     //   1124: istore #65
/*    */     //   1126: aload #56
/*    */     //   1128: ldc -1323940314
/*    */     //   1130: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   1132: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1135: aload #56
/*    */     //   1137: iconst_0
/*    */     //   1138: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   1141: istore #67
/*    */     //   1143: aload #56
/*    */     //   1145: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   1150: astore #68
/*    */     //   1152: aload #56
/*    */     //   1154: aload #66
/*    */     //   1156: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   1159: astore #69
/*    */     //   1161: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1164: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   1167: astore #70
/*    */     //   1169: bipush #6
/*    */     //   1171: sipush #896
/*    */     //   1174: iload #64
/*    */     //   1176: bipush #6
/*    */     //   1178: ishl
/*    */     //   1179: iand
/*    */     //   1180: ior
/*    */     //   1181: istore #71
/*    */     //   1183: nop
/*    */     //   1184: iconst_0
/*    */     //   1185: istore #72
/*    */     //   1187: aload #56
/*    */     //   1189: ldc -692256719
/*    */     //   1191: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   1193: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1196: aload #56
/*    */     //   1198: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   1203: instanceof androidx/compose/runtime/Applier
/*    */     //   1206: ifne -> 1212
/*    */     //   1209: invokestatic invalidApplier : ()V
/*    */     //   1212: aload #56
/*    */     //   1214: invokeinterface startReusableNode : ()V
/*    */     //   1219: aload #56
/*    */     //   1221: invokeinterface getInserting : ()Z
/*    */     //   1226: ifeq -> 1241
/*    */     //   1229: aload #56
/*    */     //   1231: aload #70
/*    */     //   1233: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   1238: goto -> 1248
/*    */     //   1241: aload #56
/*    */     //   1243: invokeinterface useNode : ()V
/*    */     //   1248: aload #56
/*    */     //   1250: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   1253: astore #73
/*    */     //   1255: iconst_0
/*    */     //   1256: istore #74
/*    */     //   1258: aload #73
/*    */     //   1260: aload #63
/*    */     //   1262: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1265: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1268: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1271: aload #73
/*    */     //   1273: aload #68
/*    */     //   1275: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1278: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1281: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1284: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1287: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1290: astore #75
/*    */     //   1292: iconst_0
/*    */     //   1293: istore #76
/*    */     //   1295: aload #73
/*    */     //   1297: astore #77
/*    */     //   1299: iconst_0
/*    */     //   1300: istore #78
/*    */     //   1302: aload #77
/*    */     //   1304: invokeinterface getInserting : ()Z
/*    */     //   1309: ifne -> 1330
/*    */     //   1312: aload #77
/*    */     //   1314: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   1319: iload #67
/*    */     //   1321: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1324: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   1327: ifne -> 1356
/*    */     //   1330: aload #77
/*    */     //   1332: iload #67
/*    */     //   1334: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1337: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   1342: aload #73
/*    */     //   1344: iload #67
/*    */     //   1346: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1349: aload #75
/*    */     //   1351: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1356: nop
/*    */     //   1357: nop
/*    */     //   1358: nop
/*    */     //   1359: aload #73
/*    */     //   1361: aload #69
/*    */     //   1363: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1366: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1369: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1372: nop
/*    */     //   1373: nop
/*    */     //   1374: aload #56
/*    */     //   1376: bipush #14
/*    */     //   1378: iload #71
/*    */     //   1380: bipush #6
/*    */     //   1382: ishr
/*    */     //   1383: iand
/*    */     //   1384: istore #79
/*    */     //   1386: astore #80
/*    */     //   1388: iconst_0
/*    */     //   1389: istore #81
/*    */     //   1391: aload #80
/*    */     //   1393: ldc -384784025
/*    */     //   1395: ldc 'C88@4444L9:Column.kt#2w3rfo'
/*    */     //   1397: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1400: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*    */     //   1403: aload #80
/*    */     //   1405: bipush #6
/*    */     //   1407: bipush #112
/*    */     //   1409: iload #61
/*    */     //   1411: bipush #6
/*    */     //   1413: ishr
/*    */     //   1414: iand
/*    */     //   1415: ior
/*    */     //   1416: istore #82
/*    */     //   1418: astore #83
/*    */     //   1420: checkcast androidx/compose/foundation/layout/ColumnScope
/*    */     //   1423: astore #84
/*    */     //   1425: iconst_0
/*    */     //   1426: istore #85
/*    */     //   1428: aconst_null
/*    */     //   1429: ldc_w 1558771137
/*    */     //   1432: iconst_1
/*    */     //   1433: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderKt$TaskHeader$1$1$2$1
/*    */     //   1436: dup
/*    */     //   1437: aload_1
/*    */     //   1438: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;)V
/*    */     //   1441: aload #83
/*    */     //   1443: bipush #54
/*    */     //   1445: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   1448: checkcast kotlin/jvm/functions/Function2
/*    */     //   1451: aload #83
/*    */     //   1453: bipush #48
/*    */     //   1455: iconst_1
/*    */     //   1456: invokestatic SelectionContainer : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*    */     //   1459: aload_1
/*    */     //   1460: astore #86
/*    */     //   1462: aload #86
/*    */     //   1464: astore #87
/*    */     //   1466: aload #87
/*    */     //   1468: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$Running
/*    */     //   1471: ifeq -> 1552
/*    */     //   1474: aload #83
/*    */     //   1476: ldc_w 1581218559
/*    */     //   1479: invokeinterface startReplaceGroup : (I)V
/*    */     //   1484: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   1487: checkcast androidx/compose/ui/Modifier
/*    */     //   1490: fconst_0
/*    */     //   1491: bipush #12
/*    */     //   1493: istore #88
/*    */     //   1495: iconst_0
/*    */     //   1496: istore #89
/*    */     //   1498: iload #88
/*    */     //   1500: i2f
/*    */     //   1501: invokestatic constructor-impl : (F)F
/*    */     //   1504: fconst_0
/*    */     //   1505: fconst_0
/*    */     //   1506: bipush #13
/*    */     //   1508: aconst_null
/*    */     //   1509: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   1512: aload #86
/*    */     //   1514: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$Running
/*    */     //   1517: invokevirtual getButton : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*    */     //   1520: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   1523: aload #86
/*    */     //   1525: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$Running
/*    */     //   1528: invokevirtual getButton : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*    */     //   1531: invokevirtual getAction : ()Lkotlin/jvm/functions/Function0;
/*    */     //   1534: aload #83
/*    */     //   1536: bipush #6
/*    */     //   1538: iconst_0
/*    */     //   1539: invokestatic StopButton : (Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*    */     //   1542: aload #83
/*    */     //   1544: invokeinterface endReplaceGroup : ()V
/*    */     //   1549: goto -> 4326
/*    */     //   1552: aload #87
/*    */     //   1554: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$WaitingUserInput
/*    */     //   1557: ifeq -> 2106
/*    */     //   1560: aload #83
/*    */     //   1562: ldc_w 1581390578
/*    */     //   1565: invokeinterface startReplaceGroup : (I)V
/*    */     //   1570: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   1573: checkcast androidx/compose/ui/Modifier
/*    */     //   1576: fconst_0
/*    */     //   1577: bipush #12
/*    */     //   1579: istore #88
/*    */     //   1581: iconst_0
/*    */     //   1582: istore #89
/*    */     //   1584: iload #88
/*    */     //   1586: i2f
/*    */     //   1587: invokestatic constructor-impl : (F)F
/*    */     //   1590: fconst_0
/*    */     //   1591: fconst_0
/*    */     //   1592: bipush #13
/*    */     //   1594: aconst_null
/*    */     //   1595: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   1598: astore #88
/*    */     //   1600: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   1603: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*    */     //   1606: astore #90
/*    */     //   1608: sipush #390
/*    */     //   1611: istore #91
/*    */     //   1613: iconst_0
/*    */     //   1614: istore #92
/*    */     //   1616: aload #83
/*    */     //   1618: ldc 693286680
/*    */     //   1620: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*    */     //   1622: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1625: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*    */     //   1628: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*    */     //   1631: astore #89
/*    */     //   1633: aload #89
/*    */     //   1635: aload #90
/*    */     //   1637: aload #83
/*    */     //   1639: bipush #14
/*    */     //   1641: iload #91
/*    */     //   1643: iconst_3
/*    */     //   1644: ishr
/*    */     //   1645: iand
/*    */     //   1646: bipush #112
/*    */     //   1648: iload #91
/*    */     //   1650: iconst_3
/*    */     //   1651: ishr
/*    */     //   1652: iand
/*    */     //   1653: ior
/*    */     //   1654: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   1657: astore #93
/*    */     //   1659: bipush #112
/*    */     //   1661: iload #91
/*    */     //   1663: iconst_3
/*    */     //   1664: ishl
/*    */     //   1665: iand
/*    */     //   1666: istore #94
/*    */     //   1668: nop
/*    */     //   1669: iconst_0
/*    */     //   1670: istore #95
/*    */     //   1672: aload #83
/*    */     //   1674: ldc -1323940314
/*    */     //   1676: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   1678: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1681: aload #83
/*    */     //   1683: iconst_0
/*    */     //   1684: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   1687: istore #96
/*    */     //   1689: aload #83
/*    */     //   1691: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   1696: astore #97
/*    */     //   1698: aload #83
/*    */     //   1700: aload #88
/*    */     //   1702: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   1705: astore #98
/*    */     //   1707: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1710: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   1713: astore #99
/*    */     //   1715: bipush #6
/*    */     //   1717: sipush #896
/*    */     //   1720: iload #94
/*    */     //   1722: bipush #6
/*    */     //   1724: ishl
/*    */     //   1725: iand
/*    */     //   1726: ior
/*    */     //   1727: istore #100
/*    */     //   1729: nop
/*    */     //   1730: iconst_0
/*    */     //   1731: istore #101
/*    */     //   1733: aload #83
/*    */     //   1735: ldc -692256719
/*    */     //   1737: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   1739: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1742: aload #83
/*    */     //   1744: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   1749: instanceof androidx/compose/runtime/Applier
/*    */     //   1752: ifne -> 1758
/*    */     //   1755: invokestatic invalidApplier : ()V
/*    */     //   1758: aload #83
/*    */     //   1760: invokeinterface startReusableNode : ()V
/*    */     //   1765: aload #83
/*    */     //   1767: invokeinterface getInserting : ()Z
/*    */     //   1772: ifeq -> 1787
/*    */     //   1775: aload #83
/*    */     //   1777: aload #99
/*    */     //   1779: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   1784: goto -> 1794
/*    */     //   1787: aload #83
/*    */     //   1789: invokeinterface useNode : ()V
/*    */     //   1794: aload #83
/*    */     //   1796: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   1799: astore #102
/*    */     //   1801: iconst_0
/*    */     //   1802: istore #103
/*    */     //   1804: aload #102
/*    */     //   1806: aload #93
/*    */     //   1808: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1811: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1814: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1817: aload #102
/*    */     //   1819: aload #97
/*    */     //   1821: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1824: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1827: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1830: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1833: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1836: astore #104
/*    */     //   1838: iconst_0
/*    */     //   1839: istore #105
/*    */     //   1841: aload #102
/*    */     //   1843: astore #106
/*    */     //   1845: iconst_0
/*    */     //   1846: istore #107
/*    */     //   1848: aload #106
/*    */     //   1850: invokeinterface getInserting : ()Z
/*    */     //   1855: ifne -> 1876
/*    */     //   1858: aload #106
/*    */     //   1860: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   1865: iload #96
/*    */     //   1867: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1870: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   1873: ifne -> 1902
/*    */     //   1876: aload #106
/*    */     //   1878: iload #96
/*    */     //   1880: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1883: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   1888: aload #102
/*    */     //   1890: iload #96
/*    */     //   1892: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1895: aload #104
/*    */     //   1897: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1902: nop
/*    */     //   1903: nop
/*    */     //   1904: nop
/*    */     //   1905: aload #102
/*    */     //   1907: aload #98
/*    */     //   1909: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1912: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1915: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1918: nop
/*    */     //   1919: nop
/*    */     //   1920: aload #83
/*    */     //   1922: bipush #14
/*    */     //   1924: iload #100
/*    */     //   1926: bipush #6
/*    */     //   1928: ishr
/*    */     //   1929: iand
/*    */     //   1930: istore #108
/*    */     //   1932: astore #109
/*    */     //   1934: iconst_0
/*    */     //   1935: istore #110
/*    */     //   1937: aload #109
/*    */     //   1939: ldc -407840262
/*    */     //   1941: ldc 'C101@5126L9:Row.kt#2w3rfo'
/*    */     //   1943: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1946: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*    */     //   1949: aload #109
/*    */     //   1951: bipush #6
/*    */     //   1953: bipush #112
/*    */     //   1955: iload #91
/*    */     //   1957: bipush #6
/*    */     //   1959: ishr
/*    */     //   1960: iand
/*    */     //   1961: ior
/*    */     //   1962: istore #111
/*    */     //   1964: astore #112
/*    */     //   1966: checkcast androidx/compose/foundation/layout/RowScope
/*    */     //   1969: astore #113
/*    */     //   1971: iconst_0
/*    */     //   1972: istore #114
/*    */     //   1974: aload #112
/*    */     //   1976: iconst_0
/*    */     //   1977: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*    */     //   1980: invokevirtual getPauseStateIcon : ()Lorg/jetbrains/jewel/ui/icon/PathIconKey;
/*    */     //   1983: checkcast org/jetbrains/jewel/ui/icon/IconKey
/*    */     //   1986: aconst_null
/*    */     //   1987: aconst_null
/*    */     //   1988: aconst_null
/*    */     //   1989: lconst_0
/*    */     //   1990: iconst_0
/*    */     //   1991: anewarray org/jetbrains/jewel/ui/painter/PainterHint
/*    */     //   1994: aload #112
/*    */     //   1996: bipush #48
/*    */     //   1998: getstatic org/jetbrains/jewel/ui/icon/PathIconKey.$stable : I
/*    */     //   2001: ior
/*    */     //   2002: bipush #28
/*    */     //   2004: invokestatic Icon-FHprtrg : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V
/*    */     //   2007: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   2010: checkcast androidx/compose/ui/Modifier
/*    */     //   2013: bipush #10
/*    */     //   2015: istore #115
/*    */     //   2017: iconst_0
/*    */     //   2018: istore #116
/*    */     //   2020: iload #115
/*    */     //   2022: i2f
/*    */     //   2023: invokestatic constructor-impl : (F)F
/*    */     //   2026: fconst_0
/*    */     //   2027: fconst_0
/*    */     //   2028: fconst_0
/*    */     //   2029: bipush #14
/*    */     //   2031: aconst_null
/*    */     //   2032: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   2035: aload #86
/*    */     //   2037: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$WaitingUserInput
/*    */     //   2040: invokevirtual getButton : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*    */     //   2043: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   2046: aload #86
/*    */     //   2048: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$WaitingUserInput
/*    */     //   2051: invokevirtual getButton : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*    */     //   2054: invokevirtual getAction : ()Lkotlin/jvm/functions/Function0;
/*    */     //   2057: aload #112
/*    */     //   2059: bipush #6
/*    */     //   2061: iconst_0
/*    */     //   2062: invokestatic StopButton : (Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*    */     //   2065: nop
/*    */     //   2066: aload #109
/*    */     //   2068: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   2071: aload #83
/*    */     //   2073: invokeinterface endNode : ()V
/*    */     //   2078: aload #83
/*    */     //   2080: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   2083: nop
/*    */     //   2084: aload #83
/*    */     //   2086: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   2089: nop
/*    */     //   2090: aload #83
/*    */     //   2092: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   2095: nop
/*    */     //   2096: aload #83
/*    */     //   2098: invokeinterface endReplaceGroup : ()V
/*    */     //   2103: goto -> 4326
/*    */     //   2106: aload #87
/*    */     //   2108: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$WaitingSmartMode
/*    */     //   2111: ifeq -> 2192
/*    */     //   2114: aload #83
/*    */     //   2116: ldc_w 1581723487
/*    */     //   2119: invokeinterface startReplaceGroup : (I)V
/*    */     //   2124: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   2127: checkcast androidx/compose/ui/Modifier
/*    */     //   2130: fconst_0
/*    */     //   2131: bipush #12
/*    */     //   2133: istore #88
/*    */     //   2135: iconst_0
/*    */     //   2136: istore #89
/*    */     //   2138: iload #88
/*    */     //   2140: i2f
/*    */     //   2141: invokestatic constructor-impl : (F)F
/*    */     //   2144: fconst_0
/*    */     //   2145: fconst_0
/*    */     //   2146: bipush #13
/*    */     //   2148: aconst_null
/*    */     //   2149: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   2152: aload #86
/*    */     //   2154: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$WaitingSmartMode
/*    */     //   2157: invokevirtual getButton : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*    */     //   2160: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   2163: aload #86
/*    */     //   2165: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$WaitingSmartMode
/*    */     //   2168: invokevirtual getButton : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*    */     //   2171: invokevirtual getAction : ()Lkotlin/jvm/functions/Function0;
/*    */     //   2174: aload #83
/*    */     //   2176: bipush #6
/*    */     //   2178: iconst_0
/*    */     //   2179: invokestatic StopButton : (Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*    */     //   2182: aload #83
/*    */     //   2184: invokeinterface endReplaceGroup : ()V
/*    */     //   2189: goto -> 4326
/*    */     //   2192: aload #87
/*    */     //   2194: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$Terminal
/*    */     //   2197: ifeq -> 3284
/*    */     //   2200: aload #83
/*    */     //   2202: ldc_w 1581905302
/*    */     //   2205: invokeinterface startReplaceGroup : (I)V
/*    */     //   2210: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   2213: checkcast androidx/compose/ui/Modifier
/*    */     //   2216: fconst_0
/*    */     //   2217: bipush #12
/*    */     //   2219: istore #88
/*    */     //   2221: iconst_0
/*    */     //   2222: istore #89
/*    */     //   2224: iload #88
/*    */     //   2226: i2f
/*    */     //   2227: invokestatic constructor-impl : (F)F
/*    */     //   2230: fconst_0
/*    */     //   2231: fconst_0
/*    */     //   2232: bipush #13
/*    */     //   2234: aconst_null
/*    */     //   2235: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   2238: astore #88
/*    */     //   2240: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   2243: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*    */     //   2246: astore #90
/*    */     //   2248: sipush #390
/*    */     //   2251: istore #91
/*    */     //   2253: iconst_0
/*    */     //   2254: istore #92
/*    */     //   2256: aload #83
/*    */     //   2258: ldc 693286680
/*    */     //   2260: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*    */     //   2262: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   2265: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*    */     //   2268: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*    */     //   2271: astore #89
/*    */     //   2273: aload #89
/*    */     //   2275: aload #90
/*    */     //   2277: aload #83
/*    */     //   2279: bipush #14
/*    */     //   2281: iload #91
/*    */     //   2283: iconst_3
/*    */     //   2284: ishr
/*    */     //   2285: iand
/*    */     //   2286: bipush #112
/*    */     //   2288: iload #91
/*    */     //   2290: iconst_3
/*    */     //   2291: ishr
/*    */     //   2292: iand
/*    */     //   2293: ior
/*    */     //   2294: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   2297: astore #93
/*    */     //   2299: bipush #112
/*    */     //   2301: iload #91
/*    */     //   2303: iconst_3
/*    */     //   2304: ishl
/*    */     //   2305: iand
/*    */     //   2306: istore #94
/*    */     //   2308: nop
/*    */     //   2309: iconst_0
/*    */     //   2310: istore #95
/*    */     //   2312: aload #83
/*    */     //   2314: ldc -1323940314
/*    */     //   2316: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   2318: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   2321: aload #83
/*    */     //   2323: iconst_0
/*    */     //   2324: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   2327: istore #96
/*    */     //   2329: aload #83
/*    */     //   2331: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   2336: astore #97
/*    */     //   2338: aload #83
/*    */     //   2340: aload #88
/*    */     //   2342: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   2345: astore #98
/*    */     //   2347: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   2350: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   2353: astore #99
/*    */     //   2355: bipush #6
/*    */     //   2357: sipush #896
/*    */     //   2360: iload #94
/*    */     //   2362: bipush #6
/*    */     //   2364: ishl
/*    */     //   2365: iand
/*    */     //   2366: ior
/*    */     //   2367: istore #100
/*    */     //   2369: nop
/*    */     //   2370: iconst_0
/*    */     //   2371: istore #101
/*    */     //   2373: aload #83
/*    */     //   2375: ldc -692256719
/*    */     //   2377: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   2379: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   2382: aload #83
/*    */     //   2384: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   2389: instanceof androidx/compose/runtime/Applier
/*    */     //   2392: ifne -> 2398
/*    */     //   2395: invokestatic invalidApplier : ()V
/*    */     //   2398: aload #83
/*    */     //   2400: invokeinterface startReusableNode : ()V
/*    */     //   2405: aload #83
/*    */     //   2407: invokeinterface getInserting : ()Z
/*    */     //   2412: ifeq -> 2427
/*    */     //   2415: aload #83
/*    */     //   2417: aload #99
/*    */     //   2419: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   2424: goto -> 2434
/*    */     //   2427: aload #83
/*    */     //   2429: invokeinterface useNode : ()V
/*    */     //   2434: aload #83
/*    */     //   2436: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   2439: astore #102
/*    */     //   2441: iconst_0
/*    */     //   2442: istore #103
/*    */     //   2444: aload #102
/*    */     //   2446: aload #93
/*    */     //   2448: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   2451: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   2454: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   2457: aload #102
/*    */     //   2459: aload #97
/*    */     //   2461: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   2464: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   2467: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   2470: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   2473: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   2476: astore #104
/*    */     //   2478: iconst_0
/*    */     //   2479: istore #105
/*    */     //   2481: aload #102
/*    */     //   2483: astore #106
/*    */     //   2485: iconst_0
/*    */     //   2486: istore #107
/*    */     //   2488: aload #106
/*    */     //   2490: invokeinterface getInserting : ()Z
/*    */     //   2495: ifne -> 2516
/*    */     //   2498: aload #106
/*    */     //   2500: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   2505: iload #96
/*    */     //   2507: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   2510: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   2513: ifne -> 2542
/*    */     //   2516: aload #106
/*    */     //   2518: iload #96
/*    */     //   2520: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   2523: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   2528: aload #102
/*    */     //   2530: iload #96
/*    */     //   2532: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   2535: aload #104
/*    */     //   2537: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   2542: nop
/*    */     //   2543: nop
/*    */     //   2544: nop
/*    */     //   2545: aload #102
/*    */     //   2547: aload #98
/*    */     //   2549: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   2552: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   2555: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   2558: nop
/*    */     //   2559: nop
/*    */     //   2560: aload #83
/*    */     //   2562: bipush #14
/*    */     //   2564: iload #100
/*    */     //   2566: bipush #6
/*    */     //   2568: ishr
/*    */     //   2569: iand
/*    */     //   2570: istore #108
/*    */     //   2572: astore #109
/*    */     //   2574: iconst_0
/*    */     //   2575: istore #110
/*    */     //   2577: aload #109
/*    */     //   2579: ldc -407840262
/*    */     //   2581: ldc 'C101@5126L9:Row.kt#2w3rfo'
/*    */     //   2583: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   2586: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*    */     //   2589: aload #109
/*    */     //   2591: bipush #6
/*    */     //   2593: bipush #112
/*    */     //   2595: iload #91
/*    */     //   2597: bipush #6
/*    */     //   2599: ishr
/*    */     //   2600: iand
/*    */     //   2601: ior
/*    */     //   2602: istore #111
/*    */     //   2604: astore #112
/*    */     //   2606: checkcast androidx/compose/foundation/layout/RowScope
/*    */     //   2609: astore #113
/*    */     //   2611: iconst_0
/*    */     //   2612: istore #114
/*    */     //   2614: aload #86
/*    */     //   2616: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$Terminal
/*    */     //   2619: invokevirtual getIconState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*    */     //   2622: aload #112
/*    */     //   2624: iconst_0
/*    */     //   2625: invokestatic getStateIcon : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/icon/IconKey;
/*    */     //   2628: astore #115
/*    */     //   2630: aload #115
/*    */     //   2632: ldc_w 'Task state'
/*    */     //   2635: aload #86
/*    */     //   2637: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$Terminal
/*    */     //   2640: invokevirtual getIconModifier : ()Landroidx/compose/ui/Modifier;
/*    */     //   2643: aconst_null
/*    */     //   2644: lconst_0
/*    */     //   2645: iconst_0
/*    */     //   2646: anewarray org/jetbrains/jewel/ui/painter/PainterHint
/*    */     //   2649: aload #112
/*    */     //   2651: bipush #48
/*    */     //   2653: bipush #24
/*    */     //   2655: invokestatic Icon-FHprtrg : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V
/*    */     //   2658: aload #86
/*    */     //   2660: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$Terminal
/*    */     //   2663: invokevirtual getDoneButton : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*    */     //   2666: astore #116
/*    */     //   2668: aload #112
/*    */     //   2670: ldc_w 1437230494
/*    */     //   2673: invokeinterface startReplaceGroup : (I)V
/*    */     //   2678: aload #116
/*    */     //   2680: ifnull -> 2729
/*    */     //   2683: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   2686: checkcast androidx/compose/ui/Modifier
/*    */     //   2689: fconst_0
/*    */     //   2690: fconst_0
/*    */     //   2691: bipush #10
/*    */     //   2693: istore #117
/*    */     //   2695: iconst_0
/*    */     //   2696: istore #118
/*    */     //   2698: iload #117
/*    */     //   2700: i2f
/*    */     //   2701: invokestatic constructor-impl : (F)F
/*    */     //   2704: fconst_0
/*    */     //   2705: bipush #11
/*    */     //   2707: aconst_null
/*    */     //   2708: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   2711: aload #116
/*    */     //   2713: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   2716: aload #116
/*    */     //   2718: invokevirtual getAction : ()Lkotlin/jvm/functions/Function0;
/*    */     //   2721: aload #112
/*    */     //   2723: bipush #6
/*    */     //   2725: iconst_0
/*    */     //   2726: invokestatic DoneButton : (Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*    */     //   2729: aload #112
/*    */     //   2731: invokeinterface endReplaceGroup : ()V
/*    */     //   2736: aload #86
/*    */     //   2738: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$Terminal
/*    */     //   2741: invokevirtual getStartAgainButton : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*    */     //   2744: astore #117
/*    */     //   2746: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   2749: checkcast androidx/compose/ui/Modifier
/*    */     //   2752: fconst_0
/*    */     //   2753: fconst_0
/*    */     //   2754: bipush #10
/*    */     //   2756: istore #118
/*    */     //   2758: iconst_0
/*    */     //   2759: istore #119
/*    */     //   2761: iload #118
/*    */     //   2763: i2f
/*    */     //   2764: invokestatic constructor-impl : (F)F
/*    */     //   2767: fconst_0
/*    */     //   2768: bipush #11
/*    */     //   2770: aconst_null
/*    */     //   2771: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   2774: aload #117
/*    */     //   2776: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   2779: aload #117
/*    */     //   2781: invokevirtual getAction : ()Lkotlin/jvm/functions/Function0;
/*    */     //   2784: aload #112
/*    */     //   2786: bipush #6
/*    */     //   2788: iconst_0
/*    */     //   2789: invokestatic RestartButton : (Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*    */     //   2792: aload #86
/*    */     //   2794: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$Terminal
/*    */     //   2797: invokevirtual getDeclineButton : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*    */     //   2800: astore #118
/*    */     //   2802: aload #112
/*    */     //   2804: ldc_w 1437243084
/*    */     //   2807: invokeinterface startReplaceGroup : (I)V
/*    */     //   2812: aload #118
/*    */     //   2814: ifnull -> 3236
/*    */     //   2817: iconst_0
/*    */     //   2818: istore #120
/*    */     //   2820: nop
/*    */     //   2821: iconst_0
/*    */     //   2822: istore #121
/*    */     //   2824: aload #112
/*    */     //   2826: ldc_w 733328855
/*    */     //   2829: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*    */     //   2832: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   2835: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   2838: checkcast androidx/compose/ui/Modifier
/*    */     //   2841: astore #119
/*    */     //   2843: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   2846: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*    */     //   2849: astore #122
/*    */     //   2851: iconst_0
/*    */     //   2852: istore #123
/*    */     //   2854: aload #122
/*    */     //   2856: iload #123
/*    */     //   2858: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   2861: astore #124
/*    */     //   2863: bipush #112
/*    */     //   2865: iload #120
/*    */     //   2867: iconst_3
/*    */     //   2868: ishl
/*    */     //   2869: iand
/*    */     //   2870: istore #125
/*    */     //   2872: nop
/*    */     //   2873: iconst_0
/*    */     //   2874: istore #126
/*    */     //   2876: aload #112
/*    */     //   2878: ldc -1323940314
/*    */     //   2880: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   2882: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   2885: aload #112
/*    */     //   2887: iconst_0
/*    */     //   2888: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   2891: istore #127
/*    */     //   2893: aload #112
/*    */     //   2895: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   2900: astore #128
/*    */     //   2902: aload #112
/*    */     //   2904: aload #119
/*    */     //   2906: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   2909: astore #129
/*    */     //   2911: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   2914: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   2917: astore #130
/*    */     //   2919: bipush #6
/*    */     //   2921: sipush #896
/*    */     //   2924: iload #125
/*    */     //   2926: bipush #6
/*    */     //   2928: ishl
/*    */     //   2929: iand
/*    */     //   2930: ior
/*    */     //   2931: istore #131
/*    */     //   2933: nop
/*    */     //   2934: iconst_0
/*    */     //   2935: istore #132
/*    */     //   2937: aload #112
/*    */     //   2939: ldc -692256719
/*    */     //   2941: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   2943: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   2946: aload #112
/*    */     //   2948: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   2953: instanceof androidx/compose/runtime/Applier
/*    */     //   2956: ifne -> 2962
/*    */     //   2959: invokestatic invalidApplier : ()V
/*    */     //   2962: aload #112
/*    */     //   2964: invokeinterface startReusableNode : ()V
/*    */     //   2969: aload #112
/*    */     //   2971: invokeinterface getInserting : ()Z
/*    */     //   2976: ifeq -> 2991
/*    */     //   2979: aload #112
/*    */     //   2981: aload #130
/*    */     //   2983: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   2988: goto -> 2998
/*    */     //   2991: aload #112
/*    */     //   2993: invokeinterface useNode : ()V
/*    */     //   2998: aload #112
/*    */     //   3000: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   3003: astore #133
/*    */     //   3005: iconst_0
/*    */     //   3006: istore #134
/*    */     //   3008: aload #133
/*    */     //   3010: aload #124
/*    */     //   3012: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   3015: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   3018: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   3021: aload #133
/*    */     //   3023: aload #128
/*    */     //   3025: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   3028: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   3031: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   3034: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   3037: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   3040: astore #135
/*    */     //   3042: iconst_0
/*    */     //   3043: istore #136
/*    */     //   3045: aload #133
/*    */     //   3047: astore #137
/*    */     //   3049: iconst_0
/*    */     //   3050: istore #138
/*    */     //   3052: aload #137
/*    */     //   3054: invokeinterface getInserting : ()Z
/*    */     //   3059: ifne -> 3080
/*    */     //   3062: aload #137
/*    */     //   3064: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   3069: iload #127
/*    */     //   3071: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   3074: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   3077: ifne -> 3106
/*    */     //   3080: aload #137
/*    */     //   3082: iload #127
/*    */     //   3084: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   3087: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   3092: aload #133
/*    */     //   3094: iload #127
/*    */     //   3096: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   3099: aload #135
/*    */     //   3101: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   3106: nop
/*    */     //   3107: nop
/*    */     //   3108: nop
/*    */     //   3109: aload #133
/*    */     //   3111: aload #129
/*    */     //   3113: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   3116: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   3119: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   3122: nop
/*    */     //   3123: nop
/*    */     //   3124: aload #112
/*    */     //   3126: bipush #14
/*    */     //   3128: iload #131
/*    */     //   3130: bipush #6
/*    */     //   3132: ishr
/*    */     //   3133: iand
/*    */     //   3134: istore #139
/*    */     //   3136: astore #140
/*    */     //   3138: iconst_0
/*    */     //   3139: istore #141
/*    */     //   3141: aload #140
/*    */     //   3143: ldc_w -2146769399
/*    */     //   3146: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*    */     //   3149: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   3152: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*    */     //   3155: aload #140
/*    */     //   3157: bipush #6
/*    */     //   3159: bipush #112
/*    */     //   3161: iload #120
/*    */     //   3163: bipush #6
/*    */     //   3165: ishr
/*    */     //   3166: iand
/*    */     //   3167: ior
/*    */     //   3168: istore #142
/*    */     //   3170: astore #143
/*    */     //   3172: checkcast androidx/compose/foundation/layout/BoxScope
/*    */     //   3175: astore #144
/*    */     //   3177: iconst_0
/*    */     //   3178: istore #145
/*    */     //   3180: aload #118
/*    */     //   3182: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   3185: aload #118
/*    */     //   3187: invokevirtual getAction : ()Lkotlin/jvm/functions/Function0;
/*    */     //   3190: aconst_null
/*    */     //   3191: iconst_0
/*    */     //   3192: aconst_null
/*    */     //   3193: iconst_0
/*    */     //   3194: aconst_null
/*    */     //   3195: aconst_null
/*    */     //   3196: aload #143
/*    */     //   3198: iconst_0
/*    */     //   3199: sipush #252
/*    */     //   3202: invokestatic Link-kye4rC8 : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V
/*    */     //   3205: nop
/*    */     //   3206: aload #140
/*    */     //   3208: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   3211: aload #112
/*    */     //   3213: invokeinterface endNode : ()V
/*    */     //   3218: aload #112
/*    */     //   3220: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   3223: nop
/*    */     //   3224: aload #112
/*    */     //   3226: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   3229: nop
/*    */     //   3230: aload #112
/*    */     //   3232: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   3235: nop
/*    */     //   3236: aload #112
/*    */     //   3238: invokeinterface endReplaceGroup : ()V
/*    */     //   3243: nop
/*    */     //   3244: aload #109
/*    */     //   3246: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   3249: aload #83
/*    */     //   3251: invokeinterface endNode : ()V
/*    */     //   3256: aload #83
/*    */     //   3258: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   3261: nop
/*    */     //   3262: aload #83
/*    */     //   3264: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   3267: nop
/*    */     //   3268: aload #83
/*    */     //   3270: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   3273: nop
/*    */     //   3274: aload #83
/*    */     //   3276: invokeinterface endReplaceGroup : ()V
/*    */     //   3281: goto -> 4326
/*    */     //   3284: aload #87
/*    */     //   3286: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$Failed
/*    */     //   3289: ifeq -> 4276
/*    */     //   3292: aload #83
/*    */     //   3294: ldc_w 1582793483
/*    */     //   3297: invokeinterface startReplaceGroup : (I)V
/*    */     //   3302: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   3305: checkcast androidx/compose/ui/Modifier
/*    */     //   3308: fconst_0
/*    */     //   3309: bipush #12
/*    */     //   3311: istore #88
/*    */     //   3313: iconst_0
/*    */     //   3314: istore #89
/*    */     //   3316: iload #88
/*    */     //   3318: i2f
/*    */     //   3319: invokestatic constructor-impl : (F)F
/*    */     //   3322: fconst_0
/*    */     //   3323: fconst_0
/*    */     //   3324: bipush #13
/*    */     //   3326: aconst_null
/*    */     //   3327: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   3330: astore #88
/*    */     //   3332: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   3335: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*    */     //   3338: astore #90
/*    */     //   3340: sipush #390
/*    */     //   3343: istore #91
/*    */     //   3345: iconst_0
/*    */     //   3346: istore #92
/*    */     //   3348: aload #83
/*    */     //   3350: ldc 693286680
/*    */     //   3352: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*    */     //   3354: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   3357: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*    */     //   3360: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*    */     //   3363: astore #89
/*    */     //   3365: aload #89
/*    */     //   3367: aload #90
/*    */     //   3369: aload #83
/*    */     //   3371: bipush #14
/*    */     //   3373: iload #91
/*    */     //   3375: iconst_3
/*    */     //   3376: ishr
/*    */     //   3377: iand
/*    */     //   3378: bipush #112
/*    */     //   3380: iload #91
/*    */     //   3382: iconst_3
/*    */     //   3383: ishr
/*    */     //   3384: iand
/*    */     //   3385: ior
/*    */     //   3386: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   3389: astore #93
/*    */     //   3391: bipush #112
/*    */     //   3393: iload #91
/*    */     //   3395: iconst_3
/*    */     //   3396: ishl
/*    */     //   3397: iand
/*    */     //   3398: istore #94
/*    */     //   3400: nop
/*    */     //   3401: iconst_0
/*    */     //   3402: istore #95
/*    */     //   3404: aload #83
/*    */     //   3406: ldc -1323940314
/*    */     //   3408: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   3410: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   3413: aload #83
/*    */     //   3415: iconst_0
/*    */     //   3416: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   3419: istore #96
/*    */     //   3421: aload #83
/*    */     //   3423: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   3428: astore #97
/*    */     //   3430: aload #83
/*    */     //   3432: aload #88
/*    */     //   3434: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   3437: astore #98
/*    */     //   3439: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   3442: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   3445: astore #99
/*    */     //   3447: bipush #6
/*    */     //   3449: sipush #896
/*    */     //   3452: iload #94
/*    */     //   3454: bipush #6
/*    */     //   3456: ishl
/*    */     //   3457: iand
/*    */     //   3458: ior
/*    */     //   3459: istore #100
/*    */     //   3461: nop
/*    */     //   3462: iconst_0
/*    */     //   3463: istore #101
/*    */     //   3465: aload #83
/*    */     //   3467: ldc -692256719
/*    */     //   3469: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   3471: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   3474: aload #83
/*    */     //   3476: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   3481: instanceof androidx/compose/runtime/Applier
/*    */     //   3484: ifne -> 3490
/*    */     //   3487: invokestatic invalidApplier : ()V
/*    */     //   3490: aload #83
/*    */     //   3492: invokeinterface startReusableNode : ()V
/*    */     //   3497: aload #83
/*    */     //   3499: invokeinterface getInserting : ()Z
/*    */     //   3504: ifeq -> 3519
/*    */     //   3507: aload #83
/*    */     //   3509: aload #99
/*    */     //   3511: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   3516: goto -> 3526
/*    */     //   3519: aload #83
/*    */     //   3521: invokeinterface useNode : ()V
/*    */     //   3526: aload #83
/*    */     //   3528: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   3531: astore #102
/*    */     //   3533: iconst_0
/*    */     //   3534: istore #103
/*    */     //   3536: aload #102
/*    */     //   3538: aload #93
/*    */     //   3540: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   3543: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   3546: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   3549: aload #102
/*    */     //   3551: aload #97
/*    */     //   3553: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   3556: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   3559: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   3562: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   3565: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   3568: astore #104
/*    */     //   3570: iconst_0
/*    */     //   3571: istore #105
/*    */     //   3573: aload #102
/*    */     //   3575: astore #106
/*    */     //   3577: iconst_0
/*    */     //   3578: istore #107
/*    */     //   3580: aload #106
/*    */     //   3582: invokeinterface getInserting : ()Z
/*    */     //   3587: ifne -> 3608
/*    */     //   3590: aload #106
/*    */     //   3592: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   3597: iload #96
/*    */     //   3599: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   3602: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   3605: ifne -> 3634
/*    */     //   3608: aload #106
/*    */     //   3610: iload #96
/*    */     //   3612: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   3615: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   3620: aload #102
/*    */     //   3622: iload #96
/*    */     //   3624: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   3627: aload #104
/*    */     //   3629: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   3634: nop
/*    */     //   3635: nop
/*    */     //   3636: nop
/*    */     //   3637: aload #102
/*    */     //   3639: aload #98
/*    */     //   3641: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   3644: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   3647: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   3650: nop
/*    */     //   3651: nop
/*    */     //   3652: aload #83
/*    */     //   3654: bipush #14
/*    */     //   3656: iload #100
/*    */     //   3658: bipush #6
/*    */     //   3660: ishr
/*    */     //   3661: iand
/*    */     //   3662: istore #108
/*    */     //   3664: astore #109
/*    */     //   3666: iconst_0
/*    */     //   3667: istore #110
/*    */     //   3669: aload #109
/*    */     //   3671: ldc -407840262
/*    */     //   3673: ldc 'C101@5126L9:Row.kt#2w3rfo'
/*    */     //   3675: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   3678: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*    */     //   3681: aload #109
/*    */     //   3683: bipush #6
/*    */     //   3685: bipush #112
/*    */     //   3687: iload #91
/*    */     //   3689: bipush #6
/*    */     //   3691: ishr
/*    */     //   3692: iand
/*    */     //   3693: ior
/*    */     //   3694: istore #111
/*    */     //   3696: astore #112
/*    */     //   3698: checkcast androidx/compose/foundation/layout/RowScope
/*    */     //   3701: astore #113
/*    */     //   3703: iconst_0
/*    */     //   3704: istore #114
/*    */     //   3706: aload #86
/*    */     //   3708: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$Failed
/*    */     //   3711: invokevirtual getIconState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*    */     //   3714: aload #112
/*    */     //   3716: iconst_0
/*    */     //   3717: invokestatic getStateIcon : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/icon/IconKey;
/*    */     //   3720: astore #115
/*    */     //   3722: aload #115
/*    */     //   3724: ldc_w 'Task state'
/*    */     //   3727: aload #86
/*    */     //   3729: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$Failed
/*    */     //   3732: invokevirtual getIconModifier : ()Landroidx/compose/ui/Modifier;
/*    */     //   3735: aconst_null
/*    */     //   3736: lconst_0
/*    */     //   3737: iconst_0
/*    */     //   3738: anewarray org/jetbrains/jewel/ui/painter/PainterHint
/*    */     //   3741: aload #112
/*    */     //   3743: bipush #48
/*    */     //   3745: bipush #24
/*    */     //   3747: invokestatic Icon-FHprtrg : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V
/*    */     //   3750: aload #86
/*    */     //   3752: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$Failed
/*    */     //   3755: invokevirtual getStartAgainButton : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*    */     //   3758: astore #116
/*    */     //   3760: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   3763: checkcast androidx/compose/ui/Modifier
/*    */     //   3766: fconst_0
/*    */     //   3767: fconst_0
/*    */     //   3768: bipush #10
/*    */     //   3770: istore #117
/*    */     //   3772: iconst_0
/*    */     //   3773: istore #118
/*    */     //   3775: iload #117
/*    */     //   3777: i2f
/*    */     //   3778: invokestatic constructor-impl : (F)F
/*    */     //   3781: fconst_0
/*    */     //   3782: bipush #11
/*    */     //   3784: aconst_null
/*    */     //   3785: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   3788: aload #116
/*    */     //   3790: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   3793: aload #116
/*    */     //   3795: invokevirtual getAction : ()Lkotlin/jvm/functions/Function0;
/*    */     //   3798: aload #112
/*    */     //   3800: bipush #6
/*    */     //   3802: iconst_0
/*    */     //   3803: invokestatic RestartButton : (Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*    */     //   3806: iconst_0
/*    */     //   3807: istore #119
/*    */     //   3809: nop
/*    */     //   3810: iconst_0
/*    */     //   3811: istore #120
/*    */     //   3813: aload #112
/*    */     //   3815: ldc_w 733328855
/*    */     //   3818: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*    */     //   3821: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   3824: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   3827: checkcast androidx/compose/ui/Modifier
/*    */     //   3830: astore #117
/*    */     //   3832: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   3835: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*    */     //   3838: astore #118
/*    */     //   3840: iconst_0
/*    */     //   3841: istore #121
/*    */     //   3843: aload #118
/*    */     //   3845: iload #121
/*    */     //   3847: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   3850: astore #122
/*    */     //   3852: bipush #112
/*    */     //   3854: iload #119
/*    */     //   3856: iconst_3
/*    */     //   3857: ishl
/*    */     //   3858: iand
/*    */     //   3859: istore #123
/*    */     //   3861: nop
/*    */     //   3862: iconst_0
/*    */     //   3863: istore #124
/*    */     //   3865: aload #112
/*    */     //   3867: ldc -1323940314
/*    */     //   3869: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   3871: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   3874: aload #112
/*    */     //   3876: iconst_0
/*    */     //   3877: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   3880: istore #125
/*    */     //   3882: aload #112
/*    */     //   3884: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   3889: astore #126
/*    */     //   3891: aload #112
/*    */     //   3893: aload #117
/*    */     //   3895: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   3898: astore #127
/*    */     //   3900: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   3903: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   3906: astore #128
/*    */     //   3908: bipush #6
/*    */     //   3910: sipush #896
/*    */     //   3913: iload #123
/*    */     //   3915: bipush #6
/*    */     //   3917: ishl
/*    */     //   3918: iand
/*    */     //   3919: ior
/*    */     //   3920: istore #129
/*    */     //   3922: nop
/*    */     //   3923: iconst_0
/*    */     //   3924: istore #130
/*    */     //   3926: aload #112
/*    */     //   3928: ldc -692256719
/*    */     //   3930: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   3932: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   3935: aload #112
/*    */     //   3937: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   3942: instanceof androidx/compose/runtime/Applier
/*    */     //   3945: ifne -> 3951
/*    */     //   3948: invokestatic invalidApplier : ()V
/*    */     //   3951: aload #112
/*    */     //   3953: invokeinterface startReusableNode : ()V
/*    */     //   3958: aload #112
/*    */     //   3960: invokeinterface getInserting : ()Z
/*    */     //   3965: ifeq -> 3980
/*    */     //   3968: aload #112
/*    */     //   3970: aload #128
/*    */     //   3972: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   3977: goto -> 3987
/*    */     //   3980: aload #112
/*    */     //   3982: invokeinterface useNode : ()V
/*    */     //   3987: aload #112
/*    */     //   3989: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   3992: astore #131
/*    */     //   3994: iconst_0
/*    */     //   3995: istore #132
/*    */     //   3997: aload #131
/*    */     //   3999: aload #122
/*    */     //   4001: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   4004: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   4007: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   4010: aload #131
/*    */     //   4012: aload #126
/*    */     //   4014: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   4017: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   4020: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   4023: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   4026: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   4029: astore #133
/*    */     //   4031: iconst_0
/*    */     //   4032: istore #134
/*    */     //   4034: aload #131
/*    */     //   4036: astore #135
/*    */     //   4038: iconst_0
/*    */     //   4039: istore #136
/*    */     //   4041: aload #135
/*    */     //   4043: invokeinterface getInserting : ()Z
/*    */     //   4048: ifne -> 4069
/*    */     //   4051: aload #135
/*    */     //   4053: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   4058: iload #125
/*    */     //   4060: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   4063: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   4066: ifne -> 4095
/*    */     //   4069: aload #135
/*    */     //   4071: iload #125
/*    */     //   4073: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   4076: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   4081: aload #131
/*    */     //   4083: iload #125
/*    */     //   4085: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   4088: aload #133
/*    */     //   4090: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   4095: nop
/*    */     //   4096: nop
/*    */     //   4097: nop
/*    */     //   4098: aload #131
/*    */     //   4100: aload #127
/*    */     //   4102: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   4105: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   4108: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   4111: nop
/*    */     //   4112: nop
/*    */     //   4113: aload #112
/*    */     //   4115: bipush #14
/*    */     //   4117: iload #129
/*    */     //   4119: bipush #6
/*    */     //   4121: ishr
/*    */     //   4122: iand
/*    */     //   4123: istore #137
/*    */     //   4125: astore #138
/*    */     //   4127: iconst_0
/*    */     //   4128: istore #139
/*    */     //   4130: aload #138
/*    */     //   4132: ldc_w -2146769399
/*    */     //   4135: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*    */     //   4138: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   4141: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*    */     //   4144: aload #138
/*    */     //   4146: bipush #6
/*    */     //   4148: bipush #112
/*    */     //   4150: iload #119
/*    */     //   4152: bipush #6
/*    */     //   4154: ishr
/*    */     //   4155: iand
/*    */     //   4156: ior
/*    */     //   4157: istore #140
/*    */     //   4159: astore #141
/*    */     //   4161: checkcast androidx/compose/foundation/layout/BoxScope
/*    */     //   4164: astore #142
/*    */     //   4166: iconst_0
/*    */     //   4167: istore #143
/*    */     //   4169: aload #86
/*    */     //   4171: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$Failed
/*    */     //   4174: invokevirtual getReportIssueButton : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*    */     //   4177: astore #144
/*    */     //   4179: aload #144
/*    */     //   4181: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   4184: aload #144
/*    */     //   4186: invokevirtual getAction : ()Lkotlin/jvm/functions/Function0;
/*    */     //   4189: aconst_null
/*    */     //   4190: iconst_0
/*    */     //   4191: aconst_null
/*    */     //   4192: iconst_0
/*    */     //   4193: aconst_null
/*    */     //   4194: aconst_null
/*    */     //   4195: aload #141
/*    */     //   4197: iconst_0
/*    */     //   4198: sipush #252
/*    */     //   4201: invokestatic Link-kye4rC8 : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V
/*    */     //   4204: nop
/*    */     //   4205: aload #138
/*    */     //   4207: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   4210: aload #112
/*    */     //   4212: invokeinterface endNode : ()V
/*    */     //   4217: aload #112
/*    */     //   4219: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   4222: nop
/*    */     //   4223: aload #112
/*    */     //   4225: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   4228: nop
/*    */     //   4229: aload #112
/*    */     //   4231: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   4234: nop
/*    */     //   4235: nop
/*    */     //   4236: aload #109
/*    */     //   4238: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   4241: aload #83
/*    */     //   4243: invokeinterface endNode : ()V
/*    */     //   4248: aload #83
/*    */     //   4250: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   4253: nop
/*    */     //   4254: aload #83
/*    */     //   4256: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   4259: nop
/*    */     //   4260: aload #83
/*    */     //   4262: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   4265: nop
/*    */     //   4266: aload #83
/*    */     //   4268: invokeinterface endReplaceGroup : ()V
/*    */     //   4273: goto -> 4326
/*    */     //   4276: aload #87
/*    */     //   4278: ifnonnull -> 4301
/*    */     //   4281: aload #83
/*    */     //   4283: ldc_w 1583406322
/*    */     //   4286: invokeinterface startReplaceGroup : (I)V
/*    */     //   4291: aload #83
/*    */     //   4293: invokeinterface endReplaceGroup : ()V
/*    */     //   4298: goto -> 4326
/*    */     //   4301: aload #83
/*    */     //   4303: ldc_w 882291442
/*    */     //   4306: invokeinterface startReplaceGroup : (I)V
/*    */     //   4311: aload #83
/*    */     //   4313: invokeinterface endReplaceGroup : ()V
/*    */     //   4318: new kotlin/NoWhenBranchMatchedException
/*    */     //   4321: dup
/*    */     //   4322: invokespecial <init> : ()V
/*    */     //   4325: athrow
/*    */     //   4326: nop
/*    */     //   4327: aload #80
/*    */     //   4329: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   4332: aload #56
/*    */     //   4334: invokeinterface endNode : ()V
/*    */     //   4339: aload #56
/*    */     //   4341: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   4344: nop
/*    */     //   4345: aload #56
/*    */     //   4347: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   4350: nop
/*    */     //   4351: aload #56
/*    */     //   4353: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   4356: nop
/*    */     //   4357: nop
/*    */     //   4358: aload #53
/*    */     //   4360: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   4363: aload #29
/*    */     //   4365: invokeinterface endNode : ()V
/*    */     //   4370: aload #29
/*    */     //   4372: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   4375: nop
/*    */     //   4376: aload #29
/*    */     //   4378: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   4381: nop
/*    */     //   4382: aload #29
/*    */     //   4384: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   4387: nop
/*    */     //   4388: nop
/*    */     //   4389: aload #26
/*    */     //   4391: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   4394: aload_2
/*    */     //   4395: invokeinterface endNode : ()V
/*    */     //   4400: aload_2
/*    */     //   4401: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   4404: nop
/*    */     //   4405: aload_2
/*    */     //   4406: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   4409: nop
/*    */     //   4410: aload_2
/*    */     //   4411: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   4414: nop
/*    */     //   4415: invokestatic isTraceInProgress : ()Z
/*    */     //   4418: ifeq -> 4433
/*    */     //   4421: invokestatic traceEventEnd : ()V
/*    */     //   4424: goto -> 4433
/*    */     //   4427: aload_2
/*    */     //   4428: invokeinterface skipToGroupEnd : ()V
/*    */     //   4433: aload_2
/*    */     //   4434: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   4439: dup
/*    */     //   4440: ifnull -> 4459
/*    */     //   4443: aload_0
/*    */     //   4444: aload_1
/*    */     //   4445: iload_3
/*    */     //   4446: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderViewModel;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;I)Lkotlin/jvm/functions/Function2;
/*    */     //   4451: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   4456: goto -> 4460
/*    */     //   4459: pop
/*    */     //   4460: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #35	-> 6
/*    */     //   #36	-> 109
/*    */     //   #122	-> 124
/*    */     //   #36	-> 130
/*    */     //   #122	-> 136
/*    */     //   #36	-> 142
/*    */     //   #123	-> 161
/*    */     //   #124	-> 164
/*    */     //   #125	-> 172
/*    */     //   #128	-> 180
/*    */     //   #129	-> 214
/*    */     //   #130	-> 223
/*    */     //   #131	-> 228
/*    */     //   #132	-> 234
/*    */     //   #133	-> 242
/*    */     //   #135	-> 249
/*    */     //   #134	-> 271
/*    */     //   #136	-> 280
/*    */     //   #137	-> 283
/*    */     //   #138	-> 299
/*    */     //   #139	-> 304
/*    */     //   #140	-> 314
/*    */     //   #142	-> 325
/*    */     //   #144	-> 330
/*    */     //   #145	-> 339
/*    */     //   #146	-> 352
/*    */     //   #148	-> 365
/*    */     //   #149	-> 376
/*    */     //   #150	-> 383
/*    */     //   #151	-> 411
/*    */     //   #152	-> 423
/*    */     //   #154	-> 437
/*    */     //   #149	-> 438
/*    */     //   #154	-> 439
/*    */     //   #155	-> 440
/*    */     //   #156	-> 453
/*    */     //   #144	-> 454
/*    */     //   #157	-> 455
/*    */     //   #158	-> 477
/*    */     //   #37	-> 511
/*    */     //   #159	-> 521
/*    */     //   #160	-> 524
/*    */     //   #161	-> 532
/*    */     //   #162	-> 540
/*    */     //   #165	-> 548
/*    */     //   #166	-> 583
/*    */     //   #167	-> 593
/*    */     //   #168	-> 599
/*    */     //   #169	-> 606
/*    */     //   #170	-> 615
/*    */     //   #172	-> 622
/*    */     //   #171	-> 644
/*    */     //   #173	-> 654
/*    */     //   #174	-> 657
/*    */     //   #175	-> 675
/*    */     //   #176	-> 680
/*    */     //   #177	-> 692
/*    */     //   #179	-> 704
/*    */     //   #181	-> 709
/*    */     //   #182	-> 719
/*    */     //   #183	-> 732
/*    */     //   #185	-> 745
/*    */     //   #186	-> 756
/*    */     //   #187	-> 763
/*    */     //   #188	-> 791
/*    */     //   #189	-> 803
/*    */     //   #191	-> 817
/*    */     //   #186	-> 818
/*    */     //   #191	-> 819
/*    */     //   #192	-> 820
/*    */     //   #193	-> 833
/*    */     //   #181	-> 834
/*    */     //   #194	-> 835
/*    */     //   #195	-> 858
/*    */     //   #39	-> 911
/*    */     //   #196	-> 915
/*    */     //   #197	-> 927
/*    */     //   #198	-> 943
/*    */     //   #39	-> 946
/*    */     //   #198	-> 952
/*    */     //   #199	-> 954
/*    */     //   #200	-> 963
/*    */     //   #201	-> 968
/*    */     //   #197	-> 970
/*    */     //   #196	-> 971
/*    */     //   #196	-> 972
/*    */     //   #39	-> 973
/*    */     //   #44	-> 990
/*    */     //   #38	-> 1022
/*    */     //   #49	-> 1025
/*    */     //   #202	-> 1038
/*    */     //   #49	-> 1044
/*    */     //   #203	-> 1068
/*    */     //   #204	-> 1071
/*    */     //   #205	-> 1079
/*    */     //   #208	-> 1087
/*    */     //   #209	-> 1122
/*    */     //   #210	-> 1132
/*    */     //   #211	-> 1138
/*    */     //   #212	-> 1145
/*    */     //   #213	-> 1154
/*    */     //   #215	-> 1161
/*    */     //   #214	-> 1183
/*    */     //   #216	-> 1193
/*    */     //   #217	-> 1196
/*    */     //   #218	-> 1214
/*    */     //   #219	-> 1219
/*    */     //   #220	-> 1231
/*    */     //   #222	-> 1243
/*    */     //   #224	-> 1248
/*    */     //   #225	-> 1258
/*    */     //   #226	-> 1271
/*    */     //   #228	-> 1284
/*    */     //   #229	-> 1295
/*    */     //   #230	-> 1302
/*    */     //   #231	-> 1330
/*    */     //   #232	-> 1342
/*    */     //   #234	-> 1356
/*    */     //   #229	-> 1357
/*    */     //   #234	-> 1358
/*    */     //   #235	-> 1359
/*    */     //   #236	-> 1372
/*    */     //   #224	-> 1373
/*    */     //   #237	-> 1374
/*    */     //   #238	-> 1397
/*    */     //   #50	-> 1429
/*    */     //   #62	-> 1459
/*    */     //   #63	-> 1462
/*    */     //   #64	-> 1466
/*    */     //   #65	-> 1484
/*    */     //   #239	-> 1498
/*    */     //   #65	-> 1504
/*    */     //   #64	-> 1542
/*    */     //   #68	-> 1552
/*    */     //   #69	-> 1570
/*    */     //   #240	-> 1584
/*    */     //   #69	-> 1590
/*    */     //   #241	-> 1622
/*    */     //   #242	-> 1625
/*    */     //   #246	-> 1633
/*    */     //   #247	-> 1668
/*    */     //   #248	-> 1678
/*    */     //   #249	-> 1684
/*    */     //   #250	-> 1691
/*    */     //   #251	-> 1700
/*    */     //   #253	-> 1707
/*    */     //   #252	-> 1729
/*    */     //   #254	-> 1739
/*    */     //   #255	-> 1742
/*    */     //   #256	-> 1760
/*    */     //   #257	-> 1765
/*    */     //   #258	-> 1777
/*    */     //   #260	-> 1789
/*    */     //   #262	-> 1794
/*    */     //   #263	-> 1804
/*    */     //   #264	-> 1817
/*    */     //   #266	-> 1830
/*    */     //   #267	-> 1841
/*    */     //   #268	-> 1848
/*    */     //   #269	-> 1876
/*    */     //   #270	-> 1888
/*    */     //   #272	-> 1902
/*    */     //   #267	-> 1903
/*    */     //   #272	-> 1904
/*    */     //   #273	-> 1905
/*    */     //   #274	-> 1918
/*    */     //   #262	-> 1919
/*    */     //   #275	-> 1920
/*    */     //   #276	-> 1943
/*    */     //   #70	-> 1977
/*    */     //   #72	-> 2007
/*    */     //   #277	-> 2020
/*    */     //   #72	-> 2026
/*    */     //   #73	-> 2065
/*    */     //   #276	-> 2066
/*    */     //   #275	-> 2071
/*    */     //   #278	-> 2073
/*    */     //   #254	-> 2080
/*    */     //   #279	-> 2083
/*    */     //   #248	-> 2086
/*    */     //   #280	-> 2089
/*    */     //   #241	-> 2092
/*    */     //   #281	-> 2095
/*    */     //   #68	-> 2096
/*    */     //   #76	-> 2106
/*    */     //   #77	-> 2124
/*    */     //   #282	-> 2138
/*    */     //   #77	-> 2144
/*    */     //   #76	-> 2182
/*    */     //   #80	-> 2192
/*    */     //   #81	-> 2210
/*    */     //   #283	-> 2224
/*    */     //   #81	-> 2230
/*    */     //   #284	-> 2262
/*    */     //   #285	-> 2265
/*    */     //   #289	-> 2273
/*    */     //   #290	-> 2308
/*    */     //   #291	-> 2318
/*    */     //   #292	-> 2324
/*    */     //   #293	-> 2331
/*    */     //   #294	-> 2340
/*    */     //   #296	-> 2347
/*    */     //   #295	-> 2369
/*    */     //   #297	-> 2379
/*    */     //   #298	-> 2382
/*    */     //   #299	-> 2400
/*    */     //   #300	-> 2405
/*    */     //   #301	-> 2417
/*    */     //   #303	-> 2429
/*    */     //   #305	-> 2434
/*    */     //   #306	-> 2444
/*    */     //   #307	-> 2457
/*    */     //   #309	-> 2470
/*    */     //   #310	-> 2481
/*    */     //   #311	-> 2488
/*    */     //   #312	-> 2516
/*    */     //   #313	-> 2528
/*    */     //   #315	-> 2542
/*    */     //   #310	-> 2543
/*    */     //   #315	-> 2544
/*    */     //   #316	-> 2545
/*    */     //   #317	-> 2558
/*    */     //   #305	-> 2559
/*    */     //   #318	-> 2560
/*    */     //   #319	-> 2583
/*    */     //   #82	-> 2614
/*    */     //   #83	-> 2630
/*    */     //   #84	-> 2658
/*    */     //   #85	-> 2678
/*    */     //   #86	-> 2683
/*    */     //   #320	-> 2698
/*    */     //   #86	-> 2704
/*    */     //   #89	-> 2736
/*    */     //   #90	-> 2746
/*    */     //   #321	-> 2761
/*    */     //   #90	-> 2767
/*    */     //   #92	-> 2792
/*    */     //   #93	-> 2812
/*    */     //   #94	-> 2820
/*    */     //   #322	-> 2832
/*    */     //   #323	-> 2835
/*    */     //   #324	-> 2843
/*    */     //   #325	-> 2851
/*    */     //   #328	-> 2854
/*    */     //   #329	-> 2872
/*    */     //   #330	-> 2882
/*    */     //   #331	-> 2888
/*    */     //   #332	-> 2895
/*    */     //   #333	-> 2904
/*    */     //   #335	-> 2911
/*    */     //   #334	-> 2933
/*    */     //   #336	-> 2943
/*    */     //   #337	-> 2946
/*    */     //   #338	-> 2964
/*    */     //   #339	-> 2969
/*    */     //   #340	-> 2981
/*    */     //   #342	-> 2993
/*    */     //   #344	-> 2998
/*    */     //   #345	-> 3008
/*    */     //   #346	-> 3021
/*    */     //   #348	-> 3034
/*    */     //   #349	-> 3045
/*    */     //   #350	-> 3052
/*    */     //   #351	-> 3080
/*    */     //   #352	-> 3092
/*    */     //   #354	-> 3106
/*    */     //   #349	-> 3107
/*    */     //   #354	-> 3108
/*    */     //   #355	-> 3109
/*    */     //   #356	-> 3122
/*    */     //   #344	-> 3123
/*    */     //   #357	-> 3124
/*    */     //   #358	-> 3149
/*    */     //   #95	-> 3180
/*    */     //   #96	-> 3205
/*    */     //   #358	-> 3206
/*    */     //   #357	-> 3211
/*    */     //   #359	-> 3213
/*    */     //   #336	-> 3220
/*    */     //   #360	-> 3223
/*    */     //   #330	-> 3226
/*    */     //   #361	-> 3229
/*    */     //   #322	-> 3232
/*    */     //   #362	-> 3235
/*    */     //   #98	-> 3243
/*    */     //   #319	-> 3244
/*    */     //   #318	-> 3249
/*    */     //   #363	-> 3251
/*    */     //   #297	-> 3258
/*    */     //   #364	-> 3261
/*    */     //   #291	-> 3264
/*    */     //   #365	-> 3267
/*    */     //   #284	-> 3270
/*    */     //   #366	-> 3273
/*    */     //   #80	-> 3274
/*    */     //   #101	-> 3284
/*    */     //   #102	-> 3302
/*    */     //   #367	-> 3316
/*    */     //   #102	-> 3322
/*    */     //   #368	-> 3354
/*    */     //   #369	-> 3357
/*    */     //   #373	-> 3365
/*    */     //   #374	-> 3400
/*    */     //   #375	-> 3410
/*    */     //   #376	-> 3416
/*    */     //   #377	-> 3423
/*    */     //   #378	-> 3432
/*    */     //   #380	-> 3439
/*    */     //   #379	-> 3461
/*    */     //   #381	-> 3471
/*    */     //   #382	-> 3474
/*    */     //   #383	-> 3492
/*    */     //   #384	-> 3497
/*    */     //   #385	-> 3509
/*    */     //   #387	-> 3521
/*    */     //   #389	-> 3526
/*    */     //   #390	-> 3536
/*    */     //   #391	-> 3549
/*    */     //   #393	-> 3562
/*    */     //   #394	-> 3573
/*    */     //   #395	-> 3580
/*    */     //   #396	-> 3608
/*    */     //   #397	-> 3620
/*    */     //   #399	-> 3634
/*    */     //   #394	-> 3635
/*    */     //   #399	-> 3636
/*    */     //   #400	-> 3637
/*    */     //   #401	-> 3650
/*    */     //   #389	-> 3651
/*    */     //   #402	-> 3652
/*    */     //   #403	-> 3675
/*    */     //   #103	-> 3706
/*    */     //   #104	-> 3722
/*    */     //   #106	-> 3750
/*    */     //   #107	-> 3760
/*    */     //   #404	-> 3775
/*    */     //   #107	-> 3781
/*    */     //   #109	-> 3809
/*    */     //   #405	-> 3821
/*    */     //   #406	-> 3824
/*    */     //   #407	-> 3832
/*    */     //   #408	-> 3840
/*    */     //   #411	-> 3843
/*    */     //   #412	-> 3861
/*    */     //   #413	-> 3871
/*    */     //   #414	-> 3877
/*    */     //   #415	-> 3884
/*    */     //   #416	-> 3893
/*    */     //   #418	-> 3900
/*    */     //   #417	-> 3922
/*    */     //   #419	-> 3932
/*    */     //   #420	-> 3935
/*    */     //   #421	-> 3953
/*    */     //   #422	-> 3958
/*    */     //   #423	-> 3970
/*    */     //   #425	-> 3982
/*    */     //   #427	-> 3987
/*    */     //   #428	-> 3997
/*    */     //   #429	-> 4010
/*    */     //   #431	-> 4023
/*    */     //   #432	-> 4034
/*    */     //   #433	-> 4041
/*    */     //   #434	-> 4069
/*    */     //   #435	-> 4081
/*    */     //   #437	-> 4095
/*    */     //   #432	-> 4096
/*    */     //   #437	-> 4097
/*    */     //   #438	-> 4098
/*    */     //   #439	-> 4111
/*    */     //   #427	-> 4112
/*    */     //   #440	-> 4113
/*    */     //   #441	-> 4138
/*    */     //   #110	-> 4169
/*    */     //   #111	-> 4179
/*    */     //   #112	-> 4204
/*    */     //   #441	-> 4205
/*    */     //   #440	-> 4210
/*    */     //   #442	-> 4212
/*    */     //   #419	-> 4219
/*    */     //   #443	-> 4222
/*    */     //   #413	-> 4225
/*    */     //   #444	-> 4228
/*    */     //   #405	-> 4231
/*    */     //   #445	-> 4234
/*    */     //   #113	-> 4235
/*    */     //   #403	-> 4236
/*    */     //   #402	-> 4241
/*    */     //   #446	-> 4243
/*    */     //   #381	-> 4250
/*    */     //   #447	-> 4253
/*    */     //   #375	-> 4256
/*    */     //   #448	-> 4259
/*    */     //   #368	-> 4262
/*    */     //   #449	-> 4265
/*    */     //   #101	-> 4266
/*    */     //   #116	-> 4276
/*    */     //   #63	-> 4301
/*    */     //   #118	-> 4326
/*    */     //   #238	-> 4327
/*    */     //   #237	-> 4332
/*    */     //   #450	-> 4334
/*    */     //   #216	-> 4341
/*    */     //   #451	-> 4344
/*    */     //   #210	-> 4347
/*    */     //   #452	-> 4350
/*    */     //   #203	-> 4353
/*    */     //   #453	-> 4356
/*    */     //   #119	-> 4357
/*    */     //   #195	-> 4358
/*    */     //   #194	-> 4363
/*    */     //   #454	-> 4365
/*    */     //   #173	-> 4372
/*    */     //   #455	-> 4375
/*    */     //   #167	-> 4378
/*    */     //   #456	-> 4381
/*    */     //   #159	-> 4384
/*    */     //   #457	-> 4387
/*    */     //   #120	-> 4388
/*    */     //   #158	-> 4389
/*    */     //   #157	-> 4394
/*    */     //   #458	-> 4395
/*    */     //   #136	-> 4401
/*    */     //   #459	-> 4404
/*    */     //   #130	-> 4406
/*    */     //   #460	-> 4409
/*    */     //   #123	-> 4411
/*    */     //   #461	-> 4414
/*    */     //   #121	-> 4427
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   124	6	6	$i$f$getDp	I
/*    */     //   121	9	5	$this$dp$iv	I
/*    */     //   136	6	6	$i$f$getDp	I
/*    */     //   133	9	5	$this$dp$iv	I
/*    */     //   946	6	64	$i$a$-cache-TaskHeaderKt$TaskHeader$1$1$1	I
/*    */     //   954	11	65	value$iv	Ljava/lang/Object;
/*    */     //   927	44	63	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   924	47	62	it$iv	Ljava/lang/Object;
/*    */     //   915	58	61	$i$f$cache	I
/*    */     //   912	61	59	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   912	61	60	invalid$iv	Z
/*    */     //   1038	6	59	$i$f$getDp	I
/*    */     //   1035	9	66	$this$dp$iv	I
/*    */     //   1498	6	89	$i$f$getDp	I
/*    */     //   1495	9	88	$this$dp$iv	I
/*    */     //   1584	6	89	$i$f$getDp	I
/*    */     //   1581	9	88	$this$dp$iv	I
/*    */     //   2020	6	116	$i$f$getDp	I
/*    */     //   2017	9	115	$this$dp$iv	I
/*    */     //   1974	92	114	$i$a$-Row-TaskHeaderKt$TaskHeader$1$1$2$2	I
/*    */     //   1971	95	113	$this$TaskHeader_u24lambda_u249_u24lambda_u248_u24lambda_u247_u24lambda_u242	Landroidx/compose/foundation/layout/RowScope;
/*    */     //   1971	95	112	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   1971	95	111	$changed	I
/*    */     //   1937	134	110	$i$a$-Layout-RowKt$Row$1$iv	I
/*    */     //   1934	137	109	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1934	137	108	$changed$iv	I
/*    */     //   1848	55	107	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   1845	58	106	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1841	64	105	$i$f$set-impl	I
/*    */     //   1838	67	104	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   1804	115	103	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   1801	118	102	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1733	351	101	$i$f$ReusableComposeNode	I
/*    */     //   1730	354	99	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   1730	354	100	$changed$iv$iv$iv	I
/*    */     //   1672	418	95	$i$f$Layout	I
/*    */     //   1689	401	96	compositeKeyHash$iv$iv	I
/*    */     //   1698	392	97	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   1707	383	98	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   1669	421	94	$changed$iv$iv	I
/*    */     //   1616	480	92	$i$f$Row	I
/*    */     //   1659	437	93	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   1613	483	88	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */     //   1633	463	89	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*    */     //   1613	483	90	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*    */     //   1613	483	91	$changed$iv	I
/*    */     //   2138	6	89	$i$f$getDp	I
/*    */     //   2135	9	88	$this$dp$iv	I
/*    */     //   2224	6	89	$i$f$getDp	I
/*    */     //   2221	9	88	$this$dp$iv	I
/*    */     //   2698	6	118	$i$f$getDp	I
/*    */     //   2695	9	117	$this$dp$iv	I
/*    */     //   2761	6	119	$i$f$getDp	I
/*    */     //   2758	9	118	$this$dp$iv	I
/*    */     //   3180	26	145	$i$a$-Box-TaskHeaderKt$TaskHeader$1$1$2$3$1	I
/*    */     //   3177	29	144	$this$TaskHeader_u24lambda_u249_u24lambda_u248_u24lambda_u247_u24lambda_u244_u24lambda_u243	Landroidx/compose/foundation/layout/BoxScope;
/*    */     //   3177	29	143	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   3177	29	142	$changed	I
/*    */     //   3141	70	141	$i$a$-Layout-BoxKt$Box$1$iv	I
/*    */     //   3138	73	140	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   3138	73	139	$changed$iv	I
/*    */     //   3052	55	138	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   3049	58	137	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   3045	64	136	$i$f$set-impl	I
/*    */     //   3042	67	135	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   3008	115	134	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   3005	118	133	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   2937	287	132	$i$f$ReusableComposeNode	I
/*    */     //   2934	290	130	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   2934	290	131	$changed$iv$iv$iv	I
/*    */     //   2876	354	126	$i$f$Layout	I
/*    */     //   2893	337	127	compositeKeyHash$iv$iv	I
/*    */     //   2902	328	128	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   2911	319	129	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   2873	357	125	$changed$iv$iv	I
/*    */     //   2824	412	121	$i$f$Box	I
/*    */     //   2863	373	124	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   2843	393	119	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */     //   2851	385	122	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*    */     //   2854	382	123	propagateMinConstraints$iv	Z
/*    */     //   2821	415	120	$changed$iv	I
/*    */     //   2614	630	114	$i$a$-Row-TaskHeaderKt$TaskHeader$1$1$2$3	I
/*    */     //   2630	614	115	icon	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*    */     //   2668	576	116	doneButton	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*    */     //   2746	498	117	startAgainButton	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*    */     //   2802	442	118	declineButton	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*    */     //   2611	633	113	$this$TaskHeader_u24lambda_u249_u24lambda_u248_u24lambda_u247_u24lambda_u244	Landroidx/compose/foundation/layout/RowScope;
/*    */     //   2611	633	112	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   2611	633	111	$changed	I
/*    */     //   2577	672	110	$i$a$-Layout-RowKt$Row$1$iv	I
/*    */     //   2574	675	109	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   2574	675	108	$changed$iv	I
/*    */     //   2488	55	107	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   2485	58	106	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   2481	64	105	$i$f$set-impl	I
/*    */     //   2478	67	104	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   2444	115	103	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   2441	118	102	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   2373	889	101	$i$f$ReusableComposeNode	I
/*    */     //   2370	892	99	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   2370	892	100	$changed$iv$iv$iv	I
/*    */     //   2312	956	95	$i$f$Layout	I
/*    */     //   2329	939	96	compositeKeyHash$iv$iv	I
/*    */     //   2338	930	97	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   2347	921	98	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   2309	959	94	$changed$iv$iv	I
/*    */     //   2256	1018	92	$i$f$Row	I
/*    */     //   2299	975	93	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   2253	1021	88	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */     //   2273	1001	89	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*    */     //   2253	1021	90	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*    */     //   2253	1021	91	$changed$iv	I
/*    */     //   3316	6	89	$i$f$getDp	I
/*    */     //   3313	9	88	$this$dp$iv	I
/*    */     //   3775	6	118	$i$f$getDp	I
/*    */     //   3772	9	117	$this$dp$iv	I
/*    */     //   4169	36	143	$i$a$-Box-TaskHeaderKt$TaskHeader$1$1$2$4$1	I
/*    */     //   4179	26	144	reportIssueButton	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*    */     //   4166	39	142	$this$TaskHeader_u24lambda_u249_u24lambda_u248_u24lambda_u247_u24lambda_u246_u24lambda_u245	Landroidx/compose/foundation/layout/BoxScope;
/*    */     //   4166	39	141	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   4166	39	140	$changed	I
/*    */     //   4130	80	139	$i$a$-Layout-BoxKt$Box$1$iv	I
/*    */     //   4127	83	138	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   4127	83	137	$changed$iv	I
/*    */     //   4041	55	136	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   4038	58	135	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   4034	64	134	$i$f$set-impl	I
/*    */     //   4031	67	133	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   3997	115	132	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   3994	118	131	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   3926	297	130	$i$f$ReusableComposeNode	I
/*    */     //   3923	300	128	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   3923	300	129	$changed$iv$iv$iv	I
/*    */     //   3865	364	124	$i$f$Layout	I
/*    */     //   3882	347	125	compositeKeyHash$iv$iv	I
/*    */     //   3891	338	126	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   3900	329	127	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   3862	367	123	$changed$iv$iv	I
/*    */     //   3813	422	120	$i$f$Box	I
/*    */     //   3852	383	122	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   3832	403	117	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */     //   3840	395	118	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*    */     //   3843	392	121	propagateMinConstraints$iv	Z
/*    */     //   3810	425	119	$changed$iv	I
/*    */     //   3706	530	114	$i$a$-Row-TaskHeaderKt$TaskHeader$1$1$2$4	I
/*    */     //   3722	514	115	stateIcon	Lorg/jetbrains/jewel/ui/icon/IconKey;
/*    */     //   3760	476	116	startAgainButton	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;
/*    */     //   3703	533	113	$this$TaskHeader_u24lambda_u249_u24lambda_u248_u24lambda_u247_u24lambda_u246	Landroidx/compose/foundation/layout/RowScope;
/*    */     //   3703	533	112	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   3703	533	111	$changed	I
/*    */     //   3669	572	110	$i$a$-Layout-RowKt$Row$1$iv	I
/*    */     //   3666	575	109	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   3666	575	108	$changed$iv	I
/*    */     //   3580	55	107	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   3577	58	106	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   3573	64	105	$i$f$set-impl	I
/*    */     //   3570	67	104	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   3536	115	103	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   3533	118	102	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   3465	789	101	$i$f$ReusableComposeNode	I
/*    */     //   3462	792	99	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   3462	792	100	$changed$iv$iv$iv	I
/*    */     //   3404	856	95	$i$f$Layout	I
/*    */     //   3421	839	96	compositeKeyHash$iv$iv	I
/*    */     //   3430	830	97	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   3439	821	98	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   3401	859	94	$changed$iv$iv	I
/*    */     //   3348	918	92	$i$f$Row	I
/*    */     //   3391	875	93	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   3345	921	88	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */     //   3365	901	89	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*    */     //   3345	921	90	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*    */     //   3345	921	91	$changed$iv	I
/*    */     //   1428	2899	85	$i$a$-Column-TaskHeaderKt$TaskHeader$1$1$2	I
/*    */     //   1462	2865	86	state	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;
/*    */     //   1425	2902	84	$this$TaskHeader_u24lambda_u249_u24lambda_u248_u24lambda_u247	Landroidx/compose/foundation/layout/ColumnScope;
/*    */     //   1425	2902	83	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   1425	2902	82	$changed	I
/*    */     //   1391	2941	81	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*    */     //   1388	2944	80	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1388	2944	79	$changed$iv	I
/*    */     //   1302	55	78	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   1299	58	77	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1295	64	76	$i$f$set-impl	I
/*    */     //   1292	67	75	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   1258	115	74	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   1255	118	73	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1187	3158	72	$i$f$ReusableComposeNode	I
/*    */     //   1184	3161	70	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   1184	3161	71	$changed$iv$iv$iv	I
/*    */     //   1126	3225	65	$i$f$Layout	I
/*    */     //   1143	3208	67	compositeKeyHash$iv$iv	I
/*    */     //   1152	3199	68	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   1161	3190	69	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   1123	3228	64	$changed$iv$iv	I
/*    */     //   1062	3295	62	$i$f$Column	I
/*    */     //   1113	3244	63	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   1059	3298	66	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */     //   1079	3278	59	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*    */     //   1087	3270	60	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*    */     //   1059	3298	61	$changed$iv	I
/*    */     //   889	3469	58	$i$a$-Row-TaskHeaderKt$TaskHeader$1$1	I
/*    */     //   886	3472	57	$this$TaskHeader_u24lambda_u249_u24lambda_u248	Landroidx/compose/foundation/layout/RowScope;
/*    */     //   886	3472	56	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   886	3472	55	$changed	I
/*    */     //   852	3511	54	$i$a$-Layout-RowKt$Row$1$iv	I
/*    */     //   849	3514	53	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   849	3514	52	$changed$iv	I
/*    */     //   763	55	51	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   760	58	50	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   756	64	49	$i$f$set-impl	I
/*    */     //   753	67	48	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   719	115	47	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   716	118	46	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   648	3728	45	$i$f$ReusableComposeNode	I
/*    */     //   645	3731	43	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   645	3731	44	$changed$iv$iv$iv	I
/*    */     //   587	3795	39	$i$f$Layout	I
/*    */     //   604	3778	40	compositeKeyHash$iv$iv	I
/*    */     //   613	3769	41	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   622	3760	42	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   584	3798	38	$changed$iv$iv	I
/*    */     //   515	3873	33	$i$f$Row	I
/*    */     //   574	3814	37	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   532	3856	34	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */     //   540	3848	35	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*    */     //   548	3840	36	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*    */     //   512	3876	32	$changed$iv	I
/*    */     //   508	3881	31	$i$a$-Column-TaskHeaderKt$TaskHeader$1	I
/*    */     //   505	3884	30	$this$TaskHeader_u24lambda_u249	Landroidx/compose/foundation/layout/ColumnScope;
/*    */     //   505	3884	29	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   505	3884	28	$changed	I
/*    */     //   471	3923	27	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*    */     //   468	3926	26	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   468	3926	25	$changed$iv	I
/*    */     //   383	55	24	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   380	58	23	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   376	64	22	$i$f$set-impl	I
/*    */     //   373	67	21	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   339	115	20	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   336	118	19	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   275	4130	18	$i$f$ReusableComposeNode	I
/*    */     //   272	4133	16	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   272	4133	17	$changed$iv$iv$iv	I
/*    */     //   218	4192	12	$i$f$Layout	I
/*    */     //   233	4177	13	compositeKeyHash$iv$iv	I
/*    */     //   241	4169	14	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   249	4161	15	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   215	4195	11	$changed$iv$iv	I
/*    */     //   156	4259	9	$i$f$Column	I
/*    */     //   205	4210	10	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   153	4262	5	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */     //   172	4243	6	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*    */     //   180	4235	7	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*    */     //   153	4262	8	$changed$iv	I
/*    */     //   18	4443	4	$dirty	I
/*    */     //   0	4461	0	viewModel	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderViewModel;
/*    */     //   0	4461	1	state	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;
/*    */     //   0	4461	2	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	4461	3	$changed	I
/*    */   }
/*    */   
/*    */   private static final Unit TaskHeader$lambda$10(TaskHeaderViewModel $viewModel, TaskHeaderState $state, int $$changed, Composer $composer, int $force) {
/*    */     TaskHeader($viewModel, $state, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit TaskHeader$lambda$9$lambda$8$lambda$1$lambda$0(TaskHeaderViewModel $viewModel) {
/* 40 */     $viewModel.back();
/* 41 */     TaskHeaderViewModel.TaskIds taskIds = $viewModel.getTaskIds(); TaskChainId chainId = taskIds.component1(); TaskId taskId = taskIds.component2();
/* 42 */     CompositeUiAction.INSTANCE.logGoBackTaskButtonClicked(chainId, taskId);
/* 43 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class TaskHeaderKt$TaskHeader$1$1$2$1 implements Function2<Composer, Integer, Unit> {
/*    */     @Composable
/*    */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */     public final void invoke(Composer $composer, int $changed) {
/* 51 */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1558771137, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header.TaskHeader.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TaskHeader.kt:50)"); 
/* 52 */         if (this.$state == null || this.$state.getTaskName() == null) this.$state.getTaskName();  String str = "";
/* 53 */         Modifier modifier = SizeKt.fillMaxWidth$default((Modifier)Modifier.Companion, 0.0F, 1, null);
/* 54 */         long l1 = TextUnitKt.getSp(18);
/* 55 */         FontWeight fontWeight = FontWeight.Companion.getW500();
/* 56 */         long l2 = TextUnitKt.getSp(25.2D);
/* 57 */         FontFamily fontFamily = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getMessageFont($composer, MatterhornThemeData.$stable);
/* 58 */         long l3 = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getTaskTitleTextColor-0d7_KjU(); TextKt.Text-bAzTDeA(str, modifier, l3, l1, null, fontWeight, fontFamily, 0L, null, 0, l2, 0, false, 0, null, null, $composer, 199728, 6, 64400); if (ComposerKt.isTraceInProgress())
/* 59 */           ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */     
/*    */     }
/*    */     
/*    */     TaskHeaderKt$TaskHeader$1$1$2$1(TaskHeaderState $state) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\header\TaskHeaderKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */