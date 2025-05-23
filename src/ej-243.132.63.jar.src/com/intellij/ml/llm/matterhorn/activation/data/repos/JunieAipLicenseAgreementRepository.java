/*     */ package com.intellij.ml.llm.matterhorn.activation.data.repos;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\005\bf\030\000 \f2\0020\001:\001\fJ\016\020\002\032\0020\003H¦@¢\006\002\020\004J\026\020\005\032\0020\0062\006\020\007\032\0020\bH¦@¢\006\002\020\tJ\016\020\n\032\0020\bH¦@¢\006\002\020\004J\016\020\013\032\0020\bH¦@¢\006\002\020\004¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepository;", "", "getLocalAcceptedVersion", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement$Version;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setLocalAcceptedVersion", "", "agreement", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadLocalAgreementDocument", "updateAgreementDocument", "Companion", "data.repos"})
/*     */ public interface JunieAipLicenseAgreementRepository {
/*     */   @NotNull
/*     */   public static final Companion Companion = Companion.$$INSTANCE;
/*     */   
/*     */   @Nullable
/*     */   Object getLocalAcceptedVersion(@NotNull Continuation<? super AipLicenseAgreement.Version> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   Object setLocalAcceptedVersion(@NotNull AipLicenseAgreement paramAipLicenseAgreement, @NotNull Continuation<? super Unit> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   Object loadLocalAgreementDocument(@NotNull Continuation<? super AipLicenseAgreement> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   Object updateAgreementDocument(@NotNull Continuation<? super AipLicenseAgreement> paramContinuation);
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J\016\020\005\032\0020\002HA¢\006\002\020\006J\017\020\007\032\b\022\004\022\0020\0020\bH\001J\t\020\t\032\0020\002H\001R\032\020\n\032\n\022\006\b\001\022\0020\0020\013X\005¢\006\006\032\004\b\f\020\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepository$Companion;", "Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport;", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepository;", "<init>", "()V", "instance", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "instanceFlow", "Lkotlinx/coroutines/flow/Flow;", "syncInstance", "keyClass", "Lkotlin/reflect/KClass;", "getKeyClass", "()Lkotlin/reflect/KClass;", "data.repos"})
/*     */   @SourceDebugExtension({"SMAP\nJunieAipLicenseAgreementRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieAipLicenseAgreementRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepository$Companion\n+ 2 AiaServiceMockSupport.kt\ncom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceMockSupportKt\n*L\n1#1,127:1\n10#2:128\n*S KotlinDebug\n*F\n+ 1 JunieAipLicenseAgreementRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseAgreementRepository$Companion\n*L\n27#1:128\n*E\n"})
/*     */   public static final class Companion implements AiaServiceSupport<JunieAipLicenseAgreementRepository> {
/*     */     private Companion() {
/*  27 */       AiaServiceSupport.Companion $this$withMock$iv = AiaServiceSupport.Companion; int $i$f$withMock = 0; this.$$delegate_0 = 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 128 */         AiaServiceMockSupportKt.withMock(AiaServiceSupportKt.createForServiceInterface(AiaServiceSupport.Companion, Reflection.getOrCreateKotlinClass(JunieAipLicenseAgreementRepository.class)));
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public JunieAipLicenseAgreementRepository syncInstance() {
/*     */       return (JunieAipLicenseAgreementRepository)this.$$delegate_0.syncInstance();
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public Object instance(@NotNull Continuation $completion) {
/*     */       return this.$$delegate_0.instance($completion);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public Flow<JunieAipLicenseAgreementRepository> instanceFlow() {
/*     */       return this.$$delegate_0.instanceFlow();
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public KClass<? extends JunieAipLicenseAgreementRepository> getKeyClass() {
/*     */       return this.$$delegate_0.getKeyClass();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieAipLicenseAgreementRepository.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */