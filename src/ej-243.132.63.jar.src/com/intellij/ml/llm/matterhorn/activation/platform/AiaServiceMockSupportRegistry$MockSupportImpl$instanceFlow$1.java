/*    */ package com.intellij.ml.llm.matterhorn.activation.platform;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function3;
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
/*    */ @DebugMetadata(f = "AiaServiceMockSupport.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.platform.AiaServiceMockSupportRegistry$MockSupportImpl$instanceFlow$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\002\b\002\n\002\020\000\n\002\b\002\020\000\032\002H\001\"\b\b\000\020\001*\0020\0022\b\020\003\032\004\030\001H\0012\006\020\004\032\002H\001H\n"}, d2 = {"<anonymous>", "T", "", "mockInstance", "realInstance"})
/*    */ final class AiaServiceMockSupportRegistry$MockSupportImpl$instanceFlow$1
/*    */   extends SuspendLambda
/*    */   implements Function3<T, T, Continuation<? super T>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   AiaServiceMockSupportRegistry$MockSupportImpl$instanceFlow$1(Continuation $completion) {
/*    */     super(3, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     Object mockInstance, realInstance;
/* 67 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); mockInstance = this.L$0; realInstance = this.L$1;
/* 68 */         if (mockInstance == null); return realInstance; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Object invoke(Object p1, Object p2, Continuation<? super AiaServiceMockSupportRegistry$MockSupportImpl$instanceFlow$1> p3) {
/*    */     AiaServiceMockSupportRegistry$MockSupportImpl$instanceFlow$1 aiaServiceMockSupportRegistry$MockSupportImpl$instanceFlow$1 = new AiaServiceMockSupportRegistry$MockSupportImpl$instanceFlow$1(p3);
/*    */     aiaServiceMockSupportRegistry$MockSupportImpl$instanceFlow$1.L$0 = p1;
/*    */     aiaServiceMockSupportRegistry$MockSupportImpl$instanceFlow$1.L$1 = p2;
/*    */     return aiaServiceMockSupportRegistry$MockSupportImpl$instanceFlow$1.invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\platform\AiaServiceMockSupportRegistry$MockSupportImpl$instanceFlow$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */