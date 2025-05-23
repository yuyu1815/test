/*    */ package ai.grazie.model.llm.data.stream;
/*    */ 
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\013\n\002\020\013\n\000\n\002\020\000\n\002\b\003\b\b\030\0002\0020\001B\031\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005¢\006\002\020\006J\t\020\f\032\0020\003HÆ\003J\020\020\r\032\004\030\0010\005HÆ\003¢\006\002\020\bJ$\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\005HÆ\001¢\006\002\020\017J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\023HÖ\003J\t\020\024\032\0020\005HÖ\001J\t\020\025\032\0020\003HÖ\001R\025\020\004\032\004\030\0010\005¢\006\n\n\002\020\t\032\004\b\007\020\bR\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\n\020\013¨\006\026"}, d2 = {"Lai/grazie/model/llm/data/stream/LLMStreamText;", "Lai/grazie/model/llm/data/stream/LLMStreamData;", "content", "", "choiceIndex", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getChoiceIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContent", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lai/grazie/model/llm/data/stream/LLMStreamText;", "equals", "", "other", "", "hashCode", "toString", "model-llm"})
/*    */ public final class LLMStreamText extends LLMStreamData {
/*    */   @NotNull
/*    */   private final String content;
/*    */   
/* 12 */   public LLMStreamText(@NotNull String content, @Nullable Integer choiceIndex) { super(null); this.content = content; this.choiceIndex = choiceIndex; } @Nullable private final Integer choiceIndex; @NotNull public String getContent() { return this.content; } @Nullable public final Integer getChoiceIndex() { return this.choiceIndex; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Integer component2() {
/*    */     return this.choiceIndex;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LLMStreamText copy(@NotNull String content, @Nullable Integer choiceIndex) {
/*    */     Intrinsics.checkNotNullParameter(content, "content");
/*    */     return new LLMStreamText(content, choiceIndex);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "LLMStreamText(content=" + this.content + ", choiceIndex=" + this.choiceIndex + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.content.hashCode();
/*    */     return result * 31 + ((this.choiceIndex == null) ? 0 : this.choiceIndex.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LLMStreamText))
/*    */       return false; 
/*    */     LLMStreamText lLMStreamText = (LLMStreamText)other;
/*    */     return !Intrinsics.areEqual(this.content, lLMStreamText.content) ? false : (!!Intrinsics.areEqual(this.choiceIndex, lLMStreamText.choiceIndex));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\data\stream\LLMStreamText.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */