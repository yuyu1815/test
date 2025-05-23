package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;

import androidx.compose.runtime.MutableState;
import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.FileChangeView;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "Report.kt", l = {157, 158}, i = {1, 1}, s = {"L$0", "L$2"}, n = {"destination$iv$iv", "element$iv$iv"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ReportKt$FileReport$5$1$1$1$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
@SourceDebugExtension({"SMAP\nReport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Report.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$5$1$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n774#2:186\n865#2,2:187\n*S KotlinDebug\n*F\n+ 1 Report.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$5$1$1$1$1\n*L\n158#1:186\n158#1:187,2\n*E\n"})
final class ReportKt$FileReport$5$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  int label;
  
  ReportKt$FileReport$5$1$1$1$1(Function1<Continuation<? super Unit>, Object> $onChangeAllVcsStatus, List<FileChangeView> $newFiles, MutableState<Set<FileChangeView>> $commitedFiles$delegate, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #12
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 297, 0 -> 36, 1 -> 64, 2 -> 193
    //   36: aload_1
    //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   40: aload_0
    //   41: getfield $onChangeAllVcsStatus : Lkotlin/jvm/functions/Function1;
    //   44: aload_0
    //   45: aload_0
    //   46: iconst_1
    //   47: putfield label : I
    //   50: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   55: dup
    //   56: aload #12
    //   58: if_acmpne -> 69
    //   61: aload #12
    //   63: areturn
    //   64: aload_1
    //   65: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   68: aload_1
    //   69: pop
    //   70: aload_0
    //   71: getfield $commitedFiles$delegate : Landroidx/compose/runtime/MutableState;
    //   74: aload_0
    //   75: getfield $newFiles : Ljava/util/List;
    //   78: checkcast java/lang/Iterable
    //   81: astore_2
    //   82: astore #11
    //   84: iconst_0
    //   85: istore_3
    //   86: aload_2
    //   87: astore #4
    //   89: new java/util/ArrayList
    //   92: dup
    //   93: invokespecial <init> : ()V
    //   96: checkcast java/util/Collection
    //   99: astore #5
    //   101: iconst_0
    //   102: istore #6
    //   104: aload #4
    //   106: invokeinterface iterator : ()Ljava/util/Iterator;
    //   111: astore #7
    //   113: aload #7
    //   115: invokeinterface hasNext : ()Z
    //   120: ifeq -> 275
    //   123: aload #7
    //   125: invokeinterface next : ()Ljava/lang/Object;
    //   130: astore #8
    //   132: aload #8
    //   134: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView
    //   137: astore #9
    //   139: iconst_0
    //   140: istore #10
    //   142: aload #9
    //   144: invokevirtual getFileManipulationActions : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileManipulationActions;
    //   147: dup
    //   148: ifnull -> 257
    //   151: aload_0
    //   152: aload_0
    //   153: aload #5
    //   155: putfield L$0 : Ljava/lang/Object;
    //   158: aload_0
    //   159: aload #7
    //   161: putfield L$1 : Ljava/lang/Object;
    //   164: aload_0
    //   165: aload #8
    //   167: putfield L$2 : Ljava/lang/Object;
    //   170: aload_0
    //   171: aload #11
    //   173: putfield L$3 : Ljava/lang/Object;
    //   176: aload_0
    //   177: iconst_2
    //   178: putfield label : I
    //   181: invokevirtual isOnVCS : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   184: dup
    //   185: aload #12
    //   187: if_acmpne -> 239
    //   190: aload #12
    //   192: areturn
    //   193: iconst_0
    //   194: istore_3
    //   195: iconst_0
    //   196: istore #6
    //   198: iconst_0
    //   199: istore #10
    //   201: aload_0
    //   202: getfield L$3 : Ljava/lang/Object;
    //   205: checkcast androidx/compose/runtime/MutableState
    //   208: astore #11
    //   210: aload_0
    //   211: getfield L$2 : Ljava/lang/Object;
    //   214: astore #8
    //   216: aload_0
    //   217: getfield L$1 : Ljava/lang/Object;
    //   220: checkcast java/util/Iterator
    //   223: astore #7
    //   225: aload_0
    //   226: getfield L$0 : Ljava/lang/Object;
    //   229: checkcast java/util/Collection
    //   232: astore #5
    //   234: aload_1
    //   235: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   238: aload_1
    //   239: checkcast java/lang/Boolean
    //   242: invokevirtual booleanValue : ()Z
    //   245: iconst_1
    //   246: if_icmpne -> 253
    //   249: iconst_1
    //   250: goto -> 259
    //   253: iconst_0
    //   254: goto -> 259
    //   257: pop
    //   258: iconst_0
    //   259: ifeq -> 113
    //   262: aload #5
    //   264: aload #8
    //   266: invokeinterface add : (Ljava/lang/Object;)Z
    //   271: pop
    //   272: goto -> 113
    //   275: aload #5
    //   277: checkcast java/util/List
    //   280: nop
    //   281: aload #11
    //   283: swap
    //   284: checkcast java/lang/Iterable
    //   287: invokestatic toSet : (Ljava/lang/Iterable;)Ljava/util/Set;
    //   290: invokestatic access$FileReport$lambda$4 : (Landroidx/compose/runtime/MutableState;Ljava/util/Set;)V
    //   293: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   296: areturn
    //   297: new java/lang/IllegalStateException
    //   300: dup
    //   301: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   303: invokespecial <init> : (Ljava/lang/String;)V
    //   306: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #156	-> 3
    //   #157	-> 40
    //   #156	-> 61
    //   #158	-> 69
    //   #186	-> 86
    //   #187	-> 104
    //   #158	-> 142
    //   #156	-> 190
    //   #158	-> 239
    //   #187	-> 259
    //   #188	-> 275
    //   #186	-> 280
    //   #158	-> 287
    //   #159	-> 293
    //   #156	-> 297
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   84	17	2	$this$filter$iv	Ljava/lang/Iterable;
    //   101	12	4	$this$filterTo$iv$iv	Ljava/lang/Iterable;
    //   101	92	5	destination$iv$iv	Ljava/util/Collection;
    //   234	43	5	destination$iv$iv	Ljava/util/Collection;
    //   132	61	8	element$iv$iv	Ljava/lang/Object;
    //   216	56	8	element$iv$iv	Ljava/lang/Object;
    //   139	8	9	it	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
    //   142	51	10	$i$a$-filter-ReportKt$FileReport$5$1$1$1$1$1	I
    //   104	89	6	$i$f$filterTo	I
    //   86	107	3	$i$f$filter	I
    //   0	307	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$5$1$1$1$1;
    //   40	257	1	$result	Ljava/lang/Object;
    //   201	58	10	$i$a$-filter-ReportKt$FileReport$5$1$1$1$1$1	I
    //   198	79	6	$i$f$filterTo	I
    //   195	86	3	$i$f$filter	I
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super ReportKt$FileReport$5$1$1$1$1> $completion) {
    return (Continuation<Unit>)new ReportKt$FileReport$5$1$1$1$1(this.$onChangeAllVcsStatus, this.$newFiles, this.$commitedFiles$delegate, $completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((ReportKt$FileReport$5$1$1$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\ReportKt$FileReport$5$1$1$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */