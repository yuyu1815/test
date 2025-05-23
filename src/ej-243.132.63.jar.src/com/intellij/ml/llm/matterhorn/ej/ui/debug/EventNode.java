package com.intellij.ml.llm.matterhorn.ej.ui.debug;

import androidx.compose.runtime.internal.StabilityInferred;
import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001B\t\b\004¢\006\004\b\002\020\003R\024\020\004\032\004\030\0010\005X¦\004¢\006\006\032\004\b\006\020\007R\022\020\b\032\0020\tX¦\004¢\006\006\032\004\b\n\020\013\001\003\f\r\016¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;", "", "<init>", "()V", "groupId", "", "getGroupId", "()Ljava/lang/String;", "event", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "getEvent", "()Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/GroupEndNode;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/GroupStartNode;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/SimpleEventNode;", "ej-ui"})
@StabilityInferred(parameters = 1)
public abstract class EventNode {
  public static final int $stable;
  
  private EventNode() {}
  
  @Nullable
  public abstract String getGroupId();
  
  @NotNull
  public abstract CustomArtifactEvent getEvent();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\debug\EventNode.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */