/*    */ package com.intellij.ml.llm.matterhorn.core.llm;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.sequences.Sequence;
/*    */ import kotlin.sequences.SequencesKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\020\t\n\000\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\bÆ\n\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\b\022\004\022\0020\0060\005H\026J\023\020\007\032\0020\b2\b\020\t\032\004\030\0010\nHÖ\003J\t\020\013\032\0020\fHÖ\001J\t\020\r\032\0020\016HÖ\001¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/DelayStrategy$NoAttempts;", "Lcom/intellij/ml/llm/matterhorn/core/llm/DelayStrategy;", "<init>", "()V", "getDelays", "Lkotlin/sequences/Sequence;", "", "equals", "", "other", "", "hashCode", "", "toString", "", "core-llm"})
/*    */ public final class NoAttempts implements DelayStrategy {
/*    */   @NotNull
/*    */   public Sequence<Long> getDelays() {
/* 12 */     return SequencesKt.emptySequence();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final NoAttempts INSTANCE = new NoAttempts();
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "NoAttempts";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return 1609096203;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof NoAttempts))
/*    */       return false; 
/*    */     (NoAttempts)other;
/*    */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\DelayStrategy$NoAttempts.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */