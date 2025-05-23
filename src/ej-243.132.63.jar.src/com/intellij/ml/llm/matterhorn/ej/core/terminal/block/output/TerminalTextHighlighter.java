/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.editor.highlighter.EditorHighlighter;
/*     */ import com.intellij.openapi.editor.highlighter.HighlighterClient;
/*     */ import com.intellij.openapi.editor.highlighter.HighlighterIterator;
/*     */ import com.intellij.openapi.editor.markup.TextAttributes;
/*     */ import com.intellij.psi.tree.IElementType;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\002\n\002\b\002\b\000\030\0002\0020\001:\001\024B\027\b\002\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006B\021\b\026\022\006\020\007\032\0020\b¢\006\004\b\005\020\tB\021\b\020\022\006\020\n\032\0020\004¢\006\004\b\005\020\013J\020\020\016\032\0020\0172\006\020\020\032\0020\021H\026J\020\020\022\032\0020\0232\006\020\f\032\0020\rH\026R\024\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000R\020\020\f\032\004\030\0010\rX\016¢\006\002\n\000¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalTextHighlighter;", "Lcom/intellij/openapi/editor/highlighter/EditorHighlighter;", "highlightingsSnapshotProvider", "Lkotlin/Function0;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputHighlightingsSnapshot;", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "model", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;)V", "highlightingsSnapshot", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputHighlightingsSnapshot;)V", "editor", "Lcom/intellij/openapi/editor/highlighter/HighlighterClient;", "createIterator", "Lcom/intellij/openapi/editor/highlighter/HighlighterIterator;", "startOffset", "", "setEditor", "", "MyHighlighterIterator", "ej-core"})
/*     */ public final class TerminalTextHighlighter
/*     */   implements EditorHighlighter
/*     */ {
/*     */   @NotNull
/*     */   private final Function0<TerminalOutputHighlightingsSnapshot> highlightingsSnapshotProvider;
/*     */   @Nullable
/*     */   private HighlighterClient editor;
/*     */   
/*     */   private TerminalTextHighlighter(Function0<TerminalOutputHighlightingsSnapshot> highlightingsSnapshotProvider) {
/*  65 */     this.highlightingsSnapshotProvider = highlightingsSnapshotProvider;
/*     */   }
/*     */   
/*     */   public TerminalTextHighlighter(@NotNull TerminalOutputModel model) {
/*  69 */     this(model::_init_$lambda$0); } private static final TerminalOutputHighlightingsSnapshot _init_$lambda$0(TerminalOutputModel $model) { return $model.getHighlightingsSnapshot(); }
/*  70 */   public TerminalTextHighlighter(@NotNull TerminalOutputHighlightingsSnapshot highlightingsSnapshot) { this(highlightingsSnapshot::_init_$lambda$1); } private static final TerminalOutputHighlightingsSnapshot _init_$lambda$1(TerminalOutputHighlightingsSnapshot $highlightingsSnapshot) { return $highlightingsSnapshot; }
/*     */    @NotNull
/*     */   public HighlighterIterator createIterator(int startOffset) {
/*  73 */     TerminalOutputHighlightingsSnapshot highlightingsSnapshot = (TerminalOutputHighlightingsSnapshot)this.highlightingsSnapshotProvider.invoke();
/*  74 */     int curInd = highlightingsSnapshot.findHighlightingIndex(startOffset);
/*  75 */     return new MyHighlighterIterator((this.editor != null) ? this.editor.getDocument() : null, highlightingsSnapshot, curInd);
/*     */   }
/*     */   
/*     */   public void setEditor(@NotNull HighlighterClient editor) {
/*  79 */     Intrinsics.checkNotNullParameter(editor, "editor"); this.editor = editor; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\020\013\n\002\b\002\b\002\030\0002\0020\001B!\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\b\020\n\032\0020\007H\026J\b\020\013\032\0020\007H\026J\b\020\f\032\0020\rH\026J\n\020\016\032\004\030\0010\017H\026J\b\020\020\032\0020\021H\026J\b\020\022\032\0020\021H\026J\b\020\023\032\0020\024H\026J\n\020\025\032\004\030\0010\003H\026R\020\020\002\032\004\030\0010\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\016¢\006\002\n\000¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalTextHighlighter$MyHighlighterIterator;", "Lcom/intellij/openapi/editor/highlighter/HighlighterIterator;", "document", "Lcom/intellij/openapi/editor/Document;", "highlightings", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputHighlightingsSnapshot;", "curInd", "", "<init>", "(Lcom/intellij/openapi/editor/Document;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputHighlightingsSnapshot;I)V", "getStart", "getEnd", "getTextAttributes", "Lcom/intellij/openapi/editor/markup/TextAttributes;", "getTokenType", "Lcom/intellij/psi/tree/IElementType;", "advance", "", "retreat", "atEnd", "", "getDocument", "ej-core"})
/*     */   private static final class MyHighlighterIterator implements HighlighterIterator {
/*     */     @Nullable
/*  82 */     private final Document document; public MyHighlighterIterator(@Nullable Document document, @NotNull TerminalOutputHighlightingsSnapshot highlightings, int curInd) { this.document = document;
/*  83 */       this.highlightings = highlightings;
/*  84 */       this.curInd = curInd; } @NotNull
/*     */     private final TerminalOutputHighlightingsSnapshot highlightings; private int curInd; public int getStart() {
/*  86 */       return this.highlightings.get(this.curInd).getStartOffset();
/*     */     } public int getEnd() {
/*  88 */       return this.highlightings.get(this.curInd).getEndOffset();
/*     */     } @NotNull
/*     */     public TextAttributes getTextAttributes() {
/*  91 */       return this.highlightings.get(this.curInd).getTextAttributesProvider().getTextAttributes();
/*     */     } @Nullable
/*     */     public IElementType getTokenType() {
/*  94 */       return null;
/*     */     }
/*     */     public void advance() {
/*  97 */       if (this.curInd < this.highlightings.getSize()) { int i = this.curInd; this.curInd = i + 1; }
/*     */     
/*     */     }
/*     */     public void retreat() {
/* 101 */       if (this.curInd > -1) { int i = this.curInd; this.curInd = i + -1; }
/*     */     
/*     */     }
/* 104 */     public boolean atEnd() { return (this.curInd < 0 || this.curInd >= this.highlightings.getSize()); } @Nullable
/*     */     public Document getDocument() {
/* 106 */       return this.document;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalTextHighlighter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */