package org.jetbrains.jewel.foundation.lazy.tree;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

@DebugMetadata(f = "Tree.kt", l = {18}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"$this$sequence", "queue", "next"}, m = "invokeSuspend", c = "org.jetbrains.jewel.foundation.lazy.tree.Tree$walk$1")
@Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001\"\004\b\000\020\002*\016\022\n\022\b\022\004\022\002H\0020\0040\003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;"})
final class Tree$walk$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Tree.Element<T>>, Continuation<? super Unit>, Object> {
  Object L$1;
  
  Object L$2;
  
  int label;
  
  Tree$walk$1(boolean $breathFirst, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #5
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 246, 0 -> 32, 1 -> 127
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield L$0 : Ljava/lang/Object;
    //   40: checkcast kotlin/sequences/SequenceScope
    //   43: astore_2
    //   44: aload_0
    //   45: getfield this$0 : Lorg/jetbrains/jewel/foundation/lazy/tree/Tree;
    //   48: invokevirtual getRoots : ()Ljava/util/List;
    //   51: checkcast java/util/Collection
    //   54: invokestatic toMutableList : (Ljava/util/Collection;)Ljava/util/List;
    //   57: astore_3
    //   58: aload_3
    //   59: checkcast java/util/Collection
    //   62: invokeinterface isEmpty : ()Z
    //   67: ifne -> 74
    //   70: iconst_1
    //   71: goto -> 75
    //   74: iconst_0
    //   75: ifeq -> 242
    //   78: aload_3
    //   79: invokestatic removeFirst : (Ljava/util/List;)Ljava/lang/Object;
    //   82: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element
    //   85: astore #4
    //   87: aload_2
    //   88: aload #4
    //   90: aload_0
    //   91: checkcast kotlin/coroutines/Continuation
    //   94: aload_0
    //   95: aload_2
    //   96: putfield L$0 : Ljava/lang/Object;
    //   99: aload_0
    //   100: aload_3
    //   101: putfield L$1 : Ljava/lang/Object;
    //   104: aload_0
    //   105: aload #4
    //   107: putfield L$2 : Ljava/lang/Object;
    //   110: aload_0
    //   111: iconst_1
    //   112: putfield label : I
    //   115: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   118: dup
    //   119: aload #5
    //   121: if_acmpne -> 157
    //   124: aload #5
    //   126: areturn
    //   127: aload_0
    //   128: getfield L$2 : Ljava/lang/Object;
    //   131: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element
    //   134: astore #4
    //   136: aload_0
    //   137: getfield L$1 : Ljava/lang/Object;
    //   140: checkcast java/util/List
    //   143: astore_3
    //   144: aload_0
    //   145: getfield L$0 : Ljava/lang/Object;
    //   148: checkcast kotlin/sequences/SequenceScope
    //   151: astore_2
    //   152: aload_1
    //   153: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   156: aload_1
    //   157: pop
    //   158: aload #4
    //   160: instanceof org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
    //   163: ifeq -> 58
    //   166: aload #4
    //   168: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
    //   171: iconst_0
    //   172: iconst_1
    //   173: aconst_null
    //   174: invokestatic open$default : (Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node;ZILjava/lang/Object;)V
    //   177: aload_0
    //   178: getfield $breathFirst : Z
    //   181: ifeq -> 212
    //   184: aload_3
    //   185: aload #4
    //   187: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
    //   190: invokevirtual getChildren : ()Ljava/util/List;
    //   193: dup
    //   194: ifnonnull -> 201
    //   197: pop
    //   198: invokestatic emptyList : ()Ljava/util/List;
    //   201: checkcast java/util/Collection
    //   204: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   209: goto -> 238
    //   212: aload_3
    //   213: iconst_0
    //   214: aload #4
    //   216: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
    //   219: invokevirtual getChildren : ()Ljava/util/List;
    //   222: dup
    //   223: ifnonnull -> 230
    //   226: pop
    //   227: invokestatic emptyList : ()Ljava/util/List;
    //   230: checkcast java/util/Collection
    //   233: invokeinterface addAll : (ILjava/util/Collection;)Z
    //   238: pop
    //   239: goto -> 58
    //   242: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   245: areturn
    //   246: new java/lang/IllegalStateException
    //   249: dup
    //   250: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   252: invokespecial <init> : (Ljava/lang/String;)V
    //   255: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #14	-> 3
    //   #15	-> 44
    //   #16	-> 58
    //   #17	-> 78
    //   #18	-> 87
    //   #14	-> 124
    //   #19	-> 157
    //   #20	-> 166
    //   #21	-> 177
    //   #22	-> 184
    //   #22	-> 204
    //   #24	-> 212
    //   #24	-> 233
    //   #28	-> 242
    //   #14	-> 246
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   44	83	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   152	49	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   201	29	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   230	16	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   58	69	3	queue	Ljava/util/List;
    //   144	57	3	queue	Ljava/util/List;
    //   201	29	3	queue	Ljava/util/List;
    //   230	16	3	queue	Ljava/util/List;
    //   87	40	4	next	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;
    //   136	65	4	next	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;
    //   212	18	4	next	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;
    //   0	256	0	this	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$walk$1;
    //   36	210	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super Tree$walk$1> $completion) {
    Tree$walk$1 tree$walk$1 = new Tree$walk$1(this.$breathFirst, $completion);
    tree$walk$1.L$0 = value;
    return (Continuation<Unit>)tree$walk$1;
  }
  
  public final Object invoke(SequenceScope p1, Continuation<?> p2) {
    return ((Tree$walk$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\Tree$walk$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */