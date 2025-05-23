/*    */ package ai.grazie.api.gateway.client.api;
/*    */ 
/*    */ import ai.grazie.client.common.SuspendableHTTPClient;
/*    */ import ai.grazie.client.common.logging.AnnotationLogger;
/*    */ import ai.grazie.feedback.FeedbackBody;
/*    */ import ai.grazie.model.cloud.AuthType;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\030\002\n\002\b\003\030\0002\0020\001B/\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013¢\006\002\020\fJ\"\020\021\032\0020\0222\006\020\023\032\0020\0242\n\b\002\020\025\032\004\030\0010\003H@¢\006\002\020\026R\032\020\n\032\0020\013X\016¢\006\016\n\000\032\004\b\r\020\016\"\004\b\017\020\020¨\006\027"}, d2 = {"Lai/grazie/api/gateway/client/api/FeedbackAPIClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "serverUrl", "", "authType", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "annotationLogger", "Lai/grazie/client/common/logging/AnnotationLogger;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;Lai/grazie/client/common/logging/AnnotationLogger;)V", "getAnnotationLogger", "()Lai/grazie/client/common/logging/AnnotationLogger;", "setAnnotationLogger", "(Lai/grazie/client/common/logging/AnnotationLogger;)V", "report", "", "feedback", "Lai/grazie/feedback/FeedbackBody;", "additionalData", "(Lai/grazie/feedback/FeedbackBody;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nFeedbackAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedbackAPIClient.kt\nai/grazie/api/gateway/client/api/FeedbackAPIClient\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 HTTPResponseExtensions.kt\nai/grazie/client/common/model/HTTPResponseExtensionsKt\n*L\n1#1,25:1\n62#2,6:26\n7#3,2:32\n*S KotlinDebug\n*F\n+ 1 FeedbackAPIClient.kt\nai/grazie/api/gateway/client/api/FeedbackAPIClient\n*L\n21#1:26,6\n21#1:32,2\n*E\n"})
/*    */ public final class FeedbackAPIClient extends SuspendableCloudClient {
/*    */   @NotNull
/* 17 */   public AnnotationLogger getAnnotationLogger() { return this.annotationLogger; } @NotNull private AnnotationLogger annotationLogger; public void setAnnotationLogger(@NotNull AnnotationLogger <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.annotationLogger = <set-?>; } public FeedbackAPIClient(@NotNull String serverUrl, @NotNull AuthType authType, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json, @NotNull AnnotationLogger annotationLogger) {
/* 18 */     super(serverUrl, authType, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */     this.annotationLogger = annotationLogger;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object report(@NotNull FeedbackBody feedback, @Nullable String additionalData, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof ai/grazie/api/gateway/client/api/FeedbackAPIClient$report$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast ai/grazie/api/gateway/client/api/FeedbackAPIClient$report$1
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
/*    */     //   39: new ai/grazie/api/gateway/client/api/FeedbackAPIClient$report$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/FeedbackAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #11
/*    */     //   50: aload #11
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #10
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #12
/*    */     //   62: aload #11
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 249, 0 -> 88, 1 -> 180
/*    */     //   88: aload #10
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: getstatic ai/grazie/api/gateway/api/FeedbackAPI$Report.INSTANCE : Lai/grazie/api/gateway/api/FeedbackAPI$Report;
/*    */     //   96: checkcast ai/grazie/model/cloud/API
/*    */     //   99: astore #5
/*    */     //   101: new ai/grazie/api/gateway/api/FeedbackAPI$Report$Request
/*    */     //   104: dup
/*    */     //   105: aload_1
/*    */     //   106: aload_2
/*    */     //   107: invokespecial <init> : (Lai/grazie/feedback/FeedbackBody;Ljava/lang/String;)V
/*    */     //   110: astore #6
/*    */     //   112: new ai/grazie/client/common/model/RequestOptions
/*    */     //   115: dup
/*    */     //   116: aconst_null
/*    */     //   117: aconst_null
/*    */     //   118: iconst_3
/*    */     //   119: aconst_null
/*    */     //   120: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   123: astore #7
/*    */     //   125: aload_0
/*    */     //   126: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   129: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   132: astore #8
/*    */     //   134: iconst_0
/*    */     //   135: istore #9
/*    */     //   137: aload_0
/*    */     //   138: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   141: new ai/grazie/api/gateway/client/api/FeedbackAPIClient$report$$inlined$sendAndGet$default$1
/*    */     //   144: dup
/*    */     //   145: aload #5
/*    */     //   147: aload #8
/*    */     //   149: aload #6
/*    */     //   151: aload #7
/*    */     //   153: aconst_null
/*    */     //   154: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/utils/json/JSON;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   157: checkcast kotlin/jvm/functions/Function2
/*    */     //   160: aload #11
/*    */     //   162: aload #11
/*    */     //   164: iconst_1
/*    */     //   165: putfield label : I
/*    */     //   168: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   171: dup
/*    */     //   172: aload #12
/*    */     //   174: if_acmpne -> 190
/*    */     //   177: aload #12
/*    */     //   179: areturn
/*    */     //   180: iconst_0
/*    */     //   181: istore #9
/*    */     //   183: aload #10
/*    */     //   185: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   188: aload #10
/*    */     //   190: nop
/*    */     //   191: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   194: astore #5
/*    */     //   196: nop
/*    */     //   197: getstatic ai/grazie/api/gateway/api/FeedbackAPI$Report$Response.Companion : Lai/grazie/api/gateway/api/FeedbackAPI$Report$Response$Companion;
/*    */     //   200: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   203: astore #6
/*    */     //   205: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   208: checkcast ai/grazie/utils/json/JSON
/*    */     //   211: astore #7
/*    */     //   213: iconst_0
/*    */     //   214: istore #8
/*    */     //   216: aload #7
/*    */     //   218: aload #6
/*    */     //   220: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   223: aload #5
/*    */     //   225: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   228: dup
/*    */     //   229: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   232: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   235: checkcast ai/grazie/api/gateway/api/FeedbackAPI$Report$Response
/*    */     //   238: astore #4
/*    */     //   240: aload #4
/*    */     //   242: invokevirtual isOk : ()Z
/*    */     //   245: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   248: areturn
/*    */     //   249: new java/lang/IllegalStateException
/*    */     //   252: dup
/*    */     //   253: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   255: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   258: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 60
/*    */     //   #21	-> 93
/*    */     //   #26	-> 112
/*    */     //   #29	-> 112
/*    */     //   #26	-> 125
/*    */     //   #30	-> 125
/*    */     //   #26	-> 134
/*    */     //   #31	-> 137
/*    */     //   #20	-> 177
/*    */     //   #31	-> 190
/*    */     //   #21	-> 196
/*    */     //   #32	-> 197
/*    */     //   #33	-> 216
/*    */     //   #21	-> 235
/*    */     //   #22	-> 240
/*    */     //   #20	-> 249
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	78	0	this	Lai/grazie/api/gateway/client/api/FeedbackAPIClient;
/*    */     //   93	19	1	feedback	Lai/grazie/feedback/FeedbackBody;
/*    */     //   93	19	2	additionalData	Ljava/lang/String;
/*    */     //   240	9	4	response	Lai/grazie/api/gateway/api/FeedbackAPI$Report$Response;
/*    */     //   112	59	5	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   196	39	5	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   112	59	6	content$iv	Ljava/lang/Object;
/*    */     //   205	30	6	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   125	46	7	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   213	22	7	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   134	37	8	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   137	43	9	$i$f$sendAndGet	I
/*    */     //   216	19	8	$i$f$get	I
/*    */     //   0	259	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	199	11	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	192	10	$result	Ljava/lang/Object;
/*    */     //   183	8	9	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "FeedbackAPIClient.kt", l = {31}, i = {}, s = {}, n = {}, m = "report", c = "ai.grazie.api.gateway.client.api.FeedbackAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class FeedbackAPIClient$report$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     FeedbackAPIClient$report$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return FeedbackAPIClient.this.report(null, null, (Continuation<? super Boolean>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\FeedbackAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */