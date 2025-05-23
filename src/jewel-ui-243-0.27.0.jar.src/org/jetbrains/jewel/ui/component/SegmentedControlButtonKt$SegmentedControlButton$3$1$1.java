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
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */ final class null<T>
/*    */   implements FlowCollector
/*    */ {
/*    */   public final Object emit(Interaction interaction, Continuation $completion) {
/* 71 */     Interaction interaction1 = interaction;
/* 72 */     if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { SegmentedControlButtonKt.access$SegmentedControlButton$lambda$3(this.$buttonState$delegate, SegmentedControlButtonState.copy-Um8v6X4$default(SegmentedControlButtonKt.access$SegmentedControlButton$lambda$2(this.$buttonState$delegate), false, false, true, false, false, 27, null)); }
/* 73 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || 
/* 74 */       interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { SegmentedControlButtonKt.access$SegmentedControlButton$lambda$3(this.$buttonState$delegate, SegmentedControlButtonState.copy-Um8v6X4$default(SegmentedControlButtonKt.access$SegmentedControlButton$lambda$2(this.$buttonState$delegate), false, false, false, false, false, 27, null)); }
/*    */     
/* 76 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { SegmentedControlButtonKt.access$SegmentedControlButton$lambda$3(this.$buttonState$delegate, SegmentedControlButtonState.copy-Um8v6X4$default(SegmentedControlButtonKt.access$SegmentedControlButton$lambda$2(this.$buttonState$delegate), false, false, false, true, false, 23, null)); }
/* 77 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { SegmentedControlButtonKt.access$SegmentedControlButton$lambda$3(this.$buttonState$delegate, SegmentedControlButtonState.copy-Um8v6X4$default(SegmentedControlButtonKt.access$SegmentedControlButton$lambda$2(this.$buttonState$delegate), false, false, false, false, false, 23, null)); }
/*    */     
/* 79 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   null(MutableState<SegmentedControlButtonState> $buttonState$delegate) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\SegmentedControlButtonKt$SegmentedControlButton$3$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */