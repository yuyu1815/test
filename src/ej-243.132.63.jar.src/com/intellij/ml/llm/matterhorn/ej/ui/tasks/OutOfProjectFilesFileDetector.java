/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks;
/*    */ import java.nio.file.Path;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003J\036\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH@¢\006\002\020\n¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/OutOfProjectFilesFileDetector;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SensitiveFileDetector;", "<init>", "()V", "isSensitiveFile", "", "project", "Lcom/intellij/openapi/project/Project;", "path", "Ljava/nio/file/Path;", "(Lcom/intellij/openapi/project/Project;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class OutOfProjectFilesFileDetector implements SensitiveFileDetector {
/*    */   @Nullable
/*    */   public Object isSensitiveFile(@NotNull Project project, @NotNull Path path, @NotNull Continuation $completion) {
/* 10 */     return Boxing.boxBoolean(!path.startsWith(JunieProjectPersistentStateComponentKt.getJunieProjectPath(project)));
/*    */   }
/*    */   
/*    */   public static final int $stable;
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\OutOfProjectFilesFileDetector.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */