/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*     */ 
/*     */ import androidx.compose.foundation.layout.BoxKt;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.BoxScopeInstance;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.foundation.lazy.LazyItemScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.Updater;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nTaskSteps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskSteps.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TaskStepsKt$TaskSteps$2$1$1$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,146:1\n71#2:147\n68#2,6:148\n74#2:182\n78#2:186\n79#3,6:154\n86#3,4:169\n90#3,2:179\n94#3:185\n368#4,9:160\n377#4:181\n378#4,2:183\n4034#5,6:173\n*S KotlinDebug\n*F\n+ 1 TaskSteps.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TaskStepsKt$TaskSteps$2$1$1$1$1\n*L\n80#1:147\n80#1:148,6\n80#1:182\n80#1:186\n80#1:154,6\n80#1:169,4\n80#1:179,2\n80#1:185\n80#1:160,9\n80#1:181\n80#1:183,2\n80#1:173,6\n*E\n"})
/*     */ final class TaskStepsKt$TaskSteps$2$1$1$1$1
/*     */   implements Function4<LazyItemScope, Integer, Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
/*  80 */     Intrinsics.checkNotNullParameter($this$items, "$this$items"); int $dirty = $changed; if (($changed & 0x30) == 0) $dirty |= $composer.changed(it) ? 32 : 16;  if (($dirty & 0x91) != 144 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1470960333, $dirty, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.TaskSteps.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TaskSteps.kt:79)");  Modifier modifier1 = PaddingKt.padding-qDBjuR0$default((Modifier)Modifier.Companion, 0.0F, 0.0F, ScrollableContainerKt.scrollbarContentSafePadding(null, $composer, 0, 1), 0.0F, 11, null); List<TaskStep> list = this.$unifiedStepList; boolean bool1 = this.$showPlanAsStep; TaskChainDetailsViewModel taskChainDetailsViewModel = this.$model; State<Boolean> state = this.$isChainRunning$delegate; int $changed$iv = 0, $i$f$Box = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 147 */       ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/* 148 */       Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
/* 149 */       boolean propagateMinConstraints$iv = false;
/*     */ 
/*     */       
/* 152 */       MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/* 153 */       int $i$f$Layout = 0;
/* 154 */       ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 155 */       int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 156 */       CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/* 157 */       Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*     */       
/* 159 */       Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 160 */       ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 161 */       if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 162 */         .startReusableNode();
/* 163 */       if ($composer.getInserting()) { $composer
/* 164 */           .createNode(function0); } else { $composer
/*     */           
/* 166 */           .useNode(); }
/*     */       
/* 168 */       Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 169 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 170 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */       
/* 172 */       Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 173 */       Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 174 */       if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 175 */         $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 176 */         $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */       } 
/*     */       
/* 179 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */       
/* 181 */       int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/* 182 */       ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-TaskStepsKt$TaskSteps$2$1$1$1$1$1 = 0; StepItemViewKt.Step(list.get(it), TaskStepsKt.access$TaskSteps$lambda$3(state), bool1, taskChainDetailsViewModel.checkProjectUnderVCS$ej_ui(), composer1, 0); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 183 */       $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 184 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 185 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 186 */       if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*     */     else
/*     */     { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   TaskStepsKt$TaskSteps$2$1$1$1$1(List<TaskStep> $unifiedStepList, boolean $showPlanAsStep, TaskChainDetailsViewModel $model, State<Boolean> $isChainRunning$delegate) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\TaskStepsKt$TaskSteps$2$1$1$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */