/*    */ package com.intellij.ml.llm.matterhorn.activation.data.model.result;
/*    */ 
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\020\003\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\021HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult$Failure$Internal;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult$Failure;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data.model"})
/*    */ public final class Internal implements JbaUserLoginResult.Failure {
/*    */   @NotNull
/*    */   private final Throwable throwable;
/*    */   
/* 11 */   public Internal(@NotNull Throwable throwable) { this.throwable = throwable; } @NotNull public final Throwable getThrowable() { return this.throwable; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Throwable component1() {
/*    */     return this.throwable;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Internal copy(@NotNull Throwable throwable) {
/*    */     Intrinsics.checkNotNullParameter(throwable, "throwable");
/*    */     return new Internal(throwable);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Internal(throwable=" + this.throwable + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.throwable.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Internal))
/*    */       return false; 
/*    */     Internal internal = (Internal)other;
/*    */     return !!Intrinsics.areEqual(this.throwable, internal.throwable);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\result\JbaUserLoginResult$Failure$Internal.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */