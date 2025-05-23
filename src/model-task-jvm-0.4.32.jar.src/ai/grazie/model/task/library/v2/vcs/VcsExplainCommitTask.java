/*    */ package ai.grazie.model.task.library.v2.vcs;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import ai.grazie.model.task.library.vcs.VcsLog;
/*    */ import ai.grazie.model.task.library.vcs.attributes.VcsLogAttr;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\0020\001:\001\013B\007\b\002¢\006\002\020\002J\016\020\007\032\0020\b2\006\020\t\032\0020\nR\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\f"}, d2 = {"Lai/grazie/model/task/library/v2/vcs/VcsExplainCommitTask;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "log", "Lai/grazie/model/task/library/vcs/VcsLog;", "Schema", "model-task"})
/*    */ public final class VcsExplainCommitTask implements TaskNameDescriptor {
/*    */   @NotNull
/* 13 */   public static final VcsExplainCommitTask INSTANCE = new VcsExplainCommitTask(); @NotNull private static final TaskName name = new TaskName("vcs-explain-commit"); @NotNull public TaskName getName() { return name; }
/*    */ 
/*    */   
/*    */   @NotNull
/* 17 */   public final TaskCall default(@NotNull VcsLog log) { Intrinsics.checkNotNullParameter(log, "log"); return new TaskCall(getName().tag(Default.INSTANCE.getTag()), TaskParameters.Companion.build(new VcsExplainCommitTask$default$1(log))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 18 */   static final class VcsExplainCommitTask$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)VcsExplainCommitTask.Schema.INSTANCE.getLog(), this.$log); }
/*    */     
/*    */     VcsExplainCommitTask$default$1(VcsLog $log) {
/*    */       super(1);
/*    */     } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\006\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\032\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\b\n\000\032\004\b\006\020\007R\021\020\b\032\0020\005¢\006\b\n\000\032\004\b\t\020\n¨\006\013"}, d2 = {"Lai/grazie/model/task/library/v2/vcs/VcsExplainCommitTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/model/task/library/vcs/attributes/VcsLogAttr;", "getAll", "()Ljava/util/List;", "log", "getLog", "()Lai/grazie/model/task/library/vcs/attributes/VcsLogAttr;", "model-task"})
/*    */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 25 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final VcsLogAttr log = new VcsLogAttr("log"); @NotNull public final VcsLogAttr getLog() { return log; }
/*    */      @NotNull
/* 27 */     private static final List<VcsLogAttr> all = CollectionsKt.listOf(log); @NotNull public List<VcsLogAttr> getAll() { return all; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\vcs\VcsExplainCommitTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */