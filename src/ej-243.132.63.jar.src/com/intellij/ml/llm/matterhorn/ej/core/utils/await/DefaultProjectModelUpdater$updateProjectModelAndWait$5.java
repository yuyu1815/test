package com.intellij.ml.llm.matterhorn.ej.core.utils.await;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "DefaultProjectModelUpdater.kt", l = {36}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.utils.await.DefaultProjectModelUpdater$updateProjectModelAndWait$5")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
final class DefaultProjectModelUpdater$updateProjectModelAndWait$5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  int label;
  
  DefaultProjectModelUpdater$updateProjectModelAndWait$5(Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 82, 0 -> 32, 1 -> 69
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: invokestatic getCurrentIndicators : ()Ljava/util/List;
    //   39: invokeinterface size : ()I
    //   44: ifeq -> 78
    //   47: ldc2_w 10
    //   50: aload_0
    //   51: checkcast kotlin/coroutines/Continuation
    //   54: aload_0
    //   55: iconst_1
    //   56: putfield label : I
    //   59: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   62: dup
    //   63: aload_2
    //   64: if_acmpne -> 74
    //   67: aload_2
    //   68: areturn
    //   69: aload_1
    //   70: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   73: aload_1
    //   74: pop
    //   75: goto -> 36
    //   78: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   81: areturn
    //   82: new java/lang/IllegalStateException
    //   85: dup
    //   86: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   88: invokespecial <init> : (Ljava/lang/String;)V
    //   91: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #34	-> 3
    //   #35	-> 36
    //   #36	-> 47
    //   #34	-> 67
    //   #36	-> 74
    //   #38	-> 78
    //   #34	-> 82
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	92	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/utils/await/DefaultProjectModelUpdater$updateProjectModelAndWait$5;
    //   36	46	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super DefaultProjectModelUpdater$updateProjectModelAndWait$5> $completion) {
    return (Continuation<Unit>)new DefaultProjectModelUpdater$updateProjectModelAndWait$5($completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((DefaultProjectModelUpdater$updateProjectModelAndWait$5)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\cor\\utils\await\DefaultProjectModelUpdater$updateProjectModelAndWait$5.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */