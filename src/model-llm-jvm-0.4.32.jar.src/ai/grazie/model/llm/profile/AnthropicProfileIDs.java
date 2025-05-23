/*    */ package ai.grazie.model.llm.profile;
/*    */ import ai.grazie.model.llm.annotation.ExperimentalLLM;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\023\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007R\021\020\b\032\0020\004¢\006\b\n\000\032\004\b\t\020\007R\021\020\n\032\0020\004¢\006\b\n\000\032\004\b\013\020\007R\021\020\f\032\0020\004¢\006\b\n\000\032\004\b\r\020\007R\034\020\016\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\017\020\002\032\004\b\020\020\007R\034\020\021\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\022\020\002\032\004\b\023\020\007R\034\020\024\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\025\020\002\032\004\b\026\020\007¨\006\027"}, d2 = {"Lai/grazie/model/llm/profile/AnthropicProfileIDs;", "", "()V", "Claude_2_1", "Lai/grazie/model/llm/profile/LLMProfileID;", "getClaude_2_1$annotations", "getClaude_2_1", "()Lai/grazie/model/llm/profile/LLMProfileID;", "Claude_3_5_Haiku", "getClaude_3_5_Haiku", "Claude_3_5_Sonnet", "getClaude_3_5_Sonnet", "Claude_3_7_Sonnet", "getClaude_3_7_Sonnet", "Claude_3_Haiku", "getClaude_3_Haiku$annotations", "getClaude_3_Haiku", "Claude_3_Opus", "getClaude_3_Opus$annotations", "getClaude_3_Opus", "Claude_3_Sonnet", "getClaude_3_Sonnet$annotations", "getClaude_3_Sonnet", "model-llm"})
/*    */ public final class AnthropicProfileIDs {
/*    */   @NotNull
/*  9 */   public static final AnthropicProfileIDs INSTANCE = new AnthropicProfileIDs(); @NotNull private static final LLMProfileID Claude_2_1 = new LLMProfileID("anthropic-claude"); @NotNull public final LLMProfileID getClaude_2_1() { return Claude_2_1; }
/*    */   
/*    */   @NotNull
/* 12 */   private static final LLMProfileID Claude_3_Haiku = new LLMProfileID("anthropic-claude-3-haiku"); @NotNull public final LLMProfileID getClaude_3_Haiku() { return Claude_3_Haiku; }
/*    */   
/*    */   @NotNull
/* 15 */   private static final LLMProfileID Claude_3_Sonnet = new LLMProfileID("anthropic-claude-3-sonnet"); @NotNull public final LLMProfileID getClaude_3_Sonnet() { return Claude_3_Sonnet; }
/*    */   
/*    */   @NotNull
/* 18 */   private static final LLMProfileID Claude_3_Opus = new LLMProfileID("anthropic-claude-3-opus"); @NotNull public final LLMProfileID getClaude_3_Opus() { return Claude_3_Opus; }
/*    */    @NotNull
/* 20 */   private static final LLMProfileID Claude_3_5_Sonnet = new LLMProfileID("anthropic-claude-3.5-sonnet"); @NotNull public final LLMProfileID getClaude_3_5_Sonnet() { return Claude_3_5_Sonnet; }
/*    */    @NotNull
/* 22 */   private static final LLMProfileID Claude_3_5_Haiku = new LLMProfileID("anthropic-claude-3.5-haiku"); @NotNull public final LLMProfileID getClaude_3_5_Haiku() { return Claude_3_5_Haiku; }
/*    */    @NotNull
/* 24 */   private static final LLMProfileID Claude_3_7_Sonnet = new LLMProfileID("anthropic-claude-3.7-sonnet"); @NotNull public final LLMProfileID getClaude_3_7_Sonnet() { return Claude_3_7_Sonnet; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\profile\AnthropicProfileIDs.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */