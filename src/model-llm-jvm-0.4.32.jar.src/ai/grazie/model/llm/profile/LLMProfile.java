/*    */ package ai.grazie.model.llm.profile;
/*    */ 
/*    */ import ai.grazie.model.llm.LLMType;
/*    */ import ai.grazie.model.llm.definitions.FeatureDefinitions;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\016\n\002\b\020\b&\030\0002\0020\001BK\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007\022\006\020\t\032\0020\n\022\n\b\002\020\013\032\004\030\0010\f\022\b\b\002\020\r\032\0020\016\022\b\b\002\020\017\032\0020\020¢\006\002\020\021R\021\020\r\032\0020\016¢\006\b\n\000\032\004\b\022\020\023R\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\024\020\025R\027\020\006\032\b\022\004\022\0020\b0\007¢\006\b\n\000\032\004\b\026\020\027R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\030\020\031R\023\020\013\032\004\030\0010\f¢\006\b\n\000\032\004\b\032\020\033R\021\020\017\032\0020\020¢\006\b\n\000\032\004\b\034\020\035R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\036\020\037¨\006 "}, d2 = {"Lai/grazie/model/llm/profile/LLMProfile;", "", "id", "Lai/grazie/model/llm/profile/LLMProfileID;", "type", "Lai/grazie/model/llm/LLMType;", "features", "", "Lai/grazie/model/llm/profile/LLMFeature;", "featureDefinitions", "Lai/grazie/model/llm/definitions/FeatureDefinitions;", "metadata", "Lai/grazie/model/llm/profile/LLMProfileMetadata;", "deprecated", "", "providerModelID", "", "(Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/model/llm/LLMType;Ljava/util/List;Lai/grazie/model/llm/definitions/FeatureDefinitions;Lai/grazie/model/llm/profile/LLMProfileMetadata;ZLjava/lang/String;)V", "getDeprecated", "()Z", "getFeatureDefinitions", "()Lai/grazie/model/llm/definitions/FeatureDefinitions;", "getFeatures", "()Ljava/util/List;", "getId", "()Lai/grazie/model/llm/profile/LLMProfileID;", "getMetadata", "()Lai/grazie/model/llm/profile/LLMProfileMetadata;", "getProviderModelID", "()Ljava/lang/String;", "getType", "()Lai/grazie/model/llm/LLMType;", "model-llm"})
/*    */ public abstract class LLMProfile {
/*    */   @NotNull
/*    */   private final LLMProfileID id;
/*    */   @NotNull
/*    */   private final LLMType type;
/*    */   @NotNull
/*    */   private final List<LLMFeature> features;
/*    */   
/* 16 */   public LLMProfile(@NotNull LLMProfileID id, @NotNull LLMType type, @NotNull List<LLMFeature> features, @NotNull FeatureDefinitions featureDefinitions, @Nullable LLMProfileMetadata metadata, boolean deprecated, @NotNull String providerModelID) { this.id = id;
/* 17 */     this.type = type;
/* 18 */     this.features = features;
/* 19 */     this.featureDefinitions = featureDefinitions;
/* 20 */     this.metadata = metadata;
/* 21 */     this.deprecated = deprecated;
/* 22 */     this.providerModelID = providerModelID; } @NotNull private final FeatureDefinitions featureDefinitions; @Nullable private final LLMProfileMetadata metadata; private final boolean deprecated; @NotNull private final String providerModelID; @NotNull public final LLMProfileID getId() { return this.id; } @NotNull public final String getProviderModelID() { return this.providerModelID; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final LLMType getType() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<LLMFeature> getFeatures() {
/*    */     return this.features;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final FeatureDefinitions getFeatureDefinitions() {
/*    */     return this.featureDefinitions;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final LLMProfileMetadata getMetadata() {
/*    */     return this.metadata;
/*    */   }
/*    */   
/*    */   public final boolean getDeprecated() {
/*    */     return this.deprecated;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\profile\LLMProfile.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */