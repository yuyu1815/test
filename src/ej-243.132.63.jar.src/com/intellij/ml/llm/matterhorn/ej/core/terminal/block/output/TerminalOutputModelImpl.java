/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.util.TextRange;
/*     */ import com.intellij.util.concurrency.annotations.RequiresEdt;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000p\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020!\n\002\030\002\n\002\b\003\n\002\020%\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\005\n\002\030\002\n\002\b\025\b\000\030\000 >2\0020\001:\001>B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\031\032\0020\0322\006\020\033\032\0020\0302\b\020\034\032\004\030\0010\035H\026J$\020\036\032\0020\n2\b\020\037\032\004\030\0010 2\b\020!\032\004\030\0010\"2\006\020#\032\0020$H\027J\020\020%\032\0020\0322\006\020&\032\0020\nH\027J\020\020'\032\0020\0322\006\020(\032\0020\nH\027J\020\020)\032\0020*2\006\020(\032\0020\nH\002J\b\020+\032\0020\032H\027J\b\020,\032\0020\024H\027J\026\020-\032\b\022\004\022\0020\0200\0172\006\020(\032\0020\nH\027J\036\020.\032\0020\0322\006\020(\032\0020\n2\f\020\r\032\b\022\004\022\0020\0200\017H\027J\030\020/\032\0020\0322\006\020(\032\0020\n2\006\0200\032\0020\022H\027J\022\0201\032\004\030\0010\0222\006\020(\032\0020\nH\027J\b\0202\032\0020\032H\027J\020\0203\032\0020\0322\006\0204\032\0020$H\002J\030\0205\032\0020$2\006\0204\032\0020$2\006\0206\032\0020$H\002J\030\0207\032\0020\0322\006\020(\032\0020\n2\006\0208\032\0020*H\003J\030\0209\032\0020\0322\006\020(\032\0020\n2\006\0208\032\0020*H\002J\030\020:\032\0020$2\006\020;\032\0020\0202\006\020<\032\0020*H\002J\b\020=\032\0020$H\002R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\006\020\007R\032\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\b\n\000\032\004\b\013\020\fR \020\r\032\024\022\004\022\0020\n\022\n\022\b\022\004\022\0020\0200\0170\016X\004¢\006\002\n\000R\032\020\021\032\016\022\004\022\0020\n\022\004\022\0020\0220\016X\004¢\006\002\n\000R\020\020\023\032\004\030\0010\024X\016¢\006\002\n\000R\016\020\025\032\0020\026X\004¢\006\002\n\000R\024\020\027\032\b\022\004\022\0020\0300\tX\004¢\006\002\n\000¨\006?"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelImpl;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;", "editor", "Lcom/intellij/openapi/editor/ex/EditorEx;", "<init>", "(Lcom/intellij/openapi/editor/ex/EditorEx;)V", "getEditor", "()Lcom/intellij/openapi/editor/ex/EditorEx;", "blocks", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;", "getBlocks", "()Ljava/util/List;", "highlightings", "", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo;", "blockInfos", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlockInfo;", "highlightingsSnapshot", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputHighlightingsSnapshot;", "document", "Lcom/intellij/openapi/editor/Document;", "listeners", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelListener;", "addListener", "", "listener", "disposable", "Lcom/intellij/openapi/Disposable;", "createBlock", "command", "", "prompt", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;", "terminalWidth", "", "finalizeBlock", "activeBlock", "removeBlock", "block", "findBlockRangeToDelete", "Lcom/intellij/openapi/util/TextRange;", "clearBlocks", "getHighlightingsSnapshot", "getHighlightings", "putHighlightings", "setBlockInfo", "info", "getBlockInfo", "trimOutput", "trimTopBlock", "maxCapacity", "findTopBlockCountToRemove", "textLength", "deleteDocumentRange", "deleteRange", "deleteDocumentRangeInHighlightings", "findIntersectionLength", "range1", "range2", "getMaxCapacity", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nTerminalOutputModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalOutputModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelImpl\n+ 2 TerminalUiUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/TerminalUiUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,312:1\n311#2,5:313\n1863#3,2:318\n1863#3,2:320\n1863#3,2:322\n1863#3,2:330\n1863#3,2:332\n360#3,7:334\n1611#3,9:341\n1863#3:350\n1864#3:352\n1620#3:353\n77#4:324\n97#4,5:325\n1#5:351\n*S KotlinDebug\n*F\n+ 1 TerminalOutputModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelImpl\n*L\n61#1:313,5\n91#1:318,2\n99#1:320,2\n115#1:322,2\n173#1:330,2\n190#1:332,2\n211#1:334,7\n231#1:341,9\n231#1:350\n231#1:352\n231#1:353\n153#1:324\n153#1:325,5\n231#1:351\n*E\n"})
/*     */ public final class TerminalOutputModelImpl implements TerminalOutputModel {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final EditorEx editor;
/*     */   @NotNull
/*     */   private final List<CommandBlock> blocks;
/*     */   @NotNull
/*     */   private final Map<CommandBlock, List<HighlightingInfo>> highlightings;
/*     */   @NotNull
/*     */   private final Map<CommandBlock, CommandBlockInfo> blockInfos;
/*     */   @Nullable
/*     */   private TerminalOutputHighlightingsSnapshot highlightingsSnapshot;
/*     */   @NotNull
/*     */   private final Document document;
/*     */   @NotNull
/*     */   private final List<TerminalOutputModelListener> listeners;
/*     */   
/*  34 */   public TerminalOutputModelImpl(@NotNull EditorEx editor) { this.editor = editor;
/*  35 */     Intrinsics.checkNotNullExpressionValue(Collections.synchronizedList(new ArrayList()), "synchronizedList(...)"); this.blocks = Collections.synchronizedList(new ArrayList());
/*  36 */     this.highlightings = new LinkedHashMap<>();
/*  37 */     this.blockInfos = new HashMap<>();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  44 */     Intrinsics.checkNotNullExpressionValue(getEditor().getDocument(), "getDocument(...)"); this.document = (Document)getEditor().getDocument();
/*  45 */     this.listeners = new CopyOnWriteArrayList<>(); } @NotNull
/*     */   public EditorEx getEditor() { return this.editor; }
/*     */   @NotNull
/*     */   public List<CommandBlock> getBlocks() { return this.blocks; }
/*     */   public void addListener(@NotNull TerminalOutputModelListener listener, @Nullable Disposable disposable) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'listener'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield listeners : Ljava/util/List;
/*     */     //   10: aload_1
/*     */     //   11: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   16: pop
/*     */     //   17: aload_2
/*     */     //   18: ifnull -> 32
/*     */     //   21: aload_2
/*     */     //   22: aload_0
/*     */     //   23: aload_1
/*     */     //   24: <illegal opcode> dispose : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelImpl;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelListener;)Lcom/intellij/openapi/Disposable;
/*     */     //   29: invokestatic register : (Lcom/intellij/openapi/Disposable;Lcom/intellij/openapi/Disposable;)V
/*     */     //   32: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #48	-> 6
/*     */     //   #49	-> 17
/*     */     //   #50	-> 21
/*     */     //   #52	-> 32
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	33	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelImpl;
/*     */     //   0	33	1	listener	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelListener;
/*     */     //   0	33	2	disposable	Lcom/intellij/openapi/Disposable; }
/*  50 */   private static final void addListener$lambda$0(TerminalOutputModelImpl this$0, TerminalOutputModelListener $listener) { this$0.listeners.remove($listener); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @RequiresEdt
/*     */   @NotNull
/*     */   public CommandBlock createBlock(@Nullable String command, @Nullable TerminalPromptRenderingInfo prompt, int terminalWidth) {
/*  61 */     Document $this$executeInBulk$iv = this.document; int $i$f$executeInBulk = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 313 */     Ref.ObjectRef result$iv = new Ref.ObjectRef();
/* 314 */     DocumentUtil.executeInBulk($this$executeInBulk$iv, new TerminalOutputModelImpl$createBlock$$inlined$executeInBulk$1(result$iv, this, prompt, command, terminalWidth));
/*     */ 
/*     */     
/* 317 */     Intrinsics.checkNotNull(result$iv.element); CommandBlockImpl block = (CommandBlockImpl)result$iv.element; Iterable<TerminalOutputModelListener> $this$forEach$iv = this.listeners; int $i$f$forEach = 0;
/* 318 */     Iterator<TerminalOutputModelListener> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); TerminalOutputModelListener it = (TerminalOutputModelListener)element$iv; int $i$a$-forEach-TerminalOutputModelImpl$createBlock$1 = 0; it.blockCreated(block); }
/*     */      return block;
/* 320 */   } private static final void createBlock$lambda$1$appendTextWithHighlightings(TerminalOutputModelImpl this$0, List<HighlightingInfo> blockHighlightings, String text, List<HighlightingInfo> highlightings) { List<HighlightingInfo> adjustedHighlightings = TerminalTextHighlighterKt.rebase(highlightings, this$0.document.getTextLength()); this$0.document.insertString(this$0.document.getTextLength(), text); blockHighlightings.addAll(adjustedHighlightings); } @RequiresEdt public void finalizeBlock(@NotNull CommandBlock activeBlock) { Intrinsics.checkNotNullParameter(activeBlock, "activeBlock"); ((CommandBlockImpl)activeBlock).getRange().setGreedyToRight(false); Iterable<TerminalOutputModelListener> $this$forEach$iv = this.listeners; int $i$f$forEach = 0; Iterator<TerminalOutputModelListener> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); TerminalOutputModelListener it = (TerminalOutputModelListener)element$iv; int $i$a$-forEach-TerminalOutputModelImpl$finalizeBlock$1 = 0; it.blockFinalized(activeBlock); }  }
/*     */   private final TextRange findBlockRangeToDelete(CommandBlock block) { TextRange blockRange = new TextRange(block.getStartOffset(), block.getEndOffset()); if (!((this.document.getCharsSequence().charAt(blockRange.getStartOffset() - 1) == '\n') ? 1 : 0)) { String str = "Check failed."; throw new IllegalStateException(str.toString()); }  if (!((this.document.getCharsSequence().charAt(blockRange.getEndOffset()) == '\n') ? 1 : 0)) { String str = "Check failed."; throw new IllegalStateException(str.toString()); }  return (blockRange.getStartOffset() > 0) ? new TextRange(blockRange.getStartOffset() - 1, blockRange.getEndOffset()) : ((blockRange.getEndOffset() < this.document.getTextLength()) ? new TextRange(blockRange.getStartOffset(), blockRange.getEndOffset() + 1) : blockRange); } @RequiresEdt public void removeBlock(@NotNull CommandBlock block) { Intrinsics.checkNotNullParameter(block, "block"); int startBlockInd = getBlocks().indexOf(block); if (!((startBlockInd >= 0) ? 1 : 0)) { String str = "Check failed."; throw new IllegalStateException(str.toString()); }  TextRange rangeToDelete = findBlockRangeToDelete(block); for (int blockInd = startBlockInd + 1, i = getBlocks().size(); blockInd < i; blockInd++)
/* 322 */       deleteDocumentRangeInHighlightings(getBlocks().get(blockInd), rangeToDelete);  getBlocks().remove(block); this.highlightings.remove(block); this.highlightingsSnapshot = null; Iterable<TerminalOutputModelListener> $this$forEach$iv = this.listeners; int $i$f$forEach = 0; Iterator<TerminalOutputModelListener> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); TerminalOutputModelListener it = (TerminalOutputModelListener)element$iv; int $i$a$-forEach-TerminalOutputModelImpl$removeBlock$1 = 0; it.blockRemoved(block); }  this.document.deleteString(rangeToDelete.getStartOffset(), rangeToDelete.getEndOffset()); ((CommandBlockImpl)block).getRange().dispose(); }
/*     */   @RequiresEdt public void clearBlocks() { List blocksCopy = CollectionsKt.reversed(getBlocks()); for (CommandBlock block : blocksCopy)
/* 324 */       removeBlock(block);  getEditor().getDocument().setText(""); } @RequiresEdt @NotNull public TerminalOutputHighlightingsSnapshot getHighlightingsSnapshot() { TerminalOutputHighlightingsSnapshot snapshot = this.highlightingsSnapshot; if (snapshot == null) { Intrinsics.checkNotNullExpressionValue(getEditor().getDocument(), "getDocument(...)"); Map<CommandBlock, List<HighlightingInfo>> map1 = this.highlightings; Document document1 = (Document)getEditor().getDocument(); int $i$f$flatMap = 0; Map<CommandBlock, List<HighlightingInfo>> map2 = map1; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0;
/* 325 */       for (Map.Entry<CommandBlock, List<HighlightingInfo>> element$iv$iv : map2.entrySet()) {
/* 326 */         Map.Entry<CommandBlock, List<HighlightingInfo>> it = element$iv$iv; int $i$a$-flatMap-TerminalOutputModelImpl$getHighlightingsSnapshot$1 = 0; Iterable list$iv$iv = (Iterable)it.getValue();
/* 327 */         CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
/*     */       } 
/* 329 */       List<HighlightingInfo> list = (List)destination$iv$iv; Document document2 = document1; snapshot = new TerminalOutputHighlightingsSnapshot(document2, list); this.highlightingsSnapshot = snapshot; }  return snapshot; } @RequiresEdt @NotNull public List<HighlightingInfo> getHighlightings(@NotNull CommandBlock block) { Intrinsics.checkNotNullParameter(block, "block"); if ((List)this.highlightings.get(block) == null) (List)this.highlightings.get(block);  return CollectionsKt.emptyList(); } @RequiresEdt public void putHighlightings(@NotNull CommandBlock block, @NotNull List<HighlightingInfo> highlightings) { Intrinsics.checkNotNullParameter(block, "block"); Intrinsics.checkNotNullParameter(highlightings, "highlightings"); this.highlightings.put(block, highlightings); this.highlightingsSnapshot = null; }
/* 330 */   @RequiresEdt public void setBlockInfo(@NotNull CommandBlock block, @NotNull CommandBlockInfo info) { Intrinsics.checkNotNullParameter(block, "block"); Intrinsics.checkNotNullParameter(info, "info"); this.blockInfos.put(block, info); Iterable<TerminalOutputModelListener> $this$forEach$iv = this.listeners; int $i$f$forEach = 0; Iterator<TerminalOutputModelListener> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); TerminalOutputModelListener it = (TerminalOutputModelListener)element$iv; int $i$a$-forEach-TerminalOutputModelImpl$setBlockInfo$1 = 0; it.blockInfoUpdated(block, info); }  } @RequiresEdt @Nullable public CommandBlockInfo getBlockInfo(@NotNull CommandBlock block) { Intrinsics.checkNotNullParameter(block, "block"); return this.blockInfos.get(block); }
/*     */   @RequiresEdt public void trimOutput() { int maxCapacity = getMaxCapacity(); int textLength = this.document.getTextLength(); if (textLength <= maxCapacity)
/* 332 */       return;  int topBlockCountToRemove = findTopBlockCountToRemove(maxCapacity, textLength); List topBlocksToRemove = CollectionsKt.toList(getBlocks().subList(0, topBlockCountToRemove)); Iterable $this$forEach$iv = topBlocksToRemove; int $i$f$forEach = 0; Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); CommandBlock it = (CommandBlock)element$iv; int $i$a$-forEach-TerminalOutputModelImpl$trimOutput$1 = 0; removeBlock(it); }
/*     */      trimTopBlock(maxCapacity); } private final void trimTopBlock(int maxCapacity) { CommandBlock block; int textLength = this.document.getTextLength(); int textLengthToRemove = textLength - maxCapacity; if (textLengthToRemove <= 0)
/*     */       return;  if ((CommandBlock)CollectionsKt.firstOrNull(getBlocks()) == null) {
/*     */       (CommandBlock)CollectionsKt.firstOrNull(getBlocks()); return;
/*     */     }  int outputStartOffset = block.getOutputStartOffset(); int outputLengthToRemove = Math.min(block.getEndOffset() - outputStartOffset, textLengthToRemove); int linesCountBefore = this.document.getLineCount(); deleteDocumentRange(block, new TextRange(outputStartOffset, outputStartOffset + outputLengthToRemove));
/*     */     block.setTrimmedLinesCount(block.getTrimmedLinesCount() + linesCountBefore - this.document.getLineCount()); }
/*     */   private final void deleteDocumentRangeInHighlightings(CommandBlock block, TextRange deleteRange) { List<HighlightingInfo> highlightings = getHighlightings(block);
/*     */     Iterable<HighlightingInfo> $this$mapNotNull$iv = highlightings;
/*     */     int $i$f$mapNotNull = 0;
/* 341 */     Iterable<HighlightingInfo> iterable1 = $this$mapNotNull$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 349 */     Iterable<HighlightingInfo> $this$forEach$iv$iv$iv = iterable1; int $i$f$forEach = 0;
/* 350 */     Iterator<HighlightingInfo> iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; HighlightingInfo it = (HighlightingInfo)element$iv$iv;
/*     */       int $i$a$-mapNotNull-TerminalOutputModelImpl$deleteDocumentRangeInHighlightings$updatedHighlightings$1 = 0; }
/*     */     
/* 353 */     List<HighlightingInfo> updatedHighlightings = (List)destination$iv$iv;
/*     */     putHighlightings(block, updatedHighlightings); }
/*     */ 
/*     */   
/*     */   private final int findTopBlockCountToRemove(int maxCapacity, int textLength) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual getBlocks : ()Ljava/util/List;
/*     */     //   4: astore #4
/*     */     //   6: iconst_0
/*     */     //   7: istore #5
/*     */     //   9: iconst_0
/*     */     //   10: istore #6
/*     */     //   12: aload #4
/*     */     //   14: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   19: astore #7
/*     */     //   21: aload #7
/*     */     //   23: invokeinterface hasNext : ()Z
/*     */     //   28: ifeq -> 82
/*     */     //   31: aload #7
/*     */     //   33: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   38: astore #8
/*     */     //   40: aload #8
/*     */     //   42: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock
/*     */     //   45: astore #9
/*     */     //   47: iconst_0
/*     */     //   48: istore #10
/*     */     //   50: aload #9
/*     */     //   52: invokeinterface getEndOffset : ()I
/*     */     //   57: iload_1
/*     */     //   58: iadd
/*     */     //   59: iload_2
/*     */     //   60: if_icmple -> 67
/*     */     //   63: iconst_1
/*     */     //   64: goto -> 68
/*     */     //   67: iconst_0
/*     */     //   68: ifeq -> 76
/*     */     //   71: iload #6
/*     */     //   73: goto -> 83
/*     */     //   76: iinc #6, 1
/*     */     //   79: goto -> 21
/*     */     //   82: iconst_m1
/*     */     //   83: istore_3
/*     */     //   84: iload_3
/*     */     //   85: iconst_0
/*     */     //   86: invokestatic coerceAtLeast : (II)I
/*     */     //   89: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #211	-> 0
/*     */     //   #334	-> 9
/*     */     //   #335	-> 12
/*     */     //   #336	-> 40
/*     */     //   #212	-> 50
/*     */     //   #336	-> 68
/*     */     //   #337	-> 71
/*     */     //   #338	-> 76
/*     */     //   #340	-> 82
/*     */     //   #211	-> 83
/*     */     //   #214	-> 84
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   50	18	10	$i$a$-indexOfFirst-TerminalOutputModelImpl$findTopBlockCountToRemove$firstRetainedBlockInd$1	I
/*     */     //   47	21	9	it	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;
/*     */     //   40	39	8	item$iv	Ljava/lang/Object;
/*     */     //   9	74	5	$i$f$indexOfFirst	I
/*     */     //   12	71	6	index$iv	I
/*     */     //   6	77	4	$this$indexOfFirst$iv	Ljava/util/List;
/*     */     //   84	6	3	firstRetainedBlockInd	I
/*     */     //   0	90	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelImpl;
/*     */     //   0	90	1	maxCapacity	I
/*     */     //   0	90	2	textLength	I
/*     */   }
/*     */   
/*     */   @RequiresEdt
/*     */   private final void deleteDocumentRange(CommandBlock block, TextRange deleteRange) {
/*     */     int startBlockInd = getBlocks().indexOf(block);
/*     */     if (!((startBlockInd >= 0) ? 1 : 0)) {
/*     */       String str = "Check failed.";
/*     */       throw new IllegalStateException(str.toString());
/*     */     } 
/*     */     if (!deleteRange.isEmpty()) {
/*     */       for (int blockInd = startBlockInd, i = getBlocks().size(); blockInd < i; blockInd++)
/*     */         deleteDocumentRangeInHighlightings(getBlocks().get(blockInd), deleteRange); 
/*     */       this.document.deleteString(deleteRange.getStartOffset(), deleteRange.getEndOffset());
/*     */     } 
/*     */   }
/*     */   
/*     */   private final int findIntersectionLength(HighlightingInfo range1, TextRange range2) {
/*     */     int intersectionLength = Math.min(range1.getEndOffset(), range2.getEndOffset()) - Math.max(range1.getStartOffset(), range2.getStartOffset());
/*     */     return Math.max(intersectionLength, 0);
/*     */   }
/*     */   
/*     */   private final int getMaxCapacity() {
/*     */     return RangesKt.coerceIn(AdvancedSettings.Companion.getInt("new.terminal.output.capacity.kb"), 1, 10240) * 1024;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J1\020\004\032\0020\0052\b\020\006\032\004\030\0010\0072\b\020\b\032\004\030\0010\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH\001¢\006\002\b\016J\030\020\017\032\0020\0052\006\020\006\032\0020\0072\006\020\n\032\0020\013H\002¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelImpl$Companion;", "", "<init>", "()V", "createCommandAndRightPromptText", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithHighlightings;", "command", "", "prompt", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;", "commandAttributes", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;", "terminalWidth", "", "createCommandAndRightPromptText$ej_core", "createCommandText", "ej-core"})
/*     */   @SourceDebugExtension({"SMAP\nTerminalOutputModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalOutputModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelImpl$Companion\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,312:1\n170#2,6:313\n1#3:319\n*S KotlinDebug\n*F\n+ 1 TerminalOutputModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelImpl$Companion\n*L\n275#1:313,6\n*E\n"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @VisibleForTesting
/*     */     @NotNull
/*     */     public final TextWithHighlightings createCommandAndRightPromptText$ej_core(@Nullable String command, @Nullable TerminalPromptRenderingInfo prompt, @NotNull TextAttributesProvider commandAttributes, int terminalWidth) {
/*     */       // Byte code:
/*     */       //   0: aload_3
/*     */       //   1: ldc 'commandAttributes'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_1
/*     */       //   7: dup
/*     */       //   8: ifnonnull -> 14
/*     */       //   11: pop
/*     */       //   12: ldc ''
/*     */       //   14: astore #5
/*     */       //   16: aload_2
/*     */       //   17: dup
/*     */       //   18: ifnull -> 28
/*     */       //   21: invokevirtual getRightText : ()Ljava/lang/String;
/*     */       //   24: dup
/*     */       //   25: ifnonnull -> 31
/*     */       //   28: pop
/*     */       //   29: ldc ''
/*     */       //   31: astore #6
/*     */       //   33: aload #6
/*     */       //   35: checkcast java/lang/CharSequence
/*     */       //   38: invokeinterface length : ()I
/*     */       //   43: ifne -> 50
/*     */       //   46: iconst_1
/*     */       //   47: goto -> 51
/*     */       //   50: iconst_0
/*     */       //   51: ifeq -> 62
/*     */       //   54: aload_0
/*     */       //   55: aload #5
/*     */       //   57: aload_3
/*     */       //   58: invokespecial createCommandText : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;)Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithHighlightings;
/*     */       //   61: areturn
/*     */       //   62: aload_2
/*     */       //   63: dup
/*     */       //   64: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */       //   67: invokevirtual getText : ()Ljava/lang/String;
/*     */       //   70: astore #7
/*     */       //   72: aload #7
/*     */       //   74: invokevirtual length : ()I
/*     */       //   77: aload #7
/*     */       //   79: checkcast java/lang/CharSequence
/*     */       //   82: astore #9
/*     */       //   84: istore #17
/*     */       //   86: iconst_0
/*     */       //   87: istore #10
/*     */       //   89: aload #9
/*     */       //   91: invokeinterface length : ()I
/*     */       //   96: iconst_m1
/*     */       //   97: iadd
/*     */       //   98: istore #11
/*     */       //   100: iconst_0
/*     */       //   101: iload #11
/*     */       //   103: if_icmpgt -> 153
/*     */       //   106: iload #11
/*     */       //   108: istore #12
/*     */       //   110: iinc #11, -1
/*     */       //   113: aload #9
/*     */       //   115: iload #12
/*     */       //   117: invokeinterface charAt : (I)C
/*     */       //   122: istore #13
/*     */       //   124: iconst_0
/*     */       //   125: istore #14
/*     */       //   127: iload #13
/*     */       //   129: bipush #10
/*     */       //   131: if_icmpne -> 138
/*     */       //   134: iconst_1
/*     */       //   135: goto -> 139
/*     */       //   138: iconst_0
/*     */       //   139: ifeq -> 147
/*     */       //   142: iload #12
/*     */       //   144: goto -> 154
/*     */       //   147: iconst_0
/*     */       //   148: iload #11
/*     */       //   150: if_icmple -> 106
/*     */       //   153: iconst_m1
/*     */       //   154: istore #18
/*     */       //   156: iload #17
/*     */       //   158: iload #18
/*     */       //   160: iconst_1
/*     */       //   161: iadd
/*     */       //   162: isub
/*     */       //   163: istore #8
/*     */       //   165: aload #5
/*     */       //   167: checkcast java/lang/CharSequence
/*     */       //   170: bipush #10
/*     */       //   172: iconst_0
/*     */       //   173: iconst_0
/*     */       //   174: bipush #6
/*     */       //   176: aconst_null
/*     */       //   177: invokestatic indexOf$default : (Ljava/lang/CharSequence;CIZILjava/lang/Object;)I
/*     */       //   180: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   183: astore #11
/*     */       //   185: aload #11
/*     */       //   187: checkcast java/lang/Number
/*     */       //   190: invokevirtual intValue : ()I
/*     */       //   193: istore #12
/*     */       //   195: iconst_0
/*     */       //   196: istore #13
/*     */       //   198: iload #12
/*     */       //   200: iconst_m1
/*     */       //   201: if_icmpeq -> 208
/*     */       //   204: iconst_1
/*     */       //   205: goto -> 209
/*     */       //   208: iconst_0
/*     */       //   209: ifeq -> 217
/*     */       //   212: aload #11
/*     */       //   214: goto -> 218
/*     */       //   217: aconst_null
/*     */       //   218: dup
/*     */       //   219: ifnull -> 228
/*     */       //   222: invokevirtual intValue : ()I
/*     */       //   225: goto -> 234
/*     */       //   228: pop
/*     */       //   229: aload #5
/*     */       //   231: invokevirtual length : ()I
/*     */       //   234: istore #9
/*     */       //   236: iload #8
/*     */       //   238: iload #9
/*     */       //   240: iadd
/*     */       //   241: aload #6
/*     */       //   243: invokevirtual length : ()I
/*     */       //   246: iadd
/*     */       //   247: iload #4
/*     */       //   249: if_icmpge -> 478
/*     */       //   252: iload #4
/*     */       //   254: iload #8
/*     */       //   256: isub
/*     */       //   257: iload #9
/*     */       //   259: isub
/*     */       //   260: aload #6
/*     */       //   262: invokevirtual length : ()I
/*     */       //   265: isub
/*     */       //   266: istore #10
/*     */       //   268: invokestatic createListBuilder : ()Ljava/util/List;
/*     */       //   271: astore #12
/*     */       //   273: aload #12
/*     */       //   275: astore #13
/*     */       //   277: iconst_0
/*     */       //   278: istore #14
/*     */       //   280: iload #9
/*     */       //   282: ifle -> 315
/*     */       //   285: aload #13
/*     */       //   287: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithAttributes
/*     */       //   290: dup
/*     */       //   291: aload #5
/*     */       //   293: iconst_0
/*     */       //   294: iload #9
/*     */       //   296: invokevirtual substring : (II)Ljava/lang/String;
/*     */       //   299: dup
/*     */       //   300: ldc 'substring(...)'
/*     */       //   302: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   305: aload_3
/*     */       //   306: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;)V
/*     */       //   309: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   314: pop
/*     */       //   315: aload #13
/*     */       //   317: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithAttributes
/*     */       //   320: dup
/*     */       //   321: ldc ' '
/*     */       //   323: checkcast java/lang/CharSequence
/*     */       //   326: iload #10
/*     */       //   328: invokestatic repeat : (Ljava/lang/CharSequence;I)Ljava/lang/String;
/*     */       //   331: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/EmptyTextAttributesProvider.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/EmptyTextAttributesProvider;
/*     */       //   334: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider
/*     */       //   337: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;)V
/*     */       //   340: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   345: pop
/*     */       //   346: aload_2
/*     */       //   347: invokevirtual getRightHighlightings : ()Ljava/util/List;
/*     */       //   350: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   355: astore #15
/*     */       //   357: aload #15
/*     */       //   359: invokeinterface hasNext : ()Z
/*     */       //   364: ifeq -> 423
/*     */       //   367: aload #15
/*     */       //   369: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   374: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo
/*     */       //   377: astore #16
/*     */       //   379: aload #13
/*     */       //   381: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithAttributes
/*     */       //   384: dup
/*     */       //   385: aload #6
/*     */       //   387: aload #16
/*     */       //   389: invokevirtual getStartOffset : ()I
/*     */       //   392: aload #16
/*     */       //   394: invokevirtual getEndOffset : ()I
/*     */       //   397: invokevirtual substring : (II)Ljava/lang/String;
/*     */       //   400: dup
/*     */       //   401: ldc 'substring(...)'
/*     */       //   403: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   406: aload #16
/*     */       //   408: invokevirtual getTextAttributesProvider : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;
/*     */       //   411: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;)V
/*     */       //   414: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   419: pop
/*     */       //   420: goto -> 357
/*     */       //   423: iload #9
/*     */       //   425: aload #5
/*     */       //   427: invokevirtual length : ()I
/*     */       //   430: if_icmpge -> 462
/*     */       //   433: aload #13
/*     */       //   435: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithAttributes
/*     */       //   438: dup
/*     */       //   439: aload #5
/*     */       //   441: iload #9
/*     */       //   443: invokevirtual substring : (I)Ljava/lang/String;
/*     */       //   446: dup
/*     */       //   447: ldc 'substring(...)'
/*     */       //   449: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   452: aload_3
/*     */       //   453: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;)V
/*     */       //   456: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   461: pop
/*     */       //   462: nop
/*     */       //   463: aload #12
/*     */       //   465: invokestatic build : (Ljava/util/List;)Ljava/util/List;
/*     */       //   468: astore #11
/*     */       //   470: aload #11
/*     */       //   472: invokestatic toTextWithHighlightings : (Ljava/util/List;)Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithHighlightings;
/*     */       //   475: goto -> 485
/*     */       //   478: aload_0
/*     */       //   479: aload #5
/*     */       //   481: aload_3
/*     */       //   482: invokespecial createCommandText : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;)Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithHighlightings;
/*     */       //   485: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #268	-> 6
/*     */       //   #269	-> 16
/*     */       //   #270	-> 33
/*     */       //   #270	-> 51
/*     */       //   #272	-> 54
/*     */       //   #274	-> 62
/*     */       //   #275	-> 72
/*     */       //   #313	-> 89
/*     */       //   #314	-> 113
/*     */       //   #275	-> 127
/*     */       //   #314	-> 139
/*     */       //   #315	-> 142
/*     */       //   #313	-> 147
/*     */       //   #318	-> 153
/*     */       //   #275	-> 160
/*     */       //   #276	-> 165
/*     */       //   #319	-> 195
/*     */       //   #276	-> 198
/*     */       //   #276	-> 209
/*     */       //   #276	-> 218
/*     */       //   #278	-> 236
/*     */       //   #280	-> 252
/*     */       //   #281	-> 268
/*     */       //   #282	-> 280
/*     */       //   #283	-> 285
/*     */       //   #283	-> 305
/*     */       //   #285	-> 315
/*     */       //   #286	-> 346
/*     */       //   #287	-> 379
/*     */       //   #287	-> 406
/*     */       //   #289	-> 423
/*     */       //   #290	-> 433
/*     */       //   #290	-> 452
/*     */       //   #292	-> 462
/*     */       //   #281	-> 463
/*     */       //   #281	-> 468
/*     */       //   #293	-> 470
/*     */       //   #297	-> 478
/*     */       //   #278	-> 485
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   127	12	14	$i$a$-indexOfLast-TerminalOutputModelImpl$Companion$createCommandAndRightPromptText$promptLastLineLength$1	I
/*     */       //   124	15	13	it	C
/*     */       //   110	43	12	index$iv	I
/*     */       //   89	65	10	$i$f$indexOfLast	I
/*     */       //   86	68	9	$this$indexOfLast$iv	Ljava/lang/CharSequence;
/*     */       //   198	11	13	$i$a$-takeIf-TerminalOutputModelImpl$Companion$createCommandAndRightPromptText$commandFirstLineLength$1	I
/*     */       //   195	14	12	it	I
/*     */       //   379	41	16	highlighting	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo;
/*     */       //   280	183	14	$i$a$-buildList-TerminalOutputModelImpl$Companion$createCommandAndRightPromptText$components$1	I
/*     */       //   277	186	13	$this$createCommandAndRightPromptText_u24lambda_u242	Ljava/util/List;
/*     */       //   268	207	10	spacesCount	I
/*     */       //   470	5	11	components	Ljava/util/List;
/*     */       //   16	470	5	commandText	Ljava/lang/String;
/*     */       //   33	453	6	rightPromptText	Ljava/lang/String;
/*     */       //   72	414	7	promptText	Ljava/lang/String;
/*     */       //   165	321	8	promptLastLineLength	I
/*     */       //   236	250	9	commandFirstLineLength	I
/*     */       //   0	486	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelImpl$Companion;
/*     */       //   0	486	1	command	Ljava/lang/String;
/*     */       //   0	486	2	prompt	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptRenderingInfo;
/*     */       //   0	486	3	commandAttributes	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;
/*     */       //   0	486	4	terminalWidth	I
/*     */     }
/*     */     
/*     */     private final TextWithHighlightings createCommandText(String command, TextAttributesProvider commandAttributes) {
/*     */       List<HighlightingInfo> highlightings = ((((CharSequence)command).length() > 0)) ? CollectionsKt.listOf(new HighlightingInfo(0, command.length(), commandAttributes)) : CollectionsKt.emptyList();
/*     */       return new TextWithHighlightings(command, highlightings);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalOutputModelImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */