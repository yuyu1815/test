/*    */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*    */ 
/*    */ import java.util.Map;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.KeepGeneratedSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.LinkedHashMapSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import kotlinx.serialization.json.JsonElement;
/*    */ import kotlinx.serialization.json.JsonElementSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ 
/*    */ 
/*    */ @KeepGeneratedSerializer
/*    */ @Serializable(with = AnthropicToolParamSerializer.class)
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\020$\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\017\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 (2\0020\001:\002'(BE\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\003\022\b\020\005\032\004\030\0010\003\022\b\020\006\032\004\030\0010\007\022\026\b\002\020\b\032\020\022\004\022\0020\003\022\004\022\0020\n\030\0010\t¢\006\004\b\013\020\fBY\b\020\022\006\020\r\032\0020\016\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\b\020\005\032\004\030\0010\003\022\b\020\006\032\004\030\0010\007\022\024\020\b\032\020\022\004\022\0020\003\022\004\022\0020\n\030\0010\t\022\b\020\017\032\004\030\0010\020¢\006\004\b\013\020\021J%\020\037\032\0020 2\006\020!\032\0020\0002\006\020\"\032\0020#2\006\020$\032\0020%H\001¢\006\002\b&R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\022\020\023\032\004\b\024\020\025R\036\020\004\032\004\030\0010\0038\006X\004¢\006\016\n\000\022\004\b\026\020\023\032\004\b\027\020\025R\036\020\005\032\004\030\0010\0038\006X\004¢\006\016\n\000\022\004\b\030\020\023\032\004\b\031\020\025R\036\020\006\032\004\030\0010\0078\006X\004¢\006\016\n\000\022\004\b\032\020\023\032\004\b\033\020\034R\037\020\b\032\020\022\004\022\0020\003\022\004\022\0020\n\030\0010\t¢\006\b\n\000\032\004\b\035\020\036¨\006)"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolParam;", "", "name", "", "type", "description", "inputSchema", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicInputSchema;", "settings", "", "Lkotlinx/serialization/json/JsonElement;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicInputSchema;Ljava/util/Map;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicInputSchema;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getType$annotations", "getType", "getDescription$annotations", "getDescription", "getInputSchema$annotations", "getInputSchema", "()Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicInputSchema;", "getSettings", "()Ljava/util/Map;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ public final class AnthropicToolParam
/*    */ {
/*    */   @NotNull
/*    */   private final String name;
/*    */   @Nullable
/*    */   private final String type;
/*    */   @Nullable
/*    */   private final String description;
/*    */   @Nullable
/*    */   private final AnthropicInputSchema inputSchema;
/*    */   @Nullable
/*    */   private final Map<String, JsonElement> settings;
/*    */   @NotNull
/* 64 */   public static final Companion Companion = new Companion(null); @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[5]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = null; arrayOfKSerializer[4] = (KSerializer)new LinkedHashMapSerializer((KSerializer)StringSerializer.INSTANCE, (KSerializer)JsonElementSerializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\023\020\004\032\b\022\004\022\0020\0060\005H\000¢\006\002\b\007J\f\020\b\032\b\022\004\022\0020\0060\005¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolParam$Companion;", "", "<init>", "()V", "generatedSerializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolParam;", "generatedSerializer$core_llm", "serializer", "core-llm"}) public static final class Companion { @NotNull public final KSerializer<AnthropicToolParam> serializer() { return (KSerializer<AnthropicToolParam>)new AnthropicToolParamSerializer(); } private Companion() {} @NotNull public final KSerializer<AnthropicToolParam> generatedSerializer$core_llm() { return (KSerializer<AnthropicToolParam>)AnthropicToolParam.$serializer.INSTANCE; }
/*    */      }
/*    */   
/* 67 */   public AnthropicToolParam(@NotNull String name, @Nullable String type, @Nullable String description, @Nullable AnthropicInputSchema inputSchema, @Nullable Map<String, JsonElement> settings) { this.name = name;
/*    */ 
/*    */     
/* 70 */     this.type = type;
/*    */ 
/*    */     
/* 73 */     this.description = description;
/*    */ 
/*    */     
/* 76 */     this.inputSchema = inputSchema;
/*    */ 
/*    */     
/* 79 */     this.settings = settings; } @Nullable public final Map<String, JsonElement> getSettings() { return this.settings; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getName() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getType() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getDescription() {
/*    */     return this.description;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final AnthropicInputSchema getInputSchema() {
/*    */     return this.inputSchema;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicToolParam.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */