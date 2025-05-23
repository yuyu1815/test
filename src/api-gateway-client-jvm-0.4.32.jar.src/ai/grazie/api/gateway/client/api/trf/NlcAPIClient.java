/*    */ package ai.grazie.api.gateway.client.api.trf;
/*    */ 
/*    */ import ai.grazie.client.common.logging.AnnotationLogger;
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\030\0002\0020\001B/\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013¢\006\002\020\fJ(\020\021\032\0020\0222\006\020\023\032\0020\0032\006\020\024\032\0020\0252\b\b\002\020\026\032\0020\003H@¢\006\002\020\027J0\020\021\032\0020\0302\006\020\023\032\0020\0032\006\020\031\032\0020\0032\006\020\024\032\0020\0252\b\b\002\020\026\032\0020\003H@¢\006\002\020\032J(\020\033\032\0020\0342\006\020\023\032\0020\0032\006\020\024\032\0020\0252\b\b\002\020\026\032\0020\003H@¢\006\002\020\027R\032\020\n\032\0020\013X\016¢\006\016\n\000\032\004\b\r\020\016\"\004\b\017\020\020¨\006\035"}, d2 = {"Lai/grazie/api/gateway/client/api/trf/NlcAPIClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "serverUrl", "", "authType", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "annotationLogger", "Lai/grazie/client/common/logging/AnnotationLogger;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;Lai/grazie/client/common/logging/AnnotationLogger;)V", "getAnnotationLogger", "()Lai/grazie/client/common/logging/AnnotationLogger;", "setAnnotationLogger", "(Lai/grazie/client/common/logging/AnnotationLogger;)V", "complete", "Lai/grazie/nlc/PrefixWithCompletions;", "context", "language", "Lai/grazie/nlp/langs/Language;", "profile", "(Ljava/lang/String;Lai/grazie/nlp/langs/Language;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lai/grazie/nlc/SentenceWithCompletions;", "prefix", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/nlp/langs/Language;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completeWithoutPrefix", "Lai/grazie/nlc/ContextWithCompletions;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nNlcAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NlcAPIClient.kt\nai/grazie/api/gateway/client/api/trf/NlcAPIClient\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 HTTPResponseExtensions.kt\nai/grazie/client/common/model/HTTPResponseExtensionsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,37:1\n62#2,6:38\n62#2,6:54\n62#2,6:70\n7#3,2:44\n7#3,2:60\n7#3,2:76\n1557#4:46\n1628#4,3:47\n1557#4:62\n1628#4,3:63\n37#5:50\n36#5,3:51\n37#5:66\n36#5,3:67\n*S KotlinDebug\n*F\n+ 1 NlcAPIClient.kt\nai/grazie/api/gateway/client/api/trf/NlcAPIClient\n*L\n19#1:38,6\n26#1:54,6\n32#1:70,6\n20#1:44,2\n27#1:60,2\n33#1:76,2\n21#1:46\n21#1:47,3\n28#1:62\n28#1:63,3\n21#1:50\n21#1:51,3\n28#1:66\n28#1:67,3\n*E\n"})
/*    */ public final class NlcAPIClient extends SuspendableCloudClient {
/*    */   @NotNull
/* 15 */   public AnnotationLogger getAnnotationLogger() { return this.annotationLogger; } @NotNull private AnnotationLogger annotationLogger; public void setAnnotationLogger(@NotNull AnnotationLogger <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.annotationLogger = <set-?>; } public NlcAPIClient(@NotNull String serverUrl, @NotNull AuthType authType, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json, @NotNull AnnotationLogger annotationLogger) {
/* 16 */     super(serverUrl, authType, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */     this.annotationLogger = annotationLogger;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object complete(@NotNull String context, @NotNull String prefix, @NotNull Language language, @NotNull String profile, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #5
/*    */     //   2: instanceof ai/grazie/api/gateway/client/api/trf/NlcAPIClient$complete$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #5
/*    */     //   10: checkcast ai/grazie/api/gateway/client/api/trf/NlcAPIClient$complete$1
/*    */     //   13: astore #20
/*    */     //   15: aload #20
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #20
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new ai/grazie/api/gateway/client/api/trf/NlcAPIClient$complete$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #5
/*    */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/trf/NlcAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #20
/*    */     //   53: aload #20
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #19
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #24
/*    */     //   65: aload #20
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 445, 0 -> 92, 1 -> 199
/*    */     //   92: aload #19
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: getstatic ai/grazie/api/gateway/api/trf/NlcAPI$Complete$V1.INSTANCE : Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V1;
/*    */     //   100: checkcast ai/grazie/model/cloud/API
/*    */     //   103: astore #7
/*    */     //   105: new ai/grazie/api/gateway/api/trf/NlcAPI$Complete$V1$Request
/*    */     //   108: dup
/*    */     //   109: aload_1
/*    */     //   110: aload_2
/*    */     //   111: aload_3
/*    */     //   112: aload #4
/*    */     //   114: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lai/grazie/nlp/langs/Language;Ljava/lang/String;)V
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
/*    */     //   148: new ai/grazie/api/gateway/client/api/trf/NlcAPIClient$complete$$inlined$sendAndGet$default$1
/*    */     //   151: dup
/*    */     //   152: aload #7
/*    */     //   154: aload #10
/*    */     //   156: aload #8
/*    */     //   158: aload #9
/*    */     //   160: aconst_null
/*    */     //   161: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/utils/json/JSON;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   164: checkcast kotlin/jvm/functions/Function2
/*    */     //   167: aload #20
/*    */     //   169: aload #20
/*    */     //   171: aload_1
/*    */     //   172: putfield L$0 : Ljava/lang/Object;
/*    */     //   175: aload #20
/*    */     //   177: aload_2
/*    */     //   178: putfield L$1 : Ljava/lang/Object;
/*    */     //   181: aload #20
/*    */     //   183: iconst_1
/*    */     //   184: putfield label : I
/*    */     //   187: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   190: dup
/*    */     //   191: aload #24
/*    */     //   193: if_acmpne -> 227
/*    */     //   196: aload #24
/*    */     //   198: areturn
/*    */     //   199: iconst_0
/*    */     //   200: istore #11
/*    */     //   202: aload #20
/*    */     //   204: getfield L$1 : Ljava/lang/Object;
/*    */     //   207: checkcast java/lang/String
/*    */     //   210: astore_2
/*    */     //   211: aload #20
/*    */     //   213: getfield L$0 : Ljava/lang/Object;
/*    */     //   216: checkcast java/lang/String
/*    */     //   219: astore_1
/*    */     //   220: aload #19
/*    */     //   222: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   225: aload #19
/*    */     //   227: nop
/*    */     //   228: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   231: astore #7
/*    */     //   233: nop
/*    */     //   234: getstatic ai/grazie/api/gateway/api/trf/NlcAPI$Complete$V1$Response.Companion : Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V1$Response$Companion;
/*    */     //   237: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   240: astore #8
/*    */     //   242: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   245: checkcast ai/grazie/utils/json/JSON
/*    */     //   248: astore #9
/*    */     //   250: iconst_0
/*    */     //   251: istore #10
/*    */     //   253: aload #9
/*    */     //   255: aload #8
/*    */     //   257: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   260: aload #7
/*    */     //   262: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   265: dup
/*    */     //   266: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   269: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   272: checkcast ai/grazie/api/gateway/api/trf/NlcAPI$Complete$V1$Response
/*    */     //   275: astore #6
/*    */     //   277: aload_1
/*    */     //   278: aload_2
/*    */     //   279: aload #6
/*    */     //   281: invokevirtual getCompletions : ()Ljava/util/List;
/*    */     //   284: checkcast java/lang/Iterable
/*    */     //   287: astore #7
/*    */     //   289: astore #17
/*    */     //   291: astore #16
/*    */     //   293: iconst_0
/*    */     //   294: istore #8
/*    */     //   296: aload #7
/*    */     //   298: astore #9
/*    */     //   300: new java/util/ArrayList
/*    */     //   303: dup
/*    */     //   304: aload #7
/*    */     //   306: bipush #10
/*    */     //   308: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */     //   311: invokespecial <init> : (I)V
/*    */     //   314: checkcast java/util/Collection
/*    */     //   317: astore #10
/*    */     //   319: iconst_0
/*    */     //   320: istore #11
/*    */     //   322: aload #9
/*    */     //   324: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   329: astore #12
/*    */     //   331: aload #12
/*    */     //   333: invokeinterface hasNext : ()Z
/*    */     //   338: ifeq -> 385
/*    */     //   341: aload #12
/*    */     //   343: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   348: astore #13
/*    */     //   350: aload #10
/*    */     //   352: aload #13
/*    */     //   354: checkcast java/lang/String
/*    */     //   357: astore #14
/*    */     //   359: astore #18
/*    */     //   361: iconst_0
/*    */     //   362: istore #15
/*    */     //   364: new ai/grazie/nlc/SentenceWithCompletions$Completion
/*    */     //   367: dup
/*    */     //   368: aload #14
/*    */     //   370: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   373: aload #18
/*    */     //   375: swap
/*    */     //   376: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   381: pop
/*    */     //   382: goto -> 331
/*    */     //   385: aload #10
/*    */     //   387: checkcast java/util/List
/*    */     //   390: nop
/*    */     //   391: astore #18
/*    */     //   393: aload #16
/*    */     //   395: aload #17
/*    */     //   397: aload #18
/*    */     //   399: checkcast java/util/Collection
/*    */     //   402: astore #7
/*    */     //   404: iconst_0
/*    */     //   405: istore #8
/*    */     //   407: aload #7
/*    */     //   409: astore #9
/*    */     //   411: aload #9
/*    */     //   413: iconst_0
/*    */     //   414: anewarray ai/grazie/nlc/SentenceWithCompletions$Completion
/*    */     //   417: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
/*    */     //   422: checkcast [Lai/grazie/nlc/SentenceWithCompletions$Completion;
/*    */     //   425: astore #21
/*    */     //   427: astore #22
/*    */     //   429: astore #23
/*    */     //   431: new ai/grazie/nlc/SentenceWithCompletions
/*    */     //   434: dup
/*    */     //   435: aload #23
/*    */     //   437: aload #22
/*    */     //   439: aload #21
/*    */     //   441: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;[Lai/grazie/nlc/SentenceWithCompletions$Completion;)V
/*    */     //   444: areturn
/*    */     //   445: new java/lang/IllegalStateException
/*    */     //   448: dup
/*    */     //   449: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   451: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   454: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #18	-> 63
/*    */     //   #19	-> 97
/*    */     //   #38	-> 119
/*    */     //   #41	-> 119
/*    */     //   #38	-> 132
/*    */     //   #42	-> 132
/*    */     //   #38	-> 141
/*    */     //   #43	-> 144
/*    */     //   #18	-> 196
/*    */     //   #43	-> 227
/*    */     //   #20	-> 233
/*    */     //   #44	-> 234
/*    */     //   #45	-> 253
/*    */     //   #20	-> 272
/*    */     //   #19	-> 275
/*    */     //   #21	-> 277
/*    */     //   #46	-> 296
/*    */     //   #47	-> 322
/*    */     //   #48	-> 350
/*    */     //   #21	-> 364
/*    */     //   #48	-> 376
/*    */     //   #49	-> 385
/*    */     //   #46	-> 390
/*    */     //   #21	-> 404
/*    */     //   #50	-> 407
/*    */     //   #51	-> 409
/*    */     //   #53	-> 411
/*    */     //   #21	-> 425
/*    */     //   #18	-> 445
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	93	0	this	Lai/grazie/api/gateway/client/api/trf/NlcAPIClient;
/*    */     //   97	102	1	context	Ljava/lang/String;
/*    */     //   220	8	1	context	Ljava/lang/String;
/*    */     //   228	44	1	context	Ljava/lang/String;
/*    */     //   272	21	1	context	Ljava/lang/String;
/*    */     //   97	102	2	prefix	Ljava/lang/String;
/*    */     //   211	17	2	prefix	Ljava/lang/String;
/*    */     //   228	44	2	prefix	Ljava/lang/String;
/*    */     //   272	21	2	prefix	Ljava/lang/String;
/*    */     //   97	22	3	language	Lai/grazie/nlp/langs/Language;
/*    */     //   97	22	4	profile	Ljava/lang/String;
/*    */     //   277	16	6	completions	Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V1$Response;
/*    */     //   119	71	7	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   233	39	7	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   293	26	7	$this$map$iv	Ljava/lang/Iterable;
/*    */     //   404	18	7	$this$toTypedArray$iv	Ljava/util/Collection;
/*    */     //   119	71	8	content$iv	Ljava/lang/Object;
/*    */     //   242	30	8	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   132	58	9	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   250	22	9	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   319	12	9	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   411	11	9	thisCollection$iv	Ljava/util/Collection;
/*    */     //   141	49	10	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   319	68	10	destination$iv$iv	Ljava/util/Collection;
/*    */     //   350	32	13	item$iv$iv	Ljava/lang/Object;
/*    */     //   361	12	14	it	Ljava/lang/String;
/*    */     //   144	55	11	$i$f$sendAndGet	I
/*    */     //   253	19	10	$i$f$get	I
/*    */     //   364	9	15	$i$a$-map-NlcAPIClient$complete$2	I
/*    */     //   322	65	11	$i$f$mapTo	I
/*    */     //   296	95	8	$i$f$map	I
/*    */     //   407	15	8	$i$f$toTypedArray	I
/*    */     //   0	455	5	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	392	20	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	385	19	$result	Ljava/lang/Object;
/*    */     //   202	26	11	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @Deprecated(message = "JBAI-6817", replaceWith = @ReplaceWith(expression = "complete(context, language, profile): PrefixWithCompletions", imports = {}))
/*    */   @Nullable
/*    */   public final Object completeWithoutPrefix(@NotNull String context, @NotNull Language language, @NotNull String profile, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof ai/grazie/api/gateway/client/api/trf/NlcAPIClient$completeWithoutPrefix$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast ai/grazie/api/gateway/client/api/trf/NlcAPIClient$completeWithoutPrefix$1
/*    */     //   13: astore #18
/*    */     //   15: aload #18
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #18
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new ai/grazie/api/gateway/client/api/trf/NlcAPIClient$completeWithoutPrefix$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/trf/NlcAPIClient;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #18
/*    */     //   53: aload #18
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #17
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #21
/*    */     //   65: aload #18
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 416, 0 -> 92, 1 -> 191
/*    */     //   92: aload #17
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: getstatic ai/grazie/api/gateway/api/trf/NlcAPI$Complete$V2.INSTANCE : Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V2;
/*    */     //   100: checkcast ai/grazie/model/cloud/API
/*    */     //   103: astore #6
/*    */     //   105: new ai/grazie/api/gateway/api/trf/NlcAPI$Complete$V2$Request
/*    */     //   108: dup
/*    */     //   109: aload_1
/*    */     //   110: aload_2
/*    */     //   111: aload_3
/*    */     //   112: invokespecial <init> : (Ljava/lang/String;Lai/grazie/nlp/langs/Language;Ljava/lang/String;)V
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
/*    */     //   146: new ai/grazie/api/gateway/client/api/trf/NlcAPIClient$completeWithoutPrefix$$inlined$sendAndGet$default$1
/*    */     //   149: dup
/*    */     //   150: aload #6
/*    */     //   152: aload #9
/*    */     //   154: aload #7
/*    */     //   156: aload #8
/*    */     //   158: aconst_null
/*    */     //   159: invokespecial <init> : (Lai/grazie/model/cloud/API;Lai/grazie/utils/json/JSON;Ljava/lang/Object;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)V
/*    */     //   162: checkcast kotlin/jvm/functions/Function2
/*    */     //   165: aload #18
/*    */     //   167: aload #18
/*    */     //   169: aload_1
/*    */     //   170: putfield L$0 : Ljava/lang/Object;
/*    */     //   173: aload #18
/*    */     //   175: iconst_1
/*    */     //   176: putfield label : I
/*    */     //   179: invokestatic withAnnotationsLog : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   182: dup
/*    */     //   183: aload #21
/*    */     //   185: if_acmpne -> 210
/*    */     //   188: aload #21
/*    */     //   190: areturn
/*    */     //   191: iconst_0
/*    */     //   192: istore #10
/*    */     //   194: aload #18
/*    */     //   196: getfield L$0 : Ljava/lang/Object;
/*    */     //   199: checkcast java/lang/String
/*    */     //   202: astore_1
/*    */     //   203: aload #17
/*    */     //   205: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   208: aload #17
/*    */     //   210: nop
/*    */     //   211: checkcast ai/grazie/client/common/model/HTTPResponse
/*    */     //   214: astore #6
/*    */     //   216: nop
/*    */     //   217: getstatic ai/grazie/api/gateway/api/trf/NlcAPI$Complete$V2$Response.Companion : Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V2$Response$Companion;
/*    */     //   220: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*    */     //   223: astore #7
/*    */     //   225: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*    */     //   228: checkcast ai/grazie/utils/json/JSON
/*    */     //   231: astore #8
/*    */     //   233: iconst_0
/*    */     //   234: istore #9
/*    */     //   236: aload #8
/*    */     //   238: aload #7
/*    */     //   240: checkcast kotlinx/serialization/DeserializationStrategy
/*    */     //   243: aload #6
/*    */     //   245: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   248: dup
/*    */     //   249: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   252: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   255: checkcast ai/grazie/api/gateway/api/trf/NlcAPI$Complete$V2$Response
/*    */     //   258: astore #5
/*    */     //   260: aload_1
/*    */     //   261: aload #5
/*    */     //   263: invokevirtual getCompletions : ()Ljava/util/List;
/*    */     //   266: checkcast java/lang/Iterable
/*    */     //   269: astore #6
/*    */     //   271: astore #15
/*    */     //   273: iconst_0
/*    */     //   274: istore #7
/*    */     //   276: aload #6
/*    */     //   278: astore #8
/*    */     //   280: new java/util/ArrayList
/*    */     //   283: dup
/*    */     //   284: aload #6
/*    */     //   286: bipush #10
/*    */     //   288: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */     //   291: invokespecial <init> : (I)V
/*    */     //   294: checkcast java/util/Collection
/*    */     //   297: astore #9
/*    */     //   299: iconst_0
/*    */     //   300: istore #10
/*    */     //   302: aload #8
/*    */     //   304: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   309: astore #11
/*    */     //   311: aload #11
/*    */     //   313: invokeinterface hasNext : ()Z
/*    */     //   318: ifeq -> 365
/*    */     //   321: aload #11
/*    */     //   323: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   328: astore #12
/*    */     //   330: aload #9
/*    */     //   332: aload #12
/*    */     //   334: checkcast java/lang/String
/*    */     //   337: astore #13
/*    */     //   339: astore #16
/*    */     //   341: iconst_0
/*    */     //   342: istore #14
/*    */     //   344: new ai/grazie/nlc/ContextWithCompletions$Completion
/*    */     //   347: dup
/*    */     //   348: aload #13
/*    */     //   350: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   353: aload #16
/*    */     //   355: swap
/*    */     //   356: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   361: pop
/*    */     //   362: goto -> 311
/*    */     //   365: aload #9
/*    */     //   367: checkcast java/util/List
/*    */     //   370: nop
/*    */     //   371: aload #15
/*    */     //   373: swap
/*    */     //   374: checkcast java/util/Collection
/*    */     //   377: astore #6
/*    */     //   379: iconst_0
/*    */     //   380: istore #7
/*    */     //   382: aload #6
/*    */     //   384: astore #8
/*    */     //   386: aload #8
/*    */     //   388: iconst_0
/*    */     //   389: anewarray ai/grazie/nlc/ContextWithCompletions$Completion
/*    */     //   392: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
/*    */     //   397: checkcast [Lai/grazie/nlc/ContextWithCompletions$Completion;
/*    */     //   400: astore #19
/*    */     //   402: astore #20
/*    */     //   404: new ai/grazie/nlc/ContextWithCompletions
/*    */     //   407: dup
/*    */     //   408: aload #20
/*    */     //   410: aload #19
/*    */     //   412: invokespecial <init> : (Ljava/lang/String;[Lai/grazie/nlc/ContextWithCompletions$Completion;)V
/*    */     //   415: areturn
/*    */     //   416: new java/lang/IllegalStateException
/*    */     //   419: dup
/*    */     //   420: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   422: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   425: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #25	-> 63
/*    */     //   #26	-> 97
/*    */     //   #54	-> 117
/*    */     //   #57	-> 117
/*    */     //   #54	-> 130
/*    */     //   #58	-> 130
/*    */     //   #54	-> 139
/*    */     //   #59	-> 142
/*    */     //   #25	-> 188
/*    */     //   #59	-> 210
/*    */     //   #27	-> 216
/*    */     //   #60	-> 217
/*    */     //   #61	-> 236
/*    */     //   #27	-> 255
/*    */     //   #26	-> 258
/*    */     //   #28	-> 260
/*    */     //   #62	-> 276
/*    */     //   #63	-> 302
/*    */     //   #64	-> 330
/*    */     //   #28	-> 344
/*    */     //   #64	-> 356
/*    */     //   #65	-> 365
/*    */     //   #62	-> 370
/*    */     //   #28	-> 379
/*    */     //   #66	-> 382
/*    */     //   #67	-> 384
/*    */     //   #69	-> 386
/*    */     //   #28	-> 400
/*    */     //   #25	-> 416
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	85	0	this	Lai/grazie/api/gateway/client/api/trf/NlcAPIClient;
/*    */     //   97	94	1	context	Ljava/lang/String;
/*    */     //   203	8	1	context	Ljava/lang/String;
/*    */     //   211	44	1	context	Ljava/lang/String;
/*    */     //   255	18	1	context	Ljava/lang/String;
/*    */     //   97	20	2	language	Lai/grazie/nlp/langs/Language;
/*    */     //   97	20	3	profile	Ljava/lang/String;
/*    */     //   260	13	5	response	Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V2$Response;
/*    */     //   117	65	6	api$iv	Lai/grazie/model/cloud/API;
/*    */     //   216	39	6	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*    */     //   273	26	6	$this$map$iv	Ljava/lang/Iterable;
/*    */     //   379	18	6	$this$toTypedArray$iv	Ljava/util/Collection;
/*    */     //   117	65	7	content$iv	Ljava/lang/Object;
/*    */     //   225	30	7	serializer$iv	Lkotlinx/serialization/KSerializer;
/*    */     //   130	52	8	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*    */     //   233	22	8	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   299	12	8	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   386	11	8	thisCollection$iv	Ljava/util/Collection;
/*    */     //   139	43	9	json$iv	Lai/grazie/utils/json/JSON;
/*    */     //   299	68	9	destination$iv$iv	Ljava/util/Collection;
/*    */     //   330	32	12	item$iv$iv	Ljava/lang/Object;
/*    */     //   341	12	13	it	Ljava/lang/String;
/*    */     //   142	49	10	$i$f$sendAndGet	I
/*    */     //   236	19	9	$i$f$get	I
/*    */     //   344	9	14	$i$a$-map-NlcAPIClient$completeWithoutPrefix$2	I
/*    */     //   302	65	10	$i$f$mapTo	I
/*    */     //   276	95	7	$i$f$map	I
/*    */     //   382	15	7	$i$f$toTypedArray	I
/*    */     //   0	426	4	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	363	18	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	356	17	$result	Ljava/lang/Object;
/*    */     //   194	17	10	$i$f$sendAndGet	I
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object complete(@NotNull String context, @NotNull Language language, @NotNull String profile, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof ai/grazie/api/gateway/client/api/trf/NlcAPIClient$complete$3
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast ai/grazie/api/gateway/client/api/trf/NlcAPIClient$complete$3
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
/*    */     //   41: new ai/grazie/api/gateway/client/api/trf/NlcAPIClient$complete$3
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/trf/NlcAPIClient;Lkotlin/coroutines/Continuation;)V
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
/*    */     //   97: getstatic ai/grazie/api/gateway/api/trf/NlcAPI$Complete$V3.INSTANCE : Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V3;
/*    */     //   100: checkcast ai/grazie/model/cloud/API
/*    */     //   103: astore #6
/*    */     //   105: new ai/grazie/api/gateway/api/trf/NlcAPI$Complete$V3$Request
/*    */     //   108: dup
/*    */     //   109: aload_1
/*    */     //   110: aload_2
/*    */     //   111: aload_3
/*    */     //   112: invokespecial <init> : (Ljava/lang/String;Lai/grazie/nlp/langs/Language;Ljava/lang/String;)V
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
/*    */     //   146: new ai/grazie/api/gateway/client/api/trf/NlcAPIClient$complete$$inlined$sendAndGet$default$2
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
/*    */     //   202: getstatic ai/grazie/api/gateway/api/trf/NlcAPI$Complete$V3$Response.Companion : Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V3$Response$Companion;
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
/*    */     //   240: checkcast ai/grazie/api/gateway/api/trf/NlcAPI$Complete$V3$Response
/*    */     //   243: astore #5
/*    */     //   245: aload #5
/*    */     //   247: invokevirtual getCompletions : ()Lai/grazie/nlc/PrefixWithCompletions;
/*    */     //   250: areturn
/*    */     //   251: new java/lang/IllegalStateException
/*    */     //   254: dup
/*    */     //   255: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   257: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   260: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #31	-> 63
/*    */     //   #32	-> 97
/*    */     //   #70	-> 117
/*    */     //   #73	-> 117
/*    */     //   #70	-> 130
/*    */     //   #74	-> 130
/*    */     //   #70	-> 139
/*    */     //   #75	-> 142
/*    */     //   #31	-> 182
/*    */     //   #75	-> 195
/*    */     //   #33	-> 201
/*    */     //   #76	-> 202
/*    */     //   #77	-> 221
/*    */     //   #33	-> 240
/*    */     //   #32	-> 243
/*    */     //   #34	-> 245
/*    */     //   #31	-> 251
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	79	0	this	Lai/grazie/api/gateway/client/api/trf/NlcAPIClient;
/*    */     //   97	20	1	context	Ljava/lang/String;
/*    */     //   97	20	2	language	Lai/grazie/nlp/langs/Language;
/*    */     //   97	20	3	profile	Ljava/lang/String;
/*    */     //   245	6	5	response	Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V3$Response;
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
/*    */   @DebugMetadata(f = "NlcAPIClient.kt", l = {43}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"context", "prefix"}, m = "complete", c = "ai.grazie.api.gateway.client.api.trf.NlcAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class NlcAPIClient$complete$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     NlcAPIClient$complete$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return NlcAPIClient.this.complete(null, null, null, null, (Continuation<? super SentenceWithCompletions>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "NlcAPIClient.kt", l = {43}, i = {}, s = {}, n = {}, m = "complete", c = "ai.grazie.api.gateway.client.api.trf.NlcAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class NlcAPIClient$complete$3 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     NlcAPIClient$complete$3(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return NlcAPIClient.this.complete(null, null, null, (Continuation<? super PrefixWithCompletions>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "NlcAPIClient.kt", l = {43}, i = {0}, s = {"L$0"}, n = {"context"}, m = "completeWithoutPrefix", c = "ai.grazie.api.gateway.client.api.trf.NlcAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class NlcAPIClient$completeWithoutPrefix$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     NlcAPIClient$completeWithoutPrefix$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return NlcAPIClient.this.completeWithoutPrefix(null, null, null, (Continuation<? super ContextWithCompletions>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\trf\NlcAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */