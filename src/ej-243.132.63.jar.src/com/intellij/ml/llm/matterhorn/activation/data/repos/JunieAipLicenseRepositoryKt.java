/*     */ package com.intellij.ml.llm.matterhorn.activation.data.repos;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicense;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicenseId;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicenseProductType;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.JbaUserId;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AipLicenseRequestFailure;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AipLicenseResult;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.ui.JBAccountInfoService;
/*     */ import java.lang.invoke.MethodHandles;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.datetime.ConvertersKt;
/*     */ import kotlinx.datetime.Instant;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000*\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\032\024\020\002\032\0020\003*\0020\0042\006\020\005\032\0020\006H\002\032\024\020\007\032\0020\b*\0020\t2\006\020\005\032\0020\006H\002\"\016\020\000\032\0020\001X\004¢\006\002\n\000\"\016\020\n\032\0020\013XT¢\006\002\n\000\"\016\020\f\032\0020\013XT¢\006\002\n\000\"\016\020\r\032\0020\013XT¢\006\002\n\000\"\016\020\016\032\0020\013XT¢\006\002\n\000\"\016\020\017\032\0020\013XT¢\006\002\n\000¨\006\020"}, d2 = {"LOG", "Lcom/intellij/openapi/diagnostic/Logger;", "toAipLicenseResult", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;", "Lcom/intellij/ui/JBAccountInfoService$LicenseListResult;", "productType", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;", "toAipLicense", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;", "Lcom/intellij/ui/JBAccountInfoService$JbaLicense;", "jetbrainsSignUPAccountUrl", "", "jetbrainsAccountUrl", "plansAndPricingLandingUrl", "jetbrainsAIServiceLicenseUrl", "jetbrainsLicensePurchaseUrl", "data.repos"})
/*     */ @SourceDebugExtension({"SMAP\nJunieAipLicenseRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieAipLicenseRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,208:1\n1557#2:209\n1628#2,3:210\n58#3:213\n36#3,2:214\n*S KotlinDebug\n*F\n+ 1 JunieAipLicenseRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepositoryKt\n*L\n128#1:209\n128#1:210,3\n27#1:213\n27#1:214,2\n*E\n"})
/*     */ public final class JunieAipLicenseRepositoryKt {
/*     */   static {
/*  27 */     int $i$f$fileLogger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 213 */     int $i$f$currentClassLogger = 0;
/* 214 */     Class<?> clazz$iv$iv = MethodHandles.lookup().lookupClass();
/* 215 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(clazz$iv$iv), "getInstance(...)"); LOG = Logger.getInstance(clazz$iv$iv);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final Logger LOG;
/*     */   @NotNull
/*     */   private static final String jetbrainsSignUPAccountUrl = "https://account.jetbrains.com/signup";
/*     */   @NotNull
/*     */   private static final String jetbrainsAccountUrl = "https://account.jetbrains.com/";
/*     */   @NotNull
/*     */   private static final String plansAndPricingLandingUrl = "https://jb.gg/ai-pricing";
/*     */   @NotNull
/*     */   private static final String jetbrainsAIServiceLicenseUrl = "https://www.jetbrains.com/legal/docs/terms/jetbrains-ai-service/";
/*     */   @NotNull
/*     */   private static final String jetbrainsLicensePurchaseUrl = "https://account.jetbrains.com/licenses/";
/*     */   
/*     */   private static final AipLicenseResult toAipLicenseResult(JBAccountInfoService.LicenseListResult $this$toAipLicenseResult, AipLicenseProductType productType) {
/*     */     JBAccountInfoService.LicenseListResult licenseListResult = $this$toAipLicenseResult;
/*     */     Intrinsics.checkNotNullExpressionValue(((JBAccountInfoService.LicenseListResult.LicenseList)$this$toAipLicenseResult).licenses(), "licenses(...)");
/*     */     Iterable $this$map$iv = ((JBAccountInfoService.LicenseListResult.LicenseList)$this$toAipLicenseResult).licenses();
/*     */     int $i$f$map = 0;
/*     */     Iterable iterable1 = $this$map$iv;
/*     */     Collection<AipLicense> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
/*     */     int $i$f$mapTo = 0;
/*     */     for (Object item$iv$iv : iterable1) {
/*     */       JBAccountInfoService.JbaLicense jbaLicense = (JBAccountInfoService.JbaLicense)item$iv$iv;
/*     */       Collection<AipLicense> collection = destination$iv$iv;
/*     */       int $i$a$-map-JunieAipLicenseRepositoryKt$toAipLicenseResult$1 = 0;
/*     */       Intrinsics.checkNotNull(jbaLicense);
/*     */       collection.add(toAipLicense(jbaLicense, productType));
/*     */     } 
/*     */     List list = (List)destination$iv$iv;
/*     */     if (licenseListResult instanceof JBAccountInfoService.LicenseListResult.RequestDeclined) {
/*     */       String str1 = ((JBAccountInfoService.LicenseListResult.RequestDeclined)$this$toAipLicenseResult).errorCode();
/*     */       Intrinsics.checkNotNullExpressionValue(str1, "errorCode(...)");
/*     */       KnownRequestDeclinedReason reason = KnownRequestDeclinedReason.Companion.fromErrorCode(str1);
/*     */       if (reason != null) {
/*     */         AipLicenseRequestFailure.AuthRequired authRequired = reason.asAuthRequired();
/*     */         if (authRequired != null) {
/*     */           AipLicenseRequestFailure.AuthRequired it = authRequired;
/*     */           int $i$a$-let-JunieAipLicenseRepositoryKt$toAipLicenseResult$2 = 0;
/*     */           return (AipLicenseResult)it;
/*     */         } 
/*     */       } 
/*     */       if (reason != null) {
/*     */         String str = ((JBAccountInfoService.LicenseListResult.RequestDeclined)$this$toAipLicenseResult).message();
/*     */         Intrinsics.checkNotNullExpressionValue(str, "message(...)");
/*     */         AipLicenseResult aipLicenseResult = reason.toAipLicenseDenied(str);
/*     */         if (aipLicenseResult != null) {
/*     */           AipLicenseResult it = aipLicenseResult;
/*     */           int $i$a$-let-JunieAipLicenseRepositoryKt$toAipLicenseResult$3 = 0;
/*     */           return it;
/*     */         } 
/*     */       } 
/*     */       Intrinsics.checkNotNullExpressionValue(((JBAccountInfoService.LicenseListResult.RequestDeclined)$this$toAipLicenseResult).message(), "message(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(((JBAccountInfoService.LicenseListResult.RequestDeclined)$this$toAipLicenseResult).message(), "message(...)");
/*     */       String messageWithCode = StringsKt.contains$default(((JBAccountInfoService.LicenseListResult.RequestDeclined)$this$toAipLicenseResult).message(), "Something went wrong", false, 2, null) ? (((JBAccountInfoService.LicenseListResult.RequestDeclined)$this$toAipLicenseResult).message() + " Error code: " + ((JBAccountInfoService.LicenseListResult.RequestDeclined)$this$toAipLicenseResult).message()) : ((JBAccountInfoService.LicenseListResult.RequestDeclined)$this$toAipLicenseResult).message();
/*     */       return (AipLicenseResult)new AipLicenseRequestFailure.LicenseDenied(null, messageWithCode);
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(((JBAccountInfoService.LicenseListResult.RequestFailed)$this$toAipLicenseResult).errorMessage(), "errorMessage(...)");
/*     */     if (licenseListResult instanceof JBAccountInfoService.AuthRequired) {
/*     */     
/*     */     } else {
/*     */       throw new NoWhenBranchMatchedException();
/*     */     } 
/*     */     return (licenseListResult instanceof JBAccountInfoService.LicenseListResult.LicenseList) ? (AipLicenseResult)new AipLicenseResult.Success(list) : ((licenseListResult instanceof JBAccountInfoService.LicenseListResult.RequestFailed) ? (AipLicenseResult)new AipLicenseRequestFailure.ErrorResponse(((JBAccountInfoService.LicenseListResult.RequestFailed)$this$toAipLicenseResult).errorMessage()) : (AipLicenseResult)"JD-Core does not support Kotlin");
/*     */   }
/*     */   
/*     */   private static final AipLicense toAipLicense(JBAccountInfoService.JbaLicense $this$toAipLicense, AipLicenseProductType productType) {
/*     */     Intrinsics.checkNotNullExpressionValue($this$toAipLicense.licenseId(), "licenseId(...)");
/*     */     String str1 = AipLicenseId.constructor-impl($this$toAipLicense.licenseId());
/*     */     Intrinsics.checkNotNullExpressionValue($this$toAipLicense.jbaUserId(), "jbaUserId(...)");
/*     */     String str2 = JbaUserId.constructor-impl($this$toAipLicense.jbaUserId());
/*     */     boolean bool1 = ($this$toAipLicense.licenseKind() == JBAccountInfoService.LicenseKind.TRIAL) ? true : false;
/*     */     boolean bool2 = ($this$toAipLicense.licenseeType() == JBAccountInfoService.LicenseeType.INDIVIDUAL) ? true : false;
/*     */     Intrinsics.checkNotNullExpressionValue($this$toAipLicense.licensedTo(), "licensedTo(...)");
/*     */     String str3 = $this$toAipLicense.licensedTo();
/*     */     Intrinsics.checkNotNullExpressionValue($this$toAipLicense.expiresOn(), "expiresOn(...)");
/*     */     Instant instant = ConvertersKt.toKotlinInstant($this$toAipLicense.expiresOn());
/*     */     return new AipLicense(str1, str2, bool1, bool2, productType, str3, instant, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieAipLicenseRepositoryKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */