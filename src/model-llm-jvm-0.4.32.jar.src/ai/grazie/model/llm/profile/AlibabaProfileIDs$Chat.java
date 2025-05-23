/*    */ package ai.grazie.model.llm.profile;
/*    */ 
/*    */ import ai.grazie.model.llm.annotation.ExperimentalLLM;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\f\n\002\020\021\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\034\020\007\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\b\020\002\032\004\b\t\020\006R\034\020\n\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\013\020\002\032\004\b\f\020\006R\034\020\r\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\016\020\002\032\004\b\017\020\006R\037\020\020\032\b\022\004\022\0020\0040\021¢\006\020\n\002\020\025\022\004\b\022\020\002\032\004\b\023\020\024¨\006\026"}, d2 = {"Lai/grazie/model/llm/profile/AlibabaProfileIDs$Chat;", "", "()V", "QwenMax", "Lai/grazie/model/llm/profile/LLMProfileID;", "getQwenMax", "()Lai/grazie/model/llm/profile/LLMProfileID;", "QwenMaxLong", "getQwenMaxLong$annotations", "getQwenMaxLong", "QwenPlus", "getQwenPlus$annotations", "getQwenPlus", "QwenTurbo", "getQwenTurbo$annotations", "getQwenTurbo", "all", "", "getAll$annotations", "getAll", "()[Lai/grazie/model/llm/profile/LLMProfileID;", "[Lai/grazie/model/llm/profile/LLMProfileID;", "model-llm"})
/*    */ public final class Chat
/*    */ {
/*    */   @NotNull
/* 27 */   public static final Chat INSTANCE = new Chat(); @NotNull private static final LLMProfileID QwenTurbo = new LLMProfileID("qwen-turbo"); @NotNull public final LLMProfileID getQwenTurbo() { return QwenTurbo; }
/*    */   
/*    */   @NotNull
/* 30 */   private static final LLMProfileID QwenPlus = new LLMProfileID("qwen-plus"); @NotNull public final LLMProfileID getQwenPlus() { return QwenPlus; }
/*    */    @NotNull
/* 32 */   private static final LLMProfileID QwenMax = new LLMProfileID("qwen-max"); @NotNull public final LLMProfileID getQwenMax() { return QwenMax; }
/*    */    @NotNull
/*    */   private static final LLMProfileID[] all; @NotNull
/* 35 */   private static final LLMProfileID QwenMaxLong = new LLMProfileID("qwen-max-longcontext"); @NotNull public final LLMProfileID getQwenMaxLong() { return QwenMaxLong; }
/*    */   
/*    */   @NotNull
/* 38 */   public final LLMProfileID[] getAll() { return all; } static { LLMProfileID[] arrayOfLLMProfileID = new LLMProfileID[4]; arrayOfLLMProfileID[0] = QwenTurbo; arrayOfLLMProfileID[1] = QwenPlus; arrayOfLLMProfileID[2] = QwenMax; arrayOfLLMProfileID[3] = QwenMaxLong; all = arrayOfLLMProfileID; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\profile\AlibabaProfileIDs$Chat.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */