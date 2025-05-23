/*     */ package com.intellij.ml.llm.matterhorn.core.llm;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.LLMBadResponseException;
/*     */ import com.intellij.ml.llm.matterhorn.LLMContextLengthExceeded;
/*     */ import com.intellij.ml.llm.matterhorn.LLMCountryForbiddenException;
/*     */ import com.intellij.ml.llm.matterhorn.LLMPaymentRequiredException;
/*     */ import com.intellij.ml.llm.matterhorn.core.llm.anthropic.AnthropicError;
/*     */ import com.intellij.ml.llm.matterhorn.core.llm.anthropic.AnthropicErrorWrapper;
/*     */ import io.ktor.client.statement.HttpResponse;
/*     */ import io.ktor.http.HttpStatusCode;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Result;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin._Assertions;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.JsonBuilder;
/*     */ import kotlinx.serialization.json.JsonKt;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\016\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\034\020\006\032\n\030\0010\007j\004\030\001`\b*\0020\tH@¢\006\004\b\n\020\013J!\020\f\032\0060\007j\002`\b2\006\020\r\032\0020\0162\006\020\017\032\0020\020H\000¢\006\002\b\021J\022\020\022\032\0020\020*\0020\tH@¢\006\002\020\013R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "toLlmException", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lio/ktor/client/statement/HttpResponse;", "toLlmException$core_llm", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertToLlmException", "status", "Lio/ktor/http/HttpStatusCode;", "bodyText", "", "convertToLlmException$core_llm", "getBody", "core-llm"})
/*     */ @SourceDebugExtension({"SMAP\nMatterhornAIProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornAIProxy.kt\ncom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,224:1\n1#2:225\n222#3:226\n*S KotlinDebug\n*F\n+ 1 MatterhornAIProxy.kt\ncom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion\n*L\n85#1:226\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @Nullable
/*     */   public final Object toLlmException$core_llm(@NotNull HttpResponse $this$toLlmException, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion$toLlmException$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion$toLlmException$1
/*     */     //   11: astore #7
/*     */     //   13: aload #7
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #7
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion$toLlmException$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #7
/*     */     //   50: aload #7
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #6
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #8
/*     */     //   62: aload #7
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 198, 0 -> 88, 1 -> 154
/*     */     //   88: aload #6
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_1
/*     */     //   94: invokevirtual getStatus : ()Lio/ktor/http/HttpStatusCode;
/*     */     //   97: getstatic io/ktor/http/HttpStatusCode.Companion : Lio/ktor/http/HttpStatusCode$Companion;
/*     */     //   100: invokevirtual getOK : ()Lio/ktor/http/HttpStatusCode;
/*     */     //   103: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   106: ifne -> 196
/*     */     //   109: aload_0
/*     */     //   110: aload_1
/*     */     //   111: invokevirtual getStatus : ()Lio/ktor/http/HttpStatusCode;
/*     */     //   114: astore #4
/*     */     //   116: astore_3
/*     */     //   117: aload_1
/*     */     //   118: aconst_null
/*     */     //   119: aload #7
/*     */     //   121: iconst_1
/*     */     //   122: aconst_null
/*     */     //   123: aload #7
/*     */     //   125: aload_3
/*     */     //   126: putfield L$0 : Ljava/lang/Object;
/*     */     //   129: aload #7
/*     */     //   131: aload #4
/*     */     //   133: putfield L$1 : Ljava/lang/Object;
/*     */     //   136: aload #7
/*     */     //   138: iconst_1
/*     */     //   139: putfield label : I
/*     */     //   142: invokestatic bodyAsText$default : (Lio/ktor/client/statement/HttpResponse;Ljava/nio/charset/Charset;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   145: dup
/*     */     //   146: aload #8
/*     */     //   148: if_acmpne -> 180
/*     */     //   151: aload #8
/*     */     //   153: areturn
/*     */     //   154: aload #7
/*     */     //   156: getfield L$1 : Ljava/lang/Object;
/*     */     //   159: checkcast io/ktor/http/HttpStatusCode
/*     */     //   162: astore #4
/*     */     //   164: aload #7
/*     */     //   166: getfield L$0 : Ljava/lang/Object;
/*     */     //   169: checkcast com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion
/*     */     //   172: astore_3
/*     */     //   173: aload #6
/*     */     //   175: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   178: aload #6
/*     */     //   180: astore #5
/*     */     //   182: aload_3
/*     */     //   183: aload #4
/*     */     //   185: aload #5
/*     */     //   187: checkcast java/lang/String
/*     */     //   190: invokevirtual convertToLlmException$core_llm : (Lio/ktor/http/HttpStatusCode;Ljava/lang/String;)Ljava/lang/RuntimeException;
/*     */     //   193: goto -> 197
/*     */     //   196: aconst_null
/*     */     //   197: areturn
/*     */     //   198: new java/lang/IllegalStateException
/*     */     //   201: dup
/*     */     //   202: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   204: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   207: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #70	-> 60
/*     */     //   #71	-> 93
/*     */     //   #70	-> 151
/*     */     //   #71	-> 180
/*     */     //   #70	-> 198
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	52	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion;
/*     */     //   93	52	1	$this$toLlmException	Lio/ktor/client/statement/HttpResponse;
/*     */     //   0	208	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	148	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	141	6	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final RuntimeException convertToLlmException$core_llm(@NotNull HttpStatusCode status, @NotNull String bodyText) {
/*  75 */     Intrinsics.checkNotNullParameter(status, "status"); Intrinsics.checkNotNullParameter(bodyText, "bodyText"); boolean bool = !Intrinsics.areEqual(status, HttpStatusCode.Companion.getOK()) ? true : false; if (_Assertions.ENABLED && !bool) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 225 */       int $i$a$-assert-MatterhornAIProxy$Companion$convertToLlmException$1 = 0; String str = "convertToLlmException called with OK status"; throw new AssertionError(str);
/* 226 */     }  Json json = JsonKt.Json$default(null, Companion::convertToLlmException$lambda$1, 1, null); MatterhornAIProxy.access$getLogger$cp().warn("\n        Unexpected response: " + status + " content: " + bodyText + "\n      "); Companion companion = this; try { Companion $this$convertToLlmException_u24lambda_u242 = companion; int $i$a$-runCatching-MatterhornAIProxy$Companion$convertToLlmException$message$res$1 = 0; Json this_$iv = json; int $i$f$decodeFromString = 0; this_$iv.getSerializersModule(); object1 = Result.constructor-impl(this_$iv.decodeFromString((DeserializationStrategy)AnthropicErrorWrapper.Companion.serializer(), bodyText)); }
/*     */     catch (Throwable throwable)
/*     */     { object1 = Result.constructor-impl(ResultKt.createFailure(throwable)); }
/*     */     
/*     */     Object res = object1;
/*     */     Object object1 = res;
/*     */     ResultKt.throwOnFailure(object1);
/*     */     AnthropicErrorWrapper wrapper = (AnthropicErrorWrapper)object1;
/*     */     AnthropicError error = wrapper.getError();
/*     */     if (StringsKt.startsWith$default(error.getMessage(), "prompt is too long", false, 2, null) || Intrinsics.areEqual(error.getCode(), "string_above_max_length") || Intrinsics.areEqual(error.getCode(), "context_length_exceeded"))
/*     */       throw new LLMContextLengthExceeded(error.getMessage(), null); 
/*     */     String message = (status.getValue() == 400) ? (Result.isSuccess-impl(res) ? (error.getMessage() + " code: " + error.getMessage()) : null) : null;
/*     */     if (message == null);
/*     */     String finalMessage = "Server returned response code: " + status;
/*     */     LLMBadResponseException badResponse = new LLMBadResponseException(finalMessage);
/*     */     throw Intrinsics.areEqual(status, HttpStatusCode.Companion.getPaymentRequired()) ? (Throwable)new LLMPaymentRequiredException((RuntimeException)badResponse) : (Intrinsics.areEqual(status, HttpStatusCode.Companion.getForbidden()) ? (Throwable)new LLMCountryForbiddenException((RuntimeException)badResponse) : (Throwable)badResponse);
/*     */   }
/*     */   
/*     */   private static final Unit convertToLlmException$lambda$1(JsonBuilder $this$Json) {
/*     */     Intrinsics.checkNotNullParameter($this$Json, "$this$Json");
/*     */     $this$Json.setIgnoreUnknownKeys(true);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object getBody(@NotNull HttpResponse $this$getBody, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion$getBody$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion$getBody$1
/*     */     //   11: astore #9
/*     */     //   13: aload #9
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #9
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion$getBody$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornAIProxy$Companion;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #9
/*     */     //   50: aload #9
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #8
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #10
/*     */     //   62: aload #9
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 226, 0 -> 88, 1 -> 128
/*     */     //   88: aload #8
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_1
/*     */     //   94: astore_3
/*     */     //   95: nop
/*     */     //   96: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*     */     //   99: pop
/*     */     //   100: aload_3
/*     */     //   101: astore #4
/*     */     //   103: iconst_0
/*     */     //   104: istore #5
/*     */     //   106: aload #4
/*     */     //   108: aload #9
/*     */     //   110: aload #9
/*     */     //   112: iconst_1
/*     */     //   113: putfield label : I
/*     */     //   116: invokestatic bodyAsChannel : (Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   119: dup
/*     */     //   120: aload #10
/*     */     //   122: if_acmpne -> 139
/*     */     //   125: aload #10
/*     */     //   127: areturn
/*     */     //   128: iconst_0
/*     */     //   129: istore #5
/*     */     //   131: nop
/*     */     //   132: aload #8
/*     */     //   134: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   137: aload #8
/*     */     //   139: checkcast io/ktor/utils/io/ByteReadChannel
/*     */     //   142: aconst_null
/*     */     //   143: iconst_1
/*     */     //   144: aconst_null
/*     */     //   145: invokestatic toInputStream$default : (Lio/ktor/utils/io/ByteReadChannel;Lkotlinx/coroutines/Job;ILjava/lang/Object;)Ljava/io/InputStream;
/*     */     //   148: astore #6
/*     */     //   150: getstatic kotlin/text/Charsets.UTF_8 : Ljava/nio/charset/Charset;
/*     */     //   153: astore #7
/*     */     //   155: new java/io/InputStreamReader
/*     */     //   158: dup
/*     */     //   159: aload #6
/*     */     //   161: aload #7
/*     */     //   163: invokespecial <init> : (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
/*     */     //   166: checkcast java/io/Reader
/*     */     //   169: invokestatic readText : (Ljava/io/Reader;)Ljava/lang/String;
/*     */     //   172: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   175: astore #4
/*     */     //   177: goto -> 196
/*     */     //   180: astore #5
/*     */     //   182: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*     */     //   185: pop
/*     */     //   186: aload #5
/*     */     //   188: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
/*     */     //   191: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   194: astore #4
/*     */     //   196: aload #4
/*     */     //   198: astore_3
/*     */     //   199: aload_3
/*     */     //   200: invokestatic exceptionOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Throwable;
/*     */     //   203: dup
/*     */     //   204: ifnonnull -> 212
/*     */     //   207: pop
/*     */     //   208: aload_3
/*     */     //   209: goto -> 225
/*     */     //   212: astore #4
/*     */     //   214: iconst_0
/*     */     //   215: istore #5
/*     */     //   217: aload #4
/*     */     //   219: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Throwable;)Ljava/lang/String;
/*     */     //   224: nop
/*     */     //   225: areturn
/*     */     //   226: new java/lang/IllegalStateException
/*     */     //   229: dup
/*     */     //   230: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   232: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   235: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #115	-> 60
/*     */     //   #115	-> 93
/*     */     //   #116	-> 106
/*     */     //   #115	-> 125
/*     */     //   #116	-> 139
/*     */     //   #116	-> 169
/*     */     //   #115	-> 172
/*     */     //   #117	-> 199
/*     */     //   #225	-> 214
/*     */     //   #117	-> 217
/*     */     //   #117	-> 224
/*     */     //   #117	-> 225
/*     */     //   #115	-> 226
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	2	1	$this$getBody	Lio/ktor/client/statement/HttpResponse;
/*     */     //   103	16	4	$this$getBody_u24lambda_u243	Lio/ktor/client/statement/HttpResponse;
/*     */     //   214	10	4	it	Ljava/lang/Throwable;
/*     */     //   106	22	5	$i$a$-runCatching-MatterhornAIProxy$Companion$getBody$2	I
/*     */     //   217	7	5	$i$a$-getOrElse-MatterhornAIProxy$Companion$getBody$3	I
/*     */     //   0	236	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	176	9	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	169	8	$result	Ljava/lang/Object;
/*     */     //   131	41	5	$i$a$-runCatching-MatterhornAIProxy$Companion$getBody$2	I
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   95	119	180	java/lang/Throwable
/*     */     //   131	177	180	java/lang/Throwable
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "MatterhornAIProxy.kt", l = {116}, i = {}, s = {}, n = {}, m = "getBody", c = "com.intellij.ml.llm.matterhorn.core.llm.MatterhornAIProxy$Companion")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class MatterhornAIProxy$Companion$getBody$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     MatterhornAIProxy$Companion$getBody$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return MatterhornAIProxy.Companion.this.getBody(null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "MatterhornAIProxy.kt", l = {71}, i = {}, s = {}, n = {}, m = "toLlmException$core_llm", c = "com.intellij.ml.llm.matterhorn.core.llm.MatterhornAIProxy$Companion")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class MatterhornAIProxy$Companion$toLlmException$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     MatterhornAIProxy$Companion$toLlmException$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return MatterhornAIProxy.Companion.this.toLlmException$core_llm(null, (Continuation<? super RuntimeException>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\MatterhornAIProxy$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */