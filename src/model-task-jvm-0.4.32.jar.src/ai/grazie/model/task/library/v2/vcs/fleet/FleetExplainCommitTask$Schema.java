/*    */ package ai.grazie.model.task.library.v2.vcs.fleet;
/*    */ 
/*    */ import ai.grazie.model.task.id.TaskSchemaDescriptor;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\006\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\032\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\b\n\000\032\004\b\006\020\007R\021\020\b\032\0020\005¢\006\b\n\000\032\004\b\t\020\n¨\006\013"}, d2 = {"Lai/grazie/model/task/library/v2/vcs/fleet/FleetExplainCommitTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/model/task/library/v2/vcs/fleet/VcsCommitWithDiffListAttr;", "getAll", "()Ljava/util/List;", "commits", "getCommits", "()Lai/grazie/model/task/library/v2/vcs/fleet/VcsCommitWithDiffListAttr;", "model-task"})
/*    */ public final class Schema
/*    */   implements TaskSchemaDescriptor
/*    */ {
/*    */   @NotNull
/* 23 */   public static final Schema INSTANCE = new Schema(); @NotNull private static final VcsCommitWithDiffListAttr commits = new VcsCommitWithDiffListAttr("commits"); @NotNull public final VcsCommitWithDiffListAttr getCommits() { return commits; }
/*    */    @NotNull
/* 25 */   private static final List<VcsCommitWithDiffListAttr> all = CollectionsKt.listOf(commits); @NotNull public List<VcsCommitWithDiffListAttr> getAll() { return all; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\vcs\fleet\FleetExplainCommitTask$Schema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */