/*    */ package com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\f\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\031\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0032\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\022HÖ\001J\t\020\023\032\0020\024HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/FormatHierarchyParams;", "", "showRanges", "", "declarationParams", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;", "<init>", "(ZLcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;)V", "getShowRanges", "()Z", "getDeclarationParams", "()Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ShowMethodsParametersType;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "ej-core"})
/*    */ public final class FormatHierarchyParams
/*    */ {
/*    */   private final boolean showRanges;
/*    */   @NotNull
/*    */   private final ElementProvider.ShowMethodsParametersType declarationParams;
/*    */   
/*    */   public FormatHierarchyParams(boolean showRanges, @NotNull ElementProvider.ShowMethodsParametersType declarationParams) {
/* 64 */     this.showRanges = showRanges; this.declarationParams = declarationParams; } public final boolean getShowRanges() { return this.showRanges; } @NotNull public final ElementProvider.ShowMethodsParametersType getDeclarationParams() { return this.declarationParams; }
/*    */ 
/*    */   
/*    */   public final boolean component1() {
/*    */     return this.showRanges;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ElementProvider.ShowMethodsParametersType component2() {
/*    */     return this.declarationParams;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final FormatHierarchyParams copy(boolean showRanges, @NotNull ElementProvider.ShowMethodsParametersType declarationParams) {
/*    */     Intrinsics.checkNotNullParameter(declarationParams, "declarationParams");
/*    */     return new FormatHierarchyParams(showRanges, declarationParams);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "FormatHierarchyParams(showRanges=" + this.showRanges + ", declarationParams=" + this.declarationParams + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Boolean.hashCode(this.showRanges);
/*    */     return result * 31 + this.declarationParams.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof FormatHierarchyParams))
/*    */       return false; 
/*    */     FormatHierarchyParams formatHierarchyParams = (FormatHierarchyParams)other;
/*    */     return (this.showRanges != formatHierarchyParams.showRanges) ? false : (!(this.declarationParams != formatHierarchyParams.declarationParams));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\extractors\FormatHierarchyParams.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */