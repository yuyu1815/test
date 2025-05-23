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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\b\004\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\031\020\007\032\b\022\004\022\0020\0040\b¢\006\n\n\002\020\013\032\004\b\t\020\n¨\006\f"}, d2 = {"Lai/grazie/model/llm/profile/AlibabaProfileIDs$Completion;", "", "()V", "CodeCompletion", "Lai/grazie/model/llm/profile/LLMProfileID;", "getCodeCompletion", "()Lai/grazie/model/llm/profile/LLMProfileID;", "all", "", "getAll", "()[Lai/grazie/model/llm/profile/LLMProfileID;", "[Lai/grazie/model/llm/profile/LLMProfileID;", "model-llm"})
/*    */ public final class Completion
/*    */ {
/*    */   @NotNull
/* 42 */   public static final Completion INSTANCE = new Completion(); @NotNull private static final LLMProfileID[] all; @NotNull private static final LLMProfileID CodeCompletion = new LLMProfileID("alibaba-code-completion"); @NotNull public final LLMProfileID getCodeCompletion() { return CodeCompletion; }
/*    */   @NotNull
/* 44 */   public final LLMProfileID[] getAll() { return all; } static { LLMProfileID[] arrayOfLLMProfileID = new LLMProfileID[1]; arrayOfLLMProfileID[0] = CodeCompletion; all = arrayOfLLMProfileID; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\profile\AlibabaProfileIDs$Completion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */