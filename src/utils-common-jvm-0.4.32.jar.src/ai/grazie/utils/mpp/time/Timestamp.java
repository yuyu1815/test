/*     */ package ai.grazie.utils.mpp.time;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.math.MathKt;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.descriptors.PrimitiveKind;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Serializable(with = Timestamp.Serializer.class)
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\020\t\n\002\b\002\n\002\020\b\n\002\b\013\n\002\020\013\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020\000\n\002\b\006\n\002\020\016\n\002\b\003\b\b\030\000 (2\b\022\004\022\0020\0000\001:\002()B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\016\020\021\032\0020\0222\006\020\023\032\0020\000J\016\020\024\032\0020\0222\006\020\023\032\0020\000J\016\020\025\032\0020\0002\006\020\026\032\0020\027J\016\020\030\032\0020\0222\006\020\023\032\0020\000J\016\020\031\032\0020\0222\006\020\023\032\0020\000J\016\020\032\032\0020\0332\006\020\023\032\0020\000J\021\020\034\032\0020\0062\006\020\023\032\0020\000H\002J\t\020\035\032\0020\003HÆ\003J\023\020\036\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\037\032\0020\0222\b\020\023\032\004\030\0010 HÖ\003J\t\020!\032\0020\006HÖ\001J\021\020\"\032\0020\0002\006\020#\032\0020\033H\002J\030\020\"\032\0020\0002\006\020\026\032\0020\0272\006\020$\032\0020\006H\007J\021\020%\032\0020\0002\006\020#\032\0020\033H\002J\030\020%\032\0020\0002\006\020\026\032\0020\0272\006\020$\032\0020\006H\007J\b\020&\032\0020'H\026R\021\020\005\032\0020\0068F¢\006\006\032\004\b\007\020\bR\021\020\t\032\0020\0068F¢\006\006\032\004\b\n\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\021\020\r\032\0020\0068F¢\006\006\032\004\b\016\020\bR\021\020\017\032\0020\0068F¢\006\006\032\004\b\020\020\b¨\006*"}, d2 = {"Lai/grazie/utils/mpp/time/Timestamp;", "Lai/grazie/utils/mpp/MPPComparable;", "millis", "", "(J)V", "days", "", "getDays", "()I", "hours", "getHours", "getMillis", "()J", "minutes", "getMinutes", "seconds", "getSeconds", "after", "", "other", "afterOrEqual", "atStartOf", "period", "Lai/grazie/utils/mpp/time/TimePeriod;", "before", "beforeOrEqual", "between", "Lai/grazie/utils/mpp/time/Duration;", "compareTo", "component1", "copy", "equals", "", "hashCode", "minus", "duration", "number", "plus", "toString", "", "Companion", "Serializer", "utils-common"})
/*     */ public final class Timestamp implements MPPComparable<Timestamp> {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final long millis;
/*     */   
/*  19 */   public Timestamp(long millis) { this.millis = millis; } public final long getMillis() { return this.millis; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\006\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\006\020\003\032\0020\004J\006\020\005\032\0020\004J\006\020\006\032\0020\004J\016\020\007\032\0020\0042\006\020\b\032\0020\tJ\016\020\n\032\0020\0042\006\020\013\032\0020\fJ\016\020\r\032\0020\0042\006\020\013\032\0020\fJ\017\020\016\032\b\022\004\022\0020\0040\017HÆ\001¨\006\020"}, d2 = {"Lai/grazie/utils/mpp/time/Timestamp$Companion;", "", "()V", "epoch", "Lai/grazie/utils/mpp/time/Timestamp;", "max", "now", "of", "millis", "", "ofFullDate", "value", "", "ofHttpDate", "serializer", "Lkotlinx/serialization/KSerializer;", "utils-common"}) public static final class Companion { @NotNull
/*  20 */     public final KSerializer<Timestamp> serializer() { return Timestamp.Serializer.INSTANCE; } private Companion() {} @NotNull
/*  21 */     public final Timestamp now() { return new Timestamp(Time.INSTANCE.epochMillis$utils_common()); } @NotNull
/*     */     public final Timestamp epoch() {
/*  23 */       return new Timestamp(0L);
/*     */     } @NotNull
/*     */     public final Timestamp max() {
/*  26 */       return new Timestamp(Long.MAX_VALUE);
/*     */     }
/*     */     @NotNull
/*     */     public final Timestamp ofFullDate(@NotNull String value) {
/*  30 */       Intrinsics.checkNotNullParameter(value, "value"); return TimeUtils.INSTANCE.ofFullDate(value);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Timestamp ofHttpDate(@NotNull String value) {
/*  35 */       Intrinsics.checkNotNullParameter(value, "value"); return TimeUtils.INSTANCE.ofHttpDate(value);
/*     */     }
/*     */     @NotNull
/*     */     public final Timestamp of(double millis) {
/*  39 */       return new Timestamp((long)millis);
/*     */     } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\020\020\b\032\0020\0022\006\020\t\032\0020\nH\026J\030\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\002H\026R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007¨\006\020"}, d2 = {"Lai/grazie/utils/mpp/time/Timestamp$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/mpp/time/Timestamp;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"})
/*     */   public static final class Serializer implements KSerializer<Timestamp> { @NotNull
/*     */     public static final Serializer INSTANCE = new Serializer();
/*     */     @NotNull
/*     */     public Timestamp deserialize(@NotNull Decoder decoder) {
/*  45 */       Intrinsics.checkNotNullParameter(decoder, "decoder"); return new Timestamp(decoder.decodeLong());
/*     */     } @NotNull
/*     */     public SerialDescriptor getDescriptor() {
/*  48 */       return SerialDescriptorsKt.PrimitiveSerialDescriptor("Timestamp", (PrimitiveKind)PrimitiveKind.LONG.INSTANCE);
/*     */     }
/*     */     public void serialize(@NotNull Encoder encoder, @NotNull Timestamp value) {
/*  51 */       Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); encoder.encodeLong(value.getMillis());
/*     */     } }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*  56 */     return String.valueOf(this.millis);
/*     */   }
/*     */   
/*     */   public final int getSeconds() {
/*  60 */     return MathKt.roundToInt(this.millis / 'Ϩ');
/*     */   }
/*     */   public final int getMinutes() {
/*  63 */     return MathKt.roundToInt(getSeconds() / 60);
/*     */   }
/*     */   public final int getHours() {
/*  66 */     return MathKt.roundToInt(getMinutes() / 60);
/*     */   }
/*     */   public final int getDays() {
/*  69 */     return MathKt.roundToInt(getHours() / 24);
/*     */   } @NotNull
/*     */   public final Timestamp plus(@NotNull Duration duration) {
/*  72 */     Intrinsics.checkNotNullParameter(duration, "duration"); return new Timestamp(this.millis + duration.getMillis());
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Timestamp plus(@NotNull TimePeriod period, int number) {
/*  77 */     Intrinsics.checkNotNullParameter(period, "period"); return TimeUtils.INSTANCE.plus(this, period, number);
/*     */   }
/*     */   @NotNull
/*     */   public final Timestamp minus(@NotNull Duration duration) {
/*  81 */     Intrinsics.checkNotNullParameter(duration, "duration"); return new Timestamp(Math.max(0L, this.millis - duration.getMillis()));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Timestamp minus(@NotNull TimePeriod period, int number) {
/*  86 */     Intrinsics.checkNotNullParameter(period, "period"); return TimeUtils.INSTANCE.minus(this, period, number);
/*     */   }
/*     */   
/*     */   public int compareTo(@NotNull Timestamp other) {
/*  90 */     Intrinsics.checkNotNullParameter(other, "other"); return Intrinsics.compare(this.millis, other.millis);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Duration between(@NotNull Timestamp other) {
/* 100 */     Intrinsics.checkNotNullParameter(other, "other"); return new Duration(Math.abs(this.millis - other.millis));
/*     */   }
/*     */   
/*     */   public final boolean before(@NotNull Timestamp other) {
/* 104 */     Intrinsics.checkNotNullParameter(other, "other"); return (compareTo(other) < 0);
/*     */   }
/*     */   
/*     */   public final boolean beforeOrEqual(@NotNull Timestamp other) {
/* 108 */     Intrinsics.checkNotNullParameter(other, "other"); return (compareTo(other) <= 0);
/*     */   }
/*     */   
/*     */   public final boolean after(@NotNull Timestamp other) {
/* 112 */     Intrinsics.checkNotNullParameter(other, "other"); return (compareTo(other) >= 0);
/*     */   }
/*     */   
/*     */   public final boolean afterOrEqual(@NotNull Timestamp other) {
/* 116 */     Intrinsics.checkNotNullParameter(other, "other"); return (this.millis >= other.millis);
/*     */   }
/*     */   @NotNull
/*     */   public final Timestamp atStartOf(@NotNull TimePeriod period) {
/* 120 */     Intrinsics.checkNotNullParameter(period, "period"); return TimeUtils.INSTANCE.atStartOf(this, period);
/*     */   }
/*     */   
/*     */   public final long component1() {
/*     */     return this.millis;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Timestamp copy(long millis) {
/*     */     return new Timestamp(millis);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return Long.hashCode(this.millis);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof Timestamp))
/*     */       return false; 
/*     */     Timestamp timestamp = (Timestamp)other;
/*     */     return !(this.millis != timestamp.millis);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\time\Timestamp.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */