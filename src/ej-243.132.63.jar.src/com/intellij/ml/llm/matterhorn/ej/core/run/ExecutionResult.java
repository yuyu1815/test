/*    */ package com.intellij.ml.llm.matterhorn.ej.core.run;
/*    */ 
/*    */ import java.nio.file.Path;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\r\n\002\020\013\n\002\b\004\b\b\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\t\020\020\032\0020\003HÆ\003J\t\020\021\032\0020\005HÆ\003J\t\020\022\032\0020\007HÆ\003J'\020\023\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\001HÖ\003J\t\020\027\032\0020\007HÖ\001J\t\020\030\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult;", "", "output", "", "pathAfterExecution", "Ljava/nio/file/Path;", "exitCode", "", "<init>", "(Ljava/lang/String;Ljava/nio/file/Path;I)V", "getOutput", "()Ljava/lang/String;", "getPathAfterExecution", "()Ljava/nio/file/Path;", "getExitCode", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "ej-core"})
/*    */ public final class ExecutionResult
/*    */ {
/*    */   @NotNull
/*    */   private final String output;
/*    */   @NotNull
/*    */   private final Path pathAfterExecution;
/*    */   private final int exitCode;
/*    */   
/*    */   public ExecutionResult(@NotNull String output, @NotNull Path pathAfterExecution, int exitCode) {
/* 21 */     this.output = output; this.pathAfterExecution = pathAfterExecution; this.exitCode = exitCode; } @NotNull public final String getOutput() { return this.output; } @NotNull public final Path getPathAfterExecution() { return this.pathAfterExecution; } public final int getExitCode() { return this.exitCode; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.output;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Path component2() {
/*    */     return this.pathAfterExecution;
/*    */   }
/*    */   
/*    */   public final int component3() {
/*    */     return this.exitCode;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ExecutionResult copy(@NotNull String output, @NotNull Path pathAfterExecution, int exitCode) {
/*    */     Intrinsics.checkNotNullParameter(output, "output");
/*    */     Intrinsics.checkNotNullParameter(pathAfterExecution, "pathAfterExecution");
/*    */     return new ExecutionResult(output, pathAfterExecution, exitCode);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ExecutionResult(output=" + this.output + ", pathAfterExecution=" + this.pathAfterExecution + ", exitCode=" + this.exitCode + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.output.hashCode();
/*    */     result = result * 31 + this.pathAfterExecution.hashCode();
/*    */     return result * 31 + Integer.hashCode(this.exitCode);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ExecutionResult))
/*    */       return false; 
/*    */     ExecutionResult executionResult = (ExecutionResult)other;
/*    */     return !Intrinsics.areEqual(this.output, executionResult.output) ? false : (!Intrinsics.areEqual(this.pathAfterExecution, executionResult.pathAfterExecution) ? false : (!(this.exitCode != executionResult.exitCode)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\run\ExecutionResult.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */