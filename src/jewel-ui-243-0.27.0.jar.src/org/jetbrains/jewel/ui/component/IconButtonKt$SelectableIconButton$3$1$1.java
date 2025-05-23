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
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */ final class null<T>
/*     */   implements FlowCollector
/*     */ {
/*     */   public final Object emit(Interaction interaction, Continuation $completion) {
/* 116 */     Interaction interaction1 = interaction;
/* 117 */     if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { IconButtonKt.access$SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.access$SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, false, true, false, false, 55, null)); }
/* 118 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || 
/* 119 */       interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { IconButtonKt.access$SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.access$SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, false, false, false, false, 55, null)); }
/*     */     
/* 121 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { IconButtonKt.access$SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.access$SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, false, false, true, false, 47, null)); }
/* 122 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { IconButtonKt.access$SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.access$SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, false, false, false, false, 47, null)); }
/* 123 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { IconButtonKt.access$SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.access$SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, this.$focusable, false, false, false, 59, null)); }
/* 124 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { IconButtonKt.access$SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.access$SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, false, false, false, false, 59, null)); }
/*     */     
/* 126 */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   null(boolean $focusable, MutableState<SelectableIconButtonState> $buttonState$delegate) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\IconButtonKt$SelectableIconButton$3$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */