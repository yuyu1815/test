/*    */ package ai.grazie.code.indexing.model;
/*    */ 
/*    */ import java.lang.annotation.Annotation;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.internal.ObjectSerializer;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function0<KSerializer<Object>> {
/*    */   public static final null INSTANCE = (null)new Object();
/*    */   
/*    */   public final KSerializer<Object> invoke() {
/* 17 */     Annotation[] arrayOfAnnotation = new Annotation[1]; arrayOfAnnotation[0] = (Annotation)new IndexAlias$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("name"); return (KSerializer<Object>)new ObjectSerializer("ai.grazie.code.indexing.model.ProductionIndices.CodeBlocks", ProductionIndices.CodeBlocks.INSTANCE, arrayOfAnnotation);
/*    */   }
/*    */   
/*    */   null() {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\ProductionIndices$CodeBlocks$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */