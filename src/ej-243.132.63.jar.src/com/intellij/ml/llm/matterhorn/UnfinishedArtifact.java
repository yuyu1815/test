/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Serializable(with = UnfinishedArtifactSerializer.class)
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\r\n\002\030\002\n\002\b\004\b\007\030\000 \037*\004\b\000\020\001*\004\b\001\020\0022\0020\003:\001\037BI\022\022\020\004\032\016\022\004\022\0028\000\022\004\022\0028\0010\005\022\b\b\002\020\006\032\0020\007\022\b\b\002\020\b\032\0020\t\022\016\b\002\020\n\032\b\022\004\022\0020\f0\013\022\b\b\002\020\r\032\0020\016¢\006\004\b\017\020\020R\035\020\004\032\016\022\004\022\0028\000\022\004\022\0028\0010\005¢\006\b\n\000\032\004\b\021\020\022R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\023\020\024R\024\020\b\032\0020\tX\004¢\006\b\n\000\032\004\b\025\020\026R\032\020\n\032\b\022\004\022\0020\f0\013X\004¢\006\b\n\000\032\004\b\027\020\030R\024\020\r\032\0020\016X\004¢\006\b\n\000\032\004\b\031\020\032R\030\020\033\032\006\022\002\b\0030\0348VX\004¢\006\006\032\004\b\035\020\036¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/UnfinishedArtifact;", "I", "O", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "request", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;", "statistics", "Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;", "title", "", "dependencies", "", "Lcom/intellij/ml/llm/matterhorn/ArtifactDependency;", "reasoning", "Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning;)V", "getRequest", "()Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;", "getStatistics", "()Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;", "getTitle", "()Ljava/lang/String;", "getDependencies", "()Ljava/util/List;", "getReasoning", "()Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning;", "id", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "getId", "()Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "Companion", "core"})
/*     */ public final class UnfinishedArtifact<I, O>
/*     */   implements Artifactual
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final ArtifactRequest<I, O> request;
/*     */   @NotNull
/*     */   private final ArtifactStatistic statistics;
/*     */   @NotNull
/*     */   private final String title;
/*     */   @NotNull
/*     */   private final List<ArtifactDependency> dependencies;
/*     */   @NotNull
/*     */   private final ArtifactReasoning reasoning;
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J@\020\004\032\024\022\020\022\016\022\004\022\002H\007\022\004\022\002H\b0\0060\005\"\004\b\002\020\007\"\004\b\003\020\b2\f\020\t\032\b\022\004\022\002H\0070\0052\f\020\n\032\b\022\004\022\002H\b0\005¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/UnfinishedArtifact$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/UnfinishedArtifact;", "I", "O", "typeSerial0", "typeSerial1", "core"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final <I, O> KSerializer<UnfinishedArtifact<I, O>> serializer(@NotNull KSerializer<ArtifactRequest<I, O>> typeSerial0, @NotNull KSerializer<O> typeSerial1) {
/* 208 */       Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0"); Intrinsics.checkNotNullParameter(typeSerial1, "typeSerial1"); return new UnfinishedArtifactSerializer<>(typeSerial0, typeSerial1);
/*     */     } }
/* 210 */   public UnfinishedArtifact(@NotNull ArtifactRequest<I, O> request, @NotNull ArtifactStatistic statistics, @NotNull String title, @NotNull List<ArtifactDependency> dependencies, @NotNull ArtifactReasoning reasoning) { this.request = request;
/* 211 */     this.statistics = statistics;
/* 212 */     this.title = title;
/* 213 */     this.dependencies = dependencies;
/* 214 */     this.reasoning = reasoning; } @NotNull public final ArtifactRequest<I, O> getRequest() { return this.request; } @NotNull public ArtifactStatistic getStatistics() { return this.statistics; } @NotNull public ArtifactReasoning getReasoning() { return this.reasoning; }
/*     */   @NotNull public String getTitle() { return this.title; }
/* 216 */   @NotNull public List<ArtifactDependency> getDependencies() { return this.dependencies; } @NotNull public ArtifactId<?> getId() { return this.request.getArtifact(); }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\UnfinishedArtifact.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */