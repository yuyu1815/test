/*    */ package ai.grazie.model.llm.profile.dto;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Deprecated(message = "In favor of ai.grazie.model.llm.profile.dto.v2.ChatDefinitionDTO")
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\020\016\n\000\n\002\020\"\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B9\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\016\020\007\032\n\022\004\022\0020\t\030\0010\b\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB!\022\f\020\004\032\b\022\004\022\0020\0060\005\022\f\020\007\032\b\022\004\022\0020\t0\b¢\006\002\020\rJ\017\020\022\032\b\022\004\022\0020\0060\005HÆ\003J\017\020\023\032\b\022\004\022\0020\t0\bHÆ\003J)\020\024\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\016\b\002\020\007\032\b\022\004\022\0020\t0\bHÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\001HÖ\003J\t\020\030\032\0020\003HÖ\001J\t\020\031\032\0020\006HÖ\001J&\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÁ\001¢\006\002\b!R\027\020\007\032\b\022\004\022\0020\t0\b¢\006\b\n\000\032\004\b\016\020\017R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\020\020\021¨\006$"}, d2 = {"Lai/grazie/model/llm/profile/dto/ChatDefinitionDTO;", "", "seen1", "", "roles", "", "", "parameters", "", "Lai/grazie/utils/attributes/Attributes$Key;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/util/Set;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Ljava/util/Set;)V", "getParameters", "()Ljava/util/Set;", "getRoles", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_llm", "$serializer", "Companion", "model-llm"})
/*    */ public final class ChatDefinitionDTO {
/*    */   @NotNull
/* 23 */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final List<String> roles; @NotNull
/*    */   private final Set<Attributes.Key> parameters; @JvmField
/*    */   @NotNull
/* 27 */   private static final KSerializer<Object>[] $childSerializers; public ChatDefinitionDTO(@NotNull List<String> roles, @NotNull Set<Attributes.Key> parameters) { this.roles = roles;
/* 28 */     this.parameters = parameters; } static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[1] = (KSerializer)new LinkedHashSetSerializer(Attributes.Key.Companion.serializer()); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @NotNull public final Set<Attributes.Key> getParameters() { return this.parameters; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/llm/profile/dto/ChatDefinitionDTO.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/llm/profile/dto/ChatDefinitionDTO;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-llm"})
/*    */   public static final class $serializer implements GeneratedSerializer<ChatDefinitionDTO> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])ChatDefinitionDTO.$childSerializers, arrayOfKSerializer2 = new KSerializer[2];
/*    */       arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*    */       arrayOfKSerializer2[1] = arrayOfKSerializer1[1];
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public ChatDefinitionDTO deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       List list = null;
/*    */       Set set = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])ChatDefinitionDTO.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*    */         i |= 0x1;
/*    */         set = (Set)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], set);
/*    */         i |= 0x2;
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
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new ChatDefinitionDTO(i, list, set, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull ChatDefinitionDTO value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       ChatDefinitionDTO.write$Self$model_llm(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.llm.profile.dto.ChatDefinitionDTO", INSTANCE, 2);
/*    */       pluginGeneratedSerialDescriptor.addElement("roles", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("parameters", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/llm/profile/dto/ChatDefinitionDTO$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/llm/profile/dto/ChatDefinitionDTO;", "model-llm"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<ChatDefinitionDTO> serializer() {
/*    */       return (KSerializer<ChatDefinitionDTO>)ChatDefinitionDTO.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> getRoles() {
/*    */     return this.roles;
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
/*    */   @NotNull
/*    */   public final ChatDefinitionDTO copy(@NotNull List<String> roles, @NotNull Set<? extends Attributes.Key> parameters) {
/*    */     Intrinsics.checkNotNullParameter(roles, "roles");
/*    */     Intrinsics.checkNotNullParameter(parameters, "parameters");
/*    */     return new ChatDefinitionDTO(roles, parameters);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ChatDefinitionDTO(roles=" + this.roles + ", parameters=" + this.parameters + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.roles.hashCode();
/*    */     return result * 31 + this.parameters.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ChatDefinitionDTO))
/*    */       return false; 
/*    */     ChatDefinitionDTO chatDefinitionDTO = (ChatDefinitionDTO)other;
/*    */     return !Intrinsics.areEqual(this.roles, chatDefinitionDTO.roles) ? false : (!!Intrinsics.areEqual(this.parameters, chatDefinitionDTO.parameters));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\profile\dto\ChatDefinitionDTO.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */