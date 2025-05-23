/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.debug;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.RootExecutionContextFileLoggingListener;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\024\020\002\032\0020\0032\n\020\004\032\0060\005j\002`\006H\026¨\006\007"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/debug/DebugEventsActivity$execute$2$beforeTaskStarted$1", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingListener$LogListener;", "onLogEntry", "", "entry", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingListener$LogEntry;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/LogEntry;", "ej-ui"})
/*    */ public final class DebugEventsActivity$execute$2$beforeTaskStarted$1
/*    */   implements RootExecutionContextFileLoggingListener.LogListener
/*    */ {
/*    */   DebugEventsActivity$execute$2$beforeTaskStarted$1(EventLogService $eventLogService) {}
/*    */   
/*    */   public void onLogEntry(RootExecutionContextFileLoggingListener.LogEntry entry) {
/* 62 */     Intrinsics.checkNotNullParameter(entry, "entry"); this.$eventLogService.publishEvent(entry);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\debug\DebugEventsActivity$execute$2$beforeTaskStarted$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */