/*    */ package ai.grazie.model.llm.definitions;
/*    */ 
/*    */ import ai.grazie.model.llm.chat.LLMChatRole;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import java.util.Set;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\005\b\003\030\0002\0020\001:\003\003\004\005B\007\b\002¢\006\002\020\002¨\006\006"}, d2 = {"Lai/grazie/model/llm/definitions/FeatureDefinitions$Companion;", "", "()V", "DefaultFeatureDefinition", "DefaultParameterDefinition", "DefaultRoleDefinition", "model-llm"})
/*    */ public final class Companion {
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\030\0002\0020\001B#\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\002\020\bR\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\t\020\nR\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\r\020\016¨\006\017"}, d2 = {"Lai/grazie/model/llm/definitions/FeatureDefinitions$Companion$DefaultFeatureDefinition;", "Lai/grazie/model/llm/definitions/FeatureDefinitions;", "chatDefinition", "Lai/grazie/model/llm/definitions/ChatDefinition;", "completionDefinition", "Lai/grazie/model/llm/definitions/CompletionDefinition;", "embeddingDefinition", "Lai/grazie/model/llm/definitions/EmbeddingDefinition;", "(Lai/grazie/model/llm/definitions/ChatDefinition;Lai/grazie/model/llm/definitions/CompletionDefinition;Lai/grazie/model/llm/definitions/EmbeddingDefinition;)V", "getChatDefinition", "()Lai/grazie/model/llm/definitions/ChatDefinition;", "getCompletionDefinition", "()Lai/grazie/model/llm/definitions/CompletionDefinition;", "getEmbeddingDefinition", "()Lai/grazie/model/llm/definitions/EmbeddingDefinition;", "model-llm"})
/*    */   public static final class DefaultFeatureDefinition implements FeatureDefinitions { @NotNull
/*    */     private final ChatDefinition chatDefinition;
/*    */     @NotNull
/*    */     private final CompletionDefinition completionDefinition;
/*    */     @NotNull
/*    */     private final EmbeddingDefinition embeddingDefinition;
/*    */     
/* 19 */     public DefaultFeatureDefinition(@NotNull ChatDefinition chatDefinition, @NotNull CompletionDefinition completionDefinition, @NotNull EmbeddingDefinition embeddingDefinition) { this.chatDefinition = chatDefinition;
/*    */ 
/*    */ 
/*    */       
/* 23 */       this.completionDefinition = completionDefinition;
/* 24 */       this.embeddingDefinition = embeddingDefinition; } @NotNull public ChatDefinition getChatDefinition() { return this.chatDefinition; } @NotNull public CompletionDefinition getCompletionDefinition() { return this.completionDefinition; } @NotNull public EmbeddingDefinition getEmbeddingDefinition() { return this.embeddingDefinition; } public DefaultFeatureDefinition() { this(null, null, null, 7, null); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\"\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\025\022\016\b\002\020\002\032\b\022\004\022\0020\0040\003¢\006\002\020\005J\017\020\b\032\b\022\004\022\0020\0040\003HÆ\003J\031\020\t\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\021HÖ\001R\032\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\022"}, d2 = {"Lai/grazie/model/llm/definitions/FeatureDefinitions$Companion$DefaultParameterDefinition;", "Lai/grazie/model/llm/definitions/ParameterDefinition;", "supportedParameters", "", "Lai/grazie/utils/attributes/Attributes$Key;", "(Ljava/util/Set;)V", "getSupportedParameters", "()Ljava/util/Set;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "model-llm"})
/*    */   private static final class DefaultParameterDefinition implements ParameterDefinition { @NotNull
/*    */     private final Set<Attributes.Key> supportedParameters;
/* 27 */     public DefaultParameterDefinition(@NotNull Set<Attributes.Key> supportedParameters) { this.supportedParameters = supportedParameters; } @NotNull public Set<Attributes.Key> getSupportedParameters() { return this.supportedParameters; } @NotNull public final Set<Attributes.Key> component1() { return this.supportedParameters; } @NotNull public final DefaultParameterDefinition copy(@NotNull Set<? extends Attributes.Key> supportedParameters) { Intrinsics.checkNotNullParameter(supportedParameters, "supportedParameters"); return new DefaultParameterDefinition(supportedParameters); } @NotNull public String toString() { return "DefaultParameterDefinition(supportedParameters=" + this.supportedParameters + ")"; } public int hashCode() { return this.supportedParameters.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof DefaultParameterDefinition)) return false;  DefaultParameterDefinition defaultParameterDefinition = (DefaultParameterDefinition)other; return !!Intrinsics.areEqual(this.supportedParameters, defaultParameterDefinition.supportedParameters); } public DefaultParameterDefinition() { this(null, 1, null); } }
/*    */    @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\"\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\025\022\016\b\002\020\002\032\b\022\004\022\0020\0040\003¢\006\002\020\005J\017\020\b\032\b\022\004\022\0020\0040\003HÆ\003J\031\020\t\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\021HÖ\001R\032\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\022"}, d2 = {"Lai/grazie/model/llm/definitions/FeatureDefinitions$Companion$DefaultRoleDefinition;", "Lai/grazie/model/llm/definitions/RoleDefinition;", "supportedRoles", "", "Lai/grazie/model/llm/chat/LLMChatRole;", "(Ljava/util/Set;)V", "getSupportedRoles", "()Ljava/util/Set;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "model-llm"}) private static final class DefaultRoleDefinition implements RoleDefinition {
/* 29 */     public DefaultRoleDefinition(@NotNull Set<LLMChatRole> supportedRoles) { this.supportedRoles = supportedRoles; } @NotNull private final Set<LLMChatRole> supportedRoles; @NotNull public Set<LLMChatRole> getSupportedRoles() { return this.supportedRoles; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final Set<LLMChatRole> component1() {
/*    */       return this.supportedRoles;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final DefaultRoleDefinition copy(@NotNull Set<? extends LLMChatRole> supportedRoles) {
/*    */       Intrinsics.checkNotNullParameter(supportedRoles, "supportedRoles");
/*    */       return new DefaultRoleDefinition(supportedRoles);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "DefaultRoleDefinition(supportedRoles=" + this.supportedRoles + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return this.supportedRoles.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof DefaultRoleDefinition))
/*    */         return false; 
/*    */       DefaultRoleDefinition defaultRoleDefinition = (DefaultRoleDefinition)other;
/*    */       return !!Intrinsics.areEqual(this.supportedRoles, defaultRoleDefinition.supportedRoles);
/*    */     }
/*    */     
/*    */     public DefaultRoleDefinition() {
/*    */       this(null, 1, null);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\definitions\FeatureDefinitions$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */