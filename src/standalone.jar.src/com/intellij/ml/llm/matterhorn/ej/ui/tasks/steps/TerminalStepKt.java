/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.steps;
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.ColumnScope;
/*     */ import androidx.compose.foundation.layout.RowScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.components.ButtonKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.icon.IconKey;
/*     */ import org.jetbrains.jewel.ui.icon.PathIconKey;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\0000\n\000\n\002\020\002\n\000\n\002\020\016\n\002\b\002\n\002\020\013\n\002\b\002\n\002\020 \n\000\n\002\030\002\n\002\020\b\n\000\n\002\030\002\n\002\b\006\032\001\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\0062\016\b\002\020\b\032\b\022\004\022\0020\0030\t2\024\b\002\020\n\032\016\022\004\022\0020\f\022\004\022\0020\0010\0132\020\b\002\020\r\032\n\022\004\022\0020\001\030\0010\0162\020\b\002\020\017\032\n\022\004\022\0020\001\030\0010\0162\020\b\002\020\020\032\n\022\004\022\0020\001\030\0010\0162\020\b\002\020\021\032\n\022\004\022\0020\001\030\0010\016H\007¢\006\002\020\022¨\006\023²\006\n\020\024\032\0020\006X\002"}, d2 = {"TerminalStep", "", "description", "", "command", "isRunning", "", "isWaitingForApproval", "actionNames", "", "onActionClick", "Lkotlin/Function1;", "", "onStopClick", "Lkotlin/Function0;", "onOpenTerminalClick", "onApproveActionClick", "onSkipActionClick", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "standalone", "isCancelling"})
/*     */ @SourceDebugExtension({"SMAP\nTerminalStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/steps/TerminalStepKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,104:1\n1225#2,6:105\n1225#2,6:111\n81#3:117\n107#3,2:118\n*S KotlinDebug\n*F\n+ 1 TerminalStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/steps/TerminalStepKt\n*L\n37#1:105,6\n43#1:111,6\n43#1:117\n43#1:118,2\n*E\n"})
/*     */ public final class TerminalStepKt {
/*     */   private static final Unit TerminalStep$lambda$1$lambda$0(int it) {
/*  37 */     return Unit.INSTANCE;
/*     */   } @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void TerminalStep(@NotNull String description, @NotNull String command, boolean isRunning, boolean isWaitingForApproval, @Nullable List actionNames, @Nullable Function1 onActionClick, @Nullable Function0 onStopClick, @Nullable Function0 onOpenTerminalClick, @Nullable Function0 onApproveActionClick, @Nullable Function0 onSkipActionClick, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'description'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'command'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload #10
/*     */     //   14: ldc 1181729667
/*     */     //   16: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   21: astore #10
/*     */     //   23: iload #11
/*     */     //   25: istore #13
/*     */     //   27: iload #12
/*     */     //   29: iconst_1
/*     */     //   30: iand
/*     */     //   31: ifeq -> 44
/*     */     //   34: iload #13
/*     */     //   36: bipush #6
/*     */     //   38: ior
/*     */     //   39: istore #13
/*     */     //   41: goto -> 73
/*     */     //   44: iload #11
/*     */     //   46: bipush #6
/*     */     //   48: iand
/*     */     //   49: ifne -> 73
/*     */     //   52: iload #13
/*     */     //   54: aload #10
/*     */     //   56: aload_0
/*     */     //   57: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   62: ifeq -> 69
/*     */     //   65: iconst_4
/*     */     //   66: goto -> 70
/*     */     //   69: iconst_2
/*     */     //   70: ior
/*     */     //   71: istore #13
/*     */     //   73: iload #12
/*     */     //   75: iconst_2
/*     */     //   76: iand
/*     */     //   77: ifeq -> 90
/*     */     //   80: iload #13
/*     */     //   82: bipush #48
/*     */     //   84: ior
/*     */     //   85: istore #13
/*     */     //   87: goto -> 121
/*     */     //   90: iload #11
/*     */     //   92: bipush #48
/*     */     //   94: iand
/*     */     //   95: ifne -> 121
/*     */     //   98: iload #13
/*     */     //   100: aload #10
/*     */     //   102: aload_1
/*     */     //   103: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   108: ifeq -> 116
/*     */     //   111: bipush #32
/*     */     //   113: goto -> 118
/*     */     //   116: bipush #16
/*     */     //   118: ior
/*     */     //   119: istore #13
/*     */     //   121: iload #12
/*     */     //   123: iconst_4
/*     */     //   124: iand
/*     */     //   125: ifeq -> 139
/*     */     //   128: iload #13
/*     */     //   130: sipush #384
/*     */     //   133: ior
/*     */     //   134: istore #13
/*     */     //   136: goto -> 173
/*     */     //   139: iload #11
/*     */     //   141: sipush #384
/*     */     //   144: iand
/*     */     //   145: ifne -> 173
/*     */     //   148: iload #13
/*     */     //   150: aload #10
/*     */     //   152: iload_2
/*     */     //   153: invokeinterface changed : (Z)Z
/*     */     //   158: ifeq -> 167
/*     */     //   161: sipush #256
/*     */     //   164: goto -> 170
/*     */     //   167: sipush #128
/*     */     //   170: ior
/*     */     //   171: istore #13
/*     */     //   173: iload #12
/*     */     //   175: bipush #8
/*     */     //   177: iand
/*     */     //   178: ifeq -> 192
/*     */     //   181: iload #13
/*     */     //   183: sipush #3072
/*     */     //   186: ior
/*     */     //   187: istore #13
/*     */     //   189: goto -> 226
/*     */     //   192: iload #11
/*     */     //   194: sipush #3072
/*     */     //   197: iand
/*     */     //   198: ifne -> 226
/*     */     //   201: iload #13
/*     */     //   203: aload #10
/*     */     //   205: iload_3
/*     */     //   206: invokeinterface changed : (Z)Z
/*     */     //   211: ifeq -> 220
/*     */     //   214: sipush #2048
/*     */     //   217: goto -> 223
/*     */     //   220: sipush #1024
/*     */     //   223: ior
/*     */     //   224: istore #13
/*     */     //   226: iload #12
/*     */     //   228: bipush #16
/*     */     //   230: iand
/*     */     //   231: ifeq -> 245
/*     */     //   234: iload #13
/*     */     //   236: sipush #24576
/*     */     //   239: ior
/*     */     //   240: istore #13
/*     */     //   242: goto -> 280
/*     */     //   245: iload #11
/*     */     //   247: sipush #24576
/*     */     //   250: iand
/*     */     //   251: ifne -> 280
/*     */     //   254: iload #13
/*     */     //   256: aload #10
/*     */     //   258: aload #4
/*     */     //   260: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   265: ifeq -> 274
/*     */     //   268: sipush #16384
/*     */     //   271: goto -> 277
/*     */     //   274: sipush #8192
/*     */     //   277: ior
/*     */     //   278: istore #13
/*     */     //   280: iload #12
/*     */     //   282: bipush #32
/*     */     //   284: iand
/*     */     //   285: ifeq -> 298
/*     */     //   288: iload #13
/*     */     //   290: ldc 196608
/*     */     //   292: ior
/*     */     //   293: istore #13
/*     */     //   295: goto -> 330
/*     */     //   298: iload #11
/*     */     //   300: ldc 196608
/*     */     //   302: iand
/*     */     //   303: ifne -> 330
/*     */     //   306: iload #13
/*     */     //   308: aload #10
/*     */     //   310: aload #5
/*     */     //   312: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   317: ifeq -> 325
/*     */     //   320: ldc 131072
/*     */     //   322: goto -> 327
/*     */     //   325: ldc 65536
/*     */     //   327: ior
/*     */     //   328: istore #13
/*     */     //   330: iload #12
/*     */     //   332: bipush #64
/*     */     //   334: iand
/*     */     //   335: ifeq -> 348
/*     */     //   338: iload #13
/*     */     //   340: ldc 1572864
/*     */     //   342: ior
/*     */     //   343: istore #13
/*     */     //   345: goto -> 380
/*     */     //   348: iload #11
/*     */     //   350: ldc 1572864
/*     */     //   352: iand
/*     */     //   353: ifne -> 380
/*     */     //   356: iload #13
/*     */     //   358: aload #10
/*     */     //   360: aload #6
/*     */     //   362: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   367: ifeq -> 375
/*     */     //   370: ldc 1048576
/*     */     //   372: goto -> 377
/*     */     //   375: ldc 524288
/*     */     //   377: ior
/*     */     //   378: istore #13
/*     */     //   380: iload #12
/*     */     //   382: sipush #128
/*     */     //   385: iand
/*     */     //   386: ifeq -> 399
/*     */     //   389: iload #13
/*     */     //   391: ldc 12582912
/*     */     //   393: ior
/*     */     //   394: istore #13
/*     */     //   396: goto -> 431
/*     */     //   399: iload #11
/*     */     //   401: ldc 12582912
/*     */     //   403: iand
/*     */     //   404: ifne -> 431
/*     */     //   407: iload #13
/*     */     //   409: aload #10
/*     */     //   411: aload #7
/*     */     //   413: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   418: ifeq -> 426
/*     */     //   421: ldc 8388608
/*     */     //   423: goto -> 428
/*     */     //   426: ldc 4194304
/*     */     //   428: ior
/*     */     //   429: istore #13
/*     */     //   431: iload #12
/*     */     //   433: sipush #256
/*     */     //   436: iand
/*     */     //   437: ifeq -> 450
/*     */     //   440: iload #13
/*     */     //   442: ldc 100663296
/*     */     //   444: ior
/*     */     //   445: istore #13
/*     */     //   447: goto -> 482
/*     */     //   450: iload #11
/*     */     //   452: ldc 100663296
/*     */     //   454: iand
/*     */     //   455: ifne -> 482
/*     */     //   458: iload #13
/*     */     //   460: aload #10
/*     */     //   462: aload #8
/*     */     //   464: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   469: ifeq -> 477
/*     */     //   472: ldc 67108864
/*     */     //   474: goto -> 479
/*     */     //   477: ldc 33554432
/*     */     //   479: ior
/*     */     //   480: istore #13
/*     */     //   482: iload #12
/*     */     //   484: sipush #512
/*     */     //   487: iand
/*     */     //   488: ifeq -> 501
/*     */     //   491: iload #13
/*     */     //   493: ldc 805306368
/*     */     //   495: ior
/*     */     //   496: istore #13
/*     */     //   498: goto -> 533
/*     */     //   501: iload #11
/*     */     //   503: ldc 805306368
/*     */     //   505: iand
/*     */     //   506: ifne -> 533
/*     */     //   509: iload #13
/*     */     //   511: aload #10
/*     */     //   513: aload #9
/*     */     //   515: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   520: ifeq -> 528
/*     */     //   523: ldc 536870912
/*     */     //   525: goto -> 530
/*     */     //   528: ldc 268435456
/*     */     //   530: ior
/*     */     //   531: istore #13
/*     */     //   533: iload #13
/*     */     //   535: ldc 306783379
/*     */     //   537: iand
/*     */     //   538: ldc 306783378
/*     */     //   540: if_icmpne -> 553
/*     */     //   543: aload #10
/*     */     //   545: invokeinterface getSkipping : ()Z
/*     */     //   550: ifne -> 938
/*     */     //   553: iload #12
/*     */     //   555: bipush #16
/*     */     //   557: iand
/*     */     //   558: ifeq -> 566
/*     */     //   561: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   564: astore #4
/*     */     //   566: iload #12
/*     */     //   568: bipush #32
/*     */     //   570: iand
/*     */     //   571: ifeq -> 661
/*     */     //   574: aload #10
/*     */     //   576: ldc 2042751655
/*     */     //   578: invokeinterface startReplaceGroup : (I)V
/*     */     //   583: aload #10
/*     */     //   585: astore #15
/*     */     //   587: iconst_0
/*     */     //   588: istore #16
/*     */     //   590: iconst_0
/*     */     //   591: istore #17
/*     */     //   593: aload #15
/*     */     //   595: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   600: astore #18
/*     */     //   602: iconst_0
/*     */     //   603: istore #19
/*     */     //   605: aload #18
/*     */     //   607: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   610: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   613: if_acmpne -> 640
/*     */     //   616: iconst_0
/*     */     //   617: istore #20
/*     */     //   619: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   624: astore #20
/*     */     //   626: aload #15
/*     */     //   628: aload #20
/*     */     //   630: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   635: aload #20
/*     */     //   637: goto -> 642
/*     */     //   640: aload #18
/*     */     //   642: nop
/*     */     //   643: nop
/*     */     //   644: nop
/*     */     //   645: checkcast kotlin/jvm/functions/Function1
/*     */     //   648: astore #14
/*     */     //   650: aload #10
/*     */     //   652: invokeinterface endReplaceGroup : ()V
/*     */     //   657: aload #14
/*     */     //   659: astore #5
/*     */     //   661: iload #12
/*     */     //   663: bipush #64
/*     */     //   665: iand
/*     */     //   666: ifeq -> 672
/*     */     //   669: aconst_null
/*     */     //   670: astore #6
/*     */     //   672: iload #12
/*     */     //   674: sipush #128
/*     */     //   677: iand
/*     */     //   678: ifeq -> 684
/*     */     //   681: aconst_null
/*     */     //   682: astore #7
/*     */     //   684: iload #12
/*     */     //   686: sipush #256
/*     */     //   689: iand
/*     */     //   690: ifeq -> 696
/*     */     //   693: aconst_null
/*     */     //   694: astore #8
/*     */     //   696: iload #12
/*     */     //   698: sipush #512
/*     */     //   701: iand
/*     */     //   702: ifeq -> 708
/*     */     //   705: aconst_null
/*     */     //   706: astore #9
/*     */     //   708: invokestatic isTraceInProgress : ()Z
/*     */     //   711: ifeq -> 724
/*     */     //   714: ldc 1181729667
/*     */     //   716: iload #13
/*     */     //   718: iconst_m1
/*     */     //   719: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.steps.TerminalStep (TerminalStep.kt:41)'
/*     */     //   721: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   724: aload #10
/*     */     //   726: ldc 2042758150
/*     */     //   728: invokeinterface startReplaceGroup : (I)V
/*     */     //   733: aload #10
/*     */     //   735: astore #16
/*     */     //   737: iconst_0
/*     */     //   738: istore #17
/*     */     //   740: nop
/*     */     //   741: iconst_0
/*     */     //   742: istore #18
/*     */     //   744: aload #16
/*     */     //   746: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   751: astore #19
/*     */     //   753: iconst_0
/*     */     //   754: istore #20
/*     */     //   756: aload #19
/*     */     //   758: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   761: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   764: if_acmpne -> 796
/*     */     //   767: iconst_0
/*     */     //   768: istore #21
/*     */     //   770: iconst_0
/*     */     //   771: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   774: aconst_null
/*     */     //   775: iconst_2
/*     */     //   776: aconst_null
/*     */     //   777: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   780: astore #21
/*     */     //   782: aload #16
/*     */     //   784: aload #21
/*     */     //   786: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   791: aload #21
/*     */     //   793: goto -> 798
/*     */     //   796: aload #19
/*     */     //   798: nop
/*     */     //   799: nop
/*     */     //   800: nop
/*     */     //   801: checkcast androidx/compose/runtime/MutableState
/*     */     //   804: astore #15
/*     */     //   806: aload #10
/*     */     //   808: invokeinterface endReplaceGroup : ()V
/*     */     //   813: aload #15
/*     */     //   815: astore #14
/*     */     //   817: aconst_null
/*     */     //   818: ldc 1375339330
/*     */     //   820: iconst_1
/*     */     //   821: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/steps/TerminalStepKt$TerminalStep$2
/*     */     //   824: dup
/*     */     //   825: iload_2
/*     */     //   826: iload_3
/*     */     //   827: invokespecial <init> : (ZZ)V
/*     */     //   830: aload #10
/*     */     //   832: bipush #54
/*     */     //   834: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   837: checkcast kotlin/jvm/functions/Function3
/*     */     //   840: ldc -1642109008
/*     */     //   842: iconst_1
/*     */     //   843: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/steps/TerminalStepKt$TerminalStep$3
/*     */     //   846: dup
/*     */     //   847: aload #6
/*     */     //   849: aload #7
/*     */     //   851: aload #14
/*     */     //   853: invokespecial <init> : (Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;)V
/*     */     //   856: aload #10
/*     */     //   858: bipush #54
/*     */     //   860: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   863: checkcast kotlin/jvm/functions/Function3
/*     */     //   866: aconst_null
/*     */     //   867: ldc 181515142
/*     */     //   869: iconst_1
/*     */     //   870: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/steps/TerminalStepKt$TerminalStep$4
/*     */     //   873: dup
/*     */     //   874: aload_1
/*     */     //   875: aload #4
/*     */     //   877: aload #5
/*     */     //   879: aload_0
/*     */     //   880: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V
/*     */     //   883: aload #10
/*     */     //   885: bipush #54
/*     */     //   887: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   890: checkcast kotlin/jvm/functions/Function3
/*     */     //   893: ldc 1807387853
/*     */     //   895: iconst_1
/*     */     //   896: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/steps/TerminalStepKt$TerminalStep$5
/*     */     //   899: dup
/*     */     //   900: aload #8
/*     */     //   902: aload #9
/*     */     //   904: invokespecial <init> : (Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
/*     */     //   907: aload #10
/*     */     //   909: bipush #54
/*     */     //   911: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   914: checkcast kotlin/jvm/functions/Function3
/*     */     //   917: aload #10
/*     */     //   919: ldc 221616
/*     */     //   921: bipush #9
/*     */     //   923: invokestatic StepCard : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   926: invokestatic isTraceInProgress : ()Z
/*     */     //   929: ifeq -> 945
/*     */     //   932: invokestatic traceEventEnd : ()V
/*     */     //   935: goto -> 945
/*     */     //   938: aload #10
/*     */     //   940: invokeinterface skipToGroupEnd : ()V
/*     */     //   945: aload #10
/*     */     //   947: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   952: dup
/*     */     //   953: ifnull -> 989
/*     */     //   956: aload_0
/*     */     //   957: aload_1
/*     */     //   958: iload_2
/*     */     //   959: iload_3
/*     */     //   960: aload #4
/*     */     //   962: aload #5
/*     */     //   964: aload #6
/*     */     //   966: aload #7
/*     */     //   968: aload #8
/*     */     //   970: aload #9
/*     */     //   972: iload #11
/*     */     //   974: iload #12
/*     */     //   976: <illegal opcode> invoke : (Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;II)Lkotlin/jvm/functions/Function2;
/*     */     //   981: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   986: goto -> 990
/*     */     //   989: pop
/*     */     //   990: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #42	-> 12
/*     */     //   #36	-> 561
/*     */     //   #37	-> 574
/*     */     //   #105	-> 593
/*     */     //   #106	-> 605
/*     */     //   #107	-> 616
/*     */     //   #107	-> 624
/*     */     //   #108	-> 626
/*     */     //   #109	-> 635
/*     */     //   #110	-> 640
/*     */     //   #106	-> 642
/*     */     //   #105	-> 643
/*     */     //   #105	-> 644
/*     */     //   #37	-> 645
/*     */     //   #38	-> 669
/*     */     //   #39	-> 681
/*     */     //   #40	-> 693
/*     */     //   #41	-> 705
/*     */     //   #42	-> 721
/*     */     //   #43	-> 740
/*     */     //   #111	-> 744
/*     */     //   #112	-> 756
/*     */     //   #113	-> 767
/*     */     //   #43	-> 770
/*     */     //   #113	-> 780
/*     */     //   #114	-> 782
/*     */     //   #115	-> 791
/*     */     //   #116	-> 796
/*     */     //   #112	-> 798
/*     */     //   #111	-> 799
/*     */     //   #111	-> 800
/*     */     //   #43	-> 801
/*     */     //   #45	-> 818
/*     */     //   #55	-> 840
/*     */     //   #87	-> 867
/*     */     //   #98	-> 893
/*     */     //   #44	-> 923
/*     */     //   #103	-> 938
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   619	5	20	$i$a$-cache-TerminalStepKt$TerminalStep$1	I
/*     */     //   626	11	20	value$iv	Ljava/lang/Object;
/*     */     //   605	38	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   602	41	18	it$iv	Ljava/lang/Object;
/*     */     //   593	52	17	$i$f$cache	I
/*     */     //   590	55	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   590	55	16	invalid$iv	Z
/*     */     //   770	10	21	$i$a$-cache-TerminalStepKt$TerminalStep$isCancelling$2	I
/*     */     //   782	11	21	value$iv	Ljava/lang/Object;
/*     */     //   756	43	20	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   753	46	19	it$iv	Ljava/lang/Object;
/*     */     //   744	57	18	$i$f$cache	I
/*     */     //   741	60	16	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   741	60	17	invalid$iv	Z
/*     */     //   817	118	14	isCancelling$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   27	964	13	$dirty	I
/*     */     //   0	991	0	description	Ljava/lang/String;
/*     */     //   0	991	1	command	Ljava/lang/String;
/*     */     //   0	991	2	isRunning	Z
/*     */     //   0	991	3	isWaitingForApproval	Z
/*     */     //   0	991	4	actionNames	Ljava/util/List;
/*     */     //   0	991	5	onActionClick	Lkotlin/jvm/functions/Function1;
/*     */     //   0	991	6	onStopClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	991	7	onOpenTerminalClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	991	8	onApproveActionClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	991	9	onSkipActionClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	991	10	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	991	11	$changed	I
/*     */   }
/*  43 */   private static final boolean TerminalStep$lambda$3(MutableState $isCancelling$delegate) { State state = (State)$isCancelling$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 117 */       (Boolean)state.getValue()).booleanValue(); } private static final Unit TerminalStep$lambda$5(String $description, String $command, boolean $isRunning, boolean $isWaitingForApproval, List<String> $actionNames, Function1<? super Integer, Unit> $onActionClick, Function0<Unit> $onStopClick, Function0<Unit> $onOpenTerminalClick, Function0<Unit> $onApproveActionClick, Function0<Unit> $onSkipActionClick, int $$changed, int $$default, Composer $composer, int $force) { TerminalStep($description, $command, $isRunning, $isWaitingForApproval, $actionNames, $onActionClick, $onStopClick, $onOpenTerminalClick, $onApproveActionClick, $onSkipActionClick, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default); return Unit.INSTANCE; } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class TerminalStepKt$TerminalStep$2 implements Function3<BoxScope, Composer, Integer, Unit> {
/*     */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(BoxScope $this$StepCard, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1375339330, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.steps.TerminalStep.<anonymous> (TerminalStep.kt:45)");  if (this.$isRunning) { $composer.startReplaceGroup(-861750333); JunieCircularProgressIndicatorKt.JunieCircularProgressIndicator-3IgeMak(null, 0L, null, $composer, 0, 7); $composer.endReplaceGroup(); } else { $composer.startReplaceGroup(-861748266); $composer.startReplaceGroup(-861746351); PathIconKey pathIconKey = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getPauseStateIcon(); $composer.endReplaceGroup(); $composer.startReplaceGroup(-861745201); pathIconKey = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getTerminalIcon(); $composer.endReplaceGroup(); IconKt.Icon-FHprtrg(this.$isWaitingForApproval ? (IconKey)pathIconKey : (IconKey)pathIconKey, this.$isWaitingForApproval ? "Pause" : "Terminal", null, null, 0L, new org.jetbrains.jewel.ui.painter.PainterHint[0], $composer, PathIconKey.$stable, 28); $composer.endReplaceGroup(); }  if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } TerminalStepKt$TerminalStep$2(boolean $isRunning, boolean $isWaitingForApproval) {} } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nTerminalStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/steps/TerminalStepKt$TerminalStep$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,104:1\n149#2:105\n99#3:106\n95#3,7:107\n102#3:142\n106#3:193\n79#4,6:114\n86#4,4:129\n90#4,2:139\n79#4,6:157\n86#4,4:172\n90#4,2:182\n94#4:188\n94#4:192\n368#5,9:120\n377#5:141\n368#5,9:163\n377#5:184\n378#5,2:186\n378#5,2:190\n4034#6,6:133\n4034#6,6:176\n1225#7,6:143\n71#8:149\n67#8,7:150\n74#8:185\n78#8:189\n*S KotlinDebug\n*F\n+ 1 TerminalStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/steps/TerminalStepKt$TerminalStep$3\n*L\n58#1:105\n56#1:106\n56#1:107,7\n56#1:142\n56#1:193\n56#1:114,6\n56#1:129,4\n56#1:139,2\n81#1:157,6\n81#1:172,4\n81#1:182,2\n81#1:188\n56#1:192\n56#1:120,9\n56#1:141\n81#1:163,9\n81#1:184\n81#1:186,2\n56#1:190,2\n56#1:133,6\n81#1:176,6\n73#1:143,6\n81#1:149\n81#1:150,7\n81#1:185\n81#1:189\n*E\n"}) static final class TerminalStepKt$TerminalStep$3 implements Function3<RowScope, Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(RowScope $this$StepCard, Composer $composer, int $changed) { // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$StepCard'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: iload_3
/*     */       //   7: bipush #17
/*     */       //   9: iand
/*     */       //   10: bipush #16
/*     */       //   12: if_icmpne -> 24
/*     */       //   15: aload_2
/*     */       //   16: invokeinterface getSkipping : ()Z
/*     */       //   21: ifne -> 1155
/*     */       //   24: invokestatic isTraceInProgress : ()Z
/*     */       //   27: ifeq -> 39
/*     */       //   30: ldc -1642109008
/*     */       //   32: iload_3
/*     */       //   33: iconst_m1
/*     */       //   34: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.steps.TerminalStep.<anonymous> (TerminalStep.kt:55)'
/*     */       //   36: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   39: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */       //   42: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */       //   45: astore #4
/*     */       //   47: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */       //   50: iconst_4
/*     */       //   51: istore #6
/*     */       //   53: iconst_0
/*     */       //   54: istore #7
/*     */       //   56: iload #6
/*     */       //   58: i2f
/*     */       //   59: invokestatic constructor-impl : (F)F
/*     */       //   62: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */       //   65: astore #5
/*     */       //   67: aload_0
/*     */       //   68: getfield $onStopClick : Lkotlin/jvm/functions/Function0;
/*     */       //   71: astore #7
/*     */       //   73: aload_0
/*     */       //   74: getfield $onOpenTerminalClick : Lkotlin/jvm/functions/Function0;
/*     */       //   77: astore #8
/*     */       //   79: aload_0
/*     */       //   80: getfield $isCancelling$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   83: astore #9
/*     */       //   85: sipush #432
/*     */       //   88: istore #10
/*     */       //   90: iconst_0
/*     */       //   91: istore #11
/*     */       //   93: aload_2
/*     */       //   94: ldc 693286680
/*     */       //   96: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */       //   98: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   101: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   104: checkcast androidx/compose/ui/Modifier
/*     */       //   107: astore #6
/*     */       //   109: aload #5
/*     */       //   111: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*     */       //   114: aload #4
/*     */       //   116: aload_2
/*     */       //   117: bipush #14
/*     */       //   119: iload #10
/*     */       //   121: iconst_3
/*     */       //   122: ishr
/*     */       //   123: iand
/*     */       //   124: bipush #112
/*     */       //   126: iload #10
/*     */       //   128: iconst_3
/*     */       //   129: ishr
/*     */       //   130: iand
/*     */       //   131: ior
/*     */       //   132: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   135: astore #12
/*     */       //   137: bipush #112
/*     */       //   139: iload #10
/*     */       //   141: iconst_3
/*     */       //   142: ishl
/*     */       //   143: iand
/*     */       //   144: istore #13
/*     */       //   146: nop
/*     */       //   147: iconst_0
/*     */       //   148: istore #14
/*     */       //   150: aload_2
/*     */       //   151: ldc -1323940314
/*     */       //   153: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */       //   155: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   158: aload_2
/*     */       //   159: iconst_0
/*     */       //   160: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */       //   163: istore #15
/*     */       //   165: aload_2
/*     */       //   166: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   171: astore #16
/*     */       //   173: aload_2
/*     */       //   174: aload #6
/*     */       //   176: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */       //   179: astore #17
/*     */       //   181: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   184: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */       //   187: astore #18
/*     */       //   189: bipush #6
/*     */       //   191: sipush #896
/*     */       //   194: iload #13
/*     */       //   196: bipush #6
/*     */       //   198: ishl
/*     */       //   199: iand
/*     */       //   200: ior
/*     */       //   201: istore #19
/*     */       //   203: nop
/*     */       //   204: iconst_0
/*     */       //   205: istore #20
/*     */       //   207: aload_2
/*     */       //   208: ldc -692256719
/*     */       //   210: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */       //   212: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   215: aload_2
/*     */       //   216: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */       //   221: instanceof androidx/compose/runtime/Applier
/*     */       //   224: ifne -> 230
/*     */       //   227: invokestatic invalidApplier : ()V
/*     */       //   230: aload_2
/*     */       //   231: invokeinterface startReusableNode : ()V
/*     */       //   236: aload_2
/*     */       //   237: invokeinterface getInserting : ()Z
/*     */       //   242: ifeq -> 256
/*     */       //   245: aload_2
/*     */       //   246: aload #18
/*     */       //   248: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */       //   253: goto -> 262
/*     */       //   256: aload_2
/*     */       //   257: invokeinterface useNode : ()V
/*     */       //   262: aload_2
/*     */       //   263: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */       //   266: astore #21
/*     */       //   268: iconst_0
/*     */       //   269: istore #22
/*     */       //   271: aload #21
/*     */       //   273: aload #12
/*     */       //   275: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   278: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */       //   281: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   284: aload #21
/*     */       //   286: aload #16
/*     */       //   288: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   291: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */       //   294: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   297: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   300: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */       //   303: astore #23
/*     */       //   305: iconst_0
/*     */       //   306: istore #24
/*     */       //   308: aload #21
/*     */       //   310: astore #25
/*     */       //   312: iconst_0
/*     */       //   313: istore #26
/*     */       //   315: aload #25
/*     */       //   317: invokeinterface getInserting : ()Z
/*     */       //   322: ifne -> 343
/*     */       //   325: aload #25
/*     */       //   327: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   332: iload #15
/*     */       //   334: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   337: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   340: ifne -> 369
/*     */       //   343: aload #25
/*     */       //   345: iload #15
/*     */       //   347: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   350: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   355: aload #21
/*     */       //   357: iload #15
/*     */       //   359: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   362: aload #23
/*     */       //   364: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   369: nop
/*     */       //   370: nop
/*     */       //   371: nop
/*     */       //   372: aload #21
/*     */       //   374: aload #17
/*     */       //   376: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   379: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */       //   382: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   385: nop
/*     */       //   386: nop
/*     */       //   387: aload_2
/*     */       //   388: bipush #14
/*     */       //   390: iload #19
/*     */       //   392: bipush #6
/*     */       //   394: ishr
/*     */       //   395: iand
/*     */       //   396: istore #27
/*     */       //   398: astore #28
/*     */       //   400: iconst_0
/*     */       //   401: istore #29
/*     */       //   403: aload #28
/*     */       //   405: ldc -407840262
/*     */       //   407: ldc 'C101@5126L9:Row.kt#2w3rfo'
/*     */       //   409: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   412: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */       //   415: aload #28
/*     */       //   417: bipush #6
/*     */       //   419: bipush #112
/*     */       //   421: iload #10
/*     */       //   423: bipush #6
/*     */       //   425: ishr
/*     */       //   426: iand
/*     */       //   427: ior
/*     */       //   428: istore #30
/*     */       //   430: astore #31
/*     */       //   432: checkcast androidx/compose/foundation/layout/RowScope
/*     */       //   435: astore #32
/*     */       //   437: iconst_0
/*     */       //   438: istore #33
/*     */       //   440: ldc 'Terminal'
/*     */       //   442: aconst_null
/*     */       //   443: lconst_0
/*     */       //   444: lconst_0
/*     */       //   445: aconst_null
/*     */       //   446: aconst_null
/*     */       //   447: aload #31
/*     */       //   449: iconst_0
/*     */       //   450: invokestatic getMatterhornTheme : (Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/ej/ui/theming/MatterhornThemeData;
/*     */       //   453: aload #31
/*     */       //   455: iconst_0
/*     */       //   456: invokevirtual getMessageFont : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/font/FontFamily;
/*     */       //   459: lconst_0
/*     */       //   460: aconst_null
/*     */       //   461: iconst_0
/*     */       //   462: lconst_0
/*     */       //   463: iconst_0
/*     */       //   464: iconst_0
/*     */       //   465: iconst_0
/*     */       //   466: aconst_null
/*     */       //   467: aconst_null
/*     */       //   468: aload #31
/*     */       //   470: bipush #6
/*     */       //   472: iconst_0
/*     */       //   473: ldc 65470
/*     */       //   475: invokestatic Text-bAzTDeA : (Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;IJIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V
/*     */       //   478: aload #31
/*     */       //   480: ldc -379672534
/*     */       //   482: invokeinterface startReplaceGroup : (I)V
/*     */       //   487: aload #7
/*     */       //   489: ifnull -> 651
/*     */       //   492: nop
/*     */       //   493: aload #9
/*     */       //   495: invokestatic access$TerminalStep$lambda$3 : (Landroidx/compose/runtime/MutableState;)Z
/*     */       //   498: ifeq -> 506
/*     */       //   501: ldc 'Cancelling'
/*     */       //   503: goto -> 508
/*     */       //   506: ldc 'Cancel Step'
/*     */       //   508: astore #34
/*     */       //   510: aload #9
/*     */       //   512: invokestatic access$TerminalStep$lambda$3 : (Landroidx/compose/runtime/MutableState;)Z
/*     */       //   515: ifne -> 522
/*     */       //   518: iconst_1
/*     */       //   519: goto -> 523
/*     */       //   522: iconst_0
/*     */       //   523: istore #35
/*     */       //   525: aload #34
/*     */       //   527: aload #31
/*     */       //   529: ldc -379664497
/*     */       //   531: invokeinterface startReplaceGroup : (I)V
/*     */       //   536: aload #31
/*     */       //   538: astore #36
/*     */       //   540: aload #31
/*     */       //   542: aload #7
/*     */       //   544: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   549: istore #37
/*     */       //   551: nop
/*     */       //   552: iconst_0
/*     */       //   553: istore #38
/*     */       //   555: aload #36
/*     */       //   557: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   562: astore #39
/*     */       //   564: iconst_0
/*     */       //   565: istore #40
/*     */       //   567: iload #37
/*     */       //   569: ifne -> 583
/*     */       //   572: aload #39
/*     */       //   574: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   577: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   580: if_acmpne -> 616
/*     */       //   583: astore #41
/*     */       //   585: iconst_0
/*     */       //   586: istore #42
/*     */       //   588: aload #7
/*     */       //   590: aload #9
/*     */       //   592: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*     */       //   597: aload #41
/*     */       //   599: swap
/*     */       //   600: astore #43
/*     */       //   602: aload #36
/*     */       //   604: aload #43
/*     */       //   606: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   611: aload #43
/*     */       //   613: goto -> 618
/*     */       //   616: aload #39
/*     */       //   618: nop
/*     */       //   619: nop
/*     */       //   620: nop
/*     */       //   621: checkcast kotlin/jvm/functions/Function0
/*     */       //   624: astore #44
/*     */       //   626: aload #31
/*     */       //   628: invokeinterface endReplaceGroup : ()V
/*     */       //   633: aload #44
/*     */       //   635: aconst_null
/*     */       //   636: iload #35
/*     */       //   638: aconst_null
/*     */       //   639: iconst_0
/*     */       //   640: aconst_null
/*     */       //   641: aconst_null
/*     */       //   642: aload #31
/*     */       //   644: iconst_0
/*     */       //   645: sipush #244
/*     */       //   648: invokestatic Link-kye4rC8 : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V
/*     */       //   651: aload #31
/*     */       //   653: invokeinterface endReplaceGroup : ()V
/*     */       //   658: aload #32
/*     */       //   660: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   663: checkcast androidx/compose/ui/Modifier
/*     */       //   666: fconst_1
/*     */       //   667: iconst_0
/*     */       //   668: iconst_2
/*     */       //   669: aconst_null
/*     */       //   670: invokestatic weight$default : (Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   673: aload #31
/*     */       //   675: iconst_0
/*     */       //   676: invokestatic Spacer : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */       //   679: aload #31
/*     */       //   681: ldc_w -379659799
/*     */       //   684: invokeinterface startReplaceGroup : (I)V
/*     */       //   689: aload #8
/*     */       //   691: ifnull -> 1109
/*     */       //   694: iconst_0
/*     */       //   695: istore #36
/*     */       //   697: nop
/*     */       //   698: iconst_0
/*     */       //   699: istore #37
/*     */       //   701: aload #31
/*     */       //   703: ldc_w 733328855
/*     */       //   706: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */       //   709: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   712: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   715: checkcast androidx/compose/ui/Modifier
/*     */       //   718: astore #34
/*     */       //   720: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */       //   723: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */       //   726: astore #35
/*     */       //   728: iconst_0
/*     */       //   729: istore #44
/*     */       //   731: aload #35
/*     */       //   733: iload #44
/*     */       //   735: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   738: astore #38
/*     */       //   740: bipush #112
/*     */       //   742: iload #36
/*     */       //   744: iconst_3
/*     */       //   745: ishl
/*     */       //   746: iand
/*     */       //   747: istore #39
/*     */       //   749: nop
/*     */       //   750: iconst_0
/*     */       //   751: istore #40
/*     */       //   753: aload #31
/*     */       //   755: ldc -1323940314
/*     */       //   757: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */       //   759: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   762: aload #31
/*     */       //   764: iconst_0
/*     */       //   765: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */       //   768: istore #42
/*     */       //   770: aload #31
/*     */       //   772: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   777: astore #43
/*     */       //   779: aload #31
/*     */       //   781: aload #34
/*     */       //   783: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */       //   786: astore #45
/*     */       //   788: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   791: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */       //   794: astore #46
/*     */       //   796: bipush #6
/*     */       //   798: sipush #896
/*     */       //   801: iload #39
/*     */       //   803: bipush #6
/*     */       //   805: ishl
/*     */       //   806: iand
/*     */       //   807: ior
/*     */       //   808: istore #47
/*     */       //   810: nop
/*     */       //   811: iconst_0
/*     */       //   812: istore #48
/*     */       //   814: aload #31
/*     */       //   816: ldc -692256719
/*     */       //   818: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */       //   820: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   823: aload #31
/*     */       //   825: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */       //   830: instanceof androidx/compose/runtime/Applier
/*     */       //   833: ifne -> 839
/*     */       //   836: invokestatic invalidApplier : ()V
/*     */       //   839: aload #31
/*     */       //   841: invokeinterface startReusableNode : ()V
/*     */       //   846: aload #31
/*     */       //   848: invokeinterface getInserting : ()Z
/*     */       //   853: ifeq -> 868
/*     */       //   856: aload #31
/*     */       //   858: aload #46
/*     */       //   860: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */       //   865: goto -> 875
/*     */       //   868: aload #31
/*     */       //   870: invokeinterface useNode : ()V
/*     */       //   875: aload #31
/*     */       //   877: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */       //   880: astore #49
/*     */       //   882: iconst_0
/*     */       //   883: istore #50
/*     */       //   885: aload #49
/*     */       //   887: aload #38
/*     */       //   889: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   892: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */       //   895: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   898: aload #49
/*     */       //   900: aload #43
/*     */       //   902: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   905: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */       //   908: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   911: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   914: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */       //   917: astore #51
/*     */       //   919: iconst_0
/*     */       //   920: istore #52
/*     */       //   922: aload #49
/*     */       //   924: astore #53
/*     */       //   926: iconst_0
/*     */       //   927: istore #54
/*     */       //   929: aload #53
/*     */       //   931: invokeinterface getInserting : ()Z
/*     */       //   936: ifne -> 957
/*     */       //   939: aload #53
/*     */       //   941: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   946: iload #42
/*     */       //   948: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   951: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   954: ifne -> 983
/*     */       //   957: aload #53
/*     */       //   959: iload #42
/*     */       //   961: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   964: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   969: aload #49
/*     */       //   971: iload #42
/*     */       //   973: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   976: aload #51
/*     */       //   978: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   983: nop
/*     */       //   984: nop
/*     */       //   985: nop
/*     */       //   986: aload #49
/*     */       //   988: aload #45
/*     */       //   990: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   993: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */       //   996: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   999: nop
/*     */       //   1000: nop
/*     */       //   1001: aload #31
/*     */       //   1003: bipush #14
/*     */       //   1005: iload #47
/*     */       //   1007: bipush #6
/*     */       //   1009: ishr
/*     */       //   1010: iand
/*     */       //   1011: istore #55
/*     */       //   1013: astore #56
/*     */       //   1015: iconst_0
/*     */       //   1016: istore #57
/*     */       //   1018: aload #56
/*     */       //   1020: ldc_w -2146769399
/*     */       //   1023: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */       //   1026: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   1029: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */       //   1032: aload #56
/*     */       //   1034: bipush #6
/*     */       //   1036: bipush #112
/*     */       //   1038: iload #36
/*     */       //   1040: bipush #6
/*     */       //   1042: ishr
/*     */       //   1043: iand
/*     */       //   1044: ior
/*     */       //   1045: istore #58
/*     */       //   1047: astore #59
/*     */       //   1049: checkcast androidx/compose/foundation/layout/BoxScope
/*     */       //   1052: astore #60
/*     */       //   1054: iconst_0
/*     */       //   1055: istore #61
/*     */       //   1057: ldc_w 'Open'
/*     */       //   1060: aload #8
/*     */       //   1062: aconst_null
/*     */       //   1063: iconst_0
/*     */       //   1064: aconst_null
/*     */       //   1065: iconst_0
/*     */       //   1066: aconst_null
/*     */       //   1067: aconst_null
/*     */       //   1068: aload #59
/*     */       //   1070: bipush #6
/*     */       //   1072: sipush #252
/*     */       //   1075: invokestatic Link-kye4rC8 : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/text/TextStyle;ILandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/LinkStyle;Landroidx/compose/runtime/Composer;II)V
/*     */       //   1078: nop
/*     */       //   1079: aload #56
/*     */       //   1081: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   1084: aload #31
/*     */       //   1086: invokeinterface endNode : ()V
/*     */       //   1091: aload #31
/*     */       //   1093: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   1096: nop
/*     */       //   1097: aload #31
/*     */       //   1099: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   1102: nop
/*     */       //   1103: aload #31
/*     */       //   1105: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   1108: nop
/*     */       //   1109: aload #31
/*     */       //   1111: invokeinterface endReplaceGroup : ()V
/*     */       //   1116: nop
/*     */       //   1117: aload #28
/*     */       //   1119: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   1122: aload_2
/*     */       //   1123: invokeinterface endNode : ()V
/*     */       //   1128: aload_2
/*     */       //   1129: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   1132: nop
/*     */       //   1133: aload_2
/*     */       //   1134: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   1137: nop
/*     */       //   1138: aload_2
/*     */       //   1139: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   1142: nop
/*     */       //   1143: invokestatic isTraceInProgress : ()Z
/*     */       //   1146: ifeq -> 1161
/*     */       //   1149: invokestatic traceEventEnd : ()V
/*     */       //   1152: goto -> 1161
/*     */       //   1155: aload_2
/*     */       //   1156: invokeinterface skipToGroupEnd : ()V
/*     */       //   1161: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #56	-> 6
/*     */       //   #57	-> 39
/*     */       //   #58	-> 47
/*     */       //   #105	-> 56
/*     */       //   #58	-> 62
/*     */       //   #56	-> 67
/*     */       //   #106	-> 98
/*     */       //   #107	-> 101
/*     */       //   #112	-> 109
/*     */       //   #113	-> 146
/*     */       //   #114	-> 155
/*     */       //   #115	-> 160
/*     */       //   #116	-> 166
/*     */       //   #117	-> 174
/*     */       //   #119	-> 181
/*     */       //   #118	-> 203
/*     */       //   #120	-> 212
/*     */       //   #121	-> 215
/*     */       //   #122	-> 231
/*     */       //   #123	-> 236
/*     */       //   #124	-> 246
/*     */       //   #126	-> 257
/*     */       //   #128	-> 262
/*     */       //   #129	-> 271
/*     */       //   #130	-> 284
/*     */       //   #132	-> 297
/*     */       //   #133	-> 308
/*     */       //   #134	-> 315
/*     */       //   #135	-> 343
/*     */       //   #136	-> 355
/*     */       //   #138	-> 369
/*     */       //   #133	-> 370
/*     */       //   #138	-> 371
/*     */       //   #139	-> 372
/*     */       //   #140	-> 385
/*     */       //   #128	-> 386
/*     */       //   #141	-> 387
/*     */       //   #142	-> 409
/*     */       //   #61	-> 440
/*     */       //   #62	-> 450
/*     */       //   #60	-> 475
/*     */       //   #64	-> 487
/*     */       //   #66	-> 492
/*     */       //   #67	-> 493
/*     */       //   #68	-> 506
/*     */       //   #66	-> 508
/*     */       //   #65	-> 508
/*     */       //   #72	-> 510
/*     */       //   #71	-> 525
/*     */       //   #73	-> 551
/*     */       //   #143	-> 555
/*     */       //   #144	-> 567
/*     */       //   #145	-> 583
/*     */       //   #73	-> 588
/*     */       //   #145	-> 600
/*     */       //   #146	-> 602
/*     */       //   #147	-> 611
/*     */       //   #148	-> 616
/*     */       //   #144	-> 618
/*     */       //   #143	-> 619
/*     */       //   #143	-> 620
/*     */       //   #73	-> 621
/*     */       //   #72	-> 636
/*     */       //   #70	-> 648
/*     */       //   #79	-> 658
/*     */       //   #80	-> 689
/*     */       //   #81	-> 697
/*     */       //   #149	-> 709
/*     */       //   #150	-> 712
/*     */       //   #151	-> 720
/*     */       //   #152	-> 728
/*     */       //   #155	-> 731
/*     */       //   #156	-> 749
/*     */       //   #157	-> 759
/*     */       //   #158	-> 765
/*     */       //   #159	-> 772
/*     */       //   #160	-> 781
/*     */       //   #162	-> 788
/*     */       //   #161	-> 810
/*     */       //   #163	-> 820
/*     */       //   #164	-> 823
/*     */       //   #165	-> 841
/*     */       //   #166	-> 846
/*     */       //   #167	-> 858
/*     */       //   #169	-> 870
/*     */       //   #171	-> 875
/*     */       //   #172	-> 885
/*     */       //   #173	-> 898
/*     */       //   #175	-> 911
/*     */       //   #176	-> 922
/*     */       //   #177	-> 929
/*     */       //   #178	-> 957
/*     */       //   #179	-> 969
/*     */       //   #181	-> 983
/*     */       //   #176	-> 984
/*     */       //   #181	-> 985
/*     */       //   #182	-> 986
/*     */       //   #183	-> 999
/*     */       //   #171	-> 1000
/*     */       //   #184	-> 1001
/*     */       //   #185	-> 1026
/*     */       //   #82	-> 1057
/*     */       //   #83	-> 1078
/*     */       //   #185	-> 1079
/*     */       //   #184	-> 1084
/*     */       //   #186	-> 1086
/*     */       //   #163	-> 1093
/*     */       //   #187	-> 1096
/*     */       //   #157	-> 1099
/*     */       //   #188	-> 1102
/*     */       //   #149	-> 1105
/*     */       //   #189	-> 1108
/*     */       //   #85	-> 1116
/*     */       //   #142	-> 1117
/*     */       //   #141	-> 1122
/*     */       //   #190	-> 1123
/*     */       //   #120	-> 1129
/*     */       //   #191	-> 1132
/*     */       //   #114	-> 1134
/*     */       //   #192	-> 1137
/*     */       //   #106	-> 1139
/*     */       //   #193	-> 1142
/*     */       //   #85	-> 1155
/*     */       //   #86	-> 1161
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   56	6	7	$i$f$getDp	I
/*     */       //   53	9	6	$this$dp$iv	I
/*     */       //   588	9	42	$i$a$-cache-TerminalStepKt$TerminalStep$3$1$1	I
/*     */       //   602	11	43	value$iv	Ljava/lang/Object;
/*     */       //   567	52	40	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   564	55	39	it$iv	Ljava/lang/Object;
/*     */       //   555	66	38	$i$f$cache	I
/*     */       //   552	69	36	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   552	69	37	invalid$iv	Z
/*     */       //   510	141	34	text	Ljava/lang/String;
/*     */       //   1057	22	61	$i$a$-Box-TerminalStepKt$TerminalStep$3$1$2	I
/*     */       //   1054	25	60	$this$invoke_u24lambda_u243_u24lambda_u242	Landroidx/compose/foundation/layout/BoxScope;
/*     */       //   1054	25	59	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   1054	25	58	$changed	I
/*     */       //   1018	66	57	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */       //   1015	69	56	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */       //   1015	69	55	$changed$iv	I
/*     */       //   929	55	54	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */       //   926	58	53	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   922	64	52	$i$f$set-impl	I
/*     */       //   919	67	51	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */       //   885	115	50	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */       //   882	118	49	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   814	283	48	$i$f$ReusableComposeNode	I
/*     */       //   811	286	46	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */       //   811	286	47	$changed$iv$iv$iv	I
/*     */       //   753	350	40	$i$f$Layout	I
/*     */       //   770	333	42	compositeKeyHash$iv$iv	I
/*     */       //   779	324	43	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   788	315	45	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */       //   750	353	39	$changed$iv$iv	I
/*     */       //   701	408	37	$i$f$Box	I
/*     */       //   740	369	38	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   720	389	34	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */       //   728	381	35	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */       //   731	378	44	propagateMinConstraints$iv	Z
/*     */       //   698	411	36	$changed$iv	I
/*     */       //   440	677	33	$i$a$-Row-TerminalStepKt$TerminalStep$3$1	I
/*     */       //   437	680	32	$this$invoke_u24lambda_u243	Landroidx/compose/foundation/layout/RowScope;
/*     */       //   437	680	31	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   437	680	30	$changed	I
/*     */       //   403	719	29	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */       //   400	722	28	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */       //   400	722	27	$changed$iv	I
/*     */       //   315	55	26	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */       //   312	58	25	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   308	64	24	$i$f$set-impl	I
/*     */       //   305	67	23	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */       //   271	115	22	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */       //   268	118	21	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   207	926	20	$i$f$ReusableComposeNode	I
/*     */       //   204	929	18	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */       //   204	929	19	$changed$iv$iv$iv	I
/*     */       //   150	988	14	$i$f$Layout	I
/*     */       //   165	973	15	compositeKeyHash$iv$iv	I
/*     */       //   173	965	16	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   181	957	17	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */       //   147	991	13	$changed$iv$iv	I
/*     */       //   93	1050	11	$i$f$Row	I
/*     */       //   137	1006	12	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   109	1034	6	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */       //   90	1053	10	$changed$iv	I
/*     */       //   0	1162	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/steps/TerminalStepKt$TerminalStep$3;
/*     */       //   0	1162	1	$this$StepCard	Landroidx/compose/foundation/layout/RowScope;
/*     */       //   0	1162	2	$composer	Landroidx/compose/runtime/Composer;
/* 118 */       //   0	1162	3	$changed	I } private static final Unit invoke$lambda$3$lambda$1$lambda$0(Function0 $onStopClick, MutableState $isCancelling$delegate) { TerminalStepKt.TerminalStep$lambda$4($isCancelling$delegate, true); $onStopClick.invoke(); return Unit.INSTANCE; } TerminalStepKt$TerminalStep$3(Function0<Unit> $onStopClick, Function0<Unit> $onOpenTerminalClick, MutableState<Boolean> $isCancelling$delegate) {} } private static final void TerminalStep$lambda$4(MutableState $isCancelling$delegate, boolean <set-?>) { MutableState mutableState = $isCancelling$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0; mutableState.setValue(value$iv); } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nTerminalStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/steps/TerminalStepKt$TerminalStep$4\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,104:1\n86#2:105\n82#2,7:106\n89#2:141\n93#2:146\n79#3,6:113\n86#3,4:128\n90#3,2:138\n94#3:145\n368#4,9:119\n377#4:140\n378#4,2:143\n4034#5,6:132\n149#6:142\n*S KotlinDebug\n*F\n+ 1 TerminalStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/steps/TerminalStepKt$TerminalStep$4\n*L\n88#1:105\n88#1:106,7\n88#1:141\n88#1:146\n88#1:113,6\n88#1:128,4\n88#1:138,2\n88#1:145\n88#1:119,9\n88#1:140\n88#1:143,2\n88#1:132,6\n94#1:142\n*E\n"}) static final class TerminalStepKt$TerminalStep$4 implements Function3<ColumnScope, Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(ColumnScope $this$StepCard, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(181515142, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.steps.TerminalStep.<anonymous> (TerminalStep.kt:87)");  String str1 = this.$command; List<String> list = this.$actionNames; Function1<Integer, Unit> function1 = this.$onActionClick; String str2 = this.$description; int $changed$iv = 0, $i$f$Column = 0; ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo"); Modifier modifier$iv = (Modifier)Modifier.Companion; Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop(); Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart(); MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3); int $changed$iv$iv = 0x70 & $changed$iv << 3; int $i$f$Layout = 0; ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"); int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0); CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap(); Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv); Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 119 */         ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 120 */         if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 121 */           .startReusableNode();
/* 122 */         if ($composer.getInserting()) { $composer
/* 123 */             .createNode(function0); } else { $composer
/*     */             
/* 125 */             .useNode(); }
/*     */         
/* 127 */         Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 128 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 129 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */         
/* 131 */         Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 132 */         Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 133 */         if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 134 */           $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 135 */           $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */         } 
/*     */         
/* 138 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */         
/* 140 */         int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-ColumnKt$Column$1$iv = 0;
/* 141 */         ComposerKt.sourceInformationMarkerStart($composer$iv, -384784025, "C88@4444L9:Column.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; ColumnScope $this$invoke_u24lambda_u240 = (ColumnScope)ColumnScopeInstance.INSTANCE; int $i$a$-Column-TerminalStepKt$TerminalStep$4$1 = 0; DisplayCommandWithActionsKt.DisplayCommandWithActions(str1, null, list, function1, composer1, 0, 2); int $this$dp$iv = 8, $i$f$getDp = 0;
/* 142 */         SpacerKt.Spacer(SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl($this$dp$iv)), composer1, 6); TextContainerKt.TextContainer(str2, composer1, 0); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 143 */         $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 144 */         ComposerKt.sourceInformationMarkerEnd($composer);
/* 145 */         ComposerKt.sourceInformationMarkerEnd($composer);
/* 146 */         if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*     */       else
/*     */       { $composer.skipToGroupEnd(); }
/*     */        }
/*     */ 
/*     */     
/*     */     TerminalStepKt$TerminalStep$4(String $command, List<String> $actionNames, Function1<Integer, Unit> $onActionClick, String $description) {} }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class TerminalStepKt$TerminalStep$5 implements Function3<RowScope, Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(RowScope $this$StepCard, Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard");
/*     */       if (($changed & 0x11) != 16 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(1807387853, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.steps.TerminalStep.<anonymous> (TerminalStep.kt:98)"); 
/*     */         $composer.startReplaceGroup(-861704843);
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
/*     */     TerminalStepKt$TerminalStep$5(Function0<Unit> $onApproveActionClick, Function0<Unit> $onSkipActionClick) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\steps\TerminalStepKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */