/*    */ package ai.grazie.api.gateway.api.trf;
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import java.util.List;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 %2\0020\001:\002$%B=\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b\022\b\020\t\032\004\030\0010\b\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB#\022\f\020\004\032\b\022\004\022\0020\0060\005\022\006\020\007\032\0020\b\022\006\020\t\032\0020\b¢\006\002\020\rJ\017\020\023\032\b\022\004\022\0020\0060\005HÆ\003J\t\020\024\032\0020\bHÆ\003J\t\020\025\032\0020\bHÆ\003J-\020\026\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\bHÆ\001J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\001HÖ\003J\t\020\032\032\0020\003HÖ\001J\t\020\033\032\0020\006HÖ\001J&\020\034\032\0020\0352\006\020\036\032\0020\0002\006\020\037\032\0020 2\006\020!\032\0020\"HÁ\001¢\006\002\b#R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\016\020\017R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\020\020\021R\021\020\t\032\0020\b¢\006\b\n\000\032\004\b\022\020\017¨\006&"}, d2 = {"Lai/grazie/api/gateway/api/trf/NmtAPI$Translate$Request;", "", "seen1", "", "texts", "", "", "fromLang", "Lai/grazie/nlp/langs/Language;", "toLang", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lai/grazie/nlp/langs/Language;Lai/grazie/nlp/langs/Language;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Lai/grazie/nlp/langs/Language;Lai/grazie/nlp/langs/Language;)V", "getFromLang", "()Lai/grazie/nlp/langs/Language;", "getTexts", "()Ljava/util/List;", "getToLang", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */ public final class Request {
/*    */   @NotNull
/* 16 */   public static final Companion Companion = new Companion(null); @NotNull private final List<String> texts; @NotNull private final Language fromLang; @NotNull private final Language toLang; @JvmField @NotNull
/* 17 */   private static final KSerializer<Object>[] $childSerializers; public Request(@NotNull List<String> texts, @NotNull Language fromLang, @NotNull Language toLang) { this.texts = texts; this.fromLang = fromLang; this.toLang = toLang; } static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @NotNull public final List<String> getTexts() { return this.texts; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/trf/NmtAPI.Translate.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/trf/NmtAPI$Translate$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Request> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])NmtAPI.Translate.Request.$childSerializers, arrayOfKSerializer2 = new KSerializer[3]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = (KSerializer)Language.Serializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)Language.Serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public NmtAPI.Translate.Request deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; List list = null; Language language1 = null, language2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])NmtAPI.Translate.Request.$childSerializers; if (compositeDecoder.decodeSequentially()) { list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list); i |= 0x1; language1 = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Language.Serializer.INSTANCE, language1); i |= 0x2; language2 = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Language.Serializer.INSTANCE, language2); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list); i |= 0x1; continue;case 1: language1 = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Language.Serializer.INSTANCE, language1); i |= 0x2; continue;case 2: language2 = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Language.Serializer.INSTANCE, language2); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new NmtAPI.Translate.Request(i, list, language1, language2, null); } public void serialize(@NotNull Encoder encoder, @NotNull NmtAPI.Translate.Request value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); NmtAPI.Translate.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.trf.NmtAPI.Translate.Request", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("texts", false); pluginGeneratedSerialDescriptor.addElement("fromLang", false); pluginGeneratedSerialDescriptor.addElement("toLang", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/trf/NmtAPI$Translate$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/trf/NmtAPI$Translate$Request;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<NmtAPI.Translate.Request> serializer() { return (KSerializer<NmtAPI.Translate.Request>)NmtAPI.Translate.Request.$serializer.INSTANCE; } } @NotNull public final Language getFromLang() { return this.fromLang; } @NotNull public final Language getToLang() { return this.toLang; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final List<String> component1() {
/*    */     return this.texts;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Language component2() {
/*    */     return this.fromLang;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Language component3() {
/*    */     return this.toLang;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Request copy(@NotNull List<String> texts, @NotNull Language fromLang, @NotNull Language toLang) {
/*    */     Intrinsics.checkNotNullParameter(texts, "texts");
/*    */     Intrinsics.checkNotNullParameter(fromLang, "fromLang");
/*    */     Intrinsics.checkNotNullParameter(toLang, "toLang");
/*    */     return new Request(texts, fromLang, toLang);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Request(texts=" + this.texts + ", fromLang=" + this.fromLang + ", toLang=" + this.toLang + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.texts.hashCode();
/*    */     result = result * 31 + this.fromLang.hashCode();
/*    */     return result * 31 + this.toLang.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Request))
/*    */       return false; 
/*    */     Request request = (Request)other;
/*    */     return !Intrinsics.areEqual(this.texts, request.texts) ? false : ((this.fromLang != request.fromLang) ? false : (!(this.toLang != request.toLang)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\trf\NmtAPI$Translate$Request.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */