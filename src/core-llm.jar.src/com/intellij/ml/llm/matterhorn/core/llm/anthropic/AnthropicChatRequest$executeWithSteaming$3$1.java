/*     */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.LLMBadResponseException;
/*     */ import io.ktor.http.HttpStatusCode;
/*     */ import io.ktor.sse.ServerSentEvent;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.Unit;
/*     */ import kotlin._Assertions;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.Boxing;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nAnthropicChatRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnthropicChatRequest.kt\ncom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$executeWithSteaming$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,220:1\n1#2:221\n222#3:222\n*S KotlinDebug\n*F\n+ 1 AnthropicChatRequest.kt\ncom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$executeWithSteaming$3$1\n*L\n90#1:222\n*E\n"})
/*     */ final class null<T>
/*     */   implements FlowCollector
/*     */ {
/*     */   public final Object emit(ServerSentEvent event, Continuation $completion) {
/*  90 */     if (event.getData() != null) { String it = event.getData();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 221 */       int $i$a$-let-AnthropicChatRequest$executeWithSteaming$3$1$anthropicEvent$1 = 0; Json this_$iv = AnthropicChatRequest.access$getJson$cp(); int $i$f$decodeFromString = 0;
/* 222 */       this_$iv.getSerializersModule(); if ((AnthropicStreamingEvent)this_$iv.decodeFromString((DeserializationStrategy)AnthropicStreamingEvent.Companion.serializer(), it) != null) {
/*     */         AnthropicStreamingEvent anthropicEvent, anthropicStreamingEvent1 = anthropicEvent;
/*     */         if (anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.Error) {
/*     */           if (((AnthropicStreamingEvent.Error)anthropicEvent).toHttpStatusCode() == null)
/*     */             ((AnthropicStreamingEvent.Error)anthropicEvent).toHttpStatusCode(); 
/*     */           throw ((AnthropicStreamingEvent.Error)anthropicEvent).toHttpStatusCode().convertToLlmException$core_llm(HttpStatusCode.Companion.getInternalServerError(), ((AnthropicStreamingEvent.Error)anthropicEvent).getMessage());
/*     */         } 
/*     */         if (!(anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.Ping))
/*     */           if (anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.MessageStart) {
/*     */             this.$message.element = ((AnthropicStreamingEvent.MessageStart)anthropicEvent).getMessage();
/*     */           } else if (anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.MessageDelta) {
/*     */             this.$lastMessageDelta.element = anthropicEvent;
/*     */           } else if (!(anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.MessageStop)) {
/*     */             if (anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.ContentBlockStart) {
/*     */               boolean bool = (((AnthropicStreamingEvent.ContentBlockStart)anthropicEvent).getIndex() == ((List)this.$contents.element).size()) ? true : false;
/*     */               if (_Assertions.ENABLED && !bool) {
/*     */                 String str = "Assertion failed";
/*     */                 throw new AssertionError(str);
/*     */               } 
/*     */               Boxing.boxBoolean(((List<AnthropicChatRequest.StreamingContentBuilder>)this.$contents.element).add(new AnthropicChatRequest.StreamingContentBuilder(((AnthropicStreamingEvent.ContentBlockStart)anthropicEvent).getContentBlock())));
/*     */             } else if (anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.ContentBlockDelta) {
/*     */               ((AnthropicChatRequest.StreamingContentBuilder)((List<AnthropicChatRequest.StreamingContentBuilder>)this.$contents.element).get(((AnthropicStreamingEvent.ContentBlockDelta)anthropicEvent).getIndex())).addDelta(((AnthropicStreamingEvent.ContentBlockDelta)anthropicEvent).getDelta());
/*     */             } else if (!(anthropicStreamingEvent1 instanceof AnthropicStreamingEvent.ContentBlockStop)) {
/*     */               throw new NoWhenBranchMatchedException();
/*     */             } 
/*     */           }  
/*     */         return Unit.INSTANCE;
/*     */       }  }
/*     */     
/*     */     event.getData();
/*     */     throw new LLMBadResponseException("No event data received");
/*     */   }
/*     */   
/*     */   null(Ref.ObjectRef<JsonObject> $message, Ref.ObjectRef<AnthropicStreamingEvent.MessageDelta> $lastMessageDelta, Ref.ObjectRef<List<AnthropicChatRequest.StreamingContentBuilder>> $contents) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicChatRequest$executeWithSteaming$3$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */