/*    */ package com.intellij.ml.llm.matterhorn.activation.data.impl.grazie;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ExecutionContextElement;
/*    */ import com.intellij.ml.llm.matterhorn.ExecutionContextKey;
/*    */ import io.ktor.client.plugins.api.OnResponseContext;
/*    */ import io.ktor.client.statement.HttpResponse;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "GrazieHttpClientUtil.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.data.impl.grazie.GrazieHttpClientUtil$TraceHeaders$1$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/api/OnResponseContext;", "response", "Lio/ktor/client/statement/HttpResponse;"})
/*    */ final class GrazieHttpClientUtil$TraceHeaders$1$2
/*    */   extends SuspendLambda
/*    */   implements Function3<OnResponseContext, HttpResponse, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   GrazieHttpClientUtil$TraceHeaders$1$2(Continuation $completion) {
/*    */     super(3, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     HttpResponse response;
/*    */     ExecutionContextElement context;
/* 41 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); response = (HttpResponse)this.L$0;
/* 42 */         context = (ExecutionContextElement)getContext().get((CoroutineContext.Key)ExecutionContextKey.INSTANCE);
/* 43 */         response.getHeaders().forEach(context::invokeSuspend$lambda$0);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 51 */         return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Object invoke(OnResponseContext p1, HttpResponse p2, Continuation<? super GrazieHttpClientUtil$TraceHeaders$1$2> p3) {
/*    */     GrazieHttpClientUtil$TraceHeaders$1$2 grazieHttpClientUtil$TraceHeaders$1$2 = new GrazieHttpClientUtil$TraceHeaders$1$2(p3);
/*    */     grazieHttpClientUtil$TraceHeaders$1$2.L$0 = p2;
/*    */     return grazieHttpClientUtil$TraceHeaders$1$2.invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */   
/*    */   private static final Unit invokeSuspend$lambda$0(ExecutionContextElement $context, String header, List values) {
/*    */     if (GrazieHttpClientUtil.access$getAllowedHeaders$p().contains(header))
/*    */       GrazieHttpClientUtilKt.getLog().info("<<< Response Header: " + header + ": " + CollectionsKt.joinToString$default(values, null, null, null, 0, null, null, 63, null)); 
/*    */     if (Intrinsics.areEqual(header, "grazie-trace-id"))
/*    */       if ($context != null && $context.getTraceIds() != null) {
/*    */         $context.getTraceIds().addAll(values);
/*    */       } else {
/*    */         $context.getTraceIds();
/*    */       }  
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\impl\grazie\GrazieHttpClientUtil$TraceHeaders$1$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */