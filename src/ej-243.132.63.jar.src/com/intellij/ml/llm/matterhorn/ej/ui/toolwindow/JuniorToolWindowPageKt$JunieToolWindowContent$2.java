/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.toolwindow;
/*    */ 
/*    */ import androidx.compose.foundation.layout.BoxWithConstraintsScope;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.State;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.JuniePreconditionChecker;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.activation.GrazieQuotaWarning;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.vm.ViewModel;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.AdaptedFunctionReference;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
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
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ @SourceDebugExtension({"SMAP\nJuniorToolWindowPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JuniorToolWindowPage.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowPageKt$JunieToolWindowContent$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,95:1\n71#2:96\n69#2,5:97\n74#2:130\n78#2:134\n79#3,6:102\n86#3,4:117\n90#3,2:127\n94#3:133\n368#4,9:108\n377#4:129\n378#4,2:131\n4034#5,6:121\n1225#6,6:135\n1225#6,6:141\n1225#6,6:147\n*S KotlinDebug\n*F\n+ 1 JuniorToolWindowPage.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowPageKt$JunieToolWindowContent$2\n*L\n58#1:96\n58#1:97,5\n58#1:130\n58#1:134\n58#1:102,6\n58#1:117,4\n58#1:127,2\n58#1:133\n58#1:108,9\n58#1:129\n58#1:131,2\n58#1:121,6\n72#1:135,6\n77#1:141,6\n86#1:147,6\n*E\n"})
/*    */ final class JuniorToolWindowPageKt$JunieToolWindowContent$2
/*    */   implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(BoxWithConstraintsScope $this$JunieSurfaceWithConstraints, Composer $composer, int $changed) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc '$this$JunieSurfaceWithConstraints'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: iload_3
/*    */     //   7: istore #4
/*    */     //   9: iload_3
/*    */     //   10: bipush #6
/*    */     //   12: iand
/*    */     //   13: ifne -> 36
/*    */     //   16: iload #4
/*    */     //   18: aload_2
/*    */     //   19: aload_1
/*    */     //   20: invokeinterface changed : (Ljava/lang/Object;)Z
/*    */     //   25: ifeq -> 32
/*    */     //   28: iconst_4
/*    */     //   29: goto -> 33
/*    */     //   32: iconst_2
/*    */     //   33: ior
/*    */     //   34: istore #4
/*    */     //   36: iload #4
/*    */     //   38: bipush #19
/*    */     //   40: iand
/*    */     //   41: bipush #18
/*    */     //   43: if_icmpne -> 55
/*    */     //   46: aload_2
/*    */     //   47: invokeinterface getSkipping : ()Z
/*    */     //   52: ifne -> 1121
/*    */     //   55: invokestatic isTraceInProgress : ()Z
/*    */     //   58: ifeq -> 71
/*    */     //   61: ldc -1366488609
/*    */     //   63: iload #4
/*    */     //   65: iconst_m1
/*    */     //   66: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.JunieToolWindowContent.<anonymous> (JuniorToolWindowPage.kt:50)'
/*    */     //   68: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*    */     //   71: aload_2
/*    */     //   72: ldc 1535553839
/*    */     //   74: invokeinterface startReplaceGroup : (I)V
/*    */     //   79: aload_0
/*    */     //   80: getfield $model : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*    */     //   83: invokevirtual getJunieFatalIssues : ()Ljava/util/List;
/*    */     //   86: checkcast java/util/Collection
/*    */     //   89: invokeinterface isEmpty : ()Z
/*    */     //   94: ifne -> 101
/*    */     //   97: iconst_1
/*    */     //   98: goto -> 102
/*    */     //   101: iconst_0
/*    */     //   102: ifeq -> 135
/*    */     //   105: aconst_null
/*    */     //   106: aload_0
/*    */     //   107: getfield $model : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*    */     //   110: invokevirtual getJunieFatalIssues : ()Ljava/util/List;
/*    */     //   113: aload_2
/*    */     //   114: iconst_0
/*    */     //   115: iconst_1
/*    */     //   116: invokestatic LockScreen : (Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V
/*    */     //   119: invokestatic isTraceInProgress : ()Z
/*    */     //   122: ifeq -> 128
/*    */     //   125: invokestatic traceEventEnd : ()V
/*    */     //   128: aload_2
/*    */     //   129: invokeinterface endReplaceGroup : ()V
/*    */     //   134: return
/*    */     //   135: aload_2
/*    */     //   136: invokeinterface endReplaceGroup : ()V
/*    */     //   141: aload_0
/*    */     //   142: getfield $currentPage$delegate : Landroidx/compose/runtime/State;
/*    */     //   145: invokestatic access$JunieToolWindowContent$lambda$0 : (Landroidx/compose/runtime/State;)Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;
/*    */     //   148: astore #5
/*    */     //   150: aload_2
/*    */     //   151: ldc 1535559691
/*    */     //   153: invokeinterface startReplaceGroup : (I)V
/*    */     //   158: aload #5
/*    */     //   160: ifnonnull -> 569
/*    */     //   163: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*    */     //   166: checkcast androidx/compose/ui/Modifier
/*    */     //   169: fconst_0
/*    */     //   170: iconst_1
/*    */     //   171: aconst_null
/*    */     //   172: invokestatic fillMaxSize$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*    */     //   175: astore #6
/*    */     //   177: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*    */     //   180: invokevirtual getCenter : ()Landroidx/compose/ui/Alignment;
/*    */     //   183: astore #7
/*    */     //   185: bipush #54
/*    */     //   187: istore #9
/*    */     //   189: iconst_0
/*    */     //   190: istore #10
/*    */     //   192: aload_2
/*    */     //   193: ldc 733328855
/*    */     //   195: ldc 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*    */     //   197: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   200: iconst_0
/*    */     //   201: istore #8
/*    */     //   203: aload #7
/*    */     //   205: iload #8
/*    */     //   207: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   210: astore #11
/*    */     //   212: bipush #112
/*    */     //   214: iload #9
/*    */     //   216: iconst_3
/*    */     //   217: ishl
/*    */     //   218: iand
/*    */     //   219: istore #12
/*    */     //   221: nop
/*    */     //   222: iconst_0
/*    */     //   223: istore #13
/*    */     //   225: aload_2
/*    */     //   226: ldc -1323940314
/*    */     //   228: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*    */     //   230: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   233: aload_2
/*    */     //   234: iconst_0
/*    */     //   235: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*    */     //   238: istore #14
/*    */     //   240: aload_2
/*    */     //   241: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   246: astore #15
/*    */     //   248: aload_2
/*    */     //   249: aload #6
/*    */     //   251: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*    */     //   254: astore #16
/*    */     //   256: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   259: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*    */     //   262: astore #17
/*    */     //   264: bipush #6
/*    */     //   266: sipush #896
/*    */     //   269: iload #12
/*    */     //   271: bipush #6
/*    */     //   273: ishl
/*    */     //   274: iand
/*    */     //   275: ior
/*    */     //   276: istore #18
/*    */     //   278: nop
/*    */     //   279: iconst_0
/*    */     //   280: istore #19
/*    */     //   282: aload_2
/*    */     //   283: ldc -692256719
/*    */     //   285: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*    */     //   287: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   290: aload_2
/*    */     //   291: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*    */     //   296: instanceof androidx/compose/runtime/Applier
/*    */     //   299: ifne -> 305
/*    */     //   302: invokestatic invalidApplier : ()V
/*    */     //   305: aload_2
/*    */     //   306: invokeinterface startReusableNode : ()V
/*    */     //   311: aload_2
/*    */     //   312: invokeinterface getInserting : ()Z
/*    */     //   317: ifeq -> 331
/*    */     //   320: aload_2
/*    */     //   321: aload #17
/*    */     //   323: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   328: goto -> 337
/*    */     //   331: aload_2
/*    */     //   332: invokeinterface useNode : ()V
/*    */     //   337: aload_2
/*    */     //   338: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*    */     //   341: astore #20
/*    */     //   343: iconst_0
/*    */     //   344: istore #21
/*    */     //   346: aload #20
/*    */     //   348: aload #11
/*    */     //   350: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   353: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*    */     //   356: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   359: aload #20
/*    */     //   361: aload #15
/*    */     //   363: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   366: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*    */     //   369: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   372: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   375: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*    */     //   378: astore #22
/*    */     //   380: iconst_0
/*    */     //   381: istore #23
/*    */     //   383: aload #20
/*    */     //   385: astore #24
/*    */     //   387: iconst_0
/*    */     //   388: istore #25
/*    */     //   390: aload #24
/*    */     //   392: invokeinterface getInserting : ()Z
/*    */     //   397: ifne -> 418
/*    */     //   400: aload #24
/*    */     //   402: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   407: iload #14
/*    */     //   409: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   412: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   415: ifne -> 444
/*    */     //   418: aload #24
/*    */     //   420: iload #14
/*    */     //   422: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   425: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   430: aload #20
/*    */     //   432: iload #14
/*    */     //   434: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   437: aload #22
/*    */     //   439: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   444: nop
/*    */     //   445: nop
/*    */     //   446: nop
/*    */     //   447: aload #20
/*    */     //   449: aload #16
/*    */     //   451: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*    */     //   454: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*    */     //   457: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*    */     //   460: nop
/*    */     //   461: nop
/*    */     //   462: aload_2
/*    */     //   463: bipush #14
/*    */     //   465: iload #18
/*    */     //   467: bipush #6
/*    */     //   469: ishr
/*    */     //   470: iand
/*    */     //   471: istore #26
/*    */     //   473: astore #27
/*    */     //   475: iconst_0
/*    */     //   476: istore #28
/*    */     //   478: aload #27
/*    */     //   480: ldc -2146769399
/*    */     //   482: ldc 'C73@3429L9:Box.kt#2w3rfo'
/*    */     //   484: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*    */     //   487: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*    */     //   490: aload #27
/*    */     //   492: bipush #6
/*    */     //   494: bipush #112
/*    */     //   496: iload #9
/*    */     //   498: bipush #6
/*    */     //   500: ishr
/*    */     //   501: iand
/*    */     //   502: ior
/*    */     //   503: istore #29
/*    */     //   505: astore #30
/*    */     //   507: checkcast androidx/compose/foundation/layout/BoxScope
/*    */     //   510: astore #31
/*    */     //   512: iconst_0
/*    */     //   513: istore #32
/*    */     //   515: aconst_null
/*    */     //   516: lconst_0
/*    */     //   517: aconst_null
/*    */     //   518: aload #30
/*    */     //   520: iconst_0
/*    */     //   521: bipush #7
/*    */     //   523: invokestatic JunieCircularProgressIndicator-3IgeMak : (Landroidx/compose/ui/Modifier;JLjava/lang/String;Landroidx/compose/runtime/Composer;II)V
/*    */     //   526: nop
/*    */     //   527: aload #27
/*    */     //   529: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   532: aload_2
/*    */     //   533: invokeinterface endNode : ()V
/*    */     //   538: aload_2
/*    */     //   539: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   542: nop
/*    */     //   543: aload_2
/*    */     //   544: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   547: nop
/*    */     //   548: aload_2
/*    */     //   549: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*    */     //   552: nop
/*    */     //   553: invokestatic isTraceInProgress : ()Z
/*    */     //   556: ifeq -> 562
/*    */     //   559: invokestatic traceEventEnd : ()V
/*    */     //   562: aload_2
/*    */     //   563: invokeinterface endReplaceGroup : ()V
/*    */     //   568: return
/*    */     //   569: aload_2
/*    */     //   570: invokeinterface endReplaceGroup : ()V
/*    */     //   575: aload_1
/*    */     //   576: invokeinterface getMaxWidth-D9Ej5fM : ()F
/*    */     //   581: aload_0
/*    */     //   582: getfield $singleColumnThreshold : F
/*    */     //   585: invokestatic compareTo-0680j_4 : (FF)I
/*    */     //   588: ifge -> 595
/*    */     //   591: iconst_1
/*    */     //   592: goto -> 596
/*    */     //   595: iconst_0
/*    */     //   596: istore #6
/*    */     //   598: iload #6
/*    */     //   600: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*    */     //   603: ldc_w 'columnTransition'
/*    */     //   606: aload_2
/*    */     //   607: bipush #48
/*    */     //   609: iconst_0
/*    */     //   610: invokestatic updateTransition : (Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;
/*    */     //   613: astore #7
/*    */     //   615: iload #6
/*    */     //   617: ifne -> 636
/*    */     //   620: aload #5
/*    */     //   622: instanceof com/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl
/*    */     //   625: ifne -> 636
/*    */     //   628: aload #5
/*    */     //   630: instanceof com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationPageVm
/*    */     //   633: ifeq -> 947
/*    */     //   636: aload_2
/*    */     //   637: ldc_w 358237787
/*    */     //   640: invokeinterface startReplaceGroup : (I)V
/*    */     //   645: aload_0
/*    */     //   646: getfield $junieProblems$delegate : Landroidx/compose/runtime/State;
/*    */     //   649: invokestatic access$JunieToolWindowContent$lambda$1 : (Landroidx/compose/runtime/State;)Ljava/util/List;
/*    */     //   652: aload_0
/*    */     //   653: getfield $quotaWarning$delegate : Landroidx/compose/runtime/State;
/*    */     //   656: invokestatic access$JunieToolWindowContent$lambda$2 : (Landroidx/compose/runtime/State;)Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;
/*    */     //   659: aload #5
/*    */     //   661: aload_2
/*    */     //   662: ldc_w 1535581487
/*    */     //   665: invokeinterface startReplaceGroup : (I)V
/*    */     //   670: aload_2
/*    */     //   671: astore #9
/*    */     //   673: aload_2
/*    */     //   674: aload_0
/*    */     //   675: getfield $model : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*    */     //   678: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   683: istore #10
/*    */     //   685: aload_0
/*    */     //   686: getfield $model : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*    */     //   689: astore #11
/*    */     //   691: iconst_0
/*    */     //   692: istore #12
/*    */     //   694: aload #9
/*    */     //   696: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   701: astore #13
/*    */     //   703: iconst_0
/*    */     //   704: istore #14
/*    */     //   706: iload #10
/*    */     //   708: ifne -> 722
/*    */     //   711: aload #13
/*    */     //   713: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   716: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   719: if_acmpne -> 764
/*    */     //   722: astore #35
/*    */     //   724: astore #34
/*    */     //   726: astore #33
/*    */     //   728: iconst_0
/*    */     //   729: istore #15
/*    */     //   731: aload #11
/*    */     //   733: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;)Lkotlin/jvm/functions/Function0;
/*    */     //   738: astore #36
/*    */     //   740: aload #33
/*    */     //   742: aload #34
/*    */     //   744: aload #35
/*    */     //   746: aload #36
/*    */     //   748: astore #16
/*    */     //   750: aload #9
/*    */     //   752: aload #16
/*    */     //   754: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   759: aload #16
/*    */     //   761: goto -> 766
/*    */     //   764: aload #13
/*    */     //   766: nop
/*    */     //   767: nop
/*    */     //   768: nop
/*    */     //   769: checkcast kotlin/jvm/functions/Function0
/*    */     //   772: astore #8
/*    */     //   774: aload_2
/*    */     //   775: invokeinterface endReplaceGroup : ()V
/*    */     //   780: aload #8
/*    */     //   782: aload_0
/*    */     //   783: getfield $model : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*    */     //   786: astore #8
/*    */     //   788: aload_2
/*    */     //   789: ldc_w 1535586973
/*    */     //   792: invokeinterface startReplaceGroup : (I)V
/*    */     //   797: aload_2
/*    */     //   798: astore #10
/*    */     //   800: aload_2
/*    */     //   801: aload #8
/*    */     //   803: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   808: istore #11
/*    */     //   810: iconst_0
/*    */     //   811: istore #12
/*    */     //   813: aload #10
/*    */     //   815: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   820: astore #13
/*    */     //   822: iconst_0
/*    */     //   823: istore #14
/*    */     //   825: iload #11
/*    */     //   827: ifne -> 841
/*    */     //   830: aload #13
/*    */     //   832: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   835: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   838: if_acmpne -> 892
/*    */     //   841: astore #36
/*    */     //   843: astore #35
/*    */     //   845: astore #34
/*    */     //   847: astore #33
/*    */     //   849: iconst_0
/*    */     //   850: istore #15
/*    */     //   852: new com/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowPageKt$JunieToolWindowContent$2$3$1
/*    */     //   855: dup
/*    */     //   856: aload #8
/*    */     //   858: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   861: checkcast kotlin/jvm/functions/Function0
/*    */     //   864: astore #37
/*    */     //   866: aload #33
/*    */     //   868: aload #34
/*    */     //   870: aload #35
/*    */     //   872: aload #36
/*    */     //   874: aload #37
/*    */     //   876: astore #16
/*    */     //   878: aload #10
/*    */     //   880: aload #16
/*    */     //   882: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   887: aload #16
/*    */     //   889: goto -> 894
/*    */     //   892: aload #13
/*    */     //   894: nop
/*    */     //   895: nop
/*    */     //   896: nop
/*    */     //   897: checkcast kotlin/jvm/functions/Function0
/*    */     //   900: astore #9
/*    */     //   902: aload_2
/*    */     //   903: invokeinterface endReplaceGroup : ()V
/*    */     //   908: aload #9
/*    */     //   910: aload #7
/*    */     //   912: aload #5
/*    */     //   914: instanceof com/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModelImpl
/*    */     //   917: ifne -> 928
/*    */     //   920: aload #5
/*    */     //   922: instanceof com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationPageVm
/*    */     //   925: ifeq -> 932
/*    */     //   928: iconst_1
/*    */     //   929: goto -> 933
/*    */     //   932: iconst_0
/*    */     //   933: aload_2
/*    */     //   934: iconst_0
/*    */     //   935: invokestatic SingleColumnView : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/Transition;ZLandroidx/compose/runtime/Composer;I)V
/*    */     //   938: aload_2
/*    */     //   939: invokeinterface endReplaceGroup : ()V
/*    */     //   944: goto -> 1109
/*    */     //   947: aload_2
/*    */     //   948: ldc_w 358748016
/*    */     //   951: invokeinterface startReplaceGroup : (I)V
/*    */     //   956: aload_0
/*    */     //   957: getfield $junieProblems$delegate : Landroidx/compose/runtime/State;
/*    */     //   960: invokestatic access$JunieToolWindowContent$lambda$1 : (Landroidx/compose/runtime/State;)Ljava/util/List;
/*    */     //   963: aload_0
/*    */     //   964: getfield $quotaWarning$delegate : Landroidx/compose/runtime/State;
/*    */     //   967: invokestatic access$JunieToolWindowContent$lambda$2 : (Landroidx/compose/runtime/State;)Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;
/*    */     //   970: aload #5
/*    */     //   972: aload_0
/*    */     //   973: getfield $model : Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowViewModel;
/*    */     //   976: astore #8
/*    */     //   978: aload_2
/*    */     //   979: ldc_w 1535598237
/*    */     //   982: invokeinterface startReplaceGroup : (I)V
/*    */     //   987: aload_2
/*    */     //   988: astore #10
/*    */     //   990: aload_2
/*    */     //   991: aload #8
/*    */     //   993: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*    */     //   998: istore #11
/*    */     //   1000: iconst_0
/*    */     //   1001: istore #12
/*    */     //   1003: aload #10
/*    */     //   1005: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*    */     //   1010: astore #13
/*    */     //   1012: iconst_0
/*    */     //   1013: istore #14
/*    */     //   1015: iload #11
/*    */     //   1017: ifne -> 1031
/*    */     //   1020: aload #13
/*    */     //   1022: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*    */     //   1025: invokevirtual getEmpty : ()Ljava/lang/Object;
/*    */     //   1028: if_acmpne -> 1078
/*    */     //   1031: astore #35
/*    */     //   1033: astore #34
/*    */     //   1035: astore #33
/*    */     //   1037: iconst_0
/*    */     //   1038: istore #15
/*    */     //   1040: new com/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowPageKt$JunieToolWindowContent$2$4$1
/*    */     //   1043: dup
/*    */     //   1044: aload #8
/*    */     //   1046: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   1049: checkcast kotlin/jvm/functions/Function0
/*    */     //   1052: astore #36
/*    */     //   1054: aload #33
/*    */     //   1056: aload #34
/*    */     //   1058: aload #35
/*    */     //   1060: aload #36
/*    */     //   1062: astore #16
/*    */     //   1064: aload #10
/*    */     //   1066: aload #16
/*    */     //   1068: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*    */     //   1073: aload #16
/*    */     //   1075: goto -> 1080
/*    */     //   1078: aload #13
/*    */     //   1080: nop
/*    */     //   1081: nop
/*    */     //   1082: nop
/*    */     //   1083: checkcast kotlin/jvm/functions/Function0
/*    */     //   1086: astore #9
/*    */     //   1088: aload_2
/*    */     //   1089: invokeinterface endReplaceGroup : ()V
/*    */     //   1094: aload #9
/*    */     //   1096: aload #7
/*    */     //   1098: aload_2
/*    */     //   1099: iconst_0
/*    */     //   1100: invokestatic TwoColumnView : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/Transition;Landroidx/compose/runtime/Composer;I)V
/*    */     //   1103: aload_2
/*    */     //   1104: invokeinterface endReplaceGroup : ()V
/*    */     //   1109: invokestatic isTraceInProgress : ()Z
/*    */     //   1112: ifeq -> 1127
/*    */     //   1115: invokestatic traceEventEnd : ()V
/*    */     //   1118: goto -> 1127
/*    */     //   1121: aload_2
/*    */     //   1122: invokeinterface skipToGroupEnd : ()V
/*    */     //   1127: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #51	-> 36
/*    */     //   #51	-> 102
/*    */     //   #52	-> 106
/*    */     //   #53	-> 134
/*    */     //   #56	-> 141
/*    */     //   #57	-> 158
/*    */     //   #58	-> 163
/*    */     //   #96	-> 197
/*    */     //   #97	-> 200
/*    */     //   #100	-> 203
/*    */     //   #101	-> 221
/*    */     //   #102	-> 230
/*    */     //   #103	-> 235
/*    */     //   #104	-> 241
/*    */     //   #105	-> 249
/*    */     //   #107	-> 256
/*    */     //   #106	-> 278
/*    */     //   #108	-> 287
/*    */     //   #109	-> 290
/*    */     //   #110	-> 306
/*    */     //   #111	-> 311
/*    */     //   #112	-> 321
/*    */     //   #114	-> 332
/*    */     //   #116	-> 337
/*    */     //   #117	-> 346
/*    */     //   #118	-> 359
/*    */     //   #120	-> 372
/*    */     //   #121	-> 383
/*    */     //   #122	-> 390
/*    */     //   #123	-> 418
/*    */     //   #124	-> 430
/*    */     //   #126	-> 444
/*    */     //   #121	-> 445
/*    */     //   #126	-> 446
/*    */     //   #127	-> 447
/*    */     //   #128	-> 460
/*    */     //   #116	-> 461
/*    */     //   #129	-> 462
/*    */     //   #130	-> 484
/*    */     //   #59	-> 523
/*    */     //   #60	-> 526
/*    */     //   #130	-> 527
/*    */     //   #129	-> 532
/*    */     //   #131	-> 533
/*    */     //   #108	-> 539
/*    */     //   #132	-> 542
/*    */     //   #102	-> 544
/*    */     //   #133	-> 547
/*    */     //   #96	-> 549
/*    */     //   #134	-> 552
/*    */     //   #61	-> 568
/*    */     //   #64	-> 575
/*    */     //   #66	-> 598
/*    */     //   #67	-> 615
/*    */     //   #69	-> 645
/*    */     //   #70	-> 652
/*    */     //   #71	-> 659
/*    */     //   #72	-> 685
/*    */     //   #135	-> 694
/*    */     //   #136	-> 706
/*    */     //   #137	-> 722
/*    */     //   #72	-> 731
/*    */     //   #137	-> 748
/*    */     //   #138	-> 750
/*    */     //   #139	-> 759
/*    */     //   #140	-> 764
/*    */     //   #136	-> 766
/*    */     //   #135	-> 767
/*    */     //   #135	-> 768
/*    */     //   #72	-> 769
/*    */     //   #77	-> 782
/*    */     //   #141	-> 813
/*    */     //   #142	-> 825
/*    */     //   #143	-> 841
/*    */     //   #77	-> 852
/*    */     //   #143	-> 876
/*    */     //   #144	-> 878
/*    */     //   #145	-> 887
/*    */     //   #146	-> 892
/*    */     //   #142	-> 894
/*    */     //   #141	-> 895
/*    */     //   #141	-> 896
/*    */     //   #77	-> 897
/*    */     //   #78	-> 910
/*    */     //   #79	-> 912
/*    */     //   #68	-> 935
/*    */     //   #67	-> 938
/*    */     //   #81	-> 947
/*    */     //   #83	-> 956
/*    */     //   #84	-> 963
/*    */     //   #85	-> 970
/*    */     //   #86	-> 972
/*    */     //   #147	-> 1003
/*    */     //   #148	-> 1015
/*    */     //   #149	-> 1031
/*    */     //   #86	-> 1040
/*    */     //   #149	-> 1062
/*    */     //   #150	-> 1064
/*    */     //   #151	-> 1073
/*    */     //   #152	-> 1078
/*    */     //   #148	-> 1080
/*    */     //   #147	-> 1081
/*    */     //   #147	-> 1082
/*    */     //   #86	-> 1083
/*    */     //   #87	-> 1096
/*    */     //   #82	-> 1100
/*    */     //   #81	-> 1103
/*    */     //   #89	-> 1121
/*    */     //   #90	-> 1127
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   515	12	32	$i$a$-Box-JuniorToolWindowPageKt$JunieToolWindowContent$2$1	I
/*    */     //   512	15	31	$this$invoke_u24lambda_u240	Landroidx/compose/foundation/layout/BoxScope;
/*    */     //   512	15	30	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   512	15	29	$changed	I
/*    */     //   478	54	28	$i$a$-Layout-BoxKt$Box$1$iv	I
/*    */     //   475	57	27	$composer$iv	Landroidx/compose/runtime/Composer;
/*    */     //   475	57	26	$changed$iv	I
/*    */     //   390	55	25	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*    */     //   387	58	24	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   383	64	23	$i$f$set-impl	I
/*    */     //   380	67	22	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*    */     //   346	115	21	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*    */     //   343	118	20	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*    */     //   282	261	19	$i$f$ReusableComposeNode	I
/*    */     //   279	264	17	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*    */     //   279	264	18	$changed$iv$iv$iv	I
/*    */     //   225	323	13	$i$f$Layout	I
/*    */     //   240	308	14	compositeKeyHash$iv$iv	I
/*    */     //   248	300	15	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*    */     //   256	292	16	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*    */     //   222	326	12	$changed$iv$iv	I
/*    */     //   192	361	10	$i$f$Box	I
/*    */     //   212	341	11	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*    */     //   189	364	6	modifier$iv	Landroidx/compose/ui/Modifier;
/*    */     //   189	364	7	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*    */     //   203	350	8	propagateMinConstraints$iv	Z
/*    */     //   189	364	9	$changed$iv	I
/*    */     //   731	7	15	$i$a$-cache-JuniorToolWindowPageKt$JunieToolWindowContent$2$2	I
/*    */     //   750	11	16	value$iv	Ljava/lang/Object;
/*    */     //   706	61	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   703	64	13	it$iv	Ljava/lang/Object;
/*    */     //   694	75	12	$i$f$cache	I
/*    */     //   691	78	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   691	78	10	invalid$iv	Z
/*    */     //   852	12	15	$i$a$-cache-JuniorToolWindowPageKt$JunieToolWindowContent$2$3	I
/*    */     //   878	11	16	value$iv	Ljava/lang/Object;
/*    */     //   825	70	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   822	73	13	it$iv	Ljava/lang/Object;
/*    */     //   813	84	12	$i$f$cache	I
/*    */     //   810	87	10	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   810	87	11	invalid$iv	Z
/*    */     //   1040	12	15	$i$a$-cache-JuniorToolWindowPageKt$JunieToolWindowContent$2$4	I
/*    */     //   1064	11	16	value$iv	Ljava/lang/Object;
/*    */     //   1015	66	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*    */     //   1012	69	13	it$iv	Ljava/lang/Object;
/*    */     //   1003	80	12	$i$f$cache	I
/*    */     //   1000	83	10	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*    */     //   1000	83	11	invalid$iv	Z
/*    */     //   150	968	5	activePage	Lcom/intellij/ml/llm/matterhorn/ej/ui/vm/ViewModel;
/*    */     //   598	520	6	isSingleColumn	Z
/*    */     //   615	503	7	transition	Landroidx/compose/animation/core/Transition;
/*    */     //   9	1119	4	$dirty	I
/*    */     //   0	1128	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/JuniorToolWindowPageKt$JunieToolWindowContent$2;
/*    */     //   0	1128	1	$this$JunieSurfaceWithConstraints	Landroidx/compose/foundation/layout/BoxWithConstraintsScope;
/*    */     //   0	1128	2	$composer	Landroidx/compose/runtime/Composer;
/*    */     //   0	1128	3	$changed	I
/*    */   }
/*    */   
/*    */   private static final Unit invoke$lambda$2$lambda$1(JuniorToolWindowViewModel $model) {
/* 73 */     BuildersKt.launch$default($model.getScope(), null, null, new JuniorToolWindowPageKt$JunieToolWindowContent$2$2$1$1($model, null), 3, null);
/*    */ 
/*    */     
/* 76 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   JuniorToolWindowPageKt$JunieToolWindowContent$2(JuniorToolWindowViewModel $model, float $singleColumnThreshold, State<ViewModel> $currentPage$delegate, State<List<JuniePreconditionChecker.JunieProblem>> $junieProblems$delegate, State<GrazieQuotaWarning> $quotaWarning$delegate) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\toolwindow\JuniorToolWindowPageKt$JunieToolWindowContent$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */