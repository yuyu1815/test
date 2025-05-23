/*    */ package ai.grazie.user.storage.events;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import ai.grazie.utils.mpp.UUID;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\017\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 +2\0020\001:\002*+BA\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\t\022\b\020\013\032\004\030\0010\f¢\006\002\020\rB%\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\t¢\006\002\020\016J\t\020\026\032\0020\005HÆ\003J\t\020\027\032\0020\007HÆ\003J\t\020\030\032\0020\tHÆ\003J\t\020\031\032\0020\tHÆ\003J1\020\032\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\tHÆ\001J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\036HÖ\003J\t\020\037\032\0020\003HÖ\001J\t\020 \032\0020!HÖ\001J&\020\"\032\0020#2\006\020$\032\0020\0002\006\020%\032\0020&2\006\020'\032\0020(HÁ\001¢\006\002\b)R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\017\020\020R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\021\020\022R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\023\020\024R\021\020\n\032\0020\t¢\006\b\n\000\032\004\b\025\020\024¨\006,"}, d2 = {"Lai/grazie/user/storage/events/UserAttributeEvent$Updated;", "Lai/grazie/user/storage/events/UserAttributeEvent;", "seen1", "", "id", "Lai/grazie/utils/mpp/UUID;", "key", "Lai/grazie/utils/attributes/Attributes$Key;", "old", "Lai/grazie/utils/attributes/Attributes$Value;", "updated", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/utils/mpp/UUID;Lai/grazie/utils/attributes/Attributes$Key;Lai/grazie/utils/attributes/Attributes$Value;Lai/grazie/utils/attributes/Attributes$Value;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/utils/mpp/UUID;Lai/grazie/utils/attributes/Attributes$Key;Lai/grazie/utils/attributes/Attributes$Value;Lai/grazie/utils/attributes/Attributes$Value;)V", "getId", "()Lai/grazie/utils/mpp/UUID;", "getKey", "()Lai/grazie/utils/attributes/Attributes$Key;", "getOld", "()Lai/grazie/utils/attributes/Attributes$Value;", "getUpdated", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$user_strg_model", "$serializer", "Companion", "user-strg-model"})
/*    */ public final class Updated extends UserAttributeEvent {
/*    */   @NotNull
/* 22 */   public static final Companion Companion = new Companion(null); @NotNull private final UUID id; @NotNull private final Attributes.Key key; static { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = Attributes.Key.Companion.serializer(); arrayOfKSerializer[2] = Attributes.Value.Companion.serializer(); arrayOfKSerializer[3] = Attributes.Value.Companion.serializer(); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @NotNull private final Attributes.Value old; @NotNull private final Attributes.Value updated; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/user/storage/events/UserAttributeEvent.Updated.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/user/storage/events/UserAttributeEvent$Updated;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "user-strg-model"}) public static final class $serializer implements GeneratedSerializer<Updated> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])UserAttributeEvent.Updated.$childSerializers, arrayOfKSerializer2 = new KSerializer[4]; arrayOfKSerializer2[0] = (KSerializer)UUID.Serializer.INSTANCE; arrayOfKSerializer2[1] = arrayOfKSerializer1[1]; arrayOfKSerializer2[2] = arrayOfKSerializer1[2]; arrayOfKSerializer2[3] = arrayOfKSerializer1[3]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public UserAttributeEvent.Updated deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; UUID uUID = null; Attributes.Key key = null; Attributes.Value value1 = null, value2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])UserAttributeEvent.Updated.$childSerializers; if (compositeDecoder.decodeSequentially()) { uUID = (UUID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)UUID.Serializer.INSTANCE, uUID); i |= 0x1; key = (Attributes.Key)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], key); i |= 0x2; value1 = (Attributes.Value)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], value1); i |= 0x4; value2 = (Attributes.Value)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], value2); i |= 0x8; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: uUID = (UUID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)UUID.Serializer.INSTANCE, uUID); i |= 0x1; continue;case 1: key = (Attributes.Key)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], key); i |= 0x2; continue;case 2: value1 = (Attributes.Value)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], value1); i |= 0x4; continue;case 3: value2 = (Attributes.Value)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], value2); i |= 0x8; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new UserAttributeEvent.Updated(i, uUID, key, value1, value2, null); } public void serialize(@NotNull Encoder encoder, @NotNull UserAttributeEvent.Updated value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); UserAttributeEvent.Updated.write$Self$user_strg_model(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.user.storage.events.UserAttributeEvent.Updated", INSTANCE, 4); pluginGeneratedSerialDescriptor.addElement("id", false); pluginGeneratedSerialDescriptor.addElement("key", false); pluginGeneratedSerialDescriptor.addElement("old", false); pluginGeneratedSerialDescriptor.addElement("updated", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/user/storage/events/UserAttributeEvent$Updated$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/user/storage/events/UserAttributeEvent$Updated;", "user-strg-model"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<UserAttributeEvent.Updated> serializer() { return (KSerializer<UserAttributeEvent.Updated>)UserAttributeEvent.Updated.$serializer.INSTANCE; } }
/*    */   @NotNull
/* 24 */   public UUID getId() { return this.id; } @NotNull
/* 25 */   public Attributes.Key getKey() { return this.key; } @NotNull
/* 26 */   public final Attributes.Value getOld() { return this.old; } @NotNull
/* 27 */   public final Attributes.Value getUpdated() { return this.updated; } public Updated(@NotNull UUID id, @NotNull Attributes.Key key, @NotNull Attributes.Value old, @NotNull Attributes.Value updated) {
/* 28 */     super(null);
/*    */     this.id = id;
/*    */     this.key = key;
/*    */     this.old = old;
/*    */     this.updated = updated;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final UUID component1() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Attributes.Key component2() {
/*    */     return this.key;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Attributes.Value component3() {
/*    */     return this.old;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Attributes.Value component4() {
/*    */     return this.updated;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Updated copy(@NotNull UUID id, @NotNull Attributes.Key key, @NotNull Attributes.Value old, @NotNull Attributes.Value updated) {
/*    */     Intrinsics.checkNotNullParameter(id, "id");
/*    */     Intrinsics.checkNotNullParameter(key, "key");
/*    */     Intrinsics.checkNotNullParameter(old, "old");
/*    */     Intrinsics.checkNotNullParameter(updated, "updated");
/*    */     return new Updated(id, key, old, updated);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Updated(id=" + this.id + ", key=" + this.key + ", old=" + this.old + ", updated=" + this.updated + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.id.hashCode();
/*    */     result = result * 31 + this.key.hashCode();
/*    */     result = result * 31 + this.old.hashCode();
/*    */     return result * 31 + this.updated.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Updated))
/*    */       return false; 
/*    */     Updated updated = (Updated)other;
/*    */     return !Intrinsics.areEqual(this.id, updated.id) ? false : (!Intrinsics.areEqual(this.key, updated.key) ? false : (!Intrinsics.areEqual(this.old, updated.old) ? false : (!!Intrinsics.areEqual(this.updated, updated.updated))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\user-strg-model-jvm-0.4.32.jar!\ai\grazi\\user\storage\events\UserAttributeEvent$Updated.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */