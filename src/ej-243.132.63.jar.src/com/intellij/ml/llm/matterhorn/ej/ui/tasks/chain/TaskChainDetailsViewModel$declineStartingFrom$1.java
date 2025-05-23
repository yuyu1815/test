package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain;

import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {286}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$declineStartingFrom$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
final class TaskChainDetailsViewModel$declineStartingFrom$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  int label;
  
  TaskChainDetailsViewModel$declineStartingFrom$1(TaskId $taskId, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 118, 0 -> 32, 1 -> 91
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;
    //   40: invokestatic access$getTaskService$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;)Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService;
    //   43: aload_0
    //   44: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;
    //   47: invokevirtual getLiveTaskChain : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskChain;
    //   50: invokeinterface getChain : ()Lkotlinx/coroutines/flow/StateFlow;
    //   55: invokeinterface getValue : ()Ljava/lang/Object;
    //   60: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity
    //   63: invokevirtual getId : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
    //   66: aload_0
    //   67: getfield $taskId : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
    //   70: aload_0
    //   71: checkcast kotlin/coroutines/Continuation
    //   74: aload_0
    //   75: iconst_1
    //   76: putfield label : I
    //   79: invokeinterface declineStartingFrom : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   84: dup
    //   85: aload_3
    //   86: if_acmpne -> 96
    //   89: aload_3
    //   90: areturn
    //   91: aload_1
    //   92: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   95: aload_1
    //   96: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService$DeclineStatus
    //   99: astore_2
    //   100: aload_2
    //   101: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService$DeclineStatus.NOTHING_LEFT : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService$DeclineStatus;
    //   104: if_acmpne -> 114
    //   107: aload_0
    //   108: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel;
    //   111: invokevirtual openMainPage : ()V
    //   114: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   117: areturn
    //   118: new java/lang/IllegalStateException
    //   121: dup
    //   122: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   124: invokespecial <init> : (Ljava/lang/String;)V
    //   127: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #285	-> 3
    //   #286	-> 36
    //   #285	-> 89
    //   #287	-> 100
    //   #288	-> 107
    //   #290	-> 114
    //   #285	-> 118
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   100	7	2	result	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService$DeclineStatus;
    //   0	128	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel$declineStartingFrom$1;
    //   36	82	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$declineStartingFrom$1> $completion) {
    return (Continuation<Unit>)new TaskChainDetailsViewModel$declineStartingFrom$1(this.$taskId, $completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((TaskChainDetailsViewModel$declineStartingFrom$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\TaskChainDetailsViewModel$declineStartingFrom$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */