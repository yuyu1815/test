/*     */ package com.intellij.ml.llm.matterhorn.core.llm.openai;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000b\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020$\n\002\020\016\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\b\026\030\000  2\0020\001:\002 !B;\022\006\020\002\032\0020\003\022\022\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\005\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013\022\006\020\f\032\0020\r¢\006\004\b\016\020\017J\030\020\020\032\0020\0212\b\020\022\032\004\030\0010\023H@¢\006\002\020\024J*\020\025\032\0020\0212\006\020\026\032\0020\0272\022\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\005H@¢\006\002\020\030J\"\020\031\032\004\030\0010\032*\0020\0332\022\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\005H\002J\"\020\031\032\004\030\0010\032*\0020\0342\022\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\005H\002J$\020\035\032\004\030\0010\036*\004\030\0010\0372\022\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\005H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\032\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\005X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\016\020\n\032\0020\013X\004¢\006\002\n\000R\016\020\f\032\0020\rX\004¢\006\002\n\000¨\006\""}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatRequest;", "Lcom/intellij/ml/llm/matterhorn/core/llm/LlmRequest;", "requestBody", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiChatRequestBody;", "stopReasons", "", "", "Lcom/intellij/ml/llm/matterhorn/llm/StopSequenceType;", "model", "Lcom/intellij/ml/llm/matterhorn/llm/LLM;", "provider", "Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiChatRequestBody;Ljava/util/Map;Lcom/intellij/ml/llm/matterhorn/llm/LLM;Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;)V", "send", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "accessToken", "Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;", "(Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleBatchResponse", "response", "Lio/ktor/client/statement/HttpResponse;", "(Lio/ktor/client/statement/HttpResponse;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toChoice", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice;", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChoice;", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChoiceChat;", "getStopSequence", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatRequest$StopSequence;", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/FinishDetails;", "Companion", "StopSequence", "core-llm"})
/*     */ @SourceDebugExtension({"SMAP\nOpenAIChatRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenAIChatRequest.kt\ncom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatRequest\n+ 2 LlmProvider.kt\ncom/intellij/ml/llm/matterhorn/core/llm/LlmProviderKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 4 service.kt\ncom/intellij/openapi/components/ServiceKt\n+ 5 builders.kt\nio/ktor/client/request/BuildersKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 JvmStreams.kt\nkotlinx/serialization/json/JvmStreamsKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n78#2:118\n80#2,24:120\n105#2,15:147\n14#3:119\n40#4,3:144\n40#4,3:162\n52#5:165\n1#6:166\n1#6:178\n80#7:167\n1611#8,9:168\n1863#8:177\n1864#8:179\n1620#8:180\n*S KotlinDebug\n*F\n+ 1 OpenAIChatRequest.kt\ncom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatRequest\n*L\n56#1:118\n56#1:120,24\n56#1:147,15\n56#1:119\n56#1:144,3\n58#1:162,3\n59#1:165\n80#1:178\n76#1:167\n80#1:168,9\n80#1:177\n80#1:179\n80#1:180\n*E\n"})
/*     */ public class OpenAIChatRequest implements LlmRequest {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final OpenAiChatRequestBody requestBody;
/*     */   @NotNull
/*     */   private final Map<String, StopSequenceType> stopReasons;
/*     */   @NotNull
/*     */   private final LLM model;
/*     */   @NotNull
/*     */   private final LlmProvider provider;
/*     */   @NotNull
/*     */   private final MatterhornPropertyProvider propertyProvider;
/*     */   @NotNull
/*     */   public static final String FINISH_REASON_STOP = "stop";
/*     */   
/*     */   public OpenAIChatRequest(@NotNull OpenAiChatRequestBody requestBody, @NotNull Map<String, StopSequenceType> stopReasons, @NotNull LLM model, @NotNull LlmProvider provider, @NotNull MatterhornPropertyProvider propertyProvider) {
/*  22 */     this.requestBody = requestBody;
/*  23 */     this.stopReasons = stopReasons;
/*  24 */     this.model = model;
/*  25 */     this.provider = provider;
/*  26 */     this.propertyProvider = propertyProvider;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatRequest$Companion;", "", "<init>", "()V", "FINISH_REASON_STOP", "", "core-llm"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "OpenAIChatRequest.kt", l = {60}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.openai.OpenAIChatRequest$send$2$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "it", "Lio/ktor/client/statement/HttpResponse;"})
/*     */   static final class OpenAIChatRequest$send$2$1
/*     */     extends SuspendLambda
/*     */     implements Function2<HttpResponse, Continuation<? super AIAnswer>, Object>
/*     */   {
/*     */     int label;
/*     */ 
/*     */ 
/*     */     
/*     */     OpenAIChatRequest$send$2$1(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       HttpResponse it;
/*  59 */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (HttpResponse)this.L$0;
/*  60 */           this.label = 1; if (OpenAIChatRequest.this.handleBatchResponse(it, OpenAIChatRequest.this.stopReasons, (Continuation)this) == object) return object;  return OpenAIChatRequest.this.handleBatchResponse(it, OpenAIChatRequest.this.stopReasons, (Continuation)this);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     } public final Continuation<Unit> create(Object value, Continuation<? super OpenAIChatRequest$send$2$1> $completion) { OpenAIChatRequest$send$2$1 openAIChatRequest$send$2$1 = new OpenAIChatRequest$send$2$1($completion);
/*     */       openAIChatRequest$send$2$1.L$0 = value;
/*     */       return (Continuation<Unit>)openAIChatRequest$send$2$1; } public final Object invoke(HttpResponse p1, Continuation<?> p2) {
/*     */       return ((OpenAIChatRequest$send$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } } private final Object handleBatchResponse(HttpResponse response, Map stopReasons, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatRequest$handleBatchResponse$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatRequest$handleBatchResponse$1
/*     */     //   11: astore #26
/*     */     //   13: aload #26
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #26
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatRequest$handleBatchResponse$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatRequest;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #26
/*     */     //   50: aload #26
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #25
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #42
/*     */     //   62: aload #26
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 748, 0 -> 96, 1 -> 187, 2 -> 266, 3 -> 370
/*     */     //   96: aload #25
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: iconst_2
/*     */     //   102: anewarray java/lang/Integer
/*     */     //   105: astore #4
/*     */     //   107: aload #4
/*     */     //   109: iconst_0
/*     */     //   110: sipush #429
/*     */     //   113: invokestatic boxInt : (I)Ljava/lang/Integer;
/*     */     //   116: aastore
/*     */     //   117: aload #4
/*     */     //   119: iconst_1
/*     */     //   120: sipush #529
/*     */     //   123: invokestatic boxInt : (I)Ljava/lang/Integer;
/*     */     //   126: aastore
/*     */     //   127: aload #4
/*     */     //   129: invokestatic setOf : ([Ljava/lang/Object;)Ljava/util/Set;
/*     */     //   132: aload_1
/*     */     //   133: invokevirtual getStatus : ()Lio/ktor/http/HttpStatusCode;
/*     */     //   136: invokevirtual getValue : ()I
/*     */     //   139: invokestatic boxInt : (I)Ljava/lang/Integer;
/*     */     //   142: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   147: ifeq -> 224
/*     */     //   150: aload_1
/*     */     //   151: invokevirtual getStatus : ()Lio/ktor/http/HttpStatusCode;
/*     */     //   154: astore #24
/*     */     //   156: aload_1
/*     */     //   157: aconst_null
/*     */     //   158: aload #26
/*     */     //   160: iconst_1
/*     */     //   161: aconst_null
/*     */     //   162: aload #26
/*     */     //   164: aload #24
/*     */     //   166: putfield L$0 : Ljava/lang/Object;
/*     */     //   169: aload #26
/*     */     //   171: iconst_1
/*     */     //   172: putfield label : I
/*     */     //   175: invokestatic bodyAsText$default : (Lio/ktor/client/statement/HttpResponse;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   178: dup
/*     */     //   179: aload #42
/*     */     //   181: if_acmpne -> 204
/*     */     //   184: aload #42
/*     */     //   186: areturn
/*     */     //   187: aload #26
/*     */     //   189: getfield L$0 : Ljava/lang/Object;
/*     */     //   192: checkcast io/ktor/http/HttpStatusCode
/*     */     //   195: astore #24
/*     */     //   197: aload #25
/*     */     //   199: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   202: aload #25
/*     */     //   204: aload #24
/*     */     //   206: swap
/*     */     //   207: <illegal opcode> makeConcatWithConstants : (Lio/ktor/http/HttpStatusCode;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   212: astore #27
/*     */     //   214: new com/intellij/ml/llm/matterhorn/LLMRateLimitError
/*     */     //   217: dup
/*     */     //   218: aload #27
/*     */     //   220: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   223: athrow
/*     */     //   224: getstatic com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy.Companion : Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion;
/*     */     //   227: aload_1
/*     */     //   228: aload #26
/*     */     //   230: aload #26
/*     */     //   232: aload_0
/*     */     //   233: putfield L$0 : Ljava/lang/Object;
/*     */     //   236: aload #26
/*     */     //   238: aload_1
/*     */     //   239: putfield L$1 : Ljava/lang/Object;
/*     */     //   242: aload #26
/*     */     //   244: aload_2
/*     */     //   245: putfield L$2 : Ljava/lang/Object;
/*     */     //   248: aload #26
/*     */     //   250: iconst_2
/*     */     //   251: putfield label : I
/*     */     //   254: invokevirtual toLlmException$core_llm : (Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   257: dup
/*     */     //   258: aload #42
/*     */     //   260: if_acmpne -> 300
/*     */     //   263: aload #42
/*     */     //   265: areturn
/*     */     //   266: aload #26
/*     */     //   268: getfield L$2 : Ljava/lang/Object;
/*     */     //   271: checkcast java/util/Map
/*     */     //   274: astore_2
/*     */     //   275: aload #26
/*     */     //   277: getfield L$1 : Ljava/lang/Object;
/*     */     //   280: checkcast io/ktor/client/statement/HttpResponse
/*     */     //   283: astore_1
/*     */     //   284: aload #26
/*     */     //   286: getfield L$0 : Ljava/lang/Object;
/*     */     //   289: checkcast com/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatRequest
/*     */     //   292: astore_0
/*     */     //   293: aload #25
/*     */     //   295: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   298: aload #25
/*     */     //   300: checkcast java/lang/RuntimeException
/*     */     //   303: dup
/*     */     //   304: ifnull -> 315
/*     */     //   307: astore #6
/*     */     //   309: iconst_0
/*     */     //   310: istore #7
/*     */     //   312: aload #6
/*     */     //   314: athrow
/*     */     //   315: pop
/*     */     //   316: aconst_null
/*     */     //   317: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   322: iconst_1
/*     */     //   323: aconst_null
/*     */     //   324: invokestatic Json$default : (Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/serialization/json/Json;
/*     */     //   327: astore #4
/*     */     //   329: nop
/*     */     //   330: aload_1
/*     */     //   331: aload #26
/*     */     //   333: aload #26
/*     */     //   335: aload_0
/*     */     //   336: putfield L$0 : Ljava/lang/Object;
/*     */     //   339: aload #26
/*     */     //   341: aload_2
/*     */     //   342: putfield L$1 : Ljava/lang/Object;
/*     */     //   345: aload #26
/*     */     //   347: aload #4
/*     */     //   349: putfield L$2 : Ljava/lang/Object;
/*     */     //   352: aload #26
/*     */     //   354: iconst_3
/*     */     //   355: putfield label : I
/*     */     //   358: invokestatic bodyAsChannel : (Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   361: dup
/*     */     //   362: aload #42
/*     */     //   364: if_acmpne -> 406
/*     */     //   367: aload #42
/*     */     //   369: areturn
/*     */     //   370: aload #26
/*     */     //   372: getfield L$2 : Ljava/lang/Object;
/*     */     //   375: checkcast kotlinx/serialization/json/Json
/*     */     //   378: astore #4
/*     */     //   380: aload #26
/*     */     //   382: getfield L$1 : Ljava/lang/Object;
/*     */     //   385: checkcast java/util/Map
/*     */     //   388: astore_2
/*     */     //   389: aload #26
/*     */     //   391: getfield L$0 : Ljava/lang/Object;
/*     */     //   394: checkcast com/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatRequest
/*     */     //   397: astore_0
/*     */     //   398: nop
/*     */     //   399: aload #25
/*     */     //   401: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   404: aload #25
/*     */     //   406: checkcast io/ktor/utils/io/ByteReadChannel
/*     */     //   409: aconst_null
/*     */     //   410: iconst_1
/*     */     //   411: aconst_null
/*     */     //   412: invokestatic toInputStream$default : (Lio/ktor/utils/io/ByteReadChannel;Lkotlinx/coroutines/Job;ILjava/lang/Object;)Ljava/io/InputStream;
/*     */     //   415: astore #5
/*     */     //   417: aload #4
/*     */     //   419: astore #7
/*     */     //   421: iconst_0
/*     */     //   422: istore #8
/*     */     //   424: aload #7
/*     */     //   426: aload #7
/*     */     //   428: invokevirtual getSerializersModule : ()Lkotlinx/serialization/modules/SerializersModule;
/*     */     //   431: pop
/*     */     //   432: getstatic com/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponse.Companion : Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponse$Companion;
/*     */     //   435: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   438: checkcast kotlinx/serialization/DeserializationStrategy
/*     */     //   441: aload #5
/*     */     //   443: invokestatic decodeFromStream : (Lkotlinx/serialization/json/Json;Lkotlinx/serialization/DeserializationStrategy;Ljava/io/InputStream;)Ljava/lang/Object;
/*     */     //   446: checkcast com/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponse
/*     */     //   449: astore #6
/*     */     //   451: aload #6
/*     */     //   453: invokevirtual getUsage : ()Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseUsage;
/*     */     //   456: dup
/*     */     //   457: ifnull -> 473
/*     */     //   460: invokevirtual getPromptTokensDetails : ()Lcom/intellij/ml/llm/matterhorn/core/llm/openai/PromptTokensDetails;
/*     */     //   463: dup
/*     */     //   464: ifnull -> 473
/*     */     //   467: invokevirtual getCachedTokens : ()J
/*     */     //   470: goto -> 503
/*     */     //   473: pop
/*     */     //   474: aload #6
/*     */     //   476: invokevirtual getUsage : ()Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseUsage;
/*     */     //   479: dup
/*     */     //   480: ifnull -> 489
/*     */     //   483: invokevirtual getPromptCacheHitTokens : ()Ljava/lang/Long;
/*     */     //   486: goto -> 491
/*     */     //   489: pop
/*     */     //   490: aconst_null
/*     */     //   491: dup
/*     */     //   492: ifnull -> 501
/*     */     //   495: invokevirtual longValue : ()J
/*     */     //   498: goto -> 503
/*     */     //   501: pop
/*     */     //   502: lconst_0
/*     */     //   503: lstore #7
/*     */     //   505: aload_0
/*     */     //   506: getfield model : Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   509: aload #6
/*     */     //   511: invokevirtual getChoices : ()Ljava/util/List;
/*     */     //   514: checkcast java/lang/Iterable
/*     */     //   517: astore #9
/*     */     //   519: astore #24
/*     */     //   521: iconst_0
/*     */     //   522: istore #10
/*     */     //   524: aload #9
/*     */     //   526: astore #11
/*     */     //   528: new java/util/ArrayList
/*     */     //   531: dup
/*     */     //   532: invokespecial <init> : ()V
/*     */     //   535: checkcast java/util/Collection
/*     */     //   538: astore #12
/*     */     //   540: iconst_0
/*     */     //   541: istore #13
/*     */     //   543: aload #11
/*     */     //   545: astore #14
/*     */     //   547: iconst_0
/*     */     //   548: istore #15
/*     */     //   550: aload #14
/*     */     //   552: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   557: astore #16
/*     */     //   559: aload #16
/*     */     //   561: invokeinterface hasNext : ()Z
/*     */     //   566: ifeq -> 628
/*     */     //   569: aload #16
/*     */     //   571: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   576: astore #17
/*     */     //   578: aload #17
/*     */     //   580: astore #18
/*     */     //   582: iconst_0
/*     */     //   583: istore #19
/*     */     //   585: aload #18
/*     */     //   587: checkcast com/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChoice
/*     */     //   590: astore #20
/*     */     //   592: iconst_0
/*     */     //   593: istore #21
/*     */     //   595: aload_0
/*     */     //   596: aload #20
/*     */     //   598: aload_2
/*     */     //   599: invokespecial toChoice : (Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChoice;Ljava/util/Map;)Lcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice;
/*     */     //   602: dup
/*     */     //   603: ifnull -> 624
/*     */     //   606: astore #22
/*     */     //   608: iconst_0
/*     */     //   609: istore #23
/*     */     //   611: aload #12
/*     */     //   613: aload #22
/*     */     //   615: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   620: pop
/*     */     //   621: goto -> 625
/*     */     //   624: pop
/*     */     //   625: goto -> 559
/*     */     //   628: nop
/*     */     //   629: aload #12
/*     */     //   631: checkcast java/util/List
/*     */     //   634: nop
/*     */     //   635: aload #24
/*     */     //   637: swap
/*     */     //   638: aload #6
/*     */     //   640: invokevirtual getUsage : ()Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseUsage;
/*     */     //   643: dup
/*     */     //   644: ifnull -> 656
/*     */     //   647: invokevirtual getPromptTokens : ()J
/*     */     //   650: lload #7
/*     */     //   652: lsub
/*     */     //   653: goto -> 658
/*     */     //   656: pop
/*     */     //   657: lconst_0
/*     */     //   658: aload #6
/*     */     //   660: invokevirtual getUsage : ()Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseUsage;
/*     */     //   663: dup
/*     */     //   664: ifnull -> 673
/*     */     //   667: invokevirtual getCompletionTokens : ()J
/*     */     //   670: goto -> 675
/*     */     //   673: pop
/*     */     //   674: lconst_0
/*     */     //   675: lload #7
/*     */     //   677: lconst_0
/*     */     //   678: lconst_0
/*     */     //   679: sipush #224
/*     */     //   682: aconst_null
/*     */     //   683: astore #28
/*     */     //   685: istore #29
/*     */     //   687: lstore #30
/*     */     //   689: lstore #32
/*     */     //   691: lstore #34
/*     */     //   693: lstore #36
/*     */     //   695: lstore #38
/*     */     //   697: astore #40
/*     */     //   699: astore #41
/*     */     //   701: new com/intellij/ml/llm/matterhorn/llm/AIAnswer
/*     */     //   704: dup
/*     */     //   705: aload #41
/*     */     //   707: aload #40
/*     */     //   709: lload #38
/*     */     //   711: lload #36
/*     */     //   713: lload #34
/*     */     //   715: lload #32
/*     */     //   717: lload #30
/*     */     //   719: iconst_0
/*     */     //   720: iload #29
/*     */     //   722: aload #28
/*     */     //   724: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/LLM;Ljava/util/List;JJJJJZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   727: areturn
/*     */     //   728: astore #6
/*     */     //   730: new com/intellij/ml/llm/matterhorn/LLMBadResponseException
/*     */     //   733: dup
/*     */     //   734: aload #6
/*     */     //   736: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   739: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   744: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   747: athrow
/*     */     //   748: new java/lang/IllegalStateException
/*     */     //   751: dup
/*     */     //   752: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   755: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   758: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #65	-> 60
/*     */     //   #67	-> 101
/*     */     //   #68	-> 150
/*     */     //   #65	-> 184
/*     */     //   #68	-> 204
/*     */     //   #71	-> 224
/*     */     //   #65	-> 263
/*     */     //   #71	-> 300
/*     */     //   #166	-> 309
/*     */     //   #71	-> 312
/*     */     //   #73	-> 316
/*     */     //   #74	-> 329
/*     */     //   #75	-> 330
/*     */     //   #65	-> 367
/*     */     //   #75	-> 406
/*     */     //   #76	-> 417
/*     */     //   #167	-> 424
/*     */     //   #76	-> 446
/*     */     //   #77	-> 451
/*     */     //   #78	-> 505
/*     */     //   #79	-> 505
/*     */     //   #80	-> 509
/*     */     //   #168	-> 524
/*     */     //   #176	-> 543
/*     */     //   #177	-> 550
/*     */     //   #176	-> 585
/*     */     //   #80	-> 595
/*     */     //   #176	-> 602
/*     */     //   #178	-> 608
/*     */     //   #176	-> 611
/*     */     //   #176	-> 621
/*     */     //   #176	-> 624
/*     */     //   #177	-> 625
/*     */     //   #179	-> 628
/*     */     //   #180	-> 629
/*     */     //   #168	-> 634
/*     */     //   #81	-> 638
/*     */     //   #82	-> 658
/*     */     //   #83	-> 675
/*     */     //   #78	-> 677
/*     */     //   #86	-> 728
/*     */     //   #87	-> 730
/*     */     //   #65	-> 748
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	49	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatRequest;
/*     */     //   224	42	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatRequest;
/*     */     //   293	77	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatRequest;
/*     */     //   398	48	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatRequest;
/*     */     //   446	156	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatRequest;
/*     */     //   602	26	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatRequest;
/*     */     //   101	77	1	response	Lio/ktor/client/statement/HttpResponse;
/*     */     //   224	42	1	response	Lio/ktor/client/statement/HttpResponse;
/*     */     //   284	23	1	response	Lio/ktor/client/statement/HttpResponse;
/*     */     //   315	46	1	response	Lio/ktor/client/statement/HttpResponse;
/*     */     //   101	49	2	stopReasons	Ljava/util/Map;
/*     */     //   224	42	2	stopReasons	Ljava/util/Map;
/*     */     //   275	95	2	stopReasons	Ljava/util/Map;
/*     */     //   389	57	2	stopReasons	Ljava/util/Map;
/*     */     //   446	156	2	stopReasons	Ljava/util/Map;
/*     */     //   602	26	2	stopReasons	Ljava/util/Map;
/*     */     //   329	41	4	json	Lkotlinx/serialization/json/Json;
/*     */     //   380	41	4	json	Lkotlinx/serialization/json/Json;
/*     */     //   417	29	5	inputStream	Ljava/io/InputStream;
/*     */     //   309	6	6	it	Ljava/lang/RuntimeException;
/*     */     //   451	151	6	openAIResponse	Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponse;
/*     */     //   602	33	6	openAIResponse	Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponse;
/*     */     //   635	28	6	openAIResponse	Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponse;
/*     */     //   730	18	6	ex	Ljava/lang/Exception;
/*     */     //   421	25	7	$this$decodeFromStream$iv	Lkotlinx/serialization/json/Json;
/*     */     //   505	97	7	cacheReadTokens	J
/*     */     //   602	33	7	cacheReadTokens	J
/*     */     //   635	42	7	cacheReadTokens	J
/*     */     //   521	19	9	$this$mapNotNull$iv	Ljava/lang/Iterable;
/*     */     //   540	7	11	$this$mapNotNullTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   540	62	12	destination$iv$iv	Ljava/util/Collection;
/*     */     //   602	29	12	destination$iv$iv	Ljava/util/Collection;
/*     */     //   547	12	14	$this$forEach$iv$iv$iv	Ljava/lang/Iterable;
/*     */     //   578	4	17	element$iv$iv$iv	Ljava/lang/Object;
/*     */     //   582	43	18	element$iv$iv	Ljava/lang/Object;
/*     */     //   592	10	20	it	Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseChoice;
/*     */     //   608	13	22	it$iv$iv	Ljava/lang/Object;
/*     */     //   312	3	7	$i$a$-let-OpenAIChatRequest$handleBatchResponse$2	I
/*     */     //   424	22	8	$i$f$decodeFromStream	I
/*     */     //   595	7	21	$i$a$-mapNotNull-OpenAIChatRequest$handleBatchResponse$3	I
/*     */     //   611	10	23	$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv	I
/*     */     //   585	40	19	$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv	I
/*     */     //   550	79	15	$i$f$forEach	I
/*     */     //   543	88	13	$i$f$mapNotNullTo	I
/*     */     //   524	111	10	$i$f$mapNotNull	I
/*     */     //   0	759	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	698	26	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	691	25	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   329	361	728	java/lang/Exception
/*     */     //   398	728	728	java/lang/Exception
/*     */   } private static final Unit handleBatchResponse$lambda$2(JsonBuilder $this$Json) {
/*  73 */     Intrinsics.checkNotNullParameter($this$Json, "$this$Json"); $this$Json.setIgnoreUnknownKeys(true); return Unit.INSTANCE;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final AIAnswerChoice toChoice(OpenAIResponseChoice $this$toChoice, Map<String, ? extends StopSequenceType> stopReasons) {
/*  91 */     return 
/*  92 */       ($this$toChoice instanceof OpenAIResponseChoiceChat) ? toChoice((OpenAIResponseChoiceChat)$this$toChoice, stopReasons) : 
/*  93 */       null;
/*     */   }
/*     */   
/*     */   private final AIAnswerChoice toChoice(OpenAIResponseChoiceChat $this$toChoice, Map<String, ? extends StopSequenceType> stopReasons) {
/*  97 */     $this$toChoice.getFinishDetails();
/*     */     
/*  99 */     StopSequence stopSequence = getStopSequence($this$toChoice.getFinishDetails(), stopReasons);
/* 100 */     (stopSequence != null) ? stopSequence.getType() : null;
/*     */ 
/*     */ 
/*     */     
/*     */     String content = $this$toChoice.getMessage().getContent() + $this$toChoice.getMessage().getContent();
/*     */ 
/*     */     
/* 107 */     return (AIAnswerChoice)new AIContentAnswerChoice(content, $this$toChoice.getMessage().getLogits(), null, 4, null); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\031\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\013\020\r\032\004\030\0010\005HÆ\003J\037\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\n\020\013¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatRequest$StopSequence;", "", "sequence", "", "type", "Lcom/intellij/ml/llm/matterhorn/llm/StopSequenceType;", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/StopSequenceType;)V", "getSequence", "()Ljava/lang/String;", "getType", "()Lcom/intellij/ml/llm/matterhorn/llm/StopSequenceType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core-llm"})
/*     */   public static final class StopSequence { @NotNull
/*     */     private final String sequence; @Nullable
/* 110 */     private final StopSequenceType type; public StopSequence(@NotNull String sequence, @Nullable StopSequenceType type) { this.sequence = sequence; this.type = type; } @NotNull public final String getSequence() { return this.sequence; } @NotNull public final String component1() { return this.sequence; } @Nullable public final StopSequenceType component2() { return this.type; } @NotNull public final StopSequence copy(@NotNull String sequence, @Nullable StopSequenceType type) { Intrinsics.checkNotNullParameter(sequence, "sequence"); return new StopSequence(sequence, type); } @Nullable public final StopSequenceType getType() { return this.type; }
/*     */     @NotNull public String toString() { return "StopSequence(sequence=" + this.sequence + ", type=" + this.type + ")"; } public int hashCode() { result = this.sequence.hashCode(); return result * 31 + ((this.type == null) ? 0 : this.type.hashCode()); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof StopSequence)) return false;  StopSequence stopSequence = (StopSequence)other; return !Intrinsics.areEqual(this.sequence, stopSequence.sequence) ? false : (!(this.type != stopSequence.type)); } }
/* 112 */    private final StopSequence getStopSequence(FinishDetails $this$getStopSequence, Map stopReasons) { return ($this$getStopSequence != null && $this$getStopSequence.getStop() != null) ? 
/*     */       
/* 114 */       new StopSequence($this$getStopSequence.getStop(), (StopSequenceType)stopReasons.get($this$getStopSequence.getStop())) : null; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Object send(@Nullable AccessToken accessToken, @NotNull Continuation<? super AIAnswer> $completion) {
/*     */     return send$suspendImpl(this, accessToken, $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "OpenAIChatRequest.kt", l = {68, 71, 75}, i = {1, 1, 1, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, n = {"this", "response", "stopReasons", "this", "stopReasons", "json"}, m = "handleBatchResponse", c = "com.intellij.ml.llm.matterhorn.core.llm.openai.OpenAIChatRequest")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class OpenAIChatRequest$handleBatchResponse$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     OpenAIChatRequest$handleBatchResponse$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return OpenAIChatRequest.this.handleBatchResponse(null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "OpenAIChatRequest.kt", l = {129, 130, 143, 149, 59}, i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3"}, n = {"$this", "accessToken", "$this$createRequest$iv", "propertyProvider$iv", "builder$iv", "logger$iv", "$this", "accessToken", "$this$createRequest$iv", "propertyProvider$iv", "builder$iv", "logger$iv", "url$iv", "$this", "$this$createRequest$iv", "propertyProvider$iv", "builder$iv", "logger$iv", "$this", "$this$createRequest$iv", "builder$iv", "token$iv"}, m = "send$suspendImpl", c = "com.intellij.ml.llm.matterhorn.core.llm.openai.OpenAIChatRequest")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class OpenAIChatRequest$send$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     int label;
/*     */     
/*     */     OpenAIChatRequest$send$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return OpenAIChatRequest.send$suspendImpl(OpenAIChatRequest.this, null, (Continuation<? super AIAnswer>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\openai\OpenAIChatRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */