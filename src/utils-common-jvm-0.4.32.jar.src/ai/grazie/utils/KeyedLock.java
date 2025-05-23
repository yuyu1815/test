/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import kotlin.Pair;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\b\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\002\030\000*\b\b\000\020\001*\0020\0022\0020\002B\031\022\022\020\003\032\016\022\004\022\0028\000\022\004\022\0020\0050\004¢\006\002\020\006J@\020\013\032\002H\f\"\004\b\001\020\f2\006\020\r\032\0028\0002\"\020\016\032\036\b\001\022\004\022\0028\000\022\n\022\b\022\004\022\002H\f0\020\022\006\022\004\030\0010\0020\017H@¢\006\002\020\021R\032\020\003\032\016\022\004\022\0028\000\022\004\022\0020\0050\004X\004¢\006\002\n\000R&\020\007\032\032\022\004\022\0028\000\022\020\022\016\022\004\022\0020\n\022\004\022\0020\0050\t0\bX\004¢\006\002\n\000¨\006\022"}, d2 = {"Lai/grazie/utils/KeyedLock;", "KeyT", "", "lockFactory", "Lkotlin/Function1;", "Lai/grazie/utils/SimpleMutex;", "(Lkotlin/jvm/functions/Function1;)V", "locksWithUsageCounts", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/Pair;", "", "withLock", "T", "key", "body", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "utils-common"})
/*    */ public final class KeyedLock<KeyT> {
/*    */   @NotNull
/*    */   private final Function1<KeyT, SimpleMutex> lockFactory;
/*    */   @NotNull
/*    */   private final ConcurrentHashMap<KeyT, Pair<Integer, SimpleMutex>> locksWithUsageCounts;
/*    */   
/* 15 */   public KeyedLock(@NotNull Function1<KeyT, SimpleMutex> lockFactory) { this.lockFactory = lockFactory;
/*    */     
/* 17 */     this.locksWithUsageCounts = new ConcurrentHashMap<>(); }
/*    */   @Nullable public final <T> Object withLock(@NotNull Object key, @NotNull Function2 body, @NotNull Continuation $completion) { // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof ai/grazie/utils/KeyedLock$withLock$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast ai/grazie/utils/KeyedLock$withLock$1
/*    */     //   11: astore #7
/*    */     //   13: aload #7
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #7
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/utils/KeyedLock$withLock$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lai/grazie/utils/KeyedLock;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #7
/*    */     //   50: aload #7
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #6
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #8
/*    */     //   62: aload #7
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 252, 0 -> 88, 1 -> 189
/*    */     //   88: aload #6
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_0
/*    */     //   94: getfield locksWithUsageCounts : Ljava/util/concurrent/ConcurrentHashMap;
/*    */     //   97: aload_1
/*    */     //   98: new ai/grazie/utils/KeyedLock$withLock$2
/*    */     //   101: dup
/*    */     //   102: aload_0
/*    */     //   103: aload_1
/*    */     //   104: invokespecial <init> : (Lai/grazie/utils/KeyedLock;Ljava/lang/Object;)V
/*    */     //   107: checkcast kotlin/jvm/functions/Function2
/*    */     //   110: <illegal opcode> apply : (Lkotlin/jvm/functions/Function2;)Ljava/util/function/BiFunction;
/*    */     //   115: invokevirtual compute : (Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
/*    */     //   118: dup
/*    */     //   119: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   122: checkcast kotlin/Pair
/*    */     //   125: invokevirtual component2 : ()Ljava/lang/Object;
/*    */     //   128: checkcast ai/grazie/utils/SimpleMutex
/*    */     //   131: astore #4
/*    */     //   133: aload #4
/*    */     //   135: new ai/grazie/utils/KeyedLock$withLock$result$1
/*    */     //   138: dup
/*    */     //   139: aload_2
/*    */     //   140: aload_1
/*    */     //   141: aconst_null
/*    */     //   142: invokespecial <init> : (Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V
/*    */     //   145: checkcast kotlin/jvm/functions/Function1
/*    */     //   148: aload #7
/*    */     //   150: aload #7
/*    */     //   152: aload_0
/*    */     //   153: putfield L$0 : Ljava/lang/Object;
/*    */     //   156: aload #7
/*    */     //   158: aload_1
/*    */     //   159: putfield L$1 : Ljava/lang/Object;
/*    */     //   162: aload #7
/*    */     //   164: aload #4
/*    */     //   166: putfield L$2 : Ljava/lang/Object;
/*    */     //   169: aload #7
/*    */     //   171: iconst_1
/*    */     //   172: putfield label : I
/*    */     //   175: invokeinterface withLock : (Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   180: dup
/*    */     //   181: aload #8
/*    */     //   183: if_acmpne -> 221
/*    */     //   186: aload #8
/*    */     //   188: areturn
/*    */     //   189: aload #7
/*    */     //   191: getfield L$2 : Ljava/lang/Object;
/*    */     //   194: checkcast ai/grazie/utils/SimpleMutex
/*    */     //   197: astore #4
/*    */     //   199: aload #7
/*    */     //   201: getfield L$1 : Ljava/lang/Object;
/*    */     //   204: astore_1
/*    */     //   205: aload #7
/*    */     //   207: getfield L$0 : Ljava/lang/Object;
/*    */     //   210: checkcast ai/grazie/utils/KeyedLock
/*    */     //   213: astore_0
/*    */     //   214: aload #6
/*    */     //   216: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   219: aload #6
/*    */     //   221: astore #5
/*    */     //   223: aload_0
/*    */     //   224: getfield locksWithUsageCounts : Ljava/util/concurrent/ConcurrentHashMap;
/*    */     //   227: aload_1
/*    */     //   228: new ai/grazie/utils/KeyedLock$withLock$3
/*    */     //   231: dup
/*    */     //   232: aload #4
/*    */     //   234: invokespecial <init> : (Lai/grazie/utils/SimpleMutex;)V
/*    */     //   237: checkcast kotlin/jvm/functions/Function2
/*    */     //   240: <illegal opcode> apply : (Lkotlin/jvm/functions/Function2;)Ljava/util/function/BiFunction;
/*    */     //   245: invokevirtual compute : (Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;
/*    */     //   248: pop
/*    */     //   249: aload #5
/*    */     //   251: areturn
/*    */     //   252: new java/lang/IllegalStateException
/*    */     //   255: dup
/*    */     //   256: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   258: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   261: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 60
/*    */     //   #27	-> 93
/*    */     //   #23	-> 93
/*    */     //   #27	-> 118
/*    */     //   #23	-> 131
/*    */     //   #29	-> 133
/*    */     //   #22	-> 186
/*    */     //   #31	-> 223
/*    */     //   #40	-> 249
/*    */     //   #22	-> 252
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	96	0	this	Lai/grazie/utils/KeyedLock;
/*    */     //   214	38	0	this	Lai/grazie/utils/KeyedLock;
/*    */     //   93	96	1	key	Ljava/lang/Object;
/*    */     //   205	47	1	key	Ljava/lang/Object;
/*    */     //   93	87	2	body	Lkotlin/jvm/functions/Function2;
/*    */     //   133	56	4	lock	Lai/grazie/utils/SimpleMutex;
/*    */     //   199	53	4	lock	Lai/grazie/utils/SimpleMutex;
/*    */     //   223	29	5	result	Ljava/lang/Object;
/*    */     //   0	262	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	202	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	195	6	$result	Ljava/lang/Object; }
/*    */   @DebugMetadata(f = "KeyedLock.kt", l = {29}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"this", "key", "lock"}, m = "withLock", c = "ai.grazie.utils.KeyedLock") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class KeyedLock$withLock$1<T> extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1; Object L$2; int label; KeyedLock$withLock$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/* 23 */       return KeyedLock.this.withLock(null, null, (Continuation)this); } } private static final Pair withLock$lambda$0(Function2 $tmp0, Object p0, Object p1) { return (Pair)$tmp0.invoke(p0, p1); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\032\n\000\n\002\030\002\n\002\020\b\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\004\020\000\032\020\022\004\022\0020\002\022\004\022\0020\003\030\0010\001\"\004\b\000\020\004\"\b\b\001\020\005*\0020\0062\006\020\007\032\002H\0052\024\020\b\032\020\022\004\022\0020\002\022\004\022\0020\003\030\0010\001H\n¢\006\004\b\t\020\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lai/grazie/utils/SimpleMutex;", "T", "KeyT", "", "<anonymous parameter 0>", "countAndLock", "invoke", "(Ljava/lang/Object;Lkotlin/Pair;)Lkotlin/Pair;"})
/* 24 */   static final class KeyedLock$withLock$2 extends Lambda implements Function2<KeyT, Pair<? extends Integer, ? extends SimpleMutex>, Pair<? extends Integer, ? extends SimpleMutex>> { public final Pair<Integer, SimpleMutex> invoke(KeyT param1KeyT, Pair countAndLock) { Intrinsics.checkNotNullParameter(param1KeyT, "<anonymous parameter 0>"); if (countAndLock != null) { Pair it = countAndLock; int $i$a$-let-KeyedLock$withLock$2$1 = 0;
/* 25 */         if (TuplesKt.to(Integer.valueOf(((Number)it.getFirst()).intValue() + 1), it.getSecond()) == null) { TuplesKt.to(Integer.valueOf(((Number)it.getFirst()).intValue() + 1), it.getSecond());
/* 26 */           return TuplesKt.to(Integer.valueOf(1), KeyedLock.this.lockFactory.invoke(this.$key)); }  return TuplesKt.to(Integer.valueOf(((Number)it.getFirst()).intValue() + 1), it.getSecond()); }  TuplesKt.to(Integer.valueOf(((Number)it.getFirst()).intValue() + 1), it.getSecond()); return TuplesKt.to(Integer.valueOf(1), KeyedLock.this.lockFactory.invoke(this.$key)); } KeyedLock$withLock$2(Object $key) { super(2); } } @DebugMetadata(f = "KeyedLock.kt", l = {29}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.KeyedLock$withLock$result$1") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\003\n\002\020\000\020\000\032\002H\001\"\004\b\000\020\001\"\b\b\001\020\002*\0020\003H@"}, d2 = {"<anonymous>", "T", "KeyT", ""})
/*    */   static final class KeyedLock$withLock$result$1 extends SuspendLambda implements Function1<Continuation<? super T>, Object> { int label;
/*    */     KeyedLock$withLock$result$1(Function2<KeyT, Continuation<? super T>, Object> $body, Object $key, Continuation $completion) { super(1, $completion); }
/* 29 */     public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (this.$body.invoke(this.$key, this) == object) ? object : this.$body.invoke(this.$key, this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Continuation<? super KeyedLock$withLock$result$1> $completion) { return (Continuation<Unit>)new KeyedLock$withLock$result$1(this.$body, this.$key, $completion); }
/*    */     public final Object invoke(Continuation<?> p1) { return ((KeyedLock$withLock$result$1)create(p1)).invokeSuspend(Unit.INSTANCE); } }
/* 31 */   private static final Pair withLock$lambda$1(Function2 $tmp0, Object p0, Object p1) { return (Pair)$tmp0.invoke(p0, p1); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\032\n\000\n\002\030\002\n\002\020\b\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\004\020\000\032\020\022\004\022\0020\002\022\004\022\0020\003\030\0010\001\"\004\b\000\020\004\"\b\b\001\020\005*\0020\0062\006\020\007\032\002H\0052\024\020\b\032\020\022\004\022\0020\002\022\004\022\0020\003\030\0010\001H\n¢\006\004\b\t\020\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lai/grazie/utils/SimpleMutex;", "T", "KeyT", "", "<anonymous parameter 0>", "countAndLock", "invoke", "(Ljava/lang/Object;Lkotlin/Pair;)Lkotlin/Pair;"})
/* 32 */   static final class KeyedLock$withLock$3 extends Lambda implements Function2<KeyT, Pair<? extends Integer, ? extends SimpleMutex>, Pair<? extends Integer, ? extends SimpleMutex>> { public final Pair<Integer, SimpleMutex> invoke(KeyT param1KeyT, Pair countAndLock) { Intrinsics.checkNotNullParameter(param1KeyT, "<anonymous parameter 0>"); Intrinsics.checkNotNull(countAndLock); int count = ((Number)countAndLock.component1()).intValue();
/* 33 */       return (count == 1) ? 
/* 34 */         null : 
/*    */         
/* 36 */         TuplesKt.to(Integer.valueOf(count - 1), this.$lock); }
/*    */ 
/*    */     
/*    */     KeyedLock$withLock$3(SimpleMutex $lock) {
/*    */       super(2);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\KeyedLock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */