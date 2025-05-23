/*    */ package ai.grazie.api.gateway.client.api.indexing;
/*    */ 
/*    */ import ai.grazie.client.common.SuspendableHTTPClient;
/*    */ import ai.grazie.client.common.logging.AnnotationLogger;
/*    */ import ai.grazie.code.indexing.model.IndexAlias;
/*    */ import ai.grazie.code.indexing.model.search.SearchResponse;
/*    */ import ai.grazie.model.cloud.AuthType;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\000\n\002\020\006\n\002\b\002\n\002\020\013\n\002\b\002\030\0002\0020\0012\0020\002B-\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n\022\006\020\013\032\0020\f¢\006\002\020\rJR\020\022\032\0020\0232\006\020\024\032\0020\0252\006\020\026\032\0020\0042\006\020\027\032\0020\0042\b\020\030\032\004\030\0010\0042\006\020\031\032\0020\0322\006\020\033\032\0020\0342\b\020\035\032\004\030\0010\0042\006\020\036\032\0020\037H@¢\006\002\020 R\032\020\013\032\0020\fX\016¢\006\016\n\000\032\004\b\016\020\017\"\004\b\020\020\021¨\006!"}, d2 = {"Lai/grazie/api/gateway/client/api/indexing/IndexingSearchClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "Lai/grazie/code/indexing/model/client/StableSearchClient;", "server", "", "authType", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "annotationLogger", "Lai/grazie/client/common/logging/AnnotationLogger;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;Lai/grazie/client/common/logging/AnnotationLogger;)V", "getAnnotationLogger", "()Lai/grazie/client/common/logging/AnnotationLogger;", "setAnnotationLogger", "(Lai/grazie/client/common/logging/AnnotationLogger;)V", "search", "Lai/grazie/code/indexing/model/search/SearchResponse;", "indexAlias", "Lai/grazie/code/indexing/model/IndexAlias;", "text", "repository", "revision", "maxResults", "", "minScore", "", "pathFilter", "logAllowed", "", "(Lai/grazie/code/indexing/model/IndexAlias;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nIndexingSearchClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndexingSearchClient.kt\nai/grazie/api/gateway/client/api/indexing/IndexingSearchClient\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 HTTPResponseExtensions.kt\nai/grazie/client/common/model/HTTPResponseExtensionsKt\n*L\n1#1,36:1\n62#2,6:37\n7#3,2:43\n*S KotlinDebug\n*F\n+ 1 IndexingSearchClient.kt\nai/grazie/api/gateway/client/api/indexing/IndexingSearchClient\n*L\n33#1:37,6\n33#1:43,2\n*E\n"})
/*    */ public final class IndexingSearchClient extends SuspendableCloudClient implements StableSearchClient {
/*    */   @NotNull
/* 20 */   public AnnotationLogger getAnnotationLogger() { return this.annotationLogger; } @NotNull private AnnotationLogger annotationLogger; public void setAnnotationLogger(@NotNull AnnotationLogger <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.annotationLogger = <set-?>; } public IndexingSearchClient(@NotNull String server, @NotNull AuthType authType, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json, @NotNull AnnotationLogger annotationLogger) {
/* 21 */     super(server, authType, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */     this.annotationLogger = annotationLogger;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object search(@NotNull IndexAlias indexAlias, @NotNull String text, @NotNull String repository, @Nullable String revision, int maxResults, double minScore, @Nullable String pathFilter, boolean logAllowed, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #10
/*    */     //   2: instanceof ai/grazie/api/gateway/client/api/indexing/IndexingSearchClient$search$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #10
/*    */     //   10: checkcast ai/grazie/api/gateway/client/api/indexing/IndexingSearchClient$search$1
/*    */     //   13: astore #17
/*    */     //   15: aload #17
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #17
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new ai/grazie/api/gateway/client/api/indexing/IndexingSearchClient$search$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #10
/*    */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/indexing/IndexingSearchClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #17
/*    */     //   53: aload #17
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #16
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #18
/*    */     //   65: aload #17
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 265, 0 -> 92, 1 -> 203
/*    */     //   92: aload #16
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: new ai/grazie/api/gateway/api/indexing/SearchAPI$Search$Request
/*    */     //   100: dup
/*    */     //   101: aload_1
/*    */     //   102: aload_2
/*    */     //   103: aload_3
/*    */     //   104: aload #4
/*    */     //   106: iload #5
/*    */     //   108: dload #6
/*    */     //   110: aload #8
/*    */     //   112: iload #9
/*    */     //   114: ifeq -> 121
/*    */     //   117: iconst_1
/*    */     //   118: goto -> 122
/*    */     //   121: iconst_0
/*    */     //   122: invokespecial <init> : (Lai/grazie/code/indexing/model/IndexAlias;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;Z)V
/*    */     //   125: astore #11
/*    */     //   127: getstatic ai/grazie/api/gateway/api/indexing/SearchAPI$Search.INSTANCE : Lai/grazie/api/gateway/api/indexing/SearchAPI$Search;
/*    */     //   130: checkcast ai/grazie/model/cloud/API
/*    */     //   133: astore #12
/*    */     //   135: new ai/grazie/client/common/model/RequestOptions
/*    */     //   138: dup
/*    */     //   139: aconst_null
/*    */     //   140: aconst_null
/*    */     //   141: iconst_3
/*    */     //   142: aconst_null
/*    */     //   143: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   146: astore #13
/*    */     //   148: aload_0
/*    */     //   149: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   152: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   155: astore #14
/*    */     //   157: iconst_0
/*    */     //   158: istore #15
/*    */     //   160: aload_0
/*    */     //   161: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   164: new ai/grazie/api/gateway/client/api/indexing/IndexingSearchClient$search$$inlined$sendAndGet$default$1
/*    */     //   167: dup
/*    */     //   168: aload #12
/*    */     //   170: aload #14
/*    */     //   172: aload #11
/*    */     //   174: aload #13
/*    */     //   176: aconst_null
/*    */     //   177: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/utils/json/JSON;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   180: checkcast kotlin/jvm/functions/Function2
/*    */     //   183: aload #17
/*    */     //   185: aload #17
/*    */     //   187: iconst_1
/*    */     //   188: putfield label : I
/*    */     //   191: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   194: dup
/*    */     //   195: aload #18
/*    */     //   197: if_acmpne -> 213
/*    */     //   200: aload #18
/*    */     //   202: areturn
/*    */     //   203: iconst_0
/*    */     //   204: istore #15
/*    */     //   206: aload #16
/*    */     //   208: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   211: aload #16
/*    */     //   213: nop
/*    */     //   214: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   217: astore #12
/*    */     //   219: nop
/*    */     //   220: getstatic ai/grazie/api/gateway/api/indexing/SearchAPI$Search$Response.Companion : Lai/grazie/api/gateway/api/indexing/SearchAPI$Search$Response$Companion;
/*    */     //   223: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   226: astore #13
/*    */     //   228: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   231: checkcast ai/grazie/utils/json/JSON
/*    */     //   234: astore #14
/*    */     //   236: iconst_0
/*    */     //   237: istore #15
/*    */     //   239: aload #14
/*    */     //   241: aload #13
/*    */     //   243: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   246: aload #12
/*    */     //   248: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   251: dup
/*    */     //   252: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   255: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   258: checkcast ai/grazie/api/gateway/api/indexing/SearchAPI$Search$Response
/*    */     //   261: invokevirtual getSearchResponse : ()Lai/grazie/code/indexing/model/search/SearchResponse;
/*    */     //   264: areturn
/*    */     //   265: new java/lang/IllegalStateException
/*    */     //   268: dup
/*    */     //   269: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   271: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   274: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 63
/*    */     //   #32	-> 97
/*    */     //   #33	-> 127
/*    */     //   #37	-> 135
/*    */     //   #40	-> 135
/*    */     //   #37	-> 148
/*    */     //   #41	-> 148
/*    */     //   #37	-> 157
/*    */     //   #42	-> 160
/*    */     //   #22	-> 200
/*    */     //   #42	-> 213
/*    */     //   #33	-> 219
/*    */     //   #43	-> 220
/*    */     //   #44	-> 239
/*    */     //   #33	-> 261
/*    */     //   #22	-> 265
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	97	0	this	Lai/grazie/api/gateway/client/api/indexing/IndexingSearchClient;
/*    */     //   97	24	1	indexAlias	Lai/grazie/code/indexing/model/IndexAlias;
/*    */     //   97	24	2	text	Ljava/lang/String;
/*    */     //   97	24	3	repository	Ljava/lang/String;
/*    */     //   97	24	4	revision	Ljava/lang/String;
/*    */     //   97	24	5	maxResults	I
/*    */     //   97	24	6	minScore	D
/*    */     //   97	24	8	pathFilter	Ljava/lang/String;
/*    */     //   97	24	9	logAllowed	Z
/*    */     //   127	67	11	request	Lai/grazie/api/gateway/api/indexing/SearchAPI$Search$Request;
/*    */     //   135	59	12	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   219	39	12	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   148	46	13	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   228	30	13	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   157	37	14	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   236	22	14	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   160	43	15	$i$f$sendAndGet	I
/*    */     //   239	19	15	$i$f$get	I
/*    */     //   0	275	10	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	212	17	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	205	16	$result	Ljava/lang/Object;
/*    */     //   206	8	15	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "IndexingSearchClient.kt", l = {42}, i = {}, s = {}, n = {}, m = "search", c = "ai.grazie.api.gateway.client.api.indexing.IndexingSearchClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class IndexingSearchClient$search$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     IndexingSearchClient$search$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return IndexingSearchClient.this.search(null, null, null, null, 0, 0.0D, null, false, (Continuation<? super SearchResponse>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\indexing\IndexingSearchClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */