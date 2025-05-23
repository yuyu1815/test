/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\000\n\002\020\016\n\002\b\f\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0032\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\022HÖ\001J\t\020\023\032\0020\005HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/UserAnswerAsExpert;", "", "success", "", "answer", "", "<init>", "(ZLjava/lang/String;)V", "getSuccess", "()Z", "getAnswer", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "ej-core"})
/*    */ public final class UserAnswerAsExpert
/*    */ {
/*    */   private final boolean success;
/*    */   @NotNull
/*    */   private final String answer;
/*    */   
/*    */   public UserAnswerAsExpert(boolean success, @NotNull String answer) {
/* 17 */     this.success = success; this.answer = answer; } public final boolean getSuccess() { return this.success; } @NotNull public final String getAnswer() { return this.answer; }
/*    */ 
/*    */   
/*    */   public final boolean component1() {
/*    */     return this.success;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.answer;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final UserAnswerAsExpert copy(boolean success, @NotNull String answer) {
/*    */     Intrinsics.checkNotNullParameter(answer, "answer");
/*    */     return new UserAnswerAsExpert(success, answer);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "UserAnswerAsExpert(success=" + this.success + ", answer=" + this.answer + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Boolean.hashCode(this.success);
/*    */     return result * 31 + this.answer.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof UserAnswerAsExpert))
/*    */       return false; 
/*    */     UserAnswerAsExpert userAnswerAsExpert = (UserAnswerAsExpert)other;
/*    */     return (this.success != userAnswerAsExpert.success) ? false : (!!Intrinsics.areEqual(this.answer, userAnswerAsExpert.answer));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\UserAnswerAsExpert.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */