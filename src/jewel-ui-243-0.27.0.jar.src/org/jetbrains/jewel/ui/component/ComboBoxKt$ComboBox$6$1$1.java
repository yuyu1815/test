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
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */ final class null<T>
/*     */   implements FlowCollector
/*     */ {
/*     */   public final Object emit(Interaction interaction, Continuation $completion) {
/*  93 */     Interaction interaction1 = interaction;
/*  94 */     if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { ComboBoxKt.access$ComboBox_xYaah8o$lambda$15(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(ComboBoxKt.access$ComboBox_xYaah8o$lambda$14(this.$comboBoxState$delegate), false, false, true, false, false, 27, null)); }
/*  95 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || 
/*  96 */       interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { ComboBoxKt.access$ComboBox_xYaah8o$lambda$15(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(ComboBoxKt.access$ComboBox_xYaah8o$lambda$14(this.$comboBoxState$delegate), false, false, false, false, false, 27, null)); }
/*  97 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { ComboBoxKt.access$ComboBox_xYaah8o$lambda$15(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(ComboBoxKt.access$ComboBox_xYaah8o$lambda$14(this.$comboBoxState$delegate), false, false, false, true, false, 23, null)); }
/*  98 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { ComboBoxKt.access$ComboBox_xYaah8o$lambda$15(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(ComboBoxKt.access$ComboBox_xYaah8o$lambda$14(this.$comboBoxState$delegate), false, false, false, false, false, 23, null)); }
/*     */     
/* 100 */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   null(MutableState<ComboBoxState> $comboBoxState$delegate) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ComboBoxKt$ComboBox$6$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */