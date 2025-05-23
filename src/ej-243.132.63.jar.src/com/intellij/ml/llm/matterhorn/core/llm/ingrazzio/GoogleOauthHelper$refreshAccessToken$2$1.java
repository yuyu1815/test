/*     */ package com.intellij.ml.llm.matterhorn.core.llm.ingrazzio;
/*     */ 
/*     */ import io.ktor.client.statement.HttpResponse;
/*     */ import io.ktor.client.statement.HttpResponseKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.Boxing;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.JsonBuilder;
/*     */ import kotlinx.serialization.json.JsonKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "GoogleOauthHelper.kt", l = {155}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.ingrazzio.GoogleOauthHelper$refreshAccessToken$2$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;", "response", "Lio/ktor/client/statement/HttpResponse;"})
/*     */ @SourceDebugExtension({"SMAP\nGoogleOauthHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleOauthHelper.kt\ncom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper$refreshAccessToken$2$1\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,212:1\n222#2:213\n*S KotlinDebug\n*F\n+ 1 GoogleOauthHelper.kt\ncom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper$refreshAccessToken$2$1\n*L\n158#1:213\n*E\n"})
/*     */ final class GoogleOauthHelper$refreshAccessToken$2$1
/*     */   extends SuspendLambda
/*     */   implements Function2<HttpResponse, Continuation<? super AccessToken>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   GoogleOauthHelper$refreshAccessToken$2$1(String $refreshToken, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     HttpResponse response;
/*     */     String body;
/*     */     long creationTime;
/*     */     Json json, this_$iv;
/*     */     int $i$f$decodeFromString;
/* 154 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); response = (HttpResponse)this.L$0;
/* 155 */         this.label = 1; if (HttpResponseKt.bodyAsText$default(response, null, (Continuation)this, 1, null) == object) return object;  body = (String)HttpResponseKt.bodyAsText$default(response, null, (Continuation)this, 1, null);
/* 156 */         creationTime = System.currentTimeMillis() - 1000L;
/* 157 */         json = JsonKt.Json$default(null, GoogleOauthHelper$refreshAccessToken$2$1::invokeSuspend$lambda$0, 1, null);
/* 158 */         this_$iv = json; $i$f$decodeFromString = 0;
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
/* 213 */         this_$iv.getSerializersModule(); return AccessToken.copy$default((AccessToken)this_$iv.decodeFromString((DeserializationStrategy)AccessToken.Companion.serializer(), body), null, 0, this.$refreshToken, null, null, null, Boxing.boxLong(creationTime), 59, null);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); body = (String)SYNTHETIC_LOCAL_VARIABLE_1; creationTime = System.currentTimeMillis() - 1000L; json = JsonKt.Json$default(null, GoogleOauthHelper$refreshAccessToken$2$1::invokeSuspend$lambda$0, 1, null); this_$iv = json; $i$f$decodeFromString = 0; this_$iv.getSerializersModule(); return AccessToken.copy$default((AccessToken)this_$iv.decodeFromString((DeserializationStrategy)AccessToken.Companion.serializer(), body), null, 0, this.$refreshToken, null, null, null, Boxing.boxLong(creationTime), 59, null); }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super GoogleOauthHelper$refreshAccessToken$2$1> $completion) {
/*     */     GoogleOauthHelper$refreshAccessToken$2$1 googleOauthHelper$refreshAccessToken$2$1 = new GoogleOauthHelper$refreshAccessToken$2$1(this.$refreshToken, $completion);
/*     */     googleOauthHelper$refreshAccessToken$2$1.L$0 = value;
/*     */     return (Continuation<Unit>)googleOauthHelper$refreshAccessToken$2$1;
/*     */   }
/*     */   
/*     */   public final Object invoke(HttpResponse p1, Continuation<?> p2) {
/*     */     return ((GoogleOauthHelper$refreshAccessToken$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */   
/*     */   private static final Unit invokeSuspend$lambda$0(JsonBuilder $this$Json) {
/*     */     $this$Json.setExplicitNulls(false);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\ingrazzio\GoogleOauthHelper$refreshAccessToken$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */