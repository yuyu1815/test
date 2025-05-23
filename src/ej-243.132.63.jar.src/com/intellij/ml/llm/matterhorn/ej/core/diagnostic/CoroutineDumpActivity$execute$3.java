package com.intellij.ml.llm.matterhorn.ej.core.diagnostic;

import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "CoroutineDumpActivity.kt", l = {83, 84}, i = {0, 1}, s = {"L$0", "L$0"}, n = {"$this$launch", "$this$launch"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.diagnostic.CoroutineDumpActivity$execute$3")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
final class CoroutineDumpActivity$execute$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  int label;
  
  CoroutineDumpActivity$execute$3(File $dumpDir, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 158, 0 -> 36, 1 -> 87, 2 -> 137
    //   36: aload_1
    //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   40: aload_0
    //   41: getfield L$0 : Ljava/lang/Object;
    //   44: checkcast kotlinx/coroutines/CoroutineScope
    //   47: astore_2
    //   48: aload_2
    //   49: invokestatic isActive : (Lkotlinx/coroutines/CoroutineScope;)Z
    //   52: ifeq -> 154
    //   55: aload_0
    //   56: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/diagnostic/CoroutineDumpActivity;
    //   59: aload_0
    //   60: getfield $dumpDir : Ljava/io/File;
    //   63: aload_0
    //   64: checkcast kotlin/coroutines/Continuation
    //   67: aload_0
    //   68: aload_2
    //   69: putfield L$0 : Ljava/lang/Object;
    //   72: aload_0
    //   73: iconst_1
    //   74: putfield label : I
    //   77: invokestatic access$createDump : (Lcom/intellij/ml/llm/matterhorn/ej/core/diagnostic/CoroutineDumpActivity;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   80: dup
    //   81: aload_3
    //   82: if_acmpne -> 100
    //   85: aload_3
    //   86: areturn
    //   87: aload_0
    //   88: getfield L$0 : Ljava/lang/Object;
    //   91: checkcast kotlinx/coroutines/CoroutineScope
    //   94: astore_2
    //   95: aload_1
    //   96: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   99: aload_1
    //   100: pop
    //   101: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
    //   104: pop
    //   105: bipush #10
    //   107: getstatic kotlin/time/DurationUnit.MINUTES : Lkotlin/time/DurationUnit;
    //   110: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
    //   113: aload_0
    //   114: checkcast kotlin/coroutines/Continuation
    //   117: aload_0
    //   118: aload_2
    //   119: putfield L$0 : Ljava/lang/Object;
    //   122: aload_0
    //   123: iconst_2
    //   124: putfield label : I
    //   127: invokestatic delay-VtjQ1oo : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   130: dup
    //   131: aload_3
    //   132: if_acmpne -> 150
    //   135: aload_3
    //   136: areturn
    //   137: aload_0
    //   138: getfield L$0 : Ljava/lang/Object;
    //   141: checkcast kotlinx/coroutines/CoroutineScope
    //   144: astore_2
    //   145: aload_1
    //   146: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   149: aload_1
    //   150: pop
    //   151: goto -> 48
    //   154: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   157: areturn
    //   158: new java/lang/IllegalStateException
    //   161: dup
    //   162: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   164: invokespecial <init> : (Ljava/lang/String;)V
    //   167: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #81	-> 3
    //   #82	-> 48
    //   #83	-> 55
    //   #81	-> 85
    //   #84	-> 100
    //   #84	-> 117
    //   #81	-> 135
    //   #84	-> 150
    //   #86	-> 154
    //   #81	-> 158
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   48	39	2	$this$launch	Lkotlinx/coroutines/CoroutineScope;
    //   95	42	2	$this$launch	Lkotlinx/coroutines/CoroutineScope;
    //   145	13	2	$this$launch	Lkotlinx/coroutines/CoroutineScope;
    //   0	168	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/diagnostic/CoroutineDumpActivity$execute$3;
    //   40	118	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super CoroutineDumpActivity$execute$3> $completion) {
    CoroutineDumpActivity$execute$3 coroutineDumpActivity$execute$3 = new CoroutineDumpActivity$execute$3(this.$dumpDir, $completion);
    coroutineDumpActivity$execute$3.L$0 = value;
    return (Continuation<Unit>)coroutineDumpActivity$execute$3;
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((CoroutineDumpActivity$execute$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\diagnostic\CoroutineDumpActivity$execute$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */