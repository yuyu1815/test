package com.intellij.ml.llm.matterhorn.core.llm.openai;

import io.ktor.client.statement.HttpResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "OpenAiImageRequest.kt", l = {21}, i = {}, s = {}, n = {}, m = "send", c = "com.intellij.ml.llm.matterhorn.core.llm.openai.OpenAiImageRequest")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class OpenAiImageRequest$send$1 extends ContinuationImpl {
  int label;
  
  OpenAiImageRequest$send$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return OpenAiImageRequest.this.send(null, null, null, (Continuation<? super HttpResponse>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\openai\OpenAiImageRequest$send$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */