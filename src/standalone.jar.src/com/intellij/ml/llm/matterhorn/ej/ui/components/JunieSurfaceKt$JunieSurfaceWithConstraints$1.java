/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*    */ 
/*    */ import androidx.compose.foundation.layout.BoxWithConstraintsScope;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ final class JunieSurfaceKt$JunieSurfaceWithConstraints$1
/*    */   implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(BoxWithConstraintsScope $this$BoxWithConstraints, Composer $composer, int $changed) {
/* 32 */     Intrinsics.checkNotNullParameter($this$BoxWithConstraints, "$this$BoxWithConstraints"); int $dirty = $changed; if (($changed & 0x6) == 0) $dirty |= $composer.changed($this$BoxWithConstraints) ? 4 : 2;  if (($dirty & 0x13) != 18 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1910066741, $dirty, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.JunieSurfaceWithConstraints.<anonymous> (JunieSurface.kt:31)");  JunieSurfaceKt.access$JunieDotsPattern-ek8zF_U(this.$dotsColor, $composer, 0);
/* 33 */       this.$content.invoke($this$BoxWithConstraints, $composer, Integer.valueOf(0xE & $dirty)); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   JunieSurfaceKt$JunieSurfaceWithConstraints$1(long $dotsColor, Function3<BoxWithConstraintsScope, Composer, Integer, Unit> $content) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\JunieSurfaceKt$JunieSurfaceWithConstraints$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */