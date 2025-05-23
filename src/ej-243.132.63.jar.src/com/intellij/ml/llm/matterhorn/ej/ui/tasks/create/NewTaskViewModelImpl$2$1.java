package com.intellij.ml.llm.matterhorn.ej.ui.tasks.create;

import com.intellij.ml.llm.matterhorn.ej.core.tasks.RecentTaskChain;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableCollection;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
@SourceDebugExtension({"SMAP\nNewTaskViewModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewTaskViewModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,293:1\n1557#2:294\n1628#2,3:295\n*S KotlinDebug\n*F\n+ 1 NewTaskViewModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1\n*L\n119#1:294\n119#1:295,3\n*E\n"})
final class null<T> implements FlowCollector {
  public final Object emit(ImmutableCollection taskChains, Continuation $completion) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1$emit$1
    //   4: ifeq -> 39
    //   7: aload_2
    //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1$emit$1
    //   11: astore #18
    //   13: aload #18
    //   15: getfield label : I
    //   18: ldc -2147483648
    //   20: iand
    //   21: ifeq -> 39
    //   24: aload #18
    //   26: dup
    //   27: getfield label : I
    //   30: ldc -2147483648
    //   32: isub
    //   33: putfield label : I
    //   36: goto -> 50
    //   39: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1$emit$1
    //   42: dup
    //   43: aload_0
    //   44: aload_2
    //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1;Lkotlin/coroutines/Continuation;)V
    //   48: astore #18
    //   50: aload #18
    //   52: getfield result : Ljava/lang/Object;
    //   55: astore #17
    //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   60: astore #19
    //   62: aload #18
    //   64: getfield label : I
    //   67: tableswitch default -> 386, 0 -> 88, 1 -> 330
    //   88: aload #17
    //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   93: new kotlin/jvm/internal/Ref$ObjectRef
    //   96: dup
    //   97: invokespecial <init> : ()V
    //   100: astore_3
    //   101: aload_1
    //   102: checkcast java/lang/Iterable
    //   105: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1$emit$$inlined$compareByDescending$1
    //   108: dup
    //   109: invokespecial <init> : ()V
    //   112: checkcast java/util/Comparator
    //   115: invokestatic sortedWith : (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
    //   118: checkcast java/lang/Iterable
    //   121: astore #5
    //   123: iconst_0
    //   124: istore #6
    //   126: aload #5
    //   128: astore #7
    //   130: new java/util/ArrayList
    //   133: dup
    //   134: aload #5
    //   136: bipush #10
    //   138: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
    //   141: invokespecial <init> : (I)V
    //   144: checkcast java/util/Collection
    //   147: astore #8
    //   149: iconst_0
    //   150: istore #9
    //   152: aload #7
    //   154: invokeinterface iterator : ()Ljava/util/Iterator;
    //   159: astore #10
    //   161: aload #10
    //   163: invokeinterface hasNext : ()Z
    //   168: ifeq -> 262
    //   171: aload #10
    //   173: invokeinterface next : ()Ljava/lang/Object;
    //   178: astore #11
    //   180: aload #8
    //   182: aload #11
    //   184: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain
    //   187: astore #12
    //   189: astore #16
    //   191: iconst_0
    //   192: istore #13
    //   194: aload #12
    //   196: invokestatic prettyDate : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;)Ljava/lang/String;
    //   199: astore #14
    //   201: aconst_null
    //   202: astore #15
    //   204: aload_3
    //   205: getfield element : Ljava/lang/Object;
    //   208: ifnull -> 223
    //   211: aload #14
    //   213: aload_3
    //   214: getfield element : Ljava/lang/Object;
    //   217: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   220: ifne -> 236
    //   223: aload_3
    //   224: aload #14
    //   226: putfield element : Ljava/lang/Object;
    //   229: aload #14
    //   231: astore #15
    //   233: goto -> 239
    //   236: aconst_null
    //   237: astore #15
    //   239: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/SortedRecentTaskChain
    //   242: dup
    //   243: aload #12
    //   245: aload #15
    //   247: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;Ljava/lang/String;)V
    //   250: aload #16
    //   252: swap
    //   253: invokeinterface add : (Ljava/lang/Object;)Z
    //   258: pop
    //   259: goto -> 161
    //   262: aload #8
    //   264: checkcast java/util/List
    //   267: nop
    //   268: astore #4
    //   270: aload_0
    //   271: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
    //   274: invokestatic access$get_recentTasks$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;)Lkotlinx/coroutines/flow/MutableStateFlow;
    //   277: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/RecentTaskLoadState$Ready
    //   280: dup
    //   281: aload #4
    //   283: checkcast java/lang/Iterable
    //   286: invokestatic toImmutableList : (Ljava/lang/Iterable;)Lkotlinx/collections/immutable/ImmutableList;
    //   289: checkcast java/util/List
    //   292: invokespecial <init> : (Ljava/util/List;)V
    //   295: aload #18
    //   297: aload #18
    //   299: aload_0
    //   300: putfield L$0 : Ljava/lang/Object;
    //   303: aload #18
    //   305: aload #4
    //   307: putfield L$1 : Ljava/lang/Object;
    //   310: aload #18
    //   312: iconst_1
    //   313: putfield label : I
    //   316: invokeinterface emit : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   321: dup
    //   322: aload #19
    //   324: if_acmpne -> 356
    //   327: aload #19
    //   329: areturn
    //   330: aload #18
    //   332: getfield L$1 : Ljava/lang/Object;
    //   335: checkcast java/util/List
    //   338: astore #4
    //   340: aload #18
    //   342: getfield L$0 : Ljava/lang/Object;
    //   345: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1
    //   348: astore_0
    //   349: aload #17
    //   351: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   354: aload #17
    //   356: pop
    //   357: aload #4
    //   359: invokeinterface isEmpty : ()Z
    //   364: ifeq -> 382
    //   367: aload_0
    //   368: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl;
    //   371: invokevirtual getTaskExplorerSelectedTab : ()Landroidx/compose/runtime/MutableState;
    //   374: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/TaskExplorerTabs.Favorites : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/TaskExplorerTabs;
    //   377: invokeinterface setValue : (Ljava/lang/Object;)V
    //   382: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   385: areturn
    //   386: new java/lang/IllegalStateException
    //   389: dup
    //   390: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   392: invokespecial <init> : (Ljava/lang/String;)V
    //   395: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #117	-> 60
    //   #118	-> 93
    //   #119	-> 101
    //   #119	-> 115
    //   #294	-> 126
    //   #295	-> 152
    //   #296	-> 180
    //   #120	-> 194
    //   #121	-> 201
    //   #123	-> 204
    //   #124	-> 223
    //   #125	-> 229
    //   #127	-> 236
    //   #129	-> 239
    //   #296	-> 253
    //   #297	-> 262
    //   #294	-> 267
    //   #119	-> 268
    //   #131	-> 270
    //   #117	-> 327
    //   #132	-> 356
    //   #133	-> 367
    //   #135	-> 382
    //   #117	-> 386
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   93	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1;
    //   115	215	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1;
    //   349	33	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskViewModelImpl$2$1;
    //   93	12	1	taskChains	Lkotlinx/collections/immutable/ImmutableCollection;
    //   101	14	3	prettyDate	Lkotlin/jvm/internal/Ref$ObjectRef;
    //   115	135	3	prettyDate	Lkotlin/jvm/internal/Ref$ObjectRef;
    //   250	12	3	prettyDate	Lkotlin/jvm/internal/Ref$ObjectRef;
    //   270	60	4	sortedRecentTaskChains	Ljava/util/List;
    //   340	27	4	sortedRecentTaskChains	Ljava/util/List;
    //   123	26	5	$this$map$iv	Ljava/lang/Iterable;
    //   149	12	7	$this$mapTo$iv$iv	Ljava/lang/Iterable;
    //   149	115	8	destination$iv$iv	Ljava/util/Collection;
    //   180	11	11	item$iv$iv	Ljava/lang/Object;
    //   191	59	12	task	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;
    //   201	35	14	nextDate	Ljava/lang/String;
    //   239	11	15	newPrettyDate	Ljava/lang/String;
    //   194	56	13	$i$a$-map-NewTaskViewModelImpl$2$1$sortedRecentTaskChains$2	I
    //   152	112	9	$i$f$mapTo	I
    //   126	142	6	$i$f$map	I
    //   0	396	2	$completion	Lkotlin/coroutines/Continuation;
    //   50	336	18	$continuation	Lkotlin/coroutines/Continuation;
    //   57	329	17	$result	Ljava/lang/Object;
  }
  
  @DebugMetadata(f = "NewTaskViewModelImpl.kt", l = {131}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "sortedRecentTaskChains"}, m = "emit", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.NewTaskViewModelImpl$2$1")
  @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
  static final class NewTaskViewModelImpl$2$1$emit$1 extends ContinuationImpl {
    Object L$0;
    
    Object L$1;
    
    int label;
    
    public final Object invokeSuspend(Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return NewTaskViewModelImpl.null.null.this.emit((ImmutableCollection<RecentTaskChain>)null, (Continuation<? super Unit>)this);
    }
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\create\NewTaskViewModelImpl$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */