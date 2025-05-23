package com.intellij.ml.llm.matterhorn.ej.core.tasks;

import com.intellij.ml.llm.matterhorn.ej.core.HumanInLoopRequest;
import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainEntity;
import kotlin.Metadata;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\bf\030\0002\0020\001R\030\020\002\032\b\022\004\022\0020\0040\003X¦\004¢\006\006\032\004\b\005\020\006R\036\020\007\032\016\022\n\022\b\022\004\022\0020\t0\b0\003X¦\004¢\006\006\032\004\b\n\020\006R\032\020\013\032\n\022\006\022\004\030\0010\f0\003X¦\004¢\006\006\032\004\b\r\020\006R\032\020\016\032\n\022\006\022\004\030\0010\0170\003X¦\004¢\006\006\032\004\b\020\020\006R\032\020\021\032\n\022\006\022\004\030\0010\0220\003X¦\004¢\006\006\032\004\b\023\020\006R\030\020\024\032\b\022\004\022\0020\0250\003X¦\004¢\006\006\032\004\b\026\020\006¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskChain;", "", "chain", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;", "getChain", "()Lkotlinx/coroutines/flow/StateFlow;", "tasks", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;", "getTasks", "currentJob", "Lkotlinx/coroutines/Job;", "getCurrentJob", "humanInLoopRequest", "Lcom/intellij/ml/llm/matterhorn/ej/core/HumanInLoopRequest;", "getHumanInLoopRequest", "progress", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/ProgressEntity;", "getProgress", "terminalState", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState;", "getTerminalState", "ej-core"})
public interface LiveTaskChain {
  @NotNull
  StateFlow<TaskChainEntity> getChain();
  
  @NotNull
  StateFlow<PersistentList<LiveTaskSnapshot>> getTasks();
  
  @NotNull
  StateFlow<Job> getCurrentJob();
  
  @NotNull
  StateFlow<HumanInLoopRequest> getHumanInLoopRequest();
  
  @NotNull
  StateFlow<ProgressEntity> getProgress();
  
  @NotNull
  StateFlow<TerminalState> getTerminalState();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\LiveTaskChain.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */