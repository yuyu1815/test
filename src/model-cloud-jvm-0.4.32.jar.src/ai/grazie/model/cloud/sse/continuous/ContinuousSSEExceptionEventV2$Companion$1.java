/*    */ package ai.grazie.model.cloud.sse.continuous;
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
/* 15 */     KClass[] arrayOfKClass = new KClass[4]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(ContinuousSSEExceptionEventV2.Cancellation.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(ContinuousSSEExceptionEventV2.Error.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(ContinuousSSEExceptionEventV2.PrematureEnd.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(ContinuousSSEExceptionEventV2.Timeout.class); KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = (KSerializer)ContinuousSSEExceptionEventV2.Cancellation.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)ContinuousSSEExceptionEventV2.Error.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)ContinuousSSEExceptionEventV2.PrematureEnd.$serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)ContinuousSSEExceptionEventV2.Timeout.$serializer.INSTANCE; return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.model.cloud.sse.continuous.ContinuousSSEExceptionEventV2", Reflection.getOrCreateKotlinClass(ContinuousSSEExceptionEventV2.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*    */   }
/*    */   
/*    */   public static final null INSTANCE = (null)new Object();
/*    */   
/*    */   null() {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\sse\continuous\ContinuousSSEExceptionEventV2$Companion$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */