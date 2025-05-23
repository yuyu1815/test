/*     */ package ai.grazie.model.cloud.exceptions;
/*     */ 
/*     */ import ai.grazie.model.cloud.HeaderCollection;
/*     */ import ai.grazie.model.cloud.HeaderCollectionKt;
/*     */ import ai.grazie.utils.mpp.time.Duration;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\032\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\032\026\020\000\032\0020\001*\0020\0022\b\020\003\032\004\030\0010\004H\002\032 \020\005\032\0020\001*\0020\0022\b\020\006\032\004\030\0010\0072\b\020\003\032\004\030\0010\004H\002¨\006\b"}, d2 = {"fromTraceId", "Lai/grazie/model/cloud/HeaderCollection;", "Lai/grazie/model/cloud/HeaderCollection$Companion;", "traceId", "", "fromTraceIdAndRetryAfter", "retryAfter", "Lai/grazie/utils/mpp/time/Duration;", "model-cloud"})
/*     */ @SourceDebugExtension({"SMAP\nHTTPStatusException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HTTPStatusException.kt\nai/grazie/model/cloud/exceptions/HTTPStatusExceptionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n1#2:282\n*E\n"})
/*     */ public final class HTTPStatusExceptionKt
/*     */ {
/*     */   private static final HeaderCollection fromTraceId(HeaderCollection.Companion $this$fromTraceId, String traceId) {
/* 271 */     if (traceId != null) { String it = traceId; int $i$a$-let-HTTPStatusExceptionKt$fromTraceId$1 = 0;
/* 272 */       Pair[] arrayOfPair = new Pair[1]; arrayOfPair[0] = TuplesKt.to("Grazie-Trace-Id", CollectionsKt.listOf(it)); if (HeaderCollectionKt.of(HeaderCollection.Companion, arrayOfPair) == null) { HeaderCollectionKt.of(HeaderCollection.Companion, arrayOfPair);
/* 273 */         return $this$fromTraceId.empty(); }  return HeaderCollectionKt.of(HeaderCollection.Companion, arrayOfPair); }  HeaderCollectionKt.of(HeaderCollection.Companion, arrayOfPair); return $this$fromTraceId.empty();
/*     */   }
/*     */   private static final HeaderCollection fromTraceIdAndRetryAfter(HeaderCollection.Companion $this$fromTraceIdAndRetryAfter, Duration retryAfter, String traceId) {
/* 276 */     HeaderCollection collection = new HeaderCollection();
/* 277 */     if (traceId != null) { String it = traceId;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 282 */       int $i$a$-let-HTTPStatusExceptionKt$fromTraceIdAndRetryAfter$1 = 0; collection.add("Grazie-Trace-Id", it); } else {  }  if (retryAfter != null) { long it = retryAfter.getMillis(); int $i$a$-let-HTTPStatusExceptionKt$fromTraceIdAndRetryAfter$2 = 0;
/*     */       collection.add("Retry-After-Ms", String.valueOf(it)); }
/*     */     else
/*     */     {  }
/*     */     
/*     */     return collection;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\exceptions\HTTPStatusExceptionKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */