/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ShellExecutor;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.project.ProjectUtil;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000 \n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\032,\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\0072\b\b\002\020\b\032\0020\t¨\006\n"}, d2 = {"launchBlockTerminalShellExecutor", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "project", "Lcom/intellij/openapi/project/Project;", "shellPath", "", "cancellationPolicy", "Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CancellationPolicy;", "ej-core"})
/*    */ public final class BlockTerminalShellExecutorKt
/*    */ {
/*    */   @NotNull
/*    */   public static final BlockTerminalShellExecutor launchBlockTerminalShellExecutor(@NotNull CoroutineScope scope, @NotNull Project project, @Nullable String shellPath, @NotNull ShellExecutor.CancellationPolicy cancellationPolicy) {
/*    */     String path;
/* 45 */     Intrinsics.checkNotNullParameter(scope, "scope"); Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(cancellationPolicy, "cancellationPolicy"); if (ProjectUtil.guessProjectDir(project) == null || ProjectUtil.guessProjectDir(project).getPath() == null) { ProjectUtil.guessProjectDir(project).getPath(); throw new IllegalStateException("Project root is expected"); }
/* 46 */      return new BlockTerminalShellExecutor(scope, project, path, shellPath, cancellationPolicy);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\BlockTerminalShellExecutorKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */