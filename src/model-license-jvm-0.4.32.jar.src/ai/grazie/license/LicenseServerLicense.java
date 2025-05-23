/*    */ package ai.grazie.license;@Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000Z\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\034\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 <2\0020\001:\002;<Bk\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\t\022\b\020\013\032\004\030\0010\f\022\006\020\r\032\0020\003\022\006\020\016\032\0020\017\022\006\020\020\032\0020\017\022\006\020\021\032\0020\017\022\b\020\022\032\004\030\0010\023¢\006\002\020\024B7\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\b\020\n\032\004\030\0010\t\022\006\020\013\032\0020\f\022\006\020\r\032\0020\003¢\006\002\020\025J\t\020'\032\0020\005HÆ\003J\t\020(\032\0020\007HÆ\003J\t\020)\032\0020\tHÆ\003J\013\020*\032\004\030\0010\tHÆ\003J\t\020+\032\0020\fHÆ\003J\t\020,\032\0020\003HÆ\003JG\020-\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\n\b\002\020\n\032\004\030\0010\t2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\003HÆ\001J\023\020.\032\0020\0172\b\020/\032\004\030\00100HÖ\003J\t\0201\032\0020\003HÖ\001J\t\0202\032\0020\fHÖ\001J&\0203\032\002042\006\0205\032\0020\0002\006\0206\032\002072\006\0208\032\00209HÁ\001¢\006\002\b:R\021\020\r\032\0020\003¢\006\b\n\000\032\004\b\026\020\027R\024\020\016\032\0020\017XD¢\006\b\n\000\032\004\b\030\020\031R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\032\020\033R\024\020\021\032\0020\017XD¢\006\b\n\000\032\004\b\034\020\031R\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\035\020\036R\024\020\b\032\0020\tX\004¢\006\b\n\000\032\004\b\037\020 R\024\020\020\032\0020\017XD¢\006\b\n\000\032\004\b!\020\031R\026\020\n\032\004\030\0010\tX\004¢\006\b\n\000\032\004\b\"\020 R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b#\020$R\024\020%\032\0020\0178VX\004¢\006\006\032\004\b&\020\031¨\006="}, d2 = {"Lai/grazie/license/LicenseServerLicense;", "Lai/grazie/license/License;", "seen1", "", "licenseId", "Lai/grazie/license/LicenseID;", "type", "Lai/grazie/license/LicenseType;", "since", "Lai/grazie/utils/mpp/time/Timestamp;", "till", "serverUid", "", "activeLicensesNumber", "cancelled", "", "suspended", "outdated", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/license/LicenseID;Lai/grazie/license/LicenseType;Lai/grazie/utils/mpp/time/Timestamp;Lai/grazie/utils/mpp/time/Timestamp;Ljava/lang/String;IZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/license/LicenseID;Lai/grazie/license/LicenseType;Lai/grazie/utils/mpp/time/Timestamp;Lai/grazie/utils/mpp/time/Timestamp;Ljava/lang/String;I)V", "getActiveLicensesNumber", "()I", "getCancelled", "()Z", "getLicenseId", "()Lai/grazie/license/LicenseID;", "getOutdated", "getServerUid", "()Ljava/lang/String;", "getSince", "()Lai/grazie/utils/mpp/time/Timestamp;", "getSuspended", "getTill", "getType", "()Lai/grazie/license/LicenseType;", "valid", "getValid", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_license", "$serializer", "Companion", "model-license"}) public final class LicenseServerLicense extends License { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final LicenseID licenseId; @NotNull
/*    */   private final LicenseType type; @NotNull
/*    */   private final Timestamp since; @Nullable
/*    */   private final Timestamp till; @NotNull
/*    */   private final String serverUid; private final int activeLicensesNumber; private final boolean cancelled; private final boolean suspended; private final boolean outdated; @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/license/LicenseServerLicense.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/license/LicenseServerLicense;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-license"})
/*    */   public static final class $serializer implements GeneratedSerializer<LicenseServerLicense> { @NotNull
/* 10 */     public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[9]; arrayOfKSerializer[0] = (KSerializer)LicenseID.Serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)LicenseType.Serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)Timestamp.Serializer.INSTANCE; arrayOfKSerializer[3] = BuiltinSerializersKt.getNullable((KSerializer)Timestamp.Serializer.INSTANCE); arrayOfKSerializer[4] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[5] = (KSerializer)IntSerializer.INSTANCE; arrayOfKSerializer[6] = (KSerializer)BooleanSerializer.INSTANCE; arrayOfKSerializer[7] = (KSerializer)BooleanSerializer.INSTANCE; arrayOfKSerializer[8] = (KSerializer)BooleanSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public LicenseServerLicense deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; LicenseID licenseID = null; LicenseType licenseType = null; Timestamp timestamp1 = null, timestamp2 = null; String str = null; int j = 0; boolean bool1 = false, bool2 = false, bool3 = false; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { licenseID = (LicenseID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LicenseID.Serializer.INSTANCE, licenseID); i |= 0x1; licenseType = (LicenseType)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LicenseType.Serializer.INSTANCE, licenseType); i |= 0x2; timestamp1 = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp1); i |= 0x4; timestamp2 = (Timestamp)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp2); i |= 0x8; str = compositeDecoder.decodeStringElement(serialDescriptor, 4); i |= 0x10; j = compositeDecoder.decodeIntElement(serialDescriptor, 5); i |= 0x20; bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 6); i |= 0x40; bool2 = compositeDecoder.decodeBooleanElement(serialDescriptor, 7); i |= 0x80; bool3 = compositeDecoder.decodeBooleanElement(serialDescriptor, 8); i |= 0x100; } else { while (bool) { int k = compositeDecoder.decodeElementIndex(serialDescriptor); switch (k) { case -1: bool = false; continue;case 0: licenseID = (LicenseID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LicenseID.Serializer.INSTANCE, licenseID); i |= 0x1; continue;case 1: licenseType = (LicenseType)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LicenseType.Serializer.INSTANCE, licenseType); i |= 0x2; continue;case 2: timestamp1 = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp1); i |= 0x4; continue;case 3: timestamp2 = (Timestamp)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp2); i |= 0x8; continue;case 4: str = compositeDecoder.decodeStringElement(serialDescriptor, 4); i |= 0x10; continue;case 5: j = compositeDecoder.decodeIntElement(serialDescriptor, 5); i |= 0x20; continue;case 6: bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 6); i |= 0x40; continue;case 7: bool2 = compositeDecoder.decodeBooleanElement(serialDescriptor, 7); i |= 0x80; continue;case 8: bool3 = compositeDecoder.decodeBooleanElement(serialDescriptor, 8); i |= 0x100; continue; }  throw new UnknownFieldException(k); }  }  compositeDecoder.endStructure(serialDescriptor); return new LicenseServerLicense(i, licenseID, licenseType, timestamp1, timestamp2, str, j, bool1, bool2, bool3, null); } public void serialize(@NotNull Encoder encoder, @NotNull LicenseServerLicense value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); LicenseServerLicense.write$Self$model_license(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.license.LicenseServerLicense", INSTANCE, 9); pluginGeneratedSerialDescriptor.addElement("licenseId", false); pluginGeneratedSerialDescriptor.addElement("type", false); pluginGeneratedSerialDescriptor.addElement("since", false); pluginGeneratedSerialDescriptor.addElement("till", false); pluginGeneratedSerialDescriptor.addElement("serverUid", false); pluginGeneratedSerialDescriptor.addElement("activeLicensesNumber", false); pluginGeneratedSerialDescriptor.addElement("cancelled", true); pluginGeneratedSerialDescriptor.addElement("suspended", true); pluginGeneratedSerialDescriptor.addElement("outdated", true); pluginGeneratedSerialDescriptor.pushClassAnnotation(
/*    */           
/* 12 */           (Annotation)new LicenseServerLicense$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0(
/* 13 */             "_type")); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/license/LicenseServerLicense$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/license/LicenseServerLicense;", "model-license"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<LicenseServerLicense> serializer() { return (KSerializer<LicenseServerLicense>)LicenseServerLicense.$serializer.INSTANCE; } } @NotNull public LicenseID getLicenseId() { return this.licenseId; } @NotNull
/* 14 */   public LicenseType getType() { return this.type; } @NotNull
/* 15 */   public Timestamp getSince() { return this.since; } @Nullable
/* 16 */   public Timestamp getTill() { return this.till; }
/*    */   
/*    */   @NotNull
/*    */   public final String getServerUid() {
/* 20 */     return this.serverUid;
/*    */   }
/*    */   
/*    */   public final int getActiveLicensesNumber() {
/* 24 */     return this.activeLicensesNumber;
/* 25 */   } public LicenseServerLicense(@NotNull LicenseID licenseId, @NotNull LicenseType type, @NotNull Timestamp since, @Nullable Timestamp till, @NotNull String serverUid, int activeLicensesNumber) { super((DefaultConstructorMarker)null); this.licenseId = licenseId; this.type = type; this.since = since; this.till = till;
/*    */     this.serverUid = serverUid;
/* 27 */     this.activeLicensesNumber = activeLicensesNumber; } public boolean getCancelled() { return this.cancelled; }
/* 28 */   public boolean getSuspended() { return this.suspended; } public boolean getOutdated() {
/* 29 */     return this.outdated;
/*    */   }
/*    */   public boolean getValid() {
/* 32 */     return (super.getValid() && 
/* 33 */       getSince().compareTo(Timestamp.Companion.now()) < 0 && 
/* 34 */       this.activeLicensesNumber > 0);
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
/*    */   @Nullable
/*    */   public final Timestamp component4() {
/*    */     return this.till;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component5() {
/*    */     return this.serverUid;
/*    */   }
/*    */   
/*    */   public final int component6() {
/*    */     return this.activeLicensesNumber;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LicenseServerLicense copy(@NotNull LicenseID licenseId, @NotNull LicenseType type, @NotNull Timestamp since, @Nullable Timestamp till, @NotNull String serverUid, int activeLicensesNumber) {
/*    */     Intrinsics.checkNotNullParameter(licenseId, "licenseId");
/*    */     Intrinsics.checkNotNullParameter(type, "type");
/*    */     Intrinsics.checkNotNullParameter(since, "since");
/*    */     Intrinsics.checkNotNullParameter(serverUid, "serverUid");
/*    */     return new LicenseServerLicense(licenseId, type, since, till, serverUid, activeLicensesNumber);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "LicenseServerLicense(licenseId=" + this.licenseId + ", type=" + this.type + ", since=" + this.since + ", till=" + this.till + ", serverUid=" + this.serverUid + ", activeLicensesNumber=" + this.activeLicensesNumber + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.licenseId.hashCode();
/*    */     result = result * 31 + this.type.hashCode();
/*    */     result = result * 31 + this.since.hashCode();
/*    */     result = result * 31 + ((this.till == null) ? 0 : this.till.hashCode());
/*    */     result = result * 31 + this.serverUid.hashCode();
/*    */     return result * 31 + Integer.hashCode(this.activeLicensesNumber);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LicenseServerLicense))
/*    */       return false; 
/*    */     LicenseServerLicense licenseServerLicense = (LicenseServerLicense)other;
/*    */     return !Intrinsics.areEqual(this.licenseId, licenseServerLicense.licenseId) ? false : (!Intrinsics.areEqual(this.type, licenseServerLicense.type) ? false : (!Intrinsics.areEqual(this.since, licenseServerLicense.since) ? false : (!Intrinsics.areEqual(this.till, licenseServerLicense.till) ? false : (!Intrinsics.areEqual(this.serverUid, licenseServerLicense.serverUid) ? false : (!(this.activeLicensesNumber != licenseServerLicense.activeLicensesNumber))))));
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-license-jvm-0.4.32.jar!\ai\grazie\license\LicenseServerLicense.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */