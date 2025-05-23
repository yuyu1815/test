package com.intellij.ml.llm.matterhorn.ej.core;

import com.intellij.ml.llm.matterhorn.ExecutionContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "AbstractIssueSingleStepAgentWorker.kt", l = {379}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueSingleStepAgentWorker$produceArtifact$3")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
final class AbstractIssueSingleStepAgentWorker$produceArtifact$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  int label;
  
  AbstractIssueSingleStepAgentWorker$produceArtifact$3(AgentResponse $response, ExecutionContext $context, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 104, 0 -> 32, 1 -> 66
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: getstatic com/intellij/ml/llm/matterhorn/ej/core/summarization/StepSummarizer.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/summarization/StepSummarizer;
    //   39: aload_0
    //   40: getfield $response : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentResponse;
    //   43: aload_0
    //   44: getfield $context : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
    //   47: aload_0
    //   48: checkcast kotlin/coroutines/Continuation
    //   51: aload_0
    //   52: iconst_1
    //   53: putfield label : I
    //   56: invokevirtual createStepSummary : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentResponse;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   59: dup
    //   60: aload_3
    //   61: if_acmpne -> 71
    //   64: aload_3
    //   65: areturn
    //   66: aload_1
    //   67: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   70: aload_1
    //   71: checkcast java/lang/String
    //   74: astore_2
    //   75: aload_0
    //   76: getfield $context : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
    //   79: new com/intellij/ml/llm/matterhorn/ej/core/StepSummaryCreatedEvent
    //   82: dup
    //   83: aload_2
    //   84: aload_0
    //   85: getfield $context : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
    //   88: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
    //   91: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ArtifactId;)V
    //   94: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
    //   97: invokevirtual sendEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)V
    //   100: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   103: areturn
    //   104: new java/lang/IllegalStateException
    //   107: dup
    //   108: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   110: invokespecial <init> : (Ljava/lang/String;)V
    //   113: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #378	-> 3
    //   #379	-> 36
    //   #378	-> 64
    //   #380	-> 75
    //   #381	-> 79
    //   #382	-> 83
    //   #381	-> 91
    //   #380	-> 97
    //   #385	-> 100
    //   #378	-> 104
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   75	29	2	stepSummary	Ljava/lang/String;
    //   0	114	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$produceArtifact$3;
    //   36	68	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super AbstractIssueSingleStepAgentWorker$produceArtifact$3> $completion) {
    return (Continuation<Unit>)new AbstractIssueSingleStepAgentWorker$produceArtifact$3(this.$response, this.$context, $completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((AbstractIssueSingleStepAgentWorker$produceArtifact$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AbstractIssueSingleStepAgentWorker$produceArtifact$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */