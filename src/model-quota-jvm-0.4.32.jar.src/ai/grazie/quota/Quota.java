/*    */ package ai.grazie.quota;
/*    */ import ai.grazie.license.LicenseID;
/*    */ import ai.grazie.utils.mpp.money.Credit;
/*    */ import ai.grazie.utils.mpp.time.Timestamp;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000^\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\007\n\002\b\022\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 52\0020\001:\00245BM\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\007\022\b\020\t\032\004\030\0010\n\022\n\b\001\020\013\032\004\030\0010\f\022\b\020\r\032\004\030\0010\016¢\006\002\020\017B1\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\007\022\b\020\t\032\004\030\0010\n\022\b\b\002\020\013\032\0020\f¢\006\002\020\020J\t\020 \032\0020\005HÆ\003J\t\020!\032\0020\007HÆ\003J\t\020\"\032\0020\007HÆ\003J\013\020#\032\004\030\0010\nHÆ\003J\t\020$\032\0020\fHÆ\003J=\020%\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\n\b\002\020\t\032\004\030\0010\n2\b\b\002\020\013\032\0020\fHÆ\001J\023\020&\032\0020'2\b\020(\032\004\030\0010\001HÖ\003J\t\020)\032\0020\003HÖ\001J\t\020*\032\0020+HÖ\001J&\020,\032\0020-2\006\020.\032\0020\0002\006\020/\032\002002\006\0201\032\00202HÁ\001¢\006\002\b3R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\021\020\022R\021\020\023\032\0020\0248F¢\006\006\032\004\b\025\020\026R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\027\020\030R\021\020\b\032\0020\007¢\006\b\n\000\032\004\b\031\020\022R\034\020\013\032\0020\f8\006X\004¢\006\016\n\000\022\004\b\032\020\033\032\004\b\034\020\035R\023\020\t\032\004\030\0010\n¢\006\b\n\000\032\004\b\036\020\037¨\0066"}, d2 = {"Lai/grazie/quota/Quota;", "", "seen1", "", "license", "Lai/grazie/license/LicenseID;", "current", "Lai/grazie/utils/mpp/money/Credit;", "maximum", "until", "Lai/grazie/utils/mpp/time/Timestamp;", "quotaID", "Lai/grazie/quota/QuotaID;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/license/LicenseID;Lai/grazie/utils/mpp/money/Credit;Lai/grazie/utils/mpp/money/Credit;Lai/grazie/utils/mpp/time/Timestamp;Lai/grazie/quota/QuotaID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/license/LicenseID;Lai/grazie/utils/mpp/money/Credit;Lai/grazie/utils/mpp/money/Credit;Lai/grazie/utils/mpp/time/Timestamp;Lai/grazie/quota/QuotaID;)V", "getCurrent", "()Lai/grazie/utils/mpp/money/Credit;", "currentPercents", "", "getCurrentPercents", "()F", "getLicense", "()Lai/grazie/license/LicenseID;", "getMaximum", "getQuotaID$annotations", "()V", "getQuotaID", "()Lai/grazie/quota/QuotaID;", "getUntil", "()Lai/grazie/utils/mpp/time/Timestamp;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_quota", "$serializer", "Companion", "model-quota"}) public final class Quota { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final LicenseID license; @NotNull private final Credit current; @NotNull private final Credit maximum; @Nullable private final Timestamp until; @NotNull private final QuotaID quotaID; @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/quota/Quota.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/quota/Quota;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-quota"}) public static final class $serializer implements GeneratedSerializer<Quota> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[5]; arrayOfKSerializer[0] = (KSerializer)LicenseID.Serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)Credit$.serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)Credit$.serializer.INSTANCE; arrayOfKSerializer[3] = BuiltinSerializersKt.getNullable((KSerializer)Timestamp.Serializer.INSTANCE); arrayOfKSerializer[4] = (KSerializer)QuotaID.$serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public Quota deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; LicenseID licenseID = null; Credit credit1 = null, credit2 = null; Timestamp timestamp = null; QuotaID quotaID = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) {
/*    */         licenseID = (LicenseID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LicenseID.Serializer.INSTANCE, licenseID); i |= 0x1; credit1 = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit1); i |= 0x2; credit2 = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit2); i |= 0x4; timestamp = (Timestamp)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp); i |= 0x8; quotaID = (QuotaID)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)QuotaID.$serializer.INSTANCE, quotaID); i |= 0x10;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) {
/*    */             case -1:
/*    */               bool = false; continue;
/*    */             case 0:
/*    */               licenseID = (LicenseID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LicenseID.Serializer.INSTANCE, licenseID); i |= 0x1; continue;
/*    */             case 1:
/*    */               credit1 = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit1); i |= 0x2; continue;
/*    */             case 2:
/*    */               credit2 = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit2); i |= 0x4; continue;
/*    */             case 3:
/*    */               timestamp = (Timestamp)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp); i |= 0x8; continue;
/*    */             case 4:
/*    */               quotaID = (QuotaID)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)QuotaID.$serializer.INSTANCE, quotaID); i |= 0x10; continue;
/*    */           }  throw new UnknownFieldException(j);
/*    */         } 
/*    */       }  compositeDecoder.endStructure(serialDescriptor); return new Quota(i, licenseID, credit1, credit2, timestamp, quotaID, null); } public void serialize(@NotNull Encoder encoder, @NotNull Quota value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Quota.write$Self$model_quota(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.quota.Quota", INSTANCE, 5); pluginGeneratedSerialDescriptor.addElement("license", false); pluginGeneratedSerialDescriptor.addElement("current", false); pluginGeneratedSerialDescriptor.addElement("maximum", false); pluginGeneratedSerialDescriptor.addElement("until", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("quotaID", true);
/* 29 */       descriptor = pluginGeneratedSerialDescriptor; } } public Quota(@NotNull LicenseID license, @NotNull Credit current, @NotNull Credit maximum, @Nullable Timestamp until, @NotNull QuotaID quotaID) { this.license = license;
/* 30 */     this.current = current;
/* 31 */     this.maximum = maximum;
/* 32 */     this.until = until;
/* 33 */     this.quotaID = quotaID; } @NotNull
/* 34 */   public final QuotaID getQuotaID() { return this.quotaID; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/quota/Quota$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/quota/Quota;", "model-quota"}) public static final class Companion {
/*    */     private Companion() {} @NotNull public final KSerializer<Quota> serializer() { return (KSerializer<Quota>)Quota.$serializer.INSTANCE; } }
/*    */   @NotNull public final LicenseID getLicense() { return this.license; }
/*    */   @NotNull public final Credit getCurrent() { return this.current; }
/*    */   @NotNull public final Credit getMaximum() { return this.maximum; }
/*    */   @Nullable
/*    */   public final Timestamp getUntil() { return this.until; }
/* 41 */   public final float getCurrentPercents() { return RangesKt.coerceIn(this.current.getAmount().asFloat() / this.maximum.getAmount().asFloat() * 100.0F, 0.0F, 100.0F); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final LicenseID component1() {
/*    */     return this.license;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Credit component2() {
/*    */     return this.current;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Credit component3() {
/*    */     return this.maximum;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Timestamp component4() {
/*    */     return this.until;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final QuotaID component5() {
/*    */     return this.quotaID;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Quota copy(@NotNull LicenseID license, @NotNull Credit current, @NotNull Credit maximum, @Nullable Timestamp until, @NotNull QuotaID quotaID) {
/*    */     Intrinsics.checkNotNullParameter(license, "license");
/*    */     Intrinsics.checkNotNullParameter(current, "current");
/*    */     Intrinsics.checkNotNullParameter(maximum, "maximum");
/*    */     Intrinsics.checkNotNullParameter(quotaID, "quotaID");
/*    */     return new Quota(license, current, maximum, until, quotaID);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Quota(license=" + this.license + ", current=" + this.current + ", maximum=" + this.maximum + ", until=" + this.until + ", quotaID=" + this.quotaID + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.license.hashCode();
/*    */     result = result * 31 + this.current.hashCode();
/*    */     result = result * 31 + this.maximum.hashCode();
/*    */     result = result * 31 + ((this.until == null) ? 0 : this.until.hashCode());
/*    */     return result * 31 + this.quotaID.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Quota))
/*    */       return false; 
/*    */     Quota quota = (Quota)other;
/*    */     return !Intrinsics.areEqual(this.license, quota.license) ? false : (!Intrinsics.areEqual(this.current, quota.current) ? false : (!Intrinsics.areEqual(this.maximum, quota.maximum) ? false : (!Intrinsics.areEqual(this.until, quota.until) ? false : (!!Intrinsics.areEqual(this.quotaID, quota.quotaID)))));
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-quota-jvm-0.4.32.jar!\ai\grazie\quota\Quota.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */