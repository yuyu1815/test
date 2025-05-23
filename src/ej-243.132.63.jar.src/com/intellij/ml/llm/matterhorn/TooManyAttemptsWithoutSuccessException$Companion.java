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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\032\020\004\032\n\030\0010\005j\004\030\001`\0062\n\020\007\032\0060\005j\002`\006¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/TooManyAttemptsWithoutSuccessException$Companion;", "", "<init>", "()V", "fromException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "core"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @Nullable
/*    */   public final Exception fromException(@NotNull Exception e) {
/* 30 */     Intrinsics.checkNotNullParameter(e, "e"); if (e instanceof LLMPaymentRequiredException) return e; 
/* 31 */     if (e instanceof FailedDependencyException) {
/* 32 */       FailureReason reason = ((FailedDependencyException)e).getArtifact().getReasoning().getReason();
/* 33 */       if (reason instanceof FailureReason.FormatError) return new TooManyAttemptsWithoutSuccessException("Too many attempts", e); 
/*    */     } 
/* 35 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\TooManyAttemptsWithoutSuccessException$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */