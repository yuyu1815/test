/*    */ package com.intellij.ml.llm.matterhorn.activation.data.model.result;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.SimpleHttpHeaders;
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.Map;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.LazyKt;
/*    */ import kotlin.LazyThreadSafetyMode;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.collections.MapsKt;
/*    */ import kotlin.enums.EnumEntries;
/*    */ import kotlin.enums.EnumEntriesKt;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.ranges.RangesKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\020\n\000\n\002\020\b\n\000\n\002\030\002\n\002\020\016\n\002\030\002\n\002\030\002\n\002\b\036\b\002\030\000 %2\b\022\004\022\0020\0000\001:\001%B7\b\002\022\006\020\002\032\0020\003\022\034\020\004\032\030\022\006\022\004\030\0010\006\022\004\022\0020\007\022\004\022\0020\b\030\0010\005\022\006\020\t\032\0020\006¢\006\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR'\020\004\032\030\022\006\022\004\030\0010\006\022\004\022\0020\007\022\004\022\0020\b\030\0010\005¢\006\b\n\000\032\004\b\016\020\017R\021\020\t\032\0020\006¢\006\b\n\000\032\004\b\020\020\021j\002\b\022j\002\b\023j\002\b\024j\002\b\025j\002\b\026j\002\b\027j\002\b\030j\002\b\031j\002\b\032j\002\b\033j\002\b\034j\002\b\035j\002\b\036j\002\b\037j\002\b j\002\b!j\002\b\"j\002\b#j\002\b$¨\006&"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpErrorType;", "", "code", "", "simpleConstructor", "Lkotlin/Function2;", "", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/SimpleHttpHeaders;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;", "description", "<init>", "(Ljava/lang/String;IILkotlin/jvm/functions/Function2;Ljava/lang/String;)V", "getCode", "()I", "getSimpleConstructor", "()Lkotlin/jvm/functions/Function2;", "getDescription", "()Ljava/lang/String;", "ErrorBadRequest", "ErrorUnauthorized", "ErrorForbidden", "ErrorNotFound", "ErrorRequestTimeout", "ErrorConflict", "ErrorLengthRequired", "ErrorPreconditionFailed", "ErrorContentTooLarge", "ErrorUnprocessableContent", "ErrorTooManyRequests", "ErrorUnavailableForLegalReasons", "ErrorAgreementNotAccepted", "ErrorOutOfQuota", "ErrorOutOfApplicationQuota", "ErrorOutOfStorage", "ErrorDetachedQuotaUsage", "ErrorClosedRequest", "ErrorInternalServerError", "Companion", "data.model"})
/*    */ @SourceDebugExtension({"SMAP\nGrazieHttpError.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieHttpError.kt\ncom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpErrorType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1202#2,2:89\n1230#2,4:91\n*S KotlinDebug\n*F\n+ 1 GrazieHttpError.kt\ncom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpErrorType\n*L\n80#1:89,2\n80#1:91,4\n*E\n"})
/*    */ public enum GrazieHttpErrorType {
/*    */   @NotNull
/*    */   public static final Companion Companion;
/*    */   private final int code;
/*    */   @Nullable
/*    */   private final Function2<String, SimpleHttpHeaders, GrazieHttpError> simpleConstructor;
/*    */   @NotNull
/*    */   private final String description;
/*    */   @NotNull
/*    */   private static final Lazy<Map<Integer, GrazieHttpErrorType>> codeToTypeMap$delegate;
/*    */   
/*    */   GrazieHttpErrorType(int code, Function2<String, SimpleHttpHeaders, GrazieHttpError> simpleConstructor, String description) {
/*    */     this.code = code;
/*    */     this.simpleConstructor = simpleConstructor;
/*    */     this.description = description;
/*    */   }
/*    */   
/*    */   public final int getCode() {
/*    */     return this.code;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Function2<String, SimpleHttpHeaders, GrazieHttpError> getSimpleConstructor() {
/*    */     return this.simpleConstructor;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getDescription() {
/*    */     return this.description;
/*    */   }
/*    */   
/* 55 */   ErrorBadRequest(400, null.INSTANCE, "Bad Request"),
/* 56 */   ErrorUnauthorized(401, null.INSTANCE, "Unauthorized"),
/* 57 */   ErrorForbidden(403, null.INSTANCE, "Forbidden"),
/* 58 */   ErrorNotFound(404, null.INSTANCE, "Not Found"),
/* 59 */   ErrorRequestTimeout(408, null.INSTANCE, "Request Timeout"),
/* 60 */   ErrorConflict(409, null.INSTANCE, "Conflict"),
/* 61 */   ErrorLengthRequired(411, null.INSTANCE, "Length Required"),
/* 62 */   ErrorPreconditionFailed(412, null.INSTANCE, "Precondition Failed"),
/* 63 */   ErrorContentTooLarge(413, null.INSTANCE, "Content Too Large"),
/* 64 */   ErrorUnprocessableContent(422, null.INSTANCE, "Unprocessable Content"),
/* 65 */   ErrorTooManyRequests(429, null.INSTANCE, "Too Many Requests"),
/* 66 */   ErrorUnavailableForLegalReasons(451, null.INSTANCE, "Unavailable For Legal Reasons"),
/* 67 */   ErrorAgreementNotAccepted(452, null, "Agreement not accepted"),
/* 68 */   ErrorOutOfQuota(477, null.INSTANCE, "Out of quota"),
/* 69 */   ErrorOutOfApplicationQuota(478, null.INSTANCE, "Out of Application Quota"),
/* 70 */   ErrorOutOfStorage(480, null.INSTANCE, "Out of storage"),
/* 71 */   ErrorDetachedQuotaUsage(493, null.INSTANCE, "Forbidden Quota Usage"),
/* 72 */   ErrorClosedRequest(499, null.INSTANCE, "Closed request"),
/* 73 */   ErrorInternalServerError(500, null.INSTANCE, "Internal Server Error"); static { Companion = new Companion(null);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 79 */     codeToTypeMap$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, GrazieHttpErrorType::codeToTypeMap_delegate$lambda$1); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020$\n\002\020\b\n\002\030\002\n\002\b\007\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\f\032\004\030\0010\0072\006\020\r\032\0020\006R'\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\0058BX\002¢\006\f\n\004\b\n\020\013\032\004\b\b\020\t¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpErrorType$Companion;", "", "<init>", "()V", "codeToTypeMap", "", "", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpErrorType;", "getCodeToTypeMap", "()Ljava/util/Map;", "codeToTypeMap$delegate", "Lkotlin/Lazy;", "fromCode", "code", "data.model"}) public static final class Companion { private final Map<Integer, GrazieHttpErrorType> getCodeToTypeMap() { Lazy lazy = GrazieHttpErrorType.codeToTypeMap$delegate; return (Map<Integer, GrazieHttpErrorType>)lazy.getValue(); }
/*    */     
/*    */     private Companion() {}
/*    */     @Nullable
/*    */     public final GrazieHttpErrorType fromCode(int code) {
/* 84 */       return getCodeToTypeMap().get(Integer.valueOf(code));
/*    */     } }
/*    */   private static final Map codeToTypeMap_delegate$lambda$1() {
/*    */     Iterable $this$associateBy$iv = (Iterable)getEntries();
/*    */     int $i$f$associateBy = 0;
/* 89 */     int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associateBy$iv, 10)), 16);
/* 90 */     Iterable iterable1 = $this$associateBy$iv; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(capacity$iv); int $i$f$associateByTo = 0;
/* 91 */     for (Object element$iv$iv : iterable1) {
/* 92 */       GrazieHttpErrorType grazieHttpErrorType = (GrazieHttpErrorType)element$iv$iv; Map<Object, Object> map = destination$iv$iv; int $i$a$-associateBy-GrazieHttpErrorType$Companion$codeToTypeMap$2$1 = 0; map.put(Integer.valueOf(grazieHttpErrorType.code), element$iv$iv);
/*    */     } 
/* 94 */     return destination$iv$iv;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static EnumEntries<GrazieHttpErrorType> getEntries() {
/*    */     return $ENTRIES;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\result\GrazieHttpErrorType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */