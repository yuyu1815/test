/*     */ package com.intellij.ml.llm.matterhorn.core.llm.openai;
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
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.ArrayListSerializer;
/*     */ import kotlinx.serialization.internal.DoubleSerializer;
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
/*     */ @Serializable
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\020\016\n\000\n\002\020\006\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\013\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 %2\0020\001:\002$%B#\022\f\020\002\032\b\022\004\022\0020\0040\003\022\f\020\005\032\b\022\004\022\0020\0060\003¢\006\004\b\007\020\bB;\b\020\022\006\020\t\032\0020\n\022\016\020\002\032\n\022\004\022\0020\004\030\0010\003\022\016\020\005\032\n\022\004\022\0020\006\030\0010\003\022\b\020\013\032\004\030\0010\f¢\006\004\b\007\020\rJ\017\020\024\032\b\022\004\022\0020\0040\003HÆ\003J\017\020\025\032\b\022\004\022\0020\0060\003HÆ\003J)\020\026\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\0032\016\b\002\020\005\032\b\022\004\022\0020\0060\003HÆ\001J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\001HÖ\003J\t\020\032\032\0020\nHÖ\001J\t\020\033\032\0020\004HÖ\001J%\020\034\032\0020\0352\006\020\036\032\0020\0002\006\020\037\032\0020 2\006\020!\032\0020\"H\001¢\006\002\b#R\"\020\002\032\b\022\004\022\0020\0040\0038\006X\004¢\006\016\n\000\022\004\b\016\020\017\032\004\b\020\020\021R\"\020\005\032\b\022\004\022\0020\0060\0038\006X\004¢\006\016\n\000\022\004\b\022\020\017\032\004\b\023\020\021¨\006&"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseLogprobs;", "", "tokens", "", "", "tokenLogprobs", "", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTokens$annotations", "()V", "getTokens", "()Ljava/util/List;", "getTokenLogprobs$annotations", "getTokenLogprobs", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core_llm", "$serializer", "Companion", "core-llm"})
/*     */ public final class OpenAIResponseLogprobs
/*     */ {
/*     */   @NotNull
/*     */   private final List<String> tokens;
/*     */   @NotNull
/*     */   private final List<Double> tokenLogprobs;
/*     */   @NotNull
/* 104 */   public static final Companion Companion = new Companion(null); @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[1] = (KSerializer)new ArrayListSerializer((KSerializer)DoubleSerializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseLogprobs$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/core/llm/openai/OpenAIResponseLogprobs;", "core-llm"}) public static final class Companion { @NotNull public final KSerializer<OpenAIResponseLogprobs> serializer() { return (KSerializer<OpenAIResponseLogprobs>)OpenAIResponseLogprobs.$serializer.INSTANCE; }
/*     */      private Companion() {} } public OpenAIResponseLogprobs(@NotNull List<String> tokens, @NotNull List<Double> tokenLogprobs) {
/* 106 */     this.tokens = tokens;
/*     */ 
/*     */     
/* 109 */     this.tokenLogprobs = tokenLogprobs; } @NotNull public final List<Double> getTokenLogprobs() { return this.tokenLogprobs; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final List<String> getTokens() {
/*     */     return this.tokens;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<String> component1() {
/*     */     return this.tokens;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<Double> component2() {
/*     */     return this.tokenLogprobs;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final OpenAIResponseLogprobs copy(@NotNull List<String> tokens, @NotNull List<Double> tokenLogprobs) {
/*     */     Intrinsics.checkNotNullParameter(tokens, "tokens");
/*     */     Intrinsics.checkNotNullParameter(tokenLogprobs, "tokenLogprobs");
/*     */     return new OpenAIResponseLogprobs(tokens, tokenLogprobs);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "OpenAIResponseLogprobs(tokens=" + this.tokens + ", tokenLogprobs=" + this.tokenLogprobs + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.tokens.hashCode();
/*     */     return result * 31 + this.tokenLogprobs.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof OpenAIResponseLogprobs))
/*     */       return false; 
/*     */     OpenAIResponseLogprobs openAIResponseLogprobs = (OpenAIResponseLogprobs)other;
/*     */     return !Intrinsics.areEqual(this.tokens, openAIResponseLogprobs.tokens) ? false : (!!Intrinsics.areEqual(this.tokenLogprobs, openAIResponseLogprobs.tokenLogprobs));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\openai\OpenAIResponseLogprobs.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */