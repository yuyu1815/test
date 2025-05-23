/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.services.search.SearchResultContent;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\002\n\002\020\b\n\002\b\b\n\002\020\t\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\n\020\022\032\0020\005*\0020\023J\034\020\024\032\0020\005*\0020\0232\006\020\025\032\0020\b2\006\020\026\032\0020\027H\002R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000R\016\020\007\032\0020\bXT¢\006\002\n\000R\016\020\t\032\0020\bXT¢\006\002\n\000R\016\020\n\032\0020\005XT¢\006\002\n\000R\016\020\013\032\0020\005XT¢\006\002\n\000R\016\020\f\032\0020\005XT¢\006\002\n\000R\016\020\r\032\0020\005XT¢\006\002\n\000R\016\020\016\032\0020\005XT¢\006\002\n\000R\016\020\017\032\0020\005XT¢\006\002\n\000R\016\020\020\032\0020\021XT¢\006\002\n\000¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$Companion;", "", "<init>", "()V", "SEARCH_PROJECT_ACTION_NAME", "", "INDENT", "BLOCK_RESULTS_LIMIT", "", "MAX_SHOWN_LINE_LEN", "FOUND_FILES_TITLE", "FOUND_CLASSES_TITLE", "FOUND_SYMBOLS_TITLE", "FOUND_TEXT_TITLE", "SEARCH_TERM_ARGUMENT", "PATH_ARGUMENT", "SEARCH_TIMEOUT_MS", "", "getText", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultContent;", "getMultilineText", "lineLimit", "forceSingleLine", "", "ej-core"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final String getText(@NotNull SearchResultContent $this$getText) {
/* 41 */     Intrinsics.checkNotNullParameter($this$getText, "<this>"); return "" + $this$getText.getStartLine() + 1 + ":: " + $this$getText.getStartLine() + 1;
/*    */   }
/*    */ 
/*    */   
/*    */   private final String getMultilineText(SearchResultContent $this$getMultilineText, int lineLimit, boolean forceSingleLine) {
/* 46 */     if ((String)CollectionsKt.firstOrNull(StringsKt.lines($this$getMultilineText.getLineText())) == null || StringUtilKt.truncateWithEllipsis((String)CollectionsKt.firstOrNull(StringsKt.lines($this$getMultilineText.getLineText())), 100) == null) StringUtilKt.truncateWithEllipsis((String)CollectionsKt.firstOrNull(StringsKt.lines($this$getMultilineText.getLineText())), 100);  return (forceSingleLine == true) ? (" " + "") : ("\n" + 
/*    */       
/* 48 */       StringsKt.prependIndent(CollectionsKt.joinToString$default(StringsKt.lines(StringsKt.trimIndent(CollectionsKt.joinToString$default(CollectionsKt.take(StringsKt.lines($this$getMultilineText.getLineText()), lineLimit), "\n", null, null, 0, null, null, 62, null))), "\n", null, null, 0, null, Companion::getMultilineText$lambda$0, 30, null), "  ")); } private static final CharSequence getMultilineText$lambda$0(String it) { Intrinsics.checkNotNullParameter(it, "it"); return StringUtilKt.truncateWithEllipsis(it, 100); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\SearchProjectAction$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */