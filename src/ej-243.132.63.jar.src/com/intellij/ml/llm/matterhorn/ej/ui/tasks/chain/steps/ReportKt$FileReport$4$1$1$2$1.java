package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;

import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.FileChangeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@DebugMetadata(f = "Report.kt", l = {137}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ReportKt$FileReport$4$1$1$2$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\002\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""})
final class ReportKt$FileReport$4$1$1$2$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
  int label;
  
  ReportKt$FileReport$4$1$1$2$1(FileChangeView $file, Continuation $completion) {
    super(1, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 80, 0 -> 32, 1 -> 66
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield $file : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
    //   40: invokevirtual getFileManipulationActions : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileManipulationActions;
    //   43: dup
    //   44: ifnull -> 75
    //   47: aload_0
    //   48: checkcast kotlin/coroutines/Continuation
    //   51: aload_0
    //   52: iconst_1
    //   53: putfield label : I
    //   56: invokevirtual onLocate : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   59: dup
    //   60: aload_2
    //   61: if_acmpne -> 71
    //   64: aload_2
    //   65: areturn
    //   66: aload_1
    //   67: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   70: aload_1
    //   71: pop
    //   72: goto -> 76
    //   75: pop
    //   76: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   79: areturn
    //   80: new java/lang/IllegalStateException
    //   83: dup
    //   84: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   86: invokespecial <init> : (Ljava/lang/String;)V
    //   89: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #137	-> 3
    //   #137	-> 36
    //   #137	-> 64
    //   #137	-> 71
    //   #137	-> 80
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	90	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$4$1$1$2$1;
    //   36	44	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Continuation<? super ReportKt$FileReport$4$1$1$2$1> $completion) {
    return (Continuation<Unit>)new ReportKt$FileReport$4$1$1$2$1(this.$file, $completion);
  }
  
  public final Object invoke(Continuation<?> p1) {
    return ((ReportKt$FileReport$4$1$1$2$1)create(p1)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\ReportKt$FileReport$4$1$1$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */