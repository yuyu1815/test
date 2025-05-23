/*    */ package ai.grazie.model.task.library.v2.text.youtrack;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\013\n\002\b\002\n\002\020\021\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001:\001\024B\007\b\002¢\006\002\020\002J9\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\0162\f\020\020\032\b\022\004\022\0020\0220\021¢\006\002\020\023R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\025"}, d2 = {"Lai/grazie/model/task/library/v2/text/youtrack/SuggestOneFieldForTicket;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "ticket", "Lai/grazie/model/task/library/v2/text/youtrack/Ticket;", "fieldName", "", "canBeEmpty", "", "multi", "values", "", "Lai/grazie/model/task/library/v2/text/youtrack/FieldValue;", "(Lai/grazie/model/task/library/v2/text/youtrack/Ticket;Ljava/lang/String;ZZ[Lai/grazie/model/task/library/v2/text/youtrack/FieldValue;)Lai/grazie/model/task/exec/TaskCall;", "Schema", "model-task"})
/*    */ public final class SuggestOneFieldForTicket implements TaskNameDescriptor {
/*    */   @NotNull
/* 13 */   public static final SuggestOneFieldForTicket INSTANCE = new SuggestOneFieldForTicket(); @NotNull private static final TaskName name = new TaskName("youtrack-suggest-one-field-for-ticket"); @NotNull public TaskName getName() { return name; }
/*    */ 
/*    */   
/*    */   @NotNull
/* 17 */   public final TaskCall default(@NotNull Ticket ticket, @NotNull String fieldName, boolean canBeEmpty, boolean multi, @NotNull FieldValue[] values) { Intrinsics.checkNotNullParameter(ticket, "ticket"); Intrinsics.checkNotNullParameter(fieldName, "fieldName"); Intrinsics.checkNotNullParameter(values, "values"); return new TaskCall(getName().tag(TaskTag.Companion.getDefault()), TaskParameters.Companion.build(new SuggestOneFieldForTicket$default$1(values, ticket, canBeEmpty, multi, fieldName))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 18 */   static final class SuggestOneFieldForTicket$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)SuggestOneFieldForTicket.Schema.INSTANCE.getValues(), this.$values);
/* 19 */       $this$build.add((AttributeDescriptor)SuggestOneFieldForTicket.Schema.INSTANCE.getTicket(), this.$ticket);
/* 20 */       $this$build.add((AttributeDescriptor)SuggestOneFieldForTicket.Schema.INSTANCE.getCanBeEmpty(), Boolean.valueOf(this.$canBeEmpty));
/* 21 */       $this$build.add((AttributeDescriptor)SuggestOneFieldForTicket.Schema.INSTANCE.getMulti(), Boolean.valueOf(this.$multi));
/* 22 */       $this$build.add((AttributeDescriptor)SuggestOneFieldForTicket.Schema.INSTANCE.getFieldName(), this.$fieldName); }
/*    */     
/*    */     SuggestOneFieldForTicket$default$1(FieldValue[] $values, Ticket $ticket, boolean $canBeEmpty, boolean $multi, String $fieldName) {
/*    */       super(1);
/*    */     } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R2\020\003\032 \022\034\022\032\022\006\b\001\022\0020\006\022\006\b\001\022\0020\007\022\006\b\001\022\0020\b0\0050\004X\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\r\020\016R\021\020\017\032\0020\020¢\006\b\n\000\032\004\b\021\020\022R\021\020\023\032\0020\f¢\006\b\n\000\032\004\b\024\020\016R\021\020\025\032\0020\026¢\006\b\n\000\032\004\b\027\020\030R\021\020\031\032\0020\032¢\006\b\n\000\032\004\b\033\020\034¨\006\035"}, d2 = {"Lai/grazie/model/task/library/v2/text/youtrack/SuggestOneFieldForTicket$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key;", "Lai/grazie/utils/attributes/Attributes$Value;", "", "getAll", "()Ljava/util/List;", "canBeEmpty", "Lai/grazie/utils/attributes/AttributeDescriptor$Bool;", "getCanBeEmpty", "()Lai/grazie/utils/attributes/AttributeDescriptor$Bool;", "fieldName", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getFieldName", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "multi", "getMulti", "ticket", "Lai/grazie/model/task/library/v2/text/youtrack/TicketAttr;", "getTicket", "()Lai/grazie/model/task/library/v2/text/youtrack/TicketAttr;", "values", "Lai/grazie/model/task/library/v2/text/youtrack/ValuesAttr;", "getValues", "()Lai/grazie/model/task/library/v2/text/youtrack/ValuesAttr;", "model-task"})
/*    */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 29 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final ValuesAttr values = new ValuesAttr("values"); @NotNull public final ValuesAttr getValues() { return values; } @NotNull
/* 30 */     private static final TicketAttr ticket = new TicketAttr("ticket"); @NotNull public final TicketAttr getTicket() { return ticket; } @NotNull
/* 31 */     private static final AttributeDescriptor.Bool canBeEmpty = new AttributeDescriptor.Bool("canBeEmpty"); @NotNull public final AttributeDescriptor.Bool getCanBeEmpty() { return canBeEmpty; } @NotNull
/* 32 */     private static final AttributeDescriptor.Bool multi = new AttributeDescriptor.Bool("multi"); @NotNull public final AttributeDescriptor.Bool getMulti() { return multi; } @NotNull
/* 33 */     private static final AttributeDescriptor.Text fieldName = new AttributeDescriptor.Text("fieldName"); @NotNull private static final List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> all; @NotNull public final AttributeDescriptor.Text getFieldName() { return fieldName; }
/*    */     @NotNull
/* 35 */     public List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> getAll() { return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[5]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)values; arrayOfAttributeDescriptor[1] = (AttributeDescriptor)ticket; arrayOfAttributeDescriptor[2] = (AttributeDescriptor)canBeEmpty; arrayOfAttributeDescriptor[3] = (AttributeDescriptor)multi; arrayOfAttributeDescriptor[4] = (AttributeDescriptor)fieldName; all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\text\youtrack\SuggestOneFieldForTicket.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */