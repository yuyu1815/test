/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.events.SerializableEvent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\020\002\n\002\b\007\n\002\030\002\n\002\b\004\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\004\b\007\020\bJ\n\020\r\032\004\030\0010\016H\026J\t\020\017\032\0020\003HÆ\003J\017\020\020\032\b\022\004\022\0020\0060\005HÆ\003J#\020\021\032\0020\0002\b\b\002\020\002\032\0020\0032\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\025HÖ\003J\t\020\026\032\0020\027HÖ\001J\t\020\030\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/TerminalSessionStartedEvent;", "Lcom/intellij/ml/llm/matterhorn/TerminalEvent;", "terminalUid", "", "openTerminalAction", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getTerminalUid", "()Ljava/lang/String;", "getOpenTerminalAction", "()Lkotlin/jvm/functions/Function0;", "toSerializable", "Lcom/intellij/ml/llm/matterhorn/events/SerializableEvent;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core"})
/*     */ public final class TerminalSessionStartedEvent
/*     */   implements TerminalEvent
/*     */ {
/*     */   @NotNull
/*     */   private final String terminalUid;
/*     */   @NotNull
/*     */   private final Function0<Unit> openTerminalAction;
/*     */   
/*     */   @NotNull
/*     */   public final String getTerminalUid() {
/*     */     return this.terminalUid;
/*     */   }
/*     */   
/*     */   public TerminalSessionStartedEvent(@NotNull String terminalUid, @NotNull Function0<Unit> openTerminalAction) {
/* 140 */     this.terminalUid = terminalUid;
/* 141 */     this.openTerminalAction = openTerminalAction; } @NotNull public final Function0<Unit> getOpenTerminalAction() { return this.openTerminalAction; } @Nullable
/*     */   public SerializableEvent toSerializable() {
/* 143 */     return null;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.terminalUid;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Function0<Unit> component2() {
/*     */     return this.openTerminalAction;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TerminalSessionStartedEvent copy(@NotNull String terminalUid, @NotNull Function0<Unit> openTerminalAction) {
/*     */     Intrinsics.checkNotNullParameter(terminalUid, "terminalUid");
/*     */     Intrinsics.checkNotNullParameter(openTerminalAction, "openTerminalAction");
/*     */     return new TerminalSessionStartedEvent(terminalUid, openTerminalAction);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "TerminalSessionStartedEvent(terminalUid=" + this.terminalUid + ", openTerminalAction=" + this.openTerminalAction + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.terminalUid.hashCode();
/*     */     return result * 31 + this.openTerminalAction.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof TerminalSessionStartedEvent))
/*     */       return false; 
/*     */     TerminalSessionStartedEvent terminalSessionStartedEvent = (TerminalSessionStartedEvent)other;
/*     */     return !Intrinsics.areEqual(this.terminalUid, terminalSessionStartedEvent.terminalUid) ? false : (!!Intrinsics.areEqual(this.openTerminalAction, terminalSessionStartedEvent.openTerminalAction));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\TerminalSessionStartedEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */