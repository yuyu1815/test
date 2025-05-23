/*     */ package ai.grazie.gec.model.settings;
/*     */ 
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Serializable
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\024\n\002\020$\n\002\030\002\n\000\n\002\020\013\n\002\b\005\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\013\b\b\030\000 82\0020\001:\003789BS\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007\022\016\020\t\032\n\022\004\022\0020\005\030\0010\007\022\016\020\n\032\n\022\004\022\0020\005\030\0010\007\022\b\020\013\032\004\030\0010\f¢\006\002\020\rB7\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007\022\f\020\t\032\b\022\004\022\0020\0050\007\022\f\020\n\032\b\022\004\022\0020\0050\007¢\006\002\020\016J\t\020\030\032\0020\005HÆ\003J\024\020\031\032\b\022\004\022\0020\b0\007HÆ\003¢\006\002\020\026J\024\020\032\032\b\022\004\022\0020\0050\007HÆ\003¢\006\002\020\020J\024\020\033\032\b\022\004\022\0020\0050\007HÆ\003¢\006\002\020\020JH\020\034\032\0020\0002\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\0072\016\b\002\020\t\032\b\022\004\022\0020\0050\0072\016\b\002\020\n\032\b\022\004\022\0020\0050\007HÆ\001¢\006\002\020\035J$\020\036\032\0020\0002\b\020\037\032\004\030\0010\0002\022\020 \032\016\022\004\022\0020\005\022\004\022\0020\"0!J\023\020#\032\0020$2\b\020%\032\004\030\0010\001H\002J\b\020&\032\0020\003H\026J\006\020'\032\0020$J\t\020(\032\0020\005HÖ\001J&\020)\032\0020*2\006\020+\032\0020\0002\006\020,\032\0020-2\006\020.\032\0020/HÁ\001¢\006\002\b0J(\0201\032\0020$*\016\022\004\022\0020\005\022\004\022\0020\"0!2\006\0202\032\0020\0052\006\0203\032\0020\005H\002J \0204\032\0020$*\016\022\004\022\0020\005\022\004\022\0020\"0!2\006\0205\032\0020\bH\002J \0206\032\0020$*\016\022\004\022\0020\005\022\004\022\0020\"0!2\006\0205\032\0020\bH\002R\031\020\n\032\b\022\004\022\0020\0050\007¢\006\n\n\002\020\021\032\004\b\017\020\020R\031\020\t\032\b\022\004\022\0020\0050\007¢\006\n\n\002\020\021\032\004\b\022\020\020R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\023\020\024R\031\020\006\032\b\022\004\022\0020\b0\007¢\006\n\n\002\020\027\032\004\b\025\020\026¨\006:"}, d2 = {"Lai/grazie/gec/model/settings/StyleProfile;", "", "seen1", "", "id", "", "paramValues", "", "Lai/grazie/gec/model/settings/StyleProfile$ParamValue;", "enabledRules", "disabledRules", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;[Lai/grazie/gec/model/settings/StyleProfile$ParamValue;[Ljava/lang/String;[Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;[Lai/grazie/gec/model/settings/StyleProfile$ParamValue;[Ljava/lang/String;[Ljava/lang/String;)V", "getDisabledRules", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getEnabledRules", "getId", "()Ljava/lang/String;", "getParamValues", "()[Lai/grazie/gec/model/settings/StyleProfile$ParamValue;", "[Lai/grazie/gec/model/settings/StyleProfile$ParamValue;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;[Lai/grazie/gec/model/settings/StyleProfile$ParamValue;[Ljava/lang/String;[Ljava/lang/String;)Lai/grazie/gec/model/settings/StyleProfile;", "dropDefaults", "predefinedProfile", "languageSettings", "", "Lai/grazie/gec/model/settings/Setting;", "equals", "", "other", "hashCode", "isEmpty", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_gec", "isDefaultOrUnknownRule", "ruleId", "customValueId", "isDefaultParam", "value", "isValidParam", "$serializer", "Companion", "ParamValue", "model-gec"})
/*     */ @SourceDebugExtension({"SMAP\nStyleProfile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StyleProfile.kt\nai/grazie/gec/model/settings/StyleProfile\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,107:1\n8634#2,2:108\n8894#2,4:110\n4154#2:114\n4254#2,2:115\n11158#2:129\n11493#2,3:130\n37#3:117\n36#3,3:118\n37#3:121\n36#3,3:122\n37#3:125\n36#3,3:126\n*S KotlinDebug\n*F\n+ 1 StyleProfile.kt\nai/grazie/gec/model/settings/StyleProfile\n*L\n59#1:108,2\n59#1:110,4\n60#1:114\n60#1:115,2\n90#1:129\n90#1:130,3\n69#1:117\n69#1:118,3\n70#1:121\n70#1:122,3\n71#1:125\n71#1:126,3\n*E\n"})
/*     */ public final class StyleProfile {
/*  12 */   public StyleProfile(@NotNull String id, @NotNull ParamValue[] paramValues, @NotNull String[] enabledRules, @NotNull String[] disabledRules) { this.id = id;
/*  13 */     this.paramValues = paramValues;
/*  14 */     this.enabledRules = enabledRules;
/*  15 */     this.disabledRules = disabledRules; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/settings/StyleProfile.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/settings/StyleProfile;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"}) public static final class $serializer implements GeneratedSerializer<StyleProfile> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])StyleProfile.$childSerializers, arrayOfKSerializer2 = new KSerializer[4]; arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[1] = arrayOfKSerializer1[1]; arrayOfKSerializer2[2] = arrayOfKSerializer1[2]; arrayOfKSerializer2[3] = arrayOfKSerializer1[3]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public StyleProfile deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str = null; StyleProfile.ParamValue[] arrayOfParamValue = null; String[] arrayOfString1 = null, arrayOfString2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])StyleProfile.$childSerializers; if (compositeDecoder.decodeSequentially()) { str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; arrayOfParamValue = (StyleProfile.ParamValue[])compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], arrayOfParamValue); i |= 0x2; arrayOfString1 = (String[])compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], arrayOfString1); i |= 0x4; arrayOfString2 = (String[])compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], arrayOfString2); i |= 0x8; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: arrayOfParamValue = (StyleProfile.ParamValue[])compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], arrayOfParamValue); i |= 0x2; continue;case 2: arrayOfString1 = (String[])compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], arrayOfString1); i |= 0x4; continue;case 3: arrayOfString2 = (String[])compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], arrayOfString2); i |= 0x8; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new StyleProfile(i, str, arrayOfParamValue, arrayOfString1, arrayOfString2, null); } public void serialize(@NotNull Encoder encoder, @NotNull StyleProfile value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); StyleProfile.write$Self$model_gec(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gec.model.settings.StyleProfile", INSTANCE, 4); pluginGeneratedSerialDescriptor.addElement("id", false); pluginGeneratedSerialDescriptor.addElement("paramValues", false); pluginGeneratedSerialDescriptor.addElement("enabledRules", false); pluginGeneratedSerialDescriptor.addElement("disabledRules", false); descriptor = pluginGeneratedSerialDescriptor; } } @NotNull public final String getId() { return this.id; } @NotNull public final String[] getDisabledRules() { return this.disabledRules; } @NotNull public final ParamValue[] getParamValues() { return this.paramValues; } @NotNull public final String[] getEnabledRules() { return this.enabledRules; } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\t\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0372\0020\001:\002\036\037B-\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\002\020\nJ\t\020\016\032\0020\005HÆ\003J\t\020\017\032\0020\005HÆ\003J\035\020\020\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\005HÆ\001J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\001HÖ\003J\t\020\024\032\0020\003HÖ\001J\t\020\025\032\0020\005HÖ\001J&\020\026\032\0020\0272\006\020\030\032\0020\0002\006\020\031\032\0020\0322\006\020\033\032\0020\034HÁ\001¢\006\002\b\035R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\013\020\fR\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\r\020\f¨\006 "}, d2 = {"Lai/grazie/gec/model/settings/StyleProfile$ParamValue;", "", "seen1", "", "parameterId", "", "valueId", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getParameterId", "()Ljava/lang/String;", "getValueId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_gec", "$serializer", "Companion", "model-gec"}) public static final class ParamValue
/*     */   {
/*     */     @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String parameterId; @NotNull
/*  18 */     private final String valueId; public ParamValue(@NotNull String parameterId, @NotNull String valueId) { this.parameterId = parameterId; this.valueId = valueId; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/settings/StyleProfile.ParamValue.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/settings/StyleProfile$ParamValue;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"}) public static final class $serializer implements GeneratedSerializer<ParamValue> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public StyleProfile.ParamValue deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str1 = null, str2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new StyleProfile.ParamValue(i, str1, str2, null); } public void serialize(@NotNull Encoder encoder, @NotNull StyleProfile.ParamValue value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); StyleProfile.ParamValue.write$Self$model_gec(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gec.model.settings.StyleProfile.ParamValue", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("parameterId", false); pluginGeneratedSerialDescriptor.addElement("valueId", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/settings/StyleProfile$ParamValue$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/settings/StyleProfile$ParamValue;", "model-gec"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<StyleProfile.ParamValue> serializer() { return (KSerializer<StyleProfile.ParamValue>)StyleProfile.ParamValue.$serializer.INSTANCE; } } @NotNull public final String getParameterId() { return this.parameterId; } @NotNull public final String getValueId() { return this.valueId; } @NotNull public final String component1() { return this.parameterId; } @NotNull public final String component2() { return this.valueId; } @NotNull public final ParamValue copy(@NotNull String parameterId, @NotNull String valueId) { Intrinsics.checkNotNullParameter(parameterId, "parameterId"); Intrinsics.checkNotNullParameter(valueId, "valueId"); return new ParamValue(parameterId, valueId); } @NotNull public String toString() { return "ParamValue(parameterId=" + this.parameterId + ", valueId=" + this.valueId + ")"; } public int hashCode() { result = this.parameterId.hashCode(); return result * 31 + this.valueId.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof ParamValue)) return false;  ParamValue paramValue = (ParamValue)other; return !Intrinsics.areEqual(this.parameterId, paramValue.parameterId) ? false : (!!Intrinsics.areEqual(this.valueId, paramValue.valueId)); }
/*     */   } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/settings/StyleProfile.ParamValue.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/settings/StyleProfile$ParamValue;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"}) public static final class $serializer implements GeneratedSerializer<ParamValue> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public StyleProfile.ParamValue deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str1 = null, str2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new StyleProfile.ParamValue(i, str1, str2, null); } public void serialize(@NotNull Encoder encoder, @NotNull StyleProfile.ParamValue value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); StyleProfile.ParamValue.write$Self$model_gec(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); }
/*     */     static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gec.model.settings.StyleProfile.ParamValue", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("parameterId", false); pluginGeneratedSerialDescriptor.addElement("valueId", false); descriptor = pluginGeneratedSerialDescriptor; } }
/*  21 */   public boolean equals(@Nullable Object other) { if (this == other) return true; 
/*  22 */     if (!(other instanceof StyleProfile)) return false;
/*     */     
/*  24 */     if (!Intrinsics.areEqual(this.id, ((StyleProfile)other).id)) return false; 
/*  25 */     if (!Arrays.equals((Object[])this.paramValues, (Object[])((StyleProfile)other).paramValues)) return false; 
/*  26 */     if (!Arrays.equals((Object[])this.enabledRules, (Object[])((StyleProfile)other).enabledRules)) return false; 
/*  27 */     return Arrays.equals((Object[])this.disabledRules, (Object[])((StyleProfile)other).disabledRules); }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  31 */     int result = this.id.hashCode();
/*  32 */     result = 31 * result + Arrays.hashCode((Object[])this.paramValues);
/*  33 */     result = 31 * result + Arrays.hashCode((Object[])this.enabledRules);
/*  34 */     result = 31 * result + Arrays.hashCode((Object[])this.disabledRules);
/*  35 */     return result;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final StyleProfile dropDefaults(@Nullable StyleProfile predefinedProfile, @NotNull Map<String, ? extends Setting> languageSettings) {
/*  42 */     Intrinsics.checkNotNullParameter(languageSettings, "languageSettings"); if (predefinedProfile == null || predefinedProfile.enabledRules == null || ArraysKt.toSet((Object[])predefinedProfile.enabledRules) == null) ArraysKt.toSet((Object[])predefinedProfile.enabledRules);  Set<String> predefinedEnabledRules = SetsKt.emptySet();
/*  43 */     if (predefinedProfile == null || predefinedProfile.disabledRules == null || ArraysKt.toSet((Object[])predefinedProfile.disabledRules) == null) ArraysKt.toSet((Object[])predefinedProfile.disabledRules);  Set<String> predefinedDisabledRules = SetsKt.emptySet();
/*     */     
/*  45 */     Set<String> set1 = ArraysKt.toMutableSet((Object[])this.enabledRules), customEnabledRules = set1; int $i$a$-also-StyleProfile$dropDefaults$pureEnabledRules$1 = 0;
/*  46 */     CollectionsKt.removeAll(customEnabledRules, new StyleProfile$dropDefaults$pureEnabledRules$1$1(predefinedDisabledRules, this, languageSettings));
/*     */ 
/*     */     
/*     */     Set<String> pureEnabledRules = set1;
/*     */ 
/*     */     
/*  52 */     Set<String> customDisabledRules = customEnabledRules = ArraysKt.toMutableSet((Object[])this.disabledRules); int $i$a$-also-StyleProfile$dropDefaults$pureDisabledRules$1 = 0;
/*  53 */     CollectionsKt.removeAll(customDisabledRules, new StyleProfile$dropDefaults$pureDisabledRules$1$1(pureEnabledRules, predefinedEnabledRules, this, languageSettings));
/*     */ 
/*     */     
/*     */     Set<String> pureDisabledRules = customEnabledRules;
/*     */ 
/*     */     
/*  59 */     ParamValue[] arrayOfParamValue2 = predefinedProfile.paramValues; int $i$f$associateBy = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 108 */     int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(arrayOfParamValue2.length), 16);
/* 109 */     ParamValue[] arrayOfParamValue4 = arrayOfParamValue2; Map<Object, Object> map = new LinkedHashMap<>(capacity$iv); int $i$f$associateByTo = 0; byte b2; int i;
/* 110 */     for (b2 = 0, i = arrayOfParamValue4.length; b2 < i; ) { Object element$iv$iv = arrayOfParamValue4[b2];
/* 111 */       Object object1 = element$iv$iv; Map<Object, Object> map1 = map; int $i$a$-associateBy-StyleProfile$dropDefaults$predefinedParams$1 = 0; map1.put(object1.getParameterId(), element$iv$iv); }
/*     */     
/* 113 */     Map predefinedParams = (predefinedProfile != null && predefinedProfile.paramValues != null) ? map : MapsKt.emptyMap(); ParamValue[] arrayOfParamValue1 = this.paramValues; int $i$f$filterNot = 0;
/* 114 */     ParamValue[] arrayOfParamValue3 = arrayOfParamValue1; Collection destination$iv$iv = new ArrayList(); int $i$f$filterNotTo = 0;
/* 115 */     for (byte b1 = 0; b1 < $i$f$associateByTo; (ParamValue)predefinedParams.get(object1.getParameterId())) { Object element$iv$iv = arrayOfParamValue3[b1], object1 = element$iv$iv; int $i$a$-filterNot-StyleProfile$dropDefaults$pureParams$1 = 0; }
/* 116 */      List<String> pureParams = (List)destination$iv$iv; boolean modified = (pureEnabledRules.size() != this.enabledRules.length || pureDisabledRules.size() != this.disabledRules.length || pureParams.size() != this.paramValues.length); if (modified)
/*     */     { Collection<String> collection1 = pureParams; int $i$f$toTypedArray = 0;
/* 118 */       Collection<String> collection3 = collection1;
/*     */       
/*     */       collection1 = pureEnabledRules;
/*     */       $i$f$toTypedArray = 0;
/* 122 */       Collection<String> collection2 = collection1;
/*     */       
/*     */       Collection<String> $this$toTypedArray$iv = pureDisabledRules;
/*     */       $i$f$toTypedArray = 0;
/* 126 */       Collection<String> thisCollection$iv = $this$toTypedArray$iv; } else {  }  return this;
/*     */   } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\016\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}) static final class StyleProfile$dropDefaults$pureEnabledRules$1$1 extends Lambda implements Function1<String, Boolean> {
/*     */     public final Boolean invoke(String it) { Intrinsics.checkNotNullParameter(it, "it"); return Boolean.valueOf((this.$predefinedEnabledRules.contains(it) || (!this.$predefinedEnabledRules.contains(it) && !this.$predefinedDisabledRules.contains(it) && StyleProfile.this.isDefaultOrUnknownRule(this.$languageSettings, it, "enabled")))); } StyleProfile$dropDefaults$pureEnabledRules$1$1(Set<String> $predefinedDisabledRules, StyleProfile $receiver, Map<String, Setting> $languageSettings) { super(1); } } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\016\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}) static final class StyleProfile$dropDefaults$pureDisabledRules$1$1 extends Lambda implements Function1<String, Boolean> {
/* 129 */     public final Boolean invoke(String it) { Intrinsics.checkNotNullParameter(it, "it"); return Boolean.valueOf((this.$predefinedDisabledRules.contains(it) || this.$pureEnabledRules.contains(it) || (!this.$predefinedEnabledRules.contains(it) && !this.$predefinedDisabledRules.contains(it) && StyleProfile.this.isDefaultOrUnknownRule(this.$languageSettings, it, "disabled")))); } StyleProfile$dropDefaults$pureDisabledRules$1$1(Set<String> $pureEnabledRules, Set<String> $predefinedEnabledRules, StyleProfile $receiver, Map<String, Setting> $languageSettings) { super(1); } } private final boolean isDefaultOrUnknownRule(Map $this$isDefaultOrUnknownRule, String ruleId, String customValueId) { Object object = $this$isDefaultOrUnknownRule.get(ruleId); Setting.Rule setting = (object instanceof Setting.Rule) ? (Setting.Rule)object : null; if (setting == null) { StyleProfileKt.access$getLogger$p().info(new StyleProfile$isDefaultOrUnknownRule$1(ruleId)); return true; }  return Intrinsics.areEqual(setting.getDefaultValue().getId(), customValueId); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) static final class StyleProfile$isDefaultOrUnknownRule$1 extends Lambda implements Function0<String> { StyleProfile$isDefaultOrUnknownRule$1(String $ruleId) { super(0); } public final String invoke() { return "Ignore unknown language rule " + this.$ruleId; } } private final boolean isValidParam(Map $this$isValidParam, ParamValue value) { Object object = $this$isValidParam.get(value.getParameterId()); Setting.Parameter param = (object instanceof Setting.Parameter) ? (Setting.Parameter)object : null; if (param == null) { StyleProfileKt.access$getLogger$p().info(new StyleProfile$isValidParam$1(value)); return false; }  Setting.Value[] arrayOfValue1 = param.getPossibleValues(); int $i$f$map = 0; Setting.Value[] arrayOfValue2 = arrayOfValue1; Collection<String> destination$iv$iv = new ArrayList(arrayOfValue1.length); int $i$f$mapTo = 0; byte b; int i;
/* 130 */     for (b = 0, i = arrayOfValue2.length; b < i; ) { Object item$iv$iv = arrayOfValue2[b];
/* 131 */       Object object1 = item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-StyleProfile$isValidParam$2 = 0; collection.add(object1.getId()); }
/* 132 */      if (!CollectionsKt.toSet(destination$iv$iv).contains(value.getValueId())) {
/*     */       StyleProfileKt.access$getLogger$p().info(new StyleProfile$isValidParam$3(value, param));
/*     */       return false;
/*     */     } 
/*     */     return true; }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */   static final class StyleProfile$isValidParam$1 extends Lambda implements Function0<String> {
/*     */     StyleProfile$isValidParam$1(StyleProfile.ParamValue $value) {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     public final String invoke() {
/*     */       return "Ignore unknown language parameter '" + this.$value.getParameterId() + "'";
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */   static final class StyleProfile$isValidParam$3 extends Lambda implements Function0<String> {
/*     */     StyleProfile$isValidParam$3(StyleProfile.ParamValue $value, Setting.Parameter $param) {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     public final String invoke() {
/*     */       return "Ignore " + this.$value + " because it is not in possible values: " + ArraysKt.joinToString$default((Object[])this.$param.getPossibleValues(), null, null, null, 0, null, null.INSTANCE, 31, null);
/*     */     }
/*     */   }
/*     */   
/*     */   private final boolean isDefaultParam(Map $this$isDefaultParam, ParamValue value) {
/*     */     Intrinsics.checkNotNull($this$isDefaultParam.get(value.getParameterId()));
/*     */     return Intrinsics.areEqual(((Setting)$this$isDefaultParam.get(value.getParameterId())).getDefaultValue().getId(), value.getValueId());
/*     */   }
/*     */   
/*     */   public final boolean isEmpty() {
/*     */     return (((this.paramValues.length == 0)) && ((this.enabledRules.length == 0)) && ((this.disabledRules.length == 0)));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final String id;
/*     */   @NotNull
/*     */   private final ParamValue[] paramValues;
/*     */   @NotNull
/*     */   private final String[] enabledRules;
/*     */   @NotNull
/*     */   private final String[] disabledRules;
/*     */   @JvmField
/*     */   @NotNull
/*     */   private static final KSerializer<Object>[] $childSerializers;
/*     */   
/*     */   static {
/*     */     KSerializer[] arrayOfKSerializer = new KSerializer[4];
/*     */     arrayOfKSerializer[0] = null;
/*     */     arrayOfKSerializer[1] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(ParamValue.class), (KSerializer)ParamValue.$serializer.INSTANCE);
/*     */     arrayOfKSerializer[2] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE);
/*     */     arrayOfKSerializer[3] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE);
/*     */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.id;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ParamValue[] component2() {
/*     */     return this.paramValues;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String[] component3() {
/*     */     return this.enabledRules;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String[] component4() {
/*     */     return this.disabledRules;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final StyleProfile copy(@NotNull String id, @NotNull ParamValue[] paramValues, @NotNull String[] enabledRules, @NotNull String[] disabledRules) {
/*     */     Intrinsics.checkNotNullParameter(id, "id");
/*     */     Intrinsics.checkNotNullParameter(paramValues, "paramValues");
/*     */     Intrinsics.checkNotNullParameter(enabledRules, "enabledRules");
/*     */     Intrinsics.checkNotNullParameter(disabledRules, "disabledRules");
/*     */     return new StyleProfile(id, paramValues, enabledRules, disabledRules);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "StyleProfile(id=" + this.id + ", paramValues=" + Arrays.toString((Object[])this.paramValues) + ", enabledRules=" + Arrays.toString((Object[])this.enabledRules) + ", disabledRules=" + Arrays.toString((Object[])this.disabledRules) + ")";
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001¨\006\t"}, d2 = {"Lai/grazie/gec/model/settings/StyleProfile$Companion;", "", "()V", "empty", "Lai/grazie/gec/model/settings/StyleProfile;", "id", "", "serializer", "Lkotlinx/serialization/KSerializer;", "model-gec"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<StyleProfile> serializer() {
/*     */       return (KSerializer<StyleProfile>)StyleProfile.$serializer.INSTANCE;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final StyleProfile empty(@NotNull String id) {
/*     */       Intrinsics.checkNotNullParameter(id, "id");
/*     */       return new StyleProfile(id, new StyleProfile.ParamValue[0], new String[0], new String[0]);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\settings\StyleProfile.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */