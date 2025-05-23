/*    */ package ai.grazie.model.task.library.v2.code.fleet;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\006\bÇ\002\030\0002\0020\001:\001\017B\007\b\002¢\006\002\020\002J6\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\n2\006\020\f\032\0020\n2\n\b\002\020\r\032\004\030\0010\n2\n\b\002\020\016\032\004\030\0010\nR\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\020"}, d2 = {"Lai/grazie/model/task/library/v2/code/fleet/FleetRewriteCodeTask;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "prompt", "", "context", "codeToRewrite", "filename", "language", "Schema", "model-task"})
/*    */ public final class FleetRewriteCodeTask implements TaskNameDescriptor {
/*    */   @NotNull
/* 12 */   public static final FleetRewriteCodeTask INSTANCE = new FleetRewriteCodeTask(); @NotNull private static final TaskName name = new TaskName("code-rewrite-fleet"); @NotNull public TaskName getName() { return name; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final TaskCall default(@NotNull String prompt, @NotNull String context, @NotNull String codeToRewrite, @Nullable String filename, @Nullable String language) {
/* 21 */     Intrinsics.checkNotNullParameter(prompt, "prompt"); Intrinsics.checkNotNullParameter(context, "context"); Intrinsics.checkNotNullParameter(codeToRewrite, "codeToRewrite"); return new TaskCall(getName().tag(Default.INSTANCE.getTag()), TaskParameters.Companion.build(new FleetRewriteCodeTask$default$1(prompt, context, codeToRewrite, filename, language))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 22 */   static final class FleetRewriteCodeTask$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)FleetRewriteCodeTask.Schema.INSTANCE.getPrompt(), this.$prompt);
/* 23 */       $this$build.add((AttributeDescriptor)FleetRewriteCodeTask.Schema.INSTANCE.getContext(), this.$context);
/* 24 */       $this$build.add((AttributeDescriptor)FleetRewriteCodeTask.Schema.INSTANCE.getCodeToRewrite(), this.$codeToRewrite);
/* 25 */       $this$build.add((AttributeDescriptor)FleetRewriteCodeTask.Schema.INSTANCE.getFilename(), this.$filename);
/* 26 */       $this$build.add((AttributeDescriptor)FleetRewriteCodeTask.Schema.INSTANCE.getLanguage(), this.$language); }
/*    */      FleetRewriteCodeTask$default$1(String $prompt, String $context, String $codeToRewrite, String $filename, String $language) {
/*    */       super(1);
/*    */     } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\007\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R0\020\003\032\036\022\032\022\030\022\004\022\0020\006\022\004\022\0020\007\022\b\b\001\022\004\030\0010\b0\0050\004X\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\r\020\016R\021\020\017\032\0020\f¢\006\b\n\000\032\004\b\020\020\016R\021\020\021\032\0020\022¢\006\b\n\000\032\004\b\023\020\024R\021\020\025\032\0020\022¢\006\b\n\000\032\004\b\026\020\024R\021\020\027\032\0020\f¢\006\b\n\000\032\004\b\030\020\016¨\006\031"}, d2 = {"Lai/grazie/model/task/library/v2/code/fleet/FleetRewriteCodeTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key$Text;", "Lai/grazie/utils/attributes/Attributes$Value$Text;", "", "getAll", "()Ljava/util/List;", "codeToRewrite", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getCodeToRewrite", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "context", "getContext", "filename", "Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "getFilename", "()Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "language", "getLanguage", "prompt", "getPrompt", "model-task"})
/*    */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 32 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text prompt = new AttributeDescriptor.Text("prompt"); @NotNull public final AttributeDescriptor.Text getPrompt() { return prompt; } @NotNull
/* 33 */     private static final AttributeDescriptor.Text context = new AttributeDescriptor.Text("context"); @NotNull public final AttributeDescriptor.Text getContext() { return context; } @NotNull
/* 34 */     private static final AttributeDescriptor.Text codeToRewrite = new AttributeDescriptor.Text("codeToRewrite"); @NotNull public final AttributeDescriptor.Text getCodeToRewrite() { return codeToRewrite; } @NotNull
/* 35 */     private static final AttributeDescriptor.OptText filename = new AttributeDescriptor.OptText("filename"); @NotNull public final AttributeDescriptor.OptText getFilename() { return filename; } @NotNull
/* 36 */     private static final AttributeDescriptor.OptText language = new AttributeDescriptor.OptText("language"); @NotNull private static final List<AttributeDescriptor<Attributes.Key.Text, Attributes.Value.Text, ? extends String>> all; @NotNull public final AttributeDescriptor.OptText getLanguage() { return language; }
/*    */     @NotNull
/* 38 */     public List<AttributeDescriptor<Attributes.Key.Text, Attributes.Value.Text, ? extends String>> getAll() { return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[5]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)prompt; arrayOfAttributeDescriptor[1] = (AttributeDescriptor)context; arrayOfAttributeDescriptor[2] = (AttributeDescriptor)codeToRewrite; arrayOfAttributeDescriptor[3] = (AttributeDescriptor)filename; arrayOfAttributeDescriptor[4] = (AttributeDescriptor)language; all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\code\fleet\FleetRewriteCodeTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */