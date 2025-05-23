/*    */ package com.intellij.ml.llm.matterhorn.activation.state.model;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\003\n\002\b\003\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpNetworkFailure;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "state.model"})
/*    */ public final class OpNetworkFailure
/*    */   extends OpResult.OpTerminated
/*    */ {
/*    */   public OpNetworkFailure(@NotNull Throwable cause) {
/* 26 */     super(cause, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\OpResult$OpTerminated$OpNetworkFailure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */