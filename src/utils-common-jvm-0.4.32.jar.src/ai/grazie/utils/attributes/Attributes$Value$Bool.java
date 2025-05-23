/*     */ package ai.grazie.utils.attributes;
/*     */ 
/*     */ import ai.grazie.utils.mpp.time.Timestamp;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SerialName;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.BooleanSerializer;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import kotlinx.serialization.internal.StringSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @SerialName("bool")
/*     */ @Serializable
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\r\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 %2\0020\001:\002$%B5\b\021\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB\027\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\002\020\rJ\t\020\024\032\0020\005HÆ\003J\t\020\025\032\0020\007HÆ\003J\035\020\026\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\027\032\0020\0052\b\020\030\032\004\030\0010\031HÖ\003J\t\020\032\032\0020\003HÖ\001J\t\020\033\032\0020\tHÖ\001J&\020\034\032\0020\0352\006\020\036\032\0020\0002\006\020\037\032\0020 2\006\020!\032\0020\"HÁ\001¢\006\002\b#R\024\020\b\032\0020\tX\004¢\006\b\n\000\032\004\b\016\020\017R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\020\020\021R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\022\020\023¨\006&"}, d2 = {"Lai/grazie/utils/attributes/Attributes$Value$Bool;", "Lai/grazie/utils/attributes/Attributes$Value;", "seen1", "", "value", "", "modified", "Lai/grazie/utils/mpp/time/Timestamp;", "display", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLai/grazie/utils/mpp/time/Timestamp;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZLai/grazie/utils/mpp/time/Timestamp;)V", "getDisplay", "()Ljava/lang/String;", "getModified", "()Lai/grazie/utils/mpp/time/Timestamp;", "getValue", "()Ljava/lang/Boolean;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$utils_common", "$serializer", "Companion", "utils-common"})
/*     */ public final class Bool
/*     */   extends Attributes.Value
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final boolean value;
/*     */   @NotNull
/*     */   private final Timestamp modified;
/*     */   @NotNull
/*     */   private final String display;
/*     */   
/*     */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/utils/attributes/Attributes.Value.Bool.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/utils/attributes/Attributes$Value$Bool;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"})
/*     */   public static final class $serializer
/*     */     implements GeneratedSerializer<Bool>
/*     */   {
/*     */     @NotNull
/* 159 */     public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = (KSerializer)BooleanSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)Timestamp.Serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public Attributes.Value.Bool deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; boolean bool1 = false; Timestamp timestamp = null; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 0); i |= 0x1; timestamp = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp); i |= 0x2; str = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 0); i |= 0x1; continue;case 1: timestamp = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp); i |= 0x2; continue;case 2: str = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new Attributes.Value.Bool(i, bool1, timestamp, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull Attributes.Value.Bool value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Attributes.Value.Bool.write$Self$utils_common(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("bool", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("value", false); pluginGeneratedSerialDescriptor.addElement("modified", true); pluginGeneratedSerialDescriptor.addElement("display", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/utils/attributes/Attributes$Value$Bool$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/attributes/Attributes$Value$Bool;", "utils-common"}) public static final class Companion { @NotNull public final KSerializer<Attributes.Value.Bool> serializer() { return (KSerializer<Attributes.Value.Bool>)Attributes.Value.Bool.$serializer.INSTANCE; }
/*     */      private Companion() {} } public Bool(boolean value, @NotNull Timestamp modified) {
/* 161 */     super(null); this.value = value; this.modified = modified;
/* 162 */     this.display = String.valueOf(getValue().booleanValue()); } @NotNull public Boolean getValue() { return Boolean.valueOf(this.value); } @NotNull public String getDisplay() { return this.display; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public Timestamp getModified() {
/*     */     return this.modified;
/*     */   }
/*     */   
/*     */   public final boolean component1() {
/*     */     return this.value;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Timestamp component2() {
/*     */     return this.modified;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Bool copy(boolean value, @NotNull Timestamp modified) {
/*     */     Intrinsics.checkNotNullParameter(modified, "modified");
/*     */     return new Bool(value, modified);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "Bool(value=" + this.value + ", modified=" + this.modified + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = Boolean.hashCode(this.value);
/*     */     return result * 31 + this.modified.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof Bool))
/*     */       return false; 
/*     */     Bool bool = (Bool)other;
/*     */     return (this.value != bool.value) ? false : (!!Intrinsics.areEqual(this.modified, bool.modified));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\attributes\Attributes$Value$Bool.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */