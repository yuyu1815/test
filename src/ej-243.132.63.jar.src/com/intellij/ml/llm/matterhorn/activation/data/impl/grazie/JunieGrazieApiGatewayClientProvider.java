/*    */ package com.intellij.ml.llm.matterhorn.activation.data.impl.grazie;
/*    */ import com.intellij.ml.llm.matterhorn.activation.platform.AiaServiceSupport;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\bf\030\000 \0232\0020\001:\001\023J\027\020\002\032\0020\0032\006\020\004\032\0020\005H&¢\006\004\b\006\020\007J\037\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH&¢\006\004\b\016\020\017J\027\020\020\032\0020\t2\006\020\n\032\0020\013H&¢\006\004\b\021\020\022¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieApiGatewayClientProvider;", "", "urlResolver", "Lai/grazie/api/gateway/client/UrlResolver;", "configJsonUrl", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieConfigJsonUrl;", "urlResolver-Z6l-X28", "(Ljava/lang/String;)Lai/grazie/api/gateway/client/UrlResolver;", "authorizedApiClient", "Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;", "apiUrl", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieApiUrl;", "authData", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;", "authorizedApiClient-62T2iwg", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;)Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;", "unauthorizedApiClient", "unauthorizedApiClient-Nmbes7A", "(Ljava/lang/String;)Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;", "Companion", "data.impl.grazie"})
/*    */ public interface JunieGrazieApiGatewayClientProvider {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   @NotNull
/*    */   UrlResolver urlResolver-Z6l-X28(@NotNull String paramString);
/*    */   
/*    */   @NotNull
/*    */   SuspendableAPIGatewayClient authorizedApiClient-62T2iwg(@NotNull String paramString, @NotNull GrazieAuthData paramGrazieAuthData);
/*    */   
/*    */   @NotNull
/*    */   SuspendableAPIGatewayClient unauthorizedApiClient-Nmbes7A(@NotNull String paramString);
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J\016\020\005\032\0020\002HA¢\006\002\020\006J\017\020\007\032\b\022\004\022\0020\0020\bH\001J\t\020\t\032\0020\002H\001R\032\020\n\032\n\022\006\b\001\022\0020\0020\013X\005¢\006\006\032\004\b\f\020\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieApiGatewayClientProvider$Companion;", "Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport;", "Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieApiGatewayClientProvider;", "<init>", "()V", "instance", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "instanceFlow", "Lkotlinx/coroutines/flow/Flow;", "syncInstance", "keyClass", "Lkotlin/reflect/KClass;", "getKeyClass", "()Lkotlin/reflect/KClass;", "data.impl.grazie"})
/*    */   @SourceDebugExtension({"SMAP\nJunieGrazieApiGatewayClientProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieGrazieApiGatewayClientProvider.kt\ncom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieApiGatewayClientProvider$Companion\n+ 2 AiaServiceSupport.kt\ncom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport$Companion\n*L\n1#1,46:1\n35#2:47\n*S KotlinDebug\n*F\n+ 1 JunieGrazieApiGatewayClientProvider.kt\ncom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/JunieGrazieApiGatewayClientProvider$Companion\n*L\n23#1:47\n*E\n"})
/*    */   public static final class Companion implements AiaServiceSupport<JunieGrazieApiGatewayClientProvider> {
/*    */     private Companion() {
/* 23 */       AiaServiceSupport.Companion this_$iv = AiaServiceSupport.Companion; int $i$f$invoke = 0; this.$$delegate_0 = 
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
/* 47 */         AiaServiceSupportKt.createForServiceInterface(this_$iv, Reflection.getOrCreateKotlinClass(JunieGrazieApiGatewayClientProvider.class));
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public JunieGrazieApiGatewayClientProvider syncInstance() {
/*    */       return (JunieGrazieApiGatewayClientProvider)this.$$delegate_0.syncInstance();
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public Object instance(@NotNull Continuation $completion) {
/*    */       return this.$$delegate_0.instance($completion);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public Flow<JunieGrazieApiGatewayClientProvider> instanceFlow() {
/*    */       return this.$$delegate_0.instanceFlow();
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public KClass<? extends JunieGrazieApiGatewayClientProvider> getKeyClass() {
/*    */       return this.$$delegate_0.getKeyClass();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\impl\grazie\JunieGrazieApiGatewayClientProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */