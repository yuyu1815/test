/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*     */ 
/*     */ import androidx.compose.foundation.layout.BoxKt;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.BoxScopeInstance;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.foundation.lazy.LazyItemScope;
/*     */ import androidx.compose.foundation.lazy.LazyListScope;
/*     */ import androidx.compose.foundation.lazy.LazyListState;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskStep;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.jewel.ui.component.ScrollableContainerKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nTaskSteps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskSteps.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TaskStepsKt$TaskSteps$2$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,146:1\n1225#2,6:147\n*S KotlinDebug\n*F\n+ 1 TaskSteps.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TaskStepsKt$TaskSteps$2$1\n*L\n78#1:147,6\n*E\n"})
/*     */ final class TaskStepsKt$TaskSteps$2$1
/*     */   implements Function2<Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: iload_2
/*     */     //   1: iconst_3
/*     */     //   2: iand
/*     */     //   3: iconst_2
/*     */     //   4: if_icmpne -> 16
/*     */     //   7: aload_1
/*     */     //   8: invokeinterface getSkipping : ()Z
/*     */     //   13: ifne -> 257
/*     */     //   16: invokestatic isTraceInProgress : ()Z
/*     */     //   19: ifeq -> 31
/*     */     //   22: ldc -930967888
/*     */     //   24: iload_2
/*     */     //   25: iconst_m1
/*     */     //   26: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.TaskSteps.<anonymous>.<anonymous> (TaskSteps.kt:77)'
/*     */     //   28: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   31: aconst_null
/*     */     //   32: aload_0
/*     */     //   33: getfield $lazyListState : Landroidx/compose/foundation/lazy/LazyListState;
/*     */     //   36: aconst_null
/*     */     //   37: iconst_0
/*     */     //   38: aconst_null
/*     */     //   39: aconst_null
/*     */     //   40: aconst_null
/*     */     //   41: iconst_0
/*     */     //   42: aload_1
/*     */     //   43: ldc 1772193591
/*     */     //   45: invokeinterface startReplaceGroup : (I)V
/*     */     //   50: aload_1
/*     */     //   51: astore #4
/*     */     //   53: aload_1
/*     */     //   54: aload_0
/*     */     //   55: getfield $unifiedStepList : Ljava/util/List;
/*     */     //   58: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   63: aload_1
/*     */     //   64: aload_0
/*     */     //   65: getfield $isChainRunning$delegate : Landroidx/compose/runtime/State;
/*     */     //   68: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   73: ior
/*     */     //   74: aload_1
/*     */     //   75: aload_0
/*     */     //   76: getfield $showPlanAsStep : Z
/*     */     //   79: invokeinterface changed : (Z)Z
/*     */     //   84: ior
/*     */     //   85: aload_1
/*     */     //   86: aload_0
/*     */     //   87: getfield $model : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;
/*     */     //   90: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   95: ior
/*     */     //   96: istore #5
/*     */     //   98: aload_0
/*     */     //   99: getfield $unifiedStepList : Ljava/util/List;
/*     */     //   102: astore #6
/*     */     //   104: aload_0
/*     */     //   105: getfield $showPlanAsStep : Z
/*     */     //   108: istore #7
/*     */     //   110: aload_0
/*     */     //   111: getfield $model : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;
/*     */     //   114: astore #8
/*     */     //   116: aload_0
/*     */     //   117: getfield $isChainRunning$delegate : Landroidx/compose/runtime/State;
/*     */     //   120: astore #9
/*     */     //   122: iconst_0
/*     */     //   123: istore #10
/*     */     //   125: aload #4
/*     */     //   127: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   132: astore #11
/*     */     //   134: iconst_0
/*     */     //   135: istore #12
/*     */     //   137: iload #5
/*     */     //   139: ifne -> 153
/*     */     //   142: aload #11
/*     */     //   144: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   147: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   150: if_acmpne -> 221
/*     */     //   153: istore #22
/*     */     //   155: astore #21
/*     */     //   157: astore #20
/*     */     //   159: astore #19
/*     */     //   161: istore #18
/*     */     //   163: astore #17
/*     */     //   165: astore #16
/*     */     //   167: astore #15
/*     */     //   169: iconst_0
/*     */     //   170: istore #13
/*     */     //   172: aload #6
/*     */     //   174: iload #7
/*     */     //   176: aload #8
/*     */     //   178: aload #9
/*     */     //   180: <illegal opcode> invoke : (Ljava/util/List;ZLcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;Landroidx/compose/runtime/State;)Lkotlin/jvm/functions/Function1;
/*     */     //   185: astore #23
/*     */     //   187: aload #15
/*     */     //   189: aload #16
/*     */     //   191: aload #17
/*     */     //   193: iload #18
/*     */     //   195: aload #19
/*     */     //   197: aload #20
/*     */     //   199: aload #21
/*     */     //   201: iload #22
/*     */     //   203: aload #23
/*     */     //   205: astore #14
/*     */     //   207: aload #4
/*     */     //   209: aload #14
/*     */     //   211: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   216: aload #14
/*     */     //   218: goto -> 223
/*     */     //   221: aload #11
/*     */     //   223: nop
/*     */     //   224: nop
/*     */     //   225: nop
/*     */     //   226: checkcast kotlin/jvm/functions/Function1
/*     */     //   229: astore_3
/*     */     //   230: aload_1
/*     */     //   231: invokeinterface endReplaceGroup : ()V
/*     */     //   236: aload_3
/*     */     //   237: aload_1
/*     */     //   238: iconst_0
/*     */     //   239: sipush #253
/*     */     //   242: invokestatic LazyColumn : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
/*     */     //   245: invokestatic isTraceInProgress : ()Z
/*     */     //   248: ifeq -> 263
/*     */     //   251: invokestatic traceEventEnd : ()V
/*     */     //   254: goto -> 263
/*     */     //   257: aload_1
/*     */     //   258: invokeinterface skipToGroupEnd : ()V
/*     */     //   263: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #78	-> 0
/*     */     //   #147	-> 125
/*     */     //   #148	-> 137
/*     */     //   #149	-> 153
/*     */     //   #78	-> 172
/*     */     //   #149	-> 205
/*     */     //   #150	-> 207
/*     */     //   #151	-> 216
/*     */     //   #152	-> 221
/*     */     //   #148	-> 223
/*     */     //   #147	-> 224
/*     */     //   #147	-> 225
/*     */     //   #78	-> 226
/*     */     //   #90	-> 257
/*     */     //   #91	-> 263
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   172	13	13	$i$a$-cache-TaskStepsKt$TaskSteps$2$1$1	I
/*     */     //   207	11	14	value$iv	Ljava/lang/Object;
/*     */     //   137	87	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   134	90	11	it$iv	Ljava/lang/Object;
/*     */     //   125	101	10	$i$f$cache	I
/*     */     //   122	104	4	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   122	104	5	invalid$iv	Z
/*     */     //   0	264	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TaskStepsKt$TaskSteps$2$1;
/*     */     //   0	264	1	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	264	2	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit invoke$lambda$1$lambda$0(List<? extends TaskStep> $unifiedStepList, boolean $showPlanAsStep, TaskChainDetailsViewModel $model, State<Boolean> $isChainRunning$delegate, LazyListScope $this$LazyColumn) {
/*  79 */     Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn"); LazyListScope.items$default($this$LazyColumn, $unifiedStepList.size(), null, null, (Function4)ComposableLambdaKt.composableLambdaInstance(1470960333, true, new TaskStepsKt$TaskSteps$2$1$1$1$1($unifiedStepList, $showPlanAsStep, $model, $isChainRunning$delegate)), 6, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  89 */     LazyListScope.item$default($this$LazyColumn, null, null, ComposableSingletons$TaskStepsKt.INSTANCE.getLambda-1$ej_ui(), 3, null);
/*  90 */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   TaskStepsKt$TaskSteps$2$1(LazyListState $lazyListState, List<TaskStep> $unifiedStepList, State<Boolean> $isChainRunning$delegate, boolean $showPlanAsStep, TaskChainDetailsViewModel $model) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\TaskStepsKt$TaskSteps$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */