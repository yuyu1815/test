package com.intellij.ml.llm.matterhorn.ej.core;

import com.intellij.ml.llm.matterhorn.ExecutionContext;
import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@DebugMetadata(f = "AbstractMultiAgentWorker.kt", l = {178}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractMultiAgentWorker$produceArtifact$2")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\020\016\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", ""})
final class AbstractMultiAgentWorker$produceArtifact$2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
  int label;
  
  AbstractMultiAgentWorker$produceArtifact$2(AgentIssue $input, ExecutionContext $context, List<TaskResult> $reports, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #5
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 137, 0 -> 32, 1 -> 91
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield L$0 : Ljava/lang/Object;
    //   40: checkcast java/lang/String
    //   43: astore_2
    //   44: aload_0
    //   45: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractMultiAgentWorker;
    //   48: aload_2
    //   49: aload_0
    //   50: getfield $input : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
    //   53: aload_0
    //   54: getfield $context : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
    //   57: invokevirtual getSingleAgentRequest : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
    //   60: astore_3
    //   61: getstatic com/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor;
    //   64: aload_2
    //   65: aload_3
    //   66: aload_0
    //   67: getfield $context : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
    //   70: aload_0
    //   71: checkcast kotlin/coroutines/Continuation
    //   74: aload_0
    //   75: iconst_1
    //   76: putfield label : I
    //   79: invokevirtual executeInForkedEnvironment : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   82: dup
    //   83: aload #5
    //   85: if_acmpne -> 96
    //   88: aload #5
    //   90: areturn
    //   91: aload_1
    //   92: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   95: aload_1
    //   96: checkcast com/intellij/ml/llm/matterhorn/Artifact
    //   99: dup
    //   100: ifnull -> 112
    //   103: invokevirtual getContent : ()Ljava/lang/Object;
    //   106: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult
    //   109: goto -> 114
    //   112: pop
    //   113: aconst_null
    //   114: astore #4
    //   116: aload #4
    //   118: ifnull -> 133
    //   121: aload_0
    //   122: getfield $reports : Ljava/util/List;
    //   125: aload #4
    //   127: invokeinterface add : (Ljava/lang/Object;)Z
    //   132: pop
    //   133: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   136: areturn
    //   137: new java/lang/IllegalStateException
    //   140: dup
    //   141: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   143: invokespecial <init> : (Ljava/lang/String;)V
    //   146: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #176	-> 3
    //   #177	-> 44
    //   #178	-> 61
    //   #176	-> 88
    //   #178	-> 96
    //   #179	-> 116
    //   #180	-> 121
    //   #182	-> 133
    //   #176	-> 137
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   44	38	2	it	Ljava/lang/String;
    //   61	21	3	request	Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
    //   116	17	4	attempt	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;
    //   0	147	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractMultiAgentWorker$produceArtifact$2;
    //   36	101	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super AbstractMultiAgentWorker$produceArtifact$2> $completion) {
    AbstractMultiAgentWorker$produceArtifact$2 abstractMultiAgentWorker$produceArtifact$2 = new AbstractMultiAgentWorker$produceArtifact$2(this.$input, this.$context, this.$reports, $completion);
    abstractMultiAgentWorker$produceArtifact$2.L$0 = value;
    return (Continuation<Unit>)abstractMultiAgentWorker$produceArtifact$2;
  }
  
  public final Object invoke(String p1, Continuation<?> p2) {
    return ((AbstractMultiAgentWorker$produceArtifact$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AbstractMultiAgentWorker$produceArtifact$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */