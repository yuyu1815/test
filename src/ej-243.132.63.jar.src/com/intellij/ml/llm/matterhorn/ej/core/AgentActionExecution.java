package com.intellij.ml.llm.matterhorn.ej.core;

import com.intellij.ml.llm.matterhorn.ExecutionContext;
import com.intellij.ml.llm.matterhorn.ej.core.actions.ActionRequest;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J<\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\034\020\n\032\030\b\001\022\n\022\b\022\004\022\0020\0050\f\022\006\022\004\030\0010\0010\013H@¢\006\002\020\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AgentActionExecution;", "", "<init>", "()V", "withEventsLogging", "", "executionContext", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "actionRequest", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "body", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
public final class AgentActionExecution {
  @NotNull
  public static final AgentActionExecution INSTANCE = new AgentActionExecution();
  
  @Nullable
  public final Object withEventsLogging(@NotNull ExecutionContext executionContext, @NotNull ActionRequest actionRequest, @NotNull Function1 body, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload #4
    //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/AgentActionExecution$withEventsLogging$1
    //   5: ifeq -> 41
    //   8: aload #4
    //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentActionExecution$withEventsLogging$1
    //   13: astore #8
    //   15: aload #8
    //   17: getfield label : I
    //   20: ldc -2147483648
    //   22: iand
    //   23: ifeq -> 41
    //   26: aload #8
    //   28: dup
    //   29: getfield label : I
    //   32: ldc -2147483648
    //   34: isub
    //   35: putfield label : I
    //   38: goto -> 53
    //   41: new com/intellij/ml/llm/matterhorn/ej/core/AgentActionExecution$withEventsLogging$1
    //   44: dup
    //   45: aload_0
    //   46: aload #4
    //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentActionExecution;Lkotlin/coroutines/Continuation;)V
    //   51: astore #8
    //   53: aload #8
    //   55: getfield result : Ljava/lang/Object;
    //   58: astore #7
    //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   63: astore #9
    //   65: aload #8
    //   67: getfield label : I
    //   70: tableswitch default -> 230, 0 -> 92, 1 -> 148
    //   92: aload #7
    //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   97: nop
    //   98: aload_1
    //   99: new com/intellij/ml/llm/matterhorn/ej/core/AgentActionExecutionStarted
    //   102: dup
    //   103: aload_2
    //   104: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;)V
    //   107: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
    //   110: invokevirtual sendEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)V
    //   113: aload_3
    //   114: aload #8
    //   116: aload #8
    //   118: aload_1
    //   119: putfield L$0 : Ljava/lang/Object;
    //   122: aload #8
    //   124: aload_2
    //   125: putfield L$1 : Ljava/lang/Object;
    //   128: aload #8
    //   130: iconst_1
    //   131: putfield label : I
    //   134: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   139: dup
    //   140: aload #9
    //   142: if_acmpne -> 174
    //   145: aload #9
    //   147: areturn
    //   148: aload #8
    //   150: getfield L$1 : Ljava/lang/Object;
    //   153: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
    //   156: astore_2
    //   157: aload #8
    //   159: getfield L$0 : Ljava/lang/Object;
    //   162: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
    //   165: astore_1
    //   166: nop
    //   167: aload #7
    //   169: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   172: aload #7
    //   174: checkcast java/lang/String
    //   177: astore #5
    //   179: aload_1
    //   180: new com/intellij/ml/llm/matterhorn/ej/core/AgentActionExecutionFinished
    //   183: dup
    //   184: aload_2
    //   185: aload #5
    //   187: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Ljava/lang/String;)V
    //   190: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
    //   193: invokevirtual sendEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)V
    //   196: aload #5
    //   198: areturn
    //   199: astore #6
    //   201: aload_1
    //   202: new com/intellij/ml/llm/matterhorn/ej/core/AgentActionExecutionFailed
    //   205: dup
    //   206: aload_2
    //   207: getstatic com/intellij/ml/llm/matterhorn/events/SerializableThrowable.Companion : Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable$Companion;
    //   210: aload #6
    //   212: checkcast java/lang/Throwable
    //   215: invokevirtual withStacktrace : (Ljava/lang/Throwable;)Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;
    //   218: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;)V
    //   221: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
    //   224: invokevirtual sendEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)V
    //   227: aload #6
    //   229: athrow
    //   230: new java/lang/IllegalStateException
    //   233: dup
    //   234: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   236: invokespecial <init> : (Ljava/lang/String;)V
    //   239: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #73	-> 63
    //   #78	-> 97
    //   #79	-> 98
    //   #80	-> 113
    //   #73	-> 145
    //   #81	-> 179
    //   #82	-> 196
    //   #83	-> 199
    //   #84	-> 201
    //   #85	-> 227
    //   #73	-> 230
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   97	51	1	executionContext	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
    //   166	33	1	executionContext	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
    //   199	31	1	executionContext	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
    //   97	51	2	actionRequest	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
    //   157	42	2	actionRequest	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
    //   199	31	2	actionRequest	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
    //   97	42	3	body	Lkotlin/jvm/functions/Function1;
    //   179	20	5	result	Ljava/lang/String;
    //   201	29	6	e	Ljava/lang/Exception;
    //   0	240	4	$completion	Lkotlin/coroutines/Continuation;
    //   53	177	8	$continuation	Lkotlin/coroutines/Continuation;
    //   60	170	7	$result	Ljava/lang/Object;
    // Exception table:
    //   from	to	target	type
    //   97	139	199	java/lang/Exception
    //   166	199	199	java/lang/Exception
  }
  
  @DebugMetadata(f = "Events.kt", l = {80}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"executionContext", "actionRequest"}, m = "withEventsLogging", c = "com.intellij.ml.llm.matterhorn.ej.core.AgentActionExecution")
  @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
  static final class AgentActionExecution$withEventsLogging$1 extends ContinuationImpl {
    Object L$0;
    
    Object L$1;
    
    int label;
    
    AgentActionExecution$withEventsLogging$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return AgentActionExecution.this.withEventsLogging(null, null, null, (Continuation<? super String>)this);
    }
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AgentActionExecution.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */