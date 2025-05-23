/*    */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.LongSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\002\b\006\n\002\020\b\n\000\n\002\030\002\n\002\b\024\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 /2\0020\001:\002./B/\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\n\b\002\020\005\032\004\030\0010\003\022\n\b\002\020\006\032\004\030\0010\003¢\006\004\b\007\020\bB?\b\020\022\006\020\t\032\0020\n\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\b\020\005\032\004\030\0010\003\022\b\020\006\032\004\030\0010\003\022\b\020\013\032\004\030\0010\f¢\006\004\b\007\020\rJ\t\020\032\032\0020\003HÆ\003J\t\020\033\032\0020\003HÆ\003J\020\020\034\032\004\030\0010\003HÆ\003¢\006\002\020\026J\020\020\035\032\004\030\0010\003HÆ\003¢\006\002\020\026J:\020\036\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\n\b\002\020\005\032\004\030\0010\0032\n\b\002\020\006\032\004\030\0010\003HÆ\001¢\006\002\020\037J\023\020 \032\0020!2\b\020\"\032\004\030\0010\001HÖ\003J\t\020#\032\0020\nHÖ\001J\t\020$\032\0020%HÖ\001J%\020&\032\0020'2\006\020(\032\0020\0002\006\020)\032\0020*2\006\020+\032\0020,H\001¢\006\002\b-R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\016\020\017\032\004\b\020\020\021R\034\020\004\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\022\020\017\032\004\b\023\020\021R \020\005\032\004\030\0010\0038\006X\004¢\006\020\n\002\020\027\022\004\b\024\020\017\032\004\b\025\020\026R \020\006\032\004\030\0010\0038\006X\004¢\006\020\n\002\020\027\022\004\b\030\020\017\032\004\b\031\020\026¨\0060"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicResponseUsage;", "", "promptTokens", "", "completionTokens", "cacheReadInputTokens", "cacheCreationInputTokens", "<init>", "(JJLjava/lang/Long;Ljava/lang/Long;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJJLjava/lang/Long;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPromptTokens$annotations", "()V", "getPromptTokens", "()J", "getCompletionTokens$annotations", "getCompletionTokens", "getCacheReadInputTokens$annotations", "getCacheReadInputTokens", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCacheCreationInputTokens$annotations", "getCacheCreationInputTokens", "component1", "component2", "component3", "component4", "copy", "(JJLjava/lang/Long;Ljava/lang/Long;)Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicResponseUsage;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*    */ public final class AnthropicResponseUsage {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final long promptTokens;
/*    */   private final long completionTokens;
/*    */   @Nullable
/*    */   private final Long cacheReadInputTokens;
/*    */   @Nullable
/*    */   private final Long cacheCreationInputTokens;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicResponseUsage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicResponseUsage;", "core-llm"})
/*    */   public static final class Companion { @NotNull
/*    */     public final KSerializer<AnthropicResponseUsage> serializer() {
/* 34 */       return (KSerializer<AnthropicResponseUsage>)AnthropicResponseUsage.$serializer.INSTANCE;
/*    */     } private Companion() {} } public AnthropicResponseUsage(long promptTokens, long completionTokens, @Nullable Long cacheReadInputTokens, @Nullable Long cacheCreationInputTokens) {
/* 36 */     this.promptTokens = promptTokens;
/*    */ 
/*    */     
/* 39 */     this.completionTokens = completionTokens;
/*    */ 
/*    */     
/* 42 */     this.cacheReadInputTokens = cacheReadInputTokens;
/*    */ 
/*    */     
/* 45 */     this.cacheCreationInputTokens = cacheCreationInputTokens; } public final long getPromptTokens() { return this.promptTokens; } @Nullable public final Long getCacheCreationInputTokens() { return this.cacheCreationInputTokens; }
/*    */ 
/*    */   
/*    */   public final long getCompletionTokens() {
/*    */     return this.completionTokens;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Long getCacheReadInputTokens() {
/*    */     return this.cacheReadInputTokens;
/*    */   }
/*    */   
/*    */   public final long component1() {
/*    */     return this.promptTokens;
/*    */   }
/*    */   
/*    */   public final long component2() {
/*    */     return this.completionTokens;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Long component3() {
/*    */     return this.cacheReadInputTokens;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Long component4() {
/*    */     return this.cacheCreationInputTokens;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AnthropicResponseUsage copy(long promptTokens, long completionTokens, @Nullable Long cacheReadInputTokens, @Nullable Long cacheCreationInputTokens) {
/*    */     return new AnthropicResponseUsage(promptTokens, completionTokens, cacheReadInputTokens, cacheCreationInputTokens);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AnthropicResponseUsage(promptTokens=" + this.promptTokens + ", completionTokens=" + this.completionTokens + ", cacheReadInputTokens=" + this.cacheReadInputTokens + ", cacheCreationInputTokens=" + this.cacheCreationInputTokens + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Long.hashCode(this.promptTokens);
/*    */     result = result * 31 + Long.hashCode(this.completionTokens);
/*    */     result = result * 31 + ((this.cacheReadInputTokens == null) ? 0 : this.cacheReadInputTokens.hashCode());
/*    */     return result * 31 + ((this.cacheCreationInputTokens == null) ? 0 : this.cacheCreationInputTokens.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AnthropicResponseUsage))
/*    */       return false; 
/*    */     AnthropicResponseUsage anthropicResponseUsage = (AnthropicResponseUsage)other;
/*    */     return (this.promptTokens != anthropicResponseUsage.promptTokens) ? false : ((this.completionTokens != anthropicResponseUsage.completionTokens) ? false : (!Intrinsics.areEqual(this.cacheReadInputTokens, anthropicResponseUsage.cacheReadInputTokens) ? false : (!!Intrinsics.areEqual(this.cacheCreationInputTokens, anthropicResponseUsage.cacheCreationInputTokens))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicResponseUsage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */