/*    */ package ai.grazie.model.llm.chat.multimodal;import ai.grazie.model.cloud.ContentType;
/*    */ @Serializable
/*    */ @SerialName("InlineMediaElement")
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\007\n\002\020\022\n\002\b\004\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 $2\0020\001:\002#$B-\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\013J\006\020\020\032\0020\021J\t\020\022\032\0020\005HÆ\003J\t\020\023\032\0020\007HÆ\003J\035\020\024\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\030HÖ\003J\t\020\031\032\0020\003HÖ\001J\t\020\032\032\0020\007HÖ\001J&\020\033\032\0020\0342\006\020\035\032\0020\0002\006\020\036\032\0020\0372\006\020 \032\0020!HÁ\001¢\006\002\b\"R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\f\020\rR\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\016\020\017¨\006%"}, d2 = {"Lai/grazie/model/llm/chat/multimodal/InlineMediaElement;", "Lai/grazie/model/llm/chat/multimodal/MediaElement;", "seen1", "", "mimeType", "Lai/grazie/model/cloud/ContentType;", "data", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/ContentType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/cloud/ContentType;Ljava/lang/String;)V", "getData", "()Ljava/lang/String;", "getMimeType", "()Lai/grazie/model/cloud/ContentType;", "bytes", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_llm", "$serializer", "Companion", "model-llm"})
/*    */ public final class InlineMediaElement implements MediaElement { @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final ContentType mimeType;
/*    */   @NotNull
/*    */   private final String data;
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/llm/chat/multimodal/InlineMediaElement.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/llm/chat/multimodal/InlineMediaElement;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-llm"})
/*    */   public static final class $serializer implements GeneratedSerializer<InlineMediaElement> { @NotNull
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
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*    */       arrayOfKSerializer[0] = (KSerializer)ContentType.Serializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public InlineMediaElement deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       ContentType contentType = null;
/*    */       String str = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         contentType = (ContentType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)ContentType.Serializer.INSTANCE, contentType);
/*    */         i |= 0x1;
/*    */         str = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               contentType = (ContentType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)ContentType.Serializer.INSTANCE, contentType);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               str = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */               i |= 0x2;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new InlineMediaElement(i, contentType, str, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull InlineMediaElement value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       InlineMediaElement.write$Self$model_llm(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("InlineMediaElement", INSTANCE, 2);
/*    */       pluginGeneratedSerialDescriptor.addElement("mimeType", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("data", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     } }
/*    */   
/* 88 */   public InlineMediaElement(@NotNull ContentType mimeType, @NotNull String data) { this.mimeType = mimeType; this.data = data; } @NotNull public ContentType getMimeType() { return this.mimeType; } @NotNull public final String getData() { return this.data; }
/*    */   @NotNull
/* 90 */   public final byte[] bytes() { return Base64.INSTANCE.decode(this.data); } @NotNull public final ContentType component1() { return this.mimeType; } @NotNull public final String component2() { return this.data; } @NotNull public final InlineMediaElement copy(@NotNull ContentType mimeType, @NotNull String data) { Intrinsics.checkNotNullParameter(mimeType, "mimeType"); Intrinsics.checkNotNullParameter(data, "data"); return new InlineMediaElement(mimeType, data); } @NotNull public String toString() { return "InlineMediaElement(mimeType=" + this.mimeType + ", data=" + this.data + ")"; } public int hashCode() { result = this.mimeType.hashCode(); return result * 31 + this.data.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof InlineMediaElement)) return false;  InlineMediaElement inlineMediaElement = (InlineMediaElement)other; return !Intrinsics.areEqual(this.mimeType, inlineMediaElement.mimeType) ? false : (!!Intrinsics.areEqual(this.data, inlineMediaElement.data)); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\022\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\026\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bJ\017\020\t\032\b\022\004\022\0020\0040\nHÆ\001¨\006\013"}, d2 = {"Lai/grazie/model/llm/chat/multimodal/InlineMediaElement$Companion;", "", "()V", "ofBytes", "Lai/grazie/model/llm/chat/multimodal/InlineMediaElement;", "type", "Lai/grazie/model/cloud/ContentType;", "data", "", "serializer", "Lkotlinx/serialization/KSerializer;", "model-llm"}) public static final class Companion
/*    */   {
/* 92 */     @NotNull public final KSerializer<InlineMediaElement> serializer() { return (KSerializer<InlineMediaElement>)InlineMediaElement.$serializer.INSTANCE; } private Companion() {} @NotNull
/*    */     public final InlineMediaElement ofBytes(@NotNull ContentType type, @NotNull byte[] data) {
/* 94 */       Intrinsics.checkNotNullParameter(type, "type"); Intrinsics.checkNotNullParameter(data, "data"); return new InlineMediaElement(type, Base64.INSTANCE.encode(data));
/*    */     }
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\multimodal\InlineMediaElement.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */