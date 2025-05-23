/*     */ package ai.grazie.api.gateway.api.llm;
/*     */ 
/*     */ import ai.grazie.model.cloud.sse.continuous.Data;
/*     */ import ai.grazie.model.cloud.sse.continuous.events.type.ContinuousSSEEventType;
/*     */ import ai.grazie.model.llm.data.stream.LLMStreamFinishReason;
/*     */ import ai.grazie.quota.Quota;
/*     */ import ai.grazie.quota.Quota$;
/*     */ import ai.grazie.utils.mpp.money.Credit;
/*     */ import ai.grazie.utils.mpp.money.Credit$;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.LazyKt;
/*     */ import kotlin.LazyThreadSafetyMode;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.reflect.KClass;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.EncodeDefault;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SealedClassSerializer;
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
/*     */ import kotlinx.serialization.internal.ObjectSerializer;
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
/*     */ @Serializable
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\000 \0252\0020\001:\005\025\026\027\030\031B%\b\027\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\007\b\004¢\006\002\020\tJ!\020\016\032\0020\0172\006\020\020\032\0020\0002\006\020\021\032\0020\0222\006\020\023\032\0020\024HÇ\001R\022\020\n\032\0020\013X¦\004¢\006\006\032\004\b\f\020\r\001\004\032\033\034\035¨\006\036"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData;", "Lai/grazie/model/cloud/sse/continuous/Data;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "content", "", "getContent", "()Ljava/lang/String;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "Content", "FinishMetadata", "QuotaMetadata", "UnknownMetadata", "Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData$Content;", "Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData$FinishMetadata;", "Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData$QuotaMetadata;", "Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData$UnknownMetadata;", "api-gateway-api"})
/*     */ public abstract class LLMData
/*     */   extends Data
/*     */ {
/*     */   @NotNull
/* 326 */   public static final Companion Companion = new Companion(null); @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); static { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer(); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @NotNull public abstract String getContent(); @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class null extends Lambda implements Function0<KSerializer<Object>> { public static final null INSTANCE = (null)new Function0<>(); null() { super(0); } public final KSerializer<Object> invoke() { KClass[] arrayOfKClass = new KClass[4]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(LlmAPI.MultiModalChat.V1.LLMData.Content.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(LlmAPI.MultiModalChat.V1.LLMData.FinishMetadata.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(LlmAPI.MultiModalChat.V1.LLMData.QuotaMetadata.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(LlmAPI.MultiModalChat.V1.LLMData.UnknownMetadata.class); KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = (KSerializer)LlmAPI.MultiModalChat.V1.LLMData.Content.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)LlmAPI.MultiModalChat.V1.LLMData.FinishMetadata.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)LlmAPI.MultiModalChat.V1.LLMData.QuotaMetadata.$serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)new ObjectSerializer("UnknownMetadata", LlmAPI.MultiModalChat.V1.LLMData.UnknownMetadata.INSTANCE, new java.lang.annotation.Annotation[0]); return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.api.gateway.api.llm.LlmAPI.MultiModalChat.V1.LLMData", Reflection.getOrCreateKotlinClass(LlmAPI.MultiModalChat.V1.LLMData.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<LlmAPI.MultiModalChat.V1.LLMData> serializer() { return get$cachedSerializer(); } } private LLMData() {} @Serializable
/*     */   @SerialName("Content")
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0372\0020\001:\002\036\037B/\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\r\022\006\020\006\032\0020\007¢\006\002\020\013J\t\020\016\032\0020\007HÆ\003J\023\020\017\032\0020\0002\b\b\002\020\006\032\0020\007HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\023HÖ\003J\t\020\024\032\0020\003HÖ\001J\t\020\025\032\0020\007HÖ\001J&\020\026\032\0020\0272\006\020\030\032\0020\0002\006\020\031\032\0020\0322\006\020\033\032\0020\034HÁ\001¢\006\002\b\035R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\f\020\r¨\006 "}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData$Content;", "Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "content", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */   public static final class Content extends LLMData { @NotNull
/* 330 */     public static final Companion Companion = new Companion(null); @NotNull private final String content; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Content)) return false;  Content content = (Content)other; return !!Intrinsics.areEqual(this.content, content.content); } public int hashCode() { return this.content.hashCode(); } @NotNull public String toString() { return "Content(content=" + this.content + ")"; } static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer(); arrayOfKSerializer[1] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @NotNull public final Content copy(@NotNull String content) { Intrinsics.checkNotNullParameter(content, "content"); return new Content(content); } @NotNull public final String component1() { return this.content; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/llm/LlmAPI.MultiModalChat.V1.LLMData.Content.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData$Content;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Content> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])LlmAPI.MultiModalChat.V1.LLMData.Content.$childSerializers, arrayOfKSerializer2 = new KSerializer[2]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public LlmAPI.MultiModalChat.V1.LLMData.Content deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; ContinuousSSEEventType continuousSSEEventType = null; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])LlmAPI.MultiModalChat.V1.LLMData.Content.$childSerializers; if (compositeDecoder.decodeSequentially()) { continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; continue;case 1: str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new LlmAPI.MultiModalChat.V1.LLMData.Content(i, continuousSSEEventType, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull LlmAPI.MultiModalChat.V1.LLMData.Content value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); LlmAPI.MultiModalChat.V1.LLMData.Content.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Content", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("event_type", true); pluginGeneratedSerialDescriptor.addElement("content", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData$Content$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData$Content;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<LlmAPI.MultiModalChat.V1.LLMData.Content> serializer() { return (KSerializer<LlmAPI.MultiModalChat.V1.LLMData.Content>)LlmAPI.MultiModalChat.V1.LLMData.Content.$serializer.INSTANCE; } }
/*     */     @NotNull
/* 332 */     public String getContent() { return this.content; } public Content(@NotNull String content) { super(null); this.content = content; } } @Serializable @SerialName("QuotaMetadata") @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 (2\0020\001:\002'(BC\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013\022\b\020\f\032\004\030\0010\r¢\006\002\020\016B\025\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\002\020\017J\t\020\026\032\0020\007HÆ\003J\t\020\027\032\0020\tHÆ\003J\035\020\030\032\0020\0002\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHÆ\001J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\034HÖ\003J\t\020\035\032\0020\003HÖ\001J\t\020\036\032\0020\013HÖ\001J&\020\037\032\0020 2\006\020!\032\0020\0002\006\020\"\032\0020#2\006\020$\032\0020%HÁ\001¢\006\002\b&R\024\020\n\032\0020\013XD¢\006\b\n\000\032\004\b\020\020\021R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\022\020\023R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\024\020\025¨\006)"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData$QuotaMetadata;", "Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "updated", "Lai/grazie/quota/Quota;", "spent", "Lai/grazie/utils/mpp/money/Credit;", "content", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Lai/grazie/quota/Quota;Lai/grazie/utils/mpp/money/Credit;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/quota/Quota;Lai/grazie/utils/mpp/money/Credit;)V", "getContent", "()Ljava/lang/String;", "getSpent", "()Lai/grazie/utils/mpp/money/Credit;", "getUpdated", "()Lai/grazie/quota/Quota;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */   public static final class QuotaMetadata extends LLMData { @NotNull
/* 334 */     public static final Companion Companion = new Companion(null); @NotNull private final Quota updated; @NotNull private final Credit spent; @NotNull private final String content; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer(); arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/llm/LlmAPI.MultiModalChat.V1.LLMData.QuotaMetadata.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData$QuotaMetadata;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<QuotaMetadata> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])LlmAPI.MultiModalChat.V1.LLMData.QuotaMetadata.$childSerializers, arrayOfKSerializer2 = new KSerializer[4]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = (KSerializer)Quota$.serializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)Credit$.serializer.INSTANCE; arrayOfKSerializer2[3] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public LlmAPI.MultiModalChat.V1.LLMData.QuotaMetadata deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; ContinuousSSEEventType continuousSSEEventType = null; Quota quota = null; Credit credit = null; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])LlmAPI.MultiModalChat.V1.LLMData.QuotaMetadata.$childSerializers; if (compositeDecoder.decodeSequentially()) { continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; quota = (Quota)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Quota$.serializer.INSTANCE, quota); i |= 0x2; credit = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit); i |= 0x4; str = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; continue;case 1: quota = (Quota)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Quota$.serializer.INSTANCE, quota); i |= 0x2; continue;case 2: credit = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit); i |= 0x4; continue;case 3: str = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new LlmAPI.MultiModalChat.V1.LLMData.QuotaMetadata(i, continuousSSEEventType, quota, credit, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull LlmAPI.MultiModalChat.V1.LLMData.QuotaMetadata value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); LlmAPI.MultiModalChat.V1.LLMData.QuotaMetadata.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("QuotaMetadata", INSTANCE, 4); pluginGeneratedSerialDescriptor.addElement("event_type", true); pluginGeneratedSerialDescriptor.addElement("updated", false); pluginGeneratedSerialDescriptor.addElement("spent", false); pluginGeneratedSerialDescriptor.addElement("content", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData$QuotaMetadata$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData$QuotaMetadata;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<LlmAPI.MultiModalChat.V1.LLMData.QuotaMetadata> serializer() { return (KSerializer<LlmAPI.MultiModalChat.V1.LLMData.QuotaMetadata>)LlmAPI.MultiModalChat.V1.LLMData.QuotaMetadata.$serializer.INSTANCE; }
/*     */        }
/* 336 */     public QuotaMetadata(@NotNull Quota updated, @NotNull Credit spent) { super(null); this.updated = updated; this.spent = spent;
/* 337 */       this.content = ""; } @NotNull public final Quota getUpdated() { return this.updated; } @NotNull public final Credit getSpent() { return this.spent; } @NotNull public final Quota component1() { return this.updated; } @NotNull public final Credit component2() { return this.spent; } @NotNull public final QuotaMetadata copy(@NotNull Quota updated, @NotNull Credit spent) { Intrinsics.checkNotNullParameter(updated, "updated"); Intrinsics.checkNotNullParameter(spent, "spent"); return new QuotaMetadata(updated, spent); } @NotNull public String getContent() { return this.content; } @NotNull public String toString() { return "QuotaMetadata(updated=" + this.updated + ", spent=" + this.spent + ")"; }
/*     */     public int hashCode() { result = this.updated.hashCode(); return result * 31 + this.spent.hashCode(); }
/*     */     public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof QuotaMetadata)) return false;  QuotaMetadata quotaMetadata = (QuotaMetadata)other; return !Intrinsics.areEqual(this.updated, quotaMetadata.updated) ? false : (!!Intrinsics.areEqual(this.spent, quotaMetadata.spent)); } }
/* 340 */   @Serializable @SerialName("FinishMetadata") @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B9\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB\r\022\006\020\006\032\0020\007¢\006\002\020\rJ\t\020\022\032\0020\007HÆ\003J\023\020\023\032\0020\0002\b\b\002\020\006\032\0020\007HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\027HÖ\003J\t\020\030\032\0020\003HÖ\001J\t\020\031\032\0020\tHÖ\001J&\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÁ\001¢\006\002\b!R\024\020\b\032\0020\tXD¢\006\b\n\000\032\004\b\016\020\017R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\020\020\021¨\006$"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData$FinishMetadata;", "Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "reason", "Lai/grazie/model/llm/data/stream/LLMStreamFinishReason;", "content", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Lai/grazie/model/llm/data/stream/LLMStreamFinishReason;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/llm/data/stream/LLMStreamFinishReason;)V", "getContent", "()Ljava/lang/String;", "getReason", "()Lai/grazie/model/llm/data/stream/LLMStreamFinishReason;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class FinishMetadata extends LLMData { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final LLMStreamFinishReason reason; @NotNull private final String content; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer(); arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/llm/LlmAPI.MultiModalChat.V1.LLMData.FinishMetadata.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData$FinishMetadata;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<FinishMetadata> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])LlmAPI.MultiModalChat.V1.LLMData.FinishMetadata.$childSerializers, arrayOfKSerializer2 = new KSerializer[3]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = (KSerializer)LLMStreamFinishReason.Serializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public LlmAPI.MultiModalChat.V1.LLMData.FinishMetadata deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; ContinuousSSEEventType continuousSSEEventType = null; LLMStreamFinishReason lLMStreamFinishReason = null; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])LlmAPI.MultiModalChat.V1.LLMData.FinishMetadata.$childSerializers; if (compositeDecoder.decodeSequentially()) { continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; lLMStreamFinishReason = (LLMStreamFinishReason)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LLMStreamFinishReason.Serializer.INSTANCE, lLMStreamFinishReason); i |= 0x2; str = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; continue;case 1: lLMStreamFinishReason = (LLMStreamFinishReason)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LLMStreamFinishReason.Serializer.INSTANCE, lLMStreamFinishReason); i |= 0x2; continue;case 2: str = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new LlmAPI.MultiModalChat.V1.LLMData.FinishMetadata(i, continuousSSEEventType, lLMStreamFinishReason, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull LlmAPI.MultiModalChat.V1.LLMData.FinishMetadata value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); LlmAPI.MultiModalChat.V1.LLMData.FinishMetadata.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("FinishMetadata", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("event_type", true); pluginGeneratedSerialDescriptor.addElement("reason", false); pluginGeneratedSerialDescriptor.addElement("content", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData$FinishMetadata$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData$FinishMetadata;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<LlmAPI.MultiModalChat.V1.LLMData.FinishMetadata> serializer() { return (KSerializer<LlmAPI.MultiModalChat.V1.LLMData.FinishMetadata>)LlmAPI.MultiModalChat.V1.LLMData.FinishMetadata.$serializer.INSTANCE; }
/*     */        }
/* 342 */     public FinishMetadata(@NotNull LLMStreamFinishReason reason) { super(null); this.reason = reason;
/* 343 */       this.content = ""; } @NotNull public final LLMStreamFinishReason getReason() { return this.reason; } @NotNull public String getContent() { return this.content; } @NotNull public final LLMStreamFinishReason component1() { return this.reason; } @NotNull public final FinishMetadata copy(@NotNull LLMStreamFinishReason reason) { Intrinsics.checkNotNullParameter(reason, "reason"); return new FinishMetadata(reason); } @NotNull public String toString() { return "FinishMetadata(reason=" + this.reason + ")"; }
/*     */     public int hashCode() { return this.reason.hashCode(); }
/*     */     public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof FinishMetadata)) return false;  FinishMetadata finishMetadata = (FinishMetadata)other; return !(this.reason != finishMetadata.reason); } }
/* 346 */   @Serializable @SerialName("UnknownMetadata") @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\007\032\b\022\004\022\0020\0000\bHÆ\001R\024\020\003\032\0020\004XD¢\006\b\n\000\032\004\b\005\020\006¨\006\t"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData$UnknownMetadata;", "Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData;", "()V", "content", "", "getContent", "()Ljava/lang/String;", "serializer", "Lkotlinx/serialization/KSerializer;", "api-gateway-api"}) public static final class UnknownMetadata extends LLMData { @NotNull public final KSerializer<UnknownMetadata> serializer() { return get$cachedSerializer(); }
/*     */     
/* 348 */     private UnknownMetadata() { super(null); } @NotNull
/* 349 */     private static final String content = ""; @NotNull public static final UnknownMetadata INSTANCE = new UnknownMetadata(); @NotNull public String getContent() { return content; }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\llm\LlmAPI$MultiModalChat$V1$LLMData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */