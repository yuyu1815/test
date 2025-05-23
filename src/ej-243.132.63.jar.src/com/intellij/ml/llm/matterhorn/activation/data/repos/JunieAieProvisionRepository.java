/*    */ package com.intellij.ml.llm.matterhorn.activation.data.repos;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bf\030\000 \0162\0020\001:\001\016J\020\020\n\032\0020\0132\006\020\f\032\0020\rH&R\030\020\002\032\b\022\004\022\0020\0040\003X¦\004¢\006\006\032\004\b\005\020\006R\030\020\007\032\b\022\004\022\0020\b0\003X¦\004¢\006\006\032\004\b\t\020\006¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAieProvisionRepository;", "", "provisionStatusFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus;", "getProvisionStatusFlow", "()Lkotlinx/coroutines/flow/Flow;", "authDataFlow", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AieAuthResult;", "getAuthDataFlow", "reportAuthFailure", "", "authData", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;", "Companion", "data.repos"})
/*    */ public interface JunieAieProvisionRepository {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   @NotNull
/*    */   Flow<AieProvisionStatus> getProvisionStatusFlow();
/*    */   
/*    */   @NotNull
/*    */   Flow<AieAuthResult> getAuthDataFlow();
/*    */   
/*    */   void reportAuthFailure(@NotNull GrazieAuthData paramGrazieAuthData);
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J\016\020\005\032\0020\002HA¢\006\002\020\006J\017\020\007\032\b\022\004\022\0020\0020\bH\001J\t\020\t\032\0020\002H\001R\032\020\n\032\n\022\006\b\001\022\0020\0020\013X\005¢\006\006\032\004\b\f\020\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAieProvisionRepository$Companion;", "Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport;", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAieProvisionRepository;", "<init>", "()V", "instance", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "instanceFlow", "Lkotlinx/coroutines/flow/Flow;", "syncInstance", "keyClass", "Lkotlin/reflect/KClass;", "getKeyClass", "()Lkotlin/reflect/KClass;", "data.repos"})
/*    */   @SourceDebugExtension({"SMAP\nJunieAieProvisionRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieAieProvisionRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAieProvisionRepository$Companion\n+ 2 AiaServiceMockSupport.kt\ncom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceMockSupportKt\n*L\n1#1,27:1\n10#2:28\n*S KotlinDebug\n*F\n+ 1 JunieAieProvisionRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAieProvisionRepository$Companion\n*L\n19#1:28\n*E\n"})
/*    */   public static final class Companion implements AiaServiceSupport<JunieAieProvisionRepository> {
/*    */     private Companion() {
/* 19 */       AiaServiceSupport.Companion $this$withMock$iv = AiaServiceSupport.Companion; int $i$f$withMock = 0; this.$$delegate_0 = 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 28 */         AiaServiceMockSupportKt.withMock(AiaServiceSupportKt.createForServiceInterface(AiaServiceSupport.Companion, Reflection.getOrCreateKotlinClass(JunieAieProvisionRepository.class)));
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public JunieAieProvisionRepository syncInstance() {
/*    */       return (JunieAieProvisionRepository)this.$$delegate_0.syncInstance();
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public Object instance(@NotNull Continuation $completion) {
/*    */       return this.$$delegate_0.instance($completion);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public Flow<JunieAieProvisionRepository> instanceFlow() {
/*    */       return this.$$delegate_0.instanceFlow();
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public KClass<? extends JunieAieProvisionRepository> getKeyClass() {
/*    */       return this.$$delegate_0.getKeyClass();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieAieProvisionRepository.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */