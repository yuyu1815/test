/*     */ package com.intellij.ml.llm.matterhorn.utils;
/*     */ import java.util.List;
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020$\n\002\020\016\n\002\030\002\n\002\b\002\n\002\020 \n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\b\bÆ\002\030\0002\0020\001:\003\030\031\032B\t\b\002¢\006\004\b\002\020\003J*\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\0052\006\020\b\032\0020\0062\f\020\t\032\b\022\004\022\0020\0060\nH\002J \020\013\032\0020\f2\006\020\r\032\0020\0072\006\020\b\032\0020\0062\006\020\016\032\0020\006H\002J.\020\017\032\0020\f2\006\020\b\032\0020\0062\006\020\016\032\0020\0062\006\020\r\032\0020\0072\f\020\020\032\b\022\004\022\0020\0060\nH\002J\026\020\021\032\b\022\004\022\0020\0060\n2\006\020\b\032\0020\006H\002J\036\020\022\032\0020\0232\006\020\b\032\0020\0062\f\020\024\032\b\022\004\022\0020\0060\nH\002J\036\020\025\032\0020\f2\006\020\026\032\0020\0062\f\020\020\032\b\022\004\022\0020\0060\nH\002J\016\020\027\032\0020\0062\006\020\b\032\0020\006¨\006\033"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/utils/TagParsingUtils;", "", "<init>", "()V", "countTags", "", "", "Lcom/intellij/ml/llm/matterhorn/utils/TagParsingUtils$TagInfo;", "text", "tagsToCount", "", "switchTag", "Lcom/intellij/ml/llm/matterhorn/utils/TagParsingUtils$FixTagsResult;", "tagInfo", "tagName", "fixTagPair", "tagsToProcess", "getEditTags", "updateMainTagsState", "Lcom/intellij/ml/llm/matterhorn/utils/TagParsingUtils$MainTagsState;", "mainTags", "fixSubTags", "innerContent", "fixXMLTags", "TagInfo", "MainTagsState", "FixTagsResult", "core"})
/*     */ @SourceDebugExtension({"SMAP\nTagParsingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TagParsingUtils.kt\ncom/intellij/ml/llm/matterhorn/utils/TagParsingUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,252:1\n1279#2,2:253\n1293#2,4:255\n774#2:267\n865#2,2:268\n1#3:259\n535#4:260\n520#4,6:261\n14#5:270\n14#5:271\n14#5:272\n14#5:273\n14#5:274\n14#5:275\n*S KotlinDebug\n*F\n+ 1 TagParsingUtils.kt\ncom/intellij/ml/llm/matterhorn/utils/TagParsingUtils\n*L\n35#1:253,2\n35#1:255,4\n158#1:267\n158#1:268,2\n135#1:260\n135#1:261,6\n164#1:270\n173#1:271\n185#1:272\n193#1:273\n205#1:274\n244#1:275\n*E\n"})
/*     */ public final class TagParsingUtils {
/*     */   @NotNull
/*     */   public static final TagParsingUtils INSTANCE = new TagParsingUtils();
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020!\n\002\b\021\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B/\022\006\020\002\032\0020\003\022\016\b\002\020\004\032\b\022\004\022\0020\0030\005\022\016\b\002\020\006\032\b\022\004\022\0020\0030\005¢\006\004\b\007\020\bJ\t\020\022\032\0020\003HÆ\003J\017\020\023\032\b\022\004\022\0020\0030\005HÆ\003J\017\020\024\032\b\022\004\022\0020\0030\005HÆ\003J3\020\025\032\0020\0002\b\b\002\020\002\032\0020\0032\016\b\002\020\004\032\b\022\004\022\0020\0030\0052\016\b\002\020\006\032\b\022\004\022\0020\0030\005HÆ\001J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\001HÖ\003J\t\020\031\032\0020\003HÖ\001J\t\020\032\032\0020\033HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\027\020\004\032\b\022\004\022\0020\0030\005¢\006\b\n\000\032\004\b\013\020\fR\027\020\006\032\b\022\004\022\0020\0030\005¢\006\b\n\000\032\004\b\r\020\fR\021\020\016\032\0020\0038F¢\006\006\032\004\b\017\020\nR\021\020\020\032\0020\0038F¢\006\006\032\004\b\021\020\n¨\006\034"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/utils/TagParsingUtils$TagInfo;", "", "tagLength", "", "openIndices", "", "closeIndices", "<init>", "(ILjava/util/List;Ljava/util/List;)V", "getTagLength", "()I", "getOpenIndices", "()Ljava/util/List;", "getCloseIndices", "openCount", "getOpenCount", "closeCount", "getCloseCount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "core"})
/*     */   private static final class TagInfo { private final int tagLength;
/*     */     @NotNull
/*     */     private final List<Integer> openIndices;
/*     */     @NotNull
/*     */     private final List<Integer> closeIndices;
/*     */     
/*  16 */     public TagInfo(int tagLength, @NotNull List<Integer> openIndices, @NotNull List<Integer> closeIndices) { this.tagLength = tagLength;
/*  17 */       this.openIndices = openIndices;
/*  18 */       this.closeIndices = closeIndices; } public final int getTagLength() { return this.tagLength; } @NotNull public final List<Integer> getOpenIndices() { return this.openIndices; } @NotNull public final List<Integer> getCloseIndices() { return this.closeIndices; }
/*     */     
/*  20 */     public final int getOpenCount() { return this.openIndices.size(); } public final int component1() { return this.tagLength; } @NotNull public final List<Integer> component2() { return this.openIndices; } @NotNull public final List<Integer> component3() { return this.closeIndices; } @NotNull public final TagInfo copy(int tagLength, @NotNull List<Integer> openIndices, @NotNull List<Integer> closeIndices) { Intrinsics.checkNotNullParameter(openIndices, "openIndices"); Intrinsics.checkNotNullParameter(closeIndices, "closeIndices"); return new TagInfo(tagLength, openIndices, closeIndices); }
/*  21 */     public final int getCloseCount() { return this.closeIndices.size(); } @NotNull public String toString() { return "TagInfo(tagLength=" + this.tagLength + ", openIndices=" + this.openIndices + ", closeIndices=" + this.closeIndices + ")"; } public int hashCode() { result = Integer.hashCode(this.tagLength); result = result * 31 + this.openIndices.hashCode(); return result * 31 + this.closeIndices.hashCode(); }
/*     */     public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof TagInfo))
/*     */         return false;  TagInfo tagInfo = (TagInfo)other; return (this.tagLength != tagInfo.tagLength) ? false : (!Intrinsics.areEqual(this.openIndices, tagInfo.openIndices) ? false : (!!Intrinsics.areEqual(this.closeIndices, tagInfo.closeIndices))); } }
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020$\n\002\020\016\n\002\030\002\n\002\b\016\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B/\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\005¢\006\004\b\b\020\tJ\025\020\017\032\016\022\004\022\0020\004\022\004\022\0020\0050\003HÆ\003J\013\020\020\032\004\030\0010\005HÆ\003J\013\020\021\032\004\030\0010\005HÆ\003J7\020\022\032\0020\0002\024\b\002\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\0032\n\b\002\020\006\032\004\030\0010\0052\n\b\002\020\007\032\004\030\0010\005HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\001HÖ\003J\t\020\026\032\0020\027HÖ\001J\t\020\030\032\0020\004HÖ\001R\035\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\b\n\000\032\004\b\n\020\013R\023\020\006\032\004\030\0010\005¢\006\b\n\000\032\004\b\f\020\rR\023\020\007\032\004\030\0010\005¢\006\b\n\000\032\004\b\016\020\r¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/utils/TagParsingUtils$MainTagsState;", "", "tagInfos", "", "", "Lcom/intellij/ml/llm/matterhorn/utils/TagParsingUtils$TagInfo;", "thoughtInfo", "commandInfo", "<init>", "(Ljava/util/Map;Lcom/intellij/ml/llm/matterhorn/utils/TagParsingUtils$TagInfo;Lcom/intellij/ml/llm/matterhorn/utils/TagParsingUtils$TagInfo;)V", "getTagInfos", "()Ljava/util/Map;", "getThoughtInfo", "()Lcom/intellij/ml/llm/matterhorn/utils/TagParsingUtils$TagInfo;", "getCommandInfo", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core"}) private static final class MainTagsState { @NotNull private final Map<String, TagParsingUtils.TagInfo> tagInfos; @Nullable private final TagParsingUtils.TagInfo thoughtInfo; @Nullable private final TagParsingUtils.TagInfo commandInfo;
/*  25 */     public MainTagsState(@NotNull Map<String, TagParsingUtils.TagInfo> tagInfos, @Nullable TagParsingUtils.TagInfo thoughtInfo, @Nullable TagParsingUtils.TagInfo commandInfo) { this.tagInfos = tagInfos;
/*  26 */       this.thoughtInfo = thoughtInfo;
/*  27 */       this.commandInfo = commandInfo; } @NotNull public final Map<String, TagParsingUtils.TagInfo> getTagInfos() { return this.tagInfos; } @Nullable public final TagParsingUtils.TagInfo getThoughtInfo() { return this.thoughtInfo; } @Nullable public final TagParsingUtils.TagInfo getCommandInfo() { return this.commandInfo; }
/*     */     @NotNull public final Map<String, TagParsingUtils.TagInfo> component1() { return this.tagInfos; } @Nullable public final TagParsingUtils.TagInfo component2() { return this.thoughtInfo; } @Nullable public final TagParsingUtils.TagInfo component3() { return this.commandInfo; } @NotNull public final MainTagsState copy(@NotNull Map<String, TagParsingUtils.TagInfo> tagInfos, @Nullable TagParsingUtils.TagInfo thoughtInfo, @Nullable TagParsingUtils.TagInfo commandInfo) { Intrinsics.checkNotNullParameter(tagInfos, "tagInfos"); return new MainTagsState(tagInfos, thoughtInfo, commandInfo); } @NotNull public String toString() { return "MainTagsState(tagInfos=" + this.tagInfos + ", thoughtInfo=" + this.thoughtInfo + ", commandInfo=" + this.commandInfo + ")"; } public int hashCode() { result = this.tagInfos.hashCode(); result = result * 31 + ((this.thoughtInfo == null) ? 0 : this.thoughtInfo.hashCode()); return result * 31 + ((this.commandInfo == null) ? 0 : this.commandInfo.hashCode()); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof MainTagsState)) return false;  MainTagsState mainTagsState = (MainTagsState)other; return !Intrinsics.areEqual(this.tagInfos, mainTagsState.tagInfos) ? false : (!Intrinsics.areEqual(this.thoughtInfo, mainTagsState.thoughtInfo) ? false : (!!Intrinsics.areEqual(this.commandInfo, mainTagsState.commandInfo))); } }
/*     */    @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\013\n\002\b\f\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0052\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\022HÖ\001J\t\020\023\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/utils/TagParsingUtils$FixTagsResult;", "", "content", "", "changed", "", "<init>", "(Ljava/lang/String;Z)V", "getContent", "()Ljava/lang/String;", "getChanged", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "core"}) private static final class FixTagsResult
/*     */   {
/*  31 */     @NotNull private final String content; public FixTagsResult(@NotNull String content, boolean changed) { this.content = content;
/*  32 */       this.changed = changed; } private final boolean changed; @NotNull public final String getContent() { return this.content; } public final boolean getChanged() { return this.changed; } @NotNull public final String component1() { return this.content; } public final boolean component2() { return this.changed; } @NotNull public final FixTagsResult copy(@NotNull String content, boolean changed) { Intrinsics.checkNotNullParameter(content, "content"); return new FixTagsResult(content, changed); } @NotNull public String toString() { return "FixTagsResult(content=" + this.content + ", changed=" + this.changed + ")"; }
/*     */     public int hashCode() { result = this.content.hashCode(); return result * 31 + Boolean.hashCode(this.changed); }
/*     */     public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof FixTagsResult)) return false;  FixTagsResult fixTagsResult = (FixTagsResult)other; return !Intrinsics.areEqual(this.content, fixTagsResult.content) ? false : (!(this.changed != fixTagsResult.changed)); } }
/*  35 */   private final Map<String, TagInfo> countTags(String text, List tagsToCount) { Iterable $this$associateWith$iv = tagsToCount; int $i$f$associateWith = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 253 */     LinkedHashMap<Object, Object> result$iv = new LinkedHashMap<>(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associateWith$iv, 10)), 16));
/* 254 */     Iterable $this$associateWithTo$iv$iv = $this$associateWith$iv; int $i$f$associateWithTo = 0;
/* 255 */     for (Object element$iv$iv : $this$associateWithTo$iv$iv) {
/* 256 */       String str = (String)element$iv$iv; Object object1 = element$iv$iv; LinkedHashMap<Object, Object> linkedHashMap = result$iv; int $i$a$-associateWith-TagParsingUtils$countTags$1 = 0; TagInfo tagInfo = new TagInfo(str.length(), null, null, 6, null); int pos = 0;
/*     */     } 
/* 258 */     return (Map)result$iv; } private final FixTagsResult switchTag(TagInfo tagInfo, String text, String tagName) { int openTagPos = ((Number)CollectionsKt.first(tagInfo.getOpenIndices())).intValue(); int closeTagPos = ((Number)CollectionsKt.first(tagInfo.getCloseIndices())).intValue(); if (openTagPos > closeTagPos && tagInfo.getOpenCount() == 1) { int openTagLen = ("<" + tagName + ">").length(); Intrinsics.checkNotNullExpressionValue(text.substring(0, closeTagPos), "substring(...)"); Intrinsics.checkNotNullExpressionValue(text.substring(closeTagPos + openTagLen + 1, openTagPos), "substring(...)"); Intrinsics.checkNotNullExpressionValue(text.substring(openTagPos + openTagLen), "substring(...)"); } else {  }  return new FixTagsResult(text, false); }
/* 259 */   private final FixTagsResult fixTagPair(String text, String tagName, TagInfo tagInfo, List<String> tagsToProcess) { int tagLength = tagInfo.component1(); List<Integer> openIndices = tagInfo.component2(), closeIndices = tagInfo.component3(); if (tagInfo.getOpenCount() == 2 && tagInfo.getCloseCount() == 0) { String str1 = text; int i = ((Number)openIndices.get(1)).intValue(), j = ((Number)openIndices.get(1)).intValue() + tagLength + 2; String str2 = "</" + tagName + ">"; } else if (tagInfo.getOpenCount() == 0 && tagInfo.getCloseCount() == 2) { String str1 = text; int i = ((Number)closeIndices.get(0)).intValue(), j = ((Number)closeIndices.get(0)).intValue() + tagLength + 3; String str2 = "<" + tagName + ">"; } else if (tagInfo.getOpenCount() == 1 && tagInfo.getCloseCount() == 0) { int tagIndex = tagsToProcess.indexOf(tagName); String nextTag = "<" + tagsToProcess.get(tagIndex + 1) + ">"; Integer integer = Integer.valueOf(StringsKt.indexOf$default(text, nextTag, ((Number)openIndices.get(0)).intValue() + 1, false, 4, null)); int it = integer.intValue(); int $i$a$-takeIf-TagParsingUtils$fixTagPair$nextTagPos$1 = 0; ((it != -1)) ? integer : null; int nextTagPos = (tagIndex < CollectionsKt.getLastIndex(tagsToProcess)) ? (((((it != -1)) ? integer : null) != null) ? (((it != -1)) ? integer : null).intValue() : text.length()) : text.length(); nextTag = text; String str1 = "</" + tagName + ">\n"; } else if (tagInfo.getOpenCount() == 0 && tagInfo.getCloseCount() == 1) { int tagIndex = tagsToProcess.indexOf(tagName); String prevTag = "</" + tagsToProcess.get(tagIndex - 1) + ">"; Integer integer = Integer.valueOf(StringsKt.lastIndexOf$default(text, prevTag, ((Number)closeIndices.get(0)).intValue(), false, 4, null)); int it = integer.intValue(); int $i$a$-takeIf-TagParsingUtils$fixTagPair$prevTagEndPos$1 = 0; ((it != -1)) ? integer : null; int prevTagEndPos = (tagIndex > 0) ? (((((it != -1)) ? integer : null) != null) ? ((((it != -1)) ? integer : null).intValue() + prevTag.length()) : 0) : 0; prevTag = text; String str1 = "\n<" + tagName + ">"; } else {  }  return (tagInfo.getOpenCount() == 1 && tagInfo.getCloseCount() == 1) ? switchTag(tagInfo, text, tagName) : new FixTagsResult(text, false); } private final List<String> getEditTags(String text) { Regex editTagPattern = new Regex("</?EDIT(\\d{0,2})>"); return CollectionsKt.sorted(CollectionsKt.distinct(SequencesKt.toList(SequencesKt.map(Regex.findAll$default(editTagPattern, text, 0, 2, null), TagParsingUtils::getEditTags$lambda$3)))); } private static final String getEditTags$lambda$3(MatchResult matchResult) { Intrinsics.checkNotNullParameter(matchResult, "matchResult"); return "EDIT" + matchResult.getGroupValues().get(1); } private final MainTagsState updateMainTagsState(String text, List<String> mainTags) { Map<String, TagInfo> tagInfos = countTags(text, mainTags); return new MainTagsState(tagInfos, tagInfos.get("THOUGHT"), tagInfos.get("COMMAND")); }
/* 260 */   private final FixTagsResult fixSubTags(String innerContent, List<String> tagsToProcess) { Map<String, TagInfo> tagInfos = countTags(innerContent, tagsToProcess); Map<String, TagInfo> $this$filter$iv = tagInfos; int $i$f$filter = 0; Map<String, TagInfo> map1 = $this$filter$iv; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(); int $i$f$filterTo = 0;
/* 261 */     for (Map.Entry<String, TagInfo> element$iv$iv : map1.entrySet()) {
/* 262 */       Map.Entry<String, TagInfo> it = element$iv$iv; int $i$a$-filter-TagParsingUtils$fixSubTags$tagsToFix$1 = 0; if ((((TagInfo)it.getValue()).getOpenCount() != ((TagInfo)it.getValue()).getCloseCount() || (((TagInfo)it.getValue()).getOpenCount() == 1 && ((Number)CollectionsKt.first(((TagInfo)it.getValue()).getOpenIndices())).intValue() > ((Number)CollectionsKt.first(((TagInfo)it.getValue()).getCloseIndices())).intValue()))) {
/* 263 */         destination$iv$iv.put(element$iv$iv.getKey(), element$iv$iv.getValue());
/*     */       }
/*     */     } 
/* 266 */     Map<Object, Object> tagsToFix = destination$iv$iv; if (tagsToFix.isEmpty() || tagsToFix.size() > 1)
/* 267 */       return new FixTagsResult(innerContent, false);  Map.Entry entry = (Map.Entry)CollectionsKt.first(tagsToFix.entrySet()); String tagName = (String)entry.getKey(); TagInfo tagInfo = (TagInfo)entry.getValue(); return fixTagPair(innerContent, tagName, tagInfo, tagsToProcess); } @NotNull public final String fixXMLTags(@NotNull String text) { Intrinsics.checkNotNullParameter(text, "text"); String[] arrayOfString1 = new String[2]; arrayOfString1[0] = "THOUGHT"; arrayOfString1[1] = "COMMAND"; List<String> mainTags = CollectionsKt.listOf((Object[])arrayOfString1); String[] arrayOfString2 = new String[3]; arrayOfString2[0] = "PREVIOUS_STEP"; arrayOfString2[1] = "PLAN"; arrayOfString2[2] = "NEXT_STEP"; List<String> thoughtSubTags = CollectionsKt.listOf((Object[])arrayOfString2); String[] arrayOfString3 = new String[3]; arrayOfString3[0] = "FILE_PATH"; arrayOfString3[1] = "SEARCH"; arrayOfString3[2] = "REPLACE"; List<String> editSubTags = CollectionsKt.listOf((Object[])arrayOfString3); String newText = text; MainTagsState state = updateMainTagsState(newText, mainTags); if (state.getCommandInfo() != null && state.getCommandInfo().getOpenCount() > 0) { int firstCommandPos = ((Number)CollectionsKt.first(state.getCommandInfo().getOpenIndices())).intValue(); List<Integer> list1 = state.getThoughtInfo().getOpenIndices(); List list = CollectionsKt.drop(state.getCommandInfo().getOpenIndices(), 1); int $i$f$filter = 0; List<Integer> list2 = list1; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 268 */       for (Integer element$iv$iv : list2) { int it = ((Number)element$iv$iv).intValue(), $i$a$-filter-TagParsingUtils$fixXMLTags$secondCommandPos$1 = 0; if ((it > firstCommandPos)) destination$iv$iv.add(element$iv$iv);  }
/* 269 */        state.getThoughtInfo().getOpenIndices(); Integer secondCommandPos = (Integer)CollectionsKt.minOrNull(CollectionsKt.plus(CollectionsKt.drop(state.getCommandInfo().getOpenIndices(), 1), (state.getThoughtInfo() != null && state.getThoughtInfo().getOpenIndices() != null) ? destination$iv$iv : CollectionsKt.emptyList())); if (secondCommandPos != null)
/* 270 */       { int i = secondCommandPos.intValue(); Intrinsics.checkNotNullExpressionValue(newText.substring(0, i), "substring(...)"); newText = StringsKt.trim(newText.substring(0, i)).toString(); state = updateMainTagsState(newText, mainTags); int $i$f$logger = 0; Intrinsics.checkNotNullExpressionValue(Logger.getInstance(TagParsingUtils.class), "getInstance(...)"); Logger.getInstance(TagParsingUtils.class).warn("TAGS FIXED: removed second commands"); }  }
/* 271 */      if (state.getThoughtInfo() != null && state.getThoughtInfo().getOpenCount() == 2 && state.getThoughtInfo().getCloseCount() == 0) { FixTagsResult result = fixTagPair(newText, "THOUGHT", state.getThoughtInfo(), mainTags); if (result.getChanged()) { newText = result.getContent(); state = updateMainTagsState(newText, mainTags); int $i$f$logger = 0; Intrinsics.checkNotNullExpressionValue(Logger.getInstance(TagParsingUtils.class), "getInstance(...)"); Logger.getInstance(TagParsingUtils.class).warn("TAGS FIXED: closing THOUGHT_TAG"); }  }
/* 272 */      if (state.getCommandInfo() != null && state.getCommandInfo().getOpenCount() > 0 && state.getCommandInfo().getCloseCount() == 0) { boolean commandCloseBad = StringsKt.endsWith$default(StringsKt.trimEnd(newText).toString(), "</COMMAND", false, 2, null); newText = commandCloseBad ? (StringsKt.trimEnd(newText).toString() + ">") : (StringsKt.trimEnd(newText).toString() + "\n</COMMAND>"); state = updateMainTagsState(newText, mainTags); int $i$f$logger = 0; Intrinsics.checkNotNullExpressionValue(Logger.getInstance(TagParsingUtils.class), "getInstance(...)"); Logger.getInstance(TagParsingUtils.class).warn("TAGS FIXED: closing COMMAND_TAG"); }
/* 273 */      if (state.getThoughtInfo() != null && state.getThoughtInfo().getOpenCount() == 1 && state.getThoughtInfo().getCloseCount() == 1) { FixTagsResult result = switchTag(state.getThoughtInfo(), newText, "THOUGHT"); if (result.getChanged()) { newText = result.getContent(); state = updateMainTagsState(newText, mainTags); int $i$f$logger = 0; Intrinsics.checkNotNullExpressionValue(Logger.getInstance(TagParsingUtils.class), "getInstance(...)"); Logger.getInstance(TagParsingUtils.class).warn("TAGS FIXED: switched THOUGHT_TAGs"); }  }
/* 274 */      if (state.getThoughtInfo() != null && state.getThoughtInfo().getOpenCount() > 0 && state.getThoughtInfo().getCloseCount() > 0) { int thoughtStartContent = ((Number)CollectionsKt.first(state.getThoughtInfo().getOpenIndices())).intValue() + 7 + 2; int thoughtEndContent = ((Number)CollectionsKt.first(state.getThoughtInfo().getCloseIndices())).intValue(); if (thoughtEndContent > thoughtStartContent) { Intrinsics.checkNotNullExpressionValue(newText.substring(thoughtStartContent, thoughtEndContent), "substring(...)"); FixTagsResult fixResult = fixSubTags(newText.substring(thoughtStartContent, thoughtEndContent), thoughtSubTags); if (fixResult.getChanged()) { String str1 = newText, str2 = fixResult.getContent(); newText = StringsKt.replaceRange(str1, thoughtStartContent, thoughtEndContent, str2).toString(); state = updateMainTagsState(newText, mainTags); int $i$f$logger = 0; Intrinsics.checkNotNullExpressionValue(Logger.getInstance(TagParsingUtils.class), "getInstance(...)"); Logger.getInstance(TagParsingUtils.class).warn("TAGS FIXED: THOUGHT SUB_TAGs"); }  }  }  boolean commandContentChanged = false; if (state.getCommandInfo() != null && state.getCommandInfo().getOpenCount() > 0 && state.getCommandInfo().getCloseCount() > 0) { int commandStartContent = ((Number)CollectionsKt.first(state.getCommandInfo().getOpenIndices())).intValue() + 7 + 2; int commandEndContent = ((Number)CollectionsKt.first(state.getCommandInfo().getCloseIndices())).intValue(); if (commandEndContent > commandStartContent) { Intrinsics.checkNotNullExpressionValue(newText.substring(commandStartContent, commandEndContent), "substring(...)"); String commandContent = newText.substring(commandStartContent, commandEndContent); List<String> editTags = getEditTags(commandContent); if (!editTags.isEmpty()) { FixTagsResult fixResult = fixSubTags(commandContent, editTags); if (fixResult.getChanged()) { commandContent = fixResult.getContent(); commandContentChanged = true; }  Map<String, TagInfo> editTagsInfos = countTags(commandContent, editTags); for (String editTag : editTags) { TagInfo tagInfo; if ((TagInfo)editTagsInfos.get(editTag) == null) { (TagInfo)editTagsInfos.get(editTag); continue; }  if (tagInfo.getOpenCount() > 0 && tagInfo.getCloseCount() > 0) { int editStartContent = ((Number)CollectionsKt.first(tagInfo.getOpenIndices())).intValue() + editTag.length() + 2; int editEndContent = ((Number)CollectionsKt.first(tagInfo.getCloseIndices())).intValue(); Intrinsics.checkNotNullExpressionValue(commandContent.substring(editStartContent, editEndContent), "substring(...)"); String editContent = commandContent.substring(editStartContent, editEndContent); FixTagsResult fixTagsResult = fixSubTags(editContent, editSubTags); if (fixTagsResult.getChanged()) { String str1 = commandContent, str2 = fixTagsResult.getContent(); commandContent = StringsKt.replaceRange(str1, editStartContent, editEndContent, str2).toString(); editTagsInfos = countTags(commandContent, editTags); commandContentChanged = true; }  }  }  }
/* 275 */          if (commandContentChanged) { newText = StringsKt.replaceRange(newText, commandStartContent, commandEndContent, commandContent).toString(); int $i$f$logger = 0; Intrinsics.checkNotNullExpressionValue(Logger.getInstance(TagParsingUtils.class), "getInstance(...)"); Logger.getInstance(TagParsingUtils.class).warn("TAGS FIXED: EDIT"); }
/*     */          }
/*     */        }
/*     */     
/*     */     return newText; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhor\\utils\TagParsingUtils.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */