package com.intellij.ml.llm.matterhorn.ej.core;

import com.intellij.ml.llm.matterhorn.ArtifactResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AbstractIssueSingleStepAgentWorker.kt", l = {233, 235, 236, 238, 238, 239, 246, 253, 256, 259, 276, 276, 295, 295, 296, 309, 319, 328, 336, 336, 353, 363, 363}, i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 20, 20, 20, 20, 20, 20, 21, 21, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$16", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$12", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, n = {"$this", "input", "context", "executionAgentContext", "propertyProvider", "$this", "input", "context", "executionAgentContext", "propertyProvider", "parameters", "$this", "input", "context", "executionAgentContext", "propertyProvider", "parameters", "tools", "$this", "input", "context", "executionAgentContext", "propertyProvider", "parameters", "tools", "systemMessage", "recommendedSteps", "$this", "input", "context", "executionAgentContext", "propertyProvider", "parameters", "tools", "systemMessage", "recommendedSteps", "$this", "input", "context", "executionAgentContext", "propertyProvider", "parameters", "tools", "systemMessage", "recommendedSteps", "demonstration", "$this", "input", "context", "executionAgentContext", "propertyProvider", "parameters", "tools", "systemMessage", "recommendedSteps", "demonstration", "issueDescription", "issueDescriptionImages", "$this", "input", "context", "executionAgentContext", "propertyProvider", "parameters", "tools", "systemMessage", "recommendedSteps", "demonstration", "issueDescription", "issueDescriptionImages", "relevantSymbolsResponse", "$this", "input", "context", "executionAgentContext", "propertyProvider", "parameters", "tools", "systemMessage", "recommendedSteps", "demonstration", "issueDescription", "issueDescriptionImages", "relevantSymbolsResponse", "projectStrResponse", "$this", "input", "context", "executionAgentContext", "propertyProvider", "parameters", "tools", "systemMessage", "recommendedSteps", "demonstration", "issueDescription", "issueDescriptionImages", "relevantSymbolsResponse", "projectStrResponse", "guidelines", "$this", "input", "context", "executionAgentContext", "propertyProvider", "parameters", "tools", "systemMessage", "recommendedSteps", "demonstration", "issueDescription", "issueDescriptionImages", "relevantSymbolsResponse", "projectStrResponse", "guidelines", "content", "$this", "input", "context", "executionAgentContext", "propertyProvider", "parameters", "tools", "systemMessage", "recommendedSteps", "demonstration", "issueDescription", "issueDescriptionImages", "relevantSymbolsResponse", "projectStrResponse", "guidelines", "$this", "context", "executionAgentContext", "propertyProvider", "parameters", "tools", "currentState", "$this", "context", "executionAgentContext", "propertyProvider", "parameters", "tools", "currentState", "$this", "context", "executionAgentContext", "propertyProvider", "parameters", "currentState", "observationsProcessed", "$this", "context", "executionAgentContext", "propertyProvider", "parameters", "currentState", "actionRequest", "llmResponse", "allObservations", "$this", "context", "executionAgentContext", "propertyProvider", "parameters", "currentState", "actionRequest", "llmResponse", "allObservations", "arguments", "actions", "editArtifactTypes", "$this", "context", "executionAgentContext", "propertyProvider", "parameters", "currentState", "actionRequest", "llmResponse", "allObservations", "arguments", "actions", "$this", "parameters", "actionRequest", "llmResponse", "actionResult", "$this", "parameters", "actionRequest", "llmResponse", "actionResult", "$this", "context", "propertyProvider", "parameters", "actionRequest", "llmResponse", "$this", "context", "parameters", "actionRequest", "llmResponse", "actionResult", "$this", "context", "parameters", "actionRequest", "llmResponse", "actionResult"}, m = "produceArtifact$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueSingleStepAgentWorker")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AbstractIssueSingleStepAgentWorker$produceArtifact$1 extends ContinuationImpl {
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
  
  Object L$12;
  
  Object L$13;
  
  Object L$14;
  
  Object L$15;
  
  Object L$16;
  
  Object L$17;
  
  int label;
  
  AbstractIssueSingleStepAgentWorker$produceArtifact$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AbstractIssueSingleStepAgentWorker.produceArtifact$suspendImpl(AbstractIssueSingleStepAgentWorker.this, null, null, (Continuation<? super ArtifactResponse<AgentResponse>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AbstractIssueSingleStepAgentWorker$produceArtifact$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */