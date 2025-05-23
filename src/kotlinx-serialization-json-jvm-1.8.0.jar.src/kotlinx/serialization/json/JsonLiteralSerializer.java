/*     */ package kotlinx.serialization.json;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ULong;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlin.text.UStringsKt;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*     */ import kotlinx.serialization.descriptors.PrimitiveKind;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptorsKt;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.json.internal.JsonExceptionsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\bÂ\002\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J\030\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\002H\026J\020\020\016\032\0020\0022\006\020\017\032\0020\020H\026R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\b¨\006\021"}, d2 = {"Lkotlinx/serialization/json/JsonLiteralSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonLiteral;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "kotlinx-serialization-json"})
/*     */ @SourceDebugExtension({"SMAP\nJsonElementSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElementSerializers.kt\nkotlinx/serialization/json/JsonLiteralSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n1#2:237\n*E\n"})
/*     */ final class JsonLiteralSerializer
/*     */   implements KSerializer<JsonLiteral>
/*     */ {
/*     */   @NotNull
/*     */   public SerialDescriptor getDescriptor() {
/* 106 */     return descriptor; } @NotNull
/* 107 */   public static final JsonLiteralSerializer INSTANCE = new JsonLiteralSerializer(); @NotNull private static final SerialDescriptor descriptor = SerialDescriptorsKt.PrimitiveSerialDescriptor("kotlinx.serialization.json.JsonLiteral", (PrimitiveKind)PrimitiveKind.STRING.INSTANCE);
/*     */ 
/*     */   
/*     */   public void serialize(@NotNull Encoder encoder, @NotNull JsonLiteral value) {
/* 111 */     Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); JsonElementSerializersKt.access$verify(encoder);
/* 112 */     if (value.isString()) {
/* 113 */       encoder.encodeString(value.getContent());
/*     */       return;
/*     */     } 
/* 116 */     if (value.getCoerceToInlineType$kotlinx_serialization_json() != null) {
/* 117 */       encoder.encodeInline(value.getCoerceToInlineType$kotlinx_serialization_json()).encodeString(value.getContent());
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 122 */     Long long_ = StringsKt.toLongOrNull(value.getContent()); if (long_ != null) { long it = long_.longValue();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 237 */       int $i$a$-let-JsonLiteralSerializer$serialize$1 = 0; encoder.encodeLong(it); return; }  ULong uLong = UStringsKt.toULongOrNull(value.getContent()); if (uLong != null) { long it = uLong.unbox-impl(); int $i$a$-let-JsonLiteralSerializer$serialize$2 = 0; encoder.encodeInline(BuiltinSerializersKt.serializer(ULong.Companion).getDescriptor()).encodeLong(it); return; }  Double double_ = StringsKt.toDoubleOrNull(value.getContent()); if (double_ != null) { double it = double_.doubleValue(); int $i$a$-let-JsonLiteralSerializer$serialize$3 = 0; encoder.encodeDouble(it); return; }  Boolean bool = StringsKt.toBooleanStrictOrNull(value.getContent()); if (bool != null) { boolean it = bool.booleanValue(); int $i$a$-let-JsonLiteralSerializer$serialize$4 = 0;
/*     */       encoder.encodeBoolean(it);
/*     */       return; }
/*     */     
/*     */     encoder.encodeString(value.getContent());
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public JsonLiteral deserialize(@NotNull Decoder decoder) {
/*     */     Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */     JsonElement result = JsonElementSerializersKt.asJsonDecoder(decoder).decodeJsonElement();
/*     */     if (!(result instanceof JsonLiteral))
/*     */       throw JsonExceptionsKt.JsonDecodingException(-1, "Unexpected JSON element, expected JsonLiteral, had " + Reflection.getOrCreateKotlinClass(result.getClass()), (CharSequence)result.toString()); 
/*     */     return (JsonLiteral)result;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\JsonLiteralSerializer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */