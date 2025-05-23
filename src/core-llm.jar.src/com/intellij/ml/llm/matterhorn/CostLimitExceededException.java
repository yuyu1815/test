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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\030\000 \0062\0020\001:\001\006B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/CostLimitExceededException;", "Lcom/intellij/ml/llm/matterhorn/LlmException;", "message", "", "<init>", "(Ljava/lang/String;)V", "Companion", "core"})
/*    */ public final class CostLimitExceededException
/*    */   extends LlmException
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   public CostLimitExceededException(@NotNull String message) {
/* 42 */     super(message, null, 2, null); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\024\020\004\032\004\030\0010\0052\n\020\006\032\0060\007j\002`\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/CostLimitExceededException$Companion;", "", "<init>", "()V", "fromException", "Lcom/intellij/ml/llm/matterhorn/CostLimitExceededException;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "core"})
/*    */   public static final class Companion { @Nullable
/*    */     public final CostLimitExceededException fromException(@NotNull Exception e) {
/* 45 */       Intrinsics.checkNotNullParameter(e, "e"); if (e instanceof CostLimitExceededException) return (CostLimitExceededException)e; 
/* 46 */       if (e instanceof FailedDependencyException) {
/* 47 */         FailureReason reason = ((FailedDependencyException)e).getArtifact().getReasoning().getReason();
/* 48 */         if (reason instanceof FailureReason.CostExceeded) return new CostLimitExceededException(((FailureReason.CostExceeded)reason).getMessage()); 
/*    */       } 
/* 50 */       return null;
/*    */     }
/*    */     
/*    */     private Companion() {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\CostLimitExceededException.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */