/*    */ package ai.grazie.model.task.library.v2.vcs.mr;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001:\002\017\020B\007\b\002¢\006\002\020\002J&\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\n2\006\020\f\032\0020\n2\006\020\r\032\0020\016R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\021"}, d2 = {"Lai/grazie/model/task/library/v2/vcs/mr/VcsMoveToNewFileTask;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "comment", "", "codeFragment", "fileText", "output", "Lai/grazie/model/task/library/v2/vcs/mr/VcsMoveToNewFileTask$Output;", "Output", "Schema", "model-task"})
/*    */ public final class VcsMoveToNewFileTask implements TaskNameDescriptor {
/*    */   @NotNull
/* 12 */   public static final VcsMoveToNewFileTask INSTANCE = new VcsMoveToNewFileTask(); @NotNull private static final TaskName name = new TaskName("vcs-move-to-new-file"); @NotNull public TaskName getName() { return name; }
/*    */   
/*    */   @NotNull
/* 15 */   public final TaskCall default(@NotNull String comment, @NotNull String codeFragment, @NotNull String fileText, @NotNull Output output) { Intrinsics.checkNotNullParameter(comment, "comment"); Intrinsics.checkNotNullParameter(codeFragment, "codeFragment"); Intrinsics.checkNotNullParameter(fileText, "fileText"); Intrinsics.checkNotNullParameter(output, "output"); return new TaskCall(
/* 16 */         getName().tag(Default.INSTANCE.getTag()), 
/* 17 */         TaskParameters.Companion.build(new VcsMoveToNewFileTask$default$1(comment, codeFragment, fileText, output))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 18 */   static final class VcsMoveToNewFileTask$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)VcsMoveToNewFileTask.Schema.INSTANCE.getComment(), this.$comment);
/* 19 */       $this$build.add((AttributeDescriptor)VcsMoveToNewFileTask.Schema.INSTANCE.getCodeFragment(), this.$codeFragment);
/* 20 */       $this$build.add((AttributeDescriptor)VcsMoveToNewFileTask.Schema.INSTANCE.getFileText(), this.$fileText);
/* 21 */       $this$build.add((AttributeDescriptor)VcsMoveToNewFileTask.Schema.INSTANCE.getOutput(), this.$output.name()); }
/*    */      VcsMoveToNewFileTask$default$1(String $comment, String $codeFragment, String $fileText, VcsMoveToNewFileTask.Output $output) {
/*    */       super(1);
/*    */     } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\r\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R \020\003\032\b\022\004\022\0020\0050\004X\004¢\006\016\n\000\022\004\b\006\020\002\032\004\b\007\020\bR\021\020\t\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\021\020\f\032\0020\005¢\006\b\n\000\032\004\b\r\020\013R\021\020\016\032\0020\005¢\006\b\n\000\032\004\b\017\020\013R\021\020\020\032\0020\005¢\006\b\n\000\032\004\b\021\020\013¨\006\022"}, d2 = {"Lai/grazie/model/task/library/v2/vcs/mr/VcsMoveToNewFileTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getAll$annotations", "getAll", "()Ljava/util/List;", "codeFragment", "getCodeFragment", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "comment", "getComment", "fileText", "getFileText", "output", "getOutput", "model-task"})
/*    */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 27 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text comment = new AttributeDescriptor.Text("comment"); @NotNull public final AttributeDescriptor.Text getComment() { return comment; } @NotNull
/* 28 */     private static final AttributeDescriptor.Text codeFragment = new AttributeDescriptor.Text("codeFragment"); @NotNull public final AttributeDescriptor.Text getCodeFragment() { return codeFragment; } @NotNull
/* 29 */     private static final AttributeDescriptor.Text fileText = new AttributeDescriptor.Text("fileText"); @NotNull public final AttributeDescriptor.Text getFileText() { return fileText; } @NotNull
/* 30 */     private static final AttributeDescriptor.Text output = new AttributeDescriptor.Text("output"); @NotNull private static final List<AttributeDescriptor.Text> all; @NotNull public final AttributeDescriptor.Text getOutput() { return output; }
/*    */     
/*    */     @NotNull
/* 33 */     public List<AttributeDescriptor.Text> getAll() { return all; } static { AttributeDescriptor.Text[] arrayOfText = new AttributeDescriptor.Text[4]; arrayOfText[0] = comment; arrayOfText[1] = codeFragment; arrayOfText[2] = fileText; arrayOfText[3] = output; all = CollectionsKt.listOf((Object[])arrayOfText); }
/*    */      }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\005\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005¨\006\006"}, d2 = {"Lai/grazie/model/task/library/v2/vcs/mr/VcsMoveToNewFileTask$Output;", "", "(Ljava/lang/String;I)V", "CURRENT_FILE_CONTENT", "NEW_FILE_CONTENT", "NEW_FILE_NAME", "model-task"})
/* 37 */   public enum Output { CURRENT_FILE_CONTENT, NEW_FILE_CONTENT, NEW_FILE_NAME; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\vcs\mr\VcsMoveToNewFileTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */