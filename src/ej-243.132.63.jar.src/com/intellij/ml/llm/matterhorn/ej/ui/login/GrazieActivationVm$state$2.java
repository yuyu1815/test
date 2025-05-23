/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.login;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiaActivation;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.login.states.GrazieActivationState;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function4;
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
/*    */ @DebugMetadata(f = "GrazieActivationVm.kt", l = {44}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.GrazieActivationVm$state$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000'\n\000\n\002\020\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\013\n\000\n\002\020\016\n\002\030\002*\001\003\020\000\032\0020\001*\b\022\004\022\0020\0030\0022\022\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\0052\024\020\b\032\020\022\004\022\0020\t\022\004\022\0020\n\030\0010\005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$state$2$1", "value", "Lkotlin/Pair;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;", "", "mock", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState;"})
/*    */ final class GrazieActivationVm$state$2
/*    */   extends SuspendLambda
/*    */   implements Function4<FlowCollector<? super GrazieActivationVm$state$2.null>, Pair<? extends AiaActivation, ? extends Boolean>, Pair<? extends String, ? extends GrazieActivationState>, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   GrazieActivationVm$state$2(Continuation $completion) {
/*    */     super(4, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     FlowCollector $this$combineTransform;
/*    */     Pair<? extends AiaActivation, Boolean> value;
/*    */     Pair<String, ? extends GrazieActivationState> mock;
/* 43 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$combineTransform = (FlowCollector)this.L$0; value = (Pair)this.L$1; mock = (Pair)this.L$2;
/* 44 */         this.L$0 = null; this.L$1 = null; this.label = 1; if ($this$combineTransform.emit(new Object(value, mock) { private final AiaActivation activation; private final boolean optimisticState; private final GrazieActivationState mock;
/* 45 */               public final AiaActivation getActivation() { return this.activation; }
/* 46 */               public final boolean getOptimisticState() { return this.optimisticState; }
/* 47 */               public final GrazieActivationState getMock() { return this.mock; } }(Continuation)this) == object) return object;  $this$combineTransform.emit(new Object(value, mock) { private final AiaActivation activation; private final boolean optimisticState; public final GrazieActivationState getMock() { return this.mock; }
/*    */               private final GrazieActivationState mock;
/* 49 */               public final AiaActivation getActivation() { return this.activation; } public final boolean getOptimisticState() { return this.optimisticState; } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Object invoke(FlowCollector p1, Pair p2, Pair p3, Continuation<? super GrazieActivationVm$state$2> p4) {
/*    */     GrazieActivationVm$state$2 grazieActivationVm$state$2 = new GrazieActivationVm$state$2(p4);
/*    */     grazieActivationVm$state$2.L$0 = p1;
/*    */     grazieActivationVm$state$2.L$1 = p2;
/*    */     grazieActivationVm$state$2.L$2 = p3;
/*    */     return grazieActivationVm$state$2.invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\GrazieActivationVm$state$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */