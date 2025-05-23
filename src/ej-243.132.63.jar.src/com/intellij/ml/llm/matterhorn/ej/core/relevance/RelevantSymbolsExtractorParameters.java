/*     */ package com.intellij.ml.llm.matterhorn.ej.core.relevance;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.llm.LLM;
/*     */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
/*     */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters$;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SerialName;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.IntSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\f\n\002\030\002\n\002\b$\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 D2\0020\001:\002DEBi\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\005\022\b\b\002\020\007\032\0020\005\022\b\b\002\020\b\032\0020\005\022\b\b\002\020\t\032\0020\005\022\b\b\002\020\n\032\0020\005\022\b\b\002\020\013\032\0020\005\022\b\b\002\020\f\032\0020\005\022\b\b\002\020\r\032\0020\005¢\006\004\b\016\020\017Bm\b\020\022\006\020\020\032\0020\005\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\005\022\006\020\b\032\0020\005\022\006\020\t\032\0020\005\022\006\020\n\032\0020\005\022\006\020\013\032\0020\005\022\006\020\f\032\0020\005\022\006\020\r\032\0020\005\022\b\020\021\032\004\030\0010\022¢\006\004\b\016\020\023J\t\020+\032\0020\003HÆ\003J\t\020,\032\0020\005HÆ\003J\t\020-\032\0020\005HÆ\003J\t\020.\032\0020\005HÆ\003J\t\020/\032\0020\005HÆ\003J\t\0200\032\0020\005HÆ\003J\t\0201\032\0020\005HÆ\003J\t\0202\032\0020\005HÆ\003J\t\0203\032\0020\005HÆ\003J\t\0204\032\0020\005HÆ\003Jm\0205\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\0052\b\b\002\020\b\032\0020\0052\b\b\002\020\t\032\0020\0052\b\b\002\020\n\032\0020\0052\b\b\002\020\013\032\0020\0052\b\b\002\020\f\032\0020\0052\b\b\002\020\r\032\0020\005HÆ\001J\023\0206\032\002072\b\0208\032\004\030\0010\001HÖ\003J\t\0209\032\0020\005HÖ\001J\t\020:\032\0020;HÖ\001J%\020<\032\0020=2\006\020>\032\0020\0002\006\020?\032\0020@2\006\020A\032\0020BH\001¢\006\002\bCR\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\024\020\025\032\004\b\026\020\027R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\030\020\025\032\004\b\031\020\032R\034\020\006\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\033\020\025\032\004\b\034\020\032R\034\020\007\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\035\020\025\032\004\b\036\020\032R\034\020\b\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\037\020\025\032\004\b \020\032R\034\020\t\032\0020\0058\006X\004¢\006\016\n\000\022\004\b!\020\025\032\004\b\"\020\032R\034\020\n\032\0020\0058\006X\004¢\006\016\n\000\022\004\b#\020\025\032\004\b$\020\032R\034\020\013\032\0020\0058\006X\004¢\006\016\n\000\022\004\b%\020\025\032\004\b&\020\032R\034\020\f\032\0020\0058\006X\004¢\006\016\n\000\022\004\b'\020\025\032\004\b(\020\032R\034\020\r\032\0020\0058\006X\004¢\006\016\n\000\022\004\b)\020\025\032\004\b*\020\032¨\006F"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;", "", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "numResponseTaskExtraction", "", "maxNumSearchFoundTaskExtraction", "maxImportDepthIteration", "numResponsesRelevantFilesOrdered", "maxAnswersRelevantFiles", "maxRelevantFilesOrdered", "numResponsesRelevantSymbolsOrdered", "maxAnswersRelevantSymbols", "maxRelevantSymbolsOrdered", "<init>", "(Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;IIIIIIIII)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/llm/ModelParameters;IIIIIIIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getModelParameters$annotations", "()V", "getModelParameters", "()Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "getNumResponseTaskExtraction$annotations", "getNumResponseTaskExtraction", "()I", "getMaxNumSearchFoundTaskExtraction$annotations", "getMaxNumSearchFoundTaskExtraction", "getMaxImportDepthIteration$annotations", "getMaxImportDepthIteration", "getNumResponsesRelevantFilesOrdered$annotations", "getNumResponsesRelevantFilesOrdered", "getMaxAnswersRelevantFiles$annotations", "getMaxAnswersRelevantFiles", "getMaxRelevantFilesOrdered$annotations", "getMaxRelevantFilesOrdered", "getNumResponsesRelevantSymbolsOrdered$annotations", "getNumResponsesRelevantSymbolsOrdered", "getMaxAnswersRelevantSymbols$annotations", "getMaxAnswersRelevantSymbols", "getMaxRelevantSymbolsOrdered$annotations", "getMaxRelevantSymbolsOrdered", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "Companion", "$serializer", "ej-core"})
/*     */ public final class RelevantSymbolsExtractorParameters
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final ModelParameters modelParameters;
/*     */   private final int numResponseTaskExtraction;
/*     */   private final int maxNumSearchFoundTaskExtraction;
/*     */   private final int maxImportDepthIteration;
/*     */   private final int numResponsesRelevantFilesOrdered;
/*     */   private final int maxAnswersRelevantFiles;
/*     */   private final int maxRelevantFilesOrdered;
/*     */   private final int numResponsesRelevantSymbolsOrdered;
/*     */   private final int maxAnswersRelevantSymbols;
/*     */   private final int maxRelevantSymbolsOrdered;
/*     */   
/*     */   public RelevantSymbolsExtractorParameters(@NotNull ModelParameters modelParameters, int numResponseTaskExtraction, int maxNumSearchFoundTaskExtraction, int maxImportDepthIteration, int numResponsesRelevantFilesOrdered, int maxAnswersRelevantFiles, int maxRelevantFilesOrdered, int numResponsesRelevantSymbolsOrdered, int maxAnswersRelevantSymbols, int maxRelevantSymbolsOrdered) {
/*  95 */     this.modelParameters = modelParameters;
/*     */ 
/*     */     
/*  98 */     this.numResponseTaskExtraction = numResponseTaskExtraction;
/*     */ 
/*     */     
/* 101 */     this.maxNumSearchFoundTaskExtraction = maxNumSearchFoundTaskExtraction;
/*     */ 
/*     */     
/* 104 */     this.maxImportDepthIteration = maxImportDepthIteration;
/*     */ 
/*     */     
/* 107 */     this.numResponsesRelevantFilesOrdered = numResponsesRelevantFilesOrdered;
/*     */ 
/*     */     
/* 110 */     this.maxAnswersRelevantFiles = maxAnswersRelevantFiles;
/*     */ 
/*     */     
/* 113 */     this.maxRelevantFilesOrdered = maxRelevantFilesOrdered;
/*     */ 
/*     */     
/* 116 */     this.numResponsesRelevantSymbolsOrdered = numResponsesRelevantSymbolsOrdered;
/*     */ 
/*     */     
/* 119 */     this.maxAnswersRelevantSymbols = maxAnswersRelevantSymbols;
/*     */ 
/*     */     
/* 122 */     this.maxRelevantSymbolsOrdered = maxRelevantSymbolsOrdered; } @NotNull public final ModelParameters getModelParameters() { return this.modelParameters; } public final int getNumResponseTaskExtraction() { return this.numResponseTaskExtraction; } public final int getMaxNumSearchFoundTaskExtraction() { return this.maxNumSearchFoundTaskExtraction; } public final int getMaxImportDepthIteration() { return this.maxImportDepthIteration; } public final int getNumResponsesRelevantFilesOrdered() { return this.numResponsesRelevantFilesOrdered; } public final int getMaxAnswersRelevantFiles() { return this.maxAnswersRelevantFiles; } public final int getMaxRelevantFilesOrdered() { return this.maxRelevantFilesOrdered; } public final int getNumResponsesRelevantSymbolsOrdered() { return this.numResponsesRelevantSymbolsOrdered; } public final int getMaxAnswersRelevantSymbols() { return this.maxAnswersRelevantSymbols; } public final int getMaxRelevantSymbolsOrdered() { return this.maxRelevantSymbolsOrdered; }
/*     */   @NotNull public final ModelParameters component1() { return this.modelParameters; }
/*     */   public final int component2() { return this.numResponseTaskExtraction; } public final int component3() { return this.maxNumSearchFoundTaskExtraction; } public final int component4() { return this.maxImportDepthIteration; } public final int component5() { return this.numResponsesRelevantFilesOrdered; } public final int component6() { return this.maxAnswersRelevantFiles; } public final int component7() { return this.maxRelevantFilesOrdered; } public final int component8() { return this.numResponsesRelevantSymbolsOrdered; } public final int component9() { return this.maxAnswersRelevantSymbols; } public final int component10() { return this.maxRelevantSymbolsOrdered; } @NotNull public final RelevantSymbolsExtractorParameters copy(@NotNull ModelParameters modelParameters, int numResponseTaskExtraction, int maxNumSearchFoundTaskExtraction, int maxImportDepthIteration, int numResponsesRelevantFilesOrdered, int maxAnswersRelevantFiles, int maxRelevantFilesOrdered, int numResponsesRelevantSymbolsOrdered, int maxAnswersRelevantSymbols, int maxRelevantSymbolsOrdered) { Intrinsics.checkNotNullParameter(modelParameters, "modelParameters"); return new RelevantSymbolsExtractorParameters(modelParameters, numResponseTaskExtraction, maxNumSearchFoundTaskExtraction, maxImportDepthIteration, numResponsesRelevantFilesOrdered, maxAnswersRelevantFiles, maxRelevantFilesOrdered, numResponsesRelevantSymbolsOrdered, maxAnswersRelevantSymbols, maxRelevantSymbolsOrdered); } @NotNull public String toString() { return "RelevantSymbolsExtractorParameters(modelParameters=" + this.modelParameters + ", numResponseTaskExtraction=" + this.numResponseTaskExtraction + ", maxNumSearchFoundTaskExtraction=" + this.maxNumSearchFoundTaskExtraction + ", maxImportDepthIteration=" + this.maxImportDepthIteration + ", numResponsesRelevantFilesOrdered=" + this.numResponsesRelevantFilesOrdered + ", maxAnswersRelevantFiles=" + this.maxAnswersRelevantFiles + ", maxRelevantFilesOrdered=" + this.maxRelevantFilesOrdered + ", numResponsesRelevantSymbolsOrdered=" + this.numResponsesRelevantSymbolsOrdered + ", maxAnswersRelevantSymbols=" + this.maxAnswersRelevantSymbols + ", maxRelevantSymbolsOrdered=" + this.maxRelevantSymbolsOrdered + ")"; } public int hashCode() { result = this.modelParameters.hashCode(); result = result * 31 + Integer.hashCode(this.numResponseTaskExtraction); result = result * 31 + Integer.hashCode(this.maxNumSearchFoundTaskExtraction); result = result * 31 + Integer.hashCode(this.maxImportDepthIteration); result = result * 31 + Integer.hashCode(this.numResponsesRelevantFilesOrdered); result = result * 31 + Integer.hashCode(this.maxAnswersRelevantFiles); result = result * 31 + Integer.hashCode(this.maxRelevantFilesOrdered); result = result * 31 + Integer.hashCode(this.numResponsesRelevantSymbolsOrdered); result = result * 31 + Integer.hashCode(this.maxAnswersRelevantSymbols); return result * 31 + Integer.hashCode(this.maxRelevantSymbolsOrdered); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof RelevantSymbolsExtractorParameters)) return false;  RelevantSymbolsExtractorParameters relevantSymbolsExtractorParameters = (RelevantSymbolsExtractorParameters)other; return !Intrinsics.areEqual(this.modelParameters, relevantSymbolsExtractorParameters.modelParameters) ? false : ((this.numResponseTaskExtraction != relevantSymbolsExtractorParameters.numResponseTaskExtraction) ? false : ((this.maxNumSearchFoundTaskExtraction != relevantSymbolsExtractorParameters.maxNumSearchFoundTaskExtraction) ? false : ((this.maxImportDepthIteration != relevantSymbolsExtractorParameters.maxImportDepthIteration) ? false : ((this.numResponsesRelevantFilesOrdered != relevantSymbolsExtractorParameters.numResponsesRelevantFilesOrdered) ? false : ((this.maxAnswersRelevantFiles != relevantSymbolsExtractorParameters.maxAnswersRelevantFiles) ? false : ((this.maxRelevantFilesOrdered != relevantSymbolsExtractorParameters.maxRelevantFilesOrdered) ? false : ((this.numResponsesRelevantSymbolsOrdered != relevantSymbolsExtractorParameters.numResponsesRelevantSymbolsOrdered) ? false : ((this.maxAnswersRelevantSymbols != relevantSymbolsExtractorParameters.maxAnswersRelevantSymbols) ? false : (!(this.maxRelevantSymbolsOrdered != relevantSymbolsExtractorParameters.maxRelevantSymbolsOrdered)))))))))); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\032\020\004\032\0020\005*\0020\0052\006\020\006\032\0020\007H@¢\006\002\020\bJ\f\020\t\032\b\022\004\022\0020\0050\n¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters$Companion;", "", "<init>", "()V", "setupFromEnvironment", "Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serializer", "Lkotlinx/serialization/KSerializer;", "ej-core"}) public static final class Companion
/*     */   {
/* 126 */     @NotNull public final KSerializer<RelevantSymbolsExtractorParameters> serializer() { return (KSerializer<RelevantSymbolsExtractorParameters>)RelevantSymbolsExtractorParameters.$serializer.INSTANCE; }
/*     */     
/*     */     private Companion() {}
/*     */     @Nullable
/*     */     public final Object setupFromEnvironment(@NotNull RelevantSymbolsExtractorParameters $this$setupFromEnvironment, @NotNull MatterhornPropertyProvider propertyProvider, @NotNull Continuation $completion) {
/*     */       // Byte code:
/*     */       //   0: aload_3
/*     */       //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters$Companion$setupFromEnvironment$1
/*     */       //   4: ifeq -> 39
/*     */       //   7: aload_3
/*     */       //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters$Companion$setupFromEnvironment$1
/*     */       //   11: astore #6
/*     */       //   13: aload #6
/*     */       //   15: getfield label : I
/*     */       //   18: ldc -2147483648
/*     */       //   20: iand
/*     */       //   21: ifeq -> 39
/*     */       //   24: aload #6
/*     */       //   26: dup
/*     */       //   27: getfield label : I
/*     */       //   30: ldc -2147483648
/*     */       //   32: isub
/*     */       //   33: putfield label : I
/*     */       //   36: goto -> 50
/*     */       //   39: new com/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters$Companion$setupFromEnvironment$1
/*     */       //   42: dup
/*     */       //   43: aload_0
/*     */       //   44: aload_3
/*     */       //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters$Companion;Lkotlin/coroutines/Continuation;)V
/*     */       //   48: astore #6
/*     */       //   50: aload #6
/*     */       //   52: getfield result : Ljava/lang/Object;
/*     */       //   55: astore #5
/*     */       //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   60: astore #7
/*     */       //   62: aload #6
/*     */       //   64: getfield label : I
/*     */       //   67: tableswitch default -> 840, 0 -> 120, 1 -> 196, 2 -> 273, 3 -> 350, 4 -> 427, 5 -> 504, 6 -> 582, 7 -> 660, 8 -> 738, 9 -> 816
/*     */       //   120: aload #5
/*     */       //   122: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   125: new kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   128: dup
/*     */       //   129: invokespecial <init> : ()V
/*     */       //   132: astore #4
/*     */       //   134: aload #4
/*     */       //   136: aload_1
/*     */       //   137: putfield element : Ljava/lang/Object;
/*     */       //   140: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   143: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   146: invokevirtual getRELEVANT_SYMBOL_MODEL : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   149: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   152: invokevirtual getRELEVANT_SYMBOL_MODEL_PROVIDER : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   155: aload_2
/*     */       //   156: aload #4
/*     */       //   158: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   163: aload #6
/*     */       //   165: aload #6
/*     */       //   167: aload_2
/*     */       //   168: putfield L$0 : Ljava/lang/Object;
/*     */       //   171: aload #6
/*     */       //   173: aload #4
/*     */       //   175: putfield L$1 : Ljava/lang/Object;
/*     */       //   178: aload #6
/*     */       //   180: iconst_1
/*     */       //   181: putfield label : I
/*     */       //   184: invokevirtual setupModel : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   187: dup
/*     */       //   188: aload #7
/*     */       //   190: if_acmpne -> 222
/*     */       //   193: aload #7
/*     */       //   195: areturn
/*     */       //   196: aload #6
/*     */       //   198: getfield L$1 : Ljava/lang/Object;
/*     */       //   201: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   204: astore #4
/*     */       //   206: aload #6
/*     */       //   208: getfield L$0 : Ljava/lang/Object;
/*     */       //   211: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   214: astore_2
/*     */       //   215: aload #5
/*     */       //   217: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   220: aload #5
/*     */       //   222: pop
/*     */       //   223: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   226: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   229: invokevirtual getRELEVANT_SYMBOL_MODEL_TEMPERATURE : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   232: aload_2
/*     */       //   233: aload #4
/*     */       //   235: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   240: aload #6
/*     */       //   242: aload #6
/*     */       //   244: aload_2
/*     */       //   245: putfield L$0 : Ljava/lang/Object;
/*     */       //   248: aload #6
/*     */       //   250: aload #4
/*     */       //   252: putfield L$1 : Ljava/lang/Object;
/*     */       //   255: aload #6
/*     */       //   257: iconst_2
/*     */       //   258: putfield label : I
/*     */       //   261: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   264: dup
/*     */       //   265: aload #7
/*     */       //   267: if_acmpne -> 299
/*     */       //   270: aload #7
/*     */       //   272: areturn
/*     */       //   273: aload #6
/*     */       //   275: getfield L$1 : Ljava/lang/Object;
/*     */       //   278: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   281: astore #4
/*     */       //   283: aload #6
/*     */       //   285: getfield L$0 : Ljava/lang/Object;
/*     */       //   288: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   291: astore_2
/*     */       //   292: aload #5
/*     */       //   294: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   297: aload #5
/*     */       //   299: pop
/*     */       //   300: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   303: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   306: invokevirtual getRELEVANT_SYMBOL_NUM_RESPONSE_TASK_EXTRACTION : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   309: aload_2
/*     */       //   310: aload #4
/*     */       //   312: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   317: aload #6
/*     */       //   319: aload #6
/*     */       //   321: aload_2
/*     */       //   322: putfield L$0 : Ljava/lang/Object;
/*     */       //   325: aload #6
/*     */       //   327: aload #4
/*     */       //   329: putfield L$1 : Ljava/lang/Object;
/*     */       //   332: aload #6
/*     */       //   334: iconst_3
/*     */       //   335: putfield label : I
/*     */       //   338: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   341: dup
/*     */       //   342: aload #7
/*     */       //   344: if_acmpne -> 376
/*     */       //   347: aload #7
/*     */       //   349: areturn
/*     */       //   350: aload #6
/*     */       //   352: getfield L$1 : Ljava/lang/Object;
/*     */       //   355: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   358: astore #4
/*     */       //   360: aload #6
/*     */       //   362: getfield L$0 : Ljava/lang/Object;
/*     */       //   365: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   368: astore_2
/*     */       //   369: aload #5
/*     */       //   371: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   374: aload #5
/*     */       //   376: pop
/*     */       //   377: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   380: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   383: invokevirtual getRELEVANT_SYMBOL_MAX_NUM_SEARCH_FOUND_TASK_EXTRACTION : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   386: aload_2
/*     */       //   387: aload #4
/*     */       //   389: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   394: aload #6
/*     */       //   396: aload #6
/*     */       //   398: aload_2
/*     */       //   399: putfield L$0 : Ljava/lang/Object;
/*     */       //   402: aload #6
/*     */       //   404: aload #4
/*     */       //   406: putfield L$1 : Ljava/lang/Object;
/*     */       //   409: aload #6
/*     */       //   411: iconst_4
/*     */       //   412: putfield label : I
/*     */       //   415: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   418: dup
/*     */       //   419: aload #7
/*     */       //   421: if_acmpne -> 453
/*     */       //   424: aload #7
/*     */       //   426: areturn
/*     */       //   427: aload #6
/*     */       //   429: getfield L$1 : Ljava/lang/Object;
/*     */       //   432: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   435: astore #4
/*     */       //   437: aload #6
/*     */       //   439: getfield L$0 : Ljava/lang/Object;
/*     */       //   442: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   445: astore_2
/*     */       //   446: aload #5
/*     */       //   448: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   451: aload #5
/*     */       //   453: pop
/*     */       //   454: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   457: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   460: invokevirtual getRELEVANT_SYMBOL_MAX_IMPORT_DEPTH_ITERATION : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   463: aload_2
/*     */       //   464: aload #4
/*     */       //   466: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   471: aload #6
/*     */       //   473: aload #6
/*     */       //   475: aload_2
/*     */       //   476: putfield L$0 : Ljava/lang/Object;
/*     */       //   479: aload #6
/*     */       //   481: aload #4
/*     */       //   483: putfield L$1 : Ljava/lang/Object;
/*     */       //   486: aload #6
/*     */       //   488: iconst_5
/*     */       //   489: putfield label : I
/*     */       //   492: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   495: dup
/*     */       //   496: aload #7
/*     */       //   498: if_acmpne -> 530
/*     */       //   501: aload #7
/*     */       //   503: areturn
/*     */       //   504: aload #6
/*     */       //   506: getfield L$1 : Ljava/lang/Object;
/*     */       //   509: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   512: astore #4
/*     */       //   514: aload #6
/*     */       //   516: getfield L$0 : Ljava/lang/Object;
/*     */       //   519: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   522: astore_2
/*     */       //   523: aload #5
/*     */       //   525: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   528: aload #5
/*     */       //   530: pop
/*     */       //   531: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   534: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   537: invokevirtual getRELEVANT_SYMBOL_NUM_RESPONSE_FIND_FILES : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   540: aload_2
/*     */       //   541: aload #4
/*     */       //   543: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   548: aload #6
/*     */       //   550: aload #6
/*     */       //   552: aload_2
/*     */       //   553: putfield L$0 : Ljava/lang/Object;
/*     */       //   556: aload #6
/*     */       //   558: aload #4
/*     */       //   560: putfield L$1 : Ljava/lang/Object;
/*     */       //   563: aload #6
/*     */       //   565: bipush #6
/*     */       //   567: putfield label : I
/*     */       //   570: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   573: dup
/*     */       //   574: aload #7
/*     */       //   576: if_acmpne -> 608
/*     */       //   579: aload #7
/*     */       //   581: areturn
/*     */       //   582: aload #6
/*     */       //   584: getfield L$1 : Ljava/lang/Object;
/*     */       //   587: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   590: astore #4
/*     */       //   592: aload #6
/*     */       //   594: getfield L$0 : Ljava/lang/Object;
/*     */       //   597: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   600: astore_2
/*     */       //   601: aload #5
/*     */       //   603: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   606: aload #5
/*     */       //   608: pop
/*     */       //   609: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   612: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   615: invokevirtual getRELEVANT_SYMBOL_NUM_RANKED_ANSWERS_FIND_FILES : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   618: aload_2
/*     */       //   619: aload #4
/*     */       //   621: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   626: aload #6
/*     */       //   628: aload #6
/*     */       //   630: aload_2
/*     */       //   631: putfield L$0 : Ljava/lang/Object;
/*     */       //   634: aload #6
/*     */       //   636: aload #4
/*     */       //   638: putfield L$1 : Ljava/lang/Object;
/*     */       //   641: aload #6
/*     */       //   643: bipush #7
/*     */       //   645: putfield label : I
/*     */       //   648: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   651: dup
/*     */       //   652: aload #7
/*     */       //   654: if_acmpne -> 686
/*     */       //   657: aload #7
/*     */       //   659: areturn
/*     */       //   660: aload #6
/*     */       //   662: getfield L$1 : Ljava/lang/Object;
/*     */       //   665: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   668: astore #4
/*     */       //   670: aload #6
/*     */       //   672: getfield L$0 : Ljava/lang/Object;
/*     */       //   675: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   678: astore_2
/*     */       //   679: aload #5
/*     */       //   681: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   684: aload #5
/*     */       //   686: pop
/*     */       //   687: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   690: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   693: invokevirtual getRELEVANT_SYMBOL_NUM_RESPONSE_FIND_SYMBOLS : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   696: aload_2
/*     */       //   697: aload #4
/*     */       //   699: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   704: aload #6
/*     */       //   706: aload #6
/*     */       //   708: aload_2
/*     */       //   709: putfield L$0 : Ljava/lang/Object;
/*     */       //   712: aload #6
/*     */       //   714: aload #4
/*     */       //   716: putfield L$1 : Ljava/lang/Object;
/*     */       //   719: aload #6
/*     */       //   721: bipush #8
/*     */       //   723: putfield label : I
/*     */       //   726: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   729: dup
/*     */       //   730: aload #7
/*     */       //   732: if_acmpne -> 764
/*     */       //   735: aload #7
/*     */       //   737: areturn
/*     */       //   738: aload #6
/*     */       //   740: getfield L$1 : Ljava/lang/Object;
/*     */       //   743: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   746: astore #4
/*     */       //   748: aload #6
/*     */       //   750: getfield L$0 : Ljava/lang/Object;
/*     */       //   753: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   756: astore_2
/*     */       //   757: aload #5
/*     */       //   759: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   762: aload #5
/*     */       //   764: pop
/*     */       //   765: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   768: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   771: invokevirtual getRELEVANT_SYMBOL_NUM_RANKED_ANSWERS_FIND_SYMBOLS : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   774: aload_2
/*     */       //   775: aload #4
/*     */       //   777: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   782: aload #6
/*     */       //   784: aload #6
/*     */       //   786: aload #4
/*     */       //   788: putfield L$0 : Ljava/lang/Object;
/*     */       //   791: aload #6
/*     */       //   793: aconst_null
/*     */       //   794: putfield L$1 : Ljava/lang/Object;
/*     */       //   797: aload #6
/*     */       //   799: bipush #9
/*     */       //   801: putfield label : I
/*     */       //   804: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   807: dup
/*     */       //   808: aload #7
/*     */       //   810: if_acmpne -> 833
/*     */       //   813: aload #7
/*     */       //   815: areturn
/*     */       //   816: aload #6
/*     */       //   818: getfield L$0 : Ljava/lang/Object;
/*     */       //   821: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   824: astore #4
/*     */       //   826: aload #5
/*     */       //   828: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   831: aload #5
/*     */       //   833: pop
/*     */       //   834: aload #4
/*     */       //   836: getfield element : Ljava/lang/Object;
/*     */       //   839: areturn
/*     */       //   840: new java/lang/IllegalStateException
/*     */       //   843: dup
/*     */       //   844: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   846: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   849: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #127	-> 60
/*     */       //   #128	-> 125
/*     */       //   #130	-> 140
/*     */       //   #131	-> 143
/*     */       //   #132	-> 149
/*     */       //   #133	-> 155
/*     */       //   #130	-> 156
/*     */       //   #127	-> 193
/*     */       //   #138	-> 222
/*     */       //   #127	-> 270
/*     */       //   #142	-> 299
/*     */       //   #127	-> 347
/*     */       //   #146	-> 376
/*     */       //   #147	-> 380
/*     */       //   #148	-> 386
/*     */       //   #146	-> 387
/*     */       //   #127	-> 424
/*     */       //   #153	-> 453
/*     */       //   #127	-> 501
/*     */       //   #157	-> 530
/*     */       //   #127	-> 579
/*     */       //   #161	-> 608
/*     */       //   #127	-> 657
/*     */       //   #165	-> 686
/*     */       //   #127	-> 735
/*     */       //   #169	-> 764
/*     */       //   #170	-> 768
/*     */       //   #171	-> 774
/*     */       //   #169	-> 775
/*     */       //   #127	-> 813
/*     */       //   #176	-> 833
/*     */       //   #127	-> 840
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   125	15	1	$this$setupFromEnvironment	Lcom/intellij/ml/llm/matterhorn/ej/core/relevance/RelevantSymbolsExtractorParameters;
/*     */       //   125	71	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   215	58	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   292	58	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   369	58	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   446	58	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   523	59	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   601	59	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   679	59	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   757	18	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   134	62	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   206	67	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   283	67	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   360	67	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   437	67	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   514	68	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   592	68	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   670	68	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   748	68	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   826	14	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   0	850	3	$completion	Lkotlin/coroutines/Continuation;
/*     */       //   50	790	6	$continuation	Lkotlin/coroutines/Continuation;
/*     */       //   57	783	5	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     private static final Unit setupFromEnvironment$lambda$0(Ref.ObjectRef $result, LLM it) {
/* 135 */       Intrinsics.checkNotNullParameter(it, "it"); $result.element = RelevantSymbolsExtractorParameters.copy$default((RelevantSymbolsExtractorParameters)$result.element, ModelParameters.copy$default(((RelevantSymbolsExtractorParameters)$result.element).getModelParameters(), it, false, null, null, null, null, null, null, null, null, null, null, null, 0, null, 32766, null), 0, 0, 0, 0, 0, 0, 0, 0, 0, 1022, null);
/* 136 */       return Unit.INSTANCE;
/*     */     }
/*     */     private static final Unit setupFromEnvironment$lambda$1(Ref.ObjectRef $result, String it) {
/* 139 */       Intrinsics.checkNotNullParameter(it, "it"); $result.element = RelevantSymbolsExtractorParameters.copy$default((RelevantSymbolsExtractorParameters)$result.element, ModelParameters.copy$default(((RelevantSymbolsExtractorParameters)$result.element).getModelParameters(), null, false, StringsKt.toDoubleOrNull(it), null, null, null, null, null, null, null, null, null, null, 0, null, 32763, null), 0, 0, 0, 0, 0, 0, 0, 0, 0, 1022, null);
/* 140 */       return Unit.INSTANCE;
/*     */     }
/*     */     private static final Unit setupFromEnvironment$lambda$2(Ref.ObjectRef $result, String it) {
/* 143 */       Intrinsics.checkNotNullParameter(it, "it"); $result.element = RelevantSymbolsExtractorParameters.copy$default((RelevantSymbolsExtractorParameters)$result.element, null, Integer.parseInt(it), 0, 0, 0, 0, 0, 0, 0, 0, 1021, null);
/* 144 */       return Unit.INSTANCE;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     private static final Unit setupFromEnvironment$lambda$3(Ref.ObjectRef $result, String it) {
/* 150 */       Intrinsics.checkNotNullParameter(it, "it"); $result.element = RelevantSymbolsExtractorParameters.copy$default((RelevantSymbolsExtractorParameters)$result.element, null, 0, Integer.parseInt(it), 0, 0, 0, 0, 0, 0, 0, 1019, null);
/* 151 */       return Unit.INSTANCE;
/*     */     }
/*     */     private static final Unit setupFromEnvironment$lambda$4(Ref.ObjectRef $result, String it) {
/* 154 */       Intrinsics.checkNotNullParameter(it, "it"); $result.element = RelevantSymbolsExtractorParameters.copy$default((RelevantSymbolsExtractorParameters)$result.element, null, 0, 0, Integer.parseInt(it), 0, 0, 0, 0, 0, 0, 1015, null);
/* 155 */       return Unit.INSTANCE;
/*     */     }
/*     */     private static final Unit setupFromEnvironment$lambda$5(Ref.ObjectRef $result, String it) {
/* 158 */       Intrinsics.checkNotNullParameter(it, "it"); $result.element = RelevantSymbolsExtractorParameters.copy$default((RelevantSymbolsExtractorParameters)$result.element, null, 0, 0, 0, Integer.parseInt(it), 0, 0, 0, 0, 0, 1007, null);
/* 159 */       return Unit.INSTANCE;
/*     */     }
/*     */     private static final Unit setupFromEnvironment$lambda$6(Ref.ObjectRef $result, String it) {
/* 162 */       Intrinsics.checkNotNullParameter(it, "it"); $result.element = RelevantSymbolsExtractorParameters.copy$default((RelevantSymbolsExtractorParameters)$result.element, null, 0, 0, 0, 0, 0, Integer.parseInt(it), 0, 0, 0, 959, null);
/* 163 */       return Unit.INSTANCE;
/*     */     }
/*     */     private static final Unit setupFromEnvironment$lambda$7(Ref.ObjectRef $result, String it) {
/* 166 */       Intrinsics.checkNotNullParameter(it, "it"); $result.element = RelevantSymbolsExtractorParameters.copy$default((RelevantSymbolsExtractorParameters)$result.element, null, 0, 0, 0, 0, 0, 0, Integer.parseInt(it), 0, 0, 895, null);
/* 167 */       return Unit.INSTANCE;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     private static final Unit setupFromEnvironment$lambda$8(Ref.ObjectRef $result, String it) {
/* 173 */       Intrinsics.checkNotNullParameter(it, "it"); $result.element = RelevantSymbolsExtractorParameters.copy$default((RelevantSymbolsExtractorParameters)$result.element, null, 0, 0, 0, 0, 0, 0, 0, 0, Integer.parseInt(it), 511, null);
/* 174 */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     @DebugMetadata(f = "RelevantSymbolsExtractorWorker.kt", l = {130, 138, 142, 146, 153, 157, 161, 165, 169}, i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0"}, n = {"propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "result"}, m = "setupFromEnvironment", c = "com.intellij.ml.llm.matterhorn.ej.core.relevance.RelevantSymbolsExtractorParameters$Companion")
/*     */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */     static final class RelevantSymbolsExtractorParameters$Companion$setupFromEnvironment$1 extends ContinuationImpl {
/*     */       Object L$0;
/*     */       Object L$1;
/*     */       int label;
/*     */       
/*     */       RelevantSymbolsExtractorParameters$Companion$setupFromEnvironment$1(Continuation $completion) {
/*     */         super($completion);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Object invokeSuspend(@NotNull Object $result) {
/*     */         this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return RelevantSymbolsExtractorParameters.Companion.this.setupFromEnvironment(null, null, (Continuation<? super RelevantSymbolsExtractorParameters>)this);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\RelevantSymbolsExtractorParameters.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */