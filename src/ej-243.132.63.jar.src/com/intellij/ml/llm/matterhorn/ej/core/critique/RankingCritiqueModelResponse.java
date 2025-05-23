/*     */ package com.intellij.ml.llm.matterhorn.ej.core.critique;
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
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.ArrayListSerializer;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\b\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B#\022\f\020\002\032\b\022\004\022\0020\0040\003\022\f\020\005\032\b\022\004\022\0020\0060\003¢\006\004\b\007\020\bB;\b\020\022\006\020\t\032\0020\n\022\016\020\002\032\n\022\004\022\0020\004\030\0010\003\022\016\020\005\032\n\022\004\022\0020\006\030\0010\003\022\b\020\013\032\004\030\0010\f¢\006\004\b\007\020\rJ\017\020\021\032\b\022\004\022\0020\0040\003HÆ\003J\017\020\022\032\b\022\004\022\0020\0060\003HÆ\003J)\020\023\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\0032\016\b\002\020\005\032\b\022\004\022\0020\0060\003HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\001HÖ\003J\t\020\027\032\0020\nHÖ\001J\t\020\030\032\0020\031HÖ\001J%\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 H\001¢\006\002\b!R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\016\020\017R\027\020\005\032\b\022\004\022\0020\0060\003¢\006\b\n\000\032\004\b\020\020\017¨\006$"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritiqueModelResponse;", "", "scores", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritiqueScore;", "ranks", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritiqueRank;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getScores", "()Ljava/util/List;", "getRanks", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*     */ public final class RankingCritiqueModelResponse
/*     */ {
/*     */   @NotNull
/*     */   private final List<RankingCritiqueScore> scores;
/*     */   @NotNull
/*     */   private final List<RankingCritiqueRank> ranks;
/*     */   @NotNull
/* 163 */   public static final Companion Companion = new Companion(null); @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)RankingCritiqueScore.$serializer.INSTANCE); arrayOfKSerializer[1] = (KSerializer)new ArrayListSerializer((KSerializer)RankingCritiqueRank.$serializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritiqueModelResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/RankingCritiqueModelResponse;", "ej-core"}) public static final class Companion { @NotNull public final KSerializer<RankingCritiqueModelResponse> serializer() { return (KSerializer<RankingCritiqueModelResponse>)RankingCritiqueModelResponse.$serializer.INSTANCE; }
/*     */      private Companion() {} }
/*     */   public RankingCritiqueModelResponse(@NotNull List<RankingCritiqueScore> scores, @NotNull List<RankingCritiqueRank> ranks) {
/* 166 */     this.scores = scores;
/* 167 */     this.ranks = ranks; } @NotNull public final List<RankingCritiqueRank> getRanks() { return this.ranks; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final List<RankingCritiqueScore> getScores() {
/*     */     return this.scores;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<RankingCritiqueScore> component1() {
/*     */     return this.scores;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<RankingCritiqueRank> component2() {
/*     */     return this.ranks;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final RankingCritiqueModelResponse copy(@NotNull List<RankingCritiqueScore> scores, @NotNull List<RankingCritiqueRank> ranks) {
/*     */     Intrinsics.checkNotNullParameter(scores, "scores");
/*     */     Intrinsics.checkNotNullParameter(ranks, "ranks");
/*     */     return new RankingCritiqueModelResponse(scores, ranks);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "RankingCritiqueModelResponse(scores=" + this.scores + ", ranks=" + this.ranks + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.scores.hashCode();
/*     */     return result * 31 + this.ranks.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof RankingCritiqueModelResponse))
/*     */       return false; 
/*     */     RankingCritiqueModelResponse rankingCritiqueModelResponse = (RankingCritiqueModelResponse)other;
/*     */     return !Intrinsics.areEqual(this.scores, rankingCritiqueModelResponse.scores) ? false : (!!Intrinsics.areEqual(this.ranks, rankingCritiqueModelResponse.ranks));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\critique\RankingCritiqueModelResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */