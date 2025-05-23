/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.ActionRequest;
/*     */ import kotlin.Metadata;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B!\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\003\022\006\020\005\032\0020\006¢\006\004\b\007\020\bJ\t\020\f\032\0020\003HÆ\003J\013\020\r\032\004\030\0010\003HÆ\003J\t\020\016\032\0020\006HÂ\003J)\020\017\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\0032\b\b\002\020\005\032\0020\006HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\001HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\023\020\004\032\004\030\0010\003¢\006\b\n\000\032\004\b\013\020\nR\016\020\005\032\0020\006X\004¢\006\002\n\000¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/TerminalCommandRequest;", "", "command", "", "warningForJunie", "request", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;)V", "getCommand", "()Ljava/lang/String;", "getWarningForJunie", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ej-core"})
/*     */ public final class TerminalCommandRequest
/*     */ {
/*     */   @NotNull
/*     */   private final String command;
/*     */   @Nullable
/*     */   private final String warningForJunie;
/*     */   @NotNull
/*     */   private final ActionRequest request;
/*     */   
/*     */   public TerminalCommandRequest(@NotNull String command, @Nullable String warningForJunie, @NotNull ActionRequest request) {
/* 238 */     this.command = command;
/* 239 */     this.warningForJunie = warningForJunie;
/* 240 */     this.request = request;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getCommand() {
/*     */     return this.command;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String getWarningForJunie() {
/*     */     return this.warningForJunie;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.command;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component2() {
/*     */     return this.warningForJunie;
/*     */   }
/*     */   
/*     */   private final ActionRequest component3() {
/*     */     return this.request;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TerminalCommandRequest copy(@NotNull String command, @Nullable String warningForJunie, @NotNull ActionRequest request) {
/*     */     Intrinsics.checkNotNullParameter(command, "command");
/*     */     Intrinsics.checkNotNullParameter(request, "request");
/*     */     return new TerminalCommandRequest(command, warningForJunie, request);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "TerminalCommandRequest(command=" + this.command + ", warningForJunie=" + this.warningForJunie + ", request=" + this.request + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.command.hashCode();
/*     */     result = result * 31 + ((this.warningForJunie == null) ? 0 : this.warningForJunie.hashCode());
/*     */     return result * 31 + this.request.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof TerminalCommandRequest))
/*     */       return false; 
/*     */     TerminalCommandRequest terminalCommandRequest = (TerminalCommandRequest)other;
/*     */     return !Intrinsics.areEqual(this.command, terminalCommandRequest.command) ? false : (!Intrinsics.areEqual(this.warningForJunie, terminalCommandRequest.warningForJunie) ? false : (!!Intrinsics.areEqual(this.request, terminalCommandRequest.request)));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\TerminalCommandRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */