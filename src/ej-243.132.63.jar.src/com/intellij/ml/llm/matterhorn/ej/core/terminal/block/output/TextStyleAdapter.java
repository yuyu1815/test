/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui.TerminalUiUtils;
/*    */ import com.intellij.openapi.editor.markup.TextAttributes;
/*    */ import com.intellij.terminal.TerminalColorPalette;
/*    */ import com.jediterm.terminal.TextStyle;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\b\000\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\b\020\b\032\0020\tH\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextStyleAdapter;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;", "style", "Lcom/jediterm/terminal/TextStyle;", "colorPalette", "Lcom/intellij/terminal/TerminalColorPalette;", "<init>", "(Lcom/jediterm/terminal/TextStyle;Lcom/intellij/terminal/TerminalColorPalette;)V", "getTextAttributes", "Lcom/intellij/openapi/editor/markup/TextAttributes;", "ej-core"})
/*    */ public final class TextStyleAdapter
/*    */   implements TextAttributesProvider
/*    */ {
/*    */   @NotNull
/*    */   private final TextStyle style;
/*    */   @NotNull
/*    */   private final TerminalColorPalette colorPalette;
/*    */   
/*    */   public TextStyleAdapter(@NotNull TextStyle style, @NotNull TerminalColorPalette colorPalette) {
/* 39 */     this.style = style;
/* 40 */     this.colorPalette = colorPalette; } @NotNull
/* 41 */   public TextAttributes getTextAttributes() { return TerminalUiUtils.INSTANCE.toTextAttributes$ej_core(this.style, this.colorPalette); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TextStyleAdapter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */