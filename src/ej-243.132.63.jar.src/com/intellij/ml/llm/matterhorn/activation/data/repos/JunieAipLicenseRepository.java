/*     */ package com.intellij.ml.llm.matterhorn.activation.data.repos;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicenseProductType;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AipLicenseResult;
/*     */ import com.intellij.ml.llm.matterhorn.activation.platform.AiaServiceSupport;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\002\b\004\bf\030\000 \0202\0020\001:\001\020J\016\020\002\032\0020\003H¦@¢\006\002\020\004J\016\020\005\032\0020\003H¦@¢\006\002\020\004J\016\020\006\032\0020\003H¦@¢\006\002\020\004J\016\020\007\032\0020\003H¦@¢\006\002\020\004J\016\020\b\032\0020\003H¦@¢\006\002\020\004J\016\020\t\032\0020\003H¦@¢\006\002\020\004J\026\020\n\032\0020\0132\006\020\f\032\0020\rH¦@¢\006\002\020\016J\026\020\017\032\0020\0132\006\020\f\032\0020\rH¦@¢\006\002\020\016¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepository;", "", "getPurchaseAipUrl", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentMethodsUrl", "getManageAccountUrl", "getLicenseUrl", "getRegisterAccountUrl", "getLicensePurchaseUrl", "getActiveLicenses", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;", "productType", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "issueTrialLicense", "Companion", "data.repos"})
/*     */ public interface JunieAipLicenseRepository {
/*     */   @NotNull
/*     */   public static final Companion Companion = Companion.$$INSTANCE;
/*     */   
/*     */   @Nullable
/*     */   Object getPurchaseAipUrl(@NotNull Continuation<? super String> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   Object getPaymentMethodsUrl(@NotNull Continuation<? super String> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   Object getManageAccountUrl(@NotNull Continuation<? super String> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   Object getLicenseUrl(@NotNull Continuation<? super String> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   Object getRegisterAccountUrl(@NotNull Continuation<? super String> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   Object getLicensePurchaseUrl(@NotNull Continuation<? super String> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   Object getActiveLicenses(@NotNull AipLicenseProductType paramAipLicenseProductType, @NotNull Continuation<? super AipLicenseResult> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   Object issueTrialLicense(@NotNull AipLicenseProductType paramAipLicenseProductType, @NotNull Continuation<? super AipLicenseResult> paramContinuation);
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J\016\020\005\032\0020\002HA¢\006\002\020\006J\017\020\007\032\b\022\004\022\0020\0020\bH\001J\t\020\t\032\0020\002H\001R\032\020\n\032\n\022\006\b\001\022\0020\0020\013X\005¢\006\006\032\004\b\f\020\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepository$Companion;", "Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport;", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepository;", "<init>", "()V", "instance", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "instanceFlow", "Lkotlinx/coroutines/flow/Flow;", "syncInstance", "keyClass", "Lkotlin/reflect/KClass;", "getKeyClass", "()Lkotlin/reflect/KClass;", "data.repos"})
/*     */   @SourceDebugExtension({"SMAP\nJunieAipLicenseRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieAipLicenseRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepository$Companion\n+ 2 AiaServiceMockSupport.kt\ncom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceMockSupportKt\n*L\n1#1,208:1\n10#2:209\n*S KotlinDebug\n*F\n+ 1 JunieAipLicenseRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepository$Companion\n*L\n44#1:209\n*E\n"})
/*     */   public static final class Companion implements AiaServiceSupport<JunieAipLicenseRepository> {
/*     */     private Companion() {
/*  44 */       AiaServiceSupport.Companion $this$withMock$iv = AiaServiceSupport.Companion; int $i$f$withMock = 0; this.$$delegate_0 = 
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
/* 209 */         AiaServiceMockSupportKt.withMock(AiaServiceSupportKt.createForServiceInterface(AiaServiceSupport.Companion, Reflection.getOrCreateKotlinClass(JunieAipLicenseRepository.class)));
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public JunieAipLicenseRepository syncInstance() {
/*     */       return (JunieAipLicenseRepository)this.$$delegate_0.syncInstance();
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public Object instance(@NotNull Continuation $completion) {
/*     */       return this.$$delegate_0.instance($completion);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public Flow<JunieAipLicenseRepository> instanceFlow() {
/*     */       return this.$$delegate_0.instanceFlow();
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public KClass<? extends JunieAipLicenseRepository> getKeyClass() {
/*     */       return this.$$delegate_0.getKeyClass();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieAipLicenseRepository.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */