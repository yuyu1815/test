/*     */ package com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors;
/*     */ 
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import java.util.List;
/*     */ import kotlin.Pair;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.Regex;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000n\n\000\n\002\020\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\b\n\002\b\b\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\020\t\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\0328\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\0062\030\020\007\032\024\022\004\022\0020\004\022\004\022\0020\t\022\004\022\0020\0010\bH\007\032\036\020\000\032\0020\t2\f\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H\007\032\026\020\n\032\0020\t2\006\020\013\032\0020\f2\006\020\r\032\0020\004\032*\020\016\032\016\022\004\022\0020\020\022\004\022\0020\0200\0172\006\020\013\032\0020\f2\006\020\021\032\0020\0202\006\020\022\032\0020\020\032\"\020\023\032\016\022\004\022\0020\020\022\004\022\0020\0200\0172\006\020\013\032\0020\f2\006\020\r\032\0020\004\032B\020\024\032\020\022\004\022\0020\020\022\004\022\0020\020\030\0010\0172\030\020\025\032\024\022\020\022\016\022\004\022\0020\020\022\004\022\0020\0200\0170\0032\b\b\002\020\026\032\0020\0202\b\b\002\020\027\032\0020\020\0324\020\030\032\004\030\0010\0312\030\020\032\032\024\022\020\022\016\022\004\022\0020\020\022\004\022\0020\0200\0170\0032\006\020\013\032\0020\f2\b\b\002\020\033\032\0020\t\032\n\020\034\032\0020\t*\0020\t\032\026\020\035\032\0020\t2\006\020\036\032\0020\t2\006\020\037\032\0020\t\032\030\020 \032\004\030\0010\t2\006\020\036\032\0020\t2\006\020\037\032\0020\t\032\026\020!\032\0020\"2\006\020#\032\0020\t2\006\020$\032\0020%\032P\020&\032\0020\0012\006\020'\032\0020(2\006\020#\032\0020\t2\006\020$\032\0020%2\006\020)\032\0020\t2\006\020*\032\0020\t2\006\020+\032\0020\t2\006\020,\032\0020\t2\b\b\002\020-\032\0020.H@¢\006\002\020/\032\024\0201\032\002022\f\0203\032\b\022\004\022\002040\003\032\024\0205\032\b\022\004\022\0020\t0\0032\006\0206\032\0020\t\"\016\0200\032\0020\tXT¢\006\002\n\000¨\0067"}, d2 = {"formatHierarchy", "", "elements", "", "Lcom/intellij/psi/PsiElement;", "format", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/FormatHierarchyParams;", "consumer", "Lkotlin/Function2;", "", "getElementRange", "document", "Lcom/intellij/openapi/editor/Document;", "element", "getLineRange", "Lkotlin/Pair;", "", "startOffset", "endOffset", "getImportRange", "combineImportRanges", "ranges", "maxDist", "maxStartLine", "printImportStatements", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ElementProvider$ImportStatementInfo;", "importRanges", "separator", "removeLineRange", "getTextByXMLTag", "content", "tag", "getTextByXMLTagNoTrim", "getTrajectoryElementAgent", "Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;", "agentType", "agentParameters", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;", "logTrajectories", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "systemMessage", "prompt", "rawResponse", "response", "execTime", "", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "responseSeparator", "combineMultipleResponse", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;", "optionsToRank", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "splitMultipleResponse", "combineResponse", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nExtractorUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExtractorUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ExtractorUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,183:1\n774#2:184\n865#2,2:185\n1485#2:187\n1510#2,3:188\n1513#2,3:198\n1863#2,2:204\n1863#2,2:206\n1053#2:209\n381#3,7:191\n126#4:201\n153#4,2:202\n155#4:208\n205#5:210\n*S KotlinDebug\n*F\n+ 1 ExtractorUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ExtractorUtilsKt\n*L\n68#1:184\n68#1:185,2\n68#1:187\n68#1:188,3\n68#1:198,3\n70#1:204,2\n75#1:206,2\n112#1:209\n68#1:191,7\n68#1:201\n68#1:202,2\n68#1:208\n153#1:210\n*E\n"})
/*     */ public final class ExtractorUtilsKt {
/*     */   @NotNull
/*     */   private static final String responseSeparator = "#!#!#!#";
/*     */   
/*     */   private static final Unit formatHierarchy$lambda$5$lambda$3(List<Pair> $linesCollected, PsiElement element, String text) {
/*     */     Intrinsics.checkNotNullParameter(element, "element");
/*     */     Intrinsics.checkNotNullParameter(text, "text");
/*     */     $linesCollected.add(TuplesKt.to(element, text));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @RequiresReadLock
/*     */   @NotNull
/*     */   public static final String formatHierarchy(@NotNull List<? extends PsiElement> elements, @NotNull FormatHierarchyParams format) {
/*     */     Intrinsics.checkNotNullParameter(elements, "elements");
/*     */     Intrinsics.checkNotNullParameter(format, "format");
/*     */     StringBuilder builder = new StringBuilder();
/*     */     formatHierarchy(elements, format, builder::formatHierarchy$lambda$6);
/*     */     Intrinsics.checkNotNullExpressionValue(builder.toString(), "toString(...)");
/*     */     return builder.toString();
/*     */   }
/*     */   
/*     */   private static final Unit formatHierarchy$lambda$6(StringBuilder $builder, PsiElement element, String text) {
/*     */     Intrinsics.checkNotNullParameter(element, "element");
/*     */     Intrinsics.checkNotNullParameter(text, "text");
/*     */     if (element.getContainingFile() != null) {
/*     */       StringBuilder stringBuilder = $builder;
/*     */       Intrinsics.checkNotNullExpressionValue(element.getContainingFile(), "getContainingFile(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(element.getProject(), "getProject(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(stringBuilder.append(AgentUtilsKt.relativePath(element.getContainingFile(), element.getProject()) + ":: " + AgentUtilsKt.relativePath(element.getContainingFile(), element.getProject())), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(stringBuilder.append(AgentUtilsKt.relativePath(element.getContainingFile(), element.getProject()) + ":: " + AgentUtilsKt.relativePath(element.getContainingFile(), element.getProject())).append('\n'), "append(...)");
/*     */       stringBuilder.append(AgentUtilsKt.relativePath(element.getContainingFile(), element.getProject()) + ":: " + AgentUtilsKt.relativePath(element.getContainingFile(), element.getProject())).append('\n');
/*     */     } 
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final String getElementRange(@NotNull Document document, @NotNull PsiElement element) {
/*     */     Intrinsics.checkNotNullParameter(document, "document");
/*     */     Intrinsics.checkNotNullParameter(element, "element");
/*     */     TextRange classTextRange = element.getTextRange();
/*     */     Pair<Integer, Integer> pair = getLineRange(document, classTextRange.getStartOffset(), classTextRange.getEndOffset());
/*     */     int classStartLine = ((Number)pair.component1()).intValue(), classEndLine = ((Number)pair.component2()).intValue();
/*     */     return "(" + classStartLine + "-" + classEndLine + ")";
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Pair<Integer, Integer> getLineRange(@NotNull Document document, int startOffset, int endOffset) {
/*     */     Intrinsics.checkNotNullParameter(document, "document");
/*     */     int startLine = document.getLineNumber(startOffset) + 1;
/*     */     int endLine = document.getLineNumber(endOffset) + 1;
/*     */     return new Pair(Integer.valueOf(startLine), Integer.valueOf(endLine));
/*     */   }
/*     */   
/*     */   @RequiresReadLock
/*  68 */   public static final void formatHierarchy(@NotNull List elements, @NotNull FormatHierarchyParams format, @NotNull Function2 consumer) { Intrinsics.checkNotNullParameter(elements, "elements"); Intrinsics.checkNotNullParameter(format, "format"); Intrinsics.checkNotNullParameter(consumer, "consumer"); Iterable $this$filter$iv = elements; int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 184 */     Iterable iterable1 = $this$filter$iv; Collection<Object> collection = new ArrayList(); int $i$f$filterTo = 0;
/* 185 */     for (Object element$iv$iv : iterable1) { PsiElement it = (PsiElement)element$iv$iv; int $i$a$-filter-ExtractorUtilsKt$formatHierarchy$1 = 0; if ((it.getContainingFile() != null)) collection.add(element$iv$iv);  }
/* 186 */      $this$filter$iv = collection; int $i$f$groupBy = 0;
/* 187 */     Iterable $this$filterTo$iv$iv = $this$filter$iv; Map<Object, Object> map3 = new LinkedHashMap<>(); int $i$f$groupByTo = 0;
/* 188 */     for (Object element$iv$iv : $this$filterTo$iv$iv) {
/* 189 */       PsiElement it = (PsiElement)element$iv$iv; int $i$a$-groupBy-ExtractorUtilsKt$formatHierarchy$2 = 0; Object key$iv$iv = it.getContainingFile();
/* 190 */       Map<Object, Object> $this$getOrPut$iv$iv$iv = map3; int $i$f$getOrPut = 0;
/* 191 */       Object value$iv$iv$iv = $this$getOrPut$iv$iv$iv.get(key$iv$iv);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 200 */     Map<Object, Object> map1 = map3; int $i$f$map = 0;
/* 201 */     Map<Object, Object> map2 = map1; Collection destination$iv$iv = new ArrayList(map1.size()); int $i$f$mapTo = 0;
/* 202 */     for (Map.Entry<Object, Object> item$iv$iv : map2.entrySet()) {
/* 203 */       Map.Entry<Object, Object> entry1 = item$iv$iv; Collection collection1 = destination$iv$iv; int $i$a$-map-ExtractorUtilsKt$formatHierarchy$3 = 0; PsiFile file = (PsiFile)entry1.getKey(); List list = (List)entry1.getValue(); Intrinsics.checkNotNull(file); PsiTrie trie = new PsiTrie(file); Iterable $this$forEach$iv = list; int $i$f$forEach = 0;
/* 204 */       Iterator iterator = $this$forEach$iv.iterator();
/*     */     } 
/*     */ 
/*     */     
/* 208 */     (List)destination$iv$iv; }
/* 209 */   @NotNull public static final Pair<Integer, Integer> getImportRange(@NotNull Document document, @NotNull PsiElement element) { Intrinsics.checkNotNullParameter(document, "document"); Intrinsics.checkNotNullParameter(element, "element"); TextRange importTextRange = element.getTextRange(); return getLineRange(document, importTextRange.getStartOffset(), importTextRange.getEndOffset()); } @Nullable public static final Pair<Integer, Integer> combineImportRanges(@NotNull List ranges, int maxDist, int maxStartLine) { Intrinsics.checkNotNullParameter(ranges, "ranges"); if (ranges.isEmpty()) return null;  Iterable $this$sortedBy$iv = CollectionsKt.distinct(ranges); int $i$f$sortedBy = 0; List<Pair> sortedRanges = CollectionsKt.sortedWith($this$sortedBy$iv, new ExtractorUtilsKt$combineImportRanges$$inlined$sortedBy$1()); if (((Number)((Pair)sortedRanges.get(0)).getFirst()).intValue() > maxStartLine) return null;  Pair<Integer, Integer> currentRange = sortedRanges.get(0); for (int i = 1, j = sortedRanges.size(); i < j; ) { Pair nextRange = sortedRanges.get(i); if (((Number)nextRange.getFirst()).intValue() - ((Number)currentRange.getSecond()).intValue() <= maxDist) { currentRange = new Pair(currentRange.getFirst(), Integer.valueOf(Math.max(((Number)currentRange.getSecond()).intValue(), ((Number)nextRange.getSecond()).intValue()))); i++; }  }  return currentRange; } @Nullable public static final ElementProvider.ImportStatementInfo printImportStatements(@NotNull List importRanges, @NotNull Document document, @NotNull String separator) { Intrinsics.checkNotNullParameter(importRanges, "importRanges"); Intrinsics.checkNotNullParameter(document, "document"); Intrinsics.checkNotNullParameter(separator, "separator"); Pair<Integer, Integer> importRange = combineImportRanges$default(importRanges, 0, 0, 6, null); if (importRange == null) return null;  String text = AgentUtilsKt.printScreenPart(((Number)importRange.getFirst()).intValue(), separator, ((Number)importRange.getSecond()).intValue() + 1, document); return new ElementProvider.ImportStatementInfo(text, importRange); }
/* 210 */   @NotNull public static final TrajectoryElementAgent getTrajectoryElementAgent(@NotNull String agentType, @NotNull RelevantSymbolsExtractorParameters agentParameters) { Intrinsics.checkNotNullParameter(agentType, "agentType"); Intrinsics.checkNotNullParameter(agentParameters, "agentParameters"); Json json = JsonKt.Json$default(null, ExtractorUtilsKt::getTrajectoryElementAgent$lambda$8, 1, null); String modelName = agentParameters.getModelParameters().getModel().toString(); Json this_$iv = json; int $i$f$encodeToString = 0; this_$iv.getSerializersModule(); String agentParametersStr = this_$iv.encodeToString((SerializationStrategy)RelevantSymbolsExtractorParameters.Companion.serializer(), agentParameters);
/*     */     return new TrajectoryElementAgent(agentType, "0.1", modelName, agentParametersStr, null, 16, null); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final String removeLineRange(@NotNull String $this$removeLineRange) {
/*     */     Intrinsics.checkNotNullParameter($this$removeLineRange, "<this>");
/*     */     Regex pattern = new Regex("\\(\\d+-\\d+\\)$");
/*     */     CharSequence charSequence = $this$removeLineRange;
/*     */     String str = "";
/*     */     return StringsKt.trim(pattern.replace(charSequence, str)).toString();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final String getTextByXMLTag(@NotNull String content, @NotNull String tag) {
/*     */     Intrinsics.checkNotNullParameter(content, "content");
/*     */     Intrinsics.checkNotNullParameter(tag, "tag");
/*     */     Regex regex = new Regex("<" + tag + ">(.*?)</" + tag + ">", RegexOption.DOT_MATCHES_ALL);
/*     */     if (Regex.find$default(regex, content, 0, 2, null) == null || Regex.find$default(regex, content, 0, 2, null).getGroups() == null || Regex.find$default(regex, content, 0, 2, null).getGroups().get(1) == null || Regex.find$default(regex, content, 0, 2, null).getGroups().get(1).getValue() == null || StringsKt.trim(Regex.find$default(regex, content, 0, 2, null).getGroups().get(1).getValue()).toString() == null)
/*     */       StringsKt.trim(Regex.find$default(regex, content, 0, 2, null).getGroups().get(1).getValue()).toString(); 
/*     */     return "";
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final String getTextByXMLTagNoTrim(@NotNull String content, @NotNull String tag) {
/*     */     Intrinsics.checkNotNullParameter(content, "content");
/*     */     Intrinsics.checkNotNullParameter(tag, "tag");
/*     */     Regex regex = new Regex("<" + tag + ">(.*?)</" + tag + ">", RegexOption.DOT_MATCHES_ALL);
/*     */     Regex.find$default(regex, content, 0, 2, null).getGroups().get(1);
/*     */     return (Regex.find$default(regex, content, 0, 2, null) != null && Regex.find$default(regex, content, 0, 2, null).getGroups() != null && Regex.find$default(regex, content, 0, 2, null).getGroups().get(1) != null) ? Regex.find$default(regex, content, 0, 2, null).getGroups().get(1).getValue() : null;
/*     */   }
/*     */   
/*     */   private static final Unit getTrajectoryElementAgent$lambda$8(JsonBuilder $this$Json) {
/*     */     Intrinsics.checkNotNullParameter($this$Json, "$this$Json");
/*     */     $this$Json.setEncodeDefaults(true);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Object logTrajectories(@NotNull ExecutionContext context, @NotNull String agentType, @NotNull RelevantSymbolsExtractorParameters agentParameters, @NotNull String systemMessage, @NotNull String prompt, @NotNull String rawResponse, @NotNull String response, long execTime, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #9
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ExtractorUtilsKt$logTrajectories$1
/*     */     //   5: ifeq -> 43
/*     */     //   8: aload #9
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ExtractorUtilsKt$logTrajectories$1
/*     */     //   13: astore #13
/*     */     //   15: aload #13
/*     */     //   17: getfield label : I
/*     */     //   20: ldc_w -2147483648
/*     */     //   23: iand
/*     */     //   24: ifeq -> 43
/*     */     //   27: aload #13
/*     */     //   29: dup
/*     */     //   30: getfield label : I
/*     */     //   33: ldc_w -2147483648
/*     */     //   36: isub
/*     */     //   37: putfield label : I
/*     */     //   40: goto -> 54
/*     */     //   43: new com/intellij/ml/llm/matterhorn/ej/core/relevance/extractors/ExtractorUtilsKt$logTrajectories$1
/*     */     //   46: dup
/*     */     //   47: aload #9
/*     */     //   49: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   52: astore #13
/*     */     //   54: aload #13
/*     */     //   56: getfield result : Ljava/lang/Object;
/*     */     //   59: astore #12
/*     */     //   61: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   64: astore #14
/*     */     //   66: aload #13
/*     */     //   68: getfield label : I
/*     */     //   71: tableswitch default -> 792, 0 -> 104, 1 -> 230, 2 -> 425, 3 -> 621, 4 -> 780
/*     */     //   104: aload #12
/*     */     //   106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   109: aload_1
/*     */     //   110: aload_2
/*     */     //   111: invokestatic getTrajectoryElementAgent : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;)Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;
/*     */     //   114: astore #10
/*     */     //   116: aload_3
/*     */     //   117: checkcast java/lang/CharSequence
/*     */     //   120: invokeinterface length : ()I
/*     */     //   125: ifle -> 132
/*     */     //   128: iconst_1
/*     */     //   129: goto -> 133
/*     */     //   132: iconst_0
/*     */     //   133: ifeq -> 312
/*     */     //   136: aload_0
/*     */     //   137: new com/intellij/ml/llm/matterhorn/UserTrajectoryElement
/*     */     //   140: dup
/*     */     //   141: aload #10
/*     */     //   143: aload_3
/*     */     //   144: ldc_w 'system'
/*     */     //   147: iconst_0
/*     */     //   148: bipush #8
/*     */     //   150: aconst_null
/*     */     //   151: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   154: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*     */     //   157: aload #13
/*     */     //   159: aload #13
/*     */     //   161: aload_0
/*     */     //   162: putfield L$0 : Ljava/lang/Object;
/*     */     //   165: aload #13
/*     */     //   167: aload_1
/*     */     //   168: putfield L$1 : Ljava/lang/Object;
/*     */     //   171: aload #13
/*     */     //   173: aload_2
/*     */     //   174: putfield L$2 : Ljava/lang/Object;
/*     */     //   177: aload #13
/*     */     //   179: aload #4
/*     */     //   181: putfield L$3 : Ljava/lang/Object;
/*     */     //   184: aload #13
/*     */     //   186: aload #5
/*     */     //   188: putfield L$4 : Ljava/lang/Object;
/*     */     //   191: aload #13
/*     */     //   193: aload #6
/*     */     //   195: putfield L$5 : Ljava/lang/Object;
/*     */     //   198: aload #13
/*     */     //   200: aload #10
/*     */     //   202: putfield L$6 : Ljava/lang/Object;
/*     */     //   205: aload #13
/*     */     //   207: lload #7
/*     */     //   209: putfield J$0 : J
/*     */     //   212: aload #13
/*     */     //   214: iconst_1
/*     */     //   215: putfield label : I
/*     */     //   218: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   221: dup
/*     */     //   222: aload #14
/*     */     //   224: if_acmpne -> 311
/*     */     //   227: aload #14
/*     */     //   229: areturn
/*     */     //   230: aload #13
/*     */     //   232: getfield J$0 : J
/*     */     //   235: lstore #7
/*     */     //   237: aload #13
/*     */     //   239: getfield L$6 : Ljava/lang/Object;
/*     */     //   242: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*     */     //   245: astore #10
/*     */     //   247: aload #13
/*     */     //   249: getfield L$5 : Ljava/lang/Object;
/*     */     //   252: checkcast java/lang/String
/*     */     //   255: astore #6
/*     */     //   257: aload #13
/*     */     //   259: getfield L$4 : Ljava/lang/Object;
/*     */     //   262: checkcast java/lang/String
/*     */     //   265: astore #5
/*     */     //   267: aload #13
/*     */     //   269: getfield L$3 : Ljava/lang/Object;
/*     */     //   272: checkcast java/lang/String
/*     */     //   275: astore #4
/*     */     //   277: aload #13
/*     */     //   279: getfield L$2 : Ljava/lang/Object;
/*     */     //   282: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters
/*     */     //   285: astore_2
/*     */     //   286: aload #13
/*     */     //   288: getfield L$1 : Ljava/lang/Object;
/*     */     //   291: checkcast java/lang/String
/*     */     //   294: astore_1
/*     */     //   295: aload #13
/*     */     //   297: getfield L$0 : Ljava/lang/Object;
/*     */     //   300: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   303: astore_0
/*     */     //   304: aload #12
/*     */     //   306: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   309: aload #12
/*     */     //   311: pop
/*     */     //   312: aload #4
/*     */     //   314: checkcast java/lang/CharSequence
/*     */     //   317: invokeinterface length : ()I
/*     */     //   322: ifle -> 329
/*     */     //   325: iconst_1
/*     */     //   326: goto -> 330
/*     */     //   329: iconst_0
/*     */     //   330: ifeq -> 497
/*     */     //   333: aload_0
/*     */     //   334: new com/intellij/ml/llm/matterhorn/UserTrajectoryElement
/*     */     //   337: dup
/*     */     //   338: aload #10
/*     */     //   340: aload #4
/*     */     //   342: aconst_null
/*     */     //   343: iconst_0
/*     */     //   344: bipush #12
/*     */     //   346: aconst_null
/*     */     //   347: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   350: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*     */     //   353: aload #13
/*     */     //   355: aload #13
/*     */     //   357: aload_0
/*     */     //   358: putfield L$0 : Ljava/lang/Object;
/*     */     //   361: aload #13
/*     */     //   363: aload_1
/*     */     //   364: putfield L$1 : Ljava/lang/Object;
/*     */     //   367: aload #13
/*     */     //   369: aload_2
/*     */     //   370: putfield L$2 : Ljava/lang/Object;
/*     */     //   373: aload #13
/*     */     //   375: aload #5
/*     */     //   377: putfield L$3 : Ljava/lang/Object;
/*     */     //   380: aload #13
/*     */     //   382: aload #6
/*     */     //   384: putfield L$4 : Ljava/lang/Object;
/*     */     //   387: aload #13
/*     */     //   389: aload #10
/*     */     //   391: putfield L$5 : Ljava/lang/Object;
/*     */     //   394: aload #13
/*     */     //   396: aconst_null
/*     */     //   397: putfield L$6 : Ljava/lang/Object;
/*     */     //   400: aload #13
/*     */     //   402: lload #7
/*     */     //   404: putfield J$0 : J
/*     */     //   407: aload #13
/*     */     //   409: iconst_2
/*     */     //   410: putfield label : I
/*     */     //   413: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   416: dup
/*     */     //   417: aload #14
/*     */     //   419: if_acmpne -> 496
/*     */     //   422: aload #14
/*     */     //   424: areturn
/*     */     //   425: aload #13
/*     */     //   427: getfield J$0 : J
/*     */     //   430: lstore #7
/*     */     //   432: aload #13
/*     */     //   434: getfield L$5 : Ljava/lang/Object;
/*     */     //   437: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*     */     //   440: astore #10
/*     */     //   442: aload #13
/*     */     //   444: getfield L$4 : Ljava/lang/Object;
/*     */     //   447: checkcast java/lang/String
/*     */     //   450: astore #6
/*     */     //   452: aload #13
/*     */     //   454: getfield L$3 : Ljava/lang/Object;
/*     */     //   457: checkcast java/lang/String
/*     */     //   460: astore #5
/*     */     //   462: aload #13
/*     */     //   464: getfield L$2 : Ljava/lang/Object;
/*     */     //   467: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters
/*     */     //   470: astore_2
/*     */     //   471: aload #13
/*     */     //   473: getfield L$1 : Ljava/lang/Object;
/*     */     //   476: checkcast java/lang/String
/*     */     //   479: astore_1
/*     */     //   480: aload #13
/*     */     //   482: getfield L$0 : Ljava/lang/Object;
/*     */     //   485: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   488: astore_0
/*     */     //   489: aload #12
/*     */     //   491: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   494: aload #12
/*     */     //   496: pop
/*     */     //   497: aload #5
/*     */     //   499: checkcast java/lang/CharSequence
/*     */     //   502: invokeinterface length : ()I
/*     */     //   507: ifle -> 514
/*     */     //   510: iconst_1
/*     */     //   511: goto -> 515
/*     */     //   514: iconst_0
/*     */     //   515: ifeq -> 665
/*     */     //   518: aload_1
/*     */     //   519: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   524: aload_2
/*     */     //   525: invokestatic getTrajectoryElementAgent : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;)Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;
/*     */     //   528: astore #11
/*     */     //   530: aload_0
/*     */     //   531: new com/intellij/ml/llm/matterhorn/UserTrajectoryElement
/*     */     //   534: dup
/*     */     //   535: aload #11
/*     */     //   537: aload #5
/*     */     //   539: aconst_null
/*     */     //   540: iconst_0
/*     */     //   541: bipush #12
/*     */     //   543: aconst_null
/*     */     //   544: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   547: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*     */     //   550: aload #13
/*     */     //   552: aload #13
/*     */     //   554: aload_0
/*     */     //   555: putfield L$0 : Ljava/lang/Object;
/*     */     //   558: aload #13
/*     */     //   560: aload #6
/*     */     //   562: putfield L$1 : Ljava/lang/Object;
/*     */     //   565: aload #13
/*     */     //   567: aload #10
/*     */     //   569: putfield L$2 : Ljava/lang/Object;
/*     */     //   572: aload #13
/*     */     //   574: aconst_null
/*     */     //   575: putfield L$3 : Ljava/lang/Object;
/*     */     //   578: aload #13
/*     */     //   580: aconst_null
/*     */     //   581: putfield L$4 : Ljava/lang/Object;
/*     */     //   584: aload #13
/*     */     //   586: aconst_null
/*     */     //   587: putfield L$5 : Ljava/lang/Object;
/*     */     //   590: aload #13
/*     */     //   592: aconst_null
/*     */     //   593: putfield L$6 : Ljava/lang/Object;
/*     */     //   596: aload #13
/*     */     //   598: lload #7
/*     */     //   600: putfield J$0 : J
/*     */     //   603: aload #13
/*     */     //   605: iconst_3
/*     */     //   606: putfield label : I
/*     */     //   609: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   612: dup
/*     */     //   613: aload #14
/*     */     //   615: if_acmpne -> 664
/*     */     //   618: aload #14
/*     */     //   620: areturn
/*     */     //   621: aload #13
/*     */     //   623: getfield J$0 : J
/*     */     //   626: lstore #7
/*     */     //   628: aload #13
/*     */     //   630: getfield L$2 : Ljava/lang/Object;
/*     */     //   633: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*     */     //   636: astore #10
/*     */     //   638: aload #13
/*     */     //   640: getfield L$1 : Ljava/lang/Object;
/*     */     //   643: checkcast java/lang/String
/*     */     //   646: astore #6
/*     */     //   648: aload #13
/*     */     //   650: getfield L$0 : Ljava/lang/Object;
/*     */     //   653: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   656: astore_0
/*     */     //   657: aload #12
/*     */     //   659: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   662: aload #12
/*     */     //   664: pop
/*     */     //   665: lload #7
/*     */     //   667: lconst_0
/*     */     //   668: lcmp
/*     */     //   669: iflt -> 682
/*     */     //   672: lload #7
/*     */     //   674: <illegal opcode> makeConcatWithConstants : (J)Ljava/lang/String;
/*     */     //   679: goto -> 684
/*     */     //   682: ldc ''
/*     */     //   684: astore #11
/*     */     //   686: aload_0
/*     */     //   687: new com/intellij/ml/llm/matterhorn/AssistantTrajectoryElement
/*     */     //   690: dup
/*     */     //   691: aload #10
/*     */     //   693: aload #6
/*     */     //   695: aload #11
/*     */     //   697: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   702: ldc ''
/*     */     //   704: ldc ''
/*     */     //   706: aconst_null
/*     */     //   707: aconst_null
/*     */     //   708: aconst_null
/*     */     //   709: bipush #64
/*     */     //   711: aconst_null
/*     */     //   712: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   715: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*     */     //   718: aload #13
/*     */     //   720: aload #13
/*     */     //   722: aconst_null
/*     */     //   723: putfield L$0 : Ljava/lang/Object;
/*     */     //   726: aload #13
/*     */     //   728: aconst_null
/*     */     //   729: putfield L$1 : Ljava/lang/Object;
/*     */     //   732: aload #13
/*     */     //   734: aconst_null
/*     */     //   735: putfield L$2 : Ljava/lang/Object;
/*     */     //   738: aload #13
/*     */     //   740: aconst_null
/*     */     //   741: putfield L$3 : Ljava/lang/Object;
/*     */     //   744: aload #13
/*     */     //   746: aconst_null
/*     */     //   747: putfield L$4 : Ljava/lang/Object;
/*     */     //   750: aload #13
/*     */     //   752: aconst_null
/*     */     //   753: putfield L$5 : Ljava/lang/Object;
/*     */     //   756: aload #13
/*     */     //   758: aconst_null
/*     */     //   759: putfield L$6 : Ljava/lang/Object;
/*     */     //   762: aload #13
/*     */     //   764: iconst_4
/*     */     //   765: putfield label : I
/*     */     //   768: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   771: dup
/*     */     //   772: aload #14
/*     */     //   774: if_acmpne -> 787
/*     */     //   777: aload #14
/*     */     //   779: areturn
/*     */     //   780: aload #12
/*     */     //   782: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   785: aload #12
/*     */     //   787: pop
/*     */     //   788: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   791: areturn
/*     */     //   792: new java/lang/IllegalStateException
/*     */     //   795: dup
/*     */     //   796: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   799: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   802: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #157	-> 64
/*     */     //   #159	-> 109
/*     */     //   #160	-> 116
/*     */     //   #160	-> 133
/*     */     //   #161	-> 136
/*     */     //   #157	-> 227
/*     */     //   #163	-> 311
/*     */     //   #163	-> 330
/*     */     //   #164	-> 333
/*     */     //   #157	-> 422
/*     */     //   #166	-> 496
/*     */     //   #166	-> 515
/*     */     //   #167	-> 518
/*     */     //   #168	-> 530
/*     */     //   #157	-> 618
/*     */     //   #170	-> 664
/*     */     //   #171	-> 686
/*     */     //   #157	-> 777
/*     */     //   #172	-> 787
/*     */     //   #157	-> 792
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   109	121	0	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   304	121	0	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   489	132	0	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   657	114	0	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   109	121	1	agentType	Ljava/lang/String;
/*     */     //   295	130	1	agentType	Ljava/lang/String;
/*     */     //   480	35	1	agentType	Ljava/lang/String;
/*     */     //   515	15	1	agentType	Ljava/lang/String;
/*     */     //   109	121	2	agentParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;
/*     */     //   286	139	2	agentParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;
/*     */     //   471	44	2	agentParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;
/*     */     //   515	15	2	agentParameters	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;
/*     */     //   109	24	3	systemMessage	Ljava/lang/String;
/*     */     //   133	88	3	systemMessage	Ljava/lang/String;
/*     */     //   109	121	4	prompt	Ljava/lang/String;
/*     */     //   277	53	4	prompt	Ljava/lang/String;
/*     */     //   330	86	4	prompt	Ljava/lang/String;
/*     */     //   109	121	5	rawResponse	Ljava/lang/String;
/*     */     //   267	158	5	rawResponse	Ljava/lang/String;
/*     */     //   462	53	5	rawResponse	Ljava/lang/String;
/*     */     //   515	97	5	rawResponse	Ljava/lang/String;
/*     */     //   109	121	6	response	Ljava/lang/String;
/*     */     //   257	168	6	response	Ljava/lang/String;
/*     */     //   452	169	6	response	Ljava/lang/String;
/*     */     //   648	123	6	response	Ljava/lang/String;
/*     */     //   109	121	7	execTime	J
/*     */     //   237	188	7	execTime	J
/*     */     //   432	189	7	execTime	J
/*     */     //   628	54	7	execTime	J
/*     */     //   116	114	10	curTrajectoryElementAgent	Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;
/*     */     //   247	178	10	curTrajectoryElementAgent	Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;
/*     */     //   442	179	10	curTrajectoryElementAgent	Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;
/*     */     //   638	133	10	curTrajectoryElementAgent	Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;
/*     */     //   530	82	11	curTrajectoryElementAgentRaw	Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;
/*     */     //   686	85	11	execTimeStr	Ljava/lang/String;
/*     */     //   0	803	9	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   54	738	13	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   61	731	12	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final MatterhornChatMessage combineMultipleResponse(@NotNull List optionsToRank) {
/*     */     Intrinsics.checkNotNullParameter(optionsToRank, "optionsToRank");
/*     */     return new MatterhornChatMessage(CollectionsKt.joinToString$default(optionsToRank, "#!#!#!#", null, null, 0, null, ExtractorUtilsKt::combineMultipleResponse$lambda$9, 30, null), MatterhornChatMessageKind.Assistant, null, null, 12, null);
/*     */   }
/*     */   
/*     */   private static final CharSequence combineMultipleResponse$lambda$9(MatterhornChatElement it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return it.getContent();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final List<String> splitMultipleResponse(@NotNull String combineResponse) {
/*     */     Intrinsics.checkNotNullParameter(combineResponse, "combineResponse");
/*     */     String[] arrayOfString = new String[1];
/*     */     arrayOfString[0] = "#!#!#!#";
/*     */     return StringsKt.split$default(combineResponse, arrayOfString, false, 0, 6, null);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ExtractorUtils.kt", l = {161, 164, 168, 171}, i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "L$0", "L$1", "L$2", "J$0"}, n = {"context", "agentType", "agentParameters", "prompt", "rawResponse", "response", "curTrajectoryElementAgent", "execTime", "context", "agentType", "agentParameters", "rawResponse", "response", "curTrajectoryElementAgent", "execTime", "context", "response", "curTrajectoryElementAgent", "execTime"}, m = "logTrajectories", c = "com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.ExtractorUtilsKt")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ExtractorUtilsKt$logTrajectories$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     long J$0;
/*     */     int label;
/*     */     
/*     */     ExtractorUtilsKt$logTrajectories$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ExtractorUtilsKt.logTrajectories(null, null, null, null, null, null, null, 0L, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\extractors\ExtractorUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */