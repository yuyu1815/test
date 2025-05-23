/*     */ package com.intellij.ml.llm.matterhorn.activation.data.impl.enterprise;
/*     */ 
/*     */ import com.intellij.ml.llm.activation.data.model.GrazieAgentKt;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.AieProvisionStatus;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.GrazieApiUrl;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.GrazieAuthData;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.GrazieAuthOrigin;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.SimpleHttpHeaders;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AieAuthFailure;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AieAuthResult;
/*     */ import com.intellij.ml.llm.matterhorn.activation.platform.util.ServiceKt;
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.platform.ide.provisioner.ProvisionedServiceConfiguration;
/*     */ import com.intellij.platform.ide.provisioner.ProvisionedServiceConfigurationResult;
/*     */ import com.intellij.platform.ide.provisioner.ProvisionedServiceDescriptor;
/*     */ import com.intellij.platform.ide.provisioner.ProvisionedServiceRegistry;
/*     */ import com.intellij.platform.ide.provisioner.endpoint.AuthToken;
/*     */ import com.intellij.platform.ide.provisioner.endpoint.AuthTokenResult;
/*     */ import com.intellij.platform.ide.provisioner.endpoint.ServiceEndpoint;
/*     */ import com.intellij.util.ApplicationKt;
/*     */ import java.lang.invoke.MethodHandles;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000L\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\032\016\020\005\032\0020\006*\004\030\0010\007H\002\032\f\020\b\032\0020\t*\0020\nH\002\032\f\020\013\032\0020\f*\0020\rH\002\032\f\020\022\032\0020\023*\0020\024H\002\032\f\020\025\032\0020\024*\0020\023H\002\032\020\020\026\032\n\022\006\022\004\030\0010\0300\027H\002\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\016\020\003\032\0020\001XT¢\006\002\n\000\"\016\020\004\032\0020\001XT¢\006\002\n\000\"\034\020\016\032\004\030\0010\017*\004\030\0010\0078BX\004¢\006\006\032\004\b\020\020\021\"\016\020\031\032\0020\032X\004¢\006\002\n\000¨\006\033"}, d2 = {"kAiServiceType", "", "kAiServiceEnabledProp", "kAiServiceAllowDataSharingProp", "kAiServiceAllowThirdPartyProvidersProp", "toProvisionStatus", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus;", "Lcom/intellij/platform/ide/provisioner/ProvisionedServiceConfigurationResult;", "toProvisioned", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieProvisioned;", "Lcom/intellij/platform/ide/provisioner/ProvisionedServiceConfiguration;", "toAuthDataResult", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AieAuthResult;", "Lcom/intellij/platform/ide/provisioner/endpoint/AuthTokenResult;", "endpoint", "Lcom/intellij/platform/ide/provisioner/endpoint/ServiceEndpoint;", "getEndpoint", "(Lcom/intellij/platform/ide/provisioner/ProvisionedServiceConfigurationResult;)Lcom/intellij/platform/ide/provisioner/endpoint/ServiceEndpoint;", "toGrazieAccessToken", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;", "Lcom/intellij/platform/ide/provisioner/endpoint/AuthToken;", "toProvisionerAuthToken", "aiServiceDescriptorFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/intellij/platform/ide/provisioner/ProvisionedServiceDescriptor;", "LOG", "Lcom/intellij/openapi/diagnostic/Logger;", "data.impl.enterprise"})
/*     */ @SourceDebugExtension({"SMAP\nJunieAieProvisionRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieAieProvisionRepositoryImpl.kt\ncom/intellij/ml/llm/matterhorn/activation/data/impl/enterprise/JunieAieProvisionRepositoryImplKt\n+ 2 service.kt\ncom/intellij/ml/llm/matterhorn/activation/platform/util/ServiceKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,146:1\n20#2:147\n49#3:148\n51#3:152\n46#4:149\n51#4:151\n105#5:150\n58#6:153\n36#6,2:154\n*S KotlinDebug\n*F\n+ 1 JunieAieProvisionRepositoryImpl.kt\ncom/intellij/ml/llm/matterhorn/activation/data/impl/enterprise/JunieAieProvisionRepositoryImplKt\n*L\n138#1:147\n139#1:148\n139#1:152\n139#1:149\n139#1:151\n139#1:150\n145#1:153\n145#1:154,2\n*E\n"})
/*     */ public final class JunieAieProvisionRepositoryImplKt
/*     */ {
/*     */   @NotNull
/*     */   private static final String kAiServiceType = "ai";
/*     */   @NotNull
/*     */   private static final String kAiServiceEnabledProp = "aiEnabled";
/*     */   @NotNull
/*     */   private static final String kAiServiceAllowDataSharingProp = "allowDataSharing";
/*     */   @NotNull
/*     */   private static final String kAiServiceAllowThirdPartyProvidersProp = "allowThirdPartyAiProviders";
/*     */   @NotNull
/*     */   private static final Logger LOG;
/*     */   
/*     */   private static final AieProvisionStatus toProvisionStatus(ProvisionedServiceConfigurationResult $this$toProvisionStatus) {
/*  87 */     ProvisionedServiceConfigurationResult provisionedServiceConfigurationResult = $this$toProvisionStatus;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  92 */     if (provisionedServiceConfigurationResult instanceof ProvisionedServiceConfigurationResult.Success.ServiceProvisioned) {
/*     */     
/*     */     } else {
/*     */       throw new NoWhenBranchMatchedException();
/*     */     } 
/*  97 */     return (provisionedServiceConfigurationResult == null) ? (AieProvisionStatus)AieProvisionStatus.AieFallback.AieServiceUnknownToProvisioner.INSTANCE : ((provisionedServiceConfigurationResult instanceof ProvisionedServiceConfigurationResult.Failure.LoginRequired) ? (AieProvisionStatus)AieProvisionStatus.AieBlocked.AieProvisionerLoginRequired.INSTANCE : ((provisionedServiceConfigurationResult instanceof ProvisionedServiceConfigurationResult.Failure.GenericError) ? (AieProvisionStatus)new AieProvisionStatus.AieBlocked.AieProvisioningError(((ProvisionedServiceConfigurationResult.Failure.GenericError)$this$toProvisionStatus).getMessage()) : (Intrinsics.areEqual(provisionedServiceConfigurationResult, ProvisionedServiceConfigurationResult.Success.ServiceNotProvisioned.INSTANCE) ? (AieProvisionStatus)AieProvisionStatus.AieFallback.AieConfigurationNotProvisioned.INSTANCE : (AieProvisionStatus)"JD-Core does not support Kotlin"))); } private static final AieProvisionStatus.AieProvisioned toProvisioned(ProvisionedServiceConfiguration $this$toProvisioned) { ServiceEndpoint endpoint = $this$toProvisioned.getEndpoint();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 102 */     $this$toProvisioned.get("allowDataSharing"); boolean isDataSharingAllowed = !(($this$toProvisioned.get("allowDataSharing") != null) ? (!Boolean.parseBoolean($this$toProvisioned.get("allowDataSharing")) ? 1 : 0) : 0);
/* 103 */     $this$toProvisioned.get("allowThirdPartyAiProviders"); boolean isThirdPartyProvidersAllowed = !(($this$toProvisioned.get("allowThirdPartyAiProviders") != null) ? (!Boolean.parseBoolean($this$toProvisioned.get("allowThirdPartyAiProviders")) ? 1 : 0) : 0);
/* 104 */     return (endpoint == null) ? (AieProvisionStatus.AieProvisioned)AieProvisionStatus.AieBlocked.AieServiceMisconfigured.INSTANCE : (!Boolean.parseBoolean($this$toProvisioned.get("aiEnabled")) ? (AieProvisionStatus.AieProvisioned)AieProvisionStatus.AieBlocked.AieServiceProhibited.INSTANCE : (AieProvisionStatus.AieProvisioned)new AieProvisionStatus.AieActivated(
/* 105 */         GrazieApiUrl.Companion.fromResolvedUrl-kmrddwU(endpoint.getServerUrl()), 
/* 106 */         isDataSharingAllowed, 
/* 107 */         isThirdPartyProvidersAllowed, null)); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final AieAuthResult toAuthDataResult(AuthTokenResult $this$toAuthDataResult) {
/* 114 */     AuthTokenResult authTokenResult = $this$toAuthDataResult;
/*     */ 
/*     */     
/* 117 */     if (authTokenResult instanceof AuthTokenResult.Failure) {
/*     */     
/*     */     } else {
/*     */       throw new NoWhenBranchMatchedException();
/*     */     } 
/*     */     return (authTokenResult instanceof AuthTokenResult.Success) ? (AieAuthResult)new AieAuthResult.AieAuthSuccess(toGrazieAccessToken(((AuthTokenResult.Success)$this$toAuthDataResult).getToken())) : ((authTokenResult instanceof AuthTokenResult.Failure.LoginRequired) ? (AieAuthResult)AieAuthFailure.AieLoginRequired.INSTANCE : (AieAuthResult)"JD-Core does not support Kotlin"); } private static final ServiceEndpoint getEndpoint(ProvisionedServiceConfigurationResult $this$endpoint) { Object object;
/* 123 */     if ((($this$endpoint instanceof ProvisionedServiceConfigurationResult.Success.ServiceProvisioned) ? $this$endpoint : null) == null) { ($this$endpoint instanceof ProvisionedServiceConfigurationResult.Success.ServiceProvisioned) ? $this$endpoint : null; return null; }
/* 124 */      return object.getConfiguration().getEndpoint(); }
/*     */   
/*     */   private static final GrazieAuthData toGrazieAccessToken(AuthToken $this$toGrazieAccessToken) {
/* 127 */     return new GrazieAuthData(
/* 128 */         GrazieAuthOrigin.AuthAieProvisioner, 
/* 129 */         SimpleHttpHeaders.Companion.fromMap-vDDv_S8(
/* 130 */           MapsKt.plus($this$toGrazieAccessToken.getRequestHeaders(), GrazieAgentKt.getGrazieAgentHeader())), null);
/*     */   }
/*     */   
/*     */   private static final AuthToken toProvisionerAuthToken(GrazieAuthData $this$toProvisionerAuthToken) {
/* 134 */     return new AuthToken(SimpleHttpHeaders.asMap-impl($this$toProvisionerAuthToken.getRequestHeaders-yd9Q308()));
/*     */   }
/*     */   
/*     */   private static final Flow<ProvisionedServiceDescriptor> aiServiceDescriptorFlow() {
/* 138 */     ComponentManager $this$dynamicPluginServiceFlow$iv = (ComponentManager)ApplicationKt.getApplication(); int $i$f$dynamicPluginServiceFlow = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 147 */     Flow flow1 = ServiceKt.dynamicPluginServiceFlow($this$dynamicPluginServiceFlow$iv, ProvisionedServiceRegistry.class); int $i$f$map = 0;
/* 148 */     Flow $this$unsafeTransform$iv$iv = flow1; int $i$f$unsafeTransform = 0;
/* 149 */     int $i$f$unsafeFlow = 0;
/* 150 */     return new JunieAieProvisionRepositoryImplKt$aiServiceDescriptorFlow$$inlined$map$1($this$unsafeTransform$iv$iv);
/*     */   } static {
/*     */     int $i$f$fileLogger = 0;
/* 153 */     int $i$f$currentClassLogger = 0;
/* 154 */     Class<?> clazz$iv$iv = MethodHandles.lookup().lookupClass();
/* 155 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(clazz$iv$iv), "getInstance(...)"); LOG = Logger.getInstance(clazz$iv$iv);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\impl\enterprise\JunieAieProvisionRepositoryImplKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */