/*     */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*     */ 
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.JsonElement;
/*     */ import kotlinx.serialization.json.JsonElementKt;
/*     */ import kotlinx.serialization.json.JsonObject;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\016\020\f\032\0020\r2\006\020\016\032\0020\017J\016\020\020\032\0020\0032\006\020\021\032\0020\022R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\026\020\b\032\n\030\0010\tj\004\030\001`\nX\016¢\006\002\n\000R\026\020\013\032\n\030\0010\tj\004\030\001`\nX\016¢\006\002\n\000¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$StreamingContentBuilder;", "", "startBlock", "Lkotlinx/serialization/json/JsonObject;", "<init>", "(Lkotlinx/serialization/json/JsonObject;)V", "getStartBlock", "()Lkotlinx/serialization/json/JsonObject;", "text", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "inputJson", "addDelta", "", "delta", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/ContentDelta;", "build", "jsonEncoder", "Lkotlinx/serialization/json/Json;", "core-llm"})
/*     */ @SourceDebugExtension({"SMAP\nAnthropicChatRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnthropicChatRequest.kt\ncom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$StreamingContentBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,220:1\n1#2:221\n222#3:222\n*S KotlinDebug\n*F\n+ 1 AnthropicChatRequest.kt\ncom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$StreamingContentBuilder\n*L\n209#1:222\n*E\n"})
/*     */ final class StreamingContentBuilder
/*     */ {
/*     */   @NotNull
/*     */   private final JsonObject startBlock;
/*     */   @Nullable
/*     */   private StringBuilder text;
/*     */   @Nullable
/*     */   private StringBuilder inputJson;
/*     */   
/*     */   public StreamingContentBuilder(@NotNull JsonObject startBlock) {
/* 195 */     this.startBlock = startBlock; } @NotNull public final JsonObject getStartBlock() { return this.startBlock; }
/*     */ 
/*     */   
/*     */   public final void addDelta(@NotNull ContentDelta delta)
/*     */   {
/* 200 */     Intrinsics.checkNotNullParameter(delta, "delta"); ContentDelta contentDelta = delta;
/* 201 */     if (this.text == null) { StringBuilder stringBuilder1 = new StringBuilder(), it = stringBuilder1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 221 */       int $i$a$-also-AnthropicChatRequest$StreamingContentBuilder$addDelta$1 = 0; this.text = it; }  if (contentDelta instanceof ContentDelta.InputJson) { if (this.inputJson == null) { StringBuilder stringBuilder1 = new StringBuilder(), it = stringBuilder1; int $i$a$-also-AnthropicChatRequest$StreamingContentBuilder$addDelta$2 = 0; this.inputJson = it; }  } else { throw new NoWhenBranchMatchedException(); }  (contentDelta instanceof ContentDelta.Text) ? stringBuilder1.append(((ContentDelta.Text)delta).getText()) : "JD-Core does not support Kotlin"; } private static final Unit build$lambda$4(StreamingContentBuilder this$0, Json $jsonEncoder, Map<String, ?> $this$withPatch) { Intrinsics.checkNotNullParameter($this$withPatch, "$this$withPatch"); if (this$0.text != null) { StringBuilder it = this$0.text; int $i$a$-let-AnthropicChatRequest$StreamingContentBuilder$build$1$1 = 0; (JsonElement)$this$withPatch.put("text", JsonElementKt.JsonPrimitive(JsonElementKt.getJsonPrimitive((JsonElement)MapsKt.getValue($this$withPatch, "text")).getContent() + JsonElementKt.getJsonPrimitive((JsonElement)MapsKt.getValue($this$withPatch, "text")).getContent())); } else {  }  if (this$0.inputJson != null) { StringBuilder it = this$0.inputJson; int $i$a$-let-AnthropicChatRequest$StreamingContentBuilder$build$1$2 = 0; Json json = $jsonEncoder; Intrinsics.checkNotNullExpressionValue(it.toString(), "toString(...)"); String string$iv = it.toString(); int $i$f$decodeFromString = 0;
/* 222 */       json.getSerializersModule(); $this$withPatch.put("input", json.decodeFromString((DeserializationStrategy)JsonElement.Companion.serializer(), string$iv)); }
/*     */     else
/*     */     {  }
/*     */     
/*     */     return Unit.INSTANCE; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final JsonObject build(@NotNull Json jsonEncoder) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'jsonEncoder'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield startBlock : Lkotlinx/serialization/json/JsonObject;
/*     */     //   10: aload_0
/*     */     //   11: aload_1
/*     */     //   12: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$StreamingContentBuilder;Lkotlinx/serialization/json/Json;)Lkotlin/jvm/functions/Function1;
/*     */     //   17: invokestatic access$withPatch : (Lkotlinx/serialization/json/JsonObject;Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/json/JsonObject;
/*     */     //   20: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #207	-> 6
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	21	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequest$StreamingContentBuilder;
/*     */     //   0	21	1	jsonEncoder	Lkotlinx/serialization/json/Json;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicChatRequest$StreamingContentBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */