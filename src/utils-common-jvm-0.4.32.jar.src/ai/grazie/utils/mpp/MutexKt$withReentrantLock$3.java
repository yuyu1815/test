package ai.grazie.utils.mpp;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

@DebugMetadata(f = "Mutex.kt", l = {32, 17}, i = {0, 0, 1, 1}, s = {"L$0", "L$1", "L$0", "L$1"}, n = {"$this$withLock$iv", "owner$iv", "$this$withLock$iv", "owner$iv"}, m = "invokeSuspend", c = "ai.grazie.utils.mpp.MutexKt$withReentrantLock$3")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\002\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"})
@SourceDebugExtension({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nai/grazie/utils/mpp/MutexKt$withReentrantLock$3\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,28:1\n117#2,9:29\n*S KotlinDebug\n*F\n+ 1 Mutex.kt\nai/grazie/utils/mpp/MutexKt$withReentrantLock$3\n*L\n16#1:29,9\n*E\n"})
final class MutexKt$withReentrantLock$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  MutexKt$withReentrantLock$3(Mutex $receiver, Object $owner, Function1<Continuation<? super T>, Object> $action, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #8
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 227, 0 -> 36, 1 -> 101, 2 -> 173
    //   36: aload_1
    //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   40: aload_0
    //   41: getfield $this_withReentrantLock : Lkotlinx/coroutines/sync/Mutex;
    //   44: astore_2
    //   45: aload_0
    //   46: getfield $owner : Ljava/lang/Object;
    //   49: astore_3
    //   50: aload_0
    //   51: getfield $action : Lkotlin/jvm/functions/Function1;
    //   54: astore #4
    //   56: iconst_0
    //   57: istore #5
    //   59: nop
    //   60: aload_2
    //   61: aload_3
    //   62: aload_0
    //   63: checkcast kotlin/coroutines/Continuation
    //   66: aload_0
    //   67: aload_2
    //   68: putfield L$0 : Ljava/lang/Object;
    //   71: aload_0
    //   72: aload_3
    //   73: putfield L$1 : Ljava/lang/Object;
    //   76: aload_0
    //   77: aload #4
    //   79: putfield L$2 : Ljava/lang/Object;
    //   82: aload_0
    //   83: iconst_1
    //   84: putfield label : I
    //   87: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   92: dup
    //   93: aload #8
    //   95: if_acmpne -> 131
    //   98: aload #8
    //   100: areturn
    //   101: iconst_0
    //   102: istore #5
    //   104: aload_0
    //   105: getfield L$2 : Ljava/lang/Object;
    //   108: checkcast kotlin/jvm/functions/Function1
    //   111: astore #4
    //   113: aload_0
    //   114: getfield L$1 : Ljava/lang/Object;
    //   117: astore_3
    //   118: aload_0
    //   119: getfield L$0 : Ljava/lang/Object;
    //   122: checkcast kotlinx/coroutines/sync/Mutex
    //   125: astore_2
    //   126: aload_1
    //   127: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   130: aload_1
    //   131: pop
    //   132: nop
    //   133: iconst_0
    //   134: istore #6
    //   136: aload #4
    //   138: aload_0
    //   139: aload_0
    //   140: aload_2
    //   141: putfield L$0 : Ljava/lang/Object;
    //   144: aload_0
    //   145: aload_3
    //   146: putfield L$1 : Ljava/lang/Object;
    //   149: aload_0
    //   150: aconst_null
    //   151: putfield L$2 : Ljava/lang/Object;
    //   154: aload_0
    //   155: iconst_2
    //   156: putfield label : I
    //   159: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   164: dup
    //   165: aload #8
    //   167: if_acmpne -> 198
    //   170: aload #8
    //   172: areturn
    //   173: iconst_0
    //   174: istore #5
    //   176: iconst_0
    //   177: istore #6
    //   179: aload_0
    //   180: getfield L$1 : Ljava/lang/Object;
    //   183: astore_3
    //   184: aload_0
    //   185: getfield L$0 : Ljava/lang/Object;
    //   188: checkcast kotlinx/coroutines/sync/Mutex
    //   191: astore_2
    //   192: nop
    //   193: aload_1
    //   194: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   197: aload_1
    //   198: nop
    //   199: astore #7
    //   201: aload_2
    //   202: aload_3
    //   203: invokeinterface unlock : (Ljava/lang/Object;)V
    //   208: goto -> 223
    //   211: astore #6
    //   213: aload_2
    //   214: aload_3
    //   215: invokeinterface unlock : (Ljava/lang/Object;)V
    //   220: aload #6
    //   222: athrow
    //   223: aload #7
    //   225: nop
    //   226: areturn
    //   227: new java/lang/IllegalStateException
    //   230: dup
    //   231: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   233: invokespecial <init> : (Ljava/lang/String;)V
    //   236: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #15	-> 3
    //   #16	-> 40
    //   #29	-> 59
    //   #32	-> 60
    //   #15	-> 98
    //   #33	-> 131
    //   #34	-> 133
    //   #17	-> 136
    //   #15	-> 170
    //   #17	-> 198
    //   #34	-> 199
    //   #36	-> 201
    //   #37	-> 208
    //   #36	-> 211
    //   #33	-> 225
    //   #18	-> 226
    //   #15	-> 227
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   56	45	2	$this$withLock$iv	Lkotlinx/coroutines/sync/Mutex;
    //   126	47	2	$this$withLock$iv	Lkotlinx/coroutines/sync/Mutex;
    //   192	7	2	$this$withLock$iv	Lkotlinx/coroutines/sync/Mutex;
    //   199	9	2	$this$withLock$iv	Lkotlinx/coroutines/sync/Mutex;
    //   211	15	2	$this$withLock$iv	Lkotlinx/coroutines/sync/Mutex;
    //   56	45	3	owner$iv	Ljava/lang/Object;
    //   118	55	3	owner$iv	Ljava/lang/Object;
    //   184	15	3	owner$iv	Ljava/lang/Object;
    //   199	9	3	owner$iv	Ljava/lang/Object;
    //   211	15	3	owner$iv	Ljava/lang/Object;
    //   136	37	6	$i$a$-withLock-MutexKt$withReentrantLock$3$1	I
    //   59	42	5	$i$f$withLock	I
    //   0	237	0	this	Lai/grazie/utils/mpp/MutexKt$withReentrantLock$3;
    //   40	187	1	$result	Ljava/lang/Object;
    //   104	69	5	$i$f$withLock	I
    //   179	20	6	$i$a$-withLock-MutexKt$withReentrantLock$3$1	I
    //   176	50	5	$i$f$withLock	I
    // Exception table:
    //   from	to	target	type
    //   132	164	211	finally
    //   192	201	211	finally
    //   211	213	211	finally
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super MutexKt$withReentrantLock$3> $completion) {
    return (Continuation<Unit>)new MutexKt$withReentrantLock$3(this.$this_withReentrantLock, this.$owner, this.$action, $completion);
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((MutexKt$withReentrantLock$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\MutexKt$withReentrantLock$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */