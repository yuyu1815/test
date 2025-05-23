/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tasks;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\005\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b6\030\0002\0020\001:\003\004\005\006B\t\b\004¢\006\004\b\002\020\003\001\003\007\b\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState;", "", "<init>", "()V", "TerminalAvailable", "SessionLogAvailable", "NotAvailable", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState$NotAvailable;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState$SessionLogAvailable;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState$TerminalAvailable;", "ej-core"})
/*    */ public abstract class TerminalState
/*    */ {
/*    */   private TerminalState() {}
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\002\b\005\030\0002\0020\001B\025\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState$TerminalAvailable;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState;", "openAction", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getOpenAction", "()Lkotlin/jvm/functions/Function0;", "ej-core"})
/*    */   public static final class TerminalAvailable
/*    */     extends TerminalState
/*    */   {
/*    */     @NotNull
/*    */     private final Function0<Unit> openAction;
/*    */     
/*    */     public TerminalAvailable(@NotNull Function0<Unit> openAction) {
/* 73 */       super(null); this.openAction = openAction; } @NotNull public final Function0<Unit> getOpenAction() { return this.openAction; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState$SessionLogAvailable;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState;", "sessionLog", "", "<init>", "(Ljava/lang/String;)V", "getSessionLog", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-core"}) public static final class SessionLogAvailable extends TerminalState { @NotNull
/* 74 */     private final String sessionLog; public SessionLogAvailable(@NotNull String sessionLog) { super(null); this.sessionLog = sessionLog; } @NotNull public final String component1() { return this.sessionLog; } @NotNull public final SessionLogAvailable copy(@NotNull String sessionLog) { Intrinsics.checkNotNullParameter(sessionLog, "sessionLog"); return new SessionLogAvailable(sessionLog); } @NotNull public String toString() { return "SessionLogAvailable(sessionLog=" + this.sessionLog + ")"; } @NotNull public final String getSessionLog() { return this.sessionLog; } public int hashCode() { return this.sessionLog.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof SessionLogAvailable)) return false;  SessionLogAvailable sessionLogAvailable = (SessionLogAvailable)other; return !!Intrinsics.areEqual(this.sessionLog, sessionLogAvailable.sessionLog); } }
/* 75 */    @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState$NotAvailable;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState;", "<init>", "()V", "ej-core"}) public static final class NotAvailable extends TerminalState { private NotAvailable() { super(null); }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public static final NotAvailable INSTANCE = new NotAvailable(); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\TerminalState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */