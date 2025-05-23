package org.jetbrains.jewel.foundation.lazy;

import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.jewel.foundation.lazy.tree.PointerEventActions;

@DebugMetadata(f = "SelectableLazyColumn.kt", l = {228}, i = {0}, s = {"L$0"}, n = {"$this$awaitPointerEventScope"}, m = "invokeSuspend", c = "org.jetbrains.jewel.foundation.lazy.SelectableLazyColumnKt$selectable$1$1")
@Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"})
final class null extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
  int label;
  
  null(FocusRequester $requester, PointerEventActions $actionHandler, SelectableColumnKeybindings $keybindings, SelectableLazyListState $selectableState, SelectionMode $selectionMode, List<SelectableLazyListKey> $allKeys, Object $itemKey, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #4
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 156, 0 -> 32, 1 -> 75
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield L$0 : Ljava/lang/Object;
    //   40: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
    //   43: astore_2
    //   44: nop
    //   45: aload_2
    //   46: aconst_null
    //   47: aload_0
    //   48: checkcast kotlin/coroutines/Continuation
    //   51: iconst_1
    //   52: aconst_null
    //   53: aload_0
    //   54: aload_2
    //   55: putfield L$0 : Ljava/lang/Object;
    //   58: aload_0
    //   59: iconst_1
    //   60: putfield label : I
    //   63: invokestatic awaitPointerEvent$default : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    //   66: dup
    //   67: aload #4
    //   69: if_acmpne -> 88
    //   72: aload #4
    //   74: areturn
    //   75: aload_0
    //   76: getfield L$0 : Ljava/lang/Object;
    //   79: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
    //   82: astore_2
    //   83: aload_1
    //   84: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   87: aload_1
    //   88: checkcast androidx/compose/ui/input/pointer/PointerEvent
    //   91: astore_3
    //   92: aload_3
    //   93: invokevirtual getType-7fucELk : ()I
    //   96: getstatic androidx/compose/ui/input/pointer/PointerEventType.Companion : Landroidx/compose/ui/input/pointer/PointerEventType$Companion;
    //   99: invokevirtual getPress-7fucELk : ()I
    //   102: invokestatic equals-impl0 : (II)Z
    //   105: ifeq -> 44
    //   108: aload_0
    //   109: getfield $requester : Landroidx/compose/ui/focus/FocusRequester;
    //   112: dup
    //   113: ifnull -> 122
    //   116: invokevirtual requestFocus : ()V
    //   119: goto -> 123
    //   122: pop
    //   123: aload_0
    //   124: getfield $actionHandler : Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;
    //   127: aload_3
    //   128: aload_0
    //   129: getfield $keybindings : Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;
    //   132: aload_0
    //   133: getfield $selectableState : Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
    //   136: aload_0
    //   137: getfield $selectionMode : Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;
    //   140: aload_0
    //   141: getfield $allKeys : Ljava/util/List;
    //   144: aload_0
    //   145: getfield $itemKey : Ljava/lang/Object;
    //   148: invokeinterface handlePointerEventPress : (Landroidx/compose/ui/input/pointer/PointerEvent;Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;Ljava/util/List;Ljava/lang/Object;)V
    //   153: goto -> 44
    //   156: new java/lang/IllegalStateException
    //   159: dup
    //   160: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   162: invokespecial <init> : (Ljava/lang/String;)V
    //   165: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #226	-> 3
    //   #227	-> 44
    //   #228	-> 45
    //   #226	-> 72
    //   #229	-> 92
    //   #230	-> 96
    //   #231	-> 108
    //   #232	-> 123
    //   #233	-> 127
    //   #234	-> 128
    //   #235	-> 132
    //   #236	-> 136
    //   #237	-> 140
    //   #238	-> 144
    //   #232	-> 148
    //   #226	-> 156
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   44	31	2	$this$awaitPointerEventScope	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    //   83	73	2	$this$awaitPointerEventScope	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    //   92	36	3	event	Landroidx/compose/ui/input/pointer/PointerEvent;
    //   0	166	0	this	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyColumnKt$selectable$1$1;
    //   36	120	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
    Object object = new Object(this.$requester, this.$actionHandler, this.$keybindings, this.$selectableState, this.$selectionMode, this.$allKeys, this.$itemKey, $completion);
    object.L$0 = value;
    return (Continuation<Unit>)object;
  }
  
  public final Object invoke(AwaitPointerEventScope p1, Continuation<?> p2) {
    return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\SelectableLazyColumnKt$selectable$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */