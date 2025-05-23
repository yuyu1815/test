/*    */ package ai.grazie.model.llm.profile;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\006\b\007\030\0002\0020\001:\004\003\004\005\006B\005¢\006\002\020\002¨\006\007"}, d2 = {"Lai/grazie/model/llm/profile/GrazieLLMProfileIDs;", "", "()V", "Gemma", "LLAMA", "LLAMA3", "Zephyr", "model-llm"})
/*    */ public final class GrazieLLMProfileIDs
/*    */ {
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\b\bÆ\002\030\0002\0020\001:\001\013B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006¨\006\f"}, d2 = {"Lai/grazie/model/llm/profile/GrazieLLMProfileIDs$LLAMA;", "", "()V", "Medium", "Lai/grazie/model/llm/profile/LLMProfileID;", "getMedium", "()Lai/grazie/model/llm/profile/LLMProfileID;", "Small", "getSmall", "SqlCoder", "getSqlCoder", "Code", "model-llm"})
/*    */   public static final class LLAMA {
/*    */     @NotNull
/* 12 */     public static final LLAMA INSTANCE = new LLAMA(); @NotNull private static final LLMProfileID Small = new LLMProfileID("grazie-chat-llama-v2-7b"); @NotNull public final LLMProfileID getSmall() { return Small; }
/*    */ 
/*    */ 
/*    */     
/*    */     @NotNull
/* 17 */     private static final LLMProfileID Medium = new LLMProfileID("grazie-chat-llama-v2-13b"); @NotNull public final LLMProfileID getMedium() { return Medium; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     @NotNull
/* 26 */     private static final LLMProfileID SqlCoder = new LLMProfileID("grazie-sqlcoder-llama-8b"); @NotNull public final LLMProfileID getSqlCoder() { return SqlCoder; }
/*    */      @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\007\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006¨\006\013"}, d2 = {"Lai/grazie/model/llm/profile/GrazieLLMProfileIDs$LLAMA$Code;", "", "()V", "Large", "Lai/grazie/model/llm/profile/LLMProfileID;", "getLarge", "()Lai/grazie/model/llm/profile/LLMProfileID;", "Medium", "getMedium", "Small", "getSmall", "model-llm"})
/*    */     public static final class Code { @NotNull
/* 29 */       public static final Code INSTANCE = new Code(); @NotNull private static final LLMProfileID Small = new LLMProfileID("grazie-code-llama-7b"); @NotNull public final LLMProfileID getSmall() { return Small; }
/*    */        @NotNull
/* 31 */       private static final LLMProfileID Medium = new LLMProfileID("grazie-code-llama-13b"); @NotNull public final LLMProfileID getMedium() { return Medium; }
/*    */ 
/*    */ 
/*    */ 
/*    */       
/*    */       @NotNull
/* 37 */       private static final LLMProfileID Large = new LLMProfileID("grazie-code-llama-70b-instruct"); @NotNull public final LLMProfileID getLarge() { return Large; }
/*    */        }
/*    */   
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/llm/profile/GrazieLLMProfileIDs$LLAMA3;", "", "()V", "Small", "Lai/grazie/model/llm/profile/LLMProfileID;", "getSmall", "()Lai/grazie/model/llm/profile/LLMProfileID;", "model-llm"})
/*    */   public static final class LLAMA3 {
/*    */     @NotNull
/* 45 */     public static final LLAMA3 INSTANCE = new LLAMA3(); @NotNull private static final LLMProfileID Small = new LLMProfileID("grazie-chat-llama-v3-8b-instruct"); @NotNull public final LLMProfileID getSmall() { return Small; }
/*    */      }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/llm/profile/GrazieLLMProfileIDs$Zephyr;", "", "()V", "Small", "Lai/grazie/model/llm/profile/LLMProfileID;", "getSmall", "()Lai/grazie/model/llm/profile/LLMProfileID;", "model-llm"})
/*    */   public static final class Zephyr { @NotNull
/* 49 */     public static final Zephyr INSTANCE = new Zephyr(); @NotNull private static final LLMProfileID Small = new LLMProfileID("grazie-chat-zephyr-7b"); @NotNull public final LLMProfileID getSmall() { return Small; }
/*    */      }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/llm/profile/GrazieLLMProfileIDs$Gemma;", "", "()V", "Small", "Lai/grazie/model/llm/profile/LLMProfileID;", "getSmall", "()Lai/grazie/model/llm/profile/LLMProfileID;", "model-llm"})
/*    */   public static final class Gemma {
/*    */     @NotNull
/* 56 */     public static final Gemma INSTANCE = new Gemma(); @NotNull private static final LLMProfileID Small = new LLMProfileID("grazie-chat-gemma-v2-9b"); @NotNull public final LLMProfileID getSmall() { return Small; }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\profile\GrazieLLMProfileIDs.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */