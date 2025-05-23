/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import java.awt.event.InputMethodEvent;
/*    */ import java.awt.event.InputMethodListener;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026¨\006\007"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputEditorInputMethodSupport$install$inputMethodListener$1", "Ljava/awt/event/InputMethodListener;", "inputMethodTextChanged", "", "event", "Ljava/awt/event/InputMethodEvent;", "caretPositionChanged", "ej-core"})
/*    */ public final class TerminalOutputEditorInputMethodSupport$install$inputMethodListener$1
/*    */   implements InputMethodListener
/*    */ {
/*    */   public void inputMethodTextChanged(InputMethodEvent event) {
/* 52 */     Intrinsics.checkNotNullParameter(event, "event"); if (!TerminalOutputEditorInputMethodSupport.access$getEditor$p(TerminalOutputEditorInputMethodSupport.this).isDisposed()) {
/* 53 */       TerminalOutputEditorInputMethodSupport.access$handleInputMethodTextChanged(TerminalOutputEditorInputMethodSupport.this, event);
/*    */     }
/* 55 */     event.consume();
/*    */   }
/*    */   
/*    */   public void caretPositionChanged(InputMethodEvent event) {
/* 59 */     Intrinsics.checkNotNullParameter(event, "event"); event.consume();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalOutputEditorInputMethodSupport$install$inputMethodListener$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */