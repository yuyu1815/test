/*    */ package com.intellij.ml.llm.matterhorn.activation.data.repos;
/*    */ 
/*    */ import com.intellij.openapi.application.ApplicationInfo;
/*    */ import com.intellij.util.PlatformUtils;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\003\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\004\020\006R\024\020\007\032\0020\0058VX\004¢\006\006\032\004\b\007\020\006¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieIdeBuildInfoRepositoryImpl;", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieIdeBuildInfoRepository;", "<init>", "()V", "isCommunityEdition", "", "()Z", "isEapLicensing", "data.repos"})
/*    */ final class JunieIdeBuildInfoRepositoryImpl
/*    */   implements JunieIdeBuildInfoRepository
/*    */ {
/*    */   public boolean isCommunityEdition() {
/* 19 */     return PlatformUtils.isCommunityEdition();
/*    */   }
/*    */   public boolean isEapLicensing() {
/* 22 */     return (ApplicationInfo.getInstance().isEAP() && !Intrinsics.areEqual(System.getProperty("eap.require.license"), "release"));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieIdeBuildInfoRepositoryImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */