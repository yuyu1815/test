/*    */ package ai.grazie.model.llm.profile.dto.v3;
/*    */ 
/*    */ import ai.grazie.utils.attributes.Attributes;
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
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\020\016\n\000\n\002\020\"\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 (2\0020\001:\002'(BC\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\016\020\007\032\n\022\004\022\0020\t\030\0010\b\022\b\020\n\032\004\030\0010\013\022\b\020\f\032\004\030\0010\r¢\006\002\020\016B-\022\f\020\004\032\b\022\004\022\0020\0060\005\022\f\020\007\032\b\022\004\022\0020\t0\b\022\n\b\002\020\n\032\004\030\0010\013¢\006\002\020\017J\017\020\026\032\b\022\004\022\0020\0060\005HÆ\003J\017\020\027\032\b\022\004\022\0020\t0\bHÆ\003J\013\020\030\032\004\030\0010\013HÆ\003J5\020\031\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\016\b\002\020\007\032\b\022\004\022\0020\t0\b2\n\b\002\020\n\032\004\030\0010\013HÆ\001J\023\020\032\032\0020\0332\b\020\034\032\004\030\0010\001HÖ\003J\t\020\035\032\0020\003HÖ\001J\t\020\036\032\0020\006HÖ\001J&\020\037\032\0020 2\006\020!\032\0020\0002\006\020\"\032\0020#2\006\020$\032\0020%HÁ\001¢\006\002\b&R\023\020\n\032\004\030\0010\013¢\006\b\n\000\032\004\b\020\020\021R\027\020\007\032\b\022\004\022\0020\t0\b¢\006\b\n\000\032\004\b\022\020\023R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\024\020\025¨\006)"}, d2 = {"Lai/grazie/model/llm/profile/dto/v3/MultimodalChatDefinitionDTO;", "", "seen1", "", "roles", "", "", "parameters", "", "Lai/grazie/utils/attributes/Attributes$Key;", "mediaDataDefinition", "Lai/grazie/model/llm/profile/dto/v3/MediaDataDefinitionDTO;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/util/Set;Lai/grazie/model/llm/profile/dto/v3/MediaDataDefinitionDTO;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Ljava/util/Set;Lai/grazie/model/llm/profile/dto/v3/MediaDataDefinitionDTO;)V", "getMediaDataDefinition", "()Lai/grazie/model/llm/profile/dto/v3/MediaDataDefinitionDTO;", "getParameters", "()Ljava/util/Set;", "getRoles", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_llm", "$serializer", "Companion", "model-llm"})
/*    */ public final class MultimodalChatDefinitionDTO
/*    */ {
/*    */   @NotNull
/*    */   private final List<String> roles;
/*    */   @NotNull
/*    */   private final Set<Attributes.Key> parameters;
/*    */   @Nullable
/*    */   private final MediaDataDefinitionDTO mediaDataDefinition;
/*    */   @NotNull
/* 46 */   public static final Companion Companion = new Companion(null); @JvmField
/*    */   @NotNull
/*    */   private static final KSerializer<Object>[] $childSerializers; public MultimodalChatDefinitionDTO(@NotNull List<String> roles, @NotNull Set<Attributes.Key> parameters, @Nullable MediaDataDefinitionDTO mediaDataDefinition) {
/* 49 */     this.roles = roles;
/* 50 */     this.parameters = parameters;
/* 51 */     this.mediaDataDefinition = mediaDataDefinition; } @Nullable public final MediaDataDefinitionDTO getMediaDataDefinition() { return this.mediaDataDefinition; }
/*    */ 
/*    */   
/*    */   static {
/*    */     KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*    */     arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE);
/*    */     arrayOfKSerializer[1] = (KSerializer)new LinkedHashSetSerializer(Attributes.Key.Companion.serializer());
/*    */     arrayOfKSerializer[2] = null;
/*    */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/llm/profile/dto/v3/MultimodalChatDefinitionDTO.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/llm/profile/dto/v3/MultimodalChatDefinitionDTO;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-llm"})
/*    */   public static final class $serializer implements GeneratedSerializer<MultimodalChatDefinitionDTO> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])MultimodalChatDefinitionDTO.$childSerializers, arrayOfKSerializer2 = new KSerializer[3];
/*    */       arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*    */       arrayOfKSerializer2[1] = arrayOfKSerializer1[1];
/*    */       arrayOfKSerializer2[2] = BuiltinSerializersKt.getNullable((KSerializer)MediaDataDefinitionDTO.$serializer.INSTANCE);
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public MultimodalChatDefinitionDTO deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       List list = null;
/*    */       Set set = null;
/*    */       MediaDataDefinitionDTO mediaDataDefinitionDTO = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])MultimodalChatDefinitionDTO.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*    */         i |= 0x1;
/*    */         set = (Set)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], set);
/*    */         i |= 0x2;
/*    */         mediaDataDefinitionDTO = (MediaDataDefinitionDTO)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)MediaDataDefinitionDTO.$serializer.INSTANCE, mediaDataDefinitionDTO);
/*    */         i |= 0x4;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               set = (Set)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], set);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               mediaDataDefinitionDTO = (MediaDataDefinitionDTO)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)MediaDataDefinitionDTO.$serializer.INSTANCE, mediaDataDefinitionDTO);
/*    */               i |= 0x4;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new MultimodalChatDefinitionDTO(i, list, set, mediaDataDefinitionDTO, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull MultimodalChatDefinitionDTO value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       MultimodalChatDefinitionDTO.write$Self$model_llm(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.llm.profile.dto.v3.MultimodalChatDefinitionDTO", INSTANCE, 3);
/*    */       pluginGeneratedSerialDescriptor.addElement("roles", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("parameters", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("mediaDataDefinition", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/llm/profile/dto/v3/MultimodalChatDefinitionDTO$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/llm/profile/dto/v3/MultimodalChatDefinitionDTO;", "model-llm"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<MultimodalChatDefinitionDTO> serializer() {
/*    */       return (KSerializer<MultimodalChatDefinitionDTO>)MultimodalChatDefinitionDTO.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> getRoles() {
/*    */     return this.roles;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Set<Attributes.Key> getParameters() {
/*    */     return this.parameters;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> component1() {
/*    */     return this.roles;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Set<Attributes.Key> component2() {
/*    */     return this.parameters;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final MediaDataDefinitionDTO component3() {
/*    */     return this.mediaDataDefinition;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final MultimodalChatDefinitionDTO copy(@NotNull List<String> roles, @NotNull Set<? extends Attributes.Key> parameters, @Nullable MediaDataDefinitionDTO mediaDataDefinition) {
/*    */     Intrinsics.checkNotNullParameter(roles, "roles");
/*    */     Intrinsics.checkNotNullParameter(parameters, "parameters");
/*    */     return new MultimodalChatDefinitionDTO(roles, parameters, mediaDataDefinition);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "MultimodalChatDefinitionDTO(roles=" + this.roles + ", parameters=" + this.parameters + ", mediaDataDefinition=" + this.mediaDataDefinition + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.roles.hashCode();
/*    */     result = result * 31 + this.parameters.hashCode();
/*    */     return result * 31 + ((this.mediaDataDefinition == null) ? 0 : this.mediaDataDefinition.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof MultimodalChatDefinitionDTO))
/*    */       return false; 
/*    */     MultimodalChatDefinitionDTO multimodalChatDefinitionDTO = (MultimodalChatDefinitionDTO)other;
/*    */     return !Intrinsics.areEqual(this.roles, multimodalChatDefinitionDTO.roles) ? false : (!Intrinsics.areEqual(this.parameters, multimodalChatDefinitionDTO.parameters) ? false : (!!Intrinsics.areEqual(this.mediaDataDefinition, multimodalChatDefinitionDTO.mediaDataDefinition)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\profile\dto\v3\MultimodalChatDefinitionDTO.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */