/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.events.SerializableEvent;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\t\n\002\b\016\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B#\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\b\020\020\032\004\030\0010\003J\013\020\021\032\004\030\0010\003HÆ\003J\013\020\022\032\004\030\0010\005HÆ\003J\t\020\023\032\0020\007HÆ\003J+\020\024\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\n\b\002\020\004\032\004\030\0010\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\001HÖ\003J\t\020\030\032\0020\031HÖ\001J\t\020\032\032\0020\033HÖ\001R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\n\020\013R\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017¨\006\034"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingListener$LogEntry;", "", "event", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "serializedEvent", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEvent;", "timestampMs", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;Lcom/intellij/ml/llm/matterhorn/events/SerializableEvent;J)V", "getEvent", "()Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "getSerializedEvent", "()Lcom/intellij/ml/llm/matterhorn/events/SerializableEvent;", "getTimestampMs", "()J", "getEventOrCastSerializedOrNull", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core"})
/*    */ public final class LogEntry
/*    */ {
/*    */   @Nullable
/*    */   private final CustomArtifactEvent event;
/*    */   @Nullable
/*    */   private final SerializableEvent serializedEvent;
/*    */   private final long timestampMs;
/*    */   
/*    */   public LogEntry(@Nullable CustomArtifactEvent event, @Nullable SerializableEvent serializedEvent, long timestampMs) {
/* 85 */     this.event = event;
/* 86 */     this.serializedEvent = serializedEvent;
/* 87 */     this.timestampMs = timestampMs;
/*    */ 
/*    */     
/* 90 */     if (!((this.event != null || this.serializedEvent != null) ? 1 : 0)) { String str = "Failed requirement."; throw new IllegalArgumentException(str.toString()); }
/*    */   
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final CustomArtifactEvent getEventOrCastSerializedOrNull() {
/* 97 */     if (this.event != null) return this.event; 
/* 98 */     if (this.serializedEvent instanceof CustomArtifactEvent) return (CustomArtifactEvent)this.serializedEvent; 
/* 99 */     return null;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final CustomArtifactEvent getEvent() {
/*    */     return this.event;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final SerializableEvent getSerializedEvent() {
/*    */     return this.serializedEvent;
/*    */   }
/*    */   
/*    */   public final long getTimestampMs() {
/*    */     return this.timestampMs;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final CustomArtifactEvent component1() {
/*    */     return this.event;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final SerializableEvent component2() {
/*    */     return this.serializedEvent;
/*    */   }
/*    */   
/*    */   public final long component3() {
/*    */     return this.timestampMs;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LogEntry copy(@Nullable CustomArtifactEvent event, @Nullable SerializableEvent serializedEvent, long timestampMs) {
/*    */     return new LogEntry(event, serializedEvent, timestampMs);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "LogEntry(event=" + this.event + ", serializedEvent=" + this.serializedEvent + ", timestampMs=" + this.timestampMs + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = (this.event == null) ? 0 : this.event.hashCode();
/*    */     result = result * 31 + ((this.serializedEvent == null) ? 0 : this.serializedEvent.hashCode());
/*    */     return result * 31 + Long.hashCode(this.timestampMs);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LogEntry))
/*    */       return false; 
/*    */     LogEntry logEntry = (LogEntry)other;
/*    */     return !Intrinsics.areEqual(this.event, logEntry.event) ? false : (!Intrinsics.areEqual(this.serializedEvent, logEntry.serializedEvent) ? false : (!(this.timestampMs != logEntry.timestampMs)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\RootExecutionContextFileLoggingListener$LogEntry.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */