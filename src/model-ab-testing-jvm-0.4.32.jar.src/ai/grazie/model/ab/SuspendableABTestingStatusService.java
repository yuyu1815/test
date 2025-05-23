package ai.grazie.model.ab;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J\020\020\002\032\004\030\0010\003H¦@¢\006\002\020\004ø\001\000\002\006\n\004\b!0\001¨\006\005À\006\001"}, d2 = {"Lai/grazie/model/ab/SuspendableABTestingStatusService;", "", "status", "Lai/grazie/model/ab/ABTestingStatus;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-ab-testing"})
public interface SuspendableABTestingStatusService {
  @Nullable
  Object status(@NotNull Continuation<? super ABTestingStatus> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-ab-testing-jvm-0.4.32.jar!\ai\grazie\model\ab\SuspendableABTestingStatusService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */