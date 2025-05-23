package ai.grazie.utils.http;

import ai.grazie.model.cloud.exceptions.HttpExceptionBase;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "utils.kt", l = {99}, i = {0}, s = {"L$0"}, n = {"response"}, m = "of", c = "ai.grazie.utils.http.UtilsKt")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class UtilsKt$of$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  UtilsKt$of$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return UtilsKt.of(null, null, (Continuation<? super HttpExceptionBase>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\UtilsKt$of$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */