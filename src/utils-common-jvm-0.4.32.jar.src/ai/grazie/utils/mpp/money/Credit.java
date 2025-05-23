/*    */ package ai.grazie.utils.mpp.money;@Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\\\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\006\n\000\n\002\020\007\n\000\n\002\020\b\n\000\n\002\020\t\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 +2\b\022\004\022\0020\0000\001:\002*+B\017\b\027\022\006\020\002\032\0020\003¢\006\002\020\004B\017\b\027\022\006\020\002\032\0020\005¢\006\002\020\006B\017\b\027\022\006\020\002\032\0020\007¢\006\002\020\bB\017\b\027\022\006\020\002\032\0020\t¢\006\002\020\nB\017\b\027\022\006\020\002\032\0020\013¢\006\002\020\fB#\b\021\022\006\020\r\032\0020\t\022\b\020\016\032\004\030\0010\017\022\b\020\020\032\004\030\0010\021¢\006\002\020\022B\r\022\006\020\016\032\0020\017¢\006\002\020\023J\t\020\031\032\0020\017HÆ\003J\023\020\032\032\0020\0002\b\b\002\020\016\032\0020\017HÆ\001J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\036HÖ\003J\t\020\037\032\0020\tHÖ\001J\020\020 \032\0020\0002\006\020\016\032\0020\017H\024J\b\020!\032\0020\003H\026J&\020\"\032\0020#2\006\020$\032\0020\0002\006\020%\032\0020&2\006\020'\032\0020(HÁ\001¢\006\002\b)R\024\020\016\032\0020\017X\004¢\006\b\n\000\032\004\b\024\020\025R\024\020\026\032\0020\0008VX\004¢\006\006\032\004\b\027\020\030¨\006,"}, d2 = {"Lai/grazie/utils/mpp/money/Credit;", "Lai/grazie/utils/mpp/money/Money;", "value", "", "(Ljava/lang/String;)V", "", "(D)V", "", "(F)V", "", "(I)V", "", "(J)V", "seen1", "amount", "Lai/grazie/utils/mpp/number/FixedPrecisionFloat;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/utils/mpp/number/FixedPrecisionFloat;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/utils/mpp/number/FixedPrecisionFloat;)V", "getAmount", "()Lai/grazie/utils/mpp/number/FixedPrecisionFloat;", "zero", "getZero", "()Lai/grazie/utils/mpp/money/Credit;", "component1", "copy", "equals", "", "other", "", "hashCode", "instantiate", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$utils_common", "$serializer", "Companion", "utils-common"})
/*    */ public final class Credit extends Money<Credit> {
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/utils/mpp/money/Credit.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/utils/mpp/money/Credit;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"})
/*    */   public static final class $serializer implements GeneratedSerializer<Credit> {
/*    */     @NotNull
/*  8 */     public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)FixedPrecisionFloat.Serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public Credit deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; FixedPrecisionFloat fixedPrecisionFloat = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { fixedPrecisionFloat = (FixedPrecisionFloat)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)FixedPrecisionFloat.Serializer.INSTANCE, fixedPrecisionFloat); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: fixedPrecisionFloat = (FixedPrecisionFloat)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)FixedPrecisionFloat.Serializer.INSTANCE, fixedPrecisionFloat); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new Credit(i, fixedPrecisionFloat, null); } public void serialize(@NotNull Encoder encoder, @NotNull Credit value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Credit.write$Self$utils_common(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.utils.mpp.money.Credit", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("amount", false); descriptor = pluginGeneratedSerialDescriptor; }
/*    */   
/* 10 */   } public Credit(@NotNull FixedPrecisionFloat amount) { super(null); this.amount = amount; } @NotNull public FixedPrecisionFloat getAmount() { return this.amount; } @NotNull
/* 11 */   protected Credit instantiate(@NotNull FixedPrecisionFloat amount) { Intrinsics.checkNotNullParameter(amount, "amount"); return new Credit(amount); }
/*    */    @NotNull
/*    */   public Credit getZero() {
/* 14 */     return ZERO;
/*    */   }
/*    */   public Credit(@NotNull String value) {
/* 17 */     this(new FixedPrecisionFloat(value));
/*    */   }
/*    */   public Credit(double value) {
/* 20 */     this(new FixedPrecisionFloat(value));
/*    */   }
/*    */   public Credit(float value) {
/* 23 */     this(new FixedPrecisionFloat(value));
/*    */   }
/*    */   public Credit(int value) {
/* 26 */     this(new FixedPrecisionFloat(value));
/*    */   }
/*    */   
/* 29 */   public Credit(long value) { this(new FixedPrecisionFloat(value)); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\n\032\0020\0072\006\020\013\032\0020\fH\002J\017\020\r\032\b\022\004\022\0020\0070\016HÆ\001J\020\020\017\032\0020\0072\006\020\020\032\0020\021H\002J \020\022\032\0020\007\"\016\b\000\020\023*\b\022\004\022\002H\0230\024*\b\022\004\022\002H\0230\024R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\b\020\t¨\006\025"}, d2 = {"Lai/grazie/utils/mpp/money/Credit$Companion;", "", "()V", "CREDITS_IN_DOLLAR", "", "CREDITS_IN_YUAN", "ZERO", "Lai/grazie/utils/mpp/money/Credit;", "getZERO", "()Lai/grazie/utils/mpp/money/Credit;", "dollarToCredit", "dollar", "Lai/grazie/utils/mpp/money/Dollar;", "serializer", "Lkotlinx/serialization/KSerializer;", "yuanToCredit", "yuan", "Lai/grazie/utils/mpp/money/Yuan;", "credit", "T", "Lai/grazie/utils/mpp/money/Money;", "utils-common"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/* 31 */     public final KSerializer<Credit> serializer() { return (KSerializer<Credit>)Credit.$serializer.INSTANCE; } @NotNull
/* 32 */     public final Credit getZERO() { return Credit.ZERO; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final <T extends Money<T>> Credit credit(@NotNull Money $this$credit) {
/* 43 */       Intrinsics.checkNotNullParameter($this$credit, "<this>"); Money money = $this$credit;
/*    */ 
/*    */       
/* 46 */       if (money instanceof Yuan) {  } else { throw new NoWhenBranchMatchedException(); }
/*    */       
/*    */       return (money instanceof Credit) ? (Credit)$this$credit : ((money instanceof Dollar) ? dollarToCredit((Dollar)$this$credit) : (Credit)"JD-Core does not support Kotlin");
/*    */     }
/* 50 */     private final Credit dollarToCredit(Dollar dollar) { return new Credit(dollar.getAmount().times(100000)); }
/* 51 */     private final Credit yuanToCredit(Yuan yuan) { return new Credit(yuan.getAmount().times(14000)); } } @NotNull public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final FixedPrecisionFloat amount; @NotNull
/*    */   private static final Credit ZERO = new Credit(FixedPrecisionFloat.Companion.getZERO()); public static final int CREDITS_IN_DOLLAR = 100000; public static final int CREDITS_IN_YUAN = 14000; @NotNull
/* 54 */   public String toString() { return String.valueOf(getAmount()); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final FixedPrecisionFloat component1() {
/*    */     return this.amount;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Credit copy(@NotNull FixedPrecisionFloat amount) {
/*    */     Intrinsics.checkNotNullParameter(amount, "amount");
/*    */     return new Credit(amount);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.amount.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Credit))
/*    */       return false; 
/*    */     Credit credit = (Credit)other;
/*    */     return !!Intrinsics.areEqual(this.amount, credit.amount);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\money\Credit.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */