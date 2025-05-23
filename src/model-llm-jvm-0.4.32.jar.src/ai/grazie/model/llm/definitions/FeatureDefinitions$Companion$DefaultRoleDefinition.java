/*    */ package ai.grazie.model.llm.definitions;
/*    */ 
/*    */ import ai.grazie.model.llm.chat.LLMChatRole;
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
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\"\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\025\022\016\b\002\020\002\032\b\022\004\022\0020\0040\003¢\006\002\020\005J\017\020\b\032\b\022\004\022\0020\0040\003HÆ\003J\031\020\t\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\021HÖ\001R\032\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\022"}, d2 = {"Lai/grazie/model/llm/definitions/FeatureDefinitions$Companion$DefaultRoleDefinition;", "Lai/grazie/model/llm/definitions/RoleDefinition;", "supportedRoles", "", "Lai/grazie/model/llm/chat/LLMChatRole;", "(Ljava/util/Set;)V", "getSupportedRoles", "()Ljava/util/Set;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "model-llm"})
/*    */ final class DefaultRoleDefinition
/*    */   implements RoleDefinition
/*    */ {
/*    */   @NotNull
/*    */   private final Set<LLMChatRole> supportedRoles;
/*    */   
/*    */   public DefaultRoleDefinition(@NotNull Set<LLMChatRole> supportedRoles) {
/* 29 */     this.supportedRoles = supportedRoles; } @NotNull public Set<LLMChatRole> getSupportedRoles() { return this.supportedRoles; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Set<LLMChatRole> component1() {
/*    */     return this.supportedRoles;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final DefaultRoleDefinition copy(@NotNull Set<? extends LLMChatRole> supportedRoles) {
/*    */     Intrinsics.checkNotNullParameter(supportedRoles, "supportedRoles");
/*    */     return new DefaultRoleDefinition(supportedRoles);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "DefaultRoleDefinition(supportedRoles=" + this.supportedRoles + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.supportedRoles.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof DefaultRoleDefinition))
/*    */       return false; 
/*    */     DefaultRoleDefinition defaultRoleDefinition = (DefaultRoleDefinition)other;
/*    */     return !!Intrinsics.areEqual(this.supportedRoles, defaultRoleDefinition.supportedRoles);
/*    */   }
/*    */   
/*    */   public DefaultRoleDefinition() {
/*    */     this(null, 1, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\definitions\FeatureDefinitions$Companion$DefaultRoleDefinition.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */