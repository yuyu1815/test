/*    */ package com.intellij.ml.llm.matterhorn.ej.core.critique;
/*    */ 
/*    */ import kotlin.Metadata;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\003HÖ\001J\t\020\017\032\0020\020HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/critique/EditCritiqueResponseParseResult$Success;", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/EditCritiqueResponseParseResult;", "bestActionZeroBasedIdx", "", "<init>", "(I)V", "getBestActionZeroBasedIdx", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ej-core"})
/*    */ public final class Success
/*    */   implements EditCritiqueResponseParseResult
/*    */ {
/*    */   private final int bestActionZeroBasedIdx;
/*    */   
/*    */   public Success(int bestActionZeroBasedIdx) {
/* 47 */     this.bestActionZeroBasedIdx = bestActionZeroBasedIdx; } public final int getBestActionZeroBasedIdx() { return this.bestActionZeroBasedIdx; }
/*    */ 
/*    */   
/*    */   public final int component1() {
/*    */     return this.bestActionZeroBasedIdx;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Success copy(int bestActionZeroBasedIdx) {
/*    */     return new Success(bestActionZeroBasedIdx);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Success(bestActionZeroBasedIdx=" + this.bestActionZeroBasedIdx + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return Integer.hashCode(this.bestActionZeroBasedIdx);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Success))
/*    */       return false; 
/*    */     Success success = (Success)other;
/*    */     return !(this.bestActionZeroBasedIdx != success.bestActionZeroBasedIdx);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\critique\EditCritiqueResponseParseResult$Success.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */