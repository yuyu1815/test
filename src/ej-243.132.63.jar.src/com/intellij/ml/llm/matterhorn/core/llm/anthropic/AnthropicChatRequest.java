/*     */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.llm.AIContentAnswerChoice;
/*     */ import com.intellij.ml.llm.matterhorn.llm.StopSequenceType;
/*     */ import io.ktor.client.HttpClient;
/*     */ import io.ktor.client.request.HttpRequestBuilder;
/*     */ import io.ktor.client.statement.HttpResponse;
/*     */ import io.ktor.sse.ServerSentEvent;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.JsonElement;
/*     */ import kotlinx.serialization.json.JsonObject;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020$\n\002\020\016\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\r\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\b\026\030\000 62\0020\001:\00267B;\022\006\020\002\032\0020\003\022\022\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\005\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013\022\006\020\f\032\0020\r¢\006\004\b\016\020\017J\030\020\032\032\0020\0332\b\020\034\032\004\030\0010\035H@¢\006\002\020\036J\036\020\037\032\0020\0332\006\020 \032\0020!2\006\020\"\032\0020#H@¢\006\002\020$J,\020%\032\0020\033*\0020&2\006\020'\032\0020(2\b\020)\032\004\030\0010*2\f\020+\032\b\022\004\022\0020-0,H\002J\036\020.\032\0020\0332\006\020 \032\0020!2\006\020\"\032\0020#H@¢\006\002\020$J\030\020/\032\002002\b\020\034\032\004\030\0010\035H@¢\006\002\020\036J \0201\032\00200*\0020\0332\022\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\005H\002J&\0202\032\b\022\004\022\002030,*\0020\0332\022\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\005H\002J\030\0202\032\b\022\004\022\002040,*\b\022\004\022\002050,H\002R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\020\020\021R \020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\005X\004¢\006\b\n\000\032\004\b\022\020\023R\024\020\b\032\0020\tX\004¢\006\b\n\000\032\004\b\024\020\025R\024\020\n\032\0020\013X\004¢\006\b\n\000\032\004\b\026\020\027R\024\020\f\032\0020\rX\004¢\006\b\n\000\032\004\b\030\020\031¨\0068"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest;", "Lcom/intellij/ml/llm/matterhorn/core/llm/LlmRequest;", "requestBody", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequestBody;", "stopReasons", "", "", "Lcom/intellij/ml/llm/matterhorn/llm/StopSequenceType;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "cacheEnabled", "", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequestBody;Ljava/util/Map;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;ZLcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;)V", "getRequestBody", "()Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequestBody;", "getStopReasons", "()Ljava/util/Map;", "getModelParameters", "()Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "getCacheEnabled", "()Z", "getPropertyProvider", "()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "executeRequest", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicResponse;", "accessToken", "Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;", "(Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeWithoutSteaming", "client", "Lio/ktor/client/HttpClient;", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "(Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "decodeStreamedResponse", "Lkotlinx/serialization/json/Json;", "message", "Lkotlinx/serialization/json/JsonObject;", "lastMessageDelta", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta;", "contents", "", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$StreamingContentBuilder;", "executeWithSteaming", "send", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "toAIAnswer", "toChoices", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice;", "Lcom/intellij/ml/llm/matterhorn/llm/AIContentAnswerChoice;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicContent;", "Companion", "StreamingContentBuilder", "core-llm"})
/*     */ @SourceDebugExtension({"SMAP\nAnthropicChatRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnthropicChatRequest.kt\ncom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest\n+ 2 LlmProvider.kt\ncom/intellij/ml/llm/matterhorn/core/llm/LlmProviderKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 4 service.kt\ncom/intellij/openapi/components/ServiceKt\n+ 5 builders.kt\nio/ktor/client/request/BuildersKt\n+ 6 Json.kt\nkotlinx/serialization/json/JsonKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n78#2:221\n80#2,24:223\n105#2,15:250\n14#3:222\n14#3:346\n40#4,3:247\n52#5:265\n335#6:266\n324#6:345\n808#7,11:267\n808#7,11:278\n808#7,11:289\n808#7,11:300\n1557#7:311\n1628#7,2:312\n1246#7,4:316\n1630#7:320\n1557#7:322\n1628#7,3:323\n808#7,11:326\n1557#7:337\n1628#7,3:338\n1557#7:341\n1628#7,3:342\n462#8:314\n412#8:315\n1#9:321\n*S KotlinDebug\n*F\n+ 1 AnthropicChatRequest.kt\ncom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest\n*L\n50#1:221\n50#1:223,24\n50#1:250,15\n50#1:222\n36#1:346\n50#1:247,3\n59#1:265\n72#1:266\n75#1:345\n153#1:267,11\n155#1:278,11\n156#1:289,11\n159#1:300,11\n159#1:311\n159#1:312,2\n163#1:316,4\n159#1:320\n178#1:322\n178#1:323,3\n193#1:326,11\n193#1:337\n193#1:338,3\n73#1:341\n73#1:342,3\n163#1:314\n163#1:315\n*E\n"})
/*     */ public class AnthropicChatRequest implements LlmRequest {
/*  26 */   public AnthropicChatRequest(@NotNull AnthropicChatRequestBody requestBody, @NotNull Map<String, StopSequenceType> stopReasons, @NotNull ModelParameters modelParameters, boolean cacheEnabled, @NotNull MatterhornPropertyProvider propertyProvider) { this.requestBody = requestBody;
/*  27 */     this.stopReasons = stopReasons;
/*  28 */     this.modelParameters = modelParameters;
/*  29 */     this.cacheEnabled = cacheEnabled;
/*  30 */     this.propertyProvider = propertyProvider; } @NotNull protected final AnthropicChatRequestBody getRequestBody() { return this.requestBody; } @NotNull protected final Map<String, StopSequenceType> getStopReasons() { return this.stopReasons; } @NotNull protected final ModelParameters getModelParameters() { return this.modelParameters; } protected final boolean getCacheEnabled() { return this.cacheEnabled; } @NotNull protected final MatterhornPropertyProvider getPropertyProvider() { return this.propertyProvider; }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000R\016\020\007\032\0020\005XT¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\016\020\n\032\0020\013X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$Companion;", "", "<init>", "()V", "ANTHROPIC_VERSION", "", "ANTHROPIC_PROMPT_CACHING_VERSION", "ANTHROPIC_COMPUTER_USE_VERSION", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "json", "Lkotlinx/serialization/json/Json;", "core-llm"})
/*     */   public static final class Companion {
/*     */     private Companion() {} }
/*     */   @NotNull
/*  36 */   public static final Companion Companion = new Companion(null); static { int $i$f$logger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 346 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(AnthropicChatRequest.class), "getInstance(...)"); } @NotNull private static final Json json = JsonKt.Json$default(null, AnthropicChatRequest::json$lambda$13, 1, null); private static final Unit json$lambda$13(JsonBuilder $this$Json) { Intrinsics.checkNotNullParameter($this$Json, "$this$Json"); $this$Json.setIgnoreUnknownKeys(true); return Unit.INSTANCE; } @Nullable protected final Object executeRequest(@Nullable AccessToken accessToken, @NotNull Continuation $completion) { // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$executeRequest$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$executeRequest$1
/*     */     //   11: astore #18
/*     */     //   13: aload #18
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #18
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$executeRequest$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #18
/*     */     //   50: aload #18
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #17
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #19
/*     */     //   62: aload #18
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 1356, 0 -> 108, 1 -> 345, 2 -> 489, 3 -> 846, 4 -> 1016, 5 -> 1272, 6 -> 1348
/*     */     //   108: aload #17
/*     */     //   110: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   113: new java/util/ArrayList
/*     */     //   116: dup
/*     */     //   117: invokespecial <init> : ()V
/*     */     //   120: checkcast java/util/List
/*     */     //   123: astore_3
/*     */     //   124: aload_3
/*     */     //   125: new kotlin/Pair
/*     */     //   128: dup
/*     */     //   129: ldc 'anthropic-version'
/*     */     //   131: ldc '2023-06-01'
/*     */     //   133: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   136: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   141: pop
/*     */     //   142: aload_0
/*     */     //   143: getfield cacheEnabled : Z
/*     */     //   146: ifeq -> 167
/*     */     //   149: aload_3
/*     */     //   150: new kotlin/Pair
/*     */     //   153: dup
/*     */     //   154: ldc 'anthropic-beta'
/*     */     //   156: ldc 'prompt-caching-2024-07-31'
/*     */     //   158: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   161: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   166: pop
/*     */     //   167: aload_0
/*     */     //   168: getfield requestBody : Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequestBody;
/*     */     //   171: invokevirtual getTools : ()Ljava/util/List;
/*     */     //   174: checkcast java/util/Collection
/*     */     //   177: astore #4
/*     */     //   179: aload #4
/*     */     //   181: ifnull -> 194
/*     */     //   184: aload #4
/*     */     //   186: invokeinterface isEmpty : ()Z
/*     */     //   191: ifeq -> 198
/*     */     //   194: iconst_1
/*     */     //   195: goto -> 199
/*     */     //   198: iconst_0
/*     */     //   199: ifne -> 220
/*     */     //   202: aload_3
/*     */     //   203: new kotlin/Pair
/*     */     //   206: dup
/*     */     //   207: ldc 'anthropic-beta'
/*     */     //   209: ldc 'computer-use-2025-01-24'
/*     */     //   211: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   214: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   219: pop
/*     */     //   220: aload_0
/*     */     //   221: getfield modelParameters : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   224: invokevirtual getModel : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   227: invokevirtual getProvider : ()Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
/*     */     //   230: astore #5
/*     */     //   232: aload_0
/*     */     //   233: getfield requestBody : Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequestBody;
/*     */     //   236: astore #6
/*     */     //   238: aload_0
/*     */     //   239: getfield propertyProvider : Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   242: astore #7
/*     */     //   244: iconst_0
/*     */     //   245: istore #8
/*     */     //   247: iconst_0
/*     */     //   248: istore #9
/*     */     //   250: ldc com/intellij/ml/llm/matterhorn/llm/LlmProvider
/*     */     //   252: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   255: dup
/*     */     //   256: ldc 'getInstance(...)'
/*     */     //   258: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   261: astore #10
/*     */     //   263: new com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$executeRequest$$inlined$createRequest$1
/*     */     //   266: dup
/*     */     //   267: aload_3
/*     */     //   268: aload #6
/*     */     //   270: invokespecial <init> : (Ljava/util/List;Ljava/lang/Object;)V
/*     */     //   273: checkcast kotlin/jvm/functions/Function1
/*     */     //   276: invokestatic request : (Lkotlin/jvm/functions/Function1;)Lio/ktor/client/request/HttpRequestBuilder;
/*     */     //   279: astore #9
/*     */     //   281: aload #5
/*     */     //   283: aload #7
/*     */     //   285: aload #18
/*     */     //   287: aload #18
/*     */     //   289: aload_0
/*     */     //   290: putfield L$0 : Ljava/lang/Object;
/*     */     //   293: aload #18
/*     */     //   295: aload_1
/*     */     //   296: putfield L$1 : Ljava/lang/Object;
/*     */     //   299: aload #18
/*     */     //   301: aload #5
/*     */     //   303: putfield L$2 : Ljava/lang/Object;
/*     */     //   306: aload #18
/*     */     //   308: aload #7
/*     */     //   310: putfield L$3 : Ljava/lang/Object;
/*     */     //   313: aload #18
/*     */     //   315: aload #9
/*     */     //   317: putfield L$4 : Ljava/lang/Object;
/*     */     //   320: aload #18
/*     */     //   322: aload #10
/*     */     //   324: putfield L$5 : Ljava/lang/Object;
/*     */     //   327: aload #18
/*     */     //   329: iconst_1
/*     */     //   330: putfield label : I
/*     */     //   333: invokestatic getUrlSafe : (Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   336: dup
/*     */     //   337: aload #19
/*     */     //   339: if_acmpne -> 413
/*     */     //   342: aload #19
/*     */     //   344: areturn
/*     */     //   345: iconst_0
/*     */     //   346: istore #8
/*     */     //   348: aload #18
/*     */     //   350: getfield L$5 : Ljava/lang/Object;
/*     */     //   353: checkcast com/intellij/openapi/diagnostic/Logger
/*     */     //   356: astore #10
/*     */     //   358: aload #18
/*     */     //   360: getfield L$4 : Ljava/lang/Object;
/*     */     //   363: checkcast io/ktor/client/request/HttpRequestBuilder
/*     */     //   366: astore #9
/*     */     //   368: aload #18
/*     */     //   370: getfield L$3 : Ljava/lang/Object;
/*     */     //   373: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   376: astore #7
/*     */     //   378: aload #18
/*     */     //   380: getfield L$2 : Ljava/lang/Object;
/*     */     //   383: checkcast com/intellij/ml/llm/matterhorn/llm/LlmProvider
/*     */     //   386: astore #5
/*     */     //   388: aload #18
/*     */     //   390: getfield L$1 : Ljava/lang/Object;
/*     */     //   393: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken
/*     */     //   396: astore_1
/*     */     //   397: aload #18
/*     */     //   399: getfield L$0 : Ljava/lang/Object;
/*     */     //   402: checkcast com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest
/*     */     //   405: astore_0
/*     */     //   406: aload #17
/*     */     //   408: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   411: aload #17
/*     */     //   413: checkcast java/lang/String
/*     */     //   416: astore #11
/*     */     //   418: aload #5
/*     */     //   420: aload #7
/*     */     //   422: aload #18
/*     */     //   424: aload #18
/*     */     //   426: aload_0
/*     */     //   427: putfield L$0 : Ljava/lang/Object;
/*     */     //   430: aload #18
/*     */     //   432: aload_1
/*     */     //   433: putfield L$1 : Ljava/lang/Object;
/*     */     //   436: aload #18
/*     */     //   438: aload #5
/*     */     //   440: putfield L$2 : Ljava/lang/Object;
/*     */     //   443: aload #18
/*     */     //   445: aload #7
/*     */     //   447: putfield L$3 : Ljava/lang/Object;
/*     */     //   450: aload #18
/*     */     //   452: aload #9
/*     */     //   454: putfield L$4 : Ljava/lang/Object;
/*     */     //   457: aload #18
/*     */     //   459: aload #10
/*     */     //   461: putfield L$5 : Ljava/lang/Object;
/*     */     //   464: aload #18
/*     */     //   466: aload #11
/*     */     //   468: putfield L$6 : Ljava/lang/Object;
/*     */     //   471: aload #18
/*     */     //   473: iconst_2
/*     */     //   474: putfield label : I
/*     */     //   477: invokestatic getKeySafe : (Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   480: dup
/*     */     //   481: aload #19
/*     */     //   483: if_acmpne -> 567
/*     */     //   486: aload #19
/*     */     //   488: areturn
/*     */     //   489: iconst_0
/*     */     //   490: istore #8
/*     */     //   492: aload #18
/*     */     //   494: getfield L$6 : Ljava/lang/Object;
/*     */     //   497: checkcast java/lang/String
/*     */     //   500: astore #11
/*     */     //   502: aload #18
/*     */     //   504: getfield L$5 : Ljava/lang/Object;
/*     */     //   507: checkcast com/intellij/openapi/diagnostic/Logger
/*     */     //   510: astore #10
/*     */     //   512: aload #18
/*     */     //   514: getfield L$4 : Ljava/lang/Object;
/*     */     //   517: checkcast io/ktor/client/request/HttpRequestBuilder
/*     */     //   520: astore #9
/*     */     //   522: aload #18
/*     */     //   524: getfield L$3 : Ljava/lang/Object;
/*     */     //   527: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   530: astore #7
/*     */     //   532: aload #18
/*     */     //   534: getfield L$2 : Ljava/lang/Object;
/*     */     //   537: checkcast com/intellij/ml/llm/matterhorn/llm/LlmProvider
/*     */     //   540: astore #5
/*     */     //   542: aload #18
/*     */     //   544: getfield L$1 : Ljava/lang/Object;
/*     */     //   547: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken
/*     */     //   550: astore_1
/*     */     //   551: aload #18
/*     */     //   553: getfield L$0 : Ljava/lang/Object;
/*     */     //   556: checkcast com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest
/*     */     //   559: astore_0
/*     */     //   560: aload #17
/*     */     //   562: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   565: aload #17
/*     */     //   567: checkcast java/lang/String
/*     */     //   570: astore #12
/*     */     //   572: aload #11
/*     */     //   574: ifnull -> 675
/*     */     //   577: aload #12
/*     */     //   579: ifnull -> 675
/*     */     //   582: invokestatic getConfig : ()Lcom/intellij/ml/llm/matterhorn/configuration/Env;
/*     */     //   585: invokestatic assertHasDirectAccess : (Lcom/intellij/ml/llm/matterhorn/configuration/Env;)V
/*     */     //   588: aload #10
/*     */     //   590: aload #11
/*     */     //   592: aload #12
/*     */     //   594: iconst_0
/*     */     //   595: aload #12
/*     */     //   597: invokevirtual length : ()I
/*     */     //   600: iconst_5
/*     */     //   601: isub
/*     */     //   602: invokestatic max : (II)I
/*     */     //   605: invokevirtual substring : (I)Ljava/lang/String;
/*     */     //   608: dup
/*     */     //   609: ldc 'substring(...)'
/*     */     //   611: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   614: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   619: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   622: aload #9
/*     */     //   624: aload #11
/*     */     //   626: invokestatic url : (Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/String;)V
/*     */     //   629: aload #5
/*     */     //   631: astore #13
/*     */     //   633: getstatic com/intellij/ml/llm/matterhorn/core/llm/LlmProviderKt$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   636: aload #13
/*     */     //   638: invokevirtual ordinal : ()I
/*     */     //   641: iaload
/*     */     //   642: iconst_2
/*     */     //   643: if_icmpne -> 662
/*     */     //   646: aload #9
/*     */     //   648: invokevirtual getHeaders : ()Lio/ktor/http/HeadersBuilder;
/*     */     //   651: ldc_w 'x-api-key'
/*     */     //   654: aload #12
/*     */     //   656: invokevirtual append : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   659: goto -> 1173
/*     */     //   662: aload #9
/*     */     //   664: checkcast io/ktor/http/HttpMessageBuilder
/*     */     //   667: aload #12
/*     */     //   669: invokestatic bearerAuth : (Lio/ktor/http/HttpMessageBuilder;Ljava/lang/String;)V
/*     */     //   672: goto -> 1173
/*     */     //   675: invokestatic getConfig : ()Lcom/intellij/ml/llm/matterhorn/configuration/Env;
/*     */     //   678: invokestatic assertHasIngrazzio : (Lcom/intellij/ml/llm/matterhorn/configuration/Env;)V
/*     */     //   681: aload_1
/*     */     //   682: dup
/*     */     //   683: ifnonnull -> 908
/*     */     //   686: pop
/*     */     //   687: iconst_0
/*     */     //   688: istore #14
/*     */     //   690: ldc_w com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService
/*     */     //   693: astore #15
/*     */     //   695: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   698: aload #15
/*     */     //   700: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */     //   705: dup
/*     */     //   706: ifnonnull -> 776
/*     */     //   709: pop
/*     */     //   710: new java/lang/RuntimeException
/*     */     //   713: dup
/*     */     //   714: new java/lang/StringBuilder
/*     */     //   717: dup
/*     */     //   718: invokespecial <init> : ()V
/*     */     //   721: ldc_w 'Cannot find service '
/*     */     //   724: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   727: aload #15
/*     */     //   729: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   732: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   735: ldc_w ' (classloader='
/*     */     //   738: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   741: aload #15
/*     */     //   743: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
/*     */     //   746: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   749: ldc_w ', client='
/*     */     //   752: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   755: getstatic com/intellij/codeWithMe/ClientId.Companion : Lcom/intellij/codeWithMe/ClientId$Companion;
/*     */     //   758: invokevirtual getCurrentOrNull : ()Lcom/intellij/codeWithMe/ClientId;
/*     */     //   761: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   764: bipush #41
/*     */     //   766: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   769: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   772: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   775: athrow
/*     */     //   776: nop
/*     */     //   777: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/IngrazzioAuthService
/*     */     //   780: aload #18
/*     */     //   782: aload #18
/*     */     //   784: aload_0
/*     */     //   785: putfield L$0 : Ljava/lang/Object;
/*     */     //   788: aload #18
/*     */     //   790: aload #5
/*     */     //   792: putfield L$1 : Ljava/lang/Object;
/*     */     //   795: aload #18
/*     */     //   797: aload #7
/*     */     //   799: putfield L$2 : Ljava/lang/Object;
/*     */     //   802: aload #18
/*     */     //   804: aload #9
/*     */     //   806: putfield L$3 : Ljava/lang/Object;
/*     */     //   809: aload #18
/*     */     //   811: aload #10
/*     */     //   813: putfield L$4 : Ljava/lang/Object;
/*     */     //   816: aload #18
/*     */     //   818: aconst_null
/*     */     //   819: putfield L$5 : Ljava/lang/Object;
/*     */     //   822: aload #18
/*     */     //   824: aconst_null
/*     */     //   825: putfield L$6 : Ljava/lang/Object;
/*     */     //   828: aload #18
/*     */     //   830: iconst_3
/*     */     //   831: putfield label : I
/*     */     //   834: invokevirtual getAccessToken : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   837: dup
/*     */     //   838: aload #19
/*     */     //   840: if_acmpne -> 905
/*     */     //   843: aload #19
/*     */     //   845: areturn
/*     */     //   846: iconst_0
/*     */     //   847: istore #8
/*     */     //   849: aload #18
/*     */     //   851: getfield L$4 : Ljava/lang/Object;
/*     */     //   854: checkcast com/intellij/openapi/diagnostic/Logger
/*     */     //   857: astore #10
/*     */     //   859: aload #18
/*     */     //   861: getfield L$3 : Ljava/lang/Object;
/*     */     //   864: checkcast io/ktor/client/request/HttpRequestBuilder
/*     */     //   867: astore #9
/*     */     //   869: aload #18
/*     */     //   871: getfield L$2 : Ljava/lang/Object;
/*     */     //   874: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   877: astore #7
/*     */     //   879: aload #18
/*     */     //   881: getfield L$1 : Ljava/lang/Object;
/*     */     //   884: checkcast com/intellij/ml/llm/matterhorn/llm/LlmProvider
/*     */     //   887: astore #5
/*     */     //   889: aload #18
/*     */     //   891: getfield L$0 : Ljava/lang/Object;
/*     */     //   894: checkcast com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest
/*     */     //   897: astore_0
/*     */     //   898: aload #17
/*     */     //   900: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   903: aload #17
/*     */     //   905: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken
/*     */     //   908: dup
/*     */     //   909: ifnonnull -> 931
/*     */     //   912: pop
/*     */     //   913: ldc_w 'Required value was null.'
/*     */     //   916: astore #15
/*     */     //   918: new java/lang/IllegalArgumentException
/*     */     //   921: dup
/*     */     //   922: aload #15
/*     */     //   924: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   927: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   930: athrow
/*     */     //   931: astore #13
/*     */     //   933: aload #10
/*     */     //   935: ldc_w 'Sending request to ingrazzio...'
/*     */     //   938: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   941: aload #7
/*     */     //   943: getstatic com/intellij/ml/llm/matterhorn/settings/CoreProperties.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/CoreProperties;
/*     */     //   946: invokevirtual getINGRAZZIO_URL : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */     //   949: aload #18
/*     */     //   951: aload #18
/*     */     //   953: aload_0
/*     */     //   954: putfield L$0 : Ljava/lang/Object;
/*     */     //   957: aload #18
/*     */     //   959: aload #5
/*     */     //   961: putfield L$1 : Ljava/lang/Object;
/*     */     //   964: aload #18
/*     */     //   966: aload #9
/*     */     //   968: putfield L$2 : Ljava/lang/Object;
/*     */     //   971: aload #18
/*     */     //   973: aload #13
/*     */     //   975: putfield L$3 : Ljava/lang/Object;
/*     */     //   978: aload #18
/*     */     //   980: aconst_null
/*     */     //   981: putfield L$4 : Ljava/lang/Object;
/*     */     //   984: aload #18
/*     */     //   986: aconst_null
/*     */     //   987: putfield L$5 : Ljava/lang/Object;
/*     */     //   990: aload #18
/*     */     //   992: aconst_null
/*     */     //   993: putfield L$6 : Ljava/lang/Object;
/*     */     //   996: aload #18
/*     */     //   998: iconst_4
/*     */     //   999: putfield label : I
/*     */     //   1002: invokeinterface getProperty : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1007: dup
/*     */     //   1008: aload #19
/*     */     //   1010: if_acmpne -> 1065
/*     */     //   1013: aload #19
/*     */     //   1015: areturn
/*     */     //   1016: iconst_0
/*     */     //   1017: istore #8
/*     */     //   1019: aload #18
/*     */     //   1021: getfield L$3 : Ljava/lang/Object;
/*     */     //   1024: checkcast com/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken
/*     */     //   1027: astore #13
/*     */     //   1029: aload #18
/*     */     //   1031: getfield L$2 : Ljava/lang/Object;
/*     */     //   1034: checkcast io/ktor/client/request/HttpRequestBuilder
/*     */     //   1037: astore #9
/*     */     //   1039: aload #18
/*     */     //   1041: getfield L$1 : Ljava/lang/Object;
/*     */     //   1044: checkcast com/intellij/ml/llm/matterhorn/llm/LlmProvider
/*     */     //   1047: astore #5
/*     */     //   1049: aload #18
/*     */     //   1051: getfield L$0 : Ljava/lang/Object;
/*     */     //   1054: checkcast com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest
/*     */     //   1057: astore_0
/*     */     //   1058: aload #17
/*     */     //   1060: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1063: aload #17
/*     */     //   1065: dup
/*     */     //   1066: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   1069: checkcast java/lang/String
/*     */     //   1072: astore #14
/*     */     //   1074: aload #9
/*     */     //   1076: aload #14
/*     */     //   1078: invokestatic url : (Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/String;)V
/*     */     //   1081: aload #9
/*     */     //   1083: checkcast io/ktor/http/HttpMessageBuilder
/*     */     //   1086: ldc_w 'Authorization'
/*     */     //   1089: aload #13
/*     */     //   1091: invokevirtual getAuthorizationHeaderValue : ()Ljava/lang/String;
/*     */     //   1094: invokestatic header : (Lio/ktor/http/HttpMessageBuilder;Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   1097: aload #5
/*     */     //   1099: astore #16
/*     */     //   1101: getstatic com/intellij/ml/llm/matterhorn/core/llm/LlmProviderKt$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   1104: aload #16
/*     */     //   1106: invokevirtual ordinal : ()I
/*     */     //   1109: iaload
/*     */     //   1110: tableswitch default -> 1144, 1 -> 1138, 2 -> 1132
/*     */     //   1132: ldc_w 'anthropic'
/*     */     //   1135: goto -> 1158
/*     */     //   1138: ldc_w 'openai'
/*     */     //   1141: goto -> 1158
/*     */     //   1144: new java/lang/IllegalStateException
/*     */     //   1147: dup
/*     */     //   1148: ldc_w 'Nebius is not supported'
/*     */     //   1151: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   1154: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1157: athrow
/*     */     //   1158: astore #15
/*     */     //   1160: aload #9
/*     */     //   1162: invokevirtual getHeaders : ()Lio/ktor/http/HeadersBuilder;
/*     */     //   1165: ldc_w 'X-LLM-Model'
/*     */     //   1168: aload #15
/*     */     //   1170: invokevirtual append : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   1173: aload #9
/*     */     //   1175: astore #4
/*     */     //   1177: getstatic com/intellij/ml/llm/matterhorn/core/llm/MatterhornHttpClientService.Companion : Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornHttpClientService$Companion;
/*     */     //   1180: invokevirtual getInstance : ()Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornHttpClientService;
/*     */     //   1183: invokevirtual getClient : ()Lio/ktor/client/HttpClient;
/*     */     //   1186: astore #5
/*     */     //   1188: aload_0
/*     */     //   1189: getfield requestBody : Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequestBody;
/*     */     //   1192: invokevirtual getStream : ()Ljava/lang/Boolean;
/*     */     //   1195: iconst_1
/*     */     //   1196: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   1199: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1202: ifeq -> 1280
/*     */     //   1205: aload_0
/*     */     //   1206: aload #5
/*     */     //   1208: aload #4
/*     */     //   1210: aload #18
/*     */     //   1212: aload #18
/*     */     //   1214: aconst_null
/*     */     //   1215: putfield L$0 : Ljava/lang/Object;
/*     */     //   1218: aload #18
/*     */     //   1220: aconst_null
/*     */     //   1221: putfield L$1 : Ljava/lang/Object;
/*     */     //   1224: aload #18
/*     */     //   1226: aconst_null
/*     */     //   1227: putfield L$2 : Ljava/lang/Object;
/*     */     //   1230: aload #18
/*     */     //   1232: aconst_null
/*     */     //   1233: putfield L$3 : Ljava/lang/Object;
/*     */     //   1236: aload #18
/*     */     //   1238: aconst_null
/*     */     //   1239: putfield L$4 : Ljava/lang/Object;
/*     */     //   1242: aload #18
/*     */     //   1244: aconst_null
/*     */     //   1245: putfield L$5 : Ljava/lang/Object;
/*     */     //   1248: aload #18
/*     */     //   1250: aconst_null
/*     */     //   1251: putfield L$6 : Ljava/lang/Object;
/*     */     //   1254: aload #18
/*     */     //   1256: iconst_5
/*     */     //   1257: putfield label : I
/*     */     //   1260: invokespecial executeWithSteaming : (Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1263: dup
/*     */     //   1264: aload #19
/*     */     //   1266: if_acmpne -> 1279
/*     */     //   1269: aload #19
/*     */     //   1271: areturn
/*     */     //   1272: aload #17
/*     */     //   1274: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1277: aload #17
/*     */     //   1279: areturn
/*     */     //   1280: aload_0
/*     */     //   1281: aload #5
/*     */     //   1283: aload #4
/*     */     //   1285: aload #18
/*     */     //   1287: aload #18
/*     */     //   1289: aconst_null
/*     */     //   1290: putfield L$0 : Ljava/lang/Object;
/*     */     //   1293: aload #18
/*     */     //   1295: aconst_null
/*     */     //   1296: putfield L$1 : Ljava/lang/Object;
/*     */     //   1299: aload #18
/*     */     //   1301: aconst_null
/*     */     //   1302: putfield L$2 : Ljava/lang/Object;
/*     */     //   1305: aload #18
/*     */     //   1307: aconst_null
/*     */     //   1308: putfield L$3 : Ljava/lang/Object;
/*     */     //   1311: aload #18
/*     */     //   1313: aconst_null
/*     */     //   1314: putfield L$4 : Ljava/lang/Object;
/*     */     //   1317: aload #18
/*     */     //   1319: aconst_null
/*     */     //   1320: putfield L$5 : Ljava/lang/Object;
/*     */     //   1323: aload #18
/*     */     //   1325: aconst_null
/*     */     //   1326: putfield L$6 : Ljava/lang/Object;
/*     */     //   1329: aload #18
/*     */     //   1331: bipush #6
/*     */     //   1333: putfield label : I
/*     */     //   1336: invokespecial executeWithoutSteaming : (Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1339: dup
/*     */     //   1340: aload #19
/*     */     //   1342: if_acmpne -> 1355
/*     */     //   1345: aload #19
/*     */     //   1347: areturn
/*     */     //   1348: aload #17
/*     */     //   1350: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1353: aload #17
/*     */     //   1355: areturn
/*     */     //   1356: new java/lang/IllegalStateException
/*     */     //   1359: dup
/*     */     //   1360: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   1363: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1366: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #40	-> 60
/*     */     //   #41	-> 113
/*     */     //   #41	-> 123
/*     */     //   #42	-> 124
/*     */     //   #43	-> 142
/*     */     //   #44	-> 149
/*     */     //   #46	-> 167
/*     */     //   #46	-> 199
/*     */     //   #47	-> 202
/*     */     //   #50	-> 220
/*     */     //   #221	-> 247
/*     */     //   #222	-> 250
/*     */     //   #221	-> 261
/*     */     //   #223	-> 263
/*     */     //   #232	-> 281
/*     */     //   #40	-> 342
/*     */     //   #233	-> 418
/*     */     //   #40	-> 486
/*     */     //   #235	-> 572
/*     */     //   #236	-> 582
/*     */     //   #237	-> 588
/*     */     //   #237	-> 592
/*     */     //   #237	-> 619
/*     */     //   #238	-> 622
/*     */     //   #240	-> 629
/*     */     //   #241	-> 642
/*     */     //   #242	-> 662
/*     */     //   #245	-> 675
/*     */     //   #246	-> 681
/*     */     //   #247	-> 690
/*     */     //   #248	-> 695
/*     */     //   #249	-> 710
/*     */     //   #248	-> 776
/*     */     //   #246	-> 782
/*     */     //   #40	-> 843
/*     */     //   #246	-> 905
/*     */     //   #246	-> 931
/*     */     //   #250	-> 933
/*     */     //   #252	-> 941
/*     */     //   #40	-> 1013
/*     */     //   #252	-> 1065
/*     */     //   #253	-> 1074
/*     */     //   #254	-> 1081
/*     */     //   #256	-> 1097
/*     */     //   #257	-> 1132
/*     */     //   #258	-> 1138
/*     */     //   #259	-> 1148
/*     */     //   #256	-> 1158
/*     */     //   #261	-> 1160
/*     */     //   #264	-> 1173
/*     */     //   #50	-> 1175
/*     */     //   #51	-> 1177
/*     */     //   #52	-> 1188
/*     */     //   #53	-> 1205
/*     */     //   #40	-> 1269
/*     */     //   #56	-> 1279
/*     */     //   #55	-> 1280
/*     */     //   #40	-> 1345
/*     */     //   #56	-> 1355
/*     */     //   #40	-> 1356
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   113	10	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest;
/*     */     //   123	76	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest;
/*     */     //   199	146	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest;
/*     */     //   406	83	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest;
/*     */     //   560	286	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest;
/*     */     //   898	118	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest;
/*     */     //   1058	86	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest;
/*     */     //   1158	17	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest;
/*     */     //   1175	88	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest;
/*     */     //   1280	59	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest;
/*     */     //   113	10	1	accessToken	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;
/*     */     //   123	76	1	accessToken	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;
/*     */     //   199	146	1	accessToken	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;
/*     */     //   397	92	1	accessToken	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;
/*     */     //   551	31	1	accessToken	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;
/*     */     //   675	11	1	accessToken	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;
/*     */     //   124	75	3	headers	Ljava/util/List;
/*     */     //   199	82	3	headers	Ljava/util/List;
/*     */     //   1177	86	4	httpRequest	Lio/ktor/client/request/HttpRequestBuilder;
/*     */     //   1280	59	4	httpRequest	Lio/ktor/client/request/HttpRequestBuilder;
/*     */     //   244	101	5	$this$createRequest$iv	Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
/*     */     //   388	101	5	$this$createRequest$iv	Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
/*     */     //   542	91	5	$this$createRequest$iv	Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
/*     */     //   675	171	5	$this$createRequest$iv	Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
/*     */     //   889	127	5	$this$createRequest$iv	Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
/*     */     //   1049	52	5	$this$createRequest$iv	Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
/*     */     //   1188	75	5	client	Lio/ktor/client/HttpClient;
/*     */     //   1280	59	5	client	Lio/ktor/client/HttpClient;
/*     */     //   244	37	6	body$iv	Ljava/lang/Object;
/*     */     //   244	101	7	propertyProvider$iv	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   378	111	7	propertyProvider$iv	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   532	50	7	propertyProvider$iv	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   675	171	7	propertyProvider$iv	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   879	52	7	propertyProvider$iv	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   931	76	7	propertyProvider$iv	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */     //   281	64	9	builder$iv	Lio/ktor/client/request/HttpRequestBuilder;
/*     */     //   368	121	9	builder$iv	Lio/ktor/client/request/HttpRequestBuilder;
/*     */     //   522	324	9	builder$iv	Lio/ktor/client/request/HttpRequestBuilder;
/*     */     //   869	147	9	builder$iv	Lio/ktor/client/request/HttpRequestBuilder;
/*     */     //   1039	105	9	builder$iv	Lio/ktor/client/request/HttpRequestBuilder;
/*     */     //   1158	17	9	builder$iv	Lio/ktor/client/request/HttpRequestBuilder;
/*     */     //   263	82	10	logger$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   358	131	10	logger$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   512	80	10	logger$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   675	171	10	logger$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   859	72	10	logger$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   931	10	10	logger$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   418	71	11	url$iv	Ljava/lang/String;
/*     */     //   502	127	11	url$iv	Ljava/lang/String;
/*     */     //   572	90	12	key$iv	Ljava/lang/String;
/*     */     //   662	10	12	key$iv	Ljava/lang/String;
/*     */     //   933	83	13	token$iv	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;
/*     */     //   1029	68	13	token$iv	Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;
/*     */     //   1074	7	14	ingrazzioUrl$iv	Ljava/lang/String;
/*     */     //   695	82	15	serviceClass$iv$iv	Ljava/lang/Class;
/*     */     //   1160	13	15	modelName$iv	Ljava/lang/String;
/*     */     //   250	11	9	$i$f$logger	I
/*     */     //   690	87	14	$i$f$service	I
/*     */     //   247	98	8	$i$f$createRequest	I
/*     */     //   0	1367	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	1306	18	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	1299	17	$result	Ljava/lang/Object;
/*     */     //   348	141	8	$i$f$createRequest	I
/*     */     //   492	354	8	$i$f$createRequest	I
/*     */     //   849	167	8	$i$f$createRequest	I
/* 346 */     //   1019	156	8	$i$f$createRequest	I } @NotNull private static final Logger logger = Logger.getInstance(AnthropicChatRequest.class);
/*     */   
/*     */   private final Object executeWithoutSteaming(HttpClient client, HttpRequestBuilder request, Continuation $completion) {
/*     */     HttpClient $this$prepareRequest$iv = client;
/*     */     int $i$f$prepareRequest = 0;
/*     */     return (new HttpStatement(request, $this$prepareRequest$iv)).execute(new AnthropicChatRequest$executeWithoutSteaming$2(null), $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AnthropicChatRequest.kt", l = {61, 62, 65}, i = {1}, s = {"L$0"}, n = {"response"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.anthropic.AnthropicChatRequest$executeWithoutSteaming$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicResponse;", "response", "Lio/ktor/client/statement/HttpResponse;"})
/*     */   @SourceDebugExtension({"SMAP\nAnthropicChatRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnthropicChatRequest.kt\ncom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$executeWithoutSteaming$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 JvmStreams.kt\nkotlinx/serialization/json/JvmStreamsKt\n*L\n1#1,220:1\n1#2:221\n80#3:222\n*S KotlinDebug\n*F\n+ 1 AnthropicChatRequest.kt\ncom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$executeWithoutSteaming$2\n*L\n67#1:222\n*E\n"})
/*     */   static final class AnthropicChatRequest$executeWithoutSteaming$2 extends SuspendLambda implements Function2<HttpResponse, Continuation<? super AnthropicResponse>, Object> {
/*     */     int label;
/*     */     
/*     */     AnthropicChatRequest$executeWithoutSteaming$2(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       HttpResponse response;
/*     */       InputStream inputStream;
/*     */       Json $this$decodeFromStream$iv;
/*     */       int $i$f$decodeFromStream;
/*     */       HttpStatusCode httpStatusCode;
/*     */       String str;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           response = (HttpResponse)this.L$0;
/*     */           switch (response.getStatus().getValue()) {
/*     */             case 429:
/*     */             case 529:
/*     */               this.L$0 = httpStatusCode = response.getStatus();
/*     */               this.label = 1;
/*     */               if (MatterhornAIProxy.Companion.getBody(response, (Continuation)this) == object)
/*     */                 return object; 
/*     */               str = "Server returned response code: " + httpStatusCode + ". Response content: " + MatterhornAIProxy.Companion.getBody(response, (Continuation)this);
/*     */               throw new LLMRateLimitError(str);
/*     */           } 
/*     */           this.L$0 = response;
/*     */           this.label = 2;
/*     */           if (MatterhornAIProxy.Companion.toLlmException$core_llm(response, (Continuation)this) == object)
/*     */             return object; 
/*     */           if ((RuntimeException)MatterhornAIProxy.Companion.toLlmException$core_llm(response, (Continuation)this) != null) {
/*     */             RuntimeException it = (RuntimeException)MatterhornAIProxy.Companion.toLlmException$core_llm(response, (Continuation)this);
/*     */             int $i$a$-let-AnthropicChatRequest$executeWithoutSteaming$2$1 = 0;
/*     */             throw it;
/*     */           } 
/*     */           (RuntimeException)MatterhornAIProxy.Companion.toLlmException$core_llm(response, (Continuation)this);
/*     */           this.L$0 = null;
/*     */           this.label = 3;
/*     */           if (HttpResponseKt.bodyAsChannel(response, (Continuation)this) == object)
/*     */             return object; 
/*     */           inputStream = BlockingKt.toInputStream$default((ByteReadChannel)HttpResponseKt.bodyAsChannel(response, (Continuation)this), null, 1, null);
/*     */           $this$decodeFromStream$iv = AnthropicChatRequest.json;
/*     */           $i$f$decodeFromStream = 0;
/*     */           $this$decodeFromStream$iv.getSerializersModule();
/*     */           return JvmStreamsKt.decodeFromStream($this$decodeFromStream$iv, (DeserializationStrategy)AnthropicResponse.Companion.serializer(), inputStream);
/*     */         case 1:
/*     */           httpStatusCode = (HttpStatusCode)this.L$0;
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           str = "Server returned response code: " + httpStatusCode + ". Response content: " + SYNTHETIC_LOCAL_VARIABLE_1;
/*     */           throw new LLMRateLimitError(str);
/*     */         case 2:
/*     */           response = (HttpResponse)this.L$0;
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           if ((RuntimeException)SYNTHETIC_LOCAL_VARIABLE_1 != null) {
/*     */             RuntimeException runtimeException = (RuntimeException)SYNTHETIC_LOCAL_VARIABLE_1;
/*     */             boolean bool = false;
/*     */             throw runtimeException;
/*     */           } 
/*     */           (RuntimeException)SYNTHETIC_LOCAL_VARIABLE_1;
/*     */           this.L$0 = null;
/*     */           this.label = 3;
/*     */           if (HttpResponseKt.bodyAsChannel(response, (Continuation)this) == object)
/*     */             return object; 
/*     */           inputStream = BlockingKt.toInputStream$default((ByteReadChannel)HttpResponseKt.bodyAsChannel(response, (Continuation)this), null, 1, null);
/*     */           $this$decodeFromStream$iv = AnthropicChatRequest.json;
/*     */           $i$f$decodeFromStream = 0;
/*     */           $this$decodeFromStream$iv.getSerializersModule();
/*     */           return JvmStreamsKt.decodeFromStream($this$decodeFromStream$iv, (DeserializationStrategy)AnthropicResponse.Companion.serializer(), inputStream);
/*     */         case 3:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           inputStream = BlockingKt.toInputStream$default((ByteReadChannel)SYNTHETIC_LOCAL_VARIABLE_1, null, 1, null);
/*     */           $this$decodeFromStream$iv = AnthropicChatRequest.json;
/*     */           $i$f$decodeFromStream = 0;
/*     */           $this$decodeFromStream$iv.getSerializersModule();
/*     */           return JvmStreamsKt.decodeFromStream($this$decodeFromStream$iv, (DeserializationStrategy)AnthropicResponse.Companion.serializer(), inputStream);
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super AnthropicChatRequest$executeWithoutSteaming$2> $completion) {
/*     */       AnthropicChatRequest$executeWithoutSteaming$2 anthropicChatRequest$executeWithoutSteaming$2 = new AnthropicChatRequest$executeWithoutSteaming$2($completion);
/*     */       anthropicChatRequest$executeWithoutSteaming$2.L$0 = value;
/*     */       return (Continuation<Unit>)anthropicChatRequest$executeWithoutSteaming$2;
/*     */     }
/*     */     
/*     */     public final Object invoke(HttpResponse p1, Continuation<?> p2) {
/*     */       return ((AnthropicChatRequest$executeWithoutSteaming$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private final AnthropicResponse decodeStreamedResponse(Json $this$decodeStreamedResponse, JsonObject message, AnthropicStreamingEvent.MessageDelta lastMessageDelta, List contents) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: astore #5
/*     */     //   3: aload_2
/*     */     //   4: aload #4
/*     */     //   6: aload_3
/*     */     //   7: aload_1
/*     */     //   8: aload_2
/*     */     //   9: <illegal opcode> invoke : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta;Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonObject;)Lkotlin/jvm/functions/Function1;
/*     */     //   14: invokestatic access$withPatch : (Lkotlinx/serialization/json/JsonObject;Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/json/JsonObject;
/*     */     //   17: checkcast kotlinx/serialization/json/JsonElement
/*     */     //   20: astore #6
/*     */     //   22: iconst_0
/*     */     //   23: istore #7
/*     */     //   25: aload #5
/*     */     //   27: aload #5
/*     */     //   29: invokevirtual getSerializersModule : ()Lkotlinx/serialization/modules/SerializersModule;
/*     */     //   32: pop
/*     */     //   33: getstatic com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicResponse.Companion : Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicResponse$Companion;
/*     */     //   36: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   39: checkcast kotlinx/serialization/DeserializationStrategy
/*     */     //   42: aload #6
/*     */     //   44: invokevirtual decodeFromJsonElement : (Lkotlinx/serialization/DeserializationStrategy;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;
/*     */     //   47: checkcast com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicResponse
/*     */     //   50: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #72	-> 0
/*     */     //   #266	-> 25
/*     */     //   #72	-> 50
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   25	22	7	$i$f$decodeFromJsonElement	I
/*     */     //   22	25	5	$this$decodeFromJsonElement$iv	Lkotlinx/serialization/json/Json;
/*     */     //   22	25	6	json$iv	Lkotlinx/serialization/json/JsonElement;
/*     */     //   0	51	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest;
/*     */     //   0	51	1	$this$decodeStreamedResponse	Lkotlinx/serialization/json/Json;
/*     */     //   0	51	2	message	Lkotlinx/serialization/json/JsonObject;
/*     */     //   0	51	3	lastMessageDelta	Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta;
/*     */     //   0	51	4	contents	Ljava/util/List;
/*     */   }
/*     */   
/*     */   private static final Unit decodeStreamedResponse$lambda$2(List $contents, AnthropicStreamingEvent.MessageDelta $lastMessageDelta, Json $this_decodeStreamedResponse, JsonObject $message, Map<String, JsonArray> $this$withPatch) {
/*     */     Intrinsics.checkNotNullParameter($this$withPatch, "$this$withPatch");
/*     */     List list1 = $contents;
/*     */     String str = "content";
/*     */     Map<String, JsonArray> map = $this$withPatch;
/*     */     int $i$f$map = 0;
/*     */     List list2 = list1;
/*     */     Collection<JsonObject> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10));
/*     */     int $i$f$mapTo = 0;
/*     */     for (Object item$iv$iv : list2) {
/*     */       StreamingContentBuilder streamingContentBuilder = (StreamingContentBuilder)item$iv$iv;
/*     */       Collection<JsonObject> collection = destination$iv$iv;
/*     */       int $i$a$-map-AnthropicChatRequest$decodeStreamedResponse$1$1 = 0;
/*     */       collection.add(streamingContentBuilder.build($this_decodeStreamedResponse));
/*     */     } 
/*     */     List list3 = (List)destination$iv$iv;
/*     */     List list4 = list3;
/*     */     map.put(str, new JsonArray(list4));
/*     */     if ($lastMessageDelta != null) {
/*     */       Json json = $this_decodeStreamedResponse;
/*     */       Object value$iv = $lastMessageDelta.getDelta().getStopReason();
/*     */       int $i$f$encodeToJsonElement = 0;
/*     */       json.getSerializersModule();
/*     */       $this$withPatch.put("stop_reason", json.encodeToJsonElement((SerializationStrategy)AnthropicStopReason.Companion.serializer(), value$iv));
/*     */       $this$withPatch.put("stop_sequence", JsonElementKt.JsonPrimitive($lastMessageDelta.getDelta().getStopSequence()));
/*     */       JsonElement usage = (JsonElement)$message.get("usage");
/*     */       int $i$a$-let-AnthropicChatRequest$decodeStreamedResponse$1$2 = 0;
/*     */       $this$withPatch.put("usage", JsonUtilsKt.with(JsonElementKt.getJsonObject(usage), "output_tokens", (JsonElement)JsonElementKt.JsonPrimitive(Long.valueOf($lastMessageDelta.getUsage().getOutputTokens()))));
/*     */       (JsonElement)$message.get("usage");
/*     */     } 
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private final Object executeWithSteaming(HttpClient client, HttpRequestBuilder request, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$executeWithSteaming$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$executeWithSteaming$1
/*     */     //   11: astore #8
/*     */     //   13: aload #8
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #8
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$executeWithSteaming$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #8
/*     */     //   50: aload #8
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #7
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #9
/*     */     //   62: aload #8
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 310, 0 -> 88, 1 -> 212
/*     */     //   88: aload #7
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: new kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   96: dup
/*     */     //   97: invokespecial <init> : ()V
/*     */     //   100: astore #4
/*     */     //   102: new kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   105: dup
/*     */     //   106: invokespecial <init> : ()V
/*     */     //   109: astore #5
/*     */     //   111: new kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   114: dup
/*     */     //   115: invokespecial <init> : ()V
/*     */     //   118: astore #6
/*     */     //   120: aload #6
/*     */     //   122: new java/util/ArrayList
/*     */     //   125: dup
/*     */     //   126: invokespecial <init> : ()V
/*     */     //   129: checkcast java/util/List
/*     */     //   132: putfield element : Ljava/lang/Object;
/*     */     //   135: aload_1
/*     */     //   136: aload_2
/*     */     //   137: <illegal opcode> invoke : (Lio/ktor/client/request/HttpRequestBuilder;)Lkotlin/jvm/functions/Function1;
/*     */     //   142: aconst_null
/*     */     //   143: aconst_null
/*     */     //   144: aconst_null
/*     */     //   145: new com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$executeWithSteaming$3
/*     */     //   148: dup
/*     */     //   149: aload #4
/*     */     //   151: aload #5
/*     */     //   153: aload #6
/*     */     //   155: aconst_null
/*     */     //   156: invokespecial <init> : (Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/coroutines/Continuation;)V
/*     */     //   159: checkcast kotlin/jvm/functions/Function2
/*     */     //   162: aload #8
/*     */     //   164: bipush #14
/*     */     //   166: aconst_null
/*     */     //   167: aload #8
/*     */     //   169: aload_0
/*     */     //   170: putfield L$0 : Ljava/lang/Object;
/*     */     //   173: aload #8
/*     */     //   175: aload #4
/*     */     //   177: putfield L$1 : Ljava/lang/Object;
/*     */     //   180: aload #8
/*     */     //   182: aload #5
/*     */     //   184: putfield L$2 : Ljava/lang/Object;
/*     */     //   187: aload #8
/*     */     //   189: aload #6
/*     */     //   191: putfield L$3 : Ljava/lang/Object;
/*     */     //   194: aload #8
/*     */     //   196: iconst_1
/*     */     //   197: putfield label : I
/*     */     //   200: invokestatic sse-mY9Nd3A$default : (Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function1;Lkotlin/time/Duration;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   203: dup
/*     */     //   204: aload #9
/*     */     //   206: if_acmpne -> 258
/*     */     //   209: aload #9
/*     */     //   211: areturn
/*     */     //   212: aload #8
/*     */     //   214: getfield L$3 : Ljava/lang/Object;
/*     */     //   217: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   220: astore #6
/*     */     //   222: aload #8
/*     */     //   224: getfield L$2 : Ljava/lang/Object;
/*     */     //   227: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   230: astore #5
/*     */     //   232: aload #8
/*     */     //   234: getfield L$1 : Ljava/lang/Object;
/*     */     //   237: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   240: astore #4
/*     */     //   242: aload #8
/*     */     //   244: getfield L$0 : Ljava/lang/Object;
/*     */     //   247: checkcast com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest
/*     */     //   250: astore_0
/*     */     //   251: aload #7
/*     */     //   253: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   256: aload #7
/*     */     //   258: pop
/*     */     //   259: aload #4
/*     */     //   261: getfield element : Ljava/lang/Object;
/*     */     //   264: ifnonnull -> 278
/*     */     //   267: new com/intellij/ml/llm/matterhorn/LLMBadResponseException
/*     */     //   270: dup
/*     */     //   271: ldc_w 'Message is not received'
/*     */     //   274: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   277: athrow
/*     */     //   278: aload_0
/*     */     //   279: getstatic com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest.json : Lkotlinx/serialization/json/Json;
/*     */     //   282: aload #4
/*     */     //   284: getfield element : Ljava/lang/Object;
/*     */     //   287: checkcast kotlinx/serialization/json/JsonObject
/*     */     //   290: aload #5
/*     */     //   292: getfield element : Ljava/lang/Object;
/*     */     //   295: checkcast com/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta
/*     */     //   298: aload #6
/*     */     //   300: getfield element : Ljava/lang/Object;
/*     */     //   303: checkcast java/util/List
/*     */     //   306: invokespecial decodeStreamedResponse : (Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonObject;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicStreamingEvent$MessageDelta;Ljava/util/List;)Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicResponse;
/*     */     //   309: areturn
/*     */     //   310: new java/lang/IllegalStateException
/*     */     //   313: dup
/*     */     //   314: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   317: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   320: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #84	-> 60
/*     */     //   #85	-> 93
/*     */     //   #86	-> 102
/*     */     //   #87	-> 111
/*     */     //   #87	-> 132
/*     */     //   #88	-> 135
/*     */     //   #84	-> 209
/*     */     //   #118	-> 258
/*     */     //   #119	-> 267
/*     */     //   #121	-> 278
/*     */     //   #84	-> 310
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	119	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest;
/*     */     //   251	59	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest;
/*     */     //   93	39	1	client	Lio/ktor/client/HttpClient;
/*     */     //   132	71	1	client	Lio/ktor/client/HttpClient;
/*     */     //   93	39	2	request	Lio/ktor/client/request/HttpRequestBuilder;
/*     */     //   132	71	2	request	Lio/ktor/client/request/HttpRequestBuilder;
/*     */     //   102	110	4	message	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   242	68	4	message	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   111	101	5	lastMessageDelta	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   232	78	5	lastMessageDelta	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   120	92	6	contents	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   222	88	6	contents	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   0	321	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	260	8	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	253	7	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private static final Unit executeWithSteaming$lambda$3(HttpRequestBuilder $request, HttpRequestBuilder $this$sse) {
/*     */     Intrinsics.checkNotNullParameter($this$sse, "$this$sse");
/*     */     $this$sse.takeFrom($request);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AnthropicChatRequest.kt", l = {89}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.anthropic.AnthropicChatRequest$executeWithSteaming$3")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/sse/ClientSSESession;"})
/*     */   static final class AnthropicChatRequest$executeWithSteaming$3 extends SuspendLambda implements Function2<ClientSSESession, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     AnthropicChatRequest$executeWithSteaming$3(Ref.ObjectRef<JsonObject> $message, Ref.ObjectRef<AnthropicStreamingEvent.MessageDelta> $lastMessageDelta, Ref.ObjectRef<List<AnthropicChatRequest.StreamingContentBuilder>> $contents, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       ClientSSESession $this$sse;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           $this$sse = (ClientSSESession)this.L$0;
/*     */           this.label = 1;
/*     */           if ($this$sse.getIncoming().collect(new FlowCollector(this.$message, this.$lastMessageDelta, this.$contents) {
/*     */                 public final Object emit(ServerSentEvent event, Continuation $completion) {
/*     */                   if (event.getData() != null) {
/*     */                     String it = event.getData();
/*     */                     int $i$a$-let-AnthropicChatRequest$executeWithSteaming$3$1$anthropicEvent$1 = 0;
/*     */                     Json this_$iv = AnthropicChatRequest.json;
/*     */                     int $i$f$decodeFromString = 0;
/*     */                     this_$iv.getSerializersModule();
/*     */                     if ((AnthropicStreamingEvent)this_$iv.decodeFromString((DeserializationStrategy)AnthropicStreamingEvent.Companion.serializer(), it) != null) {
/*     */                       AnthropicStreamingEvent anthropicEvent, anthropicStreamingEvent1 = anthropicEvent;
/*     */                       if (anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.Error) {
/*     */                         if (((AnthropicStreamingEvent.Error)anthropicEvent).toHttpStatusCode() == null)
/*     */                           ((AnthropicStreamingEvent.Error)anthropicEvent).toHttpStatusCode(); 
/*     */                         throw ((AnthropicStreamingEvent.Error)anthropicEvent).toHttpStatusCode().convertToLlmException$core_llm(HttpStatusCode.Companion.getInternalServerError(), ((AnthropicStreamingEvent.Error)anthropicEvent).getMessage());
/*     */                       } 
/*     */                       if (!(anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.Ping))
/*     */                         if (anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.MessageStart) {
/*     */                           this.$message.element = ((AnthropicStreamingEvent.MessageStart)anthropicEvent).getMessage();
/*     */                         } else if (anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.MessageDelta) {
/*     */                           this.$lastMessageDelta.element = anthropicEvent;
/*     */                         } else if (!(anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.MessageStop)) {
/*     */                           if (anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.ContentBlockStart) {
/*     */                             boolean bool = (((AnthropicStreamingEvent.ContentBlockStart)anthropicEvent).getIndex() == ((List)this.$contents.element).size()) ? true : false;
/*     */                             if (_Assertions.ENABLED && !bool) {
/*     */                               String str = "Assertion failed";
/*     */                               throw new AssertionError(str);
/*     */                             } 
/*     */                             Boxing.boxBoolean(((List<AnthropicChatRequest.StreamingContentBuilder>)this.$contents.element).add(new AnthropicChatRequest.StreamingContentBuilder(((AnthropicStreamingEvent.ContentBlockStart)anthropicEvent).getContentBlock())));
/*     */                           } else if (anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.ContentBlockDelta) {
/*     */                             ((AnthropicChatRequest.StreamingContentBuilder)((List<AnthropicChatRequest.StreamingContentBuilder>)this.$contents.element).get(((AnthropicStreamingEvent.ContentBlockDelta)anthropicEvent).getIndex())).addDelta(((AnthropicStreamingEvent.ContentBlockDelta)anthropicEvent).getDelta());
/*     */                           } else if (!(anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.ContentBlockStop)) {
/*     */                             throw new NoWhenBranchMatchedException();
/*     */                           } 
/*     */                         }  
/*     */                       return Unit.INSTANCE;
/*     */                     } 
/*     */                   } 
/*     */                   event.getData();
/*     */                   throw new LLMBadResponseException("No event data received");
/*     */                 }
/*     */               }(Continuation)this) == object)
/*     */             return object; 
/*     */           $this$sse.getIncoming().collect(new FlowCollector(this.$message, this.$lastMessageDelta, this.$contents) {
/*     */                 public final Object emit(ServerSentEvent event, Continuation $completion) {
/*     */                   if (event.getData() != null) {
/*     */                     String it = event.getData();
/*     */                     int $i$a$-let-AnthropicChatRequest$executeWithSteaming$3$1$anthropicEvent$1 = 0;
/*     */                     Json this_$iv = AnthropicChatRequest.json;
/*     */                     int $i$f$decodeFromString = 0;
/*     */                     this_$iv.getSerializersModule();
/*     */                     if ((AnthropicStreamingEvent)this_$iv.decodeFromString((DeserializationStrategy)AnthropicStreamingEvent.Companion.serializer(), it) != null) {
/*     */                       AnthropicStreamingEvent anthropicEvent, anthropicStreamingEvent1 = anthropicEvent;
/*     */                       if (anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.Error) {
/*     */                         if (((AnthropicStreamingEvent.Error)anthropicEvent).toHttpStatusCode() == null)
/*     */                           ((AnthropicStreamingEvent.Error)anthropicEvent).toHttpStatusCode(); 
/*     */                         throw ((AnthropicStreamingEvent.Error)anthropicEvent).toHttpStatusCode().convertToLlmException$core_llm(HttpStatusCode.Companion.getInternalServerError(), ((AnthropicStreamingEvent.Error)anthropicEvent).getMessage());
/*     */                       } 
/*     */                       if (!(anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.Ping))
/*     */                         if (anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.MessageStart) {
/*     */                           this.$message.element = ((AnthropicStreamingEvent.MessageStart)anthropicEvent).getMessage();
/*     */                         } else if (anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.MessageDelta) {
/*     */                           this.$lastMessageDelta.element = anthropicEvent;
/*     */                         } else if (!(anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.MessageStop)) {
/*     */                           if (anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.ContentBlockStart) {
/*     */                             boolean bool = (((AnthropicStreamingEvent.ContentBlockStart)anthropicEvent).getIndex() == ((List)this.$contents.element).size()) ? true : false;
/*     */                             if (_Assertions.ENABLED && !bool) {
/*     */                               String str = "Assertion failed";
/*     */                               throw new AssertionError(str);
/*     */                             } 
/*     */                             Boxing.boxBoolean(((List<AnthropicChatRequest.StreamingContentBuilder>)this.$contents.element).add(new AnthropicChatRequest.StreamingContentBuilder(((AnthropicStreamingEvent.ContentBlockStart)anthropicEvent).getContentBlock())));
/*     */                           } else if (anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.ContentBlockDelta) {
/*     */                             ((AnthropicChatRequest.StreamingContentBuilder)((List<AnthropicChatRequest.StreamingContentBuilder>)this.$contents.element).get(((AnthropicStreamingEvent.ContentBlockDelta)anthropicEvent).getIndex())).addDelta(((AnthropicStreamingEvent.ContentBlockDelta)anthropicEvent).getDelta());
/*     */                           } else if (!(anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.ContentBlockStop)) {
/*     */                             throw new NoWhenBranchMatchedException();
/*     */                           } 
/*     */                         }  
/*     */                       return Unit.INSTANCE;
/*     */                     } 
/*     */                   } 
/*     */                   event.getData();
/*     */                   throw new LLMBadResponseException("No event data received");
/*     */                 }
/*     */               }(Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super AnthropicChatRequest$executeWithSteaming$3> $completion) {
/*     */       AnthropicChatRequest$executeWithSteaming$3 anthropicChatRequest$executeWithSteaming$3 = new AnthropicChatRequest$executeWithSteaming$3(this.$message, this.$lastMessageDelta, this.$contents, $completion);
/*     */       anthropicChatRequest$executeWithSteaming$3.L$0 = value;
/*     */       return (Continuation<Unit>)anthropicChatRequest$executeWithSteaming$3;
/*     */     }
/*     */     
/*     */     public final Object invoke(ClientSSESession p1, Continuation<?> p2) {
/*     */       return ((AnthropicChatRequest$executeWithSteaming$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private final AIAnswer toAIAnswer(AnthropicResponse $this$toAIAnswer, Map<String, ? extends StopSequenceType> stopReasons) {
/*     */     $this$toAIAnswer.getUsage();
/*     */     $this$toAIAnswer.getUsage();
/*     */     $this$toAIAnswer.getUsage().getCacheReadInputTokens();
/*     */     $this$toAIAnswer.getUsage().getCacheCreationInputTokens();
/*     */     return new AIAnswer(this.modelParameters.getModel(), toChoices($this$toAIAnswer, stopReasons), ($this$toAIAnswer.getUsage() != null) ? $this$toAIAnswer.getUsage().getPromptTokens() : 0L, ($this$toAIAnswer.getUsage() != null) ? $this$toAIAnswer.getUsage().getCompletionTokens() : 0L, (this.cacheEnabled == true) ? (($this$toAIAnswer.getUsage() != null && $this$toAIAnswer.getUsage().getCacheReadInputTokens() != null) ? $this$toAIAnswer.getUsage().getCacheReadInputTokens().longValue() : 0L) : 0L, (this.cacheEnabled == true) ? (($this$toAIAnswer.getUsage() != null && $this$toAIAnswer.getUsage().getCacheCreationInputTokens() != null) ? $this$toAIAnswer.getUsage().getCacheCreationInputTokens().longValue() : 0L) : 0L, 0L, false, 192, null);
/*     */   }
/*     */   
/*     */   private final List<AIAnswerChoice> toChoices(AnthropicResponse $this$toChoices, Map stopReasons) {
/*     */     Iterable<AnthropicContent> iterable1;
/*     */     boolean bool3;
/*     */     Iterable<AnthropicContent> $this$filterIsInstance$iv;
/*     */     boolean bool2;
/*     */     AnthropicTextContent thought;
/*     */     boolean bool1;
/*     */     StopSequenceType stopType;
/*     */     int $i$f$filterIsInstance;
/*     */     Iterable<AnthropicContent> iterable3, iterable2;
/*     */     boolean bool4;
/*     */     Collection collection1;
/*     */     Iterable<AnthropicContent> iterable4, $this$filterIsInstanceTo$iv$iv;
/*     */     int j, i;
/*     */     List<AIContentAnswerChoice> list2;
/*     */     int $i$f$map;
/*     */     Collection<Object> collection2, destination$iv$iv;
/*     */     Iterable<AnthropicContent> iterable7, iterable6, iterable5;
/*     */     int $i$a$-let-AnthropicChatRequest$toChoices$2;
/*     */     Iterable $this$mapTo$iv$iv;
/*     */     int $i$f$filterIsInstanceTo;
/*     */     Collection<Object> collection6, collection5;
/*     */     Collection<AIContentAnswerChoice> collection4;
/*     */     Collection collection3;
/*     */     int m, k;
/*     */     Collection<AIContentAnswerChoice> collection7;
/*     */     int $i$f$mapTo, $i$a$-also-AnthropicChatRequest$toChoices$2$1;
/*     */     boolean bool6;
/*     */     Object object1;
/*     */     byte b;
/*     */     Object object2, object3;
/*     */     String str1, str2;
/*     */     switch (WhenMappings.$EnumSwitchMapping$1[$this$toChoices.getStopReason().ordinal()]) {
/*     */       case 1:
/*     */         iterable1 = $this$toChoices.getContent();
/*     */         $i$f$filterIsInstance = 0;
/*     */         iterable4 = iterable1;
/*     */         collection2 = new ArrayList();
/*     */         $i$f$filterIsInstanceTo = 0;
/*     */         for (AnthropicContent element$iv$iv : iterable4) {
/*     */           if (element$iv$iv instanceof AnthropicTextContent)
/*     */             collection2.add(element$iv$iv); 
/*     */         } 
/*     */         bool3 = (((List)collection2).size() <= 1) ? true : false;
/*     */         if (_Assertions.ENABLED && !bool3) {
/*     */           String str = "Assertion failed";
/*     */           throw new AssertionError(str);
/*     */         } 
/*     */         $this$filterIsInstance$iv = $this$toChoices.getContent();
/*     */         $i$f$filterIsInstance = 0;
/*     */         $this$filterIsInstanceTo$iv$iv = $this$filterIsInstance$iv;
/*     */         destination$iv$iv = new ArrayList();
/*     */         $i$f$filterIsInstanceTo = 0;
/*     */         for (AnthropicContent element$iv$iv : $this$filterIsInstanceTo$iv$iv) {
/*     */           if (element$iv$iv instanceof AnthropicToolContent)
/*     */             destination$iv$iv.add(element$iv$iv); 
/*     */         } 
/*     */         bool2 = !((List)destination$iv$iv).isEmpty() ? true : false;
/*     */         if (_Assertions.ENABLED && !bool2) {
/*     */           String str = "Assertion failed";
/*     */           throw new AssertionError(str);
/*     */         } 
/*     */         iterable3 = $this$toChoices.getContent();
/*     */         j = 0;
/*     */         iterable7 = iterable3;
/*     */         collection6 = new ArrayList();
/*     */         m = 0;
/*     */         for (AnthropicContent element$iv$iv : iterable7) {
/*     */           if (element$iv$iv instanceof AnthropicTextContent)
/*     */             collection6.add(element$iv$iv); 
/*     */         } 
/*     */         thought = (AnthropicTextContent)CollectionsKt.firstOrNull((List)collection6);
/*     */         iterable2 = $this$toChoices.getContent();
/*     */         j = 0;
/*     */         iterable6 = iterable2;
/*     */         collection5 = new ArrayList();
/*     */         m = 0;
/*     */         for (AnthropicContent element$iv$iv : iterable6) {
/*     */           if (element$iv$iv instanceof AnthropicToolContent)
/*     */             collection5.add(element$iv$iv); 
/*     */         } 
/*     */         iterable2 = collection5;
/*     */         i = 0;
/*     */         iterable5 = iterable2;
/*     */         collection4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
/*     */         k = 0;
/*     */         for (AnthropicContent item$iv$iv : iterable5) {
/*     */           AnthropicToolContent anthropicToolContent = (AnthropicToolContent)item$iv$iv;
/*     */           Collection<AIContentAnswerChoice> collection = collection4;
/*     */           int $i$a$-map-AnthropicChatRequest$toChoices$1 = 0;
/*     */           if (anthropicToolContent.getToolName() == null)
/*     */             anthropicToolContent.getToolName(); 
/*     */         } 
/*     */         if (thought == null || thought.getText() == null)
/*     */           thought.getText(); 
/*     */         object1 = null;
/*     */         b = 12;
/*     */         object2 = null;
/*     */         object3 = null;
/*     */         str1 = "";
/*     */         str2 = thought.getText();
/*     */       case 2:
/*     */         bool1 = ($this$toChoices.getStopSequence() != null) ? true : false;
/*     */         if (_Assertions.ENABLED && !bool1) {
/*     */           String str = "Assertion failed";
/*     */           throw new AssertionError(str);
/*     */         } 
/*     */         stopType = (StopSequenceType)stopReasons.get($this$toChoices.getStopSequence());
/*     */         bool4 = (stopType != null) ? true : false;
/*     */         if (_Assertions.ENABLED && !bool4) {
/*     */           String str = "Assertion failed";
/*     */           throw new AssertionError(str);
/*     */         } 
/*     */         list2 = toChoices($this$toChoices.getContent());
/*     */         $i$a$-let-AnthropicChatRequest$toChoices$2 = 0;
/*     */         collection7 = collection4 = list2;
/*     */         $i$a$-also-AnthropicChatRequest$toChoices$2$1 = 0;
/*     */         bool6 = (collection7.size() == 1) ? true : false;
/*     */         if (_Assertions.ENABLED && !bool6) {
/*     */           String str = "Assertion failed";
/*     */           throw new AssertionError(str);
/*     */         } 
/*     */         collection1 = (!list2.isEmpty()) ? collection4 : CollectionsKt.listOf(new AIContentAnswerChoice("", null, null, 6, null));
/*     */         $i$f$map = 0;
/*     */         $this$mapTo$iv$iv = collection1;
/*     */         collection3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection1, 10));
/*     */         $i$f$mapTo = 0;
/*     */         for (Object item$iv$iv : $this$mapTo$iv$iv) {
/*     */           AIContentAnswerChoice aIContentAnswerChoice = (AIContentAnswerChoice)item$iv$iv;
/*     */           Collection collection = collection3;
/*     */           int $i$a$-map-AnthropicChatRequest$toChoices$3 = 0;
/*     */         } 
/*     */     } 
/*     */     List<AIContentAnswerChoice> list1 = toChoices($this$toChoices.getContent());
/*     */     List<AIContentAnswerChoice> it = list1;
/*     */     int $i$a$-also-AnthropicChatRequest$toChoices$4 = 0;
/*     */     boolean bool5 = (it.size() == 1) ? true : false;
/*     */     if (_Assertions.ENABLED && !bool5) {
/*     */       int $i$a$-assert-AnthropicChatRequest$toChoices$4$1 = 0;
/*     */       String str = "Choices size is not equal to 1. Content: " + $this$toChoices.getContent() + ", choices: " + it;
/*     */       throw new AssertionError(str);
/*     */     } 
/*     */     return (List)list1;
/*     */   }
/*     */   
/*     */   private final List<AIContentAnswerChoice> toChoices(List $this$toChoices) {
/*     */     Iterable $this$filterIsInstance$iv = $this$toChoices;
/*     */     int $i$f$filterIsInstance = 0;
/*     */     Iterable iterable1 = $this$filterIsInstance$iv;
/*     */     Collection<Object> collection = new ArrayList();
/*     */     int $i$f$filterIsInstanceTo = 0;
/*     */     for (Object element$iv$iv : iterable1) {
/*     */       if (element$iv$iv instanceof AnthropicTextContent)
/*     */         collection.add(element$iv$iv); 
/*     */     } 
/*     */     $this$filterIsInstance$iv = collection;
/*     */     int $i$f$map = 0;
/*     */     Iterable $this$filterIsInstanceTo$iv$iv = $this$filterIsInstance$iv;
/*     */     Collection<AIContentAnswerChoice> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$filterIsInstance$iv, 10));
/*     */     int $i$f$mapTo = 0;
/*     */     for (Object item$iv$iv : $this$filterIsInstanceTo$iv$iv) {
/*     */       AnthropicTextContent anthropicTextContent = (AnthropicTextContent)item$iv$iv;
/*     */       Collection<AIContentAnswerChoice> collection1 = destination$iv$iv;
/*     */       int $i$a$-map-AnthropicChatRequest$toChoices$5 = 0;
/*     */       collection1.add(new AIContentAnswerChoice(anthropicTextContent.getText(), null, null, 6, null));
/*     */     } 
/*     */     return (List<AIContentAnswerChoice>)destination$iv$iv;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\016\020\f\032\0020\r2\006\020\016\032\0020\017J\016\020\020\032\0020\0032\006\020\021\032\0020\022R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\026\020\b\032\n\030\0010\tj\004\030\001`\nX\016¢\006\002\n\000R\026\020\013\032\n\030\0010\tj\004\030\001`\nX\016¢\006\002\n\000¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$StreamingContentBuilder;", "", "startBlock", "Lkotlinx/serialization/json/JsonObject;", "<init>", "(Lkotlinx/serialization/json/JsonObject;)V", "getStartBlock", "()Lkotlinx/serialization/json/JsonObject;", "text", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "inputJson", "addDelta", "", "delta", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/ContentDelta;", "build", "jsonEncoder", "Lkotlinx/serialization/json/Json;", "core-llm"})
/*     */   @SourceDebugExtension({"SMAP\nAnthropicChatRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnthropicChatRequest.kt\ncom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$StreamingContentBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,220:1\n1#2:221\n222#3:222\n*S KotlinDebug\n*F\n+ 1 AnthropicChatRequest.kt\ncom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$StreamingContentBuilder\n*L\n209#1:222\n*E\n"})
/*     */   private static final class StreamingContentBuilder {
/*     */     @NotNull
/*     */     private final JsonObject startBlock;
/*     */     @Nullable
/*     */     private StringBuilder text;
/*     */     @Nullable
/*     */     private StringBuilder inputJson;
/*     */     
/*     */     public StreamingContentBuilder(@NotNull JsonObject startBlock) {
/*     */       this.startBlock = startBlock;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final JsonObject getStartBlock() {
/*     */       return this.startBlock;
/*     */     }
/*     */     
/*     */     public final void addDelta(@NotNull ContentDelta delta) {
/*     */       Intrinsics.checkNotNullParameter(delta, "delta");
/*     */       ContentDelta contentDelta = delta;
/*     */       if (this.text == null) {
/*     */         StringBuilder stringBuilder1 = new StringBuilder(), it = stringBuilder1;
/*     */         int $i$a$-also-AnthropicChatRequest$StreamingContentBuilder$addDelta$1 = 0;
/*     */         this.text = it;
/*     */       } 
/*     */       if (contentDelta instanceof ContentDelta.InputJson) {
/*     */         if (this.inputJson == null) {
/*     */           StringBuilder stringBuilder1 = new StringBuilder(), it = stringBuilder1;
/*     */           int $i$a$-also-AnthropicChatRequest$StreamingContentBuilder$addDelta$2 = 0;
/*     */           this.inputJson = it;
/*     */         } 
/*     */       } else {
/*     */         throw new NoWhenBranchMatchedException();
/*     */       } 
/*     */       (contentDelta instanceof ContentDelta.Text) ? stringBuilder1.append(((ContentDelta.Text)delta).getText()) : "JD-Core does not support Kotlin";
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final JsonObject build(@NotNull Json jsonEncoder) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'jsonEncoder'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_0
/*     */       //   7: getfield startBlock : Lkotlinx/serialization/json/JsonObject;
/*     */       //   10: aload_0
/*     */       //   11: aload_1
/*     */       //   12: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$StreamingContentBuilder;Lkotlinx/serialization/json/Json;)Lkotlin/jvm/functions/Function1;
/*     */       //   17: invokestatic access$withPatch : (Lkotlinx/serialization/json/JsonObject;Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/json/JsonObject;
/*     */       //   20: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #207	-> 6
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	21	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$StreamingContentBuilder;
/*     */       //   0	21	1	jsonEncoder	Lkotlinx/serialization/json/Json;
/*     */     }
/*     */     
/*     */     private static final Unit build$lambda$4(StreamingContentBuilder this$0, Json $jsonEncoder, Map<String, ?> $this$withPatch) {
/*     */       Intrinsics.checkNotNullParameter($this$withPatch, "$this$withPatch");
/*     */       if (this$0.text != null) {
/*     */         StringBuilder it = this$0.text;
/*     */         int $i$a$-let-AnthropicChatRequest$StreamingContentBuilder$build$1$1 = 0;
/*     */         (JsonElement)$this$withPatch.put("text", JsonElementKt.JsonPrimitive(JsonElementKt.getJsonPrimitive((JsonElement)MapsKt.getValue($this$withPatch, "text")).getContent() + JsonElementKt.getJsonPrimitive((JsonElement)MapsKt.getValue($this$withPatch, "text")).getContent()));
/*     */       } else {
/*     */       
/*     */       } 
/*     */       if (this$0.inputJson != null) {
/*     */         StringBuilder it = this$0.inputJson;
/*     */         int $i$a$-let-AnthropicChatRequest$StreamingContentBuilder$build$1$2 = 0;
/*     */         Json json = $jsonEncoder;
/*     */         Intrinsics.checkNotNullExpressionValue(it.toString(), "toString(...)");
/*     */         String string$iv = it.toString();
/*     */         int $i$f$decodeFromString = 0;
/*     */         json.getSerializersModule();
/*     */         $this$withPatch.put("input", json.decodeFromString((DeserializationStrategy)JsonElement.Companion.serializer(), string$iv));
/*     */       } else {
/*     */       
/*     */       } 
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */   }
/*     */   @NotNull
/*     */   private final AnthropicChatRequestBody requestBody;
/*     */   @NotNull
/*     */   private final Map<String, StopSequenceType> stopReasons;
/*     */   @NotNull
/*     */   private final ModelParameters modelParameters;
/*     */   private final boolean cacheEnabled;
/*     */   @NotNull
/*     */   private final MatterhornPropertyProvider propertyProvider;
/*     */   @NotNull
/*     */   public static final String ANTHROPIC_VERSION = "2023-06-01";
/*     */   @NotNull
/*     */   public static final String ANTHROPIC_PROMPT_CACHING_VERSION = "prompt-caching-2024-07-31";
/*     */   @NotNull
/*     */   public static final String ANTHROPIC_COMPUTER_USE_VERSION = "computer-use-2025-01-24";
/*     */   
/*     */   @Nullable
/*     */   public Object send(@Nullable AccessToken accessToken, @NotNull Continuation<? super AIAnswer> $completion) {
/*     */     return send$suspendImpl(this, accessToken, $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AnthropicChatRequest.kt", l = {232, 233, 246, 252, 53, 55}, i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3"}, n = {"this", "accessToken", "$this$createRequest$iv", "propertyProvider$iv", "builder$iv", "logger$iv", "this", "accessToken", "$this$createRequest$iv", "propertyProvider$iv", "builder$iv", "logger$iv", "url$iv", "this", "$this$createRequest$iv", "propertyProvider$iv", "builder$iv", "logger$iv", "this", "$this$createRequest$iv", "builder$iv", "token$iv"}, m = "executeRequest", c = "com.intellij.ml.llm.matterhorn.core.llm.anthropic.AnthropicChatRequest")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AnthropicChatRequest$executeRequest$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     int label;
/*     */     
/*     */     AnthropicChatRequest$executeRequest$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AnthropicChatRequest.this.executeRequest(null, (Continuation<? super AnthropicResponse>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AnthropicChatRequest.kt", l = {88}, i = {0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3"}, n = {"this", "message", "lastMessageDelta", "contents"}, m = "executeWithSteaming", c = "com.intellij.ml.llm.matterhorn.core.llm.anthropic.AnthropicChatRequest")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AnthropicChatRequest$executeWithSteaming$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int label;
/*     */     
/*     */     AnthropicChatRequest$executeWithSteaming$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AnthropicChatRequest.this.executeWithSteaming(null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AnthropicChatRequest.kt", l = {125}, i = {0}, s = {"L$0"}, n = {"$this"}, m = "send$suspendImpl", c = "com.intellij.ml.llm.matterhorn.core.llm.anthropic.AnthropicChatRequest")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AnthropicChatRequest$send$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     AnthropicChatRequest$send$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AnthropicChatRequest.send$suspendImpl(AnthropicChatRequest.this, null, (Continuation<? super AIAnswer>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicChatRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */