/*     */ package com.intellij.ml.llm.matterhorn.core.llm.openai;
/*     */ 
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
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
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.LongSerializer;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\030\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 52\0020\001:\00245B7\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\n\b\002\020\006\032\004\030\0010\007\022\n\b\002\020\b\032\004\030\0010\003¢\006\004\b\t\020\nBG\b\020\022\006\020\013\032\0020\f\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\003\022\b\020\r\032\004\030\0010\016¢\006\004\b\t\020\017J\t\020\037\032\0020\003HÆ\003J\t\020 \032\0020\003HÆ\003J\t\020!\032\0020\003HÆ\003J\013\020\"\032\004\030\0010\007HÆ\003J\020\020#\032\004\030\0010\003HÆ\003¢\006\002\020\035JD\020$\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0032\n\b\002\020\006\032\004\030\0010\0072\n\b\002\020\b\032\004\030\0010\003HÆ\001¢\006\002\020%J\023\020&\032\0020'2\b\020(\032\004\030\0010\001HÖ\003J\t\020)\032\0020\fHÖ\001J\t\020*\032\0020+HÖ\001J%\020,\032\0020-2\006\020.\032\0020\0002\006\020/\032\002002\006\0201\032\00202H\001¢\006\002\b3R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\020\020\021\032\004\b\022\020\023R\034\020\004\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\024\020\021\032\004\b\025\020\023R\034\020\005\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\026\020\021\032\004\b\027\020\023R\036\020\006\032\004\030\0010\0078\006X\004¢\006\016\n\000\022\004\b\030\020\021\032\004\b\031\020\032R \020\b\032\004\030\0010\0038\006X\004¢\006\020\n\002\020\036\022\004\b\033\020\021\032\004\b\034\020\035¨\0066"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseUsage;", "", "promptTokens", "", "completionTokens", "totalTokens", "promptTokensDetails", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/PromptTokensDetails;", "promptCacheHitTokens", "<init>", "(JJJLcom/intellij/ml/llm/matterhorn/core/llm/openai/PromptTokensDetails;Ljava/lang/Long;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJJJLcom/intellij/ml/llm/matterhorn/core/llm/openai/PromptTokensDetails;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPromptTokens$annotations", "()V", "getPromptTokens", "()J", "getCompletionTokens$annotations", "getCompletionTokens", "getTotalTokens$annotations", "getTotalTokens", "getPromptTokensDetails$annotations", "getPromptTokensDetails", "()Lcom/intellij/ml/llm/matterhorn/core/llm/openai/PromptTokensDetails;", "getPromptCacheHitTokens$annotations", "getPromptCacheHitTokens", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "copy", "(JJJLcom/intellij/ml/llm/matterhorn/core/llm/openai/PromptTokensDetails;Ljava/lang/Long;)Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseUsage;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*     */ public final class OpenAIResponseUsage
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final long promptTokens;
/*     */   private final long completionTokens;
/*     */   private final long totalTokens;
/*     */   @Nullable
/*     */   private final PromptTokensDetails promptTokensDetails;
/*     */   @Nullable
/*     */   private final Long promptCacheHitTokens;
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseUsage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseUsage;", "core-llm"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<OpenAIResponseUsage> serializer() {
/* 122 */       return (KSerializer<OpenAIResponseUsage>)OpenAIResponseUsage.$serializer.INSTANCE;
/*     */     } }
/* 124 */   public OpenAIResponseUsage(long promptTokens, long completionTokens, long totalTokens, @Nullable PromptTokensDetails promptTokensDetails, @Nullable Long promptCacheHitTokens) { this.promptTokens = promptTokens;
/*     */ 
/*     */     
/* 127 */     this.completionTokens = completionTokens;
/*     */ 
/*     */     
/* 130 */     this.totalTokens = totalTokens;
/*     */ 
/*     */ 
/*     */     
/* 134 */     this.promptTokensDetails = promptTokensDetails;
/*     */ 
/*     */ 
/*     */     
/* 138 */     this.promptCacheHitTokens = promptCacheHitTokens; } @Nullable public final Long getPromptCacheHitTokens() { return this.promptCacheHitTokens; }
/*     */ 
/*     */   
/*     */   public final long getPromptTokens() {
/*     */     return this.promptTokens;
/*     */   }
/*     */   
/*     */   public final long getCompletionTokens() {
/*     */     return this.completionTokens;
/*     */   }
/*     */   
/*     */   public final long getTotalTokens() {
/*     */     return this.totalTokens;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final PromptTokensDetails getPromptTokensDetails() {
/*     */     return this.promptTokensDetails;
/*     */   }
/*     */   
/*     */   public final long component1() {
/*     */     return this.promptTokens;
/*     */   }
/*     */   
/*     */   public final long component2() {
/*     */     return this.completionTokens;
/*     */   }
/*     */   
/*     */   public final long component3() {
/*     */     return this.totalTokens;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final PromptTokensDetails component4() {
/*     */     return this.promptTokensDetails;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Long component5() {
/*     */     return this.promptCacheHitTokens;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final OpenAIResponseUsage copy(long promptTokens, long completionTokens, long totalTokens, @Nullable PromptTokensDetails promptTokensDetails, @Nullable Long promptCacheHitTokens) {
/*     */     return new OpenAIResponseUsage(promptTokens, completionTokens, totalTokens, promptTokensDetails, promptCacheHitTokens);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "OpenAIResponseUsage(promptTokens=" + this.promptTokens + ", completionTokens=" + this.completionTokens + ", totalTokens=" + this.totalTokens + ", promptTokensDetails=" + this.promptTokensDetails + ", promptCacheHitTokens=" + this.promptCacheHitTokens + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = Long.hashCode(this.promptTokens);
/*     */     result = result * 31 + Long.hashCode(this.completionTokens);
/*     */     result = result * 31 + Long.hashCode(this.totalTokens);
/*     */     result = result * 31 + ((this.promptTokensDetails == null) ? 0 : this.promptTokensDetails.hashCode());
/*     */     return result * 31 + ((this.promptCacheHitTokens == null) ? 0 : this.promptCacheHitTokens.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof OpenAIResponseUsage))
/*     */       return false; 
/*     */     OpenAIResponseUsage openAIResponseUsage = (OpenAIResponseUsage)other;
/*     */     return (this.promptTokens != openAIResponseUsage.promptTokens) ? false : ((this.completionTokens != openAIResponseUsage.completionTokens) ? false : ((this.totalTokens != openAIResponseUsage.totalTokens) ? false : (!Intrinsics.areEqual(this.promptTokensDetails, openAIResponseUsage.promptTokensDetails) ? false : (!!Intrinsics.areEqual(this.promptCacheHitTokens, openAIResponseUsage.promptCacheHitTokens)))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\openai\OpenAIResponseUsage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */