/*    */ package ai.grazie.model.task.library.v2.chat;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.internal.EnumsKt;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */ final class null
/*    */   extends Lambda implements Function0<KSerializer<Object>> {
/*    */   public static final null INSTANCE = (null)new Object();
/*    */   
/*    */   public final KSerializer<Object> invoke() {
/* 15 */     return EnumsKt.createSimpleEnumSerializer("ai.grazie.model.task.library.v2.chat.TasksChatRole", (Enum[])TasksChatRole.values());
/*    */   }
/*    */   
/*    */   null() {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\chat\TasksChatRole$Companion$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */