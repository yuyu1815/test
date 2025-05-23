/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicense;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AipLicenseRequestFailure;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AipLicenseResult;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.OpResult;
/*    */ import java.util.List;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020 \n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\bÁ\002\030\0002\032\022\004\022\0020\002\022\004\022\0020\003\022\n\022\b\022\004\022\0020\0050\0040\001B\t\b\002¢\006\004\b\006\020\007J\"\020\b\032\024\022\004\022\0020\003\022\n\022\b\022\004\022\0020\0050\0040\t2\006\020\n\032\0020\002H\026¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/junie/AipLicenseResultMapper;", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/OpResultMapper;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure;", "", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;", "<init>", "()V", "mapCompleted", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted;", "ret", "state.junie.impl"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class AipLicenseResultMapper implements OpResultMapper<AipLicenseResult, AipLicenseRequestFailure, List<? extends AipLicense>> {
/*    */   @NotNull
/*    */   public OpResult.OpCompleted<AipLicenseRequestFailure, List<AipLicense>> mapCompleted(@NotNull AipLicenseResult ret) {
/* 14 */     Intrinsics.checkNotNullParameter(ret, "ret"); AipLicenseResult aipLicenseResult = ret;
/*    */     
/* 16 */     if (aipLicenseResult instanceof AipLicenseResult.Success) {
/*    */     
/*    */     } else {
/*    */       throw new NoWhenBranchMatchedException();
/*    */     } 
/*    */     return (aipLicenseResult instanceof AipLicenseRequestFailure) ? (OpResult.OpCompleted<AipLicenseRequestFailure, List<AipLicense>>)new OpResult.OpCompleted.OpFailed(ret) : (OpResult.OpCompleted<AipLicenseRequestFailure, List<AipLicense>>)"JD-Core does not support Kotlin";
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final AipLicenseResultMapper INSTANCE = new AipLicenseResultMapper();
/*    */   public static final int $stable;
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\AipLicenseResultMapper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */