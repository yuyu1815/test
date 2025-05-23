/*    */ package com.intellij.ml.llm.matterhorn.activation.state.model;
/*    */ import java.util.Set;
/*    */ import kotlinx.coroutines.flow.MutableStateFlow;
/*    */ 
/*    */ @Service
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\020\"\n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\003\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003J\016\020\f\032\0020\r2\006\020\016\032\0020\007J\016\020\017\032\0020\r2\006\020\016\032\0020\007R\032\020\004\032\016\022\n\022\b\022\004\022\0020\0070\0060\005X\004¢\006\002\n\000R\035\020\b\032\016\022\n\022\b\022\004\022\0020\0070\0060\t¢\006\b\n\000\032\004\b\n\020\013¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/AipLicenseChoiceService;", "", "<init>", "()V", "_quotaExceededLicenseIds", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "quotaExceededLicenseIds", "Lkotlinx/coroutines/flow/StateFlow;", "getQuotaExceededLicenseIds", "()Lkotlinx/coroutines/flow/StateFlow;", "addQuotaExceededLicenseId", "", "licenseId", "removeQuotaExceededLicenseId", "state.model"})
/*    */ public final class AipLicenseChoiceService {
/*    */   @NotNull
/*  9 */   private final MutableStateFlow<Set<String>> _quotaExceededLicenseIds = StateFlowKt.MutableStateFlow(SetsKt.emptySet()); @NotNull
/* 10 */   private final StateFlow<Set<String>> quotaExceededLicenseIds = (StateFlow<Set<String>>)this._quotaExceededLicenseIds; @NotNull public final StateFlow<Set<String>> getQuotaExceededLicenseIds() { return this.quotaExceededLicenseIds; }
/*    */   
/*    */   public final void addQuotaExceededLicenseId(@NotNull String licenseId) {
/* 13 */     Intrinsics.checkNotNullParameter(licenseId, "licenseId"); MutableStateFlow<Set<String>> mutableStateFlow = this._quotaExceededLicenseIds; mutableStateFlow.setValue(SetsKt.plus((Set)mutableStateFlow.getValue(), licenseId));
/*    */   }
/*    */   
/*    */   public final void removeQuotaExceededLicenseId(@NotNull String licenseId) {
/* 17 */     Intrinsics.checkNotNullParameter(licenseId, "licenseId"); MutableStateFlow<Set<String>> mutableStateFlow = this._quotaExceededLicenseIds; mutableStateFlow.setValue(SetsKt.minus((Set)mutableStateFlow.getValue(), licenseId));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\AipLicenseChoiceService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */