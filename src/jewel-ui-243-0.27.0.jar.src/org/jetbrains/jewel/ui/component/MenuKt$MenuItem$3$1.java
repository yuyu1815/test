/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.interaction.Interaction;
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.ui.focus.FocusRequester;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "Menu.kt", l = {351}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.MenuKt$MenuItem$3$1")
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class MenuKt$MenuItem$3$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   MenuKt$MenuItem$3$1(MutableInteractionSource $interactionSource, FocusRequester $focusRequester, MutableState<MenuItemState> $itemState$delegate, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/* 350 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 351 */         this.label = 1; if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$focusRequester, this.$itemState$delegate) {
/* 352 */               public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction;
/* 353 */                 if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { MenuKt.access$MenuItem$lambda$38(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.access$MenuItem$lambda$37(this.$itemState$delegate), false, false, false, false, true, false, 47, null)); }
/* 354 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || 
/* 355 */                   interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { MenuKt.access$MenuItem$lambda$38(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.access$MenuItem$lambda$37(this.$itemState$delegate), false, false, false, false, false, false, 47, null)); }
/*     */                 
/* 357 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter)
/* 358 */                 { MenuKt.access$MenuItem$lambda$38(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.access$MenuItem$lambda$37(this.$itemState$delegate), false, false, false, true, false, false, 55, null));
/* 359 */                   this.$focusRequester.requestFocus();
/*     */                    }
/*     */                 
/* 362 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { MenuKt.access$MenuItem$lambda$38(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.access$MenuItem$lambda$37(this.$itemState$delegate), false, false, false, false, false, false, 55, null)); }
/* 363 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { MenuKt.access$MenuItem$lambda$38(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.access$MenuItem$lambda$37(this.$itemState$delegate), false, false, true, false, false, false, 59, null)); }
/* 364 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { MenuKt.access$MenuItem$lambda$38(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.access$MenuItem$lambda$37(this.$itemState$delegate), false, false, false, false, false, false, 59, null)); }
/*     */                 
/* 366 */                 return Unit.INSTANCE; } }(Continuation)this) == object) return object;  this.$interactionSource.getInteractions().collect(new FlowCollector(this.$focusRequester, this.$itemState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { MenuKt.access$MenuItem$lambda$38(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.access$MenuItem$lambda$37(this.$itemState$delegate), false, false, false, false, true, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { MenuKt.access$MenuItem$lambda$38(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.access$MenuItem$lambda$37(this.$itemState$delegate), false, false, false, false, false, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { MenuKt.access$MenuItem$lambda$38(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.access$MenuItem$lambda$37(this.$itemState$delegate), false, false, false, true, false, false, 55, null)); this.$focusRequester.requestFocus(); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { MenuKt.access$MenuItem$lambda$38(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.access$MenuItem$lambda$37(this.$itemState$delegate), false, false, false, false, false, false, 55, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { MenuKt.access$MenuItem$lambda$38(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.access$MenuItem$lambda$37(this.$itemState$delegate), false, false, true, false, false, false, 59, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { MenuKt.access$MenuItem$lambda$38(this.$itemState$delegate, MenuItemState.copy-moUeATs$default(MenuKt.access$MenuItem$lambda$37(this.$itemState$delegate), false, false, false, false, false, false, 59, null)); }  return Unit.INSTANCE; } }(Continuation)this);
/* 367 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super MenuKt$MenuItem$3$1> $completion) {
/*     */     return (Continuation<Unit>)new MenuKt$MenuItem$3$1(this.$interactionSource, this.$focusRequester, this.$itemState$delegate, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((MenuKt$MenuItem$3$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\MenuKt$MenuItem$3$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */