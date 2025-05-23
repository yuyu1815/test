/*   */ package ai.grazie.quota.statistic;@Serializable
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\013\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B7\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\005\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\035\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\005¢\006\002\020\013J\t\020\020\032\0020\005HÆ\003J\t\020\021\032\0020\005HÆ\003J\t\020\022\032\0020\005HÆ\003J'\020\023\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\005HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\001HÖ\003J\t\020\027\032\0020\003HÖ\001J\t\020\030\032\0020\031HÖ\001J&\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÁ\001¢\006\002\b!R\021\020\007\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\016\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\r¨\006$"}, d2 = {"Lai/grazie/quota/statistic/CreditStatistic;", "", "seen1", "", "total", "Lai/grazie/utils/mpp/money/Credit;", "spent", "free", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/utils/mpp/money/Credit;Lai/grazie/utils/mpp/money/Credit;Lai/grazie/utils/mpp/money/Credit;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/utils/mpp/money/Credit;Lai/grazie/utils/mpp/money/Credit;Lai/grazie/utils/mpp/money/Credit;)V", "getFree", "()Lai/grazie/utils/mpp/money/Credit;", "getSpent", "getTotal", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_quota", "$serializer", "Companion", "model-quota"})
/*   */ public final class CreditStatistic { @NotNull
/*   */   public static final Companion Companion = new Companion(null); @NotNull
/*   */   private final Credit total; @NotNull
/*   */   private final Credit spent; @NotNull
/*   */   private final Credit free;
/*   */   
/* 9 */   public CreditStatistic(@NotNull Credit total, @NotNull Credit spent, @NotNull Credit free) { this.total = total; this.spent = spent; this.free = free; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/quota/statistic/CreditStatistic.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/quota/statistic/CreditStatistic;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-quota"}) public static final class $serializer implements GeneratedSerializer<CreditStatistic> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = (KSerializer)Credit$.serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)Credit$.serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)Credit$.serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public CreditStatistic deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; Credit credit1 = null, credit2 = null, credit3 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { credit1 = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit1); i |= 0x1; credit2 = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit2); i |= 0x2; credit3 = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit3); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: credit1 = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit1); i |= 0x1; continue;case 1: credit2 = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit2); i |= 0x2; continue;case 2: credit3 = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit3); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new CreditStatistic(i, credit1, credit2, credit3, null); } public void serialize(@NotNull Encoder encoder, @NotNull CreditStatistic value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); CreditStatistic.write$Self$model_quota(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.quota.statistic.CreditStatistic", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("total", false); pluginGeneratedSerialDescriptor.addElement("spent", false); pluginGeneratedSerialDescriptor.addElement("free", false); descriptor = pluginGeneratedSerialDescriptor; } } @NotNull public final Credit getTotal() { return this.total; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/quota/statistic/CreditStatistic$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/quota/statistic/CreditStatistic;", "model-quota"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<CreditStatistic> serializer() { return (KSerializer<CreditStatistic>)CreditStatistic.$serializer.INSTANCE; } } @NotNull public final Credit getSpent() { return this.spent; } @NotNull public final Credit getFree() { return this.free; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   public final Credit component1() {
/*   */     return this.total;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final Credit component2() {
/*   */     return this.spent;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final Credit component3() {
/*   */     return this.free;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final CreditStatistic copy(@NotNull Credit total, @NotNull Credit spent, @NotNull Credit free) {
/*   */     Intrinsics.checkNotNullParameter(total, "total");
/*   */     Intrinsics.checkNotNullParameter(spent, "spent");
/*   */     Intrinsics.checkNotNullParameter(free, "free");
/*   */     return new CreditStatistic(total, spent, free);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "CreditStatistic(total=" + this.total + ", spent=" + this.spent + ", free=" + this.free + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     result = this.total.hashCode();
/*   */     result = result * 31 + this.spent.hashCode();
/*   */     return result * 31 + this.free.hashCode();
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof CreditStatistic))
/*   */       return false; 
/*   */     CreditStatistic creditStatistic = (CreditStatistic)other;
/*   */     return !Intrinsics.areEqual(this.total, creditStatistic.total) ? false : (!Intrinsics.areEqual(this.spent, creditStatistic.spent) ? false : (!!Intrinsics.areEqual(this.free, creditStatistic.free)));
/*   */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-quota-jvm-0.4.32.jar!\ai\grazie\quota\statistic\CreditStatistic.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */