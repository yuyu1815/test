/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.activation;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.flow.Flow;
/*    */ import kotlinx.coroutines.flow.FlowKt;
/*    */ import kotlinx.coroutines.flow.MutableStateFlow;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "GrazieAuthFacade.kt", l = {33}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.activation.GrazieAuthFacade$_optimisticState$1$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class GrazieAuthFacade$_optimisticState$1$1
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   GrazieAuthFacade$_optimisticState$1$1(GrazieAuthFacade $receiver, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 32 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 33 */         this.label = 1; if (FlowKt.collectLatest((Flow)this.$it, new Function2<Boolean, Continuation<? super Unit>, Object>(null) { int label; public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { Function2<Boolean, Continuation<? super Unit>, Object> function2 = new Function2<>(GrazieAuthFacade.this, $completion); function2.Z$0 = ((Boolean)value).booleanValue(); return (Continuation)function2; } public final Object invoke(boolean p1, Continuation<?> p2) { return ((null)create(Boolean.valueOf(p1), p2)).invokeSuspend(Unit.INSTANCE); } public final Object invokeSuspend(Object $result) { boolean it; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = this.Z$0;
/* 34 */                     GrazieAuthFacadeKt.access$getLog$p().debug("Optimistic state changed to: " + (it ? 1 : 0));
/* 35 */                     ((GrazieAuthFacadeState)GrazieAuthFacade.this.getState()).setLoginSuccessful$ej_ui(it);
/* 36 */                     return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } }(Continuation)this) == object) return object;  FlowKt.collectLatest((Flow)this.$it, new Function2<Boolean, Continuation<? super Unit>, Object>(null) { int label; public final Object invokeSuspend(Object $result) { boolean it; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = this.Z$0; GrazieAuthFacadeKt.access$getLog$p().debug("Optimistic state changed to: " + (it ? 1 : 0)); ((GrazieAuthFacadeState)GrazieAuthFacade.this.getState()).setLoginSuccessful$ej_ui(it); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { Function2<Boolean, Continuation<? super Unit>, Object> function2 = new Function2<>(GrazieAuthFacade.this, $completion); function2.Z$0 = ((Boolean)value).booleanValue(); return (Continuation)function2; }
/* 37 */               public final Object invoke(boolean p1, Continuation<?> p2) { return ((null)create(Boolean.valueOf(p1), p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super GrazieAuthFacade$_optimisticState$1$1> $completion) {
/*    */     return (Continuation<Unit>)new GrazieAuthFacade$_optimisticState$1$1(GrazieAuthFacade.this, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((GrazieAuthFacade$_optimisticState$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\activation\GrazieAuthFacade$_optimisticState$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */