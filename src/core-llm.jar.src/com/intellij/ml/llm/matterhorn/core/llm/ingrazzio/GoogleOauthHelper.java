/*     */ package com.intellij.ml.llm.matterhorn.core.llm.ingrazzio;
/*     */ import io.ktor.client.request.HttpRequestBuilder;
/*     */ import io.ktor.client.statement.HttpResponse;
/*     */ import io.ktor.http.URLBuilder;
/*     */ import io.ktor.http.Url;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.reflect.KClass;
/*     */ import kotlin.reflect.KType;
/*     */ import kotlinx.coroutines.CompletableDeferred;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\002\n\002\020\b\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\r\030\000 $2\0020\001:\001$B\025\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006JN\020\016\032\b\022\004\022\0020\0200\0172\006\020\021\032\0020\02223\020\023\032/\b\001\022\025\022\023\030\0010\020¢\006\f\b\025\022\b\b\026\022\004\b\b(\027\022\n\022\b\022\004\022\0020\b0\030\022\006\022\004\030\0010\0010\024¢\006\002\020\031JP\020\032\032\b\022\004\022\0020\0200\0172\006\020\n\032\0020\01323\020\023\032/\b\001\022\025\022\023\030\0010\020¢\006\f\b\025\022\b\b\026\022\004\b\b(\027\022\n\022\b\022\004\022\0020\b0\030\022\006\022\004\030\0010\0010\024H\002¢\006\002\020\033J\026\020\034\032\0020\0202\006\020\035\032\0020\bH@¢\006\002\020\036J\026\020\037\032\0020\0202\006\020 \032\0020\bH@¢\006\002\020\036J\b\020!\032\0020\bH\002J\020\020\"\032\0020\b2\006\020\r\032\0020\bH\002J\b\020#\032\0020\013H\002R\024\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000R\016\020\007\032\0020\bXD¢\006\002\n\000R\016\020\t\032\0020\bXD¢\006\002\n\000R\016\020\n\032\0020\013X\004¢\006\002\n\000R\016\020\f\032\0020\bX\004¢\006\002\n\000R\016\020\r\032\0020\bX\004¢\006\002\n\000¨\006%"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper;", "", "authLinkChannel", "Lkotlinx/coroutines/channels/Channel;", "Lio/ktor/http/Url;", "<init>", "(Lkotlinx/coroutines/channels/Channel;)V", "clientID", "", "clientSecret", "serverPort", "", "redirectUri", "codeVerifier", "generateAuthLinkAndWaitForAccessCode", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;", "openBrowser", "", "redirector", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "token", "Lkotlin/coroutines/Continuation;", "(ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/CompletableDeferred;", "startServerAndWaitForAccessCode", "(ILkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/CompletableDeferred;", "fetchAccessToken", "code", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshAccessToken", "refreshToken", "generateOauthCodeVerifier", "generateOauthCodeChallenge", "findAvailablePort", "Companion", "core-llm"})
/*     */ @SourceDebugExtension({"SMAP\nGoogleOauthHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleOauthHelper.kt\ncom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n+ 3 builders.kt\nio/ktor/client/request/BuildersKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 RequestBody.kt\nio/ktor/client/request/RequestBodyKt\n+ 6 Type.kt\nio/ktor/util/reflect/TypeKt\n+ 7 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,212:1\n40#2,3:213\n40#2,3:217\n52#3:216\n52#3:220\n1#4:221\n16#5,4:222\n21#5,10:244\n16#5,4:254\n21#5,10:276\n65#6,18:226\n65#6,18:258\n14#7:286\n*S KotlinDebug\n*F\n+ 1 GoogleOauthHelper.kt\ncom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper\n*L\n112#1:213,3\n140#1:217,3\n129#1:216\n154#1:220\n116#1:222,4\n116#1:244,10\n144#1:254,4\n144#1:276,10\n116#1:226,18\n144#1:258,18\n183#1:286\n*E\n"})
/*     */ public final class GoogleOauthHelper {
/*     */   public GoogleOauthHelper(@NotNull Channel<Url> authLinkChannel) {
/*  27 */     this.authLinkChannel = authLinkChannel;
/*  28 */     this.clientID = "394972300888-s91v6dadbgit9q0nar8u3j1uoe1eb5sl.apps.googleusercontent.com";
/*  29 */     this.clientSecret = "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";
/*     */     
/*  31 */     this.serverPort = findAvailablePort();
/*  32 */     this.redirectUri = "http://127.0.0.1:" + this.serverPort + "/callback";
/*  33 */     this.codeVerifier = generateOauthCodeVerifier();
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final CompletableDeferred<AccessToken> generateAuthLinkAndWaitForAccessCode(boolean openBrowser, @NotNull Function2<? super AccessToken, ? super Continuation<? super String>, ? extends Object> redirector) {
/*  39 */     Intrinsics.checkNotNullParameter(redirector, "redirector"); logger.debug("Opening browser for OAuth authorization");
/*  40 */     String codeChallenge = generateOauthCodeChallenge(this.codeVerifier);
/*  41 */     URLBuilder uRLBuilder1 = URLUtilsKt.URLBuilder("https://accounts.google.com/o/oauth2/v2/auth"), $this$generateAuthLinkAndWaitForAccessCode_u24lambda_u240 = uRLBuilder1; int $i$a$-apply-GoogleOauthHelper$generateAuthLinkAndWaitForAccessCode$authorizationUrl$1 = 0;
/*  42 */     $this$generateAuthLinkAndWaitForAccessCode_u24lambda_u240.getParameters().append("response_type", "code");
/*  43 */     $this$generateAuthLinkAndWaitForAccessCode_u24lambda_u240.getParameters().append("client_id", this.clientID);
/*  44 */     $this$generateAuthLinkAndWaitForAccessCode_u24lambda_u240.getParameters().append("redirect_uri", this.redirectUri);
/*  45 */     $this$generateAuthLinkAndWaitForAccessCode_u24lambda_u240.getParameters().append("scope", "https://www.googleapis.com/auth/userinfo.email");
/*  46 */     $this$generateAuthLinkAndWaitForAccessCode_u24lambda_u240.getParameters().append("state", "123xyz");
/*  47 */     $this$generateAuthLinkAndWaitForAccessCode_u24lambda_u240.getParameters().append("code_challenge", codeChallenge);
/*  48 */     $this$generateAuthLinkAndWaitForAccessCode_u24lambda_u240.getParameters().append("code_challenge_method", "S256");
/*  49 */     Url authorizationUrl = uRLBuilder1.build();
/*     */     
/*  51 */     this.authLinkChannel.trySend-JP2dKIU(authorizationUrl);
/*     */     
/*  53 */     if (openBrowser) {
/*  54 */       if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
/*  55 */         Desktop.getDesktop().browse(URLUtilsJvmKt.toURI(authorizationUrl));
/*  56 */         logger.info("Browser opened with the authorization URL");
/*     */       } else {
/*  58 */         throw new UnsupportedOperationException("Web browser is not accessible but attempted to be opened");
/*     */       } 
/*     */     }
/*  61 */     return startServerAndWaitForAccessCode(this.serverPort, redirector);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final CompletableDeferred<AccessToken> startServerAndWaitForAccessCode(int serverPort, Function2 redirector) {
/*     */     // Byte code:
/*     */     //   0: getstatic com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   3: iload_1
/*     */     //   4: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   9: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   12: aconst_null
/*     */     //   13: iconst_1
/*     */     //   14: aconst_null
/*     */     //   15: invokestatic CompletableDeferred$default : (Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   18: astore_3
/*     */     //   19: new kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   22: dup
/*     */     //   23: invokespecial <init> : ()V
/*     */     //   26: astore #4
/*     */     //   28: aload #4
/*     */     //   30: invokestatic create : ()Lreactor/netty/http/server/HttpServer;
/*     */     //   33: iload_1
/*     */     //   34: invokevirtual port : (I)Lreactor/netty/http/server/HttpServer;
/*     */     //   37: aload_3
/*     */     //   38: aload_0
/*     */     //   39: aload_2
/*     */     //   40: aload #4
/*     */     //   42: <illegal opcode> invoke : (Lkotlinx/coroutines/CompletableDeferred;Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */     //   47: <illegal opcode> accept : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Consumer;
/*     */     //   52: invokevirtual route : (Ljava/util/function/Consumer;)Lreactor/netty/http/server/HttpServer;
/*     */     //   55: invokevirtual bindNow : ()Lreactor/netty/DisposableServer;
/*     */     //   58: putfield element : Ljava/lang/Object;
/*     */     //   61: aload_3
/*     */     //   62: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #68	-> 0
/*     */     //   #69	-> 12
/*     */     //   #71	-> 19
/*     */     //   #72	-> 28
/*     */     //   #73	-> 33
/*     */     //   #74	-> 37
/*     */     //   #106	-> 55
/*     */     //   #72	-> 58
/*     */     //   #108	-> 61
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   19	44	3	authorizationCode	Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   28	35	4	server	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   0	63	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper;
/*     */     //   0	63	1	serverPort	I
/*     */     //   0	63	2	redirector	Lkotlin/jvm/functions/Function2;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void startServerAndWaitForAccessCode$lambda$5(Function1 $tmp0, Object p0) {
/*  74 */     $tmp0.invoke(p0);
/*  75 */   } private static final Publisher startServerAndWaitForAccessCode$lambda$4$lambda$3(Function2 $tmp0, Object p0, Object p1) { return (Publisher)$tmp0.invoke(p0, p1); } private static final Unit startServerAndWaitForAccessCode$lambda$4(CompletableDeferred $authorizationCode, GoogleOauthHelper this$0, Function2 $redirector, Ref.ObjectRef $server, HttpServerRoutes routes) { // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: ldc_w '/callback'
/*     */     //   5: aload_0
/*     */     //   6: aload_1
/*     */     //   7: aload_2
/*     */     //   8: aload_3
/*     */     //   9: <illegal opcode> invoke : (Lkotlinx/coroutines/CompletableDeferred;Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function2;
/*     */     //   14: <illegal opcode> apply : (Lkotlin/jvm/functions/Function2;)Ljava/util/function/BiFunction;
/*     */     //   19: invokeinterface get : (Ljava/lang/String;Ljava/util/function/BiFunction;)Lreactor/netty/http/server/HttpServerRoutes;
/*     */     //   24: pop
/*     */     //   25: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   28: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #75	-> 0
/*     */     //   #105	-> 25
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	29	0	$authorizationCode	Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   0	29	1	this$0	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper;
/*     */     //   0	29	2	$redirector	Lkotlin/jvm/functions/Function2;
/*     */     //   0	29	3	$server	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   0	29	4	routes	Lreactor/netty/http/server/HttpServerRoutes; }
/*  76 */   private static final Publisher startServerAndWaitForAccessCode$lambda$4$lambda$2(CompletableDeferred $authorizationCode, GoogleOauthHelper this$0, Function2<? super AccessToken, ? super Continuation<? super String>, ? extends Object> $redirector, Ref.ObjectRef $server, HttpServerRequest request, HttpServerResponse response) { QueryStringDecoder decoder = new QueryStringDecoder(request.uri());
/*  77 */     (List)decoder.parameters().get("code"); String code = ((List)decoder.parameters().get("code") != null) ? (String)CollectionsKt.firstOrNull((List)decoder.parameters().get("code")) : null;
/*     */     
/*  79 */     logger.debug("Received callback with code: " + code);
/*  80 */     String redirect = null;
/*     */     
/*  82 */     if (code != null) {
/*  83 */       logger.debug("OAuth code successfully received and completed");
/*  84 */       Pair pair = (Pair)BuildersKt.runBlocking$default(null, new GoogleOauthHelper$startServerAndWaitForAccessCode$1$1$1(code, $redirector, null), 1, null); AccessToken token = (AccessToken)pair.component1(); String url = (String)pair.component2();
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  89 */       redirect = url;
/*  90 */       $authorizationCode.complete(token);
/*     */     } else {
/*  92 */       $authorizationCode.completeExceptionally(new Exception("No code received"));
/*  93 */       logger.error("OAuth code not received. An error occurred");
/*  94 */       redirect = (String)BuildersKt.runBlocking$default(null, new GoogleOauthHelper$startServerAndWaitForAccessCode$1$1$2($redirector, null), 1, null);
/*     */     } 
/*  96 */     Mono result = response.status(HttpResponseStatus.FOUND)
/*  97 */       .header((CharSequence)HttpHeaderNames.LOCATION, redirect)
/*  98 */       .send()
/*  99 */       .then();
/*     */     
/* 101 */     return (Publisher)result.doFinally($server::startServerAndWaitForAccessCode$lambda$4$lambda$2$lambda$1); } @DebugMetadata(f = "GoogleOauthHelper.kt", l = {85, 86}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.ingrazzio.GoogleOauthHelper$startServerAndWaitForAccessCode$1$1$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\002\030\002\n\002\020\016\n\002\030\002\020\000\032\016\022\004\022\0020\002\022\004\022\0020\0030\001*\0020\004H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class GoogleOauthHelper$startServerAndWaitForAccessCode$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends AccessToken, ? extends String>>, Object> {
/* 102 */     Object L$0; int label; GoogleOauthHelper$startServerAndWaitForAccessCode$1$1$1(String $code, Function2<AccessToken, Continuation<? super String>, Object> $redirector, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { AccessToken token, accessToken1; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (GoogleOauthHelper.this.fetchAccessToken(this.$code, (Continuation)this) == object) return object;  token = (AccessToken)GoogleOauthHelper.this.fetchAccessToken(this.$code, (Continuation)this); this.L$0 = accessToken1 = token; this.label = 2; if (this.$redirector.invoke(token, this) == object) return object;  return TuplesKt.to(accessToken1, this.$redirector.invoke(token, this));case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); token = (AccessToken)SYNTHETIC_LOCAL_VARIABLE_1; this.L$0 = accessToken1 = token; this.label = 2; if (this.$redirector.invoke(token, this) == object) return object;  return TuplesKt.to(accessToken1, this.$redirector.invoke(token, this));case 2: accessToken1 = (AccessToken)this.L$0; ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return TuplesKt.to(accessToken1, SYNTHETIC_LOCAL_VARIABLE_1); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super GoogleOauthHelper$startServerAndWaitForAccessCode$1$1$1> $completion) { return (Continuation<Unit>)new GoogleOauthHelper$startServerAndWaitForAccessCode$1$1$1(this.$code, this.$redirector, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((GoogleOauthHelper$startServerAndWaitForAccessCode$1$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } @DebugMetadata(f = "GoogleOauthHelper.kt", l = {94}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.ingrazzio.GoogleOauthHelper$startServerAndWaitForAccessCode$1$1$2") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class GoogleOauthHelper$startServerAndWaitForAccessCode$1$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> { int label; GoogleOauthHelper$startServerAndWaitForAccessCode$1$1$2(Function2<AccessToken, Continuation<? super String>, Object> $redirector, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (this.$redirector.invoke(null, this) == object) ? object : this.$redirector.invoke(null, this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super GoogleOauthHelper$startServerAndWaitForAccessCode$1$1$2> $completion) { return (Continuation<Unit>)new GoogleOauthHelper$startServerAndWaitForAccessCode$1$1$2(this.$redirector, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((GoogleOauthHelper$startServerAndWaitForAccessCode$1$1$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } private static final void startServerAndWaitForAccessCode$lambda$4$lambda$2$lambda$1(Ref.ObjectRef $server, SignalType it) { if ((DisposableServer)$server.element != null) { ((DisposableServer)$server.element).dispose(); } else { (DisposableServer)$server.element; }
/*     */      }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Object fetchAccessToken(String code, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: istore_3
/*     */     //   2: ldc_w com/intellij/ml/llm/matterhorn/core/llm/MatterhornHttpClientService
/*     */     //   5: astore #4
/*     */     //   7: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   10: aload #4
/*     */     //   12: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */     //   17: dup
/*     */     //   18: ifnonnull -> 88
/*     */     //   21: pop
/*     */     //   22: new java/lang/RuntimeException
/*     */     //   25: dup
/*     */     //   26: new java/lang/StringBuilder
/*     */     //   29: dup
/*     */     //   30: invokespecial <init> : ()V
/*     */     //   33: ldc_w 'Cannot find service '
/*     */     //   36: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   39: aload #4
/*     */     //   41: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   44: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   47: ldc_w ' (classloader='
/*     */     //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   53: aload #4
/*     */     //   55: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
/*     */     //   58: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   61: ldc_w ', client='
/*     */     //   64: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   67: getstatic com/intellij/codeWithMe/ClientId.Companion : Lcom/intellij/codeWithMe/ClientId$Companion;
/*     */     //   70: invokevirtual getCurrentOrNull : ()Lcom/intellij/codeWithMe/ClientId;
/*     */     //   73: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   76: bipush #41
/*     */     //   78: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   81: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   84: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   87: athrow
/*     */     //   88: nop
/*     */     //   89: checkcast com/intellij/ml/llm/matterhorn/core/llm/MatterhornHttpClientService
/*     */     //   92: invokevirtual getClient : ()Lio/ktor/client/HttpClient;
/*     */     //   95: astore #4
/*     */     //   97: iconst_0
/*     */     //   98: istore #5
/*     */     //   100: aload_0
/*     */     //   101: aload_1
/*     */     //   102: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper;Ljava/lang/String;)Lkotlin/jvm/functions/Function1;
/*     */     //   107: invokestatic request : (Lkotlin/jvm/functions/Function1;)Lio/ktor/client/request/HttpRequestBuilder;
/*     */     //   110: astore #6
/*     */     //   112: aload #4
/*     */     //   114: astore #7
/*     */     //   116: aload_2
/*     */     //   117: astore #8
/*     */     //   119: iconst_0
/*     */     //   120: istore #9
/*     */     //   122: new io/ktor/client/statement/HttpStatement
/*     */     //   125: dup
/*     */     //   126: aload #6
/*     */     //   128: aload #7
/*     */     //   130: invokespecial <init> : (Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/HttpClient;)V
/*     */     //   133: new com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper$fetchAccessToken$2$1
/*     */     //   136: dup
/*     */     //   137: aconst_null
/*     */     //   138: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   141: checkcast kotlin/jvm/functions/Function2
/*     */     //   144: aload_2
/*     */     //   145: invokevirtual execute : (Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   148: dup
/*     */     //   149: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   152: if_acmpne -> 156
/*     */     //   155: areturn
/*     */     //   156: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken
/*     */     //   159: nop
/*     */     //   160: nop
/*     */     //   161: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #112	-> 0
/*     */     //   #213	-> 2
/*     */     //   #214	-> 7
/*     */     //   #215	-> 22
/*     */     //   #214	-> 88
/*     */     //   #112	-> 92
/*     */     //   #113	-> 100
/*     */     //   #129	-> 112
/*     */     //   #216	-> 122
/*     */     //   #129	-> 133
/*     */     //   #135	-> 159
/*     */     //   #112	-> 160
/*     */     //   #112	-> 161
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   2	87	3	$i$f$service	I
/*     */     //   7	82	4	serviceClass$iv	Ljava/lang/Class;
/*     */     //   122	11	9	$i$f$prepareRequest	I
/*     */     //   119	14	7	$this$prepareRequest$iv	Lio/ktor/client/HttpClient;
/*     */     //   119	14	8	$completion$iv	Lkotlin/coroutines/Continuation;
/*     */     //   100	60	5	$i$a$-let-GoogleOauthHelper$fetchAccessToken$2	I
/*     */     //   112	48	6	requestBuilder	Lio/ktor/client/request/HttpRequestBuilder;
/*     */     //   97	63	4	client	Lio/ktor/client/HttpClient;
/*     */     //   0	162	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper;
/*     */     //   0	162	1	code	Ljava/lang/String;
/*     */     //   0	162	2	$completion	Lkotlin/coroutines/Continuation;
/*     */   }
/*     */ 
/*     */   
/*     */   private static final Unit fetchAccessToken$lambda$7$lambda$6(GoogleOauthHelper this$0, String $code, HttpRequestBuilder $this$request) {
/* 114 */     Intrinsics.checkNotNullParameter($this$request, "$this$request"); HttpRequestKt.url($this$request, "https://oauth2.googleapis.com/token");
/* 115 */     HttpMessagePropertiesKt.contentType((HttpMessageBuilder)$this$request, ContentType.Application.INSTANCE.getFormUrlEncoded());
/* 116 */     HttpRequestBuilder httpRequestBuilder = $this$request;
/*     */     
/* 118 */     Pair[] arrayOfPair = new Pair[6]; arrayOfPair[0] = TuplesKt.to("client_id", this$0.clientID); arrayOfPair[1] = 
/* 119 */       TuplesKt.to("client_secret", this$0.clientSecret);
/* 120 */     arrayOfPair[2] = TuplesKt.to("code", $code);
/* 121 */     arrayOfPair[3] = TuplesKt.to("redirect_uri", this$0.redirectUri);
/* 122 */     arrayOfPair[4] = TuplesKt.to("code_verifier", this$0.codeVerifier);
/* 123 */     arrayOfPair[5] = TuplesKt.to("grant_type", "authorization_code");
/* 124 */     String str1 = HttpUrlEncodedKt.formUrlEncode(CollectionsKt.listOf((Object[])arrayOfPair));
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
/*     */     int $i$f$setBody = 0;
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
/* 222 */     String str2 = str1;
/* 223 */     if (str2 == null)
/* 224 */     { KType kType1; httpRequestBuilder.setBody(NullBody.INSTANCE);
/* 225 */       HttpRequestBuilder httpRequestBuilder1 = httpRequestBuilder; int $i$f$typeInfo = 0;
/* 226 */       KClass kClass1 = Reflection.getOrCreateKotlinClass(String.class); int $i$f$typeOfOrNull = 0;
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
/*     */       try {
/* 240 */         kType1 = Reflection.typeOf(String.class);
/* 241 */       } catch (Throwable <unused var>$iv$iv$iv) {
/* 242 */         kType1 = null;
/* 243 */       }  KType kType2 = kType1; KClass kClass2 = kClass1; httpRequestBuilder1.setBodyType(new TypeInfo(kClass2, kType2)); }
/* 244 */     else if (str2 instanceof io.ktor.http.content.OutgoingContent)
/* 245 */     { httpRequestBuilder.setBody(str1);
/* 246 */       httpRequestBuilder.setBodyType(null); }
/*     */     else
/*     */     
/* 249 */     { httpRequestBuilder.setBody(str1);
/* 250 */       HttpRequestBuilder httpRequestBuilder1 = httpRequestBuilder; int $i$f$typeInfo = 0; KClass kClass = Reflection.getOrCreateKotlinClass(String.class); int $i$f$typeOfOrNull = 0; }  $this$request.setMethod(HttpMethod.Companion.getPost()); return Unit.INSTANCE;
/*     */   } @DebugMetadata(f = "GoogleOauthHelper.kt", l = {131}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.ingrazzio.GoogleOauthHelper$fetchAccessToken$2$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;", "it", "Lio/ktor/client/statement/HttpResponse;"}) @SourceDebugExtension({"SMAP\nGoogleOauthHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleOauthHelper.kt\ncom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper$fetchAccessToken$2$1\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,212:1\n222#2:213\n*S KotlinDebug\n*F\n+ 1 GoogleOauthHelper.kt\ncom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper$fetchAccessToken$2$1\n*L\n134#1:213\n*E\n"}) static final class GoogleOauthHelper$fetchAccessToken$2$1 extends SuspendLambda implements Function2<HttpResponse, Continuation<? super AccessToken>, Object> {
/*     */     int label; GoogleOauthHelper$fetchAccessToken$2$1(Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { HttpResponse it; String body; long creationTime; Json json, this_$iv; int $i$f$decodeFromString; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (HttpResponse)this.L$0; GoogleOauthHelper.logger.debug("Received refreshed access token"); this.label = 1; if (HttpResponseKt.bodyAsText$default(it, null, (Continuation)this, 1, null) == object) return object;  body = (String)HttpResponseKt.bodyAsText$default(it, null, (Continuation)this, 1, null); creationTime = System.currentTimeMillis() - 1000L; json = JsonKt.Json$default(null, GoogleOauthHelper$fetchAccessToken$2$1::invokeSuspend$lambda$0, 1, null); this_$iv = json; $i$f$decodeFromString = 0; this_$iv.getSerializersModule(); return AccessToken.copy$default((AccessToken)this_$iv.decodeFromString((DeserializationStrategy)AccessToken.Companion.serializer(), body), null, 0, null, null, null, null, Boxing.boxLong(creationTime), 63, null);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); body = (String)SYNTHETIC_LOCAL_VARIABLE_1; creationTime = System.currentTimeMillis() - 1000L; json = JsonKt.Json$default(null, GoogleOauthHelper$fetchAccessToken$2$1::invokeSuspend$lambda$0, 1, null); this_$iv = json; $i$f$decodeFromString = 0; this_$iv.getSerializersModule(); return AccessToken.copy$default((AccessToken)this_$iv.decodeFromString((DeserializationStrategy)AccessToken.Companion.serializer(), body), null, 0, null, null, null, null, Boxing.boxLong(creationTime), 63, null); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super GoogleOauthHelper$fetchAccessToken$2$1> $completion) { GoogleOauthHelper$fetchAccessToken$2$1 googleOauthHelper$fetchAccessToken$2$1 = new GoogleOauthHelper$fetchAccessToken$2$1($completion); googleOauthHelper$fetchAccessToken$2$1.L$0 = value; return (Continuation<Unit>)googleOauthHelper$fetchAccessToken$2$1; } public final Object invoke(HttpResponse p1, Continuation<?> p2) { return ((GoogleOauthHelper$fetchAccessToken$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } private static final Unit invokeSuspend$lambda$0(JsonBuilder $this$Json) { $this$Json.setExplicitNulls(false); return Unit.INSTANCE; } }
/*     */   @Nullable public final Object refreshAccessToken(@NotNull String refreshToken, @NotNull Continuation $completion) { // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: istore_3
/*     */     //   2: ldc_w com/intellij/ml/llm/matterhorn/core/llm/MatterhornHttpClientService
/*     */     //   5: astore #4
/*     */     //   7: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   10: aload #4
/*     */     //   12: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */     //   17: dup
/*     */     //   18: ifnonnull -> 88
/*     */     //   21: pop
/*     */     //   22: new java/lang/RuntimeException
/*     */     //   25: dup
/*     */     //   26: new java/lang/StringBuilder
/*     */     //   29: dup
/*     */     //   30: invokespecial <init> : ()V
/*     */     //   33: ldc_w 'Cannot find service '
/*     */     //   36: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   39: aload #4
/*     */     //   41: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   44: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   47: ldc_w ' (classloader='
/*     */     //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   53: aload #4
/*     */     //   55: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
/*     */     //   58: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   61: ldc_w ', client='
/*     */     //   64: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   67: getstatic com/intellij/codeWithMe/ClientId.Companion : Lcom/intellij/codeWithMe/ClientId$Companion;
/*     */     //   70: invokevirtual getCurrentOrNull : ()Lcom/intellij/codeWithMe/ClientId;
/*     */     //   73: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   76: bipush #41
/*     */     //   78: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   81: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   84: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   87: athrow
/*     */     //   88: nop
/*     */     //   89: checkcast com/intellij/ml/llm/matterhorn/core/llm/MatterhornHttpClientService
/*     */     //   92: invokevirtual getClient : ()Lio/ktor/client/HttpClient;
/*     */     //   95: astore #4
/*     */     //   97: iconst_0
/*     */     //   98: istore #5
/*     */     //   100: aload_0
/*     */     //   101: aload_1
/*     */     //   102: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper;Ljava/lang/String;)Lkotlin/jvm/functions/Function1;
/*     */     //   107: invokestatic request : (Lkotlin/jvm/functions/Function1;)Lio/ktor/client/request/HttpRequestBuilder;
/*     */     //   110: astore #6
/*     */     //   112: aload #4
/*     */     //   114: astore #7
/*     */     //   116: aload_2
/*     */     //   117: astore #8
/*     */     //   119: iconst_0
/*     */     //   120: istore #9
/*     */     //   122: new io/ktor/client/statement/HttpStatement
/*     */     //   125: dup
/*     */     //   126: aload #6
/*     */     //   128: aload #7
/*     */     //   130: invokespecial <init> : (Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/HttpClient;)V
/*     */     //   133: new com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper$refreshAccessToken$2$1
/*     */     //   136: dup
/*     */     //   137: aload_1
/*     */     //   138: aconst_null
/*     */     //   139: invokespecial <init> : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
/*     */     //   142: checkcast kotlin/jvm/functions/Function2
/*     */     //   145: aload_2
/*     */     //   146: invokevirtual execute : (Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   149: dup
/*     */     //   150: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   153: if_acmpne -> 157
/*     */     //   156: areturn
/*     */     //   157: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken
/*     */     //   160: nop
/*     */     //   161: nop
/*     */     //   162: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #140	-> 0
/*     */     //   #217	-> 2
/*     */     //   #218	-> 7
/*     */     //   #219	-> 22
/*     */     //   #218	-> 88
/*     */     //   #140	-> 92
/*     */     //   #141	-> 100
/*     */     //   #154	-> 112
/*     */     //   #220	-> 122
/*     */     //   #154	-> 133
/*     */     //   #159	-> 160
/*     */     //   #140	-> 161
/*     */     //   #140	-> 162
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   2	87	3	$i$f$service	I
/*     */     //   7	82	4	serviceClass$iv	Ljava/lang/Class;
/*     */     //   122	11	9	$i$f$prepareRequest	I
/*     */     //   119	14	7	$this$prepareRequest$iv	Lio/ktor/client/HttpClient;
/*     */     //   119	14	8	$completion$iv	Lkotlin/coroutines/Continuation;
/*     */     //   100	61	5	$i$a$-let-GoogleOauthHelper$refreshAccessToken$2	I
/*     */     //   112	49	6	requestBuilder	Lio/ktor/client/request/HttpRequestBuilder;
/*     */     //   97	64	4	client	Lio/ktor/client/HttpClient;
/*     */     //   0	163	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper;
/*     */     //   0	163	1	refreshToken	Ljava/lang/String;
/*     */     //   0	163	2	$completion	Lkotlin/coroutines/Continuation; }
/* 254 */   private static final Unit refreshAccessToken$lambda$9$lambda$8(GoogleOauthHelper this$0, String $refreshToken, HttpRequestBuilder $this$request) { Intrinsics.checkNotNullParameter($this$request, "$this$request"); HttpRequestKt.url($this$request, "https://oauth2.googleapis.com/token"); HttpMessagePropertiesKt.contentType((HttpMessageBuilder)$this$request, ContentType.Application.INSTANCE.getFormUrlEncoded()); HttpRequestBuilder httpRequestBuilder = $this$request; Pair[] arrayOfPair = new Pair[4]; arrayOfPair[0] = TuplesKt.to("client_id", this$0.clientID); arrayOfPair[1] = TuplesKt.to("client_secret", this$0.clientSecret); arrayOfPair[2] = TuplesKt.to("refresh_token", $refreshToken); arrayOfPair[3] = TuplesKt.to("grant_type", "refresh_token"); String str1 = HttpUrlEncodedKt.formUrlEncode(CollectionsKt.listOf((Object[])arrayOfPair)); int $i$f$setBody = 0; String str2 = str1;
/* 255 */     if (str2 == null)
/* 256 */     { KType kType1; httpRequestBuilder.setBody(NullBody.INSTANCE);
/* 257 */       HttpRequestBuilder httpRequestBuilder1 = httpRequestBuilder; int $i$f$typeInfo = 0;
/* 258 */       KClass kClass1 = Reflection.getOrCreateKotlinClass(String.class); int $i$f$typeOfOrNull = 0;
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
/*     */       try {
/* 272 */         kType1 = Reflection.typeOf(String.class);
/* 273 */       } catch (Throwable <unused var>$iv$iv$iv) {
/* 274 */         kType1 = null;
/* 275 */       }  KType kType2 = kType1; KClass kClass2 = kClass1; httpRequestBuilder1.setBodyType(new TypeInfo(kClass2, kType2)); }
/* 276 */     else if (str2 instanceof io.ktor.http.content.OutgoingContent)
/* 277 */     { httpRequestBuilder.setBody(str1);
/* 278 */       httpRequestBuilder.setBodyType(null); }
/*     */     else
/*     */     
/* 281 */     { httpRequestBuilder.setBody(str1);
/* 282 */       HttpRequestBuilder httpRequestBuilder1 = httpRequestBuilder; int $i$f$typeInfo = 0; KClass kClass = Reflection.getOrCreateKotlinClass(String.class); int $i$f$typeOfOrNull = 0; }  $this$request.setMethod(HttpMethod.Companion.getPost()); return Unit.INSTANCE; }
/*     */   @DebugMetadata(f = "GoogleOauthHelper.kt", l = {155}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.ingrazzio.GoogleOauthHelper$refreshAccessToken$2$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;", "response", "Lio/ktor/client/statement/HttpResponse;"}) @SourceDebugExtension({"SMAP\nGoogleOauthHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleOauthHelper.kt\ncom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper$refreshAccessToken$2$1\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,212:1\n222#2:213\n*S KotlinDebug\n*F\n+ 1 GoogleOauthHelper.kt\ncom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper$refreshAccessToken$2$1\n*L\n158#1:213\n*E\n"}) static final class GoogleOauthHelper$refreshAccessToken$2$1 extends SuspendLambda implements Function2<HttpResponse, Continuation<? super AccessToken>, Object> {
/*     */     int label;
/*     */     GoogleOauthHelper$refreshAccessToken$2$1(String $refreshToken, Continuation $completion) { super(2, $completion); }
/* 286 */     public final Object invokeSuspend(Object $result) { HttpResponse response; String body; long creationTime; Json json, this_$iv; int $i$f$decodeFromString; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); response = (HttpResponse)this.L$0; this.label = 1; if (HttpResponseKt.bodyAsText$default(response, null, (Continuation)this, 1, null) == object) return object;  body = (String)HttpResponseKt.bodyAsText$default(response, null, (Continuation)this, 1, null); creationTime = System.currentTimeMillis() - 1000L; json = JsonKt.Json$default(null, GoogleOauthHelper$refreshAccessToken$2$1::invokeSuspend$lambda$0, 1, null); this_$iv = json; $i$f$decodeFromString = 0; this_$iv.getSerializersModule(); return AccessToken.copy$default((AccessToken)this_$iv.decodeFromString((DeserializationStrategy)AccessToken.Companion.serializer(), body), null, 0, this.$refreshToken, null, null, null, Boxing.boxLong(creationTime), 59, null);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); body = (String)SYNTHETIC_LOCAL_VARIABLE_1; creationTime = System.currentTimeMillis() - 1000L; json = JsonKt.Json$default(null, GoogleOauthHelper$refreshAccessToken$2$1::invokeSuspend$lambda$0, 1, null); this_$iv = json; $i$f$decodeFromString = 0; this_$iv.getSerializersModule(); return AccessToken.copy$default((AccessToken)this_$iv.decodeFromString((DeserializationStrategy)AccessToken.Companion.serializer(), body), null, 0, this.$refreshToken, null, null, null, Boxing.boxLong(creationTime), 59, null); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super GoogleOauthHelper$refreshAccessToken$2$1> $completion) { GoogleOauthHelper$refreshAccessToken$2$1 googleOauthHelper$refreshAccessToken$2$1 = new GoogleOauthHelper$refreshAccessToken$2$1(this.$refreshToken, $completion); googleOauthHelper$refreshAccessToken$2$1.L$0 = value; return (Continuation<Unit>)googleOauthHelper$refreshAccessToken$2$1; } public final Object invoke(HttpResponse p1, Continuation<?> p2) { return ((GoogleOauthHelper$refreshAccessToken$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } private static final Unit invokeSuspend$lambda$0(JsonBuilder $this$Json) { $this$Json.setExplicitNulls(false); return Unit.INSTANCE; } } private final String generateOauthCodeVerifier() { byte[] codeVerifier = new byte[32]; (new SecureRandom()).nextBytes(codeVerifier); Intrinsics.checkNotNullExpressionValue(Base64.getUrlEncoder().withoutPadding().encodeToString(codeVerifier), "encodeToString(...)"); return Base64.getUrlEncoder().withoutPadding().encodeToString(codeVerifier); } private final String generateOauthCodeChallenge(String codeVerifier) { String str = codeVerifier; Intrinsics.checkNotNullExpressionValue(StandardCharsets.US_ASCII, "US_ASCII"); Intrinsics.checkNotNullExpressionValue(str.getBytes(StandardCharsets.US_ASCII), "getBytes(...)"); byte[] bytes = str.getBytes(StandardCharsets.US_ASCII); Intrinsics.checkNotNullExpressionValue(MessageDigest.getInstance("SHA-256"), "getInstance(...)"); MessageDigest messageDigest = MessageDigest.getInstance("SHA-256"); messageDigest.update(bytes, 0, bytes.length); Intrinsics.checkNotNullExpressionValue(Base64.getUrlEncoder().withoutPadding().encodeToString(messageDigest.digest()), "encodeToString(...)"); return Base64.getUrlEncoder().withoutPadding().encodeToString(messageDigest.digest()); } static { int $i$f$logger = 0; Intrinsics.checkNotNullExpressionValue(Logger.getInstance(GoogleOauthHelper.class), "getInstance(...)"); } private final int findAvailablePort() { ServerSocket socket = new ServerSocket(0); int i = socket.getLocalPort(), it = i; int $i$a$-also-GoogleOauthHelper$findAvailablePort$1 = 0; socket.close(); return i; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\006\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\021\020\b\032\0020\007¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\007¢\006\b\n\000\032\004\b\f\020\n¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/GoogleOauthHelper$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "RESPONSE_FORMAT_TEMPLATE", "", "LOGIN_SUCCESSFUL", "getLOGIN_SUCCESSFUL", "()Ljava/lang/String;", "LOGIN_ERROR", "getLOGIN_ERROR", "core-llm"}) public static final class Companion { private Companion() {} @NotNull public final String getLOGIN_SUCCESSFUL() { return GoogleOauthHelper.LOGIN_SUCCESSFUL; } @NotNull public final String getLOGIN_ERROR() { return GoogleOauthHelper.LOGIN_ERROR; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private static final String RESPONSE_FORMAT_TEMPLATE = "<!DOCTYPE html>\n<html lang=\"en\">\n  <head>\n    <title> %s </title>\n    <link rel=\"icon\" href=\"data:,\">\n    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\"/>\n    <link href=\"https://fonts.googleapis.com/css2?family=JetBrains+Mono&display=swap\" rel=\"stylesheet\" />\n    <style>\n        html { padding: 2em; }\n        body { font-family: 'JetBrains Mono', monospace; }\n    </style>\n  </head>\n  <body style='padding: 3em;'>\n    <h2> %s </h2>\n    <br />\n    <h2>Welcome to JetBrains Junie!</h2>\n  </body>\n</html>\n"; static { String str = RESPONSE_FORMAT_TEMPLATE; Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = "Successful"; arrayOfObject[1] = "Authenticated successfully"; arrayOfObject = arrayOfObject; Intrinsics.checkNotNullExpressionValue(String.format(str, Arrays.copyOf(arrayOfObject, arrayOfObject.length)), "format(...)"); LOGIN_SUCCESSFUL = String.format(str, Arrays.copyOf(arrayOfObject, arrayOfObject.length)); str = RESPONSE_FORMAT_TEMPLATE; arrayOfObject = new Object[2]; arrayOfObject[0] = "Error"; arrayOfObject[1] = "Unexpected Authentication Error"; arrayOfObject = arrayOfObject; Intrinsics.checkNotNullExpressionValue(String.format(str, Arrays.copyOf(arrayOfObject, arrayOfObject.length)), "format(...)"); LOGIN_ERROR = String.format(str, Arrays.copyOf(arrayOfObject, arrayOfObject.length)); } @NotNull private static final Logger logger = Logger.getInstance(GoogleOauthHelper.class);
/*     */   @NotNull
/*     */   private final Channel<Url> authLinkChannel;
/*     */   @NotNull
/*     */   private final String clientID;
/*     */   @NotNull
/*     */   private final String clientSecret;
/*     */   private final int serverPort;
/*     */   @NotNull
/*     */   private final String redirectUri;
/*     */   @NotNull
/*     */   private final String codeVerifier;
/*     */   @NotNull
/*     */   private static final String LOGIN_SUCCESSFUL;
/*     */   @NotNull
/*     */   private static final String LOGIN_ERROR;
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\ingrazzio\GoogleOauthHelper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */