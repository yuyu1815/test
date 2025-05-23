/*    */ package ai.grazie.model.task.library.v2.text.improve;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\002\bÇ\002\030\0002\0020\001:\001\013B\007\b\002¢\006\002\020\002J\016\020\007\032\0020\b2\006\020\t\032\0020\nR\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\f"}, d2 = {"Lai/grazie/model/task/library/v2/text/improve/TextImproveYoutrackArticleFixTask;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "text", "", "Schema", "model-task"})
/*    */ public final class TextImproveYoutrackArticleFixTask implements TaskNameDescriptor {
/*    */   @NotNull
/* 12 */   public static final TextImproveYoutrackArticleFixTask INSTANCE = new TextImproveYoutrackArticleFixTask(); @NotNull private static final TaskName name = new TaskName("text-improve-youtrack-article-fix"); @NotNull public TaskName getName() { return name; }
/*    */ 
/*    */   
/*    */   @NotNull
/* 16 */   public final TaskCall default(@NotNull String text) { Intrinsics.checkNotNullParameter(text, "text"); return new TaskCall(getName().tag(Default.INSTANCE.getTag()), TaskParameters.Companion.build(new TextImproveYoutrackArticleFixTask$default$1(text))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 17 */   static final class TextImproveYoutrackArticleFixTask$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)TextImproveYoutrackArticleFixTask.Schema.INSTANCE.getText(), this.$text); }
/*    */     
/*    */     TextImproveYoutrackArticleFixTask$default$1(String $text) {
/*    */       super(1);
/*    */     } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\006\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\032\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\b\n\000\032\004\b\006\020\007R\021\020\b\032\0020\005¢\006\b\n\000\032\004\b\t\020\n¨\006\013"}, d2 = {"Lai/grazie/model/task/library/v2/text/improve/TextImproveYoutrackArticleFixTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getAll", "()Ljava/util/List;", "text", "getText", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "model-task"})
/*    */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 24 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text text = new AttributeDescriptor.Text("text"); @NotNull public final AttributeDescriptor.Text getText() { return text; }
/*    */      @NotNull
/* 26 */     private static final List<AttributeDescriptor.Text> all = CollectionsKt.listOf(text); @NotNull public List<AttributeDescriptor.Text> getAll() { return all; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\text\improve\TextImproveYoutrackArticleFixTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */