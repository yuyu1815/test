/*    */ package com.intellij.ml.llm.matterhorn.activation.platform.util;
/*    */ 
/*    */ import com.intellij.openapi.util.registry.RegistryValue;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
/*    */ 
/*    */ @DebugMetadata(f = "registry.kt", l = {23}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.platform.util.RegistryKt$valueFlow$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/intellij/openapi/util/registry/RegistryValue;"})
/*    */ final class RegistryKt$valueFlow$1
/*    */   extends SuspendLambda
/*    */   implements Function2<FlowCollector<? super RegistryValue>, Continuation<? super Unit>, Object> {
/*    */   int label;
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     FlowCollector $this$onStart;
/* 23 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$onStart = (FlowCollector)this.L$0; this.label = 1; if ($this$onStart.emit(this.$this_valueFlow, (Continuation)this) == object) return object;  $this$onStart.emit(this.$this_valueFlow, (Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   RegistryKt$valueFlow$1(RegistryValue $receiver, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super RegistryKt$valueFlow$1> $completion) {
/*    */     RegistryKt$valueFlow$1 registryKt$valueFlow$1 = new RegistryKt$valueFlow$1(this.$this_valueFlow, $completion);
/*    */     registryKt$valueFlow$1.L$0 = value;
/*    */     return (Continuation<Unit>)registryKt$valueFlow$1;
/*    */   }
/*    */   
/*    */   public final Object invoke(FlowCollector p1, Continuation<?> p2) {
/*    */     return ((RegistryKt$valueFlow$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\platfor\\util\RegistryKt$valueFlow$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */