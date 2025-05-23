/*     */ package com.intellij.ml.llm.matterhorn.core.llm.openai;
/*     */ 
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SerialName;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.UnknownFieldException;
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
/*     */ @Serializable
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\013\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 $2\0020\001:\002#$B\033\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003¢\006\004\b\005\020\006B+\b\020\022\006\020\007\032\0020\b\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\b\020\t\032\004\030\0010\n¢\006\004\b\005\020\013J\t\020\022\032\0020\003HÆ\003J\t\020\023\032\0020\003HÆ\003J\035\020\024\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003HÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\001HÖ\003J\t\020\030\032\0020\bHÖ\001J\t\020\031\032\0020\032HÖ\001J%\020\033\032\0020\0342\006\020\035\032\0020\0002\006\020\036\032\0020\0372\006\020 \032\0020!H\001¢\006\002\b\"R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\f\020\r\032\004\b\016\020\017R\034\020\004\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\020\020\r\032\004\b\021\020\017¨\006%"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/PromptTokensDetails;", "", "audioTokens", "", "cachedTokens", "<init>", "(JJ)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAudioTokens$annotations", "()V", "getAudioTokens", "()J", "getCachedTokens$annotations", "getCachedTokens", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*     */ public final class PromptTokensDetails
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final long audioTokens;
/*     */   private final long cachedTokens;
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/PromptTokensDetails$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/PromptTokensDetails;", "core-llm"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<PromptTokensDetails> serializer() {
/* 113 */       return (KSerializer<PromptTokensDetails>)PromptTokensDetails.$serializer.INSTANCE;
/*     */     } }
/* 115 */   public PromptTokensDetails(long audioTokens, long cachedTokens) { this.audioTokens = audioTokens;
/*     */ 
/*     */     
/* 118 */     this.cachedTokens = cachedTokens; } public final long getCachedTokens() { return this.cachedTokens; }
/*     */ 
/*     */   
/*     */   public final long getAudioTokens() {
/*     */     return this.audioTokens;
/*     */   }
/*     */   
/*     */   public final long component1() {
/*     */     return this.audioTokens;
/*     */   }
/*     */   
/*     */   public final long component2() {
/*     */     return this.cachedTokens;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PromptTokensDetails copy(long audioTokens, long cachedTokens) {
/*     */     return new PromptTokensDetails(audioTokens, cachedTokens);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "PromptTokensDetails(audioTokens=" + this.audioTokens + ", cachedTokens=" + this.cachedTokens + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = Long.hashCode(this.audioTokens);
/*     */     return result * 31 + Long.hashCode(this.cachedTokens);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof PromptTokensDetails))
/*     */       return false; 
/*     */     PromptTokensDetails promptTokensDetails = (PromptTokensDetails)other;
/*     */     return (this.audioTokens != promptTokensDetails.audioTokens) ? false : (!(this.cachedTokens != promptTokensDetails.cachedTokens));
/*     */   }
/*     */   
/*     */   public PromptTokensDetails() {
/*     */     this(0L, 0L, 3, (DefaultConstructorMarker)null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\openai\PromptTokensDetails.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */