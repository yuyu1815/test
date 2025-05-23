/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.find.impl.livePreview.LivePreviewPresentation;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.markup.TextAttributes;
/*     */ import com.intellij.terminal.BlockTerminalColors;
/*     */ import kotlin.Metadata;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020\b\n\002\b\005\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\016\020\002\032\0020\003X\004¢\006\002\n\000R\024\020\006\032\0020\0078VX\004¢\006\006\032\004\b\b\020\tR\024\020\n\032\0020\0078VX\004¢\006\006\032\004\b\013\020\tR\024\020\f\032\0020\rX\004¢\006\b\n\000\032\004\b\016\020\017R\024\020\020\032\0020\rX\004¢\006\b\n\000\032\004\b\021\020\017¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockTerminalSearchSession$TerminalSearchPresentation;", "Lcom/intellij/find/impl/livePreview/LivePreviewPresentation;", "editor", "Lcom/intellij/openapi/editor/Editor;", "<init>", "(Lcom/intellij/openapi/editor/Editor;)V", "defaultAttributes", "Lcom/intellij/openapi/editor/markup/TextAttributes;", "getDefaultAttributes", "()Lcom/intellij/openapi/editor/markup/TextAttributes;", "cursorAttributes", "getCursorAttributes", "defaultLayer", "", "getDefaultLayer", "()I", "cursorLayer", "getCursorLayer", "ej-core"})
/*     */ final class TerminalSearchPresentation
/*     */   implements LivePreviewPresentation
/*     */ {
/*     */   @NotNull
/*     */   private final Editor editor;
/*     */   private final int defaultLayer;
/*     */   private final int cursorLayer;
/*     */   
/*     */   public TerminalSearchPresentation(@NotNull Editor editor) {
/* 252 */     this.editor = editor;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 258 */     this.defaultLayer = 6001;
/* 259 */     this.cursorLayer = 6002; } public int getCursorLayer() { return this.cursorLayer; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public TextAttributes getDefaultAttributes() {
/*     */     if (this.editor.getColorsScheme().getAttributes(BlockTerminalColors.SEARCH_ENTRY) == null)
/*     */       this.editor.getColorsScheme().getAttributes(BlockTerminalColors.SEARCH_ENTRY); 
/*     */     return new TextAttributes();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public TextAttributes getCursorAttributes() {
/*     */     if (this.editor.getColorsScheme().getAttributes(BlockTerminalColors.CURRENT_SEARCH_ENTRY) == null)
/*     */       this.editor.getColorsScheme().getAttributes(BlockTerminalColors.CURRENT_SEARCH_ENTRY); 
/*     */     return new TextAttributes();
/*     */   }
/*     */   
/*     */   public int getDefaultLayer() {
/*     */     return this.defaultLayer;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\BlockTerminalSearchSession$TerminalSearchPresentation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */