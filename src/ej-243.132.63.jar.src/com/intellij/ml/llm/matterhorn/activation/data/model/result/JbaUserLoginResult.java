/*    */ package com.intellij.ml.llm.matterhorn.activation.data.model.result;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bv\030\0002\0020\001:\003\002\003\004\001\003\005\006\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult;", "", "Success", "Failure", "Cancellation", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult$Cancellation;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult$Failure;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult$Success;", "data.model"})
/*    */ public interface JbaUserLoginResult { @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\021HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult$Success;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult;", "jbaUser", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaUser;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaUser;)V", "getJbaUser", "()Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaUser;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data.model"})
/*    */   public static final class Success implements JbaUserLoginResult { @NotNull
/*    */     private final JbaUser jbaUser;
/*    */     
/*  7 */     public Success(@NotNull JbaUser jbaUser) { this.jbaUser = jbaUser; } @NotNull public final JbaUser getJbaUser() { return this.jbaUser; } @NotNull public final JbaUser component1() { return this.jbaUser; } @NotNull public final Success copy(@NotNull JbaUser jbaUser) { Intrinsics.checkNotNullParameter(jbaUser, "jbaUser"); return new Success(jbaUser); } @NotNull public String toString() { return "Success(jbaUser=" + this.jbaUser + ")"; }
/*    */     public int hashCode() { return this.jbaUser.hashCode(); }
/*    */     public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Success)) return false;  Success success = (Success)other; return !!Intrinsics.areEqual(this.jbaUser, success.jbaUser); } }
/* 10 */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\bv\030\0002\0020\001:\002\002\003\001\002\004\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult$Failure;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult;", "ErrorResponse", "Internal", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult$Failure$ErrorResponse;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult$Failure$Internal;", "data.model"}) public static interface Failure extends JbaUserLoginResult { @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult$Failure$ErrorResponse;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult$Failure;", "errorMessage", "", "<init>", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data.model"}) public static final class ErrorResponse implements Failure { public ErrorResponse(@NotNull String errorMessage) { this.errorMessage = errorMessage; } @NotNull private final String errorMessage; @NotNull public final String getErrorMessage() { return this.errorMessage; } @NotNull public final String component1() { return this.errorMessage; } @NotNull public final ErrorResponse copy(@NotNull String errorMessage) { Intrinsics.checkNotNullParameter(errorMessage, "errorMessage"); return new ErrorResponse(errorMessage); } @NotNull public String toString() { return "ErrorResponse(errorMessage=" + this.errorMessage + ")"; } public int hashCode() { return this.errorMessage.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof ErrorResponse)) return false;  ErrorResponse errorResponse = (ErrorResponse)other; return !!Intrinsics.areEqual(this.errorMessage, errorResponse.errorMessage); } }
/* 11 */      @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\020\003\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\021HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult$Failure$Internal;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult$Failure;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data.model"}) public static final class Internal implements Failure { public Internal(@NotNull Throwable throwable) { this.throwable = throwable; } @NotNull private final Throwable throwable; @NotNull public final Throwable getThrowable() { return this.throwable; }
/*    */ 
/*    */       
/*    */       @NotNull
/*    */       public final Throwable component1() {
/*    */         return this.throwable;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final Internal copy(@NotNull Throwable throwable) {
/*    */         Intrinsics.checkNotNullParameter(throwable, "throwable");
/*    */         return new Internal(throwable);
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public String toString() {
/*    */         return "Internal(throwable=" + this.throwable + ")";
/*    */       }
/*    */       
/*    */       public int hashCode() {
/*    */         return this.throwable.hashCode();
/*    */       }
/*    */       
/*    */       public boolean equals(@Nullable Object other) {
/*    */         if (this == other)
/*    */           return true; 
/*    */         if (!(other instanceof Internal))
/*    */           return false; 
/*    */         Internal internal = (Internal)other;
/*    */         return !!Intrinsics.areEqual(this.throwable, internal.throwable);
/*    */       } }
/*    */      }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÆ\n\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\023\020\004\032\0020\0052\b\020\006\032\004\030\0010\007HÖ\003J\t\020\b\032\0020\tHÖ\001J\t\020\n\032\0020\013HÖ\001¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult$Cancellation;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "data.model"})
/*    */   public static final class Cancellation implements JbaUserLoginResult {
/*    */     @NotNull
/*    */     public static final Cancellation INSTANCE = new Cancellation();
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Cancellation";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return 775454147;
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Cancellation))
/*    */         return false; 
/*    */       (Cancellation)other;
/*    */       return true;
/*    */     }
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\result\JbaUserLoginResult.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */