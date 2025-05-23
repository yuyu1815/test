/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.debug;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.RootExecutionContextFileLoggingListener;
/*    */ 
/*    */ @Service({Service.Level.PROJECT})
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\020 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\004\b\007\030\000 \0232\0020\001:\001\023B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\022\020\017\032\0020\0202\n\020\021\032\0060\tj\002`\nJ\b\020\022\032\0020\020H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\036\020\006\032\022\022\016\022\f\022\b\022\0060\tj\002`\n0\b0\007X\004¢\006\002\n\000R!\020\013\032\022\022\016\022\f\022\b\022\0060\tj\002`\n0\b0\f¢\006\b\n\000\032\004\b\r\020\016¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventLogService;", "Lcom/intellij/openapi/Disposable;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "_logEntries", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingListener$LogEntry;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/LogEntry;", "logEntries", "Lkotlinx/coroutines/flow/StateFlow;", "getLogEntries", "()Lkotlinx/coroutines/flow/StateFlow;", "publishEvent", "", "entry", "dispose", "Companion", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class EventLogService implements Disposable {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final CoroutineScope scope;
/*    */   
/* 14 */   public EventLogService(@NotNull CoroutineScope scope) { this.scope = scope;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 20 */     this._logEntries = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
/* 21 */     this.logEntries = FlowKt.asStateFlow(this._logEntries); } @NotNull private final MutableStateFlow<List<RootExecutionContextFileLoggingListener.LogEntry>> _logEntries; @NotNull private final StateFlow<List<RootExecutionContextFileLoggingListener.LogEntry>> logEntries; public static final int $stable = 8; @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventLogService$Companion;", "", "<init>", "()V", "getInstance", "Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventLogService;", "project", "Lcom/intellij/openapi/project/Project;", "ej-ui"}) public static final class Companion { private Companion() {} @NotNull public final EventLogService getInstance(@NotNull Project project) { Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullExpressionValue(project.getService(EventLogService.class), "getService(...)"); return (EventLogService)project.getService(EventLogService.class); } } @NotNull public final StateFlow<List<RootExecutionContextFileLoggingListener.LogEntry>> getLogEntries() { return this.logEntries; }
/*    */ 
/*    */   
/* 24 */   public final void publishEvent(@NotNull RootExecutionContextFileLoggingListener.LogEntry entry) { Intrinsics.checkNotNullParameter(entry, "entry"); BuildersKt.launch$default(this.scope, null, null, new EventLogService$publishEvent$1(entry, null), 3, null); } @DebugMetadata(f = "EventLogService.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.debug.EventLogService$publishEvent$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) @SourceDebugExtension({"SMAP\nEventLogService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLogService.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/debug/EventLogService$publishEvent$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,32:1\n226#2,5:33\n*S KotlinDebug\n*F\n+ 1 EventLogService.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/debug/EventLogService$publishEvent$1\n*L\n25#1:33,5\n*E\n"}) static final class EventLogService$publishEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; EventLogService$publishEvent$1(RootExecutionContextFileLoggingListener.LogEntry $entry, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { MutableStateFlow mutableStateFlow; RootExecutionContextFileLoggingListener.LogEntry logEntry; int $i$f$update; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 25 */           mutableStateFlow = EventLogService.this._logEntries; logEntry = this.$entry; $i$f$update = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/*    */           while (true) {
/* 34 */             Object prevValue$iv = mutableStateFlow.getValue();
/* 35 */             List current = (List)prevValue$iv; int $i$a$-update-EventLogService$publishEvent$1$1 = 0; Object nextValue$iv = CollectionsKt.plus(current, logEntry);
/* 36 */             if (mutableStateFlow.compareAndSet(prevValue$iv, nextValue$iv))
/*    */               return Unit.INSTANCE; 
/*    */           }  }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super EventLogService$publishEvent$1> $completion) {
/*    */       return (Continuation<Unit>)new EventLogService$publishEvent$1(this.$entry, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((EventLogService$publishEvent$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */ 
/*    */   
/*    */   public void dispose() {
/*    */     this._logEntries.setValue(CollectionsKt.emptyList());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\debug\EventLogService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */