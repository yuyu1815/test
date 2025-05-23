/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.reporting;
/*    */ 
/*    */ import com.intellij.diagnostic.AbstractMessage;
/*    */ import com.intellij.diagnostic.ITNReporter;
/*    */ import com.intellij.ide.plugins.IdeaPluginDescriptor;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Triple;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ final class null<T>
/*    */   implements FlowCollector
/*    */ {
/*    */   public final Object emit(List<? extends Triple<? extends AbstractMessage, ? extends ITNReporter, ? extends IdeaPluginDescriptor>> it, Continuation<? super Unit> $completion) {
/* 44 */     if (AbstractEJMessagePoolAutoReporter.this.sendMessages(it, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return AbstractEJMessagePoolAutoReporter.this.sendMessages(it, $completion);  AbstractEJMessagePoolAutoReporter.this.sendMessages(it, $completion); return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\reporting\AbstractEJMessagePoolAutoReporter$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */