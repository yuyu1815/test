/*     */ package ai.grazie.api.gateway.api.llm;
/*     */ 
/*     */ import ai.grazie.model.cloud.sse.continuous.events.type.ContinuousSSEEventType;
/*     */ import ai.grazie.model.llm.data.stream.LLMStreamFinishReason;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.EncodeDefault;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SerialName;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import kotlinx.serialization.internal.StringSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Serializable
/*     */ @SerialName("FinishMetadata")
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B9\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB\r\022\006\020\006\032\0020\007¢\006\002\020\rJ\t\020\022\032\0020\007HÆ\003J\023\020\023\032\0020\0002\b\b\002\020\006\032\0020\007HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\027HÖ\003J\t\020\030\032\0020\003HÖ\001J\t\020\031\032\0020\tHÖ\001J&\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÁ\001¢\006\002\b!R\024\020\b\032\0020\tXD¢\006\b\n\000\032\004\b\016\020\017R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\020\020\021¨\006$"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData$FinishMetadata;", "Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "reason", "Lai/grazie/model/llm/data/stream/LLMStreamFinishReason;", "content", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Lai/grazie/model/llm/data/stream/LLMStreamFinishReason;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/llm/data/stream/LLMStreamFinishReason;)V", "getContent", "()Ljava/lang/String;", "getReason", "()Lai/grazie/model/llm/data/stream/LLMStreamFinishReason;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */ public final class FinishMetadata
/*     */   extends LlmAPI.MultiModalChat.V1.LLMData
/*     */ {
/*     */   @NotNull
/*     */   private final LLMStreamFinishReason reason;
/*     */   @NotNull
/*     */   private final String content;
/*     */   @NotNull
/* 340 */   public static final Companion Companion = new Companion(null); @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer(); arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/llm/LlmAPI.MultiModalChat.V1.LLMData.FinishMetadata.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData$FinishMetadata;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<FinishMetadata> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])LlmAPI.MultiModalChat.V1.LLMData.FinishMetadata.$childSerializers, arrayOfKSerializer2 = new KSerializer[3]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = (KSerializer)LLMStreamFinishReason.Serializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public LlmAPI.MultiModalChat.V1.LLMData.FinishMetadata deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; ContinuousSSEEventType continuousSSEEventType = null; LLMStreamFinishReason lLMStreamFinishReason = null; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])LlmAPI.MultiModalChat.V1.LLMData.FinishMetadata.$childSerializers; if (compositeDecoder.decodeSequentially()) { continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; lLMStreamFinishReason = (LLMStreamFinishReason)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LLMStreamFinishReason.Serializer.INSTANCE, lLMStreamFinishReason); i |= 0x2; str = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; continue;case 1: lLMStreamFinishReason = (LLMStreamFinishReason)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LLMStreamFinishReason.Serializer.INSTANCE, lLMStreamFinishReason); i |= 0x2; continue;case 2: str = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new LlmAPI.MultiModalChat.V1.LLMData.FinishMetadata(i, continuousSSEEventType, lLMStreamFinishReason, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull LlmAPI.MultiModalChat.V1.LLMData.FinishMetadata value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); LlmAPI.MultiModalChat.V1.LLMData.FinishMetadata.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("FinishMetadata", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("event_type", true); pluginGeneratedSerialDescriptor.addElement("reason", false); pluginGeneratedSerialDescriptor.addElement("content", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData$FinishMetadata$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData$FinishMetadata;", "api-gateway-api"}) public static final class Companion { @NotNull public final KSerializer<LlmAPI.MultiModalChat.V1.LLMData.FinishMetadata> serializer() { return (KSerializer<LlmAPI.MultiModalChat.V1.LLMData.FinishMetadata>)LlmAPI.MultiModalChat.V1.LLMData.FinishMetadata.$serializer.INSTANCE; }
/*     */      private Companion() {} } public FinishMetadata(@NotNull LLMStreamFinishReason reason) {
/* 342 */     super(null); this.reason = reason;
/* 343 */     this.content = ""; } @NotNull public final LLMStreamFinishReason getReason() { return this.reason; } @NotNull public String getContent() { return this.content; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final LLMStreamFinishReason component1() {
/*     */     return this.reason;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final FinishMetadata copy(@NotNull LLMStreamFinishReason reason) {
/*     */     Intrinsics.checkNotNullParameter(reason, "reason");
/*     */     return new FinishMetadata(reason);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "FinishMetadata(reason=" + this.reason + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return this.reason.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof FinishMetadata))
/*     */       return false; 
/*     */     FinishMetadata finishMetadata = (FinishMetadata)other;
/*     */     return !(this.reason != finishMetadata.reason);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\llm\LlmAPI$MultiModalChat$V1$LLMData$FinishMetadata.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */