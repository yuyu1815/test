/*    */ package ai.grazie.code.indexing.model;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
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
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
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
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\t\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0372\0020\001:\002\036\037B-\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\035\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\005¢\006\002\020\nJ\013\020\016\032\004\030\0010\005HÆ\003J\013\020\017\032\004\030\0010\005HÆ\003J!\020\020\032\0020\0002\n\b\002\020\004\032\004\030\0010\0052\n\b\002\020\006\032\004\030\0010\005HÆ\001J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\001HÖ\003J\t\020\024\032\0020\003HÖ\001J\t\020\025\032\0020\005HÖ\001J&\020\026\032\0020\0272\006\020\030\032\0020\0002\006\020\031\032\0020\0322\006\020\033\032\0020\034HÁ\001¢\006\002\b\035R\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\013\020\fR\023\020\006\032\004\030\0010\005¢\006\b\n\000\032\004\b\r\020\f¨\006 "}, d2 = {"Lai/grazie/code/indexing/model/IndexingAttributes;", "", "seen1", "", "chatModelId", "", "ijModelVersion", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getChatModelId", "()Ljava/lang/String;", "getIjModelVersion", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_indexing", "$serializer", "Companion", "model-indexing"})
/*    */ public final class IndexingAttributes
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @Nullable
/*    */   private final String chatModelId;
/*    */   @Nullable
/*    */   private final String ijModelVersion;
/*    */   
/*    */   public IndexingAttributes(@Nullable String chatModelId, @Nullable String ijModelVersion) {
/* 44 */     this.chatModelId = chatModelId;
/* 45 */     this.ijModelVersion = ijModelVersion; } @Nullable public final String getIjModelVersion() { return this.ijModelVersion; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/code/indexing/model/IndexingAttributes.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/code/indexing/model/IndexingAttributes;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-indexing"})
/*    */   public static final class $serializer implements GeneratedSerializer<IndexingAttributes> {
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
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*    */       arrayOfKSerializer[0] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer[1] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public IndexingAttributes deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str1 = null, str2 = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy)StringSerializer.INSTANCE, str1);
/*    */         i |= 0x1;
/*    */         str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*    */         i |= 0x2;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy)StringSerializer.INSTANCE, str1);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*    */               i |= 0x2;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new IndexingAttributes(i, str1, str2, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull IndexingAttributes value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       IndexingAttributes.write$Self$model_indexing(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.code.indexing.model.IndexingAttributes", INSTANCE, 2);
/*    */       pluginGeneratedSerialDescriptor.addElement("chatModelId", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("ijModelVersion", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/code/indexing/model/IndexingAttributes$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/code/indexing/model/IndexingAttributes;", "model-indexing"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<IndexingAttributes> serializer() {
/*    */       return (KSerializer<IndexingAttributes>)IndexingAttributes.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getChatModelId() {
/*    */     return this.chatModelId;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component1() {
/*    */     return this.chatModelId;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component2() {
/*    */     return this.ijModelVersion;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final IndexingAttributes copy(@Nullable String chatModelId, @Nullable String ijModelVersion) {
/*    */     return new IndexingAttributes(chatModelId, ijModelVersion);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "IndexingAttributes(chatModelId=" + this.chatModelId + ", ijModelVersion=" + this.ijModelVersion + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = (this.chatModelId == null) ? 0 : this.chatModelId.hashCode();
/*    */     return result * 31 + ((this.ijModelVersion == null) ? 0 : this.ijModelVersion.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof IndexingAttributes))
/*    */       return false; 
/*    */     IndexingAttributes indexingAttributes = (IndexingAttributes)other;
/*    */     return !Intrinsics.areEqual(this.chatModelId, indexingAttributes.chatModelId) ? false : (!!Intrinsics.areEqual(this.ijModelVersion, indexingAttributes.ijModelVersion));
/*    */   }
/*    */   
/*    */   public IndexingAttributes() {
/*    */     this((String)null, (String)null, 3, (DefaultConstructorMarker)null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\IndexingAttributes.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */