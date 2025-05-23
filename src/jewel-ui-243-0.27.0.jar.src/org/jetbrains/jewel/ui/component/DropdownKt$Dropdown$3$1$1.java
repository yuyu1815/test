/*    */ package org.jetbrains.jewel.ui.component;
/*    */ 
/*    */ import androidx.compose.foundation.interaction.Interaction;
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */ final class null<T>
/*    */   implements FlowCollector
/*    */ {
/*    */   public final Object emit(Interaction interaction, Continuation $completion) {
/* 76 */     Interaction interaction1 = interaction;
/* 77 */     if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { DropdownKt.access$Dropdown$lambda$9(this.$dropdownState$delegate, DropdownState.copy-17HSnUM$default(DropdownKt.access$Dropdown$lambda$8(this.$dropdownState$delegate), false, false, true, false, false, 27, null)); }
/* 78 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || 
/* 79 */       interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { DropdownKt.access$Dropdown$lambda$9(this.$dropdownState$delegate, DropdownState.copy-17HSnUM$default(DropdownKt.access$Dropdown$lambda$8(this.$dropdownState$delegate), false, false, false, false, false, 27, null)); }
/* 80 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { DropdownKt.access$Dropdown$lambda$9(this.$dropdownState$delegate, DropdownState.copy-17HSnUM$default(DropdownKt.access$Dropdown$lambda$8(this.$dropdownState$delegate), false, false, false, true, false, 23, null)); }
/* 81 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { DropdownKt.access$Dropdown$lambda$9(this.$dropdownState$delegate, DropdownState.copy-17HSnUM$default(DropdownKt.access$Dropdown$lambda$8(this.$dropdownState$delegate), false, false, false, false, false, 23, null)); }
/* 82 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { DropdownKt.access$Dropdown$lambda$9(this.$dropdownState$delegate, DropdownState.copy-17HSnUM$default(DropdownKt.access$Dropdown$lambda$8(this.$dropdownState$delegate), false, true, false, false, false, 29, null)); }
/* 83 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { DropdownKt.access$Dropdown$lambda$9(this.$dropdownState$delegate, DropdownState.copy-17HSnUM$default(DropdownKt.access$Dropdown$lambda$8(this.$dropdownState$delegate), false, false, false, false, false, 29, null)); }
/*    */     
/* 85 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   null(MutableState<DropdownState> $dropdownState$delegate) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\DropdownKt$Dropdown$3$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */