/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\r\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B%\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003\022\b\b\002\020\005\032\0020\003¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\003HÆ\003J\t\020\016\032\0020\003HÆ\003J'\020\017\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\003HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\001HÖ\003J\t\020\023\032\0020\003HÖ\001J\t\020\024\032\0020\025HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\n\020\tR\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\013\020\t¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LevenshteinDistance$Weights;", "", "insertCost", "", "deleteCost", "substituteCost", "<init>", "(III)V", "getInsertCost", "()I", "getDeleteCost", "getSubstituteCost", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "ej-core"})
/*    */ public final class Weights
/*    */ {
/*    */   private final int insertCost;
/*    */   private final int deleteCost;
/*    */   private final int substituteCost;
/*    */   
/*    */   public Weights(int insertCost, int deleteCost, int substituteCost) {
/* 17 */     this.insertCost = insertCost;
/* 18 */     this.deleteCost = deleteCost;
/* 19 */     this.substituteCost = substituteCost; } public final int getSubstituteCost() { return this.substituteCost; }
/*    */ 
/*    */   
/*    */   public final int getInsertCost() {
/*    */     return this.insertCost;
/*    */   }
/*    */   
/*    */   public final int getDeleteCost() {
/*    */     return this.deleteCost;
/*    */   }
/*    */   
/*    */   public final int component1() {
/*    */     return this.insertCost;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.deleteCost;
/*    */   }
/*    */   
/*    */   public final int component3() {
/*    */     return this.substituteCost;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Weights copy(int insertCost, int deleteCost, int substituteCost) {
/*    */     return new Weights(insertCost, deleteCost, substituteCost);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Weights(insertCost=" + this.insertCost + ", deleteCost=" + this.deleteCost + ", substituteCost=" + this.substituteCost + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Integer.hashCode(this.insertCost);
/*    */     result = result * 31 + Integer.hashCode(this.deleteCost);
/*    */     return result * 31 + Integer.hashCode(this.substituteCost);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Weights))
/*    */       return false; 
/*    */     Weights weights = (Weights)other;
/*    */     return (this.insertCost != weights.insertCost) ? false : ((this.deleteCost != weights.deleteCost) ? false : (!(this.substituteCost != weights.substituteCost)));
/*    */   }
/*    */   
/*    */   public Weights() {
/*    */     this(0, 0, 0, 7, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\LevenshteinDistance$Weights.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */