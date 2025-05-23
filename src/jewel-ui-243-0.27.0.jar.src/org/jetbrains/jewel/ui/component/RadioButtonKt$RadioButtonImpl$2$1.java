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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "RadioButton.kt", l = {149}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.RadioButtonKt$RadioButtonImpl$2$1")
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class RadioButtonKt$RadioButtonImpl$2$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   RadioButtonKt$RadioButtonImpl$2$1(MutableInteractionSource $interactionSource, boolean $swingCompatMode, MutableState<RadioButtonState> $radioButtonState$delegate, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/* 148 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 149 */         this.label = 1; if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$swingCompatMode, this.$radioButtonState$delegate) {
/* 150 */               public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction;
/* 151 */                 if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { RadioButtonKt.access$RadioButtonImpl$lambda$8(this.$radioButtonState$delegate, RadioButtonState.copy-fp8g3n8$default(RadioButtonKt.access$RadioButtonImpl$lambda$7(this.$radioButtonState$delegate), false, false, false, !this.$swingCompatMode, false, false, 55, null)); }
/*     */                 
/* 153 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || 
/* 154 */                   interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { RadioButtonKt.access$RadioButtonImpl$lambda$8(this.$radioButtonState$delegate, RadioButtonState.copy-fp8g3n8$default(RadioButtonKt.access$RadioButtonImpl$lambda$7(this.$radioButtonState$delegate), false, false, false, false, false, false, 55, null)); }
/*     */                 
/* 156 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { RadioButtonKt.access$RadioButtonImpl$lambda$8(this.$radioButtonState$delegate, RadioButtonState.copy-fp8g3n8$default(RadioButtonKt.access$RadioButtonImpl$lambda$7(this.$radioButtonState$delegate), false, false, false, false, !this.$swingCompatMode, false, 47, null)); }
/*     */                 
/* 158 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { RadioButtonKt.access$RadioButtonImpl$lambda$8(this.$radioButtonState$delegate, RadioButtonState.copy-fp8g3n8$default(RadioButtonKt.access$RadioButtonImpl$lambda$7(this.$radioButtonState$delegate), false, false, false, false, false, false, 47, null)); }
/* 159 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { RadioButtonKt.access$RadioButtonImpl$lambda$8(this.$radioButtonState$delegate, RadioButtonState.copy-fp8g3n8$default(RadioButtonKt.access$RadioButtonImpl$lambda$7(this.$radioButtonState$delegate), false, false, true, false, false, false, 59, null)); }
/* 160 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { RadioButtonKt.access$RadioButtonImpl$lambda$8(this.$radioButtonState$delegate, RadioButtonState.copy-fp8g3n8$default(RadioButtonKt.access$RadioButtonImpl$lambda$7(this.$radioButtonState$delegate), false, false, false, false, false, false, 59, null)); }
/*     */                 
/* 162 */                 return Unit.INSTANCE; } }(Continuation)this) == object) return object;  this.$interactionSource.getInteractions().collect(new FlowCollector(this.$swingCompatMode, this.$radioButtonState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { RadioButtonKt.access$RadioButtonImpl$lambda$8(this.$radioButtonState$delegate, RadioButtonState.copy-fp8g3n8$default(RadioButtonKt.access$RadioButtonImpl$lambda$7(this.$radioButtonState$delegate), false, false, false, !this.$swingCompatMode, false, false, 55, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { RadioButtonKt.access$RadioButtonImpl$lambda$8(this.$radioButtonState$delegate, RadioButtonState.copy-fp8g3n8$default(RadioButtonKt.access$RadioButtonImpl$lambda$7(this.$radioButtonState$delegate), false, false, false, false, false, false, 55, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { RadioButtonKt.access$RadioButtonImpl$lambda$8(this.$radioButtonState$delegate, RadioButtonState.copy-fp8g3n8$default(RadioButtonKt.access$RadioButtonImpl$lambda$7(this.$radioButtonState$delegate), false, false, false, false, !this.$swingCompatMode, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { RadioButtonKt.access$RadioButtonImpl$lambda$8(this.$radioButtonState$delegate, RadioButtonState.copy-fp8g3n8$default(RadioButtonKt.access$RadioButtonImpl$lambda$7(this.$radioButtonState$delegate), false, false, false, false, false, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { RadioButtonKt.access$RadioButtonImpl$lambda$8(this.$radioButtonState$delegate, RadioButtonState.copy-fp8g3n8$default(RadioButtonKt.access$RadioButtonImpl$lambda$7(this.$radioButtonState$delegate), false, false, true, false, false, false, 59, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { RadioButtonKt.access$RadioButtonImpl$lambda$8(this.$radioButtonState$delegate, RadioButtonState.copy-fp8g3n8$default(RadioButtonKt.access$RadioButtonImpl$lambda$7(this.$radioButtonState$delegate), false, false, false, false, false, false, 59, null)); }  return Unit.INSTANCE; } }(Continuation)this);
/* 163 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super RadioButtonKt$RadioButtonImpl$2$1> $completion) {
/*     */     return (Continuation<Unit>)new RadioButtonKt$RadioButtonImpl$2$1(this.$interactionSource, this.$swingCompatMode, this.$radioButtonState$delegate, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((RadioButtonKt$RadioButtonImpl$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\RadioButtonKt$RadioButtonImpl$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */