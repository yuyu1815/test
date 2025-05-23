/*    */ package ai.grazie.api.gateway.api.llm;
/*    */ 
/*    */ import ai.grazie.model.cloud.sse.continuous.events.type.ContinuousSSEEventType;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.EncodeDefault;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.IntSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Serializable
/*    */ @SerialName("Content")
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\f\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 %2\0020\001:\002$%B9\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\003\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\031\022\006\020\006\032\0020\007\022\n\b\002\020\b\032\004\030\0010\003¢\006\002\020\fJ\t\020\022\032\0020\007HÆ\003J\020\020\023\032\004\030\0010\003HÆ\003¢\006\002\020\016J$\020\024\032\0020\0002\b\b\002\020\006\032\0020\0072\n\b\002\020\b\032\004\030\0010\003HÆ\001¢\006\002\020\025J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\031HÖ\003J\t\020\032\032\0020\003HÖ\001J\t\020\033\032\0020\007HÖ\001J&\020\034\032\0020\0352\006\020\036\032\0020\0002\006\020\037\032\0020 2\006\020!\032\0020\"HÁ\001¢\006\002\b#R\025\020\b\032\004\030\0010\003¢\006\n\n\002\020\017\032\004\b\r\020\016R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\020\020\021¨\006&"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V5$LLMData$Content;", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V5$LLMData;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "content", "", "choiceIndex", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Ljava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getChoiceIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContent", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V5$LLMData$Content;", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */ public final class Content
/*    */   extends LlmAPI.Chat.Stream.V5.LLMData
/*    */ {
/*    */   @NotNull
/* 55 */   public static final Companion Companion = new Companion(null); @NotNull private final String content; @Nullable private final Integer choiceIndex; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Content)) return false;  Content content = (Content)other; return !Intrinsics.areEqual(this.content, content.content) ? false : (!!Intrinsics.areEqual(this.choiceIndex, content.choiceIndex)); } public int hashCode() { result = this.content.hashCode(); return result * 31 + ((this.choiceIndex == null) ? 0 : this.choiceIndex.hashCode()); } @NotNull public String toString() { return "Content(content=" + this.content + ", choiceIndex=" + this.choiceIndex + ")"; } static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer(); arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @NotNull public final Content copy(@NotNull String content, @Nullable Integer choiceIndex) { Intrinsics.checkNotNullParameter(content, "content"); return new Content(content, choiceIndex); } @Nullable public final Integer component2() { return this.choiceIndex; } @NotNull public final String component1() { return this.content; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/llm/LlmAPI.Chat.Stream.V5.LLMData.Content.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V5$LLMData$Content;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Content> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])LlmAPI.Chat.Stream.V5.LLMData.Content.$childSerializers, arrayOfKSerializer2 = new KSerializer[3]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[2] = BuiltinSerializersKt.getNullable((KSerializer)IntSerializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public LlmAPI.Chat.Stream.V5.LLMData.Content deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; ContinuousSSEEventType continuousSSEEventType = null; String str = null; Integer integer = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])LlmAPI.Chat.Stream.V5.LLMData.Content.$childSerializers; if (compositeDecoder.decodeSequentially()) { continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; integer = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)IntSerializer.INSTANCE, integer); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; continue;case 1: str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue;case 2: integer = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)IntSerializer.INSTANCE, integer); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new LlmAPI.Chat.Stream.V5.LLMData.Content(i, continuousSSEEventType, str, integer, null); } public void serialize(@NotNull Encoder encoder, @NotNull LlmAPI.Chat.Stream.V5.LLMData.Content value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); LlmAPI.Chat.Stream.V5.LLMData.Content.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Content", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("event_type", true); pluginGeneratedSerialDescriptor.addElement("content", false); pluginGeneratedSerialDescriptor.addElement("choiceIndex", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V5$LLMData$Content$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V5$LLMData$Content;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<LlmAPI.Chat.Stream.V5.LLMData.Content> serializer() { return (KSerializer<LlmAPI.Chat.Stream.V5.LLMData.Content>)LlmAPI.Chat.Stream.V5.LLMData.Content.$serializer.INSTANCE; } }
/*    */   @Nullable
/* 57 */   public final Integer getChoiceIndex() { return this.choiceIndex; } @NotNull public String getContent() { return this.content; } public Content(@NotNull String content, @Nullable Integer choiceIndex) { super(null); this.content = content; this.choiceIndex = choiceIndex; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\llm\LlmAPI$Chat$Stream$V5$LLMData$Content.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */