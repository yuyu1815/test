/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session;
/*     */ 
/*     */ import com.intellij.openapi.util.text.StringUtil;
/*     */ import com.intellij.terminal.completion.spec.ShellCommandResult;
/*     */ import com.intellij.util.execution.ParametersListUtil;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.CompletableDeferred;
/*     */ import kotlinx.coroutines.CompletableDeferredKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.plugins.terminal.util.ShellType;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\020\b\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\004\b\004\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\006\020\002\032\0020\003J\b\020\017\032\0020\003H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\b\020\tR\027\020\n\032\b\022\004\022\0020\f0\013¢\006\b\n\000\032\004\b\r\020\016¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl$Generator;", "", "shellCommand", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManagerImpl;Ljava/lang/String;)V", "requestId", "", "getRequestId", "()I", "deferred", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/intellij/terminal/completion/spec/ShellCommandResult;", "getDeferred", "()Lkotlinx/coroutines/CompletableDeferred;", "toString", "ej-core"})
/*     */ final class Generator
/*     */ {
/*     */   @NotNull
/*     */   private final String shellCommand;
/*     */   private final int requestId;
/*     */   @NotNull
/*     */   private final CompletableDeferred<ShellCommandResult> deferred;
/*     */   
/*     */   public final int getRequestId() {
/*     */     return this.requestId;
/*     */   }
/*     */   
/*     */   public Generator(String shellCommand) {
/* 363 */     this.shellCommand = shellCommand;
/* 364 */     this.requestId = ShellCommandExecutionManagerImpl.access$getNEXT_REQUEST_ID$cp().incrementAndGet();
/* 365 */     this.deferred = CompletableDeferredKt.CompletableDeferred$default(null, 1, null); } @NotNull public final CompletableDeferred<ShellCommandResult> getDeferred() { return this.deferred; }
/*     */    @NotNull
/*     */   public final String shellCommand() {
/* 368 */     String str1 = 
/* 369 */       (WhenMappings.$EnumSwitchMapping$0[ShellCommandExecutionManagerImpl.access$getShellIntegration$p(ShellCommandExecutionManagerImpl.this).getShellType().ordinal()] == 1) ? StringUtil.wrapWithDoubleQuote(ShellCommandExecutionManagerImpl.Companion.escapePowerShellParameter(this.shellCommand)) : 
/* 370 */       ParametersListUtil.escape(this.shellCommand); Intrinsics.checkNotNull(str1);
/*     */     String escapedCommand = str1;
/* 372 */     return "__jetbrains_intellij_run_generator " + this.requestId + " " + escapedCommand;
/*     */   } @NotNull
/*     */   public String toString() {
/* 375 */     return "Generator(command=" + this.shellCommand + ", requestId=" + this.requestId + ")";
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\ShellCommandExecutionManagerImpl$Generator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */