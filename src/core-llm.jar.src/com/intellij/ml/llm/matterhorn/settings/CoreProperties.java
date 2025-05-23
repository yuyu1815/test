/*     */ package com.intellij.ml.llm.matterhorn.settings;
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b-\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007R\021\020\b\032\0020\005¢\006\b\n\000\032\004\b\t\020\007R\021\020\n\032\0020\005¢\006\b\n\000\032\004\b\013\020\007R\021\020\f\032\0020\005¢\006\b\n\000\032\004\b\r\020\007R\021\020\016\032\0020\005¢\006\b\n\000\032\004\b\017\020\007R\021\020\020\032\0020\005¢\006\b\n\000\032\004\b\021\020\007R\021\020\022\032\0020\005¢\006\b\n\000\032\004\b\023\020\007R\021\020\024\032\0020\005¢\006\b\n\000\032\004\b\025\020\007R\021\020\026\032\0020\005¢\006\b\n\000\032\004\b\027\020\007R\021\020\030\032\0020\005¢\006\b\n\000\032\004\b\031\020\007R\021\020\032\032\0020\005¢\006\b\n\000\032\004\b\033\020\007R\021\020\034\032\0020\005¢\006\b\n\000\032\004\b\035\020\007R\021\020\036\032\0020\005¢\006\b\n\000\032\004\b\037\020\007R\021\020 \032\0020\005¢\006\b\n\000\032\004\b!\020\007R\021\020\"\032\0020\005¢\006\b\n\000\032\004\b#\020\007R\021\020$\032\0020\005¢\006\b\n\000\032\004\b%\020\007R\021\020&\032\0020\005¢\006\b\n\000\032\004\b'\020\007R\021\020(\032\0020\005¢\006\b\n\000\032\004\b)\020\007R\021\020*\032\0020\005¢\006\b\n\000\032\004\b+\020\007R\021\020,\032\0020\005¢\006\b\n\000\032\004\b-\020\007R\021\020.\032\0020\005¢\006\b\n\000\032\004\b/\020\007R\021\0200\032\0020\005¢\006\b\n\000\032\004\b1\020\007¨\0062"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/settings/CoreProperties;", "Lcom/intellij/ml/llm/matterhorn/settings/PropCollector;", "<init>", "()V", "MATTERHORN_DEFAULT_MODEL", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;", "getMATTERHORN_DEFAULT_MODEL", "()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;", "MATTERHORN_DEFAULT_LLM_PROVIDER", "getMATTERHORN_DEFAULT_LLM_PROVIDER", "MATTERHORN_DEFAULT_MODEL_TEMPERATURE", "getMATTERHORN_DEFAULT_MODEL_TEMPERATURE", "MATTERHORN_DEFAULT_MODEL_TOP_P", "getMATTERHORN_DEFAULT_MODEL_TOP_P", "MATTERHORN_LLM_RANDOM_SEED", "getMATTERHORN_LLM_RANDOM_SEED", "MATTERHORN_CAN_READ_FROM_REDIS", "getMATTERHORN_CAN_READ_FROM_REDIS", "MATTERHORN_CAN_WRITE_TO_REDIS", "getMATTERHORN_CAN_WRITE_TO_REDIS", "ANTHROPIC_API_URL", "getANTHROPIC_API_URL", "ANTHROPIC_MODEL_KEY", "getANTHROPIC_MODEL_KEY", "OPENAI_API_URL", "getOPENAI_API_URL", "OPENAI_MODEL_KEY", "getOPENAI_MODEL_KEY", "NEBIUS_API_URL", "getNEBIUS_API_URL", "NEBIUS_MODEL_KEY", "getNEBIUS_MODEL_KEY", "DEEPSEEK_API_URL", "getDEEPSEEK_API_URL", "DEEPSEEK_MODEL_KEY", "getDEEPSEEK_MODEL_KEY", "INGRAZZIO_URL", "getINGRAZZIO_URL", "INGRAZZIO_GITHUB_ACCESS_TOKEN", "getINGRAZZIO_GITHUB_ACCESS_TOKEN", "MATTERHORN_ENVIRONMENT_SERVER_PORT", "getMATTERHORN_ENVIRONMENT_SERVER_PORT", "MATTERHORN_PROJECT_OPEN_FILES", "getMATTERHORN_PROJECT_OPEN_FILES", "MATTERHORN_PROJECT_RECENT_FILES", "getMATTERHORN_PROJECT_RECENT_FILES", "GOOGLE_MODEL_URL", "getGOOGLE_MODEL_URL", "GOOGLE_MODEL_KEY", "getGOOGLE_MODEL_KEY", "core"})
/*     */ public final class CoreProperties extends PropCollector {
/*     */   @NotNull
/*   5 */   public static final CoreProperties INSTANCE = new CoreProperties(); @NotNull private static final MatterhornProperty MATTERHORN_DEFAULT_MODEL = PropCollector.prop$default(INSTANCE, 
/*   6 */       "matterhorn.default.model", 
/*   7 */       "MATTERHORN_DEFAULT_MODEL", null, 4, null); @NotNull
/*     */   public final MatterhornProperty getMATTERHORN_DEFAULT_MODEL() { return MATTERHORN_DEFAULT_MODEL; }
/*     */   @NotNull
/*  10 */   private static final MatterhornProperty MATTERHORN_DEFAULT_LLM_PROVIDER = INSTANCE.prop(
/*  11 */       "matterhorn.default.llm.provider", 
/*  12 */       "MATTERHORN_DEFAULT_MODEL_PROVIDER", 
/*  13 */       "OpenAI"); @NotNull
/*     */   public final MatterhornProperty getMATTERHORN_DEFAULT_LLM_PROVIDER() { return MATTERHORN_DEFAULT_LLM_PROVIDER; }
/*     */   @NotNull
/*  16 */   private static final MatterhornProperty MATTERHORN_DEFAULT_MODEL_TEMPERATURE = PropCollector.prop$default(INSTANCE, 
/*  17 */       "matterhorn.default.model.temperature", 
/*  18 */       "MATTERHORN_DEFAULT_MODEL_TEMPERATURE", null, 4, null); @NotNull
/*     */   public final MatterhornProperty getMATTERHORN_DEFAULT_MODEL_TEMPERATURE() { return MATTERHORN_DEFAULT_MODEL_TEMPERATURE; }
/*     */   @NotNull
/*  21 */   private static final MatterhornProperty MATTERHORN_DEFAULT_MODEL_TOP_P = PropCollector.prop$default(INSTANCE, 
/*  22 */       "matterhorn.default.model.topP", 
/*  23 */       "MATTERHORN_DEFAULT_MODEL_TOP_P", null, 4, null); @NotNull
/*     */   public final MatterhornProperty getMATTERHORN_DEFAULT_MODEL_TOP_P() { return MATTERHORN_DEFAULT_MODEL_TOP_P; }
/*     */   @NotNull
/*  26 */   private static final MatterhornProperty MATTERHORN_LLM_RANDOM_SEED = PropCollector.prop$default(INSTANCE, 
/*  27 */       "matterhorn.default.llm.random.seed", 
/*  28 */       "MATTERHORN_LLM_RANDOM_SEED", null, 4, null); @NotNull
/*     */   public final MatterhornProperty getMATTERHORN_LLM_RANDOM_SEED() { return MATTERHORN_LLM_RANDOM_SEED; }
/*     */   @NotNull
/*  31 */   private static final MatterhornProperty MATTERHORN_CAN_READ_FROM_REDIS = PropCollector.prop$default(INSTANCE, 
/*  32 */       "matterhorn.can.read.from.redis", 
/*  33 */       "MATTERHORN_CAN_READ_FROM_REDIS", null, 4, null); @NotNull
/*     */   public final MatterhornProperty getMATTERHORN_CAN_READ_FROM_REDIS() { return MATTERHORN_CAN_READ_FROM_REDIS; }
/*     */   @NotNull
/*  36 */   private static final MatterhornProperty MATTERHORN_CAN_WRITE_TO_REDIS = PropCollector.prop$default(INSTANCE, 
/*  37 */       "matterhorn.can.write.to.redis", 
/*  38 */       "MATTERHORN_CAN_WRITE_TO_REDIS", null, 4, null); @NotNull
/*     */   public final MatterhornProperty getMATTERHORN_CAN_WRITE_TO_REDIS() { return MATTERHORN_CAN_WRITE_TO_REDIS; }
/*     */   @NotNull
/*  41 */   private static final MatterhornProperty ANTHROPIC_API_URL = PropCollector.prop$default(INSTANCE, 
/*  42 */       "matterhorn.anthropic.model.url", 
/*  43 */       "ANTHROPIC_API_URL", null, 4, null); @NotNull
/*     */   public final MatterhornProperty getANTHROPIC_API_URL() { return ANTHROPIC_API_URL; }
/*     */   @NotNull
/*  46 */   private static final MatterhornProperty ANTHROPIC_MODEL_KEY = PropCollector.prop$default(INSTANCE, 
/*  47 */       "matterhorn.anthropic.model.key", 
/*  48 */       "ANTHROPIC_API_KEY", null, 4, null); @NotNull
/*     */   public final MatterhornProperty getANTHROPIC_MODEL_KEY() { return ANTHROPIC_MODEL_KEY; }
/*     */   @NotNull
/*  51 */   private static final MatterhornProperty OPENAI_API_URL = PropCollector.prop$default(INSTANCE, 
/*  52 */       "matterhorn.openAI.model.url", 
/*  53 */       "OPENAI_API_URL", null, 4, null); @NotNull
/*     */   public final MatterhornProperty getOPENAI_API_URL() { return OPENAI_API_URL; }
/*     */   @NotNull
/*  56 */   private static final MatterhornProperty OPENAI_MODEL_KEY = PropCollector.prop$default(INSTANCE, 
/*  57 */       "matterhorn.openAI.model.key", 
/*  58 */       "OPENAI_API_KEY", null, 4, null); @NotNull
/*     */   public final MatterhornProperty getOPENAI_MODEL_KEY() { return OPENAI_MODEL_KEY; }
/*     */   @NotNull
/*  61 */   private static final MatterhornProperty NEBIUS_API_URL = PropCollector.prop$default(INSTANCE, 
/*  62 */       "matterhorn.nebius.model.url", 
/*  63 */       "NEBIUS_API_URL", null, 4, null); @NotNull
/*     */   public final MatterhornProperty getNEBIUS_API_URL() { return NEBIUS_API_URL; }
/*     */   @NotNull
/*  66 */   private static final MatterhornProperty NEBIUS_MODEL_KEY = PropCollector.prop$default(INSTANCE, 
/*  67 */       "matterhorn.nebius.model.key", 
/*  68 */       "NEBIUS_API_KEY", null, 4, null); @NotNull
/*     */   public final MatterhornProperty getNEBIUS_MODEL_KEY() { return NEBIUS_MODEL_KEY; }
/*     */   @NotNull
/*  71 */   private static final MatterhornProperty DEEPSEEK_API_URL = PropCollector.prop$default(INSTANCE, 
/*  72 */       "matterhorn.deepseek.model.url", 
/*  73 */       "DEEPSEEK_API_URL", null, 4, null); @NotNull
/*     */   public final MatterhornProperty getDEEPSEEK_API_URL() { return DEEPSEEK_API_URL; }
/*     */   @NotNull
/*  76 */   private static final MatterhornProperty DEEPSEEK_MODEL_KEY = PropCollector.prop$default(INSTANCE, 
/*  77 */       "matterhorn.deepseek.model.key", 
/*  78 */       "DEEPSEEK_API_KEY", null, 4, null); @NotNull
/*     */   public final MatterhornProperty getDEEPSEEK_MODEL_KEY() { return DEEPSEEK_MODEL_KEY; }
/*     */   @NotNull
/*  81 */   private static final MatterhornProperty INGRAZZIO_URL = INSTANCE.prop(
/*  82 */       "matterhorn.ingrazzio.url", 
/*  83 */       "INGRAZZIO_URL", 
/*  84 */       "https://ingrazzio.labs.jb.gg"); @NotNull
/*     */   public final MatterhornProperty getINGRAZZIO_URL() { return INGRAZZIO_URL; }
/*     */   @NotNull
/*  87 */   private static final MatterhornProperty INGRAZZIO_GITHUB_ACCESS_TOKEN = PropCollector.prop$default(INSTANCE, 
/*  88 */       "matterhorn.ingrazzio.github.key", 
/*  89 */       "INGRAZZIO_GITHUB_ACCESS_TOKEN", null, 4, null); @NotNull
/*     */   public final MatterhornProperty getINGRAZZIO_GITHUB_ACCESS_TOKEN() { return INGRAZZIO_GITHUB_ACCESS_TOKEN; }
/*     */   @NotNull
/*  92 */   private static final MatterhornProperty MATTERHORN_ENVIRONMENT_SERVER_PORT = PropCollector.prop$default(INSTANCE, 
/*  93 */       "matterhorn.environment.server.port", 
/*  94 */       "MATTERHORN_ENVIRONMENT_SERVER_PORT", null, 4, null);
/*     */   
/*     */   @NotNull
/*  97 */   public final MatterhornProperty getMATTERHORN_PROJECT_OPEN_FILES() { return MATTERHORN_PROJECT_OPEN_FILES; }
/*  98 */   @NotNull public final MatterhornProperty getMATTERHORN_ENVIRONMENT_SERVER_PORT() { return MATTERHORN_ENVIRONMENT_SERVER_PORT; } @NotNull private static final MatterhornProperty MATTERHORN_PROJECT_OPEN_FILES = PropCollector.prop$default(INSTANCE, "matterhorn.project.open.files", "PROJECT_OPEN_FILES", null, 4, null);
/*     */   @NotNull
/* 100 */   public final MatterhornProperty getMATTERHORN_PROJECT_RECENT_FILES() { return MATTERHORN_PROJECT_RECENT_FILES; } @NotNull
/* 101 */   private static final MatterhornProperty MATTERHORN_PROJECT_RECENT_FILES = PropCollector.prop$default(INSTANCE, "matterhorn.project.recent.files", "PROJECT_RECENT_FILES", null, 4, null);
/*     */   @NotNull
/* 103 */   private static final MatterhornProperty GOOGLE_MODEL_URL = PropCollector.prop$default(INSTANCE, 
/* 104 */       "matterhorn.google.model.url", 
/* 105 */       "GOOGLE_API_URL", null, 4, null); @NotNull
/*     */   public final MatterhornProperty getGOOGLE_MODEL_URL() { return GOOGLE_MODEL_URL; }
/*     */   @NotNull
/* 108 */   private static final MatterhornProperty GOOGLE_MODEL_KEY = PropCollector.prop$default(INSTANCE, 
/* 109 */       "matterhorn.google.model.key", 
/* 110 */       "GOOGLE_API_KEY", null, 4, null);
/*     */   
/*     */   @NotNull
/*     */   public final MatterhornProperty getGOOGLE_MODEL_KEY() {
/*     */     return GOOGLE_MODEL_KEY;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\settings\CoreProperties.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */