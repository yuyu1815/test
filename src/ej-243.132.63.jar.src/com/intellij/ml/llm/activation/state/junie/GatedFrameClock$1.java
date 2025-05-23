package com.intellij.ml.llm.activation.state.junie;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "Molecule.kt", l = {65}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.activation.state.junie.GatedFrameClock$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
final class null extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  Object L$0;
  
  int label;
  
  null(Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 119, 0 -> 32, 1 -> 76
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield this$0 : Lcom/intellij/ml/llm/activation/state/junie/GatedFrameClock;
    //   40: invokestatic access$getFrameSends$p : (Lcom/intellij/ml/llm/activation/state/junie/GatedFrameClock;)Lkotlinx/coroutines/channels/Channel;
    //   43: invokeinterface iterator : ()Lkotlinx/coroutines/channels/ChannelIterator;
    //   48: astore_2
    //   49: aload_2
    //   50: aload_0
    //   51: checkcast kotlin/coroutines/Continuation
    //   54: aload_0
    //   55: aload_2
    //   56: putfield L$0 : Ljava/lang/Object;
    //   59: aload_0
    //   60: iconst_1
    //   61: putfield label : I
    //   64: invokeinterface hasNext : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   69: dup
    //   70: aload_3
    //   71: if_acmpne -> 89
    //   74: aload_3
    //   75: areturn
    //   76: aload_0
    //   77: getfield L$0 : Ljava/lang/Object;
    //   80: checkcast kotlinx/coroutines/channels/ChannelIterator
    //   83: astore_2
    //   84: aload_1
    //   85: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   88: aload_1
    //   89: checkcast java/lang/Boolean
    //   92: invokevirtual booleanValue : ()Z
    //   95: ifeq -> 115
    //   98: aload_2
    //   99: invokeinterface next : ()Ljava/lang/Object;
    //   104: pop
    //   105: aload_0
    //   106: getfield this$0 : Lcom/intellij/ml/llm/activation/state/junie/GatedFrameClock;
    //   109: invokestatic access$sendFrame : (Lcom/intellij/ml/llm/activation/state/junie/GatedFrameClock;)V
    //   112: goto -> 49
    //   115: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   118: areturn
    //   119: new java/lang/IllegalStateException
    //   122: dup
    //   123: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   125: invokespecial <init> : (Ljava/lang/String;)V
    //   128: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #64	-> 3
    //   #65	-> 36
    //   #64	-> 74
    //   #65	-> 89
    //   #66	-> 115
    //   #64	-> 119
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	129	0	this	Lcom/intellij/ml/llm/activation/state/junie/GatedFrameClock$1;
    //   36	83	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
    return (Continuation<Unit>)new Object(GatedFrameClock.this, $completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\activation\state\junie\GatedFrameClock$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */