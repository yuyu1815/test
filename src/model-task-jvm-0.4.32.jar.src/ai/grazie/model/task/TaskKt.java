/*    */ package ai.grazie.model.task;
/*    */ 
/*    */ import ai.grazie.model.task.engine.TaskEnvironment;
/*    */ import ai.grazie.model.task.id.TaskID;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import ai.grazie.model.task.id.TaskTag;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000(\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\032\n\020\000\032\0020\001*\0020\002\032\n\020\003\032\0020\004*\0020\002\032\022\020\005\032\0020\004*\0020\0022\006\020\006\032\0020\007\032\n\020\b\032\0020\004*\0020\002\032\n\020\t\032\0020\004*\0020\002\032\n\020\n\032\0020\013*\0020\002\032\n\020\f\032\0020\r*\0020\002¨\006\016"}, d2 = {"id", "Lai/grazie/model/task/id/TaskID;", "Lai/grazie/model/task/Task;", "isExperimental", "", "isHidden", "env", "Lai/grazie/model/task/engine/TaskEnvironment;", "isInternal", "isStable", "name", "Lai/grazie/model/task/id/TaskName;", "tag", "Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*    */ public final class TaskKt
/*    */ {
/*    */   @NotNull
/*    */   public static final TaskName name(@NotNull Task $this$name) {
/* 17 */     Intrinsics.checkNotNullParameter($this$name, "<this>"); return $this$name.getNameDescriptor().getName();
/*    */   } @NotNull
/* 19 */   public static final TaskTag tag(@NotNull Task $this$tag) { Intrinsics.checkNotNullParameter($this$tag, "<this>"); return $this$tag.getTagDescriptor().getTag(); } @NotNull
/*    */   public static final TaskID id(@NotNull Task $this$id) {
/* 21 */     Intrinsics.checkNotNullParameter($this$id, "<this>"); return name($this$id).tag(tag($this$id));
/*    */   } public static final boolean isStable(@NotNull Task $this$isStable) {
/* 23 */     Intrinsics.checkNotNullParameter($this$isStable, "<this>"); return $this$isStable.getTagDescriptor() instanceof ai.grazie.model.task.id.TaskTagDescriptor.Stable;
/*    */   }
/*    */   public static final boolean isExperimental(@NotNull Task $this$isExperimental) {
/* 26 */     Intrinsics.checkNotNullParameter($this$isExperimental, "<this>"); return $this$isExperimental.getTagDescriptor() instanceof ai.grazie.model.task.id.TaskTagDescriptor.Experimental;
/*    */   }
/*    */   public static final boolean isHidden(@NotNull Task $this$isHidden, @NotNull TaskEnvironment env) {
/* 29 */     Intrinsics.checkNotNullParameter($this$isHidden, "<this>"); Intrinsics.checkNotNullParameter(env, "env"); return (!env.isExperimental() && $this$isHidden.getTagDescriptor() instanceof ai.grazie.model.task.id.Hidden);
/*    */   }
/*    */   public static final boolean isInternal(@NotNull Task $this$isInternal) {
/* 32 */     Intrinsics.checkNotNullParameter($this$isInternal, "<this>"); return $this$isInternal.getTagDescriptor() instanceof ai.grazie.model.task.id.Internal;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\TaskKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */