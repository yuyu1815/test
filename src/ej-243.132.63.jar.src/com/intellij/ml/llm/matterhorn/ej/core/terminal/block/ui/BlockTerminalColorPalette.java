/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.ui;
/*    */ import com.intellij.openapi.editor.colors.EditorColorsManager;
/*    */ import com.intellij.openapi.editor.colors.TextAttributesKey;
/*    */ import com.intellij.terminal.BlockTerminalColors;
/*    */ import com.jediterm.core.Color;
/*    */ import com.jediterm.terminal.ui.AwtTransformers;
/*    */ import java.awt.Color;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\020\b\n\002\b\003\b\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\022\020\022\032\004\030\0010\0232\006\020\024\032\0020\025H\024J\022\020\026\032\004\030\0010\0062\006\020\027\032\0020\025H\002R\026\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\004\n\002\020\007R\024\020\b\032\0020\t8BX\004¢\006\006\032\004\b\n\020\013R\024\020\f\032\0020\r8VX\004¢\006\006\032\004\b\016\020\017R\024\020\020\032\0020\r8VX\004¢\006\006\032\004\b\021\020\017¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/ui/BlockTerminalColorPalette;", "Lcom/intellij/terminal/TerminalColorPalette;", "<init>", "()V", "colorKeys", "", "Lcom/intellij/openapi/editor/colors/TextAttributesKey;", "[Lcom/intellij/openapi/editor/colors/TextAttributesKey;", "colorsScheme", "Lcom/intellij/openapi/editor/colors/EditorColorsScheme;", "getColorsScheme", "()Lcom/intellij/openapi/editor/colors/EditorColorsScheme;", "defaultForeground", "Lcom/jediterm/core/Color;", "getDefaultForeground", "()Lcom/jediterm/core/Color;", "defaultBackground", "getDefaultBackground", "getAttributesByColorIndex", "Lcom/intellij/openapi/editor/markup/TextAttributes;", "index", "", "getAnsiColorKey", "value", "ej-core"})
/*    */ public final class BlockTerminalColorPalette extends TerminalColorPalette {
/*    */   @NotNull
/* 14 */   private final TextAttributesKey[] colorKeys = BlockTerminalColors.INSTANCE.getKEYS();
/*    */   
/*    */   private final EditorColorsScheme getColorsScheme() {
/* 17 */     Intrinsics.checkNotNullExpressionValue(EditorColorsManager.getInstance().getGlobalScheme(), "getGlobalScheme(...)"); return EditorColorsManager.getInstance().getGlobalScheme();
/*    */   }
/*    */   @NotNull
/*    */   public Color getDefaultForeground() {
/* 21 */     Color foregroundColor = getColorsScheme().getColor(BlockTerminalColors.DEFAULT_FOREGROUND);
/* 22 */     if (foregroundColor == null) Intrinsics.checkNotNullExpressionValue(getColorsScheme().getDefaultForeground(), "getDefaultForeground(...)");  Intrinsics.checkNotNull(AwtTransformers.fromAwtColor(getColorsScheme().getDefaultForeground())); return AwtTransformers.fromAwtColor(getColorsScheme().getDefaultForeground());
/*    */   }
/*    */   @NotNull
/*    */   public Color getDefaultBackground() {
/* 26 */     Intrinsics.checkNotNull(AwtTransformers.fromAwtColor((Color)TerminalUi.defaultBackground$default(TerminalUi.INSTANCE, null, 1, null))); return AwtTransformers.fromAwtColor((Color)TerminalUi.defaultBackground$default(TerminalUi.INSTANCE, null, 1, null));
/*    */   } @Nullable
/*    */   protected TextAttributes getAttributesByColorIndex(int index) {
/*    */     TextAttributesKey key;
/* 30 */     if (getAnsiColorKey(index) == null) { getAnsiColorKey(index); return null; }
/* 31 */      return getColorsScheme().getAttributes(key);
/*    */   }
/*    */   
/*    */   private final TextAttributesKey getAnsiColorKey(int value) {
/* 35 */     return ((0 <= value) ? ((value < this.colorKeys.length)) : false) ? 
/* 36 */       this.colorKeys[value] : 
/*    */       
/* 38 */       null;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\bloc\\ui\BlockTerminalColorPalette.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */