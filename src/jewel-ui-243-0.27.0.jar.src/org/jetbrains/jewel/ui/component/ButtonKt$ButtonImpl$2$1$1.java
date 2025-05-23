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
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */ final class null<T>
/*     */   implements FlowCollector
/*     */ {
/*     */   public final Object emit(Interaction interaction, Continuation $completion) {
/* 103 */     Interaction interaction1 = interaction;
/* 104 */     if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { ButtonKt.access$ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.access$ButtonImpl$lambda$5(this.$buttonState$delegate), false, false, true, false, false, 27, null)); }
/* 105 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || 
/* 106 */       interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { ButtonKt.access$ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.access$ButtonImpl$lambda$5(this.$buttonState$delegate), false, false, false, false, false, 27, null)); }
/*     */     
/* 108 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { ButtonKt.access$ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.access$ButtonImpl$lambda$5(this.$buttonState$delegate), false, false, false, true, false, 23, null)); }
/* 109 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { ButtonKt.access$ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.access$ButtonImpl$lambda$5(this.$buttonState$delegate), false, false, false, false, false, 23, null)); }
/* 110 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { ButtonKt.access$ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.access$ButtonImpl$lambda$5(this.$buttonState$delegate), false, true, false, false, false, 29, null)); }
/* 111 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { ButtonKt.access$ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.access$ButtonImpl$lambda$5(this.$buttonState$delegate), false, false, false, false, false, 29, null)); }
/*     */     
/* 113 */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   null(MutableState<ButtonState> $buttonState$delegate) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ButtonKt$ButtonImpl$2$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */