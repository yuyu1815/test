/*    */ package ai.grazie.client.common.retry;
/*    */ 
/*    */ import ai.grazie.utils.mpp.time.Duration;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.random.Random;
/*    */ import kotlin.ranges.RangesKt;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\003\n\000*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"ai/grazie/client/common/retry/ClientRetryStrategy$Companion$exponential$1", "Lai/grazie/client/common/retry/ClientRetryStrategy;", "getDelay", "Lai/grazie/utils/mpp/time/Duration;", "attempt", "", "exception", "", "client-common"})
/*    */ public final class ClientRetryStrategy$Companion$exponential$1
/*    */   implements ClientRetryStrategy
/*    */ {
/*    */   ClientRetryStrategy$Companion$exponential$1(Duration $randomization, double $multiplier, Duration $delay, Duration $max) {}
/*    */   
/*    */   public Duration getDelay(int attempt, Throwable exception) {
/* 41 */     Intrinsics.checkNotNullParameter(exception, "exception"); double randomized = Random.Default.nextDouble() * this.$randomization.getMillis();
/* 42 */     double exponential = Math.pow(this.$multiplier, attempt) * this.$delay.getMillis();
/* 43 */     return Duration.Companion.millis((int)RangesKt.coerceAtMost(randomized + exponential, this.$max.getMillis()));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\retry\ClientRetryStrategy$Companion$exponential$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */