/*    */ package ai.grazie.model.cloud.annotations;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/cloud/annotations/AnnotationInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/cloud/annotations/AnnotationInfo;", "model-cloud"})
/*    */ public final class Companion {
/*    */   @NotNull
/*    */   public final KSerializer<AnnotationInfo> serializer() {
/* 11 */     KClass[] arrayOfKClass = new KClass[2]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(DeprecatedAPI.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(DeprecatedParam.class); KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)DeprecatedAPI.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)DeprecatedParam.$serializer.INSTANCE; return (KSerializer<AnnotationInfo>)new SealedClassSerializer("ai.grazie.model.cloud.annotations.AnnotationInfo", Reflection.getOrCreateKotlinClass(AnnotationInfo.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\annotations\AnnotationInfo$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */