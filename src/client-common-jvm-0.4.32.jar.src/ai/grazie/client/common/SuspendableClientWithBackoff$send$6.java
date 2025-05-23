/*    */ package ai.grazie.client.common;
/*    */ 
/*    */ import ai.grazie.client.common.model.HTTPResponse;
/*    */ import ai.grazie.client.common.model.Multipart;
/*    */ import ai.grazie.client.common.model.RequestOptions;
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
/*    */ @DebugMetadata(f = "SuspendableClientWithBackoff.kt", l = {38}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.common.SuspendableClientWithBackoff$send$6")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "Lai/grazie/client/common/model/HTTPResponse;", "Lai/grazie/client/common/SuspendableHTTPClient;"})
/*    */ final class SuspendableClientWithBackoff$send$6
/*    */   extends SuspendLambda
/*    */   implements Function2<SuspendableHTTPClient, Continuation<? super HTTPResponse>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   SuspendableClientWithBackoff$send$6(String $url, Multipart $content, RequestOptions $options, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 37 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 38 */         this.label = 1; if (SuspendableClientWithBackoff.access$getHttpClient$p(SuspendableClientWithBackoff.this).send(this.$url, this.$content, this.$options, (Continuation<? super HTTPResponse>)this) == object) return object;  return SuspendableClientWithBackoff.access$getHttpClient$p(SuspendableClientWithBackoff.this).send(this.$url, this.$content, this.$options, (Continuation<? super HTTPResponse>)this);
/*    */       case 1:
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         return SYNTHETIC_LOCAL_VARIABLE_1; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super SuspendableClientWithBackoff$send$6> $completion) {
/*    */     return (Continuation<Unit>)new SuspendableClientWithBackoff$send$6(this.$url, this.$content, this.$options, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(SuspendableHTTPClient p1, Continuation<?> p2) {
/*    */     return ((SuspendableClientWithBackoff$send$6)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\SuspendableClientWithBackoff$send$6.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */