/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.history;
/*    */ 
/*    */ import com.intellij.codeInsight.lookup.LookupEvent;
/*    */ import com.intellij.codeInsight.lookup.LookupListener;
/*    */ import com.intellij.codeInsight.lookup.impl.LookupImpl;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\003*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0072\006\020\004\032\0020\005H\026J\020\020\b\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\t\032\0020\0032\006\020\004\032\0020\005H\026¨\006\n"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPresenter$showCommandHistory$1", "Lcom/intellij/codeInsight/lookup/LookupListener;", "currentItemChanged", "", "event", "Lcom/intellij/codeInsight/lookup/LookupEvent;", "beforeItemSelected", "", "itemSelected", "lookupCanceled", "ej-core"})
/*    */ public final class CommandHistoryPresenter$showCommandHistory$1
/*    */   implements LookupListener
/*    */ {
/*    */   CommandHistoryPresenter$showCommandHistory$1(CommandHistoryPresenter $receiver) {}
/*    */   
/*    */   public void currentItemChanged(LookupEvent event) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'event'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: invokevirtual getItem : ()Lcom/intellij/codeInsight/lookup/LookupElement;
/*    */     //   10: dup
/*    */     //   11: ifnull -> 21
/*    */     //   14: invokevirtual getLookupString : ()Ljava/lang/String;
/*    */     //   17: dup
/*    */     //   18: ifnonnull -> 23
/*    */     //   21: pop
/*    */     //   22: return
/*    */     //   23: astore_2
/*    */     //   24: aconst_null
/*    */     //   25: aload_0
/*    */     //   26: getfield $lookup : Lcom/intellij/codeInsight/lookup/impl/LookupImpl;
/*    */     //   29: aload_0
/*    */     //   30: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPresenter;
/*    */     //   33: aload_2
/*    */     //   34: <illegal opcode> invoke : (Lcom/intellij/codeInsight/lookup/impl/LookupImpl;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPresenter;Ljava/lang/String;)Lkotlin/jvm/functions/Function0;
/*    */     //   39: iconst_1
/*    */     //   40: aconst_null
/*    */     //   41: invokestatic invokeLater$default : (Lcom/intellij/openapi/application/ModalityState;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
/*    */     //   44: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #39	-> 6
/*    */     //   #40	-> 24
/*    */     //   #50	-> 44
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   24	21	2	selectedCommand	Ljava/lang/String;
/*    */     //   0	45	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPresenter$showCommandHistory$1;
/*    */     //   0	45	1	event	Lcom/intellij/codeInsight/lookup/LookupEvent;
/*    */   }
/*    */   
/*    */   private static final Unit currentItemChanged$lambda$2(LookupImpl $lookup, CommandHistoryPresenter this$0, String $selectedCommand) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: invokevirtual isLookupDisposed : ()Z
/*    */     //   4: ifne -> 19
/*    */     //   7: aload_0
/*    */     //   8: aload_1
/*    */     //   9: aload_2
/*    */     //   10: <illegal opcode> invoke : (Lcom/intellij/codeInsight/lookup/impl/LookupImpl;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPresenter;Ljava/lang/String;)Lkotlin/jvm/functions/Function0;
/*    */     //   15: invokestatic runWriteAction : (Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
/*    */     //   18: pop
/*    */     //   19: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   22: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #41	-> 0
/*    */     //   #42	-> 7
/*    */     //   #49	-> 19
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	23	0	$lookup	Lcom/intellij/codeInsight/lookup/impl/LookupImpl;
/*    */     //   0	23	1	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPresenter;
/*    */     //   0	23	2	$selectedCommand	Ljava/lang/String;
/*    */   }
/*    */   
/*    */   private static final Unit currentItemChanged$lambda$2$lambda$1(LookupImpl $lookup, CommandHistoryPresenter this$0, String $selectedCommand) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: aload_2
/*    */     //   3: <illegal opcode> run : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPresenter;Ljava/lang/String;)Ljava/lang/Runnable;
/*    */     //   8: invokevirtual performGuardedChange : (Ljava/lang/Runnable;)Z
/*    */     //   11: pop
/*    */     //   12: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   15: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #43	-> 0
/*    */     //   #47	-> 12
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	16	0	$lookup	Lcom/intellij/codeInsight/lookup/impl/LookupImpl;
/*    */     //   0	16	1	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandHistoryPresenter;
/*    */     //   0	16	2	$selectedCommand	Ljava/lang/String;
/*    */   }
/*    */   
/*    */   private static final void currentItemChanged$lambda$2$lambda$1$lambda$0(CommandHistoryPresenter this$0, String $selectedCommand) {
/* 44 */     CommandHistoryPresenter.access$getPromptModel(CommandHistoryPresenter.this).setCommandText($selectedCommand);
/* 45 */     CommandHistoryPresenter.access$getEditor$p(CommandHistoryPresenter.this).getCaretModel().moveToOffset(CommandHistoryPresenter.access$getEditor$p(CommandHistoryPresenter.this).getDocument().getTextLength());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean beforeItemSelected(LookupEvent event) {
/* 54 */     Intrinsics.checkNotNullParameter(event, "event"); return false;
/*    */   }
/*    */   
/*    */   public void itemSelected(LookupEvent event) {
/* 58 */     Intrinsics.checkNotNullParameter(event, "event"); CommandHistoryPresenter.access$setInitialCommand$p(CommandHistoryPresenter.this, null);
/* 59 */     if (event.getCompletionChar() == '\n') {
/* 60 */       CommandHistoryPresenter.access$getPromptController$p(CommandHistoryPresenter.this).handleEnterPressed();
/*    */     }
/*    */   }
/*    */   
/*    */   public void lookupCanceled(LookupEvent event) {
/* 65 */     Intrinsics.checkNotNullParameter(event, "event"); CommandHistoryPresenter.access$setInitialCommand$p(CommandHistoryPresenter.this, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\history\CommandHistoryPresenter$showCommandHistory$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */