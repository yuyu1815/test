/*    */ package ai.grazie.utils.mpp.time;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\b\007\030\000 \t2\0020\001:\001\tB\r\022\006\020\002\032\0020\003¢\006\002\020\004J\006\020\007\032\0020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\n"}, d2 = {"Lai/grazie/utils/mpp/time/Timer;", "", "timestamp", "Lai/grazie/utils/mpp/time/Timestamp;", "(Lai/grazie/utils/mpp/time/Timestamp;)V", "getTimestamp", "()Lai/grazie/utils/mpp/time/Timestamp;", "elapsed", "Lai/grazie/utils/mpp/time/Duration;", "Companion", "utils-common"})
/*    */ public final class Timer { @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*  6 */   public Timer(@NotNull Timestamp timestamp) { this.timestamp = timestamp; } @NotNull private final Timestamp timestamp; @NotNull public final Timestamp getTimestamp() { return this.timestamp; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\003\032\0020\0042\f\020\005\032\b\022\004\022\0020\0070\006H\bø\001\000J\006\020\b\032\0020\t\002\007\n\005\b20\001¨\006\n"}, d2 = {"Lai/grazie/utils/mpp/time/Timer$Companion;", "", "()V", "measure", "Lai/grazie/utils/mpp/time/Duration;", "body", "Lkotlin/Function0;", "", "start", "Lai/grazie/utils/mpp/time/Timer;", "utils-common"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/*  8 */     public final Timer start() { return new Timer(Timestamp.Companion.now()); } @NotNull
/*    */     public final Duration measure(@NotNull Function0 body) {
/* 10 */       Intrinsics.checkNotNullParameter(body, "body"); int $i$f$measure = 0; Timer timer = start();
/* 11 */       body.invoke();
/* 12 */       return timer.elapsed();
/*    */     } }
/*    */   @NotNull
/*    */   public final Duration elapsed() {
/* 16 */     return new Duration(Timestamp.Companion.now().getMillis() - this.timestamp.getMillis());
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\time\Timer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */