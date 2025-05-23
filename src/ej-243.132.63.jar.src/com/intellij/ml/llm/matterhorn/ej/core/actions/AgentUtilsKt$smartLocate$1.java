package com.intellij.ml.llm.matterhorn.ej.core.actions;

import com.intellij.ml.llm.matterhorn.ej.core.Result;
import com.intellij.openapi.vfs.VirtualFile;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AgentUtils.kt", l = {234, 237}, i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0"}, n = {"path", "context", "target", "fileName", "searchType", "searchEverywhere", "allowOnlyProjectFile", "path", "context", "target", "fileName", "allowOnlyProjectFile"}, m = "smartLocate", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.AgentUtilsKt")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AgentUtilsKt$smartLocate$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  boolean Z$0;
  
  int label;
  
  AgentUtilsKt$smartLocate$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AgentUtilsKt.smartLocate(null, null, null, false, (Continuation<? super Result<? extends VirtualFile, ? extends OpenFileErrorType>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\AgentUtilsKt$smartLocate$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */