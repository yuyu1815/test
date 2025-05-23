/*     */ package com.intellij.ml.llm.matterhorn.core.llm;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
/*     */ import com.intellij.ml.llm.matterhorn.llm.AIAnswer;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
/*     */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "MatterhornAIProxy.kt", l = {126, 129}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.MatterhornAIProxy$sendChat$result$1$time$1$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ @SourceDebugExtension({"SMAP\nMatterhornAIProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornAIProxy.kt\ncom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$sendChat$result$1$time$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,224:1\n1#2:225\n*E\n"})
/*     */ final class MatterhornAIProxy$sendChat$result$1$time$1$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   Object L$0;
/*     */   int label;
/*     */   
/*     */   MatterhornAIProxy$sendChat$result$1$time$1$1(ModelParameters $modelParameters, MatterhornAIProxy $receiver, MatterhornChat $chat, Function1<CustomArtifactEvent, Unit> $eventHandler, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/* 124 */     Object object1, object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 125 */         if (ModelParameters.Companion.isServerMode(this.$modelParameters)) { object1 = this.$response;
/* 126 */           this.L$0 = object1; this.label = 1; if (MatterhornAIProxy.access$setMatterhornServerStateAndWait(MatterhornAIProxy.this, this.$chat, this.$modelParameters, (Continuation)this) == object2)
/*     */             return object2;  }
/* 128 */         else { Object object = MatterhornAIProxy.access$getLlmClients$p(MatterhornAIProxy.this).get(this.$modelParameters.getModel()); ModelParameters modelParameters = this.$modelParameters; if (object == null) {
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
/* 225 */             Object object3 = object; int $i$a$-requireNotNull-MatterhornAIProxy$sendChat$result$1$time$1$1$client$1 = 0;
/*     */             String str = "LLM client not found for model: " + modelParameters.getModel().getName();
/*     */             throw new IllegalArgumentException(str.toString());
/*     */           } 
/*     */           LlmClient client = (LlmClient)object;
/*     */           object1 = object;
/*     */           this.L$0 = object1;
/*     */           this.label = 2;
/*     */           if (MatterhornAIProxy.this.sendWithTracking(this.$chat, this.$modelParameters, MatterhornAIProxy.access$getPropertyProvider$p(MatterhornAIProxy.this), new Function4<MatterhornChat, ModelParameters, MatterhornPropertyProvider, Continuation<? super AIAnswer>, Object>(MatterhornAIProxy.this, null) {
/*     */                 int label;
/*     */                 
/*     */                 public final Object invokeSuspend(Object $result) {
/*     */                   MatterhornChat chat;
/*     */                   ModelParameters modelParameters;
/*     */                   MatterhornPropertyProvider propertyProvider;
/*     */                   LlmRequest request;
/*     */                   Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                   switch (this.label) {
/*     */                     case 0:
/*     */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                       chat = (MatterhornChat)this.L$0;
/*     */                       modelParameters = (ModelParameters)this.L$1;
/*     */                       propertyProvider = (MatterhornPropertyProvider)this.L$2;
/*     */                       request = this.$client.createRequest(chat, modelParameters, propertyProvider);
/*     */                       this.L$0 = null;
/*     */                       this.L$1 = null;
/*     */                       this.label = 1;
/*     */                       if (request.send(MatterhornAIProxy.access$getAccessToken$p(MatterhornAIProxy.this), (Continuation<? super AIAnswer>)this) == object)
/*     */                         return object; 
/*     */                       return request.send(MatterhornAIProxy.access$getAccessToken$p(MatterhornAIProxy.this), (Continuation<? super AIAnswer>)this);
/*     */                     case 1:
/*     */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                       return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */                   } 
/*     */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                 }
/*     */                 
/*     */                 public final Object invoke(MatterhornChat p1, ModelParameters p2, MatterhornPropertyProvider p3, Continuation<? super null> p4) {
/*     */                   Function4<MatterhornChat, ModelParameters, MatterhornPropertyProvider, Continuation<? super AIAnswer>, Object> function4 = new Function4<>(this.$client, MatterhornAIProxy.this, p4);
/*     */                   function4.L$0 = p1;
/*     */                   function4.L$1 = p2;
/*     */                   function4.L$2 = p3;
/*     */                   return function4.invokeSuspend(Unit.INSTANCE);
/*     */                 }
/*     */               }this.$eventHandler, (Continuation<? super AIAnswer>)this) == object2)
/*     */             return object2;  }
/*     */       
/*     */       case 1:
/*     */         object1 = this.L$0;
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */       case 2:
/*     */         object1 = this.L$0;
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super MatterhornAIProxy$sendChat$result$1$time$1$1> $completion) {
/*     */     return (Continuation<Unit>)new MatterhornAIProxy$sendChat$result$1$time$1$1(this.$modelParameters, MatterhornAIProxy.this, this.$chat, this.$eventHandler, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((MatterhornAIProxy$sendChat$result$1$time$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\MatterhornAIProxy$sendChat$result$1$time$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */