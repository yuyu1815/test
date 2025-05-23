/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.actions;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\f\n\000\n\002\020\"\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020\013\n\002\b\b\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\021\032\0020\0222\006\020\023\032\0020\bH\002J\020\020\024\032\0020\0222\006\020\023\032\0020\bH\002J\020\020\025\032\0020\0222\006\020\023\032\0020\bH\002J\020\020\026\032\0020\b2\006\020\023\032\0020\bH\002J\020\020\027\032\004\030\0010\b2\006\020\023\032\0020\bJ\n\020\030\032\0020\b*\0020\bJ\n\020\031\032\0020\b*\0020\bR\016\020\004\032\0020\005XT¢\006\002\n\000R\027\020\006\032\b\022\004\022\0020\b0\007¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\r\020\016R\021\020\017\032\0020\f¢\006\b\n\000\032\004\b\020\020\016¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/TestLogsUtils;", "", "<init>", "()V", "DEBUG_MESSAGE_MARKER", "", "SERVICE_LINES", "", "", "getSERVICE_LINES", "()Ljava/util/Set;", "WARN_LINE_PATTERN", "Lkotlin/text/Regex;", "getWARN_LINE_PATTERN", "()Lkotlin/text/Regex;", "WARN_LINE_REPLACE_PATTERN", "getWARN_LINE_REPLACE_PATTERN", "isDebugLine", "", "line", "isServiceLine", "isWarnLine", "filterWarnLine", "filterLine", "filterLogs", "removeDebug", "ej-idea"})
/*    */ @SourceDebugExtension({"SMAP\nTestLogsUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestLogsUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/TestLogsUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1557#2:37\n1628#2,3:38\n827#2:41\n855#2,2:42\n827#2:44\n855#2,2:45\n*S KotlinDebug\n*F\n+ 1 TestLogsUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/TestLogsUtils\n*L\n28#1:37\n28#1:38,3\n29#1:41\n29#1:42,2\n34#1:44\n34#1:45,2\n*E\n"})
/*    */ public final class TestLogsUtils {
/*    */   @NotNull
/*  5 */   public static final TestLogsUtils INSTANCE = new TestLogsUtils(); public static final char DEBUG_MESSAGE_MARKER = ' '; @NotNull private static final Set<String> SERVICE_LINES = SetsKt.setOf("<Click to see difference>"); @NotNull public final Set<String> getSERVICE_LINES() { return SERVICE_LINES; } @NotNull
/*  6 */   private static final Regex WARN_LINE_PATTERN = new Regex("^\\[\\s*\\d+]\\s*WARN\\s+.*"); @NotNull public final Regex getWARN_LINE_PATTERN() { return WARN_LINE_PATTERN; } @NotNull
/*  7 */   private static final Regex WARN_LINE_REPLACE_PATTERN = new Regex("^\\[\\s*\\d+]\\s*WARN"); @NotNull public final Regex getWARN_LINE_REPLACE_PATTERN() { return WARN_LINE_REPLACE_PATTERN; }
/*    */    private final boolean isDebugLine(String line) {
/*  9 */     return StringsKt.endsWith$default(line, ' ', false, 2, null);
/*    */   } private final boolean isServiceLine(String line) {
/* 11 */     return SERVICE_LINES.contains(line);
/*    */   } private final boolean isWarnLine(String line) {
/* 13 */     CharSequence charSequence = line; return WARN_LINE_PATTERN.matches(charSequence);
/*    */   } private final String filterWarnLine(String line) {
/* 15 */     CharSequence charSequence = line; Regex regex = WARN_LINE_REPLACE_PATTERN; String str = "WARN"; return regex.replace(charSequence, str);
/*    */   } @Nullable
/*    */   public final String filterLine(@NotNull String line) {
/* 18 */     Intrinsics.checkNotNullParameter(line, "line"); String trimmedLine = StringsKt.trim(line).toString();
/* 19 */     return 
/* 20 */       isServiceLine(trimmedLine) ? null : (
/* 21 */       isWarnLine(trimmedLine) ? filterWarnLine(trimmedLine) : 
/* 22 */       line);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String filterLogs(@NotNull String $this$filterLogs) {
/* 27 */     Intrinsics.checkNotNullParameter($this$filterLogs, "<this>"); List list1 = StringsKt.lines($this$filterLogs);
/* 28 */     int $i$f$map = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 37 */     List list2 = list1; Collection<String> collection = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 38 */     for (Object item$iv$iv : list2) {
/* 39 */       String str = (String)item$iv$iv; Collection<String> collection1 = collection; int $i$a$-map-TestLogsUtils$filterLogs$1 = 0; collection1.add(INSTANCE.filterLine(str));
/* 40 */     }  Iterable $this$map$iv = collection; int $i$f$filterNot = 0;
/* 41 */     Iterable $this$mapTo$iv$iv = $this$map$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$filterNotTo = 0;
/* 42 */     for (Object element$iv$iv : $this$mapTo$iv$iv) { String it = (String)element$iv$iv; int $i$a$-filterNot-TestLogsUtils$filterLogs$2 = 0; CharSequence charSequence = it; }
/* 43 */      return CollectionsKt.joinToString$default(destination$iv$iv, "\n", null, null, 0, null, null, 62, null); } @NotNull public final String removeDebug(@NotNull String $this$removeDebug) { Intrinsics.checkNotNullParameter($this$removeDebug, "<this>"); List list1 = StringsKt.lines($this$removeDebug); int $i$f$filterNot = 0;
/* 44 */     List list2 = list1; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterNotTo = 0;
/* 45 */     for (Object element$iv$iv : list2) { String it = (String)element$iv$iv; int $i$a$-filterNot-TestLogsUtils$removeDebug$1 = 0; if (!INSTANCE.isDebugLine(it)) destination$iv$iv.add(element$iv$iv);  }
/* 46 */      return CollectionsKt.joinToString$default(destination$iv$iv, "\n", null, null, 0, null, null, 62, null); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\TestLogsUtils.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */