/*    */ package ai.grazie.api.gateway.client.api.meta;
/*    */ 
/*    */ import ai.grazie.client.common.logging.AnnotationLogger;
/*    */ import ai.grazie.model.llm.profile.LLMProfileID;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000x\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020 \n\002\b\005\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\030\0002\0020\0012\0020\002B/\022\006\020\003\032\0020\004\022\b\020\005\032\004\030\0010\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n\022\006\020\013\032\0020\f¢\006\002\020\rJ@\020\022\032\b\022\004\022\0020\0240\0232\006\020\025\032\0020\0042\006\020\026\032\0020\0272\006\020\030\032\0020\0042\b\020\031\032\004\030\0010\0322\b\020\033\032\004\030\0010\004H@¢\006\002\020\034J0\020\035\032\0020\0362\f\020\037\032\b\022\004\022\0020\0040 2\b\020!\032\004\030\0010\0042\b\020\"\032\004\030\0010\004H@¢\006\002\020#J\034\020$\032\b\022\004\022\0020\0040 2\006\020%\032\0020&H@¢\006\002\020'J@\020(\032\b\022\004\022\0020)0 2\006\020\025\032\0020\0042\006\020\026\032\0020\0272\006\020\030\032\0020\0042\b\020\031\032\004\030\0010\0322\b\020\033\032\004\030\0010\004H@¢\006\002\020\034JT\020*\032\b\022\004\022\0020)0 2\006\020\025\032\0020\0042\006\020\026\032\0020\0272\006\020+\032\0020\0042\022\020,\032\016\022\n\022\b\022\004\022\0020-0 0 2\b\020\031\032\004\030\0010\0322\b\020\033\032\004\030\0010\004H@¢\006\002\020.J2\020/\032\002002\006\020\025\032\0020\0042\006\020\026\032\0020\0272\b\020!\032\004\030\0010\0042\b\020\"\032\004\030\0010\004H@¢\006\002\0201R\032\020\013\032\0020\fX\016¢\006\016\n\000\032\004\b\016\020\017\"\004\b\020\020\021¨\0062"}, d2 = {"Lai/grazie/api/gateway/client/api/meta/QaAPIClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "Lai/grazie/qa/SuspendableQuestionAnsweringService;", "server", "", "authType", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "annotationLogger", "Lai/grazie/client/common/logging/AnnotationLogger;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;Lai/grazie/client/common/logging/AnnotationLogger;)V", "getAnnotationLogger", "()Lai/grazie/client/common/logging/AnnotationLogger;", "setAnnotationLogger", "(Lai/grazie/client/common/logging/AnnotationLogger;)V", "answerStream", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/qa/QAAnswersChunk;", "query", "size", "", "dataSource", "profile", "Lai/grazie/model/llm/profile/LLMProfileID;", "context", "(Ljava/lang/String;ILjava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "extractWeb", "Lai/grazie/qa/ExtractWebResponse;", "urls", "", "parametersJson", "provider", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listSources", "showAll", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieve", "Lai/grazie/qa/QADocument;", "retrieveV2", "config", "prioritizedSources", "Lai/grazie/qa/PrioritizedSource;", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Lai/grazie/model/llm/profile/LLMProfileID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchWeb", "Lai/grazie/qa/SearchWebResponse;", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nQaAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QaAPIClient.kt\nai/grazie/api/gateway/client/api/meta/QaAPIClient\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n+ 4 JSON.kt\nai/grazie/utils/json/JSON\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 8 HTTPResponseExtensions.kt\nai/grazie/client/common/model/HTTPResponseExtensionsKt\n*L\n1#1,60:1\n77#2,8:61\n62#2,6:85\n62#2,6:93\n62#2,6:101\n62#2,6:109\n86#3:69\n87#3:71\n88#3,3:77\n28#4:70\n49#5:72\n51#5:76\n49#5:80\n51#5:84\n46#6:73\n51#6:75\n46#6:81\n51#6:83\n105#7:74\n105#7:82\n7#8,2:91\n7#8,2:99\n7#8,2:107\n7#8,2:115\n7#8,2:117\n*S KotlinDebug\n*F\n+ 1 QaAPIClient.kt\nai/grazie/api/gateway/client/api/meta/QaAPIClient\n*L\n21#1:61,8\n29#1:85,6\n41#1:93,6\n46#1:101,6\n50#1:109,6\n21#1:69\n21#1:71\n21#1:77,3\n21#1:70\n21#1:72\n21#1:76\n23#1:80\n23#1:84\n21#1:73\n21#1:75\n23#1:81\n23#1:83\n21#1:74\n23#1:82\n29#1:91,2\n41#1:99,2\n46#1:107,2\n50#1:115,2\n56#1:117,2\n*E\n"})
/*    */ public final class QaAPIClient extends SuspendableCloudClient implements SuspendableQuestionAnsweringService {
/*    */   @NotNull
/* 18 */   public AnnotationLogger getAnnotationLogger() { return this.annotationLogger; } @NotNull private AnnotationLogger annotationLogger; public void setAnnotationLogger(@NotNull AnnotationLogger <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.annotationLogger = <set-?>; } public QaAPIClient(@NotNull String server, @Nullable AuthType authType, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json, @NotNull AnnotationLogger annotationLogger) {
/* 19 */     super(server, authType, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */     this.annotationLogger = annotationLogger;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object answerStream(@NotNull String query, int size, @NotNull String dataSource, @Nullable LLMProfileID profile, @Nullable String context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #6
/*    */     //   2: instanceof ai/grazie/api/gateway/client/api/meta/QaAPIClient$answerStream$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #6
/*    */     //   10: checkcast ai/grazie/api/gateway/client/api/meta/QaAPIClient$answerStream$1
/*    */     //   13: astore #25
/*    */     //   15: aload #25
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #25
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new ai/grazie/api/gateway/client/api/meta/QaAPIClient$answerStream$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #6
/*    */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/meta/QaAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #25
/*    */     //   53: aload #25
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #24
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #26
/*    */     //   65: aload #25
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 425, 0 -> 92, 1 -> 256
/*    */     //   92: aload #24
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: getstatic ai/grazie/api/gateway/api/meta/QaAPI$Answer$V2.INSTANCE : Lai/grazie/api/gateway/api/meta/QaAPI$Answer$V2;
/*    */     //   100: checkcast ai/grazie/model/cloud/API
/*    */     //   103: astore #7
/*    */     //   105: new ai/grazie/api/gateway/api/meta/QaAPI$Answer$V2$Request
/*    */     //   108: dup
/*    */     //   109: aload_1
/*    */     //   110: iload_2
/*    */     //   111: aload_3
/*    */     //   112: aload #4
/*    */     //   114: aload #5
/*    */     //   116: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;Ljava/lang/String;)V
/*    */     //   119: astore #8
/*    */     //   121: nop
/*    */     //   122: getstatic ai/grazie/api/gateway/api/meta/QaAPI$Answer$V2$Response.Companion : Lai/grazie/api/gateway/api/meta/QaAPI$Answer$V2$Response$Companion;
/*    */     //   125: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   128: astore #9
/*    */     //   130: iconst_0
/*    */     //   131: istore #10
/*    */     //   133: new ai/grazie/client/common/model/RequestOptions
/*    */     //   136: dup
/*    */     //   137: aconst_null
/*    */     //   138: aconst_null
/*    */     //   139: iconst_3
/*    */     //   140: aconst_null
/*    */     //   141: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   144: astore #11
/*    */     //   146: aload_0
/*    */     //   147: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   150: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   153: astore #12
/*    */     //   155: iconst_0
/*    */     //   156: istore #13
/*    */     //   158: aload_0
/*    */     //   159: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   162: invokevirtual getHttpClient : ()Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   165: astore #14
/*    */     //   167: aload_0
/*    */     //   168: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   171: aload #7
/*    */     //   173: invokevirtual url : (Lai/grazie/model/cloud/API;)Ljava/lang/String;
/*    */     //   176: astore #15
/*    */     //   178: aload #11
/*    */     //   180: aload #7
/*    */     //   182: invokestatic withTimeout : (Lai/grazie/client/common/model/RequestOptions;Lai/grazie/model/cloud/API;)Lai/grazie/client/common/model/RequestOptions;
/*    */     //   185: astore #16
/*    */     //   187: iconst_0
/*    */     //   188: istore #17
/*    */     //   190: aload #14
/*    */     //   192: aload #15
/*    */     //   194: aload #12
/*    */     //   196: astore #18
/*    */     //   198: iconst_0
/*    */     //   199: istore #19
/*    */     //   201: aload #18
/*    */     //   203: getstatic ai/grazie/api/gateway/api/meta/QaAPI$Answer$V2$Request.Companion : Lai/grazie/api/gateway/api/meta/QaAPI$Answer$V2$Request$Companion;
/*    */     //   206: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   209: checkcast kotlinx/serialization/SerializationStrategy
/*    */     //   212: aload #8
/*    */     //   214: invokevirtual string : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   217: aload #16
/*    */     //   219: iconst_0
/*    */     //   220: aload #25
/*    */     //   222: aload #25
/*    */     //   224: aload #9
/*    */     //   226: putfield L$0 : Ljava/lang/Object;
/*    */     //   229: aload #25
/*    */     //   231: aload #12
/*    */     //   233: putfield L$1 : Ljava/lang/Object;
/*    */     //   236: aload #25
/*    */     //   238: iconst_1
/*    */     //   239: putfield label : I
/*    */     //   242: invokeinterface receiveContinuousSSE : (Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   247: dup
/*    */     //   248: aload #26
/*    */     //   250: if_acmpne -> 289
/*    */     //   253: aload #26
/*    */     //   255: areturn
/*    */     //   256: iconst_0
/*    */     //   257: istore #13
/*    */     //   259: iconst_0
/*    */     //   260: istore #17
/*    */     //   262: aload #25
/*    */     //   264: getfield L$1 : Ljava/lang/Object;
/*    */     //   267: checkcast ai/grazie/utils/json/JSON
/*    */     //   270: astore #12
/*    */     //   272: aload #25
/*    */     //   274: getfield L$0 : Ljava/lang/Object;
/*    */     //   277: checkcast kotlinx/serialization/KSerializer
/*    */     //   280: astore #9
/*    */     //   282: aload #24
/*    */     //   284: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   287: aload #24
/*    */     //   289: checkcast kotlinx/coroutines/flow/Flow
/*    */     //   292: astore #18
/*    */     //   294: iconst_0
/*    */     //   295: istore #19
/*    */     //   297: aload #18
/*    */     //   299: astore #20
/*    */     //   301: iconst_0
/*    */     //   302: istore #21
/*    */     //   304: iconst_0
/*    */     //   305: istore #22
/*    */     //   307: new ai/grazie/api/gateway/client/api/meta/QaAPIClient$answerStream$$inlined$receiveContinuousSSE$default$1
/*    */     //   310: dup
/*    */     //   311: aload #20
/*    */     //   313: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*    */     //   316: checkcast kotlinx/coroutines/flow/Flow
/*    */     //   319: nop
/*    */     //   320: nop
/*    */     //   321: invokestatic filterNotNull : (Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;
/*    */     //   324: astore #18
/*    */     //   326: iconst_0
/*    */     //   327: istore #19
/*    */     //   329: aload #18
/*    */     //   331: astore #20
/*    */     //   333: iconst_0
/*    */     //   334: istore #21
/*    */     //   336: iconst_0
/*    */     //   337: istore #22
/*    */     //   339: new ai/grazie/api/gateway/client/api/meta/QaAPIClient$answerStream$$inlined$receiveContinuousSSE$default$2
/*    */     //   342: dup
/*    */     //   343: aload #20
/*    */     //   345: aload #9
/*    */     //   347: aload #12
/*    */     //   349: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lkotlinx/serialization/KSerializer;Lai/grazie/utils/json/JSON;)V
/*    */     //   352: checkcast kotlinx/coroutines/flow/Flow
/*    */     //   355: nop
/*    */     //   356: nop
/*    */     //   357: astore #18
/*    */     //   359: getstatic ai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent.Companion : Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;
/*    */     //   362: astore #19
/*    */     //   364: iconst_0
/*    */     //   365: istore #20
/*    */     //   367: aload #18
/*    */     //   369: astore #21
/*    */     //   371: iconst_0
/*    */     //   372: istore #22
/*    */     //   374: iconst_0
/*    */     //   375: istore #23
/*    */     //   377: new ai/grazie/api/gateway/client/api/meta/QaAPIClient$answerStream$$inlined$receiveContinuousSSE$default$3
/*    */     //   380: dup
/*    */     //   381: aload #21
/*    */     //   383: aload #19
/*    */     //   385: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;)V
/*    */     //   388: checkcast kotlinx/coroutines/flow/Flow
/*    */     //   391: nop
/*    */     //   392: nop
/*    */     //   393: nop
/*    */     //   394: nop
/*    */     //   395: astore #7
/*    */     //   397: iconst_0
/*    */     //   398: istore #8
/*    */     //   400: aload #7
/*    */     //   402: astore #9
/*    */     //   404: iconst_0
/*    */     //   405: istore #10
/*    */     //   407: iconst_0
/*    */     //   408: istore #11
/*    */     //   410: new ai/grazie/api/gateway/client/api/meta/QaAPIClient$answerStream$$inlined$map$1
/*    */     //   413: dup
/*    */     //   414: aload #9
/*    */     //   416: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*    */     //   419: checkcast kotlinx/coroutines/flow/Flow
/*    */     //   422: nop
/*    */     //   423: nop
/*    */     //   424: areturn
/*    */     //   425: new java/lang/IllegalStateException
/*    */     //   428: dup
/*    */     //   429: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   431: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   434: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 63
/*    */     //   #22	-> 97
/*    */     //   #21	-> 121
/*    */     //   #61	-> 122
/*    */     //   #64	-> 122
/*    */     //   #61	-> 130
/*    */     //   #65	-> 130
/*    */     //   #61	-> 133
/*    */     //   #66	-> 133
/*    */     //   #61	-> 146
/*    */     //   #67	-> 146
/*    */     //   #61	-> 155
/*    */     //   #68	-> 158
/*    */     //   #69	-> 190
/*    */     //   #70	-> 201
/*    */     //   #69	-> 217
/*    */     //   #20	-> 253
/*    */     //   #71	-> 294
/*    */     //   #72	-> 297
/*    */     //   #73	-> 304
/*    */     //   #74	-> 307
/*    */     //   #75	-> 319
/*    */     //   #76	-> 320
/*    */     //   #77	-> 321
/*    */     //   #78	-> 326
/*    */     //   #72	-> 329
/*    */     //   #73	-> 336
/*    */     //   #74	-> 339
/*    */     //   #75	-> 355
/*    */     //   #76	-> 356
/*    */     //   #79	-> 359
/*    */     //   #72	-> 367
/*    */     //   #73	-> 374
/*    */     //   #74	-> 377
/*    */     //   #75	-> 391
/*    */     //   #76	-> 392
/*    */     //   #69	-> 393
/*    */     //   #68	-> 394
/*    */     //   #23	-> 397
/*    */     //   #80	-> 400
/*    */     //   #81	-> 407
/*    */     //   #82	-> 410
/*    */     //   #83	-> 422
/*    */     //   #84	-> 423
/*    */     //   #21	-> 424
/*    */     //   #20	-> 425
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	90	0	this	Lai/grazie/api/gateway/client/api/meta/QaAPIClient;
/*    */     //   97	24	1	query	Ljava/lang/String;
/*    */     //   97	24	2	size	I
/*    */     //   97	24	3	dataSource	Ljava/lang/String;
/*    */     //   97	24	4	profile	Lai/grazie/model/llm/profile/LLMProfileID;
/*    */     //   97	24	5	context	Ljava/lang/String;
/*    */     //   121	66	7	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   397	27	7	$this$map$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   121	96	8	content$iv	Ljava/lang/Object;
/*    */     //   130	126	9	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   282	113	9	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   404	19	9	$this$unsafeTransform$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   133	86	10	reconnect$iv	Z
/*    */     //   146	41	11	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   155	101	12	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   272	123	12	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   187	11	14	$this$receiveContinuousSSE$iv$iv	Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   187	11	15	url$iv$iv	Ljava/lang/String;
/*    */     //   187	32	16	options$iv$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   198	19	18	this_$iv$iv$iv	Lai/grazie/utils/json/JSON;
/*    */     //   294	27	18	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   326	31	18	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   359	34	18	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   301	19	20	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   333	23	20	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   371	21	21	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*    */     //   201	16	19	$i$f$string	I
/*    */     //   307	12	22	$i$f$unsafeFlow	I
/*    */     //   304	16	21	$i$f$unsafeTransform	I
/*    */     //   297	24	19	$i$f$map	I
/*    */     //   339	16	22	$i$f$unsafeFlow	I
/*    */     //   336	20	21	$i$f$unsafeTransform	I
/*    */     //   329	28	19	$i$f$map	I
/*    */     //   377	14	23	$i$f$unsafeFlow	I
/*    */     //   374	18	22	$i$f$unsafeTransform	I
/*    */     //   367	26	20	$i$f$map	I
/*    */     //   190	66	17	$i$f$receiveContinuousSSE	I
/*    */     //   158	98	13	$i$f$receiveContinuousSSE	I
/*    */     //   410	12	11	$i$f$unsafeFlow	I
/*    */     //   407	16	10	$i$f$unsafeTransform	I
/*    */     //   400	24	8	$i$f$map	I
/*    */     //   0	435	6	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	372	25	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	365	24	$result	Ljava/lang/Object;
/*    */     //   262	132	17	$i$f$receiveContinuousSSE	I
/*    */     //   259	136	13	$i$f$receiveContinuousSSE	I
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object retrieve(@NotNull String query, int size, @NotNull String dataSource, @Nullable LLMProfileID profile, @Nullable String context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #6
/*    */     //   2: instanceof ai/grazie/api/gateway/client/api/meta/QaAPIClient$retrieve$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #6
/*    */     //   10: checkcast ai/grazie/api/gateway/client/api/meta/QaAPIClient$retrieve$1
/*    */     //   13: astore #14
/*    */     //   15: aload #14
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #14
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new ai/grazie/api/gateway/client/api/meta/QaAPIClient$retrieve$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #6
/*    */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/meta/QaAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #14
/*    */     //   53: aload #14
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #13
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #15
/*    */     //   65: aload #14
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 255, 0 -> 92, 1 -> 189
/*    */     //   92: aload #13
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: getstatic ai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1.INSTANCE : Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1;
/*    */     //   100: checkcast ai/grazie/model/cloud/API
/*    */     //   103: astore #8
/*    */     //   105: new ai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1$Request
/*    */     //   108: dup
/*    */     //   109: aload_1
/*    */     //   110: iload_2
/*    */     //   111: aload_3
/*    */     //   112: aload #4
/*    */     //   114: aload #5
/*    */     //   116: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;Ljava/lang/String;)V
/*    */     //   119: astore #9
/*    */     //   121: new ai/grazie/client/common/model/RequestOptions
/*    */     //   124: dup
/*    */     //   125: aconst_null
/*    */     //   126: aconst_null
/*    */     //   127: iconst_3
/*    */     //   128: aconst_null
/*    */     //   129: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   132: astore #10
/*    */     //   134: aload_0
/*    */     //   135: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   138: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   141: astore #11
/*    */     //   143: iconst_0
/*    */     //   144: istore #12
/*    */     //   146: aload_0
/*    */     //   147: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   150: new ai/grazie/api/gateway/client/api/meta/QaAPIClient$retrieve$$inlined$sendAndGet$default$1
/*    */     //   153: dup
/*    */     //   154: aload #8
/*    */     //   156: aload #11
/*    */     //   158: aload #9
/*    */     //   160: aload #10
/*    */     //   162: aconst_null
/*    */     //   163: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/utils/json/JSON;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   166: checkcast kotlin/jvm/functions/Function2
/*    */     //   169: aload #14
/*    */     //   171: aload #14
/*    */     //   173: iconst_1
/*    */     //   174: putfield label : I
/*    */     //   177: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   180: dup
/*    */     //   181: aload #15
/*    */     //   183: if_acmpne -> 199
/*    */     //   186: aload #15
/*    */     //   188: areturn
/*    */     //   189: iconst_0
/*    */     //   190: istore #12
/*    */     //   192: aload #13
/*    */     //   194: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   197: aload #13
/*    */     //   199: nop
/*    */     //   200: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   203: astore #8
/*    */     //   205: nop
/*    */     //   206: getstatic ai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1$Response.Companion : Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1$Response$Companion;
/*    */     //   209: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   212: astore #9
/*    */     //   214: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   217: checkcast ai/grazie/utils/json/JSON
/*    */     //   220: astore #10
/*    */     //   222: iconst_0
/*    */     //   223: istore #11
/*    */     //   225: aload #10
/*    */     //   227: aload #9
/*    */     //   229: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   232: aload #8
/*    */     //   234: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   237: dup
/*    */     //   238: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   241: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   244: checkcast ai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1$Response
/*    */     //   247: astore #7
/*    */     //   249: aload #7
/*    */     //   251: invokevirtual getDocuments : ()Ljava/util/List;
/*    */     //   254: areturn
/*    */     //   255: new java/lang/IllegalStateException
/*    */     //   258: dup
/*    */     //   259: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   261: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   264: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #28	-> 63
/*    */     //   #29	-> 97
/*    */     //   #85	-> 121
/*    */     //   #88	-> 121
/*    */     //   #85	-> 134
/*    */     //   #89	-> 134
/*    */     //   #85	-> 143
/*    */     //   #90	-> 146
/*    */     //   #28	-> 186
/*    */     //   #90	-> 199
/*    */     //   #29	-> 205
/*    */     //   #91	-> 206
/*    */     //   #92	-> 225
/*    */     //   #29	-> 244
/*    */     //   #30	-> 249
/*    */     //   #28	-> 255
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	83	0	this	Lai/grazie/api/gateway/client/api/meta/QaAPIClient;
/*    */     //   97	24	1	query	Ljava/lang/String;
/*    */     //   97	24	2	size	I
/*    */     //   97	24	3	dataSource	Ljava/lang/String;
/*    */     //   97	24	4	profile	Lai/grazie/model/llm/profile/LLMProfileID;
/*    */     //   97	24	5	context	Ljava/lang/String;
/*    */     //   249	6	7	result	Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1$Response;
/*    */     //   121	59	8	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   205	39	8	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   121	59	9	content$iv	Ljava/lang/Object;
/*    */     //   214	30	9	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   134	46	10	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   222	22	10	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   143	37	11	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   146	43	12	$i$f$sendAndGet	I
/*    */     //   225	19	11	$i$f$get	I
/*    */     //   0	265	6	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	202	14	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	195	13	$result	Ljava/lang/Object;
/*    */     //   192	8	12	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object retrieveV2(@NotNull String query, int size, @NotNull String config, @NotNull List prioritizedSources, @Nullable LLMProfileID profile, @Nullable String context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #7
/*    */     //   2: instanceof ai/grazie/api/gateway/client/api/meta/QaAPIClient$retrieveV2$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #7
/*    */     //   10: checkcast ai/grazie/api/gateway/client/api/meta/QaAPIClient$retrieveV2$1
/*    */     //   13: astore #15
/*    */     //   15: aload #15
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #15
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new ai/grazie/api/gateway/client/api/meta/QaAPIClient$retrieveV2$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #7
/*    */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/meta/QaAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #15
/*    */     //   53: aload #15
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #14
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #16
/*    */     //   65: aload #15
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 257, 0 -> 92, 1 -> 191
/*    */     //   92: aload #14
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: getstatic ai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V2.INSTANCE : Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V2;
/*    */     //   100: checkcast ai/grazie/model/cloud/API
/*    */     //   103: astore #9
/*    */     //   105: new ai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V2$Request
/*    */     //   108: dup
/*    */     //   109: aload_1
/*    */     //   110: iload_2
/*    */     //   111: aload_3
/*    */     //   112: aload #4
/*    */     //   114: aload #5
/*    */     //   116: aload #6
/*    */     //   118: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Lai/grazie/model/llm/profile/LLMProfileID;Ljava/lang/String;)V
/*    */     //   121: astore #10
/*    */     //   123: new ai/grazie/client/common/model/RequestOptions
/*    */     //   126: dup
/*    */     //   127: aconst_null
/*    */     //   128: aconst_null
/*    */     //   129: iconst_3
/*    */     //   130: aconst_null
/*    */     //   131: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   134: astore #11
/*    */     //   136: aload_0
/*    */     //   137: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   140: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   143: astore #12
/*    */     //   145: iconst_0
/*    */     //   146: istore #13
/*    */     //   148: aload_0
/*    */     //   149: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   152: new ai/grazie/api/gateway/client/api/meta/QaAPIClient$retrieveV2$$inlined$sendAndGet$default$1
/*    */     //   155: dup
/*    */     //   156: aload #9
/*    */     //   158: aload #12
/*    */     //   160: aload #10
/*    */     //   162: aload #11
/*    */     //   164: aconst_null
/*    */     //   165: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/utils/json/JSON;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   168: checkcast kotlin/jvm/functions/Function2
/*    */     //   171: aload #15
/*    */     //   173: aload #15
/*    */     //   175: iconst_1
/*    */     //   176: putfield label : I
/*    */     //   179: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   182: dup
/*    */     //   183: aload #16
/*    */     //   185: if_acmpne -> 201
/*    */     //   188: aload #16
/*    */     //   190: areturn
/*    */     //   191: iconst_0
/*    */     //   192: istore #13
/*    */     //   194: aload #14
/*    */     //   196: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   199: aload #14
/*    */     //   201: nop
/*    */     //   202: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   205: astore #9
/*    */     //   207: nop
/*    */     //   208: getstatic ai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V2$Response.Companion : Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V2$Response$Companion;
/*    */     //   211: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   214: astore #10
/*    */     //   216: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   219: checkcast ai/grazie/utils/json/JSON
/*    */     //   222: astore #11
/*    */     //   224: iconst_0
/*    */     //   225: istore #12
/*    */     //   227: aload #11
/*    */     //   229: aload #10
/*    */     //   231: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   234: aload #9
/*    */     //   236: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   239: dup
/*    */     //   240: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   243: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   246: checkcast ai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V2$Response
/*    */     //   249: astore #8
/*    */     //   251: aload #8
/*    */     //   253: invokevirtual getDocuments : ()Ljava/util/List;
/*    */     //   256: areturn
/*    */     //   257: new java/lang/IllegalStateException
/*    */     //   260: dup
/*    */     //   261: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   263: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   266: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #33	-> 63
/*    */     //   #41	-> 97
/*    */     //   #93	-> 123
/*    */     //   #96	-> 123
/*    */     //   #93	-> 136
/*    */     //   #97	-> 136
/*    */     //   #93	-> 145
/*    */     //   #98	-> 148
/*    */     //   #33	-> 188
/*    */     //   #98	-> 201
/*    */     //   #41	-> 207
/*    */     //   #99	-> 208
/*    */     //   #100	-> 227
/*    */     //   #41	-> 246
/*    */     //   #42	-> 251
/*    */     //   #33	-> 257
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	85	0	this	Lai/grazie/api/gateway/client/api/meta/QaAPIClient;
/*    */     //   97	26	1	query	Ljava/lang/String;
/*    */     //   97	26	2	size	I
/*    */     //   97	26	3	config	Ljava/lang/String;
/*    */     //   97	26	4	prioritizedSources	Ljava/util/List;
/*    */     //   97	26	5	profile	Lai/grazie/model/llm/profile/LLMProfileID;
/*    */     //   97	26	6	context	Ljava/lang/String;
/*    */     //   251	6	8	result	Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V2$Response;
/*    */     //   123	59	9	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   207	39	9	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   123	59	10	content$iv	Ljava/lang/Object;
/*    */     //   216	30	10	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   136	46	11	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   224	22	11	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   145	37	12	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   148	43	13	$i$f$sendAndGet	I
/*    */     //   227	19	12	$i$f$get	I
/*    */     //   0	267	7	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	204	15	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	197	14	$result	Ljava/lang/Object;
/*    */     //   194	8	13	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object searchWeb(@NotNull String query, int size, @Nullable String parametersJson, @Nullable String provider, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #5
/*    */     //   2: instanceof ai/grazie/api/gateway/client/api/meta/QaAPIClient$searchWeb$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #5
/*    */     //   10: checkcast ai/grazie/api/gateway/client/api/meta/QaAPIClient$searchWeb$1
/*    */     //   13: astore #12
/*    */     //   15: aload #12
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #12
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new ai/grazie/api/gateway/client/api/meta/QaAPIClient$searchWeb$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #5
/*    */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/meta/QaAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #12
/*    */     //   53: aload #12
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #11
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #13
/*    */     //   65: aload #12
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 243, 0 -> 92, 1 -> 187
/*    */     //   92: aload #11
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: getstatic ai/grazie/api/gateway/api/meta/QaAPI$SearchWeb$V1.INSTANCE : Lai/grazie/api/gateway/api/meta/QaAPI$SearchWeb$V1;
/*    */     //   100: checkcast ai/grazie/model/cloud/API
/*    */     //   103: astore #6
/*    */     //   105: new ai/grazie/api/gateway/api/meta/QaAPI$SearchWeb$V1$Request
/*    */     //   108: dup
/*    */     //   109: aload_1
/*    */     //   110: iload_2
/*    */     //   111: aload_3
/*    */     //   112: aload #4
/*    */     //   114: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
/*    */     //   117: astore #7
/*    */     //   119: new ai/grazie/client/common/model/RequestOptions
/*    */     //   122: dup
/*    */     //   123: aconst_null
/*    */     //   124: aconst_null
/*    */     //   125: iconst_3
/*    */     //   126: aconst_null
/*    */     //   127: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   130: astore #8
/*    */     //   132: aload_0
/*    */     //   133: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   136: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   139: astore #9
/*    */     //   141: iconst_0
/*    */     //   142: istore #10
/*    */     //   144: aload_0
/*    */     //   145: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   148: new ai/grazie/api/gateway/client/api/meta/QaAPIClient$searchWeb$$inlined$sendAndGet$default$1
/*    */     //   151: dup
/*    */     //   152: aload #6
/*    */     //   154: aload #9
/*    */     //   156: aload #7
/*    */     //   158: aload #8
/*    */     //   160: aconst_null
/*    */     //   161: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/utils/json/JSON;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   164: checkcast kotlin/jvm/functions/Function2
/*    */     //   167: aload #12
/*    */     //   169: aload #12
/*    */     //   171: iconst_1
/*    */     //   172: putfield label : I
/*    */     //   175: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   178: dup
/*    */     //   179: aload #13
/*    */     //   181: if_acmpne -> 197
/*    */     //   184: aload #13
/*    */     //   186: areturn
/*    */     //   187: iconst_0
/*    */     //   188: istore #10
/*    */     //   190: aload #11
/*    */     //   192: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   195: aload #11
/*    */     //   197: nop
/*    */     //   198: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   201: astore #6
/*    */     //   203: nop
/*    */     //   204: getstatic ai/grazie/qa/SearchWebResponse.Companion : Lai/grazie/qa/SearchWebResponse$Companion;
/*    */     //   207: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   210: astore #7
/*    */     //   212: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   215: checkcast ai/grazie/utils/json/JSON
/*    */     //   218: astore #8
/*    */     //   220: iconst_0
/*    */     //   221: istore #9
/*    */     //   223: aload #8
/*    */     //   225: aload #7
/*    */     //   227: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   230: aload #6
/*    */     //   232: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   235: dup
/*    */     //   236: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   239: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   242: areturn
/*    */     //   243: new java/lang/IllegalStateException
/*    */     //   246: dup
/*    */     //   247: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   249: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   252: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #45	-> 63
/*    */     //   #46	-> 97
/*    */     //   #101	-> 119
/*    */     //   #104	-> 119
/*    */     //   #101	-> 132
/*    */     //   #105	-> 132
/*    */     //   #101	-> 141
/*    */     //   #106	-> 144
/*    */     //   #45	-> 184
/*    */     //   #106	-> 197
/*    */     //   #46	-> 203
/*    */     //   #107	-> 204
/*    */     //   #108	-> 223
/*    */     //   #46	-> 242
/*    */     //   #45	-> 243
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	81	0	this	Lai/grazie/api/gateway/client/api/meta/QaAPIClient;
/*    */     //   97	22	1	query	Ljava/lang/String;
/*    */     //   97	22	2	size	I
/*    */     //   97	22	3	parametersJson	Ljava/lang/String;
/*    */     //   97	22	4	provider	Ljava/lang/String;
/*    */     //   119	59	6	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   203	39	6	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   119	59	7	content$iv	Ljava/lang/Object;
/*    */     //   212	30	7	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   132	46	8	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   220	22	8	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   141	37	9	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   144	43	10	$i$f$sendAndGet	I
/*    */     //   223	19	9	$i$f$get	I
/*    */     //   0	253	5	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	190	12	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	183	11	$result	Ljava/lang/Object;
/*    */     //   190	8	10	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object extractWeb(@NotNull List urls, @Nullable String parametersJson, @Nullable String provider, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof ai/grazie/api/gateway/client/api/meta/QaAPIClient$extractWeb$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast ai/grazie/api/gateway/client/api/meta/QaAPIClient$extractWeb$1
/*    */     //   13: astore #11
/*    */     //   15: aload #11
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #11
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new ai/grazie/api/gateway/client/api/meta/QaAPIClient$extractWeb$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/meta/QaAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #11
/*    */     //   53: aload #11
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #10
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #12
/*    */     //   65: aload #11
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 241, 0 -> 92, 1 -> 185
/*    */     //   92: aload #10
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: getstatic ai/grazie/api/gateway/api/meta/QaAPI$ExtractWeb$V1.INSTANCE : Lai/grazie/api/gateway/api/meta/QaAPI$ExtractWeb$V1;
/*    */     //   100: checkcast ai/grazie/model/cloud/API
/*    */     //   103: astore #5
/*    */     //   105: new ai/grazie/api/gateway/api/meta/QaAPI$ExtractWeb$V1$Request
/*    */     //   108: dup
/*    */     //   109: aload_1
/*    */     //   110: aload_2
/*    */     //   111: aload_3
/*    */     //   112: invokespecial <init> : (Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
/*    */     //   115: astore #6
/*    */     //   117: new ai/grazie/client/common/model/RequestOptions
/*    */     //   120: dup
/*    */     //   121: aconst_null
/*    */     //   122: aconst_null
/*    */     //   123: iconst_3
/*    */     //   124: aconst_null
/*    */     //   125: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   128: astore #7
/*    */     //   130: aload_0
/*    */     //   131: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   134: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   137: astore #8
/*    */     //   139: iconst_0
/*    */     //   140: istore #9
/*    */     //   142: aload_0
/*    */     //   143: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   146: new ai/grazie/api/gateway/client/api/meta/QaAPIClient$extractWeb$$inlined$sendAndGet$default$1
/*    */     //   149: dup
/*    */     //   150: aload #5
/*    */     //   152: aload #8
/*    */     //   154: aload #6
/*    */     //   156: aload #7
/*    */     //   158: aconst_null
/*    */     //   159: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/utils/json/JSON;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   162: checkcast kotlin/jvm/functions/Function2
/*    */     //   165: aload #11
/*    */     //   167: aload #11
/*    */     //   169: iconst_1
/*    */     //   170: putfield label : I
/*    */     //   173: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   176: dup
/*    */     //   177: aload #12
/*    */     //   179: if_acmpne -> 195
/*    */     //   182: aload #12
/*    */     //   184: areturn
/*    */     //   185: iconst_0
/*    */     //   186: istore #9
/*    */     //   188: aload #10
/*    */     //   190: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   193: aload #10
/*    */     //   195: nop
/*    */     //   196: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   199: astore #5
/*    */     //   201: nop
/*    */     //   202: getstatic ai/grazie/qa/ExtractWebResponse.Companion : Lai/grazie/qa/ExtractWebResponse$Companion;
/*    */     //   205: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   208: astore #6
/*    */     //   210: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   213: checkcast ai/grazie/utils/json/JSON
/*    */     //   216: astore #7
/*    */     //   218: iconst_0
/*    */     //   219: istore #8
/*    */     //   221: aload #7
/*    */     //   223: aload #6
/*    */     //   225: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   228: aload #5
/*    */     //   230: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   233: dup
/*    */     //   234: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   237: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   240: areturn
/*    */     //   241: new java/lang/IllegalStateException
/*    */     //   244: dup
/*    */     //   245: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   247: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   250: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #49	-> 63
/*    */     //   #50	-> 97
/*    */     //   #109	-> 117
/*    */     //   #112	-> 117
/*    */     //   #109	-> 130
/*    */     //   #113	-> 130
/*    */     //   #109	-> 139
/*    */     //   #114	-> 142
/*    */     //   #49	-> 182
/*    */     //   #114	-> 195
/*    */     //   #50	-> 201
/*    */     //   #115	-> 202
/*    */     //   #116	-> 221
/*    */     //   #50	-> 240
/*    */     //   #49	-> 241
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	79	0	this	Lai/grazie/api/gateway/client/api/meta/QaAPIClient;
/*    */     //   97	20	1	urls	Ljava/util/List;
/*    */     //   97	20	2	parametersJson	Ljava/lang/String;
/*    */     //   97	20	3	provider	Ljava/lang/String;
/*    */     //   117	59	5	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   201	39	5	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   117	59	6	content$iv	Ljava/lang/Object;
/*    */     //   210	30	6	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   130	46	7	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   218	22	7	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   139	37	8	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   142	43	9	$i$f$sendAndGet	I
/*    */     //   221	19	8	$i$f$get	I
/*    */     //   0	251	4	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	188	11	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	181	10	$result	Ljava/lang/Object;
/*    */     //   188	8	9	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object listSources(boolean showAll, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/meta/QaAPIClient$listSources$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/meta/QaAPIClient$listSources$1
/*    */     //   11: astore #9
/*    */     //   13: aload #9
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #9
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/api/gateway/client/api/meta/QaAPIClient$listSources$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/meta/QaAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #9
/*    */     //   50: aload #9
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #8
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #10
/*    */     //   62: aload #9
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 209, 0 -> 88, 1 -> 151
/*    */     //   88: aload #8
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: new ai/grazie/api/gateway/api/meta/QaAPI$ListSources$RequestParams
/*    */     //   96: dup
/*    */     //   97: iload_1
/*    */     //   98: ifeq -> 105
/*    */     //   101: iconst_1
/*    */     //   102: goto -> 106
/*    */     //   105: iconst_0
/*    */     //   106: invokespecial <init> : (Z)V
/*    */     //   109: invokevirtual toQueryParameters : ()Lai/grazie/client/common/model/QueryParameterCollection;
/*    */     //   112: astore_3
/*    */     //   113: aload_0
/*    */     //   114: getstatic ai/grazie/api/gateway/api/meta/QaAPI$ListSources.INSTANCE : Lai/grazie/api/gateway/api/meta/QaAPI$ListSources;
/*    */     //   117: checkcast ai/grazie/model/cloud/API
/*    */     //   120: new ai/grazie/client/common/model/RequestOptions
/*    */     //   123: dup
/*    */     //   124: aconst_null
/*    */     //   125: aload_3
/*    */     //   126: iconst_1
/*    */     //   127: aconst_null
/*    */     //   128: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   131: aload #9
/*    */     //   133: aload #9
/*    */     //   135: iconst_1
/*    */     //   136: putfield label : I
/*    */     //   139: invokevirtual get : (Lai/grazie/model/cloud/API;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   142: dup
/*    */     //   143: aload #10
/*    */     //   145: if_acmpne -> 158
/*    */     //   148: aload #10
/*    */     //   150: areturn
/*    */     //   151: aload #8
/*    */     //   153: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   156: aload #8
/*    */     //   158: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   161: astore #4
/*    */     //   163: nop
/*    */     //   164: getstatic ai/grazie/api/gateway/api/meta/QaAPI$ListSources$Response.Companion : Lai/grazie/api/gateway/api/meta/QaAPI$ListSources$Response$Companion;
/*    */     //   167: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   170: astore #5
/*    */     //   172: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   175: checkcast ai/grazie/utils/json/JSON
/*    */     //   178: astore #6
/*    */     //   180: iconst_0
/*    */     //   181: istore #7
/*    */     //   183: aload #6
/*    */     //   185: aload #5
/*    */     //   187: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   190: aload #4
/*    */     //   192: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   195: dup
/*    */     //   196: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   199: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   202: checkcast ai/grazie/api/gateway/api/meta/QaAPI$ListSources$Response
/*    */     //   205: invokevirtual getSources : ()Ljava/util/List;
/*    */     //   208: areturn
/*    */     //   209: new java/lang/IllegalStateException
/*    */     //   212: dup
/*    */     //   213: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   215: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   218: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #53	-> 60
/*    */     //   #54	-> 93
/*    */     //   #55	-> 113
/*    */     //   #53	-> 148
/*    */     //   #56	-> 163
/*    */     //   #117	-> 164
/*    */     //   #118	-> 183
/*    */     //   #57	-> 205
/*    */     //   #55	-> 208
/*    */     //   #53	-> 209
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	49	0	this	Lai/grazie/api/gateway/client/api/meta/QaAPIClient;
/*    */     //   93	12	1	showAll	Z
/*    */     //   113	29	3	params	Lai/grazie/client/common/model/QueryParameterCollection;
/*    */     //   163	39	4	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   172	30	5	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   180	22	6	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   183	19	7	$i$f$get	I
/*    */     //   0	219	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	159	9	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	152	8	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "QaAPIClient.kt", l = {69}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"serializer$iv", "json$iv"}, m = "answerStream", c = "ai.grazie.api.gateway.client.api.meta.QaAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class QaAPIClient$answerStream$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     QaAPIClient$answerStream$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return QaAPIClient.this.answerStream(null, 0, null, null, null, (Continuation<? super Flow<QAAnswersChunk>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "QaAPIClient.kt", l = {66}, i = {}, s = {}, n = {}, m = "extractWeb", c = "ai.grazie.api.gateway.client.api.meta.QaAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class QaAPIClient$extractWeb$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     QaAPIClient$extractWeb$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return QaAPIClient.this.extractWeb(null, null, null, (Continuation<? super ExtractWebResponse>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "QaAPIClient.kt", l = {55}, i = {}, s = {}, n = {}, m = "listSources", c = "ai.grazie.api.gateway.client.api.meta.QaAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class QaAPIClient$listSources$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     QaAPIClient$listSources$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return QaAPIClient.this.listSources(false, (Continuation<? super List<String>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "QaAPIClient.kt", l = {66}, i = {}, s = {}, n = {}, m = "retrieve", c = "ai.grazie.api.gateway.client.api.meta.QaAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class QaAPIClient$retrieve$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     QaAPIClient$retrieve$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return QaAPIClient.this.retrieve(null, 0, null, null, null, (Continuation<? super List<QADocument>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "QaAPIClient.kt", l = {66}, i = {}, s = {}, n = {}, m = "retrieveV2", c = "ai.grazie.api.gateway.client.api.meta.QaAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class QaAPIClient$retrieveV2$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     QaAPIClient$retrieveV2$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return QaAPIClient.this.retrieveV2(null, 0, null, null, null, null, (Continuation<? super List<QADocument>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "QaAPIClient.kt", l = {66}, i = {}, s = {}, n = {}, m = "searchWeb", c = "ai.grazie.api.gateway.client.api.meta.QaAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class QaAPIClient$searchWeb$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     QaAPIClient$searchWeb$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return QaAPIClient.this.searchWeb(null, 0, null, null, (Continuation<? super SearchWebResponse>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\meta\QaAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */