/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.editor.highlighter.HighlighterIterator;
/*     */ import com.intellij.openapi.editor.markup.TextAttributes;
/*     */ import com.intellij.psi.tree.IElementType;
/*     */ import kotlin.Metadata;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\020\013\n\002\b\002\b\002\030\0002\0020\001B!\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\b\020\n\032\0020\007H\026J\b\020\013\032\0020\007H\026J\b\020\f\032\0020\rH\026J\n\020\016\032\004\030\0010\017H\026J\b\020\020\032\0020\021H\026J\b\020\022\032\0020\021H\026J\b\020\023\032\0020\024H\026J\n\020\025\032\004\030\0010\003H\026R\020\020\002\032\004\030\0010\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\016¢\006\002\n\000¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalTextHighlighter$MyHighlighterIterator;", "Lcom/intellij/openapi/editor/highlighter/HighlighterIterator;", "document", "Lcom/intellij/openapi/editor/Document;", "highlightings", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputHighlightingsSnapshot;", "curInd", "", "<init>", "(Lcom/intellij/openapi/editor/Document;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputHighlightingsSnapshot;I)V", "getStart", "getEnd", "getTextAttributes", "Lcom/intellij/openapi/editor/markup/TextAttributes;", "getTokenType", "Lcom/intellij/psi/tree/IElementType;", "advance", "", "retreat", "atEnd", "", "getDocument", "ej-core"})
/*     */ final class MyHighlighterIterator
/*     */   implements HighlighterIterator
/*     */ {
/*     */   @Nullable
/*     */   private final Document document;
/*     */   @NotNull
/*     */   private final TerminalOutputHighlightingsSnapshot highlightings;
/*     */   private int curInd;
/*     */   
/*     */   public MyHighlighterIterator(@Nullable Document document, @NotNull TerminalOutputHighlightingsSnapshot highlightings, int curInd) {
/*  82 */     this.document = document;
/*  83 */     this.highlightings = highlightings;
/*  84 */     this.curInd = curInd;
/*     */   } public int getStart() {
/*  86 */     return this.highlightings.get(this.curInd).getStartOffset();
/*     */   } public int getEnd() {
/*  88 */     return this.highlightings.get(this.curInd).getEndOffset();
/*     */   } @NotNull
/*     */   public TextAttributes getTextAttributes() {
/*  91 */     return this.highlightings.get(this.curInd).getTextAttributesProvider().getTextAttributes();
/*     */   } @Nullable
/*     */   public IElementType getTokenType() {
/*  94 */     return null;
/*     */   }
/*     */   public void advance() {
/*  97 */     if (this.curInd < this.highlightings.getSize()) { int i = this.curInd; this.curInd = i + 1; }
/*     */   
/*     */   }
/*     */   public void retreat() {
/* 101 */     if (this.curInd > -1) { int i = this.curInd; this.curInd = i + -1; }
/*     */   
/*     */   }
/* 104 */   public boolean atEnd() { return (this.curInd < 0 || this.curInd >= this.highlightings.getSize()); } @Nullable
/*     */   public Document getDocument() {
/* 106 */     return this.document;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalTextHighlighter$MyHighlighterIterator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */