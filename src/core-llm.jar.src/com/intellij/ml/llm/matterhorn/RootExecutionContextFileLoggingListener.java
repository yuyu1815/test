/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.events.SerializableEvent;
/*     */ import java.util.concurrent.CancellationException;
/*     */ import java.util.concurrent.CopyOnWriteArrayList;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.channels.Channel;
/*     */ import kotlinx.coroutines.channels.SendChannel;
/*     */ import kotlinx.datetime.Clock;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\030\0002\0020\001:\003\027\030\031B\033\022\022\020\002\032\016\022\n\022\b\022\004\022\0020\0050\0040\003¢\006\004\b\006\020\007J\016\020\r\032\0020\0162\006\020\017\032\0020\nJ\036\020\020\032\0020\0162\006\020\021\032\0020\0052\f\020\022\032\b\022\002\b\003\030\0010\023H\026J\020\020\024\032\0020\0162\006\020\025\032\0020\026H\026R\032\020\002\032\016\022\n\022\b\022\004\022\0020\0050\0040\003X\004¢\006\002\n\000R\032\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\b\n\000\032\004\b\013\020\f¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingListener;", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListener;", "channel", "Lkotlinx/coroutines/channels/Channel;", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingListener$WithTimestamp;", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "<init>", "(Lkotlinx/coroutines/channels/Channel;)V", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingListener$LogListener;", "getListeners$core", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "addListener", "", "listener", "onCustomEvent", "event", "requester", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "onContextClosed", "context", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "LogListener", "LogEntry", "WithTimestamp", "core"})
/*     */ public final class RootExecutionContextFileLoggingListener
/*     */   implements RootExecutionContextListener
/*     */ {
/*     */   @NotNull
/*     */   private final Channel<WithTimestamp<CustomArtifactEvent>> channel;
/*     */   @NotNull
/*     */   private final CopyOnWriteArrayList<LogListener> listeners;
/*     */   
/*     */   public RootExecutionContextFileLoggingListener(@NotNull Channel<WithTimestamp<CustomArtifactEvent>> channel) {
/*  64 */     this.channel = channel;
/*     */     
/*  66 */     this.listeners = new CopyOnWriteArrayList<>(); } public void onUnfinishedArtifactCreated(@NotNull Artifactual artifact, @Nullable ArtifactId<?> requester) { RootExecutionContextListener.DefaultImpls.onUnfinishedArtifactCreated(this, artifact, requester); } public void onUnfinishedArtifactUpdated(@NotNull Artifactual artifact) { RootExecutionContextListener.DefaultImpls.onUnfinishedArtifactUpdated(this, artifact); } public void onArtifactFinished(@NotNull Artifact<?> artifact) { RootExecutionContextListener.DefaultImpls.onArtifactFinished(this, artifact); } public void onArtifactCancelled(@NotNull CancelledArtifact artifact) { RootExecutionContextListener.DefaultImpls.onArtifactCancelled(this, artifact); } public void onArtifactFailed(@NotNull FailedArtifact artifact) { RootExecutionContextListener.DefaultImpls.onArtifactFailed(this, artifact); } public void onCancellation(@NotNull CancellationException e) { RootExecutionContextListener.DefaultImpls.onCancellation(this, e); } public void onException(@NotNull Exception e, @NotNull ArtifactId<?> artifactId) { RootExecutionContextListener.DefaultImpls.onException(this, e, artifactId); } public void onTrajectoryElement(@NotNull TrajectoryElement element, @NotNull ExecutionContext context) { RootExecutionContextListener.DefaultImpls.onTrajectoryElement(this, element, context); } public void onContextRegistering(@NotNull RootExecutionContext context) { RootExecutionContextListener.DefaultImpls.onContextRegistering(this, context); } @NotNull public final CopyOnWriteArrayList<LogListener> getListeners$core() { return this.listeners; }
/*     */   
/*     */   public final void addListener(@NotNull LogListener listener) {
/*  69 */     Intrinsics.checkNotNullParameter(listener, "listener"); this.listeners.add(listener);
/*     */   }
/*     */   
/*     */   public void onCustomEvent(@NotNull CustomArtifactEvent event, @Nullable ArtifactId requester) {
/*  73 */     Intrinsics.checkNotNullParameter(event, "event"); this.channel.trySend-JP2dKIU(new WithTimestamp<>(event));
/*     */   }
/*     */   
/*     */   public void onContextClosed(@NotNull RootExecutionContext context) {
/*  77 */     Intrinsics.checkNotNullParameter(context, "context"); SendChannel.DefaultImpls.close$default((SendChannel)this.channel, null, 1, null);
/*     */   }
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\t\n\002\b\016\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B#\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\b\020\020\032\004\030\0010\003J\013\020\021\032\004\030\0010\003HÆ\003J\013\020\022\032\004\030\0010\005HÆ\003J\t\020\023\032\0020\007HÆ\003J+\020\024\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\n\b\002\020\004\032\004\030\0010\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\001HÖ\003J\t\020\030\032\0020\031HÖ\001J\t\020\032\032\0020\033HÖ\001R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\n\020\013R\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017¨\006\034"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingListener$LogEntry;", "", "event", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "serializedEvent", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEvent;", "timestampMs", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;Lcom/intellij/ml/llm/matterhorn/events/SerializableEvent;J)V", "getEvent", "()Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "getSerializedEvent", "()Lcom/intellij/ml/llm/matterhorn/events/SerializableEvent;", "getTimestampMs", "()J", "getEventOrCastSerializedOrNull", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core"})
/*     */   public static final class LogEntry { @Nullable
/*     */     private final CustomArtifactEvent event; @Nullable
/*     */     private final SerializableEvent serializedEvent;
/*     */     private final long timestampMs;
/*     */     
/*  85 */     public LogEntry(@Nullable CustomArtifactEvent event, @Nullable SerializableEvent serializedEvent, long timestampMs) { this.event = event;
/*  86 */       this.serializedEvent = serializedEvent;
/*  87 */       this.timestampMs = timestampMs;
/*     */ 
/*     */       
/*  90 */       if (!((this.event != null || this.serializedEvent != null) ? 1 : 0)) { String str = "Failed requirement."; throw new IllegalArgumentException(str.toString()); }
/*     */        } @Nullable
/*     */     public final CustomArtifactEvent getEvent() { return this.event; }
/*     */     @Nullable
/*     */     public final SerializableEvent getSerializedEvent() { return this.serializedEvent; }
/*     */     public final long getTimestampMs() { return this.timestampMs; }
/*     */     @Nullable
/*  97 */     public final CustomArtifactEvent getEventOrCastSerializedOrNull() { if (this.event != null) return this.event; 
/*  98 */       if (this.serializedEvent instanceof CustomArtifactEvent) return (CustomArtifactEvent)this.serializedEvent; 
/*  99 */       return null; } @Nullable public final CustomArtifactEvent component1() { return this.event; } @Nullable public final SerializableEvent component2() { return this.serializedEvent; } public final long component3() { return this.timestampMs; } @NotNull public final LogEntry copy(@Nullable CustomArtifactEvent event, @Nullable SerializableEvent serializedEvent, long timestampMs) { return new LogEntry(event, serializedEvent, timestampMs); } @NotNull public String toString() { return "LogEntry(event=" + this.event + ", serializedEvent=" + this.serializedEvent + ", timestampMs=" + this.timestampMs + ")"; } public int hashCode() { result = (this.event == null) ? 0 : this.event.hashCode(); result = result * 31 + ((this.serializedEvent == null) ? 0 : this.serializedEvent.hashCode()); return result * 31 + Long.hashCode(this.timestampMs); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof LogEntry)) return false;  LogEntry logEntry = (LogEntry)other; return !Intrinsics.areEqual(this.event, logEntry.event) ? false : (!Intrinsics.areEqual(this.serializedEvent, logEntry.serializedEvent) ? false : (!(this.timestampMs != logEntry.timestampMs))); } }
/*     */    @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\000\bf\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H&¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingListener$LogListener;", "", "onLogEntry", "", "entry", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingListener$LogEntry;", "core"}) public static interface LogListener {
/*     */     void onLogEntry(@NotNull RootExecutionContextFileLoggingListener.LogEntry param1LogEntry);
/*     */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\020\t\n\002\b\r\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\000*\004\b\000\020\0012\0020\002B\027\022\006\020\003\032\0028\000\022\006\020\004\032\0020\005¢\006\004\b\006\020\007B\021\b\026\022\006\020\003\032\0028\000¢\006\004\b\006\020\bJ\016\020\016\032\0028\000HÆ\003¢\006\002\020\nJ\t\020\017\032\0020\005HÆ\003J(\020\020\032\b\022\004\022\0028\0000\0002\b\b\002\020\003\032\0028\0002\b\b\002\020\004\032\0020\005HÆ\001¢\006\002\020\021J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\002HÖ\003J\t\020\025\032\0020\026HÖ\001J\t\020\027\032\0020\030HÖ\001R\023\020\003\032\0028\000¢\006\n\n\002\020\013\032\004\b\t\020\nR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\r¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingListener$WithTimestamp;", "T", "", "elem", "timestampMs", "", "<init>", "(Ljava/lang/Object;J)V", "(Ljava/lang/Object;)V", "getElem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getTimestampMs", "()J", "component1", "component2", "copy", "(Ljava/lang/Object;J)Lcom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingListener$WithTimestamp;", "equals", "", "other", "hashCode", "", "toString", "", "core"}) public static final class WithTimestamp<T> {
/* 103 */     private final T elem; public WithTimestamp(Object elem, long timestampMs) { this.elem = (T)elem; this.timestampMs = timestampMs; } private final long timestampMs; public final T getElem() { return this.elem; } public final long getTimestampMs() { return this.timestampMs; } public WithTimestamp(Object elem) {
/* 104 */       this((T)elem, Clock.System.INSTANCE.now().toEpochMilliseconds());
/*     */     }
/*     */     
/*     */     public final T component1() {
/*     */       return this.elem;
/*     */     }
/*     */     
/*     */     public final long component2() {
/*     */       return this.timestampMs;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final WithTimestamp<T> copy(Object elem, long timestampMs) {
/*     */       return new WithTimestamp((T)elem, timestampMs);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "WithTimestamp(elem=" + this.elem + ", timestampMs=" + this.timestampMs + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = (this.elem == null) ? 0 : this.elem.hashCode();
/*     */       return result * 31 + Long.hashCode(this.timestampMs);
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof WithTimestamp))
/*     */         return false; 
/*     */       WithTimestamp withTimestamp = (WithTimestamp)other;
/*     */       return !Intrinsics.areEqual(this.elem, withTimestamp.elem) ? false : (!(this.timestampMs != withTimestamp.timestampMs));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\RootExecutionContextFileLoggingListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */