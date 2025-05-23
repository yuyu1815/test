package com.intellij.ml.llm.matterhorn.core.llm;

import com.intellij.ml.llm.matterhorn.llm.AIAnswer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AICaches.kt", l = {116, 130, 131}, i = {0, 0, 0, 0, 1, 1, 1, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, n = {"this", "builder", "hash", "commands", "this", "hash", "commands", "hash", "commands", "response"}, m = "lookupOrBuild", c = "com.intellij.ml.llm.matterhorn.core.llm.RedisAICaches")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class RedisAICaches$lookupOrBuild$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  int label;
  
  RedisAICaches$lookupOrBuild$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return RedisAICaches.this.lookupOrBuild(null, null, null, (Continuation<? super AIAnswer>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\RedisAICaches$lookupOrBuild$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */