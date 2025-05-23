/*    */ package ai.grazie.model.task.library.v2.terminal;
/*    */ 
/*    */ import ai.grazie.model.task.id.TaskSchemaDescriptor;
/*    */ import ai.grazie.model.task.library.terminal.attributes.DeviceMetadataAttr;
/*    */ import ai.grazie.model.task.library.terminal.attributes.TerminalHistoryEntryAttr;
/*    */ import ai.grazie.model.task.library.terminal.attributes.TerminalMetadataAttr;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\"\020\003\032\020\022\f\022\n\022\006\b\001\022\0020\0060\0050\004X\004¢\006\b\n\000\032\004\b\007\020\bR\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\013\020\fR\021\020\r\032\0020\016¢\006\b\n\000\032\004\b\017\020\020R\021\020\021\032\0020\022¢\006\b\n\000\032\004\b\023\020\024¨\006\025"}, d2 = {"Lai/grazie/model/task/library/v2/terminal/TerminalFixCommandTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Json;", "", "getAll", "()Ljava/util/List;", "command", "Lai/grazie/model/task/library/terminal/attributes/TerminalHistoryEntryAttr;", "getCommand", "()Lai/grazie/model/task/library/terminal/attributes/TerminalHistoryEntryAttr;", "device", "Lai/grazie/model/task/library/terminal/attributes/DeviceMetadataAttr;", "getDevice", "()Lai/grazie/model/task/library/terminal/attributes/DeviceMetadataAttr;", "terminal", "Lai/grazie/model/task/library/terminal/attributes/TerminalMetadataAttr;", "getTerminal", "()Lai/grazie/model/task/library/terminal/attributes/TerminalMetadataAttr;", "model-task"})
/*    */ public final class Schema
/*    */   implements TaskSchemaDescriptor
/*    */ {
/*    */   @NotNull
/* 27 */   public static final Schema INSTANCE = new Schema(); @NotNull private static final DeviceMetadataAttr device = new DeviceMetadataAttr("device"); @NotNull public final DeviceMetadataAttr getDevice() { return device; } @NotNull
/* 28 */   private static final TerminalMetadataAttr terminal = new TerminalMetadataAttr("terminal"); @NotNull public final TerminalMetadataAttr getTerminal() { return terminal; } @NotNull
/* 29 */   private static final TerminalHistoryEntryAttr command = new TerminalHistoryEntryAttr("command"); @NotNull public final TerminalHistoryEntryAttr getCommand() { return command; } @NotNull
/*    */   private static final List<AttributeDescriptor.Json<? extends Object>> all; @NotNull
/* 31 */   public List<AttributeDescriptor.Json<? extends Object>> getAll() { return all; } static { AttributeDescriptor.Json[] arrayOfJson = new AttributeDescriptor.Json[3]; arrayOfJson[0] = (AttributeDescriptor.Json)device; arrayOfJson[1] = (AttributeDescriptor.Json)terminal; arrayOfJson[2] = (AttributeDescriptor.Json)command; all = CollectionsKt.listOf((Object[])arrayOfJson); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\terminal\TerminalFixCommandTask$Schema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */