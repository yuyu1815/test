/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.State;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.DelayKt;
/*     */ import org.jetbrains.jewel.ui.component.styling.ScrollbarVisibility;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "Scrollbar.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.ScrollbarKt$BaseScrollbar$2$1")
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class ScrollbarKt$BaseScrollbar$2$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   ScrollbarKt$BaseScrollbar$2$1(boolean $isActive, MutableState<Boolean> $showScrollbar$delegate, State<Boolean> $isHovered$delegate, ScrollbarVisibility $visibilityStyle, MutableState<Boolean> $isExpanded$delegate, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     CoroutineScope $this$LaunchedEffect;
/*     */     boolean isVisibleAndHovered;
/* 159 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$LaunchedEffect = (CoroutineScope)this.L$0;
/* 160 */         isVisibleAndHovered = (ScrollbarKt.access$BaseScrollbar$lambda$14(this.$showScrollbar$delegate) && ScrollbarKt.access$BaseScrollbar$lambda$12(this.$isHovered$delegate));
/* 161 */         if (this.$isActive || isVisibleAndHovered) {
/* 162 */           ScrollbarKt.access$BaseScrollbar$lambda$15(this.$showScrollbar$delegate, true);
/*     */         } else {
/* 164 */           BuildersKt.launch$default($this$LaunchedEffect, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$visibilityStyle, this.$showScrollbar$delegate, this.$isExpanded$delegate, null) { int label; public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$visibilityStyle, this.$showScrollbar$delegate, this.$isExpanded$delegate, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 165 */                       this.label = 1; if (DelayKt.delay-VtjQ1oo(this.$visibilityStyle.getLingerDuration-UwyO8pc(), (Continuation)this) == object) return object;  DelayKt.delay-VtjQ1oo(this.$visibilityStyle.getLingerDuration-UwyO8pc(), (Continuation)this);
/* 166 */                       ScrollbarKt.access$BaseScrollbar$lambda$15(this.$showScrollbar$delegate, false);
/* 167 */                       ScrollbarKt.access$BaseScrollbar$lambda$11(this.$isExpanded$delegate, false);
/* 168 */                       return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); ScrollbarKt.access$BaseScrollbar$lambda$15(this.$showScrollbar$delegate, false); ScrollbarKt.access$BaseScrollbar$lambda$11(this.$isExpanded$delegate, false); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }3, null);
/* 170 */         }  return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super ScrollbarKt$BaseScrollbar$2$1> $completion) {
/*     */     ScrollbarKt$BaseScrollbar$2$1 scrollbarKt$BaseScrollbar$2$1 = new ScrollbarKt$BaseScrollbar$2$1(this.$isActive, this.$showScrollbar$delegate, this.$isHovered$delegate, this.$visibilityStyle, this.$isExpanded$delegate, $completion);
/*     */     scrollbarKt$BaseScrollbar$2$1.L$0 = value;
/*     */     return (Continuation<Unit>)scrollbarKt$BaseScrollbar$2$1;
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((ScrollbarKt$BaseScrollbar$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ScrollbarKt$BaseScrollbar$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */