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
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */ final class null<T>
/*    */   implements FlowCollector
/*    */ {
/*    */   public final Object emit(Interaction interaction, Continuation $completion) {
/* 72 */     Interaction interaction1 = interaction;
/* 73 */     if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { InputFieldKt.access$InputField$lambda$2(this.$inputFieldState$delegate, InputFieldState.copy-raUdB0Y$default(InputFieldKt.access$InputField$lambda$1(this.$inputFieldState$delegate), false, true, false, false, false, 29, null)); }
/* 74 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { InputFieldKt.access$InputField$lambda$2(this.$inputFieldState$delegate, InputFieldState.copy-raUdB0Y$default(InputFieldKt.access$InputField$lambda$1(this.$inputFieldState$delegate), false, false, false, false, false, 29, null)); }
/*    */     
/* 76 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   null(MutableState<InputFieldState> $inputFieldState$delegate) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\InputFieldKt$InputField$2$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */