/*     */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.LLMRateLimitError;
/*     */ import com.intellij.ml.llm.matterhorn.core.llm.MatterhornAIProxy;
/*     */ import io.ktor.client.statement.HttpResponse;
/*     */ import io.ktor.client.statement.HttpResponseKt;
/*     */ import io.ktor.http.HttpStatusCode;
/*     */ import io.ktor.utils.io.ByteReadChannel;
/*     */ import io.ktor.utils.io.jvm.javaio.BlockingKt;
/*     */ import java.io.InputStream;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.JvmStreamsKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "AnthropicChatRequest.kt", l = {61, 62, 65}, i = {1}, s = {"L$0"}, n = {"response"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.anthropic.AnthropicChatRequest$executeWithoutSteaming$2")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicResponse;", "response", "Lio/ktor/client/statement/HttpResponse;"})
/*     */ @SourceDebugExtension({"SMAP\nAnthropicChatRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnthropicChatRequest.kt\ncom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$executeWithoutSteaming$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 JvmStreams.kt\nkotlinx/serialization/json/JvmStreamsKt\n*L\n1#1,220:1\n1#2:221\n80#3:222\n*S KotlinDebug\n*F\n+ 1 AnthropicChatRequest.kt\ncom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$executeWithoutSteaming$2\n*L\n67#1:222\n*E\n"})
/*     */ final class AnthropicChatRequest$executeWithoutSteaming$2
/*     */   extends SuspendLambda
/*     */   implements Function2<HttpResponse, Continuation<? super AnthropicResponse>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   AnthropicChatRequest$executeWithoutSteaming$2(Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     HttpResponse response;
/*     */     InputStream inputStream;
/*     */     Json $this$decodeFromStream$iv;
/*     */     int $i$f$decodeFromStream;
/*     */     HttpStatusCode httpStatusCode;
/*     */     String str;
/*  59 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); response = (HttpResponse)this.L$0;
/*  60 */         switch (response.getStatus().getValue()) { case 429: case 529:
/*  61 */             this.L$0 = httpStatusCode = response.getStatus(); this.label = 1; if (MatterhornAIProxy.Companion.getBody(response, (Continuation)this) == object) return object;  str = "Server returned response code: " + httpStatusCode + ". Response content: " + MatterhornAIProxy.Companion.getBody(response, (Continuation)this); throw new LLMRateLimitError(str); }
/*  62 */          this.L$0 = response; this.label = 2; if (MatterhornAIProxy.Companion.toLlmException$core_llm(response, (Continuation)this) == object) return object;  if ((RuntimeException)MatterhornAIProxy.Companion.toLlmException$core_llm(response, (Continuation)this) != null) { RuntimeException it = (RuntimeException)MatterhornAIProxy.Companion.toLlmException$core_llm(response, (Continuation)this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 221 */           int $i$a$-let-AnthropicChatRequest$executeWithoutSteaming$2$1 = 0; throw it; }  (RuntimeException)MatterhornAIProxy.Companion.toLlmException$core_llm(response, (Continuation)this); this.L$0 = null; this.label = 3; if (HttpResponseKt.bodyAsChannel(response, (Continuation)this) == object)
/* 222 */           return object;  inputStream = BlockingKt.toInputStream$default((ByteReadChannel)HttpResponseKt.bodyAsChannel(response, (Continuation)this), null, 1, null); $this$decodeFromStream$iv = AnthropicChatRequest.access$getJson$cp(); $i$f$decodeFromStream = 0; $this$decodeFromStream$iv.getSerializersModule(); return JvmStreamsKt.decodeFromStream($this$decodeFromStream$iv, (DeserializationStrategy)AnthropicResponse.Companion.serializer(), inputStream);case 1: httpStatusCode = (HttpStatusCode)this.L$0; ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); str = "Server returned response code: " + httpStatusCode + ". Response content: " + SYNTHETIC_LOCAL_VARIABLE_1; throw new LLMRateLimitError(str);case 2: response = (HttpResponse)this.L$0; ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); if ((RuntimeException)SYNTHETIC_LOCAL_VARIABLE_1 != null) { RuntimeException runtimeException = (RuntimeException)SYNTHETIC_LOCAL_VARIABLE_1; boolean bool = false; throw runtimeException; }  (RuntimeException)SYNTHETIC_LOCAL_VARIABLE_1; this.L$0 = null; this.label = 3; if (HttpResponseKt.bodyAsChannel(response, (Continuation)this) == object) return object;  inputStream = BlockingKt.toInputStream$default((ByteReadChannel)HttpResponseKt.bodyAsChannel(response, (Continuation)this), null, 1, null); $this$decodeFromStream$iv = AnthropicChatRequest.access$getJson$cp(); $i$f$decodeFromStream = 0; $this$decodeFromStream$iv.getSerializersModule(); return JvmStreamsKt.decodeFromStream($this$decodeFromStream$iv, (DeserializationStrategy)AnthropicResponse.Companion.serializer(), inputStream);case 3: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); inputStream = BlockingKt.toInputStream$default((ByteReadChannel)SYNTHETIC_LOCAL_VARIABLE_1, null, 1, null); $this$decodeFromStream$iv = AnthropicChatRequest.access$getJson$cp(); $i$f$decodeFromStream = 0; $this$decodeFromStream$iv.getSerializersModule(); return JvmStreamsKt.decodeFromStream($this$decodeFromStream$iv, (DeserializationStrategy)AnthropicResponse.Companion.serializer(), inputStream); }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super AnthropicChatRequest$executeWithoutSteaming$2> $completion) {
/*     */     AnthropicChatRequest$executeWithoutSteaming$2 anthropicChatRequest$executeWithoutSteaming$2 = new AnthropicChatRequest$executeWithoutSteaming$2($completion);
/*     */     anthropicChatRequest$executeWithoutSteaming$2.L$0 = value;
/*     */     return (Continuation<Unit>)anthropicChatRequest$executeWithoutSteaming$2;
/*     */   }
/*     */   
/*     */   public final Object invoke(HttpResponse p1, Continuation<?> p2) {
/*     */     return ((AnthropicChatRequest$executeWithoutSteaming$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicChatRequest$executeWithoutSteaming$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */