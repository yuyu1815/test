/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*    */ 
/*    */ import androidx.compose.foundation.layout.RowScope;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.ui.text.font.FontWeight;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskStep;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeData;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.jewel.ui.component.TextKt;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ final class InfoKt$InfoStep$1 implements Function3<RowScope, Composer, Integer, Unit> {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(RowScope $this$StepCard, Composer $composer, int $changed) {
/* 23 */     Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(836113566, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.InfoStep.<anonymous> (Info.kt:22)");  TextKt.Text-bAzTDeA(
/* 24 */           this.$info.getName(), null, 0L, 0L, null, 
/* 25 */           FontWeight.Companion.getBold(), 
/* 26 */           MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getMessageFont($composer, MatterhornThemeData.$stable), 0L, null, 0, 0L, 0, false, 0, null, null, $composer, 196608, 0, 65438); if (ComposerKt.isTraceInProgress())
/* 27 */         ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   InfoKt$InfoStep$1(TaskStep.Info $info) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\InfoKt$InfoStep$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */