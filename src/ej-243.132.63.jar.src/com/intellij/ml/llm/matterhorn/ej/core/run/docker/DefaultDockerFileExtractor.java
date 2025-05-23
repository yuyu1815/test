/*    */ package com.intellij.ml.llm.matterhorn.ej.core.run.docker;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\004\032\0020\0052\006\020\006\032\0020\007H@¢\006\002\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/DefaultDockerFileExtractor;", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/ProjectDockerFileExtractor;", "<init>", "()V", "createDockerFile", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/DockerFile;", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
/*    */ public final class DefaultDockerFileExtractor implements ProjectDockerFileExtractor {
/*    */   @Nullable
/*    */   public Object createDockerFile(@NotNull Project project, @NotNull Continuation $completion) {
/* 10 */     return new DockerFile(
/* 11 */         "alpine:latest", 
/* 12 */         CollectionsKt.listOf(
/* 13 */           new DockerfileCommand(DockerfileCommandType.Run, "apk add --no-cache bash")), 
/*    */         
/* 15 */         "[\"/bin/bash\"]");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\run\docker\DefaultDockerFileExtractor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */