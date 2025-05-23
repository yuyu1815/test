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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 278 */     Interaction interaction1 = interaction;
/* 279 */     if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { CheckboxKt.access$CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.access$CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, false, !this.$swingCompatMode, false, false, 55, null)); }
/* 280 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || 
/* 281 */       interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { CheckboxKt.access$CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.access$CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, false, false, false, false, 55, null)); }
/*     */     
/* 283 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { CheckboxKt.access$CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.access$CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, false, false, !this.$swingCompatMode, false, 47, null)); }
/* 284 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { CheckboxKt.access$CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.access$CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, false, false, false, false, 47, null)); }
/* 285 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { CheckboxKt.access$CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.access$CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, true, false, false, false, 59, null)); }
/* 286 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { CheckboxKt.access$CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.access$CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, false, false, false, false, 59, null)); }
/*     */     
/* 288 */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   null(boolean $swingCompatMode, MutableState<CheckboxState> $checkboxState$delegate) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\CheckboxKt$CheckboxImpl$2$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */