/*    */ package com.intellij.ml.llm.matterhorn.ej.idea;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.SupportWithReason;
/*    */ import com.intellij.openapi.application.ApplicationInfo;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.util.PlatformUtils;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\022\020\004\032\004\030\0010\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/JvmElectricJuniorSupportProvider;", "Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupportProvider;", "<init>", "()V", "getSupport", "Lcom/intellij/ml/llm/matterhorn/ej/core/SupportWithReason;", "project", "Lcom/intellij/openapi/project/Project;", "ej-idea"})
/*    */ public final class JvmElectricJuniorSupportProvider implements ElectricJuniorSupportProvider {
/*    */   @Nullable
/*    */   public SupportWithReason getSupport(@NotNull Project project) {
/* 13 */     Intrinsics.checkNotNullParameter(project, "project"); if (Intrinsics.areEqual(PlatformUtils.getPlatformPrefix(), "AndroidStudio")) {
/* 14 */       return new SupportWithReason(new JvmElectricJuniorSupport(), "In Android Studio");
/*    */     }
/* 16 */     Intrinsics.checkNotNullExpressionValue(ApplicationInfo.getInstance().getVersionName(), "getVersionName(...)"); if (StringsKt.startsWith$default(ApplicationInfo.getInstance().getVersionName(), "IntelliJ", false, 2, null)) {
/* 17 */       return new SupportWithReason(new JvmElectricJuniorSupport(), "In IntelliJ Idea");
/*    */     }
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
/* 38 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\JvmElectricJuniorSupportProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */