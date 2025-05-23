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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\024\020\004\032\004\030\0010\0052\n\020\006\032\0060\007j\002`\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/LLMBadResponseException$Companion;", "", "<init>", "()V", "fromException", "Lcom/intellij/ml/llm/matterhorn/LLMBadResponseException;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "core"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @Nullable
/*    */   public final LLMBadResponseException fromException(@NotNull Exception e) {
/* 58 */     Intrinsics.checkNotNullParameter(e, "e"); if (e instanceof LLMBadResponseException) return (LLMBadResponseException)e; 
/* 59 */     if (e instanceof FailedDependencyException) {
/* 60 */       FailureReason reason = ((FailedDependencyException)e).getArtifact().getReasoning().getReason();
/* 61 */       if (reason instanceof FailureReason.BadResponseException) return new LLMBadResponseException(((FailureReason.BadResponseException)reason).getMessage()); 
/*    */     } 
/* 63 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\LLMBadResponseException$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */