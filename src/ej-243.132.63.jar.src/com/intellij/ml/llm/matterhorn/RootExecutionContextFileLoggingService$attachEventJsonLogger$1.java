/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ import com.intellij.ml.llm.matterhorn.events.SerializableEvent;
/*    */ import com.intellij.ml.llm.matterhorn.events.SerializableEventJsonLogger;
/*    */ import java.io.Closeable;
/*    */ import java.util.Iterator;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.channels.Channel;
/*    */ import kotlinx.coroutines.channels.ChannelIterator;
/*    */ 
/*    */ @DebugMetadata(f = "RootExecutionContextFileLoggingService.kt", l = {37}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.RootExecutionContextFileLoggingService$attachEventJsonLogger$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class RootExecutionContextFileLoggingService$attachEventJsonLogger$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */   Object L$0;
/*    */   Object L$1;
/*    */   Object L$2;
/*    */   Object L$3;
/*    */   int label;
/*    */   
/*    */   RootExecutionContextFileLoggingService$attachEventJsonLogger$1(SerializableEventJsonLogger $fileLogger, Channel<RootExecutionContextFileLoggingListener.WithTimestamp<CustomArtifactEvent>> $channel, RootExecutionContextFileLoggingListener $logListener, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     Closeable closeable;
/*    */     Channel<RootExecutionContextFileLoggingListener.WithTimestamp<CustomArtifactEvent>> channel;
/*    */     SerializableEventJsonLogger serializableEventJsonLogger;
/*    */     RootExecutionContextFileLoggingListener rootExecutionContextFileLoggingListener;
/*    */     Throwable throwable;
/*    */     Unit unit;
/*    */     int $i$a$-use-RootExecutionContextFileLoggingService$attachEventJsonLogger$1$1;
/*    */     ChannelIterator channelIterator;
/* 35 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 36 */         closeable = (Closeable)this.$fileLogger; channel = this.$channel; serializableEventJsonLogger = this.$fileLogger; rootExecutionContextFileLoggingListener = this.$logListener; throwable = null; try { (SerializableEventJsonLogger)closeable; int i = 0;
/* 37 */           ChannelIterator channelIterator1 = channel.iterator(); this.L$0 = closeable; this.L$1 = serializableEventJsonLogger; this.L$2 = rootExecutionContextFileLoggingListener; this.L$3 = channelIterator1; this.label = 1; if (channelIterator1.hasNext((Continuation)this) == object) return object;  } catch (Throwable throwable1) { throwable = throwable1 = null; throw throwable1; } finally { CloseableKt.closeFinally(closeable, throwable); } case 1: $i$a$-use-RootExecutionContextFileLoggingService$attachEventJsonLogger$1$1 = 0; channelIterator = (ChannelIterator)this.L$3; throwable = null; rootExecutionContextFileLoggingListener = (RootExecutionContextFileLoggingListener)this.L$2; serializableEventJsonLogger = (SerializableEventJsonLogger)this.L$1; closeable = (Closeable)this.L$0; ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); if (((Boolean)SYNTHETIC_LOCAL_VARIABLE_1).booleanValue()) { RootExecutionContextFileLoggingListener.WithTimestamp<CustomArtifactEvent> withTimestamp = (RootExecutionContextFileLoggingListener.WithTimestamp)channelIterator.next(); CustomArtifactEvent event = withTimestamp.component1(); long timestampMs = withTimestamp.component2();
/* 38 */           SerializableEvent serializableEvent = event.toSerializable();
/*    */           
/* 40 */           if (serializableEvent != null) {
/* 41 */             serializableEventJsonLogger.logWithCatchingAndLoggingSerializationError(
/* 42 */                 new SerializableEventWithMetadata(serializableEvent, timestampMs));
/*    */             
/* 44 */             serializableEventJsonLogger.flush();
/*    */           } 
/*    */           
/* 47 */           RootExecutionContextFileLoggingListener.LogEntry logEntry = new RootExecutionContextFileLoggingListener.LogEntry(event, serializableEvent, timestampMs);
/* 48 */           Intrinsics.checkNotNullExpressionValue(rootExecutionContextFileLoggingListener.getListeners$core().iterator(), "iterator(...)"); Iterator<RootExecutionContextFileLoggingListener.LogListener> iterator = rootExecutionContextFileLoggingListener.getListeners$core().iterator(); while (true) { if (iterator.hasNext()) { RootExecutionContextFileLoggingListener.LogListener listener = iterator.next();
/* 49 */               listener.onLogEntry(logEntry); continue; }  this.L$0 = closeable; this.L$1 = serializableEventJsonLogger; this.L$2 = rootExecutionContextFileLoggingListener; this.L$3 = channelIterator; this.label = 1; if (channelIterator.hasNext((Continuation)this) == object)
/*    */               return object;  // Byte code: goto -> 173 }
/*    */            }
/* 52 */          unit = Unit.INSTANCE; CloseableKt.closeFinally(closeable, throwable);
/* 53 */         return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super RootExecutionContextFileLoggingService$attachEventJsonLogger$1> $completion) {
/*    */     return (Continuation<Unit>)new RootExecutionContextFileLoggingService$attachEventJsonLogger$1(this.$fileLogger, this.$channel, this.$logListener, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((RootExecutionContextFileLoggingService$attachEventJsonLogger$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\RootExecutionContextFileLoggingService$attachEventJsonLogger$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */