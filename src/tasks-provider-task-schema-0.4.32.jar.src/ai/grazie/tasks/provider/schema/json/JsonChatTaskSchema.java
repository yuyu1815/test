/*     */ package ai.grazie.tasks.provider.schema.json;
/*     */ 
/*     */ import ai.grazie.model.task.library.v2.chat.TasksChat;
/*     */ import ai.grazie.model.task.validation.TaskSchemaValidationResult;
/*     */ import ai.grazie.utils.data.DataHolder;
/*     */ import ai.grazie.utils.json.JSON;
/*     */ import com.fasterxml.jackson.databind.JsonNode;
/*     */ import com.networknt.schema.JsonSchemaFactory;
/*     */ import kotlinx.serialization.json.JsonElement;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020$\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\030\0002\0020\001B#\022\006\020\002\032\0020\003\022\022\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0030\005¢\006\004\b\007\020\bJ\030\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\016H\026J\030\020\017\032\0020\n2\006\020\020\032\0020\0212\006\020\r\032\0020\016H\002J\020\020\022\032\0020\0232\006\020\024\032\0020\025H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\032\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0030\005X\004¢\006\002\n\000¨\006\026"}, d2 = {"Lai/grazie/tasks/provider/schema/json/JsonChatTaskSchema;", "Lai/grazie/model/task/validation/TaskSchema;", "taskSchema", "Lcom/fasterxml/jackson/databind/JsonNode;", "sharedSchemas", "", "", "<init>", "(Lcom/fasterxml/jackson/databind/JsonNode;Ljava/util/Map;)V", "validateParameters", "Lai/grazie/model/task/validation/TaskSchemaValidationResult;", "parameters", "Lai/grazie/utils/data/DataHolder;", "context", "Lai/grazie/model/task/engine/TasksRegistry;", "verifyTaskCall", "message", "Lai/grazie/model/task/library/v2/chat/TasksChatTaskCallMessage;", "customizer", "", "builder", "Lcom/networknt/schema/JsonSchemaFactory$Builder;", "tasks-provider-task-schema"})
/*     */ @SourceDebugExtension({"SMAP\nJsonChatTaskSchema.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonChatTaskSchema.kt\nai/grazie/tasks/provider/schema/json/JsonChatTaskSchema\n+ 2 DataHolder.kt\nai/grazie/utils/data/DataHolderKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 JSON.kt\nai/grazie/utils/json/JSON\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,78:1\n101#2,5:79\n106#2,6:85\n112#2,2:92\n101#2,5:97\n106#2,6:103\n112#2,2:110\n1#3:84\n1#3:102\n1#3:112\n66#4:91\n66#4:109\n13467#5,3:94\n*S KotlinDebug\n*F\n+ 1 JsonChatTaskSchema.kt\nai/grazie/tasks/provider/schema/json/JsonChatTaskSchema\n*L\n28#1:79,5\n28#1:85,6\n28#1:92,2\n54#1:97,5\n54#1:103,6\n54#1:110,2\n28#1:84\n54#1:102\n28#1:91\n54#1:109\n35#1:94,3\n*E\n"})
/*     */ public final class JsonChatTaskSchema implements TaskSchema {
/*     */   @NotNull
/*     */   private final JsonNode taskSchema;
/*     */   
/*  17 */   public JsonChatTaskSchema(@NotNull JsonNode taskSchema, @NotNull Map<String, JsonNode> sharedSchemas) { this.taskSchema = taskSchema;
/*  18 */     this.sharedSchemas = sharedSchemas; } @NotNull
/*     */   private final Map<String, JsonNode> sharedSchemas; @NotNull
/*     */   public TaskSchemaValidationResult validateParameters(@NotNull DataHolder parameters, @NotNull TasksRegistry context) {
/*     */     TasksChat tasksChat1;
/*  22 */     Intrinsics.checkNotNullParameter(parameters, "parameters"); Intrinsics.checkNotNullParameter(context, "context"); String highLevelError = JsonSchemaValidator.INSTANCE.verify(parameters, this.taskSchema, new JsonChatTaskSchema$validateParameters$highLevelError$1(this));
/*  23 */     if (highLevelError != null) {
/*  24 */       return (TaskSchemaValidationResult)new TaskSchemaValidationResult.Failure(highLevelError);
/*     */     }
/*     */     
/*     */     try { Object object;
/*  28 */       DataHolder dataHolder = parameters; String key$iv = "history";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  79 */       boolean failIfNotFound$iv = true; int $i$f$getValue = 0;
/*  80 */       JsonElement jsonElement$iv = (JsonElement)dataHolder.get(key$iv);
/*  81 */       JsonElement jsonElement1 = jsonElement$iv;
/*  82 */       if (jsonElement1 == null) {
/*     */         
/*  84 */         int $i$a$-require-DataHolderKt$getValue$1$iv = 0;
/*     */         
/*     */         String str = "Failed to find parameter '" + key$iv + "'";
/*     */         throw new IllegalArgumentException(str.toString());
/*     */       } 
/*     */       
/*  90 */       try { JSON this_$iv$iv = (JSON)JSON.Default.INSTANCE; int $i$f$parse = 0;
/*  91 */         object = this_$iv$iv.parse((DeserializationStrategy)TasksChat.Companion.serializer(), jsonElement$iv); }
/*  92 */       catch (Exception e$iv)
/*  93 */       { throw new IllegalArgumentException("Failed to read parameter '" + key$iv + "' as " + Reflection.getOrCreateKotlinClass(TasksChat.class).getSimpleName(), (Throwable)e$iv); }  Intrinsics.checkNotNull((jsonElement1 instanceof kotlinx.serialization.json.JsonNull) ? null : (TasksChat)object); tasksChat1 = (jsonElement1 instanceof kotlinx.serialization.json.JsonNull) ? null : (TasksChat)object; } catch (Exception e) { return (TaskSchemaValidationResult)new TaskSchemaValidationResult.Failure(": Malformed property 'history'"); }
/*  94 */      TasksChat history = tasksChat1; TasksChatMessage[] arrayOfTasksChatMessage = history.getMessages(); int $i$f$forEachIndexed = 0; int index$iv = 0;
/*  95 */     byte b = 0; int i = arrayOfTasksChatMessage.length; if (b < i) { DataHolder dataHolder1; Object item$iv = arrayOfTasksChatMessage[b], object1 = item$iv; int index = index$iv++, $i$a$-forEachIndexed-JsonChatTaskSchema$validateParameters$1 = 0; try { dataHolder1 = TaskParametersKt.toDataHolder(((TasksChatTaskMessage)object1).getParameters()); } catch (Exception e) { return (TaskSchemaValidationResult)new TaskSchemaValidationResult.Failure(".history[" + index + "]: malformed property 'parameters'"); }
/*     */        DataHolder taskParams = dataHolder1; }
/*  97 */      try { Object object; DataHolder dataHolder = parameters; String key$iv = "functions"; boolean failIfNotFound$iv = true; int $i$f$getValue = 0;
/*  98 */       JsonElement jsonElement$iv = (JsonElement)dataHolder.get(key$iv);
/*  99 */       JsonElement jsonElement1 = jsonElement$iv;
/* 100 */       if (jsonElement1 == null) {
/*     */         
/* 102 */         int $i$a$-require-DataHolderKt$getValue$1$iv = 0;
/*     */         
/*     */         String str = "Failed to find parameter '" + key$iv + "'";
/*     */         throw new IllegalArgumentException(str.toString());
/*     */       } 
/*     */       
/* 108 */       try { JSON this_$iv$iv = (JSON)JSON.Default.INSTANCE; int $i$f$parse = 0;
/* 109 */         object = this_$iv$iv.parse((DeserializationStrategy)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE), jsonElement$iv); }
/* 110 */       catch (Exception e$iv)
/* 111 */       { throw new IllegalArgumentException("Failed to read parameter '" + key$iv + "' as " + Reflection.getOrCreateKotlinClass(List.class).getSimpleName(), (Throwable)e$iv); }  Intrinsics.checkNotNull((jsonElement1 instanceof kotlinx.serialization.json.JsonNull) ? null : (List)object); (List)((jsonElement1 instanceof kotlinx.serialization.json.JsonNull) ? null : (List)object); } catch (Exception e) { return (TaskSchemaValidationResult)new TaskSchemaValidationResult.Failure(": Malformed property 'functions'"); }  return (TaskSchemaValidationResult)TaskSchemaValidationResult.Ok.INSTANCE; } private final TaskSchemaValidationResult verifyTaskCall(TasksChatTaskCallMessage message, TasksRegistry context) { Task task; if (context.get(TasksChatMessageKt.taskId(message)) == null) { context.get(TasksChatMessageKt.taskId(message)); return (TaskSchemaValidationResult)new TaskSchemaValidationResult.Failure(": Unknown task '" + TasksChatMessageKt.taskId(message) + "'"); }  return task.getSchema().validateParameters(message.getParameters(), context); } private final void customizer(JsonSchemaFactory.Builder builder) { builder.schemaLoaders(this::customizer$lambda$3); } private static final void customizer$lambda$3(JsonChatTaskSchema this$0, SchemaLoaders.Builder it) { it.schemas(this$0::customizer$lambda$3$lambda$2); }
/* 112 */   private static final String customizer$lambda$3$lambda$2(JsonChatTaskSchema this$0, String ref) { Intrinsics.checkNotNull(ref); JsonNode it = this$0.sharedSchemas.get(StringsKt.substringAfterLast$default(ref, '/', null, 2, null)); int $i$a$-let-JsonChatTaskSchema$customizer$1$1$1 = 0;
/*     */     (JsonNode)this$0.sharedSchemas.get(StringsKt.substringAfterLast$default(ref, '/', null, 2, null));
/*     */     return ((JsonNode)this$0.sharedSchemas.get(StringsKt.substringAfterLast$default(ref, '/', null, 2, null)) != null) ? (new ObjectMapper()).writeValueAsString(it) : null; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-task-schema-0.4.32.jar!\ai\grazie\tasks\provider\schema\json\JsonChatTaskSchema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */