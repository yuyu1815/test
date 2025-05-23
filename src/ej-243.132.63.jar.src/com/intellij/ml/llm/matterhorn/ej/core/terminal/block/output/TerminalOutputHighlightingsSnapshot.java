/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\004\n\002\020\b\n\002\b\b\b\007\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\004\b\007\020\bJ\021\020\016\032\0020\0062\006\020\017\032\0020\013H\002J\016\020\020\032\0020\0132\006\020\021\032\0020\013J$\020\022\032\b\022\004\022\0020\0060\0052\006\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0060\005H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\024\020\t\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000R\021\020\n\032\0020\0138F¢\006\006\032\004\b\f\020\r¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputHighlightingsSnapshot;", "", "document", "Lcom/intellij/openapi/editor/Document;", "highlightings", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo;", "<init>", "(Lcom/intellij/openapi/editor/Document;Ljava/util/List;)V", "allSortedHighlightings", "size", "", "getSize", "()I", "get", "index", "findHighlightingIndex", "documentOffset", "buildAndSortHighlightings", "ej-core"})
/*    */ @Internal
/*    */ @SourceDebugExtension({"SMAP\nTerminalOutputHighlightingsSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalOutputHighlightingsSnapshot.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputHighlightingsSnapshot\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,64:1\n1053#2:65\n14#3:66\n14#3:67\n*S KotlinDebug\n*F\n+ 1 TerminalOutputHighlightingsSnapshot.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputHighlightingsSnapshot\n*L\n41#1:65\n47#1:66\n50#1:67\n*E\n"})
/*    */ public final class TerminalOutputHighlightingsSnapshot {
/*    */   @NotNull
/*    */   private final Document document;
/*    */   
/*    */   public TerminalOutputHighlightingsSnapshot(@NotNull Document document, @NotNull List<HighlightingInfo> highlightings) {
/*  9 */     this.document = document;
/* 10 */     this.allSortedHighlightings = buildAndSortHighlightings(this.document, highlightings);
/*    */   } @NotNull
/*    */   private final List<HighlightingInfo> allSortedHighlightings; public final int getSize() {
/* 13 */     return this.allSortedHighlightings.size(); } @NotNull
/*    */   public final HighlightingInfo get(int index) {
/* 15 */     return this.allSortedHighlightings.get(index);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final int findHighlightingIndex(int documentOffset) {
/* 24 */     if (documentOffset <= 0) return 0; 
/* 25 */     int binarySearchInd = CollectionsKt.binarySearch(this.allSortedHighlightings, 0, this.allSortedHighlightings.size(), documentOffset::findHighlightingIndex$lambda$0);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 30 */     int insertionIndex = -binarySearchInd - 1;
/* 31 */     return (binarySearchInd >= 0) ? binarySearchInd : ((insertionIndex == 0 || (insertionIndex == this.allSortedHighlightings.size() && documentOffset >= this.document.getTextLength())) ? 
/* 32 */       insertionIndex : (
/*    */ 
/*    */       
/* 35 */       insertionIndex - 1));
/*    */   } private static final int findHighlightingIndex$lambda$0(int $documentOffset, HighlightingInfo it) {
/*    */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     return Intrinsics.compare(it.getStartOffset(), $documentOffset);
/*    */   }
/*    */   private final List<HighlightingInfo> buildAndSortHighlightings(Document document, List highlightings) {
/* 41 */     Iterable $this$sortedBy$iv = highlightings; int $i$f$sortedBy = 0; List sortedHighlightings = 
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
/* 65 */       CollectionsKt.sortedWith($this$sortedBy$iv, new TerminalOutputHighlightingsSnapshot$buildAndSortHighlightings$$inlined$sortedBy$1()); int documentLength = document.getTextLength(); List<HighlightingInfo> result = new ArrayList(sortedHighlightings.size() * 2 + 1); int startOffset = 0; for (HighlightingInfo highlighting : sortedHighlightings) { if (highlighting.getStartOffset() < 0 || highlighting.getEndOffset() > documentLength) {
/* 66 */         int $i$f$logger = 0; Intrinsics.checkNotNullExpressionValue(Logger.getInstance(TerminalOutputModel.class), "getInstance(...)"); Logger.getInstance(TerminalOutputModel.class).error("Terminal highlightings range should be within document");
/* 67 */       }  if (startOffset > highlighting.getStartOffset()) { int $i$f$logger = 0; Intrinsics.checkNotNullExpressionValue(Logger.getInstance(TerminalOutputModel.class), "getInstance(...)"); Logger.getInstance(TerminalOutputModel.class).error("Terminal highlightings should not overlap"); }
/*    */       
/*    */       if (startOffset < highlighting.getStartOffset())
/*    */         result.add(new HighlightingInfo(startOffset, highlighting.getStartOffset(), EmptyTextAttributesProvider.INSTANCE)); 
/*    */       result.add(highlighting);
/*    */       startOffset = highlighting.getEndOffset(); }
/*    */     
/*    */     if (startOffset < documentLength)
/*    */       result.add(new HighlightingInfo(startOffset, documentLength, EmptyTextAttributesProvider.INSTANCE)); 
/*    */     return result;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalOutputHighlightingsSnapshot.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */