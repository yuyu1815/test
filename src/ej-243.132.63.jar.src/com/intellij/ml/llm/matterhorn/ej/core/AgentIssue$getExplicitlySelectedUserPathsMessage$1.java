package com.intellij.ml.llm.matterhorn.ej.core;

import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessage;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AgentIssue.kt", l = {64, 71, 75, 81, 90}, i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$5", "I$0"}, n = {"this", "context", "fileStructures", "nonExistentFiles", "fileName", "flagSmallFiles", "flagLargeFiles", "this", "context", "fileStructures", "nonExistentFiles", "fileName", "file", "flagSmallFiles", "flagLargeFiles", "this", "context", "fileStructures", "nonExistentFiles", "fileName", "file", "flagSmallFiles", "flagLargeFiles", "this", "context", "fileStructures", "nonExistentFiles", "fileName", "flagLargeFiles", "this", "context", "fileStructures", "nonExistentFiles", "fileName", "flagSmallFiles"}, m = "getExplicitlySelectedUserPathsMessage", c = "com.intellij.ml.llm.matterhorn.ej.core.AgentIssue")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AgentIssue$getExplicitlySelectedUserPathsMessage$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  Object L$6;
  
  int I$0;
  
  int I$1;
  
  int label;
  
  AgentIssue$getExplicitlySelectedUserPathsMessage$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AgentIssue.this.getExplicitlySelectedUserPathsMessage(null, (Continuation<? super MatterhornChatMessage>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AgentIssue$getExplicitlySelectedUserPathsMessage$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */