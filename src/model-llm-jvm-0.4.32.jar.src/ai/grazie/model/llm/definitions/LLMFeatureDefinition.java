/*    */ package ai.grazie.model.llm.definitions;
/*    */ 
/*    */ import ai.grazie.model.llm.profile.LLMProfile;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bf\030\0002\0020\001J \020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH\026R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005ø\001\000\002\006\n\004\b!0\001¨\006\016À\006\001"}, d2 = {"Lai/grazie/model/llm/definitions/LLMFeatureDefinition;", "", "parameterDefinition", "Lai/grazie/model/llm/definitions/ParameterDefinition;", "getParameterDefinition", "()Lai/grazie/model/llm/definitions/ParameterDefinition;", "validateParameters", "", "name", "", "parameters", "Lai/grazie/utils/attributes/Attributes;", "profile", "Lai/grazie/model/llm/profile/LLMProfile;", "model-llm"})
/*    */ public interface LLMFeatureDefinition
/*    */ {
/*    */   default void validateParameters(@NotNull String name, @NotNull Attributes parameters, @NotNull LLMProfile profile) {
/* 13 */     Intrinsics.checkNotNullParameter(name, "name"); Intrinsics.checkNotNullParameter(parameters, "parameters"); Intrinsics.checkNotNullParameter(profile, "profile"); getParameterDefinition().validateParameters(name, parameters, profile);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   ParameterDefinition getParameterDefinition();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\definitions\LLMFeatureDefinition.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */