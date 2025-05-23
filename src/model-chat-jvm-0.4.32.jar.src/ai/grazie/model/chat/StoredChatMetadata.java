/*    */ package ai.grazie.model.chat;
/*    */ 
/*    */ import ai.grazie.model.llm.profile.LLMProfileID;
/*    */ import ai.grazie.utils.mpp.UUID;
/*    */ import ai.grazie.utils.mpp.time.Timestamp;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\031\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 22\0020\001:\00212BS\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\006\020\n\032\0020\013\022\b\020\f\032\004\030\0010\r\022\b\020\016\032\004\030\0010\r\022\b\020\017\032\004\030\0010\020¢\006\002\020\021B5\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013\022\006\020\f\032\0020\r\022\006\020\016\032\0020\r¢\006\002\020\022J\t\020\036\032\0020\005HÆ\003J\t\020\037\032\0020\007HÆ\003J\t\020 \032\0020\tHÆ\003J\t\020!\032\0020\013HÆ\003J\t\020\"\032\0020\rHÆ\003J\t\020#\032\0020\rHÆ\003JE\020$\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\r2\b\b\002\020\016\032\0020\rHÆ\001J\023\020%\032\0020\0132\b\020&\032\004\030\0010\001HÖ\003J\t\020'\032\0020\003HÖ\001J\t\020(\032\0020\007HÖ\001J&\020)\032\0020*2\006\020+\032\0020\0002\006\020,\032\0020-2\006\020.\032\0020/HÁ\001¢\006\002\b0R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\023\020\024R\021\020\f\032\0020\r¢\006\b\n\000\032\004\b\025\020\026R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\027\020\030R\021\020\n\032\0020\013¢\006\b\n\000\032\004\b\031\020\032R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\033\020\034R\021\020\016\032\0020\r¢\006\b\n\000\032\004\b\035\020\026¨\0063"}, d2 = {"Lai/grazie/model/chat/StoredChatMetadata;", "", "seen1", "", "chatId", "Lai/grazie/utils/mpp/UUID;", "name", "", "profile", "Lai/grazie/model/llm/profile/LLMProfileID;", "pinned", "", "created", "Lai/grazie/utils/mpp/time/Timestamp;", "updated", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/utils/mpp/UUID;Ljava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;ZLai/grazie/utils/mpp/time/Timestamp;Lai/grazie/utils/mpp/time/Timestamp;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/utils/mpp/UUID;Ljava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;ZLai/grazie/utils/mpp/time/Timestamp;Lai/grazie/utils/mpp/time/Timestamp;)V", "getChatId", "()Lai/grazie/utils/mpp/UUID;", "getCreated", "()Lai/grazie/utils/mpp/time/Timestamp;", "getName", "()Ljava/lang/String;", "getPinned", "()Z", "getProfile", "()Lai/grazie/model/llm/profile/LLMProfileID;", "getUpdated", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_chat", "$serializer", "Companion", "model-chat"})
/*    */ public final class StoredChatMetadata {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final UUID chatId;
/*    */   @NotNull
/*    */   private final String name;
/*    */   
/* 20 */   public StoredChatMetadata(@NotNull UUID chatId, @NotNull String name, @NotNull LLMProfileID profile, boolean pinned, @NotNull Timestamp created, @NotNull Timestamp updated) { this.chatId = chatId;
/*    */     
/* 22 */     this.name = name;
/* 23 */     this.profile = profile;
/* 24 */     this.pinned = pinned;
/* 25 */     this.created = created;
/* 26 */     this.updated = updated; } @NotNull private final LLMProfileID profile; private final boolean pinned; @NotNull private final Timestamp created; @NotNull private final Timestamp updated; @NotNull public final Timestamp getUpdated() { return this.updated; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/chat/StoredChatMetadata.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/chat/StoredChatMetadata;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-chat"})
/*    */   public static final class $serializer implements GeneratedSerializer<StoredChatMetadata> {
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
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[6];
/*    */       arrayOfKSerializer[0] = (KSerializer)UUID.Serializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[2] = (KSerializer)LLMProfileID.Serializer.INSTANCE;
/*    */       arrayOfKSerializer[3] = (KSerializer)BooleanSerializer.INSTANCE;
/*    */       arrayOfKSerializer[4] = (KSerializer)Timestamp.Serializer.INSTANCE;
/*    */       arrayOfKSerializer[5] = (KSerializer)Timestamp.Serializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public StoredChatMetadata deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       UUID uUID = null;
/*    */       String str = null;
/*    */       LLMProfileID lLMProfileID = null;
/*    */       boolean bool1 = false;
/*    */       Timestamp timestamp1 = null, timestamp2 = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         uUID = (UUID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)UUID.Serializer.INSTANCE, uUID);
/*    */         i |= 0x1;
/*    */         str = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */         lLMProfileID = (LLMProfileID)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID);
/*    */         i |= 0x4;
/*    */         bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 3);
/*    */         i |= 0x8;
/*    */         timestamp1 = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp1);
/*    */         i |= 0x10;
/*    */         timestamp2 = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp2);
/*    */         i |= 0x20;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               uUID = (UUID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)UUID.Serializer.INSTANCE, uUID);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               str = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               lLMProfileID = (LLMProfileID)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 3);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               timestamp1 = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp1);
/*    */               i |= 0x10;
/*    */               continue;
/*    */             case 5:
/*    */               timestamp2 = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp2);
/*    */               i |= 0x20;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new StoredChatMetadata(i, uUID, str, lLMProfileID, bool1, timestamp1, timestamp2, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull StoredChatMetadata value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       StoredChatMetadata.write$Self$model_chat(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.chat.StoredChatMetadata", INSTANCE, 6);
/*    */       pluginGeneratedSerialDescriptor.addElement("chatId", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("name", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("profile", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("pinned", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("created", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("updated", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/chat/StoredChatMetadata$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/chat/StoredChatMetadata;", "model-chat"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<StoredChatMetadata> serializer() {
/*    */       return (KSerializer<StoredChatMetadata>)StoredChatMetadata.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final UUID getChatId() {
/*    */     return this.chatId;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getName() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LLMProfileID getProfile() {
/*    */     return this.profile;
/*    */   }
/*    */   
/*    */   public final boolean getPinned() {
/*    */     return this.pinned;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Timestamp getCreated() {
/*    */     return this.created;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final UUID component1() {
/*    */     return this.chatId;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LLMProfileID component3() {
/*    */     return this.profile;
/*    */   }
/*    */   
/*    */   public final boolean component4() {
/*    */     return this.pinned;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Timestamp component5() {
/*    */     return this.created;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Timestamp component6() {
/*    */     return this.updated;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final StoredChatMetadata copy(@NotNull UUID chatId, @NotNull String name, @NotNull LLMProfileID profile, boolean pinned, @NotNull Timestamp created, @NotNull Timestamp updated) {
/*    */     Intrinsics.checkNotNullParameter(chatId, "chatId");
/*    */     Intrinsics.checkNotNullParameter(name, "name");
/*    */     Intrinsics.checkNotNullParameter(profile, "profile");
/*    */     Intrinsics.checkNotNullParameter(created, "created");
/*    */     Intrinsics.checkNotNullParameter(updated, "updated");
/*    */     return new StoredChatMetadata(chatId, name, profile, pinned, created, updated);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "StoredChatMetadata(chatId=" + this.chatId + ", name=" + this.name + ", profile=" + this.profile + ", pinned=" + this.pinned + ", created=" + this.created + ", updated=" + this.updated + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.chatId.hashCode();
/*    */     result = result * 31 + this.name.hashCode();
/*    */     result = result * 31 + this.profile.hashCode();
/*    */     result = result * 31 + Boolean.hashCode(this.pinned);
/*    */     result = result * 31 + this.created.hashCode();
/*    */     return result * 31 + this.updated.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof StoredChatMetadata))
/*    */       return false; 
/*    */     StoredChatMetadata storedChatMetadata = (StoredChatMetadata)other;
/*    */     return !Intrinsics.areEqual(this.chatId, storedChatMetadata.chatId) ? false : (!Intrinsics.areEqual(this.name, storedChatMetadata.name) ? false : (!Intrinsics.areEqual(this.profile, storedChatMetadata.profile) ? false : ((this.pinned != storedChatMetadata.pinned) ? false : (!Intrinsics.areEqual(this.created, storedChatMetadata.created) ? false : (!!Intrinsics.areEqual(this.updated, storedChatMetadata.updated))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-chat-jvm-0.4.32.jar!\ai\grazie\model\chat\StoredChatMetadata.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */