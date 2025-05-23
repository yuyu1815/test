/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.interaction.Interaction;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.ui.input.InputMode;
/*     */ import androidx.compose.ui.input.InputModeManager;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 174 */     Interaction interaction1 = interaction;
/* 175 */     if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { LinkKt.access$LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.access$LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, false, false, true, false, false, 55, null)); }
/* 176 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || 
/* 177 */       interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { LinkKt.access$LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.access$LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, false, false, false, false, false, 55, null)); }
/*     */     
/* 179 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { LinkKt.access$LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.access$LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, false, false, false, true, false, 47, null)); }
/* 180 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { LinkKt.access$LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.access$LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, false, false, false, false, false, 47, null)); }
/* 181 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus)
/* 182 */     { if (InputMode.equals-impl0(this.$inputModeManager.getInputMode-aOaMEAU(), InputMode.Companion.getKeyboard-aOaMEAU())) {
/* 183 */         LinkKt.access$LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.access$LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, true, false, false, false, false, 61, null));
/*     */       
/*     */       } }
/*     */     
/* 187 */     else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { LinkKt.access$LinkImpl_5LixHlo$lambda$24(this.$linkState$delegate, LinkState.copy-oSacjZw$default(LinkKt.access$LinkImpl_5LixHlo$lambda$23(this.$linkState$delegate), false, false, false, false, false, false, 53, null)); }
/*     */     
/* 189 */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   null(InputModeManager $inputModeManager, MutableState<LinkState> $linkState$delegate) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\LinkKt$LinkImpl$2$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */