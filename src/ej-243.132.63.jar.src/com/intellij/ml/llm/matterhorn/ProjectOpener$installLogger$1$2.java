package com.intellij.ml.llm.matterhorn;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "MatterhornStarter.kt", l = {77}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ProjectOpener$installLogger$1$2")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
@SourceDebugExtension({"SMAP\nMatterhornStarter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornStarter.kt\ncom/intellij/ml/llm/matterhorn/ProjectOpener$installLogger$1$2\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,86:1\n14#2:87\n*S KotlinDebug\n*F\n+ 1 MatterhornStarter.kt\ncom/intellij/ml/llm/matterhorn/ProjectOpener$installLogger$1$2\n*L\n78#1:87\n*E\n"})
final class null extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  int label;
  
  null(Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #6
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 175, 0 -> 32, 1 -> 70
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: nop
    //   37: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
    //   40: pop
    //   41: bipush #30
    //   43: getstatic kotlin/time/DurationUnit.SECONDS : Lkotlin/time/DurationUnit;
    //   46: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
    //   49: aload_0
    //   50: checkcast kotlin/coroutines/Continuation
    //   53: aload_0
    //   54: iconst_1
    //   55: putfield label : I
    //   58: invokestatic delay-VtjQ1oo : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   61: dup
    //   62: aload #6
    //   64: if_acmpne -> 75
    //   67: aload #6
    //   69: areturn
    //   70: aload_1
    //   71: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   74: aload_1
    //   75: pop
    //   76: iconst_0
    //   77: istore_2
    //   78: ldc com/intellij/ml/llm/matterhorn/ProjectOpener
    //   80: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
    //   83: dup
    //   84: ldc 'getInstance(...)'
    //   86: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   89: new java/lang/StringBuilder
    //   92: dup
    //   93: invokespecial <init> : ()V
    //   96: astore_2
    //   97: aload_2
    //   98: astore_3
    //   99: astore #5
    //   101: iconst_0
    //   102: istore #4
    //   104: aload_3
    //   105: ldc 'Awaited configuration activities:'
    //   107: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: dup
    //   111: ldc 'append(...)'
    //   113: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   116: bipush #10
    //   118: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   121: dup
    //   122: ldc 'append(...)'
    //   124: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   127: pop
    //   128: aload_3
    //   129: getstatic com/intellij/platform/backend/observation/Observation.INSTANCE : Lcom/intellij/platform/backend/observation/Observation;
    //   132: invokevirtual dumpAwaitedActivitiesToString : ()Ljava/lang/String;
    //   135: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: dup
    //   139: ldc 'append(...)'
    //   141: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   144: bipush #10
    //   146: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   149: dup
    //   150: ldc 'append(...)'
    //   152: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   155: pop
    //   156: nop
    //   157: aload #5
    //   159: aload_2
    //   160: invokevirtual toString : ()Ljava/lang/String;
    //   163: dup
    //   164: ldc 'toString(...)'
    //   166: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   169: invokevirtual info : (Ljava/lang/String;)V
    //   172: goto -> 36
    //   175: new java/lang/IllegalStateException
    //   178: dup
    //   179: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   181: invokespecial <init> : (Ljava/lang/String;)V
    //   184: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #75	-> 3
    //   #76	-> 36
    //   #77	-> 37
    //   #77	-> 53
    //   #75	-> 67
    //   #78	-> 75
    //   #87	-> 78
    //   #78	-> 89
    //   #79	-> 104
    //   #80	-> 128
    //   #81	-> 156
    //   #78	-> 159
    //   #78	-> 169
    //   #75	-> 175
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   101	56	3	$this$invokeSuspend_u24lambda_u240	Ljava/lang/StringBuilder;
    //   78	11	2	$i$f$logger	I
    //   104	53	4	$i$a$-buildString-ProjectOpener$installLogger$1$2$1	I
    //   0	185	0	this	Lcom/intellij/ml/llm/matterhorn/ProjectOpener$installLogger$1$2;
    //   36	139	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
    return (Continuation<Unit>)new Object($completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ProjectOpener$installLogger$1$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */