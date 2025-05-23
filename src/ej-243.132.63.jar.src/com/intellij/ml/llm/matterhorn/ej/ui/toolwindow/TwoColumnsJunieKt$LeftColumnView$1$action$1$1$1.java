package com.intellij.ml.llm.matterhorn.ej.ui.toolwindow;

import com.intellij.ml.llm.matterhorn.ej.core.JuniePreconditionChecker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "TwoColumnsJunie.kt", l = {119}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.TwoColumnsJunieKt$LeftColumnView$1$action$1$1$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
final class TwoColumnsJunieKt$LeftColumnView$1$action$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  int label;
  
  TwoColumnsJunieKt$LeftColumnView$1$action$1$1$1(JuniePreconditionChecker.JunieProblem $it, Function0<Unit> $onJunieProblemRefresh, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 92, 0 -> 32, 1 -> 65
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield $it : Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem;
    //   40: invokevirtual getAction : ()Lkotlin/jvm/functions/Function1;
    //   43: dup
    //   44: ifnull -> 77
    //   47: aload_0
    //   48: aload_0
    //   49: iconst_1
    //   50: putfield label : I
    //   53: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   58: dup
    //   59: aload_2
    //   60: if_acmpne -> 70
    //   63: aload_2
    //   64: areturn
    //   65: aload_1
    //   66: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   69: aload_1
    //   70: checkcast java/lang/Boolean
    //   73: pop
    //   74: goto -> 78
    //   77: pop
    //   78: aload_0
    //   79: getfield $onJunieProblemRefresh : Lkotlin/jvm/functions/Function0;
    //   82: invokeinterface invoke : ()Ljava/lang/Object;
    //   87: pop
    //   88: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   91: areturn
    //   92: new java/lang/IllegalStateException
    //   95: dup
    //   96: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   98: invokespecial <init> : (Ljava/lang/String;)V
    //   101: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #118	-> 3
    //   #119	-> 36
    //   #118	-> 63
    //   #119	-> 70
    //   #120	-> 78
    //   #121	-> 88
    //   #118	-> 92
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	102	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/TwoColumnsJunieKt$LeftColumnView$1$action$1$1$1;
    //   36	56	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super TwoColumnsJunieKt$LeftColumnView$1$action$1$1$1> $completion) {
    return (Continuation<Unit>)new TwoColumnsJunieKt$LeftColumnView$1$action$1$1$1(this.$it, this.$onJunieProblemRefresh, $completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((TwoColumnsJunieKt$LeftColumnView$1$action$1$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\toolwindow\TwoColumnsJunieKt$LeftColumnView$1$action$1$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */