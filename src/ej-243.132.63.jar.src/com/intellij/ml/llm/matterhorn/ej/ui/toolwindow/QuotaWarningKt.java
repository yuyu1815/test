/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.toolwindow;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.activation.GrazieQuotaWarning;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\032\025\020\000\032\0020\0012\006\020\002\032\0020\003H\007¢\006\002\020\004¨\006\005"}, d2 = {"QuotaWarning", "", "quotaWarning", "Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;Landroidx/compose/runtime/Composer;I)V", "ej-ui"})
/*    */ @SourceDebugExtension({"SMAP\nQuotaWarning.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuotaWarning.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/QuotaWarningKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,49:1\n1225#2,6:50\n1225#2,6:56\n1225#2,6:62\n1225#2,6:68\n1225#2,6:74\n*S KotlinDebug\n*F\n+ 1 QuotaWarning.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/QuotaWarningKt\n*L\n20#1:50,6\n24#1:56,6\n34#1:62,6\n36#1:68,6\n40#1:74,6\n*E\n"})
/*    */ public final class QuotaWarningKt
/*    */ {
/*    */   private static final Unit QuotaWarning$lambda$1$lambda$0(GrazieQuotaWarning $quotaWarning) {
/* 21 */     $quotaWarning.getOnUpgradeLicense().invoke();
/* 22 */     return Unit.INSTANCE;
/*    */   } @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public static final void QuotaWarning(@NotNull GrazieQuotaWarning quotaWarning, @Nullable Composer $composer, int $changed) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'quotaWarning'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: ldc -630940879
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
/*    */     //   55: ifne -> 942
/*    */     //   58: invokestatic isTraceInProgress : ()Z
/*    */     //   61: ifeq -> 73
/*    */     //   64: ldc -630940879
/*    */     //   66: iload_3
/*    */     //   67: iconst_m1
/*    */     //   68: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.QuotaWarning (QuotaWarning.kt:12)'
/*    */     //   70: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   73: aload_0
/*    */     //   74: invokevirtual getHideWarning : ()Lkotlinx/coroutines/flow/StateFlow;
/*    */     //   77: aconst_null
/*    */     //   78: aload_1
/*    */     //   79: iconst_0
/*    */     //   80: iconst_1
/*    */     //   81: invokestatic collectAsState : (Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*    */     //   84: astore #4
/*    */     //   86: aload #4
/*    */     //   88: invokeinterface getValue : ()Ljava/lang/Object;
/*    */     //   93: checkcast java/lang/Boolean
/*    */     //   96: invokevirtual booleanValue : ()Z
/*    */     //   99: ifne -> 930
/*    */     //   102: aload_0
/*    */     //   103: invokevirtual isOver : ()Z
/*    */     //   106: ifeq -> 436
/*    */     //   109: aload_1
/*    */     //   110: ldc 1373343825
/*    */     //   112: invokeinterface startReplaceGroup : (I)V
/*    */     //   117: aconst_null
/*    */     //   118: ldc 'The data volume of your license has finished.'
/*    */     //   120: aload_0
/*    */     //   121: invokevirtual getSuggestUpgrade : ()Z
/*    */     //   124: ifeq -> 275
/*    */     //   127: aload_1
/*    */     //   128: ldc 1373481279
/*    */     //   130: invokeinterface startReplaceGroup : (I)V
/*    */     //   135: ldc 'Upgrade your License'
/*    */     //   137: aload_1
/*    */     //   138: ldc -648429490
/*    */     //   140: invokeinterface startReplaceGroup : (I)V
/*    */     //   145: aload_1
/*    */     //   146: astore #7
/*    */     //   148: aload_1
/*    */     //   149: aload_0
/*    */     //   150: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   155: istore #8
/*    */     //   157: iconst_0
/*    */     //   158: istore #9
/*    */     //   160: aload #7
/*    */     //   162: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   167: astore #10
/*    */     //   169: iconst_0
/*    */     //   170: istore #11
/*    */     //   172: iload #8
/*    */     //   174: ifne -> 188
/*    */     //   177: aload #10
/*    */     //   179: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   182: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   185: if_acmpne -> 229
/*    */     //   188: astore #19
/*    */     //   190: astore #16
/*    */     //   192: astore #15
/*    */     //   194: iconst_0
/*    */     //   195: istore #12
/*    */     //   197: aload_0
/*    */     //   198: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;)Lkotlin/jvm/functions/Function0;
/*    */     //   203: astore #20
/*    */     //   205: aload #15
/*    */     //   207: aload #16
/*    */     //   209: aload #19
/*    */     //   211: aload #20
/*    */     //   213: astore #13
/*    */     //   215: aload #7
/*    */     //   217: aload #13
/*    */     //   219: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   224: aload #13
/*    */     //   226: goto -> 231
/*    */     //   229: aload #10
/*    */     //   231: nop
/*    */     //   232: nop
/*    */     //   233: nop
/*    */     //   234: checkcast kotlin/jvm/functions/Function0
/*    */     //   237: astore #6
/*    */     //   239: aload_1
/*    */     //   240: invokeinterface endReplaceGroup : ()V
/*    */     //   245: aload #6
/*    */     //   247: astore #23
/*    */     //   249: astore #24
/*    */     //   251: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action
/*    */     //   254: dup
/*    */     //   255: aload #24
/*    */     //   257: aload #23
/*    */     //   259: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*    */     //   262: astore #5
/*    */     //   264: aload_1
/*    */     //   265: invokeinterface endReplaceGroup : ()V
/*    */     //   270: aload #5
/*    */     //   272: goto -> 420
/*    */     //   275: aload_1
/*    */     //   276: ldc 1373596134
/*    */     //   278: invokeinterface startReplaceGroup : (I)V
/*    */     //   283: ldc 'Contact Support'
/*    */     //   285: aload_1
/*    */     //   286: ldc -648425941
/*    */     //   288: invokeinterface startReplaceGroup : (I)V
/*    */     //   293: aload_1
/*    */     //   294: astore #7
/*    */     //   296: aload_1
/*    */     //   297: aload_0
/*    */     //   298: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   303: istore #8
/*    */     //   305: iconst_0
/*    */     //   306: istore #9
/*    */     //   308: aload #7
/*    */     //   310: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   315: astore #10
/*    */     //   317: iconst_0
/*    */     //   318: istore #11
/*    */     //   320: iload #8
/*    */     //   322: ifne -> 336
/*    */     //   325: aload #10
/*    */     //   327: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   330: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   333: if_acmpne -> 377
/*    */     //   336: astore #19
/*    */     //   338: astore #16
/*    */     //   340: astore #15
/*    */     //   342: iconst_0
/*    */     //   343: istore #12
/*    */     //   345: aload_0
/*    */     //   346: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;)Lkotlin/jvm/functions/Function0;
/*    */     //   351: astore #20
/*    */     //   353: aload #15
/*    */     //   355: aload #16
/*    */     //   357: aload #19
/*    */     //   359: aload #20
/*    */     //   361: astore #13
/*    */     //   363: aload #7
/*    */     //   365: aload #13
/*    */     //   367: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   372: aload #13
/*    */     //   374: goto -> 379
/*    */     //   377: aload #10
/*    */     //   379: nop
/*    */     //   380: nop
/*    */     //   381: nop
/*    */     //   382: checkcast kotlin/jvm/functions/Function0
/*    */     //   385: astore #6
/*    */     //   387: aload_1
/*    */     //   388: invokeinterface endReplaceGroup : ()V
/*    */     //   393: aload #6
/*    */     //   395: astore #25
/*    */     //   397: astore #26
/*    */     //   399: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action
/*    */     //   402: dup
/*    */     //   403: aload #26
/*    */     //   405: aload #25
/*    */     //   407: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*    */     //   410: astore #5
/*    */     //   412: aload_1
/*    */     //   413: invokeinterface endReplaceGroup : ()V
/*    */     //   418: aload #5
/*    */     //   420: aload_1
/*    */     //   421: bipush #48
/*    */     //   423: iconst_1
/*    */     //   424: invokestatic JunieErrorBanner : (Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;Landroidx/compose/runtime/Composer;II)V
/*    */     //   427: aload_1
/*    */     //   428: invokeinterface endReplaceGroup : ()V
/*    */     //   433: goto -> 930
/*    */     //   436: aload_1
/*    */     //   437: ldc 1373730178
/*    */     //   439: invokeinterface startReplaceGroup : (I)V
/*    */     //   444: aconst_null
/*    */     //   445: ldc 'The data volume of your license is almost finished.'
/*    */     //   447: iconst_2
/*    */     //   448: anewarray com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action
/*    */     //   451: astore #5
/*    */     //   453: aload #5
/*    */     //   455: iconst_0
/*    */     //   456: ldc 'Hide'
/*    */     //   458: aload_1
/*    */     //   459: ldc -648418251
/*    */     //   461: invokeinterface startReplaceGroup : (I)V
/*    */     //   466: aload_1
/*    */     //   467: astore #7
/*    */     //   469: aload_1
/*    */     //   470: aload_0
/*    */     //   471: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   476: istore #8
/*    */     //   478: iconst_0
/*    */     //   479: istore #9
/*    */     //   481: aload #7
/*    */     //   483: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   488: astore #10
/*    */     //   490: iconst_0
/*    */     //   491: istore #11
/*    */     //   493: iload #8
/*    */     //   495: ifne -> 509
/*    */     //   498: aload #10
/*    */     //   500: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   503: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   506: if_acmpne -> 558
/*    */     //   509: astore #21
/*    */     //   511: istore #18
/*    */     //   513: astore #17
/*    */     //   515: astore #16
/*    */     //   517: astore #15
/*    */     //   519: iconst_0
/*    */     //   520: istore #12
/*    */     //   522: aload_0
/*    */     //   523: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;)Lkotlin/jvm/functions/Function0;
/*    */     //   528: astore #22
/*    */     //   530: aload #15
/*    */     //   532: aload #16
/*    */     //   534: aload #17
/*    */     //   536: iload #18
/*    */     //   538: aload #21
/*    */     //   540: aload #22
/*    */     //   542: astore #13
/*    */     //   544: aload #7
/*    */     //   546: aload #13
/*    */     //   548: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   553: aload #13
/*    */     //   555: goto -> 560
/*    */     //   558: aload #10
/*    */     //   560: nop
/*    */     //   561: nop
/*    */     //   562: nop
/*    */     //   563: checkcast kotlin/jvm/functions/Function0
/*    */     //   566: astore #6
/*    */     //   568: aload_1
/*    */     //   569: invokeinterface endReplaceGroup : ()V
/*    */     //   574: aload #6
/*    */     //   576: astore #27
/*    */     //   578: astore #28
/*    */     //   580: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action
/*    */     //   583: dup
/*    */     //   584: aload #28
/*    */     //   586: aload #27
/*    */     //   588: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*    */     //   591: aastore
/*    */     //   592: aload #5
/*    */     //   594: iconst_1
/*    */     //   595: aload_0
/*    */     //   596: invokevirtual getSuggestUpgrade : ()Z
/*    */     //   599: ifeq -> 758
/*    */     //   602: aload_1
/*    */     //   603: ldc 1373949751
/*    */     //   605: invokeinterface startReplaceGroup : (I)V
/*    */     //   610: ldc 'Upgrade your License'
/*    */     //   612: aload_1
/*    */     //   613: ldc -648414318
/*    */     //   615: invokeinterface startReplaceGroup : (I)V
/*    */     //   620: aload_1
/*    */     //   621: astore #8
/*    */     //   623: aload_1
/*    */     //   624: aload_0
/*    */     //   625: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   630: istore #9
/*    */     //   632: iconst_0
/*    */     //   633: istore #10
/*    */     //   635: aload #8
/*    */     //   637: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   642: astore #11
/*    */     //   644: iconst_0
/*    */     //   645: istore #12
/*    */     //   647: iload #9
/*    */     //   649: ifne -> 663
/*    */     //   652: aload #11
/*    */     //   654: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   657: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   660: if_acmpne -> 712
/*    */     //   663: astore #21
/*    */     //   665: istore #18
/*    */     //   667: astore #17
/*    */     //   669: astore #16
/*    */     //   671: astore #15
/*    */     //   673: iconst_0
/*    */     //   674: istore #13
/*    */     //   676: aload_0
/*    */     //   677: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;)Lkotlin/jvm/functions/Function0;
/*    */     //   682: astore #22
/*    */     //   684: aload #15
/*    */     //   686: aload #16
/*    */     //   688: aload #17
/*    */     //   690: iload #18
/*    */     //   692: aload #21
/*    */     //   694: aload #22
/*    */     //   696: astore #14
/*    */     //   698: aload #8
/*    */     //   700: aload #14
/*    */     //   702: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   707: aload #14
/*    */     //   709: goto -> 714
/*    */     //   712: aload #11
/*    */     //   714: nop
/*    */     //   715: nop
/*    */     //   716: nop
/*    */     //   717: checkcast kotlin/jvm/functions/Function0
/*    */     //   720: astore #7
/*    */     //   722: aload_1
/*    */     //   723: invokeinterface endReplaceGroup : ()V
/*    */     //   728: aload #7
/*    */     //   730: astore #29
/*    */     //   732: astore #30
/*    */     //   734: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action
/*    */     //   737: dup
/*    */     //   738: aload #30
/*    */     //   740: aload #29
/*    */     //   742: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*    */     //   745: astore #6
/*    */     //   747: aload_1
/*    */     //   748: invokeinterface endReplaceGroup : ()V
/*    */     //   753: aload #6
/*    */     //   755: goto -> 911
/*    */     //   758: aload_1
/*    */     //   759: ldc 1374072511
/*    */     //   761: invokeinterface startReplaceGroup : (I)V
/*    */     //   766: ldc 'Contact Support'
/*    */     //   768: aload_1
/*    */     //   769: ldc -648410513
/*    */     //   771: invokeinterface startReplaceGroup : (I)V
/*    */     //   776: aload_1
/*    */     //   777: astore #8
/*    */     //   779: aload_1
/*    */     //   780: aload_0
/*    */     //   781: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   786: istore #9
/*    */     //   788: iconst_0
/*    */     //   789: istore #10
/*    */     //   791: aload #8
/*    */     //   793: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   798: astore #11
/*    */     //   800: iconst_0
/*    */     //   801: istore #12
/*    */     //   803: iload #9
/*    */     //   805: ifne -> 819
/*    */     //   808: aload #11
/*    */     //   810: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   813: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   816: if_acmpne -> 868
/*    */     //   819: astore #21
/*    */     //   821: istore #18
/*    */     //   823: astore #17
/*    */     //   825: astore #16
/*    */     //   827: astore #15
/*    */     //   829: iconst_0
/*    */     //   830: istore #13
/*    */     //   832: aload_0
/*    */     //   833: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;)Lkotlin/jvm/functions/Function0;
/*    */     //   838: astore #22
/*    */     //   840: aload #15
/*    */     //   842: aload #16
/*    */     //   844: aload #17
/*    */     //   846: iload #18
/*    */     //   848: aload #21
/*    */     //   850: aload #22
/*    */     //   852: astore #14
/*    */     //   854: aload #8
/*    */     //   856: aload #14
/*    */     //   858: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   863: aload #14
/*    */     //   865: goto -> 870
/*    */     //   868: aload #11
/*    */     //   870: nop
/*    */     //   871: nop
/*    */     //   872: nop
/*    */     //   873: checkcast kotlin/jvm/functions/Function0
/*    */     //   876: astore #7
/*    */     //   878: aload_1
/*    */     //   879: invokeinterface endReplaceGroup : ()V
/*    */     //   884: aload #7
/*    */     //   886: astore #31
/*    */     //   888: astore #32
/*    */     //   890: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action
/*    */     //   893: dup
/*    */     //   894: aload #32
/*    */     //   896: aload #31
/*    */     //   898: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*    */     //   901: astore #6
/*    */     //   903: aload_1
/*    */     //   904: invokeinterface endReplaceGroup : ()V
/*    */     //   909: aload #6
/*    */     //   911: aastore
/*    */     //   912: aload #5
/*    */     //   914: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
/*    */     //   917: aload_1
/*    */     //   918: bipush #48
/*    */     //   920: iconst_1
/*    */     //   921: invokestatic JunieWarningBanner : (Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V
/*    */     //   924: aload_1
/*    */     //   925: invokeinterface endReplaceGroup : ()V
/*    */     //   930: invokestatic isTraceInProgress : ()Z
/*    */     //   933: ifeq -> 948
/*    */     //   936: invokestatic traceEventEnd : ()V
/*    */     //   939: goto -> 948
/*    */     //   942: aload_1
/*    */     //   943: invokeinterface skipToGroupEnd : ()V
/*    */     //   948: aload_1
/*    */     //   949: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   954: dup
/*    */     //   955: ifnull -> 973
/*    */     //   958: aload_0
/*    */     //   959: iload_2
/*    */     //   960: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;I)Lkotlin/jvm/functions/Function2;
/*    */     //   965: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   970: goto -> 974
/*    */     //   973: pop
/*    */     //   974: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 6
/*    */     //   #14	-> 73
/*    */     //   #15	-> 86
/*    */     //   #16	-> 102
/*    */     //   #18	-> 118
/*    */     //   #19	-> 120
/*    */     //   #20	-> 135
/*    */     //   #50	-> 160
/*    */     //   #51	-> 172
/*    */     //   #52	-> 188
/*    */     //   #20	-> 197
/*    */     //   #52	-> 213
/*    */     //   #53	-> 215
/*    */     //   #54	-> 224
/*    */     //   #55	-> 229
/*    */     //   #51	-> 231
/*    */     //   #50	-> 232
/*    */     //   #50	-> 233
/*    */     //   #20	-> 234
/*    */     //   #19	-> 262
/*    */     //   #23	-> 275
/*    */     //   #24	-> 283
/*    */     //   #56	-> 308
/*    */     //   #57	-> 320
/*    */     //   #58	-> 336
/*    */     //   #24	-> 345
/*    */     //   #58	-> 361
/*    */     //   #59	-> 363
/*    */     //   #60	-> 372
/*    */     //   #61	-> 377
/*    */     //   #57	-> 379
/*    */     //   #56	-> 380
/*    */     //   #56	-> 381
/*    */     //   #24	-> 382
/*    */     //   #23	-> 410
/*    */     //   #17	-> 424
/*    */     //   #16	-> 427
/*    */     //   #30	-> 436
/*    */     //   #32	-> 445
/*    */     //   #34	-> 447
/*    */     //   #62	-> 481
/*    */     //   #63	-> 493
/*    */     //   #64	-> 509
/*    */     //   #34	-> 522
/*    */     //   #64	-> 542
/*    */     //   #65	-> 544
/*    */     //   #66	-> 553
/*    */     //   #67	-> 558
/*    */     //   #63	-> 560
/*    */     //   #62	-> 561
/*    */     //   #62	-> 562
/*    */     //   #34	-> 563
/*    */     //   #35	-> 595
/*    */     //   #36	-> 610
/*    */     //   #68	-> 635
/*    */     //   #69	-> 647
/*    */     //   #70	-> 663
/*    */     //   #36	-> 676
/*    */     //   #70	-> 696
/*    */     //   #71	-> 698
/*    */     //   #72	-> 707
/*    */     //   #73	-> 712
/*    */     //   #69	-> 714
/*    */     //   #68	-> 715
/*    */     //   #68	-> 716
/*    */     //   #36	-> 717
/*    */     //   #35	-> 745
/*    */     //   #39	-> 758
/*    */     //   #40	-> 766
/*    */     //   #74	-> 791
/*    */     //   #75	-> 803
/*    */     //   #76	-> 819
/*    */     //   #40	-> 832
/*    */     //   #76	-> 852
/*    */     //   #77	-> 854
/*    */     //   #78	-> 863
/*    */     //   #79	-> 868
/*    */     //   #75	-> 870
/*    */     //   #74	-> 871
/*    */     //   #74	-> 872
/*    */     //   #40	-> 873
/*    */     //   #39	-> 901
/*    */     //   #34	-> 912
/*    */     //   #33	-> 914
/*    */     //   #31	-> 921
/*    */     //   #30	-> 924
/*    */     //   #49	-> 942
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   197	6	12	$i$a$-cache-QuotaWarningKt$QuotaWarning$1	I
/*    */     //   215	11	13	value$iv	Ljava/lang/Object;
/*    */     //   172	60	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   169	63	10	it$iv	Ljava/lang/Object;
/*    */     //   160	74	9	$i$f$cache	I
/*    */     //   157	77	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   157	77	8	invalid$iv	Z
/*    */     //   345	6	12	$i$a$-cache-QuotaWarningKt$QuotaWarning$2	I
/*    */     //   363	11	13	value$iv	Ljava/lang/Object;
/*    */     //   320	60	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   317	63	10	it$iv	Ljava/lang/Object;
/*    */     //   308	74	9	$i$f$cache	I
/*    */     //   305	77	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   305	77	8	invalid$iv	Z
/*    */     //   522	6	12	$i$a$-cache-QuotaWarningKt$QuotaWarning$3	I
/*    */     //   544	11	13	value$iv	Ljava/lang/Object;
/*    */     //   493	68	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   490	71	10	it$iv	Ljava/lang/Object;
/*    */     //   481	82	9	$i$f$cache	I
/*    */     //   478	85	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   478	85	8	invalid$iv	Z
/*    */     //   676	6	13	$i$a$-cache-QuotaWarningKt$QuotaWarning$4	I
/*    */     //   698	11	14	value$iv	Ljava/lang/Object;
/*    */     //   647	68	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   644	71	11	it$iv	Ljava/lang/Object;
/*    */     //   635	82	10	$i$f$cache	I
/*    */     //   632	85	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   632	85	9	invalid$iv	Z
/*    */     //   832	6	13	$i$a$-cache-QuotaWarningKt$QuotaWarning$5	I
/*    */     //   854	11	14	value$iv	Ljava/lang/Object;
/*    */     //   803	68	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   800	71	11	it$iv	Ljava/lang/Object;
/*    */     //   791	82	10	$i$f$cache	I
/*    */     //   788	85	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   788	85	9	invalid$iv	Z
/*    */     //   86	853	4	hideWarning	Landroidx/compose/runtime/State;
/*    */     //   17	958	3	$dirty	I
/*    */     //   0	975	0	quotaWarning	Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;
/*    */     //   0	975	1	$composer	Landroidx/compose/runtime/Composer;
/* 25 */     //   0	975	2	$changed	I } private static final Unit QuotaWarning$lambda$3$lambda$2(GrazieQuotaWarning $quotaWarning) { $quotaWarning.getOnOpenSupport().invoke();
/* 26 */     return Unit.INSTANCE; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final Unit QuotaWarning$lambda$5$lambda$4(GrazieQuotaWarning $quotaWarning) {
/* 34 */     $quotaWarning.getDoHideWarning().invoke(); return Unit.INSTANCE;
/*    */   }
/*    */   private static final Unit QuotaWarning$lambda$7$lambda$6(GrazieQuotaWarning $quotaWarning) {
/* 37 */     $quotaWarning.getOnUpgradeLicense().invoke();
/* 38 */     return Unit.INSTANCE;
/*    */   }
/*    */   private static final Unit QuotaWarning$lambda$9$lambda$8(GrazieQuotaWarning $quotaWarning) {
/* 41 */     $quotaWarning.getOnOpenSupport().invoke();
/* 42 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit QuotaWarning$lambda$10(GrazieQuotaWarning $quotaWarning, int $$changed, Composer $composer, int $force) {
/*    */     QuotaWarning($quotaWarning, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\toolwindow\QuotaWarningKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */