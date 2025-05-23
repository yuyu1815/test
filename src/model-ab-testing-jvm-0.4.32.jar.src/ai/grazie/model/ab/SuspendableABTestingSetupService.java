package ai.grazie.model.ab;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\030\002\n\002\b\003\bf\030\0002\0020\001J\024\020\002\032\b\022\004\022\0020\0040\003H¦@¢\006\002\020\005J\020\020\006\032\004\030\0010\004H¦@¢\006\002\020\005ø\001\000\002\006\n\004\b!0\001¨\006\007À\006\001"}, d2 = {"Lai/grazie/model/ab/SuspendableABTestingSetupService;", "", "all", "", "Lai/grazie/model/ab/ABTestingSetup;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currentSetup", "model-ab-testing"})
public interface SuspendableABTestingSetupService {
  @Nullable
  Object currentSetup(@NotNull Continuation<? super ABTestingSetup> paramContinuation);
  
  @Nullable
  Object all(@NotNull Continuation<? super List<ABTestingSetup>> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-ab-testing-jvm-0.4.32.jar!\ai\grazie\model\ab\SuspendableABTestingSetupService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */