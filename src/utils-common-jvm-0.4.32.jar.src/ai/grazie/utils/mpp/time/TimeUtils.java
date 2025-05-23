/*     */ package ai.grazie.utils.mpp.time;
/*     */ import java.time.LocalDateTime;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\bÀ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\026\020\003\032\0020\0042\006\020\005\032\0020\0042\006\020\006\032\0020\007J\036\020\b\032\0020\0042\006\020\005\032\0020\0042\006\020\006\032\0020\0072\006\020\t\032\0020\nJ\016\020\013\032\0020\0042\006\020\f\032\0020\rJ\016\020\016\032\0020\0042\006\020\f\032\0020\rJ\036\020\017\032\0020\0042\006\020\005\032\0020\0042\006\020\006\032\0020\0072\006\020\t\032\0020\nJ\f\020\020\032\0020\004*\0020\021H\002J\f\020\020\032\0020\004*\0020\022H\002J\f\020\023\032\0020\022*\0020\024H\002¨\006\025"}, d2 = {"Lai/grazie/utils/mpp/time/TimeUtils;", "", "()V", "atStartOf", "Lai/grazie/utils/mpp/time/Timestamp;", "timestamp", "period", "Lai/grazie/utils/mpp/time/TimePeriod;", "minus", "number", "", "ofFullDate", "value", "", "ofHttpDate", "plus", "toTimestamp", "Ljava/time/LocalDate;", "Ljava/time/LocalDateTime;", "toUTC", "Ljava/util/Date;", "utils-common"})
/*     */ public final class TimeUtils {
/*     */   @NotNull
/*     */   public final Timestamp atStartOf(@NotNull Timestamp timestamp, @NotNull TimePeriod period) {
/*  10 */     Intrinsics.checkNotNullParameter(timestamp, "timestamp"); Intrinsics.checkNotNullParameter(period, "period"); Date date = TimestampKt.toDate(timestamp);
/*  11 */     switch (WhenMappings.$EnumSwitchMapping$0[period.ordinal()]) {
/*     */       case 1:
/*     */       
/*     */ 
/*     */       
/*     */       case 2:
/*     */       
/*     */ 
/*     */       
/*     */       case 3:
/*     */       
/*     */       
/*     */       case 4:
/*     */       
/*     */       
/*     */       case 5:
/*     */       
/*     */       
/*     */       case 6:
/*     */       
/*     */     } 
/*     */     
/*  33 */     throw new NoWhenBranchMatchedException();
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final TimeUtils INSTANCE = new TimeUtils();
/*     */   
/*     */   @NotNull
/*     */   public final Timestamp plus(@NotNull Timestamp timestamp, @NotNull TimePeriod period, int number) {
/*  42 */     Intrinsics.checkNotNullParameter(timestamp, "timestamp"); Intrinsics.checkNotNullParameter(period, "period"); switch (WhenMappings.$EnumSwitchMapping$0[period.ordinal()])
/*     */     { case 1:
/*     */       
/*     */ 
/*     */       
/*     */       case 2:
/*     */       
/*     */ 
/*     */       
/*     */       case 3:
/*     */       
/*     */ 
/*     */       
/*     */       case 4:
/*     */       
/*     */ 
/*     */       
/*     */       case 5:
/*  60 */         Intrinsics.checkNotNullExpressionValue(toUTC(TimestampKt.toDate(timestamp)).plusMonths(number), "timestamp.toDate().toUTC…usMonths(number.toLong())");
/*     */ 
/*     */       
/*     */       case 6:
/*  64 */         Intrinsics.checkNotNullExpressionValue(toUTC(TimestampKt.toDate(timestamp)).plusYears(number), "timestamp.toDate().toUTC…lusYears(number.toLong())"); }  throw new NoWhenBranchMatchedException();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Timestamp minus(@NotNull Timestamp timestamp, @NotNull TimePeriod period, int number) {
/*  72 */     Intrinsics.checkNotNullParameter(timestamp, "timestamp"); Intrinsics.checkNotNullParameter(period, "period"); switch (WhenMappings.$EnumSwitchMapping$0[period.ordinal()])
/*     */     { case 1:
/*     */       
/*     */ 
/*     */       
/*     */       case 2:
/*     */       
/*     */ 
/*     */       
/*     */       case 3:
/*     */       
/*     */ 
/*     */       
/*     */       case 4:
/*     */       
/*     */ 
/*     */       
/*     */       case 5:
/*  90 */         Intrinsics.checkNotNullExpressionValue(toUTC(TimestampKt.toDate(timestamp)).minusMonths(number), "timestamp.toDate().toUTC…usMonths(number.toLong())");
/*     */ 
/*     */       
/*     */       case 6:
/*  94 */         Intrinsics.checkNotNullExpressionValue(toUTC(TimestampKt.toDate(timestamp)).minusYears(number), "timestamp.toDate().toUTC…nusYears(number.toLong())"); }  throw new NoWhenBranchMatchedException();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Timestamp ofFullDate(@NotNull String value) {
/* 101 */     Intrinsics.checkNotNullParameter(value, "value"); Intrinsics.checkNotNullExpressionValue(LocalDate.parse(value), "parse(value)"); return toTimestamp(LocalDate.parse(value));
/*     */   }
/*     */   @NotNull
/*     */   public final Timestamp ofHttpDate(@NotNull String value) {
/* 105 */     Intrinsics.checkNotNullParameter(value, "value"); ZonedDateTime dateTime = ZonedDateTime.parse(value, DateTimeFormatter.RFC_1123_DATE_TIME);
/* 106 */     Intrinsics.checkNotNullExpressionValue(dateTime.toLocalDate(), "dateTime.toLocalDate()"); return toTimestamp(dateTime.toLocalDate());
/*     */   }
/*     */   
/*     */   private final LocalDateTime toUTC(Date $this$toUTC) {
/* 110 */     Intrinsics.checkNotNullExpressionValue(LocalDateTime.ofInstant($this$toUTC.toInstant(), ZoneOffset.UTC), "ofInstant(toInstant(), ZoneOffset.UTC)"); return LocalDateTime.ofInstant($this$toUTC.toInstant(), ZoneOffset.UTC);
/*     */   }
/*     */   
/*     */   private final Timestamp toTimestamp(LocalDate $this$toTimestamp) {
/* 114 */     return new Timestamp($this$toTimestamp.toEpochSecond(LocalTime.MIDNIGHT, ZoneOffset.UTC) * 1000L);
/*     */   }
/*     */   
/*     */   private final Timestamp toTimestamp(LocalDateTime $this$toTimestamp) {
/* 118 */     return new Timestamp($this$toTimestamp.toInstant(ZoneOffset.UTC).toEpochMilli());
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\time\TimeUtils.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */