/*     */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptorKt;
/*     */ import kotlinx.serialization.json.JsonElement;
/*     */ import kotlinx.serialization.json.JsonElementKt;
/*     */ import kotlinx.serialization.json.JsonObject;
/*     */ import kotlinx.serialization.json.JsonObjectBuilder;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\"\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\004\b\002\030\000 \r2\b\022\004\022\0020\0020\001:\001\rB\007¢\006\004\b\003\020\004J\020\020\t\032\0020\n2\006\020\013\032\0020\nH\024J\020\020\f\032\0020\n2\006\020\013\032\0020\nH\024R\032\020\005\032\b\022\004\022\0020\0070\006X\004¢\006\b\n\000\022\004\b\b\020\004¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolParamSerializer;", "Lkotlinx/serialization/json/JsonTransformingSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolParam;", "<init>", "()V", "ownPropertyNames", "", "", "getOwnPropertyNames$annotations", "transformSerialize", "Lkotlinx/serialization/json/JsonElement;", "element", "transformDeserialize", "Companion", "core-llm"})
/*     */ @SourceDebugExtension({"SMAP\nAnthropicChatRequestBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnthropicChatRequestBody.kt\ncom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolParamSerializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n*L\n1#1,187:1\n774#2:188\n865#2,2:189\n29#3,3:191\n29#3,3:194\n*S KotlinDebug\n*F\n+ 1 AnthropicChatRequestBody.kt\ncom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolParamSerializer\n*L\n88#1:188\n88#1:189,2\n96#1:191,3\n109#1:194,3\n*E\n"})
/*     */ final class AnthropicToolParamSerializer
/*     */   extends JsonTransformingSerializer<AnthropicToolParam>
/*     */ {
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolParamSerializer$Companion;", "", "<init>", "()V", "SETTINGS_KEY", "", "getSETTINGS_KEY", "()Ljava/lang/String;", "core-llm"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final String getSETTINGS_KEY() {
/*     */       return AnthropicToolParamSerializer.SETTINGS_KEY;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final Set<String> ownPropertyNames;
/*     */   @NotNull
/*     */   private static final String SETTINGS_KEY = "settings";
/*     */   
/*     */   public AnthropicToolParamSerializer() {
/*  82 */     super(AnthropicToolParam.Companion.generatedSerializer$core_llm());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  88 */     Iterable iterable1 = SerialDescriptorKt.getElementNames(getDescriptor()); AnthropicToolParamSerializer anthropicToolParamSerializer = this; int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 188 */     Iterable iterable2 = iterable1; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 189 */     for (Object element$iv$iv : iterable2) { String it = (String)element$iv$iv; int $i$a$-filter-AnthropicToolParamSerializer$ownPropertyNames$1 = 0; if (!Intrinsics.areEqual(it, SETTINGS_KEY)) destination$iv$iv.add(element$iv$iv);  }
/* 190 */      anthropicToolParamSerializer.ownPropertyNames = CollectionsKt.toSet(destination$iv$iv); } @NotNull protected JsonElement transformSerialize(@NotNull JsonElement element) { Intrinsics.checkNotNullParameter(element, "element"); JsonObject obj = JsonElementKt.getJsonObject(element); (JsonElement)obj.get(SETTINGS_KEY); JsonObject settings = ((JsonElement)obj.get(SETTINGS_KEY) != null) ? JsonElementKt.getJsonObject((JsonElement)obj.get(SETTINGS_KEY)) : null; if (settings == null)
/* 191 */       return (JsonElement)obj;  int $i$f$buildJsonObject = 0; JsonObjectBuilder builder$iv = new JsonObjectBuilder();
/* 192 */     JsonObjectBuilder $this$transformSerialize_u24lambda_u241 = builder$iv; int $i$a$-buildJsonObject-AnthropicToolParamSerializer$transformSerialize$1 = 0; for (Map.Entry entry : ((Map)obj).entrySet()) { String key = (String)entry.getKey(); JsonElement value = (JsonElement)entry.getValue(); if (value != settings)
/* 193 */         $this$transformSerialize_u24lambda_u241.put(key, value);  }  for (Map.Entry entry : ((Map)settings).entrySet()) { String key = (String)entry.getKey(); JsonElement value = (JsonElement)entry.getValue(); $this$transformSerialize_u24lambda_u241.put(key, value); }  return (JsonElement)builder$iv.build(); } @NotNull protected JsonElement transformDeserialize(@NotNull JsonElement element) { Intrinsics.checkNotNullParameter(element, "element"); Map<Object, Object> settings = new LinkedHashMap<>(); int $i$f$buildJsonObject = 0;
/* 194 */     JsonObjectBuilder builder$iv = new JsonObjectBuilder();
/* 195 */     JsonObjectBuilder $this$transformDeserialize_u24lambda_u242 = builder$iv; int $i$a$-buildJsonObject-AnthropicToolParamSerializer$transformDeserialize$1 = 0; for (Map.Entry entry : ((Map)JsonElementKt.getJsonObject(element)).entrySet()) { String key = (String)entry.getKey(); JsonElement value = (JsonElement)entry.getValue(); this.ownPropertyNames.contains(key) ? $this$transformDeserialize_u24lambda_u242.put(key, value) : settings.put(key, value); }  if (!settings.isEmpty())
/* 196 */       $this$transformDeserialize_u24lambda_u242.put(SETTINGS_KEY, (JsonElement)new JsonObject(settings));  return (JsonElement)builder$iv.build(); }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicToolParamSerializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */