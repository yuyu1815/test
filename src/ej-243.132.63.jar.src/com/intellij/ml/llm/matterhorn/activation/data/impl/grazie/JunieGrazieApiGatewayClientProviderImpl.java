/*    */ package com.intellij.ml.llm.matterhorn.activation.data.impl.grazie;
/*    */ 
/*    */ import ai.grazie.api.gateway.client.DefaultUrlResolver;
/*    */ import ai.grazie.api.gateway.client.SuspendableAPIGatewayClient;
/*    */ import ai.grazie.api.gateway.client.UrlResolver;
/*    */ import ai.grazie.client.common.SuspendableHTTPClient;
/*    */ import ai.grazie.model.cloud.AuthType;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.GrazieAuthData;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.GrazieAuthOrigin;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.SimpleHttpHeaders;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\027\020\006\032\0020\0072\006\020\b\032\0020\tH\026¢\006\004\b\n\020\013J\037\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\021H\026¢\006\004\b\022\020\023J\027\020\024\032\0020\r2\006\020\016\032\0020\017H\026¢\006\004\b\025\020\026R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieApiGatewayClientProviderImpl;", "Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieApiGatewayClientProvider;", "<init>", "()V", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "urlResolver", "Lai/grazie/api/gateway/client/UrlResolver;", "configJsonUrl", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieConfigJsonUrl;", "urlResolver-Z6l-X28", "(Ljava/lang/String;)Lai/grazie/api/gateway/client/UrlResolver;", "authorizedApiClient", "Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;", "apiUrl", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieApiUrl;", "authData", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;", "authorizedApiClient-62T2iwg", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;)Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;", "unauthorizedApiClient", "unauthorizedApiClient-Nmbes7A", "(Ljava/lang/String;)Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;", "data.impl.grazie"})
/*    */ final class JunieGrazieApiGatewayClientProviderImpl
/*    */   implements JunieGrazieApiGatewayClientProvider
/*    */ {
/*    */   @NotNull
/* 28 */   private final SuspendableHTTPClient httpClient = GrazieHttpClientUtil.INSTANCE.createHttpClient();
/*    */   @NotNull
/*    */   public UrlResolver urlResolver-Z6l-X28(@NotNull String configJsonUrl) {
/* 31 */     Intrinsics.checkNotNullParameter(configJsonUrl, "configJsonUrl"); return (UrlResolver)new DefaultUrlResolver(configJsonUrl, this.httpClient);
/*    */   }
/*    */   @NotNull
/*    */   public SuspendableAPIGatewayClient authorizedApiClient-62T2iwg(@NotNull String apiUrl, @NotNull GrazieAuthData authData) {
/* 35 */     Intrinsics.checkNotNullParameter(apiUrl, "apiUrl"); Intrinsics.checkNotNullParameter(authData, "authData"); SuspendableHTTPClient authorizedHttpClient = GrazieHttpClientUtil.INSTANCE.withCloudAuth-P03y53I$data_impl_grazie(this.httpClient, authData.getRequestHeaders-yd9Q308());
/* 36 */     AuthType authType = (authData.getOrigin() == GrazieAuthOrigin.AuthDevApplication) ? AuthType.Application : AuthType.User;
/* 37 */     return new SuspendableAPIGatewayClient(apiUrl, authorizedHttpClient, authType, null, null, null, 56, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public SuspendableAPIGatewayClient unauthorizedApiClient-Nmbes7A(@NotNull String apiUrl) {
/* 42 */     Intrinsics.checkNotNullParameter(apiUrl, "apiUrl"); SuspendableHTTPClient httpClientWithFakeCloudAuth = GrazieHttpClientUtil.INSTANCE.withCloudAuth-P03y53I$data_impl_grazie(this.httpClient, SimpleHttpHeaders.Companion.empty-yd9Q308());
/* 43 */     return new SuspendableAPIGatewayClient(apiUrl, httpClientWithFakeCloudAuth, null, null, null, null, 60, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\impl\grazie\JunieGrazieApiGatewayClientProviderImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */