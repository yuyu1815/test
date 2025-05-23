/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*    */ import androidx.compose.foundation.layout.BoxScope;
/*    */ import androidx.compose.foundation.layout.RowScope;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ public final class ComposableSingletons$StopKt {
/*    */   @NotNull
/* 14 */   public static final ComposableSingletons$StopKt INSTANCE = new ComposableSingletons$StopKt(); @NotNull private static Function3<BoxScope, Composer, Integer, Unit> lambda-1 = (Function3<BoxScope, Composer, Integer, Unit>)ComposableLambdaKt.composableLambdaInstance(-43845796, false, ComposableSingletons$StopKt$lambda-1$1.INSTANCE); @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class ComposableSingletons$StopKt$lambda-1$1 implements Function3<BoxScope, Composer, Integer, Unit> { public static final ComposableSingletons$StopKt$lambda-1$1 INSTANCE = new ComposableSingletons$StopKt$lambda-1$1(); @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(BoxScope $this$StepCard, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-43845796, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ComposableSingletons$StopKt.lambda-1.<anonymous> (Stop.kt:13)");  IconKt.Icon-FHprtrg((IconKey)MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getStoppedStateIcon(), "Stop Icon", null, null, 0L, new org.jetbrains.jewel.ui.painter.PainterHint[0], $composer, 0x30 | PathIconKey.$stable, 28); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */        }
/*    */      }
/*    */   @NotNull
/*    */   public final Function3<BoxScope, Composer, Integer, Unit> getLambda-1$ej_ui() {
/*    */     return lambda-1;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Function3<RowScope, Composer, Integer, Unit> getLambda-2$ej_ui() {
/*    */     return lambda-2;
/*    */   }
/*    */   
/*    */   @NotNull
/* 28 */   private static Function3<RowScope, Composer, Integer, Unit> lambda-2 = (Function3<RowScope, Composer, Integer, Unit>)ComposableLambdaKt.composableLambdaInstance(535900653, false, ComposableSingletons$StopKt$lambda-2$1.INSTANCE); @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class ComposableSingletons$StopKt$lambda-2$1 implements Function3<RowScope, Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(RowScope $this$Button, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$Button, "$this$Button"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(535900653, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ComposableSingletons$StopKt.lambda-2.<anonymous> (Stop.kt:27)");  if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */        }
/*    */ 
/*    */     
/*    */     public static final ComposableSingletons$StopKt$lambda-2$1 INSTANCE = new ComposableSingletons$StopKt$lambda-2$1(); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\ComposableSingletons$StopKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */