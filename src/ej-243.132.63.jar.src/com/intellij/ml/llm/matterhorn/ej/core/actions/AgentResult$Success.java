/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*    */ 
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\016\n\002\030\002\n\000\n\002\030\002\n\002\b\007\030\000*\004\b\001\020\0012\b\022\004\022\002H\0010\002B\017\022\006\020\003\032\0028\001¢\006\004\b\004\020\005R\023\020\003\032\0028\001¢\006\n\n\002\020\b\032\004\b\006\020\007¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/AgentResult$Success;", "T", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/AgentResult;", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "ej-core"})
/*    */ public final class Success<T>
/*    */   extends AgentResult<T>
/*    */ {
/*    */   private final T value;
/*    */   
/*    */   public Success(Object value) {
/* 40 */     super(null); this.value = (T)value; } public final T getValue() { return this.value; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\AgentResult$Success.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */