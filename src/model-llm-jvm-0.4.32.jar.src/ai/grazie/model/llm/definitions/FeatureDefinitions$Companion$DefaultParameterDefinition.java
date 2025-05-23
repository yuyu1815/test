/*    */ package ai.grazie.model.llm.definitions;
/*    */ 
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import java.util.Set;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\"\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\025\022\016\b\002\020\002\032\b\022\004\022\0020\0040\003¢\006\002\020\005J\017\020\b\032\b\022\004\022\0020\0040\003HÆ\003J\031\020\t\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\021HÖ\001R\032\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\022"}, d2 = {"Lai/grazie/model/llm/definitions/FeatureDefinitions$Companion$DefaultParameterDefinition;", "Lai/grazie/model/llm/definitions/ParameterDefinition;", "supportedParameters", "", "Lai/grazie/utils/attributes/Attributes$Key;", "(Ljava/util/Set;)V", "getSupportedParameters", "()Ljava/util/Set;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "model-llm"})
/*    */ final class DefaultParameterDefinition
/*    */   implements ParameterDefinition
/*    */ {
/*    */   @NotNull
/*    */   private final Set<Attributes.Key> supportedParameters;
/*    */   
/*    */   public DefaultParameterDefinition(@NotNull Set<Attributes.Key> supportedParameters) {
/* 27 */     this.supportedParameters = supportedParameters; } @NotNull public Set<Attributes.Key> getSupportedParameters() { return this.supportedParameters; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Set<Attributes.Key> component1() {
/*    */     return this.supportedParameters;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final DefaultParameterDefinition copy(@NotNull Set<? extends Attributes.Key> supportedParameters) {
/*    */     Intrinsics.checkNotNullParameter(supportedParameters, "supportedParameters");
/*    */     return new DefaultParameterDefinition(supportedParameters);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "DefaultParameterDefinition(supportedParameters=" + this.supportedParameters + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.supportedParameters.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof DefaultParameterDefinition))
/*    */       return false; 
/*    */     DefaultParameterDefinition defaultParameterDefinition = (DefaultParameterDefinition)other;
/*    */     return !!Intrinsics.areEqual(this.supportedParameters, defaultParameterDefinition.supportedParameters);
/*    */   }
/*    */   
/*    */   public DefaultParameterDefinition() {
/*    */     this(null, 1, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\definitions\FeatureDefinitions$Companion$DefaultParameterDefinition.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */