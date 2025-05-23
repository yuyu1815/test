/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.history;
/*    */ 
/*    */ import com.intellij.codeInsight.lookup.LookupEvent;
/*    */ import com.intellij.codeInsight.lookup.LookupListener;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandSearchPresenter$showCommandSearch$1", "Lcom/intellij/codeInsight/lookup/LookupListener;", "lookupCanceled", "", "event", "Lcom/intellij/codeInsight/lookup/LookupEvent;", "ej-core"})
/*    */ public final class CommandSearchPresenter$showCommandSearch$1
/*    */   implements LookupListener
/*    */ {
/*    */   public void lookupCanceled(LookupEvent event) {
/* 27 */     Intrinsics.checkNotNullParameter(event, "event"); ((CommandSearchListener)CommandSearchPresenter.access$getProject$p(CommandSearchPresenter.this).getMessageBus().syncPublisher(CommandSearchListener.Companion.getTOPIC())).commandSearchAborted(CommandSearchPresenter.access$getPromptModel$p(CommandSearchPresenter.this));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\history\CommandSearchPresenter$showCommandSearch$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */