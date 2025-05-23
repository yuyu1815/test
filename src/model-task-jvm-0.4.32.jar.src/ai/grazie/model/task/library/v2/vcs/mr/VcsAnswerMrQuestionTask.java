/*    */ package ai.grazie.model.task.library.v2.vcs.mr;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\004\bÇ\002\030\0002\0020\001:\001\rB\007\b\002¢\006\002\020\002J\036\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\n2\006\020\f\032\0020\nR\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\016"}, d2 = {"Lai/grazie/model/task/library/v2/vcs/mr/VcsAnswerMrQuestionTask;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "comment", "", "codeFragment", "fileText", "Schema", "model-task"})
/*    */ public final class VcsAnswerMrQuestionTask implements TaskNameDescriptor {
/*    */   @NotNull
/* 12 */   public static final VcsAnswerMrQuestionTask INSTANCE = new VcsAnswerMrQuestionTask(); @NotNull private static final TaskName name = new TaskName("vcs-answer-mr-question"); @NotNull public TaskName getName() { return name; }
/*    */   
/*    */   @NotNull
/* 15 */   public final TaskCall default(@NotNull String comment, @NotNull String codeFragment, @NotNull String fileText) { Intrinsics.checkNotNullParameter(comment, "comment"); Intrinsics.checkNotNullParameter(codeFragment, "codeFragment"); Intrinsics.checkNotNullParameter(fileText, "fileText"); return new TaskCall(
/* 16 */         getName().tag(Default.INSTANCE.getTag()), 
/* 17 */         TaskParameters.Companion.build(new VcsAnswerMrQuestionTask$default$1(comment, codeFragment, fileText))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 18 */   static final class VcsAnswerMrQuestionTask$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)VcsAnswerMrQuestionTask.Schema.INSTANCE.getComment(), this.$comment);
/* 19 */       $this$build.add((AttributeDescriptor)VcsAnswerMrQuestionTask.Schema.INSTANCE.getCodeFragment(), this.$codeFragment);
/* 20 */       $this$build.add((AttributeDescriptor)VcsAnswerMrQuestionTask.Schema.INSTANCE.getFileText(), this.$fileText); }
/*    */      VcsAnswerMrQuestionTask$default$1(String $comment, String $codeFragment, String $fileText) {
/*    */       super(1);
/*    */     } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\n\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\032\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\b\n\000\032\004\b\006\020\007R\021\020\b\032\0020\005¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\005¢\006\b\n\000\032\004\b\f\020\nR\021\020\r\032\0020\005¢\006\b\n\000\032\004\b\016\020\n¨\006\017"}, d2 = {"Lai/grazie/model/task/library/v2/vcs/mr/VcsAnswerMrQuestionTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getAll", "()Ljava/util/List;", "codeFragment", "getCodeFragment", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "comment", "getComment", "fileText", "getFileText", "model-task"})
/*    */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 26 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text comment = new AttributeDescriptor.Text("comment"); @NotNull public final AttributeDescriptor.Text getComment() { return comment; } @NotNull
/* 27 */     private static final AttributeDescriptor.Text codeFragment = new AttributeDescriptor.Text("codeFragment"); @NotNull public final AttributeDescriptor.Text getCodeFragment() { return codeFragment; } @NotNull
/* 28 */     private static final AttributeDescriptor.Text fileText = new AttributeDescriptor.Text("fileText"); @NotNull private static final List<AttributeDescriptor.Text> all; @NotNull public final AttributeDescriptor.Text getFileText() { return fileText; }
/*    */     @NotNull
/* 30 */     public List<AttributeDescriptor.Text> getAll() { return all; } static { AttributeDescriptor.Text[] arrayOfText = new AttributeDescriptor.Text[3]; arrayOfText[0] = comment; arrayOfText[1] = codeFragment; arrayOfText[2] = fileText; all = CollectionsKt.listOf((Object[])arrayOfText); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\vcs\mr\VcsAnswerMrQuestionTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */