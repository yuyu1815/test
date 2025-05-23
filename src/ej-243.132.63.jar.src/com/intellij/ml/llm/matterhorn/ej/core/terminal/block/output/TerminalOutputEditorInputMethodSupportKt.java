/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import java.awt.Component;
/*     */ import java.awt.Point;
/*     */ import javax.swing.SwingUtilities;
/*     */ import kotlin.Metadata;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000 \n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\030\002\n\000\n\002\020\b\n\002\b\003\032\020\020\000\032\0020\0012\006\020\002\032\0020\003H\002\032\034\020\004\032\0020\005*\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\bH\002\"\016\020\n\032\0020\bXT¢\006\002\n\000¨\006\013"}, d2 = {"getLocationOnScreen", "Ljava/awt/Point;", "component", "Ljava/awt/Component;", "getText", "", "Lcom/intellij/openapi/editor/Editor;", "startIdx", "", "endIdx", "IME_INLAY_PRIORITY", "ej-core"})
/*     */ public final class TerminalOutputEditorInputMethodSupportKt
/*     */ {
/*     */   private static final int IME_INLAY_PRIORITY = 1000000;
/*     */   
/*     */   private static final Point getLocationOnScreen(Component component) {
/* 144 */     Point point1 = new Point(), it = point1; int $i$a$-also-TerminalOutputEditorInputMethodSupportKt$getLocationOnScreen$1 = 0;
/* 145 */     SwingUtilities.convertPointToScreen(it, component);
/*     */     return point1;
/*     */   }
/*     */   
/*     */   private static final String getText(Editor $this$getText, int startIdx, int endIdx) {
/* 150 */     if ((0 <= startIdx) ? ((startIdx < endIdx)) : false) {
/* 151 */       return $this$getText.getDocument().getImmutableCharSequence().subSequence(startIdx, endIdx).toString();
/*     */     }
/* 153 */     return "";
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalOutputEditorInputMethodSupportKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */