/*    */ package ai.grazie.model.task.library.v2.code;
/*    */ import ai.grazie.model.task.exec.TaskCall;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\005\bÇ\002\030\0002\0020\001:\001\016B\007\b\002¢\006\002\020\002J.\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\n2\n\b\002\020\f\032\004\030\0010\n2\n\b\002\020\r\032\004\030\0010\nR\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\017"}, d2 = {"Lai/grazie/model/task/library/v2/code/CodeDocumentTask;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "snippet", "", "context", "objectName", "language", "Schema", "model-task"})
/*    */ public final class CodeDocumentTask implements TaskNameDescriptor {
/*    */   @NotNull
/* 12 */   public static final CodeDocumentTask INSTANCE = new CodeDocumentTask(); @NotNull private static final TaskName name = new TaskName("code-document"); @NotNull public TaskName getName() { return name; }
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
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final TaskCall default(@NotNull String snippet, @NotNull String context, @Nullable String objectName, @Nullable String language) {
/* 29 */     Intrinsics.checkNotNullParameter(snippet, "snippet"); Intrinsics.checkNotNullParameter(context, "context"); return new TaskCall(getName().tag(Default.INSTANCE.getTag()), TaskParameters.Companion.build(new CodeDocumentTask$default$1(snippet, context, objectName, language))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 30 */   static final class CodeDocumentTask$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)CodeDocumentTask.Schema.INSTANCE.getSnippet(), this.$snippet);
/* 31 */       $this$build.add((AttributeDescriptor)CodeDocumentTask.Schema.INSTANCE.getContext(), this.$context);
/* 32 */       $this$build.add((AttributeDescriptor)CodeDocumentTask.Schema.INSTANCE.getObjectName(), this.$objectName);
/* 33 */       $this$build.add((AttributeDescriptor)CodeDocumentTask.Schema.INSTANCE.getLanguage(), this.$language); }
/*    */      CodeDocumentTask$default$1(String $snippet, String $context, String $objectName, String $language) {
/*    */       super(1);
/*    */     } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\007\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R0\020\003\032\036\022\032\022\030\022\004\022\0020\006\022\004\022\0020\007\022\b\b\001\022\004\030\0010\b0\0050\004X\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\r\020\016R\021\020\017\032\0020\020¢\006\b\n\000\032\004\b\021\020\022R\021\020\023\032\0020\020¢\006\b\n\000\032\004\b\024\020\022R\021\020\025\032\0020\f¢\006\b\n\000\032\004\b\026\020\016¨\006\027"}, d2 = {"Lai/grazie/model/task/library/v2/code/CodeDocumentTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key$Text;", "Lai/grazie/utils/attributes/Attributes$Value$Text;", "", "getAll", "()Ljava/util/List;", "context", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getContext", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "language", "Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "getLanguage", "()Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "objectName", "getObjectName", "snippet", "getSnippet", "model-task"})
/*    */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 39 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text snippet = new AttributeDescriptor.Text("snippet"); @NotNull public final AttributeDescriptor.Text getSnippet() { return snippet; } @NotNull
/* 40 */     private static final AttributeDescriptor.Text context = new AttributeDescriptor.Text("context"); @NotNull public final AttributeDescriptor.Text getContext() { return context; } @NotNull
/* 41 */     private static final AttributeDescriptor.OptText objectName = new AttributeDescriptor.OptText("objectName"); @NotNull public final AttributeDescriptor.OptText getObjectName() { return objectName; } @NotNull
/* 42 */     private static final AttributeDescriptor.OptText language = new AttributeDescriptor.OptText("language"); @NotNull private static final List<AttributeDescriptor<Attributes.Key.Text, Attributes.Value.Text, ? extends String>> all; @NotNull public final AttributeDescriptor.OptText getLanguage() { return language; }
/*    */     @NotNull
/* 44 */     public List<AttributeDescriptor<Attributes.Key.Text, Attributes.Value.Text, ? extends String>> getAll() { return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[4]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)snippet; arrayOfAttributeDescriptor[1] = (AttributeDescriptor)context; arrayOfAttributeDescriptor[2] = (AttributeDescriptor)objectName; arrayOfAttributeDescriptor[3] = (AttributeDescriptor)language; all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\code\CodeDocumentTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */