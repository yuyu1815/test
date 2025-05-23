/*    */ package ai.grazie.api.gateway.client.api.meta;
/*    */ 
/*    */ import ai.grazie.client.common.logging.AnnotationLogger;
/*    */ import java.util.List;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\030\002\n\000\n\002\030\002\n\002\b\003\030\0002\0020\0012\0020\002BI\b\000\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\b\020\007\032\004\030\0010\004\022\016\020\b\032\n\022\004\022\0020\004\030\0010\t\022\006\020\n\032\0020\013\022\006\020\f\032\0020\r\022\006\020\016\032\0020\017¢\006\002\020\020J*\020\031\032\b\022\004\022\0020\0320\t2\006\020\033\032\0020\0342\f\020\035\032\b\022\004\022\0020\0040\tH@¢\006\002\020\036R\032\020\016\032\0020\017X\016¢\006\016\n\000\032\004\b\021\020\022\"\004\b\023\020\024R\031\020\b\032\n\022\004\022\0020\004\030\0010\t¢\006\b\n\000\032\004\b\025\020\026R\023\020\007\032\004\030\0010\004¢\006\b\n\000\032\004\b\027\020\030¨\006\037"}, d2 = {"Lai/grazie/api/gateway/client/api/meta/TreeAPIClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "Lai/grazie/tree/suspendable/SuspendableMultiTreeDependencyService;", "server", "", "authType", "Lai/grazie/model/cloud/AuthType;", "parser", "options", "", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "annotationLogger", "Lai/grazie/client/common/logging/AnnotationLogger;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Ljava/lang/String;Ljava/util/List;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;Lai/grazie/client/common/logging/AnnotationLogger;)V", "getAnnotationLogger", "()Lai/grazie/client/common/logging/AnnotationLogger;", "setAnnotationLogger", "(Lai/grazie/client/common/logging/AnnotationLogger;)V", "getOptions", "()Ljava/util/List;", "getParser", "()Ljava/lang/String;", "parse", "Lai/grazie/tree/model/SentenceWithTreeDependencies;", "language", "Lai/grazie/nlp/langs/Language;", "sentences", "(Lai/grazie/nlp/langs/Language;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nTreeAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeAPIClient.kt\nai/grazie/api/gateway/client/api/meta/TreeAPIClient\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 HTTPResponseExtensions.kt\nai/grazie/client/common/model/HTTPResponseExtensionsKt\n*L\n1#1,24:1\n62#2,6:25\n7#3,2:31\n*S KotlinDebug\n*F\n+ 1 TreeAPIClient.kt\nai/grazie/api/gateway/client/api/meta/TreeAPIClient\n*L\n20#1:25,6\n20#1:31,2\n*E\n"})
/*    */ public final class TreeAPIClient extends SuspendableCloudClient implements SuspendableMultiTreeDependencyService {
/*    */   @Nullable
/*    */   private final String parser;
/*    */   
/*    */   @Nullable
/* 15 */   public final String getParser() { return this.parser; } @Nullable private final List<String> options; @NotNull private AnnotationLogger annotationLogger; @Nullable public final List<String> getOptions() { return this.options; } @NotNull
/* 16 */   public AnnotationLogger getAnnotationLogger() { return this.annotationLogger; } public void setAnnotationLogger(@NotNull AnnotationLogger <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.annotationLogger = <set-?>; } public TreeAPIClient(@NotNull String server, @NotNull AuthType authType, @Nullable String parser, @Nullable List<String> options, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json, @NotNull AnnotationLogger annotationLogger) {
/* 17 */     super(server, authType, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */     this.parser = parser;
/*    */     this.options = options;
/*    */     this.annotationLogger = annotationLogger;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object parse(@NotNull Language language, @NotNull List sentences, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/meta/TreeAPIClient$parse$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/meta/TreeAPIClient$parse$1
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
/*    */     //   39: new ai/grazie/api/gateway/client/api/meta/TreeAPIClient$parse$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/meta/TreeAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #11
/*    */     //   50: aload #11
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #10
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #12
/*    */     //   62: aload #11
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 254, 0 -> 88, 1 -> 188
/*    */     //   88: aload #10
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: getstatic ai/grazie/api/gateway/api/meta/TreeAPI$Tree$V1.INSTANCE : Lai/grazie/api/gateway/api/meta/TreeAPI$Tree$V1;
/*    */     //   96: checkcast ai/grazie/model/cloud/API
/*    */     //   99: astore #5
/*    */     //   101: new ai/grazie/api/gateway/api/meta/TreeAPI$Tree$V1$Request
/*    */     //   104: dup
/*    */     //   105: aload_1
/*    */     //   106: aload_2
/*    */     //   107: aload_0
/*    */     //   108: getfield parser : Ljava/lang/String;
/*    */     //   111: aload_0
/*    */     //   112: getfield options : Ljava/util/List;
/*    */     //   115: invokespecial <init> : (Lai/grazie/nlp/langs/Language;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V
/*    */     //   118: astore #6
/*    */     //   120: new ai/grazie/client/common/model/RequestOptions
/*    */     //   123: dup
/*    */     //   124: aconst_null
/*    */     //   125: aconst_null
/*    */     //   126: iconst_3
/*    */     //   127: aconst_null
/*    */     //   128: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   131: astore #7
/*    */     //   133: aload_0
/*    */     //   134: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   137: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   140: astore #8
/*    */     //   142: iconst_0
/*    */     //   143: istore #9
/*    */     //   145: aload_0
/*    */     //   146: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   149: new ai/grazie/api/gateway/client/api/meta/TreeAPIClient$parse$$inlined$sendAndGet$default$1
/*    */     //   152: dup
/*    */     //   153: aload #5
/*    */     //   155: aload #8
/*    */     //   157: aload #6
/*    */     //   159: aload #7
/*    */     //   161: aconst_null
/*    */     //   162: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/utils/json/JSON;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   165: checkcast kotlin/jvm/functions/Function2
/*    */     //   168: aload #11
/*    */     //   170: aload #11
/*    */     //   172: iconst_1
/*    */     //   173: putfield label : I
/*    */     //   176: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   179: dup
/*    */     //   180: aload #12
/*    */     //   182: if_acmpne -> 198
/*    */     //   185: aload #12
/*    */     //   187: areturn
/*    */     //   188: iconst_0
/*    */     //   189: istore #9
/*    */     //   191: aload #10
/*    */     //   193: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   196: aload #10
/*    */     //   198: nop
/*    */     //   199: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   202: astore #5
/*    */     //   204: nop
/*    */     //   205: getstatic ai/grazie/api/gateway/api/meta/TreeAPI$Tree$V1$Response.Companion : Lai/grazie/api/gateway/api/meta/TreeAPI$Tree$V1$Response$Companion;
/*    */     //   208: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   211: astore #6
/*    */     //   213: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   216: checkcast ai/grazie/utils/json/JSON
/*    */     //   219: astore #7
/*    */     //   221: iconst_0
/*    */     //   222: istore #8
/*    */     //   224: aload #7
/*    */     //   226: aload #6
/*    */     //   228: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   231: aload #5
/*    */     //   233: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   236: dup
/*    */     //   237: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   240: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   243: checkcast ai/grazie/api/gateway/api/meta/TreeAPI$Tree$V1$Response
/*    */     //   246: astore #4
/*    */     //   248: aload #4
/*    */     //   250: invokevirtual getTrees : ()Ljava/util/List;
/*    */     //   253: areturn
/*    */     //   254: new java/lang/IllegalStateException
/*    */     //   257: dup
/*    */     //   258: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   260: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   263: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 60
/*    */     //   #20	-> 93
/*    */     //   #25	-> 120
/*    */     //   #28	-> 120
/*    */     //   #25	-> 133
/*    */     //   #29	-> 133
/*    */     //   #25	-> 142
/*    */     //   #30	-> 145
/*    */     //   #19	-> 185
/*    */     //   #30	-> 198
/*    */     //   #20	-> 204
/*    */     //   #31	-> 205
/*    */     //   #32	-> 224
/*    */     //   #20	-> 243
/*    */     //   #21	-> 248
/*    */     //   #19	-> 254
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	86	0	this	Lai/grazie/api/gateway/client/api/meta/TreeAPIClient;
/*    */     //   93	27	1	language	Lai/grazie/nlp/langs/Language;
/*    */     //   93	27	2	sentences	Ljava/util/List;
/*    */     //   248	6	4	result	Lai/grazie/api/gateway/api/meta/TreeAPI$Tree$V1$Response;
/*    */     //   120	59	5	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   204	39	5	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   120	59	6	content$iv	Ljava/lang/Object;
/*    */     //   213	30	6	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   133	46	7	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   221	22	7	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   142	37	8	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   145	43	9	$i$f$sendAndGet	I
/*    */     //   224	19	8	$i$f$get	I
/*    */     //   0	264	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	204	11	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	197	10	$result	Ljava/lang/Object;
/*    */     //   191	8	9	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "TreeAPIClient.kt", l = {30}, i = {}, s = {}, n = {}, m = "parse", c = "ai.grazie.api.gateway.client.api.meta.TreeAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class TreeAPIClient$parse$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     TreeAPIClient$parse$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return TreeAPIClient.this.parse(null, null, (Continuation<? super List<SentenceWithTreeDependencies>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\meta\TreeAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */