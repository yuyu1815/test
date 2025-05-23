package com.intellij.ml.llm.matterhorn.activation.data.repos;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "JunieAipLicenseAgreementRepository.kt", l = {71, 72, 73}, i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, n = {"region", "docName", "document", "docName", "document", "regionUrlRepository", "docName", "document", "documentUrl"}, m = "localAgreement", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.JunieAipLicenseAgreementRepositoryImpl")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class JunieAipLicenseAgreementRepositoryImpl$localAgreement$2 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  JunieAipLicenseAgreementRepositoryImpl$localAgreement$2(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return JunieAipLicenseAgreementRepositoryImpl.access$localAgreement(JunieAipLicenseAgreementRepositoryImpl.this, null, null, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieAipLicenseAgreementRepositoryImpl$localAgreement$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */