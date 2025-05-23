/*    */ package ai.grazie.model.task.library.v2.vcs.mr;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\003\bÇ\002\030\0002\0020\001:\001\fB\007\b\002¢\006\002\020\002J\026\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\nR\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\r"}, d2 = {"Lai/grazie/model/task/library/v2/vcs/mr/VcsDetermineMrCommentTypeTask;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "comment", "", "codeFragment", "Schema", "model-task"})
/*    */ public final class VcsDetermineMrCommentTypeTask implements TaskNameDescriptor {
/*    */   @NotNull
/* 12 */   public static final VcsDetermineMrCommentTypeTask INSTANCE = new VcsDetermineMrCommentTypeTask(); @NotNull private static final TaskName name = new TaskName("vcs-determine-mr-comment-type"); @NotNull public TaskName getName() { return name; }
/*    */   
/*    */   @NotNull
/* 15 */   public final TaskCall default(@NotNull String comment, @NotNull String codeFragment) { Intrinsics.checkNotNullParameter(comment, "comment"); Intrinsics.checkNotNullParameter(codeFragment, "codeFragment"); return new TaskCall(
/* 16 */         getName().tag(Default.INSTANCE.getTag()), 
/* 17 */         TaskParameters.Companion.build(new VcsDetermineMrCommentTypeTask$default$1(comment, codeFragment))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 18 */   static final class VcsDetermineMrCommentTypeTask$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)VcsDetermineMrCommentTypeTask.Schema.INSTANCE.getComment(), this.$comment);
/* 19 */       $this$build.add((AttributeDescriptor)VcsDetermineMrCommentTypeTask.Schema.INSTANCE.getCodeFragment(), this.$codeFragment); }
/*    */      VcsDetermineMrCommentTypeTask$default$1(String $comment, String $codeFragment) {
/*    */       super(1);
/*    */     } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\t\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R \020\003\032\b\022\004\022\0020\0050\004X\004¢\006\016\n\000\022\004\b\006\020\002\032\004\b\007\020\bR\021\020\t\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\021\020\f\032\0020\005¢\006\b\n\000\032\004\b\r\020\013¨\006\016"}, d2 = {"Lai/grazie/model/task/library/v2/vcs/mr/VcsDetermineMrCommentTypeTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getAll$annotations", "getAll", "()Ljava/util/List;", "codeFragment", "getCodeFragment", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "comment", "getComment", "model-task"})
/*    */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 25 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text comment = new AttributeDescriptor.Text("comment"); @NotNull public final AttributeDescriptor.Text getComment() { return comment; } @NotNull
/* 26 */     private static final AttributeDescriptor.Text codeFragment = new AttributeDescriptor.Text("codeFragment"); @NotNull private static final List<AttributeDescriptor.Text> all; @NotNull public final AttributeDescriptor.Text getCodeFragment() { return codeFragment; }
/*    */     
/*    */     @NotNull
/* 29 */     public List<AttributeDescriptor.Text> getAll() { return all; } static { AttributeDescriptor.Text[] arrayOfText = new AttributeDescriptor.Text[2]; arrayOfText[0] = comment; arrayOfText[1] = codeFragment; all = CollectionsKt.listOf((Object[])arrayOfText); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\vcs\mr\VcsDetermineMrCommentTypeTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */