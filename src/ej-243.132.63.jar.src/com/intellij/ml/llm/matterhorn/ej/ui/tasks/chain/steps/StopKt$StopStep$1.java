/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*    */ import androidx.compose.foundation.layout.RowScope;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.ui.text.font.FontFamily;
/*    */ import androidx.compose.ui.text.font.FontWeight;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskStep;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeData;
/*    */ import kotlin.Unit;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ final class StopKt$StopStep$1 implements Function3<RowScope, Composer, Integer, Unit> {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(RowScope $this$StepCard, Composer $composer, int $changed) {
/* 16 */     Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(684053066, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.StopStep.<anonymous> (Stop.kt:15)"); 
/* 17 */       String str = this.$stop.getName();
/* 18 */       FontFamily fontFamily = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getMessageFont($composer, MatterhornThemeData.$stable);
/* 19 */       FontWeight fontWeight = FontWeight.Companion.getBold(); TextKt.Text-bAzTDeA(str, null, 0L, 0L, null, fontWeight, fontFamily, 0L, null, 0, 0L, 0, false, 0, null, null, $composer, 196608, 0, 65438); if (ComposerKt.isTraceInProgress())
/* 20 */         ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   StopKt$StopStep$1(TaskStep.Stop $stop) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\StopKt$StopStep$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */