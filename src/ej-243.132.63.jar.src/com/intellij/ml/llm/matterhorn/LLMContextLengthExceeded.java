/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\004\030\000 \b2\0020\001:\001\bB\033\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005¢\006\004\b\006\020\007¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/LLMContextLengthExceeded;", "Lcom/intellij/ml/llm/matterhorn/LlmException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Companion", "core"})
/*     */ public final class LLMContextLengthExceeded
/*     */   extends LlmException
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   
/*     */   public LLMContextLengthExceeded(@Nullable String message, @Nullable Throwable cause) {
/*  97 */     super(message, cause); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\024\020\004\032\004\030\0010\0052\n\020\006\032\0060\007j\002`\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/LLMContextLengthExceeded$Companion;", "", "<init>", "()V", "fromException", "Lcom/intellij/ml/llm/matterhorn/LLMContextLengthExceeded;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "core"})
/*     */   public static final class Companion { @Nullable
/*     */     public final LLMContextLengthExceeded fromException(@NotNull Exception e) {
/* 100 */       Intrinsics.checkNotNullParameter(e, "e"); if (e instanceof LLMContextLengthExceeded) return (LLMContextLengthExceeded)e; 
/* 101 */       if (e instanceof FailedDependencyException) {
/* 102 */         FailureReason reason = ((FailedDependencyException)e).getArtifact().getReasoning().getReason();
/* 103 */         if (reason instanceof FailureReason.ContextLengthExceeded) return new LLMContextLengthExceeded("The context of this task is too big for AI to process. Please try breaking it into subtasks by creating a couple of new separate tasks.", e); 
/*     */       } 
/* 105 */       return null;
/*     */     }
/*     */     
/*     */     private Companion() {} }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\LLMContextLengthExceeded.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */