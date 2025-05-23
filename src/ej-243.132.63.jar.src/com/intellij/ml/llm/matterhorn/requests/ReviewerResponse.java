/*     */ package com.intellij.ml.llm.matterhorn.requests;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\006\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b6\030\000 \0072\0020\001:\004\004\005\006\007B\t\b\004¢\006\004\b\002\020\003\001\003\b\t\n¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse;", "", "<init>", "()V", "Incomplete", "OK", "Error", "Companion", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse$Error;", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse$Incomplete;", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse$OK;", "core"})
/*     */ public abstract class ReviewerResponse { @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   
/*     */   private ReviewerResponse() {}
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÀ\n\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\023\020\004\032\0020\0052\b\020\006\032\004\030\0010\007HÖ\003J\t\020\b\032\0020\tHÖ\001J\t\020\n\032\0020\013HÖ\001¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse$Incomplete;", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core"})
/*     */   public static final class Incomplete extends ReviewerResponse { @NotNull
/*     */     public static final Incomplete INSTANCE = new Incomplete();
/*     */     
/*  13 */     private Incomplete() { super(null); } @NotNull public String toString() { return "Incomplete"; } public int hashCode() { return -745011904; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Incomplete)) return false;  (Incomplete)other; return true; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÀ\n\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\023\020\004\032\0020\0052\b\020\006\032\004\030\0010\007HÖ\003J\t\020\b\032\0020\tHÖ\001J\t\020\n\032\0020\013HÖ\001¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse$OK;", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "core"}) public static final class OK extends ReviewerResponse { @NotNull public static final OK INSTANCE = new OK();
/*  14 */     private OK() { super(null); } @NotNull public String toString() { return "OK"; } public int hashCode() { return -210842722; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof OK)) return false;  (OK)other; return true; } }
/*  15 */    @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\b\b\000\030\0002\0020\001B\033\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005¢\006\004\b\006\020\007J\b\020\f\032\0020\003H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\n\020\013¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse$Error;", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getMessage", "()Ljava/lang/String;", "getCause", "()Ljava/lang/Throwable;", "toString", "core"}) public static final class Error extends ReviewerResponse { @NotNull private final String message; public Error(@NotNull String message, @Nullable Throwable cause) { super(null); this.message = message; this.cause = cause; } @Nullable private final Throwable cause; @NotNull public final String getMessage() { return this.message; } @Nullable public final Throwable getCause() { return this.cause; } @NotNull
/*  16 */     public String toString() { return this.message; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\003\n\000\n\002\020\016\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007J\032\020\004\032\0020\0052\006\020\b\032\0020\t2\n\b\002\020\006\032\004\030\0010\007J\006\020\n\032\0020\005J\006\020\013\032\0020\005¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse$Companion;", "", "<init>", "()V", "error", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse;", "cause", "", "message", "", "ok", "incomplete", "core"})
/*     */   @SourceDebugExtension({"SMAP\nUserReviewedRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserReviewedRequest.kt\ncom/intellij/ml/llm/matterhorn/requests/ReviewerResponse$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
/*     */   public static final class Companion { private Companion() {} @NotNull
/*     */     public final ReviewerResponse error(@NotNull Throwable cause) { String str;
/*  20 */       Intrinsics.checkNotNullParameter(cause, "cause"); if (cause.getMessage() == null) { cause.getMessage();
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
/* 137 */         int $i$a$-requireNotNull-ReviewerResponse$Companion$error$1 = 0;
/*     */         String str1 = "Exception must contain the message";
/*     */         throw new IllegalArgumentException(str1.toString()); }
/*     */       
/*     */       Throwable throwable = cause;
/*     */       return new ReviewerResponse.Error(str, throwable); }
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final ReviewerResponse error(@NotNull String message, @Nullable Throwable cause) {
/*     */       Intrinsics.checkNotNullParameter(message, "message");
/*     */       return new ReviewerResponse.Error(message, cause);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final ReviewerResponse ok() {
/*     */       return ReviewerResponse.OK.INSTANCE;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final ReviewerResponse incomplete() {
/*     */       return ReviewerResponse.Incomplete.INSTANCE;
/*     */     } }
/*     */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\ReviewerResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */