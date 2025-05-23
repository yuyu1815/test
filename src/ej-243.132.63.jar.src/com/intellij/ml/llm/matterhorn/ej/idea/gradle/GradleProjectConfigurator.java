/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.gradle;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.plugins.gradle.settings.GradleSettings;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\030\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH\026¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/gradle/GradleProjectConfigurator;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfigurator;", "<init>", "()V", "configureProjectSdk", "", "project", "Lcom/intellij/openapi/project/Project;", "javaHomeSdk", "Lcom/intellij/openapi/projectRoots/Sdk;", "ej-gradle"})
/*    */ @SourceDebugExtension({"SMAP\nGradleProjectConfigurator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GradleProjectConfigurator.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/gradle/GradleProjectConfigurator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,22:1\n1863#2,2:23\n*S KotlinDebug\n*F\n+ 1 GradleProjectConfigurator.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/gradle/GradleProjectConfigurator\n*L\n15#1:23,2\n*E\n"})
/*    */ public final class GradleProjectConfigurator implements IdeaProjectConfigurator {
/*    */   @Nullable
/*    */   public Object configureProject(@NotNull Project project, @NotNull List args, @NotNull Continuation $completion) {
/* 11 */     return IdeaProjectConfigurator.DefaultImpls.configureProject(this, project, args, $completion);
/*    */   } public void configureProjectSdk(@NotNull Project project, @NotNull Sdk javaHomeSdk) {
/* 13 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(javaHomeSdk, "javaHomeSdk"); IdeaProjectConfiguratorHelper.Companion.getLogger().info("GradleProjectConfigurator");
/* 14 */     Intrinsics.checkNotNullExpressionValue(GradleSettings.getInstance(project), "getInstance(...)"); GradleSettings settings = GradleSettings.getInstance(project);
/* 15 */     Intrinsics.checkNotNullExpressionValue(settings.getLinkedProjectsSettings(), "getLinkedProjectsSettings(...)"); Iterable $this$forEach$iv = settings.getLinkedProjectsSettings(); int $i$f$forEach = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 23 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); GradleProjectSettings gradleProjectSettings = (GradleProjectSettings)element$iv; int $i$a$-forEach-GradleProjectConfigurator$configureProjectSdk$1 = 0;
/*    */       String it = javaHomeSdk.getName();
/*    */       int $i$a$-let-GradleProjectConfigurator$configureProjectSdk$1$1 = 0;
/*    */       IdeaProjectConfiguratorHelper.Companion.getLogger().info("GradleProjectConfigurator: setting gradleJvm to " + it);
/*    */       gradleProjectSettings.setGradleJvm(it); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\gradle\GradleProjectConfigurator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */