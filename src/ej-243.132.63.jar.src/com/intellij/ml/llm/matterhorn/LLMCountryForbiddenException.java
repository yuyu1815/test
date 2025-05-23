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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\005\030\000 \0062\0060\001j\002`\002:\001\006B\027\022\016\020\003\032\n\030\0010\001j\004\030\001`\002¢\006\004\b\004\020\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/LLMCountryForbiddenException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "cause", "<init>", "(Ljava/lang/RuntimeException;)V", "Companion", "core"})
/*    */ public final class LLMCountryForbiddenException
/*    */   extends RuntimeException
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   public LLMCountryForbiddenException(@Nullable RuntimeException cause) {
/* 82 */     super("Junie is not available in this country", cause); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\024\020\004\032\004\030\0010\0052\n\020\006\032\0060\007j\002`\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/LLMCountryForbiddenException$Companion;", "", "<init>", "()V", "fromException", "Lcom/intellij/ml/llm/matterhorn/LLMCountryForbiddenException;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "core"})
/*    */   public static final class Companion { @Nullable
/*    */     public final LLMCountryForbiddenException fromException(@NotNull Exception e) {
/* 85 */       Intrinsics.checkNotNullParameter(e, "e"); if (e instanceof LLMCountryForbiddenException) return (LLMCountryForbiddenException)e; 
/* 86 */       if (e instanceof FailedDependencyException) {
/* 87 */         FailureReason reason = ((FailedDependencyException)e).getArtifact().getReasoning().getReason();
/* 88 */         if (reason instanceof FailureReason.CountryForbidden) return new LLMCountryForbiddenException((RuntimeException)e); 
/*    */       } 
/* 90 */       return null;
/*    */     }
/*    */     
/*    */     private Companion() {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\LLMCountryForbiddenException.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */