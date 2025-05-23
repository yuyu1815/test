/*    */ package com.intellij.ml.llm.matterhorn.core.llm.openai;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.internal.DoubleSerializer;
/*    */ import kotlinx.serialization.internal.IntSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000^\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\006\n\002\b\002\n\002\020\b\n\000\n\002\020\013\n\002\b\006\n\002\020$\n\002\b\006\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b,\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 U2\0020\001:\002TUBË\001\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005\022\n\b\002\020\007\032\004\030\0010\b\022\n\b\002\020\t\032\004\030\0010\b\022\n\b\002\020\n\032\004\030\0010\013\022\n\b\002\020\f\032\004\030\0010\r\022\020\b\002\020\016\032\n\022\004\022\0020\003\030\0010\005\022\n\b\002\020\017\032\004\030\0010\013\022\n\b\002\020\020\032\004\030\0010\013\022\n\b\002\020\021\032\004\030\0010\b\022\n\b\002\020\022\032\004\030\0010\b\022\026\b\002\020\023\032\020\022\004\022\0020\003\022\004\022\0020\013\030\0010\024\022\n\b\002\020\025\032\004\030\0010\003\022\n\b\002\020\026\032\004\030\0010\013\022\n\b\002\020\027\032\004\030\0010\003¢\006\004\b\030\020\031B1\b\026\022\006\020\032\032\0020\033\022\f\020\004\032\b\022\004\022\0020\0060\005\022\020\b\002\020\034\032\n\022\004\022\0020\003\030\0010\005¢\006\004\b\030\020\035BÉ\001\b\020\022\006\020\036\032\0020\013\022\b\020\002\032\004\030\0010\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b\022\b\020\t\032\004\030\0010\b\022\b\020\n\032\004\030\0010\013\022\b\020\f\032\004\030\0010\r\022\016\020\016\032\n\022\004\022\0020\003\030\0010\005\022\b\020\017\032\004\030\0010\013\022\b\020\020\032\004\030\0010\013\022\b\020\021\032\004\030\0010\b\022\b\020\022\032\004\030\0010\b\022\024\020\023\032\020\022\004\022\0020\003\022\004\022\0020\013\030\0010\024\022\b\020\025\032\004\030\0010\003\022\b\020\026\032\004\030\0010\013\022\b\020\027\032\004\030\0010\003\022\b\020\037\032\004\030\0010 ¢\006\004\b\030\020!J%\020L\032\0020M2\006\020N\032\0020\0002\006\020O\032\0020P2\006\020Q\032\0020RH\001¢\006\002\bSR\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\"\020#\032\004\b$\020%R\"\020\004\032\b\022\004\022\0020\0060\0058\006X\004¢\006\016\n\000\022\004\b&\020#\032\004\b'\020(R \020\007\032\004\030\0010\b8\006X\004¢\006\020\n\002\020,\022\004\b)\020#\032\004\b*\020+R \020\t\032\004\030\0010\b8\006X\004¢\006\020\n\002\020,\022\004\b-\020#\032\004\b.\020+R \020\n\032\004\030\0010\0138\006X\004¢\006\020\n\002\0202\022\004\b/\020#\032\004\b0\0201R(\020\f\032\004\030\0010\r8\006@\006X\016¢\006\026\n\002\0208\022\004\b3\020#\032\004\b4\0205\"\004\b6\0207R$\020\016\032\n\022\004\022\0020\003\030\0010\0058\006X\004¢\006\016\n\000\022\004\b9\020#\032\004\b:\020(R \020\017\032\004\030\0010\0138\006X\004¢\006\020\n\002\0202\022\004\b;\020#\032\004\b<\0201R \020\020\032\004\030\0010\0138\006X\004¢\006\020\n\002\0202\022\004\b=\020#\032\004\b>\0201R \020\021\032\004\030\0010\b8\006X\004¢\006\020\n\002\020,\022\004\b?\020#\032\004\b@\020+R \020\022\032\004\030\0010\b8\006X\004¢\006\020\n\002\020,\022\004\bA\020#\032\004\bB\020+R*\020\023\032\020\022\004\022\0020\003\022\004\022\0020\013\030\0010\0248\006X\004¢\006\016\n\000\022\004\bC\020#\032\004\bD\020ER\036\020\025\032\004\030\0010\0038\006X\004¢\006\016\n\000\022\004\bF\020#\032\004\bG\020%R \020\026\032\004\030\0010\0138\006X\004¢\006\020\n\002\0202\022\004\bH\020#\032\004\bI\0201R\036\020\027\032\004\030\0010\0038\006X\004¢\006\016\n\000\022\004\bJ\020#\032\004\bK\020%¨\006V"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiChatRequestBody;", "", "model", "", "messages", "", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIChatMessage;", "temperature", "", "topP", "numberOfSuggestions", "", "stream", "", "stop", "maxTokens", "maxCompletionTokens", "presencePenalty", "frequencyPenalty", "logitBias", "", "user", "seed", "reasoningEffort", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "stopSequences", "(Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Ljava/util/List;Ljava/util/List;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getModel$annotations", "()V", "getModel", "()Ljava/lang/String;", "getMessages$annotations", "getMessages", "()Ljava/util/List;", "getTemperature$annotations", "getTemperature", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTopP$annotations", "getTopP", "getNumberOfSuggestions$annotations", "getNumberOfSuggestions", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStream$annotations", "getStream", "()Ljava/lang/Boolean;", "setStream", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getStop$annotations", "getStop", "getMaxTokens$annotations", "getMaxTokens", "getMaxCompletionTokens$annotations", "getMaxCompletionTokens", "getPresencePenalty$annotations", "getPresencePenalty", "getFrequencyPenalty$annotations", "getFrequencyPenalty", "getLogitBias$annotations", "getLogitBias", "()Ljava/util/Map;", "getUser$annotations", "getUser", "getSeed$annotations", "getSeed", "getReasoningEffort$annotations", "getReasoningEffort", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ @SourceDebugExtension({"SMAP\nOpenAIChatRequestBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenAIChatRequestBody.kt\ncom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiChatRequestBody\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
/*    */ public final class OpenAiChatRequestBody {
/*    */   @NotNull
/* 23 */   public static final Companion Companion = new Companion(null); @NotNull private final String model; @NotNull private final List<OpenAIChatMessage> messages; @Nullable private final Double temperature; @Nullable private final Double topP; @Nullable private final Integer numberOfSuggestions; @Nullable private Boolean stream; @Nullable private final List<String> stop; @Nullable private final Integer maxTokens; @Nullable private final Integer maxCompletionTokens; @Nullable private final Double presencePenalty; @Nullable private final Double frequencyPenalty; @Nullable private final Map<String, Integer> logitBias; @Nullable private final String user; @Nullable private final Integer seed; @Nullable private final String reasoningEffort; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[15]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = (KSerializer)new ArrayListSerializer((KSerializer)OpenAIChatMessage.$serializer.INSTANCE); arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = null; arrayOfKSerializer[4] = null; arrayOfKSerializer[5] = null; arrayOfKSerializer[6] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[7] = null; arrayOfKSerializer[8] = null; arrayOfKSerializer[9] = null; arrayOfKSerializer[10] = null; arrayOfKSerializer[11] = (KSerializer)new LinkedHashMapSerializer((KSerializer)StringSerializer.INSTANCE, (KSerializer)IntSerializer.INSTANCE); arrayOfKSerializer[12] = null; arrayOfKSerializer[13] = null; arrayOfKSerializer[14] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiChatRequestBody$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAiChatRequestBody;", "core-llm"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<OpenAiChatRequestBody> serializer() { return (KSerializer<OpenAiChatRequestBody>)OpenAiChatRequestBody.$serializer.INSTANCE; } }
/*    */   
/* 25 */   @NotNull public final String getModel() { return this.model; } @NotNull public final List<OpenAIChatMessage> getMessages() { return this.messages; } @Nullable public final Double getTemperature() { return this.temperature; } @Nullable public final Double getTopP() { return this.topP; } public OpenAiChatRequestBody(@NotNull String model, @NotNull List<OpenAIChatMessage> messages, @Nullable Double temperature, @Nullable Double topP, @Nullable Integer numberOfSuggestions, @Nullable Boolean stream, @Nullable List<String> stop, @Nullable Integer maxTokens, @Nullable Integer maxCompletionTokens, @Nullable Double presencePenalty, @Nullable Double frequencyPenalty, @Nullable Map<String, Integer> logitBias, @Nullable String user, @Nullable Integer seed, @Nullable String reasoningEffort) { this.model = model;
/*    */ 
/*    */     
/* 28 */     this.messages = messages;
/*    */ 
/*    */     
/* 31 */     this.temperature = temperature;
/*    */ 
/*    */     
/* 34 */     this.topP = topP;
/*    */ 
/*    */     
/* 37 */     this.numberOfSuggestions = numberOfSuggestions;
/*    */ 
/*    */     
/* 40 */     this.stream = stream;
/*    */ 
/*    */     
/* 43 */     this.stop = stop;
/*    */ 
/*    */     
/* 46 */     this.maxTokens = maxTokens;
/*    */ 
/*    */     
/* 49 */     this.maxCompletionTokens = maxCompletionTokens;
/*    */ 
/*    */     
/* 52 */     this.presencePenalty = presencePenalty;
/*    */ 
/*    */     
/* 55 */     this.frequencyPenalty = frequencyPenalty;
/*    */ 
/*    */     
/* 58 */     this.logitBias = logitBias;
/*    */ 
/*    */     
/* 61 */     this.user = user;
/*    */ 
/*    */ 
/*    */     
/* 65 */     this.seed = seed;
/*    */ 
/*    */     
/* 68 */     this.reasoningEffort = reasoningEffort; } @Nullable public final Integer getNumberOfSuggestions() { return this.numberOfSuggestions; } @Nullable public final Boolean getStream() { return this.stream; } public final void setStream(@Nullable Boolean <set-?>) { this.stream = <set-?>; } @Nullable public final String getReasoningEffort() { return this.reasoningEffort; } @Nullable public final List<String> getStop() { return this.stop; } @Nullable public final Integer getMaxTokens() { return this.maxTokens; }
/*    */   @Nullable public final Integer getMaxCompletionTokens() { return this.maxCompletionTokens; }
/*    */   @Nullable public final Double getPresencePenalty() { return this.presencePenalty; }
/*    */   @Nullable public final Double getFrequencyPenalty() { return this.frequencyPenalty; }
/*    */   @Nullable public final Map<String, Integer> getLogitBias() { return this.logitBias; }
/*    */   @Nullable public final String getUser() { return this.user; }
/*    */   @Nullable public final Integer getSeed() { return this.seed; }
/* 75 */   public OpenAiChatRequestBody(@NotNull ModelParameters modelParameters, @NotNull List<OpenAIChatMessage> messages, @Nullable List<String> stopSequences) { this(
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 89 */         str1, list, double_1, double_2, integer2, bool, list1, integer3, integer4, double_3, double_4, map, str2, !bool1 ? integer1 : null, 
/* 90 */         ModelParameters.Companion.isO(modelParameters) ? modelParameters.getReasoningEffort() : null); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\openai\OpenAiChatRequestBody.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */