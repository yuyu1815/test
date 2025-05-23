/*     */ package ai.grazie.model.cloud.exceptions;
/*     */ 
/*     */ import ai.grazie.model.cloud.HeaderCollection;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\003\n\002\030\002\n\002\b\002\030\0002\0020\001B+\b\027\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\n\b\002\020\006\032\004\030\0010\003¢\006\002\020\007B%\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\006\020\b\032\0020\t¢\006\002\020\n¨\006\013"}, d2 = {"Lai/grazie/model/cloud/exceptions/HTTPStatusException$UnavailableForLegalReasons;", "Lai/grazie/model/cloud/exceptions/HTTPStatusException;", "description", "", "e", "", "traceId", "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "model-cloud"})
/*     */ public final class UnavailableForLegalReasons
/*     */   extends HTTPStatusException
/*     */ {
/*     */   public UnavailableForLegalReasons(@Nullable String description, @Nullable Throwable e, @NotNull HeaderCollection headers) {
/* 127 */     super(description, "Unavailable For Legal Reasons", e, headers);
/*     */   }
/*     */   @Deprecated(message = "Do not add traceId manually")
/*     */   public UnavailableForLegalReasons(@Nullable String description, @Nullable Throwable e, @Nullable String traceId) {
/* 131 */     this(description, e, HTTPStatusExceptionKt.access$fromTraceId(HeaderCollection.Companion, traceId));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\exceptions\HTTPStatusException$UnavailableForLegalReasons.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */