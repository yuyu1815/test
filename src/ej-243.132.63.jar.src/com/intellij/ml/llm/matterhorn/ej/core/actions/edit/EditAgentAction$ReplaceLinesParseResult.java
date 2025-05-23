/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\030\002\n\000\b6\030\0002\0020\001:\002\004\005B\t\b\004¢\006\004\b\002\020\003\001\002\006\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult;", "", "<init>", "()V", "Success", "Error", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult$Success;", "ej-core"})
/*    */ public abstract class ReplaceLinesParseResult
/*    */ {
/*    */   private ReplaceLinesParseResult() {}
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\020\016\n\002\b\f\n\002\020\013\n\000\n\002\020\000\n\002\b\003\b\b\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006¢\006\004\b\007\020\bJ\t\020\016\032\0020\003HÆ\003J\t\020\017\032\0020\003HÆ\003J\t\020\020\032\0020\006HÆ\003J'\020\021\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\006HÆ\001J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\025HÖ\003J\t\020\026\032\0020\003HÖ\001J\t\020\027\032\0020\006HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\013\020\nR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\f\020\r¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult$Success;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult;", "startLine", "", "endLine", "replacementText", "", "<init>", "(IILjava/lang/String;)V", "getStartLine", "()I", "getEndLine", "getReplacementText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "ej-core"})
/*    */   public static final class Success
/*    */     extends ReplaceLinesParseResult
/*    */   {
/*    */     private final int startLine;
/*    */     private final int endLine;
/*    */     @NotNull
/*    */     private final String replacementText;
/*    */     
/*    */     public Success(int startLine, int endLine, @NotNull String replacementText) {
/* 92 */       super(null); this.startLine = startLine; this.endLine = endLine; this.replacementText = replacementText; } public final int getStartLine() { return this.startLine; } public final int getEndLine() { return this.endLine; } @NotNull public final String getReplacementText() { return this.replacementText; } public final int component1() { return this.startLine; } public final int component2() { return this.endLine; } @NotNull public final String component3() { return this.replacementText; } @NotNull public final Success copy(int startLine, int endLine, @NotNull String replacementText) { Intrinsics.checkNotNullParameter(replacementText, "replacementText"); return new Success(startLine, endLine, replacementText); } @NotNull public String toString() { return "Success(startLine=" + this.startLine + ", endLine=" + this.endLine + ", replacementText=" + this.replacementText + ")"; } public int hashCode() { result = Integer.hashCode(this.startLine); result = result * 31 + Integer.hashCode(this.endLine); return result * 31 + this.replacementText.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Success)) return false;  Success success = (Success)other; return (this.startLine != success.startLine) ? false : ((this.endLine != success.endLine) ? false : (!!Intrinsics.areEqual(this.replacementText, success.replacementText))); }
/* 93 */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction$ReplaceLinesParseResult;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-core"}) public static final class Error extends ReplaceLinesParseResult { public Error(@NotNull String message) { super(null); this.message = message; } @NotNull private final String message; @NotNull public final String getMessage() { return this.message; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final String component1() {
/*    */       return this.message;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Error copy(@NotNull String message) {
/*    */       Intrinsics.checkNotNullParameter(message, "message");
/*    */       return new Error(message);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Error(message=" + this.message + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return this.message.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Error))
/*    */         return false; 
/*    */       Error error = (Error)other;
/*    */       return !!Intrinsics.areEqual(this.message, error.message);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\EditAgentAction$ReplaceLinesParseResult.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */