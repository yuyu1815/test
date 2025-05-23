/*    */ package ai.grazie.api.gateway.client.api;
/*    */ 
/*    */ import ai.grazie.client.common.SuspendableHTTPClient;
/*    */ import ai.grazie.client.common.logging.AnnotationLogger;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\f\n\002\030\002\n\000\030\0002\0020\001B/\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013¢\006\002\020\fJ\036\020\022\032\0020\0032\006\020\023\032\0020\0032\006\020\024\032\0020\003H@¢\006\002\020\025J \020\026\032\004\030\0010\0032\006\020\023\032\0020\0032\006\020\024\032\0020\003H@¢\006\002\020\025J \020\027\032\004\030\0010\0302\006\020\023\032\0020\0032\006\020\024\032\0020\003H@¢\006\002\020\025R\032\020\n\032\0020\013X\016¢\006\016\n\000\032\004\b\r\020\016\"\004\b\017\020\020R\016\020\021\032\0020\007X\004¢\006\002\n\000¨\006\031"}, d2 = {"Lai/grazie/api/gateway/client/api/LicenseServerAuthClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "serverUrl", "", "authType", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "annotationLogger", "Lai/grazie/client/common/logging/AnnotationLogger;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;Lai/grazie/client/common/logging/AnnotationLogger;)V", "getAnnotationLogger", "()Lai/grazie/client/common/logging/AnnotationLogger;", "setAnnotationLogger", "(Lai/grazie/client/common/logging/AnnotationLogger;)V", "baseClient", "getLicenseServerAccess", "ticket", "sign", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshV3", "verifyV3", "Lai/grazie/utils/mpp/time/Timestamp;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nLicenseServerAuthClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LicenseServerAuthClient.kt\nai/grazie/api/gateway/client/api/LicenseServerAuthClient\n+ 2 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n+ 3 HTTPResponseExtensions.kt\nai/grazie/client/common/model/HTTPResponseExtensionsKt\n+ 4 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n*L\n1#1,62:1\n28#2,7:63\n7#3,2:70\n7#3,2:78\n7#3,2:86\n62#4,6:72\n62#4,6:80\n*S KotlinDebug\n*F\n+ 1 LicenseServerAuthClient.kt\nai/grazie/api/gateway/client/api/LicenseServerAuthClient\n*L\n36#1:63,7\n39#1:70,2\n48#1:78,2\n57#1:86,2\n45#1:72,6\n54#1:80,6\n*E\n"})
/*    */ public final class LicenseServerAuthClient extends SuspendableCloudClient {
/*    */   @NotNull
/*    */   private AnnotationLogger annotationLogger;
/*    */   
/*    */   @NotNull
/* 16 */   public AnnotationLogger getAnnotationLogger() { return this.annotationLogger; } @NotNull private final SuspendableHTTPClient baseClient; public void setAnnotationLogger(@NotNull AnnotationLogger <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.annotationLogger = <set-?>; } public LicenseServerAuthClient(@NotNull String serverUrl, @NotNull AuthType authType, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json, @NotNull AnnotationLogger annotationLogger) {
/* 17 */     super(serverUrl, authType, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */ 
/*    */ 
/*    */     
/*    */     this.annotationLogger = annotationLogger;
/*    */ 
/*    */     
/* 24 */     if (((httpClient instanceof ai.grazie.client.common.SuspendableWithCloudAuth) ? httpClient : null) == null || ((httpClient instanceof ai.grazie.client.common.SuspendableWithCloudAuth) ? httpClient : null).getBaseHTTPClient() == null) ((httpClient instanceof ai.grazie.client.common.SuspendableWithCloudAuth) ? httpClient : null).getBaseHTTPClient();  ((LicenseServerAuthClient)((httpClient instanceof ai.grazie.client.common.SuspendableWithCloudAuth) ? httpClient : null).getBaseHTTPClient()).baseClient = httpClient;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object getLicenseServerAccess(@NotNull String ticket, @NotNull String sign, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/LicenseServerAuthClient$getLicenseServerAccess$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/LicenseServerAuthClient$getLicenseServerAccess$1
/*    */     //   11: astore #12
/*    */     //   13: aload #12
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #12
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/api/gateway/client/api/LicenseServerAuthClient$getLicenseServerAccess$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/LicenseServerAuthClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #12
/*    */     //   50: aload #12
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #11
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #13
/*    */     //   62: aload #12
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 257, 0 -> 88, 1 -> 191
/*    */     //   88: aload #11
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_0
/*    */     //   94: getfield baseClient : Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   97: astore #5
/*    */     //   99: getstatic ai/grazie/api/gateway/api/AuthAPI$LicenseServer$ProvideAccess.INSTANCE : Lai/grazie/api/gateway/api/AuthAPI$LicenseServer$ProvideAccess;
/*    */     //   102: checkcast ai/grazie/model/cloud/API
/*    */     //   105: aload_0
/*    */     //   106: invokevirtual getServerUrl : ()Ljava/lang/String;
/*    */     //   109: aconst_null
/*    */     //   110: aconst_null
/*    */     //   111: bipush #6
/*    */     //   113: aconst_null
/*    */     //   114: invokestatic url$default : (Lai/grazie/model/cloud/API;Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/model/cloud/AuthVersion;ILjava/lang/Object;)Ljava/lang/String;
/*    */     //   117: astore #6
/*    */     //   119: new ai/grazie/api/gateway/api/AuthAPI$LicenseServer$TicketPayload
/*    */     //   122: dup
/*    */     //   123: aload_1
/*    */     //   124: aload_2
/*    */     //   125: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   128: astore #7
/*    */     //   130: nop
/*    */     //   131: new ai/grazie/client/common/model/RequestOptions
/*    */     //   134: dup
/*    */     //   135: aconst_null
/*    */     //   136: aconst_null
/*    */     //   137: iconst_3
/*    */     //   138: aconst_null
/*    */     //   139: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   142: astore #8
/*    */     //   144: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   147: checkcast ai/grazie/utils/json/JSON
/*    */     //   150: astore #9
/*    */     //   152: iconst_0
/*    */     //   153: istore #10
/*    */     //   155: aload #5
/*    */     //   157: aload #6
/*    */     //   159: aload #7
/*    */     //   161: getstatic ai/grazie/api/gateway/api/AuthAPI$LicenseServer$TicketPayload.Companion : Lai/grazie/api/gateway/api/AuthAPI$LicenseServer$TicketPayload$Companion;
/*    */     //   164: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   167: aload #8
/*    */     //   169: aload #9
/*    */     //   171: aload #12
/*    */     //   173: aload #12
/*    */     //   175: iconst_1
/*    */     //   176: putfield label : I
/*    */     //   179: invokestatic sendAndGet : (Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   182: dup
/*    */     //   183: aload #13
/*    */     //   185: if_acmpne -> 201
/*    */     //   188: aload #13
/*    */     //   190: areturn
/*    */     //   191: iconst_0
/*    */     //   192: istore #10
/*    */     //   194: aload #11
/*    */     //   196: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   199: aload #11
/*    */     //   201: nop
/*    */     //   202: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   205: astore #5
/*    */     //   207: nop
/*    */     //   208: getstatic ai/grazie/api/gateway/api/AuthAPI$LicenseServer$ProvideAccess$Response.Companion : Lai/grazie/api/gateway/api/AuthAPI$LicenseServer$ProvideAccess$Response$Companion;
/*    */     //   211: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   214: astore #6
/*    */     //   216: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   219: checkcast ai/grazie/utils/json/JSON
/*    */     //   222: astore #7
/*    */     //   224: iconst_0
/*    */     //   225: istore #8
/*    */     //   227: aload #7
/*    */     //   229: aload #6
/*    */     //   231: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   234: aload #5
/*    */     //   236: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   239: dup
/*    */     //   240: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   243: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   246: checkcast ai/grazie/api/gateway/api/AuthAPI$LicenseServer$ProvideAccess$Response
/*    */     //   249: astore #4
/*    */     //   251: aload #4
/*    */     //   253: invokevirtual getToken : ()Ljava/lang/String;
/*    */     //   256: areturn
/*    */     //   257: new java/lang/IllegalStateException
/*    */     //   260: dup
/*    */     //   261: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   263: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   266: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #35	-> 60
/*    */     //   #36	-> 93
/*    */     //   #37	-> 99
/*    */     //   #38	-> 119
/*    */     //   #36	-> 130
/*    */     //   #63	-> 131
/*    */     //   #66	-> 131
/*    */     //   #63	-> 144
/*    */     //   #67	-> 144
/*    */     //   #63	-> 152
/*    */     //   #69	-> 155
/*    */     //   #35	-> 188
/*    */     //   #69	-> 201
/*    */     //   #39	-> 207
/*    */     //   #70	-> 208
/*    */     //   #71	-> 227
/*    */     //   #39	-> 246
/*    */     //   #36	-> 249
/*    */     //   #41	-> 251
/*    */     //   #35	-> 257
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	26	0	this	Lai/grazie/api/gateway/client/api/LicenseServerAuthClient;
/*    */     //   93	37	1	ticket	Ljava/lang/String;
/*    */     //   93	37	2	sign	Ljava/lang/String;
/*    */     //   251	6	4	response	Lai/grazie/api/gateway/api/AuthAPI$LicenseServer$ProvideAccess$Response;
/*    */     //   99	83	5	$this$sendAndGet_u24default$iv	Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   207	39	5	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   119	63	6	url$iv	Ljava/lang/String;
/*    */     //   216	30	6	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   130	52	7	content$iv	Ljava/lang/Object;
/*    */     //   224	22	7	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   144	38	8	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   152	30	9	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   155	36	10	$i$f$sendAndGet	I
/*    */     //   227	19	8	$i$f$get	I
/*    */     //   0	267	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	207	12	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	200	11	$result	Ljava/lang/Object;
/*    */     //   194	8	10	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object verifyV3(@NotNull String ticket, @NotNull String sign, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/LicenseServerAuthClient$verifyV3$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/LicenseServerAuthClient$verifyV3$1
/*    */     //   11: astore #11
/*    */     //   13: aload #11
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #11
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/api/gateway/client/api/LicenseServerAuthClient$verifyV3$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/LicenseServerAuthClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #11
/*    */     //   50: aload #11
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #10
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #12
/*    */     //   62: aload #11
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 247, 0 -> 88, 1 -> 181
/*    */     //   88: aload #10
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: getstatic ai/grazie/api/gateway/api/AuthAPI$Verify$V3.INSTANCE : Lai/grazie/api/gateway/api/AuthAPI$Verify$V3;
/*    */     //   96: checkcast ai/grazie/model/cloud/API
/*    */     //   99: astore #5
/*    */     //   101: new ai/grazie/api/gateway/api/AuthAPI$LicenseServer$TicketPayload
/*    */     //   104: dup
/*    */     //   105: aload_1
/*    */     //   106: aload_2
/*    */     //   107: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   110: astore #6
/*    */     //   112: nop
/*    */     //   113: new ai/grazie/client/common/model/RequestOptions
/*    */     //   116: dup
/*    */     //   117: aconst_null
/*    */     //   118: aconst_null
/*    */     //   119: iconst_3
/*    */     //   120: aconst_null
/*    */     //   121: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   124: astore #7
/*    */     //   126: aload_0
/*    */     //   127: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   130: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   133: astore #8
/*    */     //   135: iconst_0
/*    */     //   136: istore #9
/*    */     //   138: aload_0
/*    */     //   139: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   142: new ai/grazie/api/gateway/client/api/LicenseServerAuthClient$verifyV3$$inlined$sendAndGet$default$1
/*    */     //   145: dup
/*    */     //   146: aload #5
/*    */     //   148: aload #8
/*    */     //   150: aload #6
/*    */     //   152: aload #7
/*    */     //   154: aconst_null
/*    */     //   155: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/utils/json/JSON;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   158: checkcast kotlin/jvm/functions/Function2
/*    */     //   161: aload #11
/*    */     //   163: aload #11
/*    */     //   165: iconst_1
/*    */     //   166: putfield label : I
/*    */     //   169: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   172: dup
/*    */     //   173: aload #12
/*    */     //   175: if_acmpne -> 191
/*    */     //   178: aload #12
/*    */     //   180: areturn
/*    */     //   181: iconst_0
/*    */     //   182: istore #9
/*    */     //   184: aload #10
/*    */     //   186: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   189: aload #10
/*    */     //   191: nop
/*    */     //   192: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   195: astore #5
/*    */     //   197: nop
/*    */     //   198: getstatic ai/grazie/api/gateway/api/AuthAPI$Verify$V3$Response.Companion : Lai/grazie/api/gateway/api/AuthAPI$Verify$V3$Response$Companion;
/*    */     //   201: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   204: astore #6
/*    */     //   206: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   209: checkcast ai/grazie/utils/json/JSON
/*    */     //   212: astore #7
/*    */     //   214: iconst_0
/*    */     //   215: istore #8
/*    */     //   217: aload #7
/*    */     //   219: aload #6
/*    */     //   221: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   224: aload #5
/*    */     //   226: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   229: dup
/*    */     //   230: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   233: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   236: checkcast ai/grazie/api/gateway/api/AuthAPI$Verify$V3$Response
/*    */     //   239: astore #4
/*    */     //   241: aload #4
/*    */     //   243: invokevirtual getExpires : ()Lai/grazie/utils/mpp/time/Timestamp;
/*    */     //   246: areturn
/*    */     //   247: new java/lang/IllegalStateException
/*    */     //   250: dup
/*    */     //   251: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   253: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   256: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #44	-> 60
/*    */     //   #46	-> 93
/*    */     //   #47	-> 101
/*    */     //   #45	-> 112
/*    */     //   #72	-> 113
/*    */     //   #75	-> 113
/*    */     //   #72	-> 126
/*    */     //   #76	-> 126
/*    */     //   #72	-> 135
/*    */     //   #77	-> 138
/*    */     //   #44	-> 178
/*    */     //   #77	-> 191
/*    */     //   #48	-> 197
/*    */     //   #78	-> 198
/*    */     //   #79	-> 217
/*    */     //   #48	-> 236
/*    */     //   #45	-> 239
/*    */     //   #50	-> 241
/*    */     //   #44	-> 247
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	79	0	this	Lai/grazie/api/gateway/client/api/LicenseServerAuthClient;
/*    */     //   93	19	1	ticket	Ljava/lang/String;
/*    */     //   93	19	2	sign	Ljava/lang/String;
/*    */     //   241	6	4	verification	Lai/grazie/api/gateway/api/AuthAPI$Verify$V3$Response;
/*    */     //   101	71	5	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   197	39	5	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   112	60	6	content$iv	Ljava/lang/Object;
/*    */     //   206	30	6	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   126	46	7	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   214	22	7	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   135	37	8	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   138	43	9	$i$f$sendAndGet	I
/*    */     //   217	19	8	$i$f$get	I
/*    */     //   0	257	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	197	11	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	190	10	$result	Ljava/lang/Object;
/*    */     //   184	8	9	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object refreshV3(@NotNull String ticket, @NotNull String sign, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/LicenseServerAuthClient$refreshV3$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/LicenseServerAuthClient$refreshV3$1
/*    */     //   11: astore #11
/*    */     //   13: aload #11
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #11
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/api/gateway/client/api/LicenseServerAuthClient$refreshV3$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/LicenseServerAuthClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #11
/*    */     //   50: aload #11
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #10
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #12
/*    */     //   62: aload #11
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 247, 0 -> 88, 1 -> 181
/*    */     //   88: aload #10
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: getstatic ai/grazie/api/gateway/api/AuthAPI$Refresh$V3.INSTANCE : Lai/grazie/api/gateway/api/AuthAPI$Refresh$V3;
/*    */     //   96: checkcast ai/grazie/model/cloud/API
/*    */     //   99: astore #5
/*    */     //   101: new ai/grazie/api/gateway/api/AuthAPI$LicenseServer$TicketPayload
/*    */     //   104: dup
/*    */     //   105: aload_1
/*    */     //   106: aload_2
/*    */     //   107: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   110: astore #6
/*    */     //   112: nop
/*    */     //   113: new ai/grazie/client/common/model/RequestOptions
/*    */     //   116: dup
/*    */     //   117: aconst_null
/*    */     //   118: aconst_null
/*    */     //   119: iconst_3
/*    */     //   120: aconst_null
/*    */     //   121: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   124: astore #7
/*    */     //   126: aload_0
/*    */     //   127: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   130: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   133: astore #8
/*    */     //   135: iconst_0
/*    */     //   136: istore #9
/*    */     //   138: aload_0
/*    */     //   139: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   142: new ai/grazie/api/gateway/client/api/LicenseServerAuthClient$refreshV3$$inlined$sendAndGet$default$1
/*    */     //   145: dup
/*    */     //   146: aload #5
/*    */     //   148: aload #8
/*    */     //   150: aload #6
/*    */     //   152: aload #7
/*    */     //   154: aconst_null
/*    */     //   155: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/utils/json/JSON;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   158: checkcast kotlin/jvm/functions/Function2
/*    */     //   161: aload #11
/*    */     //   163: aload #11
/*    */     //   165: iconst_1
/*    */     //   166: putfield label : I
/*    */     //   169: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   172: dup
/*    */     //   173: aload #12
/*    */     //   175: if_acmpne -> 191
/*    */     //   178: aload #12
/*    */     //   180: areturn
/*    */     //   181: iconst_0
/*    */     //   182: istore #9
/*    */     //   184: aload #10
/*    */     //   186: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   189: aload #10
/*    */     //   191: nop
/*    */     //   192: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   195: astore #5
/*    */     //   197: nop
/*    */     //   198: getstatic ai/grazie/api/gateway/api/AuthAPI$Refresh$V3$Response.Companion : Lai/grazie/api/gateway/api/AuthAPI$Refresh$V3$Response$Companion;
/*    */     //   201: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   204: astore #6
/*    */     //   206: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   209: checkcast ai/grazie/utils/json/JSON
/*    */     //   212: astore #7
/*    */     //   214: iconst_0
/*    */     //   215: istore #8
/*    */     //   217: aload #7
/*    */     //   219: aload #6
/*    */     //   221: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   224: aload #5
/*    */     //   226: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   229: dup
/*    */     //   230: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   233: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   236: checkcast ai/grazie/api/gateway/api/AuthAPI$Refresh$V3$Response
/*    */     //   239: astore #4
/*    */     //   241: aload #4
/*    */     //   243: invokevirtual getToken : ()Ljava/lang/String;
/*    */     //   246: areturn
/*    */     //   247: new java/lang/IllegalStateException
/*    */     //   250: dup
/*    */     //   251: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   253: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   256: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #53	-> 60
/*    */     //   #55	-> 93
/*    */     //   #56	-> 101
/*    */     //   #54	-> 112
/*    */     //   #80	-> 113
/*    */     //   #83	-> 113
/*    */     //   #80	-> 126
/*    */     //   #84	-> 126
/*    */     //   #80	-> 135
/*    */     //   #85	-> 138
/*    */     //   #53	-> 178
/*    */     //   #85	-> 191
/*    */     //   #57	-> 197
/*    */     //   #86	-> 198
/*    */     //   #87	-> 217
/*    */     //   #57	-> 236
/*    */     //   #54	-> 239
/*    */     //   #59	-> 241
/*    */     //   #53	-> 247
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	79	0	this	Lai/grazie/api/gateway/client/api/LicenseServerAuthClient;
/*    */     //   93	19	1	ticket	Ljava/lang/String;
/*    */     //   93	19	2	sign	Ljava/lang/String;
/*    */     //   241	6	4	refreshing	Lai/grazie/api/gateway/api/AuthAPI$Refresh$V3$Response;
/*    */     //   101	71	5	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   197	39	5	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   112	60	6	content$iv	Ljava/lang/Object;
/*    */     //   206	30	6	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   126	46	7	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   214	22	7	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   135	37	8	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   138	43	9	$i$f$sendAndGet	I
/*    */     //   217	19	8	$i$f$get	I
/*    */     //   0	257	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	197	11	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	190	10	$result	Ljava/lang/Object;
/*    */     //   184	8	9	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LicenseServerAuthClient.kt", l = {69}, i = {}, s = {}, n = {}, m = "getLicenseServerAccess", c = "ai.grazie.api.gateway.client.api.LicenseServerAuthClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class LicenseServerAuthClient$getLicenseServerAccess$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     LicenseServerAuthClient$getLicenseServerAccess$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LicenseServerAuthClient.this.getLicenseServerAccess(null, null, (Continuation<? super String>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LicenseServerAuthClient.kt", l = {68}, i = {}, s = {}, n = {}, m = "refreshV3", c = "ai.grazie.api.gateway.client.api.LicenseServerAuthClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class LicenseServerAuthClient$refreshV3$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     LicenseServerAuthClient$refreshV3$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LicenseServerAuthClient.this.refreshV3(null, null, (Continuation<? super String>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LicenseServerAuthClient.kt", l = {68}, i = {}, s = {}, n = {}, m = "verifyV3", c = "ai.grazie.api.gateway.client.api.LicenseServerAuthClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class LicenseServerAuthClient$verifyV3$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     LicenseServerAuthClient$verifyV3$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LicenseServerAuthClient.this.verifyV3(null, null, (Continuation<? super Timestamp>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\LicenseServerAuthClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */