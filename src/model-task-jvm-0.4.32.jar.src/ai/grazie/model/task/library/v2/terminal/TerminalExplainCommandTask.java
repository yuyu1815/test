/*    */ package ai.grazie.model.task.library.v2.terminal;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.model.task.library.terminal.DeviceMetadata;
/*    */ import ai.grazie.model.task.library.terminal.TerminalHistory;
/*    */ import ai.grazie.model.task.library.terminal.TerminalMetadata;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\bÇ\002\030\0002\0020\001:\001\021B\007\b\002¢\006\002\020\002J&\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\020R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\022"}, d2 = {"Lai/grazie/model/task/library/v2/terminal/TerminalExplainCommandTask;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "device", "Lai/grazie/model/task/library/terminal/DeviceMetadata;", "terminal", "Lai/grazie/model/task/library/terminal/TerminalMetadata;", "history", "Lai/grazie/model/task/library/terminal/TerminalHistory;", "command", "", "Schema", "model-task"})
/*    */ public final class TerminalExplainCommandTask implements TaskNameDescriptor {
/*    */   @NotNull
/* 14 */   public static final TerminalExplainCommandTask INSTANCE = new TerminalExplainCommandTask(); @NotNull private static final TaskName name = new TaskName("terminal-explain-command"); @NotNull public TaskName getName() { return name; }
/*    */ 
/*    */   
/*    */   @NotNull
/* 18 */   public final TaskCall default(@NotNull DeviceMetadata device, @NotNull TerminalMetadata terminal, @NotNull TerminalHistory history, @NotNull String command) { Intrinsics.checkNotNullParameter(device, "device"); Intrinsics.checkNotNullParameter(terminal, "terminal"); Intrinsics.checkNotNullParameter(history, "history"); Intrinsics.checkNotNullParameter(command, "command"); return new TaskCall(getName().tag(Default.INSTANCE.getTag()), TaskParameters.Companion.build(new TerminalExplainCommandTask$default$1(device, terminal, history, command))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 19 */   static final class TerminalExplainCommandTask$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)TerminalExplainCommandTask.Schema.INSTANCE.getDevice(), this.$device);
/* 20 */       $this$build.add((AttributeDescriptor)TerminalExplainCommandTask.Schema.INSTANCE.getTerminal(), this.$terminal);
/* 21 */       $this$build.add((AttributeDescriptor)TerminalExplainCommandTask.Schema.INSTANCE.getHistory(), this.$history);
/* 22 */       $this$build.add((AttributeDescriptor)TerminalExplainCommandTask.Schema.INSTANCE.getCommand(), this.$command); }
/*    */     
/*    */     TerminalExplainCommandTask$default$1(DeviceMetadata $device, TerminalMetadata $terminal, TerminalHistory $history, String $command) {
/*    */       super(1);
/*    */     } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R2\020\003\032 \022\034\022\032\022\006\b\001\022\0020\006\022\006\b\001\022\0020\007\022\006\b\001\022\0020\b0\0050\004X\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\r\020\016R\021\020\017\032\0020\020¢\006\b\n\000\032\004\b\021\020\022R\021\020\023\032\0020\024¢\006\b\n\000\032\004\b\025\020\026R\021\020\027\032\0020\030¢\006\b\n\000\032\004\b\031\020\032¨\006\033"}, d2 = {"Lai/grazie/model/task/library/v2/terminal/TerminalExplainCommandTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key;", "Lai/grazie/utils/attributes/Attributes$Value;", "", "getAll", "()Ljava/util/List;", "command", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getCommand", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "device", "Lai/grazie/model/task/library/terminal/attributes/DeviceMetadataAttr;", "getDevice", "()Lai/grazie/model/task/library/terminal/attributes/DeviceMetadataAttr;", "history", "Lai/grazie/model/task/library/terminal/attributes/TerminalHistoryAttr;", "getHistory", "()Lai/grazie/model/task/library/terminal/attributes/TerminalHistoryAttr;", "terminal", "Lai/grazie/model/task/library/terminal/attributes/TerminalMetadataAttr;", "getTerminal", "()Lai/grazie/model/task/library/terminal/attributes/TerminalMetadataAttr;", "model-task"})
/*    */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 29 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final DeviceMetadataAttr device = new DeviceMetadataAttr("device"); @NotNull public final DeviceMetadataAttr getDevice() { return device; } @NotNull
/* 30 */     private static final TerminalMetadataAttr terminal = new TerminalMetadataAttr("terminal"); @NotNull public final TerminalMetadataAttr getTerminal() { return terminal; } @NotNull
/* 31 */     private static final TerminalHistoryAttr history = new TerminalHistoryAttr("history"); @NotNull public final TerminalHistoryAttr getHistory() { return history; } @NotNull
/* 32 */     private static final AttributeDescriptor.Text command = new AttributeDescriptor.Text("command"); @NotNull private static final List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> all; @NotNull public final AttributeDescriptor.Text getCommand() { return command; }
/*    */     @NotNull
/* 34 */     public List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> getAll() { return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[4]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)device; arrayOfAttributeDescriptor[1] = (AttributeDescriptor)terminal; arrayOfAttributeDescriptor[2] = (AttributeDescriptor)history; arrayOfAttributeDescriptor[3] = (AttributeDescriptor)command; all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\terminal\TerminalExplainCommandTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */