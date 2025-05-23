/*    */ package ai.grazie.utils;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.coroutines.sync.Mutex;
/*    */ import kotlinx.coroutines.sync.MutexKt;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003*\001\000\b\n\030\0002\b\022\004\022\0028\0000\001J\016\020\006\032\0028\000HB¢\006\002\020\007R\016\020\002\032\0020\003X\004¢\006\002\n\000R\026\020\004\032\n\022\004\022\0028\000\030\0010\005X\016¢\006\002\n\000¨\006\b"}, d2 = {"ai/grazie/utils/SuspendLazyKt$suspendLazy$1", "Lai/grazie/utils/SuspendLazy;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "result", "Lai/grazie/utils/Wrapper;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nSuspendLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendLazy.kt\nai/grazie/utils/SuspendLazyKt$suspendLazy$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,34:1\n116#2,10:35\n*S KotlinDebug\n*F\n+ 1 SuspendLazy.kt\nai/grazie/utils/SuspendLazyKt$suspendLazy$1\n*L\n18#1:35,10\n*E\n"})
/*    */ public final class SuspendLazyKt$suspendLazy$1 implements SuspendLazy<T> {
/* 14 */   private final Mutex mutex = MutexKt.Mutex$default(false, 1, null);
/*    */   private volatile Wrapper<T> result;
/*    */   
/*    */   SuspendLazyKt$suspendLazy$1(Function1<Continuation<? super T>, Object> $initializer) {}
/*    */   
/*    */   public Object invoke(Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof ai/grazie/utils/SuspendLazyKt$suspendLazy$1$invoke$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_1
/*    */     //   8: checkcast ai/grazie/utils/SuspendLazyKt$suspendLazy$1$invoke$1
/*    */     //   11: astore #11
/*    */     //   13: aload #11
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #11
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/utils/SuspendLazyKt$suspendLazy$1$invoke$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_1
/*    */     //   45: invokespecial <init> : (Lai/grazie/utils/SuspendLazyKt$suspendLazy$1;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #11
/*    */     //   50: aload #11
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #10
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #13
/*    */     //   62: aload #11
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 364, 0 -> 92, 1 -> 164, 2 -> 262
/*    */     //   92: aload #10
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_0
/*    */     //   98: getfield result : Lai/grazie/utils/Wrapper;
/*    */     //   101: ifnonnull -> 352
/*    */     //   104: aload_0
/*    */     //   105: getfield mutex : Lkotlinx/coroutines/sync/Mutex;
/*    */     //   108: astore_2
/*    */     //   109: aload_0
/*    */     //   110: getfield $initializer : Lkotlin/jvm/functions/Function1;
/*    */     //   113: astore #4
/*    */     //   115: aconst_null
/*    */     //   116: astore_3
/*    */     //   117: iconst_0
/*    */     //   118: istore #5
/*    */     //   120: nop
/*    */     //   121: aload_2
/*    */     //   122: aload_3
/*    */     //   123: aload #11
/*    */     //   125: aload #11
/*    */     //   127: aload_0
/*    */     //   128: putfield L$0 : Ljava/lang/Object;
/*    */     //   131: aload #11
/*    */     //   133: aload_2
/*    */     //   134: putfield L$1 : Ljava/lang/Object;
/*    */     //   137: aload #11
/*    */     //   139: aload #4
/*    */     //   141: putfield L$2 : Ljava/lang/Object;
/*    */     //   144: aload #11
/*    */     //   146: iconst_1
/*    */     //   147: putfield label : I
/*    */     //   150: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   155: dup
/*    */     //   156: aload #13
/*    */     //   158: if_acmpne -> 204
/*    */     //   161: aload #13
/*    */     //   163: areturn
/*    */     //   164: iconst_0
/*    */     //   165: istore #5
/*    */     //   167: aload #11
/*    */     //   169: getfield L$2 : Ljava/lang/Object;
/*    */     //   172: checkcast kotlin/jvm/functions/Function1
/*    */     //   175: astore #4
/*    */     //   177: aconst_null
/*    */     //   178: astore_3
/*    */     //   179: aload #11
/*    */     //   181: getfield L$1 : Ljava/lang/Object;
/*    */     //   184: checkcast kotlinx/coroutines/sync/Mutex
/*    */     //   187: astore_2
/*    */     //   188: aload #11
/*    */     //   190: getfield L$0 : Ljava/lang/Object;
/*    */     //   193: checkcast ai/grazie/utils/SuspendLazyKt$suspendLazy$1
/*    */     //   196: astore_0
/*    */     //   197: aload #10
/*    */     //   199: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   202: aload #10
/*    */     //   204: pop
/*    */     //   205: nop
/*    */     //   206: iconst_0
/*    */     //   207: istore #6
/*    */     //   209: aload_0
/*    */     //   210: getfield result : Lai/grazie/utils/Wrapper;
/*    */     //   213: ifnonnull -> 323
/*    */     //   216: aload_0
/*    */     //   217: astore #7
/*    */     //   219: aload #4
/*    */     //   221: aload #11
/*    */     //   223: aload #11
/*    */     //   225: aload_0
/*    */     //   226: putfield L$0 : Ljava/lang/Object;
/*    */     //   229: aload #11
/*    */     //   231: aload_2
/*    */     //   232: putfield L$1 : Ljava/lang/Object;
/*    */     //   235: aload #11
/*    */     //   237: aload #7
/*    */     //   239: putfield L$2 : Ljava/lang/Object;
/*    */     //   242: aload #11
/*    */     //   244: iconst_2
/*    */     //   245: putfield label : I
/*    */     //   248: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   253: dup
/*    */     //   254: aload #13
/*    */     //   256: if_acmpne -> 306
/*    */     //   259: aload #13
/*    */     //   261: areturn
/*    */     //   262: iconst_0
/*    */     //   263: istore #5
/*    */     //   265: iconst_0
/*    */     //   266: istore #6
/*    */     //   268: aload #11
/*    */     //   270: getfield L$2 : Ljava/lang/Object;
/*    */     //   273: checkcast ai/grazie/utils/SuspendLazyKt$suspendLazy$1
/*    */     //   276: astore #7
/*    */     //   278: aconst_null
/*    */     //   279: astore_3
/*    */     //   280: aload #11
/*    */     //   282: getfield L$1 : Ljava/lang/Object;
/*    */     //   285: checkcast kotlinx/coroutines/sync/Mutex
/*    */     //   288: astore_2
/*    */     //   289: aload #11
/*    */     //   291: getfield L$0 : Ljava/lang/Object;
/*    */     //   294: checkcast ai/grazie/utils/SuspendLazyKt$suspendLazy$1
/*    */     //   297: astore_0
/*    */     //   298: nop
/*    */     //   299: aload #10
/*    */     //   301: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   304: aload #10
/*    */     //   306: aload #7
/*    */     //   308: swap
/*    */     //   309: astore #12
/*    */     //   311: new ai/grazie/utils/Wrapper
/*    */     //   314: dup
/*    */     //   315: aload #12
/*    */     //   317: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   320: putfield result : Lai/grazie/utils/Wrapper;
/*    */     //   323: nop
/*    */     //   324: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   327: astore #8
/*    */     //   329: aload_2
/*    */     //   330: aload_3
/*    */     //   331: invokeinterface unlock : (Ljava/lang/Object;)V
/*    */     //   336: goto -> 351
/*    */     //   339: astore #9
/*    */     //   341: aload_2
/*    */     //   342: aload_3
/*    */     //   343: invokeinterface unlock : (Ljava/lang/Object;)V
/*    */     //   348: aload #9
/*    */     //   350: athrow
/*    */     //   351: nop
/*    */     //   352: aload_0
/*    */     //   353: getfield result : Lai/grazie/utils/Wrapper;
/*    */     //   356: dup
/*    */     //   357: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   360: invokevirtual getValue : ()Ljava/lang/Object;
/*    */     //   363: areturn
/*    */     //   364: new java/lang/IllegalStateException
/*    */     //   367: dup
/*    */     //   368: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   370: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   373: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 60
/*    */     //   #17	-> 97
/*    */     //   #18	-> 104
/*    */     //   #35	-> 115
/*    */     //   #36	-> 120
/*    */     //   #39	-> 121
/*    */     //   #16	-> 161
/*    */     //   #40	-> 204
/*    */     //   #41	-> 206
/*    */     //   #19	-> 209
/*    */     //   #20	-> 216
/*    */     //   #16	-> 259
/*    */     //   #20	-> 306
/*    */     //   #22	-> 323
/*    */     //   #41	-> 327
/*    */     //   #43	-> 329
/*    */     //   #44	-> 336
/*    */     //   #43	-> 339
/*    */     //   #40	-> 351
/*    */     //   #24	-> 352
/*    */     //   #16	-> 364
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	67	0	this	Lai/grazie/utils/SuspendLazyKt$suspendLazy$1;
/*    */     //   197	65	0	this	Lai/grazie/utils/SuspendLazyKt$suspendLazy$1;
/*    */     //   298	26	0	this	Lai/grazie/utils/SuspendLazyKt$suspendLazy$1;
/*    */     //   324	15	0	this	Lai/grazie/utils/SuspendLazyKt$suspendLazy$1;
/*    */     //   351	1	0	this	Lai/grazie/utils/SuspendLazyKt$suspendLazy$1;
/*    */     //   352	12	0	this	Lai/grazie/utils/SuspendLazyKt$suspendLazy$1;
/*    */     //   115	49	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   188	74	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   289	35	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   324	12	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   339	13	2	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   117	47	3	owner$iv	Ljava/lang/Object;
/*    */     //   188	74	3	owner$iv	Ljava/lang/Object;
/*    */     //   289	35	3	owner$iv	Ljava/lang/Object;
/*    */     //   324	12	3	owner$iv	Ljava/lang/Object;
/*    */     //   339	13	3	owner$iv	Ljava/lang/Object;
/*    */     //   209	53	6	$i$a$-withLock$default-SuspendLazyKt$suspendLazy$1$invoke$2	I
/*    */     //   120	44	5	$i$f$withLock	I
/*    */     //   0	374	1	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	314	11	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	307	10	$result	Ljava/lang/Object;
/*    */     //   167	95	5	$i$f$withLock	I
/*    */     //   268	56	6	$i$a$-withLock$default-SuspendLazyKt$suspendLazy$1$invoke$2	I
/*    */     //   265	87	5	$i$f$withLock	I
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   205	253	339	finally
/*    */     //   298	329	339	finally
/*    */     //   339	341	339	finally
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "SuspendLazy.kt", l = {39, 20}, i = {0, 0, 1, 1}, s = {"L$0", "L$1", "L$0", "L$1"}, n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, m = "invoke", c = "ai.grazie.utils.SuspendLazyKt$suspendLazy$1")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class SuspendLazyKt$suspendLazy$1$invoke$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int label;
/*    */     
/*    */     SuspendLazyKt$suspendLazy$1$invoke$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SuspendLazyKt$suspendLazy$1.this.invoke((Continuation<? super T>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\SuspendLazyKt$suspendLazy$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */