/*    */ package ai.grazie.api.gateway.client.api.gec;
/*    */ 
/*    */ import ai.grazie.api.gateway.api.gec.GecAPI;
/*    */ import ai.grazie.client.common.cloud.SuspendableCloudClient;
/*    */ import ai.grazie.client.common.cloud.SuspendableCloudClientKt;
/*    */ import ai.grazie.client.common.model.HTTPResponse;
/*    */ import ai.grazie.client.common.model.RequestOptions;
/*    */ import ai.grazie.model.cloud.API;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.serialization.SerializationStrategy;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\000\n\002\020\000\n\002\030\002\n\000\020\000\032\0020\001\"\n\b\000\020\002\030\001*\0020\003*\0020\004H@¨\006\005"}, d2 = {"<anonymous>", "Lai/grazie/client/common/model/HTTPResponse;", "I", "", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "ai/grazie/client/common/cloud/SuspendableCloudClient$sendAndGet$4"})
/*    */ @DebugMetadata(f = "SuspendableCloudClient.kt", l = {67}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.common.cloud.SuspendableCloudClient$sendAndGet$4")
/*    */ public final class GecAPIClient$problems$$inlined$sendAndGet$default$1
/*    */   extends SuspendLambda
/*    */   implements Function2<SuspendableCloudClient, Continuation<? super HTTPResponse>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   public GecAPIClient$problems$$inlined$sendAndGet$default$1(API $api, JSON $json, Object $content, RequestOptions $options, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     SuspendableCloudClient $this$withAnnotationsLog;
/* 67 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$withAnnotationsLog = (SuspendableCloudClient)this.L$0; this.label = 1; if ($this$withAnnotationsLog.getHttpClient().send($this$withAnnotationsLog.url(this.$api), this.$json.bytes((SerializationStrategy)GecAPI.Correct.V2.Request.Companion.serializer(), this.$content), SuspendableCloudClientKt.withTimeout(this.$options, this.$api), (Continuation)this) == object) { Object object1 = object; $this$withAnnotationsLog.getHttpClient().send($this$withAnnotationsLog.url(this.$api), this.$json.bytes((SerializationStrategy)GecAPI.Correct.V2.Request.Companion.serializer(), this.$content), SuspendableCloudClientKt.withTimeout(this.$options, this.$api), (Continuation)this); return object1; }  return $this$withAnnotationsLog.getHttpClient().send($this$withAnnotationsLog.url(this.$api), this.$json.bytes((SerializationStrategy)GecAPI.Correct.V2.Request.Companion.serializer(), this.$content), SuspendableCloudClientKt.withTimeout(this.$options, this.$api), (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation $completion) {
/*    */     GecAPIClient$problems$$inlined$sendAndGet$default$1 gecAPIClient$problems$$inlined$sendAndGet$default$1 = new GecAPIClient$problems$$inlined$sendAndGet$default$1(this.$api, this.$json, this.$content, this.$options, $completion);
/*    */     gecAPIClient$problems$$inlined$sendAndGet$default$1.L$0 = value;
/*    */     return (Continuation<Unit>)gecAPIClient$problems$$inlined$sendAndGet$default$1;
/*    */   }
/*    */   
/*    */   public final Object invoke(SuspendableCloudClient p1, Continuation<?> p2) {
/*    */     return ((GecAPIClient$problems$$inlined$sendAndGet$default$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\gec\GecAPIClient$problems$$inlined$sendAndGet$default$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */