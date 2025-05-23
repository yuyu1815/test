/*    */ package ai.grazie.api.gateway.client;
/*    */ 
/*    */ import ai.grazie.api.gateway.client.api.UserAPIClient;
/*    */ import ai.grazie.client.common.SuspendableHTTPClient;
/*    */ import ai.grazie.client.common.logging.AnnotationLogger;
/*    */ import ai.grazie.client.common.websocket.SuspendableWebSocketClient;
/*    */ import ai.grazie.model.cloud.AuthType;
/*    */ import ai.grazie.model.task.SuspendableTasksService;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import ai.grazie.utils.mpp.MPPLogger;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\030\0002\0020\001BE\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\b\b\002\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n\022\b\b\002\020\013\032\0020\f\022\n\b\002\020\r\032\004\030\0010\016¢\006\002\020\017R\032\020\020\032\0020\021X\016¢\006\016\n\000\032\004\b\022\020\023\"\004\b\024\020\025R\021\020\026\032\0020\027¢\006\b\n\000\032\004\b\030\020\031¨\006\032"}, d2 = {"Lai/grazie/api/gateway/client/SuspendableAPIGatewayWSClient;", "Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;", "serverUrl", "", "wsServerUrl", "authType", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "wsClient", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient;", "annotationsLogger", "Lai/grazie/utils/mpp/MPPLogger;", "customTasksClient", "Lai/grazie/model/task/SuspendableTasksService;", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/client/common/websocket/SuspendableWebSocketClient;Lai/grazie/utils/mpp/MPPLogger;Lai/grazie/model/task/SuspendableTasksService;)V", "annotationLogger", "Lai/grazie/client/common/logging/AnnotationLogger;", "getAnnotationLogger", "()Lai/grazie/client/common/logging/AnnotationLogger;", "setAnnotationLogger", "(Lai/grazie/client/common/logging/AnnotationLogger;)V", "user", "Lai/grazie/api/gateway/client/api/UserAPIClient;", "getUser", "()Lai/grazie/api/gateway/client/api/UserAPIClient;", "api-gateway-client"})
/*    */ public final class SuspendableAPIGatewayWSClient extends SuspendableAPIGatewayClient {
/*    */   @NotNull
/*    */   private AnnotationLogger annotationLogger;
/*    */   
/* 20 */   public SuspendableAPIGatewayWSClient(@NotNull String serverUrl, @NotNull String wsServerUrl, @NotNull AuthType authType, @NotNull SuspendableHTTPClient httpClient, @NotNull SuspendableWebSocketClient wsClient, @NotNull MPPLogger annotationsLogger, @Nullable SuspendableTasksService customTasksClient) { super(serverUrl, httpClient, authType, null, annotationsLogger, customTasksClient, 8, null);
/* 21 */     this.annotationLogger = AnnotationLogger.Companion.gatewayLogger(annotationsLogger);
/*    */     
/* 23 */     this.user = new UserAPIClient(serverUrl, wsServerUrl, httpClient, (SuspendableWebSocketClient)new SuspendableWebSocketClient.WithV5(wsClient), (JSON)JSON.Default.INSTANCE, authType, getAnnotationLogger()); } @NotNull private final UserAPIClient user; @NotNull public final UserAPIClient getUser() { return this.user; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public AnnotationLogger getAnnotationLogger() {
/*    */     return this.annotationLogger;
/*    */   }
/*    */   
/*    */   public void setAnnotationLogger(@NotNull AnnotationLogger <set-?>) {
/*    */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*    */     this.annotationLogger = <set-?>;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\SuspendableAPIGatewayWSClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */