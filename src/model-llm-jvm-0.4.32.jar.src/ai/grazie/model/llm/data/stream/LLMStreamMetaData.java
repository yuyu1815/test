/*    */ package ai.grazie.model.llm.data.stream;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001B\007\b\004¢\006\002\020\002R\024\020\003\032\0020\004XD¢\006\b\n\000\032\004\b\005\020\006\001\004\007\b\t\n¨\006\013"}, d2 = {"Lai/grazie/model/llm/data/stream/LLMStreamMetaData;", "Lai/grazie/model/llm/data/stream/LLMStreamData;", "()V", "content", "", "getContent", "()Ljava/lang/String;", "Lai/grazie/model/llm/data/stream/LLMStreamFinishMetaData;", "Lai/grazie/model/llm/data/stream/LLMStreamQuotaMetaData;", "Lai/grazie/model/llm/data/stream/LLMStreamTokensData;", "Lai/grazie/model/llm/data/stream/LLMStreamUnknownMetaData;", "model-llm"})
/*    */ public abstract class LLMStreamMetaData extends LLMStreamData {
/*    */   @NotNull
/*    */   private final String content;
/*    */   
/* 10 */   private LLMStreamMetaData() { super(null);
/*    */     
/* 12 */     this.content = ""; } @NotNull public String getContent() { return this.content; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\data\stream\LLMStreamMetaData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */