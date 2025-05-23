/*    */ package ai.grazie.utils.mpp.time;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\003\032\0020\0042\f\020\005\032\b\022\004\022\0020\0070\006H\bø\001\000J\006\020\b\032\0020\t\002\007\n\005\b20\001¨\006\n"}, d2 = {"Lai/grazie/utils/mpp/time/Timer$Companion;", "", "()V", "measure", "Lai/grazie/utils/mpp/time/Duration;", "body", "Lkotlin/Function0;", "", "start", "Lai/grazie/utils/mpp/time/Timer;", "utils-common"})
/*    */ public final class Companion {
/*    */   @NotNull
/*  8 */   public final Timer start() { return new Timer(Timestamp.Companion.now()); } private Companion() {} @NotNull
/*    */   public final Duration measure(@NotNull Function0 body) {
/* 10 */     Intrinsics.checkNotNullParameter(body, "body"); int $i$f$measure = 0; Timer timer = start();
/* 11 */     body.invoke();
/* 12 */     return timer.elapsed();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\time\Timer$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */