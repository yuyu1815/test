/*    */ package com.intellij.ml.llm.matterhorn.ej.core.run;
/*    */ 
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÆ\n\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\023\020\004\032\0020\0052\b\020\006\032\004\030\0010\007HÖ\003J\t\020\b\032\0020\tHÖ\001J\t\020\n\032\0020\013HÖ\001¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionError$TimeoutError;", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionError;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ej-core"})
/*    */ public final class TimeoutError
/*    */   extends ExecutionError
/*    */ {
/*    */   @NotNull
/*    */   public static final TimeoutError INSTANCE = new TimeoutError();
/*    */   
/*    */   private TimeoutError() {
/* 24 */     super(null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TimeoutError";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return -1895608072;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TimeoutError))
/*    */       return false; 
/*    */     (TimeoutError)other;
/*    */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\run\ExecutionError$TimeoutError.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */