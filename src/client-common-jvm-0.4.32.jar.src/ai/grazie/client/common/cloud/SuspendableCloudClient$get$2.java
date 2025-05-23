/*     */ package ai.grazie.client.common.cloud;
/*     */ 
/*     */ import ai.grazie.client.common.model.HTTPResponse;
/*     */ import ai.grazie.client.common.model.RequestOptions;
/*     */ import ai.grazie.model.cloud.API;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
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
/*     */ @DebugMetadata(f = "SuspendableCloudClient.kt", l = {108}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.common.cloud.SuspendableCloudClient$get$2")
/*     */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "Lai/grazie/client/common/model/HTTPResponse;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;"})
/*     */ final class SuspendableCloudClient$get$2
/*     */   extends SuspendLambda
/*     */   implements Function2<SuspendableCloudClient, Continuation<? super HTTPResponse>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   SuspendableCloudClient$get$2(API $api, RequestOptions $options, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     SuspendableCloudClient $this$withAnnotationsLog;
/* 107 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$withAnnotationsLog = (SuspendableCloudClient)this.L$0;
/* 108 */         this.label = 1; if ($this$withAnnotationsLog.getHttpClient().get($this$withAnnotationsLog.url(this.$api), SuspendableCloudClientKt.withTimeout(this.$options, this.$api), (Continuation)this) == object) return object;  return $this$withAnnotationsLog.getHttpClient().get($this$withAnnotationsLog.url(this.$api), SuspendableCloudClientKt.withTimeout(this.$options, this.$api), (Continuation)this);
/*     */       case 1:
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         return SYNTHETIC_LOCAL_VARIABLE_1; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super SuspendableCloudClient$get$2> $completion) {
/*     */     SuspendableCloudClient$get$2 suspendableCloudClient$get$2 = new SuspendableCloudClient$get$2(this.$api, this.$options, $completion);
/*     */     suspendableCloudClient$get$2.L$0 = value;
/*     */     return (Continuation<Unit>)suspendableCloudClient$get$2;
/*     */   }
/*     */   
/*     */   public final Object invoke(SuspendableCloudClient p1, Continuation<?> p2) {
/*     */     return ((SuspendableCloudClient$get$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\cloud\SuspendableCloudClient$get$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */