/*    */ package ai.grazie.model.task.library.v2.text;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\004\bÇ\002\030\0002\0020\001:\001\rB\007\b\002¢\006\002\020\002J\036\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\n2\006\020\f\032\0020\nR\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\016"}, d2 = {"Lai/grazie/model/task/library/v2/text/TextParaphraseV3;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "text", "", "selection", "lang", "Schema", "model-task"})
/*    */ public final class TextParaphraseV3 implements TaskNameDescriptor {
/*    */   @NotNull
/* 12 */   public static final TextParaphraseV3 INSTANCE = new TextParaphraseV3(); @NotNull private static final TaskName name = new TaskName("text-paraphrase-v3"); @NotNull public TaskName getName() { return name; }
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
/*    */   public final TaskCall default(@NotNull String text, @NotNull String selection, @NotNull String lang) {
/* 24 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(selection, "selection"); Intrinsics.checkNotNullParameter(lang, "lang"); return new TaskCall(getName().tag(Default.INSTANCE.getTag()), TaskParameters.Companion.build(new TextParaphraseV3$default$1(text, selection, lang))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 25 */   static final class TextParaphraseV3$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)TextParaphraseV3.Schema.INSTANCE.getText(), this.$text);
/* 26 */       $this$build.add((AttributeDescriptor)TextParaphraseV3.Schema.INSTANCE.getSelection(), this.$selection);
/* 27 */       $this$build.add((AttributeDescriptor)TextParaphraseV3.Schema.INSTANCE.getLang(), this.$lang); }
/*    */     
/*    */     TextParaphraseV3$default$1(String $text, String $selection, String $lang) {
/*    */       super(1);
/*    */     } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\n\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\032\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\b\n\000\032\004\b\006\020\007R\021\020\b\032\0020\005¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\005¢\006\b\n\000\032\004\b\f\020\nR\021\020\r\032\0020\005¢\006\b\n\000\032\004\b\016\020\n¨\006\017"}, d2 = {"Lai/grazie/model/task/library/v2/text/TextParaphraseV3$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getAll", "()Ljava/util/List;", "lang", "getLang", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "selection", "getSelection", "text", "getText", "model-task"})
/*    */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 34 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text text = new AttributeDescriptor.Text("text"); @NotNull public final AttributeDescriptor.Text getText() { return text; } @NotNull
/* 35 */     private static final AttributeDescriptor.Text selection = new AttributeDescriptor.Text("selection"); @NotNull public final AttributeDescriptor.Text getSelection() { return selection; } @NotNull
/* 36 */     private static final AttributeDescriptor.Text lang = new AttributeDescriptor.Text("lang"); @NotNull private static final List<AttributeDescriptor.Text> all; @NotNull public final AttributeDescriptor.Text getLang() { return lang; }
/*    */     @NotNull
/* 38 */     public List<AttributeDescriptor.Text> getAll() { return all; } static { AttributeDescriptor.Text[] arrayOfText = new AttributeDescriptor.Text[3]; arrayOfText[0] = text; arrayOfText[1] = selection; arrayOfText[2] = lang; all = CollectionsKt.listOf((Object[])arrayOfText); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\text\TextParaphraseV3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */