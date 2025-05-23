/*    */ package ai.grazie.model.task.id;
/*    */ 
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable(with = TaskName.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\004\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\030\002\n\002\030\002\n\002\b\004\b\007\030\000 \0202\0020\001:\002\020\021B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\023\020\007\032\0020\b2\b\020\t\032\004\030\0010\001H\002J\b\020\n\032\0020\013H\026J\016\020\f\032\0020\r2\006\020\f\032\0020\016J\b\020\017\032\0020\003H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\022"}, d2 = {"Lai/grazie/model/task/id/TaskName;", "", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "tag", "Lai/grazie/model/task/id/TaskID;", "Lai/grazie/model/task/id/TaskTag;", "toString", "Companion", "Serializer", "model-task"})
/*    */ public final class TaskName {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String name;
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/id/TaskName$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/id/TaskName;", "model-task"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<TaskName> serializer() {
/*    */       return (KSerializer<TaskName>)TaskName.Serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/* 24 */   public TaskName(@NotNull String name) { Intrinsics.checkNotNullExpressionValue(name.toLowerCase(Locale.ROOT), "toLowerCase(...)"); this.name = name.toLowerCase(Locale.ROOT);
/*    */     
/* 26 */     if (!(!StringsKt.contains$default(this.name, ":", false, 2, null) ? 1 : 0)) { int $i$a$-require-TaskName$1 = 0; String str = 
/* 27 */         "Task name may not contain semicolon";
/*    */       throw new IllegalArgumentException(str.toString()); }
/*    */      } @NotNull public final String getName() { return this.name; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/model/task/id/TaskName$Serializer;", "Lai/grazie/utils/StringValueClassSerializer;", "Lai/grazie/model/task/id/TaskName;", "()V", "model-task"}) public static final class Serializer extends StringValueClassSerializer<TaskName> {
/*    */     @NotNull
/* 31 */     public static final Serializer INSTANCE = new Serializer(); private Serializer() { super("TaskName", null.INSTANCE, null.INSTANCE); } }
/*    */   @NotNull
/* 33 */   public final TaskID tag(@NotNull TaskTag tag) { Intrinsics.checkNotNullParameter(tag, "tag"); return new TaskID(this, tag); } @NotNull
/*    */   public String toString() {
/* 35 */     return this.name;
/*    */   }
/*    */   public boolean equals(@Nullable Object other) {
/* 38 */     if (this == other) return true; 
/* 39 */     if (!(other instanceof TaskName)) return false;
/*    */     
/* 41 */     return Intrinsics.areEqual(this.name, ((TaskName)other).name);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 45 */     return this.name.hashCode();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\id\TaskName.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */