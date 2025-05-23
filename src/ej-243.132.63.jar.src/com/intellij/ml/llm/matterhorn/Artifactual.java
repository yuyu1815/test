package com.intellij.ml.llm.matterhorn;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bv\030\0002\0020\001R\026\020\002\032\006\022\002\b\0030\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tR\022\020\n\032\0020\013X¦\004¢\006\006\032\004\b\f\020\rR\030\020\016\032\b\022\004\022\0020\0200\017X¦\004¢\006\006\032\004\b\021\020\022R\022\020\023\032\0020\024X¦\004¢\006\006\032\004\b\025\020\026\001\004\027\030\031\032¨\006\033"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/Artifactual;", "", "id", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "getId", "()Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "statistics", "Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;", "getStatistics", "()Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;", "title", "", "getTitle", "()Ljava/lang/String;", "dependencies", "", "Lcom/intellij/ml/llm/matterhorn/ArtifactDependency;", "getDependencies", "()Ljava/util/List;", "reasoning", "Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning;", "getReasoning", "()Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning;", "Lcom/intellij/ml/llm/matterhorn/Artifact;", "Lcom/intellij/ml/llm/matterhorn/CancelledArtifact;", "Lcom/intellij/ml/llm/matterhorn/FailedArtifact;", "Lcom/intellij/ml/llm/matterhorn/UnfinishedArtifact;", "core"})
public interface Artifactual {
  @NotNull
  ArtifactId<?> getId();
  
  @NotNull
  ArtifactStatistic getStatistics();
  
  @NotNull
  String getTitle();
  
  @NotNull
  List<ArtifactDependency> getDependencies();
  
  @NotNull
  ArtifactReasoning getReasoning();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\Artifactual.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */