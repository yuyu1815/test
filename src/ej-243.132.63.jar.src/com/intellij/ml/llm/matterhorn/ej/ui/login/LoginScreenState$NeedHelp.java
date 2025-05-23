/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.login;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import io.ktor.http.Url;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.flow.Flow;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B#\022\f\020\002\032\b\022\004\022\0020\0040\003\022\f\020\005\032\b\022\004\022\0020\0070\006¢\006\004\b\b\020\tJ\017\020\016\032\b\022\004\022\0020\0040\003HÆ\003J\017\020\017\032\b\022\004\022\0020\0070\006HÆ\003J)\020\020\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\0032\016\b\002\020\005\032\b\022\004\022\0020\0070\006HÆ\001J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\024HÖ\003J\t\020\025\032\0020\026HÖ\001J\t\020\027\032\0020\030HÖ\001R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\n\020\013R\027\020\005\032\b\022\004\022\0020\0070\006¢\006\b\n\000\032\004\b\f\020\r¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$NeedHelp;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState;", "loginLink", "Lkotlinx/coroutines/flow/Flow;", "Lio/ktor/http/Url;", "shareFeedbackAction", "Lkotlin/Function0;", "", "<init>", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;)V", "getLoginLink", "()Lkotlinx/coroutines/flow/Flow;", "getShareFeedbackAction", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class NeedHelp
/*    */   implements LoginScreenState
/*    */ {
/*    */   @NotNull
/*    */   private final Flow<Url> loginLink;
/*    */   @NotNull
/*    */   private final Function0<Unit> shareFeedbackAction;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public NeedHelp(@NotNull Flow<Url> loginLink, @NotNull Function0<Unit> shareFeedbackAction) {
/* 31 */     this.loginLink = loginLink;
/* 32 */     this.shareFeedbackAction = shareFeedbackAction; } @NotNull public final Function0<Unit> getShareFeedbackAction() { return this.shareFeedbackAction; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Flow<Url> getLoginLink() {
/*    */     return this.loginLink;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Flow<Url> component1() {
/*    */     return this.loginLink;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Function0<Unit> component2() {
/*    */     return this.shareFeedbackAction;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final NeedHelp copy(@NotNull Flow<Url> loginLink, @NotNull Function0<Unit> shareFeedbackAction) {
/*    */     Intrinsics.checkNotNullParameter(loginLink, "loginLink");
/*    */     Intrinsics.checkNotNullParameter(shareFeedbackAction, "shareFeedbackAction");
/*    */     return new NeedHelp(loginLink, shareFeedbackAction);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "NeedHelp(loginLink=" + this.loginLink + ", shareFeedbackAction=" + this.shareFeedbackAction + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.loginLink.hashCode();
/*    */     return result * 31 + this.shareFeedbackAction.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof NeedHelp))
/*    */       return false; 
/*    */     NeedHelp needHelp = (NeedHelp)other;
/*    */     return !Intrinsics.areEqual(this.loginLink, needHelp.loginLink) ? false : (!!Intrinsics.areEqual(this.shareFeedbackAction, needHelp.shareFeedbackAction));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\LoginScreenState$NeedHelp.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */