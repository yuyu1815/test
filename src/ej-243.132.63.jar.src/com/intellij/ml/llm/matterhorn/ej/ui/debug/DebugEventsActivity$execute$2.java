/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.debug;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*    */ import com.intellij.ml.llm.matterhorn.RootExecutionContextFileLoggingListener;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.TaskListener;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.sequences.Sequence;
/*    */ import kotlin.sequences.SequencesKt;
/*    */ import kotlinx.coroutines.Job;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/debug/DebugEventsActivity$execute$2", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskListener;", "beforeTaskStarted", "", "context", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "job", "Lkotlinx/coroutines/Job;", "ej-ui"})
/*    */ @SourceDebugExtension({"SMAP\nDebugEventsToolwindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugEventsToolwindow.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/debug/DebugEventsActivity$execute$2\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,71:1\n477#2:72\n*S KotlinDebug\n*F\n+ 1 DebugEventsToolwindow.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/debug/DebugEventsActivity$execute$2\n*L\n57#1:72\n*E\n"})
/*    */ public final class DebugEventsActivity$execute$2
/*    */   implements TaskListener
/*    */ {
/*    */   DebugEventsActivity$execute$2(EventLogService $eventLogService) {}
/*    */   
/*    */   public void beforeTaskStarted(RootExecutionContext context, Job job) {
/* 56 */     Intrinsics.checkNotNullParameter(context, "context"); Intrinsics.checkNotNullParameter(job, "job"); Sequence sequence = CollectionsKt.asSequence(context.getListener().getListeners());
/* 57 */     int $i$f$filterIsInstance = 0;
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
/* 72 */     Intrinsics.checkNotNull(SequencesKt.filter(sequence, DebugEventsActivity$execute$2$beforeTaskStarted$$inlined$filterIsInstance$1.INSTANCE), "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>"); RootExecutionContextFileLoggingListener logListener = (RootExecutionContextFileLoggingListener)SequencesKt.firstOrNull(SequencesKt.filter(sequence, DebugEventsActivity$execute$2$beforeTaskStarted$$inlined$filterIsInstance$1.INSTANCE));
/*    */     if (logListener != null) {
/*    */       logListener.addListener(new DebugEventsActivity$execute$2$beforeTaskStarted$1(this.$eventLogService));
/*    */     } else {
/*    */     
/*    */     } 
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\024\020\002\032\0020\0032\n\020\004\032\0060\005j\002`\006H\026¨\006\007"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/debug/DebugEventsActivity$execute$2$beforeTaskStarted$1", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingListener$LogListener;", "onLogEntry", "", "entry", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingListener$LogEntry;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/LogEntry;", "ej-ui"})
/*    */   public static final class DebugEventsActivity$execute$2$beforeTaskStarted$1 implements RootExecutionContextFileLoggingListener.LogListener {
/*    */     DebugEventsActivity$execute$2$beforeTaskStarted$1(EventLogService $eventLogService) {}
/*    */     
/*    */     public void onLogEntry(RootExecutionContextFileLoggingListener.LogEntry entry) {
/*    */       Intrinsics.checkNotNullParameter(entry, "entry");
/*    */       this.$eventLogService.publishEvent(entry);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\debug\DebugEventsActivity$execute$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */