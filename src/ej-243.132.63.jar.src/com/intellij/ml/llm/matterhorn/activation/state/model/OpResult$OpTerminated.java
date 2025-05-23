/*    */ package com.intellij.ml.llm.matterhorn.activation.state.model;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\020\001\n\000\n\002\020\003\n\002\b\005\n\002\020\016\n\002\b\004\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\005\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b6\030\000 \0302\016\022\004\022\0020\002\022\004\022\0020\0020\001:\005\024\025\026\027\030B\021\b\004\022\006\020\003\032\0020\004¢\006\004\b\005\020\006J\b\020\r\032\0020\nH\026J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021H\002J\b\020\022\032\0020\023H\026R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\007\020\bR\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\013\020\f\001\004\031\032\033\034¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;", "", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "message", "", "getMessage", "()Ljava/lang/String;", "toString", "equals", "", "other", "", "hashCode", "", "OpCancellation", "OpTimeout", "OpNetworkFailure", "OpUnhandledException", "Companion", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpCancellation;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpNetworkFailure;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpTimeout;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpUnhandledException;", "state.model"})
/*    */ public abstract class OpTerminated extends OpResult { @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*  5 */   private OpTerminated(Throwable cause) { super(null); this.cause = cause;
/*  6 */     if (this.cause.getMessage() == null) { this.cause.getMessage(); Intrinsics.checkNotNullExpressionValue(this.cause.getClass().getSimpleName(), "getSimpleName(...)"); }  ((OpTerminated)this.cause.getMessage()).message = this.cause.getClass().getSimpleName(); } @NotNull private final Throwable cause; @NotNull private final String message; @NotNull public final Throwable getCause() { return this.cause; } @NotNull public final String getMessage() { return this.message; }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\003\n\002\b\003\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpCancellation;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "state.model"})
/*    */   public static final class OpCancellation
/*    */     extends OpTerminated {
/*    */     public OpCancellation(@NotNull Throwable cause) {
/* 13 */       super(cause, null);
/*    */     } }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\003\n\002\b\003\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpTimeout;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "state.model"})
/*    */   public static final class OpTimeout extends OpTerminated {
/*    */     public OpTimeout(@NotNull Throwable cause) {
/* 19 */       super(cause, null);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\003\n\002\b\003\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpNetworkFailure;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "state.model"})
/*    */   public static final class OpNetworkFailure extends OpTerminated {
/*    */     public OpNetworkFailure(@NotNull Throwable cause) {
/* 26 */       super(cause, null);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\003\n\002\b\003\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpUnhandledException;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "state.model"})
/*    */   public static final class OpUnhandledException extends OpTerminated {
/* 32 */     public OpUnhandledException(@NotNull Throwable cause) { super(cause, null); } }
/*    */   @NotNull
/* 34 */   public String toString() { return getClass().getSimpleName() + "(" + getClass().getSimpleName() + ")"; }
/* 35 */   public boolean equals(@Nullable Object other) { if (Intrinsics.areEqual((other != null) ? other.getClass() : null, getClass())) { (other instanceof OpTerminated) ? other : null; if (Intrinsics.areEqual((((other instanceof OpTerminated) ? other : null) != null) ? ((OpTerminated)((other instanceof OpTerminated) ? other : null)).cause : null, this.cause)); }  return false; } public int hashCode() {
/* 36 */     return this.cause.hashCode();
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$Companion;", "", "<init>", "()V", "state.model"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\OpResult$OpTerminated.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */