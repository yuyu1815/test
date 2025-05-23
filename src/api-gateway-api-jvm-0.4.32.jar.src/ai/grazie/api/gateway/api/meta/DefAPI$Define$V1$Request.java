/*    */ package ai.grazie.api.gateway.api.meta;
/*    */ 
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import ai.grazie.text.TextRange;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\030\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 /2\0020\001:\002./BK\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\t\022\b\020\013\032\004\030\0010\f\022\b\020\r\032\004\030\0010\016¢\006\002\020\017B5\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\n\b\002\020\b\032\004\030\0010\t\022\n\b\002\020\n\032\004\030\0010\t\022\006\020\013\032\0020\f¢\006\002\020\020J\t\020\033\032\0020\005HÆ\003J\t\020\034\032\0020\007HÆ\003J\020\020\035\032\004\030\0010\tHÆ\003¢\006\002\020\026J\020\020\036\032\004\030\0010\tHÆ\003¢\006\002\020\026J\t\020\037\032\0020\fHÆ\003JD\020 \032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\n\b\002\020\b\032\004\030\0010\t2\n\b\002\020\n\032\004\030\0010\t2\b\b\002\020\013\032\0020\fHÆ\001¢\006\002\020!J\023\020\"\032\0020\t2\b\020#\032\004\030\0010\001HÖ\003J\t\020$\032\0020\003HÖ\001J\t\020%\032\0020\005HÖ\001J&\020&\032\0020'2\006\020(\032\0020\0002\006\020)\032\0020*2\006\020+\032\0020,HÁ\001¢\006\002\b-R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\021\020\022R\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\023\020\024R\025\020\n\032\004\030\0010\t¢\006\n\n\002\020\027\032\004\b\025\020\026R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\030\020\031R\025\020\b\032\004\030\0010\t¢\006\n\n\002\020\027\032\004\b\032\020\026¨\0060"}, d2 = {"Lai/grazie/api/gateway/api/meta/DefAPI$Define$V1$Request;", "", "seen1", "", "text", "", "interval", "Lai/grazie/text/TextRange;", "useGoogleKg", "", "spellcheck", "lang", "Lai/grazie/nlp/langs/Language;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lai/grazie/text/TextRange;Ljava/lang/Boolean;Ljava/lang/Boolean;Lai/grazie/nlp/langs/Language;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lai/grazie/text/TextRange;Ljava/lang/Boolean;Ljava/lang/Boolean;Lai/grazie/nlp/langs/Language;)V", "getInterval", "()Lai/grazie/text/TextRange;", "getLang", "()Lai/grazie/nlp/langs/Language;", "getSpellcheck", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getText", "()Ljava/lang/String;", "getUseGoogleKg", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lai/grazie/text/TextRange;Ljava/lang/Boolean;Ljava/lang/Boolean;Lai/grazie/nlp/langs/Language;)Lai/grazie/api/gateway/api/meta/DefAPI$Define$V1$Request;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */ public final class Request {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String text;
/*    */   @NotNull
/*    */   private final TextRange interval;
/*    */   
/* 19 */   public Request(@NotNull String text, @NotNull TextRange interval, @Nullable Boolean useGoogleKg, @Nullable Boolean spellcheck, @NotNull Language lang) { this.text = text;
/* 20 */     this.interval = interval;
/* 21 */     this.useGoogleKg = useGoogleKg;
/* 22 */     this.spellcheck = spellcheck;
/* 23 */     this.lang = lang; } @Nullable private final Boolean useGoogleKg; @Nullable private final Boolean spellcheck; @NotNull private final Language lang; @NotNull public final Language getLang() { return this.lang; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/meta/DefAPI.Define.V1.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/meta/DefAPI$Define$V1$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*    */   public static final class $serializer implements GeneratedSerializer<Request> {
/*    */     @NotNull
/*    */     public static final $serializer INSTANCE = new $serializer();
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] typeParametersSerializers() {
/*    */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/*    */       return (SerialDescriptor)descriptor;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] childSerializers() {
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[5];
/*    */       arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)TextRange$.serializer.INSTANCE;
/*    */       arrayOfKSerializer[2] = BuiltinSerializersKt.getNullable((KSerializer)BooleanSerializer.INSTANCE);
/*    */       arrayOfKSerializer[3] = BuiltinSerializersKt.getNullable((KSerializer)BooleanSerializer.INSTANCE);
/*    */       arrayOfKSerializer[4] = (KSerializer)Language.Serializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public DefAPI.Define.V1.Request deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str = null;
/*    */       TextRange textRange = null;
/*    */       Boolean bool1 = null, bool2 = null;
/*    */       Language language = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         textRange = (TextRange)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)TextRange$.serializer.INSTANCE, textRange);
/*    */         i |= 0x2;
/*    */         bool1 = (Boolean)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)BooleanSerializer.INSTANCE, bool1);
/*    */         i |= 0x4;
/*    */         bool2 = (Boolean)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)BooleanSerializer.INSTANCE, bool2);
/*    */         i |= 0x8;
/*    */         language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)Language.Serializer.INSTANCE, language);
/*    */         i |= 0x10;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               textRange = (TextRange)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)TextRange$.serializer.INSTANCE, textRange);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               bool1 = (Boolean)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)BooleanSerializer.INSTANCE, bool1);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               bool2 = (Boolean)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)BooleanSerializer.INSTANCE, bool2);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)Language.Serializer.INSTANCE, language);
/*    */               i |= 0x10;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new DefAPI.Define.V1.Request(i, str, textRange, bool1, bool2, language, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull DefAPI.Define.V1.Request value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       DefAPI.Define.V1.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.meta.DefAPI.Define.V1.Request", INSTANCE, 5);
/*    */       pluginGeneratedSerialDescriptor.addElement("text", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("interval", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("useGoogleKg", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("spellcheck", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("lang", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/meta/DefAPI$Define$V1$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/meta/DefAPI$Define$V1$Request;", "api-gateway-api"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<DefAPI.Define.V1.Request> serializer() {
/*    */       return (KSerializer<DefAPI.Define.V1.Request>)DefAPI.Define.V1.Request.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getText() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TextRange getInterval() {
/*    */     return this.interval;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Boolean getUseGoogleKg() {
/*    */     return this.useGoogleKg;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Boolean getSpellcheck() {
/*    */     return this.spellcheck;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TextRange component2() {
/*    */     return this.interval;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Boolean component3() {
/*    */     return this.useGoogleKg;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Boolean component4() {
/*    */     return this.spellcheck;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Language component5() {
/*    */     return this.lang;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Request copy(@NotNull String text, @NotNull TextRange interval, @Nullable Boolean useGoogleKg, @Nullable Boolean spellcheck, @NotNull Language lang) {
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     Intrinsics.checkNotNullParameter(interval, "interval");
/*    */     Intrinsics.checkNotNullParameter(lang, "lang");
/*    */     return new Request(text, interval, useGoogleKg, spellcheck, lang);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Request(text=" + this.text + ", interval=" + this.interval + ", useGoogleKg=" + this.useGoogleKg + ", spellcheck=" + this.spellcheck + ", lang=" + this.lang + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.text.hashCode();
/*    */     result = result * 31 + this.interval.hashCode();
/*    */     result = result * 31 + ((this.useGoogleKg == null) ? 0 : this.useGoogleKg.hashCode());
/*    */     result = result * 31 + ((this.spellcheck == null) ? 0 : this.spellcheck.hashCode());
/*    */     return result * 31 + this.lang.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Request))
/*    */       return false; 
/*    */     Request request = (Request)other;
/*    */     return !Intrinsics.areEqual(this.text, request.text) ? false : (!Intrinsics.areEqual(this.interval, request.interval) ? false : (!Intrinsics.areEqual(this.useGoogleKg, request.useGoogleKg) ? false : (!Intrinsics.areEqual(this.spellcheck, request.spellcheck) ? false : (!(this.lang != request.lang)))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\meta\DefAPI$Define$V1$Request.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */