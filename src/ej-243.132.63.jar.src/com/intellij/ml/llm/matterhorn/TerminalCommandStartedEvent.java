/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.events.SerializableEvent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.flow.StateFlow;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\003\b\b\030\0002\0020\001:\001\037B3\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\f\020\005\032\b\022\004\022\0020\0030\006\022\f\020\007\032\b\022\004\022\0020\b0\006¢\006\004\b\t\020\nJ\n\020\021\032\004\030\0010\022H\026J\t\020\023\032\0020\003HÆ\003J\t\020\024\032\0020\003HÆ\003J\017\020\025\032\b\022\004\022\0020\0030\006HÆ\003J\017\020\026\032\b\022\004\022\0020\b0\006HÆ\003J=\020\027\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\016\b\002\020\005\032\b\022\004\022\0020\0030\0062\016\b\002\020\007\032\b\022\004\022\0020\b0\006HÆ\001J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\033HÖ\003J\t\020\034\032\0020\035HÖ\001J\t\020\036\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\r\020\fR\027\020\005\032\b\022\004\022\0020\0030\006¢\006\b\n\000\032\004\b\016\020\017R\027\020\007\032\b\022\004\022\0020\b0\006¢\006\b\n\000\032\004\b\020\020\017¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/TerminalCommandStartedEvent;", "Lcom/intellij/ml/llm/matterhorn/TerminalEvent;", "terminalUid", "", "command", "snapshots", "Lkotlinx/coroutines/flow/StateFlow;", "state", "Lcom/intellij/ml/llm/matterhorn/TerminalCommandStartedEvent$TerminalState;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;)V", "getTerminalUid", "()Ljava/lang/String;", "getCommand", "getSnapshots", "()Lkotlinx/coroutines/flow/StateFlow;", "getState", "toSerializable", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEvent;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "TerminalState", "core"})
/*     */ public final class TerminalCommandStartedEvent
/*     */   implements TerminalEvent
/*     */ {
/*     */   @NotNull
/*     */   private final String terminalUid;
/*     */   @NotNull
/*     */   private final String command;
/*     */   @NotNull
/*     */   private final StateFlow<String> snapshots;
/*     */   @NotNull
/*     */   private final StateFlow<TerminalState> state;
/*     */   
/*     */   public TerminalCommandStartedEvent(@NotNull String terminalUid, @NotNull String command, @NotNull StateFlow<String> snapshots, @NotNull StateFlow<TerminalState> state) {
/* 157 */     this.terminalUid = terminalUid;
/* 158 */     this.command = command;
/* 159 */     this.snapshots = snapshots;
/* 160 */     this.state = state; } @NotNull public final String getTerminalUid() { return this.terminalUid; } @NotNull public final String getCommand() { return this.command; } @NotNull public final StateFlow<String> getSnapshots() { return this.snapshots; } @NotNull public final StateFlow<TerminalState> getState() { return this.state; }
/*     */   @NotNull public final String component1() { return this.terminalUid; }
/*     */   @NotNull public final String component2() { return this.command; }
/* 163 */   @NotNull public final StateFlow<String> component3() { return this.snapshots; } @NotNull public final StateFlow<TerminalState> component4() { return this.state; } @Nullable public SerializableEvent toSerializable() { return null; } @NotNull public final TerminalCommandStartedEvent copy(@NotNull String terminalUid, @NotNull String command, @NotNull StateFlow<String> snapshots, @NotNull StateFlow<? extends TerminalState> state) { Intrinsics.checkNotNullParameter(terminalUid, "terminalUid"); Intrinsics.checkNotNullParameter(command, "command"); Intrinsics.checkNotNullParameter(snapshots, "snapshots"); Intrinsics.checkNotNullParameter(state, "state"); return new TerminalCommandStartedEvent(terminalUid, command, snapshots, state); } @NotNull public String toString() { return "TerminalCommandStartedEvent(terminalUid=" + this.terminalUid + ", command=" + this.command + ", snapshots=" + this.snapshots + ", state=" + this.state + ")"; } public int hashCode() { result = this.terminalUid.hashCode(); result = result * 31 + this.command.hashCode(); result = result * 31 + this.snapshots.hashCode(); return result * 31 + this.state.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof TerminalCommandStartedEvent)) return false;  TerminalCommandStartedEvent terminalCommandStartedEvent = (TerminalCommandStartedEvent)other; return !Intrinsics.areEqual(this.terminalUid, terminalCommandStartedEvent.terminalUid) ? false : (!Intrinsics.areEqual(this.command, terminalCommandStartedEvent.command) ? false : (!Intrinsics.areEqual(this.snapshots, terminalCommandStartedEvent.snapshots) ? false : (!!Intrinsics.areEqual(this.state, terminalCommandStartedEvent.state)))); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\005\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b6\030\0002\0020\001:\003\004\005\006B\t\b\004¢\006\004\b\002\020\003\001\003\007\b\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/TerminalCommandStartedEvent$TerminalState;", "", "<init>", "()V", "Running", "Success", "Failed", "Lcom/intellij/ml/llm/matterhorn/TerminalCommandStartedEvent$TerminalState$Failed;", "Lcom/intellij/ml/llm/matterhorn/TerminalCommandStartedEvent$TerminalState$Running;", "Lcom/intellij/ml/llm/matterhorn/TerminalCommandStartedEvent$TerminalState$Success;", "core"}) public static abstract class TerminalState
/*     */   {
/*     */     private TerminalState() {} @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/TerminalCommandStartedEvent$TerminalState$Running;", "Lcom/intellij/ml/llm/matterhorn/TerminalCommandStartedEvent$TerminalState;", "<init>", "()V", "core"}) public static final class Running extends TerminalState {
/* 166 */       @NotNull public static final Running INSTANCE = new Running(); private Running() { super(null); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/TerminalCommandStartedEvent$TerminalState$Success;", "Lcom/intellij/ml/llm/matterhorn/TerminalCommandStartedEvent$TerminalState;", "<init>", "()V", "core"}) public static final class Success extends TerminalState { @NotNull
/* 167 */       public static final Success INSTANCE = new Success(); private Success() { super(null); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/TerminalCommandStartedEvent$TerminalState$Failed;", "Lcom/intellij/ml/llm/matterhorn/TerminalCommandStartedEvent$TerminalState;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core"}) public static final class Failed extends TerminalState { @NotNull
/* 168 */       private final String message; public Failed(@NotNull String message) { super(null); this.message = message; } @NotNull public final String getMessage() { return this.message; }
/*     */ 
/*     */       
/*     */       @NotNull
/*     */       public final String component1() {
/*     */         return this.message;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final Failed copy(@NotNull String message) {
/*     */         Intrinsics.checkNotNullParameter(message, "message");
/*     */         return new Failed(message);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "Failed(message=" + this.message + ")";
/*     */       }
/*     */       
/*     */       public int hashCode() {
/*     */         return this.message.hashCode();
/*     */       }
/*     */       
/*     */       public boolean equals(@Nullable Object other) {
/*     */         if (this == other)
/*     */           return true; 
/*     */         if (!(other instanceof Failed))
/*     */           return false; 
/*     */         Failed failed = (Failed)other;
/*     */         return !!Intrinsics.areEqual(this.message, failed.message);
/*     */       } }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\TerminalCommandStartedEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */