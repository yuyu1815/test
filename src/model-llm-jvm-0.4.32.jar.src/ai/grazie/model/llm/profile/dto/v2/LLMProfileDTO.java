/*    */ package ai.grazie.model.llm.profile.dto.v2;
/*    */ import ai.grazie.model.llm.profile.LLMProfileID;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ 
/*    */ @Serializable
/*    */ @Deprecated(message = "In favor of ai.grazie.model.llm.profile.dto.v3.LLMProfileDTO")
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\021\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\036\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 82\0020\001:\00278B[\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007\022\b\020\t\032\004\030\0010\n\022\b\020\013\032\004\030\0010\f\022\b\020\r\032\004\030\0010\016\022\b\020\017\032\004\030\0010\003\022\b\020\020\032\004\030\0010\021¢\006\002\020\022BC\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007\022\b\020\t\032\004\030\0010\n\022\b\020\013\032\004\030\0010\f\022\b\020\r\032\004\030\0010\016\022\b\020\017\032\004\030\0010\003¢\006\002\020\023J\t\020#\032\0020\005HÆ\003J\024\020$\032\b\022\004\022\0020\b0\007HÆ\003¢\006\002\020\037J\013\020%\032\004\030\0010\nHÆ\003J\013\020&\032\004\030\0010\fHÆ\003J\020\020'\032\004\030\0010\016HÆ\003¢\006\002\020\034J\020\020(\032\004\030\0010\003HÆ\003¢\006\002\020\031JX\020)\032\0020\0002\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\0072\n\b\002\020\t\032\004\030\0010\n2\n\b\002\020\013\032\004\030\0010\f2\n\b\002\020\r\032\004\030\0010\0162\n\b\002\020\017\032\004\030\0010\003HÆ\001¢\006\002\020*J\023\020+\032\0020\0162\b\020,\032\004\030\0010\001HÖ\003J\t\020-\032\0020\003HÖ\001J\t\020.\032\0020\bHÖ\001J&\020/\032\002002\006\0201\032\0020\0002\006\0202\032\002032\006\0204\032\00205HÁ\001¢\006\002\b6R\023\020\t\032\004\030\0010\n¢\006\b\n\000\032\004\b\024\020\025R\023\020\013\032\004\030\0010\f¢\006\b\n\000\032\004\b\026\020\027R\025\020\017\032\004\030\0010\003¢\006\n\n\002\020\032\032\004\b\030\020\031R\025\020\r\032\004\030\0010\016¢\006\n\n\002\020\035\032\004\b\033\020\034R\031\020\006\032\b\022\004\022\0020\b0\007¢\006\n\n\002\020 \032\004\b\036\020\037R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b!\020\"¨\0069"}, d2 = {"Lai/grazie/model/llm/profile/dto/v2/LLMProfileDTO;", "", "seen1", "", "id", "Lai/grazie/model/llm/profile/LLMProfileID;", "features", "", "", "chatDefinition", "Lai/grazie/model/llm/profile/dto/v2/ChatDefinitionDTO;", "completionDefinition", "Lai/grazie/model/llm/profile/dto/v2/CompletionDefinitionDTO;", "deprecated", "", "contextLimit", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/llm/profile/LLMProfileID;[Ljava/lang/String;Lai/grazie/model/llm/profile/dto/v2/ChatDefinitionDTO;Lai/grazie/model/llm/profile/dto/v2/CompletionDefinitionDTO;Ljava/lang/Boolean;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/llm/profile/LLMProfileID;[Ljava/lang/String;Lai/grazie/model/llm/profile/dto/v2/ChatDefinitionDTO;Lai/grazie/model/llm/profile/dto/v2/CompletionDefinitionDTO;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getChatDefinition", "()Lai/grazie/model/llm/profile/dto/v2/ChatDefinitionDTO;", "getCompletionDefinition", "()Lai/grazie/model/llm/profile/dto/v2/CompletionDefinitionDTO;", "getContextLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDeprecated", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFeatures", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getId", "()Lai/grazie/model/llm/profile/LLMProfileID;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lai/grazie/model/llm/profile/LLMProfileID;[Ljava/lang/String;Lai/grazie/model/llm/profile/dto/v2/ChatDefinitionDTO;Lai/grazie/model/llm/profile/dto/v2/CompletionDefinitionDTO;Ljava/lang/Boolean;Ljava/lang/Integer;)Lai/grazie/model/llm/profile/dto/v2/LLMProfileDTO;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_llm", "$serializer", "Companion", "model-llm"})
/*    */ public final class LLMProfileDTO {
/*    */   @NotNull
/* 11 */   public static final Companion Companion = new Companion(null); @NotNull private final LLMProfileID id; @NotNull private final String[] features; @Nullable private final ChatDefinitionDTO chatDefinition; @Nullable private final CompletionDefinitionDTO completionDefinition; @Nullable
/*    */   private final Boolean deprecated; @Nullable
/*    */   private final Integer contextLimit; @JvmField
/*    */   @NotNull
/* 15 */   private static final KSerializer<Object>[] $childSerializers; public LLMProfileDTO(@NotNull LLMProfileID id, @NotNull String[] features, @Nullable ChatDefinitionDTO chatDefinition, @Nullable CompletionDefinitionDTO completionDefinition, @Nullable Boolean deprecated, @Nullable Integer contextLimit) { this.id = id;
/* 16 */     this.features = features;
/* 17 */     this.chatDefinition = chatDefinition;
/* 18 */     this.completionDefinition = completionDefinition;
/* 19 */     this.deprecated = deprecated;
/* 20 */     this.contextLimit = contextLimit; } static { KSerializer[] arrayOfKSerializer = new KSerializer[6]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = null; arrayOfKSerializer[4] = null; arrayOfKSerializer[5] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Nullable public final Integer getContextLimit() { return this.contextLimit; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/llm/profile/dto/v2/LLMProfileDTO.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/llm/profile/dto/v2/LLMProfileDTO;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-llm"})
/*    */   public static final class $serializer implements GeneratedSerializer<LLMProfileDTO> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])LLMProfileDTO.$childSerializers, arrayOfKSerializer2 = new KSerializer[6];
/*    */       arrayOfKSerializer2[0] = (KSerializer)LLMProfileID.Serializer.INSTANCE;
/*    */       arrayOfKSerializer2[1] = arrayOfKSerializer1[1];
/*    */       arrayOfKSerializer2[2] = BuiltinSerializersKt.getNullable((KSerializer)ChatDefinitionDTO.$serializer.INSTANCE);
/*    */       arrayOfKSerializer2[3] = BuiltinSerializersKt.getNullable((KSerializer)CompletionDefinitionDTO.$serializer.INSTANCE);
/*    */       arrayOfKSerializer2[4] = BuiltinSerializersKt.getNullable((KSerializer)BooleanSerializer.INSTANCE);
/*    */       arrayOfKSerializer2[5] = BuiltinSerializersKt.getNullable((KSerializer)IntSerializer.INSTANCE);
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public LLMProfileDTO deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       LLMProfileID lLMProfileID = null;
/*    */       String[] arrayOfString = null;
/*    */       ChatDefinitionDTO chatDefinitionDTO = null;
/*    */       CompletionDefinitionDTO completionDefinitionDTO = null;
/*    */       Boolean bool1 = null;
/*    */       Integer integer = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])LLMProfileDTO.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         lLMProfileID = (LLMProfileID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID);
/*    */         i |= 0x1;
/*    */         arrayOfString = (String[])compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], arrayOfString);
/*    */         i |= 0x2;
/*    */         chatDefinitionDTO = (ChatDefinitionDTO)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)ChatDefinitionDTO.$serializer.INSTANCE, chatDefinitionDTO);
/*    */         i |= 0x4;
/*    */         completionDefinitionDTO = (CompletionDefinitionDTO)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)CompletionDefinitionDTO.$serializer.INSTANCE, completionDefinitionDTO);
/*    */         i |= 0x8;
/*    */         bool1 = (Boolean)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)BooleanSerializer.INSTANCE, bool1);
/*    */         i |= 0x10;
/*    */         integer = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy)IntSerializer.INSTANCE, integer);
/*    */         i |= 0x20;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               lLMProfileID = (LLMProfileID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               arrayOfString = (String[])compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], arrayOfString);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               chatDefinitionDTO = (ChatDefinitionDTO)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)ChatDefinitionDTO.$serializer.INSTANCE, chatDefinitionDTO);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               completionDefinitionDTO = (CompletionDefinitionDTO)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)CompletionDefinitionDTO.$serializer.INSTANCE, completionDefinitionDTO);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               bool1 = (Boolean)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)BooleanSerializer.INSTANCE, bool1);
/*    */               i |= 0x10;
/*    */               continue;
/*    */             case 5:
/*    */               integer = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy)IntSerializer.INSTANCE, integer);
/*    */               i |= 0x20;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new LLMProfileDTO(i, lLMProfileID, arrayOfString, chatDefinitionDTO, completionDefinitionDTO, bool1, integer, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull LLMProfileDTO value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       LLMProfileDTO.write$Self$model_llm(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.llm.profile.dto.v2.LLMProfileDTO", INSTANCE, 6);
/*    */       pluginGeneratedSerialDescriptor.addElement("id", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("features", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("chatDefinition", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("completionDefinition", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("deprecated", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("contextLimit", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/llm/profile/dto/v2/LLMProfileDTO$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/llm/profile/dto/v2/LLMProfileDTO;", "model-llm"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<LLMProfileDTO> serializer() {
/*    */       return (KSerializer<LLMProfileDTO>)LLMProfileDTO.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LLMProfileID getId() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String[] getFeatures() {
/*    */     return this.features;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final ChatDefinitionDTO getChatDefinition() {
/*    */     return this.chatDefinition;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final CompletionDefinitionDTO getCompletionDefinition() {
/*    */     return this.completionDefinition;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Boolean getDeprecated() {
/*    */     return this.deprecated;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LLMProfileID component1() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String[] component2() {
/*    */     return this.features;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final ChatDefinitionDTO component3() {
/*    */     return this.chatDefinition;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final CompletionDefinitionDTO component4() {
/*    */     return this.completionDefinition;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Boolean component5() {
/*    */     return this.deprecated;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Integer component6() {
/*    */     return this.contextLimit;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LLMProfileDTO copy(@NotNull LLMProfileID id, @NotNull String[] features, @Nullable ChatDefinitionDTO chatDefinition, @Nullable CompletionDefinitionDTO completionDefinition, @Nullable Boolean deprecated, @Nullable Integer contextLimit) {
/*    */     Intrinsics.checkNotNullParameter(id, "id");
/*    */     Intrinsics.checkNotNullParameter(features, "features");
/*    */     return new LLMProfileDTO(id, features, chatDefinition, completionDefinition, deprecated, contextLimit);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "LLMProfileDTO(id=" + this.id + ", features=" + Arrays.toString((Object[])this.features) + ", chatDefinition=" + this.chatDefinition + ", completionDefinition=" + this.completionDefinition + ", deprecated=" + this.deprecated + ", contextLimit=" + this.contextLimit + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.id.hashCode();
/*    */     result = result * 31 + Arrays.hashCode((Object[])this.features);
/*    */     result = result * 31 + ((this.chatDefinition == null) ? 0 : this.chatDefinition.hashCode());
/*    */     result = result * 31 + ((this.completionDefinition == null) ? 0 : this.completionDefinition.hashCode());
/*    */     result = result * 31 + ((this.deprecated == null) ? 0 : this.deprecated.hashCode());
/*    */     return result * 31 + ((this.contextLimit == null) ? 0 : this.contextLimit.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LLMProfileDTO))
/*    */       return false; 
/*    */     LLMProfileDTO lLMProfileDTO = (LLMProfileDTO)other;
/*    */     return !Intrinsics.areEqual(this.id, lLMProfileDTO.id) ? false : (!Intrinsics.areEqual(this.features, lLMProfileDTO.features) ? false : (!Intrinsics.areEqual(this.chatDefinition, lLMProfileDTO.chatDefinition) ? false : (!Intrinsics.areEqual(this.completionDefinition, lLMProfileDTO.completionDefinition) ? false : (!Intrinsics.areEqual(this.deprecated, lLMProfileDTO.deprecated) ? false : (!!Intrinsics.areEqual(this.contextLimit, lLMProfileDTO.contextLimit))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\profile\dto\v2\LLMProfileDTO.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */