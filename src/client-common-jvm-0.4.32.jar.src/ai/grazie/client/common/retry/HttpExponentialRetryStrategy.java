/*    */ package ai.grazie.client.common.retry;
/*    */ 
/*    */ import ai.grazie.model.cloud.exceptions.HTTPStatusException;
/*    */ import ai.grazie.utils.mpp.time.Duration;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\003\n\000\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\001¢\006\002\020\003J\030\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH\026R\016\020\002\032\0020\001X\004¢\006\002\n\000¨\006\n"}, d2 = {"Lai/grazie/client/common/retry/HttpExponentialRetryStrategy;", "Lai/grazie/client/common/retry/ClientRetryStrategy;", "strategy", "(Lai/grazie/client/common/retry/ClientRetryStrategy;)V", "getDelay", "Lai/grazie/utils/mpp/time/Duration;", "attempt", "", "exception", "", "client-common"})
/*    */ final class HttpExponentialRetryStrategy
/*    */   implements ClientRetryStrategy
/*    */ {
/*    */   @NotNull
/*    */   private final ClientRetryStrategy strategy;
/*    */   
/*    */   public HttpExponentialRetryStrategy(@NotNull ClientRetryStrategy strategy) {
/* 54 */     this.strategy = strategy; } @NotNull
/*    */   public Duration getDelay(int attempt, @NotNull Throwable exception) {
/* 56 */     Intrinsics.checkNotNullParameter(exception, "exception"); if (exception instanceof HTTPStatusException.TooManyRequests) {
/* 57 */       Duration duration = ((HTTPStatusException.TooManyRequests)exception).getRetryAfter(); if (duration != null) { Duration retryAfter = duration; int $i$a$-let-HttpExponentialRetryStrategy$getDelay$1 = 0;
/* 58 */         return retryAfter; }
/*    */     
/*    */     } 
/* 61 */     return this.strategy.getDelay(attempt, exception);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\retry\HttpExponentialRetryStrategy.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */