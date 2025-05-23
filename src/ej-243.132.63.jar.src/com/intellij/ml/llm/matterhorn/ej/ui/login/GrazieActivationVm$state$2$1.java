/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.login;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiaActivation;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.login.states.GrazieActivationState;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000#\n\000\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\003*\001\000\b\n\030\0002\0020\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\004\020\005R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\b\020\tR\023\020\n\032\004\030\0010\013¢\006\b\n\000\032\004\b\f\020\r¨\006\016"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$state$2$1", "", "activation", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;", "getActivation", "()Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;", "optimisticState", "", "getOptimisticState", "()Z", "mock", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState;", "getMock", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState;", "ej-ui"})
/*    */ public final class null
/*    */ {
/*    */   private final AiaActivation activation;
/*    */   private final boolean optimisticState;
/*    */   private final GrazieActivationState mock;
/*    */   
/*    */   null(Pair $value, Pair $mock) {
/* 45 */     this.activation = (AiaActivation)$value.getFirst();
/* 46 */     this.optimisticState = ((Boolean)$value.getSecond()).booleanValue();
/* 47 */     this.mock = ($mock != null) ? (GrazieActivationState)$mock.getSecond() : null; } public final GrazieActivationState getMock() { return this.mock; }
/*    */ 
/*    */   
/*    */   public final AiaActivation getActivation() {
/*    */     return this.activation;
/*    */   }
/*    */   
/*    */   public final boolean getOptimisticState() {
/*    */     return this.optimisticState;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\GrazieActivationVm$state$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */