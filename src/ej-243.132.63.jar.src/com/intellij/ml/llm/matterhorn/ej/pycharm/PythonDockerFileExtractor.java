/*    */ package com.intellij.ml.llm.matterhorn.ej.pycharm;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.run.docker.ProjectDockerFileExtractor;
/*    */ import java.util.ArrayList;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\004\032\0020\0052\006\020\006\032\0020\007H@¢\006\002\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/pycharm/PythonDockerFileExtractor;", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/ProjectDockerFileExtractor;", "<init>", "()V", "createDockerFile", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/DockerFile;", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-pycharm"})
/*    */ public final class PythonDockerFileExtractor implements ProjectDockerFileExtractor {
/*    */   @Nullable
/*    */   public Object createDockerFile(@NotNull Project project, @NotNull Continuation $completion) {
/* 10 */     ArrayList runCommands = new ArrayList();
/* 11 */     return new DockerFile(
/* 12 */         "continuumio/miniconda3", 
/* 13 */         runCommands, 
/* 14 */         "[\"/bin/bash\"]");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\pycharm\PythonDockerFileExtractor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */