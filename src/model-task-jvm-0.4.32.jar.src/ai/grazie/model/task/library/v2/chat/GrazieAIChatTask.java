/*    */ package ai.grazie.model.task.library.v2.chat;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import java.util.List;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\002\b\002\bÇ\002\030\0002\0020\001:\001\016B\007\b\002¢\006\002\020\002J\034\020\007\032\0020\b2\006\020\t\032\0020\n2\f\020\013\032\b\022\004\022\0020\r0\fR\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\017"}, d2 = {"Lai/grazie/model/task/library/v2/chat/GrazieAIChatTask;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "history", "Lai/grazie/model/task/library/v2/chat/TasksChat;", "functions", "", "", "Schema", "model-task"})
/*    */ public final class GrazieAIChatTask implements TaskNameDescriptor {
/*    */   @NotNull
/* 12 */   public static final GrazieAIChatTask INSTANCE = new GrazieAIChatTask(); @NotNull private static final TaskName name = new TaskName("grazie-ai-chat"); @NotNull public TaskName getName() { return name; }
/*    */ 
/*    */   
/*    */   @NotNull
/* 16 */   public final TaskCall default(@NotNull TasksChat history, @NotNull List<String> functions) { Intrinsics.checkNotNullParameter(history, "history"); Intrinsics.checkNotNullParameter(functions, "functions"); return new TaskCall(getName().tag(Default.INSTANCE.getTag()), TaskParameters.Companion.build(new GrazieAIChatTask$default$1(history, functions))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 17 */   static final class GrazieAIChatTask$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)GrazieAIChatTask.Schema.INSTANCE.getHistory(), this.$history);
/* 18 */       $this$build.add((AttributeDescriptor)GrazieAIChatTask.Schema.INSTANCE.getFunctions(), this.$functions); }
/*    */     
/*    */     GrazieAIChatTask$default$1(TasksChat $history, List<String> $functions) {
/*    */       super(1);
/*    */     } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\020\000\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\"\020\003\032\020\022\f\022\n\022\006\b\001\022\0020\0060\0050\004X\004¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lai/grazie/model/task/library/v2/chat/GrazieAIChatTask$Schema;", "Lai/grazie/model/task/library/v2/chat/ChatTaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Json;", "", "getAll", "()Ljava/util/List;", "model-task"})
/*    */   public static final class Schema implements ChatTaskSchemaDescriptor { @NotNull
/* 25 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final List<AttributeDescriptor.Json<? extends Object>> all; @NotNull public List<AttributeDescriptor.Json<? extends Object>> getAll() { return all; } static { AttributeDescriptor.Json[] arrayOfJson = new AttributeDescriptor.Json[2]; arrayOfJson[0] = INSTANCE.getHistory(); arrayOfJson[1] = INSTANCE.getFunctions(); all = CollectionsKt.listOf((Object[])arrayOfJson); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\chat\GrazieAIChatTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */