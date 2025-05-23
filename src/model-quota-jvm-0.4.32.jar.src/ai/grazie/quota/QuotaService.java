package ai.grazie.quota;

import ai.grazie.quota.spend.SpendData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\bf\030\0002\0020\001J\030\020\002\032\004\030\0010\0032\006\020\004\032\0020\005H¦@¢\006\002\020\006J\016\020\007\032\0020\bH¦@¢\006\002\020\tø\001\000\002\006\n\004\b!0\001¨\006\nÀ\006\001"}, d2 = {"Lai/grazie/quota/QuotaService;", "", "spend", "Lai/grazie/quota/QuotaSpent;", "data", "Lai/grazie/quota/spend/SpendData;", "(Lai/grazie/quota/spend/SpendData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifySpendAllowance", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-quota"})
public interface QuotaService {
  @Nullable
  Object spend(@NotNull SpendData paramSpendData, @NotNull Continuation<? super QuotaSpent> paramContinuation);
  
  @Nullable
  Object verifySpendAllowance(@NotNull Continuation<? super Unit> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-quota-jvm-0.4.32.jar!\ai\grazie\quota\QuotaService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */