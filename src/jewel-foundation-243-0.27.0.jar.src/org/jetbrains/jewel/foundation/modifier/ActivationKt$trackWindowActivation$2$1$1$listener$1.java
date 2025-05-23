/*    */ package org.jetbrains.jewel.foundation.modifier;
/*    */ 
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import java.awt.event.WindowAdapter;
/*    */ import java.awt.event.WindowEvent;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\022\020\002\032\0020\0032\b\020\004\032\004\030\0010\005H\026J\022\020\006\032\0020\0032\b\020\004\032\004\030\0010\005H\026¨\006\007"}, d2 = {"org/jetbrains/jewel/foundation/modifier/ActivationKt$trackWindowActivation$2$1$1$listener$1", "Ljava/awt/event/WindowAdapter;", "windowActivated", "", "e", "Ljava/awt/event/WindowEvent;", "windowDeactivated", "foundation"})
/*    */ public final class ActivationKt$trackWindowActivation$2$1$1$listener$1
/*    */   extends WindowAdapter
/*    */ {
/*    */   ActivationKt$trackWindowActivation$2$1$1$listener$1(MutableState<Boolean> $parentActivated$delegate) {}
/*    */   
/*    */   public void windowActivated(WindowEvent e) {
/* 44 */     ActivationKt$trackWindowActivation$2.access$invoke$lambda$2(this.$parentActivated$delegate, true);
/*    */   }
/*    */   
/*    */   public void windowDeactivated(WindowEvent e) {
/* 48 */     ActivationKt$trackWindowActivation$2.access$invoke$lambda$2(this.$parentActivated$delegate, false);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\modifier\ActivationKt$trackWindowActivation$2$1$1$listener$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */