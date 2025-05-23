/*    */ package ai.grazie.model.llm.profile;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\007\n\002\020\021\n\002\b\004\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\031\020\013\032\b\022\004\022\0020\0040\f¢\006\n\n\002\020\017\032\004\b\r\020\016¨\006\020"}, d2 = {"Lai/grazie/model/llm/profile/OpenAIProfileIDs$Embedding;", "", "()V", "Ada", "Lai/grazie/model/llm/profile/LLMProfileID;", "getAda", "()Lai/grazie/model/llm/profile/LLMProfileID;", "Large", "getLarge", "Small", "getSmall", "all", "", "getAll", "()[Lai/grazie/model/llm/profile/LLMProfileID;", "[Lai/grazie/model/llm/profile/LLMProfileID;", "model-llm"})
/*    */ public final class Embedding
/*    */ {
/*    */   @NotNull
/* 37 */   public static final Embedding INSTANCE = new Embedding(); @NotNull private static final LLMProfileID Ada = new LLMProfileID("openai-embedding-ada"); @NotNull public final LLMProfileID getAda() { return Ada; }
/*    */    @NotNull
/* 39 */   private static final LLMProfileID Small = new LLMProfileID("openai-embedding-small"); @NotNull public final LLMProfileID getSmall() { return Small; } @NotNull
/*    */   private static final LLMProfileID[] all; @NotNull
/* 41 */   private static final LLMProfileID Large = new LLMProfileID("openai-embedding-large"); @NotNull public final LLMProfileID getLarge() { return Large; }
/*    */   @NotNull
/* 43 */   public final LLMProfileID[] getAll() { return all; } static { LLMProfileID[] arrayOfLLMProfileID = new LLMProfileID[3]; arrayOfLLMProfileID[0] = Ada; arrayOfLLMProfileID[1] = Small; arrayOfLLMProfileID[2] = Large; all = arrayOfLLMProfileID; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\profile\OpenAIProfileIDs$Embedding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */