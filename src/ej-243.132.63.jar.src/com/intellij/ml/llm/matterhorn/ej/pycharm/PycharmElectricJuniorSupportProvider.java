/*    */ package com.intellij.ml.llm.matterhorn.ej.pycharm;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.ElectricJuniorSupportProvider;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.SupportWithReason;
/*    */ import com.intellij.openapi.application.ApplicationInfo;
/*    */ import com.intellij.openapi.module.Module;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.projectRoots.Sdk;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\022\020\004\032\004\030\0010\0052\006\020\006\032\0020\007H\026J\022\020\b\032\004\030\0010\t2\006\020\006\032\0020\007H\002¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/pycharm/PycharmElectricJuniorSupportProvider;", "Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupportProvider;", "<init>", "()V", "getSupport", "Lcom/intellij/ml/llm/matterhorn/ej/core/SupportWithReason;", "project", "Lcom/intellij/openapi/project/Project;", "getPythonModuleWithSdk", "Lcom/intellij/openapi/module/Module;", "ej-pycharm"})
/*    */ public final class PycharmElectricJuniorSupportProvider implements ElectricJuniorSupportProvider {
/*    */   @Nullable
/*    */   public SupportWithReason getSupport(@NotNull Project project) {
/* 18 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullExpressionValue(ApplicationInfo.getInstance().getVersionName(), "getVersionName(...)"); boolean isPycharm = StringsKt.startsWith$default(ApplicationInfo.getInstance().getVersionName(), "PyCharm", false, 2, null);
/* 19 */     if (!isPycharm) return null;
/*    */ 
/*    */     
/* 22 */     return new SupportWithReason(new PycharmElectricJuniorSupport(), "PyCharm IDE");
/*    */   }
/*    */ 
/*    */   
/*    */   private final Module getPythonModuleWithSdk(Project project) {
/* 27 */     Module[] modules = ModuleManager.Companion.getInstance(project).getModules(); byte b; int i;
/* 28 */     for (b = 0, i = modules.length; b < i; ) { Module module = modules[b];
/* 29 */       Sdk sdk = ProjectRootManager.getInstance(project).getProjectSdk();
/* 30 */       if (sdk != null && sdk.getSdkType() instanceof com.jetbrains.python.sdk.PythonSdkType)
/* 31 */         return module; 
/*    */       b++; }
/*    */     
/* 34 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\pycharm\PycharmElectricJuniorSupportProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */