package ai.grazie.utils.cache;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@DebugMetadata(f = "StandardSuspendableCache.kt", l = {34, 36, 36, 38}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.cache.StandardSuspendableCache$getOrPut$2")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\003\n\002\020\000\020\000\032\002H\001\"\b\b\000\020\002*\0020\003\"\b\b\001\020\001*\0020\003H@"}, d2 = {"<anonymous>", "Value", "Key", ""})
final class StandardSuspendableCache$getOrPut$2 extends SuspendLambda implements Function1<Continuation<? super Value>, Object> {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  StandardSuspendableCache$getOrPut$2(Object $key, Function1<Continuation<? super Value>, Object> $loader, Continuation $completion) {
    super(1, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #6
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 235, 0 -> 44, 1 -> 77, 2 -> 133, 3 -> 190, 4 -> 225
    //   44: aload_1
    //   45: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   48: aload_0
    //   49: getfield this$0 : Lai/grazie/utils/cache/StandardSuspendableCache;
    //   52: aload_0
    //   53: getfield $key : Ljava/lang/Object;
    //   56: aload_0
    //   57: checkcast kotlin/coroutines/Continuation
    //   60: aload_0
    //   61: iconst_1
    //   62: putfield label : I
    //   65: invokevirtual get : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   68: dup
    //   69: aload #6
    //   71: if_acmpne -> 82
    //   74: aload #6
    //   76: areturn
    //   77: aload_1
    //   78: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   81: aload_1
    //   82: astore_2
    //   83: aload_2
    //   84: ifnonnull -> 196
    //   87: aload_0
    //   88: getfield this$0 : Lai/grazie/utils/cache/StandardSuspendableCache;
    //   91: aload_0
    //   92: getfield $key : Ljava/lang/Object;
    //   95: astore #4
    //   97: astore_3
    //   98: aload_0
    //   99: getfield $loader : Lkotlin/jvm/functions/Function1;
    //   102: aload_0
    //   103: aload_0
    //   104: aload_3
    //   105: putfield L$0 : Ljava/lang/Object;
    //   108: aload_0
    //   109: aload #4
    //   111: putfield L$1 : Ljava/lang/Object;
    //   114: aload_0
    //   115: iconst_2
    //   116: putfield label : I
    //   119: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
    //   124: dup
    //   125: aload #6
    //   127: if_acmpne -> 152
    //   130: aload #6
    //   132: areturn
    //   133: aload_0
    //   134: getfield L$1 : Ljava/lang/Object;
    //   137: astore #4
    //   139: aload_0
    //   140: getfield L$0 : Ljava/lang/Object;
    //   143: checkcast ai/grazie/utils/cache/StandardSuspendableCache
    //   146: astore_3
    //   147: aload_1
    //   148: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   151: aload_1
    //   152: astore #5
    //   154: aload_3
    //   155: aload #4
    //   157: aload #5
    //   159: aload_0
    //   160: checkcast kotlin/coroutines/Continuation
    //   163: aload_0
    //   164: aconst_null
    //   165: putfield L$0 : Ljava/lang/Object;
    //   168: aload_0
    //   169: aconst_null
    //   170: putfield L$1 : Ljava/lang/Object;
    //   173: aload_0
    //   174: iconst_3
    //   175: putfield label : I
    //   178: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   181: dup
    //   182: aload #6
    //   184: if_acmpne -> 195
    //   187: aload #6
    //   189: areturn
    //   190: aload_1
    //   191: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   194: aload_1
    //   195: pop
    //   196: aload_0
    //   197: getfield this$0 : Lai/grazie/utils/cache/StandardSuspendableCache;
    //   200: aload_0
    //   201: getfield $key : Ljava/lang/Object;
    //   204: aload_0
    //   205: checkcast kotlin/coroutines/Continuation
    //   208: aload_0
    //   209: iconst_4
    //   210: putfield label : I
    //   213: invokevirtual get : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   216: dup
    //   217: aload #6
    //   219: if_acmpne -> 230
    //   222: aload #6
    //   224: areturn
    //   225: aload_1
    //   226: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   229: aload_1
    //   230: dup
    //   231: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   234: areturn
    //   235: new java/lang/IllegalStateException
    //   238: dup
    //   239: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   241: invokespecial <init> : (Ljava/lang/String;)V
    //   244: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #33	-> 3
    //   #34	-> 48
    //   #33	-> 74
    //   #35	-> 83
    //   #36	-> 87
    //   #33	-> 130
    //   #36	-> 152
    //   #33	-> 187
    //   #38	-> 195
    //   #33	-> 222
    //   #38	-> 230
    //   #33	-> 235
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   83	4	2	value	Ljava/lang/Object;
    //   0	245	0	this	Lai/grazie/utils/cache/StandardSuspendableCache$getOrPut$2;
    //   48	187	1	$result	Ljava/lang/Object;
  }
  
  public final Continuation<Unit> create(Continuation<? super StandardSuspendableCache$getOrPut$2> $completion) {
    return (Continuation<Unit>)new StandardSuspendableCache$getOrPut$2(this.$key, this.$loader, $completion);
  }
  
  public final Object invoke(Continuation<?> p1) {
    return ((StandardSuspendableCache$getOrPut$2)create(p1)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\cache\StandardSuspendableCache$getOrPut$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */