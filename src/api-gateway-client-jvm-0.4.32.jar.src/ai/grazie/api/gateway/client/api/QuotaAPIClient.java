/*    */ package ai.grazie.api.gateway.client.api;
/*    */ 
/*    */ import ai.grazie.client.common.logging.AnnotationLogger;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B/\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013¢\006\002\020\fJ\024\020\021\032\b\022\004\022\0020\0230\022H@¢\006\002\020\024J\016\020\025\032\0020\026H@¢\006\002\020\024J\016\020\027\032\0020\030H@¢\006\002\020\024J\016\020\031\032\0020\032H@¢\006\002\020\024R\032\020\n\032\0020\013X\016¢\006\016\n\000\032\004\b\r\020\016\"\004\b\017\020\020¨\006\033"}, d2 = {"Lai/grazie/api/gateway/client/api/QuotaAPIClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "serverUrl", "", "authType", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "annotationLogger", "Lai/grazie/client/common/logging/AnnotationLogger;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;Lai/grazie/client/common/logging/AnnotationLogger;)V", "getAnnotationLogger", "()Lai/grazie/client/common/logging/AnnotationLogger;", "setAnnotationLogger", "(Lai/grazie/client/common/logging/AnnotationLogger;)V", "extensions", "", "Lai/grazie/quota/QuotaExtension;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "Lai/grazie/quota/Quota;", "refill", "Lai/grazie/quota/QuotaRefill;", "tariff", "Lai/grazie/quota/QuotaTariff;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nQuotaAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuotaAPIClient.kt\nai/grazie/api/gateway/client/api/QuotaAPIClient\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 HTTPResponseExtensions.kt\nai/grazie/client/common/model/HTTPResponseExtensionsKt\n*L\n1#1,33:1\n69#2,6:34\n69#2,6:42\n69#2,6:50\n69#2,6:58\n7#3,2:40\n7#3,2:48\n7#3,2:56\n7#3,2:64\n*S KotlinDebug\n*F\n+ 1 QuotaAPIClient.kt\nai/grazie/api/gateway/client/api/QuotaAPIClient\n*L\n18#1:34,6\n22#1:42,6\n26#1:50,6\n30#1:58,6\n18#1:40,2\n22#1:48,2\n26#1:56,2\n30#1:64,2\n*E\n"})
/*    */ public final class QuotaAPIClient extends SuspendableCloudClient {
/*    */   @NotNull
/* 14 */   public AnnotationLogger getAnnotationLogger() { return this.annotationLogger; } @NotNull private AnnotationLogger annotationLogger; public void setAnnotationLogger(@NotNull AnnotationLogger <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.annotationLogger = <set-?>; } public QuotaAPIClient(@NotNull String serverUrl, @NotNull AuthType authType, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json, @NotNull AnnotationLogger annotationLogger) {
/* 15 */     super(serverUrl, authType, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */     this.annotationLogger = annotationLogger;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object get(@NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/QuotaAPIClient$get$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_1
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/QuotaAPIClient$get$1
/*    */     //   11: astore #7
/*    */     //   13: aload #7
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #7
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/api/gateway/client/api/QuotaAPIClient$get$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_1
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/QuotaAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #7
/*    */     //   50: aload #7
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #6
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #8
/*    */     //   62: aload #7
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 210, 0 -> 88, 1 -> 152
/*    */     //   88: aload #6
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: getstatic ai/grazie/api/gateway/api/QuotaAPI$Get.INSTANCE : Lai/grazie/api/gateway/api/QuotaAPI$Get;
/*    */     //   96: checkcast ai/grazie/model/cloud/API
/*    */     //   99: astore_2
/*    */     //   100: new ai/grazie/client/common/model/RequestOptions
/*    */     //   103: dup
/*    */     //   104: aconst_null
/*    */     //   105: aconst_null
/*    */     //   106: iconst_3
/*    */     //   107: aconst_null
/*    */     //   108: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   111: astore_3
/*    */     //   112: iconst_0
/*    */     //   113: istore #4
/*    */     //   115: aload_0
/*    */     //   116: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   119: new ai/grazie/api/gateway/client/api/QuotaAPIClient$get$$inlined$sendAndGet$default$1
/*    */     //   122: dup
/*    */     //   123: aload_2
/*    */     //   124: aload_3
/*    */     //   125: aconst_null
/*    */     //   126: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   129: checkcast kotlin/jvm/functions/Function2
/*    */     //   132: aload #7
/*    */     //   134: aload #7
/*    */     //   136: iconst_1
/*    */     //   137: putfield label : I
/*    */     //   140: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   143: dup
/*    */     //   144: aload #8
/*    */     //   146: if_acmpne -> 162
/*    */     //   149: aload #8
/*    */     //   151: areturn
/*    */     //   152: iconst_0
/*    */     //   153: istore #4
/*    */     //   155: aload #6
/*    */     //   157: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   160: aload #6
/*    */     //   162: nop
/*    */     //   163: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   166: astore_2
/*    */     //   167: nop
/*    */     //   168: getstatic ai/grazie/api/gateway/api/QuotaAPI$Get$Response.Companion : Lai/grazie/api/gateway/api/QuotaAPI$Get$Response$Companion;
/*    */     //   171: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   174: astore_3
/*    */     //   175: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   178: checkcast ai/grazie/utils/json/JSON
/*    */     //   181: astore #4
/*    */     //   183: iconst_0
/*    */     //   184: istore #5
/*    */     //   186: aload #4
/*    */     //   188: aload_3
/*    */     //   189: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   192: aload_2
/*    */     //   193: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   196: dup
/*    */     //   197: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   200: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   203: checkcast ai/grazie/api/gateway/api/QuotaAPI$Get$Response
/*    */     //   206: invokevirtual getCurrent : ()Lai/grazie/quota/Quota;
/*    */     //   209: areturn
/*    */     //   210: new java/lang/IllegalStateException
/*    */     //   213: dup
/*    */     //   214: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   216: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   219: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #17	-> 60
/*    */     //   #18	-> 93
/*    */     //   #34	-> 100
/*    */     //   #36	-> 100
/*    */     //   #34	-> 112
/*    */     //   #37	-> 115
/*    */     //   #17	-> 149
/*    */     //   #39	-> 162
/*    */     //   #18	-> 167
/*    */     //   #40	-> 168
/*    */     //   #41	-> 186
/*    */     //   #18	-> 206
/*    */     //   #17	-> 210
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	50	0	this	Lai/grazie/api/gateway/client/api/QuotaAPIClient;
/*    */     //   100	43	2	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   167	36	2	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   112	31	3	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   175	28	3	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   183	20	4	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   115	37	4	$i$f$sendAndGet	I
/*    */     //   186	17	5	$i$f$get	I
/*    */     //   0	220	1	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	160	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	153	6	$result	Ljava/lang/Object;
/*    */     //   155	8	4	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object refill(@NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/QuotaAPIClient$refill$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_1
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/QuotaAPIClient$refill$1
/*    */     //   11: astore #7
/*    */     //   13: aload #7
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #7
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/api/gateway/client/api/QuotaAPIClient$refill$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_1
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/QuotaAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #7
/*    */     //   50: aload #7
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #6
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #8
/*    */     //   62: aload #7
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 210, 0 -> 88, 1 -> 152
/*    */     //   88: aload #6
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: getstatic ai/grazie/api/gateway/api/QuotaAPI$Metadata$Refill.INSTANCE : Lai/grazie/api/gateway/api/QuotaAPI$Metadata$Refill;
/*    */     //   96: checkcast ai/grazie/model/cloud/API
/*    */     //   99: astore_2
/*    */     //   100: new ai/grazie/client/common/model/RequestOptions
/*    */     //   103: dup
/*    */     //   104: aconst_null
/*    */     //   105: aconst_null
/*    */     //   106: iconst_3
/*    */     //   107: aconst_null
/*    */     //   108: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   111: astore_3
/*    */     //   112: iconst_0
/*    */     //   113: istore #4
/*    */     //   115: aload_0
/*    */     //   116: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   119: new ai/grazie/api/gateway/client/api/QuotaAPIClient$refill$$inlined$sendAndGet$default$1
/*    */     //   122: dup
/*    */     //   123: aload_2
/*    */     //   124: aload_3
/*    */     //   125: aconst_null
/*    */     //   126: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   129: checkcast kotlin/jvm/functions/Function2
/*    */     //   132: aload #7
/*    */     //   134: aload #7
/*    */     //   136: iconst_1
/*    */     //   137: putfield label : I
/*    */     //   140: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   143: dup
/*    */     //   144: aload #8
/*    */     //   146: if_acmpne -> 162
/*    */     //   149: aload #8
/*    */     //   151: areturn
/*    */     //   152: iconst_0
/*    */     //   153: istore #4
/*    */     //   155: aload #6
/*    */     //   157: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   160: aload #6
/*    */     //   162: nop
/*    */     //   163: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   166: astore_2
/*    */     //   167: nop
/*    */     //   168: getstatic ai/grazie/api/gateway/api/QuotaAPI$Metadata$Refill$Response.Companion : Lai/grazie/api/gateway/api/QuotaAPI$Metadata$Refill$Response$Companion;
/*    */     //   171: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   174: astore_3
/*    */     //   175: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   178: checkcast ai/grazie/utils/json/JSON
/*    */     //   181: astore #4
/*    */     //   183: iconst_0
/*    */     //   184: istore #5
/*    */     //   186: aload #4
/*    */     //   188: aload_3
/*    */     //   189: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   192: aload_2
/*    */     //   193: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   196: dup
/*    */     //   197: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   200: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   203: checkcast ai/grazie/api/gateway/api/QuotaAPI$Metadata$Refill$Response
/*    */     //   206: invokevirtual getCurrent : ()Lai/grazie/quota/QuotaRefill;
/*    */     //   209: areturn
/*    */     //   210: new java/lang/IllegalStateException
/*    */     //   213: dup
/*    */     //   214: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   216: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   219: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #21	-> 60
/*    */     //   #22	-> 93
/*    */     //   #42	-> 100
/*    */     //   #44	-> 100
/*    */     //   #42	-> 112
/*    */     //   #45	-> 115
/*    */     //   #21	-> 149
/*    */     //   #47	-> 162
/*    */     //   #22	-> 167
/*    */     //   #48	-> 168
/*    */     //   #49	-> 186
/*    */     //   #22	-> 206
/*    */     //   #21	-> 210
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	50	0	this	Lai/grazie/api/gateway/client/api/QuotaAPIClient;
/*    */     //   100	43	2	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   167	36	2	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   112	31	3	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   175	28	3	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   183	20	4	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   115	37	4	$i$f$sendAndGet	I
/*    */     //   186	17	5	$i$f$get	I
/*    */     //   0	220	1	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	160	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	153	6	$result	Ljava/lang/Object;
/*    */     //   155	8	4	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object tariff(@NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/QuotaAPIClient$tariff$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_1
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/QuotaAPIClient$tariff$1
/*    */     //   11: astore #7
/*    */     //   13: aload #7
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #7
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/api/gateway/client/api/QuotaAPIClient$tariff$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_1
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/QuotaAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #7
/*    */     //   50: aload #7
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #6
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #8
/*    */     //   62: aload #7
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 210, 0 -> 88, 1 -> 152
/*    */     //   88: aload #6
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: getstatic ai/grazie/api/gateway/api/QuotaAPI$Metadata$Tariff.INSTANCE : Lai/grazie/api/gateway/api/QuotaAPI$Metadata$Tariff;
/*    */     //   96: checkcast ai/grazie/model/cloud/API
/*    */     //   99: astore_2
/*    */     //   100: new ai/grazie/client/common/model/RequestOptions
/*    */     //   103: dup
/*    */     //   104: aconst_null
/*    */     //   105: aconst_null
/*    */     //   106: iconst_3
/*    */     //   107: aconst_null
/*    */     //   108: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   111: astore_3
/*    */     //   112: iconst_0
/*    */     //   113: istore #4
/*    */     //   115: aload_0
/*    */     //   116: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   119: new ai/grazie/api/gateway/client/api/QuotaAPIClient$tariff$$inlined$sendAndGet$default$1
/*    */     //   122: dup
/*    */     //   123: aload_2
/*    */     //   124: aload_3
/*    */     //   125: aconst_null
/*    */     //   126: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   129: checkcast kotlin/jvm/functions/Function2
/*    */     //   132: aload #7
/*    */     //   134: aload #7
/*    */     //   136: iconst_1
/*    */     //   137: putfield label : I
/*    */     //   140: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   143: dup
/*    */     //   144: aload #8
/*    */     //   146: if_acmpne -> 162
/*    */     //   149: aload #8
/*    */     //   151: areturn
/*    */     //   152: iconst_0
/*    */     //   153: istore #4
/*    */     //   155: aload #6
/*    */     //   157: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   160: aload #6
/*    */     //   162: nop
/*    */     //   163: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   166: astore_2
/*    */     //   167: nop
/*    */     //   168: getstatic ai/grazie/api/gateway/api/QuotaAPI$Metadata$Tariff$Response.Companion : Lai/grazie/api/gateway/api/QuotaAPI$Metadata$Tariff$Response$Companion;
/*    */     //   171: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   174: astore_3
/*    */     //   175: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   178: checkcast ai/grazie/utils/json/JSON
/*    */     //   181: astore #4
/*    */     //   183: iconst_0
/*    */     //   184: istore #5
/*    */     //   186: aload #4
/*    */     //   188: aload_3
/*    */     //   189: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   192: aload_2
/*    */     //   193: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   196: dup
/*    */     //   197: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   200: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   203: checkcast ai/grazie/api/gateway/api/QuotaAPI$Metadata$Tariff$Response
/*    */     //   206: invokevirtual getCurrent : ()Lai/grazie/quota/QuotaTariff;
/*    */     //   209: areturn
/*    */     //   210: new java/lang/IllegalStateException
/*    */     //   213: dup
/*    */     //   214: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   216: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   219: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #25	-> 60
/*    */     //   #26	-> 93
/*    */     //   #50	-> 100
/*    */     //   #52	-> 100
/*    */     //   #50	-> 112
/*    */     //   #53	-> 115
/*    */     //   #25	-> 149
/*    */     //   #55	-> 162
/*    */     //   #26	-> 167
/*    */     //   #56	-> 168
/*    */     //   #57	-> 186
/*    */     //   #26	-> 206
/*    */     //   #25	-> 210
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	50	0	this	Lai/grazie/api/gateway/client/api/QuotaAPIClient;
/*    */     //   100	43	2	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   167	36	2	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   112	31	3	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   175	28	3	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   183	20	4	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   115	37	4	$i$f$sendAndGet	I
/*    */     //   186	17	5	$i$f$get	I
/*    */     //   0	220	1	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	160	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	153	6	$result	Ljava/lang/Object;
/*    */     //   155	8	4	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object extensions(@NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/QuotaAPIClient$extensions$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_1
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/QuotaAPIClient$extensions$1
/*    */     //   11: astore #7
/*    */     //   13: aload #7
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #7
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/api/gateway/client/api/QuotaAPIClient$extensions$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_1
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/QuotaAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #7
/*    */     //   50: aload #7
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #6
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #8
/*    */     //   62: aload #7
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 210, 0 -> 88, 1 -> 152
/*    */     //   88: aload #6
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: getstatic ai/grazie/api/gateway/api/QuotaAPI$Metadata$Extensions.INSTANCE : Lai/grazie/api/gateway/api/QuotaAPI$Metadata$Extensions;
/*    */     //   96: checkcast ai/grazie/model/cloud/API
/*    */     //   99: astore_2
/*    */     //   100: new ai/grazie/client/common/model/RequestOptions
/*    */     //   103: dup
/*    */     //   104: aconst_null
/*    */     //   105: aconst_null
/*    */     //   106: iconst_3
/*    */     //   107: aconst_null
/*    */     //   108: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   111: astore_3
/*    */     //   112: iconst_0
/*    */     //   113: istore #4
/*    */     //   115: aload_0
/*    */     //   116: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   119: new ai/grazie/api/gateway/client/api/QuotaAPIClient$extensions$$inlined$sendAndGet$default$1
/*    */     //   122: dup
/*    */     //   123: aload_2
/*    */     //   124: aload_3
/*    */     //   125: aconst_null
/*    */     //   126: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   129: checkcast kotlin/jvm/functions/Function2
/*    */     //   132: aload #7
/*    */     //   134: aload #7
/*    */     //   136: iconst_1
/*    */     //   137: putfield label : I
/*    */     //   140: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   143: dup
/*    */     //   144: aload #8
/*    */     //   146: if_acmpne -> 162
/*    */     //   149: aload #8
/*    */     //   151: areturn
/*    */     //   152: iconst_0
/*    */     //   153: istore #4
/*    */     //   155: aload #6
/*    */     //   157: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   160: aload #6
/*    */     //   162: nop
/*    */     //   163: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   166: astore_2
/*    */     //   167: nop
/*    */     //   168: getstatic ai/grazie/api/gateway/api/QuotaAPI$Metadata$Extensions$Response.Companion : Lai/grazie/api/gateway/api/QuotaAPI$Metadata$Extensions$Response$Companion;
/*    */     //   171: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   174: astore_3
/*    */     //   175: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   178: checkcast ai/grazie/utils/json/JSON
/*    */     //   181: astore #4
/*    */     //   183: iconst_0
/*    */     //   184: istore #5
/*    */     //   186: aload #4
/*    */     //   188: aload_3
/*    */     //   189: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   192: aload_2
/*    */     //   193: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   196: dup
/*    */     //   197: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   200: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   203: checkcast ai/grazie/api/gateway/api/QuotaAPI$Metadata$Extensions$Response
/*    */     //   206: invokevirtual getExtensions : ()Ljava/util/List;
/*    */     //   209: areturn
/*    */     //   210: new java/lang/IllegalStateException
/*    */     //   213: dup
/*    */     //   214: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   216: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   219: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #29	-> 60
/*    */     //   #30	-> 93
/*    */     //   #58	-> 100
/*    */     //   #60	-> 100
/*    */     //   #58	-> 112
/*    */     //   #61	-> 115
/*    */     //   #29	-> 149
/*    */     //   #63	-> 162
/*    */     //   #30	-> 167
/*    */     //   #64	-> 168
/*    */     //   #65	-> 186
/*    */     //   #30	-> 206
/*    */     //   #29	-> 210
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	50	0	this	Lai/grazie/api/gateway/client/api/QuotaAPIClient;
/*    */     //   100	43	2	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   167	36	2	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   112	31	3	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   175	28	3	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   183	20	4	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   115	37	4	$i$f$sendAndGet	I
/*    */     //   186	17	5	$i$f$get	I
/*    */     //   0	220	1	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	160	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	153	6	$result	Ljava/lang/Object;
/*    */     //   155	8	4	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "QuotaAPIClient.kt", l = {37}, i = {}, s = {}, n = {}, m = "extensions", c = "ai.grazie.api.gateway.client.api.QuotaAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class QuotaAPIClient$extensions$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     QuotaAPIClient$extensions$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return QuotaAPIClient.this.extensions((Continuation<? super List<QuotaExtension>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "QuotaAPIClient.kt", l = {37}, i = {}, s = {}, n = {}, m = "get", c = "ai.grazie.api.gateway.client.api.QuotaAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class QuotaAPIClient$get$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     QuotaAPIClient$get$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return QuotaAPIClient.this.get((Continuation<? super Quota>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "QuotaAPIClient.kt", l = {37}, i = {}, s = {}, n = {}, m = "refill", c = "ai.grazie.api.gateway.client.api.QuotaAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class QuotaAPIClient$refill$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     QuotaAPIClient$refill$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return QuotaAPIClient.this.refill((Continuation<? super QuotaRefill>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "QuotaAPIClient.kt", l = {37}, i = {}, s = {}, n = {}, m = "tariff", c = "ai.grazie.api.gateway.client.api.QuotaAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class QuotaAPIClient$tariff$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     QuotaAPIClient$tariff$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return QuotaAPIClient.this.tariff((Continuation<? super QuotaTariff>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\QuotaAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */