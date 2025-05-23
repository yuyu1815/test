package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskStep;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "TaskSteps.kt", l = {105, 109}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.TaskStepsKt$TaskSteps$3$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
final class TaskStepsKt$TaskSteps$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  int label;
  
  TaskStepsKt$TaskSteps$3$1(List<TaskStep> $unifiedStepList, LazyListState $lazyListState, MutableState<Boolean> $autoScrollEnabled$delegate, MutableState<Boolean> $isProgrammaticScroll$delegate, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 165, 0 -> 36, 1 -> 62, 2 -> 147
    //   36: aload_1
    //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   40: ldc2_w 300
    //   43: aload_0
    //   44: checkcast kotlin/coroutines/Continuation
    //   47: aload_0
    //   48: iconst_1
    //   49: putfield label : I
    //   52: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   55: dup
    //   56: aload_2
    //   57: if_acmpne -> 67
    //   60: aload_2
    //   61: areturn
    //   62: aload_1
    //   63: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   66: aload_1
    //   67: pop
    //   68: aload_0
    //   69: getfield $autoScrollEnabled$delegate : Landroidx/compose/runtime/MutableState;
    //   72: invokestatic access$TaskSteps$lambda$5 : (Landroidx/compose/runtime/MutableState;)Z
    //   75: ifeq -> 161
    //   78: aload_0
    //   79: getfield $unifiedStepList : Ljava/util/List;
    //   82: checkcast java/util/Collection
    //   85: invokeinterface isEmpty : ()Z
    //   90: ifne -> 97
    //   93: iconst_1
    //   94: goto -> 98
    //   97: iconst_0
    //   98: ifeq -> 161
    //   101: aload_0
    //   102: getfield $isProgrammaticScroll$delegate : Landroidx/compose/runtime/MutableState;
    //   105: iconst_1
    //   106: invokestatic access$TaskSteps$lambda$9 : (Landroidx/compose/runtime/MutableState;Z)V
    //   109: aload_0
    //   110: getfield $lazyListState : Landroidx/compose/foundation/lazy/LazyListState;
    //   113: aload_0
    //   114: getfield $lazyListState : Landroidx/compose/foundation/lazy/LazyListState;
    //   117: invokevirtual getLayoutInfo : ()Landroidx/compose/foundation/lazy/LazyListLayoutInfo;
    //   120: invokeinterface getTotalItemsCount : ()I
    //   125: iconst_0
    //   126: aload_0
    //   127: checkcast kotlin/coroutines/Continuation
    //   130: iconst_2
    //   131: aconst_null
    //   132: aload_0
    //   133: iconst_2
    //   134: putfield label : I
    //   137: invokestatic animateScrollToItem$default : (Landroidx/compose/foundation/lazy/LazyListState;IILkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    //   140: dup
    //   141: aload_2
    //   142: if_acmpne -> 152
    //   145: aload_2
    //   146: areturn
    //   147: aload_1
    //   148: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   151: aload_1
    //   152: pop
    //   153: aload_0
    //   154: getfield $isProgrammaticScroll$delegate : Landroidx/compose/runtime/MutableState;
    //   157: iconst_0
    //   158: invokestatic access$TaskSteps$lambda$9 : (Landroidx/compose/runtime/MutableState;Z)V
    //   161: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   164: areturn
    //   165: new java/lang/IllegalStateException
    //   168: dup
    //   169: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   171: invokespecial <init> : (Ljava/lang/String;)V
    //   174: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #104	-> 3
    //   #105	-> 40
    //   #104	-> 60
    //   #106	-> 67
    //   #106	-> 98
    //   #108	-> 101
    //   #109	-> 109
    //   #104	-> 145
    //   #110	-> 152
    //   #112	-> 161
    //   #104	-> 165
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	175	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/TaskStepsKt$TaskSteps$3$1;
    //   40	125	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super TaskStepsKt$TaskSteps$3$1> $completion) {
    return (Continuation<Unit>)new TaskStepsKt$TaskSteps$3$1(this.$unifiedStepList, this.$lazyListState, this.$autoScrollEnabled$delegate, this.$isProgrammaticScroll$delegate, $completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((TaskStepsKt$TaskSteps$3$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\TaskStepsKt$TaskSteps$3$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */