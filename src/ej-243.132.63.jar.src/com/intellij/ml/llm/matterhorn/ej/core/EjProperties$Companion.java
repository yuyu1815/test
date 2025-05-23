/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.settings.MatterhornProperty;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\bY\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007R\021\020\b\032\0020\005¢\006\b\n\000\032\004\b\t\020\007R\021\020\n\032\0020\005¢\006\b\n\000\032\004\b\013\020\007R\021\020\f\032\0020\005¢\006\b\n\000\032\004\b\r\020\007R\021\020\016\032\0020\005¢\006\b\n\000\032\004\b\017\020\007R\021\020\020\032\0020\005¢\006\b\n\000\032\004\b\021\020\007R\021\020\022\032\0020\005¢\006\b\n\000\032\004\b\023\020\007R\021\020\024\032\0020\005¢\006\b\n\000\032\004\b\025\020\007R\021\020\026\032\0020\005¢\006\b\n\000\032\004\b\027\020\007R\021\020\030\032\0020\005¢\006\b\n\000\032\004\b\031\020\007R\021\020\032\032\0020\005¢\006\b\n\000\032\004\b\033\020\007R\021\020\034\032\0020\005¢\006\b\n\000\032\004\b\035\020\007R\021\020\036\032\0020\005¢\006\b\n\000\032\004\b\037\020\007R\021\020 \032\0020\005¢\006\b\n\000\032\004\b!\020\007R\021\020\"\032\0020\005¢\006\b\n\000\032\004\b#\020\007R\021\020$\032\0020\005¢\006\b\n\000\032\004\b%\020\007R\021\020&\032\0020\005¢\006\b\n\000\032\004\b'\020\007R\021\020(\032\0020\005¢\006\b\n\000\032\004\b)\020\007R\021\020*\032\0020\005¢\006\b\n\000\032\004\b+\020\007R\021\020,\032\0020\005¢\006\b\n\000\032\004\b-\020\007R\021\020.\032\0020\005¢\006\b\n\000\032\004\b/\020\007R\021\0200\032\0020\005¢\006\b\n\000\032\004\b1\020\007R\021\0202\032\0020\005¢\006\b\n\000\032\004\b3\020\007R\021\0204\032\0020\005¢\006\b\n\000\032\004\b5\020\007R\021\0206\032\0020\005¢\006\b\n\000\032\004\b7\020\007R\021\0208\032\0020\005¢\006\b\n\000\032\004\b9\020\007R\021\020:\032\0020\005¢\006\b\n\000\032\004\b;\020\007R\021\020<\032\0020\005¢\006\b\n\000\032\004\b=\020\007R\021\020>\032\0020\005¢\006\b\n\000\032\004\b?\020\007R\021\020@\032\0020\005¢\006\b\n\000\032\004\bA\020\007R\021\020B\032\0020\005¢\006\b\n\000\032\004\bC\020\007R\021\020D\032\0020\005¢\006\b\n\000\032\004\bE\020\007R\021\020F\032\0020\005¢\006\b\n\000\032\004\bG\020\007R\021\020H\032\0020\005¢\006\b\n\000\032\004\bI\020\007R\021\020J\032\0020\005¢\006\b\n\000\032\004\bK\020\007R\021\020L\032\0020\005¢\006\b\n\000\032\004\bM\020\007R\021\020N\032\0020\005¢\006\b\n\000\032\004\bO\020\007R\021\020P\032\0020\005¢\006\b\n\000\032\004\bQ\020\007R\021\020R\032\0020\005¢\006\b\n\000\032\004\bS\020\007R\021\020T\032\0020\005¢\006\b\n\000\032\004\bU\020\007R\021\020V\032\0020\005¢\006\b\n\000\032\004\bW\020\007R\021\020X\032\0020\005¢\006\b\n\000\032\004\bY\020\007R\021\020Z\032\0020\005¢\006\b\n\000\032\004\b[\020\007R\021\020\\\032\0020\005¢\006\b\n\000\032\004\b]\020\007¨\006^"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;", "Lcom/intellij/ml/llm/matterhorn/settings/PropCollector;", "<init>", "()V", "NEBIUS_CRITIQUE_MODEL", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;", "getNEBIUS_CRITIQUE_MODEL", "()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;", "NEBIUS_CRITIQUE_MODEL_PROVIDER", "getNEBIUS_CRITIQUE_MODEL_PROVIDER", "NEBIUS_CRITIQUE_TEMPERATURE", "getNEBIUS_CRITIQUE_TEMPERATURE", "EDIT_WORKERS_MODEL", "getEDIT_WORKERS_MODEL", "EDIT_WORKERS_MODEL_PROVIDER", "getEDIT_WORKERS_MODEL_PROVIDER", "EDIT_WORKERS_NUM_REFLECTIONS", "getEDIT_WORKERS_NUM_REFLECTIONS", "EDIT_WORKERS_CRITIQUE", "getEDIT_WORKERS_CRITIQUE", "EDIT_WORKERS_MODEL_NUM_CHOICES", "getEDIT_WORKERS_MODEL_NUM_CHOICES", "EDIT_WORKERS_MODEL_TEMPERATURE", "getEDIT_WORKERS_MODEL_TEMPERATURE", "EDIT_CRITIQUE_MODEL", "getEDIT_CRITIQUE_MODEL", "EDIT_CRITIQUE_MODEL_PROVIDER", "getEDIT_CRITIQUE_MODEL_PROVIDER", "TASK_REPORT_CRITIQUE_MODEL", "getTASK_REPORT_CRITIQUE_MODEL", "TASK_REPORT_CRITIQUE_MODEL_PROVIDER", "getTASK_REPORT_CRITIQUE_MODEL_PROVIDER", "RANKING_CRITIQUE_MODEL", "getRANKING_CRITIQUE_MODEL", "RANKING_CRITIQUE_MODEL_PROVIDER", "getRANKING_CRITIQUE_MODEL_PROVIDER", "RELEVANT_SYMBOL_MODEL", "getRELEVANT_SYMBOL_MODEL", "RELEVANT_SYMBOL_MODEL_PROVIDER", "getRELEVANT_SYMBOL_MODEL_PROVIDER", "RELEVANT_SYMBOL_MODEL_TEMPERATURE", "getRELEVANT_SYMBOL_MODEL_TEMPERATURE", "RELEVANT_SYMBOL_NUM_RESPONSE_TASK_EXTRACTION", "getRELEVANT_SYMBOL_NUM_RESPONSE_TASK_EXTRACTION", "RELEVANT_SYMBOL_MAX_NUM_SEARCH_FOUND_TASK_EXTRACTION", "getRELEVANT_SYMBOL_MAX_NUM_SEARCH_FOUND_TASK_EXTRACTION", "RELEVANT_SYMBOL_MAX_IMPORT_DEPTH_ITERATION", "getRELEVANT_SYMBOL_MAX_IMPORT_DEPTH_ITERATION", "RELEVANT_SYMBOL_NUM_RESPONSE_FIND_FILES", "getRELEVANT_SYMBOL_NUM_RESPONSE_FIND_FILES", "RELEVANT_SYMBOL_NUM_RESPONSE_FIND_SYMBOLS", "getRELEVANT_SYMBOL_NUM_RESPONSE_FIND_SYMBOLS", "RELEVANT_SYMBOL_NUM_RANKED_ANSWERS_FIND_FILES", "getRELEVANT_SYMBOL_NUM_RANKED_ANSWERS_FIND_FILES", "RELEVANT_SYMBOL_NUM_RANKED_ANSWERS_FIND_SYMBOLS", "getRELEVANT_SYMBOL_NUM_RANKED_ANSWERS_FIND_SYMBOLS", "PRIMARY_MODEL", "getPRIMARY_MODEL", "PRIMARY_MODEL_PROVIDER", "getPRIMARY_MODEL_PROVIDER", "PRIMARY_MODEL_PROMPT_CACHE_ENABLED", "getPRIMARY_MODEL_PROMPT_CACHE_ENABLED", "PRIMARY_MODEL_TEMPERATURE", "getPRIMARY_MODEL_TEMPERATURE", "PRIMARY_MODEL_THINKING_BUDGET", "getPRIMARY_MODEL_THINKING_BUDGET", "PRIMARY_MODEL_REASONING_EFFORT", "getPRIMARY_MODEL_REASONING_EFFORT", "PRIMARY_HISTORY_PROCESSOR", "getPRIMARY_HISTORY_PROCESSOR", "PRIMARY_MAX_COMMAND_OUTPUT_LINE_LENGTH", "getPRIMARY_MAX_COMMAND_OUTPUT_LINE_LENGTH", "PRIMARY_MAX_COMMAND_OUTPUT_LINES", "getPRIMARY_MAX_COMMAND_OUTPUT_LINES", "PRIMARY_MODEL_NUM_CHOICES", "getPRIMARY_MODEL_NUM_CHOICES", "PRIMARY_CRITIQUE", "getPRIMARY_CRITIQUE", "PRIMARY_CREATE_REPOMAP", "getPRIMARY_CREATE_REPOMAP", "PRIMARY_USE_EDIT_SUBAGENT", "getPRIMARY_USE_EDIT_SUBAGENT", "PRIMARY_USE_DEMO", "getPRIMARY_USE_DEMO", "PRIMARY_USE_TOOLS", "getPRIMARY_USE_TOOLS", "ADD_PLAN_TO_THOUGHTS", "getADD_PLAN_TO_THOUGHTS", "MAX_STEPS", "getMAX_STEPS", "ALLOW_CALL_EXPERT", "getALLOW_CALL_EXPERT", "ADD_PROJECT_STR", "getADD_PROJECT_STR", "ej-core"})
/*    */ public final class Companion extends PropCollector {
/*    */   @NotNull
/* 10 */   public final MatterhornProperty getNEBIUS_CRITIQUE_MODEL() { return EjProperties.access$getNEBIUS_CRITIQUE_MODEL$cp(); } private Companion() {} @NotNull
/* 11 */   public final MatterhornProperty getNEBIUS_CRITIQUE_MODEL_PROVIDER() { return EjProperties.access$getNEBIUS_CRITIQUE_MODEL_PROVIDER$cp(); } @NotNull
/* 12 */   public final MatterhornProperty getNEBIUS_CRITIQUE_TEMPERATURE() { return EjProperties.access$getNEBIUS_CRITIQUE_TEMPERATURE$cp(); }
/*    */   
/*    */   @NotNull
/* 15 */   public final MatterhornProperty getEDIT_WORKERS_MODEL() { return EjProperties.access$getEDIT_WORKERS_MODEL$cp(); } @NotNull
/* 16 */   public final MatterhornProperty getEDIT_WORKERS_MODEL_PROVIDER() { return EjProperties.access$getEDIT_WORKERS_MODEL_PROVIDER$cp(); } @NotNull
/* 17 */   public final MatterhornProperty getEDIT_WORKERS_NUM_REFLECTIONS() { return EjProperties.access$getEDIT_WORKERS_NUM_REFLECTIONS$cp(); } @NotNull
/* 18 */   public final MatterhornProperty getEDIT_WORKERS_CRITIQUE() { return EjProperties.access$getEDIT_WORKERS_CRITIQUE$cp(); } @NotNull
/* 19 */   public final MatterhornProperty getEDIT_WORKERS_MODEL_NUM_CHOICES() { return EjProperties.access$getEDIT_WORKERS_MODEL_NUM_CHOICES$cp(); } @NotNull
/* 20 */   public final MatterhornProperty getEDIT_WORKERS_MODEL_TEMPERATURE() { return EjProperties.access$getEDIT_WORKERS_MODEL_TEMPERATURE$cp(); }
/*    */   
/*    */   @NotNull
/* 23 */   public final MatterhornProperty getEDIT_CRITIQUE_MODEL() { return EjProperties.access$getEDIT_CRITIQUE_MODEL$cp(); } @NotNull
/* 24 */   public final MatterhornProperty getEDIT_CRITIQUE_MODEL_PROVIDER() { return EjProperties.access$getEDIT_CRITIQUE_MODEL_PROVIDER$cp(); }
/*    */   
/*    */   @NotNull
/* 27 */   public final MatterhornProperty getTASK_REPORT_CRITIQUE_MODEL() { return EjProperties.access$getTASK_REPORT_CRITIQUE_MODEL$cp(); } @NotNull
/* 28 */   public final MatterhornProperty getTASK_REPORT_CRITIQUE_MODEL_PROVIDER() { return EjProperties.access$getTASK_REPORT_CRITIQUE_MODEL_PROVIDER$cp(); }
/*    */   
/*    */   @NotNull
/* 31 */   public final MatterhornProperty getRANKING_CRITIQUE_MODEL() { return EjProperties.access$getRANKING_CRITIQUE_MODEL$cp(); } @NotNull
/* 32 */   public final MatterhornProperty getRANKING_CRITIQUE_MODEL_PROVIDER() { return EjProperties.access$getRANKING_CRITIQUE_MODEL_PROVIDER$cp(); }
/*    */   
/*    */   @NotNull
/* 35 */   public final MatterhornProperty getRELEVANT_SYMBOL_MODEL() { return EjProperties.access$getRELEVANT_SYMBOL_MODEL$cp(); } @NotNull
/* 36 */   public final MatterhornProperty getRELEVANT_SYMBOL_MODEL_PROVIDER() { return EjProperties.access$getRELEVANT_SYMBOL_MODEL_PROVIDER$cp(); } @NotNull
/* 37 */   public final MatterhornProperty getRELEVANT_SYMBOL_MODEL_TEMPERATURE() { return EjProperties.access$getRELEVANT_SYMBOL_MODEL_TEMPERATURE$cp(); } @NotNull
/* 38 */   public final MatterhornProperty getRELEVANT_SYMBOL_NUM_RESPONSE_TASK_EXTRACTION() { return EjProperties.access$getRELEVANT_SYMBOL_NUM_RESPONSE_TASK_EXTRACTION$cp(); } @NotNull
/* 39 */   public final MatterhornProperty getRELEVANT_SYMBOL_MAX_NUM_SEARCH_FOUND_TASK_EXTRACTION() { return EjProperties.access$getRELEVANT_SYMBOL_MAX_NUM_SEARCH_FOUND_TASK_EXTRACTION$cp(); } @NotNull
/* 40 */   public final MatterhornProperty getRELEVANT_SYMBOL_MAX_IMPORT_DEPTH_ITERATION() { return EjProperties.access$getRELEVANT_SYMBOL_MAX_IMPORT_DEPTH_ITERATION$cp(); } @NotNull
/* 41 */   public final MatterhornProperty getRELEVANT_SYMBOL_NUM_RESPONSE_FIND_FILES() { return EjProperties.access$getRELEVANT_SYMBOL_NUM_RESPONSE_FIND_FILES$cp(); } @NotNull
/* 42 */   public final MatterhornProperty getRELEVANT_SYMBOL_NUM_RESPONSE_FIND_SYMBOLS() { return EjProperties.access$getRELEVANT_SYMBOL_NUM_RESPONSE_FIND_SYMBOLS$cp(); } @NotNull
/* 43 */   public final MatterhornProperty getRELEVANT_SYMBOL_NUM_RANKED_ANSWERS_FIND_FILES() { return EjProperties.access$getRELEVANT_SYMBOL_NUM_RANKED_ANSWERS_FIND_FILES$cp(); } @NotNull
/* 44 */   public final MatterhornProperty getRELEVANT_SYMBOL_NUM_RANKED_ANSWERS_FIND_SYMBOLS() { return EjProperties.access$getRELEVANT_SYMBOL_NUM_RANKED_ANSWERS_FIND_SYMBOLS$cp(); }
/*    */   
/*    */   @NotNull
/* 47 */   public final MatterhornProperty getPRIMARY_MODEL() { return EjProperties.access$getPRIMARY_MODEL$cp(); } @NotNull
/* 48 */   public final MatterhornProperty getPRIMARY_MODEL_PROVIDER() { return EjProperties.access$getPRIMARY_MODEL_PROVIDER$cp(); } @NotNull
/* 49 */   public final MatterhornProperty getPRIMARY_MODEL_PROMPT_CACHE_ENABLED() { return EjProperties.access$getPRIMARY_MODEL_PROMPT_CACHE_ENABLED$cp(); } @NotNull
/* 50 */   public final MatterhornProperty getPRIMARY_MODEL_TEMPERATURE() { return EjProperties.access$getPRIMARY_MODEL_TEMPERATURE$cp(); } @NotNull
/* 51 */   public final MatterhornProperty getPRIMARY_MODEL_THINKING_BUDGET() { return EjProperties.access$getPRIMARY_MODEL_THINKING_BUDGET$cp(); } @NotNull
/* 52 */   public final MatterhornProperty getPRIMARY_MODEL_REASONING_EFFORT() { return EjProperties.access$getPRIMARY_MODEL_REASONING_EFFORT$cp(); } @NotNull
/* 53 */   public final MatterhornProperty getPRIMARY_HISTORY_PROCESSOR() { return EjProperties.access$getPRIMARY_HISTORY_PROCESSOR$cp(); } @NotNull
/* 54 */   public final MatterhornProperty getPRIMARY_MAX_COMMAND_OUTPUT_LINE_LENGTH() { return EjProperties.access$getPRIMARY_MAX_COMMAND_OUTPUT_LINE_LENGTH$cp(); } @NotNull
/* 55 */   public final MatterhornProperty getPRIMARY_MAX_COMMAND_OUTPUT_LINES() { return EjProperties.access$getPRIMARY_MAX_COMMAND_OUTPUT_LINES$cp(); } @NotNull
/* 56 */   public final MatterhornProperty getPRIMARY_MODEL_NUM_CHOICES() { return EjProperties.access$getPRIMARY_MODEL_NUM_CHOICES$cp(); } @NotNull
/* 57 */   public final MatterhornProperty getPRIMARY_CRITIQUE() { return EjProperties.access$getPRIMARY_CRITIQUE$cp(); } @NotNull
/* 58 */   public final MatterhornProperty getPRIMARY_CREATE_REPOMAP() { return EjProperties.access$getPRIMARY_CREATE_REPOMAP$cp(); } @NotNull
/* 59 */   public final MatterhornProperty getPRIMARY_USE_EDIT_SUBAGENT() { return EjProperties.access$getPRIMARY_USE_EDIT_SUBAGENT$cp(); } @NotNull
/* 60 */   public final MatterhornProperty getPRIMARY_USE_DEMO() { return EjProperties.access$getPRIMARY_USE_DEMO$cp(); } @NotNull
/* 61 */   public final MatterhornProperty getPRIMARY_USE_TOOLS() { return EjProperties.access$getPRIMARY_USE_TOOLS$cp(); } @NotNull
/* 62 */   public final MatterhornProperty getADD_PLAN_TO_THOUGHTS() { return EjProperties.access$getADD_PLAN_TO_THOUGHTS$cp(); } @NotNull
/* 63 */   public final MatterhornProperty getMAX_STEPS() { return EjProperties.access$getMAX_STEPS$cp(); } @NotNull
/* 64 */   public final MatterhornProperty getALLOW_CALL_EXPERT() { return EjProperties.access$getALLOW_CALL_EXPERT$cp(); } @NotNull
/* 65 */   public final MatterhornProperty getADD_PROJECT_STR() { return EjProperties.access$getADD_PROJECT_STR$cp(); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\EjProperties$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */