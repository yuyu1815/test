/*    */ package com.intellij.ml.llm.matterhorn.activation.platform.util;
/*    */ 
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
/*    */ @DebugMetadata(f = "service.kt", l = {27}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.platform.util.ServiceKt$dynamicPluginServiceFlow$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0010\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;"})
/*    */ final class ServiceKt$dynamicPluginServiceFlow$2
/*    */   extends SuspendLambda
/*    */   implements Function2<FlowCollector<? super Unit>, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   ServiceKt$dynamicPluginServiceFlow$2(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     FlowCollector $this$onStart;
/* 27 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$onStart = (FlowCollector)this.L$0; this.label = 1; if ($this$onStart.emit(Unit.INSTANCE, (Continuation)this) == object) return object;  $this$onStart.emit(Unit.INSTANCE, (Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super ServiceKt$dynamicPluginServiceFlow$2> $completion) {
/*    */     ServiceKt$dynamicPluginServiceFlow$2 serviceKt$dynamicPluginServiceFlow$2 = new ServiceKt$dynamicPluginServiceFlow$2($completion);
/*    */     serviceKt$dynamicPluginServiceFlow$2.L$0 = value;
/*    */     return (Continuation<Unit>)serviceKt$dynamicPluginServiceFlow$2;
/*    */   }
/*    */   
/*    */   public final Object invoke(FlowCollector p1, Continuation<?> p2) {
/*    */     return ((ServiceKt$dynamicPluginServiceFlow$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\platfor\\util\ServiceKt$dynamicPluginServiceFlow$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */