/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.editor.LogicalPosition;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Point;
/*     */ import java.awt.Rectangle;
/*     */ import java.awt.font.TextHitInfo;
/*     */ import java.awt.im.InputMethodRequests;
/*     */ import java.text.AttributedCharacterIterator;
/*     */ import java.text.AttributedString;
/*     */ import kotlin.Metadata;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\006\b\004\030\0002\0020\001B\007¢\006\004\b\002\020\003J\022\020\004\032\0020\0052\b\020\006\032\004\030\0010\007H\026J\032\020\b\032\004\030\0010\0072\006\020\t\032\0020\n2\006\020\013\032\0020\nH\026J\b\020\f\032\0020\nH\026J/\020\r\032\0020\0162\006\020\017\032\0020\n2\006\020\020\032\0020\n2\020\020\021\032\f\022\006\b\001\022\0020\023\030\0010\022H\026¢\006\002\020\024J\b\020\025\032\0020\nH\026J!\020\026\032\004\030\0010\0162\020\020\021\032\f\022\006\b\001\022\0020\023\030\0010\022H\026¢\006\002\020\027J!\020\030\032\004\030\0010\0162\020\020\021\032\f\022\006\b\001\022\0020\023\030\0010\022H\026¢\006\002\020\027¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputEditorInputMethodSupport$MyInputMethodRequests;", "Ljava/awt/im/InputMethodRequests;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputEditorInputMethodSupport;)V", "getTextLocation", "Ljava/awt/Rectangle;", "offset", "Ljava/awt/font/TextHitInfo;", "getLocationOffset", "x", "", "y", "getInsertPositionOffset", "getCommittedText", "Ljava/text/AttributedCharacterIterator;", "beginIndex", "endIndex", "attributes", "", "Ljava/text/AttributedCharacterIterator$Attribute;", "(II[Ljava/text/AttributedCharacterIterator$Attribute;)Ljava/text/AttributedCharacterIterator;", "getCommittedTextLength", "cancelLatestCommittedText", "([Ljava/text/AttributedCharacterIterator$Attribute;)Ljava/text/AttributedCharacterIterator;", "getSelectedText", "ej-core"})
/*     */ final class MyInputMethodRequests
/*     */   implements InputMethodRequests
/*     */ {
/*     */   @NotNull
/*     */   public Rectangle getTextLocation(@Nullable TextHitInfo offset) {
/*     */     LogicalPosition cursorPosition;
/* 113 */     if (TerminalOutputEditorInputMethodSupport.access$getEditor$p(TerminalOutputEditorInputMethodSupport.this).isDisposed()) return new Rectangle(); 
/* 114 */     if (TerminalOutputEditorInputMethodSupport.access$getCaretModel$p(TerminalOutputEditorInputMethodSupport.this).getCaretPosition() == null) { TerminalOutputEditorInputMethodSupport.access$getCaretModel$p(TerminalOutputEditorInputMethodSupport.this).getCaretPosition(); return new Rectangle(); }
/* 115 */      Intrinsics.checkNotNullExpressionValue(TerminalOutputEditorInputMethodSupport.access$getEditor$p(TerminalOutputEditorInputMethodSupport.this).logicalPositionToXY(cursorPosition), "logicalPositionToXY(...)"); Point caret = TerminalOutputEditorInputMethodSupport.access$getEditor$p(TerminalOutputEditorInputMethodSupport.this).logicalPositionToXY(cursorPosition);
/* 116 */     Rectangle r = new Rectangle(caret, new Dimension(1, TerminalOutputEditorInputMethodSupport.access$getEditor$p(TerminalOutputEditorInputMethodSupport.this).getLineHeight()));
/* 117 */     Intrinsics.checkNotNullExpressionValue(TerminalOutputEditorInputMethodSupport.access$getEditor$p(TerminalOutputEditorInputMethodSupport.this).getContentComponent(), "getContentComponent(...)"); Point p = TerminalOutputEditorInputMethodSupportKt.access$getLocationOnScreen(TerminalOutputEditorInputMethodSupport.access$getEditor$p(TerminalOutputEditorInputMethodSupport.this).getContentComponent());
/* 118 */     r.translate(p.x, p.y);
/* 119 */     return r;
/*     */   } @Nullable
/*     */   public TextHitInfo getLocationOffset(int x, int y) {
/* 122 */     return null;
/*     */   } public int getInsertPositionOffset() {
/*     */     LogicalPosition cursorLogicalPosition;
/* 125 */     if (TerminalOutputEditorInputMethodSupport.access$getCaretModel$p(TerminalOutputEditorInputMethodSupport.this).getCaretPosition() == null) { TerminalOutputEditorInputMethodSupport.access$getCaretModel$p(TerminalOutputEditorInputMethodSupport.this).getCaretPosition(); return 0; }
/* 126 */      return TerminalOutputEditorInputMethodSupport.access$getEditor$p(TerminalOutputEditorInputMethodSupport.this).logicalPositionToOffset(cursorLogicalPosition);
/*     */   }
/*     */   @NotNull
/*     */   public AttributedCharacterIterator getCommittedText(int beginIndex, int endIndex, @Nullable AttributedCharacterIterator.Attribute[] attributes) {
/* 130 */     String committed = TerminalOutputEditorInputMethodSupportKt.access$getText((Editor)TerminalOutputEditorInputMethodSupport.access$getEditor$p(TerminalOutputEditorInputMethodSupport.this), beginIndex, endIndex);
/* 131 */     Intrinsics.checkNotNullExpressionValue((new AttributedString(committed)).getIterator(), "getIterator(...)"); return (new AttributedString(committed)).getIterator();
/*     */   }
/*     */   public int getCommittedTextLength() {
/* 134 */     return TerminalOutputEditorInputMethodSupport.access$getEditor$p(TerminalOutputEditorInputMethodSupport.this).getDocument().getTextLength();
/*     */   }
/*     */   @Nullable
/* 137 */   public AttributedCharacterIterator cancelLatestCommittedText(@Nullable AttributedCharacterIterator.Attribute[] attributes) { return null; } @Nullable
/*     */   public AttributedCharacterIterator getSelectedText(@Nullable AttributedCharacterIterator.Attribute[] attributes) {
/* 139 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalOutputEditorInputMethodSupport$MyInputMethodRequests.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */