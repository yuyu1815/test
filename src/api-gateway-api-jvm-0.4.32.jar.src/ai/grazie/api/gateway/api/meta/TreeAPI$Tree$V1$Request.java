/*    */ package ai.grazie.api.gateway.api.meta;
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import java.util.List;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\017\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 )2\0020\001:\002()BM\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007\022\b\020\t\032\004\030\0010\b\022\016\020\n\032\n\022\004\022\0020\b\030\0010\007\022\b\020\013\032\004\030\0010\f¢\006\002\020\rB9\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007\022\n\b\002\020\t\032\004\030\0010\b\022\020\b\002\020\n\032\n\022\004\022\0020\b\030\0010\007¢\006\002\020\016J\t\020\026\032\0020\005HÆ\003J\017\020\027\032\b\022\004\022\0020\b0\007HÆ\003J\013\020\030\032\004\030\0010\bHÆ\003J\021\020\031\032\n\022\004\022\0020\b\030\0010\007HÆ\003JA\020\032\032\0020\0002\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\0072\n\b\002\020\t\032\004\030\0010\b2\020\b\002\020\n\032\n\022\004\022\0020\b\030\0010\007HÆ\001J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\001HÖ\003J\t\020\036\032\0020\003HÖ\001J\t\020\037\032\0020\bHÖ\001J&\020 \032\0020!2\006\020\"\032\0020\0002\006\020#\032\0020$2\006\020%\032\0020&HÁ\001¢\006\002\b'R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020R\031\020\n\032\n\022\004\022\0020\b\030\0010\007¢\006\b\n\000\032\004\b\021\020\022R\023\020\t\032\004\030\0010\b¢\006\b\n\000\032\004\b\023\020\024R\027\020\006\032\b\022\004\022\0020\b0\007¢\006\b\n\000\032\004\b\025\020\022¨\006*"}, d2 = {"Lai/grazie/api/gateway/api/meta/TreeAPI$Tree$V1$Request;", "", "seen1", "", "lang", "Lai/grazie/nlp/langs/Language;", "texts", "", "", "parser", "options", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/nlp/langs/Language;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/nlp/langs/Language;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getLang", "()Lai/grazie/nlp/langs/Language;", "getOptions", "()Ljava/util/List;", "getParser", "()Ljava/lang/String;", "getTexts", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */ public final class Request {
/*    */   @NotNull
/* 16 */   public static final Companion Companion = new Companion(null); @NotNull private final Language lang; @NotNull private final List<String> texts; @Nullable private final String parser; @Nullable private final List<String> options; @JvmField @NotNull
/* 17 */   private static final KSerializer<Object>[] $childSerializers; public Request(@NotNull Language lang, @NotNull List<String> texts, @Nullable String parser, @Nullable List<String> options) { this.lang = lang; this.texts = texts; this.parser = parser; this.options = options; } static { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @NotNull public final Language getLang() { return this.lang; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/meta/TreeAPI.Tree.V1.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/meta/TreeAPI$Tree$V1$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Request> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])TreeAPI.Tree.V1.Request.$childSerializers, arrayOfKSerializer2 = new KSerializer[4]; arrayOfKSerializer2[0] = (KSerializer)Language.Serializer.INSTANCE; arrayOfKSerializer2[1] = arrayOfKSerializer1[1]; arrayOfKSerializer2[2] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer2[3] = BuiltinSerializersKt.getNullable(arrayOfKSerializer1[3]); return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public TreeAPI.Tree.V1.Request deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; Language language = null; List list1 = null; String str = null; List list2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])TreeAPI.Tree.V1.Request.$childSerializers; if (compositeDecoder.decodeSequentially()) { language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Language.Serializer.INSTANCE, language); i |= 0x1; list1 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list1); i |= 0x2; str = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, str); i |= 0x4; list2 = (List)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], list2); i |= 0x8; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Language.Serializer.INSTANCE, language); i |= 0x1; continue;case 1: list1 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list1); i |= 0x2; continue;case 2: str = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, str); i |= 0x4; continue;case 3: list2 = (List)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], list2); i |= 0x8; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new TreeAPI.Tree.V1.Request(i, language, list1, str, list2, null); } public void serialize(@NotNull Encoder encoder, @NotNull TreeAPI.Tree.V1.Request value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); TreeAPI.Tree.V1.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.meta.TreeAPI.Tree.V1.Request", INSTANCE, 4); pluginGeneratedSerialDescriptor.addElement("lang", false); pluginGeneratedSerialDescriptor.addElement("texts", false); pluginGeneratedSerialDescriptor.addElement("parser", true); pluginGeneratedSerialDescriptor.addElement("options", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/meta/TreeAPI$Tree$V1$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/meta/TreeAPI$Tree$V1$Request;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TreeAPI.Tree.V1.Request> serializer() { return (KSerializer<TreeAPI.Tree.V1.Request>)TreeAPI.Tree.V1.Request.$serializer.INSTANCE; } } @NotNull public final List<String> getTexts() { return this.texts; } @Nullable public final String getParser() { return this.parser; } @Nullable public final List<String> getOptions() { return this.options; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Language component1() {
/*    */     return this.lang;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> component2() {
/*    */     return this.texts;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component3() {
/*    */     return this.parser;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final List<String> component4() {
/*    */     return this.options;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Request copy(@NotNull Language lang, @NotNull List<String> texts, @Nullable String parser, @Nullable List<String> options) {
/*    */     Intrinsics.checkNotNullParameter(lang, "lang");
/*    */     Intrinsics.checkNotNullParameter(texts, "texts");
/*    */     return new Request(lang, texts, parser, options);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Request(lang=" + this.lang + ", texts=" + this.texts + ", parser=" + this.parser + ", options=" + this.options + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.lang.hashCode();
/*    */     result = result * 31 + this.texts.hashCode();
/*    */     result = result * 31 + ((this.parser == null) ? 0 : this.parser.hashCode());
/*    */     return result * 31 + ((this.options == null) ? 0 : this.options.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Request))
/*    */       return false; 
/*    */     Request request = (Request)other;
/*    */     return (this.lang != request.lang) ? false : (!Intrinsics.areEqual(this.texts, request.texts) ? false : (!Intrinsics.areEqual(this.parser, request.parser) ? false : (!!Intrinsics.areEqual(this.options, request.options))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\meta\TreeAPI$Tree$V1$Request.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */