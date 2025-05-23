/*    */ package com.intellij.ml.llm.matterhorn.core.llm.grazie;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.llm.AIAnswerChoice;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\n\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\005HÖ\001J\t\020\023\032\0020\024HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$AIAnswerChoiceIndex;", "", "choice", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice;", "index", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice;I)V", "getChoice", "()Lcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice;", "getIndex", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "core-llm"})
/*    */ public final class AIAnswerChoiceIndex
/*    */ {
/*    */   @NotNull
/*    */   private final AIAnswerChoice choice;
/*    */   private final int index;
/*    */   
/*    */   public AIAnswerChoiceIndex(@NotNull AIAnswerChoice choice, int index) {
/* 63 */     this.choice = choice; this.index = index; } @NotNull public final AIAnswerChoice getChoice() { return this.choice; } public final int getIndex() { return this.index; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final AIAnswerChoice component1() {
/*    */     return this.choice;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.index;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AIAnswerChoiceIndex copy(@NotNull AIAnswerChoice choice, int index) {
/*    */     Intrinsics.checkNotNullParameter(choice, "choice");
/*    */     return new AIAnswerChoiceIndex(choice, index);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AIAnswerChoiceIndex(choice=" + this.choice + ", index=" + this.index + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.choice.hashCode();
/*    */     return result * 31 + Integer.hashCode(this.index);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AIAnswerChoiceIndex))
/*    */       return false; 
/*    */     AIAnswerChoiceIndex aIAnswerChoiceIndex = (AIAnswerChoiceIndex)other;
/*    */     return !Intrinsics.areEqual(this.choice, aIAnswerChoiceIndex.choice) ? false : (!(this.index != aIAnswerChoiceIndex.index));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\grazie\GrazieLLMProxy$AIAnswerChoiceIndex.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */