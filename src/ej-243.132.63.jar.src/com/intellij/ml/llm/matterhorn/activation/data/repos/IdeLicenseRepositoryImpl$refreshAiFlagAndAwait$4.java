/*    */ package com.intellij.ml.llm.matterhorn.activation.data.repos;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.IdeLicenseAiFlag;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.Boxing;
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
/*    */ @DebugMetadata(f = "JunieIdeLicenseRepository.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$4")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\013\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/IdeLicenseAiFlag;"})
/*    */ final class IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$4
/*    */   extends SuspendLambda
/*    */   implements Function2<IdeLicenseAiFlag, Continuation<? super Boolean>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$4(IdeLicenseAiFlag $desiredAiFlag, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     IdeLicenseAiFlag it;
/* 87 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (IdeLicenseAiFlag)this.L$0; return Boxing.boxBoolean((it == this.$desiredAiFlag)); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$4> $completion) {
/*    */     IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$4 ideLicenseRepositoryImpl$refreshAiFlagAndAwait$4 = new IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$4(this.$desiredAiFlag, $completion);
/*    */     ideLicenseRepositoryImpl$refreshAiFlagAndAwait$4.L$0 = value;
/*    */     return (Continuation<Unit>)ideLicenseRepositoryImpl$refreshAiFlagAndAwait$4;
/*    */   }
/*    */   
/*    */   public final Object invoke(IdeLicenseAiFlag p1, Continuation<?> p2) {
/*    */     return ((IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$4)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\IdeLicenseRepositoryImpl$refreshAiFlagAndAwait$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */