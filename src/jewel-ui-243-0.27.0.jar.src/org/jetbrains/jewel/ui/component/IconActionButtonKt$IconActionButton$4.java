/*    */ package org.jetbrains.jewel.ui.component;
/*    */ 
/*    */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.graphics.ColorFilter;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import org.jetbrains.jewel.ui.component.styling.IconButtonStyle;
/*    */ import org.jetbrains.jewel.ui.icon.IconKey;
/*    */ import org.jetbrains.jewel.ui.painter.PainterHint;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */ final class IconActionButtonKt$IconActionButton$4
/*    */   implements Function2<Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(Composer $composer, int $changed) {
/* 83 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-710290579, $changed, -1, "org.jetbrains.jewel.ui.component.IconActionButton.<anonymous> (IconActionButton.kt:82)");  IconActionButtonKt.access$BaseIconActionButton(
/* 84 */           this.$key, 
/* 85 */           this.$contentDescription, 
/* 86 */           this.$iconClass, 
/* 87 */           this.$enabled, 
/* 88 */           this.$focusable, 
/* 89 */           this.$style, 
/* 90 */           this.$interactionSource, 
/* 91 */           this.$modifier, 
/* 92 */           this.$colorFilter, 
/* 93 */           this.$hint, 
/* 94 */           this.$onClick, $composer, 0, 0); if (ComposerKt.isTraceInProgress())
/* 95 */         ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   IconActionButtonKt$IconActionButton$4(IconKey $key, String $contentDescription, Class<?> $iconClass, boolean $enabled, boolean $focusable, IconButtonStyle $style, MutableInteractionSource $interactionSource, Modifier $modifier, ColorFilter $colorFilter, PainterHint $hint, Function0<Unit> $onClick) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\IconActionButtonKt$IconActionButton$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */