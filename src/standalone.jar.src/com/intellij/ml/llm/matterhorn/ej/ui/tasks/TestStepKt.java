/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks;
/*     */ 
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.ColumnScope;
/*     */ import androidx.compose.foundation.layout.RowScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.icon.PathIconKey;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\0002\n\000\n\002\020\002\n\000\n\002\020\013\n\000\n\002\020\016\n\002\b\002\n\002\020\b\n\002\b\002\n\002\020 \n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\032\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0052\006\020\007\032\0020\b2\006\020\t\032\0020\b2\016\b\002\020\n\032\b\022\004\022\0020\0050\0132\024\b\002\020\f\032\016\022\004\022\0020\b\022\004\022\0020\0010\r2\020\b\002\020\016\032\n\022\004\022\0020\001\030\0010\0172\020\b\002\020\020\032\n\022\004\022\0020\001\030\0010\017H\007¢\006\002\020\021¨\006\022"}, d2 = {"TestStep", "", "isWaitingForApproval", "", "command", "", "description", "successfulTests", "", "failedTests", "actionNames", "", "onActionClick", "Lkotlin/Function1;", "onApproveActionClick", "Lkotlin/Function0;", "onSkipActionClick", "(ZLjava/lang/String;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "standalone"})
/*     */ @SourceDebugExtension({"SMAP\nTestStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/TestStepKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,68:1\n1225#2,6:69\n*S KotlinDebug\n*F\n+ 1 TestStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/TestStepKt\n*L\n27#1:69,6\n*E\n"})
/*     */ public final class TestStepKt {
/*  27 */   private static final Unit TestStep$lambda$1$lambda$0(int it) { return Unit.INSTANCE; } private static final Unit TestStep$lambda$2(boolean $isWaitingForApproval, String $command, String $description, int $successfulTests, int $failedTests, List<String> $actionNames, Function1<? super Integer, Unit> $onActionClick, Function0<Unit> $onApproveActionClick, Function0<Unit> $onSkipActionClick, int $$changed, int $$default, Composer $composer, int $force) { TestStep($isWaitingForApproval, $command, $description, $successfulTests, $failedTests, $actionNames, $onActionClick, $onApproveActionClick, $onSkipActionClick, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE; } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void TestStep(boolean isWaitingForApproval, @NotNull String command, @NotNull String description, int successfulTests, int failedTests, @Nullable List actionNames, @Nullable Function1 onActionClick, @Nullable Function0 onApproveActionClick, @Nullable Function0 onSkipActionClick, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'command'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'description'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload #9
/*     */     //   14: ldc 908918302
/*     */     //   16: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   21: astore #9
/*     */     //   23: iload #10
/*     */     //   25: istore #12
/*     */     //   27: iload #11
/*     */     //   29: iconst_1
/*     */     //   30: iand
/*     */     //   31: ifeq -> 44
/*     */     //   34: iload #12
/*     */     //   36: bipush #6
/*     */     //   38: ior
/*     */     //   39: istore #12
/*     */     //   41: goto -> 73
/*     */     //   44: iload #10
/*     */     //   46: bipush #6
/*     */     //   48: iand
/*     */     //   49: ifne -> 73
/*     */     //   52: iload #12
/*     */     //   54: aload #9
/*     */     //   56: iload_0
/*     */     //   57: invokeinterface changed : (Z)Z
/*     */     //   62: ifeq -> 69
/*     */     //   65: iconst_4
/*     */     //   66: goto -> 70
/*     */     //   69: iconst_2
/*     */     //   70: ior
/*     */     //   71: istore #12
/*     */     //   73: iload #11
/*     */     //   75: iconst_2
/*     */     //   76: iand
/*     */     //   77: ifeq -> 90
/*     */     //   80: iload #12
/*     */     //   82: bipush #48
/*     */     //   84: ior
/*     */     //   85: istore #12
/*     */     //   87: goto -> 121
/*     */     //   90: iload #10
/*     */     //   92: bipush #48
/*     */     //   94: iand
/*     */     //   95: ifne -> 121
/*     */     //   98: iload #12
/*     */     //   100: aload #9
/*     */     //   102: aload_1
/*     */     //   103: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   108: ifeq -> 116
/*     */     //   111: bipush #32
/*     */     //   113: goto -> 118
/*     */     //   116: bipush #16
/*     */     //   118: ior
/*     */     //   119: istore #12
/*     */     //   121: iload #11
/*     */     //   123: iconst_4
/*     */     //   124: iand
/*     */     //   125: ifeq -> 139
/*     */     //   128: iload #12
/*     */     //   130: sipush #384
/*     */     //   133: ior
/*     */     //   134: istore #12
/*     */     //   136: goto -> 173
/*     */     //   139: iload #10
/*     */     //   141: sipush #384
/*     */     //   144: iand
/*     */     //   145: ifne -> 173
/*     */     //   148: iload #12
/*     */     //   150: aload #9
/*     */     //   152: aload_2
/*     */     //   153: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   158: ifeq -> 167
/*     */     //   161: sipush #256
/*     */     //   164: goto -> 170
/*     */     //   167: sipush #128
/*     */     //   170: ior
/*     */     //   171: istore #12
/*     */     //   173: iload #11
/*     */     //   175: bipush #8
/*     */     //   177: iand
/*     */     //   178: ifeq -> 192
/*     */     //   181: iload #12
/*     */     //   183: sipush #3072
/*     */     //   186: ior
/*     */     //   187: istore #12
/*     */     //   189: goto -> 226
/*     */     //   192: iload #10
/*     */     //   194: sipush #3072
/*     */     //   197: iand
/*     */     //   198: ifne -> 226
/*     */     //   201: iload #12
/*     */     //   203: aload #9
/*     */     //   205: iload_3
/*     */     //   206: invokeinterface changed : (I)Z
/*     */     //   211: ifeq -> 220
/*     */     //   214: sipush #2048
/*     */     //   217: goto -> 223
/*     */     //   220: sipush #1024
/*     */     //   223: ior
/*     */     //   224: istore #12
/*     */     //   226: iload #11
/*     */     //   228: bipush #16
/*     */     //   230: iand
/*     */     //   231: ifeq -> 245
/*     */     //   234: iload #12
/*     */     //   236: sipush #24576
/*     */     //   239: ior
/*     */     //   240: istore #12
/*     */     //   242: goto -> 280
/*     */     //   245: iload #10
/*     */     //   247: sipush #24576
/*     */     //   250: iand
/*     */     //   251: ifne -> 280
/*     */     //   254: iload #12
/*     */     //   256: aload #9
/*     */     //   258: iload #4
/*     */     //   260: invokeinterface changed : (I)Z
/*     */     //   265: ifeq -> 274
/*     */     //   268: sipush #16384
/*     */     //   271: goto -> 277
/*     */     //   274: sipush #8192
/*     */     //   277: ior
/*     */     //   278: istore #12
/*     */     //   280: iload #11
/*     */     //   282: bipush #32
/*     */     //   284: iand
/*     */     //   285: ifeq -> 298
/*     */     //   288: iload #12
/*     */     //   290: ldc 196608
/*     */     //   292: ior
/*     */     //   293: istore #12
/*     */     //   295: goto -> 330
/*     */     //   298: iload #10
/*     */     //   300: ldc 196608
/*     */     //   302: iand
/*     */     //   303: ifne -> 330
/*     */     //   306: iload #12
/*     */     //   308: aload #9
/*     */     //   310: aload #5
/*     */     //   312: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   317: ifeq -> 325
/*     */     //   320: ldc 131072
/*     */     //   322: goto -> 327
/*     */     //   325: ldc 65536
/*     */     //   327: ior
/*     */     //   328: istore #12
/*     */     //   330: iload #11
/*     */     //   332: bipush #64
/*     */     //   334: iand
/*     */     //   335: ifeq -> 348
/*     */     //   338: iload #12
/*     */     //   340: ldc 1572864
/*     */     //   342: ior
/*     */     //   343: istore #12
/*     */     //   345: goto -> 380
/*     */     //   348: iload #10
/*     */     //   350: ldc 1572864
/*     */     //   352: iand
/*     */     //   353: ifne -> 380
/*     */     //   356: iload #12
/*     */     //   358: aload #9
/*     */     //   360: aload #6
/*     */     //   362: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   367: ifeq -> 375
/*     */     //   370: ldc 1048576
/*     */     //   372: goto -> 377
/*     */     //   375: ldc 524288
/*     */     //   377: ior
/*     */     //   378: istore #12
/*     */     //   380: iload #11
/*     */     //   382: sipush #128
/*     */     //   385: iand
/*     */     //   386: ifeq -> 399
/*     */     //   389: iload #12
/*     */     //   391: ldc 12582912
/*     */     //   393: ior
/*     */     //   394: istore #12
/*     */     //   396: goto -> 431
/*     */     //   399: iload #10
/*     */     //   401: ldc 12582912
/*     */     //   403: iand
/*     */     //   404: ifne -> 431
/*     */     //   407: iload #12
/*     */     //   409: aload #9
/*     */     //   411: aload #7
/*     */     //   413: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   418: ifeq -> 426
/*     */     //   421: ldc 8388608
/*     */     //   423: goto -> 428
/*     */     //   426: ldc 4194304
/*     */     //   428: ior
/*     */     //   429: istore #12
/*     */     //   431: iload #11
/*     */     //   433: sipush #256
/*     */     //   436: iand
/*     */     //   437: ifeq -> 450
/*     */     //   440: iload #12
/*     */     //   442: ldc 100663296
/*     */     //   444: ior
/*     */     //   445: istore #12
/*     */     //   447: goto -> 482
/*     */     //   450: iload #10
/*     */     //   452: ldc 100663296
/*     */     //   454: iand
/*     */     //   455: ifne -> 482
/*     */     //   458: iload #12
/*     */     //   460: aload #9
/*     */     //   462: aload #8
/*     */     //   464: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   469: ifeq -> 477
/*     */     //   472: ldc 67108864
/*     */     //   474: goto -> 479
/*     */     //   477: ldc 33554432
/*     */     //   479: ior
/*     */     //   480: istore #12
/*     */     //   482: iload #12
/*     */     //   484: ldc 38347923
/*     */     //   486: iand
/*     */     //   487: ldc 38347922
/*     */     //   489: if_icmpne -> 502
/*     */     //   492: aload #9
/*     */     //   494: invokeinterface getSkipping : ()Z
/*     */     //   499: ifne -> 767
/*     */     //   502: iload #11
/*     */     //   504: bipush #32
/*     */     //   506: iand
/*     */     //   507: ifeq -> 515
/*     */     //   510: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   513: astore #5
/*     */     //   515: iload #11
/*     */     //   517: bipush #64
/*     */     //   519: iand
/*     */     //   520: ifeq -> 610
/*     */     //   523: aload #9
/*     */     //   525: ldc -1621864778
/*     */     //   527: invokeinterface startReplaceGroup : (I)V
/*     */     //   532: aload #9
/*     */     //   534: astore #14
/*     */     //   536: iconst_0
/*     */     //   537: istore #15
/*     */     //   539: iconst_0
/*     */     //   540: istore #16
/*     */     //   542: aload #14
/*     */     //   544: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   549: astore #17
/*     */     //   551: iconst_0
/*     */     //   552: istore #18
/*     */     //   554: aload #17
/*     */     //   556: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   559: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   562: if_acmpne -> 589
/*     */     //   565: iconst_0
/*     */     //   566: istore #19
/*     */     //   568: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   573: astore #19
/*     */     //   575: aload #14
/*     */     //   577: aload #19
/*     */     //   579: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   584: aload #19
/*     */     //   586: goto -> 591
/*     */     //   589: aload #17
/*     */     //   591: nop
/*     */     //   592: nop
/*     */     //   593: nop
/*     */     //   594: checkcast kotlin/jvm/functions/Function1
/*     */     //   597: astore #13
/*     */     //   599: aload #9
/*     */     //   601: invokeinterface endReplaceGroup : ()V
/*     */     //   606: aload #13
/*     */     //   608: astore #6
/*     */     //   610: iload #11
/*     */     //   612: sipush #128
/*     */     //   615: iand
/*     */     //   616: ifeq -> 622
/*     */     //   619: aconst_null
/*     */     //   620: astore #7
/*     */     //   622: iload #11
/*     */     //   624: sipush #256
/*     */     //   627: iand
/*     */     //   628: ifeq -> 634
/*     */     //   631: aconst_null
/*     */     //   632: astore #8
/*     */     //   634: invokestatic isTraceInProgress : ()Z
/*     */     //   637: ifeq -> 650
/*     */     //   640: ldc 908918302
/*     */     //   642: iload #12
/*     */     //   644: iconst_m1
/*     */     //   645: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.TestStep (TestStep.kt:29)'
/*     */     //   647: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   650: aconst_null
/*     */     //   651: ldc 1269292445
/*     */     //   653: iconst_1
/*     */     //   654: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/TestStepKt$TestStep$2
/*     */     //   657: dup
/*     */     //   658: iload_0
/*     */     //   659: invokespecial <init> : (Z)V
/*     */     //   662: aload #9
/*     */     //   664: bipush #54
/*     */     //   666: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   669: checkcast kotlin/jvm/functions/Function3
/*     */     //   672: ldc 834846091
/*     */     //   674: iconst_1
/*     */     //   675: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/TestStepKt$TestStep$3
/*     */     //   678: dup
/*     */     //   679: iload_3
/*     */     //   680: iload #4
/*     */     //   682: invokespecial <init> : (II)V
/*     */     //   685: aload #9
/*     */     //   687: bipush #54
/*     */     //   689: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   692: checkcast kotlin/jvm/functions/Function3
/*     */     //   695: aconst_null
/*     */     //   696: ldc 191684321
/*     */     //   698: iconst_1
/*     */     //   699: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/TestStepKt$TestStep$4
/*     */     //   702: dup
/*     */     //   703: aload_1
/*     */     //   704: aload #5
/*     */     //   706: aload #6
/*     */     //   708: aload_2
/*     */     //   709: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V
/*     */     //   712: aload #9
/*     */     //   714: bipush #54
/*     */     //   716: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   719: checkcast kotlin/jvm/functions/Function3
/*     */     //   722: ldc 1690253800
/*     */     //   724: iconst_1
/*     */     //   725: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/TestStepKt$TestStep$5
/*     */     //   728: dup
/*     */     //   729: aload #7
/*     */     //   731: aload #8
/*     */     //   733: invokespecial <init> : (Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
/*     */     //   736: aload #9
/*     */     //   738: bipush #54
/*     */     //   740: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   743: checkcast kotlin/jvm/functions/Function3
/*     */     //   746: aload #9
/*     */     //   748: ldc 221616
/*     */     //   750: bipush #9
/*     */     //   752: invokestatic StepCard : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   755: invokestatic isTraceInProgress : ()Z
/*     */     //   758: ifeq -> 774
/*     */     //   761: invokestatic traceEventEnd : ()V
/*     */     //   764: goto -> 774
/*     */     //   767: aload #9
/*     */     //   769: invokeinterface skipToGroupEnd : ()V
/*     */     //   774: aload #9
/*     */     //   776: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   781: dup
/*     */     //   782: ifnull -> 816
/*     */     //   785: iload_0
/*     */     //   786: aload_1
/*     */     //   787: aload_2
/*     */     //   788: iload_3
/*     */     //   789: iload #4
/*     */     //   791: aload #5
/*     */     //   793: aload #6
/*     */     //   795: aload #7
/*     */     //   797: aload #8
/*     */     //   799: iload #10
/*     */     //   801: iload #11
/*     */     //   803: <illegal opcode> invoke : (ZLjava/lang/String;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;II)Lkotlin/jvm/functions/Function2;
/*     */     //   808: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   813: goto -> 817
/*     */     //   816: pop
/*     */     //   817: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #30	-> 12
/*     */     //   #26	-> 510
/*     */     //   #27	-> 523
/*     */     //   #69	-> 542
/*     */     //   #70	-> 554
/*     */     //   #71	-> 565
/*     */     //   #71	-> 573
/*     */     //   #72	-> 575
/*     */     //   #73	-> 584
/*     */     //   #74	-> 589
/*     */     //   #70	-> 591
/*     */     //   #69	-> 592
/*     */     //   #69	-> 593
/*     */     //   #27	-> 594
/*     */     //   #28	-> 619
/*     */     //   #29	-> 631
/*     */     //   #30	-> 647
/*     */     //   #32	-> 651
/*     */     //   #38	-> 672
/*     */     //   #54	-> 696
/*     */     //   #62	-> 722
/*     */     //   #31	-> 752
/*     */     //   #67	-> 767
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   568	5	19	$i$a$-cache-TestStepKt$TestStep$1	I
/*     */     //   575	11	19	value$iv	Ljava/lang/Object;
/*     */     //   554	38	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   551	41	17	it$iv	Ljava/lang/Object;
/*     */     //   542	52	16	$i$f$cache	I
/*     */     //   539	55	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   539	55	15	invalid$iv	Z
/*     */     //   27	791	12	$dirty	I
/*     */     //   0	818	0	isWaitingForApproval	Z
/*     */     //   0	818	1	command	Ljava/lang/String;
/*     */     //   0	818	2	description	Ljava/lang/String;
/*     */     //   0	818	3	successfulTests	I
/*     */     //   0	818	4	failedTests	I
/*     */     //   0	818	5	actionNames	Ljava/util/List;
/*     */     //   0	818	6	onActionClick	Lkotlin/jvm/functions/Function1;
/*     */     //   0	818	7	onApproveActionClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	818	8	onSkipActionClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	818	9	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	818	10	$changed	I } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class TestStepKt$TestStep$2 implements Function3<BoxScope, Composer, Integer, Unit>
/*     */   {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*  33 */     public final void invoke(BoxScope $this$StepCard, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1269292445, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.TestStep.<anonymous> (TestStep.kt:32)"); 
/*  34 */         $composer.startReplaceGroup(-411417568); PathIconKey pathIconKey = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getPauseStateIcon(); $composer.endReplaceGroup(); $composer.startReplaceGroup(-411416422); pathIconKey = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getShowIcon(); $composer.endReplaceGroup(); IconKt.Icon-FHprtrg(this.$isWaitingForApproval ? (IconKey)pathIconKey : (IconKey)pathIconKey, 
/*  35 */             this.$isWaitingForApproval ? "Waiting for approval" : "Tests", null, null, 0L, new org.jetbrains.jewel.ui.painter.PainterHint[0], $composer, PathIconKey.$stable, 28); if (ComposerKt.isTraceInProgress())
/*  36 */           ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*     */        } TestStepKt$TestStep$2(boolean $isWaitingForApproval) {} } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nTestStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/TestStepKt$TestStep$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,68:1\n149#2:69\n99#3:70\n95#3,7:71\n102#3:106\n106#3:110\n79#4,6:78\n86#4,4:93\n90#4,2:103\n94#4:109\n368#5,9:84\n377#5:105\n378#5,2:107\n4034#6,6:97\n*S KotlinDebug\n*F\n+ 1 TestStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/TestStepKt$TestStep$3\n*L\n41#1:69\n39#1:70\n39#1:71,7\n39#1:106\n39#1:110\n39#1:78,6\n39#1:93,4\n39#1:103,2\n39#1:109\n39#1:84,9\n39#1:105\n39#1:107,2\n39#1:97,6\n*E\n"}) static final class TestStepKt$TestStep$3 implements Function3<RowScope, Composer, Integer, Unit> { @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*  39 */     public final void invoke(RowScope $this$StepCard, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(834846091, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.TestStep.<anonymous> (TestStep.kt:38)"); 
/*  40 */         Alignment.Vertical vertical = Alignment.Companion.getCenterVertically();
/*  41 */         int $this$dp$iv = 4, $i$f$getDp = 0; Arrangement.HorizontalOrVertical horizontalOrVertical = Arrangement.INSTANCE.spacedBy-0680j_4(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  69 */             Dp.constructor-impl($this$dp$iv)); $i$f$getDp = this.$successfulTests; int i = this.$failedTests, $changed$iv = 432, $i$f$Row = 0;
/*  70 */         ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
/*  71 */         Modifier modifier$iv = (Modifier)Modifier.Companion;
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  76 */         MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy((Arrangement.Horizontal)horizontalOrVertical, vertical, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/*  77 */         int $i$f$Layout = 0;
/*  78 */         ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/*  79 */         int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/*  80 */         CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/*  81 */         Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
/*     */         
/*  83 */         Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/*  84 */         ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/*  85 */         if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/*  86 */           .startReusableNode();
/*  87 */         if ($composer.getInserting()) { $composer
/*  88 */             .createNode(function0); } else { $composer
/*     */             
/*  90 */             .useNode(); }
/*     */         
/*  92 */         Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/*  93 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/*  94 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */         
/*  96 */         Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/*  97 */         Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/*  98 */         if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/*  99 */           $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 100 */           $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */         } 
/*     */         
/* 103 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */         
/* 105 */         int j = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-RowKt$Row$1$iv = 0;
/* 106 */         ComposerKt.sourceInformationMarkerStart($composer$iv, -407840262, "C101@5126L9:Row.kt#2w3rfo"); int k = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; RowScope $this$invoke_u24lambda_u240 = (RowScope)RowScopeInstance.INSTANCE; int $i$a$-Row-TestStepKt$TestStep$3$1 = 0; TextKt.Text-bAzTDeA("Tests", null, 0L, 0L, null, FontWeight.Companion.getBold(), MatterhornThemeDataKt.getMatterhornTheme(composer1, 0).getMessageFont(composer1, 0), 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 196614, 0, 65438); composer1.startReplaceGroup(-1883433589); if ($i$f$getDp > 0 || i > 0) { TextKt.Text-bAzTDeA("" + $i$f$getDp + "✓", null, MatterhornThemeDataKt.getMatterhornTheme(composer1, 0).getTestSuccessColor-0d7_KjU(), 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65530); TextKt.Text-bAzTDeA("" + i + "✗", null, MatterhornThemeDataKt.getMatterhornTheme(composer1, 0).getTestFailColor-0d7_KjU(), 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65530); }  composer1.endReplaceGroup(); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 107 */         $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 108 */         ComposerKt.sourceInformationMarkerEnd($composer);
/* 109 */         ComposerKt.sourceInformationMarkerEnd($composer);
/* 110 */         if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*     */       else
/*     */       { $composer.skipToGroupEnd(); }
/*     */        }
/*     */ 
/*     */     
/*     */     TestStepKt$TestStep$3(int $successfulTests, int $failedTests) {} }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class TestStepKt$TestStep$4 implements Function3<ColumnScope, Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(ColumnScope $this$StepCard, Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard");
/*     */       if (($changed & 0x11) != 16 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(191684321, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.TestStep.<anonymous> (TestStep.kt:54)"); 
/*     */         DisplayCommandWithActionsKt.DisplayCommandWithActions(this.$command, null, this.$actionNames, this.$onActionClick, $composer, 0, 2);
/*     */         TextContainerKt.TextContainer(this.$description, $composer, 0);
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */     
/*     */     TestStepKt$TestStep$4(String $command, List<String> $actionNames, Function1<Integer, Unit> $onActionClick, String $description) {}
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class TestStepKt$TestStep$5 implements Function3<RowScope, Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(RowScope $this$StepCard, Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard");
/*     */       if (($changed & 0x11) != 16 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(1690253800, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.TestStep.<anonymous> (TestStep.kt:62)"); 
/*     */         $composer.startReplaceGroup(-411387772);
/*     */         if (this.$onApproveActionClick != null)
/*     */           ButtonKt.RunCommandButton(null, this.$onApproveActionClick, $composer, 0, 1); 
/*     */         $composer.endReplaceGroup();
/*     */         if (this.$onSkipActionClick != null)
/*     */           ButtonKt.SkipButton(null, this.$onSkipActionClick, $composer, 0, 1); 
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */     
/*     */     TestStepKt$TestStep$5(Function0<Unit> $onApproveActionClick, Function0<Unit> $onSkipActionClick) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\TestStepKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */