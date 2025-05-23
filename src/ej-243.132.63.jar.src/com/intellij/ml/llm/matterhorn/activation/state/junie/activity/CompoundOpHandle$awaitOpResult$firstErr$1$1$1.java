package com.intellij.ml.llm.matterhorn.activation.state.junie.activity;

import com.intellij.ml.llm.matterhorn.activation.state.model.OpHandle;
import com.intellij.ml.llm.matterhorn.activation.state.model.OpResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;

@DebugMetadata(f = "CompoundOpHandle.kt", l = {17, 18}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.activity.CompoundOpHandle$awaitOpResult$firstErr$1$1$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
final class CompoundOpHandle$awaitOpResult$firstErr$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  int label;
  
  CompoundOpHandle$awaitOpResult$firstErr$1$1$1(OpHandle<Err> $handle, ProducerScope<OpResult<? extends Err, ?>> $$this$channelFlow, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 117, 0 -> 36, 1 -> 65, 2 -> 107
    //   36: aload_1
    //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   40: aload_0
    //   41: getfield $handle : Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpHandle;
    //   44: aload_0
    //   45: checkcast kotlin/coroutines/Continuation
    //   48: aload_0
    //   49: iconst_1
    //   50: putfield label : I
    //   53: invokeinterface awaitOpResult : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   58: dup
    //   59: aload_3
    //   60: if_acmpne -> 70
    //   63: aload_3
    //   64: areturn
    //   65: aload_1
    //   66: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   69: aload_1
    //   70: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/OpResult
    //   73: astore_2
    //   74: aload_2
    //   75: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted$OpSucceeded
    //   78: ifne -> 113
    //   81: aload_0
    //   82: getfield $$this$channelFlow : Lkotlinx/coroutines/channels/ProducerScope;
    //   85: aload_2
    //   86: aload_0
    //   87: checkcast kotlin/coroutines/Continuation
    //   90: aload_0
    //   91: iconst_2
    //   92: putfield label : I
    //   95: invokeinterface send : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   100: dup
    //   101: aload_3
    //   102: if_acmpne -> 112
    //   105: aload_3
    //   106: areturn
    //   107: aload_1
    //   108: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   111: aload_1
    //   112: pop
    //   113: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   116: areturn
    //   117: new java/lang/IllegalStateException
    //   120: dup
    //   121: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   123: invokespecial <init> : (Ljava/lang/String;)V
    //   126: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #16	-> 3
    //   #17	-> 40
    //   #16	-> 63
    //   #18	-> 74
    //   #16	-> 105
    //   #19	-> 112
    //   #16	-> 117
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   74	26	2	opResult	Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;
    //   0	127	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/CompoundOpHandle$awaitOpResult$firstErr$1$1$1;
    //   40	77	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super CompoundOpHandle$awaitOpResult$firstErr$1$1$1> $completion) {
    return (Continuation<Unit>)new CompoundOpHandle$awaitOpResult$firstErr$1$1$1(this.$handle, this.$$this$channelFlow, $completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((CompoundOpHandle$awaitOpResult$firstErr$1$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\activity\CompoundOpHandle$awaitOpResult$firstErr$1$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */