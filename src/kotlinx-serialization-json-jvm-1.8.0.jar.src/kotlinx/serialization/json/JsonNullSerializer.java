/*     */ package kotlinx.serialization.json;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.PublishedApi;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptorsKt;
/*     */ import kotlinx.serialization.descriptors.SerialKind;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.json.internal.JsonDecodingException;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\bÁ\002\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J\030\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\002H\026J\020\020\016\032\0020\0022\006\020\017\032\0020\020H\026R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\b¨\006\021"}, d2 = {"Lkotlinx/serialization/json/JsonNullSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonNull;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "kotlinx-serialization-json"})
/*     */ @PublishedApi
/*     */ public final class JsonNullSerializer
/*     */   implements KSerializer<JsonNull>
/*     */ {
/*     */   @NotNull
/*     */   public SerialDescriptor getDescriptor() {
/*  86 */     return descriptor; } @NotNull
/*  87 */   public static final JsonNullSerializer INSTANCE = new JsonNullSerializer(); @NotNull private static final SerialDescriptor descriptor = SerialDescriptorsKt.buildSerialDescriptor$default("kotlinx.serialization.json.JsonNull", (SerialKind)SerialKind.ENUM.INSTANCE, new SerialDescriptor[0], null, 8, null);
/*     */   
/*     */   public void serialize(@NotNull Encoder encoder, @NotNull JsonNull value) {
/*  90 */     Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); JsonElementSerializersKt.access$verify(encoder);
/*  91 */     encoder.encodeNull();
/*     */   }
/*     */   @NotNull
/*     */   public JsonNull deserialize(@NotNull Decoder decoder) {
/*  95 */     Intrinsics.checkNotNullParameter(decoder, "decoder"); JsonElementSerializersKt.access$verify(decoder);
/*  96 */     if (decoder.decodeNotNullMark()) {
/*  97 */       throw new JsonDecodingException("Expected 'null' literal");
/*     */     }
/*  99 */     decoder.decodeNull();
/* 100 */     return JsonNull.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\JsonNullSerializer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */