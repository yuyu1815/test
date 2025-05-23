/*     */ package ai.grazie.api.gateway.client.api.llm;
/*     */ 
/*     */ import ai.grazie.api.gateway.api.llm.LlmAPI;
/*     */ import ai.grazie.client.common.logging.AnnotationLogger;
/*     */ import ai.grazie.model.llm.chat.v5.LLMChat;
/*     */ import ai.grazie.model.llm.data.stream.LLMStreamData;
/*     */ import ai.grazie.model.llm.profile.LLMProfileID;
/*     */ import ai.grazie.model.llm.prompt.LLMPromptID;
/*     */ import ai.grazie.utils.attributes.Attributes;
/*     */ import java.util.List;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \001\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020 \n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\030\0002\0020\001:\003=>?B/\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013¢\006\002\020\fJ:\020\021\032\b\022\004\022\0020\0030\0222\006\020\023\032\0020\0032\006\020\024\032\0020\0252\n\b\002\020\026\032\004\030\0010\0272\b\b\002\020\030\032\0020\003H@¢\006\002\020\031J\036\020\032\032\0020\0332\006\020\034\032\0020\0032\006\020\035\032\0020\025H@¢\006\002\020\036J6\020\037\032\b\022\004\022\0020\0330 2\f\020!\032\b\022\004\022\0020\0030 2\006\020\035\032\0020\0252\n\b\002\020\026\032\004\030\0010\027H@¢\006\002\020\"J\034\020#\032\b\022\004\022\0020$0\0222\006\020%\032\0020&H@¢\006\002\020'J-\020#\032\b\022\004\022\0020$0\0222\027\020(\032\023\022\004\022\0020*\022\004\022\0020+0)¢\006\002\b,H@¢\006\002\020-J6\020#\032\b\022\004\022\0020$0\0222\006\020\023\032\0020.2\006\020\035\032\0020\0252\006\020/\032\002002\b\b\002\020\026\032\0020\027H@¢\006\002\0201J\024\0202\032\b\022\004\022\002030 H@¢\006\002\0204J\024\0205\032\b\022\004\022\002060 H@¢\006\002\0204J\f\0207\032\00608R\0020\000H\007J\f\0209\032\0060:R\0020\000H\007J\n\020;\032\0060<R\0020\000R\032\020\n\032\0020\013X\016¢\006\016\n\000\032\004\b\r\020\016\"\004\b\017\020\020¨\006@"}, d2 = {"Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "server", "", "auth", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "annotationLogger", "Lai/grazie/client/common/logging/AnnotationLogger;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;Lai/grazie/client/common/logging/AnnotationLogger;)V", "getAnnotationLogger", "()Lai/grazie/client/common/logging/AnnotationLogger;", "setAnnotationLogger", "(Lai/grazie/client/common/logging/AnnotationLogger;)V", "complete", "Lkotlinx/coroutines/flow/Flow;", "prompt", "id", "Lai/grazie/model/llm/profile/LLMProfileID;", "parameters", "Lai/grazie/utils/attributes/Attributes;", "postfix", "(Ljava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/utils/attributes/Attributes;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "embed", "Lai/grazie/emb/DoubleTextEmbedding;", "text", "profile", "(Ljava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "embedV2", "", "texts", "(Ljava/util/List;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "multiModalChat", "Lai/grazie/model/llm/data/stream/LLMStreamData;", "request", "Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$Request;", "(Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "builder", "Lkotlin/Function1;", "Lai/grazie/api/gateway/client/api/llm/MultiModalChatRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lai/grazie/model/llm/prompt/LLMPromptID;", "chat", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;", "(Lai/grazie/model/llm/prompt/LLMPromptID;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "profilesV2", "Lai/grazie/model/llm/profile/dto/v2/LLMProfileDTO;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "profilesV3", "Lai/grazie/model/llm/profile/dto/v3/LLMProfileDTO;", "v5", "Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V5;", "v6", "Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6;", "v7", "Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7;", "V5", "V6", "V7", "api-gateway-client"})
/*     */ @SourceDebugExtension({"SMAP\nLlmAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LlmAPIClient.kt\nai/grazie/api/gateway/client/api/llm/LlmAPIClient\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n+ 4 JSON.kt\nai/grazie/utils/json/JSON\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 8 SuspendableCloudClientExtensions.kt\nai/grazie/client/cbor/extensions/SuspendableCloudClientExtensionsKt\n+ 9 HTTPResponseExtensions.kt\nai/grazie/client/common/model/HTTPResponseExtensionsKt\n*L\n1#1,429:1\n77#2,8:430\n77#2,8:470\n86#3:438\n87#3:440\n88#3,3:446\n86#3:478\n87#3:480\n88#3,3:486\n28#4:439\n28#4:479\n49#5:441\n51#5:445\n49#5:449\n51#5:453\n49#5:481\n51#5:485\n49#5:489\n51#5:493\n46#6:442\n51#6:444\n46#6:450\n51#6:452\n46#6:482\n51#6:484\n46#6:490\n51#6:492\n105#7:443\n105#7:451\n105#7:483\n105#7:491\n26#8,8:454\n26#8,8:462\n7#9,2:494\n7#9,2:496\n*S KotlinDebug\n*F\n+ 1 LlmAPIClient.kt\nai/grazie/api/gateway/client/api/llm/LlmAPIClient\n*L\n42#1:430,8\n406#1:470,8\n42#1:438\n42#1:440\n42#1:446,3\n406#1:478\n406#1:480\n406#1:486,3\n42#1:439\n406#1:479\n42#1:441\n42#1:445\n43#1:449\n43#1:453\n406#1:481\n406#1:485\n408#1:489\n408#1:493\n42#1:442\n42#1:444\n43#1:450\n43#1:452\n406#1:482\n406#1:484\n408#1:490\n408#1:492\n42#1:443\n43#1:451\n406#1:483\n408#1:491\n379#1:454,8\n385#1:462,8\n420#1:494,2\n425#1:496,2\n*E\n"})
/*     */ public final class LlmAPIClient extends SuspendableCloudClient {
/*     */   @NotNull
/*     */   private AnnotationLogger annotationLogger;
/*     */   
/*     */   @NotNull
/*  28 */   public AnnotationLogger getAnnotationLogger() { return this.annotationLogger; } public void setAnnotationLogger(@NotNull AnnotationLogger <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.annotationLogger = <set-?>; } public LlmAPIClient(@NotNull String server, @NotNull AuthType auth, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json, @NotNull AnnotationLogger annotationLogger) {
/*  29 */     super(server, auth, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*     */     this.annotationLogger = annotationLogger;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated(message = "in favor of V7", replaceWith = @ReplaceWith(expression = "v7().complete(LLMPromptID.UNKNOWN, id,prompt, postfix, parameters)", imports = {}))
/*     */   @Nullable
/*     */   public final Object complete(@NotNull String prompt, @NotNull LLMProfileID id, @Nullable Attributes parameters, @NotNull String postfix, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: instanceof ai/grazie/api/gateway/client/api/llm/LlmAPIClient$complete$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #5
/*     */     //   10: checkcast ai/grazie/api/gateway/client/api/llm/LlmAPIClient$complete$1
/*     */     //   13: astore #25
/*     */     //   15: aload #25
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #25
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$complete$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #5
/*     */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #25
/*     */     //   53: aload #25
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #24
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #26
/*     */     //   65: aload #25
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 426, 0 -> 92, 1 -> 253
/*     */     //   92: aload #24
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V3.INSTANCE : Lai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V3;
/*     */     //   100: checkcast ai/grazie/model/cloud/API
/*     */     //   103: astore #7
/*     */     //   105: new ai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V3$Request
/*     */     //   108: dup
/*     */     //   109: aload_1
/*     */     //   110: aload #4
/*     */     //   112: aload_2
/*     */     //   113: aload_3
/*     */     //   114: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/utils/attributes/Attributes;)V
/*     */     //   117: astore #8
/*     */     //   119: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V3$Response.Companion : Lai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V3$Response$Companion;
/*     */     //   122: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   125: astore #9
/*     */     //   127: iconst_0
/*     */     //   128: istore #10
/*     */     //   130: new ai/grazie/client/common/model/RequestOptions
/*     */     //   133: dup
/*     */     //   134: aconst_null
/*     */     //   135: aconst_null
/*     */     //   136: iconst_3
/*     */     //   137: aconst_null
/*     */     //   138: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   141: astore #11
/*     */     //   143: aload_0
/*     */     //   144: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*     */     //   147: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*     */     //   150: astore #12
/*     */     //   152: iconst_0
/*     */     //   153: istore #13
/*     */     //   155: aload_0
/*     */     //   156: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*     */     //   159: invokevirtual getHttpClient : ()Lai/grazie/client/common/SuspendableHTTPClient;
/*     */     //   162: astore #14
/*     */     //   164: aload_0
/*     */     //   165: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*     */     //   168: aload #7
/*     */     //   170: invokevirtual url : (Lai/grazie/model/cloud/API;)Ljava/lang/String;
/*     */     //   173: astore #15
/*     */     //   175: aload #11
/*     */     //   177: aload #7
/*     */     //   179: invokestatic withTimeout : (Lai/grazie/client/common/model/RequestOptions;Lai/grazie/model/cloud/API;)Lai/grazie/client/common/model/RequestOptions;
/*     */     //   182: astore #16
/*     */     //   184: iconst_0
/*     */     //   185: istore #17
/*     */     //   187: aload #14
/*     */     //   189: aload #15
/*     */     //   191: aload #12
/*     */     //   193: astore #18
/*     */     //   195: iconst_0
/*     */     //   196: istore #19
/*     */     //   198: aload #18
/*     */     //   200: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V3$Request.Companion : Lai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V3$Request$Companion;
/*     */     //   203: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   206: checkcast kotlinx/serialization/SerializationStrategy
/*     */     //   209: aload #8
/*     */     //   211: invokevirtual string : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   214: aload #16
/*     */     //   216: iconst_0
/*     */     //   217: aload #25
/*     */     //   219: aload #25
/*     */     //   221: aload #9
/*     */     //   223: putfield L$0 : Ljava/lang/Object;
/*     */     //   226: aload #25
/*     */     //   228: aload #12
/*     */     //   230: putfield L$1 : Ljava/lang/Object;
/*     */     //   233: aload #25
/*     */     //   235: iconst_1
/*     */     //   236: putfield label : I
/*     */     //   239: invokeinterface receiveContinuousSSE : (Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   244: dup
/*     */     //   245: aload #26
/*     */     //   247: if_acmpne -> 286
/*     */     //   250: aload #26
/*     */     //   252: areturn
/*     */     //   253: iconst_0
/*     */     //   254: istore #13
/*     */     //   256: iconst_0
/*     */     //   257: istore #17
/*     */     //   259: aload #25
/*     */     //   261: getfield L$1 : Ljava/lang/Object;
/*     */     //   264: checkcast ai/grazie/utils/json/JSON
/*     */     //   267: astore #12
/*     */     //   269: aload #25
/*     */     //   271: getfield L$0 : Ljava/lang/Object;
/*     */     //   274: checkcast kotlinx/serialization/KSerializer
/*     */     //   277: astore #9
/*     */     //   279: aload #24
/*     */     //   281: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   284: aload #24
/*     */     //   286: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   289: astore #18
/*     */     //   291: iconst_0
/*     */     //   292: istore #19
/*     */     //   294: aload #18
/*     */     //   296: astore #20
/*     */     //   298: iconst_0
/*     */     //   299: istore #21
/*     */     //   301: iconst_0
/*     */     //   302: istore #22
/*     */     //   304: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$complete$$inlined$receiveContinuousSSE$default$1
/*     */     //   307: dup
/*     */     //   308: aload #20
/*     */     //   310: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*     */     //   313: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   316: nop
/*     */     //   317: nop
/*     */     //   318: invokestatic filterNotNull : (Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;
/*     */     //   321: astore #18
/*     */     //   323: iconst_0
/*     */     //   324: istore #19
/*     */     //   326: aload #18
/*     */     //   328: astore #20
/*     */     //   330: iconst_0
/*     */     //   331: istore #21
/*     */     //   333: iconst_0
/*     */     //   334: istore #22
/*     */     //   336: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$complete$$inlined$receiveContinuousSSE$default$2
/*     */     //   339: dup
/*     */     //   340: aload #20
/*     */     //   342: aload #9
/*     */     //   344: aload #12
/*     */     //   346: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lkotlinx/serialization/KSerializer;Lai/grazie/utils/json/JSON;)V
/*     */     //   349: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   352: nop
/*     */     //   353: nop
/*     */     //   354: astore #18
/*     */     //   356: getstatic ai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent.Companion : Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;
/*     */     //   359: astore #19
/*     */     //   361: iconst_0
/*     */     //   362: istore #20
/*     */     //   364: aload #18
/*     */     //   366: astore #21
/*     */     //   368: iconst_0
/*     */     //   369: istore #22
/*     */     //   371: iconst_0
/*     */     //   372: istore #23
/*     */     //   374: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$complete$$inlined$receiveContinuousSSE$default$3
/*     */     //   377: dup
/*     */     //   378: aload #21
/*     */     //   380: aload #19
/*     */     //   382: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;)V
/*     */     //   385: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   388: nop
/*     */     //   389: nop
/*     */     //   390: nop
/*     */     //   391: nop
/*     */     //   392: astore #6
/*     */     //   394: aload #6
/*     */     //   396: astore #7
/*     */     //   398: iconst_0
/*     */     //   399: istore #8
/*     */     //   401: aload #7
/*     */     //   403: astore #9
/*     */     //   405: iconst_0
/*     */     //   406: istore #10
/*     */     //   408: iconst_0
/*     */     //   409: istore #11
/*     */     //   411: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$complete$$inlined$map$1
/*     */     //   414: dup
/*     */     //   415: aload #9
/*     */     //   417: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*     */     //   420: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   423: nop
/*     */     //   424: nop
/*     */     //   425: areturn
/*     */     //   426: new java/lang/IllegalStateException
/*     */     //   429: dup
/*     */     //   430: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   432: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   435: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #40	-> 63
/*     */     //   #42	-> 97
/*     */     //   #430	-> 119
/*     */     //   #433	-> 119
/*     */     //   #430	-> 127
/*     */     //   #434	-> 127
/*     */     //   #430	-> 130
/*     */     //   #435	-> 130
/*     */     //   #430	-> 143
/*     */     //   #436	-> 143
/*     */     //   #430	-> 152
/*     */     //   #437	-> 155
/*     */     //   #438	-> 187
/*     */     //   #439	-> 198
/*     */     //   #438	-> 214
/*     */     //   #40	-> 250
/*     */     //   #440	-> 291
/*     */     //   #441	-> 294
/*     */     //   #442	-> 301
/*     */     //   #443	-> 304
/*     */     //   #444	-> 316
/*     */     //   #445	-> 317
/*     */     //   #446	-> 318
/*     */     //   #447	-> 323
/*     */     //   #441	-> 326
/*     */     //   #442	-> 333
/*     */     //   #443	-> 336
/*     */     //   #444	-> 352
/*     */     //   #445	-> 353
/*     */     //   #448	-> 356
/*     */     //   #441	-> 364
/*     */     //   #442	-> 371
/*     */     //   #443	-> 374
/*     */     //   #444	-> 388
/*     */     //   #445	-> 389
/*     */     //   #438	-> 390
/*     */     //   #437	-> 391
/*     */     //   #42	-> 392
/*     */     //   #41	-> 392
/*     */     //   #43	-> 394
/*     */     //   #449	-> 401
/*     */     //   #450	-> 408
/*     */     //   #451	-> 411
/*     */     //   #452	-> 423
/*     */     //   #453	-> 424
/*     */     //   #43	-> 425
/*     */     //   #40	-> 426
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	87	0	this	Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;
/*     */     //   97	22	1	prompt	Ljava/lang/String;
/*     */     //   97	22	2	id	Lai/grazie/model/llm/profile/LLMProfileID;
/*     */     //   97	22	3	parameters	Lai/grazie/utils/attributes/Attributes;
/*     */     //   97	22	4	postfix	Ljava/lang/String;
/*     */     //   394	32	6	result	Lkotlinx/coroutines/flow/Flow;
/*     */     //   119	65	7	api$iv	Lai/grazie/model/cloud/API;
/*     */     //   398	27	7	$this$map$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   119	95	8	content$iv	Ljava/lang/Object;
/*     */     //   127	126	9	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */     //   279	113	9	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */     //   405	19	9	$this$unsafeTransform$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   130	86	10	reconnect$iv	Z
/*     */     //   143	41	11	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   152	101	12	json$iv	Lai/grazie/utils/json/JSON;
/*     */     //   269	123	12	json$iv	Lai/grazie/utils/json/JSON;
/*     */     //   184	11	14	$this$receiveContinuousSSE$iv$iv	Lai/grazie/client/common/SuspendableHTTPClient;
/*     */     //   184	11	15	url$iv$iv	Ljava/lang/String;
/*     */     //   184	32	16	options$iv$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   195	19	18	this_$iv$iv$iv	Lai/grazie/utils/json/JSON;
/*     */     //   291	27	18	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   323	31	18	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   356	34	18	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   298	19	20	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   330	23	20	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   368	21	21	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   198	16	19	$i$f$string	I
/*     */     //   304	12	22	$i$f$unsafeFlow	I
/*     */     //   301	16	21	$i$f$unsafeTransform	I
/*     */     //   294	24	19	$i$f$map	I
/*     */     //   336	16	22	$i$f$unsafeFlow	I
/*     */     //   333	20	21	$i$f$unsafeTransform	I
/*     */     //   326	28	19	$i$f$map	I
/*     */     //   374	14	23	$i$f$unsafeFlow	I
/*     */     //   371	18	22	$i$f$unsafeTransform	I
/*     */     //   364	26	20	$i$f$map	I
/*     */     //   187	66	17	$i$f$receiveContinuousSSE	I
/*     */     //   155	98	13	$i$f$receiveContinuousSSE	I
/*     */     //   411	12	11	$i$f$unsafeFlow	I
/*     */     //   408	16	10	$i$f$unsafeTransform	I
/*     */     //   401	24	8	$i$f$map	I
/*     */     //   0	436	5	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	373	25	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	366	24	$result	Ljava/lang/Object;
/*     */     //   259	132	17	$i$f$receiveContinuousSSE	I
/*     */     //   256	136	13	$i$f$receiveContinuousSSE	I
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\004\030\0002\0020\001B\005¢\006\002\020\002J\034\020\003\032\b\022\004\022\0020\0050\0042\006\020\006\032\0020\007H@¢\006\002\020\bJ-\020\003\032\b\022\004\022\0020\0050\0042\027\020\t\032\023\022\004\022\0020\013\022\004\022\0020\f0\n¢\006\002\b\rH@¢\006\002\020\016J6\020\003\032\b\022\004\022\0020\0050\0042\006\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\003\032\0020\0232\b\b\002\020\024\032\0020\025H@¢\006\002\020\026¨\006\027"}, d2 = {"Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V5;", "", "(Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;)V", "chat", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/model/llm/data/stream/LLMStreamData;", "request", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V5$Request;", "(Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V5$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "builder", "Lkotlin/Function1;", "Lai/grazie/api/gateway/client/api/llm/ChatRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prompt", "Lai/grazie/model/llm/prompt/LLMPromptID;", "profile", "Lai/grazie/model/llm/profile/LLMProfileID;", "Lai/grazie/model/llm/chat/v5/LLMChat;", "parameters", "Lai/grazie/utils/attributes/Attributes;", "(Lai/grazie/model/llm/prompt/LLMPromptID;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/model/llm/chat/v5/LLMChat;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*     */   @SourceDebugExtension({"SMAP\nLlmAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LlmAPIClient.kt\nai/grazie/api/gateway/client/api/llm/LlmAPIClient$V5\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n+ 4 JSON.kt\nai/grazie/utils/json/JSON\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,429:1\n77#2,8:430\n86#3:438\n87#3:440\n88#3,3:446\n28#4:439\n49#5:441\n51#5:445\n49#5:449\n51#5:453\n46#6:442\n51#6:444\n46#6:450\n51#6:452\n105#7:443\n105#7:451\n*S KotlinDebug\n*F\n+ 1 LlmAPIClient.kt\nai/grazie/api/gateway/client/api/llm/LlmAPIClient$V5\n*L\n133#1:430,8\n133#1:438\n133#1:440\n133#1:446,3\n133#1:439\n133#1:441\n133#1:445\n135#1:449\n135#1:453\n133#1:442\n133#1:444\n135#1:450\n135#1:452\n133#1:443\n135#1:451\n*E\n"})
/*     */   public final class V5
/*     */   {
/*     */     @Nullable
/*     */     public final Object chat(@NotNull LLMPromptID prompt, @NotNull LLMProfileID profile, @NotNull LLMChat chat, @NotNull Attributes parameters, @NotNull Continuation<? super Flow<? extends LLMStreamData>> $completion) {
/* 117 */       return chat(new LlmAPI.Chat.Stream.V5.Request(prompt, profile, chat, parameters), $completion);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public final Object chat(@NotNull Function1 builder, @NotNull Continuation<? super Flow<? extends LLMStreamData>> $completion) {
/* 129 */       ChatRequestBuilder chatRequestBuilder = new ChatRequestBuilder(); builder.invoke(chatRequestBuilder); return chat(chatRequestBuilder.build(), $completion);
/*     */     } private final Object chat(LlmAPI.Chat.Stream.V5.Request request, Continuation $completion) {
/*     */       // Byte code:
/*     */       //   0: aload_2
/*     */       //   1: instanceof ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V5$chat$3
/*     */       //   4: ifeq -> 39
/*     */       //   7: aload_2
/*     */       //   8: checkcast ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V5$chat$3
/*     */       //   11: astore #22
/*     */       //   13: aload #22
/*     */       //   15: getfield label : I
/*     */       //   18: ldc -2147483648
/*     */       //   20: iand
/*     */       //   21: ifeq -> 39
/*     */       //   24: aload #22
/*     */       //   26: dup
/*     */       //   27: getfield label : I
/*     */       //   30: ldc -2147483648
/*     */       //   32: isub
/*     */       //   33: putfield label : I
/*     */       //   36: goto -> 50
/*     */       //   39: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V5$chat$3
/*     */       //   42: dup
/*     */       //   43: aload_0
/*     */       //   44: aload_2
/*     */       //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V5;Lkotlin/coroutines/Continuation;)V
/*     */       //   48: astore #22
/*     */       //   50: aload #22
/*     */       //   52: getfield result : Ljava/lang/Object;
/*     */       //   55: astore #21
/*     */       //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   60: astore #23
/*     */       //   62: aload #22
/*     */       //   64: getfield label : I
/*     */       //   67: tableswitch default -> 408, 0 -> 88, 1 -> 237
/*     */       //   88: aload #21
/*     */       //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   93: aload_0
/*     */       //   94: getfield this$0 : Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;
/*     */       //   97: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*     */       //   100: astore #4
/*     */       //   102: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V5.INSTANCE : Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V5;
/*     */       //   105: checkcast ai/grazie/model/cloud/API
/*     */       //   108: astore #5
/*     */       //   110: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V5$LLMData.Companion : Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V5$LLMData$Companion;
/*     */       //   113: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */       //   116: astore #6
/*     */       //   118: iconst_0
/*     */       //   119: istore #7
/*     */       //   121: new ai/grazie/client/common/model/RequestOptions
/*     */       //   124: dup
/*     */       //   125: aconst_null
/*     */       //   126: aconst_null
/*     */       //   127: iconst_3
/*     */       //   128: aconst_null
/*     */       //   129: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */       //   132: astore #8
/*     */       //   134: aload #4
/*     */       //   136: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*     */       //   139: astore #9
/*     */       //   141: iconst_0
/*     */       //   142: istore #10
/*     */       //   144: aload #4
/*     */       //   146: invokevirtual getHttpClient : ()Lai/grazie/client/common/SuspendableHTTPClient;
/*     */       //   149: astore #11
/*     */       //   151: aload #4
/*     */       //   153: aload #5
/*     */       //   155: invokevirtual url : (Lai/grazie/model/cloud/API;)Ljava/lang/String;
/*     */       //   158: astore #12
/*     */       //   160: aload #8
/*     */       //   162: aload #5
/*     */       //   164: invokestatic withTimeout : (Lai/grazie/client/common/model/RequestOptions;Lai/grazie/model/cloud/API;)Lai/grazie/client/common/model/RequestOptions;
/*     */       //   167: astore #13
/*     */       //   169: iconst_0
/*     */       //   170: istore #14
/*     */       //   172: aload #11
/*     */       //   174: aload #12
/*     */       //   176: aload #9
/*     */       //   178: astore #15
/*     */       //   180: iconst_0
/*     */       //   181: istore #16
/*     */       //   183: aload #15
/*     */       //   185: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V5$Request.Companion : Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V5$Request$Companion;
/*     */       //   188: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */       //   191: checkcast kotlinx/serialization/SerializationStrategy
/*     */       //   194: aload_1
/*     */       //   195: invokevirtual string : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
/*     */       //   198: aload #13
/*     */       //   200: iconst_0
/*     */       //   201: aload #22
/*     */       //   203: aload #22
/*     */       //   205: aload #6
/*     */       //   207: putfield L$0 : Ljava/lang/Object;
/*     */       //   210: aload #22
/*     */       //   212: aload #9
/*     */       //   214: putfield L$1 : Ljava/lang/Object;
/*     */       //   217: aload #22
/*     */       //   219: iconst_1
/*     */       //   220: putfield label : I
/*     */       //   223: invokeinterface receiveContinuousSSE : (Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   228: dup
/*     */       //   229: aload #23
/*     */       //   231: if_acmpne -> 270
/*     */       //   234: aload #23
/*     */       //   236: areturn
/*     */       //   237: iconst_0
/*     */       //   238: istore #10
/*     */       //   240: iconst_0
/*     */       //   241: istore #14
/*     */       //   243: aload #22
/*     */       //   245: getfield L$1 : Ljava/lang/Object;
/*     */       //   248: checkcast ai/grazie/utils/json/JSON
/*     */       //   251: astore #9
/*     */       //   253: aload #22
/*     */       //   255: getfield L$0 : Ljava/lang/Object;
/*     */       //   258: checkcast kotlinx/serialization/KSerializer
/*     */       //   261: astore #6
/*     */       //   263: aload #21
/*     */       //   265: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   268: aload #21
/*     */       //   270: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   273: astore #15
/*     */       //   275: iconst_0
/*     */       //   276: istore #16
/*     */       //   278: aload #15
/*     */       //   280: astore #17
/*     */       //   282: iconst_0
/*     */       //   283: istore #18
/*     */       //   285: iconst_0
/*     */       //   286: istore #19
/*     */       //   288: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V5$chat$$inlined$receiveContinuousSSE$default$1
/*     */       //   291: dup
/*     */       //   292: aload #17
/*     */       //   294: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*     */       //   297: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   300: nop
/*     */       //   301: nop
/*     */       //   302: invokestatic filterNotNull : (Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;
/*     */       //   305: astore #15
/*     */       //   307: iconst_0
/*     */       //   308: istore #16
/*     */       //   310: aload #15
/*     */       //   312: astore #17
/*     */       //   314: iconst_0
/*     */       //   315: istore #18
/*     */       //   317: iconst_0
/*     */       //   318: istore #19
/*     */       //   320: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V5$chat$$inlined$receiveContinuousSSE$default$2
/*     */       //   323: dup
/*     */       //   324: aload #17
/*     */       //   326: aload #6
/*     */       //   328: aload #9
/*     */       //   330: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lkotlinx/serialization/KSerializer;Lai/grazie/utils/json/JSON;)V
/*     */       //   333: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   336: nop
/*     */       //   337: nop
/*     */       //   338: astore #15
/*     */       //   340: getstatic ai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent.Companion : Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;
/*     */       //   343: astore #16
/*     */       //   345: iconst_0
/*     */       //   346: istore #17
/*     */       //   348: aload #15
/*     */       //   350: astore #18
/*     */       //   352: iconst_0
/*     */       //   353: istore #19
/*     */       //   355: iconst_0
/*     */       //   356: istore #20
/*     */       //   358: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V5$chat$$inlined$receiveContinuousSSE$default$3
/*     */       //   361: dup
/*     */       //   362: aload #18
/*     */       //   364: aload #16
/*     */       //   366: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;)V
/*     */       //   369: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   372: nop
/*     */       //   373: nop
/*     */       //   374: nop
/*     */       //   375: nop
/*     */       //   376: astore_3
/*     */       //   377: aload_3
/*     */       //   378: astore #4
/*     */       //   380: iconst_0
/*     */       //   381: istore #5
/*     */       //   383: aload #4
/*     */       //   385: astore #6
/*     */       //   387: iconst_0
/*     */       //   388: istore #7
/*     */       //   390: iconst_0
/*     */       //   391: istore #8
/*     */       //   393: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V5$chat$$inlined$map$1
/*     */       //   396: dup
/*     */       //   397: aload #6
/*     */       //   399: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*     */       //   402: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   405: nop
/*     */       //   406: nop
/*     */       //   407: areturn
/*     */       //   408: new java/lang/IllegalStateException
/*     */       //   411: dup
/*     */       //   412: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   414: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   417: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #132	-> 60
/*     */       //   #133	-> 93
/*     */       //   #430	-> 110
/*     */       //   #433	-> 110
/*     */       //   #430	-> 118
/*     */       //   #434	-> 118
/*     */       //   #430	-> 121
/*     */       //   #435	-> 121
/*     */       //   #430	-> 134
/*     */       //   #436	-> 134
/*     */       //   #430	-> 141
/*     */       //   #437	-> 144
/*     */       //   #438	-> 172
/*     */       //   #439	-> 183
/*     */       //   #438	-> 198
/*     */       //   #132	-> 234
/*     */       //   #440	-> 275
/*     */       //   #441	-> 278
/*     */       //   #442	-> 285
/*     */       //   #443	-> 288
/*     */       //   #444	-> 300
/*     */       //   #445	-> 301
/*     */       //   #446	-> 302
/*     */       //   #447	-> 307
/*     */       //   #441	-> 310
/*     */       //   #442	-> 317
/*     */       //   #443	-> 320
/*     */       //   #444	-> 336
/*     */       //   #445	-> 337
/*     */       //   #448	-> 340
/*     */       //   #441	-> 348
/*     */       //   #442	-> 355
/*     */       //   #443	-> 358
/*     */       //   #444	-> 372
/*     */       //   #445	-> 373
/*     */       //   #438	-> 374
/*     */       //   #437	-> 375
/*     */       //   #133	-> 376
/*     */       //   #134	-> 377
/*     */       //   #135	-> 380
/*     */       //   #449	-> 383
/*     */       //   #450	-> 390
/*     */       //   #451	-> 393
/*     */       //   #452	-> 405
/*     */       //   #453	-> 406
/*     */       //   #134	-> 407
/*     */       //   #132	-> 408
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   93	17	0	this	Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V5;
/*     */       //   93	105	1	request	Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V5$Request;
/*     */       //   377	31	3	result	Lkotlinx/coroutines/flow/Flow;
/*     */       //   110	59	4	$this$iv	Lai/grazie/client/common/cloud/SuspendableCloudClient;
/*     */       //   380	27	4	$this$map$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   110	59	5	api$iv	Lai/grazie/model/cloud/API;
/*     */       //   118	119	6	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */       //   263	113	6	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */       //   387	19	6	$this$unsafeTransform$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   121	79	7	reconnect$iv	Z
/*     */       //   134	35	8	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */       //   141	96	9	json$iv	Lai/grazie/utils/json/JSON;
/*     */       //   253	123	9	json$iv	Lai/grazie/utils/json/JSON;
/*     */       //   169	11	11	$this$receiveContinuousSSE$iv$iv	Lai/grazie/client/common/SuspendableHTTPClient;
/*     */       //   169	11	12	url$iv$iv	Ljava/lang/String;
/*     */       //   169	31	13	options$iv$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */       //   180	18	15	this_$iv$iv$iv	Lai/grazie/utils/json/JSON;
/*     */       //   275	27	15	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   307	31	15	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   340	34	15	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   282	19	17	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   314	23	17	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   352	21	18	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   183	15	16	$i$f$string	I
/*     */       //   288	12	19	$i$f$unsafeFlow	I
/*     */       //   285	16	18	$i$f$unsafeTransform	I
/*     */       //   278	24	16	$i$f$map	I
/*     */       //   320	16	19	$i$f$unsafeFlow	I
/*     */       //   317	20	18	$i$f$unsafeTransform	I
/*     */       //   310	28	16	$i$f$map	I
/*     */       //   358	14	20	$i$f$unsafeFlow	I
/*     */       //   355	18	19	$i$f$unsafeTransform	I
/*     */       //   348	26	17	$i$f$map	I
/*     */       //   172	65	14	$i$f$receiveContinuousSSE	I
/*     */       //   144	93	10	$i$f$receiveContinuousSSE	I
/*     */       //   393	12	8	$i$f$unsafeFlow	I
/*     */       //   390	16	7	$i$f$unsafeTransform	I
/*     */       //   383	24	5	$i$f$map	I
/*     */       //   0	418	2	$completion	Lkotlin/coroutines/Continuation;
/*     */       //   50	358	22	$continuation	Lkotlin/coroutines/Continuation;
/*     */       //   57	351	21	$result	Ljava/lang/Object;
/*     */       //   243	132	14	$i$f$receiveContinuousSSE	I
/*     */       //   240	136	10	$i$f$receiveContinuousSSE	I
/*     */     } @DebugMetadata(f = "LlmAPIClient.kt", l = {438}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"serializer$iv", "json$iv"}, m = "chat", c = "ai.grazie.api.gateway.client.api.llm.LlmAPIClient$V5")
/*     */     @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */     static final class LlmAPIClient$V5$chat$3 extends ContinuationImpl { Object L$0; Object L$1; int label; LlmAPIClient$V5$chat$3(Continuation $completion) {
/*     */         super($completion);
/*     */       } @Nullable
/*     */       public final Object invokeSuspend(@NotNull Object $result) {
/*     */         this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return LlmAPIClient.V5.this.chat((LlmAPI.Chat.Stream.V5.Request)null, (Continuation)this);
/*     */       } } }
/*     */   @Deprecated(message = "Use v7 instead", replaceWith = @ReplaceWith(expression = "v7()", imports = {}))
/*     */   @NotNull
/*     */   public final V5 v5() {
/* 145 */     return new V5();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\b\004\030\0002\0020\001B\005¢\006\002\020\002J\034\020\003\032\b\022\004\022\0020\0050\0042\006\020\006\032\0020\007H@¢\006\002\020\bJ-\020\003\032\b\022\004\022\0020\0050\0042\027\020\t\032\023\022\004\022\0020\013\022\004\022\0020\f0\n¢\006\002\b\rH@¢\006\002\020\016J6\020\003\032\b\022\004\022\0020\0050\0042\006\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\003\032\0020\0232\b\b\002\020\024\032\0020\025H@¢\006\002\020\026J@\020\027\032\b\022\004\022\0020\0050\0042\006\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\030\032\0020\0312\006\020\032\032\0020\0312\n\b\002\020\024\032\004\030\0010\025H@¢\006\002\020\033¨\006\034"}, d2 = {"Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6;", "", "(Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;)V", "chat", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/model/llm/data/stream/LLMStreamData;", "request", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$Request;", "(Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "builder", "Lkotlin/Function1;", "Lai/grazie/api/gateway/client/api/llm/ChatRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prompt", "Lai/grazie/model/llm/prompt/LLMPromptID;", "profile", "Lai/grazie/model/llm/profile/LLMProfileID;", "Lai/grazie/model/llm/chat/v5/LLMChat;", "parameters", "Lai/grazie/utils/attributes/Attributes;", "(Lai/grazie/model/llm/prompt/LLMPromptID;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/model/llm/chat/v5/LLMChat;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "complete", "prefix", "", "suffix", "(Lai/grazie/model/llm/prompt/LLMPromptID;Lai/grazie/model/llm/profile/LLMProfileID;Ljava/lang/String;Ljava/lang/String;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*     */   @SourceDebugExtension({"SMAP\nLlmAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LlmAPIClient.kt\nai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n+ 4 JSON.kt\nai/grazie/utils/json/JSON\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,429:1\n77#2,8:430\n77#2,8:454\n86#3:438\n87#3:440\n88#3,3:446\n86#3:462\n87#3:464\n88#3,3:470\n28#4:439\n28#4:463\n49#5:441\n51#5:445\n49#5:449\n51#5:453\n49#5:465\n51#5:469\n49#5:473\n51#5:477\n46#6:442\n51#6:444\n46#6:450\n51#6:452\n46#6:466\n51#6:468\n46#6:474\n51#6:476\n105#7:443\n105#7:451\n105#7:467\n105#7:475\n*S KotlinDebug\n*F\n+ 1 LlmAPIClient.kt\nai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6\n*L\n234#1:430,8\n247#1:454,8\n234#1:438\n234#1:440\n234#1:446,3\n247#1:462\n247#1:464\n247#1:470,3\n234#1:439\n247#1:463\n234#1:441\n234#1:445\n236#1:449\n236#1:453\n247#1:465\n247#1:469\n248#1:473\n248#1:477\n234#1:442\n234#1:444\n236#1:450\n236#1:452\n247#1:466\n247#1:468\n248#1:474\n248#1:476\n234#1:443\n236#1:451\n247#1:467\n248#1:475\n*E\n"})
/*     */   public final class V6
/*     */   {
/*     */     @Nullable
/*     */     public final Object chat(@NotNull LLMPromptID prompt, @NotNull LLMProfileID profile, @NotNull LLMChat chat, @NotNull Attributes parameters, @NotNull Continuation<? super Flow<? extends LLMStreamData>> $completion) {
/* 218 */       return chat(new LlmAPI.Chat.Stream.V6.Request(prompt, profile, chat, parameters), $completion);
/*     */     }
/*     */     private final Object chat(LlmAPI.Chat.Stream.V6.Request request, Continuation $completion) { // Byte code:
/*     */       //   0: aload_2
/*     */       //   1: instanceof ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$chat$3
/*     */       //   4: ifeq -> 39
/*     */       //   7: aload_2
/*     */       //   8: checkcast ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$chat$3
/*     */       //   11: astore #22
/*     */       //   13: aload #22
/*     */       //   15: getfield label : I
/*     */       //   18: ldc -2147483648
/*     */       //   20: iand
/*     */       //   21: ifeq -> 39
/*     */       //   24: aload #22
/*     */       //   26: dup
/*     */       //   27: getfield label : I
/*     */       //   30: ldc -2147483648
/*     */       //   32: isub
/*     */       //   33: putfield label : I
/*     */       //   36: goto -> 50
/*     */       //   39: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$chat$3
/*     */       //   42: dup
/*     */       //   43: aload_0
/*     */       //   44: aload_2
/*     */       //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6;Lkotlin/coroutines/Continuation;)V
/*     */       //   48: astore #22
/*     */       //   50: aload #22
/*     */       //   52: getfield result : Ljava/lang/Object;
/*     */       //   55: astore #21
/*     */       //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   60: astore #23
/*     */       //   62: aload #22
/*     */       //   64: getfield label : I
/*     */       //   67: tableswitch default -> 408, 0 -> 88, 1 -> 237
/*     */       //   88: aload #21
/*     */       //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   93: aload_0
/*     */       //   94: getfield this$0 : Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;
/*     */       //   97: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*     */       //   100: astore #4
/*     */       //   102: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6.INSTANCE : Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6;
/*     */       //   105: checkcast ai/grazie/model/cloud/API
/*     */       //   108: astore #5
/*     */       //   110: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData.Companion : Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData$Companion;
/*     */       //   113: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */       //   116: astore #6
/*     */       //   118: iconst_0
/*     */       //   119: istore #7
/*     */       //   121: new ai/grazie/client/common/model/RequestOptions
/*     */       //   124: dup
/*     */       //   125: aconst_null
/*     */       //   126: aconst_null
/*     */       //   127: iconst_3
/*     */       //   128: aconst_null
/*     */       //   129: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */       //   132: astore #8
/*     */       //   134: aload #4
/*     */       //   136: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*     */       //   139: astore #9
/*     */       //   141: iconst_0
/*     */       //   142: istore #10
/*     */       //   144: aload #4
/*     */       //   146: invokevirtual getHttpClient : ()Lai/grazie/client/common/SuspendableHTTPClient;
/*     */       //   149: astore #11
/*     */       //   151: aload #4
/*     */       //   153: aload #5
/*     */       //   155: invokevirtual url : (Lai/grazie/model/cloud/API;)Ljava/lang/String;
/*     */       //   158: astore #12
/*     */       //   160: aload #8
/*     */       //   162: aload #5
/*     */       //   164: invokestatic withTimeout : (Lai/grazie/client/common/model/RequestOptions;Lai/grazie/model/cloud/API;)Lai/grazie/client/common/model/RequestOptions;
/*     */       //   167: astore #13
/*     */       //   169: iconst_0
/*     */       //   170: istore #14
/*     */       //   172: aload #11
/*     */       //   174: aload #12
/*     */       //   176: aload #9
/*     */       //   178: astore #15
/*     */       //   180: iconst_0
/*     */       //   181: istore #16
/*     */       //   183: aload #15
/*     */       //   185: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$Request.Companion : Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$Request$Companion;
/*     */       //   188: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */       //   191: checkcast kotlinx/serialization/SerializationStrategy
/*     */       //   194: aload_1
/*     */       //   195: invokevirtual string : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
/*     */       //   198: aload #13
/*     */       //   200: iconst_0
/*     */       //   201: aload #22
/*     */       //   203: aload #22
/*     */       //   205: aload #6
/*     */       //   207: putfield L$0 : Ljava/lang/Object;
/*     */       //   210: aload #22
/*     */       //   212: aload #9
/*     */       //   214: putfield L$1 : Ljava/lang/Object;
/*     */       //   217: aload #22
/*     */       //   219: iconst_1
/*     */       //   220: putfield label : I
/*     */       //   223: invokeinterface receiveContinuousSSE : (Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   228: dup
/*     */       //   229: aload #23
/*     */       //   231: if_acmpne -> 270
/*     */       //   234: aload #23
/*     */       //   236: areturn
/*     */       //   237: iconst_0
/*     */       //   238: istore #10
/*     */       //   240: iconst_0
/*     */       //   241: istore #14
/*     */       //   243: aload #22
/*     */       //   245: getfield L$1 : Ljava/lang/Object;
/*     */       //   248: checkcast ai/grazie/utils/json/JSON
/*     */       //   251: astore #9
/*     */       //   253: aload #22
/*     */       //   255: getfield L$0 : Ljava/lang/Object;
/*     */       //   258: checkcast kotlinx/serialization/KSerializer
/*     */       //   261: astore #6
/*     */       //   263: aload #21
/*     */       //   265: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   268: aload #21
/*     */       //   270: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   273: astore #15
/*     */       //   275: iconst_0
/*     */       //   276: istore #16
/*     */       //   278: aload #15
/*     */       //   280: astore #17
/*     */       //   282: iconst_0
/*     */       //   283: istore #18
/*     */       //   285: iconst_0
/*     */       //   286: istore #19
/*     */       //   288: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$chat$$inlined$receiveContinuousSSE$default$1
/*     */       //   291: dup
/*     */       //   292: aload #17
/*     */       //   294: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*     */       //   297: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   300: nop
/*     */       //   301: nop
/*     */       //   302: invokestatic filterNotNull : (Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;
/*     */       //   305: astore #15
/*     */       //   307: iconst_0
/*     */       //   308: istore #16
/*     */       //   310: aload #15
/*     */       //   312: astore #17
/*     */       //   314: iconst_0
/*     */       //   315: istore #18
/*     */       //   317: iconst_0
/*     */       //   318: istore #19
/*     */       //   320: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$chat$$inlined$receiveContinuousSSE$default$2
/*     */       //   323: dup
/*     */       //   324: aload #17
/*     */       //   326: aload #6
/*     */       //   328: aload #9
/*     */       //   330: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lkotlinx/serialization/KSerializer;Lai/grazie/utils/json/JSON;)V
/*     */       //   333: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   336: nop
/*     */       //   337: nop
/*     */       //   338: astore #15
/*     */       //   340: getstatic ai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent.Companion : Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;
/*     */       //   343: astore #16
/*     */       //   345: iconst_0
/*     */       //   346: istore #17
/*     */       //   348: aload #15
/*     */       //   350: astore #18
/*     */       //   352: iconst_0
/*     */       //   353: istore #19
/*     */       //   355: iconst_0
/*     */       //   356: istore #20
/*     */       //   358: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$chat$$inlined$receiveContinuousSSE$default$3
/*     */       //   361: dup
/*     */       //   362: aload #18
/*     */       //   364: aload #16
/*     */       //   366: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;)V
/*     */       //   369: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   372: nop
/*     */       //   373: nop
/*     */       //   374: nop
/*     */       //   375: nop
/*     */       //   376: astore_3
/*     */       //   377: aload_3
/*     */       //   378: astore #4
/*     */       //   380: iconst_0
/*     */       //   381: istore #5
/*     */       //   383: aload #4
/*     */       //   385: astore #6
/*     */       //   387: iconst_0
/*     */       //   388: istore #7
/*     */       //   390: iconst_0
/*     */       //   391: istore #8
/*     */       //   393: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$chat$$inlined$map$1
/*     */       //   396: dup
/*     */       //   397: aload #6
/*     */       //   399: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*     */       //   402: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   405: nop
/*     */       //   406: nop
/*     */       //   407: areturn
/*     */       //   408: new java/lang/IllegalStateException
/*     */       //   411: dup
/*     */       //   412: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   414: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   417: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #233	-> 60
/*     */       //   #234	-> 93
/*     */       //   #430	-> 110
/*     */       //   #433	-> 110
/*     */       //   #430	-> 118
/*     */       //   #434	-> 118
/*     */       //   #430	-> 121
/*     */       //   #435	-> 121
/*     */       //   #430	-> 134
/*     */       //   #436	-> 134
/*     */       //   #430	-> 141
/*     */       //   #437	-> 144
/*     */       //   #438	-> 172
/*     */       //   #439	-> 183
/*     */       //   #438	-> 198
/*     */       //   #233	-> 234
/*     */       //   #440	-> 275
/*     */       //   #441	-> 278
/*     */       //   #442	-> 285
/*     */       //   #443	-> 288
/*     */       //   #444	-> 300
/*     */       //   #445	-> 301
/*     */       //   #446	-> 302
/*     */       //   #447	-> 307
/*     */       //   #441	-> 310
/*     */       //   #442	-> 317
/*     */       //   #443	-> 320
/*     */       //   #444	-> 336
/*     */       //   #445	-> 337
/*     */       //   #448	-> 340
/*     */       //   #441	-> 348
/*     */       //   #442	-> 355
/*     */       //   #443	-> 358
/*     */       //   #444	-> 372
/*     */       //   #445	-> 373
/*     */       //   #438	-> 374
/*     */       //   #437	-> 375
/*     */       //   #234	-> 376
/*     */       //   #235	-> 377
/*     */       //   #236	-> 380
/*     */       //   #449	-> 383
/*     */       //   #450	-> 390
/*     */       //   #451	-> 393
/*     */       //   #452	-> 405
/*     */       //   #453	-> 406
/*     */       //   #235	-> 407
/*     */       //   #233	-> 408
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   93	17	0	this	Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6;
/*     */       //   93	105	1	request	Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$Request;
/*     */       //   377	31	3	result	Lkotlinx/coroutines/flow/Flow;
/*     */       //   110	59	4	$this$iv	Lai/grazie/client/common/cloud/SuspendableCloudClient;
/*     */       //   380	27	4	$this$map$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   110	59	5	api$iv	Lai/grazie/model/cloud/API;
/*     */       //   118	119	6	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */       //   263	113	6	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */       //   387	19	6	$this$unsafeTransform$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   121	79	7	reconnect$iv	Z
/*     */       //   134	35	8	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */       //   141	96	9	json$iv	Lai/grazie/utils/json/JSON;
/*     */       //   253	123	9	json$iv	Lai/grazie/utils/json/JSON;
/*     */       //   169	11	11	$this$receiveContinuousSSE$iv$iv	Lai/grazie/client/common/SuspendableHTTPClient;
/*     */       //   169	11	12	url$iv$iv	Ljava/lang/String;
/*     */       //   169	31	13	options$iv$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */       //   180	18	15	this_$iv$iv$iv	Lai/grazie/utils/json/JSON;
/*     */       //   275	27	15	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   307	31	15	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   340	34	15	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   282	19	17	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   314	23	17	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   352	21	18	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   183	15	16	$i$f$string	I
/*     */       //   288	12	19	$i$f$unsafeFlow	I
/*     */       //   285	16	18	$i$f$unsafeTransform	I
/*     */       //   278	24	16	$i$f$map	I
/*     */       //   320	16	19	$i$f$unsafeFlow	I
/*     */       //   317	20	18	$i$f$unsafeTransform	I
/*     */       //   310	28	16	$i$f$map	I
/*     */       //   358	14	20	$i$f$unsafeFlow	I
/*     */       //   355	18	19	$i$f$unsafeTransform	I
/*     */       //   348	26	17	$i$f$map	I
/*     */       //   172	65	14	$i$f$receiveContinuousSSE	I
/*     */       //   144	93	10	$i$f$receiveContinuousSSE	I
/*     */       //   393	12	8	$i$f$unsafeFlow	I
/*     */       //   390	16	7	$i$f$unsafeTransform	I
/*     */       //   383	24	5	$i$f$map	I
/*     */       //   0	418	2	$completion	Lkotlin/coroutines/Continuation;
/*     */       //   50	358	22	$continuation	Lkotlin/coroutines/Continuation;
/*     */       //   57	351	21	$result	Ljava/lang/Object;
/*     */       //   243	132	14	$i$f$receiveContinuousSSE	I
/*     */       //   240	136	10	$i$f$receiveContinuousSSE	I }
/*     */     @Nullable
/*     */     public final Object complete(@NotNull LLMPromptID prompt, @NotNull LLMProfileID profile, @NotNull String prefix, @NotNull String suffix, @Nullable Attributes parameters, @NotNull Continuation $completion) { // Byte code:
/*     */       //   0: aload #6
/*     */       //   2: instanceof ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$complete$1
/*     */       //   5: ifeq -> 41
/*     */       //   8: aload #6
/*     */       //   10: checkcast ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$complete$1
/*     */       //   13: astore #27
/*     */       //   15: aload #27
/*     */       //   17: getfield label : I
/*     */       //   20: ldc -2147483648
/*     */       //   22: iand
/*     */       //   23: ifeq -> 41
/*     */       //   26: aload #27
/*     */       //   28: dup
/*     */       //   29: getfield label : I
/*     */       //   32: ldc -2147483648
/*     */       //   34: isub
/*     */       //   35: putfield label : I
/*     */       //   38: goto -> 53
/*     */       //   41: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$complete$1
/*     */       //   44: dup
/*     */       //   45: aload_0
/*     */       //   46: aload #6
/*     */       //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6;Lkotlin/coroutines/Continuation;)V
/*     */       //   51: astore #27
/*     */       //   53: aload #27
/*     */       //   55: getfield result : Ljava/lang/Object;
/*     */       //   58: astore #26
/*     */       //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   63: astore #28
/*     */       //   65: aload #27
/*     */       //   67: getfield label : I
/*     */       //   70: tableswitch default -> 431, 0 -> 92, 1 -> 258
/*     */       //   92: aload #26
/*     */       //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   97: aload_0
/*     */       //   98: getfield this$0 : Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;
/*     */       //   101: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*     */       //   104: astore #8
/*     */       //   106: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V6.INSTANCE : Lai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V6;
/*     */       //   109: checkcast ai/grazie/model/cloud/API
/*     */       //   112: astore #9
/*     */       //   114: new ai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V6$Request
/*     */       //   117: dup
/*     */       //   118: aload_1
/*     */       //   119: aload_3
/*     */       //   120: aload #4
/*     */       //   122: aload_2
/*     */       //   123: aload #5
/*     */       //   125: invokespecial <init> : (Lai/grazie/model/llm/prompt/LLMPromptID;Ljava/lang/String;Ljava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/utils/attributes/Attributes;)V
/*     */       //   128: astore #10
/*     */       //   130: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V6$LLMData.Companion : Lai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V6$LLMData$Companion;
/*     */       //   133: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */       //   136: astore #11
/*     */       //   138: iconst_0
/*     */       //   139: istore #12
/*     */       //   141: new ai/grazie/client/common/model/RequestOptions
/*     */       //   144: dup
/*     */       //   145: aconst_null
/*     */       //   146: aconst_null
/*     */       //   147: iconst_3
/*     */       //   148: aconst_null
/*     */       //   149: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */       //   152: astore #13
/*     */       //   154: aload #8
/*     */       //   156: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*     */       //   159: astore #14
/*     */       //   161: iconst_0
/*     */       //   162: istore #15
/*     */       //   164: aload #8
/*     */       //   166: invokevirtual getHttpClient : ()Lai/grazie/client/common/SuspendableHTTPClient;
/*     */       //   169: astore #16
/*     */       //   171: aload #8
/*     */       //   173: aload #9
/*     */       //   175: invokevirtual url : (Lai/grazie/model/cloud/API;)Ljava/lang/String;
/*     */       //   178: astore #17
/*     */       //   180: aload #13
/*     */       //   182: aload #9
/*     */       //   184: invokestatic withTimeout : (Lai/grazie/client/common/model/RequestOptions;Lai/grazie/model/cloud/API;)Lai/grazie/client/common/model/RequestOptions;
/*     */       //   187: astore #18
/*     */       //   189: iconst_0
/*     */       //   190: istore #19
/*     */       //   192: aload #16
/*     */       //   194: aload #17
/*     */       //   196: aload #14
/*     */       //   198: astore #20
/*     */       //   200: iconst_0
/*     */       //   201: istore #21
/*     */       //   203: aload #20
/*     */       //   205: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V6$Request.Companion : Lai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V6$Request$Companion;
/*     */       //   208: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */       //   211: checkcast kotlinx/serialization/SerializationStrategy
/*     */       //   214: aload #10
/*     */       //   216: invokevirtual string : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
/*     */       //   219: aload #18
/*     */       //   221: iconst_0
/*     */       //   222: aload #27
/*     */       //   224: aload #27
/*     */       //   226: aload #11
/*     */       //   228: putfield L$0 : Ljava/lang/Object;
/*     */       //   231: aload #27
/*     */       //   233: aload #14
/*     */       //   235: putfield L$1 : Ljava/lang/Object;
/*     */       //   238: aload #27
/*     */       //   240: iconst_1
/*     */       //   241: putfield label : I
/*     */       //   244: invokeinterface receiveContinuousSSE : (Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   249: dup
/*     */       //   250: aload #28
/*     */       //   252: if_acmpne -> 291
/*     */       //   255: aload #28
/*     */       //   257: areturn
/*     */       //   258: iconst_0
/*     */       //   259: istore #15
/*     */       //   261: iconst_0
/*     */       //   262: istore #19
/*     */       //   264: aload #27
/*     */       //   266: getfield L$1 : Ljava/lang/Object;
/*     */       //   269: checkcast ai/grazie/utils/json/JSON
/*     */       //   272: astore #14
/*     */       //   274: aload #27
/*     */       //   276: getfield L$0 : Ljava/lang/Object;
/*     */       //   279: checkcast kotlinx/serialization/KSerializer
/*     */       //   282: astore #11
/*     */       //   284: aload #26
/*     */       //   286: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   289: aload #26
/*     */       //   291: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   294: astore #20
/*     */       //   296: iconst_0
/*     */       //   297: istore #21
/*     */       //   299: aload #20
/*     */       //   301: astore #22
/*     */       //   303: iconst_0
/*     */       //   304: istore #23
/*     */       //   306: iconst_0
/*     */       //   307: istore #24
/*     */       //   309: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$complete$$inlined$receiveContinuousSSE$default$1
/*     */       //   312: dup
/*     */       //   313: aload #22
/*     */       //   315: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*     */       //   318: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   321: nop
/*     */       //   322: nop
/*     */       //   323: invokestatic filterNotNull : (Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;
/*     */       //   326: astore #20
/*     */       //   328: iconst_0
/*     */       //   329: istore #21
/*     */       //   331: aload #20
/*     */       //   333: astore #22
/*     */       //   335: iconst_0
/*     */       //   336: istore #23
/*     */       //   338: iconst_0
/*     */       //   339: istore #24
/*     */       //   341: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$complete$$inlined$receiveContinuousSSE$default$2
/*     */       //   344: dup
/*     */       //   345: aload #22
/*     */       //   347: aload #11
/*     */       //   349: aload #14
/*     */       //   351: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lkotlinx/serialization/KSerializer;Lai/grazie/utils/json/JSON;)V
/*     */       //   354: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   357: nop
/*     */       //   358: nop
/*     */       //   359: astore #20
/*     */       //   361: getstatic ai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent.Companion : Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;
/*     */       //   364: astore #21
/*     */       //   366: iconst_0
/*     */       //   367: istore #22
/*     */       //   369: aload #20
/*     */       //   371: astore #23
/*     */       //   373: iconst_0
/*     */       //   374: istore #24
/*     */       //   376: iconst_0
/*     */       //   377: istore #25
/*     */       //   379: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$complete$$inlined$receiveContinuousSSE$default$3
/*     */       //   382: dup
/*     */       //   383: aload #23
/*     */       //   385: aload #21
/*     */       //   387: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;)V
/*     */       //   390: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   393: nop
/*     */       //   394: nop
/*     */       //   395: nop
/*     */       //   396: nop
/*     */       //   397: astore #7
/*     */       //   399: aload #7
/*     */       //   401: astore #8
/*     */       //   403: iconst_0
/*     */       //   404: istore #9
/*     */       //   406: aload #8
/*     */       //   408: astore #10
/*     */       //   410: iconst_0
/*     */       //   411: istore #11
/*     */       //   413: iconst_0
/*     */       //   414: istore #12
/*     */       //   416: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6$complete$$inlined$map$1
/*     */       //   419: dup
/*     */       //   420: aload #10
/*     */       //   422: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*     */       //   425: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   428: nop
/*     */       //   429: nop
/*     */       //   430: areturn
/*     */       //   431: new java/lang/IllegalStateException
/*     */       //   434: dup
/*     */       //   435: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   437: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   440: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #245	-> 63
/*     */       //   #247	-> 97
/*     */       //   #454	-> 130
/*     */       //   #457	-> 130
/*     */       //   #454	-> 138
/*     */       //   #458	-> 138
/*     */       //   #454	-> 141
/*     */       //   #459	-> 141
/*     */       //   #454	-> 154
/*     */       //   #460	-> 154
/*     */       //   #454	-> 161
/*     */       //   #461	-> 164
/*     */       //   #462	-> 192
/*     */       //   #463	-> 203
/*     */       //   #462	-> 219
/*     */       //   #245	-> 255
/*     */       //   #464	-> 296
/*     */       //   #465	-> 299
/*     */       //   #466	-> 306
/*     */       //   #467	-> 309
/*     */       //   #468	-> 321
/*     */       //   #469	-> 322
/*     */       //   #470	-> 323
/*     */       //   #471	-> 328
/*     */       //   #465	-> 331
/*     */       //   #466	-> 338
/*     */       //   #467	-> 341
/*     */       //   #468	-> 357
/*     */       //   #469	-> 358
/*     */       //   #472	-> 361
/*     */       //   #465	-> 369
/*     */       //   #466	-> 376
/*     */       //   #467	-> 379
/*     */       //   #468	-> 393
/*     */       //   #469	-> 394
/*     */       //   #462	-> 395
/*     */       //   #461	-> 396
/*     */       //   #247	-> 397
/*     */       //   #246	-> 397
/*     */       //   #248	-> 399
/*     */       //   #473	-> 406
/*     */       //   #474	-> 413
/*     */       //   #475	-> 416
/*     */       //   #476	-> 428
/*     */       //   #477	-> 429
/*     */       //   #248	-> 430
/*     */       //   #245	-> 431
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   97	33	0	this	Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V6;
/*     */       //   97	33	1	prompt	Lai/grazie/model/llm/prompt/LLMPromptID;
/*     */       //   97	33	2	profile	Lai/grazie/model/llm/profile/LLMProfileID;
/*     */       //   97	33	3	prefix	Ljava/lang/String;
/*     */       //   97	33	4	suffix	Ljava/lang/String;
/*     */       //   97	33	5	parameters	Lai/grazie/utils/attributes/Attributes;
/*     */       //   399	32	7	result	Lkotlinx/coroutines/flow/Flow;
/*     */       //   130	59	8	$this$iv	Lai/grazie/client/common/cloud/SuspendableCloudClient;
/*     */       //   403	27	8	$this$map$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   130	59	9	api$iv	Lai/grazie/model/cloud/API;
/*     */       //   130	89	10	content$iv	Ljava/lang/Object;
/*     */       //   410	19	10	$this$unsafeTransform$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   138	120	11	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */       //   284	113	11	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */       //   141	80	12	reconnect$iv	Z
/*     */       //   154	35	13	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */       //   161	97	14	json$iv	Lai/grazie/utils/json/JSON;
/*     */       //   274	123	14	json$iv	Lai/grazie/utils/json/JSON;
/*     */       //   189	11	16	$this$receiveContinuousSSE$iv$iv	Lai/grazie/client/common/SuspendableHTTPClient;
/*     */       //   189	11	17	url$iv$iv	Ljava/lang/String;
/*     */       //   189	32	18	options$iv$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */       //   200	19	20	this_$iv$iv$iv	Lai/grazie/utils/json/JSON;
/*     */       //   296	27	20	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   328	31	20	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   361	34	20	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   303	19	22	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   335	23	22	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   373	21	23	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   203	16	21	$i$f$string	I
/*     */       //   309	12	24	$i$f$unsafeFlow	I
/*     */       //   306	16	23	$i$f$unsafeTransform	I
/*     */       //   299	24	21	$i$f$map	I
/*     */       //   341	16	24	$i$f$unsafeFlow	I
/*     */       //   338	20	23	$i$f$unsafeTransform	I
/*     */       //   331	28	21	$i$f$map	I
/*     */       //   379	14	25	$i$f$unsafeFlow	I
/*     */       //   376	18	24	$i$f$unsafeTransform	I
/*     */       //   369	26	22	$i$f$map	I
/*     */       //   192	66	19	$i$f$receiveContinuousSSE	I
/*     */       //   164	94	15	$i$f$receiveContinuousSSE	I
/*     */       //   416	12	12	$i$f$unsafeFlow	I
/*     */       //   413	16	11	$i$f$unsafeTransform	I
/*     */       //   406	24	9	$i$f$map	I
/*     */       //   0	441	6	$completion	Lkotlin/coroutines/Continuation;
/*     */       //   53	378	27	$continuation	Lkotlin/coroutines/Continuation;
/*     */       //   60	371	26	$result	Ljava/lang/Object;
/*     */       //   264	132	19	$i$f$receiveContinuousSSE	I
/*     */       //   261	136	15	$i$f$receiveContinuousSSE	I }
/*     */     @DebugMetadata(f = "LlmAPIClient.kt", l = {438}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"serializer$iv", "json$iv"}, m = "chat", c = "ai.grazie.api.gateway.client.api.llm.LlmAPIClient$V6")
/*     */     @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */     static final class LlmAPIClient$V6$chat$3 extends ContinuationImpl {
/*     */       Object L$0; Object L$1; int label; LlmAPIClient$V6$chat$3(Continuation $completion) { super($completion); } @Nullable
/*     */       public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return LlmAPIClient.V6.this.chat((LlmAPI.Chat.Stream.V6.Request)null, (Continuation)this); } } @Nullable
/* 230 */     public final Object chat(@NotNull Function1 builder, @NotNull Continuation<? super Flow<? extends LLMStreamData>> $completion) { ChatRequestBuilder chatRequestBuilder = new ChatRequestBuilder(); builder.invoke(chatRequestBuilder); return chat(chatRequestBuilder.buildV6(), $completion); }
/*     */ 
/*     */     
/*     */     @DebugMetadata(f = "LlmAPIClient.kt", l = {438}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"serializer$iv", "json$iv"}, m = "complete", c = "ai.grazie.api.gateway.client.api.llm.LlmAPIClient$V6")
/*     */     @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */     static final class LlmAPIClient$V6$complete$1
/*     */       extends ContinuationImpl
/*     */     {
/*     */       Object L$0;
/*     */       Object L$1;
/*     */       int label;
/*     */       
/*     */       LlmAPIClient$V6$complete$1(Continuation $completion) {
/*     */         super($completion);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Object invokeSuspend(@NotNull Object $result) {
/*     */         this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return LlmAPIClient.V6.this.complete(null, null, null, null, null, (Continuation<? super Flow<? extends LLMStreamData>>)this);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @Deprecated(message = "Use v7 instead", replaceWith = @ReplaceWith(expression = "v7()", imports = {}))
/*     */   @NotNull
/*     */   public final V6 v6() {
/* 258 */     return new V6();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\b\004\030\0002\0020\001B\005¢\006\002\020\002J\034\020\003\032\b\022\004\022\0020\0050\0042\006\020\006\032\0020\007H@¢\006\002\020\bJ-\020\003\032\b\022\004\022\0020\0050\0042\027\020\t\032\023\022\004\022\0020\013\022\004\022\0020\f0\n¢\006\002\b\rH@¢\006\002\020\016J6\020\003\032\b\022\004\022\0020\0050\0042\006\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\003\032\0020\0232\b\b\002\020\024\032\0020\025H@¢\006\002\020\026J@\020\027\032\b\022\004\022\0020\0050\0042\006\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\030\032\0020\0312\006\020\032\032\0020\0312\n\b\002\020\024\032\004\030\0010\025H@¢\006\002\020\033¨\006\034"}, d2 = {"Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7;", "", "(Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;)V", "chat", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/model/llm/data/stream/LLMStreamData;", "request", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$Request;", "(Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "builder", "Lkotlin/Function1;", "Lai/grazie/api/gateway/client/api/llm/ChatRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prompt", "Lai/grazie/model/llm/prompt/LLMPromptID;", "profile", "Lai/grazie/model/llm/profile/LLMProfileID;", "Lai/grazie/model/llm/chat/v5/LLMChat;", "parameters", "Lai/grazie/utils/attributes/Attributes;", "(Lai/grazie/model/llm/prompt/LLMPromptID;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/model/llm/chat/v5/LLMChat;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "complete", "prefix", "", "suffix", "(Lai/grazie/model/llm/prompt/LLMPromptID;Lai/grazie/model/llm/profile/LLMProfileID;Ljava/lang/String;Ljava/lang/String;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*     */   @SourceDebugExtension({"SMAP\nLlmAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LlmAPIClient.kt\nai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 SuspendableClientExtensions.kt\nai/grazie/client/common/extensions/SuspendableClientExtensionsKt\n+ 4 JSON.kt\nai/grazie/utils/json/JSON\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,429:1\n86#2,8:430\n86#2,8:454\n101#3:438\n102#3:440\n103#3,3:446\n101#3:462\n102#3:464\n103#3,3:470\n28#4:439\n28#4:463\n49#5:441\n51#5:445\n49#5:449\n51#5:453\n49#5:465\n51#5:469\n49#5:473\n51#5:477\n46#6:442\n51#6:444\n46#6:450\n51#6:452\n46#6:466\n51#6:468\n46#6:474\n51#6:476\n105#7:443\n105#7:451\n105#7:467\n105#7:475\n*S KotlinDebug\n*F\n+ 1 LlmAPIClient.kt\nai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7\n*L\n347#1:430,8\n362#1:454,8\n347#1:438\n347#1:440\n347#1:446,3\n362#1:462\n362#1:464\n362#1:470,3\n347#1:439\n362#1:463\n347#1:441\n347#1:445\n348#1:449\n348#1:453\n362#1:465\n362#1:469\n363#1:473\n363#1:477\n347#1:442\n347#1:444\n348#1:450\n348#1:452\n362#1:466\n362#1:468\n363#1:474\n363#1:476\n347#1:443\n348#1:451\n362#1:467\n363#1:475\n*E\n"})
/*     */   public final class V7
/*     */   {
/*     */     @Nullable
/*     */     public final Object chat(@NotNull LLMPromptID prompt, @NotNull LLMProfileID profile, @NotNull LLMChat chat, @NotNull Attributes parameters, @NotNull Continuation<? super Flow<? extends LLMStreamData>> $completion) {
/* 331 */       return chat(new LlmAPI.Chat.Stream.V7.Request(prompt, profile, chat, parameters), $completion);
/*     */     }
/*     */     private final Object chat(LlmAPI.Chat.Stream.V7.Request request, Continuation $completion) {
/*     */       // Byte code:
/*     */       //   0: aload_2
/*     */       //   1: instanceof ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$chat$3
/*     */       //   4: ifeq -> 39
/*     */       //   7: aload_2
/*     */       //   8: checkcast ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$chat$3
/*     */       //   11: astore #22
/*     */       //   13: aload #22
/*     */       //   15: getfield label : I
/*     */       //   18: ldc -2147483648
/*     */       //   20: iand
/*     */       //   21: ifeq -> 39
/*     */       //   24: aload #22
/*     */       //   26: dup
/*     */       //   27: getfield label : I
/*     */       //   30: ldc -2147483648
/*     */       //   32: isub
/*     */       //   33: putfield label : I
/*     */       //   36: goto -> 50
/*     */       //   39: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$chat$3
/*     */       //   42: dup
/*     */       //   43: aload_0
/*     */       //   44: aload_2
/*     */       //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7;Lkotlin/coroutines/Continuation;)V
/*     */       //   48: astore #22
/*     */       //   50: aload #22
/*     */       //   52: getfield result : Ljava/lang/Object;
/*     */       //   55: astore #21
/*     */       //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   60: astore #23
/*     */       //   62: aload #22
/*     */       //   64: getfield label : I
/*     */       //   67: tableswitch default -> 408, 0 -> 88, 1 -> 237
/*     */       //   88: aload #21
/*     */       //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   93: aload_0
/*     */       //   94: getfield this$0 : Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;
/*     */       //   97: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*     */       //   100: astore #4
/*     */       //   102: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7.INSTANCE : Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7;
/*     */       //   105: checkcast ai/grazie/model/cloud/API
/*     */       //   108: astore #5
/*     */       //   110: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$LLMDataSerializer.INSTANCE : Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$LLMDataSerializer;
/*     */       //   113: checkcast kotlinx/serialization/KSerializer
/*     */       //   116: astore #6
/*     */       //   118: iconst_0
/*     */       //   119: istore #7
/*     */       //   121: new ai/grazie/client/common/model/RequestOptions
/*     */       //   124: dup
/*     */       //   125: aconst_null
/*     */       //   126: aconst_null
/*     */       //   127: iconst_3
/*     */       //   128: aconst_null
/*     */       //   129: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */       //   132: astore #8
/*     */       //   134: aload #4
/*     */       //   136: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*     */       //   139: astore #9
/*     */       //   141: iconst_0
/*     */       //   142: istore #10
/*     */       //   144: aload #4
/*     */       //   146: invokevirtual getHttpClient : ()Lai/grazie/client/common/SuspendableHTTPClient;
/*     */       //   149: astore #11
/*     */       //   151: aload #4
/*     */       //   153: aload #5
/*     */       //   155: invokevirtual url : (Lai/grazie/model/cloud/API;)Ljava/lang/String;
/*     */       //   158: astore #12
/*     */       //   160: aload #8
/*     */       //   162: aload #5
/*     */       //   164: invokestatic withTimeout : (Lai/grazie/client/common/model/RequestOptions;Lai/grazie/model/cloud/API;)Lai/grazie/client/common/model/RequestOptions;
/*     */       //   167: astore #13
/*     */       //   169: iconst_0
/*     */       //   170: istore #14
/*     */       //   172: aload #11
/*     */       //   174: aload #12
/*     */       //   176: aload #9
/*     */       //   178: astore #15
/*     */       //   180: iconst_0
/*     */       //   181: istore #16
/*     */       //   183: aload #15
/*     */       //   185: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$Request.Companion : Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$Request$Companion;
/*     */       //   188: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */       //   191: checkcast kotlinx/serialization/SerializationStrategy
/*     */       //   194: aload_1
/*     */       //   195: invokevirtual string : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
/*     */       //   198: aload #13
/*     */       //   200: iconst_0
/*     */       //   201: aload #22
/*     */       //   203: aload #22
/*     */       //   205: aload #6
/*     */       //   207: putfield L$0 : Ljava/lang/Object;
/*     */       //   210: aload #22
/*     */       //   212: aload #9
/*     */       //   214: putfield L$1 : Ljava/lang/Object;
/*     */       //   217: aload #22
/*     */       //   219: iconst_1
/*     */       //   220: putfield label : I
/*     */       //   223: invokeinterface receiveContinuousSSE : (Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   228: dup
/*     */       //   229: aload #23
/*     */       //   231: if_acmpne -> 270
/*     */       //   234: aload #23
/*     */       //   236: areturn
/*     */       //   237: iconst_0
/*     */       //   238: istore #10
/*     */       //   240: iconst_0
/*     */       //   241: istore #14
/*     */       //   243: aload #22
/*     */       //   245: getfield L$1 : Ljava/lang/Object;
/*     */       //   248: checkcast ai/grazie/utils/json/JSON
/*     */       //   251: astore #9
/*     */       //   253: aload #22
/*     */       //   255: getfield L$0 : Ljava/lang/Object;
/*     */       //   258: checkcast kotlinx/serialization/KSerializer
/*     */       //   261: astore #6
/*     */       //   263: aload #21
/*     */       //   265: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   268: aload #21
/*     */       //   270: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   273: astore #15
/*     */       //   275: iconst_0
/*     */       //   276: istore #16
/*     */       //   278: aload #15
/*     */       //   280: astore #17
/*     */       //   282: iconst_0
/*     */       //   283: istore #18
/*     */       //   285: iconst_0
/*     */       //   286: istore #19
/*     */       //   288: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$chat$$inlined$receiveContinuousSSEV2$default$1
/*     */       //   291: dup
/*     */       //   292: aload #17
/*     */       //   294: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*     */       //   297: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   300: nop
/*     */       //   301: nop
/*     */       //   302: invokestatic filterNotNull : (Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;
/*     */       //   305: astore #15
/*     */       //   307: iconst_0
/*     */       //   308: istore #16
/*     */       //   310: aload #15
/*     */       //   312: astore #17
/*     */       //   314: iconst_0
/*     */       //   315: istore #18
/*     */       //   317: iconst_0
/*     */       //   318: istore #19
/*     */       //   320: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$chat$$inlined$receiveContinuousSSEV2$default$2
/*     */       //   323: dup
/*     */       //   324: aload #17
/*     */       //   326: aload #6
/*     */       //   328: aload #9
/*     */       //   330: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lkotlinx/serialization/KSerializer;Lai/grazie/utils/json/JSON;)V
/*     */       //   333: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   336: nop
/*     */       //   337: nop
/*     */       //   338: astore #15
/*     */       //   340: getstatic ai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent.Companion : Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;
/*     */       //   343: astore #16
/*     */       //   345: iconst_0
/*     */       //   346: istore #17
/*     */       //   348: aload #15
/*     */       //   350: astore #18
/*     */       //   352: iconst_0
/*     */       //   353: istore #19
/*     */       //   355: iconst_0
/*     */       //   356: istore #20
/*     */       //   358: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$chat$$inlined$receiveContinuousSSEV2$default$3
/*     */       //   361: dup
/*     */       //   362: aload #18
/*     */       //   364: aload #16
/*     */       //   366: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;)V
/*     */       //   369: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   372: nop
/*     */       //   373: nop
/*     */       //   374: nop
/*     */       //   375: nop
/*     */       //   376: astore_3
/*     */       //   377: aload_3
/*     */       //   378: astore #4
/*     */       //   380: iconst_0
/*     */       //   381: istore #5
/*     */       //   383: aload #4
/*     */       //   385: astore #6
/*     */       //   387: iconst_0
/*     */       //   388: istore #7
/*     */       //   390: iconst_0
/*     */       //   391: istore #8
/*     */       //   393: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$chat$$inlined$map$1
/*     */       //   396: dup
/*     */       //   397: aload #6
/*     */       //   399: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*     */       //   402: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   405: nop
/*     */       //   406: nop
/*     */       //   407: areturn
/*     */       //   408: new java/lang/IllegalStateException
/*     */       //   411: dup
/*     */       //   412: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   414: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   417: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #346	-> 60
/*     */       //   #347	-> 93
/*     */       //   #430	-> 118
/*     */       //   #434	-> 118
/*     */       //   #430	-> 121
/*     */       //   #435	-> 121
/*     */       //   #430	-> 134
/*     */       //   #436	-> 134
/*     */       //   #430	-> 141
/*     */       //   #437	-> 144
/*     */       //   #438	-> 172
/*     */       //   #439	-> 183
/*     */       //   #438	-> 198
/*     */       //   #346	-> 234
/*     */       //   #440	-> 275
/*     */       //   #441	-> 278
/*     */       //   #442	-> 285
/*     */       //   #443	-> 288
/*     */       //   #444	-> 300
/*     */       //   #445	-> 301
/*     */       //   #446	-> 302
/*     */       //   #447	-> 307
/*     */       //   #441	-> 310
/*     */       //   #442	-> 317
/*     */       //   #443	-> 320
/*     */       //   #444	-> 336
/*     */       //   #445	-> 337
/*     */       //   #448	-> 340
/*     */       //   #441	-> 348
/*     */       //   #442	-> 355
/*     */       //   #443	-> 358
/*     */       //   #444	-> 372
/*     */       //   #445	-> 373
/*     */       //   #438	-> 374
/*     */       //   #437	-> 375
/*     */       //   #347	-> 376
/*     */       //   #348	-> 377
/*     */       //   #449	-> 383
/*     */       //   #450	-> 390
/*     */       //   #451	-> 393
/*     */       //   #452	-> 405
/*     */       //   #453	-> 406
/*     */       //   #348	-> 407
/*     */       //   #346	-> 408
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   93	25	0	this	Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7;
/*     */       //   93	105	1	request	Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V7$Request;
/*     */       //   377	31	3	result	Lkotlinx/coroutines/flow/Flow;
/*     */       //   118	51	4	$this$iv	Lai/grazie/client/common/cloud/SuspendableCloudClient;
/*     */       //   380	27	4	$this$map$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   118	51	5	api$iv	Lai/grazie/model/cloud/API;
/*     */       //   118	119	6	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */       //   263	113	6	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */       //   387	19	6	$this$unsafeTransform$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   121	79	7	reconnect$iv	Z
/*     */       //   134	35	8	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */       //   141	96	9	json$iv	Lai/grazie/utils/json/JSON;
/*     */       //   253	123	9	json$iv	Lai/grazie/utils/json/JSON;
/*     */       //   169	11	11	$this$receiveContinuousSSEV2$iv$iv	Lai/grazie/client/common/SuspendableHTTPClient;
/*     */       //   169	11	12	url$iv$iv	Ljava/lang/String;
/*     */       //   169	31	13	options$iv$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */       //   180	18	15	this_$iv$iv$iv	Lai/grazie/utils/json/JSON;
/*     */       //   275	27	15	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   307	31	15	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   340	34	15	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   282	19	17	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   314	23	17	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   352	21	18	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   183	15	16	$i$f$string	I
/*     */       //   288	12	19	$i$f$unsafeFlow	I
/*     */       //   285	16	18	$i$f$unsafeTransform	I
/*     */       //   278	24	16	$i$f$map	I
/*     */       //   320	16	19	$i$f$unsafeFlow	I
/*     */       //   317	20	18	$i$f$unsafeTransform	I
/*     */       //   310	28	16	$i$f$map	I
/*     */       //   358	14	20	$i$f$unsafeFlow	I
/*     */       //   355	18	19	$i$f$unsafeTransform	I
/*     */       //   348	26	17	$i$f$map	I
/*     */       //   172	65	14	$i$f$receiveContinuousSSEV2	I
/*     */       //   144	93	10	$i$f$receiveContinuousSSEV2	I
/*     */       //   393	12	8	$i$f$unsafeFlow	I
/*     */       //   390	16	7	$i$f$unsafeTransform	I
/*     */       //   383	24	5	$i$f$map	I
/*     */       //   0	418	2	$completion	Lkotlin/coroutines/Continuation;
/*     */       //   50	358	22	$continuation	Lkotlin/coroutines/Continuation;
/*     */       //   57	351	21	$result	Ljava/lang/Object;
/*     */       //   243	132	14	$i$f$receiveContinuousSSEV2	I
/*     */       //   240	136	10	$i$f$receiveContinuousSSEV2	I
/*     */     }
/*     */     @Nullable
/*     */     public final Object complete(@NotNull LLMPromptID prompt, @NotNull LLMProfileID profile, @NotNull String prefix, @NotNull String suffix, @Nullable Attributes parameters, @NotNull Continuation $completion) {
/*     */       // Byte code:
/*     */       //   0: aload #6
/*     */       //   2: instanceof ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$complete$1
/*     */       //   5: ifeq -> 41
/*     */       //   8: aload #6
/*     */       //   10: checkcast ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$complete$1
/*     */       //   13: astore #27
/*     */       //   15: aload #27
/*     */       //   17: getfield label : I
/*     */       //   20: ldc -2147483648
/*     */       //   22: iand
/*     */       //   23: ifeq -> 41
/*     */       //   26: aload #27
/*     */       //   28: dup
/*     */       //   29: getfield label : I
/*     */       //   32: ldc -2147483648
/*     */       //   34: isub
/*     */       //   35: putfield label : I
/*     */       //   38: goto -> 53
/*     */       //   41: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$complete$1
/*     */       //   44: dup
/*     */       //   45: aload_0
/*     */       //   46: aload #6
/*     */       //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7;Lkotlin/coroutines/Continuation;)V
/*     */       //   51: astore #27
/*     */       //   53: aload #27
/*     */       //   55: getfield result : Ljava/lang/Object;
/*     */       //   58: astore #26
/*     */       //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   63: astore #28
/*     */       //   65: aload #27
/*     */       //   67: getfield label : I
/*     */       //   70: tableswitch default -> 431, 0 -> 92, 1 -> 258
/*     */       //   92: aload #26
/*     */       //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   97: new ai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V7$Request
/*     */       //   100: dup
/*     */       //   101: aload_1
/*     */       //   102: aload_3
/*     */       //   103: aload #4
/*     */       //   105: aload_2
/*     */       //   106: aload #5
/*     */       //   108: invokespecial <init> : (Lai/grazie/model/llm/prompt/LLMPromptID;Ljava/lang/String;Ljava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/utils/attributes/Attributes;)V
/*     */       //   111: astore #7
/*     */       //   113: aload_0
/*     */       //   114: getfield this$0 : Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;
/*     */       //   117: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*     */       //   120: astore #9
/*     */       //   122: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V7.INSTANCE : Lai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V7;
/*     */       //   125: checkcast ai/grazie/model/cloud/API
/*     */       //   128: astore #10
/*     */       //   130: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V7$LLMDataSerializer.INSTANCE : Lai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V7$LLMDataSerializer;
/*     */       //   133: checkcast kotlinx/serialization/KSerializer
/*     */       //   136: astore #11
/*     */       //   138: iconst_0
/*     */       //   139: istore #12
/*     */       //   141: new ai/grazie/client/common/model/RequestOptions
/*     */       //   144: dup
/*     */       //   145: aconst_null
/*     */       //   146: aconst_null
/*     */       //   147: iconst_3
/*     */       //   148: aconst_null
/*     */       //   149: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */       //   152: astore #13
/*     */       //   154: aload #9
/*     */       //   156: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*     */       //   159: astore #14
/*     */       //   161: iconst_0
/*     */       //   162: istore #15
/*     */       //   164: aload #9
/*     */       //   166: invokevirtual getHttpClient : ()Lai/grazie/client/common/SuspendableHTTPClient;
/*     */       //   169: astore #16
/*     */       //   171: aload #9
/*     */       //   173: aload #10
/*     */       //   175: invokevirtual url : (Lai/grazie/model/cloud/API;)Ljava/lang/String;
/*     */       //   178: astore #17
/*     */       //   180: aload #13
/*     */       //   182: aload #10
/*     */       //   184: invokestatic withTimeout : (Lai/grazie/client/common/model/RequestOptions;Lai/grazie/model/cloud/API;)Lai/grazie/client/common/model/RequestOptions;
/*     */       //   187: astore #18
/*     */       //   189: iconst_0
/*     */       //   190: istore #19
/*     */       //   192: aload #16
/*     */       //   194: aload #17
/*     */       //   196: aload #14
/*     */       //   198: astore #20
/*     */       //   200: iconst_0
/*     */       //   201: istore #21
/*     */       //   203: aload #20
/*     */       //   205: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V7$Request.Companion : Lai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V7$Request$Companion;
/*     */       //   208: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */       //   211: checkcast kotlinx/serialization/SerializationStrategy
/*     */       //   214: aload #7
/*     */       //   216: invokevirtual string : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
/*     */       //   219: aload #18
/*     */       //   221: iconst_0
/*     */       //   222: aload #27
/*     */       //   224: aload #27
/*     */       //   226: aload #11
/*     */       //   228: putfield L$0 : Ljava/lang/Object;
/*     */       //   231: aload #27
/*     */       //   233: aload #14
/*     */       //   235: putfield L$1 : Ljava/lang/Object;
/*     */       //   238: aload #27
/*     */       //   240: iconst_1
/*     */       //   241: putfield label : I
/*     */       //   244: invokeinterface receiveContinuousSSE : (Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   249: dup
/*     */       //   250: aload #28
/*     */       //   252: if_acmpne -> 291
/*     */       //   255: aload #28
/*     */       //   257: areturn
/*     */       //   258: iconst_0
/*     */       //   259: istore #15
/*     */       //   261: iconst_0
/*     */       //   262: istore #19
/*     */       //   264: aload #27
/*     */       //   266: getfield L$1 : Ljava/lang/Object;
/*     */       //   269: checkcast ai/grazie/utils/json/JSON
/*     */       //   272: astore #14
/*     */       //   274: aload #27
/*     */       //   276: getfield L$0 : Ljava/lang/Object;
/*     */       //   279: checkcast kotlinx/serialization/KSerializer
/*     */       //   282: astore #11
/*     */       //   284: aload #26
/*     */       //   286: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   289: aload #26
/*     */       //   291: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   294: astore #20
/*     */       //   296: iconst_0
/*     */       //   297: istore #21
/*     */       //   299: aload #20
/*     */       //   301: astore #22
/*     */       //   303: iconst_0
/*     */       //   304: istore #23
/*     */       //   306: iconst_0
/*     */       //   307: istore #24
/*     */       //   309: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$complete$$inlined$receiveContinuousSSEV2$default$1
/*     */       //   312: dup
/*     */       //   313: aload #22
/*     */       //   315: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*     */       //   318: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   321: nop
/*     */       //   322: nop
/*     */       //   323: invokestatic filterNotNull : (Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;
/*     */       //   326: astore #20
/*     */       //   328: iconst_0
/*     */       //   329: istore #21
/*     */       //   331: aload #20
/*     */       //   333: astore #22
/*     */       //   335: iconst_0
/*     */       //   336: istore #23
/*     */       //   338: iconst_0
/*     */       //   339: istore #24
/*     */       //   341: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$complete$$inlined$receiveContinuousSSEV2$default$2
/*     */       //   344: dup
/*     */       //   345: aload #22
/*     */       //   347: aload #11
/*     */       //   349: aload #14
/*     */       //   351: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lkotlinx/serialization/KSerializer;Lai/grazie/utils/json/JSON;)V
/*     */       //   354: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   357: nop
/*     */       //   358: nop
/*     */       //   359: astore #20
/*     */       //   361: getstatic ai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent.Companion : Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;
/*     */       //   364: astore #21
/*     */       //   366: iconst_0
/*     */       //   367: istore #22
/*     */       //   369: aload #20
/*     */       //   371: astore #23
/*     */       //   373: iconst_0
/*     */       //   374: istore #24
/*     */       //   376: iconst_0
/*     */       //   377: istore #25
/*     */       //   379: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$complete$$inlined$receiveContinuousSSEV2$default$3
/*     */       //   382: dup
/*     */       //   383: aload #23
/*     */       //   385: aload #21
/*     */       //   387: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;)V
/*     */       //   390: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   393: nop
/*     */       //   394: nop
/*     */       //   395: nop
/*     */       //   396: nop
/*     */       //   397: astore #8
/*     */       //   399: aload #8
/*     */       //   401: astore #9
/*     */       //   403: iconst_0
/*     */       //   404: istore #10
/*     */       //   406: aload #9
/*     */       //   408: astore #11
/*     */       //   410: iconst_0
/*     */       //   411: istore #12
/*     */       //   413: iconst_0
/*     */       //   414: istore #13
/*     */       //   416: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7$complete$$inlined$map$1
/*     */       //   419: dup
/*     */       //   420: aload #11
/*     */       //   422: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*     */       //   425: checkcast kotlinx/coroutines/flow/Flow
/*     */       //   428: nop
/*     */       //   429: nop
/*     */       //   430: areturn
/*     */       //   431: new java/lang/IllegalStateException
/*     */       //   434: dup
/*     */       //   435: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   437: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   440: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #359	-> 63
/*     */       //   #360	-> 97
/*     */       //   #362	-> 113
/*     */       //   #454	-> 138
/*     */       //   #458	-> 138
/*     */       //   #454	-> 141
/*     */       //   #459	-> 141
/*     */       //   #454	-> 154
/*     */       //   #460	-> 154
/*     */       //   #454	-> 161
/*     */       //   #461	-> 164
/*     */       //   #462	-> 192
/*     */       //   #463	-> 203
/*     */       //   #462	-> 219
/*     */       //   #359	-> 255
/*     */       //   #464	-> 296
/*     */       //   #465	-> 299
/*     */       //   #466	-> 306
/*     */       //   #467	-> 309
/*     */       //   #468	-> 321
/*     */       //   #469	-> 322
/*     */       //   #470	-> 323
/*     */       //   #471	-> 328
/*     */       //   #465	-> 331
/*     */       //   #466	-> 338
/*     */       //   #467	-> 341
/*     */       //   #468	-> 357
/*     */       //   #469	-> 358
/*     */       //   #472	-> 361
/*     */       //   #465	-> 369
/*     */       //   #466	-> 376
/*     */       //   #467	-> 379
/*     */       //   #468	-> 393
/*     */       //   #469	-> 394
/*     */       //   #462	-> 395
/*     */       //   #461	-> 396
/*     */       //   #362	-> 397
/*     */       //   #361	-> 397
/*     */       //   #363	-> 399
/*     */       //   #473	-> 406
/*     */       //   #474	-> 413
/*     */       //   #475	-> 416
/*     */       //   #476	-> 428
/*     */       //   #477	-> 429
/*     */       //   #363	-> 430
/*     */       //   #359	-> 431
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   97	41	0	this	Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7;
/*     */       //   97	16	1	prompt	Lai/grazie/model/llm/prompt/LLMPromptID;
/*     */       //   97	16	2	profile	Lai/grazie/model/llm/profile/LLMProfileID;
/*     */       //   97	16	3	prefix	Ljava/lang/String;
/*     */       //   97	16	4	suffix	Ljava/lang/String;
/*     */       //   97	16	5	parameters	Lai/grazie/utils/attributes/Attributes;
/*     */       //   113	106	7	request	Lai/grazie/api/gateway/api/llm/LlmAPI$Complete$Stream$V7$Request;
/*     */       //   399	32	8	result	Lkotlinx/coroutines/flow/Flow;
/*     */       //   138	51	9	$this$iv	Lai/grazie/client/common/cloud/SuspendableCloudClient;
/*     */       //   403	27	9	$this$map$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   138	51	10	api$iv	Lai/grazie/model/cloud/API;
/*     */       //   138	120	11	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */       //   284	113	11	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */       //   410	19	11	$this$unsafeTransform$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   141	80	12	reconnect$iv	Z
/*     */       //   154	35	13	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */       //   161	97	14	json$iv	Lai/grazie/utils/json/JSON;
/*     */       //   274	123	14	json$iv	Lai/grazie/utils/json/JSON;
/*     */       //   189	11	16	$this$receiveContinuousSSEV2$iv$iv	Lai/grazie/client/common/SuspendableHTTPClient;
/*     */       //   189	11	17	url$iv$iv	Ljava/lang/String;
/*     */       //   189	32	18	options$iv$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */       //   200	19	20	this_$iv$iv$iv	Lai/grazie/utils/json/JSON;
/*     */       //   296	27	20	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   328	31	20	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   361	34	20	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   303	19	22	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   335	23	22	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   373	21	23	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */       //   203	16	21	$i$f$string	I
/*     */       //   309	12	24	$i$f$unsafeFlow	I
/*     */       //   306	16	23	$i$f$unsafeTransform	I
/*     */       //   299	24	21	$i$f$map	I
/*     */       //   341	16	24	$i$f$unsafeFlow	I
/*     */       //   338	20	23	$i$f$unsafeTransform	I
/*     */       //   331	28	21	$i$f$map	I
/*     */       //   379	14	25	$i$f$unsafeFlow	I
/*     */       //   376	18	24	$i$f$unsafeTransform	I
/*     */       //   369	26	22	$i$f$map	I
/*     */       //   192	66	19	$i$f$receiveContinuousSSEV2	I
/*     */       //   164	94	15	$i$f$receiveContinuousSSEV2	I
/*     */       //   416	12	13	$i$f$unsafeFlow	I
/*     */       //   413	16	12	$i$f$unsafeTransform	I
/*     */       //   406	24	10	$i$f$map	I
/*     */       //   0	441	6	$completion	Lkotlin/coroutines/Continuation;
/*     */       //   53	378	27	$continuation	Lkotlin/coroutines/Continuation;
/*     */       //   60	371	26	$result	Ljava/lang/Object;
/*     */       //   264	132	19	$i$f$receiveContinuousSSEV2	I
/*     */       //   261	136	15	$i$f$receiveContinuousSSEV2	I
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object chat(@NotNull Function1 builder, @NotNull Continuation<? super Flow<? extends LLMStreamData>> $completion) {
/* 343 */       ChatRequestBuilder chatRequestBuilder = new ChatRequestBuilder(); builder.invoke(chatRequestBuilder); return chat(chatRequestBuilder.buildV7(), $completion);
/*     */     }
/*     */     @DebugMetadata(f = "LlmAPIClient.kt", l = {438}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"serializer$iv", "json$iv"}, m = "chat", c = "ai.grazie.api.gateway.client.api.llm.LlmAPIClient$V7")
/*     */     @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */     static final class LlmAPIClient$V7$chat$3 extends ContinuationImpl { Object L$0; Object L$1; int label;
/*     */       LlmAPIClient$V7$chat$3(Continuation $completion) {
/*     */         super($completion);
/*     */       }
/*     */       @Nullable
/*     */       public final Object invokeSuspend(@NotNull Object $result) {
/*     */         this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return LlmAPIClient.V7.this.chat((LlmAPI.Chat.Stream.V7.Request)null, (Continuation)this);
/*     */       } }
/*     */     @DebugMetadata(f = "LlmAPIClient.kt", l = {438}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"serializer$iv", "json$iv"}, m = "complete", c = "ai.grazie.api.gateway.client.api.llm.LlmAPIClient$V7")
/*     */     @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */     static final class LlmAPIClient$V7$complete$1 extends ContinuationImpl { Object L$0; Object L$1; int label;
/*     */       LlmAPIClient$V7$complete$1(Continuation $completion) {
/*     */         super($completion);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Object invokeSuspend(@NotNull Object $result) {
/*     */         this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return LlmAPIClient.V7.this.complete(null, null, null, null, null, (Continuation<? super Flow<? extends LLMStreamData>>)this);
/*     */       } }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final V7 v7() {
/* 374 */     return new V7();
/*     */   }
/*     */   
/*     */   @Deprecated(message = "In favor of embedV2")
/*     */   @Nullable
/*     */   public final Object embed(@NotNull String text, @NotNull LLMProfileID profile, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof ai/grazie/api/gateway/client/api/llm/LlmAPIClient$embed$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast ai/grazie/api/gateway/client/api/llm/LlmAPIClient$embed$1
/*     */     //   11: astore #13
/*     */     //   13: aload #13
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #13
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$embed$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #13
/*     */     //   50: aload #13
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #12
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #14
/*     */     //   62: aload #13
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 216, 0 -> 88, 1 -> 194
/*     */     //   88: aload #12
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: new ai/grazie/api/gateway/api/llm/LlmAPI$Embedding$V1$Request
/*     */     //   96: dup
/*     */     //   97: aload_1
/*     */     //   98: aload_2
/*     */     //   99: invokespecial <init> : (Ljava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;)V
/*     */     //   102: astore #4
/*     */     //   104: aload_0
/*     */     //   105: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*     */     //   108: astore #6
/*     */     //   110: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Embedding$V1.INSTANCE : Lai/grazie/api/gateway/api/llm/LlmAPI$Embedding$V1;
/*     */     //   113: checkcast ai/grazie/model/cloud/API
/*     */     //   116: astore #7
/*     */     //   118: getstatic ai/grazie/utils/cbor/CBOR$Default.INSTANCE : Lai/grazie/utils/cbor/CBOR$Default;
/*     */     //   121: checkcast ai/grazie/utils/cbor/CBOR
/*     */     //   124: astore #10
/*     */     //   126: new ai/grazie/client/common/model/RequestOptions
/*     */     //   129: dup
/*     */     //   130: aconst_null
/*     */     //   131: aconst_null
/*     */     //   132: iconst_3
/*     */     //   133: aconst_null
/*     */     //   134: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   137: astore #8
/*     */     //   139: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*     */     //   142: checkcast ai/grazie/utils/json/JSON
/*     */     //   145: astore #9
/*     */     //   147: iconst_0
/*     */     //   148: istore #11
/*     */     //   150: aload #6
/*     */     //   152: aload #7
/*     */     //   154: aload #4
/*     */     //   156: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Embedding$V1$Request.Companion : Lai/grazie/api/gateway/api/llm/LlmAPI$Embedding$V1$Request$Companion;
/*     */     //   159: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   162: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Embedding$V1$Response.Companion : Lai/grazie/api/gateway/api/llm/LlmAPI$Embedding$V1$Response$Companion;
/*     */     //   165: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   168: aload #8
/*     */     //   170: aload #9
/*     */     //   172: aload #10
/*     */     //   174: aload #13
/*     */     //   176: aload #13
/*     */     //   178: iconst_1
/*     */     //   179: putfield label : I
/*     */     //   182: invokestatic sendAndGet : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lai/grazie/model/cloud/API;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lai/grazie/utils/cbor/CBOR;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   185: dup
/*     */     //   186: aload #14
/*     */     //   188: if_acmpne -> 204
/*     */     //   191: aload #14
/*     */     //   193: areturn
/*     */     //   194: iconst_0
/*     */     //   195: istore #11
/*     */     //   197: aload #12
/*     */     //   199: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   202: aload #12
/*     */     //   204: nop
/*     */     //   205: checkcast ai/grazie/api/gateway/api/llm/LlmAPI$Embedding$V1$Response
/*     */     //   208: astore #5
/*     */     //   210: aload #5
/*     */     //   212: invokevirtual getEmbeddings : ()Lai/grazie/emb/DoubleTextEmbedding;
/*     */     //   215: areturn
/*     */     //   216: new java/lang/IllegalStateException
/*     */     //   219: dup
/*     */     //   220: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   222: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   225: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #377	-> 60
/*     */     //   #378	-> 93
/*     */     //   #379	-> 104
/*     */     //   #454	-> 126
/*     */     //   #457	-> 126
/*     */     //   #454	-> 139
/*     */     //   #458	-> 139
/*     */     //   #454	-> 147
/*     */     //   #454	-> 147
/*     */     //   #461	-> 150
/*     */     //   #377	-> 191
/*     */     //   #461	-> 204
/*     */     //   #379	-> 205
/*     */     //   #380	-> 210
/*     */     //   #377	-> 216
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	33	0	this	Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;
/*     */     //   93	11	1	text	Ljava/lang/String;
/*     */     //   93	11	2	profile	Lai/grazie/model/llm/profile/LLMProfileID;
/*     */     //   104	81	4	request	Lai/grazie/api/gateway/api/llm/LlmAPI$Embedding$V1$Request;
/*     */     //   210	6	5	response	Lai/grazie/api/gateway/api/llm/LlmAPI$Embedding$V1$Response;
/*     */     //   126	59	6	$this$sendAndGet_u24default$iv	Lai/grazie/client/common/cloud/SuspendableCloudClient;
/*     */     //   126	59	7	api$iv	Lai/grazie/model/cloud/API;
/*     */     //   139	46	8	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   147	38	9	json$iv	Lai/grazie/utils/json/JSON;
/*     */     //   126	59	10	cbor$iv	Lai/grazie/utils/cbor/CBOR;
/*     */     //   150	44	11	$i$f$sendAndGet	I
/*     */     //   0	226	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	166	13	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	159	12	$result	Ljava/lang/Object;
/*     */     //   197	8	11	$i$f$sendAndGet	I
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object embedV2(@NotNull List texts, @NotNull LLMProfileID profile, @Nullable Attributes parameters, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof ai/grazie/api/gateway/client/api/llm/LlmAPIClient$embedV2$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast ai/grazie/api/gateway/client/api/llm/LlmAPIClient$embedV2$1
/*     */     //   13: astore #14
/*     */     //   15: aload #14
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #14
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$embedV2$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #14
/*     */     //   53: aload #14
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #13
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #15
/*     */     //   65: aload #14
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 221, 0 -> 92, 1 -> 199
/*     */     //   92: aload #13
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: new ai/grazie/api/gateway/api/llm/LlmAPI$Embedding$V2$Request
/*     */     //   100: dup
/*     */     //   101: aload_1
/*     */     //   102: aload_2
/*     */     //   103: aload_3
/*     */     //   104: invokespecial <init> : (Ljava/util/List;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/utils/attributes/Attributes;)V
/*     */     //   107: astore #5
/*     */     //   109: aload_0
/*     */     //   110: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*     */     //   113: astore #7
/*     */     //   115: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Embedding$V2.INSTANCE : Lai/grazie/api/gateway/api/llm/LlmAPI$Embedding$V2;
/*     */     //   118: checkcast ai/grazie/model/cloud/API
/*     */     //   121: astore #8
/*     */     //   123: getstatic ai/grazie/utils/cbor/CBOR$Default.INSTANCE : Lai/grazie/utils/cbor/CBOR$Default;
/*     */     //   126: checkcast ai/grazie/utils/cbor/CBOR
/*     */     //   129: astore #11
/*     */     //   131: new ai/grazie/client/common/model/RequestOptions
/*     */     //   134: dup
/*     */     //   135: aconst_null
/*     */     //   136: aconst_null
/*     */     //   137: iconst_3
/*     */     //   138: aconst_null
/*     */     //   139: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   142: astore #9
/*     */     //   144: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*     */     //   147: checkcast ai/grazie/utils/json/JSON
/*     */     //   150: astore #10
/*     */     //   152: iconst_0
/*     */     //   153: istore #12
/*     */     //   155: aload #7
/*     */     //   157: aload #8
/*     */     //   159: aload #5
/*     */     //   161: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Embedding$V2$Request.Companion : Lai/grazie/api/gateway/api/llm/LlmAPI$Embedding$V2$Request$Companion;
/*     */     //   164: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   167: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Embedding$V2$Response.Companion : Lai/grazie/api/gateway/api/llm/LlmAPI$Embedding$V2$Response$Companion;
/*     */     //   170: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   173: aload #9
/*     */     //   175: aload #10
/*     */     //   177: aload #11
/*     */     //   179: aload #14
/*     */     //   181: aload #14
/*     */     //   183: iconst_1
/*     */     //   184: putfield label : I
/*     */     //   187: invokestatic sendAndGet : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lai/grazie/model/cloud/API;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lai/grazie/client/common/model/RequestOptions;Lai/grazie/utils/json/JSON;Lai/grazie/utils/cbor/CBOR;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   190: dup
/*     */     //   191: aload #15
/*     */     //   193: if_acmpne -> 209
/*     */     //   196: aload #15
/*     */     //   198: areturn
/*     */     //   199: iconst_0
/*     */     //   200: istore #12
/*     */     //   202: aload #13
/*     */     //   204: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   207: aload #13
/*     */     //   209: nop
/*     */     //   210: checkcast ai/grazie/api/gateway/api/llm/LlmAPI$Embedding$V2$Response
/*     */     //   213: astore #6
/*     */     //   215: aload #6
/*     */     //   217: invokevirtual getEmbeddings : ()Ljava/util/List;
/*     */     //   220: areturn
/*     */     //   221: new java/lang/IllegalStateException
/*     */     //   224: dup
/*     */     //   225: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   227: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   230: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #383	-> 63
/*     */     //   #384	-> 97
/*     */     //   #385	-> 109
/*     */     //   #462	-> 131
/*     */     //   #465	-> 131
/*     */     //   #462	-> 144
/*     */     //   #466	-> 144
/*     */     //   #462	-> 152
/*     */     //   #462	-> 152
/*     */     //   #469	-> 155
/*     */     //   #383	-> 196
/*     */     //   #469	-> 209
/*     */     //   #385	-> 210
/*     */     //   #386	-> 215
/*     */     //   #383	-> 221
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	34	0	this	Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;
/*     */     //   97	12	1	texts	Ljava/util/List;
/*     */     //   97	12	2	profile	Lai/grazie/model/llm/profile/LLMProfileID;
/*     */     //   97	12	3	parameters	Lai/grazie/utils/attributes/Attributes;
/*     */     //   109	81	5	request	Lai/grazie/api/gateway/api/llm/LlmAPI$Embedding$V2$Request;
/*     */     //   215	6	6	response	Lai/grazie/api/gateway/api/llm/LlmAPI$Embedding$V2$Response;
/*     */     //   131	59	7	$this$sendAndGet_u24default$iv	Lai/grazie/client/common/cloud/SuspendableCloudClient;
/*     */     //   131	59	8	api$iv	Lai/grazie/model/cloud/API;
/*     */     //   144	46	9	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   152	38	10	json$iv	Lai/grazie/utils/json/JSON;
/*     */     //   131	59	11	cbor$iv	Lai/grazie/utils/cbor/CBOR;
/*     */     //   155	44	12	$i$f$sendAndGet	I
/*     */     //   0	231	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	168	14	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	161	13	$result	Ljava/lang/Object;
/*     */     //   202	8	12	$i$f$sendAndGet	I
/*     */   }
/*     */   
/*     */   @ExperimentalAPI
/*     */   @Nullable
/*     */   public final Object multiModalChat(@NotNull Function1 builder, @NotNull Continuation<? super Flow<? extends LLMStreamData>> $completion) {
/* 391 */     MultiModalChatRequestBuilder multiModalChatRequestBuilder = new MultiModalChatRequestBuilder(); builder.invoke(multiModalChatRequestBuilder); return multiModalChat(multiModalChatRequestBuilder.build(), $completion);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ExperimentalAPI
/*     */   @Nullable
/*     */   public final Object multiModalChat(@NotNull LLMPromptID prompt, @NotNull LLMProfileID profile, @NotNull LLMMultiModalChat chat, @NotNull Attributes parameters, @NotNull Continuation<? super Flow<? extends LLMStreamData>> $completion) {
/* 401 */     return multiModalChat(new LlmAPI.MultiModalChat.V1.Request(prompt, profile, chat, parameters), $completion);
/*     */   }
/*     */   
/*     */   @ExperimentalAPI
/*     */   private final Object multiModalChat(LlmAPI.MultiModalChat.V1.Request request, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof ai/grazie/api/gateway/client/api/llm/LlmAPIClient$multiModalChat$3
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast ai/grazie/api/gateway/client/api/llm/LlmAPIClient$multiModalChat$3
/*     */     //   11: astore #21
/*     */     //   13: aload #21
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #21
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$multiModalChat$3
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #21
/*     */     //   50: aload #21
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #20
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #22
/*     */     //   62: aload #21
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 405, 0 -> 88, 1 -> 234
/*     */     //   88: aload #20
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1.INSTANCE : Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1;
/*     */     //   96: checkcast ai/grazie/model/cloud/API
/*     */     //   99: astore #4
/*     */     //   101: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData.Companion : Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$LLMData$Companion;
/*     */     //   104: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   107: astore #5
/*     */     //   109: iconst_0
/*     */     //   110: istore #6
/*     */     //   112: new ai/grazie/client/common/model/RequestOptions
/*     */     //   115: dup
/*     */     //   116: aconst_null
/*     */     //   117: aconst_null
/*     */     //   118: iconst_3
/*     */     //   119: aconst_null
/*     */     //   120: invokespecial <init> : (Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   123: astore #7
/*     */     //   125: aload_0
/*     */     //   126: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*     */     //   129: invokevirtual getJson : ()Lai/grazie/utils/json/JSON;
/*     */     //   132: astore #8
/*     */     //   134: iconst_0
/*     */     //   135: istore #9
/*     */     //   137: aload_0
/*     */     //   138: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*     */     //   141: invokevirtual getHttpClient : ()Lai/grazie/client/common/SuspendableHTTPClient;
/*     */     //   144: astore #10
/*     */     //   146: aload_0
/*     */     //   147: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*     */     //   150: aload #4
/*     */     //   152: invokevirtual url : (Lai/grazie/model/cloud/API;)Ljava/lang/String;
/*     */     //   155: astore #11
/*     */     //   157: aload #7
/*     */     //   159: aload #4
/*     */     //   161: invokestatic withTimeout : (Lai/grazie/client/common/model/RequestOptions;Lai/grazie/model/cloud/API;)Lai/grazie/client/common/model/RequestOptions;
/*     */     //   164: astore #12
/*     */     //   166: iconst_0
/*     */     //   167: istore #13
/*     */     //   169: aload #10
/*     */     //   171: aload #11
/*     */     //   173: aload #8
/*     */     //   175: astore #14
/*     */     //   177: iconst_0
/*     */     //   178: istore #15
/*     */     //   180: aload #14
/*     */     //   182: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$Request.Companion : Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$Request$Companion;
/*     */     //   185: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   188: checkcast kotlinx/serialization/SerializationStrategy
/*     */     //   191: aload_1
/*     */     //   192: invokevirtual string : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   195: aload #12
/*     */     //   197: iconst_0
/*     */     //   198: aload #21
/*     */     //   200: aload #21
/*     */     //   202: aload #5
/*     */     //   204: putfield L$0 : Ljava/lang/Object;
/*     */     //   207: aload #21
/*     */     //   209: aload #8
/*     */     //   211: putfield L$1 : Ljava/lang/Object;
/*     */     //   214: aload #21
/*     */     //   216: iconst_1
/*     */     //   217: putfield label : I
/*     */     //   220: invokeinterface receiveContinuousSSE : (Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   225: dup
/*     */     //   226: aload #22
/*     */     //   228: if_acmpne -> 267
/*     */     //   231: aload #22
/*     */     //   233: areturn
/*     */     //   234: iconst_0
/*     */     //   235: istore #9
/*     */     //   237: iconst_0
/*     */     //   238: istore #13
/*     */     //   240: aload #21
/*     */     //   242: getfield L$1 : Ljava/lang/Object;
/*     */     //   245: checkcast ai/grazie/utils/json/JSON
/*     */     //   248: astore #8
/*     */     //   250: aload #21
/*     */     //   252: getfield L$0 : Ljava/lang/Object;
/*     */     //   255: checkcast kotlinx/serialization/KSerializer
/*     */     //   258: astore #5
/*     */     //   260: aload #20
/*     */     //   262: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   265: aload #20
/*     */     //   267: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   270: astore #14
/*     */     //   272: iconst_0
/*     */     //   273: istore #15
/*     */     //   275: aload #14
/*     */     //   277: astore #16
/*     */     //   279: iconst_0
/*     */     //   280: istore #17
/*     */     //   282: iconst_0
/*     */     //   283: istore #18
/*     */     //   285: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$multiModalChat$$inlined$receiveContinuousSSE$default$1
/*     */     //   288: dup
/*     */     //   289: aload #16
/*     */     //   291: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*     */     //   294: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   297: nop
/*     */     //   298: nop
/*     */     //   299: invokestatic filterNotNull : (Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;
/*     */     //   302: astore #14
/*     */     //   304: iconst_0
/*     */     //   305: istore #15
/*     */     //   307: aload #14
/*     */     //   309: astore #16
/*     */     //   311: iconst_0
/*     */     //   312: istore #17
/*     */     //   314: iconst_0
/*     */     //   315: istore #18
/*     */     //   317: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$multiModalChat$$inlined$receiveContinuousSSE$default$2
/*     */     //   320: dup
/*     */     //   321: aload #16
/*     */     //   323: aload #5
/*     */     //   325: aload #8
/*     */     //   327: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lkotlinx/serialization/KSerializer;Lai/grazie/utils/json/JSON;)V
/*     */     //   330: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   333: nop
/*     */     //   334: nop
/*     */     //   335: astore #14
/*     */     //   337: getstatic ai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent.Companion : Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;
/*     */     //   340: astore #15
/*     */     //   342: iconst_0
/*     */     //   343: istore #16
/*     */     //   345: aload #14
/*     */     //   347: astore #17
/*     */     //   349: iconst_0
/*     */     //   350: istore #18
/*     */     //   352: iconst_0
/*     */     //   353: istore #19
/*     */     //   355: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$multiModalChat$$inlined$receiveContinuousSSE$default$3
/*     */     //   358: dup
/*     */     //   359: aload #17
/*     */     //   361: aload #15
/*     */     //   363: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent$Companion;)V
/*     */     //   366: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   369: nop
/*     */     //   370: nop
/*     */     //   371: nop
/*     */     //   372: nop
/*     */     //   373: astore_3
/*     */     //   374: aload_3
/*     */     //   375: astore #4
/*     */     //   377: iconst_0
/*     */     //   378: istore #5
/*     */     //   380: aload #4
/*     */     //   382: astore #6
/*     */     //   384: iconst_0
/*     */     //   385: istore #7
/*     */     //   387: iconst_0
/*     */     //   388: istore #8
/*     */     //   390: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$multiModalChat$$inlined$map$1
/*     */     //   393: dup
/*     */     //   394: aload #6
/*     */     //   396: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*     */     //   399: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   402: nop
/*     */     //   403: nop
/*     */     //   404: areturn
/*     */     //   405: new java/lang/IllegalStateException
/*     */     //   408: dup
/*     */     //   409: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   411: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   414: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #405	-> 60
/*     */     //   #406	-> 93
/*     */     //   #470	-> 101
/*     */     //   #473	-> 101
/*     */     //   #470	-> 109
/*     */     //   #474	-> 109
/*     */     //   #470	-> 112
/*     */     //   #475	-> 112
/*     */     //   #470	-> 125
/*     */     //   #476	-> 125
/*     */     //   #470	-> 134
/*     */     //   #477	-> 137
/*     */     //   #478	-> 169
/*     */     //   #479	-> 180
/*     */     //   #478	-> 195
/*     */     //   #405	-> 231
/*     */     //   #480	-> 272
/*     */     //   #481	-> 275
/*     */     //   #482	-> 282
/*     */     //   #483	-> 285
/*     */     //   #484	-> 297
/*     */     //   #485	-> 298
/*     */     //   #486	-> 299
/*     */     //   #487	-> 304
/*     */     //   #481	-> 307
/*     */     //   #482	-> 314
/*     */     //   #483	-> 317
/*     */     //   #484	-> 333
/*     */     //   #485	-> 334
/*     */     //   #488	-> 337
/*     */     //   #481	-> 345
/*     */     //   #482	-> 352
/*     */     //   #483	-> 355
/*     */     //   #484	-> 369
/*     */     //   #485	-> 370
/*     */     //   #478	-> 371
/*     */     //   #477	-> 372
/*     */     //   #406	-> 373
/*     */     //   #407	-> 374
/*     */     //   #408	-> 377
/*     */     //   #489	-> 380
/*     */     //   #490	-> 387
/*     */     //   #491	-> 390
/*     */     //   #492	-> 402
/*     */     //   #493	-> 403
/*     */     //   #407	-> 404
/*     */     //   #405	-> 405
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	73	0	this	Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;
/*     */     //   93	102	1	request	Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$Request;
/*     */     //   374	31	3	result	Lkotlinx/coroutines/flow/Flow;
/*     */     //   101	65	4	api$iv	Lai/grazie/model/cloud/API;
/*     */     //   377	27	4	$this$map$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   109	125	5	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */     //   260	113	5	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */     //   112	85	6	reconnect$iv	Z
/*     */     //   384	19	6	$this$unsafeTransform$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   125	41	7	options$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   134	100	8	json$iv	Lai/grazie/utils/json/JSON;
/*     */     //   250	123	8	json$iv	Lai/grazie/utils/json/JSON;
/*     */     //   166	11	10	$this$receiveContinuousSSE$iv$iv	Lai/grazie/client/common/SuspendableHTTPClient;
/*     */     //   166	11	11	url$iv$iv	Ljava/lang/String;
/*     */     //   166	31	12	options$iv$iv	Lai/grazie/client/common/model/RequestOptions;
/*     */     //   177	18	14	this_$iv$iv$iv	Lai/grazie/utils/json/JSON;
/*     */     //   272	27	14	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   304	31	14	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   337	34	14	$this$map$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   279	19	16	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   311	23	16	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   349	21	17	$this$unsafeTransform$iv$iv$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   180	15	15	$i$f$string	I
/*     */     //   285	12	18	$i$f$unsafeFlow	I
/*     */     //   282	16	17	$i$f$unsafeTransform	I
/*     */     //   275	24	15	$i$f$map	I
/*     */     //   317	16	18	$i$f$unsafeFlow	I
/*     */     //   314	20	17	$i$f$unsafeTransform	I
/*     */     //   307	28	15	$i$f$map	I
/*     */     //   355	14	19	$i$f$unsafeFlow	I
/*     */     //   352	18	18	$i$f$unsafeTransform	I
/*     */     //   345	26	16	$i$f$map	I
/*     */     //   169	65	13	$i$f$receiveContinuousSSE	I
/*     */     //   137	97	9	$i$f$receiveContinuousSSE	I
/*     */     //   390	12	8	$i$f$unsafeFlow	I
/*     */     //   387	16	7	$i$f$unsafeTransform	I
/*     */     //   380	24	5	$i$f$map	I
/*     */     //   0	415	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	355	21	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	348	20	$result	Ljava/lang/Object;
/*     */     //   240	132	13	$i$f$receiveContinuousSSE	I
/*     */     //   237	136	9	$i$f$receiveContinuousSSE	I
/*     */   }
/*     */   
/*     */   @Deprecated(message = "In favor of profilesV3")
/*     */   @Nullable
/*     */   public final Object profilesV2(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof ai/grazie/api/gateway/client/api/llm/LlmAPIClient$profilesV2$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast ai/grazie/api/gateway/client/api/llm/LlmAPIClient$profilesV2$1
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
/*     */     //   39: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$profilesV2$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #8
/*     */     //   50: aload #8
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #7
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #9
/*     */     //   62: aload #8
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 183, 0 -> 88, 1 -> 126
/*     */     //   88: aload #7
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*     */     //   97: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Profiles$V2.INSTANCE : Lai/grazie/api/gateway/api/llm/LlmAPI$Profiles$V2;
/*     */     //   100: checkcast ai/grazie/model/cloud/API
/*     */     //   103: aconst_null
/*     */     //   104: aload #8
/*     */     //   106: iconst_2
/*     */     //   107: aconst_null
/*     */     //   108: aload #8
/*     */     //   110: iconst_1
/*     */     //   111: putfield label : I
/*     */     //   114: invokestatic get$default : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lai/grazie/model/cloud/API;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   117: dup
/*     */     //   118: aload #9
/*     */     //   120: if_acmpne -> 133
/*     */     //   123: aload #9
/*     */     //   125: areturn
/*     */     //   126: aload #7
/*     */     //   128: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   131: aload #7
/*     */     //   133: checkcast ai/grazie/client/common/model/HTTPResponse
/*     */     //   136: astore_3
/*     */     //   137: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Profiles$V2$Response.Companion : Lai/grazie/api/gateway/api/llm/LlmAPI$Profiles$V2$Response$Companion;
/*     */     //   140: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   143: astore #4
/*     */     //   145: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*     */     //   148: checkcast ai/grazie/utils/json/JSON
/*     */     //   151: astore #5
/*     */     //   153: iconst_0
/*     */     //   154: istore #6
/*     */     //   156: aload #5
/*     */     //   158: aload #4
/*     */     //   160: checkcast kotlinx/serialization/DeserializationStrategy
/*     */     //   163: aload_3
/*     */     //   164: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   167: dup
/*     */     //   168: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   171: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   174: checkcast ai/grazie/api/gateway/api/llm/LlmAPI$Profiles$V2$Response
/*     */     //   177: astore_2
/*     */     //   178: aload_2
/*     */     //   179: invokevirtual getProfiles : ()Ljava/util/List;
/*     */     //   182: areturn
/*     */     //   183: new java/lang/IllegalStateException
/*     */     //   186: dup
/*     */     //   187: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   189: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   192: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #419	-> 60
/*     */     //   #420	-> 93
/*     */     //   #419	-> 123
/*     */     //   #494	-> 137
/*     */     //   #495	-> 156
/*     */     //   #420	-> 174
/*     */     //   #421	-> 178
/*     */     //   #419	-> 183
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	24	0	this	Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;
/*     */     //   178	5	2	response	Lai/grazie/api/gateway/api/llm/LlmAPI$Profiles$V2$Response;
/*     */     //   137	37	3	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*     */     //   145	29	4	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */     //   153	21	5	json$iv	Lai/grazie/utils/json/JSON;
/*     */     //   156	18	6	$i$f$get	I
/*     */     //   0	193	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	133	8	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	126	7	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object profilesV3(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof ai/grazie/api/gateway/client/api/llm/LlmAPIClient$profilesV3$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast ai/grazie/api/gateway/client/api/llm/LlmAPIClient$profilesV3$1
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
/*     */     //   39: new ai/grazie/api/gateway/client/api/llm/LlmAPIClient$profilesV3$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #8
/*     */     //   50: aload #8
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #7
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #9
/*     */     //   62: aload #8
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 183, 0 -> 88, 1 -> 126
/*     */     //   88: aload #7
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: checkcast ai/grazie/client/common/cloud/SuspendableCloudClient
/*     */     //   97: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Profiles$V3.INSTANCE : Lai/grazie/api/gateway/api/llm/LlmAPI$Profiles$V3;
/*     */     //   100: checkcast ai/grazie/model/cloud/API
/*     */     //   103: aconst_null
/*     */     //   104: aload #8
/*     */     //   106: iconst_2
/*     */     //   107: aconst_null
/*     */     //   108: aload #8
/*     */     //   110: iconst_1
/*     */     //   111: putfield label : I
/*     */     //   114: invokestatic get$default : (Lai/grazie/client/common/cloud/SuspendableCloudClient;Lai/grazie/model/cloud/API;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   117: dup
/*     */     //   118: aload #9
/*     */     //   120: if_acmpne -> 133
/*     */     //   123: aload #9
/*     */     //   125: areturn
/*     */     //   126: aload #7
/*     */     //   128: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   131: aload #7
/*     */     //   133: checkcast ai/grazie/client/common/model/HTTPResponse
/*     */     //   136: astore_3
/*     */     //   137: getstatic ai/grazie/api/gateway/api/llm/LlmAPI$Profiles$V3$Response.Companion : Lai/grazie/api/gateway/api/llm/LlmAPI$Profiles$V3$Response$Companion;
/*     */     //   140: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   143: astore #4
/*     */     //   145: getstatic ai/grazie/utils/json/JSON$Default.INSTANCE : Lai/grazie/utils/json/JSON$Default;
/*     */     //   148: checkcast ai/grazie/utils/json/JSON
/*     */     //   151: astore #5
/*     */     //   153: iconst_0
/*     */     //   154: istore #6
/*     */     //   156: aload #5
/*     */     //   158: aload #4
/*     */     //   160: checkcast kotlinx/serialization/DeserializationStrategy
/*     */     //   163: aload_3
/*     */     //   164: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   167: dup
/*     */     //   168: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   171: invokevirtual parse : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
/*     */     //   174: checkcast ai/grazie/api/gateway/api/llm/LlmAPI$Profiles$V3$Response
/*     */     //   177: astore_2
/*     */     //   178: aload_2
/*     */     //   179: invokevirtual getProfiles : ()Ljava/util/List;
/*     */     //   182: areturn
/*     */     //   183: new java/lang/IllegalStateException
/*     */     //   186: dup
/*     */     //   187: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   189: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   192: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #424	-> 60
/*     */     //   #425	-> 93
/*     */     //   #424	-> 123
/*     */     //   #496	-> 137
/*     */     //   #497	-> 156
/*     */     //   #425	-> 174
/*     */     //   #426	-> 178
/*     */     //   #424	-> 183
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	24	0	this	Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;
/*     */     //   178	5	2	response	Lai/grazie/api/gateway/api/llm/LlmAPI$Profiles$V3$Response;
/*     */     //   137	37	3	$this$get_u24default$iv	Lai/grazie/client/common/model/HTTPResponse;
/*     */     //   145	29	4	serializer$iv	Lkotlinx/serialization/KSerializer;
/*     */     //   153	21	5	json$iv	Lai/grazie/utils/json/JSON;
/*     */     //   156	18	6	$i$f$get	I
/*     */     //   0	193	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	133	8	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	126	7	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "LlmAPIClient.kt", l = {438}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"serializer$iv", "json$iv"}, m = "complete", c = "ai.grazie.api.gateway.client.api.llm.LlmAPIClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class LlmAPIClient$complete$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     LlmAPIClient$complete$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return LlmAPIClient.this.complete(null, null, null, null, (Continuation<? super Flow<String>>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "LlmAPIClient.kt", l = {437}, i = {}, s = {}, n = {}, m = "embed", c = "ai.grazie.api.gateway.client.api.llm.LlmAPIClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class LlmAPIClient$embed$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     LlmAPIClient$embed$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return LlmAPIClient.this.embed(null, null, (Continuation<? super DoubleTextEmbedding>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "LlmAPIClient.kt", l = {437}, i = {}, s = {}, n = {}, m = "embedV2", c = "ai.grazie.api.gateway.client.api.llm.LlmAPIClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class LlmAPIClient$embedV2$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     LlmAPIClient$embedV2$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return LlmAPIClient.this.embedV2(null, null, null, (Continuation<? super List<DoubleTextEmbedding>>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "LlmAPIClient.kt", l = {438}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"serializer$iv", "json$iv"}, m = "multiModalChat", c = "ai.grazie.api.gateway.client.api.llm.LlmAPIClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class LlmAPIClient$multiModalChat$3 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     LlmAPIClient$multiModalChat$3(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return LlmAPIClient.this.multiModalChat((LlmAPI.MultiModalChat.V1.Request)null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "LlmAPIClient.kt", l = {420}, i = {}, s = {}, n = {}, m = "profilesV2", c = "ai.grazie.api.gateway.client.api.llm.LlmAPIClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class LlmAPIClient$profilesV2$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     LlmAPIClient$profilesV2$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return LlmAPIClient.this.profilesV2((Continuation<? super List<LLMProfileDTO>>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "LlmAPIClient.kt", l = {425}, i = {}, s = {}, n = {}, m = "profilesV3", c = "ai.grazie.api.gateway.client.api.llm.LlmAPIClient")
/*     */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */   static final class LlmAPIClient$profilesV3$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     LlmAPIClient$profilesV3$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return LlmAPIClient.this.profilesV3((Continuation<? super List<LLMProfileDTO>>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\llm\LlmAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */