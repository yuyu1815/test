/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Serializable(with = CancelledArtifactSerializer.class)
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\016\b\007\030\000 \0312\0020\001:\001\031B?\022\n\020\002\032\006\022\002\b\0030\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007\022\016\b\002\020\b\032\b\022\004\022\0020\n0\t\022\006\020\013\032\0020\f¢\006\004\b\r\020\016R\030\020\002\032\006\022\002\b\0030\003X\004¢\006\b\n\000\032\004\b\017\020\020R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\021\020\022R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\023\020\024R\032\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\b\n\000\032\004\b\025\020\026R\024\020\013\032\0020\fX\004¢\006\b\n\000\032\004\b\027\020\030¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/CancelledArtifact;", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "id", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "statistics", "Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;", "title", "", "dependencies", "", "Lcom/intellij/ml/llm/matterhorn/ArtifactDependency;", "reasoning", "Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Cancelled;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Cancelled;)V", "getId", "()Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "getStatistics", "()Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;", "getTitle", "()Ljava/lang/String;", "getDependencies", "()Ljava/util/List;", "getReasoning", "()Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Cancelled;", "Companion", "core"})
/*     */ public final class CancelledArtifact
/*     */   implements Artifactual
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final ArtifactId<?> id;
/*     */   @NotNull
/*     */   private final ArtifactStatistic statistics;
/*     */   @NotNull
/*     */   private final String title;
/*     */   @NotNull
/*     */   private final List<ArtifactDependency> dependencies;
/*     */   @NotNull
/*     */   private final ArtifactReasoning.Cancelled reasoning;
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/CancelledArtifact$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/CancelledArtifact;", "core"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<CancelledArtifact> serializer() {
/* 227 */       return new CancelledArtifactSerializer();
/* 228 */     } } public CancelledArtifact(@NotNull ArtifactId<?> id, @NotNull ArtifactStatistic statistics, @NotNull String title, @NotNull List<ArtifactDependency> dependencies, @NotNull ArtifactReasoning.Cancelled reasoning) { this.id = id;
/* 229 */     this.statistics = statistics;
/* 230 */     this.title = title;
/* 231 */     this.dependencies = dependencies;
/* 232 */     this.reasoning = reasoning; } @NotNull public ArtifactReasoning.Cancelled getReasoning() { return this.reasoning; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public ArtifactId<?> getId() {
/*     */     return this.id;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public ArtifactStatistic getStatistics() {
/*     */     return this.statistics;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String getTitle() {
/*     */     return this.title;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public List<ArtifactDependency> getDependencies() {
/*     */     return this.dependencies;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\CancelledArtifact.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */