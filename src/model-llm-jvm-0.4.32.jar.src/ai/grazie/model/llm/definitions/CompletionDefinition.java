/*   */ package ai.grazie.model.llm.definitions;
/*   */ 
/*   */ import kotlin.jvm.internal.Intrinsics;
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\007\032\0020\003HÆ\003J\023\020\b\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\fHÖ\003J\t\020\r\032\0020\016HÖ\001J\t\020\017\032\0020\020HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\021"}, d2 = {"Lai/grazie/model/llm/definitions/CompletionDefinition;", "Lai/grazie/model/llm/definitions/LLMFeatureDefinition;", "parameterDefinition", "Lai/grazie/model/llm/definitions/ParameterDefinition;", "(Lai/grazie/model/llm/definitions/ParameterDefinition;)V", "getParameterDefinition", "()Lai/grazie/model/llm/definitions/ParameterDefinition;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "model-llm"})
/*   */ public final class CompletionDefinition implements LLMFeatureDefinition {
/* 8 */   public CompletionDefinition(@NotNull ParameterDefinition parameterDefinition) { this.parameterDefinition = parameterDefinition; } @NotNull private final ParameterDefinition parameterDefinition; @NotNull public ParameterDefinition getParameterDefinition() { return this.parameterDefinition; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   public final ParameterDefinition component1() {
/*   */     return this.parameterDefinition;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final CompletionDefinition copy(@NotNull ParameterDefinition parameterDefinition) {
/*   */     Intrinsics.checkNotNullParameter(parameterDefinition, "parameterDefinition");
/*   */     return new CompletionDefinition(parameterDefinition);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "CompletionDefinition(parameterDefinition=" + this.parameterDefinition + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     return this.parameterDefinition.hashCode();
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof CompletionDefinition))
/*   */       return false; 
/*   */     CompletionDefinition completionDefinition = (CompletionDefinition)other;
/*   */     return !!Intrinsics.areEqual(this.parameterDefinition, completionDefinition.parameterDefinition);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\definitions\CompletionDefinition.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */