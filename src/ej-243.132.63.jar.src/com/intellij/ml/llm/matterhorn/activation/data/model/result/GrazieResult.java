/*   */ package com.intellij.ml.llm.matterhorn.activation.data.model.result;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\bv\030\000*\006\b\000\020\001 \0012\0020\002:\002\003\004\001\002\005\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;", "T", "", "GrazieSuccess", "GrazieFailure", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieSuccess;", "data.model"})
/*   */ public interface GrazieResult<T> { @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\000*\004\b\001\020\0012\b\022\004\022\002H\0010\002B\017\022\006\020\003\032\0028\001¢\006\004\b\004\020\005J\016\020\t\032\0028\001HÆ\003¢\006\002\020\007J\036\020\n\032\b\022\004\022\0028\0010\0002\b\b\002\020\003\032\0028\001HÆ\001¢\006\002\020\013J\023\020\f\032\0020\r2\b\020\016\032\004\030\0010\017HÖ\003J\t\020\020\032\0020\021HÖ\001J\t\020\022\032\0020\023HÖ\001R\023\020\003\032\0028\001¢\006\n\n\002\020\b\032\004\b\006\020\007¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieSuccess;", "T", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieSuccess;", "equals", "", "other", "", "hashCode", "", "toString", "", "data.model"})
/*   */   public static final class GrazieSuccess<T> implements GrazieResult<T> { private final T value;
/*   */     
/* 5 */     public GrazieSuccess(Object value) { this.value = (T)value; } public final T component1() { return this.value; } @NotNull public final GrazieSuccess<T> copy(Object value) { return new GrazieSuccess((T)value); } @NotNull public String toString() { return "GrazieSuccess(value=" + this.value + ")"; } public final T getValue() { return this.value; } public int hashCode() { return (this.value == null) ? 0 : this.value.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof GrazieSuccess)) return false;  GrazieSuccess grazieSuccess = (GrazieSuccess)other; return !!Intrinsics.areEqual(this.value, grazieSuccess.value); } }
/* 6 */    @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\020\001\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\013\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\b\b\030\0002\b\022\004\022\0020\0020\001B\027\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006¢\006\004\b\007\020\bJ\b\020\r\032\0020\006H\026J\t\020\016\032\0020\004HÆ\003J\t\020\017\032\0020\006HÆ\003J\035\020\020\032\0020\0002\b\b\002\020\003\032\0020\0042\b\b\002\020\005\032\0020\006HÆ\001J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\024HÖ\003J\t\020\025\032\0020\026HÖ\001R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\013\020\f¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;", "", "httpError", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;", "errorMessage", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;Ljava/lang/String;)V", "getHttpError", "()Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;", "getErrorMessage", "()Ljava/lang/String;", "toString", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "data.model"}) public static final class GrazieFailure implements GrazieResult { @NotNull private final GrazieHttpError httpError; @NotNull private final String errorMessage; public GrazieFailure(@NotNull GrazieHttpError httpError, @NotNull String errorMessage) { this.httpError = httpError; this.errorMessage = errorMessage; } @NotNull public final GrazieHttpError getHttpError() { return this.httpError; } @NotNull public final String getErrorMessage() { return this.errorMessage; } @NotNull
/* 7 */     public String toString() { if (GrazieHttpErrorKt.getGrazieTraceId(this.httpError) == null) GrazieHttpErrorKt.getGrazieTraceId(this.httpError);  return "[Grazie-Trace-Id: " + "<unknown>" + "] " + this.httpError + ": " + this.errorMessage; }
/*   */ 
/*   */     
/*   */     @NotNull
/*   */     public final GrazieHttpError component1() {
/*   */       return this.httpError;
/*   */     }
/*   */     
/*   */     @NotNull
/*   */     public final String component2() {
/*   */       return this.errorMessage;
/*   */     }
/*   */     
/*   */     @NotNull
/*   */     public final GrazieFailure copy(@NotNull GrazieHttpError httpError, @NotNull String errorMessage) {
/*   */       Intrinsics.checkNotNullParameter(httpError, "httpError");
/*   */       Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
/*   */       return new GrazieFailure(httpError, errorMessage);
/*   */     }
/*   */     
/*   */     public int hashCode() {
/*   */       result = this.httpError.hashCode();
/*   */       return result * 31 + this.errorMessage.hashCode();
/*   */     }
/*   */     
/*   */     public boolean equals(@Nullable Object other) {
/*   */       if (this == other)
/*   */         return true; 
/*   */       if (!(other instanceof GrazieFailure))
/*   */         return false; 
/*   */       GrazieFailure grazieFailure = (GrazieFailure)other;
/*   */       return !Intrinsics.areEqual(this.httpError, grazieFailure.httpError) ? false : (!!Intrinsics.areEqual(this.errorMessage, grazieFailure.errorMessage));
/*   */     } }
/*   */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\result\GrazieResult.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */