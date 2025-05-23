/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*    */ import androidx.compose.foundation.layout.BoxScope;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.ui.component.IconKt;
/*    */ import org.jetbrains.jewel.ui.icon.IconKey;
/*    */ import org.jetbrains.jewel.ui.icon.PathIconKey;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ public final class ComposableSingletons$InfoKt {
/*    */   @NotNull
/* 21 */   public static final ComposableSingletons$InfoKt INSTANCE = new ComposableSingletons$InfoKt(); @NotNull public final Function3<BoxScope, Composer, Integer, Unit> getLambda-1$ej_ui() { return lambda-1; } @NotNull private static Function3<BoxScope, Composer, Integer, Unit> lambda-1 = (Function3<BoxScope, Composer, Integer, Unit>)ComposableLambdaKt.composableLambdaInstance(108214704, false, ComposableSingletons$InfoKt$lambda-1$1.INSTANCE); @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class ComposableSingletons$InfoKt$lambda-1$1 implements Function3<BoxScope, Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(BoxScope $this$StepCard, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(108214704, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ComposableSingletons$InfoKt.lambda-1.<anonymous> (Info.kt:20)");  IconKt.Icon-FHprtrg((IconKey)MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getInfoIcon(), "info", null, null, 0L, new org.jetbrains.jewel.ui.painter.PainterHint[0], $composer, 0x30 | PathIconKey.$stable, 28); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */        }
/*    */ 
/*    */     
/*    */     public static final ComposableSingletons$InfoKt$lambda-1$1 INSTANCE = new ComposableSingletons$InfoKt$lambda-1$1(); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\ComposableSingletons$InfoKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */