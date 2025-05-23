package ai.grazie.model.bdg.estimator;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\000\n\002\b\004\bg\030\000*\004\b\000\020\001*\016\b\001\020\002*\b\022\004\022\002H\0020\0032\0020\004J\025\020\005\032\0028\0012\006\020\006\032\0028\000H&¢\006\002\020\007ø\001\000\002\006\n\004\b!0\001¨\006\bÀ\006\001"}, d2 = {"Lai/grazie/model/bdg/estimator/BudgetEstimator;", "Input", "T", "Lai/grazie/utils/mpp/money/Money;", "", "estimate", "input", "(Ljava/lang/Object;)Lai/grazie/utils/mpp/money/Money;", "model-bdg"})
public interface BudgetEstimator<Input, T extends ai.grazie.utils.mpp.money.Money<T>> {
  @NotNull
  T estimate(Input paramInput);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-bdg-jvm-0.4.32.jar!\ai\grazie\model\bdg\estimator\BudgetEstimator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */