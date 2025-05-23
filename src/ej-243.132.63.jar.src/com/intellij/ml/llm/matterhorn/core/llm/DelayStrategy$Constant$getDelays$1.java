package com.intellij.ml.llm.matterhorn.core.llm;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

@DebugMetadata(f = "DelayStrategy.kt", l = {18}, i = {0}, s = {"L$0"}, n = {"$this$sequence"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.DelayStrategy$Constant$getDelays$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\020\t\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""})
final class DelayStrategy$Constant$getDelays$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Long>, Continuation<? super Unit>, Object> {
  Object L$1;
  
  int I$0;
  
  int I$1;
  
  int label;
  
  DelayStrategy$Constant$getDelays$1(Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #7
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 167, 0 -> 32, 1 -> 120
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield L$0 : Ljava/lang/Object;
    //   40: checkcast kotlin/sequences/SequenceScope
    //   43: astore_2
    //   44: aload_0
    //   45: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/DelayStrategy$Constant;
    //   48: invokevirtual getMaxRetries : ()I
    //   51: istore_3
    //   52: aload_0
    //   53: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/DelayStrategy$Constant;
    //   56: astore #4
    //   58: iconst_0
    //   59: istore #5
    //   61: iload #5
    //   63: iload_3
    //   64: if_icmpge -> 163
    //   67: iconst_0
    //   68: istore #6
    //   70: aload_2
    //   71: aload #4
    //   73: invokevirtual getTimeMs : ()I
    //   76: i2l
    //   77: invokestatic boxLong : (J)Ljava/lang/Long;
    //   80: aload_0
    //   81: aload_0
    //   82: aload_2
    //   83: putfield L$0 : Ljava/lang/Object;
    //   86: aload_0
    //   87: aload #4
    //   89: putfield L$1 : Ljava/lang/Object;
    //   92: aload_0
    //   93: iload_3
    //   94: putfield I$0 : I
    //   97: aload_0
    //   98: iload #5
    //   100: putfield I$1 : I
    //   103: aload_0
    //   104: iconst_1
    //   105: putfield label : I
    //   108: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   111: dup
    //   112: aload #7
    //   114: if_acmpne -> 156
    //   117: aload #7
    //   119: areturn
    //   120: iconst_0
    //   121: istore #6
    //   123: aload_0
    //   124: getfield I$1 : I
    //   127: istore #5
    //   129: aload_0
    //   130: getfield I$0 : I
    //   133: istore_3
    //   134: aload_0
    //   135: getfield L$1 : Ljava/lang/Object;
    //   138: checkcast com/intellij/ml/llm/matterhorn/core/llm/DelayStrategy$Constant
    //   141: astore #4
    //   143: aload_0
    //   144: getfield L$0 : Ljava/lang/Object;
    //   147: checkcast kotlin/sequences/SequenceScope
    //   150: astore_2
    //   151: aload_1
    //   152: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   155: aload_1
    //   156: pop
    //   157: iinc #5, 1
    //   160: goto -> 61
    //   163: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   166: areturn
    //   167: new java/lang/IllegalStateException
    //   170: dup
    //   171: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   173: invokespecial <init> : (Ljava/lang/String;)V
    //   176: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #16	-> 3
    //   #17	-> 44
    //   #18	-> 70
    //   #16	-> 117
    //   #19	-> 156
    //   #17	-> 157
    //   #20	-> 163
    //   #16	-> 167
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   44	76	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   151	16	2	$this$sequence	Lkotlin/sequences/SequenceScope;
    //   70	50	6	$i$a$-repeat-DelayStrategy$Constant$getDelays$1$1	I
    //   0	177	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/DelayStrategy$Constant$getDelays$1;
    //   36	131	1	$result	Ljava/lang/Object;
    //   123	34	6	$i$a$-repeat-DelayStrategy$Constant$getDelays$1$1	I
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super DelayStrategy$Constant$getDelays$1> $completion) {
    DelayStrategy$Constant$getDelays$1 delayStrategy$Constant$getDelays$1 = new DelayStrategy$Constant$getDelays$1($completion);
    delayStrategy$Constant$getDelays$1.L$0 = value;
    return (Continuation<Unit>)delayStrategy$Constant$getDelays$1;
  }
  
  public final Object invoke(SequenceScope p1, Continuation<?> p2) {
    return ((DelayStrategy$Constant$getDelays$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\DelayStrategy$Constant$getDelays$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */