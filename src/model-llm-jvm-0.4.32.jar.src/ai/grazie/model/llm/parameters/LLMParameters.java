/*     */ package ai.grazie.model.llm.parameters;
/*     */ 
/*     */ import ai.grazie.utils.attributes.Attributes;
/*     */ import java.util.Set;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.SetsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\016\n\002\030\002\n\002\b\013\n\002\030\002\n\002\b\007\n\002\020\"\n\002\030\002\n\002\b\005\bÇ\002\030\0002\0020\001:\0010B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\f\020\006R\021\020\r\032\0020\004¢\006\b\n\000\032\004\b\016\020\006R\021\020\017\032\0020\b¢\006\b\n\000\032\004\b\020\020\nR\034\020\021\032\0020\b8\006X\004¢\006\016\n\000\022\004\b\022\020\002\032\004\b\023\020\nR\021\020\024\032\0020\b¢\006\b\n\000\032\004\b\025\020\nR\021\020\026\032\0020\027¢\006\b\n\000\032\004\b\030\020\031R\021\020\032\032\0020\027¢\006\b\n\000\032\004\b\033\020\031R\021\020\034\032\0020\004¢\006\b\n\000\032\004\b\035\020\006R\021\020\036\032\0020\b¢\006\b\n\000\032\004\b\037\020\nR\021\020 \032\0020\027¢\006\b\n\000\032\004\b!\020\031R\021\020\"\032\0020#¢\006\b\n\000\032\004\b$\020%R\021\020&\032\0020\b¢\006\b\n\000\032\004\b'\020\nR\021\020(\032\0020#¢\006\b\n\000\032\004\b)\020%R\035\020*\032\b\022\004\022\0020,0+¢\006\016\n\000\022\004\b-\020\002\032\004\b.\020/¨\0061"}, d2 = {"Lai/grazie/model/llm/parameters/LLMParameters;", "", "()V", "CachePoints", "Lai/grazie/utils/attributes/Attributes$Key$Json;", "getCachePoints", "()Lai/grazie/utils/attributes/Attributes$Key$Json;", "Dimension", "Lai/grazie/utils/attributes/Attributes$Key$Long;", "getDimension", "()Lai/grazie/utils/attributes/Attributes$Key$Long;", "FunctionCall", "getFunctionCall", "Functions", "getFunctions", "Length", "getLength", "NoRepeat", "getNoRepeat$annotations", "getNoRepeat", "NumberOfChoices", "getNumberOfChoices", "PredictedOutput", "Lai/grazie/utils/attributes/Attributes$Key$Text;", "getPredictedOutput", "()Lai/grazie/utils/attributes/Attributes$Key$Text;", "ReasoningEffort", "getReasoningEffort", "ResponseFormat", "getResponseFormat", "Seed", "getSeed", "StopToken", "getStopToken", "Temperature", "Lai/grazie/utils/attributes/Attributes$Key$Double;", "getTemperature", "()Lai/grazie/utils/attributes/Attributes$Key$Double;", "TopK", "getTopK", "TopP", "getTopP", "allKeys", "", "Lai/grazie/utils/attributes/Attributes$Key;", "getAllKeys$annotations", "getAllKeys", "()Ljava/util/Set;", "Completion", "model-llm"})
/*     */ public final class LLMParameters
/*     */ {
/*     */   @NotNull
/*  17 */   public static final LLMParameters INSTANCE = new LLMParameters(); @NotNull private static final Attributes.Key.Double Temperature = new Attributes.Key.Double("llm.parameters.temperature"); @NotNull public final Attributes.Key.Double getTemperature() { return Temperature; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  22 */   private static final Attributes.Key.Json Functions = new Attributes.Key.Json("llm.parameters.functions", null, 2, null); @NotNull public final Attributes.Key.Json getFunctions() { return Functions; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  27 */   private static final Attributes.Key.Json FunctionCall = new Attributes.Key.Json("llm.parameters.function.mode", null, 2, null); @NotNull public final Attributes.Key.Json getFunctionCall() { return FunctionCall; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  32 */   private static final Attributes.Key.Long Length = new Attributes.Key.Long("llm.parameters.length"); @NotNull public final Attributes.Key.Long getLength() { return Length; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  37 */   private static final Attributes.Key.Text StopToken = new Attributes.Key.Text("llm.parameters.stop-token", null, 2, null); @NotNull public final Attributes.Key.Text getStopToken() { return StopToken; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  43 */   private static final Attributes.Key.Long NoRepeat = new Attributes.Key.Long("llm.parameters.no-repeat"); @NotNull public final Attributes.Key.Long getNoRepeat() { return NoRepeat; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  48 */   private static final Attributes.Key.Long Seed = new Attributes.Key.Long("llm.parameters.seed"); @NotNull public final Attributes.Key.Long getSeed() { return Seed; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  53 */   private static final Attributes.Key.Double TopP = new Attributes.Key.Double("llm.parameters.top-p"); @NotNull public final Attributes.Key.Double getTopP() { return TopP; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  58 */   private static final Attributes.Key.Long TopK = new Attributes.Key.Long("llm.parameters.top-k"); @NotNull public final Attributes.Key.Long getTopK() { return TopK; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  63 */   private static final Attributes.Key.Long Dimension = new Attributes.Key.Long("llm.parameters.dimension"); @NotNull public final Attributes.Key.Long getDimension() { return Dimension; }
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
/*  82 */   private static final Attributes.Key.Json ResponseFormat = new Attributes.Key.Json("llm.parameters.response-format", null, 2, null); @NotNull public final Attributes.Key.Json getResponseFormat() { return ResponseFormat; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  90 */   private static final Attributes.Key.Text PredictedOutput = new Attributes.Key.Text("llm.parameters.predicted-output", null, 2, null); @NotNull public final Attributes.Key.Text getPredictedOutput() { return PredictedOutput; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*  95 */   private static final Attributes.Key.Text ReasoningEffort = new Attributes.Key.Text("llm.parameters.reasoning-effort", null, 2, null); @NotNull public final Attributes.Key.Text getReasoningEffort() { return ReasoningEffort; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 100 */   private static final Attributes.Key.Long NumberOfChoices = new Attributes.Key.Long("llm.parameters.number-of-choices"); @NotNull public final Attributes.Key.Long getNumberOfChoices() { return NumberOfChoices; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 109 */   private static final Attributes.Key.Json CachePoints = new Attributes.Key.Json("llm.parameters.cache-points", null, 2, null); @NotNull public final Attributes.Key.Json getCachePoints() { return CachePoints; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final Set<Attributes.Key> allKeys;
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\t"}, d2 = {"Lai/grazie/model/llm/parameters/LLMParameters$Completion;", "", "()V", "codeContext", "Lai/grazie/utils/attributes/Attributes$Key$Text;", "getCodeContext", "()Lai/grazie/utils/attributes/Attributes$Key$Text;", "codeFilename", "getCodeFilename", "model-llm"})
/*     */   public static final class Completion {
/*     */     @NotNull
/* 118 */     public static final Completion INSTANCE = new Completion(); @NotNull private static final Attributes.Key.Text codeFilename = new Attributes.Key.Text("llm.parameters.completion.code.filename", null, 2, null); @NotNull public final Attributes.Key.Text getCodeFilename() { return codeFilename; }
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/* 123 */     private static final Attributes.Key.Text codeContext = new Attributes.Key.Text("llm.parameters.completion.code.context", null, 2, null); @NotNull public final Attributes.Key.Text getCodeContext() { return codeContext; }
/*     */      }
/*     */   
/*     */   @NotNull
/* 127 */   public final Set<Attributes.Key> getAllKeys() { return allKeys; } static {
/* 128 */     Attributes.Key[] arrayOfKey = new Attributes.Key[17]; arrayOfKey[0] = (Attributes.Key)Temperature; arrayOfKey[1] = 
/* 129 */       (Attributes.Key)Functions;
/* 130 */     arrayOfKey[2] = (Attributes.Key)FunctionCall;
/* 131 */     arrayOfKey[3] = (Attributes.Key)Length;
/* 132 */     arrayOfKey[4] = (Attributes.Key)StopToken;
/* 133 */     arrayOfKey[5] = (Attributes.Key)NoRepeat;
/* 134 */     arrayOfKey[6] = (Attributes.Key)TopP;
/* 135 */     arrayOfKey[7] = (Attributes.Key)TopK;
/* 136 */     arrayOfKey[8] = (Attributes.Key)Seed;
/* 137 */     arrayOfKey[9] = (Attributes.Key)Dimension;
/* 138 */     arrayOfKey[10] = (Attributes.Key)Completion.INSTANCE.getCodeFilename();
/* 139 */     arrayOfKey[11] = (Attributes.Key)Completion.INSTANCE.getCodeContext();
/* 140 */     arrayOfKey[12] = (Attributes.Key)ResponseFormat;
/* 141 */     arrayOfKey[13] = (Attributes.Key)PredictedOutput;
/* 142 */     arrayOfKey[14] = (Attributes.Key)ReasoningEffort;
/* 143 */     arrayOfKey[15] = (Attributes.Key)NumberOfChoices;
/* 144 */     arrayOfKey[16] = (Attributes.Key)CachePoints;
/*     */     allKeys = SetsKt.setOf((Object[])arrayOfKey);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\parameters\LLMParameters.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */