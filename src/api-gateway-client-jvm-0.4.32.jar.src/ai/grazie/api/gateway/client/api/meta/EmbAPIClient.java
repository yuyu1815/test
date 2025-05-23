/*    */ package ai.grazie.api.gateway.client.api.meta;
/*    */ import ai.grazie.client.common.SuspendableHTTPClient;
/*    */ import ai.grazie.model.cloud.AuthType;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020 \n\002\b\004\030\0002\b\022\004\022\0020\0020\001B'\b\000\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n¢\006\002\020\013J,\020\021\032\b\022\004\022\0020\0020\0222\f\020\023\032\b\022\004\022\0020\0040\0222\b\020\024\032\004\030\0010\004H@¢\006\002\020\025R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\f\020\rR\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\016\020\017R\016\020\020\032\0020\004X\004¢\006\002\n\000¨\006\026"}, d2 = {"Lai/grazie/api/gateway/client/api/meta/EmbAPIClient;", "Lai/grazie/emb/SuspendableTextEmbeddingsService;", "Lai/grazie/emb/DoubleTextEmbedding;", "server", "", "authType", "Lai/grazie/model/cloud/AuthType;", "client", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;)V", "getClient", "()Lai/grazie/client/common/SuspendableHTTPClient;", "getJson", "()Lai/grazie/utils/json/JSON;", "url", "embed", "", "texts", "model", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nEmbAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmbAPIClient.kt\nai/grazie/api/gateway/client/api/meta/EmbAPIClient\n+ 2 SuspendableClientExtensions.kt\nai/grazie/client/cbor/extensions/SuspendableClientExtensionsKt\n*L\n1#1,24:1\n26#2,8:25\n*S KotlinDebug\n*F\n+ 1 EmbAPIClient.kt\nai/grazie/api/gateway/client/api/meta/EmbAPIClient\n*L\n19#1:25,8\n*E\n"})
/*    */ public final class EmbAPIClient implements SuspendableTextEmbeddingsService<DoubleTextEmbedding> {
/*    */   public EmbAPIClient(@NotNull String server, @NotNull AuthType authType, @NotNull SuspendableHTTPClient client, @NotNull JSON json) {
/* 13 */     this.client = client; this.json = json;
/*    */ 
/*    */     
/* 16 */     this.url = EmbAPI.Embed.V1.INSTANCE.url(server, authType, AuthVersion.V5);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private final SuspendableHTTPClient client;
/*    */   @NotNull
/*    */   private final JSON json;
/*    */   @NotNull
/*    */   private final String url;
/*    */   
/*    */   @NotNull
/*    */   public final SuspendableHTTPClient getClient() {
/*    */     return this.client;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final JSON getJson() {
/*    */     return this.json;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object embed(@NotNull List texts, @Nullable String model, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/meta/EmbAPIClient$embed$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/meta/EmbAPIClient$embed$1
/*    */     //   11: astore #13
/*    */     //   13: aload #13
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #13
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/api/gateway/client/api/meta/EmbAPIClient$embed$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/meta/EmbAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #13
/*    */     //   50: aload #13
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #12
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #14
/*    */     //   62: aload #13
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 212, 0 -> 88, 1 -> 190
/*    */     //   88: aload #12
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_0
/*    */     //   94: getfield client : Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   97: astore #5
/*    */     //   99: aload_0
/*    */     //   100: getfield url : Ljava/lang/String;
/*    */     //   103: astore #6
/*    */     //   105: new ai/grazie/api/gateway/api/meta/EmbAPI$Embed$V1$Request
/*    */     //   108: dup
/*    */     //   109: aload_1
/*    */     //   110: aload_2
/*    */     //   111: invokespecial <init> : (Ljava/util/List;Ljava/lang/String;)V
/*    */     //   114: astore #7
/*    */     //   116: aload_0
/*    */     //   117: getfield json : Lai/grazie/utils/json/JSON;
/*    */     //   120: astore #9
/*    */     //   122: getstatic ai/grazie/utils/cbor/CBOR$Default.INSTANCE : Lai/grazie/utils/cbor/CBOR$Default;
/*    */     //   125: checkcast ai/grazie/utils/cbor/CBOR
/*    */     //   128: astore #10
/*    */     //   130: new ai/grazie/client/common/model/RequestOptions
/*    */     //   133: dup
/*    */     //   134: aconst_null
/*    */     //   135: aconst_null
/*    */     //   136: iconst_3
/*    */     //   137: aconst_null
/*    */     //   138: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   141: astore #8
/*    */     //   143: iconst_0
/*    */     //   144: istore #11
/*    */     //   146: aload #5
/*    */     //   148: aload #6
/*    */     //   150: aload #7
/*    */     //   152: getstatic ai/grazie/api/gateway/api/meta/EmbAPI$Embed$V1$Request.Companion : Lai/grazie/api/gateway/api/meta/EmbAPI$Embed$V1$Request$Companion;
/*    */     //   155: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   158: getstatic ai/grazie/api/gateway/api/meta/EmbAPI$Embed$V1$Response.Companion : Lai/grazie/api/gateway/api/meta/EmbAPI$Embed$V1$Response$Companion;
/*    */     //   161: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   164: aload #8
/*    */     //   166: aload #9
/*    */     //   168: aload #10
/*    */     //   170: aload #13
/*    */     //   172: aload #13
/*    */     //   174: iconst_1
/*    */     //   175: putfield label : I
/*    */     //   178: invokestatic sendAndGet : (Lai/grazie/client/common/SuspendableHTTPClient;Ljava/lang/String;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lai/grazie/utils/cbor/CBOR;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   181: dup
/*    */     //   182: aload #14
/*    */     //   184: if_acmpne -> 200
/*    */     //   187: aload #14
/*    */     //   189: areturn
/*    */     //   190: iconst_0
/*    */     //   191: istore #11
/*    */     //   193: aload #12
/*    */     //   195: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   198: aload #12
/*    */     //   200: nop
/*    */     //   201: checkcast ai/grazie/api/gateway/api/meta/EmbAPI$Embed$V1$Response
/*    */     //   204: astore #4
/*    */     //   206: aload #4
/*    */     //   208: invokevirtual getEmbeddings : ()Ljava/util/List;
/*    */     //   211: areturn
/*    */     //   212: new java/lang/IllegalStateException
/*    */     //   215: dup
/*    */     //   216: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   218: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   221: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #18	-> 60
/*    */     //   #19	-> 93
/*    */     //   #25	-> 130
/*    */     //   #28	-> 130
/*    */     //   #25	-> 143
/*    */     //   #25	-> 143
/*    */     //   #25	-> 143
/*    */     //   #32	-> 146
/*    */     //   #18	-> 187
/*    */     //   #32	-> 200
/*    */     //   #19	-> 201
/*    */     //   #20	-> 206
/*    */     //   #18	-> 212
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	37	0	this	Lai/grazie/api/gateway/client/api/meta/EmbAPIClient;
/*    */     //   93	37	1	texts	Ljava/util/List;
/*    */     //   93	37	2	model	Ljava/lang/String;
/*    */     //   206	6	4	response	Lai/grazie/api/gateway/api/meta/EmbAPI$Embed$V1$Response;
/*    */     //   130	51	5	$this$sendAndGet_u24default$iv	Lai/grazie/client/common/SuspendableHTTPClient;
/*    */     //   130	51	6	url$iv	Ljava/lang/String;
/*    */     //   130	51	7	content$iv	Ljava/lang/Object;
/*    */     //   143	38	8	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   130	51	9	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   130	51	10	cbor$iv	Lai/grazie/utils/cbor/CBOR;
/*    */     //   146	44	11	$i$f$sendAndGet	I
/*    */     //   0	222	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	162	13	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	155	12	$result	Ljava/lang/Object;
/*    */     //   193	8	11	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "EmbAPIClient.kt", l = {32}, i = {}, s = {}, n = {}, m = "embed", c = "ai.grazie.api.gateway.client.api.meta.EmbAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class EmbAPIClient$embed$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     EmbAPIClient$embed$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return EmbAPIClient.this.embed(null, null, (Continuation<? super List<DoubleTextEmbedding>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\meta\EmbAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */