/*    */ package ai.grazie.api.gateway.client;
/*    */ import ai.grazie.api.gateway.client.api.AuthAPIClient;
/*    */ import ai.grazie.api.gateway.client.api.meta.NerAPIClient;
/*    */ import ai.grazie.api.gateway.client.api.meta.TreeAPIClient;
/*    */ import ai.grazie.api.gateway.client.api.trf.SumAPIClient;
/*    */ import ai.grazie.api.gateway.client.api.trf.SynAPIClient;
/*    */ import ai.grazie.client.common.SuspendableHTTPClient;
/*    */ import ai.grazie.client.common.logging.AnnotationLogger;
/*    */ import ai.grazie.model.cloud.AuthType;
/*    */ import ai.grazie.model.task.SuspendableTasksService;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import ai.grazie.utils.mpp.MPPLogger;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000~\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\b\026\030\0002\0020\001:\003./0B?\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007\022\b\b\002\020\b\032\0020\t\022\b\b\002\020\n\032\0020\013\022\n\b\002\020\f\032\004\030\0010\r¢\006\002\020\016J\006\020\027\032\0020\030J\006\020\031\032\0020\032J\006\020\033\032\0020\034J\006\020\035\032\0020\036J\f\020\037\032\0060 R\0020\000H\007J\006\020!\032\0020\"J\006\020#\032\0020$J\n\020%\032\0060&R\0020\000J\006\020'\032\0020(J\006\020)\032\0020*J\006\020+\032\0020\rJ\n\020,\032\0060-R\0020\000R\032\020\017\032\0020\020X\016¢\006\016\n\000\032\004\b\021\020\022\"\004\b\023\020\024R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\025\020\026R\020\020\f\032\004\030\0010\rX\004¢\006\002\n\000¨\0061"}, d2 = {"Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "serverUrl", "", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "authType", "Lai/grazie/model/cloud/AuthType;", "json", "Lai/grazie/utils/json/JSON;", "annotationsLogger", "Lai/grazie/utils/mpp/MPPLogger;", "customTasksClient", "Lai/grazie/model/task/SuspendableTasksService;", "(Ljava/lang/String;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/model/cloud/AuthType;Lai/grazie/utils/json/JSON;Lai/grazie/utils/mpp/MPPLogger;Lai/grazie/model/task/SuspendableTasksService;)V", "annotationLogger", "Lai/grazie/client/common/logging/AnnotationLogger;", "getAnnotationLogger", "()Lai/grazie/client/common/logging/AnnotationLogger;", "setAnnotationLogger", "(Lai/grazie/client/common/logging/AnnotationLogger;)V", "getAuthType", "()Lai/grazie/model/cloud/AuthType;", "auth", "Lai/grazie/api/gateway/client/api/AuthAPIClient;", "enterpriseQuota", "Lai/grazie/api/gateway/client/api/EnterpriseQuotaAPIClient;", "feedback", "Lai/grazie/api/gateway/client/api/FeedbackAPIClient;", "gec", "Lai/grazie/api/gateway/client/api/gec/GecAPIClient;", "indexing", "Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient$Indexing;", "licenseServerAuth", "Lai/grazie/api/gateway/client/api/LicenseServerAuthClient;", "llm", "Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;", "meta", "Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient$Meta;", "quota", "Lai/grazie/api/gateway/client/api/QuotaAPIClient;", "tasksAbTesting", "Lai/grazie/api/gateway/client/api/task/TasksABTestingAPIClient;", "tasksWithStreamData", "trf", "Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient$Trf;", "Indexing", "Meta", "Trf", "api-gateway-client"})
/*    */ public class SuspendableAPIGatewayClient extends SuspendableCloudClient {
/*    */   @NotNull
/*    */   private final AuthType authType;
/*    */   
/*    */   @NotNull
/*    */   public AuthType getAuthType() {
/* 25 */     return this.authType;
/*    */   } @Nullable
/*    */   private final SuspendableTasksService customTasksClient; @NotNull
/*    */   private AnnotationLogger annotationLogger; public SuspendableAPIGatewayClient(@NotNull String serverUrl, @NotNull SuspendableHTTPClient httpClient, @NotNull AuthType authType, @NotNull JSON json, @NotNull MPPLogger annotationsLogger, @Nullable SuspendableTasksService customTasksClient) {
/* 29 */     super(serverUrl, authType, httpClient, json, arrayOfAuthVersion); this.authType = authType; this.customTasksClient = customTasksClient;
/* 30 */     this.annotationLogger = AnnotationLogger.Companion.gatewayLogger(annotationsLogger); } @NotNull public AnnotationLogger getAnnotationLogger() { return this.annotationLogger; } public void setAnnotationLogger(@NotNull AnnotationLogger <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.annotationLogger = <set-?>; }
/*    */   @NotNull
/* 32 */   public final AuthAPIClient auth() { return new AuthAPIClient(getServerUrl(), getAuthType(), getHttpClient(), getJson(), getAnnotationLogger()); } @NotNull
/* 33 */   public final LicenseServerAuthClient licenseServerAuth() { return new LicenseServerAuthClient(getServerUrl(), getAuthType(), getHttpClient(), getJson(), getAnnotationLogger()); } @NotNull
/* 34 */   public final QuotaAPIClient quota() { return new QuotaAPIClient(getServerUrl(), getAuthType(), getHttpClient(), getJson(), getAnnotationLogger()); } @NotNull
/* 35 */   public final EnterpriseQuotaAPIClient enterpriseQuota() { return new EnterpriseQuotaAPIClient(getServerUrl(), getAuthType(), getHttpClient(), getJson(), getAnnotationLogger()); } @NotNull
/* 36 */   public final FeedbackAPIClient feedback() { return new FeedbackAPIClient(getServerUrl(), getAuthType(), getHttpClient(), getJson(), getAnnotationLogger()); } @NotNull
/* 37 */   public final GecAPIClient gec() { return new GecAPIClient(getServerUrl(), getAuthType(), getHttpClient(), getJson(), getAnnotationLogger()); }
/*    */   @NotNull
/* 39 */   public final LlmAPIClient llm() { return new LlmAPIClient(getServerUrl(), getAuthType(), getHttpClient(), getJson(), getAnnotationLogger()); }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\004\030\0002\0020\001B\005¢\006\002\020\002J\006\020\003\032\0020\004J\b\020\005\032\0020\006H\007J\b\020\007\032\0020\bH\007J\006\020\t\032\0020\n¨\006\013"}, d2 = {"Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient$Trf;", "", "(Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;)V", "nlc", "Lai/grazie/api/gateway/client/api/trf/NlcAPIClient;", "nmt", "Lai/grazie/api/gateway/client/api/trf/NmtAPIClient;", "sum", "Lai/grazie/api/gateway/client/api/trf/SumAPIClient;", "syn", "Lai/grazie/api/gateway/client/api/trf/SynAPIClient;", "api-gateway-client"})
/*    */   public final class Trf { @NotNull
/* 42 */     public final NlcAPIClient nlc() { return new NlcAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson(), SuspendableAPIGatewayClient.this.getAnnotationLogger()); } @NotNull
/* 43 */     public final SynAPIClient syn() { return new SynAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson(), SuspendableAPIGatewayClient.this.getAnnotationLogger()); } @Deprecated(message = "Nmt service is deprecated, please use TextTranslateTask instead")
/*    */     @NotNull
/* 45 */     public final NmtAPIClient nmt() { return new NmtAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson(), SuspendableAPIGatewayClient.this.getAnnotationLogger()); } @Deprecated(message = "Sum service is deprecated, please use TextSummarizeTask instead")
/*    */     @NotNull
/* 47 */     public final SumAPIClient sum() { return new SumAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson(), SuspendableAPIGatewayClient.this.getAnnotationLogger()); }
/*    */      }
/*    */   @NotNull
/* 50 */   public final Trf trf() { return new Trf(); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\000\b\004\030\0002\0020\001B\005¢\006\002\020\002J\006\020\003\032\0020\004J\006\020\005\032\0020\006J\022\020\007\032\0020\b2\n\b\002\020\t\032\004\030\0010\nJ\006\020\013\032\0020\fJ\006\020\r\032\0020\016J$\020\017\032\0020\0202\n\b\002\020\021\032\004\030\0010\n2\020\b\002\020\022\032\n\022\004\022\0020\n\030\0010\023¨\006\024"}, d2 = {"Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient$Meta;", "", "(Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;)V", "def", "Lai/grazie/api/gateway/client/api/meta/DefAPIClient;", "emb", "Lai/grazie/api/gateway/client/api/meta/EmbAPIClient;", "ner", "Lai/grazie/api/gateway/client/api/meta/NerAPIClient;", "version", "", "qa", "Lai/grazie/api/gateway/client/api/meta/QaAPIClient;", "tone", "Lai/grazie/api/gateway/client/api/meta/ToneAPIClient;", "tree", "Lai/grazie/api/gateway/client/api/meta/TreeAPIClient;", "parser", "options", "", "api-gateway-client"})
/*    */   public final class Meta { @NotNull
/*    */     public final DefAPIClient def() {
/* 53 */       return new DefAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson(), SuspendableAPIGatewayClient.this.getAnnotationLogger());
/*    */     } @NotNull
/*    */     public final NerAPIClient ner(@Nullable String version) {
/* 56 */       return new NerAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), version, SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson(), SuspendableAPIGatewayClient.this.getAnnotationLogger());
/*    */     }
/*    */     @NotNull
/*    */     public final TreeAPIClient tree(@Nullable String parser, @Nullable List options) {
/* 60 */       return new TreeAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), parser, options, SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson(), SuspendableAPIGatewayClient.this.getAnnotationLogger());
/*    */     }
/*    */     @NotNull
/*    */     public final QaAPIClient qa() {
/* 64 */       return new QaAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson(), SuspendableAPIGatewayClient.this.getAnnotationLogger());
/*    */     }
/*    */     @NotNull
/*    */     public final EmbAPIClient emb() {
/* 68 */       return new EmbAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson());
/*    */     }
/*    */     @NotNull
/*    */     public final ToneAPIClient tone() {
/* 72 */       return new ToneAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson(), SuspendableAPIGatewayClient.this.getAnnotationLogger());
/*    */     } }
/*    */   @NotNull
/*    */   public final Meta meta() {
/* 76 */     return new Meta();
/*    */   } @NotNull
/*    */   public final SuspendableTasksService tasksWithStreamData() {
/* 79 */     if (this.customTasksClient == null); return (SuspendableTasksService)new TasksAPIClient(getServerUrl(), getAuthType(), getHttpClient(), getAnnotationLogger());
/*    */   }
/*    */   @NotNull
/* 82 */   public final TasksABTestingAPIClient tasksAbTesting() { return new TasksABTestingAPIClient(getServerUrl(), getAuthType(), getHttpClient(), getAnnotationLogger()); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\b\004\030\0002\0020\001B\005¢\006\002\020\002J\006\020\003\032\0020\004¨\006\005"}, d2 = {"Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient$Indexing;", "", "(Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;)V", "search", "Lai/grazie/api/gateway/client/api/indexing/IndexingSearchClient;", "api-gateway-client"})
/*    */   public final class Indexing { @NotNull
/*    */     public final IndexingSearchClient search() {
/* 85 */       return new IndexingSearchClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson(), SuspendableAPIGatewayClient.this.getAnnotationLogger());
/*    */     } } @ExperimentalAPI
/*    */   @NotNull
/*    */   public final Indexing indexing() {
/* 89 */     return new Indexing();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\SuspendableAPIGatewayClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */