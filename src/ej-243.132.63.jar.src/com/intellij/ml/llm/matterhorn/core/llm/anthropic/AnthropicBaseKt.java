/*     */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.llm.ArgumentType;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornAssistantChatMessageWithToolUses;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessage;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessageImagePart;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessagePart;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornMultiPartChatMessage;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornToolResult;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornToolUse;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornUserChatMessageWithToolResults;
/*     */ import com.intellij.ml.llm.matterhorn.llm.ParameterValue;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.serialization.json.JsonElement;
/*     */ import kotlinx.serialization.json.JsonElementKt;
/*     */ import kotlinx.serialization.json.JsonPrimitive;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\0000\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\000\032\026\020\000\032\0020\001*\0020\0022\b\020\003\032\004\030\0010\004H\002\032\030\020\005\032\b\022\004\022\0020\0070\006*\0020\b2\006\020\t\032\0020\n\032\n\020\013\032\0020\f*\0020\r¨\006\016"}, d2 = {"toAnthropicToolResultContent", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolResultContent;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolResult;", "cache", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;", "toAnthropicContent", "", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicContent;", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "shouldCache", "", "toJsonElement", "Lkotlinx/serialization/json/JsonElement;", "Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;", "core-llm"})
/*     */ @SourceDebugExtension({"SMAP\nAnthropicBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnthropicBase.kt\ncom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicBaseKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,181:1\n1#2:182\n1557#3:183\n1628#3,3:184\n1246#3,4:189\n1557#3:193\n1628#3,3:194\n462#4:187\n412#4:188\n*S KotlinDebug\n*F\n+ 1 AnthropicBase.kt\ncom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicBaseKt\n*L\n146#1:183\n146#1:184,3\n171#1:189,4\n180#1:193\n180#1:194,3\n171#1:187\n171#1:188\n*E\n"})
/*     */ public final class AnthropicBaseKt
/*     */ {
/*     */   private static final AnthropicToolResultContent toAnthropicToolResultContent(MatterhornToolResult $this$toAnthropicToolResultContent, AnthropicCacheControl cache) {
/* 131 */     List<AnthropicTextContent> list1 = CollectionsKt.createListBuilder(), list2 = list1; String str1 = $this$toAnthropicToolResultContent.getId(); int $i$a$-buildList-AnthropicBaseKt$toAnthropicToolResultContent$1 = 0;
/* 132 */     if ($this$toAnthropicToolResultContent.getImage() == null || ((((CharSequence)$this$toAnthropicToolResultContent.getContent()).length() > 0)))
/* 133 */       list2.add(new AnthropicTextContent($this$toAnthropicToolResultContent.getContent(), null, 2, null)); 
/* 134 */     if ($this$toAnthropicToolResultContent.getImage() != null) { MatterhornChatMessageImagePart it = $this$toAnthropicToolResultContent.getImage();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 182 */       int $i$a$-let-AnthropicBaseKt$toAnthropicToolResultContent$1$1 = 0; list2.add(new AnthropicImageContent(new Base64AnthropicSource(it.getContentType(), it.getBase64()), null, 2, null)); } else { $this$toAnthropicToolResultContent.getImage(); }
/* 183 */      AnthropicCacheControl anthropicCacheControl = cache; Boolean bool = Boolean.valueOf($this$toAnthropicToolResultContent.isError()); List<? extends AnthropicContent> list = CollectionsKt.build(list1); String str2 = str1; return new AnthropicToolResultContent(str2, list, bool, anthropicCacheControl); } @NotNull public static final List<AnthropicContent> toAnthropicContent(@NotNull MatterhornChatElement $this$toAnthropicContent, boolean shouldCache) { Intrinsics.checkNotNullParameter($this$toAnthropicContent, "<this>"); AnthropicCacheControl cache = shouldCache ? new AnthropicCacheControl("ephemeral") : null; MatterhornChatElement matterhornChatElement = $this$toAnthropicContent; MatterhornChatMessagePart partToCache = (MatterhornChatMessagePart)CollectionsKt.lastOrNull(((MatterhornMultiPartChatMessage)$this$toAnthropicContent).getParts()); Iterable $this$map$iv = ((MatterhornMultiPartChatMessage)$this$toAnthropicContent).getParts(); int $i$f$map = 0; Iterable iterable1 = $this$map$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 184 */     for (Object item$iv$iv : iterable1)
/* 185 */     { MatterhornChatMessagePart matterhornChatMessagePart = (MatterhornChatMessagePart)item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-AnthropicBaseKt$toAnthropicContent$1 = 0; AnthropicCacheControl anthropicCacheControl1 = cache, it = anthropicCacheControl1; int $i$a$-takeIf-AnthropicBaseKt$toAnthropicContent$1$cache$1 = 0; }  List<AnthropicToolResultContent> list1 = CollectionsKt.createListBuilder(), $this$toAnthropicContent_u24lambda_u245 = list1; int $i$a$-buildList-AnthropicBaseKt$toAnthropicContent$2 = 0; MatterhornToolResult resultToCache = ((((CharSequence)((MatterhornUserChatMessageWithToolResults)$this$toAnthropicContent).getContent()).length() == 0)) ? (MatterhornToolResult)CollectionsKt.lastOrNull(((MatterhornUserChatMessageWithToolResults)$this$toAnthropicContent).getToolResults()) : null; for (MatterhornToolResult result : ((MatterhornUserChatMessageWithToolResults)$this$toAnthropicContent).getToolResults()) { AnthropicCacheControl anthropicCacheControl1 = cache, anthropicCacheControl2 = anthropicCacheControl1; MatterhornToolResult matterhornToolResult1 = result; List<AnthropicToolResultContent> list = $this$toAnthropicContent_u24lambda_u245; int $i$a$-takeIf-AnthropicBaseKt$toAnthropicContent$2$1 = 0; boolean bool = Intrinsics.areEqual(result, resultToCache); list.add(toAnthropicToolResultContent(matterhornToolResult1, bool ? anthropicCacheControl1 : null)); }  if ((((CharSequence)((MatterhornUserChatMessageWithToolResults)$this$toAnthropicContent).getContent()).length() > 0))
/*     */       $this$toAnthropicContent_u24lambda_u245.add(new AnthropicTextContent(((MatterhornUserChatMessageWithToolResults)$this$toAnthropicContent).getContent(), cache));  if (matterhornChatElement instanceof MatterhornAssistantChatMessageWithToolUses) { List<AnthropicToolResultContent> $this$toAnthropicContent_u24lambda_u247 = list1 = CollectionsKt.createListBuilder(); int $i$a$-buildList-AnthropicBaseKt$toAnthropicContent$3 = 0; if ((((CharSequence)((MatterhornAssistantChatMessageWithToolUses)$this$toAnthropicContent).getContent()).length() > 0))
/* 187 */         $this$toAnthropicContent_u24lambda_u247.add(new AnthropicTextContent(((MatterhornAssistantChatMessageWithToolUses)$this$toAnthropicContent).getContent(), cache));  for (MatterhornToolUse usage : ((MatterhornAssistantChatMessageWithToolUses)$this$toAnthropicContent).getToolUses()) { Map map1 = usage.getInput(); String str1 = usage.getName(), str2 = usage.getId(); List<AnthropicToolResultContent> list = $this$toAnthropicContent_u24lambda_u247; int $i$f$mapValues = 0; Map map2 = map1; Map<Object, Object> map3 = new LinkedHashMap<>(MapsKt.mapCapacity(map1.size())); int $i$f$mapValuesTo = 0;
/* 188 */         Iterable $this$associateByTo$iv$iv$iv = map2.entrySet(); int $i$f$associateByTo = 0;
/* 189 */         for (Object element$iv$iv$iv : $this$associateByTo$iv$iv$iv) {
/* 190 */           Map.Entry entry1 = (Map.Entry)element$iv$iv$iv; Map<Object, Object> map6 = map3; int $i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1$iv$iv = 0; Map.Entry entry2 = (Map.Entry)element$iv$iv$iv; Object object1 = entry1.getKey(); Map<Object, Object> map7 = map6; int $i$a$-mapValues-AnthropicBaseKt$toAnthropicContent$3$1 = 0;
/*     */         } 
/* 192 */         Map<Object, Object> map4 = map3; AnthropicCacheControl anthropicCacheControl = cache; Map<Object, Object> map5 = map4; String str3 = str1, str4 = str2; list.add(new AnthropicToolContent(str4, str3, (Map)map5, anthropicCacheControl)); }  } else { throw new NoWhenBranchMatchedException(); }  return (matterhornChatElement instanceof MatterhornChatMessage) ? CollectionsKt.listOf(new AnthropicTextContent(((MatterhornChatMessage)$this$toAnthropicContent).getContent(), cache)) : ((matterhornChatElement instanceof MatterhornMultiPartChatMessage) ? (List<AnthropicContent>)destination$iv$iv : ((matterhornChatElement instanceof MatterhornUserChatMessageWithToolResults) ? CollectionsKt.build(list1) : (List<AnthropicContent>)"JD-Core does not support Kotlin")); } @NotNull public static final JsonElement toJsonElement(@NotNull ParameterValue $this$toJsonElement) { String[] arrayOfString; Iterable $this$map$iv; int $i$f$map; Iterable iterable1; Collection<JsonPrimitive> destination$iv$iv; int $i$f$mapTo; List list; Intrinsics.checkNotNullParameter($this$toJsonElement, "<this>"); switch (WhenMappings.$EnumSwitchMapping$0[$this$toJsonElement.getType().ordinal()]) { case 1: case 2: case 3: 
/* 193 */       case 4: arrayOfString = new String[1]; arrayOfString[0] = ","; $this$map$iv = StringsKt.split$default($this$toJsonElement.getValue(), arrayOfString, false, 0, 6, null); $i$f$map = 0; iterable1 = $this$map$iv; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); $i$f$mapTo = 0;
/* 194 */         for (Object item$iv$iv : iterable1) {
/* 195 */           String str = (String)item$iv$iv; Collection<JsonPrimitive> collection = destination$iv$iv; int $i$a$-map-AnthropicBaseKt$toJsonElement$1 = 0; collection.add(JsonElementKt.JsonPrimitive(Integer.valueOf(Integer.parseInt(str))));
/* 196 */         }  list = (List)destination$iv$iv; }
/*     */     
/*     */     throw new NoWhenBranchMatchedException(); }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicBaseKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */