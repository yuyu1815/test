/*    */ package ai.grazie.model.task.data.v3;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SealedClassSerializer;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */ final class null
/*    */   extends Lambda implements Function0<KSerializer<Object>> {
/*    */   public final KSerializer<Object> invoke() {
/* 15 */     KClass[] arrayOfKClass = new KClass[6]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(TaskStreamFunctionCall.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(TaskStreamExecutionMetadata.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(TaskStreamFinishMetadata.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(TaskStreamQuotaMetaData.class); arrayOfKClass[4] = Reflection.getOrCreateKotlinClass(TaskStreamUnknownData.class); arrayOfKClass[5] = Reflection.getOrCreateKotlinClass(TaskStreamText.class); KSerializer[] arrayOfKSerializer = new KSerializer[6]; arrayOfKSerializer[0] = (KSerializer)TaskStreamFunctionCall.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)TaskStreamExecutionMetadata.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)TaskStreamFinishMetadata.$serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)TaskStreamQuotaMetaData.$serializer.INSTANCE; arrayOfKSerializer[4] = (KSerializer)TaskStreamUnknownData.$serializer.INSTANCE; arrayOfKSerializer[5] = (KSerializer)TaskStreamText.$serializer.INSTANCE; return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.model.task.data.v3.TaskStreamData", Reflection.getOrCreateKotlinClass(TaskStreamData.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*    */   }
/*    */   
/*    */   public static final null INSTANCE = (null)new Object();
/*    */   
/*    */   null() {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\data\v3\TaskStreamData$Companion$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */