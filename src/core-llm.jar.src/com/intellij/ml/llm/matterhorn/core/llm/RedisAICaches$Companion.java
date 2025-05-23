/*     */ package com.intellij.ml.llm.matterhorn.core.llm;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
/*     */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
/*     */ import com.intellij.ml.llm.matterhorn.utils.HashUtilsKt;
/*     */ import com.intellij.ml.llm.matterhorn.utils.JsonUtilsKt;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.Regex;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.JsonBuilder;
/*     */ import kotlinx.serialization.json.JsonElement;
/*     */ import kotlinx.serialization.json.JsonElementKt;
/*     */ import kotlinx.serialization.json.JsonKt;
/*     */ import kotlinx.serialization.json.JsonObject;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\002J\026\020\b\032\0020\0052\006\020\t\032\0020\n2\006\020\013\032\0020\007J\n\020\f\032\0020\005*\0020\005¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/RedisAICaches$Companion;", "", "<init>", "()V", "serializeParametersForHash", "", "parameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "getQueryHash", "chat", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "modelParameters", "fixUnstableTextForCaches", "core-llm"})
/*     */ @SourceDebugExtension({"SMAP\nAICaches.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AICaches.kt\ncom/intellij/ml/llm/matterhorn/core/llm/RedisAICaches$Companion\n+ 2 Json.kt\nkotlinx/serialization/json/JsonKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,219:1\n324#2:220\n205#3:221\n205#3:222\n1863#4,2:223\n14#5:225\n*S KotlinDebug\n*F\n+ 1 AICaches.kt\ncom/intellij/ml/llm/matterhorn/core/llm/RedisAICaches$Companion\n*L\n155#1:220\n160#1:221\n164#1:222\n195#1:223,2\n214#1:225\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   private final String serializeParametersForHash(ModelParameters parameters) {
/* 151 */     Json jsonEncoder = JsonKt.Json$default(null, Companion::serializeParametersForHash$lambda$0, 1, null);
/*     */ 
/*     */ 
/*     */     
/* 155 */     Json $this$encodeToJsonElement$iv = jsonEncoder; int $i$f$encodeToJsonElement = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 220 */     $this$encodeToJsonElement$iv.getSerializersModule(); JsonObject original = JsonElementKt.getJsonObject($this$encodeToJsonElement$iv.encodeToJsonElement((SerializationStrategy)ModelParameters.Companion.serializer(), parameters)); JsonObject transformed = JsonUtilsKt.with(original, "model", (JsonElement)JsonUtilsKt.without(JsonElementKt.getJsonObject((JsonElement)MapsKt.getValue((Map)original, "model")), "capabilities")); Json this_$iv = (Json)Json.Default; int $i$f$encodeToString = 0;
/* 221 */     this_$iv.getSerializersModule(); return this_$iv.encodeToString((SerializationStrategy)JsonObject.Companion.serializer(), transformed);
/* 222 */   } private static final Unit serializeParametersForHash$lambda$0(JsonBuilder $this$Json) { Intrinsics.checkNotNullParameter($this$Json, "$this$Json"); $this$Json.setEncodeDefaults(true); $this$Json.setExplicitNulls(false); return Unit.INSTANCE; } @NotNull public final String getQueryHash(@NotNull MatterhornChat chat, @NotNull ModelParameters modelParameters) { Intrinsics.checkNotNullParameter(chat, "chat"); Intrinsics.checkNotNullParameter(modelParameters, "modelParameters"); Json this_$iv = (Json)Json.Default; int $i$f$encodeToString = 0; this_$iv.getSerializersModule(); String chatSerialized = this_$iv.encodeToString((SerializationStrategy)MatterhornChat.Companion.serializer(), chat); String paramsSerialized = serializeParametersForHash(modelParameters); return HashUtilsKt.hash256(fixUnstableTextForCaches(chatSerialized) + fixUnstableTextForCaches(chatSerialized)); } @NotNull public final String fixUnstableTextForCaches(@NotNull String $this$fixUnstableTextForCaches) { Intrinsics.checkNotNullParameter($this$fixUnstableTextForCaches, "<this>"); Regex[] arrayOfRegex = new Regex[4]; arrayOfRegex[0] = new Regex("(\\s*)(\\d+\\.\\d+)(\\s*seconds)"); arrayOfRegex[1] = new Regex("(\\bin\\s+)(\\d+\\.\\d+)(\\s*s(?:econds)?)(?=\\s*==*)"); arrayOfRegex[2] = new Regex("(in\\s+)(\\d+\\.\\d+)(s)"); arrayOfRegex[3] = new Regex("(\\s*)(\\d+\\.\\d+)(\\s*Mi?B/s)"); List regexList = CollectionsKt.listOf((Object[])arrayOfRegex); Regex regexID = new Regex("Root=1-[0-9a-f]{8}-[0-9a-f]{24}"); Regex regexPath = new Regex("temp/buildTmp/[^/]+/"); Regex regexAddr = new Regex(" at 0x[0-9a-fA-F]+>"); Regex regexSphinx = new Regex("(Sphinx[\\s-]v?\\d+\\.\\d+\\.\\d+\\+)/[0-9a-fA-F]{7,10}"); Regex regexUUID = new Regex("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}"); Regex regexDateTime1 = new Regex("\\d{1,2}/[A-Za-z]{3}/\\d{4} \\d{2}:\\d{2}:\\d{2}"); Regex regexDateTime2 = new Regex("\\d{4}-\\d{2}-\\d{2}\\s\\d{2}:\\d{2}"); Regex regexDateTime3 = new Regex("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}(.\\d{4,8})?"); Regex regexDateTime4 = new Regex("[A-Za-z]+\\s\\d{1,2},\\s\\d{4}\\s-\\s\\d{2}:\\d{2}:\\d{2}"); Regex regexDateTime5 = new Regex("\\b[A-Z][a-z]{2}\\s+\\d{1,2}\\s\\d{2}:\\d{2}\\b"); Regex regexDateTime6 = new Regex(".dev202\\d{11}"); Regex regexDate = new Regex(".d202\\d{5}"); Regex regexTime = new Regex("\\(\\d{1,2}:\\d{2}:\\d{2}\\)"); Regex regexSeed = new Regex("(random seed:\\s*)\\d{1,10}"); Regex regexSeed2 = new Regex("\\(PYTHONHASHSEED=\\d+\\)"); Regex regexLibVersion = new Regex("(\\w+)-(\\d+\\.\\d+\\.\\d+)"); Object result = null; result = $this$fixUnstableTextForCaches; Iterable $this$forEach$iv = regexList; int $i$f$forEach = 0;
/* 223 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); Regex regex = (Regex)element$iv; int $i$a$-forEach-RedisAICaches$Companion$fixUnstableTextForCaches$1 = 0; CharSequence charSequence1 = (CharSequence)result; String str1 = "$11$3"; result = regex.replace(charSequence1, str1); }
/*     */      CharSequence charSequence = (CharSequence)result; String str = "Root=1-11111111-111111111111111111111111"; result = regexID.replace(charSequence, str); charSequence = (CharSequence)result; str = "temp/buildTmp/tmp/"; result = regexPath.replace(charSequence, str); charSequence = (CharSequence)result; str = ">"; result = regexAddr.replace(charSequence, str); charSequence = (CharSequence)result; str = "$1"; result = regexSphinx.replace(charSequence, str); charSequence = (CharSequence)result; str = "123e4567-e89b-12d3-a456-426614174000"; result = regexUUID.replace(charSequence, str); charSequence = (CharSequence)result; str = "01/Jan/2024 00:00:00"; result = regexDateTime1.replace(charSequence, str); charSequence = (CharSequence)result; str = "2024-01-01 00:00"; result = regexDateTime2.replace(charSequence, str); charSequence = (CharSequence)result; str = "2024-01-01T00:00:00"; result = regexDateTime3.replace(charSequence, str); charSequence = (CharSequence)result; str = "January 01, 2024 - 00:00:00"; result = regexDateTime4.replace(charSequence, str); charSequence = (CharSequence)result; str = "Jan 01 00:00"; result = regexDateTime5.replace(charSequence, str); charSequence = (CharSequence)result; str = ".dev20250101"; result = regexDateTime6.replace(charSequence, str); charSequence = (CharSequence)result; str = ".d20250101"; result = regexDate.replace(charSequence, str); charSequence = (CharSequence)result; str = "(0:00:00)"; result = regexTime.replace(charSequence, str); charSequence = (CharSequence)result; str = "$11"; result = regexSeed.replace(charSequence, str); charSequence = (CharSequence)result; str = "(PYTHONHASHSEED=1)"; result = regexSeed2.replace(charSequence, str); charSequence = (CharSequence)result; str = "$1-0.0.0"; result = regexLibVersion.replace(charSequence, str); if (!Intrinsics.areEqual(result, $this$fixUnstableTextForCaches)) {
/* 225 */       int $i$f$logger = 0; Intrinsics.checkNotNullExpressionValue(Logger.getInstance(RedisAICaches.class), "getInstance(...)"); Logger.getInstance(RedisAICaches.class).warn("Chat content was changed while calculating redis key");
/*     */     } 
/*     */     return (String)result; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\RedisAICaches$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */