package com.intellij.ml.llm.matterhorn.ej.core.actions;

import com.intellij.ml.llm.matterhorn.ej.core.AgentSessionHistory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AgentUtils.kt", l = {311}, i = {0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3"}, n = {"file", "blocks", "separator", "agentSessionHistory"}, m = "printScreen", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.AgentUtilsKt")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AgentUtilsKt$printScreen$3 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  int label;
  
  AgentUtilsKt$printScreen$3(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AgentUtilsKt.printScreen((Project)null, (VirtualFile)null, (List<PrintBlock>)null, (String)null, (AgentSessionHistory)null, (Continuation<? super String>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\AgentUtilsKt$printScreen$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */