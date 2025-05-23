/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.interaction.Interaction;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */ final class null<T>
/*     */   implements FlowCollector
/*     */ {
/*     */   public final Object emit(Interaction interaction, Continuation $completion) {
/* 174 */     Interaction interaction1 = interaction;
/* 175 */     if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { IconButtonKt.access$ToggleableIconButton$lambda$31(this.$buttonState$delegate, ToggleableIconButtonState.copy-CAf7mdk$default(IconButtonKt.access$ToggleableIconButton$lambda$30(this.$buttonState$delegate), false, null, false, true, false, false, 55, null)); }
/* 176 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || 
/* 177 */       interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { IconButtonKt.access$ToggleableIconButton$lambda$31(this.$buttonState$delegate, ToggleableIconButtonState.copy-CAf7mdk$default(IconButtonKt.access$ToggleableIconButton$lambda$30(this.$buttonState$delegate), false, null, false, false, false, false, 55, null)); }
/*     */     
/* 179 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { IconButtonKt.access$ToggleableIconButton$lambda$31(this.$buttonState$delegate, ToggleableIconButtonState.copy-CAf7mdk$default(IconButtonKt.access$ToggleableIconButton$lambda$30(this.$buttonState$delegate), false, null, false, false, true, false, 47, null)); }
/* 180 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { IconButtonKt.access$ToggleableIconButton$lambda$31(this.$buttonState$delegate, ToggleableIconButtonState.copy-CAf7mdk$default(IconButtonKt.access$ToggleableIconButton$lambda$30(this.$buttonState$delegate), false, null, false, false, false, false, 47, null)); }
/* 181 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { IconButtonKt.access$ToggleableIconButton$lambda$31(this.$buttonState$delegate, ToggleableIconButtonState.copy-CAf7mdk$default(IconButtonKt.access$ToggleableIconButton$lambda$30(this.$buttonState$delegate), false, null, this.$focusable, false, false, false, 59, null)); }
/* 182 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { IconButtonKt.access$ToggleableIconButton$lambda$31(this.$buttonState$delegate, ToggleableIconButtonState.copy-CAf7mdk$default(IconButtonKt.access$ToggleableIconButton$lambda$30(this.$buttonState$delegate), false, null, false, false, false, false, 59, null)); }
/*     */     
/* 184 */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   null(boolean $focusable, MutableState<ToggleableIconButtonState> $buttonState$delegate) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\IconButtonKt$ToggleableIconButton$3$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */