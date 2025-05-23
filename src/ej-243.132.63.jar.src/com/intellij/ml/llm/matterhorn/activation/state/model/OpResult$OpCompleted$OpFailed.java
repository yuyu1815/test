/*    */ package com.intellij.ml.llm.matterhorn.activation.state.model;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\000\n\002\030\002\n\002\020\001\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\000*\006\b\004\020\001 \0012\016\022\004\022\002H\001\022\004\022\0020\0030\002B\017\022\006\020\004\032\0028\004¢\006\004\b\005\020\006J\016\020\n\032\0028\004HÆ\003¢\006\002\020\bJ\036\020\013\032\b\022\004\022\0028\0040\0002\b\b\002\020\004\032\0028\004HÆ\001¢\006\002\020\fJ\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\020HÖ\003J\t\020\021\032\0020\022HÖ\001J\t\020\023\032\0020\024HÖ\001R\023\020\004\032\0028\004¢\006\n\n\002\020\t\032\004\b\007\020\b¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted$OpFailed;", "Err", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted;", "", "failure", "<init>", "(Ljava/lang/Object;)V", "getFailure", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted$OpFailed;", "equals", "", "other", "", "hashCode", "", "toString", "", "state.model"})
/*    */ public final class OpFailed<Err>
/*    */   extends OpResult.OpCompleted
/*    */ {
/*    */   private final Err failure;
/*    */   
/*    */   public OpFailed(Object failure) {
/* 42 */     super(null); this.failure = (Err)failure; } public final Err getFailure() { return this.failure; }
/*    */ 
/*    */   
/*    */   public final Err component1() {
/*    */     return this.failure;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final OpFailed<Err> copy(Object failure) {
/*    */     return new OpFailed((Err)failure);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "OpFailed(failure=" + this.failure + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return (this.failure == null) ? 0 : this.failure.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof OpFailed))
/*    */       return false; 
/*    */     OpFailed opFailed = (OpFailed)other;
/*    */     return !!Intrinsics.areEqual(this.failure, opFailed.failure);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\OpResult$OpCompleted$OpFailed.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */