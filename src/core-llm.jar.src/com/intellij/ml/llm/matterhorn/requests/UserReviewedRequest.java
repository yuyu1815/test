/*    */ package com.intellij.ml.llm.matterhorn.requests;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
/*    */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\020\016\n\002\020\b\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\f\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\026\030\0002\0020\001BA\022\006\020\002\032\0020\001\022\006\020\003\032\0020\004\022(\020\005\032$\b\001\022\004\022\0020\007\022\004\022\0020\b\022\n\022\b\022\004\022\0020\n0\t\022\006\022\004\030\0010\0130\006¢\006\004\b\f\020\rJ\026\020\027\032\0020\0302\006\020\031\032\0020\032H@¢\006\002\020\033R\016\020\002\032\0020\001X\004¢\006\002\n\000R\016\020\003\032\0020\004X\004¢\006\002\n\000R2\020\005\032$\b\001\022\004\022\0020\007\022\004\022\0020\b\022\n\022\b\022\004\022\0020\n0\t\022\006\022\004\030\0010\0130\006X\004¢\006\004\n\002\020\016R\032\020\017\032\0020\bX\016¢\006\016\n\000\032\004\b\020\020\021\"\004\b\022\020\023R\032\020\024\032\0020\bX\016¢\006\016\n\000\032\004\b\025\020\021\"\004\b\026\020\023¨\006\034"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/UserReviewedRequest;", "Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;", "base", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "reviewer", "Lkotlin/Function3;", "", "", "Lkotlin/coroutines/Continuation;", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse;", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/jvm/functions/Function3;)V", "Lkotlin/jvm/functions/Function3;", "maxAttempts", "getMaxAttempts", "()I", "setMaxAttempts", "(I)V", "maxCompletionRequests", "getMaxCompletionRequests", "setMaxCompletionRequests", "execute", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core"})
/*    */ public class UserReviewedRequest
/*    */   implements GrazieRequest
/*    */ {
/*    */   @NotNull
/*    */   private final GrazieRequest base;
/*    */   @NotNull
/*    */   private final ModelParameters modelParameters;
/*    */   @NotNull
/*    */   private final Function3<String, Integer, Continuation<? super ReviewerResponse>, Object> reviewer;
/*    */   private int maxAttempts;
/*    */   private int maxCompletionRequests;
/*    */   
/*    */   public final int getMaxAttempts() {
/*    */     return this.maxAttempts;
/*    */   }
/*    */   
/*    */   public final void setMaxAttempts(int <set-?>) {
/*    */     this.maxAttempts = <set-?>;
/*    */   }
/*    */   
/*    */   public UserReviewedRequest(@NotNull GrazieRequest base, @NotNull ModelParameters modelParameters, @NotNull Function3<String, Integer, Continuation<? super ReviewerResponse>, Object> reviewer) {
/* 41 */     this.base = base;
/* 42 */     this.modelParameters = modelParameters;
/* 43 */     this.reviewer = reviewer;
/* 44 */     this.maxAttempts = 3;
/*    */     
/* 46 */     this.maxCompletionRequests = 2; } public final int getMaxCompletionRequests() { return this.maxCompletionRequests; } public final void setMaxCompletionRequests(int <set-?>) { this.maxCompletionRequests = <set-?>; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object execute(@NotNull ExecutionContext context, @NotNull Continuation<? super MatterhornChat> $completion) {
/*    */     return execute$suspendImpl(this, context, $completion);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "UserReviewedRequest.kt", l = {49, 61, 82, 88, 89}, i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1"}, n = {"$this", "context", "$this", "context", "chat", "answer", "matterhornChatMessage", "lastAnswer", "completionRequests", "attempt", "$this", "context", "chat", "review", "fixReviewMessage", "completionRequests", "attempt", "$this", "context", "chat", "review", "answer", "completionRequests", "attempt", "$this", "context", "chat", "review", "answer", "message", "completionRequests", "attempt"}, m = "execute$suspendImpl", c = "com.intellij.ml.llm.matterhorn.requests.UserReviewedRequest")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class UserReviewedRequest$execute$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     Object L$3;
/*    */     Object L$4;
/*    */     Object L$5;
/*    */     int I$0;
/*    */     int I$1;
/*    */     int label;
/*    */     
/*    */     UserReviewedRequest$execute$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return UserReviewedRequest.execute$suspendImpl(UserReviewedRequest.this, null, (Continuation<? super MatterhornChat>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\requests\UserReviewedRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */