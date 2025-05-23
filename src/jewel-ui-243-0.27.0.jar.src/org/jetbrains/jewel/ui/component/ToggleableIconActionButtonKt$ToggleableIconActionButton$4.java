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
/*    */ import kotlin.jvm.functions.Function1;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */ final class ToggleableIconActionButtonKt$ToggleableIconActionButton$4
/*    */   implements Function2<Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(Composer $composer, int $changed) {
/* 72 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-452187346, $changed, -1, "org.jetbrains.jewel.ui.component.ToggleableIconActionButton.<anonymous> (ToggleableIconActionButton.kt:71)");  ToggleableIconActionButtonKt.access$BaseToggleableIconActionButton(
/* 73 */           this.$key, 
/*    */           
/* 75 */           this.$contentDescription, 
/* 76 */           this.$iconClass, 
/* 77 */           this.$value, 
/* 78 */           this.$enabled, 
/* 79 */           this.$focusable, 
/* 80 */           this.$style, 
/* 81 */           this.$interactionSource, this.$modifier, 
/* 82 */           this.$colorFilter, 
/* 83 */           this.$extraHint, 
/* 84 */           this.$onValueChange, $composer, 0, 0); if (ComposerKt.isTraceInProgress())
/* 85 */         ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   ToggleableIconActionButtonKt$ToggleableIconActionButton$4(IconKey $key, String $contentDescription, Class<?> $iconClass, boolean $value, boolean $enabled, boolean $focusable, IconButtonStyle $style, MutableInteractionSource $interactionSource, Modifier $modifier, ColorFilter $colorFilter, PainterHint $extraHint, Function1<Boolean, Unit> $onValueChange) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ToggleableIconActionButtonKt$ToggleableIconActionButton$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */