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
/*     */ @DebugMetadata(f = "Button.kt", l = {102}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.ButtonKt$ButtonImpl$2$1")
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class ButtonKt$ButtonImpl$2$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   ButtonKt$ButtonImpl$2$1(MutableInteractionSource $interactionSource, MutableState<ButtonState> $buttonState$delegate, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/* 101 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 102 */         this.label = 1; if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$buttonState$delegate) {
/* 103 */               public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction;
/* 104 */                 if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { ButtonKt.access$ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.access$ButtonImpl$lambda$5(this.$buttonState$delegate), false, false, true, false, false, 27, null)); }
/* 105 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || 
/* 106 */                   interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { ButtonKt.access$ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.access$ButtonImpl$lambda$5(this.$buttonState$delegate), false, false, false, false, false, 27, null)); }
/*     */                 
/* 108 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { ButtonKt.access$ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.access$ButtonImpl$lambda$5(this.$buttonState$delegate), false, false, false, true, false, 23, null)); }
/* 109 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { ButtonKt.access$ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.access$ButtonImpl$lambda$5(this.$buttonState$delegate), false, false, false, false, false, 23, null)); }
/* 110 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { ButtonKt.access$ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.access$ButtonImpl$lambda$5(this.$buttonState$delegate), false, true, false, false, false, 29, null)); }
/* 111 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { ButtonKt.access$ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.access$ButtonImpl$lambda$5(this.$buttonState$delegate), false, false, false, false, false, 29, null)); }
/*     */                 
/* 113 */                 return Unit.INSTANCE; } }(Continuation)this) == object) return object;  this.$interactionSource.getInteractions().collect(new FlowCollector(this.$buttonState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { ButtonKt.access$ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.access$ButtonImpl$lambda$5(this.$buttonState$delegate), false, false, true, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { ButtonKt.access$ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.access$ButtonImpl$lambda$5(this.$buttonState$delegate), false, false, false, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { ButtonKt.access$ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.access$ButtonImpl$lambda$5(this.$buttonState$delegate), false, false, false, true, false, 23, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { ButtonKt.access$ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.access$ButtonImpl$lambda$5(this.$buttonState$delegate), false, false, false, false, false, 23, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { ButtonKt.access$ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.access$ButtonImpl$lambda$5(this.$buttonState$delegate), false, true, false, false, false, 29, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { ButtonKt.access$ButtonImpl$lambda$6(this.$buttonState$delegate, ButtonState.copy-oDpth28$default(ButtonKt.access$ButtonImpl$lambda$5(this.$buttonState$delegate), false, false, false, false, false, 29, null)); }  return Unit.INSTANCE; } }(Continuation)this);
/* 114 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super ButtonKt$ButtonImpl$2$1> $completion) {
/*     */     return (Continuation<Unit>)new ButtonKt$ButtonImpl$2$1(this.$interactionSource, this.$buttonState$delegate, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((ButtonKt$ButtonImpl$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ButtonKt$ButtonImpl$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */