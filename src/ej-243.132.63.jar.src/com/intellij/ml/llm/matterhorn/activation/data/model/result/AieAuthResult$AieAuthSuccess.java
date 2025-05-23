/*   */ package com.intellij.ml.llm.matterhorn.activation.data.model.result;
/*   */ 
/*   */ import com.intellij.ml.llm.matterhorn.activation.data.model.GrazieAuthData;
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\021HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AieAuthResult$AieAuthSuccess;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AieAuthResult;", "authData", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;)V", "getAuthData", "()Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data.model"})
/*   */ public final class AieAuthSuccess implements AieAuthResult {
/* 8 */   public AieAuthSuccess(@NotNull GrazieAuthData authData) { this.authData = authData; } @NotNull private final GrazieAuthData authData; @NotNull public final GrazieAuthData getAuthData() { return this.authData; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   public final GrazieAuthData component1() {
/*   */     return this.authData;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final AieAuthSuccess copy(@NotNull GrazieAuthData authData) {
/*   */     Intrinsics.checkNotNullParameter(authData, "authData");
/*   */     return new AieAuthSuccess(authData);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "AieAuthSuccess(authData=" + this.authData + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     return this.authData.hashCode();
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof AieAuthSuccess))
/*   */       return false; 
/*   */     AieAuthSuccess aieAuthSuccess = (AieAuthSuccess)other;
/*   */     return !!Intrinsics.areEqual(this.authData, aieAuthSuccess.authData);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\result\AieAuthResult$AieAuthSuccess.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */