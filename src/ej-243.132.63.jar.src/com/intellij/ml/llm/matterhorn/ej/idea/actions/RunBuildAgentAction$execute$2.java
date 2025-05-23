/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.actions;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.idea.run.BuildErrorEvent;
/*    */ import com.intellij.ml.llm.matterhorn.ej.idea.run.RunEvent;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.NoWhenBranchMatchedException;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.Boxing;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ final class RunBuildAgentAction$execute$2<T>
/*    */   implements FlowCollector
/*    */ {
/*    */   public final Object emit(RunEvent event, Continuation $completion) {
/* 37 */     RunEvent runEvent = event;
/* 38 */     if (runEvent instanceof BuildErrorEvent) { Boxing.boxBoolean(this.$buildMessages.add(new BuildMessage(((BuildErrorEvent)event).getPosition(), ((BuildErrorEvent)event).getMessage()))); }
/* 39 */     else if (!(runEvent instanceof com.intellij.ml.llm.matterhorn.ej.idea.run.RunFinishedEvent) && !(runEvent instanceof com.intellij.ml.llm.matterhorn.ej.idea.run.BuildStartEvent) && !(runEvent instanceof com.intellij.ml.llm.matterhorn.ej.idea.run.BuildStartedEvent) && !(runEvent instanceof com.intellij.ml.llm.matterhorn.ej.idea.run.OutputEvent) && !(runEvent instanceof com.intellij.ml.llm.matterhorn.ej.idea.run.RunStartedEvent) && !(runEvent instanceof com.intellij.ml.llm.matterhorn.ej.idea.run.TestEvent))
/*    */     { throw new NoWhenBranchMatchedException(); }
/* 41 */      return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   RunBuildAgentAction$execute$2(List<BuildMessage> $buildMessages) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\RunBuildAgentAction$execute$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */