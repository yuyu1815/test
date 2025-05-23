/*    */ package ai.grazie.client.common.retry;
/*    */ 
/*    */ import ai.grazie.utils.mpp.time.Duration;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.random.Random;
/*    */ import kotlin.ranges.RangesKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\003\n\002\b\002\bf\030\000 \b2\0020\001:\001\bJ\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H&ø\001\000\002\006\n\004\b!0\001¨\006\tÀ\006\001"}, d2 = {"Lai/grazie/client/common/retry/ClientRetryStrategy;", "", "getDelay", "Lai/grazie/utils/mpp/time/Duration;", "attempt", "", "exception", "", "Companion", "client-common"})
/*    */ public interface ClientRetryStrategy
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   @NotNull
/*    */   Duration getDelay(int paramInt, @NotNull Throwable paramThrowable);
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\006\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J,\020\007\032\0020\0042\006\020\005\032\0020\0062\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0062\b\b\002\020\013\032\0020\006J\016\020\f\032\0020\0042\006\020\r\032\0020\004¨\006\016"}, d2 = {"Lai/grazie/client/common/retry/ClientRetryStrategy$Companion;", "", "()V", "constant", "Lai/grazie/client/common/retry/ClientRetryStrategy;", "delay", "Lai/grazie/utils/mpp/time/Duration;", "exponential", "multiplier", "", "randomization", "max", "httpExponential", "strategy", "client-common"})
/*    */   public static final class Companion
/*    */   {
/*    */     @NotNull
/*    */     public final ClientRetryStrategy constant(@NotNull Duration delay) {
/* 24 */       Intrinsics.checkNotNullParameter(delay, "delay"); return new ClientRetryStrategy$Companion$constant$1(delay); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\003\n\000*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"ai/grazie/client/common/retry/ClientRetryStrategy$Companion$constant$1", "Lai/grazie/client/common/retry/ClientRetryStrategy;", "getDelay", "Lai/grazie/utils/mpp/time/Duration;", "attempt", "", "exception", "", "client-common"})
/* 25 */     public static final class ClientRetryStrategy$Companion$constant$1 implements ClientRetryStrategy { public Duration getDelay(int attempt, Throwable exception) { Intrinsics.checkNotNullParameter(exception, "exception"); return this.$delay; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/*    */       ClientRetryStrategy$Companion$constant$1(Duration $delay) {} }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final ClientRetryStrategy exponential(@NotNull Duration delay, double multiplier, @NotNull Duration randomization, @NotNull Duration max) {
/* 39 */       Intrinsics.checkNotNullParameter(delay, "delay"); Intrinsics.checkNotNullParameter(randomization, "randomization"); Intrinsics.checkNotNullParameter(max, "max"); return new ClientRetryStrategy$Companion$exponential$1(randomization, multiplier, delay, max); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\003\n\000*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"ai/grazie/client/common/retry/ClientRetryStrategy$Companion$exponential$1", "Lai/grazie/client/common/retry/ClientRetryStrategy;", "getDelay", "Lai/grazie/utils/mpp/time/Duration;", "attempt", "", "exception", "", "client-common"})
/*    */     public static final class ClientRetryStrategy$Companion$exponential$1 implements ClientRetryStrategy { public Duration getDelay(int attempt, Throwable exception) {
/* 41 */         Intrinsics.checkNotNullParameter(exception, "exception"); double randomized = Random.Default.nextDouble() * this.$randomization.getMillis();
/* 42 */         double exponential = Math.pow(this.$multiplier, attempt) * this.$delay.getMillis();
/* 43 */         return Duration.Companion.millis((int)RangesKt.coerceAtMost(randomized + exponential, this.$max.getMillis()));
/*    */       }
/*    */       ClientRetryStrategy$Companion$exponential$1(Duration $randomization, double $multiplier, Duration $delay, Duration $max) {} }
/*    */     
/*    */     @NotNull
/*    */     public final ClientRetryStrategy httpExponential(@NotNull ClientRetryStrategy strategy) {
/* 49 */       Intrinsics.checkNotNullParameter(strategy, "strategy"); return new HttpExponentialRetryStrategy(strategy);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\retry\ClientRetryStrategy.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */