/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.login;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\b\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0032\b\020\013\032\004\030\0010\fHÖ\003J\t\020\r\032\0020\016HÖ\001J\t\020\017\032\0020\020HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$Loading;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState;", "showHelp", "", "<init>", "(Z)V", "getShowHelp", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class Loading
/*    */   implements LoginScreenState
/*    */ {
/*    */   private final boolean showHelp;
/*    */   public static final int $stable;
/*    */   
/*    */   public Loading(boolean showHelp) {
/* 35 */     this.showHelp = showHelp; } public final boolean getShowHelp() { return this.showHelp; }
/*    */ 
/*    */   
/*    */   public final boolean component1() {
/*    */     return this.showHelp;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Loading copy(boolean showHelp) {
/*    */     return new Loading(showHelp);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Loading(showHelp=" + this.showHelp + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return Boolean.hashCode(this.showHelp);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Loading))
/*    */       return false; 
/*    */     Loading loading = (Loading)other;
/*    */     return !(this.showHelp != loading.showHelp);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\LoginScreenState$Loading.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */