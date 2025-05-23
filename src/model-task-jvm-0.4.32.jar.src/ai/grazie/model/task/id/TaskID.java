/*    */ package ai.grazie.model.task.id;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable(with = TaskID.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\002\b\004\b\b\030\000 \0262\0020\001:\002\026\027B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\013\032\0020\003HÆ\003J\t\020\f\032\0020\005HÆ\003J\035\020\r\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\022HÖ\001J\006\020\023\032\0020\024J\b\020\025\032\0020\024H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\t\020\n¨\006\030"}, d2 = {"Lai/grazie/model/task/id/TaskID;", "", "name", "Lai/grazie/model/task/id/TaskName;", "tag", "Lai/grazie/model/task/id/TaskTag;", "(Lai/grazie/model/task/id/TaskName;Lai/grazie/model/task/id/TaskTag;)V", "getName", "()Lai/grazie/model/task/id/TaskName;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "id", "", "toString", "Companion", "Serializer", "model-task"})
/*    */ public final class TaskID {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/* 14 */   public TaskID(@NotNull TaskName name, @NotNull TaskTag tag) { this.name = name; this.tag = tag; } @NotNull private final TaskName name; @NotNull private final TaskTag tag; @NotNull public final TaskName getName() { return this.name; } @NotNull public final TaskTag getTag() { return this.tag; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\021\020\003\032\0020\0042\006\020\005\032\0020\006H\002J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001¨\006\t"}, d2 = {"Lai/grazie/model/task/id/TaskID$Companion;", "", "()V", "invoke", "Lai/grazie/model/task/id/TaskID;", "id", "", "serializer", "Lkotlinx/serialization/KSerializer;", "model-task"}) public static final class Companion { private Companion() {} @NotNull
/* 15 */     public final KSerializer<TaskID> serializer() { return (KSerializer<TaskID>)TaskID.Serializer.INSTANCE; } @NotNull
/*    */     public final TaskID invoke(@NotNull String id) {
/* 17 */       Intrinsics.checkNotNullParameter(id, "id"); String[] arrayOfString = new String[1]; arrayOfString[0] = ":"; List<String> parts = StringsKt.split$default(id, arrayOfString, false, 0, 6, null);
/* 18 */       if (!((parts.size() == 2) ? 1 : 0)) { int $i$a$-require-TaskID$Companion$invoke$1 = 0; String str = 
/* 19 */           "Id be in format name:version and without any additional semicolons"; throw new IllegalArgumentException(str.toString()); }
/*    */       
/* 21 */       String name = parts.get(0), tag = parts.get(1);
/* 22 */       return new TaskID(new TaskName(name), new TaskTag(tag));
/*    */     } }
/*    */   
/*    */   @NotNull
/* 26 */   public final String id() { return toString(); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/model/task/id/TaskID$Serializer;", "Lai/grazie/utils/StringValueClassSerializer;", "Lai/grazie/model/task/id/TaskID;", "()V", "model-task"})
/*    */   public static final class Serializer extends StringValueClassSerializer<TaskID> { @NotNull
/* 28 */     public static final Serializer INSTANCE = new Serializer(); private Serializer() { super("TaskID", null.INSTANCE, null.INSTANCE); } } @NotNull
/*    */   public String toString() {
/* 30 */     return "" + this.name + ":" + this.name;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TaskName component1() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TaskTag component2() {
/*    */     return this.tag;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TaskID copy(@NotNull TaskName name, @NotNull TaskTag tag) {
/*    */     Intrinsics.checkNotNullParameter(name, "name");
/*    */     Intrinsics.checkNotNullParameter(tag, "tag");
/*    */     return new TaskID(name, tag);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.name.hashCode();
/*    */     return result * 31 + this.tag.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TaskID))
/*    */       return false; 
/*    */     TaskID taskID = (TaskID)other;
/*    */     return !Intrinsics.areEqual(this.name, taskID.name) ? false : (!!Intrinsics.areEqual(this.tag, taskID.tag));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\id\TaskID.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */