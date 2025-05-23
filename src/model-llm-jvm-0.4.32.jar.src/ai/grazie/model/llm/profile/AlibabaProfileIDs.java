/*    */ package ai.grazie.model.llm.profile;
/*    */ import ai.grazie.model.llm.annotation.ExperimentalLLM;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\r\n\002\020\021\n\002\b\006\bÇ\002\030\0002\0020\001:\002\026\027B\007\b\002¢\006\002\020\002R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007R\034\020\b\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\t\020\002\032\004\b\n\020\007R\034\020\013\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\f\020\002\032\004\b\r\020\007R\034\020\016\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\017\020\002\032\004\b\020\020\007R\031\020\021\032\b\022\004\022\0020\0040\022¢\006\n\n\002\020\025\032\004\b\023\020\024¨\006\030"}, d2 = {"Lai/grazie/model/llm/profile/AlibabaProfileIDs;", "", "()V", "QwenMax", "Lai/grazie/model/llm/profile/LLMProfileID;", "getQwenMax$annotations", "getQwenMax", "()Lai/grazie/model/llm/profile/LLMProfileID;", "QwenMaxLong", "getQwenMaxLong$annotations", "getQwenMaxLong", "QwenPlus", "getQwenPlus$annotations", "getQwenPlus", "QwenTurbo", "getQwenTurbo$annotations", "getQwenTurbo", "all", "", "getAll", "()[Lai/grazie/model/llm/profile/LLMProfileID;", "[Lai/grazie/model/llm/profile/LLMProfileID;", "Chat", "Completion", "model-llm"})
/*    */ public final class AlibabaProfileIDs {
/*    */   @NotNull
/*  8 */   public static final AlibabaProfileIDs INSTANCE = new AlibabaProfileIDs(); @NotNull private static final LLMProfileID[] all = (LLMProfileID[])ArraysKt.plus((Object[])Chat.INSTANCE.getAll(), (Object[])Completion.INSTANCE.getAll()); @NotNull public final LLMProfileID[] getAll() { return all; }
/*    */   
/*    */   @NotNull
/* 11 */   private static final LLMProfileID QwenTurbo = new LLMProfileID("qwen-turbo"); @NotNull public final LLMProfileID getQwenTurbo() { return QwenTurbo; }
/*    */ 
/*    */   
/*    */   @NotNull
/* 15 */   private static final LLMProfileID QwenPlus = new LLMProfileID("qwen-plus"); @NotNull public final LLMProfileID getQwenPlus() { return QwenPlus; }
/*    */ 
/*    */   
/*    */   @NotNull
/* 19 */   private static final LLMProfileID QwenMax = new LLMProfileID("qwen-max"); @NotNull public final LLMProfileID getQwenMax() { return QwenMax; }
/*    */ 
/*    */   
/*    */   @NotNull
/* 23 */   private static final LLMProfileID QwenMaxLong = new LLMProfileID("qwen-max-longcontext"); @NotNull public final LLMProfileID getQwenMaxLong() { return QwenMaxLong; }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\f\n\002\020\021\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\034\020\007\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\b\020\002\032\004\b\t\020\006R\034\020\n\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\013\020\002\032\004\b\f\020\006R\034\020\r\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\016\020\002\032\004\b\017\020\006R\037\020\020\032\b\022\004\022\0020\0040\021¢\006\020\n\002\020\025\022\004\b\022\020\002\032\004\b\023\020\024¨\006\026"}, d2 = {"Lai/grazie/model/llm/profile/AlibabaProfileIDs$Chat;", "", "()V", "QwenMax", "Lai/grazie/model/llm/profile/LLMProfileID;", "getQwenMax", "()Lai/grazie/model/llm/profile/LLMProfileID;", "QwenMaxLong", "getQwenMaxLong$annotations", "getQwenMaxLong", "QwenPlus", "getQwenPlus$annotations", "getQwenPlus", "QwenTurbo", "getQwenTurbo$annotations", "getQwenTurbo", "all", "", "getAll$annotations", "getAll", "()[Lai/grazie/model/llm/profile/LLMProfileID;", "[Lai/grazie/model/llm/profile/LLMProfileID;", "model-llm"})
/*    */   public static final class Chat { @NotNull
/* 27 */     public static final Chat INSTANCE = new Chat(); @NotNull private static final LLMProfileID QwenTurbo = new LLMProfileID("qwen-turbo"); @NotNull public final LLMProfileID getQwenTurbo() { return QwenTurbo; }
/*    */     
/*    */     @NotNull
/* 30 */     private static final LLMProfileID QwenPlus = new LLMProfileID("qwen-plus"); @NotNull public final LLMProfileID getQwenPlus() { return QwenPlus; }
/*    */      @NotNull
/* 32 */     private static final LLMProfileID QwenMax = new LLMProfileID("qwen-max"); @NotNull public final LLMProfileID getQwenMax() { return QwenMax; }
/*    */      @NotNull
/*    */     private static final LLMProfileID[] all; @NotNull
/* 35 */     private static final LLMProfileID QwenMaxLong = new LLMProfileID("qwen-max-longcontext"); @NotNull public final LLMProfileID getQwenMaxLong() { return QwenMaxLong; }
/*    */     
/*    */     @NotNull
/* 38 */     public final LLMProfileID[] getAll() { return all; } static { LLMProfileID[] arrayOfLLMProfileID = new LLMProfileID[4]; arrayOfLLMProfileID[0] = QwenTurbo; arrayOfLLMProfileID[1] = QwenPlus; arrayOfLLMProfileID[2] = QwenMax; arrayOfLLMProfileID[3] = QwenMaxLong; all = arrayOfLLMProfileID; }
/*    */      }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\b\004\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\031\020\007\032\b\022\004\022\0020\0040\b¢\006\n\n\002\020\013\032\004\b\t\020\n¨\006\f"}, d2 = {"Lai/grazie/model/llm/profile/AlibabaProfileIDs$Completion;", "", "()V", "CodeCompletion", "Lai/grazie/model/llm/profile/LLMProfileID;", "getCodeCompletion", "()Lai/grazie/model/llm/profile/LLMProfileID;", "all", "", "getAll", "()[Lai/grazie/model/llm/profile/LLMProfileID;", "[Lai/grazie/model/llm/profile/LLMProfileID;", "model-llm"})
/*    */   public static final class Completion { @NotNull
/* 42 */     public static final Completion INSTANCE = new Completion(); @NotNull private static final LLMProfileID CodeCompletion = new LLMProfileID("alibaba-code-completion"); @NotNull private static final LLMProfileID[] all; @NotNull public final LLMProfileID getCodeCompletion() { return CodeCompletion; }
/*    */     @NotNull
/* 44 */     public final LLMProfileID[] getAll() { return all; } static { LLMProfileID[] arrayOfLLMProfileID = new LLMProfileID[1]; arrayOfLLMProfileID[0] = CodeCompletion; all = arrayOfLLMProfileID; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\profile\AlibabaProfileIDs.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */