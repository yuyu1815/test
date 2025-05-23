/*    */ package ai.grazie.utils.mpp.money;
/*    */ import ai.grazie.utils.mpp.number.FixedPrecisionFloat;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\\\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\006\n\000\n\002\020\007\n\000\n\002\020\b\n\000\n\002\020\t\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 +2\b\022\004\022\0020\0000\001:\002*+B\017\b\027\022\006\020\002\032\0020\003¢\006\002\020\004B\017\b\027\022\006\020\002\032\0020\005¢\006\002\020\006B\017\b\027\022\006\020\002\032\0020\007¢\006\002\020\bB\017\b\027\022\006\020\002\032\0020\t¢\006\002\020\nB\017\b\027\022\006\020\002\032\0020\013¢\006\002\020\fB#\b\021\022\006\020\r\032\0020\t\022\b\020\016\032\004\030\0010\017\022\b\020\020\032\004\030\0010\021¢\006\002\020\022B\r\022\006\020\016\032\0020\017¢\006\002\020\023J\t\020\031\032\0020\017HÆ\003J\023\020\032\032\0020\0002\b\b\002\020\016\032\0020\017HÆ\001J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\036HÖ\003J\t\020\037\032\0020\tHÖ\001J\020\020 \032\0020\0002\006\020\016\032\0020\017H\024J\b\020!\032\0020\003H\026J&\020\"\032\0020#2\006\020$\032\0020\0002\006\020%\032\0020&2\006\020'\032\0020(HÁ\001¢\006\002\b)R\024\020\016\032\0020\017X\004¢\006\b\n\000\032\004\b\024\020\025R\024\020\026\032\0020\0008VX\004¢\006\006\032\004\b\027\020\030¨\006,"}, d2 = {"Lai/grazie/utils/mpp/money/Yuan;", "Lai/grazie/utils/mpp/money/Money;", "value", "", "(Ljava/lang/String;)V", "", "(D)V", "", "(F)V", "", "(I)V", "", "(J)V", "seen1", "amount", "Lai/grazie/utils/mpp/number/FixedPrecisionFloat;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/utils/mpp/number/FixedPrecisionFloat;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/utils/mpp/number/FixedPrecisionFloat;)V", "getAmount", "()Lai/grazie/utils/mpp/number/FixedPrecisionFloat;", "zero", "getZero", "()Lai/grazie/utils/mpp/money/Yuan;", "component1", "copy", "equals", "", "other", "", "hashCode", "instantiate", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$utils_common", "$serializer", "Companion", "utils-common"})
/*    */ public final class Yuan extends Money<Yuan> {
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/utils/mpp/money/Yuan.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/utils/mpp/money/Yuan;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"})
/*    */   public static final class $serializer implements GeneratedSerializer<Yuan> {
/*    */     @NotNull
/* 15 */     public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)FixedPrecisionFloat.Serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public Yuan deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; FixedPrecisionFloat fixedPrecisionFloat = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { fixedPrecisionFloat = (FixedPrecisionFloat)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)FixedPrecisionFloat.Serializer.INSTANCE, fixedPrecisionFloat); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: fixedPrecisionFloat = (FixedPrecisionFloat)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)FixedPrecisionFloat.Serializer.INSTANCE, fixedPrecisionFloat); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new Yuan(i, fixedPrecisionFloat, null); } public void serialize(@NotNull Encoder encoder, @NotNull Yuan value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Yuan.write$Self$utils_common(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.utils.mpp.money.Yuan", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("amount", false); descriptor = pluginGeneratedSerialDescriptor; }
/*    */   
/* 17 */   } public Yuan(@NotNull FixedPrecisionFloat amount) { super(null); this.amount = amount; } @NotNull public FixedPrecisionFloat getAmount() { return this.amount; } @NotNull
/* 18 */   protected Yuan instantiate(@NotNull FixedPrecisionFloat amount) { Intrinsics.checkNotNullParameter(amount, "amount"); return new Yuan(amount); }
/*    */    @NotNull
/*    */   public Yuan getZero() {
/* 21 */     return ZERO;
/*    */   }
/*    */   
/*    */   public Yuan(@NotNull String value) {
/* 25 */     this(new FixedPrecisionFloat(value));
/*    */   }
/*    */   public Yuan(double value) {
/* 28 */     this(new FixedPrecisionFloat(value));
/*    */   }
/*    */   public Yuan(float value) {
/* 31 */     this(new FixedPrecisionFloat(value));
/*    */   }
/*    */   public Yuan(int value) {
/* 34 */     this(new FixedPrecisionFloat(value));
/*    */   }
/*    */   
/* 37 */   public Yuan(long value) { this(new FixedPrecisionFloat(value)); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\t"}, d2 = {"Lai/grazie/utils/mpp/money/Yuan$Companion;", "", "()V", "ZERO", "Lai/grazie/utils/mpp/money/Yuan;", "getZERO", "()Lai/grazie/utils/mpp/money/Yuan;", "serializer", "Lkotlinx/serialization/KSerializer;", "utils-common"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/* 39 */     public final KSerializer<Yuan> serializer() { return (KSerializer<Yuan>)Yuan.$serializer.INSTANCE; } @NotNull
/* 40 */     public final Yuan getZERO() { return Yuan.ZERO; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final FixedPrecisionFloat amount; @NotNull private static final Yuan ZERO = new Yuan(FixedPrecisionFloat.Companion.getZERO());
/*    */   @NotNull
/*    */   public String toString() {
/* 43 */     return "$ " + getAmount();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final FixedPrecisionFloat component1() {
/*    */     return this.amount;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Yuan copy(@NotNull FixedPrecisionFloat amount) {
/*    */     Intrinsics.checkNotNullParameter(amount, "amount");
/*    */     return new Yuan(amount);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.amount.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Yuan))
/*    */       return false; 
/*    */     Yuan yuan = (Yuan)other;
/*    */     return !!Intrinsics.areEqual(this.amount, yuan.amount);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\money\Yuan.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */