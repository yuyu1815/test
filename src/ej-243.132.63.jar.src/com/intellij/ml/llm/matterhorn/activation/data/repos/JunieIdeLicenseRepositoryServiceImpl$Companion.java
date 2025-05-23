/*    */ package com.intellij.ml.llm.matterhorn.activation.data.repos;
/*    */ 
/*    */ import com.intellij.openapi.application.ApplicationInfo;
/*    */ import com.intellij.util.PlatformUtils;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.CoroutineScope;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieIdeLicenseRepositoryServiceImpl$Companion;", "", "<init>", "()V", "delegateImpl", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieIdeLicenseRepository;", "cs", "Lkotlinx/coroutines/CoroutineScope;", "data.repos"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final JunieIdeLicenseRepository delegateImpl(@NotNull CoroutineScope cs) {
/* 39 */     Intrinsics.checkNotNullParameter(cs, "cs"); ApplicationInfo applicationInfo = ApplicationInfo.getInstance();
/* 40 */     boolean isEap = (applicationInfo.isEAP() && !Intrinsics.areEqual(System.getProperty("eap.require.license"), "release"));
/* 41 */     boolean isCommunity = PlatformUtils.isCommunityEdition();
/* 42 */     boolean isThirdPartyVendor = !Intrinsics.areEqual(applicationInfo.getShortCompanyName(), "JetBrains");
/* 43 */     return 
/* 44 */       isThirdPartyVendor ? new NoIdeLicenseRepositoryImpl() : (
/* 45 */       (isEap || isCommunity) ? new NoIdeLicenseRepositoryImpl() : 
/* 46 */       new IdeLicenseRepositoryImpl(cs));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieIdeLicenseRepositoryServiceImpl$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */