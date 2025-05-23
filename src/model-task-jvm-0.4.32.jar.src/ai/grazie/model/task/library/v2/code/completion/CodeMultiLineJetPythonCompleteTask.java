/*    */ package ai.grazie.model.task.library.v2.code.completion;
/*    */ import ai.grazie.model.jet.Context;
/*    */ import ai.grazie.model.task.exec.TaskCall;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import ai.grazie.model.task.id.TaskTag;
/*    */ import ai.grazie.model.task.library.code.attributes.CodeCompleteMetadataAttr;
/*    */ import ai.grazie.model.task.library.code.attributes.OptContext;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Deprecated(message = "Replacement is coming soon")
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\002\b\006\bÇ\002\030\0002\0020\001:\002\024\025B\007\b\002¢\006\002\020\002JU\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\n2\n\b\002\020\f\032\004\030\0010\n2\n\b\002\020\r\032\004\030\0010\0162\n\b\002\020\017\032\004\030\0010\0202\b\b\002\020\021\032\0020\0202\n\b\002\020\022\032\004\030\0010\020¢\006\002\020\023R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\026"}, d2 = {"Lai/grazie/model/task/library/v2/code/completion/CodeMultiLineJetPythonCompleteTask;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "prefix", "", "suffix", "filepath", "context", "Lai/grazie/model/jet/Context;", "useControl", "", "provideMetadata", "generateIndents", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/grazie/model/jet/Context;Ljava/lang/Boolean;ZLjava/lang/Boolean;)Lai/grazie/model/task/exec/TaskCall;", "Alibaba", "Schema", "model-task"})
/*    */ public final class CodeMultiLineJetPythonCompleteTask implements TaskNameDescriptor {
/*    */   @NotNull
/* 23 */   public static final CodeMultiLineJetPythonCompleteTask INSTANCE = new CodeMultiLineJetPythonCompleteTask(); @NotNull private static final TaskName name = new TaskName("code-multi-line-jet-python-complete"); @NotNull public TaskName getName() { return name; }
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
/*    */   public final TaskCall default(@NotNull String prefix, @NotNull String suffix, @Nullable String filepath, @Nullable Context context, @Nullable Boolean useControl, boolean provideMetadata, @Nullable Boolean generateIndents) {
/* 36 */     Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(suffix, "suffix"); return new TaskCall(getName().tag(Default.INSTANCE.getTag()), TaskParameters.Companion.build(new CodeMultiLineJetPythonCompleteTask$default$1(prefix, suffix, filepath, context, useControl, provideMetadata, generateIndents))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 37 */   static final class CodeMultiLineJetPythonCompleteTask$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)CodeMultiLineJetPythonCompleteTask.Schema.INSTANCE.getPrefix(), this.$prefix);
/* 38 */       $this$build.add((AttributeDescriptor)CodeMultiLineJetPythonCompleteTask.Schema.INSTANCE.getSuffix(), this.$suffix);
/* 39 */       $this$build.add((AttributeDescriptor)CodeMultiLineJetPythonCompleteTask.Schema.INSTANCE.getFilepath(), this.$filepath);
/* 40 */       $this$build.add((AttributeDescriptor)CodeMultiLineJetPythonCompleteTask.Schema.INSTANCE.getContext(), this.$context);
/* 41 */       $this$build.add((AttributeDescriptor)CodeMultiLineJetPythonCompleteTask.Schema.INSTANCE.getUseControl(), this.$useControl);
/* 42 */       $this$build.add((AttributeDescriptor)CodeMultiLineJetPythonCompleteTask.Schema.INSTANCE.getProvideLogitsMetadata(), Boolean.valueOf(this.$provideMetadata));
/* 43 */       $this$build.add((AttributeDescriptor)CodeMultiLineJetPythonCompleteTask.Schema.INSTANCE.getGenerateIndents(), this.$generateIndents); }
/*    */     
/*    */     CodeMultiLineJetPythonCompleteTask$default$1(String $prefix, String $suffix, String $filepath, Context $context, Boolean $useControl, boolean $provideMetadata, Boolean $generateIndents) {
/*    */       super(1);
/*    */     } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\n\bÆ\002\030\0002\0020\001:\001!B\007\b\002¢\006\002\020\002R4\020\003\032\"\022\036\022\034\022\006\b\001\022\0020\006\022\006\b\001\022\0020\007\022\b\b\001\022\004\030\0010\b0\0050\004X\004¢\006\b\n\000\032\004\b\t\020\nR\024\020\013\032\0020\fX\004¢\006\b\n\000\032\004\b\r\020\016R\024\020\017\032\0020\020X\004¢\006\b\n\000\032\004\b\021\020\022R\024\020\023\032\0020\024X\004¢\006\b\n\000\032\004\b\025\020\026R\024\020\027\032\0020\030X\004¢\006\b\n\000\032\004\b\031\020\032R\024\020\033\032\0020\024X\004¢\006\b\n\000\032\004\b\034\020\026R\024\020\035\032\0020\030X\004¢\006\b\n\000\032\004\b\036\020\032R\024\020\037\032\0020\024X\004¢\006\b\n\000\032\004\b \020\026¨\006\""}, d2 = {"Lai/grazie/model/task/library/v2/code/completion/CodeMultiLineJetPythonCompleteTask$Schema;", "Lai/grazie/model/task/library/v2/code/completion/JetTaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key;", "Lai/grazie/utils/attributes/Attributes$Value;", "", "getAll", "()Ljava/util/List;", "context", "Lai/grazie/model/task/library/code/attributes/OptContext;", "getContext", "()Lai/grazie/model/task/library/code/attributes/OptContext;", "filepath", "Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "getFilepath", "()Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "generateIndents", "Lai/grazie/utils/attributes/AttributeDescriptor$OptBool;", "getGenerateIndents", "()Lai/grazie/utils/attributes/AttributeDescriptor$OptBool;", "prefix", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getPrefix", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "provideLogitsMetadata", "getProvideLogitsMetadata", "suffix", "getSuffix", "useControl", "getUseControl", "Export", "model-task"})
/*    */   public static final class Schema implements JetTaskSchemaDescriptor { @NotNull
/* 50 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text prefix = new AttributeDescriptor.Text("prefix"); @NotNull public AttributeDescriptor.Text getPrefix() { return prefix; } @NotNull
/* 51 */     private static final AttributeDescriptor.Text suffix = new AttributeDescriptor.Text("suffix"); @NotNull public AttributeDescriptor.Text getSuffix() { return suffix; } @NotNull
/* 52 */     private static final AttributeDescriptor.OptText filepath = new AttributeDescriptor.OptText("filepath"); @NotNull public AttributeDescriptor.OptText getFilepath() { return filepath; } @NotNull
/* 53 */     private static final OptContext context = new OptContext("context"); @NotNull public OptContext getContext() { return context; } @NotNull
/* 54 */     private static final AttributeDescriptor.OptBool useControl = new AttributeDescriptor.OptBool("useControl"); @NotNull public AttributeDescriptor.OptBool getUseControl() { return useControl; } @NotNull
/* 55 */     private static final AttributeDescriptor.OptBool provideLogitsMetadata = new AttributeDescriptor.OptBool("provideGenerationDetails"); @NotNull public AttributeDescriptor.OptBool getProvideLogitsMetadata() { return provideLogitsMetadata; } @NotNull
/* 56 */     private static final AttributeDescriptor.OptBool generateIndents = new AttributeDescriptor.OptBool("generateIndents"); @NotNull private static final List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> all; @NotNull public AttributeDescriptor.OptBool getGenerateIndents() { return generateIndents; }
/*    */     @NotNull
/* 58 */     public List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> getAll() { return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[7]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)INSTANCE.getPrefix(); arrayOfAttributeDescriptor[1] = (AttributeDescriptor)INSTANCE.getSuffix(); arrayOfAttributeDescriptor[2] = (AttributeDescriptor)INSTANCE.getFilepath(); arrayOfAttributeDescriptor[3] = (AttributeDescriptor)INSTANCE.getContext(); arrayOfAttributeDescriptor[4] = (AttributeDescriptor)INSTANCE.getUseControl(); arrayOfAttributeDescriptor[5] = (AttributeDescriptor)INSTANCE.getProvideLogitsMetadata(); arrayOfAttributeDescriptor[6] = (AttributeDescriptor)INSTANCE.getGenerateIndents(); all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */      @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/v2/code/completion/CodeMultiLineJetPythonCompleteTask$Schema$Export;", "", "()V", "metadata", "Lai/grazie/model/task/library/code/attributes/CodeCompleteMetadataAttr;", "getMetadata", "()Lai/grazie/model/task/library/code/attributes/CodeCompleteMetadataAttr;", "model-task"})
/*    */     public static final class Export { @NotNull
/* 61 */       public static final Export INSTANCE = new Export(); @NotNull private static final CodeCompleteMetadataAttr metadata = CodeCompletionAttributes.INSTANCE.getMetadata(); @NotNull public final CodeCompleteMetadataAttr getMetadata() { return metadata; }
/*    */        }
/*    */      }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/task/library/v2/code/completion/CodeMultiLineJetPythonCompleteTask$Alibaba;", "Lai/grazie/model/task/id/Hidden;", "()V", "tag", "Lai/grazie/model/task/id/TaskTag;", "getTag", "()Lai/grazie/model/task/id/TaskTag;", "model-task"})
/*    */   public static final class Alibaba implements Hidden {
/*    */     @NotNull
/* 69 */     public static final Alibaba INSTANCE = new Alibaba(); @NotNull private static final TaskTag tag = new TaskTag("alibaba"); @NotNull public TaskTag getTag() { return tag; }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\code\completion\CodeMultiLineJetPythonCompleteTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */