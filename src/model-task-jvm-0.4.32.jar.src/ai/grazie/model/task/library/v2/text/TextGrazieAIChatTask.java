/*    */ package ai.grazie.model.task.library.v2.text;
/*    */ import ai.grazie.model.llm.chat.v5.LLMChat;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Deprecated(message = "In favor of GrazieAIChatTask")
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\0020\001:\001\rB\007\b\002¢\006\002\020\002J\032\020\007\032\0020\b2\006\020\t\032\0020\n2\n\b\002\020\013\032\004\030\0010\fR\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\016"}, d2 = {"Lai/grazie/model/task/library/v2/text/TextGrazieAIChatTask;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "userPrompt", "", "history", "Lai/grazie/model/llm/chat/v5/LLMChat;", "Schema", "model-task"})
/*    */ public final class TextGrazieAIChatTask implements TaskNameDescriptor {
/*    */   @NotNull
/* 13 */   public static final TextGrazieAIChatTask INSTANCE = new TextGrazieAIChatTask(); @NotNull private static final TaskName name = new TaskName("text-grazie-ai-chat"); @NotNull public TaskName getName() { return name; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final TaskCall default(@NotNull String userPrompt, @Nullable LLMChat history) {
/* 24 */     Intrinsics.checkNotNullParameter(userPrompt, "userPrompt"); return new TaskCall(getName().tag(Default.INSTANCE.getTag()), TaskParameters.Companion.build(new TextGrazieAIChatTask$default$1(userPrompt, history))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 25 */   static final class TextGrazieAIChatTask$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)TextGrazieAIChatTask.Schema.INSTANCE.getUserPrompt(), this.$userPrompt);
/* 26 */       $this$build.add((AttributeDescriptor)TextGrazieAIChatTask.Schema.INSTANCE.getHistory(), this.$history); }
/*    */     
/*    */     TextGrazieAIChatTask$default$1(String $userPrompt, LLMChat $history) {
/*    */       super(1);
/*    */     } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R4\020\003\032\"\022\036\022\034\022\006\b\001\022\0020\006\022\006\b\001\022\0020\007\022\b\b\001\022\004\030\0010\b0\0050\004X\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\r\020\016R\021\020\017\032\0020\020¢\006\b\n\000\032\004\b\021\020\022¨\006\023"}, d2 = {"Lai/grazie/model/task/library/v2/text/TextGrazieAIChatTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key;", "Lai/grazie/utils/attributes/Attributes$Value;", "", "getAll", "()Ljava/util/List;", "history", "Lai/grazie/model/task/exec/OptLLMChatAttr;", "getHistory", "()Lai/grazie/model/task/exec/OptLLMChatAttr;", "userPrompt", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getUserPrompt", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "model-task"})
/*    */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 33 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text userPrompt = new AttributeDescriptor.Text("userPrompt"); @NotNull public final AttributeDescriptor.Text getUserPrompt() { return userPrompt; } @NotNull
/* 34 */     private static final OptLLMChatAttr history = TaskParametersAttributes.Chat.INSTANCE.getHistory(); @NotNull private static final List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> all; @NotNull public final OptLLMChatAttr getHistory() { return history; }
/*    */     @NotNull
/* 36 */     public List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> getAll() { return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[2]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)userPrompt; arrayOfAttributeDescriptor[1] = (AttributeDescriptor)history; all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\text\TextGrazieAIChatTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */