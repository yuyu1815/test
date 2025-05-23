/*   */ package ai.grazie.utils.json.schema;
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/utils/json/schema/JSONSchemaType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/json/schema/JSONSchemaType;", "utils-common"})
/*   */ public final class Companion {
/*   */   @NotNull
/*   */   public final KSerializer<JSONSchemaType> serializer() {
/* 6 */     KClass[] arrayOfKClass = new KClass[3]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(JSONSchemaType.JSONIntegerType.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(JSONSchemaType.JSONObjectType.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(JSONSchemaType.JSONStringType.class); KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = (KSerializer)JSONSchemaType.JSONIntegerType.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)JSONSchemaType.JSONObjectType.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)JSONSchemaType.JSONStringType.$serializer.INSTANCE; return (KSerializer<JSONSchemaType>)new SealedClassSerializer("ai.grazie.utils.json.schema.JSONSchemaType", Reflection.getOrCreateKotlinClass(JSONSchemaType.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\json\schema\JSONSchemaType$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */