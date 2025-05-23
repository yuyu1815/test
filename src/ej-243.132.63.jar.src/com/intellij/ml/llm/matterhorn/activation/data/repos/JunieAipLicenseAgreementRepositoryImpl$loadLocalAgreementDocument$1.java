package com.intellij.ml.llm.matterhorn.activation.data.repos;

import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicenseAgreement;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "JunieAipLicenseAgreementRepository.kt", l = {40, 44}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"this", "region", "docName"}, m = "loadLocalAgreementDocument", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.JunieAipLicenseAgreementRepositoryImpl")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class JunieAipLicenseAgreementRepositoryImpl$loadLocalAgreementDocument$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  JunieAipLicenseAgreementRepositoryImpl$loadLocalAgreementDocument$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return JunieAipLicenseAgreementRepositoryImpl.this.loadLocalAgreementDocument((Continuation<? super AipLicenseAgreement>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieAipLicenseAgreementRepositoryImpl$loadLocalAgreementDocument$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */