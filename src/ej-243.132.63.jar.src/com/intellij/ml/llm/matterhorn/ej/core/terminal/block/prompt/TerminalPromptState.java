/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\037\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001Bo\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\003\022\n\b\002\020\005\032\004\030\0010\003\022\n\b\002\020\006\032\004\030\0010\003\022\n\b\002\020\007\032\004\030\0010\003\022\n\b\002\020\b\032\004\030\0010\003\022\n\b\002\020\t\032\004\030\0010\003\022\n\b\002\020\n\032\004\030\0010\003\022\n\b\002\020\013\032\004\030\0010\003¢\006\004\b\f\020\rJ\t\020\030\032\0020\003HÆ\003J\013\020\031\032\004\030\0010\003HÆ\003J\013\020\032\032\004\030\0010\003HÆ\003J\013\020\033\032\004\030\0010\003HÆ\003J\013\020\034\032\004\030\0010\003HÆ\003J\013\020\035\032\004\030\0010\003HÆ\003J\013\020\036\032\004\030\0010\003HÆ\003J\013\020\037\032\004\030\0010\003HÆ\003J\013\020 \032\004\030\0010\003HÆ\003Js\020!\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\0032\n\b\002\020\005\032\004\030\0010\0032\n\b\002\020\006\032\004\030\0010\0032\n\b\002\020\007\032\004\030\0010\0032\n\b\002\020\b\032\004\030\0010\0032\n\b\002\020\t\032\004\030\0010\0032\n\b\002\020\n\032\004\030\0010\0032\n\b\002\020\013\032\004\030\0010\003HÆ\001J\023\020\"\032\0020#2\b\020$\032\004\030\0010\001HÖ\003J\t\020%\032\0020&HÖ\001J\t\020'\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\016\020\017R\023\020\004\032\004\030\0010\003¢\006\b\n\000\032\004\b\020\020\017R\023\020\005\032\004\030\0010\003¢\006\b\n\000\032\004\b\021\020\017R\023\020\006\032\004\030\0010\003¢\006\b\n\000\032\004\b\022\020\017R\023\020\007\032\004\030\0010\003¢\006\b\n\000\032\004\b\023\020\017R\023\020\b\032\004\030\0010\003¢\006\b\n\000\032\004\b\024\020\017R\023\020\t\032\004\030\0010\003¢\006\b\n\000\032\004\b\025\020\017R\023\020\n\032\004\030\0010\003¢\006\b\n\000\032\004\b\026\020\017R\023\020\013\032\004\030\0010\003¢\006\b\n\000\032\004\b\027\020\017¨\006("}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptState;", "", "currentDirectory", "", "userName", "userHome", "gitBranch", "virtualEnv", "condaEnv", "originalPrompt", "originalRightPrompt", "shellName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrentDirectory", "()Ljava/lang/String;", "getUserName", "getUserHome", "getGitBranch", "getVirtualEnv", "getCondaEnv", "getOriginalPrompt", "getOriginalRightPrompt", "getShellName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "ej-core"})
/*    */ @Internal
/*    */ public final class TerminalPromptState { @NotNull
/*    */   private final String currentDirectory; @Nullable
/*    */   private final String userName; @Nullable
/*    */   private final String userHome; @Nullable
/*  8 */   private final String gitBranch; public TerminalPromptState(@NotNull String currentDirectory, @Nullable String userName, @Nullable String userHome, @Nullable String gitBranch, @Nullable String virtualEnv, @Nullable String condaEnv, @Nullable String originalPrompt, @Nullable String originalRightPrompt, @Nullable String shellName) { this.currentDirectory = currentDirectory;
/*  9 */     this.userName = userName;
/* 10 */     this.userHome = userHome;
/* 11 */     this.gitBranch = gitBranch;
/*    */     
/* 13 */     this.virtualEnv = virtualEnv;
/* 14 */     this.condaEnv = condaEnv;
/* 15 */     this.originalPrompt = originalPrompt;
/* 16 */     this.originalRightPrompt = originalRightPrompt;
/* 17 */     this.shellName = shellName; } @Nullable private final String virtualEnv; @Nullable private final String condaEnv; @Nullable private final String originalPrompt; @Nullable private final String originalRightPrompt; @Nullable private final String shellName; @NotNull public final String getCurrentDirectory() { return this.currentDirectory; } @Nullable public final String getUserName() { return this.userName; } @Nullable public final String getUserHome() { return this.userHome; } @Nullable public final String getGitBranch() { return this.gitBranch; } @Nullable public final String getShellName() { return this.shellName; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final String getVirtualEnv() {
/*    */     return this.virtualEnv;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getCondaEnv() {
/*    */     return this.condaEnv;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getOriginalPrompt() {
/*    */     return this.originalPrompt;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getOriginalRightPrompt() {
/*    */     return this.originalRightPrompt;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.currentDirectory;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component2() {
/*    */     return this.userName;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component3() {
/*    */     return this.userHome;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component4() {
/*    */     return this.gitBranch;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component5() {
/*    */     return this.virtualEnv;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component6() {
/*    */     return this.condaEnv;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component7() {
/*    */     return this.originalPrompt;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component8() {
/*    */     return this.originalRightPrompt;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component9() {
/*    */     return this.shellName;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TerminalPromptState copy(@NotNull String currentDirectory, @Nullable String userName, @Nullable String userHome, @Nullable String gitBranch, @Nullable String virtualEnv, @Nullable String condaEnv, @Nullable String originalPrompt, @Nullable String originalRightPrompt, @Nullable String shellName) {
/*    */     Intrinsics.checkNotNullParameter(currentDirectory, "currentDirectory");
/*    */     return new TerminalPromptState(currentDirectory, userName, userHome, gitBranch, virtualEnv, condaEnv, originalPrompt, originalRightPrompt, shellName);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TerminalPromptState(currentDirectory=" + this.currentDirectory + ", userName=" + this.userName + ", userHome=" + this.userHome + ", gitBranch=" + this.gitBranch + ", virtualEnv=" + this.virtualEnv + ", condaEnv=" + this.condaEnv + ", originalPrompt=" + this.originalPrompt + ", originalRightPrompt=" + this.originalRightPrompt + ", shellName=" + this.shellName + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.currentDirectory.hashCode();
/*    */     result = result * 31 + ((this.userName == null) ? 0 : this.userName.hashCode());
/*    */     result = result * 31 + ((this.userHome == null) ? 0 : this.userHome.hashCode());
/*    */     result = result * 31 + ((this.gitBranch == null) ? 0 : this.gitBranch.hashCode());
/*    */     result = result * 31 + ((this.virtualEnv == null) ? 0 : this.virtualEnv.hashCode());
/*    */     result = result * 31 + ((this.condaEnv == null) ? 0 : this.condaEnv.hashCode());
/*    */     result = result * 31 + ((this.originalPrompt == null) ? 0 : this.originalPrompt.hashCode());
/*    */     result = result * 31 + ((this.originalRightPrompt == null) ? 0 : this.originalRightPrompt.hashCode());
/*    */     return result * 31 + ((this.shellName == null) ? 0 : this.shellName.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TerminalPromptState))
/*    */       return false; 
/*    */     TerminalPromptState terminalPromptState = (TerminalPromptState)other;
/*    */     return !Intrinsics.areEqual(this.currentDirectory, terminalPromptState.currentDirectory) ? false : (!Intrinsics.areEqual(this.userName, terminalPromptState.userName) ? false : (!Intrinsics.areEqual(this.userHome, terminalPromptState.userHome) ? false : (!Intrinsics.areEqual(this.gitBranch, terminalPromptState.gitBranch) ? false : (!Intrinsics.areEqual(this.virtualEnv, terminalPromptState.virtualEnv) ? false : (!Intrinsics.areEqual(this.condaEnv, terminalPromptState.condaEnv) ? false : (!Intrinsics.areEqual(this.originalPrompt, terminalPromptState.originalPrompt) ? false : (!Intrinsics.areEqual(this.originalRightPrompt, terminalPromptState.originalRightPrompt) ? false : (!!Intrinsics.areEqual(this.shellName, terminalPromptState.shellName)))))))));
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\TerminalPromptState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */