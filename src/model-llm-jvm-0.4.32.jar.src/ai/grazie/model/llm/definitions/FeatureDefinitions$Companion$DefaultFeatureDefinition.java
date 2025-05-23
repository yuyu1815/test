/*    */ package ai.grazie.model.llm.definitions;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\030\0002\0020\001B#\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\002\020\bR\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\t\020\nR\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\r\020\016¨\006\017"}, d2 = {"Lai/grazie/model/llm/definitions/FeatureDefinitions$Companion$DefaultFeatureDefinition;", "Lai/grazie/model/llm/definitions/FeatureDefinitions;", "chatDefinition", "Lai/grazie/model/llm/definitions/ChatDefinition;", "completionDefinition", "Lai/grazie/model/llm/definitions/CompletionDefinition;", "embeddingDefinition", "Lai/grazie/model/llm/definitions/EmbeddingDefinition;", "(Lai/grazie/model/llm/definitions/ChatDefinition;Lai/grazie/model/llm/definitions/CompletionDefinition;Lai/grazie/model/llm/definitions/EmbeddingDefinition;)V", "getChatDefinition", "()Lai/grazie/model/llm/definitions/ChatDefinition;", "getCompletionDefinition", "()Lai/grazie/model/llm/definitions/CompletionDefinition;", "getEmbeddingDefinition", "()Lai/grazie/model/llm/definitions/EmbeddingDefinition;", "model-llm"})
/*    */ public final class DefaultFeatureDefinition
/*    */   implements FeatureDefinitions
/*    */ {
/*    */   @NotNull
/*    */   private final ChatDefinition chatDefinition;
/*    */   @NotNull
/*    */   private final CompletionDefinition completionDefinition;
/*    */   @NotNull
/*    */   private final EmbeddingDefinition embeddingDefinition;
/*    */   
/*    */   public DefaultFeatureDefinition(@NotNull ChatDefinition chatDefinition, @NotNull CompletionDefinition completionDefinition, @NotNull EmbeddingDefinition embeddingDefinition) {
/* 19 */     this.chatDefinition = chatDefinition;
/*    */ 
/*    */ 
/*    */     
/* 23 */     this.completionDefinition = completionDefinition;
/* 24 */     this.embeddingDefinition = embeddingDefinition; } @NotNull public EmbeddingDefinition getEmbeddingDefinition() { return this.embeddingDefinition; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public ChatDefinition getChatDefinition() {
/*    */     return this.chatDefinition;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public CompletionDefinition getCompletionDefinition() {
/*    */     return this.completionDefinition;
/*    */   }
/*    */   
/*    */   public DefaultFeatureDefinition() {
/*    */     this(null, null, null, 7, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\definitions\FeatureDefinitions$Companion$DefaultFeatureDefinition.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */