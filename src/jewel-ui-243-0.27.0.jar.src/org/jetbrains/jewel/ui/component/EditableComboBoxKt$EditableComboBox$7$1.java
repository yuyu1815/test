/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.interaction.Interaction;
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlinx.coroutines.CoroutineScope;
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
/*     */ @DebugMetadata(f = "EditableComboBox.kt", l = {120}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.EditableComboBoxKt$EditableComboBox$7$1")
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class EditableComboBoxKt$EditableComboBox$7$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   EditableComboBoxKt$EditableComboBox$7$1(MutableInteractionSource $interactionSource, MutableState<ComboBoxState> $comboBoxState$delegate, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/* 119 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 120 */         this.label = 1; if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$comboBoxState$delegate) {
/* 121 */               public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction;
/* 122 */                 if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { EditableComboBoxKt.access$EditableComboBox$lambda$24(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(EditableComboBoxKt.access$EditableComboBox$lambda$23(this.$comboBoxState$delegate), false, false, true, false, false, 27, null)); }
/* 123 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || 
/* 124 */                   interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { EditableComboBoxKt.access$EditableComboBox$lambda$24(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(EditableComboBoxKt.access$EditableComboBox$lambda$23(this.$comboBoxState$delegate), false, false, false, false, false, 27, null)); }
/* 125 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { EditableComboBoxKt.access$EditableComboBox$lambda$24(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(EditableComboBoxKt.access$EditableComboBox$lambda$23(this.$comboBoxState$delegate), false, false, false, true, false, 23, null)); }
/* 126 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { EditableComboBoxKt.access$EditableComboBox$lambda$24(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(EditableComboBoxKt.access$EditableComboBox$lambda$23(this.$comboBoxState$delegate), false, false, false, false, false, 23, null)); }
/*     */                 
/* 128 */                 return Unit.INSTANCE; } }(Continuation)this) == object) return object;  this.$interactionSource.getInteractions().collect(new FlowCollector(this.$comboBoxState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { EditableComboBoxKt.access$EditableComboBox$lambda$24(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(EditableComboBoxKt.access$EditableComboBox$lambda$23(this.$comboBoxState$delegate), false, false, true, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { EditableComboBoxKt.access$EditableComboBox$lambda$24(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(EditableComboBoxKt.access$EditableComboBox$lambda$23(this.$comboBoxState$delegate), false, false, false, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { EditableComboBoxKt.access$EditableComboBox$lambda$24(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(EditableComboBoxKt.access$EditableComboBox$lambda$23(this.$comboBoxState$delegate), false, false, false, true, false, 23, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { EditableComboBoxKt.access$EditableComboBox$lambda$24(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(EditableComboBoxKt.access$EditableComboBox$lambda$23(this.$comboBoxState$delegate), false, false, false, false, false, 23, null)); }  return Unit.INSTANCE; } }(Continuation)this);
/* 129 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super EditableComboBoxKt$EditableComboBox$7$1> $completion) {
/*     */     return (Continuation<Unit>)new EditableComboBoxKt$EditableComboBox$7$1(this.$interactionSource, this.$comboBoxState$delegate, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((EditableComboBoxKt$EditableComboBox$7$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\EditableComboBoxKt$EditableComboBox$7$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */