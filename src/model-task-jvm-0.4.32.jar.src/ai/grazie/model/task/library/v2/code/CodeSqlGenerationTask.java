/*    */ package ai.grazie.model.task.library.v2.code;
/*    */ import ai.grazie.model.task.exec.TaskCall;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\003\bÇ\002\030\0002\0020\001:\001\fB\007\b\002¢\006\002\020\002J\032\020\007\032\0020\b2\006\020\t\032\0020\n2\n\b\002\020\013\032\004\030\0010\nR\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\r"}, d2 = {"Lai/grazie/model/task/library/v2/code/CodeSqlGenerationTask;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "instruction", "", "tableDescription", "Schema", "model-task"})
/*    */ public final class CodeSqlGenerationTask implements TaskNameDescriptor {
/*    */   @NotNull
/* 12 */   public static final CodeSqlGenerationTask INSTANCE = new CodeSqlGenerationTask(); @NotNull private static final TaskName name = new TaskName("generate-sql"); @NotNull public TaskName getName() { return name; }
/*    */ 
/*    */   
/*    */   @NotNull
/* 16 */   public final TaskCall default(@NotNull String instruction, @Nullable String tableDescription) { Intrinsics.checkNotNullParameter(instruction, "instruction"); return new TaskCall(getName().tag(Default.INSTANCE.getTag()), TaskParameters.Companion.build(new CodeSqlGenerationTask$default$1(instruction, tableDescription))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 17 */   static final class CodeSqlGenerationTask$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)CodeSqlGenerationTask.Schema.INSTANCE.getInstruction(), this.$instruction);
/* 18 */       $this$build.add((AttributeDescriptor)CodeSqlGenerationTask.Schema.INSTANCE.getTableDescription(), this.$tableDescription); }
/*    */     
/*    */     CodeSqlGenerationTask$default$1(String $instruction, String $tableDescription) {
/*    */       super(1);
/*    */     } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R0\020\003\032\036\022\032\022\030\022\004\022\0020\006\022\004\022\0020\007\022\b\b\001\022\004\030\0010\b0\0050\004X\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\r\020\016R\021\020\017\032\0020\020¢\006\b\n\000\032\004\b\021\020\022¨\006\023"}, d2 = {"Lai/grazie/model/task/library/v2/code/CodeSqlGenerationTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key$Text;", "Lai/grazie/utils/attributes/Attributes$Value$Text;", "", "getAll", "()Ljava/util/List;", "instruction", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getInstruction", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "tableDescription", "Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "getTableDescription", "()Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "model-task"})
/*    */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 25 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text instruction = new AttributeDescriptor.Text("instruction"); @NotNull public final AttributeDescriptor.Text getInstruction() { return instruction; } @NotNull
/* 26 */     private static final AttributeDescriptor.OptText tableDescription = new AttributeDescriptor.OptText("tableDescription"); @NotNull private static final List<AttributeDescriptor<Attributes.Key.Text, Attributes.Value.Text, ? extends String>> all; @NotNull public final AttributeDescriptor.OptText getTableDescription() { return tableDescription; }
/*    */     @NotNull
/* 28 */     public List<AttributeDescriptor<Attributes.Key.Text, Attributes.Value.Text, ? extends String>> getAll() { return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[2]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)instruction; arrayOfAttributeDescriptor[1] = (AttributeDescriptor)tableDescription; all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\code\CodeSqlGenerationTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */