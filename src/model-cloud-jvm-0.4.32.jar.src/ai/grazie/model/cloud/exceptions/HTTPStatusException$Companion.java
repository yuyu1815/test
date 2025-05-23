/*     */ package ai.grazie.model.cloud.exceptions;
/*     */ 
/*     */ import ai.grazie.model.cloud.HeaderCollection;
/*     */ import ai.grazie.model.cloud.HeaderCollectionKt;
/*     */ import ai.grazie.utils.mpp.time.Duration;
/*     */ import ai.grazie.utils.mpp.time.Timestamp;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.StringsKt;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\002\n\002\030\002\n\000\n\002\020$\n\002\020 \n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J.\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\n\b\002\020\t\032\004\030\0010\n2\n\b\002\020\013\032\004\030\0010\fJ8\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\n\b\002\020\t\032\004\030\0010\n2\n\b\002\020\013\032\004\030\0010\f2\006\020\r\032\0020\nH\007J\022\020\016\032\004\030\0010\0172\006\020\007\032\0020\bH\002J4\020\020\032\0020\0042\006\020\005\032\0020\0062\n\b\002\020\t\032\004\030\0010\n2\n\b\002\020\013\032\004\030\0010\f2\n\b\002\020\r\032\004\030\0010\nH\007JN\020\020\032\0020\0042\006\020\005\032\0020\0062\030\020\007\032\024\022\004\022\0020\n\022\n\022\b\022\004\022\0020\n0\0220\0212\n\b\002\020\t\032\004\030\0010\n2\n\b\002\020\013\032\004\030\0010\f2\n\b\002\020\r\032\004\030\0010\nH\007¨\006\023"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$Companion;", "", "()V", "from", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "code", "", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "description", "", "e", "", "traceId", "getRetryAfter", "Lai/grazie/utils/mpp/time/Duration;", "of", "", "", "model-cloud"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @Deprecated(message = "in favor of from method", replaceWith = @ReplaceWith(expression = "from(code, headers, description, e)", imports = {}))
/*     */   @NotNull
/*     */   public final HTTPStatusException of(int code, @Nullable String description, @Nullable Throwable e, @Nullable String traceId) {
/* 191 */     return of(code, MapsKt.emptyMap(), description, e, traceId);
/*     */   }
/*     */   @Deprecated(message = "broken contract method, will be removed", replaceWith = @ReplaceWith(expression = "from(code, headers, description, e)", imports = {}))
/*     */   @NotNull
/*     */   public final HTTPStatusException of(int code, @NotNull Map headers, @Nullable String description, @Nullable Throwable e, @Nullable String traceId) {
/* 196 */     Intrinsics.checkNotNullParameter(headers, "headers"); HeaderCollection headersCollection = HeaderCollectionKt.of(HeaderCollection.Companion, headers);
/* 197 */     switch (code) { case 400: case 401: case 403: case 404: case 409: case 411: case 412: case 413: case 422: case 429: case 451: case 477: case 478: case 480: case 493: case 499: case 500:  }  return 
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
/* 215 */       new HTTPStatusException(code, description, e, headersCollection);
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated(message = "Remove traceId parameter", replaceWith = @ReplaceWith(expression = "from(code, headers, description, e)", imports = {}))
/*     */   @NotNull
/*     */   public final HTTPStatusException from(int code, @NotNull HeaderCollection headers, @Nullable String description, @Nullable Throwable e, @NotNull String traceId) {
/* 222 */     Intrinsics.checkNotNullParameter(headers, "headers"); Intrinsics.checkNotNullParameter(traceId, "traceId"); return from(code, headers, description, e); } @NotNull
/*     */   public final HTTPStatusException from(int code, @NotNull HeaderCollection headers, @Nullable String description, @Nullable Throwable e) {
/* 224 */     Intrinsics.checkNotNullParameter(headers, "headers"); switch (code) { case 400: 
/*     */       case 401: 
/*     */       case 403: 
/*     */       case 404: 
/*     */       case 409: 
/*     */       case 411: 
/*     */       case 412: 
/*     */       case 413: 
/*     */       case 422: 
/*     */       case 429: 
/*     */       case 451: 
/*     */       case 477: 
/*     */       case 478: 
/*     */       case 480: 
/*     */       case 493: 
/*     */       case 499:
/*     */       
/*     */       case 500:
/* 242 */        }  return new HTTPStatusException(code, description, e, headers);
/*     */   }
/*     */   
/*     */   private final Duration getRetryAfter(HeaderCollection headers) {
/* 246 */     String value = (String)ArraysKt.singleOrNull((Object[])headers.get("Retry-After")); int $i$a$-let-HTTPStatusException$Companion$getRetryAfter$1 = 0;
/*     */     
/*     */     try {
/* 249 */       Timestamp date = Timestamp.Companion.ofHttpDate(value);
/* 250 */       return date.between(Timestamp.Companion.now());
/* 251 */     } catch (Exception ignored) {
/*     */       
/* 253 */       if (StringsKt.toIntOrNull(value) != null) { int retryAfterSeconds = StringsKt.toIntOrNull(value).intValue(), $i$a$-let-HTTPStatusException$Companion$getRetryAfter$1$1 = 0;
/* 254 */         return Duration.Companion.seconds(retryAfterSeconds); }
/*     */       
/*     */       StringsKt.toIntOrNull(value);
/*     */     } 
/*     */     (String)ArraysKt.singleOrNull((Object[])headers.get("Retry-After"));
/* 259 */     value = (String)ArraysKt.singleOrNull((Object[])headers.get("Retry-After-Ms")); int $i$a$-let-HTTPStatusException$Companion$getRetryAfter$2 = 0;
/*     */     
/* 261 */     if (StringsKt.toIntOrNull(value) != null) { int retryAfterMs = StringsKt.toIntOrNull(value).intValue(), $i$a$-let-HTTPStatusException$Companion$getRetryAfter$2$1 = 0;
/* 262 */       return Duration.Companion.millis(retryAfterMs); }
/*     */     
/*     */     StringsKt.toIntOrNull(value);
/*     */     (String)ArraysKt.singleOrNull((Object[])headers.get("Retry-After-Ms"));
/* 266 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\exceptions\HTTPStatusException$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */