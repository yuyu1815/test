/*     */ package com.intellij.ml.llm.matterhorn.requests;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\003\n\000\n\002\020\016\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007J\032\020\004\032\0020\0052\006\020\b\032\0020\t2\n\b\002\020\006\032\004\030\0010\007J\006\020\n\032\0020\005J\006\020\013\032\0020\005¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse$Companion;", "", "<init>", "()V", "error", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse;", "cause", "", "message", "", "ok", "incomplete", "core"})
/*     */ @SourceDebugExtension({"SMAP\nUserReviewedRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserReviewedRequest.kt\ncom/intellij/ml/llm/matterhorn/requests/ReviewerResponse$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @NotNull
/*     */   public final ReviewerResponse error(@NotNull Throwable cause) {
/*     */     String str;
/*  20 */     Intrinsics.checkNotNullParameter(cause, "cause"); if (cause.getMessage() == null) { cause.getMessage();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 137 */       int $i$a$-requireNotNull-ReviewerResponse$Companion$error$1 = 0;
/*     */       String str1 = "Exception must contain the message";
/*     */       throw new IllegalArgumentException(str1.toString()); }
/*     */     
/*     */     Throwable throwable = cause;
/*     */     return new ReviewerResponse.Error(str, throwable);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ReviewerResponse error(@NotNull String message, @Nullable Throwable cause) {
/*     */     Intrinsics.checkNotNullParameter(message, "message");
/*     */     return new ReviewerResponse.Error(message, cause);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ReviewerResponse ok() {
/*     */     return ReviewerResponse.OK.INSTANCE;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ReviewerResponse incomplete() {
/*     */     return ReviewerResponse.Incomplete.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\requests\ReviewerResponse$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */