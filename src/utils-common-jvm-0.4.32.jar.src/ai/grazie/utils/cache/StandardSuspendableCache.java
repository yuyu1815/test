/*    */ package ai.grazie.utils.cache;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\006\n\002\030\002\n\002\030\002\n\002\b\006\b\000\030\000*\b\b\000\020\001*\0020\002*\b\b\001\020\003*\0020\0022\016\022\004\022\002H\001\022\004\022\002H\0030\004B\037\022\030\020\005\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\0070\006¢\006\002\020\bJ\016\020\021\032\0020\022H@¢\006\002\020\023J\030\020\024\032\004\030\0018\0012\006\020\025\032\0028\000H@¢\006\002\020\026J4\020\027\032\0028\0012\006\020\025\032\0028\0002\034\020\030\032\030\b\001\022\n\022\b\022\004\022\0028\0010\032\022\006\022\004\030\0010\0020\031H@¢\006\002\020\033J\026\020\034\032\0020\0222\006\020\025\032\0028\000H@¢\006\002\020\026J\036\020\035\032\0020\0222\006\020\025\032\0028\0002\006\020\036\032\0028\001H@¢\006\002\020\037R#\020\005\032\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\0070\006¢\006\b\n\000\032\004\b\t\020\nR6\020\013\032*\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\r0\fj\024\022\004\022\0028\000\022\n\022\b\022\004\022\0028\0010\r`\016X\004¢\006\002\n\000R\016\020\017\032\0020\020X\004¢\006\002\n\000¨\006 "}, d2 = {"Lai/grazie/utils/cache/StandardSuspendableCache;", "Key", "", "Value", "Lai/grazie/utils/cache/SuspendableCache;", "condition", "Lai/grazie/utils/cache/CacheCondition;", "Lai/grazie/utils/cache/CacheValue$WithTime;", "(Lai/grazie/utils/cache/CacheCondition;)V", "getCondition", "()Lai/grazie/utils/cache/CacheCondition;", "data", "Ljava/util/HashMap;", "Lai/grazie/utils/cache/CacheValue$WithTime$Default;", "Lkotlin/collections/HashMap;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "key", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrPut", "loader", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invalidate", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "utils-common"})
/*    */ public final class StandardSuspendableCache<Key, Value> implements SuspendableCache<Key, Value> {
/*    */   @NotNull
/*    */   private final CacheCondition<Key, CacheValue.WithTime<Value>> condition;
/*    */   
/*  8 */   public StandardSuspendableCache(@NotNull CacheCondition<Key, CacheValue.WithTime<Value>> condition) { this.condition = condition;
/*  9 */     this.mutex = MutexKt.Mutex(false);
/* 10 */     this.data = new HashMap<>(); }
/*    */   @NotNull private final Mutex mutex; @NotNull private final HashMap<Key, CacheValue.WithTime.Default<Value>> data; @NotNull
/*    */   public final CacheCondition<Key, CacheValue.WithTime<Value>> getCondition() { return this.condition; } @Nullable
/* 13 */   public Object get(@NotNull Object key, @NotNull Continuation $completion) { return MutexKt.withReentrantLock$default(this.mutex, null, new StandardSuspendableCache$get$2((Key)key, null), $completion, 1, null); } @DebugMetadata(f = "StandardSuspendableCache.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.cache.StandardSuspendableCache$get$2") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\003\n\002\020\000\020\000\032\004\030\001H\001\"\b\b\000\020\002*\0020\003\"\b\b\001\020\001*\0020\003H@"}, d2 = {"<anonymous>", "Value", "Key", ""}) static final class StandardSuspendableCache$get$2 extends SuspendLambda implements Function1<Continuation<? super Value>, Object> { int label; StandardSuspendableCache$get$2(Object $key, Continuation $completion) { super(1, $completion); } public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 14 */           (CacheValue.WithTime.Default)StandardSuspendableCache.this.data.get(this.$key); return ((CacheValue.WithTime.Default)StandardSuspendableCache.this.data.get(this.$key) != null) ? ((CacheValue.WithTime.Default)StandardSuspendableCache.this.data.get(this.$key)).getValue() : null; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Continuation<? super StandardSuspendableCache$get$2> $completion) { return (Continuation<Unit>)new StandardSuspendableCache$get$2(this.$key, $completion); }
/*    */     public final Object invoke(Continuation<?> p1) { return ((StandardSuspendableCache$get$2)create(p1)).invokeSuspend(Unit.INSTANCE); } }
/*    */   @Nullable
/* 19 */   public Object put(@NotNull Object key, @NotNull Object value, @NotNull Continuation $completion) { if (MutexKt.withReentrantLock$default(this.mutex, null, new StandardSuspendableCache$put$2((Key)key, (Value)value, null), $completion, 1, null) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return MutexKt.withReentrantLock$default(this.mutex, null, new StandardSuspendableCache$put$2((Key)key, (Value)value, null), $completion, 1, null);  MutexKt.withReentrantLock$default(this.mutex, null, new StandardSuspendableCache$put$2((Key)key, (Value)value, null), $completion, 1, null);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 24 */     return Unit.INSTANCE; }
/*    */   
/*    */   @DebugMetadata(f = "StandardSuspendableCache.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.cache.StandardSuspendableCache$put$2")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\020\000\n\000\020\000\032\0020\001\"\b\b\000\020\002*\0020\003\"\b\b\001\020\004*\0020\003H@"}, d2 = {"<anonymous>", "", "Key", "", "Value"})
/*    */   @SourceDebugExtension({"SMAP\nStandardSuspendableCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardSuspendableCache.kt\nai/grazie/utils/cache/StandardSuspendableCache$put$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,48:1\n1863#2,2:49\n*S KotlinDebug\n*F\n+ 1 StandardSuspendableCache.kt\nai/grazie/utils/cache/StandardSuspendableCache$put$2\n*L\n22#1:49,2\n*E\n"})
/*    */   static final class StandardSuspendableCache$put$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> { int label;
/*    */     
/*    */     StandardSuspendableCache$put$2(Object $key, Object $value, Continuation $completion) {
/*    */       super(1, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       Set toRemove, set1;
/*    */       StandardSuspendableCache<Key, Value> standardSuspendableCache;
/*    */       int $i$f$forEach;
/*    */       Iterator iterator;
/*    */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           StandardSuspendableCache.this.data.put(this.$key, new CacheValue.WithTime.Default(this.$value, 0L, 2, null));
/*    */           toRemove = StandardSuspendableCache.this.getCondition().toFilterOut(StandardSuspendableCache.this.data, SetsKt.emptySet());
/*    */           set1 = toRemove;
/*    */           standardSuspendableCache = StandardSuspendableCache.this;
/*    */           $i$f$forEach = 0;
/* 49 */           for (iterator = set1.iterator(); iterator.hasNext(); standardSuspendableCache.data.remove(it)) { Object element$iv = iterator.next(), it = element$iv; int $i$a$-forEach-StandardSuspendableCache$put$2$1 = 0; }
/*    */           
/*    */           return Unit.INSTANCE;
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Continuation<? super StandardSuspendableCache$put$2> $completion) {
/*    */       return (Continuation<Unit>)new StandardSuspendableCache$put$2(this.$key, this.$value, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(Continuation<?> p1) {
/*    */       return ((StandardSuspendableCache$put$2)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object invalidate(@NotNull Object key, @NotNull Continuation $completion) {
/*    */     if (MutexKt.withReentrantLock$default(this.mutex, null, new StandardSuspendableCache$invalidate$2((Key)key, null), $completion, 1, null) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*    */       return MutexKt.withReentrantLock$default(this.mutex, null, new StandardSuspendableCache$invalidate$2((Key)key, null), $completion, 1, null); 
/*    */     MutexKt.withReentrantLock$default(this.mutex, null, new StandardSuspendableCache$invalidate$2((Key)key, null), $completion, 1, null);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "StandardSuspendableCache.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.cache.StandardSuspendableCache$invalidate$2")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\002\b\002\n\002\020\000\020\000\032\n\022\004\022\002H\002\030\0010\001\"\b\b\000\020\003*\0020\004\"\b\b\001\020\002*\0020\004H@"}, d2 = {"<anonymous>", "Lai/grazie/utils/cache/CacheValue$WithTime$Default;", "Value", "Key", ""})
/*    */   static final class StandardSuspendableCache$invalidate$2 extends SuspendLambda implements Function1<Continuation<? super CacheValue.WithTime.Default<Value>>, Object> {
/*    */     int label;
/*    */     
/*    */     StandardSuspendableCache$invalidate$2(Object $key, Continuation $completion) {
/*    */       super(1, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           return StandardSuspendableCache.this.data.remove(this.$key);
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Continuation<? super StandardSuspendableCache$invalidate$2> $completion) {
/*    */       return (Continuation<Unit>)new StandardSuspendableCache$invalidate$2(this.$key, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(Continuation<?> p1) {
/*    */       return ((StandardSuspendableCache$invalidate$2)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object getOrPut(@NotNull Object key, @NotNull Function1<? super Continuation<? super Value>, ? extends Object> loader, @NotNull Continuation $completion) {
/*    */     return MutexKt.withReentrantLock$default(this.mutex, null, new StandardSuspendableCache$getOrPut$2((Key)key, loader, null), $completion, 1, null);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "StandardSuspendableCache.kt", l = {34, 36, 36, 38}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.cache.StandardSuspendableCache$getOrPut$2")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\003\n\002\020\000\020\000\032\002H\001\"\b\b\000\020\002*\0020\003\"\b\b\001\020\001*\0020\003H@"}, d2 = {"<anonymous>", "Value", "Key", ""})
/*    */   static final class StandardSuspendableCache$getOrPut$2 extends SuspendLambda implements Function1<Continuation<? super Value>, Object> {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     StandardSuspendableCache$getOrPut$2(Object $key, Function1<Continuation<? super Value>, Object> $loader, Continuation $completion) {
/*    */       super(1, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore #6
/*    */       //   5: aload_0
/*    */       //   6: getfield label : I
/*    */       //   9: tableswitch default -> 235, 0 -> 44, 1 -> 77, 2 -> 133, 3 -> 190, 4 -> 225
/*    */       //   44: aload_1
/*    */       //   45: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   48: aload_0
/*    */       //   49: getfield this$0 : Lai/grazie/utils/cache/StandardSuspendableCache;
/*    */       //   52: aload_0
/*    */       //   53: getfield $key : Ljava/lang/Object;
/*    */       //   56: aload_0
/*    */       //   57: checkcast kotlin/coroutines/Continuation
/*    */       //   60: aload_0
/*    */       //   61: iconst_1
/*    */       //   62: putfield label : I
/*    */       //   65: invokevirtual get : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   68: dup
/*    */       //   69: aload #6
/*    */       //   71: if_acmpne -> 82
/*    */       //   74: aload #6
/*    */       //   76: areturn
/*    */       //   77: aload_1
/*    */       //   78: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   81: aload_1
/*    */       //   82: astore_2
/*    */       //   83: aload_2
/*    */       //   84: ifnonnull -> 196
/*    */       //   87: aload_0
/*    */       //   88: getfield this$0 : Lai/grazie/utils/cache/StandardSuspendableCache;
/*    */       //   91: aload_0
/*    */       //   92: getfield $key : Ljava/lang/Object;
/*    */       //   95: astore #4
/*    */       //   97: astore_3
/*    */       //   98: aload_0
/*    */       //   99: getfield $loader : Lkotlin/jvm/functions/Function1;
/*    */       //   102: aload_0
/*    */       //   103: aload_0
/*    */       //   104: aload_3
/*    */       //   105: putfield L$0 : Ljava/lang/Object;
/*    */       //   108: aload_0
/*    */       //   109: aload #4
/*    */       //   111: putfield L$1 : Ljava/lang/Object;
/*    */       //   114: aload_0
/*    */       //   115: iconst_2
/*    */       //   116: putfield label : I
/*    */       //   119: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */       //   124: dup
/*    */       //   125: aload #6
/*    */       //   127: if_acmpne -> 152
/*    */       //   130: aload #6
/*    */       //   132: areturn
/*    */       //   133: aload_0
/*    */       //   134: getfield L$1 : Ljava/lang/Object;
/*    */       //   137: astore #4
/*    */       //   139: aload_0
/*    */       //   140: getfield L$0 : Ljava/lang/Object;
/*    */       //   143: checkcast ai/grazie/utils/cache/StandardSuspendableCache
/*    */       //   146: astore_3
/*    */       //   147: aload_1
/*    */       //   148: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   151: aload_1
/*    */       //   152: astore #5
/*    */       //   154: aload_3
/*    */       //   155: aload #4
/*    */       //   157: aload #5
/*    */       //   159: aload_0
/*    */       //   160: checkcast kotlin/coroutines/Continuation
/*    */       //   163: aload_0
/*    */       //   164: aconst_null
/*    */       //   165: putfield L$0 : Ljava/lang/Object;
/*    */       //   168: aload_0
/*    */       //   169: aconst_null
/*    */       //   170: putfield L$1 : Ljava/lang/Object;
/*    */       //   173: aload_0
/*    */       //   174: iconst_3
/*    */       //   175: putfield label : I
/*    */       //   178: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   181: dup
/*    */       //   182: aload #6
/*    */       //   184: if_acmpne -> 195
/*    */       //   187: aload #6
/*    */       //   189: areturn
/*    */       //   190: aload_1
/*    */       //   191: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   194: aload_1
/*    */       //   195: pop
/*    */       //   196: aload_0
/*    */       //   197: getfield this$0 : Lai/grazie/utils/cache/StandardSuspendableCache;
/*    */       //   200: aload_0
/*    */       //   201: getfield $key : Ljava/lang/Object;
/*    */       //   204: aload_0
/*    */       //   205: checkcast kotlin/coroutines/Continuation
/*    */       //   208: aload_0
/*    */       //   209: iconst_4
/*    */       //   210: putfield label : I
/*    */       //   213: invokevirtual get : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   216: dup
/*    */       //   217: aload #6
/*    */       //   219: if_acmpne -> 230
/*    */       //   222: aload #6
/*    */       //   224: areturn
/*    */       //   225: aload_1
/*    */       //   226: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   229: aload_1
/*    */       //   230: dup
/*    */       //   231: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */       //   234: areturn
/*    */       //   235: new java/lang/IllegalStateException
/*    */       //   238: dup
/*    */       //   239: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   241: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   244: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #33	-> 3
/*    */       //   #34	-> 48
/*    */       //   #33	-> 74
/*    */       //   #35	-> 83
/*    */       //   #36	-> 87
/*    */       //   #33	-> 130
/*    */       //   #36	-> 152
/*    */       //   #33	-> 187
/*    */       //   #38	-> 195
/*    */       //   #33	-> 222
/*    */       //   #38	-> 230
/*    */       //   #33	-> 235
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   83	4	2	value	Ljava/lang/Object;
/*    */       //   0	245	0	this	Lai/grazie/utils/cache/StandardSuspendableCache$getOrPut$2;
/*    */       //   48	187	1	$result	Ljava/lang/Object;
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Continuation<? super StandardSuspendableCache$getOrPut$2> $completion) {
/*    */       return (Continuation<Unit>)new StandardSuspendableCache$getOrPut$2(this.$key, this.$loader, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(Continuation<?> p1) {
/*    */       return ((StandardSuspendableCache$getOrPut$2)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object clear(@NotNull Continuation $completion) {
/*    */     if (MutexKt.withReentrantLock$default(this.mutex, null, new StandardSuspendableCache$clear$2(null), $completion, 1, null) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*    */       return MutexKt.withReentrantLock$default(this.mutex, null, new StandardSuspendableCache$clear$2(null), $completion, 1, null); 
/*    */     MutexKt.withReentrantLock$default(this.mutex, null, new StandardSuspendableCache$clear$2(null), $completion, 1, null);
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "StandardSuspendableCache.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.cache.StandardSuspendableCache$clear$2")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\020\000\n\000\020\000\032\0020\001\"\b\b\000\020\002*\0020\003\"\b\b\001\020\004*\0020\003H@"}, d2 = {"<anonymous>", "", "Key", "", "Value"})
/*    */   static final class StandardSuspendableCache$clear$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
/*    */     int label;
/*    */     
/*    */     StandardSuspendableCache$clear$2(Continuation $completion) {
/*    */       super(1, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           StandardSuspendableCache.this.data.clear();
/*    */           return Unit.INSTANCE;
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Continuation<? super StandardSuspendableCache$clear$2> $completion) {
/*    */       return (Continuation<Unit>)new StandardSuspendableCache$clear$2($completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(Continuation<?> p1) {
/*    */       return ((StandardSuspendableCache$clear$2)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\cache\StandardSuspendableCache.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */