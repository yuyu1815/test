package com.intellij.ml.llm.matterhorn.ej.core.edit_workers;

import com.intellij.ml.llm.matterhorn.ArtifactResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AbstractEditWorker.kt", l = {103, 104, 125, 126, 127, 131, 132, 173, 177, 178, 193, 196}, i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "I$0", "L$0", "L$1", "L$2", "L$3", "L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "I$0"}, n = {"$this", "input", "context", "executionAgentContext", "propertyProvider", "$this", "input", "context", "executionAgentContext", "agentParameters", "$this", "input", "context", "executionAgentContext", "agentParameters", "trajectoryElementAgent", "systemMessage", "issueDescriptionMessage", "demo", "userMessages", "$this", "input", "context", "executionAgentContext", "agentParameters", "trajectoryElementAgent", "systemMessage", "issueDescriptionMessage", "demo", "userMessages", "$this", "input", "context", "executionAgentContext", "agentParameters", "trajectoryElementAgent", "systemMessage", "issueDescriptionMessage", "demo", "userMessages", "$this", "input", "context", "executionAgentContext", "agentParameters", "trajectoryElementAgent", "systemMessage", "issueDescriptionMessage", "demo", "userMessages", "$this", "input", "context", "executionAgentContext", "agentParameters", "trajectoryElementAgent", "systemMessage", "issueDescriptionMessage", "demo", "userMessages", "$this", "input", "context", "executionAgentContext", "agentParameters", "trajectoryElementAgent", "systemMessage", "issueDescriptionMessage", "demo", "userMessages", "additionalMessages", "attempt", "context", "trajectoryElementAgent", "actionString", "actionRequest", "actionRequest", "$this", "input", "context", "executionAgentContext", "agentParameters", "trajectoryElementAgent", "systemMessage", "issueDescriptionMessage", "demo", "userMessages", "additionalMessages", "actionString", "attempt", "$this", "input", "context", "executionAgentContext", "agentParameters", "trajectoryElementAgent", "systemMessage", "issueDescriptionMessage", "demo", "userMessages", "additionalMessages", "attempt"}, m = "produceArtifact$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.edit_workers.AbstractEditWorker")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AbstractEditWorker$produceArtifact$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  Object L$6;
  
  Object L$7;
  
  Object L$8;
  
  Object L$9;
  
  Object L$10;
  
  Object L$11;
  
  int I$0;
  
  int I$1;
  
  int label;
  
  AbstractEditWorker$produceArtifact$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AbstractEditWorker.produceArtifact$suspendImpl(AbstractEditWorker.this, null, null, (Continuation<? super ArtifactResponse<EditAgentResponse>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\edit_workers\AbstractEditWorker$produceArtifact$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */