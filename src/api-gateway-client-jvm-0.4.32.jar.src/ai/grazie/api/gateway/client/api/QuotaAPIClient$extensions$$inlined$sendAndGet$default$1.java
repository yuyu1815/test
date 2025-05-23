/*    */ package ai.grazie.api.gateway.client.api;
/*    */ 
/*    */ import ai.grazie.client.common.cloud.SuspendableCloudClient;
/*    */ import ai.grazie.client.common.cloud.SuspendableCloudClientKt;
/*    */ import ai.grazie.client.common.model.HTTPResponse;
/*    */ import ai.grazie.client.common.model.RequestOptions;
/*    */ import ai.grazie.model.cloud.API;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H@¨\006\003"}, d2 = {"<anonymous>", "Lai/grazie/client/common/model/HTTPResponse;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "ai/grazie/client/common/cloud/SuspendableCloudClient$sendAndGet$6"})
/*    */ @DebugMetadata(f = "SuspendableCloudClient.kt", l = {73}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.common.cloud.SuspendableCloudClient$sendAndGet$6")
/*    */ public final class QuotaAPIClient$extensions$$inlined$sendAndGet$default$1
/*    */   extends SuspendLambda
/*    */   implements Function2<SuspendableCloudClient, Continuation<? super HTTPResponse>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   public QuotaAPIClient$extensions$$inlined$sendAndGet$default$1(API $api, RequestOptions $options, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     SuspendableCloudClient $this$withAnnotationsLog;
/* 72 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$withAnnotationsLog = (SuspendableCloudClient)this.L$0;
/* 73 */         this.label = 1; if ($this$withAnnotationsLog.getHttpClient().send($this$withAnnotationsLog.url(this.$api), SuspendableCloudClientKt.withTimeout(this.$options, this.$api), (Continuation)this) == object) { Object object1 = object; $this$withAnnotationsLog.getHttpClient().send($this$withAnnotationsLog.url(this.$api), SuspendableCloudClientKt.withTimeout(this.$options, this.$api), (Continuation)this); return object1; }  return $this$withAnnotationsLog.getHttpClient().send($this$withAnnotationsLog.url(this.$api), SuspendableCloudClientKt.withTimeout(this.$options, this.$api), (Continuation)this);
/*    */       case 1:
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         return SYNTHETIC_LOCAL_VARIABLE_1; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation $completion) {
/*    */     QuotaAPIClient$extensions$$inlined$sendAndGet$default$1 quotaAPIClient$extensions$$inlined$sendAndGet$default$1 = new QuotaAPIClient$extensions$$inlined$sendAndGet$default$1(this.$api, this.$options, $completion);
/*    */     quotaAPIClient$extensions$$inlined$sendAndGet$default$1.L$0 = value;
/*    */     return (Continuation<Unit>)quotaAPIClient$extensions$$inlined$sendAndGet$default$1;
/*    */   }
/*    */   
/*    */   public final Object invoke(SuspendableCloudClient p1, Continuation<?> p2) {
/*    */     return ((QuotaAPIClient$extensions$$inlined$sendAndGet$default$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\QuotaAPIClient$extensions$$inlined$sendAndGet$default$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */