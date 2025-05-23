/*    */ package kotlinx.serialization.json;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.PublishedApi;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.descriptors.PrimitiveKind;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptorsKt;
/*    */ import kotlinx.serialization.descriptors.SerialKind;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.json.internal.JsonExceptionsKt;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\bÁ\002\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J\030\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\002H\026J\020\020\016\032\0020\0022\006\020\017\032\0020\020H\026R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\b¨\006\021"}, d2 = {"Lkotlinx/serialization/json/JsonPrimitiveSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonPrimitive;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "kotlinx-serialization-json"})
/*    */ @PublishedApi
/*    */ public final class JsonPrimitiveSerializer
/*    */   implements KSerializer<JsonPrimitive>
/*    */ {
/*    */   @NotNull
/*    */   public SerialDescriptor getDescriptor() {
/* 60 */     return descriptor; } @NotNull
/* 61 */   public static final JsonPrimitiveSerializer INSTANCE = new JsonPrimitiveSerializer(); @NotNull private static final SerialDescriptor descriptor = SerialDescriptorsKt.buildSerialDescriptor$default("kotlinx.serialization.json.JsonPrimitive", (SerialKind)PrimitiveKind.STRING.INSTANCE, new SerialDescriptor[0], null, 8, null);
/*    */   
/*    */   public void serialize(@NotNull Encoder encoder, @NotNull JsonPrimitive value) {
/* 64 */     Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); JsonElementSerializersKt.access$verify(encoder);
/* 65 */     if (value instanceof JsonNull) {
/* 66 */       encoder.encodeSerializableValue((SerializationStrategy)JsonNullSerializer.INSTANCE, JsonNull.INSTANCE);
/*    */     } else {
/* 68 */       encoder.encodeSerializableValue((SerializationStrategy)JsonLiteralSerializer.INSTANCE, value);
/*    */     } 
/*    */   }
/*    */   @NotNull
/*    */   public JsonPrimitive deserialize(@NotNull Decoder decoder) {
/* 73 */     Intrinsics.checkNotNullParameter(decoder, "decoder"); JsonElement result = JsonElementSerializersKt.asJsonDecoder(decoder).decodeJsonElement();
/* 74 */     if (!(result instanceof JsonPrimitive)) throw JsonExceptionsKt.JsonDecodingException(-1, "Unexpected JSON element, expected JsonPrimitive, had " + Reflection.getOrCreateKotlinClass(result.getClass()), (CharSequence)result.toString()); 
/* 75 */     return (JsonPrimitive)result;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\JsonPrimitiveSerializer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */