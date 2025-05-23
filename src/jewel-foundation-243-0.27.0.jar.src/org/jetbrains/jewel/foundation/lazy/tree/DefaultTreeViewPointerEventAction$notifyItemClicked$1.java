package org.jetbrains.jewel.foundation.lazy.tree;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "KeyActions.kt", l = {200}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.foundation.lazy.tree.DefaultTreeViewPointerEventAction$notifyItemClicked$1")
@Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
final class DefaultTreeViewPointerEventAction$notifyItemClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  int label;
  
  DefaultTreeViewPointerEventAction$notifyItemClicked$1(DefaultTreeViewPointerEventAction $receiver, Tree.Element<T> $item, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 99, 0 -> 32, 1 -> 59
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield $doubleClickTimeDelayMillis : J
    //   40: aload_0
    //   41: checkcast kotlin/coroutines/Continuation
    //   44: aload_0
    //   45: iconst_1
    //   46: putfield label : I
    //   49: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   52: dup
    //   53: aload_2
    //   54: if_acmpne -> 64
    //   57: aload_2
    //   58: areturn
    //   59: aload_1
    //   60: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   63: aload_1
    //   64: pop
    //   65: aload_0
    //   66: getfield this$0 : Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewPointerEventAction;
    //   69: invokestatic access$getElementClickedTmpHolder$p : (Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewPointerEventAction;)Ljava/lang/Object;
    //   72: aload_0
    //   73: getfield $item : Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;
    //   76: invokeinterface getId : ()Ljava/lang/Object;
    //   81: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   84: ifeq -> 95
    //   87: aload_0
    //   88: getfield this$0 : Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewPointerEventAction;
    //   91: aconst_null
    //   92: invokestatic access$setElementClickedTmpHolder$p : (Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewPointerEventAction;Ljava/lang/Object;)V
    //   95: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   98: areturn
    //   99: new java/lang/IllegalStateException
    //   102: dup
    //   103: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   105: invokespecial <init> : (Ljava/lang/String;)V
    //   108: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #199	-> 3
    //   #200	-> 36
    //   #199	-> 57
    //   #201	-> 64
    //   #202	-> 95
    //   #199	-> 99
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	109	0	this	Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewPointerEventAction$notifyItemClicked$1;
    //   36	63	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super DefaultTreeViewPointerEventAction$notifyItemClicked$1> $completion) {
    return (Continuation<Unit>)new DefaultTreeViewPointerEventAction$notifyItemClicked$1(DefaultTreeViewPointerEventAction.this, this.$item, $completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((DefaultTreeViewPointerEventAction$notifyItemClicked$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\DefaultTreeViewPointerEventAction$notifyItemClicked$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */