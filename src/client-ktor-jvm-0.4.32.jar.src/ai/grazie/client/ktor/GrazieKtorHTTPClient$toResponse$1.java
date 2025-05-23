package ai.grazie.client.ktor;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "GrazieKtorHTTPClient.kt", l = {217}, i = {}, s = {}, n = {}, m = "toResponse", c = "ai.grazie.client.ktor.GrazieKtorHTTPClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class GrazieKtorHTTPClient$toResponse$1 extends ContinuationImpl {
  Object L$0;
  
  int I$0;
  
  int label;
  
  GrazieKtorHTTPClient$toResponse$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return GrazieKtorHTTPClient.access$toResponse(GrazieKtorHTTPClient.this, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-ktor-jvm-0.4.32.jar!\ai\grazie\client\ktor\GrazieKtorHTTPClient$toResponse$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */