/*   */ package com.intellij.ml.llm.matterhorn.activation.data.model.result;
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\020\001\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\013\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\b\b\030\0002\b\022\004\022\0020\0020\001B\027\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006¢\006\004\b\007\020\bJ\b\020\r\032\0020\006H\026J\t\020\016\032\0020\004HÆ\003J\t\020\017\032\0020\006HÆ\003J\035\020\020\032\0020\0002\b\b\002\020\003\032\0020\0042\b\b\002\020\005\032\0020\006HÆ\001J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\024HÖ\003J\t\020\025\032\0020\026HÖ\001R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\013\020\f¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;", "", "httpError", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;", "errorMessage", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;Ljava/lang/String;)V", "getHttpError", "()Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;", "getErrorMessage", "()Ljava/lang/String;", "toString", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "data.model"})
/*   */ public final class GrazieFailure implements GrazieResult { @NotNull
/*   */   private final GrazieHttpError httpError;
/*   */   
/* 6 */   public GrazieFailure(@NotNull GrazieHttpError httpError, @NotNull String errorMessage) { this.httpError = httpError; this.errorMessage = errorMessage; } @NotNull private final String errorMessage; @NotNull public final GrazieHttpError getHttpError() { return this.httpError; } @NotNull public final String getErrorMessage() { return this.errorMessage; } @NotNull
/* 7 */   public String toString() { if (GrazieHttpErrorKt.getGrazieTraceId(this.httpError) == null) GrazieHttpErrorKt.getGrazieTraceId(this.httpError);  return "[Grazie-Trace-Id: " + "<unknown>" + "] " + this.httpError + ": " + this.errorMessage; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   public final GrazieHttpError component1() {
/*   */     return this.httpError;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final String component2() {
/*   */     return this.errorMessage;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final GrazieFailure copy(@NotNull GrazieHttpError httpError, @NotNull String errorMessage) {
/*   */     Intrinsics.checkNotNullParameter(httpError, "httpError");
/*   */     Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
/*   */     return new GrazieFailure(httpError, errorMessage);
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     result = this.httpError.hashCode();
/*   */     return result * 31 + this.errorMessage.hashCode();
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof GrazieFailure))
/*   */       return false; 
/*   */     GrazieFailure grazieFailure = (GrazieFailure)other;
/*   */     return !Intrinsics.areEqual(this.httpError, grazieFailure.httpError) ? false : (!!Intrinsics.areEqual(this.errorMessage, grazieFailure.errorMessage));
/*   */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\result\GrazieResult$GrazieFailure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */