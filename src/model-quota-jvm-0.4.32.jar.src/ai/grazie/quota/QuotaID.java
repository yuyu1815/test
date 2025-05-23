/*    */ package ai.grazie.quota;@Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\r\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B-\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\031\022\006\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\007¢\006\002\020\013J\t\020\023\032\0020\005HÆ\003J\013\020\024\032\004\030\0010\007HÆ\003J\037\020\025\032\0020\0002\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\007HÆ\001J\023\020\026\032\0020\r2\b\020\027\032\004\030\0010\001HÖ\003J\t\020\030\032\0020\003HÖ\001J\b\020\031\032\0020\007H\026J&\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÁ\001¢\006\002\b!R\021\020\f\032\0020\r8F¢\006\006\032\004\b\f\020\016R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020R\023\020\006\032\004\030\0010\007¢\006\b\n\000\032\004\b\021\020\022¨\006$"}, d2 = {"Lai/grazie/quota/QuotaID;", "", "seen1", "", "quotaId", "Lai/grazie/license/LicenseID;", "userId", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/license/LicenseID;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/license/LicenseID;Ljava/lang/String;)V", "isEnterprise", "", "()Z", "getQuotaId", "()Lai/grazie/license/LicenseID;", "getUserId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_quota", "$serializer", "Companion", "model-quota"})
/*    */ @SourceDebugExtension({"SMAP\nQuotaID.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuotaID.kt\nai/grazie/quota/QuotaID\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,21:1\n1#2:22\n*E\n"})
/*    */ public final class QuotaID { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final LicenseID quotaId;
/*    */   @Nullable
/*    */   private final String userId;
/*    */   
/* 10 */   public QuotaID(@NotNull LicenseID quotaId, @Nullable String userId) { this.quotaId = quotaId;
/* 11 */     this.userId = userId; } @Nullable public final String getUserId() { return this.userId; }
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/quota/QuotaID.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/quota/QuotaID;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-quota"}) public static final class $serializer implements GeneratedSerializer<QuotaID> {
/*    */     @NotNull public static final $serializer INSTANCE = new $serializer();
/*    */     @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); }
/* 15 */     @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)LicenseID.Serializer.INSTANCE; arrayOfKSerializer[1] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public QuotaID deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; LicenseID licenseID = null; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { licenseID = (LicenseID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LicenseID.Serializer.INSTANCE, licenseID); i |= 0x1; str = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: licenseID = (LicenseID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LicenseID.Serializer.INSTANCE, licenseID); i |= 0x1; continue;case 1: str = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new QuotaID(i, licenseID, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull QuotaID value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); QuotaID.write$Self$model_quota(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.quota.QuotaID", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("quotaId", false); pluginGeneratedSerialDescriptor.addElement("userId", true); descriptor = pluginGeneratedSerialDescriptor; } } public final boolean isEnterprise() { return (this.userId != null); }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/quota/QuotaID$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/quota/QuotaID;", "model-quota"}) public static final class Companion {
/*    */     private Companion() {}
/* 18 */     @NotNull public final KSerializer<QuotaID> serializer() { return (KSerializer<QuotaID>)QuotaID.$serializer.INSTANCE; } } @NotNull public final LicenseID getQuotaId() { return this.quotaId; } @NotNull public String toString() { String str = this.userId;
/*    */ 
/*    */ 
/*    */     
/* 22 */     LicenseID licenseID = this.quotaId; int $i$a$-let-QuotaID$toString$1 = 0;
/*    */     return "" + this.quotaId + this.quotaId; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final LicenseID component1() {
/*    */     return this.quotaId;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component2() {
/*    */     return this.userId;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final QuotaID copy(@NotNull LicenseID quotaId, @Nullable String userId) {
/*    */     Intrinsics.checkNotNullParameter(quotaId, "quotaId");
/*    */     return new QuotaID(quotaId, userId);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.quotaId.hashCode();
/*    */     return result * 31 + ((this.userId == null) ? 0 : this.userId.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof QuotaID))
/*    */       return false; 
/*    */     QuotaID quotaID = (QuotaID)other;
/*    */     return !Intrinsics.areEqual(this.quotaId, quotaID.quotaId) ? false : (!!Intrinsics.areEqual(this.userId, quotaID.userId));
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-quota-jvm-0.4.32.jar!\ai\grazie\quota\QuotaID.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */