/*    */ package ai.grazie.model.task.library.v2.chat;
/*    */ 
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\020\000\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\"\020\003\032\020\022\f\022\n\022\006\b\001\022\0020\0060\0050\004X\004¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lai/grazie/model/task/library/v2/chat/ResharperAIChatTask$Schema;", "Lai/grazie/model/task/library/v2/chat/ChatTaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Json;", "", "getAll", "()Ljava/util/List;", "model-task"})
/*    */ public final class Schema
/*    */   implements ChatTaskSchemaDescriptor
/*    */ {
/*    */   @NotNull
/*    */   private static final List<AttributeDescriptor.Json<? extends Object>> all;
/*    */   @NotNull
/* 25 */   public static final Schema INSTANCE = new Schema(); @NotNull public List<AttributeDescriptor.Json<? extends Object>> getAll() { return all; } static { AttributeDescriptor.Json[] arrayOfJson = new AttributeDescriptor.Json[2]; arrayOfJson[0] = INSTANCE.getHistory(); arrayOfJson[1] = INSTANCE.getFunctions(); all = CollectionsKt.listOf((Object[])arrayOfJson); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\chat\ResharperAIChatTask$Schema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */