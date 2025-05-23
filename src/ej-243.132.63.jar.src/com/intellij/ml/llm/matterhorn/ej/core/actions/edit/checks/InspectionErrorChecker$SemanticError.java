/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks;
/*    */ 
/*    */ import com.intellij.openapi.util.TextRange;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\005HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker$SemanticError;", "", "location", "Lcom/intellij/openapi/util/TextRange;", "description", "", "<init>", "(Lcom/intellij/openapi/util/TextRange;Ljava/lang/String;)V", "getLocation", "()Lcom/intellij/openapi/util/TextRange;", "getDescription", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ej-core"})
/*    */ final class SemanticError
/*    */ {
/*    */   @NotNull
/*    */   private final TextRange location;
/*    */   @NotNull
/*    */   private final String description;
/*    */   
/*    */   public SemanticError(@NotNull TextRange location, @NotNull String description) {
/* 31 */     this.location = location; this.description = description; } @NotNull public final TextRange getLocation() { return this.location; } @NotNull public final String getDescription() { return this.description; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final TextRange component1() {
/*    */     return this.location;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.description;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SemanticError copy(@NotNull TextRange location, @NotNull String description) {
/*    */     Intrinsics.checkNotNullParameter(location, "location");
/*    */     Intrinsics.checkNotNullParameter(description, "description");
/*    */     return new SemanticError(location, description);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SemanticError(location=" + this.location + ", description=" + this.description + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.location.hashCode();
/*    */     return result * 31 + this.description.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SemanticError))
/*    */       return false; 
/*    */     SemanticError semanticError = (SemanticError)other;
/*    */     return !Intrinsics.areEqual(this.location, semanticError.location) ? false : (!!Intrinsics.areEqual(this.description, semanticError.description));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\checks\InspectionErrorChecker$SemanticError.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */