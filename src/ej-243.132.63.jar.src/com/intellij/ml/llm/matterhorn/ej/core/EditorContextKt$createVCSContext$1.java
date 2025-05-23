package com.intellij.ml.llm.matterhorn.ej.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "EditorContext.kt", l = {181}, i = {0, 0, 0, 0}, s = {"L$0", "L$1", "L$3", "L$5"}, n = {"changes", "mustIgnore", "$this$createVCSContext_u24lambda_u241", "change"}, m = "createVCSContext", c = "com.intellij.ml.llm.matterhorn.ej.core.EditorContextKt")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class EditorContextKt$createVCSContext$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  int label;
  
  EditorContextKt$createVCSContext$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return EditorContextKt.createVCSContext(null, null, (Continuation<? super String>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\EditorContextKt$createVCSContext$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */