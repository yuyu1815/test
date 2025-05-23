/*    */ package com.intellij.ml.llm.matterhorn.activation.data.repos;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.IdeLicenseAiFlag;
/*    */ import com.intellij.openapi.application.ApplicationInfo;
/*    */ import com.intellij.util.PlatformUtils;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.flow.SharedFlow;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\b\002\030\000 \0172\0020\001:\001\017B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\026\020\006\032\0020\0072\006\020\b\032\0020\tHA¢\006\002\020\nR\030\020\013\032\b\022\004\022\0020\t0\fX\005¢\006\006\032\004\b\r\020\016¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieIdeLicenseRepositoryServiceImpl;", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieIdeLicenseRepository;", "cs", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "refreshAiFlagAndAwait", "", "desiredAiFlag", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/IdeLicenseAiFlag;", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/IdeLicenseAiFlag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aiFlagFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getAiFlagFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "Companion", "data.repos"})
/*    */ final class JunieIdeLicenseRepositoryServiceImpl
/*    */   implements JunieIdeLicenseRepository
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @NotNull
/*    */   public SharedFlow<IdeLicenseAiFlag> getAiFlagFlow() {
/*    */     return this.$$delegate_0.getAiFlagFlow();
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object refreshAiFlagAndAwait(@NotNull IdeLicenseAiFlag desiredAiFlag, @NotNull Continuation<? super Unit> $completion) {
/*    */     return this.$$delegate_0.refreshAiFlagAndAwait(desiredAiFlag, $completion);
/*    */   }
/*    */   
/*    */   public JunieIdeLicenseRepositoryServiceImpl(@NotNull CoroutineScope cs) {
/* 35 */     this.$$delegate_0 = Companion.delegateImpl(cs);
/*    */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieIdeLicenseRepositoryServiceImpl$Companion;", "", "<init>", "()V", "delegateImpl", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieIdeLicenseRepository;", "cs", "Lkotlinx/coroutines/CoroutineScope;", "data.repos"})
/*    */   public static final class Companion { @NotNull
/*    */     public final JunieIdeLicenseRepository delegateImpl(@NotNull CoroutineScope cs) {
/* 39 */       Intrinsics.checkNotNullParameter(cs, "cs"); ApplicationInfo applicationInfo = ApplicationInfo.getInstance();
/* 40 */       boolean isEap = (applicationInfo.isEAP() && !Intrinsics.areEqual(System.getProperty("eap.require.license"), "release"));
/* 41 */       boolean isCommunity = PlatformUtils.isCommunityEdition();
/* 42 */       boolean isThirdPartyVendor = !Intrinsics.areEqual(applicationInfo.getShortCompanyName(), "JetBrains");
/* 43 */       return 
/* 44 */         isThirdPartyVendor ? new NoIdeLicenseRepositoryImpl() : (
/* 45 */         (isEap || isCommunity) ? new NoIdeLicenseRepositoryImpl() : 
/* 46 */         new IdeLicenseRepositoryImpl(cs));
/*    */     }
/*    */     
/*    */     private Companion() {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieIdeLicenseRepositoryServiceImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */