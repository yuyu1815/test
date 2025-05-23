/*     */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*     */ 
/*     */ import java.util.List;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @SerialName("tool_result")
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020 \n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\026\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 22\0020\001:\00212B9\022\n\b\002\020\002\032\004\030\0010\003\022\f\020\004\032\b\022\004\022\0020\0010\005\022\n\b\002\020\006\032\004\030\0010\007\022\n\b\002\020\b\032\004\030\0010\t¢\006\004\b\n\020\013BI\b\020\022\006\020\f\032\0020\r\022\b\020\002\032\004\030\0010\003\022\016\020\004\032\n\022\004\022\0020\001\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\016\032\004\030\0010\017¢\006\004\b\n\020\020J\013\020\036\032\004\030\0010\003HÆ\003J\017\020\037\032\b\022\004\022\0020\0010\005HÆ\003J\020\020 \032\004\030\0010\007HÆ\003¢\006\002\020\031J\013\020!\032\004\030\0010\tHÆ\003JB\020\"\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\016\b\002\020\004\032\b\022\004\022\0020\0010\0052\n\b\002\020\006\032\004\030\0010\0072\n\b\002\020\b\032\004\030\0010\tHÆ\001¢\006\002\020#J\023\020$\032\0020\0072\b\020%\032\004\030\0010&HÖ\003J\t\020'\032\0020\rHÖ\001J\t\020(\032\0020\003HÖ\001J%\020)\032\0020*2\006\020+\032\0020\0002\006\020,\032\0020-2\006\020.\032\0020/H\001¢\006\002\b0R\036\020\002\032\004\030\0010\0038\006X\004¢\006\016\n\000\022\004\b\021\020\022\032\004\b\023\020\024R\"\020\004\032\b\022\004\022\0020\0010\0058\006X\004¢\006\016\n\000\022\004\b\025\020\022\032\004\b\026\020\027R \020\006\032\004\030\0010\0078\006X\004¢\006\020\n\002\020\032\022\004\b\030\020\022\032\004\b\006\020\031R\036\020\b\032\004\030\0010\t8\026X\004¢\006\016\n\000\022\004\b\033\020\022\032\004\b\034\020\035¨\0063"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolResultContent;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicContent;", "toolId", "", "content", "", "isError", "", "cache", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getToolId$annotations", "()V", "getToolId", "()Ljava/lang/String;", "getContent$annotations", "getContent", "()Ljava/util/List;", "isError$annotations", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCache$annotations", "getCache", "()Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;)Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolResultContent;", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*     */ public final class AnthropicToolResultContent
/*     */   implements AnthropicContent
/*     */ {
/*     */   @Nullable
/*     */   private final String toolId;
/*     */   @NotNull
/*     */   private final List<AnthropicContent> content;
/*     */   @Nullable
/*     */   private final Boolean isError;
/*     */   @NotNull
/* 111 */   public static final Companion Companion = new Companion(null); @Nullable private final AnthropicCacheControl cache; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = (KSerializer)new AnthropicToolContentSerializer(); arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolResultContent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicToolResultContent;", "core-llm"}) public static final class Companion { @NotNull public final KSerializer<AnthropicToolResultContent> serializer() { return (KSerializer<AnthropicToolResultContent>)AnthropicToolResultContent.$serializer.INSTANCE; }
/*     */      private Companion() {} }
/*     */   public AnthropicToolResultContent(@Nullable String toolId, @NotNull List<AnthropicContent> content, @Nullable Boolean isError, @Nullable AnthropicCacheControl cache) {
/* 114 */     this.toolId = toolId;
/*     */ 
/*     */     
/* 117 */     this.content = content;
/*     */ 
/*     */ 
/*     */     
/* 121 */     this.isError = isError;
/*     */ 
/*     */     
/* 124 */     this.cache = cache; } @Nullable public AnthropicCacheControl getCache() { return this.cache; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final String getToolId() {
/*     */     return this.toolId;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<AnthropicContent> getContent() {
/*     */     return this.content;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Boolean isError() {
/*     */     return this.isError;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component1() {
/*     */     return this.toolId;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<AnthropicContent> component2() {
/*     */     return this.content;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Boolean component3() {
/*     */     return this.isError;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final AnthropicCacheControl component4() {
/*     */     return this.cache;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final AnthropicToolResultContent copy(@Nullable String toolId, @NotNull List<? extends AnthropicContent> content, @Nullable Boolean isError, @Nullable AnthropicCacheControl cache) {
/*     */     Intrinsics.checkNotNullParameter(content, "content");
/*     */     return new AnthropicToolResultContent(toolId, content, isError, cache);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "AnthropicToolResultContent(toolId=" + this.toolId + ", content=" + this.content + ", isError=" + this.isError + ", cache=" + this.cache + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = (this.toolId == null) ? 0 : this.toolId.hashCode();
/*     */     result = result * 31 + this.content.hashCode();
/*     */     result = result * 31 + ((this.isError == null) ? 0 : this.isError.hashCode());
/*     */     return result * 31 + ((this.cache == null) ? 0 : this.cache.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof AnthropicToolResultContent))
/*     */       return false; 
/*     */     AnthropicToolResultContent anthropicToolResultContent = (AnthropicToolResultContent)other;
/*     */     return !Intrinsics.areEqual(this.toolId, anthropicToolResultContent.toolId) ? false : (!Intrinsics.areEqual(this.content, anthropicToolResultContent.content) ? false : (!Intrinsics.areEqual(this.isError, anthropicToolResultContent.isError) ? false : (!!Intrinsics.areEqual(this.cache, anthropicToolResultContent.cache))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicToolResultContent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */