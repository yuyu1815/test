/*     */ package ai.grazie.client.ktor;
/*     */ 
/*     */ import ai.grazie.client.common.model.HTTPResponse;
/*     */ import ai.grazie.client.common.model.Multipart;
/*     */ import ai.grazie.client.common.model.RequestOptions;
/*     */ import ai.grazie.model.cloud.HttpTimeoutConfig;
/*     */ import ai.grazie.model.cloud.sse.ServerSentEvent;
/*     */ import io.ktor.client.plugins.HttpTimeoutConfig;
/*     */ import io.ktor.client.request.HttpRequestBuilder;
/*     */ import io.ktor.client.statement.HttpResponse;
/*     */ import io.ktor.http.HeadersBuilder;
/*     */ import java.util.Map;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.reflect.KClass;
/*     */ import kotlin.reflect.KType;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Mockable
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\n\002\020$\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020\022\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\002\n\002\b\002\n\002\020\021\n\002\030\002\n\002\b\004\b\027\030\0002\0020\001:\001@B\027\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005¢\006\002\020\006J\026\020\t\032\b\022\004\022\0020\0130\n2\006\020\f\032\0020\rH\022J\036\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\023H@¢\006\002\020\024J4\020\025\032\b\022\004\022\0020\0270\0262\006\020\020\032\0020\0212\006\020\030\032\0020\0212\006\020\022\032\0020\0232\006\020\031\032\0020\032H@¢\006\002\020\033Jz\020\025\032\b\022\004\022\0020\0270\0262\006\020\020\032\0020\0212\006\020\030\032\0020\0212\022\020\034\032\016\022\004\022\0020\021\022\004\022\0020\0210\0352\022\020\036\032\016\022\004\022\0020\021\022\004\022\0020\0210\0352\"\020\037\032\036\b\001\022\004\022\0020\027\022\n\022\b\022\004\022\0020\0320!\022\006\022\004\030\0010\"0 2\b\b\002\020\031\032\0020\032H@¢\006\002\020#J@\020$\032\b\022\004\022\0020\0210\0262\006\020\020\032\0020\0212\006\020\030\032\0020\0212\006\020\022\032\0020\0232\022\020%\032\016\022\004\022\0020\021\022\004\022\0020\0320&H@¢\006\002\020'J`\020$\032\b\022\004\022\0020\0210\0262\006\020\020\032\0020\0212\006\020\030\032\0020\0212\022\020\034\032\016\022\004\022\0020\021\022\004\022\0020\0210\0352\022\020\036\032\016\022\004\022\0020\021\022\004\022\0020\0210\0352\022\020%\032\016\022\004\022\0020\021\022\004\022\0020\0320&H@¢\006\002\020(J&\020)\032\0020\0172\006\020\020\032\0020\0212\006\020\030\032\0020\r2\006\020\022\032\0020\023H@¢\006\002\020*J\036\020)\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\023H@¢\006\002\020\024J&\020)\032\0020\0172\006\020\020\032\0020\0212\006\020\030\032\0020+2\006\020\022\032\0020\023H@¢\006\002\020,J@\020-\032\002H.\"\004\b\000\020.2\006\020/\032\002002\"\0201\032\036\b\001\022\004\022\00202\022\n\022\b\022\004\022\002H.0!\022\006\022\004\030\0010\"0 H@¢\006\002\0203J@\0204\032\002002\006\020\020\032\0020\0212\022\020\036\032\016\022\004\022\0020\021\022\004\022\0020\0210\0352\022\020\034\032\016\022\004\022\0020\021\022\004\022\0020\0210\0352\006\020\030\032\0020\021H\022J\026\0205\032\0020\0172\006\0206\032\00202H@¢\006\002\0207J\034\0208\032\00209*\002002\006\020\020\032\0020\0212\006\020:\032\0020\023H\022JQ\020\034\032\00209*\002002\022\020\034\032\016\022\004\022\0020\021\022\004\022\0020\0210\0352*\020;\032\026\022\022\b\001\022\016\022\004\022\0020\021\022\004\022\0020\0210=0<\"\016\022\004\022\0020\021\022\004\022\0020\0210=H\022¢\006\002\020>J(\020\020\032\00209*\002002\006\020\020\032\0020\0212\022\020?\032\016\022\004\022\0020\021\022\004\022\0020\0210\035H\022R\016\020\002\032\0020\003X\004¢\006\002\n\000R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\007\020\b¨\006A"}, d2 = {"Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "Lai/grazie/client/common/SuspendableHTTPClient;", "client", "Lio/ktor/client/HttpClient;", "setup", "Lai/grazie/utils/http/HttpClientRequestSetup;", "(Lio/ktor/client/HttpClient;Lai/grazie/utils/http/HttpClientRequestSetup;)V", "getSetup", "()Lai/grazie/utils/http/HttpClientRequestSetup;", "buildMultipart", "", "Lio/ktor/http/content/PartData;", "multipart", "Lai/grazie/client/common/model/Multipart;", "get", "Lai/grazie/client/common/model/HTTPResponse;", "url", "", "options", "Lai/grazie/client/common/model/RequestOptions;", "(Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveContinuousSSE", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/model/cloud/sse/ServerSentEvent;", "content", "reconnect", "", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "headers", "", "queryParams", "isEnd", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function2;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveLineStream", "isLastLine", "Lkotlin/Function1;", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "send", "(Ljava/lang/String;Lai/grazie/client/common/model/Multipart;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/lang/String;[BLai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendAndWaitBody", "T", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "body", "Lio/ktor/client/statement/HttpResponse;", "(Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamRequestBuilder", "toResponse", "response", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apply", "", "requestOptions", "additionalHeaders", "", "Lkotlin/Pair;", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/util/Map;[Lkotlin/Pair;)V", "parameters", "Client", "client-ktor"})
/*     */ @SourceDebugExtension({"SMAP\nGrazieKtorHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieKtorHTTPClient.kt\nai/grazie/client/ktor/GrazieKtorHTTPClient\n+ 2 RequestBody.kt\nio/ktor/client/request/RequestBodyKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n+ 4 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 5 builders.kt\nio/ktor/client/request/BuildersKt\n*L\n1#1,216:1\n16#2,4:217\n21#2,10:239\n16#2,4:249\n21#2,10:271\n16#2,4:301\n21#2,10:323\n65#3,18:221\n65#3,18:253\n65#3,18:282\n65#3,18:305\n162#4:281\n43#5:300\n*S KotlinDebug\n*F\n+ 1 GrazieKtorHTTPClient.kt\nai/grazie/client/ktor/GrazieKtorHTTPClient\n*L\n58#1:217,4\n58#1:239,10\n67#1:249,4\n67#1:271,10\n166#1:301,4\n166#1:323,10\n58#1:221,18\n67#1:253,18\n97#1:282,18\n166#1:305,18\n97#1:281\n148#1:300\n*E\n"})
/*     */ public class GrazieKtorHTTPClient implements SuspendableHTTPClient {
/*  32 */   public GrazieKtorHTTPClient(@NotNull HttpClient client, @NotNull HttpClientRequestSetup setup) { this.client = client;
/*  33 */     this.setup = setup; } @NotNull private final HttpClient client; @NotNull private final HttpClientRequestSetup setup; @NotNull public HttpClientRequestSetup getSetup() { return this.setup; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\f\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J/\020\017\032\0020\0042\b\b\002\020\020\032\0020\0212\035\b\002\020\022\032\027\022\b\022\006\022\002\b\0030\024\022\004\022\0020\0250\023¢\006\002\b\026R\033\020\003\032\0020\0048FX\002¢\006\f\n\004\b\007\020\b\032\004\b\005\020\006R\033\020\t\032\0020\0048FX\002¢\006\f\n\004\b\013\020\b\032\004\b\n\020\006R\033\020\f\032\0020\0048FX\002¢\006\f\n\004\b\016\020\b\032\004\b\r\020\006¨\006\027"}, d2 = {"Lai/grazie/client/ktor/GrazieKtorHTTPClient$Client;", "", "()V", "Default", "Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "getDefault", "()Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "Default$delegate", "Lkotlin/Lazy;", "WithExtendedTimeout", "getWithExtendedTimeout", "WithExtendedTimeout$delegate", "WithOneMinuteTimeout", "getWithOneMinuteTimeout", "WithOneMinuteTimeout$delegate", "default", "prefix", "", "config", "Lkotlin/Function1;", "Lio/ktor/client/HttpClientConfig;", "", "Lkotlin/ExtensionFunctionType;", "client-ktor"})
/*     */   public static final class Client
/*     */   {
/*     */     @NotNull
/*  43 */     public static final Client INSTANCE = new Client(); @NotNull private static final Lazy Default$delegate = LazyKt.lazy(GrazieKtorHTTPClient$Client$Default$2.INSTANCE); @NotNull public final GrazieKtorHTTPClient getDefault() { Lazy lazy = Default$delegate; return (GrazieKtorHTTPClient)lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "invoke"}) static final class GrazieKtorHTTPClient$Client$Default$2 extends Lambda implements Function0<GrazieKtorHTTPClient> { public static final GrazieKtorHTTPClient$Client$Default$2 INSTANCE = new GrazieKtorHTTPClient$Client$Default$2(); GrazieKtorHTTPClient$Client$Default$2() { super(0); } public final GrazieKtorHTTPClient invoke() { return new GrazieKtorHTTPClient(PlatformHttpClient.client$default(PlatformHttpClient.INSTANCE, "Default", null, 2, null), null, 2, null); } } @NotNull
/*  44 */     private static final Lazy WithExtendedTimeout$delegate = LazyKt.lazy(GrazieKtorHTTPClient$Client$WithExtendedTimeout$2.INSTANCE); @NotNull public final GrazieKtorHTTPClient getWithExtendedTimeout() { Lazy lazy = WithExtendedTimeout$delegate; return (GrazieKtorHTTPClient)lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "invoke"}) static final class GrazieKtorHTTPClient$Client$WithExtendedTimeout$2 extends Lambda implements Function0<GrazieKtorHTTPClient> { public static final GrazieKtorHTTPClient$Client$WithExtendedTimeout$2 INSTANCE = new GrazieKtorHTTPClient$Client$WithExtendedTimeout$2(); GrazieKtorHTTPClient$Client$WithExtendedTimeout$2() { super(0); } public final GrazieKtorHTTPClient invoke() { return new GrazieKtorHTTPClient(UtilsKt.withExtendedTimeout$default(PlatformHttpClient.client$default(PlatformHttpClient.INSTANCE, "WithExtendedTimeout", null, 2, null), 0L, 0L, 0L, 7, null), null, 2, null); } } @NotNull
/*  45 */     private static final Lazy WithOneMinuteTimeout$delegate = LazyKt.lazy(GrazieKtorHTTPClient$Client$WithOneMinuteTimeout$2.INSTANCE); @NotNull public final GrazieKtorHTTPClient getWithOneMinuteTimeout() { Lazy lazy = WithOneMinuteTimeout$delegate; return (GrazieKtorHTTPClient)lazy.getValue(); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lai/grazie/client/ktor/GrazieKtorHTTPClient;", "invoke"}) static final class GrazieKtorHTTPClient$Client$WithOneMinuteTimeout$2 extends Lambda implements Function0<GrazieKtorHTTPClient> { public static final GrazieKtorHTTPClient$Client$WithOneMinuteTimeout$2 INSTANCE = new GrazieKtorHTTPClient$Client$WithOneMinuteTimeout$2(); GrazieKtorHTTPClient$Client$WithOneMinuteTimeout$2() { super(0); } public final GrazieKtorHTTPClient invoke() { return new GrazieKtorHTTPClient(UtilsKt.withOneMinuteTimeout(PlatformHttpClient.client$default(PlatformHttpClient.INSTANCE, "WithOneMinuteTimeout", null, 2, null)), null, 2, null); } } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\006\022\002\b\0030\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/client/HttpClientConfig;", "invoke"})
/*     */     static final class GrazieKtorHTTPClient$Client$default$4 extends Lambda implements Function1<HttpClientConfig<?>, Unit> { public static final GrazieKtorHTTPClient$Client$default$4 INSTANCE = new GrazieKtorHTTPClient$Client$default$4(); GrazieKtorHTTPClient$Client$default$4() { super(1); }
/*  47 */       public final void invoke(HttpClientConfig $this$null) { Intrinsics.checkNotNullParameter($this$null, "$this$null"); } } @NotNull
/*  48 */     public final GrazieKtorHTTPClient default(@NotNull String prefix, @NotNull Function1 config) { Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(config, "config"); return new GrazieKtorHTTPClient(PlatformHttpClient.INSTANCE.client(prefix, config), null, 2, null); }
/*     */      }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/http/HeadersBuilder;", "invoke"})
/*     */   static final class GrazieKtorHTTPClient$send$builder$1$1 extends Lambda implements Function1<HeadersBuilder, Unit> { public static final GrazieKtorHTTPClient$send$builder$1$1 INSTANCE = new GrazieKtorHTTPClient$send$builder$1$1();
/*     */     
/*     */     public final void invoke(HeadersBuilder $this$headers) {
/*  55 */       Intrinsics.checkNotNullParameter($this$headers, "$this$headers"); $this$headers.append(HttpHeaders.INSTANCE.getContentType(), "application/json");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     GrazieKtorHTTPClient$send$builder$1$1() {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Object toResponse(HttpResponse response, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof ai/grazie/client/ktor/GrazieKtorHTTPClient$toResponse$1
/*     */     //   4: ifeq -> 41
/*     */     //   7: aload_2
/*     */     //   8: checkcast ai/grazie/client/ktor/GrazieKtorHTTPClient$toResponse$1
/*     */     //   11: astore #17
/*     */     //   13: aload #17
/*     */     //   15: getfield label : I
/*     */     //   18: ldc_w -2147483648
/*     */     //   21: iand
/*     */     //   22: ifeq -> 41
/*     */     //   25: aload #17
/*     */     //   27: dup
/*     */     //   28: getfield label : I
/*     */     //   31: ldc_w -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 52
/*     */     //   41: new ai/grazie/client/ktor/GrazieKtorHTTPClient$toResponse$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload_2
/*     */     //   47: invokespecial <init> : (Lai/grazie/client/ktor/GrazieKtorHTTPClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   50: astore #17
/*     */     //   52: aload #17
/*     */     //   54: getfield result : Ljava/lang/Object;
/*     */     //   57: astore #16
/*     */     //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   62: astore #21
/*     */     //   64: aload #17
/*     */     //   66: getfield label : I
/*     */     //   69: tableswitch default -> 279, 0 -> 92, 1 -> 221
/*     */     //   92: aload #16
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: getstatic ai/grazie/model/cloud/HeaderCollection.Companion : Lai/grazie/model/cloud/HeaderCollection$Companion;
/*     */     //   100: aload_1
/*     */     //   101: invokevirtual getHeaders : ()Lio/ktor/http/Headers;
/*     */     //   104: checkcast io/ktor/util/StringValues
/*     */     //   107: invokestatic toMap : (Lio/ktor/util/StringValues;)Ljava/util/Map;
/*     */     //   110: invokestatic of : (Lai/grazie/model/cloud/HeaderCollection$Companion;Ljava/util/Map;)Lai/grazie/model/cloud/HeaderCollection;
/*     */     //   113: aload_1
/*     */     //   114: invokevirtual getStatus : ()Lio/ktor/http/HttpStatusCode;
/*     */     //   117: invokevirtual getValue : ()I
/*     */     //   120: aload_1
/*     */     //   121: astore_3
/*     */     //   122: istore #14
/*     */     //   124: astore #13
/*     */     //   126: iconst_0
/*     */     //   127: istore #4
/*     */     //   129: aload_3
/*     */     //   130: invokevirtual getCall : ()Lio/ktor/client/call/HttpClientCall;
/*     */     //   133: astore #5
/*     */     //   135: iconst_0
/*     */     //   136: istore #6
/*     */     //   138: ldc [B
/*     */     //   140: invokestatic getOrCreateKotlinClass : (Ljava/lang/Class;)Lkotlin/reflect/KClass;
/*     */     //   143: astore #7
/*     */     //   145: iconst_0
/*     */     //   146: istore #8
/*     */     //   148: nop
/*     */     //   149: ldc [B
/*     */     //   151: invokestatic nullableTypeOf : (Ljava/lang/Class;)Lkotlin/reflect/KType;
/*     */     //   154: astore #9
/*     */     //   156: goto -> 164
/*     */     //   159: astore #10
/*     */     //   161: aconst_null
/*     */     //   162: astore #9
/*     */     //   164: aload #7
/*     */     //   166: nop
/*     */     //   167: aload #9
/*     */     //   169: astore #11
/*     */     //   171: astore #12
/*     */     //   173: new io/ktor/util/reflect/TypeInfo
/*     */     //   176: dup
/*     */     //   177: aload #12
/*     */     //   179: aload #11
/*     */     //   181: invokespecial <init> : (Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)V
/*     */     //   184: aload #5
/*     */     //   186: swap
/*     */     //   187: aload #17
/*     */     //   189: aload #17
/*     */     //   191: aload #13
/*     */     //   193: putfield L$0 : Ljava/lang/Object;
/*     */     //   196: aload #17
/*     */     //   198: iload #14
/*     */     //   200: putfield I$0 : I
/*     */     //   203: aload #17
/*     */     //   205: iconst_1
/*     */     //   206: putfield label : I
/*     */     //   209: invokevirtual bodyNullable : (Lio/ktor/util/reflect/TypeInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   212: dup
/*     */     //   213: aload #21
/*     */     //   215: if_acmpne -> 248
/*     */     //   218: aload #21
/*     */     //   220: areturn
/*     */     //   221: iconst_0
/*     */     //   222: istore #4
/*     */     //   224: aload #17
/*     */     //   226: getfield I$0 : I
/*     */     //   229: istore #14
/*     */     //   231: aload #17
/*     */     //   233: getfield L$0 : Ljava/lang/Object;
/*     */     //   236: checkcast ai/grazie/model/cloud/HeaderCollection
/*     */     //   239: astore #13
/*     */     //   241: aload #16
/*     */     //   243: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   246: aload #16
/*     */     //   248: checkcast [B
/*     */     //   251: astore #15
/*     */     //   253: aload #13
/*     */     //   255: iload #14
/*     */     //   257: aload #15
/*     */     //   259: astore #18
/*     */     //   261: istore #19
/*     */     //   263: astore #20
/*     */     //   265: new ai/grazie/client/common/model/HTTPResponse
/*     */     //   268: dup
/*     */     //   269: aload #20
/*     */     //   271: iload #19
/*     */     //   273: aload #18
/*     */     //   275: invokespecial <init> : (Lai/grazie/model/cloud/HeaderCollection;I[B)V
/*     */     //   278: areturn
/*     */     //   279: new java/lang/IllegalStateException
/*     */     //   282: dup
/*     */     //   283: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   286: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   289: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #96	-> 62
/*     */     //   #97	-> 97
/*     */     //   #281	-> 129
/*     */     //   #282	-> 138
/*     */     //   #292	-> 148
/*     */     //   #296	-> 149
/*     */     //   #297	-> 159
/*     */     //   #298	-> 161
/*     */     //   #299	-> 166
/*     */     //   #282	-> 169
/*     */     //   #281	-> 189
/*     */     //   #96	-> 218
/*     */     //   #281	-> 248
/*     */     //   #97	-> 259
/*     */     //   #96	-> 279
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	29	1	response	Lio/ktor/client/statement/HttpResponse;
/*     */     //   126	12	3	$this$body$iv	Lio/ktor/client/statement/HttpResponse;
/*     */     //   148	19	8	$i$f$typeOfOrNull	I
/*     */     //   138	46	6	$i$f$typeInfo	I
/*     */     //   129	92	4	$i$f$body	I
/*     */     //   0	290	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   52	227	17	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   59	220	16	$result	Ljava/lang/Object;
/*     */     //   224	27	4	$i$f$body	I
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   148	156	159	java/lang/Throwable
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private List<PartData> buildMultipart(Multipart multipart) {
/* 101 */     return FormDslKt.formData(new GrazieKtorHTTPClient$buildMultipart$1(multipart));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/client/request/forms/FormBuilder;", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nGrazieKtorHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieKtorHTTPClient.kt\nai/grazie/client/ktor/GrazieKtorHTTPClient$buildMultipart$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Headers.kt\nio/ktor/http/Headers$Companion\n*L\n1#1,216:1\n13402#2:217\n13402#2,2:219\n13402#2,2:222\n13403#2:224\n30#3:218\n30#3:221\n*S KotlinDebug\n*F\n+ 1 GrazieKtorHTTPClient.kt\nai/grazie/client/ktor/GrazieKtorHTTPClient$buildMultipart$1\n*L\n102#1:217\n105#1:219,2\n114#1:222,2\n102#1:224\n104#1:218\n113#1:221\n*E\n"})
/*     */   static final class GrazieKtorHTTPClient$buildMultipart$1
/*     */     extends Lambda
/*     */     implements Function1<FormBuilder, Unit>
/*     */   {
/*     */     public final void invoke(FormBuilder $this$formData) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$formData'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_0
/*     */       //   7: getfield $multipart : Lai/grazie/client/common/model/Multipart;
/*     */       //   10: invokevirtual getParts : ()[Lai/grazie/client/common/model/Multipart$PartItem;
/*     */       //   13: astore_2
/*     */       //   14: iconst_0
/*     */       //   15: istore_3
/*     */       //   16: iconst_0
/*     */       //   17: istore #4
/*     */       //   19: aload_2
/*     */       //   20: arraylength
/*     */       //   21: istore #5
/*     */       //   23: iload #4
/*     */       //   25: iload #5
/*     */       //   27: if_icmpge -> 430
/*     */       //   30: aload_2
/*     */       //   31: iload #4
/*     */       //   33: aaload
/*     */       //   34: astore #6
/*     */       //   36: aload #6
/*     */       //   38: astore #7
/*     */       //   40: iconst_0
/*     */       //   41: istore #8
/*     */       //   43: aload #7
/*     */       //   45: astore #9
/*     */       //   47: aload #9
/*     */       //   49: instanceof ai/grazie/client/common/model/Multipart$FormPart
/*     */       //   52: ifeq -> 222
/*     */       //   55: aload_1
/*     */       //   56: aload #7
/*     */       //   58: invokeinterface getKey : ()Ljava/lang/String;
/*     */       //   63: aload #7
/*     */       //   65: invokeinterface getValue : ()Ljava/lang/String;
/*     */       //   70: getstatic io/ktor/http/Headers.Companion : Lio/ktor/http/Headers$Companion;
/*     */       //   73: astore #10
/*     */       //   75: iconst_0
/*     */       //   76: istore #11
/*     */       //   78: new io/ktor/http/HeadersBuilder
/*     */       //   81: dup
/*     */       //   82: iconst_0
/*     */       //   83: iconst_1
/*     */       //   84: aconst_null
/*     */       //   85: invokespecial <init> : (IILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */       //   88: astore #12
/*     */       //   90: aload #12
/*     */       //   92: astore #13
/*     */       //   94: astore #14
/*     */       //   96: astore #15
/*     */       //   98: astore #16
/*     */       //   100: iconst_0
/*     */       //   101: istore #17
/*     */       //   103: aload #7
/*     */       //   105: invokeinterface getHeaders : ()Lai/grazie/model/cloud/HeaderCollection;
/*     */       //   110: invokevirtual getKeys : ()[Ljava/lang/String;
/*     */       //   113: astore #18
/*     */       //   115: iconst_0
/*     */       //   116: istore #19
/*     */       //   118: iconst_0
/*     */       //   119: istore #20
/*     */       //   121: aload #18
/*     */       //   123: arraylength
/*     */       //   124: istore #21
/*     */       //   126: iload #20
/*     */       //   128: iload #21
/*     */       //   130: if_icmpge -> 198
/*     */       //   133: aload #18
/*     */       //   135: iload #20
/*     */       //   137: aaload
/*     */       //   138: astore #22
/*     */       //   140: aload #22
/*     */       //   142: astore #23
/*     */       //   144: iconst_0
/*     */       //   145: istore #24
/*     */       //   147: aload #13
/*     */       //   149: aload #23
/*     */       //   151: aload #7
/*     */       //   153: invokeinterface getHeaders : ()Lai/grazie/model/cloud/HeaderCollection;
/*     */       //   158: aload #23
/*     */       //   160: invokevirtual get : (Ljava/lang/String;)[Ljava/lang/String;
/*     */       //   163: dup
/*     */       //   164: ifnull -> 180
/*     */       //   167: invokestatic toList : ([Ljava/lang/Object;)Ljava/util/List;
/*     */       //   170: dup
/*     */       //   171: ifnull -> 180
/*     */       //   174: checkcast java/lang/Iterable
/*     */       //   177: goto -> 187
/*     */       //   180: pop
/*     */       //   181: invokestatic emptyList : ()Ljava/util/List;
/*     */       //   184: checkcast java/lang/Iterable
/*     */       //   187: invokevirtual appendAll : (Ljava/lang/String;Ljava/lang/Iterable;)V
/*     */       //   190: nop
/*     */       //   191: nop
/*     */       //   192: iinc #20, 1
/*     */       //   195: goto -> 126
/*     */       //   198: nop
/*     */       //   199: nop
/*     */       //   200: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   203: astore #25
/*     */       //   205: aload #16
/*     */       //   207: aload #15
/*     */       //   209: aload #14
/*     */       //   211: aload #12
/*     */       //   213: invokevirtual build : ()Lio/ktor/http/Headers;
/*     */       //   216: invokevirtual append : (Ljava/lang/String;Ljava/lang/String;Lio/ktor/http/Headers;)V
/*     */       //   219: goto -> 422
/*     */       //   222: aload #9
/*     */       //   224: instanceof ai/grazie/client/common/model/Multipart$FilePart
/*     */       //   227: ifeq -> 422
/*     */       //   230: aload_1
/*     */       //   231: aload #7
/*     */       //   233: invokeinterface getKey : ()Ljava/lang/String;
/*     */       //   238: getstatic io/ktor/http/Headers.Companion : Lio/ktor/http/Headers$Companion;
/*     */       //   241: astore #10
/*     */       //   243: iconst_0
/*     */       //   244: istore #11
/*     */       //   246: new io/ktor/http/HeadersBuilder
/*     */       //   249: dup
/*     */       //   250: iconst_0
/*     */       //   251: iconst_1
/*     */       //   252: aconst_null
/*     */       //   253: invokespecial <init> : (IILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */       //   256: astore #12
/*     */       //   258: aload #12
/*     */       //   260: astore #13
/*     */       //   262: astore #15
/*     */       //   264: astore #16
/*     */       //   266: iconst_0
/*     */       //   267: istore #17
/*     */       //   269: aload #7
/*     */       //   271: invokeinterface getHeaders : ()Lai/grazie/model/cloud/HeaderCollection;
/*     */       //   276: invokevirtual getKeys : ()[Ljava/lang/String;
/*     */       //   279: astore #18
/*     */       //   281: iconst_0
/*     */       //   282: istore #19
/*     */       //   284: iconst_0
/*     */       //   285: istore #20
/*     */       //   287: aload #18
/*     */       //   289: arraylength
/*     */       //   290: istore #21
/*     */       //   292: iload #20
/*     */       //   294: iload #21
/*     */       //   296: if_icmpge -> 364
/*     */       //   299: aload #18
/*     */       //   301: iload #20
/*     */       //   303: aaload
/*     */       //   304: astore #22
/*     */       //   306: aload #22
/*     */       //   308: astore #23
/*     */       //   310: iconst_0
/*     */       //   311: istore #24
/*     */       //   313: aload #13
/*     */       //   315: aload #23
/*     */       //   317: aload #7
/*     */       //   319: invokeinterface getHeaders : ()Lai/grazie/model/cloud/HeaderCollection;
/*     */       //   324: aload #23
/*     */       //   326: invokevirtual get : (Ljava/lang/String;)[Ljava/lang/String;
/*     */       //   329: dup
/*     */       //   330: ifnull -> 346
/*     */       //   333: invokestatic toList : ([Ljava/lang/Object;)Ljava/util/List;
/*     */       //   336: dup
/*     */       //   337: ifnull -> 346
/*     */       //   340: checkcast java/lang/Iterable
/*     */       //   343: goto -> 353
/*     */       //   346: pop
/*     */       //   347: invokestatic emptyList : ()Ljava/util/List;
/*     */       //   350: checkcast java/lang/Iterable
/*     */       //   353: invokevirtual appendAll : (Ljava/lang/String;Ljava/lang/Iterable;)V
/*     */       //   356: nop
/*     */       //   357: nop
/*     */       //   358: iinc #20, 1
/*     */       //   361: goto -> 292
/*     */       //   364: nop
/*     */       //   365: aload #13
/*     */       //   367: getstatic io/ktor/http/HttpHeaders.INSTANCE : Lio/ktor/http/HttpHeaders;
/*     */       //   370: invokevirtual getContentDisposition : ()Ljava/lang/String;
/*     */       //   373: aload #7
/*     */       //   375: checkcast ai/grazie/client/common/model/Multipart$FilePart
/*     */       //   378: invokevirtual getFileName : ()Ljava/lang/String;
/*     */       //   381: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   386: invokevirtual append : (Ljava/lang/String;Ljava/lang/String;)V
/*     */       //   389: nop
/*     */       //   390: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   393: astore #14
/*     */       //   395: aload #16
/*     */       //   397: aload #15
/*     */       //   399: aload #12
/*     */       //   401: invokevirtual build : ()Lio/ktor/http/Headers;
/*     */       //   404: aconst_null
/*     */       //   405: new ai/grazie/client/ktor/GrazieKtorHTTPClient$buildMultipart$1$1$3
/*     */       //   408: dup
/*     */       //   409: aload #7
/*     */       //   411: invokespecial <init> : (Lai/grazie/client/common/model/Multipart$PartItem;)V
/*     */       //   414: checkcast kotlin/jvm/functions/Function0
/*     */       //   417: iconst_4
/*     */       //   418: aconst_null
/*     */       //   419: invokestatic appendInput$default : (Lio/ktor/client/request/forms/FormBuilder;Ljava/lang/String;Lio/ktor/http/Headers;Ljava/lang/Long;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
/*     */       //   422: nop
/*     */       //   423: nop
/*     */       //   424: iinc #4, 1
/*     */       //   427: goto -> 23
/*     */       //   430: nop
/*     */       //   431: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #102	-> 6
/*     */       //   #217	-> 16
/*     */       //   #103	-> 43
/*     */       //   #104	-> 47
/*     */       //   #218	-> 78
/*     */       //   #105	-> 103
/*     */       //   #219	-> 118
/*     */       //   #106	-> 147
/*     */       //   #107	-> 190
/*     */       //   #219	-> 191
/*     */       //   #220	-> 198
/*     */       //   #108	-> 199
/*     */       //   #218	-> 211
/*     */       //   #218	-> 213
/*     */       //   #104	-> 216
/*     */       //   #110	-> 222
/*     */       //   #111	-> 230
/*     */       //   #112	-> 231
/*     */       //   #113	-> 238
/*     */       //   #221	-> 246
/*     */       //   #114	-> 269
/*     */       //   #222	-> 284
/*     */       //   #115	-> 313
/*     */       //   #116	-> 356
/*     */       //   #222	-> 357
/*     */       //   #223	-> 364
/*     */       //   #117	-> 365
/*     */       //   #118	-> 389
/*     */       //   #221	-> 399
/*     */       //   #221	-> 401
/*     */       //   #111	-> 404
/*     */       //   #124	-> 422
/*     */       //   #217	-> 423
/*     */       //   #224	-> 430
/*     */       //   #125	-> 431
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   147	44	24	$i$a$-forEach-GrazieKtorHTTPClient$buildMultipart$1$1$1$1	I
/*     */       //   144	47	23	e	Ljava/lang/String;
/*     */       //   140	52	22	element$iv	Ljava/lang/Object;
/*     */       //   118	81	19	$i$f$forEach	I
/*     */       //   115	84	18	$this$forEach$iv	[Ljava/lang/Object;
/*     */       //   103	97	17	$i$a$-build-GrazieKtorHTTPClient$buildMultipart$1$1$1	I
/*     */       //   100	100	13	$this$invoke_u24lambda_u244_u24lambda_u241	Lio/ktor/http/HeadersBuilder;
/*     */       //   78	138	11	$i$f$build	I
/*     */       //   75	141	10	this_$iv	Lio/ktor/http/Headers$Companion;
/*     */       //   313	44	24	$i$a$-forEach-GrazieKtorHTTPClient$buildMultipart$1$1$2$1	I
/*     */       //   310	47	23	e	Ljava/lang/String;
/*     */       //   306	52	22	element$iv	Ljava/lang/Object;
/*     */       //   284	81	19	$i$f$forEach	I
/*     */       //   281	84	18	$this$forEach$iv	[Ljava/lang/Object;
/*     */       //   269	121	17	$i$a$-build-GrazieKtorHTTPClient$buildMultipart$1$1$2	I
/*     */       //   266	124	13	$this$invoke_u24lambda_u244_u24lambda_u243	Lio/ktor/http/HeadersBuilder;
/*     */       //   246	158	11	$i$f$build	I
/*     */       //   243	161	10	this_$iv	Lio/ktor/http/Headers$Companion;
/*     */       //   43	380	8	$i$a$-forEach-GrazieKtorHTTPClient$buildMultipart$1$1	I
/*     */       //   40	383	7	it	Lai/grazie/client/common/model/Multipart$PartItem;
/*     */       //   36	388	6	element$iv	Ljava/lang/Object;
/*     */       //   16	415	3	$i$f$forEach	I
/*     */       //   14	417	2	$this$forEach$iv	[Ljava/lang/Object;
/*     */       //   0	432	0	this	Lai/grazie/client/ktor/GrazieKtorHTTPClient$buildMultipart$1;
/*     */       //   0	432	1	$this$formData	Lio/ktor/client/request/forms/FormBuilder;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     GrazieKtorHTTPClient$buildMultipart$1(Multipart $multipart) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void apply(HttpRequestBuilder $this$apply, String url, RequestOptions requestOptions) {
/* 129 */     HttpRequestKt.url($this$apply, url);
/* 130 */     for (Map.Entry entry : QueryParameterCollectionKt.toMap(requestOptions.getQueryParameters()).entrySet()) { String key = (String)entry.getKey(), value = (String)entry.getValue();
/* 131 */       $this$apply.getUrl().getParameters().append(key, value); }
/*     */     
/* 133 */     HttpRequestKt.headers((HttpMessageBuilder)$this$apply, new GrazieKtorHTTPClient$apply$1(requestOptions));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 138 */     HttpTimeoutKt.timeout($this$apply, new GrazieKtorHTTPClient$apply$2(requestOptions));
/* 139 */   } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/http/HeadersBuilder;", "invoke"}) static final class GrazieKtorHTTPClient$apply$1 extends Lambda implements Function1<HeadersBuilder, Unit> { public final void invoke(HeadersBuilder $this$headers) { Intrinsics.checkNotNullParameter($this$headers, "$this$headers"); for (Map.Entry entry : HeaderCollectionKt.toMap(this.$requestOptions.getHeaders()).entrySet()) { String key = (String)entry.getKey(), value = (String)entry.getValue(); $this$headers.append(key, value); }  } GrazieKtorHTTPClient$apply$1(RequestOptions $requestOptions) { super(1); } } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/HttpTimeoutConfig;", "invoke"}) @SourceDebugExtension({"SMAP\nGrazieKtorHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieKtorHTTPClient.kt\nai/grazie/client/ktor/GrazieKtorHTTPClient$apply$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n1#2:217\n*E\n"}) static final class GrazieKtorHTTPClient$apply$2 extends Lambda implements Function1<HttpTimeoutConfig, Unit> { public final void invoke(HttpTimeoutConfig $this$timeout) { Intrinsics.checkNotNullParameter($this$timeout, "$this$timeout"); HttpTimeoutConfig timeoutConfig = this.$requestOptions.getTimeoutConfig(); int $i$a$-let-GrazieKtorHTTPClient$apply$2$1 = 0;
/* 140 */       if (timeoutConfig.getRequestTimeout() != null) { long it = timeoutConfig.getRequestTimeout().getMillis();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 217 */         int $i$a$-let-GrazieKtorHTTPClient$apply$2$1$1 = 0; $this$timeout.setRequestTimeoutMillis(Long.valueOf(it)); } else { timeoutConfig.getRequestTimeout(); }  if (timeoutConfig.getConnectTimeout() != null) { long it = timeoutConfig.getConnectTimeout().getMillis(); int $i$a$-let-GrazieKtorHTTPClient$apply$2$1$2 = 0; $this$timeout.setConnectTimeoutMillis(Long.valueOf(it)); } else { timeoutConfig.getConnectTimeout(); }  if (timeoutConfig.getSocketTimeout() != null) { long it = timeoutConfig.getSocketTimeout().getMillis(); int $i$a$-let-GrazieKtorHTTPClient$apply$2$1$3 = 0;
/*     */         $this$timeout.setSocketTimeoutMillis(Long.valueOf(it)); }
/*     */       else
/*     */       { timeoutConfig.getSocketTimeout(); }
/*     */       
/*     */       this.$requestOptions.getTimeoutConfig(); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     GrazieKtorHTTPClient$apply$2(RequestOptions $requestOptions) {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private <T> Object sendAndWaitBody(HttpRequestBuilder request, Function2 body, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof ai/grazie/client/ktor/GrazieKtorHTTPClient$sendAndWaitBody$1
/*     */     //   4: ifeq -> 41
/*     */     //   7: aload_3
/*     */     //   8: checkcast ai/grazie/client/ktor/GrazieKtorHTTPClient$sendAndWaitBody$1
/*     */     //   11: astore #8
/*     */     //   13: aload #8
/*     */     //   15: getfield label : I
/*     */     //   18: ldc_w -2147483648
/*     */     //   21: iand
/*     */     //   22: ifeq -> 41
/*     */     //   25: aload #8
/*     */     //   27: dup
/*     */     //   28: getfield label : I
/*     */     //   31: ldc_w -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 52
/*     */     //   41: new ai/grazie/client/ktor/GrazieKtorHTTPClient$sendAndWaitBody$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload_3
/*     */     //   47: invokespecial <init> : (Lai/grazie/client/ktor/GrazieKtorHTTPClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   50: astore #8
/*     */     //   52: aload #8
/*     */     //   54: getfield result : Ljava/lang/Object;
/*     */     //   57: astore #7
/*     */     //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   62: astore #9
/*     */     //   64: aload #8
/*     */     //   66: getfield label : I
/*     */     //   69: tableswitch default -> 267, 0 -> 100, 1 -> 150, 2 -> 217, 3 -> 259
/*     */     //   100: aload #7
/*     */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   105: aload_0
/*     */     //   106: getfield client : Lio/ktor/client/HttpClient;
/*     */     //   109: astore #5
/*     */     //   111: iconst_0
/*     */     //   112: istore #6
/*     */     //   114: new io/ktor/client/statement/HttpStatement
/*     */     //   117: dup
/*     */     //   118: aload_1
/*     */     //   119: aload #5
/*     */     //   121: invokespecial <init> : (Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/HttpClient;)V
/*     */     //   124: aload #8
/*     */     //   126: aload #8
/*     */     //   128: aload_2
/*     */     //   129: putfield L$0 : Ljava/lang/Object;
/*     */     //   132: aload #8
/*     */     //   134: iconst_1
/*     */     //   135: putfield label : I
/*     */     //   138: invokevirtual execute : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   141: dup
/*     */     //   142: aload #9
/*     */     //   144: if_acmpne -> 169
/*     */     //   147: aload #9
/*     */     //   149: areturn
/*     */     //   150: iconst_0
/*     */     //   151: istore #6
/*     */     //   153: aload #8
/*     */     //   155: getfield L$0 : Ljava/lang/Object;
/*     */     //   158: checkcast kotlin/jvm/functions/Function2
/*     */     //   161: astore_2
/*     */     //   162: aload #7
/*     */     //   164: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   167: aload #7
/*     */     //   169: nop
/*     */     //   170: checkcast io/ktor/client/statement/HttpResponse
/*     */     //   173: astore #4
/*     */     //   175: aload #4
/*     */     //   177: invokevirtual getStatus : ()Lio/ktor/http/HttpStatusCode;
/*     */     //   180: invokestatic isSuccess : (Lio/ktor/http/HttpStatusCode;)Z
/*     */     //   183: ifne -> 228
/*     */     //   186: getstatic ai/grazie/model/cloud/exceptions/HttpExceptionBase.Companion : Lai/grazie/model/cloud/exceptions/HttpExceptionBase$Companion;
/*     */     //   189: aload #4
/*     */     //   191: aload #8
/*     */     //   193: aload #8
/*     */     //   195: aconst_null
/*     */     //   196: putfield L$0 : Ljava/lang/Object;
/*     */     //   199: aload #8
/*     */     //   201: iconst_2
/*     */     //   202: putfield label : I
/*     */     //   205: invokestatic of : (Lai/grazie/model/cloud/exceptions/HttpExceptionBase$Companion;Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   208: dup
/*     */     //   209: aload #9
/*     */     //   211: if_acmpne -> 224
/*     */     //   214: aload #9
/*     */     //   216: areturn
/*     */     //   217: aload #7
/*     */     //   219: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   222: aload #7
/*     */     //   224: checkcast java/lang/Throwable
/*     */     //   227: athrow
/*     */     //   228: aload_2
/*     */     //   229: aload #4
/*     */     //   231: aload #8
/*     */     //   233: aload #8
/*     */     //   235: aconst_null
/*     */     //   236: putfield L$0 : Ljava/lang/Object;
/*     */     //   239: aload #8
/*     */     //   241: iconst_3
/*     */     //   242: putfield label : I
/*     */     //   245: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   250: dup
/*     */     //   251: aload #9
/*     */     //   253: if_acmpne -> 266
/*     */     //   256: aload #9
/*     */     //   258: areturn
/*     */     //   259: aload #7
/*     */     //   261: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   264: aload #7
/*     */     //   266: areturn
/*     */     //   267: new java/lang/IllegalStateException
/*     */     //   270: dup
/*     */     //   271: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   274: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   277: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #147	-> 62
/*     */     //   #148	-> 105
/*     */     //   #300	-> 114
/*     */     //   #147	-> 147
/*     */     //   #300	-> 169
/*     */     //   #148	-> 170
/*     */     //   #149	-> 175
/*     */     //   #150	-> 186
/*     */     //   #147	-> 214
/*     */     //   #152	-> 228
/*     */     //   #147	-> 256
/*     */     //   #152	-> 266
/*     */     //   #147	-> 267
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	6	0	this	Lai/grazie/client/ktor/GrazieKtorHTTPClient;
/*     */     //   105	36	1	request	Lio/ktor/client/request/HttpRequestBuilder;
/*     */     //   105	45	2	body	Lkotlin/jvm/functions/Function2;
/*     */     //   162	8	2	body	Lkotlin/jvm/functions/Function2;
/*     */     //   170	16	2	body	Lkotlin/jvm/functions/Function2;
/*     */     //   228	22	2	body	Lkotlin/jvm/functions/Function2;
/*     */     //   175	33	4	result	Lio/ktor/client/statement/HttpResponse;
/*     */     //   228	22	4	result	Lio/ktor/client/statement/HttpResponse;
/*     */     //   111	30	5	$this$request$iv	Lio/ktor/client/HttpClient;
/*     */     //   114	36	6	$i$f$request	I
/*     */     //   0	278	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   52	215	8	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   59	208	7	$result	Ljava/lang/Object;
/*     */     //   153	17	6	$i$f$request	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private HttpRequestBuilder streamRequestBuilder(String url, Map<String, String> queryParams, Map<String, String> headers, String content) {
/*     */     HttpRequestBuilder httpRequestBuilder1 = new HttpRequestBuilder(), $this$streamRequestBuilder_u24lambda_u244 = httpRequestBuilder1;
/*     */     int $i$a$-apply-GrazieKtorHTTPClient$streamRequestBuilder$builder$1 = 0;
/*     */     url($this$streamRequestBuilder_u24lambda_u244, url, queryParams);
/*     */     HttpMessagePropertiesKt.contentType((HttpMessageBuilder)$this$streamRequestBuilder_u24lambda_u244, ContentType.Application.INSTANCE.getJson());
/*     */     headers($this$streamRequestBuilder_u24lambda_u244, headers, (Pair<String, String>[])new Pair[0]);
/*     */     $this$streamRequestBuilder_u24lambda_u244.setMethod(HttpMethod.Companion.getPost());
/*     */     HttpRequestBuilder $this$setBody$iv = $this$streamRequestBuilder_u24lambda_u244;
/*     */     int $i$f$setBody = 0;
/* 301 */     String str = content;
/* 302 */     if (str == null) {
/* 303 */       KType kType1; $this$setBody$iv.setBody(NullBody.INSTANCE);
/* 304 */       HttpRequestBuilder httpRequestBuilder = $this$setBody$iv; int $i$f$typeInfo = 0;
/* 305 */       KClass kClass1 = Reflection.getOrCreateKotlinClass(String.class); int $i$f$typeOfOrNull = 0;
/*     */ 
/*     */ 
/*     */ 
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
/* 319 */         kType1 = Reflection.typeOf(String.class);
/* 320 */       } catch (Throwable <unused var>$iv$iv$iv) {
/* 321 */         kType1 = null;
/* 322 */       }  KType kType2 = kType1; KClass kClass2 = kClass1; httpRequestBuilder.setBodyType(new TypeInfo(kClass2, kType2));
/* 323 */     } else if (str instanceof io.ktor.http.content.OutgoingContent) {
/* 324 */       $this$setBody$iv.setBody(content);
/* 325 */       $this$setBody$iv.setBodyType(null);
/*     */     } else {
/*     */       
/* 328 */       $this$setBody$iv.setBody(content);
/* 329 */       HttpRequestBuilder httpRequestBuilder = $this$setBody$iv; int $i$f$typeInfo = 0;
/*     */       KClass kClass = Reflection.getOrCreateKotlinClass(String.class);
/*     */       int $i$f$typeOfOrNull = 0;
/*     */     } 
/*     */     HttpTimeoutKt.timeout($this$streamRequestBuilder_u24lambda_u244, new GrazieKtorHTTPClient$streamRequestBuilder$builder$1$1());
/*     */     HttpRequestBuilder builder = httpRequestBuilder1;
/*     */     return builder;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/HttpTimeoutConfig;", "invoke"})
/*     */   static final class GrazieKtorHTTPClient$streamRequestBuilder$builder$1$1 extends Lambda implements Function1<HttpTimeoutConfig, Unit> {
/*     */     public final void invoke(HttpTimeoutConfig $this$timeout) {
/*     */       Intrinsics.checkNotNullParameter($this$timeout, "$this$timeout");
/*     */       $this$timeout.setRequestTimeoutMillis(Long.valueOf(Long.MAX_VALUE));
/*     */       $this$timeout.setSocketTimeoutMillis(Long.valueOf(GrazieKtorHTTPClient.this.getSetup().getSseSocketTimeout()));
/*     */     }
/*     */     
/*     */     GrazieKtorHTTPClient$streamRequestBuilder$builder$1$1() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   private Object receiveContinuousSSE(String url, String content, Map<String, String> headers, Map<String, String> queryParams, Function2<? super ServerSentEvent, ? super Continuation<? super Boolean>, ? extends Object> isEnd, boolean reconnect, Continuation $completion) {
/*     */     HttpRequestBuilder builder = streamRequestBuilder(url, queryParams, headers, content);
/*     */     return FlowKt.flow(new GrazieKtorHTTPClient$receiveContinuousSSE$4(builder, reconnect, isEnd, null));
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieKtorHTTPClient.kt", l = {185}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.ktor.GrazieKtorHTTPClient$receiveContinuousSSE$4")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lai/grazie/model/cloud/sse/ServerSentEvent;"})
/*     */   static final class GrazieKtorHTTPClient$receiveContinuousSSE$4 extends SuspendLambda implements Function2<FlowCollector<? super ServerSentEvent>, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     GrazieKtorHTTPClient$receiveContinuousSSE$4(HttpRequestBuilder $builder, boolean $reconnect, Function2<ServerSentEvent, Continuation<? super Boolean>, Object> $isEnd, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore_3
/*     */       //   4: aload_0
/*     */       //   5: getfield label : I
/*     */       //   8: tableswitch default -> 123, 0 -> 32, 1 -> 113
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield L$0 : Ljava/lang/Object;
/*     */       //   40: checkcast kotlinx/coroutines/flow/FlowCollector
/*     */       //   43: astore_2
/*     */       //   44: aload_0
/*     */       //   45: getfield this$0 : Lai/grazie/client/ktor/GrazieKtorHTTPClient;
/*     */       //   48: invokestatic access$getClient$p : (Lai/grazie/client/ktor/GrazieKtorHTTPClient;)Lio/ktor/client/HttpClient;
/*     */       //   51: aload_0
/*     */       //   52: getfield $builder : Lio/ktor/client/request/HttpRequestBuilder;
/*     */       //   55: iconst_1
/*     */       //   56: aload_0
/*     */       //   57: getfield $reconnect : Z
/*     */       //   60: ifne -> 67
/*     */       //   63: iconst_1
/*     */       //   64: goto -> 68
/*     */       //   67: iconst_0
/*     */       //   68: new ai/grazie/client/ktor/GrazieKtorHTTPClient$receiveContinuousSSE$4$1
/*     */       //   71: dup
/*     */       //   72: aload_0
/*     */       //   73: getfield $isEnd : Lkotlin/jvm/functions/Function2;
/*     */       //   76: aconst_null
/*     */       //   77: invokespecial <init> : (Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
/*     */       //   80: checkcast kotlin/jvm/functions/Function2
/*     */       //   83: new ai/grazie/client/ktor/GrazieKtorHTTPClient$receiveContinuousSSE$4$2
/*     */       //   86: dup
/*     */       //   87: aload_2
/*     */       //   88: invokespecial <init> : (Ljava/lang/Object;)V
/*     */       //   91: checkcast kotlin/jvm/functions/Function2
/*     */       //   94: aload_0
/*     */       //   95: checkcast kotlin/coroutines/Continuation
/*     */       //   98: aload_0
/*     */       //   99: iconst_1
/*     */       //   100: putfield label : I
/*     */       //   103: invokestatic readSse : (Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequestBuilder;ZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   106: dup
/*     */       //   107: aload_3
/*     */       //   108: if_acmpne -> 118
/*     */       //   111: aload_3
/*     */       //   112: areturn
/*     */       //   113: aload_1
/*     */       //   114: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   117: aload_1
/*     */       //   118: pop
/*     */       //   119: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   122: areturn
/*     */       //   123: new java/lang/IllegalStateException
/*     */       //   126: dup
/*     */       //   127: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   129: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   132: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #184	-> 3
/*     */       //   #185	-> 44
/*     */       //   #184	-> 111
/*     */       //   #186	-> 118
/*     */       //   #184	-> 123
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   44	62	2	$this$flow	Lkotlinx/coroutines/flow/FlowCollector;
/*     */       //   0	133	0	this	Lai/grazie/client/ktor/GrazieKtorHTTPClient$receiveContinuousSSE$4;
/*     */       //   36	87	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super GrazieKtorHTTPClient$receiveContinuousSSE$4> $completion) {
/*     */       GrazieKtorHTTPClient$receiveContinuousSSE$4 grazieKtorHTTPClient$receiveContinuousSSE$4 = new GrazieKtorHTTPClient$receiveContinuousSSE$4(this.$builder, this.$reconnect, this.$isEnd, $completion);
/*     */       grazieKtorHTTPClient$receiveContinuousSSE$4.L$0 = value;
/*     */       return (Continuation<Unit>)grazieKtorHTTPClient$receiveContinuousSSE$4;
/*     */     }
/*     */     
/*     */     public final Object invoke(FlowCollector p1, Continuation<?> p2) {
/*     */       return ((GrazieKtorHTTPClient$receiveContinuousSSE$4)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private Object receiveLineStream(String url, String content, Map<String, String> headers, Map<String, String> queryParams, Function1<? super String, Boolean> isLastLine, Continuation $completion) {
/*     */     HttpRequestBuilder builder = streamRequestBuilder(url, queryParams, headers, content);
/*     */     return FlowKt.flow(new GrazieKtorHTTPClient$receiveLineStream$3(builder, isLastLine, null));
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieKtorHTTPClient.kt", l = {197}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.ktor.GrazieKtorHTTPClient$receiveLineStream$3")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\020\016\020\000\032\0020\001*\b\022\004\022\0020\0030\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""})
/*     */   static final class GrazieKtorHTTPClient$receiveLineStream$3 extends SuspendLambda implements Function2<FlowCollector<? super String>, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     GrazieKtorHTTPClient$receiveLineStream$3(HttpRequestBuilder $builder, Function1<String, Boolean> $isLastLine, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore_3
/*     */       //   4: aload_0
/*     */       //   5: getfield label : I
/*     */       //   8: tableswitch default -> 99, 0 -> 32, 1 -> 89
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield L$0 : Ljava/lang/Object;
/*     */       //   40: checkcast kotlinx/coroutines/flow/FlowCollector
/*     */       //   43: astore_2
/*     */       //   44: aload_0
/*     */       //   45: getfield this$0 : Lai/grazie/client/ktor/GrazieKtorHTTPClient;
/*     */       //   48: invokestatic access$getClient$p : (Lai/grazie/client/ktor/GrazieKtorHTTPClient;)Lio/ktor/client/HttpClient;
/*     */       //   51: aload_0
/*     */       //   52: getfield $builder : Lio/ktor/client/request/HttpRequestBuilder;
/*     */       //   55: new ai/grazie/client/ktor/GrazieKtorHTTPClient$receiveLineStream$3$1
/*     */       //   58: dup
/*     */       //   59: aload_2
/*     */       //   60: invokespecial <init> : (Ljava/lang/Object;)V
/*     */       //   63: checkcast kotlin/jvm/functions/Function2
/*     */       //   66: aload_0
/*     */       //   67: getfield $isLastLine : Lkotlin/jvm/functions/Function1;
/*     */       //   70: aload_0
/*     */       //   71: checkcast kotlin/coroutines/Continuation
/*     */       //   74: aload_0
/*     */       //   75: iconst_1
/*     */       //   76: putfield label : I
/*     */       //   79: invokestatic readLineStream : (Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   82: dup
/*     */       //   83: aload_3
/*     */       //   84: if_acmpne -> 94
/*     */       //   87: aload_3
/*     */       //   88: areturn
/*     */       //   89: aload_1
/*     */       //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   93: aload_1
/*     */       //   94: pop
/*     */       //   95: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   98: areturn
/*     */       //   99: new java/lang/IllegalStateException
/*     */       //   102: dup
/*     */       //   103: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   105: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   108: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #197	-> 3
/*     */       //   #197	-> 44
/*     */       //   #197	-> 87
/*     */       //   #197	-> 94
/*     */       //   #197	-> 99
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   44	38	2	$this$flow	Lkotlinx/coroutines/flow/FlowCollector;
/*     */       //   0	109	0	this	Lai/grazie/client/ktor/GrazieKtorHTTPClient$receiveLineStream$3;
/*     */       //   36	63	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super GrazieKtorHTTPClient$receiveLineStream$3> $completion) {
/*     */       GrazieKtorHTTPClient$receiveLineStream$3 grazieKtorHTTPClient$receiveLineStream$3 = new GrazieKtorHTTPClient$receiveLineStream$3(this.$builder, this.$isLastLine, $completion);
/*     */       grazieKtorHTTPClient$receiveLineStream$3.L$0 = value;
/*     */       return (Continuation<Unit>)grazieKtorHTTPClient$receiveLineStream$3;
/*     */     }
/*     */     
/*     */     public final Object invoke(FlowCollector p1, Continuation<?> p2) {
/*     */       return ((GrazieKtorHTTPClient$receiveLineStream$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private void headers(HttpRequestBuilder $this$headers, Map<String, String> headers, Pair... additionalHeaders) {
/*     */     HttpRequestKt.headers((HttpMessageBuilder)$this$headers, new GrazieKtorHTTPClient$headers$1(headers, (Pair<String, String>[])additionalHeaders));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/http/HeadersBuilder;", "invoke"})
/*     */   static final class GrazieKtorHTTPClient$headers$1 extends Lambda implements Function1<HeadersBuilder, Unit> {
/*     */     public final void invoke(HeadersBuilder $this$headers) {
/*     */       Intrinsics.checkNotNullParameter($this$headers, "$this$headers");
/*     */       for (Map.Entry entry : MapsKt.plus(this.$headers, (Pair[])this.$additionalHeaders).entrySet()) {
/*     */         String key = (String)entry.getKey(), value = (String)entry.getValue();
/*     */         $this$headers.append(key, value);
/*     */       } 
/*     */     }
/*     */     
/*     */     GrazieKtorHTTPClient$headers$1(Map<String, String> $headers, Pair[] $additionalHeaders) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   private void url(HttpRequestBuilder $this$url, String url, Map parameters) {
/*     */     HttpRequestKt.url($this$url, url);
/*     */     for (Map.Entry entry : parameters.entrySet()) {
/*     */       String key = (String)entry.getKey(), value = (String)entry.getValue();
/*     */       $this$url.getUrl().getParameters().append(key, value);
/*     */     } 
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object send(@NotNull String url, @NotNull byte[] content, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> $completion) {
/*     */     return send$suspendImpl(this, url, content, options, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object send(@NotNull String url, @NotNull Multipart content, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> $completion) {
/*     */     return send$suspendImpl(this, url, content, options, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object receiveContinuousSSE(@NotNull String url, @NotNull String content, @NotNull RequestOptions options, boolean reconnect, @NotNull Continuation<? super Flow<ServerSentEvent>> $completion) {
/*     */     return receiveContinuousSSE$suspendImpl(this, url, content, options, reconnect, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object receiveLineStream(@NotNull String url, @NotNull String content, @NotNull RequestOptions options, @NotNull Function1<? super String, Boolean> isLastLine, @NotNull Continuation<? super Flow<String>> $completion) {
/*     */     return receiveLineStream$suspendImpl(this, url, content, options, isLastLine, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object get(@NotNull String url, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> $completion) {
/*     */     return get$suspendImpl(this, url, options, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object send(@NotNull String url, @NotNull RequestOptions options, @NotNull Continuation<? super HTTPResponse> $completion) {
/*     */     return send$suspendImpl(this, url, options, $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieKtorHTTPClient.kt", l = {217, 150, 152}, i = {0}, s = {"L$0"}, n = {"body"}, m = "sendAndWaitBody", c = "ai.grazie.client.ktor.GrazieKtorHTTPClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class GrazieKtorHTTPClient$sendAndWaitBody$1<T> extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     GrazieKtorHTTPClient$sendAndWaitBody$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return GrazieKtorHTTPClient.this.sendAndWaitBody(null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieKtorHTTPClient.kt", l = {217}, i = {}, s = {}, n = {}, m = "toResponse", c = "ai.grazie.client.ktor.GrazieKtorHTTPClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class GrazieKtorHTTPClient$toResponse$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int I$0;
/*     */     int label;
/*     */     
/*     */     GrazieKtorHTTPClient$toResponse$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return GrazieKtorHTTPClient.this.toResponse(null, (Continuation)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-ktor-jvm-0.4.32.jar!\ai\grazie\client\ktor\GrazieKtorHTTPClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */