/*    */ package ai.grazie.api.gateway.api.gec;
/*    */ 
/*    */ import ai.grazie.gec.model.CorrectionServiceType;
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.ArrayListSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.LinkedHashSetSerializer;
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
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\000\n\002\020\"\n\002\030\002\n\000\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 (2\0020\001:\002'(BC\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007\022\016\020\t\032\n\022\004\022\0020\013\030\0010\n\022\b\020\f\032\004\030\0010\r¢\006\002\020\016B-\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007\022\020\b\002\020\t\032\n\022\004\022\0020\013\030\0010\n¢\006\002\020\017J\t\020\026\032\0020\005HÆ\003J\017\020\027\032\b\022\004\022\0020\b0\007HÆ\003J\021\020\030\032\n\022\004\022\0020\013\030\0010\nHÆ\003J5\020\031\032\0020\0002\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\0072\020\b\002\020\t\032\n\022\004\022\0020\013\030\0010\nHÆ\001J\023\020\032\032\0020\0332\b\020\034\032\004\030\0010\001HÖ\003J\t\020\035\032\0020\003HÖ\001J\t\020\036\032\0020\bHÖ\001J&\020\037\032\0020 2\006\020!\032\0020\0002\006\020\"\032\0020#2\006\020$\032\0020%HÁ\001¢\006\002\b&R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\020\020\021R\027\020\006\032\b\022\004\022\0020\b0\007¢\006\b\n\000\032\004\b\022\020\023R\031\020\t\032\n\022\004\022\0020\013\030\0010\n¢\006\b\n\000\032\004\b\024\020\025¨\006)"}, d2 = {"Lai/grazie/api/gateway/api/gec/GecAPI$Correct$V3$Request;", "", "seen1", "", "lang", "Lai/grazie/nlp/langs/Language;", "sentences", "", "", "services", "", "Lai/grazie/gec/model/CorrectionServiceType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/nlp/langs/Language;Ljava/util/List;Ljava/util/Set;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/nlp/langs/Language;Ljava/util/List;Ljava/util/Set;)V", "getLang", "()Lai/grazie/nlp/langs/Language;", "getSentences", "()Ljava/util/List;", "getServices", "()Ljava/util/Set;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */ public final class Request
/*    */ {
/*    */   @NotNull
/* 53 */   public static final Companion Companion = new Companion(null); @NotNull private final Language lang; @NotNull private final List<String> sentences; @Nullable private final Set<CorrectionServiceType> services; @JvmField @NotNull
/* 54 */   private static final KSerializer<Object>[] $childSerializers; public Request(@NotNull Language lang, @NotNull List<String> sentences, @Nullable Set<CorrectionServiceType> services) { this.lang = lang; this.sentences = sentences; this.services = services; } static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[2] = (KSerializer)new LinkedHashSetSerializer((KSerializer)CorrectionServiceType.Serializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @NotNull public final Language getLang() { return this.lang; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/gec/GecAPI.Correct.V3.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/gec/GecAPI$Correct$V3$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Request> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])GecAPI.Correct.V3.Request.$childSerializers, arrayOfKSerializer2 = new KSerializer[3]; arrayOfKSerializer2[0] = (KSerializer)Language.Serializer.INSTANCE; arrayOfKSerializer2[1] = arrayOfKSerializer1[1]; arrayOfKSerializer2[2] = BuiltinSerializersKt.getNullable(arrayOfKSerializer1[2]); return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public GecAPI.Correct.V3.Request deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; Language language = null; List list = null; Set set = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])GecAPI.Correct.V3.Request.$childSerializers; if (compositeDecoder.decodeSequentially()) { language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Language.Serializer.INSTANCE, language); i |= 0x1; list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list); i |= 0x2; set = (Set)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], set); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Language.Serializer.INSTANCE, language); i |= 0x1; continue;case 1: list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list); i |= 0x2; continue;case 2: set = (Set)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], set); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new GecAPI.Correct.V3.Request(i, language, list, set, null); } public void serialize(@NotNull Encoder encoder, @NotNull GecAPI.Correct.V3.Request value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); GecAPI.Correct.V3.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.gec.GecAPI.Correct.V3.Request", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("lang", false); pluginGeneratedSerialDescriptor.addElement("sentences", false); pluginGeneratedSerialDescriptor.addElement("services", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/gec/GecAPI$Correct$V3$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/gec/GecAPI$Correct$V3$Request;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<GecAPI.Correct.V3.Request> serializer() { return (KSerializer<GecAPI.Correct.V3.Request>)GecAPI.Correct.V3.Request.$serializer.INSTANCE; } } @NotNull public final List<String> getSentences() { return this.sentences; } @Nullable public final Set<CorrectionServiceType> getServices() { return this.services; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Language component1() {
/*    */     return this.lang;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> component2() {
/*    */     return this.sentences;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Set<CorrectionServiceType> component3() {
/*    */     return this.services;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Request copy(@NotNull Language lang, @NotNull List<String> sentences, @Nullable Set<? extends CorrectionServiceType> services) {
/*    */     Intrinsics.checkNotNullParameter(lang, "lang");
/*    */     Intrinsics.checkNotNullParameter(sentences, "sentences");
/*    */     return new Request(lang, sentences, services);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Request(lang=" + this.lang + ", sentences=" + this.sentences + ", services=" + this.services + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.lang.hashCode();
/*    */     result = result * 31 + this.sentences.hashCode();
/*    */     return result * 31 + ((this.services == null) ? 0 : this.services.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Request))
/*    */       return false; 
/*    */     Request request = (Request)other;
/*    */     return (this.lang != request.lang) ? false : (!Intrinsics.areEqual(this.sentences, request.sentences) ? false : (!!Intrinsics.areEqual(this.services, request.services)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\gec\GecAPI$Correct$V3$Request.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */