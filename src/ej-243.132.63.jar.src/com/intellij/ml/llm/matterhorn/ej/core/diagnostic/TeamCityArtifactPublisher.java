/*    */ package com.intellij.ml.llm.matterhorn.ej.core.diagnostic;
/*    */ 
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\020\016\n\002\b\002\bÂ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\026\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\007¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/diagnostic/TeamCityArtifactPublisher;", "", "<init>", "()V", "publishArtifact", "", "filePath", "", "artifactPath", "ej-core"})
/*    */ final class TeamCityArtifactPublisher
/*    */ {
/*    */   @NotNull
/*    */   public static final TeamCityArtifactPublisher INSTANCE = new TeamCityArtifactPublisher();
/*    */   
/*    */   public final void publishArtifact(@NotNull String filePath, @NotNull String artifactPath) {
/* 22 */     Intrinsics.checkNotNullParameter(filePath, "filePath"); Intrinsics.checkNotNullParameter(artifactPath, "artifactPath"); System.out.println("##teamcity[publishArtifacts '" + filePath + " => " + artifactPath + "']");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\diagnostic\TeamCityArtifactPublisher.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */