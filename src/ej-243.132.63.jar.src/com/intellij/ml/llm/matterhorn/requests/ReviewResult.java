/*    */ package com.intellij.ml.llm.matterhorn.requests;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\006\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bv\030\000 \0062\0020\001:\004\006\007\b\tR\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005\001\003\n\013\f¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/ReviewResult;", "", "message", "", "getMessage", "()Ljava/lang/String;", "Companion", "Success", "Error", "Improvement", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewResult$Error;", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewResult$Improvement;", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewResult$Success;", "core"})
/*    */ public interface ReviewResult { @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE; @NotNull
/*    */   String getMessage();
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/ReviewResult$Companion;", "", "<init>", "()V", "Success", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewResult$Success;", "getSuccess", "()Lcom/intellij/ml/llm/matterhorn/requests/ReviewResult$Success;", "core"})
/*    */   public static final class Companion { @NotNull
/*  7 */     private static final ReviewResult.Success Success = new ReviewResult.Success("OK"); @NotNull public final ReviewResult.Success getSuccess() { return Success; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/ReviewResult$Success;", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewResult;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core"})
/*    */   public static final class Success implements ReviewResult { @NotNull
/*  9 */     private final String message; public Success(@NotNull String message) { this.message = message; } @NotNull public final String component1() { return this.message; } @NotNull public final Success copy(@NotNull String message) { Intrinsics.checkNotNullParameter(message, "message"); return new Success(message); } @NotNull public String toString() { return "Success(message=" + this.message + ")"; } @NotNull public String getMessage() { return this.message; } public int hashCode() { return this.message.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Success)) return false;  Success success = (Success)other; return !!Intrinsics.areEqual(this.message, success.message); } }
/* 10 */    @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/ReviewResult$Error;", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewResult;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core"}) public static final class Error implements ReviewResult { public Error(@NotNull String message) { this.message = message; } @NotNull private final String message; @NotNull public String getMessage() { return this.message; } @NotNull public final String component1() { return this.message; } @NotNull public final Error copy(@NotNull String message) { Intrinsics.checkNotNullParameter(message, "message"); return new Error(message); }
/*    */     @NotNull public String toString() { return "Error(message=" + this.message + ")"; }
/*    */     public int hashCode() { return this.message.hashCode(); }
/*    */     public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Error)) return false;  Error error = (Error)other; return !!Intrinsics.areEqual(this.message, error.message); } }
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/ReviewResult$Improvement;", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewResult;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "core"}) public static final class Improvement implements ReviewResult { @NotNull private final String message;
/* 15 */     public Improvement(@NotNull String message) { this.message = message; } @NotNull public String getMessage() { return this.message; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final String component1() {
/*    */       return this.message;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Improvement copy(@NotNull String message) {
/*    */       Intrinsics.checkNotNullParameter(message, "message");
/*    */       return new Improvement(message);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Improvement(message=" + this.message + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return this.message.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Improvement))
/*    */         return false; 
/*    */       Improvement improvement = (Improvement)other;
/*    */       return !!Intrinsics.areEqual(this.message, improvement.message);
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\ReviewResult.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */