/*    */ package ai.grazie.api.gateway.api.task;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SealedClassSerializer;
/*    */ import kotlinx.serialization.internal.ObjectSerializer;
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
/* 95 */     KClass[] arrayOfKClass = new KClass[6]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V3.TaskData.Content.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V3.TaskData.ExecutionMetadata.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V3.TaskData.FinishMetadata.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V3.TaskData.FunctionCall.class); arrayOfKClass[4] = Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V3.TaskData.QuotaMetadata.class); arrayOfKClass[5] = Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V3.TaskData.UnknownMetadata.class); KSerializer[] arrayOfKSerializer = new KSerializer[6]; arrayOfKSerializer[0] = (KSerializer)TaskAPI.Stream.V3.TaskData.Content.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)TaskAPI.Stream.V3.TaskData.ExecutionMetadata.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)TaskAPI.Stream.V3.TaskData.FinishMetadata.$serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)TaskAPI.Stream.V3.TaskData.FunctionCall.$serializer.INSTANCE; arrayOfKSerializer[4] = (KSerializer)TaskAPI.Stream.V3.TaskData.QuotaMetadata.$serializer.INSTANCE; arrayOfKSerializer[5] = (KSerializer)new ObjectSerializer("UnknownMetadata", TaskAPI.Stream.V3.TaskData.UnknownMetadata.INSTANCE, new java.lang.annotation.Annotation[0]); return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.api.gateway.api.task.TaskAPI.Stream.V3.TaskData", Reflection.getOrCreateKotlinClass(TaskAPI.Stream.V3.TaskData.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\task\TaskAPI$Stream$V3$TaskData$Companion$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */