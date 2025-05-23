/*    */ package ai.grazie.user.storage.model;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\004\bÆ\002\030\0002\0020\001:\002\003\004B\007\b\002¢\006\002\020\002¨\006\005"}, d2 = {"Lai/grazie/user/storage/model/EventAPI;", "", "()V", "Redis", "UserEvent", "user-strg-model"})
/*    */ public final class EventAPI {
/*    */   @NotNull
/*    */   public static final EventAPI INSTANCE = new EventAPI();
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004XD¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/user/storage/model/EventAPI$Redis;", "Lai/grazie/model/cloud/RedisAPI;", "()V", "topic", "", "getTopic", "()Ljava/lang/String;", "user-strg-model"})
/*    */   public static final class Redis implements RedisAPI { @NotNull
/* 10 */     public static final Redis INSTANCE = new Redis(); @NotNull private static final String topic = "user.strg.event.user.pubsub"; @NotNull public String getTopic() { return topic; } } @Serializable
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\"\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B3\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\033\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007¢\006\002\020\fJ\t\020\021\032\0020\005HÆ\003J\017\020\022\032\b\022\004\022\0020\b0\007HÆ\003J#\020\023\032\0020\0002\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\007HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\001HÖ\003J\t\020\027\032\0020\003HÖ\001J\t\020\030\032\0020\031HÖ\001J&\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÁ\001¢\006\002\b!R\027\020\006\032\b\022\004\022\0020\b0\007¢\006\b\n\000\032\004\b\r\020\016R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020¨\006$"}, d2 = {"Lai/grazie/user/storage/model/EventAPI$UserEvent;", "", "seen1", "", "uid", "Lai/grazie/utils/mpp/UUID;", "attributes", "", "Lai/grazie/user/storage/events/UserAttributeEvent;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/utils/mpp/UUID;Ljava/util/Set;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/utils/mpp/UUID;Ljava/util/Set;)V", "getAttributes", "()Ljava/util/Set;", "getUid", "()Lai/grazie/utils/mpp/UUID;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$user_strg_model", "$serializer", "Companion", "user-strg-model"})
/*    */   public static final class UserEvent { @NotNull
/* 13 */     public static final Companion Companion = new Companion(null); @NotNull private final UUID uid; @NotNull private final Set<UserAttributeEvent> attributes; @JvmField @NotNull
/* 14 */     private static final KSerializer<Object>[] $childSerializers; public UserEvent(@NotNull UUID uid, @NotNull Set<UserAttributeEvent> attributes) { this.uid = uid; this.attributes = attributes; } static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = (KSerializer)new LinkedHashSetSerializer(UserAttributeEvent.Companion.serializer()); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @NotNull public final UUID getUid() { return this.uid; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/user/storage/model/EventAPI.UserEvent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/user/storage/model/EventAPI$UserEvent;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "user-strg-model"}) public static final class $serializer implements GeneratedSerializer<UserEvent> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])EventAPI.UserEvent.$childSerializers, arrayOfKSerializer2 = new KSerializer[2]; arrayOfKSerializer2[0] = (KSerializer)UUID.Serializer.INSTANCE; arrayOfKSerializer2[1] = arrayOfKSerializer1[1]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public EventAPI.UserEvent deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; UUID uUID = null; Set set = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])EventAPI.UserEvent.$childSerializers; if (compositeDecoder.decodeSequentially()) { uUID = (UUID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)UUID.Serializer.INSTANCE, uUID); i |= 0x1; set = (Set)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], set); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: uUID = (UUID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)UUID.Serializer.INSTANCE, uUID); i |= 0x1; continue;case 1: set = (Set)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], set); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new EventAPI.UserEvent(i, uUID, set, null); } public void serialize(@NotNull Encoder encoder, @NotNull EventAPI.UserEvent value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); EventAPI.UserEvent.write$Self$user_strg_model(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.user.storage.model.EventAPI.UserEvent", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("uid", false); pluginGeneratedSerialDescriptor.addElement("attributes", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/user/storage/model/EventAPI$UserEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/user/storage/model/EventAPI$UserEvent;", "user-strg-model"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<EventAPI.UserEvent> serializer() { return (KSerializer<EventAPI.UserEvent>)EventAPI.UserEvent.$serializer.INSTANCE; } } @NotNull public final Set<UserAttributeEvent> getAttributes() { return this.attributes; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final UUID component1() {
/*    */       return this.uid;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Set<UserAttributeEvent> component2() {
/*    */       return this.attributes;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final UserEvent copy(@NotNull UUID uid, @NotNull Set<? extends UserAttributeEvent> attributes) {
/*    */       Intrinsics.checkNotNullParameter(uid, "uid");
/*    */       Intrinsics.checkNotNullParameter(attributes, "attributes");
/*    */       return new UserEvent(uid, attributes);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "UserEvent(uid=" + this.uid + ", attributes=" + this.attributes + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = this.uid.hashCode();
/*    */       return result * 31 + this.attributes.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof UserEvent))
/*    */         return false; 
/*    */       UserEvent userEvent = (UserEvent)other;
/*    */       return !Intrinsics.areEqual(this.uid, userEvent.uid) ? false : (!!Intrinsics.areEqual(this.attributes, userEvent.attributes));
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\user-strg-model-jvm-0.4.32.jar!\ai\grazi\\user\storage\model\EventAPI.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */