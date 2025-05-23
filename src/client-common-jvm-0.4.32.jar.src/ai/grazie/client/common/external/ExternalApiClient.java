/*     */ package ai.grazie.client.common.external;
/*     */ 
/*     */ import ai.grazie.model.cloud.TypeInfo;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\001\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\b&\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\002\020\bJH\020\025\032\b\022\004\022\0020\0270\026\"\b\b\000\020\030*\0020\0012\020\020\031\032\f\022\004\022\002H\030\022\002\b\0030\0322\006\020\033\032\002H\0302\006\020\034\032\0020\0352\006\020\036\032\0020\037H@¢\006\002\020 JH\020!\032\002H\"\"\b\b\000\020\030*\0020\001\"\b\b\001\020\"*\0020\0012\022\020\031\032\016\022\004\022\002H\030\022\004\022\002H\"0\0322\006\020\033\032\002H\0302\b\b\002\020#\032\0020\035H@¢\006\002\020$J.\020!\032\002H\"\"\b\b\000\020\"*\0020\0012\f\020\031\032\b\022\004\022\002H\"0%2\006\020#\032\0020\035H@¢\006\002\020&J.\020'\032\0020(\"\b\b\000\020\"*\0020\0012\f\020\031\032\b\022\004\022\002H\"0%2\006\020#\032\0020\035H@¢\006\002\020&J \020)\032\0020*2\016\020+\032\n\022\006\b\001\022\0020,0\0222\006\020-\032\0020.H\002J\016\020/\032\0020\0032\006\020\031\032\00200JD\0201\032\002H\021\"\004\b\000\020\0212\020\020+\032\f\022\006\b\001\022\0020,\030\0010\0222\034\0202\032\030\b\001\022\n\022\b\022\004\022\002H\02104\022\006\022\004\030\0010\00103H@¢\006\002\0205R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\t\020\nR\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\013\020\fR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016R.\020\017\032\b\022\004\022\002H\0210\020\"\b\b\000\020\021*\0020\001*\b\022\004\022\002H\0210\0228BX\004¢\006\006\032\004\b\023\020\024¨\0066"}, d2 = {"Lai/grazie/client/common/external/ExternalApiClient;", "", "serverUrl", "", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "(Ljava/lang/String;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;)V", "getHttpClient", "()Lai/grazie/client/common/SuspendableHTTPClient;", "getJson", "()Lai/grazie/utils/json/JSON;", "getServerUrl", "()Ljava/lang/String;", "serializer", "Lkotlinx/serialization/KSerializer;", "T", "Lai/grazie/model/cloud/TypeInfo;", "getSerializer", "(Lai/grazie/model/cloud/TypeInfo;)Lkotlinx/serialization/KSerializer;", "receiveContinuousSSE", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/model/cloud/sse/ServerSentEvent;", "Request", "api", "Lai/grazie/model/cloud/TypedExternalApi;", "request", "requestOptions", "Lai/grazie/client/common/model/RequestOptions;", "reconnect", "", "(Lai/grazie/model/cloud/TypedExternalApi;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "send", "Response", "options", "(Lai/grazie/model/cloud/TypedExternalApi;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lai/grazie/model/cloud/UnitTypedExternalApi;", "(Lai/grazie/model/cloud/UnitTypedExternalApi;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendRaw", "Lai/grazie/client/common/model/HTTPResponse;", "throwDetailedException", "", "exceptionType", "Lai/grazie/model/cloud/ExternalJsonExceptionBody;", "defaultException", "Lai/grazie/model/cloud/exceptions/JsonBodyException$Unknown;", "url", "Lai/grazie/model/cloud/ExternalAPI;", "withJsonExceptionHandling", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lai/grazie/model/cloud/TypeInfo;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"})
/*     */ @SourceDebugExtension({"SMAP\nExternalApiClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExternalApiClient.kt\nai/grazie/client/common/external/ExternalApiClient\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,106:1\n1104#2,3:107\n*S KotlinDebug\n*F\n+ 1 ExternalApiClient.kt\nai/grazie/client/common/external/ExternalApiClient\n*L\n23#1:107,3\n*E\n"})
/*     */ public abstract class ExternalApiClient {
/*     */   @NotNull
/*     */   private final String serverUrl;
/*     */   
/*     */   @NotNull
/*  14 */   public final String getServerUrl() { return this.serverUrl; }
/*     */   @NotNull private final SuspendableHTTPClient httpClient; @NotNull private final JSON json; public ExternalApiClient(@NotNull String serverUrl, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'serverUrl'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'httpClient'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_3
/*     */     //   13: ldc 'json'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload_0
/*     */     //   19: invokespecial <init> : ()V
/*     */     //   22: aload_0
/*     */     //   23: aload_1
/*     */     //   24: putfield serverUrl : Ljava/lang/String;
/*     */     //   27: aload_0
/*     */     //   28: aload_2
/*     */     //   29: putfield httpClient : Lai/grazie/client/common/SuspendableHTTPClient;
/*     */     //   32: aload_0
/*     */     //   33: aload_3
/*     */     //   34: putfield json : Lai/grazie/utils/json/JSON;
/*     */     //   37: nop
/*     */     //   38: aload_0
/*     */     //   39: getfield serverUrl : Ljava/lang/String;
/*     */     //   42: ldc '://'
/*     */     //   44: aconst_null
/*     */     //   45: iconst_2
/*     */     //   46: aconst_null
/*     */     //   47: invokestatic substringAfter$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   50: ldc ':'
/*     */     //   52: aconst_null
/*     */     //   53: iconst_2
/*     */     //   54: aconst_null
/*     */     //   55: invokestatic substringBefore$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   58: astore #4
/*     */     //   60: aload_0
/*     */     //   61: getfield serverUrl : Ljava/lang/String;
/*     */     //   64: ldc 'https://'
/*     */     //   66: iconst_0
/*     */     //   67: iconst_2
/*     */     //   68: aconst_null
/*     */     //   69: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*     */     //   72: ifne -> 150
/*     */     //   75: aload #4
/*     */     //   77: checkcast java/lang/CharSequence
/*     */     //   80: astore #5
/*     */     //   82: iconst_0
/*     */     //   83: istore #6
/*     */     //   85: iconst_0
/*     */     //   86: istore #7
/*     */     //   88: iconst_0
/*     */     //   89: istore #8
/*     */     //   91: iload #8
/*     */     //   93: aload #5
/*     */     //   95: invokeinterface length : ()I
/*     */     //   100: if_icmpge -> 145
/*     */     //   103: aload #5
/*     */     //   105: iload #8
/*     */     //   107: invokeinterface charAt : (I)C
/*     */     //   112: istore #9
/*     */     //   114: iload #9
/*     */     //   116: istore #10
/*     */     //   118: iconst_0
/*     */     //   119: istore #11
/*     */     //   121: iload #10
/*     */     //   123: bipush #46
/*     */     //   125: if_icmpne -> 132
/*     */     //   128: iconst_1
/*     */     //   129: goto -> 133
/*     */     //   132: iconst_0
/*     */     //   133: ifeq -> 139
/*     */     //   136: iinc #7, 1
/*     */     //   139: iinc #8, 1
/*     */     //   142: goto -> 91
/*     */     //   145: iload #7
/*     */     //   147: ifne -> 154
/*     */     //   150: iconst_1
/*     */     //   151: goto -> 155
/*     */     //   154: iconst_0
/*     */     //   155: ifne -> 178
/*     */     //   158: iconst_0
/*     */     //   159: istore #6
/*     */     //   161: ldc 'http:// protocol can be used only for local network traffic (e.g., within private subnet)'
/*     */     //   163: astore #6
/*     */     //   165: new java/lang/IllegalArgumentException
/*     */     //   168: dup
/*     */     //   169: aload #6
/*     */     //   171: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   174: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   177: athrow
/*     */     //   178: nop
/*     */     //   179: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #13	-> 18
/*     */     //   #14	-> 22
/*     */     //   #15	-> 27
/*     */     //   #16	-> 32
/*     */     //   #18	-> 37
/*     */     //   #19	-> 38
/*     */     //   #22	-> 60
/*     */     //   #23	-> 75
/*     */     //   #107	-> 85
/*     */     //   #108	-> 88
/*     */     //   #23	-> 121
/*     */     //   #108	-> 133
/*     */     //   #109	-> 145
/*     */     //   #23	-> 147
/*     */     //   #21	-> 155
/*     */     //   #26	-> 161
/*     */     //   #21	-> 163
/*     */     //   #28	-> 178
/*     */     //   #13	-> 179
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   121	12	11	$i$a$-count-ExternalApiClient$1	I
/*     */     //   118	15	10	it	C
/*     */     //   114	25	9	element$iv	C
/*     */     //   85	62	6	$i$f$count	I
/*     */     //   88	59	7	count$iv	I
/*     */     //   82	65	5	$this$count$iv	Ljava/lang/CharSequence;
/*     */     //   161	2	6	$i$a$-require-ExternalApiClient$2	I
/*     */     //   60	118	4	serverHost	Ljava/lang/String;
/*     */     //   0	180	0	this	Lai/grazie/client/common/external/ExternalApiClient;
/*     */     //   0	180	1	serverUrl	Ljava/lang/String;
/*     */     //   0	180	2	httpClient	Lai/grazie/client/common/SuspendableHTTPClient;
/*  15 */     //   0	180	3	json	Lai/grazie/utils/json/JSON; } @NotNull protected final SuspendableHTTPClient getHttpClient() { return this.httpClient; } @NotNull
/*  16 */   protected final JSON getJson() { return this.json; }
/*     */    @Nullable
/*     */   public final <Request, Response> Object send(@NotNull TypedExternalApi api, @NotNull Object request, @NotNull RequestOptions options, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof ai/grazie/client/common/external/ExternalApiClient$send$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast ai/grazie/client/common/external/ExternalApiClient$send$1
/*     */     //   13: astore #7
/*     */     //   15: aload #7
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #7
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new ai/grazie/client/common/external/ExternalApiClient$send$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lai/grazie/client/common/external/ExternalApiClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #7
/*     */     //   53: aload #7
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #6
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #8
/*     */     //   65: aload #7
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 204, 0 -> 92, 1 -> 151
/*     */     //   92: aload #6
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_0
/*     */     //   98: aload_1
/*     */     //   99: invokeinterface getExceptionBodyType : ()Lai/grazie/model/cloud/TypeInfo;
/*     */     //   104: new ai/grazie/client/common/external/ExternalApiClient$send$content$1
/*     */     //   107: dup
/*     */     //   108: aload_1
/*     */     //   109: aload_0
/*     */     //   110: aload_2
/*     */     //   111: aload_3
/*     */     //   112: aconst_null
/*     */     //   113: invokespecial <init> : (Lai/grazie/model/cloud/TypedExternalApi;Lai/grazie/client/common/external/ExternalApiClient;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*     */     //   116: checkcast kotlin/jvm/functions/Function1
/*     */     //   119: aload #7
/*     */     //   121: aload #7
/*     */     //   123: aload_0
/*     */     //   124: putfield L$0 : Ljava/lang/Object;
/*     */     //   127: aload #7
/*     */     //   129: aload_1
/*     */     //   130: putfield L$1 : Ljava/lang/Object;
/*     */     //   133: aload #7
/*     */     //   135: iconst_1
/*     */     //   136: putfield label : I
/*     */     //   139: invokespecial withJsonExceptionHandling : (Lai/grazie/model/cloud/TypeInfo;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   142: dup
/*     */     //   143: aload #8
/*     */     //   145: if_acmpne -> 176
/*     */     //   148: aload #8
/*     */     //   150: areturn
/*     */     //   151: aload #7
/*     */     //   153: getfield L$1 : Ljava/lang/Object;
/*     */     //   156: checkcast ai/grazie/model/cloud/TypedExternalApi
/*     */     //   159: astore_1
/*     */     //   160: aload #7
/*     */     //   162: getfield L$0 : Ljava/lang/Object;
/*     */     //   165: checkcast ai/grazie/client/common/external/ExternalApiClient
/*     */     //   168: astore_0
/*     */     //   169: aload #6
/*     */     //   171: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   174: aload #6
/*     */     //   176: checkcast java/lang/String
/*     */     //   179: astore #5
/*     */     //   181: aload_0
/*     */     //   182: getfield json : Lai/grazie/utils/json/JSON;
/*     */     //   185: aload_0
/*     */     //   186: aload_1
/*     */     //   187: invokeinterface getResponseType : ()Lai/grazie/model/cloud/TypeInfo;
/*     */     //   192: invokespecial getSerializer : (Lai/grazie/model/cloud/TypeInfo;)Lkotlinx/serialization/KSerializer;
/*     */     //   195: checkcast kotlinx/serialization/DeserializationStrategy
/*     */     //   198: aload #5
/*     */     //   200: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   203: areturn
/*     */     //   204: new java/lang/IllegalStateException
/*     */     //   207: dup
/*     */     //   208: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   210: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   213: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #30	-> 63
/*     */     //   #33	-> 97
/*     */     //   #30	-> 148
/*     */     //   #40	-> 181
/*     */     //   #30	-> 204
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	54	0	this	Lai/grazie/client/common/external/ExternalApiClient;
/*     */     //   169	35	0	this	Lai/grazie/client/common/external/ExternalApiClient;
/*     */     //   97	54	1	api	Lai/grazie/model/cloud/TypedExternalApi;
/*     */     //   160	44	1	api	Lai/grazie/model/cloud/TypedExternalApi;
/*     */     //   97	45	2	request	Ljava/lang/Object;
/*     */     //   97	45	3	options	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   181	23	5	content	Ljava/lang/String;
/*     */     //   0	214	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	151	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	144	6	$result	Ljava/lang/Object;
/*     */   } @DebugMetadata(f = "ExternalApiClient.kt", l = {35}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.common.external.ExternalApiClient$send$content$1")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\016\n\000\n\002\020\000\n\000\020\000\032\0020\001\"\b\b\000\020\002*\0020\003\"\b\b\001\020\004*\0020\003H@"}, d2 = {"<anonymous>", "", "Request", "", "Response"})
/*     */   static final class ExternalApiClient$send$content$1 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
/*     */     int label; ExternalApiClient$send$content$1(ExternalApiClient $receiver, Object $request, RequestOptions $options, Continuation $completion) {
/*     */       super(1, $completion);
/*     */     } public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore_2
/*     */       //   4: aload_0
/*     */       //   5: getfield label : I
/*     */       //   8: tableswitch default -> 162, 0 -> 32, 1 -> 130
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield $api : Lai/grazie/model/cloud/TypedExternalApi;
/*     */       //   40: invokeinterface getHttpMethod : ()Lai/grazie/model/cloud/HttpMethod;
/*     */       //   45: getstatic ai/grazie/model/cloud/HttpMethod.Post : Lai/grazie/model/cloud/HttpMethod;
/*     */       //   48: if_acmpne -> 148
/*     */       //   51: aload_0
/*     */       //   52: getfield this$0 : Lai/grazie/client/common/external/ExternalApiClient;
/*     */       //   55: invokevirtual getHttpClient : ()Lai/grazie/client/common/SuspendableHTTPClient;
/*     */       //   58: aload_0
/*     */       //   59: getfield this$0 : Lai/grazie/client/common/external/ExternalApiClient;
/*     */       //   62: aload_0
/*     */       //   63: getfield $api : Lai/grazie/model/cloud/TypedExternalApi;
/*     */       //   66: checkcast ai/grazie/model/cloud/ExternalAPI
/*     */       //   69: invokevirtual url : (Lai/grazie/model/cloud/ExternalAPI;)Ljava/lang/String;
/*     */       //   72: aload_0
/*     */       //   73: getfield this$0 : Lai/grazie/client/common/external/ExternalApiClient;
/*     */       //   76: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*     */       //   79: aload_0
/*     */       //   80: getfield this$0 : Lai/grazie/client/common/external/ExternalApiClient;
/*     */       //   83: aload_0
/*     */       //   84: getfield $api : Lai/grazie/model/cloud/TypedExternalApi;
/*     */       //   87: invokeinterface getRequestType : ()Lai/grazie/model/cloud/TypeInfo;
/*     */       //   92: invokestatic access$getSerializer : (Lai/grazie/client/common/external/ExternalApiClient;Lai/grazie/model/cloud/TypeInfo;)Lkotlinx/serialization/KSerializer;
/*     */       //   95: checkcast kotlinx/serialization/SerializationStrategy
/*     */       //   98: aload_0
/*     */       //   99: getfield $request : Ljava/lang/Object;
/*     */       //   102: invokevirtual bytes : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)[B
/*     */       //   105: aload_0
/*     */       //   106: getfield $options : Lai/grazie/client/common/model/RequestOptions;
/*     */       //   109: aload_0
/*     */       //   110: checkcast kotlin/coroutines/Continuation
/*     */       //   113: aload_0
/*     */       //   114: iconst_1
/*     */       //   115: putfield label : I
/*     */       //   118: invokeinterface send : (Ljava/lang/String;[BLai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   123: dup
/*     */       //   124: aload_2
/*     */       //   125: if_acmpne -> 135
/*     */       //   128: aload_2
/*     */       //   129: areturn
/*     */       //   130: aload_1
/*     */       //   131: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   134: aload_1
/*     */       //   135: checkcast ai/grazie/client/common/model/HTTPResponse
/*     */       //   138: invokevirtual getContent : ()Ljava/lang/String;
/*     */       //   141: dup
/*     */       //   142: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */       //   145: goto -> 161
/*     */       //   148: new java/lang/IllegalStateException
/*     */       //   151: dup
/*     */       //   152: ldc 'GET api with body not supported'
/*     */       //   154: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   157: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   160: athrow
/*     */       //   161: areturn
/*     */       //   162: new java/lang/IllegalStateException
/*     */       //   165: dup
/*     */       //   166: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   168: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   171: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #33	-> 3
/*     */       //   #34	-> 36
/*     */       //   #35	-> 51
/*     */       //   #33	-> 128
/*     */       //   #35	-> 135
/*     */       //   #37	-> 152
/*     */       //   #38	-> 161
/*     */       //   #33	-> 162
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	172	0	this	Lai/grazie/client/common/external/ExternalApiClient$send$content$1;
/*     */       //   36	126	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     public final Continuation<Unit> create(Continuation<? super ExternalApiClient$send$content$1> $completion) {
/*     */       return (Continuation<Unit>)new ExternalApiClient$send$content$1(ExternalApiClient.this, this.$request, this.$options, $completion);
/*     */     }
/*     */     public final Object invoke(Continuation<?> p1) {
/*     */       return ((ExternalApiClient$send$content$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */   @Nullable
/*     */   public final <Response> Object send(@NotNull UnitTypedExternalApi api, @NotNull RequestOptions options, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof ai/grazie/client/common/external/ExternalApiClient$send$2
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast ai/grazie/client/common/external/ExternalApiClient$send$2
/*     */     //   11: astore #6
/*     */     //   13: aload #6
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #6
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new ai/grazie/client/common/external/ExternalApiClient$send$2
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lai/grazie/client/common/external/ExternalApiClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #6
/*     */     //   50: aload #6
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #5
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #7
/*     */     //   62: aload #6
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 206, 0 -> 88, 1 -> 146
/*     */     //   88: aload #5
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: aload_1
/*     */     //   95: invokeinterface getExceptionBodyType : ()Lai/grazie/model/cloud/TypeInfo;
/*     */     //   100: new ai/grazie/client/common/external/ExternalApiClient$send$response$1
/*     */     //   103: dup
/*     */     //   104: aload_0
/*     */     //   105: aload_1
/*     */     //   106: aload_2
/*     */     //   107: aconst_null
/*     */     //   108: invokespecial <init> : (Lai/grazie/client/common/external/ExternalApiClient;Lai/grazie/model/cloud/UnitTypedExternalApi;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*     */     //   111: checkcast kotlin/jvm/functions/Function1
/*     */     //   114: aload #6
/*     */     //   116: aload #6
/*     */     //   118: aload_0
/*     */     //   119: putfield L$0 : Ljava/lang/Object;
/*     */     //   122: aload #6
/*     */     //   124: aload_1
/*     */     //   125: putfield L$1 : Ljava/lang/Object;
/*     */     //   128: aload #6
/*     */     //   130: iconst_1
/*     */     //   131: putfield label : I
/*     */     //   134: invokespecial withJsonExceptionHandling : (Lai/grazie/model/cloud/TypeInfo;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   137: dup
/*     */     //   138: aload #7
/*     */     //   140: if_acmpne -> 171
/*     */     //   143: aload #7
/*     */     //   145: areturn
/*     */     //   146: aload #6
/*     */     //   148: getfield L$1 : Ljava/lang/Object;
/*     */     //   151: checkcast ai/grazie/model/cloud/UnitTypedExternalApi
/*     */     //   154: astore_1
/*     */     //   155: aload #6
/*     */     //   157: getfield L$0 : Ljava/lang/Object;
/*     */     //   160: checkcast ai/grazie/client/common/external/ExternalApiClient
/*     */     //   163: astore_0
/*     */     //   164: aload #5
/*     */     //   166: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   169: aload #5
/*     */     //   171: checkcast ai/grazie/client/common/model/HTTPResponse
/*     */     //   174: astore #4
/*     */     //   176: aload_0
/*     */     //   177: getfield json : Lai/grazie/utils/json/JSON;
/*     */     //   180: aload_0
/*     */     //   181: aload_1
/*     */     //   182: invokeinterface getResponseType : ()Lai/grazie/model/cloud/TypeInfo;
/*     */     //   187: invokespecial getSerializer : (Lai/grazie/model/cloud/TypeInfo;)Lkotlinx/serialization/KSerializer;
/*     */     //   190: checkcast kotlinx/serialization/DeserializationStrategy
/*     */     //   193: aload #4
/*     */     //   195: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   198: dup
/*     */     //   199: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   202: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   205: areturn
/*     */     //   206: new java/lang/IllegalStateException
/*     */     //   209: dup
/*     */     //   210: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   212: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   215: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #43	-> 60
/*     */     //   #44	-> 93
/*     */     //   #43	-> 143
/*     */     //   #47	-> 176
/*     */     //   #43	-> 206
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	53	0	this	Lai/grazie/client/common/external/ExternalApiClient;
/*     */     //   164	42	0	this	Lai/grazie/client/common/external/ExternalApiClient;
/*     */     //   93	53	1	api	Lai/grazie/model/cloud/UnitTypedExternalApi;
/*     */     //   155	51	1	api	Lai/grazie/model/cloud/UnitTypedExternalApi;
/*     */     //   93	44	2	options	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   176	30	4	response	Lai/grazie/client/common/model/HTTPResponse;
/*     */     //   0	216	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	156	6	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	149	5	$result	Ljava/lang/Object;
/*     */   }
/*     */   @DebugMetadata(f = "ExternalApiClient.kt", l = {45}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.common.external.ExternalApiClient$send$response$1")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\000\n\002\020\000\020\000\032\0020\001\"\b\b\000\020\002*\0020\003H@"}, d2 = {"<anonymous>", "Lai/grazie/client/common/model/HTTPResponse;", "Response", ""})
/*     */   static final class ExternalApiClient$send$response$1 extends SuspendLambda implements Function1<Continuation<? super HTTPResponse>, Object> { int label;
/*     */     ExternalApiClient$send$response$1(UnitTypedExternalApi<Response> $api, RequestOptions $options, Continuation $completion) {
/*     */       super(1, $completion);
/*     */     }
/*  44 */     public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  45 */           this.label = 1; if (ExternalApiClient.this.sendRaw(this.$api, this.$options, (Continuation<? super HTTPResponse>)this) == object) return object;  return ExternalApiClient.this.sendRaw(this.$api, this.$options, (Continuation<? super HTTPResponse>)this);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Continuation<? super ExternalApiClient$send$response$1> $completion) { return (Continuation<Unit>)new ExternalApiClient$send$response$1(this.$api, this.$options, $completion); } public final Object invoke(Continuation<?> p1) { return ((ExternalApiClient$send$response$1)create(p1)).invokeSuspend(Unit.INSTANCE); } }
/*     */   @Nullable public final <Response> Object sendRaw(@NotNull UnitTypedExternalApi api, @NotNull RequestOptions options, @NotNull Continuation $completion) { // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof ai/grazie/client/common/external/ExternalApiClient$sendRaw$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast ai/grazie/client/common/external/ExternalApiClient$sendRaw$1
/*     */     //   11: astore #6
/*     */     //   13: aload #6
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #6
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new ai/grazie/client/common/external/ExternalApiClient$sendRaw$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lai/grazie/client/common/external/ExternalApiClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #6
/*     */     //   50: aload #6
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #5
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #7
/*     */     //   62: aload #6
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 149, 0 -> 88, 1 -> 134
/*     */     //   88: aload #5
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: aload_1
/*     */     //   95: invokeinterface getExceptionBodyType : ()Lai/grazie/model/cloud/TypeInfo;
/*     */     //   100: new ai/grazie/client/common/external/ExternalApiClient$sendRaw$response$1
/*     */     //   103: dup
/*     */     //   104: aload_1
/*     */     //   105: aload_0
/*     */     //   106: aload_2
/*     */     //   107: aconst_null
/*     */     //   108: invokespecial <init> : (Lai/grazie/model/cloud/UnitTypedExternalApi;Lai/grazie/client/common/external/ExternalApiClient;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*     */     //   111: checkcast kotlin/jvm/functions/Function1
/*     */     //   114: aload #6
/*     */     //   116: aload #6
/*     */     //   118: iconst_1
/*     */     //   119: putfield label : I
/*     */     //   122: invokespecial withJsonExceptionHandling : (Lai/grazie/model/cloud/TypeInfo;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   125: dup
/*     */     //   126: aload #7
/*     */     //   128: if_acmpne -> 141
/*     */     //   131: aload #7
/*     */     //   133: areturn
/*     */     //   134: aload #5
/*     */     //   136: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   139: aload #5
/*     */     //   141: checkcast ai/grazie/client/common/model/HTTPResponse
/*     */     //   144: astore #4
/*     */     //   146: aload #4
/*     */     //   148: areturn
/*     */     //   149: new java/lang/IllegalStateException
/*     */     //   152: dup
/*     */     //   153: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   155: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   158: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #50	-> 60
/*     */     //   #51	-> 93
/*     */     //   #50	-> 131
/*     */     //   #58	-> 146
/*     */     //   #50	-> 149
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	32	0	this	Lai/grazie/client/common/external/ExternalApiClient;
/*     */     //   93	32	1	api	Lai/grazie/model/cloud/UnitTypedExternalApi;
/*     */     //   93	32	2	options	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   146	3	4	response	Lai/grazie/client/common/model/HTTPResponse;
/*     */     //   0	159	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	99	6	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	92	5	$result	Ljava/lang/Object; }
/*     */   @DebugMetadata(f = "ExternalApiClient.kt", l = {53, 55}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.common.external.ExternalApiClient$sendRaw$response$1") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\000\n\002\020\000\020\000\032\0020\001\"\b\b\000\020\002*\0020\003H@"}, d2 = {"<anonymous>", "Lai/grazie/client/common/model/HTTPResponse;", "Response", ""}) static final class ExternalApiClient$sendRaw$response$1 extends SuspendLambda implements Function1<Continuation<? super HTTPResponse>, Object> { int label;
/*     */     ExternalApiClient$sendRaw$response$1(ExternalApiClient $receiver, RequestOptions $options, Continuation $completion) { super(1, $completion); }
/*  51 */     public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  52 */           if (this.$api.getHttpMethod() == HttpMethod.Get)
/*  53 */           { this.label = 1; if (ExternalApiClient.this.getHttpClient().get(ExternalApiClient.this.url((ExternalAPI)this.$api), this.$options, (Continuation)this) == object)
/*     */               return object;  }
/*  55 */           else { this.label = 2; if (ExternalApiClient.this.getHttpClient().send(ExternalApiClient.this.url((ExternalAPI)this.$api), this.$options, (Continuation)this) == object)
/*     */               return object;  } 
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         case 2:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); }
/*     */        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Continuation<? super ExternalApiClient$sendRaw$response$1> $completion) { return (Continuation<Unit>)new ExternalApiClient$sendRaw$response$1(ExternalApiClient.this, this.$options, $completion); } public final Object invoke(Continuation<?> p1) { return ((ExternalApiClient$sendRaw$response$1)create(p1)).invokeSuspend(Unit.INSTANCE); } }
/*     */   @Nullable public final <Request> Object receiveContinuousSSE(@NotNull TypedExternalApi api, @NotNull Object request, @NotNull RequestOptions requestOptions, boolean reconnect, @NotNull Continuation $completion) { // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: instanceof ai/grazie/client/common/external/ExternalApiClient$receiveContinuousSSE$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #5
/*     */     //   10: checkcast ai/grazie/client/common/external/ExternalApiClient$receiveContinuousSSE$1
/*     */     //   13: astore #7
/*     */     //   15: aload #7
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #7
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new ai/grazie/client/common/external/ExternalApiClient$receiveContinuousSSE$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #5
/*     */     //   48: invokespecial <init> : (Lai/grazie/client/common/external/ExternalApiClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #7
/*     */     //   53: aload #7
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #6
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #8
/*     */     //   65: aload #7
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 220, 0 -> 92, 1 -> 175
/*     */     //   92: aload #6
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_0
/*     */     //   98: getfield httpClient : Lai/grazie/client/common/SuspendableHTTPClient;
/*     */     //   101: aload_0
/*     */     //   102: aload_1
/*     */     //   103: checkcast ai/grazie/model/cloud/ExternalAPI
/*     */     //   106: invokevirtual url : (Lai/grazie/model/cloud/ExternalAPI;)Ljava/lang/String;
/*     */     //   109: aload_0
/*     */     //   110: getfield json : Lai/grazie/utils/json/JSON;
/*     */     //   113: aload_0
/*     */     //   114: aload_1
/*     */     //   115: invokeinterface getRequestType : ()Lai/grazie/model/cloud/TypeInfo;
/*     */     //   120: invokespecial getSerializer : (Lai/grazie/model/cloud/TypeInfo;)Lkotlinx/serialization/KSerializer;
/*     */     //   123: checkcast kotlinx/serialization/SerializationStrategy
/*     */     //   126: aload_2
/*     */     //   127: invokevirtual string : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   130: aload_3
/*     */     //   131: iload #4
/*     */     //   133: ifeq -> 140
/*     */     //   136: iconst_1
/*     */     //   137: goto -> 141
/*     */     //   140: iconst_0
/*     */     //   141: aload #7
/*     */     //   143: aload #7
/*     */     //   145: aload_0
/*     */     //   146: putfield L$0 : Ljava/lang/Object;
/*     */     //   149: aload #7
/*     */     //   151: aload_1
/*     */     //   152: putfield L$1 : Ljava/lang/Object;
/*     */     //   155: aload #7
/*     */     //   157: iconst_1
/*     */     //   158: putfield label : I
/*     */     //   161: invokeinterface receiveContinuousSSE : (Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   166: dup
/*     */     //   167: aload #8
/*     */     //   169: if_acmpne -> 200
/*     */     //   172: aload #8
/*     */     //   174: areturn
/*     */     //   175: aload #7
/*     */     //   177: getfield L$1 : Ljava/lang/Object;
/*     */     //   180: checkcast ai/grazie/model/cloud/TypedExternalApi
/*     */     //   183: astore_1
/*     */     //   184: aload #7
/*     */     //   186: getfield L$0 : Ljava/lang/Object;
/*     */     //   189: checkcast ai/grazie/client/common/external/ExternalApiClient
/*     */     //   192: astore_0
/*     */     //   193: aload #6
/*     */     //   195: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   198: aload #6
/*     */     //   200: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   203: new ai/grazie/client/common/external/ExternalApiClient$receiveContinuousSSE$2
/*     */     //   206: dup
/*     */     //   207: aload_1
/*     */     //   208: aload_0
/*     */     //   209: aconst_null
/*     */     //   210: invokespecial <init> : (Lai/grazie/model/cloud/TypedExternalApi;Lai/grazie/client/common/external/ExternalApiClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   213: checkcast kotlin/jvm/functions/Function3
/*     */     //   216: invokestatic catch : (Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;
/*     */     //   219: areturn
/*     */     //   220: new java/lang/IllegalStateException
/*     */     //   223: dup
/*     */     //   224: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   226: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   229: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #61	-> 63
/*     */     //   #63	-> 97
/*     */     //   #64	-> 101
/*     */     //   #61	-> 172
/*     */     //   #65	-> 203
/*     */     //   #73	-> 219
/*     */     //   #61	-> 220
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	78	0	this	Lai/grazie/client/common/external/ExternalApiClient;
/*     */     //   193	27	0	this	Lai/grazie/client/common/external/ExternalApiClient;
/*     */     //   97	78	1	api	Lai/grazie/model/cloud/TypedExternalApi;
/*     */     //   184	36	1	api	Lai/grazie/model/cloud/TypedExternalApi;
/*     */     //   97	43	2	request	Ljava/lang/Object;
/*     */     //   97	43	3	requestOptions	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   97	43	4	reconnect	Z
/*     */     //   0	230	5	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	167	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	160	6	$result	Ljava/lang/Object; }
/*     */   @DebugMetadata(f = "ExternalApiClient.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.common.external.ExternalApiClient$receiveContinuousSSE$2") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\032\n\000\n\002\020\002\n\000\n\002\020\000\n\002\030\002\n\002\030\002\n\000\n\002\020\003\020\000\032\0020\001\"\b\b\000\020\002*\0020\003*\b\022\004\022\0020\0050\0042\006\020\006\032\0020\007H@"}, d2 = {"<anonymous>", "", "Request", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lai/grazie/model/cloud/sse/ServerSentEvent;", "it", ""}) static final class ExternalApiClient$receiveContinuousSSE$2 extends SuspendLambda implements Function3<FlowCollector<? super ServerSentEvent>, Throwable, Continuation<? super Unit>, Object> { int label;
/*     */     ExternalApiClient$receiveContinuousSSE$2(ExternalApiClient $receiver, Continuation $completion) { super(3, $completion); }
/*  65 */     public final Object invokeSuspend(Object $result) { Throwable it; TypeInfo exceptionBodyType; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (Throwable)this.L$0;
/*  66 */           exceptionBodyType = this.$api.getExceptionBodyType();
/*  67 */           if (exceptionBodyType == null) {
/*  68 */             throw it;
/*     */           }
/*  70 */           if (it instanceof JsonBodyException.Unknown) {
/*  71 */             ExternalApiClient.this.throwDetailedException(exceptionBodyType, (JsonBodyException.Unknown)it); throw new KotlinNothingValueException();
/*     */           } 
/*  73 */           return Unit.INSTANCE; }
/*     */        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Object invoke(FlowCollector p1, Throwable p2, Continuation<? super ExternalApiClient$receiveContinuousSSE$2> p3) { ExternalApiClient$receiveContinuousSSE$2 externalApiClient$receiveContinuousSSE$2 = new ExternalApiClient$receiveContinuousSSE$2(ExternalApiClient.this, p3); externalApiClient$receiveContinuousSSE$2.L$0 = p2; return externalApiClient$receiveContinuousSSE$2.invokeSuspend(Unit.INSTANCE); } }
/*  75 */   @NotNull public final String url(@NotNull ExternalAPI api) { Intrinsics.checkNotNullParameter(api, "api"); return api.url(this.serverUrl); }
/*     */   
/*     */   private final <T> KSerializer<T> getSerializer(TypeInfo $this$serializer) {
/*  78 */     Intrinsics.checkNotNull(SerializersKt.serializer($this$serializer.getType()), "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of ai.grazie.client.common.external.ExternalApiClient.<get-serializer>>"); return SerializersKt.serializer($this$serializer.getType());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final <T> Object withJsonExceptionHandling(TypeInfo exceptionType, Function1 block, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof ai/grazie/client/common/external/ExternalApiClient$withJsonExceptionHandling$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast ai/grazie/client/common/external/ExternalApiClient$withJsonExceptionHandling$1
/*     */     //   11: astore #7
/*     */     //   13: aload #7
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #7
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new ai/grazie/client/common/external/ExternalApiClient$withJsonExceptionHandling$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lai/grazie/client/common/external/ExternalApiClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #7
/*     */     //   50: aload #7
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #6
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #8
/*     */     //   62: aload #7
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 223, 0 -> 92, 1 -> 137, 2 -> 214
/*     */     //   92: aload #6
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_1
/*     */     //   98: ifnull -> 191
/*     */     //   101: nop
/*     */     //   102: aload_2
/*     */     //   103: aload #7
/*     */     //   105: aload #7
/*     */     //   107: aload_0
/*     */     //   108: putfield L$0 : Ljava/lang/Object;
/*     */     //   111: aload #7
/*     */     //   113: aload_1
/*     */     //   114: putfield L$1 : Ljava/lang/Object;
/*     */     //   117: aload #7
/*     */     //   119: iconst_1
/*     */     //   120: putfield label : I
/*     */     //   123: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   128: dup
/*     */     //   129: aload #8
/*     */     //   131: if_acmpne -> 163
/*     */     //   134: aload #8
/*     */     //   136: areturn
/*     */     //   137: aload #7
/*     */     //   139: getfield L$1 : Ljava/lang/Object;
/*     */     //   142: checkcast ai/grazie/model/cloud/TypeInfo
/*     */     //   145: astore_1
/*     */     //   146: aload #7
/*     */     //   148: getfield L$0 : Ljava/lang/Object;
/*     */     //   151: checkcast ai/grazie/client/common/external/ExternalApiClient
/*     */     //   154: astore_0
/*     */     //   155: nop
/*     */     //   156: aload #6
/*     */     //   158: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   161: aload #6
/*     */     //   163: astore #4
/*     */     //   165: goto -> 186
/*     */     //   168: astore #5
/*     */     //   170: aload_0
/*     */     //   171: aload_1
/*     */     //   172: aload #5
/*     */     //   174: invokespecial throwDetailedException : (Lai/grazie/model/cloud/TypeInfo;Lai/grazie/model/cloud/exceptions/JsonBodyException$Unknown;)Ljava/lang/Void;
/*     */     //   177: pop
/*     */     //   178: new kotlin/KotlinNothingValueException
/*     */     //   181: dup
/*     */     //   182: invokespecial <init> : ()V
/*     */     //   185: athrow
/*     */     //   186: aload #4
/*     */     //   188: goto -> 222
/*     */     //   191: aload_2
/*     */     //   192: aload #7
/*     */     //   194: aload #7
/*     */     //   196: iconst_2
/*     */     //   197: putfield label : I
/*     */     //   200: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   205: dup
/*     */     //   206: aload #8
/*     */     //   208: if_acmpne -> 221
/*     */     //   211: aload #8
/*     */     //   213: areturn
/*     */     //   214: aload #6
/*     */     //   216: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   219: aload #6
/*     */     //   221: areturn
/*     */     //   222: areturn
/*     */     //   223: new java/lang/IllegalStateException
/*     */     //   226: dup
/*     */     //   227: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   229: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   232: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #80	-> 60
/*     */     //   #84	-> 97
/*     */     //   #85	-> 101
/*     */     //   #86	-> 102
/*     */     //   #80	-> 134
/*     */     //   #86	-> 163
/*     */     //   #87	-> 168
/*     */     //   #88	-> 170
/*     */     //   #91	-> 191
/*     */     //   #80	-> 211
/*     */     //   #93	-> 221
/*     */     //   #84	-> 222
/*     */     //   #80	-> 223
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	40	0	this	Lai/grazie/client/common/external/ExternalApiClient;
/*     */     //   155	10	0	this	Lai/grazie/client/common/external/ExternalApiClient;
/*     */     //   168	18	0	this	Lai/grazie/client/common/external/ExternalApiClient;
/*     */     //   97	40	1	exceptionType	Lai/grazie/model/cloud/TypeInfo;
/*     */     //   146	19	1	exceptionType	Lai/grazie/model/cloud/TypeInfo;
/*     */     //   168	18	1	exceptionType	Lai/grazie/model/cloud/TypeInfo;
/*     */     //   97	31	2	block	Lkotlin/jvm/functions/Function1;
/*     */     //   191	14	2	block	Lkotlin/jvm/functions/Function1;
/*     */     //   170	16	5	e	Lai/grazie/model/cloud/exceptions/JsonBodyException$Unknown;
/*     */     //   0	233	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	173	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	166	6	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   101	128	168	ai/grazie/model/cloud/exceptions/JsonBodyException$Unknown
/*     */     //   155	165	168	ai/grazie/model/cloud/exceptions/JsonBodyException$Unknown
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Void throwDetailedException(TypeInfo<?> exceptionType, JsonBodyException.Unknown defaultException) {
/*  99 */     HTTPStatusException detailedException = ((ExternalJsonExceptionBody)this.json.parse(
/* 100 */         (DeserializationStrategy)getSerializer(exceptionType), defaultException.getBody().getDescription()))
/* 101 */       .toException(defaultException.getBody().getStatus());
/* 102 */     throw (detailedException != null) ? (Throwable)detailedException : (Throwable)defaultException;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ExternalApiClient.kt", l = {64}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "api"}, m = "receiveContinuousSSE", c = "ai.grazie.client.common.external.ExternalApiClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class ExternalApiClient$receiveContinuousSSE$1<Request> extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     ExternalApiClient$receiveContinuousSSE$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ExternalApiClient.this.receiveContinuousSSE(null, null, null, false, (Continuation<? super Flow<ServerSentEvent>>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ExternalApiClient.kt", l = {33}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "api"}, m = "send", c = "ai.grazie.client.common.external.ExternalApiClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class ExternalApiClient$send$1<Request, Response> extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     ExternalApiClient$send$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ExternalApiClient.this.send(null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ExternalApiClient.kt", l = {44}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "api"}, m = "send", c = "ai.grazie.client.common.external.ExternalApiClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class ExternalApiClient$send$2<Response> extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     ExternalApiClient$send$2(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ExternalApiClient.this.send(null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ExternalApiClient.kt", l = {51}, i = {}, s = {}, n = {}, m = "sendRaw", c = "ai.grazie.client.common.external.ExternalApiClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class ExternalApiClient$sendRaw$1<Response> extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     ExternalApiClient$sendRaw$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ExternalApiClient.this.sendRaw(null, null, (Continuation<? super HTTPResponse>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ExternalApiClient.kt", l = {86, 91}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "exceptionType"}, m = "withJsonExceptionHandling", c = "ai.grazie.client.common.external.ExternalApiClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class ExternalApiClient$withJsonExceptionHandling$1<T> extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     ExternalApiClient$withJsonExceptionHandling$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ExternalApiClient.this.withJsonExceptionHandling(null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\external\ExternalApiClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */