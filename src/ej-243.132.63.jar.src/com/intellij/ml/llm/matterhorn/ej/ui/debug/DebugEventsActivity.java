/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.debug;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.ml.llm.matterhorn.MatterhornServiceScope;
/*    */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*    */ import com.intellij.ml.llm.matterhorn.RootExecutionContextFileLoggingListener;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.TaskListener;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.TaskServiceImpl;
/*    */ import com.intellij.openapi.application.Application;
/*    */ import com.intellij.openapi.application.ApplicationManager;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.startup.ProjectActivity;
/*    */ import com.intellij.openapi.util.registry.Registry;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.sequences.Sequence;
/*    */ import kotlin.sequences.SequencesKt;
/*    */ import kotlinx.coroutines.Job;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\004\032\0020\0052\006\020\006\032\0020\007H@¢\006\002\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/DebugEventsActivity;", "Lcom/intellij/openapi/startup/ProjectActivity;", "<init>", "()V", "execute", "", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class DebugEventsActivity
/*    */   implements ProjectActivity
/*    */ {
/*    */   public static final int $stable;
/*    */   
/*    */   @Nullable
/*    */   public Object execute(@NotNull Project project, @NotNull Continuation $completion) {
/* 43 */     Application application = ApplicationManager.getApplication();
/* 44 */     if (!Registry.Companion.is("matterhorn.artifact.debug.ui", false)) {
/* 45 */       return Unit.INSTANCE;
/*    */     }
/* 47 */     if (application.isInternal()) {
/* 48 */       EventLogService eventLogService = EventLogService.Companion.getInstance(project);
/*    */       
/* 50 */       project.getMessageBus()
/* 51 */         .connect(MatterhornServiceScope.Companion.getScope(project))
/* 52 */         .subscribe(
/* 53 */           TaskServiceImpl.Companion.getTOPIC(), 
/* 54 */           new DebugEventsActivity$execute$2(eventLogService));
/*    */     } 
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
/* 69 */     return Unit.INSTANCE; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/debug/DebugEventsActivity$execute$2", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskListener;", "beforeTaskStarted", "", "context", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "job", "Lkotlinx/coroutines/Job;", "ej-ui"}) @SourceDebugExtension({"SMAP\nDebugEventsToolwindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugEventsToolwindow.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/debug/DebugEventsActivity$execute$2\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,71:1\n477#2:72\n*S KotlinDebug\n*F\n+ 1 DebugEventsToolwindow.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/debug/DebugEventsActivity$execute$2\n*L\n57#1:72\n*E\n"}) public static final class DebugEventsActivity$execute$2 implements TaskListener { public void beforeTaskStarted(RootExecutionContext context, Job job) { Intrinsics.checkNotNullParameter(context, "context"); Intrinsics.checkNotNullParameter(job, "job");
/*    */       Sequence sequence = CollectionsKt.asSequence(context.getListener().getListeners());
/*    */       int $i$f$filterIsInstance = 0;
/* 72 */       Intrinsics.checkNotNull(SequencesKt.filter(sequence, DebugEventsActivity$execute$2$beforeTaskStarted$$inlined$filterIsInstance$1.INSTANCE), "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>"); RootExecutionContextFileLoggingListener logListener = (RootExecutionContextFileLoggingListener)SequencesKt.firstOrNull(SequencesKt.filter(sequence, DebugEventsActivity$execute$2$beforeTaskStarted$$inlined$filterIsInstance$1.INSTANCE));
/*    */       if (logListener != null) {
/*    */         logListener.addListener(new DebugEventsActivity$execute$2$beforeTaskStarted$1(this.$eventLogService));
/*    */       } else {
/*    */       
/*    */       }  }
/*    */ 
/*    */     
/*    */     DebugEventsActivity$execute$2(EventLogService $eventLogService) {}
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\024\020\002\032\0020\0032\n\020\004\032\0060\005j\002`\006H\026¨\006\007"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/debug/DebugEventsActivity$execute$2$beforeTaskStarted$1", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingListener$LogListener;", "onLogEntry", "", "entry", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingListener$LogEntry;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/LogEntry;", "ej-ui"})
/*    */     public static final class DebugEventsActivity$execute$2$beforeTaskStarted$1 implements RootExecutionContextFileLoggingListener.LogListener {
/*    */       DebugEventsActivity$execute$2$beforeTaskStarted$1(EventLogService $eventLogService) {}
/*    */       
/*    */       public void onLogEntry(RootExecutionContextFileLoggingListener.LogEntry entry) {
/*    */         Intrinsics.checkNotNullParameter(entry, "entry");
/*    */         this.$eventLogService.publishEvent(entry);
/*    */       }
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\debug\DebugEventsActivity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */