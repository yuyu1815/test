/*   */ package ai.grazie.code.indexing.model;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/code/indexing/model/IndexAlias$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/code/indexing/model/IndexAlias;", "model-indexing"})
/*   */ public final class Companion {
/*   */   @NotNull
/*   */   public final KSerializer<IndexAlias> serializer() {
/* 7 */     KClass[] arrayOfKClass = new KClass[4]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(ExperimentalIndices.Raptor.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(ProductionIndices.CodeBlocks.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(ProductionIndices.Files.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(ProductionIndices.Symbols.class); KSerializer[] arrayOfKSerializer = new KSerializer[4]; Annotation[] arrayOfAnnotation2 = new Annotation[1]; arrayOfAnnotation2[0] = 
/* 8 */       (Annotation)new IndexAlias$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("name"); arrayOfKSerializer[0] = (KSerializer)new ObjectSerializer("ai.grazie.code.indexing.model.ExperimentalIndices.Raptor", ExperimentalIndices.Raptor.INSTANCE, arrayOfAnnotation2); arrayOfAnnotation2 = new Annotation[1]; arrayOfAnnotation2[0] = (Annotation)new IndexAlias$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("name"); arrayOfKSerializer[1] = (KSerializer)new ObjectSerializer("ai.grazie.code.indexing.model.ProductionIndices.CodeBlocks", ProductionIndices.CodeBlocks.INSTANCE, arrayOfAnnotation2); arrayOfAnnotation2 = new Annotation[1]; arrayOfAnnotation2[0] = (Annotation)new IndexAlias$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("name"); arrayOfKSerializer[2] = (KSerializer)new ObjectSerializer("ai.grazie.code.indexing.model.ProductionIndices.Files", ProductionIndices.Files.INSTANCE, arrayOfAnnotation2); arrayOfAnnotation2 = new Annotation[1]; arrayOfAnnotation2[0] = (Annotation)new IndexAlias$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("name"); arrayOfKSerializer[3] = (KSerializer)new ObjectSerializer("ai.grazie.code.indexing.model.ProductionIndices.Symbols", ProductionIndices.Symbols.INSTANCE, arrayOfAnnotation2); Annotation[] arrayOfAnnotation1 = new Annotation[1]; arrayOfAnnotation1[0] = (Annotation)new IndexAlias$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("name");
/*   */     return (KSerializer<IndexAlias>)new SealedClassSerializer("ai.grazie.code.indexing.model.IndexAlias", Reflection.getOrCreateKotlinClass(IndexAlias.class), arrayOfKClass, arrayOfKSerializer, arrayOfAnnotation1);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\IndexAlias$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */