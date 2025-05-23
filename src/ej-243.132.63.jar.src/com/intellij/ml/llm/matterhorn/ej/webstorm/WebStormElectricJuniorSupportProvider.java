/*    */ package com.intellij.ml.llm.matterhorn.ej.webstorm;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.ElectricJuniorSupportProvider;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.SupportWithReason;
/*    */ import com.intellij.openapi.application.ApplicationInfo;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\022\020\004\032\004\030\0010\0052\006\020\006\032\0020\007H\026J\006\020\b\032\0020\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/webstorm/WebStormElectricJuniorSupportProvider;", "Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupportProvider;", "<init>", "()V", "getSupport", "Lcom/intellij/ml/llm/matterhorn/ej/core/SupportWithReason;", "project", "Lcom/intellij/openapi/project/Project;", "isWebStorm", "", "ej-webstorm"})
/*    */ public final class WebStormElectricJuniorSupportProvider implements ElectricJuniorSupportProvider {
/*    */   @Nullable
/*    */   public SupportWithReason getSupport(@NotNull Project project) {
/* 14 */     Intrinsics.checkNotNullParameter(project, "project"); boolean isWebstorm = isWebStorm();
/* 15 */     if (!isWebstorm) return null; 
/* 16 */     return new SupportWithReason(new WebStormElectricJuniorSupport(), "WebStorm IDE");
/*    */   }
/*    */   
/*    */   public final boolean isWebStorm() {
/* 20 */     Intrinsics.checkNotNullExpressionValue(ApplicationInfo.getInstance().getVersionName(), "getVersionName(...)"); return StringsKt.startsWith$default(ApplicationInfo.getInstance().getVersionName(), "WebStorm", false, 2, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\webstorm\WebStormElectricJuniorSupportProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */