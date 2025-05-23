package com.intellij.ml.llm.matterhorn.requests.builder;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "GrazieRequestImpl.kt", l = {58}, i = {0}, s = {"L$0"}, n = {"toolResults"}, m = "buildUserMessage", c = "com.intellij.ml.llm.matterhorn.requests.builder.GrazieRequestImpl")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class GrazieRequestImpl$buildUserMessage$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  GrazieRequestImpl$buildUserMessage$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return GrazieRequestImpl.access$buildUserMessage(GrazieRequestImpl.this, null, null, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\builder\GrazieRequestImpl$buildUserMessage$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */