/*    */ package com.intellij.ml.llm.matterhorn.activation.config;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.ide.Region;
/*    */ import com.intellij.ide.RegionSettings;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\bÁ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\032\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\bJ\020\020\t\032\0020\0052\006\020\007\032\0020\bH\002¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/config/AiaConfigGrazieStagingUrlUtil;", "", "<init>", "()V", "resolveStagingUrl", "", "propertyName", "region", "Lcom/intellij/ide/Region;", "defaultStagingUrl", "config"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class AiaConfigGrazieStagingUrlUtil
/*    */ {
/*    */   @NotNull
/*    */   public static final AiaConfigGrazieStagingUrlUtil INSTANCE = new AiaConfigGrazieStagingUrlUtil();
/*    */   public static final int $stable;
/*    */   
/*    */   @NotNull
/*    */   public final String resolveStagingUrl(@NotNull String propertyName, @NotNull Region region) {
/* 22 */     Intrinsics.checkNotNullParameter(propertyName, "propertyName"); Intrinsics.checkNotNullParameter(region, "region"); String regionalUrl = System.getProperty(AiaConfigGrazieStagingUrlUtilKt.access$regionalPropertyName(propertyName, region));
/* 23 */     if (regionalUrl != null) {
/* 24 */       return regionalUrl;
/*    */     }
/* 26 */     String url = System.getProperty(propertyName);
/* 27 */     if (url != null) {
/* 28 */       return url;
/*    */     }
/* 30 */     return defaultStagingUrl(region);
/*    */   }
/*    */   
/*    */   private final String defaultStagingUrl(Region region) {
/* 34 */     return 
/* 35 */       (WhenMappings.$EnumSwitchMapping$0[region.ordinal()] == 1) ? "https://api.stgn.ai.jetbrains.com.cn" : 
/* 36 */       "https://api.app.stgn.grazie.aws.intellij.net";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\config\AiaConfigGrazieStagingUrlUtil.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */