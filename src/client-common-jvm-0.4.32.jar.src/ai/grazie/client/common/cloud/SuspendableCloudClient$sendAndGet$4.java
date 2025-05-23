/*    */ package ai.grazie.client.common.cloud;
/*    */ 
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
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.MagicApiIntrinsics;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.SerializersKt;
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
/*    */ @DebugMetadata(f = "SuspendableCloudClient.kt", l = {67}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.common.cloud.SuspendableCloudClient$sendAndGet$4")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 176, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\020\000\n\002\030\002\020\000\032\0020\001\"\n\b\000\020\002\030\001*\0020\003*\0020\004H@"}, d2 = {"<anonymous>", "Lai/grazie/client/common/model/HTTPResponse;", "I", "", "Lai/grazie/client/common/cloud/SuspendableCloudClient;"})
/*    */ public final class SuspendableCloudClient$sendAndGet$4
/*    */   extends SuspendLambda
/*    */   implements Function2<SuspendableCloudClient, Continuation<? super HTTPResponse>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   public SuspendableCloudClient$sendAndGet$4(API $api, JSON $json, Object $content, RequestOptions $options, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     SuspendableCloudClient $this$withAnnotationsLog;
/* 67 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$withAnnotationsLog = (SuspendableCloudClient)this.L$0; Intrinsics.reifiedOperationMarker(6, "I"); MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple"); this.label = 1; return ($this$withAnnotationsLog.getHttpClient().send($this$withAnnotationsLog.url(this.$api), this.$json.bytes((SerializationStrategy)SerializersKt.serializer(null), this.$content), SuspendableCloudClientKt.withTimeout(this.$options, this.$api), (Continuation)this) == object) ? object : $this$withAnnotationsLog.getHttpClient().send($this$withAnnotationsLog.url(this.$api), this.$json.bytes((SerializationStrategy)SerializersKt.serializer(null), this.$content), SuspendableCloudClientKt.withTimeout(this.$options, this.$api), (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super SuspendableCloudClient$sendAndGet$4> $completion) {
/*    */     SuspendableCloudClient$sendAndGet$4 suspendableCloudClient$sendAndGet$4 = new SuspendableCloudClient$sendAndGet$4(this.$api, this.$json, this.$content, this.$options, $completion);
/*    */     suspendableCloudClient$sendAndGet$4.L$0 = value;
/*    */     return (Continuation<Unit>)suspendableCloudClient$sendAndGet$4;
/*    */   }
/*    */   
/*    */   public final Object invoke(SuspendableCloudClient p1, Continuation<?> p2) {
/*    */     return ((SuspendableCloudClient$sendAndGet$4)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\cloud\SuspendableCloudClient$sendAndGet$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */