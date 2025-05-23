/*    */ package ai.grazie.model.llm.data.stream;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020\b\n\002\b\r\n\002\020\013\n\000\n\002\020\000\n\002\b\003\b\b\030\0002\0020\001B%\022\n\b\002\020\002\032\004\030\0010\003\022\006\020\004\032\0020\003\022\n\b\002\020\005\032\004\030\0010\006¢\006\002\020\007J\013\020\016\032\004\030\0010\003HÆ\003J\t\020\017\032\0020\003HÆ\003J\020\020\020\032\004\030\0010\006HÆ\003¢\006\002\020\tJ0\020\021\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\b\b\002\020\004\032\0020\0032\n\b\002\020\005\032\004\030\0010\006HÆ\001¢\006\002\020\022J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\026HÖ\003J\t\020\027\032\0020\006HÖ\001J\t\020\030\032\0020\003HÖ\001R\025\020\005\032\004\030\0010\006¢\006\n\n\002\020\n\032\004\b\b\020\tR\024\020\004\032\0020\003X\004¢\006\b\n\000\032\004\b\013\020\fR\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\r\020\f¨\006\031"}, d2 = {"Lai/grazie/model/llm/data/stream/LLMStreamFunctionCall;", "Lai/grazie/model/llm/data/stream/LLMStreamData;", "name", "", "content", "choiceIndex", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getChoiceIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContent", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lai/grazie/model/llm/data/stream/LLMStreamFunctionCall;", "equals", "", "other", "", "hashCode", "toString", "model-llm"})
/*    */ public final class LLMStreamFunctionCall extends LLMStreamData {
/*    */   @Nullable
/*    */   private final String name;
/*    */   
/* 14 */   public LLMStreamFunctionCall(@Nullable String name, @NotNull String content, @Nullable Integer choiceIndex) { super(null); this.name = name; this.content = content; this.choiceIndex = choiceIndex; } @NotNull private final String content; @Nullable private final Integer choiceIndex; @Nullable public final String getName() { return this.name; } @NotNull public String getContent() { return this.content; } @Nullable public final Integer getChoiceIndex() { return this.choiceIndex; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final String component1() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Integer component3() {
/*    */     return this.choiceIndex;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LLMStreamFunctionCall copy(@Nullable String name, @NotNull String content, @Nullable Integer choiceIndex) {
/*    */     Intrinsics.checkNotNullParameter(content, "content");
/*    */     return new LLMStreamFunctionCall(name, content, choiceIndex);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "LLMStreamFunctionCall(name=" + this.name + ", content=" + this.content + ", choiceIndex=" + this.choiceIndex + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = (this.name == null) ? 0 : this.name.hashCode();
/*    */     result = result * 31 + this.content.hashCode();
/*    */     return result * 31 + ((this.choiceIndex == null) ? 0 : this.choiceIndex.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LLMStreamFunctionCall))
/*    */       return false; 
/*    */     LLMStreamFunctionCall lLMStreamFunctionCall = (LLMStreamFunctionCall)other;
/*    */     return !Intrinsics.areEqual(this.name, lLMStreamFunctionCall.name) ? false : (!Intrinsics.areEqual(this.content, lLMStreamFunctionCall.content) ? false : (!!Intrinsics.areEqual(this.choiceIndex, lLMStreamFunctionCall.choiceIndex)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\data\stream\LLMStreamFunctionCall.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */