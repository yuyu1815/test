/*    */ package ai.grazie.model.task.library.v2.text.summarize;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\003\bÇ\002\030\0002\0020\001:\001\016B\007\b\002¢\006\002\020\002J\036\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\nR\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\017"}, d2 = {"Lai/grazie/model/task/library/v2/text/summarize/TextSummarizeTask;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "text", "", "words", "", "lang", "Schema", "model-task"})
/*    */ public final class TextSummarizeTask implements TaskNameDescriptor {
/*    */   @NotNull
/* 12 */   public static final TextSummarizeTask INSTANCE = new TextSummarizeTask(); @NotNull private static final TaskName name = new TaskName("text-summarize"); @NotNull public TaskName getName() { return name; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final TaskCall default(@NotNull String text, int words, @NotNull String lang) {
/* 24 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(lang, "lang"); return new TaskCall(getName().tag(Default.INSTANCE.getTag()), TaskParameters.Companion.build(new TextSummarizeTask$default$1(text, words, lang))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 25 */   static final class TextSummarizeTask$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)TextSummarizeTask.Schema.INSTANCE.getText(), this.$text);
/* 26 */       $this$build.add((AttributeDescriptor)TextSummarizeTask.Schema.INSTANCE.getWords(), Integer.valueOf(this.$words));
/* 27 */       $this$build.add((AttributeDescriptor)TextSummarizeTask.Schema.INSTANCE.getLang(), this.$lang); }
/*    */     
/*    */     TextSummarizeTask$default$1(String $text, int $words, String $lang) {
/*    */       super(1);
/*    */     } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R8\020\003\032 \022\034\022\032\022\006\b\001\022\0020\006\022\006\b\001\022\0020\007\022\006\b\001\022\0020\b0\0050\004X\004¢\006\016\n\000\022\004\b\t\020\002\032\004\b\n\020\013R\021\020\f\032\0020\r¢\006\b\n\000\032\004\b\016\020\017R\021\020\020\032\0020\r¢\006\b\n\000\032\004\b\021\020\017R\021\020\022\032\0020\023¢\006\b\n\000\032\004\b\024\020\025¨\006\026"}, d2 = {"Lai/grazie/model/task/library/v2/text/summarize/TextSummarizeTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key;", "Lai/grazie/utils/attributes/Attributes$Value;", "", "getAll$annotations", "getAll", "()Ljava/util/List;", "lang", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getLang", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "text", "getText", "words", "Lai/grazie/utils/attributes/AttributeDescriptor$Int;", "getWords", "()Lai/grazie/utils/attributes/AttributeDescriptor$Int;", "model-task"})
/*    */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 34 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text text = new AttributeDescriptor.Text("text"); @NotNull public final AttributeDescriptor.Text getText() { return text; } @NotNull
/* 35 */     private static final AttributeDescriptor.Int words = new AttributeDescriptor.Int("words"); @NotNull public final AttributeDescriptor.Int getWords() { return words; } @NotNull
/* 36 */     private static final AttributeDescriptor.Text lang = new AttributeDescriptor.Text("lang"); @NotNull private static final List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> all; @NotNull public final AttributeDescriptor.Text getLang() { return lang; }
/*    */     
/*    */     @NotNull
/* 39 */     public List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> getAll() { return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[3]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)text; arrayOfAttributeDescriptor[1] = (AttributeDescriptor)words; arrayOfAttributeDescriptor[2] = (AttributeDescriptor)lang; all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\text\summarize\TextSummarizeTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */