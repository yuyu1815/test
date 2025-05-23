/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.DoubleSerializer;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.IntSerializer;
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
/*     */ @Serializable
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\002\b\004\n\002\020\b\n\002\b\006\n\002\020\006\n\002\b\006\n\002\030\002\n\002\b\"\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 G2\0020\001:\002FGBg\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\006\020\007\032\0020\b\022\006\020\t\032\0020\b\022\006\020\n\032\0020\003\022\006\020\013\032\0020\003\022\006\020\f\032\0020\003\022\006\020\r\032\0020\003\022\006\020\016\032\0020\017\022\006\020\020\032\0020\017¢\006\004\b\021\020\022B\t\b\026¢\006\004\b\021\020\023B{\b\020\022\006\020\024\032\0020\b\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\006\020\007\032\0020\b\022\006\020\t\032\0020\b\022\006\020\n\032\0020\003\022\006\020\013\032\0020\003\022\006\020\f\032\0020\003\022\006\020\r\032\0020\003\022\006\020\016\032\0020\017\022\006\020\020\032\0020\017\022\b\020\025\032\004\030\0010\026¢\006\004\b\021\020\027J\016\020)\032\0020\0002\006\020*\032\0020\003J\t\020+\032\0020\003HÆ\003J\t\020,\032\0020\003HÆ\003J\t\020-\032\0020\003HÆ\003J\t\020.\032\0020\003HÆ\003J\t\020/\032\0020\bHÆ\003J\t\0200\032\0020\bHÆ\003J\t\0201\032\0020\003HÆ\003J\t\0202\032\0020\003HÆ\003J\t\0203\032\0020\003HÆ\003J\t\0204\032\0020\003HÆ\003J\t\0205\032\0020\017HÆ\003J\t\0206\032\0020\017HÆ\003J\001\0207\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0032\b\b\002\020\006\032\0020\0032\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\b2\b\b\002\020\n\032\0020\0032\b\b\002\020\013\032\0020\0032\b\b\002\020\f\032\0020\0032\b\b\002\020\r\032\0020\0032\b\b\002\020\016\032\0020\0172\b\b\002\020\020\032\0020\017HÆ\001J\023\0208\032\002092\b\020:\032\004\030\0010\001HÖ\003J\t\020;\032\0020\bHÖ\001J\t\020<\032\0020=HÖ\001J%\020>\032\0020?2\006\020@\032\0020\0002\006\020A\032\0020B2\006\020C\032\0020DH\001¢\006\002\bER\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\030\020\031\"\004\b\032\020\033R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\034\020\031R\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\035\020\031R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\036\020\031R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\037\020 R\021\020\t\032\0020\b¢\006\b\n\000\032\004\b!\020 R\021\020\n\032\0020\003¢\006\b\n\000\032\004\b\"\020\031R\021\020\013\032\0020\003¢\006\b\n\000\032\004\b#\020\031R\021\020\f\032\0020\003¢\006\b\n\000\032\004\b$\020\031R\021\020\r\032\0020\003¢\006\b\n\000\032\004\b%\020\031R\021\020\016\032\0020\017¢\006\b\n\000\032\004\b&\020'R\021\020\020\032\0020\017¢\006\b\n\000\032\004\b(\020'¨\006H"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;", "", "totalArtifactBuildTimeSeconds", "", "artifactTime", "modelTime", "modelCachedTime", "requests", "", "cachedRequests", "inputTokens", "outputTokens", "cacheInputTokens", "cacheCreateInputTokens", "cost", "", "cachedCost", "<init>", "(JJJJIIJJJJDD)V", "()V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJJJJIIJJJJDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTotalArtifactBuildTimeSeconds", "()J", "setTotalArtifactBuildTimeSeconds", "(J)V", "getArtifactTime", "getModelTime", "getModelCachedTime", "getRequests", "()I", "getCachedRequests", "getInputTokens", "getOutputTokens", "getCacheInputTokens", "getCacheCreateInputTokens", "getCost", "()D", "getCachedCost", "withTotalTimeSpent", "totalTimeSeconds", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*     */ public final class ArtifactStatistic
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private long totalArtifactBuildTimeSeconds;
/*     */   private final long artifactTime;
/*     */   private final long modelTime;
/*     */   private final long modelCachedTime;
/*     */   private final int requests;
/*     */   private final int cachedRequests;
/*     */   private final long inputTokens;
/*     */   private final long outputTokens;
/*     */   private final long cacheInputTokens;
/*     */   private final long cacheCreateInputTokens;
/*     */   private final double cost;
/*     */   private final double cachedCost;
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;", "core"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<ArtifactStatistic> serializer() {
/*  83 */       return (KSerializer<ArtifactStatistic>)ArtifactStatistic.$serializer.INSTANCE;
/*     */     } }
/*  85 */   public ArtifactStatistic(long totalArtifactBuildTimeSeconds, long artifactTime, long modelTime, long modelCachedTime, int requests, int cachedRequests, long inputTokens, long outputTokens, long cacheInputTokens, long cacheCreateInputTokens, double cost, double cachedCost) { this.totalArtifactBuildTimeSeconds = totalArtifactBuildTimeSeconds;
/*  86 */     this.artifactTime = artifactTime;
/*  87 */     this.modelTime = modelTime;
/*  88 */     this.modelCachedTime = modelCachedTime;
/*  89 */     this.requests = requests;
/*  90 */     this.cachedRequests = cachedRequests;
/*  91 */     this.inputTokens = inputTokens;
/*  92 */     this.outputTokens = outputTokens;
/*  93 */     this.cacheInputTokens = cacheInputTokens;
/*  94 */     this.cacheCreateInputTokens = cacheCreateInputTokens;
/*  95 */     this.cost = cost;
/*  96 */     this.cachedCost = cachedCost; } public final long getTotalArtifactBuildTimeSeconds() { return this.totalArtifactBuildTimeSeconds; } public final void setTotalArtifactBuildTimeSeconds(long <set-?>) { this.totalArtifactBuildTimeSeconds = <set-?>; } public final long getArtifactTime() { return this.artifactTime; } public final long getModelTime() { return this.modelTime; } public final long getModelCachedTime() { return this.modelCachedTime; } public final int getRequests() { return this.requests; } public final double getCachedCost() { return this.cachedCost; }
/*     */   public final int getCachedRequests() { return this.cachedRequests; }
/*     */   public final long getInputTokens() { return this.inputTokens; }
/*  99 */   public final long getOutputTokens() { return this.outputTokens; } public final long getCacheInputTokens() { return this.cacheInputTokens; } public final long getCacheCreateInputTokens() { return this.cacheCreateInputTokens; } public final double getCost() { return this.cost; } @NotNull public final ArtifactStatistic withTotalTimeSpent(long totalTimeSeconds) { return copy$default(this, totalTimeSeconds, 0L, 0L, 0L, 0, 0, 0L, 0L, 0L, 0L, 0.0D, 0.0D, 4094, null); }
/*     */    public ArtifactStatistic() {
/* 101 */     this(
/* 102 */         0L, 
/* 103 */         0L, 
/* 104 */         0L, 
/* 105 */         0L, 
/* 106 */         0, 
/* 107 */         0, 
/* 108 */         0L, 
/* 109 */         0L, 
/* 110 */         0L, 
/* 111 */         0L, 
/* 112 */         0.0D, 
/* 113 */         0.0D);
/*     */   }
/*     */   
/*     */   public final long component1() {
/*     */     return this.totalArtifactBuildTimeSeconds;
/*     */   }
/*     */   
/*     */   public final long component2() {
/*     */     return this.artifactTime;
/*     */   }
/*     */   
/*     */   public final long component3() {
/*     */     return this.modelTime;
/*     */   }
/*     */   
/*     */   public final long component4() {
/*     */     return this.modelCachedTime;
/*     */   }
/*     */   
/*     */   public final int component5() {
/*     */     return this.requests;
/*     */   }
/*     */   
/*     */   public final int component6() {
/*     */     return this.cachedRequests;
/*     */   }
/*     */   
/*     */   public final long component7() {
/*     */     return this.inputTokens;
/*     */   }
/*     */   
/*     */   public final long component8() {
/*     */     return this.outputTokens;
/*     */   }
/*     */   
/*     */   public final long component9() {
/*     */     return this.cacheInputTokens;
/*     */   }
/*     */   
/*     */   public final long component10() {
/*     */     return this.cacheCreateInputTokens;
/*     */   }
/*     */   
/*     */   public final double component11() {
/*     */     return this.cost;
/*     */   }
/*     */   
/*     */   public final double component12() {
/*     */     return this.cachedCost;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ArtifactStatistic copy(long totalArtifactBuildTimeSeconds, long artifactTime, long modelTime, long modelCachedTime, int requests, int cachedRequests, long inputTokens, long outputTokens, long cacheInputTokens, long cacheCreateInputTokens, double cost, double cachedCost) {
/*     */     return new ArtifactStatistic(totalArtifactBuildTimeSeconds, artifactTime, modelTime, modelCachedTime, requests, cachedRequests, inputTokens, outputTokens, cacheInputTokens, cacheCreateInputTokens, cost, cachedCost);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "ArtifactStatistic(totalArtifactBuildTimeSeconds=" + this.totalArtifactBuildTimeSeconds + ", artifactTime=" + this.artifactTime + ", modelTime=" + this.modelTime + ", modelCachedTime=" + this.modelCachedTime + ", requests=" + this.requests + ", cachedRequests=" + this.cachedRequests + ", inputTokens=" + this.inputTokens + ", outputTokens=" + this.outputTokens + ", cacheInputTokens=" + this.cacheInputTokens + ", cacheCreateInputTokens=" + this.cacheCreateInputTokens + ", cost=" + this.cost + ", cachedCost=" + this.cachedCost + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = Long.hashCode(this.totalArtifactBuildTimeSeconds);
/*     */     result = result * 31 + Long.hashCode(this.artifactTime);
/*     */     result = result * 31 + Long.hashCode(this.modelTime);
/*     */     result = result * 31 + Long.hashCode(this.modelCachedTime);
/*     */     result = result * 31 + Integer.hashCode(this.requests);
/*     */     result = result * 31 + Integer.hashCode(this.cachedRequests);
/*     */     result = result * 31 + Long.hashCode(this.inputTokens);
/*     */     result = result * 31 + Long.hashCode(this.outputTokens);
/*     */     result = result * 31 + Long.hashCode(this.cacheInputTokens);
/*     */     result = result * 31 + Long.hashCode(this.cacheCreateInputTokens);
/*     */     result = result * 31 + Double.hashCode(this.cost);
/*     */     return result * 31 + Double.hashCode(this.cachedCost);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ArtifactStatistic))
/*     */       return false; 
/*     */     ArtifactStatistic artifactStatistic = (ArtifactStatistic)other;
/*     */     return (this.totalArtifactBuildTimeSeconds != artifactStatistic.totalArtifactBuildTimeSeconds) ? false : ((this.artifactTime != artifactStatistic.artifactTime) ? false : ((this.modelTime != artifactStatistic.modelTime) ? false : ((this.modelCachedTime != artifactStatistic.modelCachedTime) ? false : ((this.requests != artifactStatistic.requests) ? false : ((this.cachedRequests != artifactStatistic.cachedRequests) ? false : ((this.inputTokens != artifactStatistic.inputTokens) ? false : ((this.outputTokens != artifactStatistic.outputTokens) ? false : ((this.cacheInputTokens != artifactStatistic.cacheInputTokens) ? false : ((this.cacheCreateInputTokens != artifactStatistic.cacheCreateInputTokens) ? false : ((Double.compare(this.cost, artifactStatistic.cost) != 0) ? false : (!(Double.compare(this.cachedCost, artifactStatistic.cachedCost) != 0))))))))))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ArtifactStatistic.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */