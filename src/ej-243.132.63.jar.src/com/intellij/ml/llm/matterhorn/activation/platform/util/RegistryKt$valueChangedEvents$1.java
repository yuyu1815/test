/*    */ package com.intellij.ml.llm.matterhorn.activation.platform.util;
/*    */ import com.intellij.openapi.util.registry.RegistryValue;
/*    */ import com.intellij.openapi.util.registry.RegistryValueListener;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.channels.ProduceKt;
/*    */ import kotlinx.coroutines.channels.ProducerScope;
/*    */ 
/*    */ @DebugMetadata(f = "registry.kt", l = {35}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.platform.util.RegistryKt$valueChangedEvents$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/intellij/openapi/util/registry/RegistryValue;"})
/*    */ final class RegistryKt$valueChangedEvents$1 extends SuspendLambda implements Function2<ProducerScope<? super RegistryValue>, Continuation<? super Unit>, Object> {
/*    */   int label;
/*    */   
/*    */   RegistryKt$valueChangedEvents$1(RegistryValue $receiver, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     ProducerScope<? super RegistryValue> $this$callbackFlow;
/* 28 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$callbackFlow = (ProducerScope)this.L$0;
/* 29 */         this.$this_valueChangedEvents.addListener(new RegistryValueListener($this$callbackFlow) {
/*    */               public void afterValueChanged(RegistryValue value) {
/* 31 */                 Intrinsics.checkNotNullParameter(value, "value"); this.$$this$callbackFlow.trySend-JP2dKIU(value);
/*    */               }
/* 33 */             }(CoroutineScope)$this$callbackFlow);
/*    */         
/* 35 */         this.label = 1; if (ProduceKt.awaitClose($this$callbackFlow, RegistryKt$valueChangedEvents$1::invokeSuspend$lambda$0, (Continuation)this) == object) return object;  ProduceKt.awaitClose($this$callbackFlow, RegistryKt$valueChangedEvents$1::invokeSuspend$lambda$0, (Continuation)this);
/* 36 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super RegistryKt$valueChangedEvents$1> $completion) {
/*    */     RegistryKt$valueChangedEvents$1 registryKt$valueChangedEvents$1 = new RegistryKt$valueChangedEvents$1(this.$this_valueChangedEvents, $completion);
/*    */     registryKt$valueChangedEvents$1.L$0 = value;
/*    */     return (Continuation<Unit>)registryKt$valueChangedEvents$1;
/*    */   }
/*    */   
/*    */   public final Object invoke(ProducerScope p1, Continuation<?> p2) {
/*    */     return ((RegistryKt$valueChangedEvents$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */   
/*    */   private static final Unit invokeSuspend$lambda$0() {
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\platfor\\util\RegistryKt$valueChangedEvents$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */