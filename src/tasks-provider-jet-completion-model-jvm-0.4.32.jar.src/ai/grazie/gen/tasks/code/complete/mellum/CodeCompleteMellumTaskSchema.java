/*   */ package ai.grazie.gen.tasks.code.complete.mellum;
/*   */ 
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/gen/tasks/code/complete/mellum/CodeCompleteMellumTaskSchema;", "", "()V", "taskSchema", "Lai/grazie/model/task/validation/TaskSchema;", "getTaskSchema", "()Lai/grazie/model/task/validation/TaskSchema;", "tasks-provider-jet-completion-model"})
/*   */ public final class CodeCompleteMellumTaskSchema {
/*   */   @NotNull
/* 8 */   public final TaskSchema getTaskSchema() { return taskSchema; } @NotNull
/* 9 */   public static final CodeCompleteMellumTaskSchema INSTANCE = new CodeCompleteMellumTaskSchema(); @NotNull private static final TaskSchema taskSchema = (TaskSchema)new JsonTaskSchema(JsonSchemaReader.INSTANCE.readSchema(INSTANCE.getClass(), "simpleTasksLibrary/tasks/code/complete/mellum/parameters.yaml"));
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-jet-completion-model-jvm-0.4.32.jar!\ai\grazie\gen\tasks\code\complete\mellum\CodeCompleteMellumTaskSchema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */