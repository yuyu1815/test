package com.intellij.ml.llm.matterhorn.ej.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AbstractIssueSingleStepAgentWorker.kt", l = {448, 486, 487, 495, 497, 501, 502, 502, 506, 504, 531, 529, 542, 540, 551}, i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "L$14", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0", "L$0"}, n = {"this", "currentState", "tools", "observationsProcessed", "executionAgentContext", "propertyProvider", "additionalMessages", "error", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "context", "attempt", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "context", "chat", "attempt", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "context", "actionProvider", "actionString", "parsedAction", "attempt", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "context", "actionProvider", "actionString", "parsedAction", "attempt", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "context", "actionProvider", "actionString", "parsedAction", "attempt", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "context", "actionProvider", "actionString", "parsedAction", "actionRequest", "attempt", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "context", "actionProvider", "actionString", "parsedAction", "actionRequest", "attempt", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "context", "actionProvider", "actionString", "parsedAction", "actionRequest", "critiqueResponse", "attempt", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "context", "actionProvider", "actionString", "parsedAction", "actionRequest", "attempt", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "context", "actionString", "e", "errorMsg", "parsedActionTitle", "attempt", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "context", "e", "errorMsg", "attempt", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "e", "errorMsg", "attempt", "this", "currentState", "tools", "executionAgentContext", "propertyProvider", "additionalMessages", "params", "prevTasksMessages", "observationsWithoutPrevTasks", "e", "attempt", "error"}, m = "produceActionRequestWithReflection", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueSingleStepAgentWorker")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AbstractIssueSingleStepAgentWorker$produceActionRequestWithReflection$1 extends ContinuationImpl {
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
  
  int I$0;
  
  int I$1;
  
  int label;
  
  AbstractIssueSingleStepAgentWorker$produceActionRequestWithReflection$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AbstractIssueSingleStepAgentWorker.access$produceActionRequestWithReflection(AbstractIssueSingleStepAgentWorker.this, null, null, null, null, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AbstractIssueSingleStepAgentWorker$produceActionRequestWithReflection$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */