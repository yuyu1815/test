package com.intellij.ml.llm.matterhorn.ej.core.tasks;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "RecentTaskChainServiceImpl.kt", l = {56}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.tasks.RecentTaskChainServiceImpl$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
@SourceDebugExtension({"SMAP\nRecentTaskChainServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentTaskChainServiceImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n1797#2,3:182\n*S KotlinDebug\n*F\n+ 1 RecentTaskChainServiceImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl$1\n*L\n57#1:182,3\n*E\n"})
final class null extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  int label;
  
  null(Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #13
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 169, 0 -> 32, 1 -> 61
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;
    //   40: aload_0
    //   41: checkcast kotlin/coroutines/Continuation
    //   44: aload_0
    //   45: iconst_1
    //   46: putfield label : I
    //   49: invokevirtual loadAllTasks$ej_core : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   52: dup
    //   53: aload #13
    //   55: if_acmpne -> 66
    //   58: aload #13
    //   60: areturn
    //   61: aload_1
    //   62: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   65: aload_1
    //   66: checkcast java/util/List
    //   69: astore_2
    //   70: aload_2
    //   71: checkcast java/lang/Iterable
    //   74: astore #4
    //   76: invokestatic persistentHashMapOf : ()Lkotlinx/collections/immutable/PersistentMap;
    //   79: astore #5
    //   81: iconst_0
    //   82: istore #6
    //   84: aload #5
    //   86: astore #7
    //   88: aload #4
    //   90: invokeinterface iterator : ()Ljava/util/Iterator;
    //   95: astore #8
    //   97: aload #8
    //   99: invokeinterface hasNext : ()Z
    //   104: ifeq -> 149
    //   107: aload #8
    //   109: invokeinterface next : ()Ljava/lang/Object;
    //   114: astore #9
    //   116: aload #7
    //   118: aload #9
    //   120: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain
    //   123: astore #10
    //   125: astore #11
    //   127: iconst_0
    //   128: istore #12
    //   130: aload #11
    //   132: aload #10
    //   134: invokevirtual getTaskChainId : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
    //   137: aload #10
    //   139: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlinx/collections/immutable/PersistentMap;
    //   144: astore #7
    //   146: goto -> 97
    //   149: aload #7
    //   151: astore_3
    //   152: aload_0
    //   153: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;
    //   156: invokestatic access$getRecentTaskChainsFlow$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;)Lkotlinx/coroutines/flow/MutableStateFlow;
    //   159: aload_3
    //   160: invokeinterface setValue : (Ljava/lang/Object;)V
    //   165: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   168: areturn
    //   169: new java/lang/IllegalStateException
    //   172: dup
    //   173: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   175: invokespecial <init> : (Ljava/lang/String;)V
    //   178: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #55	-> 3
    //   #56	-> 36
    //   #55	-> 58
    //   #57	-> 70
    //   #182	-> 84
    //   #183	-> 88
    //   #58	-> 130
    //   #183	-> 144
    //   #184	-> 149
    //   #57	-> 151
    //   #60	-> 152
    //   #61	-> 165
    //   #55	-> 169
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   70	11	2	recentTasks	Ljava/util/List;
    //   152	17	3	initialTrackedChains	Lkotlinx/collections/immutable/PersistentMap;
    //   81	16	4	$this$fold$iv	Ljava/lang/Iterable;
    //   81	7	5	initial$iv	Ljava/lang/Object;
    //   88	63	7	accumulator$iv	Ljava/lang/Object;
    //   116	30	9	element$iv	Ljava/lang/Object;
    //   127	17	10	chain	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;
    //   127	17	11	acc	Lkotlinx/collections/immutable/PersistentMap;
    //   130	14	12	$i$a$-fold-RecentTaskChainServiceImpl$1$initialTrackedChains$1	I
    //   84	67	6	$i$f$fold	I
    //   0	179	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl$1;
    //   36	133	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
    return (Continuation<Unit>)new Object(RecentTaskChainServiceImpl.this, $completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\RecentTaskChainServiceImpl$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */