package ai.grazie.utils.http.stream;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "StreamReaderUtil.kt", l = {27, 43, 46}, i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, n = {"$this$readStream", "request", "streamReader", "$this$readStream", "request", "streamReader", "$this$readStream", "request", "streamReader"}, m = "readStream", c = "ai.grazie.utils.http.stream.StreamReaderUtilKt")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class StreamReaderUtilKt$readStream$1<T> extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  StreamReaderUtilKt$readStream$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return StreamReaderUtilKt.readStream(null, null, null, (Continuation<? super Unit>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\stream\StreamReaderUtilKt$readStream$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */