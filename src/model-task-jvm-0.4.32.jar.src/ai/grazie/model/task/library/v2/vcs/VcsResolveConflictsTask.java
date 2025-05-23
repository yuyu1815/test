/*    */ package ai.grazie.model.task.library.v2.vcs;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import java.util.List;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\002\bÇ\002\030\0002\0020\001:\001\020B\007\b\002¢\006\002\020\002J,\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\n2\006\020\f\032\0020\n2\f\020\r\032\b\022\004\022\0020\0170\016R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\021"}, d2 = {"Lai/grazie/model/task/library/v2/vcs/VcsResolveConflictsTask;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "leftContent", "", "rightContent", "baseContent", "mergeConflictRanges", "", "Lai/grazie/model/task/library/v2/vcs/MergeConflictRanges;", "Schema", "model-task"})
/*    */ public final class VcsResolveConflictsTask implements TaskNameDescriptor {
/*    */   @NotNull
/* 12 */   public static final VcsResolveConflictsTask INSTANCE = new VcsResolveConflictsTask(); @NotNull private static final TaskName name = new TaskName("vcs-resolve-conflicts"); @NotNull public TaskName getName() { return name; }
/*    */ 
/*    */   
/*    */   @NotNull
/* 16 */   public final TaskCall default(@NotNull String leftContent, @NotNull String rightContent, @NotNull String baseContent, @NotNull List<MergeConflictRanges> mergeConflictRanges) { Intrinsics.checkNotNullParameter(leftContent, "leftContent"); Intrinsics.checkNotNullParameter(rightContent, "rightContent"); Intrinsics.checkNotNullParameter(baseContent, "baseContent"); Intrinsics.checkNotNullParameter(mergeConflictRanges, "mergeConflictRanges"); return new TaskCall(getName().tag(Default.INSTANCE.getTag()), TaskParameters.Companion.build(new VcsResolveConflictsTask$default$1(leftContent, rightContent, baseContent, mergeConflictRanges))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 17 */   static final class VcsResolveConflictsTask$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)VcsResolveConflictsTask.Schema.INSTANCE.getLeftContent(), this.$leftContent);
/* 18 */       $this$build.add((AttributeDescriptor)VcsResolveConflictsTask.Schema.INSTANCE.getRightContent(), this.$rightContent);
/* 19 */       $this$build.add((AttributeDescriptor)VcsResolveConflictsTask.Schema.INSTANCE.getBaseContent(), this.$baseContent);
/* 20 */       $this$build.add((AttributeDescriptor)VcsResolveConflictsTask.Schema.INSTANCE.getMergeConflicts(), this.$mergeConflictRanges); }
/*    */     
/*    */     VcsResolveConflictsTask$default$1(String $leftContent, String $rightContent, String $baseContent, List<MergeConflictRanges> $mergeConflictRanges) {
/*    */       super(1);
/*    */     } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R2\020\003\032 \022\034\022\032\022\006\b\001\022\0020\006\022\006\b\001\022\0020\007\022\006\b\001\022\0020\b0\0050\004X\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\r\020\016R\021\020\017\032\0020\f¢\006\b\n\000\032\004\b\020\020\016R\021\020\021\032\0020\022¢\006\b\n\000\032\004\b\023\020\024R\021\020\025\032\0020\f¢\006\b\n\000\032\004\b\026\020\016¨\006\027"}, d2 = {"Lai/grazie/model/task/library/v2/vcs/VcsResolveConflictsTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key;", "Lai/grazie/utils/attributes/Attributes$Value;", "", "getAll", "()Ljava/util/List;", "baseContent", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getBaseContent", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "leftContent", "getLeftContent", "mergeConflicts", "Lai/grazie/model/task/library/v2/vcs/VcsConflictsListAttr;", "getMergeConflicts", "()Lai/grazie/model/task/library/v2/vcs/VcsConflictsListAttr;", "rightContent", "getRightContent", "model-task"})
/*    */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 27 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text leftContent = new AttributeDescriptor.Text("leftContent"); @NotNull public final AttributeDescriptor.Text getLeftContent() { return leftContent; } @NotNull
/* 28 */     private static final AttributeDescriptor.Text rightContent = new AttributeDescriptor.Text("rightContent"); @NotNull public final AttributeDescriptor.Text getRightContent() { return rightContent; } @NotNull
/* 29 */     private static final AttributeDescriptor.Text baseContent = new AttributeDescriptor.Text("baseContent"); @NotNull public final AttributeDescriptor.Text getBaseContent() { return baseContent; } @NotNull
/* 30 */     private static final VcsConflictsListAttr mergeConflicts = new VcsConflictsListAttr("conflicts"); @NotNull private static final List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> all; @NotNull public final VcsConflictsListAttr getMergeConflicts() { return mergeConflicts; }
/*    */     @NotNull
/* 32 */     public List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> getAll() { return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[4]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)leftContent; arrayOfAttributeDescriptor[1] = (AttributeDescriptor)rightContent; arrayOfAttributeDescriptor[2] = (AttributeDescriptor)baseContent; arrayOfAttributeDescriptor[3] = (AttributeDescriptor)mergeConflicts; all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\vcs\VcsResolveConflictsTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */