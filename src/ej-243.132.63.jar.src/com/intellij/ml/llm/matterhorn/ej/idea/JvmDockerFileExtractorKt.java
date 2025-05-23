/*    */ package com.intellij.ml.llm.matterhorn.ej.idea;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.run.docker.DockerFile;
/*    */ import com.intellij.openapi.projectRoots.JavaSdkVersion;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\032\016\020\000\032\0020\0012\006\020\002\032\0020\003\032\016\020\004\032\0020\0052\006\020\002\032\0020\003¨\006\006"}, d2 = {"createDockerFileForJavaSdk", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/DockerFile;", "version", "Lcom/intellij/openapi/projectRoots/JavaSdkVersion;", "computeBaseImage", "", "ej-idea"})
/*    */ public final class JvmDockerFileExtractorKt
/*    */ {
/*    */   @NotNull
/*    */   public static final DockerFile createDockerFileForJavaSdk(@NotNull JavaSdkVersion version) {
/* 30 */     Intrinsics.checkNotNullParameter(version, "version"); String baseImage = computeBaseImage(version);
/* 31 */     return new DockerFile(
/* 32 */         baseImage, 
/* 33 */         CollectionsKt.emptyList(), 
/* 34 */         "[\"/bin/bash\"]");
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final String computeBaseImage(@NotNull JavaSdkVersion version) {
/* 39 */     Intrinsics.checkNotNullParameter(version, "version"); switch (WhenMappings.$EnumSwitchMapping$0[version.ordinal()]) { case 1: case 2: case 3: case 4: case 5: case 6: case 7:
/*    */       case 8:
/*    */       case 9:
/* 42 */        }  return "openjdk:" + version.getDescription() + "-jdk-slim";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\JvmDockerFileExtractorKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */