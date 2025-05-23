/*    */ package feedback;
/*    */ import com.intellij.ui.components.JBLabel;
/*    */ import com.intellij.ui.components.JBTextArea;
/*    */ import com.intellij.util.ui.JBFont;
/*    */ import java.awt.event.KeyAdapter;
/*    */ import java.awt.event.KeyEvent;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\030\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\002\n\002\030\002\n\000\032\016\020\000\032\0020\0012\006\020\002\032\0020\003\032\n\020\004\032\0020\005*\0020\006¨\006\007"}, d2 = {"createBoldJBLabel", "Lcom/intellij/ui/components/JBLabel;", "label", "", "adjustBehaviourForFeedbackForm", "", "Lcom/intellij/ui/components/JBTextArea;", "ej-ui"})
/*    */ public final class TextAreaBlockKt {
/*    */   @NotNull
/*    */   public static final JBLabel createBoldJBLabel(@NotNull String label) {
/* 15 */     Intrinsics.checkNotNullParameter(label, "label"); JBLabel jBLabel1 = new JBLabel(label), $this$createBoldJBLabel_u24lambda_u240 = jBLabel1; int $i$a$-apply-TextAreaBlockKt$createBoldJBLabel$1 = 0;
/* 16 */     $this$createBoldJBLabel_u24lambda_u240.setFont((Font)JBFont.create($this$createBoldJBLabel_u24lambda_u240.getFont().deriveFont(1), false));
/*    */     return jBLabel1;
/*    */   }
/*    */   
/*    */   public static final void adjustBehaviourForFeedbackForm(@NotNull JBTextArea $this$adjustBehaviourForFeedbackForm) {
/* 21 */     Intrinsics.checkNotNullParameter($this$adjustBehaviourForFeedbackForm, "<this>"); $this$adjustBehaviourForFeedbackForm.setWrapStyleWord(true);
/* 22 */     $this$adjustBehaviourForFeedbackForm.setLineWrap(true);
/* 23 */     $this$adjustBehaviourForFeedbackForm.addKeyListener(new TextAreaBlockKt$adjustBehaviourForFeedbackForm$1($this$adjustBehaviourForFeedbackForm)); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"feedback/TextAreaBlockKt$adjustBehaviourForFeedbackForm$1", "Ljava/awt/event/KeyAdapter;", "keyPressed", "", "e", "Ljava/awt/event/KeyEvent;", "ej-ui"})
/*    */   public static final class TextAreaBlockKt$adjustBehaviourForFeedbackForm$1 extends KeyAdapter { public void keyPressed(KeyEvent e) {
/* 25 */       Intrinsics.checkNotNullParameter(e, "e"); if (e.getKeyCode() == 9) {
/* 26 */         if ((e.getModifiersEx() & 0x40) != 0) {
/* 27 */           this.$this_adjustBehaviourForFeedbackForm.transferFocusBackward();
/*    */         } else {
/*    */           
/* 30 */           this.$this_adjustBehaviourForFeedbackForm.transferFocus();
/*    */         } 
/* 32 */         e.consume();
/*    */       } 
/*    */     }
/*    */     
/*    */     TextAreaBlockKt$adjustBehaviourForFeedbackForm$1(JBTextArea $receiver) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\feedback\TextAreaBlockKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */