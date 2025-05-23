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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Serializable(with = ArtifactSerializer.class)
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\023\b\007\030\000  *\004\b\000\020\0012\0020\002:\001 BM\022\f\020\003\032\b\022\004\022\0028\0000\004\022\b\b\002\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\b\022\f\020\n\032\b\022\004\022\0020\f0\013\022\006\020\r\032\0020\016\022\006\020\017\032\0028\000¢\006\004\b\020\020\021R\032\020\003\032\b\022\004\022\0028\0000\004X\004¢\006\b\n\000\032\004\b\022\020\023R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\024\020\025R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\026\020\027R\021\020\t\032\0020\b¢\006\b\n\000\032\004\b\030\020\027R\032\020\n\032\b\022\004\022\0020\f0\013X\004¢\006\b\n\000\032\004\b\031\020\032R\024\020\r\032\0020\016X\004¢\006\b\n\000\032\004\b\033\020\034R\023\020\017\032\0028\000¢\006\n\n\002\020\037\032\004\b\035\020\036¨\006!"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/Artifact;", "O", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "id", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "statistics", "Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;", "title", "", "description", "dependencies", "", "Lcom/intellij/ml/llm/matterhorn/ArtifactDependency;", "reasoning", "Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning;", "content", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning;Ljava/lang/Object;)V", "getId", "()Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "getStatistics", "()Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;", "getTitle", "()Ljava/lang/String;", "getDescription", "getDependencies", "()Ljava/util/List;", "getReasoning", "()Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning;", "getContent", "()Ljava/lang/Object;", "Ljava/lang/Object;", "Companion", "core"})
/*     */ public final class Artifact<O>
/*     */   implements Artifactual
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final ArtifactId<O> id;
/*     */   @NotNull
/*     */   private final ArtifactStatistic statistics;
/*     */   @NotNull
/*     */   private final String title;
/*     */   @NotNull
/*     */   private final String description;
/*     */   @NotNull
/*     */   private final List<ArtifactDependency> dependencies;
/*     */   @NotNull
/*     */   private final ArtifactReasoning reasoning;
/*     */   private final O content;
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J&\020\004\032\016\022\n\022\b\022\004\022\002H\0070\0060\005\"\004\b\001\020\0072\f\020\b\032\b\022\004\022\002H\0070\005¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/Artifact$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/Artifact;", "O", "typeSerial0", "core"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final <O> KSerializer<Artifact<O>> serializer(@NotNull KSerializer<O> typeSerial0) {
/* 234 */       Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0"); return new ArtifactSerializer<>(typeSerial0);
/*     */     } }
/* 236 */   public Artifact(@NotNull ArtifactId<O> id, @NotNull ArtifactStatistic statistics, @NotNull String title, @NotNull String description, @NotNull List<ArtifactDependency> dependencies, @NotNull ArtifactReasoning reasoning, Object content) { this.id = id;
/* 237 */     this.statistics = statistics;
/* 238 */     this.title = title;
/* 239 */     this.description = description;
/* 240 */     this.dependencies = dependencies;
/* 241 */     this.reasoning = reasoning;
/* 242 */     this.content = (O)content; } public final O getContent() { return this.content; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public ArtifactId<O> getId() {
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
/*     */   public final String getDescription() {
/*     */     return this.description;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public List<ArtifactDependency> getDependencies() {
/*     */     return this.dependencies;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public ArtifactReasoning getReasoning() {
/*     */     return this.reasoning;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\Artifact.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */