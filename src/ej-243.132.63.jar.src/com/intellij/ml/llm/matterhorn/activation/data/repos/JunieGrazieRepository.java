/*    */ package com.intellij.ml.llm.matterhorn.activation.data.repos;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020 \n\002\030\002\n\002\b\007\bf\030\000 (2\0020\001:\001(J\036\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\006H¦@¢\006\004\b\007\020\bJ&\020\t\032\b\022\004\022\0020\n0\0032\006\020\013\032\0020\0042\006\020\f\032\0020\rH¦@¢\006\004\b\016\020\017J&\020\020\032\b\022\004\022\0020\n0\0032\006\020\013\032\0020\0042\006\020\f\032\0020\rH¦@¢\006\004\b\021\020\017J.\020\022\032\b\022\004\022\0020\0230\0032\006\020\013\032\0020\0042\006\020\f\032\0020\r2\006\020\024\032\0020\025H¦@¢\006\004\b\026\020\027J&\020\030\032\b\022\004\022\0020\0310\0032\006\020\013\032\0020\0042\006\020\032\032\0020\033H¦@¢\006\004\b\034\020\035J&\020\036\032\b\022\004\022\0020\0230\0032\006\020\013\032\0020\0042\006\020\032\032\0020\033H¦@¢\006\004\b\037\020\035J,\020 \032\016\022\n\022\b\022\004\022\0020\"0!0\0032\006\020\013\032\0020\0042\006\020\032\032\0020\033H¦@¢\006\004\b#\020\035J\027\020$\032\0020\0332\006\020%\032\0020\023H&¢\006\004\b&\020'¨\006)"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;", "", "resolveApiUrl", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieApiUrl;", "configJsonUrl", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieConfigJsonUrl;", "resolveApiUrl-7oKCuCM", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jbaUserInfo", "", "url", "jbaIdToken", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaIdToken;", "jbaUserInfo-mvY-0G4", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "jbaRegister", "jbaRegister-mvY-0G4", "jbaProvideAccess", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthJwt;", "aipLicenseId", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseId;", "jbaProvideAccess-SRYjgCQ", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyToken", "Lkotlinx/datetime/Instant;", "authData", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;", "verifyToken-1CSWKTE", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshToken", "refreshToken-1CSWKTE", "listAvailableModels", "", "Lcom/intellij/ml/llm/activation/data/model/LlmModelId;", "listAvailableModels-1CSWKTE", "authJwtToAuthData", "authJwt", "authJwtToAuthData-cj1q3Zw", "(Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;", "Companion", "data.repos"})
/*    */ public interface JunieGrazieRepository { @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   @Nullable
/*    */   Object resolveApiUrl-7oKCuCM(@NotNull String paramString, @NotNull Continuation<? super GrazieResult<GrazieApiUrl>> paramContinuation);
/*    */   @Nullable
/*    */   Object jbaUserInfo-mvY-0G4(@NotNull String paramString1, @NotNull String paramString2, @NotNull Continuation<? super GrazieResult<Unit>> paramContinuation);
/*    */   @Nullable
/*    */   Object jbaRegister-mvY-0G4(@NotNull String paramString1, @NotNull String paramString2, @NotNull Continuation<? super GrazieResult<Unit>> paramContinuation);
/*    */   @Nullable
/*    */   Object jbaProvideAccess-SRYjgCQ(@NotNull String paramString1, @NotNull String paramString2, @NotNull String paramString3, @NotNull Continuation<? super GrazieResult<GrazieAuthJwt>> paramContinuation);
/*    */   @Nullable
/*    */   Object verifyToken-1CSWKTE(@NotNull String paramString, @NotNull GrazieAuthData paramGrazieAuthData, @NotNull Continuation<? super GrazieResult<Instant>> paramContinuation);
/*    */   @Nullable
/*    */   Object refreshToken-1CSWKTE(@NotNull String paramString, @NotNull GrazieAuthData paramGrazieAuthData, @NotNull Continuation<? super GrazieResult<GrazieAuthJwt>> paramContinuation);
/*    */   @Nullable
/*    */   Object listAvailableModels-1CSWKTE(@NotNull String paramString, @NotNull GrazieAuthData paramGrazieAuthData, @NotNull Continuation<? super GrazieResult<? extends List<LlmModelId>>> paramContinuation);
/*    */   @NotNull
/*    */   GrazieAuthData authJwtToAuthData-cj1q3Zw(@NotNull String paramString);
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004J\016\020\005\032\0020\002HA¢\006\002\020\006J\017\020\007\032\b\022\004\022\0020\0020\bH\001J\t\020\t\032\0020\002H\001R\032\020\n\032\n\022\006\b\001\022\0020\0020\013X\005¢\006\006\032\004\b\f\020\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository$Companion;", "Lcom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport;", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;", "<init>", "()V", "instance", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "instanceFlow", "Lkotlinx/coroutines/flow/Flow;", "syncInstance", "keyClass", "Lkotlin/reflect/KClass;", "getKeyClass", "()Lkotlin/reflect/KClass;", "data.repos"})
/*    */   @SourceDebugExtension({"SMAP\nJunieGrazieRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieGrazieRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository$Companion\n+ 2 AiaServiceSupport.kt\ncom/intellij/ml/llm/matterhorn/activation/platform/AiaServiceSupport$Companion\n*L\n1#1,25:1\n35#2:26\n*S KotlinDebug\n*F\n+ 1 JunieGrazieRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository$Companion\n*L\n23#1:26\n*E\n"})
/*    */   public static final class Companion implements AiaServiceSupport<JunieGrazieRepository> { private Companion() {
/* 23 */       AiaServiceSupport.Companion this_$iv = AiaServiceSupport.Companion; int $i$f$invoke = 0; this.$$delegate_0 = 
/*    */ 
/*    */         
/* 26 */         AiaServiceSupportKt.createForServiceInterface(this_$iv, Reflection.getOrCreateKotlinClass(JunieGrazieRepository.class));
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public JunieGrazieRepository syncInstance() {
/*    */       return (JunieGrazieRepository)this.$$delegate_0.syncInstance();
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public Object instance(@NotNull Continuation $completion) {
/*    */       return this.$$delegate_0.instance($completion);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public Flow<JunieGrazieRepository> instanceFlow() {
/*    */       return this.$$delegate_0.instanceFlow();
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public KClass<? extends JunieGrazieRepository> getKeyClass() {
/*    */       return this.$$delegate_0.getKeyClass();
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieGrazieRepository.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */