/*     */ package ai.grazie.api.gateway.api.llm;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.reflect.KClass;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SealedClassSerializer;
/*     */ import kotlinx.serialization.internal.ObjectSerializer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */ final class null
/*     */   extends Lambda
/*     */   implements Function0<KSerializer<Object>>
/*     */ {
/*     */   public static final null INSTANCE = (null)new Object();
/*     */   
/*     */   null() {
/*     */     super(0);
/*     */   }
/*     */   
/*     */   public final KSerializer<Object> invoke() {
/* 111 */     KClass[] arrayOfKClass = new KClass[5]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(LlmAPI.Chat.Stream.V7.LLMData.Content.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(LlmAPI.Chat.Stream.V7.LLMData.FinishMetadata.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(LlmAPI.Chat.Stream.V7.LLMData.FunctionCall.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(LlmAPI.Chat.Stream.V7.LLMData.QuotaMetadata.class); arrayOfKClass[4] = Reflection.getOrCreateKotlinClass(LlmAPI.Chat.Stream.V7.LLMData.UnknownMetadata.class); KSerializer[] arrayOfKSerializer = new KSerializer[5]; arrayOfKSerializer[0] = (KSerializer)LlmAPI.Chat.Stream.V7.LLMData.Content.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)LlmAPI.Chat.Stream.V7.LLMData.FinishMetadata.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)LlmAPI.Chat.Stream.V7.LLMData.FunctionCall.$serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)LlmAPI.Chat.Stream.V7.LLMData.QuotaMetadata.$serializer.INSTANCE; arrayOfKSerializer[4] = (KSerializer)new ObjectSerializer("UnknownMetadata", LlmAPI.Chat.Stream.V7.LLMData.UnknownMetadata.INSTANCE, new java.lang.annotation.Annotation[0]); return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.api.gateway.api.llm.LlmAPI.Chat.Stream.V7.LLMData", Reflection.getOrCreateKotlinClass(LlmAPI.Chat.Stream.V7.LLMData.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\llm\LlmAPI$Chat$Stream$V7$LLMData$Companion$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */