/*    */ package com.intellij.ml.llm.matterhorn.llm;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SealedClassSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.ArrayListSerializer;
/*    */ import kotlinx.serialization.internal.BooleanSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.LongSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\\\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\t\n\002\b\005\n\002\020\013\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\020\n\002\020\006\n\002\b\020\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 @2\0020\001:\002?@B[\022\006\020\002\032\0020\003\022\016\b\002\020\004\032\b\022\004\022\0020\0060\005\022\b\b\002\020\007\032\0020\b\022\b\b\002\020\t\032\0020\b\022\b\b\002\020\n\032\0020\b\022\b\b\002\020\013\032\0020\b\022\b\b\002\020\f\032\0020\b\022\b\b\002\020\r\032\0020\016¢\006\004\b\017\020\020Be\b\020\022\006\020\021\032\0020\022\022\b\020\002\032\004\030\0010\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\006\020\007\032\0020\b\022\006\020\t\032\0020\b\022\006\020\n\032\0020\b\022\006\020\013\032\0020\b\022\006\020\f\032\0020\b\022\006\020\r\032\0020\016\022\b\020\023\032\004\030\0010\024¢\006\004\b\017\020\025J\006\020(\032\0020\000J\t\020)\032\0020\003HÆ\003J\017\020*\032\b\022\004\022\0020\0060\005HÆ\003J\t\020+\032\0020\bHÆ\003J\t\020,\032\0020\bHÆ\003J\t\020-\032\0020\bHÆ\003J\t\020.\032\0020\bHÆ\003J\t\020/\032\0020\bHÆ\003J\t\0200\032\0020\016HÆ\003J_\0201\032\0020\0002\b\b\002\020\002\032\0020\0032\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\b2\b\b\002\020\n\032\0020\b2\b\b\002\020\013\032\0020\b2\b\b\002\020\f\032\0020\b2\b\b\002\020\r\032\0020\016HÆ\001J\023\0202\032\0020\0162\b\0203\032\004\030\0010\001HÖ\003J\t\0204\032\0020\022HÖ\001J\t\0205\032\00206HÖ\001J%\0207\032\002082\006\0209\032\0020\0002\006\020:\032\0020;2\006\020<\032\0020=H\001¢\006\002\b>R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\026\020\027R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\030\020\031R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\032\020\033R\021\020\t\032\0020\b¢\006\b\n\000\032\004\b\034\020\033R\021\020\n\032\0020\b¢\006\b\n\000\032\004\b\035\020\033R\021\020\013\032\0020\b¢\006\b\n\000\032\004\b\036\020\033R\032\020\f\032\0020\bX\016¢\006\016\n\000\032\004\b\037\020\033\"\004\b \020!R\021\020\r\032\0020\016¢\006\b\n\000\032\004\b\"\020#R\021\020$\032\0020%8F¢\006\006\032\004\b&\020'¨\006A"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "", "llm", "Lcom/intellij/ml/llm/matterhorn/llm/LLM;", "contentChoices", "", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice;", "inputTokens", "", "outputTokens", "cacheInputTokens", "cacheCreateInputTokens", "time", "cached", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/llm/LLM;Ljava/util/List;JJJJJZ)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/llm/LLM;Ljava/util/List;JJJJJZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getLlm", "()Lcom/intellij/ml/llm/matterhorn/llm/LLM;", "getContentChoices", "()Ljava/util/List;", "getInputTokens", "()J", "getOutputTokens", "getCacheInputTokens", "getCacheCreateInputTokens", "getTime", "setTime", "(J)V", "getCached", "()Z", "cost", "", "getCost", "()D", "asCached", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*    */ public final class AIAnswer
/*    */ {
/*    */   @NotNull
/* 44 */   public static final Companion Companion = new Companion(null); @NotNull private final LLM llm; @NotNull private final List<AIAnswerChoice> contentChoices; private final long inputTokens; private final long outputTokens; private final long cacheInputTokens; private final long cacheCreateInputTokens; private long time; private final boolean cached; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer1 = new KSerializer[8]; arrayOfKSerializer1[0] = null; KClass[] arrayOfKClass = new KClass[2]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(AIContentAnswerChoice.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(AIToolUseAnswerChoice.class); KSerializer[] arrayOfKSerializer2 = new KSerializer[2]; arrayOfKSerializer2[0] = (KSerializer)AIContentAnswerChoice.$serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)AIToolUseAnswerChoice.$serializer.INSTANCE; arrayOfKSerializer1[1] = (KSerializer)new ArrayListSerializer((KSerializer)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.llm.AIAnswerChoice", Reflection.getOrCreateKotlinClass(AIAnswerChoice.class), arrayOfKClass, arrayOfKSerializer2, new java.lang.annotation.Annotation[0])); arrayOfKSerializer1[2] = null; arrayOfKSerializer1[3] = null; arrayOfKSerializer1[4] = null; arrayOfKSerializer1[5] = null; arrayOfKSerializer1[6] = null; arrayOfKSerializer1[7] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer1; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<AIAnswer> serializer() { return (KSerializer<AIAnswer>)AIAnswer.$serializer.INSTANCE; }
/*    */      }
/* 46 */   public AIAnswer(@NotNull LLM llm, @NotNull List<AIAnswerChoice> contentChoices, long inputTokens, long outputTokens, long cacheInputTokens, long cacheCreateInputTokens, long time, boolean cached) { this.llm = llm;
/* 47 */     this.contentChoices = contentChoices;
/* 48 */     this.inputTokens = inputTokens;
/* 49 */     this.outputTokens = outputTokens;
/* 50 */     this.cacheInputTokens = cacheInputTokens;
/* 51 */     this.cacheCreateInputTokens = cacheCreateInputTokens;
/* 52 */     this.time = time;
/* 53 */     this.cached = cached; } @NotNull public final LLM getLlm() { return this.llm; } @NotNull public final List<AIAnswerChoice> getContentChoices() { return this.contentChoices; } public final long getInputTokens() { return this.inputTokens; } public final long getOutputTokens() { return this.outputTokens; } public final boolean getCached() { return this.cached; }
/*    */   public final long getCacheInputTokens() { return this.cacheInputTokens; }
/*    */   public final long getCacheCreateInputTokens() { return this.cacheCreateInputTokens; }
/* 56 */   public final long getTime() { return this.time; } public final void setTime(long <set-?>) { this.time = <set-?>; } public final double getCost() { double oneMillion = 1000000.0D;
/* 57 */     ModelCapabilities caps = this.llm.getCapabilities();
/* 58 */     return this.inputTokens / oneMillion * caps.getInputPrice() + 
/* 59 */       this.outputTokens / oneMillion * caps.getOutputPrice() + 
/* 60 */       this.cacheInputTokens / oneMillion * caps.getCacheInputPrice() + 
/* 61 */       this.cacheCreateInputTokens / oneMillion * caps.getCacheCreateInputPrice(); }
/*    */   
/*    */   @NotNull
/*    */   public final AIAnswer asCached() {
/* 65 */     return new AIAnswer(this.llm, this.contentChoices, this.inputTokens, this.outputTokens, this.cacheInputTokens, this.cacheCreateInputTokens, this.time, true);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LLM component1() {
/*    */     return this.llm;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<AIAnswerChoice> component2() {
/*    */     return this.contentChoices;
/*    */   }
/*    */   
/*    */   public final long component3() {
/*    */     return this.inputTokens;
/*    */   }
/*    */   
/*    */   public final long component4() {
/*    */     return this.outputTokens;
/*    */   }
/*    */   
/*    */   public final long component5() {
/*    */     return this.cacheInputTokens;
/*    */   }
/*    */   
/*    */   public final long component6() {
/*    */     return this.cacheCreateInputTokens;
/*    */   }
/*    */   
/*    */   public final long component7() {
/*    */     return this.time;
/*    */   }
/*    */   
/*    */   public final boolean component8() {
/*    */     return this.cached;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AIAnswer copy(@NotNull LLM llm, @NotNull List<? extends AIAnswerChoice> contentChoices, long inputTokens, long outputTokens, long cacheInputTokens, long cacheCreateInputTokens, long time, boolean cached) {
/*    */     Intrinsics.checkNotNullParameter(llm, "llm");
/*    */     Intrinsics.checkNotNullParameter(contentChoices, "contentChoices");
/*    */     return new AIAnswer(llm, contentChoices, inputTokens, outputTokens, cacheInputTokens, cacheCreateInputTokens, time, cached);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AIAnswer(llm=" + this.llm + ", contentChoices=" + this.contentChoices + ", inputTokens=" + this.inputTokens + ", outputTokens=" + this.outputTokens + ", cacheInputTokens=" + this.cacheInputTokens + ", cacheCreateInputTokens=" + this.cacheCreateInputTokens + ", time=" + this.time + ", cached=" + this.cached + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.llm.hashCode();
/*    */     result = result * 31 + this.contentChoices.hashCode();
/*    */     result = result * 31 + Long.hashCode(this.inputTokens);
/*    */     result = result * 31 + Long.hashCode(this.outputTokens);
/*    */     result = result * 31 + Long.hashCode(this.cacheInputTokens);
/*    */     result = result * 31 + Long.hashCode(this.cacheCreateInputTokens);
/*    */     result = result * 31 + Long.hashCode(this.time);
/*    */     return result * 31 + Boolean.hashCode(this.cached);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AIAnswer))
/*    */       return false; 
/*    */     AIAnswer aIAnswer = (AIAnswer)other;
/*    */     return !Intrinsics.areEqual(this.llm, aIAnswer.llm) ? false : (!Intrinsics.areEqual(this.contentChoices, aIAnswer.contentChoices) ? false : ((this.inputTokens != aIAnswer.inputTokens) ? false : ((this.outputTokens != aIAnswer.outputTokens) ? false : ((this.cacheInputTokens != aIAnswer.cacheInputTokens) ? false : ((this.cacheCreateInputTokens != aIAnswer.cacheCreateInputTokens) ? false : ((this.time != aIAnswer.time) ? false : (!(this.cached != aIAnswer.cached))))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\llm\AIAnswer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */