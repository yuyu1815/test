/*    */ package ai.grazie.utils.mpp.time;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000 \n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032\025\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004H\002\032\025\020\000\032\0020\001*\0020\0022\006\020\005\032\0020\006H\002\032\025\020\000\032\0020\001*\0020\0022\006\020\007\032\0020\bH\002\032\n\020\t\032\0020\b*\0020\001¨\006\n"}, d2 = {"invoke", "Lai/grazie/utils/mpp/time/Timestamp;", "Lai/grazie/utils/mpp/time/Timestamp$Companion;", "localDate", "Ljava/time/LocalDate;", "localDateTime", "Ljava/time/LocalDateTime;", "date", "Ljava/util/Date;", "toDate", "utils-common"})
/*    */ public final class TimestampKt {
/*    */   @NotNull
/*  6 */   public static final Date toDate(@NotNull Timestamp $this$toDate) { Intrinsics.checkNotNullParameter($this$toDate, "<this>"); return new Date($this$toDate.getMillis()); } @NotNull
/*    */   public static final Timestamp invoke(@NotNull Timestamp.Companion $this$invoke, @NotNull Date date) {
/*  8 */     Intrinsics.checkNotNullParameter($this$invoke, "<this>"); Intrinsics.checkNotNullParameter(date, "date"); return new Timestamp(date.getTime());
/*    */   } @NotNull
/*    */   public static final Timestamp invoke(@NotNull Timestamp.Companion $this$invoke, @NotNull LocalDate localDate) {
/* 11 */     Intrinsics.checkNotNullParameter($this$invoke, "<this>"); Intrinsics.checkNotNullParameter(localDate, "localDate"); return new Timestamp(localDate.toEpochSecond(LocalTime.MIDNIGHT, ZoneOffset.UTC) * 1000L);
/*    */   } @NotNull
/*    */   public static final Timestamp invoke(@NotNull Timestamp.Companion $this$invoke, @NotNull LocalDateTime localDateTime) {
/* 14 */     Intrinsics.checkNotNullParameter($this$invoke, "<this>"); Intrinsics.checkNotNullParameter(localDateTime, "localDateTime"); return new Timestamp(localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\time\TimestampKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */