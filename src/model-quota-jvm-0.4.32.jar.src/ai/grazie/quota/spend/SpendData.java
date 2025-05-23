/*    */ package ai.grazie.quota.spend;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b!\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 >2\0020\001:\002=>By\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\b\022\b\020\t\032\004\030\0010\n\022\b\020\013\032\004\030\0010\005\022\006\020\f\032\0020\r\022\006\020\016\032\0020\r\022\b\020\017\032\004\030\0010\005\022\b\020\020\032\004\030\0010\005\022\b\020\021\032\004\030\0010\022\022\b\020\023\032\004\030\0010\024¢\006\002\020\025Ba\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n\022\006\020\013\032\0020\005\022\006\020\f\032\0020\r\022\b\b\002\020\016\032\0020\r\022\n\b\002\020\017\032\004\030\0010\005\022\n\b\002\020\020\032\004\030\0010\005\022\b\b\002\020\021\032\0020\022¢\006\002\020\026J\t\020&\032\0020\005HÆ\003J\t\020'\032\0020\022HÆ\003J\t\020(\032\0020\005HÆ\003J\t\020)\032\0020\bHÆ\003J\t\020*\032\0020\nHÆ\003J\t\020+\032\0020\005HÆ\003J\t\020,\032\0020\rHÆ\003J\t\020-\032\0020\rHÆ\003J\013\020.\032\004\030\0010\005HÆ\003J\013\020/\032\004\030\0010\005HÆ\003Jq\0200\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\0052\b\b\002\020\f\032\0020\r2\b\b\002\020\016\032\0020\r2\n\b\002\020\017\032\004\030\0010\0052\n\b\002\020\020\032\004\030\0010\0052\b\b\002\020\021\032\0020\022HÆ\001J\023\0201\032\0020\r2\b\0202\032\004\030\0010\001HÖ\003J\t\0203\032\0020\003HÖ\001J\t\0204\032\0020\005HÖ\001J&\0205\032\002062\006\0207\032\0020\0002\006\0208\032\002092\006\020:\032\0020;HÁ\001¢\006\002\b<R\021\020\021\032\0020\022¢\006\b\n\000\032\004\b\027\020\030R\023\020\017\032\004\030\0010\005¢\006\b\n\000\032\004\b\031\020\032R\023\020\020\032\004\030\0010\005¢\006\b\n\000\032\004\b\033\020\032R\021\020\013\032\0020\005¢\006\b\n\000\032\004\b\034\020\032R\021\020\f\032\0020\r¢\006\b\n\000\032\004\b\035\020\036R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\037\020\032R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b \020\032R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b!\020\"R\021\020\016\032\0020\r¢\006\b\n\000\032\004\b#\020\036R\021\020\t\032\0020\n¢\006\b\n\000\032\004\b$\020%¨\006?"}, d2 = {"Lai/grazie/quota/spend/SpendData;", "", "seen1", "", "serviceName", "", "serviceType", "spend", "Lai/grazie/utils/mpp/money/Credit;", "spendType", "Lai/grazie/quota/spend/SpendType;", "featureId", "reservedCapacity", "", "spendIfExceeded", "cloudProvider", "cloudRegion", "additionalData", "Lkotlinx/serialization/json/JsonObject;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lai/grazie/utils/mpp/money/Credit;Lai/grazie/quota/spend/SpendType;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/utils/mpp/money/Credit;Lai/grazie/quota/spend/SpendType;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "getAdditionalData", "()Lkotlinx/serialization/json/JsonObject;", "getCloudProvider", "()Ljava/lang/String;", "getCloudRegion", "getFeatureId", "getReservedCapacity", "()Z", "getServiceName", "getServiceType", "getSpend", "()Lai/grazie/utils/mpp/money/Credit;", "getSpendIfExceeded", "getSpendType", "()Lai/grazie/quota/spend/SpendType;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_quota", "$serializer", "Companion", "model-quota"})
/*    */ public final class SpendData {
/*    */   @NotNull
/* 10 */   public static final Companion Companion = new Companion(null); @NotNull private final String serviceName; @NotNull private final String serviceType; @NotNull private final Credit spend; @NotNull private final SpendType spendType; @NotNull private final String featureId; private final boolean reservedCapacity; private final boolean spendIfExceeded; @Nullable
/*    */   private final String cloudProvider; @Nullable
/*    */   private final String cloudRegion; @NotNull
/*    */   private final JsonObject additionalData; @JvmField
/*    */   @NotNull
/* 15 */   private static final KSerializer<Object>[] $childSerializers; public SpendData(@NotNull String serviceName, @NotNull String serviceType, @NotNull Credit spend, @NotNull SpendType spendType, @NotNull String featureId, boolean reservedCapacity, boolean spendIfExceeded, @Nullable String cloudProvider, @Nullable String cloudRegion, @NotNull JsonObject additionalData) { this.serviceName = serviceName;
/*    */ 
/*    */ 
/*    */     
/* 19 */     this.serviceType = serviceType;
/*    */ 
/*    */ 
/*    */     
/* 23 */     this.spend = spend;
/*    */ 
/*    */ 
/*    */     
/* 27 */     this.spendType = spendType;
/*    */ 
/*    */ 
/*    */     
/* 31 */     this.featureId = featureId;
/*    */ 
/*    */ 
/*    */     
/* 35 */     this.reservedCapacity = reservedCapacity;
/*    */ 
/*    */ 
/*    */     
/* 39 */     this.spendIfExceeded = spendIfExceeded;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 45 */     this.cloudProvider = cloudProvider;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 52 */     this.cloudRegion = cloudRegion;
/*    */ 
/*    */ 
/*    */     
/* 56 */     this.additionalData = additionalData; } static { KSerializer[] arrayOfKSerializer = new KSerializer[10]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = SpendType.Companion.serializer(); arrayOfKSerializer[4] = null; arrayOfKSerializer[5] = null; arrayOfKSerializer[6] = null; arrayOfKSerializer[7] = null; arrayOfKSerializer[8] = null; arrayOfKSerializer[9] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @NotNull public final JsonObject getAdditionalData() { return this.additionalData; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/quota/spend/SpendData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/quota/spend/SpendData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-quota"})
/*    */   public static final class $serializer implements GeneratedSerializer<SpendData> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])SpendData.$childSerializers, arrayOfKSerializer2 = new KSerializer[10];
/*    */       arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[2] = (KSerializer)Credit$.serializer.INSTANCE;
/*    */       arrayOfKSerializer2[3] = arrayOfKSerializer1[3];
/*    */       arrayOfKSerializer2[4] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[5] = (KSerializer)BooleanSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[6] = (KSerializer)BooleanSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[7] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer2[8] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer2[9] = (KSerializer)JsonObjectSerializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SpendData deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str1 = null, str2 = null;
/*    */       Credit credit = null;
/*    */       SpendType spendType = null;
/*    */       String str3 = null;
/*    */       boolean bool1 = false, bool2 = false;
/*    */       String str4 = null, str5 = null;
/*    */       JsonObject jsonObject = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])SpendData.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */         credit = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit);
/*    */         i |= 0x4;
/*    */         spendType = (SpendType)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], spendType);
/*    */         i |= 0x8;
/*    */         str3 = compositeDecoder.decodeStringElement(serialDescriptor, 4);
/*    */         i |= 0x10;
/*    */         bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 5);
/*    */         i |= 0x20;
/*    */         bool2 = compositeDecoder.decodeBooleanElement(serialDescriptor, 6);
/*    */         i |= 0x40;
/*    */         str4 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 7, (DeserializationStrategy)StringSerializer.INSTANCE, str4);
/*    */         i |= 0x80;
/*    */         str5 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 8, (DeserializationStrategy)StringSerializer.INSTANCE, str5);
/*    */         i |= 0x100;
/*    */         jsonObject = (JsonObject)compositeDecoder.decodeSerializableElement(serialDescriptor, 9, (DeserializationStrategy)JsonObjectSerializer.INSTANCE, jsonObject);
/*    */         i |= 0x200;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               credit = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               spendType = (SpendType)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], spendType);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               str3 = compositeDecoder.decodeStringElement(serialDescriptor, 4);
/*    */               i |= 0x10;
/*    */               continue;
/*    */             case 5:
/*    */               bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 5);
/*    */               i |= 0x20;
/*    */               continue;
/*    */             case 6:
/*    */               bool2 = compositeDecoder.decodeBooleanElement(serialDescriptor, 6);
/*    */               i |= 0x40;
/*    */               continue;
/*    */             case 7:
/*    */               str4 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 7, (DeserializationStrategy)StringSerializer.INSTANCE, str4);
/*    */               i |= 0x80;
/*    */               continue;
/*    */             case 8:
/*    */               str5 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 8, (DeserializationStrategy)StringSerializer.INSTANCE, str5);
/*    */               i |= 0x100;
/*    */               continue;
/*    */             case 9:
/*    */               jsonObject = (JsonObject)compositeDecoder.decodeSerializableElement(serialDescriptor, 9, (DeserializationStrategy)JsonObjectSerializer.INSTANCE, jsonObject);
/*    */               i |= 0x200;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new SpendData(i, str1, str2, credit, spendType, str3, bool1, bool2, str4, str5, jsonObject, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull SpendData value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       SpendData.write$Self$model_quota(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.quota.spend.SpendData", INSTANCE, 10);
/*    */       pluginGeneratedSerialDescriptor.addElement("serviceName", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("serviceType", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("spend", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("spendType", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("featureId", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("reservedCapacity", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("spendIfExceeded", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("cloudProvider", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("cloudRegion", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("additionalData", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/quota/spend/SpendData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/quota/spend/SpendData;", "model-quota"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<SpendData> serializer() {
/*    */       return (KSerializer<SpendData>)SpendData.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getServiceName() {
/*    */     return this.serviceName;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getServiceType() {
/*    */     return this.serviceType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Credit getSpend() {
/*    */     return this.spend;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SpendType getSpendType() {
/*    */     return this.spendType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getFeatureId() {
/*    */     return this.featureId;
/*    */   }
/*    */   
/*    */   public final boolean getReservedCapacity() {
/*    */     return this.reservedCapacity;
/*    */   }
/*    */   
/*    */   public final boolean getSpendIfExceeded() {
/*    */     return this.spendIfExceeded;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getCloudProvider() {
/*    */     return this.cloudProvider;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getCloudRegion() {
/*    */     return this.cloudRegion;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.serviceName;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.serviceType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Credit component3() {
/*    */     return this.spend;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SpendType component4() {
/*    */     return this.spendType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component5() {
/*    */     return this.featureId;
/*    */   }
/*    */   
/*    */   public final boolean component6() {
/*    */     return this.reservedCapacity;
/*    */   }
/*    */   
/*    */   public final boolean component7() {
/*    */     return this.spendIfExceeded;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component8() {
/*    */     return this.cloudProvider;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component9() {
/*    */     return this.cloudRegion;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final JsonObject component10() {
/*    */     return this.additionalData;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SpendData copy(@NotNull String serviceName, @NotNull String serviceType, @NotNull Credit spend, @NotNull SpendType spendType, @NotNull String featureId, boolean reservedCapacity, boolean spendIfExceeded, @Nullable String cloudProvider, @Nullable String cloudRegion, @NotNull JsonObject additionalData) {
/*    */     Intrinsics.checkNotNullParameter(serviceName, "serviceName");
/*    */     Intrinsics.checkNotNullParameter(serviceType, "serviceType");
/*    */     Intrinsics.checkNotNullParameter(spend, "spend");
/*    */     Intrinsics.checkNotNullParameter(spendType, "spendType");
/*    */     Intrinsics.checkNotNullParameter(featureId, "featureId");
/*    */     Intrinsics.checkNotNullParameter(additionalData, "additionalData");
/*    */     return new SpendData(serviceName, serviceType, spend, spendType, featureId, reservedCapacity, spendIfExceeded, cloudProvider, cloudRegion, additionalData);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SpendData(serviceName=" + this.serviceName + ", serviceType=" + this.serviceType + ", spend=" + this.spend + ", spendType=" + this.spendType + ", featureId=" + this.featureId + ", reservedCapacity=" + this.reservedCapacity + ", spendIfExceeded=" + this.spendIfExceeded + ", cloudProvider=" + this.cloudProvider + ", cloudRegion=" + this.cloudRegion + ", additionalData=" + this.additionalData + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.serviceName.hashCode();
/*    */     result = result * 31 + this.serviceType.hashCode();
/*    */     result = result * 31 + this.spend.hashCode();
/*    */     result = result * 31 + this.spendType.hashCode();
/*    */     result = result * 31 + this.featureId.hashCode();
/*    */     result = result * 31 + Boolean.hashCode(this.reservedCapacity);
/*    */     result = result * 31 + Boolean.hashCode(this.spendIfExceeded);
/*    */     result = result * 31 + ((this.cloudProvider == null) ? 0 : this.cloudProvider.hashCode());
/*    */     result = result * 31 + ((this.cloudRegion == null) ? 0 : this.cloudRegion.hashCode());
/*    */     return result * 31 + this.additionalData.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SpendData))
/*    */       return false; 
/*    */     SpendData spendData = (SpendData)other;
/*    */     return !Intrinsics.areEqual(this.serviceName, spendData.serviceName) ? false : (!Intrinsics.areEqual(this.serviceType, spendData.serviceType) ? false : (!Intrinsics.areEqual(this.spend, spendData.spend) ? false : ((this.spendType != spendData.spendType) ? false : (!Intrinsics.areEqual(this.featureId, spendData.featureId) ? false : ((this.reservedCapacity != spendData.reservedCapacity) ? false : ((this.spendIfExceeded != spendData.spendIfExceeded) ? false : (!Intrinsics.areEqual(this.cloudProvider, spendData.cloudProvider) ? false : (!Intrinsics.areEqual(this.cloudRegion, spendData.cloudRegion) ? false : (!!Intrinsics.areEqual(this.additionalData, spendData.additionalData))))))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-quota-jvm-0.4.32.jar!\ai\grazie\quota\spend\SpendData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */