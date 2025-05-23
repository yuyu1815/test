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
/*    */ @Serializable
/*    */ @SerialName("thinking")
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\017\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 *2\0020\001:\002)*B#\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\n\b\002\020\005\032\004\030\0010\006¢\006\004\b\007\020\bB9\b\020\022\006\020\t\032\0020\n\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\b\020\005\032\004\030\0010\006\022\b\020\013\032\004\030\0010\f¢\006\004\b\007\020\rJ\t\020\027\032\0020\003HÆ\003J\t\020\030\032\0020\003HÆ\003J\013\020\031\032\004\030\0010\006HÆ\003J)\020\032\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\n\b\002\020\005\032\004\030\0010\006HÆ\001J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\036HÖ\003J\t\020\037\032\0020\nHÖ\001J\t\020 \032\0020\003HÖ\001J%\020!\032\0020\"2\006\020#\032\0020\0002\006\020$\032\0020%2\006\020&\032\0020'H\001¢\006\002\b(R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\016\020\017\032\004\b\020\020\021R\034\020\004\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\022\020\017\032\004\b\023\020\021R\036\020\005\032\004\030\0010\0068\026X\004¢\006\016\n\000\022\004\b\024\020\017\032\004\b\025\020\026¨\006+"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicThinkingContent;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicContent;", "thinking", "", "signature", "cache", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getThinking$annotations", "()V", "getThinking", "()Ljava/lang/String;", "getSignature$annotations", "getSignature", "getCache$annotations", "getCache", "()Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicCacheControl;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ public final class AnthropicThinkingContent
/*    */   implements AnthropicContent
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String thinking;
/*    */   @NotNull
/*    */   private final String signature;
/*    */   @Nullable
/*    */   private final AnthropicCacheControl cache;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicThinkingContent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicThinkingContent;", "core-llm"})
/*    */   public static final class Companion
/*    */   {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<AnthropicThinkingContent> serializer() {
/* 70 */       return (KSerializer<AnthropicThinkingContent>)AnthropicThinkingContent.$serializer.INSTANCE;
/*    */     } }
/*    */   
/* 73 */   public AnthropicThinkingContent(@NotNull String thinking, @NotNull String signature, @Nullable AnthropicCacheControl cache) { this.thinking = thinking;
/*    */ 
/*    */     
/* 76 */     this.signature = signature;
/*    */ 
/*    */     
/* 79 */     this.cache = cache; } @Nullable public AnthropicCacheControl getCache() { return this.cache; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getThinking() {
/*    */     return this.thinking;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getSignature() {
/*    */     return this.signature;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.thinking;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.signature;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final AnthropicCacheControl component3() {
/*    */     return this.cache;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AnthropicThinkingContent copy(@NotNull String thinking, @NotNull String signature, @Nullable AnthropicCacheControl cache) {
/*    */     Intrinsics.checkNotNullParameter(thinking, "thinking");
/*    */     Intrinsics.checkNotNullParameter(signature, "signature");
/*    */     return new AnthropicThinkingContent(thinking, signature, cache);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AnthropicThinkingContent(thinking=" + this.thinking + ", signature=" + this.signature + ", cache=" + this.cache + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.thinking.hashCode();
/*    */     result = result * 31 + this.signature.hashCode();
/*    */     return result * 31 + ((this.cache == null) ? 0 : this.cache.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AnthropicThinkingContent))
/*    */       return false; 
/*    */     AnthropicThinkingContent anthropicThinkingContent = (AnthropicThinkingContent)other;
/*    */     return !Intrinsics.areEqual(this.thinking, anthropicThinkingContent.thinking) ? false : (!Intrinsics.areEqual(this.signature, anthropicThinkingContent.signature) ? false : (!!Intrinsics.areEqual(this.cache, anthropicThinkingContent.cache)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicThinkingContent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */