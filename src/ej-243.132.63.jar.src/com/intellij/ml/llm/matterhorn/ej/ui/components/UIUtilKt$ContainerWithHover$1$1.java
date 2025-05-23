/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
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
/*     */ @DebugMetadata(f = "UIUtil.kt", l = {127}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.components.UIUtilKt$ContainerWithHover$1$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class UIUtilKt$ContainerWithHover$1$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   UIUtilKt$ContainerWithHover$1$1(MutableInteractionSource $interactionSource, MutableState<Boolean> $hovered$delegate, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/* 126 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 127 */         this.label = 1; if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$hovered$delegate) {
/* 128 */               public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction;
/* 129 */                 if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { UIUtilKt.access$ContainerWithHover$lambda$11(this.$hovered$delegate, true); }
/* 130 */                 else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { UIUtilKt.access$ContainerWithHover$lambda$11(this.$hovered$delegate, false); }
/*     */                 
/* 132 */                 return Unit.INSTANCE; } }(Continuation)this) == object) return object;  this.$interactionSource.getInteractions().collect(new FlowCollector(this.$hovered$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { UIUtilKt.access$ContainerWithHover$lambda$11(this.$hovered$delegate, true); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { UIUtilKt.access$ContainerWithHover$lambda$11(this.$hovered$delegate, false); }  return Unit.INSTANCE; } }(Continuation)this);
/* 133 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super UIUtilKt$ContainerWithHover$1$1> $completion) {
/*     */     return (Continuation<Unit>)new UIUtilKt$ContainerWithHover$1$1(this.$interactionSource, this.$hovered$delegate, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((UIUtilKt$ContainerWithHover$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\UIUtilKt$ContainerWithHover$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */