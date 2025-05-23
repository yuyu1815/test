/*    */ package com.intellij.ml.llm.matterhorn.ej.core.run;
/*    */ 
/*    */ import kotlin.ExceptionsKt;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\005\n\002\020\016\n\000\030\0002\0020\001B\023\022\n\020\002\032\0060\003j\002`\004¢\006\004\b\005\020\006J\b\020\t\032\0020\nH\026R\025\020\002\032\0060\003j\002`\004¢\006\b\n\000\032\004\b\007\020\b¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionError$ExceptionError;", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionError;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "toString", "", "ej-core"})
/*    */ public final class ExceptionError
/*    */   extends ExecutionError
/*    */ {
/*    */   @NotNull
/*    */   private final Exception exception;
/*    */   
/*    */   public ExceptionError(@NotNull Exception exception) {
/* 25 */     super(null); this.exception = exception; } @NotNull public final Exception getException() { return this.exception; } @NotNull
/*    */   public String toString() {
/* 27 */     return ExceptionsKt.stackTraceToString(this.exception);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\run\ExecutionError$ExceptionError.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */