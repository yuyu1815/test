/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks;
/*    */ 
/*    */ import androidx.compose.foundation.layout.BoxScope;
/*    */ import androidx.compose.foundation.layout.ColumnScope;
/*    */ import androidx.compose.foundation.layout.RowScope;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.components.ButtonKt;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.jewel.ui.icon.PathIconKey;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\0004\n\000\n\002\020\002\n\000\n\002\020\013\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\020 \n\000\n\002\030\002\n\002\020\b\n\000\n\002\030\002\n\002\b\003\032y\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0052\b\b\002\020\007\032\0020\b2\016\b\002\020\t\032\b\022\004\022\0020\0050\n2\024\b\002\020\013\032\016\022\004\022\0020\r\022\004\022\0020\0010\f2\020\b\002\020\016\032\n\022\004\022\0020\001\030\0010\0172\020\b\002\020\020\032\n\022\004\022\0020\001\030\0010\017H\007¢\006\002\020\021¨\006\022"}, d2 = {"BuildStep", "", "isWaitingForApproval", "", "command", "", "description", "modifier", "Landroidx/compose/ui/Modifier;", "actionNames", "", "onActionClick", "Lkotlin/Function1;", "", "onApproveActionClick", "Lkotlin/Function0;", "onSkipActionClick", "(ZLjava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "standalone"})
/*    */ @SourceDebugExtension({"SMAP\nBuildStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuildStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/BuildStepKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,67:1\n1225#2,6:68\n*S KotlinDebug\n*F\n+ 1 BuildStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/BuildStepKt\n*L\n27#1:68,6\n*E\n"})
/*    */ public final class BuildStepKt {
/* 27 */   private static final Unit BuildStep$lambda$1$lambda$0(int it) { return Unit.INSTANCE; } private static final Unit BuildStep$lambda$2(boolean $isWaitingForApproval, String $command, String $description, Modifier $modifier, List<String> $actionNames, Function1<? super Integer, Unit> $onActionClick, Function0<Unit> $onApproveActionClick, Function0<Unit> $onSkipActionClick, int $$changed, int $$default, Composer $composer, int $force) { BuildStep($isWaitingForApproval, $command, $description, $modifier, $actionNames, $onActionClick, $onApproveActionClick, $onSkipActionClick, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*    */     return Unit.INSTANCE; } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public static final void BuildStep(boolean isWaitingForApproval, @NotNull String command, @NotNull String description, @Nullable Modifier modifier, @Nullable List actionNames, @Nullable Function1 onActionClick, @Nullable Function0 onApproveActionClick, @Nullable Function0 onSkipActionClick, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'command'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'description'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload #8
/*    */     //   14: ldc 2142966707
/*    */     //   16: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*    */     //   21: astore #8
/*    */     //   23: iload #9
/*    */     //   25: istore #11
/*    */     //   27: iload #10
/*    */     //   29: iconst_1
/*    */     //   30: iand
/*    */     //   31: ifeq -> 44
/*    */     //   34: iload #11
/*    */     //   36: bipush #6
/*    */     //   38: ior
/*    */     //   39: istore #11
/*    */     //   41: goto -> 73
/*    */     //   44: iload #9
/*    */     //   46: bipush #6
/*    */     //   48: iand
/*    */     //   49: ifne -> 73
/*    */     //   52: iload #11
/*    */     //   54: aload #8
/*    */     //   56: iload_0
/*    */     //   57: invokeinterface changed : (Z)Z
/*    */     //   62: ifeq -> 69
/*    */     //   65: iconst_4
/*    */     //   66: goto -> 70
/*    */     //   69: iconst_2
/*    */     //   70: ior
/*    */     //   71: istore #11
/*    */     //   73: iload #10
/*    */     //   75: iconst_2
/*    */     //   76: iand
/*    */     //   77: ifeq -> 90
/*    */     //   80: iload #11
/*    */     //   82: bipush #48
/*    */     //   84: ior
/*    */     //   85: istore #11
/*    */     //   87: goto -> 121
/*    */     //   90: iload #9
/*    */     //   92: bipush #48
/*    */     //   94: iand
/*    */     //   95: ifne -> 121
/*    */     //   98: iload #11
/*    */     //   100: aload #8
/*    */     //   102: aload_1
/*    */     //   103: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   108: ifeq -> 116
/*    */     //   111: bipush #32
/*    */     //   113: goto -> 118
/*    */     //   116: bipush #16
/*    */     //   118: ior
/*    */     //   119: istore #11
/*    */     //   121: iload #10
/*    */     //   123: iconst_4
/*    */     //   124: iand
/*    */     //   125: ifeq -> 139
/*    */     //   128: iload #11
/*    */     //   130: sipush #384
/*    */     //   133: ior
/*    */     //   134: istore #11
/*    */     //   136: goto -> 173
/*    */     //   139: iload #9
/*    */     //   141: sipush #384
/*    */     //   144: iand
/*    */     //   145: ifne -> 173
/*    */     //   148: iload #11
/*    */     //   150: aload #8
/*    */     //   152: aload_2
/*    */     //   153: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   158: ifeq -> 167
/*    */     //   161: sipush #256
/*    */     //   164: goto -> 170
/*    */     //   167: sipush #128
/*    */     //   170: ior
/*    */     //   171: istore #11
/*    */     //   173: iload #10
/*    */     //   175: bipush #8
/*    */     //   177: iand
/*    */     //   178: ifeq -> 192
/*    */     //   181: iload #11
/*    */     //   183: sipush #3072
/*    */     //   186: ior
/*    */     //   187: istore #11
/*    */     //   189: goto -> 226
/*    */     //   192: iload #9
/*    */     //   194: sipush #3072
/*    */     //   197: iand
/*    */     //   198: ifne -> 226
/*    */     //   201: iload #11
/*    */     //   203: aload #8
/*    */     //   205: aload_3
/*    */     //   206: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   211: ifeq -> 220
/*    */     //   214: sipush #2048
/*    */     //   217: goto -> 223
/*    */     //   220: sipush #1024
/*    */     //   223: ior
/*    */     //   224: istore #11
/*    */     //   226: iload #10
/*    */     //   228: bipush #16
/*    */     //   230: iand
/*    */     //   231: ifeq -> 245
/*    */     //   234: iload #11
/*    */     //   236: sipush #24576
/*    */     //   239: ior
/*    */     //   240: istore #11
/*    */     //   242: goto -> 280
/*    */     //   245: iload #9
/*    */     //   247: sipush #24576
/*    */     //   250: iand
/*    */     //   251: ifne -> 280
/*    */     //   254: iload #11
/*    */     //   256: aload #8
/*    */     //   258: aload #4
/*    */     //   260: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   265: ifeq -> 274
/*    */     //   268: sipush #16384
/*    */     //   271: goto -> 277
/*    */     //   274: sipush #8192
/*    */     //   277: ior
/*    */     //   278: istore #11
/*    */     //   280: iload #10
/*    */     //   282: bipush #32
/*    */     //   284: iand
/*    */     //   285: ifeq -> 298
/*    */     //   288: iload #11
/*    */     //   290: ldc 196608
/*    */     //   292: ior
/*    */     //   293: istore #11
/*    */     //   295: goto -> 330
/*    */     //   298: iload #9
/*    */     //   300: ldc 196608
/*    */     //   302: iand
/*    */     //   303: ifne -> 330
/*    */     //   306: iload #11
/*    */     //   308: aload #8
/*    */     //   310: aload #5
/*    */     //   312: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   317: ifeq -> 325
/*    */     //   320: ldc 131072
/*    */     //   322: goto -> 327
/*    */     //   325: ldc 65536
/*    */     //   327: ior
/*    */     //   328: istore #11
/*    */     //   330: iload #10
/*    */     //   332: bipush #64
/*    */     //   334: iand
/*    */     //   335: ifeq -> 348
/*    */     //   338: iload #11
/*    */     //   340: ldc 1572864
/*    */     //   342: ior
/*    */     //   343: istore #11
/*    */     //   345: goto -> 380
/*    */     //   348: iload #9
/*    */     //   350: ldc 1572864
/*    */     //   352: iand
/*    */     //   353: ifne -> 380
/*    */     //   356: iload #11
/*    */     //   358: aload #8
/*    */     //   360: aload #6
/*    */     //   362: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   367: ifeq -> 375
/*    */     //   370: ldc 1048576
/*    */     //   372: goto -> 377
/*    */     //   375: ldc 524288
/*    */     //   377: ior
/*    */     //   378: istore #11
/*    */     //   380: iload #10
/*    */     //   382: sipush #128
/*    */     //   385: iand
/*    */     //   386: ifeq -> 399
/*    */     //   389: iload #11
/*    */     //   391: ldc 12582912
/*    */     //   393: ior
/*    */     //   394: istore #11
/*    */     //   396: goto -> 431
/*    */     //   399: iload #9
/*    */     //   401: ldc 12582912
/*    */     //   403: iand
/*    */     //   404: ifne -> 431
/*    */     //   407: iload #11
/*    */     //   409: aload #8
/*    */     //   411: aload #7
/*    */     //   413: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   418: ifeq -> 426
/*    */     //   421: ldc 8388608
/*    */     //   423: goto -> 428
/*    */     //   426: ldc 4194304
/*    */     //   428: ior
/*    */     //   429: istore #11
/*    */     //   431: iload #11
/*    */     //   433: ldc 4793491
/*    */     //   435: iand
/*    */     //   436: ldc 4793490
/*    */     //   438: if_icmpne -> 451
/*    */     //   441: aload #8
/*    */     //   443: invokeinterface getSkipping : ()Z
/*    */     //   448: ifne -> 722
/*    */     //   451: iload #10
/*    */     //   453: bipush #8
/*    */     //   455: iand
/*    */     //   456: ifeq -> 466
/*    */     //   459: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   462: checkcast androidx/compose/ui/Modifier
/*    */     //   465: astore_3
/*    */     //   466: iload #10
/*    */     //   468: bipush #16
/*    */     //   470: iand
/*    */     //   471: ifeq -> 479
/*    */     //   474: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   477: astore #4
/*    */     //   479: iload #10
/*    */     //   481: bipush #32
/*    */     //   483: iand
/*    */     //   484: ifeq -> 574
/*    */     //   487: aload #8
/*    */     //   489: ldc 1505585352
/*    */     //   491: invokeinterface startReplaceGroup : (I)V
/*    */     //   496: aload #8
/*    */     //   498: astore #13
/*    */     //   500: iconst_0
/*    */     //   501: istore #14
/*    */     //   503: iconst_0
/*    */     //   504: istore #15
/*    */     //   506: aload #13
/*    */     //   508: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   513: astore #16
/*    */     //   515: iconst_0
/*    */     //   516: istore #17
/*    */     //   518: aload #16
/*    */     //   520: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   523: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   526: if_acmpne -> 553
/*    */     //   529: iconst_0
/*    */     //   530: istore #18
/*    */     //   532: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   537: astore #18
/*    */     //   539: aload #13
/*    */     //   541: aload #18
/*    */     //   543: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   548: aload #18
/*    */     //   550: goto -> 555
/*    */     //   553: aload #16
/*    */     //   555: nop
/*    */     //   556: nop
/*    */     //   557: nop
/*    */     //   558: checkcast kotlin/jvm/functions/Function1
/*    */     //   561: astore #12
/*    */     //   563: aload #8
/*    */     //   565: invokeinterface endReplaceGroup : ()V
/*    */     //   570: aload #12
/*    */     //   572: astore #5
/*    */     //   574: iload #10
/*    */     //   576: bipush #64
/*    */     //   578: iand
/*    */     //   579: ifeq -> 585
/*    */     //   582: aconst_null
/*    */     //   583: astore #6
/*    */     //   585: iload #10
/*    */     //   587: sipush #128
/*    */     //   590: iand
/*    */     //   591: ifeq -> 597
/*    */     //   594: aconst_null
/*    */     //   595: astore #7
/*    */     //   597: invokestatic isTraceInProgress : ()Z
/*    */     //   600: ifeq -> 613
/*    */     //   603: ldc 2142966707
/*    */     //   605: iload #11
/*    */     //   607: iconst_m1
/*    */     //   608: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.BuildStep (BuildStep.kt:29)'
/*    */     //   610: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   613: aload_3
/*    */     //   614: ldc 630820820
/*    */     //   616: iconst_1
/*    */     //   617: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/BuildStepKt$BuildStep$2
/*    */     //   620: dup
/*    */     //   621: iload_0
/*    */     //   622: invokespecial <init> : (Z)V
/*    */     //   625: aload #8
/*    */     //   627: bipush #54
/*    */     //   629: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   632: checkcast kotlin/jvm/functions/Function3
/*    */     //   635: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/ComposableSingletons$BuildStepKt.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/ComposableSingletons$BuildStepKt;
/*    */     //   638: invokevirtual getLambda-1$standalone : ()Lkotlin/jvm/functions/Function3;
/*    */     //   641: aconst_null
/*    */     //   642: ldc -1807230960
/*    */     //   644: iconst_1
/*    */     //   645: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/BuildStepKt$BuildStep$3
/*    */     //   648: dup
/*    */     //   649: aload #4
/*    */     //   651: aload_1
/*    */     //   652: aload #5
/*    */     //   654: aload_2
/*    */     //   655: invokespecial <init> : (Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V
/*    */     //   658: aload #8
/*    */     //   660: bipush #54
/*    */     //   662: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   665: checkcast kotlin/jvm/functions/Function3
/*    */     //   668: ldc 186043305
/*    */     //   670: iconst_1
/*    */     //   671: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/BuildStepKt$BuildStep$4
/*    */     //   674: dup
/*    */     //   675: aload #6
/*    */     //   677: aload #7
/*    */     //   679: invokespecial <init> : (Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
/*    */     //   682: aload #8
/*    */     //   684: bipush #54
/*    */     //   686: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*    */     //   689: checkcast kotlin/jvm/functions/Function3
/*    */     //   692: aload #8
/*    */     //   694: ldc 221616
/*    */     //   696: bipush #14
/*    */     //   698: iload #11
/*    */     //   700: bipush #9
/*    */     //   702: ishr
/*    */     //   703: iand
/*    */     //   704: ior
/*    */     //   705: bipush #8
/*    */     //   707: invokestatic StepCard : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*    */     //   710: invokestatic isTraceInProgress : ()Z
/*    */     //   713: ifeq -> 729
/*    */     //   716: invokestatic traceEventEnd : ()V
/*    */     //   719: goto -> 729
/*    */     //   722: aload #8
/*    */     //   724: invokeinterface skipToGroupEnd : ()V
/*    */     //   729: aload #8
/*    */     //   731: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*    */     //   736: dup
/*    */     //   737: ifnull -> 769
/*    */     //   740: iload_0
/*    */     //   741: aload_1
/*    */     //   742: aload_2
/*    */     //   743: aload_3
/*    */     //   744: aload #4
/*    */     //   746: aload #5
/*    */     //   748: aload #6
/*    */     //   750: aload #7
/*    */     //   752: iload #9
/*    */     //   754: iload #10
/*    */     //   756: <illegal opcode> invoke : (ZLjava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;II)Lkotlin/jvm/functions/Function2;
/*    */     //   761: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*    */     //   766: goto -> 770
/*    */     //   769: pop
/*    */     //   770: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #30	-> 12
/*    */     //   #25	-> 459
/*    */     //   #26	-> 474
/*    */     //   #27	-> 487
/*    */     //   #68	-> 506
/*    */     //   #69	-> 518
/*    */     //   #70	-> 529
/*    */     //   #70	-> 537
/*    */     //   #71	-> 539
/*    */     //   #72	-> 548
/*    */     //   #73	-> 553
/*    */     //   #69	-> 555
/*    */     //   #68	-> 556
/*    */     //   #68	-> 557
/*    */     //   #27	-> 558
/*    */     //   #28	-> 582
/*    */     //   #29	-> 594
/*    */     //   #30	-> 610
/*    */     //   #32	-> 613
/*    */     //   #33	-> 614
/*    */     //   #51	-> 642
/*    */     //   #61	-> 668
/*    */     //   #31	-> 707
/*    */     //   #66	-> 722
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   532	5	18	$i$a$-cache-BuildStepKt$BuildStep$1	I
/*    */     //   539	11	18	value$iv	Ljava/lang/Object;
/*    */     //   518	38	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   515	41	16	it$iv	Ljava/lang/Object;
/*    */     //   506	52	15	$i$f$cache	I
/*    */     //   503	55	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   503	55	14	invalid$iv	Z
/*    */     //   27	744	11	$dirty	I
/*    */     //   0	771	0	isWaitingForApproval	Z
/*    */     //   0	771	1	command	Ljava/lang/String;
/*    */     //   0	771	2	description	Ljava/lang/String;
/*    */     //   0	771	3	modifier	Landroidx/compose/ui/Modifier;
/*    */     //   0	771	4	actionNames	Ljava/util/List;
/*    */     //   0	771	5	onActionClick	Lkotlin/jvm/functions/Function1;
/*    */     //   0	771	6	onApproveActionClick	Lkotlin/jvm/functions/Function0;
/*    */     //   0	771	7	onSkipActionClick	Lkotlin/jvm/functions/Function0;
/*    */     //   0	771	8	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	771	9	$changed	I } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class BuildStepKt$BuildStep$2 implements Function3<BoxScope, Composer, Integer, Unit>
/*    */   {
/*    */     @Composable
/*    */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/* 34 */     public final void invoke(BoxScope $this$StepCard, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(630820820, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.BuildStep.<anonymous> (BuildStep.kt:33)"); 
/* 35 */         $composer.startReplaceGroup(913159762); PathIconKey pathIconKey = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getPauseStateIcon(); $composer.endReplaceGroup(); $composer.startReplaceGroup(913160908); pathIconKey = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getShowIcon(); $composer.endReplaceGroup(); IconKt.Icon-FHprtrg(this.$isWaitingForApproval ? (IconKey)pathIconKey : (IconKey)pathIconKey, 
/* 36 */             this.$isWaitingForApproval ? "Waiting for approval" : "Build", null, null, 0L, new org.jetbrains.jewel.ui.painter.PainterHint[0], $composer, PathIconKey.$stable, 28); if (ComposerKt.isTraceInProgress())
/* 37 */           ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */        }
/*    */ 
/*    */     
/*    */     BuildStepKt$BuildStep$2(boolean $isWaitingForApproval) {}
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class BuildStepKt$BuildStep$3
/*    */     implements Function3<ColumnScope, Composer, Integer, Unit>
/*    */   {
/*    */     @Composable
/*    */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */     public final void invoke(ColumnScope $this$StepCard, Composer $composer, int $changed)
/*    */     {
/* 52 */       Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1807230960, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.BuildStep.<anonymous> (BuildStep.kt:51)");  $composer.startReplaceGroup(913175751); if (!this.$actionNames.isEmpty()) {
/* 53 */           DisplayCommandWithActionsKt.DisplayCommandWithActions(
/* 54 */               this.$command, null, 
/* 55 */               this.$actionNames, 
/* 56 */               this.$onActionClick, $composer, 0, 2);
/*    */         }
/*    */         $composer.endReplaceGroup();
/* 59 */         TextContainerKt.TextContainer(this.$description, $composer, 0); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */        } BuildStepKt$BuildStep$3(List<String> $actionNames, String $command, Function1<Integer, Unit> $onActionClick, String $description) {} } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class BuildStepKt$BuildStep$4 implements Function3<RowScope, Composer, Integer, Unit> { @Composable
/*    */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/* 62 */     public final void invoke(RowScope $this$StepCard, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(186043305, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.BuildStep.<anonymous> (BuildStep.kt:61)");  $composer.startReplaceGroup(913184310); if (this.$onApproveActionClick != null) ButtonKt.RunCommandButton(null, this.$onApproveActionClick, $composer, 0, 1);  $composer.endReplaceGroup();
/* 63 */         if (this.$onSkipActionClick != null) ButtonKt.SkipButton(null, this.$onSkipActionClick, $composer, 0, 1);  if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */        }
/*    */ 
/*    */     
/*    */     BuildStepKt$BuildStep$4(Function0<Unit> $onApproveActionClick, Function0<Unit> $onSkipActionClick) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\BuildStepKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */