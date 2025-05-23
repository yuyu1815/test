/*    */ package ai.grazie.tasks.provider.schema.json;
/*    */ 
/*    */ import ai.grazie.model.task.validation.TaskSchemaValidationResult;
/*    */ import ai.grazie.utils.data.DataHolder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\030\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lai/grazie/tasks/provider/schema/json/JsonTaskSchema;", "Lai/grazie/model/task/validation/TaskSchema;", "taskSchema", "Lcom/fasterxml/jackson/databind/JsonNode;", "<init>", "(Lcom/fasterxml/jackson/databind/JsonNode;)V", "validateParameters", "Lai/grazie/model/task/validation/TaskSchemaValidationResult;", "parameters", "Lai/grazie/utils/data/DataHolder;", "context", "Lai/grazie/model/task/engine/TasksRegistry;", "tasks-provider-task-schema"})
/*    */ @SourceDebugExtension({"SMAP\nJsonTaskSchema.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonTaskSchema.kt\nai/grazie/tasks/provider/schema/json/JsonTaskSchema\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,16:1\n1#2:17\n*E\n"})
/*    */ public final class JsonTaskSchema implements TaskSchema {
/* 10 */   public JsonTaskSchema(@NotNull JsonNode taskSchema) { this.taskSchema = taskSchema; } @NotNull
/*    */   private final JsonNode taskSchema; @NotNull
/*    */   public TaskSchemaValidationResult validateParameters(@NotNull DataHolder parameters, @NotNull TasksRegistry context) {
/* 13 */     Intrinsics.checkNotNullParameter(parameters, "parameters"); Intrinsics.checkNotNullParameter(context, "context"); String it = JsonSchemaValidator.verify$default(JsonSchemaValidator.INSTANCE, parameters, this.taskSchema, null, 4, null);
/*    */ 
/*    */ 
/*    */     
/* 17 */     int $i$a$-let-JsonTaskSchema$validateParameters$1 = 0;
/*    */     JsonSchemaValidator.verify$default(JsonSchemaValidator.INSTANCE, parameters, this.taskSchema, null, 4, null);
/*    */     return (JsonSchemaValidator.verify$default(JsonSchemaValidator.INSTANCE, parameters, this.taskSchema, null, 4, null) != null) ? (TaskSchemaValidationResult)new TaskSchemaValidationResult.Failure(it) : (TaskSchemaValidationResult)TaskSchemaValidationResult.Ok.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-task-schema-0.4.32.jar!\ai\grazie\tasks\provider\schema\json\JsonTaskSchema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */