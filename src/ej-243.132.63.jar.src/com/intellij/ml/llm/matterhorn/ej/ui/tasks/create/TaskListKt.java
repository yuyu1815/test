/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.create;
/*     */ import androidx.compose.foundation.BackgroundKt;
/*     */ import androidx.compose.foundation.ContextMenuItem;
/*     */ import androidx.compose.foundation.ContextMenuProvider_desktopKt;
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.layout.ColumnKt;
/*     */ import androidx.compose.foundation.layout.ColumnScope;
/*     */ import androidx.compose.foundation.layout.ColumnScopeInstance;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.foundation.layout.SizeKt;
/*     */ import androidx.compose.foundation.shape.RoundedCornerShapeKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.graphics.Shape;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.RecentTaskChain;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeData;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyItemScope;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyListScope;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyListState;
/*     */ import org.jetbrains.jewel.ui.component.TextKt;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000D\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\b\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\032w\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\b2\022\020\t\032\016\022\004\022\0020\013\022\004\022\0020\0010\n2\036\020\f\032\032\022\004\022\0020\006\022\004\022\0020\016\022\n\022\b\022\004\022\0020\0170\0050\r2\b\b\002\020\020\032\0020\0212\b\b\002\020\022\032\0020\023H\001¢\006\004\b\024\020\025¨\006\026"}, d2 = {"TaskList", "", "modifier", "Landroidx/compose/ui/Modifier;", "recentTasks", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/SortedRecentTaskChain;", "selectableLazyListState", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;", "onTaskDoubleClicked", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "actionFactory", "Lkotlin/Function2;", "", "Landroidx/compose/foundation/ContextMenuItem;", "contentBackground", "Landroidx/compose/ui/graphics/Color;", "insetHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "TaskList-5IdfQCw", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;JFLandroidx/compose/runtime/Composer;II)V", "ej-ui"})
/*     */ @SourceDebugExtension({"SMAP\nTaskList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskList.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/TaskListKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,126:1\n149#2:127\n86#3:128\n83#3,6:129\n89#3:163\n93#3:167\n79#4,6:135\n86#4,4:150\n90#4,2:160\n94#4:166\n368#5,9:141\n377#5:162\n378#5,2:164\n4034#6,6:154\n*S KotlinDebug\n*F\n+ 1 TaskList.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/TaskListKt\n*L\n49#1:127\n51#1:128\n51#1:129,6\n51#1:163\n51#1:167\n51#1:135,6\n51#1:150,4\n51#1:160,2\n51#1:166\n51#1:141,9\n51#1:162\n51#1:164,2\n51#1:154,6\n*E\n"})
/*     */ public final class TaskListKt {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void TaskList-5IdfQCw(@Nullable Modifier modifier, @NotNull List recentTasks, @NotNull SelectableLazyListState selectableLazyListState, @NotNull Function1 onTaskDoubleClicked, @NotNull Function2 actionFactory, long contentBackground, float insetHorizontalPadding, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'recentTasks'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'selectableLazyListState'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_3
/*     */     //   13: ldc 'onTaskDoubleClicked'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload #4
/*     */     //   20: ldc 'actionFactory'
/*     */     //   22: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   25: aload #8
/*     */     //   27: ldc -1369394831
/*     */     //   29: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   34: astore #8
/*     */     //   36: iload #9
/*     */     //   38: istore #11
/*     */     //   40: iload #10
/*     */     //   42: iconst_1
/*     */     //   43: iand
/*     */     //   44: ifeq -> 57
/*     */     //   47: iload #11
/*     */     //   49: bipush #6
/*     */     //   51: ior
/*     */     //   52: istore #11
/*     */     //   54: goto -> 86
/*     */     //   57: iload #9
/*     */     //   59: bipush #6
/*     */     //   61: iand
/*     */     //   62: ifne -> 86
/*     */     //   65: iload #11
/*     */     //   67: aload #8
/*     */     //   69: aload_0
/*     */     //   70: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   75: ifeq -> 82
/*     */     //   78: iconst_4
/*     */     //   79: goto -> 83
/*     */     //   82: iconst_2
/*     */     //   83: ior
/*     */     //   84: istore #11
/*     */     //   86: iload #10
/*     */     //   88: iconst_2
/*     */     //   89: iand
/*     */     //   90: ifeq -> 103
/*     */     //   93: iload #11
/*     */     //   95: bipush #48
/*     */     //   97: ior
/*     */     //   98: istore #11
/*     */     //   100: goto -> 134
/*     */     //   103: iload #9
/*     */     //   105: bipush #48
/*     */     //   107: iand
/*     */     //   108: ifne -> 134
/*     */     //   111: iload #11
/*     */     //   113: aload #8
/*     */     //   115: aload_1
/*     */     //   116: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   121: ifeq -> 129
/*     */     //   124: bipush #32
/*     */     //   126: goto -> 131
/*     */     //   129: bipush #16
/*     */     //   131: ior
/*     */     //   132: istore #11
/*     */     //   134: iload #10
/*     */     //   136: iconst_4
/*     */     //   137: iand
/*     */     //   138: ifeq -> 152
/*     */     //   141: iload #11
/*     */     //   143: sipush #384
/*     */     //   146: ior
/*     */     //   147: istore #11
/*     */     //   149: goto -> 206
/*     */     //   152: iload #9
/*     */     //   154: sipush #384
/*     */     //   157: iand
/*     */     //   158: ifne -> 206
/*     */     //   161: iload #11
/*     */     //   163: iload #9
/*     */     //   165: sipush #512
/*     */     //   168: iand
/*     */     //   169: ifne -> 183
/*     */     //   172: aload #8
/*     */     //   174: aload_2
/*     */     //   175: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   180: goto -> 191
/*     */     //   183: aload #8
/*     */     //   185: aload_2
/*     */     //   186: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   191: ifeq -> 200
/*     */     //   194: sipush #256
/*     */     //   197: goto -> 203
/*     */     //   200: sipush #128
/*     */     //   203: ior
/*     */     //   204: istore #11
/*     */     //   206: iload #10
/*     */     //   208: bipush #8
/*     */     //   210: iand
/*     */     //   211: ifeq -> 225
/*     */     //   214: iload #11
/*     */     //   216: sipush #3072
/*     */     //   219: ior
/*     */     //   220: istore #11
/*     */     //   222: goto -> 259
/*     */     //   225: iload #9
/*     */     //   227: sipush #3072
/*     */     //   230: iand
/*     */     //   231: ifne -> 259
/*     */     //   234: iload #11
/*     */     //   236: aload #8
/*     */     //   238: aload_3
/*     */     //   239: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   244: ifeq -> 253
/*     */     //   247: sipush #2048
/*     */     //   250: goto -> 256
/*     */     //   253: sipush #1024
/*     */     //   256: ior
/*     */     //   257: istore #11
/*     */     //   259: iload #10
/*     */     //   261: bipush #16
/*     */     //   263: iand
/*     */     //   264: ifeq -> 278
/*     */     //   267: iload #11
/*     */     //   269: sipush #24576
/*     */     //   272: ior
/*     */     //   273: istore #11
/*     */     //   275: goto -> 313
/*     */     //   278: iload #9
/*     */     //   280: sipush #24576
/*     */     //   283: iand
/*     */     //   284: ifne -> 313
/*     */     //   287: iload #11
/*     */     //   289: aload #8
/*     */     //   291: aload #4
/*     */     //   293: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   298: ifeq -> 307
/*     */     //   301: sipush #16384
/*     */     //   304: goto -> 310
/*     */     //   307: sipush #8192
/*     */     //   310: ior
/*     */     //   311: istore #11
/*     */     //   313: iload #9
/*     */     //   315: ldc 196608
/*     */     //   317: iand
/*     */     //   318: ifne -> 353
/*     */     //   321: iload #11
/*     */     //   323: iload #10
/*     */     //   325: bipush #32
/*     */     //   327: iand
/*     */     //   328: ifne -> 348
/*     */     //   331: aload #8
/*     */     //   333: lload #5
/*     */     //   335: invokeinterface changed : (J)Z
/*     */     //   340: ifeq -> 348
/*     */     //   343: ldc 131072
/*     */     //   345: goto -> 350
/*     */     //   348: ldc 65536
/*     */     //   350: ior
/*     */     //   351: istore #11
/*     */     //   353: iload #10
/*     */     //   355: bipush #64
/*     */     //   357: iand
/*     */     //   358: ifeq -> 371
/*     */     //   361: iload #11
/*     */     //   363: ldc 1572864
/*     */     //   365: ior
/*     */     //   366: istore #11
/*     */     //   368: goto -> 403
/*     */     //   371: iload #9
/*     */     //   373: ldc 1572864
/*     */     //   375: iand
/*     */     //   376: ifne -> 403
/*     */     //   379: iload #11
/*     */     //   381: aload #8
/*     */     //   383: fload #7
/*     */     //   385: invokeinterface changed : (F)Z
/*     */     //   390: ifeq -> 398
/*     */     //   393: ldc 1048576
/*     */     //   395: goto -> 400
/*     */     //   398: ldc 524288
/*     */     //   400: ior
/*     */     //   401: istore #11
/*     */     //   403: iload #11
/*     */     //   405: ldc 599187
/*     */     //   407: iand
/*     */     //   408: ldc 599186
/*     */     //   410: if_icmpne -> 423
/*     */     //   413: aload #8
/*     */     //   415: invokeinterface getSkipping : ()Z
/*     */     //   420: ifne -> 1107
/*     */     //   423: aload #8
/*     */     //   425: invokeinterface startDefaults : ()V
/*     */     //   430: iload #9
/*     */     //   432: iconst_1
/*     */     //   433: iand
/*     */     //   434: ifeq -> 447
/*     */     //   437: aload #8
/*     */     //   439: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   444: ifeq -> 512
/*     */     //   447: iload #10
/*     */     //   449: iconst_1
/*     */     //   450: iand
/*     */     //   451: ifeq -> 461
/*     */     //   454: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   457: checkcast androidx/compose/ui/Modifier
/*     */     //   460: astore_0
/*     */     //   461: iload #10
/*     */     //   463: bipush #32
/*     */     //   465: iand
/*     */     //   466: ifeq -> 487
/*     */     //   469: aload #8
/*     */     //   471: iconst_0
/*     */     //   472: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   475: invokevirtual getBackgroundColor-0d7_KjU : ()J
/*     */     //   478: lstore #5
/*     */     //   480: iload #11
/*     */     //   482: ldc -458753
/*     */     //   484: iand
/*     */     //   485: istore #11
/*     */     //   487: iload #10
/*     */     //   489: bipush #64
/*     */     //   491: iand
/*     */     //   492: ifeq -> 534
/*     */     //   495: iconst_0
/*     */     //   496: istore #12
/*     */     //   498: iconst_0
/*     */     //   499: istore #13
/*     */     //   501: iload #12
/*     */     //   503: i2f
/*     */     //   504: invokestatic constructor-impl : (F)F
/*     */     //   507: fstore #7
/*     */     //   509: goto -> 534
/*     */     //   512: aload #8
/*     */     //   514: invokeinterface skipToGroupEnd : ()V
/*     */     //   519: iload #10
/*     */     //   521: bipush #32
/*     */     //   523: iand
/*     */     //   524: ifeq -> 534
/*     */     //   527: iload #11
/*     */     //   529: ldc -458753
/*     */     //   531: iand
/*     */     //   532: istore #11
/*     */     //   534: aload #8
/*     */     //   536: invokeinterface endDefaults : ()V
/*     */     //   541: invokestatic isTraceInProgress : ()Z
/*     */     //   544: ifeq -> 557
/*     */     //   547: ldc -1369394831
/*     */     //   549: iload #11
/*     */     //   551: iconst_m1
/*     */     //   552: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.TaskList (TaskList.kt:49)'
/*     */     //   554: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   557: aload_0
/*     */     //   558: astore #12
/*     */     //   560: bipush #14
/*     */     //   562: iload #11
/*     */     //   564: iand
/*     */     //   565: istore #15
/*     */     //   567: iconst_0
/*     */     //   568: istore #16
/*     */     //   570: aload #8
/*     */     //   572: ldc -483455358
/*     */     //   574: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   576: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   579: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   582: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   585: astore #13
/*     */     //   587: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   590: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   593: astore #14
/*     */     //   595: aload #13
/*     */     //   597: aload #14
/*     */     //   599: aload #8
/*     */     //   601: bipush #14
/*     */     //   603: iload #15
/*     */     //   605: iconst_3
/*     */     //   606: ishr
/*     */     //   607: iand
/*     */     //   608: bipush #112
/*     */     //   610: iload #15
/*     */     //   612: iconst_3
/*     */     //   613: ishr
/*     */     //   614: iand
/*     */     //   615: ior
/*     */     //   616: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   619: astore #17
/*     */     //   621: bipush #112
/*     */     //   623: iload #15
/*     */     //   625: iconst_3
/*     */     //   626: ishl
/*     */     //   627: iand
/*     */     //   628: istore #18
/*     */     //   630: nop
/*     */     //   631: iconst_0
/*     */     //   632: istore #19
/*     */     //   634: aload #8
/*     */     //   636: ldc -1323940314
/*     */     //   638: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   640: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   643: aload #8
/*     */     //   645: iconst_0
/*     */     //   646: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   649: istore #20
/*     */     //   651: aload #8
/*     */     //   653: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   658: astore #21
/*     */     //   660: aload #8
/*     */     //   662: aload #12
/*     */     //   664: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   667: astore #22
/*     */     //   669: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   672: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   675: astore #23
/*     */     //   677: bipush #6
/*     */     //   679: sipush #896
/*     */     //   682: iload #18
/*     */     //   684: bipush #6
/*     */     //   686: ishl
/*     */     //   687: iand
/*     */     //   688: ior
/*     */     //   689: istore #24
/*     */     //   691: nop
/*     */     //   692: iconst_0
/*     */     //   693: istore #25
/*     */     //   695: aload #8
/*     */     //   697: ldc -692256719
/*     */     //   699: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   701: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   704: aload #8
/*     */     //   706: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   711: instanceof androidx/compose/runtime/Applier
/*     */     //   714: ifne -> 720
/*     */     //   717: invokestatic invalidApplier : ()V
/*     */     //   720: aload #8
/*     */     //   722: invokeinterface startReusableNode : ()V
/*     */     //   727: aload #8
/*     */     //   729: invokeinterface getInserting : ()Z
/*     */     //   734: ifeq -> 749
/*     */     //   737: aload #8
/*     */     //   739: aload #23
/*     */     //   741: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   746: goto -> 756
/*     */     //   749: aload #8
/*     */     //   751: invokeinterface useNode : ()V
/*     */     //   756: aload #8
/*     */     //   758: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   761: astore #26
/*     */     //   763: iconst_0
/*     */     //   764: istore #27
/*     */     //   766: aload #26
/*     */     //   768: aload #17
/*     */     //   770: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   773: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   776: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   779: aload #26
/*     */     //   781: aload #21
/*     */     //   783: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   786: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   789: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   792: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   795: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   798: astore #28
/*     */     //   800: iconst_0
/*     */     //   801: istore #29
/*     */     //   803: aload #26
/*     */     //   805: astore #30
/*     */     //   807: iconst_0
/*     */     //   808: istore #31
/*     */     //   810: aload #30
/*     */     //   812: invokeinterface getInserting : ()Z
/*     */     //   817: ifne -> 838
/*     */     //   820: aload #30
/*     */     //   822: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   827: iload #20
/*     */     //   829: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   832: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   835: ifne -> 864
/*     */     //   838: aload #30
/*     */     //   840: iload #20
/*     */     //   842: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   845: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   850: aload #26
/*     */     //   852: iload #20
/*     */     //   854: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   857: aload #28
/*     */     //   859: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   864: nop
/*     */     //   865: nop
/*     */     //   866: nop
/*     */     //   867: aload #26
/*     */     //   869: aload #22
/*     */     //   871: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   874: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   877: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   880: nop
/*     */     //   881: nop
/*     */     //   882: aload #8
/*     */     //   884: bipush #14
/*     */     //   886: iload #24
/*     */     //   888: bipush #6
/*     */     //   890: ishr
/*     */     //   891: iand
/*     */     //   892: istore #32
/*     */     //   894: astore #33
/*     */     //   896: iconst_0
/*     */     //   897: istore #34
/*     */     //   899: aload #33
/*     */     //   901: ldc -384784025
/*     */     //   903: ldc 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   905: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   908: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   911: aload #33
/*     */     //   913: bipush #6
/*     */     //   915: bipush #112
/*     */     //   917: iload #15
/*     */     //   919: bipush #6
/*     */     //   921: ishr
/*     */     //   922: iand
/*     */     //   923: ior
/*     */     //   924: istore #35
/*     */     //   926: astore #36
/*     */     //   928: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   931: astore #37
/*     */     //   933: iconst_0
/*     */     //   934: istore #38
/*     */     //   936: aload #36
/*     */     //   938: ldc 602526401
/*     */     //   940: invokeinterface startReplaceGroup : (I)V
/*     */     //   945: aload_1
/*     */     //   946: invokeinterface isEmpty : ()Z
/*     */     //   951: ifeq -> 996
/*     */     //   954: ldc_w 'No recent tasks'
/*     */     //   957: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   960: checkcast androidx/compose/ui/Modifier
/*     */     //   963: lload #5
/*     */     //   965: aconst_null
/*     */     //   966: iconst_2
/*     */     //   967: aconst_null
/*     */     //   968: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   971: lconst_0
/*     */     //   972: lconst_0
/*     */     //   973: aconst_null
/*     */     //   974: aconst_null
/*     */     //   975: aconst_null
/*     */     //   976: lconst_0
/*     */     //   977: aconst_null
/*     */     //   978: iconst_0
/*     */     //   979: lconst_0
/*     */     //   980: iconst_0
/*     */     //   981: iconst_0
/*     */     //   982: iconst_0
/*     */     //   983: aconst_null
/*     */     //   984: aconst_null
/*     */     //   985: aload #36
/*     */     //   987: bipush #6
/*     */     //   989: iconst_0
/*     */     //   990: ldc_w 65532
/*     */     //   993: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   996: aload #36
/*     */     //   998: invokeinterface endReplaceGroup : ()V
/*     */     //   1003: aload_2
/*     */     //   1004: invokevirtual getLazyListState : ()Landroidx/compose/foundation/lazy/LazyListState;
/*     */     //   1007: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1010: checkcast androidx/compose/ui/Modifier
/*     */     //   1013: fconst_0
/*     */     //   1014: iconst_1
/*     */     //   1015: aconst_null
/*     */     //   1016: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1019: aconst_null
/*     */     //   1020: aconst_null
/*     */     //   1021: iconst_0
/*     */     //   1022: iconst_0
/*     */     //   1023: aconst_null
/*     */     //   1024: ldc_w 1825471980
/*     */     //   1027: iconst_1
/*     */     //   1028: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/TaskListKt$TaskList$1$1
/*     */     //   1031: dup
/*     */     //   1032: fload #7
/*     */     //   1034: aload_2
/*     */     //   1035: aload_1
/*     */     //   1036: lload #5
/*     */     //   1038: aload #4
/*     */     //   1040: aload_3
/*     */     //   1041: invokespecial <init> : (FLorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Ljava/util/List;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V
/*     */     //   1044: aload #36
/*     */     //   1046: bipush #54
/*     */     //   1048: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1051: checkcast kotlin/jvm/functions/Function2
/*     */     //   1054: aload #36
/*     */     //   1056: ldc_w 12582960
/*     */     //   1059: bipush #124
/*     */     //   1061: invokestatic VerticallyScrollableContainer : (Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1064: nop
/*     */     //   1065: aload #33
/*     */     //   1067: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1070: aload #8
/*     */     //   1072: invokeinterface endNode : ()V
/*     */     //   1077: aload #8
/*     */     //   1079: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1082: nop
/*     */     //   1083: aload #8
/*     */     //   1085: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1088: nop
/*     */     //   1089: aload #8
/*     */     //   1091: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1094: nop
/*     */     //   1095: invokestatic isTraceInProgress : ()Z
/*     */     //   1098: ifeq -> 1114
/*     */     //   1101: invokestatic traceEventEnd : ()V
/*     */     //   1104: goto -> 1114
/*     */     //   1107: aload #8
/*     */     //   1109: invokeinterface skipToGroupEnd : ()V
/*     */     //   1114: aload #8
/*     */     //   1116: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1121: dup
/*     */     //   1122: ifnull -> 1152
/*     */     //   1125: aload_0
/*     */     //   1126: aload_1
/*     */     //   1127: aload_2
/*     */     //   1128: aload_3
/*     */     //   1129: aload #4
/*     */     //   1131: lload #5
/*     */     //   1133: fload #7
/*     */     //   1135: iload #9
/*     */     //   1137: iload #10
/*     */     //   1139: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Ljava/util/List;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;JFII)Lkotlin/jvm/functions/Function2;
/*     */     //   1144: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1149: goto -> 1153
/*     */     //   1152: pop
/*     */     //   1153: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #50	-> 25
/*     */     //   #43	-> 454
/*     */     //   #48	-> 469
/*     */     //   #49	-> 495
/*     */     //   #127	-> 501
/*     */     //   #50	-> 554
/*     */     //   #51	-> 557
/*     */     //   #128	-> 576
/*     */     //   #129	-> 579
/*     */     //   #130	-> 587
/*     */     //   #133	-> 595
/*     */     //   #134	-> 630
/*     */     //   #135	-> 640
/*     */     //   #136	-> 646
/*     */     //   #137	-> 653
/*     */     //   #138	-> 662
/*     */     //   #140	-> 669
/*     */     //   #139	-> 691
/*     */     //   #141	-> 701
/*     */     //   #142	-> 704
/*     */     //   #143	-> 722
/*     */     //   #144	-> 727
/*     */     //   #145	-> 739
/*     */     //   #147	-> 751
/*     */     //   #149	-> 756
/*     */     //   #150	-> 766
/*     */     //   #151	-> 779
/*     */     //   #153	-> 792
/*     */     //   #154	-> 803
/*     */     //   #155	-> 810
/*     */     //   #156	-> 838
/*     */     //   #157	-> 850
/*     */     //   #159	-> 864
/*     */     //   #154	-> 865
/*     */     //   #159	-> 866
/*     */     //   #160	-> 867
/*     */     //   #161	-> 880
/*     */     //   #149	-> 881
/*     */     //   #162	-> 882
/*     */     //   #163	-> 905
/*     */     //   #52	-> 945
/*     */     //   #53	-> 954
/*     */     //   #57	-> 1003
/*     */     //   #58	-> 1007
/*     */     //   #59	-> 1024
/*     */     //   #56	-> 1061
/*     */     //   #122	-> 1064
/*     */     //   #163	-> 1065
/*     */     //   #162	-> 1070
/*     */     //   #164	-> 1072
/*     */     //   #141	-> 1079
/*     */     //   #165	-> 1082
/*     */     //   #135	-> 1085
/*     */     //   #166	-> 1088
/*     */     //   #128	-> 1091
/*     */     //   #167	-> 1094
/*     */     //   #123	-> 1107
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   501	6	13	$i$f$getDp	I
/*     */     //   498	9	12	$this$dp$iv	I
/*     */     //   936	129	38	$i$a$-Column-TaskListKt$TaskList$1	I
/*     */     //   933	132	37	$this$TaskList_5IdfQCw_u24lambda_u240	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   933	132	36	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   933	132	35	$changed	I
/*     */     //   899	171	34	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   896	174	33	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   896	174	32	$changed$iv	I
/*     */     //   810	55	31	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   807	58	30	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   803	64	29	$i$f$set-impl	I
/*     */     //   800	67	28	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   766	115	27	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   763	118	26	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   695	388	25	$i$f$ReusableComposeNode	I
/*     */     //   692	391	23	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   692	391	24	$changed$iv$iv$iv	I
/*     */     //   634	455	19	$i$f$Layout	I
/*     */     //   651	438	20	compositeKeyHash$iv$iv	I
/*     */     //   660	429	21	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   669	420	22	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   631	458	18	$changed$iv$iv	I
/*     */     //   570	525	16	$i$f$Column	I
/*     */     //   621	474	17	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   567	528	12	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   587	508	13	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   595	500	14	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   567	528	15	$changed$iv	I
/*     */     //   40	1114	11	$dirty	I
/*     */     //   0	1154	0	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1154	1	recentTasks	Ljava/util/List;
/*     */     //   0	1154	2	selectableLazyListState	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */     //   0	1154	3	onTaskDoubleClicked	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1154	4	actionFactory	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1154	5	contentBackground	J
/*     */     //   0	1154	7	insetHorizontalPadding	F
/*     */     //   0	1154	8	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1154	9	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit TaskList_5IdfQCw$lambda$1(Modifier $modifier, List<SortedRecentTaskChain> $recentTasks, SelectableLazyListState $selectableLazyListState, Function1<? super TaskChainId, Unit> $onTaskDoubleClicked, Function2<? super SortedRecentTaskChain, ? super Integer, ? extends List<? extends ContextMenuItem>> $actionFactory, long $contentBackground, float $insetHorizontalPadding, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     TaskList-5IdfQCw($modifier, $recentTasks, $selectableLazyListState, $onTaskDoubleClicked, $actionFactory, $contentBackground, $insetHorizontalPadding, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nTaskList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskList.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/TaskListKt$TaskList$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,126:1\n1225#2,6:127\n*S KotlinDebug\n*F\n+ 1 TaskList.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/TaskListKt$TaskList$1$1\n*L\n64#1:127,6\n*E\n"})
/*     */   static final class TaskListKt$TaskList$1$1 implements Function2<Composer, Integer, Unit> {
/*     */     private static final Unit invoke$lambda$1$lambda$0(List<SortedRecentTaskChain> $recentTasks, long $contentBackground, Function2<? super SortedRecentTaskChain, ? super Integer, ? extends List<? extends ContextMenuItem>> $actionFactory, Function1<? super TaskChainId, Unit> $onTaskDoubleClicked, SelectableLazyListScope $this$SelectableLazyColumn) {
/*  65 */       Intrinsics.checkNotNullParameter($this$SelectableLazyColumn, "$this$SelectableLazyColumn"); SelectableLazyListScopeKt.items$default($this$SelectableLazyColumn, $recentTasks, null, null, null, (Function4)ComposableLambdaKt.composableLambdaInstance(-200270676, true, new TaskListKt$TaskList$1$1$1$1$1($contentBackground, $actionFactory, $recentTasks, $onTaskDoubleClicked)), 14, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 120 */       return Unit.INSTANCE;
/*     */     }
/*     */     
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
/*     */       //   13: ifne -> 325
/*     */       //   16: invokestatic isTraceInProgress : ()Z
/*     */       //   19: ifeq -> 31
/*     */       //   22: ldc 1825471980
/*     */       //   24: iload_2
/*     */       //   25: iconst_m1
/*     */       //   26: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.TaskList.<anonymous>.<anonymous> (TaskList.kt:59)'
/*     */       //   28: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   31: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   34: checkcast androidx/compose/ui/Modifier
/*     */       //   37: aload_1
/*     */       //   38: iconst_0
/*     */       //   39: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */       //   42: invokevirtual getBackgroundColor-0d7_KjU : ()J
/*     */       //   45: aconst_null
/*     */       //   46: iconst_2
/*     */       //   47: aconst_null
/*     */       //   48: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   51: aload_0
/*     */       //   52: getfield $insetHorizontalPadding : F
/*     */       //   55: fconst_0
/*     */       //   56: iconst_2
/*     */       //   57: aconst_null
/*     */       //   58: invokestatic padding-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   61: astore_3
/*     */       //   62: getstatic org/jetbrains/jewel/foundation/lazy/SelectionMode.Single : Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;
/*     */       //   65: astore #4
/*     */       //   67: aload_3
/*     */       //   68: aload #4
/*     */       //   70: aload_0
/*     */       //   71: getfield $selectableLazyListState : Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */       //   74: aconst_null
/*     */       //   75: iconst_0
/*     */       //   76: aconst_null
/*     */       //   77: aconst_null
/*     */       //   78: aconst_null
/*     */       //   79: aconst_null
/*     */       //   80: aconst_null
/*     */       //   81: aconst_null
/*     */       //   82: aconst_null
/*     */       //   83: aload_1
/*     */       //   84: ldc -1173285260
/*     */       //   86: invokeinterface startReplaceGroup : (I)V
/*     */       //   91: aload_1
/*     */       //   92: astore #6
/*     */       //   94: aload_1
/*     */       //   95: aload_0
/*     */       //   96: getfield $recentTasks : Ljava/util/List;
/*     */       //   99: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   104: aload_1
/*     */       //   105: aload_0
/*     */       //   106: getfield $contentBackground : J
/*     */       //   109: invokeinterface changed : (J)Z
/*     */       //   114: ior
/*     */       //   115: aload_1
/*     */       //   116: aload_0
/*     */       //   117: getfield $actionFactory : Lkotlin/jvm/functions/Function2;
/*     */       //   120: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   125: ior
/*     */       //   126: aload_1
/*     */       //   127: aload_0
/*     */       //   128: getfield $onTaskDoubleClicked : Lkotlin/jvm/functions/Function1;
/*     */       //   131: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   136: ior
/*     */       //   137: istore #7
/*     */       //   139: aload_0
/*     */       //   140: getfield $recentTasks : Ljava/util/List;
/*     */       //   143: astore #8
/*     */       //   145: aload_0
/*     */       //   146: getfield $contentBackground : J
/*     */       //   149: lstore #9
/*     */       //   151: aload_0
/*     */       //   152: getfield $actionFactory : Lkotlin/jvm/functions/Function2;
/*     */       //   155: astore #11
/*     */       //   157: aload_0
/*     */       //   158: getfield $onTaskDoubleClicked : Lkotlin/jvm/functions/Function1;
/*     */       //   161: astore #12
/*     */       //   163: iconst_0
/*     */       //   164: istore #13
/*     */       //   166: aload #6
/*     */       //   168: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   173: astore #14
/*     */       //   175: iconst_0
/*     */       //   176: istore #15
/*     */       //   178: iload #7
/*     */       //   180: ifne -> 194
/*     */       //   183: aload #14
/*     */       //   185: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   188: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   191: if_acmpne -> 278
/*     */       //   194: astore #29
/*     */       //   196: astore #28
/*     */       //   198: astore #27
/*     */       //   200: astore #26
/*     */       //   202: astore #25
/*     */       //   204: astore #24
/*     */       //   206: astore #23
/*     */       //   208: istore #22
/*     */       //   210: astore #21
/*     */       //   212: astore #20
/*     */       //   214: astore #19
/*     */       //   216: astore #18
/*     */       //   218: iconst_0
/*     */       //   219: istore #16
/*     */       //   221: aload #8
/*     */       //   223: lload #9
/*     */       //   225: aload #11
/*     */       //   227: aload #12
/*     */       //   229: <illegal opcode> invoke : (Ljava/util/List;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;
/*     */       //   234: astore #30
/*     */       //   236: aload #18
/*     */       //   238: aload #19
/*     */       //   240: aload #20
/*     */       //   242: aload #21
/*     */       //   244: iload #22
/*     */       //   246: aload #23
/*     */       //   248: aload #24
/*     */       //   250: aload #25
/*     */       //   252: aload #26
/*     */       //   254: aload #27
/*     */       //   256: aload #28
/*     */       //   258: aload #29
/*     */       //   260: aload #30
/*     */       //   262: astore #17
/*     */       //   264: aload #6
/*     */       //   266: aload #17
/*     */       //   268: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   273: aload #17
/*     */       //   275: goto -> 280
/*     */       //   278: aload #14
/*     */       //   280: nop
/*     */       //   281: nop
/*     */       //   282: nop
/*     */       //   283: checkcast kotlin/jvm/functions/Function1
/*     */       //   286: astore #5
/*     */       //   288: aload_1
/*     */       //   289: invokeinterface endReplaceGroup : ()V
/*     */       //   294: aload #5
/*     */       //   296: aload_1
/*     */       //   297: bipush #48
/*     */       //   299: getstatic org/jetbrains/jewel/foundation/lazy/SelectableLazyListState.$stable : I
/*     */       //   302: bipush #6
/*     */       //   304: ishl
/*     */       //   305: ior
/*     */       //   306: iconst_0
/*     */       //   307: sipush #4088
/*     */       //   310: invokestatic SelectableLazyColumn : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lorg/jetbrains/jewel/foundation/lazy/tree/KeyActions;Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
/*     */       //   313: invokestatic isTraceInProgress : ()Z
/*     */       //   316: ifeq -> 331
/*     */       //   319: invokestatic traceEventEnd : ()V
/*     */       //   322: goto -> 331
/*     */       //   325: aload_1
/*     */       //   326: invokeinterface skipToGroupEnd : ()V
/*     */       //   331: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #60	-> 0
/*     */       //   #61	-> 31
/*     */       //   #63	-> 62
/*     */       //   #61	-> 67
/*     */       //   #63	-> 68
/*     */       //   #62	-> 70
/*     */       //   #64	-> 139
/*     */       //   #127	-> 166
/*     */       //   #128	-> 178
/*     */       //   #129	-> 194
/*     */       //   #64	-> 221
/*     */       //   #129	-> 262
/*     */       //   #130	-> 264
/*     */       //   #131	-> 273
/*     */       //   #132	-> 278
/*     */       //   #128	-> 280
/*     */       //   #127	-> 281
/*     */       //   #127	-> 282
/*     */       //   #64	-> 283
/*     */       //   #60	-> 310
/*     */       //   #120	-> 325
/*     */       //   #121	-> 331
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   221	13	16	$i$a$-cache-TaskListKt$TaskList$1$1$1	I
/*     */       //   264	11	17	value$iv	Ljava/lang/Object;
/*     */       //   178	103	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   175	106	14	it$iv	Ljava/lang/Object;
/*     */       //   166	117	13	$i$f$cache	I
/*     */       //   163	120	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   163	120	7	invalid$iv	Z
/*     */       //   0	332	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/TaskListKt$TaskList$1$1;
/*     */       //   0	332	1	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	332	2	$changed	I
/*     */     }
/*     */     
/*     */     TaskListKt$TaskList$1$1(float $insetHorizontalPadding, SelectableLazyListState $selectableLazyListState, List<SortedRecentTaskChain> $recentTasks, long $contentBackground, Function2<SortedRecentTaskChain, Integer, List<ContextMenuItem>> $actionFactory, Function1<TaskChainId, Unit> $onTaskDoubleClicked) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\create\TaskListKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */