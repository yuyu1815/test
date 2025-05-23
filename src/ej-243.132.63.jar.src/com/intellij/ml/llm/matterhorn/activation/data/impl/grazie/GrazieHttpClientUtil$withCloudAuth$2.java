/*     */ package com.intellij.ml.llm.matterhorn.activation.data.impl.grazie;
/*     */ 
/*     */ import ai.grazie.client.common.SuspendableHTTPClient;
/*     */ import ai.grazie.client.common.SuspendableWithCloudAuth;
/*     */ import ai.grazie.client.common.model.RequestOptions;
/*     */ import ai.grazie.model.cloud.AuthVersion;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.SimpleHttpHeaders;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003*\001\000\b\n\030\0002\0020\0012\0020\002J\026\020\013\032\0020\f2\006\020\r\032\0020\fH@¢\006\002\020\016R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\t\020\n¨\006\017"}, d2 = {"com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/GrazieHttpClientUtil$withCloudAuth$2", "Lai/grazie/client/common/SuspendableHTTPClient$WithHeaders;", "Lai/grazie/client/common/SuspendableWithCloudAuth;", "baseHTTPClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "getBaseHTTPClient", "()Lai/grazie/client/common/SuspendableHTTPClient;", "authVersion", "Lai/grazie/model/cloud/AuthVersion;", "getAuthVersion", "()Lai/grazie/model/cloud/AuthVersion;", "appendHeaders", "Lai/grazie/client/common/model/RequestOptions;", "options", "(Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data.impl.grazie"})
/*     */ @SourceDebugExtension({"SMAP\nGrazieHttpClientUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieHttpClientUtil.kt\ncom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/GrazieHttpClientUtil$withCloudAuth$2\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,114:1\n216#2,2:115\n*S KotlinDebug\n*F\n+ 1 GrazieHttpClientUtil.kt\ncom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/GrazieHttpClientUtil$withCloudAuth$2\n*L\n83#1:115,2\n*E\n"})
/*     */ public final class GrazieHttpClientUtil$withCloudAuth$2
/*     */   extends SuspendableHTTPClient.WithHeaders
/*     */   implements SuspendableWithCloudAuth
/*     */ {
/*     */   private final SuspendableHTTPClient baseHTTPClient;
/*     */   private final AuthVersion authVersion;
/*     */   
/*     */   GrazieHttpClientUtil$withCloudAuth$2(SuspendableHTTPClient $receiver, Map<String, ? extends String> $authHeaders) {
/*  77 */     super($receiver, null, 2, null);
/*  78 */     this.baseHTTPClient = $receiver;
/*  79 */     this.authVersion = AuthVersion.V5; } public AuthVersion getAuthVersion() { return this.authVersion; } public SuspendableHTTPClient getBaseHTTPClient() {
/*     */     return this.baseHTTPClient;
/*     */   } protected Object appendHeaders(RequestOptions options, Continuation $completion) {
/*  82 */     RequestOptions requestOptions1 = options; Map<String, ? extends String> map = this.$authHeaders; RequestOptions $this$appendHeaders_u24lambda_u241 = requestOptions1; int $i$a$-apply-GrazieHttpClientUtil$withCloudAuth$2$appendHeaders$2 = 0;
/*  83 */     Map $this$forEach$iv = SimpleHttpHeaders.asMap-impl(map); int $i$f$forEach = 0;
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
/* 115 */     Iterator<Map.Entry> iterator = $this$forEach$iv.entrySet().iterator(); if (iterator.hasNext()) { Map.Entry element$iv = iterator.next(), entry1 = element$iv; int $i$a$-forEach-GrazieHttpClientUtil$withCloudAuth$2$appendHeaders$2$1 = 0;
/*     */       String key = (String)entry1.getKey(), value = (String)entry1.getValue();
/*     */       $this$appendHeaders_u24lambda_u241.getHeaders().add(key, value); }
/*     */     
/*     */     return requestOptions1;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\impl\grazie\GrazieHttpClientUtil$withCloudAuth$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */