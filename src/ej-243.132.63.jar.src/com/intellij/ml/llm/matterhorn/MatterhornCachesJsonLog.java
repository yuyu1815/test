/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\002\b\005\030\000*\004\b\000\020\0012\0020\002B%\022\006\020\003\032\0020\004\022\f\020\005\032\b\022\004\022\0028\0000\006\022\006\020\007\032\0020\b¢\006\004\b\t\020\nJ\016\020\023\032\0020\024H@¢\006\002\020\025J\026\020\026\032\0020\0242\006\020\027\032\0028\000H@¢\006\002\020\030R\027\020\005\032\b\022\004\022\0028\0000\006¢\006\b\n\000\032\004\b\013\020\fR\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\r\020\016R\016\020\017\032\0020\004X\004¢\006\002\n\000R\022\020\020\032\0060\021j\002`\022X\004¢\006\002\n\000¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/MatterhornCachesJsonLog;", "T", "", "logName", "", "serializer", "Lkotlinx/serialization/KSerializer;", "caches", "Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/KSerializer;Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;)V", "getSerializer", "()Lkotlinx/serialization/KSerializer;", "getCaches", "()Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;", "logFileName", "content", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "ensureLoaded", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "log", "entry", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core"})
/*    */ public final class MatterhornCachesJsonLog<T> { @NotNull
/*    */   private final KSerializer<T> serializer;
/*    */   @NotNull
/*    */   private final MatterhornCaches caches;
/*    */   
/*  8 */   public MatterhornCachesJsonLog(@NotNull String logName, @NotNull KSerializer<T> serializer, @NotNull MatterhornCaches caches) { this.serializer = serializer; this.caches = caches;
/*  9 */     this.logFileName = logName + ".jsonl";
/* 10 */     this.content = new StringBuilder(); }
/*    */   @NotNull private final String logFileName;
/*    */   @NotNull private final StringBuilder content; @NotNull public final KSerializer<T> getSerializer() { return this.serializer; } @NotNull
/* 13 */   public final MatterhornCaches getCaches() { return this.caches; } private final Object ensureLoaded(Continuation $completion) { if ((this.content.length() == 0)) {
/* 14 */       if (BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new MatterhornCachesJsonLog$ensureLoaded$2(null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new MatterhornCachesJsonLog$ensureLoaded$2(null), $completion);  BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new MatterhornCachesJsonLog$ensureLoaded$2(null), $completion); return Unit.INSTANCE;
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 22 */     return Unit.INSTANCE; } @DebugMetadata(f = "MatterhornCachesJsonLog.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.MatterhornCachesJsonLog$ensureLoaded$2")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   @SourceDebugExtension({"SMAP\nMatterhornCachesJsonLog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornCachesJsonLog.kt\ncom/intellij/ml/llm/matterhorn/MatterhornCachesJsonLog$ensureLoaded$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,39:1\n1#2:40\n*E\n"})
/*    */   static final class MatterhornCachesJsonLog$ensureLoaded$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; MatterhornCachesJsonLog$ensureLoaded$2(Continuation $completion) { super(2, $completion); }
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       StringBuilder stringBuilder;
/*    */       MatterhornCachesJsonLog<T> matterhornCachesJsonLog;
/*    */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           stringBuilder = MatterhornCachesJsonLog.this.content;
/*    */           matterhornCachesJsonLog = MatterhornCachesJsonLog.this;
/*    */           synchronized (stringBuilder) {
/*    */             int $i$a$-synchronized-MatterhornCachesJsonLog$ensureLoaded$2$1 = 0;
/*    */             if ((matterhornCachesJsonLog.content.length() == 0))
/*    */               if (matterhornCachesJsonLog.getCaches().load(CacheType.Logs, matterhornCachesJsonLog.logFileName) != null) {
/*    */                 String it = matterhornCachesJsonLog.getCaches().load(CacheType.Logs, matterhornCachesJsonLog.logFileName);
/* 40 */                 int $i$a$-let-MatterhornCachesJsonLog$ensureLoaded$2$1$1 = 0;
/*    */                 matterhornCachesJsonLog.content.append(it);
/*    */               } else {
/*    */                 matterhornCachesJsonLog.getCaches().load(CacheType.Logs, matterhornCachesJsonLog.logFileName);
/*    */               }  
/*    */             Unit unit = Unit.INSTANCE;
/*    */           } 
/*    */           return Unit.INSTANCE;
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super MatterhornCachesJsonLog$ensureLoaded$2> $completion) {
/*    */       return (Continuation<Unit>)new MatterhornCachesJsonLog$ensureLoaded$2($completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((MatterhornCachesJsonLog$ensureLoaded$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final Object log(Object entry, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/MatterhornCachesJsonLog$log$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/MatterhornCachesJsonLog$log$1
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
/*    */     //   39: new com/intellij/ml/llm/matterhorn/MatterhornCachesJsonLog$log$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/MatterhornCachesJsonLog;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #7
/*    */     //   50: aload #7
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #6
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #8
/*    */     //   62: aload #7
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 285, 0 -> 92, 1 -> 130, 2 -> 273
/*    */     //   92: aload #6
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_0
/*    */     //   98: aload #7
/*    */     //   100: aload #7
/*    */     //   102: aload_0
/*    */     //   103: putfield L$0 : Ljava/lang/Object;
/*    */     //   106: aload #7
/*    */     //   108: aload_1
/*    */     //   109: putfield L$1 : Ljava/lang/Object;
/*    */     //   112: aload #7
/*    */     //   114: iconst_1
/*    */     //   115: putfield label : I
/*    */     //   118: invokespecial ensureLoaded : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   121: dup
/*    */     //   122: aload #8
/*    */     //   124: if_acmpne -> 152
/*    */     //   127: aload #8
/*    */     //   129: areturn
/*    */     //   130: aload #7
/*    */     //   132: getfield L$1 : Ljava/lang/Object;
/*    */     //   135: astore_1
/*    */     //   136: aload #7
/*    */     //   138: getfield L$0 : Ljava/lang/Object;
/*    */     //   141: checkcast com/intellij/ml/llm/matterhorn/MatterhornCachesJsonLog
/*    */     //   144: astore_0
/*    */     //   145: aload #6
/*    */     //   147: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   150: aload #6
/*    */     //   152: pop
/*    */     //   153: getstatic kotlinx/serialization/json/Json.Default : Lkotlinx/serialization/json/Json$Default;
/*    */     //   156: aload_0
/*    */     //   157: getfield serializer : Lkotlinx/serialization/KSerializer;
/*    */     //   160: checkcast kotlinx/serialization/SerializationStrategy
/*    */     //   163: aload_1
/*    */     //   164: invokevirtual encodeToString : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   167: astore_3
/*    */     //   168: aload_0
/*    */     //   169: getfield content : Ljava/lang/StringBuilder;
/*    */     //   172: astore #4
/*    */     //   174: aload #4
/*    */     //   176: monitorenter
/*    */     //   177: nop
/*    */     //   178: iconst_0
/*    */     //   179: istore #5
/*    */     //   181: aload_0
/*    */     //   182: getfield content : Ljava/lang/StringBuilder;
/*    */     //   185: aload_3
/*    */     //   186: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   189: dup
/*    */     //   190: ldc 'append(...)'
/*    */     //   192: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   195: bipush #10
/*    */     //   197: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   200: dup
/*    */     //   201: ldc 'append(...)'
/*    */     //   203: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   206: nop
/*    */     //   207: astore #5
/*    */     //   209: aload #4
/*    */     //   211: monitorexit
/*    */     //   212: goto -> 223
/*    */     //   215: astore #5
/*    */     //   217: aload #4
/*    */     //   219: monitorexit
/*    */     //   220: aload #5
/*    */     //   222: athrow
/*    */     //   223: invokestatic getIO : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*    */     //   226: checkcast kotlin/coroutines/CoroutineContext
/*    */     //   229: new com/intellij/ml/llm/matterhorn/MatterhornCachesJsonLog$log$3
/*    */     //   232: dup
/*    */     //   233: aload_0
/*    */     //   234: aconst_null
/*    */     //   235: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/MatterhornCachesJsonLog;Lkotlin/coroutines/Continuation;)V
/*    */     //   238: checkcast kotlin/jvm/functions/Function2
/*    */     //   241: aload #7
/*    */     //   243: aload #7
/*    */     //   245: aconst_null
/*    */     //   246: putfield L$0 : Ljava/lang/Object;
/*    */     //   249: aload #7
/*    */     //   251: aconst_null
/*    */     //   252: putfield L$1 : Ljava/lang/Object;
/*    */     //   255: aload #7
/*    */     //   257: iconst_2
/*    */     //   258: putfield label : I
/*    */     //   261: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   264: dup
/*    */     //   265: aload #8
/*    */     //   267: if_acmpne -> 280
/*    */     //   270: aload #8
/*    */     //   272: areturn
/*    */     //   273: aload #6
/*    */     //   275: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   278: aload #6
/*    */     //   280: pop
/*    */     //   281: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   284: areturn
/*    */     //   285: new java/lang/IllegalStateException
/*    */     //   288: dup
/*    */     //   289: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   291: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   294: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #24	-> 60
/*    */     //   #25	-> 97
/*    */     //   #24	-> 127
/*    */     //   #27	-> 152
/*    */     //   #28	-> 168
/*    */     //   #29	-> 181
/*    */     //   #29	-> 206
/*    */     //   #28	-> 207
/*    */     //   #32	-> 223
/*    */     //   #24	-> 270
/*    */     //   #37	-> 280
/*    */     //   #24	-> 285
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	33	0	this	Lcom/intellij/ml/llm/matterhorn/MatterhornCachesJsonLog;
/*    */     //   145	62	0	this	Lcom/intellij/ml/llm/matterhorn/MatterhornCachesJsonLog;
/*    */     //   207	8	0	this	Lcom/intellij/ml/llm/matterhorn/MatterhornCachesJsonLog;
/*    */     //   223	41	0	this	Lcom/intellij/ml/llm/matterhorn/MatterhornCachesJsonLog;
/*    */     //   97	33	1	entry	Ljava/lang/Object;
/*    */     //   136	32	1	entry	Ljava/lang/Object;
/*    */     //   168	38	3	line	Ljava/lang/String;
/*    */     //   181	26	5	$i$a$-synchronized-MatterhornCachesJsonLog$log$2	I
/*    */     //   0	295	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	235	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	228	6	$result	Ljava/lang/Object;
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   177	209	215	finally
/*    */     //   215	217	215	finally
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "MatterhornCachesJsonLog.kt", l = {25, 32}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "entry"}, m = "log", c = "com.intellij.ml.llm.matterhorn.MatterhornCachesJsonLog")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class MatterhornCachesJsonLog$log$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     MatterhornCachesJsonLog$log$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return MatterhornCachesJsonLog.this.log(null, (Continuation<? super Unit>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "MatterhornCachesJsonLog.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.MatterhornCachesJsonLog$log$3")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class MatterhornCachesJsonLog$log$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */     int label;
/*    */     
/*    */     MatterhornCachesJsonLog$log$3(Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       StringBuilder stringBuilder;
/*    */       MatterhornCachesJsonLog<T> matterhornCachesJsonLog;
/*    */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           stringBuilder = MatterhornCachesJsonLog.this.content;
/*    */           matterhornCachesJsonLog = MatterhornCachesJsonLog.this;
/*    */           synchronized (stringBuilder) {
/*    */             int $i$a$-synchronized-MatterhornCachesJsonLog$log$3$1 = 0;
/*    */             Intrinsics.checkNotNullExpressionValue(matterhornCachesJsonLog.content.toString(), "toString(...)");
/*    */             matterhornCachesJsonLog.getCaches().save(CacheType.Logs, matterhornCachesJsonLog.logFileName, matterhornCachesJsonLog.content.toString());
/*    */             Unit unit = Unit.INSTANCE;
/*    */           } 
/*    */           return Unit.INSTANCE;
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super MatterhornCachesJsonLog$log$3> $completion) {
/*    */       return (Continuation<Unit>)new MatterhornCachesJsonLog$log$3($completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((MatterhornCachesJsonLog$log$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\MatterhornCachesJsonLog.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */