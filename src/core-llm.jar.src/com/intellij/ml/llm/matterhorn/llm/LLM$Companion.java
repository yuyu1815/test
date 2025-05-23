/*     */ package com.intellij.ml.llm.matterhorn.llm;
/*     */ 
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.KSerializer;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b1\n\002\020!\n\002\b\004\n\002\020\013\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020=\032\0020>2\006\020?\032\0020\007J\f\020@\032\b\022\004\022\0020\0070AR\016\020\004\032\0020\005X\004¢\006\002\n\000R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\b\020\tR\021\020\n\032\0020\007¢\006\b\n\000\032\004\b\013\020\tR\021\020\f\032\0020\007¢\006\b\n\000\032\004\b\r\020\tR\021\020\016\032\0020\007¢\006\b\n\000\032\004\b\017\020\tR\021\020\020\032\0020\007¢\006\b\n\000\032\004\b\021\020\tR\021\020\022\032\0020\007¢\006\b\n\000\032\004\b\023\020\tR\021\020\024\032\0020\007¢\006\b\n\000\032\004\b\025\020\tR\021\020\026\032\0020\007¢\006\b\n\000\032\004\b\027\020\tR\021\020\030\032\0020\007¢\006\b\n\000\032\004\b\031\020\tR\021\020\032\032\0020\007¢\006\b\n\000\032\004\b\033\020\tR\021\020\034\032\0020\007¢\006\b\n\000\032\004\b\035\020\tR\021\020\036\032\0020\007¢\006\b\n\000\032\004\b\037\020\tR\021\020 \032\0020\007¢\006\b\n\000\032\004\b!\020\tR\021\020\"\032\0020\007¢\006\b\n\000\032\004\b#\020\tR\021\020$\032\0020\007¢\006\b\n\000\032\004\b%\020\tR\021\020&\032\0020\007¢\006\b\n\000\032\004\b'\020\tR\021\020(\032\0020\007¢\006\b\n\000\032\004\b)\020\tR\021\020*\032\0020\007¢\006\b\n\000\032\004\b+\020\tR\021\020,\032\0020\007¢\006\b\n\000\032\004\b-\020\tR\021\020.\032\0020\007¢\006\b\n\000\032\004\b/\020\tR\021\0200\032\0020\007¢\006\b\n\000\032\004\b1\020\tR\021\0202\032\0020\007¢\006\b\n\000\032\004\b3\020\tR\021\0204\032\0020\007¢\006\b\n\000\032\004\b5\020\tR\021\0206\032\0020\007¢\006\b\n\000\032\004\b7\020\tR\024\0208\032\b\022\004\022\0020\00709X\004¢\006\002\n\000R\027\020:\032\b\022\004\022\0020\00709¢\006\b\n\000\032\004\b;\020<¨\006B"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/LLM$Companion;", "", "<init>", "()V", "CLAUDE_SONNET_3_5_VISION", "Lcom/intellij/ml/llm/matterhorn/llm/LLMVision;", "GPT_3_5_TURBO", "Lcom/intellij/ml/llm/matterhorn/llm/LLM;", "getGPT_3_5_TURBO", "()Lcom/intellij/ml/llm/matterhorn/llm/LLM;", "GPT_4_TURBO_2024_04_09", "getGPT_4_TURBO_2024_04_09", "GPT_4_O", "getGPT_4_O", "GPT_4_O_2024_08_06", "getGPT_4_O_2024_08_06", "GPT_4_O_2024_11_20", "getGPT_4_O_2024_11_20", "GPT_4_O_MINI_2024_07_18", "getGPT_4_O_MINI_2024_07_18", "GPT_4_1_2025_04_14", "getGPT_4_1_2025_04_14", "GPT_4_1_MINI_2025_04_14", "getGPT_4_1_MINI_2025_04_14", "GPT_4_1_NANO_2025_04_14", "getGPT_4_1_NANO_2025_04_14", "GPT_4_5_PREVIEW_2025_02_27", "getGPT_4_5_PREVIEW_2025_02_27", "O1_MINI_2024_09_12", "getO1_MINI_2024_09_12", "O3_2025_04_16", "getO3_2025_04_16", "O3_MINI_2025_01_31", "getO3_MINI_2025_01_31", "O4_MINI_2025_04_16", "getO4_MINI_2025_04_16", "O1_PREVIEW_2024_09_12", "getO1_PREVIEW_2024_09_12", "CLAUDE_SONNET_2024_02_29", "getCLAUDE_SONNET_2024_02_29", "CLAUDE_SONNET_2024_10_22", "getCLAUDE_SONNET_2024_10_22", "CLAUDE_SONNET_3_7_2025_02_19", "getCLAUDE_SONNET_3_7_2025_02_19", "DEEPSEEK_CHAT", "getDEEPSEEK_CHAT", "GEMINI_1206", "getGEMINI_1206", "GEMINI_2_5_PRO_EXP", "getGEMINI_2_5_PRO_EXP", "GEMINI_2_5_PRO_PREVIEW", "getGEMINI_2_5_PRO_PREVIEW", "GEMINI_2_0_FLASH_THINKING", "getGEMINI_2_0_FLASH_THINKING", "NEBIUS_CRITIC_LATEST", "getNEBIUS_CRITIC_LATEST", "registeredModels", "", "knownModels", "getKnownModels", "()Ljava/util/List;", "registerModel", "", "llm", "serializer", "Lkotlinx/serialization/KSerializer;", "core"})
/*     */ @SourceDebugExtension({"SMAP\nModelParameters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelParameters.kt\ncom/intellij/ml/llm/matterhorn/llm/LLM$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,254:1\n1755#2,3:255\n*S KotlinDebug\n*F\n+ 1 ModelParameters.kt\ncom/intellij/ml/llm/matterhorn/llm/LLM$Companion\n*L\n158#1:255,3\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @NotNull
/*     */   public final KSerializer<LLM> serializer() {
/*  84 */     return (KSerializer<LLM>)LLM.$serializer.INSTANCE;
/*     */   }
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
/*     */   @NotNull
/*     */   public final LLM getGPT_3_5_TURBO() {
/*  99 */     return LLM.access$getGPT_3_5_TURBO$cp(); } @NotNull
/* 100 */   public final LLM getGPT_4_TURBO_2024_04_09() { return LLM.access$getGPT_4_TURBO_2024_04_09$cp(); } @NotNull
/* 101 */   public final LLM getGPT_4_O() { return LLM.access$getGPT_4_O$cp(); } @NotNull
/* 102 */   public final LLM getGPT_4_O_2024_08_06() { return LLM.access$getGPT_4_O_2024_08_06$cp(); } @NotNull
/* 103 */   public final LLM getGPT_4_O_2024_11_20() { return LLM.access$getGPT_4_O_2024_11_20$cp(); } @NotNull
/* 104 */   public final LLM getGPT_4_O_MINI_2024_07_18() { return LLM.access$getGPT_4_O_MINI_2024_07_18$cp(); } @NotNull
/* 105 */   public final LLM getGPT_4_1_2025_04_14() { return LLM.access$getGPT_4_1_2025_04_14$cp(); } @NotNull
/* 106 */   public final LLM getGPT_4_1_MINI_2025_04_14() { return LLM.access$getGPT_4_1_MINI_2025_04_14$cp(); } @NotNull
/* 107 */   public final LLM getGPT_4_1_NANO_2025_04_14() { return LLM.access$getGPT_4_1_NANO_2025_04_14$cp(); } @NotNull
/* 108 */   public final LLM getGPT_4_5_PREVIEW_2025_02_27() { return LLM.access$getGPT_4_5_PREVIEW_2025_02_27$cp(); } @NotNull
/* 109 */   public final LLM getO1_MINI_2024_09_12() { return LLM.access$getO1_MINI_2024_09_12$cp(); } @NotNull
/* 110 */   public final LLM getO3_2025_04_16() { return LLM.access$getO3_2025_04_16$cp(); } @NotNull
/* 111 */   public final LLM getO3_MINI_2025_01_31() { return LLM.access$getO3_MINI_2025_01_31$cp(); } @NotNull
/* 112 */   public final LLM getO4_MINI_2025_04_16() { return LLM.access$getO4_MINI_2025_04_16$cp(); } @NotNull
/* 113 */   public final LLM getO1_PREVIEW_2024_09_12() { return LLM.access$getO1_PREVIEW_2024_09_12$cp(); } @NotNull
/* 114 */   public final LLM getCLAUDE_SONNET_2024_02_29() { return LLM.access$getCLAUDE_SONNET_2024_02_29$cp(); } @NotNull
/* 115 */   public final LLM getCLAUDE_SONNET_2024_10_22() { return LLM.access$getCLAUDE_SONNET_2024_10_22$cp(); } @NotNull
/* 116 */   public final LLM getCLAUDE_SONNET_3_7_2025_02_19() { return LLM.access$getCLAUDE_SONNET_3_7_2025_02_19$cp(); } @NotNull
/* 117 */   public final LLM getDEEPSEEK_CHAT() { return LLM.access$getDEEPSEEK_CHAT$cp(); } @NotNull
/* 118 */   public final LLM getGEMINI_1206() { return LLM.access$getGEMINI_1206$cp(); } @NotNull
/* 119 */   public final LLM getGEMINI_2_5_PRO_EXP() { return LLM.access$getGEMINI_2_5_PRO_EXP$cp(); } @NotNull
/* 120 */   public final LLM getGEMINI_2_5_PRO_PREVIEW() { return LLM.access$getGEMINI_2_5_PRO_PREVIEW$cp(); }
/*     */    @NotNull
/*     */   public final LLM getGEMINI_2_0_FLASH_THINKING() {
/* 123 */     return LLM.access$getGEMINI_2_0_FLASH_THINKING$cp();
/*     */   } @NotNull
/*     */   public final LLM getNEBIUS_CRITIC_LATEST() {
/* 126 */     return LLM.access$getNEBIUS_CRITIC_LATEST$cp();
/*     */   }
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
/*     */   
/*     */   @NotNull
/*     */   public final List<LLM> getKnownModels() {
/* 155 */     return LLM.access$getKnownModels$cp();
/*     */   }
/*     */   
/*     */   public final boolean registerModel(@NotNull LLM llm) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'llm'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: invokestatic access$getRegisteredModels$cp : ()Ljava/util/List;
/*     */     //   9: checkcast java/lang/Iterable
/*     */     //   12: astore_2
/*     */     //   13: iconst_0
/*     */     //   14: istore_3
/*     */     //   15: aload_2
/*     */     //   16: instanceof java/util/Collection
/*     */     //   19: ifeq -> 38
/*     */     //   22: aload_2
/*     */     //   23: checkcast java/util/Collection
/*     */     //   26: invokeinterface isEmpty : ()Z
/*     */     //   31: ifeq -> 38
/*     */     //   34: iconst_0
/*     */     //   35: goto -> 95
/*     */     //   38: aload_2
/*     */     //   39: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   44: astore #4
/*     */     //   46: aload #4
/*     */     //   48: invokeinterface hasNext : ()Z
/*     */     //   53: ifeq -> 94
/*     */     //   56: aload #4
/*     */     //   58: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   63: astore #5
/*     */     //   65: aload #5
/*     */     //   67: checkcast com/intellij/ml/llm/matterhorn/llm/LLM
/*     */     //   70: astore #6
/*     */     //   72: iconst_0
/*     */     //   73: istore #7
/*     */     //   75: aload #6
/*     */     //   77: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   80: aload_1
/*     */     //   81: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   84: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   87: ifeq -> 46
/*     */     //   90: iconst_1
/*     */     //   91: goto -> 95
/*     */     //   94: iconst_0
/*     */     //   95: ifeq -> 100
/*     */     //   98: iconst_0
/*     */     //   99: ireturn
/*     */     //   100: invokestatic access$getRegisteredModels$cp : ()Ljava/util/List;
/*     */     //   103: aload_1
/*     */     //   104: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   109: pop
/*     */     //   110: iconst_1
/*     */     //   111: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #158	-> 6
/*     */     //   #255	-> 15
/*     */     //   #256	-> 38
/*     */     //   #158	-> 75
/*     */     //   #256	-> 87
/*     */     //   #257	-> 94
/*     */     //   #158	-> 95
/*     */     //   #159	-> 98
/*     */     //   #161	-> 100
/*     */     //   #162	-> 110
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   75	12	7	$i$a$-any-LLM$Companion$registerModel$1	I
/*     */     //   72	15	6	it	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   65	29	5	element$iv	Ljava/lang/Object;
/*     */     //   15	80	3	$i$f$any	I
/*     */     //   13	82	2	$this$any$iv	Ljava/lang/Iterable;
/*     */     //   0	112	0	this	Lcom/intellij/ml/llm/matterhorn/llm/LLM$Companion;
/*     */     //   0	112	1	llm	Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\llm\LLM$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */