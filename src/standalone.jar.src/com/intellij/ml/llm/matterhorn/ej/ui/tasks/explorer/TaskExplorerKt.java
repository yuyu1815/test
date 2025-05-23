/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer;
/*     */ 
/*     */ import androidx.compose.foundation.BackgroundKt;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocal;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.foundation.theme.JewelTheme;
/*     */ import org.jetbrains.jewel.ui.component.TabData;
/*     */ import org.jetbrains.jewel.ui.component.TabStripKt;
/*     */ import org.jetbrains.jewel.ui.component.styling.TabColors;
/*     */ import org.jetbrains.jewel.ui.component.styling.TabMetrics;
/*     */ import org.jetbrains.jewel.ui.component.styling.TabStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.TabStylingKt;
/*     */ import org.jetbrains.jewel.ui.theme.JewelThemeKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000N\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\032Z\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\022\020\n\032\016\022\004\022\0020\t\022\004\022\0020\0010\0132\021\020\f\032\r\022\004\022\0020\0010\r¢\006\002\b\016H\007¢\006\004\b\017\020\020\032\r\020\021\032\0020\022H\003¢\006\002\020\023\0320\020\024\032\b\022\004\022\0020\0260\0252\006\020\b\032\0020\t2\022\020\n\032\016\022\004\022\0020\t\022\004\022\0020\0010\0132\006\020\006\032\0020\007\032\035\020\027\032\0020\0012\006\020\030\032\0020\0312\006\020\032\032\0020\007H\003¢\006\002\020\033¨\006\034"}, d2 = {"TaskExplorer", "", "modifier", "Landroidx/compose/ui/Modifier;", "insetHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "showHistoryTab", "", "selectedTab", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/TaskExplorerTabs;", "onTabSelected", "Lkotlin/Function1;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "TaskExplorer-RfXq3Jk", "(Landroidx/compose/ui/Modifier;FZLcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/TaskExplorerTabs;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TaskExplorerTabsStyle", "Lorg/jetbrains/jewel/ui/component/styling/TabStyle;", "(Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TabStyle;", "buildTabsData", "", "Lorg/jetbrains/jewel/ui/component/TabData$Default;", "TabTitle", "text", "", "highlight", "(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V", "standalone"})
/*     */ @SourceDebugExtension({"SMAP\nTaskExplorer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskExplorer.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/TaskExplorerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,159:1\n149#2:160\n149#2:197\n149#2:234\n149#2:243\n149#2:244\n149#2:245\n149#2:246\n86#3:161\n83#3,6:162\n89#3:196\n86#3:198\n83#3,6:199\n89#3:233\n93#3:238\n93#3:242\n79#4,6:168\n86#4,4:183\n90#4,2:193\n79#4,6:205\n86#4,4:220\n90#4,2:230\n94#4:237\n94#4:241\n79#4,6:253\n86#4,4:268\n90#4,2:278\n94#4:284\n368#5,9:174\n377#5:195\n368#5,9:211\n377#5:232\n378#5,2:235\n378#5,2:239\n368#5,9:259\n377#5:280\n378#5,2:282\n4034#6,6:187\n4034#6,6:224\n4034#6,6:272\n71#7:247\n69#7,5:248\n74#7:281\n78#7:285\n*S KotlinDebug\n*F\n+ 1 TaskExplorer.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/TaskExplorerKt\n*L\n40#1:160\n53#1:197\n73#1:234\n105#1:243\n106#1:244\n107#1:245\n147#1:246\n48#1:161\n48#1:162,6\n48#1:196\n49#1:198\n49#1:199,6\n49#1:233\n49#1:238\n48#1:242\n48#1:168,6\n48#1:183,4\n48#1:193,2\n49#1:205,6\n49#1:220,4\n49#1:230,2\n49#1:237\n48#1:241\n147#1:253,6\n147#1:268,4\n147#1:278,2\n147#1:284\n48#1:174,9\n48#1:195\n49#1:211,9\n49#1:232\n49#1:235,2\n48#1:239,2\n147#1:259,9\n147#1:280\n147#1:282,2\n48#1:187,6\n49#1:224,6\n147#1:272,6\n147#1:247\n147#1:248,5\n147#1:281\n147#1:285\n*E\n"})
/*     */ public final class TaskExplorerKt
/*     */ {
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public static final void TaskExplorer-RfXq3Jk(@Nullable Modifier modifier, float insetHorizontalPadding, boolean showHistoryTab, @NotNull TaskExplorerTabs selectedTab, @NotNull Function1 onTabSelected, @NotNull Function2 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: ldc 'selectedTab'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #4
/*     */     //   8: ldc 'onTabSelected'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload #5
/*     */     //   15: ldc 'content'
/*     */     //   17: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   20: aload #6
/*     */     //   22: ldc -578621805
/*     */     //   24: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   29: astore #6
/*     */     //   31: iload #7
/*     */     //   33: istore #9
/*     */     //   35: iload #8
/*     */     //   37: iconst_1
/*     */     //   38: iand
/*     */     //   39: ifeq -> 52
/*     */     //   42: iload #9
/*     */     //   44: bipush #6
/*     */     //   46: ior
/*     */     //   47: istore #9
/*     */     //   49: goto -> 81
/*     */     //   52: iload #7
/*     */     //   54: bipush #6
/*     */     //   56: iand
/*     */     //   57: ifne -> 81
/*     */     //   60: iload #9
/*     */     //   62: aload #6
/*     */     //   64: aload_0
/*     */     //   65: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   70: ifeq -> 77
/*     */     //   73: iconst_4
/*     */     //   74: goto -> 78
/*     */     //   77: iconst_2
/*     */     //   78: ior
/*     */     //   79: istore #9
/*     */     //   81: iload #8
/*     */     //   83: iconst_2
/*     */     //   84: iand
/*     */     //   85: ifeq -> 98
/*     */     //   88: iload #9
/*     */     //   90: bipush #48
/*     */     //   92: ior
/*     */     //   93: istore #9
/*     */     //   95: goto -> 129
/*     */     //   98: iload #7
/*     */     //   100: bipush #48
/*     */     //   102: iand
/*     */     //   103: ifne -> 129
/*     */     //   106: iload #9
/*     */     //   108: aload #6
/*     */     //   110: fload_1
/*     */     //   111: invokeinterface changed : (F)Z
/*     */     //   116: ifeq -> 124
/*     */     //   119: bipush #32
/*     */     //   121: goto -> 126
/*     */     //   124: bipush #16
/*     */     //   126: ior
/*     */     //   127: istore #9
/*     */     //   129: iload #8
/*     */     //   131: iconst_4
/*     */     //   132: iand
/*     */     //   133: ifeq -> 147
/*     */     //   136: iload #9
/*     */     //   138: sipush #384
/*     */     //   141: ior
/*     */     //   142: istore #9
/*     */     //   144: goto -> 181
/*     */     //   147: iload #7
/*     */     //   149: sipush #384
/*     */     //   152: iand
/*     */     //   153: ifne -> 181
/*     */     //   156: iload #9
/*     */     //   158: aload #6
/*     */     //   160: iload_2
/*     */     //   161: invokeinterface changed : (Z)Z
/*     */     //   166: ifeq -> 175
/*     */     //   169: sipush #256
/*     */     //   172: goto -> 178
/*     */     //   175: sipush #128
/*     */     //   178: ior
/*     */     //   179: istore #9
/*     */     //   181: iload #8
/*     */     //   183: bipush #8
/*     */     //   185: iand
/*     */     //   186: ifeq -> 200
/*     */     //   189: iload #9
/*     */     //   191: sipush #3072
/*     */     //   194: ior
/*     */     //   195: istore #9
/*     */     //   197: goto -> 234
/*     */     //   200: iload #7
/*     */     //   202: sipush #3072
/*     */     //   205: iand
/*     */     //   206: ifne -> 234
/*     */     //   209: iload #9
/*     */     //   211: aload #6
/*     */     //   213: aload_3
/*     */     //   214: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   219: ifeq -> 228
/*     */     //   222: sipush #2048
/*     */     //   225: goto -> 231
/*     */     //   228: sipush #1024
/*     */     //   231: ior
/*     */     //   232: istore #9
/*     */     //   234: iload #8
/*     */     //   236: bipush #16
/*     */     //   238: iand
/*     */     //   239: ifeq -> 253
/*     */     //   242: iload #9
/*     */     //   244: sipush #24576
/*     */     //   247: ior
/*     */     //   248: istore #9
/*     */     //   250: goto -> 288
/*     */     //   253: iload #7
/*     */     //   255: sipush #24576
/*     */     //   258: iand
/*     */     //   259: ifne -> 288
/*     */     //   262: iload #9
/*     */     //   264: aload #6
/*     */     //   266: aload #4
/*     */     //   268: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   273: ifeq -> 282
/*     */     //   276: sipush #16384
/*     */     //   279: goto -> 285
/*     */     //   282: sipush #8192
/*     */     //   285: ior
/*     */     //   286: istore #9
/*     */     //   288: iload #8
/*     */     //   290: bipush #32
/*     */     //   292: iand
/*     */     //   293: ifeq -> 306
/*     */     //   296: iload #9
/*     */     //   298: ldc 196608
/*     */     //   300: ior
/*     */     //   301: istore #9
/*     */     //   303: goto -> 338
/*     */     //   306: iload #7
/*     */     //   308: ldc 196608
/*     */     //   310: iand
/*     */     //   311: ifne -> 338
/*     */     //   314: iload #9
/*     */     //   316: aload #6
/*     */     //   318: aload #5
/*     */     //   320: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   325: ifeq -> 333
/*     */     //   328: ldc 131072
/*     */     //   330: goto -> 335
/*     */     //   333: ldc 65536
/*     */     //   335: ior
/*     */     //   336: istore #9
/*     */     //   338: iload #9
/*     */     //   340: ldc 74899
/*     */     //   342: iand
/*     */     //   343: ldc 74898
/*     */     //   345: if_icmpne -> 358
/*     */     //   348: aload #6
/*     */     //   350: invokeinterface getSkipping : ()Z
/*     */     //   355: ifne -> 1410
/*     */     //   358: iload #8
/*     */     //   360: iconst_1
/*     */     //   361: iand
/*     */     //   362: ifeq -> 372
/*     */     //   365: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   368: checkcast androidx/compose/ui/Modifier
/*     */     //   371: astore_0
/*     */     //   372: iload #8
/*     */     //   374: iconst_2
/*     */     //   375: iand
/*     */     //   376: ifeq -> 392
/*     */     //   379: iconst_0
/*     */     //   380: istore #10
/*     */     //   382: iconst_0
/*     */     //   383: istore #11
/*     */     //   385: iload #10
/*     */     //   387: i2f
/*     */     //   388: invokestatic constructor-impl : (F)F
/*     */     //   391: fstore_1
/*     */     //   392: invokestatic isTraceInProgress : ()Z
/*     */     //   395: ifeq -> 408
/*     */     //   398: ldc -578621805
/*     */     //   400: iload #9
/*     */     //   402: iconst_m1
/*     */     //   403: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer.TaskExplorer (TaskExplorer.kt:44)'
/*     */     //   405: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   408: aload #6
/*     */     //   410: iconst_0
/*     */     //   411: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   414: invokevirtual getArrowRightInactiveIconTint-0d7_KjU : ()J
/*     */     //   417: lstore #10
/*     */     //   419: aload_0
/*     */     //   420: astore #12
/*     */     //   422: bipush #14
/*     */     //   424: iload #9
/*     */     //   426: iand
/*     */     //   427: istore #15
/*     */     //   429: iconst_0
/*     */     //   430: istore #16
/*     */     //   432: aload #6
/*     */     //   434: ldc -483455358
/*     */     //   436: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   438: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   441: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   444: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   447: astore #13
/*     */     //   449: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   452: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   455: astore #14
/*     */     //   457: aload #13
/*     */     //   459: aload #14
/*     */     //   461: aload #6
/*     */     //   463: bipush #14
/*     */     //   465: iload #15
/*     */     //   467: iconst_3
/*     */     //   468: ishr
/*     */     //   469: iand
/*     */     //   470: bipush #112
/*     */     //   472: iload #15
/*     */     //   474: iconst_3
/*     */     //   475: ishr
/*     */     //   476: iand
/*     */     //   477: ior
/*     */     //   478: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   481: astore #17
/*     */     //   483: bipush #112
/*     */     //   485: iload #15
/*     */     //   487: iconst_3
/*     */     //   488: ishl
/*     */     //   489: iand
/*     */     //   490: istore #18
/*     */     //   492: nop
/*     */     //   493: iconst_0
/*     */     //   494: istore #19
/*     */     //   496: aload #6
/*     */     //   498: ldc -1323940314
/*     */     //   500: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   502: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   505: aload #6
/*     */     //   507: iconst_0
/*     */     //   508: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   511: istore #20
/*     */     //   513: aload #6
/*     */     //   515: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   520: astore #21
/*     */     //   522: aload #6
/*     */     //   524: aload #12
/*     */     //   526: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   529: astore #22
/*     */     //   531: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   534: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   537: astore #23
/*     */     //   539: bipush #6
/*     */     //   541: sipush #896
/*     */     //   544: iload #18
/*     */     //   546: bipush #6
/*     */     //   548: ishl
/*     */     //   549: iand
/*     */     //   550: ior
/*     */     //   551: istore #24
/*     */     //   553: nop
/*     */     //   554: iconst_0
/*     */     //   555: istore #25
/*     */     //   557: aload #6
/*     */     //   559: ldc -692256719
/*     */     //   561: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   563: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   566: aload #6
/*     */     //   568: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   573: instanceof androidx/compose/runtime/Applier
/*     */     //   576: ifne -> 582
/*     */     //   579: invokestatic invalidApplier : ()V
/*     */     //   582: aload #6
/*     */     //   584: invokeinterface startReusableNode : ()V
/*     */     //   589: aload #6
/*     */     //   591: invokeinterface getInserting : ()Z
/*     */     //   596: ifeq -> 611
/*     */     //   599: aload #6
/*     */     //   601: aload #23
/*     */     //   603: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   608: goto -> 618
/*     */     //   611: aload #6
/*     */     //   613: invokeinterface useNode : ()V
/*     */     //   618: aload #6
/*     */     //   620: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   623: astore #26
/*     */     //   625: iconst_0
/*     */     //   626: istore #27
/*     */     //   628: aload #26
/*     */     //   630: aload #17
/*     */     //   632: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   635: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   638: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   641: aload #26
/*     */     //   643: aload #21
/*     */     //   645: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   648: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   651: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   654: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   657: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   660: astore #28
/*     */     //   662: iconst_0
/*     */     //   663: istore #29
/*     */     //   665: aload #26
/*     */     //   667: astore #30
/*     */     //   669: iconst_0
/*     */     //   670: istore #31
/*     */     //   672: aload #30
/*     */     //   674: invokeinterface getInserting : ()Z
/*     */     //   679: ifne -> 700
/*     */     //   682: aload #30
/*     */     //   684: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   689: iload #20
/*     */     //   691: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   694: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   697: ifne -> 726
/*     */     //   700: aload #30
/*     */     //   702: iload #20
/*     */     //   704: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   707: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   712: aload #26
/*     */     //   714: iload #20
/*     */     //   716: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   719: aload #28
/*     */     //   721: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   726: nop
/*     */     //   727: nop
/*     */     //   728: nop
/*     */     //   729: aload #26
/*     */     //   731: aload #22
/*     */     //   733: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   736: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   739: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   742: nop
/*     */     //   743: nop
/*     */     //   744: aload #6
/*     */     //   746: bipush #14
/*     */     //   748: iload #24
/*     */     //   750: bipush #6
/*     */     //   752: ishr
/*     */     //   753: iand
/*     */     //   754: istore #32
/*     */     //   756: astore #33
/*     */     //   758: iconst_0
/*     */     //   759: istore #34
/*     */     //   761: aload #33
/*     */     //   763: ldc -384784025
/*     */     //   765: ldc 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   767: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   770: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   773: aload #33
/*     */     //   775: bipush #6
/*     */     //   777: bipush #112
/*     */     //   779: iload #15
/*     */     //   781: bipush #6
/*     */     //   783: ishr
/*     */     //   784: iand
/*     */     //   785: ior
/*     */     //   786: istore #35
/*     */     //   788: astore #36
/*     */     //   790: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   793: astore #37
/*     */     //   795: iconst_0
/*     */     //   796: istore #38
/*     */     //   798: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   801: checkcast androidx/compose/ui/Modifier
/*     */     //   804: aload #36
/*     */     //   806: iconst_0
/*     */     //   807: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   810: invokevirtual getBackgroundColor-0d7_KjU : ()J
/*     */     //   813: aconst_null
/*     */     //   814: iconst_2
/*     */     //   815: aconst_null
/*     */     //   816: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   819: fload_1
/*     */     //   820: bipush #8
/*     */     //   822: istore #39
/*     */     //   824: iconst_0
/*     */     //   825: istore #40
/*     */     //   827: iload #39
/*     */     //   829: i2f
/*     */     //   830: invokestatic constructor-impl : (F)F
/*     */     //   833: invokestatic padding-VpY3zN4 : (Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;
/*     */     //   836: astore #39
/*     */     //   838: iconst_0
/*     */     //   839: istore #41
/*     */     //   841: nop
/*     */     //   842: iconst_0
/*     */     //   843: istore #42
/*     */     //   845: aload #36
/*     */     //   847: ldc -483455358
/*     */     //   849: ldc 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   851: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   854: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   857: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   860: astore #40
/*     */     //   862: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   865: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   868: astore #43
/*     */     //   870: aload #40
/*     */     //   872: aload #43
/*     */     //   874: aload #36
/*     */     //   876: bipush #14
/*     */     //   878: iload #41
/*     */     //   880: iconst_3
/*     */     //   881: ishr
/*     */     //   882: iand
/*     */     //   883: bipush #112
/*     */     //   885: iload #41
/*     */     //   887: iconst_3
/*     */     //   888: ishr
/*     */     //   889: iand
/*     */     //   890: ior
/*     */     //   891: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   894: astore #44
/*     */     //   896: bipush #112
/*     */     //   898: iload #41
/*     */     //   900: iconst_3
/*     */     //   901: ishl
/*     */     //   902: iand
/*     */     //   903: istore #45
/*     */     //   905: nop
/*     */     //   906: iconst_0
/*     */     //   907: istore #46
/*     */     //   909: aload #36
/*     */     //   911: ldc -1323940314
/*     */     //   913: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   915: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   918: aload #36
/*     */     //   920: iconst_0
/*     */     //   921: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   924: istore #47
/*     */     //   926: aload #36
/*     */     //   928: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   933: astore #48
/*     */     //   935: aload #36
/*     */     //   937: aload #39
/*     */     //   939: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   942: astore #49
/*     */     //   944: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   947: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   950: astore #50
/*     */     //   952: bipush #6
/*     */     //   954: sipush #896
/*     */     //   957: iload #45
/*     */     //   959: bipush #6
/*     */     //   961: ishl
/*     */     //   962: iand
/*     */     //   963: ior
/*     */     //   964: istore #51
/*     */     //   966: nop
/*     */     //   967: iconst_0
/*     */     //   968: istore #52
/*     */     //   970: aload #36
/*     */     //   972: ldc -692256719
/*     */     //   974: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   976: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   979: aload #36
/*     */     //   981: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   986: instanceof androidx/compose/runtime/Applier
/*     */     //   989: ifne -> 995
/*     */     //   992: invokestatic invalidApplier : ()V
/*     */     //   995: aload #36
/*     */     //   997: invokeinterface startReusableNode : ()V
/*     */     //   1002: aload #36
/*     */     //   1004: invokeinterface getInserting : ()Z
/*     */     //   1009: ifeq -> 1024
/*     */     //   1012: aload #36
/*     */     //   1014: aload #50
/*     */     //   1016: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1021: goto -> 1031
/*     */     //   1024: aload #36
/*     */     //   1026: invokeinterface useNode : ()V
/*     */     //   1031: aload #36
/*     */     //   1033: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1036: astore #53
/*     */     //   1038: iconst_0
/*     */     //   1039: istore #54
/*     */     //   1041: aload #53
/*     */     //   1043: aload #44
/*     */     //   1045: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1048: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1051: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1054: aload #53
/*     */     //   1056: aload #48
/*     */     //   1058: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1061: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1064: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1067: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1070: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1073: astore #55
/*     */     //   1075: iconst_0
/*     */     //   1076: istore #56
/*     */     //   1078: aload #53
/*     */     //   1080: astore #57
/*     */     //   1082: iconst_0
/*     */     //   1083: istore #58
/*     */     //   1085: aload #57
/*     */     //   1087: invokeinterface getInserting : ()Z
/*     */     //   1092: ifne -> 1113
/*     */     //   1095: aload #57
/*     */     //   1097: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1102: iload #47
/*     */     //   1104: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1107: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1110: ifne -> 1139
/*     */     //   1113: aload #57
/*     */     //   1115: iload #47
/*     */     //   1117: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1120: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1125: aload #53
/*     */     //   1127: iload #47
/*     */     //   1129: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1132: aload #55
/*     */     //   1134: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1139: nop
/*     */     //   1140: nop
/*     */     //   1141: nop
/*     */     //   1142: aload #53
/*     */     //   1144: aload #49
/*     */     //   1146: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1149: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1152: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1155: nop
/*     */     //   1156: nop
/*     */     //   1157: aload #36
/*     */     //   1159: bipush #14
/*     */     //   1161: iload #51
/*     */     //   1163: bipush #6
/*     */     //   1165: ishr
/*     */     //   1166: iand
/*     */     //   1167: istore #59
/*     */     //   1169: astore #60
/*     */     //   1171: iconst_0
/*     */     //   1172: istore #61
/*     */     //   1174: aload #60
/*     */     //   1176: ldc -384784025
/*     */     //   1178: ldc 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   1180: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1183: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   1186: aload #60
/*     */     //   1188: bipush #6
/*     */     //   1190: bipush #112
/*     */     //   1192: iload #41
/*     */     //   1194: bipush #6
/*     */     //   1196: ishr
/*     */     //   1197: iand
/*     */     //   1198: ior
/*     */     //   1199: istore #62
/*     */     //   1201: astore #63
/*     */     //   1203: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   1206: astore #64
/*     */     //   1208: iconst_0
/*     */     //   1209: istore #65
/*     */     //   1211: invokestatic getLocalDefaultTabStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   1214: aload #63
/*     */     //   1216: iconst_0
/*     */     //   1217: invokestatic TaskExplorerTabsStyle : (Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TabStyle;
/*     */     //   1220: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   1223: ldc_w -317946561
/*     */     //   1226: iconst_1
/*     */     //   1227: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/TaskExplorerKt$TaskExplorer$1$1$1
/*     */     //   1230: dup
/*     */     //   1231: aload_3
/*     */     //   1232: aload #4
/*     */     //   1234: iload_2
/*     */     //   1235: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/TaskExplorerTabs;Lkotlin/jvm/functions/Function1;Z)V
/*     */     //   1238: aload #63
/*     */     //   1240: bipush #54
/*     */     //   1242: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1245: checkcast kotlin/jvm/functions/Function2
/*     */     //   1248: aload #63
/*     */     //   1250: bipush #48
/*     */     //   1252: getstatic androidx/compose/runtime/ProvidedValue.$stable : I
/*     */     //   1255: ior
/*     */     //   1256: invokestatic CompositionLocalProvider : (Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1259: getstatic org/jetbrains/jewel/ui/Orientation.Horizontal : Lorg/jetbrains/jewel/ui/Orientation;
/*     */     //   1262: astore #66
/*     */     //   1264: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1267: checkcast androidx/compose/ui/Modifier
/*     */     //   1270: fconst_0
/*     */     //   1271: iconst_1
/*     */     //   1272: aconst_null
/*     */     //   1273: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1276: fconst_0
/*     */     //   1277: bipush #8
/*     */     //   1279: istore #67
/*     */     //   1281: iconst_0
/*     */     //   1282: istore #68
/*     */     //   1284: iload #67
/*     */     //   1286: i2f
/*     */     //   1287: invokestatic constructor-impl : (F)F
/*     */     //   1290: iconst_1
/*     */     //   1291: aconst_null
/*     */     //   1292: invokestatic padding-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1295: astore #69
/*     */     //   1297: aload #66
/*     */     //   1299: aload #69
/*     */     //   1301: lload #10
/*     */     //   1303: fconst_0
/*     */     //   1304: fconst_0
/*     */     //   1305: aconst_null
/*     */     //   1306: aload #63
/*     */     //   1308: bipush #54
/*     */     //   1310: bipush #56
/*     */     //   1312: invokestatic Divider-RLL6an4 : (Lorg/jetbrains/jewel/ui/Orientation;Landroidx/compose/ui/Modifier;JFFLorg/jetbrains/jewel/ui/component/styling/DividerStyle;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1315: nop
/*     */     //   1316: aload #60
/*     */     //   1318: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1321: aload #36
/*     */     //   1323: invokeinterface endNode : ()V
/*     */     //   1328: aload #36
/*     */     //   1330: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1333: nop
/*     */     //   1334: aload #36
/*     */     //   1336: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1339: nop
/*     */     //   1340: aload #36
/*     */     //   1342: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1345: nop
/*     */     //   1346: aload #5
/*     */     //   1348: aload #36
/*     */     //   1350: bipush #14
/*     */     //   1352: iload #9
/*     */     //   1354: bipush #15
/*     */     //   1356: ishr
/*     */     //   1357: iand
/*     */     //   1358: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1361: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1366: pop
/*     */     //   1367: nop
/*     */     //   1368: aload #33
/*     */     //   1370: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1373: aload #6
/*     */     //   1375: invokeinterface endNode : ()V
/*     */     //   1380: aload #6
/*     */     //   1382: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1385: nop
/*     */     //   1386: aload #6
/*     */     //   1388: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1391: nop
/*     */     //   1392: aload #6
/*     */     //   1394: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1397: nop
/*     */     //   1398: invokestatic isTraceInProgress : ()Z
/*     */     //   1401: ifeq -> 1417
/*     */     //   1404: invokestatic traceEventEnd : ()V
/*     */     //   1407: goto -> 1417
/*     */     //   1410: aload #6
/*     */     //   1412: invokeinterface skipToGroupEnd : ()V
/*     */     //   1417: aload #6
/*     */     //   1419: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1424: dup
/*     */     //   1425: ifnull -> 1453
/*     */     //   1428: aload_0
/*     */     //   1429: fload_1
/*     */     //   1430: iload_2
/*     */     //   1431: aload_3
/*     */     //   1432: aload #4
/*     */     //   1434: aload #5
/*     */     //   1436: iload #7
/*     */     //   1438: iload #8
/*     */     //   1440: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;FZLcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/TaskExplorerTabs;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;II)Lkotlin/jvm/functions/Function2;
/*     */     //   1445: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1450: goto -> 1454
/*     */     //   1453: pop
/*     */     //   1454: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #45	-> 20
/*     */     //   #39	-> 365
/*     */     //   #40	-> 379
/*     */     //   #160	-> 385
/*     */     //   #45	-> 405
/*     */     //   #46	-> 411
/*     */     //   #48	-> 419
/*     */     //   #161	-> 438
/*     */     //   #162	-> 441
/*     */     //   #163	-> 449
/*     */     //   #166	-> 457
/*     */     //   #167	-> 492
/*     */     //   #168	-> 502
/*     */     //   #169	-> 508
/*     */     //   #170	-> 515
/*     */     //   #171	-> 524
/*     */     //   #173	-> 531
/*     */     //   #172	-> 553
/*     */     //   #174	-> 563
/*     */     //   #175	-> 566
/*     */     //   #176	-> 584
/*     */     //   #177	-> 589
/*     */     //   #178	-> 601
/*     */     //   #180	-> 613
/*     */     //   #182	-> 618
/*     */     //   #183	-> 628
/*     */     //   #184	-> 641
/*     */     //   #186	-> 654
/*     */     //   #187	-> 665
/*     */     //   #188	-> 672
/*     */     //   #189	-> 700
/*     */     //   #190	-> 712
/*     */     //   #192	-> 726
/*     */     //   #187	-> 727
/*     */     //   #192	-> 728
/*     */     //   #193	-> 729
/*     */     //   #194	-> 742
/*     */     //   #182	-> 743
/*     */     //   #195	-> 744
/*     */     //   #196	-> 767
/*     */     //   #51	-> 798
/*     */     //   #52	-> 807
/*     */     //   #53	-> 819
/*     */     //   #197	-> 827
/*     */     //   #53	-> 833
/*     */     //   #49	-> 841
/*     */     //   #198	-> 851
/*     */     //   #199	-> 854
/*     */     //   #200	-> 862
/*     */     //   #203	-> 870
/*     */     //   #204	-> 905
/*     */     //   #205	-> 915
/*     */     //   #206	-> 921
/*     */     //   #207	-> 928
/*     */     //   #208	-> 937
/*     */     //   #210	-> 944
/*     */     //   #209	-> 966
/*     */     //   #211	-> 976
/*     */     //   #212	-> 979
/*     */     //   #213	-> 997
/*     */     //   #214	-> 1002
/*     */     //   #215	-> 1014
/*     */     //   #217	-> 1026
/*     */     //   #219	-> 1031
/*     */     //   #220	-> 1041
/*     */     //   #221	-> 1054
/*     */     //   #223	-> 1067
/*     */     //   #224	-> 1078
/*     */     //   #225	-> 1085
/*     */     //   #226	-> 1113
/*     */     //   #227	-> 1125
/*     */     //   #229	-> 1139
/*     */     //   #224	-> 1140
/*     */     //   #229	-> 1141
/*     */     //   #230	-> 1142
/*     */     //   #231	-> 1155
/*     */     //   #219	-> 1156
/*     */     //   #232	-> 1157
/*     */     //   #233	-> 1180
/*     */     //   #56	-> 1211
/*     */     //   #57	-> 1223
/*     */     //   #55	-> 1256
/*     */     //   #71	-> 1259
/*     */     //   #73	-> 1264
/*     */     //   #234	-> 1284
/*     */     //   #73	-> 1290
/*     */     //   #71	-> 1297
/*     */     //   #73	-> 1299
/*     */     //   #72	-> 1301
/*     */     //   #70	-> 1312
/*     */     //   #75	-> 1315
/*     */     //   #233	-> 1316
/*     */     //   #232	-> 1321
/*     */     //   #235	-> 1323
/*     */     //   #211	-> 1330
/*     */     //   #236	-> 1333
/*     */     //   #205	-> 1336
/*     */     //   #237	-> 1339
/*     */     //   #198	-> 1342
/*     */     //   #238	-> 1345
/*     */     //   #76	-> 1346
/*     */     //   #77	-> 1367
/*     */     //   #196	-> 1368
/*     */     //   #195	-> 1373
/*     */     //   #239	-> 1375
/*     */     //   #174	-> 1382
/*     */     //   #240	-> 1385
/*     */     //   #168	-> 1388
/*     */     //   #241	-> 1391
/*     */     //   #161	-> 1394
/*     */     //   #242	-> 1397
/*     */     //   #78	-> 1410
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   385	6	11	$i$f$getDp	I
/*     */     //   382	9	10	$this$dp$iv	I
/*     */     //   827	6	40	$i$f$getDp	I
/*     */     //   824	9	39	$this$dp$iv	I
/*     */     //   1284	6	68	$i$f$getDp	I
/*     */     //   1281	9	67	$this$dp$iv	I
/*     */     //   1211	105	65	$i$a$-Column-TaskExplorerKt$TaskExplorer$1$1	I
/*     */     //   1208	108	64	$this$TaskExplorer_RfXq3Jk_u24lambda_u241_u24lambda_u240	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   1208	108	63	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1208	108	62	$changed	I
/*     */     //   1174	147	61	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   1171	150	60	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1171	150	59	$changed$iv	I
/*     */     //   1085	55	58	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1082	58	57	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1078	64	56	$i$f$set-impl	I
/*     */     //   1075	67	55	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1041	115	54	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1038	118	53	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   970	364	52	$i$f$ReusableComposeNode	I
/*     */     //   967	367	50	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   967	367	51	$changed$iv$iv$iv	I
/*     */     //   909	431	46	$i$f$Layout	I
/*     */     //   926	414	47	compositeKeyHash$iv$iv	I
/*     */     //   935	405	48	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   944	396	49	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   906	434	45	$changed$iv$iv	I
/*     */     //   845	501	42	$i$f$Column	I
/*     */     //   896	450	44	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   842	504	39	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   862	484	40	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   870	476	43	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   842	504	41	$changed$iv	I
/*     */     //   798	570	38	$i$a$-Column-TaskExplorerKt$TaskExplorer$1	I
/*     */     //   795	573	37	$this$TaskExplorer_RfXq3Jk_u24lambda_u241	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   795	573	36	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   795	573	35	$changed	I
/*     */     //   761	612	34	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   758	615	33	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   758	615	32	$changed$iv	I
/*     */     //   672	55	31	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   669	58	30	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   665	64	29	$i$f$set-impl	I
/*     */     //   662	67	28	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   628	115	27	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   625	118	26	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   557	829	25	$i$f$ReusableComposeNode	I
/*     */     //   554	832	23	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   554	832	24	$changed$iv$iv$iv	I
/*     */     //   496	896	19	$i$f$Layout	I
/*     */     //   513	879	20	compositeKeyHash$iv$iv	I
/*     */     //   522	870	21	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   531	861	22	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   493	899	18	$changed$iv$iv	I
/*     */     //   432	966	16	$i$f$Column	I
/*     */     //   483	915	17	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   429	969	12	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   449	949	13	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   457	941	14	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   429	969	15	$changed$iv	I
/*     */     //   419	988	10	dividerColor	J
/*     */     //   35	1420	9	$dirty	I
/*     */     //   0	1455	0	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1455	1	insetHorizontalPadding	F
/*     */     //   0	1455	2	showHistoryTab	Z
/*     */     //   0	1455	3	selectedTab	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/TaskExplorerTabs;
/*     */     //   0	1455	4	onTabSelected	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1455	5	content	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1455	6	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1455	7	$changed	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nTaskExplorer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskExplorer.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/TaskExplorerKt$TaskExplorer$1$1$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,159:1\n77#2:160\n*S KotlinDebug\n*F\n+ 1 TaskExplorer.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/TaskExplorerKt$TaskExplorer$1$1$1\n*L\n66#1:160\n*E\n"})
/*     */   static final class TaskExplorerKt$TaskExplorer$1$1$1
/*     */     implements Function2<Composer, Integer, Unit>
/*     */   {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*  58 */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-317946561, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer.TaskExplorer.<anonymous>.<anonymous>.<anonymous> (TaskExplorer.kt:57)"); 
/*  59 */         Modifier modifier = BackgroundKt.background-bw27NRU$default((Modifier)Modifier.Companion, MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getBackgroundColor-0d7_KjU(), null, 2, null);
/*     */         
/*  61 */         List<TabData.Default> list = TaskExplorerKt.buildTabsData(
/*  62 */             this.$selectedTab, 
/*  63 */             this.$onTabSelected, 
/*  64 */             this.$showHistoryTab);
/*     */         
/*  66 */         CompositionLocal compositionLocal = (CompositionLocal)TabStylingKt.getLocalDefaultTabStyle(); int $changed$iv = 0, $i$f$getCurrent = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 160 */         ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); TabStyle tabStyle = (TabStyle)object;
/*     */         TabStripKt.TabStrip(list, tabStyle, modifier, false, $composer, 0, 8);
/*     */         if (ComposerKt.isTraceInProgress()) {
/*     */           ComposerKt.traceEventEnd();
/*     */         } }
/*     */       else
/*     */       { $composer.skipToGroupEnd(); }
/*     */     
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     TaskExplorerKt$TaskExplorer$1$1$1(TaskExplorerTabs $selectedTab, Function1<TaskExplorerTabs, Unit> $onTabSelected, boolean $showHistoryTab) {}
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Composable
/*     */   private static final TabStyle TaskExplorerTabsStyle(Composer $composer, int $changed) {
/*     */     $composer.startReplaceGroup(551660207);
/*     */     if (ComposerKt.isTraceInProgress()) {
/*     */       ComposerKt.traceEventStart(551660207, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer.TaskExplorerTabsStyle (TaskExplorer.kt:80)");
/*     */     }
/*     */     TabStyle currentStyle = JewelThemeKt.getEditorTabStyle(JewelTheme.Companion, $composer, 6);
/*     */     long colorBackground = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getBackgroundColor-0d7_KjU();
/*     */     int $this$dp$iv = 0, $i$f$getDp = 0;
/*     */     $this$dp$iv = 8;
/*     */     $i$f$getDp = 0;
/*     */     $this$dp$iv = 25;
/*     */     $i$f$getDp = 0;
/* 243 */     TabStyle tabStyle1 = new TabStyle(new TabColors(colorBackground, colorBackground, colorBackground, colorBackground, colorBackground, currentStyle.getColors().getContent-0d7_KjU(), currentStyle.getColors().getContentDisabled-0d7_KjU(), currentStyle.getColors().getContentPressed-0d7_KjU(), currentStyle.getColors().getContent-0d7_KjU(), currentStyle.getColors().getContentSelected-0d7_KjU(), Color.Companion.getTransparent-0d7_KjU(), Color.Companion.getTransparent-0d7_KjU(), Color.Companion.getTransparent-0d7_KjU(), Color.Companion.getTransparent-0d7_KjU(), Color.Companion.getTransparent-0d7_KjU(), null), new TabMetrics(Dp.constructor-impl($this$dp$iv), PaddingKt.PaddingValues-YgX7TsA$default(
/* 244 */             Dp.constructor-impl($this$dp$iv), 0.0F, 2, null), 
/* 245 */           Dp.constructor-impl($this$dp$iv), currentStyle.getMetrics().getTabContentSpacing-D9Ej5fM(), currentStyle.getMetrics().getCloseContentGap-D9Ej5fM(), null), currentStyle.getIcons(), currentStyle.getContentAlpha(), currentStyle.getScrollbarStyle());
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return tabStyle1;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final List<TabData.Default> buildTabsData(@NotNull TaskExplorerTabs selectedTab, @NotNull Function1 onTabSelected, boolean showHistoryTab) {
/*     */     Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
/*     */     Intrinsics.checkNotNullParameter(onTabSelected, "onTabSelected");
/*     */     List<TabData.Default> list1 = CollectionsKt.createListBuilder(), $this$buildTabsData_u24lambda_u245 = list1;
/*     */     int $i$a$-buildList-TaskExplorerKt$buildTabsData$1 = 0;
/*     */     if (showHistoryTab)
/*     */       $this$buildTabsData_u24lambda_u245.add(new TabData.Default((selectedTab == TaskExplorerTabs.History), ComposableSingletons$TaskExplorerKt.INSTANCE.getLambda-1$standalone(), false, null, onTabSelected::buildTabsData$lambda$5$lambda$3, 8, null)); 
/*     */     $this$buildTabsData_u24lambda_u245.add(new TabData.Default((selectedTab == TaskExplorerTabs.Favorites), ComposableSingletons$TaskExplorerKt.INSTANCE.getLambda-2$standalone(), false, null, onTabSelected::buildTabsData$lambda$5$lambda$4, 8, null));
/*     */     return CollectionsKt.build(list1);
/*     */   }
/*     */   
/*     */   private static final Unit buildTabsData$lambda$5$lambda$3(Function1 $onTabSelected) {
/*     */     $onTabSelected.invoke(TaskExplorerTabs.History);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit buildTabsData$lambda$5$lambda$4(Function1 $onTabSelected) {
/*     */     $onTabSelected.invoke(TaskExplorerTabs.Favorites);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   private static final void TabTitle(String text, boolean highlight, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc_w 1635852356
/*     */     //   4: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   9: astore_2
/*     */     //   10: iload_3
/*     */     //   11: istore #4
/*     */     //   13: iload_3
/*     */     //   14: bipush #6
/*     */     //   16: iand
/*     */     //   17: ifne -> 40
/*     */     //   20: iload #4
/*     */     //   22: aload_2
/*     */     //   23: aload_0
/*     */     //   24: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   29: ifeq -> 36
/*     */     //   32: iconst_4
/*     */     //   33: goto -> 37
/*     */     //   36: iconst_2
/*     */     //   37: ior
/*     */     //   38: istore #4
/*     */     //   40: iload_3
/*     */     //   41: bipush #48
/*     */     //   43: iand
/*     */     //   44: ifne -> 69
/*     */     //   47: iload #4
/*     */     //   49: aload_2
/*     */     //   50: iload_1
/*     */     //   51: invokeinterface changed : (Z)Z
/*     */     //   56: ifeq -> 64
/*     */     //   59: bipush #32
/*     */     //   61: goto -> 66
/*     */     //   64: bipush #16
/*     */     //   66: ior
/*     */     //   67: istore #4
/*     */     //   69: iload #4
/*     */     //   71: bipush #19
/*     */     //   73: iand
/*     */     //   74: bipush #18
/*     */     //   76: if_icmpne -> 88
/*     */     //   79: aload_2
/*     */     //   80: invokeinterface getSkipping : ()Z
/*     */     //   85: ifne -> 586
/*     */     //   88: invokestatic isTraceInProgress : ()Z
/*     */     //   91: ifeq -> 106
/*     */     //   94: ldc_w 1635852356
/*     */     //   97: iload #4
/*     */     //   99: iconst_m1
/*     */     //   100: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer.TabTitle (TaskExplorer.kt:145)'
/*     */     //   103: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   106: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   109: checkcast androidx/compose/ui/Modifier
/*     */     //   112: bipush #30
/*     */     //   114: istore #5
/*     */     //   116: iconst_0
/*     */     //   117: istore #6
/*     */     //   119: iload #5
/*     */     //   121: i2f
/*     */     //   122: invokestatic constructor-impl : (F)F
/*     */     //   125: invokestatic height-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   128: astore #5
/*     */     //   130: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   133: invokevirtual getBottomCenter : ()Landroidx/compose/ui/Alignment;
/*     */     //   136: astore #6
/*     */     //   138: bipush #54
/*     */     //   140: istore #8
/*     */     //   142: iconst_0
/*     */     //   143: istore #9
/*     */     //   145: aload_2
/*     */     //   146: ldc_w 733328855
/*     */     //   149: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   152: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   155: iconst_0
/*     */     //   156: istore #7
/*     */     //   158: aload #6
/*     */     //   160: iload #7
/*     */     //   162: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   165: astore #10
/*     */     //   167: bipush #112
/*     */     //   169: iload #8
/*     */     //   171: iconst_3
/*     */     //   172: ishl
/*     */     //   173: iand
/*     */     //   174: istore #11
/*     */     //   176: nop
/*     */     //   177: iconst_0
/*     */     //   178: istore #12
/*     */     //   180: aload_2
/*     */     //   181: ldc -1323940314
/*     */     //   183: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   185: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   188: aload_2
/*     */     //   189: iconst_0
/*     */     //   190: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   193: istore #13
/*     */     //   195: aload_2
/*     */     //   196: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   201: astore #14
/*     */     //   203: aload_2
/*     */     //   204: aload #5
/*     */     //   206: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   209: astore #15
/*     */     //   211: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   214: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   217: astore #16
/*     */     //   219: bipush #6
/*     */     //   221: sipush #896
/*     */     //   224: iload #11
/*     */     //   226: bipush #6
/*     */     //   228: ishl
/*     */     //   229: iand
/*     */     //   230: ior
/*     */     //   231: istore #17
/*     */     //   233: nop
/*     */     //   234: iconst_0
/*     */     //   235: istore #18
/*     */     //   237: aload_2
/*     */     //   238: ldc -692256719
/*     */     //   240: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   242: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   245: aload_2
/*     */     //   246: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   251: instanceof androidx/compose/runtime/Applier
/*     */     //   254: ifne -> 260
/*     */     //   257: invokestatic invalidApplier : ()V
/*     */     //   260: aload_2
/*     */     //   261: invokeinterface startReusableNode : ()V
/*     */     //   266: aload_2
/*     */     //   267: invokeinterface getInserting : ()Z
/*     */     //   272: ifeq -> 286
/*     */     //   275: aload_2
/*     */     //   276: aload #16
/*     */     //   278: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   283: goto -> 292
/*     */     //   286: aload_2
/*     */     //   287: invokeinterface useNode : ()V
/*     */     //   292: aload_2
/*     */     //   293: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   296: astore #19
/*     */     //   298: iconst_0
/*     */     //   299: istore #20
/*     */     //   301: aload #19
/*     */     //   303: aload #10
/*     */     //   305: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   308: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   311: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   314: aload #19
/*     */     //   316: aload #14
/*     */     //   318: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   321: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   324: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   327: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   330: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   333: astore #21
/*     */     //   335: iconst_0
/*     */     //   336: istore #22
/*     */     //   338: aload #19
/*     */     //   340: astore #23
/*     */     //   342: iconst_0
/*     */     //   343: istore #24
/*     */     //   345: aload #23
/*     */     //   347: invokeinterface getInserting : ()Z
/*     */     //   352: ifne -> 373
/*     */     //   355: aload #23
/*     */     //   357: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   362: iload #13
/*     */     //   364: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   367: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   370: ifne -> 399
/*     */     //   373: aload #23
/*     */     //   375: iload #13
/*     */     //   377: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   380: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   385: aload #19
/*     */     //   387: iload #13
/*     */     //   389: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   392: aload #21
/*     */     //   394: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   399: nop
/*     */     //   400: nop
/*     */     //   401: nop
/*     */     //   402: aload #19
/*     */     //   404: aload #15
/*     */     //   406: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   409: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   412: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   415: nop
/*     */     //   416: nop
/*     */     //   417: aload_2
/*     */     //   418: bipush #14
/*     */     //   420: iload #17
/*     */     //   422: bipush #6
/*     */     //   424: ishr
/*     */     //   425: iand
/*     */     //   426: istore #25
/*     */     //   428: astore #26
/*     */     //   430: iconst_0
/*     */     //   431: istore #27
/*     */     //   433: aload #26
/*     */     //   435: ldc_w -2146769399
/*     */     //   438: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   441: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   444: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   447: aload #26
/*     */     //   449: bipush #6
/*     */     //   451: bipush #112
/*     */     //   453: iload #8
/*     */     //   455: bipush #6
/*     */     //   457: ishr
/*     */     //   458: iand
/*     */     //   459: ior
/*     */     //   460: istore #28
/*     */     //   462: astore #29
/*     */     //   464: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   467: astore #30
/*     */     //   469: iconst_0
/*     */     //   470: istore #31
/*     */     //   472: aload_0
/*     */     //   473: aconst_null
/*     */     //   474: aload #29
/*     */     //   476: ldc_w 1060897807
/*     */     //   479: invokeinterface startReplaceGroup : (I)V
/*     */     //   484: iload_1
/*     */     //   485: ifeq -> 497
/*     */     //   488: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
/*     */     //   491: invokevirtual getUnspecified-0d7_KjU : ()J
/*     */     //   494: goto -> 509
/*     */     //   497: aload #29
/*     */     //   499: iconst_0
/*     */     //   500: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   503: aload #29
/*     */     //   505: iconst_0
/*     */     //   506: invokevirtual getInactiveTextColor : (Landroidx/compose/runtime/Composer;I)J
/*     */     //   509: lstore #32
/*     */     //   511: aload #29
/*     */     //   513: invokeinterface endReplaceGroup : ()V
/*     */     //   518: lload #32
/*     */     //   520: lconst_0
/*     */     //   521: aconst_null
/*     */     //   522: aconst_null
/*     */     //   523: aconst_null
/*     */     //   524: lconst_0
/*     */     //   525: aconst_null
/*     */     //   526: iconst_0
/*     */     //   527: lconst_0
/*     */     //   528: iconst_0
/*     */     //   529: iconst_0
/*     */     //   530: iconst_0
/*     */     //   531: aconst_null
/*     */     //   532: aconst_null
/*     */     //   533: aload #29
/*     */     //   535: bipush #14
/*     */     //   537: iload #4
/*     */     //   539: iand
/*     */     //   540: iconst_0
/*     */     //   541: ldc_w 65530
/*     */     //   544: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   547: nop
/*     */     //   548: aload #26
/*     */     //   550: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   553: aload_2
/*     */     //   554: invokeinterface endNode : ()V
/*     */     //   559: aload_2
/*     */     //   560: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   563: nop
/*     */     //   564: aload_2
/*     */     //   565: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   568: nop
/*     */     //   569: aload_2
/*     */     //   570: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   573: nop
/*     */     //   574: invokestatic isTraceInProgress : ()Z
/*     */     //   577: ifeq -> 592
/*     */     //   580: invokestatic traceEventEnd : ()V
/*     */     //   583: goto -> 592
/*     */     //   586: aload_2
/*     */     //   587: invokeinterface skipToGroupEnd : ()V
/*     */     //   592: aload_2
/*     */     //   593: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   598: dup
/*     */     //   599: ifnull -> 618
/*     */     //   602: aload_0
/*     */     //   603: iload_1
/*     */     //   604: iload_3
/*     */     //   605: <illegal opcode> invoke : (Ljava/lang/String;ZI)Lkotlin/jvm/functions/Function2;
/*     */     //   610: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   615: goto -> 619
/*     */     //   618: pop
/*     */     //   619: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #146	-> 0
/*     */     //   #147	-> 106
/*     */     //   #246	-> 119
/*     */     //   #147	-> 125
/*     */     //   #247	-> 152
/*     */     //   #248	-> 155
/*     */     //   #251	-> 158
/*     */     //   #252	-> 176
/*     */     //   #253	-> 185
/*     */     //   #254	-> 190
/*     */     //   #255	-> 196
/*     */     //   #256	-> 204
/*     */     //   #258	-> 211
/*     */     //   #257	-> 233
/*     */     //   #259	-> 242
/*     */     //   #260	-> 245
/*     */     //   #261	-> 261
/*     */     //   #262	-> 266
/*     */     //   #263	-> 276
/*     */     //   #265	-> 287
/*     */     //   #267	-> 292
/*     */     //   #268	-> 301
/*     */     //   #269	-> 314
/*     */     //   #271	-> 327
/*     */     //   #272	-> 338
/*     */     //   #273	-> 345
/*     */     //   #274	-> 373
/*     */     //   #275	-> 385
/*     */     //   #277	-> 399
/*     */     //   #272	-> 400
/*     */     //   #277	-> 401
/*     */     //   #278	-> 402
/*     */     //   #279	-> 415
/*     */     //   #267	-> 416
/*     */     //   #280	-> 417
/*     */     //   #281	-> 441
/*     */     //   #149	-> 472
/*     */     //   #151	-> 484
/*     */     //   #152	-> 488
/*     */     //   #154	-> 500
/*     */     //   #151	-> 509
/*     */     //   #148	-> 544
/*     */     //   #157	-> 547
/*     */     //   #281	-> 548
/*     */     //   #280	-> 553
/*     */     //   #282	-> 554
/*     */     //   #259	-> 560
/*     */     //   #283	-> 563
/*     */     //   #253	-> 565
/*     */     //   #284	-> 568
/*     */     //   #247	-> 570
/*     */     //   #285	-> 573
/*     */     //   #158	-> 586
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   119	6	6	$i$f$getDp	I
/*     */     //   116	9	5	$this$dp$iv	I
/*     */     //   472	76	31	$i$a$-Box-TaskExplorerKt$TabTitle$1	I
/*     */     //   469	79	30	$this$TabTitle_u24lambda_u246	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   469	79	29	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   469	79	28	$changed	I
/*     */     //   433	120	27	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   430	123	26	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   430	123	25	$changed$iv	I
/*     */     //   345	55	24	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   342	58	23	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   338	64	22	$i$f$set-impl	I
/*     */     //   335	67	21	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   301	115	20	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   298	118	19	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   237	327	18	$i$f$ReusableComposeNode	I
/*     */     //   234	330	16	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   234	330	17	$changed$iv$iv$iv	I
/*     */     //   180	389	12	$i$f$Layout	I
/*     */     //   195	374	13	compositeKeyHash$iv$iv	I
/*     */     //   203	366	14	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   211	358	15	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   177	392	11	$changed$iv$iv	I
/*     */     //   145	429	9	$i$f$Box	I
/*     */     //   167	407	10	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   142	432	5	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   142	432	6	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   158	416	7	propagateMinConstraints$iv	Z
/*     */     //   142	432	8	$changed$iv	I
/*     */     //   13	607	4	$dirty	I
/*     */     //   0	620	0	text	Ljava/lang/String;
/*     */     //   0	620	1	highlight	Z
/*     */     //   0	620	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	620	3	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit TaskExplorer_RfXq3Jk$lambda$2(Modifier $modifier, float $insetHorizontalPadding, boolean $showHistoryTab, TaskExplorerTabs $selectedTab, Function1<? super TaskExplorerTabs, Unit> $onTabSelected, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     TaskExplorer-RfXq3Jk($modifier, $insetHorizontalPadding, $showHistoryTab, $selectedTab, $onTabSelected, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit TabTitle$lambda$7(String $text, boolean $highlight, int $$changed, Composer $composer, int $force) {
/*     */     TabTitle($text, $highlight, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\explorer\TaskExplorerKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */