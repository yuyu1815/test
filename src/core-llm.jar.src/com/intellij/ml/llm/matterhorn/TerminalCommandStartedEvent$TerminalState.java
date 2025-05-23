/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\005\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b6\030\0002\0020\001:\003\004\005\006B\t\b\004¢\006\004\b\002\020\003\001\003\007\b\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/TerminalCommandStartedEvent$TerminalState;", "", "<init>", "()V", "Running", "Success", "Failed", "Lcom/intellij/ml/llm/matterhorn/TerminalCommandStartedEvent$TerminalState$Failed;", "Lcom/intellij/ml/llm/matterhorn/TerminalCommandStartedEvent$TerminalState$Running;", "Lcom/intellij/ml/llm/matterhorn/TerminalCommandStartedEvent$TerminalState$Success;", "core"})
/*     */ public abstract class TerminalState
/*     */ {
/*     */   private TerminalState() {}
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/TerminalCommandStartedEvent$TerminalState$Running;", "Lcom/intellij/ml/llm/matterhorn/TerminalCommandStartedEvent$TerminalState;", "<init>", "()V", "core"})
/*     */   public static final class Running
/*     */     extends TerminalState
/*     */   {
/*     */     @NotNull
/*     */     public static final Running INSTANCE = new Running();
/*     */     
/*     */     private Running() {
/* 166 */       super(null); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/TerminalCommandStartedEvent$TerminalState$Success;", "Lcom/intellij/ml/llm/matterhorn/TerminalCommandStartedEvent$TerminalState;", "<init>", "()V", "core"})
/* 167 */   public static final class Success extends TerminalState { private Success() { super(null); } @NotNull public static final Success INSTANCE = new Success(); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/TerminalCommandStartedEvent$TerminalState$Failed;", "Lcom/intellij/ml/llm/matterhorn/TerminalCommandStartedEvent$TerminalState;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core"}) public static final class Failed extends TerminalState { @NotNull
/* 168 */     private final String message; public Failed(@NotNull String message) { super(null); this.message = message; } @NotNull public final String getMessage() { return this.message; }
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final String component1() {
/*     */       return this.message;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Failed copy(@NotNull String message) {
/*     */       Intrinsics.checkNotNullParameter(message, "message");
/*     */       return new Failed(message);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "Failed(message=" + this.message + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       return this.message.hashCode();
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof Failed))
/*     */         return false; 
/*     */       Failed failed = (Failed)other;
/*     */       return !!Intrinsics.areEqual(this.message, failed.message);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\TerminalCommandStartedEvent$TerminalState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */