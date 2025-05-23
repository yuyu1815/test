/*     */ package ai.grazie.model.cloud.exceptions;
/*     */ 
/*     */ import ai.grazie.model.cloud.HeaderCollection;
/*     */ import ai.grazie.utils.mpp.time.Duration;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\030\0002\0020\001B7\b\027\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\007\022\n\b\002\020\b\032\004\030\0010\003¢\006\002\020\tB%\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\006\020\n\032\0020\013¢\006\002\020\fR\023\020\006\032\004\030\0010\007¢\006\b\n\000\032\004\b\r\020\016¨\006\017"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$TooManyRequests;", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "description", "", "e", "", "retryAfter", "Lai/grazie/utils/mpp/time/Duration;", "traceId", "(Ljava/lang/String;Ljava/lang/Throwable;Lai/grazie/utils/mpp/time/Duration;Ljava/lang/String;)V", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "getRetryAfter", "()Lai/grazie/utils/mpp/time/Duration;", "model-cloud"})
/*     */ @SourceDebugExtension({"SMAP\nHTTPStatusException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HTTPStatusException.kt\nai/grazie/model/cloud/exceptions/HTTPStatusException$TooManyRequests\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n1#2:282\n*E\n"})
/*     */ public final class TooManyRequests
/*     */   extends HTTPStatusException
/*     */ {
/*     */   @Nullable
/*     */   private final Duration retryAfter;
/*     */   
/*     */   public TooManyRequests(@Nullable String description, @Nullable Throwable e, @NotNull HeaderCollection headers) {
/* 117 */     super(description, "Too Many Requests", e, headers);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 123 */     HeaderCollection headerCollection = headers;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 282 */     TooManyRequests tooManyRequests = this; int $i$a$-let-HTTPStatusException$TooManyRequests$retryAfter$1 = 0;
/*     */     tooManyRequests.retryAfter = HTTPStatusException.Companion.access$getRetryAfter(HTTPStatusException.Companion, headerCollection);
/*     */   }
/*     */   
/*     */   @Deprecated(message = "Do not add traceId manually")
/*     */   public TooManyRequests(@Nullable String description, @Nullable Throwable e, @Nullable Duration retryAfter, @Nullable String traceId) {
/*     */     this(description, e, HTTPStatusExceptionKt.access$fromTraceIdAndRetryAfter(HeaderCollection.Companion, retryAfter, traceId));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Duration getRetryAfter() {
/*     */     return this.retryAfter;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\exceptions\HTTPStatusException$TooManyRequests.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */