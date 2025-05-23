/*     */ package ai.grazie.model.cloud.exceptions;
/*     */ 
/*     */ import ai.grazie.model.cloud.HeaderCollection;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020\013\n\002\b\026\b\027\030\000 \0262\0020\001:\024\023\024\025\026\027\030\031\032\033\034\035\036\037 !\"#$%&B3\b\027\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\007\022\n\b\002\020\b\032\004\030\0010\005¢\006\002\020\tB+\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\007\022\006\020\n\032\0020\013¢\006\002\020\fJ\006\020\020\032\0020\021J\006\020\022\032\0020\021R\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\r\020\016R\023\020\b\032\004\030\0010\005¢\006\b\n\000\032\004\b\017\020\016¨\006'"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "Lai/grazie/model/cloud/exceptions/HttpExceptionBase;", "status", "", "description", "", "e", "", "traceId", "(ILjava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(ILjava/lang/String;Ljava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "getDescription", "()Ljava/lang/String;", "getTraceId", "isClientError", "", "isServerError", "AccessProhibited", "BadRequest", "ClosedRequest", "Companion", "Conflict", "ContentTooLarge", "DetachedQuotaUsage", "Forbidden", "InternalServerError", "LengthRequired", "NotFound", "OutOfApplicationQuota", "OutOfQuota", "OutOfStorage", "PreconditionFailed", "RequestTimeout", "TooManyRequests", "Unauthorized", "UnavailableForLegalReasons", "UnprocessableContent", "model-cloud"})
/*     */ public class HTTPStatusException extends HttpExceptionBase {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   
/*     */   @Nullable
/*  11 */   public final String getDescription() { return this.description; } @Nullable private final String description; @Nullable
/*  12 */   private final String traceId; public HTTPStatusException(int status, @Nullable String description, @Nullable Throwable e, @NotNull HeaderCollection headers) { super(description, e, status, headers);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     this.description = description;
/*     */ 
/*     */ 
/*     */     
/*  21 */     headers.get("Grazie-Trace-Id"); this.traceId = (headers.get("Grazie-Trace-Id") != null) ? (String)ArraysKt.singleOrNull((Object[])headers.get("Grazie-Trace-Id")) : null; } @Deprecated(message = "Do not add traceId manually") public HTTPStatusException(int status, @Nullable String description, @Nullable Throwable e, @Nullable String traceId) { this(status, description, e, HTTPStatusExceptionKt.access$fromTraceId(HeaderCollection.Companion, traceId)); } public final boolean isServerError() { return (getStatus() >= 500); } public final boolean isClientError() { int i = getStatus(); return (400 <= i) ? ((i < 500)) : false; } @Nullable public final String getTraceId() { return this.traceId; }
/*     */    @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\003\n\000\n\002\030\002\n\002\b\003\b&\030\000 \0132\0020\001:\001\013B-\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\007\022\006\020\b\032\0020\t¢\006\002\020\n¨\006\f"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$AccessProhibited;", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "status", "", "description", "", "e", "", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(ILjava/lang/String;Ljava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "Companion", "model-cloud"})
/*     */   public static abstract class AccessProhibited extends HTTPStatusException { @NotNull
/*     */     public static final Companion Companion = new Companion(null); public AccessProhibited(int status, @Nullable String description, @Nullable Throwable e, @NotNull HeaderCollection headers) {
/*  25 */       super(status, description, e, headers);
/*     */     } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002¨\006\003"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$AccessProhibited$Companion;", "", "()V", "model-cloud"})
/*     */     public static final class Companion {
/*     */       private Companion() {} } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\003\n\002\030\002\n\002\b\002\030\0002\0020\001B+\b\027\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\003¢\006\002\020\007B%\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\006\020\b\032\0020\t¢\006\002\020\n¨\006\013"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$BadRequest;", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "description", "", "e", "", "traceId", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "model-cloud"})
/*     */   public static final class BadRequest extends HTTPStatusException { public BadRequest(@Nullable String description, @Nullable Throwable e, @NotNull HeaderCollection headers) {
/*  30 */       super(description, "Bad Request", e, headers);
/*     */     }
/*     */     @Deprecated(message = "Do not add traceId manually")
/*     */     public BadRequest(@Nullable String description, @Nullable Throwable e, @Nullable String traceId) {
/*  34 */       this(description, e, HTTPStatusExceptionKt.access$fromTraceId(HeaderCollection.Companion, traceId));
/*     */     } }
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\003\n\002\030\002\n\002\b\002\030\0002\0020\001B+\b\027\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\003¢\006\002\020\007B%\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\006\020\b\032\0020\t¢\006\002\020\n¨\006\013"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$Unauthorized;", "Lai/grazie/model/cloud/exceptions/HTTPStatusException$AccessProhibited;", "description", "", "e", "", "traceId", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "model-cloud"})
/*     */   public static final class Unauthorized extends AccessProhibited { public Unauthorized(@Nullable String description, @Nullable Throwable e, @NotNull HeaderCollection headers) {
/*  38 */       super(description, "Unauthorized", e, headers);
/*     */     }
/*     */     @Deprecated(message = "Do not add traceId manually")
/*     */     public Unauthorized(@Nullable String description, @Nullable Throwable e, @Nullable String traceId) {
/*  42 */       this(description, e, HTTPStatusExceptionKt.access$fromTraceId(HeaderCollection.Companion, traceId));
/*     */     } }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\003\n\002\030\002\n\002\b\002\030\0002\0020\001B+\b\027\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\003¢\006\002\020\007B%\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\006\020\b\032\0020\t¢\006\002\020\n¨\006\013"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$Forbidden;", "Lai/grazie/model/cloud/exceptions/HTTPStatusException$AccessProhibited;", "description", "", "e", "", "traceId", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "model-cloud"})
/*     */   public static final class Forbidden extends AccessProhibited { public Forbidden(@Nullable String description, @Nullable Throwable e, @NotNull HeaderCollection headers) {
/*  47 */       super(description, "Forbidden", e, headers);
/*     */     }
/*     */     @Deprecated(message = "Do not add traceId manually")
/*     */     public Forbidden(@Nullable String description, @Nullable Throwable e, @Nullable String traceId) {
/*  51 */       this(description, e, HTTPStatusExceptionKt.access$fromTraceId(HeaderCollection.Companion, traceId));
/*     */     } }
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\003\n\002\030\002\n\002\b\002\030\0002\0020\001B+\b\027\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\003¢\006\002\020\007B%\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\006\020\b\032\0020\t¢\006\002\020\n¨\006\013"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$NotFound;", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "description", "", "e", "", "traceId", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "model-cloud"})
/*     */   public static final class NotFound extends HTTPStatusException { public NotFound(@Nullable String description, @Nullable Throwable e, @NotNull HeaderCollection headers) {
/*  55 */       super(description, "Not Found", e, headers);
/*     */     }
/*     */     @Deprecated(message = "Do not add traceId manually")
/*     */     public NotFound(@Nullable String description, @Nullable Throwable e, @Nullable String traceId) {
/*  59 */       this(description, e, HTTPStatusExceptionKt.access$fromTraceId(HeaderCollection.Companion, traceId));
/*     */     } }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\003\n\002\030\002\n\002\b\002\030\0002\0020\001B+\b\027\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\003¢\006\002\020\007B%\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\006\020\b\032\0020\t¢\006\002\020\n¨\006\013"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$RequestTimeout;", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "description", "", "e", "", "traceId", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "model-cloud"})
/*     */   public static final class RequestTimeout extends HTTPStatusException { public RequestTimeout(@Nullable String description, @Nullable Throwable e, @NotNull HeaderCollection headers) {
/*  64 */       super(description, "Request Timeout", e, headers);
/*     */     }
/*     */     @Deprecated(message = "Do not add traceId manually")
/*     */     public RequestTimeout(@Nullable String description, @Nullable Throwable e, @Nullable String traceId) {
/*  68 */       this(description, e, HTTPStatusExceptionKt.access$fromTraceId(HeaderCollection.Companion, traceId));
/*     */     } }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\003\n\002\030\002\n\002\b\002\030\0002\0020\001B+\b\027\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\003¢\006\002\020\007B%\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\006\020\b\032\0020\t¢\006\002\020\n¨\006\013"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$Conflict;", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "description", "", "e", "", "traceId", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "model-cloud"})
/*     */   public static final class Conflict extends HTTPStatusException { public Conflict(@Nullable String description, @Nullable Throwable e, @NotNull HeaderCollection headers) {
/*  73 */       super(description, "Conflict", e, headers);
/*     */     }
/*     */     @Deprecated(message = "Do not add traceId manually")
/*     */     public Conflict(@Nullable String description, @Nullable Throwable e, @Nullable String traceId) {
/*  77 */       this(description, e, HTTPStatusExceptionKt.access$fromTraceId(HeaderCollection.Companion, traceId));
/*     */     } }
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\003\n\002\030\002\n\002\b\002\030\0002\0020\001B+\b\027\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\003¢\006\002\020\007B%\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\006\020\b\032\0020\t¢\006\002\020\n¨\006\013"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$LengthRequired;", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "description", "", "e", "", "traceId", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "model-cloud"})
/*     */   public static final class LengthRequired extends HTTPStatusException { public LengthRequired(@Nullable String description, @Nullable Throwable e, @NotNull HeaderCollection headers) {
/*  81 */       super(description, "Length Required", e, headers);
/*     */     }
/*     */     @Deprecated(message = "Do not add traceId manually")
/*     */     public LengthRequired(@Nullable String description, @Nullable Throwable e, @Nullable String traceId) {
/*  85 */       this(description, e, HTTPStatusExceptionKt.access$fromTraceId(HeaderCollection.Companion, traceId));
/*     */     } }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\003\n\002\030\002\n\002\b\002\030\0002\0020\001B+\b\027\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\003¢\006\002\020\007B%\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\006\020\b\032\0020\t¢\006\002\020\n¨\006\013"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$PreconditionFailed;", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "description", "", "e", "", "traceId", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "model-cloud"})
/*     */   public static final class PreconditionFailed extends HTTPStatusException { public PreconditionFailed(@Nullable String description, @Nullable Throwable e, @NotNull HeaderCollection headers) {
/*  90 */       super(description, "Precondition Failed", e, headers);
/*     */     }
/*     */     @Deprecated(message = "Do not add traceId manually")
/*     */     public PreconditionFailed(@Nullable String description, @Nullable Throwable e, @Nullable String traceId) {
/*  94 */       this(description, e, HTTPStatusExceptionKt.access$fromTraceId(HeaderCollection.Companion, traceId));
/*     */     } }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\003\n\002\030\002\n\002\b\002\030\0002\0020\001B+\b\027\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\003¢\006\002\020\007B%\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\006\020\b\032\0020\t¢\006\002\020\n¨\006\013"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$ContentTooLarge;", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "description", "", "e", "", "traceId", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "model-cloud"})
/*     */   public static final class ContentTooLarge extends HTTPStatusException { public ContentTooLarge(@Nullable String description, @Nullable Throwable e, @NotNull HeaderCollection headers) {
/*  99 */       super(description, "Content Too Large", e, headers);
/*     */     }
/*     */     @Deprecated(message = "Do not add traceId manually")
/*     */     public ContentTooLarge(@Nullable String description, @Nullable Throwable e, @Nullable String traceId) {
/* 103 */       this(description, e, HTTPStatusExceptionKt.access$fromTraceId(HeaderCollection.Companion, traceId));
/*     */     } }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\003\n\002\030\002\n\002\b\002\030\0002\0020\001B+\b\027\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\003¢\006\002\020\007B%\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\006\020\b\032\0020\t¢\006\002\020\n¨\006\013"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$UnprocessableContent;", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "description", "", "e", "", "traceId", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "model-cloud"})
/*     */   public static final class UnprocessableContent extends HTTPStatusException { public UnprocessableContent(@Nullable String description, @Nullable Throwable e, @NotNull HeaderCollection headers) {
/* 108 */       super(description, "Unprocessable Content", e, headers);
/*     */     }
/*     */     @Deprecated(message = "Do not add traceId manually")
/*     */     public UnprocessableContent(@Nullable String description, @Nullable Throwable e, @Nullable String traceId) {
/* 112 */       this(description, e, HTTPStatusExceptionKt.access$fromTraceId(HeaderCollection.Companion, traceId));
/*     */     } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\030\0002\0020\001B7\b\027\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\007\022\n\b\002\020\b\032\004\030\0010\003¢\006\002\020\tB%\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\006\020\n\032\0020\013¢\006\002\020\fR\023\020\006\032\004\030\0010\007¢\006\b\n\000\032\004\b\r\020\016¨\006\017"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$TooManyRequests;", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "description", "", "e", "", "retryAfter", "Lai/grazie/utils/mpp/time/Duration;", "traceId", "(Ljava/lang/String;Ljava/lang/Throwable;Lai/grazie/utils/mpp/time/Duration;Ljava/lang/String;)V", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "getRetryAfter", "()Lai/grazie/utils/mpp/time/Duration;", "model-cloud"})
/*     */   @SourceDebugExtension({"SMAP\nHTTPStatusException.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HTTPStatusException.kt\nai/grazie/model/cloud/exceptions/HTTPStatusException$TooManyRequests\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n1#2:282\n*E\n"})
/*     */   public static final class TooManyRequests extends HTTPStatusException { @Nullable
/*     */     private final Duration retryAfter; public TooManyRequests(@Nullable String description, @Nullable Throwable e, @NotNull HeaderCollection headers) {
/* 117 */       super(description, "Too Many Requests", e, headers);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 123 */       HeaderCollection headerCollection = headers;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 282 */       TooManyRequests tooManyRequests = this; int $i$a$-let-HTTPStatusException$TooManyRequests$retryAfter$1 = 0;
/*     */       tooManyRequests.retryAfter = HTTPStatusException.Companion.getRetryAfter(headerCollection);
/*     */     }
/*     */     
/*     */     @Deprecated(message = "Do not add traceId manually")
/*     */     public TooManyRequests(@Nullable String description, @Nullable Throwable e, @Nullable Duration retryAfter, @Nullable String traceId) {
/*     */       this(description, e, HTTPStatusExceptionKt.access$fromTraceIdAndRetryAfter(HeaderCollection.Companion, retryAfter, traceId));
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Duration getRetryAfter() {
/*     */       return this.retryAfter;
/*     */     } }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\003\n\002\030\002\n\002\b\002\030\0002\0020\001B+\b\027\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\003¢\006\002\020\007B%\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\006\020\b\032\0020\t¢\006\002\020\n¨\006\013"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$UnavailableForLegalReasons;", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "description", "", "e", "", "traceId", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "model-cloud"})
/*     */   public static final class UnavailableForLegalReasons extends HTTPStatusException {
/*     */     public UnavailableForLegalReasons(@Nullable String description, @Nullable Throwable e, @NotNull HeaderCollection headers) {
/*     */       super(description, "Unavailable For Legal Reasons", e, headers);
/*     */     }
/*     */     
/*     */     @Deprecated(message = "Do not add traceId manually")
/*     */     public UnavailableForLegalReasons(@Nullable String description, @Nullable Throwable e, @Nullable String traceId) {
/*     */       this(description, e, HTTPStatusExceptionKt.access$fromTraceId(HeaderCollection.Companion, traceId));
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\003\n\002\030\002\n\002\b\002\030\0002\0020\001B+\b\027\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\003¢\006\002\020\007B%\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\006\020\b\032\0020\t¢\006\002\020\n¨\006\013"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$OutOfQuota;", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "description", "", "e", "", "traceId", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "model-cloud"})
/*     */   public static final class OutOfQuota extends HTTPStatusException {
/*     */     public OutOfQuota(@Nullable String description, @Nullable Throwable e, @NotNull HeaderCollection headers) {
/*     */       super(description, "Out of quota", e, headers);
/*     */     }
/*     */     
/*     */     @Deprecated(message = "Do not add traceId manually")
/*     */     public OutOfQuota(@Nullable String description, @Nullable Throwable e, @Nullable String traceId) {
/*     */       this(description, e, HTTPStatusExceptionKt.access$fromTraceId(HeaderCollection.Companion, traceId));
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\003\n\002\030\002\n\002\b\002\030\0002\0020\001B+\b\027\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\003¢\006\002\020\007B%\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\006\020\b\032\0020\t¢\006\002\020\n¨\006\013"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$OutOfApplicationQuota;", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "description", "", "e", "", "traceId", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "model-cloud"})
/*     */   public static final class OutOfApplicationQuota extends HTTPStatusException {
/*     */     public OutOfApplicationQuota(@Nullable String description, @Nullable Throwable e, @NotNull HeaderCollection headers) {
/*     */       super(description, "Out of Application Quota", e, headers);
/*     */     }
/*     */     
/*     */     @Deprecated(message = "Do not add traceId manually")
/*     */     public OutOfApplicationQuota(@Nullable String description, @Nullable Throwable e, @Nullable String traceId) {
/*     */       this(description, e, HTTPStatusExceptionKt.access$fromTraceId(HeaderCollection.Companion, traceId));
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\003\n\002\030\002\n\002\b\002\030\0002\0020\001B+\b\027\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\003¢\006\002\020\007B%\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\006\020\b\032\0020\t¢\006\002\020\n¨\006\013"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$DetachedQuotaUsage;", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "description", "", "e", "", "traceId", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "model-cloud"})
/*     */   public static final class DetachedQuotaUsage extends HTTPStatusException {
/*     */     public DetachedQuotaUsage(@Nullable String description, @Nullable Throwable e, @NotNull HeaderCollection headers) {
/*     */       super(description, "Forbidden Quota Usage", e, headers);
/*     */     }
/*     */     
/*     */     @Deprecated(message = "Do not add traceId manually")
/*     */     public DetachedQuotaUsage(@Nullable String description, @Nullable Throwable e, @Nullable String traceId) {
/*     */       this(description, e, HTTPStatusExceptionKt.access$fromTraceId(HeaderCollection.Companion, traceId));
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\003\n\002\030\002\n\002\b\002\030\0002\0020\001B+\b\027\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\003¢\006\002\020\007B%\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\006\020\b\032\0020\t¢\006\002\020\n¨\006\013"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$OutOfStorage;", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "description", "", "e", "", "traceId", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "model-cloud"})
/*     */   public static final class OutOfStorage extends HTTPStatusException {
/*     */     public OutOfStorage(@Nullable String description, @Nullable Throwable e, @NotNull HeaderCollection headers) {
/*     */       super(description, "Out of storage", e, headers);
/*     */     }
/*     */     
/*     */     @Deprecated(message = "Do not add traceId manually")
/*     */     public OutOfStorage(@Nullable String description, @Nullable Throwable e, @Nullable String traceId) {
/*     */       this(description, e, HTTPStatusExceptionKt.access$fromTraceId(HeaderCollection.Companion, traceId));
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\003\n\002\030\002\n\002\b\002\030\0002\0020\001B+\b\027\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\003¢\006\002\020\007B%\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\006\020\b\032\0020\t¢\006\002\020\n¨\006\013"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$ClosedRequest;", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "description", "", "e", "", "traceId", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "model-cloud"})
/*     */   public static final class ClosedRequest extends HTTPStatusException {
/*     */     public ClosedRequest(@Nullable String description, @Nullable Throwable e, @NotNull HeaderCollection headers) {
/*     */       super(description, "Closed request", e, headers);
/*     */     }
/*     */     
/*     */     @Deprecated(message = "Do not add traceId manually")
/*     */     public ClosedRequest(@Nullable String description, @Nullable Throwable e, @Nullable String traceId) {
/*     */       this(description, e, HTTPStatusExceptionKt.access$fromTraceId(HeaderCollection.Companion, traceId));
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\003\n\002\030\002\n\002\b\002\030\0002\0020\001B+\b\027\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\003¢\006\002\020\007B%\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\006\020\b\032\0020\t¢\006\002\020\n¨\006\013"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$InternalServerError;", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "description", "", "e", "", "traceId", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "model-cloud"})
/*     */   public static final class InternalServerError extends HTTPStatusException {
/*     */     public InternalServerError(@Nullable String description, @Nullable Throwable e, @NotNull HeaderCollection headers) {
/*     */       super(description, "Internal Server Error", e, headers);
/*     */     }
/*     */     
/*     */     @Deprecated(message = "Do not add traceId manually")
/*     */     public InternalServerError(@Nullable String description, @Nullable Throwable e, @Nullable String traceId) {
/*     */       this(description, e, HTTPStatusExceptionKt.access$fromTraceId(HeaderCollection.Companion, traceId));
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\002\n\002\030\002\n\000\n\002\020$\n\002\020 \n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J.\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\n\b\002\020\t\032\004\030\0010\n2\n\b\002\020\013\032\004\030\0010\fJ8\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\n\b\002\020\t\032\004\030\0010\n2\n\b\002\020\013\032\004\030\0010\f2\006\020\r\032\0020\nH\007J\022\020\016\032\004\030\0010\0172\006\020\007\032\0020\bH\002J4\020\020\032\0020\0042\006\020\005\032\0020\0062\n\b\002\020\t\032\004\030\0010\n2\n\b\002\020\013\032\004\030\0010\f2\n\b\002\020\r\032\004\030\0010\nH\007JN\020\020\032\0020\0042\006\020\005\032\0020\0062\030\020\007\032\024\022\004\022\0020\n\022\n\022\b\022\004\022\0020\n0\0220\0212\n\b\002\020\t\032\004\030\0010\n2\n\b\002\020\013\032\004\030\0010\f2\n\b\002\020\r\032\004\030\0010\nH\007¨\006\023"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$Companion;", "", "()V", "from", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "code", "", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "description", "", "e", "", "traceId", "getRetryAfter", "Lai/grazie/utils/mpp/time/Duration;", "of", "", "", "model-cloud"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @Deprecated(message = "in favor of from method", replaceWith = @ReplaceWith(expression = "from(code, headers, description, e)", imports = {}))
/*     */     @NotNull
/*     */     public final HTTPStatusException of(int code, @Nullable String description, @Nullable Throwable e, @Nullable String traceId) {
/*     */       return of(code, MapsKt.emptyMap(), description, e, traceId);
/*     */     }
/*     */     
/*     */     @Deprecated(message = "broken contract method, will be removed", replaceWith = @ReplaceWith(expression = "from(code, headers, description, e)", imports = {}))
/*     */     @NotNull
/*     */     public final HTTPStatusException of(int code, @NotNull Map headers, @Nullable String description, @Nullable Throwable e, @Nullable String traceId) {
/*     */       Intrinsics.checkNotNullParameter(headers, "headers");
/*     */       HeaderCollection headersCollection = HeaderCollectionKt.of(HeaderCollection.Companion, headers);
/*     */       switch (code) {
/*     */         case 400:
/*     */         
/*     */         case 401:
/*     */         
/*     */         case 403:
/*     */         
/*     */         case 404:
/*     */         
/*     */         case 409:
/*     */         
/*     */         case 411:
/*     */         
/*     */         case 412:
/*     */         
/*     */         case 413:
/*     */         
/*     */         case 422:
/*     */         
/*     */         case 429:
/*     */         
/*     */         case 451:
/*     */         
/*     */         case 477:
/*     */         
/*     */         case 478:
/*     */         
/*     */         case 480:
/*     */         
/*     */         case 493:
/*     */         
/*     */         case 499:
/*     */         
/*     */         case 500:
/*     */         
/*     */       } 
/*     */       return new HTTPStatusException(code, description, e, headersCollection);
/*     */     }
/*     */     
/*     */     @Deprecated(message = "Remove traceId parameter", replaceWith = @ReplaceWith(expression = "from(code, headers, description, e)", imports = {}))
/*     */     @NotNull
/*     */     public final HTTPStatusException from(int code, @NotNull HeaderCollection headers, @Nullable String description, @Nullable Throwable e, @NotNull String traceId) {
/*     */       Intrinsics.checkNotNullParameter(headers, "headers");
/*     */       Intrinsics.checkNotNullParameter(traceId, "traceId");
/*     */       return from(code, headers, description, e);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final HTTPStatusException from(int code, @NotNull HeaderCollection headers, @Nullable String description, @Nullable Throwable e) {
/*     */       Intrinsics.checkNotNullParameter(headers, "headers");
/*     */       switch (code) {
/*     */         case 400:
/*     */         
/*     */         case 401:
/*     */         
/*     */         case 403:
/*     */         
/*     */         case 404:
/*     */         
/*     */         case 409:
/*     */         
/*     */         case 411:
/*     */         
/*     */         case 412:
/*     */         
/*     */         case 413:
/*     */         
/*     */         case 422:
/*     */         
/*     */         case 429:
/*     */         
/*     */         case 451:
/*     */         
/*     */         case 477:
/*     */         
/*     */         case 478:
/*     */         
/*     */         case 480:
/*     */         
/*     */         case 493:
/*     */         
/*     */         case 499:
/*     */         
/*     */         case 500:
/*     */         
/*     */       } 
/*     */       return new HTTPStatusException(code, description, e, headers);
/*     */     }
/*     */     
/*     */     private final Duration getRetryAfter(HeaderCollection headers) {
/*     */       String value = (String)ArraysKt.singleOrNull((Object[])headers.get("Retry-After"));
/*     */       int $i$a$-let-HTTPStatusException$Companion$getRetryAfter$1 = 0;
/*     */       try {
/*     */         Timestamp date = Timestamp.Companion.ofHttpDate(value);
/*     */         return date.between(Timestamp.Companion.now());
/*     */       } catch (Exception ignored) {
/*     */         if (StringsKt.toIntOrNull(value) != null) {
/*     */           int retryAfterSeconds = StringsKt.toIntOrNull(value).intValue(), $i$a$-let-HTTPStatusException$Companion$getRetryAfter$1$1 = 0;
/*     */           return Duration.Companion.seconds(retryAfterSeconds);
/*     */         } 
/*     */         StringsKt.toIntOrNull(value);
/*     */       } 
/*     */       (String)ArraysKt.singleOrNull((Object[])headers.get("Retry-After"));
/*     */       value = (String)ArraysKt.singleOrNull((Object[])headers.get("Retry-After-Ms"));
/*     */       int $i$a$-let-HTTPStatusException$Companion$getRetryAfter$2 = 0;
/*     */       if (StringsKt.toIntOrNull(value) != null) {
/*     */         int retryAfterMs = StringsKt.toIntOrNull(value).intValue(), $i$a$-let-HTTPStatusException$Companion$getRetryAfter$2$1 = 0;
/*     */         return Duration.Companion.millis(retryAfterMs);
/*     */       } 
/*     */       StringsKt.toIntOrNull(value);
/*     */       (String)ArraysKt.singleOrNull((Object[])headers.get("Retry-After-Ms"));
/*     */       return null;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\exceptions\HTTPStatusException.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */