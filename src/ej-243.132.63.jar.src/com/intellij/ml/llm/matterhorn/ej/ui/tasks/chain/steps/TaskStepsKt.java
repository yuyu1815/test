/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*     */ 
/*     */ import androidx.compose.animation.AnimatedVisibilityScope;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.lazy.LazyItemScope;
/*     */ import androidx.compose.foundation.lazy.LazyListScope;
/*     */ import androidx.compose.foundation.lazy.LazyListState;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
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
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskStep;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Job;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import org.jetbrains.jewel.ui.icon.PathIconKey;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000<\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\032-\020\000\032\0020\0012\006\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0060\0052\b\b\002\020\007\032\0020\bH\001¢\006\002\020\t\032)\020\n\032\0020\001*\0020\0132\b\b\002\020\f\032\0020\b2\f\020\r\032\b\022\004\022\0020\0170\016H\003¢\006\002\020\020¨\006\021²\006\f\020\022\032\004\030\0010\023X\002²\006\n\020\024\032\0020\bX\002²\006\n\020\025\032\0020\bX\002²\006\n\020\026\032\0020\bX\002²\006\n\020\027\032\0020\bX\002"}, d2 = {"TaskSteps", "", "model", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;", "stepList", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep;", "showPlanAsStep", "", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;Ljava/util/List;ZLandroidx/compose/runtime/Composer;II)V", "ScrollToEndButton", "Landroidx/compose/foundation/layout/BoxScope;", "showButton", "onClick", "Lkotlin/Function0;", "Lkotlinx/coroutines/Job;", "(Landroidx/compose/foundation/layout/BoxScope;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ej-ui", "taskState", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;", "isChainRunning", "autoScrollEnabled", "isProgrammaticScroll", "isAtBottom"})
/*     */ @SourceDebugExtension({"SMAP\nTaskSteps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskSteps.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TaskStepsKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,146:1\n481#2:147\n480#2,4:148\n484#2,2:155\n488#2:161\n1225#3,3:152\n1228#3,3:158\n1225#3,6:162\n1225#3,6:168\n1225#3,6:174\n1225#3,6:180\n1225#3,6:186\n1225#3,6:230\n1225#3,6:240\n480#4:157\n71#5:192\n67#5,7:193\n74#5:228\n78#5:239\n79#6,6:200\n86#6,4:215\n90#6,2:225\n94#6:238\n368#7,9:206\n377#7:227\n378#7,2:236\n4034#8,6:219\n149#9:229\n81#10:246\n81#10:247\n81#10:248\n107#10,2:249\n81#10:251\n107#10,2:252\n81#10:254\n*S KotlinDebug\n*F\n+ 1 TaskSteps.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TaskStepsKt\n*L\n40#1:147\n40#1:148,4\n40#1:155,2\n40#1:161\n40#1:152,3\n40#1:158,3\n43#1:162,6\n48#1:168,6\n49#1:174,6\n51#1:180,6\n59#1:186,6\n95#1:230,6\n104#1:240,6\n40#1:157\n72#1:192\n72#1:193,7\n72#1:228\n72#1:239\n72#1:200,6\n72#1:215,4\n72#1:225,2\n72#1:238\n72#1:206,9\n72#1:227\n72#1:236,2\n72#1:219,6\n76#1:229\n42#1:246\n43#1:247\n48#1:248\n48#1:249,2\n49#1:251\n49#1:252,2\n51#1:254\n*E\n"})
/*     */ public final class TaskStepsKt {
/*  42 */   private static final TaskHeaderState TaskSteps$lambda$0(State $taskState$delegate) { State state = $taskState$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 246 */       (TaskHeaderState)state.getValue(); }
/*     */   @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void TaskSteps(@NotNull TaskChainDetailsViewModel model, @NotNull List stepList, boolean showPlanAsStep, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'model'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'stepList'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_3
/*     */     //   13: ldc -1748280485
/*     */     //   15: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   20: astore_3
/*     */     //   21: iload #4
/*     */     //   23: istore #6
/*     */     //   25: iload #5
/*     */     //   27: iconst_1
/*     */     //   28: iand
/*     */     //   29: ifeq -> 42
/*     */     //   32: iload #6
/*     */     //   34: bipush #6
/*     */     //   36: ior
/*     */     //   37: istore #6
/*     */     //   39: goto -> 70
/*     */     //   42: iload #4
/*     */     //   44: bipush #6
/*     */     //   46: iand
/*     */     //   47: ifne -> 70
/*     */     //   50: iload #6
/*     */     //   52: aload_3
/*     */     //   53: aload_0
/*     */     //   54: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   59: ifeq -> 66
/*     */     //   62: iconst_4
/*     */     //   63: goto -> 67
/*     */     //   66: iconst_2
/*     */     //   67: ior
/*     */     //   68: istore #6
/*     */     //   70: iload #5
/*     */     //   72: iconst_2
/*     */     //   73: iand
/*     */     //   74: ifeq -> 87
/*     */     //   77: iload #6
/*     */     //   79: bipush #48
/*     */     //   81: ior
/*     */     //   82: istore #6
/*     */     //   84: goto -> 117
/*     */     //   87: iload #4
/*     */     //   89: bipush #48
/*     */     //   91: iand
/*     */     //   92: ifne -> 117
/*     */     //   95: iload #6
/*     */     //   97: aload_3
/*     */     //   98: aload_1
/*     */     //   99: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   104: ifeq -> 112
/*     */     //   107: bipush #32
/*     */     //   109: goto -> 114
/*     */     //   112: bipush #16
/*     */     //   114: ior
/*     */     //   115: istore #6
/*     */     //   117: iload #5
/*     */     //   119: iconst_4
/*     */     //   120: iand
/*     */     //   121: ifeq -> 135
/*     */     //   124: iload #6
/*     */     //   126: sipush #384
/*     */     //   129: ior
/*     */     //   130: istore #6
/*     */     //   132: goto -> 168
/*     */     //   135: iload #4
/*     */     //   137: sipush #384
/*     */     //   140: iand
/*     */     //   141: ifne -> 168
/*     */     //   144: iload #6
/*     */     //   146: aload_3
/*     */     //   147: iload_2
/*     */     //   148: invokeinterface changed : (Z)Z
/*     */     //   153: ifeq -> 162
/*     */     //   156: sipush #256
/*     */     //   159: goto -> 165
/*     */     //   162: sipush #128
/*     */     //   165: ior
/*     */     //   166: istore #6
/*     */     //   168: iload #6
/*     */     //   170: sipush #147
/*     */     //   173: iand
/*     */     //   174: sipush #146
/*     */     //   177: if_icmpne -> 189
/*     */     //   180: aload_3
/*     */     //   181: invokeinterface getSkipping : ()Z
/*     */     //   186: ifne -> 1652
/*     */     //   189: iload #5
/*     */     //   191: iconst_4
/*     */     //   192: iand
/*     */     //   193: ifeq -> 198
/*     */     //   196: iconst_1
/*     */     //   197: istore_2
/*     */     //   198: invokestatic isTraceInProgress : ()Z
/*     */     //   201: ifeq -> 214
/*     */     //   204: ldc -1748280485
/*     */     //   206: iload #6
/*     */     //   208: iconst_m1
/*     */     //   209: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.TaskSteps (TaskSteps.kt:38)'
/*     */     //   211: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   214: iconst_0
/*     */     //   215: istore #9
/*     */     //   217: nop
/*     */     //   218: iconst_0
/*     */     //   219: istore #10
/*     */     //   221: aload_3
/*     */     //   222: ldc 773894976
/*     */     //   224: ldc 'CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp'
/*     */     //   226: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   229: aload_3
/*     */     //   230: astore #11
/*     */     //   232: aload_3
/*     */     //   233: ldc -954370320
/*     */     //   235: ldc 'CC(remember):Effects.kt#9igjgp'
/*     */     //   237: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   240: aload_3
/*     */     //   241: astore #12
/*     */     //   243: iconst_0
/*     */     //   244: istore #13
/*     */     //   246: iconst_0
/*     */     //   247: istore #14
/*     */     //   249: aload #12
/*     */     //   251: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   256: astore #15
/*     */     //   258: iconst_0
/*     */     //   259: istore #16
/*     */     //   261: aload #15
/*     */     //   263: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   266: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   269: if_acmpne -> 316
/*     */     //   272: iconst_0
/*     */     //   273: istore #17
/*     */     //   275: iconst_0
/*     */     //   276: istore #18
/*     */     //   278: getstatic kotlin/coroutines/EmptyCoroutineContext.INSTANCE : Lkotlin/coroutines/EmptyCoroutineContext;
/*     */     //   281: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   284: aload #11
/*     */     //   286: invokestatic createCompositionCoroutineScope : (Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;
/*     */     //   289: astore #56
/*     */     //   291: new androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */     //   294: dup
/*     */     //   295: aload #56
/*     */     //   297: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;)V
/*     */     //   300: astore #18
/*     */     //   302: aload #12
/*     */     //   304: aload #18
/*     */     //   306: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   311: aload #18
/*     */     //   313: goto -> 318
/*     */     //   316: aload #15
/*     */     //   318: nop
/*     */     //   319: nop
/*     */     //   320: nop
/*     */     //   321: checkcast androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */     //   324: astore #19
/*     */     //   326: aload_3
/*     */     //   327: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   330: aload #19
/*     */     //   332: astore #20
/*     */     //   334: aload #20
/*     */     //   336: invokevirtual getCoroutineScope : ()Lkotlinx/coroutines/CoroutineScope;
/*     */     //   339: astore #19
/*     */     //   341: aload_3
/*     */     //   342: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   345: aload #19
/*     */     //   347: nop
/*     */     //   348: astore #7
/*     */     //   350: aload_1
/*     */     //   351: astore #8
/*     */     //   353: aload_0
/*     */     //   354: invokevirtual getTaskHeader : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderViewModel;
/*     */     //   357: invokevirtual getUiState : ()Lkotlinx/coroutines/flow/StateFlow;
/*     */     //   360: aconst_null
/*     */     //   361: aload_3
/*     */     //   362: iconst_0
/*     */     //   363: iconst_1
/*     */     //   364: invokestatic collectAsState : (Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;
/*     */     //   367: astore #9
/*     */     //   369: aload_3
/*     */     //   370: ldc -715274927
/*     */     //   372: invokeinterface startReplaceGroup : (I)V
/*     */     //   377: aload_3
/*     */     //   378: astore #12
/*     */     //   380: aload_3
/*     */     //   381: aload #9
/*     */     //   383: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   388: istore #13
/*     */     //   390: nop
/*     */     //   391: iconst_0
/*     */     //   392: istore #14
/*     */     //   394: aload #12
/*     */     //   396: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   401: astore #15
/*     */     //   403: iconst_0
/*     */     //   404: istore #16
/*     */     //   406: iload #13
/*     */     //   408: ifne -> 422
/*     */     //   411: aload #15
/*     */     //   413: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   416: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   419: if_acmpne -> 448
/*     */     //   422: iconst_0
/*     */     //   423: istore #17
/*     */     //   425: aload #9
/*     */     //   427: <illegal opcode> invoke : (Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function0;
/*     */     //   432: astore #18
/*     */     //   434: aload #12
/*     */     //   436: aload #18
/*     */     //   438: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   443: aload #18
/*     */     //   445: goto -> 450
/*     */     //   448: aload #15
/*     */     //   450: nop
/*     */     //   451: nop
/*     */     //   452: nop
/*     */     //   453: checkcast kotlin/jvm/functions/Function0
/*     */     //   456: astore #11
/*     */     //   458: aload_3
/*     */     //   459: invokeinterface endReplaceGroup : ()V
/*     */     //   464: aload #11
/*     */     //   466: invokestatic derivedStateOf : (Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;
/*     */     //   469: astore #10
/*     */     //   471: aload_0
/*     */     //   472: invokevirtual getRightLazyListState : ()Landroidx/compose/foundation/lazy/LazyListState;
/*     */     //   475: astore #11
/*     */     //   477: aload_3
/*     */     //   478: ldc -715269734
/*     */     //   480: invokeinterface startReplaceGroup : (I)V
/*     */     //   485: aload_3
/*     */     //   486: astore #14
/*     */     //   488: iconst_0
/*     */     //   489: istore #15
/*     */     //   491: nop
/*     */     //   492: iconst_0
/*     */     //   493: istore #16
/*     */     //   495: aload #14
/*     */     //   497: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   502: astore #17
/*     */     //   504: iconst_0
/*     */     //   505: istore #18
/*     */     //   507: aload #17
/*     */     //   509: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   512: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   515: if_acmpne -> 547
/*     */     //   518: iconst_0
/*     */     //   519: istore #19
/*     */     //   521: iconst_1
/*     */     //   522: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   525: aconst_null
/*     */     //   526: iconst_2
/*     */     //   527: aconst_null
/*     */     //   528: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   531: astore #19
/*     */     //   533: aload #14
/*     */     //   535: aload #19
/*     */     //   537: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   542: aload #19
/*     */     //   544: goto -> 549
/*     */     //   547: aload #17
/*     */     //   549: nop
/*     */     //   550: nop
/*     */     //   551: nop
/*     */     //   552: checkcast androidx/compose/runtime/MutableState
/*     */     //   555: astore #13
/*     */     //   557: aload_3
/*     */     //   558: invokeinterface endReplaceGroup : ()V
/*     */     //   563: aload #13
/*     */     //   565: astore #12
/*     */     //   567: aload_3
/*     */     //   568: ldc -715267685
/*     */     //   570: invokeinterface startReplaceGroup : (I)V
/*     */     //   575: aload_3
/*     */     //   576: astore #15
/*     */     //   578: iconst_0
/*     */     //   579: istore #16
/*     */     //   581: nop
/*     */     //   582: iconst_0
/*     */     //   583: istore #17
/*     */     //   585: aload #15
/*     */     //   587: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   592: astore #18
/*     */     //   594: iconst_0
/*     */     //   595: istore #19
/*     */     //   597: aload #18
/*     */     //   599: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   602: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   605: if_acmpne -> 637
/*     */     //   608: iconst_0
/*     */     //   609: istore #20
/*     */     //   611: iconst_0
/*     */     //   612: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   615: aconst_null
/*     */     //   616: iconst_2
/*     */     //   617: aconst_null
/*     */     //   618: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   621: astore #20
/*     */     //   623: aload #15
/*     */     //   625: aload #20
/*     */     //   627: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   632: aload #20
/*     */     //   634: goto -> 639
/*     */     //   637: aload #18
/*     */     //   639: nop
/*     */     //   640: nop
/*     */     //   641: nop
/*     */     //   642: checkcast androidx/compose/runtime/MutableState
/*     */     //   645: astore #14
/*     */     //   647: aload_3
/*     */     //   648: invokeinterface endReplaceGroup : ()V
/*     */     //   653: aload #14
/*     */     //   655: astore #13
/*     */     //   657: aload_3
/*     */     //   658: ldc -715265652
/*     */     //   660: invokeinterface startReplaceGroup : (I)V
/*     */     //   665: aload_3
/*     */     //   666: astore #16
/*     */     //   668: iconst_0
/*     */     //   669: istore #17
/*     */     //   671: nop
/*     */     //   672: iconst_0
/*     */     //   673: istore #18
/*     */     //   675: aload #16
/*     */     //   677: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   682: astore #19
/*     */     //   684: iconst_0
/*     */     //   685: istore #20
/*     */     //   687: aload #19
/*     */     //   689: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   692: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   695: if_acmpne -> 728
/*     */     //   698: iconst_0
/*     */     //   699: istore #21
/*     */     //   701: aload #11
/*     */     //   703: <illegal opcode> invoke : (Landroidx/compose/foundation/lazy/LazyListState;)Lkotlin/jvm/functions/Function0;
/*     */     //   708: invokestatic derivedStateOf : (Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;
/*     */     //   711: nop
/*     */     //   712: astore #22
/*     */     //   714: aload #16
/*     */     //   716: aload #22
/*     */     //   718: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   723: aload #22
/*     */     //   725: goto -> 730
/*     */     //   728: aload #19
/*     */     //   730: nop
/*     */     //   731: nop
/*     */     //   732: nop
/*     */     //   733: checkcast androidx/compose/runtime/State
/*     */     //   736: astore #15
/*     */     //   738: aload_3
/*     */     //   739: invokeinterface endReplaceGroup : ()V
/*     */     //   744: aload #15
/*     */     //   746: astore #14
/*     */     //   748: aload_0
/*     */     //   749: invokevirtual getRightLazyListState : ()Landroidx/compose/foundation/lazy/LazyListState;
/*     */     //   752: aload_3
/*     */     //   753: ldc -715255255
/*     */     //   755: invokeinterface startReplaceGroup : (I)V
/*     */     //   760: aload_3
/*     */     //   761: astore #16
/*     */     //   763: aload_3
/*     */     //   764: aload #11
/*     */     //   766: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   771: istore #17
/*     */     //   773: iconst_0
/*     */     //   774: istore #18
/*     */     //   776: aload #16
/*     */     //   778: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   783: astore #19
/*     */     //   785: iconst_0
/*     */     //   786: istore #20
/*     */     //   788: iload #17
/*     */     //   790: ifne -> 804
/*     */     //   793: aload #19
/*     */     //   795: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   798: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   801: if_acmpne -> 845
/*     */     //   804: astore #53
/*     */     //   806: iconst_0
/*     */     //   807: istore #21
/*     */     //   809: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TaskStepsKt$TaskSteps$1$1
/*     */     //   812: dup
/*     */     //   813: aload #11
/*     */     //   815: aload #13
/*     */     //   817: aload #12
/*     */     //   819: aconst_null
/*     */     //   820: invokespecial <init> : (Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*     */     //   823: checkcast kotlin/jvm/functions/Function2
/*     */     //   826: aload #53
/*     */     //   828: swap
/*     */     //   829: astore #22
/*     */     //   831: aload #16
/*     */     //   833: aload #22
/*     */     //   835: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   840: aload #22
/*     */     //   842: goto -> 847
/*     */     //   845: aload #19
/*     */     //   847: nop
/*     */     //   848: nop
/*     */     //   849: nop
/*     */     //   850: checkcast kotlin/jvm/functions/Function2
/*     */     //   853: astore #15
/*     */     //   855: aload_3
/*     */     //   856: invokeinterface endReplaceGroup : ()V
/*     */     //   861: aload #15
/*     */     //   863: aload_3
/*     */     //   864: iconst_0
/*     */     //   865: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   868: iconst_0
/*     */     //   869: istore #18
/*     */     //   871: nop
/*     */     //   872: iconst_0
/*     */     //   873: istore #19
/*     */     //   875: aload_3
/*     */     //   876: ldc 733328855
/*     */     //   878: ldc 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   880: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   883: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   886: checkcast androidx/compose/ui/Modifier
/*     */     //   889: astore #15
/*     */     //   891: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   894: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   897: astore #16
/*     */     //   899: iconst_0
/*     */     //   900: istore #17
/*     */     //   902: aload #16
/*     */     //   904: iload #17
/*     */     //   906: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   909: astore #20
/*     */     //   911: bipush #112
/*     */     //   913: iload #18
/*     */     //   915: iconst_3
/*     */     //   916: ishl
/*     */     //   917: iand
/*     */     //   918: istore #21
/*     */     //   920: nop
/*     */     //   921: iconst_0
/*     */     //   922: istore #22
/*     */     //   924: aload_3
/*     */     //   925: ldc -1323940314
/*     */     //   927: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   929: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   932: aload_3
/*     */     //   933: iconst_0
/*     */     //   934: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   937: istore #23
/*     */     //   939: aload_3
/*     */     //   940: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   945: astore #24
/*     */     //   947: aload_3
/*     */     //   948: aload #15
/*     */     //   950: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   953: astore #25
/*     */     //   955: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   958: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   961: astore #26
/*     */     //   963: bipush #6
/*     */     //   965: sipush #896
/*     */     //   968: iload #21
/*     */     //   970: bipush #6
/*     */     //   972: ishl
/*     */     //   973: iand
/*     */     //   974: ior
/*     */     //   975: istore #27
/*     */     //   977: nop
/*     */     //   978: iconst_0
/*     */     //   979: istore #28
/*     */     //   981: aload_3
/*     */     //   982: ldc_w -692256719
/*     */     //   985: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   988: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   991: aload_3
/*     */     //   992: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   997: instanceof androidx/compose/runtime/Applier
/*     */     //   1000: ifne -> 1006
/*     */     //   1003: invokestatic invalidApplier : ()V
/*     */     //   1006: aload_3
/*     */     //   1007: invokeinterface startReusableNode : ()V
/*     */     //   1012: aload_3
/*     */     //   1013: invokeinterface getInserting : ()Z
/*     */     //   1018: ifeq -> 1032
/*     */     //   1021: aload_3
/*     */     //   1022: aload #26
/*     */     //   1024: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1029: goto -> 1038
/*     */     //   1032: aload_3
/*     */     //   1033: invokeinterface useNode : ()V
/*     */     //   1038: aload_3
/*     */     //   1039: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1042: astore #29
/*     */     //   1044: iconst_0
/*     */     //   1045: istore #30
/*     */     //   1047: aload #29
/*     */     //   1049: aload #20
/*     */     //   1051: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1054: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1057: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1060: aload #29
/*     */     //   1062: aload #24
/*     */     //   1064: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1067: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1070: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1073: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1076: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1079: astore #31
/*     */     //   1081: iconst_0
/*     */     //   1082: istore #32
/*     */     //   1084: aload #29
/*     */     //   1086: astore #33
/*     */     //   1088: iconst_0
/*     */     //   1089: istore #34
/*     */     //   1091: aload #33
/*     */     //   1093: invokeinterface getInserting : ()Z
/*     */     //   1098: ifne -> 1119
/*     */     //   1101: aload #33
/*     */     //   1103: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1108: iload #23
/*     */     //   1110: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1113: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1116: ifne -> 1145
/*     */     //   1119: aload #33
/*     */     //   1121: iload #23
/*     */     //   1123: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1126: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1131: aload #29
/*     */     //   1133: iload #23
/*     */     //   1135: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1138: aload #31
/*     */     //   1140: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1145: nop
/*     */     //   1146: nop
/*     */     //   1147: nop
/*     */     //   1148: aload #29
/*     */     //   1150: aload #25
/*     */     //   1152: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1155: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1158: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1161: nop
/*     */     //   1162: nop
/*     */     //   1163: aload_3
/*     */     //   1164: bipush #14
/*     */     //   1166: iload #27
/*     */     //   1168: bipush #6
/*     */     //   1170: ishr
/*     */     //   1171: iand
/*     */     //   1172: istore #35
/*     */     //   1174: astore #36
/*     */     //   1176: iconst_0
/*     */     //   1177: istore #37
/*     */     //   1179: aload #36
/*     */     //   1181: ldc_w -2146769399
/*     */     //   1184: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   1187: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1190: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   1193: aload #36
/*     */     //   1195: bipush #6
/*     */     //   1197: bipush #112
/*     */     //   1199: iload #18
/*     */     //   1201: bipush #6
/*     */     //   1203: ishr
/*     */     //   1204: iand
/*     */     //   1205: ior
/*     */     //   1206: istore #38
/*     */     //   1208: astore #39
/*     */     //   1210: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   1213: astore #40
/*     */     //   1215: iconst_0
/*     */     //   1216: istore #41
/*     */     //   1218: aload #11
/*     */     //   1220: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1223: checkcast androidx/compose/ui/Modifier
/*     */     //   1226: fconst_0
/*     */     //   1227: iconst_1
/*     */     //   1228: aconst_null
/*     */     //   1229: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1232: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1235: checkcast androidx/compose/ui/Modifier
/*     */     //   1238: bipush #8
/*     */     //   1240: istore #42
/*     */     //   1242: iconst_0
/*     */     //   1243: istore #43
/*     */     //   1245: iload #42
/*     */     //   1247: i2f
/*     */     //   1248: invokestatic constructor-impl : (F)F
/*     */     //   1251: fconst_0
/*     */     //   1252: iconst_2
/*     */     //   1253: aconst_null
/*     */     //   1254: invokestatic widthIn-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1257: aconst_null
/*     */     //   1258: iconst_0
/*     */     //   1259: iconst_0
/*     */     //   1260: aconst_null
/*     */     //   1261: ldc_w -930967888
/*     */     //   1264: iconst_1
/*     */     //   1265: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TaskStepsKt$TaskSteps$2$1
/*     */     //   1268: dup
/*     */     //   1269: aload #11
/*     */     //   1271: aload #8
/*     */     //   1273: aload #10
/*     */     //   1275: iload_2
/*     */     //   1276: aload_0
/*     */     //   1277: invokespecial <init> : (Landroidx/compose/foundation/lazy/LazyListState;Ljava/util/List;Landroidx/compose/runtime/State;ZLcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;)V
/*     */     //   1280: aload #39
/*     */     //   1282: bipush #54
/*     */     //   1284: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1287: checkcast kotlin/jvm/functions/Function2
/*     */     //   1290: aload #39
/*     */     //   1292: ldc_w 12583344
/*     */     //   1295: bipush #120
/*     */     //   1297: invokestatic VerticallyScrollableContainer : (Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1300: aload #40
/*     */     //   1302: aload #12
/*     */     //   1304: invokestatic TaskSteps$lambda$5 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   1307: ifne -> 1322
/*     */     //   1310: aload #14
/*     */     //   1312: invokestatic TaskSteps$lambda$12 : (Landroidx/compose/runtime/State;)Z
/*     */     //   1315: ifne -> 1322
/*     */     //   1318: iconst_1
/*     */     //   1319: goto -> 1323
/*     */     //   1322: iconst_0
/*     */     //   1323: aload #39
/*     */     //   1325: ldc_w -2071518087
/*     */     //   1328: invokeinterface startReplaceGroup : (I)V
/*     */     //   1333: aload #39
/*     */     //   1335: astore #43
/*     */     //   1337: aload #39
/*     */     //   1339: aload #7
/*     */     //   1341: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1346: aload #39
/*     */     //   1348: aload #11
/*     */     //   1350: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1355: ior
/*     */     //   1356: istore #44
/*     */     //   1358: nop
/*     */     //   1359: iconst_0
/*     */     //   1360: istore #45
/*     */     //   1362: aload #43
/*     */     //   1364: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1369: astore #46
/*     */     //   1371: iconst_0
/*     */     //   1372: istore #47
/*     */     //   1374: iload #44
/*     */     //   1376: ifne -> 1390
/*     */     //   1379: aload #46
/*     */     //   1381: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1384: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1387: if_acmpne -> 1432
/*     */     //   1390: istore #48
/*     */     //   1392: astore #49
/*     */     //   1394: iconst_0
/*     */     //   1395: istore #50
/*     */     //   1397: aload #7
/*     */     //   1399: aload #12
/*     */     //   1401: aload #11
/*     */     //   1403: <illegal opcode> invoke : (Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/lazy/LazyListState;)Lkotlin/jvm/functions/Function0;
/*     */     //   1408: astore #51
/*     */     //   1410: aload #49
/*     */     //   1412: iload #48
/*     */     //   1414: aload #51
/*     */     //   1416: astore #52
/*     */     //   1418: aload #43
/*     */     //   1420: aload #52
/*     */     //   1422: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1427: aload #52
/*     */     //   1429: goto -> 1434
/*     */     //   1432: aload #46
/*     */     //   1434: nop
/*     */     //   1435: nop
/*     */     //   1436: nop
/*     */     //   1437: checkcast kotlin/jvm/functions/Function0
/*     */     //   1440: astore #42
/*     */     //   1442: aload #39
/*     */     //   1444: invokeinterface endReplaceGroup : ()V
/*     */     //   1449: aload #42
/*     */     //   1451: aload #39
/*     */     //   1453: bipush #14
/*     */     //   1455: iload #38
/*     */     //   1457: iand
/*     */     //   1458: iconst_0
/*     */     //   1459: invokestatic ScrollToEndButton : (Landroidx/compose/foundation/layout/BoxScope;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1462: nop
/*     */     //   1463: aload #36
/*     */     //   1465: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1468: aload_3
/*     */     //   1469: invokeinterface endNode : ()V
/*     */     //   1474: aload_3
/*     */     //   1475: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1478: nop
/*     */     //   1479: aload_3
/*     */     //   1480: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1483: nop
/*     */     //   1484: aload_3
/*     */     //   1485: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1488: nop
/*     */     //   1489: aload #8
/*     */     //   1491: aload #10
/*     */     //   1493: invokestatic TaskSteps$lambda$3 : (Landroidx/compose/runtime/State;)Z
/*     */     //   1496: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   1499: aload_3
/*     */     //   1500: ldc_w -715207530
/*     */     //   1503: invokeinterface startReplaceGroup : (I)V
/*     */     //   1508: aload_3
/*     */     //   1509: astore #16
/*     */     //   1511: aload_3
/*     */     //   1512: aload #8
/*     */     //   1514: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1519: aload_3
/*     */     //   1520: aload #11
/*     */     //   1522: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1527: ior
/*     */     //   1528: istore #17
/*     */     //   1530: iconst_0
/*     */     //   1531: istore #18
/*     */     //   1533: aload #16
/*     */     //   1535: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1540: astore #19
/*     */     //   1542: iconst_0
/*     */     //   1543: istore #20
/*     */     //   1545: iload #17
/*     */     //   1547: ifne -> 1561
/*     */     //   1550: aload #19
/*     */     //   1552: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1555: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1558: if_acmpne -> 1611
/*     */     //   1561: astore #54
/*     */     //   1563: astore #53
/*     */     //   1565: iconst_0
/*     */     //   1566: istore #21
/*     */     //   1568: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TaskStepsKt$TaskSteps$3$1
/*     */     //   1571: dup
/*     */     //   1572: aload #8
/*     */     //   1574: aload #11
/*     */     //   1576: aload #12
/*     */     //   1578: aload #13
/*     */     //   1580: aconst_null
/*     */     //   1581: invokespecial <init> : (Ljava/util/List;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*     */     //   1584: checkcast kotlin/jvm/functions/Function2
/*     */     //   1587: astore #55
/*     */     //   1589: aload #53
/*     */     //   1591: aload #54
/*     */     //   1593: aload #55
/*     */     //   1595: astore #22
/*     */     //   1597: aload #16
/*     */     //   1599: aload #22
/*     */     //   1601: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1606: aload #22
/*     */     //   1608: goto -> 1613
/*     */     //   1611: aload #19
/*     */     //   1613: nop
/*     */     //   1614: nop
/*     */     //   1615: nop
/*     */     //   1616: checkcast kotlin/jvm/functions/Function2
/*     */     //   1619: astore #15
/*     */     //   1621: aload_3
/*     */     //   1622: invokeinterface endReplaceGroup : ()V
/*     */     //   1627: aload #15
/*     */     //   1629: aload_3
/*     */     //   1630: bipush #14
/*     */     //   1632: iload #6
/*     */     //   1634: iconst_3
/*     */     //   1635: ishr
/*     */     //   1636: iand
/*     */     //   1637: invokestatic LaunchedEffect : (Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1640: invokestatic isTraceInProgress : ()Z
/*     */     //   1643: ifeq -> 1658
/*     */     //   1646: invokestatic traceEventEnd : ()V
/*     */     //   1649: goto -> 1658
/*     */     //   1652: aload_3
/*     */     //   1653: invokeinterface skipToGroupEnd : ()V
/*     */     //   1658: aload_3
/*     */     //   1659: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1664: dup
/*     */     //   1665: ifnull -> 1688
/*     */     //   1668: aload_0
/*     */     //   1669: aload_1
/*     */     //   1670: iload_2
/*     */     //   1671: iload #4
/*     */     //   1673: iload #5
/*     */     //   1675: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;Ljava/util/List;ZII)Lkotlin/jvm/functions/Function2;
/*     */     //   1680: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1685: goto -> 1689
/*     */     //   1688: pop
/*     */     //   1689: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #39	-> 12
/*     */     //   #38	-> 196
/*     */     //   #39	-> 211
/*     */     //   #40	-> 217
/*     */     //   #147	-> 226
/*     */     //   #148	-> 229
/*     */     //   #150	-> 230
/*     */     //   #151	-> 237
/*     */     //   #152	-> 249
/*     */     //   #153	-> 261
/*     */     //   #154	-> 272
/*     */     //   #155	-> 275
/*     */     //   #156	-> 275
/*     */     //   #157	-> 278
/*     */     //   #156	-> 281
/*     */     //   #155	-> 289
/*     */     //   #154	-> 300
/*     */     //   #158	-> 302
/*     */     //   #159	-> 311
/*     */     //   #160	-> 316
/*     */     //   #153	-> 318
/*     */     //   #152	-> 319
/*     */     //   #152	-> 320
/*     */     //   #151	-> 321
/*     */     //   #161	-> 334
/*     */     //   #147	-> 342
/*     */     //   #161	-> 347
/*     */     //   #40	-> 348
/*     */     //   #41	-> 350
/*     */     //   #42	-> 353
/*     */     //   #43	-> 390
/*     */     //   #162	-> 394
/*     */     //   #163	-> 406
/*     */     //   #164	-> 422
/*     */     //   #43	-> 425
/*     */     //   #164	-> 432
/*     */     //   #165	-> 434
/*     */     //   #166	-> 443
/*     */     //   #167	-> 448
/*     */     //   #163	-> 450
/*     */     //   #162	-> 451
/*     */     //   #162	-> 452
/*     */     //   #43	-> 453
/*     */     //   #47	-> 471
/*     */     //   #48	-> 491
/*     */     //   #168	-> 495
/*     */     //   #169	-> 507
/*     */     //   #170	-> 518
/*     */     //   #48	-> 521
/*     */     //   #170	-> 531
/*     */     //   #171	-> 533
/*     */     //   #172	-> 542
/*     */     //   #173	-> 547
/*     */     //   #169	-> 549
/*     */     //   #168	-> 550
/*     */     //   #168	-> 551
/*     */     //   #48	-> 552
/*     */     //   #49	-> 581
/*     */     //   #174	-> 585
/*     */     //   #175	-> 597
/*     */     //   #176	-> 608
/*     */     //   #49	-> 611
/*     */     //   #176	-> 621
/*     */     //   #177	-> 623
/*     */     //   #178	-> 632
/*     */     //   #179	-> 637
/*     */     //   #175	-> 639
/*     */     //   #174	-> 640
/*     */     //   #174	-> 641
/*     */     //   #49	-> 642
/*     */     //   #51	-> 671
/*     */     //   #180	-> 675
/*     */     //   #181	-> 687
/*     */     //   #182	-> 698
/*     */     //   #52	-> 701
/*     */     //   #56	-> 711
/*     */     //   #182	-> 712
/*     */     //   #183	-> 714
/*     */     //   #184	-> 723
/*     */     //   #185	-> 728
/*     */     //   #181	-> 730
/*     */     //   #180	-> 731
/*     */     //   #180	-> 732
/*     */     //   #51	-> 733
/*     */     //   #59	-> 748
/*     */     //   #186	-> 776
/*     */     //   #187	-> 788
/*     */     //   #188	-> 804
/*     */     //   #59	-> 809
/*     */     //   #188	-> 829
/*     */     //   #189	-> 831
/*     */     //   #190	-> 840
/*     */     //   #191	-> 845
/*     */     //   #187	-> 847
/*     */     //   #186	-> 848
/*     */     //   #186	-> 849
/*     */     //   #59	-> 850
/*     */     //   #72	-> 871
/*     */     //   #192	-> 880
/*     */     //   #193	-> 883
/*     */     //   #194	-> 891
/*     */     //   #195	-> 899
/*     */     //   #198	-> 902
/*     */     //   #199	-> 920
/*     */     //   #200	-> 929
/*     */     //   #201	-> 934
/*     */     //   #202	-> 940
/*     */     //   #203	-> 948
/*     */     //   #205	-> 955
/*     */     //   #204	-> 977
/*     */     //   #206	-> 988
/*     */     //   #207	-> 991
/*     */     //   #208	-> 1007
/*     */     //   #209	-> 1012
/*     */     //   #210	-> 1022
/*     */     //   #212	-> 1033
/*     */     //   #214	-> 1038
/*     */     //   #215	-> 1047
/*     */     //   #216	-> 1060
/*     */     //   #218	-> 1073
/*     */     //   #219	-> 1084
/*     */     //   #220	-> 1091
/*     */     //   #221	-> 1119
/*     */     //   #222	-> 1131
/*     */     //   #224	-> 1145
/*     */     //   #219	-> 1146
/*     */     //   #224	-> 1147
/*     */     //   #225	-> 1148
/*     */     //   #226	-> 1161
/*     */     //   #214	-> 1162
/*     */     //   #227	-> 1163
/*     */     //   #228	-> 1187
/*     */     //   #74	-> 1218
/*     */     //   #75	-> 1220
/*     */     //   #76	-> 1232
/*     */     //   #229	-> 1245
/*     */     //   #76	-> 1251
/*     */     //   #77	-> 1261
/*     */     //   #73	-> 1297
/*     */     //   #93	-> 1300
/*     */     //   #94	-> 1302
/*     */     //   #95	-> 1358
/*     */     //   #230	-> 1362
/*     */     //   #231	-> 1374
/*     */     //   #232	-> 1390
/*     */     //   #95	-> 1397
/*     */     //   #232	-> 1416
/*     */     //   #233	-> 1418
/*     */     //   #234	-> 1427
/*     */     //   #235	-> 1432
/*     */     //   #231	-> 1434
/*     */     //   #230	-> 1435
/*     */     //   #230	-> 1436
/*     */     //   #95	-> 1437
/*     */     //   #93	-> 1459
/*     */     //   #102	-> 1462
/*     */     //   #228	-> 1463
/*     */     //   #227	-> 1468
/*     */     //   #236	-> 1469
/*     */     //   #206	-> 1475
/*     */     //   #237	-> 1478
/*     */     //   #200	-> 1480
/*     */     //   #238	-> 1483
/*     */     //   #192	-> 1485
/*     */     //   #239	-> 1488
/*     */     //   #104	-> 1489
/*     */     //   #240	-> 1533
/*     */     //   #241	-> 1545
/*     */     //   #242	-> 1561
/*     */     //   #104	-> 1568
/*     */     //   #242	-> 1595
/*     */     //   #243	-> 1597
/*     */     //   #244	-> 1606
/*     */     //   #245	-> 1611
/*     */     //   #241	-> 1613
/*     */     //   #240	-> 1614
/*     */     //   #240	-> 1615
/*     */     //   #104	-> 1616
/*     */     //   #113	-> 1652
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   278	3	18	$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1	I
/*     */     //   275	25	17	$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv	I
/*     */     //   302	11	18	value$iv$iv	Ljava/lang/Object;
/*     */     //   261	58	16	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*     */     //   258	61	15	it$iv$iv	Ljava/lang/Object;
/*     */     //   249	72	14	$i$f$cache	I
/*     */     //   246	75	12	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   246	75	13	invalid$iv$iv	Z
/*     */     //   221	127	10	$i$f$rememberCoroutineScope	I
/*     */     //   232	116	11	composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   334	14	20	wrapper$iv	Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
/*     */     //   218	130	9	$changed$iv	I
/*     */     //   425	7	17	$i$a$-cache-TaskStepsKt$TaskSteps$isChainRunning$2	I
/*     */     //   434	11	18	value$iv	Ljava/lang/Object;
/*     */     //   406	45	16	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   403	48	15	it$iv	Ljava/lang/Object;
/*     */     //   394	59	14	$i$f$cache	I
/*     */     //   391	62	12	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   391	62	13	invalid$iv	Z
/*     */     //   521	10	19	$i$a$-cache-TaskStepsKt$TaskSteps$autoScrollEnabled$2	I
/*     */     //   533	11	19	value$iv	Ljava/lang/Object;
/*     */     //   507	43	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   504	46	17	it$iv	Ljava/lang/Object;
/*     */     //   495	57	16	$i$f$cache	I
/*     */     //   492	60	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   492	60	15	invalid$iv	Z
/*     */     //   611	10	20	$i$a$-cache-TaskStepsKt$TaskSteps$isProgrammaticScroll$2	I
/*     */     //   623	11	20	value$iv	Ljava/lang/Object;
/*     */     //   597	43	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   594	46	18	it$iv	Ljava/lang/Object;
/*     */     //   585	57	17	$i$f$cache	I
/*     */     //   582	60	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   582	60	16	invalid$iv	Z
/*     */     //   701	11	21	$i$a$-cache-TaskStepsKt$TaskSteps$isAtBottom$2	I
/*     */     //   714	11	22	value$iv	Ljava/lang/Object;
/*     */     //   687	44	20	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   684	47	19	it$iv	Ljava/lang/Object;
/*     */     //   675	58	18	$i$f$cache	I
/*     */     //   672	61	16	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   672	61	17	invalid$iv	Z
/*     */     //   809	17	21	$i$a$-cache-TaskStepsKt$TaskSteps$1	I
/*     */     //   831	11	22	value$iv	Ljava/lang/Object;
/*     */     //   788	60	20	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   785	63	19	it$iv	Ljava/lang/Object;
/*     */     //   776	74	18	$i$f$cache	I
/*     */     //   773	77	16	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   773	77	17	invalid$iv	Z
/*     */     //   1245	6	43	$i$f$getDp	I
/*     */     //   1242	9	42	$this$dp$iv	I
/*     */     //   1397	11	50	$i$a$-cache-TaskStepsKt$TaskSteps$2$2	I
/*     */     //   1418	11	52	value$iv	Ljava/lang/Object;
/*     */     //   1374	61	47	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1371	64	46	it$iv	Ljava/lang/Object;
/*     */     //   1362	75	45	$i$f$cache	I
/*     */     //   1359	78	43	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1359	78	44	invalid$iv	Z
/*     */     //   1218	245	41	$i$a$-Box-TaskStepsKt$TaskSteps$2	I
/*     */     //   1215	248	40	$this$TaskSteps_u24lambda_u2416	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   1215	248	39	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1215	248	38	$changed	I
/*     */     //   1179	289	37	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   1176	292	36	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1176	292	35	$changed$iv	I
/*     */     //   1091	55	34	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1088	58	33	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1084	64	32	$i$f$set-impl	I
/*     */     //   1081	67	31	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1047	115	30	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1044	118	29	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   981	498	28	$i$f$ReusableComposeNode	I
/*     */     //   978	501	26	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   978	501	27	$changed$iv$iv$iv	I
/*     */     //   924	560	22	$i$f$Layout	I
/*     */     //   939	545	23	compositeKeyHash$iv$iv	I
/*     */     //   947	537	24	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   955	529	25	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   921	563	21	$changed$iv$iv	I
/*     */     //   875	614	19	$i$f$Box	I
/*     */     //   911	578	20	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   891	598	15	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   899	590	16	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   902	587	17	propagateMinConstraints$iv	Z
/*     */     //   872	617	18	$changed$iv	I
/*     */     //   1568	19	21	$i$a$-cache-TaskStepsKt$TaskSteps$3	I
/*     */     //   1597	11	22	value$iv	Ljava/lang/Object;
/*     */     //   1545	69	20	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1542	72	19	it$iv	Ljava/lang/Object;
/*     */     //   1533	83	18	$i$f$cache	I
/*     */     //   1530	86	16	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1530	86	17	invalid$iv	Z
/*     */     //   350	1299	7	scope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   353	1296	8	unifiedStepList	Ljava/util/List;
/*     */     //   369	1280	9	taskState$delegate	Landroidx/compose/runtime/State;
/*     */     //   471	1178	10	isChainRunning$delegate	Landroidx/compose/runtime/State;
/*     */     //   477	1172	11	lazyListState	Landroidx/compose/foundation/lazy/LazyListState;
/*     */     //   567	1082	12	autoScrollEnabled$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   657	992	13	isProgrammaticScroll$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   748	901	14	isAtBottom$delegate	Landroidx/compose/runtime/State;
/*     */     //   25	1665	6	$dirty	I
/*     */     //   0	1690	0	model	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;
/*     */     //   0	1690	1	stepList	Ljava/util/List;
/*     */     //   0	1690	2	showPlanAsStep	Z
/*     */     //   0	1690	3	$composer	Landroidx/compose/runtime/Composer;
/* 247 */     //   0	1690	4	$changed	I } private static final boolean TaskSteps$lambda$3(State $isChainRunning$delegate) { State state = $isChainRunning$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Boolean)state.getValue()).booleanValue(); } private static final boolean TaskSteps$lambda$2$lambda$1(State $taskState$delegate) { return (!(TaskSteps$lambda$0($taskState$delegate) instanceof TaskHeaderState.Terminal) && !(TaskSteps$lambda$0($taskState$delegate) instanceof TaskHeaderState.Failed)); }
/* 248 */   private static final boolean TaskSteps$lambda$5(MutableState $autoScrollEnabled$delegate) { State state = (State)$autoScrollEnabled$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Boolean)state.getValue()).booleanValue(); } private static final void TaskSteps$lambda$6(MutableState $autoScrollEnabled$delegate, boolean <set-?>) { MutableState mutableState = $autoScrollEnabled$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 249 */     mutableState.setValue(value$iv); } private static final boolean TaskSteps$lambda$8(MutableState $isProgrammaticScroll$delegate) { State state = (State)$isProgrammaticScroll$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 251 */     return ((Boolean)state.getValue()).booleanValue(); } private static final void TaskSteps$lambda$9(MutableState $isProgrammaticScroll$delegate, boolean <set-?>) { MutableState mutableState = $isProgrammaticScroll$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 252 */     mutableState.setValue(value$iv); } private static final boolean TaskSteps$lambda$12(State $isAtBottom$delegate) { State state = $isAtBottom$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 254 */     return ((Boolean)state.getValue()).booleanValue(); }
/*     */ 
/*     */   
/*     */   private static final boolean TaskSteps$lambda$11$lambda$10(LazyListState $lazyListState) {
/*     */     (LazyListItemInfo)CollectionsKt.lastOrNull($lazyListState.getLayoutInfo().getVisibleItemsInfo());
/*     */     Integer lastVisibleIndex = ((LazyListItemInfo)CollectionsKt.lastOrNull($lazyListState.getLayoutInfo().getVisibleItemsInfo()) != null) ? Integer.valueOf(((LazyListItemInfo)CollectionsKt.lastOrNull($lazyListState.getLayoutInfo().getVisibleItemsInfo())).getIndex()) : null;
/*     */     int totalItemsCount = $lazyListState.getLayoutInfo().getTotalItemsCount();
/*     */     return (lastVisibleIndex != null && lastVisibleIndex.intValue() >= totalItemsCount - 1);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TaskSteps.kt", l = {61}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.TaskStepsKt$TaskSteps$1$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class TaskStepsKt$TaskSteps$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     TaskStepsKt$TaskSteps$1$1(LazyListState $lazyListState, MutableState<Boolean> $isProgrammaticScroll$delegate, MutableState<Boolean> $autoScrollEnabled$delegate, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (SnapshotStateKt.snapshotFlow(this.$lazyListState::invokeSuspend$lambda$0).collect(new FlowCollector(this.$lazyListState, this.$isProgrammaticScroll$delegate, this.$autoScrollEnabled$delegate) {
/*     */                 public final Object emit(boolean isScrolling, Continuation $completion) {
/*     */                   // Byte code:
/*     */                   //   0: iload_1
/*     */                   //   1: ifeq -> 25
/*     */                   //   4: aload_0
/*     */                   //   5: getfield $isProgrammaticScroll$delegate : Landroidx/compose/runtime/MutableState;
/*     */                   //   8: invokestatic access$TaskSteps$lambda$8 : (Landroidx/compose/runtime/MutableState;)Z
/*     */                   //   11: ifne -> 25
/*     */                   //   14: aload_0
/*     */                   //   15: getfield $autoScrollEnabled$delegate : Landroidx/compose/runtime/MutableState;
/*     */                   //   18: iconst_0
/*     */                   //   19: invokestatic access$TaskSteps$lambda$6 : (Landroidx/compose/runtime/MutableState;Z)V
/*     */                   //   22: goto -> 110
/*     */                   //   25: aload_0
/*     */                   //   26: getfield $lazyListState : Landroidx/compose/foundation/lazy/LazyListState;
/*     */                   //   29: invokevirtual getLayoutInfo : ()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;
/*     */                   //   32: invokeinterface getVisibleItemsInfo : ()Ljava/util/List;
/*     */                   //   37: invokestatic lastOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*     */                   //   40: checkcast androidx/compose/foundation/lazy/LazyListItemInfo
/*     */                   //   43: dup
/*     */                   //   44: ifnull -> 58
/*     */                   //   47: invokeinterface getIndex : ()I
/*     */                   //   52: invokestatic boxInt : (I)Ljava/lang/Integer;
/*     */                   //   55: goto -> 60
/*     */                   //   58: pop
/*     */                   //   59: aconst_null
/*     */                   //   60: astore_3
/*     */                   //   61: aload_0
/*     */                   //   62: getfield $lazyListState : Landroidx/compose/foundation/lazy/LazyListState;
/*     */                   //   65: invokevirtual getLayoutInfo : ()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;
/*     */                   //   68: invokeinterface getTotalItemsCount : ()I
/*     */                   //   73: istore #4
/*     */                   //   75: aload_0
/*     */                   //   76: getfield $autoScrollEnabled$delegate : Landroidx/compose/runtime/MutableState;
/*     */                   //   79: aload_3
/*     */                   //   80: iload #4
/*     */                   //   82: iconst_1
/*     */                   //   83: isub
/*     */                   //   84: istore #5
/*     */                   //   86: dup
/*     */                   //   87: ifnonnull -> 94
/*     */                   //   90: pop
/*     */                   //   91: goto -> 106
/*     */                   //   94: invokevirtual intValue : ()I
/*     */                   //   97: iload #5
/*     */                   //   99: if_icmpne -> 106
/*     */                   //   102: iconst_1
/*     */                   //   103: goto -> 107
/*     */                   //   106: iconst_0
/*     */                   //   107: invokestatic access$TaskSteps$lambda$6 : (Landroidx/compose/runtime/MutableState;Z)V
/*     */                   //   110: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                   //   113: areturn
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #62	-> 0
/*     */                   //   #63	-> 14
/*     */                   //   #65	-> 25
/*     */                   //   #66	-> 61
/*     */                   //   #67	-> 75
/*     */                   //   #69	-> 110
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   61	49	3	lastVisible	Ljava/lang/Integer;
/*     */                   //   75	35	4	totalItems	I
/*     */                   //   0	114	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TaskStepsKt$TaskSteps$1$1$2;
/*     */                   //   0	114	1	isScrolling	Z
/*     */                   //   0	114	2	$completion	Lkotlin/coroutines/Continuation;
/*     */                 }
/*     */               }(Continuation)this) == object)
/*     */             return object; 
/*     */           SnapshotStateKt.snapshotFlow(this.$lazyListState::invokeSuspend$lambda$0).collect(new FlowCollector(this.$lazyListState, this.$isProgrammaticScroll$delegate, this.$autoScrollEnabled$delegate) {
/*     */                 public final Object emit(boolean isScrolling, Continuation $completion) {
/*     */                   // Byte code:
/*     */                   //   0: iload_1
/*     */                   //   1: ifeq -> 25
/*     */                   //   4: aload_0
/*     */                   //   5: getfield $isProgrammaticScroll$delegate : Landroidx/compose/runtime/MutableState;
/*     */                   //   8: invokestatic access$TaskSteps$lambda$8 : (Landroidx/compose/runtime/MutableState;)Z
/*     */                   //   11: ifne -> 25
/*     */                   //   14: aload_0
/*     */                   //   15: getfield $autoScrollEnabled$delegate : Landroidx/compose/runtime/MutableState;
/*     */                   //   18: iconst_0
/*     */                   //   19: invokestatic access$TaskSteps$lambda$6 : (Landroidx/compose/runtime/MutableState;Z)V
/*     */                   //   22: goto -> 110
/*     */                   //   25: aload_0
/*     */                   //   26: getfield $lazyListState : Landroidx/compose/foundation/lazy/LazyListState;
/*     */                   //   29: invokevirtual getLayoutInfo : ()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;
/*     */                   //   32: invokeinterface getVisibleItemsInfo : ()Ljava/util/List;
/*     */                   //   37: invokestatic lastOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*     */                   //   40: checkcast androidx/compose/foundation/lazy/LazyListItemInfo
/*     */                   //   43: dup
/*     */                   //   44: ifnull -> 58
/*     */                   //   47: invokeinterface getIndex : ()I
/*     */                   //   52: invokestatic boxInt : (I)Ljava/lang/Integer;
/*     */                   //   55: goto -> 60
/*     */                   //   58: pop
/*     */                   //   59: aconst_null
/*     */                   //   60: astore_3
/*     */                   //   61: aload_0
/*     */                   //   62: getfield $lazyListState : Landroidx/compose/foundation/lazy/LazyListState;
/*     */                   //   65: invokevirtual getLayoutInfo : ()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;
/*     */                   //   68: invokeinterface getTotalItemsCount : ()I
/*     */                   //   73: istore #4
/*     */                   //   75: aload_0
/*     */                   //   76: getfield $autoScrollEnabled$delegate : Landroidx/compose/runtime/MutableState;
/*     */                   //   79: aload_3
/*     */                   //   80: iload #4
/*     */                   //   82: iconst_1
/*     */                   //   83: isub
/*     */                   //   84: istore #5
/*     */                   //   86: dup
/*     */                   //   87: ifnonnull -> 94
/*     */                   //   90: pop
/*     */                   //   91: goto -> 106
/*     */                   //   94: invokevirtual intValue : ()I
/*     */                   //   97: iload #5
/*     */                   //   99: if_icmpne -> 106
/*     */                   //   102: iconst_1
/*     */                   //   103: goto -> 107
/*     */                   //   106: iconst_0
/*     */                   //   107: invokestatic access$TaskSteps$lambda$6 : (Landroidx/compose/runtime/MutableState;Z)V
/*     */                   //   110: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                   //   113: areturn
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #62	-> 0
/*     */                   //   #63	-> 14
/*     */                   //   #65	-> 25
/*     */                   //   #66	-> 61
/*     */                   //   #67	-> 75
/*     */                   //   #69	-> 110
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   61	49	3	lastVisible	Ljava/lang/Integer;
/*     */                   //   75	35	4	totalItems	I
/*     */                   //   0	114	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TaskStepsKt$TaskSteps$1$1$2;
/*     */                   //   0	114	1	isScrolling	Z
/*     */                   //   0	114	2	$completion	Lkotlin/coroutines/Continuation;
/*     */                 }
/*     */               }(Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super TaskStepsKt$TaskSteps$1$1> $completion) {
/*     */       return (Continuation<Unit>)new TaskStepsKt$TaskSteps$1$1(this.$lazyListState, this.$isProgrammaticScroll$delegate, this.$autoScrollEnabled$delegate, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((TaskStepsKt$TaskSteps$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     private static final boolean invokeSuspend$lambda$0(LazyListState $lazyListState) {
/*     */       return $lazyListState.isScrollInProgress();
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nTaskSteps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskSteps.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TaskStepsKt$TaskSteps$2$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,146:1\n1225#2,6:147\n*S KotlinDebug\n*F\n+ 1 TaskSteps.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TaskStepsKt$TaskSteps$2$1\n*L\n78#1:147,6\n*E\n"})
/*     */   static final class TaskStepsKt$TaskSteps$2$1 implements Function2<Composer, Integer, Unit> {
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
/*     */       //   13: ifne -> 257
/*     */       //   16: invokestatic isTraceInProgress : ()Z
/*     */       //   19: ifeq -> 31
/*     */       //   22: ldc -930967888
/*     */       //   24: iload_2
/*     */       //   25: iconst_m1
/*     */       //   26: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.TaskSteps.<anonymous>.<anonymous> (TaskSteps.kt:77)'
/*     */       //   28: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   31: aconst_null
/*     */       //   32: aload_0
/*     */       //   33: getfield $lazyListState : Landroidx/compose/foundation/lazy/LazyListState;
/*     */       //   36: aconst_null
/*     */       //   37: iconst_0
/*     */       //   38: aconst_null
/*     */       //   39: aconst_null
/*     */       //   40: aconst_null
/*     */       //   41: iconst_0
/*     */       //   42: aload_1
/*     */       //   43: ldc 1772193591
/*     */       //   45: invokeinterface startReplaceGroup : (I)V
/*     */       //   50: aload_1
/*     */       //   51: astore #4
/*     */       //   53: aload_1
/*     */       //   54: aload_0
/*     */       //   55: getfield $unifiedStepList : Ljava/util/List;
/*     */       //   58: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   63: aload_1
/*     */       //   64: aload_0
/*     */       //   65: getfield $isChainRunning$delegate : Landroidx/compose/runtime/State;
/*     */       //   68: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   73: ior
/*     */       //   74: aload_1
/*     */       //   75: aload_0
/*     */       //   76: getfield $showPlanAsStep : Z
/*     */       //   79: invokeinterface changed : (Z)Z
/*     */       //   84: ior
/*     */       //   85: aload_1
/*     */       //   86: aload_0
/*     */       //   87: getfield $model : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;
/*     */       //   90: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   95: ior
/*     */       //   96: istore #5
/*     */       //   98: aload_0
/*     */       //   99: getfield $unifiedStepList : Ljava/util/List;
/*     */       //   102: astore #6
/*     */       //   104: aload_0
/*     */       //   105: getfield $showPlanAsStep : Z
/*     */       //   108: istore #7
/*     */       //   110: aload_0
/*     */       //   111: getfield $model : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;
/*     */       //   114: astore #8
/*     */       //   116: aload_0
/*     */       //   117: getfield $isChainRunning$delegate : Landroidx/compose/runtime/State;
/*     */       //   120: astore #9
/*     */       //   122: iconst_0
/*     */       //   123: istore #10
/*     */       //   125: aload #4
/*     */       //   127: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   132: astore #11
/*     */       //   134: iconst_0
/*     */       //   135: istore #12
/*     */       //   137: iload #5
/*     */       //   139: ifne -> 153
/*     */       //   142: aload #11
/*     */       //   144: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   147: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   150: if_acmpne -> 221
/*     */       //   153: istore #22
/*     */       //   155: astore #21
/*     */       //   157: astore #20
/*     */       //   159: astore #19
/*     */       //   161: istore #18
/*     */       //   163: astore #17
/*     */       //   165: astore #16
/*     */       //   167: astore #15
/*     */       //   169: iconst_0
/*     */       //   170: istore #13
/*     */       //   172: aload #6
/*     */       //   174: iload #7
/*     */       //   176: aload #8
/*     */       //   178: aload #9
/*     */       //   180: <illegal opcode> invoke : (Ljava/util/List;ZLcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function1;
/*     */       //   185: astore #23
/*     */       //   187: aload #15
/*     */       //   189: aload #16
/*     */       //   191: aload #17
/*     */       //   193: iload #18
/*     */       //   195: aload #19
/*     */       //   197: aload #20
/*     */       //   199: aload #21
/*     */       //   201: iload #22
/*     */       //   203: aload #23
/*     */       //   205: astore #14
/*     */       //   207: aload #4
/*     */       //   209: aload #14
/*     */       //   211: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   216: aload #14
/*     */       //   218: goto -> 223
/*     */       //   221: aload #11
/*     */       //   223: nop
/*     */       //   224: nop
/*     */       //   225: nop
/*     */       //   226: checkcast kotlin/jvm/functions/Function1
/*     */       //   229: astore_3
/*     */       //   230: aload_1
/*     */       //   231: invokeinterface endReplaceGroup : ()V
/*     */       //   236: aload_3
/*     */       //   237: aload_1
/*     */       //   238: iconst_0
/*     */       //   239: sipush #253
/*     */       //   242: invokestatic LazyColumn : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
/*     */       //   245: invokestatic isTraceInProgress : ()Z
/*     */       //   248: ifeq -> 263
/*     */       //   251: invokestatic traceEventEnd : ()V
/*     */       //   254: goto -> 263
/*     */       //   257: aload_1
/*     */       //   258: invokeinterface skipToGroupEnd : ()V
/*     */       //   263: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #78	-> 0
/*     */       //   #147	-> 125
/*     */       //   #148	-> 137
/*     */       //   #149	-> 153
/*     */       //   #78	-> 172
/*     */       //   #149	-> 205
/*     */       //   #150	-> 207
/*     */       //   #151	-> 216
/*     */       //   #152	-> 221
/*     */       //   #148	-> 223
/*     */       //   #147	-> 224
/*     */       //   #147	-> 225
/*     */       //   #78	-> 226
/*     */       //   #90	-> 257
/*     */       //   #91	-> 263
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   172	13	13	$i$a$-cache-TaskStepsKt$TaskSteps$2$1$1	I
/*     */       //   207	11	14	value$iv	Ljava/lang/Object;
/*     */       //   137	87	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   134	90	11	it$iv	Ljava/lang/Object;
/*     */       //   125	101	10	$i$f$cache	I
/*     */       //   122	104	4	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   122	104	5	invalid$iv	Z
/*     */       //   0	264	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TaskStepsKt$TaskSteps$2$1;
/*     */       //   0	264	1	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	264	2	$changed	I
/*     */     }
/*     */     
/*     */     private static final Unit invoke$lambda$1$lambda$0(List<? extends TaskStep> $unifiedStepList, boolean $showPlanAsStep, TaskChainDetailsViewModel $model, State<Boolean> $isChainRunning$delegate, LazyListScope $this$LazyColumn) {
/*     */       Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn");
/*     */       LazyListScope.items$default($this$LazyColumn, $unifiedStepList.size(), null, null, (Function4)ComposableLambdaKt.composableLambdaInstance(1470960333, true, new TaskStepsKt$TaskSteps$2$1$1$1$1($unifiedStepList, $showPlanAsStep, $model, $isChainRunning$delegate)), 6, null);
/*     */       LazyListScope.item$default($this$LazyColumn, null, null, ComposableSingletons$TaskStepsKt.INSTANCE.getLambda-1$ej_ui(), 3, null);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     TaskStepsKt$TaskSteps$2$1(LazyListState $lazyListState, List<TaskStep> $unifiedStepList, State<Boolean> $isChainRunning$delegate, boolean $showPlanAsStep, TaskChainDetailsViewModel $model) {}
/*     */   }
/*     */   
/*     */   private static final Job TaskSteps$lambda$16$lambda$15$lambda$14(CoroutineScope $scope, MutableState<Boolean> $autoScrollEnabled$delegate, LazyListState $lazyListState) {
/*     */     TaskSteps$lambda$6($autoScrollEnabled$delegate, true);
/*     */     return BuildersKt.launch$default($scope, null, null, new TaskStepsKt$TaskSteps$2$2$1$1($lazyListState, null), 3, null);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TaskSteps.kt", l = {98}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.TaskStepsKt$TaskSteps$2$2$1$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class TaskStepsKt$TaskSteps$2$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     TaskStepsKt$TaskSteps$2$2$1$1(LazyListState $lazyListState, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (LazyListState.animateScrollToItem$default(this.$lazyListState, this.$lazyListState.getLayoutInfo().getTotalItemsCount(), 0, (Continuation)this, 2, null) == object)
/*     */             return object; 
/*     */           LazyListState.animateScrollToItem$default(this.$lazyListState, this.$lazyListState.getLayoutInfo().getTotalItemsCount(), 0, (Continuation)this, 2, null);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super TaskStepsKt$TaskSteps$2$2$1$1> $completion) {
/*     */       return (Continuation<Unit>)new TaskStepsKt$TaskSteps$2$2$1$1(this.$lazyListState, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((TaskStepsKt$TaskSteps$2$2$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TaskSteps.kt", l = {105, 109}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.TaskStepsKt$TaskSteps$3$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class TaskStepsKt$TaskSteps$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     TaskStepsKt$TaskSteps$3$1(List<TaskStep> $unifiedStepList, LazyListState $lazyListState, MutableState<Boolean> $autoScrollEnabled$delegate, MutableState<Boolean> $isProgrammaticScroll$delegate, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore_2
/*     */       //   4: aload_0
/*     */       //   5: getfield label : I
/*     */       //   8: tableswitch default -> 165, 0 -> 36, 1 -> 62, 2 -> 147
/*     */       //   36: aload_1
/*     */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   40: ldc2_w 300
/*     */       //   43: aload_0
/*     */       //   44: checkcast kotlin/coroutines/Continuation
/*     */       //   47: aload_0
/*     */       //   48: iconst_1
/*     */       //   49: putfield label : I
/*     */       //   52: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   55: dup
/*     */       //   56: aload_2
/*     */       //   57: if_acmpne -> 67
/*     */       //   60: aload_2
/*     */       //   61: areturn
/*     */       //   62: aload_1
/*     */       //   63: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   66: aload_1
/*     */       //   67: pop
/*     */       //   68: aload_0
/*     */       //   69: getfield $autoScrollEnabled$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   72: invokestatic access$TaskSteps$lambda$5 : (Landroidx/compose/runtime/MutableState;)Z
/*     */       //   75: ifeq -> 161
/*     */       //   78: aload_0
/*     */       //   79: getfield $unifiedStepList : Ljava/util/List;
/*     */       //   82: checkcast java/util/Collection
/*     */       //   85: invokeinterface isEmpty : ()Z
/*     */       //   90: ifne -> 97
/*     */       //   93: iconst_1
/*     */       //   94: goto -> 98
/*     */       //   97: iconst_0
/*     */       //   98: ifeq -> 161
/*     */       //   101: aload_0
/*     */       //   102: getfield $isProgrammaticScroll$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   105: iconst_1
/*     */       //   106: invokestatic access$TaskSteps$lambda$9 : (Landroidx/compose/runtime/MutableState;Z)V
/*     */       //   109: aload_0
/*     */       //   110: getfield $lazyListState : Landroidx/compose/foundation/lazy/LazyListState;
/*     */       //   113: aload_0
/*     */       //   114: getfield $lazyListState : Landroidx/compose/foundation/lazy/LazyListState;
/*     */       //   117: invokevirtual getLayoutInfo : ()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;
/*     */       //   120: invokeinterface getTotalItemsCount : ()I
/*     */       //   125: iconst_0
/*     */       //   126: aload_0
/*     */       //   127: checkcast kotlin/coroutines/Continuation
/*     */       //   130: iconst_2
/*     */       //   131: aconst_null
/*     */       //   132: aload_0
/*     */       //   133: iconst_2
/*     */       //   134: putfield label : I
/*     */       //   137: invokestatic animateScrollToItem$default : (Landroidx/compose/foundation/lazy/LazyListState;IILkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */       //   140: dup
/*     */       //   141: aload_2
/*     */       //   142: if_acmpne -> 152
/*     */       //   145: aload_2
/*     */       //   146: areturn
/*     */       //   147: aload_1
/*     */       //   148: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   151: aload_1
/*     */       //   152: pop
/*     */       //   153: aload_0
/*     */       //   154: getfield $isProgrammaticScroll$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   157: iconst_0
/*     */       //   158: invokestatic access$TaskSteps$lambda$9 : (Landroidx/compose/runtime/MutableState;Z)V
/*     */       //   161: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   164: areturn
/*     */       //   165: new java/lang/IllegalStateException
/*     */       //   168: dup
/*     */       //   169: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   171: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   174: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #104	-> 3
/*     */       //   #105	-> 40
/*     */       //   #104	-> 60
/*     */       //   #106	-> 67
/*     */       //   #106	-> 98
/*     */       //   #108	-> 101
/*     */       //   #109	-> 109
/*     */       //   #104	-> 145
/*     */       //   #110	-> 152
/*     */       //   #112	-> 161
/*     */       //   #104	-> 165
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	175	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TaskStepsKt$TaskSteps$3$1;
/*     */       //   40	125	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super TaskStepsKt$TaskSteps$3$1> $completion) {
/*     */       return (Continuation<Unit>)new TaskStepsKt$TaskSteps$3$1(this.$unifiedStepList, this.$lazyListState, this.$autoScrollEnabled$delegate, this.$isProgrammaticScroll$delegate, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((TaskStepsKt$TaskSteps$3$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   private static final void ScrollToEndButton(BoxScope $this$ScrollToEndButton, boolean showButton, Function0 onClick, Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: ldc_w 436633017
/*     */     //   4: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   9: astore_3
/*     */     //   10: iload #4
/*     */     //   12: istore #6
/*     */     //   14: iload #5
/*     */     //   16: ldc_w -2147483648
/*     */     //   19: iand
/*     */     //   20: ifeq -> 33
/*     */     //   23: iload #6
/*     */     //   25: bipush #6
/*     */     //   27: ior
/*     */     //   28: istore #6
/*     */     //   30: goto -> 61
/*     */     //   33: iload #4
/*     */     //   35: bipush #6
/*     */     //   37: iand
/*     */     //   38: ifne -> 61
/*     */     //   41: iload #6
/*     */     //   43: aload_3
/*     */     //   44: aload_0
/*     */     //   45: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   50: ifeq -> 57
/*     */     //   53: iconst_4
/*     */     //   54: goto -> 58
/*     */     //   57: iconst_2
/*     */     //   58: ior
/*     */     //   59: istore #6
/*     */     //   61: iload #5
/*     */     //   63: iconst_1
/*     */     //   64: iand
/*     */     //   65: ifeq -> 78
/*     */     //   68: iload #6
/*     */     //   70: bipush #48
/*     */     //   72: ior
/*     */     //   73: istore #6
/*     */     //   75: goto -> 108
/*     */     //   78: iload #4
/*     */     //   80: bipush #48
/*     */     //   82: iand
/*     */     //   83: ifne -> 108
/*     */     //   86: iload #6
/*     */     //   88: aload_3
/*     */     //   89: iload_1
/*     */     //   90: invokeinterface changed : (Z)Z
/*     */     //   95: ifeq -> 103
/*     */     //   98: bipush #32
/*     */     //   100: goto -> 105
/*     */     //   103: bipush #16
/*     */     //   105: ior
/*     */     //   106: istore #6
/*     */     //   108: iload #5
/*     */     //   110: iconst_2
/*     */     //   111: iand
/*     */     //   112: ifeq -> 126
/*     */     //   115: iload #6
/*     */     //   117: sipush #384
/*     */     //   120: ior
/*     */     //   121: istore #6
/*     */     //   123: goto -> 159
/*     */     //   126: iload #4
/*     */     //   128: sipush #384
/*     */     //   131: iand
/*     */     //   132: ifne -> 159
/*     */     //   135: iload #6
/*     */     //   137: aload_3
/*     */     //   138: aload_2
/*     */     //   139: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   144: ifeq -> 153
/*     */     //   147: sipush #256
/*     */     //   150: goto -> 156
/*     */     //   153: sipush #128
/*     */     //   156: ior
/*     */     //   157: istore #6
/*     */     //   159: iload #6
/*     */     //   161: sipush #147
/*     */     //   164: iand
/*     */     //   165: sipush #146
/*     */     //   168: if_icmpne -> 180
/*     */     //   171: aload_3
/*     */     //   172: invokeinterface getSkipping : ()Z
/*     */     //   177: ifne -> 292
/*     */     //   180: iload #5
/*     */     //   182: iconst_1
/*     */     //   183: iand
/*     */     //   184: ifeq -> 189
/*     */     //   187: iconst_1
/*     */     //   188: istore_1
/*     */     //   189: invokestatic isTraceInProgress : ()Z
/*     */     //   192: ifeq -> 207
/*     */     //   195: ldc_w 436633017
/*     */     //   198: iload #6
/*     */     //   200: iconst_m1
/*     */     //   201: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ScrollToEndButton (TaskSteps.kt:119)'
/*     */     //   204: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   207: iload_1
/*     */     //   208: aload_0
/*     */     //   209: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   212: checkcast androidx/compose/ui/Modifier
/*     */     //   215: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   218: invokevirtual getBottomEnd : ()Landroidx/compose/ui/Alignment;
/*     */     //   221: invokeinterface align : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;
/*     */     //   226: aconst_null
/*     */     //   227: fconst_0
/*     */     //   228: iconst_3
/*     */     //   229: aconst_null
/*     */     //   230: invokestatic fadeIn$default : (Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;
/*     */     //   233: aconst_null
/*     */     //   234: fconst_0
/*     */     //   235: iconst_3
/*     */     //   236: aconst_null
/*     */     //   237: invokestatic fadeOut$default : (Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;
/*     */     //   240: aconst_null
/*     */     //   241: ldc_w -584191007
/*     */     //   244: iconst_1
/*     */     //   245: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TaskStepsKt$ScrollToEndButton$1
/*     */     //   248: dup
/*     */     //   249: aload_0
/*     */     //   250: aload_2
/*     */     //   251: invokespecial <init> : (Landroidx/compose/foundation/layout/BoxScope;Lkotlin/jvm/functions/Function0;)V
/*     */     //   254: aload_3
/*     */     //   255: bipush #54
/*     */     //   257: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   260: checkcast kotlin/jvm/functions/Function3
/*     */     //   263: aload_3
/*     */     //   264: ldc_w 200064
/*     */     //   267: bipush #14
/*     */     //   269: iload #6
/*     */     //   271: iconst_3
/*     */     //   272: ishr
/*     */     //   273: iand
/*     */     //   274: ior
/*     */     //   275: bipush #16
/*     */     //   277: invokestatic AnimatedVisibility : (ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   280: invokestatic isTraceInProgress : ()Z
/*     */     //   283: ifeq -> 298
/*     */     //   286: invokestatic traceEventEnd : ()V
/*     */     //   289: goto -> 298
/*     */     //   292: aload_3
/*     */     //   293: invokeinterface skipToGroupEnd : ()V
/*     */     //   298: aload_3
/*     */     //   299: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   304: dup
/*     */     //   305: ifnull -> 328
/*     */     //   308: aload_0
/*     */     //   309: iload_1
/*     */     //   310: aload_2
/*     */     //   311: iload #4
/*     */     //   313: iload #5
/*     */     //   315: <illegal opcode> invoke : (Landroidx/compose/foundation/layout/BoxScope;ZLkotlin/jvm/functions/Function0;II)Lkotlin/jvm/functions/Function2;
/*     */     //   320: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   325: goto -> 329
/*     */     //   328: pop
/*     */     //   329: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #120	-> 0
/*     */     //   #118	-> 187
/*     */     //   #120	-> 204
/*     */     //   #124	-> 207
/*     */     //   #125	-> 208
/*     */     //   #126	-> 226
/*     */     //   #127	-> 233
/*     */     //   #128	-> 241
/*     */     //   #123	-> 277
/*     */     //   #145	-> 292
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   14	316	6	$dirty	I
/*     */     //   0	330	0	$this$ScrollToEndButton	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   0	330	1	showButton	Z
/*     */     //   0	330	2	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	330	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	330	4	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit TaskSteps$lambda$18(TaskChainDetailsViewModel $model, List<? extends TaskStep> $stepList, boolean $showPlanAsStep, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     TaskSteps($model, $stepList, $showPlanAsStep, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit ScrollToEndButton$lambda$19(BoxScope $this_ScrollToEndButton, boolean $showButton, Function0<? extends Job> $onClick, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     ScrollToEndButton($this_ScrollToEndButton, $showButton, $onClick, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nTaskSteps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskSteps.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TaskStepsKt$ScrollToEndButton$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,146:1\n149#2:147\n149#2:148\n149#2:149\n149#2:150\n1225#3,6:151\n71#4:157\n68#4,6:158\n74#4:192\n78#4:196\n79#5,6:164\n86#5,4:179\n90#5,2:189\n94#5:195\n368#6,9:170\n377#6:191\n378#6,2:193\n4034#7,6:183\n*S KotlinDebug\n*F\n+ 1 TaskSteps.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TaskStepsKt$ScrollToEndButton$1\n*L\n131#1:147\n132#1:148\n133#1:149\n134#1:150\n136#1:151,6\n129#1:157\n129#1:158,6\n129#1:192\n129#1:196\n129#1:164,6\n129#1:179,4\n129#1:189,2\n129#1:195\n129#1:170,9\n129#1:191\n129#1:193,2\n129#1:183,6\n*E\n"})
/*     */   static final class TaskStepsKt$ScrollToEndButton$1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(AnimatedVisibilityScope $this$AnimatedVisibility, Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter($this$AnimatedVisibility, "$this$AnimatedVisibility");
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventStart(-584191007, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ScrollToEndButton.<anonymous> (TaskSteps.kt:128)"); 
/*     */       int $this$dp$iv = 12, $i$f$getDp = 0;
/*     */       $this$dp$iv = 12;
/*     */       $i$f$getDp = 0;
/*     */       $this$dp$iv = 40;
/*     */       $i$f$getDp = 0;
/*     */       $this$dp$iv = 14;
/*     */       $i$f$getDp = 0;
/*     */       $this$dp$iv = 14;
/*     */       $i$f$getDp = 0;
/*     */       $composer.startReplaceGroup(1537410248);
/*     */       Composer composer1 = $composer;
/*     */       boolean bool1 = $composer.changed(this.$onClick);
/*     */       Function0<Job> function0 = this.$onClick;
/*     */       int $i$f$cache = 0;
/*     */       Object it$iv = composer1.rememberedValue();
/*     */       int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */       Role role = null;
/*     */       String str = null;
/*     */       boolean bool = false;
/*     */       Modifier modifier3 = this.$this_ScrollToEndButton.align(ClipKt.clip(BackgroundKt.background-bw27NRU(SizeKt.size-3ABfNKs(PaddingKt.padding-qDBjuR0$default((Modifier)Modifier.Companion, 0.0F, 0.0F, Dp.constructor-impl($this$dp$iv), Dp.constructor-impl($this$dp$iv), 3, null), Dp.constructor-impl($this$dp$iv)), MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getArrowDownIconBackgroundColor-0d7_KjU(), (Shape)RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl($this$dp$iv))), (Shape)RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl($this$dp$iv))), Alignment.Companion.getBottomEnd());
/*     */       int $i$a$-cache-TaskStepsKt$ScrollToEndButton$1$1 = 0;
/*     */       Function0 function03 = function0::invoke$lambda$1$lambda$0;
/*     */       Object value$iv = function03;
/*     */       composer1.updateRememberedValue(value$iv);
/*     */       Function0 function01 = (bool1 || it$iv == Composer.Companion.getEmpty()) ? (Function0)value$iv : (Function0)it$iv;
/*     */       $composer.endReplaceGroup();
/*     */       Modifier modifier1 = ClickableKt.clickable-XHw0xAI$default(modifier3, bool, str, role, function01, 7, null);
/*     */       int $changed$iv = 0;
/*     */       int $i$f$Box = 0;
/*     */       ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/*     */       Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
/*     */       boolean propagateMinConstraints$iv = false;
/*     */       MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv);
/*     */       int $changed$iv$iv = 0x70 & $changed$iv << 3;
/*     */       int $i$f$Layout = 0;
/*     */       ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/*     */       int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/*     */       CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/*     */       Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*     */       Function0 function02 = ComposeUiNode.Companion.getConstructor();
/*     */       int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6;
/*     */       int $i$f$ReusableComposeNode = 0;
/*     */       ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/*     */       if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier))
/*     */         ComposablesKt.invalidApplier(); 
/*     */       $composer.startReusableNode();
/*     */       if ($composer.getInserting()) {
/*     */         $composer.createNode(function02);
/*     */       } else {
/*     */         $composer.useNode();
/*     */       } 
/*     */       Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer);
/*     */       int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/*     */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/*     */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */       Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash();
/*     */       int $i$f$set-impl = 0;
/*     */       Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv;
/*     */       int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/*     */       if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/*     */         $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/*     */         $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */       } 
/*     */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */       int i = 0xE & $changed$iv$iv$iv >> 6;
/*     */       Composer $composer$iv = $composer;
/*     */       int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/*     */       ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
/*     */       int j = 0x6 | 0x70 & $changed$iv >> 6;
/*     */       Composer composer2 = $composer$iv;
/*     */       BoxScope $this$invoke_u24lambda_u242 = (BoxScope)BoxScopeInstance.INSTANCE;
/*     */       int $i$a$-Box-TaskStepsKt$ScrollToEndButton$1$2 = 0;
/*     */       PathIconKey pathIconKey = MatterhornThemeDataKt.getMatterhornTheme(composer2, 0).getArrowDownIcon();
/*     */       Modifier modifier2 = $this$invoke_u24lambda_u242.align((Modifier)Modifier.Companion, Alignment.Companion.getCenter());
/*     */       IconKt.Icon-FHprtrg((IconKey)pathIconKey, "scroll to end button", modifier2, null, 0L, new org.jetbrains.jewel.ui.painter.PainterHint[0], composer2, 0x30 | PathIconKey.$stable, 24);
/*     */       ComposerKt.sourceInformationMarkerEnd($composer$iv);
/*     */       $composer.endNode();
/*     */       ComposerKt.sourceInformationMarkerEnd($composer);
/*     */       ComposerKt.sourceInformationMarkerEnd($composer);
/*     */       ComposerKt.sourceInformationMarkerEnd($composer);
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd(); 
/*     */     }
/*     */     
/*     */     private static final Unit invoke$lambda$1$lambda$0(Function0 $onClick) {
/*     */       $onClick.invoke();
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     TaskStepsKt$ScrollToEndButton$1(BoxScope $receiver, Function0<Job> $onClick) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\TaskStepsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */