/*    */ package ai.grazie.api.gateway.client.api;
/*    */ 
/*    */ import ai.grazie.client.common.logging.AnnotationLogger;
/*    */ import ai.grazie.model.cloud.API;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\002\n\000\n\002\020 \n\002\b\002\030\0002\0020\001B/\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013¢\006\002\020\fJ\034\020\021\032\0020\0222\f\020\023\032\b\022\004\022\0020\0030\024H@¢\006\002\020\025R\032\020\n\032\0020\013X\016¢\006\016\n\000\032\004\b\r\020\016\"\004\b\017\020\020¨\006\026"}, d2 = {"Lai/grazie/api/gateway/client/api/EnterpriseQuotaAPIClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "serverUrl", "", "authType", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "annotationLogger", "Lai/grazie/client/common/logging/AnnotationLogger;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;Lai/grazie/client/common/logging/AnnotationLogger;)V", "getAnnotationLogger", "()Lai/grazie/client/common/logging/AnnotationLogger;", "setAnnotationLogger", "(Lai/grazie/client/common/logging/AnnotationLogger;)V", "updateMembers", "", "enabledUsers", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nEnterpriseQuotaAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterpriseQuotaAPIClient.kt\nai/grazie/api/gateway/client/api/EnterpriseQuotaAPIClient\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n*L\n1#1,19:1\n62#2,6:20\n*S KotlinDebug\n*F\n+ 1 EnterpriseQuotaAPIClient.kt\nai/grazie/api/gateway/client/api/EnterpriseQuotaAPIClient\n*L\n16#1:20,6\n*E\n"})
/*    */ public final class EnterpriseQuotaAPIClient extends SuspendableCloudClient {
/*    */   @NotNull
/* 12 */   public AnnotationLogger getAnnotationLogger() { return this.annotationLogger; } @NotNull private AnnotationLogger annotationLogger; public void setAnnotationLogger(@NotNull AnnotationLogger <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.annotationLogger = <set-?>; }
/* 13 */   public EnterpriseQuotaAPIClient(@NotNull String serverUrl, @NotNull AuthType authType, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json, @NotNull AnnotationLogger annotationLogger) { super(serverUrl, authType, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */     this.annotationLogger = annotationLogger; } @Nullable
/*    */   public final Object updateMembers(@NotNull List enabledUsers, @NotNull Continuation $completion) {
/* 16 */     API aPI = (API)EnterpriseQuotaAPI.UpdateMembers.INSTANCE; Object content$iv = new EnterpriseQuotaAPI.UpdateMembers.Request(enabledUsers);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 23 */     RequestOptions options$iv = new RequestOptions(null, null, 3, null);
/* 24 */     JSON json$iv = getJson(); int $i$f$sendAndGet = 0;
/* 25 */     if (AnnotationLoggingKt.withAnnotationsLog(this, new EnterpriseQuotaAPIClient$updateMembers$$inlined$sendAndGet$default$1(aPI, json$iv, content$iv, options$iv, null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return AnnotationLoggingKt.withAnnotationsLog(this, new EnterpriseQuotaAPIClient$updateMembers$$inlined$sendAndGet$default$1(aPI, json$iv, content$iv, options$iv, null), $completion);  AnnotationLoggingKt.withAnnotationsLog(this, new EnterpriseQuotaAPIClient$updateMembers$$inlined$sendAndGet$default$1(aPI, json$iv, content$iv, options$iv, null), $completion); return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\EnterpriseQuotaAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */