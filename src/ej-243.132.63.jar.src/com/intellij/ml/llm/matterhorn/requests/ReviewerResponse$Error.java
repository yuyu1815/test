/*    */ package com.intellij.ml.llm.matterhorn.requests;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\b\b\000\030\0002\0020\001B\033\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005¢\006\004\b\006\020\007J\b\020\f\032\0020\003H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\n\020\013¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse$Error;", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getMessage", "()Ljava/lang/String;", "getCause", "()Ljava/lang/Throwable;", "toString", "core"})
/*    */ public final class Error extends ReviewerResponse {
/*    */   @NotNull
/*    */   private final String message;
/*    */   @Nullable
/*    */   private final Throwable cause;
/*    */   
/* 15 */   public Error(@NotNull String message, @Nullable Throwable cause) { super(null); this.message = message; this.cause = cause; } @NotNull public final String getMessage() { return this.message; } @Nullable public final Throwable getCause() { return this.cause; } @NotNull
/* 16 */   public String toString() { return this.message; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\ReviewerResponse$Error.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */