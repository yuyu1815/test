/*     */ package ai.grazie.client.common;
/*     */ import ai.grazie.client.common.model.RequestOptions;
/*     */ import ai.grazie.model.auth.v5.AuthData;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\022\n\002\b\006\bf\030\0002\0020\001:\004\031\032\033\034J \020\002\032\0020\0032\006\020\004\032\0020\0052\b\b\002\020\006\032\0020\007H¦@¢\006\002\020\bJ4\020\t\032\b\022\004\022\0020\0130\n2\006\020\004\032\0020\0052\006\020\f\032\0020\0052\006\020\006\032\0020\0072\006\020\r\032\0020\016H¦@¢\006\002\020\017J@\020\020\032\b\022\004\022\0020\0050\n2\006\020\004\032\0020\0052\006\020\f\032\0020\0052\006\020\006\032\0020\0072\022\020\021\032\016\022\004\022\0020\005\022\004\022\0020\0160\022H¦@¢\006\002\020\023J(\020\024\032\0020\0032\006\020\004\032\0020\0052\006\020\f\032\0020\0252\b\b\002\020\006\032\0020\007H¦@¢\006\002\020\026J \020\024\032\0020\0032\006\020\004\032\0020\0052\b\b\002\020\006\032\0020\007H¦@¢\006\002\020\bJ(\020\024\032\0020\0032\006\020\004\032\0020\0052\006\020\f\032\0020\0272\b\b\002\020\006\032\0020\007H¦@¢\006\002\020\030ø\001\000\002\006\n\004\b!0\001¨\006\035À\006\001"}, d2 = {"Lai/grazie/client/common/SuspendableHTTPClient;", "", "get", "Lai/grazie/client/common/model/HTTPResponse;", "url", "", "options", "Lai/grazie/client/common/model/RequestOptions;", "(Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveContinuousSSE", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/model/cloud/sse/ServerSentEvent;", "content", "reconnect", "", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveLineStream", "isLastLine", "Lkotlin/Function1;", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "send", "Lai/grazie/client/common/model/Multipart;", "(Ljava/lang/String;Lai/grazie/client/common/model/Multipart;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/lang/String;[BLai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WithDebugInfo", "WithError", "WithHeaders", "WithV5", "client-common"})
/*     */ public interface SuspendableHTTPClient {
/*     */   @Nullable
/*     */   Object send(@NotNull String paramString, @NotNull RequestOptions paramRequestOptions, @NotNull Continuation<? super HTTPResponse> paramContinuation);
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000Z\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\022\n\002\b\002\b&\030\0002\0020\001B\027\b\027\022\006\020\002\032\0020\001\022\006\020\003\032\0020\004¢\006\002\020\005B\027\022\006\020\002\032\0020\001\022\b\b\002\020\003\032\0020\006¢\006\002\020\007J\026\020\n\032\0020\0132\006\020\f\032\0020\013H@¢\006\002\020\rJ\036\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\f\032\0020\013H@¢\006\002\020\022J4\020\023\032\b\022\004\022\0020\0250\0242\006\020\020\032\0020\0212\006\020\026\032\0020\0212\006\020\f\032\0020\0132\006\020\027\032\0020\030H@¢\006\002\020\031J@\020\032\032\b\022\004\022\0020\0210\0242\006\020\020\032\0020\0212\006\020\026\032\0020\0212\006\020\f\032\0020\0132\022\020\033\032\016\022\004\022\0020\021\022\004\022\0020\0300\034H@¢\006\002\020\035J&\020\036\032\0020\0172\006\020\020\032\0020\0212\006\020\026\032\0020\0372\006\020\f\032\0020\013H@¢\006\002\020 J\036\020\036\032\0020\0172\006\020\020\032\0020\0212\006\020\f\032\0020\013H@¢\006\002\020\022J&\020\036\032\0020\0172\006\020\020\032\0020\0212\006\020\026\032\0020!2\006\020\f\032\0020\013H@¢\006\002\020\"R\016\020\002\032\0020\001X\004¢\006\002\n\000R\021\020\003\032\0020\006¢\006\b\n\000\032\004\b\b\020\t¨\006#"}, d2 = {"Lai/grazie/client/common/SuspendableHTTPClient$WithHeaders;", "Lai/grazie/client/common/SuspendableHTTPClient;", "client", "headers", "Lai/grazie/client/common/model/HeaderCollection;", "(Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/client/common/model/HeaderCollection;)V", "Lai/grazie/model/cloud/HeaderCollection;", "(Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/model/cloud/HeaderCollection;)V", "getHeaders", "()Lai/grazie/model/cloud/HeaderCollection;", "appendHeaders", "Lai/grazie/client/common/model/RequestOptions;", "options", "(Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "Lai/grazie/client/common/model/HTTPResponse;", "url", "", "(Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveContinuousSSE", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/model/cloud/sse/ServerSentEvent;", "content", "reconnect", "", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveLineStream", "isLastLine", "Lkotlin/Function1;", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "send", "Lai/grazie/client/common/model/Multipart;", "(Ljava/lang/String;Lai/grazie/client/common/model/Multipart;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/lang/String;[BLai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"})
/*     */   @SourceDebugExtension({"SMAP\nSuspendableHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendableHTTPClient.kt\nai/grazie/client/common/SuspendableHTTPClient$WithHeaders\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1#2:122\n*E\n"})
/*     */   public static abstract class WithHeaders implements SuspendableHTTPClient {
/*     */     @NotNull
/*     */     private final SuspendableHTTPClient client;
/*     */     @NotNull
/*     */     private final HeaderCollection headers;
/*     */     
/*  21 */     public WithHeaders(@NotNull SuspendableHTTPClient client, @NotNull HeaderCollection headers) { this.client = client;
/*  22 */       this.headers = headers; } @NotNull public final HeaderCollection getHeaders() { return this.headers; }
/*     */     @Nullable protected Object appendHeaders(@NotNull RequestOptions options, @NotNull Continuation<? super RequestOptions> $completion) { return appendHeaders$suspendImpl(this, options, $completion); }
/*     */     @Nullable public Object send(@NotNull String url, @NotNull byte[] content, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> $completion) { return send$suspendImpl(this, url, content, options, $completion); }
/*  25 */     @Nullable public Object send(@NotNull String url, @NotNull Multipart content, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> $completion) { return send$suspendImpl(this, url, content, options, $completion); } @Nullable public Object receiveContinuousSSE(@NotNull String url, @NotNull String content, @NotNull RequestOptions options, boolean reconnect, @NotNull Continuation<? super Flow<ServerSentEvent>> $completion) { return receiveContinuousSSE$suspendImpl(this, url, content, options, reconnect, $completion); } @Nullable public Object receiveLineStream(@NotNull String url, @NotNull String content, @NotNull RequestOptions options, @NotNull Function1<? super String, Boolean> isLastLine, @NotNull Continuation<? super Flow<String>> $completion) { return receiveLineStream$suspendImpl(this, url, content, options, isLastLine, $completion); } @Nullable public Object send(@NotNull String url, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> $completion) { return send$suspendImpl(this, url, options, $completion); } @Nullable public Object get(@NotNull String url, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> $completion) { return get$suspendImpl(this, url, options, $completion); } @Deprecated(message = "In favor of overload with new HeaderCollection") public WithHeaders(@NotNull SuspendableHTTPClient client, @NotNull HeaderCollection headers) { this(client, headers.toHeaderCollection()); }
/*     */     @DebugMetadata(f = "SuspendableHTTPClient.kt", l = {50, 50}, i = {}, s = {}, n = {}, m = "get$suspendImpl", c = "ai.grazie.client.common.SuspendableHTTPClient$WithHeaders") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class SuspendableHTTPClient$WithHeaders$get$1 extends ContinuationImpl {
/*     */       Object L$0;
/*     */       Object L$1;
/*     */       int label;
/*     */       SuspendableHTTPClient$WithHeaders$get$1(Continuation $completion) { super($completion); }
/*     */       @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return SuspendableHTTPClient.WithHeaders.get$suspendImpl(SuspendableHTTPClient.WithHeaders.this, null, null, (Continuation<? super HTTPResponse>)this); } }
/*     */     @DebugMetadata(f = "SuspendableHTTPClient.kt", l = {38, 38}, i = {0}, s = {"Z$0"}, n = {"reconnect"}, m = "receiveContinuousSSE$suspendImpl", c = "ai.grazie.client.common.SuspendableHTTPClient$WithHeaders") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class SuspendableHTTPClient$WithHeaders$receiveContinuousSSE$1 extends ContinuationImpl {
/*     */       boolean Z$0;
/*     */       Object L$0;
/*     */       Object L$1;
/*     */       Object L$2; int label; SuspendableHTTPClient$WithHeaders$receiveContinuousSSE$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return SuspendableHTTPClient.WithHeaders.receiveContinuousSSE$suspendImpl(SuspendableHTTPClient.WithHeaders.this, null, null, null, false, (Continuation<? super Flow<ServerSentEvent>>)this); } } @DebugMetadata(f = "SuspendableHTTPClient.kt", l = {42, 42}, i = {0}, s = {"L$0"}, n = {"isLastLine"}, m = "receiveLineStream$suspendImpl", c = "ai.grazie.client.common.SuspendableHTTPClient$WithHeaders") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class SuspendableHTTPClient$WithHeaders$receiveLineStream$1 extends ContinuationImpl {
/*     */       Object L$0; Object L$1; Object L$2; Object L$3; int label; SuspendableHTTPClient$WithHeaders$receiveLineStream$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return SuspendableHTTPClient.WithHeaders.receiveLineStream$suspendImpl(SuspendableHTTPClient.WithHeaders.this, null, null, null, null, (Continuation<? super Flow<String>>)this); } } @DebugMetadata(f = "SuspendableHTTPClient.kt", l = {30, 30}, i = {}, s = {}, n = {}, m = "send$suspendImpl", c = "ai.grazie.client.common.SuspendableHTTPClient$WithHeaders") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class SuspendableHTTPClient$WithHeaders$send$1 extends ContinuationImpl {
/*     */       Object L$0; Object L$1; Object L$2; int label; SuspendableHTTPClient$WithHeaders$send$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return SuspendableHTTPClient.WithHeaders.send$suspendImpl(SuspendableHTTPClient.WithHeaders.this, (String)null, (byte[])null, (RequestOptions)null, (Continuation<? super HTTPResponse>)this); } } @DebugMetadata(f = "SuspendableHTTPClient.kt", l = {34, 34}, i = {}, s = {}, n = {}, m = "send$suspendImpl", c = "ai.grazie.client.common.SuspendableHTTPClient$WithHeaders") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class SuspendableHTTPClient$WithHeaders$send$2 extends ContinuationImpl {
/*     */       Object L$0; Object L$1; Object L$2; int label; SuspendableHTTPClient$WithHeaders$send$2(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return SuspendableHTTPClient.WithHeaders.send$suspendImpl(SuspendableHTTPClient.WithHeaders.this, (String)null, (Multipart)null, (RequestOptions)null, (Continuation<? super HTTPResponse>)this); }
/*     */     } @DebugMetadata(f = "SuspendableHTTPClient.kt", l = {46, 46}, i = {}, s = {}, n = {}, m = "send$suspendImpl", c = "ai.grazie.client.common.SuspendableHTTPClient$WithHeaders") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class SuspendableHTTPClient$WithHeaders$send$3 extends ContinuationImpl {
/*     */       Object L$0; Object L$1; int label; SuspendableHTTPClient$WithHeaders$send$3(Continuation $completion) { super($completion); } @Nullable
/*     */       public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return SuspendableHTTPClient.WithHeaders.send$suspendImpl(SuspendableHTTPClient.WithHeaders.this, null, null, (Continuation<? super HTTPResponse>)this); }
/*     */     }
/*     */   } @TestOnly
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\004\b\007\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lai/grazie/client/common/SuspendableHTTPClient$WithError;", "Lai/grazie/client/common/SuspendableHTTPClient$WithHeaders;", "client", "Lai/grazie/client/common/SuspendableHTTPClient;", "code", "", "(Lai/grazie/client/common/SuspendableHTTPClient;I)V", "getCode", "()I", "client-common"})
/*  58 */   public static final class WithError extends WithHeaders { private final int code; public WithError(@NotNull SuspendableHTTPClient client, int code) { super(
/*  59 */           client, HeaderCollectionKt.of(HeaderCollection.Companion, MapsKt.mapOf(TuplesKt.to("Grazie-Force-HTTP-Error", CollectionsKt.listOf(String.valueOf(code))))));
/*     */       this.code = code; } public final int getCode() { return this.code; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\003\030\0002\0020\001B\031\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005¢\006\002\020\006J\026\020\b\032\0020\t2\006\020\n\032\0020\tH@¢\006\002\020\013R\022\020\004\032\004\030\0010\005X\004¢\006\004\n\002\020\007¨\006\f"}, d2 = {"Lai/grazie/client/common/SuspendableHTTPClient$WithDebugInfo;", "Lai/grazie/client/common/SuspendableHTTPClient$WithHeaders;", "client", "Lai/grazie/client/common/SuspendableHTTPClient;", "provideDebugInfo", "", "(Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "appendHeaders", "Lai/grazie/client/common/model/RequestOptions;", "options", "(Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"}) public static final class WithDebugInfo extends WithHeaders { @Nullable
/*     */     private final Boolean provideDebugInfo;
/*  62 */     public WithDebugInfo(@NotNull SuspendableHTTPClient client, @Nullable Boolean provideDebugInfo) { super(client, null, 2, null); this.provideDebugInfo = provideDebugInfo; } @Nullable
/*     */     protected Object appendHeaders(@NotNull RequestOptions options, @NotNull Continuation $completion) {
/*  64 */       (DebugData)$completion.getContext().get((CoroutineContext.Key)DebugData.Key); ((DebugData)$completion.getContext().get((CoroutineContext.Key)DebugData.Key) != null) ? Boxing.boxBoolean(((DebugData)$completion.getContext().get((CoroutineContext.Key)DebugData.Key)).getProvideDebugInfo()) : null; boolean requestDebugInfo = (this.provideDebugInfo != null) ? this.provideDebugInfo.booleanValue() : (((((DebugData)$completion.getContext().get((CoroutineContext.Key)DebugData.Key) != null) ? Boxing.boxBoolean(((DebugData)$completion.getContext().get((CoroutineContext.Key)DebugData.Key)).getProvideDebugInfo()) : null) != null) ? (((DebugData)$completion.getContext().get((CoroutineContext.Key)DebugData.Key) != null) ? Boxing.boxBoolean(((DebugData)$completion.getContext().get((CoroutineContext.Key)DebugData.Key)).getProvideDebugInfo()) : null).booleanValue() : false);
/*  65 */       return DebugHeaders.INSTANCE.append(requestDebugInfo, options);
/*     */     } }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003\030\0002\0020\0012\0020\0022\0020\003B%\022\006\020\004\032\0020\001\022\n\b\002\020\005\032\004\030\0010\006\022\n\b\002\020\007\032\004\030\0010\b¢\006\002\020\tJ\026\020\021\032\0020\0222\006\020\023\032\0020\022H@¢\006\002\020\024R\020\020\005\032\004\030\0010\006X\004¢\006\002\n\000R\024\020\n\032\0020\013X\004¢\006\b\n\000\032\004\b\f\020\rR\024\020\016\032\0020\001X\004¢\006\b\n\000\032\004\b\017\020\020R\016\020\004\032\0020\001X\004¢\006\002\n\000R\020\020\007\032\004\030\0010\bX\004¢\006\002\n\000¨\006\025"}, d2 = {"Lai/grazie/client/common/SuspendableHTTPClient$WithV5;", "Lai/grazie/client/common/SuspendableHTTPClient;", "Lai/grazie/client/common/SuspendableWithCloudAuth;", "Lai/grazie/client/common/SuspendableHTTPClient$WithHeaders;", "client", "authData", "Lai/grazie/model/auth/v5/AuthData;", "serviceToken", "Lai/grazie/model/auth/v5/AuthServiceToken;", "(Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/model/auth/v5/AuthData;Lai/grazie/model/auth/v5/AuthServiceToken;)V", "authVersion", "Lai/grazie/model/cloud/AuthVersion;", "getAuthVersion", "()Lai/grazie/model/cloud/AuthVersion;", "baseHTTPClient", "getBaseHTTPClient", "()Lai/grazie/client/common/SuspendableHTTPClient;", "appendHeaders", "Lai/grazie/client/common/model/RequestOptions;", "options", "(Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"})
/*     */   public static final class WithV5 extends WithHeaders implements SuspendableHTTPClient, SuspendableWithCloudAuth { @NotNull
/*     */     private final SuspendableHTTPClient client;
/*     */     @Nullable
/*     */     private final AuthData authData;
/*     */     @Nullable
/*     */     private final AuthServiceToken serviceToken;
/*     */     @NotNull
/*     */     private final AuthVersion authVersion;
/*     */     @NotNull
/*     */     private final SuspendableHTTPClient baseHTTPClient;
/*     */     
/*  81 */     public WithV5(@NotNull SuspendableHTTPClient client, @Nullable AuthData authData, @Nullable AuthServiceToken serviceToken) { super(client, null, 2, null); this.client = client; this.authData = authData; this.serviceToken = serviceToken;
/*  82 */       this.authVersion = AuthVersion.V5;
/*  83 */       this.baseHTTPClient = this.client;
/*     */ 
/*     */       
/*  86 */       if (!(!(this.client instanceof WithCloudAuth) ? 1 : 0)) { int $i$a$-require-SuspendableHTTPClient$WithV5$1 = 0; String str = 
/*  87 */           "Client should not already be wrapped with authentication";
/*     */         throw new IllegalArgumentException(str.toString()); }
/*     */        } @NotNull public AuthVersion getAuthVersion() { return this.authVersion; }
/*     */     @NotNull public SuspendableHTTPClient getBaseHTTPClient() { return this.baseHTTPClient; }
/*     */     @Nullable
/*  92 */     protected Object appendHeaders(@NotNull RequestOptions options, @NotNull Continuation $completion) { if (this.authData == null); AuthData requestAuthData = (AuthData)$completion.getContext().get((CoroutineContext.Key)AuthData.Key);
/*  93 */       if (this.serviceToken == null); AuthServiceToken serviceAuthData = (AuthServiceToken)$completion.getContext().get((CoroutineContext.Key)AuthServiceToken.Key);
/*  94 */       if (!((requestAuthData != null || serviceAuthData != null) ? 1 : 0)) { int $i$a$-require-SuspendableHTTPClient$WithV5$appendHeaders$2 = 0; String str = 
/*  95 */           "For v5 requests service or user data should be presented";
/*     */         throw new IllegalArgumentException(str.toString()); }
/*     */       
/*  98 */       if (serviceAuthData == null || serviceAuthData.getToken() == null) { serviceAuthData.getToken(); Intrinsics.checkNotNull(requestAuthData); }  return serviceAuthData.getToken().append(requestAuthData.getToken(), 
/*  99 */           (requestAuthData != null) ? requestAuthData.getOriginalUserToken() : null, 
/* 100 */           (requestAuthData != null) ? requestAuthData.getOriginalServiceToken() : null, 
/* 101 */           (requestAuthData != null) ? requestAuthData.getOriginalApplicationToken() : null, 
/* 102 */           (requestAuthData != null) ? requestAuthData.getGrazieAgent() : null, 
/* 103 */           (requestAuthData != null) ? requestAuthData.getOriginalUserIP() : null, 
/* 104 */           (requestAuthData != null) ? requestAuthData.getApplicationUserId() : null, 
/* 105 */           (requestAuthData != null) ? requestAuthData.getOriginalUserCountry() : null, 
/* 106 */           options); }
/*     */      }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   Object send(@NotNull String paramString, @NotNull byte[] paramArrayOfbyte, @NotNull RequestOptions paramRequestOptions, @NotNull Continuation<? super HTTPResponse> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   Object send(@NotNull String paramString, @NotNull Multipart paramMultipart, @NotNull RequestOptions paramRequestOptions, @NotNull Continuation<? super HTTPResponse> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   Object receiveContinuousSSE(@NotNull String paramString1, @NotNull String paramString2, @NotNull RequestOptions paramRequestOptions, boolean paramBoolean, @NotNull Continuation<? super Flow<ServerSentEvent>> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   Object receiveLineStream(@NotNull String paramString1, @NotNull String paramString2, @NotNull RequestOptions paramRequestOptions, @NotNull Function1<? super String, Boolean> paramFunction1, @NotNull Continuation<? super Flow<String>> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   Object get(@NotNull String paramString, @NotNull RequestOptions paramRequestOptions, @NotNull Continuation<? super HTTPResponse> paramContinuation);
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\SuspendableHTTPClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */