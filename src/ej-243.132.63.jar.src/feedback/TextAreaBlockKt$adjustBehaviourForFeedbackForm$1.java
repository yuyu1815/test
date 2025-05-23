/*    */ package feedback;
/*    */ 
/*    */ import com.intellij.ui.components.JBTextArea;
/*    */ import java.awt.event.KeyAdapter;
/*    */ import java.awt.event.KeyEvent;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"feedback/TextAreaBlockKt$adjustBehaviourForFeedbackForm$1", "Ljava/awt/event/KeyAdapter;", "keyPressed", "", "e", "Ljava/awt/event/KeyEvent;", "ej-ui"})
/*    */ public final class TextAreaBlockKt$adjustBehaviourForFeedbackForm$1
/*    */   extends KeyAdapter
/*    */ {
/*    */   TextAreaBlockKt$adjustBehaviourForFeedbackForm$1(JBTextArea $receiver) {}
/*    */   
/*    */   public void keyPressed(KeyEvent e) {
/* 25 */     Intrinsics.checkNotNullParameter(e, "e"); if (e.getKeyCode() == 9) {
/* 26 */       if ((e.getModifiersEx() & 0x40) != 0) {
/* 27 */         this.$this_adjustBehaviourForFeedbackForm.transferFocusBackward();
/*    */       } else {
/*    */         
/* 30 */         this.$this_adjustBehaviourForFeedbackForm.transferFocus();
/*    */       } 
/* 32 */       e.consume();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\feedback\TextAreaBlockKt$adjustBehaviourForFeedbackForm$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */