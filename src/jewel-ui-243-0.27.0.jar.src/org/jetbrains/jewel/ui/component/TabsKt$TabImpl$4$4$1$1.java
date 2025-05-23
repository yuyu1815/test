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
/*     */ @DebugMetadata(f = "Tabs.kt", l = {187}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.TabsKt$TabImpl$4$4$1$1")
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class TabsKt$TabImpl$4$4$1$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   TabsKt$TabImpl$4$4$1$1(MutableInteractionSource $closeActionInteractionSource, MutableState<ButtonState> $closeButtonState$delegate, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/* 186 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 187 */         this.label = 1; if (this.$closeActionInteractionSource.getInteractions().collect(new FlowCollector(this.$closeButtonState$delegate) {
/* 188 */               public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction;
/* 189 */                 if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { TabsKt.access$TabImpl$lambda$14(this.$closeButtonState$delegate, ButtonState.copy-oDpth28$default(TabsKt.access$TabImpl$lambda$13(this.$closeButtonState$delegate), false, false, true, false, false, 27, null)); }
/* 190 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || 
/* 191 */                   interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release)
/* 192 */                 { TabsKt.access$TabImpl$lambda$14(this.$closeButtonState$delegate, ButtonState.copy-oDpth28$default(TabsKt.access$TabImpl$lambda$13(this.$closeButtonState$delegate), false, false, false, false, false, 27, null));
/*     */                    }
/*     */                 
/* 195 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { TabsKt.access$TabImpl$lambda$14(this.$closeButtonState$delegate, ButtonState.copy-oDpth28$default(TabsKt.access$TabImpl$lambda$13(this.$closeButtonState$delegate), false, false, false, true, false, 23, null)); }
/*     */                 
/* 197 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { TabsKt.access$TabImpl$lambda$14(this.$closeButtonState$delegate, ButtonState.copy-oDpth28$default(TabsKt.access$TabImpl$lambda$13(this.$closeButtonState$delegate), false, false, false, false, false, 23, null)); }
/*     */                 
/* 199 */                 return Unit.INSTANCE; } }(Continuation)this) == object) return object;  this.$closeActionInteractionSource.getInteractions().collect(new FlowCollector(this.$closeButtonState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { TabsKt.access$TabImpl$lambda$14(this.$closeButtonState$delegate, ButtonState.copy-oDpth28$default(TabsKt.access$TabImpl$lambda$13(this.$closeButtonState$delegate), false, false, true, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { TabsKt.access$TabImpl$lambda$14(this.$closeButtonState$delegate, ButtonState.copy-oDpth28$default(TabsKt.access$TabImpl$lambda$13(this.$closeButtonState$delegate), false, false, false, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { TabsKt.access$TabImpl$lambda$14(this.$closeButtonState$delegate, ButtonState.copy-oDpth28$default(TabsKt.access$TabImpl$lambda$13(this.$closeButtonState$delegate), false, false, false, true, false, 23, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { TabsKt.access$TabImpl$lambda$14(this.$closeButtonState$delegate, ButtonState.copy-oDpth28$default(TabsKt.access$TabImpl$lambda$13(this.$closeButtonState$delegate), false, false, false, false, false, 23, null)); }  return Unit.INSTANCE; } }(Continuation)this);
/* 200 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super TabsKt$TabImpl$4$4$1$1> $completion) {
/*     */     return (Continuation<Unit>)new TabsKt$TabImpl$4$4$1$1(this.$closeActionInteractionSource, this.$closeButtonState$delegate, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((TabsKt$TabImpl$4$4$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\TabsKt$TabImpl$4$4$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */