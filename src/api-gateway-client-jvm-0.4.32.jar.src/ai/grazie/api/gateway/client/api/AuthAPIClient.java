/*     */ package ai.grazie.api.gateway.client.api;
/*     */ 
/*     */ import ai.grazie.client.common.SuspendableHTTPClient;
/*     */ import ai.grazie.client.common.logging.AnnotationLogger;
/*     */ import ai.grazie.model.cloud.HeaderCollection;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\030\0002\0020\001:\001'B/\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013¢\006\002\020\fJ\020\020\022\032\0020\0232\006\020\024\032\0020\003H\002J\036\020\025\032\0020\0262\006\020\027\032\0020\0032\006\020\030\032\0020\003H@¢\006\002\020\031J\036\020\032\032\0020\0262\006\020\027\032\0020\0032\006\020\030\032\0020\003H@¢\006\002\020\031J\n\020\033\032\0060\034R\0020\000J\020\020\035\032\004\030\0010\003H@¢\006\002\020\036J\016\020\037\032\0020\003H@¢\006\002\020\036J\026\020 \032\0020!2\006\020\027\032\0020\003H@¢\006\002\020\"J\026\020#\032\0020!2\006\020\027\032\0020\003H@¢\006\002\020\"J\020\020$\032\004\030\0010%H@¢\006\002\020\036J\016\020&\032\0020%H@¢\006\002\020\036R\032\020\n\032\0020\013X\016¢\006\016\n\000\032\004\b\r\020\016\"\004\b\017\020\020R\016\020\021\032\0020\007X\004¢\006\002\n\000¨\006("}, d2 = {"Lai/grazie/api/gateway/client/api/AuthAPIClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "serverUrl", "", "authType", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "annotationLogger", "Lai/grazie/client/common/logging/AnnotationLogger;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;Lai/grazie/client/common/logging/AnnotationLogger;)V", "getAnnotationLogger", "()Lai/grazie/client/common/logging/AnnotationLogger;", "setAnnotationLogger", "(Lai/grazie/client/common/logging/AnnotationLogger;)V", "baseClient", "buildAuthHeader", "Lai/grazie/model/cloud/HeaderCollection;", "token", "getAccess", "Lai/grazie/api/gateway/client/api/AuthJBAInfo;", "jwtToken", "licenseID", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAccessV2", "license", "Lai/grazie/api/gateway/client/api/AuthAPIClient$License;", "refresh", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshV3", "register", "Lai/grazie/model/auth/GrazieUserState;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userInfo", "verify", "Lai/grazie/utils/mpp/time/Timestamp;", "verifyV3", "License", "api-gateway-client"})
/*     */ @SourceDebugExtension({"SMAP\nAuthAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthAPIClient.kt\nai/grazie/api/gateway/client/api/AuthAPIClient\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 HTTPResponseExtensions.kt\nai/grazie/client/common/model/HTTPResponseExtensionsKt\n+ 4 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n*L\n1#1,176:1\n69#2,6:177\n69#2,6:185\n69#2,6:193\n69#2,6:201\n7#3,2:183\n7#3,2:191\n7#3,2:199\n7#3,2:207\n7#3,2:216\n7#3,2:225\n7#3,2:234\n68#4,7:209\n28#4,7:218\n28#4,7:227\n*S KotlinDebug\n*F\n+ 1 AuthAPIClient.kt\nai/grazie/api/gateway/client/api/AuthAPIClient\n*L\n33#1:177,6\n47#1:185,6\n53#1:193,6\n67#1:201,6\n33#1:183,2\n47#1:191,2\n53#1:199,2\n67#1:207,2\n99#1:216,2\n144#1:225,2\n166#1:234,2\n82#1:209,7\n140#1:218,7\n162#1:227,7\n*E\n"})
/*     */ public final class AuthAPIClient extends SuspendableCloudClient {
/*     */   @NotNull
/*     */   private AnnotationLogger annotationLogger;
/*     */   
/*     */   @NotNull
/*  22 */   public AnnotationLogger getAnnotationLogger() { return this.annotationLogger; } @NotNull private final SuspendableHTTPClient baseClient; public void setAnnotationLogger(@NotNull AnnotationLogger <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.annotationLogger = <set-?>; } public AuthAPIClient(@NotNull String serverUrl, @NotNull AuthType authType, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json, @NotNull AnnotationLogger annotationLogger) {
/*  23 */     super(serverUrl, authType, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*     */ 
/*     */     
/*     */     this.annotationLogger = annotationLogger;
/*     */ 
/*     */     
/*  29 */     if (((httpClient instanceof ai.grazie.client.common.SuspendableWithCloudAuth) ? httpClient : null) == null || ((httpClient instanceof ai.grazie.client.common.SuspendableWithCloudAuth) ? httpClient : null).getBaseHTTPClient() == null) ((httpClient instanceof ai.grazie.client.common.SuspendableWithCloudAuth) ? httpClient : null).getBaseHTTPClient();  ((AuthAPIClient)((httpClient instanceof ai.grazie.client.common.SuspendableWithCloudAuth) ? httpClient : null).getBaseHTTPClient()).baseClient = httpClient;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Object verify(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof ai/grazie/api/gateway/client/api/AuthAPIClient$verify$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast ai/grazie/api/gateway/client/api/AuthAPIClient$verify$1
/*     */     //   11: astore #8
/*     */     //   13: aload #8
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #8
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new ai/grazie/api/gateway/client/api/AuthAPIClient$verify$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/AuthAPIClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #8
/*     */     //   50: aload #8
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #7
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #9
/*     */     //   62: aload #8
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 227, 0 -> 88, 1 -> 155
/*     */     //   88: aload #7
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: nop
/*     */     //   94: getstatic ai/grazie/api/gateway/api/AuthAPI$Verify$V2.INSTANCE : Lai/grazie/api/gateway/api/AuthAPI$Verify$V2;
/*     */     //   97: checkcast ai/grazie/model/cloud/API
/*     */     //   100: astore_3
/*     */     //   101: new ai/grazie/client/common/model/RequestOptions
/*     */     //   104: dup
/*     */     //   105: aconst_null
/*     */     //   106: aconst_null
/*     */     //   107: iconst_3
/*     */     //   108: aconst_null
/*     */     //   109: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   112: astore #4
/*     */     //   114: iconst_0
/*     */     //   115: istore #5
/*     */     //   117: aload_0
/*     */     //   118: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*     */     //   121: new ai/grazie/api/gateway/client/api/AuthAPIClient$verify$$inlined$sendAndGet$default$1
/*     */     //   124: dup
/*     */     //   125: aload_3
/*     */     //   126: aload #4
/*     */     //   128: aconst_null
/*     */     //   129: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*     */     //   132: checkcast kotlin/jvm/functions/Function2
/*     */     //   135: aload #8
/*     */     //   137: aload #8
/*     */     //   139: iconst_1
/*     */     //   140: putfield label : I
/*     */     //   143: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   146: dup
/*     */     //   147: aload #9
/*     */     //   149: if_acmpne -> 166
/*     */     //   152: aload #9
/*     */     //   154: areturn
/*     */     //   155: iconst_0
/*     */     //   156: istore #5
/*     */     //   158: nop
/*     */     //   159: aload #7
/*     */     //   161: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   164: aload #7
/*     */     //   166: nop
/*     */     //   167: checkcast ai/grazie/client/common/model/HTTPResponse
/*     */     //   170: astore_3
/*     */     //   171: nop
/*     */     //   172: getstatic ai/grazie/api/gateway/api/AuthAPI$Verify$V2$Response.Companion : Lai/grazie/api/gateway/api/AuthAPI$Verify$V2$Response$Companion;
/*     */     //   175: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   178: astore #4
/*     */     //   180: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*     */     //   183: checkcast ai/grazie/utils/json/JSON
/*     */     //   186: astore #5
/*     */     //   188: iconst_0
/*     */     //   189: istore #6
/*     */     //   191: aload #5
/*     */     //   193: aload #4
/*     */     //   195: checkcast kotlinx/serialization/DeserializationStrategy
/*     */     //   198: aload_3
/*     */     //   199: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   202: dup
/*     */     //   203: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   206: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   209: checkcast ai/grazie/api/gateway/api/AuthAPI$Verify$V2$Response
/*     */     //   212: astore_3
/*     */     //   213: goto -> 220
/*     */     //   216: astore #4
/*     */     //   218: aconst_null
/*     */     //   219: areturn
/*     */     //   220: aload_3
/*     */     //   221: astore_2
/*     */     //   222: aload_2
/*     */     //   223: invokevirtual getExpires : ()Lai/grazie/utils/mpp/time/Timestamp;
/*     */     //   226: areturn
/*     */     //   227: new java/lang/IllegalStateException
/*     */     //   230: dup
/*     */     //   231: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   233: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   236: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #31	-> 60
/*     */     //   #32	-> 93
/*     */     //   #33	-> 94
/*     */     //   #177	-> 101
/*     */     //   #179	-> 101
/*     */     //   #177	-> 114
/*     */     //   #180	-> 117
/*     */     //   #31	-> 152
/*     */     //   #182	-> 166
/*     */     //   #33	-> 171
/*     */     //   #183	-> 172
/*     */     //   #184	-> 191
/*     */     //   #34	-> 216
/*     */     //   #35	-> 218
/*     */     //   #32	-> 220
/*     */     //   #37	-> 222
/*     */     //   #31	-> 227
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	53	0	this	Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*     */     //   222	5	2	verification	Lai/grazie/api/gateway/api/AuthAPI$Verify$V2$Response;
/*     */     //   101	45	3	api$iv	Lai/grazie/model/cloud/API;
/*     */     //   171	38	3	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*     */     //   114	32	4	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   180	29	4	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */     //   188	21	5	json$iv	Lai/grazie/utils/json/JSON;
/*     */     //   117	38	5	$i$f$sendAndGet	I
/*     */     //   191	18	6	$i$f$get	I
/*     */     //   0	237	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	177	8	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	170	7	$result	Ljava/lang/Object;
/*     */     //   158	9	5	$i$f$sendAndGet	I
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   93	146	216	ai/grazie/model/cloud/exceptions/HTTPStatusException$AccessProhibited
/*     */     //   158	213	216	ai/grazie/model/cloud/exceptions/HTTPStatusException$AccessProhibited
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Object verifyV3(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof ai/grazie/api/gateway/client/api/AuthAPIClient$verifyV3$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast ai/grazie/api/gateway/client/api/AuthAPIClient$verifyV3$1
/*     */     //   11: astore #8
/*     */     //   13: aload #8
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #8
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new ai/grazie/api/gateway/client/api/AuthAPIClient$verifyV3$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/AuthAPIClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #8
/*     */     //   50: aload #8
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #7
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #9
/*     */     //   62: aload #8
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 216, 0 -> 88, 1 -> 154
/*     */     //   88: aload #7
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: getstatic ai/grazie/api/gateway/api/AuthAPI$Verify$V3.INSTANCE : Lai/grazie/api/gateway/api/AuthAPI$Verify$V3;
/*     */     //   96: checkcast ai/grazie/model/cloud/API
/*     */     //   99: astore_3
/*     */     //   100: new ai/grazie/client/common/model/RequestOptions
/*     */     //   103: dup
/*     */     //   104: aconst_null
/*     */     //   105: aconst_null
/*     */     //   106: iconst_3
/*     */     //   107: aconst_null
/*     */     //   108: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   111: astore #4
/*     */     //   113: iconst_0
/*     */     //   114: istore #5
/*     */     //   116: aload_0
/*     */     //   117: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*     */     //   120: new ai/grazie/api/gateway/client/api/AuthAPIClient$verifyV3$$inlined$sendAndGet$default$1
/*     */     //   123: dup
/*     */     //   124: aload_3
/*     */     //   125: aload #4
/*     */     //   127: aconst_null
/*     */     //   128: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*     */     //   131: checkcast kotlin/jvm/functions/Function2
/*     */     //   134: aload #8
/*     */     //   136: aload #8
/*     */     //   138: iconst_1
/*     */     //   139: putfield label : I
/*     */     //   142: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   145: dup
/*     */     //   146: aload #9
/*     */     //   148: if_acmpne -> 164
/*     */     //   151: aload #9
/*     */     //   153: areturn
/*     */     //   154: iconst_0
/*     */     //   155: istore #5
/*     */     //   157: aload #7
/*     */     //   159: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   162: aload #7
/*     */     //   164: nop
/*     */     //   165: checkcast ai/grazie/client/common/model/HTTPResponse
/*     */     //   168: astore_3
/*     */     //   169: nop
/*     */     //   170: getstatic ai/grazie/api/gateway/api/AuthAPI$Verify$V3$Response.Companion : Lai/grazie/api/gateway/api/AuthAPI$Verify$V3$Response$Companion;
/*     */     //   173: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   176: astore #4
/*     */     //   178: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*     */     //   181: checkcast ai/grazie/utils/json/JSON
/*     */     //   184: astore #5
/*     */     //   186: iconst_0
/*     */     //   187: istore #6
/*     */     //   189: aload #5
/*     */     //   191: aload #4
/*     */     //   193: checkcast kotlinx/serialization/DeserializationStrategy
/*     */     //   196: aload_3
/*     */     //   197: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   200: dup
/*     */     //   201: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   204: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   207: checkcast ai/grazie/api/gateway/api/AuthAPI$Verify$V3$Response
/*     */     //   210: astore_2
/*     */     //   211: aload_2
/*     */     //   212: invokevirtual getExpires : ()Lai/grazie/utils/mpp/time/Timestamp;
/*     */     //   215: areturn
/*     */     //   216: new java/lang/IllegalStateException
/*     */     //   219: dup
/*     */     //   220: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   222: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   225: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #46	-> 60
/*     */     //   #47	-> 93
/*     */     //   #185	-> 100
/*     */     //   #187	-> 100
/*     */     //   #185	-> 113
/*     */     //   #188	-> 116
/*     */     //   #46	-> 151
/*     */     //   #190	-> 164
/*     */     //   #47	-> 169
/*     */     //   #191	-> 170
/*     */     //   #192	-> 189
/*     */     //   #47	-> 207
/*     */     //   #48	-> 211
/*     */     //   #46	-> 216
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	52	0	this	Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*     */     //   211	5	2	verification	Lai/grazie/api/gateway/api/AuthAPI$Verify$V3$Response;
/*     */     //   100	45	3	api$iv	Lai/grazie/model/cloud/API;
/*     */     //   169	38	3	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*     */     //   113	32	4	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   178	29	4	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */     //   186	21	5	json$iv	Lai/grazie/utils/json/JSON;
/*     */     //   116	38	5	$i$f$sendAndGet	I
/*     */     //   189	18	6	$i$f$get	I
/*     */     //   0	226	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	166	8	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	159	7	$result	Ljava/lang/Object;
/*     */     //   157	8	5	$i$f$sendAndGet	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Object refresh(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof ai/grazie/api/gateway/client/api/AuthAPIClient$refresh$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast ai/grazie/api/gateway/client/api/AuthAPIClient$refresh$1
/*     */     //   11: astore #8
/*     */     //   13: aload #8
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #8
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new ai/grazie/api/gateway/client/api/AuthAPIClient$refresh$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/AuthAPIClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #8
/*     */     //   50: aload #8
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #7
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #9
/*     */     //   62: aload #8
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 227, 0 -> 88, 1 -> 155
/*     */     //   88: aload #7
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: nop
/*     */     //   94: getstatic ai/grazie/api/gateway/api/AuthAPI$Refresh$V2.INSTANCE : Lai/grazie/api/gateway/api/AuthAPI$Refresh$V2;
/*     */     //   97: checkcast ai/grazie/model/cloud/API
/*     */     //   100: astore_3
/*     */     //   101: new ai/grazie/client/common/model/RequestOptions
/*     */     //   104: dup
/*     */     //   105: aconst_null
/*     */     //   106: aconst_null
/*     */     //   107: iconst_3
/*     */     //   108: aconst_null
/*     */     //   109: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   112: astore #4
/*     */     //   114: iconst_0
/*     */     //   115: istore #5
/*     */     //   117: aload_0
/*     */     //   118: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*     */     //   121: new ai/grazie/api/gateway/client/api/AuthAPIClient$refresh$$inlined$sendAndGet$default$1
/*     */     //   124: dup
/*     */     //   125: aload_3
/*     */     //   126: aload #4
/*     */     //   128: aconst_null
/*     */     //   129: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*     */     //   132: checkcast kotlin/jvm/functions/Function2
/*     */     //   135: aload #8
/*     */     //   137: aload #8
/*     */     //   139: iconst_1
/*     */     //   140: putfield label : I
/*     */     //   143: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   146: dup
/*     */     //   147: aload #9
/*     */     //   149: if_acmpne -> 166
/*     */     //   152: aload #9
/*     */     //   154: areturn
/*     */     //   155: iconst_0
/*     */     //   156: istore #5
/*     */     //   158: nop
/*     */     //   159: aload #7
/*     */     //   161: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   164: aload #7
/*     */     //   166: nop
/*     */     //   167: checkcast ai/grazie/client/common/model/HTTPResponse
/*     */     //   170: astore_3
/*     */     //   171: nop
/*     */     //   172: getstatic ai/grazie/api/gateway/api/AuthAPI$Refresh$V2$Response.Companion : Lai/grazie/api/gateway/api/AuthAPI$Refresh$V2$Response$Companion;
/*     */     //   175: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   178: astore #4
/*     */     //   180: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*     */     //   183: checkcast ai/grazie/utils/json/JSON
/*     */     //   186: astore #5
/*     */     //   188: iconst_0
/*     */     //   189: istore #6
/*     */     //   191: aload #5
/*     */     //   193: aload #4
/*     */     //   195: checkcast kotlinx/serialization/DeserializationStrategy
/*     */     //   198: aload_3
/*     */     //   199: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   202: dup
/*     */     //   203: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   206: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   209: checkcast ai/grazie/api/gateway/api/AuthAPI$Refresh$V2$Response
/*     */     //   212: astore_3
/*     */     //   213: goto -> 220
/*     */     //   216: astore #4
/*     */     //   218: aconst_null
/*     */     //   219: areturn
/*     */     //   220: aload_3
/*     */     //   221: astore_2
/*     */     //   222: aload_2
/*     */     //   223: invokevirtual getToken : ()Ljava/lang/String;
/*     */     //   226: areturn
/*     */     //   227: new java/lang/IllegalStateException
/*     */     //   230: dup
/*     */     //   231: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   233: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   236: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #51	-> 60
/*     */     //   #52	-> 93
/*     */     //   #53	-> 94
/*     */     //   #193	-> 101
/*     */     //   #195	-> 101
/*     */     //   #193	-> 114
/*     */     //   #196	-> 117
/*     */     //   #51	-> 152
/*     */     //   #198	-> 166
/*     */     //   #53	-> 171
/*     */     //   #199	-> 172
/*     */     //   #200	-> 191
/*     */     //   #54	-> 216
/*     */     //   #55	-> 218
/*     */     //   #52	-> 220
/*     */     //   #57	-> 222
/*     */     //   #51	-> 227
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	53	0	this	Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*     */     //   222	5	2	refreshing	Lai/grazie/api/gateway/api/AuthAPI$Refresh$V2$Response;
/*     */     //   101	45	3	api$iv	Lai/grazie/model/cloud/API;
/*     */     //   171	38	3	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*     */     //   114	32	4	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   180	29	4	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */     //   188	21	5	json$iv	Lai/grazie/utils/json/JSON;
/*     */     //   117	38	5	$i$f$sendAndGet	I
/*     */     //   191	18	6	$i$f$get	I
/*     */     //   0	237	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	177	8	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	170	7	$result	Ljava/lang/Object;
/*     */     //   158	9	5	$i$f$sendAndGet	I
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   93	146	216	ai/grazie/model/cloud/exceptions/HTTPStatusException$AccessProhibited
/*     */     //   158	213	216	ai/grazie/model/cloud/exceptions/HTTPStatusException$AccessProhibited
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Object refreshV3(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof ai/grazie/api/gateway/client/api/AuthAPIClient$refreshV3$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast ai/grazie/api/gateway/client/api/AuthAPIClient$refreshV3$1
/*     */     //   11: astore #8
/*     */     //   13: aload #8
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #8
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new ai/grazie/api/gateway/client/api/AuthAPIClient$refreshV3$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/AuthAPIClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #8
/*     */     //   50: aload #8
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #7
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #9
/*     */     //   62: aload #8
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 216, 0 -> 88, 1 -> 154
/*     */     //   88: aload #7
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: getstatic ai/grazie/api/gateway/api/AuthAPI$Refresh$V3.INSTANCE : Lai/grazie/api/gateway/api/AuthAPI$Refresh$V3;
/*     */     //   96: checkcast ai/grazie/model/cloud/API
/*     */     //   99: astore_3
/*     */     //   100: new ai/grazie/client/common/model/RequestOptions
/*     */     //   103: dup
/*     */     //   104: aconst_null
/*     */     //   105: aconst_null
/*     */     //   106: iconst_3
/*     */     //   107: aconst_null
/*     */     //   108: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   111: astore #4
/*     */     //   113: iconst_0
/*     */     //   114: istore #5
/*     */     //   116: aload_0
/*     */     //   117: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*     */     //   120: new ai/grazie/api/gateway/client/api/AuthAPIClient$refreshV3$$inlined$sendAndGet$default$1
/*     */     //   123: dup
/*     */     //   124: aload_3
/*     */     //   125: aload #4
/*     */     //   127: aconst_null
/*     */     //   128: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*     */     //   131: checkcast kotlin/jvm/functions/Function2
/*     */     //   134: aload #8
/*     */     //   136: aload #8
/*     */     //   138: iconst_1
/*     */     //   139: putfield label : I
/*     */     //   142: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   145: dup
/*     */     //   146: aload #9
/*     */     //   148: if_acmpne -> 164
/*     */     //   151: aload #9
/*     */     //   153: areturn
/*     */     //   154: iconst_0
/*     */     //   155: istore #5
/*     */     //   157: aload #7
/*     */     //   159: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   162: aload #7
/*     */     //   164: nop
/*     */     //   165: checkcast ai/grazie/client/common/model/HTTPResponse
/*     */     //   168: astore_3
/*     */     //   169: nop
/*     */     //   170: getstatic ai/grazie/api/gateway/api/AuthAPI$Refresh$V3$Response.Companion : Lai/grazie/api/gateway/api/AuthAPI$Refresh$V3$Response$Companion;
/*     */     //   173: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   176: astore #4
/*     */     //   178: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*     */     //   181: checkcast ai/grazie/utils/json/JSON
/*     */     //   184: astore #5
/*     */     //   186: iconst_0
/*     */     //   187: istore #6
/*     */     //   189: aload #5
/*     */     //   191: aload #4
/*     */     //   193: checkcast kotlinx/serialization/DeserializationStrategy
/*     */     //   196: aload_3
/*     */     //   197: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   200: dup
/*     */     //   201: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   204: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   207: checkcast ai/grazie/api/gateway/api/AuthAPI$Refresh$V3$Response
/*     */     //   210: astore_2
/*     */     //   211: aload_2
/*     */     //   212: invokevirtual getToken : ()Ljava/lang/String;
/*     */     //   215: areturn
/*     */     //   216: new java/lang/IllegalStateException
/*     */     //   219: dup
/*     */     //   220: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   222: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   225: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #66	-> 60
/*     */     //   #67	-> 93
/*     */     //   #201	-> 100
/*     */     //   #203	-> 100
/*     */     //   #201	-> 113
/*     */     //   #204	-> 116
/*     */     //   #66	-> 151
/*     */     //   #206	-> 164
/*     */     //   #67	-> 169
/*     */     //   #207	-> 170
/*     */     //   #208	-> 189
/*     */     //   #67	-> 207
/*     */     //   #68	-> 211
/*     */     //   #66	-> 216
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	52	0	this	Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*     */     //   211	5	2	refreshing	Lai/grazie/api/gateway/api/AuthAPI$Refresh$V3$Response;
/*     */     //   100	45	3	api$iv	Lai/grazie/model/cloud/API;
/*     */     //   169	38	3	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*     */     //   113	32	4	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   178	29	4	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */     //   186	21	5	json$iv	Lai/grazie/utils/json/JSON;
/*     */     //   116	38	5	$i$f$sendAndGet	I
/*     */     //   189	18	6	$i$f$get	I
/*     */     //   0	226	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	166	8	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	159	7	$result	Ljava/lang/Object;
/*     */     //   157	8	5	$i$f$sendAndGet	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Object userInfo(@NotNull String jwtToken, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof ai/grazie/api/gateway/client/api/AuthAPIClient$userInfo$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast ai/grazie/api/gateway/client/api/AuthAPIClient$userInfo$1
/*     */     //   11: astore #11
/*     */     //   13: aload #11
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #11
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new ai/grazie/api/gateway/client/api/AuthAPIClient$userInfo$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/AuthAPIClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #11
/*     */     //   50: aload #11
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #10
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #12
/*     */     //   62: aload #11
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 241, 0 -> 88, 1 -> 184
/*     */     //   88: aload #10
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: getfield baseClient : Lai/grazie/client/common/SuspendableHTTPClient;
/*     */     //   97: astore #4
/*     */     //   99: getstatic ai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$UserInfo.INSTANCE : Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$UserInfo;
/*     */     //   102: checkcast ai/grazie/model/cloud/API
/*     */     //   105: aload_0
/*     */     //   106: invokevirtual getServerUrl : ()Ljava/lang/String;
/*     */     //   109: aconst_null
/*     */     //   110: aconst_null
/*     */     //   111: bipush #6
/*     */     //   113: aconst_null
/*     */     //   114: invokestatic url$default : (Lai/grazie/model/cloud/API;Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/model/cloud/AuthVersion;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   117: astore #5
/*     */     //   119: new ai/grazie/client/common/model/RequestOptions
/*     */     //   122: dup
/*     */     //   123: aload_0
/*     */     //   124: aload_1
/*     */     //   125: invokespecial buildAuthHeader : (Ljava/lang/String;)Lai/grazie/model/cloud/HeaderCollection;
/*     */     //   128: aconst_null
/*     */     //   129: aconst_null
/*     */     //   130: bipush #6
/*     */     //   132: aconst_null
/*     */     //   133: invokespecial <init> : (Lai/grazie/model/cloud/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;Lai/grazie/model/cloud/HttpTimeoutConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   136: astore #6
/*     */     //   138: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*     */     //   141: checkcast ai/grazie/utils/json/JSON
/*     */     //   144: astore #7
/*     */     //   146: iconst_0
/*     */     //   147: istore #8
/*     */     //   149: aload #4
/*     */     //   151: aload #5
/*     */     //   153: aload #6
/*     */     //   155: aload #11
/*     */     //   157: aload #11
/*     */     //   159: aload #7
/*     */     //   161: putfield L$0 : Ljava/lang/Object;
/*     */     //   164: aload #11
/*     */     //   166: iconst_1
/*     */     //   167: putfield label : I
/*     */     //   170: invokeinterface get : (Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   175: dup
/*     */     //   176: aload #12
/*     */     //   178: if_acmpne -> 204
/*     */     //   181: aload #12
/*     */     //   183: areturn
/*     */     //   184: iconst_0
/*     */     //   185: istore #8
/*     */     //   187: aload #11
/*     */     //   189: getfield L$0 : Ljava/lang/Object;
/*     */     //   192: checkcast ai/grazie/utils/json/JSON
/*     */     //   195: astore #7
/*     */     //   197: aload #10
/*     */     //   199: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   202: aload #10
/*     */     //   204: checkcast ai/grazie/client/common/model/HTTPResponse
/*     */     //   207: astore #9
/*     */     //   209: aload #7
/*     */     //   211: getstatic ai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$UserInfo$Response.Companion : Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$UserInfo$Response$Companion;
/*     */     //   214: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   217: checkcast kotlinx/serialization/DeserializationStrategy
/*     */     //   220: aload #9
/*     */     //   222: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   225: dup
/*     */     //   226: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   229: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   232: checkcast ai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$UserInfo$Response
/*     */     //   235: astore_3
/*     */     //   236: aload_3
/*     */     //   237: invokevirtual getState : ()Lai/grazie/model/auth/GrazieUserState;
/*     */     //   240: areturn
/*     */     //   241: new java/lang/IllegalStateException
/*     */     //   244: dup
/*     */     //   245: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   247: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   250: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #80	-> 60
/*     */     //   #82	-> 93
/*     */     //   #209	-> 138
/*     */     //   #209	-> 138
/*     */     //   #212	-> 138
/*     */     //   #209	-> 146
/*     */     //   #214	-> 149
/*     */     //   #80	-> 181
/*     */     //   #215	-> 209
/*     */     //   #82	-> 232
/*     */     //   #81	-> 235
/*     */     //   #84	-> 236
/*     */     //   #80	-> 241
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	45	0	this	Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*     */     //   93	45	1	jwtToken	Ljava/lang/String;
/*     */     //   236	5	3	userState	Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$UserInfo$Response;
/*     */     //   138	37	4	$this$get_u24default$iv	Lai/grazie/client/common/SuspendableHTTPClient;
/*     */     //   138	37	5	url$iv	Ljava/lang/String;
/*     */     //   138	37	6	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   146	38	7	json$iv	Lai/grazie/utils/json/JSON;
/*     */     //   197	35	7	json$iv	Lai/grazie/utils/json/JSON;
/*     */     //   209	23	9	response$iv	Lai/grazie/client/common/model/HTTPResponse;
/*     */     //   149	35	8	$i$f$get	I
/*     */     //   0	251	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	191	11	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	184	10	$result	Ljava/lang/Object;
/*     */     //   187	45	8	$i$f$get	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Object register(@NotNull String jwtToken, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof ai/grazie/api/gateway/client/api/AuthAPIClient$register$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast ai/grazie/api/gateway/client/api/AuthAPIClient$register$1
/*     */     //   11: astore #9
/*     */     //   13: aload #9
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #9
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new ai/grazie/api/gateway/client/api/AuthAPIClient$register$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/AuthAPIClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #9
/*     */     //   50: aload #9
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #8
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #10
/*     */     //   62: aload #9
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 212, 0 -> 88, 1 -> 152
/*     */     //   88: aload #8
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: getfield baseClient : Lai/grazie/client/common/SuspendableHTTPClient;
/*     */     //   97: getstatic ai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$Register.INSTANCE : Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$Register;
/*     */     //   100: checkcast ai/grazie/model/cloud/API
/*     */     //   103: aload_0
/*     */     //   104: invokevirtual getServerUrl : ()Ljava/lang/String;
/*     */     //   107: aconst_null
/*     */     //   108: aconst_null
/*     */     //   109: bipush #6
/*     */     //   111: aconst_null
/*     */     //   112: invokestatic url$default : (Lai/grazie/model/cloud/API;Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/model/cloud/AuthVersion;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   115: new ai/grazie/client/common/model/RequestOptions
/*     */     //   118: dup
/*     */     //   119: aload_0
/*     */     //   120: aload_1
/*     */     //   121: invokespecial buildAuthHeader : (Ljava/lang/String;)Lai/grazie/model/cloud/HeaderCollection;
/*     */     //   124: aconst_null
/*     */     //   125: aconst_null
/*     */     //   126: bipush #6
/*     */     //   128: aconst_null
/*     */     //   129: invokespecial <init> : (Lai/grazie/model/cloud/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;Lai/grazie/model/cloud/HttpTimeoutConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   132: aload #9
/*     */     //   134: aload #9
/*     */     //   136: iconst_1
/*     */     //   137: putfield label : I
/*     */     //   140: invokestatic sendAndGet : (Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   143: dup
/*     */     //   144: aload #10
/*     */     //   146: if_acmpne -> 159
/*     */     //   149: aload #10
/*     */     //   151: areturn
/*     */     //   152: aload #8
/*     */     //   154: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   157: aload #8
/*     */     //   159: checkcast ai/grazie/client/common/model/HTTPResponse
/*     */     //   162: astore #4
/*     */     //   164: nop
/*     */     //   165: getstatic ai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$Register$Response.Companion : Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$Register$Response$Companion;
/*     */     //   168: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   171: astore #5
/*     */     //   173: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*     */     //   176: checkcast ai/grazie/utils/json/JSON
/*     */     //   179: astore #6
/*     */     //   181: iconst_0
/*     */     //   182: istore #7
/*     */     //   184: aload #6
/*     */     //   186: aload #5
/*     */     //   188: checkcast kotlinx/serialization/DeserializationStrategy
/*     */     //   191: aload #4
/*     */     //   193: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   196: dup
/*     */     //   197: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   200: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   203: checkcast ai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$Register$Response
/*     */     //   206: astore_3
/*     */     //   207: aload_3
/*     */     //   208: invokevirtual getState : ()Lai/grazie/model/auth/GrazieUserState;
/*     */     //   211: areturn
/*     */     //   212: new java/lang/IllegalStateException
/*     */     //   215: dup
/*     */     //   216: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   218: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   221: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #95	-> 60
/*     */     //   #96	-> 93
/*     */     //   #97	-> 97
/*     */     //   #98	-> 115
/*     */     //   #96	-> 134
/*     */     //   #95	-> 149
/*     */     //   #99	-> 164
/*     */     //   #216	-> 165
/*     */     //   #217	-> 184
/*     */     //   #99	-> 203
/*     */     //   #96	-> 206
/*     */     //   #101	-> 207
/*     */     //   #95	-> 212
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	41	0	this	Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*     */     //   93	41	1	jwtToken	Ljava/lang/String;
/*     */     //   207	5	3	response	Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$Register$Response;
/*     */     //   164	39	4	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*     */     //   173	30	5	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */     //   181	22	6	json$iv	Lai/grazie/utils/json/JSON;
/*     */     //   184	19	7	$i$f$get	I
/*     */     //   0	222	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	162	9	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	155	8	$result	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\b\004\030\0002\0020\001B\005¢\006\002\020\002J\030\020\003\032\004\030\0010\0042\006\020\005\032\0020\006H@¢\006\002\020\007¨\006\b"}, d2 = {"Lai/grazie/api/gateway/client/api/AuthAPIClient$License;", "", "(Lai/grazie/api/gateway/client/api/AuthAPIClient;)V", "obtainGrazieLite", "Lai/grazie/license/JBALicense;", "jwtToken", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*     */   @SourceDebugExtension({"SMAP\nAuthAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthAPIClient.kt\nai/grazie/api/gateway/client/api/AuthAPIClient$License\n+ 2 HTTPResponseExtensions.kt\nai/grazie/client/common/model/HTTPResponseExtensionsKt\n*L\n1#1,176:1\n7#2,2:177\n*S KotlinDebug\n*F\n+ 1 AuthAPIClient.kt\nai/grazie/api/gateway/client/api/AuthAPIClient$License\n*L\n119#1:177,2\n*E\n"})
/*     */   public final class License
/*     */   {
/*     */     @Nullable
/*     */     public final Object obtainGrazieLite(@NotNull String jwtToken, @NotNull Continuation $completion) {
/*     */       // Byte code:
/*     */       //   0: aload_2
/*     */       //   1: instanceof ai/grazie/api/gateway/client/api/AuthAPIClient$License$obtainGrazieLite$1
/*     */       //   4: ifeq -> 39
/*     */       //   7: aload_2
/*     */       //   8: checkcast ai/grazie/api/gateway/client/api/AuthAPIClient$License$obtainGrazieLite$1
/*     */       //   11: astore #9
/*     */       //   13: aload #9
/*     */       //   15: getfield label : I
/*     */       //   18: ldc -2147483648
/*     */       //   20: iand
/*     */       //   21: ifeq -> 39
/*     */       //   24: aload #9
/*     */       //   26: dup
/*     */       //   27: getfield label : I
/*     */       //   30: ldc -2147483648
/*     */       //   32: isub
/*     */       //   33: putfield label : I
/*     */       //   36: goto -> 50
/*     */       //   39: new ai/grazie/api/gateway/client/api/AuthAPIClient$License$obtainGrazieLite$1
/*     */       //   42: dup
/*     */       //   43: aload_0
/*     */       //   44: aload_2
/*     */       //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/AuthAPIClient$License;Lkotlin/coroutines/Continuation;)V
/*     */       //   48: astore #9
/*     */       //   50: aload #9
/*     */       //   52: getfield result : Ljava/lang/Object;
/*     */       //   55: astore #8
/*     */       //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   60: astore #10
/*     */       //   62: aload #9
/*     */       //   64: getfield label : I
/*     */       //   67: tableswitch default -> 221, 0 -> 88, 1 -> 161
/*     */       //   88: aload #8
/*     */       //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   93: aload_0
/*     */       //   94: getfield this$0 : Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*     */       //   97: invokestatic access$getBaseClient$p : (Lai/grazie/api/gateway/client/api/AuthAPIClient;)Lai/grazie/client/common/SuspendableHTTPClient;
/*     */       //   100: getstatic ai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$License$ObtainGrazieLite.INSTANCE : Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$License$ObtainGrazieLite;
/*     */       //   103: checkcast ai/grazie/model/cloud/API
/*     */       //   106: aload_0
/*     */       //   107: getfield this$0 : Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*     */       //   110: invokevirtual getServerUrl : ()Ljava/lang/String;
/*     */       //   113: aconst_null
/*     */       //   114: aconst_null
/*     */       //   115: bipush #6
/*     */       //   117: aconst_null
/*     */       //   118: invokestatic url$default : (Lai/grazie/model/cloud/API;Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/model/cloud/AuthVersion;ILjava/lang/Object;)Ljava/lang/String;
/*     */       //   121: new ai/grazie/client/common/model/RequestOptions
/*     */       //   124: dup
/*     */       //   125: aload_0
/*     */       //   126: getfield this$0 : Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*     */       //   129: aload_1
/*     */       //   130: invokestatic access$buildAuthHeader : (Lai/grazie/api/gateway/client/api/AuthAPIClient;Ljava/lang/String;)Lai/grazie/model/cloud/HeaderCollection;
/*     */       //   133: aconst_null
/*     */       //   134: aconst_null
/*     */       //   135: bipush #6
/*     */       //   137: aconst_null
/*     */       //   138: invokespecial <init> : (Lai/grazie/model/cloud/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;Lai/grazie/model/cloud/HttpTimeoutConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */       //   141: aload #9
/*     */       //   143: aload #9
/*     */       //   145: iconst_1
/*     */       //   146: putfield label : I
/*     */       //   149: invokestatic sendAndGet : (Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   152: dup
/*     */       //   153: aload #10
/*     */       //   155: if_acmpne -> 168
/*     */       //   158: aload #10
/*     */       //   160: areturn
/*     */       //   161: aload #8
/*     */       //   163: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   166: aload #8
/*     */       //   168: checkcast ai/grazie/client/common/model/HTTPResponse
/*     */       //   171: astore #4
/*     */       //   173: nop
/*     */       //   174: getstatic ai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$License$ObtainGrazieLite$Response.Companion : Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$License$ObtainGrazieLite$Response$Companion;
/*     */       //   177: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */       //   180: astore #5
/*     */       //   182: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*     */       //   185: checkcast ai/grazie/utils/json/JSON
/*     */       //   188: astore #6
/*     */       //   190: iconst_0
/*     */       //   191: istore #7
/*     */       //   193: aload #6
/*     */       //   195: aload #5
/*     */       //   197: checkcast kotlinx/serialization/DeserializationStrategy
/*     */       //   200: aload #4
/*     */       //   202: invokevirtual getContent : ()Ljava/lang/String;
/*     */       //   205: dup
/*     */       //   206: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */       //   209: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*     */       //   212: checkcast ai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$License$ObtainGrazieLite$Response
/*     */       //   215: astore_3
/*     */       //   216: aload_3
/*     */       //   217: invokevirtual getLicense : ()Lai/grazie/license/JBALicense;
/*     */       //   220: areturn
/*     */       //   221: new java/lang/IllegalStateException
/*     */       //   224: dup
/*     */       //   225: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   227: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   230: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #115	-> 60
/*     */       //   #116	-> 93
/*     */       //   #117	-> 100
/*     */       //   #118	-> 121
/*     */       //   #116	-> 143
/*     */       //   #115	-> 158
/*     */       //   #119	-> 173
/*     */       //   #177	-> 174
/*     */       //   #178	-> 193
/*     */       //   #119	-> 212
/*     */       //   #116	-> 215
/*     */       //   #121	-> 216
/*     */       //   #115	-> 221
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   93	50	0	this	Lai/grazie/api/gateway/client/api/AuthAPIClient$License;
/*     */       //   93	50	1	jwtToken	Ljava/lang/String;
/*     */       //   216	5	3	response	Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$License$ObtainGrazieLite$Response;
/*     */       //   173	39	4	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*     */       //   182	30	5	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */       //   190	22	6	json$iv	Lai/grazie/utils/json/JSON;
/*     */       //   193	19	7	$i$f$get	I
/*     */       //   0	231	2	$completion	Lkotlin/coroutines/Continuation;
/*     */       //   50	171	9	$continuation	Lkotlin/coroutines/Continuation;
/*     */       //   57	164	8	$result	Ljava/lang/Object;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @DebugMetadata(f = "AuthAPIClient.kt", l = {116}, i = {}, s = {}, n = {}, m = "obtainGrazieLite", c = "ai.grazie.api.gateway.client.api.AuthAPIClient$License")
/*     */     @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */     static final class AuthAPIClient$License$obtainGrazieLite$1
/*     */       extends ContinuationImpl
/*     */     {
/*     */       int label;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       AuthAPIClient$License$obtainGrazieLite$1(Continuation $completion) {
/*     */         super($completion);
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       @Nullable
/*     */       public final Object invokeSuspend(@NotNull Object $result) {
/*     */         this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return AuthAPIClient.License.this.obtainGrazieLite(null, (Continuation<? super JBALicense>)this);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final License license() {
/* 125 */     return new License();
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
/*     */   @Nullable
/*     */   public final Object getAccess(@NotNull String jwtToken, @NotNull String licenseID, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof ai/grazie/api/gateway/client/api/AuthAPIClient$getAccess$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast ai/grazie/api/gateway/client/api/AuthAPIClient$getAccess$1
/*     */     //   11: astore #12
/*     */     //   13: aload #12
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #12
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new ai/grazie/api/gateway/client/api/AuthAPIClient$getAccess$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/AuthAPIClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #12
/*     */     //   50: aload #12
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #11
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #13
/*     */     //   62: aload #12
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 281, 0 -> 88, 1 -> 203
/*     */     //   88: aload #11
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: getfield baseClient : Lai/grazie/client/common/SuspendableHTTPClient;
/*     */     //   97: astore #5
/*     */     //   99: getstatic ai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$License.INSTANCE : Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$License;
/*     */     //   102: checkcast ai/grazie/model/cloud/API
/*     */     //   105: aload_0
/*     */     //   106: invokevirtual getServerUrl : ()Ljava/lang/String;
/*     */     //   109: aconst_null
/*     */     //   110: aconst_null
/*     */     //   111: bipush #6
/*     */     //   113: aconst_null
/*     */     //   114: invokestatic url$default : (Lai/grazie/model/cloud/API;Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/model/cloud/AuthVersion;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   117: astore #6
/*     */     //   119: new ai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$License$Request
/*     */     //   122: dup
/*     */     //   123: new ai/grazie/license/LicenseID
/*     */     //   126: dup
/*     */     //   127: aload_2
/*     */     //   128: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   131: invokespecial <init> : (Lai/grazie/license/LicenseID;)V
/*     */     //   134: astore #7
/*     */     //   136: new ai/grazie/client/common/model/RequestOptions
/*     */     //   139: dup
/*     */     //   140: aload_0
/*     */     //   141: aload_1
/*     */     //   142: invokespecial buildAuthHeader : (Ljava/lang/String;)Lai/grazie/model/cloud/HeaderCollection;
/*     */     //   145: aconst_null
/*     */     //   146: aconst_null
/*     */     //   147: bipush #6
/*     */     //   149: aconst_null
/*     */     //   150: invokespecial <init> : (Lai/grazie/model/cloud/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;Lai/grazie/model/cloud/HttpTimeoutConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   153: astore #8
/*     */     //   155: nop
/*     */     //   156: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*     */     //   159: checkcast ai/grazie/utils/json/JSON
/*     */     //   162: astore #9
/*     */     //   164: iconst_0
/*     */     //   165: istore #10
/*     */     //   167: aload #5
/*     */     //   169: aload #6
/*     */     //   171: aload #7
/*     */     //   173: getstatic ai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$License$Request.Companion : Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$License$Request$Companion;
/*     */     //   176: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   179: aload #8
/*     */     //   181: aload #9
/*     */     //   183: aload #12
/*     */     //   185: aload #12
/*     */     //   187: iconst_1
/*     */     //   188: putfield label : I
/*     */     //   191: invokestatic sendAndGet : (Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   194: dup
/*     */     //   195: aload #13
/*     */     //   197: if_acmpne -> 213
/*     */     //   200: aload #13
/*     */     //   202: areturn
/*     */     //   203: iconst_0
/*     */     //   204: istore #10
/*     */     //   206: aload #11
/*     */     //   208: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   211: aload #11
/*     */     //   213: nop
/*     */     //   214: checkcast ai/grazie/client/common/model/HTTPResponse
/*     */     //   217: astore #5
/*     */     //   219: nop
/*     */     //   220: getstatic ai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$License$Response.Companion : Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$License$Response$Companion;
/*     */     //   223: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   226: astore #6
/*     */     //   228: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*     */     //   231: checkcast ai/grazie/utils/json/JSON
/*     */     //   234: astore #7
/*     */     //   236: iconst_0
/*     */     //   237: istore #8
/*     */     //   239: aload #7
/*     */     //   241: aload #6
/*     */     //   243: checkcast kotlinx/serialization/DeserializationStrategy
/*     */     //   246: aload #5
/*     */     //   248: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   251: dup
/*     */     //   252: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   255: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   258: checkcast ai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$License$Response
/*     */     //   261: astore #4
/*     */     //   263: new ai/grazie/api/gateway/client/api/AuthJBAInfo
/*     */     //   266: dup
/*     */     //   267: aload #4
/*     */     //   269: invokevirtual getState : ()Lai/grazie/model/auth/GrazieUserState;
/*     */     //   272: aload #4
/*     */     //   274: invokevirtual getToken : ()Ljava/lang/String;
/*     */     //   277: invokespecial <init> : (Lai/grazie/model/auth/GrazieUserState;Ljava/lang/String;)V
/*     */     //   280: areturn
/*     */     //   281: new java/lang/IllegalStateException
/*     */     //   284: dup
/*     */     //   285: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   287: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   290: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #139	-> 60
/*     */     //   #140	-> 93
/*     */     //   #141	-> 99
/*     */     //   #142	-> 119
/*     */     //   #143	-> 136
/*     */     //   #140	-> 155
/*     */     //   #218	-> 156
/*     */     //   #218	-> 156
/*     */     //   #222	-> 156
/*     */     //   #218	-> 164
/*     */     //   #224	-> 167
/*     */     //   #139	-> 200
/*     */     //   #224	-> 213
/*     */     //   #144	-> 219
/*     */     //   #225	-> 220
/*     */     //   #226	-> 239
/*     */     //   #144	-> 258
/*     */     //   #140	-> 261
/*     */     //   #145	-> 263
/*     */     //   #139	-> 281
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	62	0	this	Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*     */     //   93	62	1	jwtToken	Ljava/lang/String;
/*     */     //   93	43	2	licenseID	Ljava/lang/String;
/*     */     //   263	18	4	response	Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$License$Response;
/*     */     //   99	95	5	$this$sendAndGet_u24default$iv	Lai/grazie/client/common/SuspendableHTTPClient;
/*     */     //   219	39	5	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*     */     //   119	75	6	url$iv	Ljava/lang/String;
/*     */     //   228	30	6	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */     //   136	58	7	content$iv	Ljava/lang/Object;
/*     */     //   236	22	7	json$iv	Lai/grazie/utils/json/JSON;
/*     */     //   155	39	8	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   164	30	9	json$iv	Lai/grazie/utils/json/JSON;
/*     */     //   167	36	10	$i$f$sendAndGet	I
/*     */     //   239	19	8	$i$f$get	I
/*     */     //   0	291	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	231	12	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	224	11	$result	Ljava/lang/Object;
/*     */     //   206	8	10	$i$f$sendAndGet	I
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
/*     */   @Nullable
/*     */   public final Object getAccessV2(@NotNull String jwtToken, @NotNull String licenseID, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof ai/grazie/api/gateway/client/api/AuthAPIClient$getAccessV2$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast ai/grazie/api/gateway/client/api/AuthAPIClient$getAccessV2$1
/*     */     //   11: astore #12
/*     */     //   13: aload #12
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #12
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new ai/grazie/api/gateway/client/api/AuthAPIClient$getAccessV2$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/AuthAPIClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #12
/*     */     //   50: aload #12
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #11
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #13
/*     */     //   62: aload #12
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 281, 0 -> 88, 1 -> 203
/*     */     //   88: aload #11
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: getfield baseClient : Lai/grazie/client/common/SuspendableHTTPClient;
/*     */     //   97: astore #5
/*     */     //   99: getstatic ai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$LicenseV2.INSTANCE : Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$LicenseV2;
/*     */     //   102: checkcast ai/grazie/model/cloud/API
/*     */     //   105: aload_0
/*     */     //   106: invokevirtual getServerUrl : ()Ljava/lang/String;
/*     */     //   109: aconst_null
/*     */     //   110: aconst_null
/*     */     //   111: bipush #6
/*     */     //   113: aconst_null
/*     */     //   114: invokestatic url$default : (Lai/grazie/model/cloud/API;Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/model/cloud/AuthVersion;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   117: astore #6
/*     */     //   119: new ai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$LicenseV2$Request
/*     */     //   122: dup
/*     */     //   123: new ai/grazie/license/LicenseID
/*     */     //   126: dup
/*     */     //   127: aload_2
/*     */     //   128: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   131: invokespecial <init> : (Lai/grazie/license/LicenseID;)V
/*     */     //   134: astore #7
/*     */     //   136: new ai/grazie/client/common/model/RequestOptions
/*     */     //   139: dup
/*     */     //   140: aload_0
/*     */     //   141: aload_1
/*     */     //   142: invokespecial buildAuthHeader : (Ljava/lang/String;)Lai/grazie/model/cloud/HeaderCollection;
/*     */     //   145: aconst_null
/*     */     //   146: aconst_null
/*     */     //   147: bipush #6
/*     */     //   149: aconst_null
/*     */     //   150: invokespecial <init> : (Lai/grazie/model/cloud/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;Lai/grazie/model/cloud/HttpTimeoutConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   153: astore #8
/*     */     //   155: nop
/*     */     //   156: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*     */     //   159: checkcast ai/grazie/utils/json/JSON
/*     */     //   162: astore #9
/*     */     //   164: iconst_0
/*     */     //   165: istore #10
/*     */     //   167: aload #5
/*     */     //   169: aload #6
/*     */     //   171: aload #7
/*     */     //   173: getstatic ai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$LicenseV2$Request.Companion : Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$LicenseV2$Request$Companion;
/*     */     //   176: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   179: aload #8
/*     */     //   181: aload #9
/*     */     //   183: aload #12
/*     */     //   185: aload #12
/*     */     //   187: iconst_1
/*     */     //   188: putfield label : I
/*     */     //   191: invokestatic sendAndGet : (Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   194: dup
/*     */     //   195: aload #13
/*     */     //   197: if_acmpne -> 213
/*     */     //   200: aload #13
/*     */     //   202: areturn
/*     */     //   203: iconst_0
/*     */     //   204: istore #10
/*     */     //   206: aload #11
/*     */     //   208: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   211: aload #11
/*     */     //   213: nop
/*     */     //   214: checkcast ai/grazie/client/common/model/HTTPResponse
/*     */     //   217: astore #5
/*     */     //   219: nop
/*     */     //   220: getstatic ai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$LicenseV2$Response.Companion : Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$LicenseV2$Response$Companion;
/*     */     //   223: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   226: astore #6
/*     */     //   228: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*     */     //   231: checkcast ai/grazie/utils/json/JSON
/*     */     //   234: astore #7
/*     */     //   236: iconst_0
/*     */     //   237: istore #8
/*     */     //   239: aload #7
/*     */     //   241: aload #6
/*     */     //   243: checkcast kotlinx/serialization/DeserializationStrategy
/*     */     //   246: aload #5
/*     */     //   248: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   251: dup
/*     */     //   252: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   255: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   258: checkcast ai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$LicenseV2$Response
/*     */     //   261: astore #4
/*     */     //   263: new ai/grazie/api/gateway/client/api/AuthJBAInfo
/*     */     //   266: dup
/*     */     //   267: aload #4
/*     */     //   269: invokevirtual getState : ()Lai/grazie/model/auth/GrazieUserState;
/*     */     //   272: aload #4
/*     */     //   274: invokevirtual getToken : ()Ljava/lang/String;
/*     */     //   277: invokespecial <init> : (Lai/grazie/model/auth/GrazieUserState;Ljava/lang/String;)V
/*     */     //   280: areturn
/*     */     //   281: new java/lang/IllegalStateException
/*     */     //   284: dup
/*     */     //   285: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   287: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   290: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #161	-> 60
/*     */     //   #162	-> 93
/*     */     //   #163	-> 99
/*     */     //   #164	-> 119
/*     */     //   #165	-> 136
/*     */     //   #162	-> 155
/*     */     //   #227	-> 156
/*     */     //   #227	-> 156
/*     */     //   #231	-> 156
/*     */     //   #227	-> 164
/*     */     //   #233	-> 167
/*     */     //   #161	-> 200
/*     */     //   #233	-> 213
/*     */     //   #166	-> 219
/*     */     //   #234	-> 220
/*     */     //   #235	-> 239
/*     */     //   #166	-> 258
/*     */     //   #162	-> 261
/*     */     //   #167	-> 263
/*     */     //   #161	-> 281
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	62	0	this	Lai/grazie/api/gateway/client/api/AuthAPIClient;
/*     */     //   93	62	1	jwtToken	Ljava/lang/String;
/*     */     //   93	43	2	licenseID	Ljava/lang/String;
/*     */     //   263	18	4	response	Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$LicenseV2$Response;
/*     */     //   99	95	5	$this$sendAndGet_u24default$iv	Lai/grazie/client/common/SuspendableHTTPClient;
/*     */     //   219	39	5	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*     */     //   119	75	6	url$iv	Ljava/lang/String;
/*     */     //   228	30	6	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */     //   136	58	7	content$iv	Ljava/lang/Object;
/*     */     //   236	22	7	json$iv	Lai/grazie/utils/json/JSON;
/*     */     //   155	39	8	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   164	30	9	json$iv	Lai/grazie/utils/json/JSON;
/*     */     //   167	36	10	$i$f$sendAndGet	I
/*     */     //   239	19	8	$i$f$get	I
/*     */     //   0	291	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	231	12	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	224	11	$result	Ljava/lang/Object;
/*     */     //   206	8	10	$i$f$sendAndGet	I
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
/*     */   private final HeaderCollection buildAuthHeader(String token) {
/* 171 */     Pair[] arrayOfPair = new Pair[1]; arrayOfPair[0] = TuplesKt.to("Authorization", CollectionsKt.listOf("Bearer " + token)); return HeaderCollectionKt.of(HeaderCollection.Companion, arrayOfPair);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AuthAPIClient.kt", l = {183}, i = {}, s = {}, n = {}, m = "getAccess", c = "ai.grazie.api.gateway.client.api.AuthAPIClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class AuthAPIClient$getAccess$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     AuthAPIClient$getAccess$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AuthAPIClient.this.getAccess(null, null, (Continuation<? super AuthJBAInfo>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AuthAPIClient.kt", l = {183}, i = {}, s = {}, n = {}, m = "getAccessV2", c = "ai.grazie.api.gateway.client.api.AuthAPIClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class AuthAPIClient$getAccessV2$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     AuthAPIClient$getAccessV2$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AuthAPIClient.this.getAccessV2(null, null, (Continuation<? super AuthJBAInfo>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AuthAPIClient.kt", l = {180}, i = {}, s = {}, n = {}, m = "refresh", c = "ai.grazie.api.gateway.client.api.AuthAPIClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class AuthAPIClient$refresh$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     AuthAPIClient$refresh$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AuthAPIClient.this.refresh((Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AuthAPIClient.kt", l = {180}, i = {}, s = {}, n = {}, m = "refreshV3", c = "ai.grazie.api.gateway.client.api.AuthAPIClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class AuthAPIClient$refreshV3$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     AuthAPIClient$refreshV3$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AuthAPIClient.this.refreshV3((Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AuthAPIClient.kt", l = {96}, i = {}, s = {}, n = {}, m = "register", c = "ai.grazie.api.gateway.client.api.AuthAPIClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class AuthAPIClient$register$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     AuthAPIClient$register$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AuthAPIClient.this.register(null, (Continuation<? super GrazieUserState>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AuthAPIClient.kt", l = {182}, i = {0}, s = {"L$0"}, n = {"json$iv"}, m = "userInfo", c = "ai.grazie.api.gateway.client.api.AuthAPIClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class AuthAPIClient$userInfo$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     AuthAPIClient$userInfo$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AuthAPIClient.this.userInfo(null, (Continuation<? super GrazieUserState>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AuthAPIClient.kt", l = {180}, i = {}, s = {}, n = {}, m = "verify", c = "ai.grazie.api.gateway.client.api.AuthAPIClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class AuthAPIClient$verify$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     AuthAPIClient$verify$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AuthAPIClient.this.verify((Continuation<? super Timestamp>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AuthAPIClient.kt", l = {180}, i = {}, s = {}, n = {}, m = "verifyV3", c = "ai.grazie.api.gateway.client.api.AuthAPIClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class AuthAPIClient$verifyV3$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     AuthAPIClient$verifyV3$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AuthAPIClient.this.verifyV3((Continuation<? super Timestamp>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\AuthAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */