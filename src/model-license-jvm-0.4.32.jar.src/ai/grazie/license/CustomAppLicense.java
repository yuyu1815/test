/*    */ package ai.grazie.license;@Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\024\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 22\0020\001:\00212BY\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\t\022\006\020\013\032\0020\f\022\006\020\r\032\0020\f\022\006\020\016\032\0020\f\022\b\020\017\032\004\030\0010\020¢\006\002\020\021B%\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\t¢\006\002\020\022J\t\020\036\032\0020\005HÆ\003J\t\020\037\032\0020\007HÆ\003J\t\020 \032\0020\tHÆ\003J\t\020!\032\0020\tHÆ\003J1\020\"\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\tHÆ\001J\023\020#\032\0020\f2\b\020$\032\004\030\0010%HÖ\003J\t\020&\032\0020\003HÖ\001J\t\020'\032\0020(HÖ\001J&\020)\032\0020*2\006\020+\032\0020\0002\006\020,\032\0020-2\006\020.\032\0020/HÁ\001¢\006\002\b0R\024\020\013\032\0020\fXD¢\006\b\n\000\032\004\b\023\020\024R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\025\020\026R\024\020\016\032\0020\fXD¢\006\b\n\000\032\004\b\027\020\024R\024\020\b\032\0020\tX\004¢\006\b\n\000\032\004\b\030\020\031R\024\020\r\032\0020\fXD¢\006\b\n\000\032\004\b\032\020\024R\024\020\n\032\0020\tX\004¢\006\b\n\000\032\004\b\033\020\031R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\034\020\035¨\0063"}, d2 = {"Lai/grazie/license/CustomAppLicense;", "Lai/grazie/license/License;", "seen1", "", "licenseId", "Lai/grazie/license/LicenseID;", "type", "Lai/grazie/license/LicenseType;", "since", "Lai/grazie/utils/mpp/time/Timestamp;", "till", "cancelled", "", "suspended", "outdated", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/license/LicenseID;Lai/grazie/license/LicenseType;Lai/grazie/utils/mpp/time/Timestamp;Lai/grazie/utils/mpp/time/Timestamp;ZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/license/LicenseID;Lai/grazie/license/LicenseType;Lai/grazie/utils/mpp/time/Timestamp;Lai/grazie/utils/mpp/time/Timestamp;)V", "getCancelled", "()Z", "getLicenseId", "()Lai/grazie/license/LicenseID;", "getOutdated", "getSince", "()Lai/grazie/utils/mpp/time/Timestamp;", "getSuspended", "getTill", "getType", "()Lai/grazie/license/LicenseType;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_license", "$serializer", "Companion", "model-license"})
/*    */ public final class CustomAppLicense extends License { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final LicenseID licenseId; @NotNull
/*    */   private final LicenseType type; @NotNull
/*    */   private final Timestamp since; @NotNull
/*    */   private final Timestamp till; private final boolean cancelled; private final boolean suspended; private final boolean outdated;
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/license/CustomAppLicense.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/license/CustomAppLicense;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-license"})
/*    */   public static final class $serializer implements GeneratedSerializer<CustomAppLicense> { @NotNull
/* 12 */     public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[7]; arrayOfKSerializer[0] = (KSerializer)LicenseID.Serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)LicenseType.Serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)Timestamp.Serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)Timestamp.Serializer.INSTANCE; arrayOfKSerializer[4] = (KSerializer)BooleanSerializer.INSTANCE; arrayOfKSerializer[5] = (KSerializer)BooleanSerializer.INSTANCE; arrayOfKSerializer[6] = (KSerializer)BooleanSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public CustomAppLicense deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; LicenseID licenseID = null; LicenseType licenseType = null; Timestamp timestamp1 = null, timestamp2 = null; boolean bool1 = false, bool2 = false, bool3 = false; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { licenseID = (LicenseID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LicenseID.Serializer.INSTANCE, licenseID); i |= 0x1; licenseType = (LicenseType)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LicenseType.Serializer.INSTANCE, licenseType); i |= 0x2; timestamp1 = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp1); i |= 0x4; timestamp2 = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp2); i |= 0x8; bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 4); i |= 0x10; bool2 = compositeDecoder.decodeBooleanElement(serialDescriptor, 5); i |= 0x20; bool3 = compositeDecoder.decodeBooleanElement(serialDescriptor, 6); i |= 0x40; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: licenseID = (LicenseID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LicenseID.Serializer.INSTANCE, licenseID); i |= 0x1; continue;case 1: licenseType = (LicenseType)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LicenseType.Serializer.INSTANCE, licenseType); i |= 0x2; continue;case 2: timestamp1 = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp1); i |= 0x4; continue;case 3: timestamp2 = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp2); i |= 0x8; continue;case 4: bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 4); i |= 0x10; continue;case 5: bool2 = compositeDecoder.decodeBooleanElement(serialDescriptor, 5); i |= 0x20; continue;case 6: bool3 = compositeDecoder.decodeBooleanElement(serialDescriptor, 6); i |= 0x40; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new CustomAppLicense(i, licenseID, licenseType, timestamp1, timestamp2, bool1, bool2, bool3, null); } public void serialize(@NotNull Encoder encoder, @NotNull CustomAppLicense value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); CustomAppLicense.write$Self$model_license(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.license.CustomAppLicense", INSTANCE, 7); pluginGeneratedSerialDescriptor.addElement("licenseId", false); pluginGeneratedSerialDescriptor.addElement("type", false); pluginGeneratedSerialDescriptor.addElement("since", false); pluginGeneratedSerialDescriptor.addElement("till", false); pluginGeneratedSerialDescriptor.addElement("cancelled", true); pluginGeneratedSerialDescriptor.addElement("suspended", true); pluginGeneratedSerialDescriptor.addElement("outdated", true); pluginGeneratedSerialDescriptor.pushClassAnnotation((Annotation)new CustomAppLicense$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("_type")); descriptor = pluginGeneratedSerialDescriptor; }
/*    */      }
/*    */    @NotNull
/* 15 */   public LicenseID getLicenseId() { return this.licenseId; } @NotNull
/* 16 */   public LicenseType getType() { return this.type; } @NotNull
/* 17 */   public Timestamp getSince() { return this.since; } @NotNull
/* 18 */   public Timestamp getTill() { return this.till; }
/* 19 */   public CustomAppLicense(@NotNull LicenseID licenseId, @NotNull LicenseType type, @NotNull Timestamp since, @NotNull Timestamp till) { super(null); this.licenseId = licenseId; this.type = type; this.since = since;
/* 20 */     this.till = till; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J#\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\b\b\002\020\t\032\0020\bH\002J\017\020\n\032\b\022\004\022\0020\0040\013HÆ\001¨\006\f"}, d2 = {"Lai/grazie/license/CustomAppLicense$Companion;", "", "()V", "invoke", "Lai/grazie/license/CustomAppLicense;", "type", "Lai/grazie/license/LicenseType;", "since", "Lai/grazie/utils/mpp/time/Timestamp;", "till", "serializer", "Lkotlinx/serialization/KSerializer;", "model-license"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<CustomAppLicense> serializer() { return (KSerializer<CustomAppLicense>)CustomAppLicense.$serializer.INSTANCE; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final CustomAppLicense invoke(@NotNull LicenseType type, @NotNull Timestamp since, @NotNull Timestamp till) {
/* 25 */       Intrinsics.checkNotNullParameter(type, "type"); Intrinsics.checkNotNullParameter(since, "since"); Intrinsics.checkNotNullParameter(till, "till"); return new CustomAppLicense(new LicenseID("custom_app:" + UUID.Companion.random().getText()), type, since, till);
/*    */     } }
/*    */   
/* 28 */   public boolean getCancelled() { return this.cancelled; }
/* 29 */   public boolean getSuspended() { return this.suspended; } public boolean getOutdated() {
/* 30 */     return this.outdated;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LicenseID component1() {
/*    */     return this.licenseId;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LicenseType component2() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Timestamp component3() {
/*    */     return this.since;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Timestamp component4() {
/*    */     return this.till;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CustomAppLicense copy(@NotNull LicenseID licenseId, @NotNull LicenseType type, @NotNull Timestamp since, @NotNull Timestamp till) {
/*    */     Intrinsics.checkNotNullParameter(licenseId, "licenseId");
/*    */     Intrinsics.checkNotNullParameter(type, "type");
/*    */     Intrinsics.checkNotNullParameter(since, "since");
/*    */     Intrinsics.checkNotNullParameter(till, "till");
/*    */     return new CustomAppLicense(licenseId, type, since, till);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "CustomAppLicense(licenseId=" + this.licenseId + ", type=" + this.type + ", since=" + this.since + ", till=" + this.till + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.licenseId.hashCode();
/*    */     result = result * 31 + this.type.hashCode();
/*    */     result = result * 31 + this.since.hashCode();
/*    */     return result * 31 + this.till.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof CustomAppLicense))
/*    */       return false; 
/*    */     CustomAppLicense customAppLicense = (CustomAppLicense)other;
/*    */     return !Intrinsics.areEqual(this.licenseId, customAppLicense.licenseId) ? false : (!Intrinsics.areEqual(this.type, customAppLicense.type) ? false : (!Intrinsics.areEqual(this.since, customAppLicense.since) ? false : (!!Intrinsics.areEqual(this.till, customAppLicense.till))));
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-license-jvm-0.4.32.jar!\ai\grazie\license\CustomAppLicense.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */