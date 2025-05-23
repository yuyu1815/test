/*    */ package ai.grazie.model.llm.chat.v5;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */ final class null extends Lambda implements Function0<KSerializer<Object>> {
/*    */   public final KSerializer<Object> invoke() {
/* 11 */     KClass[] arrayOfKClass = new KClass[4]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(LLMChatAssistantMessage.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(LLMChatFunctionMessage.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(LLMChatSystemMessage.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(LLMChatUserMessage.class); KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = (KSerializer)LLMChatAssistantMessage.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)LLMChatFunctionMessage.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)LLMChatSystemMessage.$serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)LLMChatUserMessage.$serializer.INSTANCE; return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.model.llm.chat.v5.LLMChatMessage", Reflection.getOrCreateKotlinClass(LLMChatMessage.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*    */   }
/*    */   
/*    */   public static final null INSTANCE = (null)new Object();
/*    */   
/*    */   null() {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\v5\LLMChatMessage$Companion$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */