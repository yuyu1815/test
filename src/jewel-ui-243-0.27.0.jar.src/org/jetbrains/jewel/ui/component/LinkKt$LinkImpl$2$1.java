/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.interaction.Interaction;
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.ui.input.InputMode;
/*     */ import androidx.compose.ui.input.InputModeManager;
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
/*     */ @DebugMetadata(f = "Link.kt", l = {173}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.LinkKt$LinkImpl$2$1")
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class LinkKt$LinkImpl$2$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   LinkKt$LinkImpl$2$1(MutableInteractionSource $interactionSource, InputModeManager $inputModeManager, MutableState<LinkState> $linkState$delegate, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/* 172 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 173 */         this.label = 1; if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$inputModeManager, this.$linkState$delegate) {
/* 174 */               public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction;
/* 175 */                 if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { LinkKt.access$LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.access$LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, false, false, true, false, false, 55, null)); }
/* 176 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || 
/* 177 */                   interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { LinkKt.access$LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.access$LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, false, false, false, false, false, 55, null)); }
/*     */                 
/* 179 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { LinkKt.access$LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.access$LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, false, false, false, true, false, 47, null)); }
/* 180 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { LinkKt.access$LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.access$LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, false, false, false, false, false, 47, null)); }
/* 181 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus)
/* 182 */                 { if (InputMode.equals-impl0(this.$inputModeManager.getInputMode-aOaMEAU(), InputMode.Companion.getKeyboard-aOaMEAU())) {
/* 183 */                     LinkKt.access$LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.access$LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, true, false, false, false, false, 61, null));
/*     */                   
/*     */                   } }
/*     */                 
/* 187 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { LinkKt.access$LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.access$LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, false, false, false, false, false, 53, null)); }
/*     */                 
/* 189 */                 return Unit.INSTANCE; } }(Continuation)this) == object) return object;  this.$interactionSource.getInteractions().collect(new FlowCollector(this.$inputModeManager, this.$linkState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { LinkKt.access$LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.access$LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, false, false, true, false, false, 55, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { LinkKt.access$LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.access$LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, false, false, false, false, false, 55, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { LinkKt.access$LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.access$LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, false, false, false, true, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { LinkKt.access$LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.access$LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, false, false, false, false, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { if (InputMode.equals-impl0(this.$inputModeManager.getInputMode-aOaMEAU(), InputMode.Companion.getKeyboard-aOaMEAU())) LinkKt.access$LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.access$LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, true, false, false, false, false, 61, null));  } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { LinkKt.access$LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.access$LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, false, false, false, false, false, 53, null)); }  return Unit.INSTANCE; } }(Continuation)this);
/* 190 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super LinkKt$LinkImpl$2$1> $completion) {
/*     */     return (Continuation<Unit>)new LinkKt$LinkImpl$2$1(this.$interactionSource, this.$inputModeManager, this.$linkState$delegate, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((LinkKt$LinkImpl$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\LinkKt$LinkImpl$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */