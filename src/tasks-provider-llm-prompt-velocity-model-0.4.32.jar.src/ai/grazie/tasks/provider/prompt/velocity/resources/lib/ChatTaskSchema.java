/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib;
/*    */ 
/*    */ import com.fasterxml.jackson.databind.JsonNode;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020$\n\002\020\016\n\002\b\007\030\0002\0020\001B#\022\006\020\002\032\0020\003\022\022\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0030\005¢\006\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\035\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0030\005¢\006\b\n\000\032\004\b\013\020\f¨\006\r"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/ChatTaskSchema;", "", "taskSchema", "Lcom/fasterxml/jackson/databind/JsonNode;", "sharedSchemas", "", "", "<init>", "(Lcom/fasterxml/jackson/databind/JsonNode;Ljava/util/Map;)V", "getTaskSchema", "()Lcom/fasterxml/jackson/databind/JsonNode;", "getSharedSchemas", "()Ljava/util/Map;", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class ChatTaskSchema
/*    */ {
/*    */   @NotNull
/*    */   private final JsonNode taskSchema;
/*    */   @NotNull
/*    */   private final Map<String, JsonNode> sharedSchemas;
/*    */   
/*    */   public ChatTaskSchema(@NotNull JsonNode taskSchema, @NotNull Map<String, JsonNode> sharedSchemas) {
/* 60 */     this.taskSchema = taskSchema;
/* 61 */     this.sharedSchemas = sharedSchemas; } @NotNull public final Map<String, JsonNode> getSharedSchemas() { return this.sharedSchemas; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final JsonNode getTaskSchema() {
/*    */     return this.taskSchema;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\ChatTaskSchema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */