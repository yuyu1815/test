package com.intellij.ml.llm.matterhorn.ej.ui.debug;

import androidx.compose.foundation.lazy.LazyListState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "DebugEventsPage.kt", l = {180}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.debug.DebugEventsPageKt$EventTreeView$1$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
final class DebugEventsPageKt$EventTreeView$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  int label;
  
  DebugEventsPageKt$EventTreeView$1$1(List<EventNode> $nodes, LazyListState $listState, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 106, 0 -> 32, 1 -> 96
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield $nodes : Ljava/util/List;
    //   40: checkcast java/util/Collection
    //   43: invokeinterface isEmpty : ()Z
    //   48: ifne -> 55
    //   51: iconst_1
    //   52: goto -> 56
    //   55: iconst_0
    //   56: ifeq -> 102
    //   59: aload_0
    //   60: getfield $listState : Landroidx/compose/foundation/lazy/LazyListState;
    //   63: aload_0
    //   64: getfield $nodes : Ljava/util/List;
    //   67: invokeinterface size : ()I
    //   72: iconst_1
    //   73: isub
    //   74: iconst_0
    //   75: aload_0
    //   76: checkcast kotlin/coroutines/Continuation
    //   79: iconst_2
    //   80: aconst_null
    //   81: aload_0
    //   82: iconst_1
    //   83: putfield label : I
    //   86: invokestatic animateScrollToItem$default : (Landroidx/compose/foundation/lazy/LazyListState;IILkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    //   89: dup
    //   90: aload_2
    //   91: if_acmpne -> 101
    //   94: aload_2
    //   95: areturn
    //   96: aload_1
    //   97: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   100: aload_1
    //   101: pop
    //   102: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   105: areturn
    //   106: new java/lang/IllegalStateException
    //   109: dup
    //   110: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   112: invokespecial <init> : (Ljava/lang/String;)V
    //   115: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #178	-> 3
    //   #179	-> 36
    //   #179	-> 56
    //   #180	-> 59
    //   #178	-> 94
    //   #182	-> 101
    //   #178	-> 106
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	116	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/DebugEventsPageKt$EventTreeView$1$1;
    //   36	70	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super DebugEventsPageKt$EventTreeView$1$1> $completion) {
    return (Continuation<Unit>)new DebugEventsPageKt$EventTreeView$1$1(this.$nodes, this.$listState, $completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((DebugEventsPageKt$EventTreeView$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\debug\DebugEventsPageKt$EventTreeView$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */