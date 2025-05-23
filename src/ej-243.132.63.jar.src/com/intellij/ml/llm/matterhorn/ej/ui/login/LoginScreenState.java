/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.login;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.ErrorInfo;
/*    */ import io.ktor.http.Url;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.flow.Flow;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\005\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bv\030\0002\0020\001:\005\002\003\004\005\006\001\005\007\b\t\n\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState;", "", "Idle", "NeedHelp", "Loading", "LoginSuccessWithLicense", "LoginSuccessNoLicense", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$Idle;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$Loading;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$LoginSuccessNoLicense;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$LoginSuccessWithLicense;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$NeedHelp;", "ej-ui"})
/*    */ public interface LoginScreenState
/*    */ {
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\023\022\n\b\002\020\002\032\004\030\0010\003¢\006\004\b\004\020\005J\013\020\b\032\004\030\0010\003HÆ\003J\025\020\t\032\0020\0002\n\b\002\020\002\032\004\030\0010\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\021HÖ\001R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\006\020\007¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$Idle;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState;", "errorInfo", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;)V", "getErrorInfo", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/ErrorInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ej-ui"})
/*    */   @StabilityInferred(parameters = 1)
/*    */   public static final class Idle
/*    */     implements LoginScreenState
/*    */   {
/*    */     @Nullable
/*    */     private final ErrorInfo errorInfo;
/*    */     public static final int $stable;
/*    */     
/*    */     public Idle(@Nullable ErrorInfo errorInfo) {
/* 29 */       this.errorInfo = errorInfo; } @Nullable public final ErrorInfo getErrorInfo() { return this.errorInfo; } @Nullable public final ErrorInfo component1() { return this.errorInfo; } @NotNull public final Idle copy(@Nullable ErrorInfo errorInfo) { return new Idle(errorInfo); } @NotNull public String toString() { return "Idle(errorInfo=" + this.errorInfo + ")"; } public int hashCode() { return (this.errorInfo == null) ? 0 : this.errorInfo.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Idle)) return false;  Idle idle = (Idle)other; return !!Intrinsics.areEqual(this.errorInfo, idle.errorInfo); } public Idle() { this(null, 1, null); } }
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B#\022\f\020\002\032\b\022\004\022\0020\0040\003\022\f\020\005\032\b\022\004\022\0020\0070\006¢\006\004\b\b\020\tJ\017\020\016\032\b\022\004\022\0020\0040\003HÆ\003J\017\020\017\032\b\022\004\022\0020\0070\006HÆ\003J)\020\020\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\0032\016\b\002\020\005\032\b\022\004\022\0020\0070\006HÆ\001J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\024HÖ\003J\t\020\025\032\0020\026HÖ\001J\t\020\027\032\0020\030HÖ\001R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\n\020\013R\027\020\005\032\b\022\004\022\0020\0070\006¢\006\b\n\000\032\004\b\f\020\r¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$NeedHelp;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState;", "loginLink", "Lkotlinx/coroutines/flow/Flow;", "Lio/ktor/http/Url;", "shareFeedbackAction", "Lkotlin/Function0;", "", "<init>", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;)V", "getLoginLink", "()Lkotlinx/coroutines/flow/Flow;", "getShareFeedbackAction", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ej-ui"}) @StabilityInferred(parameters = 0) public static final class NeedHelp implements LoginScreenState { @NotNull private final Flow<Url> loginLink; @NotNull private final Function0<Unit> shareFeedbackAction; public static final int $stable = 8;
/* 31 */     public NeedHelp(@NotNull Flow<Url> loginLink, @NotNull Function0<Unit> shareFeedbackAction) { this.loginLink = loginLink;
/* 32 */       this.shareFeedbackAction = shareFeedbackAction; } @NotNull public final Flow<Url> getLoginLink() { return this.loginLink; } @NotNull public final Function0<Unit> getShareFeedbackAction() { return this.shareFeedbackAction; } @NotNull public final Flow<Url> component1() { return this.loginLink; } @NotNull public final Function0<Unit> component2() { return this.shareFeedbackAction; } @NotNull public final NeedHelp copy(@NotNull Flow<Url> loginLink, @NotNull Function0<Unit> shareFeedbackAction) { Intrinsics.checkNotNullParameter(loginLink, "loginLink"); Intrinsics.checkNotNullParameter(shareFeedbackAction, "shareFeedbackAction"); return new NeedHelp(loginLink, shareFeedbackAction); } @NotNull public String toString() { return "NeedHelp(loginLink=" + this.loginLink + ", shareFeedbackAction=" + this.shareFeedbackAction + ")"; } public int hashCode() { result = this.loginLink.hashCode(); return result * 31 + this.shareFeedbackAction.hashCode(); }
/*    */     public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof NeedHelp)) return false;  NeedHelp needHelp = (NeedHelp)other; return !Intrinsics.areEqual(this.loginLink, needHelp.loginLink) ? false : (!!Intrinsics.areEqual(this.shareFeedbackAction, needHelp.shareFeedbackAction)); } }
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\b\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0032\b\020\013\032\004\030\0010\fHÖ\003J\t\020\r\032\0020\016HÖ\001J\t\020\017\032\0020\020HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$Loading;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState;", "showHelp", "", "<init>", "(Z)V", "getShowHelp", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "ej-ui"}) @StabilityInferred(parameters = 1) public static final class Loading implements LoginScreenState { private final boolean showHelp; public static final int $stable;
/* 35 */     public Loading(boolean showHelp) { this.showHelp = showHelp; } public final boolean component1() { return this.showHelp; } @NotNull public final Loading copy(boolean showHelp) { return new Loading(showHelp); } @NotNull public String toString() { return "Loading(showHelp=" + this.showHelp + ")"; } public final boolean getShowHelp() { return this.showHelp; } public int hashCode() { return Boolean.hashCode(this.showHelp); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Loading)) return false;  Loading loading = (Loading)other; return !(this.showHelp != loading.showHelp); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÇ\n\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\023\020\004\032\0020\0052\b\020\006\032\004\030\0010\007HÖ\003J\t\020\b\032\0020\tHÖ\001J\t\020\n\032\0020\013HÖ\001¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$LoginSuccessWithLicense;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ej-ui"}) @StabilityInferred(parameters = 1) public static final class LoginSuccessWithLicense implements LoginScreenState {
/*    */     @NotNull public static final LoginSuccessWithLicense INSTANCE = new LoginSuccessWithLicense(); public static final int $stable; @NotNull public String toString() { return "LoginSuccessWithLicense"; } public int hashCode() { return -1744077751; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof LoginSuccessWithLicense)) return false;  (LoginSuccessWithLicense)other; return true; }
/*    */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\021\022\b\020\002\032\004\030\0010\003¢\006\004\b\004\020\005J\013\020\b\032\004\030\0010\003HÆ\003J\025\020\t\032\0020\0002\n\b\002\020\002\032\004\030\0010\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState$LoginSuccessNoLicense;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState;", "username", "", "<init>", "(Ljava/lang/String;)V", "getUsername", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-ui"}) @StabilityInferred(parameters = 1) public static final class LoginSuccessNoLicense implements LoginScreenState {
/* 38 */     @Nullable private final String username; public static final int $stable; public LoginSuccessNoLicense(@Nullable String username) { this.username = username; } @Nullable public final String getUsername() { return this.username; }
/*    */ 
/*    */     
/*    */     @Nullable
/*    */     public final String component1() {
/*    */       return this.username;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final LoginSuccessNoLicense copy(@Nullable String username) {
/*    */       return new LoginSuccessNoLicense(username);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "LoginSuccessNoLicense(username=" + this.username + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return (this.username == null) ? 0 : this.username.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof LoginSuccessNoLicense))
/*    */         return false; 
/*    */       LoginSuccessNoLicense loginSuccessNoLicense = (LoginSuccessNoLicense)other;
/*    */       return !!Intrinsics.areEqual(this.username, loginSuccessNoLicense.username);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\LoginScreenState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */