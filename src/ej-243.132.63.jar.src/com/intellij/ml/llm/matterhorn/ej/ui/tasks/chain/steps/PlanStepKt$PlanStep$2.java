/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*    */ import androidx.compose.foundation.layout.RowScope;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.components.CopyTextToClipboardButtonKt;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskStep;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeData;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.reflect.KFunction;
/*    */ import org.jetbrains.jewel.ui.component.TextKt;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ @SourceDebugExtension({"SMAP\nPlanStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlanStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PlanStepKt$PlanStep$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,42:1\n1225#2,6:43\n*S KotlinDebug\n*F\n+ 1 PlanStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PlanStepKt$PlanStep$2\n*L\n30#1:43,6\n*E\n"})
/*    */ final class PlanStepKt$PlanStep$2 implements Function3<RowScope, Composer, Integer, Unit> {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(RowScope $this$StepCard, Composer $composer, int $changed) {
/* 27 */     Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(860994459, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.PlanStep.<anonymous> (PlanStep.kt:26)");  TextKt.Text-bAzTDeA(this.$plan.getName(), null, 0L, 0L, null, null, MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getMessageFont($composer, MatterhornThemeData.$stable), 0L, null, 0, 0L, 0, false, 0, null, null, $composer, 0, 0, 65470);
/*    */ 
/*    */       
/* 30 */       TaskStep.Plan plan = this.$plan; $composer.startReplaceGroup(-2141267656); Composer composer = $composer; boolean invalid$iv = $composer.changedInstance(plan); int $i$f$cache = 0;
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
/* 43 */       Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*    */       
/* 45 */       boolean bool1 = PlanStepKt.access$PlanStep$lambda$1(this.$isMouseHovering$delegate); int $i$a$-cache-PlanStepKt$PlanStep$2$1 = 0; KFunction kFunction2 = (KFunction)new PlanStepKt$PlanStep$2$1$1(plan); Object value$iv = kFunction2;
/* 46 */       composer.updateRememberedValue(value$iv);
/* 47 */       KFunction kFunction1 = (invalid$iv || it$iv == Composer.Companion.getEmpty()) ? (KFunction)value$iv : 
/* 48 */         (KFunction)it$iv;
/*    */       $composer.endReplaceGroup();
/*    */       CopyTextToClipboardButtonKt.CopyTextToClipboardButton-SBKQj6I(bool1, (Function0)kFunction1, null, 0L, null, null, $composer, 0, 60);
/*    */       if (ComposerKt.isTraceInProgress())
/*    */         ComposerKt.traceEventEnd();  }
/*    */     else
/*    */     { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   PlanStepKt$PlanStep$2(TaskStep.Plan $plan, MutableState<Boolean> $isMouseHovering$delegate) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\PlanStepKt$PlanStep$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */