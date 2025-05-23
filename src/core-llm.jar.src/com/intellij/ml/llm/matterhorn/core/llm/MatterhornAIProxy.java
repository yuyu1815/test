/*     */ package com.intellij.ml.llm.matterhorn.core.llm;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
/*     */ import com.intellij.ml.llm.matterhorn.MatterhornCaches;
/*     */ import com.intellij.ml.llm.matterhorn.core.llm.anthropic.AnthropicError;
/*     */ import com.intellij.ml.llm.matterhorn.core.llm.ingrazzio.AccessToken;
/*     */ import com.intellij.ml.llm.matterhorn.llm.AIAnswer;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LLM;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
/*     */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*     */ import io.ktor.http.HttpStatusCode;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020%\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020$\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\020\b\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\005\030\000 82\0020\001:\0018BA\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007\022\b\b\002\020\b\032\0020\007\022\n\b\002\020\t\032\004\030\0010\n\022\b\b\002\020\013\032\0020\f¢\006\004\b\r\020\016J\026\020\026\032\0020\0272\006\020\030\032\0020\0242\006\020\031\032\0020\025J\024\020\036\032\016\022\004\022\0020\024\022\004\022\0020\0250\037H\002J2\020 \032\0020!2\006\020\"\032\0020#2\006\020$\032\0020%2\022\020&\032\016\022\004\022\0020(\022\004\022\0020\0270'H@¢\006\002\020)J\036\020*\032\0020\0272\006\020\"\032\0020#2\006\020$\032\0020%H@¢\006\002\020+J2\020,\032\0020!2\"\020-\032\036\b\001\022\004\022\0020/\022\n\022\b\022\004\022\0020!00\022\006\022\004\030\001010.H@¢\006\002\0202J\026\0203\032\002042\006\0205\032\00204H@¢\006\002\0206J\036\0207\032\0020!2\006\020\"\032\0020#2\006\020$\032\0020%H@¢\006\002\020+R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\b\032\0020\007X\004¢\006\002\n\000R\020\020\t\032\004\030\0010\nX\004¢\006\002\n\000R\016\020\013\032\0020\fX\004¢\006\002\n\000R\022\020\017\032\0060\020j\002`\021X\004¢\006\002\n\000R\032\020\022\032\016\022\004\022\0020\024\022\004\022\0020\0250\023X\004¢\006\002\n\000R\024\020\032\032\0020\0338VX\004¢\006\006\032\004\b\034\020\035¨\0069"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy;", "Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;", "llmCache", "Lcom/intellij/ml/llm/matterhorn/core/llm/AICache;", "matterhornCaches", "Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;", "delayStrategy", "Lcom/intellij/ml/llm/matterhorn/core/llm/DelayStrategy;", "delayStrategyForRateLimit", "accessToken", "Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/core/llm/AICache;Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;Lcom/intellij/ml/llm/matterhorn/core/llm/DelayStrategy;Lcom/intellij/ml/llm/matterhorn/core/llm/DelayStrategy;Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;)V", "nonCachedRequests", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "llmClients", "", "Lcom/intellij/ml/llm/matterhorn/llm/LLM;", "Lcom/intellij/ml/llm/matterhorn/core/llm/LlmClient;", "registerLLMClient", "", "llm", "client", "imagesSupported", "", "getImagesSupported", "()Z", "buildLlmClientsMapping", "", "sendChat", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "chat", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "eventHandler", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "(Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logNonCachedRequest", "(Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendWithRecovery", "send", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendImageGenerationRequestToOpenAI", "", "imageDescription", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setMatterhornServerStateAndWait", "Companion", "core-llm"})
/*     */ @SourceDebugExtension({"SMAP\nMatterhornAIProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornAIProxy.kt\ncom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 service.kt\ncom/intellij/openapi/components/ServiceKt\n+ 5 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,224:1\n1#2:225\n827#3:226\n855#3,2:227\n40#4,3:229\n14#5:232\n*S KotlinDebug\n*F\n+ 1 MatterhornAIProxy.kt\ncom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy\n*L\n62#1:226\n62#1:227,2\n220#1:229,3\n68#1:232\n*E\n"})
/*     */ public final class MatterhornAIProxy implements LLMProxy {
/*  30 */   public MatterhornAIProxy(@NotNull AICache llmCache, @NotNull MatterhornCaches matterhornCaches, @NotNull DelayStrategy delayStrategy, @NotNull DelayStrategy delayStrategyForRateLimit, @Nullable AccessToken accessToken, @NotNull MatterhornPropertyProvider propertyProvider) { this.llmCache = llmCache;
/*  31 */     this.matterhornCaches = matterhornCaches;
/*     */     
/*  33 */     this.delayStrategy = delayStrategy;
/*  34 */     this.delayStrategyForRateLimit = delayStrategyForRateLimit;
/*  35 */     this.accessToken = accessToken;
/*  36 */     this.propertyProvider = propertyProvider;
/*     */ 
/*     */ 
/*     */     
/*  40 */     EnvExtensionsKt.assertHasMatterhornProxy(BuildConfigKt.getConfig());
/*     */     
/*  42 */     this.nonCachedRequests = new StringBuilder();
/*  43 */     this.llmClients = MapsKt.toMutableMap(buildLlmClientsMapping()); } @Nullable
/*     */   public Object sendWithTracking(@NotNull MatterhornChat chat, @NotNull ModelParameters modelParameters, @NotNull MatterhornPropertyProvider propertyProvider, @NotNull Function4 request, @NotNull Function1 eventHandler, @NotNull Continuation $completion) { return LLMProxy.DefaultImpls.sendWithTracking(this, chat, modelParameters, propertyProvider, request, eventHandler, $completion); }
/*     */   public final void registerLLMClient(@NotNull LLM llm, @NotNull LlmClient client) {
/*  46 */     Intrinsics.checkNotNullParameter(llm, "llm"); Intrinsics.checkNotNullParameter(client, "client"); this.llmClients.put(llm, client);
/*     */   }
/*     */   
/*     */   public boolean getImagesSupported() {
/*  50 */     return BuildConfigKt.getConfig().getBinaryAttachments();
/*     */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\016\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\034\020\006\032\n\030\0010\007j\004\030\001`\b*\0020\tH@¢\006\004\b\n\020\013J!\020\f\032\0060\007j\002`\b2\006\020\r\032\0020\0162\006\020\017\032\0020\020H\000¢\006\002\b\021J\022\020\022\032\0020\020*\0020\tH@¢\006\002\020\013R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "toLlmException", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lio/ktor/client/statement/HttpResponse;", "toLlmException$core_llm", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertToLlmException", "status", "Lio/ktor/http/HttpStatusCode;", "bodyText", "", "convertToLlmException$core_llm", "getBody", "core-llm"}) @SourceDebugExtension({"SMAP\nMatterhornAIProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornAIProxy.kt\ncom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,224:1\n1#2:225\n222#3:226\n*S KotlinDebug\n*F\n+ 1 MatterhornAIProxy.kt\ncom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion\n*L\n85#1:226\n*E\n"}) public static final class Companion { private Companion() {} @Nullable public final Object toLlmException$core_llm(@NotNull HttpResponse $this$toLlmException, @NotNull Continuation $completion) { // Byte code:
/*     */       //   0: aload_2
/*     */       //   1: instanceof com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion$toLlmException$1
/*     */       //   4: ifeq -> 39
/*     */       //   7: aload_2
/*     */       //   8: checkcast com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion$toLlmException$1
/*     */       //   11: astore #7
/*     */       //   13: aload #7
/*     */       //   15: getfield label : I
/*     */       //   18: ldc -2147483648
/*     */       //   20: iand
/*     */       //   21: ifeq -> 39
/*     */       //   24: aload #7
/*     */       //   26: dup
/*     */       //   27: getfield label : I
/*     */       //   30: ldc -2147483648
/*     */       //   32: isub
/*     */       //   33: putfield label : I
/*     */       //   36: goto -> 50
/*     */       //   39: new com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion$toLlmException$1
/*     */       //   42: dup
/*     */       //   43: aload_0
/*     */       //   44: aload_2
/*     */       //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion;Lkotlin/coroutines/Continuation;)V
/*     */       //   48: astore #7
/*     */       //   50: aload #7
/*     */       //   52: getfield result : Ljava/lang/Object;
/*     */       //   55: astore #6
/*     */       //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   60: astore #8
/*     */       //   62: aload #7
/*     */       //   64: getfield label : I
/*     */       //   67: tableswitch default -> 198, 0 -> 88, 1 -> 154
/*     */       //   88: aload #6
/*     */       //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   93: aload_1
/*     */       //   94: invokevirtual getStatus : ()Lio/ktor/http/HttpStatusCode;
/*     */       //   97: getstatic io/ktor/http/HttpStatusCode.Companion : Lio/ktor/http/HttpStatusCode$Companion;
/*     */       //   100: invokevirtual getOK : ()Lio/ktor/http/HttpStatusCode;
/*     */       //   103: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   106: ifne -> 196
/*     */       //   109: aload_0
/*     */       //   110: aload_1
/*     */       //   111: invokevirtual getStatus : ()Lio/ktor/http/HttpStatusCode;
/*     */       //   114: astore #4
/*     */       //   116: astore_3
/*     */       //   117: aload_1
/*     */       //   118: aconst_null
/*     */       //   119: aload #7
/*     */       //   121: iconst_1
/*     */       //   122: aconst_null
/*     */       //   123: aload #7
/*     */       //   125: aload_3
/*     */       //   126: putfield L$0 : Ljava/lang/Object;
/*     */       //   129: aload #7
/*     */       //   131: aload #4
/*     */       //   133: putfield L$1 : Ljava/lang/Object;
/*     */       //   136: aload #7
/*     */       //   138: iconst_1
/*     */       //   139: putfield label : I
/*     */       //   142: invokestatic bodyAsText$default : (Lio/ktor/client/statement/HttpResponse;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */       //   145: dup
/*     */       //   146: aload #8
/*     */       //   148: if_acmpne -> 180
/*     */       //   151: aload #8
/*     */       //   153: areturn
/*     */       //   154: aload #7
/*     */       //   156: getfield L$1 : Ljava/lang/Object;
/*     */       //   159: checkcast io/ktor/http/HttpStatusCode
/*     */       //   162: astore #4
/*     */       //   164: aload #7
/*     */       //   166: getfield L$0 : Ljava/lang/Object;
/*     */       //   169: checkcast com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion
/*     */       //   172: astore_3
/*     */       //   173: aload #6
/*     */       //   175: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   178: aload #6
/*     */       //   180: astore #5
/*     */       //   182: aload_3
/*     */       //   183: aload #4
/*     */       //   185: aload #5
/*     */       //   187: checkcast java/lang/String
/*     */       //   190: invokevirtual convertToLlmException$core_llm : (Lio/ktor/http/HttpStatusCode;Ljava/lang/String;)Ljava/lang/RuntimeException;
/*     */       //   193: goto -> 197
/*     */       //   196: aconst_null
/*     */       //   197: areturn
/*     */       //   198: new java/lang/IllegalStateException
/*     */       //   201: dup
/*     */       //   202: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   204: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   207: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #70	-> 60
/*     */       //   #71	-> 93
/*     */       //   #70	-> 151
/*     */       //   #71	-> 180
/*     */       //   #70	-> 198
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   93	52	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion;
/*     */       //   93	52	1	$this$toLlmException	Lio/ktor/client/statement/HttpResponse;
/*     */       //   0	208	2	$completion	Lkotlin/coroutines/Continuation;
/*     */       //   50	148	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */       //   57	141	6	$result	Ljava/lang/Object; } @NotNull public final RuntimeException convertToLlmException$core_llm(@NotNull HttpStatusCode status, @NotNull String bodyText) { Intrinsics.checkNotNullParameter(status, "status"); Intrinsics.checkNotNullParameter(bodyText, "bodyText"); boolean bool = !Intrinsics.areEqual(status, HttpStatusCode.Companion.getOK()) ? true : false; if (_Assertions.ENABLED && !bool) { int $i$a$-assert-MatterhornAIProxy$Companion$convertToLlmException$1 = 0; String str = "convertToLlmException called with OK status"; throw new AssertionError(str); }  Json json = JsonKt.Json$default(null, Companion::convertToLlmException$lambda$1, 1, null); MatterhornAIProxy.logger.warn("\n        Unexpected response: " + status + " content: " + bodyText + "\n      "); Companion companion = this; try { Companion $this$convertToLlmException_u24lambda_u242 = companion; int $i$a$-runCatching-MatterhornAIProxy$Companion$convertToLlmException$message$res$1 = 0; Json this_$iv = json; int $i$f$decodeFromString = 0; this_$iv.getSerializersModule(); object1 = Result.constructor-impl(this_$iv.decodeFromString((DeserializationStrategy)AnthropicErrorWrapper.Companion.serializer(), bodyText)); } catch (Throwable throwable) { object1 = Result.constructor-impl(ResultKt.createFailure(throwable)); }  Object res = object1; Object object1 = res; ResultKt.throwOnFailure(object1); AnthropicErrorWrapper wrapper = (AnthropicErrorWrapper)object1; AnthropicError error = wrapper.getError(); if (StringsKt.startsWith$default(error.getMessage(), "prompt is too long", false, 2, null) || Intrinsics.areEqual(error.getCode(), "string_above_max_length") || Intrinsics.areEqual(error.getCode(), "context_length_exceeded")) throw new LLMContextLengthExceeded(error.getMessage(), null);  String message = (status.getValue() == 400) ? (Result.isSuccess-impl(res) ? (error.getMessage() + " code: " + error.getMessage()) : null) : null; if (message == null); String finalMessage = "Server returned response code: " + status; LLMBadResponseException badResponse = new LLMBadResponseException(finalMessage); throw Intrinsics.areEqual(status, HttpStatusCode.Companion.getPaymentRequired()) ? (Throwable)new LLMPaymentRequiredException((RuntimeException)badResponse) : (Intrinsics.areEqual(status, HttpStatusCode.Companion.getForbidden()) ? (Throwable)new LLMCountryForbiddenException((RuntimeException)badResponse) : (Throwable)badResponse); } private static final Unit convertToLlmException$lambda$1(JsonBuilder $this$Json) { Intrinsics.checkNotNullParameter($this$Json, "$this$Json"); $this$Json.setIgnoreUnknownKeys(true); return Unit.INSTANCE; } @Nullable public final Object getBody(@NotNull HttpResponse $this$getBody, @NotNull Continuation $completion) { // Byte code:
/*     */       //   0: aload_2
/*     */       //   1: instanceof com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion$getBody$1
/*     */       //   4: ifeq -> 39
/*     */       //   7: aload_2
/*     */       //   8: checkcast com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion$getBody$1
/*     */       //   11: astore #9
/*     */       //   13: aload #9
/*     */       //   15: getfield label : I
/*     */       //   18: ldc -2147483648
/*     */       //   20: iand
/*     */       //   21: ifeq -> 39
/*     */       //   24: aload #9
/*     */       //   26: dup
/*     */       //   27: getfield label : I
/*     */       //   30: ldc -2147483648
/*     */       //   32: isub
/*     */       //   33: putfield label : I
/*     */       //   36: goto -> 50
/*     */       //   39: new com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion$getBody$1
/*     */       //   42: dup
/*     */       //   43: aload_0
/*     */       //   44: aload_2
/*     */       //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion;Lkotlin/coroutines/Continuation;)V
/*     */       //   48: astore #9
/*     */       //   50: aload #9
/*     */       //   52: getfield result : Ljava/lang/Object;
/*     */       //   55: astore #8
/*     */       //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   60: astore #10
/*     */       //   62: aload #9
/*     */       //   64: getfield label : I
/*     */       //   67: tableswitch default -> 226, 0 -> 88, 1 -> 128
/*     */       //   88: aload #8
/*     */       //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   93: aload_1
/*     */       //   94: astore_3
/*     */       //   95: nop
/*     */       //   96: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*     */       //   99: pop
/*     */       //   100: aload_3
/*     */       //   101: astore #4
/*     */       //   103: iconst_0
/*     */       //   104: istore #5
/*     */       //   106: aload #4
/*     */       //   108: aload #9
/*     */       //   110: aload #9
/*     */       //   112: iconst_1
/*     */       //   113: putfield label : I
/*     */       //   116: invokestatic bodyAsChannel : (Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   119: dup
/*     */       //   120: aload #10
/*     */       //   122: if_acmpne -> 139
/*     */       //   125: aload #10
/*     */       //   127: areturn
/*     */       //   128: iconst_0
/*     */       //   129: istore #5
/*     */       //   131: nop
/*     */       //   132: aload #8
/*     */       //   134: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   137: aload #8
/*     */       //   139: checkcast io/ktor/utils/io/ByteReadChannel
/*     */       //   142: aconst_null
/*     */       //   143: iconst_1
/*     */       //   144: aconst_null
/*     */       //   145: invokestatic toInputStream$default : (Lio/ktor/utils/io/ByteReadChannel;Lkotlinx/coroutines/Job;ILjava/lang/Object;)Ljava/io/InputStream;
/*     */       //   148: astore #6
/*     */       //   150: getstatic kotlin/text/Charsets.UTF_8 : Ljava/nio/charset/Charset;
/*     */       //   153: astore #7
/*     */       //   155: new java/io/InputStreamReader
/*     */       //   158: dup
/*     */       //   159: aload #6
/*     */       //   161: aload #7
/*     */       //   163: invokespecial <init> : (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
/*     */       //   166: checkcast java/io/Reader
/*     */       //   169: invokestatic readText : (Ljava/io/Reader;)Ljava/lang/String;
/*     */       //   172: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   175: astore #4
/*     */       //   177: goto -> 196
/*     */       //   180: astore #5
/*     */       //   182: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*     */       //   185: pop
/*     */       //   186: aload #5
/*     */       //   188: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
/*     */       //   191: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   194: astore #4
/*     */       //   196: aload #4
/*     */       //   198: astore_3
/*     */       //   199: aload_3
/*     */       //   200: invokestatic exceptionOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Throwable;
/*     */       //   203: dup
/*     */       //   204: ifnonnull -> 212
/*     */       //   207: pop
/*     */       //   208: aload_3
/*     */       //   209: goto -> 225
/*     */       //   212: astore #4
/*     */       //   214: iconst_0
/*     */       //   215: istore #5
/*     */       //   217: aload #4
/*     */       //   219: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Throwable;)Ljava/lang/String;
/*     */       //   224: nop
/*     */       //   225: areturn
/*     */       //   226: new java/lang/IllegalStateException
/*     */       //   229: dup
/*     */       //   230: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   232: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   235: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #115	-> 60
/*     */       //   #115	-> 93
/*     */       //   #116	-> 106
/*     */       //   #115	-> 125
/*     */       //   #116	-> 139
/*     */       //   #116	-> 169
/*     */       //   #115	-> 172
/*     */       //   #117	-> 199
/*     */       //   #225	-> 214
/*     */       //   #117	-> 217
/*     */       //   #117	-> 224
/*     */       //   #117	-> 225
/*     */       //   #115	-> 226
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   93	2	1	$this$getBody	Lio/ktor/client/statement/HttpResponse;
/*     */       //   103	16	4	$this$getBody_u24lambda_u243	Lio/ktor/client/statement/HttpResponse;
/*     */       //   214	10	4	it	Ljava/lang/Throwable;
/*     */       //   106	22	5	$i$a$-runCatching-MatterhornAIProxy$Companion$getBody$2	I
/*     */       //   217	7	5	$i$a$-getOrElse-MatterhornAIProxy$Companion$getBody$3	I
/*     */       //   0	236	2	$completion	Lkotlin/coroutines/Continuation;
/*     */       //   50	176	9	$continuation	Lkotlin/coroutines/Continuation;
/*     */       //   57	169	8	$result	Ljava/lang/Object;
/*     */       //   131	41	5	$i$a$-runCatching-MatterhornAIProxy$Companion$getBody$2	I
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   95	119	180	java/lang/Throwable
/*     */       //   131	177	180	java/lang/Throwable } @DebugMetadata(f = "MatterhornAIProxy.kt", l = {116}, i = {}, s = {}, n = {}, m = "getBody", c = "com.intellij.ml.llm.matterhorn.core.llm.MatterhornAIProxy$Companion") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class MatterhornAIProxy$Companion$getBody$1 extends ContinuationImpl {
/*  52 */       int label; MatterhornAIProxy$Companion$getBody$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result; this.label |= Integer.MIN_VALUE; return MatterhornAIProxy.Companion.this.getBody(null, (Continuation<? super String>)this); } } @DebugMetadata(f = "MatterhornAIProxy.kt", l = {71}, i = {}, s = {}, n = {}, m = "toLlmException$core_llm", c = "com.intellij.ml.llm.matterhorn.core.llm.MatterhornAIProxy$Companion") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class MatterhornAIProxy$Companion$toLlmException$1 extends ContinuationImpl { Object L$0; Object L$1; int label; MatterhornAIProxy$Companion$toLlmException$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result; this.label |= Integer.MIN_VALUE; return MatterhornAIProxy.Companion.this.toLlmException$core_llm(null, (Continuation<? super RuntimeException>)this); } } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final AICache llmCache; @NotNull private final MatterhornCaches matterhornCaches; @NotNull private final DelayStrategy delayStrategy; private final Map<LLM, LlmClient> buildLlmClientsMapping() { Map<LLM, LlmClient> map1 = MapsKt.createMapBuilder(), $this$buildLlmClientsMapping_u24lambda_u242 = map1; int $i$a$-buildMap-MatterhornAIProxy$buildLlmClientsMapping$1 = 0;
/*  53 */     Intrinsics.checkNotNullExpressionValue(ServiceLoader.load(MatterhornLlmClientProvider.class, MatterhornLlmClientProvider.class.getClassLoader()), "load(...)"); List providers = CollectionsKt.toList(ServiceLoader.load(MatterhornLlmClientProvider.class, MatterhornLlmClientProvider.class.getClassLoader()));
/*  54 */     for (MatterhornLlmClientProvider provider : providers) {
/*  55 */       LlmClient client = provider.getClient();
/*  56 */       for (LLM llm : provider.getLLMs())
/*  57 */       { if (!(!$this$buildLlmClientsMapping_u24lambda_u242.containsKey(llm) ? 1 : 0))
/*     */         
/*     */         { 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 225 */           int $i$a$-require-MatterhornAIProxy$buildLlmClientsMapping$1$1 = 0; String str = "LLM " + llm.getName() + " already registered with " + Reflection.getOrCreateKotlinClass(MapsKt.getValue($this$buildLlmClientsMapping_u24lambda_u242, llm).getClass()).getSimpleName() + " client"; throw new IllegalArgumentException(str.toString()); }  $this$buildLlmClientsMapping_u24lambda_u242.put(llm, client); } 
/* 226 */     }  Iterable $this$filterNot$iv = LLM.Companion.getKnownModels(); int $i$f$filterNot = 0; Iterable iterable1 = $this$filterNot$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterNotTo = 0;
/* 227 */     for (Object element$iv$iv : iterable1) { LLM it = (LLM)element$iv$iv; int $i$a$-filterNot-MatterhornAIProxy$buildLlmClientsMapping$1$2 = 0; if (!$this$buildLlmClientsMapping_u24lambda_u242.containsKey(it)) destination$iv$iv.add(element$iv$iv);  }
/* 228 */      for (LLM llm : destination$iv$iv)
/*     */       $this$buildLlmClientsMapping_u24lambda_u242.put(llm, OpenAIChatCompletionsClient.INSTANCE); 
/*     */     return MapsKt.build(map1); } @NotNull private final DelayStrategy delayStrategyForRateLimit; @Nullable private final AccessToken accessToken; @NotNull private final MatterhornPropertyProvider propertyProvider; @NotNull private final StringBuilder nonCachedRequests; @NotNull
/*     */   private final Map<LLM, LlmClient> llmClients; static { int $i$f$logger = 0;
/* 232 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(MatterhornAIProxy.class), "getInstance(...)"); } @Nullable public Object sendChat(@NotNull MatterhornChat chat, @NotNull ModelParameters modelParameters, @NotNull Function1 eventHandler, @NotNull Continuation $completion) { // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$sendChat$1
/*     */     //   5: ifeq -> 43
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$sendChat$1
/*     */     //   13: astore #7
/*     */     //   15: aload #7
/*     */     //   17: getfield label : I
/*     */     //   20: ldc_w -2147483648
/*     */     //   23: iand
/*     */     //   24: ifeq -> 43
/*     */     //   27: aload #7
/*     */     //   29: dup
/*     */     //   30: getfield label : I
/*     */     //   33: ldc_w -2147483648
/*     */     //   36: isub
/*     */     //   37: putfield label : I
/*     */     //   40: goto -> 55
/*     */     //   43: new com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$sendChat$1
/*     */     //   46: dup
/*     */     //   47: aload_0
/*     */     //   48: aload #4
/*     */     //   50: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy;Lkotlin/coroutines/Continuation;)V
/*     */     //   53: astore #7
/*     */     //   55: aload #7
/*     */     //   57: getfield result : Ljava/lang/Object;
/*     */     //   60: astore #6
/*     */     //   62: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   65: astore #8
/*     */     //   67: aload #7
/*     */     //   69: getfield label : I
/*     */     //   72: tableswitch default -> 305, 0 -> 100, 1 -> 166, 2 -> 265
/*     */     //   100: aload #6
/*     */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   105: aload_0
/*     */     //   106: getfield llmCache : Lcom/intellij/ml/llm/matterhorn/core/llm/AICache;
/*     */     //   109: aload_1
/*     */     //   110: aload_2
/*     */     //   111: new com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$sendChat$result$1
/*     */     //   114: dup
/*     */     //   115: aload_2
/*     */     //   116: aload_0
/*     */     //   117: aload_1
/*     */     //   118: aload_3
/*     */     //   119: aconst_null
/*     */     //   120: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
/*     */     //   123: checkcast kotlin/jvm/functions/Function1
/*     */     //   126: aload #7
/*     */     //   128: aload #7
/*     */     //   130: aload_0
/*     */     //   131: putfield L$0 : Ljava/lang/Object;
/*     */     //   134: aload #7
/*     */     //   136: aload_1
/*     */     //   137: putfield L$1 : Ljava/lang/Object;
/*     */     //   140: aload #7
/*     */     //   142: aload_2
/*     */     //   143: putfield L$2 : Ljava/lang/Object;
/*     */     //   146: aload #7
/*     */     //   148: iconst_1
/*     */     //   149: putfield label : I
/*     */     //   152: invokeinterface lookupOrBuild : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   157: dup
/*     */     //   158: aload #8
/*     */     //   160: if_acmpne -> 200
/*     */     //   163: aload #8
/*     */     //   165: areturn
/*     */     //   166: aload #7
/*     */     //   168: getfield L$2 : Ljava/lang/Object;
/*     */     //   171: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*     */     //   174: astore_2
/*     */     //   175: aload #7
/*     */     //   177: getfield L$1 : Ljava/lang/Object;
/*     */     //   180: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*     */     //   183: astore_1
/*     */     //   184: aload #7
/*     */     //   186: getfield L$0 : Ljava/lang/Object;
/*     */     //   189: checkcast com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy
/*     */     //   192: astore_0
/*     */     //   193: aload #6
/*     */     //   195: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   198: aload #6
/*     */     //   200: checkcast com/intellij/ml/llm/matterhorn/llm/AIAnswer
/*     */     //   203: astore #5
/*     */     //   205: aload #5
/*     */     //   207: invokevirtual getCached : ()Z
/*     */     //   210: ifne -> 283
/*     */     //   213: aload_0
/*     */     //   214: getfield llmCache : Lcom/intellij/ml/llm/matterhorn/core/llm/AICache;
/*     */     //   217: instanceof com/intellij/ml/llm/matterhorn/core/llm/RedisAICaches
/*     */     //   220: ifeq -> 283
/*     */     //   223: aload_0
/*     */     //   224: aload_1
/*     */     //   225: aload_2
/*     */     //   226: aload #7
/*     */     //   228: aload #7
/*     */     //   230: aload #5
/*     */     //   232: putfield L$0 : Ljava/lang/Object;
/*     */     //   235: aload #7
/*     */     //   237: aconst_null
/*     */     //   238: putfield L$1 : Ljava/lang/Object;
/*     */     //   241: aload #7
/*     */     //   243: aconst_null
/*     */     //   244: putfield L$2 : Ljava/lang/Object;
/*     */     //   247: aload #7
/*     */     //   249: iconst_2
/*     */     //   250: putfield label : I
/*     */     //   253: invokevirtual logNonCachedRequest : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   256: dup
/*     */     //   257: aload #8
/*     */     //   259: if_acmpne -> 282
/*     */     //   262: aload #8
/*     */     //   264: areturn
/*     */     //   265: aload #7
/*     */     //   267: getfield L$0 : Ljava/lang/Object;
/*     */     //   270: checkcast com/intellij/ml/llm/matterhorn/llm/AIAnswer
/*     */     //   273: astore #5
/*     */     //   275: aload #6
/*     */     //   277: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   280: aload #6
/*     */     //   282: pop
/*     */     //   283: aload #5
/*     */     //   285: aconst_null
/*     */     //   286: aload #5
/*     */     //   288: invokevirtual getContentChoices : ()Ljava/util/List;
/*     */     //   291: lconst_0
/*     */     //   292: lconst_0
/*     */     //   293: lconst_0
/*     */     //   294: lconst_0
/*     */     //   295: lconst_0
/*     */     //   296: iconst_0
/*     */     //   297: sipush #253
/*     */     //   300: aconst_null
/*     */     //   301: invokestatic copy$default : (Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;Lcom/intellij/ml/llm/matterhorn/llm/LLM;Ljava/util/List;JJJJJZILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;
/*     */     //   304: areturn
/*     */     //   305: new java/lang/IllegalStateException
/*     */     //   308: dup
/*     */     //   309: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   312: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   315: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #120	-> 65
/*     */     //   #121	-> 105
/*     */     //   #120	-> 163
/*     */     //   #146	-> 205
/*     */     //   #147	-> 213
/*     */     //   #148	-> 223
/*     */     //   #120	-> 262
/*     */     //   #152	-> 282
/*     */     //   #120	-> 305
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	61	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy;
/*     */     //   193	63	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy;
/*     */     //   105	61	1	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*     */     //   184	72	1	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*     */     //   105	61	2	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   175	81	2	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   105	52	3	eventHandler	Lkotlin/jvm/functions/Function1;
/*     */     //   205	60	5	result	Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;
/*     */     //   275	30	5	result	Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;
/*     */     //   0	316	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   55	250	7	$continuation	Lkotlin/coroutines/Continuation;
/* 232 */     //   62	243	6	$result	Ljava/lang/Object; } @NotNull private static final Logger logger = Logger.getInstance(MatterhornAIProxy.class);
/*     */   
/*     */   @DebugMetadata(f = "MatterhornAIProxy.kt", l = {124}, i = {0, 0}, s = {"L$0", "J$0"}, n = {"response", "start$iv"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.MatterhornAIProxy$sendChat$result$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\030\002\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;"})
/*     */   @SourceDebugExtension({"SMAP\nMatterhornAIProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornAIProxy.kt\ncom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$sendChat$result$1\n+ 2 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,224:1\n17#2,6:225\n*S KotlinDebug\n*F\n+ 1 MatterhornAIProxy.kt\ncom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$sendChat$result$1\n*L\n123#1:225,6\n*E\n"})
/*     */   static final class MatterhornAIProxy$sendChat$result$1 extends SuspendLambda implements Function1<Continuation<? super AIAnswer>, Object> {
/*     */     Object L$0;
/*     */     long J$0;
/*     */     int label;
/*     */     
/*     */     MatterhornAIProxy$sendChat$result$1(MatterhornAIProxy $receiver, MatterhornChat $chat, Function1<CustomArtifactEvent, Unit> $eventHandler, Continuation $completion) {
/*     */       super(1, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Ref.ObjectRef<AIAnswer> objectRef;
/*     */       Ref.ObjectRef response;
/*     */       long time;
/*     */       ModelParameters modelParameters;
/*     */       MatterhornAIProxy matterhornAIProxy;
/*     */       MatterhornChat matterhornChat;
/*     */       Function1<CustomArtifactEvent, Unit> function1;
/*     */       int $i$f$measureTimeMillis;
/*     */       long start$iv;
/*     */       int $i$a$-measureTimeMillis-MatterhornAIProxy$sendChat$result$1$time$1;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           objectRef = new Ref.ObjectRef();
/*     */           modelParameters = this.$modelParameters;
/*     */           matterhornAIProxy = MatterhornAIProxy.this;
/*     */           matterhornChat = this.$chat;
/*     */           function1 = this.$eventHandler;
/*     */           $i$f$measureTimeMillis = 0;
/*     */           start$iv = System.currentTimeMillis();
/*     */           $i$a$-measureTimeMillis-MatterhornAIProxy$sendChat$result$1$time$1 = 0;
/*     */           this.L$0 = objectRef;
/*     */           this.J$0 = start$iv;
/*     */           this.label = 1;
/*     */           if (BuildersKt.withContext((CoroutineContext)Dispatchers.getDefault(), new MatterhornAIProxy$sendChat$result$1$time$1$1(modelParameters, matterhornAIProxy, matterhornChat, function1, null), (Continuation)this) == object)
/*     */             return object; 
/*     */           BuildersKt.withContext((CoroutineContext)Dispatchers.getDefault(), new MatterhornAIProxy$sendChat$result$1$time$1$1(modelParameters, matterhornAIProxy, matterhornChat, function1, null), (Continuation)this);
/*     */           time = System.currentTimeMillis() - start$iv;
/*     */           ((AIAnswer)objectRef.element).setTime(time);
/*     */           return objectRef.element;
/*     */         case 1:
/*     */           $i$f$measureTimeMillis = 0;
/*     */           $i$a$-measureTimeMillis-MatterhornAIProxy$sendChat$result$1$time$1 = 0;
/*     */           start$iv = this.J$0;
/*     */           response = (Ref.ObjectRef)this.L$0;
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           time = System.currentTimeMillis() - start$iv;
/*     */           ((AIAnswer)response.element).setTime(time);
/*     */           return response.element;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Continuation<? super MatterhornAIProxy$sendChat$result$1> $completion) {
/*     */       return (Continuation<Unit>)new MatterhornAIProxy$sendChat$result$1(MatterhornAIProxy.this, this.$chat, this.$eventHandler, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(Continuation<?> p1) {
/*     */       return ((MatterhornAIProxy$sendChat$result$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     @DebugMetadata(f = "MatterhornAIProxy.kt", l = {126, 129}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.MatterhornAIProxy$sendChat$result$1$time$1$1")
/*     */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */     @SourceDebugExtension({"SMAP\nMatterhornAIProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornAIProxy.kt\ncom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$sendChat$result$1$time$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,224:1\n1#2:225\n*E\n"})
/*     */     static final class MatterhornAIProxy$sendChat$result$1$time$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */       Object L$0;
/*     */       int label;
/*     */       
/*     */       MatterhornAIProxy$sendChat$result$1$time$1$1(ModelParameters $modelParameters, MatterhornAIProxy $receiver, MatterhornChat $chat, Function1<CustomArtifactEvent, Unit> $eventHandler, Continuation $completion) {
/*     */         super(2, $completion);
/*     */       }
/*     */       
/*     */       public final Object invokeSuspend(Object $result) {
/*     */         Object object1, object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */         switch (this.label) {
/*     */           case 0:
/*     */             ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */             if (ModelParameters.Companion.isServerMode(this.$modelParameters)) {
/*     */               object1 = this.$response;
/*     */               this.L$0 = object1;
/*     */               this.label = 1;
/*     */               if (MatterhornAIProxy.this.setMatterhornServerStateAndWait(this.$chat, this.$modelParameters, (Continuation)this) == object2)
/*     */                 return object2; 
/*     */             } else {
/*     */               Object object = MatterhornAIProxy.this.llmClients.get(this.$modelParameters.getModel());
/*     */               ModelParameters modelParameters = this.$modelParameters;
/*     */               if (object == null) {
/*     */                 Object object3 = object;
/*     */                 int $i$a$-requireNotNull-MatterhornAIProxy$sendChat$result$1$time$1$1$client$1 = 0;
/*     */                 String str = "LLM client not found for model: " + modelParameters.getModel().getName();
/*     */                 throw new IllegalArgumentException(str.toString());
/*     */               } 
/*     */               LlmClient client = (LlmClient)object;
/*     */               object1 = object;
/*     */               this.L$0 = object1;
/*     */               this.label = 2;
/*     */               if (MatterhornAIProxy.this.sendWithTracking(this.$chat, this.$modelParameters, MatterhornAIProxy.this.propertyProvider, new Function4<MatterhornChat, ModelParameters, MatterhornPropertyProvider, Continuation<? super AIAnswer>, Object>(MatterhornAIProxy.this, null) {
/*     */                     int label;
/*     */                     
/*     */                     public final Object invokeSuspend(Object $result) {
/*     */                       MatterhornChat chat;
/*     */                       ModelParameters modelParameters;
/*     */                       MatterhornPropertyProvider propertyProvider;
/*     */                       LlmRequest request;
/*     */                       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                       switch (this.label) {
/*     */                         case 0:
/*     */                           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                           chat = (MatterhornChat)this.L$0;
/*     */                           modelParameters = (ModelParameters)this.L$1;
/*     */                           propertyProvider = (MatterhornPropertyProvider)this.L$2;
/*     */                           request = this.$client.createRequest(chat, modelParameters, propertyProvider);
/*     */                           this.L$0 = null;
/*     */                           this.L$1 = null;
/*     */                           this.label = 1;
/*     */                           if (request.send(MatterhornAIProxy.this.accessToken, (Continuation<? super AIAnswer>)this) == object)
/*     */                             return object; 
/*     */                           return request.send(MatterhornAIProxy.this.accessToken, (Continuation<? super AIAnswer>)this);
/*     */                         case 1:
/*     */                           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                           return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */                       } 
/*     */                       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                     }
/*     */                     
/*     */                     public final Object invoke(MatterhornChat p1, ModelParameters p2, MatterhornPropertyProvider p3, Continuation<? super null> p4) {
/*     */                       Function4<MatterhornChat, ModelParameters, MatterhornPropertyProvider, Continuation<? super AIAnswer>, Object> function4 = new Function4<>(this.$client, MatterhornAIProxy.this, p4);
/*     */                       function4.L$0 = p1;
/*     */                       function4.L$1 = p2;
/*     */                       function4.L$2 = p3;
/*     */                       return function4.invokeSuspend(Unit.INSTANCE);
/*     */                     }
/*     */                   }this.$eventHandler, (Continuation<? super AIAnswer>)this) == object2)
/*     */                 return object2; 
/*     */             } 
/*     */           case 1:
/*     */             object1 = this.L$0;
/*     */             ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           case 2:
/*     */             object1 = this.L$0;
/*     */             ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         } 
/*     */         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */       }
/*     */       
/*     */       public final Continuation<Unit> create(Object value, Continuation<? super MatterhornAIProxy$sendChat$result$1$time$1$1> $completion) {
/*     */         return (Continuation<Unit>)new MatterhornAIProxy$sendChat$result$1$time$1$1(this.$modelParameters, MatterhornAIProxy.this, this.$chat, this.$eventHandler, $completion);
/*     */       }
/*     */       
/*     */       public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */         return ((MatterhornAIProxy$sendChat$result$1$time$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object logNonCachedRequest(@NotNull MatterhornChat chat, @NotNull ModelParameters modelParameters, @NotNull Continuation $completion) {
/*     */     synchronized (this.nonCachedRequests) {
/*     */       int $i$a$-synchronized-MatterhornAIProxy$logNonCachedRequest$2 = 0;
/*     */       Intrinsics.checkNotNullExpressionValue(this.nonCachedRequests.append(RedisAICaches.Companion.getQueryHash(chat, modelParameters)), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(this.nonCachedRequests.append(RedisAICaches.Companion.getQueryHash(chat, modelParameters)).append('\n'), "append(...)");
/*     */       StringBuilder stringBuilder = this.nonCachedRequests.append(RedisAICaches.Companion.getQueryHash(chat, modelParameters)).append('\n');
/*     */     } 
/*     */     if (BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new MatterhornAIProxy$logNonCachedRequest$3(null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new MatterhornAIProxy$logNonCachedRequest$3(null), $completion); 
/*     */     BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new MatterhornAIProxy$logNonCachedRequest$3(null), $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "MatterhornAIProxy.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.MatterhornAIProxy$logNonCachedRequest$3")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class MatterhornAIProxy$logNonCachedRequest$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     MatterhornAIProxy$logNonCachedRequest$3(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           Intrinsics.checkNotNullExpressionValue(MatterhornAIProxy.this.nonCachedRequests.toString(), "toString(...)");
/*     */           MatterhornAIProxy.this.matterhornCaches.saveSingle(CacheType.NonCachedRequests, MatterhornAIProxy.this.nonCachedRequests.toString());
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super MatterhornAIProxy$logNonCachedRequest$3> $completion) {
/*     */       return (Continuation<Unit>)new MatterhornAIProxy$logNonCachedRequest$3($completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((MatterhornAIProxy$logNonCachedRequest$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object sendWithRecovery(@NotNull Function2 send, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$sendWithRecovery$1
/*     */     //   4: ifeq -> 41
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$sendWithRecovery$1
/*     */     //   11: astore #8
/*     */     //   13: aload #8
/*     */     //   15: getfield label : I
/*     */     //   18: ldc_w -2147483648
/*     */     //   21: iand
/*     */     //   22: ifeq -> 41
/*     */     //   25: aload #8
/*     */     //   27: dup
/*     */     //   28: getfield label : I
/*     */     //   31: ldc_w -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 52
/*     */     //   41: new com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$sendWithRecovery$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload_2
/*     */     //   47: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy;Lkotlin/coroutines/Continuation;)V
/*     */     //   50: astore #8
/*     */     //   52: aload #8
/*     */     //   54: getfield result : Ljava/lang/Object;
/*     */     //   57: astore #7
/*     */     //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   62: astore #9
/*     */     //   64: aload #8
/*     */     //   66: getfield label : I
/*     */     //   69: tableswitch default -> 518, 0 -> 100, 1 -> 194, 2 -> 335, 3 -> 469
/*     */     //   100: aload #7
/*     */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   105: iconst_0
/*     */     //   106: istore_3
/*     */     //   107: aload_0
/*     */     //   108: getfield delayStrategy : Lcom/intellij/ml/llm/matterhorn/core/llm/DelayStrategy;
/*     */     //   111: invokeinterface getDelays : ()Lkotlin/sequences/Sequence;
/*     */     //   116: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   121: astore #4
/*     */     //   123: aload_0
/*     */     //   124: getfield delayStrategyForRateLimit : Lcom/intellij/ml/llm/matterhorn/core/llm/DelayStrategy;
/*     */     //   127: invokeinterface getDelays : ()Lkotlin/sequences/Sequence;
/*     */     //   132: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   137: astore #5
/*     */     //   139: nop
/*     */     //   140: nop
/*     */     //   141: aload_1
/*     */     //   142: iload_3
/*     */     //   143: invokestatic boxInt : (I)Ljava/lang/Integer;
/*     */     //   146: aload #8
/*     */     //   148: aload #8
/*     */     //   150: aload_1
/*     */     //   151: putfield L$0 : Ljava/lang/Object;
/*     */     //   154: aload #8
/*     */     //   156: aload #4
/*     */     //   158: putfield L$1 : Ljava/lang/Object;
/*     */     //   161: aload #8
/*     */     //   163: aload #5
/*     */     //   165: putfield L$2 : Ljava/lang/Object;
/*     */     //   168: aload #8
/*     */     //   170: iload_3
/*     */     //   171: putfield I$0 : I
/*     */     //   174: aload #8
/*     */     //   176: iconst_1
/*     */     //   177: putfield label : I
/*     */     //   180: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   185: dup
/*     */     //   186: aload #9
/*     */     //   188: if_acmpne -> 237
/*     */     //   191: aload #9
/*     */     //   193: areturn
/*     */     //   194: aload #8
/*     */     //   196: getfield I$0 : I
/*     */     //   199: istore_3
/*     */     //   200: aload #8
/*     */     //   202: getfield L$2 : Ljava/lang/Object;
/*     */     //   205: checkcast java/util/Iterator
/*     */     //   208: astore #5
/*     */     //   210: aload #8
/*     */     //   212: getfield L$1 : Ljava/lang/Object;
/*     */     //   215: checkcast java/util/Iterator
/*     */     //   218: astore #4
/*     */     //   220: aload #8
/*     */     //   222: getfield L$0 : Ljava/lang/Object;
/*     */     //   225: checkcast kotlin/jvm/functions/Function2
/*     */     //   228: astore_1
/*     */     //   229: nop
/*     */     //   230: aload #7
/*     */     //   232: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   235: aload #7
/*     */     //   237: areturn
/*     */     //   238: astore #6
/*     */     //   240: aload #6
/*     */     //   242: athrow
/*     */     //   243: astore #6
/*     */     //   245: aload #6
/*     */     //   247: athrow
/*     */     //   248: astore #6
/*     */     //   250: aload #6
/*     */     //   252: athrow
/*     */     //   253: astore #6
/*     */     //   255: aload #5
/*     */     //   257: invokeinterface hasNext : ()Z
/*     */     //   262: ifeq -> 381
/*     */     //   265: getstatic com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   268: aload #6
/*     */     //   270: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   273: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   276: aload #5
/*     */     //   278: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   283: checkcast java/lang/Number
/*     */     //   286: invokevirtual longValue : ()J
/*     */     //   289: aload #8
/*     */     //   291: aload #8
/*     */     //   293: aload_1
/*     */     //   294: putfield L$0 : Ljava/lang/Object;
/*     */     //   297: aload #8
/*     */     //   299: aload #4
/*     */     //   301: putfield L$1 : Ljava/lang/Object;
/*     */     //   304: aload #8
/*     */     //   306: aload #5
/*     */     //   308: putfield L$2 : Ljava/lang/Object;
/*     */     //   311: aload #8
/*     */     //   313: iload_3
/*     */     //   314: putfield I$0 : I
/*     */     //   317: aload #8
/*     */     //   319: iconst_2
/*     */     //   320: putfield label : I
/*     */     //   323: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   326: dup
/*     */     //   327: aload #9
/*     */     //   329: if_acmpne -> 377
/*     */     //   332: aload #9
/*     */     //   334: areturn
/*     */     //   335: aload #8
/*     */     //   337: getfield I$0 : I
/*     */     //   340: istore_3
/*     */     //   341: aload #8
/*     */     //   343: getfield L$2 : Ljava/lang/Object;
/*     */     //   346: checkcast java/util/Iterator
/*     */     //   349: astore #5
/*     */     //   351: aload #8
/*     */     //   353: getfield L$1 : Ljava/lang/Object;
/*     */     //   356: checkcast java/util/Iterator
/*     */     //   359: astore #4
/*     */     //   361: aload #8
/*     */     //   363: getfield L$0 : Ljava/lang/Object;
/*     */     //   366: checkcast kotlin/jvm/functions/Function2
/*     */     //   369: astore_1
/*     */     //   370: aload #7
/*     */     //   372: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   375: aload #7
/*     */     //   377: pop
/*     */     //   378: goto -> 139
/*     */     //   381: aload #6
/*     */     //   383: athrow
/*     */     //   384: astore #6
/*     */     //   386: aload #4
/*     */     //   388: invokeinterface hasNext : ()Z
/*     */     //   393: ifeq -> 515
/*     */     //   396: iinc #3, 1
/*     */     //   399: getstatic com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   402: aload #6
/*     */     //   404: checkcast java/lang/Throwable
/*     */     //   407: invokevirtual warn : (Ljava/lang/Throwable;)V
/*     */     //   410: aload #4
/*     */     //   412: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   417: checkcast java/lang/Number
/*     */     //   420: invokevirtual longValue : ()J
/*     */     //   423: aload #8
/*     */     //   425: aload #8
/*     */     //   427: aload_1
/*     */     //   428: putfield L$0 : Ljava/lang/Object;
/*     */     //   431: aload #8
/*     */     //   433: aload #4
/*     */     //   435: putfield L$1 : Ljava/lang/Object;
/*     */     //   438: aload #8
/*     */     //   440: aload #5
/*     */     //   442: putfield L$2 : Ljava/lang/Object;
/*     */     //   445: aload #8
/*     */     //   447: iload_3
/*     */     //   448: putfield I$0 : I
/*     */     //   451: aload #8
/*     */     //   453: iconst_3
/*     */     //   454: putfield label : I
/*     */     //   457: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   460: dup
/*     */     //   461: aload #9
/*     */     //   463: if_acmpne -> 511
/*     */     //   466: aload #9
/*     */     //   468: areturn
/*     */     //   469: aload #8
/*     */     //   471: getfield I$0 : I
/*     */     //   474: istore_3
/*     */     //   475: aload #8
/*     */     //   477: getfield L$2 : Ljava/lang/Object;
/*     */     //   480: checkcast java/util/Iterator
/*     */     //   483: astore #5
/*     */     //   485: aload #8
/*     */     //   487: getfield L$1 : Ljava/lang/Object;
/*     */     //   490: checkcast java/util/Iterator
/*     */     //   493: astore #4
/*     */     //   495: aload #8
/*     */     //   497: getfield L$0 : Ljava/lang/Object;
/*     */     //   500: checkcast kotlin/jvm/functions/Function2
/*     */     //   503: astore_1
/*     */     //   504: aload #7
/*     */     //   506: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   509: aload #7
/*     */     //   511: pop
/*     */     //   512: goto -> 139
/*     */     //   515: aload #6
/*     */     //   517: athrow
/*     */     //   518: new java/lang/IllegalStateException
/*     */     //   521: dup
/*     */     //   522: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   525: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   528: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #165	-> 62
/*     */     //   #166	-> 105
/*     */     //   #167	-> 107
/*     */     //   #168	-> 123
/*     */     //   #170	-> 139
/*     */     //   #171	-> 140
/*     */     //   #172	-> 141
/*     */     //   #165	-> 191
/*     */     //   #173	-> 237
/*     */     //   #175	-> 240
/*     */     //   #176	-> 243
/*     */     //   #178	-> 245
/*     */     //   #179	-> 248
/*     */     //   #181	-> 250
/*     */     //   #182	-> 253
/*     */     //   #183	-> 255
/*     */     //   #184	-> 265
/*     */     //   #185	-> 276
/*     */     //   #165	-> 332
/*     */     //   #185	-> 377
/*     */     //   #187	-> 381
/*     */     //   #189	-> 384
/*     */     //   #190	-> 386
/*     */     //   #191	-> 396
/*     */     //   #192	-> 399
/*     */     //   #193	-> 410
/*     */     //   #165	-> 466
/*     */     //   #193	-> 511
/*     */     //   #195	-> 515
/*     */     //   #165	-> 518
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	34	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy;
/*     */     //   105	89	1	send	Lkotlin/jvm/functions/Function2;
/*     */     //   229	9	1	send	Lkotlin/jvm/functions/Function2;
/*     */     //   253	82	1	send	Lkotlin/jvm/functions/Function2;
/*     */     //   370	11	1	send	Lkotlin/jvm/functions/Function2;
/*     */     //   384	85	1	send	Lkotlin/jvm/functions/Function2;
/*     */     //   504	11	1	send	Lkotlin/jvm/functions/Function2;
/*     */     //   107	87	3	currentAttempt	I
/*     */     //   200	38	3	currentAttempt	I
/*     */     //   253	82	3	currentAttempt	I
/*     */     //   341	40	3	currentAttempt	I
/*     */     //   384	85	3	currentAttempt	I
/*     */     //   475	40	3	currentAttempt	I
/*     */     //   123	71	4	delaysValues	Ljava/util/Iterator;
/*     */     //   220	18	4	delaysValues	Ljava/util/Iterator;
/*     */     //   253	82	4	delaysValues	Ljava/util/Iterator;
/*     */     //   361	20	4	delaysValues	Ljava/util/Iterator;
/*     */     //   384	85	4	delaysValues	Ljava/util/Iterator;
/*     */     //   495	20	4	delaysValues	Ljava/util/Iterator;
/*     */     //   139	55	5	delaysValuesForRateLimit	Ljava/util/Iterator;
/*     */     //   210	28	5	delaysValuesForRateLimit	Ljava/util/Iterator;
/*     */     //   253	82	5	delaysValuesForRateLimit	Ljava/util/Iterator;
/*     */     //   351	30	5	delaysValuesForRateLimit	Ljava/util/Iterator;
/*     */     //   384	85	5	delaysValuesForRateLimit	Ljava/util/Iterator;
/*     */     //   485	30	5	delaysValuesForRateLimit	Ljava/util/Iterator;
/*     */     //   240	3	6	e	Lcom/intellij/ml/llm/matterhorn/LLMPaymentRequiredException;
/*     */     //   245	3	6	e	Lcom/intellij/ml/llm/matterhorn/LLMCountryForbiddenException;
/*     */     //   250	3	6	e	Lcom/intellij/ml/llm/matterhorn/LLMContextLengthExceeded;
/*     */     //   255	21	6	e	Lcom/intellij/ml/llm/matterhorn/LLMRateLimitError;
/*     */     //   381	3	6	e	Lcom/intellij/ml/llm/matterhorn/LLMRateLimitError;
/*     */     //   386	24	6	e	Ljava/lang/Exception;
/*     */     //   515	3	6	e	Ljava/lang/Exception;
/*     */     //   0	529	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   52	466	8	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   59	459	7	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   140	185	238	com/intellij/ml/llm/matterhorn/LLMPaymentRequiredException
/*     */     //   140	185	243	com/intellij/ml/llm/matterhorn/LLMCountryForbiddenException
/*     */     //   140	185	248	com/intellij/ml/llm/matterhorn/LLMContextLengthExceeded
/*     */     //   140	185	253	com/intellij/ml/llm/matterhorn/LLMRateLimitError
/*     */     //   140	185	384	java/lang/Exception
/*     */     //   229	238	238	com/intellij/ml/llm/matterhorn/LLMPaymentRequiredException
/*     */     //   229	238	243	com/intellij/ml/llm/matterhorn/LLMCountryForbiddenException
/*     */     //   229	238	248	com/intellij/ml/llm/matterhorn/LLMContextLengthExceeded
/*     */     //   229	238	253	com/intellij/ml/llm/matterhorn/LLMRateLimitError
/*     */     //   229	238	384	java/lang/Exception
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object sendImageGenerationRequestToOpenAI(@NotNull String imageDescription, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$sendImageGenerationRequestToOpenAI$1
/*     */     //   4: ifeq -> 41
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$sendImageGenerationRequestToOpenAI$1
/*     */     //   11: astore #6
/*     */     //   13: aload #6
/*     */     //   15: getfield label : I
/*     */     //   18: ldc_w -2147483648
/*     */     //   21: iand
/*     */     //   22: ifeq -> 41
/*     */     //   25: aload #6
/*     */     //   27: dup
/*     */     //   28: getfield label : I
/*     */     //   31: ldc_w -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 52
/*     */     //   41: new com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$sendImageGenerationRequestToOpenAI$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload_2
/*     */     //   47: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy;Lkotlin/coroutines/Continuation;)V
/*     */     //   50: astore #6
/*     */     //   52: aload #6
/*     */     //   54: getfield result : Ljava/lang/Object;
/*     */     //   57: astore #5
/*     */     //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   62: astore #7
/*     */     //   64: aload #6
/*     */     //   66: getfield label : I
/*     */     //   69: tableswitch default -> 210, 0 -> 96, 1 -> 165, 2 -> 202
/*     */     //   96: aload #5
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: new com/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiImageRequestBody
/*     */     //   104: dup
/*     */     //   105: aload_1
/*     */     //   106: aconst_null
/*     */     //   107: iconst_0
/*     */     //   108: aconst_null
/*     */     //   109: aconst_null
/*     */     //   110: aconst_null
/*     */     //   111: aconst_null
/*     */     //   112: aconst_null
/*     */     //   113: sipush #254
/*     */     //   116: aconst_null
/*     */     //   117: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   120: astore_3
/*     */     //   121: new com/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiImageRequest
/*     */     //   124: dup
/*     */     //   125: invokespecial <init> : ()V
/*     */     //   128: aload_3
/*     */     //   129: ldc_w 'https://api.openai.com/v1/images/generations'
/*     */     //   132: ldc_w 'OPENAI_API_KEY'
/*     */     //   135: invokestatic getenv : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   138: dup
/*     */     //   139: ldc_w 'getenv(...)'
/*     */     //   142: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   145: aload #6
/*     */     //   147: aload #6
/*     */     //   149: iconst_1
/*     */     //   150: putfield label : I
/*     */     //   153: invokevirtual send : (Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiImageRequestBody;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   156: dup
/*     */     //   157: aload #7
/*     */     //   159: if_acmpne -> 172
/*     */     //   162: aload #7
/*     */     //   164: areturn
/*     */     //   165: aload #5
/*     */     //   167: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   170: aload #5
/*     */     //   172: checkcast io/ktor/client/statement/HttpResponse
/*     */     //   175: astore #4
/*     */     //   177: aload #4
/*     */     //   179: aconst_null
/*     */     //   180: aload #6
/*     */     //   182: iconst_1
/*     */     //   183: aconst_null
/*     */     //   184: aload #6
/*     */     //   186: iconst_2
/*     */     //   187: putfield label : I
/*     */     //   190: invokestatic bodyAsText$default : (Lio/ktor/client/statement/HttpResponse;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   193: dup
/*     */     //   194: aload #7
/*     */     //   196: if_acmpne -> 209
/*     */     //   199: aload #7
/*     */     //   201: areturn
/*     */     //   202: aload #5
/*     */     //   204: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   207: aload #5
/*     */     //   209: areturn
/*     */     //   210: new java/lang/IllegalStateException
/*     */     //   213: dup
/*     */     //   214: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   217: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   220: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #201	-> 62
/*     */     //   #202	-> 101
/*     */     //   #203	-> 105
/*     */     //   #202	-> 106
/*     */     //   #205	-> 121
/*     */     //   #206	-> 128
/*     */     //   #207	-> 129
/*     */     //   #208	-> 132
/*     */     //   #205	-> 147
/*     */     //   #201	-> 162
/*     */     //   #210	-> 177
/*     */     //   #201	-> 199
/*     */     //   #210	-> 209
/*     */     //   #201	-> 210
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	5	1	imageDescription	Ljava/lang/String;
/*     */     //   121	8	3	body	Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiImageRequestBody;
/*     */     //   177	16	4	response	Lio/ktor/client/statement/HttpResponse;
/*     */     //   0	221	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   52	158	6	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   59	151	5	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private final Object setMatterhornServerStateAndWait(MatterhornChat chat, ModelParameters modelParameters, Continuation<? super AIAnswer> $completion) {
/*     */     OpenAiChatRequestBody body = OpenAIChatCompletionsClient.INSTANCE.createOpenAIRequestBody$core_llm(chat, modelParameters, MapsKt.emptyMap());
/*     */     logger.info("Waiting for step request from LLM agent...");
/*     */     int $i$f$service = 0;
/*     */     Class<MatterhornEnvironmentServer> serviceClass$iv = MatterhornEnvironmentServer.class;
/*     */     if (ApplicationManager.getApplication().getService(serviceClass$iv) == null) {
/*     */       ApplicationManager.getApplication().getService(serviceClass$iv);
/*     */       throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ')');
/*     */     } 
/*     */     return ((MatterhornEnvironmentServer)ApplicationManager.getApplication().getService(serviceClass$iv)).waitForRequest(modelParameters.getModel(), body, $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "MatterhornAIProxy.kt", l = {121, 148}, i = {0, 0, 0, 1}, s = {"L$0", "L$1", "L$2", "L$0"}, n = {"this", "chat", "modelParameters", "result"}, m = "sendChat", c = "com.intellij.ml.llm.matterhorn.core.llm.MatterhornAIProxy")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class MatterhornAIProxy$sendChat$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     MatterhornAIProxy$sendChat$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return MatterhornAIProxy.this.sendChat(null, null, null, (Continuation<? super AIAnswer>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "MatterhornAIProxy.kt", l = {205, 210}, i = {}, s = {}, n = {}, m = "sendImageGenerationRequestToOpenAI", c = "com.intellij.ml.llm.matterhorn.core.llm.MatterhornAIProxy")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class MatterhornAIProxy$sendImageGenerationRequestToOpenAI$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     MatterhornAIProxy$sendImageGenerationRequestToOpenAI$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return MatterhornAIProxy.this.sendImageGenerationRequestToOpenAI(null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "MatterhornAIProxy.kt", l = {172, 185, 193}, i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"}, n = {"send", "delaysValues", "delaysValuesForRateLimit", "currentAttempt", "send", "delaysValues", "delaysValuesForRateLimit", "currentAttempt", "send", "delaysValues", "delaysValuesForRateLimit", "currentAttempt"}, m = "sendWithRecovery", c = "com.intellij.ml.llm.matterhorn.core.llm.MatterhornAIProxy")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class MatterhornAIProxy$sendWithRecovery$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int I$0;
/*     */     int label;
/*     */     
/*     */     MatterhornAIProxy$sendWithRecovery$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return MatterhornAIProxy.this.sendWithRecovery(null, (Continuation<? super AIAnswer>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\MatterhornAIProxy.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */