/*    */ package com.intellij.ml.llm.matterhorn.ej.idea;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.run.docker.ProjectDockerFileExtractor;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.projectRoots.JavaSdk;
/*    */ import com.intellij.openapi.projectRoots.JavaSdkVersion;
/*    */ import com.intellij.openapi.projectRoots.Sdk;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\004\032\0020\0052\006\020\006\032\0020\007H@¢\006\002\020\bJ\022\020\t\032\004\030\0010\n2\006\020\006\032\0020\007H\002¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/JvmDockerFileExtractor;", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/ProjectDockerFileExtractor;", "<init>", "()V", "createDockerFile", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/DockerFile;", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getJdk", "Lcom/intellij/openapi/projectRoots/JavaSdkVersion;", "ej-idea"})
/*    */ public final class JvmDockerFileExtractor implements ProjectDockerFileExtractor {
/*    */   @Nullable
/*    */   public Object createDockerFile(@NotNull Project project, @NotNull Continuation $completion) {
/* 13 */     if (getJdk(project) == null) getJdk(project);  JavaSdkVersion jdkVersion = 
/* 14 */       JavaSdkVersion.JDK_21;
/* 15 */     return JvmDockerFileExtractorKt.createDockerFileForJavaSdk(jdkVersion);
/*    */   }
/*    */   
/*    */   private final JavaSdkVersion getJdk(Project project) {
/* 19 */     Sdk projectSdk = ProjectRootManager.getInstance(project).getProjectSdk();
/* 20 */     if (projectSdk != null && projectSdk.getSdkType() instanceof JavaSdk) {
/* 21 */       Intrinsics.checkNotNull(projectSdk.getSdkType(), "null cannot be cast to non-null type com.intellij.openapi.projectRoots.JavaSdk"); JavaSdk javaSdk = (JavaSdk)projectSdk.getSdkType();
/* 22 */       JavaSdkVersion version = javaSdk.getVersion(projectSdk);
/* 23 */       return version;
/*    */     } 
/* 25 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\JvmDockerFileExtractor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */