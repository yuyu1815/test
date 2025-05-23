/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AipLicenseResult;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000&\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\b\003\032\036\020\000\032\0020\001*\0020\0012\f\020\002\032\b\022\004\022\0020\0040\003H\bø\001\000\0329\020\005\032\0020\001*\0020\0012'\020\002\032#\022\031\022\027\022\004\022\0020\b0\007¢\006\f\b\t\022\b\b\n\022\004\b\b(\013\022\004\022\0020\0040\006H\bø\001\000\002\007\n\005\b20\001¨\006\f"}, d2 = {"onAuthRequired", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;", "action", "Lkotlin/Function0;", "", "onSuccess", "Lkotlin/Function1;", "", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;", "Lkotlin/ParameterName;", "name", "licenses", "state.junie.impl"})
/*    */ public final class AipLicenseResultMapperKt
/*    */ {
/*    */   @NotNull
/*    */   public static final AipLicenseResult onAuthRequired(@NotNull AipLicenseResult $this$onAuthRequired, @NotNull Function0 action) {
/* 23 */     Intrinsics.checkNotNullParameter($this$onAuthRequired, "<this>"); Intrinsics.checkNotNullParameter(action, "action"); int $i$f$onAuthRequired = 0; AipLicenseResult aipLicenseResult1 = $this$onAuthRequired, $this$onAuthRequired_u24lambda_u240 = aipLicenseResult1; int $i$a$-apply-AipLicenseResultMapperKt$onAuthRequired$1 = 0;
/* 24 */     if ($this$onAuthRequired_u24lambda_u240 instanceof com.intellij.ml.llm.matterhorn.activation.data.model.result.AipLicenseRequestFailure.AuthRequired) action.invoke(); 
/*    */     return aipLicenseResult1; } @NotNull
/*    */   public static final AipLicenseResult onSuccess(@NotNull AipLicenseResult $this$onSuccess, @NotNull Function1 action) {
/* 27 */     Intrinsics.checkNotNullParameter($this$onSuccess, "<this>"); Intrinsics.checkNotNullParameter(action, "action"); int $i$f$onSuccess = 0; AipLicenseResult aipLicenseResult1 = $this$onSuccess, $this$onSuccess_u24lambda_u241 = aipLicenseResult1; int $i$a$-apply-AipLicenseResultMapperKt$onSuccess$1 = 0;
/* 28 */     if ($this$onSuccess_u24lambda_u241 instanceof AipLicenseResult.Success) action.invoke(((AipLicenseResult.Success)$this$onSuccess_u24lambda_u241).getLicenses()); 
/*    */     return aipLicenseResult1;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\AipLicenseResultMapperKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */