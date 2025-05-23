/*   */ package ai.grazie.model.llm.chat.response;
/*   */ import kotlinx.serialization.KSerializer;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*   */ final class null extends Lambda implements Function0<KSerializer<Object>> {
/*   */   public final KSerializer<Object> invoke() {
/* 7 */     KClass[] arrayOfKClass = new KClass[2]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(LLMResponseFormat.Json.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(LLMResponseFormat.Text.class); KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)LLMResponseFormat.Json.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)LLMResponseFormat.Text.$serializer.INSTANCE; return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.model.llm.chat.response.LLMResponseFormat", Reflection.getOrCreateKotlinClass(LLMResponseFormat.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*   */   }
/*   */   
/*   */   public static final null INSTANCE = (null)new Object();
/*   */   
/*   */   null() {
/*   */     super(0);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\response\LLMResponseFormat$Companion$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */