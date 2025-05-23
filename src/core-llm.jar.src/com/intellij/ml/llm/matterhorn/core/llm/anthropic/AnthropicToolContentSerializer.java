/*     */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*     */ 
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.internal.ArrayListSerializer;
/*     */ import kotlinx.serialization.json.JsonArray;
/*     */ import kotlinx.serialization.json.JsonElement;
/*     */ import kotlinx.serialization.json.JsonElementKt;
/*     */ import kotlinx.serialization.json.JsonObject;
/*     */ import kotlinx.serialization.json.JsonPrimitive;
/*     */ import kotlinx.serialization.json.JsonTransformingSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\020 \n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\b\002\030\0002\016\022\n\022\b\022\004\022\0020\0030\0020\001B\007¢\006\004\b\004\020\005J\020\020\006\032\0020\0072\006\020\b\032\0020\007H\024J\020\020\t\032\0020\0072\006\020\b\032\0020\007H\024¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolContentSerializer;", "Lkotlinx/serialization/json/JsonTransformingSerializer;", "", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicContent;", "<init>", "()V", "transformDeserialize", "Lkotlinx/serialization/json/JsonElement;", "element", "transformSerialize", "core-llm"})
/*     */ final class AnthropicToolContentSerializer
/*     */   extends JsonTransformingSerializer<List<? extends AnthropicContent>>
/*     */ {
/*     */   public AnthropicToolContentSerializer() {
/*  94 */     super((KSerializer)new ArrayListSerializer(AnthropicContent.Companion.serializer())); } @NotNull
/*     */   protected JsonElement transformDeserialize(@NotNull JsonElement element) {
/*  96 */     Intrinsics.checkNotNullParameter(element, "element"); if (element instanceof JsonPrimitive && ((JsonPrimitive)element).isString()) {
/*  97 */       Pair[] arrayOfPair = new Pair[2]; arrayOfPair[0] = TuplesKt.to("type", JsonElementKt.JsonPrimitive("text")); arrayOfPair[1] = TuplesKt.to("text", element); return (JsonElement)new JsonArray(CollectionsKt.listOf(new JsonObject(MapsKt.mapOf(arrayOfPair))));
/*  98 */     }  return element;
/*     */   }
/*     */   @NotNull
/*     */   protected JsonElement transformSerialize(@NotNull JsonElement element) {
/* 102 */     Intrinsics.checkNotNullParameter(element, "element"); JsonElement it = (JsonElement)CollectionsKt.singleOrNull((List)element); int $i$a$-let-AnthropicToolContentSerializer$transformSerialize$1 = 0;
/* 103 */     JsonObject content = (JsonObject)it;
/* 104 */     Intrinsics.checkNotNull(MapsKt.getValue((Map)content, "type"), "null cannot be cast to non-null type kotlinx.serialization.json.JsonPrimitive"); if (Intrinsics.areEqual(((JsonPrimitive)MapsKt.getValue((Map)content, "type")).getContent(), "text"))
/* 105 */       return (JsonElement)MapsKt.getValue((Map)content, "text"); 
/*     */     (JsonElement)CollectionsKt.singleOrNull((List)element);
/* 107 */     return element;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicToolContentSerializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */