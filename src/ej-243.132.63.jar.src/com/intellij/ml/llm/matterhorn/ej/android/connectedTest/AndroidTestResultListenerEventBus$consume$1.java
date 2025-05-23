/*    */ package com.intellij.ml.llm.matterhorn.ej.android.connectedTest;
/*    */ 
/*    */ import kotlin.KotlinNothingValueException;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "AndroidTestResultListenerEvent.kt", l = {39}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.android.connectedTest.AndroidTestResultListenerEventBus$consume$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class AndroidTestResultListenerEventBus$consume$1
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   AndroidTestResultListenerEventBus$consume$1(Function1<AndroidTestResultListenerEvent, Unit> $onEvent, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 39 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (AndroidTestResultListenerEventBus.access$getEvents$p(AndroidTestResultListenerEventBus.this).collect(new FlowCollector(this.$onEvent) { public final Object emit(AndroidTestResultListenerEvent it, Continuation $completion) { this.$onEvent.invoke(it); return Unit.INSTANCE; } }, (Continuation)this) == object) return object;  AndroidTestResultListenerEventBus.access$getEvents$p(AndroidTestResultListenerEventBus.this).collect(new FlowCollector(this.$onEvent) { public final Object emit(AndroidTestResultListenerEvent it, Continuation $completion) { this.$onEvent.invoke(it); return Unit.INSTANCE; } }, (Continuation)this); throw new KotlinNothingValueException();case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); throw new KotlinNothingValueException(); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super AndroidTestResultListenerEventBus$consume$1> $completion) {
/*    */     return (Continuation<Unit>)new AndroidTestResultListenerEventBus$consume$1(this.$onEvent, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((AndroidTestResultListenerEventBus$consume$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\android\connectedTest\AndroidTestResultListenerEventBus$consume$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */