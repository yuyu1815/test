/*    */ package ai.grazie.model.task.library.v2.chat;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\002\b\002\bÇ\002\030\0002\0020\001:\001\020B\007\b\002¢\006\002\020\002J$\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f2\f\020\r\032\b\022\004\022\0020\0170\016R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\021"}, d2 = {"Lai/grazie/model/task/library/v2/chat/CodeAIAssistantTask;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "product", "Lai/grazie/model/task/library/v2/chat/CodeAIAssistantProduct;", "history", "Lai/grazie/model/task/library/v2/chat/TasksChat;", "functions", "", "", "Schema", "model-task"})
/*    */ public final class CodeAIAssistantTask implements TaskNameDescriptor {
/*    */   @NotNull
/* 15 */   public static final CodeAIAssistantTask INSTANCE = new CodeAIAssistantTask(); @NotNull private static final TaskName name = new TaskName("code-ai-assistant"); @NotNull public TaskName getName() { return name; }
/*    */ 
/*    */   
/*    */   @NotNull
/* 19 */   public final TaskCall default(@NotNull CodeAIAssistantProduct product, @NotNull TasksChat history, @NotNull List<String> functions) { Intrinsics.checkNotNullParameter(product, "product"); Intrinsics.checkNotNullParameter(history, "history"); Intrinsics.checkNotNullParameter(functions, "functions"); return new TaskCall(getName().tag(Default.INSTANCE.getTag()), TaskParameters.Companion.build(new CodeAIAssistantTask$default$1(product, history, functions))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 20 */   static final class CodeAIAssistantTask$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)CodeAIAssistantTask.Schema.INSTANCE.getProduct(), this.$product);
/* 21 */       $this$build.add((AttributeDescriptor)CodeAIAssistantTask.Schema.INSTANCE.getHistory(), this.$history);
/* 22 */       $this$build.add((AttributeDescriptor)CodeAIAssistantTask.Schema.INSTANCE.getFunctions(), this.$functions); }
/*    */     
/*    */     CodeAIAssistantTask$default$1(CodeAIAssistantProduct $product, TasksChat $history, List<String> $functions) {
/*    */       super(1);
/*    */     } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\"\020\003\032\020\022\f\022\n\022\006\b\001\022\0020\0060\0050\004X\004¢\006\b\n\000\032\004\b\007\020\bR\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\013\020\f¨\006\r"}, d2 = {"Lai/grazie/model/task/library/v2/chat/CodeAIAssistantTask$Schema;", "Lai/grazie/model/task/library/v2/chat/ChatTaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Json;", "", "getAll", "()Ljava/util/List;", "product", "Lai/grazie/model/task/library/v2/chat/CodeAIAssistantProductAttr;", "getProduct", "()Lai/grazie/model/task/library/v2/chat/CodeAIAssistantProductAttr;", "model-task"})
/*    */   public static final class Schema implements ChatTaskSchemaDescriptor { @NotNull
/* 29 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final CodeAIAssistantProductAttr product = new CodeAIAssistantProductAttr("product"); @NotNull private static final List<AttributeDescriptor.Json<? extends Object>> all; @NotNull public final CodeAIAssistantProductAttr getProduct() { return product; } @NotNull
/* 30 */     public List<AttributeDescriptor.Json<? extends Object>> getAll() { return all; } static { AttributeDescriptor.Json[] arrayOfJson = new AttributeDescriptor.Json[3]; arrayOfJson[0] = INSTANCE.getHistory(); arrayOfJson[1] = INSTANCE.getFunctions(); arrayOfJson[2] = product; all = CollectionsKt.listOf((Object[])arrayOfJson); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\chat\CodeAIAssistantTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */