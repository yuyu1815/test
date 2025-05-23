/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header;
/*    */ 
/*    */ import androidx.compose.foundation.layout.BoxScope;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function4;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.ui.component.IconButtonState;
/*    */ import org.jetbrains.jewel.ui.component.IconKt;
/*    */ import org.jetbrains.jewel.ui.icon.IconKey;
/*    */ import org.jetbrains.jewel.ui.icon.IntelliJIconKey;
/*    */ import org.jetbrains.jewel.ui.icons.AllIconsKeys;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ public final class ComposableSingletons$TaskHeaderKt
/*    */ {
/*    */   @NotNull
/* 45 */   public static final ComposableSingletons$TaskHeaderKt INSTANCE = new ComposableSingletons$TaskHeaderKt(); @NotNull public final Function4<BoxScope, IconButtonState, Composer, Integer, Unit> getLambda-1$ej_ui() { return lambda-1; } @NotNull private static Function4<BoxScope, IconButtonState, Composer, Integer, Unit> lambda-1 = (Function4<BoxScope, IconButtonState, Composer, Integer, Unit>)ComposableLambdaKt.composableLambdaInstance(-2135866621, false, ComposableSingletons$TaskHeaderKt$lambda-1$1.INSTANCE); @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class ComposableSingletons$TaskHeaderKt$lambda-1$1 implements Function4<BoxScope, IconButtonState, Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/* 46 */     public final void invoke-KMTpdl8(BoxScope $this$IconButton, long it, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$IconButton, "$this$IconButton"); if (($changed & 0x81) != 128 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-2135866621, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header.ComposableSingletons$TaskHeaderKt.lambda-1.<anonymous> (TaskHeader.kt:45)");  IconKt.Icon-FHprtrg((IconKey)AllIconsKeys.Actions.INSTANCE.getBack(), "Back", null, null, 0L, new org.jetbrains.jewel.ui.painter.PainterHint[0], $composer, 0x30 | IntelliJIconKey.$stable, 28); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */        }
/*    */ 
/*    */     
/*    */     public static final ComposableSingletons$TaskHeaderKt$lambda-1$1 INSTANCE = new ComposableSingletons$TaskHeaderKt$lambda-1$1(); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\header\ComposableSingletons$TaskHeaderKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */