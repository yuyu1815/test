/*    */ package ai.grazie.model.task.library.v2.vcs;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import ai.grazie.model.task.library.vcs.VcsCommit;
/*    */ import ai.grazie.model.task.library.vcs.attributes.VcsCommitListAttr;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\002\bÇ\002\030\0002\0020\001:\001\fB\007\b\002¢\006\002\020\002J\024\020\007\032\0020\b2\f\020\t\032\b\022\004\022\0020\0130\nR\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\r"}, d2 = {"Lai/grazie/model/task/library/v2/vcs/VcsGenerateUpdateSummaryTask;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "commits", "", "Lai/grazie/model/task/library/vcs/VcsCommit;", "Schema", "model-task"})
/*    */ public final class VcsGenerateUpdateSummaryTask implements TaskNameDescriptor {
/*    */   @NotNull
/* 13 */   public static final VcsGenerateUpdateSummaryTask INSTANCE = new VcsGenerateUpdateSummaryTask(); @NotNull private static final TaskName name = new TaskName("vcs-generate-update-summary"); @NotNull public TaskName getName() { return name; }
/*    */ 
/*    */   
/*    */   @NotNull
/* 17 */   public final TaskCall default(@NotNull List<VcsCommit> commits) { Intrinsics.checkNotNullParameter(commits, "commits"); return new TaskCall(getName().tag(Default.INSTANCE.getTag()), TaskParameters.Companion.build(new VcsGenerateUpdateSummaryTask$default$1(commits))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 18 */   static final class VcsGenerateUpdateSummaryTask$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)VcsGenerateUpdateSummaryTask.Schema.INSTANCE.getCommits(), this.$commits); }
/*    */     
/*    */     VcsGenerateUpdateSummaryTask$default$1(List<VcsCommit> $commits) {
/*    */       super(1);
/*    */     } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\006\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\032\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\b\n\000\032\004\b\006\020\007R\021\020\b\032\0020\005¢\006\b\n\000\032\004\b\t\020\n¨\006\013"}, d2 = {"Lai/grazie/model/task/library/v2/vcs/VcsGenerateUpdateSummaryTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/model/task/library/vcs/attributes/VcsCommitListAttr;", "getAll", "()Ljava/util/List;", "commits", "getCommits", "()Lai/grazie/model/task/library/vcs/attributes/VcsCommitListAttr;", "model-task"})
/*    */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 25 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final VcsCommitListAttr commits = new VcsCommitListAttr("commits"); @NotNull public final VcsCommitListAttr getCommits() { return commits; }
/*    */      @NotNull
/* 27 */     private static final List<VcsCommitListAttr> all = CollectionsKt.listOf(commits); @NotNull public List<VcsCommitListAttr> getAll() { return all; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\vcs\VcsGenerateUpdateSummaryTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */