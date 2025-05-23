/*    */ package ai.grazie.api.gateway.client.api.trf;
/*    */ 
/*    */ import ai.grazie.client.common.logging.AnnotationLogger;
/*    */ import ai.grazie.sum.SentenceWithSummaries;
/*    */ import java.util.List;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Deprecated(message = "Sum service is deprecated, please use TextSummarizeTask instead")
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\002\b\004\b\007\030\0002\0020\0012\0020\002B/\b\000\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n\022\006\020\013\032\0020\f¢\006\002\020\rJ@\020\022\032\b\022\004\022\0020\0240\0232\f\020\025\032\b\022\004\022\0020\0040\0232\b\020\026\032\004\030\0010\0272\b\020\030\032\004\030\0010\0312\b\020\032\032\004\030\0010\031H@¢\006\002\020\033J@\020\034\032\b\022\004\022\0020\0240\0232\f\020\025\032\b\022\004\022\0020\0040\0232\b\020\026\032\004\030\0010\0272\b\020\030\032\004\030\0010\0312\b\020\032\032\004\030\0010\031H@¢\006\002\020\033R\032\020\013\032\0020\fX\016¢\006\016\n\000\032\004\b\016\020\017\"\004\b\020\020\021¨\006\035"}, d2 = {"Lai/grazie/api/gateway/client/api/trf/SumAPIClient;", "Lai/grazie/sum/SuspendableSummarizationService;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "server", "", "authType", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "annotationLogger", "Lai/grazie/client/common/logging/AnnotationLogger;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;Lai/grazie/client/common/logging/AnnotationLogger;)V", "getAnnotationLogger", "()Lai/grazie/client/common/logging/AnnotationLogger;", "setAnnotationLogger", "(Lai/grazie/client/common/logging/AnnotationLogger;)V", "summarize", "", "Lai/grazie/sum/SentenceWithSummaries;", "texts", "format", "Lai/grazie/sum/Format;", "minimumBPE", "", "maximumBPE", "(Ljava/util/List;Lai/grazie/sum/Format;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "summarizeWithCache", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nSumAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SumAPIClient.kt\nai/grazie/api/gateway/client/api/trf/SumAPIClient\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 HTTPResponseExtensions.kt\nai/grazie/client/common/model/HTTPResponseExtensionsKt\n*L\n1#1,28:1\n62#2,6:29\n7#3,2:35\n*S KotlinDebug\n*F\n+ 1 SumAPIClient.kt\nai/grazie/api/gateway/client/api/trf/SumAPIClient\n*L\n19#1:29,6\n20#1:35,2\n*E\n"})
/*    */ public final class SumAPIClient extends SuspendableCloudClient implements SuspendableSummarizationService {
/*    */   @NotNull
/* 15 */   public AnnotationLogger getAnnotationLogger() { return this.annotationLogger; } @NotNull private AnnotationLogger annotationLogger; public void setAnnotationLogger(@NotNull AnnotationLogger <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.annotationLogger = <set-?>; } public SumAPIClient(@NotNull String server, @NotNull AuthType authType, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json, @NotNull AnnotationLogger annotationLogger) {
/* 16 */     super(server, authType, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */     this.annotationLogger = annotationLogger;
/*    */   }
/*    */   @Nullable
/*    */   public Object summarize(@NotNull List texts, @Nullable Format format, @Nullable Integer minimumBPE, @Nullable Integer maximumBPE, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #5
/*    */     //   2: instanceof ai/grazie/api/gateway/client/api/trf/SumAPIClient$summarize$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #5
/*    */     //   10: checkcast ai/grazie/api/gateway/client/api/trf/SumAPIClient$summarize$1
/*    */     //   13: astore #13
/*    */     //   15: aload #13
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #13
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new ai/grazie/api/gateway/client/api/trf/SumAPIClient$summarize$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #5
/*    */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/trf/SumAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #13
/*    */     //   53: aload #13
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #12
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #14
/*    */     //   65: aload #13
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 253, 0 -> 92, 1 -> 187
/*    */     //   92: aload #12
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: getstatic ai/grazie/api/gateway/api/trf/SumAPI$Summarize$V1.INSTANCE : Lai/grazie/api/gateway/api/trf/SumAPI$Summarize$V1;
/*    */     //   100: checkcast ai/grazie/model/cloud/API
/*    */     //   103: astore #7
/*    */     //   105: new ai/grazie/api/gateway/api/trf/SumAPI$Summarize$V1$Request
/*    */     //   108: dup
/*    */     //   109: aload_1
/*    */     //   110: aload_2
/*    */     //   111: aload_3
/*    */     //   112: aload #4
/*    */     //   114: invokespecial <init> : (Ljava/util/List;Lai/grazie/sum/Format;Ljava/lang/Integer;Ljava/lang/Integer;)V
/*    */     //   117: astore #8
/*    */     //   119: new ai/grazie/client/common/model/RequestOptions
/*    */     //   122: dup
/*    */     //   123: aconst_null
/*    */     //   124: aconst_null
/*    */     //   125: iconst_3
/*    */     //   126: aconst_null
/*    */     //   127: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   130: astore #9
/*    */     //   132: aload_0
/*    */     //   133: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   136: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   139: astore #10
/*    */     //   141: iconst_0
/*    */     //   142: istore #11
/*    */     //   144: aload_0
/*    */     //   145: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   148: new ai/grazie/api/gateway/client/api/trf/SumAPIClient$summarize$$inlined$sendAndGet$default$1
/*    */     //   151: dup
/*    */     //   152: aload #7
/*    */     //   154: aload #10
/*    */     //   156: aload #8
/*    */     //   158: aload #9
/*    */     //   160: aconst_null
/*    */     //   161: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/utils/json/JSON;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   164: checkcast kotlin/jvm/functions/Function2
/*    */     //   167: aload #13
/*    */     //   169: aload #13
/*    */     //   171: iconst_1
/*    */     //   172: putfield label : I
/*    */     //   175: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   178: dup
/*    */     //   179: aload #14
/*    */     //   181: if_acmpne -> 197
/*    */     //   184: aload #14
/*    */     //   186: areturn
/*    */     //   187: iconst_0
/*    */     //   188: istore #11
/*    */     //   190: aload #12
/*    */     //   192: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   195: aload #12
/*    */     //   197: nop
/*    */     //   198: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   201: astore #7
/*    */     //   203: nop
/*    */     //   204: getstatic ai/grazie/api/gateway/api/trf/SumAPI$Summarize$V1$Response.Companion : Lai/grazie/api/gateway/api/trf/SumAPI$Summarize$V1$Response$Companion;
/*    */     //   207: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   210: astore #8
/*    */     //   212: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   215: checkcast ai/grazie/utils/json/JSON
/*    */     //   218: astore #9
/*    */     //   220: iconst_0
/*    */     //   221: istore #10
/*    */     //   223: aload #9
/*    */     //   225: aload #8
/*    */     //   227: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   230: aload #7
/*    */     //   232: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   235: dup
/*    */     //   236: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   239: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   242: checkcast ai/grazie/api/gateway/api/trf/SumAPI$Summarize$V1$Response
/*    */     //   245: astore #6
/*    */     //   247: aload #6
/*    */     //   249: invokevirtual getSummaries : ()Ljava/util/List;
/*    */     //   252: areturn
/*    */     //   253: new java/lang/IllegalStateException
/*    */     //   256: dup
/*    */     //   257: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   259: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   262: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #18	-> 63
/*    */     //   #19	-> 97
/*    */     //   #29	-> 119
/*    */     //   #32	-> 119
/*    */     //   #29	-> 132
/*    */     //   #33	-> 132
/*    */     //   #29	-> 141
/*    */     //   #34	-> 144
/*    */     //   #18	-> 184
/*    */     //   #34	-> 197
/*    */     //   #20	-> 203
/*    */     //   #35	-> 204
/*    */     //   #36	-> 223
/*    */     //   #20	-> 242
/*    */     //   #19	-> 245
/*    */     //   #21	-> 247
/*    */     //   #18	-> 253
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	81	0	this	Lai/grazie/api/gateway/client/api/trf/SumAPIClient;
/*    */     //   97	22	1	texts	Ljava/util/List;
/*    */     //   97	22	2	format	Lai/grazie/sum/Format;
/*    */     //   97	22	3	minimumBPE	Ljava/lang/Integer;
/*    */     //   97	22	4	maximumBPE	Ljava/lang/Integer;
/*    */     //   247	6	6	response	Lai/grazie/api/gateway/api/trf/SumAPI$Summarize$V1$Response;
/*    */     //   119	59	7	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   203	39	7	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   119	59	8	content$iv	Ljava/lang/Object;
/*    */     //   212	30	8	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   132	46	9	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   220	22	9	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   141	37	10	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   144	43	11	$i$f$sendAndGet	I
/*    */     //   223	19	10	$i$f$get	I
/*    */     //   0	263	5	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	200	13	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	193	12	$result	Ljava/lang/Object;
/*    */     //   190	8	11	$i$f$sendAndGet	I
/*    */   }
/*    */   @Nullable
/*    */   public Object summarizeWithCache(@NotNull List<String> texts, @Nullable Format format, @Nullable Integer minimumBPE, @Nullable Integer maximumBPE, @NotNull Continuation<? super List<SentenceWithSummaries>> $completion) {
/* 25 */     return summarize(texts, format, minimumBPE, maximumBPE, $completion);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "SumAPIClient.kt", l = {34}, i = {}, s = {}, n = {}, m = "summarize", c = "ai.grazie.api.gateway.client.api.trf.SumAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class SumAPIClient$summarize$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     SumAPIClient$summarize$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SumAPIClient.this.summarize(null, null, null, null, (Continuation<? super List<SentenceWithSummaries>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\trf\SumAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */