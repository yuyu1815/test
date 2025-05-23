/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import java.nio.file.Path;
/*     */ import java.util.ArrayList;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.LinkedHashSet;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\020\000\n\000\n\002\020#\n\002\020\016\n\002\b\003\n\002\020%\n\002\020!\n\002\030\002\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\020$\n\002\020 \n\002\b\003\n\002\020\013\n\002\b\021\b\b\030\000 .2\0020\001:\001.BW\022\f\020\002\032\b\022\004\022\0020\0040\003\022\f\020\005\032\b\022\004\022\0020\0040\003\022\f\020\006\032\b\022\004\022\0020\0040\003\022$\020\007\032 \022\004\022\0020\004\022\026\022\024\022\020\022\016\022\004\022\0020\013\022\004\022\0020\0130\n0\t0\b¢\006\004\b\f\020\rB\021\b\026\022\006\020\016\032\0020\017¢\006\004\b\f\020\020J\b\020\021\032\0020\004H\026J\036\020\022\032\0020\0232\006\020\024\032\0020\0252\006\020\026\032\0020\0132\006\020\027\032\0020\013J$\020\030\032 \022\004\022\0020\004\022\026\022\024\022\020\022\016\022\004\022\0020\013\022\004\022\0020\0130\n0\0320\031J,\020\033\032\0020\0232$\020\034\032 \022\004\022\0020\004\022\026\022\024\022\020\022\016\022\004\022\0020\013\022\004\022\0020\0130\n0\t0\031J\016\020\035\032\0020\0362\006\020\037\032\0020\025J\016\020 \032\0020\0232\006\020\037\032\0020\025J\016\020!\032\0020\0362\006\020\037\032\0020\025J\016\020\"\032\0020\0232\006\020\037\032\0020\025J\016\020#\032\0020\0232\006\020$\032\0020\004J\016\020%\032\0020\0362\006\020$\032\0020\004J\006\020\016\032\0020\017J\017\020&\032\b\022\004\022\0020\0040\003HÂ\003J\017\020'\032\b\022\004\022\0020\0040\003HÂ\003J\017\020(\032\b\022\004\022\0020\0040\003HÂ\003J'\020)\032 \022\004\022\0020\004\022\026\022\024\022\020\022\016\022\004\022\0020\013\022\004\022\0020\0130\n0\t0\bHÂ\003Ja\020*\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\0032\016\b\002\020\005\032\b\022\004\022\0020\0040\0032\016\b\002\020\006\032\b\022\004\022\0020\0040\0032&\b\002\020\007\032 \022\004\022\0020\004\022\026\022\024\022\020\022\016\022\004\022\0020\013\022\004\022\0020\0130\n0\t0\bHÆ\001J\023\020+\032\0020\0362\b\020,\032\004\030\0010\001HÖ\003J\t\020-\032\0020\013HÖ\001R\024\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000R\024\020\005\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000R\024\020\006\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000R,\020\007\032 \022\004\022\0020\004\022\026\022\024\022\020\022\016\022\004\022\0020\013\022\004\022\0020\0130\n0\t0\bX\004¢\006\002\n\000¨\006/"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;", "", "viewedFiles", "", "", "viewedImports", "createdFiles", "shownCode", "", "", "Lkotlin/Pair;", "", "<init>", "(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Map;)V", "snapshot", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;)V", "toString", "addShownCodeRange", "", "filePath", "Ljava/nio/file/Path;", "startLine", "endLine", "getShownCode", "", "", "replaceShownCode", "newShownCode", "hasViewedFile", "", "path", "markViewedFile", "hasViewedImport", "markViewedImport", "addCreatedFile", "string", "hasCreatedFile", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nAgentContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgentContext.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,332:1\n462#2:333\n412#2:334\n381#2,7:339\n462#2:346\n412#2:347\n462#2:352\n412#2:353\n1246#3,4:335\n1246#3,4:348\n1246#3,4:354\n*S KotlinDebug\n*F\n+ 1 AgentContext.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory\n*L\n57#1:333\n57#1:334\n65#1:339,7\n68#1:346\n68#1:347\n108#1:352\n108#1:353\n57#1:335,4\n68#1:348,4\n108#1:354,4\n*E\n"})
/*     */ public final class AgentSessionHistory
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final Set<String> viewedFiles;
/*     */   @NotNull
/*     */   private final Set<String> viewedImports;
/*     */   @NotNull
/*     */   private final Set<String> createdFiles;
/*     */   @NotNull
/*     */   private final Map<String, List<Pair<Integer, Integer>>> shownCode;
/*     */   
/*     */   public AgentSessionHistory(@NotNull Set<String> viewedFiles, @NotNull Set<String> viewedImports, @NotNull Set<String> createdFiles, @NotNull Map<String, List<Pair<Integer, Integer>>> shownCode) {
/*  48 */     this.viewedFiles = viewedFiles;
/*  49 */     this.viewedImports = viewedImports;
/*  50 */     this.createdFiles = createdFiles;
/*  51 */     this.shownCode = shownCode;
/*     */   } @NotNull
/*  53 */   public String toString() { return "AgentSessionHistory(viewedFiles=" + this.viewedFiles + ", viewedImports=" + this.viewedImports + ", createdFiles=" + this.createdFiles + ", shownCode=" + this.shownCode + ")"; } public AgentSessionHistory(@NotNull AgentSessionHistorySnapshot snapshot) { this(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 333 */         set1, set2, set3, MapsKt.toMutableMap(map3)); }
/*     */    public final void addShownCodeRange(@NotNull Path filePath, int startLine, int endLine) {
/*     */     Intrinsics.checkNotNullParameter(filePath, "filePath");
/*     */     Map<String, List<Pair<Integer, Integer>>> map = this.shownCode;
/*     */     String str = filePath.toString();
/*     */     int $i$f$getOrPut = 0;
/* 339 */     Object<Pair<Integer, Integer>> value$iv = (Object<Pair<Integer, Integer>>)map.get(str);
/* 340 */     if (value$iv == null) {
/* 341 */       int $i$a$-getOrPut-AgentSessionHistory$addShownCodeRange$1 = 0; Object answer$iv = new ArrayList();
/* 342 */       map.put(str, answer$iv);
/*     */     } 
/*     */     
/* 345 */     ((List)value$iv).add(new Pair(Integer.valueOf(startLine), Integer.valueOf(endLine))); } @NotNull public final Map<String, List<Pair<Integer, Integer>>> getShownCode() { Map<String, List<Pair<Integer, Integer>>> $this$mapValues$iv = this.shownCode; int $i$f$mapValues = 0;
/* 346 */     Map<String, List<Pair<Integer, Integer>>> map1 = $this$mapValues$iv; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(MapsKt.mapCapacity($this$mapValues$iv.size())); int $i$f$mapValuesTo = 0;
/* 347 */     Iterable<Map.Entry<String, List<Pair<Integer, Integer>>>> $this$associateByTo$iv$iv$iv = map1.entrySet(); int $i$f$associateByTo = 0;
/* 348 */     for (Object<String, List<Pair<Integer, Integer>>> element$iv$iv$iv : $this$associateByTo$iv$iv$iv) {
/* 349 */       Map.Entry entry1 = (Map.Entry)element$iv$iv$iv; Map<Object, Object> map2 = destination$iv$iv; int $i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1$iv$iv = 0; Map.Entry entry2 = (Map.Entry)element$iv$iv$iv; Object object = entry1.getKey(); Map<Object, Object> map3 = map2; int $i$a$-mapValues-AgentSessionHistory$getShownCode$1 = 0;
/*     */     } 
/* 351 */     return (Map)destination$iv$iv; } @NotNull public final AgentSessionHistorySnapshot snapshot() { Map<String, List<Pair<Integer, Integer>>> map1 = this.shownCode; Set<String> set3 = CollectionsKt.toSet(this.createdFiles), set2 = CollectionsKt.toSet(this.viewedImports), set1 = CollectionsKt.toSet(this.viewedFiles); int $i$f$mapValues = 0;
/* 352 */     Map<String, List<Pair<Integer, Integer>>> map2 = map1; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(MapsKt.mapCapacity(map1.size())); int $i$f$mapValuesTo = 0;
/* 353 */     Iterable<Map.Entry<String, List<Pair<Integer, Integer>>>> $this$associateByTo$iv$iv$iv = map2.entrySet(); int $i$f$associateByTo = 0;
/* 354 */     for (Object<String, List<Pair<Integer, Integer>>> element$iv$iv$iv : $this$associateByTo$iv$iv$iv) {
/* 355 */       Map.Entry entry1 = (Map.Entry)element$iv$iv$iv; Map<Object, Object> map5 = destination$iv$iv; int $i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1$iv$iv = 0; Map.Entry entry2 = (Map.Entry)element$iv$iv$iv; Object object = entry1.getKey(); Map<Object, Object> map6 = map5; int $i$a$-mapValues-AgentSessionHistory$snapshot$1 = 0;
/*     */     } 
/* 357 */     Map<Object, Object> map3 = destination$iv$iv;
/*     */     Map<Object, Object> map4 = map3;
/*     */     Set<String> set4 = set3, set5 = set2, set6 = set1;
/*     */     return new AgentSessionHistorySnapshot(set6, set5, set4, (Map)map4); }
/*     */ 
/*     */   
/*     */   public final void replaceShownCode(@NotNull Map<? extends String, ? extends List<Pair<Integer, Integer>>> newShownCode) {
/*     */     Intrinsics.checkNotNullParameter(newShownCode, "newShownCode");
/*     */     this.shownCode.clear();
/*     */     this.shownCode.putAll(newShownCode);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\004\032\0020\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory$Companion;", "", "<init>", "()V", "initialHistoryContext", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;", "ej-core"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final AgentSessionHistory initialHistoryContext() {
/*     */       return new AgentSessionHistory(new LinkedHashSet<>(), new LinkedHashSet<>(), new LinkedHashSet<>(), new LinkedHashMap<>());
/*     */     }
/*     */   }
/*     */   
/*     */   public final boolean hasViewedFile(@NotNull Path path) {
/*     */     Intrinsics.checkNotNullParameter(path, "path");
/*     */     return this.viewedFiles.contains(path.toString());
/*     */   }
/*     */   
/*     */   public final void markViewedFile(@NotNull Path path) {
/*     */     Intrinsics.checkNotNullParameter(path, "path");
/*     */     this.viewedFiles.add(path.toString());
/*     */   }
/*     */   
/*     */   public final boolean hasViewedImport(@NotNull Path path) {
/*     */     Intrinsics.checkNotNullParameter(path, "path");
/*     */     return this.viewedImports.contains(path.toString());
/*     */   }
/*     */   
/*     */   public final void markViewedImport(@NotNull Path path) {
/*     */     Intrinsics.checkNotNullParameter(path, "path");
/*     */     this.viewedImports.add(path.toString());
/*     */   }
/*     */   
/*     */   public final void addCreatedFile(@NotNull String string) {
/*     */     Intrinsics.checkNotNullParameter(string, "string");
/*     */     this.createdFiles.add(string);
/*     */   }
/*     */   
/*     */   public final boolean hasCreatedFile(@NotNull String string) {
/*     */     Intrinsics.checkNotNullParameter(string, "string");
/*     */     return this.createdFiles.contains(string);
/*     */   }
/*     */   
/*     */   private final Set<String> component1() {
/*     */     return this.viewedFiles;
/*     */   }
/*     */   
/*     */   private final Set<String> component2() {
/*     */     return this.viewedImports;
/*     */   }
/*     */   
/*     */   private final Set<String> component3() {
/*     */     return this.createdFiles;
/*     */   }
/*     */   
/*     */   private final Map<String, List<Pair<Integer, Integer>>> component4() {
/*     */     return this.shownCode;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final AgentSessionHistory copy(@NotNull Set<String> viewedFiles, @NotNull Set<String> viewedImports, @NotNull Set<String> createdFiles, @NotNull Map<String, List<Pair<Integer, Integer>>> shownCode) {
/*     */     Intrinsics.checkNotNullParameter(viewedFiles, "viewedFiles");
/*     */     Intrinsics.checkNotNullParameter(viewedImports, "viewedImports");
/*     */     Intrinsics.checkNotNullParameter(createdFiles, "createdFiles");
/*     */     Intrinsics.checkNotNullParameter(shownCode, "shownCode");
/*     */     return new AgentSessionHistory(viewedFiles, viewedImports, createdFiles, shownCode);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.viewedFiles.hashCode();
/*     */     result = result * 31 + this.viewedImports.hashCode();
/*     */     result = result * 31 + this.createdFiles.hashCode();
/*     */     return result * 31 + this.shownCode.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof AgentSessionHistory))
/*     */       return false; 
/*     */     AgentSessionHistory agentSessionHistory = (AgentSessionHistory)other;
/*     */     return !Intrinsics.areEqual(this.viewedFiles, agentSessionHistory.viewedFiles) ? false : (!Intrinsics.areEqual(this.viewedImports, agentSessionHistory.viewedImports) ? false : (!Intrinsics.areEqual(this.createdFiles, agentSessionHistory.createdFiles) ? false : (!!Intrinsics.areEqual(this.shownCode, agentSessionHistory.shownCode))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AgentSessionHistory.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */