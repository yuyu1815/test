/*    */ package ai.grazie.model.task.library.v2.chat;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SealedClassSerializer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function0<KSerializer<Object>>
/*    */ {
/*    */   public static final null INSTANCE = (null)new Object();
/*    */   
/*    */   null() {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   public final KSerializer<Object> invoke() {
/* 30 */     KClass[] arrayOfKClass = new KClass[6]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(TasksChatFunctionCallMessage.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(TasksChatFunctionResponseMessage.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(TasksChatTaskCallMessage.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(TasksChatTaskMessage.class); arrayOfKClass[4] = Reflection.getOrCreateKotlinClass(TasksChatAssistantMessage.class); arrayOfKClass[5] = Reflection.getOrCreateKotlinClass(TasksChatUserMessage.class); KSerializer[] arrayOfKSerializer = new KSerializer[6]; arrayOfKSerializer[0] = (KSerializer)TasksChatFunctionCallMessage.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)TasksChatFunctionResponseMessage.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)TasksChatTaskCallMessage.$serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)TasksChatTaskMessage.$serializer.INSTANCE; arrayOfKSerializer[4] = (KSerializer)TasksChatAssistantMessage.$serializer.INSTANCE; arrayOfKSerializer[5] = (KSerializer)TasksChatUserMessage.$serializer.INSTANCE; return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.model.task.library.v2.chat.TasksChatMessage", Reflection.getOrCreateKotlinClass(TasksChatMessage.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\chat\TasksChatMessage$Companion$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */