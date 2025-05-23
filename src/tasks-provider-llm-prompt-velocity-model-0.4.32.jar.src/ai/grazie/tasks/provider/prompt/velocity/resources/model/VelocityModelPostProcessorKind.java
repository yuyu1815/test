/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.model;
/*    */ import kotlin.enums.EnumEntries;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\t\b\002\030\0002\b\022\004\022\0020\0000\001B\021\b\002\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\026\020\002\032\0020\0038\006X\004¢\006\b\n\000\032\004\b\006\020\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013¨\006\f"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorKind;", "", "jsonValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJsonValue", "()Ljava/lang/String;", "RemoveQuotes", "RemovePrefix", "RemovePlainSurroundings", "RemoveRegexpSurroundings", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public enum VelocityModelPostProcessorKind {
/*  7 */   RemoveQuotes("remove-quotes"),
/*  8 */   RemovePrefix("remove-prefix"),
/*  9 */   RemovePlainSurroundings("remove-surroundings"),
/* 10 */   RemoveRegexpSurroundings("remove-regexp-surroundings"); @JsonValue
/*    */   @NotNull
/*    */   private final String jsonValue; @NotNull
/* 13 */   public static EnumEntries<VelocityModelPostProcessorKind> getEntries() { return $ENTRIES; }
/*    */ 
/*    */   
/*    */   VelocityModelPostProcessorKind(String jsonValue) {
/*    */     this.jsonValue = jsonValue;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getJsonValue() {
/*    */     return this.jsonValue;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelPostProcessorKind.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */