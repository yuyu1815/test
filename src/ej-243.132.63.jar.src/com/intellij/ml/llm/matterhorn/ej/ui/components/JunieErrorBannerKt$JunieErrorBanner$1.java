/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*    */ 
/*    */ import androidx.compose.foundation.layout.RowScope;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header.Action;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.jewel.ui.component.LinkKt;
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
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ final class JunieErrorBannerKt$JunieErrorBanner$1
/*    */   implements Function3<RowScope, Composer, Integer, Unit>
/*    */ {
/*    */   JunieErrorBannerKt$JunieErrorBanner$1(Action $action) {}
/*    */   
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(RowScope $this$JunieBanner, Composer $composer, int $changed) {
/* 47 */     Intrinsics.checkNotNullParameter($this$JunieBanner, "$this$JunieBanner"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(2064981895, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.JunieErrorBanner.<anonymous> (JunieErrorBanner.kt:46)");  LinkKt.Link-kye4rC8(this.$action.getName(), this.$action.getAction(), null, false, null, 0, null, null, $composer, 0, 252); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\JunieErrorBannerKt$JunieErrorBanner$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */