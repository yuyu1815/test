package com.intellij.ml.llm.matterhorn.ej.ui.activation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "JunieActivationTransmitter.kt", l = {57}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.activation.JunieActivationStateListenerImpl$productActivationStateChanged$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
final class JunieActivationStateListenerImpl$productActivationStateChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  int label;
  
  JunieActivationStateListenerImpl$productActivationStateChanged$1(JunieGrazieLLMProxy $grazieLLMProxy, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #5
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 117, 0 -> 32, 1 -> 60
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: ldc2_w 3000
    //   39: aload_0
    //   40: checkcast kotlin/coroutines/Continuation
    //   43: aload_0
    //   44: iconst_1
    //   45: putfield label : I
    //   48: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   51: dup
    //   52: aload #5
    //   54: if_acmpne -> 65
    //   57: aload #5
    //   59: areturn
    //   60: aload_1
    //   61: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   64: aload_1
    //   65: pop
    //   66: aload_0
    //   67: getfield $grazieLLMProxy : Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieLLMProxy;
    //   70: invokevirtual getAuthService : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieAuthService;
    //   73: invokevirtual getAuthFacade : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade;
    //   76: astore_2
    //   77: aload_2
    //   78: invokevirtual getActivationState : ()Lkotlinx/coroutines/flow/StateFlow;
    //   81: invokeinterface getValue : ()Ljava/lang/Object;
    //   86: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation
    //   89: astore_3
    //   90: aload_3
    //   91: invokeinterface getOutcome-07x5Wys : ()Ljava/lang/Object;
    //   96: invokestatic incompleteOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Object;
    //   99: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationPending
    //   102: astore #4
    //   104: aload #4
    //   106: ifnull -> 113
    //   109: aload_2
    //   110: invokevirtual relogin : ()V
    //   113: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   116: areturn
    //   117: new java/lang/IllegalStateException
    //   120: dup
    //   121: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   123: invokespecial <init> : (Ljava/lang/String;)V
    //   126: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #56	-> 3
    //   #57	-> 36
    //   #56	-> 57
    //   #58	-> 65
    //   #59	-> 77
    //   #60	-> 90
    //   #61	-> 104
    //   #62	-> 109
    //   #64	-> 113
    //   #56	-> 117
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   77	36	2	authFacade	Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade;
    //   90	14	3	activation	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;
    //   104	5	4	activationPending	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationPending;
    //   0	127	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieActivationStateListenerImpl$productActivationStateChanged$1;
    //   36	81	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super JunieActivationStateListenerImpl$productActivationStateChanged$1> $completion) {
    return (Continuation<Unit>)new JunieActivationStateListenerImpl$productActivationStateChanged$1(this.$grazieLLMProxy, $completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((JunieActivationStateListenerImpl$productActivationStateChanged$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\activation\JunieActivationStateListenerImpl$productActivationStateChanged$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */