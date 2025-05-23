/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\004\030\000 \0072\0020\001:\001\007B\027\022\016\020\002\032\n\030\0010\003j\004\030\001`\004¢\006\004\b\005\020\006¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/LLMPaymentRequiredException;", "Lcom/intellij/ml/llm/matterhorn/LlmException;", "cause", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "(Ljava/lang/RuntimeException;)V", "Companion", "core"})
/*    */ public final class LLMPaymentRequiredException
/*    */   extends LlmException
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   public LLMPaymentRequiredException(@Nullable RuntimeException cause) {
/* 68 */     super("Insufficient Account Balance. All tokens on your balance are spent.", cause);
/*    */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\024\020\004\032\004\030\0010\0052\n\020\006\032\0060\007j\002`\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/LLMPaymentRequiredException$Companion;", "", "<init>", "()V", "fromException", "Lcom/intellij/ml/llm/matterhorn/LLMPaymentRequiredException;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "core"})
/*    */   public static final class Companion { @Nullable
/*    */     public final LLMPaymentRequiredException fromException(@NotNull Exception e) {
/* 72 */       Intrinsics.checkNotNullParameter(e, "e"); if (e instanceof LLMPaymentRequiredException) return (LLMPaymentRequiredException)e; 
/* 73 */       if (e instanceof FailedDependencyException) {
/* 74 */         FailureReason reason = ((FailedDependencyException)e).getArtifact().getReasoning().getReason();
/* 75 */         if (reason instanceof FailureReason.PaymentRequired) return new LLMPaymentRequiredException((RuntimeException)e); 
/*    */       } 
/* 77 */       return null;
/*    */     }
/*    */     
/*    */     private Companion() {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\LLMPaymentRequiredException.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */