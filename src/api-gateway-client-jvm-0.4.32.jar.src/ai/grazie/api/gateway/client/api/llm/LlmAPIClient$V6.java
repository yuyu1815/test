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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\b\004\030\0002\0020\001B\005¢\006\002\020\002J\034\020\003\032\b\022\004\022\0020\0050\0042\006\020\006\032\0020\007H@¢\006\002\020\bJ-\020\003\032\b\022\004\022\0020\0050\0042\027\020\t\032\023\022\004\022\0020\013\022\004\022\0020\f0\n¢\006\002\b\rH@¢\006\002\020\016J6\020\003\032\b\022\004\022\0020\0050\0042\006\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\003\032\0020\0232\b\b\002\020\024\032\0020\025H@¢\006\002\020\026J@\020\027\032\b\022\004\022\0020\0050\0042\006\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\030\032\0020\0312\006\020\032\032\0020\0312\n\b\002\020\024\032\004\030\0010\025H@¢\006\002\020\033¨\006\034"}, d2 = {"Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6;", "", "(Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;)V", "chat", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/model/llm/data/stream/LLMStreamData;", "request", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$Request;", "(Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "builder", "Lkotlin/Function1;", "Lai/grazie/api/gateway/client/api/llm/ChatRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prompt", "Lai/grazie/model/llm/prompt/LLMPromptID;", "profile", "Lai/grazie/model/llm/profile/LLMProfileID;", "Lai/grazie/model/llm/chat/v5/LLMChat;", "parameters", "Lai/grazie/utils/attributes/Attributes;", "(Lai/grazie/model/llm/prompt/LLMPromptID;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/model/llm/chat/v5/LLMChat;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "complete", "prefix", "", "suffix", "(Lai/grazie/model/llm/prompt/LLMPromptID;Lai/grazie/model/llm/profile/LLMProfileID;Ljava/lang/String;Ljava/lang/String;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*     */ @SourceDebugExtension({"SMAP\nLlmAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LlmAPIClient.kt\nai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n+ 4 JSON.kt\nai/grazie/utils/json/JSON\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,429:1\n77#2,8:430\n77#2,8:454\n86#3:438\n87#3:440\n88#3,3:446\n86#3:462\n87#3:464\n88#3,3:470\n28#4:439\n28#4:463\n49#5:441\n51#5:445\n49#5:449\n51#5:453\n49#5:465\n51#5:469\n49#5:473\n51#5:477\n46#6:442\n51#6:444\n46#6:450\n51#6:452\n46#6:466\n51#6:468\n46#6:474\n51#6:476\n105#7:443\n105#7:451\n105#7:467\n105#7:475\n*S KotlinDebug\n*F\n+ 1 LlmAPIClient.kt\nai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6\n*L\n234#1:430,8\n247#1:454,8\n234#1:438\n234#1:440\n234#1:446,3\n247#1:462\n247#1:464\n247#1:470,3\n234#1:439\n247#1:463\n234#1:441\n234#1:445\n236#1:449\n236#1:453\n247#1:465\n247#1:469\n248#1:473\n248#1:477\n234#1:442\n234#1:444\n236#1:450\n236#1:452\n247#1:466\n247#1:468\n248#1:474\n248#1:476\n234#1:443\n236#1:451\n247#1:467\n248#1:475\n*E\n"})
/*     */ public final class V6
/*     */ {
/*     */   @Nullable
/*     */   public final Object chat(@NotNull LLMPromptID prompt, @NotNull LLMProfileID profile, @NotNull LLMChat chat, @NotNull Attributes parameters, @NotNull Continuation<? super Flow<? extends LLMStreamData>> $completion) {
/* 218 */     return chat(new LlmAPI.Chat.Stream.V6.Request(prompt, profile, chat, parameters), $completion);
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
/* 230 */     ChatRequestBuilder chatRequestBuilder = new ChatRequestBuilder(); builder.invoke(chatRequestBuilder); return chat(chatRequestBuilder.buildV6(), $completion);
/*     */   }
/*     */   
/*     */   private final Object chat(LlmAPI.Chat.Stream.V6.Request request, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$chat$3
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$chat$3
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
/*     */     //   39: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$chat$3
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6;Lkotlin/coroutines/Continuation;)V
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
/*     */     //   102: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6.INSTANCE : Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6;
/*     */     //   105: checkcast ai/grazie/model/cloud/API
/*     */     //   108: astore #5
/*     */     //   110: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData.Companion : Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData$Companion;
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
/*     */     //   185: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$Request.Companion : Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$Request$Companion;
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
/*     */     //   288: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$chat$$inlined$receiveContinuousSSE$default$1
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
/*     */     //   320: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$chat$$inlined$receiveContinuousSSE$default$2
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
/*     */     //   358: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$chat$$inlined$receiveContinuousSSE$default$3
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
/*     */     //   393: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$chat$$inlined$map$1
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
/*     */     //   #233	-> 60
/*     */     //   #234	-> 93
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
/*     */     //   #233	-> 234
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
/*     */     //   #234	-> 376
/*     */     //   #235	-> 377
/*     */     //   #236	-> 380
/*     */     //   #449	-> 383
/*     */     //   #450	-> 390
/*     */     //   #451	-> 393
/*     */     //   #452	-> 405
/*     */     //   #453	-> 406
/*     */     //   #235	-> 407
/*     */     //   #233	-> 408
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	17	0	this	Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6;
/*     */     //   93	105	1	request	Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$Request;
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
/*     */   @Nullable
/*     */   public final Object complete(@NotNull LLMPromptID prompt, @NotNull LLMProfileID profile, @NotNull String prefix, @NotNull String suffix, @Nullable Attributes parameters, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #6
/*     */     //   2: instanceof ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$complete$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #6
/*     */     //   10: checkcast ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$complete$1
/*     */     //   13: astore #27
/*     */     //   15: aload #27
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #27
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$complete$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #6
/*     */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #27
/*     */     //   53: aload #27
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #26
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #28
/*     */     //   65: aload #27
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 431, 0 -> 92, 1 -> 258
/*     */     //   92: aload #26
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_0
/*     */     //   98: getfield this$0 : Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;
/*     */     //   101: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*     */     //   104: astore #8
/*     */     //   106: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V6.INSTANCE : Lai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V6;
/*     */     //   109: checkcast ai/grazie/model/cloud/API
/*     */     //   112: astore #9
/*     */     //   114: new ai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V6$Request
/*     */     //   117: dup
/*     */     //   118: aload_1
/*     */     //   119: aload_3
/*     */     //   120: aload #4
/*     */     //   122: aload_2
/*     */     //   123: aload #5
/*     */     //   125: invokespecial <init> : (Lai/grazie/model/llm/prompt/LLMPromptID;Ljava/lang/String;Ljava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/utils/attributes/Attributes;)V
/*     */     //   128: astore #10
/*     */     //   130: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V6$LLMData.Companion : Lai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V6$LLMData$Companion;
/*     */     //   133: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   136: astore #11
/*     */     //   138: iconst_0
/*     */     //   139: istore #12
/*     */     //   141: new ai/grazie/client/common/model/RequestOptions
/*     */     //   144: dup
/*     */     //   145: aconst_null
/*     */     //   146: aconst_null
/*     */     //   147: iconst_3
/*     */     //   148: aconst_null
/*     */     //   149: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   152: astore #13
/*     */     //   154: aload #8
/*     */     //   156: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*     */     //   159: astore #14
/*     */     //   161: iconst_0
/*     */     //   162: istore #15
/*     */     //   164: aload #8
/*     */     //   166: invokevirtual getHttpClient : ()Lai/grazie/client/common/SuspendableHTTPClient;
/*     */     //   169: astore #16
/*     */     //   171: aload #8
/*     */     //   173: aload #9
/*     */     //   175: invokevirtual url : (Lai/grazie/model/cloud/API;)Ljava/lang/String;
/*     */     //   178: astore #17
/*     */     //   180: aload #13
/*     */     //   182: aload #9
/*     */     //   184: invokestatic withTimeout : (Lai/grazie/client/common/model/RequestOptions;Lai/grazie/model/cloud/API;)Lai/grazie/client/common/model/RequestOptions;
/*     */     //   187: astore #18
/*     */     //   189: iconst_0
/*     */     //   190: istore #19
/*     */     //   192: aload #16
/*     */     //   194: aload #17
/*     */     //   196: aload #14
/*     */     //   198: astore #20
/*     */     //   200: iconst_0
/*     */     //   201: istore #21
/*     */     //   203: aload #20
/*     */     //   205: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V6$Request.Companion : Lai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V6$Request$Companion;
/*     */     //   208: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   211: checkcast kotlinx/serialization/SerializationStrategy
/*     */     //   214: aload #10
/*     */     //   216: invokevirtual string : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   219: aload #18
/*     */     //   221: iconst_0
/*     */     //   222: aload #27
/*     */     //   224: aload #27
/*     */     //   226: aload #11
/*     */     //   228: putfield L$0 : Ljava/lang/Object;
/*     */     //   231: aload #27
/*     */     //   233: aload #14
/*     */     //   235: putfield L$1 : Ljava/lang/Object;
/*     */     //   238: aload #27
/*     */     //   240: iconst_1
/*     */     //   241: putfield label : I
/*     */     //   244: invokeinterface receiveContinuousSSE : (Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   249: dup
/*     */     //   250: aload #28
/*     */     //   252: if_acmpne -> 291
/*     */     //   255: aload #28
/*     */     //   257: areturn
/*     */     //   258: iconst_0
/*     */     //   259: istore #15
/*     */     //   261: iconst_0
/*     */     //   262: istore #19
/*     */     //   264: aload #27
/*     */     //   266: getfield L$1 : Ljava/lang/Object;
/*     */     //   269: checkcast ai/grazie/utils/json/JSON
/*     */     //   272: astore #14
/*     */     //   274: aload #27
/*     */     //   276: getfield L$0 : Ljava/lang/Object;
/*     */     //   279: checkcast kotlinx/serialization/KSerializer
/*     */     //   282: astore #11
/*     */     //   284: aload #26
/*     */     //   286: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   289: aload #26
/*     */     //   291: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   294: astore #20
/*     */     //   296: iconst_0
/*     */     //   297: istore #21
/*     */     //   299: aload #20
/*     */     //   301: astore #22
/*     */     //   303: iconst_0
/*     */     //   304: istore #23
/*     */     //   306: iconst_0
/*     */     //   307: istore #24
/*     */     //   309: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$complete$$inlined$receiveContinuousSSE$default$1
/*     */     //   312: dup
/*     */     //   313: aload #22
/*     */     //   315: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*     */     //   318: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   321: nop
/*     */     //   322: nop
/*     */     //   323: invokestatic filterNotNull : (Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;
/*     */     //   326: astore #20
/*     */     //   328: iconst_0
/*     */     //   329: istore #21
/*     */     //   331: aload #20
/*     */     //   333: astore #22
/*     */     //   335: iconst_0
/*     */     //   336: istore #23
/*     */     //   338: iconst_0
/*     */     //   339: istore #24
/*     */     //   341: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$complete$$inlined$receiveContinuousSSE$default$2
/*     */     //   344: dup
/*     */     //   345: aload #22
/*     */     //   347: aload #11
/*     */     //   349: aload #14
/*     */     //   351: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lkotlinx/serialization/KSerializer;Lai/grazie/utils/json/JSON;)V
/*     */     //   354: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   357: nop
/*     */     //   358: nop
/*     */     //   359: astore #20
/*     */     //   361: getstatic ai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent.Companion : Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;
/*     */     //   364: astore #21
/*     */     //   366: iconst_0
/*     */     //   367: istore #22
/*     */     //   369: aload #20
/*     */     //   371: astore #23
/*     */     //   373: iconst_0
/*     */     //   374: istore #24
/*     */     //   376: iconst_0
/*     */     //   377: istore #25
/*     */     //   379: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$complete$$inlined$receiveContinuousSSE$default$3
/*     */     //   382: dup
/*     */     //   383: aload #23
/*     */     //   385: aload #21
/*     */     //   387: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;)V
/*     */     //   390: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   393: nop
/*     */     //   394: nop
/*     */     //   395: nop
/*     */     //   396: nop
/*     */     //   397: astore #7
/*     */     //   399: aload #7
/*     */     //   401: astore #8
/*     */     //   403: iconst_0
/*     */     //   404: istore #9
/*     */     //   406: aload #8
/*     */     //   408: astore #10
/*     */     //   410: iconst_0
/*     */     //   411: istore #11
/*     */     //   413: iconst_0
/*     */     //   414: istore #12
/*     */     //   416: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$complete$$inlined$map$1
/*     */     //   419: dup
/*     */     //   420: aload #10
/*     */     //   422: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*     */     //   425: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   428: nop
/*     */     //   429: nop
/*     */     //   430: areturn
/*     */     //   431: new java/lang/IllegalStateException
/*     */     //   434: dup
/*     */     //   435: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   437: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   440: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #245	-> 63
/*     */     //   #247	-> 97
/*     */     //   #454	-> 130
/*     */     //   #457	-> 130
/*     */     //   #454	-> 138
/*     */     //   #458	-> 138
/*     */     //   #454	-> 141
/*     */     //   #459	-> 141
/*     */     //   #454	-> 154
/*     */     //   #460	-> 154
/*     */     //   #454	-> 161
/*     */     //   #461	-> 164
/*     */     //   #462	-> 192
/*     */     //   #463	-> 203
/*     */     //   #462	-> 219
/*     */     //   #245	-> 255
/*     */     //   #464	-> 296
/*     */     //   #465	-> 299
/*     */     //   #466	-> 306
/*     */     //   #467	-> 309
/*     */     //   #468	-> 321
/*     */     //   #469	-> 322
/*     */     //   #470	-> 323
/*     */     //   #471	-> 328
/*     */     //   #465	-> 331
/*     */     //   #466	-> 338
/*     */     //   #467	-> 341
/*     */     //   #468	-> 357
/*     */     //   #469	-> 358
/*     */     //   #472	-> 361
/*     */     //   #465	-> 369
/*     */     //   #466	-> 376
/*     */     //   #467	-> 379
/*     */     //   #468	-> 393
/*     */     //   #469	-> 394
/*     */     //   #462	-> 395
/*     */     //   #461	-> 396
/*     */     //   #247	-> 397
/*     */     //   #246	-> 397
/*     */     //   #248	-> 399
/*     */     //   #473	-> 406
/*     */     //   #474	-> 413
/*     */     //   #475	-> 416
/*     */     //   #476	-> 428
/*     */     //   #477	-> 429
/*     */     //   #248	-> 430
/*     */     //   #245	-> 431
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	33	0	this	Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6;
/*     */     //   97	33	1	prompt	Lai/grazie/model/llm/prompt/LLMPromptID;
/*     */     //   97	33	2	profile	Lai/grazie/model/llm/profile/LLMProfileID;
/*     */     //   97	33	3	prefix	Ljava/lang/String;
/*     */     //   97	33	4	suffix	Ljava/lang/String;
/*     */     //   97	33	5	parameters	Lai/grazie/utils/attributes/Attributes;
/*     */     //   399	32	7	result	Lkotlinx/coroutines/flow/Flow;
/*     */     //   130	59	8	$this$iv	Lai/grazie/client/common/cloud/SuspendableCloudClient;
/*     */     //   403	27	8	$this$map$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   130	59	9	api$iv	Lai/grazie/model/cloud/API;
/*     */     //   130	89	10	content$iv	Ljava/lang/Object;
/*     */     //   410	19	10	$this$unsafeTransform$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   138	120	11	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */     //   284	113	11	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */     //   141	80	12	reconnect$iv	Z
/*     */     //   154	35	13	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   161	97	14	json$iv	Lai/grazie/utils/json/JSON;
/*     */     //   274	123	14	json$iv	Lai/grazie/utils/json/JSON;
/*     */     //   189	11	16	$this$receiveContinuousSSE$iv$iv	Lai/grazie/client/common/SuspendableHTTPClient;
/*     */     //   189	11	17	url$iv$iv	Ljava/lang/String;
/*     */     //   189	32	18	options$iv$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   200	19	20	this_$iv$iv$iv	Lai/grazie/utils/json/JSON;
/*     */     //   296	27	20	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   328	31	20	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   361	34	20	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   303	19	22	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   335	23	22	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   373	21	23	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   203	16	21	$i$f$string	I
/*     */     //   309	12	24	$i$f$unsafeFlow	I
/*     */     //   306	16	23	$i$f$unsafeTransform	I
/*     */     //   299	24	21	$i$f$map	I
/*     */     //   341	16	24	$i$f$unsafeFlow	I
/*     */     //   338	20	23	$i$f$unsafeTransform	I
/*     */     //   331	28	21	$i$f$map	I
/*     */     //   379	14	25	$i$f$unsafeFlow	I
/*     */     //   376	18	24	$i$f$unsafeTransform	I
/*     */     //   369	26	22	$i$f$map	I
/*     */     //   192	66	19	$i$f$receiveContinuousSSE	I
/*     */     //   164	94	15	$i$f$receiveContinuousSSE	I
/*     */     //   416	12	12	$i$f$unsafeFlow	I
/*     */     //   413	16	11	$i$f$unsafeTransform	I
/*     */     //   406	24	9	$i$f$map	I
/*     */     //   0	441	6	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	378	27	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	371	26	$result	Ljava/lang/Object;
/*     */     //   264	132	19	$i$f$receiveContinuousSSE	I
/*     */     //   261	136	15	$i$f$receiveContinuousSSE	I
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "LlmAPIClient.kt", l = {438}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"serializer$iv", "json$iv"}, m = "chat", c = "ai.grazie.api.gateway.client.api.llm.LlmAPIClient$V6")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class LlmAPIClient$V6$chat$3 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     LlmAPIClient$V6$chat$3(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return LlmAPIClient.V6.this.chat((LlmAPI.Chat.Stream.V6.Request)null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "LlmAPIClient.kt", l = {438}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"serializer$iv", "json$iv"}, m = "complete", c = "ai.grazie.api.gateway.client.api.llm.LlmAPIClient$V6")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class LlmAPIClient$V6$complete$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     LlmAPIClient$V6$complete$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return LlmAPIClient.V6.this.complete(null, null, null, null, null, (Continuation<? super Flow<? extends LLMStreamData>>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\llm\LlmAPIClient$V6.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */