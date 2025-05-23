/*    */ package com.intellij.ml.llm.matterhorn.activation.data.repos;
/*    */ 
/*    */ import com.intellij.ui.JBAccountInfoService;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
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
/*    */ @DebugMetadata(f = "JunieJbaUserRepository.kt", l = {48}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.JunieJbaUserRepositoryImpl$authDataFlow$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\n\022\006\022\004\030\0010\0030\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/intellij/ui/JBAccountInfoService$JBAData;"})
/*    */ final class JunieJbaUserRepositoryImpl$authDataFlow$1
/*    */   extends SuspendLambda
/*    */   implements Function2<FlowCollector<? super JBAccountInfoService.JBAData>, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   JunieJbaUserRepositoryImpl$authDataFlow$1(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     FlowCollector $this$onStart;
/* 48 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$onStart = (FlowCollector)this.L$0; this.label = 1; if ($this$onStart.emit(JunieJbaUserRepositoryImpl.access$getJbaInfoService(JunieJbaUserRepositoryImpl.this).getUserData(), (Continuation)this) == object) return object;  $this$onStart.emit(JunieJbaUserRepositoryImpl.access$getJbaInfoService(JunieJbaUserRepositoryImpl.this).getUserData(), (Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super JunieJbaUserRepositoryImpl$authDataFlow$1> $completion) {
/*    */     JunieJbaUserRepositoryImpl$authDataFlow$1 junieJbaUserRepositoryImpl$authDataFlow$1 = new JunieJbaUserRepositoryImpl$authDataFlow$1($completion);
/*    */     junieJbaUserRepositoryImpl$authDataFlow$1.L$0 = value;
/*    */     return (Continuation<Unit>)junieJbaUserRepositoryImpl$authDataFlow$1;
/*    */   }
/*    */   
/*    */   public final Object invoke(FlowCollector p1, Continuation<?> p2) {
/*    */     return ((JunieJbaUserRepositoryImpl$authDataFlow$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieJbaUserRepositoryImpl$authDataFlow$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */