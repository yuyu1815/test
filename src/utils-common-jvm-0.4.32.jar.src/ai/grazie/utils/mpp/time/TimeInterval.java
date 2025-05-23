/*    */ package ai.grazie.utils.mpp.time;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\b\n\002\020\013\n\002\b\007\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B-\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\002\020\nJ\t\020\016\032\0020\005HÆ\003J\t\020\017\032\0020\005HÆ\003J\021\020\020\032\0020\0212\006\020\022\032\0020\005H\002J\035\020\023\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\005HÆ\001J\023\020\024\032\0020\0212\b\020\025\032\004\030\0010\001HÖ\003J\t\020\026\032\0020\003HÖ\001J\006\020\027\032\0020\021J\t\020\030\032\0020\031HÖ\001J&\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÁ\001¢\006\002\b!R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\013\020\fR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\f¨\006$"}, d2 = {"Lai/grazie/utils/mpp/time/TimeInterval;", "", "seen1", "", "start", "Lai/grazie/utils/mpp/time/Timestamp;", "endExclusive", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/utils/mpp/time/Timestamp;Lai/grazie/utils/mpp/time/Timestamp;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/utils/mpp/time/Timestamp;Lai/grazie/utils/mpp/time/Timestamp;)V", "getEndExclusive", "()Lai/grazie/utils/mpp/time/Timestamp;", "getStart", "component1", "component2", "contains", "", "point", "copy", "equals", "other", "hashCode", "isEmpty", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$utils_common", "$serializer", "Companion", "utils-common"})
/*    */ public final class TimeInterval {
/*  8 */   public TimeInterval(@NotNull Timestamp start, @NotNull Timestamp endExclusive) { this.start = start; this.endExclusive = endExclusive; } @NotNull public final Timestamp getStart() { return this.start; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/utils/mpp/time/TimeInterval.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/utils/mpp/time/TimeInterval;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"}) public static final class $serializer implements GeneratedSerializer<TimeInterval> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = Timestamp.Serializer.INSTANCE; arrayOfKSerializer[1] = Timestamp.Serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public TimeInterval deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; Timestamp timestamp1 = null, timestamp2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { timestamp1 = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp1); i |= 0x1; timestamp2 = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp2); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: timestamp1 = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp1); i |= 0x1; continue;case 1: timestamp2 = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp2); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new TimeInterval(i, timestamp1, timestamp2, null); } public void serialize(@NotNull Encoder encoder, @NotNull TimeInterval value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); TimeInterval.write$Self$utils_common(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.utils.mpp.time.TimeInterval", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("start", false); pluginGeneratedSerialDescriptor.addElement("endExclusive", false); descriptor = pluginGeneratedSerialDescriptor; } } @NotNull public final Timestamp getEndExclusive() { return this.endExclusive; }
/*    */    public final boolean contains(@NotNull Timestamp point) {
/* 10 */     Intrinsics.checkNotNullParameter(point, "point"); return (this.start.compareTo(point) <= 0 && point.compareTo(this.endExclusive) < 0);
/*    */   }
/*    */   
/* 13 */   public final boolean isEmpty() { return (this.start.compareTo(this.endExclusive) >= 0); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001J\016\020\t\032\0020\0042\006\020\n\032\0020\013J\016\020\f\032\0020\0042\006\020\r\032\0020\013R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\016"}, d2 = {"Lai/grazie/utils/mpp/time/TimeInterval$Companion;", "", "()V", "EMPTY", "Lai/grazie/utils/mpp/time/TimeInterval;", "getEMPTY", "()Lai/grazie/utils/mpp/time/TimeInterval;", "serializer", "Lkotlinx/serialization/KSerializer;", "sinceEpoch", "to", "Lai/grazie/utils/mpp/time/Timestamp;", "tillMax", "from", "utils-common"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/* 15 */     public final KSerializer<TimeInterval> serializer() { return (KSerializer<TimeInterval>)TimeInterval.$serializer.INSTANCE; } @NotNull
/* 16 */     public final TimeInterval getEMPTY() { return TimeInterval.EMPTY; }
/*    */      @NotNull
/*    */     public final TimeInterval sinceEpoch(@NotNull Timestamp to) {
/* 19 */       Intrinsics.checkNotNullParameter(to, "to"); return new TimeInterval(Timestamp.Companion.epoch(), to);
/*    */     } @NotNull
/*    */     public final TimeInterval tillMax(@NotNull Timestamp from) {
/* 22 */       Intrinsics.checkNotNullParameter(from, "from"); return new TimeInterval(from, Timestamp.Companion.max());
/*    */     } }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final Timestamp start;
/*    */   @NotNull
/*    */   private final Timestamp endExclusive;
/*    */   @NotNull
/*    */   private static final TimeInterval EMPTY = new TimeInterval(Timestamp.Companion.epoch(), Timestamp.Companion.epoch());
/*    */   
/*    */   @NotNull
/*    */   public final Timestamp component1() {
/*    */     return this.start;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Timestamp component2() {
/*    */     return this.endExclusive;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TimeInterval copy(@NotNull Timestamp start, @NotNull Timestamp endExclusive) {
/*    */     Intrinsics.checkNotNullParameter(start, "start");
/*    */     Intrinsics.checkNotNullParameter(endExclusive, "endExclusive");
/*    */     return new TimeInterval(start, endExclusive);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TimeInterval(start=" + this.start + ", endExclusive=" + this.endExclusive + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.start.hashCode();
/*    */     return result * 31 + this.endExclusive.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TimeInterval))
/*    */       return false; 
/*    */     TimeInterval timeInterval = (TimeInterval)other;
/*    */     return !Intrinsics.areEqual(this.start, timeInterval.start) ? false : (!!Intrinsics.areEqual(this.endExclusive, timeInterval.endExclusive));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\time\TimeInterval.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */