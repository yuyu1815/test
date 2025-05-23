/*    */ package com.intellij.ml.llm.matterhorn.core.llm.openai;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.llm.AIAnswer;
/*    */ import io.ktor.client.statement.HttpResponse;
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
/*    */ @DebugMetadata(f = "OpenAIChatRequest.kt", l = {60}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.openai.OpenAIChatRequest$send$2$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "it", "Lio/ktor/client/statement/HttpResponse;"})
/*    */ final class OpenAIChatRequest$send$2$1
/*    */   extends SuspendLambda
/*    */   implements Function2<HttpResponse, Continuation<? super AIAnswer>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   OpenAIChatRequest$send$2$1(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     HttpResponse it;
/* 59 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (HttpResponse)this.L$0;
/* 60 */         this.label = 1; if (OpenAIChatRequest.access$handleBatchResponse(OpenAIChatRequest.this, it, OpenAIChatRequest.access$getStopReasons$p(OpenAIChatRequest.this), (Continuation)this) == object) return object;  return OpenAIChatRequest.access$handleBatchResponse(OpenAIChatRequest.this, it, OpenAIChatRequest.access$getStopReasons$p(OpenAIChatRequest.this), (Continuation)this);
/*    */       case 1:
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         return SYNTHETIC_LOCAL_VARIABLE_1; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super OpenAIChatRequest$send$2$1> $completion) {
/*    */     OpenAIChatRequest$send$2$1 openAIChatRequest$send$2$1 = new OpenAIChatRequest$send$2$1($completion);
/*    */     openAIChatRequest$send$2$1.L$0 = value;
/*    */     return (Continuation<Unit>)openAIChatRequest$send$2$1;
/*    */   }
/*    */   
/*    */   public final Object invoke(HttpResponse p1, Continuation<?> p2) {
/*    */     return ((OpenAIChatRequest$send$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\openai\OpenAIChatRequest$send$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */