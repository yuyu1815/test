/*    */ package kotlinx.serialization.json;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.NoWhenBranchMatchedException;
/*    */ import kotlin.PublishedApi;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
/*    */ import kotlinx.serialization.descriptors.PolymorphicKind;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptorsKt;
/*    */ import kotlinx.serialization.descriptors.SerialKind;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\bÁ\002\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J\030\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\002H\026J\020\020\016\032\0020\0022\006\020\017\032\0020\020H\026R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\b¨\006\021"}, d2 = {"Lkotlinx/serialization/json/JsonElementSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonElement;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "kotlinx-serialization-json"})
/*    */ @PublishedApi
/*    */ public final class JsonElementSerializer
/*    */   implements KSerializer<JsonElement>
/*    */ {
/*    */   @NotNull
/*    */   public SerialDescriptor getDescriptor() {
/* 29 */     return descriptor; } @NotNull
/* 30 */   public static final JsonElementSerializer INSTANCE = new JsonElementSerializer(); @NotNull private static final SerialDescriptor descriptor = SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.json.JsonElement", (SerialKind)PolymorphicKind.SEALED.INSTANCE, new SerialDescriptor[0], JsonElementSerializer::descriptor$lambda$5);
/*    */   
/* 32 */   private static final SerialDescriptor descriptor$lambda$5$lambda$0() { return JsonPrimitiveSerializer.INSTANCE.getDescriptor(); } private static final Unit descriptor$lambda$5(ClassSerialDescriptorBuilder $this$buildSerialDescriptor) { Intrinsics.checkNotNullParameter($this$buildSerialDescriptor, "$this$buildSerialDescriptor"); ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, "JsonPrimitive", JsonElementSerializersKt.access$defer(JsonElementSerializer::descriptor$lambda$5$lambda$0), null, false, 12, null);
/* 33 */     ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, "JsonNull", JsonElementSerializersKt.access$defer(JsonElementSerializer::descriptor$lambda$5$lambda$1), null, false, 12, null);
/* 34 */     ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, "JsonLiteral", JsonElementSerializersKt.access$defer(JsonElementSerializer::descriptor$lambda$5$lambda$2), null, false, 12, null);
/* 35 */     ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, "JsonObject", JsonElementSerializersKt.access$defer(JsonElementSerializer::descriptor$lambda$5$lambda$3), null, false, 12, null);
/* 36 */     ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, "JsonArray", JsonElementSerializersKt.access$defer(JsonElementSerializer::descriptor$lambda$5$lambda$4), null, false, 12, null);
/* 37 */     return Unit.INSTANCE; }
/*    */   private static final SerialDescriptor descriptor$lambda$5$lambda$1() { return JsonNullSerializer.INSTANCE.getDescriptor(); }
/*    */   private static final SerialDescriptor descriptor$lambda$5$lambda$2() { return JsonLiteralSerializer.INSTANCE.getDescriptor(); }
/* 40 */   public void serialize(@NotNull Encoder encoder, @NotNull JsonElement value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); JsonElementSerializersKt.access$verify(encoder);
/* 41 */     JsonElement jsonElement = value;
/* 42 */     if (jsonElement instanceof JsonPrimitive) { encoder.encodeSerializableValue((SerializationStrategy)JsonPrimitiveSerializer.INSTANCE, value); }
/* 43 */     else if (jsonElement instanceof JsonObject) { encoder.encodeSerializableValue((SerializationStrategy)JsonObjectSerializer.INSTANCE, value); }
/* 44 */     else if (jsonElement instanceof JsonArray) { encoder.encodeSerializableValue((SerializationStrategy)JsonArraySerializer.INSTANCE, value); }
/*    */     else
/*    */     { throw new NoWhenBranchMatchedException(); }
/*    */      }
/*    */   private static final SerialDescriptor descriptor$lambda$5$lambda$3() { return JsonObjectSerializer.INSTANCE.getDescriptor(); }
/* 49 */   private static final SerialDescriptor descriptor$lambda$5$lambda$4() { return JsonArraySerializer.INSTANCE.getDescriptor(); } @NotNull public JsonElement deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); JsonDecoder input = JsonElementSerializersKt.asJsonDecoder(decoder);
/* 50 */     return input.decodeJsonElement(); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\JsonElementSerializer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */