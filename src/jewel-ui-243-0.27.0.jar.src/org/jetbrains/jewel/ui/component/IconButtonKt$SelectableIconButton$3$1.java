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
/*     */ @DebugMetadata(f = "IconButton.kt", l = {115}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.IconButtonKt$SelectableIconButton$3$1")
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class IconButtonKt$SelectableIconButton$3$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   IconButtonKt$SelectableIconButton$3$1(MutableInteractionSource $interactionSource, boolean $focusable, MutableState<SelectableIconButtonState> $buttonState$delegate, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/* 114 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 115 */         this.label = 1; if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$focusable, this.$buttonState$delegate) {
/* 116 */               public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction;
/* 117 */                 if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { IconButtonKt.access$SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.access$SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, false, true, false, false, 55, null)); }
/* 118 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || 
/* 119 */                   interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { IconButtonKt.access$SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.access$SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, false, false, false, false, 55, null)); }
/*     */                 
/* 121 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { IconButtonKt.access$SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.access$SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, false, false, true, false, 47, null)); }
/* 122 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { IconButtonKt.access$SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.access$SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, false, false, false, false, 47, null)); }
/* 123 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { IconButtonKt.access$SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.access$SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, this.$focusable, false, false, false, 59, null)); }
/* 124 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { IconButtonKt.access$SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.access$SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, false, false, false, false, 59, null)); }
/*     */                 
/* 126 */                 return Unit.INSTANCE; } }(Continuation)this) == object) return object;  this.$interactionSource.getInteractions().collect(new FlowCollector(this.$focusable, this.$buttonState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { IconButtonKt.access$SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.access$SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, false, true, false, false, 55, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { IconButtonKt.access$SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.access$SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, false, false, false, false, 55, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { IconButtonKt.access$SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.access$SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, false, false, true, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { IconButtonKt.access$SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.access$SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, false, false, false, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { IconButtonKt.access$SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.access$SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, this.$focusable, false, false, false, 59, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { IconButtonKt.access$SelectableIconButton$lambda$16(this.$buttonState$delegate, SelectableIconButtonState.copy-z9lnavA$default(IconButtonKt.access$SelectableIconButton$lambda$15(this.$buttonState$delegate), false, false, false, false, false, false, 59, null)); }  return Unit.INSTANCE; } }(Continuation)this);
/* 127 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super IconButtonKt$SelectableIconButton$3$1> $completion) {
/*     */     return (Continuation<Unit>)new IconButtonKt$SelectableIconButton$3$1(this.$interactionSource, this.$focusable, this.$buttonState$delegate, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((IconButtonKt$SelectableIconButton$3$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\IconButtonKt$SelectableIconButton$3$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */