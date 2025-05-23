/*    */ package ai.grazie.api.gateway.client.api.meta;
/*    */ 
/*    */ import ai.grazie.client.common.logging.AnnotationLogger;
/*    */ import ai.grazie.tone.DocFormalityTone;
/*    */ import ai.grazie.tone.MergeStrategyId;
/*    */ import java.util.List;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\020 \n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\020\013\n\002\b\002\030\0002\0020\001B-\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013¢\006\002\020\fJL\020\021\032\0020\0222\f\020\023\032\b\022\004\022\0020\0030\0242\b\b\002\020\025\032\0020\0262\016\b\002\020\027\032\b\022\004\022\0020\0300\0242\n\b\002\020\031\032\004\030\0010\0302\b\b\002\020\032\032\0020\033H@¢\006\002\020\034R\032\020\n\032\0020\013X\016¢\006\016\n\000\032\004\b\r\020\016\"\004\b\017\020\020¨\006\035"}, d2 = {"Lai/grazie/api/gateway/client/api/meta/ToneAPIClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "server", "", "authType", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "annotationLogger", "Lai/grazie/client/common/logging/AnnotationLogger;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;Lai/grazie/client/common/logging/AnnotationLogger;)V", "getAnnotationLogger", "()Lai/grazie/client/common/logging/AnnotationLogger;", "setAnnotationLogger", "(Lai/grazie/client/common/logging/AnnotationLogger;)V", "predictFormalityTone", "Lai/grazie/tone/DocFormalityTone;", "sentences", "", "mergeStrategyId", "Lai/grazie/tone/MergeStrategyId;", "percentages", "", "batchSize", "returnSentenceScores", "", "(Ljava/util/List;Lai/grazie/tone/MergeStrategyId;Ljava/util/List;Ljava/lang/Integer;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nToneAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToneAPIClient.kt\nai/grazie/api/gateway/client/api/meta/ToneAPIClient\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 HTTPResponseExtensions.kt\nai/grazie/client/common/model/HTTPResponseExtensionsKt\n*L\n1#1,33:1\n62#2,6:34\n7#3,2:40\n*S KotlinDebug\n*F\n+ 1 ToneAPIClient.kt\nai/grazie/api/gateway/client/api/meta/ToneAPIClient\n*L\n26#1:34,6\n29#1:40,2\n*E\n"})
/*    */ public final class ToneAPIClient extends SuspendableCloudClient {
/*    */   @NotNull
/* 15 */   public AnnotationLogger getAnnotationLogger() { return this.annotationLogger; } @NotNull private AnnotationLogger annotationLogger; public void setAnnotationLogger(@NotNull AnnotationLogger <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.annotationLogger = <set-?>; } public ToneAPIClient(@NotNull String server, @NotNull AuthType authType, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json, @NotNull AnnotationLogger annotationLogger) {
/* 16 */     super(server, authType, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */     this.annotationLogger = annotationLogger;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object predictFormalityTone(@NotNull List sentences, @NotNull MergeStrategyId mergeStrategyId, @NotNull List percentages, @Nullable Integer batchSize, boolean returnSentenceScores, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #6
/*    */     //   2: instanceof ai/grazie/api/gateway/client/api/meta/ToneAPIClient$predictFormalityTone$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #6
/*    */     //   10: checkcast ai/grazie/api/gateway/client/api/meta/ToneAPIClient$predictFormalityTone$1
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
/*    */     //   41: new ai/grazie/api/gateway/client/api/meta/ToneAPIClient$predictFormalityTone$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #6
/*    */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/meta/ToneAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #14
/*    */     //   53: aload #14
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #13
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #15
/*    */     //   65: aload #14
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 264, 0 -> 92, 1 -> 198
/*    */     //   92: aload #13
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: getstatic ai/grazie/api/gateway/api/meta/ToneAPI$Formality$Predict.INSTANCE : Lai/grazie/api/gateway/api/meta/ToneAPI$Formality$Predict;
/*    */     //   100: checkcast ai/grazie/model/cloud/API
/*    */     //   103: astore #8
/*    */     //   105: new ai/grazie/api/gateway/api/meta/ToneAPI$Formality$Predict$Request
/*    */     //   108: dup
/*    */     //   109: aload_1
/*    */     //   110: aload_2
/*    */     //   111: aload_3
/*    */     //   112: aload #4
/*    */     //   114: iload #5
/*    */     //   116: ifeq -> 123
/*    */     //   119: iconst_1
/*    */     //   120: goto -> 124
/*    */     //   123: iconst_0
/*    */     //   124: invokespecial <init> : (Ljava/util/List;Lai/grazie/tone/MergeStrategyId;Ljava/util/List;Ljava/lang/Integer;Z)V
/*    */     //   127: astore #9
/*    */     //   129: nop
/*    */     //   130: new ai/grazie/client/common/model/RequestOptions
/*    */     //   133: dup
/*    */     //   134: aconst_null
/*    */     //   135: aconst_null
/*    */     //   136: iconst_3
/*    */     //   137: aconst_null
/*    */     //   138: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   141: astore #10
/*    */     //   143: aload_0
/*    */     //   144: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   147: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   150: astore #11
/*    */     //   152: iconst_0
/*    */     //   153: istore #12
/*    */     //   155: aload_0
/*    */     //   156: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   159: new ai/grazie/api/gateway/client/api/meta/ToneAPIClient$predictFormalityTone$$inlined$sendAndGet$default$1
/*    */     //   162: dup
/*    */     //   163: aload #8
/*    */     //   165: aload #11
/*    */     //   167: aload #9
/*    */     //   169: aload #10
/*    */     //   171: aconst_null
/*    */     //   172: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/utils/json/JSON;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   175: checkcast kotlin/jvm/functions/Function2
/*    */     //   178: aload #14
/*    */     //   180: aload #14
/*    */     //   182: iconst_1
/*    */     //   183: putfield label : I
/*    */     //   186: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   189: dup
/*    */     //   190: aload #15
/*    */     //   192: if_acmpne -> 208
/*    */     //   195: aload #15
/*    */     //   197: areturn
/*    */     //   198: iconst_0
/*    */     //   199: istore #12
/*    */     //   201: aload #13
/*    */     //   203: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   206: aload #13
/*    */     //   208: nop
/*    */     //   209: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   212: astore #8
/*    */     //   214: nop
/*    */     //   215: getstatic ai/grazie/api/gateway/api/meta/ToneAPI$Formality$Predict$Response.Companion : Lai/grazie/api/gateway/api/meta/ToneAPI$Formality$Predict$Response$Companion;
/*    */     //   218: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   221: astore #9
/*    */     //   223: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   226: checkcast ai/grazie/utils/json/JSON
/*    */     //   229: astore #10
/*    */     //   231: iconst_0
/*    */     //   232: istore #11
/*    */     //   234: aload #10
/*    */     //   236: aload #9
/*    */     //   238: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   241: aload #8
/*    */     //   243: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   246: dup
/*    */     //   247: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   250: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   253: checkcast ai/grazie/api/gateway/api/meta/ToneAPI$Formality$Predict$Response
/*    */     //   256: astore #7
/*    */     //   258: aload #7
/*    */     //   260: invokevirtual getTone : ()Lai/grazie/tone/DocFormalityTone;
/*    */     //   263: areturn
/*    */     //   264: new java/lang/IllegalStateException
/*    */     //   267: dup
/*    */     //   268: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   270: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   273: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #18	-> 63
/*    */     //   #27	-> 97
/*    */     //   #28	-> 105
/*    */     //   #26	-> 129
/*    */     //   #34	-> 130
/*    */     //   #37	-> 130
/*    */     //   #34	-> 143
/*    */     //   #38	-> 143
/*    */     //   #34	-> 152
/*    */     //   #39	-> 155
/*    */     //   #18	-> 195
/*    */     //   #39	-> 208
/*    */     //   #29	-> 214
/*    */     //   #40	-> 215
/*    */     //   #41	-> 234
/*    */     //   #29	-> 253
/*    */     //   #25	-> 256
/*    */     //   #30	-> 258
/*    */     //   #18	-> 264
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	92	0	this	Lai/grazie/api/gateway/client/api/meta/ToneAPIClient;
/*    */     //   97	26	1	sentences	Ljava/util/List;
/*    */     //   97	26	2	mergeStrategyId	Lai/grazie/tone/MergeStrategyId;
/*    */     //   97	26	3	percentages	Ljava/util/List;
/*    */     //   97	26	4	batchSize	Ljava/lang/Integer;
/*    */     //   97	26	5	returnSentenceScores	Z
/*    */     //   258	6	7	result	Lai/grazie/api/gateway/api/meta/ToneAPI$Formality$Predict$Response;
/*    */     //   105	84	8	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   214	39	8	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   129	60	9	content$iv	Ljava/lang/Object;
/*    */     //   223	30	9	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   143	46	10	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   231	22	10	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   152	37	11	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   155	43	12	$i$f$sendAndGet	I
/*    */     //   234	19	11	$i$f$get	I
/*    */     //   0	274	6	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	211	14	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	204	13	$result	Ljava/lang/Object;
/*    */     //   201	8	12	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "ToneAPIClient.kt", l = {39}, i = {}, s = {}, n = {}, m = "predictFormalityTone", c = "ai.grazie.api.gateway.client.api.meta.ToneAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class ToneAPIClient$predictFormalityTone$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     ToneAPIClient$predictFormalityTone$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return ToneAPIClient.this.predictFormalityTone(null, null, null, null, false, (Continuation<? super DocFormalityTone>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\meta\ToneAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */