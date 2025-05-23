/*    */ package ai.grazie.model.task.library.v2.code;
/*    */ import ai.grazie.model.task.exec.TaskCall;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\004\bÇ\002\030\0002\0020\001:\001\rB\007\b\002¢\006\002\020\002J\036\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\n2\006\020\f\032\0020\nR\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\016"}, d2 = {"Lai/grazie/model/task/library/v2/code/CodeConvertSnippetLangTask;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "sourceLang", "", "targetLang", "snippet", "Schema", "model-task"})
/*    */ public final class CodeConvertSnippetLangTask implements TaskNameDescriptor {
/*    */   @NotNull
/* 15 */   public static final CodeConvertSnippetLangTask INSTANCE = new CodeConvertSnippetLangTask(); @NotNull private static final TaskName name = new TaskName("code-convert-snippet-lang"); @NotNull public TaskName getName() { return name; }
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
/*    */   public final TaskCall default(@NotNull String sourceLang, @NotNull String targetLang, @NotNull String snippet) {
/* 27 */     Intrinsics.checkNotNullParameter(sourceLang, "sourceLang"); Intrinsics.checkNotNullParameter(targetLang, "targetLang"); Intrinsics.checkNotNullParameter(snippet, "snippet"); return new TaskCall(getName().tag(Default.INSTANCE.getTag()), TaskParameters.Companion.build(new CodeConvertSnippetLangTask$default$1(sourceLang, targetLang, snippet))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 28 */   static final class CodeConvertSnippetLangTask$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)CodeConvertSnippetLangTask.Schema.INSTANCE.getSourceLang(), this.$sourceLang);
/* 29 */       $this$build.add((AttributeDescriptor)CodeConvertSnippetLangTask.Schema.INSTANCE.getTargetLang(), this.$targetLang);
/* 30 */       $this$build.add((AttributeDescriptor)CodeConvertSnippetLangTask.Schema.INSTANCE.getSnippet(), this.$snippet); }
/*    */     
/*    */     CodeConvertSnippetLangTask$default$1(String $sourceLang, String $targetLang, String $snippet) {
/*    */       super(1);
/*    */     } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\n\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\032\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\b\n\000\032\004\b\006\020\007R\021\020\b\032\0020\005¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\005¢\006\b\n\000\032\004\b\f\020\nR\021\020\r\032\0020\005¢\006\b\n\000\032\004\b\016\020\n¨\006\017"}, d2 = {"Lai/grazie/model/task/library/v2/code/CodeConvertSnippetLangTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getAll", "()Ljava/util/List;", "snippet", "getSnippet", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "sourceLang", "getSourceLang", "targetLang", "getTargetLang", "model-task"})
/*    */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 37 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text sourceLang = new AttributeDescriptor.Text("sourceLang"); @NotNull public final AttributeDescriptor.Text getSourceLang() { return sourceLang; } @NotNull
/* 38 */     private static final AttributeDescriptor.Text targetLang = new AttributeDescriptor.Text("targetLang"); @NotNull public final AttributeDescriptor.Text getTargetLang() { return targetLang; } @NotNull
/* 39 */     private static final AttributeDescriptor.Text snippet = new AttributeDescriptor.Text("snippet"); @NotNull private static final List<AttributeDescriptor.Text> all; @NotNull public final AttributeDescriptor.Text getSnippet() { return snippet; }
/*    */     @NotNull
/* 41 */     public List<AttributeDescriptor.Text> getAll() { return all; } static { AttributeDescriptor.Text[] arrayOfText = new AttributeDescriptor.Text[3]; arrayOfText[0] = sourceLang; arrayOfText[1] = targetLang; arrayOfText[2] = snippet; all = CollectionsKt.listOf((Object[])arrayOfText); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\code\CodeConvertSnippetLangTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */