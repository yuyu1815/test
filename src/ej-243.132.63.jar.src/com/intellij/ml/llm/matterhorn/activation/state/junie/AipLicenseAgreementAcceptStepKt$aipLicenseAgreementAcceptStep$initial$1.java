package com.intellij.ml.llm.matterhorn.activation.state.junie;

import com.intellij.ml.llm.matterhorn.activation.state.model.Outcome;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "aipLicenseAgreementAcceptStep.kt", l = {40, 41}, i = {0, 1}, s = {"L$0", "L$0"}, n = {"$agreement", "$agreement"}, m = "aipLicenseAgreementAcceptStep$initial", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.AipLicenseAgreementAcceptStepKt")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$initial$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$initial$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return (AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$initial(null, (Continuation)this) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$initial(null, (Continuation)this) : Outcome.box-impl(AipLicenseAgreementAcceptStepKt.access$aipLicenseAgreementAcceptStep$initial(null, (Continuation)this));
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\AipLicenseAgreementAcceptStepKt$aipLicenseAgreementAcceptStep$initial$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */