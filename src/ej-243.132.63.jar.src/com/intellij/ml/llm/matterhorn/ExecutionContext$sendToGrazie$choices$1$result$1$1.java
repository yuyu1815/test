/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.llm.AIAnswer;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LongDelayDetected;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
/*     */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Deferred;
/*     */ import kotlinx.coroutines.DelayKt;
/*     */ import kotlinx.coroutines.Job;
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
/*     */ @DebugMetadata(f = "ExecutionContext.kt", l = {220}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ExecutionContext$sendToGrazie$choices$1$result$1$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class null
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super AIAnswer>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   null(MatterhornChat $chat, ModelParameters $modelParameters, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     CoroutineScope $this$withContext;
/*     */     Deferred job;
/*     */     Job delayJob;
/* 206 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$withContext = (CoroutineScope)this.L$0;
/* 207 */         job = BuildersKt.async$default($this$withContext, null, null, new ExecutionContext$sendToGrazie$choices$1$result$1$1$job$1(this.$chat, this.$modelParameters, null), 3, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 214 */         delayJob = BuildersKt.launch$default($this$withContext, null, null, new ExecutionContext$sendToGrazie$choices$1$result$1$1$delayJob$1(null), 3, null);
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 219 */         job.invokeOnCompletion(delayJob::invokeSuspend$lambda$0);
/* 220 */         this.label = 1; if (job.await((Continuation)this) == object) return object;  return job.await((Continuation)this);
/*     */       case 1:
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         return SYNTHETIC_LOCAL_VARIABLE_1; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */     Object object = new Object(ExecutionContext.this, this.$chat, this.$modelParameters, $completion);
/*     */     object.L$0 = value;
/*     */     return (Continuation<Unit>)object;
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ExecutionContext.kt", l = {208}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ExecutionContext$sendToGrazie$choices$1$result$1$1$job$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class ExecutionContext$sendToGrazie$choices$1$result$1$1$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AIAnswer>, Object> {
/*     */     int label;
/*     */     
/*     */     ExecutionContext$sendToGrazie$choices$1$result$1$1$job$1(MatterhornChat $chat, ModelParameters $modelParameters, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (ExecutionContext.this.getRoot().getOpenAIProxy().sendChat(this.$chat, this.$modelParameters, ExecutionContext.this::invokeSuspend$lambda$0, (Continuation)this) == object)
/*     */             return object; 
/*     */           return ExecutionContext.this.getRoot().getOpenAIProxy().sendChat(this.$chat, this.$modelParameters, ExecutionContext.this::invokeSuspend$lambda$0, (Continuation)this);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super ExecutionContext$sendToGrazie$choices$1$result$1$1$job$1> $completion) {
/*     */       return (Continuation<Unit>)new ExecutionContext$sendToGrazie$choices$1$result$1$1$job$1(this.$chat, this.$modelParameters, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((ExecutionContext$sendToGrazie$choices$1$result$1$1$job$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     private static final Unit invokeSuspend$lambda$0(ExecutionContext this$0, CustomArtifactEvent it) {
/*     */       ExecutionContext.this.getRoot().getListener().onCustomEvent(it, ExecutionContext.this.getArtifact());
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ExecutionContext.kt", l = {215}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ExecutionContext$sendToGrazie$choices$1$result$1$1$delayJob$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class ExecutionContext$sendToGrazie$choices$1$result$1$1$delayJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     ExecutionContext$sendToGrazie$choices$1$result$1$1$delayJob$1(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (DelayKt.delay(60000L, (Continuation)this) == object)
/*     */             return object; 
/*     */           DelayKt.delay(60000L, (Continuation)this);
/*     */           ExecutionContext.this.sendEvent((CustomArtifactEvent)LongDelayDetected.INSTANCE);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           ExecutionContext.this.sendEvent((CustomArtifactEvent)LongDelayDetected.INSTANCE);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super ExecutionContext$sendToGrazie$choices$1$result$1$1$delayJob$1> $completion) {
/*     */       return (Continuation<Unit>)new ExecutionContext$sendToGrazie$choices$1$result$1$1$delayJob$1($completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((ExecutionContext$sendToGrazie$choices$1$result$1$1$delayJob$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Unit invokeSuspend$lambda$0(Job $delayJob, Throwable it) {
/*     */     Job.DefaultImpls.cancel$default($delayJob, null, 1, null);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ExecutionContext$sendToGrazie$choices$1$result$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */