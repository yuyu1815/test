/*    */ package ai.grazie.utils.mpp.time;
/*    */ 
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\t\n\000\n\002\030\002\n\002\b\b\n\002\020\013\n\002\b\b\n\002\020\006\n\002\b\021\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 52\0020\001:\00245B!\b\021\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\017\b\000\022\006\020\004\032\0020\005¢\006\002\020\tJ\021\020\034\032\0020\0032\006\020\035\032\0020\000H\002J\t\020\036\032\0020\005HÆ\003J\023\020\037\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020 \032\0020\0202\b\020\035\032\004\030\0010\001HÖ\003J\016\020!\032\0020\0202\006\020\035\032\0020\000J\016\020\"\032\0020\0202\006\020\035\032\0020\000J\t\020#\032\0020\003HÖ\001J\016\020$\032\0020\0202\006\020\035\032\0020\000J\016\020%\032\0020\0202\006\020\035\032\0020\000J\016\020&\032\0020\0002\006\020\035\032\0020\000J\016\020'\032\0020\0002\006\020\035\032\0020\000J\021\020(\032\0020\0002\006\020)\032\0020\003H\002J\t\020*\032\0020+HÖ\001J&\020,\032\0020-2\006\020.\032\0020\0002\006\020/\032\002002\006\0201\032\00202HÁ\001¢\006\002\b3R\021\020\n\032\0020\0038F¢\006\006\032\004\b\013\020\fR\021\020\r\032\0020\0038F¢\006\006\032\004\b\016\020\fR\021\020\017\032\0020\0208F¢\006\006\032\004\b\017\020\021R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\022\020\023R\021\020\024\032\0020\0038F¢\006\006\032\004\b\025\020\fR\021\020\026\032\0020\0038F¢\006\006\032\004\b\027\020\fR\021\020\030\032\0020\0318F¢\006\006\032\004\b\032\020\033¨\0066"}, d2 = {"Lai/grazie/utils/mpp/time/Duration;", "", "seen1", "", "millis", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(J)V", "days", "getDays", "()I", "hours", "getHours", "isZero", "", "()Z", "getMillis", "()J", "minutes", "getMinutes", "seconds", "getSeconds", "secondsWithFraction", "", "getSecondsWithFraction", "()D", "compareTo", "other", "component1", "copy", "equals", "greater", "greaterOrEqual", "hashCode", "less", "lessOrEqual", "minus", "plus", "times", "multiplier", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$utils_common", "$serializer", "Companion", "utils-common"})
/*    */ public final class Duration {
/* 12 */   public Duration(long millis) { this.millis = millis; } public final long getMillis() { return this.millis; }
/*    */   
/* 14 */   public final boolean isZero() { return (this.millis == 0L); }
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/utils/mpp/time/Duration.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/utils/mpp/time/Duration;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"}) public static final class $serializer implements GeneratedSerializer<Duration> {
/*    */     @NotNull public static final $serializer INSTANCE = new $serializer();
/* 17 */     @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)LongSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public Duration deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; long l = 0L; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { l = compositeDecoder.decodeLongElement(serialDescriptor, 0); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: l = compositeDecoder.decodeLongElement(serialDescriptor, 0); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new Duration(i, l, null); } public void serialize(@NotNull Encoder encoder, @NotNull Duration value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Duration.write$Self$utils_common(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.utils.mpp.time.Duration", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("millis", false); descriptor = pluginGeneratedSerialDescriptor; } } public final int getSeconds() { return MathKt.roundToInt(getSecondsWithFraction()); }
/*    */   
/*    */   public final double getSecondsWithFraction() {
/* 20 */     return this.millis / 'Ϩ';
/*    */   }
/*    */   public final int getMinutes() {
/* 23 */     return MathKt.roundToInt(getSeconds() / 60);
/*    */   }
/*    */   public final int getHours() {
/* 26 */     return MathKt.roundToInt(getMinutes() / 60);
/*    */   }
/*    */   public final int getDays() {
/* 29 */     return MathKt.roundToInt(getHours() / 24);
/*    */   }
/*    */   @NotNull
/* 32 */   public final Duration times(int multiplier) { return new Duration(this.millis * multiplier); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\005\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\007\032\0020\0042\006\020\007\032\0020\bJ\016\020\t\032\0020\0042\006\020\t\032\0020\bJ\016\020\n\032\0020\0042\006\020\n\032\0020\bJ\016\020\013\032\0020\0042\006\020\013\032\0020\bJ\016\020\f\032\0020\0042\006\020\f\032\0020\bJ\017\020\r\032\b\022\004\022\0020\0040\016HÆ\001J\016\020\017\032\0020\0042\006\020\017\032\0020\bR\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\020"}, d2 = {"Lai/grazie/utils/mpp/time/Duration$Companion;", "", "()V", "ZERO", "Lai/grazie/utils/mpp/time/Duration;", "getZERO", "()Lai/grazie/utils/mpp/time/Duration;", "days", "", "hours", "millis", "minutes", "seconds", "serializer", "Lkotlinx/serialization/KSerializer;", "weeks", "utils-common"})
/*    */   public static final class Companion { private Companion() {}
/*    */     @NotNull
/* 35 */     public final KSerializer<Duration> serializer() { return (KSerializer<Duration>)Duration.$serializer.INSTANCE; } @NotNull
/* 36 */     public final Duration getZERO() { return Duration.ZERO; }
/*    */      @NotNull
/*    */     public final Duration millis(int millis) {
/* 39 */       return new Duration(millis);
/*    */     }
/*    */     @NotNull
/*    */     public final Duration seconds(int seconds) {
/* 43 */       return new Duration(seconds * 1000L);
/*    */     }
/*    */     @NotNull
/*    */     public final Duration minutes(int minutes) {
/* 47 */       return seconds(minutes * 60);
/*    */     }
/*    */     @NotNull
/*    */     public final Duration hours(int hours) {
/* 51 */       return minutes(hours * 60);
/*    */     }
/*    */     @NotNull
/*    */     public final Duration days(int days) {
/* 55 */       return hours(days * 24);
/*    */     }
/*    */     @NotNull
/*    */     public final Duration weeks(int weeks) {
/* 59 */       return days(weeks * 7);
/*    */     } } @NotNull
/*    */   public static final Companion Companion = new Companion(null); private final long millis; @NotNull
/*    */   private static final Duration ZERO = new Duration(0L);
/*    */   public final int compareTo(@NotNull Duration other) {
/* 64 */     Intrinsics.checkNotNullParameter(other, "other"); return Intrinsics.compare(this.millis, other.millis);
/*    */   }
/*    */   
/*    */   public final boolean less(@NotNull Duration other) {
/* 68 */     Intrinsics.checkNotNullParameter(other, "other"); return (compareTo(other) < 0);
/*    */   }
/*    */   
/*    */   public final boolean lessOrEqual(@NotNull Duration other) {
/* 72 */     Intrinsics.checkNotNullParameter(other, "other"); return (compareTo(other) <= 0);
/*    */   }
/*    */   
/*    */   public final boolean greater(@NotNull Duration other) {
/* 76 */     Intrinsics.checkNotNullParameter(other, "other"); return (compareTo(other) > 0);
/*    */   }
/*    */   
/*    */   public final boolean greaterOrEqual(@NotNull Duration other) {
/* 80 */     Intrinsics.checkNotNullParameter(other, "other"); return (compareTo(other) >= 0);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Duration minus(@NotNull Duration other) {
/* 88 */     Intrinsics.checkNotNullParameter(other, "other"); return new Duration(Math.abs(this.millis - other.millis));
/*    */   }
/*    */   @NotNull
/*    */   public final Duration plus(@NotNull Duration other) {
/* 92 */     Intrinsics.checkNotNullParameter(other, "other"); return new Duration(this.millis + other.millis);
/*    */   }
/*    */   
/*    */   public final long component1() {
/*    */     return this.millis;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Duration copy(long millis) {
/*    */     return new Duration(millis);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Duration(millis=" + this.millis + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return Long.hashCode(this.millis);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Duration))
/*    */       return false; 
/*    */     Duration duration = (Duration)other;
/*    */     return !(this.millis != duration.millis);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\time\Duration.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */