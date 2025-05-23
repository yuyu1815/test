package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\007\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\0032\006\020\004\032\002H\002H@¢\006\004\b\005\020\006¨\006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"})
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 TaskChainDetailsViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,218:1\n50#2:219\n140#3:220\n141#3,6:224\n147#3:233\n1368#4:221\n1454#4,2:222\n1456#4,3:230\n*S KotlinDebug\n*F\n+ 1 TaskChainDetailsViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel\n*L\n140#1:221\n140#1:222,2\n140#1:230,3\n*E\n"})
public final class null<T> implements FlowCollector {
  public null(FlowCollector $receiver) {}
  
  @Nullable
  public final Object emit(Object value, @NotNull Continuation $completion) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel$special$$inlined$map$2$2$1
    //   4: ifeq -> 36
    //   7: aload_2
    //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel$special$$inlined$map$2$2$1
    //   11: astore_3
    //   12: aload_3
    //   13: getfield label : I
    //   16: ldc -2147483648
    //   18: iand
    //   19: ifeq -> 36
    //   22: aload_3
    //   23: dup
    //   24: getfield label : I
    //   27: ldc -2147483648
    //   29: isub
    //   30: putfield label : I
    //   33: goto -> 46
    //   36: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel$special$$inlined$map$2$2$1
    //   39: dup
    //   40: aload_0
    //   41: aload_2
    //   42: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel$special$$inlined$map$2$2;Lkotlin/coroutines/Continuation;)V
    //   45: astore_3
    //   46: aload_3
    //   47: getfield result : Ljava/lang/Object;
    //   50: astore #4
    //   52: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   55: astore #5
    //   57: aload_3
    //   58: getfield label : I
    //   61: tableswitch default -> 367, 0 -> 84, 1 -> 352
    //   84: aload #4
    //   86: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   89: aload_0
    //   90: getfield $this_unsafeFlow : Lkotlinx/coroutines/flow/FlowCollector;
    //   93: aload_1
    //   94: astore #6
    //   96: astore #7
    //   98: iconst_0
    //   99: istore #8
    //   101: aload #7
    //   103: astore #9
    //   105: aload #6
    //   107: aload_3
    //   108: checkcast kotlin/coroutines/Continuation
    //   111: pop
    //   112: checkcast java/util/Map
    //   115: astore #10
    //   117: iconst_0
    //   118: istore #11
    //   120: aload #10
    //   122: invokeinterface values : ()Ljava/util/Collection;
    //   127: checkcast java/lang/Iterable
    //   130: astore #12
    //   132: iconst_0
    //   133: istore #13
    //   135: aload #12
    //   137: astore #14
    //   139: new java/util/ArrayList
    //   142: dup
    //   143: invokespecial <init> : ()V
    //   146: checkcast java/util/Collection
    //   149: astore #15
    //   151: iconst_0
    //   152: istore #16
    //   154: aload #14
    //   156: invokeinterface iterator : ()Ljava/util/Iterator;
    //   161: astore #17
    //   163: aload #17
    //   165: invokeinterface hasNext : ()Z
    //   170: ifeq -> 322
    //   173: aload #17
    //   175: invokeinterface next : ()Ljava/lang/Object;
    //   180: astore #18
    //   182: aload #18
    //   184: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskRecapModel
    //   187: astore #19
    //   189: iconst_0
    //   190: istore #20
    //   192: invokestatic createListBuilder : ()Ljava/util/List;
    //   195: astore #21
    //   197: aload #21
    //   199: astore #22
    //   201: iconst_0
    //   202: istore #23
    //   204: aload #22
    //   206: aload #19
    //   208: invokevirtual getPrompt : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Prompt;
    //   211: invokeinterface add : (Ljava/lang/Object;)Z
    //   216: pop
    //   217: aload #19
    //   219: invokevirtual getPlan : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Plan;
    //   222: ifnull -> 238
    //   225: aload #22
    //   227: aload #19
    //   229: invokevirtual getPlan : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Plan;
    //   232: invokeinterface add : (Ljava/lang/Object;)Z
    //   237: pop
    //   238: aload #19
    //   240: invokevirtual getSteps : ()Ljava/util/List;
    //   243: checkcast java/util/Collection
    //   246: invokeinterface isEmpty : ()Z
    //   251: ifne -> 258
    //   254: iconst_1
    //   255: goto -> 259
    //   258: iconst_0
    //   259: ifeq -> 278
    //   262: aload #22
    //   264: aload #19
    //   266: invokevirtual getSteps : ()Ljava/util/List;
    //   269: checkcast java/util/Collection
    //   272: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   277: pop
    //   278: aload #19
    //   280: invokevirtual getResult : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep;
    //   283: ifnull -> 299
    //   286: aload #22
    //   288: aload #19
    //   290: invokevirtual getResult : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep;
    //   293: invokeinterface add : (Ljava/lang/Object;)Z
    //   298: pop
    //   299: nop
    //   300: aload #21
    //   302: invokestatic build : (Ljava/util/List;)Ljava/util/List;
    //   305: checkcast java/lang/Iterable
    //   308: nop
    //   309: astore #19
    //   311: aload #15
    //   313: aload #19
    //   315: invokestatic addAll : (Ljava/util/Collection;Ljava/lang/Iterable;)Z
    //   318: pop
    //   319: goto -> 163
    //   322: aload #15
    //   324: checkcast java/util/List
    //   327: nop
    //   328: nop
    //   329: aload #9
    //   331: swap
    //   332: aload_3
    //   333: aload_3
    //   334: iconst_1
    //   335: putfield label : I
    //   338: invokeinterface emit : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   343: dup
    //   344: aload #5
    //   346: if_acmpne -> 362
    //   349: aload #5
    //   351: areturn
    //   352: iconst_0
    //   353: istore #8
    //   355: aload #4
    //   357: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   360: aload #4
    //   362: pop
    //   363: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   366: areturn
    //   367: new java/lang/IllegalStateException
    //   370: dup
    //   371: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   373: invokespecial <init> : (Ljava/lang/String;)V
    //   376: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #0	-> 55
    //   #49	-> 89
    //   #219	-> 101
    //   #220	-> 120
    //   #221	-> 135
    //   #222	-> 154
    //   #223	-> 182
    //   #224	-> 192
    //   #225	-> 204
    //   #226	-> 217
    //   #227	-> 238
    //   #227	-> 259
    //   #228	-> 278
    //   #229	-> 299
    //   #224	-> 300
    //   #229	-> 308
    //   #223	-> 309
    //   #230	-> 311
    //   #232	-> 322
    //   #221	-> 327
    //   #233	-> 328
    //   #219	-> 329
    //   #0	-> 349
    //   #49	-> 362
    //   #0	-> 367
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   89	9	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel$special$$inlined$map$2$2;
    //   89	9	1	value	Ljava/lang/Object;
    //   98	19	6	value	Ljava/lang/Object;
    //   98	19	7	$this$map_u24lambda_u245	Lkotlinx/coroutines/flow/FlowCollector;
    //   117	15	10	it	Ljava/util/Map;
    //   132	19	12	$this$flatMap$iv	Ljava/lang/Iterable;
    //   151	12	14	$this$flatMapTo$iv$iv	Ljava/lang/Iterable;
    //   151	173	15	destination$iv$iv	Ljava/util/Collection;
    //   182	7	18	element$iv$iv	Ljava/lang/Object;
    //   189	110	19	it	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskRecapModel;
    //   311	8	19	list$iv$iv	Ljava/lang/Iterable;
    //   201	98	22	$this$unifiedStepList_u24lambda_u243_u24lambda_u242_u24lambda_u241	Ljava/util/List;
    //   204	96	23	$i$a$-buildList-TaskChainDetailsViewModel$unifiedStepList$1$1$1	I
    //   192	117	20	$i$a$-flatMap-TaskChainDetailsViewModel$unifiedStepList$1$1	I
    //   154	170	16	$i$f$flatMapTo	I
    //   135	193	13	$i$f$flatMap	I
    //   120	209	11	$i$a$-map-TaskChainDetailsViewModel$unifiedStepList$1	I
    //   0	377	2	$completion	Lkotlin/coroutines/Continuation;
    //   101	251	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
    //   46	321	3	$continuation	Lkotlin/coroutines/Continuation;
    //   52	315	4	$result	Ljava/lang/Object;
    //   355	8	8	$i$a$-unsafeTransform-FlowKt__TransformKt$map$1	I
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\TaskChainDetailsViewModel$special$$inlined$map$2$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */