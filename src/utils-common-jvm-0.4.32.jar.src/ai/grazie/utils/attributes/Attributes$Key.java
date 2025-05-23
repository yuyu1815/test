/*     */ package ai.grazie.utils.attributes;
/*     */ 
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.LazyKt;
/*     */ import kotlin.LazyThreadSafetyMode;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KClass;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SealedClassSerializer;
/*     */ import kotlinx.serialization.SerialName;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.Transient;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
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
/*     */ @Serializable
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\005\n\002\020\013\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\000 \0312\0020\001:\007\027\030\031\032\033\034\035B\031\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005¢\006\002\020\006B\007\b\004¢\006\002\020\007J\017\020\f\032\004\030\0010\003H\026¢\006\002\020\rJ\b\020\016\032\0020\017H\026J!\020\020\032\0020\0212\006\020\022\032\0020\0002\006\020\023\032\0020\0242\006\020\025\032\0020\026HÇ\001R\022\020\b\032\0020\tX¦\004¢\006\006\032\004\b\n\020\013\001\006\036\037 !\"#¨\006$"}, d2 = {"Lai/grazie/utils/attributes/Attributes$Key;", "", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "fqdn", "", "getFqdn", "()Ljava/lang/String;", "lengthLimit", "()Ljava/lang/Integer;", "requiresLimit", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Bool", "Bytes", "Companion", "Double", "Json", "Long", "Text", "Lai/grazie/utils/attributes/Attributes$Key$Bool;", "Lai/grazie/utils/attributes/Attributes$Key$Bytes;", "Lai/grazie/utils/attributes/Attributes$Key$Double;", "Lai/grazie/utils/attributes/Attributes$Key$Json;", "Lai/grazie/utils/attributes/Attributes$Key$Long;", "Lai/grazie/utils/attributes/Attributes$Key$Text;", "utils-common"})
/*     */ public abstract class Key
/*     */ {
/*     */   private Key() {}
/*     */   
/*     */   @Nullable
/*     */   public Integer lengthLimit() {
/*  57 */     return null;
/*  58 */   } public boolean requiresLimit() { return false; } @SerialName("bool") @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\005HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\n\020\013¨\006\036"}, d2 = {"Lai/grazie/utils/attributes/Attributes$Key$Bool;", "Lai/grazie/utils/attributes/Attributes$Key;", "seen1", "", "fqdn", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getFqdn", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$utils_common", "$serializer", "Companion", "utils-common"}) public static final class Bool extends Key { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String fqdn; public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Bool)) return false;  Bool bool = (Bool)other; return !!Intrinsics.areEqual(this.fqdn, bool.fqdn); } public int hashCode() { return this.fqdn.hashCode(); } @NotNull public String toString() { return "Bool(fqdn=" + this.fqdn + ")"; } @NotNull public final Bool copy(@NotNull String fqdn) { Intrinsics.checkNotNullParameter(fqdn, "fqdn"); return new Bool(fqdn); }
/*     */     @NotNull public final String component1() { return this.fqdn; }
/*  60 */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/utils/attributes/Attributes.Key.Bool.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/utils/attributes/Attributes$Key$Bool;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"}) public static final class $serializer implements GeneratedSerializer<Bool> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public Attributes.Key.Bool deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new Attributes.Key.Bool(i, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull Attributes.Key.Bool value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Attributes.Key.Bool.write$Self$utils_common(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("bool", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("fqdn", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/utils/attributes/Attributes$Key$Bool$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/attributes/Attributes$Key$Bool;", "utils-common"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<Attributes.Key.Bool> serializer() { return (KSerializer<Attributes.Key.Bool>)Attributes.Key.Bool.$serializer.INSTANCE; } }
/*     */     @NotNull
/*  62 */     public String getFqdn() { return this.fqdn; } public Bool(@NotNull String fqdn) { super(null); this.fqdn = fqdn; } } @SerialName("int") @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\005HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\n\020\013¨\006\036"}, d2 = {"Lai/grazie/utils/attributes/Attributes$Key$Long;", "Lai/grazie/utils/attributes/Attributes$Key;", "seen1", "", "fqdn", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getFqdn", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$utils_common", "$serializer", "Companion", "utils-common"}) public static final class Long extends Key { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String fqdn; public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Long)) return false;  Long long_ = (Long)other; return !!Intrinsics.areEqual(this.fqdn, long_.fqdn); } public int hashCode() { return this.fqdn.hashCode(); } @NotNull public String toString() { return "Long(fqdn=" + this.fqdn + ")"; } @NotNull public final Long copy(@NotNull String fqdn) { Intrinsics.checkNotNullParameter(fqdn, "fqdn"); return new Long(fqdn); }
/*     */     @NotNull public final String component1() { return this.fqdn; }
/*  64 */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/utils/attributes/Attributes.Key.Long.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/utils/attributes/Attributes$Key$Long;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"}) public static final class $serializer implements GeneratedSerializer<Long> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public Attributes.Key.Long deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new Attributes.Key.Long(i, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull Attributes.Key.Long value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Attributes.Key.Long.write$Self$utils_common(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("int", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("fqdn", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/utils/attributes/Attributes$Key$Long$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/attributes/Attributes$Key$Long;", "utils-common"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<Attributes.Key.Long> serializer() { return (KSerializer<Attributes.Key.Long>)Attributes.Key.Long.$serializer.INSTANCE; } }
/*     */     @NotNull
/*  66 */     public String getFqdn() { return this.fqdn; } public Long(@NotNull String fqdn) { super(null); this.fqdn = fqdn; } } @SerialName("double") @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\005HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\n\020\013¨\006\036"}, d2 = {"Lai/grazie/utils/attributes/Attributes$Key$Double;", "Lai/grazie/utils/attributes/Attributes$Key;", "seen1", "", "fqdn", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getFqdn", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$utils_common", "$serializer", "Companion", "utils-common"}) public static final class Double extends Key { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String fqdn; public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Double)) return false;  Double double_ = (Double)other; return !!Intrinsics.areEqual(this.fqdn, double_.fqdn); } public int hashCode() { return this.fqdn.hashCode(); } @NotNull public String toString() { return "Double(fqdn=" + this.fqdn + ")"; } @NotNull public final Double copy(@NotNull String fqdn) { Intrinsics.checkNotNullParameter(fqdn, "fqdn"); return new Double(fqdn); }
/*     */     @NotNull public final String component1() { return this.fqdn; }
/*  68 */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/utils/attributes/Attributes.Key.Double.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/utils/attributes/Attributes$Key$Double;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"}) public static final class $serializer implements GeneratedSerializer<Double> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public Attributes.Key.Double deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new Attributes.Key.Double(i, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull Attributes.Key.Double value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Attributes.Key.Double.write$Self$utils_common(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("double", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("fqdn", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/utils/attributes/Attributes$Key$Double$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/attributes/Attributes$Key$Double;", "utils-common"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<Attributes.Key.Double> serializer() { return (KSerializer<Attributes.Key.Double>)Attributes.Key.Double.$serializer.INSTANCE; } }
/*     */     @NotNull
/*  70 */     public String getFqdn() { return this.fqdn; } public Double(@NotNull String fqdn) { super(null); this.fqdn = fqdn; } } @SerialName("text") @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\017\n\002\020\013\n\000\n\002\020\000\n\002\b\005\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 '2\0020\001:\002&'B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\031\022\006\020\004\032\0020\005\022\n\b\002\020\t\032\004\030\0010\003¢\006\002\020\nJ\t\020\022\032\0020\005HÆ\003J\020\020\023\032\004\030\0010\003HÆ\003¢\006\002\020\020J$\020\024\032\0020\0002\b\b\002\020\004\032\0020\0052\n\b\002\020\t\032\004\030\0010\003HÆ\001¢\006\002\020\025J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\031H\002J\b\020\032\032\0020\003H\026J\017\020\033\032\004\030\0010\003H\026¢\006\002\020\020J\b\020\034\032\0020\027H\026J\b\020\035\032\0020\005H\026J&\020\036\032\0020\0372\006\020 \032\0020\0002\006\020!\032\0020\"2\006\020#\032\0020$HÁ\001¢\006\002\b%R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\013\020\fR \020\t\032\004\030\0010\0038\006X\004¢\006\020\n\002\020\021\022\004\b\r\020\016\032\004\b\017\020\020¨\006("}, d2 = {"Lai/grazie/utils/attributes/Attributes$Key$Text;", "Lai/grazie/utils/attributes/Attributes$Key;", "seen1", "", "fqdn", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "maxLength", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getFqdn", "()Ljava/lang/String;", "getMaxLength$annotations", "()V", "getMaxLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lai/grazie/utils/attributes/Attributes$Key$Text;", "equals", "", "other", "", "hashCode", "lengthLimit", "requiresLimit", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$utils_common", "$serializer", "Companion", "utils-common"}) @SourceDebugExtension({"SMAP\nAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Attributes.kt\nai/grazie/utils/attributes/Attributes$Key$Text\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,289:1\n1#2:290\n*E\n"}) public static final class Text extends Key { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String fqdn; @Nullable private final Integer maxLength; @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/utils/attributes/Attributes.Key.Text.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/utils/attributes/Attributes$Key$Text;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"})
/*     */     public static final class $serializer implements GeneratedSerializer<Text> { @NotNull
/*  72 */       public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public Attributes.Key.Text deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new Attributes.Key.Text(i, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull Attributes.Key.Text value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Attributes.Key.Text.write$Self$utils_common(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("text", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("fqdn", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/utils/attributes/Attributes$Key$Text$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/attributes/Attributes$Key$Text;", "utils-common"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<Attributes.Key.Text> serializer() { return (KSerializer<Attributes.Key.Text>)Attributes.Key.Text.$serializer.INSTANCE; }
/*     */        }
/*     */     @NotNull
/*  75 */     public String getFqdn() { return this.fqdn; } @Nullable
/*  76 */     public final Integer getMaxLength() { return this.maxLength; }
/*  77 */     public Text(@NotNull String fqdn, @Nullable Integer maxLength) { super(null); this.fqdn = fqdn;
/*  78 */       this.maxLength = maxLength; } public boolean requiresLimit() { return true; } @Nullable
/*  79 */     public Integer lengthLimit() { return this.maxLength; }
/*     */     public boolean equals(@Nullable Object other) { if (this == other) return true;  if (other == null || getClass() != other.getClass()) return false;  return Intrinsics.areEqual(getFqdn(), ((Text)other).getFqdn()); }
/*     */     public int hashCode() { return getFqdn().hashCode(); }
/*  82 */     @NotNull public final String component1() { return this.fqdn; } @Nullable public final Integer component2() { return this.maxLength; } @NotNull public String toString() { if (this.maxLength != null) { int i = this.maxLength.intValue();
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
/* 290 */         String str = getFqdn(); int $i$a$-let-Attributes$Key$Text$toString$1 = 0; return (", maxLength=" + i == null) ? ("Text(fqdn=" + ", maxLength=" + i + "" + ")") : ("Text(fqdn=" + ", maxLength=" + i + ", maxLength=" + i + ")"); }  return "Text(fqdn=" + getFqdn() + "" + ")"; } @NotNull public final Text copy(@NotNull String fqdn, @Nullable Integer maxLength) { Intrinsics.checkNotNullParameter(fqdn, "fqdn"); return new Text(fqdn, maxLength); } } @SerialName("json") @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\017\n\002\020\013\n\000\n\002\020\000\n\002\b\005\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 '2\0020\001:\002&'B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\031\022\006\020\004\032\0020\005\022\n\b\002\020\t\032\004\030\0010\003¢\006\002\020\nJ\t\020\022\032\0020\005HÆ\003J\020\020\023\032\004\030\0010\003HÆ\003¢\006\002\020\020J$\020\024\032\0020\0002\b\b\002\020\004\032\0020\0052\n\b\002\020\t\032\004\030\0010\003HÆ\001¢\006\002\020\025J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\031H\002J\b\020\032\032\0020\003H\026J\017\020\033\032\004\030\0010\003H\026¢\006\002\020\020J\b\020\034\032\0020\027H\026J\b\020\035\032\0020\005H\026J&\020\036\032\0020\0372\006\020 \032\0020\0002\006\020!\032\0020\"2\006\020#\032\0020$HÁ\001¢\006\002\b%R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\013\020\fR \020\t\032\004\030\0010\0038\006X\004¢\006\020\n\002\020\021\022\004\b\r\020\016\032\004\b\017\020\020¨\006("}, d2 = {"Lai/grazie/utils/attributes/Attributes$Key$Json;", "Lai/grazie/utils/attributes/Attributes$Key;", "seen1", "", "fqdn", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "maxLength", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getFqdn", "()Ljava/lang/String;", "getMaxLength$annotations", "()V", "getMaxLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lai/grazie/utils/attributes/Attributes$Key$Json;", "equals", "", "other", "", "hashCode", "lengthLimit", "requiresLimit", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$utils_common", "$serializer", "Companion", "utils-common"}) @SourceDebugExtension({"SMAP\nAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Attributes.kt\nai/grazie/utils/attributes/Attributes$Key$Json\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,289:1\n1#2:290\n*E\n"}) public static final class Json extends Key { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String fqdn; @Nullable private final Integer maxLength; @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/utils/attributes/Attributes.Key.Json.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/utils/attributes/Attributes$Key$Json;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"}) public static final class $serializer implements GeneratedSerializer<Json> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public Attributes.Key.Json deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new Attributes.Key.Json(i, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull Attributes.Key.Json value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Attributes.Key.Json.write$Self$utils_common(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("json", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("fqdn", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/utils/attributes/Attributes$Key$Json$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/attributes/Attributes$Key$Json;", "utils-common"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<Attributes.Key.Json> serializer() { return (KSerializer<Attributes.Key.Json>)Attributes.Key.Json.$serializer.INSTANCE; } } @NotNull public String getFqdn() { return this.fqdn; } @Nullable public final Integer getMaxLength() { return this.maxLength; } public Json(@NotNull String fqdn, @Nullable Integer maxLength) { super(null); this.fqdn = fqdn; this.maxLength = maxLength; } public boolean requiresLimit() { return true; } @Nullable public Integer lengthLimit() { return this.maxLength; } @NotNull public String toString() { if (this.maxLength != null) { int i = this.maxLength.intValue(); String str = getFqdn(); int $i$a$-let-Attributes$Key$Json$toString$1 = 0; return (", maxLength=" + i == null) ? ("Json(fqdn=" + ", maxLength=" + i + "" + ")") : ("Json(fqdn=" + ", maxLength=" + i + ", maxLength=" + i + ")"); }  return "Json(fqdn=" + getFqdn() + "" + ")"; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (other == null || getClass() != other.getClass()) return false;  return Intrinsics.areEqual(getFqdn(), ((Json)other).getFqdn()); } public int hashCode() { return getFqdn().hashCode(); } @NotNull public final String component1() { return this.fqdn; } @Nullable public final Integer component2() { return this.maxLength; } @NotNull public final Json copy(@NotNull String fqdn, @Nullable Integer maxLength) { Intrinsics.checkNotNullParameter(fqdn, "fqdn"); return new Json(fqdn, maxLength); } } @SerialName("bytes") @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\017\n\002\020\013\n\000\n\002\020\000\n\002\b\005\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 '2\0020\001:\002&'B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\031\022\006\020\004\032\0020\005\022\n\b\002\020\t\032\004\030\0010\003¢\006\002\020\nJ\t\020\022\032\0020\005HÆ\003J\020\020\023\032\004\030\0010\003HÆ\003¢\006\002\020\020J$\020\024\032\0020\0002\b\b\002\020\004\032\0020\0052\n\b\002\020\t\032\004\030\0010\003HÆ\001¢\006\002\020\025J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\031H\002J\b\020\032\032\0020\003H\026J\017\020\033\032\004\030\0010\003H\026¢\006\002\020\020J\b\020\034\032\0020\027H\026J\b\020\035\032\0020\005H\026J&\020\036\032\0020\0372\006\020 \032\0020\0002\006\020!\032\0020\"2\006\020#\032\0020$HÁ\001¢\006\002\b%R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\013\020\fR \020\t\032\004\030\0010\0038\006X\004¢\006\020\n\002\020\021\022\004\b\r\020\016\032\004\b\017\020\020¨\006("}, d2 = {"Lai/grazie/utils/attributes/Attributes$Key$Bytes;", "Lai/grazie/utils/attributes/Attributes$Key;", "seen1", "", "fqdn", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "maxLength", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getFqdn", "()Ljava/lang/String;", "getMaxLength$annotations", "()V", "getMaxLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lai/grazie/utils/attributes/Attributes$Key$Bytes;", "equals", "", "other", "", "hashCode", "lengthLimit", "requiresLimit", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$utils_common", "$serializer", "Companion", "utils-common"}) @SourceDebugExtension({"SMAP\nAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Attributes.kt\nai/grazie/utils/attributes/Attributes$Key$Bytes\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,289:1\n1#2:290\n*E\n"}) public static final class Bytes extends Key { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String fqdn; @Nullable private final Integer maxLength; @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/utils/attributes/Attributes.Key.Bytes.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/utils/attributes/Attributes$Key$Bytes;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"}) public static final class $serializer implements GeneratedSerializer<Bytes> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public Attributes.Key.Bytes deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new Attributes.Key.Bytes(i, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull Attributes.Key.Bytes value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Attributes.Key.Bytes.write$Self$utils_common(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("bytes", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("fqdn", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/utils/attributes/Attributes$Key$Bytes$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/attributes/Attributes$Key$Bytes;", "utils-common"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<Attributes.Key.Bytes> serializer() { return (KSerializer<Attributes.Key.Bytes>)Attributes.Key.Bytes.$serializer.INSTANCE; } } @NotNull public String toString() { if (this.maxLength != null) { int i = this.maxLength.intValue(); String str = getFqdn(); int $i$a$-let-Attributes$Key$Bytes$toString$1 = 0;
/*     */         return (", maxLength=" + i == null) ? ("Bytes(fqdn=" + ", maxLength=" + i + "" + ")") : ("Bytes(fqdn=" + ", maxLength=" + i + ", maxLength=" + i + ")"); }
/*     */       
/*     */       return "Bytes(fqdn=" + getFqdn() + "" + ")"; }
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public String getFqdn() {
/*     */       return this.fqdn;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Integer getMaxLength() {
/*     */       return this.maxLength;
/*     */     }
/*     */     
/*     */     public Bytes(@NotNull String fqdn, @Nullable Integer maxLength) {
/*     */       super(null);
/*     */       this.fqdn = fqdn;
/*     */       this.maxLength = maxLength;
/*     */     }
/*     */     
/*     */     public boolean requiresLimit() {
/*     */       return true;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public Integer lengthLimit() {
/*     */       return this.maxLength;
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (other == null || getClass() != other.getClass())
/*     */         return false; 
/*     */       return Intrinsics.areEqual(getFqdn(), ((Bytes)other).getFqdn());
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       return getFqdn().hashCode();
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String component1() {
/*     */       return this.fqdn;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Integer component2() {
/*     */       return this.maxLength;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Bytes copy(@NotNull String fqdn, @Nullable Integer maxLength) {
/*     */       Intrinsics.checkNotNullParameter(fqdn, "fqdn");
/*     */       return new Bytes(fqdn, maxLength);
/*     */     } }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE);
/*     */   
/*     */   @NotNull
/*     */   public abstract String getFqdn();
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class null extends Lambda implements Function0<KSerializer<Object>> {
/*     */     public static final null INSTANCE = (null)new Function0<>();
/*     */     
/*     */     null() {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     public final KSerializer<Object> invoke() {
/*     */       KClass[] arrayOfKClass = new KClass[6];
/*     */       arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(Attributes.Key.Bool.class);
/*     */       arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(Attributes.Key.Bytes.class);
/*     */       arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(Attributes.Key.Double.class);
/*     */       arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(Attributes.Key.Json.class);
/*     */       arrayOfKClass[4] = Reflection.getOrCreateKotlinClass(Attributes.Key.Long.class);
/*     */       arrayOfKClass[5] = Reflection.getOrCreateKotlinClass(Attributes.Key.Text.class);
/*     */       KSerializer[] arrayOfKSerializer = new KSerializer[6];
/*     */       arrayOfKSerializer[0] = (KSerializer)Attributes.Key.Bool.$serializer.INSTANCE;
/*     */       arrayOfKSerializer[1] = (KSerializer)Attributes.Key.Bytes.$serializer.INSTANCE;
/*     */       arrayOfKSerializer[2] = (KSerializer)Attributes.Key.Double.$serializer.INSTANCE;
/*     */       arrayOfKSerializer[3] = (KSerializer)Attributes.Key.Json.$serializer.INSTANCE;
/*     */       arrayOfKSerializer[4] = (KSerializer)Attributes.Key.Long.$serializer.INSTANCE;
/*     */       arrayOfKSerializer[5] = (KSerializer)Attributes.Key.Text.$serializer.INSTANCE;
/*     */       return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.utils.attributes.Attributes.Key", Reflection.getOrCreateKotlinClass(Attributes.Key.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/utils/attributes/Attributes$Key$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/attributes/Attributes$Key;", "utils-common"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<Attributes.Key> serializer() {
/*     */       return get$cachedSerializer();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\attributes\Attributes$Key.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */