/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*    */ 
/*    */ import androidx.compose.animation.AnimatedVisibilityScope;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
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
/*    */ final class ChatResponseTextContainerKt$ChatResponseTextContainer$1$2
/*    */   implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(AnimatedVisibilityScope $this$AnimatedVisibility, Composer $composer, int $changed) {
/* 54 */     Intrinsics.checkNotNullParameter($this$AnimatedVisibility, "$this$AnimatedVisibility"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1909378117, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.ChatResponseTextContainer.<anonymous>.<anonymous> (ChatResponseTextContainer.kt:53)");  LinkKt.Link-kye4rC8(
/* 55 */         this.$actionText, 
/* 56 */         this.$onActionClicked, null, false, null, 0, null, null, $composer, 0, 252);
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */   }
/*    */   
/*    */   ChatResponseTextContainerKt$ChatResponseTextContainer$1$2(String $actionText, Function0<Unit> $onActionClicked) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\ChatResponseTextContainerKt$ChatResponseTextContainer$1$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */