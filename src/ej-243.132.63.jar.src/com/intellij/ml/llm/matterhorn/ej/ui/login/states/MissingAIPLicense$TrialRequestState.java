/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.login.states;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\013\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001:\t\004\005\006\007\b\t\n\013\fB\t\b\004¢\006\004\b\002\020\003\001\t\r\016\017\020\021\022\023\024\025¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState;", "", "<init>", "()V", "NotRequested", "Progress", "RequestFailedAndCanTryAgain", "TrialDenied", "TrialMaxCountExceeded", "TrialNoLinkedPaymentMethod", "CountryUnknown", "CountryRestricted", "Error", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$CountryRestricted;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$CountryUnknown;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$NotRequested;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$Progress;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$RequestFailedAndCanTryAgain;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$TrialDenied;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$TrialMaxCountExceeded;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$TrialNoLinkedPaymentMethod;", "ej-ui"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public abstract class TrialRequestState
/*     */ {
/*     */   public static final int $stable;
/*     */   
/*     */   private TrialRequestState() {}
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$NotRequested;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState;", "<init>", "()V", "ej-ui"})
/*     */   @StabilityInferred(parameters = 1)
/*     */   public static final class NotRequested
/*     */     extends TrialRequestState
/*     */   {
/*     */     @NotNull
/*     */     public static final NotRequested INSTANCE = new NotRequested();
/*     */     public static final int $stable;
/*     */     
/*     */     private NotRequested() {
/* 195 */       super(null); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$Progress;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState;", "<init>", "()V", "ej-ui"}) @StabilityInferred(parameters = 1)
/*     */   public static final class Progress extends TrialRequestState { @NotNull
/* 197 */     public static final Progress INSTANCE = new Progress(); public static final int $stable; private Progress() { super(null); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$RequestFailedAndCanTryAgain;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-ui"}) @StabilityInferred(parameters = 1)
/*     */   public static final class RequestFailedAndCanTryAgain extends TrialRequestState { @NotNull
/* 199 */     private final String reason; public static final int $stable; public RequestFailedAndCanTryAgain(@NotNull String reason) { super(null); this.reason = reason; } @NotNull public final String component1() { return this.reason; } @NotNull public final RequestFailedAndCanTryAgain copy(@NotNull String reason) { Intrinsics.checkNotNullParameter(reason, "reason"); return new RequestFailedAndCanTryAgain(reason); } @NotNull public String toString() { return "RequestFailedAndCanTryAgain(reason=" + this.reason + ")"; } @NotNull public final String getReason() { return this.reason; } public int hashCode() { return this.reason.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof RequestFailedAndCanTryAgain)) return false;  RequestFailedAndCanTryAgain requestFailedAndCanTryAgain = (RequestFailedAndCanTryAgain)other; return !!Intrinsics.areEqual(this.reason, requestFailedAndCanTryAgain.reason); } }
/*     */    @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$TrialDenied;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-ui"}) @StabilityInferred(parameters = 1) public static final class TrialDenied extends TrialRequestState {
/* 201 */     @NotNull private final String reason; public static final int $stable; public TrialDenied(@NotNull String reason) { super(null); this.reason = reason; } @NotNull public final String component1() { return this.reason; } @NotNull public final TrialDenied copy(@NotNull String reason) { Intrinsics.checkNotNullParameter(reason, "reason"); return new TrialDenied(reason); } @NotNull public String toString() { return "TrialDenied(reason=" + this.reason + ")"; } @NotNull public final String getReason() { return this.reason; } public int hashCode() { return this.reason.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof TrialDenied)) return false;  TrialDenied trialDenied = (TrialDenied)other; return !!Intrinsics.areEqual(this.reason, trialDenied.reason); } }
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$TrialMaxCountExceeded;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState;", "<init>", "()V", "ej-ui"}) @StabilityInferred(parameters = 1) public static final class TrialMaxCountExceeded extends TrialRequestState { @NotNull public static final TrialMaxCountExceeded INSTANCE = new TrialMaxCountExceeded(); public static final int $stable;
/* 203 */     private TrialMaxCountExceeded() { super(null); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$TrialNoLinkedPaymentMethod;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState;", "<init>", "()V", "ej-ui"}) @StabilityInferred(parameters = 1)
/*     */   public static final class TrialNoLinkedPaymentMethod extends TrialRequestState { @NotNull
/* 205 */     public static final TrialNoLinkedPaymentMethod INSTANCE = new TrialNoLinkedPaymentMethod(); public static final int $stable; private TrialNoLinkedPaymentMethod() { super(null); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$CountryUnknown;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState;", "<init>", "()V", "ej-ui"}) @StabilityInferred(parameters = 1)
/*     */   public static final class CountryUnknown extends TrialRequestState { @NotNull
/* 207 */     public static final CountryUnknown INSTANCE = new CountryUnknown(); public static final int $stable; private CountryUnknown() { super(null); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$CountryRestricted;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState;", "<init>", "()V", "ej-ui"}) @StabilityInferred(parameters = 1)
/*     */   public static final class CountryRestricted extends TrialRequestState { @NotNull
/* 209 */     public static final CountryRestricted INSTANCE = new CountryRestricted(); public static final int $stable; private CountryRestricted() { super(null); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-ui"}) @StabilityInferred(parameters = 1)
/*     */   public static final class Error extends TrialRequestState { @NotNull
/* 211 */     private final String message; public static final int $stable; public Error(@NotNull String message) { super(null); this.message = message; } @NotNull public final String getMessage() { return this.message; }
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final String component1() {
/*     */       return this.message;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Error copy(@NotNull String message) {
/*     */       Intrinsics.checkNotNullParameter(message, "message");
/*     */       return new Error(message);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "Error(message=" + this.message + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       return this.message.hashCode();
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof Error))
/*     */         return false; 
/*     */       Error error = (Error)other;
/*     */       return !!Intrinsics.areEqual(this.message, error.message);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\states\MissingAIPLicense$TrialRequestState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */