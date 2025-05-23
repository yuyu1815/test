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
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */ final class null<T>
/*    */   implements FlowCollector
/*    */ {
/*    */   public final Object emit(Interaction interaction, Continuation $completion) {
/* 62 */     Interaction interaction1 = interaction;
/* 63 */     if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { IconButtonKt.access$IconButton$lambda$3(this.$buttonState$delegate, IconButtonState.copy-3OtLUoY$default(IconButtonKt.access$IconButton$lambda$2(this.$buttonState$delegate), false, false, true, false, false, 27, null)); }
/* 64 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || 
/* 65 */       interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { IconButtonKt.access$IconButton$lambda$3(this.$buttonState$delegate, IconButtonState.copy-3OtLUoY$default(IconButtonKt.access$IconButton$lambda$2(this.$buttonState$delegate), false, false, false, false, false, 27, null)); }
/*    */     
/* 67 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { IconButtonKt.access$IconButton$lambda$3(this.$buttonState$delegate, IconButtonState.copy-3OtLUoY$default(IconButtonKt.access$IconButton$lambda$2(this.$buttonState$delegate), false, false, false, true, false, 23, null)); }
/* 68 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { IconButtonKt.access$IconButton$lambda$3(this.$buttonState$delegate, IconButtonState.copy-3OtLUoY$default(IconButtonKt.access$IconButton$lambda$2(this.$buttonState$delegate), false, false, false, false, false, 23, null)); }
/* 69 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { IconButtonKt.access$IconButton$lambda$3(this.$buttonState$delegate, IconButtonState.copy-3OtLUoY$default(IconButtonKt.access$IconButton$lambda$2(this.$buttonState$delegate), false, this.$focusable, false, false, false, 29, null)); }
/* 70 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { IconButtonKt.access$IconButton$lambda$3(this.$buttonState$delegate, IconButtonState.copy-3OtLUoY$default(IconButtonKt.access$IconButton$lambda$2(this.$buttonState$delegate), false, false, false, false, false, 29, null)); }
/*    */     
/* 72 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   null(boolean $focusable, MutableState<IconButtonState> $buttonState$delegate) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\IconButtonKt$IconButton$3$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */