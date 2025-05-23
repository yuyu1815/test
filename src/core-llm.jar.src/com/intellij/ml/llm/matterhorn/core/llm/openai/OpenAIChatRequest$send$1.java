package com.intellij.ml.llm.matterhorn.core.llm.openai;

import com.intellij.ml.llm.matterhorn.llm.AIAnswer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "OpenAIChatRequest.kt", l = {129, 130, 143, 149, 59}, i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3"}, n = {"$this", "accessToken", "$this$createRequest$iv", "propertyProvider$iv", "builder$iv", "logger$iv", "$this", "accessToken", "$this$createRequest$iv", "propertyProvider$iv", "builder$iv", "logger$iv", "url$iv", "$this", "$this$createRequest$iv", "propertyProvider$iv", "builder$iv", "logger$iv", "$this", "$this$createRequest$iv", "builder$iv", "token$iv"}, m = "send$suspendImpl", c = "com.intellij.ml.llm.matterhorn.core.llm.openai.OpenAIChatRequest")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class OpenAIChatRequest$send$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  Object L$6;
  
  int label;
  
  OpenAIChatRequest$send$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return OpenAIChatRequest.send$suspendImpl(OpenAIChatRequest.this, null, (Continuation<? super AIAnswer>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\openai\OpenAIChatRequest$send$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */