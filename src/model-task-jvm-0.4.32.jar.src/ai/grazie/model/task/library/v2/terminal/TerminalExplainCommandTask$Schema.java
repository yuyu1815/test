/*    */ package ai.grazie.model.task.library.v2.terminal;
/*    */ 
/*    */ import ai.grazie.model.task.id.TaskSchemaDescriptor;
/*    */ import ai.grazie.model.task.library.terminal.attributes.DeviceMetadataAttr;
/*    */ import ai.grazie.model.task.library.terminal.attributes.TerminalHistoryAttr;
/*    */ import ai.grazie.model.task.library.terminal.attributes.TerminalMetadataAttr;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import ai.grazie.utils.attributes.Attributes;
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
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R2\020\003\032 \022\034\022\032\022\006\b\001\022\0020\006\022\006\b\001\022\0020\007\022\006\b\001\022\0020\b0\0050\004X\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\r\020\016R\021\020\017\032\0020\020¢\006\b\n\000\032\004\b\021\020\022R\021\020\023\032\0020\024¢\006\b\n\000\032\004\b\025\020\026R\021\020\027\032\0020\030¢\006\b\n\000\032\004\b\031\020\032¨\006\033"}, d2 = {"Lai/grazie/model/task/library/v2/terminal/TerminalExplainCommandTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key;", "Lai/grazie/utils/attributes/Attributes$Value;", "", "getAll", "()Ljava/util/List;", "command", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getCommand", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "device", "Lai/grazie/model/task/library/terminal/attributes/DeviceMetadataAttr;", "getDevice", "()Lai/grazie/model/task/library/terminal/attributes/DeviceMetadataAttr;", "history", "Lai/grazie/model/task/library/terminal/attributes/TerminalHistoryAttr;", "getHistory", "()Lai/grazie/model/task/library/terminal/attributes/TerminalHistoryAttr;", "terminal", "Lai/grazie/model/task/library/terminal/attributes/TerminalMetadataAttr;", "getTerminal", "()Lai/grazie/model/task/library/terminal/attributes/TerminalMetadataAttr;", "model-task"})
/*    */ public final class Schema
/*    */   implements TaskSchemaDescriptor
/*    */ {
/*    */   @NotNull
/* 29 */   public static final Schema INSTANCE = new Schema(); @NotNull private static final DeviceMetadataAttr device = new DeviceMetadataAttr("device"); @NotNull public final DeviceMetadataAttr getDevice() { return device; } @NotNull
/* 30 */   private static final TerminalMetadataAttr terminal = new TerminalMetadataAttr("terminal"); @NotNull public final TerminalMetadataAttr getTerminal() { return terminal; } @NotNull
/* 31 */   private static final TerminalHistoryAttr history = new TerminalHistoryAttr("history"); @NotNull public final TerminalHistoryAttr getHistory() { return history; } @NotNull
/* 32 */   private static final AttributeDescriptor.Text command = new AttributeDescriptor.Text("command"); @NotNull public final AttributeDescriptor.Text getCommand() { return command; } @NotNull
/*    */   private static final List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> all; @NotNull
/* 34 */   public List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> getAll() { return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[4]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)device; arrayOfAttributeDescriptor[1] = (AttributeDescriptor)terminal; arrayOfAttributeDescriptor[2] = (AttributeDescriptor)history; arrayOfAttributeDescriptor[3] = (AttributeDescriptor)command; all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\terminal\TerminalExplainCommandTask$Schema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */