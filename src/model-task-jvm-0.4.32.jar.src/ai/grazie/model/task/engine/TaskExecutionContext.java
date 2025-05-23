/*    */ package ai.grazie.model.task.engine;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\006\n\002\020\002\n\002\b\003\030\0002\0020\001B\005¢\006\002\020\002J$\020\007\032\004\030\001H\b\"\004\b\000\020\b2\f\020\t\032\b\022\004\022\002H\b0\005H\002¢\006\002\020\nJ\037\020\013\032\002H\b\"\004\b\000\020\b2\f\020\t\032\b\022\004\022\002H\b0\005¢\006\002\020\nJ*\020\f\032\0020\r\"\004\b\000\020\b2\f\020\t\032\b\022\004\022\002H\b0\0052\006\020\016\032\002H\bH\002¢\006\002\020\017R6\020\003\032*\022\b\022\006\022\002\b\0030\005\022\006\022\004\030\0010\0010\004j\024\022\b\022\006\022\002\b\0030\005\022\006\022\004\030\0010\001`\006X\004¢\006\002\n\000¨\006\020"}, d2 = {"Lai/grazie/model/task/engine/TaskExecutionContext;", "", "()V", "parameters", "Ljava/util/HashMap;", "Lai/grazie/model/task/engine/TaskContextParam;", "Lkotlin/collections/HashMap;", "get", "T", "param", "(Lai/grazie/model/task/engine/TaskContextParam;)Ljava/lang/Object;", "getOrFail", "set", "", "value", "(Lai/grazie/model/task/engine/TaskContextParam;Ljava/lang/Object;)V", "model-task"})
/*    */ @SourceDebugExtension({"SMAP\nTaskExecutionContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskExecutionContext.kt\nai/grazie/model/task/engine/TaskExecutionContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
/*    */ public final class TaskExecutionContext {
/*    */   @NotNull
/*  6 */   private final HashMap<TaskContextParam<?>, Object> parameters = new HashMap<>();
/*    */   
/*    */   public final <T> void set(@NotNull TaskContextParam<?> param, Object value) {
/*  9 */     Intrinsics.checkNotNullParameter(param, "param"); this.parameters.put(param, value);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final <T> T get(@NotNull TaskContextParam param) {
/* 17 */     Intrinsics.checkNotNullParameter(param, "param"); Object it = this.parameters.get(param);
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
/* 29 */     int $i$a$-let-TaskExecutionContext$get$1 = 0;
/*    */     this.parameters.get(param);
/*    */     return (this.parameters.get(param) != null) ? (T)it : null;
/*    */   }
/*    */   
/*    */   public final <T> T getOrFail(@NotNull TaskContextParam<?> param) {
/*    */     Intrinsics.checkNotNullParameter(param, "param");
/*    */     if (get(param) == null) {
/*    */       get(param);
/*    */       throw new IllegalStateException((Reflection.getOrCreateKotlinClass(TaskExecutionContext.class).getSimpleName() + ": " + Reflection.getOrCreateKotlinClass(TaskExecutionContext.class).getSimpleName() + " not found in the context").toString());
/*    */     } 
/*    */     return (T)get(param);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\engine\TaskExecutionContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */