/*   */ package ai.grazie.code.indexing.model.cluster;
/*   */ import java.lang.annotation.Annotation;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*   */ final class null extends Lambda implements Function0<KSerializer<Object>> {
/*   */   public final KSerializer<Object> invoke() {
/* 7 */     KClass[] arrayOfKClass = new KClass[2]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(ClusterType.DirLevelBased.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(ClusterType.None.class); KSerializer[] arrayOfKSerializer = new KSerializer[2]; Annotation[] arrayOfAnnotation2 = new Annotation[1]; arrayOfAnnotation2[0] = 
/* 8 */       (Annotation)new ClusterType$DirLevelBased$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("_type"); arrayOfKSerializer[0] = (KSerializer)new ObjectSerializer("ai.grazie.code.indexing.model.cluster.ClusterType.DirLevelBased", ClusterType.DirLevelBased.INSTANCE, arrayOfAnnotation2); arrayOfAnnotation2 = new Annotation[1]; arrayOfAnnotation2[0] = (Annotation)new ClusterType$DirLevelBased$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("_type"); arrayOfKSerializer[1] = (KSerializer)new ObjectSerializer("ai.grazie.code.indexing.model.cluster.ClusterType.None", ClusterType.None.INSTANCE, arrayOfAnnotation2); Annotation[] arrayOfAnnotation1 = new Annotation[1]; arrayOfAnnotation1[0] = (Annotation)new ClusterType$DirLevelBased$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("_type");
/*   */     return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.code.indexing.model.cluster.ClusterType", Reflection.getOrCreateKotlinClass(ClusterType.class), arrayOfKClass, arrayOfKSerializer, arrayOfAnnotation1);
/*   */   }
/*   */   
/*   */   public static final null INSTANCE = (null)new Object();
/*   */   
/*   */   null() {
/*   */     super(0);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\cluster\ClusterType$Companion$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */