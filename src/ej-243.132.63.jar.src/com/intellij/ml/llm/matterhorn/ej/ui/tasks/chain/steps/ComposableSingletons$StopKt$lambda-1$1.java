/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*    */ import androidx.compose.foundation.layout.BoxScope;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*    */ import kotlin.Unit;
/*    */ import org.jetbrains.jewel.ui.icon.PathIconKey;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ final class ComposableSingletons$StopKt$lambda-1$1 implements Function3<BoxScope, Composer, Integer, Unit> {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(BoxScope $this$StepCard, Composer $composer, int $changed) {
/* 14 */     Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-43845796, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ComposableSingletons$StopKt.lambda-1.<anonymous> (Stop.kt:13)");  IconKt.Icon-FHprtrg((IconKey)MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getStoppedStateIcon(), "Stop Icon", null, null, 0L, new org.jetbrains.jewel.ui.painter.PainterHint[0], $composer, 0x30 | PathIconKey.$stable, 28); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   public static final ComposableSingletons$StopKt$lambda-1$1 INSTANCE = new ComposableSingletons$StopKt$lambda-1$1();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\ComposableSingletons$StopKt$lambda-1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */