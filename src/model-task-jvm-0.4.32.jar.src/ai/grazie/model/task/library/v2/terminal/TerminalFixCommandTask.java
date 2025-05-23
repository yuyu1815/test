/*    */ package ai.grazie.model.task.library.v2.terminal;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.model.task.library.terminal.DeviceMetadata;
/*    */ import ai.grazie.model.task.library.terminal.TerminalHistory;
/*    */ import ai.grazie.model.task.library.terminal.TerminalMetadata;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\0020\001:\001\017B\007\b\002¢\006\002\020\002J\036\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\016R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\020"}, d2 = {"Lai/grazie/model/task/library/v2/terminal/TerminalFixCommandTask;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "device", "Lai/grazie/model/task/library/terminal/DeviceMetadata;", "terminal", "Lai/grazie/model/task/library/terminal/TerminalMetadata;", "command", "Lai/grazie/model/task/library/terminal/TerminalHistory$HistoryEntry;", "Schema", "model-task"})
/*    */ public final class TerminalFixCommandTask implements TaskNameDescriptor {
/*    */   @NotNull
/* 13 */   public static final TerminalFixCommandTask INSTANCE = new TerminalFixCommandTask(); @NotNull private static final TaskName name = new TaskName("terminal-fix-command"); @NotNull public TaskName getName() { return name; }
/*    */ 
/*    */   
/*    */   @NotNull
/* 17 */   public final TaskCall default(@NotNull DeviceMetadata device, @NotNull TerminalMetadata terminal, @NotNull TerminalHistory.HistoryEntry command) { Intrinsics.checkNotNullParameter(device, "device"); Intrinsics.checkNotNullParameter(terminal, "terminal"); Intrinsics.checkNotNullParameter(command, "command"); return new TaskCall(getName().tag(Default.INSTANCE.getTag()), TaskParameters.Companion.build(new TerminalFixCommandTask$default$1(device, terminal, command))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 18 */   static final class TerminalFixCommandTask$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)TerminalFixCommandTask.Schema.INSTANCE.getDevice(), this.$device);
/* 19 */       $this$build.add((AttributeDescriptor)TerminalFixCommandTask.Schema.INSTANCE.getTerminal(), this.$terminal);
/* 20 */       $this$build.add((AttributeDescriptor)TerminalFixCommandTask.Schema.INSTANCE.getCommand(), this.$command); }
/*    */     
/*    */     TerminalFixCommandTask$default$1(DeviceMetadata $device, TerminalMetadata $terminal, TerminalHistory.HistoryEntry $command) {
/*    */       super(1);
/*    */     } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\"\020\003\032\020\022\f\022\n\022\006\b\001\022\0020\0060\0050\004X\004¢\006\b\n\000\032\004\b\007\020\bR\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\013\020\fR\021\020\r\032\0020\016¢\006\b\n\000\032\004\b\017\020\020R\021\020\021\032\0020\022¢\006\b\n\000\032\004\b\023\020\024¨\006\025"}, d2 = {"Lai/grazie/model/task/library/v2/terminal/TerminalFixCommandTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Json;", "", "getAll", "()Ljava/util/List;", "command", "Lai/grazie/model/task/library/terminal/attributes/TerminalHistoryEntryAttr;", "getCommand", "()Lai/grazie/model/task/library/terminal/attributes/TerminalHistoryEntryAttr;", "device", "Lai/grazie/model/task/library/terminal/attributes/DeviceMetadataAttr;", "getDevice", "()Lai/grazie/model/task/library/terminal/attributes/DeviceMetadataAttr;", "terminal", "Lai/grazie/model/task/library/terminal/attributes/TerminalMetadataAttr;", "getTerminal", "()Lai/grazie/model/task/library/terminal/attributes/TerminalMetadataAttr;", "model-task"})
/*    */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 27 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final DeviceMetadataAttr device = new DeviceMetadataAttr("device"); @NotNull public final DeviceMetadataAttr getDevice() { return device; } @NotNull
/* 28 */     private static final TerminalMetadataAttr terminal = new TerminalMetadataAttr("terminal"); @NotNull public final TerminalMetadataAttr getTerminal() { return terminal; } @NotNull
/* 29 */     private static final TerminalHistoryEntryAttr command = new TerminalHistoryEntryAttr("command"); @NotNull private static final List<AttributeDescriptor.Json<? extends Object>> all; @NotNull public final TerminalHistoryEntryAttr getCommand() { return command; }
/*    */     @NotNull
/* 31 */     public List<AttributeDescriptor.Json<? extends Object>> getAll() { return all; } static { AttributeDescriptor.Json[] arrayOfJson = new AttributeDescriptor.Json[3]; arrayOfJson[0] = (AttributeDescriptor.Json)device; arrayOfJson[1] = (AttributeDescriptor.Json)terminal; arrayOfJson[2] = (AttributeDescriptor.Json)command; all = CollectionsKt.listOf((Object[])arrayOfJson); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\terminal\TerminalFixCommandTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */