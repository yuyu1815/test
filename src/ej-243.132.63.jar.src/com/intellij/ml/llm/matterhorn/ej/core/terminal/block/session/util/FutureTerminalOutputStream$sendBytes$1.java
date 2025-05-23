/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.util;
/*    */ 
/*    */ import com.jediterm.terminal.TerminalOutputStream;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ final class FutureTerminalOutputStream$sendBytes$1
/*    */   implements Function1
/*    */ {
/*    */   FutureTerminalOutputStream$sendBytes$1(byte[] $response, boolean $userInput) {}
/*    */   
/*    */   public final void invoke(TerminalOutputStream it) {
/* 33 */     if (it != null) { it.sendBytes(this.$response, this.$userInput); }
/*    */     else
/*    */     {  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\sessio\\util\FutureTerminalOutputStream$sendBytes$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */