/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.login;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import io.ktor.http.Url;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000B\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\007\032#\020\000\032\0020\0012\006\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0010\005H\007¢\006\002\020\006\032M\020\007\032\0020\0012\006\020\b\032\0020\t2\f\020\n\032\b\022\004\022\0020\0010\0052\f\020\013\032\b\022\004\022\0020\0010\0052\f\020\f\032\b\022\004\022\0020\0010\0052\f\020\r\032\b\022\004\022\0020\0010\005H\001¢\006\002\020\016\0323\020\017\032\0020\0012\f\020\n\032\b\022\004\022\0020\0010\0052\f\020\f\032\b\022\004\022\0020\0010\0052\b\020\020\032\004\030\0010\021H\007¢\006\002\020\022\032#\020\023\032\0020\0012\006\020\024\032\0020\0252\f\020\f\032\b\022\004\022\0020\0010\005H\007¢\006\002\020\026\032%\020\027\032\0020\0012\b\020\030\032\004\030\0010\0312\f\020\013\032\b\022\004\022\0020\0010\005H\003¢\006\002\020\032\032E\020\033\032\0020\0012\f\020\034\032\b\022\004\022\0020\0360\0352\f\020\037\032\b\022\004\022\0020\0010\0052\f\020 \032\b\022\004\022\0020\0010\0052\f\020!\032\b\022\004\022\0020\0010\005H\007¢\006\002\020\"¨\006#²\006\n\020$\032\0020\tX\002²\006\f\020%\032\004\030\0010\036X\002"}, d2 = {"StartLoadingPage", "", "model", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModel;", "onLoginSuccess", "Lkotlin/Function0;", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "StartLoadingComponent", "state", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState;", "openLoginAction", "openJoinWaitListAction", "onNeedHelpClick", "onBackToLogin", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "LoginIdle", "error", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;Landroidx/compose/runtime/Composer;I)V", "LoadingLogin", "showHelpLink", "", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "NoLicensedLogin", "userName", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "UserNeedHelp", "loginLinkFlow", "Lkotlinx/coroutines/flow/Flow;", "Lio/ktor/http/Url;", "shareFeedbackAction", "onFeedbackSharePressed", "onBackPressed", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ej-ui", "uiState", "loginLink"})
/*     */ @SourceDebugExtension({"SMAP\nStartLoadingPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartLoadingPage.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingPageKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 9 service.kt\ncom/intellij/openapi/components/ServiceKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,178:1\n1225#2,6:179\n1225#2,6:221\n1225#2,6:227\n1225#2,6:233\n1225#2,6:239\n1225#2,6:323\n1225#2,6:665\n71#3:185\n68#3,6:186\n74#3:220\n78#3:248\n79#4,6:192\n86#4,4:207\n90#4,2:217\n94#4:247\n79#4,6:257\n86#4,4:272\n90#4,2:282\n79#4,6:294\n86#4,4:309\n90#4,2:319\n94#4:331\n94#4:335\n79#4,6:349\n86#4,4:364\n90#4,2:374\n94#4:380\n79#4,6:391\n86#4,4:406\n90#4,2:416\n94#4:422\n79#4,6:433\n86#4,4:448\n90#4,2:458\n79#4,6:470\n86#4,4:485\n90#4,2:495\n94#4:501\n79#4,6:512\n86#4,4:527\n90#4,2:537\n94#4:543\n79#4,6:553\n86#4,4:568\n90#4,2:578\n94#4:584\n94#4:588\n79#4,6:599\n86#4,4:614\n90#4,2:624\n79#4,6:636\n86#4,4:651\n90#4,2:661\n94#4:673\n94#4:677\n368#5,9:198\n377#5:219\n378#5,2:245\n368#5,9:263\n377#5:284\n368#5,9:300\n377#5:321\n378#5,2:329\n378#5,2:333\n368#5,9:355\n377#5:376\n378#5,2:378\n368#5,9:397\n377#5:418\n378#5,2:420\n368#5,9:439\n377#5:460\n368#5,9:476\n377#5:497\n378#5,2:499\n368#5,9:518\n377#5:539\n378#5,2:541\n368#5,9:559\n377#5:580\n378#5,2:582\n378#5,2:586\n368#5,9:605\n377#5:626\n368#5,9:642\n377#5:663\n378#5,2:671\n378#5,2:675\n4034#6,6:211\n4034#6,6:276\n4034#6,6:313\n4034#6,6:368\n4034#6,6:410\n4034#6,6:452\n4034#6,6:489\n4034#6,6:531\n4034#6,6:572\n4034#6,6:618\n4034#6,6:655\n149#7:249\n149#7:286\n149#7:340\n149#7:382\n149#7:424\n149#7:503\n149#7:590\n86#8:250\n83#8,6:251\n89#8:285\n86#8:287\n83#8,6:288\n89#8:322\n93#8:332\n93#8:336\n86#8:341\n82#8,7:342\n89#8:377\n93#8:381\n86#8:425\n82#8,7:426\n89#8:461\n86#8:462\n82#8,7:463\n89#8:498\n93#8:502\n86#8:504\n82#8,7:505\n89#8:540\n93#8:544\n93#8:589\n86#8:591\n82#8,7:592\n89#8:627\n93#8:678\n40#9,3:337\n99#10:383\n95#10,7:384\n102#10:419\n106#10:423\n99#10:545\n95#10,7:546\n102#10:581\n106#10:585\n99#10:628\n95#10,7:629\n102#10:664\n106#10:674\n81#11:679\n81#11:680\n*S KotlinDebug\n*F\n+ 1 StartLoadingPage.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingPageKt\n*L\n38#1:179,6\n50#1:221,6\n51#1:227,6\n52#1:233,6\n53#1:239,6\n92#1:323,6\n167#1:665,6\n47#1:185\n47#1:186,6\n47#1:220\n47#1:248\n47#1:192,6\n47#1:207,4\n47#1:217,2\n47#1:247\n67#1:257,6\n67#1:272,4\n67#1:282,2\n76#1:294,6\n76#1:309,4\n76#1:319,2\n76#1:331\n67#1:335\n108#1:349,6\n108#1:364,4\n108#1:374,2\n108#1:380\n121#1:391,6\n121#1:406,4\n121#1:416,2\n121#1:422\n131#1:433,6\n131#1:448,4\n131#1:458,2\n132#1:470,6\n132#1:485,4\n132#1:495,2\n132#1:501\n137#1:512,6\n137#1:527,4\n137#1:537,2\n137#1:543\n140#1:553,6\n140#1:568,4\n140#1:578,2\n140#1:584\n131#1:588\n156#1:599,6\n156#1:614,4\n156#1:624,2\n164#1:636,6\n164#1:651,4\n164#1:661,2\n164#1:673\n156#1:677\n47#1:198,9\n47#1:219\n47#1:245,2\n67#1:263,9\n67#1:284\n76#1:300,9\n76#1:321\n76#1:329,2\n67#1:333,2\n108#1:355,9\n108#1:376\n108#1:378,2\n121#1:397,9\n121#1:418\n121#1:420,2\n131#1:439,9\n131#1:460\n132#1:476,9\n132#1:497\n132#1:499,2\n137#1:518,9\n137#1:539\n137#1:541,2\n140#1:559,9\n140#1:580\n140#1:582,2\n131#1:586,2\n156#1:605,9\n156#1:626\n164#1:642,9\n164#1:663\n164#1:671,2\n156#1:675,2\n47#1:211,6\n67#1:276,6\n76#1:313,6\n108#1:368,6\n121#1:410,6\n131#1:452,6\n132#1:489,6\n137#1:531,6\n140#1:572,6\n156#1:618,6\n164#1:655,6\n71#1:249\n76#1:286\n108#1:340\n121#1:382\n131#1:424\n137#1:503\n156#1:590\n67#1:250\n67#1:251,6\n67#1:285\n76#1:287\n76#1:288,6\n76#1:322\n76#1:332\n67#1:336\n108#1:341\n108#1:342,7\n108#1:377\n108#1:381\n131#1:425\n131#1:426,7\n131#1:461\n132#1:462\n132#1:463,7\n132#1:498\n132#1:502\n137#1:504\n137#1:505,7\n137#1:540\n137#1:544\n131#1:589\n156#1:591\n156#1:592,7\n156#1:627\n156#1:678\n104#1:337,3\n121#1:383\n121#1:384,7\n121#1:419\n121#1:423\n140#1:545\n140#1:546,7\n140#1:581\n140#1:585\n164#1:628\n164#1:629,7\n164#1:664\n164#1:674\n46#1:679\n155#1:680\n*E\n"})
/*     */ public final class StartLoadingPageKt {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void StartLoadingPage(@NotNull StartLoadingViewModel model, @NotNull Function0<Unit> onLoginSuccess, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'model'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'onLoginSuccess'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: ldc -1224861072
/*     */     //   15: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   20: astore_2
/*     */     //   21: iload_3
/*     */     //   22: istore #4
/*     */     //   24: iload_3
/*     */     //   25: bipush #6
/*     */     //   27: iand
/*     */     //   28: ifne -> 68
/*     */     //   31: iload #4
/*     */     //   33: iload_3
/*     */     //   34: bipush #8
/*     */     //   36: iand
/*     */     //   37: ifne -> 50
/*     */     //   40: aload_2
/*     */     //   41: aload_0
/*     */     //   42: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   47: goto -> 57
/*     */     //   50: aload_2
/*     */     //   51: aload_0
/*     */     //   52: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   57: ifeq -> 64
/*     */     //   60: iconst_4
/*     */     //   61: goto -> 65
/*     */     //   64: iconst_2
/*     */     //   65: ior
/*     */     //   66: istore #4
/*     */     //   68: iload_3
/*     */     //   69: bipush #48
/*     */     //   71: iand
/*     */     //   72: ifne -> 97
/*     */     //   75: iload #4
/*     */     //   77: aload_2
/*     */     //   78: aload_1
/*     */     //   79: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   84: ifeq -> 92
/*     */     //   87: bipush #32
/*     */     //   89: goto -> 94
/*     */     //   92: bipush #16
/*     */     //   94: ior
/*     */     //   95: istore #4
/*     */     //   97: iload #4
/*     */     //   99: bipush #19
/*     */     //   101: iand
/*     */     //   102: bipush #18
/*     */     //   104: if_icmpne -> 116
/*     */     //   107: aload_2
/*     */     //   108: invokeinterface getSkipping : ()Z
/*     */     //   113: ifne -> 1277
/*     */     //   116: invokestatic isTraceInProgress : ()Z
/*     */     //   119: ifeq -> 132
/*     */     //   122: ldc -1224861072
/*     */     //   124: iload #4
/*     */     //   126: iconst_m1
/*     */     //   127: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.login.StartLoadingPage (StartLoadingPage.kt:35)'
/*     */     //   129: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   132: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   135: aload_2
/*     */     //   136: ldc -846128369
/*     */     //   138: invokeinterface startReplaceGroup : (I)V
/*     */     //   143: aload_2
/*     */     //   144: astore #6
/*     */     //   146: iload #4
/*     */     //   148: bipush #14
/*     */     //   150: iand
/*     */     //   151: iconst_4
/*     */     //   152: if_icmpeq -> 173
/*     */     //   155: iload #4
/*     */     //   157: bipush #8
/*     */     //   159: iand
/*     */     //   160: ifeq -> 177
/*     */     //   163: aload_2
/*     */     //   164: aload_0
/*     */     //   165: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   170: ifeq -> 177
/*     */     //   173: iconst_1
/*     */     //   174: goto -> 178
/*     */     //   177: iconst_0
/*     */     //   178: iload #4
/*     */     //   180: bipush #112
/*     */     //   182: iand
/*     */     //   183: bipush #32
/*     */     //   185: if_icmpne -> 192
/*     */     //   188: iconst_1
/*     */     //   189: goto -> 193
/*     */     //   192: iconst_0
/*     */     //   193: ior
/*     */     //   194: istore #7
/*     */     //   196: iconst_0
/*     */     //   197: istore #8
/*     */     //   199: aload #6
/*     */     //   201: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   206: astore #9
/*     */     //   208: iconst_0
/*     */     //   209: istore #10
/*     */     //   211: iload #7
/*     */     //   213: ifne -> 227
/*     */     //   216: aload #9
/*     */     //   218: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   221: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   224: if_acmpne -> 264
/*     */     //   227: astore #46
/*     */     //   229: iconst_0
/*     */     //   230: istore #11
/*     */     //   232: new com/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingPageKt$StartLoadingPage$1$1
/*     */     //   235: dup
/*     */     //   236: aload_0
/*     */     //   237: aload_1
/*     */     //   238: aconst_null
/*     */     //   239: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V
/*     */     //   242: checkcast kotlin/jvm/functions/Function2
/*     */     //   245: aload #46
/*     */     //   247: swap
/*     */     //   248: astore #12
/*     */     //   250: aload #6
/*     */     //   252: aload #12
/*     */     //   254: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   259: aload #12
/*     */     //   261: goto -> 266
/*     */     //   264: aload #9
/*     */     //   266: nop
/*     */     //   267: nop
/*     */     //   268: nop
/*     */     //   269: checkcast kotlin/jvm/functions/Function2
/*     */     //   272: astore #5
/*     */     //   274: aload_2
/*     */     //   275: invokeinterface endReplaceGroup : ()V
/*     */     //   280: aload #5
/*     */     //   282: aload_2
/*     */     //   283: bipush #6
/*     */     //   285: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   288: aload_0
/*     */     //   289: invokeinterface getState : ()Lkotlinx/coroutines/flow/StateFlow;
/*     */     //   294: aconst_null
/*     */     //   295: aload_2
/*     */     //   296: iconst_0
/*     */     //   297: iconst_1
/*     */     //   298: invokestatic collectAsState : (Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*     */     //   301: astore #5
/*     */     //   303: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   306: checkcast androidx/compose/ui/Modifier
/*     */     //   309: fconst_0
/*     */     //   310: iconst_1
/*     */     //   311: aconst_null
/*     */     //   312: invokestatic fillMaxSize$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   315: astore #6
/*     */     //   317: bipush #6
/*     */     //   319: istore #9
/*     */     //   321: iconst_0
/*     */     //   322: istore #10
/*     */     //   324: aload_2
/*     */     //   325: ldc 733328855
/*     */     //   327: ldc 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   329: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   332: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   335: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   338: astore #7
/*     */     //   340: iconst_0
/*     */     //   341: istore #8
/*     */     //   343: aload #7
/*     */     //   345: iload #8
/*     */     //   347: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   350: astore #11
/*     */     //   352: bipush #112
/*     */     //   354: iload #9
/*     */     //   356: iconst_3
/*     */     //   357: ishl
/*     */     //   358: iand
/*     */     //   359: istore #12
/*     */     //   361: nop
/*     */     //   362: iconst_0
/*     */     //   363: istore #13
/*     */     //   365: aload_2
/*     */     //   366: ldc -1323940314
/*     */     //   368: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   370: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   373: aload_2
/*     */     //   374: iconst_0
/*     */     //   375: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   378: istore #14
/*     */     //   380: aload_2
/*     */     //   381: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   386: astore #15
/*     */     //   388: aload_2
/*     */     //   389: aload #6
/*     */     //   391: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   394: astore #16
/*     */     //   396: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   399: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   402: astore #17
/*     */     //   404: bipush #6
/*     */     //   406: sipush #896
/*     */     //   409: iload #12
/*     */     //   411: bipush #6
/*     */     //   413: ishl
/*     */     //   414: iand
/*     */     //   415: ior
/*     */     //   416: istore #18
/*     */     //   418: nop
/*     */     //   419: iconst_0
/*     */     //   420: istore #19
/*     */     //   422: aload_2
/*     */     //   423: ldc -692256719
/*     */     //   425: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   427: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   430: aload_2
/*     */     //   431: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   436: instanceof androidx/compose/runtime/Applier
/*     */     //   439: ifne -> 445
/*     */     //   442: invokestatic invalidApplier : ()V
/*     */     //   445: aload_2
/*     */     //   446: invokeinterface startReusableNode : ()V
/*     */     //   451: aload_2
/*     */     //   452: invokeinterface getInserting : ()Z
/*     */     //   457: ifeq -> 471
/*     */     //   460: aload_2
/*     */     //   461: aload #17
/*     */     //   463: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   468: goto -> 477
/*     */     //   471: aload_2
/*     */     //   472: invokeinterface useNode : ()V
/*     */     //   477: aload_2
/*     */     //   478: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   481: astore #20
/*     */     //   483: iconst_0
/*     */     //   484: istore #21
/*     */     //   486: aload #20
/*     */     //   488: aload #11
/*     */     //   490: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   493: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   496: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   499: aload #20
/*     */     //   501: aload #15
/*     */     //   503: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   506: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   509: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   512: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   515: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   518: astore #22
/*     */     //   520: iconst_0
/*     */     //   521: istore #23
/*     */     //   523: aload #20
/*     */     //   525: astore #24
/*     */     //   527: iconst_0
/*     */     //   528: istore #25
/*     */     //   530: aload #24
/*     */     //   532: invokeinterface getInserting : ()Z
/*     */     //   537: ifne -> 558
/*     */     //   540: aload #24
/*     */     //   542: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   547: iload #14
/*     */     //   549: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   552: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   555: ifne -> 584
/*     */     //   558: aload #24
/*     */     //   560: iload #14
/*     */     //   562: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   565: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   570: aload #20
/*     */     //   572: iload #14
/*     */     //   574: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   577: aload #22
/*     */     //   579: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   584: nop
/*     */     //   585: nop
/*     */     //   586: nop
/*     */     //   587: aload #20
/*     */     //   589: aload #16
/*     */     //   591: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   594: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   597: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   600: nop
/*     */     //   601: nop
/*     */     //   602: aload_2
/*     */     //   603: bipush #14
/*     */     //   605: iload #18
/*     */     //   607: bipush #6
/*     */     //   609: ishr
/*     */     //   610: iand
/*     */     //   611: istore #26
/*     */     //   613: astore #27
/*     */     //   615: iconst_0
/*     */     //   616: istore #28
/*     */     //   618: aload #27
/*     */     //   620: ldc -2146769399
/*     */     //   622: ldc 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   624: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   627: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   630: aload #27
/*     */     //   632: bipush #6
/*     */     //   634: bipush #112
/*     */     //   636: iload #9
/*     */     //   638: bipush #6
/*     */     //   640: ishr
/*     */     //   641: iand
/*     */     //   642: ior
/*     */     //   643: istore #29
/*     */     //   645: astore #30
/*     */     //   647: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   650: astore #31
/*     */     //   652: iconst_0
/*     */     //   653: istore #32
/*     */     //   655: aload #5
/*     */     //   657: invokestatic StartLoadingPage$lambda$1 : (Landroidx/compose/runtime/State;)Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState;
/*     */     //   660: aload #30
/*     */     //   662: ldc -1389538078
/*     */     //   664: invokeinterface startReplaceGroup : (I)V
/*     */     //   669: aload #30
/*     */     //   671: astore #33
/*     */     //   673: iload #4
/*     */     //   675: bipush #14
/*     */     //   677: iand
/*     */     //   678: iconst_4
/*     */     //   679: if_icmpeq -> 700
/*     */     //   682: iload #4
/*     */     //   684: bipush #8
/*     */     //   686: iand
/*     */     //   687: ifeq -> 704
/*     */     //   690: aload_2
/*     */     //   691: aload_0
/*     */     //   692: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   697: ifeq -> 704
/*     */     //   700: iconst_1
/*     */     //   701: goto -> 705
/*     */     //   704: iconst_0
/*     */     //   705: istore #34
/*     */     //   707: nop
/*     */     //   708: iconst_0
/*     */     //   709: istore #35
/*     */     //   711: aload #33
/*     */     //   713: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   718: astore #36
/*     */     //   720: iconst_0
/*     */     //   721: istore #37
/*     */     //   723: iload #34
/*     */     //   725: ifne -> 739
/*     */     //   728: aload #36
/*     */     //   730: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   733: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   736: if_acmpne -> 769
/*     */     //   739: astore #38
/*     */     //   741: iconst_0
/*     */     //   742: istore #39
/*     */     //   744: aload_0
/*     */     //   745: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModel;)Lkotlin/jvm/functions/Function0;
/*     */     //   750: aload #38
/*     */     //   752: swap
/*     */     //   753: astore #40
/*     */     //   755: aload #33
/*     */     //   757: aload #40
/*     */     //   759: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   764: aload #40
/*     */     //   766: goto -> 771
/*     */     //   769: aload #36
/*     */     //   771: nop
/*     */     //   772: nop
/*     */     //   773: nop
/*     */     //   774: checkcast kotlin/jvm/functions/Function0
/*     */     //   777: astore #41
/*     */     //   779: aload #30
/*     */     //   781: invokeinterface endReplaceGroup : ()V
/*     */     //   786: aload #41
/*     */     //   788: aload #30
/*     */     //   790: ldc_w -1389536001
/*     */     //   793: invokeinterface startReplaceGroup : (I)V
/*     */     //   798: aload #30
/*     */     //   800: astore #33
/*     */     //   802: iload #4
/*     */     //   804: bipush #14
/*     */     //   806: iand
/*     */     //   807: iconst_4
/*     */     //   808: if_icmpeq -> 829
/*     */     //   811: iload #4
/*     */     //   813: bipush #8
/*     */     //   815: iand
/*     */     //   816: ifeq -> 833
/*     */     //   819: aload_2
/*     */     //   820: aload_0
/*     */     //   821: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   826: ifeq -> 833
/*     */     //   829: iconst_1
/*     */     //   830: goto -> 834
/*     */     //   833: iconst_0
/*     */     //   834: istore #34
/*     */     //   836: nop
/*     */     //   837: iconst_0
/*     */     //   838: istore #35
/*     */     //   840: aload #33
/*     */     //   842: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   847: astore #36
/*     */     //   849: iconst_0
/*     */     //   850: istore #37
/*     */     //   852: iload #34
/*     */     //   854: ifne -> 868
/*     */     //   857: aload #36
/*     */     //   859: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   862: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   865: if_acmpne -> 910
/*     */     //   868: astore #42
/*     */     //   870: astore #38
/*     */     //   872: iconst_0
/*     */     //   873: istore #39
/*     */     //   875: new com/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingPageKt$StartLoadingPage$2$2$1
/*     */     //   878: dup
/*     */     //   879: aload_0
/*     */     //   880: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   883: checkcast kotlin/reflect/KFunction
/*     */     //   886: astore #43
/*     */     //   888: aload #38
/*     */     //   890: aload #42
/*     */     //   892: aload #43
/*     */     //   894: astore #40
/*     */     //   896: aload #33
/*     */     //   898: aload #40
/*     */     //   900: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   905: aload #40
/*     */     //   907: goto -> 912
/*     */     //   910: aload #36
/*     */     //   912: nop
/*     */     //   913: nop
/*     */     //   914: nop
/*     */     //   915: checkcast kotlin/reflect/KFunction
/*     */     //   918: astore #41
/*     */     //   920: aload #30
/*     */     //   922: invokeinterface endReplaceGroup : ()V
/*     */     //   927: aload #41
/*     */     //   929: checkcast kotlin/jvm/functions/Function0
/*     */     //   932: aload #30
/*     */     //   934: ldc_w -1389534249
/*     */     //   937: invokeinterface startReplaceGroup : (I)V
/*     */     //   942: aload #30
/*     */     //   944: astore #33
/*     */     //   946: iload #4
/*     */     //   948: bipush #14
/*     */     //   950: iand
/*     */     //   951: iconst_4
/*     */     //   952: if_icmpeq -> 973
/*     */     //   955: iload #4
/*     */     //   957: bipush #8
/*     */     //   959: iand
/*     */     //   960: ifeq -> 977
/*     */     //   963: aload_2
/*     */     //   964: aload_0
/*     */     //   965: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   970: ifeq -> 977
/*     */     //   973: iconst_1
/*     */     //   974: goto -> 978
/*     */     //   977: iconst_0
/*     */     //   978: istore #34
/*     */     //   980: nop
/*     */     //   981: iconst_0
/*     */     //   982: istore #35
/*     */     //   984: aload #33
/*     */     //   986: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   991: astore #36
/*     */     //   993: iconst_0
/*     */     //   994: istore #37
/*     */     //   996: iload #34
/*     */     //   998: ifne -> 1012
/*     */     //   1001: aload #36
/*     */     //   1003: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1006: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1009: if_acmpne -> 1058
/*     */     //   1012: astore #43
/*     */     //   1014: astore #42
/*     */     //   1016: astore #38
/*     */     //   1018: iconst_0
/*     */     //   1019: istore #39
/*     */     //   1021: new com/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingPageKt$StartLoadingPage$2$3$1
/*     */     //   1024: dup
/*     */     //   1025: aload_0
/*     */     //   1026: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   1029: checkcast kotlin/reflect/KFunction
/*     */     //   1032: astore #44
/*     */     //   1034: aload #38
/*     */     //   1036: aload #42
/*     */     //   1038: aload #43
/*     */     //   1040: aload #44
/*     */     //   1042: astore #40
/*     */     //   1044: aload #33
/*     */     //   1046: aload #40
/*     */     //   1048: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1053: aload #40
/*     */     //   1055: goto -> 1060
/*     */     //   1058: aload #36
/*     */     //   1060: nop
/*     */     //   1061: nop
/*     */     //   1062: nop
/*     */     //   1063: checkcast kotlin/reflect/KFunction
/*     */     //   1066: astore #41
/*     */     //   1068: aload #30
/*     */     //   1070: invokeinterface endReplaceGroup : ()V
/*     */     //   1075: aload #41
/*     */     //   1077: checkcast kotlin/jvm/functions/Function0
/*     */     //   1080: aload #30
/*     */     //   1082: ldc_w -1389532810
/*     */     //   1085: invokeinterface startReplaceGroup : (I)V
/*     */     //   1090: aload #30
/*     */     //   1092: astore #33
/*     */     //   1094: iload #4
/*     */     //   1096: bipush #14
/*     */     //   1098: iand
/*     */     //   1099: iconst_4
/*     */     //   1100: if_icmpeq -> 1121
/*     */     //   1103: iload #4
/*     */     //   1105: bipush #8
/*     */     //   1107: iand
/*     */     //   1108: ifeq -> 1125
/*     */     //   1111: aload_2
/*     */     //   1112: aload_0
/*     */     //   1113: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1118: ifeq -> 1125
/*     */     //   1121: iconst_1
/*     */     //   1122: goto -> 1126
/*     */     //   1125: iconst_0
/*     */     //   1126: istore #34
/*     */     //   1128: nop
/*     */     //   1129: iconst_0
/*     */     //   1130: istore #35
/*     */     //   1132: aload #33
/*     */     //   1134: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1139: astore #36
/*     */     //   1141: iconst_0
/*     */     //   1142: istore #37
/*     */     //   1144: iload #34
/*     */     //   1146: ifne -> 1160
/*     */     //   1149: aload #36
/*     */     //   1151: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1154: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1157: if_acmpne -> 1210
/*     */     //   1160: astore #44
/*     */     //   1162: astore #43
/*     */     //   1164: astore #42
/*     */     //   1166: astore #38
/*     */     //   1168: iconst_0
/*     */     //   1169: istore #39
/*     */     //   1171: new com/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingPageKt$StartLoadingPage$2$4$1
/*     */     //   1174: dup
/*     */     //   1175: aload_0
/*     */     //   1176: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   1179: checkcast kotlin/reflect/KFunction
/*     */     //   1182: astore #45
/*     */     //   1184: aload #38
/*     */     //   1186: aload #42
/*     */     //   1188: aload #43
/*     */     //   1190: aload #44
/*     */     //   1192: aload #45
/*     */     //   1194: astore #40
/*     */     //   1196: aload #33
/*     */     //   1198: aload #40
/*     */     //   1200: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1205: aload #40
/*     */     //   1207: goto -> 1212
/*     */     //   1210: aload #36
/*     */     //   1212: nop
/*     */     //   1213: nop
/*     */     //   1214: nop
/*     */     //   1215: checkcast kotlin/reflect/KFunction
/*     */     //   1218: astore #41
/*     */     //   1220: aload #30
/*     */     //   1222: invokeinterface endReplaceGroup : ()V
/*     */     //   1227: aload #41
/*     */     //   1229: checkcast kotlin/jvm/functions/Function0
/*     */     //   1232: aload #30
/*     */     //   1234: iconst_0
/*     */     //   1235: invokestatic StartLoadingComponent : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1238: nop
/*     */     //   1239: aload #27
/*     */     //   1241: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1244: aload_2
/*     */     //   1245: invokeinterface endNode : ()V
/*     */     //   1250: aload_2
/*     */     //   1251: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1254: nop
/*     */     //   1255: aload_2
/*     */     //   1256: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1259: nop
/*     */     //   1260: aload_2
/*     */     //   1261: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1264: nop
/*     */     //   1265: invokestatic isTraceInProgress : ()Z
/*     */     //   1268: ifeq -> 1283
/*     */     //   1271: invokestatic traceEventEnd : ()V
/*     */     //   1274: goto -> 1283
/*     */     //   1277: aload_2
/*     */     //   1278: invokeinterface skipToGroupEnd : ()V
/*     */     //   1283: aload_2
/*     */     //   1284: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1289: dup
/*     */     //   1290: ifnull -> 1309
/*     */     //   1293: aload_0
/*     */     //   1294: aload_1
/*     */     //   1295: iload_3
/*     */     //   1296: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModel;Lkotlin/jvm/functions/Function0;I)Lkotlin/jvm/functions/Function2;
/*     */     //   1301: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1306: goto -> 1310
/*     */     //   1309: pop
/*     */     //   1310: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #36	-> 12
/*     */     //   #38	-> 132
/*     */     //   #179	-> 199
/*     */     //   #180	-> 211
/*     */     //   #181	-> 227
/*     */     //   #38	-> 232
/*     */     //   #181	-> 248
/*     */     //   #182	-> 250
/*     */     //   #183	-> 259
/*     */     //   #184	-> 264
/*     */     //   #180	-> 266
/*     */     //   #179	-> 267
/*     */     //   #179	-> 268
/*     */     //   #38	-> 269
/*     */     //   #46	-> 288
/*     */     //   #47	-> 303
/*     */     //   #185	-> 329
/*     */     //   #186	-> 332
/*     */     //   #187	-> 340
/*     */     //   #190	-> 343
/*     */     //   #191	-> 361
/*     */     //   #192	-> 370
/*     */     //   #193	-> 375
/*     */     //   #194	-> 381
/*     */     //   #195	-> 389
/*     */     //   #197	-> 396
/*     */     //   #196	-> 418
/*     */     //   #198	-> 427
/*     */     //   #199	-> 430
/*     */     //   #200	-> 446
/*     */     //   #201	-> 451
/*     */     //   #202	-> 461
/*     */     //   #204	-> 472
/*     */     //   #206	-> 477
/*     */     //   #207	-> 486
/*     */     //   #208	-> 499
/*     */     //   #210	-> 512
/*     */     //   #211	-> 523
/*     */     //   #212	-> 530
/*     */     //   #213	-> 558
/*     */     //   #214	-> 570
/*     */     //   #216	-> 584
/*     */     //   #211	-> 585
/*     */     //   #216	-> 586
/*     */     //   #217	-> 587
/*     */     //   #218	-> 600
/*     */     //   #206	-> 601
/*     */     //   #219	-> 602
/*     */     //   #220	-> 624
/*     */     //   #49	-> 655
/*     */     //   #50	-> 707
/*     */     //   #221	-> 711
/*     */     //   #222	-> 723
/*     */     //   #223	-> 739
/*     */     //   #50	-> 744
/*     */     //   #223	-> 753
/*     */     //   #224	-> 755
/*     */     //   #225	-> 764
/*     */     //   #226	-> 769
/*     */     //   #222	-> 771
/*     */     //   #221	-> 772
/*     */     //   #221	-> 773
/*     */     //   #50	-> 774
/*     */     //   #51	-> 836
/*     */     //   #227	-> 840
/*     */     //   #228	-> 852
/*     */     //   #229	-> 868
/*     */     //   #51	-> 875
/*     */     //   #229	-> 894
/*     */     //   #230	-> 896
/*     */     //   #231	-> 905
/*     */     //   #232	-> 910
/*     */     //   #228	-> 912
/*     */     //   #227	-> 913
/*     */     //   #227	-> 914
/*     */     //   #51	-> 915
/*     */     //   #52	-> 980
/*     */     //   #233	-> 984
/*     */     //   #234	-> 996
/*     */     //   #235	-> 1012
/*     */     //   #52	-> 1021
/*     */     //   #235	-> 1042
/*     */     //   #236	-> 1044
/*     */     //   #237	-> 1053
/*     */     //   #238	-> 1058
/*     */     //   #234	-> 1060
/*     */     //   #233	-> 1061
/*     */     //   #233	-> 1062
/*     */     //   #52	-> 1063
/*     */     //   #53	-> 1128
/*     */     //   #239	-> 1132
/*     */     //   #240	-> 1144
/*     */     //   #241	-> 1160
/*     */     //   #53	-> 1171
/*     */     //   #241	-> 1194
/*     */     //   #242	-> 1196
/*     */     //   #243	-> 1205
/*     */     //   #244	-> 1210
/*     */     //   #240	-> 1212
/*     */     //   #239	-> 1213
/*     */     //   #239	-> 1214
/*     */     //   #53	-> 1215
/*     */     //   #48	-> 1235
/*     */     //   #55	-> 1238
/*     */     //   #220	-> 1239
/*     */     //   #219	-> 1244
/*     */     //   #245	-> 1245
/*     */     //   #198	-> 1251
/*     */     //   #246	-> 1254
/*     */     //   #192	-> 1256
/*     */     //   #247	-> 1259
/*     */     //   #185	-> 1261
/*     */     //   #248	-> 1264
/*     */     //   #56	-> 1277
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   232	13	11	$i$a$-cache-StartLoadingPageKt$StartLoadingPage$1	I
/*     */     //   250	11	12	value$iv	Ljava/lang/Object;
/*     */     //   211	56	10	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   208	59	9	it$iv	Ljava/lang/Object;
/*     */     //   199	70	8	$i$f$cache	I
/*     */     //   196	73	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   196	73	7	invalid$iv	Z
/*     */     //   744	6	39	$i$a$-cache-StartLoadingPageKt$StartLoadingPage$2$1	I
/*     */     //   755	11	40	value$iv	Ljava/lang/Object;
/*     */     //   723	49	37	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   720	52	36	it$iv	Ljava/lang/Object;
/*     */     //   711	63	35	$i$f$cache	I
/*     */     //   708	66	33	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   708	66	34	invalid$iv	Z
/*     */     //   875	11	39	$i$a$-cache-StartLoadingPageKt$StartLoadingPage$2$2	I
/*     */     //   896	11	40	value$iv	Ljava/lang/Object;
/*     */     //   852	61	37	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   849	64	36	it$iv	Ljava/lang/Object;
/*     */     //   840	75	35	$i$f$cache	I
/*     */     //   837	78	33	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   837	78	34	invalid$iv	Z
/*     */     //   1021	11	39	$i$a$-cache-StartLoadingPageKt$StartLoadingPage$2$3	I
/*     */     //   1044	11	40	value$iv	Ljava/lang/Object;
/*     */     //   996	65	37	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   993	68	36	it$iv	Ljava/lang/Object;
/*     */     //   984	79	35	$i$f$cache	I
/*     */     //   981	82	33	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   981	82	34	invalid$iv	Z
/*     */     //   1171	11	39	$i$a$-cache-StartLoadingPageKt$StartLoadingPage$2$4	I
/*     */     //   1196	11	40	value$iv	Ljava/lang/Object;
/*     */     //   1144	69	37	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1141	72	36	it$iv	Ljava/lang/Object;
/*     */     //   1132	83	35	$i$f$cache	I
/*     */     //   1129	86	33	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1129	86	34	invalid$iv	Z
/*     */     //   655	584	32	$i$a$-Box-StartLoadingPageKt$StartLoadingPage$2	I
/*     */     //   652	587	31	$this$StartLoadingPage_u24lambda_u247	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   652	587	30	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   652	587	29	$changed	I
/*     */     //   618	626	28	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   615	629	27	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   615	629	26	$changed$iv	I
/*     */     //   530	55	25	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   527	58	24	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   523	64	23	$i$f$set-impl	I
/*     */     //   520	67	22	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   486	115	21	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   483	118	20	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   422	833	19	$i$f$ReusableComposeNode	I
/*     */     //   419	836	17	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   419	836	18	$changed$iv$iv$iv	I
/*     */     //   365	895	13	$i$f$Layout	I
/*     */     //   380	880	14	compositeKeyHash$iv$iv	I
/*     */     //   388	872	15	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   396	864	16	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   362	898	12	$changed$iv$iv	I
/*     */     //   324	941	10	$i$f$Box	I
/*     */     //   352	913	11	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   321	944	6	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   340	925	7	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   343	922	8	propagateMinConstraints$iv	Z
/*     */     //   321	944	9	$changed$iv	I
/*     */     //   303	971	5	uiState$delegate	Landroidx/compose/runtime/State;
/*     */     //   24	1287	4	$dirty	I
/*     */     //   0	1311	0	model	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModel;
/*     */     //   0	1311	1	onLoginSuccess	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1311	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1311	3	$changed	I
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "StartLoadingPage.kt", l = {39}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.StartLoadingPageKt$StartLoadingPage$1$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class StartLoadingPageKt$StartLoadingPage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     StartLoadingPageKt$StartLoadingPage$1$1(StartLoadingViewModel $model, Function0<Unit> $onLoginSuccess, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super StartLoadingPageKt$StartLoadingPage$1$1> $completion) {
/*     */       return (Continuation<Unit>)new StartLoadingPageKt$StartLoadingPage$1$1(this.$model, this.$onLoginSuccess, $completion);
/*     */     }
/*     */     
/*  38 */     public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  39 */           this.label = 1; if (this.$model.getEffect().collect(new FlowCollector(this.$onLoginSuccess)
/*     */               {
/*  41 */                 public final Object emit(LoginScreenEffect effect, Continuation $completion) { if (Intrinsics.areEqual(effect, LoginScreenEffect.OpenNewTaskPage.INSTANCE)) { this.$onLoginSuccess.invoke(); }
/*     */                   else { throw new NoWhenBranchMatchedException(); }
/*  43 */                    return Unit.INSTANCE; } }(Continuation)this) == object) return object;  this.$model.getEffect().collect(new FlowCollector(this.$onLoginSuccess) { public final Object emit(LoginScreenEffect effect, Continuation $completion) { if (Intrinsics.areEqual(effect, LoginScreenEffect.OpenNewTaskPage.INSTANCE)) { this.$onLoginSuccess.invoke(); } else { throw new NoWhenBranchMatchedException(); }  return Unit.INSTANCE; } }(Continuation)this);
/*  44 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((StartLoadingPageKt$StartLoadingPage$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); }
/*  46 */   } private static final LoginScreenState StartLoadingPage$lambda$1(State $uiState$delegate) { State state = $uiState$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 679 */       (LoginScreenState)state.getValue(); } private static final Unit StartLoadingPage$lambda$7$lambda$3$lambda$2(StartLoadingViewModel $model) { $model.startLoginAction(true); return Unit.INSTANCE; }
/* 680 */   private static final Url UserNeedHelp$lambda$23(State $loginLink$delegate) { State state = $loginLink$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (Url)state.getValue(); }
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void StartLoadingComponent(@NotNull LoginScreenState state, @NotNull Function0<Unit> openLoginAction, @NotNull Function0<Unit> openJoinWaitListAction, @NotNull Function0<Unit> onNeedHelpClick, @NotNull Function0 onBackToLogin, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'state'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: ldc_w 'openLoginAction'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload_2
/*     */     //   15: ldc_w 'openJoinWaitListAction'
/*     */     //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   21: aload_3
/*     */     //   22: ldc_w 'onNeedHelpClick'
/*     */     //   25: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   28: aload #4
/*     */     //   30: ldc_w 'onBackToLogin'
/*     */     //   33: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   36: aload #5
/*     */     //   38: ldc_w 1719898038
/*     */     //   41: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   46: astore #5
/*     */     //   48: iload #6
/*     */     //   50: istore #7
/*     */     //   52: iload #6
/*     */     //   54: bipush #6
/*     */     //   56: iand
/*     */     //   57: ifne -> 100
/*     */     //   60: iload #7
/*     */     //   62: iload #6
/*     */     //   64: bipush #8
/*     */     //   66: iand
/*     */     //   67: ifne -> 81
/*     */     //   70: aload #5
/*     */     //   72: aload_0
/*     */     //   73: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   78: goto -> 89
/*     */     //   81: aload #5
/*     */     //   83: aload_0
/*     */     //   84: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   89: ifeq -> 96
/*     */     //   92: iconst_4
/*     */     //   93: goto -> 97
/*     */     //   96: iconst_2
/*     */     //   97: ior
/*     */     //   98: istore #7
/*     */     //   100: iload #6
/*     */     //   102: bipush #48
/*     */     //   104: iand
/*     */     //   105: ifne -> 131
/*     */     //   108: iload #7
/*     */     //   110: aload #5
/*     */     //   112: aload_1
/*     */     //   113: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   118: ifeq -> 126
/*     */     //   121: bipush #32
/*     */     //   123: goto -> 128
/*     */     //   126: bipush #16
/*     */     //   128: ior
/*     */     //   129: istore #7
/*     */     //   131: iload #6
/*     */     //   133: sipush #384
/*     */     //   136: iand
/*     */     //   137: ifne -> 165
/*     */     //   140: iload #7
/*     */     //   142: aload #5
/*     */     //   144: aload_2
/*     */     //   145: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   150: ifeq -> 159
/*     */     //   153: sipush #256
/*     */     //   156: goto -> 162
/*     */     //   159: sipush #128
/*     */     //   162: ior
/*     */     //   163: istore #7
/*     */     //   165: iload #6
/*     */     //   167: sipush #3072
/*     */     //   170: iand
/*     */     //   171: ifne -> 199
/*     */     //   174: iload #7
/*     */     //   176: aload #5
/*     */     //   178: aload_3
/*     */     //   179: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   184: ifeq -> 193
/*     */     //   187: sipush #2048
/*     */     //   190: goto -> 196
/*     */     //   193: sipush #1024
/*     */     //   196: ior
/*     */     //   197: istore #7
/*     */     //   199: iload #6
/*     */     //   201: sipush #24576
/*     */     //   204: iand
/*     */     //   205: ifne -> 234
/*     */     //   208: iload #7
/*     */     //   210: aload #5
/*     */     //   212: aload #4
/*     */     //   214: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   219: ifeq -> 228
/*     */     //   222: sipush #16384
/*     */     //   225: goto -> 231
/*     */     //   228: sipush #8192
/*     */     //   231: ior
/*     */     //   232: istore #7
/*     */     //   234: iload #7
/*     */     //   236: sipush #9363
/*     */     //   239: iand
/*     */     //   240: sipush #9362
/*     */     //   243: if_icmpne -> 256
/*     */     //   246: aload #5
/*     */     //   248: invokeinterface getSkipping : ()Z
/*     */     //   253: ifne -> 1699
/*     */     //   256: invokestatic isTraceInProgress : ()Z
/*     */     //   259: ifeq -> 274
/*     */     //   262: ldc_w 1719898038
/*     */     //   265: iload #7
/*     */     //   267: iconst_m1
/*     */     //   268: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.login.StartLoadingComponent (StartLoadingPage.kt:64)'
/*     */     //   271: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   274: aload #5
/*     */     //   276: iconst_0
/*     */     //   277: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */     //   280: invokevirtual getBackgroundColor-0d7_KjU : ()J
/*     */     //   283: lstore #8
/*     */     //   285: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   288: checkcast androidx/compose/ui/Modifier
/*     */     //   291: fconst_0
/*     */     //   292: iconst_1
/*     */     //   293: aconst_null
/*     */     //   294: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   297: lload #8
/*     */     //   299: aconst_null
/*     */     //   300: iconst_2
/*     */     //   301: aconst_null
/*     */     //   302: invokestatic background-bw27NRU$default : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   305: astore #10
/*     */     //   307: bipush #32
/*     */     //   309: istore #12
/*     */     //   311: iconst_0
/*     */     //   312: istore #13
/*     */     //   314: iload #12
/*     */     //   316: i2f
/*     */     //   317: invokestatic constructor-impl : (F)F
/*     */     //   320: fstore #11
/*     */     //   322: bipush #32
/*     */     //   324: istore #13
/*     */     //   326: iconst_0
/*     */     //   327: istore #14
/*     */     //   329: iload #13
/*     */     //   331: i2f
/*     */     //   332: invokestatic constructor-impl : (F)F
/*     */     //   335: fstore #12
/*     */     //   337: bipush #42
/*     */     //   339: istore #14
/*     */     //   341: iconst_0
/*     */     //   342: istore #15
/*     */     //   344: iload #14
/*     */     //   346: i2f
/*     */     //   347: invokestatic constructor-impl : (F)F
/*     */     //   350: fstore #13
/*     */     //   352: bipush #40
/*     */     //   354: istore #15
/*     */     //   356: iconst_0
/*     */     //   357: istore #16
/*     */     //   359: iload #15
/*     */     //   361: i2f
/*     */     //   362: invokestatic constructor-impl : (F)F
/*     */     //   365: fstore #14
/*     */     //   367: aload #10
/*     */     //   369: fload #11
/*     */     //   371: fload #13
/*     */     //   373: fload #12
/*     */     //   375: fload #14
/*     */     //   377: invokestatic padding-qDBjuR0 : (Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;
/*     */     //   380: astore #10
/*     */     //   382: iconst_0
/*     */     //   383: istore #13
/*     */     //   385: nop
/*     */     //   386: iconst_0
/*     */     //   387: istore #14
/*     */     //   389: aload #5
/*     */     //   391: ldc_w -483455358
/*     */     //   394: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   397: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   400: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   403: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   406: astore #11
/*     */     //   408: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   411: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   414: astore #12
/*     */     //   416: aload #11
/*     */     //   418: aload #12
/*     */     //   420: aload #5
/*     */     //   422: bipush #14
/*     */     //   424: iload #13
/*     */     //   426: iconst_3
/*     */     //   427: ishr
/*     */     //   428: iand
/*     */     //   429: bipush #112
/*     */     //   431: iload #13
/*     */     //   433: iconst_3
/*     */     //   434: ishr
/*     */     //   435: iand
/*     */     //   436: ior
/*     */     //   437: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   440: astore #15
/*     */     //   442: bipush #112
/*     */     //   444: iload #13
/*     */     //   446: iconst_3
/*     */     //   447: ishl
/*     */     //   448: iand
/*     */     //   449: istore #16
/*     */     //   451: nop
/*     */     //   452: iconst_0
/*     */     //   453: istore #17
/*     */     //   455: aload #5
/*     */     //   457: ldc -1323940314
/*     */     //   459: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   461: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   464: aload #5
/*     */     //   466: iconst_0
/*     */     //   467: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   470: istore #18
/*     */     //   472: aload #5
/*     */     //   474: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   479: astore #19
/*     */     //   481: aload #5
/*     */     //   483: aload #10
/*     */     //   485: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   488: astore #20
/*     */     //   490: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   493: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   496: astore #21
/*     */     //   498: bipush #6
/*     */     //   500: sipush #896
/*     */     //   503: iload #16
/*     */     //   505: bipush #6
/*     */     //   507: ishl
/*     */     //   508: iand
/*     */     //   509: ior
/*     */     //   510: istore #22
/*     */     //   512: nop
/*     */     //   513: iconst_0
/*     */     //   514: istore #23
/*     */     //   516: aload #5
/*     */     //   518: ldc -692256719
/*     */     //   520: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   522: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   525: aload #5
/*     */     //   527: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   532: instanceof androidx/compose/runtime/Applier
/*     */     //   535: ifne -> 541
/*     */     //   538: invokestatic invalidApplier : ()V
/*     */     //   541: aload #5
/*     */     //   543: invokeinterface startReusableNode : ()V
/*     */     //   548: aload #5
/*     */     //   550: invokeinterface getInserting : ()Z
/*     */     //   555: ifeq -> 570
/*     */     //   558: aload #5
/*     */     //   560: aload #21
/*     */     //   562: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   567: goto -> 577
/*     */     //   570: aload #5
/*     */     //   572: invokeinterface useNode : ()V
/*     */     //   577: aload #5
/*     */     //   579: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   582: astore #24
/*     */     //   584: iconst_0
/*     */     //   585: istore #25
/*     */     //   587: aload #24
/*     */     //   589: aload #15
/*     */     //   591: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   594: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   597: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   600: aload #24
/*     */     //   602: aload #19
/*     */     //   604: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   607: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   610: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   613: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   616: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   619: astore #26
/*     */     //   621: iconst_0
/*     */     //   622: istore #27
/*     */     //   624: aload #24
/*     */     //   626: astore #28
/*     */     //   628: iconst_0
/*     */     //   629: istore #29
/*     */     //   631: aload #28
/*     */     //   633: invokeinterface getInserting : ()Z
/*     */     //   638: ifne -> 659
/*     */     //   641: aload #28
/*     */     //   643: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   648: iload #18
/*     */     //   650: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   653: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   656: ifne -> 685
/*     */     //   659: aload #28
/*     */     //   661: iload #18
/*     */     //   663: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   666: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   671: aload #24
/*     */     //   673: iload #18
/*     */     //   675: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   678: aload #26
/*     */     //   680: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   685: nop
/*     */     //   686: nop
/*     */     //   687: nop
/*     */     //   688: aload #24
/*     */     //   690: aload #20
/*     */     //   692: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   695: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   698: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   701: nop
/*     */     //   702: nop
/*     */     //   703: aload #5
/*     */     //   705: bipush #14
/*     */     //   707: iload #22
/*     */     //   709: bipush #6
/*     */     //   711: ishr
/*     */     //   712: iand
/*     */     //   713: istore #30
/*     */     //   715: astore #31
/*     */     //   717: iconst_0
/*     */     //   718: istore #32
/*     */     //   720: aload #31
/*     */     //   722: ldc_w -384784025
/*     */     //   725: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   728: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   731: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   734: aload #31
/*     */     //   736: bipush #6
/*     */     //   738: bipush #112
/*     */     //   740: iload #13
/*     */     //   742: bipush #6
/*     */     //   744: ishr
/*     */     //   745: iand
/*     */     //   746: ior
/*     */     //   747: istore #33
/*     */     //   749: astore #34
/*     */     //   751: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   754: astore #35
/*     */     //   756: iconst_0
/*     */     //   757: istore #36
/*     */     //   759: aconst_null
/*     */     //   760: aload_0
/*     */     //   761: instanceof com/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$Idle
/*     */     //   764: ifne -> 773
/*     */     //   767: ldc_w ''
/*     */     //   770: goto -> 776
/*     */     //   773: ldc_w 'Delegate your tasks,\\nfocus on the results'
/*     */     //   776: lconst_0
/*     */     //   777: aload #34
/*     */     //   779: iconst_0
/*     */     //   780: iconst_5
/*     */     //   781: invokestatic JunieLogo-FNF3uiM : (Landroidx/compose/ui/Modifier;Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)V
/*     */     //   784: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   787: checkcast androidx/compose/ui/Modifier
/*     */     //   790: fconst_0
/*     */     //   791: bipush #20
/*     */     //   793: istore #37
/*     */     //   795: iconst_0
/*     */     //   796: istore #38
/*     */     //   798: iload #37
/*     */     //   800: i2f
/*     */     //   801: invokestatic constructor-impl : (F)F
/*     */     //   804: fconst_0
/*     */     //   805: fconst_0
/*     */     //   806: bipush #13
/*     */     //   808: aconst_null
/*     */     //   809: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   812: astore #37
/*     */     //   814: bipush #6
/*     */     //   816: istore #39
/*     */     //   818: iconst_0
/*     */     //   819: istore #40
/*     */     //   821: aload #34
/*     */     //   823: ldc_w -483455358
/*     */     //   826: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   829: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   832: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   835: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   838: astore #38
/*     */     //   840: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   843: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   846: astore #41
/*     */     //   848: aload #38
/*     */     //   850: aload #41
/*     */     //   852: aload #34
/*     */     //   854: bipush #14
/*     */     //   856: iload #39
/*     */     //   858: iconst_3
/*     */     //   859: ishr
/*     */     //   860: iand
/*     */     //   861: bipush #112
/*     */     //   863: iload #39
/*     */     //   865: iconst_3
/*     */     //   866: ishr
/*     */     //   867: iand
/*     */     //   868: ior
/*     */     //   869: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   872: astore #42
/*     */     //   874: bipush #112
/*     */     //   876: iload #39
/*     */     //   878: iconst_3
/*     */     //   879: ishl
/*     */     //   880: iand
/*     */     //   881: istore #43
/*     */     //   883: nop
/*     */     //   884: iconst_0
/*     */     //   885: istore #44
/*     */     //   887: aload #34
/*     */     //   889: ldc -1323940314
/*     */     //   891: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   893: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   896: aload #34
/*     */     //   898: iconst_0
/*     */     //   899: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   902: istore #45
/*     */     //   904: aload #34
/*     */     //   906: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   911: astore #46
/*     */     //   913: aload #34
/*     */     //   915: aload #37
/*     */     //   917: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   920: astore #47
/*     */     //   922: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   925: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   928: astore #48
/*     */     //   930: bipush #6
/*     */     //   932: sipush #896
/*     */     //   935: iload #43
/*     */     //   937: bipush #6
/*     */     //   939: ishl
/*     */     //   940: iand
/*     */     //   941: ior
/*     */     //   942: istore #49
/*     */     //   944: nop
/*     */     //   945: iconst_0
/*     */     //   946: istore #50
/*     */     //   948: aload #34
/*     */     //   950: ldc -692256719
/*     */     //   952: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   954: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   957: aload #34
/*     */     //   959: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   964: instanceof androidx/compose/runtime/Applier
/*     */     //   967: ifne -> 973
/*     */     //   970: invokestatic invalidApplier : ()V
/*     */     //   973: aload #34
/*     */     //   975: invokeinterface startReusableNode : ()V
/*     */     //   980: aload #34
/*     */     //   982: invokeinterface getInserting : ()Z
/*     */     //   987: ifeq -> 1002
/*     */     //   990: aload #34
/*     */     //   992: aload #48
/*     */     //   994: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   999: goto -> 1009
/*     */     //   1002: aload #34
/*     */     //   1004: invokeinterface useNode : ()V
/*     */     //   1009: aload #34
/*     */     //   1011: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1014: astore #51
/*     */     //   1016: iconst_0
/*     */     //   1017: istore #52
/*     */     //   1019: aload #51
/*     */     //   1021: aload #42
/*     */     //   1023: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1026: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1029: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1032: aload #51
/*     */     //   1034: aload #46
/*     */     //   1036: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1039: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1042: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1045: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1048: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1051: astore #53
/*     */     //   1053: iconst_0
/*     */     //   1054: istore #54
/*     */     //   1056: aload #51
/*     */     //   1058: astore #55
/*     */     //   1060: iconst_0
/*     */     //   1061: istore #56
/*     */     //   1063: aload #55
/*     */     //   1065: invokeinterface getInserting : ()Z
/*     */     //   1070: ifne -> 1091
/*     */     //   1073: aload #55
/*     */     //   1075: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1080: iload #45
/*     */     //   1082: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1085: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1088: ifne -> 1117
/*     */     //   1091: aload #55
/*     */     //   1093: iload #45
/*     */     //   1095: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1098: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1103: aload #51
/*     */     //   1105: iload #45
/*     */     //   1107: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1110: aload #53
/*     */     //   1112: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1117: nop
/*     */     //   1118: nop
/*     */     //   1119: nop
/*     */     //   1120: aload #51
/*     */     //   1122: aload #47
/*     */     //   1124: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1127: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1130: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1133: nop
/*     */     //   1134: nop
/*     */     //   1135: aload #34
/*     */     //   1137: bipush #14
/*     */     //   1139: iload #49
/*     */     //   1141: bipush #6
/*     */     //   1143: ishr
/*     */     //   1144: iand
/*     */     //   1145: istore #57
/*     */     //   1147: astore #58
/*     */     //   1149: iconst_0
/*     */     //   1150: istore #59
/*     */     //   1152: aload #58
/*     */     //   1154: ldc_w -384784025
/*     */     //   1157: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   1160: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1163: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   1166: aload #58
/*     */     //   1168: bipush #6
/*     */     //   1170: bipush #112
/*     */     //   1172: iload #39
/*     */     //   1174: bipush #6
/*     */     //   1176: ishr
/*     */     //   1177: iand
/*     */     //   1178: ior
/*     */     //   1179: istore #60
/*     */     //   1181: astore #61
/*     */     //   1183: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   1186: astore #62
/*     */     //   1188: iconst_0
/*     */     //   1189: istore #63
/*     */     //   1191: aload_0
/*     */     //   1192: astore #64
/*     */     //   1194: aload #64
/*     */     //   1196: instanceof com/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$Idle
/*     */     //   1199: ifeq -> 1252
/*     */     //   1202: aload #61
/*     */     //   1204: ldc_w 569095683
/*     */     //   1207: invokeinterface startReplaceGroup : (I)V
/*     */     //   1212: aload_1
/*     */     //   1213: aload_3
/*     */     //   1214: aload_0
/*     */     //   1215: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$Idle
/*     */     //   1218: invokevirtual getErrorInfo : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;
/*     */     //   1221: aload #61
/*     */     //   1223: bipush #14
/*     */     //   1225: iload #7
/*     */     //   1227: iconst_3
/*     */     //   1228: ishr
/*     */     //   1229: iand
/*     */     //   1230: bipush #112
/*     */     //   1232: iload #7
/*     */     //   1234: bipush #6
/*     */     //   1236: ishr
/*     */     //   1237: iand
/*     */     //   1238: ior
/*     */     //   1239: invokestatic LoginIdle : (Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1242: aload #61
/*     */     //   1244: invokeinterface endReplaceGroup : ()V
/*     */     //   1249: goto -> 1625
/*     */     //   1252: aload #64
/*     */     //   1254: instanceof com/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$Loading
/*     */     //   1257: ifeq -> 1301
/*     */     //   1260: aload #61
/*     */     //   1262: ldc_w 569098900
/*     */     //   1265: invokeinterface startReplaceGroup : (I)V
/*     */     //   1270: aload_0
/*     */     //   1271: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$Loading
/*     */     //   1274: invokevirtual getShowHelp : ()Z
/*     */     //   1277: aload_3
/*     */     //   1278: aload #61
/*     */     //   1280: bipush #112
/*     */     //   1282: iload #7
/*     */     //   1284: bipush #6
/*     */     //   1286: ishr
/*     */     //   1287: iand
/*     */     //   1288: invokestatic LoadingLogin : (ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1291: aload #61
/*     */     //   1293: invokeinterface endReplaceGroup : ()V
/*     */     //   1298: goto -> 1625
/*     */     //   1301: aload #64
/*     */     //   1303: instanceof com/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$LoginSuccessWithLicense
/*     */     //   1306: ifeq -> 1358
/*     */     //   1309: aload #61
/*     */     //   1311: ldc_w 462300444
/*     */     //   1314: invokeinterface startReplaceGroup : (I)V
/*     */     //   1319: ldc_w 'Login Successful!!'
/*     */     //   1322: aconst_null
/*     */     //   1323: lconst_0
/*     */     //   1324: lconst_0
/*     */     //   1325: aconst_null
/*     */     //   1326: aconst_null
/*     */     //   1327: aconst_null
/*     */     //   1328: lconst_0
/*     */     //   1329: aconst_null
/*     */     //   1330: iconst_0
/*     */     //   1331: lconst_0
/*     */     //   1332: iconst_0
/*     */     //   1333: iconst_0
/*     */     //   1334: iconst_0
/*     */     //   1335: aconst_null
/*     */     //   1336: aconst_null
/*     */     //   1337: aload #61
/*     */     //   1339: bipush #6
/*     */     //   1341: iconst_0
/*     */     //   1342: ldc_w 65534
/*     */     //   1345: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1348: aload #61
/*     */     //   1350: invokeinterface endReplaceGroup : ()V
/*     */     //   1355: goto -> 1625
/*     */     //   1358: aload #64
/*     */     //   1360: instanceof com/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$LoginSuccessNoLicense
/*     */     //   1363: ifeq -> 1406
/*     */     //   1366: aload #61
/*     */     //   1368: ldc_w 569107998
/*     */     //   1371: invokeinterface startReplaceGroup : (I)V
/*     */     //   1376: aload_0
/*     */     //   1377: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$LoginSuccessNoLicense
/*     */     //   1380: invokevirtual getUsername : ()Ljava/lang/String;
/*     */     //   1383: aload_2
/*     */     //   1384: aload #61
/*     */     //   1386: bipush #112
/*     */     //   1388: iload #7
/*     */     //   1390: iconst_3
/*     */     //   1391: ishr
/*     */     //   1392: iand
/*     */     //   1393: invokestatic NoLicensedLogin : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1396: aload #61
/*     */     //   1398: invokeinterface endReplaceGroup : ()V
/*     */     //   1403: goto -> 1625
/*     */     //   1406: aload #64
/*     */     //   1408: instanceof com/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$NeedHelp
/*     */     //   1411: ifeq -> 1600
/*     */     //   1414: aload #61
/*     */     //   1416: ldc_w 569111345
/*     */     //   1419: invokeinterface startReplaceGroup : (I)V
/*     */     //   1424: aload_0
/*     */     //   1425: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$NeedHelp
/*     */     //   1428: invokevirtual getLoginLink : ()Lkotlinx/coroutines/flow/Flow;
/*     */     //   1431: aload_0
/*     */     //   1432: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$NeedHelp
/*     */     //   1435: invokevirtual getShareFeedbackAction : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1438: aload #61
/*     */     //   1440: ldc_w 569115974
/*     */     //   1443: invokeinterface startReplaceGroup : (I)V
/*     */     //   1448: aload #61
/*     */     //   1450: astore #65
/*     */     //   1452: iload #7
/*     */     //   1454: bipush #14
/*     */     //   1456: iand
/*     */     //   1457: iconst_4
/*     */     //   1458: if_icmpeq -> 1480
/*     */     //   1461: iload #7
/*     */     //   1463: bipush #8
/*     */     //   1465: iand
/*     */     //   1466: ifeq -> 1484
/*     */     //   1469: aload #5
/*     */     //   1471: aload_0
/*     */     //   1472: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1477: ifeq -> 1484
/*     */     //   1480: iconst_1
/*     */     //   1481: goto -> 1485
/*     */     //   1484: iconst_0
/*     */     //   1485: istore #66
/*     */     //   1487: nop
/*     */     //   1488: iconst_0
/*     */     //   1489: istore #67
/*     */     //   1491: aload #65
/*     */     //   1493: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1498: astore #68
/*     */     //   1500: iconst_0
/*     */     //   1501: istore #69
/*     */     //   1503: iload #66
/*     */     //   1505: ifne -> 1519
/*     */     //   1508: aload #68
/*     */     //   1510: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1513: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1516: if_acmpne -> 1556
/*     */     //   1519: astore #70
/*     */     //   1521: astore #71
/*     */     //   1523: iconst_0
/*     */     //   1524: istore #72
/*     */     //   1526: aload_0
/*     */     //   1527: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState;)Lkotlin/jvm/functions/Function0;
/*     */     //   1532: astore #73
/*     */     //   1534: aload #71
/*     */     //   1536: aload #70
/*     */     //   1538: aload #73
/*     */     //   1540: astore #74
/*     */     //   1542: aload #65
/*     */     //   1544: aload #74
/*     */     //   1546: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1551: aload #74
/*     */     //   1553: goto -> 1558
/*     */     //   1556: aload #68
/*     */     //   1558: nop
/*     */     //   1559: nop
/*     */     //   1560: nop
/*     */     //   1561: checkcast kotlin/jvm/functions/Function0
/*     */     //   1564: astore #75
/*     */     //   1566: aload #61
/*     */     //   1568: invokeinterface endReplaceGroup : ()V
/*     */     //   1573: aload #75
/*     */     //   1575: aload #4
/*     */     //   1577: aload #61
/*     */     //   1579: sipush #7168
/*     */     //   1582: iload #7
/*     */     //   1584: iconst_3
/*     */     //   1585: ishr
/*     */     //   1586: iand
/*     */     //   1587: invokestatic UserNeedHelp : (Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1590: aload #61
/*     */     //   1592: invokeinterface endReplaceGroup : ()V
/*     */     //   1597: goto -> 1625
/*     */     //   1600: aload #61
/*     */     //   1602: ldc_w 569094799
/*     */     //   1605: invokeinterface startReplaceGroup : (I)V
/*     */     //   1610: aload #61
/*     */     //   1612: invokeinterface endReplaceGroup : ()V
/*     */     //   1617: new kotlin/NoWhenBranchMatchedException
/*     */     //   1620: dup
/*     */     //   1621: invokespecial <init> : ()V
/*     */     //   1624: athrow
/*     */     //   1625: nop
/*     */     //   1626: aload #58
/*     */     //   1628: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1631: aload #34
/*     */     //   1633: invokeinterface endNode : ()V
/*     */     //   1638: aload #34
/*     */     //   1640: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1643: nop
/*     */     //   1644: aload #34
/*     */     //   1646: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1649: nop
/*     */     //   1650: aload #34
/*     */     //   1652: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1655: nop
/*     */     //   1656: nop
/*     */     //   1657: aload #31
/*     */     //   1659: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1662: aload #5
/*     */     //   1664: invokeinterface endNode : ()V
/*     */     //   1669: aload #5
/*     */     //   1671: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1674: nop
/*     */     //   1675: aload #5
/*     */     //   1677: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1680: nop
/*     */     //   1681: aload #5
/*     */     //   1683: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1686: nop
/*     */     //   1687: invokestatic isTraceInProgress : ()Z
/*     */     //   1690: ifeq -> 1706
/*     */     //   1693: invokestatic traceEventEnd : ()V
/*     */     //   1696: goto -> 1706
/*     */     //   1699: aload #5
/*     */     //   1701: invokeinterface skipToGroupEnd : ()V
/*     */     //   1706: aload #5
/*     */     //   1708: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1713: dup
/*     */     //   1714: ifnull -> 1738
/*     */     //   1717: aload_0
/*     */     //   1718: aload_1
/*     */     //   1719: aload_2
/*     */     //   1720: aload_3
/*     */     //   1721: aload #4
/*     */     //   1723: iload #6
/*     */     //   1725: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)Lkotlin/jvm/functions/Function2;
/*     */     //   1730: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1735: goto -> 1739
/*     */     //   1738: pop
/*     */     //   1739: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #65	-> 36
/*     */     //   #66	-> 277
/*     */     //   #68	-> 285
/*     */     //   #69	-> 291
/*     */     //   #70	-> 297
/*     */     //   #71	-> 307
/*     */     //   #249	-> 314
/*     */     //   #71	-> 320
/*     */     //   #249	-> 329
/*     */     //   #71	-> 335
/*     */     //   #249	-> 344
/*     */     //   #71	-> 350
/*     */     //   #249	-> 359
/*     */     //   #71	-> 365
/*     */     //   #70	-> 367
/*     */     //   #71	-> 369
/*     */     //   #67	-> 385
/*     */     //   #250	-> 397
/*     */     //   #251	-> 400
/*     */     //   #252	-> 408
/*     */     //   #255	-> 416
/*     */     //   #256	-> 451
/*     */     //   #257	-> 461
/*     */     //   #258	-> 467
/*     */     //   #259	-> 474
/*     */     //   #260	-> 483
/*     */     //   #262	-> 490
/*     */     //   #261	-> 512
/*     */     //   #263	-> 522
/*     */     //   #264	-> 525
/*     */     //   #265	-> 543
/*     */     //   #266	-> 548
/*     */     //   #267	-> 560
/*     */     //   #269	-> 572
/*     */     //   #271	-> 577
/*     */     //   #272	-> 587
/*     */     //   #273	-> 600
/*     */     //   #275	-> 613
/*     */     //   #276	-> 624
/*     */     //   #277	-> 631
/*     */     //   #278	-> 659
/*     */     //   #279	-> 671
/*     */     //   #281	-> 685
/*     */     //   #276	-> 686
/*     */     //   #281	-> 687
/*     */     //   #282	-> 688
/*     */     //   #283	-> 701
/*     */     //   #271	-> 702
/*     */     //   #284	-> 703
/*     */     //   #285	-> 728
/*     */     //   #74	-> 760
/*     */     //   #76	-> 784
/*     */     //   #286	-> 798
/*     */     //   #76	-> 804
/*     */     //   #287	-> 829
/*     */     //   #288	-> 832
/*     */     //   #289	-> 840
/*     */     //   #292	-> 848
/*     */     //   #293	-> 883
/*     */     //   #294	-> 893
/*     */     //   #295	-> 899
/*     */     //   #296	-> 906
/*     */     //   #297	-> 915
/*     */     //   #299	-> 922
/*     */     //   #298	-> 944
/*     */     //   #300	-> 954
/*     */     //   #301	-> 957
/*     */     //   #302	-> 975
/*     */     //   #303	-> 980
/*     */     //   #304	-> 992
/*     */     //   #306	-> 1004
/*     */     //   #308	-> 1009
/*     */     //   #309	-> 1019
/*     */     //   #310	-> 1032
/*     */     //   #312	-> 1045
/*     */     //   #313	-> 1056
/*     */     //   #314	-> 1063
/*     */     //   #315	-> 1091
/*     */     //   #316	-> 1103
/*     */     //   #318	-> 1117
/*     */     //   #313	-> 1118
/*     */     //   #318	-> 1119
/*     */     //   #319	-> 1120
/*     */     //   #320	-> 1133
/*     */     //   #308	-> 1134
/*     */     //   #321	-> 1135
/*     */     //   #322	-> 1160
/*     */     //   #77	-> 1191
/*     */     //   #78	-> 1194
/*     */     //   #80	-> 1252
/*     */     //   #82	-> 1301
/*     */     //   #83	-> 1319
/*     */     //   #82	-> 1348
/*     */     //   #86	-> 1358
/*     */     //   #89	-> 1406
/*     */     //   #90	-> 1424
/*     */     //   #91	-> 1431
/*     */     //   #92	-> 1487
/*     */     //   #323	-> 1491
/*     */     //   #324	-> 1503
/*     */     //   #325	-> 1519
/*     */     //   #92	-> 1526
/*     */     //   #325	-> 1540
/*     */     //   #326	-> 1542
/*     */     //   #327	-> 1551
/*     */     //   #328	-> 1556
/*     */     //   #324	-> 1558
/*     */     //   #323	-> 1559
/*     */     //   #323	-> 1560
/*     */     //   #92	-> 1561
/*     */     //   #93	-> 1575
/*     */     //   #89	-> 1587
/*     */     //   #77	-> 1600
/*     */     //   #96	-> 1625
/*     */     //   #322	-> 1626
/*     */     //   #321	-> 1631
/*     */     //   #329	-> 1633
/*     */     //   #300	-> 1640
/*     */     //   #330	-> 1643
/*     */     //   #294	-> 1646
/*     */     //   #331	-> 1649
/*     */     //   #287	-> 1652
/*     */     //   #332	-> 1655
/*     */     //   #97	-> 1656
/*     */     //   #285	-> 1657
/*     */     //   #284	-> 1662
/*     */     //   #333	-> 1664
/*     */     //   #263	-> 1671
/*     */     //   #334	-> 1674
/*     */     //   #257	-> 1677
/*     */     //   #335	-> 1680
/*     */     //   #250	-> 1683
/*     */     //   #336	-> 1686
/*     */     //   #98	-> 1699
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   314	6	13	$i$f$getDp	I
/*     */     //   311	9	12	$this$dp$iv	I
/*     */     //   329	6	14	$i$f$getDp	I
/*     */     //   326	9	13	$this$dp$iv	I
/*     */     //   344	6	15	$i$f$getDp	I
/*     */     //   341	9	14	$this$dp$iv	I
/*     */     //   359	6	16	$i$f$getDp	I
/*     */     //   356	9	15	$this$dp$iv	I
/*     */     //   798	6	38	$i$f$getDp	I
/*     */     //   795	9	37	$this$dp$iv	I
/*     */     //   1526	6	72	$i$a$-cache-StartLoadingPageKt$StartLoadingComponent$1$1$1	I
/*     */     //   1542	11	74	value$iv	Ljava/lang/Object;
/*     */     //   1503	56	69	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1500	59	68	it$iv	Ljava/lang/Object;
/*     */     //   1491	70	67	$i$f$cache	I
/*     */     //   1488	73	65	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1488	73	66	invalid$iv	Z
/*     */     //   1191	435	63	$i$a$-Column-StartLoadingPageKt$StartLoadingComponent$1$1	I
/*     */     //   1188	438	62	$this$StartLoadingComponent_u24lambda_u2412_u24lambda_u2411	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   1188	438	61	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1188	438	60	$changed	I
/*     */     //   1152	479	59	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   1149	482	58	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1149	482	57	$changed$iv	I
/*     */     //   1063	55	56	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1060	58	55	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1056	64	54	$i$f$set-impl	I
/*     */     //   1053	67	53	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1019	115	52	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1016	118	51	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   948	696	50	$i$f$ReusableComposeNode	I
/*     */     //   945	699	48	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   945	699	49	$changed$iv$iv$iv	I
/*     */     //   887	763	44	$i$f$Layout	I
/*     */     //   904	746	45	compositeKeyHash$iv$iv	I
/*     */     //   913	737	46	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   922	728	47	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   884	766	43	$changed$iv$iv	I
/*     */     //   821	835	40	$i$f$Column	I
/*     */     //   874	782	42	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   818	838	37	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   840	816	38	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   848	808	41	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   818	838	39	$changed$iv	I
/*     */     //   759	898	36	$i$a$-Column-StartLoadingPageKt$StartLoadingComponent$1	I
/*     */     //   756	901	35	$this$StartLoadingComponent_u24lambda_u2412	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   756	901	34	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   756	901	33	$changed	I
/*     */     //   720	942	32	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   717	945	31	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   717	945	30	$changed$iv	I
/*     */     //   631	55	29	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   628	58	28	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   624	64	27	$i$f$set-impl	I
/*     */     //   621	67	26	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   587	115	25	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   584	118	24	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   516	1159	23	$i$f$ReusableComposeNode	I
/*     */     //   513	1162	21	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   513	1162	22	$changed$iv$iv$iv	I
/*     */     //   455	1226	17	$i$f$Layout	I
/*     */     //   472	1209	18	compositeKeyHash$iv$iv	I
/*     */     //   481	1200	19	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   490	1191	20	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   452	1229	16	$changed$iv$iv	I
/*     */     //   389	1298	14	$i$f$Column	I
/*     */     //   442	1245	15	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   386	1301	10	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   408	1279	11	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   416	1271	12	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   386	1301	13	$changed$iv	I
/*     */     //   285	1411	8	backgroundColor	J
/*     */     //   52	1688	7	$dirty	I
/*     */     //   0	1740	0	state	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState;
/*     */     //   0	1740	1	openLoginAction	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1740	2	openJoinWaitListAction	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1740	3	onNeedHelpClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1740	4	onBackToLogin	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1740	5	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1740	6	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit StartLoadingComponent$lambda$12$lambda$11$lambda$10$lambda$9(LoginScreenState $state) {
/*     */     UtilsKt.copyStringToClipboard(((LoginScreenState.NeedHelp)$state).getShareFeedbackAction().toString());
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void LoginIdle(@NotNull Function0 openLoginAction, @NotNull Function0 onNeedHelpClick, @Nullable ErrorInfo error, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'openLoginAction'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: ldc_w 'onNeedHelpClick'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload_3
/*     */     //   15: ldc_w -1519976736
/*     */     //   18: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   23: astore_3
/*     */     //   24: iload #4
/*     */     //   26: istore #5
/*     */     //   28: iload #4
/*     */     //   30: bipush #6
/*     */     //   32: iand
/*     */     //   33: ifne -> 56
/*     */     //   36: iload #5
/*     */     //   38: aload_3
/*     */     //   39: aload_0
/*     */     //   40: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   45: ifeq -> 52
/*     */     //   48: iconst_4
/*     */     //   49: goto -> 53
/*     */     //   52: iconst_2
/*     */     //   53: ior
/*     */     //   54: istore #5
/*     */     //   56: iload #4
/*     */     //   58: bipush #48
/*     */     //   60: iand
/*     */     //   61: ifne -> 86
/*     */     //   64: iload #5
/*     */     //   66: aload_3
/*     */     //   67: aload_1
/*     */     //   68: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   73: ifeq -> 81
/*     */     //   76: bipush #32
/*     */     //   78: goto -> 83
/*     */     //   81: bipush #16
/*     */     //   83: ior
/*     */     //   84: istore #5
/*     */     //   86: iload #4
/*     */     //   88: sipush #384
/*     */     //   91: iand
/*     */     //   92: ifne -> 119
/*     */     //   95: iload #5
/*     */     //   97: aload_3
/*     */     //   98: aload_2
/*     */     //   99: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   104: ifeq -> 113
/*     */     //   107: sipush #256
/*     */     //   110: goto -> 116
/*     */     //   113: sipush #128
/*     */     //   116: ior
/*     */     //   117: istore #5
/*     */     //   119: iload #5
/*     */     //   121: sipush #147
/*     */     //   124: iand
/*     */     //   125: sipush #146
/*     */     //   128: if_icmpne -> 140
/*     */     //   131: aload_3
/*     */     //   132: invokeinterface getSkipping : ()Z
/*     */     //   137: ifne -> 778
/*     */     //   140: invokestatic isTraceInProgress : ()Z
/*     */     //   143: ifeq -> 158
/*     */     //   146: ldc_w -1519976736
/*     */     //   149: iload #5
/*     */     //   151: iconst_m1
/*     */     //   152: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.login.LoginIdle (StartLoadingPage.kt:101)'
/*     */     //   155: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   158: iconst_0
/*     */     //   159: istore #7
/*     */     //   161: ldc_w com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService
/*     */     //   164: astore #8
/*     */     //   166: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   169: aload #8
/*     */     //   171: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */     //   176: dup
/*     */     //   177: ifnonnull -> 247
/*     */     //   180: pop
/*     */     //   181: new java/lang/RuntimeException
/*     */     //   184: dup
/*     */     //   185: new java/lang/StringBuilder
/*     */     //   188: dup
/*     */     //   189: invokespecial <init> : ()V
/*     */     //   192: ldc_w 'Cannot find service '
/*     */     //   195: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   198: aload #8
/*     */     //   200: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   203: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   206: ldc_w ' (classloader='
/*     */     //   209: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   212: aload #8
/*     */     //   214: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
/*     */     //   217: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   220: ldc_w ', client='
/*     */     //   223: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   226: getstatic com/intellij/codeWithMe/ClientId.Companion : Lcom/intellij/codeWithMe/ClientId$Companion;
/*     */     //   229: invokevirtual getCurrentOrNull : ()Lcom/intellij/codeWithMe/ClientId;
/*     */     //   232: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   235: bipush #41
/*     */     //   237: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   240: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   243: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   246: athrow
/*     */     //   247: nop
/*     */     //   248: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService
/*     */     //   251: invokevirtual getShouldUseJbaAccount : ()Z
/*     */     //   254: ifeq -> 263
/*     */     //   257: ldc_w 'Login with JetBrains Account'
/*     */     //   260: goto -> 266
/*     */     //   263: ldc_w 'Login with Google Account'
/*     */     //   266: astore #6
/*     */     //   268: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   271: bipush #16
/*     */     //   273: istore #8
/*     */     //   275: iconst_0
/*     */     //   276: istore #9
/*     */     //   278: iload #8
/*     */     //   280: i2f
/*     */     //   281: invokestatic constructor-impl : (F)F
/*     */     //   284: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   287: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
/*     */     //   290: astore #8
/*     */     //   292: bipush #48
/*     */     //   294: istore #10
/*     */     //   296: iconst_0
/*     */     //   297: istore #11
/*     */     //   299: aload_3
/*     */     //   300: ldc_w -483455358
/*     */     //   303: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   306: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   309: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   312: checkcast androidx/compose/ui/Modifier
/*     */     //   315: astore #7
/*     */     //   317: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   320: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   323: astore #9
/*     */     //   325: aload #8
/*     */     //   327: aload #9
/*     */     //   329: aload_3
/*     */     //   330: bipush #14
/*     */     //   332: iload #10
/*     */     //   334: iconst_3
/*     */     //   335: ishr
/*     */     //   336: iand
/*     */     //   337: bipush #112
/*     */     //   339: iload #10
/*     */     //   341: iconst_3
/*     */     //   342: ishr
/*     */     //   343: iand
/*     */     //   344: ior
/*     */     //   345: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   348: astore #12
/*     */     //   350: bipush #112
/*     */     //   352: iload #10
/*     */     //   354: iconst_3
/*     */     //   355: ishl
/*     */     //   356: iand
/*     */     //   357: istore #13
/*     */     //   359: nop
/*     */     //   360: iconst_0
/*     */     //   361: istore #14
/*     */     //   363: aload_3
/*     */     //   364: ldc -1323940314
/*     */     //   366: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   368: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   371: aload_3
/*     */     //   372: iconst_0
/*     */     //   373: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   376: istore #15
/*     */     //   378: aload_3
/*     */     //   379: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   384: astore #16
/*     */     //   386: aload_3
/*     */     //   387: aload #7
/*     */     //   389: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   392: astore #17
/*     */     //   394: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   397: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   400: astore #18
/*     */     //   402: bipush #6
/*     */     //   404: sipush #896
/*     */     //   407: iload #13
/*     */     //   409: bipush #6
/*     */     //   411: ishl
/*     */     //   412: iand
/*     */     //   413: ior
/*     */     //   414: istore #19
/*     */     //   416: nop
/*     */     //   417: iconst_0
/*     */     //   418: istore #20
/*     */     //   420: aload_3
/*     */     //   421: ldc -692256719
/*     */     //   423: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   425: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   428: aload_3
/*     */     //   429: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   434: instanceof androidx/compose/runtime/Applier
/*     */     //   437: ifne -> 443
/*     */     //   440: invokestatic invalidApplier : ()V
/*     */     //   443: aload_3
/*     */     //   444: invokeinterface startReusableNode : ()V
/*     */     //   449: aload_3
/*     */     //   450: invokeinterface getInserting : ()Z
/*     */     //   455: ifeq -> 469
/*     */     //   458: aload_3
/*     */     //   459: aload #18
/*     */     //   461: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   466: goto -> 475
/*     */     //   469: aload_3
/*     */     //   470: invokeinterface useNode : ()V
/*     */     //   475: aload_3
/*     */     //   476: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   479: astore #21
/*     */     //   481: iconst_0
/*     */     //   482: istore #22
/*     */     //   484: aload #21
/*     */     //   486: aload #12
/*     */     //   488: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   491: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   494: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   497: aload #21
/*     */     //   499: aload #16
/*     */     //   501: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   504: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   507: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   510: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   513: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   516: astore #23
/*     */     //   518: iconst_0
/*     */     //   519: istore #24
/*     */     //   521: aload #21
/*     */     //   523: astore #25
/*     */     //   525: iconst_0
/*     */     //   526: istore #26
/*     */     //   528: aload #25
/*     */     //   530: invokeinterface getInserting : ()Z
/*     */     //   535: ifne -> 556
/*     */     //   538: aload #25
/*     */     //   540: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   545: iload #15
/*     */     //   547: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   550: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   553: ifne -> 582
/*     */     //   556: aload #25
/*     */     //   558: iload #15
/*     */     //   560: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   563: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   568: aload #21
/*     */     //   570: iload #15
/*     */     //   572: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   575: aload #23
/*     */     //   577: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   582: nop
/*     */     //   583: nop
/*     */     //   584: nop
/*     */     //   585: aload #21
/*     */     //   587: aload #17
/*     */     //   589: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   592: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   595: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   598: nop
/*     */     //   599: nop
/*     */     //   600: aload_3
/*     */     //   601: bipush #14
/*     */     //   603: iload #19
/*     */     //   605: bipush #6
/*     */     //   607: ishr
/*     */     //   608: iand
/*     */     //   609: istore #27
/*     */     //   611: astore #28
/*     */     //   613: iconst_0
/*     */     //   614: istore #29
/*     */     //   616: aload #28
/*     */     //   618: ldc_w -384784025
/*     */     //   621: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   624: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   627: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   630: aload #28
/*     */     //   632: bipush #6
/*     */     //   634: bipush #112
/*     */     //   636: iload #10
/*     */     //   638: bipush #6
/*     */     //   640: ishr
/*     */     //   641: iand
/*     */     //   642: ior
/*     */     //   643: istore #30
/*     */     //   645: astore #31
/*     */     //   647: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   650: astore #32
/*     */     //   652: iconst_0
/*     */     //   653: istore #33
/*     */     //   655: aload #6
/*     */     //   657: aconst_null
/*     */     //   658: iconst_0
/*     */     //   659: aload_0
/*     */     //   660: aconst_null
/*     */     //   661: aload #31
/*     */     //   663: sipush #7168
/*     */     //   666: iload #5
/*     */     //   668: bipush #9
/*     */     //   670: ishl
/*     */     //   671: iand
/*     */     //   672: bipush #22
/*     */     //   674: invokestatic Button : (Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   677: aload #31
/*     */     //   679: ldc_w 1552559684
/*     */     //   682: invokeinterface startReplaceGroup : (I)V
/*     */     //   687: aload_2
/*     */     //   688: ifnull -> 706
/*     */     //   691: aconst_null
/*     */     //   692: aload_2
/*     */     //   693: aload #31
/*     */     //   695: bipush #112
/*     */     //   697: iload #5
/*     */     //   699: iconst_3
/*     */     //   700: ishr
/*     */     //   701: iand
/*     */     //   702: iconst_1
/*     */     //   703: invokestatic ErrorComponent : (Landroidx/compose/ui/Modifier;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;Landroidx/compose/runtime/Composer;II)V
/*     */     //   706: aload #31
/*     */     //   708: invokeinterface endReplaceGroup : ()V
/*     */     //   713: ldc_w 'Need help?'
/*     */     //   716: aload_1
/*     */     //   717: aconst_null
/*     */     //   718: iconst_0
/*     */     //   719: aconst_null
/*     */     //   720: iconst_0
/*     */     //   721: aconst_null
/*     */     //   722: aconst_null
/*     */     //   723: aload #31
/*     */     //   725: bipush #6
/*     */     //   727: bipush #112
/*     */     //   729: iload #5
/*     */     //   731: iand
/*     */     //   732: ior
/*     */     //   733: sipush #252
/*     */     //   736: invokestatic Link-kye4rC8 : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V
/*     */     //   739: nop
/*     */     //   740: aload #28
/*     */     //   742: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   745: aload_3
/*     */     //   746: invokeinterface endNode : ()V
/*     */     //   751: aload_3
/*     */     //   752: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   755: nop
/*     */     //   756: aload_3
/*     */     //   757: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   760: nop
/*     */     //   761: aload_3
/*     */     //   762: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   765: nop
/*     */     //   766: invokestatic isTraceInProgress : ()Z
/*     */     //   769: ifeq -> 784
/*     */     //   772: invokestatic traceEventEnd : ()V
/*     */     //   775: goto -> 784
/*     */     //   778: aload_3
/*     */     //   779: invokeinterface skipToGroupEnd : ()V
/*     */     //   784: aload_3
/*     */     //   785: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   790: dup
/*     */     //   791: ifnull -> 812
/*     */     //   794: aload_0
/*     */     //   795: aload_1
/*     */     //   796: aload_2
/*     */     //   797: iload #4
/*     */     //   799: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;I)Lkotlin/jvm/functions/Function2;
/*     */     //   804: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   809: goto -> 813
/*     */     //   812: pop
/*     */     //   813: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #102	-> 14
/*     */     //   #104	-> 158
/*     */     //   #337	-> 161
/*     */     //   #338	-> 166
/*     */     //   #339	-> 181
/*     */     //   #338	-> 247
/*     */     //   #104	-> 248
/*     */     //   #105	-> 257
/*     */     //   #107	-> 263
/*     */     //   #104	-> 266
/*     */     //   #103	-> 266
/*     */     //   #108	-> 268
/*     */     //   #340	-> 278
/*     */     //   #108	-> 284
/*     */     //   #341	-> 306
/*     */     //   #342	-> 309
/*     */     //   #344	-> 317
/*     */     //   #347	-> 325
/*     */     //   #348	-> 359
/*     */     //   #349	-> 368
/*     */     //   #350	-> 373
/*     */     //   #351	-> 379
/*     */     //   #352	-> 387
/*     */     //   #354	-> 394
/*     */     //   #353	-> 416
/*     */     //   #355	-> 425
/*     */     //   #356	-> 428
/*     */     //   #357	-> 444
/*     */     //   #358	-> 449
/*     */     //   #359	-> 459
/*     */     //   #361	-> 470
/*     */     //   #363	-> 475
/*     */     //   #364	-> 484
/*     */     //   #365	-> 497
/*     */     //   #367	-> 510
/*     */     //   #368	-> 521
/*     */     //   #369	-> 528
/*     */     //   #370	-> 556
/*     */     //   #371	-> 568
/*     */     //   #373	-> 582
/*     */     //   #368	-> 583
/*     */     //   #373	-> 584
/*     */     //   #374	-> 585
/*     */     //   #375	-> 598
/*     */     //   #363	-> 599
/*     */     //   #376	-> 600
/*     */     //   #377	-> 624
/*     */     //   #109	-> 655
/*     */     //   #110	-> 687
/*     */     //   #111	-> 692
/*     */     //   #113	-> 713
/*     */     //   #114	-> 739
/*     */     //   #377	-> 740
/*     */     //   #376	-> 745
/*     */     //   #378	-> 746
/*     */     //   #355	-> 752
/*     */     //   #379	-> 755
/*     */     //   #349	-> 757
/*     */     //   #380	-> 760
/*     */     //   #341	-> 762
/*     */     //   #381	-> 765
/*     */     //   #116	-> 778
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   161	87	7	$i$f$service	I
/*     */     //   166	82	8	serviceClass$iv	Ljava/lang/Class;
/*     */     //   278	6	9	$i$f$getDp	I
/*     */     //   275	9	8	$this$dp$iv	I
/*     */     //   655	85	33	$i$a$-Column-StartLoadingPageKt$LoginIdle$1	I
/*     */     //   652	88	32	$this$LoginIdle_u24lambda_u2414	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   652	88	31	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   652	88	30	$changed	I
/*     */     //   616	129	29	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   613	132	28	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   613	132	27	$changed$iv	I
/*     */     //   528	55	26	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   525	58	25	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   521	64	24	$i$f$set-impl	I
/*     */     //   518	67	23	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   484	115	22	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   481	118	21	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   420	336	20	$i$f$ReusableComposeNode	I
/*     */     //   417	339	18	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   417	339	19	$changed$iv$iv$iv	I
/*     */     //   363	398	14	$i$f$Layout	I
/*     */     //   378	383	15	compositeKeyHash$iv$iv	I
/*     */     //   386	375	16	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   394	367	17	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   360	401	13	$changed$iv$iv	I
/*     */     //   299	467	11	$i$f$Column	I
/*     */     //   350	416	12	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   317	449	7	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   296	470	8	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   325	441	9	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   296	470	10	$changed$iv	I
/*     */     //   268	507	6	text	Ljava/lang/String;
/*     */     //   28	786	5	$dirty	I
/*     */     //   0	814	0	openLoginAction	Lkotlin/jvm/functions/Function0;
/*     */     //   0	814	1	onNeedHelpClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	814	2	error	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;
/*     */     //   0	814	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	814	4	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void LoadingLogin(boolean showHelpLink, @NotNull Function0 onNeedHelpClick, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'onNeedHelpClick'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: ldc_w -946872946
/*     */     //   11: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   16: astore_2
/*     */     //   17: iload_3
/*     */     //   18: istore #4
/*     */     //   20: iload_3
/*     */     //   21: bipush #6
/*     */     //   23: iand
/*     */     //   24: ifne -> 47
/*     */     //   27: iload #4
/*     */     //   29: aload_2
/*     */     //   30: iload_0
/*     */     //   31: invokeinterface changed : (Z)Z
/*     */     //   36: ifeq -> 43
/*     */     //   39: iconst_4
/*     */     //   40: goto -> 44
/*     */     //   43: iconst_2
/*     */     //   44: ior
/*     */     //   45: istore #4
/*     */     //   47: iload_3
/*     */     //   48: bipush #48
/*     */     //   50: iand
/*     */     //   51: ifne -> 76
/*     */     //   54: iload #4
/*     */     //   56: aload_2
/*     */     //   57: aload_1
/*     */     //   58: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   63: ifeq -> 71
/*     */     //   66: bipush #32
/*     */     //   68: goto -> 73
/*     */     //   71: bipush #16
/*     */     //   73: ior
/*     */     //   74: istore #4
/*     */     //   76: iload #4
/*     */     //   78: bipush #19
/*     */     //   80: iand
/*     */     //   81: bipush #18
/*     */     //   83: if_icmpne -> 95
/*     */     //   86: aload_2
/*     */     //   87: invokeinterface getSkipping : ()Z
/*     */     //   92: ifne -> 597
/*     */     //   95: invokestatic isTraceInProgress : ()Z
/*     */     //   98: ifeq -> 113
/*     */     //   101: ldc_w -946872946
/*     */     //   104: iload #4
/*     */     //   106: iconst_m1
/*     */     //   107: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.login.LoadingLogin (StartLoadingPage.kt:119)'
/*     */     //   110: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   113: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   116: bipush #16
/*     */     //   118: istore #6
/*     */     //   120: iconst_0
/*     */     //   121: istore #7
/*     */     //   123: iload #6
/*     */     //   125: i2f
/*     */     //   126: invokestatic constructor-impl : (F)F
/*     */     //   129: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   132: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*     */     //   135: astore #6
/*     */     //   137: bipush #48
/*     */     //   139: istore #8
/*     */     //   141: iconst_0
/*     */     //   142: istore #9
/*     */     //   144: aload_2
/*     */     //   145: ldc_w 693286680
/*     */     //   148: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   151: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   154: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   157: checkcast androidx/compose/ui/Modifier
/*     */     //   160: astore #5
/*     */     //   162: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   165: invokevirtual getTop : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   168: astore #7
/*     */     //   170: aload #6
/*     */     //   172: aload #7
/*     */     //   174: aload_2
/*     */     //   175: bipush #14
/*     */     //   177: iload #8
/*     */     //   179: iconst_3
/*     */     //   180: ishr
/*     */     //   181: iand
/*     */     //   182: bipush #112
/*     */     //   184: iload #8
/*     */     //   186: iconst_3
/*     */     //   187: ishr
/*     */     //   188: iand
/*     */     //   189: ior
/*     */     //   190: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   193: astore #10
/*     */     //   195: bipush #112
/*     */     //   197: iload #8
/*     */     //   199: iconst_3
/*     */     //   200: ishl
/*     */     //   201: iand
/*     */     //   202: istore #11
/*     */     //   204: nop
/*     */     //   205: iconst_0
/*     */     //   206: istore #12
/*     */     //   208: aload_2
/*     */     //   209: ldc -1323940314
/*     */     //   211: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   213: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   216: aload_2
/*     */     //   217: iconst_0
/*     */     //   218: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   221: istore #13
/*     */     //   223: aload_2
/*     */     //   224: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   229: astore #14
/*     */     //   231: aload_2
/*     */     //   232: aload #5
/*     */     //   234: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   237: astore #15
/*     */     //   239: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   242: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   245: astore #16
/*     */     //   247: bipush #6
/*     */     //   249: sipush #896
/*     */     //   252: iload #11
/*     */     //   254: bipush #6
/*     */     //   256: ishl
/*     */     //   257: iand
/*     */     //   258: ior
/*     */     //   259: istore #17
/*     */     //   261: nop
/*     */     //   262: iconst_0
/*     */     //   263: istore #18
/*     */     //   265: aload_2
/*     */     //   266: ldc -692256719
/*     */     //   268: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   270: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   273: aload_2
/*     */     //   274: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   279: instanceof androidx/compose/runtime/Applier
/*     */     //   282: ifne -> 288
/*     */     //   285: invokestatic invalidApplier : ()V
/*     */     //   288: aload_2
/*     */     //   289: invokeinterface startReusableNode : ()V
/*     */     //   294: aload_2
/*     */     //   295: invokeinterface getInserting : ()Z
/*     */     //   300: ifeq -> 314
/*     */     //   303: aload_2
/*     */     //   304: aload #16
/*     */     //   306: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   311: goto -> 320
/*     */     //   314: aload_2
/*     */     //   315: invokeinterface useNode : ()V
/*     */     //   320: aload_2
/*     */     //   321: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   324: astore #19
/*     */     //   326: iconst_0
/*     */     //   327: istore #20
/*     */     //   329: aload #19
/*     */     //   331: aload #10
/*     */     //   333: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   336: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   339: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   342: aload #19
/*     */     //   344: aload #14
/*     */     //   346: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   349: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   352: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   355: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   358: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   361: astore #21
/*     */     //   363: iconst_0
/*     */     //   364: istore #22
/*     */     //   366: aload #19
/*     */     //   368: astore #23
/*     */     //   370: iconst_0
/*     */     //   371: istore #24
/*     */     //   373: aload #23
/*     */     //   375: invokeinterface getInserting : ()Z
/*     */     //   380: ifne -> 401
/*     */     //   383: aload #23
/*     */     //   385: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   390: iload #13
/*     */     //   392: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   395: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   398: ifne -> 427
/*     */     //   401: aload #23
/*     */     //   403: iload #13
/*     */     //   405: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   408: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   413: aload #19
/*     */     //   415: iload #13
/*     */     //   417: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   420: aload #21
/*     */     //   422: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   427: nop
/*     */     //   428: nop
/*     */     //   429: nop
/*     */     //   430: aload #19
/*     */     //   432: aload #15
/*     */     //   434: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   437: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   440: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   443: nop
/*     */     //   444: nop
/*     */     //   445: aload_2
/*     */     //   446: bipush #14
/*     */     //   448: iload #17
/*     */     //   450: bipush #6
/*     */     //   452: ishr
/*     */     //   453: iand
/*     */     //   454: istore #25
/*     */     //   456: astore #26
/*     */     //   458: iconst_0
/*     */     //   459: istore #27
/*     */     //   461: aload #26
/*     */     //   463: ldc_w -407840262
/*     */     //   466: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   469: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   472: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   475: aload #26
/*     */     //   477: bipush #6
/*     */     //   479: bipush #112
/*     */     //   481: iload #8
/*     */     //   483: bipush #6
/*     */     //   485: ishr
/*     */     //   486: iand
/*     */     //   487: ior
/*     */     //   488: istore #28
/*     */     //   490: astore #29
/*     */     //   492: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   495: astore #30
/*     */     //   497: iconst_0
/*     */     //   498: istore #31
/*     */     //   500: aconst_null
/*     */     //   501: lconst_0
/*     */     //   502: aconst_null
/*     */     //   503: aload #29
/*     */     //   505: iconst_0
/*     */     //   506: bipush #7
/*     */     //   508: invokestatic JunieCircularProgressIndicator-3IgeMak : (Landroidx/compose/ui/Modifier;JLjava/lang/String;Landroidx/compose/runtime/Composer;II)V
/*     */     //   511: aload #29
/*     */     //   513: ldc_w 219032506
/*     */     //   516: invokeinterface startReplaceGroup : (I)V
/*     */     //   521: iload_0
/*     */     //   522: ifeq -> 551
/*     */     //   525: ldc_w 'Need help?'
/*     */     //   528: aload_1
/*     */     //   529: aconst_null
/*     */     //   530: iconst_0
/*     */     //   531: aconst_null
/*     */     //   532: iconst_0
/*     */     //   533: aconst_null
/*     */     //   534: aconst_null
/*     */     //   535: aload #29
/*     */     //   537: bipush #6
/*     */     //   539: bipush #112
/*     */     //   541: iload #4
/*     */     //   543: iand
/*     */     //   544: ior
/*     */     //   545: sipush #252
/*     */     //   548: invokestatic Link-kye4rC8 : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V
/*     */     //   551: aload #29
/*     */     //   553: invokeinterface endReplaceGroup : ()V
/*     */     //   558: nop
/*     */     //   559: aload #26
/*     */     //   561: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   564: aload_2
/*     */     //   565: invokeinterface endNode : ()V
/*     */     //   570: aload_2
/*     */     //   571: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   574: nop
/*     */     //   575: aload_2
/*     */     //   576: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   579: nop
/*     */     //   580: aload_2
/*     */     //   581: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   584: nop
/*     */     //   585: invokestatic isTraceInProgress : ()Z
/*     */     //   588: ifeq -> 603
/*     */     //   591: invokestatic traceEventEnd : ()V
/*     */     //   594: goto -> 603
/*     */     //   597: aload_2
/*     */     //   598: invokeinterface skipToGroupEnd : ()V
/*     */     //   603: aload_2
/*     */     //   604: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   609: dup
/*     */     //   610: ifnull -> 629
/*     */     //   613: iload_0
/*     */     //   614: aload_1
/*     */     //   615: iload_3
/*     */     //   616: <illegal opcode> invoke : (ZLkotlin/jvm/functions/Function0;I)Lkotlin/jvm/functions/Function2;
/*     */     //   621: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   626: goto -> 630
/*     */     //   629: pop
/*     */     //   630: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #120	-> 7
/*     */     //   #121	-> 113
/*     */     //   #382	-> 123
/*     */     //   #121	-> 129
/*     */     //   #383	-> 151
/*     */     //   #384	-> 154
/*     */     //   #386	-> 162
/*     */     //   #389	-> 170
/*     */     //   #390	-> 204
/*     */     //   #391	-> 213
/*     */     //   #392	-> 218
/*     */     //   #393	-> 224
/*     */     //   #394	-> 232
/*     */     //   #396	-> 239
/*     */     //   #395	-> 261
/*     */     //   #397	-> 270
/*     */     //   #398	-> 273
/*     */     //   #399	-> 289
/*     */     //   #400	-> 294
/*     */     //   #401	-> 304
/*     */     //   #403	-> 315
/*     */     //   #405	-> 320
/*     */     //   #406	-> 329
/*     */     //   #407	-> 342
/*     */     //   #409	-> 355
/*     */     //   #410	-> 366
/*     */     //   #411	-> 373
/*     */     //   #412	-> 401
/*     */     //   #413	-> 413
/*     */     //   #415	-> 427
/*     */     //   #410	-> 428
/*     */     //   #415	-> 429
/*     */     //   #416	-> 430
/*     */     //   #417	-> 443
/*     */     //   #405	-> 444
/*     */     //   #418	-> 445
/*     */     //   #419	-> 469
/*     */     //   #122	-> 508
/*     */     //   #123	-> 521
/*     */     //   #124	-> 525
/*     */     //   #126	-> 558
/*     */     //   #419	-> 559
/*     */     //   #418	-> 564
/*     */     //   #420	-> 565
/*     */     //   #397	-> 571
/*     */     //   #421	-> 574
/*     */     //   #391	-> 576
/*     */     //   #422	-> 579
/*     */     //   #383	-> 581
/*     */     //   #423	-> 584
/*     */     //   #127	-> 597
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   123	6	7	$i$f$getDp	I
/*     */     //   120	9	6	$this$dp$iv	I
/*     */     //   500	59	31	$i$a$-Row-StartLoadingPageKt$LoadingLogin$1	I
/*     */     //   497	62	30	$this$LoadingLogin_u24lambda_u2416	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   497	62	29	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   497	62	28	$changed	I
/*     */     //   461	103	27	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   458	106	26	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   458	106	25	$changed$iv	I
/*     */     //   373	55	24	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   370	58	23	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   366	64	22	$i$f$set-impl	I
/*     */     //   363	67	21	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   329	115	20	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   326	118	19	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   265	310	18	$i$f$ReusableComposeNode	I
/*     */     //   262	313	16	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   262	313	17	$changed$iv$iv$iv	I
/*     */     //   208	372	12	$i$f$Layout	I
/*     */     //   223	357	13	compositeKeyHash$iv$iv	I
/*     */     //   231	349	14	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   239	341	15	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   205	375	11	$changed$iv$iv	I
/*     */     //   144	441	9	$i$f$Row	I
/*     */     //   195	390	10	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   162	423	5	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   141	444	6	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   170	415	7	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   141	444	8	$changed$iv	I
/*     */     //   20	611	4	$dirty	I
/*     */     //   0	631	0	showHelpLink	Z
/*     */     //   0	631	1	onNeedHelpClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	631	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	631	3	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   private static final void NoLicensedLogin(String userName, Function0 openJoinWaitListAction, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc_w -375713657
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
/*     */     //   50: aload_1
/*     */     //   51: invokeinterface changedInstance : (Ljava/lang/Object;)Z
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
/*     */     //   85: ifne -> 1955
/*     */     //   88: invokestatic isTraceInProgress : ()Z
/*     */     //   91: ifeq -> 106
/*     */     //   94: ldc_w -375713657
/*     */     //   97: iload #4
/*     */     //   99: iconst_m1
/*     */     //   100: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.login.NoLicensedLogin (StartLoadingPage.kt:129)'
/*     */     //   103: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   106: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   109: bipush #8
/*     */     //   111: istore #6
/*     */     //   113: iconst_0
/*     */     //   114: istore #7
/*     */     //   116: iload #6
/*     */     //   118: i2f
/*     */     //   119: invokestatic constructor-impl : (F)F
/*     */     //   122: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   125: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
/*     */     //   128: astore #6
/*     */     //   130: bipush #48
/*     */     //   132: istore #8
/*     */     //   134: iconst_0
/*     */     //   135: istore #9
/*     */     //   137: aload_2
/*     */     //   138: ldc_w -483455358
/*     */     //   141: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   144: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   147: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   150: checkcast androidx/compose/ui/Modifier
/*     */     //   153: astore #5
/*     */     //   155: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   158: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   161: astore #7
/*     */     //   163: aload #6
/*     */     //   165: aload #7
/*     */     //   167: aload_2
/*     */     //   168: bipush #14
/*     */     //   170: iload #8
/*     */     //   172: iconst_3
/*     */     //   173: ishr
/*     */     //   174: iand
/*     */     //   175: bipush #112
/*     */     //   177: iload #8
/*     */     //   179: iconst_3
/*     */     //   180: ishr
/*     */     //   181: iand
/*     */     //   182: ior
/*     */     //   183: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   186: astore #10
/*     */     //   188: bipush #112
/*     */     //   190: iload #8
/*     */     //   192: iconst_3
/*     */     //   193: ishl
/*     */     //   194: iand
/*     */     //   195: istore #11
/*     */     //   197: nop
/*     */     //   198: iconst_0
/*     */     //   199: istore #12
/*     */     //   201: aload_2
/*     */     //   202: ldc -1323940314
/*     */     //   204: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   206: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   209: aload_2
/*     */     //   210: iconst_0
/*     */     //   211: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   214: istore #13
/*     */     //   216: aload_2
/*     */     //   217: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   222: astore #14
/*     */     //   224: aload_2
/*     */     //   225: aload #5
/*     */     //   227: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   230: astore #15
/*     */     //   232: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   235: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   238: astore #16
/*     */     //   240: bipush #6
/*     */     //   242: sipush #896
/*     */     //   245: iload #11
/*     */     //   247: bipush #6
/*     */     //   249: ishl
/*     */     //   250: iand
/*     */     //   251: ior
/*     */     //   252: istore #17
/*     */     //   254: nop
/*     */     //   255: iconst_0
/*     */     //   256: istore #18
/*     */     //   258: aload_2
/*     */     //   259: ldc -692256719
/*     */     //   261: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   263: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   266: aload_2
/*     */     //   267: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   272: instanceof androidx/compose/runtime/Applier
/*     */     //   275: ifne -> 281
/*     */     //   278: invokestatic invalidApplier : ()V
/*     */     //   281: aload_2
/*     */     //   282: invokeinterface startReusableNode : ()V
/*     */     //   287: aload_2
/*     */     //   288: invokeinterface getInserting : ()Z
/*     */     //   293: ifeq -> 307
/*     */     //   296: aload_2
/*     */     //   297: aload #16
/*     */     //   299: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   304: goto -> 313
/*     */     //   307: aload_2
/*     */     //   308: invokeinterface useNode : ()V
/*     */     //   313: aload_2
/*     */     //   314: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   317: astore #19
/*     */     //   319: iconst_0
/*     */     //   320: istore #20
/*     */     //   322: aload #19
/*     */     //   324: aload #10
/*     */     //   326: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   329: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   332: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   335: aload #19
/*     */     //   337: aload #14
/*     */     //   339: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   342: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   345: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   348: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   351: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   354: astore #21
/*     */     //   356: iconst_0
/*     */     //   357: istore #22
/*     */     //   359: aload #19
/*     */     //   361: astore #23
/*     */     //   363: iconst_0
/*     */     //   364: istore #24
/*     */     //   366: aload #23
/*     */     //   368: invokeinterface getInserting : ()Z
/*     */     //   373: ifne -> 394
/*     */     //   376: aload #23
/*     */     //   378: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   383: iload #13
/*     */     //   385: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   388: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   391: ifne -> 420
/*     */     //   394: aload #23
/*     */     //   396: iload #13
/*     */     //   398: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   401: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   406: aload #19
/*     */     //   408: iload #13
/*     */     //   410: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   413: aload #21
/*     */     //   415: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   420: nop
/*     */     //   421: nop
/*     */     //   422: nop
/*     */     //   423: aload #19
/*     */     //   425: aload #15
/*     */     //   427: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   430: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   433: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   436: nop
/*     */     //   437: nop
/*     */     //   438: aload_2
/*     */     //   439: bipush #14
/*     */     //   441: iload #17
/*     */     //   443: bipush #6
/*     */     //   445: ishr
/*     */     //   446: iand
/*     */     //   447: istore #25
/*     */     //   449: astore #26
/*     */     //   451: iconst_0
/*     */     //   452: istore #27
/*     */     //   454: aload #26
/*     */     //   456: ldc_w -384784025
/*     */     //   459: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   462: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   465: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   468: aload #26
/*     */     //   470: bipush #6
/*     */     //   472: bipush #112
/*     */     //   474: iload #8
/*     */     //   476: bipush #6
/*     */     //   478: ishr
/*     */     //   479: iand
/*     */     //   480: ior
/*     */     //   481: istore #28
/*     */     //   483: astore #29
/*     */     //   485: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   488: astore #30
/*     */     //   490: iconst_0
/*     */     //   491: istore #31
/*     */     //   493: iconst_0
/*     */     //   494: istore #32
/*     */     //   496: nop
/*     */     //   497: iconst_0
/*     */     //   498: istore #33
/*     */     //   500: aload #29
/*     */     //   502: ldc_w -483455358
/*     */     //   505: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   508: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   511: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   514: checkcast androidx/compose/ui/Modifier
/*     */     //   517: astore #34
/*     */     //   519: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   522: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   525: astore #35
/*     */     //   527: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   530: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   533: astore #36
/*     */     //   535: aload #35
/*     */     //   537: aload #36
/*     */     //   539: aload #29
/*     */     //   541: bipush #14
/*     */     //   543: iload #32
/*     */     //   545: iconst_3
/*     */     //   546: ishr
/*     */     //   547: iand
/*     */     //   548: bipush #112
/*     */     //   550: iload #32
/*     */     //   552: iconst_3
/*     */     //   553: ishr
/*     */     //   554: iand
/*     */     //   555: ior
/*     */     //   556: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   559: astore #37
/*     */     //   561: bipush #112
/*     */     //   563: iload #32
/*     */     //   565: iconst_3
/*     */     //   566: ishl
/*     */     //   567: iand
/*     */     //   568: istore #38
/*     */     //   570: nop
/*     */     //   571: iconst_0
/*     */     //   572: istore #39
/*     */     //   574: aload #29
/*     */     //   576: ldc -1323940314
/*     */     //   578: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   580: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   583: aload #29
/*     */     //   585: iconst_0
/*     */     //   586: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   589: istore #40
/*     */     //   591: aload #29
/*     */     //   593: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   598: astore #41
/*     */     //   600: aload #29
/*     */     //   602: aload #34
/*     */     //   604: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   607: astore #42
/*     */     //   609: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   612: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   615: astore #43
/*     */     //   617: bipush #6
/*     */     //   619: sipush #896
/*     */     //   622: iload #38
/*     */     //   624: bipush #6
/*     */     //   626: ishl
/*     */     //   627: iand
/*     */     //   628: ior
/*     */     //   629: istore #44
/*     */     //   631: nop
/*     */     //   632: iconst_0
/*     */     //   633: istore #45
/*     */     //   635: aload #29
/*     */     //   637: ldc -692256719
/*     */     //   639: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   641: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   644: aload #29
/*     */     //   646: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   651: instanceof androidx/compose/runtime/Applier
/*     */     //   654: ifne -> 660
/*     */     //   657: invokestatic invalidApplier : ()V
/*     */     //   660: aload #29
/*     */     //   662: invokeinterface startReusableNode : ()V
/*     */     //   667: aload #29
/*     */     //   669: invokeinterface getInserting : ()Z
/*     */     //   674: ifeq -> 689
/*     */     //   677: aload #29
/*     */     //   679: aload #43
/*     */     //   681: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   686: goto -> 696
/*     */     //   689: aload #29
/*     */     //   691: invokeinterface useNode : ()V
/*     */     //   696: aload #29
/*     */     //   698: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   701: astore #46
/*     */     //   703: iconst_0
/*     */     //   704: istore #47
/*     */     //   706: aload #46
/*     */     //   708: aload #37
/*     */     //   710: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   713: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   716: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   719: aload #46
/*     */     //   721: aload #41
/*     */     //   723: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   726: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   729: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   732: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   735: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   738: astore #48
/*     */     //   740: iconst_0
/*     */     //   741: istore #49
/*     */     //   743: aload #46
/*     */     //   745: astore #50
/*     */     //   747: iconst_0
/*     */     //   748: istore #51
/*     */     //   750: aload #50
/*     */     //   752: invokeinterface getInserting : ()Z
/*     */     //   757: ifne -> 778
/*     */     //   760: aload #50
/*     */     //   762: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   767: iload #40
/*     */     //   769: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   772: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   775: ifne -> 804
/*     */     //   778: aload #50
/*     */     //   780: iload #40
/*     */     //   782: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   785: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   790: aload #46
/*     */     //   792: iload #40
/*     */     //   794: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   797: aload #48
/*     */     //   799: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   804: nop
/*     */     //   805: nop
/*     */     //   806: nop
/*     */     //   807: aload #46
/*     */     //   809: aload #42
/*     */     //   811: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   814: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   817: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   820: nop
/*     */     //   821: nop
/*     */     //   822: aload #29
/*     */     //   824: bipush #14
/*     */     //   826: iload #44
/*     */     //   828: bipush #6
/*     */     //   830: ishr
/*     */     //   831: iand
/*     */     //   832: istore #52
/*     */     //   834: astore #53
/*     */     //   836: iconst_0
/*     */     //   837: istore #54
/*     */     //   839: aload #53
/*     */     //   841: ldc_w -384784025
/*     */     //   844: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   847: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   850: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   853: aload #53
/*     */     //   855: bipush #6
/*     */     //   857: bipush #112
/*     */     //   859: iload #32
/*     */     //   861: bipush #6
/*     */     //   863: ishr
/*     */     //   864: iand
/*     */     //   865: ior
/*     */     //   866: istore #55
/*     */     //   868: astore #56
/*     */     //   870: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   873: astore #57
/*     */     //   875: iconst_0
/*     */     //   876: istore #58
/*     */     //   878: aload_0
/*     */     //   879: dup
/*     */     //   880: ifnull -> 891
/*     */     //   883: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   888: goto -> 895
/*     */     //   891: pop
/*     */     //   892: ldc_w 'Hello.'
/*     */     //   895: astore #59
/*     */     //   897: aload #59
/*     */     //   899: aconst_null
/*     */     //   900: lconst_0
/*     */     //   901: lconst_0
/*     */     //   902: aconst_null
/*     */     //   903: aconst_null
/*     */     //   904: aconst_null
/*     */     //   905: lconst_0
/*     */     //   906: aconst_null
/*     */     //   907: iconst_0
/*     */     //   908: lconst_0
/*     */     //   909: iconst_0
/*     */     //   910: iconst_0
/*     */     //   911: iconst_0
/*     */     //   912: aconst_null
/*     */     //   913: aconst_null
/*     */     //   914: aload #56
/*     */     //   916: iconst_0
/*     */     //   917: iconst_0
/*     */     //   918: ldc_w 65534
/*     */     //   921: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   924: ldc_w 'You are logged in.'
/*     */     //   927: aconst_null
/*     */     //   928: lconst_0
/*     */     //   929: lconst_0
/*     */     //   930: aconst_null
/*     */     //   931: aconst_null
/*     */     //   932: aconst_null
/*     */     //   933: lconst_0
/*     */     //   934: aconst_null
/*     */     //   935: iconst_0
/*     */     //   936: lconst_0
/*     */     //   937: iconst_0
/*     */     //   938: iconst_0
/*     */     //   939: iconst_0
/*     */     //   940: aconst_null
/*     */     //   941: aconst_null
/*     */     //   942: aload #56
/*     */     //   944: bipush #6
/*     */     //   946: iconst_0
/*     */     //   947: ldc_w 65534
/*     */     //   950: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   953: nop
/*     */     //   954: aload #53
/*     */     //   956: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   959: aload #29
/*     */     //   961: invokeinterface endNode : ()V
/*     */     //   966: aload #29
/*     */     //   968: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   971: nop
/*     */     //   972: aload #29
/*     */     //   974: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   977: nop
/*     */     //   978: aload #29
/*     */     //   980: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   983: nop
/*     */     //   984: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   987: bipush #8
/*     */     //   989: istore #35
/*     */     //   991: iconst_0
/*     */     //   992: istore #36
/*     */     //   994: iload #35
/*     */     //   996: i2f
/*     */     //   997: invokestatic constructor-impl : (F)F
/*     */     //   1000: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   1003: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
/*     */     //   1006: astore #35
/*     */     //   1008: bipush #48
/*     */     //   1010: istore #32
/*     */     //   1012: iconst_0
/*     */     //   1013: istore #33
/*     */     //   1015: aload #29
/*     */     //   1017: ldc_w -483455358
/*     */     //   1020: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   1023: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1026: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1029: checkcast androidx/compose/ui/Modifier
/*     */     //   1032: astore #34
/*     */     //   1034: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1037: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   1040: astore #36
/*     */     //   1042: aload #35
/*     */     //   1044: aload #36
/*     */     //   1046: aload #29
/*     */     //   1048: bipush #14
/*     */     //   1050: iload #32
/*     */     //   1052: iconst_3
/*     */     //   1053: ishr
/*     */     //   1054: iand
/*     */     //   1055: bipush #112
/*     */     //   1057: iload #32
/*     */     //   1059: iconst_3
/*     */     //   1060: ishr
/*     */     //   1061: iand
/*     */     //   1062: ior
/*     */     //   1063: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1066: astore #37
/*     */     //   1068: bipush #112
/*     */     //   1070: iload #32
/*     */     //   1072: iconst_3
/*     */     //   1073: ishl
/*     */     //   1074: iand
/*     */     //   1075: istore #38
/*     */     //   1077: nop
/*     */     //   1078: iconst_0
/*     */     //   1079: istore #39
/*     */     //   1081: aload #29
/*     */     //   1083: ldc -1323940314
/*     */     //   1085: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1087: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1090: aload #29
/*     */     //   1092: iconst_0
/*     */     //   1093: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1096: istore #40
/*     */     //   1098: aload #29
/*     */     //   1100: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1105: astore #41
/*     */     //   1107: aload #29
/*     */     //   1109: aload #34
/*     */     //   1111: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1114: astore #42
/*     */     //   1116: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1119: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1122: astore #43
/*     */     //   1124: bipush #6
/*     */     //   1126: sipush #896
/*     */     //   1129: iload #38
/*     */     //   1131: bipush #6
/*     */     //   1133: ishl
/*     */     //   1134: iand
/*     */     //   1135: ior
/*     */     //   1136: istore #44
/*     */     //   1138: nop
/*     */     //   1139: iconst_0
/*     */     //   1140: istore #45
/*     */     //   1142: aload #29
/*     */     //   1144: ldc -692256719
/*     */     //   1146: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1148: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1151: aload #29
/*     */     //   1153: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1158: instanceof androidx/compose/runtime/Applier
/*     */     //   1161: ifne -> 1167
/*     */     //   1164: invokestatic invalidApplier : ()V
/*     */     //   1167: aload #29
/*     */     //   1169: invokeinterface startReusableNode : ()V
/*     */     //   1174: aload #29
/*     */     //   1176: invokeinterface getInserting : ()Z
/*     */     //   1181: ifeq -> 1196
/*     */     //   1184: aload #29
/*     */     //   1186: aload #43
/*     */     //   1188: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1193: goto -> 1203
/*     */     //   1196: aload #29
/*     */     //   1198: invokeinterface useNode : ()V
/*     */     //   1203: aload #29
/*     */     //   1205: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1208: astore #46
/*     */     //   1210: iconst_0
/*     */     //   1211: istore #47
/*     */     //   1213: aload #46
/*     */     //   1215: aload #37
/*     */     //   1217: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1220: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1223: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1226: aload #46
/*     */     //   1228: aload #41
/*     */     //   1230: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1233: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1236: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1239: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1242: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1245: astore #48
/*     */     //   1247: iconst_0
/*     */     //   1248: istore #49
/*     */     //   1250: aload #46
/*     */     //   1252: astore #50
/*     */     //   1254: iconst_0
/*     */     //   1255: istore #51
/*     */     //   1257: aload #50
/*     */     //   1259: invokeinterface getInserting : ()Z
/*     */     //   1264: ifne -> 1285
/*     */     //   1267: aload #50
/*     */     //   1269: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1274: iload #40
/*     */     //   1276: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1279: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1282: ifne -> 1311
/*     */     //   1285: aload #50
/*     */     //   1287: iload #40
/*     */     //   1289: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1292: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1297: aload #46
/*     */     //   1299: iload #40
/*     */     //   1301: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1304: aload #48
/*     */     //   1306: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1311: nop
/*     */     //   1312: nop
/*     */     //   1313: nop
/*     */     //   1314: aload #46
/*     */     //   1316: aload #42
/*     */     //   1318: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1321: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1324: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1327: nop
/*     */     //   1328: nop
/*     */     //   1329: aload #29
/*     */     //   1331: bipush #14
/*     */     //   1333: iload #44
/*     */     //   1335: bipush #6
/*     */     //   1337: ishr
/*     */     //   1338: iand
/*     */     //   1339: istore #52
/*     */     //   1341: astore #53
/*     */     //   1343: iconst_0
/*     */     //   1344: istore #54
/*     */     //   1346: aload #53
/*     */     //   1348: ldc_w -384784025
/*     */     //   1351: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   1354: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1357: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   1360: aload #53
/*     */     //   1362: bipush #6
/*     */     //   1364: bipush #112
/*     */     //   1366: iload #32
/*     */     //   1368: bipush #6
/*     */     //   1370: ishr
/*     */     //   1371: iand
/*     */     //   1372: ior
/*     */     //   1373: istore #55
/*     */     //   1375: astore #56
/*     */     //   1377: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   1380: astore #57
/*     */     //   1382: iconst_0
/*     */     //   1383: istore #58
/*     */     //   1385: ldc_w 'Currently access to Junie is available only by invitation.'
/*     */     //   1388: aconst_null
/*     */     //   1389: lconst_0
/*     */     //   1390: lconst_0
/*     */     //   1391: aconst_null
/*     */     //   1392: aconst_null
/*     */     //   1393: aconst_null
/*     */     //   1394: lconst_0
/*     */     //   1395: aconst_null
/*     */     //   1396: iconst_0
/*     */     //   1397: lconst_0
/*     */     //   1398: iconst_0
/*     */     //   1399: iconst_0
/*     */     //   1400: iconst_0
/*     */     //   1401: aconst_null
/*     */     //   1402: aconst_null
/*     */     //   1403: aload #56
/*     */     //   1405: bipush #6
/*     */     //   1407: iconst_0
/*     */     //   1408: ldc_w 65534
/*     */     //   1411: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1414: nop
/*     */     //   1415: aload #53
/*     */     //   1417: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1420: aload #29
/*     */     //   1422: invokeinterface endNode : ()V
/*     */     //   1427: aload #29
/*     */     //   1429: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1432: nop
/*     */     //   1433: aload #29
/*     */     //   1435: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1438: nop
/*     */     //   1439: aload #29
/*     */     //   1441: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1444: nop
/*     */     //   1445: iconst_0
/*     */     //   1446: istore #32
/*     */     //   1448: nop
/*     */     //   1449: iconst_0
/*     */     //   1450: istore #33
/*     */     //   1452: aload #29
/*     */     //   1454: ldc_w 693286680
/*     */     //   1457: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   1460: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1463: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1466: checkcast androidx/compose/ui/Modifier
/*     */     //   1469: astore #34
/*     */     //   1471: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   1474: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   1477: astore #35
/*     */     //   1479: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1482: invokevirtual getTop : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   1485: astore #36
/*     */     //   1487: aload #35
/*     */     //   1489: aload #36
/*     */     //   1491: aload #29
/*     */     //   1493: bipush #14
/*     */     //   1495: iload #32
/*     */     //   1497: iconst_3
/*     */     //   1498: ishr
/*     */     //   1499: iand
/*     */     //   1500: bipush #112
/*     */     //   1502: iload #32
/*     */     //   1504: iconst_3
/*     */     //   1505: ishr
/*     */     //   1506: iand
/*     */     //   1507: ior
/*     */     //   1508: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1511: astore #37
/*     */     //   1513: bipush #112
/*     */     //   1515: iload #32
/*     */     //   1517: iconst_3
/*     */     //   1518: ishl
/*     */     //   1519: iand
/*     */     //   1520: istore #38
/*     */     //   1522: nop
/*     */     //   1523: iconst_0
/*     */     //   1524: istore #39
/*     */     //   1526: aload #29
/*     */     //   1528: ldc -1323940314
/*     */     //   1530: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1532: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1535: aload #29
/*     */     //   1537: iconst_0
/*     */     //   1538: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1541: istore #40
/*     */     //   1543: aload #29
/*     */     //   1545: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1550: astore #41
/*     */     //   1552: aload #29
/*     */     //   1554: aload #34
/*     */     //   1556: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1559: astore #42
/*     */     //   1561: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1564: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1567: astore #43
/*     */     //   1569: bipush #6
/*     */     //   1571: sipush #896
/*     */     //   1574: iload #38
/*     */     //   1576: bipush #6
/*     */     //   1578: ishl
/*     */     //   1579: iand
/*     */     //   1580: ior
/*     */     //   1581: istore #44
/*     */     //   1583: nop
/*     */     //   1584: iconst_0
/*     */     //   1585: istore #45
/*     */     //   1587: aload #29
/*     */     //   1589: ldc -692256719
/*     */     //   1591: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1593: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1596: aload #29
/*     */     //   1598: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1603: instanceof androidx/compose/runtime/Applier
/*     */     //   1606: ifne -> 1612
/*     */     //   1609: invokestatic invalidApplier : ()V
/*     */     //   1612: aload #29
/*     */     //   1614: invokeinterface startReusableNode : ()V
/*     */     //   1619: aload #29
/*     */     //   1621: invokeinterface getInserting : ()Z
/*     */     //   1626: ifeq -> 1641
/*     */     //   1629: aload #29
/*     */     //   1631: aload #43
/*     */     //   1633: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1638: goto -> 1648
/*     */     //   1641: aload #29
/*     */     //   1643: invokeinterface useNode : ()V
/*     */     //   1648: aload #29
/*     */     //   1650: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1653: astore #46
/*     */     //   1655: iconst_0
/*     */     //   1656: istore #47
/*     */     //   1658: aload #46
/*     */     //   1660: aload #37
/*     */     //   1662: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1665: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1668: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1671: aload #46
/*     */     //   1673: aload #41
/*     */     //   1675: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1678: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1681: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1684: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1687: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1690: astore #48
/*     */     //   1692: iconst_0
/*     */     //   1693: istore #49
/*     */     //   1695: aload #46
/*     */     //   1697: astore #50
/*     */     //   1699: iconst_0
/*     */     //   1700: istore #51
/*     */     //   1702: aload #50
/*     */     //   1704: invokeinterface getInserting : ()Z
/*     */     //   1709: ifne -> 1730
/*     */     //   1712: aload #50
/*     */     //   1714: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1719: iload #40
/*     */     //   1721: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1724: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1727: ifne -> 1756
/*     */     //   1730: aload #50
/*     */     //   1732: iload #40
/*     */     //   1734: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1737: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1742: aload #46
/*     */     //   1744: iload #40
/*     */     //   1746: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1749: aload #48
/*     */     //   1751: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1756: nop
/*     */     //   1757: nop
/*     */     //   1758: nop
/*     */     //   1759: aload #46
/*     */     //   1761: aload #42
/*     */     //   1763: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1766: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1769: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1772: nop
/*     */     //   1773: nop
/*     */     //   1774: aload #29
/*     */     //   1776: bipush #14
/*     */     //   1778: iload #44
/*     */     //   1780: bipush #6
/*     */     //   1782: ishr
/*     */     //   1783: iand
/*     */     //   1784: istore #52
/*     */     //   1786: astore #53
/*     */     //   1788: iconst_0
/*     */     //   1789: istore #54
/*     */     //   1791: aload #53
/*     */     //   1793: ldc_w -407840262
/*     */     //   1796: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   1799: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1802: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   1805: aload #53
/*     */     //   1807: bipush #6
/*     */     //   1809: bipush #112
/*     */     //   1811: iload #32
/*     */     //   1813: bipush #6
/*     */     //   1815: ishr
/*     */     //   1816: iand
/*     */     //   1817: ior
/*     */     //   1818: istore #55
/*     */     //   1820: astore #56
/*     */     //   1822: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   1825: astore #57
/*     */     //   1827: iconst_0
/*     */     //   1828: istore #58
/*     */     //   1830: ldc_w 'Join the waitlist'
/*     */     //   1833: aload_1
/*     */     //   1834: aconst_null
/*     */     //   1835: iconst_0
/*     */     //   1836: aconst_null
/*     */     //   1837: iconst_0
/*     */     //   1838: aconst_null
/*     */     //   1839: aconst_null
/*     */     //   1840: aload #56
/*     */     //   1842: bipush #6
/*     */     //   1844: bipush #112
/*     */     //   1846: iload #4
/*     */     //   1848: iand
/*     */     //   1849: ior
/*     */     //   1850: sipush #252
/*     */     //   1853: invokestatic ExternalLink-kye4rC8 : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1856: ldc_w 'to try it out.'
/*     */     //   1859: aconst_null
/*     */     //   1860: lconst_0
/*     */     //   1861: lconst_0
/*     */     //   1862: aconst_null
/*     */     //   1863: aconst_null
/*     */     //   1864: aconst_null
/*     */     //   1865: lconst_0
/*     */     //   1866: aconst_null
/*     */     //   1867: iconst_0
/*     */     //   1868: lconst_0
/*     */     //   1869: iconst_0
/*     */     //   1870: iconst_0
/*     */     //   1871: iconst_0
/*     */     //   1872: aconst_null
/*     */     //   1873: aconst_null
/*     */     //   1874: aload #56
/*     */     //   1876: bipush #6
/*     */     //   1878: iconst_0
/*     */     //   1879: ldc_w 65534
/*     */     //   1882: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1885: nop
/*     */     //   1886: aload #53
/*     */     //   1888: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1891: aload #29
/*     */     //   1893: invokeinterface endNode : ()V
/*     */     //   1898: aload #29
/*     */     //   1900: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1903: nop
/*     */     //   1904: aload #29
/*     */     //   1906: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1909: nop
/*     */     //   1910: aload #29
/*     */     //   1912: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1915: nop
/*     */     //   1916: nop
/*     */     //   1917: aload #26
/*     */     //   1919: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1922: aload_2
/*     */     //   1923: invokeinterface endNode : ()V
/*     */     //   1928: aload_2
/*     */     //   1929: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1932: nop
/*     */     //   1933: aload_2
/*     */     //   1934: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1937: nop
/*     */     //   1938: aload_2
/*     */     //   1939: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1942: nop
/*     */     //   1943: invokestatic isTraceInProgress : ()Z
/*     */     //   1946: ifeq -> 1961
/*     */     //   1949: invokestatic traceEventEnd : ()V
/*     */     //   1952: goto -> 1961
/*     */     //   1955: aload_2
/*     */     //   1956: invokeinterface skipToGroupEnd : ()V
/*     */     //   1961: aload_2
/*     */     //   1962: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1967: dup
/*     */     //   1968: ifnull -> 1987
/*     */     //   1971: aload_0
/*     */     //   1972: aload_1
/*     */     //   1973: iload_3
/*     */     //   1974: <illegal opcode> invoke : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;I)Lkotlin/jvm/functions/Function2;
/*     */     //   1979: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1984: goto -> 1988
/*     */     //   1987: pop
/*     */     //   1988: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #130	-> 0
/*     */     //   #131	-> 106
/*     */     //   #424	-> 116
/*     */     //   #131	-> 122
/*     */     //   #425	-> 144
/*     */     //   #426	-> 147
/*     */     //   #428	-> 155
/*     */     //   #431	-> 163
/*     */     //   #432	-> 197
/*     */     //   #433	-> 206
/*     */     //   #434	-> 211
/*     */     //   #435	-> 217
/*     */     //   #436	-> 225
/*     */     //   #438	-> 232
/*     */     //   #437	-> 254
/*     */     //   #439	-> 263
/*     */     //   #440	-> 266
/*     */     //   #441	-> 282
/*     */     //   #442	-> 287
/*     */     //   #443	-> 297
/*     */     //   #445	-> 308
/*     */     //   #447	-> 313
/*     */     //   #448	-> 322
/*     */     //   #449	-> 335
/*     */     //   #451	-> 348
/*     */     //   #452	-> 359
/*     */     //   #453	-> 366
/*     */     //   #454	-> 394
/*     */     //   #455	-> 406
/*     */     //   #457	-> 420
/*     */     //   #452	-> 421
/*     */     //   #457	-> 422
/*     */     //   #458	-> 423
/*     */     //   #459	-> 436
/*     */     //   #447	-> 437
/*     */     //   #460	-> 438
/*     */     //   #461	-> 462
/*     */     //   #132	-> 496
/*     */     //   #462	-> 508
/*     */     //   #463	-> 511
/*     */     //   #464	-> 519
/*     */     //   #465	-> 527
/*     */     //   #468	-> 535
/*     */     //   #469	-> 570
/*     */     //   #470	-> 580
/*     */     //   #471	-> 586
/*     */     //   #472	-> 593
/*     */     //   #473	-> 602
/*     */     //   #475	-> 609
/*     */     //   #474	-> 631
/*     */     //   #476	-> 641
/*     */     //   #477	-> 644
/*     */     //   #478	-> 662
/*     */     //   #479	-> 667
/*     */     //   #480	-> 679
/*     */     //   #482	-> 691
/*     */     //   #484	-> 696
/*     */     //   #485	-> 706
/*     */     //   #486	-> 719
/*     */     //   #488	-> 732
/*     */     //   #489	-> 743
/*     */     //   #490	-> 750
/*     */     //   #491	-> 778
/*     */     //   #492	-> 790
/*     */     //   #494	-> 804
/*     */     //   #489	-> 805
/*     */     //   #494	-> 806
/*     */     //   #495	-> 807
/*     */     //   #496	-> 820
/*     */     //   #484	-> 821
/*     */     //   #497	-> 822
/*     */     //   #498	-> 847
/*     */     //   #133	-> 878
/*     */     //   #134	-> 897
/*     */     //   #135	-> 924
/*     */     //   #136	-> 953
/*     */     //   #498	-> 954
/*     */     //   #497	-> 959
/*     */     //   #499	-> 961
/*     */     //   #476	-> 968
/*     */     //   #500	-> 971
/*     */     //   #470	-> 974
/*     */     //   #501	-> 977
/*     */     //   #462	-> 980
/*     */     //   #502	-> 983
/*     */     //   #137	-> 984
/*     */     //   #503	-> 994
/*     */     //   #137	-> 1000
/*     */     //   #504	-> 1023
/*     */     //   #505	-> 1026
/*     */     //   #507	-> 1034
/*     */     //   #510	-> 1042
/*     */     //   #511	-> 1077
/*     */     //   #512	-> 1087
/*     */     //   #513	-> 1093
/*     */     //   #514	-> 1100
/*     */     //   #515	-> 1109
/*     */     //   #517	-> 1116
/*     */     //   #516	-> 1138
/*     */     //   #518	-> 1148
/*     */     //   #519	-> 1151
/*     */     //   #520	-> 1169
/*     */     //   #521	-> 1174
/*     */     //   #522	-> 1186
/*     */     //   #524	-> 1198
/*     */     //   #526	-> 1203
/*     */     //   #527	-> 1213
/*     */     //   #528	-> 1226
/*     */     //   #530	-> 1239
/*     */     //   #531	-> 1250
/*     */     //   #532	-> 1257
/*     */     //   #533	-> 1285
/*     */     //   #534	-> 1297
/*     */     //   #536	-> 1311
/*     */     //   #531	-> 1312
/*     */     //   #536	-> 1313
/*     */     //   #537	-> 1314
/*     */     //   #538	-> 1327
/*     */     //   #526	-> 1328
/*     */     //   #539	-> 1329
/*     */     //   #540	-> 1354
/*     */     //   #138	-> 1385
/*     */     //   #139	-> 1414
/*     */     //   #540	-> 1415
/*     */     //   #539	-> 1420
/*     */     //   #541	-> 1422
/*     */     //   #518	-> 1429
/*     */     //   #542	-> 1432
/*     */     //   #512	-> 1435
/*     */     //   #543	-> 1438
/*     */     //   #504	-> 1441
/*     */     //   #544	-> 1444
/*     */     //   #140	-> 1448
/*     */     //   #545	-> 1460
/*     */     //   #546	-> 1463
/*     */     //   #547	-> 1471
/*     */     //   #548	-> 1479
/*     */     //   #551	-> 1487
/*     */     //   #552	-> 1522
/*     */     //   #553	-> 1532
/*     */     //   #554	-> 1538
/*     */     //   #555	-> 1545
/*     */     //   #556	-> 1554
/*     */     //   #558	-> 1561
/*     */     //   #557	-> 1583
/*     */     //   #559	-> 1593
/*     */     //   #560	-> 1596
/*     */     //   #561	-> 1614
/*     */     //   #562	-> 1619
/*     */     //   #563	-> 1631
/*     */     //   #565	-> 1643
/*     */     //   #567	-> 1648
/*     */     //   #568	-> 1658
/*     */     //   #569	-> 1671
/*     */     //   #571	-> 1684
/*     */     //   #572	-> 1695
/*     */     //   #573	-> 1702
/*     */     //   #574	-> 1730
/*     */     //   #575	-> 1742
/*     */     //   #577	-> 1756
/*     */     //   #572	-> 1757
/*     */     //   #577	-> 1758
/*     */     //   #578	-> 1759
/*     */     //   #579	-> 1772
/*     */     //   #567	-> 1773
/*     */     //   #580	-> 1774
/*     */     //   #581	-> 1799
/*     */     //   #141	-> 1830
/*     */     //   #142	-> 1856
/*     */     //   #143	-> 1885
/*     */     //   #581	-> 1886
/*     */     //   #580	-> 1891
/*     */     //   #582	-> 1893
/*     */     //   #559	-> 1900
/*     */     //   #583	-> 1903
/*     */     //   #553	-> 1906
/*     */     //   #584	-> 1909
/*     */     //   #545	-> 1912
/*     */     //   #585	-> 1915
/*     */     //   #144	-> 1916
/*     */     //   #461	-> 1917
/*     */     //   #460	-> 1922
/*     */     //   #586	-> 1923
/*     */     //   #439	-> 1929
/*     */     //   #587	-> 1932
/*     */     //   #433	-> 1934
/*     */     //   #588	-> 1937
/*     */     //   #425	-> 1939
/*     */     //   #589	-> 1942
/*     */     //   #146	-> 1955
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   116	6	7	$i$f$getDp	I
/*     */     //   113	9	6	$this$dp$iv	I
/*     */     //   878	76	58	$i$a$-Column-StartLoadingPageKt$NoLicensedLogin$1$1	I
/*     */     //   897	57	59	helloText	Ljava/lang/String;
/*     */     //   875	79	57	$this$NoLicensedLogin_u24lambda_u2421_u24lambda_u2418	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   875	79	56	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   875	79	55	$changed	I
/*     */     //   839	120	54	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   836	123	53	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   836	123	52	$changed$iv	I
/*     */     //   750	55	51	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   747	58	50	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   743	64	49	$i$f$set-impl	I
/*     */     //   740	67	48	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   706	115	47	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   703	118	46	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   635	337	45	$i$f$ReusableComposeNode	I
/*     */     //   632	340	43	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   632	340	44	$changed$iv$iv$iv	I
/*     */     //   574	404	39	$i$f$Layout	I
/*     */     //   591	387	40	compositeKeyHash$iv$iv	I
/*     */     //   600	378	41	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   609	369	42	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   571	407	38	$changed$iv$iv	I
/*     */     //   500	484	33	$i$f$Column	I
/*     */     //   561	423	37	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   519	465	34	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   527	457	35	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   535	449	36	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   497	487	32	$changed$iv	I
/*     */     //   994	6	36	$i$f$getDp	I
/*     */     //   991	9	35	$this$dp$iv	I
/*     */     //   1385	30	58	$i$a$-Column-StartLoadingPageKt$NoLicensedLogin$1$2	I
/*     */     //   1382	33	57	$this$NoLicensedLogin_u24lambda_u2421_u24lambda_u2419	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   1382	33	56	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1382	33	55	$changed	I
/*     */     //   1346	74	54	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   1343	77	53	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1343	77	52	$changed$iv	I
/*     */     //   1257	55	51	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1254	58	50	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1250	64	49	$i$f$set-impl	I
/*     */     //   1247	67	48	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1213	115	47	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1210	118	46	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1142	291	45	$i$f$ReusableComposeNode	I
/*     */     //   1139	294	43	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1139	294	44	$changed$iv$iv$iv	I
/*     */     //   1081	358	39	$i$f$Layout	I
/*     */     //   1098	341	40	compositeKeyHash$iv$iv	I
/*     */     //   1107	332	41	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1116	323	42	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1078	361	38	$changed$iv$iv	I
/*     */     //   1015	430	33	$i$f$Column	I
/*     */     //   1068	377	37	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1034	411	34	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1012	433	35	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   1042	403	36	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   1012	433	32	$changed$iv	I
/*     */     //   1830	56	58	$i$a$-Row-StartLoadingPageKt$NoLicensedLogin$1$3	I
/*     */     //   1827	59	57	$this$NoLicensedLogin_u24lambda_u2421_u24lambda_u2420	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   1827	59	56	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1827	59	55	$changed	I
/*     */     //   1791	100	54	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   1788	103	53	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1788	103	52	$changed$iv	I
/*     */     //   1702	55	51	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1699	58	50	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1695	64	49	$i$f$set-impl	I
/*     */     //   1692	67	48	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1658	115	47	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1655	118	46	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1587	317	45	$i$f$ReusableComposeNode	I
/*     */     //   1584	320	43	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1584	320	44	$changed$iv$iv$iv	I
/*     */     //   1526	384	39	$i$f$Layout	I
/*     */     //   1543	367	40	compositeKeyHash$iv$iv	I
/*     */     //   1552	358	41	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1561	349	42	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1523	387	38	$changed$iv$iv	I
/*     */     //   1452	464	33	$i$f$Row	I
/*     */     //   1513	403	37	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1471	445	34	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1479	437	35	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   1487	429	36	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   1449	467	32	$changed$iv	I
/*     */     //   493	1424	31	$i$a$-Column-StartLoadingPageKt$NoLicensedLogin$1	I
/*     */     //   490	1427	30	$this$NoLicensedLogin_u24lambda_u2421	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   490	1427	29	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   490	1427	28	$changed	I
/*     */     //   454	1468	27	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   451	1471	26	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   451	1471	25	$changed$iv	I
/*     */     //   366	55	24	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   363	58	23	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   359	64	22	$i$f$set-impl	I
/*     */     //   356	67	21	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   322	115	20	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   319	118	19	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   258	1675	18	$i$f$ReusableComposeNode	I
/*     */     //   255	1678	16	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   255	1678	17	$changed$iv$iv$iv	I
/*     */     //   201	1737	12	$i$f$Layout	I
/*     */     //   216	1722	13	compositeKeyHash$iv$iv	I
/*     */     //   224	1714	14	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   232	1706	15	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   198	1740	11	$changed$iv$iv	I
/*     */     //   137	1806	9	$i$f$Column	I
/*     */     //   188	1755	10	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   155	1788	5	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   134	1809	6	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   163	1780	7	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   134	1809	8	$changed$iv	I
/*     */     //   13	1976	4	$dirty	I
/*     */     //   0	1989	0	userName	Ljava/lang/String;
/*     */     //   0	1989	1	openJoinWaitListAction	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1989	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1989	3	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void UserNeedHelp(@NotNull Flow loginLinkFlow, @NotNull Function0 shareFeedbackAction, @NotNull Function0 onFeedbackSharePressed, @NotNull Function0 onBackPressed, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'loginLinkFlow'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: ldc_w 'shareFeedbackAction'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload_2
/*     */     //   15: ldc_w 'onFeedbackSharePressed'
/*     */     //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   21: aload_3
/*     */     //   22: ldc_w 'onBackPressed'
/*     */     //   25: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   28: aload #4
/*     */     //   30: ldc_w 1086672971
/*     */     //   33: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   38: astore #4
/*     */     //   40: iload #5
/*     */     //   42: istore #6
/*     */     //   44: iload #5
/*     */     //   46: bipush #6
/*     */     //   48: iand
/*     */     //   49: ifne -> 73
/*     */     //   52: iload #6
/*     */     //   54: aload #4
/*     */     //   56: aload_0
/*     */     //   57: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   62: ifeq -> 69
/*     */     //   65: iconst_4
/*     */     //   66: goto -> 70
/*     */     //   69: iconst_2
/*     */     //   70: ior
/*     */     //   71: istore #6
/*     */     //   73: iload #5
/*     */     //   75: bipush #48
/*     */     //   77: iand
/*     */     //   78: ifne -> 104
/*     */     //   81: iload #6
/*     */     //   83: aload #4
/*     */     //   85: aload_1
/*     */     //   86: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   91: ifeq -> 99
/*     */     //   94: bipush #32
/*     */     //   96: goto -> 101
/*     */     //   99: bipush #16
/*     */     //   101: ior
/*     */     //   102: istore #6
/*     */     //   104: iload #5
/*     */     //   106: sipush #384
/*     */     //   109: iand
/*     */     //   110: ifne -> 138
/*     */     //   113: iload #6
/*     */     //   115: aload #4
/*     */     //   117: aload_2
/*     */     //   118: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   123: ifeq -> 132
/*     */     //   126: sipush #256
/*     */     //   129: goto -> 135
/*     */     //   132: sipush #128
/*     */     //   135: ior
/*     */     //   136: istore #6
/*     */     //   138: iload #5
/*     */     //   140: sipush #3072
/*     */     //   143: iand
/*     */     //   144: ifne -> 172
/*     */     //   147: iload #6
/*     */     //   149: aload #4
/*     */     //   151: aload_3
/*     */     //   152: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   157: ifeq -> 166
/*     */     //   160: sipush #2048
/*     */     //   163: goto -> 169
/*     */     //   166: sipush #1024
/*     */     //   169: ior
/*     */     //   170: istore #6
/*     */     //   172: iload #6
/*     */     //   174: sipush #1171
/*     */     //   177: iand
/*     */     //   178: sipush #1170
/*     */     //   181: if_icmpne -> 194
/*     */     //   184: aload #4
/*     */     //   186: invokeinterface getSkipping : ()Z
/*     */     //   191: ifne -> 1338
/*     */     //   194: invokestatic isTraceInProgress : ()Z
/*     */     //   197: ifeq -> 212
/*     */     //   200: ldc_w 1086672971
/*     */     //   203: iload #6
/*     */     //   205: iconst_m1
/*     */     //   206: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.login.UserNeedHelp (StartLoadingPage.kt:153)'
/*     */     //   209: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   212: aload_0
/*     */     //   213: aconst_null
/*     */     //   214: aconst_null
/*     */     //   215: aload #4
/*     */     //   217: bipush #48
/*     */     //   219: bipush #14
/*     */     //   221: iload #6
/*     */     //   223: iand
/*     */     //   224: ior
/*     */     //   225: iconst_2
/*     */     //   226: invokestatic collectAsState : (Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*     */     //   229: astore #7
/*     */     //   231: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   234: bipush #16
/*     */     //   236: istore #9
/*     */     //   238: iconst_0
/*     */     //   239: istore #10
/*     */     //   241: iload #9
/*     */     //   243: i2f
/*     */     //   244: invokestatic constructor-impl : (F)F
/*     */     //   247: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   250: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
/*     */     //   253: astore #9
/*     */     //   255: bipush #48
/*     */     //   257: istore #11
/*     */     //   259: iconst_0
/*     */     //   260: istore #12
/*     */     //   262: aload #4
/*     */     //   264: ldc_w -483455358
/*     */     //   267: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*     */     //   270: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   273: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   276: checkcast androidx/compose/ui/Modifier
/*     */     //   279: astore #8
/*     */     //   281: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   284: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   287: astore #10
/*     */     //   289: aload #9
/*     */     //   291: aload #10
/*     */     //   293: aload #4
/*     */     //   295: bipush #14
/*     */     //   297: iload #11
/*     */     //   299: iconst_3
/*     */     //   300: ishr
/*     */     //   301: iand
/*     */     //   302: bipush #112
/*     */     //   304: iload #11
/*     */     //   306: iconst_3
/*     */     //   307: ishr
/*     */     //   308: iand
/*     */     //   309: ior
/*     */     //   310: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   313: astore #13
/*     */     //   315: bipush #112
/*     */     //   317: iload #11
/*     */     //   319: iconst_3
/*     */     //   320: ishl
/*     */     //   321: iand
/*     */     //   322: istore #14
/*     */     //   324: nop
/*     */     //   325: iconst_0
/*     */     //   326: istore #15
/*     */     //   328: aload #4
/*     */     //   330: ldc -1323940314
/*     */     //   332: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   334: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   337: aload #4
/*     */     //   339: iconst_0
/*     */     //   340: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   343: istore #16
/*     */     //   345: aload #4
/*     */     //   347: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   352: astore #17
/*     */     //   354: aload #4
/*     */     //   356: aload #8
/*     */     //   358: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   361: astore #18
/*     */     //   363: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   366: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   369: astore #19
/*     */     //   371: bipush #6
/*     */     //   373: sipush #896
/*     */     //   376: iload #14
/*     */     //   378: bipush #6
/*     */     //   380: ishl
/*     */     //   381: iand
/*     */     //   382: ior
/*     */     //   383: istore #20
/*     */     //   385: nop
/*     */     //   386: iconst_0
/*     */     //   387: istore #21
/*     */     //   389: aload #4
/*     */     //   391: ldc -692256719
/*     */     //   393: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   395: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   398: aload #4
/*     */     //   400: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   405: instanceof androidx/compose/runtime/Applier
/*     */     //   408: ifne -> 414
/*     */     //   411: invokestatic invalidApplier : ()V
/*     */     //   414: aload #4
/*     */     //   416: invokeinterface startReusableNode : ()V
/*     */     //   421: aload #4
/*     */     //   423: invokeinterface getInserting : ()Z
/*     */     //   428: ifeq -> 443
/*     */     //   431: aload #4
/*     */     //   433: aload #19
/*     */     //   435: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   440: goto -> 450
/*     */     //   443: aload #4
/*     */     //   445: invokeinterface useNode : ()V
/*     */     //   450: aload #4
/*     */     //   452: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   455: astore #22
/*     */     //   457: iconst_0
/*     */     //   458: istore #23
/*     */     //   460: aload #22
/*     */     //   462: aload #13
/*     */     //   464: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   467: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   470: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   473: aload #22
/*     */     //   475: aload #17
/*     */     //   477: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   480: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   483: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   486: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   489: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   492: astore #24
/*     */     //   494: iconst_0
/*     */     //   495: istore #25
/*     */     //   497: aload #22
/*     */     //   499: astore #26
/*     */     //   501: iconst_0
/*     */     //   502: istore #27
/*     */     //   504: aload #26
/*     */     //   506: invokeinterface getInserting : ()Z
/*     */     //   511: ifne -> 532
/*     */     //   514: aload #26
/*     */     //   516: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   521: iload #16
/*     */     //   523: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   526: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   529: ifne -> 558
/*     */     //   532: aload #26
/*     */     //   534: iload #16
/*     */     //   536: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   539: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   544: aload #22
/*     */     //   546: iload #16
/*     */     //   548: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   551: aload #24
/*     */     //   553: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   558: nop
/*     */     //   559: nop
/*     */     //   560: nop
/*     */     //   561: aload #22
/*     */     //   563: aload #18
/*     */     //   565: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   568: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   571: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   574: nop
/*     */     //   575: nop
/*     */     //   576: aload #4
/*     */     //   578: bipush #14
/*     */     //   580: iload #20
/*     */     //   582: bipush #6
/*     */     //   584: ishr
/*     */     //   585: iand
/*     */     //   586: istore #28
/*     */     //   588: astore #29
/*     */     //   590: iconst_0
/*     */     //   591: istore #30
/*     */     //   593: aload #29
/*     */     //   595: ldc_w -384784025
/*     */     //   598: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*     */     //   601: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   604: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*     */     //   607: aload #29
/*     */     //   609: bipush #6
/*     */     //   611: bipush #112
/*     */     //   613: iload #11
/*     */     //   615: bipush #6
/*     */     //   617: ishr
/*     */     //   618: iand
/*     */     //   619: ior
/*     */     //   620: istore #31
/*     */     //   622: astore #32
/*     */     //   624: checkcast androidx/compose/foundation/layout/ColumnScope
/*     */     //   627: astore #33
/*     */     //   629: iconst_0
/*     */     //   630: istore #34
/*     */     //   632: ldc_w '← Back'
/*     */     //   635: aload_3
/*     */     //   636: aconst_null
/*     */     //   637: iconst_0
/*     */     //   638: aconst_null
/*     */     //   639: iconst_0
/*     */     //   640: aconst_null
/*     */     //   641: aconst_null
/*     */     //   642: aload #32
/*     */     //   644: bipush #6
/*     */     //   646: bipush #112
/*     */     //   648: iload #6
/*     */     //   650: bipush #6
/*     */     //   652: ishr
/*     */     //   653: iand
/*     */     //   654: ior
/*     */     //   655: sipush #252
/*     */     //   658: invokestatic Link-kye4rC8 : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V
/*     */     //   661: aload #32
/*     */     //   663: ldc_w -917907684
/*     */     //   666: invokeinterface startReplaceGroup : (I)V
/*     */     //   671: aload #7
/*     */     //   673: invokestatic UserNeedHelp$lambda$23 : (Landroidx/compose/runtime/State;)Lio/ktor/http/Url;
/*     */     //   676: ifnull -> 722
/*     */     //   679: ldc_w 'Copy this link in your browser to continue the login process.'
/*     */     //   682: aconst_null
/*     */     //   683: lconst_0
/*     */     //   684: lconst_0
/*     */     //   685: aconst_null
/*     */     //   686: aconst_null
/*     */     //   687: aconst_null
/*     */     //   688: lconst_0
/*     */     //   689: aconst_null
/*     */     //   690: iconst_0
/*     */     //   691: lconst_0
/*     */     //   692: iconst_0
/*     */     //   693: iconst_0
/*     */     //   694: iconst_0
/*     */     //   695: aconst_null
/*     */     //   696: aconst_null
/*     */     //   697: aload #32
/*     */     //   699: bipush #6
/*     */     //   701: iconst_0
/*     */     //   702: ldc_w 65534
/*     */     //   705: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */     //   708: aload #7
/*     */     //   710: invokestatic UserNeedHelp$lambda$23 : (Landroidx/compose/runtime/State;)Lio/ktor/http/Url;
/*     */     //   713: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   716: aload #32
/*     */     //   718: iconst_0
/*     */     //   719: invokestatic DisplayCopyableLink : (Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
/*     */     //   722: aload #32
/*     */     //   724: invokeinterface endReplaceGroup : ()V
/*     */     //   729: iconst_0
/*     */     //   730: istore #35
/*     */     //   732: nop
/*     */     //   733: iconst_0
/*     */     //   734: istore #36
/*     */     //   736: aload #32
/*     */     //   738: ldc_w 693286680
/*     */     //   741: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   744: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   747: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   750: checkcast androidx/compose/ui/Modifier
/*     */     //   753: astore #37
/*     */     //   755: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   758: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   761: astore #38
/*     */     //   763: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   766: invokevirtual getTop : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   769: astore #39
/*     */     //   771: aload #38
/*     */     //   773: aload #39
/*     */     //   775: aload #32
/*     */     //   777: bipush #14
/*     */     //   779: iload #35
/*     */     //   781: iconst_3
/*     */     //   782: ishr
/*     */     //   783: iand
/*     */     //   784: bipush #112
/*     */     //   786: iload #35
/*     */     //   788: iconst_3
/*     */     //   789: ishr
/*     */     //   790: iand
/*     */     //   791: ior
/*     */     //   792: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   795: astore #40
/*     */     //   797: bipush #112
/*     */     //   799: iload #35
/*     */     //   801: iconst_3
/*     */     //   802: ishl
/*     */     //   803: iand
/*     */     //   804: istore #41
/*     */     //   806: nop
/*     */     //   807: iconst_0
/*     */     //   808: istore #42
/*     */     //   810: aload #32
/*     */     //   812: ldc -1323940314
/*     */     //   814: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   816: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   819: aload #32
/*     */     //   821: iconst_0
/*     */     //   822: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   825: istore #43
/*     */     //   827: aload #32
/*     */     //   829: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   834: astore #44
/*     */     //   836: aload #32
/*     */     //   838: aload #37
/*     */     //   840: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   843: astore #45
/*     */     //   845: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   848: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   851: astore #46
/*     */     //   853: bipush #6
/*     */     //   855: sipush #896
/*     */     //   858: iload #41
/*     */     //   860: bipush #6
/*     */     //   862: ishl
/*     */     //   863: iand
/*     */     //   864: ior
/*     */     //   865: istore #47
/*     */     //   867: nop
/*     */     //   868: iconst_0
/*     */     //   869: istore #48
/*     */     //   871: aload #32
/*     */     //   873: ldc -692256719
/*     */     //   875: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   877: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   880: aload #32
/*     */     //   882: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   887: instanceof androidx/compose/runtime/Applier
/*     */     //   890: ifne -> 896
/*     */     //   893: invokestatic invalidApplier : ()V
/*     */     //   896: aload #32
/*     */     //   898: invokeinterface startReusableNode : ()V
/*     */     //   903: aload #32
/*     */     //   905: invokeinterface getInserting : ()Z
/*     */     //   910: ifeq -> 925
/*     */     //   913: aload #32
/*     */     //   915: aload #46
/*     */     //   917: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   922: goto -> 932
/*     */     //   925: aload #32
/*     */     //   927: invokeinterface useNode : ()V
/*     */     //   932: aload #32
/*     */     //   934: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   937: astore #49
/*     */     //   939: iconst_0
/*     */     //   940: istore #50
/*     */     //   942: aload #49
/*     */     //   944: aload #40
/*     */     //   946: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   949: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   952: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   955: aload #49
/*     */     //   957: aload #44
/*     */     //   959: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   962: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   965: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   968: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   971: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   974: astore #51
/*     */     //   976: iconst_0
/*     */     //   977: istore #52
/*     */     //   979: aload #49
/*     */     //   981: astore #53
/*     */     //   983: iconst_0
/*     */     //   984: istore #54
/*     */     //   986: aload #53
/*     */     //   988: invokeinterface getInserting : ()Z
/*     */     //   993: ifne -> 1014
/*     */     //   996: aload #53
/*     */     //   998: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1003: iload #43
/*     */     //   1005: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1008: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1011: ifne -> 1040
/*     */     //   1014: aload #53
/*     */     //   1016: iload #43
/*     */     //   1018: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1021: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1026: aload #49
/*     */     //   1028: iload #43
/*     */     //   1030: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1033: aload #51
/*     */     //   1035: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1040: nop
/*     */     //   1041: nop
/*     */     //   1042: nop
/*     */     //   1043: aload #49
/*     */     //   1045: aload #45
/*     */     //   1047: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1050: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1053: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1056: nop
/*     */     //   1057: nop
/*     */     //   1058: aload #32
/*     */     //   1060: bipush #14
/*     */     //   1062: iload #47
/*     */     //   1064: bipush #6
/*     */     //   1066: ishr
/*     */     //   1067: iand
/*     */     //   1068: istore #55
/*     */     //   1070: astore #56
/*     */     //   1072: iconst_0
/*     */     //   1073: istore #57
/*     */     //   1075: aload #56
/*     */     //   1077: ldc_w -407840262
/*     */     //   1080: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   1083: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1086: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   1089: aload #56
/*     */     //   1091: bipush #6
/*     */     //   1093: bipush #112
/*     */     //   1095: iload #35
/*     */     //   1097: bipush #6
/*     */     //   1099: ishr
/*     */     //   1100: iand
/*     */     //   1101: ior
/*     */     //   1102: istore #58
/*     */     //   1104: astore #59
/*     */     //   1106: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   1109: astore #60
/*     */     //   1111: iconst_0
/*     */     //   1112: istore #61
/*     */     //   1114: ldc_w 'Share feedback'
/*     */     //   1117: aload #59
/*     */     //   1119: ldc_w 2005079752
/*     */     //   1122: invokeinterface startReplaceGroup : (I)V
/*     */     //   1127: aload #59
/*     */     //   1129: astore #62
/*     */     //   1131: iload #6
/*     */     //   1133: bipush #112
/*     */     //   1135: iand
/*     */     //   1136: bipush #32
/*     */     //   1138: if_icmpne -> 1145
/*     */     //   1141: iconst_1
/*     */     //   1142: goto -> 1146
/*     */     //   1145: iconst_0
/*     */     //   1146: iload #6
/*     */     //   1148: sipush #896
/*     */     //   1151: iand
/*     */     //   1152: sipush #256
/*     */     //   1155: if_icmpne -> 1162
/*     */     //   1158: iconst_1
/*     */     //   1159: goto -> 1163
/*     */     //   1162: iconst_0
/*     */     //   1163: ior
/*     */     //   1164: istore #63
/*     */     //   1166: nop
/*     */     //   1167: iconst_0
/*     */     //   1168: istore #64
/*     */     //   1170: aload #62
/*     */     //   1172: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1177: astore #65
/*     */     //   1179: iconst_0
/*     */     //   1180: istore #66
/*     */     //   1182: iload #63
/*     */     //   1184: ifne -> 1198
/*     */     //   1187: aload #65
/*     */     //   1189: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1192: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1195: if_acmpne -> 1229
/*     */     //   1198: astore #67
/*     */     //   1200: iconst_0
/*     */     //   1201: istore #68
/*     */     //   1203: aload_1
/*     */     //   1204: aload_2
/*     */     //   1205: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;
/*     */     //   1210: aload #67
/*     */     //   1212: swap
/*     */     //   1213: astore #69
/*     */     //   1215: aload #62
/*     */     //   1217: aload #69
/*     */     //   1219: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1224: aload #69
/*     */     //   1226: goto -> 1231
/*     */     //   1229: aload #65
/*     */     //   1231: nop
/*     */     //   1232: nop
/*     */     //   1233: nop
/*     */     //   1234: checkcast kotlin/jvm/functions/Function0
/*     */     //   1237: astore #70
/*     */     //   1239: aload #59
/*     */     //   1241: invokeinterface endReplaceGroup : ()V
/*     */     //   1246: aload #70
/*     */     //   1248: aconst_null
/*     */     //   1249: iconst_0
/*     */     //   1250: aconst_null
/*     */     //   1251: iconst_0
/*     */     //   1252: aconst_null
/*     */     //   1253: aconst_null
/*     */     //   1254: aload #59
/*     */     //   1256: bipush #6
/*     */     //   1258: sipush #252
/*     */     //   1261: invokestatic ExternalLink-kye4rC8 : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1264: nop
/*     */     //   1265: aload #56
/*     */     //   1267: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1270: aload #32
/*     */     //   1272: invokeinterface endNode : ()V
/*     */     //   1277: aload #32
/*     */     //   1279: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1282: nop
/*     */     //   1283: aload #32
/*     */     //   1285: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1288: nop
/*     */     //   1289: aload #32
/*     */     //   1291: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1294: nop
/*     */     //   1295: nop
/*     */     //   1296: aload #29
/*     */     //   1298: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1301: aload #4
/*     */     //   1303: invokeinterface endNode : ()V
/*     */     //   1308: aload #4
/*     */     //   1310: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1313: nop
/*     */     //   1314: aload #4
/*     */     //   1316: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1319: nop
/*     */     //   1320: aload #4
/*     */     //   1322: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1325: nop
/*     */     //   1326: invokestatic isTraceInProgress : ()Z
/*     */     //   1329: ifeq -> 1345
/*     */     //   1332: invokestatic traceEventEnd : ()V
/*     */     //   1335: goto -> 1345
/*     */     //   1338: aload #4
/*     */     //   1340: invokeinterface skipToGroupEnd : ()V
/*     */     //   1345: aload #4
/*     */     //   1347: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1352: dup
/*     */     //   1353: ifnull -> 1375
/*     */     //   1356: aload_0
/*     */     //   1357: aload_1
/*     */     //   1358: aload_2
/*     */     //   1359: aload_3
/*     */     //   1360: iload #5
/*     */     //   1362: <illegal opcode> invoke : (Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)Lkotlin/jvm/functions/Function2;
/*     */     //   1367: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1372: goto -> 1376
/*     */     //   1375: pop
/*     */     //   1376: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #154	-> 28
/*     */     //   #155	-> 212
/*     */     //   #156	-> 231
/*     */     //   #590	-> 241
/*     */     //   #156	-> 247
/*     */     //   #591	-> 270
/*     */     //   #592	-> 273
/*     */     //   #594	-> 281
/*     */     //   #597	-> 289
/*     */     //   #598	-> 324
/*     */     //   #599	-> 334
/*     */     //   #600	-> 340
/*     */     //   #601	-> 347
/*     */     //   #602	-> 356
/*     */     //   #604	-> 363
/*     */     //   #603	-> 385
/*     */     //   #605	-> 395
/*     */     //   #606	-> 398
/*     */     //   #607	-> 416
/*     */     //   #608	-> 421
/*     */     //   #609	-> 433
/*     */     //   #611	-> 445
/*     */     //   #613	-> 450
/*     */     //   #614	-> 460
/*     */     //   #615	-> 473
/*     */     //   #617	-> 486
/*     */     //   #618	-> 497
/*     */     //   #619	-> 504
/*     */     //   #620	-> 532
/*     */     //   #621	-> 544
/*     */     //   #623	-> 558
/*     */     //   #618	-> 559
/*     */     //   #623	-> 560
/*     */     //   #624	-> 561
/*     */     //   #625	-> 574
/*     */     //   #613	-> 575
/*     */     //   #626	-> 576
/*     */     //   #627	-> 601
/*     */     //   #157	-> 632
/*     */     //   #159	-> 671
/*     */     //   #160	-> 679
/*     */     //   #161	-> 708
/*     */     //   #164	-> 732
/*     */     //   #628	-> 744
/*     */     //   #629	-> 747
/*     */     //   #630	-> 755
/*     */     //   #631	-> 763
/*     */     //   #634	-> 771
/*     */     //   #635	-> 806
/*     */     //   #636	-> 816
/*     */     //   #637	-> 822
/*     */     //   #638	-> 829
/*     */     //   #639	-> 838
/*     */     //   #641	-> 845
/*     */     //   #640	-> 867
/*     */     //   #642	-> 877
/*     */     //   #643	-> 880
/*     */     //   #644	-> 898
/*     */     //   #645	-> 903
/*     */     //   #646	-> 915
/*     */     //   #648	-> 927
/*     */     //   #650	-> 932
/*     */     //   #651	-> 942
/*     */     //   #652	-> 955
/*     */     //   #654	-> 968
/*     */     //   #655	-> 979
/*     */     //   #656	-> 986
/*     */     //   #657	-> 1014
/*     */     //   #658	-> 1026
/*     */     //   #660	-> 1040
/*     */     //   #655	-> 1041
/*     */     //   #660	-> 1042
/*     */     //   #661	-> 1043
/*     */     //   #662	-> 1056
/*     */     //   #650	-> 1057
/*     */     //   #663	-> 1058
/*     */     //   #664	-> 1083
/*     */     //   #166	-> 1114
/*     */     //   #167	-> 1166
/*     */     //   #665	-> 1170
/*     */     //   #666	-> 1182
/*     */     //   #667	-> 1198
/*     */     //   #167	-> 1203
/*     */     //   #667	-> 1213
/*     */     //   #668	-> 1215
/*     */     //   #669	-> 1224
/*     */     //   #670	-> 1229
/*     */     //   #666	-> 1231
/*     */     //   #665	-> 1232
/*     */     //   #665	-> 1233
/*     */     //   #167	-> 1234
/*     */     //   #165	-> 1261
/*     */     //   #172	-> 1264
/*     */     //   #664	-> 1265
/*     */     //   #663	-> 1270
/*     */     //   #671	-> 1272
/*     */     //   #642	-> 1279
/*     */     //   #672	-> 1282
/*     */     //   #636	-> 1285
/*     */     //   #673	-> 1288
/*     */     //   #628	-> 1291
/*     */     //   #674	-> 1294
/*     */     //   #174	-> 1295
/*     */     //   #627	-> 1296
/*     */     //   #626	-> 1301
/*     */     //   #675	-> 1303
/*     */     //   #605	-> 1310
/*     */     //   #676	-> 1313
/*     */     //   #599	-> 1316
/*     */     //   #677	-> 1319
/*     */     //   #591	-> 1322
/*     */     //   #678	-> 1325
/*     */     //   #176	-> 1338
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   241	6	10	$i$f$getDp	I
/*     */     //   238	9	9	$this$dp$iv	I
/*     */     //   1203	7	68	$i$a$-cache-StartLoadingPageKt$UserNeedHelp$1$1$1	I
/*     */     //   1215	11	69	value$iv	Ljava/lang/Object;
/*     */     //   1182	50	66	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1179	53	65	it$iv	Ljava/lang/Object;
/*     */     //   1170	64	64	$i$f$cache	I
/*     */     //   1167	67	62	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1167	67	63	invalid$iv	Z
/*     */     //   1114	151	61	$i$a$-Row-StartLoadingPageKt$UserNeedHelp$1$1	I
/*     */     //   1111	154	60	$this$UserNeedHelp_u24lambda_u2427_u24lambda_u2426	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   1111	154	59	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1111	154	58	$changed	I
/*     */     //   1075	195	57	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   1072	198	56	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1072	198	55	$changed$iv	I
/*     */     //   986	55	54	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   983	58	53	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   979	64	52	$i$f$set-impl	I
/*     */     //   976	67	51	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   942	115	50	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   939	118	49	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   871	412	48	$i$f$ReusableComposeNode	I
/*     */     //   868	415	46	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   868	415	47	$changed$iv$iv$iv	I
/*     */     //   810	479	42	$i$f$Layout	I
/*     */     //   827	462	43	compositeKeyHash$iv$iv	I
/*     */     //   836	453	44	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   845	444	45	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   807	482	41	$changed$iv$iv	I
/*     */     //   736	559	36	$i$f$Row	I
/*     */     //   797	498	40	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   755	540	37	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   763	532	38	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   771	524	39	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   733	562	35	$changed$iv	I
/*     */     //   632	664	34	$i$a$-Column-StartLoadingPageKt$UserNeedHelp$1	I
/*     */     //   629	667	33	$this$UserNeedHelp_u24lambda_u2427	Landroidx/compose/foundation/layout/ColumnScope;
/*     */     //   629	667	32	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   629	667	31	$changed	I
/*     */     //   593	708	30	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*     */     //   590	711	29	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   590	711	28	$changed$iv	I
/*     */     //   504	55	27	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   501	58	26	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   497	64	25	$i$f$set-impl	I
/*     */     //   494	67	24	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   460	115	23	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   457	118	22	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   389	925	21	$i$f$ReusableComposeNode	I
/*     */     //   386	928	19	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   386	928	20	$changed$iv$iv$iv	I
/*     */     //   328	992	15	$i$f$Layout	I
/*     */     //   345	975	16	compositeKeyHash$iv$iv	I
/*     */     //   354	966	17	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   363	957	18	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   325	995	14	$changed$iv$iv	I
/*     */     //   262	1064	12	$i$f$Column	I
/*     */     //   315	1011	13	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   281	1045	8	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   259	1067	9	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   289	1037	10	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   259	1067	11	$changed$iv	I
/*     */     //   231	1104	7	loginLink$delegate	Landroidx/compose/runtime/State;
/*     */     //   44	1333	6	$dirty	I
/*     */     //   0	1377	0	loginLinkFlow	Lkotlinx/coroutines/flow/Flow;
/*     */     //   0	1377	1	shareFeedbackAction	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1377	2	onFeedbackSharePressed	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1377	3	onBackPressed	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1377	4	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1377	5	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit UserNeedHelp$lambda$27$lambda$26$lambda$25$lambda$24(Function0 $shareFeedbackAction, Function0 $onFeedbackSharePressed) {
/*     */     $shareFeedbackAction.invoke();
/*     */     $onFeedbackSharePressed.invoke();
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit StartLoadingPage$lambda$8(StartLoadingViewModel $model, Function0<Unit> $onLoginSuccess, int $$changed, Composer $composer, int $force) {
/*     */     StartLoadingPage($model, $onLoginSuccess, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit StartLoadingComponent$lambda$13(LoginScreenState $state, Function0<Unit> $openLoginAction, Function0<Unit> $openJoinWaitListAction, Function0<Unit> $onNeedHelpClick, Function0<Unit> $onBackToLogin, int $$changed, Composer $composer, int $force) {
/*     */     StartLoadingComponent($state, $openLoginAction, $openJoinWaitListAction, $onNeedHelpClick, $onBackToLogin, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit LoginIdle$lambda$15(Function0<Unit> $openLoginAction, Function0<Unit> $onNeedHelpClick, ErrorInfo $error, int $$changed, Composer $composer, int $force) {
/*     */     LoginIdle($openLoginAction, $onNeedHelpClick, $error, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit LoadingLogin$lambda$17(boolean $showHelpLink, Function0<Unit> $onNeedHelpClick, int $$changed, Composer $composer, int $force) {
/*     */     LoadingLogin($showHelpLink, $onNeedHelpClick, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit NoLicensedLogin$lambda$22(String $userName, Function0<Unit> $openJoinWaitListAction, int $$changed, Composer $composer, int $force) {
/*     */     NoLicensedLogin($userName, $openJoinWaitListAction, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit UserNeedHelp$lambda$28(Flow<Url> $loginLinkFlow, Function0<Unit> $shareFeedbackAction, Function0<Unit> $onFeedbackSharePressed, Function0<Unit> $onBackPressed, int $$changed, Composer $composer, int $force) {
/*     */     UserNeedHelp($loginLinkFlow, $shareFeedbackAction, $onFeedbackSharePressed, $onBackPressed, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\StartLoadingPageKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */