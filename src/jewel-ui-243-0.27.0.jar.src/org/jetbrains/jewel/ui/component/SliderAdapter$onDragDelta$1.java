package org.jetbrains.jewel.ui.component;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "Scrollbar.kt", l = {727, 716}, i = {0, 1, 1, 1}, s = {"L$0", "L$0", "F$0", "D$0"}, n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "dragDelta", "sliderDelta"}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.SliderAdapter$onDragDelta$1")
@Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
@SourceDebugExtension({"SMAP\nScrollbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollbar.kt\norg/jetbrains/jewel/ui/component/SliderAdapter$onDragDelta$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,722:1\n116#2,10:723\n*S KotlinDebug\n*F\n+ 1 Scrollbar.kt\norg/jetbrains/jewel/ui/component/SliderAdapter$onDragDelta$1\n*L\n705#1:723,10\n*E\n"})
final class SliderAdapter$onDragDelta$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  Object L$0;
  
  Object L$1;
  
  long J$0;
  
  float F$0;
  
  double D$0;
  
  int label;
  
  SliderAdapter$onDragDelta$1(long $offset, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #22
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 368, 0 -> 36, 1 -> 108, 2 -> 274
    //   36: aload_1
    //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   40: aload_0
    //   41: getfield this$0 : Lorg/jetbrains/jewel/ui/component/SliderAdapter;
    //   44: invokestatic access$getDragMutex$p : (Lorg/jetbrains/jewel/ui/component/SliderAdapter;)Lkotlinx/coroutines/sync/Mutex;
    //   47: astore_2
    //   48: aload_0
    //   49: getfield this$0 : Lorg/jetbrains/jewel/ui/component/SliderAdapter;
    //   52: astore #4
    //   54: aload_0
    //   55: getfield $offset : J
    //   58: lstore #5
    //   60: aconst_null
    //   61: astore_3
    //   62: iconst_0
    //   63: istore #7
    //   65: nop
    //   66: aload_2
    //   67: aload_3
    //   68: aload_0
    //   69: checkcast kotlin/coroutines/Continuation
    //   72: aload_0
    //   73: aload_2
    //   74: putfield L$0 : Ljava/lang/Object;
    //   77: aload_0
    //   78: aload #4
    //   80: putfield L$1 : Ljava/lang/Object;
    //   83: aload_0
    //   84: lload #5
    //   86: putfield J$0 : J
    //   89: aload_0
    //   90: iconst_1
    //   91: putfield label : I
    //   94: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   99: dup
    //   100: aload #22
    //   102: if_acmpne -> 141
    //   105: aload #22
    //   107: areturn
    //   108: iconst_0
    //   109: istore #7
    //   111: aload_0
    //   112: getfield J$0 : J
    //   115: lstore #5
    //   117: aload_0
    //   118: getfield L$1 : Ljava/lang/Object;
    //   121: checkcast org/jetbrains/jewel/ui/component/SliderAdapter
    //   124: astore #4
    //   126: aconst_null
    //   127: astore_3
    //   128: aload_0
    //   129: getfield L$0 : Ljava/lang/Object;
    //   132: checkcast kotlinx/coroutines/sync/Mutex
    //   135: astore_2
    //   136: aload_1
    //   137: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   140: aload_1
    //   141: pop
    //   142: nop
    //   143: iconst_0
    //   144: istore #8
    //   146: aload #4
    //   148: invokestatic access$isVertical$p : (Lorg/jetbrains/jewel/ui/component/SliderAdapter;)Z
    //   151: ifeq -> 162
    //   154: lload #5
    //   156: invokestatic getY-impl : (J)F
    //   159: goto -> 167
    //   162: lload #5
    //   164: invokestatic getX-impl : (J)F
    //   167: fstore #9
    //   169: aload #4
    //   171: invokevirtual getAdapter : ()Landroidx/compose/foundation/v2/ScrollbarAdapter;
    //   174: invokestatic getMaxScrollOffset : (Landroidx/compose/foundation/v2/ScrollbarAdapter;)D
    //   177: aload #4
    //   179: invokestatic access$getScrollScale : (Lorg/jetbrains/jewel/ui/component/SliderAdapter;)D
    //   182: dmul
    //   183: dstore #10
    //   185: aload #4
    //   187: invokevirtual getPosition : ()D
    //   190: dstore #12
    //   192: dload #12
    //   194: fload #9
    //   196: f2d
    //   197: dadd
    //   198: aload #4
    //   200: invokestatic access$getUnscrolledDragDistance$p : (Lorg/jetbrains/jewel/ui/component/SliderAdapter;)D
    //   203: dadd
    //   204: dconst_0
    //   205: dload #10
    //   207: invokestatic coerceIn : (DDD)D
    //   210: dstore #14
    //   212: dload #14
    //   214: dload #12
    //   216: dsub
    //   217: dstore #16
    //   219: aload #4
    //   221: invokevirtual getPosition : ()D
    //   224: dload #16
    //   226: dadd
    //   227: dstore #18
    //   229: aload #4
    //   231: dload #18
    //   233: aload_0
    //   234: aload_0
    //   235: aload_2
    //   236: putfield L$0 : Ljava/lang/Object;
    //   239: aload_0
    //   240: aload #4
    //   242: putfield L$1 : Ljava/lang/Object;
    //   245: aload_0
    //   246: fload #9
    //   248: putfield F$0 : F
    //   251: aload_0
    //   252: dload #16
    //   254: putfield D$0 : D
    //   257: aload_0
    //   258: iconst_2
    //   259: putfield label : I
    //   262: invokestatic access$setPosition : (Lorg/jetbrains/jewel/ui/component/SliderAdapter;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   265: dup
    //   266: aload #22
    //   268: if_acmpne -> 317
    //   271: aload #22
    //   273: areturn
    //   274: iconst_0
    //   275: istore #7
    //   277: iconst_0
    //   278: istore #8
    //   280: aload_0
    //   281: getfield D$0 : D
    //   284: dstore #16
    //   286: aload_0
    //   287: getfield F$0 : F
    //   290: fstore #9
    //   292: aload_0
    //   293: getfield L$1 : Ljava/lang/Object;
    //   296: checkcast org/jetbrains/jewel/ui/component/SliderAdapter
    //   299: astore #4
    //   301: aconst_null
    //   302: astore_3
    //   303: aload_0
    //   304: getfield L$0 : Ljava/lang/Object;
    //   307: checkcast kotlinx/coroutines/sync/Mutex
    //   310: astore_2
    //   311: nop
    //   312: aload_1
    //   313: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   316: aload_1
    //   317: pop
    //   318: aload #4
    //   320: aload #4
    //   322: invokestatic access$getUnscrolledDragDistance$p : (Lorg/jetbrains/jewel/ui/component/SliderAdapter;)D
    //   325: fload #9
    //   327: f2d
    //   328: dload #16
    //   330: dsub
    //   331: dadd
    //   332: invokestatic access$setUnscrolledDragDistance$p : (Lorg/jetbrains/jewel/ui/component/SliderAdapter;D)V
    //   335: nop
    //   336: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   339: astore #20
    //   341: aload_2
    //   342: aload_3
    //   343: invokeinterface unlock : (Ljava/lang/Object;)V
    //   348: goto -> 363
    //   351: astore #21
    //   353: aload_2
    //   354: aload_3
    //   355: invokeinterface unlock : (Ljava/lang/Object;)V
    //   360: aload #21
    //   362: athrow
    //   363: nop
    //   364: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   367: areturn
    //   368: new java/lang/IllegalStateException
    //   371: dup
    //   372: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   374: invokespecial <init> : (Ljava/lang/String;)V
    //   377: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #702	-> 3
    //   #705	-> 40
    //   #723	-> 60
    //   #724	-> 65
    //   #727	-> 66
    //   #702	-> 105
    //   #728	-> 141
    //   #729	-> 143
    //   #706	-> 146
    //   #707	-> 169
    //   #708	-> 185
    //   #710	-> 192
    //   #709	-> 210
    //   #711	-> 212
    //   #715	-> 219
    //   #716	-> 229
    //   #702	-> 271
    //   #717	-> 317
    //   #718	-> 335
    //   #729	-> 339
    //   #731	-> 341
    //   #732	-> 348
    //   #731	-> 351
    //   #728	-> 363
    //   #719	-> 364
    //   #702	-> 368
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   60	48	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   136	138	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   311	25	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   336	12	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   351	13	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   62	46	3	owner$iv	Ljava/lang/Object;
    //   136	138	3	owner$iv	Ljava/lang/Object;
    //   311	25	3	owner$iv	Ljava/lang/Object;
    //   336	12	3	owner$iv	Ljava/lang/Object;
    //   351	13	3	owner$iv	Ljava/lang/Object;
    //   169	105	9	dragDelta	F
    //   292	44	9	dragDelta	F
    //   185	25	10	maxScrollPosition	D
    //   192	27	12	currentPosition	D
    //   212	7	14	targetPosition	D
    //   219	55	16	sliderDelta	D
    //   286	50	16	sliderDelta	D
    //   229	36	18	newPos	D
    //   146	128	8	$i$a$-withLock$default-SliderAdapter$onDragDelta$1$1	I
    //   65	43	7	$i$f$withLock	I
    //   0	378	0	this	Lorg/jetbrains/jewel/ui/component/SliderAdapter$onDragDelta$1;
    //   40	328	1	$result	Ljava/lang/Object;
    //   111	163	7	$i$f$withLock	I
    //   280	56	8	$i$a$-withLock$default-SliderAdapter$onDragDelta$1$1	I
    //   277	87	7	$i$f$withLock	I
    // Exception table:
    //   from	to	target	type
    //   142	265	351	finally
    //   311	341	351	finally
    //   351	353	351	finally
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super SliderAdapter$onDragDelta$1> $completion) {
    return (Continuation<Unit>)new SliderAdapter$onDragDelta$1(this.$offset, $completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((SliderAdapter$onDragDelta$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\SliderAdapter$onDragDelta$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */