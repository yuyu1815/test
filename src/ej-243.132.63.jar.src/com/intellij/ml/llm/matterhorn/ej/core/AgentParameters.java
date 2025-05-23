/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.critique.Critiques;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.history_processors.HistoryProcessors;
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
/*     */ import kotlin.jvm.JvmField;
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
/*     */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.BooleanSerializer;
/*     */ import kotlinx.serialization.internal.DoubleSerializer;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.IntSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Serializable
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\006\n\002\020\006\n\002\b\005\n\002\030\002\n\002\b=\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 b2\0020\001:\002bcB¡\001\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007\022\n\b\002\020\b\032\004\030\0010\t\022\n\b\002\020\n\032\004\030\0010\005\022\n\b\002\020\013\032\004\030\0010\005\022\b\b\002\020\f\032\0020\005\022\b\b\002\020\r\032\0020\016\022\b\b\002\020\017\032\0020\016\022\b\b\002\020\020\032\0020\016\022\b\b\002\020\021\032\0020\016\022\b\b\002\020\022\032\0020\016\022\b\b\002\020\023\032\0020\005\022\b\b\002\020\024\032\0020\025\022\b\b\002\020\026\032\0020\016¢\006\004\b\027\020\030B\001\b\020\022\006\020\031\032\0020\005\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\005\022\b\020\013\032\004\030\0010\005\022\006\020\f\032\0020\005\022\006\020\r\032\0020\016\022\006\020\017\032\0020\016\022\006\020\020\032\0020\016\022\006\020\021\032\0020\016\022\006\020\022\032\0020\016\022\006\020\023\032\0020\005\022\006\020\024\032\0020\025\022\006\020\026\032\0020\016\022\b\020\032\032\004\030\0010\033¢\006\004\b\027\020\034J\t\020D\032\0020\003HÆ\003J\t\020E\032\0020\005HÆ\003J\t\020F\032\0020\007HÆ\003J\013\020G\032\004\030\0010\tHÆ\003J\020\020H\032\004\030\0010\005HÆ\003¢\006\002\020,J\020\020I\032\004\030\0010\005HÆ\003¢\006\002\020,J\t\020J\032\0020\005HÆ\003J\t\020K\032\0020\016HÆ\003J\t\020L\032\0020\016HÆ\003J\t\020M\032\0020\016HÆ\003J\t\020N\032\0020\016HÆ\003J\t\020O\032\0020\016HÆ\003J\t\020P\032\0020\005HÆ\003J\t\020Q\032\0020\025HÆ\003J\t\020R\032\0020\016HÆ\003Jª\001\020S\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\n\b\002\020\b\032\004\030\0010\t2\n\b\002\020\n\032\004\030\0010\0052\n\b\002\020\013\032\004\030\0010\0052\b\b\002\020\f\032\0020\0052\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\0162\b\b\002\020\020\032\0020\0162\b\b\002\020\021\032\0020\0162\b\b\002\020\022\032\0020\0162\b\b\002\020\023\032\0020\0052\b\b\002\020\024\032\0020\0252\b\b\002\020\026\032\0020\016HÆ\001¢\006\002\020TJ\023\020U\032\0020\0162\b\020V\032\004\030\0010\001HÖ\003J\t\020W\032\0020\005HÖ\001J\t\020X\032\0020YHÖ\001J%\020Z\032\0020[2\006\020\\\032\0020\0002\006\020]\032\0020^2\006\020_\032\0020`H\001¢\006\002\baR\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\035\020\036\032\004\b\037\020 R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b!\020\036\032\004\b\"\020#R\034\020\006\032\0020\0078\006X\004¢\006\016\n\000\022\004\b$\020\036\032\004\b%\020&R\036\020\b\032\004\030\0010\t8\006X\004¢\006\016\n\000\022\004\b'\020\036\032\004\b(\020)R \020\n\032\004\030\0010\0058\006X\004¢\006\020\n\002\020-\022\004\b*\020\036\032\004\b+\020,R \020\013\032\004\030\0010\0058\006X\004¢\006\020\n\002\020-\022\004\b.\020\036\032\004\b/\020,R\034\020\f\032\0020\0058\006X\004¢\006\016\n\000\022\004\b0\020\036\032\004\b1\020#R\034\020\r\032\0020\0168\006X\004¢\006\016\n\000\022\004\b2\020\036\032\004\b3\0204R\034\020\017\032\0020\0168\006X\004¢\006\016\n\000\022\004\b5\020\036\032\004\b6\0204R\034\020\020\032\0020\0168\006X\004¢\006\016\n\000\022\004\b7\020\036\032\004\b8\0204R\034\020\021\032\0020\0168\006X\004¢\006\016\n\000\022\004\b9\020\036\032\004\b:\0204R\034\020\022\032\0020\0168\006X\004¢\006\016\n\000\022\004\b;\020\036\032\004\b<\0204R\034\020\023\032\0020\0058\006X\004¢\006\016\n\000\022\004\b=\020\036\032\004\b>\020#R\034\020\024\032\0020\0258\006X\004¢\006\016\n\000\022\004\b?\020\036\032\004\b@\020AR\034\020\026\032\0020\0168\006X\004¢\006\016\n\000\022\004\bB\020\036\032\004\bC\0204¨\006d"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;", "", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "modelNumChoices", "", "historyProcessor", "Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/HistoryProcessors;", "critique", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/Critiques;", "maxCommandOutputLineLength", "maxCommandOutputLines", "numReflections", "createRepomap", "", "useEditSubagent", "useDemo", "useTools", "addPlanToThoughts", "maxSteps", "allowCallExpert", "", "addProjectStr", "<init>", "(Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;ILcom/intellij/ml/llm/matterhorn/ej/core/history_processors/HistoryProcessors;Lcom/intellij/ml/llm/matterhorn/ej/core/critique/Critiques;Ljava/lang/Integer;Ljava/lang/Integer;IZZZZZIDZ)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/llm/ModelParameters;ILcom/intellij/ml/llm/matterhorn/ej/core/history_processors/HistoryProcessors;Lcom/intellij/ml/llm/matterhorn/ej/core/critique/Critiques;Ljava/lang/Integer;Ljava/lang/Integer;IZZZZZIDZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getModelParameters$annotations", "()V", "getModelParameters", "()Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "getModelNumChoices$annotations", "getModelNumChoices", "()I", "getHistoryProcessor$annotations", "getHistoryProcessor", "()Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/HistoryProcessors;", "getCritique$annotations", "getCritique", "()Lcom/intellij/ml/llm/matterhorn/ej/core/critique/Critiques;", "getMaxCommandOutputLineLength$annotations", "getMaxCommandOutputLineLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxCommandOutputLines$annotations", "getMaxCommandOutputLines", "getNumReflections$annotations", "getNumReflections", "getCreateRepomap$annotations", "getCreateRepomap", "()Z", "getUseEditSubagent$annotations", "getUseEditSubagent", "getUseDemo$annotations", "getUseDemo", "getUseTools$annotations", "getUseTools", "getAddPlanToThoughts$annotations", "getAddPlanToThoughts", "getMaxSteps$annotations", "getMaxSteps", "getAllowCallExpert$annotations", "getAllowCallExpert", "()D", "getAddProjectStr$annotations", "getAddProjectStr", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;ILcom/intellij/ml/llm/matterhorn/ej/core/history_processors/HistoryProcessors;Lcom/intellij/ml/llm/matterhorn/ej/core/critique/Critiques;Ljava/lang/Integer;Ljava/lang/Integer;IZZZZZIDZ)Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "Companion", "$serializer", "ej-core"})
/*     */ public final class AgentParameters {
/*  45 */   public AgentParameters(@NotNull ModelParameters modelParameters, int modelNumChoices, @NotNull HistoryProcessors historyProcessor, @Nullable Critiques critique, @Nullable Integer maxCommandOutputLineLength, @Nullable Integer maxCommandOutputLines, int numReflections, boolean createRepomap, boolean useEditSubagent, boolean useDemo, boolean useTools, boolean addPlanToThoughts, int maxSteps, double allowCallExpert, boolean addProjectStr) { this.modelParameters = modelParameters;
/*     */ 
/*     */     
/*  48 */     this.modelNumChoices = modelNumChoices;
/*     */ 
/*     */     
/*  51 */     this.historyProcessor = historyProcessor;
/*     */ 
/*     */     
/*  54 */     this.critique = critique;
/*     */ 
/*     */     
/*  57 */     this.maxCommandOutputLineLength = maxCommandOutputLineLength;
/*     */ 
/*     */     
/*  60 */     this.maxCommandOutputLines = maxCommandOutputLines;
/*     */ 
/*     */     
/*  63 */     this.numReflections = numReflections;
/*     */ 
/*     */     
/*  66 */     this.createRepomap = createRepomap;
/*     */ 
/*     */     
/*  69 */     this.useEditSubagent = useEditSubagent;
/*     */ 
/*     */     
/*  72 */     this.useDemo = useDemo;
/*     */ 
/*     */     
/*  75 */     this.useTools = useTools;
/*     */ 
/*     */     
/*  78 */     this.addPlanToThoughts = addPlanToThoughts;
/*     */ 
/*     */     
/*  81 */     this.maxSteps = maxSteps;
/*     */ 
/*     */     
/*  84 */     this.allowCallExpert = allowCallExpert;
/*     */ 
/*     */     
/*  87 */     this.addProjectStr = addProjectStr; } @NotNull public final ModelParameters getModelParameters() { return this.modelParameters; } public final int getModelNumChoices() { return this.modelNumChoices; } @NotNull public final HistoryProcessors getHistoryProcessor() { return this.historyProcessor; } @Nullable public final Critiques getCritique() { return this.critique; } @Nullable public final Integer getMaxCommandOutputLineLength() { return this.maxCommandOutputLineLength; } @Nullable public final Integer getMaxCommandOutputLines() { return this.maxCommandOutputLines; } public final int getNumReflections() { return this.numReflections; } public final boolean getCreateRepomap() { return this.createRepomap; } public final boolean getUseEditSubagent() { return this.useEditSubagent; } public final boolean getUseDemo() { return this.useDemo; } public final boolean getUseTools() { return this.useTools; } public final boolean getAddPlanToThoughts() { return this.addPlanToThoughts; } public final int getMaxSteps() { return this.maxSteps; } public final double getAllowCallExpert() { return this.allowCallExpert; } public final boolean getAddProjectStr() { return this.addProjectStr; }
/*     */ 
/*     */   
/*     */   @NotNull
/*  91 */   public static final Companion Companion = new Companion(null); @NotNull private final ModelParameters modelParameters; private final int modelNumChoices; @NotNull private final HistoryProcessors historyProcessor; @Nullable private final Critiques critique; @Nullable private final Integer maxCommandOutputLineLength; @Nullable private final Integer maxCommandOutputLines; private final int numReflections; private final boolean createRepomap; private final boolean useEditSubagent; private final boolean useDemo; private final boolean useTools; private final boolean addPlanToThoughts; private final int maxSteps; private final double allowCallExpert; private final boolean addProjectStr; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[15]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = HistoryProcessors.Companion.serializer(); arrayOfKSerializer[3] = Critiques.Companion.serializer(); arrayOfKSerializer[4] = null; arrayOfKSerializer[5] = null; arrayOfKSerializer[6] = null; arrayOfKSerializer[7] = null; arrayOfKSerializer[8] = null; arrayOfKSerializer[9] = null; arrayOfKSerializer[10] = null; arrayOfKSerializer[11] = null; arrayOfKSerializer[12] = null; arrayOfKSerializer[13] = null; arrayOfKSerializer[14] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @NotNull public final ModelParameters component1() { return this.modelParameters; } public final int component2() { return this.modelNumChoices; } @NotNull public final HistoryProcessors component3() { return this.historyProcessor; } @Nullable public final Critiques component4() { return this.critique; } @Nullable public final Integer component5() { return this.maxCommandOutputLineLength; } @Nullable public final Integer component6() { return this.maxCommandOutputLines; } public final int component7() { return this.numReflections; } public final boolean component8() { return this.createRepomap; } public final boolean component9() { return this.useEditSubagent; } public final boolean component10() { return this.useDemo; } public final boolean component11() { return this.useTools; } public final boolean component12() { return this.addPlanToThoughts; } public final int component13() { return this.maxSteps; } public final double component14() { return this.allowCallExpert; } public final boolean component15() { return this.addProjectStr; } @NotNull public final AgentParameters copy(@NotNull ModelParameters modelParameters, int modelNumChoices, @NotNull HistoryProcessors historyProcessor, @Nullable Critiques critique, @Nullable Integer maxCommandOutputLineLength, @Nullable Integer maxCommandOutputLines, int numReflections, boolean createRepomap, boolean useEditSubagent, boolean useDemo, boolean useTools, boolean addPlanToThoughts, int maxSteps, double allowCallExpert, boolean addProjectStr) { Intrinsics.checkNotNullParameter(modelParameters, "modelParameters"); Intrinsics.checkNotNullParameter(historyProcessor, "historyProcessor"); return new AgentParameters(modelParameters, modelNumChoices, historyProcessor, critique, maxCommandOutputLineLength, maxCommandOutputLines, numReflections, createRepomap, useEditSubagent, useDemo, useTools, addPlanToThoughts, maxSteps, allowCallExpert, addProjectStr); } @NotNull public String toString() { return "AgentParameters(modelParameters=" + this.modelParameters + ", modelNumChoices=" + this.modelNumChoices + ", historyProcessor=" + this.historyProcessor + ", critique=" + this.critique + ", maxCommandOutputLineLength=" + this.maxCommandOutputLineLength + ", maxCommandOutputLines=" + this.maxCommandOutputLines + ", numReflections=" + this.numReflections + ", createRepomap=" + this.createRepomap + ", useEditSubagent=" + this.useEditSubagent + ", useDemo=" + this.useDemo + ", useTools=" + this.useTools + ", addPlanToThoughts=" + this.addPlanToThoughts + ", maxSteps=" + this.maxSteps + ", allowCallExpert=" + this.allowCallExpert + ", addProjectStr=" + this.addProjectStr + ")"; } public int hashCode() { result = this.modelParameters.hashCode(); result = result * 31 + Integer.hashCode(this.modelNumChoices); result = result * 31 + this.historyProcessor.hashCode(); result = result * 31 + ((this.critique == null) ? 0 : this.critique.hashCode()); result = result * 31 + ((this.maxCommandOutputLineLength == null) ? 0 : this.maxCommandOutputLineLength.hashCode()); result = result * 31 + ((this.maxCommandOutputLines == null) ? 0 : this.maxCommandOutputLines.hashCode()); result = result * 31 + Integer.hashCode(this.numReflections); result = result * 31 + Boolean.hashCode(this.createRepomap); result = result * 31 + Boolean.hashCode(this.useEditSubagent); result = result * 31 + Boolean.hashCode(this.useDemo); result = result * 31 + Boolean.hashCode(this.useTools); result = result * 31 + Boolean.hashCode(this.addPlanToThoughts); result = result * 31 + Integer.hashCode(this.maxSteps); result = result * 31 + Double.hashCode(this.allowCallExpert); return result * 31 + Boolean.hashCode(this.addProjectStr); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof AgentParameters)) return false;  AgentParameters agentParameters = (AgentParameters)other; return !Intrinsics.areEqual(this.modelParameters, agentParameters.modelParameters) ? false : ((this.modelNumChoices != agentParameters.modelNumChoices) ? false : ((this.historyProcessor != agentParameters.historyProcessor) ? false : ((this.critique != agentParameters.critique) ? false : (!Intrinsics.areEqual(this.maxCommandOutputLineLength, agentParameters.maxCommandOutputLineLength) ? false : (!Intrinsics.areEqual(this.maxCommandOutputLines, agentParameters.maxCommandOutputLines) ? false : ((this.numReflections != agentParameters.numReflections) ? false : ((this.createRepomap != agentParameters.createRepomap) ? false : ((this.useEditSubagent != agentParameters.useEditSubagent) ? false : ((this.useDemo != agentParameters.useDemo) ? false : ((this.useTools != agentParameters.useTools) ? false : ((this.addPlanToThoughts != agentParameters.addPlanToThoughts) ? false : ((this.maxSteps != agentParameters.maxSteps) ? false : ((Double.compare(this.allowCallExpert, agentParameters.allowCallExpert) != 0) ? false : (!(this.addProjectStr != agentParameters.addProjectStr))))))))))))))); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\032\020\004\032\0020\005*\0020\0052\006\020\006\032\0020\007H@¢\006\002\020\bJ\f\020\t\032\b\022\004\022\0020\0050\n¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters$Companion;", "", "<init>", "()V", "setupFromEnvironment", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "serializer", "Lkotlinx/serialization/KSerializer;", "ej-core"}) public static final class Companion { @NotNull public final KSerializer<AgentParameters> serializer() { return (KSerializer<AgentParameters>)AgentParameters.$serializer.INSTANCE; }
/*     */     
/*     */     private Companion() {}
/*     */     @Nullable
/*     */     public final Object setupFromEnvironment(@NotNull AgentParameters $this$setupFromEnvironment, @NotNull MatterhornPropertyProvider propertyProvider, @NotNull Continuation $completion) {
/*     */       // Byte code:
/*     */       //   0: aload_3
/*     */       //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/AgentParameters$Companion$setupFromEnvironment$1
/*     */       //   4: ifeq -> 39
/*     */       //   7: aload_3
/*     */       //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters$Companion$setupFromEnvironment$1
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
/*     */       //   39: new com/intellij/ml/llm/matterhorn/ej/core/AgentParameters$Companion$setupFromEnvironment$1
/*     */       //   42: dup
/*     */       //   43: aload_0
/*     */       //   44: aload_3
/*     */       //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters$Companion;Lkotlin/coroutines/Continuation;)V
/*     */       //   48: astore #6
/*     */       //   50: aload #6
/*     */       //   52: getfield result : Ljava/lang/Object;
/*     */       //   55: astore #5
/*     */       //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   60: astore #7
/*     */       //   62: aload #6
/*     */       //   64: getfield label : I
/*     */       //   67: tableswitch default -> 1655, 0 -> 156, 1 -> 232, 2 -> 309, 3 -> 386, 4 -> 463, 5 -> 540, 6 -> 695, 7 -> 773, 8 -> 851, 9 -> 929, 10 -> 1007, 11 -> 1085, 12 -> 1163, 13 -> 1241, 14 -> 1319, 15 -> 1397, 16 -> 1475, 17 -> 1553, 18 -> 1631
/*     */       //   156: aload #5
/*     */       //   158: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   161: new kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   164: dup
/*     */       //   165: invokespecial <init> : ()V
/*     */       //   168: astore #4
/*     */       //   170: aload #4
/*     */       //   172: aload_1
/*     */       //   173: putfield element : Ljava/lang/Object;
/*     */       //   176: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   179: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   182: invokevirtual getPRIMARY_MODEL : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   185: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   188: invokevirtual getPRIMARY_MODEL_PROVIDER : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   191: aload_2
/*     */       //   192: aload #4
/*     */       //   194: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   199: aload #6
/*     */       //   201: aload #6
/*     */       //   203: aload_2
/*     */       //   204: putfield L$0 : Ljava/lang/Object;
/*     */       //   207: aload #6
/*     */       //   209: aload #4
/*     */       //   211: putfield L$1 : Ljava/lang/Object;
/*     */       //   214: aload #6
/*     */       //   216: iconst_1
/*     */       //   217: putfield label : I
/*     */       //   220: invokevirtual setupModel : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   223: dup
/*     */       //   224: aload #7
/*     */       //   226: if_acmpne -> 258
/*     */       //   229: aload #7
/*     */       //   231: areturn
/*     */       //   232: aload #6
/*     */       //   234: getfield L$1 : Ljava/lang/Object;
/*     */       //   237: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   240: astore #4
/*     */       //   242: aload #6
/*     */       //   244: getfield L$0 : Ljava/lang/Object;
/*     */       //   247: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   250: astore_2
/*     */       //   251: aload #5
/*     */       //   253: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   256: aload #5
/*     */       //   258: pop
/*     */       //   259: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   262: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   265: invokevirtual getPRIMARY_MODEL_PROMPT_CACHE_ENABLED : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   268: aload_2
/*     */       //   269: aload #4
/*     */       //   271: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   276: aload #6
/*     */       //   278: aload #6
/*     */       //   280: aload_2
/*     */       //   281: putfield L$0 : Ljava/lang/Object;
/*     */       //   284: aload #6
/*     */       //   286: aload #4
/*     */       //   288: putfield L$1 : Ljava/lang/Object;
/*     */       //   291: aload #6
/*     */       //   293: iconst_2
/*     */       //   294: putfield label : I
/*     */       //   297: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   300: dup
/*     */       //   301: aload #7
/*     */       //   303: if_acmpne -> 335
/*     */       //   306: aload #7
/*     */       //   308: areturn
/*     */       //   309: aload #6
/*     */       //   311: getfield L$1 : Ljava/lang/Object;
/*     */       //   314: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   317: astore #4
/*     */       //   319: aload #6
/*     */       //   321: getfield L$0 : Ljava/lang/Object;
/*     */       //   324: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   327: astore_2
/*     */       //   328: aload #5
/*     */       //   330: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   333: aload #5
/*     */       //   335: pop
/*     */       //   336: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   339: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   342: invokevirtual getPRIMARY_MODEL_TEMPERATURE : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   345: aload_2
/*     */       //   346: aload #4
/*     */       //   348: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   353: aload #6
/*     */       //   355: aload #6
/*     */       //   357: aload_2
/*     */       //   358: putfield L$0 : Ljava/lang/Object;
/*     */       //   361: aload #6
/*     */       //   363: aload #4
/*     */       //   365: putfield L$1 : Ljava/lang/Object;
/*     */       //   368: aload #6
/*     */       //   370: iconst_3
/*     */       //   371: putfield label : I
/*     */       //   374: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   377: dup
/*     */       //   378: aload #7
/*     */       //   380: if_acmpne -> 412
/*     */       //   383: aload #7
/*     */       //   385: areturn
/*     */       //   386: aload #6
/*     */       //   388: getfield L$1 : Ljava/lang/Object;
/*     */       //   391: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   394: astore #4
/*     */       //   396: aload #6
/*     */       //   398: getfield L$0 : Ljava/lang/Object;
/*     */       //   401: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   404: astore_2
/*     */       //   405: aload #5
/*     */       //   407: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   410: aload #5
/*     */       //   412: pop
/*     */       //   413: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   416: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   419: invokevirtual getPRIMARY_MODEL_THINKING_BUDGET : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   422: aload_2
/*     */       //   423: aload #4
/*     */       //   425: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   430: aload #6
/*     */       //   432: aload #6
/*     */       //   434: aload_2
/*     */       //   435: putfield L$0 : Ljava/lang/Object;
/*     */       //   438: aload #6
/*     */       //   440: aload #4
/*     */       //   442: putfield L$1 : Ljava/lang/Object;
/*     */       //   445: aload #6
/*     */       //   447: iconst_4
/*     */       //   448: putfield label : I
/*     */       //   451: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   454: dup
/*     */       //   455: aload #7
/*     */       //   457: if_acmpne -> 489
/*     */       //   460: aload #7
/*     */       //   462: areturn
/*     */       //   463: aload #6
/*     */       //   465: getfield L$1 : Ljava/lang/Object;
/*     */       //   468: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   471: astore #4
/*     */       //   473: aload #6
/*     */       //   475: getfield L$0 : Ljava/lang/Object;
/*     */       //   478: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   481: astore_2
/*     */       //   482: aload #5
/*     */       //   484: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   487: aload #5
/*     */       //   489: pop
/*     */       //   490: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   493: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   496: invokevirtual getPRIMARY_MODEL_REASONING_EFFORT : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   499: aload_2
/*     */       //   500: aload #4
/*     */       //   502: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   507: aload #6
/*     */       //   509: aload #6
/*     */       //   511: aload_2
/*     */       //   512: putfield L$0 : Ljava/lang/Object;
/*     */       //   515: aload #6
/*     */       //   517: aload #4
/*     */       //   519: putfield L$1 : Ljava/lang/Object;
/*     */       //   522: aload #6
/*     */       //   524: iconst_5
/*     */       //   525: putfield label : I
/*     */       //   528: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   531: dup
/*     */       //   532: aload #7
/*     */       //   534: if_acmpne -> 566
/*     */       //   537: aload #7
/*     */       //   539: areturn
/*     */       //   540: aload #6
/*     */       //   542: getfield L$1 : Ljava/lang/Object;
/*     */       //   545: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   548: astore #4
/*     */       //   550: aload #6
/*     */       //   552: getfield L$0 : Ljava/lang/Object;
/*     */       //   555: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   558: astore_2
/*     */       //   559: aload #5
/*     */       //   561: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   564: aload #5
/*     */       //   566: pop
/*     */       //   567: aload #4
/*     */       //   569: aload #4
/*     */       //   571: getfield element : Ljava/lang/Object;
/*     */       //   574: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*     */       //   577: aload #4
/*     */       //   579: getfield element : Ljava/lang/Object;
/*     */       //   582: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*     */       //   585: invokevirtual getModelParameters : ()Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */       //   588: aconst_null
/*     */       //   589: iconst_0
/*     */       //   590: aconst_null
/*     */       //   591: aconst_null
/*     */       //   592: aconst_null
/*     */       //   593: aconst_null
/*     */       //   594: ldc '</COMMAND>'
/*     */       //   596: getstatic com/intellij/ml/llm/matterhorn/llm/StopSequenceType.STOP_AFTER : Lcom/intellij/ml/llm/matterhorn/llm/StopSequenceType;
/*     */       //   599: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*     */       //   602: invokestatic mapOf : (Lkotlin/Pair;)Ljava/util/Map;
/*     */       //   605: aconst_null
/*     */       //   606: aconst_null
/*     */       //   607: aconst_null
/*     */       //   608: aconst_null
/*     */       //   609: aconst_null
/*     */       //   610: aconst_null
/*     */       //   611: iconst_0
/*     */       //   612: aconst_null
/*     */       //   613: sipush #32703
/*     */       //   616: aconst_null
/*     */       //   617: invokestatic copy$default : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lcom/intellij/ml/llm/matterhorn/llm/LLM;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */       //   620: iconst_0
/*     */       //   621: aconst_null
/*     */       //   622: aconst_null
/*     */       //   623: aconst_null
/*     */       //   624: aconst_null
/*     */       //   625: iconst_0
/*     */       //   626: iconst_0
/*     */       //   627: iconst_0
/*     */       //   628: iconst_0
/*     */       //   629: iconst_0
/*     */       //   630: iconst_0
/*     */       //   631: iconst_0
/*     */       //   632: dconst_0
/*     */       //   633: iconst_0
/*     */       //   634: sipush #32766
/*     */       //   637: aconst_null
/*     */       //   638: invokestatic copy$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;ILcom/intellij/ml/llm/matterhorn/ej/core/history_processors/HistoryProcessors;Lcom/intellij/ml/llm/matterhorn/ej/core/critique/Critiques;Ljava/lang/Integer;Ljava/lang/Integer;IZZZZZIDZILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */       //   641: putfield element : Ljava/lang/Object;
/*     */       //   644: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   647: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   650: invokevirtual getPRIMARY_HISTORY_PROCESSOR : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   653: aload_2
/*     */       //   654: aload #4
/*     */       //   656: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   661: aload #6
/*     */       //   663: aload #6
/*     */       //   665: aload_2
/*     */       //   666: putfield L$0 : Ljava/lang/Object;
/*     */       //   669: aload #6
/*     */       //   671: aload #4
/*     */       //   673: putfield L$1 : Ljava/lang/Object;
/*     */       //   676: aload #6
/*     */       //   678: bipush #6
/*     */       //   680: putfield label : I
/*     */       //   683: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   686: dup
/*     */       //   687: aload #7
/*     */       //   689: if_acmpne -> 721
/*     */       //   692: aload #7
/*     */       //   694: areturn
/*     */       //   695: aload #6
/*     */       //   697: getfield L$1 : Ljava/lang/Object;
/*     */       //   700: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   703: astore #4
/*     */       //   705: aload #6
/*     */       //   707: getfield L$0 : Ljava/lang/Object;
/*     */       //   710: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   713: astore_2
/*     */       //   714: aload #5
/*     */       //   716: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   719: aload #5
/*     */       //   721: pop
/*     */       //   722: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   725: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   728: invokevirtual getPRIMARY_MAX_COMMAND_OUTPUT_LINE_LENGTH : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   731: aload_2
/*     */       //   732: aload #4
/*     */       //   734: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   739: aload #6
/*     */       //   741: aload #6
/*     */       //   743: aload_2
/*     */       //   744: putfield L$0 : Ljava/lang/Object;
/*     */       //   747: aload #6
/*     */       //   749: aload #4
/*     */       //   751: putfield L$1 : Ljava/lang/Object;
/*     */       //   754: aload #6
/*     */       //   756: bipush #7
/*     */       //   758: putfield label : I
/*     */       //   761: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   764: dup
/*     */       //   765: aload #7
/*     */       //   767: if_acmpne -> 799
/*     */       //   770: aload #7
/*     */       //   772: areturn
/*     */       //   773: aload #6
/*     */       //   775: getfield L$1 : Ljava/lang/Object;
/*     */       //   778: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   781: astore #4
/*     */       //   783: aload #6
/*     */       //   785: getfield L$0 : Ljava/lang/Object;
/*     */       //   788: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   791: astore_2
/*     */       //   792: aload #5
/*     */       //   794: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   797: aload #5
/*     */       //   799: pop
/*     */       //   800: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   803: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   806: invokevirtual getPRIMARY_MAX_COMMAND_OUTPUT_LINES : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   809: aload_2
/*     */       //   810: aload #4
/*     */       //   812: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   817: aload #6
/*     */       //   819: aload #6
/*     */       //   821: aload_2
/*     */       //   822: putfield L$0 : Ljava/lang/Object;
/*     */       //   825: aload #6
/*     */       //   827: aload #4
/*     */       //   829: putfield L$1 : Ljava/lang/Object;
/*     */       //   832: aload #6
/*     */       //   834: bipush #8
/*     */       //   836: putfield label : I
/*     */       //   839: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   842: dup
/*     */       //   843: aload #7
/*     */       //   845: if_acmpne -> 877
/*     */       //   848: aload #7
/*     */       //   850: areturn
/*     */       //   851: aload #6
/*     */       //   853: getfield L$1 : Ljava/lang/Object;
/*     */       //   856: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   859: astore #4
/*     */       //   861: aload #6
/*     */       //   863: getfield L$0 : Ljava/lang/Object;
/*     */       //   866: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   869: astore_2
/*     */       //   870: aload #5
/*     */       //   872: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   875: aload #5
/*     */       //   877: pop
/*     */       //   878: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   881: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   884: invokevirtual getPRIMARY_MODEL_NUM_CHOICES : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   887: aload_2
/*     */       //   888: aload #4
/*     */       //   890: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   895: aload #6
/*     */       //   897: aload #6
/*     */       //   899: aload_2
/*     */       //   900: putfield L$0 : Ljava/lang/Object;
/*     */       //   903: aload #6
/*     */       //   905: aload #4
/*     */       //   907: putfield L$1 : Ljava/lang/Object;
/*     */       //   910: aload #6
/*     */       //   912: bipush #9
/*     */       //   914: putfield label : I
/*     */       //   917: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   920: dup
/*     */       //   921: aload #7
/*     */       //   923: if_acmpne -> 955
/*     */       //   926: aload #7
/*     */       //   928: areturn
/*     */       //   929: aload #6
/*     */       //   931: getfield L$1 : Ljava/lang/Object;
/*     */       //   934: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   937: astore #4
/*     */       //   939: aload #6
/*     */       //   941: getfield L$0 : Ljava/lang/Object;
/*     */       //   944: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   947: astore_2
/*     */       //   948: aload #5
/*     */       //   950: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   953: aload #5
/*     */       //   955: pop
/*     */       //   956: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   959: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   962: invokevirtual getPRIMARY_CRITIQUE : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   965: aload_2
/*     */       //   966: aload #4
/*     */       //   968: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   973: aload #6
/*     */       //   975: aload #6
/*     */       //   977: aload_2
/*     */       //   978: putfield L$0 : Ljava/lang/Object;
/*     */       //   981: aload #6
/*     */       //   983: aload #4
/*     */       //   985: putfield L$1 : Ljava/lang/Object;
/*     */       //   988: aload #6
/*     */       //   990: bipush #10
/*     */       //   992: putfield label : I
/*     */       //   995: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   998: dup
/*     */       //   999: aload #7
/*     */       //   1001: if_acmpne -> 1033
/*     */       //   1004: aload #7
/*     */       //   1006: areturn
/*     */       //   1007: aload #6
/*     */       //   1009: getfield L$1 : Ljava/lang/Object;
/*     */       //   1012: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   1015: astore #4
/*     */       //   1017: aload #6
/*     */       //   1019: getfield L$0 : Ljava/lang/Object;
/*     */       //   1022: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   1025: astore_2
/*     */       //   1026: aload #5
/*     */       //   1028: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   1031: aload #5
/*     */       //   1033: pop
/*     */       //   1034: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   1037: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   1040: invokevirtual getPRIMARY_CREATE_REPOMAP : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   1043: aload_2
/*     */       //   1044: aload #4
/*     */       //   1046: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   1051: aload #6
/*     */       //   1053: aload #6
/*     */       //   1055: aload_2
/*     */       //   1056: putfield L$0 : Ljava/lang/Object;
/*     */       //   1059: aload #6
/*     */       //   1061: aload #4
/*     */       //   1063: putfield L$1 : Ljava/lang/Object;
/*     */       //   1066: aload #6
/*     */       //   1068: bipush #11
/*     */       //   1070: putfield label : I
/*     */       //   1073: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   1076: dup
/*     */       //   1077: aload #7
/*     */       //   1079: if_acmpne -> 1111
/*     */       //   1082: aload #7
/*     */       //   1084: areturn
/*     */       //   1085: aload #6
/*     */       //   1087: getfield L$1 : Ljava/lang/Object;
/*     */       //   1090: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   1093: astore #4
/*     */       //   1095: aload #6
/*     */       //   1097: getfield L$0 : Ljava/lang/Object;
/*     */       //   1100: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   1103: astore_2
/*     */       //   1104: aload #5
/*     */       //   1106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   1109: aload #5
/*     */       //   1111: pop
/*     */       //   1112: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   1115: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   1118: invokevirtual getPRIMARY_USE_EDIT_SUBAGENT : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   1121: aload_2
/*     */       //   1122: aload #4
/*     */       //   1124: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   1129: aload #6
/*     */       //   1131: aload #6
/*     */       //   1133: aload_2
/*     */       //   1134: putfield L$0 : Ljava/lang/Object;
/*     */       //   1137: aload #6
/*     */       //   1139: aload #4
/*     */       //   1141: putfield L$1 : Ljava/lang/Object;
/*     */       //   1144: aload #6
/*     */       //   1146: bipush #12
/*     */       //   1148: putfield label : I
/*     */       //   1151: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   1154: dup
/*     */       //   1155: aload #7
/*     */       //   1157: if_acmpne -> 1189
/*     */       //   1160: aload #7
/*     */       //   1162: areturn
/*     */       //   1163: aload #6
/*     */       //   1165: getfield L$1 : Ljava/lang/Object;
/*     */       //   1168: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   1171: astore #4
/*     */       //   1173: aload #6
/*     */       //   1175: getfield L$0 : Ljava/lang/Object;
/*     */       //   1178: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   1181: astore_2
/*     */       //   1182: aload #5
/*     */       //   1184: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   1187: aload #5
/*     */       //   1189: pop
/*     */       //   1190: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   1193: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   1196: invokevirtual getPRIMARY_USE_DEMO : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   1199: aload_2
/*     */       //   1200: aload #4
/*     */       //   1202: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   1207: aload #6
/*     */       //   1209: aload #6
/*     */       //   1211: aload_2
/*     */       //   1212: putfield L$0 : Ljava/lang/Object;
/*     */       //   1215: aload #6
/*     */       //   1217: aload #4
/*     */       //   1219: putfield L$1 : Ljava/lang/Object;
/*     */       //   1222: aload #6
/*     */       //   1224: bipush #13
/*     */       //   1226: putfield label : I
/*     */       //   1229: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   1232: dup
/*     */       //   1233: aload #7
/*     */       //   1235: if_acmpne -> 1267
/*     */       //   1238: aload #7
/*     */       //   1240: areturn
/*     */       //   1241: aload #6
/*     */       //   1243: getfield L$1 : Ljava/lang/Object;
/*     */       //   1246: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   1249: astore #4
/*     */       //   1251: aload #6
/*     */       //   1253: getfield L$0 : Ljava/lang/Object;
/*     */       //   1256: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   1259: astore_2
/*     */       //   1260: aload #5
/*     */       //   1262: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   1265: aload #5
/*     */       //   1267: pop
/*     */       //   1268: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   1271: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   1274: invokevirtual getPRIMARY_USE_TOOLS : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   1277: aload_2
/*     */       //   1278: aload #4
/*     */       //   1280: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   1285: aload #6
/*     */       //   1287: aload #6
/*     */       //   1289: aload_2
/*     */       //   1290: putfield L$0 : Ljava/lang/Object;
/*     */       //   1293: aload #6
/*     */       //   1295: aload #4
/*     */       //   1297: putfield L$1 : Ljava/lang/Object;
/*     */       //   1300: aload #6
/*     */       //   1302: bipush #14
/*     */       //   1304: putfield label : I
/*     */       //   1307: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   1310: dup
/*     */       //   1311: aload #7
/*     */       //   1313: if_acmpne -> 1345
/*     */       //   1316: aload #7
/*     */       //   1318: areturn
/*     */       //   1319: aload #6
/*     */       //   1321: getfield L$1 : Ljava/lang/Object;
/*     */       //   1324: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   1327: astore #4
/*     */       //   1329: aload #6
/*     */       //   1331: getfield L$0 : Ljava/lang/Object;
/*     */       //   1334: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   1337: astore_2
/*     */       //   1338: aload #5
/*     */       //   1340: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   1343: aload #5
/*     */       //   1345: pop
/*     */       //   1346: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   1349: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   1352: invokevirtual getADD_PLAN_TO_THOUGHTS : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   1355: aload_2
/*     */       //   1356: aload #4
/*     */       //   1358: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   1363: aload #6
/*     */       //   1365: aload #6
/*     */       //   1367: aload_2
/*     */       //   1368: putfield L$0 : Ljava/lang/Object;
/*     */       //   1371: aload #6
/*     */       //   1373: aload #4
/*     */       //   1375: putfield L$1 : Ljava/lang/Object;
/*     */       //   1378: aload #6
/*     */       //   1380: bipush #15
/*     */       //   1382: putfield label : I
/*     */       //   1385: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   1388: dup
/*     */       //   1389: aload #7
/*     */       //   1391: if_acmpne -> 1423
/*     */       //   1394: aload #7
/*     */       //   1396: areturn
/*     */       //   1397: aload #6
/*     */       //   1399: getfield L$1 : Ljava/lang/Object;
/*     */       //   1402: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   1405: astore #4
/*     */       //   1407: aload #6
/*     */       //   1409: getfield L$0 : Ljava/lang/Object;
/*     */       //   1412: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   1415: astore_2
/*     */       //   1416: aload #5
/*     */       //   1418: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   1421: aload #5
/*     */       //   1423: pop
/*     */       //   1424: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   1427: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   1430: invokevirtual getMAX_STEPS : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   1433: aload_2
/*     */       //   1434: aload #4
/*     */       //   1436: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   1441: aload #6
/*     */       //   1443: aload #6
/*     */       //   1445: aload_2
/*     */       //   1446: putfield L$0 : Ljava/lang/Object;
/*     */       //   1449: aload #6
/*     */       //   1451: aload #4
/*     */       //   1453: putfield L$1 : Ljava/lang/Object;
/*     */       //   1456: aload #6
/*     */       //   1458: bipush #16
/*     */       //   1460: putfield label : I
/*     */       //   1463: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   1466: dup
/*     */       //   1467: aload #7
/*     */       //   1469: if_acmpne -> 1501
/*     */       //   1472: aload #7
/*     */       //   1474: areturn
/*     */       //   1475: aload #6
/*     */       //   1477: getfield L$1 : Ljava/lang/Object;
/*     */       //   1480: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   1483: astore #4
/*     */       //   1485: aload #6
/*     */       //   1487: getfield L$0 : Ljava/lang/Object;
/*     */       //   1490: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   1493: astore_2
/*     */       //   1494: aload #5
/*     */       //   1496: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   1499: aload #5
/*     */       //   1501: pop
/*     */       //   1502: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   1505: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   1508: invokevirtual getALLOW_CALL_EXPERT : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   1511: aload_2
/*     */       //   1512: aload #4
/*     */       //   1514: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   1519: aload #6
/*     */       //   1521: aload #6
/*     */       //   1523: aload_2
/*     */       //   1524: putfield L$0 : Ljava/lang/Object;
/*     */       //   1527: aload #6
/*     */       //   1529: aload #4
/*     */       //   1531: putfield L$1 : Ljava/lang/Object;
/*     */       //   1534: aload #6
/*     */       //   1536: bipush #17
/*     */       //   1538: putfield label : I
/*     */       //   1541: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   1544: dup
/*     */       //   1545: aload #7
/*     */       //   1547: if_acmpne -> 1579
/*     */       //   1550: aload #7
/*     */       //   1552: areturn
/*     */       //   1553: aload #6
/*     */       //   1555: getfield L$1 : Ljava/lang/Object;
/*     */       //   1558: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   1561: astore #4
/*     */       //   1563: aload #6
/*     */       //   1565: getfield L$0 : Ljava/lang/Object;
/*     */       //   1568: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   1571: astore_2
/*     */       //   1572: aload #5
/*     */       //   1574: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   1577: aload #5
/*     */       //   1579: pop
/*     */       //   1580: getstatic com/intellij/ml/llm/matterhorn/settings/PropertyUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/settings/PropertyUtils;
/*     */       //   1583: getstatic com/intellij/ml/llm/matterhorn/ej/core/EjProperties.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EjProperties$Companion;
/*     */       //   1586: invokevirtual getADD_PROJECT_STR : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;
/*     */       //   1589: aload_2
/*     */       //   1590: aload #4
/*     */       //   1592: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   1597: aload #6
/*     */       //   1599: aload #6
/*     */       //   1601: aload #4
/*     */       //   1603: putfield L$0 : Ljava/lang/Object;
/*     */       //   1606: aload #6
/*     */       //   1608: aconst_null
/*     */       //   1609: putfield L$1 : Ljava/lang/Object;
/*     */       //   1612: aload #6
/*     */       //   1614: bipush #18
/*     */       //   1616: putfield label : I
/*     */       //   1619: invokevirtual setup : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   1622: dup
/*     */       //   1623: aload #7
/*     */       //   1625: if_acmpne -> 1648
/*     */       //   1628: aload #7
/*     */       //   1630: areturn
/*     */       //   1631: aload #6
/*     */       //   1633: getfield L$0 : Ljava/lang/Object;
/*     */       //   1636: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   1639: astore #4
/*     */       //   1641: aload #5
/*     */       //   1643: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   1646: aload #5
/*     */       //   1648: pop
/*     */       //   1649: aload #4
/*     */       //   1651: getfield element : Ljava/lang/Object;
/*     */       //   1654: areturn
/*     */       //   1655: new java/lang/IllegalStateException
/*     */       //   1658: dup
/*     */       //   1659: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   1662: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   1665: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #92	-> 60
/*     */       //   #93	-> 161
/*     */       //   #95	-> 176
/*     */       //   #96	-> 179
/*     */       //   #97	-> 185
/*     */       //   #98	-> 191
/*     */       //   #95	-> 192
/*     */       //   #92	-> 229
/*     */       //   #102	-> 258
/*     */       //   #92	-> 306
/*     */       //   #105	-> 335
/*     */       //   #92	-> 383
/*     */       //   #108	-> 412
/*     */       //   #92	-> 460
/*     */       //   #111	-> 489
/*     */       //   #92	-> 537
/*     */       //   #114	-> 566
/*     */       //   #115	-> 644
/*     */       //   #92	-> 692
/*     */       //   #118	-> 721
/*     */       //   #92	-> 770
/*     */       //   #121	-> 799
/*     */       //   #92	-> 848
/*     */       //   #124	-> 877
/*     */       //   #92	-> 926
/*     */       //   #127	-> 955
/*     */       //   #92	-> 1004
/*     */       //   #130	-> 1033
/*     */       //   #92	-> 1082
/*     */       //   #133	-> 1111
/*     */       //   #92	-> 1160
/*     */       //   #136	-> 1189
/*     */       //   #92	-> 1238
/*     */       //   #139	-> 1267
/*     */       //   #92	-> 1316
/*     */       //   #142	-> 1345
/*     */       //   #92	-> 1394
/*     */       //   #145	-> 1423
/*     */       //   #92	-> 1472
/*     */       //   #148	-> 1501
/*     */       //   #92	-> 1550
/*     */       //   #151	-> 1579
/*     */       //   #92	-> 1628
/*     */       //   #155	-> 1648
/*     */       //   #92	-> 1655
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   161	15	1	$this$setupFromEnvironment	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*     */       //   161	71	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   251	58	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   328	58	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   405	58	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   482	58	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   559	136	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   714	59	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   792	59	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   870	59	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   948	59	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   1026	59	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   1104	59	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   1182	59	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   1260	59	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   1338	59	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   1416	59	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   1494	59	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   1572	50	2	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*     */       //   170	62	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   242	67	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   319	67	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   396	67	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   473	67	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   550	145	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   705	68	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   783	68	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   861	68	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   939	68	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   1017	68	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   1095	68	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   1173	68	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   1251	68	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   1329	68	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   1407	68	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   1485	68	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   1563	68	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   1641	14	4	result	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   0	1666	3	$completion	Lkotlin/coroutines/Continuation;
/*     */       //   50	1605	6	$continuation	Lkotlin/coroutines/Continuation;
/*     */       //   57	1598	5	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     private static final Unit setupFromEnvironment$lambda$0(Ref.ObjectRef $result, LLM it) {
/* 100 */       Intrinsics.checkNotNullParameter(it, "it"); $result.element = AgentParameters.copy$default((AgentParameters)$result.element, ModelParameters.copy$default(((AgentParameters)$result.element).getModelParameters(), it, false, null, null, null, null, null, null, null, null, null, null, null, 0, null, 32766, null), 0, null, null, null, null, 0, false, false, false, false, false, 0, 0.0D, false, 32766, null);
/* 101 */       return Unit.INSTANCE;
/*     */     } private static final Unit setupFromEnvironment$lambda$1(Ref.ObjectRef $result, String it) {
/* 103 */       Intrinsics.checkNotNullParameter(it, "it"); $result.element = AgentParameters.copy$default((AgentParameters)$result.element, ModelParameters.copy$default(((AgentParameters)$result.element).getModelParameters(), null, Boolean.parseBoolean(it), null, null, null, null, null, null, null, null, null, null, null, 0, null, 32765, null), 0, null, null, null, null, 0, false, false, false, false, false, 0, 0.0D, false, 32766, null);
/* 104 */       return Unit.INSTANCE;
/*     */     } private static final Unit setupFromEnvironment$lambda$2(Ref.ObjectRef $result, String it) {
/* 106 */       Intrinsics.checkNotNullParameter(it, "it"); $result.element = AgentParameters.copy$default((AgentParameters)$result.element, ModelParameters.copy$default(((AgentParameters)$result.element).getModelParameters(), null, false, StringsKt.toDoubleOrNull(it), null, null, null, null, null, null, null, null, null, null, 0, null, 32763, null), 0, null, null, null, null, 0, false, false, false, false, false, 0, 0.0D, false, 32766, null);
/* 107 */       return Unit.INSTANCE;
/*     */     } private static final Unit setupFromEnvironment$lambda$3(Ref.ObjectRef $result, String it) {
/* 109 */       Intrinsics.checkNotNullParameter(it, "it"); $result.element = AgentParameters.copy$default((AgentParameters)$result.element, ModelParameters.copy$default(((AgentParameters)$result.element).getModelParameters(), null, false, null, null, null, null, null, null, null, null, null, null, StringsKt.toIntOrNull(it), 0, null, 28671, null), 0, null, null, null, null, 0, false, false, false, false, false, 0, 0.0D, false, 32766, null);
/* 110 */       return Unit.INSTANCE;
/*     */     } private static final Unit setupFromEnvironment$lambda$4(Ref.ObjectRef $result, String it) {
/* 112 */       Intrinsics.checkNotNullParameter(it, "it"); $result.element = AgentParameters.copy$default((AgentParameters)$result.element, ModelParameters.copy$default(((AgentParameters)$result.element).getModelParameters(), null, false, null, null, null, null, null, null, null, null, null, null, null, 0, it, 16383, null), 0, null, null, null, null, 0, false, false, false, false, false, 0, 0.0D, false, 32766, null);
/* 113 */       return Unit.INSTANCE;
/*     */     }
/*     */     private static final Unit setupFromEnvironment$lambda$5(Ref.ObjectRef $result, String it) {
/* 116 */       Intrinsics.checkNotNullParameter(it, "it"); $result.element = AgentParameters.copy$default((AgentParameters)$result.element, null, 0, HistoryProcessors.valueOf(it), null, null, null, 0, false, false, false, false, false, 0, 0.0D, false, 32763, null);
/* 117 */       return Unit.INSTANCE;
/*     */     } private static final Unit setupFromEnvironment$lambda$6(Ref.ObjectRef $result, String it) {
/* 119 */       Intrinsics.checkNotNullParameter(it, "it"); $result.element = AgentParameters.copy$default((AgentParameters)$result.element, null, 0, null, null, StringsKt.toIntOrNull(it), null, 0, false, false, false, false, false, 0, 0.0D, false, 32751, null);
/* 120 */       return Unit.INSTANCE;
/*     */     } private static final Unit setupFromEnvironment$lambda$7(Ref.ObjectRef $result, String it) {
/* 122 */       Intrinsics.checkNotNullParameter(it, "it"); $result.element = AgentParameters.copy$default((AgentParameters)$result.element, null, 0, null, null, null, StringsKt.toIntOrNull(it), 0, false, false, false, false, false, 0, 0.0D, false, 32735, null);
/* 123 */       return Unit.INSTANCE;
/*     */     } private static final Unit setupFromEnvironment$lambda$8(Ref.ObjectRef $result, String it) {
/* 125 */       Intrinsics.checkNotNullParameter(it, "it"); StringsKt.toIntOrNull(it); $result.element = AgentParameters.copy$default((AgentParameters)$result.element, null, (StringsKt.toIntOrNull(it) != null) ? StringsKt.toIntOrNull(it).intValue() : 1, null, null, null, null, 0, false, false, false, false, false, 0, 0.0D, false, 32765, null);
/* 126 */       return Unit.INSTANCE;
/*     */     } private static final Unit setupFromEnvironment$lambda$9(Ref.ObjectRef $result, String it) {
/* 128 */       Intrinsics.checkNotNullParameter(it, "it"); $result.element = AgentParameters.copy$default((AgentParameters)$result.element, null, 0, null, Critiques.valueOf(it), null, null, 0, false, false, false, false, false, 0, 0.0D, false, 32759, null);
/* 129 */       return Unit.INSTANCE;
/*     */     } private static final Unit setupFromEnvironment$lambda$10(Ref.ObjectRef $result, String it) {
/* 131 */       Intrinsics.checkNotNullParameter(it, "it"); $result.element = AgentParameters.copy$default((AgentParameters)$result.element, null, 0, null, null, null, null, 0, Intrinsics.areEqual(it, "true"), false, false, false, false, 0, 0.0D, false, 32639, null);
/* 132 */       return Unit.INSTANCE;
/*     */     } private static final Unit setupFromEnvironment$lambda$11(Ref.ObjectRef $result, String it) {
/* 134 */       Intrinsics.checkNotNullParameter(it, "it"); $result.element = AgentParameters.copy$default((AgentParameters)$result.element, null, 0, null, null, null, null, 0, false, Intrinsics.areEqual(it, "true"), false, false, false, 0, 0.0D, false, 32511, null);
/* 135 */       return Unit.INSTANCE;
/*     */     } private static final Unit setupFromEnvironment$lambda$12(Ref.ObjectRef $result, String it) {
/* 137 */       Intrinsics.checkNotNullParameter(it, "it"); $result.element = AgentParameters.copy$default((AgentParameters)$result.element, null, 0, null, null, null, null, 0, false, false, Intrinsics.areEqual(it, "true"), false, false, 0, 0.0D, false, 32255, null);
/* 138 */       return Unit.INSTANCE;
/*     */     } private static final Unit setupFromEnvironment$lambda$13(Ref.ObjectRef $result, String it) {
/* 140 */       Intrinsics.checkNotNullParameter(it, "it"); $result.element = AgentParameters.copy$default((AgentParameters)$result.element, null, 0, null, null, null, null, 0, false, false, false, Intrinsics.areEqual(it, "true"), false, 0, 0.0D, false, 31743, null);
/* 141 */       return Unit.INSTANCE;
/*     */     } private static final Unit setupFromEnvironment$lambda$14(Ref.ObjectRef $result, String it) {
/* 143 */       Intrinsics.checkNotNullParameter(it, "it"); $result.element = AgentParameters.copy$default((AgentParameters)$result.element, null, 0, null, null, null, null, 0, false, false, false, false, Intrinsics.areEqual(it, "true"), 0, 0.0D, false, 30719, null);
/* 144 */       return Unit.INSTANCE;
/*     */     } private static final Unit setupFromEnvironment$lambda$15(Ref.ObjectRef $result, String it) {
/* 146 */       Intrinsics.checkNotNullParameter(it, "it"); StringsKt.toIntOrNull(it); $result.element = AgentParameters.copy$default((AgentParameters)$result.element, null, 0, null, null, null, null, 0, false, false, false, false, false, (StringsKt.toIntOrNull(it) != null) ? StringsKt.toIntOrNull(it).intValue() : 40, 0.0D, false, 28671, null);
/* 147 */       return Unit.INSTANCE;
/*     */     } private static final Unit setupFromEnvironment$lambda$16(Ref.ObjectRef $result, String it) {
/* 149 */       Intrinsics.checkNotNullParameter(it, "it"); StringsKt.toDoubleOrNull(it); $result.element = AgentParameters.copy$default((AgentParameters)$result.element, null, 0, null, null, null, null, 0, false, false, false, false, false, 0, (StringsKt.toDoubleOrNull(it) != null) ? StringsKt.toDoubleOrNull(it).doubleValue() : 0.0D, false, 24575, null);
/* 150 */       return Unit.INSTANCE;
/*     */     } private static final Unit setupFromEnvironment$lambda$17(Ref.ObjectRef $result, String it) {
/* 152 */       Intrinsics.checkNotNullParameter(it, "it"); $result.element = AgentParameters.copy$default((AgentParameters)$result.element, null, 0, null, null, null, null, 0, false, false, false, false, false, 0, 0.0D, Intrinsics.areEqual(it, "true"), 16383, null);
/* 153 */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     @DebugMetadata(f = "AbstractIssueSingleStepAgentWorker.kt", l = {95, 102, 105, 108, 111, 115, 118, 121, 124, 127, 130, 133, 136, 139, 142, 145, 148, 151}, i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0"}, n = {"propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "result"}, m = "setupFromEnvironment", c = "com.intellij.ml.llm.matterhorn.ej.core.AgentParameters$Companion")
/*     */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */     static final class AgentParameters$Companion$setupFromEnvironment$1 extends ContinuationImpl {
/*     */       Object L$0;
/*     */       Object L$1;
/*     */       int label;
/*     */       
/*     */       AgentParameters$Companion$setupFromEnvironment$1(Continuation $completion) {
/*     */         super($completion);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Object invokeSuspend(@NotNull Object $result) {
/*     */         this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return AgentParameters.Companion.this.setupFromEnvironment(null, null, (Continuation<? super AgentParameters>)this);
/*     */       }
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AgentParameters.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */