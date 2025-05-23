/*   */ package ai.grazie.model.llm.definitions;
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/llm/definitions/EmbeddingDefinition;", "Lai/grazie/model/llm/definitions/LLMFeatureDefinition;", "parameterDefinition", "Lai/grazie/model/llm/definitions/ParameterDefinition;", "(Lai/grazie/model/llm/definitions/ParameterDefinition;)V", "getParameterDefinition", "()Lai/grazie/model/llm/definitions/ParameterDefinition;", "model-llm"})
/* 3 */ public final class EmbeddingDefinition implements LLMFeatureDefinition { public EmbeddingDefinition(@NotNull ParameterDefinition parameterDefinition) { this.parameterDefinition = parameterDefinition; } @NotNull private final ParameterDefinition parameterDefinition; @NotNull public ParameterDefinition getParameterDefinition() { return this.parameterDefinition; }
/*   */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\definitions\EmbeddingDefinition.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */