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
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */ final class null<T>
/*     */   implements FlowCollector
/*     */ {
/*     */   public final Object emit(Interaction interaction, Continuation $completion) {
/* 144 */     Interaction interaction1 = interaction;
/* 145 */     if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { ChipKt.access$ChipImpl$lambda$10(this.$chipState$delegate, ChipState.copy-JT_Lw10$default(ChipKt.access$ChipImpl$lambda$9(this.$chipState$delegate), false, false, false, true, false, false, 55, null)); }
/* 146 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || 
/* 147 */       interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { ChipKt.access$ChipImpl$lambda$10(this.$chipState$delegate, ChipState.copy-JT_Lw10$default(ChipKt.access$ChipImpl$lambda$9(this.$chipState$delegate), false, false, false, false, false, false, 55, null)); }
/* 148 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { ChipKt.access$ChipImpl$lambda$10(this.$chipState$delegate, ChipState.copy-JT_Lw10$default(ChipKt.access$ChipImpl$lambda$9(this.$chipState$delegate), false, false, false, false, true, false, 47, null)); }
/* 149 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { ChipKt.access$ChipImpl$lambda$10(this.$chipState$delegate, ChipState.copy-JT_Lw10$default(ChipKt.access$ChipImpl$lambda$9(this.$chipState$delegate), false, false, false, false, false, false, 47, null)); }
/* 150 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { ChipKt.access$ChipImpl$lambda$10(this.$chipState$delegate, ChipState.copy-JT_Lw10$default(ChipKt.access$ChipImpl$lambda$9(this.$chipState$delegate), false, true, false, false, false, false, 61, null)); }
/* 151 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { ChipKt.access$ChipImpl$lambda$10(this.$chipState$delegate, ChipState.copy-JT_Lw10$default(ChipKt.access$ChipImpl$lambda$9(this.$chipState$delegate), false, false, false, false, false, false, 61, null)); }
/*     */     
/* 153 */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   null(MutableState<ChipState> $chipState$delegate) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ChipKt$ChipImpl$2$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */