/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\n\n\002\020\013\n\002\b\004\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\005HÖ\001J\t\020\023\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CommandResult;", "", "output", "", "exitStatus", "", "<init>", "(Ljava/lang/String;I)V", "getOutput", "()Ljava/lang/String;", "getExitStatus", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "core"})
/*    */ public final class CommandResult
/*    */ {
/*    */   @NotNull
/*    */   private final String output;
/*    */   private final int exitStatus;
/*    */   
/*    */   public CommandResult(@NotNull String output, int exitStatus) {
/* 18 */     this.output = output; this.exitStatus = exitStatus; } @NotNull public final String getOutput() { return this.output; } public final int getExitStatus() { return this.exitStatus; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.output;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.exitStatus;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CommandResult copy(@NotNull String output, int exitStatus) {
/*    */     Intrinsics.checkNotNullParameter(output, "output");
/*    */     return new CommandResult(output, exitStatus);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "CommandResult(output=" + this.output + ", exitStatus=" + this.exitStatus + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.output.hashCode();
/*    */     return result * 31 + Integer.hashCode(this.exitStatus);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof CommandResult))
/*    */       return false; 
/*    */     CommandResult commandResult = (CommandResult)other;
/*    */     return !Intrinsics.areEqual(this.output, commandResult.output) ? false : (!(this.exitStatus != commandResult.exitStatus));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ShellExecutor$CommandResult.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */