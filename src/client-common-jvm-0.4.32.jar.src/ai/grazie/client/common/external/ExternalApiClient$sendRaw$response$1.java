/*    */ package ai.grazie.client.common.external;
/*    */ 
/*    */ import ai.grazie.client.common.model.HTTPResponse;
/*    */ import ai.grazie.client.common.model.RequestOptions;
/*    */ import ai.grazie.model.cloud.ExternalAPI;
/*    */ import ai.grazie.model.cloud.HttpMethod;
/*    */ import ai.grazie.model.cloud.UnitTypedExternalApi;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
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
/*    */ @DebugMetadata(f = "ExternalApiClient.kt", l = {53, 55}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.common.external.ExternalApiClient$sendRaw$response$1")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\000\n\002\020\000\020\000\032\0020\001\"\b\b\000\020\002*\0020\003H@"}, d2 = {"<anonymous>", "Lai/grazie/client/common/model/HTTPResponse;", "Response", ""})
/*    */ final class ExternalApiClient$sendRaw$response$1
/*    */   extends SuspendLambda
/*    */   implements Function1<Continuation<? super HTTPResponse>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   ExternalApiClient$sendRaw$response$1(ExternalApiClient $receiver, RequestOptions $options, Continuation $completion) {
/*    */     super(1, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 51 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 52 */         if (this.$api.getHttpMethod() == HttpMethod.Get)
/* 53 */         { this.label = 1; if (ExternalApiClient.this.getHttpClient().get(ExternalApiClient.this.url((ExternalAPI)this.$api), this.$options, (Continuation)this) == object)
/*    */             return object;  }
/* 55 */         else { this.label = 2; if (ExternalApiClient.this.getHttpClient().send(ExternalApiClient.this.url((ExternalAPI)this.$api), this.$options, (Continuation)this) == object)
/*    */             return object;  }
/*    */       
/*    */       case 1:
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */       case 2:
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Continuation<? super ExternalApiClient$sendRaw$response$1> $completion) {
/*    */     return (Continuation<Unit>)new ExternalApiClient$sendRaw$response$1(ExternalApiClient.this, this.$options, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(Continuation<?> p1) {
/*    */     return ((ExternalApiClient$sendRaw$response$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\external\ExternalApiClient$sendRaw$response$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */