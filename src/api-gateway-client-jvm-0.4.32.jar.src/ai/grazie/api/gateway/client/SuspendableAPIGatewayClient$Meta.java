/*    */ package ai.grazie.api.gateway.client;
/*    */ 
/*    */ import ai.grazie.api.gateway.client.api.meta.DefAPIClient;
/*    */ import ai.grazie.api.gateway.client.api.meta.EmbAPIClient;
/*    */ import ai.grazie.api.gateway.client.api.meta.NerAPIClient;
/*    */ import ai.grazie.api.gateway.client.api.meta.QaAPIClient;
/*    */ import ai.grazie.api.gateway.client.api.meta.ToneAPIClient;
/*    */ import ai.grazie.api.gateway.client.api.meta.TreeAPIClient;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\000\b\004\030\0002\0020\001B\005¢\006\002\020\002J\006\020\003\032\0020\004J\006\020\005\032\0020\006J\022\020\007\032\0020\b2\n\b\002\020\t\032\004\030\0010\nJ\006\020\013\032\0020\fJ\006\020\r\032\0020\016J$\020\017\032\0020\0202\n\b\002\020\021\032\004\030\0010\n2\020\b\002\020\022\032\n\022\004\022\0020\n\030\0010\023¨\006\024"}, d2 = {"Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient$Meta;", "", "(Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;)V", "def", "Lai/grazie/api/gateway/client/api/meta/DefAPIClient;", "emb", "Lai/grazie/api/gateway/client/api/meta/EmbAPIClient;", "ner", "Lai/grazie/api/gateway/client/api/meta/NerAPIClient;", "version", "", "qa", "Lai/grazie/api/gateway/client/api/meta/QaAPIClient;", "tone", "Lai/grazie/api/gateway/client/api/meta/ToneAPIClient;", "tree", "Lai/grazie/api/gateway/client/api/meta/TreeAPIClient;", "parser", "options", "", "api-gateway-client"})
/*    */ public final class Meta
/*    */ {
/*    */   @NotNull
/*    */   public final DefAPIClient def() {
/* 53 */     return new DefAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson(), SuspendableAPIGatewayClient.this.getAnnotationLogger());
/*    */   } @NotNull
/*    */   public final NerAPIClient ner(@Nullable String version) {
/* 56 */     return new NerAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), version, SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson(), SuspendableAPIGatewayClient.this.getAnnotationLogger());
/*    */   }
/*    */   @NotNull
/*    */   public final TreeAPIClient tree(@Nullable String parser, @Nullable List options) {
/* 60 */     return new TreeAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), parser, options, SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson(), SuspendableAPIGatewayClient.this.getAnnotationLogger());
/*    */   }
/*    */   @NotNull
/*    */   public final QaAPIClient qa() {
/* 64 */     return new QaAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson(), SuspendableAPIGatewayClient.this.getAnnotationLogger());
/*    */   }
/*    */   @NotNull
/*    */   public final EmbAPIClient emb() {
/* 68 */     return new EmbAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson());
/*    */   }
/*    */   @NotNull
/*    */   public final ToneAPIClient tone() {
/* 72 */     return new ToneAPIClient(SuspendableAPIGatewayClient.this.getServerUrl(), SuspendableAPIGatewayClient.this.getAuthType(), SuspendableAPIGatewayClient.this.getHttpClient(), SuspendableAPIGatewayClient.this.getJson(), SuspendableAPIGatewayClient.this.getAnnotationLogger());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\SuspendableAPIGatewayClient$Meta.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */