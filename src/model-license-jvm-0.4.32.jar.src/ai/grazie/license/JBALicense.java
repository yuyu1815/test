/*    */ package ai.grazie.license;
/*    */ import ai.grazie.utils.mpp.time.Timestamp;
/*    */ import java.util.List;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000p\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\007\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b)\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\b\030\000 V2\0020\001:\003TUVB\001\b\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\b\020\b\032\004\030\0010\007\022\006\020\t\032\0020\n\022\006\020\013\032\0020\n\022\006\020\f\032\0020\n\022\b\020\r\032\004\030\0010\003\022\b\020\016\032\004\030\0010\003\022\006\020\017\032\0020\003\022\006\020\020\032\0020\n\022\f\020\021\032\b\022\004\022\0020\0230\022\022\f\020\024\032\b\022\004\022\0020\0250\022\022\n\b\002\020\026\032\004\030\0010\027¢\006\002\020\030B«\001\b\021\022\006\020\031\032\0020\032\022\b\020\002\032\004\030\0010\033\022\b\020\034\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\007\022\006\020\t\032\0020\n\022\006\020\013\032\0020\n\022\006\020\f\032\0020\n\022\b\020\r\032\004\030\0010\003\022\b\020\035\032\004\030\0010\003\022\n\b\001\020\017\032\004\030\0010\003\022\006\020\020\032\0020\n\022\016\020\021\032\n\022\004\022\0020\023\030\0010\022\022\016\020\024\032\n\022\004\022\0020\025\030\0010\022\022\b\020\026\032\004\030\0010\027\022\b\020\036\032\004\030\0010\037¢\006\002\020 B\001\022\006\020\002\032\0020\033\022\006\020\034\032\0020\005\022\006\020\006\032\0020\007\022\b\020\b\032\004\030\0010\007\022\006\020\t\032\0020\n\022\006\020\013\032\0020\n\022\006\020\f\032\0020\n\022\b\020\r\032\004\030\0010\003\022\b\020\035\032\004\030\0010\003\022\006\020\017\032\0020\003\022\b\b\002\020\020\032\0020\n\022\016\b\002\020\021\032\b\022\004\022\0020\0230\022\022\016\b\002\020\024\032\b\022\004\022\0020\0250\022\022\n\b\002\020\026\032\004\030\0010\027¢\006\002\020!J\t\0208\032\0020\033HÆ\003J\t\0209\032\0020\003HÆ\003J\t\020:\032\0020\nHÆ\003J\017\020;\032\b\022\004\022\0020\0230\022HÆ\003J\017\020<\032\b\022\004\022\0020\0250\022HÆ\003J\013\020=\032\004\030\0010\027HÆ\003J\t\020>\032\0020\005HÆ\003J\t\020?\032\0020\007HÆ\003J\013\020@\032\004\030\0010\007HÆ\003J\t\020A\032\0020\nHÆ\003J\t\020B\032\0020\nHÆ\003J\t\020C\032\0020\nHÆ\003J\013\020D\032\004\030\0010\003HÆ\003J\013\020E\032\004\030\0010\003HÆ\003J©\001\020F\032\0020\0002\b\b\002\020\002\032\0020\0332\b\b\002\020\034\032\0020\0052\b\b\002\020\006\032\0020\0072\n\b\002\020\b\032\004\030\0010\0072\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\n2\b\b\002\020\f\032\0020\n2\n\b\002\020\r\032\004\030\0010\0032\n\b\002\020\035\032\004\030\0010\0032\b\b\002\020\017\032\0020\0032\b\b\002\020\020\032\0020\n2\016\b\002\020\021\032\b\022\004\022\0020\0230\0222\016\b\002\020\024\032\b\022\004\022\0020\0250\0222\n\b\002\020\026\032\004\030\0010\027HÆ\001J\023\020G\032\0020\n2\b\020H\032\004\030\0010IHÖ\003J\t\020J\032\0020\032HÖ\001J\t\020K\032\0020\003HÖ\001J&\020L\032\0020M2\006\020N\032\0020\0002\006\020O\032\0020P2\006\020Q\032\0020RHÁ\001¢\006\002\bSR\027\020\021\032\b\022\004\022\0020\0230\022¢\006\b\n\000\032\004\b\"\020#R\023\020\026\032\004\030\0010\027¢\006\b\n\000\032\004\b$\020%R\024\020\t\032\0020\nX\004¢\006\b\n\000\032\004\b&\020'R\021\020\020\032\0020\n¢\006\b\n\000\032\004\b\020\020'R\023\020\r\032\004\030\0010\003¢\006\b\n\000\032\004\b(\020)R\024\020\002\032\0020\033X\004¢\006\b\n\000\032\004\b*\020+R\023\020\035\032\004\030\0010\003¢\006\b\n\000\032\004\b,\020)R\024\020\f\032\0020\nX\004¢\006\b\n\000\032\004\b-\020'R\034\020\017\032\0020\0038\006X\004¢\006\016\n\000\022\004\b.\020/\032\004\b0\020)R\027\020\024\032\b\022\004\022\0020\0250\022¢\006\b\n\000\032\004\b1\020#R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b2\0203R\024\020\013\032\0020\nX\004¢\006\b\n\000\032\004\b4\020'R\026\020\b\032\004\030\0010\007X\004¢\006\b\n\000\032\004\b5\0203R\024\020\034\032\0020\005X\004¢\006\b\n\000\032\004\b6\0207¨\006W"}, d2 = {"Lai/grazie/license/JBALicense;", "Lai/grazie/license/License;", "licenseId", "", "licenseType", "Lai/grazie/license/LicenseType;", "since", "Lai/grazie/utils/mpp/time/Timestamp;", "till", "cancelled", "", "suspended", "outdated", "jbaLogin", "jbaLinkedEmailLogin", "ownerEmail", "isInternal", "acceptedAgreements", "", "Lai/grazie/license/LicenseAgreementInfo$Base;", "requiredAgreements", "Lai/grazie/license/LicenseAgreementInfo$Extended;", "additionalData", "Lai/grazie/license/JBALicense$AdditionalData;", "(Ljava/lang/String;Lai/grazie/license/LicenseType;Lai/grazie/utils/mpp/time/Timestamp;Lai/grazie/utils/mpp/time/Timestamp;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Lai/grazie/license/JBALicense$AdditionalData;)V", "seen1", "", "Lai/grazie/license/LicenseID;", "type", "linkedJBALogin", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/license/LicenseID;Lai/grazie/license/LicenseType;Lai/grazie/utils/mpp/time/Timestamp;Lai/grazie/utils/mpp/time/Timestamp;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Lai/grazie/license/JBALicense$AdditionalData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/license/LicenseID;Lai/grazie/license/LicenseType;Lai/grazie/utils/mpp/time/Timestamp;Lai/grazie/utils/mpp/time/Timestamp;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Lai/grazie/license/JBALicense$AdditionalData;)V", "getAcceptedAgreements", "()Ljava/util/List;", "getAdditionalData", "()Lai/grazie/license/JBALicense$AdditionalData;", "getCancelled", "()Z", "getJbaLogin", "()Ljava/lang/String;", "getLicenseId", "()Lai/grazie/license/LicenseID;", "getLinkedJBALogin", "getOutdated", "getOwnerEmail$annotations", "()V", "getOwnerEmail", "getRequiredAgreements", "getSince", "()Lai/grazie/utils/mpp/time/Timestamp;", "getSuspended", "getTill", "getType", "()Lai/grazie/license/LicenseType;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_license", "$serializer", "AdditionalData", "Companion", "model-license"})
/*    */ public final class JBALicense extends License {
/*    */   @NotNull
/* 13 */   public static final Companion Companion = new Companion(null); @NotNull private final LicenseID licenseId; @NotNull private final LicenseType type; @NotNull private final Timestamp since; @Nullable private final Timestamp till; private final boolean cancelled; private final boolean suspended; private final boolean outdated; @Nullable private final String jbaLogin; @Nullable private final String linkedJBALogin; @NotNull private final String ownerEmail; private final boolean isInternal; @NotNull private final List<LicenseAgreementInfo.Base> acceptedAgreements; @NotNull private final List<LicenseAgreementInfo.Extended> requiredAgreements; @Nullable private final AdditionalData additionalData; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[14]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = null; arrayOfKSerializer[4] = null; arrayOfKSerializer[5] = null; arrayOfKSerializer[6] = null; arrayOfKSerializer[7] = null; arrayOfKSerializer[8] = null; arrayOfKSerializer[9] = null; arrayOfKSerializer[10] = null; arrayOfKSerializer[11] = (KSerializer)new ArrayListSerializer((KSerializer)LicenseAgreementInfo.Base.$serializer.INSTANCE); arrayOfKSerializer[12] = (KSerializer)new ArrayListSerializer((KSerializer)LicenseAgreementInfo.Extended.$serializer.INSTANCE); arrayOfKSerializer[13] = AdditionalData.Companion.serializer(); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/license/JBALicense.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/license/JBALicense;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-license"}) public static final class $serializer implements GeneratedSerializer<JBALicense> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])JBALicense.$childSerializers, arrayOfKSerializer2 = new KSerializer[14]; arrayOfKSerializer2[0] = (KSerializer)LicenseID.Serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)LicenseType.Serializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)Timestamp.Serializer.INSTANCE; arrayOfKSerializer2[3] = BuiltinSerializersKt.getNullable((KSerializer)Timestamp.Serializer.INSTANCE); arrayOfKSerializer2[4] = (KSerializer)BooleanSerializer.INSTANCE; arrayOfKSerializer2[5] = (KSerializer)BooleanSerializer.INSTANCE; arrayOfKSerializer2[6] = (KSerializer)BooleanSerializer.INSTANCE; arrayOfKSerializer2[7] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer2[8] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer2[9] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[10] = (KSerializer)BooleanSerializer.INSTANCE; arrayOfKSerializer2[11] = arrayOfKSerializer1[11]; arrayOfKSerializer2[12] = arrayOfKSerializer1[12]; arrayOfKSerializer2[13] = BuiltinSerializersKt.getNullable(arrayOfKSerializer1[13]); return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public JBALicense deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; LicenseID licenseID = null; LicenseType licenseType = null; Timestamp timestamp1 = null, timestamp2 = null; boolean bool1 = false, bool2 = false, bool3 = false; String str1 = null, str2 = null, str3 = null; boolean bool4 = false; List list1 = null, list2 = null; JBALicense.AdditionalData additionalData = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])JBALicense.$childSerializers; if (compositeDecoder.decodeSequentially()) { licenseID = (LicenseID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LicenseID.Serializer.INSTANCE, licenseID); i |= 0x1; licenseType = (LicenseType)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LicenseType.Serializer.INSTANCE, licenseType); i |= 0x2; timestamp1 = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp1); i |= 0x4; timestamp2 = (Timestamp)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp2); i |= 0x8; bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 4); i |= 0x10; bool2 = compositeDecoder.decodeBooleanElement(serialDescriptor, 5); i |= 0x20; bool3 = compositeDecoder.decodeBooleanElement(serialDescriptor, 6); i |= 0x40; str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 7, (DeserializationStrategy)StringSerializer.INSTANCE, str1); i |= 0x80; str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 8, (DeserializationStrategy)StringSerializer.INSTANCE, str2); i |= 0x100; str3 = compositeDecoder.decodeStringElement(serialDescriptor, 9); i |= 0x200; bool4 = compositeDecoder.decodeBooleanElement(serialDescriptor, 10); i |= 0x400; list1 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 11, (DeserializationStrategy)arrayOfKSerializer[11], list1); i |= 0x800; list2 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 12, (DeserializationStrategy)arrayOfKSerializer[12], list2); i |= 0x1000; additionalData = (JBALicense.AdditionalData)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 13, (DeserializationStrategy)arrayOfKSerializer[13], additionalData); i |= 0x2000; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: licenseID = (LicenseID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LicenseID.Serializer.INSTANCE, licenseID); i |= 0x1; continue;case 1: licenseType = (LicenseType)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LicenseType.Serializer.INSTANCE, licenseType); i |= 0x2; continue;case 2: timestamp1 = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp1); i |= 0x4; continue;case 3: timestamp2 = (Timestamp)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp2); i |= 0x8; continue;case 4: bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 4); i |= 0x10; continue;case 5: bool2 = compositeDecoder.decodeBooleanElement(serialDescriptor, 5); i |= 0x20; continue;case 6: bool3 = compositeDecoder.decodeBooleanElement(serialDescriptor, 6); i |= 0x40; continue;case 7: str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 7, (DeserializationStrategy)StringSerializer.INSTANCE, str1); i |= 0x80; continue;case 8: str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 8, (DeserializationStrategy)StringSerializer.INSTANCE, str2); i |= 0x100; continue;case 9: str3 = compositeDecoder.decodeStringElement(serialDescriptor, 9); i |= 0x200; continue;case 10: bool4 = compositeDecoder.decodeBooleanElement(serialDescriptor, 10); i |= 0x400; continue;case 11: list1 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 11, (DeserializationStrategy)arrayOfKSerializer[11], list1); i |= 0x800; continue;case 12: list2 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 12, (DeserializationStrategy)arrayOfKSerializer[12], list2); i |= 0x1000; continue;case 13: additionalData = (JBALicense.AdditionalData)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 13, (DeserializationStrategy)arrayOfKSerializer[13], additionalData); i |= 0x2000; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new JBALicense(i, licenseID, licenseType, timestamp1, timestamp2, bool1, bool2, bool3, str1, str2, str3, bool4, list1, list2, additionalData, null); } public void serialize(@NotNull Encoder encoder, @NotNull JBALicense value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); JBALicense.write$Self$model_license(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.license.JBALicense", INSTANCE, 14); pluginGeneratedSerialDescriptor.addElement("licenseId", false); pluginGeneratedSerialDescriptor.addElement("type", false); pluginGeneratedSerialDescriptor.addElement("since", false); pluginGeneratedSerialDescriptor.addElement("till", false); pluginGeneratedSerialDescriptor.addElement("cancelled", false); pluginGeneratedSerialDescriptor.addElement("suspended", false); pluginGeneratedSerialDescriptor.addElement("outdated", false); pluginGeneratedSerialDescriptor.addElement("jbaLogin", false); pluginGeneratedSerialDescriptor.addElement("linkedJBALogin", false); pluginGeneratedSerialDescriptor.addElement("ownerEmail", false); pluginGeneratedSerialDescriptor.addElement("isInternal", true); pluginGeneratedSerialDescriptor.addElement("acceptedAgreements", true); pluginGeneratedSerialDescriptor.addElement("requiredAgreements", true); pluginGeneratedSerialDescriptor.addElement("additionalData", true); pluginGeneratedSerialDescriptor.pushClassAnnotation((Annotation)new JBALicense$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("_type")); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/license/JBALicense$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/license/JBALicense;", "model-license"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<JBALicense> serializer() { return (KSerializer<JBALicense>)JBALicense.$serializer.INSTANCE; }
/*    */      }
/*    */   @NotNull
/* 16 */   public LicenseID getLicenseId() { return this.licenseId; } @NotNull
/* 17 */   public LicenseType getType() { return this.type; } @NotNull
/* 18 */   public Timestamp getSince() { return this.since; } @Nullable
/* 19 */   public Timestamp getTill() { return this.till; }
/* 20 */   public boolean getCancelled() { return this.cancelled; }
/* 21 */   public boolean getSuspended() { return this.suspended; }
/* 22 */   public boolean getOutdated() { return this.outdated; } @Nullable
/* 23 */   public final String getJbaLogin() { return this.jbaLogin; } @Nullable
/* 24 */   public final String getLinkedJBALogin() { return this.linkedJBALogin; }
/*    */   @NotNull
/* 26 */   public final String getOwnerEmail() { return this.ownerEmail; }
/* 27 */   public final boolean isInternal() { return this.isInternal; } @NotNull
/* 28 */   public final List<LicenseAgreementInfo.Base> getAcceptedAgreements() { return this.acceptedAgreements; } @NotNull
/* 29 */   public final List<LicenseAgreementInfo.Extended> getRequiredAgreements() { return this.requiredAgreements; } @Nullable
/* 30 */   public final AdditionalData getAdditionalData() { return this.additionalData; }
/* 31 */   public JBALicense(@NotNull String licenseId, @NotNull LicenseType licenseType, @NotNull Timestamp since, @Nullable Timestamp till, boolean cancelled, boolean suspended, boolean outdated, @Nullable String jbaLogin, @Nullable String jbaLinkedEmailLogin, @NotNull String ownerEmail, boolean isInternal, @NotNull List<LicenseAgreementInfo.Base> acceptedAgreements, @NotNull List<LicenseAgreementInfo.Extended> requiredAgreements, @Nullable AdditionalData additionalData) { this(new LicenseID(licenseId), licenseType, since, till, cancelled, suspended, outdated, jbaLogin, jbaLinkedEmailLogin, ownerEmail, isInternal, acceptedAgreements, requiredAgreements, additionalData); } @NotNull public final LicenseID component1() { return this.licenseId; } @NotNull public final LicenseType component2() { return this.type; } @NotNull public final Timestamp component3() { return this.since; } @Nullable public final Timestamp component4() { return this.till; } public final boolean component5() { return this.cancelled; } public final boolean component6() { return this.suspended; } public final boolean component7() { return this.outdated; } @Nullable public final String component8() { return this.jbaLogin; } @Nullable public final String component9() { return this.linkedJBALogin; } @NotNull public final String component10() { return this.ownerEmail; } public final boolean component11() { return this.isInternal; } @NotNull public final List<LicenseAgreementInfo.Base> component12() { return this.acceptedAgreements; } @NotNull public final List<LicenseAgreementInfo.Extended> component13() { return this.requiredAgreements; } @Nullable public final AdditionalData component14() { return this.additionalData; } public JBALicense(@NotNull LicenseID licenseId, @NotNull LicenseType type, @NotNull Timestamp since, @Nullable Timestamp till, boolean cancelled, boolean suspended, boolean outdated, @Nullable String jbaLogin, @Nullable String linkedJBALogin, @NotNull String ownerEmail, boolean isInternal, @NotNull List<LicenseAgreementInfo.Base> acceptedAgreements, @NotNull List<LicenseAgreementInfo.Extended> requiredAgreements, @Nullable AdditionalData additionalData) { super(null);
/*    */ 
/*    */     
/*    */     this.licenseId = licenseId;
/*    */ 
/*    */     
/*    */     this.type = type;
/*    */ 
/*    */     
/*    */     this.since = since;
/*    */ 
/*    */     
/*    */     this.till = till;
/*    */ 
/*    */     
/*    */     this.cancelled = cancelled;
/*    */ 
/*    */     
/*    */     this.suspended = suspended;
/*    */     
/*    */     this.outdated = outdated;
/*    */     
/*    */     this.jbaLogin = jbaLogin;
/*    */     
/*    */     this.linkedJBALogin = linkedJBALogin;
/*    */     
/*    */     this.ownerEmail = ownerEmail;
/*    */     
/*    */     this.isInternal = isInternal;
/*    */     
/*    */     this.acceptedAgreements = acceptedAgreements;
/*    */     
/*    */     this.requiredAgreements = requiredAgreements;
/*    */     
/*    */     this.additionalData = additionalData;
/*    */     
/* 67 */     if (!LicenseType.IdeServices.INSTANCE.getAll().contains(getType()) && 
/* 68 */       !((this.jbaLogin != null || this.linkedJBALogin != null) ? 1 : 0)) { int $i$a$-require-JBALicense$1 = 0; String str = "Attempt to create license without login or linked login for license " + 
/* 69 */         getLicenseId().getId(); throw new IllegalArgumentException(str.toString()); }  }
/*    */   @NotNull public final JBALicense copy(@NotNull LicenseID licenseId, @NotNull LicenseType type, @NotNull Timestamp since, @Nullable Timestamp till, boolean cancelled, boolean suspended, boolean outdated, @Nullable String jbaLogin, @Nullable String linkedJBALogin, @NotNull String ownerEmail, boolean isInternal, @NotNull List<LicenseAgreementInfo.Base> acceptedAgreements, @NotNull List<LicenseAgreementInfo.Extended> requiredAgreements, @Nullable AdditionalData additionalData) { Intrinsics.checkNotNullParameter(licenseId, "licenseId"); Intrinsics.checkNotNullParameter(type, "type"); Intrinsics.checkNotNullParameter(since, "since"); Intrinsics.checkNotNullParameter(ownerEmail, "ownerEmail"); Intrinsics.checkNotNullParameter(acceptedAgreements, "acceptedAgreements"); Intrinsics.checkNotNullParameter(requiredAgreements, "requiredAgreements"); return new JBALicense(licenseId, type, since, till, cancelled, suspended, outdated, jbaLogin, linkedJBALogin, ownerEmail, isInternal, acceptedAgreements, requiredAgreements, additionalData); }
/*    */   @NotNull public String toString() { return "JBALicense(licenseId=" + this.licenseId + ", type=" + this.type + ", since=" + this.since + ", till=" + this.till + ", cancelled=" + this.cancelled + ", suspended=" + this.suspended + ", outdated=" + this.outdated + ", jbaLogin=" + this.jbaLogin + ", linkedJBALogin=" + this.linkedJBALogin + ", ownerEmail=" + this.ownerEmail + ", isInternal=" + this.isInternal + ", acceptedAgreements=" + this.acceptedAgreements + ", requiredAgreements=" + this.requiredAgreements + ", additionalData=" + this.additionalData + ")"; } public int hashCode() { result = this.licenseId.hashCode(); result = result * 31 + this.type.hashCode(); result = result * 31 + this.since.hashCode(); result = result * 31 + ((this.till == null) ? 0 : this.till.hashCode()); result = result * 31 + Boolean.hashCode(this.cancelled); result = result * 31 + Boolean.hashCode(this.suspended); result = result * 31 + Boolean.hashCode(this.outdated); result = result * 31 + ((this.jbaLogin == null) ? 0 : this.jbaLogin.hashCode()); result = result * 31 + ((this.linkedJBALogin == null) ? 0 : this.linkedJBALogin.hashCode()); result = result * 31 + this.ownerEmail.hashCode(); result = result * 31 + Boolean.hashCode(this.isInternal); result = result * 31 + this.acceptedAgreements.hashCode(); result = result * 31 + this.requiredAgreements.hashCode(); return result * 31 + ((this.additionalData == null) ? 0 : this.additionalData.hashCode()); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof JBALicense))
/*    */       return false;  JBALicense jBALicense = (JBALicense)other; return !Intrinsics.areEqual(this.licenseId, jBALicense.licenseId) ? false : (!Intrinsics.areEqual(this.type, jBALicense.type) ? false : (!Intrinsics.areEqual(this.since, jBALicense.since) ? false : (!Intrinsics.areEqual(this.till, jBALicense.till) ? false : ((this.cancelled != jBALicense.cancelled) ? false : ((this.suspended != jBALicense.suspended) ? false : ((this.outdated != jBALicense.outdated) ? false : (!Intrinsics.areEqual(this.jbaLogin, jBALicense.jbaLogin) ? false : (!Intrinsics.areEqual(this.linkedJBALogin, jBALicense.linkedJBALogin) ? false : (!Intrinsics.areEqual(this.ownerEmail, jBALicense.ownerEmail) ? false : ((this.isInternal != jBALicense.isInternal) ? false : (!Intrinsics.areEqual(this.acceptedAgreements, jBALicense.acceptedAgreements) ? false : (!Intrinsics.areEqual(this.requiredAgreements, jBALicense.requiredAgreements) ? false : (!!Intrinsics.areEqual(this.additionalData, jBALicense.additionalData)))))))))))))); } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b7\030\000 \0172\0020\001:\002\017\020B\031\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005¢\006\002\020\006B\007\b\004¢\006\002\020\007J!\020\b\032\0020\t2\006\020\n\032\0020\0002\006\020\013\032\0020\f2\006\020\r\032\0020\016HÇ\001\001\001\021¨\006\022"}, d2 = {"Lai/grazie/license/JBALicense$AdditionalData;", "", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "IDESAdditionalData", "Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData;", "model-license"}) public static abstract class AdditionalData
/*    */   {
/* 74 */     @NotNull public static final Companion Companion = new Companion(null); @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); private AdditionalData() {} @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class null extends Lambda implements Function0<KSerializer<Object>> { public static final null INSTANCE = (null)new Function0<>(); null() { super(0); } public final KSerializer<Object> invoke() { KClass[] arrayOfKClass = new KClass[1]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(JBALicense.AdditionalData.IDESAdditionalData.class); KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)JBALicense.AdditionalData.IDESAdditionalData.$serializer.INSTANCE; return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.license.JBALicense.AdditionalData", Reflection.getOrCreateKotlinClass(JBALicense.AdditionalData.class), arrayOfKClass, arrayOfKSerializer, new Annotation[0]); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/license/JBALicense$AdditionalData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/license/JBALicense$AdditionalData;", "model-license"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<JBALicense.AdditionalData> serializer() { return get$cachedSerializer(); } } @Serializable @SerialName("IDES") @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\020\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\b\030\000 (2\0020\001:\003'()B5\b\021\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\003\022\b\020\007\032\004\030\0010\b\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B#\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\003\022\n\b\002\020\007\032\004\030\0010\b¢\006\002\020\fJ\t\020\024\032\0020\005HÆ\003J\020\020\025\032\004\030\0010\003HÆ\003¢\006\002\020\020J\013\020\026\032\004\030\0010\bHÆ\003J0\020\027\032\0020\0002\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\0032\n\b\002\020\007\032\004\030\0010\bHÆ\001¢\006\002\020\030J\023\020\031\032\0020\0052\b\020\032\032\004\030\0010\033HÖ\003J\t\020\034\032\0020\003HÖ\001J\t\020\035\032\0020\036HÖ\001J&\020\037\032\0020 2\006\020!\032\0020\0002\006\020\"\032\0020#2\006\020$\032\0020%HÁ\001¢\006\002\b&R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\016R\025\020\006\032\004\030\0010\003¢\006\n\n\002\020\021\032\004\b\017\020\020R\023\020\007\032\004\030\0010\b¢\006\b\n\000\032\004\b\022\020\023¨\006*"}, d2 = {"Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData;", "Lai/grazie/license/JBALicense$AdditionalData;", "seen1", "", "aiEnabled", "", "prepaidUsers", "trialInfo", "Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$TrialInfo;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLjava/lang/Integer;Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$TrialInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZLjava/lang/Integer;Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$TrialInfo;)V", "getAiEnabled", "()Z", "getPrepaidUsers", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTrialInfo", "()Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$TrialInfo;", "component1", "component2", "component3", "copy", "(ZLjava/lang/Integer;Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$TrialInfo;)Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData;", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_license", "$serializer", "Companion", "TrialInfo", "model-license"}) public static final class IDESAdditionalData extends AdditionalData { @NotNull public static final Companion Companion = new Companion(null); private final boolean aiEnabled; @Nullable private final Integer prepaidUsers; @Nullable private final TrialInfo trialInfo; @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/license/JBALicense.AdditionalData.IDESAdditionalData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-license"})
/*    */       public static final class $serializer implements GeneratedSerializer<IDESAdditionalData> { @NotNull
/* 76 */         public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = (KSerializer)BooleanSerializer.INSTANCE; arrayOfKSerializer[1] = BuiltinSerializersKt.getNullable((KSerializer)IntSerializer.INSTANCE); arrayOfKSerializer[2] = BuiltinSerializersKt.getNullable((KSerializer)JBALicense.AdditionalData.IDESAdditionalData.TrialInfo.$serializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public JBALicense.AdditionalData.IDESAdditionalData deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; boolean bool1 = false; Integer integer = null; JBALicense.AdditionalData.IDESAdditionalData.TrialInfo trialInfo = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 0); i |= 0x1; integer = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)IntSerializer.INSTANCE, integer); i |= 0x2; trialInfo = (JBALicense.AdditionalData.IDESAdditionalData.TrialInfo)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)JBALicense.AdditionalData.IDESAdditionalData.TrialInfo.$serializer.INSTANCE, trialInfo); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 0); i |= 0x1; continue;case 1: integer = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)IntSerializer.INSTANCE, integer); i |= 0x2; continue;case 2: trialInfo = (JBALicense.AdditionalData.IDESAdditionalData.TrialInfo)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)JBALicense.AdditionalData.IDESAdditionalData.TrialInfo.$serializer.INSTANCE, trialInfo); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new JBALicense.AdditionalData.IDESAdditionalData(i, bool1, integer, trialInfo, null); } public void serialize(@NotNull Encoder encoder, @NotNull JBALicense.AdditionalData.IDESAdditionalData value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); JBALicense.AdditionalData.IDESAdditionalData.write$Self$model_license(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("IDES", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("aiEnabled", false); pluginGeneratedSerialDescriptor.addElement("prepaidUsers", false); pluginGeneratedSerialDescriptor.addElement("trialInfo", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData;", "model-license"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<JBALicense.AdditionalData.IDESAdditionalData> serializer() { return (KSerializer<JBALicense.AdditionalData.IDESAdditionalData>)JBALicense.AdditionalData.IDESAdditionalData.$serializer.INSTANCE; }
/*    */          }
/*    */       
/* 79 */       public final boolean getAiEnabled() { return this.aiEnabled; } @Nullable
/* 80 */       public final Integer getPrepaidUsers() { return this.prepaidUsers; } @Nullable
/* 81 */       public final TrialInfo getTrialInfo() { return this.trialInfo; }
/* 82 */       public IDESAdditionalData(boolean aiEnabled, @Nullable Integer prepaidUsers, @Nullable TrialInfo trialInfo) { super(null); this.aiEnabled = aiEnabled; this.prepaidUsers = prepaidUsers; this.trialInfo = trialInfo; } public final boolean component1() { return this.aiEnabled; } @Nullable public final Integer component2() { return this.prepaidUsers; } @Nullable public final TrialInfo component3() { return this.trialInfo; } @NotNull public final IDESAdditionalData copy(boolean aiEnabled, @Nullable Integer prepaidUsers, @Nullable TrialInfo trialInfo) { return new IDESAdditionalData(aiEnabled, prepaidUsers, trialInfo); } @NotNull public String toString() { return "IDESAdditionalData(aiEnabled=" + this.aiEnabled + ", prepaidUsers=" + this.prepaidUsers + ", trialInfo=" + this.trialInfo + ")"; }
/*    */       public int hashCode() { result = Boolean.hashCode(this.aiEnabled); result = result * 31 + ((this.prepaidUsers == null) ? 0 : this.prepaidUsers.hashCode()); return result * 31 + ((this.trialInfo == null) ? 0 : this.trialInfo.hashCode()); }
/*    */       public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof IDESAdditionalData)) return false;  IDESAdditionalData iDESAdditionalData = (IDESAdditionalData)other; return (this.aiEnabled != iDESAdditionalData.aiEnabled) ? false : (!Intrinsics.areEqual(this.prepaidUsers, iDESAdditionalData.prepaidUsers) ? false : (!!Intrinsics.areEqual(this.trialInfo, iDESAdditionalData.trialInfo))); }
/*    */       @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 !2\0020\001:\002 !B+\b\021\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\b\020\005\032\004\030\0010\006\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\025\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006¢\006\002\020\nJ\t\020\017\032\0020\003HÆ\003J\t\020\020\032\0020\006HÆ\003J\035\020\021\032\0020\0002\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\006HÆ\001J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\001HÖ\003J\t\020\025\032\0020\003HÖ\001J\t\020\026\032\0020\027HÖ\001J&\020\030\032\0020\0312\006\020\032\032\0020\0002\006\020\033\032\0020\0342\006\020\035\032\0020\036HÁ\001¢\006\002\b\037R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\013\020\fR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\r\020\016¨\006\""}, d2 = {"Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$TrialInfo;", "", "seen1", "", "usersLimit", "till", "Lai/grazie/utils/mpp/time/Timestamp;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILai/grazie/utils/mpp/time/Timestamp;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILai/grazie/utils/mpp/time/Timestamp;)V", "getTill", "()Lai/grazie/utils/mpp/time/Timestamp;", "getUsersLimit", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_license", "$serializer", "Companion", "model-license"}) public static final class TrialInfo { @NotNull public static final Companion Companion = new Companion(null); private final int usersLimit; @NotNull private final Timestamp till;
/* 86 */         public TrialInfo(int usersLimit, @NotNull Timestamp till) { this.usersLimit = usersLimit;
/* 87 */           this.till = till; } @NotNull public final Timestamp getTill() { return this.till; }
/*    */ 
/*    */         
/*    */         @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/license/JBALicense.AdditionalData.IDESAdditionalData.TrialInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$TrialInfo;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-license"})
/*    */         public static final class $serializer implements GeneratedSerializer<TrialInfo> {
/*    */           @NotNull
/*    */           public static final $serializer INSTANCE = new $serializer();
/*    */           
/*    */           @NotNull
/*    */           public KSerializer<?>[] typeParametersSerializers() {
/*    */             return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */           }
/*    */           
/*    */           @NotNull
/*    */           public SerialDescriptor getDescriptor() {
/*    */             return (SerialDescriptor)descriptor;
/*    */           }
/*    */           
/*    */           @NotNull
/*    */           public KSerializer<?>[] childSerializers() {
/*    */             KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*    */             arrayOfKSerializer[0] = (KSerializer)IntSerializer.INSTANCE;
/*    */             arrayOfKSerializer[1] = (KSerializer)Timestamp.Serializer.INSTANCE;
/*    */             return (KSerializer<?>[])arrayOfKSerializer;
/*    */           }
/*    */           
/*    */           @NotNull
/*    */           public JBALicense.AdditionalData.IDESAdditionalData.TrialInfo deserialize(@NotNull Decoder decoder) {
/*    */             Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */             SerialDescriptor serialDescriptor = getDescriptor();
/*    */             boolean bool = true;
/*    */             int i = 0, j = 0;
/*    */             Timestamp timestamp = null;
/*    */             CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */             if (compositeDecoder.decodeSequentially()) {
/*    */               j = compositeDecoder.decodeIntElement(serialDescriptor, 0);
/*    */               i |= 0x1;
/*    */               timestamp = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp);
/*    */               i |= 0x2;
/*    */             } else {
/*    */               while (bool) {
/*    */                 int k = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */                 switch (k) {
/*    */                   case -1:
/*    */                     bool = false;
/*    */                     continue;
/*    */                   case 0:
/*    */                     j = compositeDecoder.decodeIntElement(serialDescriptor, 0);
/*    */                     i |= 0x1;
/*    */                     continue;
/*    */                   case 1:
/*    */                     timestamp = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp);
/*    */                     i |= 0x2;
/*    */                     continue;
/*    */                 } 
/*    */                 throw new UnknownFieldException(k);
/*    */               } 
/*    */             } 
/*    */             compositeDecoder.endStructure(serialDescriptor);
/*    */             return new JBALicense.AdditionalData.IDESAdditionalData.TrialInfo(i, j, timestamp, null);
/*    */           }
/*    */           
/*    */           public void serialize(@NotNull Encoder encoder, @NotNull JBALicense.AdditionalData.IDESAdditionalData.TrialInfo value) {
/*    */             Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */             Intrinsics.checkNotNullParameter(value, "value");
/*    */             SerialDescriptor serialDescriptor = getDescriptor();
/*    */             CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */             JBALicense.AdditionalData.IDESAdditionalData.TrialInfo.write$Self$model_license(value, compositeEncoder, serialDescriptor);
/*    */             compositeEncoder.endStructure(serialDescriptor);
/*    */           }
/*    */           
/*    */           static {
/*    */             PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.license.JBALicense.AdditionalData.IDESAdditionalData.TrialInfo", INSTANCE, 2);
/*    */             pluginGeneratedSerialDescriptor.addElement("usersLimit", false);
/*    */             pluginGeneratedSerialDescriptor.addElement("till", false);
/*    */             descriptor = pluginGeneratedSerialDescriptor;
/*    */           }
/*    */         }
/*    */         
/*    */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$TrialInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$TrialInfo;", "model-license"})
/*    */         public static final class Companion {
/*    */           private Companion() {}
/*    */           
/*    */           @NotNull
/*    */           public final KSerializer<JBALicense.AdditionalData.IDESAdditionalData.TrialInfo> serializer() {
/*    */             return (KSerializer<JBALicense.AdditionalData.IDESAdditionalData.TrialInfo>)JBALicense.AdditionalData.IDESAdditionalData.TrialInfo.$serializer.INSTANCE;
/*    */           }
/*    */         }
/*    */         
/*    */         public final int getUsersLimit() {
/*    */           return this.usersLimit;
/*    */         }
/*    */         
/*    */         public final int component1() {
/*    */           return this.usersLimit;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public final Timestamp component2() {
/*    */           return this.till;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public final TrialInfo copy(int usersLimit, @NotNull Timestamp till) {
/*    */           Intrinsics.checkNotNullParameter(till, "till");
/*    */           return new TrialInfo(usersLimit, till);
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public String toString() {
/*    */           return "TrialInfo(usersLimit=" + this.usersLimit + ", till=" + this.till + ")";
/*    */         }
/*    */         
/*    */         public int hashCode() {
/*    */           result = Integer.hashCode(this.usersLimit);
/*    */           return result * 31 + this.till.hashCode();
/*    */         }
/*    */         
/*    */         public boolean equals(@Nullable Object other) {
/*    */           if (this == other)
/*    */             return true; 
/*    */           if (!(other instanceof TrialInfo))
/*    */             return false; 
/*    */           TrialInfo trialInfo = (TrialInfo)other;
/*    */           return (this.usersLimit != trialInfo.usersLimit) ? false : (!!Intrinsics.areEqual(this.till, trialInfo.till));
/*    */         } }
/*    */ 
/*    */       
/*    */       @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/license/JBALicense.AdditionalData.IDESAdditionalData.TrialInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$TrialInfo;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-license"})
/*    */       public static final class $serializer implements GeneratedSerializer<TrialInfo> {
/*    */         @NotNull
/*    */         public static final $serializer INSTANCE = new $serializer();
/*    */         
/*    */         @NotNull
/*    */         public KSerializer<?>[] typeParametersSerializers() {
/*    */           return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public SerialDescriptor getDescriptor() {
/*    */           return (SerialDescriptor)descriptor;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public KSerializer<?>[] childSerializers() {
/*    */           KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*    */           arrayOfKSerializer[0] = (KSerializer)IntSerializer.INSTANCE;
/*    */           arrayOfKSerializer[1] = (KSerializer)Timestamp.Serializer.INSTANCE;
/*    */           return (KSerializer<?>[])arrayOfKSerializer;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public JBALicense.AdditionalData.IDESAdditionalData.TrialInfo deserialize(@NotNull Decoder decoder) {
/*    */           Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */           SerialDescriptor serialDescriptor = getDescriptor();
/*    */           boolean bool = true;
/*    */           int i = 0, j = 0;
/*    */           Timestamp timestamp = null;
/*    */           CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */           if (compositeDecoder.decodeSequentially()) {
/*    */             j = compositeDecoder.decodeIntElement(serialDescriptor, 0);
/*    */             i |= 0x1;
/*    */             timestamp = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp);
/*    */             i |= 0x2;
/*    */           } else {
/*    */             while (bool) {
/*    */               int k = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */               switch (k) {
/*    */                 case -1:
/*    */                   bool = false;
/*    */                   continue;
/*    */                 case 0:
/*    */                   j = compositeDecoder.decodeIntElement(serialDescriptor, 0);
/*    */                   i |= 0x1;
/*    */                   continue;
/*    */                 case 1:
/*    */                   timestamp = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp);
/*    */                   i |= 0x2;
/*    */                   continue;
/*    */               } 
/*    */               throw new UnknownFieldException(k);
/*    */             } 
/*    */           } 
/*    */           compositeDecoder.endStructure(serialDescriptor);
/*    */           return new JBALicense.AdditionalData.IDESAdditionalData.TrialInfo(i, j, timestamp, null);
/*    */         }
/*    */         
/*    */         public void serialize(@NotNull Encoder encoder, @NotNull JBALicense.AdditionalData.IDESAdditionalData.TrialInfo value) {
/*    */           Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */           Intrinsics.checkNotNullParameter(value, "value");
/*    */           SerialDescriptor serialDescriptor = getDescriptor();
/*    */           CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */           JBALicense.AdditionalData.IDESAdditionalData.TrialInfo.write$Self$model_license(value, compositeEncoder, serialDescriptor);
/*    */           compositeEncoder.endStructure(serialDescriptor);
/*    */         }
/*    */         
/*    */         static {
/*    */           PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.license.JBALicense.AdditionalData.IDESAdditionalData.TrialInfo", INSTANCE, 2);
/*    */           pluginGeneratedSerialDescriptor.addElement("usersLimit", false);
/*    */           pluginGeneratedSerialDescriptor.addElement("till", false);
/*    */           descriptor = pluginGeneratedSerialDescriptor;
/*    */         }
/*    */       } }
/*    */   
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/license/JBALicense$AdditionalData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/license/JBALicense$AdditionalData;", "model-license"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<JBALicense.AdditionalData> serializer() {
/*    */       return get$cachedSerializer();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-license-jvm-0.4.32.jar!\ai\grazie\license\JBALicense.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */