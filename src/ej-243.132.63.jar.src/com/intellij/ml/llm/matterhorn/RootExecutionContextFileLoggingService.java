/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.events.SerializableEvent;
/*     */ import com.intellij.ml.llm.matterhorn.events.SerializableEventJsonLogger;
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import java.io.Closeable;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.channels.Channel;
/*     */ import kotlinx.coroutines.channels.ChannelIterator;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Service({Service.Level.APP})
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\b\007\030\000 \n2\0020\001:\001\nB\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\016\020\006\032\0020\0072\006\020\b\032\0020\tR\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingService;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "attachEventJsonLogger", "", "context", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "Companion", "core"})
/*     */ public final class RootExecutionContextFileLoggingService {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final CoroutineScope scope;
/*     */   
/*  22 */   public RootExecutionContextFileLoggingService(@NotNull CoroutineScope scope) { this.scope = scope; }
/*     */   
/*  24 */   public final void attachEventJsonLogger(@NotNull RootExecutionContext context) { Intrinsics.checkNotNullParameter(context, "context"); if (ApplicationKt.getApplication().isUnitTestMode())
/*  25 */       return;  if (!(context.getService().getCaches() instanceof FileMatterhornCaches))
/*     */       return; 
/*  27 */     String name = Sanitize_nameKt.sanitizeFileName$default(context.getName(), null, false, null, 14, null) + "-events.jsonl";
/*  28 */     Path path = ((FileMatterhornCaches)context.getService().getCaches()).getSerializableEvents().resolve(name);
/*  29 */     Files.createDirectories(path.getParent(), (FileAttribute<?>[])new FileAttribute[0]);
/*     */     
/*  31 */     Intrinsics.checkNotNull(path); SerializableEventJsonLogger fileLogger = new SerializableEventJsonLogger(path);
/*  32 */     Channel<RootExecutionContextFileLoggingListener.WithTimestamp<CustomArtifactEvent>> channel = ChannelKt.Channel$default(2147483647, null, null, 6, null);
/*  33 */     RootExecutionContextFileLoggingListener logListener = new RootExecutionContextFileLoggingListener(channel);
/*     */     
/*  35 */     BuildersKt.launch$default(this.scope, Dispatchers.getIO().plus((CoroutineContext)new CoroutineName("File logger for " + name)), null, new RootExecutionContextFileLoggingService$attachEventJsonLogger$1(fileLogger, channel, logListener, null), 2, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  55 */     context.addListener(logListener); }
/*     */   @DebugMetadata(f = "RootExecutionContextFileLoggingService.kt", l = {37}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.RootExecutionContextFileLoggingService$attachEventJsonLogger$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class RootExecutionContextFileLoggingService$attachEventJsonLogger$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     Object L$0;
/*     */     Object L$1; Object L$2; Object L$3; int label; RootExecutionContextFileLoggingService$attachEventJsonLogger$1(SerializableEventJsonLogger $fileLogger, Channel<RootExecutionContextFileLoggingListener.WithTimestamp<CustomArtifactEvent>> $channel, RootExecutionContextFileLoggingListener $logListener, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Closeable closeable; Channel<RootExecutionContextFileLoggingListener.WithTimestamp<CustomArtifactEvent>> channel; SerializableEventJsonLogger serializableEventJsonLogger; RootExecutionContextFileLoggingListener rootExecutionContextFileLoggingListener; Throwable throwable; Unit unit; int $i$a$-use-RootExecutionContextFileLoggingService$attachEventJsonLogger$1$1; ChannelIterator channelIterator; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); closeable = (Closeable)this.$fileLogger; channel = this.$channel; serializableEventJsonLogger = this.$fileLogger; rootExecutionContextFileLoggingListener = this.$logListener; throwable = null; try { (SerializableEventJsonLogger)closeable; int i = 0; ChannelIterator channelIterator1 = channel.iterator(); this.L$0 = closeable; this.L$1 = serializableEventJsonLogger; this.L$2 = rootExecutionContextFileLoggingListener; this.L$3 = channelIterator1; this.label = 1; if (channelIterator1.hasNext((Continuation)this) == object) return object;  } catch (Throwable throwable1) { throwable = throwable1 = null; throw throwable1; } finally { CloseableKt.closeFinally(closeable, throwable); } case 1: $i$a$-use-RootExecutionContextFileLoggingService$attachEventJsonLogger$1$1 = 0; channelIterator = (ChannelIterator)this.L$3; throwable = null; rootExecutionContextFileLoggingListener = (RootExecutionContextFileLoggingListener)this.L$2; serializableEventJsonLogger = (SerializableEventJsonLogger)this.L$1; closeable = (Closeable)this.L$0; ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); if (((Boolean)SYNTHETIC_LOCAL_VARIABLE_1).booleanValue()) { RootExecutionContextFileLoggingListener.WithTimestamp<CustomArtifactEvent> withTimestamp = (RootExecutionContextFileLoggingListener.WithTimestamp)channelIterator.next(); CustomArtifactEvent event = withTimestamp.component1(); long timestampMs = withTimestamp.component2(); SerializableEvent serializableEvent = event.toSerializable(); if (serializableEvent != null) { serializableEventJsonLogger.logWithCatchingAndLoggingSerializationError(new SerializableEventWithMetadata(serializableEvent, timestampMs)); serializableEventJsonLogger.flush(); }  RootExecutionContextFileLoggingListener.LogEntry logEntry = new RootExecutionContextFileLoggingListener.LogEntry(event, serializableEvent, timestampMs); Intrinsics.checkNotNullExpressionValue(rootExecutionContextFileLoggingListener.getListeners$core().iterator(), "iterator(...)"); Iterator<RootExecutionContextFileLoggingListener.LogListener> iterator = rootExecutionContextFileLoggingListener.getListeners$core().iterator(); while (true) { if (iterator.hasNext()) { RootExecutionContextFileLoggingListener.LogListener listener = iterator.next(); listener.onLogEntry(logEntry); continue; }  this.L$0 = closeable; this.L$1 = serializableEventJsonLogger; this.L$2 = rootExecutionContextFileLoggingListener; this.L$3 = channelIterator; this.label = 1; if (channelIterator.hasNext((Continuation)this) == object) return object;  // Byte code: goto -> 173 }  }  unit = Unit.INSTANCE; CloseableKt.closeFinally(closeable, throwable); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super RootExecutionContextFileLoggingService$attachEventJsonLogger$1> $completion) { return (Continuation<Unit>)new RootExecutionContextFileLoggingService$attachEventJsonLogger$1(this.$fileLogger, this.$channel, this.$logListener, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((RootExecutionContextFileLoggingService$attachEventJsonLogger$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); }
/*     */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\004\032\0020\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingService$Companion;", "", "<init>", "()V", "getInstance", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingService;", "core"}) @SourceDebugExtension({"SMAP\nRootExecutionContextFileLoggingService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootExecutionContextFileLoggingService.kt\ncom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingService$Companion\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,106:1\n31#2,2:107\n*S KotlinDebug\n*F\n+ 1 RootExecutionContextFileLoggingService.kt\ncom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingService$Companion\n*L\n60#1:107,2\n*E\n"}) public static final class Companion {
/*  60 */     @NotNull public final RootExecutionContextFileLoggingService getInstance() { ComponentManager $this$service$iv = (ComponentManager)ApplicationKt.getApplication(); int $i$f$service = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 107 */       Class<RootExecutionContextFileLoggingService> serviceClass$iv = RootExecutionContextFileLoggingService.class;
/* 108 */       if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  return (RootExecutionContextFileLoggingService)$this$service$iv.getService(serviceClass$iv); }
/*     */ 
/*     */     
/*     */     private Companion() {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\RootExecutionContextFileLoggingService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */