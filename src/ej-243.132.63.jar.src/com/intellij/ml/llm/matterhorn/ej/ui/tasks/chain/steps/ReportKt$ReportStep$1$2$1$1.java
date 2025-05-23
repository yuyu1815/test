package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;

import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskStep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@DebugMetadata(f = "Report.kt", l = {67}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ReportKt$ReportStep$1$2$1$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\002\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""})
final class ReportKt$ReportStep$1$2$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
  Object L$0;
  
  int label;
  
  ReportKt$ReportStep$1$2$1$1(TaskStep.Report $report, Continuation $completion) {
    super(1, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #4
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 127, 0 -> 32, 1 -> 102
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield $report : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Report;
    //   40: invokevirtual getChanges : ()Ljava/util/List;
    //   43: invokeinterface iterator : ()Ljava/util/Iterator;
    //   48: astore_2
    //   49: aload_2
    //   50: invokeinterface hasNext : ()Z
    //   55: ifeq -> 123
    //   58: aload_2
    //   59: invokeinterface next : ()Ljava/lang/Object;
    //   64: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView
    //   67: astore_3
    //   68: aload_3
    //   69: invokevirtual getFileManipulationActions : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileManipulationActions;
    //   72: dup
    //   73: ifnull -> 119
    //   76: aload_0
    //   77: checkcast kotlin/coroutines/Continuation
    //   80: aload_0
    //   81: aload_2
    //   82: putfield L$0 : Ljava/lang/Object;
    //   85: aload_0
    //   86: iconst_1
    //   87: putfield label : I
    //   90: invokevirtual onSetVCS : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   93: dup
    //   94: aload #4
    //   96: if_acmpne -> 115
    //   99: aload #4
    //   101: areturn
    //   102: aload_0
    //   103: getfield L$0 : Ljava/lang/Object;
    //   106: checkcast java/util/Iterator
    //   109: astore_2
    //   110: aload_1
    //   111: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   114: aload_1
    //   115: pop
    //   116: goto -> 49
    //   119: pop
    //   120: goto -> 49
    //   123: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   126: areturn
    //   127: new java/lang/IllegalStateException
    //   130: dup
    //   131: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   133: invokespecial <init> : (Ljava/lang/String;)V
    //   136: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #65	-> 3
    //   #66	-> 36
    //   #67	-> 68
    //   #65	-> 99
    //   #67	-> 115
    //   #69	-> 123
    //   #65	-> 127
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   68	4	3	fileChangeView	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
    //   0	137	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$ReportStep$1$2$1$1;
    //   36	91	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Continuation<? super ReportKt$ReportStep$1$2$1$1> $completion) {
    return (Continuation<Unit>)new ReportKt$ReportStep$1$2$1$1(this.$report, $completion);
  }
  
  public final Object invoke(Continuation<?> p1) {
    return ((ReportKt$ReportStep$1$2$1$1)create(p1)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\ReportKt$ReportStep$1$2$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */