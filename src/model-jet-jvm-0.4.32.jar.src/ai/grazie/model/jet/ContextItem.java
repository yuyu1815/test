/*    */ package ai.grazie.model.jet;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\013\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \"2\0020\001:\002!\"B7\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\005\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB!\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\006\020\007\032\0020\005¢\006\002\020\013J\013\020\020\032\004\030\0010\005HÆ\003J\013\020\021\032\004\030\0010\005HÆ\003J\t\020\022\032\0020\005HÆ\003J+\020\023\032\0020\0002\n\b\002\020\004\032\004\030\0010\0052\n\b\002\020\006\032\004\030\0010\0052\b\b\002\020\007\032\0020\005HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\001HÖ\003J\t\020\027\032\0020\003HÖ\001J\t\020\030\032\0020\005HÖ\001J&\020\031\032\0020\0322\006\020\033\032\0020\0002\006\020\034\032\0020\0352\006\020\036\032\0020\037HÁ\001¢\006\002\b R\021\020\007\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\023\020\006\032\004\030\0010\005¢\006\b\n\000\032\004\b\016\020\rR\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\017\020\r¨\006#"}, d2 = {"Lai/grazie/model/jet/ContextItem;", "", "seen1", "", "type", "", "filepath", "content", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getFilepath", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_jet", "$serializer", "Companion", "model-jet"}) public final class ContextItem { @NotNull public static final Companion Companion = new Companion(null); @Nullable private final String type; @Nullable private final String filepath; @NotNull private final String content; @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/jet/ContextItem.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/jet/ContextItem;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-jet"}) public static final class $serializer implements GeneratedSerializer<ContextItem> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[1] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[2] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public ContextItem deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str1 = null, str2 = null, str3 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) {
/*    */         str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy)StringSerializer.INSTANCE, str1); i |= 0x1; str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str2); i |= 0x2; str3 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) {
/*    */             case -1:
/*    */               bool = false; continue;
/*    */             case 0:
/*    */               str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy)StringSerializer.INSTANCE, str1); i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               str3 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new ContextItem(i, str1, str2, str3, null); } public void serialize(@NotNull Encoder encoder, @NotNull ContextItem value) { Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       ContextItem.write$Self$model_jet(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.jet.ContextItem", INSTANCE, 3);
/*    */       pluginGeneratedSerialDescriptor.addElement("type", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("filepath", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("content", false);
/* 40 */       descriptor = pluginGeneratedSerialDescriptor; } } public ContextItem(@Nullable String type, @Nullable String filepath, @NotNull String content) { this.type = type; this.filepath = filepath; this.content = content; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/jet/ContextItem$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/jet/ContextItem;", "model-jet"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<ContextItem> serializer() { return (KSerializer<ContextItem>)ContextItem.$serializer.INSTANCE; } } @Nullable public final String getType() { return this.type; } @Nullable public final String getFilepath() { return this.filepath; } @NotNull public final String getContent() { return this.content; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final String component1() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component2() {
/*    */     return this.filepath;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ContextItem copy(@Nullable String type, @Nullable String filepath, @NotNull String content) {
/*    */     Intrinsics.checkNotNullParameter(content, "content");
/*    */     return new ContextItem(type, filepath, content);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ContextItem(type=" + this.type + ", filepath=" + this.filepath + ", content=" + this.content + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = (this.type == null) ? 0 : this.type.hashCode();
/*    */     result = result * 31 + ((this.filepath == null) ? 0 : this.filepath.hashCode());
/*    */     return result * 31 + this.content.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ContextItem))
/*    */       return false; 
/*    */     ContextItem contextItem = (ContextItem)other;
/*    */     return !Intrinsics.areEqual(this.type, contextItem.type) ? false : (!Intrinsics.areEqual(this.filepath, contextItem.filepath) ? false : (!!Intrinsics.areEqual(this.content, contextItem.content)));
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-jet-jvm-0.4.32.jar!\ai\grazie\model\jet\ContextItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */