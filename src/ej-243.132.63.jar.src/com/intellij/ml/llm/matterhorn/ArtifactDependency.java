/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Serializable(with = ArtifactDependencySerializer.class)
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\f\n\002\020\b\n\000\n\002\020\016\n\002\b\002\b\b\030\000 \0252\0020\001:\001\025B\033\022\n\020\002\032\006\022\002\b\0030\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\r\020\f\032\006\022\002\b\0030\003HÆ\003J\t\020\r\032\0020\005HÆ\003J!\020\016\032\0020\0002\f\b\002\020\002\032\006\022\002\b\0030\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0052\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\022HÖ\001J\t\020\023\032\0020\024HÖ\001R\025\020\002\032\006\022\002\b\0030\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactDependency;", "", "artifact", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "cached", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ArtifactId;Z)V", "getArtifact", "()Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "getCached", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "core"})
/*     */ public final class ArtifactDependency
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final ArtifactId<?> artifact;
/*     */   private final boolean cached;
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactDependency$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ArtifactDependency;", "core"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<ArtifactDependency> serializer() {
/* 162 */       return new ArtifactDependencySerializer();
/* 163 */     } } public ArtifactDependency(@NotNull ArtifactId<?> artifact, boolean cached) { this.artifact = artifact; this.cached = cached; } @NotNull public final ArtifactId<?> getArtifact() { return this.artifact; } public final boolean getCached() { return this.cached; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final ArtifactId<?> component1() {
/*     */     return this.artifact;
/*     */   }
/*     */   
/*     */   public final boolean component2() {
/*     */     return this.cached;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ArtifactDependency copy(@NotNull ArtifactId<?> artifact, boolean cached) {
/*     */     Intrinsics.checkNotNullParameter(artifact, "artifact");
/*     */     return new ArtifactDependency(artifact, cached);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "ArtifactDependency(artifact=" + this.artifact + ", cached=" + this.cached + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.artifact.hashCode();
/*     */     return result * 31 + Boolean.hashCode(this.cached);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ArtifactDependency))
/*     */       return false; 
/*     */     ArtifactDependency artifactDependency = (ArtifactDependency)other;
/*     */     return !Intrinsics.areEqual(this.artifact, artifactDependency.artifact) ? false : (!(this.cached != artifactDependency.cached));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ArtifactDependency.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */