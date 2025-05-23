/*   */ package ai.grazie.utils.mpp.time;
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\t\n\002\b\002\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\r\020\003\032\0020\004H\000¢\006\002\b\005J\006\020\006\032\0020\007¨\006\b"}, d2 = {"Lai/grazie/utils/mpp/time/Time;", "", "()V", "epochMillis", "", "epochMillis$utils_common", "now", "Lai/grazie/utils/mpp/time/Timestamp;", "utils-common"})
/*   */ public final class Time {
/*   */   public final long epochMillis$utils_common() {
/* 5 */     return System.currentTimeMillis();
/*   */   } @NotNull
/*   */   public static final Time INSTANCE = new Time(); @NotNull
/*   */   public final Timestamp now() {
/* 9 */     return Timestamp.Companion.now();
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\time\Time.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */