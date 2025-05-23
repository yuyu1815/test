/*    */ package ai.grazie.api.gateway.client.api.meta;
/*    */ 
/*    */ import ai.grazie.client.common.SuspendableHTTPClient;
/*    */ import ai.grazie.client.common.logging.AnnotationLogger;
/*    */ import ai.grazie.model.cloud.AuthType;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\0002\0020\0012\0020\002B/\b\000\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n\022\006\020\013\032\0020\f¢\006\002\020\rJ(\020\022\032\004\030\0010\0232\006\020\024\032\0020\0042\006\020\025\032\0020\0262\006\020\027\032\0020\030H@¢\006\002\020\031R\032\020\013\032\0020\fX\016¢\006\016\n\000\032\004\b\016\020\017\"\004\b\020\020\021¨\006\032"}, d2 = {"Lai/grazie/api/gateway/client/api/meta/DefAPIClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "Lai/grazie/def/SuspendableMultiDefinitionService;", "server", "", "authType", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "annotationLogger", "Lai/grazie/client/common/logging/AnnotationLogger;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;Lai/grazie/client/common/logging/AnnotationLogger;)V", "getAnnotationLogger", "()Lai/grazie/client/common/logging/AnnotationLogger;", "setAnnotationLogger", "(Lai/grazie/client/common/logging/AnnotationLogger;)V", "define", "Lai/grazie/def/WordDefinition;", "text", "interval", "Lai/grazie/text/TextRange;", "language", "Lai/grazie/nlp/langs/Language;", "(Ljava/lang/String;Lai/grazie/text/TextRange;Lai/grazie/nlp/langs/Language;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nDefAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefAPIClient.kt\nai/grazie/api/gateway/client/api/meta/DefAPIClient\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 HTTPResponseExtensions.kt\nai/grazie/client/common/model/HTTPResponseExtensionsKt\n*L\n1#1,25:1\n62#2,6:26\n7#3,2:32\n*S KotlinDebug\n*F\n+ 1 DefAPIClient.kt\nai/grazie/api/gateway/client/api/meta/DefAPIClient\n*L\n21#1:26,6\n21#1:32,2\n*E\n"})
/*    */ public final class DefAPIClient extends SuspendableCloudClient implements SuspendableMultiDefinitionService {
/*    */   @NotNull
/* 17 */   public AnnotationLogger getAnnotationLogger() { return this.annotationLogger; } @NotNull private AnnotationLogger annotationLogger; public void setAnnotationLogger(@NotNull AnnotationLogger <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.annotationLogger = <set-?>; } public DefAPIClient(@NotNull String server, @NotNull AuthType authType, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json, @NotNull AnnotationLogger annotationLogger) {
/* 18 */     super(server, authType, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */     this.annotationLogger = annotationLogger;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object define(@NotNull String text, @NotNull TextRange interval, @NotNull Language language, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof ai/grazie/api/gateway/client/api/meta/DefAPIClient$define$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast ai/grazie/api/gateway/client/api/meta/DefAPIClient$define$1
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
/*    */     //   41: new ai/grazie/api/gateway/client/api/meta/DefAPIClient$define$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/meta/DefAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #12
/*    */     //   53: aload #12
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #11
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #13
/*    */     //   65: aload #12
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 251, 0 -> 92, 1 -> 185
/*    */     //   92: aload #11
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: getstatic ai/grazie/api/gateway/api/meta/DefAPI$Define$V2.INSTANCE : Lai/grazie/api/gateway/api/meta/DefAPI$Define$V2;
/*    */     //   100: checkcast ai/grazie/model/cloud/API
/*    */     //   103: astore #6
/*    */     //   105: new ai/grazie/api/gateway/api/meta/DefAPI$Define$V2$Request
/*    */     //   108: dup
/*    */     //   109: aload_1
/*    */     //   110: aload_2
/*    */     //   111: aload_3
/*    */     //   112: invokespecial <init> : (Ljava/lang/String;Lai/grazie/text/TextRange;Lai/grazie/nlp/langs/Language;)V
/*    */     //   115: astore #7
/*    */     //   117: new ai/grazie/client/common/model/RequestOptions
/*    */     //   120: dup
/*    */     //   121: aconst_null
/*    */     //   122: aconst_null
/*    */     //   123: iconst_3
/*    */     //   124: aconst_null
/*    */     //   125: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   128: astore #8
/*    */     //   130: aload_0
/*    */     //   131: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   134: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*    */     //   137: astore #9
/*    */     //   139: iconst_0
/*    */     //   140: istore #10
/*    */     //   142: aload_0
/*    */     //   143: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*    */     //   146: new ai/grazie/api/gateway/client/api/meta/DefAPIClient$define$$inlined$sendAndGet$default$1
/*    */     //   149: dup
/*    */     //   150: aload #6
/*    */     //   152: aload #9
/*    */     //   154: aload #7
/*    */     //   156: aload #8
/*    */     //   158: aconst_null
/*    */     //   159: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/utils/json/JSON;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   162: checkcast kotlin/jvm/functions/Function2
/*    */     //   165: aload #12
/*    */     //   167: aload #12
/*    */     //   169: iconst_1
/*    */     //   170: putfield label : I
/*    */     //   173: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   176: dup
/*    */     //   177: aload #13
/*    */     //   179: if_acmpne -> 195
/*    */     //   182: aload #13
/*    */     //   184: areturn
/*    */     //   185: iconst_0
/*    */     //   186: istore #10
/*    */     //   188: aload #11
/*    */     //   190: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   193: aload #11
/*    */     //   195: nop
/*    */     //   196: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   199: astore #6
/*    */     //   201: nop
/*    */     //   202: getstatic ai/grazie/api/gateway/api/meta/DefAPI$Define$V2$Response.Companion : Lai/grazie/api/gateway/api/meta/DefAPI$Define$V2$Response$Companion;
/*    */     //   205: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   208: astore #7
/*    */     //   210: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   213: checkcast ai/grazie/utils/json/JSON
/*    */     //   216: astore #8
/*    */     //   218: iconst_0
/*    */     //   219: istore #9
/*    */     //   221: aload #8
/*    */     //   223: aload #7
/*    */     //   225: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   228: aload #6
/*    */     //   230: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   233: dup
/*    */     //   234: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   237: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   240: checkcast ai/grazie/api/gateway/api/meta/DefAPI$Define$V2$Response
/*    */     //   243: astore #5
/*    */     //   245: aload #5
/*    */     //   247: invokevirtual getDescriptor : ()Lai/grazie/def/WordDefinition;
/*    */     //   250: areturn
/*    */     //   251: new java/lang/IllegalStateException
/*    */     //   254: dup
/*    */     //   255: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   257: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   260: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 63
/*    */     //   #21	-> 97
/*    */     //   #26	-> 117
/*    */     //   #29	-> 117
/*    */     //   #26	-> 130
/*    */     //   #30	-> 130
/*    */     //   #26	-> 139
/*    */     //   #31	-> 142
/*    */     //   #20	-> 182
/*    */     //   #31	-> 195
/*    */     //   #21	-> 201
/*    */     //   #32	-> 202
/*    */     //   #33	-> 221
/*    */     //   #21	-> 240
/*    */     //   #22	-> 245
/*    */     //   #20	-> 251
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	79	0	this	Lai/grazie/api/gateway/client/api/meta/DefAPIClient;
/*    */     //   97	20	1	text	Ljava/lang/String;
/*    */     //   97	20	2	interval	Lai/grazie/text/TextRange;
/*    */     //   97	20	3	language	Lai/grazie/nlp/langs/Language;
/*    */     //   245	6	5	result	Lai/grazie/api/gateway/api/meta/DefAPI$Define$V2$Response;
/*    */     //   117	59	6	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   201	39	6	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   117	59	7	content$iv	Ljava/lang/Object;
/*    */     //   210	30	7	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   130	46	8	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   218	22	8	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   139	37	9	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   142	43	10	$i$f$sendAndGet	I
/*    */     //   221	19	9	$i$f$get	I
/*    */     //   0	261	4	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	198	12	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	191	11	$result	Ljava/lang/Object;
/*    */     //   188	8	10	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "DefAPIClient.kt", l = {31}, i = {}, s = {}, n = {}, m = "define", c = "ai.grazie.api.gateway.client.api.meta.DefAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class DefAPIClient$define$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     DefAPIClient$define$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return DefAPIClient.this.define(null, null, null, (Continuation<? super WordDefinition>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\meta\DefAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */