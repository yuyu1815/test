package com.intellij.ml.llm.matterhorn.ej.core;

import com.intellij.ml.llm.matterhorn.ej.core.actions.ActionRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@DebugMetadata(f = "AbstractIssueSingleStepAgentWorker.kt", l = {357, 357, 354}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueSingleStepAgentWorker$produceArtifact$agentActionExecutionResult$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\016\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""})
final class AbstractIssueSingleStepAgentWorker$produceArtifact$agentActionExecutionResult$1 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  int label;
  
  AbstractIssueSingleStepAgentWorker$produceArtifact$agentActionExecutionResult$1(ExecutionAgentContext $executionAgentContext, AbstractIssueSingleStepAgentWorker $receiver, AgentParameters $parameters, Continuation $completion) {
    super(1, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #7
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 318, 0 -> 40, 1 -> 104, 2 -> 202, 3 -> 312
    //   40: aload_1
    //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   44: getstatic com/intellij/ml/llm/matterhorn/ej/core/AgentAction.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion;
    //   47: aload_0
    //   48: getfield $actionToExecute : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
    //   51: aload_0
    //   52: getfield $executionAgentContext : Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
    //   55: astore #4
    //   57: astore_3
    //   58: astore_2
    //   59: aload_0
    //   60: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
    //   63: aload_0
    //   64: getfield $executionAgentContext : Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
    //   67: aload_0
    //   68: checkcast kotlin/coroutines/Continuation
    //   71: aload_0
    //   72: aload_2
    //   73: putfield L$0 : Ljava/lang/Object;
    //   76: aload_0
    //   77: aload_3
    //   78: putfield L$1 : Ljava/lang/Object;
    //   81: aload_0
    //   82: aload #4
    //   84: putfield L$2 : Ljava/lang/Object;
    //   87: aload_0
    //   88: iconst_1
    //   89: putfield label : I
    //   92: invokevirtual getAvailableActions : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   95: dup
    //   96: aload #7
    //   98: if_acmpne -> 134
    //   101: aload #7
    //   103: areturn
    //   104: aload_0
    //   105: getfield L$2 : Ljava/lang/Object;
    //   108: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
    //   111: astore #4
    //   113: aload_0
    //   114: getfield L$1 : Ljava/lang/Object;
    //   117: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
    //   120: astore_3
    //   121: aload_0
    //   122: getfield L$0 : Ljava/lang/Object;
    //   125: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion
    //   128: astore_2
    //   129: aload_1
    //   130: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   133: aload_1
    //   134: astore #5
    //   136: aload_2
    //   137: aload_3
    //   138: aload #4
    //   140: aload #5
    //   142: checkcast java/util/Collection
    //   145: astore #5
    //   147: astore #4
    //   149: astore_3
    //   150: astore_2
    //   151: aload_0
    //   152: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;
    //   155: aload_0
    //   156: getfield $executionAgentContext : Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
    //   159: aload_0
    //   160: checkcast kotlin/coroutines/Continuation
    //   163: aload_0
    //   164: aload_2
    //   165: putfield L$0 : Ljava/lang/Object;
    //   168: aload_0
    //   169: aload_3
    //   170: putfield L$1 : Ljava/lang/Object;
    //   173: aload_0
    //   174: aload #4
    //   176: putfield L$2 : Ljava/lang/Object;
    //   179: aload_0
    //   180: aload #5
    //   182: putfield L$3 : Ljava/lang/Object;
    //   185: aload_0
    //   186: iconst_2
    //   187: putfield label : I
    //   190: invokevirtual getHiddenActions : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   193: dup
    //   194: aload #7
    //   196: if_acmpne -> 241
    //   199: aload #7
    //   201: areturn
    //   202: aload_0
    //   203: getfield L$3 : Ljava/lang/Object;
    //   206: checkcast java/util/Collection
    //   209: astore #5
    //   211: aload_0
    //   212: getfield L$2 : Ljava/lang/Object;
    //   215: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
    //   218: astore #4
    //   220: aload_0
    //   221: getfield L$1 : Ljava/lang/Object;
    //   224: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
    //   227: astore_3
    //   228: aload_0
    //   229: getfield L$0 : Ljava/lang/Object;
    //   232: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion
    //   235: astore_2
    //   236: aload_1
    //   237: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   240: aload_1
    //   241: astore #6
    //   243: aload_2
    //   244: aload_3
    //   245: aload #4
    //   247: aload #5
    //   249: aload #6
    //   251: checkcast java/lang/Iterable
    //   254: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
    //   257: aload_0
    //   258: getfield $parameters : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
    //   261: invokevirtual getMaxCommandOutputLineLength : ()Ljava/lang/Integer;
    //   264: aload_0
    //   265: getfield $parameters : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
    //   268: invokevirtual getMaxCommandOutputLines : ()Ljava/lang/Integer;
    //   271: aload_0
    //   272: checkcast kotlin/coroutines/Continuation
    //   275: aload_0
    //   276: aconst_null
    //   277: putfield L$0 : Ljava/lang/Object;
    //   280: aload_0
    //   281: aconst_null
    //   282: putfield L$1 : Ljava/lang/Object;
    //   285: aload_0
    //   286: aconst_null
    //   287: putfield L$2 : Ljava/lang/Object;
    //   290: aload_0
    //   291: aconst_null
    //   292: putfield L$3 : Ljava/lang/Object;
    //   295: aload_0
    //   296: iconst_3
    //   297: putfield label : I
    //   300: invokevirtual executeActionRequest : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   303: dup
    //   304: aload #7
    //   306: if_acmpne -> 317
    //   309: aload #7
    //   311: areturn
    //   312: aload_1
    //   313: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   316: aload_1
    //   317: areturn
    //   318: new java/lang/IllegalStateException
    //   321: dup
    //   322: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   324: invokespecial <init> : (Ljava/lang/String;)V
    //   327: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #353	-> 3
    //   #354	-> 44
    //   #355	-> 47
    //   #356	-> 51
    //   #357	-> 59
    //   #353	-> 101
    //   #357	-> 134
    //   #353	-> 199
    //   #357	-> 241
    //   #358	-> 257
    //   #359	-> 264
    //   #354	-> 275
    //   #353	-> 309
    //   #360	-> 317
    //   #353	-> 318
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	328	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker$produceArtifact$agentActionExecutionResult$1;
    //   44	274	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Continuation<? super AbstractIssueSingleStepAgentWorker$produceArtifact$agentActionExecutionResult$1> $completion) {
    return (Continuation<Unit>)new AbstractIssueSingleStepAgentWorker$produceArtifact$agentActionExecutionResult$1(this.$executionAgentContext, AbstractIssueSingleStepAgentWorker.this, this.$parameters, $completion);
  }
  
  public final Object invoke(Continuation<?> p1) {
    return ((AbstractIssueSingleStepAgentWorker$produceArtifact$agentActionExecutionResult$1)create(p1)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AbstractIssueSingleStepAgentWorker$produceArtifact$agentActionExecutionResult$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */