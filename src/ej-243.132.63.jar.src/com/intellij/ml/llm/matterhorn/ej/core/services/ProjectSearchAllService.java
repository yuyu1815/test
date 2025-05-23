/*     */ package com.intellij.ml.llm.matterhorn.ej.core.services;
/*     */ 
/*     */ import com.intellij.ide.util.gotoByName.GotoSymbolModel2;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.services.search.SearchQuery;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Service({Service.Level.PROJECT})
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020$\n\002\030\002\n\002\020 \n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\021\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\b\007\030\0002\0020\001:\001\033B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J6\020\b\032\024\022\004\022\0020\n\022\n\022\b\022\004\022\0020\f0\0130\t2\f\020\r\032\b\022\004\022\0020\n0\0132\006\020\016\032\0020\017H@¢\006\002\020\020J(\020\021\032\024\022\004\022\0020\n\022\n\022\b\022\004\022\0020\0220\0130\t2\f\020\r\032\b\022\004\022\0020\n0\013H\002J(\020\023\032\024\022\004\022\0020\n\022\n\022\b\022\004\022\0020\0220\0130\t2\f\020\r\032\b\022\004\022\0020\n0\013H\002J'\020\024\032\b\022\004\022\0020\0220\013*\n\022\006\b\001\022\0020\0260\0252\006\020\027\032\0020\nH\002¢\006\002\020\030J\b\020\031\032\0020\032H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\034"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchAllService;", "Lcom/intellij/openapi/Disposable;", "project", "Lcom/intellij/openapi/project/Project;", "<init>", "(Lcom/intellij/openapi/project/Project;)V", "getProject", "()Lcom/intellij/openapi/project/Project;", "searchProject", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultItem;", "queries", "exactMatch", "", "(Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findElementsExactMatch", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchAllService$FoundPsiItemResult;", "findElements", "toItemResults", "", "", "query", "([Ljava/lang/Object;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;)Ljava/util/List;", "dispose", "", "FoundPsiItemResult", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nProjectSearchAllService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectSearchAllService.kt\ncom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchAllService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1279#2,2:101\n1293#2,4:103\n1279#2,2:114\n1293#2,4:116\n1246#2,2:142\n1557#2:144\n1628#2,3:145\n1249#2:148\n381#3,7:107\n381#3,7:120\n462#3:140\n412#3:141\n11483#4,9:127\n13409#4:136\n13410#4:138\n11492#4:139\n1#5:137\n*S KotlinDebug\n*F\n+ 1 ProjectSearchAllService.kt\ncom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchAllService\n*L\n48#1:101,2\n48#1:103,4\n67#1:114,2\n67#1:116,4\n26#1:142,2\n27#1:144\n27#1:145,3\n26#1:148\n52#1:107,7\n72#1:120,7\n26#1:140\n26#1:141\n87#1:127,9\n87#1:136\n87#1:138\n87#1:139\n87#1:137\n*E\n"})
/*     */ public final class ProjectSearchAllService implements Disposable {
/*  17 */   public ProjectSearchAllService(@NotNull Project project) { this.project = project; } @NotNull private final Project project; @NotNull public final Project getProject() { return this.project; } @Nullable
/*     */   public final Object searchProject(@NotNull List queries, boolean exactMatch, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   4: iload_2
/*     */     //   5: aload_0
/*     */     //   6: aload_1
/*     */     //   7: <illegal opcode> invoke : (ZLcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchAllService;Ljava/util/List;)Lkotlin/jvm/functions/Function0;
/*     */     //   12: aload_3
/*     */     //   13: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   16: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #20	-> 0
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	17	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchAllService;
/*     */     //   0	17	1	queries	Ljava/util/List;
/*     */     //   0	17	2	exactMatch	Z
/*     */     //   0	17	3	$completion	Lkotlin/coroutines/Continuation;
/*     */   } private static final Map searchProject$lambda$3(boolean $exactMatch, ProjectSearchAllService this$0, List<SearchQuery> $queries) {
/*  21 */     Map<SearchQuery, List<FoundPsiItemResult>> searchResults = $exactMatch ? 
/*  22 */       this$0.findElementsExactMatch($queries) : 
/*     */       
/*  24 */       this$0.findElements($queries);
/*     */     
/*  26 */     Map<SearchQuery, List<FoundPsiItemResult>> $this$mapValues$iv = searchResults; int $i$f$mapValues = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 140 */     Map<SearchQuery, List<FoundPsiItemResult>> map1 = $this$mapValues$iv; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(MapsKt.mapCapacity($this$mapValues$iv.size())); int $i$f$mapValuesTo = 0;
/* 141 */     Iterable<Map.Entry<SearchQuery, List<FoundPsiItemResult>>> $this$associateByTo$iv$iv$iv = map1.entrySet(); int $i$f$associateByTo = 0;
/* 142 */     for (Object<SearchQuery, List<FoundPsiItemResult>> element$iv$iv$iv : $this$associateByTo$iv$iv$iv) {
/* 143 */       Map.Entry entry1 = (Map.Entry)element$iv$iv$iv; Map<Object, Object> map2 = destination$iv$iv; int $i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1$iv$iv = 0; Map.Entry entry2 = (Map.Entry)element$iv$iv$iv; Object object = entry1.getKey(); Map<Object, Object> map3 = map2; int $i$a$-mapValues-ProjectSearchAllService$searchProject$2$1 = 0;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 148 */     return destination$iv$iv;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\025HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchAllService$FoundPsiItemResult;", "", "item", "Lcom/intellij/psi/PsiElement;", "file", "Lcom/intellij/psi/PsiFile;", "<init>", "(Lcom/intellij/psi/PsiElement;Lcom/intellij/psi/PsiFile;)V", "getItem", "()Lcom/intellij/psi/PsiElement;", "getFile", "()Lcom/intellij/psi/PsiFile;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ej-core"})
/*     */   private static final class FoundPsiItemResult {
/*     */     @NotNull
/*     */     private final PsiElement item;
/*     */     @NotNull
/*     */     private final PsiFile file;
/*     */     
/*     */     public FoundPsiItemResult(@NotNull PsiElement item, @NotNull PsiFile file) {
/*     */       this.item = item;
/*     */       this.file = file;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final PsiElement getItem() {
/*     */       return this.item;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final PsiFile getFile() {
/*     */       return this.file;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final PsiElement component1() {
/*     */       return this.item;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final PsiFile component2() {
/*     */       return this.file;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final FoundPsiItemResult copy(@NotNull PsiElement item, @NotNull PsiFile file) {
/*     */       Intrinsics.checkNotNullParameter(item, "item");
/*     */       Intrinsics.checkNotNullParameter(file, "file");
/*     */       return new FoundPsiItemResult(item, file);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "FoundPsiItemResult(item=" + this.item + ", file=" + this.file + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = this.item.hashCode();
/*     */       return result * 31 + this.file.hashCode();
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof FoundPsiItemResult))
/*     */         return false; 
/*     */       FoundPsiItemResult foundPsiItemResult = (FoundPsiItemResult)other;
/*     */       return !Intrinsics.areEqual(this.item, foundPsiItemResult.item) ? false : (!!Intrinsics.areEqual(this.file, foundPsiItemResult.file));
/*     */     }
/*     */   }
/*     */   
/*     */   private final Map<SearchQuery, List<FoundPsiItemResult>> findElementsExactMatch(List queries) {
/*     */     GotoSymbolModel2 model = new GotoSymbolModel2(this.project, this);
/*     */     Iterable $this$associateWith$iv = queries;
/*     */     int $i$f$associateWith = 0;
/*     */     LinkedHashMap<Object, Object> result$iv = new LinkedHashMap<>(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associateWith$iv, 10)), 16));
/*     */     Iterable $this$associateWithTo$iv$iv = $this$associateWith$iv;
/*     */     int $i$f$associateWithTo = 0;
/*     */     for (Object element$iv$iv : $this$associateWithTo$iv$iv) {
/*     */       SearchQuery searchQuery = (SearchQuery)element$iv$iv;
/*     */       Object object1 = element$iv$iv;
/*     */       LinkedHashMap<Object, Object> linkedHashMap = result$iv;
/*     */       int $i$a$-associateWith-ProjectSearchAllService$findElementsExactMatch$queryToName$1 = 0;
/*     */       String[] arrayOfString = new String[1];
/*     */       arrayOfString[0] = ".";
/*     */       String str = (String)CollectionsKt.last(StringsKt.split$default(searchQuery.getQuery(), arrayOfString, false, 0, 6, null));
/*     */       linkedHashMap.put(object1, str);
/*     */     } 
/*     */     Map<Object, Object> queryToName = result$iv;
/*     */     Map<Object, Object> queryToSymbols = new LinkedHashMap<>();
/*     */     Iterator<SearchQuery> iterator = queries.iterator();
/*     */     while (true) {
/*     */       SearchQuery query;
/*     */       if (iterator.hasNext()) {
/*     */         query = iterator.next();
/*     */         Map<Object, Object> $this$getOrPut$iv = queryToSymbols;
/*     */         int $i$f$getOrPut = 0;
/*     */         Object value$iv = $this$getOrPut$iv.get(query);
/*     */         if (value$iv == null) {
/*     */           int $i$a$-getOrPut-ProjectSearchAllService$findElementsExactMatch$accumulated$1 = 0;
/*     */           Object answer$iv = new ArrayList();
/*     */           $this$getOrPut$iv.put(query, answer$iv);
/*     */         } 
/*     */       } else {
/*     */         break;
/*     */       } 
/*     */       List<FoundPsiItemResult> accumulated = (List)value$iv;
/*     */       if (accumulated.size() > query.getQueryLimit())
/*     */         continue; 
/*     */       Intrinsics.checkNotNull(queryToName.get(query));
/*     */       Intrinsics.checkNotNullExpressionValue(model.getElementsByName((String)queryToName.get(query), false, query.getQuery()), "getElementsByName(...)");
/*     */       Object[] items = model.getElementsByName((String)queryToName.get(query), false, query.getQuery());
/*     */       List<FoundPsiItemResult> elements = toItemResults(items, query);
/*     */       accumulated.addAll(elements);
/*     */     } 
/*     */     return (Map)queryToSymbols;
/*     */   }
/*     */   
/*     */   private final Map<SearchQuery, List<FoundPsiItemResult>> findElements(List queries) {
/*     */     GotoSymbolModel2 model = new GotoSymbolModel2(this.project, this);
/*     */     Intrinsics.checkNotNullExpressionValue(model.getNames(false), "getNames(...)");
/*     */     String[] allNames = model.getNames(false);
/*     */     Iterable $this$associateWith$iv = queries;
/*     */     int $i$f$associateWith = 0;
/*     */     LinkedHashMap<Object, Object> result$iv = new LinkedHashMap<>(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associateWith$iv, 10)), 16));
/*     */     Iterable $this$associateWithTo$iv$iv = $this$associateWith$iv;
/*     */     int $i$f$associateWithTo = 0;
/*     */     for (Object element$iv$iv : $this$associateWithTo$iv$iv) {
/*     */       SearchQuery searchQuery = (SearchQuery)element$iv$iv;
/*     */       Object object1 = element$iv$iv;
/*     */       LinkedHashMap<Object, Object> linkedHashMap = result$iv;
/*     */       int $i$a$-associateWith-ProjectSearchAllService$findElements$queryToName$1 = 0;
/*     */       String[] arrayOfString = new String[1];
/*     */       arrayOfString[0] = ".";
/*     */       String str = (String)CollectionsKt.last(StringsKt.split$default(searchQuery.getQuery(), arrayOfString, false, 0, 6, null));
/*     */       linkedHashMap.put(object1, str);
/*     */     } 
/*     */     Map<Object, Object> queryToName = result$iv;
/*     */     Map<Object, Object> queryToSymbols = new LinkedHashMap<>();
/*     */     int i;
/*     */     for ($i$f$associateWith = 0, i = allNames.length; $i$f$associateWith < i; ) {
/*     */       String name = allNames[$i$f$associateWith];
/*     */       Iterator<SearchQuery> iterator = queries.iterator();
/*     */       while (true) {
/*     */         SearchQuery query;
/*     */         if (iterator.hasNext()) {
/*     */           query = iterator.next();
/*     */           Map<Object, Object> $this$getOrPut$iv = queryToSymbols;
/*     */           int $i$f$getOrPut = 0;
/*     */           Object value$iv = $this$getOrPut$iv.get(query);
/*     */           if (value$iv == null) {
/*     */             int $i$a$-getOrPut-ProjectSearchAllService$findElements$accumulated$1 = 0;
/*     */             Object answer$iv = new ArrayList();
/*     */             $this$getOrPut$iv.put(query, answer$iv);
/*     */           } 
/*     */         } else {
/*     */           break;
/*     */         } 
/*     */         List<FoundPsiItemResult> accumulated = (List)value$iv;
/*     */         if (accumulated.size() > query.getQueryLimit())
/*     */           continue; 
/*     */         Intrinsics.checkNotNull(name);
/*     */         Intrinsics.checkNotNull(queryToName.get(query));
/*     */         if (StringsKt.contains$default(name, (CharSequence)queryToName.get(query), false, 2, null)) {
/*     */           Intrinsics.checkNotNullExpressionValue(model.getElementsByName(name, false, query.getQuery()), "getElementsByName(...)");
/*     */           Object[] items = model.getElementsByName(name, false, query.getQuery());
/*     */           List<FoundPsiItemResult> elements = toItemResults(items, query);
/*     */           accumulated.addAll(elements);
/*     */         } 
/*     */       } 
/*     */       $i$f$associateWith++;
/*     */     } 
/*     */     return (Map)queryToSymbols;
/*     */   }
/*     */   
/*     */   private final List<FoundPsiItemResult> toItemResults(Object[] $this$toItemResults, SearchQuery query) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: astore_3
/*     */     //   2: iconst_0
/*     */     //   3: istore #4
/*     */     //   5: aload_3
/*     */     //   6: astore #5
/*     */     //   8: new java/util/ArrayList
/*     */     //   11: dup
/*     */     //   12: invokespecial <init> : ()V
/*     */     //   15: checkcast java/util/Collection
/*     */     //   18: astore #6
/*     */     //   20: iconst_0
/*     */     //   21: istore #7
/*     */     //   23: aload #5
/*     */     //   25: astore #8
/*     */     //   27: iconst_0
/*     */     //   28: istore #9
/*     */     //   30: iconst_0
/*     */     //   31: istore #10
/*     */     //   33: aload #8
/*     */     //   35: arraylength
/*     */     //   36: istore #11
/*     */     //   38: iload #10
/*     */     //   40: iload #11
/*     */     //   42: if_icmpge -> 188
/*     */     //   45: aload #8
/*     */     //   47: iload #10
/*     */     //   49: aaload
/*     */     //   50: astore #12
/*     */     //   52: aload #12
/*     */     //   54: astore #13
/*     */     //   56: iconst_0
/*     */     //   57: istore #14
/*     */     //   59: aload #13
/*     */     //   61: astore #15
/*     */     //   63: iconst_0
/*     */     //   64: istore #16
/*     */     //   66: aload #15
/*     */     //   68: instanceof com/intellij/psi/PsiElement
/*     */     //   71: ifeq -> 156
/*     */     //   74: aload #15
/*     */     //   76: checkcast com/intellij/psi/PsiElement
/*     */     //   79: invokeinterface getContainingFile : ()Lcom/intellij/psi/PsiFile;
/*     */     //   84: astore #17
/*     */     //   86: aload #17
/*     */     //   88: ifnull -> 152
/*     */     //   91: aload #15
/*     */     //   93: checkcast com/intellij/psi/PsiElement
/*     */     //   96: invokeinterface getTextOffset : ()I
/*     */     //   101: iflt -> 152
/*     */     //   104: aload_2
/*     */     //   105: invokevirtual getFilter : ()Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;
/*     */     //   108: dup
/*     */     //   109: ifnull -> 130
/*     */     //   112: aload #17
/*     */     //   114: invokeinterface checkFile : (Lcom/intellij/psi/PsiFile;)Z
/*     */     //   119: ifne -> 126
/*     */     //   122: iconst_1
/*     */     //   123: goto -> 132
/*     */     //   126: iconst_0
/*     */     //   127: goto -> 132
/*     */     //   130: pop
/*     */     //   131: iconst_0
/*     */     //   132: ifne -> 152
/*     */     //   135: new com/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchAllService$FoundPsiItemResult
/*     */     //   138: dup
/*     */     //   139: aload #15
/*     */     //   141: checkcast com/intellij/psi/PsiElement
/*     */     //   144: aload #17
/*     */     //   146: invokespecial <init> : (Lcom/intellij/psi/PsiElement;Lcom/intellij/psi/PsiFile;)V
/*     */     //   149: goto -> 157
/*     */     //   152: aconst_null
/*     */     //   153: goto -> 157
/*     */     //   156: aconst_null
/*     */     //   157: nop
/*     */     //   158: dup
/*     */     //   159: ifnull -> 180
/*     */     //   162: astore #18
/*     */     //   164: iconst_0
/*     */     //   165: istore #19
/*     */     //   167: aload #6
/*     */     //   169: aload #18
/*     */     //   171: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   176: pop
/*     */     //   177: goto -> 181
/*     */     //   180: pop
/*     */     //   181: nop
/*     */     //   182: iinc #10, 1
/*     */     //   185: goto -> 38
/*     */     //   188: nop
/*     */     //   189: aload #6
/*     */     //   191: checkcast java/util/List
/*     */     //   194: nop
/*     */     //   195: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #87	-> 0
/*     */     //   #127	-> 5
/*     */     //   #135	-> 23
/*     */     //   #136	-> 30
/*     */     //   #135	-> 59
/*     */     //   #88	-> 66
/*     */     //   #89	-> 68
/*     */     //   #90	-> 74
/*     */     //   #91	-> 86
/*     */     //   #92	-> 135
/*     */     //   #93	-> 152
/*     */     //   #95	-> 156
/*     */     //   #96	-> 157
/*     */     //   #135	-> 158
/*     */     //   #137	-> 164
/*     */     //   #135	-> 167
/*     */     //   #135	-> 177
/*     */     //   #135	-> 180
/*     */     //   #136	-> 181
/*     */     //   #138	-> 188
/*     */     //   #139	-> 189
/*     */     //   #127	-> 194
/*     */     //   #97	-> 195
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   86	67	17	containingFile	Lcom/intellij/psi/PsiFile;
/*     */     //   66	92	16	$i$a$-mapNotNull-ProjectSearchAllService$toItemResults$1	I
/*     */     //   63	95	15	item	Ljava/lang/Object;
/*     */     //   167	10	19	$i$a$-let-ArraysKt___ArraysKt$mapNotNullTo$1$1$iv$iv	I
/*     */     //   164	13	18	it$iv$iv	Ljava/lang/Object;
/*     */     //   59	122	14	$i$a$-forEach-ArraysKt___ArraysKt$mapNotNullTo$1$iv$iv	I
/*     */     //   56	125	13	element$iv$iv	Ljava/lang/Object;
/*     */     //   52	130	12	element$iv$iv$iv	Ljava/lang/Object;
/*     */     //   30	159	9	$i$f$forEach	I
/*     */     //   27	162	8	$this$forEach$iv$iv$iv	[Ljava/lang/Object;
/*     */     //   23	168	7	$i$f$mapNotNullTo	I
/*     */     //   20	171	5	$this$mapNotNullTo$iv$iv	[Ljava/lang/Object;
/*     */     //   20	171	6	destination$iv$iv	Ljava/util/Collection;
/*     */     //   5	190	4	$i$f$mapNotNull	I
/*     */     //   2	193	3	$this$mapNotNull$iv	[Ljava/lang/Object;
/*     */     //   0	196	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchAllService;
/*     */     //   0	196	1	$this$toItemResults	[Ljava/lang/Object;
/*     */     //   0	196	2	query	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*     */   }
/*     */   
/*     */   public void dispose() {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\services\ProjectSearchAllService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */