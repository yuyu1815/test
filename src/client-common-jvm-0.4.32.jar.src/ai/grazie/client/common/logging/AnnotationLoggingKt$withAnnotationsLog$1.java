package ai.grazie.client.common.logging;

import ai.grazie.client.common.model.HTTPResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AnnotationLogging.kt", l = {12}, i = {0}, s = {"L$0"}, n = {"$this$withAnnotationsLog"}, m = "withAnnotationsLog", c = "ai.grazie.client.common.logging.AnnotationLoggingKt")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class AnnotationLoggingKt$withAnnotationsLog$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  AnnotationLoggingKt$withAnnotationsLog$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AnnotationLoggingKt.withAnnotationsLog(null, null, (Continuation<? super HTTPResponse>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\logging\AnnotationLoggingKt$withAnnotationsLog$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */