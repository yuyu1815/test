/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.activation;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiaActivation;
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
/*    */ @DebugMetadata(f = "GrazieAuthFacade.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.activation.GrazieAuthFacade$getOrWaitGrazieAuthContext$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\013\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;"})
/*    */ final class GrazieAuthFacade$getOrWaitGrazieAuthContext$2
/*    */   extends SuspendLambda
/*    */   implements Function2<AiaActivation, Continuation<? super Boolean>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   GrazieAuthFacade$getOrWaitGrazieAuthContext$2(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     AiaActivation it;
/* 79 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (AiaActivation)this.L$0;
/* 80 */         return Boxing.boxBoolean(!GrazieAuthFacade.access$isProgressing(GrazieAuthFacade.this, it)); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super GrazieAuthFacade$getOrWaitGrazieAuthContext$2> $completion) {
/*    */     GrazieAuthFacade$getOrWaitGrazieAuthContext$2 grazieAuthFacade$getOrWaitGrazieAuthContext$2 = new GrazieAuthFacade$getOrWaitGrazieAuthContext$2($completion);
/*    */     grazieAuthFacade$getOrWaitGrazieAuthContext$2.L$0 = value;
/*    */     return (Continuation<Unit>)grazieAuthFacade$getOrWaitGrazieAuthContext$2;
/*    */   }
/*    */   
/*    */   public final Object invoke(AiaActivation p1, Continuation<?> p2) {
/*    */     return ((GrazieAuthFacade$getOrWaitGrazieAuthContext$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\activation\GrazieAuthFacade$getOrWaitGrazieAuthContext$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */