/*    */ package ai.grazie.model.llm.profile.dto.v3;
/*    */ 
/*    */ import ai.grazie.model.cloud.ContentType;
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
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.IntSerializer;
/*    */ import kotlinx.serialization.internal.LinkedHashSetSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
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
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\"\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\017\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 (2\0020\001:\002'(B;\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\006\020\007\032\0020\003\022\b\020\b\032\004\030\0010\003\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B%\022\f\020\004\032\b\022\004\022\0020\0060\005\022\006\020\007\032\0020\003\022\b\020\b\032\004\030\0010\003¢\006\002\020\fJ\017\020\024\032\b\022\004\022\0020\0060\005HÆ\003J\t\020\025\032\0020\003HÆ\003J\020\020\026\032\004\030\0010\003HÆ\003¢\006\002\020\020J4\020\027\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\b\b\002\020\007\032\0020\0032\n\b\002\020\b\032\004\030\0010\003HÆ\001¢\006\002\020\030J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\001HÖ\003J\t\020\034\032\0020\003HÖ\001J\t\020\035\032\0020\036HÖ\001J&\020\037\032\0020 2\006\020!\032\0020\0002\006\020\"\032\0020#2\006\020$\032\0020%HÁ\001¢\006\002\b&R\021\020\007\032\0020\003¢\006\b\n\000\032\004\b\r\020\016R\025\020\b\032\004\030\0010\003¢\006\n\n\002\020\021\032\004\b\017\020\020R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\022\020\023¨\006)"}, d2 = {"Lai/grazie/model/llm/profile/dto/v3/MediaDataDefinitionDTO;", "", "seen1", "", "supportedTypes", "", "Lai/grazie/model/cloud/ContentType;", "maxElementSize", "maxElements", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/Set;ILjava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/Set;ILjava/lang/Integer;)V", "getMaxElementSize", "()I", "getMaxElements", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSupportedTypes", "()Ljava/util/Set;", "component1", "component2", "component3", "copy", "(Ljava/util/Set;ILjava/lang/Integer;)Lai/grazie/model/llm/profile/dto/v3/MediaDataDefinitionDTO;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_llm", "$serializer", "Companion", "model-llm"})
/*    */ public final class MediaDataDefinitionDTO
/*    */ {
/*    */   @NotNull
/*    */   private final Set<ContentType> supportedTypes;
/*    */   private final int maxElementSize;
/*    */   @Nullable
/*    */   private final Integer maxElements;
/*    */   @NotNull
/* 54 */   public static final Companion Companion = new Companion(null); @JvmField
/*    */   @NotNull
/*    */   private static final KSerializer<Object>[] $childSerializers; public MediaDataDefinitionDTO(@NotNull Set<ContentType> supportedTypes, int maxElementSize, @Nullable Integer maxElements) {
/* 57 */     this.supportedTypes = supportedTypes;
/* 58 */     this.maxElementSize = maxElementSize;
/* 59 */     this.maxElements = maxElements; } @Nullable public final Integer getMaxElements() { return this.maxElements; }
/*    */ 
/*    */   
/*    */   static {
/*    */     KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*    */     arrayOfKSerializer[0] = (KSerializer)new LinkedHashSetSerializer((KSerializer)ContentType.Serializer.INSTANCE);
/*    */     arrayOfKSerializer[1] = null;
/*    */     arrayOfKSerializer[2] = null;
/*    */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/llm/profile/dto/v3/MediaDataDefinitionDTO.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/llm/profile/dto/v3/MediaDataDefinitionDTO;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-llm"})
/*    */   public static final class $serializer implements GeneratedSerializer<MediaDataDefinitionDTO> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])MediaDataDefinitionDTO.$childSerializers, arrayOfKSerializer2 = new KSerializer[3];
/*    */       arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*    */       arrayOfKSerializer2[1] = (KSerializer)IntSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[2] = BuiltinSerializersKt.getNullable((KSerializer)IntSerializer.INSTANCE);
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public MediaDataDefinitionDTO deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       Set set = null;
/*    */       int j = 0;
/*    */       Integer integer = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])MediaDataDefinitionDTO.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         set = (Set)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], set);
/*    */         i |= 0x1;
/*    */         j = compositeDecoder.decodeIntElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */         integer = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)IntSerializer.INSTANCE, integer);
/*    */         i |= 0x4;
/*    */       } else {
/*    */         while (bool) {
/*    */           int k = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (k) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               set = (Set)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], set);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               j = compositeDecoder.decodeIntElement(serialDescriptor, 1);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               integer = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)IntSerializer.INSTANCE, integer);
/*    */               i |= 0x4;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(k);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new MediaDataDefinitionDTO(i, set, j, integer, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull MediaDataDefinitionDTO value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       MediaDataDefinitionDTO.write$Self$model_llm(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.llm.profile.dto.v3.MediaDataDefinitionDTO", INSTANCE, 3);
/*    */       pluginGeneratedSerialDescriptor.addElement("supportedTypes", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("maxElementSize", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("maxElements", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/llm/profile/dto/v3/MediaDataDefinitionDTO$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/llm/profile/dto/v3/MediaDataDefinitionDTO;", "model-llm"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<MediaDataDefinitionDTO> serializer() {
/*    */       return (KSerializer<MediaDataDefinitionDTO>)MediaDataDefinitionDTO.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Set<ContentType> getSupportedTypes() {
/*    */     return this.supportedTypes;
/*    */   }
/*    */   
/*    */   public final int getMaxElementSize() {
/*    */     return this.maxElementSize;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Set<ContentType> component1() {
/*    */     return this.supportedTypes;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.maxElementSize;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Integer component3() {
/*    */     return this.maxElements;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final MediaDataDefinitionDTO copy(@NotNull Set<ContentType> supportedTypes, int maxElementSize, @Nullable Integer maxElements) {
/*    */     Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
/*    */     return new MediaDataDefinitionDTO(supportedTypes, maxElementSize, maxElements);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "MediaDataDefinitionDTO(supportedTypes=" + this.supportedTypes + ", maxElementSize=" + this.maxElementSize + ", maxElements=" + this.maxElements + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.supportedTypes.hashCode();
/*    */     result = result * 31 + Integer.hashCode(this.maxElementSize);
/*    */     return result * 31 + ((this.maxElements == null) ? 0 : this.maxElements.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof MediaDataDefinitionDTO))
/*    */       return false; 
/*    */     MediaDataDefinitionDTO mediaDataDefinitionDTO = (MediaDataDefinitionDTO)other;
/*    */     return !Intrinsics.areEqual(this.supportedTypes, mediaDataDefinitionDTO.supportedTypes) ? false : ((this.maxElementSize != mediaDataDefinitionDTO.maxElementSize) ? false : (!!Intrinsics.areEqual(this.maxElements, mediaDataDefinitionDTO.maxElements)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\profile\dto\v3\MediaDataDefinitionDTO.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */