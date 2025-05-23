/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.events.SerializableEvent;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SerialName;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import kotlinx.serialization.internal.StringSerializer;
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
/*     */ @Serializable
/*     */ @SerialName("TerminalSessionFinishedEvent")
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\0012\0020\002:\002\"#B\027\022\006\020\003\032\0020\004\022\006\020\005\032\0020\004¢\006\004\b\006\020\007B/\b\020\022\006\020\b\032\0020\t\022\b\020\003\032\004\030\0010\004\022\b\020\005\032\004\030\0010\004\022\b\020\n\032\004\030\0010\013¢\006\004\b\006\020\fJ\b\020\020\032\0020\002H\026J\t\020\021\032\0020\004HÆ\003J\t\020\022\032\0020\004HÆ\003J\035\020\023\032\0020\0002\b\b\002\020\003\032\0020\0042\b\b\002\020\005\032\0020\004HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\027HÖ\003J\t\020\030\032\0020\tHÖ\001J\t\020\031\032\0020\004HÖ\001J%\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 H\001¢\006\002\b!R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\r\020\016R\021\020\005\032\0020\004¢\006\b\n\000\032\004\b\017\020\016¨\006$"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/TerminalSessionFinishedEvent;", "Lcom/intellij/ml/llm/matterhorn/TerminalEvent;", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEvent;", "terminalUid", "", "sessionLog", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTerminalUid", "()Ljava/lang/String;", "getSessionLog", "toSerializable", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*     */ public final class TerminalSessionFinishedEvent
/*     */   implements TerminalEvent, SerializableEvent
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final String terminalUid;
/*     */   @NotNull
/*     */   private final String sessionLog;
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/TerminalSessionFinishedEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/TerminalSessionFinishedEvent;", "core"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<TerminalSessionFinishedEvent> serializer() {
/* 146 */       return (KSerializer<TerminalSessionFinishedEvent>)TerminalSessionFinishedEvent.$serializer.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/* 150 */   public TerminalSessionFinishedEvent(@NotNull String terminalUid, @NotNull String sessionLog) { this.terminalUid = terminalUid;
/* 151 */     this.sessionLog = sessionLog; } @NotNull public final String getTerminalUid() { return this.terminalUid; } @NotNull public final String getSessionLog() { return this.sessionLog; } @NotNull
/*     */   public SerializableEvent toSerializable() {
/* 153 */     return this;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.terminalUid;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.sessionLog;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TerminalSessionFinishedEvent copy(@NotNull String terminalUid, @NotNull String sessionLog) {
/*     */     Intrinsics.checkNotNullParameter(terminalUid, "terminalUid");
/*     */     Intrinsics.checkNotNullParameter(sessionLog, "sessionLog");
/*     */     return new TerminalSessionFinishedEvent(terminalUid, sessionLog);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "TerminalSessionFinishedEvent(terminalUid=" + this.terminalUid + ", sessionLog=" + this.sessionLog + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.terminalUid.hashCode();
/*     */     return result * 31 + this.sessionLog.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof TerminalSessionFinishedEvent))
/*     */       return false; 
/*     */     TerminalSessionFinishedEvent terminalSessionFinishedEvent = (TerminalSessionFinishedEvent)other;
/*     */     return !Intrinsics.areEqual(this.terminalUid, terminalSessionFinishedEvent.terminalUid) ? false : (!!Intrinsics.areEqual(this.sessionLog, terminalSessionFinishedEvent.sessionLog));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\TerminalSessionFinishedEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */