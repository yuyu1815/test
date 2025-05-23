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
/*    */ @Serializable
/*    */ @SerialName("tool_use")
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020$\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\023\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 12\0020\001:\00201BC\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\003\022\026\b\002\020\005\032\020\022\004\022\0020\003\022\004\022\0020\007\030\0010\006\022\n\b\002\020\b\032\004\030\0010\t¢\006\004\b\n\020\013BO\b\020\022\006\020\f\032\0020\r\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\024\020\005\032\020\022\004\022\0020\003\022\004\022\0020\007\030\0010\006\022\b\020\b\032\004\030\0010\t\022\b\020\016\032\004\030\0010\017¢\006\004\b\n\020\020J\013\020\035\032\004\030\0010\003HÆ\003J\013\020\036\032\004\030\0010\003HÆ\003J\027\020\037\032\020\022\004\022\0020\003\022\004\022\0020\007\030\0010\006HÆ\003J\013\020 \032\004\030\0010\tHÆ\003JE\020!\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\n\b\002\020\004\032\004\030\0010\0032\026\b\002\020\005\032\020\022\004\022\0020\003\022\004\022\0020\007\030\0010\0062\n\b\002\020\b\032\004\030\0010\tHÆ\001J\023\020\"\032\0020#2\b\020$\032\004\030\0010%HÖ\003J\t\020&\032\0020\rHÖ\001J\t\020'\032\0020\003HÖ\001J%\020(\032\0020)2\006\020*\032\0020\0002\006\020+\032\0020,2\006\020-\032\0020.H\001¢\006\002\b/R\036\020\002\032\004\030\0010\0038\006X\004¢\006\016\n\000\022\004\b\021\020\022\032\004\b\023\020\024R\036\020\004\032\004\030\0010\0038\006X\004¢\006\016\n\000\022\004\b\025\020\022\032\004\b\026\020\024R*\020\005\032\020\022\004\022\0020\003\022\004\022\0020\007\030\0010\0068\006X\004¢\006\016\n\000\022\004\b\027\020\022\032\004\b\030\020\031R\036\020\b\032\004\030\0010\t8\026X\004¢\006\016\n\000\022\004\b\032\020\022\032\004\b\033\020\034¨\0062"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolContent;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicContent;", "toolId", "", "toolName", "toolInput", "", "Lkotlinx/serialization/json/JsonElement;", "cache", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getToolId$annotations", "()V", "getToolId", "()Ljava/lang/String;", "getToolName$annotations", "getToolName", "getToolInput$annotations", "getToolInput", "()Ljava/util/Map;", "getCache$annotations", "getCache", "()Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ public final class AnthropicToolContent
/*    */   implements AnthropicContent
/*    */ {
/*    */   @Nullable
/*    */   private final String toolId;
/*    */   @Nullable
/*    */   private final String toolName;
/*    */   @Nullable
/*    */   private final Map<String, JsonElement> toolInput;
/*    */   @NotNull
/* 54 */   public static final Companion Companion = new Companion(null); @Nullable private final AnthropicCacheControl cache; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = (KSerializer)new LinkedHashMapSerializer((KSerializer)StringSerializer.INSTANCE, (KSerializer)JsonElementSerializer.INSTANCE); arrayOfKSerializer[3] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolContent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolContent;", "core-llm"}) public static final class Companion { @NotNull public final KSerializer<AnthropicToolContent> serializer() { return (KSerializer<AnthropicToolContent>)AnthropicToolContent.$serializer.INSTANCE; }
/*    */      private Companion() {} }
/*    */   public AnthropicToolContent(@Nullable String toolId, @Nullable String toolName, @Nullable Map<String, JsonElement> toolInput, @Nullable AnthropicCacheControl cache) {
/* 57 */     this.toolId = toolId;
/*    */ 
/*    */     
/* 60 */     this.toolName = toolName;
/*    */ 
/*    */     
/* 63 */     this.toolInput = toolInput;
/*    */ 
/*    */     
/* 66 */     this.cache = cache; } @Nullable public AnthropicCacheControl getCache() { return this.cache; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final String getToolId() {
/*    */     return this.toolId;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getToolName() {
/*    */     return this.toolName;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Map<String, JsonElement> getToolInput() {
/*    */     return this.toolInput;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component1() {
/*    */     return this.toolId;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component2() {
/*    */     return this.toolName;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Map<String, JsonElement> component3() {
/*    */     return this.toolInput;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final AnthropicCacheControl component4() {
/*    */     return this.cache;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AnthropicToolContent copy(@Nullable String toolId, @Nullable String toolName, @Nullable Map<String, ? extends JsonElement> toolInput, @Nullable AnthropicCacheControl cache) {
/*    */     return new AnthropicToolContent(toolId, toolName, toolInput, cache);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AnthropicToolContent(toolId=" + this.toolId + ", toolName=" + this.toolName + ", toolInput=" + this.toolInput + ", cache=" + this.cache + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = (this.toolId == null) ? 0 : this.toolId.hashCode();
/*    */     result = result * 31 + ((this.toolName == null) ? 0 : this.toolName.hashCode());
/*    */     result = result * 31 + ((this.toolInput == null) ? 0 : this.toolInput.hashCode());
/*    */     return result * 31 + ((this.cache == null) ? 0 : this.cache.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AnthropicToolContent))
/*    */       return false; 
/*    */     AnthropicToolContent anthropicToolContent = (AnthropicToolContent)other;
/*    */     return !Intrinsics.areEqual(this.toolId, anthropicToolContent.toolId) ? false : (!Intrinsics.areEqual(this.toolName, anthropicToolContent.toolName) ? false : (!Intrinsics.areEqual(this.toolInput, anthropicToolContent.toolInput) ? false : (!!Intrinsics.areEqual(this.cache, anthropicToolContent.cache))));
/*    */   }
/*    */   
/*    */   public AnthropicToolContent() {
/*    */     this((String)null, (String)null, (Map)null, (AnthropicCacheControl)null, 15, (DefaultConstructorMarker)null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicToolContent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */