/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;
/*    */ 
/*    */ import java.util.List;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\030\002\n\000\b6\030\0002\0020\001:\002\004\005B\t\b\004¢\006\004\b\002\020\003\001\002\006\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult;", "", "<init>", "()V", "Success", "Error", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult$Success;", "ej-core"})
/*    */ public abstract class SearchReplaceParseResult
/*    */ {
/*    */   private SearchReplaceParseResult() {}
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\025\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006J\017\020\t\032\b\022\004\022\0020\0040\003HÆ\003J\031\020\n\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\003HÆ\001J\023\020\013\032\0020\f2\b\020\r\032\004\030\0010\016HÖ\003J\t\020\017\032\0020\020HÖ\001J\t\020\021\032\0020\022HÖ\001R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\007\020\b¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult$Success;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult;", "edits", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/Edit;", "<init>", "(Ljava/util/List;)V", "getEdits", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ej-core"})
/*    */   public static final class Success
/*    */     extends SearchReplaceParseResult
/*    */   {
/*    */     @NotNull
/*    */     private final List<Edit> edits;
/*    */     
/*    */     public Success(@NotNull List<Edit> edits) {
/* 51 */       super(null); this.edits = edits; } @NotNull public final List<Edit> component1() { return this.edits; } @NotNull public final Success copy(@NotNull List<Edit> edits) { Intrinsics.checkNotNullParameter(edits, "edits"); return new Success(edits); } @NotNull public String toString() { return "Success(edits=" + this.edits + ")"; } @NotNull public final List<Edit> getEdits() { return this.edits; } public int hashCode() { return this.edits.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Success)) return false;  Success success = (Success)other; return !!Intrinsics.areEqual(this.edits, success.edits); }
/* 52 */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SearchReplaceParseResult;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-core"}) public static final class Error extends SearchReplaceParseResult { @NotNull private final String message; public Error(@NotNull String message) { super(null); this.message = message; } @NotNull public final String getMessage() { return this.message; }
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


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\SearchReplaceParseResult.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */