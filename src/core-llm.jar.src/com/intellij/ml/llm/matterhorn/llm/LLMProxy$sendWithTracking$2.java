/*    */ package com.intellij.ml.llm.matterhorn.llm;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
/*    */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*    */ import java.util.UUID;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.functions.Function4;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "AISender.kt", l = {89}, i = {0}, s = {"L$0"}, n = {"uuid"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.llm.LLMProxy$sendWithTracking$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\000\n\002\020\b\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "currentAttempt", ""})
/*    */ final class LLMProxy$sendWithTracking$2
/*    */   extends SuspendLambda
/*    */   implements Function2<Integer, Continuation<? super AIAnswer>, Object>
/*    */ {
/*    */   Object L$0;
/*    */   int label;
/*    */   
/*    */   LLMProxy$sendWithTracking$2(Function1<CustomArtifactEvent, Unit> $eventHandler, MatterhornChat $chat, ModelParameters $modelParameters, Function4<MatterhornChat, ModelParameters, MatterhornPropertyProvider, Continuation<? super AIAnswer>, Object> $request, MatterhornPropertyProvider $propertyProvider, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     int currentAttempt;
/*    */     UUID uuid;
/*    */     AIAnswer result;
/* 85 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); currentAttempt = this.I$0;
/* 86 */         uuid = UUID.randomUUID();
/* 87 */         Intrinsics.checkNotNull(uuid); this.$eventHandler.invoke(new LlmRequestEvent(this.$chat, this.$modelParameters, currentAttempt, uuid));
/*    */         
/* 89 */         try { this.L$0 = uuid; this.label = 1; if (this.$request.invoke(this.$chat, this.$modelParameters, this.$propertyProvider, this) == object) return object;  result = (AIAnswer)this.$request.invoke(this.$chat, this.$modelParameters, this.$propertyProvider, this);
/* 90 */           Intrinsics.checkNotNull(uuid); this.$eventHandler.invoke(new LlmResponseEvent(result, uuid));
/* 91 */           result = result; }
/* 92 */         catch (Exception e)
/* 93 */         { Intrinsics.checkNotNull(uuid); this.$eventHandler.invoke(new LlmRequestFailed(e, uuid));
/* 94 */           throw e; }  return result;
/*    */       case 1:
/*    */         uuid = (UUID)this.L$0;
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         result = (AIAnswer)SYNTHETIC_LOCAL_VARIABLE_1;
/*    */         Intrinsics.checkNotNull(uuid);
/*    */         this.$eventHandler.invoke(new LlmResponseEvent(result, uuid));
/*    */         result = result; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super LLMProxy$sendWithTracking$2> $completion) {
/*    */     LLMProxy$sendWithTracking$2 lLMProxy$sendWithTracking$2 = new LLMProxy$sendWithTracking$2(this.$eventHandler, this.$chat, this.$modelParameters, this.$request, this.$propertyProvider, $completion);
/*    */     lLMProxy$sendWithTracking$2.I$0 = ((Number)value).intValue();
/*    */     return (Continuation<Unit>)lLMProxy$sendWithTracking$2;
/*    */   }
/*    */   
/*    */   public final Object invoke(int p1, Continuation<?> p2) {
/*    */     return ((LLMProxy$sendWithTracking$2)create(Integer.valueOf(p1), p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\llm\LLMProxy$sendWithTracking$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */