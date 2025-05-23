/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.time.TimeMark;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006¢\006\004\b\007\020\bJ\t\020\016\032\0020\003HÆ\003J\t\020\017\032\0020\003HÆ\003J\t\020\020\032\0020\006HÆ\003J'\020\021\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\006HÆ\001J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\001HÖ\003J\t\020\025\032\0020\026HÖ\001J\t\020\027\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\013\020\nR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\f\020\r¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StartedCommand;", "", "command", "", "currentDirectory", "commandStarted", "Lkotlin/time/TimeMark;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/time/TimeMark;)V", "getCommand", "()Ljava/lang/String;", "getCurrentDirectory", "getCommandStarted", "()Lkotlin/time/TimeMark;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ej-core"})
/*     */ final class StartedCommand
/*     */ {
/*     */   @NotNull
/*     */   private final String command;
/*     */   @NotNull
/*     */   private final String currentDirectory;
/*     */   @NotNull
/*     */   private final TimeMark commandStarted;
/*     */   
/*     */   public StartedCommand(@NotNull String command, @NotNull String currentDirectory, @NotNull TimeMark commandStarted) {
/* 305 */     this.command = command; this.currentDirectory = currentDirectory; this.commandStarted = commandStarted; } @NotNull public final String getCommand() { return this.command; } @NotNull public final String getCurrentDirectory() { return this.currentDirectory; } @NotNull public final TimeMark getCommandStarted() { return this.commandStarted; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.command;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.currentDirectory;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TimeMark component3() {
/*     */     return this.commandStarted;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final StartedCommand copy(@NotNull String command, @NotNull String currentDirectory, @NotNull TimeMark commandStarted) {
/*     */     Intrinsics.checkNotNullParameter(command, "command");
/*     */     Intrinsics.checkNotNullParameter(currentDirectory, "currentDirectory");
/*     */     Intrinsics.checkNotNullParameter(commandStarted, "commandStarted");
/*     */     return new StartedCommand(command, currentDirectory, commandStarted);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "StartedCommand(command=" + this.command + ", currentDirectory=" + this.currentDirectory + ", commandStarted=" + this.commandStarted + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.command.hashCode();
/*     */     result = result * 31 + this.currentDirectory.hashCode();
/*     */     return result * 31 + this.commandStarted.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof StartedCommand))
/*     */       return false; 
/*     */     StartedCommand startedCommand = (StartedCommand)other;
/*     */     return !Intrinsics.areEqual(this.command, startedCommand.command) ? false : (!Intrinsics.areEqual(this.currentDirectory, startedCommand.currentDirectory) ? false : (!!Intrinsics.areEqual(this.commandStarted, startedCommand.commandStarted)));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\StartedCommand.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */