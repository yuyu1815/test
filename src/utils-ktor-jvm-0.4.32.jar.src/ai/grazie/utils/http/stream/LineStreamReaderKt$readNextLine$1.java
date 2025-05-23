package ai.grazie.utils.http.stream;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "LineStreamReader.kt", l = {55}, i = {0}, s = {"L$0"}, n = {"$this$readNextLine"}, m = "readNextLine", c = "ai.grazie.utils.http.stream.LineStreamReaderKt")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class LineStreamReaderKt$readNextLine$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  LineStreamReaderKt$readNextLine$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return LineStreamReaderKt.access$readNextLine(null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\stream\LineStreamReaderKt$readNextLine$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */