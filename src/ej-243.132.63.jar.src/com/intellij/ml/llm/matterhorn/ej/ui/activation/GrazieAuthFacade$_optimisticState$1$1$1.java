/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.activation;
/*    */ 
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
/*    */ @DebugMetadata(f = "GrazieAuthFacade.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.activation.GrazieAuthFacade$_optimisticState$1$1$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\020\013\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", ""})
/*    */ final class null
/*    */   extends SuspendLambda
/*    */   implements Function2<Boolean, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   null(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     boolean it;
/* 33 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = this.Z$0;
/* 34 */         GrazieAuthFacadeKt.access$getLog$p().debug("Optimistic state changed to: " + (it ? 1 : 0));
/* 35 */         ((GrazieAuthFacadeState)GrazieAuthFacade.this.getState()).setLoginSuccessful$ej_ui(it);
/* 36 */         return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */     Object object = new Object(GrazieAuthFacade.this, $completion);
/*    */     object.Z$0 = ((Boolean)value).booleanValue();
/*    */     return (Continuation<Unit>)object;
/*    */   }
/*    */   
/*    */   public final Object invoke(boolean p1, Continuation<?> p2) {
/*    */     return ((null)create(Boolean.valueOf(p1), p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\activation\GrazieAuthFacade$_optimisticState$1$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */