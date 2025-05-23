/*     */ package ai.grazie.model.llm.utils;
/*     */ 
/*     */ import ai.grazie.model.llm.profile.AlibabaProfileIDs;
/*     */ import ai.grazie.model.llm.profile.AnthropicProfileIDs;
/*     */ import ai.grazie.model.llm.profile.DeepSeekProfileIDs;
/*     */ import ai.grazie.model.llm.profile.GoogleProfileIDs;
/*     */ import ai.grazie.model.llm.profile.GrazieLLMProfileIDs;
/*     */ import ai.grazie.model.llm.profile.LLMProfileID;
/*     */ import ai.grazie.model.llm.profile.MistralProfileIDs;
/*     */ import ai.grazie.model.llm.profile.OpenAIProfileIDs;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.collections.MapsKt;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020$\n\002\030\002\n\002\020\016\n\002\b\004\bÂ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R#\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0060\004¢\006\016\n\000\022\004\b\007\020\002\032\004\b\b\020\t¨\006\n"}, d2 = {"Lai/grazie/model/llm/utils/ProfileNames;", "", "()V", "profileIDtoName", "", "Lai/grazie/model/llm/profile/LLMProfileID;", "", "getProfileIDtoName$annotations", "getProfileIDtoName", "()Ljava/util/Map;", "model-llm"})
/*     */ final class ProfileNames
/*     */ {
/*     */   @NotNull
/*     */   private static final Map<LLMProfileID, String> profileIDtoName;
/*     */   @NotNull
/*  39 */   public static final ProfileNames INSTANCE = new ProfileNames(); @NotNull public final Map<LLMProfileID, String> getProfileIDtoName() { return profileIDtoName; } static {
/*  40 */     Pair[] arrayOfPair = new Pair[57]; arrayOfPair[0] = TuplesKt.to(OpenAIProfileIDs.Chat.INSTANCE.getChatGPT(), "ChatGPT"); arrayOfPair[1] = 
/*  41 */       TuplesKt.to(OpenAIProfileIDs.Chat.INSTANCE.getO1(), "o1");
/*  42 */     arrayOfPair[2] = TuplesKt.to(OpenAIProfileIDs.Chat.INSTANCE.getO1Mini(), "o1 Mini");
/*  43 */     arrayOfPair[3] = TuplesKt.to(OpenAIProfileIDs.Chat.INSTANCE.getO3Mini(), "o3 Mini");
/*  44 */     arrayOfPair[4] = TuplesKt.to(OpenAIProfileIDs.Chat.INSTANCE.getGPT4(), "GPT-4");
/*  45 */     arrayOfPair[5] = TuplesKt.to(OpenAIProfileIDs.Chat.INSTANCE.getGPT4o(), "GPT-4o");
/*  46 */     arrayOfPair[6] = TuplesKt.to(OpenAIProfileIDs.Chat.INSTANCE.getGPT4oAlphaSnapshot(), "GPT-4o-alpha-snapshot");
/*  47 */     arrayOfPair[7] = TuplesKt.to(OpenAIProfileIDs.Chat.INSTANCE.getGPT4oMini(), "GPT-4o-mini");
/*  48 */     arrayOfPair[8] = TuplesKt.to(OpenAIProfileIDs.Chat.INSTANCE.getGPT4Turbo(), "GPT-4-turbo");
/*  49 */     arrayOfPair[9] = TuplesKt.to(OpenAIProfileIDs.Chat.INSTANCE.getGPT4_5(), "GPT-4.5");
/*  50 */     arrayOfPair[10] = TuplesKt.to(OpenAIProfileIDs.Chat.INSTANCE.getChatGPT16k(), "GPT-16k");
/*  51 */     arrayOfPair[11] = TuplesKt.to(OpenAIProfileIDs.Completion.INSTANCE.getInstructGPT(), "InstructGPT");
/*  52 */     arrayOfPair[12] = TuplesKt.to(OpenAIProfileIDs.Embedding.INSTANCE.getAda(), "Ada");
/*  53 */     arrayOfPair[13] = TuplesKt.to(OpenAIProfileIDs.Embedding.INSTANCE.getLarge(), "Embedding Large");
/*  54 */     arrayOfPair[14] = TuplesKt.to(OpenAIProfileIDs.Embedding.INSTANCE.getSmall(), "Embedding Small");
/*     */     
/*  56 */     arrayOfPair[15] = TuplesKt.to(AnthropicProfileIDs.INSTANCE.getClaude_3_Haiku(), "Claude 3 Haiku");
/*  57 */     arrayOfPair[16] = TuplesKt.to(AnthropicProfileIDs.INSTANCE.getClaude_3_Opus(), "Claude 3 Opus");
/*  58 */     arrayOfPair[17] = TuplesKt.to(AnthropicProfileIDs.INSTANCE.getClaude_3_Sonnet(), "Claude 3 Sonnet");
/*  59 */     arrayOfPair[18] = TuplesKt.to(AnthropicProfileIDs.INSTANCE.getClaude_2_1(), "Claude 2.1");
/*  60 */     arrayOfPair[19] = TuplesKt.to(AnthropicProfileIDs.INSTANCE.getClaude_3_5_Sonnet(), "Claude 3.5 Sonnet");
/*  61 */     arrayOfPair[20] = TuplesKt.to(AnthropicProfileIDs.INSTANCE.getClaude_3_5_Haiku(), "Claude 3.5 Haiku");
/*  62 */     arrayOfPair[21] = TuplesKt.to(AnthropicProfileIDs.INSTANCE.getClaude_3_7_Sonnet(), "Claude 3.7 Sonnet");
/*     */     
/*  64 */     arrayOfPair[22] = TuplesKt.to(GrazieLLMProfileIDs.LLAMA.INSTANCE.getSmall(), "Llama-2 7B Chat");
/*  65 */     arrayOfPair[23] = TuplesKt.to(GrazieLLMProfileIDs.LLAMA.INSTANCE.getMedium(), "Llama-2 13B Chat");
/*  66 */     arrayOfPair[24] = TuplesKt.to(GrazieLLMProfileIDs.LLAMA.INSTANCE.getSqlCoder(), "Llama-2 SqlCoder");
/*  67 */     arrayOfPair[25] = TuplesKt.to(GrazieLLMProfileIDs.LLAMA.Code.INSTANCE.getLarge(), "Code Llama 70B Instruct");
/*  68 */     arrayOfPair[26] = TuplesKt.to(GrazieLLMProfileIDs.LLAMA.Code.INSTANCE.getSmall(), "Code Llama Small");
/*  69 */     arrayOfPair[27] = TuplesKt.to(GrazieLLMProfileIDs.LLAMA.Code.INSTANCE.getMedium(), "Code Llama Medium");
/*  70 */     arrayOfPair[28] = TuplesKt.to(GrazieLLMProfileIDs.LLAMA3.INSTANCE.getSmall(), "Llama-3 Small");
/*  71 */     arrayOfPair[29] = TuplesKt.to(GrazieLLMProfileIDs.Zephyr.INSTANCE.getSmall(), "Zephyr Small");
/*  72 */     arrayOfPair[30] = TuplesKt.to(GrazieLLMProfileIDs.Gemma.INSTANCE.getSmall(), "Gemma Small");
/*     */     
/*  74 */     arrayOfPair[31] = TuplesKt.to(AlibabaProfileIDs.Chat.INSTANCE.getQwenTurbo(), "Qwen Turbo");
/*  75 */     arrayOfPair[32] = TuplesKt.to(AlibabaProfileIDs.Chat.INSTANCE.getQwenPlus(), "Qwen Plus");
/*  76 */     arrayOfPair[33] = TuplesKt.to(AlibabaProfileIDs.Chat.INSTANCE.getQwenMax(), "Qwen Max");
/*  77 */     arrayOfPair[34] = TuplesKt.to(AlibabaProfileIDs.Chat.INSTANCE.getQwenMaxLong(), "Qwen MaxLong");
/*  78 */     arrayOfPair[35] = TuplesKt.to(AlibabaProfileIDs.Completion.INSTANCE.getCodeCompletion(), "Code Completion");
/*  79 */     arrayOfPair[36] = TuplesKt.to(AlibabaProfileIDs.INSTANCE.getQwenTurbo(), "Qwen Turbo");
/*  80 */     arrayOfPair[37] = TuplesKt.to(AlibabaProfileIDs.INSTANCE.getQwenPlus(), "Qwen Plus");
/*  81 */     arrayOfPair[38] = TuplesKt.to(AlibabaProfileIDs.INSTANCE.getQwenMax(), "Qwen Max");
/*  82 */     arrayOfPair[39] = TuplesKt.to(AlibabaProfileIDs.INSTANCE.getQwenMaxLong(), "Qwen MaxLong");
/*     */     
/*  84 */     arrayOfPair[40] = TuplesKt.to(GoogleProfileIDs.Chat.INSTANCE.getBison(), "Chat Bison");
/*  85 */     arrayOfPair[41] = TuplesKt.to(GoogleProfileIDs.Chat.INSTANCE.getCodeBison(), "Code Chat Bison");
/*  86 */     arrayOfPair[42] = TuplesKt.to(GoogleProfileIDs.Chat.INSTANCE.getGeminiPro1_5(), "Gemini 1.5 Pro");
/*  87 */     arrayOfPair[43] = TuplesKt.to(GoogleProfileIDs.Chat.INSTANCE.getGeminiFlash1_5(), "Gemini 1.5 Flash");
/*  88 */     arrayOfPair[44] = TuplesKt.to(GoogleProfileIDs.Chat.INSTANCE.getGeminiFlash2_0(), "Gemini 2.0 Flash");
/*  89 */     arrayOfPair[45] = TuplesKt.to(GoogleProfileIDs.Chat.INSTANCE.getGeminiFlashLite2_0(), "Gemini 2.0 Flash-Lite");
/*  90 */     arrayOfPair[46] = TuplesKt.to(GoogleProfileIDs.Chat.INSTANCE.getGeminiThinking2_0(), "Gemini 2.0 Flash Thinking");
/*  91 */     arrayOfPair[47] = TuplesKt.to(GoogleProfileIDs.Chat.INSTANCE.getGeminiPro2_0(), "Gemini 2.0 Pro");
/*  92 */     arrayOfPair[48] = TuplesKt.to(GoogleProfileIDs.Completion.INSTANCE.getCodeGecko(), "Code Gecko");
/*  93 */     arrayOfPair[49] = TuplesKt.to(GoogleProfileIDs.Completion.INSTANCE.getCodeBison(), "Code Completion Bison");
/*     */     
/*  95 */     arrayOfPair[50] = TuplesKt.to(MistralProfileIDs.Chat.INSTANCE.getOpenMistral7B(), "7B");
/*  96 */     arrayOfPair[51] = TuplesKt.to(MistralProfileIDs.Chat.INSTANCE.getOpenMixtral8x7B(), "Open Mixtral 8x7B");
/*  97 */     arrayOfPair[52] = TuplesKt.to(MistralProfileIDs.Chat.INSTANCE.getOpenMixtral8x22B(), "Open Mixtral 8x22B");
/*  98 */     arrayOfPair[53] = TuplesKt.to(MistralProfileIDs.Chat.INSTANCE.getMistralSmall(), "Small");
/*  99 */     arrayOfPair[54] = TuplesKt.to(MistralProfileIDs.Chat.INSTANCE.getMistralLarge(), "Large");
/* 100 */     arrayOfPair[55] = TuplesKt.to(MistralProfileIDs.Completion.INSTANCE.getCodestral(), "Codestral");
/*     */     
/* 102 */     arrayOfPair[56] = TuplesKt.to(DeepSeekProfileIDs.INSTANCE.getDeepSeek_R1(), "DeepSeek R1");
/*     */     profileIDtoName = MapsKt.mapOf(arrayOfPair);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\ll\\utils\ProfileNames.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */