/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.time.Duration;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\026\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\005¢\006\004\b\b\020\tJ\t\020\021\032\0020\003HÆ\003J\020\020\022\032\0020\005HÆ\003¢\006\004\b\023\020\rJ\020\020\024\032\0020\005HÆ\003¢\006\004\b\025\020\rJ\020\020\026\032\0020\005HÆ\003¢\006\004\b\027\020\rJ8\020\030\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\005HÆ\001¢\006\004\b\031\020\032J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\001HÖ\003J\t\020\036\032\0020\003HÖ\001J\t\020\037\032\0020 HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\023\020\004\032\0020\005¢\006\n\n\002\020\016\032\004\b\f\020\rR\023\020\006\032\0020\005¢\006\n\n\002\020\016\032\004\b\017\020\rR\023\020\007\032\0020\005¢\006\n\n\002\020\016\032\004\b\020\020\r¨\006!"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CancellationPolicy;", "", "outputLinesLimit", "", "commandExecutionTimeout", "Lkotlin/time/Duration;", "commandCancellationTimeout", "commandSuspendingTimeout", "<init>", "(IJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getOutputLinesLimit", "()I", "getCommandExecutionTimeout-UwyO8pc", "()J", "J", "getCommandCancellationTimeout-UwyO8pc", "getCommandSuspendingTimeout-UwyO8pc", "component1", "component2", "component2-UwyO8pc", "component3", "component3-UwyO8pc", "component4", "component4-UwyO8pc", "copy", "copy-oW5mbrw", "(IJJJ)Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CancellationPolicy;", "equals", "", "other", "hashCode", "toString", "", "core"})
/*    */ public final class CancellationPolicy
/*    */ {
/*    */   private final int outputLinesLimit;
/*    */   private final long commandExecutionTimeout;
/*    */   private final long commandCancellationTimeout;
/*    */   private final long commandSuspendingTimeout;
/*    */   
/*    */   private CancellationPolicy(int outputLinesLimit, long commandExecutionTimeout, long commandCancellationTimeout, long commandSuspendingTimeout) {
/* 21 */     this.outputLinesLimit = outputLinesLimit;
/* 22 */     this.commandExecutionTimeout = commandExecutionTimeout;
/* 23 */     this.commandCancellationTimeout = commandCancellationTimeout;
/* 24 */     this.commandSuspendingTimeout = commandSuspendingTimeout; } public final long getCommandSuspendingTimeout-UwyO8pc() { return this.commandSuspendingTimeout; }
/*    */ 
/*    */   
/*    */   public final int getOutputLinesLimit() {
/*    */     return this.outputLinesLimit;
/*    */   }
/*    */   
/*    */   public final long getCommandExecutionTimeout-UwyO8pc() {
/*    */     return this.commandExecutionTimeout;
/*    */   }
/*    */   
/*    */   public final long getCommandCancellationTimeout-UwyO8pc() {
/*    */     return this.commandCancellationTimeout;
/*    */   }
/*    */   
/*    */   public final int component1() {
/*    */     return this.outputLinesLimit;
/*    */   }
/*    */   
/*    */   public final long component2-UwyO8pc() {
/*    */     return this.commandExecutionTimeout;
/*    */   }
/*    */   
/*    */   public final long component3-UwyO8pc() {
/*    */     return this.commandCancellationTimeout;
/*    */   }
/*    */   
/*    */   public final long component4-UwyO8pc() {
/*    */     return this.commandSuspendingTimeout;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CancellationPolicy copy-oW5mbrw(int outputLinesLimit, long commandExecutionTimeout, long commandCancellationTimeout, long commandSuspendingTimeout) {
/*    */     return new CancellationPolicy(outputLinesLimit, commandExecutionTimeout, commandCancellationTimeout, commandSuspendingTimeout, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "CancellationPolicy(outputLinesLimit=" + this.outputLinesLimit + ", commandExecutionTimeout=" + Duration.toString-impl(this.commandExecutionTimeout) + ", commandCancellationTimeout=" + Duration.toString-impl(this.commandCancellationTimeout) + ", commandSuspendingTimeout=" + Duration.toString-impl(this.commandSuspendingTimeout) + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Integer.hashCode(this.outputLinesLimit);
/*    */     result = result * 31 + Duration.hashCode-impl(this.commandExecutionTimeout);
/*    */     result = result * 31 + Duration.hashCode-impl(this.commandCancellationTimeout);
/*    */     return result * 31 + Duration.hashCode-impl(this.commandSuspendingTimeout);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof CancellationPolicy))
/*    */       return false; 
/*    */     CancellationPolicy cancellationPolicy = (CancellationPolicy)other;
/*    */     return (this.outputLinesLimit != cancellationPolicy.outputLinesLimit) ? false : (!Duration.equals-impl0(this.commandExecutionTimeout, cancellationPolicy.commandExecutionTimeout) ? false : (!Duration.equals-impl0(this.commandCancellationTimeout, cancellationPolicy.commandCancellationTimeout) ? false : (!!Duration.equals-impl0(this.commandSuspendingTimeout, cancellationPolicy.commandSuspendingTimeout))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ShellExecutor$CancellationPolicy.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */