/*    */ package com.intellij.ml.llm.matterhorn.ej.core.run.local;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ShellExecutor;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\030\0002\0020\001B\021\022\b\020\002\032\004\030\0010\003¢\006\004\b\004\020\005J\"\020\006\032\026\022\004\022\0020\b\022\f\022\n\030\0010\tj\004\030\001`\n0\007H@¢\006\002\020\013R\020\020\002\032\004\030\0010\003X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/run/local/LocalExecutionEnvironment;", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionEnvironment;", "shellExecutor", "Lcom/intellij/ml/llm/matterhorn/ShellExecutor;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ShellExecutor;)V", "getOrCreateSession", "Lcom/intellij/ml/llm/matterhorn/ej/core/Result;", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
/*    */ public final class LocalExecutionEnvironment implements ExecutionEnvironment {
/*  8 */   public LocalExecutionEnvironment(@Nullable ShellExecutor shellExecutor) { this.shellExecutor = shellExecutor; } @Nullable
/*    */   private final ShellExecutor shellExecutor; @Nullable
/*    */   public Object getOrCreateSession(@NotNull Continuation $completion) {
/* 11 */     return new Result.Ok(new LocalExecutionSession(this.shellExecutor));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\run\local\LocalExecutionEnvironment.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */