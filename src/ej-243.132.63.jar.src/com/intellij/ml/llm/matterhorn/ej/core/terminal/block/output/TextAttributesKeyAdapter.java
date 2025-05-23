/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.editor.colors.TextAttributesKey;
/*    */ import com.intellij.openapi.editor.markup.TextAttributes;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\b\000\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\b\020\b\032\0020\tH\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesKeyAdapter;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextAttributesProvider;", "editor", "Lcom/intellij/openapi/editor/Editor;", "textAttributesKey", "Lcom/intellij/openapi/editor/colors/TextAttributesKey;", "<init>", "(Lcom/intellij/openapi/editor/Editor;Lcom/intellij/openapi/editor/colors/TextAttributesKey;)V", "getTextAttributes", "Lcom/intellij/openapi/editor/markup/TextAttributes;", "ej-core"})
/*    */ public final class TextAttributesKeyAdapter
/*    */   implements TextAttributesProvider
/*    */ {
/*    */   @NotNull
/*    */   private final Editor editor;
/*    */   @NotNull
/*    */   private final TextAttributesKey textAttributesKey;
/*    */   
/*    */   public TextAttributesKeyAdapter(@NotNull Editor editor, @NotNull TextAttributesKey textAttributesKey) {
/* 44 */     this.editor = editor; this.textAttributesKey = textAttributesKey; } @NotNull
/* 45 */   public TextAttributes getTextAttributes() { Intrinsics.checkNotNullExpressionValue(this.editor.getColorsScheme().getAttributes(this.textAttributesKey), "getAttributes(...)"); return this.editor.getColorsScheme().getAttributes(this.textAttributesKey); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TextAttributesKeyAdapter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */