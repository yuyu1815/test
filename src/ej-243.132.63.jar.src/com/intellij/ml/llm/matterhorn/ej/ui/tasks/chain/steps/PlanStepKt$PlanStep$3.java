/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*    */ 
/*    */ import androidx.compose.foundation.layout.BoxKt;
/*    */ import androidx.compose.foundation.layout.BoxScope;
/*    */ import androidx.compose.foundation.layout.BoxScopeInstance;
/*    */ import androidx.compose.foundation.layout.ColumnScope;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.ComposablesKt;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.CompositionLocalMap;
/*    */ import androidx.compose.runtime.Updater;
/*    */ import androidx.compose.ui.Alignment;
/*    */ import androidx.compose.ui.ComposedModifierKt;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.layout.MeasurePolicy;
/*    */ import androidx.compose.ui.node.ComposeUiNode;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskStep;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ @SourceDebugExtension({"SMAP\nPlanStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlanStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PlanStepKt$PlanStep$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,42:1\n71#2:43\n67#2,7:44\n74#2:79\n78#2:83\n79#3,6:51\n86#3,4:66\n90#3,2:76\n94#3:82\n368#4,9:57\n377#4:78\n378#4,2:80\n4034#5,6:70\n*S KotlinDebug\n*F\n+ 1 PlanStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PlanStepKt$PlanStep$3\n*L\n34#1:43\n34#1:44,7\n34#1:79\n34#1:83\n34#1:51,6\n34#1:66,4\n34#1:76,2\n34#1:82\n34#1:57,9\n34#1:78\n34#1:80,2\n34#1:70,6\n*E\n"})
/*    */ final class PlanStepKt$PlanStep$3 implements Function3<ColumnScope, Composer, Integer, Unit> {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(ColumnScope $this$StepCard, Composer $composer, int $changed) {
/* 34 */     Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(2143841009, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.PlanStep.<anonymous> (PlanStep.kt:33)");  TaskStep.Plan plan = this.$plan; boolean bool1 = this.$isChainRunning; int $changed$iv = 0, $i$f$Box = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 43 */       ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/* 44 */       Modifier modifier$iv = (Modifier)Modifier.Companion;
/* 45 */       Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
/* 46 */       boolean propagateMinConstraints$iv = false;
/*    */ 
/*    */       
/* 49 */       MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/* 50 */       int $i$f$Layout = 0;
/* 51 */       ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 52 */       int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 53 */       CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/* 54 */       Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
/*    */       
/* 56 */       Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 57 */       ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 58 */       if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 59 */         .startReusableNode();
/* 60 */       if ($composer.getInserting()) { $composer
/* 61 */           .createNode(function0); } else { $composer
/*    */           
/* 63 */           .useNode(); }
/*    */       
/* 65 */       Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 66 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 67 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*    */       
/* 69 */       Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 70 */       Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 71 */       if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 72 */         $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 73 */         $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*    */       } 
/*    */       
/* 76 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*    */       
/* 78 */       int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/* 79 */       ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-PlanStepKt$PlanStep$3$1 = 0; PlanKt.Plan(null, plan.getPlan(), bool1, composer1, 0, 1); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 80 */       $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 81 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 82 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 83 */       if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*    */     else
/*    */     { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   PlanStepKt$PlanStep$3(TaskStep.Plan $plan, boolean $isChainRunning) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\PlanStepKt$PlanStep$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */