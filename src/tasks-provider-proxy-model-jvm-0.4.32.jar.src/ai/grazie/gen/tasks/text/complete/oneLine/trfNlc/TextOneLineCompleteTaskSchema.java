/*   */ package ai.grazie.gen.tasks.text.complete.oneLine.trfNlc;
/*   */ 
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/gen/tasks/text/complete/oneLine/trfNlc/TextOneLineCompleteTaskSchema;", "", "()V", "taskSchema", "Lai/grazie/model/task/validation/TaskSchema;", "getTaskSchema", "()Lai/grazie/model/task/validation/TaskSchema;", "tasks-provider-proxy-model"})
/*   */ public final class TextOneLineCompleteTaskSchema {
/*   */   @NotNull
/* 8 */   public final TaskSchema getTaskSchema() { return taskSchema; } @NotNull
/* 9 */   public static final TextOneLineCompleteTaskSchema INSTANCE = new TextOneLineCompleteTaskSchema(); @NotNull private static final TaskSchema taskSchema = (TaskSchema)new JsonTaskSchema(JsonSchemaReader.INSTANCE.readSchema(INSTANCE.getClass(), "simpleTasksLibrary/tasks/text/complete/one-line/trf-nlc/parameters.yaml"));
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-proxy-model-jvm-0.4.32.jar!\ai\grazie\gen\tasks\text\complete\oneLine\trfNlc\TextOneLineCompleteTaskSchema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */