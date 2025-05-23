/*    */ package ai.grazie.tasks.codegen.model;
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\b\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\005\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\n\020\r\032\0020\005*\0020\016J\n\020\017\032\0020\005*\0020\016J\n\020\020\032\0020\021*\0020\016J\f\020\022\032\0020\021*\0020\016H\007J\f\020\023\032\004\030\0010\005*\0020\016J\n\020\024\032\0020\021*\0020\016J\n\020\025\032\0020\005*\0020\016R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000R\016\020\007\032\0020\005XT¢\006\002\n\000R\026\020\b\032\0020\0058\006XT¢\006\b\n\000\022\004\b\t\020\003R\016\020\n\032\0020\005XT¢\006\002\n\000R\016\020\013\032\0020\005XT¢\006\002\n\000R\016\020\f\032\0020\005XT¢\006\002\n\000¨\006\026"}, d2 = {"Lai/grazie/tasks/codegen/model/TaskOpenApiExtensions;", "", "<init>", "()V", "INFO_NAMESPACE", "", "INFO_TASK_NAME", "INFO_EXPERIMENTAL", "INFO_DEPRECATED", "getINFO_DEPRECATED$annotations", "INFO_DEPRECATION_MESSAGE", "INFO_CHAT_TASK", "TASK_PARAMS_MARKER", "namespace", "Lio/swagger/v3/oas/models/OpenAPI;", "taskName", "isExperimentalTask", "", "isDeprecatedTask", "deprecationMessage", "isChatTask", "taskParamsSchemaName", "tasks-codegen-model"})
/*    */ @SourceDebugExtension({"SMAP\nTaskOpenApiExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskOpenApiExtensions.kt\nai/grazie/tasks/codegen/model/TaskOpenApiExtensions\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,33:1\n669#2,11:34\n*S KotlinDebug\n*F\n+ 1 TaskOpenApiExtensions.kt\nai/grazie/tasks/codegen/model/TaskOpenApiExtensions\n*L\n29#1:34,11\n*E\n"})
/*    */ public final class TaskOpenApiExtensions {
/*    */   @NotNull
/*    */   public static final TaskOpenApiExtensions INSTANCE = new TaskOpenApiExtensions();
/*    */   @NotNull
/*    */   public static final String INFO_NAMESPACE = "x-namespace";
/*    */   @NotNull
/*    */   public static final String INFO_TASK_NAME = "x-task-name";
/*    */   @NotNull
/*    */   public static final String INFO_EXPERIMENTAL = "x-experimental";
/*    */   
/*    */   @NotNull
/* 15 */   public final String namespace(@NotNull OpenAPI $this$namespace) { Intrinsics.checkNotNullParameter($this$namespace, "<this>"); Intrinsics.checkNotNull($this$namespace.getInfo().getExtensions().get("x-namespace"), "null cannot be cast to non-null type kotlin.String"); return (String)$this$namespace.getInfo().getExtensions().get("x-namespace"); } @NotNull public static final String INFO_DEPRECATED = "x-deprecated"; @NotNull public static final String INFO_DEPRECATION_MESSAGE = "x-deprecation-message"; @NotNull public static final String INFO_CHAT_TASK = "x-chat-task"; @NotNull
/*    */   public static final String TASK_PARAMS_MARKER = "x-task-parameters"; @NotNull
/* 17 */   public final String taskName(@NotNull OpenAPI $this$taskName) { Intrinsics.checkNotNullParameter($this$taskName, "<this>"); Intrinsics.checkNotNull($this$taskName.getInfo().getExtensions().get("x-task-name"), "null cannot be cast to non-null type kotlin.String"); return (String)$this$taskName.getInfo().getExtensions().get("x-task-name"); }
/*    */    public final boolean isExperimentalTask(@NotNull OpenAPI $this$isExperimentalTask) {
/* 19 */     Intrinsics.checkNotNullParameter($this$isExperimentalTask, "<this>"); Object object = $this$isExperimentalTask.getInfo().getExtensions().get("x-experimental"); (object instanceof Boolean) ? object : null; return (((object instanceof Boolean) ? object : null) != null) ? ((object instanceof Boolean) ? object : null).booleanValue() : false;
/*    */   }
/*    */   @Deprecated(message = "In favour of `deprecationMessage`, since 05 Feb 2025")
/* 22 */   public final boolean isDeprecatedTask(@NotNull OpenAPI $this$isDeprecatedTask) { Intrinsics.checkNotNullParameter($this$isDeprecatedTask, "<this>"); Object object = $this$isDeprecatedTask.getInfo().getExtensions().get("x-deprecated"); (object instanceof Boolean) ? object : null; return (((object instanceof Boolean) ? object : null) != null) ? ((object instanceof Boolean) ? object : null).booleanValue() : false; } @Nullable
/*    */   public final String deprecationMessage(@NotNull OpenAPI $this$deprecationMessage) {
/* 24 */     Intrinsics.checkNotNullParameter($this$deprecationMessage, "<this>"); Object object = $this$deprecationMessage.getInfo().getExtensions().get("x-deprecation-message"); return (object instanceof String) ? (String)object : null;
/*    */   } public final boolean isChatTask(@NotNull OpenAPI $this$isChatTask) {
/* 26 */     Intrinsics.checkNotNullParameter($this$isChatTask, "<this>"); Object object = $this$isChatTask.getInfo().getExtensions().get("x-chat-task"); (object instanceof Boolean) ? object : null; return (((object instanceof Boolean) ? object : null) != null) ? ((object instanceof Boolean) ? object : null).booleanValue() : false;
/*    */   } @NotNull
/*    */   public final String taskParamsSchemaName(@NotNull OpenAPI $this$taskParamsSchemaName) {
/* 29 */     Intrinsics.checkNotNullParameter($this$taskParamsSchemaName, "<this>"); Iterable $this$singleOrNull$iv = $this$taskParamsSchemaName.getComponents().getSchemas().entrySet(); int $i$f$singleOrNull = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 34 */     Object single$iv = null;
/* 35 */     boolean found$iv = false;
/* 36 */     for (Object element$iv : $this$singleOrNull$iv) {
/* 37 */       Map.Entry it = (Map.Entry)element$iv; int $i$a$-singleOrNull-TaskOpenApiExtensions$taskParamsSchemaName$taskParamsSchema$1 = 0;
/*    */ 
/*    */       
/*    */       ((Schema)it.getValue()).getExtensions();
/*    */     } 
/*    */     
/* 43 */     Map.Entry taskParamsSchema = !found$iv ? null : 
/* 44 */       (Map.Entry)single$iv;
/*    */     if (taskParamsSchema == null || (String)taskParamsSchema.getKey() == null) {
/*    */       (String)taskParamsSchema.getKey();
/*    */       throw new IllegalStateException(("Missing task parameters schema for " + taskName($this$taskParamsSchemaName)).toString());
/*    */     } 
/*    */     return (String)taskParamsSchema.getKey();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-codegen-model-0.4.32.jar!\ai\grazie\tasks\codegen\model\TaskOpenApiExtensions.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */