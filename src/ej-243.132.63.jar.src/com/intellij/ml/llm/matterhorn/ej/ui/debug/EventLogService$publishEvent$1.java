/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.debug;
/*    */ import com.intellij.ml.llm.matterhorn.RootExecutionContextFileLoggingListener;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.flow.MutableStateFlow;
/*    */ 
/*    */ @DebugMetadata(f = "EventLogService.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.debug.EventLogService$publishEvent$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ @SourceDebugExtension({"SMAP\nEventLogService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLogService.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/debug/EventLogService$publishEvent$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,32:1\n226#2,5:33\n*S KotlinDebug\n*F\n+ 1 EventLogService.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/debug/EventLogService$publishEvent$1\n*L\n25#1:33,5\n*E\n"})
/*    */ final class EventLogService$publishEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     MutableStateFlow mutableStateFlow;
/*    */     RootExecutionContextFileLoggingListener.LogEntry logEntry;
/*    */     int $i$f$update;
/* 24 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 25 */         mutableStateFlow = EventLogService.access$get_logEntries$p(EventLogService.this); logEntry = this.$entry; $i$f$update = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/*    */         while (true) {
/* 34 */           Object prevValue$iv = mutableStateFlow.getValue();
/* 35 */           List current = (List)prevValue$iv; int $i$a$-update-EventLogService$publishEvent$1$1 = 0; Object nextValue$iv = CollectionsKt.plus(current, logEntry);
/* 36 */           if (mutableStateFlow.compareAndSet(prevValue$iv, nextValue$iv))
/*    */             return Unit.INSTANCE; 
/*    */         }  }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   int label;
/*    */   
/*    */   EventLogService$publishEvent$1(RootExecutionContextFileLoggingListener.LogEntry $entry, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super EventLogService$publishEvent$1> $completion) {
/*    */     return (Continuation<Unit>)new EventLogService$publishEvent$1(this.$entry, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((EventLogService$publishEvent$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\debug\EventLogService$publishEvent$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */