/*    */ package ai.grazie.model.task.library.v2.text.youtrack;
/*    */ 
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\b\007\030\0002\b\022\004\022\0020\0020\001B\r\022\006\020\003\032\0020\004¢\006\002\020\005J\020\020\006\032\0020\0022\006\020\007\032\0020\004H\024J\020\020\b\032\0020\0042\006\020\007\032\0020\002H\024¨\006\t"}, d2 = {"Lai/grazie/model/task/library/v2/text/youtrack/TicketAttr;", "Lai/grazie/utils/attributes/AttributeDescriptor$Json;", "Lai/grazie/model/task/library/v2/text/youtrack/Ticket;", "name", "", "(Ljava/lang/String;)V", "fromJson", "value", "toJson", "model-task"})
/*    */ @SourceDebugExtension({"SMAP\nAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Attributes.kt\nai/grazie/model/task/library/v2/text/youtrack/TicketAttr\n+ 2 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,28:1\n28#2:29\n70#2:30\n*S KotlinDebug\n*F\n+ 1 Attributes.kt\nai/grazie/model/task/library/v2/text/youtrack/TicketAttr\n*L\n21#1:29\n25#1:30\n*E\n"})
/*    */ public final class TicketAttr
/*    */   extends AttributeDescriptor.Json<Ticket>
/*    */ {
/*    */   public TicketAttr(@NotNull String name) {
/* 19 */     super(name, false);
/*    */   } @NotNull
/* 21 */   protected String toJson(@NotNull Ticket value) { Intrinsics.checkNotNullParameter(value, "value"); JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0; return 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 29 */       this_$iv.string((SerializationStrategy)Ticket.Companion.serializer(), value); } @NotNull protected Ticket fromJson(@NotNull String value) { Intrinsics.checkNotNullParameter(value, "value"); JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$parse = 0;
/* 30 */     return (Ticket)this_$iv.parse((DeserializationStrategy)Ticket.Companion.serializer(), value); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\text\youtrack\TicketAttr.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */