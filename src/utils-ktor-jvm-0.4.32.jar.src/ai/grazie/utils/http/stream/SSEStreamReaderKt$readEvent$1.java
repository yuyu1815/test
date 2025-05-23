package ai.grazie.utils.http.stream;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SSEStreamReader.kt", l = {88}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"$this$readEvent", "builder"}, m = "readEvent", c = "ai.grazie.utils.http.stream.SSEStreamReaderKt")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SSEStreamReaderKt$readEvent$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  SSEStreamReaderKt$readEvent$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SSEStreamReaderKt.access$readEvent(null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\stream\SSEStreamReaderKt$readEvent$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */