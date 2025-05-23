/*    */ package ai.grazie.utils;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlinx.coroutines.sync.Mutex;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\002\b\002\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J2\020\005\032\002H\006\"\004\b\000\020\0062\034\020\007\032\030\b\001\022\n\022\b\022\004\022\002H\0060\t\022\006\022\004\030\0010\n0\bH@¢\006\002\020\013R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lai/grazie/utils/MutexWrapper;", "Lai/grazie/utils/SimpleMutex;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "(Lkotlinx/coroutines/sync/Mutex;)V", "withLock", "T", "body", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nSimpleMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleMutex.kt\nai/grazie/utils/MutexWrapper\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,22:1\n116#2,10:23\n*S KotlinDebug\n*F\n+ 1 SimpleMutex.kt\nai/grazie/utils/MutexWrapper\n*L\n15#1:23,10\n*E\n"})
/*    */ final class MutexWrapper implements SimpleMutex {
/*    */   public MutexWrapper(@NotNull Mutex mutex) {
/* 13 */     this.mutex = mutex;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private final Mutex mutex;
/*    */   
/*    */   @Nullable
/*    */   public <T> Object withLock(@NotNull Function1 body, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof ai/grazie/utils/MutexWrapper$withLock$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast ai/grazie/utils/MutexWrapper$withLock$1
/*    */     //   11: astore #9
/*    */     //   13: aload #9
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #9
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/utils/MutexWrapper$withLock$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lai/grazie/utils/MutexWrapper;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #9
/*    */     //   50: aload #9
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #8
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #10
/*    */     //   62: aload #9
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 274, 0 -> 92, 1 -> 146, 2 -> 217
/*    */     //   92: aload #8
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_0
/*    */     //   98: getfield mutex : Lkotlinx/coroutines/sync/Mutex;
/*    */     //   101: astore_3
/*    */     //   102: aconst_null
/*    */     //   103: astore #4
/*    */     //   105: iconst_0
/*    */     //   106: istore #5
/*    */     //   108: nop
/*    */     //   109: aload_3
/*    */     //   110: aload #4
/*    */     //   112: aload #9
/*    */     //   114: aload #9
/*    */     //   116: aload_1
/*    */     //   117: putfield L$0 : Ljava/lang/Object;
/*    */     //   120: aload #9
/*    */     //   122: aload_3
/*    */     //   123: putfield L$1 : Ljava/lang/Object;
/*    */     //   126: aload #9
/*    */     //   128: iconst_1
/*    */     //   129: putfield label : I
/*    */     //   132: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   137: dup
/*    */     //   138: aload #10
/*    */     //   140: if_acmpne -> 177
/*    */     //   143: aload #10
/*    */     //   145: areturn
/*    */     //   146: iconst_0
/*    */     //   147: istore #5
/*    */     //   149: aconst_null
/*    */     //   150: astore #4
/*    */     //   152: aload #9
/*    */     //   154: getfield L$1 : Ljava/lang/Object;
/*    */     //   157: checkcast kotlinx/coroutines/sync/Mutex
/*    */     //   160: astore_3
/*    */     //   161: aload #9
/*    */     //   163: getfield L$0 : Ljava/lang/Object;
/*    */     //   166: checkcast kotlin/jvm/functions/Function1
/*    */     //   169: astore_1
/*    */     //   170: aload #8
/*    */     //   172: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   175: aload #8
/*    */     //   177: pop
/*    */     //   178: nop
/*    */     //   179: iconst_0
/*    */     //   180: istore #6
/*    */     //   182: aload_1
/*    */     //   183: aload #9
/*    */     //   185: aload #9
/*    */     //   187: aload_3
/*    */     //   188: putfield L$0 : Ljava/lang/Object;
/*    */     //   191: aload #9
/*    */     //   193: aconst_null
/*    */     //   194: putfield L$1 : Ljava/lang/Object;
/*    */     //   197: aload #9
/*    */     //   199: iconst_2
/*    */     //   200: putfield label : I
/*    */     //   203: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   208: dup
/*    */     //   209: aload #10
/*    */     //   211: if_acmpne -> 243
/*    */     //   214: aload #10
/*    */     //   216: areturn
/*    */     //   217: iconst_0
/*    */     //   218: istore #5
/*    */     //   220: iconst_0
/*    */     //   221: istore #6
/*    */     //   223: aconst_null
/*    */     //   224: astore #4
/*    */     //   226: aload #9
/*    */     //   228: getfield L$0 : Ljava/lang/Object;
/*    */     //   231: checkcast kotlinx/coroutines/sync/Mutex
/*    */     //   234: astore_3
/*    */     //   235: nop
/*    */     //   236: aload #8
/*    */     //   238: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   241: aload #8
/*    */     //   243: nop
/*    */     //   244: astore #7
/*    */     //   246: aload_3
/*    */     //   247: aload #4
/*    */     //   249: invokeinterface unlock : (Ljava/lang/Object;)V
/*    */     //   254: goto -> 270
/*    */     //   257: astore #6
/*    */     //   259: aload_3
/*    */     //   260: aload #4
/*    */     //   262: invokeinterface unlock : (Ljava/lang/Object;)V
/*    */     //   267: aload #6
/*    */     //   269: athrow
/*    */     //   270: aload #7
/*    */     //   272: nop
/*    */     //   273: areturn
/*    */     //   274: new java/lang/IllegalStateException
/*    */     //   277: dup
/*    */     //   278: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   280: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   283: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #14	-> 60
/*    */     //   #15	-> 97
/*    */     //   #23	-> 102
/*    */     //   #24	-> 108
/*    */     //   #27	-> 109
/*    */     //   #14	-> 143
/*    */     //   #28	-> 177
/*    */     //   #29	-> 179
/*    */     //   #15	-> 182
/*    */     //   #14	-> 214
/*    */     //   #15	-> 243
/*    */     //   #29	-> 244
/*    */     //   #31	-> 246
/*    */     //   #32	-> 254
/*    */     //   #31	-> 257
/*    */     //   #28	-> 272
/*    */     //   #15	-> 273
/*    */     //   #14	-> 274
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	5	0	this	Lai/grazie/utils/MutexWrapper;
/*    */     //   97	49	1	body	Lkotlin/jvm/functions/Function1;
/*    */     //   170	38	1	body	Lkotlin/jvm/functions/Function1;
/*    */     //   102	44	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   161	56	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   235	9	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   244	10	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   257	16	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */     //   105	41	4	owner$iv	Ljava/lang/Object;
/*    */     //   161	56	4	owner$iv	Ljava/lang/Object;
/*    */     //   244	10	4	owner$iv	Ljava/lang/Object;
/*    */     //   257	16	4	owner$iv	Ljava/lang/Object;
/*    */     //   182	35	6	$i$a$-withLock$default-MutexWrapper$withLock$2	I
/*    */     //   108	38	5	$i$f$withLock	I
/*    */     //   0	284	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	224	9	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	217	8	$result	Ljava/lang/Object;
/*    */     //   149	68	5	$i$f$withLock	I
/*    */     //   223	21	6	$i$a$-withLock$default-MutexWrapper$withLock$2	I
/*    */     //   220	53	5	$i$f$withLock	I
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   178	208	257	finally
/*    */     //   235	246	257	finally
/*    */     //   257	259	257	finally
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "SimpleMutex.kt", l = {27, 15}, i = {0, 0, 1}, s = {"L$0", "L$1", "L$0"}, n = {"body", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, m = "withLock", c = "ai.grazie.utils.MutexWrapper")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class MutexWrapper$withLock$1<T> extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     MutexWrapper$withLock$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return MutexWrapper.this.withLock(null, (Continuation)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\MutexWrapper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */