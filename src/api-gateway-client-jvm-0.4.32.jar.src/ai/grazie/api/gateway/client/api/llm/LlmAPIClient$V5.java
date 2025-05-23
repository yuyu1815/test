/*     */ package ai.grazie.api.gateway.client.api.llm;
/*     */ 
/*     */ import ai.grazie.api.gateway.api.llm.LlmAPI;
/*     */ import ai.grazie.model.llm.chat.v5.LLMChat;
/*     */ import ai.grazie.model.llm.data.stream.LLMStreamData;
/*     */ import ai.grazie.model.llm.profile.LLMProfileID;
/*     */ import ai.grazie.model.llm.prompt.LLMPromptID;
/*     */ import ai.grazie.utils.attributes.Attributes;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\004\030\0002\0020\001B\005¢\006\002\020\002J\034\020\003\032\b\022\004\022\0020\0050\0042\006\020\006\032\0020\007H@¢\006\002\020\bJ-\020\003\032\b\022\004\022\0020\0050\0042\027\020\t\032\023\022\004\022\0020\013\022\004\022\0020\f0\n¢\006\002\b\rH@¢\006\002\020\016J6\020\003\032\b\022\004\022\0020\0050\0042\006\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\003\032\0020\0232\b\b\002\020\024\032\0020\025H@¢\006\002\020\026¨\006\027"}, d2 = {"Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V5;", "", "(Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;)V", "chat", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/model/llm/data/stream/LLMStreamData;", "request", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V5$Request;", "(Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V5$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "builder", "Lkotlin/Function1;", "Lai/grazie/api/gateway/client/api/llm/ChatRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prompt", "Lai/grazie/model/llm/prompt/LLMPromptID;", "profile", "Lai/grazie/model/llm/profile/LLMProfileID;", "Lai/grazie/model/llm/chat/v5/LLMChat;", "parameters", "Lai/grazie/utils/attributes/Attributes;", "(Lai/grazie/model/llm/prompt/LLMPromptID;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/model/llm/chat/v5/LLMChat;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*     */ @SourceDebugExtension({"SMAP\nLlmAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LlmAPIClient.kt\nai/grazie/api/gateway/client/api/llm/LlmAPIClient$V5\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n+ 4 JSON.kt\nai/grazie/utils/json/JSON\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,429:1\n77#2,8:430\n86#3:438\n87#3:440\n88#3,3:446\n28#4:439\n49#5:441\n51#5:445\n49#5:449\n51#5:453\n46#6:442\n51#6:444\n46#6:450\n51#6:452\n105#7:443\n105#7:451\n*S KotlinDebug\n*F\n+ 1 LlmAPIClient.kt\nai/grazie/api/gateway/client/api/llm/LlmAPIClient$V5\n*L\n133#1:430,8\n133#1:438\n133#1:440\n133#1:446,3\n133#1:439\n133#1:441\n133#1:445\n135#1:449\n135#1:453\n133#1:442\n133#1:444\n135#1:450\n135#1:452\n133#1:443\n135#1:451\n*E\n"})
/*     */ public final class V5
/*     */ {
/*     */   @Nullable
/*     */   public final Object chat(@NotNull LLMPromptID prompt, @NotNull LLMProfileID profile, @NotNull LLMChat chat, @NotNull Attributes parameters, @NotNull Continuation<? super Flow<? extends LLMStreamData>> $completion) {
/* 117 */     return chat(new LlmAPI.Chat.Stream.V5.Request(prompt, profile, chat, parameters), $completion);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Object chat(@NotNull Function1 builder, @NotNull Continuation<? super Flow<? extends LLMStreamData>> $completion) {
/* 129 */     ChatRequestBuilder chatRequestBuilder = new ChatRequestBuilder(); builder.invoke(chatRequestBuilder); return chat(chatRequestBuilder.build(), $completion);
/*     */   }
/*     */   
/*     */   private final Object chat(LlmAPI.Chat.Stream.V5.Request request, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V5$chat$3
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V5$chat$3
/*     */     //   11: astore #22
/*     */     //   13: aload #22
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #22
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V5$chat$3
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V5;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #22
/*     */     //   50: aload #22
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #21
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #23
/*     */     //   62: aload #22
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 408, 0 -> 88, 1 -> 237
/*     */     //   88: aload #21
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: getfield this$0 : Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;
/*     */     //   97: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*     */     //   100: astore #4
/*     */     //   102: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V5.INSTANCE : Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V5;
/*     */     //   105: checkcast ai/grazie/model/cloud/API
/*     */     //   108: astore #5
/*     */     //   110: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V5$LLMData.Companion : Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V5$LLMData$Companion;
/*     */     //   113: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   116: astore #6
/*     */     //   118: iconst_0
/*     */     //   119: istore #7
/*     */     //   121: new ai/grazie/client/common/model/RequestOptions
/*     */     //   124: dup
/*     */     //   125: aconst_null
/*     */     //   126: aconst_null
/*     */     //   127: iconst_3
/*     */     //   128: aconst_null
/*     */     //   129: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   132: astore #8
/*     */     //   134: aload #4
/*     */     //   136: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*     */     //   139: astore #9
/*     */     //   141: iconst_0
/*     */     //   142: istore #10
/*     */     //   144: aload #4
/*     */     //   146: invokevirtual getHttpClient : ()Lai/grazie/client/common/SuspendableHTTPClient;
/*     */     //   149: astore #11
/*     */     //   151: aload #4
/*     */     //   153: aload #5
/*     */     //   155: invokevirtual url : (Lai/grazie/model/cloud/API;)Ljava/lang/String;
/*     */     //   158: astore #12
/*     */     //   160: aload #8
/*     */     //   162: aload #5
/*     */     //   164: invokestatic withTimeout : (Lai/grazie/client/common/model/RequestOptions;Lai/grazie/model/cloud/API;)Lai/grazie/client/common/model/RequestOptions;
/*     */     //   167: astore #13
/*     */     //   169: iconst_0
/*     */     //   170: istore #14
/*     */     //   172: aload #11
/*     */     //   174: aload #12
/*     */     //   176: aload #9
/*     */     //   178: astore #15
/*     */     //   180: iconst_0
/*     */     //   181: istore #16
/*     */     //   183: aload #15
/*     */     //   185: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V5$Request.Companion : Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V5$Request$Companion;
/*     */     //   188: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   191: checkcast kotlinx/serialization/SerializationStrategy
/*     */     //   194: aload_1
/*     */     //   195: invokevirtual string : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   198: aload #13
/*     */     //   200: iconst_0
/*     */     //   201: aload #22
/*     */     //   203: aload #22
/*     */     //   205: aload #6
/*     */     //   207: putfield L$0 : Ljava/lang/Object;
/*     */     //   210: aload #22
/*     */     //   212: aload #9
/*     */     //   214: putfield L$1 : Ljava/lang/Object;
/*     */     //   217: aload #22
/*     */     //   219: iconst_1
/*     */     //   220: putfield label : I
/*     */     //   223: invokeinterface receiveContinuousSSE : (Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   228: dup
/*     */     //   229: aload #23
/*     */     //   231: if_acmpne -> 270
/*     */     //   234: aload #23
/*     */     //   236: areturn
/*     */     //   237: iconst_0
/*     */     //   238: istore #10
/*     */     //   240: iconst_0
/*     */     //   241: istore #14
/*     */     //   243: aload #22
/*     */     //   245: getfield L$1 : Ljava/lang/Object;
/*     */     //   248: checkcast ai/grazie/utils/json/JSON
/*     */     //   251: astore #9
/*     */     //   253: aload #22
/*     */     //   255: getfield L$0 : Ljava/lang/Object;
/*     */     //   258: checkcast kotlinx/serialization/KSerializer
/*     */     //   261: astore #6
/*     */     //   263: aload #21
/*     */     //   265: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   268: aload #21
/*     */     //   270: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   273: astore #15
/*     */     //   275: iconst_0
/*     */     //   276: istore #16
/*     */     //   278: aload #15
/*     */     //   280: astore #17
/*     */     //   282: iconst_0
/*     */     //   283: istore #18
/*     */     //   285: iconst_0
/*     */     //   286: istore #19
/*     */     //   288: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V5$chat$$inlined$receiveContinuousSSE$default$1
/*     */     //   291: dup
/*     */     //   292: aload #17
/*     */     //   294: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*     */     //   297: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   300: nop
/*     */     //   301: nop
/*     */     //   302: invokestatic filterNotNull : (Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;
/*     */     //   305: astore #15
/*     */     //   307: iconst_0
/*     */     //   308: istore #16
/*     */     //   310: aload #15
/*     */     //   312: astore #17
/*     */     //   314: iconst_0
/*     */     //   315: istore #18
/*     */     //   317: iconst_0
/*     */     //   318: istore #19
/*     */     //   320: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V5$chat$$inlined$receiveContinuousSSE$default$2
/*     */     //   323: dup
/*     */     //   324: aload #17
/*     */     //   326: aload #6
/*     */     //   328: aload #9
/*     */     //   330: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lkotlinx/serialization/KSerializer;Lai/grazie/utils/json/JSON;)V
/*     */     //   333: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   336: nop
/*     */     //   337: nop
/*     */     //   338: astore #15
/*     */     //   340: getstatic ai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent.Companion : Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;
/*     */     //   343: astore #16
/*     */     //   345: iconst_0
/*     */     //   346: istore #17
/*     */     //   348: aload #15
/*     */     //   350: astore #18
/*     */     //   352: iconst_0
/*     */     //   353: istore #19
/*     */     //   355: iconst_0
/*     */     //   356: istore #20
/*     */     //   358: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V5$chat$$inlined$receiveContinuousSSE$default$3
/*     */     //   361: dup
/*     */     //   362: aload #18
/*     */     //   364: aload #16
/*     */     //   366: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;)V
/*     */     //   369: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   372: nop
/*     */     //   373: nop
/*     */     //   374: nop
/*     */     //   375: nop
/*     */     //   376: astore_3
/*     */     //   377: aload_3
/*     */     //   378: astore #4
/*     */     //   380: iconst_0
/*     */     //   381: istore #5
/*     */     //   383: aload #4
/*     */     //   385: astore #6
/*     */     //   387: iconst_0
/*     */     //   388: istore #7
/*     */     //   390: iconst_0
/*     */     //   391: istore #8
/*     */     //   393: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V5$chat$$inlined$map$1
/*     */     //   396: dup
/*     */     //   397: aload #6
/*     */     //   399: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*     */     //   402: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   405: nop
/*     */     //   406: nop
/*     */     //   407: areturn
/*     */     //   408: new java/lang/IllegalStateException
/*     */     //   411: dup
/*     */     //   412: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   414: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   417: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #132	-> 60
/*     */     //   #133	-> 93
/*     */     //   #430	-> 110
/*     */     //   #433	-> 110
/*     */     //   #430	-> 118
/*     */     //   #434	-> 118
/*     */     //   #430	-> 121
/*     */     //   #435	-> 121
/*     */     //   #430	-> 134
/*     */     //   #436	-> 134
/*     */     //   #430	-> 141
/*     */     //   #437	-> 144
/*     */     //   #438	-> 172
/*     */     //   #439	-> 183
/*     */     //   #438	-> 198
/*     */     //   #132	-> 234
/*     */     //   #440	-> 275
/*     */     //   #441	-> 278
/*     */     //   #442	-> 285
/*     */     //   #443	-> 288
/*     */     //   #444	-> 300
/*     */     //   #445	-> 301
/*     */     //   #446	-> 302
/*     */     //   #447	-> 307
/*     */     //   #441	-> 310
/*     */     //   #442	-> 317
/*     */     //   #443	-> 320
/*     */     //   #444	-> 336
/*     */     //   #445	-> 337
/*     */     //   #448	-> 340
/*     */     //   #441	-> 348
/*     */     //   #442	-> 355
/*     */     //   #443	-> 358
/*     */     //   #444	-> 372
/*     */     //   #445	-> 373
/*     */     //   #438	-> 374
/*     */     //   #437	-> 375
/*     */     //   #133	-> 376
/*     */     //   #134	-> 377
/*     */     //   #135	-> 380
/*     */     //   #449	-> 383
/*     */     //   #450	-> 390
/*     */     //   #451	-> 393
/*     */     //   #452	-> 405
/*     */     //   #453	-> 406
/*     */     //   #134	-> 407
/*     */     //   #132	-> 408
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	17	0	this	Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V5;
/*     */     //   93	105	1	request	Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V5$Request;
/*     */     //   377	31	3	result	Lkotlinx/coroutines/flow/Flow;
/*     */     //   110	59	4	$this$iv	Lai/grazie/client/common/cloud/SuspendableCloudClient;
/*     */     //   380	27	4	$this$map$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   110	59	5	api$iv	Lai/grazie/model/cloud/API;
/*     */     //   118	119	6	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */     //   263	113	6	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */     //   387	19	6	$this$unsafeTransform$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   121	79	7	reconnect$iv	Z
/*     */     //   134	35	8	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   141	96	9	json$iv	Lai/grazie/utils/json/JSON;
/*     */     //   253	123	9	json$iv	Lai/grazie/utils/json/JSON;
/*     */     //   169	11	11	$this$receiveContinuousSSE$iv$iv	Lai/grazie/client/common/SuspendableHTTPClient;
/*     */     //   169	11	12	url$iv$iv	Ljava/lang/String;
/*     */     //   169	31	13	options$iv$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   180	18	15	this_$iv$iv$iv	Lai/grazie/utils/json/JSON;
/*     */     //   275	27	15	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   307	31	15	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   340	34	15	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   282	19	17	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   314	23	17	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   352	21	18	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   183	15	16	$i$f$string	I
/*     */     //   288	12	19	$i$f$unsafeFlow	I
/*     */     //   285	16	18	$i$f$unsafeTransform	I
/*     */     //   278	24	16	$i$f$map	I
/*     */     //   320	16	19	$i$f$unsafeFlow	I
/*     */     //   317	20	18	$i$f$unsafeTransform	I
/*     */     //   310	28	16	$i$f$map	I
/*     */     //   358	14	20	$i$f$unsafeFlow	I
/*     */     //   355	18	19	$i$f$unsafeTransform	I
/*     */     //   348	26	17	$i$f$map	I
/*     */     //   172	65	14	$i$f$receiveContinuousSSE	I
/*     */     //   144	93	10	$i$f$receiveContinuousSSE	I
/*     */     //   393	12	8	$i$f$unsafeFlow	I
/*     */     //   390	16	7	$i$f$unsafeTransform	I
/*     */     //   383	24	5	$i$f$map	I
/*     */     //   0	418	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	358	22	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	351	21	$result	Ljava/lang/Object;
/*     */     //   243	132	14	$i$f$receiveContinuousSSE	I
/*     */     //   240	136	10	$i$f$receiveContinuousSSE	I
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "LlmAPIClient.kt", l = {438}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"serializer$iv", "json$iv"}, m = "chat", c = "ai.grazie.api.gateway.client.api.llm.LlmAPIClient$V5")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class LlmAPIClient$V5$chat$3 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     LlmAPIClient$V5$chat$3(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return LlmAPIClient.V5.this.chat((LlmAPI.Chat.Stream.V5.Request)null, (Continuation)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\llm\LlmAPIClient$V5.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */