/*    */ package ai.grazie.api.gateway.client.api;
/*    */ 
/*    */ import ai.grazie.api.gateway.api.user.EventAPI;
/*    */ import ai.grazie.api.gateway.client.api.user.AttributeUserAPIClient;
/*    */ import ai.grazie.client.attribute.SuspendableAttributeAPIClient;
/*    */ import ai.grazie.client.common.SuspendableHTTPClient;
/*    */ import ai.grazie.client.common.logging.AnnotationLogger;
/*    */ import ai.grazie.client.common.model.RequestOptions;
/*    */ import ai.grazie.client.common.subscription.SuspendableSubscriptionClient;
/*    */ import ai.grazie.client.common.websocket.SuspendableWebSocketClient;
/*    */ import ai.grazie.model.cloud.AuthType;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\030\0002\0020\001B?\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n\022\006\020\013\032\0020\f\022\006\020\r\032\0020\016¢\006\002\020\017R\032\020\r\032\0020\016X\016¢\006\016\n\000\032\004\b\020\020\021\"\004\b\022\020\023R\021\020\024\032\0020\025¢\006\b\n\000\032\004\b\026\020\027R\027\020\030\032\b\022\004\022\0020\0320\031¢\006\b\n\000\032\004\b\033\020\034¨\006\035"}, d2 = {"Lai/grazie/api/gateway/client/api/UserAPIClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "serverUrl", "", "wsServerUrl", "client", "Lai/grazie/client/common/SuspendableHTTPClient;", "wsClient", "Lai/grazie/client/common/websocket/SuspendableWebSocketClient;", "json", "Lai/grazie/utils/json/JSON;", "authType", "Lai/grazie/model/cloud/AuthType;", "annotationLogger", "Lai/grazie/client/common/logging/AnnotationLogger;", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/client/common/websocket/SuspendableWebSocketClient;Lai/grazie/utils/json/JSON;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/logging/AnnotationLogger;)V", "getAnnotationLogger", "()Lai/grazie/client/common/logging/AnnotationLogger;", "setAnnotationLogger", "(Lai/grazie/client/common/logging/AnnotationLogger;)V", "attributes", "Lai/grazie/client/attribute/SuspendableAttributeAPIClient;", "getAttributes", "()Lai/grazie/client/attribute/SuspendableAttributeAPIClient;", "events", "Lai/grazie/client/common/subscription/SuspendableSubscriptionClient$WithSerializer;", "Lai/grazie/api/gateway/api/user/EventAPI$Connect$Response;", "getEvents", "()Lai/grazie/client/common/subscription/SuspendableSubscriptionClient$WithSerializer;", "api-gateway-client"})
/*    */ public final class UserAPIClient extends SuspendableCloudClient {
/*    */   @NotNull
/*    */   private AnnotationLogger annotationLogger;
/*    */   
/*    */   @NotNull
/* 22 */   public AnnotationLogger getAnnotationLogger() { return this.annotationLogger; } @NotNull private final SuspendableAttributeAPIClient attributes; @NotNull private final SuspendableSubscriptionClient.WithSerializer<EventAPI.Connect.Response> events; public void setAnnotationLogger(@NotNull AnnotationLogger <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.annotationLogger = <set-?>; } public UserAPIClient(@NotNull String serverUrl, @NotNull String wsServerUrl, @NotNull SuspendableHTTPClient client, @NotNull SuspendableWebSocketClient wsClient, @NotNull JSON json, @NotNull AuthType authType, @NotNull AnnotationLogger annotationLogger) {
/* 23 */     super(serverUrl, authType, client, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */     this.annotationLogger = annotationLogger;
/* 25 */     this.attributes = (SuspendableAttributeAPIClient)new AttributeUserAPIClient(serverUrl, authType, client, json, getAnnotationLogger());
/* 26 */     this.events = new SuspendableSubscriptionClient.WithSerializer(
/* 27 */         (SuspendableSubscriptionClient)new SuspendableSubscriptionClient.WebSocket(
/* 28 */           wsClient, 
/* 29 */           EventAPI.Connect.INSTANCE.url(wsServerUrl, null, null), 
/* 30 */           new RequestOptions(null, null, 3, null)), 
/*    */         
/* 32 */         EventAPI.Connect.Response.Companion.serializer(), 
/* 33 */         json);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SuspendableAttributeAPIClient getAttributes() {
/*    */     return this.attributes;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SuspendableSubscriptionClient.WithSerializer<EventAPI.Connect.Response> getEvents() {
/*    */     return this.events;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\UserAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */