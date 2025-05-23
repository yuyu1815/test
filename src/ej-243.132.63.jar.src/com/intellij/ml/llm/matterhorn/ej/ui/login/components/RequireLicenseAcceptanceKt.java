/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.login.components;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.login.states.LicenseAgreement;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.login.states.LicenseAgreementKind;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\030\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\032\025\020\000\032\0020\0012\006\020\002\032\0020\003H\001¢\006\002\020\004\032)\020\005\032\0020\0012\f\020\006\032\b\022\004\022\0020\0010\0072\f\020\b\032\b\022\004\022\0020\0010\007H\003¢\006\002\020\t\032)\020\n\032\0020\0012\f\020\006\032\b\022\004\022\0020\0010\0072\f\020\013\032\b\022\004\022\0020\0010\007H\003¢\006\002\020\t¨\006\f"}, d2 = {"RequireLicenseAcceptance", "", "state", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement;", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement;Landroidx/compose/runtime/Composer;I)V", "AcceptLicenseLocal", "onAccept", "Lkotlin/Function0;", "onOpenLicenseUrl", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AcceptLicenseInBrowser", "onRetry", "ej-ui"})
/*    */ @SourceDebugExtension({"SMAP\nRequireLicenseAcceptance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequireLicenseAcceptance.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/components/RequireLicenseAcceptanceKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,93:1\n1225#2,6:94\n1225#2,6:100\n1225#2,6:106\n1225#2,6:112\n149#3:118\n149#3:154\n149#3:241\n86#4:119\n84#4,5:120\n89#4:153\n86#4:192\n82#4,7:193\n89#4:228\n93#4:232\n93#4:240\n86#4:242\n84#4,5:243\n89#4:276\n93#4:280\n79#5,6:125\n86#5,4:140\n90#5,2:150\n79#5,6:163\n86#5,4:178\n90#5,2:188\n79#5,6:200\n86#5,4:215\n90#5,2:225\n94#5:231\n94#5:235\n94#5:239\n79#5,6:248\n86#5,4:263\n90#5,2:273\n94#5:279\n368#6,9:131\n377#6:152\n368#6,9:169\n377#6:190\n368#6,9:206\n377#6:227\n378#6,2:229\n378#6,2:233\n378#6,2:237\n368#6,9:254\n377#6:275\n378#6,2:277\n4034#7,6:144\n4034#7,6:182\n4034#7,6:219\n4034#7,6:267\n99#8:155\n95#8,7:156\n102#8:191\n106#8:236\n*S KotlinDebug\n*F\n+ 1 RequireLicenseAcceptance.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/components/RequireLicenseAcceptanceKt\n*L\n31#1:94,6\n32#1:100,6\n38#1:106,6\n43#1:112,6\n62#1:118\n67#1:154\n87#1:241\n60#1:119\n60#1:120,5\n60#1:153\n71#1:192\n71#1:193,7\n71#1:228\n71#1:232\n60#1:240\n85#1:242\n85#1:243,5\n85#1:276\n85#1:280\n60#1:125,6\n60#1:140,4\n60#1:150,2\n66#1:163,6\n66#1:178,4\n66#1:188,2\n71#1:200,6\n71#1:215,4\n71#1:225,2\n71#1:231\n66#1:235\n60#1:239\n85#1:248,6\n85#1:263,4\n85#1:273,2\n85#1:279\n60#1:131,9\n60#1:152\n66#1:169,9\n66#1:190\n71#1:206,9\n71#1:227\n71#1:229,2\n66#1:233,2\n60#1:237,2\n85#1:254,9\n85#1:275\n85#1:277,2\n60#1:144,6\n66#1:182,6\n71#1:219,6\n85#1:267,6\n66#1:155\n66#1:156,7\n66#1:191\n66#1:236\n*E\n"})
/*    */ public final class RequireLicenseAcceptanceKt
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public static final void RequireLicenseAcceptance(@NotNull LicenseAgreement state, @Nullable Composer $composer, int $changed) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'state'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: ldc -2099123099
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
/*    */     //   55: ifne -> 931
/*    */     //   58: invokestatic isTraceInProgress : ()Z
/*    */     //   61: ifeq -> 73
/*    */     //   64: ldc -2099123099
/*    */     //   66: iload_3
/*    */     //   67: iconst_m1
/*    */     //   68: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.login.components.RequireLicenseAcceptance (RequireLicenseAcceptance.kt:23)'
/*    */     //   70: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   73: aload_0
/*    */     //   74: invokevirtual getUrlLoadState : ()Lkotlinx/coroutines/flow/StateFlow;
/*    */     //   77: aconst_null
/*    */     //   78: aload_1
/*    */     //   79: iconst_0
/*    */     //   80: iconst_1
/*    */     //   81: invokestatic collectAsState : (Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*    */     //   84: invokeinterface getValue : ()Ljava/lang/Object;
/*    */     //   89: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase
/*    */     //   92: astore #4
/*    */     //   94: aload_0
/*    */     //   95: invokevirtual getKind : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreementKind;
/*    */     //   98: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/components/RequireLicenseAcceptanceKt$WhenMappings.$EnumSwitchMapping$0 : [I
/*    */     //   101: swap
/*    */     //   102: invokevirtual ordinal : ()I
/*    */     //   105: iaload
/*    */     //   106: tableswitch default -> 897, 1 -> 132, 2 -> 132, 3 -> 365
/*    */     //   132: aload_1
/*    */     //   133: ldc -603679716
/*    */     //   135: invokeinterface startReplaceGroup : (I)V
/*    */     //   140: aload_1
/*    */     //   141: ldc 1366001763
/*    */     //   143: invokeinterface startReplaceGroup : (I)V
/*    */     //   148: aload_1
/*    */     //   149: astore #6
/*    */     //   151: aload_1
/*    */     //   152: aload_0
/*    */     //   153: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   158: istore #7
/*    */     //   160: nop
/*    */     //   161: iconst_0
/*    */     //   162: istore #8
/*    */     //   164: aload #6
/*    */     //   166: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   171: astore #9
/*    */     //   173: iconst_0
/*    */     //   174: istore #10
/*    */     //   176: iload #7
/*    */     //   178: ifne -> 192
/*    */     //   181: aload #9
/*    */     //   183: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   186: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   189: if_acmpne -> 222
/*    */     //   192: iconst_0
/*    */     //   193: istore #11
/*    */     //   195: new com/intellij/ml/llm/matterhorn/ej/ui/login/components/RequireLicenseAcceptanceKt$RequireLicenseAcceptance$1$1
/*    */     //   198: dup
/*    */     //   199: aload_0
/*    */     //   200: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   203: checkcast kotlin/reflect/KFunction
/*    */     //   206: astore #12
/*    */     //   208: aload #6
/*    */     //   210: aload #12
/*    */     //   212: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   217: aload #12
/*    */     //   219: goto -> 224
/*    */     //   222: aload #9
/*    */     //   224: nop
/*    */     //   225: nop
/*    */     //   226: nop
/*    */     //   227: checkcast kotlin/reflect/KFunction
/*    */     //   230: astore #5
/*    */     //   232: aload_1
/*    */     //   233: invokeinterface endReplaceGroup : ()V
/*    */     //   238: aload #5
/*    */     //   240: checkcast kotlin/jvm/functions/Function0
/*    */     //   243: aload_1
/*    */     //   244: ldc 1366003270
/*    */     //   246: invokeinterface startReplaceGroup : (I)V
/*    */     //   251: aload_1
/*    */     //   252: astore #6
/*    */     //   254: aload_1
/*    */     //   255: aload_0
/*    */     //   256: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   261: istore #7
/*    */     //   263: nop
/*    */     //   264: iconst_0
/*    */     //   265: istore #8
/*    */     //   267: aload #6
/*    */     //   269: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   274: astore #9
/*    */     //   276: iconst_0
/*    */     //   277: istore #10
/*    */     //   279: iload #7
/*    */     //   281: ifne -> 295
/*    */     //   284: aload #9
/*    */     //   286: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   289: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   292: if_acmpne -> 330
/*    */     //   295: astore #14
/*    */     //   297: iconst_0
/*    */     //   298: istore #11
/*    */     //   300: new com/intellij/ml/llm/matterhorn/ej/ui/login/components/RequireLicenseAcceptanceKt$RequireLicenseAcceptance$2$1
/*    */     //   303: dup
/*    */     //   304: aload_0
/*    */     //   305: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   308: checkcast kotlin/reflect/KFunction
/*    */     //   311: aload #14
/*    */     //   313: swap
/*    */     //   314: astore #12
/*    */     //   316: aload #6
/*    */     //   318: aload #12
/*    */     //   320: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   325: aload #12
/*    */     //   327: goto -> 332
/*    */     //   330: aload #9
/*    */     //   332: nop
/*    */     //   333: nop
/*    */     //   334: nop
/*    */     //   335: checkcast kotlin/reflect/KFunction
/*    */     //   338: astore #5
/*    */     //   340: aload_1
/*    */     //   341: invokeinterface endReplaceGroup : ()V
/*    */     //   346: aload #5
/*    */     //   348: checkcast kotlin/jvm/functions/Function0
/*    */     //   351: aload_1
/*    */     //   352: iconst_0
/*    */     //   353: invokestatic AcceptLicenseLocal : (Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*    */     //   356: aload_1
/*    */     //   357: invokeinterface endReplaceGroup : ()V
/*    */     //   362: goto -> 919
/*    */     //   365: aload_1
/*    */     //   366: ldc -603473256
/*    */     //   368: invokeinterface startReplaceGroup : (I)V
/*    */     //   373: aload #4
/*    */     //   375: astore #5
/*    */     //   377: aload #5
/*    */     //   379: instanceof com/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase$Completed
/*    */     //   382: ifeq -> 620
/*    */     //   385: aload_1
/*    */     //   386: ldc -603414077
/*    */     //   388: invokeinterface startReplaceGroup : (I)V
/*    */     //   393: aload_1
/*    */     //   394: ldc 1366009332
/*    */     //   396: invokeinterface startReplaceGroup : (I)V
/*    */     //   401: aload_1
/*    */     //   402: astore #7
/*    */     //   404: aload_1
/*    */     //   405: aload_0
/*    */     //   406: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   411: aload_1
/*    */     //   412: aload #4
/*    */     //   414: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   419: ior
/*    */     //   420: istore #8
/*    */     //   422: nop
/*    */     //   423: iconst_0
/*    */     //   424: istore #9
/*    */     //   426: aload #7
/*    */     //   428: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   433: astore #10
/*    */     //   435: iconst_0
/*    */     //   436: istore #11
/*    */     //   438: iload #8
/*    */     //   440: ifne -> 454
/*    */     //   443: aload #10
/*    */     //   445: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   448: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   451: if_acmpne -> 481
/*    */     //   454: iconst_0
/*    */     //   455: istore #12
/*    */     //   457: aload_0
/*    */     //   458: aload #4
/*    */     //   460: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement;Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase;)Lkotlin/jvm/functions/Function0;
/*    */     //   465: astore #13
/*    */     //   467: aload #7
/*    */     //   469: aload #13
/*    */     //   471: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   476: aload #13
/*    */     //   478: goto -> 483
/*    */     //   481: aload #10
/*    */     //   483: nop
/*    */     //   484: nop
/*    */     //   485: nop
/*    */     //   486: checkcast kotlin/jvm/functions/Function0
/*    */     //   489: astore #6
/*    */     //   491: aload_1
/*    */     //   492: invokeinterface endReplaceGroup : ()V
/*    */     //   497: aload #6
/*    */     //   499: aload_1
/*    */     //   500: ldc 1366010512
/*    */     //   502: invokeinterface startReplaceGroup : (I)V
/*    */     //   507: aload_1
/*    */     //   508: astore #7
/*    */     //   510: aload_1
/*    */     //   511: aload_0
/*    */     //   512: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   517: istore #8
/*    */     //   519: iconst_0
/*    */     //   520: istore #9
/*    */     //   522: aload #7
/*    */     //   524: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   529: astore #10
/*    */     //   531: iconst_0
/*    */     //   532: istore #11
/*    */     //   534: iload #8
/*    */     //   536: ifne -> 550
/*    */     //   539: aload #10
/*    */     //   541: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   544: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   547: if_acmpne -> 585
/*    */     //   550: astore #14
/*    */     //   552: iconst_0
/*    */     //   553: istore #12
/*    */     //   555: new com/intellij/ml/llm/matterhorn/ej/ui/login/components/RequireLicenseAcceptanceKt$RequireLicenseAcceptance$4$1
/*    */     //   558: dup
/*    */     //   559: aload_0
/*    */     //   560: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   563: checkcast kotlin/reflect/KFunction
/*    */     //   566: aload #14
/*    */     //   568: swap
/*    */     //   569: astore #13
/*    */     //   571: aload #7
/*    */     //   573: aload #13
/*    */     //   575: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   580: aload #13
/*    */     //   582: goto -> 587
/*    */     //   585: aload #10
/*    */     //   587: nop
/*    */     //   588: nop
/*    */     //   589: nop
/*    */     //   590: checkcast kotlin/reflect/KFunction
/*    */     //   593: astore #6
/*    */     //   595: aload_1
/*    */     //   596: invokeinterface endReplaceGroup : ()V
/*    */     //   601: aload #6
/*    */     //   603: checkcast kotlin/jvm/functions/Function0
/*    */     //   606: aload_1
/*    */     //   607: iconst_0
/*    */     //   608: invokestatic AcceptLicenseInBrowser : (Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*    */     //   611: aload_1
/*    */     //   612: invokeinterface endReplaceGroup : ()V
/*    */     //   617: goto -> 888
/*    */     //   620: aload #5
/*    */     //   622: instanceof com/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase$Error
/*    */     //   625: ifeq -> 802
/*    */     //   628: aload_1
/*    */     //   629: ldc -603253528
/*    */     //   631: invokeinterface startReplaceGroup : (I)V
/*    */     //   636: ldc 'Failed to load the license agreement url, please try again later.'
/*    */     //   638: aconst_null
/*    */     //   639: lconst_0
/*    */     //   640: lconst_0
/*    */     //   641: aconst_null
/*    */     //   642: aconst_null
/*    */     //   643: aconst_null
/*    */     //   644: lconst_0
/*    */     //   645: aconst_null
/*    */     //   646: iconst_0
/*    */     //   647: lconst_0
/*    */     //   648: iconst_0
/*    */     //   649: iconst_0
/*    */     //   650: iconst_0
/*    */     //   651: aconst_null
/*    */     //   652: aconst_null
/*    */     //   653: aload_1
/*    */     //   654: bipush #6
/*    */     //   656: iconst_0
/*    */     //   657: ldc 65534
/*    */     //   659: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*    */     //   662: ldc 'Try again'
/*    */     //   664: aconst_null
/*    */     //   665: iconst_0
/*    */     //   666: aload_1
/*    */     //   667: ldc 1366017520
/*    */     //   669: invokeinterface startReplaceGroup : (I)V
/*    */     //   674: aload_1
/*    */     //   675: astore #7
/*    */     //   677: aload_1
/*    */     //   678: aload_0
/*    */     //   679: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   684: istore #8
/*    */     //   686: iconst_0
/*    */     //   687: istore #9
/*    */     //   689: aload #7
/*    */     //   691: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   696: astore #10
/*    */     //   698: iconst_0
/*    */     //   699: istore #11
/*    */     //   701: iload #8
/*    */     //   703: ifne -> 717
/*    */     //   706: aload #10
/*    */     //   708: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   711: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   714: if_acmpne -> 763
/*    */     //   717: istore #16
/*    */     //   719: astore #15
/*    */     //   721: astore #14
/*    */     //   723: iconst_0
/*    */     //   724: istore #12
/*    */     //   726: new com/intellij/ml/llm/matterhorn/ej/ui/login/components/RequireLicenseAcceptanceKt$RequireLicenseAcceptance$5$1
/*    */     //   729: dup
/*    */     //   730: aload_0
/*    */     //   731: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   734: checkcast kotlin/reflect/KFunction
/*    */     //   737: astore #17
/*    */     //   739: aload #14
/*    */     //   741: aload #15
/*    */     //   743: iload #16
/*    */     //   745: aload #17
/*    */     //   747: astore #13
/*    */     //   749: aload #7
/*    */     //   751: aload #13
/*    */     //   753: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   758: aload #13
/*    */     //   760: goto -> 765
/*    */     //   763: aload #10
/*    */     //   765: nop
/*    */     //   766: nop
/*    */     //   767: nop
/*    */     //   768: checkcast kotlin/reflect/KFunction
/*    */     //   771: astore #6
/*    */     //   773: aload_1
/*    */     //   774: invokeinterface endReplaceGroup : ()V
/*    */     //   779: aload #6
/*    */     //   781: checkcast kotlin/jvm/functions/Function0
/*    */     //   784: aconst_null
/*    */     //   785: aload_1
/*    */     //   786: bipush #6
/*    */     //   788: bipush #22
/*    */     //   790: invokestatic Button : (Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*    */     //   793: aload_1
/*    */     //   794: invokeinterface endReplaceGroup : ()V
/*    */     //   799: goto -> 888
/*    */     //   802: aload #5
/*    */     //   804: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase$Progress.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase$Progress;
/*    */     //   807: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   810: ifeq -> 866
/*    */     //   813: aload_1
/*    */     //   814: ldc -603038109
/*    */     //   816: invokeinterface startReplaceGroup : (I)V
/*    */     //   821: ldc 'Loading the license agreement accept url...'
/*    */     //   823: aconst_null
/*    */     //   824: lconst_0
/*    */     //   825: lconst_0
/*    */     //   826: aconst_null
/*    */     //   827: aconst_null
/*    */     //   828: aconst_null
/*    */     //   829: lconst_0
/*    */     //   830: aconst_null
/*    */     //   831: iconst_0
/*    */     //   832: lconst_0
/*    */     //   833: iconst_0
/*    */     //   834: iconst_0
/*    */     //   835: iconst_0
/*    */     //   836: aconst_null
/*    */     //   837: aconst_null
/*    */     //   838: aload_1
/*    */     //   839: bipush #6
/*    */     //   841: iconst_0
/*    */     //   842: ldc 65534
/*    */     //   844: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*    */     //   847: aconst_null
/*    */     //   848: lconst_0
/*    */     //   849: aconst_null
/*    */     //   850: aload_1
/*    */     //   851: iconst_0
/*    */     //   852: bipush #7
/*    */     //   854: invokestatic JunieCircularProgressIndicator-3IgeMak : (Landroidx/compose/ui/Modifier;JLjava/lang/String;Landroidx/compose/runtime/Composer;II)V
/*    */     //   857: aload_1
/*    */     //   858: invokeinterface endReplaceGroup : ()V
/*    */     //   863: goto -> 888
/*    */     //   866: aload_1
/*    */     //   867: ldc 1366006442
/*    */     //   869: invokeinterface startReplaceGroup : (I)V
/*    */     //   874: aload_1
/*    */     //   875: invokeinterface endReplaceGroup : ()V
/*    */     //   880: new kotlin/NoWhenBranchMatchedException
/*    */     //   883: dup
/*    */     //   884: invokespecial <init> : ()V
/*    */     //   887: athrow
/*    */     //   888: aload_1
/*    */     //   889: invokeinterface endReplaceGroup : ()V
/*    */     //   894: goto -> 919
/*    */     //   897: aload_1
/*    */     //   898: ldc 1365997332
/*    */     //   900: invokeinterface startReplaceGroup : (I)V
/*    */     //   905: aload_1
/*    */     //   906: invokeinterface endReplaceGroup : ()V
/*    */     //   911: new kotlin/NoWhenBranchMatchedException
/*    */     //   914: dup
/*    */     //   915: invokespecial <init> : ()V
/*    */     //   918: athrow
/*    */     //   919: invokestatic isTraceInProgress : ()Z
/*    */     //   922: ifeq -> 937
/*    */     //   925: invokestatic traceEventEnd : ()V
/*    */     //   928: goto -> 937
/*    */     //   931: aload_1
/*    */     //   932: invokeinterface skipToGroupEnd : ()V
/*    */     //   937: aload_1
/*    */     //   938: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   943: dup
/*    */     //   944: ifnull -> 962
/*    */     //   947: aload_0
/*    */     //   948: iload_2
/*    */     //   949: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement;I)Lkotlin/jvm/functions/Function2;
/*    */     //   954: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   959: goto -> 963
/*    */     //   962: pop
/*    */     //   963: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #24	-> 6
/*    */     //   #25	-> 73
/*    */     //   #28	-> 94
/*    */     //   #29	-> 132
/*    */     //   #31	-> 160
/*    */     //   #94	-> 164
/*    */     //   #95	-> 176
/*    */     //   #96	-> 192
/*    */     //   #31	-> 195
/*    */     //   #96	-> 206
/*    */     //   #97	-> 208
/*    */     //   #98	-> 217
/*    */     //   #99	-> 222
/*    */     //   #95	-> 224
/*    */     //   #94	-> 225
/*    */     //   #94	-> 226
/*    */     //   #31	-> 227
/*    */     //   #32	-> 263
/*    */     //   #100	-> 267
/*    */     //   #101	-> 279
/*    */     //   #102	-> 295
/*    */     //   #32	-> 300
/*    */     //   #102	-> 314
/*    */     //   #103	-> 316
/*    */     //   #104	-> 325
/*    */     //   #105	-> 330
/*    */     //   #101	-> 332
/*    */     //   #100	-> 333
/*    */     //   #100	-> 334
/*    */     //   #32	-> 335
/*    */     //   #30	-> 353
/*    */     //   #29	-> 356
/*    */     //   #36	-> 365
/*    */     //   #37	-> 377
/*    */     //   #38	-> 422
/*    */     //   #106	-> 426
/*    */     //   #107	-> 438
/*    */     //   #108	-> 454
/*    */     //   #38	-> 457
/*    */     //   #108	-> 465
/*    */     //   #109	-> 467
/*    */     //   #110	-> 476
/*    */     //   #111	-> 481
/*    */     //   #107	-> 483
/*    */     //   #106	-> 484
/*    */     //   #106	-> 485
/*    */     //   #38	-> 486
/*    */     //   #106	-> 522
/*    */     //   #107	-> 534
/*    */     //   #108	-> 550
/*    */     //   #38	-> 555
/*    */     //   #108	-> 569
/*    */     //   #109	-> 571
/*    */     //   #110	-> 580
/*    */     //   #111	-> 585
/*    */     //   #107	-> 587
/*    */     //   #106	-> 588
/*    */     //   #106	-> 589
/*    */     //   #38	-> 590
/*    */     //   #37	-> 611
/*    */     //   #41	-> 620
/*    */     //   #42	-> 636
/*    */     //   #43	-> 662
/*    */     //   #112	-> 689
/*    */     //   #113	-> 701
/*    */     //   #114	-> 717
/*    */     //   #43	-> 726
/*    */     //   #114	-> 747
/*    */     //   #115	-> 749
/*    */     //   #116	-> 758
/*    */     //   #117	-> 763
/*    */     //   #113	-> 765
/*    */     //   #112	-> 766
/*    */     //   #112	-> 767
/*    */     //   #43	-> 768
/*    */     //   #41	-> 793
/*    */     //   #46	-> 802
/*    */     //   #47	-> 821
/*    */     //   #48	-> 854
/*    */     //   #46	-> 857
/*    */     //   #36	-> 866
/*    */     //   #28	-> 897
/*    */     //   #52	-> 931
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   195	11	11	$i$a$-cache-RequireLicenseAcceptanceKt$RequireLicenseAcceptance$1	I
/*    */     //   208	11	12	value$iv	Ljava/lang/Object;
/*    */     //   176	49	10	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   173	52	9	it$iv	Ljava/lang/Object;
/*    */     //   164	63	8	$i$f$cache	I
/*    */     //   161	66	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   161	66	7	invalid$iv	Z
/*    */     //   300	11	11	$i$a$-cache-RequireLicenseAcceptanceKt$RequireLicenseAcceptance$2	I
/*    */     //   316	11	12	value$iv	Ljava/lang/Object;
/*    */     //   279	54	10	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   276	57	9	it$iv	Ljava/lang/Object;
/*    */     //   267	68	8	$i$f$cache	I
/*    */     //   264	71	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   264	71	7	invalid$iv	Z
/*    */     //   457	8	12	$i$a$-cache-RequireLicenseAcceptanceKt$RequireLicenseAcceptance$3	I
/*    */     //   467	11	13	value$iv	Ljava/lang/Object;
/*    */     //   438	46	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   435	49	10	it$iv	Ljava/lang/Object;
/*    */     //   426	60	9	$i$f$cache	I
/*    */     //   423	63	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   423	63	8	invalid$iv	Z
/*    */     //   555	11	12	$i$a$-cache-RequireLicenseAcceptanceKt$RequireLicenseAcceptance$4	I
/*    */     //   571	11	13	value$iv	Ljava/lang/Object;
/*    */     //   534	54	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   531	57	10	it$iv	Ljava/lang/Object;
/*    */     //   522	68	9	$i$f$cache	I
/*    */     //   519	71	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   519	71	8	invalid$iv	Z
/*    */     //   726	11	12	$i$a$-cache-RequireLicenseAcceptanceKt$RequireLicenseAcceptance$5	I
/*    */     //   749	11	13	value$iv	Ljava/lang/Object;
/*    */     //   701	65	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   698	68	10	it$iv	Ljava/lang/Object;
/*    */     //   689	79	9	$i$f$cache	I
/*    */     //   686	82	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   686	82	8	invalid$iv	Z
/*    */     //   94	834	4	urlLoadState	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement$UrlLoadPhase;
/*    */     //   17	947	3	$dirty	I
/*    */     //   0	964	0	state	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/LicenseAgreement;
/*    */     //   0	964	1	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	964	2	$changed	I
/*    */   }
/*    */   
/*    */   private static final Unit RequireLicenseAcceptance$lambda$3$lambda$2(LicenseAgreement $state, LicenseAgreement.UrlLoadPhase $urlLoadState) {
/* 38 */     $state.openUrl(((LicenseAgreement.UrlLoadPhase.Completed)$urlLoadState).getUrl()); return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   private static final void AcceptLicenseLocal(Function0 onAccept, Function0 onOpenLicenseUrl, Composer $composer, int $changed) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: ldc_w -42903791
/*    */     //   4: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   9: astore_2
/*    */     //   10: iload_3
/*    */     //   11: istore #4
/*    */     //   13: iload_3
/*    */     //   14: bipush #6
/*    */     //   16: iand
/*    */     //   17: ifne -> 40
/*    */     //   20: iload #4
/*    */     //   22: aload_2
/*    */     //   23: aload_0
/*    */     //   24: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   29: ifeq -> 36
/*    */     //   32: iconst_4
/*    */     //   33: goto -> 37
/*    */     //   36: iconst_2
/*    */     //   37: ior
/*    */     //   38: istore #4
/*    */     //   40: iload_3
/*    */     //   41: bipush #48
/*    */     //   43: iand
/*    */     //   44: ifne -> 69
/*    */     //   47: iload #4
/*    */     //   49: aload_2
/*    */     //   50: aload_1
/*    */     //   51: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   56: ifeq -> 64
/*    */     //   59: bipush #32
/*    */     //   61: goto -> 66
/*    */     //   64: bipush #16
/*    */     //   66: ior
/*    */     //   67: istore #4
/*    */     //   69: iload #4
/*    */     //   71: bipush #19
/*    */     //   73: iand
/*    */     //   74: bipush #18
/*    */     //   76: if_icmpne -> 88
/*    */     //   79: aload_2
/*    */     //   80: invokeinterface getSkipping : ()Z
/*    */     //   85: ifne -> 1543
/*    */     //   88: invokestatic isTraceInProgress : ()Z
/*    */     //   91: ifeq -> 106
/*    */     //   94: ldc_w -42903791
/*    */     //   97: iload #4
/*    */     //   99: iconst_m1
/*    */     //   100: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.login.components.AcceptLicenseLocal (RequireLicenseAcceptance.kt:58)'
/*    */     //   103: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   106: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   109: checkcast androidx/compose/ui/Modifier
/*    */     //   112: fconst_0
/*    */     //   113: invokestatic getActivationMinHeight : ()F
/*    */     //   116: iconst_1
/*    */     //   117: aconst_null
/*    */     //   118: invokestatic defaultMinSize-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   121: astore #5
/*    */     //   123: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*    */     //   126: bipush #16
/*    */     //   128: istore #6
/*    */     //   130: iconst_0
/*    */     //   131: istore #7
/*    */     //   133: iload #6
/*    */     //   135: i2f
/*    */     //   136: invokestatic constructor-impl : (F)F
/*    */     //   139: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*    */     //   142: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
/*    */     //   145: astore #6
/*    */     //   147: bipush #54
/*    */     //   149: istore #8
/*    */     //   151: nop
/*    */     //   152: iconst_0
/*    */     //   153: istore #9
/*    */     //   155: aload_2
/*    */     //   156: ldc_w -483455358
/*    */     //   159: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*    */     //   162: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   165: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   168: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*    */     //   171: astore #7
/*    */     //   173: aload #6
/*    */     //   175: aload #7
/*    */     //   177: aload_2
/*    */     //   178: bipush #14
/*    */     //   180: iload #8
/*    */     //   182: iconst_3
/*    */     //   183: ishr
/*    */     //   184: iand
/*    */     //   185: bipush #112
/*    */     //   187: iload #8
/*    */     //   189: iconst_3
/*    */     //   190: ishr
/*    */     //   191: iand
/*    */     //   192: ior
/*    */     //   193: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   196: astore #10
/*    */     //   198: bipush #112
/*    */     //   200: iload #8
/*    */     //   202: iconst_3
/*    */     //   203: ishl
/*    */     //   204: iand
/*    */     //   205: istore #11
/*    */     //   207: nop
/*    */     //   208: iconst_0
/*    */     //   209: istore #12
/*    */     //   211: aload_2
/*    */     //   212: ldc_w -1323940314
/*    */     //   215: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   218: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   221: aload_2
/*    */     //   222: iconst_0
/*    */     //   223: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   226: istore #13
/*    */     //   228: aload_2
/*    */     //   229: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   234: astore #14
/*    */     //   236: aload_2
/*    */     //   237: aload #5
/*    */     //   239: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   242: astore #15
/*    */     //   244: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   247: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   250: astore #16
/*    */     //   252: bipush #6
/*    */     //   254: sipush #896
/*    */     //   257: iload #11
/*    */     //   259: bipush #6
/*    */     //   261: ishl
/*    */     //   262: iand
/*    */     //   263: ior
/*    */     //   264: istore #17
/*    */     //   266: nop
/*    */     //   267: iconst_0
/*    */     //   268: istore #18
/*    */     //   270: aload_2
/*    */     //   271: ldc_w -692256719
/*    */     //   274: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   277: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   280: aload_2
/*    */     //   281: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   286: instanceof androidx/compose/runtime/Applier
/*    */     //   289: ifne -> 295
/*    */     //   292: invokestatic invalidApplier : ()V
/*    */     //   295: aload_2
/*    */     //   296: invokeinterface startReusableNode : ()V
/*    */     //   301: aload_2
/*    */     //   302: invokeinterface getInserting : ()Z
/*    */     //   307: ifeq -> 321
/*    */     //   310: aload_2
/*    */     //   311: aload #16
/*    */     //   313: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   318: goto -> 327
/*    */     //   321: aload_2
/*    */     //   322: invokeinterface useNode : ()V
/*    */     //   327: aload_2
/*    */     //   328: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   331: astore #19
/*    */     //   333: iconst_0
/*    */     //   334: istore #20
/*    */     //   336: aload #19
/*    */     //   338: aload #10
/*    */     //   340: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   343: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   346: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   349: aload #19
/*    */     //   351: aload #14
/*    */     //   353: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   356: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   359: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   362: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   365: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   368: astore #21
/*    */     //   370: iconst_0
/*    */     //   371: istore #22
/*    */     //   373: aload #19
/*    */     //   375: astore #23
/*    */     //   377: iconst_0
/*    */     //   378: istore #24
/*    */     //   380: aload #23
/*    */     //   382: invokeinterface getInserting : ()Z
/*    */     //   387: ifne -> 408
/*    */     //   390: aload #23
/*    */     //   392: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   397: iload #13
/*    */     //   399: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   402: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   405: ifne -> 434
/*    */     //   408: aload #23
/*    */     //   410: iload #13
/*    */     //   412: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   415: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   420: aload #19
/*    */     //   422: iload #13
/*    */     //   424: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   427: aload #21
/*    */     //   429: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   434: nop
/*    */     //   435: nop
/*    */     //   436: nop
/*    */     //   437: aload #19
/*    */     //   439: aload #15
/*    */     //   441: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   444: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   447: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   450: nop
/*    */     //   451: nop
/*    */     //   452: aload_2
/*    */     //   453: bipush #14
/*    */     //   455: iload #17
/*    */     //   457: bipush #6
/*    */     //   459: ishr
/*    */     //   460: iand
/*    */     //   461: istore #25
/*    */     //   463: astore #26
/*    */     //   465: iconst_0
/*    */     //   466: istore #27
/*    */     //   468: aload #26
/*    */     //   470: ldc_w -384784025
/*    */     //   473: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*    */     //   476: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   479: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*    */     //   482: aload #26
/*    */     //   484: bipush #6
/*    */     //   486: bipush #112
/*    */     //   488: iload #8
/*    */     //   490: bipush #6
/*    */     //   492: ishr
/*    */     //   493: iand
/*    */     //   494: ior
/*    */     //   495: istore #28
/*    */     //   497: astore #29
/*    */     //   499: checkcast androidx/compose/foundation/layout/ColumnScope
/*    */     //   502: astore #30
/*    */     //   504: iconst_0
/*    */     //   505: istore #31
/*    */     //   507: ldc_w 'Accept'
/*    */     //   510: astore #32
/*    */     //   512: ldc_w 'Junie is ready!'
/*    */     //   515: lconst_0
/*    */     //   516: aload #29
/*    */     //   518: bipush #6
/*    */     //   520: iconst_2
/*    */     //   521: invokestatic Title-iJQMabo : (Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)V
/*    */     //   524: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*    */     //   527: bipush #16
/*    */     //   529: istore #33
/*    */     //   531: iconst_0
/*    */     //   532: istore #34
/*    */     //   534: iload #33
/*    */     //   536: i2f
/*    */     //   537: invokestatic constructor-impl : (F)F
/*    */     //   540: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*    */     //   543: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*    */     //   546: astore #33
/*    */     //   548: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   551: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*    */     //   554: astore #34
/*    */     //   556: sipush #432
/*    */     //   559: istore #35
/*    */     //   561: nop
/*    */     //   562: iconst_0
/*    */     //   563: istore #36
/*    */     //   565: aload #29
/*    */     //   567: ldc_w 693286680
/*    */     //   570: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*    */     //   573: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   576: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   579: checkcast androidx/compose/ui/Modifier
/*    */     //   582: astore #37
/*    */     //   584: aload #33
/*    */     //   586: aload #34
/*    */     //   588: aload #29
/*    */     //   590: bipush #14
/*    */     //   592: iload #35
/*    */     //   594: iconst_3
/*    */     //   595: ishr
/*    */     //   596: iand
/*    */     //   597: bipush #112
/*    */     //   599: iload #35
/*    */     //   601: iconst_3
/*    */     //   602: ishr
/*    */     //   603: iand
/*    */     //   604: ior
/*    */     //   605: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   608: astore #38
/*    */     //   610: bipush #112
/*    */     //   612: iload #35
/*    */     //   614: iconst_3
/*    */     //   615: ishl
/*    */     //   616: iand
/*    */     //   617: istore #39
/*    */     //   619: nop
/*    */     //   620: iconst_0
/*    */     //   621: istore #40
/*    */     //   623: aload #29
/*    */     //   625: ldc_w -1323940314
/*    */     //   628: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   631: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   634: aload #29
/*    */     //   636: iconst_0
/*    */     //   637: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   640: istore #41
/*    */     //   642: aload #29
/*    */     //   644: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   649: astore #42
/*    */     //   651: aload #29
/*    */     //   653: aload #37
/*    */     //   655: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   658: astore #43
/*    */     //   660: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   663: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   666: astore #44
/*    */     //   668: bipush #6
/*    */     //   670: sipush #896
/*    */     //   673: iload #39
/*    */     //   675: bipush #6
/*    */     //   677: ishl
/*    */     //   678: iand
/*    */     //   679: ior
/*    */     //   680: istore #45
/*    */     //   682: nop
/*    */     //   683: iconst_0
/*    */     //   684: istore #46
/*    */     //   686: aload #29
/*    */     //   688: ldc_w -692256719
/*    */     //   691: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   694: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   697: aload #29
/*    */     //   699: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   704: instanceof androidx/compose/runtime/Applier
/*    */     //   707: ifne -> 713
/*    */     //   710: invokestatic invalidApplier : ()V
/*    */     //   713: aload #29
/*    */     //   715: invokeinterface startReusableNode : ()V
/*    */     //   720: aload #29
/*    */     //   722: invokeinterface getInserting : ()Z
/*    */     //   727: ifeq -> 742
/*    */     //   730: aload #29
/*    */     //   732: aload #44
/*    */     //   734: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   739: goto -> 749
/*    */     //   742: aload #29
/*    */     //   744: invokeinterface useNode : ()V
/*    */     //   749: aload #29
/*    */     //   751: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   754: astore #47
/*    */     //   756: iconst_0
/*    */     //   757: istore #48
/*    */     //   759: aload #47
/*    */     //   761: aload #38
/*    */     //   763: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   766: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   769: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   772: aload #47
/*    */     //   774: aload #42
/*    */     //   776: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   779: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   782: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   785: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   788: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   791: astore #49
/*    */     //   793: iconst_0
/*    */     //   794: istore #50
/*    */     //   796: aload #47
/*    */     //   798: astore #51
/*    */     //   800: iconst_0
/*    */     //   801: istore #52
/*    */     //   803: aload #51
/*    */     //   805: invokeinterface getInserting : ()Z
/*    */     //   810: ifne -> 831
/*    */     //   813: aload #51
/*    */     //   815: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   820: iload #41
/*    */     //   822: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   825: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   828: ifne -> 857
/*    */     //   831: aload #51
/*    */     //   833: iload #41
/*    */     //   835: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   838: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   843: aload #47
/*    */     //   845: iload #41
/*    */     //   847: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   850: aload #49
/*    */     //   852: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   857: nop
/*    */     //   858: nop
/*    */     //   859: nop
/*    */     //   860: aload #47
/*    */     //   862: aload #43
/*    */     //   864: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   867: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   870: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   873: nop
/*    */     //   874: nop
/*    */     //   875: aload #29
/*    */     //   877: bipush #14
/*    */     //   879: iload #45
/*    */     //   881: bipush #6
/*    */     //   883: ishr
/*    */     //   884: iand
/*    */     //   885: istore #53
/*    */     //   887: astore #54
/*    */     //   889: iconst_0
/*    */     //   890: istore #55
/*    */     //   892: aload #54
/*    */     //   894: ldc_w -407840262
/*    */     //   897: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*    */     //   900: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   903: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*    */     //   906: aload #54
/*    */     //   908: bipush #6
/*    */     //   910: bipush #112
/*    */     //   912: iload #35
/*    */     //   914: bipush #6
/*    */     //   916: ishr
/*    */     //   917: iand
/*    */     //   918: ior
/*    */     //   919: istore #56
/*    */     //   921: astore #57
/*    */     //   923: checkcast androidx/compose/foundation/layout/RowScope
/*    */     //   926: astore #58
/*    */     //   928: iconst_0
/*    */     //   929: istore #59
/*    */     //   931: aload #32
/*    */     //   933: aconst_null
/*    */     //   934: iconst_0
/*    */     //   935: aload_0
/*    */     //   936: aconst_null
/*    */     //   937: aload #57
/*    */     //   939: bipush #6
/*    */     //   941: sipush #7168
/*    */     //   944: iload #4
/*    */     //   946: bipush #9
/*    */     //   948: ishl
/*    */     //   949: iand
/*    */     //   950: ior
/*    */     //   951: bipush #22
/*    */     //   953: invokestatic Button : (Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*    */     //   956: iconst_0
/*    */     //   957: istore #60
/*    */     //   959: nop
/*    */     //   960: iconst_0
/*    */     //   961: istore #61
/*    */     //   963: aload #57
/*    */     //   965: ldc_w -483455358
/*    */     //   968: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*    */     //   971: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   974: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   977: checkcast androidx/compose/ui/Modifier
/*    */     //   980: astore #62
/*    */     //   982: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*    */     //   985: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*    */     //   988: astore #63
/*    */     //   990: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   993: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*    */     //   996: astore #64
/*    */     //   998: aload #63
/*    */     //   1000: aload #64
/*    */     //   1002: aload #57
/*    */     //   1004: bipush #14
/*    */     //   1006: iload #60
/*    */     //   1008: iconst_3
/*    */     //   1009: ishr
/*    */     //   1010: iand
/*    */     //   1011: bipush #112
/*    */     //   1013: iload #60
/*    */     //   1015: iconst_3
/*    */     //   1016: ishr
/*    */     //   1017: iand
/*    */     //   1018: ior
/*    */     //   1019: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   1022: astore #65
/*    */     //   1024: bipush #112
/*    */     //   1026: iload #60
/*    */     //   1028: iconst_3
/*    */     //   1029: ishl
/*    */     //   1030: iand
/*    */     //   1031: istore #66
/*    */     //   1033: nop
/*    */     //   1034: iconst_0
/*    */     //   1035: istore #67
/*    */     //   1037: aload #57
/*    */     //   1039: ldc_w -1323940314
/*    */     //   1042: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   1045: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1048: aload #57
/*    */     //   1050: iconst_0
/*    */     //   1051: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   1054: istore #68
/*    */     //   1056: aload #57
/*    */     //   1058: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   1063: astore #69
/*    */     //   1065: aload #57
/*    */     //   1067: aload #62
/*    */     //   1069: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   1072: astore #70
/*    */     //   1074: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1077: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   1080: astore #71
/*    */     //   1082: bipush #6
/*    */     //   1084: sipush #896
/*    */     //   1087: iload #66
/*    */     //   1089: bipush #6
/*    */     //   1091: ishl
/*    */     //   1092: iand
/*    */     //   1093: ior
/*    */     //   1094: istore #72
/*    */     //   1096: nop
/*    */     //   1097: iconst_0
/*    */     //   1098: istore #73
/*    */     //   1100: aload #57
/*    */     //   1102: ldc_w -692256719
/*    */     //   1105: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   1108: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1111: aload #57
/*    */     //   1113: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   1118: instanceof androidx/compose/runtime/Applier
/*    */     //   1121: ifne -> 1127
/*    */     //   1124: invokestatic invalidApplier : ()V
/*    */     //   1127: aload #57
/*    */     //   1129: invokeinterface startReusableNode : ()V
/*    */     //   1134: aload #57
/*    */     //   1136: invokeinterface getInserting : ()Z
/*    */     //   1141: ifeq -> 1156
/*    */     //   1144: aload #57
/*    */     //   1146: aload #71
/*    */     //   1148: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   1153: goto -> 1163
/*    */     //   1156: aload #57
/*    */     //   1158: invokeinterface useNode : ()V
/*    */     //   1163: aload #57
/*    */     //   1165: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   1168: astore #74
/*    */     //   1170: iconst_0
/*    */     //   1171: istore #75
/*    */     //   1173: aload #74
/*    */     //   1175: aload #65
/*    */     //   1177: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1180: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1183: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1186: aload #74
/*    */     //   1188: aload #69
/*    */     //   1190: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1193: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1196: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1199: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1202: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1205: astore #76
/*    */     //   1207: iconst_0
/*    */     //   1208: istore #77
/*    */     //   1210: aload #74
/*    */     //   1212: astore #78
/*    */     //   1214: iconst_0
/*    */     //   1215: istore #79
/*    */     //   1217: aload #78
/*    */     //   1219: invokeinterface getInserting : ()Z
/*    */     //   1224: ifne -> 1245
/*    */     //   1227: aload #78
/*    */     //   1229: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   1234: iload #68
/*    */     //   1236: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1239: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   1242: ifne -> 1271
/*    */     //   1245: aload #78
/*    */     //   1247: iload #68
/*    */     //   1249: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1252: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   1257: aload #74
/*    */     //   1259: iload #68
/*    */     //   1261: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   1264: aload #76
/*    */     //   1266: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1271: nop
/*    */     //   1272: nop
/*    */     //   1273: nop
/*    */     //   1274: aload #74
/*    */     //   1276: aload #70
/*    */     //   1278: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   1281: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   1284: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   1287: nop
/*    */     //   1288: nop
/*    */     //   1289: aload #57
/*    */     //   1291: bipush #14
/*    */     //   1293: iload #72
/*    */     //   1295: bipush #6
/*    */     //   1297: ishr
/*    */     //   1298: iand
/*    */     //   1299: istore #80
/*    */     //   1301: astore #81
/*    */     //   1303: iconst_0
/*    */     //   1304: istore #82
/*    */     //   1306: aload #81
/*    */     //   1308: ldc_w -384784025
/*    */     //   1311: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*    */     //   1314: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   1317: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*    */     //   1320: aload #81
/*    */     //   1322: bipush #6
/*    */     //   1324: bipush #112
/*    */     //   1326: iload #60
/*    */     //   1328: bipush #6
/*    */     //   1330: ishr
/*    */     //   1331: iand
/*    */     //   1332: ior
/*    */     //   1333: istore #83
/*    */     //   1335: astore #84
/*    */     //   1337: checkcast androidx/compose/foundation/layout/ColumnScope
/*    */     //   1340: astore #85
/*    */     //   1342: iconst_0
/*    */     //   1343: istore #86
/*    */     //   1345: aload #85
/*    */     //   1347: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   1350: checkcast androidx/compose/ui/Modifier
/*    */     //   1353: fconst_1
/*    */     //   1354: iconst_0
/*    */     //   1355: invokeinterface weight : (Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;
/*    */     //   1360: astore #87
/*    */     //   1362: aload #32
/*    */     //   1364: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   1369: astore #88
/*    */     //   1371: aload #84
/*    */     //   1373: iconst_0
/*    */     //   1374: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*    */     //   1377: aload #84
/*    */     //   1379: getstatic com/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData.$stable : I
/*    */     //   1382: invokevirtual getInactiveTextColor : (Landroidx/compose/runtime/Composer;I)J
/*    */     //   1385: lstore #89
/*    */     //   1387: aload #88
/*    */     //   1389: aload #87
/*    */     //   1391: lload #89
/*    */     //   1393: lconst_0
/*    */     //   1394: aconst_null
/*    */     //   1395: aconst_null
/*    */     //   1396: aconst_null
/*    */     //   1397: lconst_0
/*    */     //   1398: aconst_null
/*    */     //   1399: iconst_0
/*    */     //   1400: lconst_0
/*    */     //   1401: iconst_0
/*    */     //   1402: iconst_0
/*    */     //   1403: iconst_0
/*    */     //   1404: aconst_null
/*    */     //   1405: aconst_null
/*    */     //   1406: aload #84
/*    */     //   1408: iconst_0
/*    */     //   1409: iconst_0
/*    */     //   1410: ldc_w 65528
/*    */     //   1413: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*    */     //   1416: ldc_w 'License Agreement'
/*    */     //   1419: aload_1
/*    */     //   1420: aconst_null
/*    */     //   1421: iconst_0
/*    */     //   1422: aconst_null
/*    */     //   1423: iconst_0
/*    */     //   1424: aconst_null
/*    */     //   1425: aconst_null
/*    */     //   1426: aload #84
/*    */     //   1428: bipush #6
/*    */     //   1430: bipush #112
/*    */     //   1432: iload #4
/*    */     //   1434: iand
/*    */     //   1435: ior
/*    */     //   1436: sipush #252
/*    */     //   1439: invokestatic Link-kye4rC8 : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V
/*    */     //   1442: nop
/*    */     //   1443: aload #81
/*    */     //   1445: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1448: aload #57
/*    */     //   1450: invokeinterface endNode : ()V
/*    */     //   1455: aload #57
/*    */     //   1457: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1460: nop
/*    */     //   1461: aload #57
/*    */     //   1463: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1466: nop
/*    */     //   1467: aload #57
/*    */     //   1469: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1472: nop
/*    */     //   1473: nop
/*    */     //   1474: aload #54
/*    */     //   1476: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1479: aload #29
/*    */     //   1481: invokeinterface endNode : ()V
/*    */     //   1486: aload #29
/*    */     //   1488: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1491: nop
/*    */     //   1492: aload #29
/*    */     //   1494: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1497: nop
/*    */     //   1498: aload #29
/*    */     //   1500: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1503: nop
/*    */     //   1504: nop
/*    */     //   1505: aload #26
/*    */     //   1507: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1510: aload_2
/*    */     //   1511: invokeinterface endNode : ()V
/*    */     //   1516: aload_2
/*    */     //   1517: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1520: nop
/*    */     //   1521: aload_2
/*    */     //   1522: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1525: nop
/*    */     //   1526: aload_2
/*    */     //   1527: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   1530: nop
/*    */     //   1531: invokestatic isTraceInProgress : ()Z
/*    */     //   1534: ifeq -> 1549
/*    */     //   1537: invokestatic traceEventEnd : ()V
/*    */     //   1540: goto -> 1549
/*    */     //   1543: aload_2
/*    */     //   1544: invokeinterface skipToGroupEnd : ()V
/*    */     //   1549: aload_2
/*    */     //   1550: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   1555: dup
/*    */     //   1556: ifnull -> 1575
/*    */     //   1559: aload_0
/*    */     //   1560: aload_1
/*    */     //   1561: iload_3
/*    */     //   1562: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)Lkotlin/jvm/functions/Function2;
/*    */     //   1567: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   1572: goto -> 1576
/*    */     //   1575: pop
/*    */     //   1576: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #59	-> 0
/*    */     //   #61	-> 106
/*    */     //   #62	-> 123
/*    */     //   #118	-> 133
/*    */     //   #62	-> 139
/*    */     //   #60	-> 151
/*    */     //   #119	-> 162
/*    */     //   #120	-> 165
/*    */     //   #123	-> 173
/*    */     //   #124	-> 207
/*    */     //   #125	-> 218
/*    */     //   #126	-> 223
/*    */     //   #127	-> 229
/*    */     //   #128	-> 237
/*    */     //   #130	-> 244
/*    */     //   #129	-> 266
/*    */     //   #131	-> 277
/*    */     //   #132	-> 280
/*    */     //   #133	-> 296
/*    */     //   #134	-> 301
/*    */     //   #135	-> 311
/*    */     //   #137	-> 322
/*    */     //   #139	-> 327
/*    */     //   #140	-> 336
/*    */     //   #141	-> 349
/*    */     //   #143	-> 362
/*    */     //   #144	-> 373
/*    */     //   #145	-> 380
/*    */     //   #146	-> 408
/*    */     //   #147	-> 420
/*    */     //   #149	-> 434
/*    */     //   #144	-> 435
/*    */     //   #149	-> 436
/*    */     //   #150	-> 437
/*    */     //   #151	-> 450
/*    */     //   #139	-> 451
/*    */     //   #152	-> 452
/*    */     //   #153	-> 476
/*    */     //   #64	-> 507
/*    */     //   #65	-> 512
/*    */     //   #67	-> 524
/*    */     //   #154	-> 534
/*    */     //   #67	-> 540
/*    */     //   #68	-> 548
/*    */     //   #66	-> 561
/*    */     //   #155	-> 573
/*    */     //   #156	-> 576
/*    */     //   #161	-> 584
/*    */     //   #162	-> 619
/*    */     //   #163	-> 631
/*    */     //   #164	-> 637
/*    */     //   #165	-> 644
/*    */     //   #166	-> 653
/*    */     //   #168	-> 660
/*    */     //   #167	-> 682
/*    */     //   #169	-> 694
/*    */     //   #170	-> 697
/*    */     //   #171	-> 715
/*    */     //   #172	-> 720
/*    */     //   #173	-> 732
/*    */     //   #175	-> 744
/*    */     //   #177	-> 749
/*    */     //   #178	-> 759
/*    */     //   #179	-> 772
/*    */     //   #181	-> 785
/*    */     //   #182	-> 796
/*    */     //   #183	-> 803
/*    */     //   #184	-> 831
/*    */     //   #185	-> 843
/*    */     //   #187	-> 857
/*    */     //   #182	-> 858
/*    */     //   #187	-> 859
/*    */     //   #188	-> 860
/*    */     //   #189	-> 873
/*    */     //   #177	-> 874
/*    */     //   #190	-> 875
/*    */     //   #191	-> 900
/*    */     //   #70	-> 931
/*    */     //   #71	-> 959
/*    */     //   #192	-> 971
/*    */     //   #193	-> 974
/*    */     //   #194	-> 982
/*    */     //   #195	-> 990
/*    */     //   #198	-> 998
/*    */     //   #199	-> 1033
/*    */     //   #200	-> 1045
/*    */     //   #201	-> 1051
/*    */     //   #202	-> 1058
/*    */     //   #203	-> 1067
/*    */     //   #205	-> 1074
/*    */     //   #204	-> 1096
/*    */     //   #206	-> 1108
/*    */     //   #207	-> 1111
/*    */     //   #208	-> 1129
/*    */     //   #209	-> 1134
/*    */     //   #210	-> 1146
/*    */     //   #212	-> 1158
/*    */     //   #214	-> 1163
/*    */     //   #215	-> 1173
/*    */     //   #216	-> 1186
/*    */     //   #218	-> 1199
/*    */     //   #219	-> 1210
/*    */     //   #220	-> 1217
/*    */     //   #221	-> 1245
/*    */     //   #222	-> 1257
/*    */     //   #224	-> 1271
/*    */     //   #219	-> 1272
/*    */     //   #224	-> 1273
/*    */     //   #225	-> 1274
/*    */     //   #226	-> 1287
/*    */     //   #214	-> 1288
/*    */     //   #227	-> 1289
/*    */     //   #228	-> 1314
/*    */     //   #73	-> 1345
/*    */     //   #74	-> 1362
/*    */     //   #75	-> 1374
/*    */     //   #74	-> 1387
/*    */     //   #73	-> 1389
/*    */     //   #75	-> 1391
/*    */     //   #72	-> 1413
/*    */     //   #77	-> 1416
/*    */     //   #78	-> 1442
/*    */     //   #228	-> 1443
/*    */     //   #227	-> 1448
/*    */     //   #229	-> 1450
/*    */     //   #206	-> 1457
/*    */     //   #230	-> 1460
/*    */     //   #200	-> 1463
/*    */     //   #231	-> 1466
/*    */     //   #192	-> 1469
/*    */     //   #232	-> 1472
/*    */     //   #79	-> 1473
/*    */     //   #191	-> 1474
/*    */     //   #190	-> 1479
/*    */     //   #233	-> 1481
/*    */     //   #169	-> 1488
/*    */     //   #234	-> 1491
/*    */     //   #163	-> 1494
/*    */     //   #235	-> 1497
/*    */     //   #155	-> 1500
/*    */     //   #236	-> 1503
/*    */     //   #80	-> 1504
/*    */     //   #153	-> 1505
/*    */     //   #152	-> 1510
/*    */     //   #237	-> 1511
/*    */     //   #131	-> 1517
/*    */     //   #238	-> 1520
/*    */     //   #125	-> 1522
/*    */     //   #239	-> 1525
/*    */     //   #119	-> 1527
/*    */     //   #240	-> 1530
/*    */     //   #81	-> 1543
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   133	6	7	$i$f$getDp	I
/*    */     //   130	9	6	$this$dp$iv	I
/*    */     //   534	6	34	$i$f$getDp	I
/*    */     //   531	9	33	$this$dp$iv	I
/*    */     //   1345	98	86	$i$a$-Column-RequireLicenseAcceptanceKt$AcceptLicenseLocal$1$1$1	I
/*    */     //   1342	101	85	$this$AcceptLicenseLocal_u24lambda_u249_u24lambda_u248_u24lambda_u247	Landroidx/compose/foundation/layout/ColumnScope;
/*    */     //   1342	101	84	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   1342	101	83	$changed	I
/*    */     //   1306	142	82	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*    */     //   1303	145	81	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1303	145	80	$changed$iv	I
/*    */     //   1217	55	79	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   1214	58	78	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1210	64	77	$i$f$set-impl	I
/*    */     //   1207	67	76	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   1173	115	75	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   1170	118	74	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1100	361	73	$i$f$ReusableComposeNode	I
/*    */     //   1097	364	71	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   1097	364	72	$changed$iv$iv$iv	I
/*    */     //   1037	430	67	$i$f$Layout	I
/*    */     //   1056	411	68	compositeKeyHash$iv$iv	I
/*    */     //   1065	402	69	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   1074	393	70	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   1034	433	66	$changed$iv$iv	I
/*    */     //   963	510	61	$i$f$Column	I
/*    */     //   1024	449	65	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   982	491	62	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */     //   990	483	63	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*    */     //   998	475	64	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*    */     //   960	513	60	$changed$iv	I
/*    */     //   931	543	59	$i$a$-Row-RequireLicenseAcceptanceKt$AcceptLicenseLocal$1$1	I
/*    */     //   928	546	58	$this$AcceptLicenseLocal_u24lambda_u249_u24lambda_u248	Landroidx/compose/foundation/layout/RowScope;
/*    */     //   928	546	57	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   928	546	56	$changed	I
/*    */     //   892	587	55	$i$a$-Layout-RowKt$Row$1$iv	I
/*    */     //   889	590	54	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   889	590	53	$changed$iv	I
/*    */     //   803	55	52	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   800	58	51	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   796	64	50	$i$f$set-impl	I
/*    */     //   793	67	49	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   759	115	48	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   756	118	47	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   686	806	46	$i$f$ReusableComposeNode	I
/*    */     //   683	809	44	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   683	809	45	$changed$iv$iv$iv	I
/*    */     //   623	875	40	$i$f$Layout	I
/*    */     //   642	856	41	compositeKeyHash$iv$iv	I
/*    */     //   651	847	42	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   660	838	43	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   620	878	39	$changed$iv$iv	I
/*    */     //   565	939	36	$i$f$Row	I
/*    */     //   610	894	38	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   584	920	37	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */     //   562	942	33	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*    */     //   562	942	34	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*    */     //   562	942	35	$changed$iv	I
/*    */     //   507	998	31	$i$a$-Column-RequireLicenseAcceptanceKt$AcceptLicenseLocal$1	I
/*    */     //   512	993	32	buttonText	Ljava/lang/String;
/*    */     //   504	1001	30	$this$AcceptLicenseLocal_u24lambda_u249	Landroidx/compose/foundation/layout/ColumnScope;
/*    */     //   504	1001	29	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   504	1001	28	$changed	I
/*    */     //   468	1042	27	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*    */     //   465	1045	26	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   465	1045	25	$changed$iv	I
/*    */     //   380	55	24	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   377	58	23	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   373	64	22	$i$f$set-impl	I
/*    */     //   370	67	21	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   336	115	20	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   333	118	19	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   270	1251	18	$i$f$ReusableComposeNode	I
/*    */     //   267	1254	16	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   267	1254	17	$changed$iv$iv$iv	I
/*    */     //   211	1315	12	$i$f$Layout	I
/*    */     //   228	1298	13	compositeKeyHash$iv$iv	I
/*    */     //   236	1290	14	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   244	1282	15	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   208	1318	11	$changed$iv$iv	I
/*    */     //   155	1376	9	$i$f$Column	I
/*    */     //   198	1333	10	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   152	1379	5	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */     //   152	1379	6	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*    */     //   173	1358	7	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*    */     //   152	1379	8	$changed$iv	I
/*    */     //   13	1564	4	$dirty	I
/*    */     //   0	1577	0	onAccept	Lkotlin/jvm/functions/Function0;
/*    */     //   0	1577	1	onOpenLicenseUrl	Lkotlin/jvm/functions/Function0;
/*    */     //   0	1577	2	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	1577	3	$changed	I
/*    */   }
/*    */   
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   private static final void AcceptLicenseInBrowser(Function0 onAccept, Function0 onRetry, Composer $composer, int $changed) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: ldc_w 1464335209
/*    */     //   4: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   9: astore_2
/*    */     //   10: iload_3
/*    */     //   11: istore #4
/*    */     //   13: iload_3
/*    */     //   14: bipush #6
/*    */     //   16: iand
/*    */     //   17: ifne -> 40
/*    */     //   20: iload #4
/*    */     //   22: aload_2
/*    */     //   23: aload_0
/*    */     //   24: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   29: ifeq -> 36
/*    */     //   32: iconst_4
/*    */     //   33: goto -> 37
/*    */     //   36: iconst_2
/*    */     //   37: ior
/*    */     //   38: istore #4
/*    */     //   40: iload_3
/*    */     //   41: bipush #48
/*    */     //   43: iand
/*    */     //   44: ifne -> 69
/*    */     //   47: iload #4
/*    */     //   49: aload_2
/*    */     //   50: aload_1
/*    */     //   51: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   56: ifeq -> 64
/*    */     //   59: bipush #32
/*    */     //   61: goto -> 66
/*    */     //   64: bipush #16
/*    */     //   66: ior
/*    */     //   67: istore #4
/*    */     //   69: iload #4
/*    */     //   71: bipush #19
/*    */     //   73: iand
/*    */     //   74: bipush #18
/*    */     //   76: if_icmpne -> 88
/*    */     //   79: aload_2
/*    */     //   80: invokeinterface getSkipping : ()Z
/*    */     //   85: ifne -> 610
/*    */     //   88: invokestatic isTraceInProgress : ()Z
/*    */     //   91: ifeq -> 106
/*    */     //   94: ldc_w 1464335209
/*    */     //   97: iload #4
/*    */     //   99: iconst_m1
/*    */     //   100: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.login.components.AcceptLicenseInBrowser (RequireLicenseAcceptance.kt:83)'
/*    */     //   103: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   106: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   109: checkcast androidx/compose/ui/Modifier
/*    */     //   112: fconst_0
/*    */     //   113: invokestatic getActivationMinHeight : ()F
/*    */     //   116: iconst_1
/*    */     //   117: aconst_null
/*    */     //   118: invokestatic defaultMinSize-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   121: astore #5
/*    */     //   123: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*    */     //   126: bipush #16
/*    */     //   128: istore #6
/*    */     //   130: iconst_0
/*    */     //   131: istore #7
/*    */     //   133: iload #6
/*    */     //   135: i2f
/*    */     //   136: invokestatic constructor-impl : (F)F
/*    */     //   139: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*    */     //   142: checkcast androidx/compose/foundation/layout/Arrangement$Vertical
/*    */     //   145: astore #6
/*    */     //   147: bipush #54
/*    */     //   149: istore #8
/*    */     //   151: nop
/*    */     //   152: iconst_0
/*    */     //   153: istore #9
/*    */     //   155: aload_2
/*    */     //   156: ldc_w -483455358
/*    */     //   159: ldc_w 'CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo'
/*    */     //   162: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   165: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   168: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*    */     //   171: astore #7
/*    */     //   173: aload #6
/*    */     //   175: aload #7
/*    */     //   177: aload_2
/*    */     //   178: bipush #14
/*    */     //   180: iload #8
/*    */     //   182: iconst_3
/*    */     //   183: ishr
/*    */     //   184: iand
/*    */     //   185: bipush #112
/*    */     //   187: iload #8
/*    */     //   189: iconst_3
/*    */     //   190: ishr
/*    */     //   191: iand
/*    */     //   192: ior
/*    */     //   193: invokestatic columnMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   196: astore #10
/*    */     //   198: bipush #112
/*    */     //   200: iload #8
/*    */     //   202: iconst_3
/*    */     //   203: ishl
/*    */     //   204: iand
/*    */     //   205: istore #11
/*    */     //   207: nop
/*    */     //   208: iconst_0
/*    */     //   209: istore #12
/*    */     //   211: aload_2
/*    */     //   212: ldc_w -1323940314
/*    */     //   215: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   218: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   221: aload_2
/*    */     //   222: iconst_0
/*    */     //   223: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   226: istore #13
/*    */     //   228: aload_2
/*    */     //   229: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   234: astore #14
/*    */     //   236: aload_2
/*    */     //   237: aload #5
/*    */     //   239: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   242: astore #15
/*    */     //   244: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   247: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   250: astore #16
/*    */     //   252: bipush #6
/*    */     //   254: sipush #896
/*    */     //   257: iload #11
/*    */     //   259: bipush #6
/*    */     //   261: ishl
/*    */     //   262: iand
/*    */     //   263: ior
/*    */     //   264: istore #17
/*    */     //   266: nop
/*    */     //   267: iconst_0
/*    */     //   268: istore #18
/*    */     //   270: aload_2
/*    */     //   271: ldc_w -692256719
/*    */     //   274: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   277: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   280: aload_2
/*    */     //   281: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   286: instanceof androidx/compose/runtime/Applier
/*    */     //   289: ifne -> 295
/*    */     //   292: invokestatic invalidApplier : ()V
/*    */     //   295: aload_2
/*    */     //   296: invokeinterface startReusableNode : ()V
/*    */     //   301: aload_2
/*    */     //   302: invokeinterface getInserting : ()Z
/*    */     //   307: ifeq -> 321
/*    */     //   310: aload_2
/*    */     //   311: aload #16
/*    */     //   313: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   318: goto -> 327
/*    */     //   321: aload_2
/*    */     //   322: invokeinterface useNode : ()V
/*    */     //   327: aload_2
/*    */     //   328: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   331: astore #19
/*    */     //   333: iconst_0
/*    */     //   334: istore #20
/*    */     //   336: aload #19
/*    */     //   338: aload #10
/*    */     //   340: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   343: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   346: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   349: aload #19
/*    */     //   351: aload #14
/*    */     //   353: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   356: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   359: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   362: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   365: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   368: astore #21
/*    */     //   370: iconst_0
/*    */     //   371: istore #22
/*    */     //   373: aload #19
/*    */     //   375: astore #23
/*    */     //   377: iconst_0
/*    */     //   378: istore #24
/*    */     //   380: aload #23
/*    */     //   382: invokeinterface getInserting : ()Z
/*    */     //   387: ifne -> 408
/*    */     //   390: aload #23
/*    */     //   392: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   397: iload #13
/*    */     //   399: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   402: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   405: ifne -> 434
/*    */     //   408: aload #23
/*    */     //   410: iload #13
/*    */     //   412: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   415: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   420: aload #19
/*    */     //   422: iload #13
/*    */     //   424: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   427: aload #21
/*    */     //   429: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   434: nop
/*    */     //   435: nop
/*    */     //   436: nop
/*    */     //   437: aload #19
/*    */     //   439: aload #15
/*    */     //   441: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   444: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   447: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   450: nop
/*    */     //   451: nop
/*    */     //   452: aload_2
/*    */     //   453: bipush #14
/*    */     //   455: iload #17
/*    */     //   457: bipush #6
/*    */     //   459: ishr
/*    */     //   460: iand
/*    */     //   461: istore #25
/*    */     //   463: astore #26
/*    */     //   465: iconst_0
/*    */     //   466: istore #27
/*    */     //   468: aload #26
/*    */     //   470: ldc_w -384784025
/*    */     //   473: ldc_w 'C88@4444L9:Column.kt#2w3rfo'
/*    */     //   476: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   479: getstatic androidx/compose/foundation/layout/ColumnScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/ColumnScopeInstance;
/*    */     //   482: aload #26
/*    */     //   484: bipush #6
/*    */     //   486: bipush #112
/*    */     //   488: iload #8
/*    */     //   490: bipush #6
/*    */     //   492: ishr
/*    */     //   493: iand
/*    */     //   494: ior
/*    */     //   495: istore #28
/*    */     //   497: astore #29
/*    */     //   499: checkcast androidx/compose/foundation/layout/ColumnScope
/*    */     //   502: astore #30
/*    */     //   504: iconst_0
/*    */     //   505: istore #31
/*    */     //   507: ldc_w 'Almost there!\\nJetBrains AI agreement has to be accepted by your company administrator.'
/*    */     //   510: lconst_0
/*    */     //   511: aload #29
/*    */     //   513: bipush #6
/*    */     //   515: iconst_2
/*    */     //   516: invokestatic Title-iJQMabo : (Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)V
/*    */     //   519: ldc_w 'Open JetBrains Account'
/*    */     //   522: aconst_null
/*    */     //   523: iconst_0
/*    */     //   524: aload_0
/*    */     //   525: aconst_null
/*    */     //   526: aload #29
/*    */     //   528: bipush #6
/*    */     //   530: sipush #7168
/*    */     //   533: iload #4
/*    */     //   535: bipush #9
/*    */     //   537: ishl
/*    */     //   538: iand
/*    */     //   539: ior
/*    */     //   540: bipush #22
/*    */     //   542: invokestatic Button : (Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*    */     //   545: ldc_w 'Retry'
/*    */     //   548: aload_1
/*    */     //   549: aconst_null
/*    */     //   550: iconst_0
/*    */     //   551: aconst_null
/*    */     //   552: iconst_0
/*    */     //   553: aconst_null
/*    */     //   554: aconst_null
/*    */     //   555: aload #29
/*    */     //   557: bipush #6
/*    */     //   559: bipush #112
/*    */     //   561: iload #4
/*    */     //   563: iand
/*    */     //   564: ior
/*    */     //   565: sipush #252
/*    */     //   568: invokestatic Link-kye4rC8 : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V
/*    */     //   571: nop
/*    */     //   572: aload #26
/*    */     //   574: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   577: aload_2
/*    */     //   578: invokeinterface endNode : ()V
/*    */     //   583: aload_2
/*    */     //   584: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   587: nop
/*    */     //   588: aload_2
/*    */     //   589: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   592: nop
/*    */     //   593: aload_2
/*    */     //   594: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   597: nop
/*    */     //   598: invokestatic isTraceInProgress : ()Z
/*    */     //   601: ifeq -> 616
/*    */     //   604: invokestatic traceEventEnd : ()V
/*    */     //   607: goto -> 616
/*    */     //   610: aload_2
/*    */     //   611: invokeinterface skipToGroupEnd : ()V
/*    */     //   616: aload_2
/*    */     //   617: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   622: dup
/*    */     //   623: ifnull -> 642
/*    */     //   626: aload_0
/*    */     //   627: aload_1
/*    */     //   628: iload_3
/*    */     //   629: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)Lkotlin/jvm/functions/Function2;
/*    */     //   634: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   639: goto -> 643
/*    */     //   642: pop
/*    */     //   643: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #84	-> 0
/*    */     //   #86	-> 106
/*    */     //   #87	-> 123
/*    */     //   #241	-> 133
/*    */     //   #87	-> 139
/*    */     //   #85	-> 151
/*    */     //   #242	-> 162
/*    */     //   #243	-> 165
/*    */     //   #246	-> 173
/*    */     //   #247	-> 207
/*    */     //   #248	-> 218
/*    */     //   #249	-> 223
/*    */     //   #250	-> 229
/*    */     //   #251	-> 237
/*    */     //   #253	-> 244
/*    */     //   #252	-> 266
/*    */     //   #254	-> 277
/*    */     //   #255	-> 280
/*    */     //   #256	-> 296
/*    */     //   #257	-> 301
/*    */     //   #258	-> 311
/*    */     //   #260	-> 322
/*    */     //   #262	-> 327
/*    */     //   #263	-> 336
/*    */     //   #264	-> 349
/*    */     //   #266	-> 362
/*    */     //   #267	-> 373
/*    */     //   #268	-> 380
/*    */     //   #269	-> 408
/*    */     //   #270	-> 420
/*    */     //   #272	-> 434
/*    */     //   #267	-> 435
/*    */     //   #272	-> 436
/*    */     //   #273	-> 437
/*    */     //   #274	-> 450
/*    */     //   #262	-> 451
/*    */     //   #275	-> 452
/*    */     //   #276	-> 476
/*    */     //   #89	-> 507
/*    */     //   #90	-> 519
/*    */     //   #91	-> 545
/*    */     //   #92	-> 571
/*    */     //   #276	-> 572
/*    */     //   #275	-> 577
/*    */     //   #277	-> 578
/*    */     //   #254	-> 584
/*    */     //   #278	-> 587
/*    */     //   #248	-> 589
/*    */     //   #279	-> 592
/*    */     //   #242	-> 594
/*    */     //   #280	-> 597
/*    */     //   #93	-> 610
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   133	6	7	$i$f$getDp	I
/*    */     //   130	9	6	$this$dp$iv	I
/*    */     //   507	65	31	$i$a$-Column-RequireLicenseAcceptanceKt$AcceptLicenseInBrowser$1	I
/*    */     //   504	68	30	$this$AcceptLicenseInBrowser_u24lambda_u2411	Landroidx/compose/foundation/layout/ColumnScope;
/*    */     //   504	68	29	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   504	68	28	$changed	I
/*    */     //   468	109	27	$i$a$-Layout-ColumnKt$Column$1$iv	I
/*    */     //   465	112	26	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   465	112	25	$changed$iv	I
/*    */     //   380	55	24	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   377	58	23	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   373	64	22	$i$f$set-impl	I
/*    */     //   370	67	21	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   336	115	20	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   333	118	19	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   270	318	18	$i$f$ReusableComposeNode	I
/*    */     //   267	321	16	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   267	321	17	$changed$iv$iv$iv	I
/*    */     //   211	382	12	$i$f$Layout	I
/*    */     //   228	365	13	compositeKeyHash$iv$iv	I
/*    */     //   236	357	14	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   244	349	15	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   208	385	11	$changed$iv$iv	I
/*    */     //   155	443	9	$i$f$Column	I
/*    */     //   198	400	10	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   152	446	5	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */     //   152	446	6	verticalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*    */     //   173	425	7	horizontalAlignment$iv	Landroidx/compose/ui/Alignment$Horizontal;
/*    */     //   152	446	8	$changed$iv	I
/*    */     //   13	631	4	$dirty	I
/*    */     //   0	644	0	onAccept	Lkotlin/jvm/functions/Function0;
/*    */     //   0	644	1	onRetry	Lkotlin/jvm/functions/Function0;
/*    */     //   0	644	2	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	644	3	$changed	I
/*    */   }
/*    */   
/*    */   private static final Unit RequireLicenseAcceptance$lambda$6(LicenseAgreement $state, int $$changed, Composer $composer, int $force) {
/*    */     RequireLicenseAcceptance($state, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit AcceptLicenseLocal$lambda$10(Function0<Unit> $onAccept, Function0<Unit> $onOpenLicenseUrl, int $$changed, Composer $composer, int $force) {
/*    */     AcceptLicenseLocal($onAccept, $onOpenLicenseUrl, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit AcceptLicenseInBrowser$lambda$12(Function0<Unit> $onAccept, Function0<Unit> $onRetry, int $$changed, Composer $composer, int $force) {
/*    */     AcceptLicenseInBrowser($onAccept, $onRetry, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\components\RequireLicenseAcceptanceKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */