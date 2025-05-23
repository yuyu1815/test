/*    */ package com.intellij.ml.llm.matterhorn.activation.state.model;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\005\n\002\030\002\n\002\030\002\n\000\b6\030\000 \b*\006\b\000\020\001 \001*\006\b\001\020\002 \0012\0020\003:\003\006\007\bB\t\b\004¢\006\004\b\004\020\005\001\002\t\n¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;", "Err", "Val", "", "<init>", "()V", "OpTerminated", "OpCompleted", "Companion", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated;", "state.model"}) public abstract class OpResult<Err, Val> { @NotNull public static final Companion Companion = new Companion(null); private OpResult() {} @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\002\020\001\n\000\n\002\020\003\n\002\b\005\n\002\020\016\n\002\b\004\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\005\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b6\030\000 \0302\016\022\004\022\0020\002\022\004\022\0020\0020\001:\005\024\025\026\027\030B\021\b\004\022\006\020\003\032\0020\004¢\006\004\b\005\020\006J\b\020\r\032\0020\nH\026J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021H\002J\b\020\022\032\0020\023H\026R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\007\020\bR\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\013\020\f\001\004\031\032\033\034¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;", "", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "message", "", "getMessage", "()Ljava/lang/String;", "toString", "equals", "", "other", "", "hashCode", "", "OpCancellation", "OpTimeout", "OpNetworkFailure", "OpUnhandledException", "Companion", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpCancellation;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpNetworkFailure;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpTimeout;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpUnhandledException;", "state.model"})
/*    */   public static abstract class OpTerminated extends OpResult { @NotNull
/*    */     public static final Companion Companion = new Companion(null); @NotNull
/*    */     private final Throwable cause; @NotNull
/*  5 */     private final String message; private OpTerminated(Throwable cause) { super(null); this.cause = cause;
/*  6 */       if (this.cause.getMessage() == null) { this.cause.getMessage(); Intrinsics.checkNotNullExpressionValue(this.cause.getClass().getSimpleName(), "getSimpleName(...)"); }  ((OpTerminated)this.cause.getMessage()).message = this.cause.getClass().getSimpleName(); } @NotNull public final Throwable getCause() { return this.cause; } @NotNull public final String getMessage() { return this.message; }
/*    */ 
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\003\n\002\b\003\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpCancellation;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "state.model"})
/*    */     public static final class OpCancellation
/*    */       extends OpTerminated {
/*    */       public OpCancellation(@NotNull Throwable cause) {
/* 13 */         super(cause, null);
/*    */       } }
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\003\n\002\b\003\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpTimeout;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "state.model"})
/*    */     public static final class OpTimeout extends OpTerminated {
/*    */       public OpTimeout(@NotNull Throwable cause) {
/* 19 */         super(cause, null);
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\003\n\002\b\003\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpNetworkFailure;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "state.model"})
/*    */     public static final class OpNetworkFailure extends OpTerminated {
/*    */       public OpNetworkFailure(@NotNull Throwable cause) {
/* 26 */         super(cause, null);
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\003\n\002\b\003\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpUnhandledException;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "state.model"})
/*    */     public static final class OpUnhandledException extends OpTerminated {
/* 32 */       public OpUnhandledException(@NotNull Throwable cause) { super(cause, null); } }
/*    */     @NotNull
/* 34 */     public String toString() { return getClass().getSimpleName() + "(" + getClass().getSimpleName() + ")"; }
/* 35 */     public boolean equals(@Nullable Object other) { if (Intrinsics.areEqual((other != null) ? other.getClass() : null, getClass())) { (other instanceof OpTerminated) ? other : null; if (Intrinsics.areEqual((((other instanceof OpTerminated) ? other : null) != null) ? ((OpTerminated)((other instanceof OpTerminated) ? other : null)).cause : null, this.cause)); }  return false; } public int hashCode() {
/* 36 */       return this.cause.hashCode();
/*    */     } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$Companion;", "", "<init>", "()V", "state.model"})
/*    */     public static final class Companion {
/*    */       private Companion() {} } }
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\000\b6\030\000*\006\b\002\020\001 \001*\006\b\003\020\002 \0012\016\022\004\022\002H\001\022\004\022\002H\0020\003:\002\006\007B\t\b\004¢\006\004\b\004\020\005\001\002\b\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted;", "Err", "Val", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;", "<init>", "()V", "OpFailed", "OpSucceeded", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted$OpFailed;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted$OpSucceeded;", "state.model"})
/* 41 */   public static abstract class OpCompleted<Err, Val> extends OpResult<Err, Val> { private OpCompleted() { super(null); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\000\n\002\030\002\n\002\020\001\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\000*\006\b\004\020\001 \0012\016\022\004\022\002H\001\022\004\022\0020\0030\002B\017\022\006\020\004\032\0028\004¢\006\004\b\005\020\006J\016\020\n\032\0028\004HÆ\003¢\006\002\020\bJ\036\020\013\032\b\022\004\022\0028\0040\0002\b\b\002\020\004\032\0028\004HÆ\001¢\006\002\020\fJ\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\020HÖ\003J\t\020\021\032\0020\022HÖ\001J\t\020\023\032\0020\024HÖ\001R\023\020\004\032\0028\004¢\006\n\n\002\020\t\032\004\b\007\020\b¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted$OpFailed;", "Err", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted;", "", "failure", "<init>", "(Ljava/lang/Object;)V", "getFailure", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted$OpFailed;", "equals", "", "other", "", "hashCode", "", "toString", "", "state.model"})
/* 42 */     public static final class OpFailed<Err> extends OpCompleted { private final Err failure; public OpFailed(Object failure) { super(null); this.failure = (Err)failure; } public final Err getFailure() { return this.failure; } public final Err component1() { return this.failure; } @NotNull public final OpFailed<Err> copy(Object failure) { return new OpFailed((Err)failure); } @NotNull public String toString() { return "OpFailed(failure=" + this.failure + ")"; } public int hashCode() { return (this.failure == null) ? 0 : this.failure.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof OpFailed)) return false;  OpFailed opFailed = (OpFailed)other; return !!Intrinsics.areEqual(this.failure, opFailed.failure); } }
/* 43 */      @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\000\n\002\030\002\n\002\020\001\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\000*\006\b\004\020\001 \0012\016\022\004\022\0020\003\022\004\022\002H\0010\002B\017\022\006\020\004\032\0028\004¢\006\004\b\005\020\006J\016\020\n\032\0028\004HÆ\003¢\006\002\020\bJ\036\020\013\032\b\022\004\022\0028\0040\0002\b\b\002\020\004\032\0028\004HÆ\001¢\006\002\020\fJ\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\020HÖ\003J\t\020\021\032\0020\022HÖ\001J\t\020\023\032\0020\024HÖ\001R\023\020\004\032\0028\004¢\006\n\n\002\020\t\032\004\b\007\020\b¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted$OpSucceeded;", "Val", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted;", "", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted$OpSucceeded;", "equals", "", "other", "", "hashCode", "", "toString", "", "state.model"}) public static final class OpSucceeded<Val> extends OpCompleted { public OpSucceeded(Object value) { super(null); this.value = (Val)value; } private final Val value; public final Val getValue() { return this.value; }
/*    */ 
/*    */       
/*    */       public final Val component1() {
/*    */         return this.value;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final OpSucceeded<Val> copy(Object value) {
/*    */         return new OpSucceeded((Val)value);
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public String toString() {
/*    */         return "OpSucceeded(value=" + this.value + ")";
/*    */       }
/*    */       
/*    */       public int hashCode() {
/*    */         return (this.value == null) ? 0 : this.value.hashCode();
/*    */       }
/*    */       
/*    */       public boolean equals(@Nullable Object other) {
/*    */         if (this == other)
/*    */           return true; 
/*    */         if (!(other instanceof OpSucceeded))
/*    */           return false; 
/*    */         OpSucceeded opSucceeded = (OpSucceeded)other;
/*    */         return !!Intrinsics.areEqual(this.value, opSucceeded.value);
/*    */       } }
/*    */      }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$Companion;", "", "<init>", "()V", "state.model"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\OpResult.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */