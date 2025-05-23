/*    */ package ai.grazie.model.task.library.v2.code.completion;
/*    */ import ai.grazie.model.jet.v2.ContextItem;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import ai.grazie.model.task.library.code.attributes.ContextItemArray;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\020\021\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001:\001\022B\007\b\002¢\006\002\020\002J9\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\n2\006\020\f\032\0020\n2\006\020\r\032\0020\n2\f\020\016\032\b\022\004\022\0020\0200\017¢\006\002\020\021R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\023"}, d2 = {"Lai/grazie/model/task/library/v2/code/completion/CodeCompleteSlow;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "prefix", "", "suffix", "language", "filepath", "context", "", "Lai/grazie/model/jet/v2/ContextItem;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lai/grazie/model/jet/v2/ContextItem;)Lai/grazie/model/task/exec/TaskCall;", "Schema", "model-task"})
/*    */ public final class CodeCompleteSlow implements TaskNameDescriptor {
/*    */   @NotNull
/* 14 */   public static final CodeCompleteSlow INSTANCE = new CodeCompleteSlow(); @NotNull private static final TaskName name = new TaskName("code-complete-slow"); @NotNull public TaskName getName() { return name; }
/*    */   
/*    */   @NotNull
/* 17 */   public final TaskCall default(@NotNull String prefix, @NotNull String suffix, @NotNull String language, @NotNull String filepath, @NotNull ContextItem[] context) { Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(suffix, "suffix"); Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(filepath, "filepath"); Intrinsics.checkNotNullParameter(context, "context"); return new TaskCall(getName().tag(Default.INSTANCE.getTag()), TaskParameters.Companion.build(new CodeCompleteSlow$default$1(prefix, suffix, language, context, filepath))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 18 */   static final class CodeCompleteSlow$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)CodeCompleteSlow.Schema.INSTANCE.getPrefix(), this.$prefix);
/* 19 */       $this$build.add((AttributeDescriptor)CodeCompleteSlow.Schema.INSTANCE.getSuffix(), this.$suffix);
/* 20 */       $this$build.add((AttributeDescriptor)CodeCompleteSlow.Schema.INSTANCE.getLanguage(), this.$language);
/* 21 */       $this$build.add((AttributeDescriptor)CodeCompleteSlow.Schema.INSTANCE.getContext(), this.$context);
/* 22 */       $this$build.add((AttributeDescriptor)CodeCompleteSlow.Schema.INSTANCE.getFilepath(), this.$filepath); }
/*    */      CodeCompleteSlow$default$1(String $prefix, String $suffix, String $language, ContextItem[] $context, String $filepath) {
/*    */       super(1);
/*    */     } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\t\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R&\020\003\032\024\022\020\022\016\022\002\b\003\022\002\b\003\022\002\b\0030\0050\004X\004¢\006\b\n\000\032\004\b\006\020\007R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\n\020\013R\021\020\f\032\0020\r¢\006\b\n\000\032\004\b\016\020\017R\021\020\020\032\0020\r¢\006\b\n\000\032\004\b\021\020\017R\021\020\022\032\0020\r¢\006\b\n\000\032\004\b\023\020\017R\021\020\024\032\0020\r¢\006\b\n\000\032\004\b\025\020\017¨\006\026"}, d2 = {"Lai/grazie/model/task/library/v2/code/completion/CodeCompleteSlow$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "getAll", "()Ljava/util/List;", "context", "Lai/grazie/model/task/library/code/attributes/ContextItemArray;", "getContext", "()Lai/grazie/model/task/library/code/attributes/ContextItemArray;", "filepath", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getFilepath", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "language", "getLanguage", "prefix", "getPrefix", "suffix", "getSuffix", "model-task"})
/*    */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 27 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text prefix = new AttributeDescriptor.Text("prefix"); @NotNull public final AttributeDescriptor.Text getPrefix() { return prefix; } @NotNull
/* 28 */     private static final AttributeDescriptor.Text suffix = new AttributeDescriptor.Text("suffix"); @NotNull public final AttributeDescriptor.Text getSuffix() { return suffix; } @NotNull
/* 29 */     private static final ContextItemArray context = new ContextItemArray("context"); @NotNull public final ContextItemArray getContext() { return context; } @NotNull
/* 30 */     private static final AttributeDescriptor.Text language = new AttributeDescriptor.Text("language"); @NotNull public final AttributeDescriptor.Text getLanguage() { return language; } @NotNull
/* 31 */     private static final AttributeDescriptor.Text filepath = new AttributeDescriptor.Text("filepath"); @NotNull private static final List<AttributeDescriptor<?, ?, ?>> all; @NotNull public final AttributeDescriptor.Text getFilepath() { return filepath; }
/*    */     @NotNull
/* 33 */     public List<AttributeDescriptor<?, ?, ?>> getAll() { return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[5]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)prefix; arrayOfAttributeDescriptor[1] = (AttributeDescriptor)suffix; arrayOfAttributeDescriptor[2] = (AttributeDescriptor)language; arrayOfAttributeDescriptor[3] = (AttributeDescriptor)context; arrayOfAttributeDescriptor[4] = (AttributeDescriptor)filepath; all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\code\completion\CodeCompleteSlow.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */