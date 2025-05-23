/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.login;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.ErrorInfo;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\023\022\n\b\002\020\002\032\004\030\0010\003¢\006\004\b\004\020\005J\013\020\b\032\004\030\0010\003HÆ\003J\025\020\t\032\0020\0002\n\b\002\020\002\032\004\030\0010\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\021HÖ\001R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\006\020\007¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$Idle;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState;", "errorInfo", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;)V", "getErrorInfo", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class Idle
/*    */   implements LoginScreenState
/*    */ {
/*    */   @Nullable
/*    */   private final ErrorInfo errorInfo;
/*    */   public static final int $stable;
/*    */   
/*    */   public Idle(@Nullable ErrorInfo errorInfo) {
/* 29 */     this.errorInfo = errorInfo; } @Nullable public final ErrorInfo getErrorInfo() { return this.errorInfo; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final ErrorInfo component1() {
/*    */     return this.errorInfo;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Idle copy(@Nullable ErrorInfo errorInfo) {
/*    */     return new Idle(errorInfo);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Idle(errorInfo=" + this.errorInfo + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return (this.errorInfo == null) ? 0 : this.errorInfo.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Idle))
/*    */       return false; 
/*    */     Idle idle = (Idle)other;
/*    */     return !!Intrinsics.areEqual(this.errorInfo, idle.errorInfo);
/*    */   }
/*    */   
/*    */   public Idle() {
/*    */     this(null, 1, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\LoginScreenState$Idle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */