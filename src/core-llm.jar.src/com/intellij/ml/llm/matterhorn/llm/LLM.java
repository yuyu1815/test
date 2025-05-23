/*     */ package com.intellij.ml.llm.matterhorn.llm;
/*     */ 
/*     */ import java.util.List;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import kotlinx.serialization.internal.StringSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Serializable
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 $2\0020\001:\002$%B)\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\003\022\b\b\002\020\007\032\0020\b¢\006\004\b\t\020\nBC\b\020\022\006\020\013\032\0020\f\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\003\022\b\020\007\032\004\030\0010\b\022\b\020\r\032\004\030\0010\016¢\006\004\b\t\020\017J\b\020\027\032\0020\003H\026J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\001H\002J\b\020\033\032\0020\fH\026J%\020\034\032\0020\0352\006\020\036\032\0020\0002\006\020\037\032\0020 2\006\020!\032\0020\"H\001¢\006\002\b#R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\020\020\021R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\022\020\023R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\024\020\021R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\025\020\026¨\006&"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/LLM;", "", "name", "", "provider", "Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;", "jbai", "capabilities", "Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getName", "()Ljava/lang/String;", "getProvider", "()Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;", "getJbai", "getCapabilities", "()Lcom/intellij/ml/llm/matterhorn/llm/ModelCapabilities;", "toString", "equals", "", "other", "hashCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "Companion", "$serializer", "core"})
/*     */ public final class LLM
/*     */ {
/*     */   @NotNull
/*     */   public final String getName() {
/*     */     return this.name;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final LlmProvider getProvider() {
/*     */     return this.provider;
/*     */   }
/*     */   
/*     */   public LLM(@NotNull String name, @NotNull LlmProvider provider, @NotNull String jbai, @NotNull ModelCapabilities capabilities) {
/*  67 */     this.name = name;
/*  68 */     this.provider = provider;
/*  69 */     this.jbai = jbai;
/*  70 */     this.capabilities = capabilities; } @NotNull public final String getJbai() { return this.jbai; } @NotNull public final ModelCapabilities getCapabilities() { return this.capabilities; }
/*     */    @NotNull
/*     */   public String toString() {
/*  73 */     return this.name;
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*  77 */     return (other instanceof LLM && Intrinsics.areEqual(((LLM)other).name, this.name) && Intrinsics.areEqual(((LLM)other).provider.name(), this.provider.name()));
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*  81 */     return this.name.hashCode(); } @NotNull private final String name; @NotNull
/*     */   private final LlmProvider provider; @NotNull
/*     */   private final String jbai; @NotNull
/*  84 */   public static final Companion Companion = new Companion(null); @NotNull private final ModelCapabilities capabilities; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = LlmProvider.Companion.serializer(); arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b1\n\002\020!\n\002\b\004\n\002\020\013\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020=\032\0020>2\006\020?\032\0020\007J\f\020@\032\b\022\004\022\0020\0070AR\016\020\004\032\0020\005X\004¢\006\002\n\000R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\b\020\tR\021\020\n\032\0020\007¢\006\b\n\000\032\004\b\013\020\tR\021\020\f\032\0020\007¢\006\b\n\000\032\004\b\r\020\tR\021\020\016\032\0020\007¢\006\b\n\000\032\004\b\017\020\tR\021\020\020\032\0020\007¢\006\b\n\000\032\004\b\021\020\tR\021\020\022\032\0020\007¢\006\b\n\000\032\004\b\023\020\tR\021\020\024\032\0020\007¢\006\b\n\000\032\004\b\025\020\tR\021\020\026\032\0020\007¢\006\b\n\000\032\004\b\027\020\tR\021\020\030\032\0020\007¢\006\b\n\000\032\004\b\031\020\tR\021\020\032\032\0020\007¢\006\b\n\000\032\004\b\033\020\tR\021\020\034\032\0020\007¢\006\b\n\000\032\004\b\035\020\tR\021\020\036\032\0020\007¢\006\b\n\000\032\004\b\037\020\tR\021\020 \032\0020\007¢\006\b\n\000\032\004\b!\020\tR\021\020\"\032\0020\007¢\006\b\n\000\032\004\b#\020\tR\021\020$\032\0020\007¢\006\b\n\000\032\004\b%\020\tR\021\020&\032\0020\007¢\006\b\n\000\032\004\b'\020\tR\021\020(\032\0020\007¢\006\b\n\000\032\004\b)\020\tR\021\020*\032\0020\007¢\006\b\n\000\032\004\b+\020\tR\021\020,\032\0020\007¢\006\b\n\000\032\004\b-\020\tR\021\020.\032\0020\007¢\006\b\n\000\032\004\b/\020\tR\021\0200\032\0020\007¢\006\b\n\000\032\004\b1\020\tR\021\0202\032\0020\007¢\006\b\n\000\032\004\b3\020\tR\021\0204\032\0020\007¢\006\b\n\000\032\004\b5\020\tR\021\0206\032\0020\007¢\006\b\n\000\032\004\b7\020\tR\024\0208\032\b\022\004\022\0020\00709X\004¢\006\002\n\000R\027\020:\032\b\022\004\022\0020\00709¢\006\b\n\000\032\004\b;\020<¨\006B"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/LLM$Companion;", "", "<init>", "()V", "CLAUDE_SONNET_3_5_VISION", "Lcom/intellij/ml/llm/matterhorn/llm/LLMVision;", "GPT_3_5_TURBO", "Lcom/intellij/ml/llm/matterhorn/llm/LLM;", "getGPT_3_5_TURBO", "()Lcom/intellij/ml/llm/matterhorn/llm/LLM;", "GPT_4_TURBO_2024_04_09", "getGPT_4_TURBO_2024_04_09", "GPT_4_O", "getGPT_4_O", "GPT_4_O_2024_08_06", "getGPT_4_O_2024_08_06", "GPT_4_O_2024_11_20", "getGPT_4_O_2024_11_20", "GPT_4_O_MINI_2024_07_18", "getGPT_4_O_MINI_2024_07_18", "GPT_4_1_2025_04_14", "getGPT_4_1_2025_04_14", "GPT_4_1_MINI_2025_04_14", "getGPT_4_1_MINI_2025_04_14", "GPT_4_1_NANO_2025_04_14", "getGPT_4_1_NANO_2025_04_14", "GPT_4_5_PREVIEW_2025_02_27", "getGPT_4_5_PREVIEW_2025_02_27", "O1_MINI_2024_09_12", "getO1_MINI_2024_09_12", "O3_2025_04_16", "getO3_2025_04_16", "O3_MINI_2025_01_31", "getO3_MINI_2025_01_31", "O4_MINI_2025_04_16", "getO4_MINI_2025_04_16", "O1_PREVIEW_2024_09_12", "getO1_PREVIEW_2024_09_12", "CLAUDE_SONNET_2024_02_29", "getCLAUDE_SONNET_2024_02_29", "CLAUDE_SONNET_2024_10_22", "getCLAUDE_SONNET_2024_10_22", "CLAUDE_SONNET_3_7_2025_02_19", "getCLAUDE_SONNET_3_7_2025_02_19", "DEEPSEEK_CHAT", "getDEEPSEEK_CHAT", "GEMINI_1206", "getGEMINI_1206", "GEMINI_2_5_PRO_EXP", "getGEMINI_2_5_PRO_EXP", "GEMINI_2_5_PRO_PREVIEW", "getGEMINI_2_5_PRO_PREVIEW", "GEMINI_2_0_FLASH_THINKING", "getGEMINI_2_0_FLASH_THINKING", "NEBIUS_CRITIC_LATEST", "getNEBIUS_CRITIC_LATEST", "registeredModels", "", "knownModels", "getKnownModels", "()Ljava/util/List;", "registerModel", "", "llm", "serializer", "Lkotlinx/serialization/KSerializer;", "core"}) @SourceDebugExtension({"SMAP\nModelParameters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelParameters.kt\ncom/intellij/ml/llm/matterhorn/llm/LLM$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,254:1\n1755#2,3:255\n*S KotlinDebug\n*F\n+ 1 ModelParameters.kt\ncom/intellij/ml/llm/matterhorn/llm/LLM$Companion\n*L\n158#1:255,3\n*E\n"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<LLM> serializer() { return (KSerializer<LLM>)LLM.$serializer.INSTANCE; }
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
/*     */     @NotNull
/*     */     public final LLM getGPT_3_5_TURBO()
/*     */     {
/*  99 */       return LLM.GPT_3_5_TURBO; } @NotNull
/* 100 */     public final LLM getGPT_4_TURBO_2024_04_09() { return LLM.GPT_4_TURBO_2024_04_09; } @NotNull
/* 101 */     public final LLM getGPT_4_O() { return LLM.GPT_4_O; } @NotNull
/* 102 */     public final LLM getGPT_4_O_2024_08_06() { return LLM.GPT_4_O_2024_08_06; } @NotNull
/* 103 */     public final LLM getGPT_4_O_2024_11_20() { return LLM.GPT_4_O_2024_11_20; } @NotNull
/* 104 */     public final LLM getGPT_4_O_MINI_2024_07_18() { return LLM.GPT_4_O_MINI_2024_07_18; } @NotNull
/* 105 */     public final LLM getGPT_4_1_2025_04_14() { return LLM.GPT_4_1_2025_04_14; } @NotNull
/* 106 */     public final LLM getGPT_4_1_MINI_2025_04_14() { return LLM.GPT_4_1_MINI_2025_04_14; } @NotNull
/* 107 */     public final LLM getGPT_4_1_NANO_2025_04_14() { return LLM.GPT_4_1_NANO_2025_04_14; } @NotNull
/* 108 */     public final LLM getGPT_4_5_PREVIEW_2025_02_27() { return LLM.GPT_4_5_PREVIEW_2025_02_27; } @NotNull
/* 109 */     public final LLM getO1_MINI_2024_09_12() { return LLM.O1_MINI_2024_09_12; } @NotNull
/* 110 */     public final LLM getO3_2025_04_16() { return LLM.O3_2025_04_16; } @NotNull
/* 111 */     public final LLM getO3_MINI_2025_01_31() { return LLM.O3_MINI_2025_01_31; } @NotNull
/* 112 */     public final LLM getO4_MINI_2025_04_16() { return LLM.O4_MINI_2025_04_16; } @NotNull
/* 113 */     public final LLM getO1_PREVIEW_2024_09_12() { return LLM.O1_PREVIEW_2024_09_12; } @NotNull
/* 114 */     public final LLM getCLAUDE_SONNET_2024_02_29() { return LLM.CLAUDE_SONNET_2024_02_29; } @NotNull
/* 115 */     public final LLM getCLAUDE_SONNET_2024_10_22() { return LLM.CLAUDE_SONNET_2024_10_22; } @NotNull
/* 116 */     public final LLM getCLAUDE_SONNET_3_7_2025_02_19() { return LLM.CLAUDE_SONNET_3_7_2025_02_19; } @NotNull
/* 117 */     public final LLM getDEEPSEEK_CHAT() { return LLM.DEEPSEEK_CHAT; } @NotNull
/* 118 */     public final LLM getGEMINI_1206() { return LLM.GEMINI_1206; } @NotNull
/* 119 */     public final LLM getGEMINI_2_5_PRO_EXP() { return LLM.GEMINI_2_5_PRO_EXP; } @NotNull
/* 120 */     public final LLM getGEMINI_2_5_PRO_PREVIEW() { return LLM.GEMINI_2_5_PRO_PREVIEW; }
/*     */      @NotNull
/*     */     public final LLM getGEMINI_2_0_FLASH_THINKING() {
/* 123 */       return LLM.GEMINI_2_0_FLASH_THINKING;
/*     */     } @NotNull
/*     */     public final LLM getNEBIUS_CRITIC_LATEST() {
/* 126 */       return LLM.NEBIUS_CRITIC_LATEST;
/*     */     }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final List<LLM> getKnownModels()
/*     */     {
/* 155 */       return LLM.knownModels; } public final boolean registerModel(@NotNull LLM llm) { // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'llm'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: invokestatic access$getRegisteredModels$cp : ()Ljava/util/List;
/*     */       //   9: checkcast java/lang/Iterable
/*     */       //   12: astore_2
/*     */       //   13: iconst_0
/*     */       //   14: istore_3
/*     */       //   15: aload_2
/*     */       //   16: instanceof java/util/Collection
/*     */       //   19: ifeq -> 38
/*     */       //   22: aload_2
/*     */       //   23: checkcast java/util/Collection
/*     */       //   26: invokeinterface isEmpty : ()Z
/*     */       //   31: ifeq -> 38
/*     */       //   34: iconst_0
/*     */       //   35: goto -> 95
/*     */       //   38: aload_2
/*     */       //   39: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   44: astore #4
/*     */       //   46: aload #4
/*     */       //   48: invokeinterface hasNext : ()Z
/*     */       //   53: ifeq -> 94
/*     */       //   56: aload #4
/*     */       //   58: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   63: astore #5
/*     */       //   65: aload #5
/*     */       //   67: checkcast com/intellij/ml/llm/matterhorn/llm/LLM
/*     */       //   70: astore #6
/*     */       //   72: iconst_0
/*     */       //   73: istore #7
/*     */       //   75: aload #6
/*     */       //   77: invokevirtual getName : ()Ljava/lang/String;
/*     */       //   80: aload_1
/*     */       //   81: invokevirtual getName : ()Ljava/lang/String;
/*     */       //   84: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   87: ifeq -> 46
/*     */       //   90: iconst_1
/*     */       //   91: goto -> 95
/*     */       //   94: iconst_0
/*     */       //   95: ifeq -> 100
/*     */       //   98: iconst_0
/*     */       //   99: ireturn
/*     */       //   100: invokestatic access$getRegisteredModels$cp : ()Ljava/util/List;
/*     */       //   103: aload_1
/*     */       //   104: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   109: pop
/*     */       //   110: iconst_1
/*     */       //   111: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #158	-> 6
/*     */       //   #255	-> 15
/*     */       //   #256	-> 38
/*     */       //   #158	-> 75
/*     */       //   #256	-> 87
/*     */       //   #257	-> 94
/*     */       //   #158	-> 95
/*     */       //   #159	-> 98
/*     */       //   #161	-> 100
/*     */       //   #162	-> 110
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   75	12	7	$i$a$-any-LLM$Companion$registerModel$1	I
/*     */       //   72	15	6	it	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */       //   65	29	5	element$iv	Ljava/lang/Object;
/*     */       //   15	80	3	$i$f$any	I
/*     */       //   13	82	2	$this$any$iv	Ljava/lang/Iterable;
/*     */       //   0	112	0	this	Lcom/intellij/ml/llm/matterhorn/llm/LLM$Companion;
/* 155 */       //   0	112	1	llm	Lcom/intellij/ml/llm/matterhorn/llm/LLM; } } @NotNull private static final LLMVision CLAUDE_SONNET_3_5_VISION = new LLMVision(1568, 1198660, 4); @NotNull private static final List<LLM> knownModels = registeredModels;
/*     */   @NotNull
/*     */   private static final LLM GPT_3_5_TURBO;
/*     */   @NotNull
/*     */   private static final LLM GPT_4_TURBO_2024_04_09;
/*     */   @NotNull
/*     */   private static final LLM GPT_4_O;
/*     */   
/*     */   static {
/*     */     LlmProvider llmProvider = LlmProvider.OpenAI;
/*     */     ModelCapabilities modelCapabilities = new ModelCapabilities(0.5D, 1.5D, 0.0D, 0.0D, null, null, false, 124, null);
/*     */     GPT_3_5_TURBO = new LLM("gpt-3.5-turbo", llmProvider, "openai-chat-gpt", modelCapabilities);
/*     */     llmProvider = LlmProvider.OpenAI;
/*     */     modelCapabilities = new ModelCapabilities(10.0D, 30.0D, 0.0D, 0.0D, null, null, false, 124, null);
/*     */     GPT_4_TURBO_2024_04_09 = new LLM("gpt-4-turbo-2024-04-09", llmProvider, "openai-gpt-4-turbo", modelCapabilities);
/*     */     llmProvider = LlmProvider.OpenAI;
/*     */     modelCapabilities = new ModelCapabilities(5.0D, 15.0D, 0.0D, 0.0D, null, null, false, 124, null);
/*     */     GPT_4_O = new LLM("gpt-4o", llmProvider, "openai-gpt-4o", modelCapabilities);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final LLM GPT_4_O_2024_08_06 = new LLM("gpt-4o-2024-08-06", LlmProvider.OpenAI, "openai-gpt-4o", new ModelCapabilities(2.5D, 10.0D, 1.25D, 0.0D, null, null, false, 120, null));
/*     */   @NotNull
/*     */   private static final LLM GPT_4_O_2024_11_20;
/*     */   @NotNull
/*     */   private static final LLM GPT_4_O_MINI_2024_07_18;
/*     */   
/*     */   static {
/*     */     llmProvider = LlmProvider.OpenAI;
/*     */     modelCapabilities = new ModelCapabilities(2.5D, 10.0D, 1.25D, 0.0D, null, null, false, 120, null);
/*     */     GPT_4_O_2024_11_20 = new LLM("gpt-4o-2024-11-20", llmProvider, "openai-gpt-4o", modelCapabilities);
/*     */     llmProvider = LlmProvider.OpenAI;
/*     */     modelCapabilities = new ModelCapabilities(0.15D, 0.6D, 0.075D, 0.0D, null, null, false, 120, null);
/*     */     GPT_4_O_MINI_2024_07_18 = new LLM("gpt-4o-mini-2024-07-18", llmProvider, "openai-gpt-4o-mini", modelCapabilities);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final LLM GPT_4_1_2025_04_14 = new LLM("gpt-4.1-2025-04-14", LlmProvider.OpenAI, "openai-gpt4.1", new ModelCapabilities(2.0D, 8.0D, 0.5D, 0.0D, null, null, false, 120, null));
/*     */   @NotNull
/*     */   private static final LLM GPT_4_1_MINI_2025_04_14 = new LLM("gpt-4.1-mini-2025-04-14", LlmProvider.OpenAI, "openai-gpt4.1-mini", new ModelCapabilities(0.4D, 1.6D, 0.1D, 0.0D, null, null, false, 120, null));
/*     */   @NotNull
/*     */   private static final LLM GPT_4_1_NANO_2025_04_14 = new LLM("gpt-4.1-nano-2025-04-14", LlmProvider.OpenAI, "openai-gpt4.1-nano", new ModelCapabilities(0.1D, 0.4D, 0.025D, 0.0D, null, null, false, 120, null));
/*     */   @NotNull
/*     */   private static final LLM GPT_4_5_PREVIEW_2025_02_27;
/*     */   @NotNull
/*     */   private static final LLM O1_MINI_2024_09_12;
/*     */   @NotNull
/*     */   private static final LLM O3_2025_04_16;
/*     */   @NotNull
/*     */   private static final LLM O3_MINI_2025_01_31;
/*     */   @NotNull
/*     */   private static final LLM O4_MINI_2025_04_16;
/*     */   @NotNull
/*     */   private static final LLM O1_PREVIEW_2024_09_12;
/*     */   @NotNull
/*     */   private static final LLM CLAUDE_SONNET_2024_02_29;
/*     */   @NotNull
/*     */   private static final LLM CLAUDE_SONNET_2024_10_22;
/*     */   @NotNull
/*     */   private static final LLM CLAUDE_SONNET_3_7_2025_02_19;
/*     */   @NotNull
/*     */   private static final LLM DEEPSEEK_CHAT;
/*     */   @NotNull
/*     */   private static final LLM GEMINI_1206;
/*     */   @NotNull
/*     */   private static final LLM GEMINI_2_5_PRO_EXP;
/*     */   @NotNull
/*     */   private static final LLM GEMINI_2_5_PRO_PREVIEW;
/*     */   @NotNull
/*     */   private static final LLM GEMINI_2_0_FLASH_THINKING;
/*     */   @NotNull
/*     */   private static final LLM NEBIUS_CRITIC_LATEST;
/*     */   @NotNull
/*     */   private static final List<LLM> registeredModels;
/*     */   
/*     */   static {
/*     */     llmProvider = LlmProvider.OpenAI;
/*     */     modelCapabilities = new ModelCapabilities(75.0D, 150.0D, 0.0D, 0.0D, null, null, false, 120, null);
/*     */     GPT_4_5_PREVIEW_2025_02_27 = new LLM("gpt-4.5-preview-2025-02-27", llmProvider, "openai-gpt4.5", modelCapabilities);
/*     */     llmProvider = LlmProvider.OpenAI;
/*     */     modelCapabilities = new ModelCapabilities(3.0D, 12.0D, 1.5D, 0.0D, null, null, false, 120, null);
/*     */     O1_MINI_2024_09_12 = new LLM("o1-mini-2024-09-12", llmProvider, "openai-o1-mini", modelCapabilities);
/*     */     llmProvider = LlmProvider.OpenAI;
/*     */     modelCapabilities = new ModelCapabilities(10.0D, 40.0D, 2.5D, 0.0D, null, null, false, 120, null);
/*     */     O3_2025_04_16 = new LLM("o3-2025-04-16", llmProvider, "openai-o3", modelCapabilities);
/*     */     llmProvider = LlmProvider.OpenAI;
/*     */     modelCapabilities = new ModelCapabilities(1.1D, 4.4D, 0.55D, 0.0D, null, null, false, 120, null);
/*     */     O3_MINI_2025_01_31 = new LLM("o3-mini-2025-01-31", llmProvider, "openai-o3-mini", modelCapabilities);
/*     */     llmProvider = LlmProvider.OpenAI;
/*     */     modelCapabilities = new ModelCapabilities(1.1D, 4.4D, 0.275D, 0.0D, null, null, false, 120, null);
/*     */     O4_MINI_2025_04_16 = new LLM("o4-mini-2025-04-16", llmProvider, "openai-o4-mini", modelCapabilities);
/*     */     llmProvider = LlmProvider.OpenAI;
/*     */     modelCapabilities = new ModelCapabilities(15.0D, 60.0D, 7.5D, 0.0D, null, null, false, 120, null);
/*     */     O1_PREVIEW_2024_09_12 = new LLM("o1-preview-2024-09-12", llmProvider, "openai-o1", modelCapabilities);
/*     */     llmProvider = LlmProvider.Anthropic;
/*     */     modelCapabilities = new ModelCapabilities(3.0D, 15.0D, 0.0D, 0.0D, Integer.valueOf(4096), null, true, 44, null);
/*     */     CLAUDE_SONNET_2024_02_29 = new LLM("claude-3-sonnet-20240229", llmProvider, "anthropic-claude-3-sonnet", modelCapabilities);
/*     */     llmProvider = LlmProvider.Anthropic;
/*     */     modelCapabilities = new ModelCapabilities(3.0D, 15.0D, 0.3D, 3.75D, Integer.valueOf(8182), CLAUDE_SONNET_3_5_VISION, true);
/*     */     CLAUDE_SONNET_2024_10_22 = new LLM("claude-3-5-sonnet-20241022", llmProvider, "anthropic-claude-3.5-sonnet", modelCapabilities);
/*     */     llmProvider = LlmProvider.Anthropic;
/*     */     modelCapabilities = new ModelCapabilities(3.0D, 15.0D, 0.3D, 3.75D, Integer.valueOf(64000), CLAUDE_SONNET_3_5_VISION, true);
/*     */     CLAUDE_SONNET_3_7_2025_02_19 = new LLM("claude-3-7-sonnet-20250219", llmProvider, "anthropic-claude-3.7-sonnet", modelCapabilities);
/*     */     llmProvider = LlmProvider.DeepSeek;
/*     */     modelCapabilities = new ModelCapabilities(0.14D, 0.28D, 0.014D, 0.0D, null, null, false, 120, null);
/*     */     DEEPSEEK_CHAT = new LLM("deepseek-chat", llmProvider, "<UNKNOWN>", modelCapabilities);
/*     */     llmProvider = LlmProvider.Google;
/*     */     modelCapabilities = new ModelCapabilities(0.04D, 0.15D, 0.0D, 0.0D, null, null, false, 124, null);
/*     */     GEMINI_1206 = new LLM("gemini-exp-1206", llmProvider, "<UNKNOWN>", modelCapabilities);
/*     */     llmProvider = LlmProvider.Google;
/*     */     modelCapabilities = new ModelCapabilities(0.0D, 0.0D, 0.0D, 0.0D, null, null, false, 124, null);
/*     */     GEMINI_2_5_PRO_EXP = new LLM("gemini-2.5-pro-exp-03-25", llmProvider, "<UNKNOWN>", modelCapabilities);
/*     */     llmProvider = LlmProvider.Google;
/*     */     modelCapabilities = new ModelCapabilities(1.25D, 10.0D, 0.0D, 0.0D, null, null, false, 124, null);
/*     */     GEMINI_2_5_PRO_PREVIEW = new LLM("gemini-2.5-pro-preview-05-06", llmProvider, "<UNKNOWN>", modelCapabilities);
/*     */     llmProvider = LlmProvider.Google;
/*     */     modelCapabilities = new ModelCapabilities(0.0D, 0.0D, 0.0D, 0.0D, null, null, false, 124, null);
/*     */     GEMINI_2_0_FLASH_THINKING = new LLM("gemini-2.0-flash-thinking-exp-01-21", llmProvider, "<UNKNOWN>", modelCapabilities);
/*     */     llmProvider = LlmProvider.Nebius;
/*     */     NEBIUS_CRITIC_LATEST = new LLM("critic_latest", llmProvider, "<UNKNOWN>", null, 8, null);
/*     */     LLM[] arrayOfLLM = new LLM[24];
/*     */     arrayOfLLM[0] = GPT_3_5_TURBO;
/*     */     arrayOfLLM[1] = GPT_4_TURBO_2024_04_09;
/*     */     arrayOfLLM[2] = GPT_4_O;
/*     */     arrayOfLLM[3] = GPT_4_O_MINI_2024_07_18;
/*     */     arrayOfLLM[4] = GPT_4_O_2024_08_06;
/*     */     arrayOfLLM[5] = GPT_4_O_2024_11_20;
/*     */     arrayOfLLM[6] = GPT_4_1_2025_04_14;
/*     */     arrayOfLLM[7] = GPT_4_1_MINI_2025_04_14;
/*     */     arrayOfLLM[8] = GPT_4_1_NANO_2025_04_14;
/*     */     arrayOfLLM[9] = GPT_4_5_PREVIEW_2025_02_27;
/*     */     arrayOfLLM[10] = O1_MINI_2024_09_12;
/*     */     arrayOfLLM[11] = O1_PREVIEW_2024_09_12;
/*     */     arrayOfLLM[12] = O3_2025_04_16;
/*     */     arrayOfLLM[13] = O3_MINI_2025_01_31;
/*     */     arrayOfLLM[14] = O4_MINI_2025_04_16;
/*     */     arrayOfLLM[15] = CLAUDE_SONNET_2024_02_29;
/*     */     arrayOfLLM[16] = CLAUDE_SONNET_2024_10_22;
/*     */     arrayOfLLM[17] = CLAUDE_SONNET_3_7_2025_02_19;
/*     */     arrayOfLLM[18] = DEEPSEEK_CHAT;
/*     */     arrayOfLLM[19] = GEMINI_2_0_FLASH_THINKING;
/*     */     arrayOfLLM[20] = GEMINI_1206;
/*     */     arrayOfLLM[21] = GEMINI_2_5_PRO_PREVIEW;
/*     */     arrayOfLLM[22] = GEMINI_2_5_PRO_EXP;
/*     */     arrayOfLLM[23] = NEBIUS_CRITIC_LATEST;
/*     */     registeredModels = CollectionsKt.mutableListOf((Object[])arrayOfLLM);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\llm\LLM.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */