package com.intellij.ml.llm.matterhorn.starter;

import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "MatterhornLogsProcessor.kt", l = {101}, i = {}, s = {}, n = {}, m = "packMatterhornLogs", c = "com.intellij.ml.llm.matterhorn.starter.CollectMatterhornCachesAction$Companion")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class CollectMatterhornCachesAction$Companion$packMatterhornLogs$1 extends ContinuationImpl {
  int label;
  
  CollectMatterhornCachesAction$Companion$packMatterhornLogs$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return CollectMatterhornCachesAction.Companion.this.packMatterhornLogs(null, null, (Continuation<? super Path>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\starter\CollectMatterhornCachesAction$Companion$packMatterhornLogs$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */