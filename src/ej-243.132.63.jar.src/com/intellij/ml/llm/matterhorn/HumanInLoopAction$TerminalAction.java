/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\n\032\0020\003HÆ\003J\023\020\013\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\f\032\0020\r2\b\020\016\032\004\030\0010\017HÖ\003J\t\020\020\032\0020\021HÖ\001J\t\020\022\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\0020\0038VX\004¢\006\006\032\004\b\t\020\007¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction$TerminalAction;", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;", "command", "", "<init>", "(Ljava/lang/String;)V", "getCommand", "()Ljava/lang/String;", "allowListActionName", "getAllowListActionName", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core"})
/*    */ public final class TerminalAction
/*    */   extends HumanInLoopAction
/*    */ {
/*    */   @NotNull
/*    */   private final String command;
/*    */   
/*    */   public TerminalAction(@NotNull String command) {
/* 90 */     super(ActionType.Terminal, null); this.command = command; } @NotNull public final String getCommand() { return this.command; } @NotNull
/*    */   public String getAllowListActionName() {
/* 92 */     return this.command;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.command;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TerminalAction copy(@NotNull String command) {
/*    */     Intrinsics.checkNotNullParameter(command, "command");
/*    */     return new TerminalAction(command);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TerminalAction(command=" + this.command + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.command.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TerminalAction))
/*    */       return false; 
/*    */     TerminalAction terminalAction = (TerminalAction)other;
/*    */     return !!Intrinsics.areEqual(this.command, terminalAction.command);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\HumanInLoopAction$TerminalAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */