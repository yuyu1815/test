/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.services.ProjectSearchEverywhereService;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.services.search.SearchResultItem;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.services.search.SearchResultsFilter;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import java.nio.file.Path;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\013\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020#\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\b\026\030\000 :2\0020\001:\005:;<=>B\007¢\006\004\b\002\020\003J\036\020\017\032\0020\0052\006\020\020\032\0020\0212\006\020\022\032\0020\023H@¢\006\002\020\024J\020\020\025\032\004\030\0010\026*\004\030\0010\027H\002JP\020\030\032\0020\0052\006\020\030\032\0020\0312\006\020\032\032\0020\0052\n\b\002\020\033\032\004\030\0010\0262$\b\002\020\034\032\036\b\001\022\004\022\0020\036\022\n\022\b\022\004\022\0020 0\037\022\006\022\004\030\0010!0\035H@¢\006\002\020\"JN\020#\032\0020\005*\b\022\004\022\0020$0\t2\006\020\032\032\0020\0052\b\020\033\032\004\030\0010\0262\"\020\034\032\036\b\001\022\004\022\0020\036\022\n\022\b\022\004\022\0020 0\037\022\006\022\004\030\0010!0\035H@¢\006\002\020%J\032\020&\032\0020\0052\006\020\032\032\0020\0052\b\020\033\032\004\030\0010\026H\002Jo\020'\032\0020(*\b\022\004\022\0020)0\t2\006\020*\032\0020\0052\n\020+\032\0060,j\002`-2\"\020\034\032\036\b\001\022\004\022\0020\036\022\n\022\b\022\004\022\0020 0\037\022\006\022\004\030\0010!0\0352\035\020.\032\031\022\n\022\b\022\004\022\0020)0\t\022\004\022\002000/¢\006\002\b1H@¢\006\002\0202J \020#\032\00200*\b\022\004\022\0020)0\t2\f\0203\032\b\022\004\022\0020504H\002J\026\0206\032\004\030\0010\027*\002072\006\0208\032\00209H\002R\024\020\004\032\0020\005XD¢\006\b\n\000\032\004\b\006\020\007R\032\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\r\032\0020\005X\004¢\006\b\n\000\032\004\b\016\020\007¨\006?"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "arguments", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/Argument;", "getArguments", "()Ljava/util/List;", "docstring", "getDocstring", "execute", "request", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFilter", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;", "Lcom/intellij/psi/PsiFileSystemItem;", "searchEverywhere", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService;", "searchTerm", "filter", "mustIgnore", "Lkotlin/Function2;", "Ljava/nio/file/Path;", "Lkotlin/coroutines/Continuation;", "", "", "(Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toFilteredResultGroup", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$SearchResultGroup;", "(Ljava/util/List;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSearchSummary", "processResults", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultItem;", "groupTitle", "result", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "process", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$FilteredResultGroup;", "Lkotlin/ExtensionFunctionType;", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/StringBuilder;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "usedResults", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$MergableSearchResultItem;", "toPsi", "Lcom/intellij/openapi/vfs/VirtualFile;", "project", "Lcom/intellij/openapi/project/Project;", "Companion", "SearchResultGroup", "FilteredResultGroup", "FileGroup", "MergableSearchResultItem", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nSearchProjectAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchProjectAction.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,275:1\n31#2,2:276\n1863#3,2:278\n774#3:280\n865#3,2:281\n1485#3:283\n1510#3,3:284\n1513#3,3:294\n827#3:307\n855#3,2:308\n827#3:310\n855#3,2:311\n1053#3:313\n1557#3:314\n1628#3,3:315\n1863#3:322\n1863#3,2:323\n1864#3:325\n1863#3,2:326\n381#4,7:287\n136#5,9:297\n216#5:306\n217#5:320\n145#5:321\n1#6:318\n1#6:319\n*S KotlinDebug\n*F\n+ 1 SearchProjectAction.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction\n*L\n102#1:276,2\n157#1:278,2\n216#1:280\n216#1:281,2\n245#1:283\n245#1:284,3\n245#1:294,3\n246#1:307\n246#1:308,2\n247#1:310\n247#1:311,2\n249#1:313\n251#1:314\n251#1:315,3\n261#1:322\n262#1:323,2\n261#1:325\n162#1:326,2\n245#1:287,7\n245#1:297,9\n245#1:306\n245#1:320\n245#1:321\n245#1:319\n*E\n"})
/*     */ public class SearchProjectAction implements AgentAction {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   
/*     */   @NotNull
/*  23 */   public String getCustomSignature() { return AgentAction.DefaultImpls.getCustomSignature(this); } @Nullable public Object getInputParams(@NotNull ActionRequest $this$getInputParams, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.getInputParams(this, $this$getInputParams, $completion); } @Nullable public Object reviewActionRequest(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.reviewActionRequest(this, request, context, $completion); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\002\n\002\020\b\n\002\b\b\n\002\020\t\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\n\020\022\032\0020\005*\0020\023J\034\020\024\032\0020\005*\0020\0232\006\020\025\032\0020\b2\006\020\026\032\0020\027H\002R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000R\016\020\007\032\0020\bXT¢\006\002\n\000R\016\020\t\032\0020\bXT¢\006\002\n\000R\016\020\n\032\0020\005XT¢\006\002\n\000R\016\020\013\032\0020\005XT¢\006\002\n\000R\016\020\f\032\0020\005XT¢\006\002\n\000R\016\020\r\032\0020\005XT¢\006\002\n\000R\016\020\016\032\0020\005XT¢\006\002\n\000R\016\020\017\032\0020\005XT¢\006\002\n\000R\016\020\020\032\0020\021XT¢\006\002\n\000¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$Companion;", "", "<init>", "()V", "SEARCH_PROJECT_ACTION_NAME", "", "INDENT", "BLOCK_RESULTS_LIMIT", "", "MAX_SHOWN_LINE_LEN", "FOUND_FILES_TITLE", "FOUND_CLASSES_TITLE", "FOUND_SYMBOLS_TITLE", "FOUND_TEXT_TITLE", "SEARCH_TERM_ARGUMENT", "PATH_ARGUMENT", "SEARCH_TIMEOUT_MS", "", "getText", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultContent;", "getMultilineText", "lineLimit", "forceSingleLine", "", "ej-core"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final String getText(@NotNull SearchResultContent $this$getText) {
/*  41 */       Intrinsics.checkNotNullParameter($this$getText, "<this>"); return "" + $this$getText.getStartLine() + 1 + ":: " + $this$getText.getStartLine() + 1;
/*     */     }
/*     */     
/*     */     private final String getMultilineText(SearchResultContent $this$getMultilineText, int lineLimit, boolean forceSingleLine)
/*     */     {
/*  46 */       if ((String)CollectionsKt.firstOrNull(StringsKt.lines($this$getMultilineText.getLineText())) == null || StringUtilKt.truncateWithEllipsis((String)CollectionsKt.firstOrNull(StringsKt.lines($this$getMultilineText.getLineText())), 100) == null) StringUtilKt.truncateWithEllipsis((String)CollectionsKt.firstOrNull(StringsKt.lines($this$getMultilineText.getLineText())), 100);  return (forceSingleLine == true) ? (" " + "") : ("\n" + 
/*     */         
/*  48 */         StringsKt.prependIndent(CollectionsKt.joinToString$default(StringsKt.lines(StringsKt.trimIndent(CollectionsKt.joinToString$default(CollectionsKt.take(StringsKt.lines($this$getMultilineText.getLineText()), lineLimit), "\n", null, null, 0, null, null, 62, null))), "\n", null, null, 0, null, Companion::getMultilineText$lambda$0, 30, null), "  ")); } private static final CharSequence getMultilineText$lambda$0(String it) { Intrinsics.checkNotNullParameter(it, "it"); return StringUtilKt.truncateWithEllipsis(it, 100); }
/*     */      }
/*     */   
/*     */   @NotNull
/*  52 */   private final String name = "search_project"; @NotNull private final List<Argument> arguments; @NotNull private final String docstring; @NotNull public static final String SEARCH_PROJECT_ACTION_NAME = "search_project"; @NotNull public static final String INDENT = "  "; public static final int BLOCK_RESULTS_LIMIT = 100; public static final int MAX_SHOWN_LINE_LEN = 100; @NotNull public static final String FOUND_FILES_TITLE = "FOUND FILES"; @NotNull public static final String FOUND_CLASSES_TITLE = "FOUND CLASSES"; @NotNull public static final String FOUND_SYMBOLS_TITLE = "FOUND SYMBOLS"; @NotNull public static final String FOUND_TEXT_TITLE = "FOUND TEXT"; @NotNull public static final String SEARCH_TERM_ARGUMENT = "search_term"; @NotNull public static final String PATH_ARGUMENT = "path"; public static final long SEARCH_TIMEOUT_MS = 30000L; @NotNull public String getName() { return this.name; } @NotNull
/*  53 */   public List<Argument> getArguments() { return this.arguments; }
/*  54 */   public SearchProjectAction() { Argument[] arrayOfArgument = new Argument[2]; arrayOfArgument[0] = new Argument(
/*  55 */         "search_term", 
/*  56 */         ArgumentType.STRING, 
/*  57 */         "the term to search for, always surround by quotes: e.g. \"text to search\", \"some \\\"special term\\\"\"", false, 
/*  58 */         true, 8, null);
/*     */     
/*  60 */     arrayOfArgument[1] = new Argument(
/*  61 */         "path", 
/*  62 */         ArgumentType.STRING, 
/*  63 */         "full path of the directory or full path of the file to search in (if not provided, searches in whole project)", 
/*  64 */         true, false, 16, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     this.arguments = CollectionsKt.listOf((Object[])arrayOfArgument);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  92 */     this.docstring = "\nIt is a powerful in-project search.\nThis is a fuzzy search meaning that the output will contain both exact and inexact matches.\nFeel free to use `*` for wildcard matching, however note that regex (other than `*` wildcard) are not supported.\nThe command can search for:\n1. Classes\n2. Symbols (any entities in code including classes, methods, variables, etc.)\n3. Files\n4. Plain text in files\n5. All of the above\n\nNote that querying `search_project \"class User\"` narrows the scope of the search to the definition of the mentioned class\nwhich could be beneficial for having more concise search output (the same logic applies when querying `search_project \"def user_authorization\"` and other types of entities equipped by their keywords).\nQuerying `search_project \"User\"` will search for all symbols in code containing the \"User\" substring,\nfor filenames containing \"User\" and for occurrences of \"User\" anywhere in code. This mode is beneficial to get\nthe exhaustive list of everything containing \"User\" in code.\n\nIf the full code of the file has already been provided, searching within it won't yield additional information, as you already have the complete code.\n\n#### Examples\n- `search_project \"class User\"`: Finds the definition of class `User`.\n- `search_project \"def query_with_retries\"`: Finds the definition of method `query_with_retries`.\n- `search_project \"authorization\"`: Searches for anything containing \"authorization\" in filenames, symbol names, or code.\n- `search_project \"authorization\" pathToFile/example.doc`: Searches \"authorization\" inside example.doc."; } @NotNull public String getDocstring() { return this.docstring; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\004\b\007\020\bJ\t\020\r\032\0020\003HÆ\003J\017\020\016\032\b\022\004\022\0020\0060\005HÆ\003J#\020\017\032\0020\0002\b\b\002\020\002\032\0020\0032\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\001HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\026HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$SearchResultGroup;", "", "sourceType", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType;", "results", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultItem;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType;Ljava/util/List;)V", "getSourceType", "()Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType;", "getResults", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ej-core"}) public static final class SearchResultGroup { @NotNull private final ProjectSearchEverywhereService.SearchType sourceType; @NotNull
/*     */     private final List<SearchResultItem> results;
/*  94 */     public SearchResultGroup(@NotNull ProjectSearchEverywhereService.SearchType sourceType, @NotNull List<SearchResultItem> results) { this.sourceType = sourceType; this.results = results; } @NotNull public final ProjectSearchEverywhereService.SearchType getSourceType() { return this.sourceType; } @NotNull public final List<SearchResultItem> getResults() { return this.results; } @NotNull public final ProjectSearchEverywhereService.SearchType component1() { return this.sourceType; } @NotNull public final List<SearchResultItem> component2() { return this.results; } @NotNull public final SearchResultGroup copy(@NotNull ProjectSearchEverywhereService.SearchType sourceType, @NotNull List<SearchResultItem> results) { Intrinsics.checkNotNullParameter(sourceType, "sourceType"); Intrinsics.checkNotNullParameter(results, "results"); return new SearchResultGroup(sourceType, results); } @NotNull public String toString() { return "SearchResultGroup(sourceType=" + this.sourceType + ", results=" + this.results + ")"; } public int hashCode() { result = this.sourceType.hashCode(); return result * 31 + this.results.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof SearchResultGroup)) return false;  SearchResultGroup searchResultGroup = (SearchResultGroup)other; return (this.sourceType != searchResultGroup.sourceType) ? false : (!!Intrinsics.areEqual(this.results, searchResultGroup.results)); } }
/*     */    @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\n\n\002\020\013\n\002\b\004\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\005HÖ\001J\t\020\023\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$FilteredResultGroup;", "", "result", "", "count", "", "<init>", "(Ljava/lang/String;I)V", "getResult", "()Ljava/lang/String;", "getCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "ej-core"}) public static final class FilteredResultGroup {
/*  96 */     @NotNull private final String result; public FilteredResultGroup(@NotNull String result, int count) { this.result = result; this.count = count; } private final int count; @NotNull public final String getResult() { return this.result; } public final int getCount() { return this.count; } @NotNull
/*     */     public final String component1() { return this.result; } public final int component2() { return this.count; }
/*     */     @NotNull
/*     */     public final FilteredResultGroup copy(@NotNull String result, int count) { Intrinsics.checkNotNullParameter(result, "result");
/*     */       return new FilteredResultGroup(result, count); }
/*     */     @NotNull
/*     */     public String toString() { return "FilteredResultGroup(result=" + this.result + ", count=" + this.count + ")"; }
/*     */     public int hashCode() { result = this.result.hashCode();
/*     */       return result * 31 + Integer.hashCode(this.count); }
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof FilteredResultGroup))
/*     */         return false; 
/*     */       FilteredResultGroup filteredResultGroup = (FilteredResultGroup)other;
/*     */       return !Intrinsics.areEqual(this.result, filteredResultGroup.result) ? false : (!(this.count != filteredResultGroup.count));
/*     */     } }
/*     */   private static final PsiFileSystemItem execute$lambda$0(SearchProjectAction this$0, Result $res, ExecutionAgentContext $context) {
/* 114 */     return this$0.toPsi((VirtualFile)((Result.Ok)$res).getValue(), $context.getProject());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final SearchResultsFilter getFilter(PsiFileSystemItem $this$getFilter) {
/* 121 */     PsiFileSystemItem psiFileSystemItem = $this$getFilter;
/* 122 */     return (psiFileSystemItem instanceof PsiDirectory) ? (SearchResultsFilter)new DirectoryFilter((PsiDirectory)$this$getFilter) : (
/* 123 */       (psiFileSystemItem instanceof PsiFile) ? (SearchResultsFilter)new FileFilter((PsiFile)$this$getFilter) : 
/* 124 */       null);
/*     */   } @DebugMetadata(f = "SearchProjectAction.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.SearchProjectAction$searchEverywhere$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\013\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Ljava/nio/file/Path;"})
/*     */   static final class SearchProjectAction$searchEverywhere$2 extends SuspendLambda implements Function2<Path, Continuation<? super Boolean>, Object> { int label;
/*     */     SearchProjectAction$searchEverywhere$2(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/* 131 */     public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Boxing.boxBoolean(false); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super SearchProjectAction$searchEverywhere$2> $completion) { return (Continuation<Unit>)new SearchProjectAction$searchEverywhere$2($completion); }
/*     */     public final Object invoke(Path p1, Continuation<?> p2) { return ((SearchProjectAction$searchEverywhere$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/* 134 */   private final Object searchEverywhere(ProjectSearchEverywhereService searchEverywhere, String searchTerm, SearchResultsFilter filter, Function2<? super Path, ? super Continuation<? super Boolean>, ? extends Object> mustIgnore, Continuation $completion) { SearchQuery query = new SearchQuery(
/* 135 */         searchTerm, 
/* 136 */         101, 
/* 137 */         30000L, 
/* 138 */         filter);
/*     */     
/* 140 */     return CoroutineScopeKt.coroutineScope(new SearchProjectAction$searchEverywhere$3(searchEverywhere, query, searchTerm, filter, mustIgnore, null), $completion); } @DebugMetadata(f = "SearchProjectAction.kt", l = {149, 149}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.SearchProjectAction$searchEverywhere$3") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) @SourceDebugExtension({"SMAP\nSearchProjectAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchProjectAction.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$searchEverywhere$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,275:1\n1557#2:276\n1628#2,3:277\n*S KotlinDebug\n*F\n+ 1 SearchProjectAction.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$searchEverywhere$3\n*L\n142#1:276\n142#1:277,3\n*E\n"}) static final class SearchProjectAction$searchEverywhere$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> { int label; SearchProjectAction$searchEverywhere$3(ProjectSearchEverywhereService $searchEverywhere, SearchQuery $query, String $searchTerm, SearchResultsFilter $filter, Function2<Path, Continuation<? super Boolean>, Object> $mustIgnore, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { CoroutineScope $this$coroutineScope; Iterable $this$map$iv; ProjectSearchEverywhereService projectSearchEverywhereService; SearchQuery searchQuery; int $i$f$map; Iterable iterable1; Collection<Deferred> destination$iv$iv; int $i$f$mapTo; SearchProjectAction searchProjectAction; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$coroutineScope = (CoroutineScope)this.L$0;
/* 141 */           searchProjectAction = SearchProjectAction.this; $this$map$iv = this.$searchEverywhere.detectSearchTypes(this.$query);
/* 142 */           projectSearchEverywhereService = this.$searchEverywhere; searchQuery = this.$query; $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 276 */           iterable1 = $this$map$iv; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); $i$f$mapTo = 0;
/* 277 */           for (Object item$iv$iv : iterable1) {
/* 278 */             ProjectSearchEverywhereService.SearchType searchType = (ProjectSearchEverywhereService.SearchType)item$iv$iv; Collection<Deferred> collection = destination$iv$iv; int $i$a$-map-SearchProjectAction$searchEverywhere$3$1 = 0; collection.add(BuildersKt.async$default($this$coroutineScope, null, null, new SearchProjectAction$searchEverywhere$3$1$1(searchType, projectSearchEverywhereService, searchQuery, null), 3, null));
/* 279 */           }  this.L$0 = searchProjectAction; this.label = 1; if (AwaitKt.awaitAll(destination$iv$iv, (Continuation)this) == object) return object;  this.L$0 = null; this.label = 2; if (searchProjectAction.toFilteredResultGroup((List)AwaitKt.awaitAll(destination$iv$iv, (Continuation)this), this.$searchTerm, this.$filter, this.$mustIgnore, (Continuation)this) == object) return object;  return searchProjectAction.toFilteredResultGroup((List)AwaitKt.awaitAll(destination$iv$iv, (Continuation)this), this.$searchTerm, this.$filter, this.$mustIgnore, (Continuation)this);
/*     */         case 1:
/*     */           searchProjectAction = (SearchProjectAction)this.L$0;
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.L$0 = null;
/*     */           this.label = 2;
/*     */           if (searchProjectAction.toFilteredResultGroup((List)SYNTHETIC_LOCAL_VARIABLE_1, this.$searchTerm, this.$filter, this.$mustIgnore, (Continuation)this) == object) {
/*     */             return object;
/*     */           }
/*     */           return searchProjectAction.toFilteredResultGroup((List)SYNTHETIC_LOCAL_VARIABLE_1, this.$searchTerm, this.$filter, this.$mustIgnore, (Continuation)this);
/*     */         case 2:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super SearchProjectAction$searchEverywhere$3> $completion) {
/*     */       SearchProjectAction$searchEverywhere$3 searchProjectAction$searchEverywhere$3 = new SearchProjectAction$searchEverywhere$3(this.$searchEverywhere, this.$query, this.$searchTerm, this.$filter, this.$mustIgnore, $completion);
/*     */       searchProjectAction$searchEverywhere$3.L$0 = value;
/*     */       return (Continuation<Unit>)searchProjectAction$searchEverywhere$3;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((SearchProjectAction$searchEverywhere$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Object toFilteredResultGroup(List $this$toFilteredResultGroup, String searchTerm, SearchResultsFilter filter, Function2 mustIgnore, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$toFilteredResultGroup$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #5
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$toFilteredResultGroup$1
/*     */     //   13: astore #15
/*     */     //   15: aload #15
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #15
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$toFilteredResultGroup$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #5
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #15
/*     */     //   53: aload #15
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #14
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #16
/*     */     //   65: aload #15
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 980, 0 -> 104, 1 -> 310, 2 -> 481, 3 -> 652, 4 -> 823
/*     */     //   104: aload #14
/*     */     //   106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   109: new java/util/LinkedHashSet
/*     */     //   112: dup
/*     */     //   113: invokespecial <init> : ()V
/*     */     //   116: checkcast java/util/Set
/*     */     //   119: astore #6
/*     */     //   121: new java/lang/StringBuilder
/*     */     //   124: dup
/*     */     //   125: invokespecial <init> : ()V
/*     */     //   128: astore #7
/*     */     //   130: aload_1
/*     */     //   131: checkcast java/lang/Iterable
/*     */     //   134: astore #8
/*     */     //   136: iconst_0
/*     */     //   137: istore #9
/*     */     //   139: aload #8
/*     */     //   141: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   146: astore #10
/*     */     //   148: aload #10
/*     */     //   150: invokeinterface hasNext : ()Z
/*     */     //   155: ifeq -> 919
/*     */     //   158: aload #10
/*     */     //   160: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   165: astore #11
/*     */     //   167: aload #11
/*     */     //   169: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$SearchResultGroup
/*     */     //   172: astore #12
/*     */     //   174: iconst_0
/*     */     //   175: istore #13
/*     */     //   177: aload #12
/*     */     //   179: invokevirtual getSourceType : ()Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchEverywhereService$SearchType;
/*     */     //   182: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   185: swap
/*     */     //   186: invokevirtual ordinal : ()I
/*     */     //   189: iaload
/*     */     //   190: tableswitch default -> 907, 1 -> 224, 2 -> 224, 3 -> 394, 4 -> 565, 5 -> 736
/*     */     //   224: aload_0
/*     */     //   225: aload #12
/*     */     //   227: invokevirtual getResults : ()Ljava/util/List;
/*     */     //   230: ldc_w 'FOUND FILES'
/*     */     //   233: aload #7
/*     */     //   235: aload #4
/*     */     //   237: aload #6
/*     */     //   239: <illegal opcode> invoke : (Ljava/util/Set;)Lkotlin/jvm/functions/Function1;
/*     */     //   244: aload #15
/*     */     //   246: aload #15
/*     */     //   248: aload_0
/*     */     //   249: putfield L$0 : Ljava/lang/Object;
/*     */     //   252: aload #15
/*     */     //   254: aload_2
/*     */     //   255: putfield L$1 : Ljava/lang/Object;
/*     */     //   258: aload #15
/*     */     //   260: aload_3
/*     */     //   261: putfield L$2 : Ljava/lang/Object;
/*     */     //   264: aload #15
/*     */     //   266: aload #4
/*     */     //   268: putfield L$3 : Ljava/lang/Object;
/*     */     //   271: aload #15
/*     */     //   273: aload #6
/*     */     //   275: putfield L$4 : Ljava/lang/Object;
/*     */     //   278: aload #15
/*     */     //   280: aload #7
/*     */     //   282: putfield L$5 : Ljava/lang/Object;
/*     */     //   285: aload #15
/*     */     //   287: aload #10
/*     */     //   289: putfield L$6 : Ljava/lang/Object;
/*     */     //   292: aload #15
/*     */     //   294: iconst_1
/*     */     //   295: putfield label : I
/*     */     //   298: invokespecial processResults : (Ljava/util/List;Ljava/lang/String;Ljava/lang/StringBuilder;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   301: dup
/*     */     //   302: aload #16
/*     */     //   304: if_acmpne -> 390
/*     */     //   307: aload #16
/*     */     //   309: areturn
/*     */     //   310: iconst_0
/*     */     //   311: istore #9
/*     */     //   313: iconst_0
/*     */     //   314: istore #13
/*     */     //   316: aload #15
/*     */     //   318: getfield L$6 : Ljava/lang/Object;
/*     */     //   321: checkcast java/util/Iterator
/*     */     //   324: astore #10
/*     */     //   326: aload #15
/*     */     //   328: getfield L$5 : Ljava/lang/Object;
/*     */     //   331: checkcast java/lang/StringBuilder
/*     */     //   334: astore #7
/*     */     //   336: aload #15
/*     */     //   338: getfield L$4 : Ljava/lang/Object;
/*     */     //   341: checkcast java/util/Set
/*     */     //   344: astore #6
/*     */     //   346: aload #15
/*     */     //   348: getfield L$3 : Ljava/lang/Object;
/*     */     //   351: checkcast kotlin/jvm/functions/Function2
/*     */     //   354: astore #4
/*     */     //   356: aload #15
/*     */     //   358: getfield L$2 : Ljava/lang/Object;
/*     */     //   361: checkcast com/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter
/*     */     //   364: astore_3
/*     */     //   365: aload #15
/*     */     //   367: getfield L$1 : Ljava/lang/Object;
/*     */     //   370: checkcast java/lang/String
/*     */     //   373: astore_2
/*     */     //   374: aload #15
/*     */     //   376: getfield L$0 : Ljava/lang/Object;
/*     */     //   379: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction
/*     */     //   382: astore_0
/*     */     //   383: aload #14
/*     */     //   385: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   388: aload #14
/*     */     //   390: pop
/*     */     //   391: goto -> 915
/*     */     //   394: aload_0
/*     */     //   395: aload #12
/*     */     //   397: invokevirtual getResults : ()Ljava/util/List;
/*     */     //   400: ldc_w 'FOUND CLASSES'
/*     */     //   403: aload #7
/*     */     //   405: aload #4
/*     */     //   407: aload_0
/*     */     //   408: aload #6
/*     */     //   410: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction;Ljava/util/Set;)Lkotlin/jvm/functions/Function1;
/*     */     //   415: aload #15
/*     */     //   417: aload #15
/*     */     //   419: aload_0
/*     */     //   420: putfield L$0 : Ljava/lang/Object;
/*     */     //   423: aload #15
/*     */     //   425: aload_2
/*     */     //   426: putfield L$1 : Ljava/lang/Object;
/*     */     //   429: aload #15
/*     */     //   431: aload_3
/*     */     //   432: putfield L$2 : Ljava/lang/Object;
/*     */     //   435: aload #15
/*     */     //   437: aload #4
/*     */     //   439: putfield L$3 : Ljava/lang/Object;
/*     */     //   442: aload #15
/*     */     //   444: aload #6
/*     */     //   446: putfield L$4 : Ljava/lang/Object;
/*     */     //   449: aload #15
/*     */     //   451: aload #7
/*     */     //   453: putfield L$5 : Ljava/lang/Object;
/*     */     //   456: aload #15
/*     */     //   458: aload #10
/*     */     //   460: putfield L$6 : Ljava/lang/Object;
/*     */     //   463: aload #15
/*     */     //   465: iconst_2
/*     */     //   466: putfield label : I
/*     */     //   469: invokespecial processResults : (Ljava/util/List;Ljava/lang/String;Ljava/lang/StringBuilder;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   472: dup
/*     */     //   473: aload #16
/*     */     //   475: if_acmpne -> 561
/*     */     //   478: aload #16
/*     */     //   480: areturn
/*     */     //   481: iconst_0
/*     */     //   482: istore #9
/*     */     //   484: iconst_0
/*     */     //   485: istore #13
/*     */     //   487: aload #15
/*     */     //   489: getfield L$6 : Ljava/lang/Object;
/*     */     //   492: checkcast java/util/Iterator
/*     */     //   495: astore #10
/*     */     //   497: aload #15
/*     */     //   499: getfield L$5 : Ljava/lang/Object;
/*     */     //   502: checkcast java/lang/StringBuilder
/*     */     //   505: astore #7
/*     */     //   507: aload #15
/*     */     //   509: getfield L$4 : Ljava/lang/Object;
/*     */     //   512: checkcast java/util/Set
/*     */     //   515: astore #6
/*     */     //   517: aload #15
/*     */     //   519: getfield L$3 : Ljava/lang/Object;
/*     */     //   522: checkcast kotlin/jvm/functions/Function2
/*     */     //   525: astore #4
/*     */     //   527: aload #15
/*     */     //   529: getfield L$2 : Ljava/lang/Object;
/*     */     //   532: checkcast com/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter
/*     */     //   535: astore_3
/*     */     //   536: aload #15
/*     */     //   538: getfield L$1 : Ljava/lang/Object;
/*     */     //   541: checkcast java/lang/String
/*     */     //   544: astore_2
/*     */     //   545: aload #15
/*     */     //   547: getfield L$0 : Ljava/lang/Object;
/*     */     //   550: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction
/*     */     //   553: astore_0
/*     */     //   554: aload #14
/*     */     //   556: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   559: aload #14
/*     */     //   561: pop
/*     */     //   562: goto -> 915
/*     */     //   565: aload_0
/*     */     //   566: aload #12
/*     */     //   568: invokevirtual getResults : ()Ljava/util/List;
/*     */     //   571: ldc_w 'FOUND SYMBOLS'
/*     */     //   574: aload #7
/*     */     //   576: aload #4
/*     */     //   578: aload_0
/*     */     //   579: aload #6
/*     */     //   581: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction;Ljava/util/Set;)Lkotlin/jvm/functions/Function1;
/*     */     //   586: aload #15
/*     */     //   588: aload #15
/*     */     //   590: aload_0
/*     */     //   591: putfield L$0 : Ljava/lang/Object;
/*     */     //   594: aload #15
/*     */     //   596: aload_2
/*     */     //   597: putfield L$1 : Ljava/lang/Object;
/*     */     //   600: aload #15
/*     */     //   602: aload_3
/*     */     //   603: putfield L$2 : Ljava/lang/Object;
/*     */     //   606: aload #15
/*     */     //   608: aload #4
/*     */     //   610: putfield L$3 : Ljava/lang/Object;
/*     */     //   613: aload #15
/*     */     //   615: aload #6
/*     */     //   617: putfield L$4 : Ljava/lang/Object;
/*     */     //   620: aload #15
/*     */     //   622: aload #7
/*     */     //   624: putfield L$5 : Ljava/lang/Object;
/*     */     //   627: aload #15
/*     */     //   629: aload #10
/*     */     //   631: putfield L$6 : Ljava/lang/Object;
/*     */     //   634: aload #15
/*     */     //   636: iconst_3
/*     */     //   637: putfield label : I
/*     */     //   640: invokespecial processResults : (Ljava/util/List;Ljava/lang/String;Ljava/lang/StringBuilder;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   643: dup
/*     */     //   644: aload #16
/*     */     //   646: if_acmpne -> 732
/*     */     //   649: aload #16
/*     */     //   651: areturn
/*     */     //   652: iconst_0
/*     */     //   653: istore #9
/*     */     //   655: iconst_0
/*     */     //   656: istore #13
/*     */     //   658: aload #15
/*     */     //   660: getfield L$6 : Ljava/lang/Object;
/*     */     //   663: checkcast java/util/Iterator
/*     */     //   666: astore #10
/*     */     //   668: aload #15
/*     */     //   670: getfield L$5 : Ljava/lang/Object;
/*     */     //   673: checkcast java/lang/StringBuilder
/*     */     //   676: astore #7
/*     */     //   678: aload #15
/*     */     //   680: getfield L$4 : Ljava/lang/Object;
/*     */     //   683: checkcast java/util/Set
/*     */     //   686: astore #6
/*     */     //   688: aload #15
/*     */     //   690: getfield L$3 : Ljava/lang/Object;
/*     */     //   693: checkcast kotlin/jvm/functions/Function2
/*     */     //   696: astore #4
/*     */     //   698: aload #15
/*     */     //   700: getfield L$2 : Ljava/lang/Object;
/*     */     //   703: checkcast com/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter
/*     */     //   706: astore_3
/*     */     //   707: aload #15
/*     */     //   709: getfield L$1 : Ljava/lang/Object;
/*     */     //   712: checkcast java/lang/String
/*     */     //   715: astore_2
/*     */     //   716: aload #15
/*     */     //   718: getfield L$0 : Ljava/lang/Object;
/*     */     //   721: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction
/*     */     //   724: astore_0
/*     */     //   725: aload #14
/*     */     //   727: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   730: aload #14
/*     */     //   732: pop
/*     */     //   733: goto -> 915
/*     */     //   736: aload_0
/*     */     //   737: aload #12
/*     */     //   739: invokevirtual getResults : ()Ljava/util/List;
/*     */     //   742: ldc_w 'FOUND TEXT'
/*     */     //   745: aload #7
/*     */     //   747: aload #4
/*     */     //   749: aload_0
/*     */     //   750: aload #6
/*     */     //   752: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction;Ljava/util/Set;)Lkotlin/jvm/functions/Function1;
/*     */     //   757: aload #15
/*     */     //   759: aload #15
/*     */     //   761: aload_0
/*     */     //   762: putfield L$0 : Ljava/lang/Object;
/*     */     //   765: aload #15
/*     */     //   767: aload_2
/*     */     //   768: putfield L$1 : Ljava/lang/Object;
/*     */     //   771: aload #15
/*     */     //   773: aload_3
/*     */     //   774: putfield L$2 : Ljava/lang/Object;
/*     */     //   777: aload #15
/*     */     //   779: aload #4
/*     */     //   781: putfield L$3 : Ljava/lang/Object;
/*     */     //   784: aload #15
/*     */     //   786: aload #6
/*     */     //   788: putfield L$4 : Ljava/lang/Object;
/*     */     //   791: aload #15
/*     */     //   793: aload #7
/*     */     //   795: putfield L$5 : Ljava/lang/Object;
/*     */     //   798: aload #15
/*     */     //   800: aload #10
/*     */     //   802: putfield L$6 : Ljava/lang/Object;
/*     */     //   805: aload #15
/*     */     //   807: iconst_4
/*     */     //   808: putfield label : I
/*     */     //   811: invokespecial processResults : (Ljava/util/List;Ljava/lang/String;Ljava/lang/StringBuilder;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   814: dup
/*     */     //   815: aload #16
/*     */     //   817: if_acmpne -> 903
/*     */     //   820: aload #16
/*     */     //   822: areturn
/*     */     //   823: iconst_0
/*     */     //   824: istore #9
/*     */     //   826: iconst_0
/*     */     //   827: istore #13
/*     */     //   829: aload #15
/*     */     //   831: getfield L$6 : Ljava/lang/Object;
/*     */     //   834: checkcast java/util/Iterator
/*     */     //   837: astore #10
/*     */     //   839: aload #15
/*     */     //   841: getfield L$5 : Ljava/lang/Object;
/*     */     //   844: checkcast java/lang/StringBuilder
/*     */     //   847: astore #7
/*     */     //   849: aload #15
/*     */     //   851: getfield L$4 : Ljava/lang/Object;
/*     */     //   854: checkcast java/util/Set
/*     */     //   857: astore #6
/*     */     //   859: aload #15
/*     */     //   861: getfield L$3 : Ljava/lang/Object;
/*     */     //   864: checkcast kotlin/jvm/functions/Function2
/*     */     //   867: astore #4
/*     */     //   869: aload #15
/*     */     //   871: getfield L$2 : Ljava/lang/Object;
/*     */     //   874: checkcast com/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter
/*     */     //   877: astore_3
/*     */     //   878: aload #15
/*     */     //   880: getfield L$1 : Ljava/lang/Object;
/*     */     //   883: checkcast java/lang/String
/*     */     //   886: astore_2
/*     */     //   887: aload #15
/*     */     //   889: getfield L$0 : Ljava/lang/Object;
/*     */     //   892: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction
/*     */     //   895: astore_0
/*     */     //   896: aload #14
/*     */     //   898: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   901: aload #14
/*     */     //   903: pop
/*     */     //   904: goto -> 915
/*     */     //   907: new kotlin/NoWhenBranchMatchedException
/*     */     //   910: dup
/*     */     //   911: invokespecial <init> : ()V
/*     */     //   914: athrow
/*     */     //   915: nop
/*     */     //   916: goto -> 148
/*     */     //   919: nop
/*     */     //   920: aload #7
/*     */     //   922: checkcast java/lang/CharSequence
/*     */     //   925: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   928: ifne -> 935
/*     */     //   931: iconst_1
/*     */     //   932: goto -> 936
/*     */     //   935: iconst_0
/*     */     //   936: nop
/*     */     //   937: iconst_1
/*     */     //   938: if_icmpne -> 965
/*     */     //   941: aload_0
/*     */     //   942: aload_2
/*     */     //   943: aload_3
/*     */     //   944: invokespecial getSearchSummary : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;)Ljava/lang/String;
/*     */     //   947: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   952: invokestatic trimIndent : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   955: aload #7
/*     */     //   957: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;
/*     */     //   962: goto -> 979
/*     */     //   965: aload_0
/*     */     //   966: aload_2
/*     */     //   967: aload_3
/*     */     //   968: invokespecial getSearchSummary : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;)Ljava/lang/String;
/*     */     //   971: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   976: invokestatic trimIndent : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   979: areturn
/*     */     //   980: new java/lang/IllegalStateException
/*     */     //   983: dup
/*     */     //   984: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   987: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   990: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #153	-> 63
/*     */     //   #154	-> 109
/*     */     //   #154	-> 119
/*     */     //   #155	-> 121
/*     */     //   #157	-> 130
/*     */     //   #278	-> 139
/*     */     //   #158	-> 177
/*     */     //   #159	-> 224
/*     */     //   #153	-> 307
/*     */     //   #159	-> 390
/*     */     //   #173	-> 394
/*     */     //   #174	-> 400
/*     */     //   #153	-> 478
/*     */     //   #174	-> 561
/*     */     //   #176	-> 565
/*     */     //   #177	-> 571
/*     */     //   #153	-> 649
/*     */     //   #177	-> 732
/*     */     //   #179	-> 736
/*     */     //   #180	-> 742
/*     */     //   #153	-> 820
/*     */     //   #180	-> 903
/*     */     //   #158	-> 907
/*     */     //   #182	-> 915
/*     */     //   #278	-> 916
/*     */     //   #279	-> 919
/*     */     //   #184	-> 920
/*     */     //   #184	-> 936
/*     */     //   #185	-> 937
/*     */     //   #186	-> 941
/*     */     //   #191	-> 952
/*     */     //   #194	-> 965
/*     */     //   #197	-> 976
/*     */     //   #184	-> 979
/*     */     //   #153	-> 980
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   109	10	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction;
/*     */     //   119	191	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction;
/*     */     //   383	98	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction;
/*     */     //   554	98	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction;
/*     */     //   725	98	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction;
/*     */     //   896	11	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction;
/*     */     //   915	1	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction;
/*     */     //   916	4	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction;
/*     */     //   920	16	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction;
/*     */     //   936	16	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction;
/*     */     //   965	11	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction;
/*     */     //   109	10	1	$this$toFilteredResultGroup	Ljava/util/List;
/*     */     //   119	17	1	$this$toFilteredResultGroup	Ljava/util/List;
/*     */     //   109	10	2	searchTerm	Ljava/lang/String;
/*     */     //   119	191	2	searchTerm	Ljava/lang/String;
/*     */     //   374	107	2	searchTerm	Ljava/lang/String;
/*     */     //   545	107	2	searchTerm	Ljava/lang/String;
/*     */     //   716	107	2	searchTerm	Ljava/lang/String;
/*     */     //   887	20	2	searchTerm	Ljava/lang/String;
/*     */     //   915	1	2	searchTerm	Ljava/lang/String;
/*     */     //   916	4	2	searchTerm	Ljava/lang/String;
/*     */     //   920	16	2	searchTerm	Ljava/lang/String;
/*     */     //   936	16	2	searchTerm	Ljava/lang/String;
/*     */     //   965	11	2	searchTerm	Ljava/lang/String;
/*     */     //   109	10	3	filter	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;
/*     */     //   119	191	3	filter	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;
/*     */     //   365	116	3	filter	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;
/*     */     //   536	116	3	filter	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;
/*     */     //   707	116	3	filter	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;
/*     */     //   878	29	3	filter	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;
/*     */     //   915	1	3	filter	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;
/*     */     //   916	4	3	filter	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;
/*     */     //   920	16	3	filter	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;
/*     */     //   936	16	3	filter	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;
/*     */     //   965	11	3	filter	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultsFilter;
/*     */     //   109	10	4	mustIgnore	Lkotlin/jvm/functions/Function2;
/*     */     //   119	191	4	mustIgnore	Lkotlin/jvm/functions/Function2;
/*     */     //   356	125	4	mustIgnore	Lkotlin/jvm/functions/Function2;
/*     */     //   527	125	4	mustIgnore	Lkotlin/jvm/functions/Function2;
/*     */     //   698	125	4	mustIgnore	Lkotlin/jvm/functions/Function2;
/*     */     //   869	38	4	mustIgnore	Lkotlin/jvm/functions/Function2;
/*     */     //   915	1	4	mustIgnore	Lkotlin/jvm/functions/Function2;
/*     */     //   916	3	4	mustIgnore	Lkotlin/jvm/functions/Function2;
/*     */     //   121	189	6	usedResults	Ljava/util/Set;
/*     */     //   346	135	6	usedResults	Ljava/util/Set;
/*     */     //   517	135	6	usedResults	Ljava/util/Set;
/*     */     //   688	135	6	usedResults	Ljava/util/Set;
/*     */     //   859	48	6	usedResults	Ljava/util/Set;
/*     */     //   915	1	6	usedResults	Ljava/util/Set;
/*     */     //   916	3	6	usedResults	Ljava/util/Set;
/*     */     //   130	180	7	result	Ljava/lang/StringBuilder;
/*     */     //   336	145	7	result	Ljava/lang/StringBuilder;
/*     */     //   507	145	7	result	Ljava/lang/StringBuilder;
/*     */     //   678	145	7	result	Ljava/lang/StringBuilder;
/*     */     //   849	58	7	result	Ljava/lang/StringBuilder;
/*     */     //   915	1	7	result	Ljava/lang/StringBuilder;
/*     */     //   916	4	7	result	Ljava/lang/StringBuilder;
/*     */     //   920	16	7	result	Ljava/lang/StringBuilder;
/*     */     //   936	29	7	result	Ljava/lang/StringBuilder;
/*     */     //   136	12	8	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   167	7	11	element$iv	Ljava/lang/Object;
/*     */     //   174	127	12	resultGroup	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$SearchResultGroup;
/*     */     //   394	6	12	resultGroup	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$SearchResultGroup;
/*     */     //   565	6	12	resultGroup	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$SearchResultGroup;
/*     */     //   736	6	12	resultGroup	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$SearchResultGroup;
/*     */     //   177	133	13	$i$a$-forEach-SearchProjectAction$toFilteredResultGroup$2	I
/*     */     //   139	171	9	$i$f$forEach	I
/*     */     //   0	991	5	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	927	15	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	920	14	$result	Ljava/lang/Object;
/*     */     //   316	165	13	$i$a$-forEach-SearchProjectAction$toFilteredResultGroup$2	I
/*     */     //   313	168	9	$i$f$forEach	I
/*     */     //   487	165	13	$i$a$-forEach-SearchProjectAction$toFilteredResultGroup$2	I
/*     */     //   484	168	9	$i$f$forEach	I
/*     */     //   658	165	13	$i$a$-forEach-SearchProjectAction$toFilteredResultGroup$2	I
/*     */     //   655	168	9	$i$f$forEach	I
/*     */     //   829	87	13	$i$a$-forEach-SearchProjectAction$toFilteredResultGroup$2	I
/*     */     //   826	94	9	$i$f$forEach	I
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static final FilteredResultGroup toFilteredResultGroup$lambda$6$lambda$2(Set $usedResults, List $this$processResults) {
/*     */     Intrinsics.checkNotNullParameter($this$processResults, "$this$processResults");
/*     */     StringBuilder res = new StringBuilder();
/*     */     int count = 0;
/*     */     Iterable $this$forEach$iv = $this$processResults;
/*     */     int $i$f$forEach = 0;
/* 326 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); SearchResultItem it = (SearchResultItem)element$iv; int $i$a$-forEach-SearchProjectAction$toFilteredResultGroup$2$1$1 = 0;
/*     */       MergableSearchResultItem mergable = new MergableSearchResultItem(it); }
/*     */     
/*     */     Intrinsics.checkNotNullExpressionValue(res.toString(), "toString(...)");
/*     */     return new FilteredResultGroup(res.toString(), count);
/*     */   }
/*     */   
/*     */   private static final FilteredResultGroup toFilteredResultGroup$lambda$6$lambda$3(SearchProjectAction this$0, Set<MergableSearchResultItem> $usedResults, List<SearchResultItem> $this$processResults) {
/*     */     Intrinsics.checkNotNullParameter($this$processResults, "$this$processResults");
/*     */     return this$0.toFilteredResultGroup($this$processResults, $usedResults);
/*     */   }
/*     */   
/*     */   private static final FilteredResultGroup toFilteredResultGroup$lambda$6$lambda$4(SearchProjectAction this$0, Set<MergableSearchResultItem> $usedResults, List<SearchResultItem> $this$processResults) {
/*     */     Intrinsics.checkNotNullParameter($this$processResults, "$this$processResults");
/*     */     return this$0.toFilteredResultGroup($this$processResults, $usedResults);
/*     */   }
/*     */   
/*     */   private static final FilteredResultGroup toFilteredResultGroup$lambda$6$lambda$5(SearchProjectAction this$0, Set<MergableSearchResultItem> $usedResults, List<SearchResultItem> $this$processResults) {
/*     */     Intrinsics.checkNotNullParameter($this$processResults, "$this$processResults");
/*     */     return this$0.toFilteredResultGroup($this$processResults, $usedResults);
/*     */   }
/*     */   
/*     */   private final String getSearchSummary(String searchTerm, SearchResultsFilter filter) {
/*     */     StringBuilder stringBuilder1 = new StringBuilder(), $this$getSearchSummary_u24lambda_u247 = stringBuilder1;
/*     */     int $i$a$-buildString-SearchProjectAction$getSearchSummary$1 = 0;
/*     */     $this$getSearchSummary_u24lambda_u247.append("Searching for ");
/*     */     $this$getSearchSummary_u24lambda_u247.append("\"" + searchTerm + "\" in ");
/*     */     (((filter != null) ? true : false) == true) ? $this$getSearchSummary_u24lambda_u247.append(filter.getFilterText()) : $this$getSearchSummary_u24lambda_u247.append("project");
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*     */     return stringBuilder1.toString();
/*     */   }
/*     */   
/*     */   private final Object processResults(List $this$processResults, String groupTitle, StringBuilder result, Function2 mustIgnore, Function1 process, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #6
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$processResults$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #6
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$processResults$1
/*     */     //   13: astore #19
/*     */     //   15: aload #19
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #19
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$processResults$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #6
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #19
/*     */     //   53: aload #19
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #18
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #20
/*     */     //   65: aload #19
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 499, 0 -> 92, 1 -> 251
/*     */     //   92: aload #18
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_1
/*     */     //   98: checkcast java/lang/Iterable
/*     */     //   101: astore #8
/*     */     //   103: iconst_0
/*     */     //   104: istore #9
/*     */     //   106: aload #8
/*     */     //   108: astore #10
/*     */     //   110: new java/util/ArrayList
/*     */     //   113: dup
/*     */     //   114: invokespecial <init> : ()V
/*     */     //   117: checkcast java/util/Collection
/*     */     //   120: astore #11
/*     */     //   122: iconst_0
/*     */     //   123: istore #12
/*     */     //   125: aload #10
/*     */     //   127: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   132: astore #13
/*     */     //   134: aload #13
/*     */     //   136: invokeinterface hasNext : ()Z
/*     */     //   141: ifeq -> 362
/*     */     //   144: aload #13
/*     */     //   146: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   151: astore #14
/*     */     //   153: aload #14
/*     */     //   155: checkcast com/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultItem
/*     */     //   158: astore #15
/*     */     //   160: iconst_0
/*     */     //   161: istore #16
/*     */     //   163: aload #15
/*     */     //   165: invokevirtual getFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   168: invokestatic toNioPathOrNull : (Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/nio/file/Path;
/*     */     //   171: astore #17
/*     */     //   173: aload #17
/*     */     //   175: ifnull -> 345
/*     */     //   178: aload #4
/*     */     //   180: aload #17
/*     */     //   182: aload #19
/*     */     //   184: aload #19
/*     */     //   186: aload_2
/*     */     //   187: putfield L$0 : Ljava/lang/Object;
/*     */     //   190: aload #19
/*     */     //   192: aload_3
/*     */     //   193: putfield L$1 : Ljava/lang/Object;
/*     */     //   196: aload #19
/*     */     //   198: aload #4
/*     */     //   200: putfield L$2 : Ljava/lang/Object;
/*     */     //   203: aload #19
/*     */     //   205: aload #5
/*     */     //   207: putfield L$3 : Ljava/lang/Object;
/*     */     //   210: aload #19
/*     */     //   212: aload #11
/*     */     //   214: putfield L$4 : Ljava/lang/Object;
/*     */     //   217: aload #19
/*     */     //   219: aload #13
/*     */     //   221: putfield L$5 : Ljava/lang/Object;
/*     */     //   224: aload #19
/*     */     //   226: aload #14
/*     */     //   228: putfield L$6 : Ljava/lang/Object;
/*     */     //   231: aload #19
/*     */     //   233: iconst_1
/*     */     //   234: putfield label : I
/*     */     //   237: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   242: dup
/*     */     //   243: aload #20
/*     */     //   245: if_acmpne -> 332
/*     */     //   248: aload #20
/*     */     //   250: areturn
/*     */     //   251: iconst_0
/*     */     //   252: istore #9
/*     */     //   254: iconst_0
/*     */     //   255: istore #12
/*     */     //   257: iconst_0
/*     */     //   258: istore #16
/*     */     //   260: aload #19
/*     */     //   262: getfield L$6 : Ljava/lang/Object;
/*     */     //   265: astore #14
/*     */     //   267: aload #19
/*     */     //   269: getfield L$5 : Ljava/lang/Object;
/*     */     //   272: checkcast java/util/Iterator
/*     */     //   275: astore #13
/*     */     //   277: aload #19
/*     */     //   279: getfield L$4 : Ljava/lang/Object;
/*     */     //   282: checkcast java/util/Collection
/*     */     //   285: astore #11
/*     */     //   287: aload #19
/*     */     //   289: getfield L$3 : Ljava/lang/Object;
/*     */     //   292: checkcast kotlin/jvm/functions/Function1
/*     */     //   295: astore #5
/*     */     //   297: aload #19
/*     */     //   299: getfield L$2 : Ljava/lang/Object;
/*     */     //   302: checkcast kotlin/jvm/functions/Function2
/*     */     //   305: astore #4
/*     */     //   307: aload #19
/*     */     //   309: getfield L$1 : Ljava/lang/Object;
/*     */     //   312: checkcast java/lang/StringBuilder
/*     */     //   315: astore_3
/*     */     //   316: aload #19
/*     */     //   318: getfield L$0 : Ljava/lang/Object;
/*     */     //   321: checkcast java/lang/String
/*     */     //   324: astore_2
/*     */     //   325: aload #18
/*     */     //   327: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   330: aload #18
/*     */     //   332: checkcast java/lang/Boolean
/*     */     //   335: invokevirtual booleanValue : ()Z
/*     */     //   338: ifne -> 345
/*     */     //   341: iconst_1
/*     */     //   342: goto -> 346
/*     */     //   345: iconst_0
/*     */     //   346: ifeq -> 134
/*     */     //   349: aload #11
/*     */     //   351: aload #14
/*     */     //   353: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   358: pop
/*     */     //   359: goto -> 134
/*     */     //   362: aload #11
/*     */     //   364: checkcast java/util/List
/*     */     //   367: nop
/*     */     //   368: astore #7
/*     */     //   370: aload #5
/*     */     //   372: aload #7
/*     */     //   374: checkcast java/lang/Iterable
/*     */     //   377: bipush #100
/*     */     //   379: invokestatic take : (Ljava/lang/Iterable;I)Ljava/util/List;
/*     */     //   382: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   387: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$FilteredResultGroup
/*     */     //   390: astore #8
/*     */     //   392: aload #7
/*     */     //   394: invokeinterface size : ()I
/*     */     //   399: bipush #100
/*     */     //   401: if_icmple -> 408
/*     */     //   404: iconst_1
/*     */     //   405: goto -> 409
/*     */     //   408: iconst_0
/*     */     //   409: iconst_1
/*     */     //   410: if_icmpne -> 419
/*     */     //   413: ldc_w 'more than 100'
/*     */     //   416: goto -> 427
/*     */     //   419: aload #8
/*     */     //   421: invokevirtual getCount : ()I
/*     */     //   424: invokestatic valueOf : (I)Ljava/lang/String;
/*     */     //   427: astore #9
/*     */     //   429: aload #8
/*     */     //   431: invokevirtual getCount : ()I
/*     */     //   434: ifle -> 495
/*     */     //   437: aload_3
/*     */     //   438: aload_2
/*     */     //   439: aload #9
/*     */     //   441: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   446: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   449: pop
/*     */     //   450: aload_3
/*     */     //   451: aload #8
/*     */     //   453: invokevirtual getResult : ()Ljava/lang/String;
/*     */     //   456: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   459: pop
/*     */     //   460: aload_3
/*     */     //   461: aload #7
/*     */     //   463: invokeinterface size : ()I
/*     */     //   468: bipush #100
/*     */     //   470: if_icmple -> 477
/*     */     //   473: iconst_1
/*     */     //   474: goto -> 478
/*     */     //   477: iconst_0
/*     */     //   478: iconst_1
/*     */     //   479: if_icmpne -> 488
/*     */     //   482: ldc_w '...\\n'
/*     */     //   485: goto -> 491
/*     */     //   488: ldc_w '\\n'
/*     */     //   491: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   494: pop
/*     */     //   495: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   498: areturn
/*     */     //   499: new java/lang/IllegalStateException
/*     */     //   502: dup
/*     */     //   503: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   506: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   509: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #210	-> 63
/*     */     //   #216	-> 97
/*     */     //   #280	-> 106
/*     */     //   #281	-> 125
/*     */     //   #217	-> 163
/*     */     //   #218	-> 173
/*     */     //   #210	-> 248
/*     */     //   #218	-> 332
/*     */     //   #281	-> 346
/*     */     //   #282	-> 362
/*     */     //   #280	-> 367
/*     */     //   #216	-> 368
/*     */     //   #220	-> 370
/*     */     //   #221	-> 392
/*     */     //   #222	-> 409
/*     */     //   #223	-> 419
/*     */     //   #221	-> 427
/*     */     //   #225	-> 429
/*     */     //   #226	-> 437
/*     */     //   #227	-> 450
/*     */     //   #228	-> 460
/*     */     //   #229	-> 461
/*     */     //   #230	-> 478
/*     */     //   #231	-> 488
/*     */     //   #228	-> 491
/*     */     //   #235	-> 495
/*     */     //   #210	-> 499
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	6	1	$this$processResults	Ljava/util/List;
/*     */     //   97	154	2	groupTitle	Ljava/lang/String;
/*     */     //   325	21	2	groupTitle	Ljava/lang/String;
/*     */     //   346	22	2	groupTitle	Ljava/lang/String;
/*     */     //   368	82	2	groupTitle	Ljava/lang/String;
/*     */     //   97	154	3	result	Ljava/lang/StringBuilder;
/*     */     //   316	30	3	result	Ljava/lang/StringBuilder;
/*     */     //   346	22	3	result	Ljava/lang/StringBuilder;
/*     */     //   368	93	3	result	Ljava/lang/StringBuilder;
/*     */     //   97	154	4	mustIgnore	Lkotlin/jvm/functions/Function2;
/*     */     //   307	39	4	mustIgnore	Lkotlin/jvm/functions/Function2;
/*     */     //   346	16	4	mustIgnore	Lkotlin/jvm/functions/Function2;
/*     */     //   97	154	5	process	Lkotlin/jvm/functions/Function1;
/*     */     //   297	49	5	process	Lkotlin/jvm/functions/Function1;
/*     */     //   346	22	5	process	Lkotlin/jvm/functions/Function1;
/*     */     //   368	24	5	process	Lkotlin/jvm/functions/Function1;
/*     */     //   370	107	7	nonIgnored	Ljava/util/List;
/*     */     //   103	19	8	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   392	68	8	filteredResult	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$FilteredResultGroup;
/*     */     //   429	21	9	sizeText	Ljava/lang/String;
/*     */     //   122	12	10	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   122	129	11	destination$iv$iv	Ljava/util/Collection;
/*     */     //   287	77	11	destination$iv$iv	Ljava/util/Collection;
/*     */     //   153	98	14	element$iv$iv	Ljava/lang/Object;
/*     */     //   267	92	14	element$iv$iv	Ljava/lang/Object;
/*     */     //   160	13	15	it	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultItem;
/*     */     //   173	69	17	nioPath	Ljava/nio/file/Path;
/*     */     //   163	88	16	$i$a$-filter-SearchProjectAction$processResults$nonIgnored$1	I
/*     */     //   125	126	12	$i$f$filterTo	I
/*     */     //   106	145	9	$i$f$filter	I
/*     */     //   0	510	6	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	446	19	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	439	18	$result	Ljava/lang/Object;
/*     */     //   260	86	16	$i$a$-filter-SearchProjectAction$processResults$nonIgnored$1	I
/*     */     //   257	107	12	$i$f$filterTo	I
/*     */     //   254	114	9	$i$f$filter	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\006\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\002\b\020\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B-\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\f\020\b\032\b\022\004\022\0020\n0\t¢\006\004\b\013\020\fJ\t\020\025\032\0020\003HÆ\003J\t\020\026\032\0020\005HÆ\003J\t\020\027\032\0020\007HÆ\003J\017\020\030\032\b\022\004\022\0020\n0\tHÆ\003J7\020\031\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\016\b\002\020\b\032\b\022\004\022\0020\n0\tHÆ\001J\023\020\032\032\0020\0332\b\020\034\032\004\030\0010\001HÖ\003J\t\020\035\032\0020\036HÖ\001J\t\020\037\032\0020\007HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\021\020\022R\027\020\b\032\b\022\004\022\0020\n0\t¢\006\b\n\000\032\004\b\023\020\024¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$FileGroup;", "", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "weight", "", "title", "", "results", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultItem;", "<init>", "(Lcom/intellij/openapi/vfs/VirtualFile;DLjava/lang/String;Ljava/util/List;)V", "getFile", "()Lcom/intellij/openapi/vfs/VirtualFile;", "getWeight", "()D", "getTitle", "()Ljava/lang/String;", "getResults", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ej-core"})
/*     */   public static final class FileGroup {
/*     */     @NotNull
/*     */     private final VirtualFile file;
/*     */     private final double weight;
/*     */     @NotNull
/*     */     private final String title;
/*     */     @NotNull
/*     */     private final List<SearchResultItem> results;
/*     */     
/*     */     public FileGroup(@NotNull VirtualFile file, double weight, @NotNull String title, @NotNull List<SearchResultItem> results) {
/*     */       this.file = file;
/*     */       this.weight = weight;
/*     */       this.title = title;
/*     */       this.results = results;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final VirtualFile getFile() {
/*     */       return this.file;
/*     */     }
/*     */     
/*     */     public final double getWeight() {
/*     */       return this.weight;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getTitle() {
/*     */       return this.title;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final List<SearchResultItem> getResults() {
/*     */       return this.results;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final VirtualFile component1() {
/*     */       return this.file;
/*     */     }
/*     */     
/*     */     public final double component2() {
/*     */       return this.weight;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String component3() {
/*     */       return this.title;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final List<SearchResultItem> component4() {
/*     */       return this.results;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final FileGroup copy(@NotNull VirtualFile file, double weight, @NotNull String title, @NotNull List<SearchResultItem> results) {
/*     */       Intrinsics.checkNotNullParameter(file, "file");
/*     */       Intrinsics.checkNotNullParameter(title, "title");
/*     */       Intrinsics.checkNotNullParameter(results, "results");
/*     */       return new FileGroup(file, weight, title, results);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "FileGroup(file=" + this.file + ", weight=" + this.weight + ", title=" + this.title + ", results=" + this.results + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = this.file.hashCode();
/*     */       result = result * 31 + Double.hashCode(this.weight);
/*     */       result = result * 31 + this.title.hashCode();
/*     */       return result * 31 + this.results.hashCode();
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof FileGroup))
/*     */         return false; 
/*     */       FileGroup fileGroup = (FileGroup)other;
/*     */       return !Intrinsics.areEqual(this.file, fileGroup.file) ? false : ((Double.compare(this.weight, fileGroup.weight) != 0) ? false : (!Intrinsics.areEqual(this.title, fileGroup.title) ? false : (!!Intrinsics.areEqual(this.results, fileGroup.results))));
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\013\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B\031\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005¢\006\004\b\006\020\007B\021\b\026\022\006\020\b\032\0020\t¢\006\004\b\006\020\nJ\t\020\020\032\0020\003HÆ\003J\020\020\021\032\004\030\0010\005HÆ\003¢\006\002\020\016J$\020\022\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\005HÆ\001¢\006\002\020\023J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\001HÖ\003J\t\020\027\032\0020\005HÖ\001J\t\020\030\032\0020\031HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\025\020\004\032\004\030\0010\005¢\006\n\n\002\020\017\032\004\b\r\020\016¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$MergableSearchResultItem;", "", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "line", "", "<init>", "(Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/Integer;)V", "searchResult", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultItem;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultItem;)V", "getFile", "()Lcom/intellij/openapi/vfs/VirtualFile;", "getLine", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/Integer;)Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$MergableSearchResultItem;", "equals", "", "other", "hashCode", "toString", "", "ej-core"})
/*     */   public static final class MergableSearchResultItem {
/*     */     @NotNull
/*     */     private final VirtualFile file;
/*     */     @Nullable
/*     */     private final Integer line;
/*     */     
/*     */     public MergableSearchResultItem(@NotNull VirtualFile file, @Nullable Integer line) {
/*     */       this.file = file;
/*     */       this.line = line;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final VirtualFile getFile() {
/*     */       return this.file;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Integer getLine() {
/*     */       return this.line;
/*     */     }
/*     */     
/*     */     public MergableSearchResultItem(@NotNull SearchResultItem searchResult) {
/*     */       this(searchResult.getFile(), (searchResult.getContent() != null) ? Integer.valueOf(searchResult.getContent().getStartLine()) : null);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final VirtualFile component1() {
/*     */       return this.file;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Integer component2() {
/*     */       return this.line;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final MergableSearchResultItem copy(@NotNull VirtualFile file, @Nullable Integer line) {
/*     */       Intrinsics.checkNotNullParameter(file, "file");
/*     */       return new MergableSearchResultItem(file, line);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "MergableSearchResultItem(file=" + this.file + ", line=" + this.line + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = this.file.hashCode();
/*     */       return result * 31 + ((this.line == null) ? 0 : this.line.hashCode());
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof MergableSearchResultItem))
/*     */         return false; 
/*     */       MergableSearchResultItem mergableSearchResultItem = (MergableSearchResultItem)other;
/*     */       return !Intrinsics.areEqual(this.file, mergableSearchResultItem.file) ? false : (!!Intrinsics.areEqual(this.line, mergableSearchResultItem.line));
/*     */     }
/*     */   }
/*     */   
/*     */   private final FilteredResultGroup toFilteredResultGroup(List $this$toFilteredResultGroup, Set usedResults) {
/*     */     Iterable $this$groupBy$iv = $this$toFilteredResultGroup;
/*     */     int $i$f$groupBy = 0;
/*     */     Iterable iterable1 = $this$groupBy$iv;
/*     */     Map<Object, Object> map3 = new LinkedHashMap<>();
/*     */     int $i$f$groupByTo = 0;
/*     */     for (Object element$iv$iv : iterable1) {
/*     */       SearchResultItem it = (SearchResultItem)element$iv$iv;
/*     */       int $i$a$-groupBy-SearchProjectAction$toFilteredResultGroup$groups$1 = 0;
/*     */       Object key$iv$iv = it.getFile();
/*     */       Map<Object, Object> $this$getOrPut$iv$iv$iv = map3;
/*     */       int $i$f$getOrPut = 0;
/*     */       Object value$iv$iv$iv = $this$getOrPut$iv$iv$iv.get(key$iv$iv);
/*     */     } 
/*     */     Map<Object, Object> map1 = map3;
/*     */     int $i$f$mapNotNull = 0;
/*     */     Map<Object, Object> map2 = map1;
/*     */     Collection destination$iv$iv = new ArrayList();
/*     */     $i$f$mapNotNullTo = 0;
/*     */     Map<Object, Object> $this$forEach$iv$iv$iv = map2;
/*     */     int j = 0;
/*     */     Iterator<Map.Entry> iterator1 = $this$forEach$iv$iv$iv.entrySet().iterator();
/*     */     if (iterator1.hasNext()) {
/*     */       Map.Entry element$iv$iv$iv = iterator1.next(), element$iv$iv = element$iv$iv$iv;
/*     */       int $i$a$-forEach-MapsKt___MapsKt$mapNotNullTo$1$iv$iv = 0;
/*     */       Map.Entry entry1 = element$iv$iv;
/*     */       int $i$a$-mapNotNull-SearchProjectAction$toFilteredResultGroup$groups$2 = 0;
/*     */     } 
/*     */     Function1[] arrayOfFunction1 = new Function1[2];
/*     */     arrayOfFunction1[0] = SearchProjectAction::toFilteredResultGroup$lambda$16;
/*     */     arrayOfFunction1[1] = SearchProjectAction::toFilteredResultGroup$lambda$17;
/*     */     List groups = CollectionsKt.sortedWith(destination$iv$iv, ComparisonsKt.compareBy(arrayOfFunction1));
/*     */     List list1 = groups;
/*     */     int i = 0;
/*     */     for (int $i$f$mapNotNullTo : list1) {
/*     */       FileGroup fileGroup = (FileGroup)$i$f$mapNotNullTo;
/*     */       int k = i, $i$a$-sumOfInt-SearchProjectAction$toFilteredResultGroup$resultCount$1 = 0;
/*     */       int m = fileGroup.getResults().size();
/*     */       i = k + m;
/*     */     } 
/*     */     int resultCount = i;
/*     */     StringBuilder result = new StringBuilder();
/*     */     Iterable $this$forEach$iv = groups;
/*     */     int $i$f$forEach = 0;
/*     */     Iterator iterator = $this$forEach$iv.iterator();
/*     */     if (iterator.hasNext()) {
/*     */       Object element$iv = iterator.next();
/*     */       FileGroup group = (FileGroup)element$iv;
/*     */       int $i$a$-forEach-SearchProjectAction$toFilteredResultGroup$3 = 0;
/*     */       Iterable<SearchResultItem> iterable = group.getResults();
/*     */       int k = 0;
/*     */       Iterator<SearchResultItem> iterator2 = iterable.iterator();
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(result.toString(), "toString(...)");
/*     */     return new FilteredResultGroup(result.toString(), resultCount);
/*     */   }
/*     */   
/*     */   private static final Comparable toFilteredResultGroup$lambda$16(FileGroup it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return Double.valueOf(-it.getWeight());
/*     */   }
/*     */   
/*     */   private static final Comparable toFilteredResultGroup$lambda$17(FileGroup it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return it.getFile().getPresentableUrl();
/*     */   }
/*     */   
/*     */   private final PsiFileSystemItem toPsi(VirtualFile $this$toPsi, Project project) {
/*     */     Intrinsics.checkNotNullExpressionValue(PsiManager.getInstance(project), "getInstance(...)");
/*     */     PsiManager manager = PsiManager.getInstance(project);
/*     */     manager.findFile($this$toPsi);
/*     */     return (manager.findFile($this$toPsi) != null) ? (PsiFileSystemItem)manager.findFile($this$toPsi) : (PsiFileSystemItem)manager.findDirectory($this$toPsi);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object execute(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation<? super String> $completion) {
/*     */     return execute$suspendImpl(this, request, context, $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "SearchProjectAction.kt", l = {99, 107, 109, 111, 114, 115}, i = {0, 0, 2, 2, 2, 2, 4, 4, 4}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"}, n = {"$this", "context", "$this", "context", "searchTerm", "searchEverywhere", "$this", "searchTerm", "searchEverywhere"}, m = "execute$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.SearchProjectAction")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class SearchProjectAction$execute$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int label;
/*     */     
/*     */     SearchProjectAction$execute$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return SearchProjectAction.execute$suspendImpl(SearchProjectAction.this, null, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "SearchProjectAction.kt", l = {218}, i = {0, 0, 0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$6"}, n = {"groupTitle", "result", "mustIgnore", "process", "destination$iv$iv", "element$iv$iv"}, m = "processResults", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.SearchProjectAction")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class SearchProjectAction$processResults$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     int label;
/*     */     
/*     */     SearchProjectAction$processResults$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return SearchProjectAction.this.processResults(null, null, null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "SearchProjectAction.kt", l = {159, 174, 177, 180}, i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, n = {"this", "searchTerm", "filter", "mustIgnore", "usedResults", "result", "this", "searchTerm", "filter", "mustIgnore", "usedResults", "result", "this", "searchTerm", "filter", "mustIgnore", "usedResults", "result", "this", "searchTerm", "filter", "mustIgnore", "usedResults", "result"}, m = "toFilteredResultGroup", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.SearchProjectAction")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class SearchProjectAction$toFilteredResultGroup$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     int label;
/*     */     
/*     */     SearchProjectAction$toFilteredResultGroup$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return SearchProjectAction.this.toFilteredResultGroup(null, null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\SearchProjectAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */