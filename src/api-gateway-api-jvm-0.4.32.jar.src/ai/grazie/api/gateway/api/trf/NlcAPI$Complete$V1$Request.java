/*    */ package ai.grazie.api.gateway.api.trf;
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\016\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 '2\0020\001:\002&'BA\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\b\022\b\020\t\032\004\030\0010\005\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB'\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\b\022\b\b\002\020\t\032\0020\005¢\006\002\020\rJ\t\020\024\032\0020\005HÆ\003J\t\020\025\032\0020\005HÆ\003J\t\020\026\032\0020\bHÆ\003J\t\020\027\032\0020\005HÆ\003J1\020\030\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\005HÆ\001J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\001HÖ\003J\t\020\034\032\0020\003HÖ\001J\t\020\035\032\0020\005HÖ\001J&\020\036\032\0020\0372\006\020 \032\0020\0002\006\020!\032\0020\"2\006\020#\032\0020$HÁ\001¢\006\002\b%R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\020\020\021R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\022\020\017R\021\020\t\032\0020\005¢\006\b\n\000\032\004\b\023\020\017¨\006("}, d2 = {"Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V1$Request;", "", "seen1", "", "context", "", "prefix", "lang", "Lai/grazie/nlp/langs/Language;", "profile", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lai/grazie/nlp/langs/Language;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/nlp/langs/Language;Ljava/lang/String;)V", "getContext", "()Ljava/lang/String;", "getLang", "()Lai/grazie/nlp/langs/Language;", "getPrefix", "getProfile", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */ public final class Request {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String context;
/*    */   @NotNull
/*    */   private final String prefix;
/*    */   @NotNull
/*    */   private final Language lang;
/*    */   @NotNull
/*    */   private final String profile;
/*    */   
/* 18 */   public Request(@NotNull String context, @NotNull String prefix, @NotNull Language lang, @NotNull String profile) { this.context = context; this.prefix = prefix; this.lang = lang; this.profile = profile; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/trf/NlcAPI.Complete.V1.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V1$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Request> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)Language.Serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public NlcAPI.Complete.V1.Request deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str1 = null, str2 = null; Language language = null; String str3 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Language.Serializer.INSTANCE, language); i |= 0x4; str3 = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue;case 2: language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Language.Serializer.INSTANCE, language); i |= 0x4; continue;case 3: str3 = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new NlcAPI.Complete.V1.Request(i, str1, str2, language, str3, null); } public void serialize(@NotNull Encoder encoder, @NotNull NlcAPI.Complete.V1.Request value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); NlcAPI.Complete.V1.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.trf.NlcAPI.Complete.V1.Request", INSTANCE, 4); pluginGeneratedSerialDescriptor.addElement("context", false); pluginGeneratedSerialDescriptor.addElement("prefix", false); pluginGeneratedSerialDescriptor.addElement("lang", false); pluginGeneratedSerialDescriptor.addElement("profile", true); descriptor = pluginGeneratedSerialDescriptor; } } @NotNull public final String getContext() { return this.context; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V1$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V1$Request;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<NlcAPI.Complete.V1.Request> serializer() { return (KSerializer<NlcAPI.Complete.V1.Request>)NlcAPI.Complete.V1.Request.$serializer.INSTANCE; } } @NotNull public final String getPrefix() { return this.prefix; } @NotNull public final Language getLang() { return this.lang; } @NotNull public final String getProfile() { return this.profile; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.context;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.prefix;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Language component3() {
/*    */     return this.lang;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component4() {
/*    */     return this.profile;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Request copy(@NotNull String context, @NotNull String prefix, @NotNull Language lang, @NotNull String profile) {
/*    */     Intrinsics.checkNotNullParameter(context, "context");
/*    */     Intrinsics.checkNotNullParameter(prefix, "prefix");
/*    */     Intrinsics.checkNotNullParameter(lang, "lang");
/*    */     Intrinsics.checkNotNullParameter(profile, "profile");
/*    */     return new Request(context, prefix, lang, profile);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Request(context=" + this.context + ", prefix=" + this.prefix + ", lang=" + this.lang + ", profile=" + this.profile + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.context.hashCode();
/*    */     result = result * 31 + this.prefix.hashCode();
/*    */     result = result * 31 + this.lang.hashCode();
/*    */     return result * 31 + this.profile.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Request))
/*    */       return false; 
/*    */     Request request = (Request)other;
/*    */     return !Intrinsics.areEqual(this.context, request.context) ? false : (!Intrinsics.areEqual(this.prefix, request.prefix) ? false : ((this.lang != request.lang) ? false : (!!Intrinsics.areEqual(this.profile, request.profile))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\trf\NlcAPI$Complete$V1$Request.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */