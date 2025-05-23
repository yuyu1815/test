package org.jetbrains.jewel.ui.component;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;

@DebugMetadata(f = "Scrollbar.kt", l = {610, 616, 618}, i = {0, 1, 1, 2, 2}, s = {"L$0", "L$0", "L$1", "L$0", "L$1"}, n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "$this$awaitEachGesture", "down"}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.ScrollbarKt$detectScrollViaTrackGestures$2")
@Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"})
final class ScrollbarKt$detectScrollViaTrackGestures$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
  Object L$1;
  
  int label;
  
  ScrollbarKt$detectScrollViaTrackGestures$2(TrackPressScroller $scroller, boolean $isVertical, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #5
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 310, 0 -> 40, 1 -> 83, 2 -> 162, 3 -> 225
    //   40: aload_1
    //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   44: aload_0
    //   45: getfield L$0 : Ljava/lang/Object;
    //   48: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
    //   51: astore_2
    //   52: aload_2
    //   53: iconst_0
    //   54: aconst_null
    //   55: aload_0
    //   56: checkcast kotlin/coroutines/Continuation
    //   59: iconst_3
    //   60: aconst_null
    //   61: aload_0
    //   62: aload_2
    //   63: putfield L$0 : Ljava/lang/Object;
    //   66: aload_0
    //   67: iconst_1
    //   68: putfield label : I
    //   71: invokestatic awaitFirstDown$default : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    //   74: dup
    //   75: aload #5
    //   77: if_acmpne -> 96
    //   80: aload #5
    //   82: areturn
    //   83: aload_0
    //   84: getfield L$0 : Ljava/lang/Object;
    //   87: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
    //   90: astore_2
    //   91: aload_1
    //   92: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   95: aload_1
    //   96: checkcast androidx/compose/ui/input/pointer/PointerInputChange
    //   99: astore_3
    //   100: aload_0
    //   101: getfield $scroller : Lorg/jetbrains/jewel/ui/component/TrackPressScroller;
    //   104: aload_3
    //   105: invokevirtual getPosition-F1C5BW0 : ()J
    //   108: aload_0
    //   109: getfield $isVertical : Z
    //   112: invokestatic access$detectScrollViaTrackGestures$onScrollAxis : (JZ)F
    //   115: invokevirtual onPress : (F)V
    //   118: nop
    //   119: aload_0
    //   120: getfield $isVertical : Z
    //   123: ifeq -> 189
    //   126: aload_2
    //   127: aload_3
    //   128: invokevirtual getId-J3iCeTQ : ()J
    //   131: aload_0
    //   132: checkcast kotlin/coroutines/Continuation
    //   135: aload_0
    //   136: aload_2
    //   137: putfield L$0 : Ljava/lang/Object;
    //   140: aload_0
    //   141: aload_3
    //   142: putfield L$1 : Ljava/lang/Object;
    //   145: aload_0
    //   146: iconst_2
    //   147: putfield label : I
    //   150: invokestatic awaitVerticalDragOrCancellation-rnUCldI : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   153: dup
    //   154: aload #5
    //   156: if_acmpne -> 183
    //   159: aload #5
    //   161: areturn
    //   162: aload_0
    //   163: getfield L$1 : Ljava/lang/Object;
    //   166: checkcast androidx/compose/ui/input/pointer/PointerInputChange
    //   169: astore_3
    //   170: aload_0
    //   171: getfield L$0 : Ljava/lang/Object;
    //   174: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
    //   177: astore_2
    //   178: aload_1
    //   179: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   182: aload_1
    //   183: checkcast androidx/compose/ui/input/pointer/PointerInputChange
    //   186: goto -> 249
    //   189: aload_2
    //   190: aload_3
    //   191: invokevirtual getId-J3iCeTQ : ()J
    //   194: aload_0
    //   195: checkcast kotlin/coroutines/Continuation
    //   198: aload_0
    //   199: aload_2
    //   200: putfield L$0 : Ljava/lang/Object;
    //   203: aload_0
    //   204: aload_3
    //   205: putfield L$1 : Ljava/lang/Object;
    //   208: aload_0
    //   209: iconst_3
    //   210: putfield label : I
    //   213: invokestatic awaitHorizontalDragOrCancellation-rnUCldI : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   216: dup
    //   217: aload #5
    //   219: if_acmpne -> 246
    //   222: aload #5
    //   224: areturn
    //   225: aload_0
    //   226: getfield L$1 : Ljava/lang/Object;
    //   229: checkcast androidx/compose/ui/input/pointer/PointerInputChange
    //   232: astore_3
    //   233: aload_0
    //   234: getfield L$0 : Ljava/lang/Object;
    //   237: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
    //   240: astore_2
    //   241: aload_1
    //   242: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   245: aload_1
    //   246: checkcast androidx/compose/ui/input/pointer/PointerInputChange
    //   249: astore #4
    //   251: aload #4
    //   253: ifnonnull -> 266
    //   256: aload_0
    //   257: getfield $scroller : Lorg/jetbrains/jewel/ui/component/TrackPressScroller;
    //   260: invokevirtual onGestureCancelled : ()V
    //   263: goto -> 306
    //   266: aload #4
    //   268: invokevirtual getPressed : ()Z
    //   271: ifne -> 284
    //   274: aload_0
    //   275: getfield $scroller : Lorg/jetbrains/jewel/ui/component/TrackPressScroller;
    //   278: invokevirtual onRelease : ()V
    //   281: goto -> 306
    //   284: aload_0
    //   285: getfield $scroller : Lorg/jetbrains/jewel/ui/component/TrackPressScroller;
    //   288: aload #4
    //   290: invokevirtual getPosition-F1C5BW0 : ()J
    //   293: aload_0
    //   294: getfield $isVertical : Z
    //   297: invokestatic access$detectScrollViaTrackGestures$onScrollAxis : (JZ)F
    //   300: invokevirtual onMovePressed : (F)V
    //   303: goto -> 118
    //   306: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   309: areturn
    //   310: new java/lang/IllegalStateException
    //   313: dup
    //   314: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   316: invokespecial <init> : (Ljava/lang/String;)V
    //   319: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #609	-> 3
    //   #610	-> 52
    //   #609	-> 80
    //   #611	-> 100
    //   #613	-> 118
    //   #615	-> 119
    //   #616	-> 126
    //   #609	-> 159
    //   #616	-> 183
    //   #618	-> 189
    //   #609	-> 222
    //   #615	-> 249
    //   #614	-> 249
    //   #621	-> 251
    //   #622	-> 256
    //   #623	-> 263
    //   #624	-> 266
    //   #625	-> 274
    //   #626	-> 281
    //   #628	-> 284
    //   #631	-> 306
    //   #609	-> 310
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   52	31	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    //   91	71	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    //   178	47	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    //   241	15	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    //   266	8	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    //   284	22	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
    //   100	62	3	down	Landroidx/compose/ui/input/pointer/PointerInputChange;
    //   170	55	3	down	Landroidx/compose/ui/input/pointer/PointerInputChange;
    //   233	23	3	down	Landroidx/compose/ui/input/pointer/PointerInputChange;
    //   266	8	3	down	Landroidx/compose/ui/input/pointer/PointerInputChange;
    //   284	22	3	down	Landroidx/compose/ui/input/pointer/PointerInputChange;
    //   251	52	4	drag	Landroidx/compose/ui/input/pointer/PointerInputChange;
    //   0	320	0	this	Lorg/jetbrains/jewel/ui/component/ScrollbarKt$detectScrollViaTrackGestures$2;
    //   44	266	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super ScrollbarKt$detectScrollViaTrackGestures$2> $completion) {
    ScrollbarKt$detectScrollViaTrackGestures$2 scrollbarKt$detectScrollViaTrackGestures$2 = new ScrollbarKt$detectScrollViaTrackGestures$2(this.$scroller, this.$isVertical, $completion);
    scrollbarKt$detectScrollViaTrackGestures$2.L$0 = value;
    return (Continuation<Unit>)scrollbarKt$detectScrollViaTrackGestures$2;
  }
  
  public final Object invoke(AwaitPointerEventScope p1, Continuation<?> p2) {
    return ((ScrollbarKt$detectScrollViaTrackGestures$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ScrollbarKt$detectScrollViaTrackGestures$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */