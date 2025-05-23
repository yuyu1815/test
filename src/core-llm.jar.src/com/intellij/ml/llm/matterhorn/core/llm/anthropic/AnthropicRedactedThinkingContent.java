/*    */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
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
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @SerialName("redacted_thinking")
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 &2\0020\001:\002%&B\033\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005¢\006\004\b\006\020\007B/\b\020\022\006\020\b\032\0020\t\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\b\020\n\032\004\030\0010\013¢\006\004\b\006\020\fJ\t\020\024\032\0020\003HÆ\003J\013\020\025\032\004\030\0010\005HÆ\003J\037\020\026\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\005HÆ\001J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\032HÖ\003J\t\020\033\032\0020\tHÖ\001J\t\020\034\032\0020\003HÖ\001J%\020\035\032\0020\0362\006\020\037\032\0020\0002\006\020 \032\0020!2\006\020\"\032\0020#H\001¢\006\002\b$R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\r\020\016\032\004\b\017\020\020R\036\020\004\032\004\030\0010\0058\026X\004¢\006\016\n\000\022\004\b\021\020\016\032\004\b\022\020\023¨\006'"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicRedactedThinkingContent;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicContent;", "data", "", "cache", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getData$annotations", "()V", "getData", "()Ljava/lang/String;", "getCache$annotations", "getCache", "()Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ public final class AnthropicRedactedThinkingContent
/*    */   implements AnthropicContent
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String data;
/*    */   @Nullable
/*    */   private final AnthropicCacheControl cache;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicRedactedThinkingContent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicRedactedThinkingContent;", "core-llm"})
/*    */   public static final class Companion
/*    */   {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<AnthropicRedactedThinkingContent> serializer() {
/* 83 */       return (KSerializer<AnthropicRedactedThinkingContent>)AnthropicRedactedThinkingContent.$serializer.INSTANCE;
/*    */     } }
/*    */   
/* 86 */   public AnthropicRedactedThinkingContent(@NotNull String data, @Nullable AnthropicCacheControl cache) { this.data = data;
/*    */ 
/*    */     
/* 89 */     this.cache = cache; } @Nullable public AnthropicCacheControl getCache() { return this.cache; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getData() {
/*    */     return this.data;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.data;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final AnthropicCacheControl component2() {
/*    */     return this.cache;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AnthropicRedactedThinkingContent copy(@NotNull String data, @Nullable AnthropicCacheControl cache) {
/*    */     Intrinsics.checkNotNullParameter(data, "data");
/*    */     return new AnthropicRedactedThinkingContent(data, cache);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AnthropicRedactedThinkingContent(data=" + this.data + ", cache=" + this.cache + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.data.hashCode();
/*    */     return result * 31 + ((this.cache == null) ? 0 : this.cache.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AnthropicRedactedThinkingContent))
/*    */       return false; 
/*    */     AnthropicRedactedThinkingContent anthropicRedactedThinkingContent = (AnthropicRedactedThinkingContent)other;
/*    */     return !Intrinsics.areEqual(this.data, anthropicRedactedThinkingContent.data) ? false : (!!Intrinsics.areEqual(this.cache, anthropicRedactedThinkingContent.cache));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicRedactedThinkingContent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */