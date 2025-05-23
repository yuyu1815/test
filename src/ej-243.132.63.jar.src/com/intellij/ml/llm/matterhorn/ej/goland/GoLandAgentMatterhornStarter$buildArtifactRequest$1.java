package com.intellij.ml.llm.matterhorn.ej.goland;

import com.intellij.ml.llm.matterhorn.ArtifactRequest;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "GoLandAgentMatterhornStarter.kt", l = {37, 52, 57, 62}, i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4"}, n = {"$this", "name", "task", "args", "context", "project", "i", "$this", "name", "task", "args", "context", "project", "i", "$this", "name", "task", "args", "context"}, m = "buildArtifactRequest$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.goland.GoLandAgentMatterhornStarter")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class GoLandAgentMatterhornStarter$buildArtifactRequest$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  int I$0;
  
  int label;
  
  GoLandAgentMatterhornStarter$buildArtifactRequest$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return GoLandAgentMatterhornStarter.buildArtifactRequest$suspendImpl(GoLandAgentMatterhornStarter.this, null, null, null, null, (Continuation<? super ArtifactRequest<?, ?>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\goland\GoLandAgentMatterhornStarter$buildArtifactRequest$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */