/*     */ package com.intellij.ml.llm.matterhorn.core.llm.openai;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.llm.StopSequenceType;
/*     */ import kotlin.Metadata;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\031\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\013\020\r\032\004\030\0010\005HÆ\003J\037\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\n\020\013¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatRequest$StopSequence;", "", "sequence", "", "type", "Lcom/intellij/ml/llm/matterhorn/llm/StopSequenceType;", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/StopSequenceType;)V", "getSequence", "()Ljava/lang/String;", "getType", "()Lcom/intellij/ml/llm/matterhorn/llm/StopSequenceType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core-llm"})
/*     */ public final class StopSequence
/*     */ {
/*     */   @NotNull
/*     */   private final String sequence;
/*     */   @Nullable
/*     */   private final StopSequenceType type;
/*     */   
/*     */   public StopSequence(@NotNull String sequence, @Nullable StopSequenceType type) {
/* 110 */     this.sequence = sequence; this.type = type; } @NotNull public final String getSequence() { return this.sequence; } @Nullable public final StopSequenceType getType() { return this.type; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.sequence;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final StopSequenceType component2() {
/*     */     return this.type;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final StopSequence copy(@NotNull String sequence, @Nullable StopSequenceType type) {
/*     */     Intrinsics.checkNotNullParameter(sequence, "sequence");
/*     */     return new StopSequence(sequence, type);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "StopSequence(sequence=" + this.sequence + ", type=" + this.type + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.sequence.hashCode();
/*     */     return result * 31 + ((this.type == null) ? 0 : this.type.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof StopSequence))
/*     */       return false; 
/*     */     StopSequence stopSequence = (StopSequence)other;
/*     */     return !Intrinsics.areEqual(this.sequence, stopSequence.sequence) ? false : (!(this.type != stopSequence.type));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\openai\OpenAIChatRequest$StopSequence.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */