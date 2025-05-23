package org.jetbrains.jewel.foundation.lazy.tree;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

@DebugMetadata(f = "Tree.kt", l = {125, 128}, i = {0, 0, 1, 1}, s = {"L$0", "L$1", "L$0", "L$1"}, n = {"$this$iterator", "current", "$this$iterator", "current"}, m = "invokeSuspend", c = "org.jetbrains.jewel.foundation.lazy.tree.TreeKt$elementIterator$1")
@Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001\"\004\b\000\020\002*\016\022\n\022\b\022\004\022\002H\0020\0040\003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;"})
final class TreeKt$elementIterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Tree.Element<T>>, Continuation<? super Unit>, Object> {
  Object L$1;
  
  int label;
  
  TreeKt$elementIterator$1(Tree.Element<T> $initial, Function1<Tree.Element<T>, Tree.Element<T>> $next, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #4
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 201, 0 -> 36, 1 -> 95, 2 -> 172
    //   36: aload_1
    //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   40: aload_0
    //   41: getfield L$0 : Ljava/lang/Object;
    //   44: checkcast kotlin/sequences/SequenceScope
    //   47: astore_2
    //   48: aload_0
    //   49: getfield $initial : Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;
    //   52: dup
    //   53: ifnonnull -> 61
    //   56: pop
    //   57: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   60: areturn
    //   61: astore_3
    //   62: aload_2
    //   63: aload_3
    //   64: aload_0
    //   65: checkcast kotlin/coroutines/Continuation
    //   68: aload_0
    //   69: aload_2
    //   70: putfield L$0 : Ljava/lang/Object;
    //   73: aload_0
    //   74: aload_3
    //   75: putfield L$1 : Ljava/lang/Object;
    //   78: aload_0
    //   79: iconst_1
    //   80: putfield label : I
    //   83: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   86: dup
    //   87: aload #4
    //   89: if_acmpne -> 116
    //   92: aload #4
    //   94: areturn
    //   95: aload_0
    //   96: getfield L$1 : Ljava/lang/Object;
    //   99: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element
    //   102: astore_3
    //   103: aload_0
    //   104: getfield L$0 : Ljava/lang/Object;
    //   107: checkcast kotlin/sequences/SequenceScope
    //   110: astore_2
    //   111: aload_1
    //   112: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   115: aload_1
    //   116: pop
    //   117: aload_0
    //   118: getfield $next : Lkotlin/jvm/functions/Function1;
    //   121: aload_3
    //   122: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   127: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element
    //   130: dup
    //   131: ifnonnull -> 138
    //   134: pop
    //   135: goto -> 197
    //   138: astore_3
    //   139: aload_2
    //   140: aload_3
    //   141: aload_0
    //   142: checkcast kotlin/coroutines/Continuation
    //   145: aload_0
    //   146: aload_2
    //   147: putfield L$0 : Ljava/lang/Object;
    //   150: aload_0
    //   151: aload_3
    //   152: putfield L$1 : Ljava/lang/Object;
    //   155: aload_0
    //   156: iconst_2
    //   157: putfield label : I
    //   160: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   163: dup
    //   164: aload #4
    //   166: if_acmpne -> 193
    //   169: aload #4
    //   171: areturn
    //   172: aload_0
    //   173: getfield L$1 : Ljava/lang/Object;
    //   176: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element
    //   179: astore_3
    //   180: aload_0
    //   181: getfield L$0 : Ljava/lang/Object;
    //   184: checkcast kotlin/sequences/SequenceScope
    //   187: astore_2
    //   188: aload_1
    //   189: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   192: aload_1
    //   193: pop
    //   194: goto -> 117
    //   197: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   200: areturn
    //   201: new java/lang/IllegalStateException
    //   204: dup
    //   205: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   207: invokespecial <init> : (Ljava/lang/String;)V
    //   210: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #123	-> 3
    //   #124	-> 48
    //   #125	-> 62
    //   #123	-> 92
    //   #126	-> 116
    //   #127	-> 117
    //   #128	-> 139
    //   #123	-> 169
    //   #128	-> 193
    //   #130	-> 197
    //   #123	-> 201
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   48	47	2	$this$iterator	Lkotlin/sequences/SequenceScope;
    //   111	61	2	$this$iterator	Lkotlin/sequences/SequenceScope;
    //   188	13	2	$this$iterator	Lkotlin/sequences/SequenceScope;
    //   62	33	3	current	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;
    //   103	69	3	current	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;
    //   180	21	3	current	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;
    //   0	211	0	this	Lorg/jetbrains/jewel/foundation/lazy/tree/TreeKt$elementIterator$1;
    //   40	161	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super TreeKt$elementIterator$1> $completion) {
    TreeKt$elementIterator$1 treeKt$elementIterator$1 = new TreeKt$elementIterator$1(this.$initial, this.$next, $completion);
    treeKt$elementIterator$1.L$0 = value;
    return (Continuation<Unit>)treeKt$elementIterator$1;
  }
  
  public final Object invoke(SequenceScope p1, Continuation<?> p2) {
    return ((TreeKt$elementIterator$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\TreeKt$elementIterator$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */