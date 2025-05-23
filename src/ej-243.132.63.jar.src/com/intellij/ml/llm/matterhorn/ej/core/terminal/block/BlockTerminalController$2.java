/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.ShellCommandSentListener;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController$2", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandSentListener;", "userCommandSent", "", "userCommand", "", "ej-core"})
/*    */ public final class null
/*    */   implements ShellCommandSentListener
/*    */ {
/*    */   public void generatorCommandSent(String generatorCommand) {
/* 75 */     ShellCommandSentListener.DefaultImpls.generatorCommandSent(this, generatorCommand);
/*    */   }
/*    */   
/*    */   public void userCommandSent(String userCommand) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'userCommand'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;
/*    */     //   10: invokestatic access$getDisposed : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;)Lkotlin/jvm/functions/Function0;
/*    */     //   13: invokestatic any : ()Lcom/intellij/openapi/application/ModalityState;
/*    */     //   16: dup
/*    */     //   17: ldc 'any(...)'
/*    */     //   19: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   22: aload_0
/*    */     //   23: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;
/*    */     //   26: aload_1
/*    */     //   27: <illegal opcode> run : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;Ljava/lang/String;)Ljava/lang/Runnable;
/*    */     //   32: invokestatic invokeLaterIfNeeded : (Lkotlin/jvm/functions/Function0;Lcom/intellij/openapi/application/ModalityState;Ljava/lang/Runnable;)V
/*    */     //   35: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #77	-> 6
/*    */     //   #86	-> 35
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	36	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController$2;
/*    */     //   0	36	1	userCommand	Ljava/lang/String;
/*    */   }
/*    */   
/*    */   private static final Unit userCommandSent$lambda$1$lambda$0(BlockTerminalController this$0, String $userCommand) {
/* 83 */     BlockTerminalController.access$startCommandBlock(BlockTerminalController.this, $userCommand, BlockTerminalController.access$getPromptController$p(BlockTerminalController.this).getModel().getRenderingInfo());
/* 84 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final void userCommandSent$lambda$1(BlockTerminalController this$0, String $userCommand) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: invokestatic access$getOutputController$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;)Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputController;
/*    */     //   4: aload_0
/*    */     //   5: aload_1
/*    */     //   6: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;Ljava/lang/String;)Lkotlin/jvm/functions/Function0;
/*    */     //   11: invokevirtual doWhenNextBlockCanBeStarted : (Lkotlin/jvm/functions/Function0;)V
/*    */     //   14: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #82	-> 0
/*    */     //   #85	-> 14
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	15	0	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalController;
/*    */     //   0	15	1	$userCommand	Ljava/lang/String;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\BlockTerminalController$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */