/*    */ package com.intellij.ml.llm.matterhorn.ej.core.run;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\030\002\n\000\b6\030\0002\0020\001:\002\004\005B\t\b\004¢\006\004\b\002\020\003\001\002\006\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionError;", "", "<init>", "()V", "TimeoutError", "ExceptionError", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionError$ExceptionError;", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionError$TimeoutError;", "ej-core"})
/*    */ public abstract class ExecutionError { private ExecutionError() {}
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÆ\n\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\023\020\004\032\0020\0052\b\020\006\032\004\030\0010\007HÖ\003J\t\020\b\032\0020\tHÖ\001J\t\020\n\032\0020\013HÖ\001¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionError$TimeoutError;", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ej-core"})
/*    */   public static final class TimeoutError extends ExecutionError { @NotNull
/*    */     public static final TimeoutError INSTANCE = new TimeoutError();
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "TimeoutError";
/*    */     }
/*    */     public int hashCode() {
/*    */       return -1895608072;
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof TimeoutError))
/*    */         return false; 
/*    */       (TimeoutError)other;
/*    */       return true;
/*    */     }
/*    */     
/* 24 */     private TimeoutError() { super(null); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\005\n\002\020\016\n\000\030\0002\0020\001B\023\022\n\020\002\032\0060\003j\002`\004¢\006\004\b\005\020\006J\b\020\t\032\0020\nH\026R\025\020\002\032\0060\003j\002`\004¢\006\b\n\000\032\004\b\007\020\b¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionError$ExceptionError;", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionError;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "toString", "", "ej-core"}) public static final class ExceptionError extends ExecutionError { @NotNull
/* 25 */     private final Exception exception; public ExceptionError(@NotNull Exception exception) { super(null); this.exception = exception; } @NotNull public final Exception getException() { return this.exception; } @NotNull
/*    */     public String toString() {
/* 27 */       return ExceptionsKt.stackTraceToString(this.exception);
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\run\ExecutionError.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */