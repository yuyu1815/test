/*    */ package ai.grazie.api.gateway.client.api.meta;
/*    */ 
/*    */ import ai.grazie.client.common.logging.AnnotationLogger;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\003\030\0002\0020\0012\0020\002B;\b\000\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\n\b\002\020\007\032\004\030\0010\004\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013\022\006\020\f\032\0020\r¢\006\002\020\016J*\020\025\032\b\022\004\022\0020\0270\0262\006\020\030\032\0020\0312\f\020\032\032\b\022\004\022\0020\0040\026H@¢\006\002\020\033R\032\020\f\032\0020\rX\016¢\006\016\n\000\032\004\b\017\020\020\"\004\b\021\020\022R\023\020\007\032\004\030\0010\004¢\006\b\n\000\032\004\b\023\020\024¨\006\034"}, d2 = {"Lai/grazie/api/gateway/client/api/meta/NerAPIClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "Lai/grazie/ner/suspendable/SuspendableMultiNERAnnotationService;", "server", "", "authType", "Lai/grazie/model/cloud/AuthType;", "version", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "annotationLogger", "Lai/grazie/client/common/logging/AnnotationLogger;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Ljava/lang/String;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;Lai/grazie/client/common/logging/AnnotationLogger;)V", "getAnnotationLogger", "()Lai/grazie/client/common/logging/AnnotationLogger;", "setAnnotationLogger", "(Lai/grazie/client/common/logging/AnnotationLogger;)V", "getVersion", "()Ljava/lang/String;", "annotate", "", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "language", "Lai/grazie/nlp/langs/Language;", "sentences", "(Lai/grazie/nlp/langs/Language;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nNerAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NerAPIClient.kt\nai/grazie/api/gateway/client/api/meta/NerAPIClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 4 HTTPResponseExtensions.kt\nai/grazie/client/common/model/HTTPResponseExtensionsKt\n*L\n1#1,27:1\n1#2:28\n62#3,6:29\n7#4,2:35\n*S KotlinDebug\n*F\n+ 1 NerAPIClient.kt\nai/grazie/api/gateway/client/api/meta/NerAPIClient\n*L\n20#1:29,6\n23#1:35,2\n*E\n"})
/*    */ public final class NerAPIClient extends SuspendableCloudClient implements SuspendableMultiNERAnnotationService {
/*    */   @Nullable
/*    */   private final String version;
/*    */   
/*    */   @Nullable
/* 15 */   public final String getVersion() { return this.version; } @NotNull private AnnotationLogger annotationLogger; @NotNull
/* 16 */   public AnnotationLogger getAnnotationLogger() { return this.annotationLogger; } public void setAnnotationLogger(@NotNull AnnotationLogger <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.annotationLogger = <set-?>; } public NerAPIClient(@NotNull String server, @NotNull AuthType authType, @Nullable String version, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json, @NotNull AnnotationLogger annotationLogger) {
/* 17 */     super(server, authType, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */     this.version = version;
/*    */     this.annotationLogger = annotationLogger;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object annotate(@NotNull Language language, @NotNull List sentences, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/meta/NerAPIClient$annotate$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/meta/NerAPIClient$annotate$1
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
/*    */     //   39: new ai/grazie/api/gateway/client/api/meta/NerAPIClient$annotate$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/meta/NerAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #12
/*    */     //   50: aload #12
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #11
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #13
/*    */     //   62: aload #12
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 279, 0 -> 88, 1 -> 213
/*    */     //   88: aload #11
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: getstatic ai/grazie/api/gateway/api/meta/NerAPI$Annotate$V1.INSTANCE : Lai/grazie/api/gateway/api/meta/NerAPI$Annotate$V1;
/*    */     //   96: checkcast ai/grazie/model/cloud/API
/*    */     //   99: astore #5
/*    */     //   101: aload_0
/*    */     //   102: getfield version : Ljava/lang/String;
/*    */     //   105: dup
/*    */     //   106: ifnull -> 129
/*    */     //   109: astore #9
/*    */     //   111: iconst_0
/*    */     //   112: istore #10
/*    */     //   114: new ai/grazie/api/gateway/api/meta/NerAPI$Annotate$V1$Request
/*    */     //   117: dup
/*    */     //   118: aload_1
/*    */     //   119: aload_2
/*    */     //   120: aload #9
/*    */     //   122: invokespecial <init> : (Lai/grazie/nlp/langs/Language;Ljava/util/List;Ljava/lang/String;)V
/*    */     //   125: nop
/*    */     //   126: goto -> 142
/*    */     //   129: pop
/*    */     //   130: new ai/grazie/api/gateway/api/meta/NerAPI$Annotate$V1$Request
/*    */     //   133: dup
/*    */     //   134: aload_1
/*    */     //   135: aload_2
/*    */     //   136: aconst_null
/*    */     //   137: iconst_4
/*    */     //   138: aconst_null
/*    */     //   139: invokespecial <init> : (Lai/grazie/nlp/langs/Language;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   142: astore #6
/*    */     //   144: nop
/*    */     //   145: new ai/grazie/client/common/model/RequestOptions
/*    */     //   148: dup
/*    */     //   149: aconst_null
/*    */     //   150: aconst_null
/*    */     //   151: iconst_3
/*    */     //   152: aconst_null
/*    */     //   153: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   156: astore #7
/*    */     //   158: aload_0
/*    */     //   159: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   162: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   165: astore #8
/*    */     //   167: iconst_0
/*    */     //   168: istore #9
/*    */     //   170: aload_0
/*    */     //   171: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   174: new ai/grazie/api/gateway/client/api/meta/NerAPIClient$annotate$$inlined$sendAndGet$default$1
/*    */     //   177: dup
/*    */     //   178: aload #5
/*    */     //   180: aload #8
/*    */     //   182: aload #6
/*    */     //   184: aload #7
/*    */     //   186: aconst_null
/*    */     //   187: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/utils/json/JSON;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   190: checkcast kotlin/jvm/functions/Function2
/*    */     //   193: aload #12
/*    */     //   195: aload #12
/*    */     //   197: iconst_1
/*    */     //   198: putfield label : I
/*    */     //   201: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   204: dup
/*    */     //   205: aload #13
/*    */     //   207: if_acmpne -> 223
/*    */     //   210: aload #13
/*    */     //   212: areturn
/*    */     //   213: iconst_0
/*    */     //   214: istore #9
/*    */     //   216: aload #11
/*    */     //   218: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   221: aload #11
/*    */     //   223: nop
/*    */     //   224: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   227: astore #5
/*    */     //   229: nop
/*    */     //   230: getstatic ai/grazie/api/gateway/api/meta/NerAPI$Annotate$V1$Response.Companion : Lai/grazie/api/gateway/api/meta/NerAPI$Annotate$V1$Response$Companion;
/*    */     //   233: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   236: astore #6
/*    */     //   238: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   241: checkcast ai/grazie/utils/json/JSON
/*    */     //   244: astore #7
/*    */     //   246: iconst_0
/*    */     //   247: istore #8
/*    */     //   249: aload #7
/*    */     //   251: aload #6
/*    */     //   253: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   256: aload #5
/*    */     //   258: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   261: dup
/*    */     //   262: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   265: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   268: checkcast ai/grazie/api/gateway/api/meta/NerAPI$Annotate$V1$Response
/*    */     //   271: astore #4
/*    */     //   273: aload #4
/*    */     //   275: invokevirtual getAnnotations : ()Ljava/util/List;
/*    */     //   278: areturn
/*    */     //   279: new java/lang/IllegalStateException
/*    */     //   282: dup
/*    */     //   283: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   285: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   288: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 60
/*    */     //   #21	-> 93
/*    */     //   #28	-> 111
/*    */     //   #21	-> 114
/*    */     //   #21	-> 125
/*    */     //   #21	-> 126
/*    */     //   #22	-> 130
/*    */     //   #20	-> 144
/*    */     //   #29	-> 145
/*    */     //   #32	-> 145
/*    */     //   #29	-> 158
/*    */     //   #33	-> 158
/*    */     //   #29	-> 167
/*    */     //   #34	-> 170
/*    */     //   #19	-> 210
/*    */     //   #34	-> 223
/*    */     //   #23	-> 229
/*    */     //   #35	-> 230
/*    */     //   #36	-> 249
/*    */     //   #23	-> 268
/*    */     //   #20	-> 271
/*    */     //   #24	-> 273
/*    */     //   #19	-> 279
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	32	0	this	Lai/grazie/api/gateway/client/api/meta/NerAPIClient;
/*    */     //   125	1	0	this	Lai/grazie/api/gateway/client/api/meta/NerAPIClient;
/*    */     //   126	78	0	this	Lai/grazie/api/gateway/client/api/meta/NerAPIClient;
/*    */     //   93	32	1	language	Lai/grazie/nlp/langs/Language;
/*    */     //   125	1	1	language	Lai/grazie/nlp/langs/Language;
/*    */     //   126	3	1	language	Lai/grazie/nlp/langs/Language;
/*    */     //   129	13	1	language	Lai/grazie/nlp/langs/Language;
/*    */     //   93	32	2	sentences	Ljava/util/List;
/*    */     //   125	1	2	sentences	Ljava/util/List;
/*    */     //   126	3	2	sentences	Ljava/util/List;
/*    */     //   129	13	2	sentences	Ljava/util/List;
/*    */     //   273	6	4	result	Lai/grazie/api/gateway/api/meta/NerAPI$Annotate$V1$Response;
/*    */     //   126	78	5	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   229	39	5	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   144	60	6	content$iv	Ljava/lang/Object;
/*    */     //   238	30	6	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   158	46	7	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   246	22	7	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   167	37	8	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   111	14	9	it	Ljava/lang/String;
/*    */     //   114	11	10	$i$a$-let-NerAPIClient$annotate$result$1	I
/*    */     //   170	43	9	$i$f$sendAndGet	I
/*    */     //   249	19	8	$i$f$get	I
/*    */     //   0	289	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	229	12	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	222	11	$result	Ljava/lang/Object;
/*    */     //   216	8	9	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "NerAPIClient.kt", l = {34}, i = {}, s = {}, n = {}, m = "annotate", c = "ai.grazie.api.gateway.client.api.meta.NerAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class NerAPIClient$annotate$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     NerAPIClient$annotate$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return NerAPIClient.this.annotate(null, null, (Continuation<? super List<SentenceWithNERAnnotations>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\meta\NerAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */