/*     */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.LLMBadResponseException;
/*     */ import io.ktor.client.plugins.sse.ClientSSESession;
/*     */ import io.ktor.http.HttpStatusCode;
/*     */ import io.ktor.sse.ServerSentEvent;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin._Assertions;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.Boxing;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.JsonObject;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "AnthropicChatRequest.kt", l = {89}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.anthropic.AnthropicChatRequest$executeWithSteaming$3")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/sse/ClientSSESession;"})
/*     */ final class AnthropicChatRequest$executeWithSteaming$3
/*     */   extends SuspendLambda
/*     */   implements Function2<ClientSSESession, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   AnthropicChatRequest$executeWithSteaming$3(Ref.ObjectRef<JsonObject> $message, Ref.ObjectRef<AnthropicStreamingEvent.MessageDelta> $lastMessageDelta, Ref.ObjectRef<List<AnthropicChatRequest.StreamingContentBuilder>> $contents, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     ClientSSESession $this$sse;
/*  88 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$sse = (ClientSSESession)this.L$0;
/*  89 */         this.label = 1; if ($this$sse.getIncoming().collect(new FlowCollector(this.$message, this.$lastMessageDelta, this.$contents) {
/*  90 */               public final Object emit(ServerSentEvent event, Continuation $completion) { if (event.getData() != null) { String it = event.getData();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/* 221 */                   int $i$a$-let-AnthropicChatRequest$executeWithSteaming$3$1$anthropicEvent$1 = 0; Json this_$iv = AnthropicChatRequest.access$getJson$cp(); int $i$f$decodeFromString = 0;
/* 222 */                   this_$iv.getSerializersModule(); if ((AnthropicStreamingEvent)this_$iv.decodeFromString((DeserializationStrategy)AnthropicStreamingEvent.Companion.serializer(), it) != null) { AnthropicStreamingEvent anthropicEvent, anthropicStreamingEvent1 = anthropicEvent; if (anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.Error) { if (((AnthropicStreamingEvent.Error)anthropicEvent).toHttpStatusCode() == null) ((AnthropicStreamingEvent.Error)anthropicEvent).toHttpStatusCode();  throw ((AnthropicStreamingEvent.Error)anthropicEvent).toHttpStatusCode().convertToLlmException$core_llm(HttpStatusCode.Companion.getInternalServerError(), ((AnthropicStreamingEvent.Error)anthropicEvent).getMessage()); }  if (!(anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.Ping)) if (anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.MessageStart) { this.$message.element = ((AnthropicStreamingEvent.MessageStart)anthropicEvent).getMessage(); } else if (anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.MessageDelta) { this.$lastMessageDelta.element = anthropicEvent; } else if (!(anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.MessageStop)) { if (anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.ContentBlockStart) { boolean bool = (((AnthropicStreamingEvent.ContentBlockStart)anthropicEvent).getIndex() == ((List)this.$contents.element).size()) ? true : false; if (_Assertions.ENABLED && !bool) { String str = "Assertion failed"; throw new AssertionError(str); }  Boxing.boxBoolean(((List<AnthropicChatRequest.StreamingContentBuilder>)this.$contents.element).add(new AnthropicChatRequest.StreamingContentBuilder(((AnthropicStreamingEvent.ContentBlockStart)anthropicEvent).getContentBlock()))); } else if (anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.ContentBlockDelta) { ((AnthropicChatRequest.StreamingContentBuilder)((List<AnthropicChatRequest.StreamingContentBuilder>)this.$contents.element).get(((AnthropicStreamingEvent.ContentBlockDelta)anthropicEvent).getIndex())).addDelta(((AnthropicStreamingEvent.ContentBlockDelta)anthropicEvent).getDelta()); } else if (!(anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.ContentBlockStop)) { throw new NoWhenBranchMatchedException(); }  }   return Unit.INSTANCE; }  }  event.getData(); throw new LLMBadResponseException("No event data received"); } }(Continuation)this) == object) return object;  $this$sse.getIncoming().collect(new FlowCollector(this.$message, this.$lastMessageDelta, this.$contents) { public final Object emit(ServerSentEvent event, Continuation $completion) { if (event.getData() != null) { String it = event.getData(); int $i$a$-let-AnthropicChatRequest$executeWithSteaming$3$1$anthropicEvent$1 = 0; Json this_$iv = AnthropicChatRequest.access$getJson$cp(); int $i$f$decodeFromString = 0; this_$iv.getSerializersModule(); if ((AnthropicStreamingEvent)this_$iv.decodeFromString((DeserializationStrategy)AnthropicStreamingEvent.Companion.serializer(), it) != null) {
/*     */                     AnthropicStreamingEvent anthropicEvent, anthropicStreamingEvent1 = anthropicEvent;
/*     */                     if (anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.Error) {
/*     */                       if (((AnthropicStreamingEvent.Error)anthropicEvent).toHttpStatusCode() == null)
/*     */                         ((AnthropicStreamingEvent.Error)anthropicEvent).toHttpStatusCode(); 
/*     */                       throw ((AnthropicStreamingEvent.Error)anthropicEvent).toHttpStatusCode().convertToLlmException$core_llm(HttpStatusCode.Companion.getInternalServerError(), ((AnthropicStreamingEvent.Error)anthropicEvent).getMessage());
/*     */                     } 
/*     */                     if (!(anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.Ping))
/*     */                       if (anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.MessageStart) {
/*     */                         this.$message.element = ((AnthropicStreamingEvent.MessageStart)anthropicEvent).getMessage();
/*     */                       } else if (anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.MessageDelta) {
/*     */                         this.$lastMessageDelta.element = anthropicEvent;
/*     */                       } else if (!(anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.MessageStop)) {
/*     */                         if (anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.ContentBlockStart) {
/*     */                           boolean bool = (((AnthropicStreamingEvent.ContentBlockStart)anthropicEvent).getIndex() == ((List)this.$contents.element).size()) ? true : false;
/*     */                           if (_Assertions.ENABLED && !bool) {
/*     */                             String str = "Assertion failed";
/*     */                             throw new AssertionError(str);
/*     */                           } 
/*     */                           Boxing.boxBoolean(((List<AnthropicChatRequest.StreamingContentBuilder>)this.$contents.element).add(new AnthropicChatRequest.StreamingContentBuilder(((AnthropicStreamingEvent.ContentBlockStart)anthropicEvent).getContentBlock())));
/*     */                         } else if (anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.ContentBlockDelta) {
/*     */                           ((AnthropicChatRequest.StreamingContentBuilder)((List<AnthropicChatRequest.StreamingContentBuilder>)this.$contents.element).get(((AnthropicStreamingEvent.ContentBlockDelta)anthropicEvent).getIndex())).addDelta(((AnthropicStreamingEvent.ContentBlockDelta)anthropicEvent).getDelta());
/*     */                         } else if (!(anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.ContentBlockStop)) {
/*     */                           throw new NoWhenBranchMatchedException();
/*     */                         } 
/*     */                       }  
/*     */                     return Unit.INSTANCE;
/*     */                   }  }
/*     */                 
/*     */                 event.getData();
/*     */                 throw new LLMBadResponseException("No event data received"); }
/*     */                }
/*     */             (Continuation)this);
/*     */         return Unit.INSTANCE;
/*     */       case 1:
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super AnthropicChatRequest$executeWithSteaming$3> $completion) {
/*     */     AnthropicChatRequest$executeWithSteaming$3 anthropicChatRequest$executeWithSteaming$3 = new AnthropicChatRequest$executeWithSteaming$3(this.$message, this.$lastMessageDelta, this.$contents, $completion);
/*     */     anthropicChatRequest$executeWithSteaming$3.L$0 = value;
/*     */     return (Continuation<Unit>)anthropicChatRequest$executeWithSteaming$3;
/*     */   }
/*     */   
/*     */   public final Object invoke(ClientSSESession p1, Continuation<?> p2) {
/*     */     return ((AnthropicChatRequest$executeWithSteaming$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicChatRequest$executeWithSteaming$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */