/*     */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
/*     */ import java.util.List;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KClass;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SealedClassSerializer;
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
/*     */ import kotlinx.serialization.internal.ArrayListSerializer;
/*     */ import kotlinx.serialization.internal.BooleanSerializer;
/*     */ import kotlinx.serialization.internal.DoubleSerializer;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.IntSerializer;
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
/*     */ @Serializable
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000n\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\013\n\000\n\002\020\006\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b#\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 I2\0020\001:\002HIB\001\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005\022\f\020\007\032\b\022\004\022\0020\b0\005\022\n\b\002\020\t\032\004\030\0010\n\022\n\b\002\020\013\032\004\030\0010\f\022\n\b\002\020\r\032\004\030\0010\016\022\n\b\002\020\017\032\004\030\0010\020\022\020\b\002\020\021\032\n\022\004\022\0020\003\030\0010\005\022\020\b\002\020\022\032\n\022\004\022\0020\023\030\0010\005\022\n\b\002\020\024\032\004\030\0010\025¢\006\004\b\026\020\027BU\b\026\022\006\020\030\032\0020\031\022\006\020\007\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005\022\016\020\022\032\n\022\004\022\0020\023\030\0010\005\022\n\b\002\020\017\032\004\030\0010\020\022\020\b\002\020\021\032\n\022\004\022\0020\003\030\0010\005¢\006\004\b\026\020\032B\001\b\020\022\006\020\033\032\0020\n\022\b\020\002\032\004\030\0010\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\016\020\007\032\n\022\004\022\0020\b\030\0010\005\022\b\020\t\032\004\030\0010\n\022\b\020\013\032\004\030\0010\f\022\b\020\r\032\004\030\0010\016\022\b\020\017\032\004\030\0010\020\022\016\020\021\032\n\022\004\022\0020\003\030\0010\005\022\016\020\022\032\n\022\004\022\0020\023\030\0010\005\022\b\020\024\032\004\030\0010\025\022\b\020\034\032\004\030\0010\035¢\006\004\b\026\020\036J%\020@\032\0020A2\006\020B\032\0020\0002\006\020C\032\0020D2\006\020E\032\0020FH\001¢\006\002\bGR\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\037\020 \032\004\b!\020\"R\"\020\004\032\b\022\004\022\0020\0060\0058\006X\004¢\006\016\n\000\022\004\b#\020 \032\004\b$\020%R\"\020\007\032\b\022\004\022\0020\b0\0058\006X\004¢\006\016\n\000\022\004\b&\020 \032\004\b'\020%R \020\t\032\004\030\0010\n8\006X\004¢\006\020\n\002\020+\022\004\b(\020 \032\004\b)\020*R(\020\013\032\004\030\0010\f8\006@\006X\016¢\006\026\n\002\0201\022\004\b,\020 \032\004\b-\020.\"\004\b/\0200R \020\r\032\004\030\0010\0168\006X\004¢\006\020\n\002\0205\022\004\b2\020 \032\004\b3\0204R\036\020\017\032\004\030\0010\0208\006X\004¢\006\016\n\000\022\004\b6\020 \032\004\b7\0208R$\020\021\032\n\022\004\022\0020\003\030\0010\0058\006X\004¢\006\016\n\000\022\004\b9\020 \032\004\b:\020%R$\020\022\032\n\022\004\022\0020\023\030\0010\0058\006X\004¢\006\016\n\000\022\004\b;\020 \032\004\b<\020%R\036\020\024\032\004\030\0010\0258\006X\004¢\006\016\n\000\022\004\b=\020 \032\004\b>\020?¨\006J"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequestBody;", "", "model", "", "messages", "", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatMessage;", "system", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicContent;", "maxTokens", "", "stream", "", "temperature", "", "toolChoice", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolChoiceParam;", "stopSequences", "tools", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolParam;", "thinking", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicThinkingParam;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Double;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolChoiceParam;Ljava/util/List;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicThinkingParam;)V", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "(Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolChoiceParam;Ljava/util/List;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Double;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolChoiceParam;Ljava/util/List;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicThinkingParam;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getModel$annotations", "()V", "getModel", "()Ljava/lang/String;", "getMessages$annotations", "getMessages", "()Ljava/util/List;", "getSystem$annotations", "getSystem", "getMaxTokens$annotations", "getMaxTokens", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStream$annotations", "getStream", "()Ljava/lang/Boolean;", "setStream", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getTemperature$annotations", "getTemperature", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getToolChoice$annotations", "getToolChoice", "()Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolChoiceParam;", "getStopSequences$annotations", "getStopSequences", "getTools$annotations", "getTools", "getThinking$annotations", "getThinking", "()Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicThinkingParam;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*     */ @SourceDebugExtension({"SMAP\nAnthropicChatRequestBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnthropicChatRequestBody.kt\ncom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequestBody\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
/*     */ public final class AnthropicChatRequestBody
/*     */ {
/*     */   @NotNull
/* 125 */   public static final Companion Companion = new Companion(null); @NotNull private final String model; @NotNull private final List<AnthropicChatMessage> messages; @NotNull private final List<AnthropicContent> system; @Nullable private final Integer maxTokens; @Nullable private Boolean stream; @Nullable private final Double temperature; @Nullable private final AnthropicToolChoiceParam toolChoice; @Nullable private final List<String> stopSequences; @Nullable private final List<AnthropicToolParam> tools; @Nullable private final AnthropicThinkingParam thinking; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer1 = new KSerializer[10]; arrayOfKSerializer1[0] = null; arrayOfKSerializer1[1] = (KSerializer)new ArrayListSerializer((KSerializer)AnthropicChatMessage.$serializer.INSTANCE); KClass[] arrayOfKClass = new KClass[6]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(AnthropicImageContent.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(AnthropicRedactedThinkingContent.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(AnthropicTextContent.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(AnthropicThinkingContent.class); arrayOfKClass[4] = Reflection.getOrCreateKotlinClass(AnthropicToolContent.class); arrayOfKClass[5] = Reflection.getOrCreateKotlinClass(AnthropicToolResultContent.class); KSerializer[] arrayOfKSerializer2 = new KSerializer[6]; arrayOfKSerializer2[0] = (KSerializer)AnthropicImageContent.$serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)AnthropicRedactedThinkingContent.$serializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)AnthropicTextContent.$serializer.INSTANCE; arrayOfKSerializer2[3] = (KSerializer)AnthropicThinkingContent.$serializer.INSTANCE; arrayOfKSerializer2[4] = (KSerializer)AnthropicToolContent.$serializer.INSTANCE; arrayOfKSerializer2[5] = (KSerializer)AnthropicToolResultContent.$serializer.INSTANCE; arrayOfKSerializer1[2] = (KSerializer)new ArrayListSerializer((KSerializer)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.core.llm.anthropic.AnthropicContent", Reflection.getOrCreateKotlinClass(AnthropicContent.class), arrayOfKClass, arrayOfKSerializer2, new java.lang.annotation.Annotation[0])); arrayOfKSerializer1[3] = null; arrayOfKSerializer1[4] = null; arrayOfKSerializer1[5] = null; arrayOfKSerializer1[6] = null; arrayOfKSerializer1[7] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer1[8] = (KSerializer)new ArrayListSerializer(AnthropicToolParam.Companion.serializer()); arrayOfKSerializer1[9] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer1; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequestBody$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicChatRequestBody;", "core-llm"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<AnthropicChatRequestBody> serializer() { return (KSerializer<AnthropicChatRequestBody>)AnthropicChatRequestBody.$serializer.INSTANCE; } }
/*     */   
/* 127 */   @NotNull public final String getModel() { return this.model; } @NotNull public final List<AnthropicChatMessage> getMessages() { return this.messages; } @NotNull public final List<AnthropicContent> getSystem() { return this.system; } public AnthropicChatRequestBody(@NotNull String model, @NotNull List<AnthropicChatMessage> messages, @NotNull List<AnthropicContent> system, @Nullable Integer maxTokens, @Nullable Boolean stream, @Nullable Double temperature, @Nullable AnthropicToolChoiceParam toolChoice, @Nullable List<String> stopSequences, @Nullable List<AnthropicToolParam> tools, @Nullable AnthropicThinkingParam thinking) { this.model = model;
/*     */ 
/*     */     
/* 130 */     this.messages = messages;
/*     */ 
/*     */     
/* 133 */     this.system = system;
/*     */ 
/*     */     
/* 136 */     this.maxTokens = maxTokens;
/*     */ 
/*     */     
/* 139 */     this.stream = stream;
/*     */ 
/*     */     
/* 142 */     this.temperature = temperature;
/*     */ 
/*     */     
/* 145 */     this.toolChoice = toolChoice;
/*     */ 
/*     */     
/* 148 */     this.stopSequences = stopSequences;
/*     */ 
/*     */     
/* 151 */     this.tools = tools;
/*     */ 
/*     */     
/* 154 */     this.thinking = thinking; } @Nullable public final Integer getMaxTokens() { return this.maxTokens; } @Nullable public final Boolean getStream() { return this.stream; } @Nullable public final AnthropicThinkingParam getThinking() { return this.thinking; } public final void setStream(@Nullable Boolean <set-?>) { this.stream = <set-?>; } @Nullable
/*     */   public final Double getTemperature() { return this.temperature; }
/*     */   @Nullable
/*     */   public final AnthropicToolChoiceParam getToolChoice() { return this.toolChoice; }
/*     */   @Nullable
/*     */   public final List<String> getStopSequences() { return this.stopSequences; }
/*     */   @Nullable
/*     */   public final List<AnthropicToolParam> getTools() {
/*     */     return this.tools;
/*     */   }
/*     */   public AnthropicChatRequestBody(@NotNull ModelParameters modelParameters, @NotNull String system, @NotNull List<AnthropicChatMessage> messages, @Nullable List<AnthropicToolParam> tools, @Nullable AnthropicToolChoiceParam toolChoice, @Nullable List<String> stopSequences) {
/* 165 */     this(
/* 166 */         str, 
/* 167 */         messages, 
/*     */ 
/*     */         
/* 170 */         list, 
/*     */ 
/*     */ 
/*     */         
/* 174 */         Integer.valueOf(i), Boolean.valueOf(bool), Double.valueOf(d), anthropicToolChoiceParam, stopSequences, tools, 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 180 */         anthropicThinkingParam);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicChatRequestBody.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */