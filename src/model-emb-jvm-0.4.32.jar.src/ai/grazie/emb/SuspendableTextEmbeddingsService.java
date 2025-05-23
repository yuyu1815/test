package ai.grazie.emb;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\002\n\002\020 \n\002\b\003\bf\030\000*\b\b\000\020\001*\0020\0022\0020\003J\"\020\004\032\0028\0002\006\020\005\032\0020\0062\n\b\002\020\007\032\004\030\0010\006H@¢\006\002\020\bJ.\020\004\032\b\022\004\022\0028\0000\t2\f\020\n\032\b\022\004\022\0020\0060\t2\n\b\002\020\007\032\004\030\0010\006H¦@¢\006\002\020\013ø\001\000\002\006\n\004\b!0\001¨\006\fÀ\006\001"}, d2 = {"Lai/grazie/emb/SuspendableTextEmbeddingsService;", "T", "Lai/grazie/emb/TextEmbedding;", "", "embed", "text", "", "model", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "texts", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-emb"})
public interface SuspendableTextEmbeddingsService<T extends TextEmbedding> {
  @Nullable
  default Object embed(@NotNull String text, @Nullable String model, @NotNull Continuation<? super TextEmbedding> $completion) {
    return embed$suspendImpl(this, text, model, $completion);
  }
  
  @Nullable
  Object embed(@NotNull List<String> paramList, @Nullable String paramString, @NotNull Continuation<? super List<? extends T>> paramContinuation);
  
  @DebugMetadata(f = "SuspendableTextEmbeddingsService.kt", l = {7}, i = {}, s = {}, n = {}, m = "embed$suspendImpl", c = "ai.grazie.emb.SuspendableTextEmbeddingsService")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableTextEmbeddingsService$embed$1<T extends TextEmbedding> extends ContinuationImpl {
    int label;
    
    SuspendableTextEmbeddingsService$embed$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableTextEmbeddingsService.embed$suspendImpl(SuspendableTextEmbeddingsService.this, null, null, (Continuation<? super T>)this);
    }
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-emb-jvm-0.4.32.jar!\ai\grazie\emb\SuspendableTextEmbeddingsService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */