/*    */ package ai.grazie.model.task.library.v2.text.youtrack;
/*    */ 
/*    */ import ai.grazie.model.task.id.TaskSchemaDescriptor;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R2\020\003\032 \022\034\022\032\022\006\b\001\022\0020\006\022\006\b\001\022\0020\007\022\006\b\001\022\0020\b0\0050\004X\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\r\020\016R\021\020\017\032\0020\020¢\006\b\n\000\032\004\b\021\020\022R\021\020\023\032\0020\f¢\006\b\n\000\032\004\b\024\020\016R\021\020\025\032\0020\026¢\006\b\n\000\032\004\b\027\020\030R\021\020\031\032\0020\032¢\006\b\n\000\032\004\b\033\020\034¨\006\035"}, d2 = {"Lai/grazie/model/task/library/v2/text/youtrack/SuggestOneFieldForTicket$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key;", "Lai/grazie/utils/attributes/Attributes$Value;", "", "getAll", "()Ljava/util/List;", "canBeEmpty", "Lai/grazie/utils/attributes/AttributeDescriptor$Bool;", "getCanBeEmpty", "()Lai/grazie/utils/attributes/AttributeDescriptor$Bool;", "fieldName", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getFieldName", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "multi", "getMulti", "ticket", "Lai/grazie/model/task/library/v2/text/youtrack/TicketAttr;", "getTicket", "()Lai/grazie/model/task/library/v2/text/youtrack/TicketAttr;", "values", "Lai/grazie/model/task/library/v2/text/youtrack/ValuesAttr;", "getValues", "()Lai/grazie/model/task/library/v2/text/youtrack/ValuesAttr;", "model-task"})
/*    */ public final class Schema
/*    */   implements TaskSchemaDescriptor
/*    */ {
/*    */   @NotNull
/* 29 */   public static final Schema INSTANCE = new Schema(); @NotNull private static final ValuesAttr values = new ValuesAttr("values"); @NotNull public final ValuesAttr getValues() { return values; } @NotNull
/* 30 */   private static final TicketAttr ticket = new TicketAttr("ticket"); @NotNull public final TicketAttr getTicket() { return ticket; } @NotNull
/* 31 */   private static final AttributeDescriptor.Bool canBeEmpty = new AttributeDescriptor.Bool("canBeEmpty"); @NotNull public final AttributeDescriptor.Bool getCanBeEmpty() { return canBeEmpty; } @NotNull
/* 32 */   private static final AttributeDescriptor.Bool multi = new AttributeDescriptor.Bool("multi"); @NotNull public final AttributeDescriptor.Bool getMulti() { return multi; } @NotNull
/* 33 */   private static final AttributeDescriptor.Text fieldName = new AttributeDescriptor.Text("fieldName"); @NotNull public final AttributeDescriptor.Text getFieldName() { return fieldName; } @NotNull
/*    */   private static final List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> all; @NotNull
/* 35 */   public List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> getAll() { return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[5]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)values; arrayOfAttributeDescriptor[1] = (AttributeDescriptor)ticket; arrayOfAttributeDescriptor[2] = (AttributeDescriptor)canBeEmpty; arrayOfAttributeDescriptor[3] = (AttributeDescriptor)multi; arrayOfAttributeDescriptor[4] = (AttributeDescriptor)fieldName; all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\text\youtrack\SuggestOneFieldForTicket$Schema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */