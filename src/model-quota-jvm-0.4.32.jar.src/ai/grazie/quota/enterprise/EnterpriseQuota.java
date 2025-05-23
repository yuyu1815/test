/*    */ package ai.grazie.quota.enterprise;
/*    */ 
/*    */ import ai.grazie.utils.mpp.money.Credit;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\026\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 32\0020\001:\00223BU\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\007\022\b\020\t\032\004\030\0010\n\022\b\020\013\032\004\030\0010\007\022\b\020\f\032\004\030\0010\003\022\b\020\r\032\004\030\0010\016¢\006\002\020\017B;\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\b\020\b\032\004\030\0010\007\022\b\020\t\032\004\030\0010\n\022\006\020\013\032\0020\007\022\b\020\f\032\004\030\0010\003¢\006\002\020\020J\t\020\034\032\0020\005HÆ\003J\t\020\035\032\0020\007HÆ\003J\013\020\036\032\004\030\0010\007HÆ\003J\013\020\037\032\004\030\0010\nHÆ\003J\t\020 \032\0020\007HÆ\003J\020\020!\032\004\030\0010\003HÆ\003¢\006\002\020\032JP\020\"\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\n\b\002\020\b\032\004\030\0010\0072\n\b\002\020\t\032\004\030\0010\n2\b\b\002\020\013\032\0020\0072\n\b\002\020\f\032\004\030\0010\003HÆ\001¢\006\002\020#J\023\020$\032\0020%2\b\020&\032\004\030\0010\001HÖ\003J\t\020'\032\0020\003HÖ\001J\t\020(\032\0020)HÖ\001J&\020*\032\0020+2\006\020,\032\0020\0002\006\020-\032\0020.2\006\020/\032\00200HÁ\001¢\006\002\b1R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\021\020\022R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\023\020\024R\023\020\b\032\004\030\0010\007¢\006\b\n\000\032\004\b\025\020\022R\021\020\013\032\0020\007¢\006\b\n\000\032\004\b\026\020\022R\023\020\t\032\004\030\0010\n¢\006\b\n\000\032\004\b\027\020\030R\025\020\f\032\004\030\0010\003¢\006\n\n\002\020\033\032\004\b\031\020\032¨\0064"}, d2 = {"Lai/grazie/quota/enterprise/EnterpriseQuota;", "", "seen1", "", "id", "Lai/grazie/license/LicenseID;", "current", "Lai/grazie/utils/mpp/money/Credit;", "maximum", "until", "Lai/grazie/utils/mpp/time/Timestamp;", "maximumPerUser", "userCount", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/license/LicenseID;Lai/grazie/utils/mpp/money/Credit;Lai/grazie/utils/mpp/money/Credit;Lai/grazie/utils/mpp/time/Timestamp;Lai/grazie/utils/mpp/money/Credit;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/license/LicenseID;Lai/grazie/utils/mpp/money/Credit;Lai/grazie/utils/mpp/money/Credit;Lai/grazie/utils/mpp/time/Timestamp;Lai/grazie/utils/mpp/money/Credit;Ljava/lang/Integer;)V", "getCurrent", "()Lai/grazie/utils/mpp/money/Credit;", "getId", "()Lai/grazie/license/LicenseID;", "getMaximum", "getMaximumPerUser", "getUntil", "()Lai/grazie/utils/mpp/time/Timestamp;", "getUserCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lai/grazie/license/LicenseID;Lai/grazie/utils/mpp/money/Credit;Lai/grazie/utils/mpp/money/Credit;Lai/grazie/utils/mpp/time/Timestamp;Lai/grazie/utils/mpp/money/Credit;Ljava/lang/Integer;)Lai/grazie/quota/enterprise/EnterpriseQuota;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_quota", "$serializer", "Companion", "model-quota"})
/*    */ public final class EnterpriseQuota {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final LicenseID id;
/*    */   @NotNull
/*    */   private final Credit current;
/*    */   
/* 15 */   public EnterpriseQuota(@NotNull LicenseID id, @NotNull Credit current, @Nullable Credit maximum, @Nullable Timestamp until, @NotNull Credit maximumPerUser, @Nullable Integer userCount) { this.id = id;
/*    */ 
/*    */ 
/*    */     
/* 19 */     this.current = current;
/*    */ 
/*    */ 
/*    */     
/* 23 */     this.maximum = maximum;
/*    */ 
/*    */ 
/*    */     
/* 27 */     this.until = until;
/*    */ 
/*    */ 
/*    */     
/* 31 */     this.maximumPerUser = maximumPerUser;
/*    */ 
/*    */ 
/*    */     
/* 35 */     this.userCount = userCount; } @Nullable private final Credit maximum; @Nullable private final Timestamp until; @NotNull private final Credit maximumPerUser; @Nullable private final Integer userCount; @Nullable public final Integer getUserCount() { return this.userCount; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/quota/enterprise/EnterpriseQuota.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/quota/enterprise/EnterpriseQuota;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-quota"})
/*    */   public static final class $serializer implements GeneratedSerializer<EnterpriseQuota> {
/*    */     @NotNull
/*    */     public static final $serializer INSTANCE = new $serializer();
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] typeParametersSerializers() {
/*    */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/*    */       return (SerialDescriptor)descriptor;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] childSerializers() {
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[6];
/*    */       arrayOfKSerializer[0] = (KSerializer)LicenseID.Serializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)Credit$.serializer.INSTANCE;
/*    */       arrayOfKSerializer[2] = BuiltinSerializersKt.getNullable((KSerializer)Credit$.serializer.INSTANCE);
/*    */       arrayOfKSerializer[3] = BuiltinSerializersKt.getNullable((KSerializer)Timestamp.Serializer.INSTANCE);
/*    */       arrayOfKSerializer[4] = (KSerializer)Credit$.serializer.INSTANCE;
/*    */       arrayOfKSerializer[5] = BuiltinSerializersKt.getNullable((KSerializer)IntSerializer.INSTANCE);
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public EnterpriseQuota deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       LicenseID licenseID = null;
/*    */       Credit credit1 = null, credit2 = null;
/*    */       Timestamp timestamp = null;
/*    */       Credit credit3 = null;
/*    */       Integer integer = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         licenseID = (LicenseID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LicenseID.Serializer.INSTANCE, licenseID);
/*    */         i |= 0x1;
/*    */         credit1 = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit1);
/*    */         i |= 0x2;
/*    */         credit2 = (Credit)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit2);
/*    */         i |= 0x4;
/*    */         timestamp = (Timestamp)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp);
/*    */         i |= 0x8;
/*    */         credit3 = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit3);
/*    */         i |= 0x10;
/*    */         integer = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy)IntSerializer.INSTANCE, integer);
/*    */         i |= 0x20;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               licenseID = (LicenseID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LicenseID.Serializer.INSTANCE, licenseID);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               credit1 = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit1);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               credit2 = (Credit)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               timestamp = (Timestamp)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               credit3 = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit3);
/*    */               i |= 0x10;
/*    */               continue;
/*    */             case 5:
/*    */               integer = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy)IntSerializer.INSTANCE, integer);
/*    */               i |= 0x20;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new EnterpriseQuota(i, licenseID, credit1, credit2, timestamp, credit3, integer, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull EnterpriseQuota value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       EnterpriseQuota.write$Self$model_quota(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.quota.enterprise.EnterpriseQuota", INSTANCE, 6);
/*    */       pluginGeneratedSerialDescriptor.addElement("id", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("current", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("maximum", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("until", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("maximumPerUser", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("userCount", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/quota/enterprise/EnterpriseQuota$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/quota/enterprise/EnterpriseQuota;", "model-quota"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<EnterpriseQuota> serializer() {
/*    */       return (KSerializer<EnterpriseQuota>)EnterpriseQuota.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LicenseID getId() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Credit getCurrent() {
/*    */     return this.current;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Credit getMaximum() {
/*    */     return this.maximum;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Timestamp getUntil() {
/*    */     return this.until;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Credit getMaximumPerUser() {
/*    */     return this.maximumPerUser;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LicenseID component1() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Credit component2() {
/*    */     return this.current;
/*    */   }
/*    */   
/*    */   @Nullable
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
/*    */   public final Credit component5() {
/*    */     return this.maximumPerUser;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Integer component6() {
/*    */     return this.userCount;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final EnterpriseQuota copy(@NotNull LicenseID id, @NotNull Credit current, @Nullable Credit maximum, @Nullable Timestamp until, @NotNull Credit maximumPerUser, @Nullable Integer userCount) {
/*    */     Intrinsics.checkNotNullParameter(id, "id");
/*    */     Intrinsics.checkNotNullParameter(current, "current");
/*    */     Intrinsics.checkNotNullParameter(maximumPerUser, "maximumPerUser");
/*    */     return new EnterpriseQuota(id, current, maximum, until, maximumPerUser, userCount);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "EnterpriseQuota(id=" + this.id + ", current=" + this.current + ", maximum=" + this.maximum + ", until=" + this.until + ", maximumPerUser=" + this.maximumPerUser + ", userCount=" + this.userCount + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.id.hashCode();
/*    */     result = result * 31 + this.current.hashCode();
/*    */     result = result * 31 + ((this.maximum == null) ? 0 : this.maximum.hashCode());
/*    */     result = result * 31 + ((this.until == null) ? 0 : this.until.hashCode());
/*    */     result = result * 31 + this.maximumPerUser.hashCode();
/*    */     return result * 31 + ((this.userCount == null) ? 0 : this.userCount.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof EnterpriseQuota))
/*    */       return false; 
/*    */     EnterpriseQuota enterpriseQuota = (EnterpriseQuota)other;
/*    */     return !Intrinsics.areEqual(this.id, enterpriseQuota.id) ? false : (!Intrinsics.areEqual(this.current, enterpriseQuota.current) ? false : (!Intrinsics.areEqual(this.maximum, enterpriseQuota.maximum) ? false : (!Intrinsics.areEqual(this.until, enterpriseQuota.until) ? false : (!Intrinsics.areEqual(this.maximumPerUser, enterpriseQuota.maximumPerUser) ? false : (!!Intrinsics.areEqual(this.userCount, enterpriseQuota.userCount))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-quota-jvm-0.4.32.jar!\ai\grazie\quota\enterprise\EnterpriseQuota.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */