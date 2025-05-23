package org.jetbrains.jewel.ui.component;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "Scrollbar.kt", l = {547, 548, 550, 551}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.TrackPressScroller$startScrollingByPage$1")
@Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
final class TrackPressScroller$startScrollingByPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  int label;
  
  TrackPressScroller$startScrollingByPage$1(Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 165, 0 -> 44, 1 -> 71, 2 -> 99, 3 -> 128, 4 -> 156
    //   44: aload_1
    //   45: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   48: aload_0
    //   49: getfield this$0 : Lorg/jetbrains/jewel/ui/component/TrackPressScroller;
    //   52: aload_0
    //   53: checkcast kotlin/coroutines/Continuation
    //   56: aload_0
    //   57: iconst_1
    //   58: putfield label : I
    //   61: invokestatic access$scrollTowardsCurrentOffset : (Lorg/jetbrains/jewel/ui/component/TrackPressScroller;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   64: dup
    //   65: aload_2
    //   66: if_acmpne -> 76
    //   69: aload_2
    //   70: areturn
    //   71: aload_1
    //   72: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   75: aload_1
    //   76: pop
    //   77: ldc2_w 300
    //   80: aload_0
    //   81: checkcast kotlin/coroutines/Continuation
    //   84: aload_0
    //   85: iconst_2
    //   86: putfield label : I
    //   89: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   92: dup
    //   93: aload_2
    //   94: if_acmpne -> 104
    //   97: aload_2
    //   98: areturn
    //   99: aload_1
    //   100: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   103: aload_1
    //   104: pop
    //   105: aload_0
    //   106: getfield this$0 : Lorg/jetbrains/jewel/ui/component/TrackPressScroller;
    //   109: aload_0
    //   110: checkcast kotlin/coroutines/Continuation
    //   113: aload_0
    //   114: iconst_3
    //   115: putfield label : I
    //   118: invokestatic access$scrollTowardsCurrentOffset : (Lorg/jetbrains/jewel/ui/component/TrackPressScroller;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   121: dup
    //   122: aload_2
    //   123: if_acmpne -> 133
    //   126: aload_2
    //   127: areturn
    //   128: aload_1
    //   129: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   132: aload_1
    //   133: pop
    //   134: ldc2_w 100
    //   137: aload_0
    //   138: checkcast kotlin/coroutines/Continuation
    //   141: aload_0
    //   142: iconst_4
    //   143: putfield label : I
    //   146: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   149: dup
    //   150: aload_2
    //   151: if_acmpne -> 161
    //   154: aload_2
    //   155: areturn
    //   156: aload_1
    //   157: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   160: aload_1
    //   161: pop
    //   162: goto -> 105
    //   165: new java/lang/IllegalStateException
    //   168: dup
    //   169: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   171: invokespecial <init> : (Ljava/lang/String;)V
    //   174: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #546	-> 3
    //   #547	-> 48
    //   #546	-> 69
    //   #548	-> 76
    //   #546	-> 97
    //   #549	-> 104
    //   #550	-> 105
    //   #546	-> 126
    //   #551	-> 133
    //   #546	-> 154
    //   #551	-> 161
    //   #546	-> 165
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	175	0	this	Lorg/jetbrains/jewel/ui/component/TrackPressScroller$startScrollingByPage$1;
    //   48	117	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super TrackPressScroller$startScrollingByPage$1> $completion) {
    return (Continuation<Unit>)new TrackPressScroller$startScrollingByPage$1($completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((TrackPressScroller$startScrollingByPage$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\TrackPressScroller$startScrollingByPage$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */