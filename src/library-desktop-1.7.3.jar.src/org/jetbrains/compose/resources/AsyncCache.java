/*    */ package org.jetbrains.compose.resources;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\002\n\002\020%\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\002\b\000\030\000*\004\b\000\020\001*\004\b\001\020\0022\0020\003B\005¢\006\002\020\004J\006\020\n\032\0020\013J4\020\f\032\0028\0012\006\020\r\032\0028\0002\034\020\016\032\030\b\001\022\n\022\b\022\004\022\0028\0010\020\022\006\022\004\030\0010\0030\017H@¢\006\002\020\021R \020\005\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\0070\006X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000¨\006\022"}, d2 = {"Lorg/jetbrains/compose/resources/AsyncCache;", "K", "V", "", "()V", "cache", "", "Lkotlinx/coroutines/Deferred;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "clear", "", "getOrLoad", "key", "load", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "library"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class AsyncCache<K, V> {
/*    */   @NotNull
/* 11 */   private final Mutex mutex = MutexKt.Mutex$default(false, 1, null); @NotNull
/* 12 */   private final Map<K, Deferred<V>> cache = new LinkedHashMap<>(); public static final int $stable = 8;
/*    */   @Nullable
/* 14 */   public final Object getOrLoad(Object key, @NotNull Function1<? super Continuation<? super V>, ? extends Object> load, @NotNull Continuation $completion) { return CoroutineScopeKt.coroutineScope(new AsyncCache$getOrLoad$2((K)key, load, null), $completion); } @DebugMetadata(f = "AsyncCache.kt", l = {36, 24}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"$this$coroutineScope", "$this$withLock_u24default$iv"}, m = "invokeSuspend", c = "org.jetbrains.compose.resources.AsyncCache$getOrLoad$2") @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\003\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\002\"\004\b\001\020\001*\0020\003H@"}, d2 = {"<anonymous>", "V", "K", "Lkotlinx/coroutines/CoroutineScope;"}) @SourceDebugExtension({"SMAP\nAsyncCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncCache.kt\norg/jetbrains/compose/resources/AsyncCache$getOrLoad$2\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,31:1\n116#2,10:32\n*S KotlinDebug\n*F\n+ 1 AsyncCache.kt\norg/jetbrains/compose/resources/AsyncCache$getOrLoad$2\n*L\n15#1:32,10\n*E\n"}) static final class AsyncCache$getOrLoad$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super V>, Object>
/*    */   {
/*    */     Object L$1; Object L$2; Object L$3; Object L$4; int label; AsyncCache$getOrLoad$2(Object $key, Function1<Continuation<? super V>, Object> $load, Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore #14
/*    */       //   5: aload_0
/*    */       //   6: getfield label : I
/*    */       //   9: tableswitch default -> 356, 0 -> 36, 1 -> 138, 2 -> 350
/*    */       //   36: aload_1
/*    */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   40: aload_0
/*    */       //   41: getfield L$0 : Ljava/lang/Object;
/*    */       //   44: checkcast kotlinx/coroutines/CoroutineScope
/*    */       //   47: astore_2
/*    */       //   48: aload_0
/*    */       //   49: getfield this$0 : Lorg/jetbrains/compose/resources/AsyncCache;
/*    */       //   52: invokestatic access$getMutex$p : (Lorg/jetbrains/compose/resources/AsyncCache;)Lkotlinx/coroutines/sync/Mutex;
/*    */       //   55: astore #4
/*    */       //   57: aload_0
/*    */       //   58: getfield this$0 : Lorg/jetbrains/compose/resources/AsyncCache;
/*    */       //   61: astore #6
/*    */       //   63: aload_0
/*    */       //   64: getfield $key : Ljava/lang/Object;
/*    */       //   67: astore #7
/*    */       //   69: aload_0
/*    */       //   70: getfield $load : Lkotlin/jvm/functions/Function1;
/*    */       //   73: astore #8
/*    */       //   75: aconst_null
/*    */       //   76: astore #5
/*    */       //   78: iconst_0
/*    */       //   79: istore #9
/*    */       //   81: nop
/*    */       //   82: aload #4
/*    */       //   84: aload #5
/*    */       //   86: aload_0
/*    */       //   87: checkcast kotlin/coroutines/Continuation
/*    */       //   90: aload_0
/*    */       //   91: aload_2
/*    */       //   92: putfield L$0 : Ljava/lang/Object;
/*    */       //   95: aload_0
/*    */       //   96: aload #4
/*    */       //   98: putfield L$1 : Ljava/lang/Object;
/*    */       //   101: aload_0
/*    */       //   102: aload #6
/*    */       //   104: putfield L$2 : Ljava/lang/Object;
/*    */       //   107: aload_0
/*    */       //   108: aload #7
/*    */       //   110: putfield L$3 : Ljava/lang/Object;
/*    */       //   113: aload_0
/*    */       //   114: aload #8
/*    */       //   116: putfield L$4 : Ljava/lang/Object;
/*    */       //   119: aload_0
/*    */       //   120: iconst_1
/*    */       //   121: putfield label : I
/*    */       //   124: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   129: dup
/*    */       //   130: aload #14
/*    */       //   132: if_acmpne -> 190
/*    */       //   135: aload #14
/*    */       //   137: areturn
/*    */       //   138: iconst_0
/*    */       //   139: istore #9
/*    */       //   141: aload_0
/*    */       //   142: getfield L$4 : Ljava/lang/Object;
/*    */       //   145: checkcast kotlin/jvm/functions/Function1
/*    */       //   148: astore #8
/*    */       //   150: aload_0
/*    */       //   151: getfield L$3 : Ljava/lang/Object;
/*    */       //   154: astore #7
/*    */       //   156: aload_0
/*    */       //   157: getfield L$2 : Ljava/lang/Object;
/*    */       //   160: checkcast org/jetbrains/compose/resources/AsyncCache
/*    */       //   163: astore #6
/*    */       //   165: aconst_null
/*    */       //   166: astore #5
/*    */       //   168: aload_0
/*    */       //   169: getfield L$1 : Ljava/lang/Object;
/*    */       //   172: checkcast kotlinx/coroutines/sync/Mutex
/*    */       //   175: astore #4
/*    */       //   177: aload_0
/*    */       //   178: getfield L$0 : Ljava/lang/Object;
/*    */       //   181: checkcast kotlinx/coroutines/CoroutineScope
/*    */       //   184: astore_2
/*    */       //   185: aload_1
/*    */       //   186: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   189: aload_1
/*    */       //   190: pop
/*    */       //   191: nop
/*    */       //   192: iconst_0
/*    */       //   193: istore #10
/*    */       //   195: aload #6
/*    */       //   197: invokestatic access$getCache$p : (Lorg/jetbrains/compose/resources/AsyncCache;)Ljava/util/Map;
/*    */       //   200: aload #7
/*    */       //   202: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */       //   207: checkcast kotlinx/coroutines/Deferred
/*    */       //   210: astore #11
/*    */       //   212: aload #11
/*    */       //   214: ifnull -> 227
/*    */       //   217: aload #11
/*    */       //   219: invokeinterface isCancelled : ()Z
/*    */       //   224: ifeq -> 267
/*    */       //   227: aload_2
/*    */       //   228: aconst_null
/*    */       //   229: getstatic kotlinx/coroutines/CoroutineStart.LAZY : Lkotlinx/coroutines/CoroutineStart;
/*    */       //   232: new org/jetbrains/compose/resources/AsyncCache$getOrLoad$2$deferred$1$1
/*    */       //   235: dup
/*    */       //   236: aload #8
/*    */       //   238: aconst_null
/*    */       //   239: invokespecial <init> : (Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
/*    */       //   242: checkcast kotlin/jvm/functions/Function2
/*    */       //   245: iconst_1
/*    */       //   246: aconst_null
/*    */       //   247: invokestatic async$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
/*    */       //   250: astore #11
/*    */       //   252: aload #6
/*    */       //   254: invokestatic access$getCache$p : (Lorg/jetbrains/compose/resources/AsyncCache;)Ljava/util/Map;
/*    */       //   257: aload #7
/*    */       //   259: aload #11
/*    */       //   261: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */       //   266: pop
/*    */       //   267: aload #11
/*    */       //   269: astore #12
/*    */       //   271: aload #4
/*    */       //   273: aload #5
/*    */       //   275: invokeinterface unlock : (Ljava/lang/Object;)V
/*    */       //   280: goto -> 297
/*    */       //   283: astore #13
/*    */       //   285: aload #4
/*    */       //   287: aload #5
/*    */       //   289: invokeinterface unlock : (Ljava/lang/Object;)V
/*    */       //   294: aload #13
/*    */       //   296: athrow
/*    */       //   297: aload #12
/*    */       //   299: nop
/*    */       //   300: astore_3
/*    */       //   301: aload_3
/*    */       //   302: aload_0
/*    */       //   303: checkcast kotlin/coroutines/Continuation
/*    */       //   306: aload_0
/*    */       //   307: aconst_null
/*    */       //   308: putfield L$0 : Ljava/lang/Object;
/*    */       //   311: aload_0
/*    */       //   312: aconst_null
/*    */       //   313: putfield L$1 : Ljava/lang/Object;
/*    */       //   316: aload_0
/*    */       //   317: aconst_null
/*    */       //   318: putfield L$2 : Ljava/lang/Object;
/*    */       //   321: aload_0
/*    */       //   322: aconst_null
/*    */       //   323: putfield L$3 : Ljava/lang/Object;
/*    */       //   326: aload_0
/*    */       //   327: aconst_null
/*    */       //   328: putfield L$4 : Ljava/lang/Object;
/*    */       //   331: aload_0
/*    */       //   332: iconst_2
/*    */       //   333: putfield label : I
/*    */       //   336: invokeinterface await : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   341: dup
/*    */       //   342: aload #14
/*    */       //   344: if_acmpne -> 355
/*    */       //   347: aload #14
/*    */       //   349: areturn
/*    */       //   350: aload_1
/*    */       //   351: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   354: aload_1
/*    */       //   355: areturn
/*    */       //   356: new java/lang/IllegalStateException
/*    */       //   359: dup
/*    */       //   360: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   362: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   365: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #14	-> 3
/*    */       //   #15	-> 48
/*    */       //   #32	-> 75
/*    */       //   #33	-> 81
/*    */       //   #36	-> 82
/*    */       //   #14	-> 135
/*    */       //   #37	-> 190
/*    */       //   #38	-> 192
/*    */       //   #16	-> 195
/*    */       //   #17	-> 212
/*    */       //   #19	-> 227
/*    */       //   #20	-> 252
/*    */       //   #22	-> 267
/*    */       //   #38	-> 269
/*    */       //   #40	-> 271
/*    */       //   #41	-> 280
/*    */       //   #40	-> 283
/*    */       //   #37	-> 299
/*    */       //   #15	-> 300
/*    */       //   #24	-> 301
/*    */       //   #14	-> 347
/*    */       //   #24	-> 355
/*    */       //   #14	-> 356
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   48	90	2	$this$coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*    */       //   185	67	2	$this$coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*    */       //   301	40	3	deferred	Lkotlinx/coroutines/Deferred;
/*    */       //   75	63	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */       //   177	92	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */       //   269	11	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */       //   283	17	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*    */       //   78	60	5	owner$iv	Ljava/lang/Object;
/*    */       //   177	92	5	owner$iv	Ljava/lang/Object;
/*    */       //   269	11	5	owner$iv	Ljava/lang/Object;
/*    */       //   283	17	5	owner$iv	Ljava/lang/Object;
/*    */       //   212	15	11	cached	Lkotlinx/coroutines/Deferred;
/*    */       //   252	17	11	cached	Lkotlinx/coroutines/Deferred;
/*    */       //   195	74	10	$i$a$-withLock$default-AsyncCache$getOrLoad$2$deferred$1	I
/*    */       //   81	57	9	$i$f$withLock	I
/*    */       //   40	316	0	this	Lorg/jetbrains/compose/resources/AsyncCache$getOrLoad$2;
/*    */       //   40	316	1	$result	Ljava/lang/Object;
/*    */       //   141	159	9	$i$f$withLock	I
/*    */       // Exception table:
/*    */       //   from	to	target	type
/*    */       //   191	271	283	finally
/*    */       //   283	285	283	finally } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super AsyncCache$getOrLoad$2> $completion) { AsyncCache$getOrLoad$2 asyncCache$getOrLoad$2 = new AsyncCache$getOrLoad$2(this.$key, this.$load, $completion); asyncCache$getOrLoad$2.L$0 = value;
/*    */       return (Continuation<Unit>)asyncCache$getOrLoad$2; } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((AsyncCache$getOrLoad$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } @DebugMetadata(f = "AsyncCache.kt", l = {19}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.compose.resources.AsyncCache$getOrLoad$2$deferred$1$1") @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\003\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\002\"\004\b\001\020\001*\0020\003H@"}, d2 = {"<anonymous>", "V", "K", "Lkotlinx/coroutines/CoroutineScope;"}) static final class AsyncCache$getOrLoad$2$deferred$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super V>, Object>
/*    */     {
/* 19 */       int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (this.$load.invoke(this) == object) ? object : this.$load.invoke(this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */        AsyncCache$getOrLoad$2$deferred$1$1(Function1<Continuation<? super V>, Object> $load, Continuation $completion) {
/*    */         super(2, $completion);
/*    */       } @NotNull
/*    */       public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super AsyncCache$getOrLoad$2$deferred$1$1> $completion) {
/*    */         return (Continuation<Unit>)new AsyncCache$getOrLoad$2$deferred$1$1(this.$load, $completion);
/*    */       } @Nullable
/*    */       public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */         return ((AsyncCache$getOrLoad$2$deferred$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */       } } } public final void clear() {
/* 29 */     this.cache.clear();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\AsyncCache.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */