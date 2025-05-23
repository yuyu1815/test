package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "TerminalOutputContentUpdatesScheduler.kt", l = {52, 56, 58}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TerminalOutputContentUpdatesScheduler$startUpdating$1$job$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
final class TerminalOutputContentUpdatesScheduler$startUpdating$1$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  int label;
  
  TerminalOutputContentUpdatesScheduler$startUpdating$1$job$1(TerminalOutputContentUpdatesScheduler $receiver, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 142, 0 -> 40, 1 -> 66, 2 -> 95, 3 -> 133
    //   40: aload_1
    //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   44: ldc2_w 100
    //   47: aload_0
    //   48: checkcast kotlin/coroutines/Continuation
    //   51: aload_0
    //   52: iconst_1
    //   53: putfield label : I
    //   56: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   59: dup
    //   60: aload_3
    //   61: if_acmpne -> 71
    //   64: aload_3
    //   65: areturn
    //   66: aload_1
    //   67: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   70: aload_1
    //   71: pop
    //   72: aload_0
    //   73: getfield $tracker : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputChangesTracker;
    //   76: aload_0
    //   77: checkcast kotlin/coroutines/Continuation
    //   80: aload_0
    //   81: iconst_2
    //   82: putfield label : I
    //   85: invokevirtual collectChangedOutputOrWait : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   88: dup
    //   89: aload_3
    //   90: if_acmpne -> 100
    //   93: aload_3
    //   94: areturn
    //   95: aload_1
    //   96: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   99: aload_1
    //   100: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/PartialCommandOutput
    //   103: astore_2
    //   104: aload_0
    //   105: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputContentUpdatesScheduler;
    //   108: aload_2
    //   109: invokestatic access$scheduleChangeApplying : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputContentUpdatesScheduler;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/PartialCommandOutput;)Lkotlinx/coroutines/Job;
    //   112: aload_0
    //   113: checkcast kotlin/coroutines/Continuation
    //   116: aload_0
    //   117: iconst_3
    //   118: putfield label : I
    //   121: invokeinterface join : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   126: dup
    //   127: aload_3
    //   128: if_acmpne -> 138
    //   131: aload_3
    //   132: areturn
    //   133: aload_1
    //   134: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   137: aload_1
    //   138: pop
    //   139: goto -> 72
    //   142: new java/lang/IllegalStateException
    //   145: dup
    //   146: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   148: invokespecial <init> : (Ljava/lang/String;)V
    //   151: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #48	-> 3
    //   #52	-> 44
    //   #48	-> 64
    //   #55	-> 71
    //   #56	-> 72
    //   #48	-> 93
    //   #58	-> 104
    //   #48	-> 131
    //   #58	-> 138
    //   #48	-> 142
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   104	22	2	partialChange	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/PartialCommandOutput;
    //   0	152	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputContentUpdatesScheduler$startUpdating$1$job$1;
    //   44	98	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super TerminalOutputContentUpdatesScheduler$startUpdating$1$job$1> $completion) {
    return (Continuation<Unit>)new TerminalOutputContentUpdatesScheduler$startUpdating$1$job$1(TerminalOutputContentUpdatesScheduler.this, $completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((TerminalOutputContentUpdatesScheduler$startUpdating$1$job$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalOutputContentUpdatesScheduler$startUpdating$1$job$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */