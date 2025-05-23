/*     */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactId;
/*     */ import com.intellij.ml.llm.matterhorn.Artifactual;
/*     */ import com.intellij.util.containers.MultiMap;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020%\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\005\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003R!\020\004\032\022\022\b\022\006\022\002\b\0030\006\022\004\022\0020\0070\005¢\006\b\n\000\032\004\b\b\020\tR!\020\n\032\022\022\b\022\006\022\002\b\0030\006\022\004\022\0020\f0\013¢\006\b\n\000\032\004\b\r\020\016R!\020\017\032\022\022\b\022\006\022\002\b\0030\006\022\004\022\0020\0070\013¢\006\b\n\000\032\004\b\020\020\016¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowPanel$ArtifactIndex;", "", "<init>", "()V", "idToArtifact", "", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "getIdToArtifact", "()Ljava/util/Map;", "idToNodes", "Lcom/intellij/util/containers/MultiMap;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/ArtifactNode;", "getIdToNodes", "()Lcom/intellij/util/containers/MultiMap;", "idToDependents", "getIdToDependents", "ej-ui"})
/*     */ final class ArtifactIndex
/*     */ {
/*     */   @NotNull
/* 171 */   private final Map<ArtifactId<?>, Artifactual> idToArtifact = new LinkedHashMap<>(); @NotNull public final Map<ArtifactId<?>, Artifactual> getIdToArtifact() { return this.idToArtifact; } @NotNull
/* 172 */   private final MultiMap<ArtifactId<?>, ArtifactNode> idToNodes = new MultiMap(); @NotNull public final MultiMap<ArtifactId<?>, ArtifactNode> getIdToNodes() { return this.idToNodes; } @NotNull
/* 173 */   private final MultiMap<ArtifactId<?>, Artifactual> idToDependents = new MultiMap(); @NotNull public final MultiMap<ArtifactId<?>, Artifactual> getIdToDependents() { return this.idToDependents; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\MatterhornToolWindowPanel$ArtifactIndex.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */