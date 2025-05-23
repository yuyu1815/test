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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "Checkbox.kt", l = {277}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.CheckboxKt$CheckboxImpl$2$1")
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class CheckboxKt$CheckboxImpl$2$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   CheckboxKt$CheckboxImpl$2$1(MutableInteractionSource $interactionSource, boolean $swingCompatMode, MutableState<CheckboxState> $checkboxState$delegate, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/* 276 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 277 */         this.label = 1; if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$swingCompatMode, this.$checkboxState$delegate) {
/* 278 */               public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction;
/* 279 */                 if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { CheckboxKt.access$CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.access$CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, false, !this.$swingCompatMode, false, false, 55, null)); }
/* 280 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || 
/* 281 */                   interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { CheckboxKt.access$CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.access$CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, false, false, false, false, 55, null)); }
/*     */                 
/* 283 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { CheckboxKt.access$CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.access$CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, false, false, !this.$swingCompatMode, false, 47, null)); }
/* 284 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { CheckboxKt.access$CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.access$CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, false, false, false, false, 47, null)); }
/* 285 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { CheckboxKt.access$CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.access$CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, true, false, false, false, 59, null)); }
/* 286 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { CheckboxKt.access$CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.access$CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, false, false, false, false, 59, null)); }
/*     */                 
/* 288 */                 return Unit.INSTANCE; } }(Continuation)this) == object) return object;  this.$interactionSource.getInteractions().collect(new FlowCollector(this.$swingCompatMode, this.$checkboxState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { CheckboxKt.access$CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.access$CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, false, !this.$swingCompatMode, false, false, 55, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { CheckboxKt.access$CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.access$CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, false, false, false, false, 55, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { CheckboxKt.access$CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.access$CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, false, false, !this.$swingCompatMode, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { CheckboxKt.access$CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.access$CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, false, false, false, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { CheckboxKt.access$CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.access$CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, true, false, false, false, 59, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { CheckboxKt.access$CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.access$CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, false, false, false, false, 59, null)); }  return Unit.INSTANCE; } }(Continuation)this);
/* 289 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super CheckboxKt$CheckboxImpl$2$1> $completion) {
/*     */     return (Continuation<Unit>)new CheckboxKt$CheckboxImpl$2$1(this.$interactionSource, this.$swingCompatMode, this.$checkboxState$delegate, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((CheckboxKt$CheckboxImpl$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\CheckboxKt$CheckboxImpl$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */